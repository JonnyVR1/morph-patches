package com.p000p1.mobile.putong.app.statistics;

import com.p000p1.mobile.putong.api.push.PushTrackData;
import com.p000p1.mobile.putong.app.statistics.AppOpenWayStats;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.j760;
import l.zvf0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AppOpenWayStats {

    /* JADX INFO: renamed from: a */
    public static int f1185a;

    /* JADX INFO: renamed from: b */
    public static AppStartStatus f1186b = AppStartStatus.UNKNOWN;

    public enum AppStartStatus {
        UNKNOWN,
        NORMAL,
        PUSH,
        LINK
    }

    /* JADX INFO: renamed from: b */
    public static void m1580b() {
        f1186b = AppStartStatus.UNKNOWN;
    }

    /* JADX INFO: renamed from: c */
    public static void m1581c(String str, String str2, JSONObject jSONObject, String str3) {
        zvf0.B("e_app_launch", "", new j760[]{new j760("is_cold_launch", Boolean.valueOf(f1185a == 0)), new j760("launch_type", str), new j760("link", str2), new j760("push_content", jSONObject), new j760("push_id", str3)});
    }

    /* JADX INFO: renamed from: d */
    public static void m1582d(String str) {
        m1581c("link", str, new JSONObject(), "");
        f1186b = AppStartStatus.LINK;
        f1185a++;
    }

    /* JADX INFO: renamed from: e */
    public static void m1583e(final PushTrackData pushTrackData) {
        if (NullChecker.a(pushTrackData)) {
            if (f1186b == AppStartStatus.UNKNOWN) {
                e51.y(new Runnable() { // from class: l.vw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppOpenWayStats.m1581c("push", "", new JSONObject(), pushTrackData.gid);
                    }
                });
            }
            f1186b = AppStartStatus.PUSH;
            f1185a++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1584f() {
        if (f1186b == AppStartStatus.UNKNOWN) {
            m1581c("normal", "", new JSONObject(), "");
        }
        f1186b = AppStartStatus.NORMAL;
        f1185a++;
    }
}
