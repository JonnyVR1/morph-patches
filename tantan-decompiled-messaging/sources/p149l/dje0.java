package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class dje0 {

    /* JADX INFO: renamed from: a */
    private String f86517a;

    /* JADX INFO: renamed from: b */
    private String f86518b;

    /* JADX INFO: renamed from: c */
    private String f86519c;

    /* JADX INFO: renamed from: d */
    private String f86520d;

    /* JADX INFO: renamed from: e */
    private int f86521e;

    /* JADX INFO: renamed from: f */
    private String f86522f;

    /* JADX INFO: renamed from: g */
    private long f86523g;

    /* JADX INFO: renamed from: h */
    private long f86524h;

    /* JADX INFO: renamed from: i */
    private String f86525i;

    /* JADX INFO: renamed from: j */
    private boolean f86526j;

    public dje0(String str, String str2, String str3, String str4, int i, String str5, long j, long j2, String str6) {
        this.f86517a = str;
        this.f86518b = str2;
        this.f86519c = str3;
        this.f86520d = str4;
        this.f86521e = i;
        this.f86522f = str5;
        this.f86523g = j;
        this.f86524h = j2;
        this.f86525i = str6;
        this.f86526j = (str5 == null || TextUtils.isEmpty(str5)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public String m112026a() {
        String str = this.f86519c;
        if (str == null) {
            return null;
        }
        return yhe.m214798a(str, this.f86520d);
    }

    /* JADX INFO: renamed from: b */
    public String m112027b() {
        return this.f86519c;
    }

    /* JADX INFO: renamed from: c */
    public String m112028c() {
        return this.f86525i;
    }

    /* JADX INFO: renamed from: d */
    public String m112029d() {
        return this.f86518b;
    }

    /* JADX INFO: renamed from: e */
    public long m112030e() {
        return this.f86524h;
    }

    /* JADX INFO: renamed from: f */
    public String m112031f() {
        return this.f86517a;
    }

    /* JADX INFO: renamed from: g */
    public long m112032g() {
        return this.f86523g;
    }

    /* JADX INFO: renamed from: h */
    public int m112033h() {
        return this.f86521e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m112034i() {
        return this.f86526j;
    }

    /* JADX INFO: renamed from: j */
    public void m112035j(boolean z) {
        this.f86526j = z;
    }

    public String toString() {
        return "ServerConfig{sign='" + this.f86517a + "', md5='" + this.f86518b + "', guid='" + this.f86519c + "', suffix='" + this.f86520d + "', version=" + this.f86521e + ", patch='" + this.f86522f + "', size=" + this.f86523g + ", patch_size=" + this.f86524h + ", isIncremental=" + this.f86526j + '}';
    }

    public dje0() {
    }
}
