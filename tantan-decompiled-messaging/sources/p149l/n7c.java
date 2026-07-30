package p149l;

import com.p046p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes12.dex */
public class n7c {

    /* JADX INFO: renamed from: e */
    public static volatile n7c f137493e;

    /* JADX INFO: renamed from: a */
    public boolean f137494a;

    /* JADX INFO: renamed from: b */
    public String f137495b;

    /* JADX INFO: renamed from: c */
    public int f137496c = -1;

    /* JADX INFO: renamed from: d */
    public zzl f137497d;

    /* JADX INFO: renamed from: e */
    public static n7c m158118e() {
        if (f137493e == null) {
            synchronized (n7c.class) {
                try {
                    if (f137493e == null) {
                        f137493e = new n7c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f137493e;
    }

    /* JADX INFO: renamed from: a */
    public void m158119a(String str) {
        zzl zzlVar = this.f137497d;
        if (zzlVar == null) {
            return;
        }
        zzlVar.mo63817v3(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m158120b() {
        zzl zzlVar = this.f137497d;
        if (zzlVar == null) {
            return false;
        }
        FeedModule.f38855d.f192994I1 = "follow";
        zzlVar.mo63792j0();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m158121c(String str) {
        this.f137494a = true;
        this.f137495b = str;
        return m158120b();
    }

    /* JADX INFO: renamed from: d */
    public boolean m158122d() {
        zzl zzlVar = this.f137497d;
        if (zzlVar == null) {
            return false;
        }
        FeedModule.f38855d.f192994I1 = "dating";
        zzlVar.mo63792j0();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m158123f(String str, boolean z) {
        zzl zzlVar = this.f137497d;
        if (zzlVar == null) {
            return;
        }
        zzlVar.mo63755O0(str, z);
    }

    /* JADX INFO: renamed from: g */
    public void m158124g() {
        this.f137497d = null;
    }

    /* JADX INFO: renamed from: h */
    public void m158125h() {
        zzl zzlVar = this.f137497d;
        if (zzlVar == null) {
            return;
        }
        zzlVar.mo63785g2();
    }

    /* JADX INFO: renamed from: i */
    public void m158126i(zzl zzlVar) {
        this.f137497d = zzlVar;
    }
}
