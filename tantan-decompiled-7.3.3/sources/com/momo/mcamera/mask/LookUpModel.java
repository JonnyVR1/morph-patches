package com.momo.mcamera.mask;

import com.momo.mcamera.filtermanager.MMPresetFilter;

/* JADX INFO: loaded from: classes8.dex */
public class LookUpModel {
    private String folder;
    private String lookupPath;
    private MMPresetFilter presetFilter;
    private int triggerType = 0;
    private int hiddenTriggerType = 0;

    public String getFolder() {
        return this.folder;
    }

    public int getHiddenTriggerType() {
        return this.hiddenTriggerType;
    }

    public String getLookupPath() {
        return this.lookupPath;
    }

    public MMPresetFilter getPresetFilter() {
        return this.presetFilter;
    }

    public int getTriggerType() {
        return this.triggerType;
    }

    public void setFolder(String str) {
        this.folder = str;
    }

    public void setHiddenTriggerType(int i) {
        this.hiddenTriggerType = i;
    }

    public void setLookupPath(String str) {
        this.lookupPath = str;
    }

    public void setPresetFilter(MMPresetFilter mMPresetFilter) {
        this.presetFilter = mMPresetFilter;
    }

    public void setTriggerType(int i) {
        this.triggerType = i;
    }
}
