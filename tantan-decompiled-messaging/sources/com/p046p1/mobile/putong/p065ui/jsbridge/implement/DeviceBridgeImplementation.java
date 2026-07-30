package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import android.os.Build;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.H5OutData;
import com.p046p1.mobile.putong.data.JSBridgeVersion;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import org.json.JSONObject;
import p149l.boq;
import p149l.coq;
import p149l.dyd;
import p149l.ef2;
import p149l.f400;
import p149l.gd20;
import p149l.k0f0;
import p149l.liq;
import p149l.pyd;
import p149l.qib0;
import p149l.sh50;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceBridgeImplementation extends ef2 {
    /* JADX INFO: renamed from: c */
    public final String m79718c(@NonNull coq coqVar) {
        return gd20.m125535b(coqVar.mo102961c());
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m79719d(@NonNull f400 f400Var, JSONObject jSONObject) {
        return m79720e(f400Var, f400Var.mo102959a().getWidth(), f400Var.mo102959a().getHeight());
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m79720e(@NonNull coq coqVar, int i, int i2) {
        JSONObject jSONObject;
        String str = Build.VERSION.RELEASE;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        String strM114058d = dyd.m114058d();
        String strValueOf = String.valueOf(xdl0.m208406v0(coqVar.mo102961c()));
        String strValueOf2 = String.valueOf(xdl0.m208414z0(coqVar.mo102961c()));
        String strValueOf3 = String.valueOf(xdl0.m208410x0(coqVar.mo102961c()));
        String strValueOf4 = String.valueOf(i);
        String strValueOf5 = String.valueOf(i2);
        String str4 = qib0.f154730s;
        String strM114055a = dyd.m114055a();
        String strM184159d = sh50.m184159d();
        String strLanguage = Network.language();
        String str5 = WebViewX.f17203d;
        String token = coqVar.getToken();
        String strM144035g = k0f0.m144032f().m144035g();
        try {
            jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("osVersion", str);
            jSONObject.put("brand", str2);
            jSONObject.put("model", str3);
            jSONObject.put(Device.IMEI, strM114058d);
            jSONObject.put("pixelRatio", strValueOf);
            jSONObject.put("screenWidth", strValueOf2);
            jSONObject.put("screenHeight", strValueOf3);
            jSONObject.put("windowWidth", strValueOf4);
            jSONObject.put("windowHeight", strValueOf5);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str4);
            jSONObject.put("sdkVersion", JSBridgeVersion.JSBRIDGE_API_VERSION);
            jSONObject.put(Constants.DEVICE_ID_TAG, strM114055a);
            jSONObject.put("oneId", strM184159d);
            jSONObject.put("smId", strM144035g);
            jSONObject.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, strLanguage);
            jSONObject.put("browserVersion", str5);
            jSONObject.put("token", token);
            jSONObject.put("mcc", qib0.f154717f0);
            jSONObject.put("device_level", pyd.INSTANCE.m172109a());
            if (NullChecker.m81303a(null)) {
                throw null;
            }
            jSONObject.put("clientId", "100032");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
            return "";
        }
        return jSONObject.toString();
    }

    @liq(key = "getNetworkInfo")
    public String getNetworkInfo(@NonNull boq boqVar) {
        return m79718c(boqVar);
    }

    @liq(key = "getSystemInfo")
    public synchronized String getSystemInfo(@NonNull boq boqVar) {
        return m79720e(boqVar, boqVar.mo102959a().getWidthX(), boqVar.mo102959a().getHeightX());
    }

    @liq(key = "saveBean")
    public String saveBean(@NonNull boq boqVar) {
        H5OutData h5OutData = new H5OutData();
        h5OutData.deviceId = dyd.m114055a();
        h5OutData.token = boqVar.getToken();
        h5OutData.schemeVersion = JSBridgeVersion.JSBRIDGE_API_VERSION;
        h5OutData.versionCode = qib0.f154730s;
        h5OutData.platform = "adr";
        h5OutData.language = Network.language();
        h5OutData.userId = qib0.f154714c0.userId();
        h5OutData.browserVersion = WebViewX.f17203d;
        h5OutData.oneId = sh50.m184159d();
        return h5OutData.toJson();
    }
}
