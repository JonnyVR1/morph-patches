package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12695b;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class spu extends ahu<spu> implements iam<spu> {

    /* JADX INFO: renamed from: f */
    public wsu f170106f;

    /* JADX INFO: renamed from: g */
    public buu f170107g;

    /* JADX INFO: renamed from: h */
    public kcg0 f170108h;

    /* JADX INFO: renamed from: i */
    public int f170109i;

    public spu(knu knuVar) {
        super(knuVar);
        this.f170106f = new wsu(knuVar);
        this.f170107g = new buu(knuVar);
    }

    /* JADX INFO: renamed from: J3 */
    private void m187440J3() {
        nsh0.m164608j("videoChat", "calling status refresh chat request");
        jwu.m147231F(m97926H2().m212346p()).subscribe(dhw.m115826e(new y20() { // from class: l.hpu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111050a.m187468H3((BLiveVideoChat) obj);
            }
        }, new y20() { // from class: l.jpu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122134a.m187469I3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ Boolean m187462B3() {
        return Boolean.valueOf(xnu.m212307x(m97926H2().m212354y()) > xnu.m212307x("pending"));
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m187463C3() {
        m97926H2().m212327T(yuk0.f201635d, "timeout");
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m187464D3(BLiveVideoChat bLiveVideoChat) {
        m97926H2().m212341h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ Boolean m187465E3() {
        return Boolean.valueOf(xnu.m212307x(m97926H2().m212354y()) > xnu.m212307x("connecting"));
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m187466F3() {
        m97926H2().m212327T(yuk0.f201635d, "timeout");
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m187467G3(Long l2) {
        m187440J3();
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m187468H3(BLiveVideoChat bLiveVideoChat) {
        nsh0.m164608j("videoChat", "calling status refresh chat success ");
        this.f170109i = 0;
        m97926H2().m212341h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m187469I3(Throwable th) {
        this.f170109i++;
        nsh0.m164608j("videoChat", "calling status refresh error: " + this.f170109i);
        if (this.f170109i >= tbs.f172989b.m203460L5()) {
            m97926H2().m212327T(yuk0.f201634c, "timeout");
        }
    }

    /* JADX INFO: renamed from: L3 */
    public void m187471L3(int i, String str, String str2, y20<BLiveVideoChat> y20Var, y20<Throwable> y20Var2) {
        this.f170106f.m207800j(i, str, str2, y20Var, y20Var2);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m113231o2(m97926H2().m212355z(), false).subscribe(dhw.m115825d(new y20() { // from class: l.xou
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195599a.m187476r3((String) obj);
            }
        }));
        m113231o2(m97926H2().f195472c.m120391l().f71673T1, false).filter(new qcj() { // from class: l.kpu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty(((LongLinkVideoChat.LiveVideoChatToast) obj).getToast()));
            }
        }).filter(new qcj() { // from class: l.lpu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f133119a.m187473o3((LongLinkVideoChat.LiveVideoChatToast) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.mpu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137953a.m187477s3((LongLinkVideoChat.LiveVideoChatToast) obj);
            }
        }));
        m113231o2(m97926H2().f195472c.m120391l().f71670S1, false).subscribe(dhw.m115825d(new y20() { // from class: l.npu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143135a.m187478t3((BLiveVideoChat) obj);
            }
        }));
        m113231o2(m97926H2().f195472c.m120391l().f71685X1, false).subscribe(dhw.m115825d(new y20() { // from class: l.opu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148508a.m187479u3((LongLinkVideoChat.LiveVideoChatCdnFail) obj);
            }
        }));
        if (m97926H2().m212353w().isFakeCall()) {
            this.f170107g.m106541e(tbs.f172989b.m203484O5(), new pcj() { // from class: l.ppu
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f153584a.m187480v3();
                }
            }, new x20() { // from class: l.qpu
                @Override // p153l.x20
                public final void call() {
                    this.f158909a.m187481w3();
                }
            });
        }
        if (m97926H2().m212353w().isRandomMatch()) {
            this.f170107g.m106541e(m97926H2().m212353w().randomMatch.matchTimeoutSec, new pcj() { // from class: l.rpu
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f164396a.m187482x3();
                }
            }, new x20() { // from class: l.you
                @Override // p153l.x20
                public final void call() {
                    this.f201016a.m187483y3();
                }
            });
        }
        m113231o2(m97926H2().f195472c.m120387h(), false).subscribe(dhw.m115825d(new y20() { // from class: l.ipu
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164608j("videoChat", "longLink status: " + ((Boolean) obj));
            }
        }));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public final Boolean m187473o3(LongLinkVideoChat.LiveVideoChatToast liveVideoChatToast) {
        return Boolean.valueOf(TextUtils.isEmpty(liveVideoChatToast.getChatId()) || TextUtils.equals(liveVideoChatToast.getChatId(), m97926H2().m212346p()));
    }

    /* JADX INFO: renamed from: p3 */
    public final void m187474p3() {
        final spu spuVar;
        BLiveVideoChat bLiveVideoChatM212308A = m97926H2().m212308A();
        if (bLiveVideoChatM212308A == null) {
            return;
        }
        if (yuk0.m217440f(bLiveVideoChatM212308A)) {
            spuVar = this;
            spuVar.m187471L3(tbs.f172989b.m203468M5(), bLiveVideoChatM212308A.f45322id, "pending", new y20() { // from class: l.zou
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205389a.m187484z3((BLiveVideoChat) obj);
                }
            }, new y20() { // from class: l.apu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72758a.m187470K3((Throwable) obj);
                }
            });
            spuVar.f170107g.m106541e(tbs.f172989b.m203476N5(), new pcj() { // from class: l.bpu
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f77808a.m187462B3();
                }
            }, new x20() { // from class: l.cpu
                @Override // p153l.x20
                public final void call() {
                    this.f83028a.m187463C3();
                }
            });
        } else {
            spuVar = this;
        }
        if (yuk0.m217436b(bLiveVideoChatM212308A)) {
            spuVar.m187471L3(tbs.f172989b.m203468M5(), bLiveVideoChatM212308A.f45322id, "connecting", new y20() { // from class: l.dpu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90088a.m187464D3((BLiveVideoChat) obj);
                }
            }, new y20() { // from class: l.apu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72758a.m187470K3((Throwable) obj);
                }
            });
            spuVar.f170107g.m106541e(tbs.f172989b.m203476N5(), new pcj() { // from class: l.epu
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f95275a.m187465E3();
                }
            }, new x20() { // from class: l.fpu
                @Override // p153l.x20
                public final void call() {
                    this.f100223a.m187466F3();
                }
            });
        }
        if (yuk0.m217435a(bLiveVideoChatM212308A)) {
            spuVar.f170109i = 0;
            int iM203452K5 = tbs.f172989b.m203452K5();
            nsh0.m164608j("videoChat", "calling  status start  looper: " + iM203452K5);
            spuVar.f170108h = spuVar.m113231o2(C22421c.interval((long) iM203452K5, TimeUnit.SECONDS), false).onBackpressureLatest().subscribe(dhw.m115825d(new y20() { // from class: l.gpu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f105623a.m187467G3((Long) obj);
                }
            }));
        }
        if (yuk0.m217441g(bLiveVideoChatM212308A)) {
            spuVar.m187475q3(bLiveVideoChatM212308A);
        }
        if (yuk0.m217439e(bLiveVideoChatM212308A)) {
            spuVar.reset();
            psd0.m173633z(spuVar.f170108h);
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m187475q3(BLiveVideoChat bLiveVideoChat) {
        if (m97931N2()) {
            if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userCancel.name())) {
                o1j0.m165651y("对方已取消");
                return;
            }
            if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userHangUp.name())) {
                o1j0.m165651y("对方已挂断");
                return;
            }
            if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userQuit.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.banUser.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userLost.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userPayTimeout.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userNotPay.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.userQuitMultiDevice.name())) {
                o1j0.m165651y("通话已中断");
                return;
            } else {
                if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.timeout.name())) {
                    o1j0.m165651y("未接听");
                    return;
                }
                return;
            }
        }
        if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorHangUp.name())) {
            o1j0.m165651y("对方已挂断");
        } else if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.banAnchor.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorLost.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorQuitMultiDevice.name())) {
            o1j0.m165651y("通话已中断");
        }
        boolean zIsFakeCall = m97926H2().m212353w().isFakeCall();
        String str = bLiveVideoChat.endType;
        if (zIsFakeCall) {
            if (TextUtils.equals(str, LongLinkVideoChat.VideoChat.EndType.timeout.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorReject.name()) || TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorQuit.name())) {
                o1j0.m165651y("通话失败，对方已离开");
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LongLinkVideoChat.VideoChat.EndType.timeout.name())) {
            o1j0.m165651y("暂时无人接听，请稍后再试");
        } else if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorReject.name())) {
            o1j0.m165651y("对方正在忙碌中，请稍后再试");
        } else if (TextUtils.equals(bLiveVideoChat.endType, LongLinkVideoChat.VideoChat.EndType.anchorQuit.name())) {
            o1j0.m165651y("通话已中断");
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m187476r3(String str) {
        m187474p3();
    }

    public void reset() {
        this.f170106f.m207801k();
        this.f170107g.m106540d();
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m187477s3(LongLinkVideoChat.LiveVideoChatToast liveVideoChatToast) {
        m97926H2().m212334a0(act(), liveVideoChatToast.getToast(), null);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m187478t3(BLiveVideoChat bLiveVideoChat) {
        m97926H2().m212341h0(bLiveVideoChat, true);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ void m187479u3(LongLinkVideoChat.LiveVideoChatCdnFail liveVideoChatCdnFail) {
        fhw.m125605a("videoChat", "receive cdn fail" + liveVideoChatCdnFail.getNewPushUrl());
        C12695b c12695bMo138017a = m97926H2().m212351u().m129895c().mo138017a();
        if (c12695bMo138017a instanceof ybl0) {
            ((ybl0) c12695bMo138017a).m215083v1(liveVideoChatCdnFail.getNewPushUrl());
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ Boolean m187480v3() {
        return Boolean.valueOf(m97926H2().m212308A() != null);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m187481w3() {
        m97929L2(true);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ Boolean m187482x3() {
        return Boolean.valueOf(m97926H2().m212308A() != null);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m187483y3() {
        m97929L2(true);
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m187484z3(BLiveVideoChat bLiveVideoChat) {
        m97926H2().m212341h0(bLiveVideoChat, false);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m187470K3(Throwable th) {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(spu spuVar) {
    }
}
