package p002l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.bwr;
import l.d30;
import l.e30;
import l.e51;
import l.ffw;
import l.fld0;
import l.hfw;
import l.jo0;
import l.lsi0;
import l.s7m;
import l.soj0;
import l.tpv;
import l.u3g0;
import l.w9j;
import l.xdl0;
import l.ypv;
import l.zhp0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bdv extends h4t<ho2, hcv> {

    /* JADX INFO: renamed from: i */
    public Map<String, String> f8086i;

    /* JADX INFO: renamed from: j */
    public String f8087j;

    /* JADX INFO: renamed from: k */
    public wd4 f8088k;

    /* JADX INFO: renamed from: l */
    public String f8089l;

    /* JADX INFO: renamed from: m */
    public boolean f8090m;

    /* JADX INFO: renamed from: n */
    public View f8091n;

    public bdv(bsm bsmVar, View view) {
        super(bsmVar);
        this.f8086i = new HashMap();
        this.f8091n = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m10260A4(String str) {
        if (isShowing()) {
            ((hcv) ((bwr) this).viewModel).m14332x(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4, reason: merged with bridge method [inline-methods] */
    public void m10312x4(String str, CommonH5Builder.BgType bgType, boolean z, boolean z2, d30 d30Var) {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return;
        }
        ((hcv) ((bwr) this).viewModel).m14322F(str, z, z2, d30Var);
        if (this.f8090m) {
            ((hcv) ((bwr) this).viewModel).m14321E();
            this.f8090m = false;
        }
        ((hcv) ((bwr) this).viewModel).m14330p(bgType);
        m10262G4(str);
    }

    /* JADX INFO: renamed from: G4 */
    private void m10262G4(final String str) {
        this.f8087j = str;
        if (!(act() instanceof PutongAct) || this.f8086i.containsKey("H5-Authorization")) {
            ((hcv) ((bwr) this).viewModel).m14334z(str, this.f8086i);
        } else if (TextUtils.isEmpty(this.f8089l)) {
            duringCreated(ypv.a.a()).subscribe(ffw.e(new e30() { // from class: l.ocv
                public final void call(Object obj) {
                    this.f16530a.m10287y4(str, (AuthData) obj);
                }
            }, new e30() { // from class: l.pcv
                public final void call(Object obj) {
                    this.f17200a.m10288z4(str, (Throwable) obj);
                }
            }));
        } else {
            ((hcv) ((bwr) this).viewModel).m14333y(this.f8089l, str, this.f8086i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public void m10263H4(LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice) {
        if (this.f8088k == null || !((hcv) ((bwr) this).viewModel).m14331q(popUpContentUpdateNotice.getUrl())) {
            return;
        }
        this.f8088k.m24522a(LongLinkGiftMessage.LiveCampaignInfo.newBuilder().setUpdateType(popUpContentUpdateNotice.getUpdateType()).setData(popUpContentUpdateNotice.getData()).build());
    }

    /* JADX INFO: renamed from: O1 */
    private void m10269O1() {
        m25548F2().FastRechargeEventGroup.showFastRechargeDialog().j(new nig.C0701a().m18781g(1).m18783i("js").m18784j("liveGiftH5Click").m18779e());
    }

    /* JADX INFO: renamed from: e4 */
    private boolean m10284e4(String str) {
        return str.startsWith("tantanapp://live/room/") || str.startsWith("tantanapp://voice-live/room/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public boolean m10285j4(u3g0 u3g0Var) {
        return !m25546D2() && u3g0Var.b == ((hcv) ((bwr) this).viewModel).m14327l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ Boolean m10286u4(u3g0 u3g0Var) {
        return Boolean.valueOf(((bwr) this).viewModel != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m10287y4(String str, AuthData authData) {
        String str2 = authData.accessToken;
        this.f8089l = str2;
        ((hcv) ((bwr) this).viewModel).m14333y(str2, str, this.f8086i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m10288z4(String str, Throwable th) {
        ((hcv) ((bwr) this).viewModel).m14333y("", str, this.f8086i);
        hfw.a("[live]webDialog", "accessOutterToken" + th.getMessage());
    }

    /* JADX INFO: renamed from: B4 */
    public void m10289B4() {
        this.f8086i.clear();
        xdl0.M(this.f8091n, false);
    }

    /* JADX INFO: renamed from: C4 */
    public void m10290C4() {
        xdl0.M(this.f8091n, true);
    }

    /* JADX INFO: renamed from: D4 */
    public void m10291D4() {
        duringCreated((c) m25548F2().LiveBridgeImplEvent.closeLiveCampaignDialog().g()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.ycv
            public final void call(Object obj) {
                this.f22808a.m10306r4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveBridgeImplEvent.showRechargeDialog().g()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.zcv
            public final void call(Object obj) {
                this.f23346a.m10307s4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveBridgeImplEvent.jumpToRoom().g()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.adv
            public final void call(Object obj) {
                this.f7517a.m10309t4((zhp0) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveBridgeImplEvent.subscribeCampaign().g()).filter(new w9j() { // from class: l.jcv
            public final Object call(Object obj) {
                return Boolean.valueOf(((u3g0) obj) != null);
            }
        }).filter(new w9j() { // from class: l.kcv
            public final Object call(Object obj) {
                return this.f14282a.m10286u4((u3g0) obj);
            }
        }).filter(new w9j() { // from class: l.lcv
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f14770a.m10285j4((u3g0) obj));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.mcv
            public final void call(Object obj) {
                this.f15342a.m10310v4((u3g0) obj);
            }
        }));
        duringCreated(((tpv) ypv.l(fld0.d)).a()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.ncv
            public final void call(Object obj) {
                this.f15950a.m10311w4((zhp0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    public void m10292F4(final String str, int[] iArr, boolean z, int i, final CommonH5Builder.BgType bgType, final boolean z2, final boolean z3, int i2, boolean z4, final d30 d30Var) {
        m10294d4();
        boolean zA = NullChecker.a(Uri.parse(str).getQueryParameter("_bid"));
        s7m s7mVar = ((bwr) this).viewModel;
        if (zA) {
            ((hcv) s7mVar).m14328m(true, str, bgType);
        } else {
            ((hcv) s7mVar).m14328m(false, str, bgType);
        }
        if (iArr[0] == 0 || iArr[1] == 0) {
            e51.H(act(), new Runnable() { // from class: l.xcv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22230a.m10312x4(str, bgType, z2, z3, d30Var);
                }
            }, m25551K2().m22225m(LiveDialogEnum.WEBVIEW) ? 100L : 0L);
        } else {
            m10298i4(str, iArr, z, i, bgType, z2, z3, i2, z4, d30Var);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m10293T() {
        super.T();
        duringCreated((c) m25548F2().OpenH5Event.open().g()).filter(new w9j() { // from class: l.icv
            public final Object call(Object obj) {
                return this.f13151a.m10300l4((jp50) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.scv
            public final void call(Object obj) {
                this.f18928a.m10301m4((jp50) obj);
            }
        }));
        duringCreated((c) m25548F2().WebViewDialogEvent.dismiss().g()).subscribe(ffw.d(new e30() { // from class: l.tcv
            public final void call(Object obj) {
                this.f20186a.m10302n4((vkp0) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.openGiftDialogEvent().g()).subscribe(ffw.d(new e30() { // from class: l.ucv
            public final void call(Object obj) {
                this.f20590a.m10303o4((fp50) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public void m10294d4() {
        C(new hcv());
    }

    /* JADX INFO: renamed from: f4 */
    public void m10295f4(String str) {
        s7m s7mVar;
        if (!TextUtils.equals(str, this.f8087j) || (s7mVar = ((bwr) this).viewModel) == null) {
            return;
        }
        ((hcv) s7mVar).m14326j();
    }

    /* JADX INFO: renamed from: g4 */
    public void m10296g4() {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((hcv) s7mVar).m14326j();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final String m10297h4(String str, jp50 jp50Var) {
        if (jp50Var.mo16065a() == 500) {
            this.f8090m = true;
            if ("vipCooperation".equals(jp50Var.m16068e())) {
                return jp50Var.m16077n() + "?watchLiveSeconds=" + m14184F3(new ee4(500)) + m14184F3(new ee4(500)) + "&id=" + jp50Var.m16070g();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: i4 */
    public final void m10298i4(final String str, final int[] iArr, final boolean z, final int i, final CommonH5Builder.BgType bgType, final boolean z2, final boolean z3, final int i2, final boolean z4, final d30 d30Var) {
        e51.M(new Runnable() { // from class: l.qcv
            @Override // java.lang.Runnable
            public final void run() {
                this.f17909a.m10305q4(iArr, z, i, i2, z4, str, bgType, z2, z3, d30Var);
            }
        });
    }

    public boolean isShowing() {
        s7m s7mVar = ((bwr) this).viewModel;
        return s7mVar != null && ((hcv) s7mVar).isShowing();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ho2] */
    /* JADX INFO: renamed from: k4 */
    public void m10299k4(String str, String str2, String str3) {
        if (m25552L2()) {
            lsi0.y(ypv.e.getString(R$string.f3207c7));
            return;
        }
        BLiveAbsRoom bLiveAbsRoomM17238n = m25547E2().m17238n();
        if (bLiveAbsRoomM17238n != null && TextUtils.equals(bLiveAbsRoomM17238n.id, str2)) {
            lsi0.w(R$string.f3181b3);
        } else {
            m25548F2().JumpRoomEvent.jumpRoom().j(new JumpRoomData.C0350a().m6554t(m25547E2().mo14591o0()).m6552r(m25547E2().m17235k()).m6553s(m25547E2().m17234j().room.id).m6551q(m25547E2().m14582l0().name).m6556v(str).m6557w(str2).m6555u(str3).m6548n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m6547m());
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m10300l4(jp50 jp50Var) {
        return Boolean.valueOf(!m10284e4(jp50Var.m16077n()));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m10301m4(jp50 jp50Var) {
        m10292F4(m10297h4(jp50Var.m16077n(), jp50Var), jp50Var.m16076m(), jp50Var.m16072i(), jp50Var.m16071h(), jp50Var.m16066b(), jp50Var.m16074k(), jp50Var.m16073j(), jp50Var.m16069f(), jp50Var.m16075l(), jp50Var.m16067d());
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f8088k = null;
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m10302n4(vkp0 vkp0Var) {
        m10295f4(vkp0Var.f21198c);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m10303o4(fp50 fp50Var) {
        m10296g4();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m10304p4(int[] iArr, boolean z, int i, int i2, boolean z2, String str, CommonH5Builder.BgType bgType, boolean z3, boolean z4, d30 d30Var) {
        ((hcv) ((bwr) this).viewModel).m14319B(iArr, z, i, i2, z2);
        m10312x4(str, bgType, z3, z4, d30Var);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m10305q4(final int[] iArr, final boolean z, final int i, final int i2, final boolean z2, final String str, final CommonH5Builder.BgType bgType, final boolean z3, final boolean z4, final d30 d30Var) {
        e51.H(act(), new Runnable() { // from class: l.rcv
            @Override // java.lang.Runnable
            public final void run() {
                this.f18467a.m10304p4(iArr, z, i, i2, z2, str, bgType, z3, z4, d30Var);
            }
        }, m25551K2().m22225m(LiveDialogEnum.WEBVIEW) ? 100L : 0L);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m10306r4(soj0 soj0Var) {
        m10296g4();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m10307s4(soj0 soj0Var) {
        m10269O1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m10308t() {
        super.t();
        m10291D4();
        duringCreated(m25547E2().m14596q1().g()).subscribe(ffw.d(new e30() { // from class: l.vcv
            public final void call(Object obj) {
                this.f21075a.m10263H4((LongLinkSocketMessage.PopUpContentUpdateNotice) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveBridgeImplEvent.executeJs().g()).subscribe(ffw.h(new e30() { // from class: l.wcv
            public final void call(Object obj) {
                this.f21642a.m10260A4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m10309t4(zhp0 zhp0Var) {
        m10299k4(zhp0Var.a, zhp0Var.b, zhp0Var.c);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m10310v4(u3g0 u3g0Var) {
        this.f8088k = u3g0Var.c;
        boolean zM14331q = ((hcv) ((bwr) this).viewModel).m14331q(u3g0Var.a);
        e30 e30Var = u3g0Var.d;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(zM14331q));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m10311w4(zhp0 zhp0Var) {
        m10299k4(zhp0Var.a, zhp0Var.b, zhp0Var.c);
    }
}
