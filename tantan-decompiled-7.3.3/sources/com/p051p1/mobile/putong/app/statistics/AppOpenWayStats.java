package com.p051p1.mobile.putong.app.statistics;

import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.statistics.AppOpenWayStats;
import com.p051p1.mobile.putong.data.Link;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p153l.i4g0;
import p153l.l51;
import p153l.pf60;

/* JADX INFO: loaded from: classes9.dex */
public class AppOpenWayStats {

    /* JADX INFO: renamed from: a */
    public static int f17915a;

    /* JADX INFO: renamed from: b */
    public static AppStartStatus f17916b = AppStartStatus.UNKNOWN;

    public enum AppStartStatus {
        UNKNOWN,
        NORMAL,
        PUSH,
        LINK
    }

    /* JADX INFO: renamed from: b */
    public static void m30668b() {
        f17916b = AppStartStatus.UNKNOWN;
    }

    /* JADX INFO: renamed from: c */
    public static void m30669c(String str, String str2, JSONObject jSONObject, String str3) {
        i4g0.m138493B("e_app_launch", "", new pf60("is_cold_launch", Boolean.valueOf(f17915a == 0)), new pf60("launch_type", str), new pf60(Link.TYPE, str2), new pf60("push_content", jSONObject), new pf60("push_id", str3));
    }

    /* JADX INFO: renamed from: d */
    public static void m30670d(String str) {
        m30669c(Link.TYPE, str, new JSONObject(), "");
        f17916b = AppStartStatus.LINK;
        f17915a++;
    }

    /* JADX INFO: renamed from: e */
    public static void m30671e(final PushTrackData pushTrackData) {
        if (NullChecker.m82486a(pushTrackData)) {
            if (f17916b == AppStartStatus.UNKNOWN) {
                l51.m152919y(new Runnable() { // from class: l.cx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppOpenWayStats.m30669c("push", "", new JSONObject(), pushTrackData.gid);
                    }
                });
            }
            f17916b = AppStartStatus.PUSH;
            f17915a++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m30672f() {
        if (f17916b == AppStartStatus.UNKNOWN) {
            m30669c("normal", "", new JSONObject(), "");
        }
        f17916b = AppStartStatus.NORMAL;
        f17915a++;
    }
}
