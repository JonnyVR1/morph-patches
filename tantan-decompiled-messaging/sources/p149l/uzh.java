package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes12.dex */
public class uzh implements szh {

    /* JADX INFO: renamed from: c */
    public static volatile uzh f178991c;

    /* JADX INFO: renamed from: a */
    public szh f178992a;

    /* JADX INFO: renamed from: b */
    public tzh f178993b;

    /* JADX INFO: renamed from: p */
    public static uzh m196413p(Context context) {
        if (f178991c == null) {
            synchronized (uzh.class) {
                try {
                    if (f178991c == null) {
                        f178991c = new uzh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f178991c;
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: a */
    public String mo186782a() {
        return m196416o().mo186782a();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: b */
    public String mo186783b() {
        return m196416o().mo186783b();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: c */
    public String mo186784c() {
        return m196416o().mo186784c();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: d */
    public boolean mo186785d() {
        return m196416o().mo186785d();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: e */
    public String mo186786e() {
        return m196416o().mo186786e();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: f */
    public String mo186787f() {
        return m196416o().mo186787f();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: g */
    public String mo186788g() {
        return m196416o().mo186788g();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: h */
    public boolean mo186789h() {
        return m196416o().mo186789h();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: i */
    public String mo186790i() {
        return m196416o().mo186790i();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: j */
    public String mo186791j() {
        return m196416o().mo186791j();
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: k */
    public String mo186792k(boolean z) {
        return m196416o().mo186792k(z);
    }

    @Override // p149l.szh
    /* JADX INFO: renamed from: l */
    public String mo186793l() {
        return m196416o().mo186793l();
    }

    /* JADX INFO: renamed from: m */
    public final void m196414m() {
        f178991c.m196417q(m196415n());
    }

    /* JADX INFO: renamed from: n */
    public tzh m196415n() {
        if (this.f178993b == null) {
            this.f178993b = new tzh(FeedModule.f38852a);
        }
        return this.f178993b;
    }

    /* JADX INFO: renamed from: o */
    public szh m196416o() {
        m196414m();
        return this.f178992a;
    }

    /* JADX INFO: renamed from: q */
    public void m196417q(szh szhVar) {
        this.f178992a = szhVar;
    }
}
