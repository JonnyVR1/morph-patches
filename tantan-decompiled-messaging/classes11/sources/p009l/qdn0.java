package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoicePopTotal;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.concurrent.TimeUnit;
import l.bik0;
import l.bsm;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.h4t;
import l.lsi0;
import l.mqv;
import l.nnn0;
import l.sds;
import l.u4n0;
import l.uxi;
import l.w9j;
import l.x1e0;
import l.x4s;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qdn0 extends h4t<nnn0, VoiceRoomInfoView> {

    /* JADX INFO: renamed from: i */
    public User f19164i;

    public qdn0(bsm bsmVar, VoiceRoomInfoView voiceRoomInfoView) {
        super(bsmVar);
        this.f19164i = null;
        C(voiceRoomInfoView);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m20863M3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m20865O3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m20866P3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m20875f4(BLiveVoice bLiveVoice) {
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8637B(bLiveVoice);
    }

    /* JADX INFO: renamed from: T */
    public void m20876T() {
        super/*l.k4t*/.T();
    }

    /* JADX INFO: renamed from: Z3 */
    public void m20877Z3() {
        if (!E2().p()) {
            E2().e0(false, R2(), "top_button", new d30() { // from class: l.fdn0
                public final void call() {
                    this.f12956a.m20879b4();
                }
            });
        } else if (x4s.b(((BLiveAbsData) E2().V2()).liveMode)) {
            F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().p();
        } else {
            F2().VoiceTopicEvent.voiceInfoDialogVisibleEvent().j(Boolean.TRUE);
        }
        m20895s4(true);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m20878a4(boolean z) {
        if (z) {
            lsi0.w(R.string.L4);
        }
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8649m(false);
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8650n(L2(), false);
        E2().O2().c().canFollowAnchor = false;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m20879b4() {
        m20878a4(true);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m20880c4(Followship followship) {
        if (uxi.b(E2().l0(), E2().u0())) {
            m20878a4(false);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m20881d4(BLiveVoicePopTotal bLiveVoicePopTotal) {
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8654z(bLiveVoicePopTotal.popsTotal);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m20882e4(BLiveVoiceRoom bLiveVoiceRoom) {
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8638C(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m20883g4(LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate) {
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8647k(voiceRoomTopicUpdate);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m20884h4(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8642G(voiceLiveHighQualityTagMessage);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m20885i4(BLiveVoiceRoom bLiveVoiceRoom) {
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8636A(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ mqv m20886j4(bik0.a aVar) {
        return E2().P2().m(((DbObject) E2().l0()).id);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m20887k4(mqv mqvVar) {
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8653y(mqvVar);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m20888l4(VoiceLiveHeartBeatInfoMessage voiceLiveHeartBeatInfoMessage) {
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8654z(voiceLiveHeartBeatInfoMessage.heartBeat);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m20889m4(Long l2) {
        m20893q4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m20890n4() {
        if (L2() || !E2().O2().c().canFollowAnchor) {
            return;
        }
        duringCreated(E2().t0()).subscribe(ffw.d(new e30() { // from class: l.gdn0
            public final void call(Object obj) {
                this.f13450a.m20880c4((Followship) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public void m20891o4() {
        if (L2()) {
            if (x4s.b(((BLiveAbsData) E2().V2()).liveMode)) {
                F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().p();
            } else {
                F2().VoiceTopicEvent.voiceInfoDialogVisibleEvent().j(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: p4 */
    public void m20892p4() {
        String str = ((DbObject) E2().l0()).id;
        u4n0.k(this, str, str);
    }

    /* JADX INFO: renamed from: q4 */
    public void m20893q4() {
        duringCreated(VoiceRoomApiProvider.getVoiceLivePopTotalValue(E2().k(), ((DbObject) E2().l0()).id)).subscribe(ffw.e(new e30() { // from class: l.ddn0
            public final void call(Object obj) {
                this.f11778a.m20881d4((BLiveVoicePopTotal) obj);
            }
        }, new e30() { // from class: l.edn0
            public final void call(Object obj) {
                qdn0.m20863M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m20894r4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        F2().SchemeHandleEvent.handleScheme().j(new x1e0.a(6002).e(str).c());
    }

    /* JADX INFO: renamed from: s4 */
    public void m20895s4(boolean z) {
        sds.a aVarH = sds.k().d(((DbObject) E2().l0()).id).e("top_button").h(((DbObject) E2().l0()).id);
        if (E2().V2() != null) {
            aVarH.g(((BLiveAbsData) E2().V2()).state);
        }
        if (z) {
            zcu.c("p_user_audio_room", aVarH.a());
        } else {
            zcu.d("p_user_audio_room", aVarH.a());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m20896t() {
        super/*l.k4t*/.t();
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8640E(true);
        BLiveVoice bLiveVoiceV2 = E2().V2();
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8652x(bLiveVoiceV2.isOverseasArea());
        m20890n4();
        if (bLiveVoiceV2.isIncomerArea()) {
            ((VoiceRoomInfoView) ((bwr) this).viewModel).m8648l(L2());
            ((VoiceRoomInfoView) ((bwr) this).viewModel).m8649m(!L2() && E2().O2().c().canFollowAnchor);
            duringCreated(E2().O2().f()).subscribe(ffw.d(new e30() { // from class: l.bdn0
                public final void call(Object obj) {
                    this.f10025a.m20882e4((BLiveVoiceRoom) obj);
                }
            }));
            duringCreated(E2().O2().d()).subscribe(ffw.d(new e30() { // from class: l.idn0
                public final void call(Object obj) {
                    this.f14583a.m20875f4((BLiveVoice) obj);
                }
            }));
            duringCreated(E2().q1().k0()).subscribe(ffw.d(new e30() { // from class: l.jdn0
                public final void call(Object obj) {
                    this.f15065a.m20883g4((LongLinkLiveMessage.VoiceRoomTopicUpdate) obj);
                }
            }));
            duringCreated(E2().q1().m1()).subscribe(ffw.d(new e30() { // from class: l.kdn0
                public final void call(Object obj) {
                    this.f15616a.m20884h4((LongLinkLiveMessage.VoiceLiveHighQualityTagMessage) obj);
                }
            }));
            return;
        }
        duringCreated(E2().O2().f()).subscribe(ffw.d(new e30() { // from class: l.ldn0
            public final void call(Object obj) {
                this.f16113a.m20885i4((BLiveVoiceRoom) obj);
            }
        }));
        ((VoiceRoomInfoView) ((bwr) this).viewModel).m8650n(L2(), E2().O2().c().canFollowAnchor);
        duringCreated(E2().Q2()).distinctUntilChanged().map(new w9j() { // from class: l.mdn0
            public final Object call(Object obj) {
                return this.f16845a.m20886j4((bik0.a) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.ndn0
            public final void call(Object obj) {
                this.f17421a.m20887k4((mqv) obj);
            }
        }));
        duringCreated(E2().q1().O0()).subscribe(ffw.e(new e30() { // from class: l.odn0
            public final void call(Object obj) {
                this.f17932a.m20888l4((VoiceLiveHeartBeatInfoMessage) obj);
            }
        }, new e30() { // from class: l.pdn0
            public final void call(Object obj) {
                qdn0.m20865O3((Throwable) obj);
            }
        }));
        m20893q4();
        boolean zL6 = ypv.m25490k().L6();
        int iH6 = ypv.m25490k().h6();
        if (zL6) {
            H3(E2().h2(iH6, TimeUnit.SECONDS)).subscribe(ffw.e(new e30() { // from class: l.cdn0
                public final void call(Object obj) {
                    this.f10550a.m20889m4((Long) obj);
                }
            }, new e30() { // from class: l.hdn0
                public final void call(Object obj) {
                    qdn0.m20866P3((Throwable) obj);
                }
            }));
        }
    }
}
