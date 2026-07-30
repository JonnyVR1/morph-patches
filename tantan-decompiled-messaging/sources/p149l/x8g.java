package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class x8g extends lk2<k8g> {

    /* JADX INFO: renamed from: j */
    public final fdg f191509j;

    /* JADX INFO: renamed from: k */
    public kgg f191510k;

    public x8g(bsm<? extends ho2> bsmVar, lk2 lk2Var) {
        super(bsmVar);
        this.f191509j = new fdg(m206032L2());
        mo51532C(new k8g(lk2Var.act()));
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m207380r4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.m151593w(R$string.f46600C);
        } else {
            lsi0.m151593w(R$string.f46715H4);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m207383A4() {
        ((k8g) this.viewModel).m144932e(false, this.f191509j);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m207384B4(y8g y8gVar) {
        ((k8g) this.viewModel).m144934i(y8gVar, this.f191509j);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m207385C4(Integer num) {
        this.f191509j.m120979f(num.intValue());
        m207387E4();
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m207386D4(Boolean bool) {
        this.f191510k.m145891b().quickInvite.enable = true;
        m207387E4();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: E4 */
    public void m207387E4() {
        fdg.C16810a c16810aM120974a = this.f191509j.m120974a();
        if (!TextUtils.equals(c16810aM120974a.f97039b, "leaderboard_id_fans_recall")) {
            m207199N3(m150132Z3().m140003C(c16810aM120974a.f97039b)).doOnSubscribe(new d30() { // from class: l.s8g
                @Override // p149l.d30
                public final void call() {
                    this.f163058a.m207383A4();
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.t8g
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f168915a.m207384B4((y8g) obj);
                }
            }, new e30() { // from class: l.u8g
                @Override // p149l.e30
                public final void call(Object obj) {
                    hfw.m130790a("lsy", "Fans club leader board error" + ((Throwable) obj).toString());
                }
            }));
        } else {
            xgg.m208675c(m206027E2().m132146l0().f56011id, m206027E2().m149814k());
            m207199N3(m150132Z3().m140021U()).doOnSubscribe(new d30() { // from class: l.p8g
                @Override // p149l.d30
                public final void call() {
                    this.f147598a.m207392y4();
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.q8g
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153191a.m207393z4((kgg) obj);
                }
            }, new e30() { // from class: l.r8g
                @Override // p149l.e30
                public final void call(Object obj) {
                    hfw.m130790a("lsy", "Fans club leader board error" + ((Throwable) obj).toString());
                }
            }));
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        m207387E4();
        m207199N3(((ggv) ypv.m215673l(fld0.f98148c)).m126030p()).subscribe(ffw.m121193d(new e30() { // from class: l.l8g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126826a.m207385C4((Integer) obj);
            }
        }));
        m207199N3(m206028F2().FansInvitationEvent.invitationResult().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.o8g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142628a.m207386D4((Boolean) obj);
            }
        }));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    @Override // p149l.lk2
    /* JADX INFO: renamed from: a4 */
    public xaj0<String, View, Integer> mo150133a4() {
        boolean zMo97490p = m206027E2().mo97490p();
        Act act = this.f188513f;
        return xaj0.m207578a(zMo97490p ? act.getString(R$string.f46780K3) : act.getString(R$string.f46736I3), ((k8g) this.viewModel).m144930c(), Integer.valueOf(m206027E2().mo97490p() ? -1 : 1));
    }

    /* JADX INFO: renamed from: u4 */
    public void m207388u4() {
        m207199N3(LivingNormalApiProvider.m71517m4(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.v8g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180491a.m207390w4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.w8g
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f47491r4);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: v4 */
    public void m207389v4(final String str) {
        User userNew_ = User.new_();
        userNew_.f56011id = str;
        vpv vpvVar = ypv.f199493a;
        m207199N3(vpvVar.m199340d(vpvVar.m199309D0(), userNew_, true, "liveRoom", m206027E2().m149814k(), m206027E2().m149818o(), mo77274R2(), "fans_recall_panel")).subscribe(ffw.m121194e(new e30() { // from class: l.m8g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132572a.m207391x4(str, (Followship) obj);
            }
        }, new e30() { // from class: l.n8g
            @Override // p149l.e30
            public final void call(Object obj) {
                x8g.m207380r4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m207390w4(BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f47535t4);
        this.f191510k.m145891b().quickInvite.enable = true;
        m207387E4();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m207391x4(String str, Followship followship) {
        lsi0.m151593w(R$string.f47469q4);
        for (BFansRecallUser bFansRecallUser : this.f191510k.m145891b().users) {
            if (TextUtils.equals(bFansRecallUser.userId, str)) {
                bFansRecallUser.following = true;
                V v2 = this.viewModel;
                if (v2 != 0) {
                    ((k8g) v2).m144931d(bFansRecallUser);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m207392y4() {
        ((k8g) this.viewModel).m144932e(true, this.f191509j);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m207393z4(kgg kggVar) {
        this.f191510k = kggVar;
        ((k8g) this.viewModel).m144933f(this.f191509j, kggVar);
    }
}
