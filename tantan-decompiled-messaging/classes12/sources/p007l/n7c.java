package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n7c {

    /* JADX INFO: renamed from: e */
    public static volatile n7c f10688e;

    /* JADX INFO: renamed from: a */
    public boolean f10689a;

    /* JADX INFO: renamed from: b */
    public String f10690b;

    /* JADX INFO: renamed from: c */
    public int f10691c = -1;

    /* JADX INFO: renamed from: d */
    public zzl f10692d;

    /* JADX INFO: renamed from: e */
    public static n7c m12098e() {
        if (f10688e == null) {
            synchronized (n7c.class) {
                try {
                    if (f10688e == null) {
                        f10688e = new n7c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10688e;
    }

    /* JADX INFO: renamed from: a */
    public void m12099a(String str) {
        zzl zzlVar = this.f10692d;
        if (zzlVar == null) {
            return;
        }
        zzlVar.mo4843v3(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m12100b() {
        zzl zzlVar = this.f10692d;
        if (zzlVar == null) {
            return false;
        }
        FeedModule.f316d.f14929I1 = "follow";
        zzlVar.mo4818j0();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m12101c(String str) {
        this.f10689a = true;
        this.f10690b = str;
        return m12100b();
    }

    /* JADX INFO: renamed from: d */
    public boolean m12102d() {
        zzl zzlVar = this.f10692d;
        if (zzlVar == null) {
            return false;
        }
        FeedModule.f316d.f14929I1 = "dating";
        zzlVar.mo4818j0();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m12103f(String str, boolean z) {
        zzl zzlVar = this.f10692d;
        if (zzlVar == null) {
            return;
        }
        zzlVar.mo4779O0(str, z);
    }

    /* JADX INFO: renamed from: g */
    public void m12104g() {
        this.f10692d = null;
    }

    /* JADX INFO: renamed from: h */
    public void m12105h() {
        zzl zzlVar = this.f10692d;
        if (zzlVar == null) {
            return;
        }
        zzlVar.mo4810g2();
    }

    /* JADX INFO: renamed from: i */
    public void m12106i(zzl zzlVar) {
        this.f10692d = zzlVar;
    }
}
