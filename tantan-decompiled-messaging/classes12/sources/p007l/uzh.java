package p007l;

import android.content.Context;
import com.p000p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class uzh implements szh {

    /* JADX INFO: renamed from: c */
    public static volatile uzh f13998c;

    /* JADX INFO: renamed from: a */
    public szh f13999a;

    /* JADX INFO: renamed from: b */
    public tzh f14000b;

    /* JADX INFO: renamed from: p */
    public static uzh m15183p(Context context) {
        if (f13998c == null) {
            synchronized (uzh.class) {
                try {
                    if (f13998c == null) {
                        f13998c = new uzh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13998c;
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: a */
    public String mo14408a() {
        return m15186o().mo14408a();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: b */
    public String mo14409b() {
        return m15186o().mo14409b();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: c */
    public String mo14410c() {
        return m15186o().mo14410c();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: d */
    public boolean mo14411d() {
        return m15186o().mo14411d();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: e */
    public String mo14412e() {
        return m15186o().mo14412e();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: f */
    public String mo14413f() {
        return m15186o().mo14413f();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: g */
    public String mo14414g() {
        return m15186o().mo14414g();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: h */
    public boolean mo14415h() {
        return m15186o().mo14415h();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: i */
    public String mo14416i() {
        return m15186o().mo14416i();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: j */
    public String mo14417j() {
        return m15186o().mo14417j();
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: k */
    public String mo14418k(boolean z) {
        return m15186o().mo14418k(z);
    }

    @Override // p007l.szh
    /* JADX INFO: renamed from: l */
    public String mo14419l() {
        return m15186o().mo14419l();
    }

    /* JADX INFO: renamed from: m */
    public final void m15184m() {
        f13998c.m15187q(m15185n());
    }

    /* JADX INFO: renamed from: n */
    public tzh m15185n() {
        if (this.f14000b == null) {
            this.f14000b = new tzh(FeedModule.f313a);
        }
        return this.f14000b;
    }

    /* JADX INFO: renamed from: o */
    public szh m15186o() {
        m15184m();
        return this.f13999a;
    }

    /* JADX INFO: renamed from: q */
    public void m15187q(szh szhVar) {
        this.f13999a = szhVar;
    }
}
