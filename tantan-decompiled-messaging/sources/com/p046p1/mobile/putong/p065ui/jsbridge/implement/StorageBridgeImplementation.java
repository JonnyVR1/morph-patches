package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import androidx.annotation.NonNull;
import p149l.bjq;
import p149l.boq;
import p149l.ef2;
import p149l.liq;

/* JADX INFO: loaded from: classes11.dex */
public class StorageBridgeImplementation extends ef2 {
    @liq(key = "clearStorage")
    public void clearStorage(@NonNull boq boqVar, String str, String str2) {
        if (bjq.m102187a(boqVar.mo102961c())) {
            boqVar.mo102962d().mo127284a(str);
        } else {
            boqVar.mo102962d().mo127284a(str2);
        }
    }

    @liq(key = "getStorage")
    public String getStorage(@NonNull boq boqVar, String str) {
        return bjq.m102189c(boqVar.mo102961c(), str, "");
    }

    @liq(key = "removeStorage")
    public String removeStorage(@NonNull boq boqVar, String str, String str2, String str3) {
        if (bjq.m102188b(boqVar.mo102961c(), str) && bjq.m102191e(boqVar.mo102961c(), str)) {
            boqVar.mo102962d().mo127284a(str2);
            return "";
        }
        boqVar.mo102962d().mo127284a(str3);
        return "1";
    }

    @liq(key = "setStorage")
    public void setStorage(@NonNull boq boqVar, String str, String str2, String str3, String str4) {
        if (bjq.m102190d(boqVar.mo102961c(), str, str2)) {
            boqVar.mo102962d().mo127284a(str3);
        } else {
            boqVar.mo102962d().mo127284a(str4);
        }
    }
}
