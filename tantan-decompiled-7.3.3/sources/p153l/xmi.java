package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class xmi {
    /* JADX INFO: renamed from: a */
    public static String m211726a(boolean z) {
        return z ? "success" : "fail";
    }

    /* JADX INFO: renamed from: b */
    public static void m211727b(String str, boolean z) {
        i4g0.m138493B("e_live_beauty_download", "", jyb.m147494Y("beauty_url", str), jyb.m147494Y("process_status", m211726a(z)));
    }

    /* JADX INFO: renamed from: c */
    public static void m211728c(String str) {
        i4g0.m138493B("e_live_beauty_download_start", "", jyb.m147494Y("beauty_url", str));
    }

    /* JADX INFO: renamed from: d */
    public static void m211729d(String str, boolean z) {
        i4g0.m138493B("e_live_beauty_md_check", "", jyb.m147494Y("beauty_url", str), jyb.m147494Y("process_status", m211726a(z)));
    }

    /* JADX INFO: renamed from: e */
    public static void m211730e(String str, boolean z) {
        i4g0.m138493B("e_live_beauty_unzip_check", "", jyb.m147494Y("beauty_url", str), jyb.m147494Y("process_status", m211726a(z)));
    }
}
