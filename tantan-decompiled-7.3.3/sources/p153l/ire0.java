package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class ire0 {

    /* JADX INFO: renamed from: a */
    private String f116544a;

    /* JADX INFO: renamed from: b */
    private String f116545b;

    /* JADX INFO: renamed from: c */
    private String f116546c;

    /* JADX INFO: renamed from: d */
    private String f116547d;

    /* JADX INFO: renamed from: e */
    private int f116548e;

    /* JADX INFO: renamed from: f */
    private String f116549f;

    /* JADX INFO: renamed from: g */
    private long f116550g;

    /* JADX INFO: renamed from: h */
    private long f116551h;

    /* JADX INFO: renamed from: i */
    private String f116552i;

    /* JADX INFO: renamed from: j */
    private boolean f116553j;

    public ire0(String str, String str2, String str3, String str4, int i, String str5, long j, long j2, String str6) {
        this.f116544a = str;
        this.f116545b = str2;
        this.f116546c = str3;
        this.f116547d = str4;
        this.f116548e = i;
        this.f116549f = str5;
        this.f116550g = j;
        this.f116551h = j2;
        this.f116552i = str6;
        this.f116553j = (str5 == null || TextUtils.isEmpty(str5)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public String m141811a() {
        String str = this.f116546c;
        if (str == null) {
            return null;
        }
        return cje.m110113a(str, this.f116547d);
    }

    /* JADX INFO: renamed from: b */
    public String m141812b() {
        return this.f116546c;
    }

    /* JADX INFO: renamed from: c */
    public String m141813c() {
        return this.f116552i;
    }

    /* JADX INFO: renamed from: d */
    public String m141814d() {
        return this.f116545b;
    }

    /* JADX INFO: renamed from: e */
    public long m141815e() {
        return this.f116551h;
    }

    /* JADX INFO: renamed from: f */
    public String m141816f() {
        return this.f116544a;
    }

    /* JADX INFO: renamed from: g */
    public long m141817g() {
        return this.f116550g;
    }

    /* JADX INFO: renamed from: h */
    public int m141818h() {
        return this.f116548e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m141819i() {
        return this.f116553j;
    }

    /* JADX INFO: renamed from: j */
    public void m141820j(boolean z) {
        this.f116553j = z;
    }

    public String toString() {
        return "ServerConfig{sign='" + this.f116544a + "', md5='" + this.f116545b + "', guid='" + this.f116546c + "', suffix='" + this.f116547d + "', version=" + this.f116548e + ", patch='" + this.f116549f + "', size=" + this.f116550g + ", patch_size=" + this.f116551h + ", isIncremental=" + this.f116553j + '}';
    }

    public ire0() {
    }
}
