package org.launchcode.techjobsmvc.controllers;

import org.launchcode.techjobsmvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

import static org.launchcode.techjobsmvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.
    @PostMapping(value = "/search/results")
    public String displaySearchResults(Model model, @RequestParam String searchType, @RequestParam String searchTerm) {
        // pass ListController.columnChoices as existing search handler does
        model.addAttribute("columns", columnChoices);
        // store results in a jobs ArrayList
        ArrayList<Job> jobs = new ArrayList<>();
        if (searchTerm.equals("all") || searchTerm == null) {
            // if user enters all or search box blank, call findAll() method from JobData
            return JobData.findAll();
        } else {
            // otherwise send search information to findByColumnAndValue
        }
    }

}

