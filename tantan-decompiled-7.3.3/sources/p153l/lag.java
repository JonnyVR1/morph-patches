package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class lag extends tk2<y9g> {

    /* JADX INFO: renamed from: j */
    public final teg f130691j;

    /* JADX INFO: renamed from: k */
    public yhg f130692k;

    public lag(dum<? extends oo2> dumVar, tk2 tk2Var) {
        super(dumVar);
        this.f130691j = new teg(m213815L2());
        mo52715C(new y9g(tk2Var.act()));
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m153484r4(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            o1j0.m165649w(R$string.f47448C);
        } else {
            o1j0.m165649w(R$string.f47563H4);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m153487A4() {
        ((y9g) this.viewModel).m214824e(false, this.f130691j);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m153488B4(mag magVar) {
        ((y9g) this.viewModel).m214826i(magVar, this.f130691j);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m153489C4(Integer num) {
        this.f130691j.m190699f(num.intValue());
        m153491E4();
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m153490D4(Boolean bool) {
        this.f130692k.m215960b().quickInvite.enable = true;
        m153491E4();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: E4 */
    public void m153491E4() {
        teg.C20297a c20297aM190694a = this.f130691j.m190694a();
        if (!TextUtils.equals(c20297aM190694a.f173813b, "leaderboard_id_fans_recall")) {
            m214779N3(m191481Z3().m209608C(c20297aM190694a.f173813b)).doOnSubscribe(new x20() { // from class: l.gag
                @Override // p153l.x20
                public final void call() {
                    this.f102982a.m153487A4();
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.hag
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f108495a.m153488B4((mag) obj);
                }
            }, new y20() { // from class: l.iag
                @Override // p153l.y20
                public final void call(Object obj) {
                    fhw.m125605a("lsy", "Fans club leader board error" + ((Throwable) obj).toString());
                }
            }));
        } else {
            lig.m154373c(m213810E2().m168532l0().f56859id, m213810E2().m202191k());
            m214779N3(m191481Z3().m209626U()).doOnSubscribe(new x20() { // from class: l.dag
                @Override // p153l.x20
                public final void call() {
                    this.f85871a.m153497y4();
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.eag
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f92782a.m153498z4((yhg) obj);
                }
            }, new y20() { // from class: l.fag
                @Override // p153l.y20
                public final void call(Object obj) {
                    fhw.m125605a("lsy", "Fans club leader board error" + ((Throwable) obj).toString());
                }
            }));
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        m153491E4();
        m214779N3(((hiv) zrv.m221194l(htd0.f111521c)).m135164p()).subscribe(dhw.m115825d(new y20() { // from class: l.z9g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203480a.m153489C4((Integer) obj);
            }
        }));
        m214779N3(m213811F2().FansInvitationEvent.invitationResult().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.cag
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80587a.m153490D4((Boolean) obj);
            }
        }));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    @Override // p153l.tk2
    /* JADX INFO: renamed from: a4 */
    public bkj0<String, View, Integer> mo153492a4() {
        boolean zMo118373p = m213810E2().mo118373p();
        Act act = this.f196919f;
        return bkj0.m104818a(zMo118373p ? act.getString(R$string.f47628K3) : act.getString(R$string.f47584I3), ((y9g) this.viewModel).m214822c(), Integer.valueOf(m213810E2().mo118373p() ? -1 : 1));
    }

    /* JADX INFO: renamed from: u4 */
    public void m153493u4() {
        m214779N3(LivingNormalApiProvider.m72700m4(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.jag
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118980a.m153495w4((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.kag
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f48339r4);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: v4 */
    public void m153494v4(final String str) {
        User userNew_ = User.new_();
        userNew_.f56859id = str;
        wrv wrvVar = zrv.f205799a;
        m214779N3(wrvVar.m207662d(wrvVar.m207631D0(), userNew_, true, "liveRoom", m213810E2().m202191k(), m213810E2().m202194o(), mo78457R2(), "fans_recall_panel")).subscribe(dhw.m115826e(new y20() { // from class: l.aag
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69139a.m153496x4(str, (Followship) obj);
            }
        }, new y20() { // from class: l.bag
            @Override // p153l.y20
            public final void call(Object obj) {
                lag.m153484r4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m153495w4(BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f48383t4);
        this.f130692k.m215960b().quickInvite.enable = true;
        m153491E4();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m153496x4(String str, Followship followship) {
        o1j0.m165649w(R$string.f48317q4);
        for (BFansRecallUser bFansRecallUser : this.f130692k.m215960b().users) {
            if (TextUtils.equals(bFansRecallUser.userId, str)) {
                bFansRecallUser.following = true;
                V v2 = this.viewModel;
                if (v2 != 0) {
                    ((y9g) v2).m214823d(bFansRecallUser);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m153497y4() {
        ((y9g) this.viewModel).m214824e(true, this.f130691j);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m153498z4(yhg yhgVar) {
        this.f130692k = yhgVar;
        ((y9g) this.viewModel).m214825f(this.f130691j, yhgVar);
    }
}
