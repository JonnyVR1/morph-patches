package p153l;

import com.p051p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes13.dex */
public class t8c {

    /* JADX INFO: renamed from: e */
    public static volatile t8c f172519e;

    /* JADX INFO: renamed from: a */
    public boolean f172520a;

    /* JADX INFO: renamed from: b */
    public String f172521b;

    /* JADX INFO: renamed from: c */
    public int f172522c = -1;

    /* JADX INFO: renamed from: d */
    public t2m f172523d;

    /* JADX INFO: renamed from: e */
    public static t8c m189652e() {
        if (f172519e == null) {
            synchronized (t8c.class) {
                try {
                    if (f172519e == null) {
                        f172519e = new t8c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f172519e;
    }

    /* JADX INFO: renamed from: a */
    public void m189653a(String str) {
        t2m t2mVar = this.f172523d;
        if (t2mVar == null) {
            return;
        }
        t2mVar.mo65000v3(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m189654b() {
        t2m t2mVar = this.f172523d;
        if (t2mVar == null) {
            return false;
        }
        FeedModule.f39703d.f121304I1 = "follow";
        t2mVar.mo64975j0();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m189655c(String str) {
        this.f172520a = true;
        this.f172521b = str;
        return m189654b();
    }

    /* JADX INFO: renamed from: d */
    public boolean m189656d() {
        t2m t2mVar = this.f172523d;
        if (t2mVar == null) {
            return false;
        }
        FeedModule.f39703d.f121304I1 = "dating";
        t2mVar.mo64975j0();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m189657f(String str, boolean z) {
        t2m t2mVar = this.f172523d;
        if (t2mVar == null) {
            return;
        }
        t2mVar.mo64938O0(str, z);
    }

    /* JADX INFO: renamed from: g */
    public void m189658g() {
        this.f172523d = null;
    }

    /* JADX INFO: renamed from: h */
    public void m189659h() {
        t2m t2mVar = this.f172523d;
        if (t2mVar == null) {
            return;
        }
        t2mVar.mo64968g2();
    }

    /* JADX INFO: renamed from: i */
    public void m189660i(t2m t2mVar) {
        this.f172523d = t2mVar;
    }
}
