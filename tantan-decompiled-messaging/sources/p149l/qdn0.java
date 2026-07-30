package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePopTotal;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class qdn0 extends h4t<nnn0, VoiceRoomInfoView> {

    /* JADX INFO: renamed from: i */
    public User f153945i;

    public qdn0(bsm bsmVar, VoiceRoomInfoView voiceRoomInfoView) {
        super(bsmVar);
        this.f153945i = null;
        mo51532C(voiceRoomInfoView);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m174051M3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m174053O3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m174054P3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m174063f4(BLiveVoice bLiveVoice) {
        ((VoiceRoomInfoView) this.viewModel).m78434B(bLiveVoice);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public void m174064Z3() {
        if (!((nnn0) m206027E2()).mo97490p()) {
            ((nnn0) m206027E2()).m132125e0(false, mo77274R2(), "top_button", new d30() { // from class: l.fdn0
                @Override // p149l.d30
                public final void call() {
                    this.f97062a.m174066b4();
                }
            });
        } else if (x4s.m207012b(((nnn0) m206027E2()).mo149813j().liveMode)) {
            m206028F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().m172467p();
        } else {
            m206028F2().VoiceTopicEvent.voiceInfoDialogVisibleEvent().mo172463j(Boolean.TRUE);
        }
        m174082s4(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final void m174065a4(boolean z) {
        if (z) {
            lsi0.m151593w(R$string.f46803L4);
        }
        ((VoiceRoomInfoView) this.viewModel).m78444m(false);
        ((VoiceRoomInfoView) this.viewModel).m78445n(m206032L2(), false);
        ((nnn0) m206027E2()).m160247O2().mo165470l().canFollowAnchor = false;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m174066b4() {
        m174065a4(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m174067c4(Followship followship) {
        if (uxi.m196181b(((nnn0) m206027E2()).m132146l0(), ((nnn0) m206027E2()).m132167u0())) {
            m174065a4(false);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m174068d4(BLiveVoicePopTotal bLiveVoicePopTotal) {
        ((VoiceRoomInfoView) this.viewModel).m78449z(bLiveVoicePopTotal.popsTotal);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m174069e4(BLiveVoiceRoom bLiveVoiceRoom) {
        ((VoiceRoomInfoView) this.viewModel).m78435C(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m174070g4(LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate) {
        ((VoiceRoomInfoView) this.viewModel).m78442k(voiceRoomTopicUpdate);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m174071h4(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        ((VoiceRoomInfoView) this.viewModel).m78438G(voiceLiveHighQualityTagMessage);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m174072i4(BLiveVoiceRoom bLiveVoiceRoom) {
        ((VoiceRoomInfoView) this.viewModel).m78433A(bLiveVoiceRoom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ mqv m174073j4(bik0.C15867a c15867a) {
        return ((nnn0) m206027E2()).m160249P2().m102064m(((nnn0) m206027E2()).m132146l0().f56011id);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m174074k4(mqv mqvVar) {
        ((VoiceRoomInfoView) this.viewModel).m78448y(mqvVar);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m174075l4(VoiceLiveHeartBeatInfoMessage voiceLiveHeartBeatInfoMessage) {
        ((VoiceRoomInfoView) this.viewModel).m78449z(voiceLiveHeartBeatInfoMessage.heartBeat);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m174076m4(Long l2) {
        m174080q4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final void m174077n4() {
        if (m206032L2() || !((nnn0) m206027E2()).m160247O2().mo165470l().canFollowAnchor) {
            return;
        }
        duringCreated(((nnn0) m206027E2()).m132165t0()).subscribe(ffw.m121193d(new e30() { // from class: l.gdn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102125a.m174067c4((Followship) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public void m174078o4() {
        if (m206032L2()) {
            if (x4s.m207012b(((nnn0) m206027E2()).mo149813j().liveMode)) {
                m206028F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().m172467p();
            } else {
                m206028F2().VoiceTopicEvent.voiceInfoDialogVisibleEvent().mo172463j(Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public void m174079p4() {
        String str = ((nnn0) m206027E2()).m132146l0().f56011id;
        u4n0.m191752k(this, str, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m174080q4() {
        duringCreated(VoiceRoomApiProvider.getVoiceLivePopTotalValue(((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).m132146l0().f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.ddn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85611a.m174068d4((BLiveVoicePopTotal) obj);
            }
        }, new e30() { // from class: l.edn0
            @Override // p149l.e30
            public final void call(Object obj) {
                qdn0.m174051M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m174081r4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(6002).m206701e(str).m206699c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public void m174082s4(boolean z) {
        sds.C19911a c19911aM183549h = sds.m183540k().m183545d(((nnn0) m206027E2()).m132146l0().f56011id).m183546e("top_button").m183549h(((nnn0) m206027E2()).m132146l0().f56011id);
        if (((nnn0) m206027E2()).mo149813j() != null) {
            c19911aM183549h.m183548g(((nnn0) m206027E2()).mo149813j().state);
        }
        if (z) {
            zcu.m218088c("p_user_audio_room", c19911aM183549h.m183542a());
        } else {
            zcu.m218089d("p_user_audio_room", c19911aM183549h.m183542a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((VoiceRoomInfoView) this.viewModel).m78436E(true);
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        ((VoiceRoomInfoView) this.viewModel).m78447x(bLiveVoiceMo149813j.isOverseasArea());
        m174077n4();
        if (bLiveVoiceMo149813j.isIncomerArea()) {
            ((VoiceRoomInfoView) this.viewModel).m78443l(m206032L2());
            ((VoiceRoomInfoView) this.viewModel).m78444m(!m206032L2() && ((nnn0) m206027E2()).m160247O2().mo165470l().canFollowAnchor);
            duringCreated(((nnn0) m206027E2()).m160247O2().m165468f()).subscribe(ffw.m121193d(new e30() { // from class: l.bdn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f75045a.m174069e4((BLiveVoiceRoom) obj);
                }
            }));
            duringCreated(((nnn0) m206027E2()).m160247O2().m165466d()).subscribe(ffw.m121193d(new e30() { // from class: l.idn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f112666a.m174063f4((BLiveVoice) obj);
                }
            }));
            duringCreated(((nnn0) m206027E2()).m132160q1().m189117k0()).subscribe(ffw.m121193d(new e30() { // from class: l.jdn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f117424a.m174070g4((LongLinkLiveMessage.VoiceRoomTopicUpdate) obj);
                }
            }));
            duringCreated(((nnn0) m206027E2()).m132160q1().m189124m1()).subscribe(ffw.m121193d(new e30() { // from class: l.kdn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f122570a.m174071h4((LongLinkLiveMessage.VoiceLiveHighQualityTagMessage) obj);
                }
            }));
            return;
        }
        duringCreated(((nnn0) m206027E2()).m160247O2().m165468f()).subscribe(ffw.m121193d(new e30() { // from class: l.ldn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127570a.m174072i4((BLiveVoiceRoom) obj);
            }
        }));
        ((VoiceRoomInfoView) this.viewModel).m78445n(m206032L2(), ((nnn0) m206027E2()).m160247O2().mo165470l().canFollowAnchor);
        duringCreated(((nnn0) m206027E2()).m160251Q2()).distinctUntilChanged().map(new w9j() { // from class: l.mdn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133279a.m174073j4((bik0.C15867a) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ndn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138292a.m174074k4((mqv) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189063O0()).subscribe(ffw.m121194e(new e30() { // from class: l.odn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143220a.m174075l4((VoiceLiveHeartBeatInfoMessage) obj);
            }
        }, new e30() { // from class: l.pdn0
            @Override // p149l.e30
            public final void call(Object obj) {
                qdn0.m174053O3((Throwable) obj);
            }
        }));
        m174080q4();
        boolean zM195674L6 = ypv.m215672k().m195674L6();
        int iM195849h6 = ypv.m215672k().m195849h6();
        if (zM195674L6) {
            m129299H3(((nnn0) m206027E2()).m132135h2(iM195849h6, TimeUnit.SECONDS)).subscribe(ffw.m121194e(new e30() { // from class: l.cdn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80385a.m174076m4((Long) obj);
                }
            }, new e30() { // from class: l.hdn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    qdn0.m174054P3((Throwable) obj);
                }
            }));
        }
    }
}
