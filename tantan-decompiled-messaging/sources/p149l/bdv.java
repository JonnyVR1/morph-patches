package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class bdv extends h4t<ho2, hcv> {

    /* JADX INFO: renamed from: i */
    public Map<String, String> f75071i;

    /* JADX INFO: renamed from: j */
    public String f75072j;

    /* JADX INFO: renamed from: k */
    public wd4 f75073k;

    /* JADX INFO: renamed from: l */
    public String f75074l;

    /* JADX INFO: renamed from: m */
    public boolean f75075m;

    /* JADX INFO: renamed from: n */
    public View f75076n;

    public bdv(bsm bsmVar, View view) {
        super(bsmVar);
        this.f75071i = new HashMap();
        this.f75076n = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m101242A4(String str) {
        if (isShowing()) {
            ((hcv) this.viewModel).m130517x(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4, reason: merged with bridge method [inline-methods] */
    public void m101292x4(String str, CommonH5Builder.BgType bgType, boolean z, boolean z2, d30 d30Var) {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return;
        }
        ((hcv) this.viewModel).m130508F(str, z, z2, d30Var);
        if (this.f75075m) {
            ((hcv) this.viewModel).m130507E();
            this.f75075m = false;
        }
        ((hcv) this.viewModel).m130515p(bgType);
        m101244G4(str);
    }

    /* JADX INFO: renamed from: G4 */
    private void m101244G4(final String str) {
        this.f75072j = str;
        if (!(act() instanceof PutongAct) || this.f75071i.containsKey("H5-Authorization")) {
            ((hcv) this.viewModel).m130519z(str, this.f75071i);
        } else if (TextUtils.isEmpty(this.f75074l)) {
            duringCreated(ypv.f199493a.m199334a()).subscribe(ffw.m121194e(new e30() { // from class: l.ocv
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143127a.m101269y4(str, (AuthData) obj);
                }
            }, new e30() { // from class: l.pcv
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f148232a.m101270z4(str, (Throwable) obj);
                }
            }));
        } else {
            ((hcv) this.viewModel).m130518y(this.f75074l, str, this.f75071i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public void m101245H4(LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice) {
        if (this.f75073k == null || !((hcv) this.viewModel).m130516q(popUpContentUpdateNotice.getUrl())) {
            return;
        }
        this.f75073k.mo147900a(LongLinkGiftMessage.LiveCampaignInfo.newBuilder().setUpdateType(popUpContentUpdateNotice.getUpdateType()).setData(popUpContentUpdateNotice.getData()).build());
    }

    /* JADX INFO: renamed from: O1 */
    private void m101251O1() {
        m206028F2().FastRechargeEventGroup.showFastRechargeDialog().mo172463j(new nig.C18699a().m159507g(1).m159509i("js").m159510j("liveGiftH5Click").m159505e());
    }

    /* JADX INFO: renamed from: e4 */
    private boolean m101266e4(String str) {
        return str.startsWith("tantanapp://live/room/") || str.startsWith("tantanapp://voice-live/room/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public boolean m101267j4(u3g0 u3g0Var) {
        return !m206026D2() && u3g0Var.f173610b == ((hcv) this.viewModel).m130512l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ Boolean m101268u4(u3g0 u3g0Var) {
        return Boolean.valueOf(this.viewModel != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m101269y4(String str, AuthData authData) {
        String str2 = authData.accessToken;
        this.f75074l = str2;
        ((hcv) this.viewModel).m130518y(str2, str, this.f75071i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m101270z4(String str, Throwable th) {
        ((hcv) this.viewModel).m130518y("", str, this.f75071i);
        hfw.m130790a("[live]webDialog", "accessOutterToken" + th.getMessage());
    }

    /* JADX INFO: renamed from: B4 */
    public void m101271B4() {
        this.f75071i.clear();
        xdl0.m208344M(this.f75076n, false);
    }

    /* JADX INFO: renamed from: C4 */
    public void m101272C4() {
        xdl0.m208344M(this.f75076n, true);
    }

    /* JADX INFO: renamed from: D4 */
    public void m101273D4() {
        duringCreated(m206028F2().LiveBridgeImplEvent.closeLiveCampaignDialog().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.ycv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197491a.m101287r4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LiveBridgeImplEvent.showRechargeDialog().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.zcv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202589a.m101288s4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LiveBridgeImplEvent.jumpToRoom().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.adv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68969a.m101289t4((zhp0) obj);
            }
        }));
        duringCreated(m206028F2().LiveBridgeImplEvent.subscribeCampaign().m172460g()).filter(new w9j() { // from class: l.jcv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((u3g0) obj) != null);
            }
        }).filter(new w9j() { // from class: l.kcv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122513a.m101268u4((u3g0) obj);
            }
        }).filter(new w9j() { // from class: l.lcv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f127476a.m101267j4((u3g0) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.mcv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133188a.m101290v4((u3g0) obj);
            }
        }));
        duringCreated(((tpv) ypv.m215673l(fld0.f98149d)).m190062a()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.ncv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138231a.m101291w4((zhp0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    public void m101274F4(final String str, int[] iArr, boolean z, int i, final CommonH5Builder.BgType bgType, final boolean z2, final boolean z3, int i2, boolean z4, final d30 d30Var) {
        m101275d4();
        boolean zM81303a = NullChecker.m81303a(Uri.parse(str).getQueryParameter("_bid"));
        V v2 = this.viewModel;
        if (zM81303a) {
            ((hcv) v2).m130513m(true, str, bgType);
        } else {
            ((hcv) v2).m130513m(false, str, bgType);
        }
        if (iArr[0] == 0 || iArr[1] == 0) {
            e51.m114743H(act(), new Runnable() { // from class: l.xcv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f192274a.m101292x4(str, bgType, z2, z3, d30Var);
                }
            }, m206031K2().m182470m(LiveDialogEnum.WEBVIEW) ? 100L : 0L);
        } else {
            m101279i4(str, iArr, z, i, bgType, z2, z3, i2, z4, d30Var);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().OpenH5Event.open().m172460g()).filter(new w9j() { // from class: l.icv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112489a.m101281l4((jp50) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.scv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163777a.m101282m4((jp50) obj);
            }
        }));
        duringCreated(m206028F2().WebViewDialogEvent.dismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tcv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169478a.m101283n4((vkp0) obj);
            }
        }));
        duringCreated(m206028F2().GiftDialogEventGroup.openGiftDialogEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ucv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175866a.m101284o4((fp50) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public void m101275d4() {
        mo51532C(new hcv());
    }

    /* JADX INFO: renamed from: f4 */
    public void m101276f4(String str) {
        V v2;
        if (!TextUtils.equals(str, this.f75072j) || (v2 = this.viewModel) == 0) {
            return;
        }
        ((hcv) v2).m130511j();
    }

    /* JADX INFO: renamed from: g4 */
    public void m101277g4() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((hcv) v2).m130511j();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final String m101278h4(String str, jp50 jp50Var) {
        if (jp50Var.mo142569a() == 500) {
            this.f75075m = true;
            if ("vipCooperation".equals(jp50Var.m142572e())) {
                return jp50Var.m142581n() + "?watchLiveSeconds=" + m129297F3(new ee4(500)) + m129297F3(new ee4(500)) + "&id=" + jp50Var.m142574g();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: i4 */
    public final void m101279i4(final String str, final int[] iArr, final boolean z, final int i, final CommonH5Builder.BgType bgType, final boolean z2, final boolean z3, final int i2, final boolean z4, final d30 d30Var) {
        e51.m114748M(new Runnable() { // from class: l.qcv
            @Override // java.lang.Runnable
            public final void run() {
                this.f153822a.m101286q4(iArr, z, i, i2, z4, str, bgType, z2, z3, d30Var);
            }
        });
    }

    public boolean isShowing() {
        V v2 = this.viewModel;
        return v2 != 0 && ((hcv) v2).isShowing();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ho2] */
    /* JADX INFO: renamed from: k4 */
    public void m101280k4(String str, String str2, String str3) {
        if (m206032L2()) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f47165c7));
            return;
        }
        BLiveAbsRoom bLiveAbsRoomMo149817n = m206027E2().mo149817n();
        if (bLiveAbsRoomMo149817n != null && TextUtils.equals(bLiveAbsRoomMo149817n.f44324id, str2)) {
            lsi0.m151593w(R$string.f47139b3);
        } else {
            m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(m206027E2().mo132155o0()).m73029r(m206027E2().m149814k()).m73030s(m206027E2().mo149813j().room.f44419id).m73028q(m206027E2().m132146l0().name).m73033v(str).m73034w(str2).m73032u(str3).m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m101281l4(jp50 jp50Var) {
        return Boolean.valueOf(!m101266e4(jp50Var.m142581n()));
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m101282m4(jp50 jp50Var) {
        m101274F4(m101278h4(jp50Var.m142581n(), jp50Var), jp50Var.m142580m(), jp50Var.m142576i(), jp50Var.m142575h(), jp50Var.m142570b(), jp50Var.m142578k(), jp50Var.m142577j(), jp50Var.m142573f(), jp50Var.m142579l(), jp50Var.m142571d());
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f75073k = null;
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m101283n4(vkp0 vkp0Var) {
        m101276f4(vkp0Var.f181835c);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m101284o4(fp50 fp50Var) {
        m101277g4();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m101285p4(int[] iArr, boolean z, int i, int i2, boolean z2, String str, CommonH5Builder.BgType bgType, boolean z3, boolean z4, d30 d30Var) {
        ((hcv) this.viewModel).m130506B(iArr, z, i, i2, z2);
        m101292x4(str, bgType, z3, z4, d30Var);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m101286q4(final int[] iArr, final boolean z, final int i, final int i2, final boolean z2, final String str, final CommonH5Builder.BgType bgType, final boolean z3, final boolean z4, final d30 d30Var) {
        e51.m114743H(act(), new Runnable() { // from class: l.rcv
            @Override // java.lang.Runnable
            public final void run() {
                this.f158818a.m101285p4(iArr, z, i, i2, z2, str, bgType, z3, z4, d30Var);
            }
        }, m206031K2().m182470m(LiveDialogEnum.WEBVIEW) ? 100L : 0L);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m101287r4(soj0 soj0Var) {
        m101277g4();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m101288s4(soj0 soj0Var) {
        m101251O1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m101273D4();
        duringCreated(m206027E2().m132160q1().m189104g()).subscribe(ffw.m121193d(new e30() { // from class: l.vcv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180990a.m101245H4((LongLinkSocketMessage.PopUpContentUpdateNotice) obj);
            }
        }));
        duringCreated(m206028F2().LiveBridgeImplEvent.executeJs().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.wcv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185719a.m101242A4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m101289t4(zhp0 zhp0Var) {
        m101280k4(zhp0Var.f203202a, zhp0Var.f203203b, zhp0Var.f203204c);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m101290v4(u3g0 u3g0Var) {
        this.f75073k = u3g0Var.f173611c;
        boolean zM130516q = ((hcv) this.viewModel).m130516q(u3g0Var.f173609a);
        e30<Boolean> e30Var = u3g0Var.f173612d;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(zM130516q));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m101291w4(zhp0 zhp0Var) {
        m101280k4(zhp0Var.f203202a, zhp0Var.f203203b, zhp0Var.f203204c);
    }
}
