package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.LiveClientSwitchesBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class p6s extends mof0<LiveClientSwitchesBean> {

    /* JADX INFO: renamed from: h */
    public Context f150871h;

    public p6s(Context context, final y20<LiveClientSwitchesBean> y20Var) {
        super("BLiveClientSwitches", new duk(new vod("live_client_switch_json", "_v2", null), -1, h9t.m134085b(LiveClientSwitchesBean.class), new pcj() { // from class: l.f5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return p6s.m170931J();
            }
        }), new pcj() { // from class: l.g5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return LiveApiBuilder.m68497t(uqb0.f180376H, LiveApiBuilder.ReqType.GET, rnl.m182265r(xi5.m211107i("/live-client-switches")), "", h9t.m134085b(LiveClientSwitchesBean.class)).doOnNext(new y20() { // from class: l.q5s
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        p6s.m170938Q(y20Var, (LiveClientSwitchesBean) obj);
                    }
                });
            }
        });
        this.f150871h = context;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ LiveClientSwitchesBean m170931J() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m170938Q(y20 y20Var, LiveClientSwitchesBean liveClientSwitchesBean) {
        if (y20Var != null) {
            try {
                y20Var.call(liveClientSwitchesBean);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public static <T> T m170963p0(pcj<T> pcjVar, T t) {
        try {
            T tCall = pcjVar.call();
            Objects.toString(tCall);
            return ((tCall instanceof String) && TextUtils.isEmpty((String) tCall)) ? t : tCall;
        } catch (Exception e) {
            e.getStackTrace()[0].toString();
            return t;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m170964A0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.z5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f203083a.m171002a1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m170965A1() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.g6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f102478a.m171017p1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: B0 */
    public int m170966B0() {
        return ((Integer) m170963p0(new pcj() { // from class: l.t5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f172227a.m171003b1();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m170967B1() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.u5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f177669a.m171019q1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m170968C0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.i5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f113093a.m171004c1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: C1 */
    public boolean m170969C1() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.o5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f145108a.m171021r1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m170970D0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.k6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f124203a.m171005d1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m170971D1() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.c6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f79990a.m171023s1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m170972E0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.l6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f130283a.m171006e1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m170973E1() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.c5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f79894a.m171025t1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m170974F0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.d6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f85398a.m171007f1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m170975F1() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.v5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f182566a.m171027u1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m170976G0() {
        if (wft.m206159b(2)) {
            return false;
        }
        return ((Boolean) m170963p0(new pcj() { // from class: l.o6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f145205a.m171008g1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m170977G1() {
        return wft.m206159b(2);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m170978H0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.k5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f124124a.m171009h1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: H1 */
    public boolean m170979H1() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.j6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118595a.m171029v1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m170980I0() {
        if (wft.m206159b(2)) {
            return false;
        }
        return ((Boolean) m170963p0(new pcj() { // from class: l.e6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f92343a.m171010i1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: I1 */
    public int m170981I1() {
        return ((Integer) m170963p0(new pcj() { // from class: l.e5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f92233a.m171031w1();
            }
        }, 50)).intValue();
    }

    /* JADX INFO: renamed from: J0 */
    public int m170982J0() {
        return ((Integer) m170963p0(new pcj() { // from class: l.h6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f108047a.m171011j1();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: J1 */
    public int m170983J1() {
        return ((Integer) m170963p0(new pcj() { // from class: l.m5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f134928a.m171033x1();
            }
        }, 1000)).intValue();
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m170984K0() {
        if (wft.m206159b(3)) {
            return false;
        }
        return ((Boolean) m170963p0(new pcj() { // from class: l.l5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f130164a.m171012k1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: K1 */
    public int m170985K1() {
        int iIntValue = ((Integer) m170963p0(new pcj() { // from class: l.p5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f150672a.m171035y1();
            }
        }, 100)).intValue();
        if (iIntValue == 0) {
            return 100;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m170986L0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.n5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f140379a.m171013l1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m170987L1() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.s5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f166505a.m171037z1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m170988M0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.r5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f161403a.m171014m1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m170989N0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.b5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f75092a.m171015n1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m170990O0() {
        final LiveClientSwitchesBean liveClientSwitchesBeanM159277n = m159277n();
        if (liveClientSwitchesBeanM159277n == null) {
            return true;
        }
        return ((Boolean) m170963p0(new pcj() { // from class: l.j5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(liveClientSwitchesBeanM159277n.switches.overseaChineseLiveExp.f45085on);
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m170991P0() {
        if (wft.m206159b(2)) {
            return ((Boolean) m170963p0(new pcj() { // from class: l.a6s
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f68756a.m171016o1();
                }
            }, Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ Boolean m170992Q0() {
        return Boolean.valueOf(m159277n().switches.clientMonitor.f45085on);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Integer m170993R0() {
        return Integer.valueOf(m159277n().switches.clientMonitor.config.frequency);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ Boolean m170994S0() {
        return Boolean.valueOf(m159277n().switches.fakeRewardPoint.f45085on);
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ Boolean m170995T0() {
        return Boolean.valueOf(m159277n().switches.intlLiveSquareNewEnable.f45085on);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Boolean m170996U0() {
        return Boolean.valueOf(m159277n().switches.showLeaderboardScore.f45085on);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ Boolean m170997V0() {
        return Boolean.valueOf(m159277n().switches.intlFixMultiFragmentEnable.f45085on);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ String m170998W0() {
        return m159277n().switches.liveSuperAdmin.config.url;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ Boolean m170999X0() {
        return Boolean.valueOf(m159277n().switches.newLayoutFile.f45085on);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ Boolean m171000Y0() {
        return Boolean.valueOf(m159277n().switches.operatorWindowHangUp.f45085on);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ Boolean m171001Z0() {
        return Boolean.valueOf(m159277n().switches.pkAcrossRoomOptimization.f45085on);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ Boolean m171002a1() {
        return Boolean.valueOf(m159277n().switches.socketIM.f45085on);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ Integer m171003b1() {
        return Integer.valueOf(m159277n().switches.voiceDemotionLimit.config.chatHallDemotionLimit);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ Boolean m171004c1() {
        return Boolean.valueOf(m159277n().switches.happyEyeballsEnable.f45085on);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Boolean m171005d1() {
        return Boolean.valueOf(m159277n().switches.officialAccountFollow.f45085on);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ Boolean m171006e1() {
        return Boolean.valueOf(m159277n().switches.intlAudioProcessSoHookEnable.f45085on);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ Boolean m171007f1() {
        return Boolean.valueOf(m159277n().switches.intlLiveClearScreen.f45085on);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ Boolean m171008g1() {
        return Boolean.valueOf(m159277n().switches.intlLiveFeed.f45085on);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ Boolean m171009h1() {
        return Boolean.valueOf(m159277n().switches.intlLowEndSvga.f45085on);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ Boolean m171010i1() {
        return Boolean.valueOf(m159277n().switches.intlComboNewUISwitch.f45085on);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ Integer m171011j1() {
        return Integer.valueOf(m159277n().switches.intlRtcPullConfig.config.pullRtcFailOverCnt);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ Boolean m171012k1() {
        return Boolean.valueOf(m159277n().switches.intlVoiceFeed.f45085on);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ Boolean m171013l1() {
        return Boolean.valueOf(m159277n().switches.isOpenLiveStatus.f45085on);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ Boolean m171014m1() {
        return Boolean.valueOf(m159277n().switches.isOpenVoiceLiveStatus.f45085on || m159277n().switches.isOpenLiveStatus.f45085on);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ Boolean m171015n1() {
        return Boolean.valueOf(m159277n().switches.isOpenVoiceLiveStatus.f45085on);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ Boolean m171016o1() {
        return Boolean.valueOf(m159277n().switches.liveSuperAdmin.f45085on);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ Boolean m171017p1() {
        return Boolean.valueOf(m159277n().switches.promptlyRegisterEnable.f45085on);
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m171018q0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.i6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f113182a.m170992Q0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ Boolean m171019q1() {
        return Boolean.valueOf(m159277n().switches.removeVirtualAnchor.f45085on);
    }

    /* JADX INFO: renamed from: r0 */
    public int m171020r0() {
        return ((Integer) m170963p0(new pcj() { // from class: l.f6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f97441a.m170993R0();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ Boolean m171021r1() {
        return Boolean.valueOf(m159277n().switches.removeVoiceCdn.f45085on);
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m171022s0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.d5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f85187a.m170994S0();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Boolean m171023s1() {
        return Boolean.valueOf(m159277n().switches.voiceInterShowSearch.f45085on);
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m171024t0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.n6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f140483a.m170995T0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ Boolean m171025t1() {
        return Boolean.valueOf(m159277n().switches.xeGiftPlayerEnable.f45085on);
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m171026u0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.m6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f135027a.m170996U0();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ Boolean m171027u1() {
        return Boolean.valueOf(m159277n().switches.momoBeauty.f45085on);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m171028v0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.b6s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f75204a.m170997V0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ Boolean m171029v1() {
        return Boolean.valueOf(m159277n().switches.userGoActionSwitch.f45085on);
    }

    /* JADX INFO: renamed from: w0 */
    public String m171030w0() {
        return !wft.m206159b(2) ? "" : (String) m170963p0(new pcj() { // from class: l.y5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f197583a.m170998W0();
            }
        }, "");
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ Integer m171031w1() {
        return Integer.valueOf(m159277n().switches.voiceChatLimit.config.voiceChatLength);
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m171032x0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.x5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f192517a.m170999X0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ Integer m171033x1() {
        return Integer.valueOf(m159277n().switches.voiceChatLimit.config.voiceChatCount);
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m171034y0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.h5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f107971a.m171000Y0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ Integer m171035y1() {
        return Integer.valueOf(m159277n().switches.androidMaskLimit.maskLimit);
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m171036z0() {
        return ((Boolean) m170963p0(new pcj() { // from class: l.w5s
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f187546a.m171001Z0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ Boolean m171037z1() {
        return Boolean.valueOf(m159277n().switches.voiceMultiAvatar.f45085on);
    }
}
