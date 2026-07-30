package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hfw;
import l.lsi0;
import l.s7m;
import l.vpv;
import l.xaj0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x8g extends lk2<k8g> {

    /* JADX INFO: renamed from: j */
    public final fdg f22167j;

    /* JADX INFO: renamed from: k */
    public kgg f22168k;

    public x8g(bsm<? extends ho2> bsmVar, lk2 lk2Var) {
        super(bsmVar);
        this.f22167j = new fdg(m25552L2());
        C(new k8g(lk2Var.act()));
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m25757r4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.w(R$string.f2642C);
        } else {
            lsi0.w(R$string.f2757H4);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m25760A4() {
        ((k8g) ((bwr) this).viewModel).m16546e(false, this.f22167j);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m25761B4(y8g y8gVar) {
        ((k8g) ((bwr) this).viewModel).m16548i(y8gVar, this.f22167j);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m25762C4(Integer num) {
        this.f22167j.m13131f(num.intValue());
        m25764E4();
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m25763D4(Boolean bool) {
        this.f22168k.m16617b().quickInvite.enable = true;
        m25764E4();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: E4 */
    public void m25764E4() {
        fdg.C0564a c0564aM13126a = this.f22167j.m13126a();
        if (!TextUtils.equals(c0564aM13126a.f10301b, "leaderboard_id_fans_recall")) {
            m25707N3(m17286Z3().m15694C(c0564aM13126a.f10301b)).doOnSubscribe(new d30() { // from class: l.s8g
                public final void call() {
                    this.f18837a.m25760A4();
                }
            }).subscribe(ffw.e(new e30() { // from class: l.t8g
                public final void call(Object obj) {
                    this.f20126a.m25761B4((y8g) obj);
                }
            }, new e30() { // from class: l.u8g
                public final void call(Object obj) {
                    hfw.a("lsy", "Fans club leader board error" + ((Throwable) obj).toString());
                }
            }));
        } else {
            xgg.m25928c(((DbObject) m25547E2().m14582l0()).id, m25547E2().m17235k());
            m25707N3(m17286Z3().m15712U()).doOnSubscribe(new d30() { // from class: l.p8g
                public final void call() {
                    this.f17060a.m25769y4();
                }
            }).subscribe(ffw.e(new e30() { // from class: l.q8g
                public final void call(Object obj) {
                    this.f17853a.m25770z4((kgg) obj);
                }
            }, new e30() { // from class: l.r8g
                public final void call(Object obj) {
                    hfw.a("lsy", "Fans club leader board error" + ((Throwable) obj).toString());
                }
            }));
        }
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        m25764E4();
        m25707N3(((ggv) ypv.l(fld0.c)).p()).subscribe(ffw.d(new e30() { // from class: l.l8g
            public final void call(Object obj) {
                this.f14734a.m25762C4((Integer) obj);
            }
        }));
        m25707N3((c) m25548F2().FansInvitationEvent.invitationResult().g()).subscribe(ffw.d(new e30() { // from class: l.o8g
            public final void call(Object obj) {
                this.f16436a.m25763D4((Boolean) obj);
            }
        }));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo9823R3() {
        super.mo9823R3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    @Override // p002l.lk2
    /* JADX INFO: renamed from: a4 */
    public xaj0<String, View, Integer> mo17287a4() {
        boolean zMo9893p = m25547E2().mo9893p();
        Act act = this.f22037f;
        return xaj0.a(zMo9893p ? act.getString(R$string.f2822K3) : act.getString(R$string.f2778I3), ((k8g) ((bwr) this).viewModel).m16544c(), Integer.valueOf(m25547E2().mo9893p() ? -1 : 1));
    }

    /* JADX INFO: renamed from: u4 */
    public void m25765u4() {
        m25707N3(LivingNormalApiProvider.m4883m4(ypv.a.D0())).subscribe(ffw.e(new e30() { // from class: l.v8g
            public final void call(Object obj) {
                this.f21032a.m25767w4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.w8g
            public final void call(Object obj) {
                lsi0.w(R$string.f3533r4);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: v4 */
    public void m25766v4(final String str) {
        User userNew_ = User.new_();
        ((DbObject) userNew_).id = str;
        vpv vpvVar = ypv.a;
        m25707N3(vpvVar.d(vpvVar.D0(), userNew_, true, "liveRoom", m25547E2().m17235k(), m25547E2().m17239o(), mo21430R2(), "fans_recall_panel")).subscribe(ffw.e(new e30() { // from class: l.m8g
            public final void call(Object obj) {
                this.f15278a.m25768x4(str, (Followship) obj);
            }
        }, new e30() { // from class: l.n8g
            public final void call(Object obj) {
                x8g.m25757r4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m25767w4(BLiveEnvelope bLiveEnvelope) {
        lsi0.w(R$string.f3577t4);
        this.f22168k.m16617b().quickInvite.enable = true;
        m25764E4();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m25768x4(String str, Followship followship) {
        lsi0.w(R$string.f3511q4);
        for (BFansRecallUser bFansRecallUser : this.f22168k.m16617b().users) {
            if (TextUtils.equals(bFansRecallUser.userId, str)) {
                bFansRecallUser.following = true;
                s7m s7mVar = ((bwr) this).viewModel;
                if (s7mVar != null) {
                    ((k8g) s7mVar).m16545d(bFansRecallUser);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m25769y4() {
        ((k8g) ((bwr) this).viewModel).m16546e(true, this.f22167j);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m25770z4(kgg kggVar) {
        this.f22168k = kggVar;
        ((k8g) ((bwr) this).viewModel).m16547f(this.f22167j, kggVar);
    }
}
