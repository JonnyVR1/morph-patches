package p153l;

import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class gio0 extends i6t<jlm0, VoicePreviewViewModel> implements o9p0.InterfaceC19062a {

    /* JADX INFO: renamed from: i */
    public final hnm0 f104511i;

    /* JADX INFO: renamed from: j */
    public Dialog f104512j;

    /* JADX INFO: renamed from: k */
    public BLiveVoiceTopic f104513k;

    /* JADX INFO: renamed from: l */
    public BLiveUserMask f104514l;

    /* JADX INFO: renamed from: m */
    public o9p0 f104515m;

    public gio0(dum dumVar, VoicePreviewViewModel voicePreviewViewModel) {
        super(dumVar);
        mo52715C(voicePreviewViewModel);
        m153103z2(new oho0(dumVar));
        this.f104511i = (hnm0) m153103z2(new hnm0(this, dumVar));
        this.f104515m = new o9p0(this, act());
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m130340K3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m130341L3(BLiveUserMask bLiveUserMask) {
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m130342M3(Throwable th) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m130343N3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m130345P3(Throwable th) {
    }

    /* JADX INFO: renamed from: j4 */
    private boolean m130355j4(BLiveAbsData bLiveAbsData) {
        return TEnum.equals(bLiveAbsData.state, "suspended") || TEnum.equals(bLiveAbsData.state, "onlive");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public void m130356q4(jsv jsvVar) {
        if (jsvVar.m146875a() != 2) {
            return;
        }
        m130382z4();
        m130368i4();
        m130357u4();
        lej0.INSTANCE.m153907a("create_voice_room", "creat_voice_end");
    }

    /* JADX INFO: renamed from: u4 */
    private void m130357u4() {
        Dialog dialog = this.f104512j;
        if (dialog != null && dialog.isShowing()) {
            this.f104512j.dismiss();
        }
        this.f104512j = null;
    }

    /* JADX INFO: renamed from: A4, reason: merged with bridge method [inline-methods] */
    public final void m130372n4(BLiveVoice bLiveVoice) {
        duringCreated(itv.m142096T(bLiveVoice.f45171id)).subscribe(dhw.m115826e(new y20() { // from class: l.vho0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184183a.m130374p4((BLiveVoice) obj);
            }
        }, new y20() { // from class: l.who0
            @Override // p153l.y20
            public final void call(Object obj) {
                gio0.m130343N3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.xzs
    /* JADX INFO: renamed from: R2 */
    public String mo78457R2() {
        return "p_start_audio_room";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        boolean zM183433h3 = ((jlm0) this.f196918e.f90822h).m183433h3();
        V v2 = this.viewModel;
        if (zM183433h3) {
            ((VoicePreviewViewModel) v2).m79573W(false);
            this.f104511i.m136227G4();
            return;
        }
        ((VoicePreviewViewModel) v2).m79583s();
        ((VoicePreviewViewModel) this.viewModel).m79573W(true);
        m130360a4();
        m130361b4();
        duringCreated(((jlm0) m213810E2()).m202192l()).takeUntil(new mbt()).subscribe(dhw.m115825d(new y20() { // from class: l.pho0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152464a.m130356q4((jsv) obj);
            }
        }));
        o9p0 o9p0Var = this.f104515m;
        if (o9p0Var != null) {
            o9p0Var.m166790F();
        }
        ere.m122146i().m122163u();
    }

    @Override // p153l.o9p0.InterfaceC19062a
    /* JADX INFO: renamed from: X0 */
    public void mo130359X0() {
        lej0.INSTANCE.m153909c("create_voice_room", "voice_notifyVerifySuccess");
        this.f104511i.m136233L4();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m130360a4() {
        duringCreated(VoiceRoomApiProvider.getOnGoingLive(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.aio0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71555a.m130381y4((List) obj);
            }
        }, new y20() { // from class: l.bio0
            @Override // p153l.y20
            public final void call(Object obj) {
                gio0.m130340K3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m130361b4() {
        duringCreated(C22421c.zip(itv.m142079C(), VoiceRoomApiProvider.getRoomInfo(zrv.f205799a.m207631D0()), new rcj() { // from class: l.xho0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((BLiveData) obj, (BLiveVoiceRoom) obj2);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.yho0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199980a.m130369k4((Pair) obj);
            }
        }, new y20() { // from class: l.zho0
            @Override // p153l.y20
            public final void call(Object obj) {
                gio0.m130345P3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public void m130362c4() {
        m213811F2().LivePusherEvent.closeLive().m199277p();
    }

    /* JADX INFO: renamed from: d4 */
    public BLiveVoiceTopic m130363d4() {
        return this.f104513k;
    }

    /* JADX INFO: renamed from: e4 */
    public String m130364e4() {
        return ((VoicePreviewViewModel) this.viewModel).getSelectedModel();
    }

    /* JADX INFO: renamed from: f4 */
    public String m130365f4() {
        return ((VoicePreviewViewModel) this.viewModel).getTitle();
    }

    /* JADX INFO: renamed from: g4 */
    public BLiveUserMask m130366g4() {
        return this.f104514l;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m130367h4() {
        return ((VoicePreviewViewModel) this.viewModel).m79569R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m130368i4() {
        bnl0.m105524M((View) this.viewModel, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m130369k4(Pair pair) {
        VoicePreviewViewModel voicePreviewViewModel = (VoicePreviewViewModel) this.viewModel;
        Object obj = pair.first;
        voicePreviewViewModel.m79575Y(((BLiveData) obj).topics, ((BLiveData) obj).needTitle, ((BLiveData) obj).mutexMode, ((BLiveData) obj).modelDescribe);
        Object obj2 = pair.second;
        if (obj2 != BLiveVoiceRoom.EMPTY_ROOM) {
            this.f104511i.m136221A5((BLiveVoiceRoom) obj2);
            ((VoicePreviewViewModel) this.viewModel).m79572V((BLiveVoiceRoom) pair.second);
            m130378v4(((BLiveVoiceRoom) pair.second).maskMode);
        }
        this.f104511i.m136262y5((BLiveVoiceRoom) pair.second);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m130370l4(BLiveVoice bLiveVoice, List list) {
        this.f104511i.m136263z5(bLiveVoice);
        this.f104511i.m136222B5(true);
        this.f104511i.m136233L4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m130371m4(BLiveUserMask bLiveUserMask) {
        this.f104514l = bLiveUserMask;
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m130374p4(BLiveVoice bLiveVoice) {
        this.f104511i.m136222B5(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public void m130375r4() {
        lej0.INSTANCE.m153910d("create_voice_room");
        m213811F2().RoomMysteryEventGroup.clearRoomFakeId().m199277p();
        this.f104511i.m136232K4(new x20() { // from class: l.rho0
            @Override // p153l.x20
            public final void call() {
                this.f163187a.m130361b4();
            }
        }, new x20() { // from class: l.sho0
            @Override // p153l.x20
            public final void call() {
                this.f168735a.m130360a4();
            }
        });
        this.f104511i.m136222B5(false);
        o9p0 o9p0Var = this.f104515m;
        if (o9p0Var != null) {
            o9p0Var.m166794p();
        } else {
            mo130359X0();
        }
        HashMap map = new HashMap();
        map.put("entrance_type", ((jlm0) m213810E2()).f165204a0);
        i4g0.m138521s("e_start_audio_room", mo78457R2(), map);
    }

    /* JADX INFO: renamed from: s4 */
    public void m130376s4(BLiveVoiceTopic bLiveVoiceTopic) {
        this.f104513k = bLiveVoiceTopic;
    }

    /* JADX INFO: renamed from: t4, reason: merged with bridge method [inline-methods] */
    public final void m130373o4(final BLiveVoice bLiveVoice) {
        duringCreated(VoiceRoomApiProvider.getOnGoingLive(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.tho0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174400a.m130370l4(bLiveVoice, (List) obj);
            }
        }, new y20() { // from class: l.uho0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f48078f6);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public void m130378v4(boolean z) {
        if (z && this.f104514l == null) {
            duringCreated(VoiceRoomApiProvider.getUserMask(zrv.f205799a.m207631D0())).doOnNext(new y20() { // from class: l.cio0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f81969a.m130371m4((BLiveUserMask) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.dio0
                @Override // p153l.y20
                public final void call(Object obj) {
                    gio0.m130341L3((BLiveUserMask) obj);
                }
            }, new y20() { // from class: l.eio0
                @Override // p153l.y20
                public final void call(Object obj) {
                    gio0.m130342M3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public void m130379w4(BLiveUserMask bLiveUserMask) {
        this.f104514l = bLiveUserMask;
    }

    /* JADX INFO: renamed from: x4 */
    public boolean m130380x4() {
        return ((VoicePreviewViewModel) this.viewModel).m79562F();
    }

    /* JADX INFO: renamed from: y4 */
    public final void m130381y4(List<BLiveVoice> list) {
        if (jyb.m147479J(list)) {
            this.f104511i.m136222B5(false);
            return;
        }
        final BLiveVoice bLiveVoice = list.get(0);
        if (!((jlm0) m213810E2()).m202193m().m146880f() || !m130355j4(bLiveVoice)) {
            this.f104511i.m136222B5(false);
        } else {
            if (!"anchor-away".equals(bLiveVoice.bossState)) {
                this.f104512j = act().dialog().m21499D(R$string.f47423Ai).m21541l0(R$string.f47621Ji, new Runnable() { // from class: l.fio0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f99211a.m130372n4(bLiveVoice);
                    }
                }).m21555t0(R$string.f47599Ii, new Runnable() { // from class: l.qho0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f157741a.m130373o4(bLiveVoice);
                    }
                }).m21495B(false).m21567z0();
                return;
            }
            this.f104511i.m136263z5(bLiveVoice);
            this.f104511i.m136222B5(true);
            this.f104511i.m136233L4();
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final void m130382z4() {
        ((VoicePreviewViewModel) this.viewModel).m79580d0();
    }
}
