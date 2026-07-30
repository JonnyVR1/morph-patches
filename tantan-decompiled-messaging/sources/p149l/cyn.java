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
import com.p046p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class cyn extends cts<fyn> {

    /* JADX INFO: renamed from: f */
    public boolean f83014f;

    /* JADX INFO: renamed from: g */
    public final uqd0 f83015g;

    /* JADX INFO: renamed from: h */
    public String f83016h;

    /* JADX INFO: renamed from: i */
    public boolean f83017i;

    /* JADX INFO: renamed from: j */
    public boolean f83018j;

    public cyn(mcr mcrVar, mss mssVar, VDraweeView vDraweeView, VText vText, View view) {
        super(mcrVar, mssVar);
        this.f83014f = false;
        this.f83015g = new uqd0("intl_live_square_start_live_" + l9s.m149093o0(), "");
        fyn fynVar = new fyn(vDraweeView, vText, view);
        this.viewModel = fynVar;
        mo51532C(fynVar);
    }

    /* JADX INFO: renamed from: a3 */
    private void m109365a3() {
        if (this.f83017i && this.f83018j && !this.f83014f) {
            m109378q3(lor.m150806k() && !"p_audio_explore_recommend".equals((String) m151646N2(new dts())));
        } else {
            if (TextUtils.isEmpty(this.f83016h)) {
                return;
            }
            C4348d.m20896l().m20900k(this.f83016h);
            this.f83016h = null;
        }
    }

    /* JADX INFO: renamed from: b3 */
    private BLiveBubbleConfig m109366b3() {
        BLiveBubbleConfig bLiveBubbleConfig;
        BLiveMonetizationConfig bLiveMonetizationConfigM159629k = ((nj3) s9s.m182763m(gld0.f103312b)).m159629k();
        if (bLiveMonetizationConfigM159629k == null || (bLiveBubbleConfig = (BLiveBubbleConfig) vwb.m200346r(bLiveMonetizationConfigM159629k.bubbleConfigs, new w9j() { // from class: l.sxn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveBubbleConfig) obj).type, "StartLiveBubble"));
            }
        })) == null || !m109375m3(bLiveBubbleConfig) || vwb.m200296J(bLiveBubbleConfig.bubbleTextList) || TextUtils.isEmpty(bLiveBubbleConfig.bubbleTextList.get(0))) {
            return null;
        }
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: c3 */
    private long[] m109367c3() {
        String str = this.f83015g.get();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ void m109368d3(BLiveSettings bLiveSettings) {
        m109379v3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m109369e3(NetworkInfo networkInfo) {
        duringCreated(s9s.f163228b.m121230k()).subscribe(ffw.m121197h(new e30() { // from class: l.rxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161489a.m109368d3((BLiveSettings) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public /* synthetic */ void m109370f3(Boolean bool) {
        m109379v3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public /* synthetic */ void m109371g3(Boolean bool) {
        ((fyn) this.viewModel).f99882d = bool.booleanValue();
        m109379v3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public /* synthetic */ void m109372h3(String str) {
        boolean z = x4u.m207029o(str) && !x4u.m207027m(str);
        m109385u3();
        ((fyn) this.viewModel).m123781d(z);
        if (z || TextUtils.isEmpty(this.f83016h)) {
            return;
        }
        C4348d.m20896l().m20900k(this.f83016h);
        this.f83016h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public /* synthetic */ void m109373i3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f83017i = !zBooleanValue;
        if (zBooleanValue) {
            return;
        }
        m109365a3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3 */
    public /* synthetic */ void m109374j3(String str) {
        this.f83014f = false;
    }

    /* JADX INFO: renamed from: m3 */
    private boolean m109375m3(BLiveBubbleConfig bLiveBubbleConfig) {
        long[] jArrM109367c3 = m109367c3();
        long j = jArrM109367c3[0];
        long j2 = jArrM109367c3[1];
        long j3 = jArrM109367c3[2];
        return lor.m150806k() && ((jArrM109367c3[2] > ((long) bLiveBubbleConfig.bubbleUserShowMaxCount) ? 1 : (jArrM109367c3[2] == ((long) bLiveBubbleConfig.bubbleUserShowMaxCount) ? 0 : -1)) < 0 && ((mqi0.m155943n() > jArrM109367c3[0] ? 1 : (mqi0.m155943n() == jArrM109367c3[0] ? 0 : -1)) != 0 || (jArrM109367c3[1] > ((long) bLiveBubbleConfig.bubbleEveryDayShowMaxCount) ? 1 : (jArrM109367c3[1] == ((long) bLiveBubbleConfig.bubbleEveryDayShowMaxCount) ? 0 : -1)) < 0)) && (((mqi0.m155944o() - (bLiveBubbleConfig.bubbleTimeInterval * 1000)) > jArrM109367c3[3] ? 1 : ((mqi0.m155944o() - (bLiveBubbleConfig.bubbleTimeInterval * 1000)) == jArrM109367c3[3] ? 0 : -1)) > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public void m109376o3(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig) {
        ((fyn) this.viewModel).m123782j(bLiveTapBarStartLiveConfig);
    }

    /* JADX INFO: renamed from: p3 */
    private void m109377p3() {
        long[] jArrM109367c3 = m109367c3();
        long jM155943n = mqi0.m155943n();
        long j = jArrM109367c3[0];
        uqd0 uqd0Var = this.f83015g;
        if (jM155943n != j) {
            uqd0Var.put(jM155943n + ":1:" + (jArrM109367c3[2] + 1) + ":" + mqi0.m155944o());
            return;
        }
        uqd0Var.put(jM155943n + ":" + (jArrM109367c3[1] + 1) + ":" + (jArrM109367c3[2] + 1) + ":" + mqi0.m155944o());
    }

    /* JADX INFO: renamed from: q3 */
    private void m109378q3(boolean z) {
        BLiveBubbleConfig bLiveBubbleConfigM109366b3;
        if (this.f83014f || !z || s2u.m182076h() || pgi0.m168730l().m168751x() || (bLiveBubbleConfigM109366b3 = m109366b3()) == null) {
            return;
        }
        this.f83014f = true;
        m109383s3();
        VText vText = new VText(getAct());
        int i = xdl0.f192403e;
        vText.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        vText.setText(bLiveBubbleConfigM109366b3.bubbleTextList.get(0));
        int i2 = t100.f167261j;
        vText.setPadding(i2, t100.m186890d(11.0f), i2, t100.m186890d(11.0f));
        vText.setTextColor(Color.parseColor("#" + bLiveBubbleConfigM109366b3.bubbleTextColor));
        C4345a c4345aM20875q = new C4345a(getAct()).m20877s(vText).m20864e(true).m20870k(Color.parseColor("#" + bLiveBubbleConfigM109366b3.bubbleStartColor), Color.parseColor("#" + bLiveBubbleConfigM109366b3.bubbleEndColor)).m20855J(14.0f).m20861b(((long) bLiveBubbleConfigM109366b3.bubbleDisappear) * 1000).m20869j(new C4345a.c() { // from class: l.ayn
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                this.f72299a.m109374j3(str);
            }
        }).m20863d(new C4345a.b() { // from class: l.byn
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
            /* JADX INFO: renamed from: a */
            public final void mo20885a(String str) {
                this.f77945a.m109380k3(str);
            }
        }).m20875q(C4345a.f15680N | C4345a.f15682P);
        if (((fyn) this.viewModel).f99886h instanceof VText) {
            c4345aM20875q.m20882x(t100.m186890d(6.0f));
            c4345aM20875q.m20873o(C4345a.f15682P, t100.m186890d(9.0f));
        } else {
            c4345aM20875q.m20873o(C4345a.f15682P, t100.m186890d(3.0f));
        }
        this.f83016h = C4348d.m20896l().m20908t(c4345aM20875q, ((fyn) this.viewModel).f99886h);
        m109377p3();
    }

    /* JADX INFO: renamed from: v3 */
    private void m109379v3() {
        String str = (String) m151646N2(new dts());
        ((fyn) this.viewModel).f99883e = lor.m150806k();
        boolean z = lor.m150806k() && !"p_audio_explore_recommend".equals(str);
        ((fyn) this.viewModel).m123784l(z);
        m109378q3(z);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((fyn) this.viewModel).m123785r();
        duringCreated(ConnectivityReceiver.m81290m()).filter(new w9j() { // from class: l.qxn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.txn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172515a.m109369e3((NetworkInfo) obj);
            }
        }));
        duringCreated(LiveAssertApi.getUserStartLiveObs()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.uxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178750a.m109370f3((Boolean) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(m151642F2().LiveHomeStartLiveEvent.showRedDot().m172460g());
        final fyn fynVar = (fyn) this.viewModel;
        Objects.requireNonNull(fynVar);
        c22306cDuringCreated.subscribe(ffw.m121197h(new e30() { // from class: l.vxn
            @Override // p149l.e30
            public final void call(Object obj) {
                fynVar.m123783k(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m151642F2().LiveHomeStartLiveEvent.startLiveSkinEvent().m172460g()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.wxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188497a.m109376o3((BLiveTapBarStartLiveConfig) obj);
            }
        }));
        duringCreated(pgi0.m168730l().m168752y()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.xxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194885a.m109371g3((Boolean) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.yxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200646a.m109372h3((String) obj);
            }
        }));
        duringCreated(s2u.m182077i()).subscribe(ffw.m121197h(new e30() { // from class: l.zxn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205473a.m109373i3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m109380k3(String str) {
        ptk.m171332h().m171334g(str);
        m109382r3();
    }

    /* JADX INFO: renamed from: n3 */
    public void m109381n3() {
        ((gl3) s9s.m182763m(gld0.f103315e)).m126746i(false);
        if (lor.m150802g()) {
            urm.m195083e().m195088j(getAct());
        } else {
            m2u.m152715l(getAct(), AnchorStartData.ANCHOR_SOURCE_P_LIVE);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public void m109382r3() {
        zvf0.m220396r("e_live_start_bubble", (String) m151646N2(new dts()));
    }

    /* JADX INFO: renamed from: s3 */
    public void m109383s3() {
        zvf0.m220402x("e_live_start_bubble", (String) m151646N2(new dts()));
    }

    /* JADX INFO: renamed from: t3 */
    public void m109384t3() {
        zvf0.m220396r("e_post_live", (String) m151646N2(new dts()));
    }

    /* JADX INFO: renamed from: u3 */
    public void m109385u3() {
        zvf0.m220402x("e_post_live", (String) m151646N2(new dts()));
    }
}
