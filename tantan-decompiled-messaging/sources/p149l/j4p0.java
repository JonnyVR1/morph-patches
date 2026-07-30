package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.view.VoiceVirtualLovePlanetWidgetView;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Pair;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class j4p0 extends h4t<nnn0, VoiceVirtualLovePlanetWidgetView> implements jdw.InterfaceC17756a, y7m {

    /* JADX INFO: renamed from: i */
    public jdw f116226i;

    /* JADX INFO: renamed from: j */
    public BLiveLovePlanetPlayerInfo f116227j;

    public j4p0(bsm bsmVar) {
        super(bsmVar);
        jdw jdwVar = new jdw();
        this.f116226i = jdwVar;
        jdwVar.m141074H(this);
        m144512z2(new p8n0(bsmVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public void m139698A4(BLiveLovePlanet bLiveLovePlanet) {
        if (bLiveLovePlanet == null) {
            return;
        }
        mo139730a2(bLiveLovePlanet.host);
        mo139729W0(bLiveLovePlanet.mvp);
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77202E0(bLiveLovePlanet);
        m139726H4();
        m139723E4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I4 */
    public void m139699I4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        vwb.m200354z(((nnn0) m206027E2()).m160249P2().m102067p(), new e30() { // from class: l.u3p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173643a.m139745p4(bLiveCallVolume, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m139713X3(BLiveLovePlanet bLiveLovePlanet) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public Pair<int[], Integer> m139719f4(j6n0 j6n0Var) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.f116227j;
        if (bLiveLovePlanetPlayerInfo != null && TextUtils.equals(bLiveLovePlanetPlayerInfo.userId, j6n0Var.f116489d)) {
            return new Pair<>(sxj.m186441b(((VoiceVirtualLovePlanetWidgetView) this.viewModel).f52587g), Integer.valueOf(((VoiceVirtualLovePlanetWidgetView) this.viewModel).f52587g.getWidth()));
        }
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewMo77184f0 = ((c0m) ((VoiceVirtualLovePlanetWidgetView) this.viewModel).f52603w.getChildAt(0)).mo77184f0(j6n0Var.f116489d);
        return voiceVirtualLoveItemInfoViewMo77184f0 != null ? new Pair<>(sxj.m186441b(voiceVirtualLoveItemInfoViewMo77184f0.f52533i), Integer.valueOf(voiceVirtualLoveItemInfoViewMo77184f0.f52533i.getWidth())) : new Pair<>(new int[2], 0);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m139720B4() {
        int i;
        BLiveLovePlanet bLiveLovePlanetM141082q = this.f116226i.m141082q();
        if (bLiveLovePlanetM141082q == null || bLiveLovePlanetM141082q.host == null) {
            i = i3c0.f110713G3;
        } else {
            i = (TextUtils.equals(bLiveLovePlanetM141082q.host.userId, ypv.f199493a.m199309D0()) && this.f116226i.m141090y()) ? i3c0.f110701F3 : i3c0.f110713G3;
        }
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77200B0(i);
    }

    /* JADX INFO: renamed from: C4 */
    public final void m139721C4(String str) {
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77201D0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D4 */
    public void m139722D4() {
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77213v0(kdw.m145693b(this.f116226i.m141082q(), ((nnn0) m206027E2()).m160261Y2(), this.f116226i.m141072F()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public void m139723E4() {
        final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo;
        BLiveVoiceTagBubble bLiveVoiceTagBubble;
        if (m206032L2() || (bLiveVoiceRoomTagInfo = ((nnn0) m206027E2()).m160247O2().mo165469j().voiceRoomTagInfo) == null || (bLiveVoiceTagBubble = bLiveVoiceRoomTagInfo.bubble) == null) {
            return;
        }
        final String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, SayHiBubbleView.getGreetedToUserId())) {
            return;
        }
        SayHiBubbleView.setGreetedToUserId(str);
        e51.m114743H(act(), new Runnable() { // from class: l.s3p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162184a.m139737j4(str, bLiveVoiceRoomTagInfo);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m139724F4() {
        jp50.C17834a c17834a = new jp50.C17834a(9000);
        c17834a.m142598B(ddv.f85640L);
        c17834a.m142609z(1.0d, 0.6d);
        c17834a.m142602s(24);
        c17834a.m142603t(80);
        m206028F2().OpenH5Event.open().mo172463j(c17834a.m142600q());
    }

    /* JADX INFO: renamed from: G4 */
    public final void m139725G4() {
        View viewInflate = this.f188513f.inflater().inflate(t6c0.f168270Za, (ViewGroup) null);
        int i = xdl0.f192404f;
        final PopupWindow popupWindow = new PopupWindow(viewInflate, i, i, true);
        xdl0.m208329E0(viewInflate.findViewById(g5c0.f100950h7), new View.OnClickListener() { // from class: l.v3p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179834a.m139744o4(popupWindow, view);
            }
        });
        xdl0.m208329E0(viewInflate.findViewById(g5c0.f100960i7), new View.OnClickListener() { // from class: l.w3p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184421a.m139740l4(popupWindow, view);
            }
        });
        xdl0.m208329E0(viewInflate.findViewById(g5c0.f100970j7), new View.OnClickListener() { // from class: l.x3p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190913a.m139741m4(popupWindow, view);
            }
        });
        popupWindow.showAsDropDown(((VoiceVirtualLovePlanetWidgetView) this.viewModel).f52602v, 0, t100.f167260i);
    }

    /* JADX INFO: renamed from: H4 */
    public final void m139726H4() {
        m139720B4();
        m139722D4();
        m139721C4(this.f116226i.m141083r());
    }

    @Override // p149l.y7m
    /* JADX INFO: renamed from: I0 */
    public void mo139727I0(String str, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        this.f116226i.m141076J(str, bLiveAvatarFrameConfig);
    }

    @Override // p149l.jdw.InterfaceC17756a
    /* JADX INFO: renamed from: W0 */
    public void mo139729W0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77216z0(bLiveLovePlanetPlayerInfo);
    }

    @Override // p149l.jdw.InterfaceC17756a
    /* JADX INFO: renamed from: a2 */
    public void mo139730a2(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        this.f116227j = bLiveLovePlanetPlayerInfo;
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77215y0(bLiveLovePlanetPlayerInfo);
        m139722D4();
        m139720B4();
    }

    @Override // p149l.jdw.InterfaceC17756a
    /* JADX INFO: renamed from: c */
    public void mo139731c() {
        duringCreated(m139733e4()).subscribe(ffw.m121197h(new d4p0(this)));
    }

    /* JADX INFO: renamed from: d4 */
    public void m139732d4(boolean z) {
        xpm0 xpm0Var = new xpm0();
        xpm0Var.m210512f(z);
        m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(xpm0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public C22306c<BLiveLovePlanet> m139733e4() {
        return VirtualVoiceRoomApiProvider.getLovePlanetInfo(((nnn0) m206027E2()).m149818o()).doOnNext(new e30() { // from class: l.i4p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111475a.m139735h4((BLiveLovePlanet) obj);
            }
        }).doOnError(new e30() { // from class: l.q3p0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).toString();
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m139734g4(BLiveVoiceCall bLiveVoiceCall) {
        m139722D4();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m139735h4(BLiveLovePlanet bLiveLovePlanet) {
        this.f116226i.m141073G(bLiveLovePlanet);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m139736i4(View view) {
        m139732d4(true);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m139737j4(String str, BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM141084s = this.f116226i.m141084s();
        if (bLiveLovePlanetPlayerInfoM141084s == null || !TextUtils.equals(bLiveLovePlanetPlayerInfoM141084s.userId, str)) {
            ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77204H0(bLiveVoiceRoomTagInfo.bubble);
        } else {
            ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77203G0(bLiveVoiceRoomTagInfo.bubble);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m139739k4(View view) {
        m139753x4("reset");
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m139740l4(PopupWindow popupWindow, View view) {
        new xh0.C21150a(act()).m208727f("取消").m208739r("重置游戏").m208731j("重置游戏后，将回到游戏准备阶段，且不会清空嘉宾位。确认重置？").m208736o(new View.OnClickListener() { // from class: l.y3p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f195840a.m139739k4(view2);
            }
        }).m208722a().m208721g();
        popupWindow.dismiss();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m139741m4(PopupWindow popupWindow, View view) {
        m139724F4();
        popupWindow.dismiss();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        SVGALoader.clear();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m139742n4(View view) {
        m139753x4("stop");
    }

    @Override // p149l.jdw.InterfaceC17756a
    /* JADX INFO: renamed from: o0 */
    public void mo139743o0(BLiveLovePlanet bLiveLovePlanet) {
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77202E0(bLiveLovePlanet);
        m139722D4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m139744o4(PopupWindow popupWindow, View view) {
        new xh0.C21150a(act()).m208727f("取消").m208739r("终止游戏").m208731j("终止游戏后，将回到游戏准备阶段，并清空嘉宾位。确认终止？").m208736o(new View.OnClickListener() { // from class: l.z3p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f201387a.m139742n4(view2);
            }
        }).m208722a().m208721g();
        popupWindow.dismiss();
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m139745p4(BLiveCallVolume bLiveCallVolume, BLiveVoiceCall bLiveVoiceCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveVoiceCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveVoiceCall.volume) {
            bLiveVoiceCall.isSpeak = false;
            bLiveVoiceCall.volume = 0.0f;
        } else {
            bLiveVoiceCall.isSpeak = true;
            bLiveVoiceCall.volume = f.floatValue();
        }
        ((VoiceVirtualLovePlanetWidgetView) this.viewModel).m77214w0(bLiveVoiceCall, this.f116226i);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m139746q4(LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
        this.f116226i.m141087v(voiceLiveLovePlanetUpdate);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ C22306c m139747r4(C4319c c4319c) {
        return m139733e4();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ Boolean m139748s4(u25 u25Var) {
        u25Var.f173070c = this.f116226i.m141089x(u25Var.f173071d);
        return Boolean.valueOf(this.f116226i.m141082q() == null || this.f116226i.m141083r().equals("prepare") || this.f116226i.m141083r().equals("unknown_"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189091b1()).subscribe(ffw.m121197h(new e30() { // from class: l.p3p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147007a.m139746q4((LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160262Z2()).subscribe(ffw.m121197h(new e30() { // from class: l.a4p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67551a.m139734g4((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(m206028F2().CallEvent.memberVolume().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.b4p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73394a.m139699I4((BLiveCallVolume) obj);
            }
        }));
        m129294C3(new v9j() { // from class: l.c4p0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f79288a.m139733e4();
            }
        }, new d4p0(this));
        duringCreated(lifecycle().filter(new w9j() { // from class: l.e4p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        })).flatMap(new w9j() { // from class: l.f4p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f94862a.m139747r4((C4319c) obj);
            }
        }).subscribe(ffw.m121197h(new d4p0(this)));
        m129301d3(u25.class, new w9j() { // from class: l.g4p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f100580a.m139748s4((u25) obj);
            }
        });
        m129301d3(j6n0.class, new w9j() { // from class: l.h4p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105865a.m139719f4((j6n0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public void m139749t4() {
        BLiveLovePlanet bLiveLovePlanetM141082q = this.f116226i.m141082q();
        String strM199309D0 = ypv.f199493a.m199309D0();
        if (bLiveLovePlanetM141082q == null || bLiveLovePlanetM141082q.host == null) {
            if (alk0.m97306e(((nnn0) m206027E2()).m160261Y2())) {
                return;
            }
            m139732d4(false);
            return;
        }
        String string = bLiveLovePlanetM141082q.stage.toString();
        if (TextUtils.equals(bLiveLovePlanetM141082q.host.userId, strM199309D0)) {
            duringCreated(VirtualVoiceRoomApiProvider.changeStage(((nnn0) m206027E2()).m149818o(), bLiveLovePlanetM141082q.f44395id, string)).subscribe(ffw.m121194e(new e30() { // from class: l.r3p0
                @Override // p149l.e30
                public final void call(Object obj) {
                    j4p0.m139713X3((BLiveLovePlanet) obj);
                }
            }, new vud0()));
        } else {
            if (alk0.m97306e(((nnn0) m206027E2()).m160261Y2())) {
                return;
            }
            m139732d4(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m139750u4(String str) {
        if (((nnn0) m206027E2()).m132146l0() == null) {
            return;
        }
        u4n0.m191752k(this, ((nnn0) m206027E2()).m132146l0().f56011id, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m139751v4() {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM141084s = this.f116226i.m141084s();
        if (bLiveLovePlanetPlayerInfoM141084s != null) {
            u4n0.m191752k(this, ((nnn0) m206027E2()).m132140j0(), bLiveLovePlanetPlayerInfoM141084s.userId);
            return;
        }
        if (!e0o0.m114322h(this)) {
            osi0.m165783g("仅群主/管理可上主持位");
        } else if (alk0.m97309h(((nnn0) m206027E2()).m160261Y2())) {
            osi0.m165783g("请先下嘉宾位");
        } else {
            new xh0.C21150a(act()).m208727f("取消").m208739r("确认").m208731j("确认上主持位？").m208736o(new View.OnClickListener() { // from class: l.t3p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f167651a.m139736i4(view);
                }
            }).m208722a().m208721g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m139752w4() {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoM141085t = this.f116226i.m141085t();
        if (bLiveLovePlanetPlayerInfoM141085t == null) {
            return;
        }
        u4n0.m191752k(this, ((nnn0) m206027E2()).m132140j0(), bLiveLovePlanetPlayerInfoM141085t.userId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m139753x4(String str) {
        BLiveLovePlanet bLiveLovePlanetM141082q = this.f116226i.m141082q();
        if (NullChecker.m81303a(bLiveLovePlanetM141082q)) {
            VirtualVoiceRoomApiProvider.stopOrResetGame(((nnn0) m206027E2()).m149818o(), bLiveLovePlanetM141082q.f44395id, "", str);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m139754y4() {
        BLiveLovePlanet bLiveLovePlanetM141082q = this.f116226i.m141082q();
        if (NullChecker.m81303a(bLiveLovePlanetM141082q) && NullChecker.m81303a(bLiveLovePlanetM141082q.host) && TextUtils.equals(bLiveLovePlanetM141082q.host.userId, ypv.f199493a.m199309D0()) && this.f116226i.m141090y()) {
            m139725G4();
        } else {
            m139724F4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public void m139755z4(int i, String str, boolean z) {
        BLiveLovePlanet bLiveLovePlanetM141082q = this.f116226i.m141082q();
        if (bLiveLovePlanetM141082q != null) {
            VirtualVoiceRoomApiProvider.changePair(((nnn0) m206027E2()).m149818o(), bLiveLovePlanetM141082q.f44395id, str, z);
        } else {
            osi0.m165778b("无法修改，data == null");
        }
    }

    @Override // p149l.y7m
    /* JADX INFO: renamed from: V1 */
    public void mo139728V1(mqv<i54> mqvVar) {
    }

    @Override // p149l.y7m
    /* JADX INFO: renamed from: k0 */
    public void mo139738k0(BLiveVoiceCall bLiveVoiceCall) {
    }
}
