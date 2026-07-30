package p009l;

import android.util.Pair;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.HashMap;
import java.util.List;
import l.aqe;
import l.bsm;
import l.bwr;
import l.d30;
import l.e30;
import l.fcm0;
import l.ffw;
import l.h4t;
import l.h5j0;
import l.hrv;
import l.iqv;
import l.l9t;
import l.lsi0;
import l.nnn0;
import l.s7m;
import l.vwb;
import l.wxs;
import l.x9j;
import l.xdl0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class c9o0 extends h4t<fcm0, VoicePreviewViewModel> implements k0p0.InterfaceC0981a {

    /* JADX INFO: renamed from: i */
    public final dem0 f10476i;

    /* JADX INFO: renamed from: j */
    public Dialog f10477j;

    /* JADX INFO: renamed from: k */
    public BLiveVoiceTopic f10478k;

    /* JADX INFO: renamed from: l */
    public BLiveUserMask f10479l;

    /* JADX INFO: renamed from: m */
    public k0p0 f10480m;

    public c9o0(bsm bsmVar, VoicePreviewViewModel voicePreviewViewModel) {
        super(bsmVar);
        C(voicePreviewViewModel);
        z2(new k8o0(bsmVar));
        this.f10476i = z2(new dem0(this, bsmVar));
        this.f10480m = new k0p0(this, act());
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m12419K3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m12420L3(BLiveUserMask bLiveUserMask) {
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m12421M3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m12422N3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m12424P3(Throwable th) {
    }

    /* JADX INFO: renamed from: j4 */
    private boolean m12434j4(BLiveAbsData bLiveAbsData) {
        return TEnum.equals(bLiveAbsData.state, "suspended") || TEnum.equals(bLiveAbsData.state, "onlive");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public void m12435q4(iqv iqvVar) {
        if (iqvVar.a() != 2) {
            return;
        }
        m12463z4();
        m12449i4();
        m12436u4();
        h5j0.INSTANCE.a("create_voice_room", "creat_voice_end");
    }

    /* JADX INFO: renamed from: u4 */
    private void m12436u4() {
        Dialog dialog = this.f10477j;
        if (dialog != null && dialog.isShowing()) {
            this.f10477j.dismiss();
        }
        this.f10477j = null;
    }

    /* JADX INFO: renamed from: A4, reason: merged with bridge method [inline-methods] */
    public final void m12453n4(BLiveVoice bLiveVoice) {
        duringCreated(hrv.T(((BLiveAbsData) bLiveVoice).id)).subscribe(ffw.e(new e30() { // from class: l.r8o0
            public final void call(Object obj) {
                this.f19696a.m12455p4((BLiveVoice) obj);
            }
        }, new e30() { // from class: l.s8o0
            public final void call(Object obj) {
                c9o0.m12422N3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R2 */
    public String m12438R2() {
        return "p_start_audio_room";
    }

    /* JADX INFO: renamed from: T */
    public void m12439T() {
        super/*l.k4t*/.T();
        boolean zH3 = ((wxs) this).e.h.h3();
        s7m s7mVar = ((bwr) this).viewModel;
        if (zH3) {
            ((VoicePreviewViewModel) s7mVar).m8590W(false);
            this.f10476i.m13254G4();
            return;
        }
        ((VoicePreviewViewModel) s7mVar).m8601s();
        ((VoicePreviewViewModel) ((bwr) this).viewModel).m8590W(true);
        m12441a4();
        m12442b4();
        duringCreated(E2().l()).takeUntil(new l9t()).subscribe(ffw.d(new e30() { // from class: l.l8o0
            public final void call(Object obj) {
                this.f15990a.m12435q4((iqv) obj);
            }
        }));
        k0p0 k0p0Var = this.f10480m;
        if (k0p0Var != null) {
            k0p0Var.m17258F();
        }
        aqe.i().u();
    }

    @Override // p009l.k0p0.InterfaceC0981a
    /* JADX INFO: renamed from: X0 */
    public void mo12440X0() {
        h5j0.INSTANCE.c("create_voice_room", "voice_notifyVerifySuccess");
        this.f10476i.m13260L4();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m12441a4() {
        duringCreated(VoiceRoomApiProvider.getOnGoingLive(ypv.f23196a.m23619D0())).subscribe(ffw.e(new e30() { // from class: l.w8o0
            public final void call(Object obj) {
                this.f21950a.m12462y4((List) obj);
            }
        }, new e30() { // from class: l.x8o0
            public final void call(Object obj) {
                c9o0.m12419K3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m12442b4() {
        duringCreated(c.zip(hrv.C(), VoiceRoomApiProvider.getRoomInfo(ypv.f23196a.m23619D0()), new x9j() { // from class: l.t8o0
            public final Object call(Object obj, Object obj2) {
                return new Pair((BLiveData) obj, (BLiveVoiceRoom) obj2);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.u8o0
            public final void call(Object obj) {
                this.f21019a.m12450k4((Pair) obj);
            }
        }, new e30() { // from class: l.v8o0
            public final void call(Object obj) {
                c9o0.m12424P3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public void m12443c4() {
        F2().LivePusherEvent.closeLive().p();
    }

    /* JADX INFO: renamed from: d4 */
    public BLiveVoiceTopic m12444d4() {
        return this.f10478k;
    }

    /* JADX INFO: renamed from: e4 */
    public String m12445e4() {
        return ((VoicePreviewViewModel) ((bwr) this).viewModel).getSelectedModel();
    }

    /* JADX INFO: renamed from: f4 */
    public String m12446f4() {
        return ((VoicePreviewViewModel) ((bwr) this).viewModel).getTitle();
    }

    /* JADX INFO: renamed from: g4 */
    public BLiveUserMask m12447g4() {
        return this.f10479l;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m12448h4() {
        return ((VoicePreviewViewModel) ((bwr) this).viewModel).m8586R();
    }

    /* JADX INFO: renamed from: i4 */
    public void m12449i4() {
        xdl0.M(((bwr) this).viewModel, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m12450k4(Pair pair) {
        VoicePreviewViewModel voicePreviewViewModel = (VoicePreviewViewModel) ((bwr) this).viewModel;
        Object obj = pair.first;
        voicePreviewViewModel.m8592Y(((BLiveData) obj).topics, ((BLiveData) obj).needTitle, ((BLiveData) obj).mutexMode, ((BLiveData) obj).modelDescribe);
        Object obj2 = pair.second;
        if (obj2 != BLiveVoiceRoom.EMPTY_ROOM) {
            this.f10476i.m13248A5((BLiveVoiceRoom) obj2);
            ((VoicePreviewViewModel) ((bwr) this).viewModel).m8589V((BLiveVoiceRoom) pair.second);
            m12459v4(((BLiveVoiceRoom) pair.second).maskMode);
        }
        this.f10476i.m13291y5((BLiveVoiceRoom) pair.second);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m12451l4(BLiveVoice bLiveVoice, List list) {
        this.f10476i.m13292z5(bLiveVoice);
        this.f10476i.m13249B5(true);
        this.f10476i.m13260L4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m12452m4(BLiveUserMask bLiveUserMask) {
        this.f10479l = bLiveUserMask;
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m12455p4(BLiveVoice bLiveVoice) {
        this.f10476i.m13249B5(false);
    }

    /* JADX INFO: renamed from: r4 */
    public void m12456r4() {
        h5j0.INSTANCE.d("create_voice_room");
        F2().RoomMysteryEventGroup.clearRoomFakeId().p();
        this.f10476i.m13259K4(new d30() { // from class: l.n8o0
            public final void call() {
                this.f17357a.m12442b4();
            }
        }, new d30() { // from class: l.o8o0
            public final void call() {
                this.f17881a.m12441a4();
            }
        });
        this.f10476i.m13249B5(false);
        k0p0 k0p0Var = this.f10480m;
        if (k0p0Var != null) {
            k0p0Var.m17262p();
        } else {
            mo12440X0();
        }
        HashMap map = new HashMap();
        map.put("entrance_type", ((nnn0) E2()).a0);
        zvf0.s("e_start_audio_room", m12438R2(), map);
    }

    /* JADX INFO: renamed from: s4 */
    public void m12457s4(BLiveVoiceTopic bLiveVoiceTopic) {
        this.f10478k = bLiveVoiceTopic;
    }

    /* JADX INFO: renamed from: t4, reason: merged with bridge method [inline-methods] */
    public final void m12454o4(final BLiveVoice bLiveVoice) {
        duringCreated(VoiceRoomApiProvider.getOnGoingLive(ypv.f23196a.m23619D0())).subscribe(ffw.e(new e30() { // from class: l.p8o0
            public final void call(Object obj) {
                this.f18428a.m12451l4(bLiveVoice, (List) obj);
            }
        }, new e30() { // from class: l.q8o0
            public final void call(Object obj) {
                lsi0.w(R.string.f6);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public void m12459v4(boolean z) {
        if (z && this.f10479l == null) {
            duringCreated(VoiceRoomApiProvider.getUserMask(ypv.f23196a.m23619D0())).doOnNext(new e30() { // from class: l.y8o0
                public final void call(Object obj) {
                    this.f22934a.m12452m4((BLiveUserMask) obj);
                }
            }).subscribe(ffw.e(new e30() { // from class: l.z8o0
                public final void call(Object obj) {
                    c9o0.m12420L3((BLiveUserMask) obj);
                }
            }, new e30() { // from class: l.a9o0
                public final void call(Object obj) {
                    c9o0.m12421M3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public void m12460w4(BLiveUserMask bLiveUserMask) {
        this.f10479l = bLiveUserMask;
    }

    /* JADX INFO: renamed from: x4 */
    public boolean m12461x4() {
        return ((VoicePreviewViewModel) ((bwr) this).viewModel).m8579F();
    }

    /* JADX INFO: renamed from: y4 */
    public final void m12462y4(List<BLiveVoice> list) {
        if (vwb.J(list)) {
            this.f10476i.m13249B5(false);
            return;
        }
        final BLiveVoice bLiveVoice = list.get(0);
        if (!E2().m().f() || !m12434j4(bLiveVoice)) {
            this.f10476i.m13249B5(false);
        } else {
            if (!"anchor-away".equals(bLiveVoice.bossState)) {
                this.f10477j = act().dialog().D(R.string.Ai).l0(R.string.Ji, new Runnable() { // from class: l.b9o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9974a.m12453n4(bLiveVoice);
                    }
                }).t0(R.string.Ii, new Runnable() { // from class: l.m8o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16756a.m12454o4(bLiveVoice);
                    }
                }).B(false).z0();
                return;
            }
            this.f10476i.m13292z5(bLiveVoice);
            this.f10476i.m13249B5(true);
            this.f10476i.m13260L4();
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final void m12463z4() {
        ((VoicePreviewViewModel) ((bwr) this).viewModel).m8597d0();
    }
}
