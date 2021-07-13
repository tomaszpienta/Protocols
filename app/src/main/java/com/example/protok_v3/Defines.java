package com.example.protok_v3;

public class Defines {

    private int id =0;
    private String Date = "Brak";
    private int pd_number;
    private String field = "Brak";
    private String sr_num_dm9225= "Brak";
    private String comments_dm9225= "Brak";
    private String sr_num_switch= "Brak";
    private String comments_switch= "Brak";
    private String sr_num_p0ge= "Brak";
    private String comments_p0ge= "Brak";
    private String sr_num_p1ge= "Brak";
    private String comments_p1ge= "Brak";
    private String sr_num_p2ge= "Brak";
    private String comments_p2ge= "Brak";
    private String sr_num_p3ge= "Brak";
    private String comments_p3ge= "Brak";
    private String ups= "Brak";
    private String battery_pack= "Brak";
    private String rout_switch_media= "Brak";
    private String foreign_device= "Brak";
    private String comments_others= "Brak";


    private Boolean switch1 = false;
    private Boolean switch2= false;
    private Boolean switch3= false;
    private Boolean switch4= false;
    private Boolean switch5= false;

    private String cleaning_filters= "Brak";
    private String replacement_filter= "Brak";
    private String study_ups= "Brak";
    private String cleaning_cabinet= "Brak";
    private String efficiency_of_the_cabinet= "Brak";


    public Defines(String date, int pd_number, String field, String sr_num_dm9225,
                   String comments_dm9225, String sr_num_switch, String comments_switch, String sr_num_p0ge,
                   String comments_p0ge, String sr_num_p1ge, String comments_p1ge, String sr_num_p2ge,
                   String comments_p2ge, String sr_num_p3ge, String comments_p3ge, String ups, String battery_pack,
                   String rout_switch_media, String foreign_device, String comments_others, Boolean switch1, Boolean switch2,
                   Boolean switch3, Boolean switch4, Boolean switch5, String cleaning_filters, String replacement_filter, String study_ups,
                   String cleaning_cabinet, String efficiency_of_the_cabinet)
    {
        this.id = id;
        this.Date = date;
        this.pd_number = pd_number;
        this.field = field;
        this.sr_num_dm9225 = sr_num_dm9225;
        this.comments_dm9225 = comments_dm9225;
        this.sr_num_switch = sr_num_switch;
        this.comments_switch = comments_switch;
        this.sr_num_p0ge = sr_num_p0ge;
        this.comments_p0ge = comments_p0ge;
        this.sr_num_p1ge = sr_num_p1ge;
        this.comments_p1ge = comments_p1ge;
        this.sr_num_p2ge = sr_num_p2ge;
        this.comments_p2ge = comments_p2ge;
        this.sr_num_p3ge = sr_num_p3ge;
        this.comments_p3ge = comments_p3ge;
        this.ups = ups;
        this.battery_pack = battery_pack;
        this.rout_switch_media = rout_switch_media;
        this.foreign_device = foreign_device;
        this.comments_others = comments_others;
        this.switch1 = switch1;
        this.switch2 = switch2;
        this.switch3 = switch3;
        this.switch4 = switch4;
        this.switch5 = switch5;
        this.cleaning_filters = cleaning_filters;
        this.replacement_filter = replacement_filter;
        this.study_ups = study_ups;
        this.cleaning_cabinet = cleaning_cabinet;
        this.efficiency_of_the_cabinet = efficiency_of_the_cabinet;
    }

