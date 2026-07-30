package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.LiveDialogAct;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class dem0 extends pat<fcm0> {

    /* JADX INFO: renamed from: i */
    public final C22392a<Boolean> f85811i;

    /* JADX INFO: renamed from: j */
    public final C22392a<BLiveVoiceRoom> f85812j;

    /* JADX INFO: renamed from: k */
    public final C22392a<roj0> f85813k;

    /* JADX INFO: renamed from: l */
    public final c9o0 f85814l;

    /* JADX INFO: renamed from: m */
    public qho0 f85815m;

    /* JADX INFO: renamed from: n */
    public c4g0 f85816n;

    /* JADX INFO: renamed from: o */
    public boolean f85817o;

    /* JADX INFO: renamed from: p */
    public dd80 f85818p;

    public dem0(c9o0 c9o0Var, bsm bsmVar) {
        super(bsmVar);
        this.f85811i = C22392a.m221512b();
        this.f85812j = C22392a.m221512b();
        this.f85813k = C22392a.m221512b();
        this.f85815m = new qho0();
        this.f85814l = c9o0Var;
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ C22306c m111282A4(w9j w9jVar, BLiveVoiceRoom bLiveVoiceRoom) {
        return (C22306c) w9jVar.call(bLiveVoiceRoom.f44324id);
    }

    /* JADX INFO: renamed from: B4 */
    public static /* synthetic */ void m111283B4(Throwable th) {
    }

    /* JADX INFO: renamed from: D5 */
    private void m111286D5() {
        m111345E5("", act().getString(R$string.f47590vf), act().getString(R$string.f47187d7));
    }

    /* JADX INFO: renamed from: E4 */
    private void m111287E4() {
        duringCreated(C22306c.combineLatest(C22306c.zip(this.f85812j, this.f85811i, new x9j() { // from class: l.cem0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return dem0.m111318i4((BLiveVoiceRoom) obj, (Boolean) obj2);
            }
        }), this.f85813k, new x9j() { // from class: l.jcm0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return dem0.m111315f4((Boolean) obj, (roj0) obj2);
            }
        })).filter(new w9j() { // from class: l.kcm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122497a.m111357Q4((Boolean) obj);
            }
        }).doOnNext(new e30() { // from class: l.lcm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127437a.m111358R4((Boolean) obj);
            }
        }).flatMap(new w9j() { // from class: l.mcm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133156a.m111289I5(((Boolean) obj).booleanValue());
            }
        }).flatMap(new w9j() { // from class: l.ncm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138217a.m111331t5((BLiveVoiceRoom) obj);
            }
        }).flatMap(new w9j() { // from class: l.ocm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f143054a.m111335v5((BLiveVoice) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.pcm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148197a.m111356P4((User) obj);
            }
        }, new tcm0(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H5 */
    private void m111288H5() {
        qho0 qho0Var = this.f85815m;
        BLiveVoiceRoom bLiveVoiceRoom = qho0Var.f154503c;
        if (bLiveVoiceRoom == null || qho0Var.f154501a == null || qho0Var.f154502b == null) {
            return;
        }
        if (bLiveVoiceRoom.isMaskMode()) {
            ((fcm0) m206027E2()).m160242K2(this.f85814l.m105881g4());
        }
        ((fcm0) m206027E2()).mo132136i(this.f85815m.f154503c);
        ((fcm0) m206027E2()).m160247O2().mo165471n(this.f85815m.f154501a);
        ((fcm0) m206027E2()).m132087R(this.f85815m.f154502b);
        ((fcm0) m206027E2()).m132099V(this.f85815m.f154501a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I5 */
    public C22306c<BLiveVoiceRoom> m111289I5(final boolean z) {
        return duringCreated(C22306c.just(Boolean.valueOf(z))).flatMap(new w9j() { // from class: l.wcm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185698a.m111380p5(z, (Boolean) obj);
            }
        }).doOnNext(new e30() { // from class: l.xcm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192243a.m111381q5((BLiveVoiceRoom) obj);
            }
        }).doOnError(new e30() { // from class: l.ycm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197459a.m111382r5((Throwable) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.zcm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return BLiveVoiceRoom.EMPTY_ROOM;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m111382r5(Throwable th) {
        String strM202217t;
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151578h(R$string.f46654E9);
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        final d30 d30Var = null;
        if (i != 41013) {
            if (i == 41008 || i == 41020 || i == 51013 || i == 43009 || i == 43025 || i == 43062 || i == 43014) {
                strM202217t = coreService.metaMessage;
            } else if (i == 41000 || i == 41002) {
                strM202217t = w8u.m202217t(R$string.f47230f6);
            } else {
                if (i == 41010) {
                    m111339x5();
                    return;
                }
                if (i == 41005) {
                    strM202217t = w8u.m202217t(R$string.f46713H2);
                } else if (i == 41014 || i == 41017 || i == 41018) {
                    strM202217t = w8u.m202217t(R$string.f47618x);
                } else if (i == 41015) {
                    strM202217t = w8u.m202217t(R$string.f47169cb);
                } else if (i == 41009) {
                    strM202217t = w8u.m202217t(R$string.f46882P);
                } else if (i == 41042) {
                    strM202217t = act().getString(R$string.f46691G2);
                    d30Var = new d30() { // from class: l.ucm0
                        @Override // p149l.d30
                        public final void call() {
                            this.f175837a.m111368d5();
                        }
                    };
                } else if (i == 43010) {
                    m111339x5();
                    return;
                }
            }
            if (TextUtils.isEmpty(strM202217t)) {
            }
            act().dialog().m20504F(strM202217t).m20496B(false).m20560v0(w8u.m202217t(R$string.f47646y5), new Runnable() { // from class: l.vcm0
                @Override // java.lang.Runnable
                public final void run() {
                    dem0.m111296O3(d30Var);
                }
            }).m20568z0();
        }
        lsi0.m151578h(R$string.f47654yd);
        strM202217t = "";
        if (TextUtils.isEmpty(strM202217t)) {
            act().dialog().m20504F(strM202217t).m20496B(false).m20560v0(w8u.m202217t(R$string.f47646y5), new Runnable() { // from class: l.vcm0
                @Override // java.lang.Runnable
                public final void run() {
                    dem0.m111296O3(d30Var);
                }
            }).m20568z0();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m111296O3(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: O4 */
    private boolean m111297O4(BLiveVoiceRoom bLiveVoiceRoom) {
        return !TextUtils.equals(bLiveVoiceRoom.title, this.f85814l.m105880f4()) || vwb.m200296J(bLiveVoiceRoom.topics) || this.f85814l.m105878d4() == null || !TextUtils.equals(bLiveVoiceRoom.topics.get(0).name, this.f85814l.m105878d4().name);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ User m111301T3(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public /* synthetic */ void m111302T4(soj0 soj0Var) {
        m111351I4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m111304U4(iqv iqvVar) {
        if (iqvVar.m137794a() != 4) {
            return;
        }
        m111329s5((u7s) iqvVar);
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ Boolean m111315f4(Boolean bool, roj0 roj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ Boolean m111318i4(BLiveVoiceRoom bLiveVoiceRoom, Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ void m111320k4() {
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ BLiveVoiceRoom m111324o4(Pair pair) {
        return (BLiveVoiceRoom) pair.first;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s5 */
    private void m111329s5(u7s u7sVar) {
        String strM192152l = u7sVar.m192152l();
        m206028F2().ChatEvent.dismissDialog().m172467p();
        JumpRoomData jumpRoomDataM192153m = u7sVar.m192153m();
        if (jumpRoomDataM192153m != null) {
            act().startActivity(s91.m182688a(ypv.f199497e, AudienceStartData.getBuilder().m67594E(jumpRoomDataM192153m.getToLiveId()).m67604O(jumpRoomDataM192153m.getSource()).m67606Q(true).m67611u()));
        } else if (u7sVar.m192154n()) {
            act().startActivity(VoiceLiveEndAct.m78255V1(act(), ((fcm0) m206027E2()).m160247O2().mo165470l(), ((fcm0) m206027E2()).m160247O2().mo165469j(), ((fcm0) m206027E2()).m132146l0(), strM192152l));
        } else {
            LiveDialogAct.m67177g2(act(), "", strM192152l);
        }
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t5 */
    public C22306c<BLiveVoice> m111331t5(BLiveVoiceRoom bLiveVoiceRoom) {
        return duringCreated(C22306c.just(bLiveVoiceRoom).flatMap(new w9j() { // from class: l.odm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f143219a.m111369e5((BLiveVoiceRoom) obj);
            }
        })).doOnNext(new e30() { // from class: l.qdm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153943a.m111370f5((BLiveVoice) obj);
            }
        }).doOnError(new e30() { // from class: l.rdm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158951a.m111371g5((Throwable) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.sdm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return BLiveVoice.EMPTY;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5, reason: merged with bridge method [inline-methods] */
    public void m111356P4(User user) {
        h5j0.INSTANCE.m129404c("create_voice_room", "voice_prepareUser");
        act().progressDismiss();
        if (user != null) {
            this.f85815m.m174577a(user);
            m111288H5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public C22306c<User> m111335v5(final BLiveVoice bLiveVoice) {
        return duringCreated(C22306c.just(bLiveVoice).flatMap(new w9j() { // from class: l.adm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dem0.m111338x4(bLiveVoice, (BLiveVoice) obj);
            }
        })).doOnError(new tcm0(this)).onErrorReturn(new w9j() { // from class: l.bdm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dem0.m111301T3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    private void m111337w5(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4309e c4309eM20496B = act().dialog().m20504F(str).m20496B(false);
        Objects.requireNonNull(d30Var);
        c4309eM20496B.m20544n0(str2, new bii0(d30Var)).m20568z0();
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ C22306c m111338x4(BLiveVoice bLiveVoice, BLiveVoice bLiveVoice2) {
        return bLiveVoice == BLiveVoice.EMPTY ? C22306c.just(null) : hrv.m132734Q(bLiveVoice.f44323id);
    }

    /* JADX INFO: renamed from: x5 */
    private void m111339x5() {
        duringCreated(VoiceRoomApiProvider.getAnchorInfo(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.mdm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133277a.m111373i5((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.ndm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138289a.m111374j5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A5 */
    public void m111342A5(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f85815m.m174579c(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: B5 */
    public void m111343B5(boolean z) {
        this.f85811i.m132487l(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: C5 */
    public final void m111344C5() {
        if (this.f85818p == null) {
            this.f85818p = act().newDialog().m110995x0(R$string.f47571ui, new Object[0]).m110990s0(R$string.f47527si, new Object[0]).m110988q0(8388611).m110972a0(R$string.f47549ti, new Runnable() { // from class: l.rcm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158801a.m111375k5();
                }
            }).m110966U(R$string.f47505ri, new Runnable() { // from class: l.scm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163756a.m111376l5();
                }
            }).m110960O();
        }
        this.f85818p.show();
    }

    /* JADX INFO: renamed from: E5 */
    public void m111345E5(String str, String str2, String str3) {
        act().dialog().m20507G0(str).m20504F(str2).m20560v0(str3, new Runnable() { // from class: l.bem0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75173a.m111377m5();
            }
        }).m20543m0(act().getString(R$string.f47662z)).m20568z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    public final void m111346F4() {
        BLiveVoiceCall bLiveVoiceCallM160261Y2 = ((fcm0) m206027E2()).m160261Y2();
        if (bLiveVoiceCallM160261Y2 != null) {
            duringCreated(VoiceRoomApiProvider.bossAnchorAway(bLiveVoiceCallM160261Y2.f44485id)).subscribe(ffw.m121194e(new e30() { // from class: l.vdm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181099a.m111359S4((roj0) obj);
                }
            }, new z2k()));
        }
    }

    /* JADX INFO: renamed from: F5 */
    public void m111347F5(String str) {
        m111349G5(str, null);
    }

    /* JADX INFO: renamed from: G4 */
    public void m111348G4() {
        duringCreated(VoiceRoomApiProvider.getOnGoingLive(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.icm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112471a.m111362X4((List) obj);
            }
        }, new tcm0(this)));
    }

    /* JADX INFO: renamed from: G5 */
    public final void m111349G5(String str, final JumpRoomData jumpRoomData) {
        this.f85817o = true;
        ((oxl) m129297F3(new rv00(2600))).mo133472b();
        act().progress(R$string.f47053X2);
        duringCreated(hrv.m132737T(str)).subscribe(ffw.m121194e(new e30() { // from class: l.tdm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169572a.m111378n5(jumpRoomData, (BLiveVoice) obj);
            }
        }, new e30() { // from class: l.udm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175933a.m111379o5(jumpRoomData, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final void m111350H4(boolean z, String str, boolean z2, JumpRoomData jumpRoomData) {
        if (!z) {
            act().progressDismiss();
            if (((fcm0) m206027E2()).m149816m().m137796c()) {
                return;
            }
            u7s u7sVar = u7s.f175055e;
            u7sVar.m192156p(jumpRoomData);
            ((fcm0) m206027E2()).mo149812h(u7sVar);
            return;
        }
        oxl oxlVar = (oxl) m129297F3(new rv00(2600));
        if (oxlVar != null) {
            oxlVar.mo133472b();
        }
        if (this.f85817o || ((fcm0) m206027E2()).m149816m().m137796c()) {
            return;
        }
        u7s u7sVar2 = new u7s(str, z2);
        if (jumpRoomData != null) {
            u7sVar2.m192156p(jumpRoomData);
        }
        ((fcm0) m206027E2()).mo149812h(u7sVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I4 */
    public void m111351I4() {
        if (((fcm0) m206027E2()).m149816m().m137799f()) {
            act().m66873d2();
        } else if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(((fcm0) m206027E2()).mo149813j().liveMode)) {
            m111344C5();
        } else {
            m111286D5();
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m111352J4(final w9j<String, C22306c<BLiveVoice>> w9jVar) {
        duringCreated(C22306c.zip(VoiceRoomApiProvider.getRoomInfo(ypv.f199493a.m199309D0()), VoiceRoomApiProvider.getUserMask(ypv.f199493a.m199309D0()), new x9j() { // from class: l.cdm0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((BLiveVoiceRoom) obj, (BLiveUserMask) obj2);
            }
        }).doOnNext(new e30() { // from class: l.ddm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85609a.m111363Y4((Pair) obj);
            }
        }).doOnNext(new e30() { // from class: l.fdm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97060a.m111364Z4((Pair) obj);
            }
        }).map(new w9j() { // from class: l.gdm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dem0.m111324o4((Pair) obj);
            }
        }).flatMap(new w9j() { // from class: l.hdm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dem0.m111282A4(w9jVar, (BLiveVoiceRoom) obj);
            }
        }).doOnNext(new e30() { // from class: l.idm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112664a.m111365a5((BLiveVoice) obj);
            }
        }).flatMap(new w9j() { // from class: l.jdm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hrv.m132734Q(((BLiveVoice) obj).f44323id);
            }
        }).doOnNext(new e30() { // from class: l.kdm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122569a.m111366b5((User) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.ldm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127568a.m111367c5((User) obj);
            }
        }, new tcm0(this)));
    }

    /* JADX INFO: renamed from: K4 */
    public void m111353K4(d30 d30Var, d30 d30Var2) {
        if (this.f85812j.m221515e() == null) {
            d30Var.call();
        }
        if (this.f85811i.m221515e() == null) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m111354L4() {
        this.f85813k.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: N4 */
    public final boolean m111355N4(BLiveVoiceRoom bLiveVoiceRoom) {
        return bLiveVoiceRoom.isMaskMode() != this.f85814l.m105882h4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ Boolean m111357Q4(Boolean bool) {
        return Boolean.valueOf(!((fcm0) m206027E2()).m149816m().m137803j());
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m111358R4(Boolean bool) {
        act().progress(R$string.f47103Za);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m111359S4(roj0 roj0Var) {
        ((fcm0) m206027E2()).m160241J3(true);
        ((oxl) m129297F3(new rv00(2600))).mo133472b();
        ptn.m171362b();
        ((LiveAct) act()).m66873d2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m111287E4();
        duringCreated(m206028F2().LivePusherEvent.closeLive().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.edm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90627a.m111302T4((soj0) obj);
            }
        }));
        duringCreated(((fcm0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.pdm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148315a.m111304U4((iqv) obj);
            }
        }));
        this.f85816n = ((fcm0) m206027E2()).m132156o1(this.f188513f).subscribe(ffw.m121193d(new e30() { // from class: l.xdm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192423a.m111361W4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m111360V4(BLiveVoice bLiveVoice) {
        m111350H4(true, w8u.m202217t(R$string.f46930R5), false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m111361W4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((fcm0) m206027E2()).mo132074K1(((fcm0) m206027E2()).m149814k());
                break;
            case "system":
                m111337w5(liveControlMessage.content, w8u.m202217t(R$string.f47646y5), new d30() { // from class: l.ydm0
                    @Override // p149l.d30
                    public final void call() {
                        dem0.m111320k4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.m205257w(false);
                ((fcm0) m206027E2()).m132055A1(new evj.C16689a(((fcm0) m206027E2()).m149818o(), ((fcm0) m206027E2()).m132146l0().f56011id, "live").m118277f(), null);
                break;
            case "stop":
                m111350H4(true, w8u.m202217t(R$string.f47230f6), true, null);
                break;
            case "force_stop":
                m111350H4(true, liveControlMessage.content, true, null);
                break;
            case "forbidden_multidevice":
                if (!liveControlMessage.isAnchor) {
                    hrv.m132737T(((fcm0) m206027E2()).m149814k()).subscribe(ffw.m121194e(new e30() { // from class: l.zdm0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f202684a.m111360V4((BLiveVoice) obj);
                        }
                    }, new e30() { // from class: l.aem0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            dem0.m111283B4((Throwable) obj);
                        }
                    }));
                    break;
                } else {
                    m111350H4(true, w8u.m202217t(R$string.f46972T5), false, null);
                    break;
                }
                break;
        }
        gkh0.m126628k(liveControlMessage.toString(), "[live][voice]", "[passivity_exit]");
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m111362X4(List list) {
        if (vwb.m200296J(list)) {
            LiveDialogAct.m67177g2(act(), "", w8u.m202217t(R$string.f47230f6));
            return;
        }
        final BLiveVoice bLiveVoice = (BLiveVoice) list.get(0);
        this.f85815m.m174578b(bLiveVoice);
        m111352J4(new w9j() { // from class: l.qcm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(bLiveVoice);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m111363Y4(Pair pair) {
        this.f85815m.m174579c((BLiveVoiceRoom) pair.first);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m111364Z4(Pair pair) {
        this.f85814l.m105894w4((BLiveUserMask) pair.second);
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m111365a5(BLiveVoice bLiveVoice) {
        this.f85815m.m174578b(bLiveVoice);
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m111366b5(User user) {
        this.f85815m.m174577a(user);
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m111367c5(User user) {
        m111288H5();
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m111368d5() {
        act().m66873d2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ C22306c m111369e5(BLiveVoiceRoom bLiveVoiceRoom) {
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            return C22306c.just(BLiveVoice.EMPTY);
        }
        BLiveVoice bLiveVoice = this.f85815m.f154501a;
        return bLiveVoice != null ? C22306c.just(bLiveVoice) : hrv.m132757s(bLiveVoiceRoom.f44324id, this.f85814l.m105895x4(), ((fcm0) m206027E2()).f139757a0, this.f85814l.m105879e4());
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m111370f5(BLiveVoice bLiveVoice) {
        this.f85815m.m174578b(bLiveVoice);
        h5j0.INSTANCE.m129404c("create_voice_room", "voice_prepareLive");
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m111372h5() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m111373i5(BLiveAnchor bLiveAnchor) {
        if (TEnum.equals(bLiveAnchor.status, "jailed")) {
            act().dialog().m20504F(w8u.m202218u(R$string.f47213eb, mqi0.m155945p(bLiveAnchor.availableTime))).m20496B(false).m20560v0(w8u.m202217t(R$string.f47646y5), new Runnable() { // from class: l.wdm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185811a.m111372h5();
                }
            }).m20568z0();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m111375k5() {
        m111346F4();
        this.f85818p.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m111376l5() {
        m111347F5(((fcm0) m206027E2()).m149814k());
        this.f85818p.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m111377m5() {
        m111347F5(((fcm0) m206027E2()).m149814k());
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f85816n);
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m111378n5(JumpRoomData jumpRoomData, BLiveVoice bLiveVoice) {
        m111350H4(false, null, true, jumpRoomData);
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m111379o5(JumpRoomData jumpRoomData, Throwable th) {
        m111350H4(false, null, true, jumpRoomData);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ C22306c m111380p5(boolean z, Boolean bool) {
        if (z) {
            return C22306c.just(this.f85815m.f154503c);
        }
        String strTrim = this.f85814l.m105880f4().trim();
        BLiveVoiceTopic bLiveVoiceTopicM105878d4 = this.f85814l.m105878d4();
        String str = bLiveVoiceTopicM105878d4 != null ? bLiveVoiceTopicM105878d4.f44514id : "";
        BLiveVoiceRoom bLiveVoiceRoom = this.f85815m.f154503c;
        if (bLiveVoiceRoom != null && !m111297O4(bLiveVoiceRoom) && !m111355N4(this.f85815m.f154503c)) {
            return C22306c.just(this.f85815m.f154503c);
        }
        BLiveVoiceRoom bLiveVoiceRoom2 = new BLiveVoiceRoom();
        bLiveVoiceRoom2.title = strTrim;
        ArrayList arrayList = new ArrayList();
        bLiveVoiceRoom2.topicIds = arrayList;
        if (bLiveVoiceTopicM105878d4 != null) {
            arrayList.add(str);
        }
        bLiveVoiceRoom2.maskMode = this.f85814l.m105882h4();
        BLiveVoiceRoom bLiveVoiceRoom3 = this.f85815m.f154503c;
        if (bLiveVoiceRoom3 == null) {
            return hrv.m132759u(bLiveVoiceRoom2);
        }
        bLiveVoiceRoom2.f44324id = bLiveVoiceRoom3.f44324id;
        if (m111297O4(bLiveVoiceRoom3)) {
            bLiveVoiceRoom2.addField("title,topic");
        }
        bLiveVoiceRoom2.addField("maskMode");
        return hrv.m132726I(this.f85815m.f154503c.f44324id, bLiveVoiceRoom2);
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m111381q5(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f85815m.m174579c(bLiveVoiceRoom);
        h5j0.INSTANCE.m129404c("create_voice_room", "voice_updateRoom");
    }

    /* JADX INFO: renamed from: y5 */
    public void m111383y5(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f85812j.m132487l(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: z5 */
    public void m111384z5(BLiveVoice bLiveVoice) {
        this.f85815m.m174578b(bLiveVoice);
    }
}
