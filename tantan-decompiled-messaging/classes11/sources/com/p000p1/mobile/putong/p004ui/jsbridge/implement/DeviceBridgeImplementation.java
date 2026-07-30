package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import android.os.Build;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.app.web.WebViewX;
import com.p1.mobile.putong.data.H5OutData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.gd20;
import l.k0f0;
import l.qib0;
import l.sh50;
import l.xdl0;
import org.json.JSONObject;
import p009l.boq;
import p009l.coq;
import p009l.dyd;
import p009l.ef2;
import p009l.f400;
import p009l.liq;
import p009l.pyd;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DeviceBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public final String m10040c(@NonNull coq coqVar) {
        return gd20.b(coqVar.mo12184c());
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m10041d(@NonNull f400 f400Var, JSONObject jSONObject) {
        return m10042e(f400Var, f400Var.mo12182a().getWidth(), f400Var.mo12182a().getHeight());
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m10042e(@NonNull coq coqVar, int i, int i2) {
        JSONObject jSONObject;
        String str = Build.VERSION.RELEASE;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        String strM13510d = dyd.m13510d();
        String strValueOf = String.valueOf(xdl0.v0(coqVar.mo12184c()));
        String strValueOf2 = String.valueOf(xdl0.z0(coqVar.mo12184c()));
        String strValueOf3 = String.valueOf(xdl0.x0(coqVar.mo12184c()));
        String strValueOf4 = String.valueOf(i);
        String strValueOf5 = String.valueOf(i2);
        String str4 = qib0.s;
        String strM13507a = dyd.m13507a();
        String strD = sh50.d();
        String strLanguage = Network.language();
        String str5 = WebViewX.d;
        String token = coqVar.getToken();
        String strG = k0f0.f().g();
        try {
            jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("osVersion", str);
            jSONObject.put("brand", str2);
            jSONObject.put("model", str3);
            jSONObject.put("imei", strM13510d);
            jSONObject.put("pixelRatio", strValueOf);
            jSONObject.put("screenWidth", strValueOf2);
            jSONObject.put("screenHeight", strValueOf3);
            jSONObject.put("windowWidth", strValueOf4);
            jSONObject.put("windowHeight", strValueOf5);
            jSONObject.put("appVersion", str4);
            jSONObject.put("sdkVersion", "1.0.0");
            jSONObject.put("deviceId", strM13507a);
            jSONObject.put("oneId", strD);
            jSONObject.put("smId", strG);
            jSONObject.put("language", strLanguage);
            jSONObject.put("browserVersion", str5);
            jSONObject.put("token", token);
            jSONObject.put("mcc", qib0.f0);
            jSONObject.put("device_level", pyd.INSTANCE.m20770a());
            if (NullChecker.a((Object) null)) {
                throw null;
            }
            jSONObject.put("clientId", "100032");
        } catch (Exception e) {
            CrashHelper.c(e);
            e.printStackTrace();
            return "";
        }
        return jSONObject.toString();
    }

    @liq(key = "getNetworkInfo")
    public String getNetworkInfo(@NonNull boq boqVar) {
        return m10040c(boqVar);
    }

    @liq(key = "getSystemInfo")
    public synchronized String getSystemInfo(@NonNull boq boqVar) {
        return m10042e(boqVar, boqVar.mo12182a().getWidthX(), boqVar.mo12182a().getHeightX());
    }

    @liq(key = "saveBean")
    public String saveBean(@NonNull boq boqVar) {
        H5OutData h5OutData = new H5OutData();
        h5OutData.deviceId = dyd.m13507a();
        h5OutData.token = boqVar.getToken();
        h5OutData.schemeVersion = "1.0.0";
        h5OutData.versionCode = qib0.s;
        h5OutData.platform = "adr";
        h5OutData.language = Network.language();
        h5OutData.userId = qib0.c0.userId();
        h5OutData.browserVersion = WebViewX.d;
        h5OutData.oneId = sh50.d();
        return h5OutData.toJson();
    }
}
