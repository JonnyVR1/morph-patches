package p149l;

import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.LiveDialogAct;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.officialshow.OfficialShowView;
import com.p046p1.mobile.putong.live.livingroom.other.liveend.LiveEndAct;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class p650 extends AbstractC15533a6<x350, BLive, l450, OfficialShowView> {

    /* JADX INFO: renamed from: j */
    public final RoomFrag f147367j;

    /* JADX INFO: renamed from: k */
    public final l8d0 f147368k;

    /* JADX INFO: renamed from: l */
    public c4g0 f147369l;

    /* JADX INFO: renamed from: m */
    public c4g0 f147370m;

    /* JADX INFO: renamed from: n */
    public String f147371n;

    /* JADX WARN: Multi-variable type inference failed */
    public p650(l450 l450Var, l8d0 l8d0Var, OfficialShowView officialShowView) {
        super(l450Var);
        this.f147367j = (RoomFrag) l450Var.f77100f;
        this.f147368k = l8d0Var;
        mo51532C(officialShowView);
        l450Var.m103722a(this, (ViewGroup) this.viewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ Integer m167619A4(fed0 fed0Var) {
        return Integer.valueOf(((OfficialShowView) this.viewModel).getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    private void m167620B4(u7s u7sVar) {
        String strM192152l = u7sVar.m192152l();
        m206028F2().ChatEvent.dismissDialog().m172467p();
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM206897S2 = ((x350) m206027E2()).m206897S2();
        if (bLiveOfficialShowCurrentAnchorInfoM206897S2 == null) {
            act().m66873d2();
            return;
        }
        if (u7sVar.m192154n()) {
            BLive bLiveNew_ = BLive.new_();
            bLiveNew_.f44323id = bLiveOfficialShowCurrentAnchorInfoM206897S2.anchorLiveId;
            act().startActivity(LiveEndAct.m75478V1(act(), bLiveNew_, ypv.f199493a.m199329V(), strM192152l, "", ((x350) m206027E2()).m149826x()));
        } else {
            LiveDialogAct.m67177g2(act(), "", strM192152l);
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: E4 */
    private void m167621E4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4309e c4309eM20496B = act().dialog().m20504F(str).m20496B(false);
        Objects.requireNonNull(d30Var);
        c4309eM20496B.m20544n0(str2, new bii0(d30Var)).m20568z0();
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m167625m4() {
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m167629q4(Throwable th) {
    }

    /* JADX INFO: renamed from: s4 */
    private void m167631s4() {
        mkd0.m154992z(this.f147370m);
        this.f147370m = duringCreated(((OfficialShowView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new w9j() { // from class: l.l650
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(ffw.m121194e(new e30() { // from class: l.m650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131445a.m167632v4((Integer) obj);
            }
        }, new e30() { // from class: l.n650
            @Override // p149l.e30
            public final void call(Object obj) {
                p650.m167629q4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m167632v4(Integer num) {
        m206028F2().ChatEvent.changeInputSize().mo172463j(new Size((xdl0.m208412y0() - num.intValue()) - xdl0.m208407w(56.0f), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m167633w4(iqv iqvVar) {
        m154640M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m167634x4(BLiveSettings bLiveSettings) {
        ((x350) m206027E2()).m132094T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m167635y4(iqv iqvVar) {
        if (iqvVar.m137804k()) {
            ((x350) m206027E2()).mo97489e2(false, ((x350) m206027E2()).mo149813j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m167636z4(LiveControlMessage liveControlMessage) {
        gkh0.m126627j("[live]msg_observer_handler", "room presenter received control message," + liveControlMessage);
        String str = liveControlMessage.type;
        switch (str.hashCode()) {
            case -2140406257:
                if (!str.equals("add_manager")) {
                    return;
                }
                break;
            case -1896170388:
                str.equals("live_pull_update_video_quality");
                return;
            case -887328209:
                if (str.equals("system")) {
                    m167621E4(liveControlMessage.content, this.f188513f.getString(R$string.f47646y5), new d30() { // from class: l.o650
                        @Override // p149l.d30
                        public final void call() {
                            p650.m167625m4();
                        }
                    });
                    return;
                }
                return;
            case -866625755:
                if (str.equals("re_request_room_gift_list")) {
                    wrj.m205257w(true);
                    if (m206027E2() == 0 || ((x350) m206027E2()).m206897S2() == null) {
                        return;
                    }
                    ((x350) m206027E2()).m132055A1(new evj.C16689a(((x350) m206027E2()).m149818o(), x350.m206896R2(m206027E2(), ((x350) m206027E2()).m132140j0()), "live").m118277f(), null);
                    return;
                }
                return;
            case -484821221:
                if (str.equals("chat_tip_change")) {
                    ((x350) m206027E2()).m132076L1();
                    return;
                }
                return;
            case 3029746:
                if (str.equals("boot")) {
                    CrashHelper.m81296c(new IllegalStateException("live boot handle2 with content" + liveControlMessage.content));
                    ((x350) m206027E2()).m132132g2(((x350) m206027E2()).mo149813j());
                    m167639t4();
                    act().m66873d2();
                    if (liveControlMessage.isFromLiveRoomBlock() && vdt.m198092b(2)) {
                        lsi0.m151595y(liveControlMessage.content);
                        return;
                    } else {
                        LiveDialogAct.m67177g2(act(), "", liveControlMessage.content);
                        return;
                    }
                }
                return;
            case 3540994:
                if (str.equals("stop")) {
                    ((x350) m206027E2()).mo149812h(u7s.f175055e);
                    return;
                }
                return;
            case 106440182:
                if (str.equals("pause")) {
                    ((x350) m206027E2()).mo149812h(pau.f148011b);
                    return;
                }
                return;
            case 109757538:
                str.equals("start");
                return;
            case 134762710:
                if (str.equals("force_stop")) {
                    ((x350) m206027E2()).mo149812h(u7s.f175055e);
                    m167620B4(new u7s(liveControlMessage.content, true));
                    return;
                }
                return;
            case 379400585:
                if (str.equals("forbidden_multidevice")) {
                    String string = liveControlMessage.isAnchor ? ypv.f199497e.getString(R$string.f46972T5) : ypv.f199497e.getString(R$string.f46930R5);
                    ((x350) m206027E2()).m132132g2(((x350) m206027E2()).mo149813j());
                    m167639t4();
                    act().m66873d2();
                    LiveDialogAct.m67177g2(act(), "", string);
                    return;
                }
                return;
            case 1075863833:
                if (!str.equals("delete_manager")) {
                    return;
                }
                break;
            default:
                return;
        }
        ((x350) m206027E2()).mo132074K1(((x350) m206027E2()).m149818o());
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: D4, reason: merged with bridge method [inline-methods] */
    public void mo95098c4(BLive bLive) {
        m206028F2().PlayerEvent.quickPlay().mo172463j(bLive);
    }

    @Override // p149l.mht
    /* JADX INFO: renamed from: J3 */
    public void mo140769J3() {
        super.mo140769J3();
        hu20.m132970p("context_single_room");
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: N3 */
    public void mo95084N3() {
        this.f147371n = null;
        m206028F2().PreLoadEvent.cleanPreLoad().m172467p();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: O3 */
    public boolean mo95085O3() {
        return t7t.m187503c(this.f188512e.f77102h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: R3 */
    public View mo95087R3() {
        return (View) this.viewModel;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: T3 */
    public void mo95089T3(e30<r8d0> e30Var) {
        m206028F2().RoomInfoEvent.initSmallWindowRoomInfo().mo172463j(new s8d0(e30Var, null, false, null, false));
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: U3 */
    public boolean mo95090U3(int i) {
        return false;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: V3 */
    public boolean mo95091V3() {
        return false;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: W3 */
    public boolean mo95092W3() {
        return this.f147371n != null;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: X3 */
    public boolean mo95093X3(int i) {
        if (!t7t.m187503c(this.f188512e.f77102h)) {
            return false;
        }
        m206028F2().LivePusherEvent.closeLive().m172467p();
        return true;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: Y3 */
    public boolean mo95094Y3(boolean z, boolean z2) {
        return false;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: Z3 */
    public void mo95095Z3() {
        this.f147368k.m148896h1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: e4 */
    public void mo95100e4(JumpRoomData jumpRoomData) {
        ((x350) m206027E2()).m97483O2(jumpRoomData);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: f4 */
    public void mo95101f4(cul culVar) {
        m206028F2().PlayerEvent.updatePlayer().mo172463j(culVar);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: g4 */
    public void mo95102g4(boolean z) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return;
        }
        ((OfficialShowView) v2).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.bsm] */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: i4 */
    public void mo95104i4() {
        ypv.m215676r();
        m144512z2(this.f147368k.m148916x0().m149343I2(m154638K3()));
        o550.m162755a(this, (l450) m154638K3(), (OfficialShowView) this.viewModel);
        super.mo70198T();
        ((x350) m206027E2()).mo132121c2();
        ((OfficialShowView) this.viewModel).m75376C(true);
        m167631s4();
        duringCreated(((x350) m206027E2()).mo149827y()).subscribe(ffw.m121193d(new e30() { // from class: l.g650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101226a.m167633w4((iqv) obj);
            }
        }));
        duringCreated(ypv.m215672k().m121230k()).subscribe(ffw.m121193d(new e30() { // from class: l.h650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106008a.m167634x4((BLiveSettings) obj);
            }
        }));
        duringCreated(((x350) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.i650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111676a.m167635y4((iqv) obj);
            }
        }));
        this.f147369l = ((x350) m206027E2()).m132156o1(this.f188513f).subscribe(ffw.m121193d(new e30() { // from class: l.j650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116388a.m167636z4((LiveControlMessage) obj);
            }
        }));
        ((x350) m206027E2()).m132084P1();
        LiveWatchCounter.m76330h().m76332f(1);
        LiveWatchCounter.m76330h().m76333g(1);
        this.f147371n = null;
        m129301d3(fed0.class, new w9j() { // from class: l.k650
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f121263a.m167619A4((fed0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    public void init() {
        m144512z2(new n2j(this.f188512e, this.f147368k));
        o550.m162756b(this, (l450) m154638K3(), (OfficialShowView) this.viewModel);
        ((OfficialShowView) this.viewModel).m75379w(this.f147367j.f47738A);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: m */
    public void mo95105m(boolean z) {
        m206028F2().PlayerEvent.showLoading().mo172463j(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f188512e.f77104j.destroy();
        hu20.m132970p("context_single_room");
        mkd0.m154992z(this.f147369l);
        if (mo95091V3()) {
            ((x350) this.f188512e.f77102h).mo97488c0(true);
        } else {
            ((x350) m206027E2()).exit();
            ((x350) this.f188512e.f77102h).m97476H2();
        }
    }

    @Override // p149l.k4t
    /* JADX INFO: renamed from: s2 */
    public void mo111727s2() {
        super.mo111727s2();
        mkd0.m154992z(this.f147370m);
        ((OfficialShowView) this.viewModel).destroy();
    }

    /* JADX INFO: renamed from: t4 */
    public void m167639t4() {
        mo140769J3();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void mo95088S3(BLive bLive, boolean z, e30<r8d0> e30Var, e30<r8d0> e30Var2, boolean z2) {
        if (TextUtils.isEmpty(bLive.f44323id)) {
            gkh0.m126627j("[live][trace_problem]", Log.getStackTraceString(new Exception("initRoomInfo live.id is Null")));
        }
        m206028F2().RoomInfoEvent.initRoomInfo().mo172463j(new s8d0(e30Var2, bLive, z, e30Var, z2));
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: P3 */
    public void mo95086P3() {
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: a4 */
    public void mo95096a4() {
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: C4, reason: merged with bridge method [inline-methods] */
    public void mo95097b4(boolean z, BLive bLive) {
    }
}
