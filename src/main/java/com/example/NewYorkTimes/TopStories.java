package com.example.NewYorkTimes;

import java.util.ArrayList;
import java.util.List;

public class TopStories {

    public String status = "OK";
    public String copyright = "Copyright (c) 2020 The New York Times Company. All Rights Reserved.";
    public String section = "home";
    public String last_updated = "2020-05-20T12:17:47-04:00";
    public int num_results = 57;
    public List<Results> results = new ArrayList<>();

    public TopStories(){
        Results resultOne = new Results();
        results.add(resultOne);

    }

    public TopStories(String status, String copyright, String section, String last_updated, int num_results, List<Results> results) {
        this.status = status;
        this.copyright = copyright;
        this.section = section;
        this.last_updated = last_updated;
        this.num_results = num_results;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getSection() {
        return section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public int getNum_results() {
        return num_results;
    }

    public List<Results> getResults() {
        return results;
    }
}
