package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleUser;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSummary;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class bfp0 extends i6t<rwn0, VoiceVirtualRoomInfoTopBarView> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public final VoiceVirtualSettleSuccessView f76529i;

    /* JADX INFO: renamed from: j */
    public final Set<String> f76530j;

    public bfp0(dum dumVar, VoiceVirtualRoomInfoTopBarView voiceVirtualRoomInfoTopBarView, @Nullable VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView) {
        super(dumVar);
        this.f76530j = new HashSet();
        this.f76529i = voiceVirtualSettleSuccessView;
        mo52715C(voiceVirtualRoomInfoTopBarView);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ Boolean m103939N3(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m103942R3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m103945U3(BLiveExtraResponse bLiveExtraResponse) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m103952m4(vxj0 vxj0Var) {
        m103972v4();
    }

    /* JADX INFO: renamed from: b4 */
    public void m103953b4() {
        m213811F2().VirtualRoomInfoEvent.showVoiceRoomLevelDetail().m199277p();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m103954c4(BLiveExtraResponse bLiveExtraResponse) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m78646J0(bLiveExtraResponse.data, true);
        List<BLiveVoiceVirtualRoomSettleItem> list = bLiveExtraResponse.data.voiceSettles;
        if (list.isEmpty()) {
            return;
        }
        BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem = list.get(0);
        if (bLiveVoiceVirtualRoomSettleItem.likePopUp == null && !TextUtils.isEmpty(bLiveVoiceVirtualRoomSettleItem.toast)) {
            o1j0.m165651y(bLiveVoiceVirtualRoomSettleItem.toast);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m103955d4(LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m78647K0(voiceSettleMessage);
        if (voiceSettleMessage.getMsgType() == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.approve) {
            if (TextUtils.equals(zrv.f205799a.m207631D0(), voiceSettleMessage.getUserId())) {
                m103975y4();
            }
            this.f76530j.add(voiceSettleMessage.getUserId());
        } else if (voiceSettleMessage.getMsgType() == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.quit) {
            this.f76530j.remove(voiceSettleMessage.getUserId());
        }
        m213811F2().BottomZoneEvent.refreshAllButton().m199277p();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m103956e4(BLiveExtraResponse bLiveExtraResponse) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m78646J0(bLiveExtraResponse.data, false);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m103957f4(View view) {
        m103970t4();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m103958g4(LongLinkVirtualVoice.VoiceSettleInviteMessage voiceSettleInviteMessage, View view) {
        m103973w4(voiceSettleInviteMessage.getApplyToken());
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m103959h4(LongLinkVirtualVoice.VoiceRoomTitleUpdate voiceRoomTitleUpdate) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m78642E0(voiceRoomTitleUpdate.getTitle());
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m103960i4(BLiveVoiceVirtualRoomSettleUser bLiveVoiceVirtualRoomSettleUser) {
        this.f76530j.add(bLiveVoiceVirtualRoomSettleUser.userId);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m103961j4(BLiveExtraResponse bLiveExtraResponse) {
        List<BLiveVoiceVirtualRoomSettleUser> list = bLiveExtraResponse.data.voiceRoomProfile.settleMembers;
        if (list.isEmpty()) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.qep0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157198a.m103960i4((BLiveVoiceVirtualRoomSettleUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ HashSet m103962k4(h4m0 h4m0Var) {
        return new HashSet(this.f76530j);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m103963l4(u3m0 u3m0Var) {
        return Boolean.valueOf(this.f76530j.contains(u3m0Var.getUserId()));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f76530j.clear();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m103964n4(Boolean bool) {
        m103972v4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m103965o4(LongLinkVirtualVoice.VoiceRoomCover voiceRoomCover) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m78654w0(voiceRoomCover.getCoverUrl());
    }

    /* JADX INFO: renamed from: p4 */
    public void m103966p4() {
        px50.C19461a c19461a = new px50.C19461a(9000);
        c19461a.m174141B(efv.f93831J);
        c19461a.m174152z(1.0d, 1.0d);
        c19461a.m174146t(80);
        m213811F2().OpenH5Event.open().mo199273j(c19461a.m174143q());
    }

    /* JADX INFO: renamed from: q4 */
    public void m103967q4() {
        m213811F2().VoiceCloseEvent.showFloatWindow().mo199273j(new dan0(false, "click_back_button"));
    }

    /* JADX INFO: renamed from: r4 */
    public void m103968r4() {
        m213811F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().m199277p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final void m103969s4() {
        duringCreated(VirtualVoiceRoomApiProvider.getUserSettlesStatus(((rwn0) m213810E2()).m202194o(), zrv.f205799a.m207631D0())).subscribe(dhw.m115829h(new y20() { // from class: l.nep0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141673a.m103956e4((BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98263X0()).subscribe(dhw.m115825d(new y20() { // from class: l.iep0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114605a.m103959h4((LongLinkVirtualVoice.VoiceRoomTitleUpdate) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98255T0()).subscribe(dhw.m115825d(new y20() { // from class: l.tep0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173889a.m103955d4((LongLinkVirtualVoice.VoiceSettleMessage) obj);
            }
        }));
        m103971u4();
        m103969s4();
        duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceRoomInfo(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.uep0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178684a.m103961j4((BLiveExtraResponse) obj);
            }
        }));
        m138860d3(h4m0.class, new qcj() { // from class: l.vep0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183839a.m103962k4((h4m0) obj);
            }
        });
        m138860d3(u3m0.class, new qcj() { // from class: l.wep0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f188718a.m103963l4((u3m0) obj);
            }
        });
        C22421c<T> c22421cDuringCreated = duringCreated(((rwn0) m213810E2()).m168545q1().m98326t0());
        final VoiceVirtualRoomInfoTopBarView voiceVirtualRoomInfoTopBarView = (VoiceVirtualRoomInfoTopBarView) this.viewModel;
        Objects.requireNonNull(voiceVirtualRoomInfoTopBarView);
        c22421cDuringCreated.subscribe(dhw.m115829h(new y20() { // from class: l.xep0
            @Override // p153l.y20
            public final void call(Object obj) {
                voiceVirtualRoomInfoTopBarView.m78645I0((LongLinkVirtualVoice.VoiceRoomLevelUp) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98341z0()).subscribe(dhw.m115829h(new y20() { // from class: l.yep0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199392a.m103974x4((LongLinkVirtualVoice.VoiceSettleInviteMessage) obj);
            }
        }));
        duringCreated(m213811F2().VirtualRoomInfoEvent.settleCurrentRoom().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.zep0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204040a.m103952m4((vxj0) obj);
            }
        }));
        if (((rwn0) m213810E2()).mo146596L2()) {
            ((rwn0) m213810E2()).m168446B0().filter(new qcj() { // from class: l.afp0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return bfp0.m103939N3((Boolean) obj);
                }
            }).take(1).subscribe(dhw.m115829h(new y20() { // from class: l.jep0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120516a.m103964n4((Boolean) obj);
                }
            }));
        }
        duringCreated(((rwn0) m213810E2()).m168545q1().m98309n1()).subscribe(dhw.m115829h(new y20() { // from class: l.sep0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167635a.m103965o4((LongLinkVirtualVoice.VoiceRoomCover) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m103970t4() {
        i4g0.m138523u("e_audio_member_invite_settle_pop", mo78457R2(), new pf60("anchorId", ((rwn0) m213810E2()).m168526j0()), new pf60("roomId", ((rwn0) m213810E2()).m202194o()), new pf60("click_type", "reject"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m103971u4() {
        C22421c<T> c22421cDuringCreated = duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceRoomSummary(((rwn0) m213810E2()).m202194o()));
        final VoiceVirtualRoomInfoTopBarView voiceVirtualRoomInfoTopBarView = (VoiceVirtualRoomInfoTopBarView) this.viewModel;
        Objects.requireNonNull(voiceVirtualRoomInfoTopBarView);
        c22421cDuringCreated.subscribe(dhw.m115829h(new y20() { // from class: l.mep0
            @Override // p153l.y20
            public final void call(Object obj) {
                voiceVirtualRoomInfoTopBarView.m78640B0((BLiveVoiceVirtualRoomSummary) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m103972v4() {
        duringCreated(VirtualVoiceRoomApiProvider.requestToSettleRoom(((rwn0) m213810E2()).m202194o(), zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.oep0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147009a.m103954c4((BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.pep0
            @Override // p153l.y20
            public final void call(Object obj) {
                bfp0.m103942R3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final void m103973w4(String str) {
        i4g0.m138523u("e_audio_member_invite_settle_pop", mo78457R2(), new pf60("anchorId", ((rwn0) m213810E2()).m168526j0()), new pf60("roomId", ((rwn0) m213810E2()).m202194o()), new pf60("click_type", "accept"));
        duringCreated(VirtualVoiceRoomApiProvider.requestToSettleRoom(((rwn0) m213810E2()).m202194o(), zrv.f205799a.m207631D0(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.rep0
            @Override // p153l.y20
            public final void call(Object obj) {
                bfp0.m103945U3((BLiveExtraResponse) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: x4 */
    public final void m103974x4(final LongLinkVirtualVoice.VoiceSettleInviteMessage voiceSettleInviteMessage) {
        new th0.C20312a(this.f196919f).m191160s("邀请入驻").m191151j(voiceSettleInviteMessage.getFromUserName() + "邀请你入驻本群").m191147f("拒绝").m191144c(new View.OnClickListener() { // from class: l.kep0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126206a.m103957f4(view);
            }
        }).m191159r("入驻").m191156o(new View.OnClickListener() { // from class: l.lep0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131772a.m103958g4(voiceSettleInviteMessage, view);
            }
        }).m191148g(false).m191143b(true).m191149h(false).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: y4 */
    public void m103975y4() {
        VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView = this.f76529i;
        if (voiceVirtualSettleSuccessView != null) {
            voiceVirtualSettleSuccessView.m78728B0(this);
        }
    }

    /* JADX INFO: renamed from: z4 */
    public void m103976z4(String str) {
    }
}
