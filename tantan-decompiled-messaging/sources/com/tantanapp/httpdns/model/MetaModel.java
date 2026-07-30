package com.tantanapp.httpdns.model;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class MetaModel implements Serializable {
    public String msg;
    public int retcode;

    @NonNull
    public String toString() {
        return "MetaModel:msg:" + this.msg + " retcode:" + this.retcode;
    }
}
