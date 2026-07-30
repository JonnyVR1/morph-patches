package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class t5k extends x6s<nnn0, b6k> {

    /* JADX INFO: renamed from: j */
    public final jcn0 f167833j;

    public t5k(bsm<? extends nnn0> bsmVar, jcn0 jcn0Var) {
        super(bsmVar);
        mo51532C(new b6k(this));
        this.f167833j = jcn0Var;
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m187306U3(Throwable th) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m187310Y3(d30 d30Var, BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        if (bcn0.m101094c(bLiveVoiceGrabHatGame)) {
            d30Var.call();
        } else {
            lsi0.m151593w(R$string.f46606C5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m187315l4(Boolean bool) {
        m187321h4(bool.booleanValue(), new d30() { // from class: l.q5k
            @Override // p149l.d30
            public final void call() {
                this.f152780a.m187328q4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public void m187316p4(List<BLiveVoiceGrabHatCP> list) {
        ((b6k) this.viewModel).m71834E();
        ((b6k) this.viewModel).m100424R(list, this.f167833j.f117339i);
    }

    /* JADX INFO: renamed from: d4 */
    public void m187317d4() {
        new xh0.C21150a(act()).m208740s(w8u.m202217t(R$string.f47270h2)).m208730i(R$string.f47421o0).m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.r5k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157828a.m187323j4(view);
            }
        }).m208726e(R$string.f46842N1).m208729h(false).m208728g(false).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: e4 */
    public void m187318e4() {
        if (bcn0.m101093b(this.f167833j.f117339i)) {
            new xh0.C21150a(act()).m208740s(w8u.m202217t(R$string.f47074Y2)).m208730i(R$string.f47443p0).m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.p5k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147306a.m187324k4(view);
                }
            }).m208726e(R$string.f46842N1).m208729h(false).m208728g(false).m208722a().m208721g();
        } else {
            m187330s4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m187319f4(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        hfw.m130790a("voiceGrabHat", "closeGameSuccess,id=" + bLiveVoiceGrabHatGame.f44500id);
        this.f167833j.m140987N3(bLiveVoiceGrabHatGame);
        ((b6k) this.viewModel).mo71838p();
        w8n0.m202192f().m202200k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m187320g4() {
        duringCreated(acn0.m95823e(((nnn0) m206027E2()).m149814k(), m187322i4())).subscribe(ffw.m121194e(new e30() { // from class: l.s5k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162557a.m187319f4((BLiveVoiceGrabHatGame) obj);
            }
        }, new z2k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m187321h4(boolean z, final d30 d30Var) {
        if (z) {
            duringCreated(acn0.m95826h(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.g5k
                @Override // p149l.e30
                public final void call(Object obj) {
                    t5k.m187310Y3(d30Var, (BLiveVoiceGrabHatGame) obj);
                }
            }, new z2k()));
        } else {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final String m187322i4() {
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = this.f167833j.f117339i;
        return bLiveVoiceGrabHatGame == null ? "" : bLiveVoiceGrabHatGame.f44500id;
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m187323j4(View view) {
        m187320g4();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m187324k4(View view) {
        m187332u4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ Boolean m187325m4(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP) {
        return Boolean.valueOf(((b6k) this.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m187326n4(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP) {
        m187328q4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m187327o4(Integer num) {
        m187320g4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final void m187328q4() {
        duringCreated(acn0.m95825g(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.o5k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141915a.m187316p4((List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public void m187329r4(String str) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(7010).userId(str).setFromIdentity(bqq.m103387b(this, ((nnn0) m206027E2()).m132146l0().f56011id, str, 7010)).setTo(bqq.m103390e(this, ((nnn0) m206027E2()).m132146l0().f56011id, str, 7010)).setSource("grabHat").setScene("grabHat").trackFrom("grabHat").build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public void m187330s4() {
        zvf0.m220399u("e_audio_join_hat_game", "p_anchor_audio_room", vwb.m200311Y("live_id", ((nnn0) m206027E2()).m149814k()), vwb.m200311Y("anchor_id", ((nnn0) m206027E2()).m132146l0().f56011id));
        duringCreated(acn0.m95828j(((nnn0) m206027E2()).m149814k(), m187322i4())).subscribe(ffw.m121194e(new e30() { // from class: l.h5k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105952a.m187331t4((BLiveVoiceGrabHatGame) obj);
            }
        }, new z2k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().VoiceGrabHatEvent.openHatCpDialog(), new e30() { // from class: l.f5k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f95185a.m187315l4((Boolean) obj);
            }
        });
        duringCreated(((nnn0) m206027E2()).m132160q1().m189119l()).filter(new w9j() { // from class: l.k5k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f121209a.m187325m4((BLiveVoiceGrabHatCP) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.l5k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126183a.m187326n4((BLiveVoiceGrabHatCP) obj);
            }
        }));
        duringCreated(m206028F2().VoiceGameChangeEvent.stopVoiceGame().m172460g()).filter(new w9j() { // from class: l.m5k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 6);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.n5k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137216a.m187327o4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m187331t4(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        hfw.m130790a("voiceGrabHat", "startGrabSuccess,id=" + bLiveVoiceGrabHatGame.f44500id);
        ((b6k) this.viewModel).m100425S(bLiveVoiceGrabHatGame);
        this.f167833j.m140987N3(bLiveVoiceGrabHatGame);
        ((b6k) this.viewModel).mo71838p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m187332u4() {
        duringCreated(acn0.m95829k(((nnn0) m206027E2()).m149814k(), m187322i4())).subscribe(ffw.m121194e(new e30() { // from class: l.i5k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111596a.m187333v4((BLiveVoiceGrabHatGame) obj);
            }
        }, new e30() { // from class: l.j5k
            @Override // p149l.e30
            public final void call(Object obj) {
                t5k.m187306U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public void m187333v4(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        hfw.m130790a("voiceGrabHat", "stopGrabSuccess,id=" + bLiveVoiceGrabHatGame.f44500id);
        this.f167833j.m140987N3(bLiveVoiceGrabHatGame);
        ((b6k) this.viewModel).m100425S(bLiveVoiceGrabHatGame);
        ((b6k) this.viewModel).mo71838p();
    }
}
