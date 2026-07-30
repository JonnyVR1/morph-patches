package com.p046p1.mobile.putong.app.statistics;

import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.statistics.AppOpenWayStats;
import com.p046p1.mobile.putong.data.Link;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p149l.e51;
import p149l.j760;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class AppOpenWayStats {

    /* JADX INFO: renamed from: a */
    public static int f17196a;

    /* JADX INFO: renamed from: b */
    public static AppStartStatus f17197b = AppStartStatus.UNKNOWN;

    public enum AppStartStatus {
        UNKNOWN,
        NORMAL,
        PUSH,
        LINK
    }

    /* JADX INFO: renamed from: b */
    public static void m29670b() {
        f17197b = AppStartStatus.UNKNOWN;
    }

    /* JADX INFO: renamed from: c */
    public static void m29671c(String str, String str2, JSONObject jSONObject, String str3) {
        zvf0.m220369B("e_app_launch", "", new j760("is_cold_launch", Boolean.valueOf(f17196a == 0)), new j760("launch_type", str), new j760(Link.TYPE, str2), new j760("push_content", jSONObject), new j760("push_id", str3));
    }

    /* JADX INFO: renamed from: d */
    public static void m29672d(String str) {
        m29671c(Link.TYPE, str, new JSONObject(), "");
        f17197b = AppStartStatus.LINK;
        f17196a++;
    }

    /* JADX INFO: renamed from: e */
    public static void m29673e(final PushTrackData pushTrackData) {
        if (NullChecker.m81303a(pushTrackData)) {
            if (f17197b == AppStartStatus.UNKNOWN) {
                e51.m114774y(new Runnable() { // from class: l.vw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppOpenWayStats.m29671c("push", "", new JSONObject(), pushTrackData.gid);
                    }
                });
            }
            f17197b = AppStartStatus.PUSH;
            f17196a++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m29674f() {
        if (f17197b == AppStartStatus.UNKNOWN) {
            m29671c("normal", "", new JSONObject(), "");
        }
        f17197b = AppStartStatus.NORMAL;
        f17196a++;
    }
}
