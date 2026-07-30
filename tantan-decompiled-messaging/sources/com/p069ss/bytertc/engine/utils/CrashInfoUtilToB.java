package com.p069ss.bytertc.engine.utils;

import android.content.Context;
import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.base.utils.RtcContextUtils;
import java.util.Iterator;
import org.json.JSONObject;
import p149l.tx00;

/* JADX INFO: loaded from: classes13.dex */
public class CrashInfoUtilToB {
    private static final String TAG = "CrashInfoUtilToB";
    private static final Context context = RtcContextUtils.getApplicationContext();
    private static tx00 sdk = null;
    private static final String token = "d7271e1eac254529abcffc63e36b02c3";

    @CalledByNative
    public static void addTagsReport(String str) {
        LogUtil.m80900d(TAG, "addTagsReport...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                sdk.m190923d(next, jSONObject.getString(next));
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "addTagsReport catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public static void initApm(String str, final String str2) {
        LogUtil.m80900d(TAG, "initApm...");
        try {
            sdk = tx00.m190919h(context, tx00.C20306c.m190927d("432410").m190936f(token).m190938h("1。0").m190937g(1L).m190933c(new tx00.C20306c.a() { // from class: com.ss.bytertc.engine.utils.CrashInfoUtilToB.1
                @Override // p149l.tx00.C20306c.a
                public String getDid() {
                    return str2;
                }

                @Override // p149l.tx00.C20306c.a
                public String getUserId() {
                    return null;
                }
            }).m190932b("rtc_sdk").m190934d("bytertc", "com.ss.video.rtc.oner", "com.bytedance.ttgame.module.rtc.RtcService").m190935e("libbyteaudio.so", "libbytertc.so", "libagora.so", "libonerrtc.so", "libvolcenginertc.so", "libulien_audio.so").m190931a());
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "initApm catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public static void onEventV3Report(String str) {
        LogUtil.m80900d(TAG, "onEventV3Report...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            boolean z = false;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                sdk.m190922c(next, string);
                if (next.equals("rtc_room_id") && !string.equals("")) {
                    z = true;
                }
            }
            if (z) {
                sdk.m190922c("rtc_session_type", "joinRoom");
            } else {
                sdk.m190922c("rtc_session_type", "createEngine");
            }
            sdk.m190925j(null);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onEventV3Report catch exception.\n" + e.getMessage());
        }
    }
}
