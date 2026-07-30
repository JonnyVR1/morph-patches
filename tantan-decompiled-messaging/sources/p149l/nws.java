package p149l;

import android.graphics.Color;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveTapBarStartLiveConfig;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import com.p046p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class nws extends cts<qws> implements le50 {

    /* JADX INFO: renamed from: f */
    public final LiveSquareTopButtonLiveView f140967f;

    /* JADX INFO: renamed from: g */
    public boolean f140968g;

    /* JADX INFO: renamed from: h */
    public final uqd0 f140969h;

    /* JADX INFO: renamed from: i */
    public String f140970i;

    /* JADX INFO: renamed from: j */
    public boolean f140971j;

    public nws(mcr mcrVar, mss mssVar, LiveSquareTopButtonLiveView liveSquareTopButtonLiveView) {
        super(mcrVar, mssVar);
        this.f140968g = false;
        this.f140969h = new uqd0("live_square_start_live_" + l9s.m149093o0(), "");
        this.f140967f = liveSquareTopButtonLiveView;
        qws qwsVar = new qws(liveSquareTopButtonLiveView);
        this.viewModel = qwsVar;
        mo51532C(qwsVar);
        m144512z2(new yss(mcrVar, mssVar, liveSquareTopButtonLiveView.f45031a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public /* synthetic */ void m161899f3(Boolean bool) {
        ((qws) this.viewModel).f156768d = bool.booleanValue();
        m161901u3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public /* synthetic */ void m161900g3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f140971j = !zBooleanValue;
        if (zBooleanValue) {
            return;
        }
        m161902Z2();
    }

    /* JADX INFO: renamed from: u3 */
    private void m161901u3() {
        String str = (String) m151646N2(new dts());
        ((qws) this.viewModel).f156769e = lor.m150806k();
        boolean z = lor.m150806k() && !"p_audio_explore_recommend".equals(str);
        ((qws) this.viewModel).m176908l(z);
        m161915p3(z);
    }

    @Override // p149l.le50
    /* JADX INFO: renamed from: S */
    public void mo138652S(boolean z, String str) {
        m161919t3();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((qws) v2).m176903d(z);
        }
        if (!z && !TextUtils.isEmpty(this.f140970i)) {
            C4348d.m20896l().m20900k(this.f140970i);
            this.f140970i = null;
        }
        m161914o3("square-curated".equals(str));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((qws) this.viewModel).m176909r();
        duringCreated(ConnectivityReceiver.m81290m()).filter(new w9j() { // from class: l.bws
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ews
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93539a.m161906d3((NetworkInfo) obj);
            }
        }));
        duringCreated(LiveAssertApi.getUserStartLiveObs()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.fws
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99682a.m161907e3((Boolean) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(m151642F2().LiveHomeStartLiveEvent.showRedDot().m172460g());
        final qws qwsVar = (qws) this.viewModel;
        Objects.requireNonNull(qwsVar);
        c22306cDuringCreated.subscribe(ffw.m121197h(new e30() { // from class: l.gws
            @Override // p149l.e30
            public final void call(Object obj) {
                qwsVar.m176907k(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m151642F2().LiveHomeStartLiveEvent.startLiveSkinEvent().m172460g()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.hws
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109784a.m161912m3((BLiveTapBarStartLiveConfig) obj);
            }
        }));
        duringCreated(pgi0.m168730l().m168752y()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.iws
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115296a.m161899f3((Boolean) obj);
            }
        }));
        duringCreated(s2u.m182077i()).subscribe(ffw.m121197h(new e30() { // from class: l.jws
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120108a.m161900g3((Boolean) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomeMenuEvent.isLiveVideoStyle().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.kws
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125009a.m161914o3(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m161902Z2() {
        if (this.f140971j && !this.f140968g) {
            m161915p3(lor.m150806k() && !"p_audio_explore_recommend".equals((String) m151646N2(new dts())));
        } else {
            if (TextUtils.isEmpty(this.f140970i)) {
                return;
            }
            C4348d.m20896l().m20900k(this.f140970i);
            this.f140970i = null;
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final BLiveBubbleConfig m161903a3() {
        BLiveBubbleConfig bLiveBubbleConfig;
        BLiveMonetizationConfig bLiveMonetizationConfigM159629k = ((nj3) s9s.m182763m(gld0.f103312b)).m159629k();
        if (bLiveMonetizationConfigM159629k == null || (bLiveBubbleConfig = (BLiveBubbleConfig) vwb.m200346r(bLiveMonetizationConfigM159629k.bubbleConfigs, new w9j() { // from class: l.dws
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveBubbleConfig) obj).type, "StartLiveBubble"));
            }
        })) == null || !m161910j3(bLiveBubbleConfig) || vwb.m200296J(bLiveBubbleConfig.bubbleTextList) || TextUtils.isEmpty(bLiveBubbleConfig.bubbleTextList.get(0))) {
            return null;
        }
        return bLiveBubbleConfig;
    }

    @Override // p149l.le50
    /* JADX INFO: renamed from: b2 */
    public boolean mo138654b2(String str) {
        return x4u.m207028n(str);
    }

    /* JADX INFO: renamed from: b3 */
    public final long[] m161904b3() {
        String str = this.f140969h.get();
        if (TextUtils.isEmpty(str)) {
            return new long[]{0, 0, 0, 0};
        }
        try {
            String[] strArrSplit = str.split(":");
            return new long[]{Long.parseLong(strArrSplit[0]), Long.parseLong(strArrSplit[1]), Long.parseLong(strArrSplit[2]), Long.parseLong(strArrSplit[3])};
        } catch (Exception unused) {
            return new long[]{0, 0, 0, 0};
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m161905c3(BLiveSettings bLiveSettings) {
        m161901u3();
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m161906d3(NetworkInfo networkInfo) {
        duringCreated(s9s.f163228b.m121230k()).subscribe(ffw.m121197h(new e30() { // from class: l.lws
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130300a.m161905c3((BLiveSettings) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m161907e3(Boolean bool) {
        m161901u3();
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m161908h3(String str) {
        this.f140968g = false;
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m161909i3(String str) {
        ptk.m171332h().m171334g(str);
        m161916q3();
    }

    /* JADX INFO: renamed from: j3 */
    public final boolean m161910j3(BLiveBubbleConfig bLiveBubbleConfig) {
        long[] jArrM161904b3 = m161904b3();
        long j = jArrM161904b3[0];
        long j2 = jArrM161904b3[1];
        long j3 = jArrM161904b3[2];
        return lor.m150806k() && ((jArrM161904b3[2] > ((long) bLiveBubbleConfig.bubbleUserShowMaxCount) ? 1 : (jArrM161904b3[2] == ((long) bLiveBubbleConfig.bubbleUserShowMaxCount) ? 0 : -1)) < 0 && ((mqi0.m155943n() > jArrM161904b3[0] ? 1 : (mqi0.m155943n() == jArrM161904b3[0] ? 0 : -1)) != 0 || (jArrM161904b3[1] > ((long) bLiveBubbleConfig.bubbleEveryDayShowMaxCount) ? 1 : (jArrM161904b3[1] == ((long) bLiveBubbleConfig.bubbleEveryDayShowMaxCount) ? 0 : -1)) < 0)) && (((mqi0.m155944o() - (bLiveBubbleConfig.bubbleTimeInterval * 1000)) > jArrM161904b3[3] ? 1 : ((mqi0.m155944o() - (bLiveBubbleConfig.bubbleTimeInterval * 1000)) == jArrM161904b3[3] ? 0 : -1)) > 0);
    }

    /* JADX INFO: renamed from: k3 */
    public void m161911k3(View view) {
        ((gl3) s9s.m182763m(gld0.f103315e)).m126746i(false);
        m2u.m152715l(getAct(), AnchorStartData.ANCHOR_SOURCE_P_LIVE);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m161912m3(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig) {
        ((qws) this.viewModel).m176906j(bLiveTapBarStartLiveConfig);
    }

    /* JADX INFO: renamed from: n3 */
    public final void m161913n3() {
        long[] jArrM161904b3 = m161904b3();
        long jM155943n = mqi0.m155943n();
        long j = jArrM161904b3[0];
        uqd0 uqd0Var = this.f140969h;
        if (jM155943n != j) {
            uqd0Var.put(jM155943n + ":1:" + (jArrM161904b3[2] + 1) + ":" + mqi0.m155944o());
            return;
        }
        uqd0Var.put(jM155943n + ":" + (jArrM161904b3[1] + 1) + ":" + (jArrM161904b3[2] + 1) + ":" + mqi0.m155944o());
    }

    /* JADX INFO: renamed from: o3 */
    public void m161914o3(boolean z) {
        if (!l9s.m149076g().mo30742a().mo165314w()) {
            LiveSquareTopButtonLiveView liveSquareTopButtonLiveView = this.f140967f;
            if (z) {
                liveSquareTopButtonLiveView.f45031a.setActualImageResource(h3c0.f105685l0);
                this.f140967f.f45032b.setActualImageResource(h3c0.f105604D0);
                return;
            } else {
                liveSquareTopButtonLiveView.f45031a.setActualImageResource(h3c0.f105682k0);
                this.f140967f.f45032b.setActualImageResource(h3c0.f105601C0);
                return;
            }
        }
        xdl0.m208372e0(this.f140967f, t100.m186890d(4.0f));
        xdl0.m208359W(this.f140967f.f45031a, t100.m186890d(4.0f));
        LiveSquareTopButtonLiveView liveSquareTopButtonLiveView2 = this.f140967f;
        if (z) {
            liveSquareTopButtonLiveView2.f45031a.setImageResource(l9s.m149078h() ? h3c0.f105679j0 : h3c0.f105676i0);
            this.f140967f.f45032b.setImageResource(l9s.m149078h() ? h3c0.f105649Z : h3c0.f105647Y);
        } else {
            liveSquareTopButtonLiveView2.f45031a.setImageResource(l9s.m149078h() ? h3c0.f105673h0 : h3c0.f105670g0);
            this.f140967f.f45032b.setImageResource(l9s.m149078h() ? h3c0.f105645X : h3c0.f105643W);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final void m161915p3(boolean z) {
        BLiveBubbleConfig bLiveBubbleConfigM161903a3;
        if (this.f140968g || !z || s2u.m182076h() || pgi0.m168730l().m168751x() || (bLiveBubbleConfigM161903a3 = m161903a3()) == null) {
            return;
        }
        this.f140968g = true;
        m161917r3();
        VText vText = new VText(getAct());
        int i = xdl0.f192403e;
        vText.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        vText.setText(bLiveBubbleConfigM161903a3.bubbleTextList.get(0));
        int i2 = t100.f167261j;
        vText.setPadding(i2, t100.m186890d(11.0f), i2, t100.m186890d(11.0f));
        vText.setTextColor(Color.parseColor("#" + bLiveBubbleConfigM161903a3.bubbleTextColor));
        C4345a c4345aM20875q = new C4345a(getAct()).m20877s(vText).m20864e(true).m20870k(Color.parseColor("#" + bLiveBubbleConfigM161903a3.bubbleStartColor), Color.parseColor("#" + bLiveBubbleConfigM161903a3.bubbleEndColor)).m20855J(14.0f).m20861b(((long) bLiveBubbleConfigM161903a3.bubbleDisappear) * 1000).m20869j(new C4345a.c() { // from class: l.mws
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                this.f136086a.m161908h3(str);
            }
        }).m20863d(new C4345a.b() { // from class: l.cws
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
            /* JADX INFO: renamed from: a */
            public final void mo20885a(String str) {
                this.f82809a.m161909i3(str);
            }
        }).m20875q(C4345a.f15680N | C4345a.f15682P);
        if (((qws) this.viewModel).f156772h instanceof VText) {
            c4345aM20875q.m20882x(t100.m186890d(6.0f));
            c4345aM20875q.m20873o(C4345a.f15682P, t100.m186890d(9.0f));
        } else {
            c4345aM20875q.m20873o(C4345a.f15682P, t100.m186890d(3.0f));
        }
        this.f140970i = C4348d.m20896l().m20908t(c4345aM20875q, ((qws) this.viewModel).f156772h);
        m161913n3();
    }

    /* JADX INFO: renamed from: q3 */
    public void m161916q3() {
        zvf0.m220396r("e_live_start_bubble", (String) m151646N2(new dts()));
    }

    /* JADX INFO: renamed from: r3 */
    public void m161917r3() {
        zvf0.m220402x("e_live_start_bubble", (String) m151646N2(new dts()));
    }

    /* JADX INFO: renamed from: s3 */
    public void m161918s3() {
        zvf0.m220396r("e_post_live", (String) m151646N2(new dts()));
    }

    /* JADX INFO: renamed from: t3 */
    public void m161919t3() {
        zvf0.m220402x("e_post_live", (String) m151646N2(new dts()));
    }
}
