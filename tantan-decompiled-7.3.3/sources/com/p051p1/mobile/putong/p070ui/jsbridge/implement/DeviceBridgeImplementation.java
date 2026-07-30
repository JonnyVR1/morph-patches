package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import android.os.Build;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.H5OutData;
import com.p051p1.mobile.putong.data.JSBridgeVersion;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import org.json.JSONObject;
import p153l.aqq;
import p153l.bnl0;
import p153l.bqq;
import p153l.c0e;
import p153l.lf2;
import p153l.lkq;
import p153l.ql20;
import p153l.qzd;
import p153l.r8f0;
import p153l.uqb0;
import p153l.xc00;
import p153l.yp50;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceBridgeImplementation extends lf2 {
    /* JADX INFO: renamed from: c */
    public final String m80901c(@NonNull bqq bqqVar) {
        return ql20.m176980b(bqqVar.mo99543c());
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m80902d(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        return m80903e(xc00Var, xc00Var.mo99541a().getWidth(), xc00Var.mo99541a().getHeight());
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m80903e(@NonNull bqq bqqVar, int i, int i2) {
        JSONObject jSONObject;
        String str = Build.VERSION.RELEASE;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        String strM178771d = qzd.m178771d();
        String strValueOf = String.valueOf(bnl0.m105586v0(bqqVar.mo99543c()));
        String strValueOf2 = String.valueOf(bnl0.m105594z0(bqqVar.mo99543c()));
        String strValueOf3 = String.valueOf(bnl0.m105590x0(bqqVar.mo99543c()));
        String strValueOf4 = String.valueOf(i);
        String strValueOf5 = String.valueOf(i2);
        String str4 = uqb0.f180413s;
        String strM178768a = qzd.m178768a();
        String strM217001d = yp50.m217001d();
        String strLanguage = Network.language();
        String str5 = WebViewX.f17922d;
        String token = bqqVar.getToken();
        String strM180190g = r8f0.m180187f().m180190g();
        try {
            jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("osVersion", str);
            jSONObject.put("brand", str2);
            jSONObject.put("model", str3);
            jSONObject.put(Device.IMEI, strM178771d);
            jSONObject.put("pixelRatio", strValueOf);
            jSONObject.put("screenWidth", strValueOf2);
            jSONObject.put("screenHeight", strValueOf3);
            jSONObject.put("windowWidth", strValueOf4);
            jSONObject.put("windowHeight", strValueOf5);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str4);
            jSONObject.put("sdkVersion", JSBridgeVersion.JSBRIDGE_API_VERSION);
            jSONObject.put(Constants.DEVICE_ID_TAG, strM178768a);
            jSONObject.put("oneId", strM217001d);
            jSONObject.put("smId", strM180190g);
            jSONObject.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, strLanguage);
            jSONObject.put("browserVersion", str5);
            jSONObject.put("token", token);
            jSONObject.put("mcc", uqb0.f180400f0);
            jSONObject.put("device_level", c0e.INSTANCE.m107408a());
            if (NullChecker.m82486a(null)) {
                throw null;
            }
            jSONObject.put("clientId", "100032");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
            return "";
        }
        return jSONObject.toString();
    }

    @lkq(key = "getNetworkInfo")
    public String getNetworkInfo(@NonNull aqq aqqVar) {
        return m80901c(aqqVar);
    }

    @lkq(key = "getSystemInfo")
    public synchronized String getSystemInfo(@NonNull aqq aqqVar) {
        return m80903e(aqqVar, aqqVar.mo99541a().getWidthX(), aqqVar.mo99541a().getHeightX());
    }

    @lkq(key = "saveBean")
    public String saveBean(@NonNull aqq aqqVar) {
        H5OutData h5OutData = new H5OutData();
        h5OutData.deviceId = qzd.m178768a();
        h5OutData.token = aqqVar.getToken();
        h5OutData.schemeVersion = JSBridgeVersion.JSBRIDGE_API_VERSION;
        h5OutData.versionCode = uqb0.f180413s;
        h5OutData.platform = "adr";
        h5OutData.language = Network.language();
        h5OutData.userId = uqb0.f180397c0.userId();
        h5OutData.browserVersion = WebViewX.f17922d;
        h5OutData.oneId = yp50.m217001d();
        return h5OutData.toJson();
    }
}
