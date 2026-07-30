package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class usu extends zeu<fsu> {

    /* JADX INFO: renamed from: f */
    public Map<String, String> f178199f;

    /* JADX INFO: renamed from: g */
    public wd4 f178200g;

    /* JADX INFO: renamed from: h */
    public String f178201h;

    /* JADX INFO: renamed from: i */
    public boolean f178202i;

    /* JADX INFO: renamed from: j */
    public final View f178203j;

    public usu(jlu jluVar, View view) {
        super(jluVar);
        this.f178199f = new HashMap();
        this.f178203j = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public void m195247k3(String str) {
        if (VoiceCallStatus.calling.equals(str)) {
            m195250B3();
            duringCreated(m218409H2().f186998c.m216979l().m189104g()).subscribe(ffw.m121193d(new e30() { // from class: l.ssu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f166248a.m195254F3((LongLinkSocketMessage.PopUpContentUpdateNotice) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public boolean m195248n3(u3g0 u3g0Var) {
        return !m195255f3() && u3g0Var.f173610b == ((fsu) this.viewModel).m122974l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public /* synthetic */ void m195249q3(soj0 soj0Var) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((fsu) v2).m122973j();
        }
    }

    /* JADX INFO: renamed from: B3 */
    public void m195250B3() {
        duringCreated(m218411K2().LiveVChatBridgeImplEvent.m69186a().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.tsu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171965a.m195265t3((soj0) obj);
            }
        }));
        duringCreated(m218411K2().LiveVChatBridgeImplEvent.m69188c().m172460g()).filter(new w9j() { // from class: l.hsu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((u3g0) obj) != null);
            }
        }).filter(new w9j() { // from class: l.isu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f114804a.m195266u3((u3g0) obj);
            }
        }).filter(new w9j() { // from class: l.jsu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f119543a.m195248n3((u3g0) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ksu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124506a.m195267v3((u3g0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C3 */
    public final void m195251C3(String str, CommonH5Builder.BgType bgType, boolean z, boolean z2, d30 d30Var) {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return;
        }
        ((fsu) this.viewModel).m122970F(str, z, z2, d30Var);
        if (this.f178202i) {
            ((fsu) this.viewModel).m122969E();
            this.f178202i = false;
        }
        ((fsu) this.viewModel).m122977p(bgType);
        m195253E3(str);
    }

    /* JADX INFO: renamed from: D3 */
    public void m195252D3(String str, int[] iArr, boolean z, int i, CommonH5Builder.BgType bgType, boolean z2, boolean z3, int i2, d30 d30Var) {
        m195256g3();
        ((fsu) this.viewModel).m122975m(NullChecker.m81303a(Uri.parse(str).getQueryParameter("_bid")), str, bgType);
        if (iArr[0] == 0 || iArr[1] == 0) {
            m195251C3(str, bgType, z2, z3, d30Var);
        } else {
            m195260m3(str, iArr, z, i, bgType, z2, z3, i2, d30Var);
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final void m195253E3(final String str) {
        if (!(act() instanceof PutongAct) || this.f178199f.containsKey("H5-Authorization")) {
            ((fsu) this.viewModel).m122983z(str, this.f178199f);
        } else if (TextUtils.isEmpty(this.f178201h)) {
            duringCreated(ypv.f199493a.m199334a()).subscribe(ffw.m121194e(new e30() { // from class: l.qsu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f156274a.m195268w3(str, (AuthData) obj);
                }
            }, new e30() { // from class: l.rsu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160896a.m195269x3(str, (Throwable) obj);
                }
            }));
        } else {
            ((fsu) this.viewModel).m122982y(this.f178201h, str, this.f178199f);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m195254F3(LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice) {
        if (this.f178200g == null || !((fsu) this.viewModel).m122978q(popUpContentUpdateNotice.getUrl())) {
            return;
        }
        this.f178200g.mo147900a(LongLinkGiftMessage.LiveCampaignInfo.newBuilder().setUpdateType(popUpContentUpdateNotice.getUpdateType()).setData(popUpContentUpdateNotice.getData()).build());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m218411K2().LiveVChatOpenH5Event.m69190b().m172460g()).filter(new w9j() { // from class: l.gsu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f104212a.m195261o3((xnu) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.lsu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129895a.m195262p3((xnu) obj);
            }
        }));
        duringCreated(m218411K2().LiveVChatOpenH5Event.m69189a().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.msu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135535a.m195249q3((soj0) obj);
            }
        }));
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.nsu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140297a.m195247k3((String) obj);
            }
        }));
        duringCreated(m218411K2().LiveVChatBridgeImplEvent.m69187b().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.osu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145513a.m195263r3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m195255f3() {
        return act() == null || act().isDestroyed() || act().isFinishing();
    }

    /* JADX INFO: renamed from: g3 */
    public void m195256g3() {
        mo51532C(new fsu());
    }

    /* JADX INFO: renamed from: h3 */
    public final boolean m195257h3(String str) {
        return str.startsWith("tantanapp://live/room/") || str.startsWith("tantanapp://voice-live/room/");
    }

    /* JADX INFO: renamed from: i3 */
    public void m195258i3() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((fsu) v2).m122973j();
        }
    }

    public boolean isShowing() {
        V v2 = this.viewModel;
        return v2 != 0 && ((fsu) v2).isShowing();
    }

    /* JADX INFO: renamed from: j3 */
    public final String m195259j3(String str, xnu xnuVar) {
        if (xnuVar.mo142569a() == 500) {
            this.f178202i = true;
            if ("vipCooperation".equals(xnuVar.m210214e())) {
                return xnuVar.m210222m() + "?watchLiveSeconds=" + m218416Q2(new ee4(500)) + m218416Q2(new ee4(500)) + "&id=" + xnuVar.m210216g();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m195260m3(final String str, final int[] iArr, final boolean z, final int i, final CommonH5Builder.BgType bgType, final boolean z2, final boolean z3, final int i2, final d30 d30Var) {
        e51.m114748M(new Runnable() { // from class: l.psu
            @Override // java.lang.Runnable
            public final void run() {
                this.f151055a.m195264s3(iArr, z, i, i2, str, bgType, z2, z3, d30Var);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f178200g = null;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Boolean m195261o3(xnu xnuVar) {
        return Boolean.valueOf(!m195257h3(xnuVar.m210222m()));
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m195262p3(xnu xnuVar) {
        m195252D3(m195259j3(xnuVar.m210222m(), xnuVar), xnuVar.m210221l(), xnuVar.m210218i(), xnuVar.m210217h(), xnuVar.m210212b(), xnuVar.m210220k(), xnuVar.m210219j(), xnuVar.m210215f(), xnuVar.m210213d());
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m195263r3(String str) {
        if (isShowing()) {
            ((fsu) this.viewModel).m122981x(str);
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m195264s3(int[] iArr, boolean z, int i, int i2, String str, CommonH5Builder.BgType bgType, boolean z2, boolean z3, d30 d30Var) {
        ((fsu) this.viewModel).m122967B(iArr, z, i, i2);
        m195251C3(str, bgType, z2, z3, d30Var);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m195265t3(soj0 soj0Var) {
        m195258i3();
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ Boolean m195266u3(u3g0 u3g0Var) {
        return Boolean.valueOf(this.viewModel != 0);
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m195267v3(u3g0 u3g0Var) {
        this.f178200g = u3g0Var.f173611c;
        boolean zM122978q = ((fsu) this.viewModel).m122978q(u3g0Var.f173609a);
        e30<Boolean> e30Var = u3g0Var.f173612d;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(zM122978q));
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m195268w3(String str, AuthData authData) {
        String str2 = authData.accessToken;
        this.f178201h = str2;
        ((fsu) this.viewModel).m122982y(str2, str, this.f178199f);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m195269x3(String str, Throwable th) {
        ((fsu) this.viewModel).m122982y("", str, this.f178199f);
        hfw.m130790a("[live]webDialog", "accessOutterToken" + th.getMessage());
    }

    /* JADX INFO: renamed from: y3 */
    public void m195270y3() {
        this.f178199f.clear();
        xdl0.m208344M(this.f178203j, false);
    }

    /* JADX INFO: renamed from: z3 */
    public void m195271z3() {
        xdl0.m208344M(this.f178203j, true);
    }
}
