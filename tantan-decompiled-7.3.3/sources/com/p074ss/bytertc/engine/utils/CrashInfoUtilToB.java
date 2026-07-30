package com.p074ss.bytertc.engine.utils;

import android.content.Context;
import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.base.utils.RtcContextUtils;
import java.util.Iterator;
import org.json.JSONObject;
import p153l.d610;

/* JADX INFO: loaded from: classes11.dex */
public class CrashInfoUtilToB {
    private static final String TAG = "CrashInfoUtilToB";
    private static final Context context = RtcContextUtils.getApplicationContext();
    private static d610 sdk = null;
    private static final String token = "d7271e1eac254529abcffc63e36b02c3";

    @CalledByNative
    public static void addTagsReport(String str) {
        LogUtil.m82083d(TAG, "addTagsReport...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                sdk.m114349d(next, jSONObject.getString(next));
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "addTagsReport catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public static void initApm(String str, final String str2) {
        LogUtil.m82083d(TAG, "initApm...");
        try {
            sdk = d610.m114345h(context, d610.C16462c.m114353d("432410").m114362f(token).m114364h("1。0").m114363g(1L).m114359c(new d610.C16462c.a() { // from class: com.ss.bytertc.engine.utils.CrashInfoUtilToB.1
                @Override // p153l.d610.C16462c.a
                public String getDid() {
                    return str2;
                }

                @Override // p153l.d610.C16462c.a
                public String getUserId() {
                    return null;
                }
            }).m114358b("rtc_sdk").m114360d("bytertc", "com.ss.video.rtc.oner", "com.bytedance.ttgame.module.rtc.RtcService").m114361e("libbyteaudio.so", "libbytertc.so", "libagora.so", "libonerrtc.so", "libvolcenginertc.so", "libulien_audio.so").m114357a());
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "initApm catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public static void onEventV3Report(String str) {
        LogUtil.m82083d(TAG, "onEventV3Report...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            boolean z = false;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                sdk.m114348c(next, string);
                if (next.equals("rtc_room_id") && !string.equals("")) {
                    z = true;
                }
            }
            if (z) {
                sdk.m114348c("rtc_session_type", "joinRoom");
            } else {
                sdk.m114348c("rtc_session_type", "createEngine");
            }
            sdk.m114351j(null);
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onEventV3Report catch exception.\n" + e.getMessage());
        }
    }
}
