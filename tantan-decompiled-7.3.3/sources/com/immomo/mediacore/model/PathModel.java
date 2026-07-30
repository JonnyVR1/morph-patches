package com.immomo.mediacore.model;

import com.google.gson.Gson;

/* JADX INFO: loaded from: classes7.dex */
public class PathModel {
    public boolean owner;
    public String streamName;

    public PathModel(String str, boolean z) {
        this.streamName = str;
        this.owner = z;
    }

    public String toJson() {
        return new Gson().toJson(this, PathModel.class);
    }
}
