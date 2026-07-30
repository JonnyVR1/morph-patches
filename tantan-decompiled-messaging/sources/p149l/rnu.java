package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12532b;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class rnu extends zeu<rnu> implements s7m<rnu> {

    /* JADX INFO: renamed from: f */
    public vqu f160325f;

    /* JADX INFO: renamed from: g */
    public asu f160326g;

    /* JADX INFO: renamed from: h */
    public c4g0 f160327h;

    /* JADX INFO: renamed from: i */
    public int f160328i;

    public rnu(jlu jluVar) {
        super(jluVar);
        this.f160325f = new vqu(jluVar);
        this.f160326g = new asu(jluVar);
    }

    /* JADX INFO: renamed from: J3 */
    private void m180160J3() {
        gkh0.m126627j("videoChat", "calling status refresh chat request");
        iuu.m138445F(m218409H2().m203939p()).subscribe(ffw.m121194e(new e30() { // from class: l.gnu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103629a.m180188H3((BLiveVideoChat) obj);
            }
        }, new e30() { // from class: l.inu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114048a.m180189I3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ Boolean m180182B3() {
        return Boolean.valueOf(wlu.m203900x(m218409H2().m203947y()) > wlu.m203900x("pending"));
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m180183C3() {
        m218409H2().m203920T(slk0.f165238d, "timeout");
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m180184D3(BLiveVideoChat bLiveVideoChat) {
        m218409H2().m203934h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Boolean m180185E3() {
        return Boolean.valueOf(wlu.m203900x(m218409H2().m203947y()) > wlu.m203900x("connecting"));
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m180186F3() {
        m218409H2().m203920T(slk0.f165238d, "timeout");
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m180187G3(Long l2) {
        m180160J3();
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m180188H3(BLiveVideoChat bLiveVideoChat) {
        gkh0.m126627j("videoChat", "calling status refresh chat success ");
        this.f160328i = 0;
        m218409H2().m203934h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m180189I3(Throwable th) {
        this.f160328i++;
        gkh0.m126627j("videoChat", "calling status refresh error: " + this.f160328i);
        if (this.f160328i >= s9s.f163228b.m195673L5()) {
            m218409H2().m203920T(slk0.f165237c, "timeout");
        }
    }

    /* JADX INFO: renamed from: L3 */
    public void m180191L3(int i, String str, String str2, e30<BLiveVideoChat> e30Var, e30<Throwable> e30Var2) {
        this.f160325f.m199602j(i, str, str2, e30Var, e30Var2);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m104250o2(m218409H2().m203948z(), false).subscribe(ffw.m121193d(new e30() { // from class: l.wmu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187163a.m180196r3((String) obj);
            }
        }));
        m104250o2(m218409H2().f186998c.m216979l().f170406T1, false).filter(new w9j() { // from class: l.jnu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((LongLinkVideoChat.LiveVideoChatToast) obj).getToast()));
            }
        }).filter(new w9j() { // from class: l.knu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123912a.m180193o3((LongLinkVideoChat.LiveVideoChatToast) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.lnu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129026a.m180197s3((LongLinkVideoChat.LiveVideoChatToast) obj);
            }
        }));
        m104250o2(m218409H2().f186998c.m216979l().f170403S1, false).subscribe(ffw.m121193d(new e30() { // from class: l.mnu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134793a.m180198t3((BLiveVideoChat) obj);
            }
        }));
        m104250o2(m218409H2().f186998c.m216979l().f170418X1, false).subscribe(ffw.m121193d(new e30() { // from class: l.nnu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139785a.m180199u3((LongLinkVideoChat.LiveVideoChatCdnFail) obj);
            }
        }));
        if (m218409H2().m203946w().isFakeCall()) {
            this.f160326g.m98615e(s9s.f163228b.m195697O5(), new v9j() { // from class: l.onu
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f144821a.m180200v3();
                }
            }, new d30() { // from class: l.pnu
                @Override // p149l.d30
                public final void call() {
                    this.f150414a.m180201w3();
                }
            });
        }
        if (m218409H2().m203946w().isRandomMatch()) {
            this.f160326g.m98615e(m218409H2().m203946w().randomMatch.matchTimeoutSec, new v9j() { // from class: l.qnu
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f155494a.m180202x3();
                }
            }, new d30() { // from class: l.xmu
                @Override // p149l.d30
                public final void call() {
                    this.f193578a.m180203y3();
                }
            });
        }
        m104250o2(m218409H2().f186998c.m216975h(), false).subscribe(ffw.m121193d(new e30() { // from class: l.hnu
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126627j("videoChat", "longLink status: " + ((Boolean) obj));
            }
        }));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public final Boolean m180193o3(LongLinkVideoChat.LiveVideoChatToast liveVideoChatToast) {
        return Boolean.valueOf(TextUtils.isEmpty(liveVideoChatToast.getChatId()) || TextUtils.equals(liveVideoChatToast.getChatId(), m218409H2().m203939p()));
    }

    /* JADX INFO: renamed from: p3 */
    public final void m180194p3() {
        final rnu rnuVar;
        BLiveVideoChat bLiveVideoChatM203901A = m218409H2().m203901A();
        if (bLiveVideoChatM203901A == null) {
            return;
        }
        if (slk0.m184830f(bLiveVideoChatM203901A)) {
            rnuVar = this;
            rnuVar.m180191L3(s9s.f163228b.m195681M5(), bLiveVideoChatM203901A.f44474id, "pending", new e30() { // from class: l.ymu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199062a.m180204z3((BLiveVideoChat) obj);
                }
            }, new e30() { // from class: l.zmu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203776a.m180190K3((Throwable) obj);
                }
            });
            rnuVar.f160326g.m98615e(s9s.f163228b.m195689N5(), new v9j() { // from class: l.anu
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f70769a.m180182B3();
                }
            }, new d30() { // from class: l.bnu
                @Override // p149l.d30
                public final void call() {
                    this.f76450a.m180183C3();
                }
            });
        } else {
            rnuVar = this;
        }
        if (slk0.m184826b(bLiveVideoChatM203901A)) {
            rnuVar.m180191L3(s9s.f163228b.m195681M5(), bLiveVideoChatM203901A.f44474id, "connecting", new e30() { // from class: l.cnu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81693a.m180184D3((BLiveVideoChat) obj);
                }
            }, new e30() { // from class: l.zmu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203776a.m180190K3((Throwable) obj);
                }
            });
            rnuVar.f160326g.m98615e(s9s.f163228b.m195689N5(), new v9j() { // from class: l.dnu
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f87107a.m180185E3();
                }
            }, new d30() { // from class: l.enu
                @Override // p149l.d30
                public final void call() {
                    this.f92339a.m180186F3();
                }
            });
        }
        if (slk0.m184825a(bLiveVideoChatM203901A)) {
            rnuVar.f160328i = 0;
            int iM195665K5 = s9s.f163228b.m195665K5();
            gkh0.m126627j("videoChat", "calling  status start  looper: " + iM195665K5);
            rnuVar.f160327h = rnuVar.m104250o2(C22306c.interval((long) iM195665K5, TimeUnit.SECONDS), false).onBackpressureLatest().subscribe(ffw.m121193d(new e30() { // from class: l.fnu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98475a.m180187G3((Long) obj);
                }
            }));
        }
        if (slk0.m184831g(bLiveVideoChatM203901A)) {
            rnuVar.m180195q3(bLiveVideoChatM203901A);
        }
        if (slk0.m184829e(bLiveVideoChatM203901A)) {
            rnuVar.reset();
            mkd0.m154992z(rnuVar.f160327h);
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m180195q3(BLiveVideoChat bLiveVideoChat) {
        if (m218414N2()) {
            if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userCancel.name())) {
                lsi0.m151595y("对方已取消");
                return;
            }
            if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userHangUp.name())) {
                lsi0.m151595y("对方已挂断");
                return;
            }
            if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userQuit.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.banUser.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userLost.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userPayTimeout.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userNotPay.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userQuitMultiDevice.name())) {
                lsi0.m151595y("通话已中断");
                return;
            } else {
                if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.timeout.name())) {
                    lsi0.m151595y("未接听");
                    return;
                }
                return;
            }
        }
        if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorHangUp.name())) {
            lsi0.m151595y("对方已挂断");
        } else if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.banAnchor.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorLost.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorQuitMultiDevice.name())) {
            lsi0.m151595y("通话已中断");
        }
        boolean zIsFakeCall = m218409H2().m203946w().isFakeCall();
        String str = bLiveVideoChat.endType;
        if (zIsFakeCall) {
            if (TextUtils.equals(str, LongLinkVideoChat.VideoChat.EndType.timeout.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorReject.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorQuit.name())) {
                lsi0.m151595y("通话失败，对方已离开");
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LongLinkVideoChat.VideoChat.EndType.timeout.name())) {
            lsi0.m151595y("暂时无人接听，请稍后再试");
        } else if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorReject.name())) {
            lsi0.m151595y("对方正在忙碌中，请稍后再试");
        } else if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorQuit.name())) {
            lsi0.m151595y("通话已中断");
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m180196r3(String str) {
        m180194p3();
    }

    public void reset() {
        this.f160325f.m199603k();
        this.f160326g.m98614d();
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m180197s3(LongLinkVideoChat.LiveVideoChatToast liveVideoChatToast) {
        m218409H2().m203927a0(act(), liveVideoChatToast.getToast(), null);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m180198t3(BLiveVideoChat bLiveVideoChat) {
        m218409H2().m203934h0(bLiveVideoChat, true);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ void m180199u3(LongLinkVideoChat.LiveVideoChatCdnFail liveVideoChatCdnFail) {
        hfw.m130790a("videoChat", "receive cdn fail" + liveVideoChatCdnFail.getNewPushUrl());
        C12532b c12532bMo138913a = m218409H2().m203944u().m100104c().mo138913a();
        if (c12532bMo138913a instanceof t2l0) {
            ((t2l0) c12532bMo138913a).m187019v1(liveVideoChatCdnFail.getNewPushUrl());
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Boolean m180200v3() {
        return Boolean.valueOf(m218409H2().m203901A() != null);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m180201w3() {
        m218412L2(true);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ Boolean m180202x3() {
        return Boolean.valueOf(m218409H2().m203901A() != null);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m180203y3() {
        m218412L2(true);
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m180204z3(BLiveVideoChat bLiveVideoChat) {
        m218409H2().m203934h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m180190K3(Throwable th) {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rnu rnuVar) {
    }
}
