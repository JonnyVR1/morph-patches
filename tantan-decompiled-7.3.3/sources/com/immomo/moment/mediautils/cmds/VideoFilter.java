package com.immomo.moment.mediautils.cmds;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class VideoFilter implements Serializable {
    private long end;
    private String filterType;
    private String resource;
    private long start;

    public VideoFilter(String str, long j, long j2, String str2) {
        this.filterType = str;
        this.start = j;
        this.end = j2;
        this.resource = str2;
    }

    public long getEnd() {
        return this.end;
    }

    public String getFilterType() {
        return this.filterType;
    }

    public String getResource() {
        return this.resource;
    }

    public long getStart() {
        return this.start;
    }

    public void setEnd(long j) {
        this.end = j;
    }

    public void setFilterType(String str) {
        this.filterType = str;
    }

    public void setResource(String str) {
        this.resource = str;
    }

    public void setStart(long j) {
        this.start = j;
    }

    public VideoFilter() {
    }
}
