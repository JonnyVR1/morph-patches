package com.momo.mcamera.ThirdPartEffect.Pott.config;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MVSegmentCfg {

    @SerializedName("folder")
    String folder;

    @SerializedName("templates")
    List<Template> templateList;

    @SerializedName("type")
    String type;

    public String getFolder() {
        return this.folder;
    }

    public List<Template> getTemplateList() {
        return this.templateList;
    }

    public String getType() {
        return this.type;
    }

    public void setFolder(String str) {
        this.folder = str;
    }

    public void setTemplateList(List<Template> list) {
        this.templateList = list;
    }

    public void setType(String str) {
        this.type = str;
    }
}
