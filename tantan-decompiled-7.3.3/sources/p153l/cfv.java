package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cfv extends i6t<oo2, iev> {

    /* JADX INFO: renamed from: i */
    public Map<String, String> f81582i;

    /* JADX INFO: renamed from: j */
    public String f81583j;

    /* JADX INFO: renamed from: k */
    public ve4 f81584k;

    /* JADX INFO: renamed from: l */
    public String f81585l;

    /* JADX INFO: renamed from: m */
    public boolean f81586m;

    /* JADX INFO: renamed from: n */
    public View f81587n;

    public cfv(dum dumVar, View view) {
        super(dumVar);
        this.f81582i = new HashMap();
        this.f81587n = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m109605A4(String str) {
        if (isShowing()) {
            ((iev) this.viewModel).m139672x(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4, reason: merged with bridge method [inline-methods] */
    public void m109655x4(String str, CommonH5Builder.BgType bgType, boolean z, boolean z2, x20 x20Var) {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return;
        }
        ((iev) this.viewModel).m139663F(str, z, z2, x20Var);
        if (this.f81586m) {
            ((iev) this.viewModel).m139662E();
            this.f81586m = false;
        }
        ((iev) this.viewModel).m139670p(bgType);
        m109607G4(str);
    }

    /* JADX INFO: renamed from: G4 */
    private void m109607G4(final String str) {
        this.f81583j = str;
        if (!(act() instanceof PutongAct) || this.f81582i.containsKey("H5-Authorization")) {
            ((iev) this.viewModel).m139674z(str, this.f81582i);
        } else if (TextUtils.isEmpty(this.f81585l)) {
            duringCreated(zrv.f205799a.m207656a()).subscribe(dhw.m115826e(new y20() { // from class: l.pev
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f152126a.m109632y4(str, (AuthData) obj);
                }
            }, new y20() { // from class: l.qev
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f157216a.m109633z4(str, (Throwable) obj);
                }
            }));
        } else {
            ((iev) this.viewModel).m139673y(this.f81585l, str, this.f81582i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public void m109608H4(LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice) {
        if (this.f81584k == null || !((iev) this.viewModel).m139671q(popUpContentUpdateNotice.getUrl())) {
            return;
        }
        this.f81584k.mo152372a(LongLinkGiftMessage.LiveCampaignInfo.newBuilder().setUpdateType(popUpContentUpdateNotice.getUpdateType()).setData(popUpContentUpdateNotice.getData()).build());
    }

    /* JADX INFO: renamed from: O1 */
    private void m109614O1() {
        m213811F2().FastRechargeEventGroup.showFastRechargeDialog().mo199273j(new bkg.C16028a().m104805g(1).m104807i("js").m104808j("liveGiftH5Click").m104803e());
    }

    /* JADX INFO: renamed from: e4 */
    private boolean m109629e4(String str) {
        return str.startsWith("tantanapp://live/room/") || str.startsWith("tantanapp://voice-live/room/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public boolean m109630j4(bcg0 bcg0Var) {
        return !m213809D2() && bcg0Var.f76143b == ((iev) this.viewModel).m139667l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ Boolean m109631u4(bcg0 bcg0Var) {
        return Boolean.valueOf(this.viewModel != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m109632y4(String str, AuthData authData) {
        String str2 = authData.accessToken;
        this.f81585l = str2;
        ((iev) this.viewModel).m139673y(str2, str, this.f81582i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m109633z4(String str, Throwable th) {
        ((iev) this.viewModel).m139673y("", str, this.f81582i);
        fhw.m125605a("[live]webDialog", "accessOutterToken" + th.getMessage());
    }

    /* JADX INFO: renamed from: B4 */
    public void m109634B4() {
        this.f81582i.clear();
        bnl0.m105524M(this.f81587n, false);
    }

    /* JADX INFO: renamed from: C4 */
    public void m109635C4() {
        bnl0.m105524M(this.f81587n, true);
    }

    /* JADX INFO: renamed from: D4 */
    public void m109636D4() {
        duringCreated(m213811F2().LiveBridgeImplEvent.closeLiveCampaignDialog().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.zev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204083a.m109650r4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LiveBridgeImplEvent.showRechargeDialog().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.afv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71067a.m109651s4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LiveBridgeImplEvent.jumpToRoom().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.bfv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76540a.m109652t4((crp0) obj);
            }
        }));
        duringCreated(m213811F2().LiveBridgeImplEvent.subscribeCampaign().m199270g()).filter(new qcj() { // from class: l.kev
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((bcg0) obj) != null);
            }
        }).filter(new qcj() { // from class: l.lev
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131789a.m109631u4((bcg0) obj);
            }
        }).filter(new qcj() { // from class: l.mev
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f136571a.m109630j4((bcg0) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.nev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141687a.m109653v4((bcg0) obj);
            }
        }));
        duringCreated(((urv) zrv.m221194l(htd0.f111522d)).m197665a()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.oev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147016a.m109654w4((crp0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    public void m109637F4(final String str, int[] iArr, boolean z, int i, final CommonH5Builder.BgType bgType, final boolean z2, final boolean z3, int i2, boolean z4, final x20 x20Var) {
        m109638d4();
        boolean zM82486a = NullChecker.m82486a(Uri.parse(str).getQueryParameter("_bid"));
        V v2 = this.viewModel;
        if (zM82486a) {
            ((iev) v2).m139668m(true, str, bgType);
        } else {
            ((iev) v2).m139668m(false, str, bgType);
        }
        if (iArr[0] == 0 || iArr[1] == 0) {
            l51.m152888H(act(), new Runnable() { // from class: l.yev
                @Override // java.lang.Runnable
                public final void run() {
                    this.f199415a.m109655x4(str, bgType, z2, z3, x20Var);
                }
            }, m213814K2().m189706m(LiveDialogEnum.WEBVIEW) ? 100L : 0L);
        } else {
            m109642i4(str, iArr, z, i, bgType, z2, z3, i2, z4, x20Var);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().OpenH5Event.open().m199270g()).filter(new qcj() { // from class: l.jev
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f120526a.m109644l4((px50) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.tev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173897a.m109645m4((px50) obj);
            }
        }));
        duringCreated(m213811F2().WebViewDialogEvent.dismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.uev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178693a.m109646n4((ztp0) obj);
            }
        }));
        duringCreated(m213811F2().GiftDialogEventGroup.openGiftDialogEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.vev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183851a.m109647o4((lx50) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public void m109638d4() {
        mo52715C(new iev());
    }

    /* JADX INFO: renamed from: f4 */
    public void m109639f4(String str) {
        V v2;
        if (!TextUtils.equals(str, this.f81583j) || (v2 = this.viewModel) == 0) {
            return;
        }
        ((iev) v2).m139666j();
    }

    /* JADX INFO: renamed from: g4 */
    public void m109640g4() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((iev) v2).m139666j();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final String m109641h4(String str, px50 px50Var) {
        if (px50Var.mo125930a() == 500) {
            this.f81586m = true;
            if ("vipCooperation".equals(px50Var.m174115e())) {
                return px50Var.m174124n() + "?watchLiveSeconds=" + m138856F3(new df4(500)) + m138856F3(new df4(500)) + "&id=" + px50Var.m174117g();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: i4 */
    public final void m109642i4(final String str, final int[] iArr, final boolean z, final int i, final CommonH5Builder.BgType bgType, final boolean z2, final boolean z3, final int i2, final boolean z4, final x20 x20Var) {
        l51.m152893M(new Runnable() { // from class: l.rev
            @Override // java.lang.Runnable
            public final void run() {
                this.f162691a.m109649q4(iArr, z, i, i2, z4, str, bgType, z2, z3, x20Var);
            }
        });
    }

    public boolean isShowing() {
        V v2 = this.viewModel;
        return v2 != 0 && ((iev) v2).isShowing();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.oo2] */
    /* JADX INFO: renamed from: k4 */
    public void m109643k4(String str, String str2, String str3) {
        if (m213815L2()) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f48013c7));
            return;
        }
        BLiveAbsRoom bLiveAbsRoomMo183440n = m213810E2().mo183440n();
        if (bLiveAbsRoomMo183440n != null && TextUtils.equals(bLiveAbsRoomMo183440n.f45172id, str2)) {
            o1j0.m165649w(R$string.f47987b3);
        } else {
            m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(m213810E2().mo160117o0()).m74212r(m213810E2().m202191k()).m74213s(m213810E2().mo183435j().room.f45267id).m74211q(m213810E2().m168532l0().name).m74216v(str).m74217w(str2).m74215u(str3).m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m109644l4(px50 px50Var) {
        return Boolean.valueOf(!m109629e4(px50Var.m174124n()));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m109645m4(px50 px50Var) {
        m109637F4(m109641h4(px50Var.m174124n(), px50Var), px50Var.m174123m(), px50Var.m174119i(), px50Var.m174118h(), px50Var.m174113b(), px50Var.m174121k(), px50Var.m174120j(), px50Var.m174116f(), px50Var.m174122l(), px50Var.m174114d());
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f81584k = null;
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m109646n4(ztp0 ztp0Var) {
        m109639f4(ztp0Var.f206033c);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m109647o4(lx50 lx50Var) {
        m109640g4();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m109648p4(int[] iArr, boolean z, int i, int i2, boolean z2, String str, CommonH5Builder.BgType bgType, boolean z3, boolean z4, x20 x20Var) {
        ((iev) this.viewModel).m139661B(iArr, z, i, i2, z2);
        m109655x4(str, bgType, z3, z4, x20Var);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m109649q4(final int[] iArr, final boolean z, final int i, final int i2, final boolean z2, final String str, final CommonH5Builder.BgType bgType, final boolean z3, final boolean z4, final x20 x20Var) {
        l51.m152888H(act(), new Runnable() { // from class: l.sev
            @Override // java.lang.Runnable
            public final void run() {
                this.f167647a.m109648p4(iArr, z, i, i2, z2, str, bgType, z3, z4, x20Var);
            }
        }, m213814K2().m189706m(LiveDialogEnum.WEBVIEW) ? 100L : 0L);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m109650r4(vxj0 vxj0Var) {
        m109640g4();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m109651s4(vxj0 vxj0Var) {
        m109614O1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m109636D4();
        duringCreated(m213810E2().m168545q1().m98286g()).subscribe(dhw.m115825d(new y20() { // from class: l.wev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188725a.m109608H4((LongLinkSocketMessage.PopUpContentUpdateNotice) obj);
            }
        }));
        duringCreated(m213811F2().LiveBridgeImplEvent.executeJs().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.xev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193980a.m109605A4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m109652t4(crp0 crp0Var) {
        m109643k4(crp0Var.f83350a, crp0Var.f83351b, crp0Var.f83352c);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m109653v4(bcg0 bcg0Var) {
        this.f81584k = bcg0Var.f76144c;
        boolean zM139671q = ((iev) this.viewModel).m139671q(bcg0Var.f76142a);
        y20<Boolean> y20Var = bcg0Var.f76145d;
        if (y20Var != null) {
            y20Var.call(Boolean.valueOf(zM139671q));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m109654w4(crp0 crp0Var) {
        m109643k4(crp0Var.f83350a, crp0Var.f83351b, crp0Var.f83352c);
    }
}
