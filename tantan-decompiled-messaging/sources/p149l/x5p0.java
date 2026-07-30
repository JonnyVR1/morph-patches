package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleUser;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSummary;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class x5p0 extends h4t<nnn0, VoiceVirtualRoomInfoTopBarView> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public final VoiceVirtualSettleSuccessView f191176i;

    /* JADX INFO: renamed from: j */
    public final Set<String> f191177j;

    public x5p0(bsm bsmVar, VoiceVirtualRoomInfoTopBarView voiceVirtualRoomInfoTopBarView, @Nullable VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView) {
        super(bsmVar);
        this.f191177j = new HashSet();
        this.f191176i = voiceVirtualSettleSuccessView;
        mo51532C(voiceVirtualRoomInfoTopBarView);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ Boolean m207102N3(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m207105R3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m207108U3(BLiveExtraResponse bLiveExtraResponse) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m207115m4(soj0 soj0Var) {
        m207135v4();
    }

    /* JADX INFO: renamed from: b4 */
    public void m207116b4() {
        m206028F2().VirtualRoomInfoEvent.showVoiceRoomLevelDetail().m172467p();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m207117c4(BLiveExtraResponse bLiveExtraResponse) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m77463J0(bLiveExtraResponse.data, true);
        List<BLiveVoiceVirtualRoomSettleItem> list = bLiveExtraResponse.data.voiceSettles;
        if (list.isEmpty()) {
            return;
        }
        BLiveVoiceVirtualRoomSettleItem bLiveVoiceVirtualRoomSettleItem = list.get(0);
        if (bLiveVoiceVirtualRoomSettleItem.likePopUp == null && !TextUtils.isEmpty(bLiveVoiceVirtualRoomSettleItem.toast)) {
            lsi0.m151595y(bLiveVoiceVirtualRoomSettleItem.toast);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m207118d4(LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m77464K0(voiceSettleMessage);
        if (voiceSettleMessage.getMsgType() == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.approve) {
            if (TextUtils.equals(ypv.f199493a.m199309D0(), voiceSettleMessage.getUserId())) {
                m207138y4();
            }
            this.f191177j.add(voiceSettleMessage.getUserId());
        } else if (voiceSettleMessage.getMsgType() == LongLinkVirtualVoice.VoiceSettleMessage.MsgType.quit) {
            this.f191177j.remove(voiceSettleMessage.getUserId());
        }
        m206028F2().BottomZoneEvent.refreshAllButton().m172467p();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m207119e4(BLiveExtraResponse bLiveExtraResponse) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m77463J0(bLiveExtraResponse.data, false);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m207120f4(View view) {
        m207133t4();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m207121g4(LongLinkVirtualVoice.VoiceSettleInviteMessage voiceSettleInviteMessage, View view) {
        m207136w4(voiceSettleInviteMessage.getApplyToken());
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m207122h4(LongLinkVirtualVoice.VoiceRoomTitleUpdate voiceRoomTitleUpdate) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m77459E0(voiceRoomTitleUpdate.getTitle());
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m207123i4(BLiveVoiceVirtualRoomSettleUser bLiveVoiceVirtualRoomSettleUser) {
        this.f191177j.add(bLiveVoiceVirtualRoomSettleUser.userId);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m207124j4(BLiveExtraResponse bLiveExtraResponse) {
        List<BLiveVoiceVirtualRoomSettleUser> list = bLiveExtraResponse.data.voiceRoomProfile.settleMembers;
        if (list.isEmpty()) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.m5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131410a.m207123i4((BLiveVoiceVirtualRoomSettleUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ HashSet m207125k4(dvl0 dvl0Var) {
        return new HashSet(this.f191177j);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m207126l4(qul0 qul0Var) {
        return Boolean.valueOf(this.f191177j.contains(qul0Var.getUserId()));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f191177j.clear();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m207127n4(Boolean bool) {
        m207135v4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m207128o4(LongLinkVirtualVoice.VoiceRoomCover voiceRoomCover) {
        ((VoiceVirtualRoomInfoTopBarView) this.viewModel).m77471w0(voiceRoomCover.getCoverUrl());
    }

    /* JADX INFO: renamed from: p4 */
    public void m207129p4() {
        jp50.C17834a c17834a = new jp50.C17834a(9000);
        c17834a.m142598B(ddv.f85638J);
        c17834a.m142609z(1.0d, 1.0d);
        c17834a.m142603t(80);
        m206028F2().OpenH5Event.open().mo172463j(c17834a.m142600q());
    }

    /* JADX INFO: renamed from: q4 */
    public void m207130q4() {
        m206028F2().VoiceCloseEvent.showFloatWindow().mo172463j(new z0n0(false, "click_back_button"));
    }

    /* JADX INFO: renamed from: r4 */
    public void m207131r4() {
        m206028F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().m172467p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final void m207132s4() {
        duringCreated(VirtualVoiceRoomApiProvider.getUserSettlesStatus(((nnn0) m206027E2()).m149818o(), ypv.f199493a.m199309D0())).subscribe(ffw.m121197h(new e30() { // from class: l.j5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116339a.m207119e4((BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189081X0()).subscribe(ffw.m121193d(new e30() { // from class: l.e5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89454a.m207122h4((LongLinkVirtualVoice.VoiceRoomTitleUpdate) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189073T0()).subscribe(ffw.m121193d(new e30() { // from class: l.p5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147318a.m207118d4((LongLinkVirtualVoice.VoiceSettleMessage) obj);
            }
        }));
        m207134u4();
        m207132s4();
        duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceRoomInfo(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.q5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152818a.m207124j4((BLiveExtraResponse) obj);
            }
        }));
        m129301d3(dvl0.class, new w9j() { // from class: l.r5p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157864a.m207125k4((dvl0) obj);
            }
        });
        m129301d3(qul0.class, new w9j() { // from class: l.s5p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f162577a.m207126l4((qul0) obj);
            }
        });
        C22306c<T> c22306cDuringCreated = duringCreated(((nnn0) m206027E2()).m132160q1().m189144t0());
        final VoiceVirtualRoomInfoTopBarView voiceVirtualRoomInfoTopBarView = (VoiceVirtualRoomInfoTopBarView) this.viewModel;
        Objects.requireNonNull(voiceVirtualRoomInfoTopBarView);
        c22306cDuringCreated.subscribe(ffw.m121197h(new e30() { // from class: l.t5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                voiceVirtualRoomInfoTopBarView.m77462I0((LongLinkVirtualVoice.VoiceRoomLevelUp) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189159z0()).subscribe(ffw.m121197h(new e30() { // from class: l.u5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174745a.m207137x4((LongLinkVirtualVoice.VoiceSettleInviteMessage) obj);
            }
        }));
        duringCreated(m206028F2().VirtualRoomInfoEvent.settleCurrentRoom().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.v5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180104a.m207115m4((soj0) obj);
            }
        }));
        if (((nnn0) m206027E2()).mo121370L2()) {
            ((nnn0) m206027E2()).m132056B0().filter(new w9j() { // from class: l.w5p0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return x5p0.m207102N3((Boolean) obj);
                }
            }).take(1).subscribe(ffw.m121197h(new e30() { // from class: l.f5p0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f95194a.m207127n4((Boolean) obj);
                }
            }));
        }
        duringCreated(((nnn0) m206027E2()).m132160q1().m189127n1()).subscribe(ffw.m121197h(new e30() { // from class: l.o5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141921a.m207128o4((LongLinkVirtualVoice.VoiceRoomCover) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m207133t4() {
        zvf0.m220399u("e_audio_member_invite_settle_pop", mo77274R2(), new j760("anchorId", ((nnn0) m206027E2()).m132140j0()), new j760("roomId", ((nnn0) m206027E2()).m149818o()), new j760("click_type", "reject"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m207134u4() {
        C22306c<T> c22306cDuringCreated = duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceRoomSummary(((nnn0) m206027E2()).m149818o()));
        final VoiceVirtualRoomInfoTopBarView voiceVirtualRoomInfoTopBarView = (VoiceVirtualRoomInfoTopBarView) this.viewModel;
        Objects.requireNonNull(voiceVirtualRoomInfoTopBarView);
        c22306cDuringCreated.subscribe(ffw.m121197h(new e30() { // from class: l.i5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                voiceVirtualRoomInfoTopBarView.m77457B0((BLiveVoiceVirtualRoomSummary) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m207135v4() {
        duringCreated(VirtualVoiceRoomApiProvider.requestToSettleRoom(((nnn0) m206027E2()).m149818o(), ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.k5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121217a.m207117c4((BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.l5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                x5p0.m207105R3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final void m207136w4(String str) {
        zvf0.m220399u("e_audio_member_invite_settle_pop", mo77274R2(), new j760("anchorId", ((nnn0) m206027E2()).m132140j0()), new j760("roomId", ((nnn0) m206027E2()).m149818o()), new j760("click_type", "accept"));
        duringCreated(VirtualVoiceRoomApiProvider.requestToSettleRoom(((nnn0) m206027E2()).m149818o(), ypv.f199493a.m199309D0(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.n5p0
            @Override // p149l.e30
            public final void call(Object obj) {
                x5p0.m207108U3((BLiveExtraResponse) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: x4 */
    public final void m207137x4(final LongLinkVirtualVoice.VoiceSettleInviteMessage voiceSettleInviteMessage) {
        new xh0.C21150a(this.f188513f).m208740s("邀请入驻").m208731j(voiceSettleInviteMessage.getFromUserName() + "邀请你入驻本群").m208727f("拒绝").m208724c(new View.OnClickListener() { // from class: l.g5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101179a.m207120f4(view);
            }
        }).m208739r("入驻").m208736o(new View.OnClickListener() { // from class: l.h5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105963a.m207121g4(voiceSettleInviteMessage, view);
            }
        }).m208728g(false).m208723b(true).m208729h(false).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: y4 */
    public void m207138y4() {
        VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView = this.f191176i;
        if (voiceVirtualSettleSuccessView != null) {
            voiceVirtualSettleSuccessView.m77545B0(this);
        }
    }

    /* JADX INFO: renamed from: z4 */
    public void m207139z4(String str) {
    }
}
