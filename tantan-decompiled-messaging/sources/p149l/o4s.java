package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.LiveClientSwitchesBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class o4s extends fgf0<LiveClientSwitchesBean> {

    /* JADX INFO: renamed from: h */
    public Context f141810h;

    public o4s(Context context, final e30<LiveClientSwitchesBean> e30Var) {
        super("BLiveClientSwitches", new nrk(new qnd("live_client_switch_json", "_v2", null), -1, g7t.m124729b(LiveClientSwitchesBean.class), new v9j() { // from class: l.e3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return o4s.m162624J();
            }
        }), new v9j() { // from class: l.f3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return LiveApiBuilder.m67314t(qib0.f154693H, LiveApiBuilder.ReqType.GET, cll.m107501r(xh5.m208761i("/live-client-switches")), "", g7t.m124729b(LiveClientSwitchesBean.class)).doOnNext(new e30() { // from class: l.p3s
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        o4s.m162631Q(e30Var, (LiveClientSwitchesBean) obj);
                    }
                });
            }
        });
        this.f141810h = context;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ LiveClientSwitchesBean m162624J() {
        return null;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m162631Q(e30 e30Var, LiveClientSwitchesBean liveClientSwitchesBean) {
        if (e30Var != null) {
            try {
                e30Var.call(liveClientSwitchesBean);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public static <T> T m162656p0(v9j<T> v9jVar, T t) {
        try {
            T tCall = v9jVar.call();
            Objects.toString(tCall);
            return ((tCall instanceof String) && TextUtils.isEmpty((String) tCall)) ? t : tCall;
        } catch (Exception e) {
            e.getStackTrace()[0].toString();
            return t;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m162657A0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.y3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f195851a.m162695a1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m162658A1() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.f4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f94923a.m162710p1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: B0 */
    public int m162659B0() {
        return ((Integer) m162656p0(new v9j() { // from class: l.s3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f162191a.m162696b1();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m162660B1() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.t3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f167653a.m162712q1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m162661C0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.h3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f105761a.m162697c1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: C1 */
    public boolean m162662C1() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.n3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f137019a.m162714r1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m162663D0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.j4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f116233a.m162698d1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: D1 */
    public boolean m162664D1() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.b4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f73402a.m162716s1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m162665E0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.k4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f121119a.m162699e1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m162666E1() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.b3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f73255a.m162718t1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m162667F0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.c4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f79292a.m162700f1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m162668F1() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.u3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f173646a.m162720u1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m162669G0() {
        if (vdt.m198092b(2)) {
            return false;
        }
        return ((Boolean) m162656p0(new v9j() { // from class: l.n4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f137120a.m162701g1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m162670G1() {
        return vdt.m198092b(2);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m162671H0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.j3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f116109a.m162702h1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: H1 */
    public boolean m162672H1() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.i4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f111478a.m162722v1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m162673I0() {
        if (vdt.m198092b(2)) {
            return false;
        }
        return ((Boolean) m162656p0(new v9j() { // from class: l.d4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f84348a.m162703i1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: I1 */
    public int m162674I1() {
        return ((Integer) m162656p0(new v9j() { // from class: l.d3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f84256a.m162724w1();
            }
        }, 50)).intValue();
    }

    /* JADX INFO: renamed from: J0 */
    public int m162675J0() {
        return ((Integer) m162656p0(new v9j() { // from class: l.g4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f100585a.m162704j1();
            }
        }, 0)).intValue();
    }

    /* JADX INFO: renamed from: J1 */
    public int m162676J1() {
        return ((Integer) m162656p0(new v9j() { // from class: l.l3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f125943a.m162726x1();
            }
        }, 1000)).intValue();
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m162677K0() {
        if (vdt.m198092b(3)) {
            return false;
        }
        return ((Boolean) m162656p0(new v9j() { // from class: l.k3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f120863a.m162705k1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: K1 */
    public int m162678K1() {
        int iIntValue = ((Integer) m162656p0(new v9j() { // from class: l.o3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f141707a.m162728y1();
            }
        }, 100)).intValue();
        if (iIntValue == 0) {
            return 100;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m162679L0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.m3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f131117a.m162706l1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: L1 */
    public boolean m162680L1() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.r3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f157610a.m162730z1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m162681M0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.q3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f152506a.m162707m1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m162682N0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.a3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f67410a.m162708n1();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m162683O0() {
        final LiveClientSwitchesBean liveClientSwitchesBeanM121233n = m121233n();
        if (liveClientSwitchesBeanM121233n == null) {
            return true;
        }
        return ((Boolean) m162656p0(new v9j() { // from class: l.i3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(liveClientSwitchesBeanM121233n.switches.overseaChineseLiveExp.f44237on);
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m162684P0() {
        if (vdt.m198092b(2)) {
            return ((Boolean) m162656p0(new v9j() { // from class: l.z3s
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f201402a.m162709o1();
                }
            }, Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ Boolean m162685Q0() {
        return Boolean.valueOf(m121233n().switches.clientMonitor.f44237on);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Integer m162686R0() {
        return Integer.valueOf(m121233n().switches.clientMonitor.config.frequency);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ Boolean m162687S0() {
        return Boolean.valueOf(m121233n().switches.fakeRewardPoint.f44237on);
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ Boolean m162688T0() {
        return Boolean.valueOf(m121233n().switches.intlLiveSquareNewEnable.f44237on);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Boolean m162689U0() {
        return Boolean.valueOf(m121233n().switches.showLeaderboardScore.f44237on);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ Boolean m162690V0() {
        return Boolean.valueOf(m121233n().switches.intlFixMultiFragmentEnable.f44237on);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ String m162691W0() {
        return m121233n().switches.liveSuperAdmin.config.url;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ Boolean m162692X0() {
        return Boolean.valueOf(m121233n().switches.newLayoutFile.f44237on);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ Boolean m162693Y0() {
        return Boolean.valueOf(m121233n().switches.operatorWindowHangUp.f44237on);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ Boolean m162694Z0() {
        return Boolean.valueOf(m121233n().switches.pkAcrossRoomOptimization.f44237on);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ Boolean m162695a1() {
        return Boolean.valueOf(m121233n().switches.socketIM.f44237on);
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ Integer m162696b1() {
        return Integer.valueOf(m121233n().switches.voiceDemotionLimit.config.chatHallDemotionLimit);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ Boolean m162697c1() {
        return Boolean.valueOf(m121233n().switches.happyEyeballsEnable.f44237on);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Boolean m162698d1() {
        return Boolean.valueOf(m121233n().switches.officialAccountFollow.f44237on);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ Boolean m162699e1() {
        return Boolean.valueOf(m121233n().switches.intlAudioProcessSoHookEnable.f44237on);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ Boolean m162700f1() {
        return Boolean.valueOf(m121233n().switches.intlLiveClearScreen.f44237on);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ Boolean m162701g1() {
        return Boolean.valueOf(m121233n().switches.intlLiveFeed.f44237on);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ Boolean m162702h1() {
        return Boolean.valueOf(m121233n().switches.intlLowEndSvga.f44237on);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ Boolean m162703i1() {
        return Boolean.valueOf(m121233n().switches.intlComboNewUISwitch.f44237on);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ Integer m162704j1() {
        return Integer.valueOf(m121233n().switches.intlRtcPullConfig.config.pullRtcFailOverCnt);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ Boolean m162705k1() {
        return Boolean.valueOf(m121233n().switches.intlVoiceFeed.f44237on);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ Boolean m162706l1() {
        return Boolean.valueOf(m121233n().switches.isOpenLiveStatus.f44237on);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ Boolean m162707m1() {
        return Boolean.valueOf(m121233n().switches.isOpenVoiceLiveStatus.f44237on || m121233n().switches.isOpenLiveStatus.f44237on);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ Boolean m162708n1() {
        return Boolean.valueOf(m121233n().switches.isOpenVoiceLiveStatus.f44237on);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ Boolean m162709o1() {
        return Boolean.valueOf(m121233n().switches.liveSuperAdmin.f44237on);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ Boolean m162710p1() {
        return Boolean.valueOf(m121233n().switches.promptlyRegisterEnable.f44237on);
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m162711q0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.h4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f105871a.m162685Q0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ Boolean m162712q1() {
        return Boolean.valueOf(m121233n().switches.removeVirtualAnchor.f44237on);
    }

    /* JADX INFO: renamed from: r0 */
    public int m162713r0() {
        return ((Integer) m162656p0(new v9j() { // from class: l.e4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f89317a.m162686R0();
            }
        }, 15)).intValue();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ Boolean m162714r1() {
        return Boolean.valueOf(m121233n().switches.removeVoiceCdn.f44237on);
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m162715s0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.c3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f79027a.m162687S0();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ Boolean m162716s1() {
        return Boolean.valueOf(m121233n().switches.voiceInterShowSearch.f44237on);
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m162717t0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.m4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f131323a.m162688T0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ Boolean m162718t1() {
        return Boolean.valueOf(m121233n().switches.xeGiftPlayerEnable.f44237on);
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m162719u0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.l4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f126057a.m162689U0();
            }
        }, Boolean.TRUE)).booleanValue();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ Boolean m162720u1() {
        return Boolean.valueOf(m121233n().switches.momoBeauty.f44237on);
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m162721v0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.a4s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f67555a.m162690V0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ Boolean m162722v1() {
        return Boolean.valueOf(m121233n().switches.userGoActionSwitch.f44237on);
    }

    /* JADX INFO: renamed from: w0 */
    public String m162723w0() {
        return !vdt.m198092b(2) ? "" : (String) m162656p0(new v9j() { // from class: l.x3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f190916a.m162691W0();
            }
        }, "");
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ Integer m162724w1() {
        return Integer.valueOf(m121233n().switches.voiceChatLimit.config.voiceChatLength);
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m162725x0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.w3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f184434a.m162692X0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ Integer m162726x1() {
        return Integer.valueOf(m121233n().switches.voiceChatLimit.config.voiceChatCount);
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m162727y0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.g3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f100507a.m162693Y0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ Integer m162728y1() {
        return Integer.valueOf(m121233n().switches.androidMaskLimit.maskLimit);
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m162729z0() {
        return ((Boolean) m162656p0(new v9j() { // from class: l.v3s
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f179843a.m162694Z0();
            }
        }, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ Boolean m162730z1() {
        return Boolean.valueOf(m121233n().switches.voiceMultiAvatar.f44237on);
    }
}
