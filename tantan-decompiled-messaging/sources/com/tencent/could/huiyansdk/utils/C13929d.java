package com.tencent.could.huiyansdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.cosmos.photon.push.util.NetUtil;
import com.tencent.cloud.overseas.C13800R;
import com.tencent.connect.common.Constants;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.HostEntity;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import p149l.osk0;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.d */
/* JADX INFO: loaded from: classes2.dex */
public class C13929d {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, HostEntity> f57505a = new a();

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.d$a */
    public static class a extends HashMap<String, HostEntity> {
        public a() {
            put("00", new HostEntity.Builder().mainHost("liveness-hk.faceid.qq.com").secondHost("liveness-hk.faceid.qq.com").backupIp("").build());
            put("01", new HostEntity.Builder().mainHost("liveness-sg.faceid.qq.com").secondHost("ekyc-sg.faceid.qcloud.com").backupIp("").build());
            put("02", new HostEntity.Builder().mainHost("liveness-id.faceid.qq.com").secondHost("liveness-id.faceid.qq.com").backupIp("").build());
            put("03", new HostEntity.Builder().mainHost("liveness-tha.faceid.qq.com").secondHost("liveness-tha.faceid.qq.com").backupIp("").build());
            put("04", new HostEntity.Builder().mainHost("liveness-bom.faceid.qq.com").secondHost("liveness-bom.faceid.qq.com").backupIp("").build());
            put("05", new HostEntity.Builder().mainHost("liveness-sel.faceid.qq.com").secondHost("liveness-sel.faceid.qq.com").backupIp("").build());
            put("06", new HostEntity.Builder().mainHost("liveness-tyo.faceid.qq.com").secondHost("liveness-tyo.faceid.qq.com").backupIp("").build());
            put("07", new HostEntity.Builder().mainHost("liveness-fra.faceid.qq.com").secondHost("liveness-fra.faceid.qq.com").backupIp("").build());
            put("08", new HostEntity.Builder().mainHost("liveness-mow.faceid.qq.com").secondHost("liveness-mow.faceid.qq.com").backupIp("").build());
            put("09", new HostEntity.Builder().mainHost("liveness-asb.faceid.qq.com").secondHost("liveness-asb.faceid.qq.com").backupIp("").build());
            put(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, new HostEntity.Builder().mainHost("liveness-sv.faceid.qq.com").secondHost("liveness-sv.faceid.qq.com").backupIp("").build());
            put(Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, new HostEntity.Builder().mainHost("liveness-yyz.faceid.qq.com").secondHost("liveness-yyz.faceid.qq.com").backupIp("").build());
            put(Constants.VIA_REPORT_TYPE_SET_AVATAR, new HostEntity.Builder().mainHost("liveness-br.faceid.qq.com").secondHost("liveness-br.faceid.qq.com").backupIp("").build());
            put(Constants.VIA_REPORT_TYPE_JOININ_GROUP, new HostEntity.Builder().mainHost("liveness-mys.faceid.qq.com").secondHost("liveness-mys.faceid.qq.com").backupIp("").build());
        }
    }

    /* JADX INFO: renamed from: a */
    public static AnimationDrawable m82398a(Resources resources) {
        if (resources == null) {
            return null;
        }
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_00, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_01, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_02, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_03, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_04, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_05, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_06, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_07, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_08, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_09, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_10, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_11, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_12, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_13, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_14, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_15, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_16, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_17, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_18, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_19, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_20, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_21, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_22, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_23, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_24, null), 120);
        animationDrawable.addFrame(osk0.m165787b(resources, C13800R.drawable.txy_huiyan_loading_result_25, null), 120);
        return animationDrawable;
    }

    /* JADX INFO: renamed from: b */
    public static String m82402b(String str) {
        if (TextUtils.isEmpty(str)) {
            C13905e.a.f57445a.m82337a(2, "HYOConstUtils", "file path is empty!");
            return "";
        }
        File file = new File(str);
        if (!file.exists()) {
            C13905e.a.f57445a.m82337a(2, "HYOConstUtils", "file is not exists!");
            return "";
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = bufferedInputStream.read(bArr, 0, 1024);
                        if (-1 == i) {
                            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            byteArrayOutputStream.close();
                            bufferedInputStream.close();
                            return strEncodeToString;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        try {
                            throw th;
                        } catch (Throwable th) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th5) {
                            th3.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        } catch (IOException e) {
            C13905e.a.f57445a.m82337a(2, "HYOConstUtils", "create video base64 error: " + e.getLocalizedMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m82401a(String str) {
        String currentToken = HuiYanOsApiImp.getInstance().getCurrentToken();
        if (TextUtils.isEmpty(currentToken)) {
            return str;
        }
        return str + "?token=" + currentToken;
    }

    /* JADX INFO: renamed from: a */
    public static String m82400a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo.State state;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || !C13931f.m82403a(context, new String[]{"android.permission.READ_PHONE_STATE"}) || !C13931f.m82403a(context, new String[]{"android.permission.ACCESS_NETWORK_STATE"})) {
            return "";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTING || state == NetworkInfo.State.CONNECTED)) {
            return "WI-FI";
        }
        try {
            int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
            if (networkType == 20) {
                return NetUtil.NETWORK_CLASS_5G;
            }
            switch (networkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                    return "4G";
                default:
                    return "Mobile";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m82399a(int i) {
        Context contextM82230a = C13880j.a.f57352a.m82230a();
        if (contextM82230a == null) {
            contextM82230a = HuiYanBaseApi.C13881a.f57357a.m82240a();
        }
        return contextM82230a.getResources().getString(i);
    }
}
