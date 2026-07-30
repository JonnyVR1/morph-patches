package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class z44 extends i6t<oo2, n44> {

    /* JADX INFO: renamed from: i */
    public BLiveCall f202898i;

    /* JADX INFO: renamed from: j */
    public n54 f202899j;

    public z44(dum dumVar, n54 n54Var) {
        super(dumVar);
        this.f202899j = n54Var;
        mo52715C(new n44());
    }

    /* JADX INFO: renamed from: S3 */
    public void mo95315S3() {
        ((n44) this.viewModel).m161533n();
    }

    /* JADX INFO: renamed from: T3 */
    public void m218534T3() {
        new th0.C20312a(act()).m191151j(mo95316U3()).m191157p(n9c0.f140855p0).m191158q(R$string.f48425v2).m191156o(new View.OnClickListener() { // from class: l.w44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187225a.m218536Y3(view);
            }
        }).m191145d(n9c0.f140804X0).m191146e(R$string.f47690N1).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: U3 */
    public String mo95316U3() {
        return this.f196919f.getString(R$string.f48095g1);
    }

    /* JADX INFO: renamed from: V3 */
    public void m218535V3(qvd qvdVar) {
        int i = qvdVar.f159736e;
        if (i != 2) {
            if (i == 3) {
                mo95315S3();
                this.f202898i = null;
                return;
            }
            return;
        }
        BLiveCall bLiveCall = qvdVar.f159735d;
        this.f202898i = bLiveCall;
        if (u54.m194528h(bLiveCall)) {
            mo95315S3();
        } else {
            ((n44) this.viewModel).m161527C(this.f202898i, this.f202899j.m161648Z3().m178270m().m143251k(this.f202898i.user));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m218536Y3(View view) {
        mo95315S3();
        this.f202899j.m161645W3(this.f202898i);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m218537Z3(List list) {
        this.f202899j.mo161660m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m218538a4(Throwable th) {
        this.f202899j.m161644V3(th);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m218539b4(List list) {
        this.f202899j.mo161660m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m218540c4(Throwable th) {
        this.f202899j.m161644V3(th);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m218541d4(u24 u24Var) {
        mo95318k4(u24Var.f177177a, u24Var.f177178b);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Boolean m218542e4(qvd qvdVar) {
        return ((n44) this.viewModel).m161535q();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m218543f4(qvd qvdVar) {
        return Boolean.valueOf(u54.m194530j(this.f202898i, qvdVar.f159735d));
    }

    /* JADX INFO: renamed from: g4 */
    public void m218544g4() {
        if (!this.f202898i.mutedByAnchor || m213815L2()) {
            if (this.f202898i.mutedByUser && m213815L2()) {
                return;
            }
            mo95315S3();
            boolean zM213815L2 = m213815L2();
            BLiveCall bLiveCall = this.f202898i;
            duringCreated(LivingNormalApiProvider.m72424H7(this.f202898i.f45190id, !(zM213815L2 ? bLiveCall.mutedByAnchor : bLiveCall.mutedByUser), m213815L2())).subscribe(dhw.m115826e(new y20() { // from class: l.u44
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177430a.m218537Z3((List) obj);
                }
            }, new y20() { // from class: l.v44
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182330a.m218538a4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m218545h4() {
        mo95315S3();
        h64 h64VarM143251k = this.f202899j.m161648Z3().m178270m().m143251k(this.f202898i.user);
        cqj.C16337a c16337a = new cqj.C16337a();
        BLiveCall bLiveCall = this.f202898i;
        m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(4400).m156158h(c16337a.m111927h(coj.m111661c(h64VarM143251k, p54.m170592b(bLiveCall.f45190id, "gift-audience-none-callaudience", bLiveCall.position))).m111923d()).m156160j("callVoiceVice"));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.oo2] */
    /* JADX INFO: renamed from: i4 */
    public void m218546i4() {
        mo95315S3();
        this.f202899j.m161648Z3().m178270m().m143251k(this.f202898i.user);
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(4400).userId(this.f202898i.user).setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, this.f202898i.user, 4400)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, this.f202898i.user, 4400)).setScene("call").setSource("live").giftSource("callVoiceVice").trackFrom("liveRoom").build());
    }

    /* JADX INFO: renamed from: k4 */
    public void mo95318k4(BLiveCall bLiveCall, h64 h64Var) {
        this.f202898i = bLiveCall;
        ((n44) this.viewModel).m161530G(bLiveCall, h64Var);
    }

    /* JADX INFO: renamed from: m4 */
    public void m218547m4(BLiveCall bLiveCall) {
        if (u54.m194527g(bLiveCall)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72523S7(bLiveCall.f45190id, m213815L2())).subscribe(dhw.m115826e(new y20() { // from class: l.x44
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192335a.m218539b4((List) obj);
            }
        }, new y20() { // from class: l.y44
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197410a.m218540c4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().CallEvent.personalManager().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.q44
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155518a.m218541d4((u24) obj);
            }
        }));
        duringCreated(this.f202899j.m161649a4()).filter(new qcj() { // from class: l.r44
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161140a.m218542e4((qvd) obj);
            }
        }).filter(new qcj() { // from class: l.s44
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166153a.m218543f4((qvd) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.t44
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171975a.m218535V3((qvd) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public void mo95317W3() {
    }

    /* JADX INFO: renamed from: X3 */
    public void mo188842X3() {
    }

    /* JADX INFO: renamed from: j4 */
    public void mo188843j4() {
    }

    /* JADX INFO: renamed from: l4 */
    public void mo188844l4() {
    }
}
