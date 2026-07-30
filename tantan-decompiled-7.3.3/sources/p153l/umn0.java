package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePopTotal;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class umn0 extends i6t<rwn0, VoiceRoomInfoView> {

    /* JADX INFO: renamed from: i */
    public User f179660i;

    public umn0(dum dumVar, VoiceRoomInfoView voiceRoomInfoView) {
        super(dumVar);
        this.f179660i = null;
        mo52715C(voiceRoomInfoView);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m196759M3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m196761O3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m196762P3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m196771f4(BLiveVoice bLiveVoice) {
        ((VoiceRoomInfoView) this.viewModel).m79617B(bLiveVoice);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public void m196772Z3() {
        if (!((rwn0) m213810E2()).mo118373p()) {
            ((rwn0) m213810E2()).m168511e0(false, mo78457R2(), "top_button", new x20() { // from class: l.jmn0
                @Override // p153l.x20
                public final void call() {
                    this.f121690a.m196774b4();
                }
            });
        } else if (y6s.m214494b(((rwn0) m213810E2()).mo183435j().liveMode)) {
            m213811F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().m199277p();
        } else {
            m213811F2().VoiceTopicEvent.voiceInfoDialogVisibleEvent().mo199273j(Boolean.TRUE);
        }
        m196790s4(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final void m196773a4(boolean z) {
        if (z) {
            o1j0.m165649w(R$string.f47651L4);
        }
        ((VoiceRoomInfoView) this.viewModel).m79627m(false);
        ((VoiceRoomInfoView) this.viewModel).m79628n(m213815L2(), false);
        ((rwn0) m213810E2()).m183409O2().mo122892l().canFollowAnchor = false;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m196774b4() {
        m196773a4(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m196775c4(Followship followship) {
        if (q0j.m174711b(((rwn0) m213810E2()).m168532l0(), ((rwn0) m213810E2()).m168551u0())) {
            m196773a4(false);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m196776d4(BLiveVoicePopTotal bLiveVoicePopTotal) {
        ((VoiceRoomInfoView) this.viewModel).m79632z(bLiveVoicePopTotal.popsTotal);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m196777e4(BLiveVoiceRoom bLiveVoiceRoom) {
        ((VoiceRoomInfoView) this.viewModel).m79618C(bLiveVoiceRoom);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m196778g4(LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate) {
        ((VoiceRoomInfoView) this.viewModel).m79625k(voiceRoomTopicUpdate);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m196779h4(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        ((VoiceRoomInfoView) this.viewModel).m79621G(voiceLiveHighQualityTagMessage);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m196780i4(BLiveVoiceRoom bLiveVoiceRoom) {
        ((VoiceRoomInfoView) this.viewModel).m79616A(bLiveVoiceRoom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ nsv m196781j4(hrk0.C17564a c17564a) {
        return ((rwn0) m213810E2()).m183411P2().m136874m(((rwn0) m213810E2()).m168532l0().f56859id);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m196782k4(nsv nsvVar) {
        ((VoiceRoomInfoView) this.viewModel).m79631y(nsvVar);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m196783l4(VoiceLiveHeartBeatInfoMessage voiceLiveHeartBeatInfoMessage) {
        ((VoiceRoomInfoView) this.viewModel).m79632z(voiceLiveHeartBeatInfoMessage.heartBeat);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m196784m4(Long l2) {
        m196788q4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final void m196785n4() {
        if (m213815L2() || !((rwn0) m213810E2()).m183409O2().mo122892l().canFollowAnchor) {
            return;
        }
        duringCreated(((rwn0) m213810E2()).m168549t0()).subscribe(dhw.m115825d(new y20() { // from class: l.kmn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127523a.m196775c4((Followship) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public void m196786o4() {
        if (m213815L2()) {
            if (y6s.m214494b(((rwn0) m213810E2()).mo183435j().liveMode)) {
                m213811F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().m199277p();
            } else {
                m213811F2().VoiceTopicEvent.voiceInfoDialogVisibleEvent().mo199273j(Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public void m196787p4() {
        String str = ((rwn0) m213810E2()).m168532l0().f56859id;
        ydn0.m215258k(this, str, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m196788q4() {
        duringCreated(VoiceRoomApiProvider.getVoiceLivePopTotalValue(((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).m168532l0().f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.hmn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110647a.m196776d4((BLiveVoicePopTotal) obj);
            }
        }, new y20() { // from class: l.imn0
            @Override // p153l.y20
            public final void call(Object obj) {
                umn0.m196759M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m196789r4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(6002).m103154e(str).m103152c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public void m196790s4(boolean z) {
        tfs.C20303a c20303aM190978h = tfs.m190969k().m190974d(((rwn0) m213810E2()).m168532l0().f56859id).m190975e("top_button").m190978h(((rwn0) m213810E2()).m168532l0().f56859id);
        if (((rwn0) m213810E2()).mo183435j() != null) {
            c20303aM190978h.m190977g(((rwn0) m213810E2()).mo183435j().state);
        }
        if (z) {
            afu.m97554c("p_user_audio_room", c20303aM190978h.m190971a());
        } else {
            afu.m97555d("p_user_audio_room", c20303aM190978h.m190971a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((VoiceRoomInfoView) this.viewModel).m79619E(true);
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        ((VoiceRoomInfoView) this.viewModel).m79630x(bLiveVoiceMo183435j.isOverseasArea());
        m196785n4();
        if (bLiveVoiceMo183435j.isIncomerArea()) {
            ((VoiceRoomInfoView) this.viewModel).m79626l(m213815L2());
            ((VoiceRoomInfoView) this.viewModel).m79627m(!m213815L2() && ((rwn0) m213810E2()).m183409O2().mo122892l().canFollowAnchor);
            duringCreated(((rwn0) m213810E2()).m183409O2().m188660f()).subscribe(dhw.m115825d(new y20() { // from class: l.fmn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99813a.m196777e4((BLiveVoiceRoom) obj);
                }
            }));
            duringCreated(((rwn0) m213810E2()).m183409O2().m188658d()).subscribe(dhw.m115825d(new y20() { // from class: l.mmn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137623a.m196771f4((BLiveVoice) obj);
                }
            }));
            duringCreated(((rwn0) m213810E2()).m168545q1().m98299k0()).subscribe(dhw.m115825d(new y20() { // from class: l.nmn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f142729a.m196778g4((LongLinkLiveMessage.VoiceRoomTopicUpdate) obj);
                }
            }));
            duringCreated(((rwn0) m213810E2()).m168545q1().m98306m1()).subscribe(dhw.m115825d(new y20() { // from class: l.omn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147980a.m196779h4((LongLinkLiveMessage.VoiceLiveHighQualityTagMessage) obj);
                }
            }));
            return;
        }
        duringCreated(((rwn0) m213810E2()).m183409O2().m188660f()).subscribe(dhw.m115825d(new y20() { // from class: l.pmn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153205a.m196780i4((BLiveVoiceRoom) obj);
            }
        }));
        ((VoiceRoomInfoView) this.viewModel).m79628n(m213815L2(), ((rwn0) m213810E2()).m183409O2().mo122892l().canFollowAnchor);
        duringCreated(((rwn0) m213810E2()).m183413Q2()).distinctUntilChanged().map(new qcj() { // from class: l.qmn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f158385a.m196781j4((hrk0.C17564a) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.rmn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163893a.m196782k4((nsv) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98245O0()).subscribe(dhw.m115826e(new y20() { // from class: l.smn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169592a.m196783l4((VoiceLiveHeartBeatInfoMessage) obj);
            }
        }, new y20() { // from class: l.tmn0
            @Override // p153l.y20
            public final void call(Object obj) {
                umn0.m196761O3((Throwable) obj);
            }
        }));
        m196788q4();
        boolean zM203461L6 = zrv.m221193k().m203461L6();
        int iM203636h6 = zrv.m221193k().m203636h6();
        if (zM203461L6) {
            m138858H3(((rwn0) m213810E2()).m168521h2(iM203636h6, TimeUnit.SECONDS)).subscribe(dhw.m115826e(new y20() { // from class: l.gmn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f105017a.m196784m4((Long) obj);
                }
            }, new y20() { // from class: l.lmn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    umn0.m196762P3((Throwable) obj);
                }
            }));
        }
    }
}
