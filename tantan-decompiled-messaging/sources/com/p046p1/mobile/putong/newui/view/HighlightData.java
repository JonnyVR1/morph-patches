package com.p046p1.mobile.putong.newui.view;

import java.io.Serializable;
import p149l.d30;
import p149l.v0c0;

/* JADX INFO: loaded from: classes11.dex */
public class HighlightData implements Serializable {
    private d30 clickListener;
    private int endIndex;
    private int highColor;
    private boolean isBold;
    private boolean isMatchAll;
    private String key;
    private int startIndex;

    public HighlightData(String str, d30 d30Var) {
        this.isBold = false;
        this.highColor = v0c0.f179101h;
        this.isMatchAll = false;
        this.startIndex = -1;
        this.endIndex = -1;
        this.key = str;
        this.clickListener = d30Var;
    }

    public HighlightData copy(HighlightData highlightData) {
        HighlightData highlightData2 = new HighlightData();
        highlightData2.key = highlightData.key;
        highlightData2.startIndex = highlightData.startIndex;
        highlightData2.endIndex = highlightData.endIndex;
        highlightData2.isBold = highlightData.isBold;
        highlightData2.highColor = highlightData.highColor;
        highlightData2.isMatchAll = highlightData.isMatchAll;
        highlightData2.clickListener = highlightData.clickListener;
        return highlightData2;
    }

    public d30 getClickListener() {
        return this.clickListener;
    }

    public int getEndIndex() {
        return this.endIndex;
    }

    public int getHighColor() {
        return this.highColor;
    }

    public String getKey() {
        return this.key;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public boolean isBold() {
        return this.isBold;
    }

    public boolean isMatchAll() {
        return this.isMatchAll;
    }

    public void setBold(boolean z) {
        this.isBold = z;
    }

    public void setClickListener(d30 d30Var) {
        this.clickListener = d30Var;
    }

    public void setEndIndex(int i) {
        this.endIndex = i;
    }

    public void setHighColor(int i) {
        this.highColor = i;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMatchAll(boolean z) {
        this.isMatchAll = z;
    }

    public void setStartIndex(int i) {
        this.startIndex = i;
    }

    public HighlightData() {
        this.isBold = false;
        this.highColor = v0c0.f179101h;
        this.isMatchAll = false;
        this.startIndex = -1;
        this.endIndex = -1;
    }

    public HighlightData(String str, boolean z, boolean z2, d30 d30Var) {
        this.highColor = v0c0.f179101h;
        this.startIndex = -1;
        this.endIndex = -1;
        this.key = str;
        this.isBold = z;
        this.isMatchAll = z2;
        this.clickListener = d30Var;
    }

    public HighlightData(String str, boolean z, int i, boolean z2, d30 d30Var) {
        this.startIndex = -1;
        this.endIndex = -1;
        this.key = str;
        this.isBold = z;
        this.highColor = i;
        this.isMatchAll = z2;
        this.clickListener = d30Var;
    }
}
