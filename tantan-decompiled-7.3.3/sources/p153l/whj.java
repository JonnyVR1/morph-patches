package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class whj extends i6t<oo2, uwi> implements c6m {
    public whj(dum dumVar) {
        super(dumVar);
        mjj.m158572a(zrv.f205799a.m207631D0());
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m206368J3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m206372N3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public final void m206376S3() {
        mjj.m158576e();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        mjj.m158574c();
        mjj.m158585n(false);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m206377T3(double d) {
        mjj.m158577f();
        mjj.m158578g(d);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m206378U3(woe0 woe0Var) {
        if (woe0Var == null || woe0Var.getSendGiftRequestInfo().f180057e == null) {
            return;
        }
        m206377T3(woe0Var.getSendGiftRequestInfo().f180057e.purchasePrice);
        m206376S3();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ Boolean m206379V3(LongLinkGiftMessage.LiveRankings liveRankings) {
        return Boolean.valueOf(liveRankings.getRoomId().equals(m213810E2().mo183440n().f45172id) && LongLinkGiftMessage.LiveRankingType.live.equals(liveRankings.getType()));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m206380W3(LongLinkGiftMessage.LiveRankings liveRankings) {
        m206382Y3(new dhg(liveRankings));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m206381X3(hcr hcrVar) {
        m206382Y3(new dhg(hcrVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Y3 */
    public final void m206382Y3(dhg dhgVar) {
        nsv nsvVar = (nsv) jyb.m147529r(dhgVar.m115797b(), new qcj() { // from class: l.vhj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(zrv.f205799a.m207631D0().equals(((w5g) ((nsv) obj).f143542a).f187506a));
            }
        });
        if (NullChecker.m82486a(nsvVar)) {
            String str = m213810E2().mo183440n().f45172id;
            String str2 = m213810E2().mo183435j().f45171id;
            T t = nsvVar.f143542a;
            mjj.m158579h(str, str2, ((w5g) t).f187508c, ((w5g) t).f187509d);
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        mjj.m158585n(true);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v17, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().SendGiftEventGroup.sendGiftSuccess().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ohj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147455a.m206378U3((woe0) obj);
            }
        }));
        duringCreated(m213811F2().ChatEvent.sendMessageResult().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.phj
            @Override // p153l.y20
            public final void call(Object obj) {
                mjj.m158581j();
            }
        }));
        duringCreated(m213810E2().m168545q1().m98266Z()).filter(new qcj() { // from class: l.qhj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157717a.m206379V3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.rhj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163178a.m206380W3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }, new y20() { // from class: l.shj
            @Override // p153l.y20
            public final void call(Object obj) {
                whj.m206368J3((Throwable) obj);
            }
        }));
        duringCreated(m213810E2().m168536m1()).subscribe(dhw.m115826e(new y20() { // from class: l.thj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174374a.m206381X3((hcr) obj);
            }
        }, new y20() { // from class: l.uhj
            @Override // p153l.y20
            public final void call(Object obj) {
                whj.m206372N3((Throwable) obj);
            }
        }));
    }
}
