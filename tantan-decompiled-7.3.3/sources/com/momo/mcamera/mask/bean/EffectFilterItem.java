package com.momo.mcamera.mask.bean;

import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes8.dex */
public class EffectFilterItem {
    private long duration;
    private String folder;
    private String imageFolderPath;
    private int modelType;
    private String name;
    private FilterOptions options;

    public long getDuration() {
        return this.duration;
    }

    public String getFolder() {
        return this.folder;
    }

    public String getImageFolderPath() {
        return this.imageFolderPath;
    }

    public int getModelType() {
        return this.modelType;
    }

    public String getName() {
        return this.name;
    }

    public FilterOptions getOptions() {
        return this.options;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setFolder(String str) {
        this.folder = str;
    }

    public void setImageFolderPath(String str) {
        this.imageFolderPath = str;
    }

    public void setModelType(int i) {
        this.modelType = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOptions(FilterOptions filterOptions) {
        this.options = filterOptions;
    }
}
