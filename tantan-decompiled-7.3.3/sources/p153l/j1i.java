package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes13.dex */
public class j1i implements h1i {

    /* JADX INFO: renamed from: c */
    public static volatile j1i f117967c;

    /* JADX INFO: renamed from: a */
    public h1i f117968a;

    /* JADX INFO: renamed from: b */
    public i1i f117969b;

    /* JADX INFO: renamed from: p */
    public static j1i m143129p(Context context) {
        if (f117967c == null) {
            synchronized (j1i.class) {
                try {
                    if (f117967c == null) {
                        f117967c = new j1i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f117967c;
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: a */
    public String mo133332a() {
        return m143132o().mo133332a();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: b */
    public String mo133333b() {
        return m143132o().mo133333b();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: c */
    public String mo133334c() {
        return m143132o().mo133334c();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: d */
    public boolean mo133335d() {
        return m143132o().mo133335d();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: e */
    public String mo133336e() {
        return m143132o().mo133336e();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: f */
    public String mo133337f() {
        return m143132o().mo133337f();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: g */
    public String mo133338g() {
        return m143132o().mo133338g();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: h */
    public boolean mo133339h() {
        return m143132o().mo133339h();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: i */
    public String mo133340i() {
        return m143132o().mo133340i();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: j */
    public String mo133341j() {
        return m143132o().mo133341j();
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: k */
    public String mo133342k(boolean z) {
        return m143132o().mo133342k(z);
    }

    @Override // p153l.h1i
    /* JADX INFO: renamed from: l */
    public String mo133343l() {
        return m143132o().mo133343l();
    }

    /* JADX INFO: renamed from: m */
    public final void m143130m() {
        f117967c.m143133q(m143131n());
    }

    /* JADX INFO: renamed from: n */
    public i1i m143131n() {
        if (this.f117969b == null) {
            this.f117969b = new i1i(FeedModule.f39700a);
        }
        return this.f117969b;
    }

    /* JADX INFO: renamed from: o */
    public h1i m143132o() {
        m143130m();
        return this.f117968a;
    }

    /* JADX INFO: renamed from: q */
    public void m143133q(h1i h1iVar) {
        this.f117968a = h1iVar;
    }
}
