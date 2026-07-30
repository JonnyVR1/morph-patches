package com.momo.mcamera.filtermanager;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MMFilterConfig {
    String displayName;

    @SerializedName("postprocessingUnits")
    List<MMProcessUnit> filterExt;
    String name;

    public String getDisplayName() {
        return this.displayName;
    }

    public List<MMProcessUnit> getFilterExt() {
        return this.filterExt;
    }

    public String getName() {
        return this.name;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setFilterExt(List<MMProcessUnit> list) {
        this.filterExt = list;
    }

    public void setName(String str) {
        this.name = str;
    }
}
