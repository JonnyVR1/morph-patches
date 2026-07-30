package p002l;

import l.j760;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bki {
    /* JADX INFO: renamed from: a */
    public static String m10415a(boolean z) {
        return z ? "success" : "fail";
    }

    /* JADX INFO: renamed from: b */
    public static void m10416b(String str, boolean z) {
        zvf0.B("e_live_beauty_download", "", new j760[]{vwb.Y("beauty_url", str), vwb.Y("process_status", m10415a(z))});
    }

    /* JADX INFO: renamed from: c */
    public static void m10417c(String str) {
        zvf0.B("e_live_beauty_download_start", "", new j760[]{vwb.Y("beauty_url", str)});
    }

    /* JADX INFO: renamed from: d */
    public static void m10418d(String str, boolean z) {
        zvf0.B("e_live_beauty_md_check", "", new j760[]{vwb.Y("beauty_url", str), vwb.Y("process_status", m10415a(z))});
    }

    /* JADX INFO: renamed from: e */
    public static void m10419e(String str, boolean z) {
        zvf0.B("e_live_beauty_unzip_check", "", new j760[]{vwb.Y("beauty_url", str), vwb.Y("process_status", m10415a(z))});
    }
}