    @Override
    public String toString() {
        return "Defines{" +
                "id=" + id +
                ", Date=" + Date +
                ", pd_number=" + pd_number +
                ", field='" + field + '\'' +
                ", sr_num_dm9225='" + sr_num_dm9225 + '\'' +
                ", comments_dm9225='" + comments_dm9225 + '\'' +
                ", sr_num_switch='" + sr_num_switch + '\'' +
                ", comments_switch='" + comments_switch + '\'' +
                ", sr_num_p0ge='" + sr_num_p0ge + '\'' +
                ", comments_p0ge='" + comments_p0ge + '\'' +
                ", sr_num_p1ge='" + sr_num_p1ge + '\'' +
                ", comments_p1ge='" + comments_p1ge + '\'' +
                ", sr_num_p2ge='" + sr_num_p2ge + '\'' +
                ", comments_p2ge='" + comments_p2ge + '\'' +
                ", sr_num_p3ge='" + sr_num_p3ge + '\'' +
                ", comments_p3ge='" + comments_p3ge + '\'' +
                ", ups='" + ups + '\'' +
                ", battery_pack='" + battery_pack + '\'' +
                ", rout_switch_media='" + rout_switch_media + '\'' +
                ", foreign_device='" + foreign_device + '\'' +
                ", comments_others='" + comments_others + '\'' +
                ", switch1=" + switch1 +
                ", switch2=" + switch2 +
                ", switch3=" + switch3 +
                ", switch4=" + switch4 +
                ", switch5=" + switch5 +
                ", cleaning_filters='" + cleaning_filters + '\'' +
                ", replacement_filter='" + replacement_filter + '\'' +
                ", study_ups='" + study_ups + '\'' +
                ", cleaning_cabinet='" + cleaning_cabinet + '\'' +
                ", efficiency_of_the_cabinet='" + efficiency_of_the_cabinet + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getPd_number() {
        return pd_number;
    }

    public void setPd_number(int pd_number) {
        this.pd_number = pd_number;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSr_num_dm9225() {
        return sr_num_dm9225;
    }

    public void setSr_num_dm9225(String sr_num_dm9225) {
        this.sr_num_dm9225 = sr_num_dm9225;
    }

    public String getComments_dm9225() {
        return comments_dm9225;
    }

    public void setComments_dm9225(String comments_dm9225) {
        this.comments_dm9225 = comments_dm9225;
    }

    public String getSr_num_switch() {
        return sr_num_switch;
    }

    public void setSr_num_switch(String sr_num_switch) {
        this.sr_num_switch = sr_num_switch;
    }

    public String getComments_switch() {
        return comments_switch;
    }

    public void setComments_switch(String comments_switch) {
        this.comments_switch = comments_switch;
    }

    public String getSr_num_p0ge() {
        return sr_num_p0ge;
    }

    public void setSr_num_p0ge(String sr_num_p0ge) {
        this.sr_num_p0ge = sr_num_p0ge;
    }

    public String getComments_p0ge() {
        return comments_p0ge;
    }

    public void setComments_p0ge(String comments_p0ge) {
        this.comments_p0ge = comments_p0ge;
    }

    public String getSr_num_p1ge() {
        return sr_num_p1ge;
    }

    public void setSr_num_p1ge(String sr_num_p1ge) {
        this.sr_num_p1ge = sr_num_p1ge;
    }

    public String getComments_p1ge() {
        return comments_p1ge;
    }

    public void setComments_p1ge(String comments_p1ge) {
        this.comments_p1ge = comments_p1ge;
    }

    public String getSr_num_p2ge() {
        return sr_num_p2ge;
    }

    public void setSr_num_p2ge(String sr_num_p2ge) {
        this.sr_num_p2ge = sr_num_p2ge;
    }

    public String getComments_p2ge() {
        return comments_p2ge;
    }

    public void setComments_p2ge(String comments_p2ge) {
        this.comments_p2ge = comments_p2ge;
    }

    public String getSr_num_p3ge() {
        return sr_num_p3ge;
    }

    public void setSr_num_p3ge(String sr_num_p3ge) {
        this.sr_num_p3ge = sr_num_p3ge;
    }

    public String getComments_p3ge() {
        return comments_p3ge;
    }

    public void setComments_p3ge(String comments_p3ge) {
        this.comments_p3ge = comments_p3ge;
    }

    public String getUps() {
        return ups;
    }

    public void setUps(String ups) {
        this.ups = ups;
    }

    public String getBattery_pack() {
        return battery_pack;
    }

    public void setBattery_pack(String battery_pack) {
        this.battery_pack = battery_pack;
    }

    public String getRout_switch_media() {
        return rout_switch_media;
    }

    public void setRout_switch_media(String rout_switch_media) {
        this.rout_switch_media = rout_switch_media;
    }

    public String getForeign_device() {
        return foreign_device;
    }

    public void setForeign_device(String foreign_device) {
        this.foreign_device = foreign_device;
    }

    public String getComments_others() {
        return comments_others;
    }

    public void setComments_others(String comments_others) {
        this.comments_others = comments_others;
    }

    public Boolean getSwitch1() {
        return switch1;
    }

    public void setSwitch1(Boolean switch1) {
        this.switch1 = switch1;
    }

    public Boolean getSwitch2() {
        return switch2;
    }

    public void setSwitch2(Boolean switch2) {
        this.switch2 = switch2;
    }

    public Boolean getSwitch3() {
        return switch3;
    }

    public void setSwitch3(Boolean switch3) {
        this.switch3 = switch3;
    }

    public Boolean getSwitch4() {
        return switch4;
    }

    public void setSwitch4(Boolean switch4) {
        this.switch4 = switch4;
    }

    public Boolean getSwitch5() {
        return switch5;
    }

    public void setSwitch5(Boolean switch5) {
        this.switch5 = switch5;
    }

    public String getCleaning_filters() {
        return cleaning_filters;
    }

    public void setCleaning_filters(String cleaning_filters) {
        this.cleaning_filters = cleaning_filters;
    }

    public String getReplacement_filter() {
        return replacement_filter;
    }

    public void setReplacement_filter(String replacement_filter) {
        this.replacement_filter = replacement_filter;
    }

    public String getStudy_ups() {
        return study_ups;
    }

    public void setStudy_ups(String study_ups) {
        this.study_ups = study_ups;
    }

    public String getCleaning_cabinet() {
        return cleaning_cabinet;
    }

    public void setCleaning_cabinet(String cleaning_cabinet) {
        this.cleaning_cabinet = cleaning_cabinet;
    }

    public String getEfficiency_of_the_cabinet() {
        return efficiency_of_the_cabinet;
    }

    public void setEfficiency_of_the_cabinet(String efficiency_of_the_cabinet) {
        this.efficiency_of_the_cabinet = efficiency_of_the_cabinet;
    }
}
