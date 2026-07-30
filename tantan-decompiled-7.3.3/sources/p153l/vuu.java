package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class vuu extends ahu<guu> {

    /* JADX INFO: renamed from: f */
    public Map<String, String> f185855f;

    /* JADX INFO: renamed from: g */
    public ve4 f185856g;

    /* JADX INFO: renamed from: h */
    public String f185857h;

    /* JADX INFO: renamed from: i */
    public boolean f185858i;

    /* JADX INFO: renamed from: j */
    public final View f185859j;

    public vuu(knu knuVar, View view) {
        super(knuVar);
        this.f185855f = new HashMap();
        this.f185859j = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public void m202911k3(String str) {
        if (VoiceCallStatus.calling.equals(str)) {
            m202914B3();
            duringCreated(m97926H2().f195472c.m120391l().m98286g()).subscribe(dhw.m115825d(new y20() { // from class: l.tuu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176213a.m202918F3((LongLinkSocketMessage.PopUpContentUpdateNotice) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public boolean m202912n3(bcg0 bcg0Var) {
        return !m202919f3() && bcg0Var.f76143b == ((guu) this.viewModel).m132404l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public /* synthetic */ void m202913q3(vxj0 vxj0Var) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((guu) v2).m132403j();
        }
    }

    /* JADX INFO: renamed from: B3 */
    public void m202914B3() {
        duringCreated(m97928K2().LiveVChatBridgeImplEvent.m70369a().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.uuu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181093a.m202929t3((vxj0) obj);
            }
        }));
        duringCreated(m97928K2().LiveVChatBridgeImplEvent.m70371c().m199270g()).filter(new qcj() { // from class: l.iuu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((bcg0) obj) != null);
            }
        }).filter(new qcj() { // from class: l.juu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f122742a.m202930u3((bcg0) obj);
            }
        }).filter(new qcj() { // from class: l.kuu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f128923a.m202912n3((bcg0) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.luu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133657a.m202931v3((bcg0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C3 */
    public final void m202915C3(String str, CommonH5Builder.BgType bgType, boolean z, boolean z2, x20 x20Var) {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return;
        }
        ((guu) this.viewModel).m132400F(str, z, z2, x20Var);
        if (this.f185858i) {
            ((guu) this.viewModel).m132399E();
            this.f185858i = false;
        }
        ((guu) this.viewModel).m132407p(bgType);
        m202917E3(str);
    }

    /* JADX INFO: renamed from: D3 */
    public void m202916D3(String str, int[] iArr, boolean z, int i, CommonH5Builder.BgType bgType, boolean z2, boolean z3, int i2, x20 x20Var) {
        m202920g3();
        ((guu) this.viewModel).m132405m(NullChecker.m82486a(Uri.parse(str).getQueryParameter("_bid")), str, bgType);
        if (iArr[0] == 0 || iArr[1] == 0) {
            m202915C3(str, bgType, z2, z3, x20Var);
        } else {
            m202924m3(str, iArr, z, i, bgType, z2, z3, i2, x20Var);
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final void m202917E3(final String str) {
        if (!(act() instanceof PutongAct) || this.f185855f.containsKey("H5-Authorization")) {
            ((guu) this.viewModel).m132413z(str, this.f185855f);
        } else if (TextUtils.isEmpty(this.f185857h)) {
            duringCreated(zrv.f205799a.m207656a()).subscribe(dhw.m115826e(new y20() { // from class: l.ruu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164940a.m202932w3(str, (AuthData) obj);
                }
            }, new y20() { // from class: l.suu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f170762a.m202933x3(str, (Throwable) obj);
                }
            }));
        } else {
            ((guu) this.viewModel).m132412y(this.f185857h, str, this.f185855f);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m202918F3(LongLinkSocketMessage.PopUpContentUpdateNotice popUpContentUpdateNotice) {
        if (this.f185856g == null || !((guu) this.viewModel).m132408q(popUpContentUpdateNotice.getUrl())) {
            return;
        }
        this.f185856g.mo152372a(LongLinkGiftMessage.LiveCampaignInfo.newBuilder().setUpdateType(popUpContentUpdateNotice.getUpdateType()).setData(popUpContentUpdateNotice.getData()).build());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m97928K2().LiveVChatOpenH5Event.m70373b().m199270g()).filter(new qcj() { // from class: l.huu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111703a.m202925o3((ypu) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.muu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138843a.m202926p3((ypu) obj);
            }
        }));
        duringCreated(m97928K2().LiveVChatOpenH5Event.m70372a().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.nuu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143743a.m202913q3((vxj0) obj);
            }
        }));
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.ouu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149212a.m202911k3((String) obj);
            }
        }));
        duringCreated(m97928K2().LiveVChatBridgeImplEvent.m70370b().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.puu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154243a.m202927r3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m202919f3() {
        return act() == null || act().isDestroyed() || act().isFinishing();
    }

    /* JADX INFO: renamed from: g3 */
    public void m202920g3() {
        mo52715C(new guu());
    }

    /* JADX INFO: renamed from: h3 */
    public final boolean m202921h3(String str) {
        return str.startsWith("tantanapp://live/room/") || str.startsWith("tantanapp://voice-live/room/");
    }

    /* JADX INFO: renamed from: i3 */
    public void m202922i3() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((guu) v2).m132403j();
        }
    }

    public boolean isShowing() {
        V v2 = this.viewModel;
        return v2 != 0 && ((guu) v2).isShowing();
    }

    /* JADX INFO: renamed from: j3 */
    public final String m202923j3(String str, ypu ypuVar) {
        if (ypuVar.mo125930a() == 500) {
            this.f185858i = true;
            if ("vipCooperation".equals(ypuVar.m217036e())) {
                return ypuVar.m217044m() + "?watchLiveSeconds=" + m97933Q2(new df4(500)) + m97933Q2(new df4(500)) + "&id=" + ypuVar.m217038g();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m202924m3(final String str, final int[] iArr, final boolean z, final int i, final CommonH5Builder.BgType bgType, final boolean z2, final boolean z3, final int i2, final x20 x20Var) {
        l51.m152893M(new Runnable() { // from class: l.quu
            @Override // java.lang.Runnable
            public final void run() {
                this.f159635a.m202928s3(iArr, z, i, i2, str, bgType, z2, z3, x20Var);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f185856g = null;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Boolean m202925o3(ypu ypuVar) {
        return Boolean.valueOf(!m202921h3(ypuVar.m217044m()));
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m202926p3(ypu ypuVar) {
        m202916D3(m202923j3(ypuVar.m217044m(), ypuVar), ypuVar.m217043l(), ypuVar.m217040i(), ypuVar.m217039h(), ypuVar.m217034b(), ypuVar.m217042k(), ypuVar.m217041j(), ypuVar.m217037f(), ypuVar.m217035d());
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m202927r3(String str) {
        if (isShowing()) {
            ((guu) this.viewModel).m132411x(str);
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m202928s3(int[] iArr, boolean z, int i, int i2, String str, CommonH5Builder.BgType bgType, boolean z2, boolean z3, x20 x20Var) {
        ((guu) this.viewModel).m132397B(iArr, z, i, i2);
        m202915C3(str, bgType, z2, z3, x20Var);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m202929t3(vxj0 vxj0Var) {
        m202922i3();
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ Boolean m202930u3(bcg0 bcg0Var) {
        return Boolean.valueOf(this.viewModel != 0);
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m202931v3(bcg0 bcg0Var) {
        this.f185856g = bcg0Var.f76144c;
        boolean zM132408q = ((guu) this.viewModel).m132408q(bcg0Var.f76142a);
        y20<Boolean> y20Var = bcg0Var.f76145d;
        if (y20Var != null) {
            y20Var.call(Boolean.valueOf(zM132408q));
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m202932w3(String str, AuthData authData) {
        String str2 = authData.accessToken;
        this.f185857h = str2;
        ((guu) this.viewModel).m132412y(str2, str, this.f185855f);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m202933x3(String str, Throwable th) {
        ((guu) this.viewModel).m132412y("", str, this.f185855f);
        fhw.m125605a("[live]webDialog", "accessOutterToken" + th.getMessage());
    }

    /* JADX INFO: renamed from: y3 */
    public void m202934y3() {
        this.f185855f.clear();
        bnl0.m105524M(this.f185859j, false);
    }

    /* JADX INFO: renamed from: z3 */
    public void m202935z3() {
        bnl0.m105524M(this.f185859j, true);
    }
}
