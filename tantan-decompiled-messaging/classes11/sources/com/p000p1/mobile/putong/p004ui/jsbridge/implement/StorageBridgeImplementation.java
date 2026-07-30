package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import androidx.annotation.NonNull;
import p009l.bjq;
import p009l.boq;
import p009l.ef2;
import p009l.liq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class StorageBridgeImplementation extends ef2 {
    @liq(key = "clearStorage")
    public void clearStorage(@NonNull boq boqVar, String str, String str2) {
        if (bjq.m12051a(boqVar.mo12184c())) {
            boqVar.mo12185d().mo15129a(str);
        } else {
            boqVar.mo12185d().mo15129a(str2);
        }
    }

    @liq(key = "getStorage")
    public String getStorage(@NonNull boq boqVar, String str) {
        return bjq.m12053c(boqVar.mo12184c(), str, "");
    }

    @liq(key = "removeStorage")
    public String removeStorage(@NonNull boq boqVar, String str, String str2, String str3) {
        if (bjq.m12052b(boqVar.mo12184c(), str) && bjq.m12055e(boqVar.mo12184c(), str)) {
            boqVar.mo12185d().mo15129a(str2);
            return "";
        }
        boqVar.mo12185d().mo15129a(str3);
        return "1";
    }

    @liq(key = "setStorage")
    public void setStorage(@NonNull boq boqVar, String str, String str2, String str3, String str4) {
        if (bjq.m12054d(boqVar.mo12184c(), str, str2)) {
            boqVar.mo12185d().mo15129a(str3);
        } else {
            boqVar.mo12185d().mo15129a(str4);
        }
    }
}
