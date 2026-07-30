package com.tantanapp.httpdns.model;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class IpModel implements Serializable {
    public String domain;

    /* JADX INFO: renamed from: ip */
    public String f56959ip;
    public int ttl;
    public boolean valide = true;

    @NonNull
    public String toString() {
        return "地址:" + this.f56959ip + " 探测有效:" + this.valide + "过期时间:" + this.ttl;
    }
}
