package p009l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.liveend.VoiceLiveEndAct;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.LiveDialogAct;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.bsm;
import l.c4g0;
import l.d30;
import l.dd80;
import l.e30;
import l.evj;
import l.fcm0;
import l.ffw;
import l.gkh0;
import l.h5j0;
import l.hrv;
import l.iqv;
import l.lsi0;
import l.mkd0;
import l.nnn0;
import l.oxl;
import l.pat;
import l.ptn;
import l.roj0;
import l.rv00;
import l.s91;
import l.soj0;
import l.u7s;
import l.vwb;
import l.w8u;
import l.w9j;
import l.wrj;
import l.wxs;
import l.x9j;
import l.z2k;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dem0 extends pat<fcm0> {

    /* JADX INFO: renamed from: i */
    public final a<Boolean> f11791i;

    /* JADX INFO: renamed from: j */
    public final a<BLiveVoiceRoom> f11792j;

    /* JADX INFO: renamed from: k */
    public final a<roj0> f11793k;

    /* JADX INFO: renamed from: l */
    public final c9o0 f11794l;

    /* JADX INFO: renamed from: m */
    public qho0 f11795m;

    /* JADX INFO: renamed from: n */
    public c4g0 f11796n;

    /* JADX INFO: renamed from: o */
    public boolean f11797o;

    /* JADX INFO: renamed from: p */
    public dd80 f11798p;

    public dem0(c9o0 c9o0Var, bsm bsmVar) {
        super(bsmVar);
        this.f11791i = a.b();
        this.f11792j = a.b();
        this.f11793k = a.b();
        this.f11795m = new qho0();
        this.f11794l = c9o0Var;
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ c m13188A4(w9j w9jVar, BLiveVoiceRoom bLiveVoiceRoom) {
        return (c) w9jVar.call(((BLiveAbsRoom) bLiveVoiceRoom).id);
    }

    /* JADX INFO: renamed from: B4 */
    public static /* synthetic */ void m13189B4(Throwable th) {
    }

    /* JADX INFO: renamed from: D5 */
    private void m13192D5() {
        m13251E5("", act().getString(R.string.vf), act().getString(R.string.d7));
    }

    /* JADX INFO: renamed from: E4 */
    private void m13193E4() {
        duringCreated(c.combineLatest(c.zip(this.f11792j, this.f11791i, new x9j() { // from class: l.cem0
            public final Object call(Object obj, Object obj2) {
                return dem0.m13224i4((BLiveVoiceRoom) obj, (Boolean) obj2);
            }
        }), this.f11793k, new x9j() { // from class: l.jcm0
            public final Object call(Object obj, Object obj2) {
                return dem0.m13221f4((Boolean) obj, (roj0) obj2);
            }
        })).filter(new w9j() { // from class: l.kcm0
            public final Object call(Object obj) {
                return this.f15604a.m13263Q4((Boolean) obj);
            }
        }).doOnNext(new e30() { // from class: l.lcm0
            public final void call(Object obj) {
                this.f16081a.m13264R4((Boolean) obj);
            }
        }).flatMap(new w9j() { // from class: l.mcm0
            public final Object call(Object obj) {
                return this.f16802a.m13195I5(((Boolean) obj).booleanValue());
            }
        }).flatMap(new w9j() { // from class: l.ncm0
            public final Object call(Object obj) {
                return this.f17408a.m13237t5((BLiveVoiceRoom) obj);
            }
        }).flatMap(new w9j() { // from class: l.ocm0
            public final Object call(Object obj) {
                return this.f17899a.m13241v5((BLiveVoice) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.pcm0
            public final void call(Object obj) {
                this.f18470a.m13262P4((User) obj);
            }
        }, new tcm0(this)));
    }

    /* JADX INFO: renamed from: H5 */
    private void m13194H5() {
        qho0 qho0Var = this.f11795m;
        BLiveVoiceRoom bLiveVoiceRoom = qho0Var.f19285c;
        if (bLiveVoiceRoom == null || qho0Var.f19283a == null || qho0Var.f19284b == null) {
            return;
        }
        if (bLiveVoiceRoom.isMaskMode()) {
            E2().K2(this.f11794l.m12447g4());
        }
        E2().i(this.f11795m.f19285c);
        E2().O2().n(this.f11795m.f19283a);
        E2().R(this.f11795m.f19284b);
        E2().V(this.f11795m.f19283a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I5 */
    public c<BLiveVoiceRoom> m13195I5(final boolean z) {
        return duringCreated(c.just(Boolean.valueOf(z))).flatMap(new w9j() { // from class: l.wcm0
            public final Object call(Object obj) {
                return this.f22003a.m13288p5(z, (Boolean) obj);
            }
        }).doOnNext(new e30() { // from class: l.xcm0
            public final void call(Object obj) {
                this.f22510a.m13289q5((BLiveVoiceRoom) obj);
            }
        }).doOnError(new e30() { // from class: l.ycm0
            public final void call(Object obj) {
                this.f22997a.m13290r5((Throwable) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.zcm0
            public final Object call(Object obj) {
                return BLiveVoiceRoom.EMPTY_ROOM;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m13290r5(Throwable th) {
        String strT;
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.h(R.string.E9);
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        final d30 d30Var = null;
        if (i != 41013) {
            if (i == 41008 || i == 41020 || i == 51013 || i == 43009 || i == 43025 || i == 43062 || i == 43014) {
                strT = coreService.metaMessage;
            } else if (i == 41000 || i == 41002) {
                strT = w8u.t(R.string.f6);
            } else {
                if (i == 41010) {
                    m13245x5();
                    return;
                }
                if (i == 41005) {
                    strT = w8u.t(R.string.H2);
                } else if (i == 41014 || i == 41017 || i == 41018) {
                    strT = w8u.t(R.string.x);
                } else if (i == 41015) {
                    strT = w8u.t(R.string.cb);
                } else if (i == 41009) {
                    strT = w8u.t(R.string.P);
                } else if (i == 41042) {
                    strT = act().getString(R.string.G2);
                    d30Var = new d30() { // from class: l.ucm0
                        public final void call() {
                            this.f21070a.m13275d5();
                        }
                    };
                } else if (i == 43010) {
                    m13245x5();
                    return;
                }
            }
            if (TextUtils.isEmpty(strT)) {
            }
            act().dialog().F(strT).B(false).v0(w8u.t(R.string.y5), new Runnable() { // from class: l.vcm0
                @Override // java.lang.Runnable
                public final void run() {
                    dem0.m13202O3(d30Var);
                }
            }).z0();
        }
        lsi0.h(R.string.yd);
        strT = "";
        if (TextUtils.isEmpty(strT)) {
            act().dialog().F(strT).B(false).v0(w8u.t(R.string.y5), new Runnable() { // from class: l.vcm0
                @Override // java.lang.Runnable
                public final void run() {
                    dem0.m13202O3(d30Var);
                }
            }).z0();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m13202O3(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: O4 */
    private boolean m13203O4(BLiveVoiceRoom bLiveVoiceRoom) {
        return !TextUtils.equals(((BLiveAbsRoom) bLiveVoiceRoom).title, this.f11794l.m12446f4()) || vwb.J(bLiveVoiceRoom.topics) || this.f11794l.m12444d4() == null || !TextUtils.equals(((BLiveVoiceTopic) bLiveVoiceRoom.topics.get(0)).name, this.f11794l.m12444d4().name);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ User m13207T3(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public /* synthetic */ void m13208T4(soj0 soj0Var) {
        m13257I4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m13210U4(iqv iqvVar) {
        if (iqvVar.a() != 4) {
            return;
        }
        m13235s5((u7s) iqvVar);
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ Boolean m13221f4(Boolean bool, roj0 roj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ Boolean m13224i4(BLiveVoiceRoom bLiveVoiceRoom, Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: k4 */
    public static /* synthetic */ void m13226k4() {
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ BLiveVoiceRoom m13230o4(Pair pair) {
        return (BLiveVoiceRoom) pair.first;
    }

    /* JADX INFO: renamed from: s5 */
    private void m13235s5(u7s u7sVar) {
        String strL = u7sVar.l();
        F2().ChatEvent.dismissDialog().p();
        JumpRoomData jumpRoomDataM = u7sVar.m();
        if (jumpRoomDataM != null) {
            act().startActivity(s91.a(ypv.f23200e, AudienceStartData.getBuilder().E(jumpRoomDataM.getToLiveId()).O(jumpRoomDataM.getSource()).Q(true).u()));
        } else if (u7sVar.n()) {
            act().startActivity(VoiceLiveEndAct.m8444V1(act(), E2().O2().c(), E2().O2().e(), E2().l0(), strL));
        } else {
            LiveDialogAct.g2(act(), "", strL);
        }
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t5 */
    public c<BLiveVoice> m13237t5(BLiveVoiceRoom bLiveVoiceRoom) {
        return duringCreated(c.just(bLiveVoiceRoom).flatMap(new w9j() { // from class: l.odm0
            public final Object call(Object obj) {
                return this.f17931a.m13276e5((BLiveVoiceRoom) obj);
            }
        })).doOnNext(new e30() { // from class: l.qdm0
            public final void call(Object obj) {
                this.f19163a.m13277f5((BLiveVoice) obj);
            }
        }).doOnError(new e30() { // from class: l.rdm0
            public final void call(Object obj) {
                this.f19769a.m13278g5((Throwable) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.sdm0
            public final Object call(Object obj) {
                return BLiveVoice.EMPTY;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5, reason: merged with bridge method [inline-methods] */
    public void m13262P4(User user) {
        h5j0.INSTANCE.c("create_voice_room", "voice_prepareUser");
        act().progressDismiss();
        if (user != null) {
            this.f11795m.m21011a(user);
            m13194H5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public c<User> m13241v5(final BLiveVoice bLiveVoice) {
        return duringCreated(c.just(bLiveVoice).flatMap(new w9j() { // from class: l.adm0
            public final Object call(Object obj) {
                return dem0.m13244x4(bLiveVoice, (BLiveVoice) obj);
            }
        })).doOnError(new tcm0(this)).onErrorReturn(new w9j() { // from class: l.bdm0
            public final Object call(Object obj) {
                return dem0.m13207T3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    private void m13243w5(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.e eVarB = act().dialog().F(str).B(false);
        Objects.requireNonNull(d30Var);
        eVarB.n0(str2, new bii0(d30Var)).z0();
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ c m13244x4(BLiveVoice bLiveVoice, BLiveVoice bLiveVoice2) {
        return bLiveVoice == BLiveVoice.EMPTY ? c.just((Object) null) : hrv.Q(((BLiveAbsData) bLiveVoice).id);
    }

    /* JADX INFO: renamed from: x5 */
    private void m13245x5() {
        duringCreated(VoiceRoomApiProvider.getAnchorInfo(ypv.f23196a.m23619D0())).subscribe(ffw.e(new e30() { // from class: l.mdm0
            public final void call(Object obj) {
                this.f16844a.m13280i5((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.ndm0
            public final void call(Object obj) {
                this.f17420a.m13281j5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A5 */
    public void m13248A5(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f11795m.m21013c(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: B5 */
    public void m13249B5(boolean z) {
        this.f11791i.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: C5 */
    public final void m13250C5() {
        if (this.f11798p == null) {
            this.f11798p = act().newDialog().x0(R.string.ui, new Object[0]).s0(R.string.si, new Object[0]).q0(8388611).a0(R.string.ti, new Runnable() { // from class: l.rcm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19736a.m13282k5();
                }
            }).U(R.string.ri, new Runnable() { // from class: l.scm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20168a.m13283l5();
                }
            }).O();
        }
        this.f11798p.show();
    }

    /* JADX INFO: renamed from: E5 */
    public void m13251E5(String str, String str2, String str3) {
        act().dialog().G0(str).F(str2).v0(str3, new Runnable() { // from class: l.bem0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10035a.m13284m5();
            }
        }).m0(act().getString(R.string.z)).z0();
    }

    /* JADX INFO: renamed from: F4 */
    public final void m13252F4() {
        BLiveVoiceCall bLiveVoiceCallY2 = E2().Y2();
        if (bLiveVoiceCallY2 != null) {
            duringCreated(VoiceRoomApiProvider.bossAnchorAway(bLiveVoiceCallY2.id)).subscribe(ffw.e(new e30() { // from class: l.vdm0
                public final void call(Object obj) {
                    this.f21546a.m13265S4((roj0) obj);
                }
            }, new z2k()));
        }
    }

    /* JADX INFO: renamed from: F5 */
    public void m13253F5(String str) {
        m13255G5(str, null);
    }

    /* JADX INFO: renamed from: G4 */
    public void m13254G4() {
        duringCreated(VoiceRoomApiProvider.getOnGoingLive(ypv.f23196a.m23619D0())).subscribe(ffw.e(new e30() { // from class: l.icm0
            public final void call(Object obj) {
                this.f14489a.m13269X4((List) obj);
            }
        }, new tcm0(this)));
    }

    /* JADX INFO: renamed from: G5 */
    public final void m13255G5(String str, final JumpRoomData jumpRoomData) {
        this.f11797o = true;
        ((oxl) F3(new rv00(2600))).b();
        act().progress(R.string.X2);
        duringCreated(hrv.T(str)).subscribe(ffw.e(new e30() { // from class: l.tdm0
            public final void call(Object obj) {
                this.f20623a.m13286n5(jumpRoomData, (BLiveVoice) obj);
            }
        }, new e30() { // from class: l.udm0
            public final void call(Object obj) {
                this.f21087a.m13287o5(jumpRoomData, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m13256H4(boolean z, String str, boolean z2, JumpRoomData jumpRoomData) {
        if (!z) {
            act().progressDismiss();
            if (E2().m().c()) {
                return;
            }
            u7s u7sVar = u7s.e;
            u7sVar.p(jumpRoomData);
            E2().h(u7sVar);
            return;
        }
        oxl oxlVar = (oxl) F3(new rv00(2600));
        if (oxlVar != null) {
            oxlVar.b();
        }
        if (this.f11797o || E2().m().c()) {
            return;
        }
        u7s u7sVar2 = new u7s(str, z2);
        if (jumpRoomData != null) {
            u7sVar2.p(jumpRoomData);
        }
        E2().h(u7sVar2);
    }

    /* JADX INFO: renamed from: I4 */
    public void m13257I4() {
        if (E2().m().f()) {
            act().finish();
        } else if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(((BLiveAbsData) E2().V2()).liveMode)) {
            m13250C5();
        } else {
            m13192D5();
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m13258J4(final w9j<String, c<BLiveVoice>> w9jVar) {
        duringCreated(c.zip(VoiceRoomApiProvider.getRoomInfo(ypv.f23196a.m23619D0()), VoiceRoomApiProvider.getUserMask(ypv.f23196a.m23619D0()), new x9j() { // from class: l.cdm0
            public final Object call(Object obj, Object obj2) {
                return new Pair((BLiveVoiceRoom) obj, (BLiveUserMask) obj2);
            }
        }).doOnNext(new e30() { // from class: l.ddm0
            public final void call(Object obj) {
                this.f11777a.m13270Y4((Pair) obj);
            }
        }).doOnNext(new e30() { // from class: l.fdm0
            public final void call(Object obj) {
                this.f12955a.m13271Z4((Pair) obj);
            }
        }).map(new w9j() { // from class: l.gdm0
            public final Object call(Object obj) {
                return dem0.m13230o4((Pair) obj);
            }
        }).flatMap(new w9j() { // from class: l.hdm0
            public final Object call(Object obj) {
                return dem0.m13188A4(w9jVar, (BLiveVoiceRoom) obj);
            }
        }).doOnNext(new e30() { // from class: l.idm0
            public final void call(Object obj) {
                this.f14582a.m13272a5((BLiveVoice) obj);
            }
        }).flatMap(new w9j() { // from class: l.jdm0
            public final Object call(Object obj) {
                return hrv.Q(((BLiveAbsData) ((BLiveVoice) obj)).id);
            }
        }).doOnNext(new e30() { // from class: l.kdm0
            public final void call(Object obj) {
                this.f15615a.m13273b5((User) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.ldm0
            public final void call(Object obj) {
                this.f16112a.m13274c5((User) obj);
            }
        }, new tcm0(this)));
    }

    /* JADX INFO: renamed from: K4 */
    public void m13259K4(d30 d30Var, d30 d30Var2) {
        if (this.f11792j.e() == null) {
            d30Var.call();
        }
        if (this.f11791i.e() == null) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m13260L4() {
        this.f11793k.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: N4 */
    public final boolean m13261N4(BLiveVoiceRoom bLiveVoiceRoom) {
        return bLiveVoiceRoom.isMaskMode() != this.f11794l.m12448h4();
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ Boolean m13263Q4(Boolean bool) {
        return Boolean.valueOf(!E2().m().j());
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m13264R4(Boolean bool) {
        act().progress(R.string.Za);
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m13265S4(roj0 roj0Var) {
        E2().J3(true);
        ((oxl) F3(new rv00(2600))).b();
        ptn.b();
        act().finish();
    }

    /* JADX INFO: renamed from: T */
    public void m13266T() {
        super/*l.k4t*/.T();
        m13193E4();
        duringCreated((c) F2().LivePusherEvent.closeLive().g()).subscribe(ffw.h(new e30() { // from class: l.edm0
            public final void call(Object obj) {
                this.f12515a.m13208T4((soj0) obj);
            }
        }));
        duringCreated(E2().l()).subscribe(ffw.d(new e30() { // from class: l.pdm0
            public final void call(Object obj) {
                this.f18494a.m13210U4((iqv) obj);
            }
        }));
        this.f11796n = E2().o1(((wxs) this).f).subscribe(ffw.d(new e30() { // from class: l.xdm0
            public final void call(Object obj) {
                this.f22515a.m13268W4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m13267V4(BLiveVoice bLiveVoice) {
        m13256H4(true, w8u.t(R.string.R5), false, null);
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m13268W4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                E2().K1(E2().k());
                break;
            case "system":
                m13243w5(liveControlMessage.content, w8u.t(R.string.y5), new d30() { // from class: l.ydm0
                    public final void call() {
                        dem0.m13226k4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.w(false);
                E2().A1(new evj.a(E2().o(), ((DbObject) E2().l0()).id, "live").f(), (e30) null);
                break;
            case "stop":
                m13256H4(true, w8u.t(R.string.f6), true, null);
                break;
            case "force_stop":
                m13256H4(true, liveControlMessage.content, true, null);
                break;
            case "forbidden_multidevice":
                if (!liveControlMessage.isAnchor) {
                    hrv.T(E2().k()).subscribe(ffw.e(new e30() { // from class: l.zdm0
                        public final void call(Object obj) {
                            this.f23588a.m13267V4((BLiveVoice) obj);
                        }
                    }, new e30() { // from class: l.aem0
                        public final void call(Object obj) {
                            dem0.m13189B4((Throwable) obj);
                        }
                    }));
                    break;
                } else {
                    m13256H4(true, w8u.t(R.string.T5), false, null);
                    break;
                }
                break;
        }
        gkh0.k(liveControlMessage.toString(), new String[]{"[live][voice]", "[passivity_exit]"});
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m13269X4(List list) {
        if (vwb.J(list)) {
            LiveDialogAct.g2(act(), "", w8u.t(R.string.f6));
            return;
        }
        final BLiveVoice bLiveVoice = (BLiveVoice) list.get(0);
        this.f11795m.m21012b(bLiveVoice);
        m13258J4(new w9j() { // from class: l.qcm0
            public final Object call(Object obj) {
                return c.just(bLiveVoice);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m13270Y4(Pair pair) {
        this.f11795m.m21013c((BLiveVoiceRoom) pair.first);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m13271Z4(Pair pair) {
        this.f11794l.m12460w4((BLiveUserMask) pair.second);
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m13272a5(BLiveVoice bLiveVoice) {
        this.f11795m.m21012b(bLiveVoice);
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m13273b5(User user) {
        this.f11795m.m21011a(user);
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m13274c5(User user) {
        m13194H5();
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m13275d5() {
        act().finish();
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ c m13276e5(BLiveVoiceRoom bLiveVoiceRoom) {
        if (bLiveVoiceRoom == BLiveVoiceRoom.EMPTY_ROOM) {
            return c.just(BLiveVoice.EMPTY);
        }
        BLiveVoice bLiveVoice = this.f11795m.f19283a;
        return bLiveVoice != null ? c.just(bLiveVoice) : hrv.s(((BLiveAbsRoom) bLiveVoiceRoom).id, this.f11794l.m12461x4(), ((nnn0) E2()).a0, this.f11794l.m12445e4());
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m13277f5(BLiveVoice bLiveVoice) {
        this.f11795m.m21012b(bLiveVoice);
        h5j0.INSTANCE.c("create_voice_room", "voice_prepareLive");
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m13279h5() {
        act().finish();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m13280i5(BLiveAnchor bLiveAnchor) {
        if (TEnum.equals(bLiveAnchor.status, "jailed")) {
            act().dialog().F(w8u.u(R.string.eb, mqi0.m18551p(bLiveAnchor.availableTime))).B(false).v0(w8u.t(R.string.y5), new Runnable() { // from class: l.wdm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22022a.m13279h5();
                }
            }).z0();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m13282k5() {
        m13252F4();
        this.f11798p.dismiss();
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m13283l5() {
        m13253F5(E2().k());
        this.f11798p.dismiss();
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m13284m5() {
        m13253F5(E2().k());
    }

    /* JADX INFO: renamed from: n */
    public void m13285n() {
        super/*l.h4t*/.n();
        mkd0.z(this.f11796n);
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m13286n5(JumpRoomData jumpRoomData, BLiveVoice bLiveVoice) {
        m13256H4(false, null, true, jumpRoomData);
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m13287o5(JumpRoomData jumpRoomData, Throwable th) {
        m13256H4(false, null, true, jumpRoomData);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ c m13288p5(boolean z, Boolean bool) {
        if (z) {
            return c.just(this.f11795m.f19285c);
        }
        String strTrim = this.f11794l.m12446f4().trim();
        BLiveVoiceTopic bLiveVoiceTopicM12444d4 = this.f11794l.m12444d4();
        String str = bLiveVoiceTopicM12444d4 != null ? bLiveVoiceTopicM12444d4.id : "";
        BLiveVoiceRoom bLiveVoiceRoom = this.f11795m.f19285c;
        if (bLiveVoiceRoom != null && !m13203O4(bLiveVoiceRoom) && !m13261N4(this.f11795m.f19285c)) {
            return c.just(this.f11795m.f19285c);
        }
        BLiveVoiceRoom bLiveVoiceRoom2 = new BLiveVoiceRoom();
        ((BLiveAbsRoom) bLiveVoiceRoom2).title = strTrim;
        ArrayList arrayList = new ArrayList();
        bLiveVoiceRoom2.topicIds = arrayList;
        if (bLiveVoiceTopicM12444d4 != null) {
            arrayList.add(str);
        }
        bLiveVoiceRoom2.maskMode = this.f11794l.m12448h4();
        BLiveVoiceRoom bLiveVoiceRoom3 = this.f11795m.f19285c;
        if (bLiveVoiceRoom3 == null) {
            return hrv.u(bLiveVoiceRoom2);
        }
        ((BLiveAbsRoom) bLiveVoiceRoom2).id = ((BLiveAbsRoom) bLiveVoiceRoom3).id;
        if (m13203O4(bLiveVoiceRoom3)) {
            bLiveVoiceRoom2.addField("title,topic");
        }
        bLiveVoiceRoom2.addField("maskMode");
        return hrv.I(((BLiveAbsRoom) this.f11795m.f19285c).id, bLiveVoiceRoom2);
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m13289q5(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f11795m.m21013c(bLiveVoiceRoom);
        h5j0.INSTANCE.c("create_voice_room", "voice_updateRoom");
    }

    /* JADX INFO: renamed from: y5 */
    public void m13291y5(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f11792j.onNext(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: z5 */
    public void m13292z5(BLiveVoice bLiveVoice) {
        this.f11795m.m21012b(bLiveVoice);
    }
}
