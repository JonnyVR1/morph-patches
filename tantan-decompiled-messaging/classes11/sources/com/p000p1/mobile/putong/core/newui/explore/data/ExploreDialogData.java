package com.p000p1.mobile.putong.core.newui.explore.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Keep
public class ExploreDialogData {
    public ExploreUploadPic exploreUploadPic;
    public String pop_up_icon;
    public String pop_up_sub_title;
    public String pop_up_title;
    public String skip;

    @Keep
    public static class ExploreUploadPic {
        public String new_pop_up_box_title;
        public String new_pop_up_sub_title;
        public String new_pop_up_title;
        public String new_pop_up_warning;
        public String type;
    }

    public ExploreDialogData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.pop_up_icon = str;
        this.pop_up_title = str2;
        this.pop_up_sub_title = str3;
        this.skip = str4;
        ExploreUploadPic exploreUploadPic = new ExploreUploadPic();
        this.exploreUploadPic = exploreUploadPic;
        exploreUploadPic.new_pop_up_title = str5;
        exploreUploadPic.new_pop_up_sub_title = str6;
        exploreUploadPic.new_pop_up_box_title = str7;
        exploreUploadPic.new_pop_up_warning = str8;
        exploreUploadPic.type = str9;
    }
}
