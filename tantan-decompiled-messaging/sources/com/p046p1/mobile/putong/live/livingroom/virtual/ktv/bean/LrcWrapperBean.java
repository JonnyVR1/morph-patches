package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class LrcWrapperBean {
    private List<LrcBean> lrcBeans;
    private String type;

    public @interface LrcWrapperType {
        public static final String LrcWrapperType_Default = "Default";
        public static final String LrcWrapperType_Migu = "Migu";
        public static final String LrcWrapperType_Momo = "momo";
    }

    public LrcWrapperBean(@LrcWrapperType String str) {
        this.type = str;
    }

    public List<LrcBean> getLrcBeans() {
        return this.lrcBeans;
    }

    public String getType() {
        return this.type;
    }

    public void setLrcBeans(List<LrcBean> list) {
        this.lrcBeans = list;
    }

    public void setType(String str) {
        this.type = str;
    }
}
