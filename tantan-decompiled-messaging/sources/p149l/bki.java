package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class bki {
    /* JADX INFO: renamed from: a */
    public static String m102395a(boolean z) {
        return z ? "success" : "fail";
    }

    /* JADX INFO: renamed from: b */
    public static void m102396b(String str, boolean z) {
        zvf0.m220369B("e_live_beauty_download", "", vwb.m200311Y("beauty_url", str), vwb.m200311Y("process_status", m102395a(z)));
    }

    /* JADX INFO: renamed from: c */
    public static void m102397c(String str) {
        zvf0.m220369B("e_live_beauty_download_start", "", vwb.m200311Y("beauty_url", str));
    }

    /* JADX INFO: renamed from: d */
    public static void m102398d(String str, boolean z) {
        zvf0.m220369B("e_live_beauty_md_check", "", vwb.m200311Y("beauty_url", str), vwb.m200311Y("process_status", m102395a(z)));
    }

    /* JADX INFO: renamed from: e */
    public static void m102399e(String str, boolean z) {
        zvf0.m220369B("e_live_beauty_unzip_check", "", vwb.m200311Y("beauty_url", str), vwb.m200311Y("process_status", m102395a(z)));
    }
}
