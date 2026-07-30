package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.LiveDialogAct;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public class hnm0 extends qct<jlm0> {

    /* JADX INFO: renamed from: i */
    public final C22507a<Boolean> f110801i;

    /* JADX INFO: renamed from: j */
    public final C22507a<BLiveVoiceRoom> f110802j;

    /* JADX INFO: renamed from: k */
    public final C22507a<uxj0> f110803k;

    /* JADX INFO: renamed from: l */
    public final gio0 f110804l;

    /* JADX INFO: renamed from: m */
    public uqo0 f110805m;

    /* JADX INFO: renamed from: n */
    public kcg0 f110806n;

    /* JADX INFO: renamed from: o */
    public boolean f110807o;

    /* JADX INFO: renamed from: p */
    public jl80 f110808p;

    public hnm0(gio0 gio0Var, dum dumVar) {
        super(dumVar);
        this.f110801i = C22507a.m222758b();
        this.f110802j = C22507a.m222758b();
        this.f110803k = C22507a.m222758b();
        this.f110805m = new uqo0();
        this.f110804l = gio0Var;
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ C22421c m136161A4(qcj qcjVar, BLiveVoiceRoom bLiveVoiceRoom) {
        return (C22421c) qcjVar.call(bLiveVoiceRoom.f45172id);
    }

    /* JADX INFO: renamed from: B4 */
    public static /* synthetic */ void m136162B4(Throwable th) {
    }

    /* JADX INFO: renamed from: D5 */
    private void m136165D5() {
        m136224E5("", act().getString(R$string.f48438vf), act().getString(R$string.f48035d7));
    }

    /* JADX INFO: renamed from: E4 */
    private void m136166E4() {
        duringCreated(C22421c.combineLatest(C22421c.zip(this.f110802j, this.f110801i, new rcj() { // from class: l.gnm0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return hnm0.m136197i4((BLiveVoiceRoom) obj, (Boolean) obj2);
            }
        }), this.f110803k, new rcj() { // from class: l.nlm0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return hnm0.m136194f4((Boolean) obj, (uxj0) obj2);
            }
        })).filter(new qcj() { // from class: l.olm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147853a.m136236Q4((Boolean) obj);
            }
        }).doOnNext(new y20() { // from class: l.plm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153044a.m136237R4((Boolean) obj);
            }
        }).flatMap(new qcj() { // from class: l.qlm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f158240a.m136168I5(((Boolean) obj).booleanValue());
            }
        }).flatMap(new qcj() { // from class: l.rlm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163774a.m136210t5((BLiveVoiceRoom) obj);
            }
        }).flatMap(new qcj() { // from class: l.slm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f169394a.m136214v5((BLiveVoice) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.tlm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174838a.m136235P4((User) obj);
            }
        }, new xlm0(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H5 */
    private void m136167H5() {
        uqo0 uqo0Var = this.f110805m;
        BLiveVoiceRoom bLiveVoiceRoom = uqo0Var.f180498c;
        if (bLiveVoiceRoom == null || uqo0Var.f180496a == null || uqo0Var.f180497b == null) {
            return;
        }
        if (bLiveVoiceRoom.isMaskMode()) {
            ((jlm0) m213810E2()).m183404K2(this.f110804l.m130366g4());
        }
        ((jlm0) m213810E2()).mo168522i(this.f110805m.f180498c);
        ((jlm0) m213810E2()).m183409O2().mo122893n(this.f110805m.f180496a);
        ((jlm0) m213810E2()).m168473R(this.f110805m.f180497b);
        ((jlm0) m213810E2()).m168485V(this.f110805m.f180496a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I5 */
    public C22421c<BLiveVoiceRoom> m136168I5(final boolean z) {
        return duringCreated(C22421c.just(Boolean.valueOf(z))).flatMap(new qcj() { // from class: l.amm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72235a.m136259p5(z, (Boolean) obj);
            }
        }).doOnNext(new y20() { // from class: l.bmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77354a.m136260q5((BLiveVoiceRoom) obj);
            }
        }).doOnError(new y20() { // from class: l.cmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82627a.m136261r5((Throwable) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.dmm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return BLiveVoiceRoom.EMPTY_ROOM;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m136261r5(Throwable th) {
        String strM209910t;
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165634h(R$string.f47502E9);
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        final x20 x20Var = null;
        if (i != 41013) {
            if (i == 41008 || i == 41020 || i == 51013 || i == 43009 || i == 43025 || i == 43062 || i == 43014) {
                strM209910t = coreService.metaMessage;
            } else if (i == 41000 || i == 41002) {
                strM209910t = xau.m209910t(R$string.f48078f6);
            } else {
                if (i == 41010) {
                    m136218x5();
                    return;
                }
                if (i == 41005) {
                    strM209910t = xau.m209910t(R$string.f47561H2);
                } else if (i == 41014 || i == 41017 || i == 41018) {
                    strM209910t = xau.m209910t(R$string.f48466x);
                } else if (i == 41015) {
                    strM209910t = xau.m209910t(R$string.f48017cb);
                } else if (i == 41009) {
                    strM209910t = xau.m209910t(R$string.f47730P);
                } else if (i == 41042) {
                    strM209910t = act().getString(R$string.f47539G2);
                    x20Var = new x20() { // from class: l.ylm0
                        @Override // p153l.x20
                        public final void call() {
                            this.f200567a.m136247d5();
                        }
                    };
                } else if (i == 43010) {
                    m136218x5();
                    return;
                }
            }
            if (TextUtils.isEmpty(strM209910t)) {
            }
            act().dialog().m21503F(strM209910t).m21495B(false).m21559v0(xau.m209910t(R$string.f48494y5), new Runnable() { // from class: l.zlm0
                @Override // java.lang.Runnable
                public final void run() {
                    hnm0.m136175O3(x20Var);
                }
            }).m21567z0();
        }
        o1j0.m165634h(R$string.f48502yd);
        strM209910t = "";
        if (TextUtils.isEmpty(strM209910t)) {
            act().dialog().m21503F(strM209910t).m21495B(false).m21559v0(xau.m209910t(R$string.f48494y5), new Runnable() { // from class: l.zlm0
                @Override // java.lang.Runnable
                public final void run() {
                    hnm0.m136175O3(x20Var);
                }
            }).m21567z0();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m136175O3(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: O4 */
    private boolean m136176O4(BLiveVoiceRoom bLiveVoiceRoom) {
        return !TextUtils.equals(bLiveVoiceRoom.title, this.f110804l.m130365f4()) || jyb.m147479J(bLiveVoiceRoom.topics) || this.f110804l.m130363d4() == null || !TextUtils.equals(bLiveVoiceRoom.topics.get(0).name, this.f110804l.m130363d4().name);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ User m136180T3(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public /* synthetic */ void m136181T4(vxj0 vxj0Var) {
        m136230I4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m136183U4(jsv jsvVar) {
        if (jsvVar.m146875a() != 4) {
            return;
        }
        m136208s5((v9s) jsvVar);
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ Boolean m136194f4(Boolean bool, uxj0 uxj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ Boolean m136197i4(BLiveVoiceRoom bLiveVoiceRoom, Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ void m136199k4() {
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ BLiveVoiceRoom m136203o4(Pair pair) {
        return (BLiveVoiceRoom) pair.first;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s5 */
    private void m136208s5(v9s v9sVar) {
        String strM200457l = v9sVar.m200457l();
        m213811F2().ChatEvent.dismissDialog().m199277p();
        JumpRoomData jumpRoomDataM200458m = v9sVar.m200458m();
        if (jumpRoomDataM200458m != null) {
            act().startActivity(z91.m219041a(zrv.f205803e, AudienceStartData.getBuilder().m68777E(jumpRoomDataM200458m.getToLiveId()).m68787O(jumpRoomDataM200458m.getSource()).m68789Q(true).m68794u()));
        } else if (v9sVar.m200459n()) {
            act().startActivity(VoiceLiveEndAct.m79438X1(act(), ((jlm0) m213810E2()).m183409O2().mo122892l(), ((jlm0) m213810E2()).m183409O2().mo122891j(), ((jlm0) m213810E2()).m168532l0(), strM200457l));
        } else {
            LiveDialogAct.m68360h2(act(), "", strM200457l);
        }
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t5 */
    public C22421c<BLiveVoice> m136210t5(BLiveVoiceRoom bLiveVoiceRoom) {
        return duringCreated(C22421c.just(bLiveVoiceRoom).flatMap(new qcj() { // from class: l.smm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f169591a.m136248e5((BLiveVoiceRoom) obj);
            }
        })).doOnNext(new y20() { // from class: l.umm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179659a.m136249f5((BLiveVoice) obj);
            }
        }).doOnError(new y20() { // from class: l.vmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184741a.m136250g5((Throwable) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.wmm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return BLiveVoice.EMPTY;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5, reason: merged with bridge method [inline-methods] */
    public void m136235P4(User user) {
        lej0.INSTANCE.m153909c("create_voice_room", "voice_prepareUser");
        act().progressDismiss();
        if (user != null) {
            this.f110805m.m197373a(user);
            m136167H5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public C22421c<User> m136214v5(final BLiveVoice bLiveVoice) {
        return duringCreated(C22421c.just(bLiveVoice).flatMap(new qcj() { // from class: l.emm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hnm0.m136217x4(bLiveVoice, (BLiveVoice) obj);
            }
        })).doOnError(new xlm0(this)).onErrorReturn(new qcj() { // from class: l.fmm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hnm0.m136180T3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    private void m136216w5(String str, String str2, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4460e c4460eM21495B = act().dialog().m21503F(str).m21495B(false);
        Objects.requireNonNull(x20Var);
        c4460eM21495B.m21543n0(str2, new bri0(x20Var)).m21567z0();
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ C22421c m136217x4(BLiveVoice bLiveVoice, BLiveVoice bLiveVoice2) {
        return bLiveVoice == BLiveVoice.EMPTY ? C22421c.just(null) : itv.m142093Q(bLiveVoice.f45171id);
    }

    /* JADX INFO: renamed from: x5 */
    private void m136218x5() {
        duringCreated(VoiceRoomApiProvider.getAnchorInfo(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.qmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158383a.m136252i5((BLiveAnchor) obj);
            }
        }, new y20() { // from class: l.rmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163891a.m136253j5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A5 */
    public void m136221A5(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f110805m.m197375c(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: B5 */
    public void m136222B5(boolean z) {
        this.f110801i.m137019l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: C5 */
    public final void m136223C5() {
        if (this.f110808p == null) {
            this.f110808p = act().newDialog().m146055x0(R$string.f48419ui, new Object[0]).m146050s0(R$string.f48375si, new Object[0]).m146048q0(8388611).m146032a0(R$string.f48397ti, new Runnable() { // from class: l.vlm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184617a.m136254k5();
                }
            }).m146026U(R$string.f48353ri, new Runnable() { // from class: l.wlm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189712a.m136255l5();
                }
            }).m146020O();
        }
        this.f110808p.show();
    }

    /* JADX INFO: renamed from: E5 */
    public void m136224E5(String str, String str2, String str3) {
        act().dialog().m21506G0(str).m21503F(str2).m21559v0(str3, new Runnable() { // from class: l.fnm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99935a.m136256m5();
            }
        }).m21542m0(act().getString(R$string.f48510z)).m21567z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    public final void m136225F4() {
        BLiveVoiceCall bLiveVoiceCallM183423Y2 = ((jlm0) m213810E2()).m183423Y2();
        if (bLiveVoiceCallM183423Y2 != null) {
            duringCreated(VoiceRoomApiProvider.bossAnchorAway(bLiveVoiceCallM183423Y2.f45333id)).subscribe(dhw.m115826e(new y20() { // from class: l.zmm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205086a.m136238S4((uxj0) obj);
                }
            }, new r5k()));
        }
    }

    /* JADX INFO: renamed from: F5 */
    public void m136226F5(String str) {
        m136228G5(str, null);
    }

    /* JADX INFO: renamed from: G4 */
    public void m136227G4() {
        duringCreated(VoiceRoomApiProvider.getOnGoingLive(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.mlm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137425a.m136241X4((List) obj);
            }
        }, new xlm0(this)));
    }

    /* JADX INFO: renamed from: G5 */
    public final void m136228G5(String str, final JumpRoomData jumpRoomData) {
        this.f110807o = true;
        ((h0m) m138856F3(new z310(2600))).mo133183b();
        act().progress(R$string.f47901X2);
        duringCreated(itv.m142096T(str)).subscribe(dhw.m115826e(new y20() { // from class: l.xmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195103a.m136257n5(jumpRoomData, (BLiveVoice) obj);
            }
        }, new y20() { // from class: l.ymm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200681a.m136258o5(jumpRoomData, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final void m136229H4(boolean z, String str, boolean z2, JumpRoomData jumpRoomData) {
        if (!z) {
            act().progressDismiss();
            if (((jlm0) m213810E2()).m202193m().m146877c()) {
                return;
            }
            v9s v9sVar = v9s.f183031e;
            v9sVar.m200461p(jumpRoomData);
            ((jlm0) m213810E2()).mo160116h(v9sVar);
            return;
        }
        h0m h0mVar = (h0m) m138856F3(new z310(2600));
        if (h0mVar != null) {
            h0mVar.mo133183b();
        }
        if (this.f110807o || ((jlm0) m213810E2()).m202193m().m146877c()) {
            return;
        }
        v9s v9sVar2 = new v9s(str, z2);
        if (jumpRoomData != null) {
            v9sVar2.m200461p(jumpRoomData);
        }
        ((jlm0) m213810E2()).mo160116h(v9sVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I4 */
    public void m136230I4() {
        if (((jlm0) m213810E2()).m202193m().m146880f()) {
            act().m68056e2();
        } else if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(((jlm0) m213810E2()).mo183435j().liveMode)) {
            m136223C5();
        } else {
            m136165D5();
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m136231J4(final qcj<String, C22421c<BLiveVoice>> qcjVar) {
        duringCreated(C22421c.zip(VoiceRoomApiProvider.getRoomInfo(zrv.f205799a.m207631D0()), VoiceRoomApiProvider.getUserMask(zrv.f205799a.m207631D0()), new rcj() { // from class: l.gmm0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((BLiveVoiceRoom) obj, (BLiveUserMask) obj2);
            }
        }).doOnNext(new y20() { // from class: l.hmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110645a.m136242Y4((Pair) obj);
            }
        }).doOnNext(new y20() { // from class: l.jmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121689a.m136243Z4((Pair) obj);
            }
        }).map(new qcj() { // from class: l.kmm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hnm0.m136203o4((Pair) obj);
            }
        }).flatMap(new qcj() { // from class: l.lmm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hnm0.m136161A4(qcjVar, (BLiveVoiceRoom) obj);
            }
        }).doOnNext(new y20() { // from class: l.mmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137621a.m136244a5((BLiveVoice) obj);
            }
        }).flatMap(new qcj() { // from class: l.nmm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return itv.m142093Q(((BLiveVoice) obj).f45171id);
            }
        }).doOnNext(new y20() { // from class: l.omm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147978a.m136245b5((User) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.pmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153204a.m136246c5((User) obj);
            }
        }, new xlm0(this)));
    }

    /* JADX INFO: renamed from: K4 */
    public void m136232K4(x20 x20Var, x20 x20Var2) {
        if (this.f110802j.m222761e() == null) {
            x20Var.call();
        }
        if (this.f110801i.m222761e() == null) {
            x20Var2.call();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m136233L4() {
        this.f110803k.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: N4 */
    public final boolean m136234N4(BLiveVoiceRoom bLiveVoiceRoom) {
        return bLiveVoiceRoom.isMaskMode() != this.f110804l.m130367h4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ Boolean m136236Q4(Boolean bool) {
        return Boolean.valueOf(!((jlm0) m213810E2()).m202193m().m146884j());
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m136237R4(Boolean bool) {
        act().progress(R$string.f47951Za);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m136238S4(uxj0 uxj0Var) {
        ((jlm0) m213810E2()).m183403J3(true);
        ((h0m) m138856F3(new z310(2600))).mo133183b();
        pvn.m173967b();
        ((LiveAct) act()).m68056e2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m136166E4();
        duringCreated(m213811F2().LivePusherEvent.closeLive().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.imm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115795a.m136181T4((vxj0) obj);
            }
        }));
        duringCreated(((jlm0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.tmm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174949a.m136183U4((jsv) obj);
            }
        }));
        this.f110806n = ((jlm0) m213810E2()).m168541o1(this.f196919f).subscribe(dhw.m115825d(new y20() { // from class: l.bnm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77563a.m136240W4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m136239V4(BLiveVoice bLiveVoice) {
        m136229H4(true, xau.m209910t(R$string.f47778R5), false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m136240W4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((jlm0) m213810E2()).mo118370K1(((jlm0) m213810E2()).m202191k());
                break;
            case "system":
                m136216w5(liveControlMessage.content, xau.m209910t(R$string.f48494y5), new x20() { // from class: l.cnm0
                    @Override // p153l.x20
                    public final void call() {
                        hnm0.m136199k4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                muj.m160221w(false);
                ((jlm0) m213810E2()).m168445A1(new uxj.C20693a(((jlm0) m213810E2()).m202194o(), ((jlm0) m213810E2()).m168532l0().f56859id, "live").m198494f(), null);
                break;
            case "stop":
                m136229H4(true, xau.m209910t(R$string.f48078f6), true, null);
                break;
            case "force_stop":
                m136229H4(true, liveControlMessage.content, true, null);
                break;
            case "forbidden_multidevice":
                if (!liveControlMessage.isAnchor) {
                    itv.m142096T(((jlm0) m213810E2()).m202191k()).subscribe(dhw.m115826e(new y20() { // from class: l.dnm0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f89816a.m136239V4((BLiveVoice) obj);
                        }
                    }, new y20() { // from class: l.enm0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            hnm0.m136162B4((Throwable) obj);
                        }
                    }));
                    break;
                } else {
                    m136229H4(true, xau.m209910t(R$string.f47820T5), false, null);
                    break;
                }
                break;
        }
        nsh0.m164609k(liveControlMessage.toString(), "[live][voice]", "[passivity_exit]");
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m136241X4(List list) {
        if (jyb.m147479J(list)) {
            LiveDialogAct.m68360h2(act(), "", xau.m209910t(R$string.f48078f6));
            return;
        }
        final BLiveVoice bLiveVoice = (BLiveVoice) list.get(0);
        this.f110805m.m197374b(bLiveVoice);
        m136231J4(new qcj() { // from class: l.ulm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(bLiveVoice);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m136242Y4(Pair pair) {
        this.f110805m.m197375c((BLiveVoiceRoom) pair.first);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m136243Z4(Pair pair) {
        this.f110804l.m130379w4((BLiveUserMask) pair.second);
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m136244a5(BLiveVoice bLiveVoice) {
        this.f110805m.m197374b(bLiveVoice);
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m136245b5(User user) {
        this.f110805m.m197373a(user);
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m136246c5(User user) {
        m136167H5();
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m136247d5() {
        act().m68056e2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ C22421c m136248e5(BLiveVoiceRoom bLiveVoiceRoom) {
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            return C22421c.just(BLiveVoice.EMPTY);
        }
        BLiveVoice bLiveVoice = this.f110805m.f180496a;
        return bLiveVoice != null ? C22421c.just(bLiveVoice) : itv.m142116s(bLiveVoiceRoom.f45172id, this.f110804l.m130380x4(), ((jlm0) m213810E2()).f165204a0, this.f110804l.m130364e4());
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m136249f5(BLiveVoice bLiveVoice) {
        this.f110805m.m197374b(bLiveVoice);
        lej0.INSTANCE.m153909c("create_voice_room", "voice_prepareLive");
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m136251h5() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m136252i5(BLiveAnchor bLiveAnchor) {
        if (TEnum.equals(bLiveAnchor.status, "jailed")) {
            act().dialog().m21503F(xau.m209911u(R$string.f48061eb, pzi0.m174455p(bLiveAnchor.availableTime))).m21495B(false).m21559v0(xau.m209910t(R$string.f48494y5), new Runnable() { // from class: l.anm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72367a.m136251h5();
                }
            }).m21567z0();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m136254k5() {
        m136225F4();
        this.f110808p.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m136255l5() {
        m136226F5(((jlm0) m213810E2()).m202191k());
        this.f110808p.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m136256m5() {
        m136226F5(((jlm0) m213810E2()).m202191k());
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f110806n);
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m136257n5(JumpRoomData jumpRoomData, BLiveVoice bLiveVoice) {
        m136229H4(false, null, true, jumpRoomData);
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m136258o5(JumpRoomData jumpRoomData, Throwable th) {
        m136229H4(false, null, true, jumpRoomData);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ C22421c m136259p5(boolean z, Boolean bool) {
        if (z) {
            return C22421c.just(this.f110805m.f180498c);
        }
        String strTrim = this.f110804l.m130365f4().trim();
        BLiveVoiceTopic bLiveVoiceTopicM130363d4 = this.f110804l.m130363d4();
        String str = bLiveVoiceTopicM130363d4 != null ? bLiveVoiceTopicM130363d4.f45362id : "";
        BLiveVoiceRoom bLiveVoiceRoom = this.f110805m.f180498c;
        if (bLiveVoiceRoom != null && !m136176O4(bLiveVoiceRoom) && !m136234N4(this.f110805m.f180498c)) {
            return C22421c.just(this.f110805m.f180498c);
        }
        BLiveVoiceRoom bLiveVoiceRoom2 = new BLiveVoiceRoom();
        bLiveVoiceRoom2.title = strTrim;
        ArrayList arrayList = new ArrayList();
        bLiveVoiceRoom2.topicIds = arrayList;
        if (bLiveVoiceTopicM130363d4 != null) {
            arrayList.add(str);
        }
        bLiveVoiceRoom2.maskMode = this.f110804l.m130367h4();
        BLiveVoiceRoom bLiveVoiceRoom3 = this.f110805m.f180498c;
        if (bLiveVoiceRoom3 == null) {
            return itv.m142118u(bLiveVoiceRoom2);
        }
        bLiveVoiceRoom2.f45172id = bLiveVoiceRoom3.f45172id;
        if (m136176O4(bLiveVoiceRoom3)) {
            bLiveVoiceRoom2.addField("title,topic");
        }
        bLiveVoiceRoom2.addField("maskMode");
        return itv.m142085I(this.f110805m.f180498c.f45172id, bLiveVoiceRoom2);
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m136260q5(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f110805m.m197375c(bLiveVoiceRoom);
        lej0.INSTANCE.m153909c("create_voice_room", "voice_updateRoom");
    }

    /* JADX INFO: renamed from: y5 */
    public void m136262y5(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f110802j.m137019l(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: z5 */
    public void m136263z5(BLiveVoice bLiveVoice) {
        this.f110805m.m197374b(bLiveVoice);
    }
}
