package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import androidx.annotation.NonNull;
import p153l.alq;
import p153l.aqq;
import p153l.lf2;
import p153l.lkq;

/* JADX INFO: loaded from: classes10.dex */
public class StorageBridgeImplementation extends lf2 {
    @lkq(key = "clearStorage")
    public void clearStorage(@NonNull aqq aqqVar, String str, String str2) {
        if (alq.m98715a(aqqVar.mo99543c())) {
            aqqVar.mo99544d().mo97003a(str);
        } else {
            aqqVar.mo99544d().mo97003a(str2);
        }
    }

    @lkq(key = "getStorage")
    public String getStorage(@NonNull aqq aqqVar, String str) {
        return alq.m98717c(aqqVar.mo99543c(), str, "");
    }

    @lkq(key = "removeStorage")
    public String removeStorage(@NonNull aqq aqqVar, String str, String str2, String str3) {
        if (alq.m98716b(aqqVar.mo99543c(), str) && alq.m98719e(aqqVar.mo99543c(), str)) {
            aqqVar.mo99544d().mo97003a(str2);
            return "";
        }
        aqqVar.mo99544d().mo97003a(str3);
        return "1";
    }

    @lkq(key = "setStorage")
    public void setStorage(@NonNull aqq aqqVar, String str, String str2, String str3, String str4) {
        if (alq.m98718d(aqqVar.mo99543c(), str, str2)) {
            aqqVar.mo99544d().mo97003a(str3);
        } else {
            aqqVar.mo99544d().mo97003a(str4);
        }
    }
}
