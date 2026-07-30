package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.view.VoiceVirtualLovePlanetWidgetView;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Pair;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class ndp0 extends i6t<rwn0, VoiceVirtualLovePlanetWidgetView> implements hfw.InterfaceC17449a, oam {

    /* JADX INFO: renamed from: i */
    public hfw f141522i;

    /* JADX INFO: renamed from: j */
    public BLiveLovePlanetPlayerInfo f141523j;

    public ndp0(dum dumVar) {
        super(dumVar);
        hfw hfwVar = new hfw();
        this.f141522i = hfwVar;
        hfwVar.m134860H(this);
        m153103z2(new thn0(dumVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public void m162730A4(BLiveLovePlanet bLiveLovePlanet) {
        if (bLiveLovePlanet == null) {
            return;
        }
        mo134879a2(bLiveLovePlanet.host);
        mo134878W0(bLiveLovePlanet.mvp);
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78385E0(bLiveLovePlanet);
        m162758H4();
        m162755E4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I4 */
    public void m162731I4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        jyb.m147537z(((rwn0) m213810E2()).m183411P2().m136877p(), new y20() { // from class: l.ycp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198533a.m162773p4(bLiveCallVolume, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m162745X3(BLiveLovePlanet bLiveLovePlanet) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public Pair<int[], Integer> m162751f4(nfn0 nfn0Var) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.f141523j;
        if (bLiveLovePlanetPlayerInfo != null && TextUtils.equals(bLiveLovePlanetPlayerInfo.userId, nfn0Var.f141748d)) {
            return new Pair<>(i0k.m137975b(((VoiceVirtualLovePlanetWidgetView) this.viewModel).f53435g), Integer.valueOf(((VoiceVirtualLovePlanetWidgetView) this.viewModel).f53435g.getWidth()));
        }
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewMo78367f0 = ((w2m) ((VoiceVirtualLovePlanetWidgetView) this.viewModel).f53451w.getChildAt(0)).mo78367f0(nfn0Var.f141748d);
        return voiceVirtualLoveItemInfoViewMo78367f0 != null ? new Pair<>(i0k.m137975b(voiceVirtualLoveItemInfoViewMo78367f0.f53381i), Integer.valueOf(voiceVirtualLoveItemInfoViewMo78367f0.f53381i.getWidth())) : new Pair<>(new int[2], 0);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m162752B4() {
        int i;
        BLiveLovePlanet bLiveLovePlanetM134868q = this.f141522i.m134868q();
        if (bLiveLovePlanetM134868q == null || bLiveLovePlanetM134868q.host == null) {
            i = obc0.f146041G3;
        } else {
            i = (TextUtils.equals(bLiveLovePlanetM134868q.host.userId, zrv.f205799a.m207631D0()) && this.f141522i.m134876y()) ? obc0.f146029F3 : obc0.f146041G3;
        }
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78383B0(i);
    }

    /* JADX INFO: renamed from: C4 */
    public final void m162753C4(String str) {
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78384D0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D4 */
    public void m162754D4() {
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78396v0(ifw.m139751b(this.f141522i.m134868q(), ((rwn0) m213810E2()).m183423Y2(), this.f141522i.m134858F()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public void m162755E4() {
        final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo;
        BLiveVoiceTagBubble bLiveVoiceTagBubble;
        if (m213815L2() || (bLiveVoiceRoomTagInfo = ((rwn0) m213810E2()).m183409O2().mo122891j().voiceRoomTagInfo) == null || (bLiveVoiceTagBubble = bLiveVoiceRoomTagInfo.bubble) == null) {
            return;
        }
        final String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, SayHiBubbleView.getGreetedToUserId())) {
            return;
        }
        SayHiBubbleView.setGreetedToUserId(str);
        l51.m152888H(act(), new Runnable() { // from class: l.wcp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f188488a.m162766j4(str, bLiveVoiceRoomTagInfo);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m162756F4() {
        px50.C19461a c19461a = new px50.C19461a(9000);
        c19461a.m174141B(efv.f93833L);
        c19461a.m174152z(1.0d, 0.6d);
        c19461a.m174145s(24);
        c19461a.m174146t(80);
        m213811F2().OpenH5Event.open().mo199273j(c19461a.m174143q());
    }

    /* JADX INFO: renamed from: G4 */
    public final void m162757G4() {
        View viewInflate = this.f196919f.inflater().inflate(yec0.f199002Za, (ViewGroup) null);
        int i = bnl0.f77545f;
        final PopupWindow popupWindow = new PopupWindow(viewInflate, i, i, true);
        bnl0.m105509E0(viewInflate.findViewById(mdc0.f136195h7), new View.OnClickListener() { // from class: l.zcp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203816a.m162772o4(popupWindow, view);
            }
        });
        bnl0.m105509E0(viewInflate.findViewById(mdc0.f136205i7), new View.OnClickListener() { // from class: l.adp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70720a.m162769l4(popupWindow, view);
            }
        });
        bnl0.m105509E0(viewInflate.findViewById(mdc0.f136215j7), new View.OnClickListener() { // from class: l.bdp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76284a.m162770m4(popupWindow, view);
            }
        });
        popupWindow.showAsDropDown(((VoiceVirtualLovePlanetWidgetView) this.viewModel).f53450v, 0, qa00.f156322i);
    }

    /* JADX INFO: renamed from: H4 */
    public final void m162758H4() {
        m162752B4();
        m162754D4();
        m162753C4(this.f141522i.m134869r());
    }

    @Override // p153l.oam
    /* JADX INFO: renamed from: I0 */
    public void mo162759I0(String str, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        this.f141522i.m134862J(str, bLiveAvatarFrameConfig);
    }

    @Override // p153l.hfw.InterfaceC17449a
    /* JADX INFO: renamed from: W0 */
    public void mo134878W0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78399z0(bLiveLovePlanetPlayerInfo);
    }

    @Override // p153l.hfw.InterfaceC17449a
    /* JADX INFO: renamed from: a2 */
    public void mo134879a2(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        this.f141523j = bLiveLovePlanetPlayerInfo;
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78398y0(bLiveLovePlanetPlayerInfo);
        m162754D4();
        m162752B4();
    }

    @Override // p153l.hfw.InterfaceC17449a
    /* JADX INFO: renamed from: c */
    public void mo134880c() {
        duringCreated(m162762e4()).subscribe(dhw.m115829h(new hdp0(this)));
    }

    /* JADX INFO: renamed from: d4 */
    public void m162761d4(boolean z) {
        bzm0 bzm0Var = new bzm0();
        bzm0Var.m107185f(z);
        m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(bzm0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public C22421c<BLiveLovePlanet> m162762e4() {
        return VirtualVoiceRoomApiProvider.getLovePlanetInfo(((rwn0) m213810E2()).m202194o()).doOnNext(new y20() { // from class: l.mdp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136401a.m162764h4((BLiveLovePlanet) obj);
            }
        }).doOnError(new y20() { // from class: l.ucp0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).toString();
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m162763g4(BLiveVoiceCall bLiveVoiceCall) {
        m162754D4();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m162764h4(BLiveLovePlanet bLiveLovePlanet) {
        this.f141522i.m134859G(bLiveLovePlanet);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m162765i4(View view) {
        m162761d4(true);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m162766j4(String str, BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM134870s = this.f141522i.m134870s();
        if (bLiveLovePlanetPlayerInfoM134870s == null || !TextUtils.equals(bLiveLovePlanetPlayerInfoM134870s.userId, str)) {
            ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78387H0(bLiveVoiceRoomTagInfo.bubble);
        } else {
            ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78386G0(bLiveVoiceRoomTagInfo.bubble);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m162768k4(View view) {
        m162781x4("reset");
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m162769l4(PopupWindow popupWindow, View view) {
        new th0.C20312a(act()).m191147f("取消").m191159r("重置游戏").m191151j("重置游戏后，将回到游戏准备阶段，且不会清空嘉宾位。确认重置？").m191156o(new View.OnClickListener() { // from class: l.cdp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f81257a.m162768k4(view2);
            }
        }).m191142a().m191141g();
        popupWindow.dismiss();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m162770m4(PopupWindow popupWindow, View view) {
        m162756F4();
        popupWindow.dismiss();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        SVGALoader.clear();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m162771n4(View view) {
        m162781x4("stop");
    }

    @Override // p153l.hfw.InterfaceC17449a
    /* JADX INFO: renamed from: o0 */
    public void mo134881o0(BLiveLovePlanet bLiveLovePlanet) {
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78385E0(bLiveLovePlanet);
        m162754D4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m162772o4(PopupWindow popupWindow, View view) {
        new th0.C20312a(act()).m191147f("取消").m191159r("终止游戏").m191151j("终止游戏后，将回到游戏准备阶段，并清空嘉宾位。确认终止？").m191156o(new View.OnClickListener() { // from class: l.ddp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f87956a.m162771n4(view2);
            }
        }).m191142a().m191141g();
        popupWindow.dismiss();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m162773p4(BLiveCallVolume bLiveCallVolume, BLiveVoiceCall bLiveVoiceCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveVoiceCall.volume) {
            bLiveVoiceCall.isSpeak = false;
            bLiveVoiceCall.volume = 0.0f;
        } else {
            bLiveVoiceCall.isSpeak = true;
            bLiveVoiceCall.volume = f.floatValue();
        }
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m78397w0(bLiveVoiceCall, this.f141522i);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m162774q4(LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
        this.f141522i.m134873v(voiceLiveLovePlanetUpdate);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ C22421c m162775r4(C4470c c4470c) {
        return m162762e4();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ Boolean m162776s4(u35 u35Var) {
        u35Var.f177284c = this.f141522i.m134875x(u35Var.f177285d);
        return Boolean.valueOf(this.f141522i.m134868q() == null || this.f141522i.m134869r().equals("prepare") || this.f141522i.m134869r().equals("unknown_"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98273b1()).subscribe(dhw.m115829h(new y20() { // from class: l.tcp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173268a.m162774q4((LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183424Z2()).subscribe(dhw.m115829h(new y20() { // from class: l.edp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93568a.m162763g4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(m213811F2().CallEvent.memberVolume().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.fdp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98490a.m162731I4((BLiveCallVolume) obj);
            }
        }));
        m138853C3(new pcj() { // from class: l.gdp0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f103731a.m162762e4();
            }
        }, new hdp0(this));
        duringCreated(lifecycle().filter(new qcj() { // from class: l.idp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        })).flatMap(new qcj() { // from class: l.jdp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f120287a.m162775r4((C4470c) obj);
            }
        }).subscribe(dhw.m115829h(new hdp0(this)));
        m138860d3(u35.class, new qcj() { // from class: l.kdp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f125273a.m162776s4((u35) obj);
            }
        });
        m138860d3(nfn0.class, new qcj() { // from class: l.ldp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131661a.m162751f4((nfn0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public void m162777t4() {
        BLiveLovePlanet bLiveLovePlanetM134868q = this.f141522i.m134868q();
        String strM207631D0 = zrv.f205799a.m207631D0();
        if (bLiveLovePlanetM134868q == null || bLiveLovePlanetM134868q.host == null) {
            if (guk0.m132326e(((rwn0) m213810E2()).m183423Y2())) {
                return;
            }
            m162761d4(false);
            return;
        }
        String string = bLiveLovePlanetM134868q.stage.toString();
        if (TextUtils.equals(bLiveLovePlanetM134868q.host.userId, strM207631D0)) {
            duringCreated(VirtualVoiceRoomApiProvider.changeStage(((rwn0) m213810E2()).m202194o(), bLiveLovePlanetM134868q.f45243id, string)).subscribe(dhw.m115826e(new y20() { // from class: l.vcp0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ndp0.m162745X3((BLiveLovePlanet) obj);
                }
            }, new z2e0()));
        } else {
            if (guk0.m132326e(((rwn0) m213810E2()).m183423Y2())) {
                return;
            }
            m162761d4(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m162778u4(String str) {
        if (((rwn0) m213810E2()).m168532l0() == null) {
            return;
        }
        ydn0.m215258k(this, ((rwn0) m213810E2()).m168532l0().f56859id, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m162779v4() {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM134870s = this.f141522i.m134870s();
        if (bLiveLovePlanetPlayerInfoM134870s != null) {
            ydn0.m215258k(this, ((rwn0) m213810E2()).m168526j0(), bLiveLovePlanetPlayerInfoM134870s.userId);
            return;
        }
        if (!i9o0.m139137h(this)) {
            r1j0.m179420g("仅群主/管理可上主持位");
        } else if (guk0.m132329h(((rwn0) m213810E2()).m183423Y2())) {
            r1j0.m179420g("请先下嘉宾位");
        } else {
            new th0.C20312a(act()).m191147f("取消").m191159r("确认").m191151j("确认上主持位？").m191156o(new View.OnClickListener() { // from class: l.xcp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f193395a.m162765i4(view);
                }
            }).m191142a().m191141g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m162780w4() {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM134871t = this.f141522i.m134871t();
        if (bLiveLovePlanetPlayerInfoM134871t == null) {
            return;
        }
        ydn0.m215258k(this, ((rwn0) m213810E2()).m168526j0(), bLiveLovePlanetPlayerInfoM134871t.userId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m162781x4(String str) {
        BLiveLovePlanet bLiveLovePlanetM134868q = this.f141522i.m134868q();
        if (NullChecker.m82486a(bLiveLovePlanetM134868q)) {
            VirtualVoiceRoomApiProvider.stopOrResetGame(((rwn0) m213810E2()).m202194o(), bLiveLovePlanetM134868q.f45243id, "", str);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m162782y4() {
        BLiveLovePlanet bLiveLovePlanetM134868q = this.f141522i.m134868q();
        if (NullChecker.m82486a(bLiveLovePlanetM134868q) && NullChecker.m82486a(bLiveLovePlanetM134868q.host) && TextUtils.equals(bLiveLovePlanetM134868q.host.userId, zrv.f205799a.m207631D0()) && this.f141522i.m134876y()) {
            m162757G4();
        } else {
            m162756F4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public void m162783z4(int i, String str, boolean z) {
        BLiveLovePlanet bLiveLovePlanetM134868q = this.f141522i.m134868q();
        if (bLiveLovePlanetM134868q != null) {
            VirtualVoiceRoomApiProvider.changePair(((rwn0) m213810E2()).m202194o(), bLiveLovePlanetM134868q.f45243id, str, z);
        } else {
            r1j0.m179415b("无法修改，data == null");
        }
    }

    @Override // p153l.oam
    /* JADX INFO: renamed from: V1 */
    public void mo162760V1(nsv<h64> nsvVar) {
    }

    @Override // p153l.oam
    /* JADX INFO: renamed from: k0 */
    public void mo162767k0(BLiveVoiceCall bLiveVoiceCall) {
    }
}
