package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a44 extends h4t<ho2, o34> {

    /* JADX INFO: renamed from: i */
    public BLiveCall f67439i;

    /* JADX INFO: renamed from: j */
    public o44 f67440j;

    public a44(bsm bsmVar, o44 o44Var) {
        super(bsmVar);
        this.f67440j = o44Var;
        mo51532C(new o34());
    }

    /* JADX INFO: renamed from: S3 */
    public void mo94776S3() {
        ((o34) this.viewModel).m162402n();
    }

    /* JADX INFO: renamed from: T3 */
    public void m94777T3() {
        new xh0.C21150a(act()).m208731j(mo94778U3()).m208737p(h1c0.f105394p0).m208738q(R$string.f47577v2).m208736o(new View.OnClickListener() { // from class: l.x34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190861a.m94782Y3(view);
            }
        }).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: U3 */
    public String mo94778U3() {
        return this.f188513f.getString(R$string.f47247g1);
    }

    /* JADX INFO: renamed from: V3 */
    public void m94779V3(cud cudVar) {
        int i = cudVar.f82558e;
        if (i != 2) {
            if (i == 3) {
                mo94776S3();
                this.f67439i = null;
                return;
            }
            return;
        }
        BLiveCall bLiveCall = cudVar.f82557d;
        this.f67439i = bLiveCall;
        if (v44.m196940h(bLiveCall)) {
            mo94776S3();
        } else {
            ((o34) this.viewModel).m162396C(this.f67439i, this.f67440j.m162531Z3().m108760m().m133917k(this.f67439i.user));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m94782Y3(View view) {
        mo94776S3();
        this.f67440j.m162528W3(this.f67439i);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m94783Z3(List list) {
        this.f67440j.mo162543m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m94784a4(Throwable th) {
        this.f67440j.m162527V3(th);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m94785b4(List list) {
        this.f67440j.mo162543m4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m94786c4(Throwable th) {
        this.f67440j.m162527V3(th);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m94787d4(v14 v14Var) {
        mo94794k4(v14Var.f179195a, v14Var.f179196b);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Boolean m94788e4(cud cudVar) {
        return ((o34) this.viewModel).m162404q();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m94789f4(cud cudVar) {
        return Boolean.valueOf(v44.m196942j(this.f67439i, cudVar.f82557d));
    }

    /* JADX INFO: renamed from: g4 */
    public void m94790g4() {
        if (!this.f67439i.mutedByAnchor || m206032L2()) {
            if (this.f67439i.mutedByUser && m206032L2()) {
                return;
            }
            mo94776S3();
            boolean zM206032L2 = m206032L2();
            BLiveCall bLiveCall = this.f67439i;
            duringCreated(LivingNormalApiProvider.m71241H7(this.f67439i.f44342id, !(zM206032L2 ? bLiveCall.mutedByAnchor : bLiveCall.mutedByUser), m206032L2())).subscribe(ffw.m121194e(new e30() { // from class: l.v34
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f179621a.m94783Z3((List) obj);
                }
            }, new e30() { // from class: l.w34
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f184301a.m94784a4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m94791h4() {
        mo94776S3();
        i54 i54VarM133917k = this.f67440j.m162531Z3().m108760m().m133917k(this.f67439i.user);
        mnj.C18509a c18509a = new mnj.C18509a();
        BLiveCall bLiveCall = this.f67439i;
        m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(4400).m122564h(c18509a.m155527h(mlj.m155154c(i54VarM133917k, q44.m172922b(bLiveCall.f44342id, "gift-audience-none-callaudience", bLiveCall.position))).m155523d()).m122566j("callVoiceVice"));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.ho2] */
    /* JADX INFO: renamed from: i4 */
    public void m94792i4() {
        mo94776S3();
        this.f67440j.m162531Z3().m108760m().m133917k(this.f67439i.user);
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(4400).userId(this.f67439i.user).setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, this.f67439i.user, 4400)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, this.f67439i.user, 4400)).setScene("call").setSource("live").giftSource("callVoiceVice").trackFrom("liveRoom").build());
    }

    /* JADX INFO: renamed from: k4 */
    public void mo94794k4(BLiveCall bLiveCall, i54 i54Var) {
        this.f67439i = bLiveCall;
        ((o34) this.viewModel).m162399G(bLiveCall, i54Var);
    }

    /* JADX INFO: renamed from: m4 */
    public void m94796m4(BLiveCall bLiveCall) {
        if (v44.m196939g(bLiveCall)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71340S7(bLiveCall.f44342id, m206032L2())).subscribe(ffw.m121194e(new e30() { // from class: l.y34
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195754a.m94785b4((List) obj);
            }
        }, new e30() { // from class: l.z34
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201304a.m94786c4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().CallEvent.personalManager().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.r34
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157480a.m94787d4((v14) obj);
            }
        }));
        duringCreated(this.f67440j.m162532a4()).filter(new w9j() { // from class: l.s34
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f162041a.m94788e4((cud) obj);
            }
        }).filter(new w9j() { // from class: l.t34
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167590a.m94789f4((cud) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.u34
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173570a.m94779V3((cud) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public void mo94780W3() {
    }

    /* JADX INFO: renamed from: X3 */
    public void mo94781X3() {
    }

    /* JADX INFO: renamed from: j4 */
    public void mo94793j4() {
    }

    /* JADX INFO: renamed from: l4 */
    public void mo94795l4() {
    }
}
