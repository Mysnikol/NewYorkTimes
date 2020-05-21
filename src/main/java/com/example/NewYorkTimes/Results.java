package com.example.NewYorkTimes;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import java.util.ArrayList;
import java.util.List;

//@JsonIdentityReference "abstract"
public class Results {
    public String section = "us";
    public String subsection = "";
    public String title = "Coronavirus Live Updates: Lockdown Delays Led to at Least 36;000 More Deaths; Models Find";
    public String _abstract = "All 50 states have begun to reopen to some degree; but rules vary. Scientists say they see progress on the path to developing a vaccine by next year.";
    public String url = "https://www.nytimes.com/2020/05/20/us/coronavirus-cases-deaths.html";
    public String uri = "nyt://article/c7520486-71c5-5478-9d81-308a2cf32eca";
    public String byline = "";
    public String item_type = "Article";
    public String updated_date = "2020-05-20T23:03:54-04:00";
    public String created_date = "2020-05-20T05:32:10-04:00";
    public String published_date = "2020-05-20T05:32:10-04:00";
    public String material_type_facet = "";
    public String kicker = "";

    public String[] des_facet = {"Coronavirus (2019-nCoV)"};

    public List<Multimedia> multimedia;

    public String short_url = "https://nyti.ms/3bPM6cw";

    public Results(){
        multimedia = new ArrayList<>();

        Multimedia multimediaOne = new Multimedia();

        multimedia.add(multimediaOne);
    }

    public String getSection() {
        return section;
    }

    public String getSubsection() {
        return subsection;
    }

    public String getTitle() {
        return title;
    }

    public String get_abstract() {
        return _abstract;
    }

    public String getUrl() {
        return url;
    }

    public String getUri() {
        return uri;
    }

    public String getByline() {
        return byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public String[] getDes_facet() {
        return des_facet;
    }

    public List<Multimedia> getMultimedia() {
        return multimedia;
    }

    private class Multimedia {
        public String url = "https://static01.nyt.com/images/2020/05/20/world/20virus-us-briefing-conn-sub/20virus-us-briefing-conn-sub-superJumbo.jpg";
        public String format = "superJumbo";
        public int height = 1363;
        public int width = 2048;
        public String type = "image";
        public String subtype = "photo";
        public String caption = "Waitstaff at a restaurant offering outdoor dining in West Hartford; Conn.; on Wednesday.";
        public String copyright = "Jessica Hill for The New York Times";

        public String getUrl() {
            return url;
        }

        public String getFormat() {
            return format;
        }

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }

        public String getType() {
            return type;
        }

        public String getSubtype() {
            return subtype;
        }

        public String getCaption() {
            return caption;
        }

        public String getCopyright() {
            return copyright;
        }
    }
}
