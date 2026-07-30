package p149l;

import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class c9o0 extends h4t<fcm0, VoicePreviewViewModel> implements k0p0.InterfaceC17900a {

    /* JADX INFO: renamed from: i */
    public final dem0 f79953i;

    /* JADX INFO: renamed from: j */
    public Dialog f79954j;

    /* JADX INFO: renamed from: k */
    public BLiveVoiceTopic f79955k;

    /* JADX INFO: renamed from: l */
    public BLiveUserMask f79956l;

    /* JADX INFO: renamed from: m */
    public k0p0 f79957m;

    public c9o0(bsm bsmVar, VoicePreviewViewModel voicePreviewViewModel) {
        super(bsmVar);
        mo51532C(voicePreviewViewModel);
        m144512z2(new k8o0(bsmVar));
        this.f79953i = (dem0) m144512z2(new dem0(this, bsmVar));
        this.f79957m = new k0p0(this, act());
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m105855K3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m105856L3(BLiveUserMask bLiveUserMask) {
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m105857M3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m105858N3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m105860P3(Throwable th) {
    }

    /* JADX INFO: renamed from: j4 */
    private boolean m105870j4(BLiveAbsData bLiveAbsData) {
        return TEnum.equals(bLiveAbsData.state, "suspended") || TEnum.equals(bLiveAbsData.state, "onlive");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public void m105871q4(iqv iqvVar) {
        if (iqvVar.m137794a() != 2) {
            return;
        }
        m105897z4();
        m105883i4();
        m105872u4();
        h5j0.INSTANCE.m129402a("create_voice_room", "creat_voice_end");
    }

    /* JADX INFO: renamed from: u4 */
    private void m105872u4() {
        Dialog dialog = this.f79954j;
        if (dialog != null && dialog.isShowing()) {
            this.f79954j.dismiss();
        }
        this.f79954j = null;
    }

    /* JADX INFO: renamed from: A4, reason: merged with bridge method [inline-methods] */
    public final void m105887n4(BLiveVoice bLiveVoice) {
        duringCreated(hrv.m132737T(bLiveVoice.f44323id)).subscribe(ffw.m121194e(new e30() { // from class: l.r8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158245a.m105889p4((BLiveVoice) obj);
            }
        }, new e30() { // from class: l.s8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                c9o0.m105858N3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.wxs
    /* JADX INFO: renamed from: R2 */
    public String mo77274R2() {
        return "p_start_audio_room";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        boolean zM160270h3 = ((fcm0) this.f188512e.f77102h).m160270h3();
        V v2 = this.viewModel;
        if (zM160270h3) {
            ((VoicePreviewViewModel) v2).m78390W(false);
            this.f79953i.m111348G4();
            return;
        }
        ((VoicePreviewViewModel) v2).m78400s();
        ((VoicePreviewViewModel) this.viewModel).m78390W(true);
        m105875a4();
        m105876b4();
        duringCreated(((fcm0) m206027E2()).m149815l()).takeUntil(new l9t()).subscribe(ffw.m121193d(new e30() { // from class: l.l8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126847a.m105871q4((iqv) obj);
            }
        }));
        k0p0 k0p0Var = this.f79957m;
        if (k0p0Var != null) {
            k0p0Var.m144108F();
        }
        aqe.m98261i().m98278u();
    }

    @Override // p149l.k0p0.InterfaceC17900a
    /* JADX INFO: renamed from: X0 */
    public void mo105874X0() {
        h5j0.INSTANCE.m129404c("create_voice_room", "voice_notifyVerifySuccess");
        this.f79953i.m111354L4();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m105875a4() {
        duringCreated(VoiceRoomApiProvider.getOnGoingLive(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.w8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185242a.m105896y4((List) obj);
            }
        }, new e30() { // from class: l.x8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                c9o0.m105855K3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m105876b4() {
        duringCreated(C22306c.zip(hrv.m132720C(), VoiceRoomApiProvider.getRoomInfo(ypv.f199493a.m199309D0()), new x9j() { // from class: l.t8o0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((BLiveData) obj, (BLiveVoiceRoom) obj2);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.u8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175148a.m105884k4((Pair) obj);
            }
        }, new e30() { // from class: l.v8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                c9o0.m105860P3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public void m105877c4() {
        m206028F2().LivePusherEvent.closeLive().m172467p();
    }

    /* JADX INFO: renamed from: d4 */
    public BLiveVoiceTopic m105878d4() {
        return this.f79955k;
    }

    /* JADX INFO: renamed from: e4 */
    public String m105879e4() {
        return ((VoicePreviewViewModel) this.viewModel).getSelectedModel();
    }

    /* JADX INFO: renamed from: f4 */
    public String m105880f4() {
        return ((VoicePreviewViewModel) this.viewModel).getTitle();
    }

    /* JADX INFO: renamed from: g4 */
    public BLiveUserMask m105881g4() {
        return this.f79956l;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m105882h4() {
        return ((VoicePreviewViewModel) this.viewModel).m78386R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m105883i4() {
        xdl0.m208344M((View) this.viewModel, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m105884k4(Pair pair) {
        VoicePreviewViewModel voicePreviewViewModel = (VoicePreviewViewModel) this.viewModel;
        Object obj = pair.first;
        voicePreviewViewModel.m78392Y(((BLiveData) obj).topics, ((BLiveData) obj).needTitle, ((BLiveData) obj).mutexMode, ((BLiveData) obj).modelDescribe);
        Object obj2 = pair.second;
        if (obj2 != BLiveVoiceRoom.EMPTY_ROOM) {
            this.f79953i.m111342A5((BLiveVoiceRoom) obj2);
            ((VoicePreviewViewModel) this.viewModel).m78389V((BLiveVoiceRoom) pair.second);
            m105893v4(((BLiveVoiceRoom) pair.second).maskMode);
        }
        this.f79953i.m111383y5((BLiveVoiceRoom) pair.second);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m105885l4(BLiveVoice bLiveVoice, List list) {
        this.f79953i.m111384z5(bLiveVoice);
        this.f79953i.m111343B5(true);
        this.f79953i.m111354L4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m105886m4(BLiveUserMask bLiveUserMask) {
        this.f79956l = bLiveUserMask;
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m105889p4(BLiveVoice bLiveVoice) {
        this.f79953i.m111343B5(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public void m105890r4() {
        h5j0.INSTANCE.m129405d("create_voice_room");
        m206028F2().RoomMysteryEventGroup.clearRoomFakeId().m172467p();
        this.f79953i.m111353K4(new d30() { // from class: l.n8o0
            @Override // p149l.d30
            public final void call() {
                this.f137666a.m105876b4();
            }
        }, new d30() { // from class: l.o8o0
            @Override // p149l.d30
            public final void call() {
                this.f142662a.m105875a4();
            }
        });
        this.f79953i.m111343B5(false);
        k0p0 k0p0Var = this.f79957m;
        if (k0p0Var != null) {
            k0p0Var.m144112p();
        } else {
            mo105874X0();
        }
        HashMap map = new HashMap();
        map.put("entrance_type", ((fcm0) m206027E2()).f139757a0);
        zvf0.m220397s("e_start_audio_room", mo77274R2(), map);
    }

    /* JADX INFO: renamed from: s4 */
    public void m105891s4(BLiveVoiceTopic bLiveVoiceTopic) {
        this.f79955k = bLiveVoiceTopic;
    }

    /* JADX INFO: renamed from: t4, reason: merged with bridge method [inline-methods] */
    public final void m105888o4(final BLiveVoice bLiveVoice) {
        duringCreated(VoiceRoomApiProvider.getOnGoingLive(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.p8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147621a.m105885l4(bLiveVoice, (List) obj);
            }
        }, new e30() { // from class: l.q8o0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f47230f6);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public void m105893v4(boolean z) {
        if (z && this.f79956l == null) {
            duringCreated(VoiceRoomApiProvider.getUserMask(ypv.f199493a.m199309D0())).doOnNext(new e30() { // from class: l.y8o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f196855a.m105886m4((BLiveUserMask) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.z8o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    c9o0.m105856L3((BLiveUserMask) obj);
                }
            }, new e30() { // from class: l.a9o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    c9o0.m105857M3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public void m105894w4(BLiveUserMask bLiveUserMask) {
        this.f79956l = bLiveUserMask;
    }

    /* JADX INFO: renamed from: x4 */
    public boolean m105895x4() {
        return ((VoicePreviewViewModel) this.viewModel).m78379F();
    }

    /* JADX INFO: renamed from: y4 */
    public final void m105896y4(List<BLiveVoice> list) {
        if (vwb.m200296J(list)) {
            this.f79953i.m111343B5(false);
            return;
        }
        final BLiveVoice bLiveVoice = list.get(0);
        if (!((fcm0) m206027E2()).m149816m().m137799f() || !m105870j4(bLiveVoice)) {
            this.f79953i.m111343B5(false);
        } else {
            if (!"anchor-away".equals(bLiveVoice.bossState)) {
                this.f79954j = act().dialog().m20500D(R$string.f46575Ai).m20542l0(R$string.f46773Ji, new Runnable() { // from class: l.b9o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f74596a.m105887n4(bLiveVoice);
                    }
                }).m20556t0(R$string.f46751Ii, new Runnable() { // from class: l.m8o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f132592a.m105888o4(bLiveVoice);
                    }
                }).m20496B(false).m20568z0();
                return;
            }
            this.f79953i.m111384z5(bLiveVoice);
            this.f79953i.m111343B5(true);
            this.f79953i.m111354L4();
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final void m105897z4() {
        ((VoicePreviewViewModel) this.viewModel).m78397d0();
    }
}
