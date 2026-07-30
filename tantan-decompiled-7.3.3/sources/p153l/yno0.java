package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class yno0 extends csm0<rwn0> {

    /* JADX INFO: renamed from: q */
    public final HashSet<String> f200895q;

    /* JADX INFO: renamed from: r */
    public LiveMessage f200896r;

    /* JADX INFO: renamed from: s */
    public boolean f200897s;

    public yno0(dum dumVar, ChatListView chatListView) {
        super(dumVar, chatListView);
        this.f200895q = new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X5 */
    public /* synthetic */ void m216893X5(String str) {
        m215925j4("voiceCallApply", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.csm0, p153l.yh2
    /* JADX INFO: renamed from: J4 */
    public void mo112201J4(LiveMessage liveMessage) {
        super.mo112201J4(liveMessage);
        i35.m138275k((rwn0) m213810E2(), liveMessage, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.csm0, p153l.yh2
    /* JADX INFO: renamed from: K4 */
    public void mo103883K4(a5s a5sVar, View view, String str, LiveMessage liveMessage) {
        super.mo103883K4(a5sVar, view, str, liveMessage);
        str.getClass();
        switch (str) {
            case "userApplyVoiceCall":
                m216901K5(a5sVar, liveMessage);
                break;
            case "openAuctionApplyPanel":
                m213811F2().VoiceAuctionEvent.openAuctionQueueDlg().mo199273j(Boolean.TRUE);
                t3m0.m189094h(this);
                return;
            case "userProfile":
                LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
                if (liveUserInfo == null || TextUtils.isEmpty(liveUserInfo.userId)) {
                    return;
                }
                ydn0.m215258k(this, ((rwn0) m213810E2()).m168532l0().f56859id, liveMessage.liveUserInfo.userId);
                return;
            case "grabStarRedPacket":
                m2g0.m156836c(this, a5sVar.m96244b(), ((rwn0) m213810E2()).m202194o());
                return;
            case "voiceRoomApplaud":
                break;
            case "returnGift":
                m215929r4(liveMessage.extInfo.buttonSchema);
                return;
            case "roomLevelDetail":
                m213811F2().VirtualRoomInfoEvent.showVoiceRoomLevelDetail().m199277p();
                return;
            case "openAnchorGradeWeb":
                m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(9000).m174141B(efv.f93831J).m174152z(1.0d, 1.0d).m174146t(80).m174143q());
                return;
            case "ktvKingCongratulate":
                m213811F2().ChatEvent.sendNormalMessage().mo199273j(new gw40("恭喜成为歌曲擂主"));
                m215925j4("ktvKingCongratulate", null);
                return;
            default:
                return;
        }
        m213811F2().ChatEvent.sendNormalMessage().mo199273j(new gw40("恭喜群主！👏🏻"));
        m215925j4("voiceRoomApplaud", null);
        t3m0.m189088b(this);
    }

    /* JADX INFO: renamed from: K5 */
    public final void m216901K5(a5s a5sVar, LiveMessage liveMessage) {
        a5sVar.mo96250h(false);
        a5sVar.m96248f(false);
        ((ChatListView) this.viewModel).m73874M(liveMessage);
        i4g0.m138523u("e_audio_user_application", "p_user_audio_room", new pf60("scene", "welcome_message"));
        if (i9o0.m139138i(this)) {
            o1j0.m165651y("你已在麦上");
        } else {
            m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0().m107183d("apply"));
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final List<LiveMessage> m216902L5(List<BLiveChatMessage> list) {
        return jyb.m147486Q(list, new qcj() { // from class: l.nno0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f142815a.m216906P5((BLiveChatMessage) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.yh2
    /* JADX INFO: renamed from: M4 */
    public void mo215914M4() {
        if (((rwn0) m213810E2()).m183421W2() == null || this.f200897s) {
            return;
        }
        this.f200897s = true;
        duringCreated(VoiceRoomApiProvider.requestHistoryMessages(((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).m202194o(), ((rwn0) m213810E2()).m183421W2())).doOnNext(new y20() { // from class: l.hno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110812a.m216912V5((BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.pno0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153320a.m216913W5((BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.qno0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f158510a.m216902L5((List) obj);
            }
        }).doOnNext(new y20() { // from class: l.rno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164091a.m216910T5((List) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.sno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169748a.m216911U5((List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M5 */
    public final void m216903M5(long j, long j2) {
        String str = j + "-" + j2;
        if (this.f200895q.contains(str)) {
            return;
        }
        this.f200895q.add(str);
        duringCreated(VoiceRoomApiProvider.requestHistoryMessages(((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).m202194o(), j, j2)).subscribe(dhw.m115829h(new y20() { // from class: l.mno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137717a.m216904N5((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N5 */
    public final void m216904N5(BLiveEnvelope bLiveEnvelope) {
        Links links;
        if (jyb.m147479J(bLiveEnvelope.data.liveChatMessages)) {
            return;
        }
        Pagination pagination = bLiveEnvelope.pagination;
        if (pagination == null || (links = pagination.links) == null || TextUtils.isEmpty(links.next)) {
            jyb.m147537z(bLiveEnvelope.data.liveChatMessages, new y20() { // from class: l.ono0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f148110a.m216907Q5((BLiveChatMessage) obj);
                }
            });
            return;
        }
        ((rwn0) m213810E2()).m183412P3(bLiveEnvelope.pagination);
        this.f199895i.clear();
        this.f199895i.addAll(m216902L5(bLiveEnvelope.data.liveChatMessages));
        ((ChatListView) this.viewModel).m73872K(this.f199895i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O5 */
    public final Boolean m216905O5(LiveMessage liveMessage) {
        int i = liveMessage.category;
        int i2 = LiveMessage.VOICE_CHAT_CATEGORY;
        long j = liveMessage.seq;
        if (i != i2) {
            return Boolean.TRUE;
        }
        if (j == 0) {
            return Boolean.TRUE;
        }
        LiveMessage liveMessage2 = this.f200896r;
        if (liveMessage2 == null) {
            this.f200896r = liveMessage;
            liveMessage.preMessageTime = 0L;
            return Boolean.TRUE;
        }
        long j2 = liveMessage.preSeq;
        if (j2 == 0) {
            return Boolean.TRUE;
        }
        long j3 = liveMessage2.seq;
        if (j <= j3) {
            return Boolean.FALSE;
        }
        if (j3 != j2) {
            m216903M5(j3, j);
            ((rwn0) m213810E2()).m183398G3(liveMessage.seq);
            return Boolean.FALSE;
        }
        this.f200896r = liveMessage;
        ((rwn0) m213810E2()).m183398G3(liveMessage.seq);
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ LiveMessage m216906P5(BLiveChatMessage bLiveChatMessage) {
        return v710.m200166d().m200171g(f7t.m124505y(bLiveChatMessage, ((rwn0) m213810E2()).mo168489W0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m216907Q5(BLiveChatMessage bLiveChatMessage) {
        v710.m200166d().m200168c("msg_from_request_" + bLiveChatMessage.hashCode(), "live.chat.msg", f7t.m124505y(bLiveChatMessage, ((rwn0) m213810E2()).mo168489W0()), p1w.f150202j);
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m216908R5(BLiveUserMask bLiveUserMask) {
        ((ChatListView) this.viewModel).m73875N(bLiveUserMask);
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ void m216909S5(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        ((ChatListView) this.viewModel).m73875N(v6o0.m200134a(userMaskUpdate.getMask()));
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m216910T5(List list) {
        this.f200897s = false;
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m216911U5(List list) {
        this.f199895i.addAll(0, list);
        ((ChatListView) this.viewModel).m73872K(this.f199895i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m216912V5(BLiveEnvelope bLiveEnvelope) {
        ((rwn0) m213810E2()).m183412P3(bLiveEnvelope.pagination);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ List m216913W5(BLiveEnvelope bLiveEnvelope) {
        if (!jyb.m147479J(bLiveEnvelope.data.liveChatMessages) && ((rwn0) m213810E2()).m183421W2() == null) {
            bLiveEnvelope.data.liveChatMessages.get(0).preTimestamp = 0L;
        }
        return bLiveEnvelope.data.liveChatMessages;
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ void m216914Y5(b9m0 b9m0Var) {
        ((ChatListView) this.viewModel).m73869H();
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ void m216915Z5(NetworkInfo networkInfo) {
        LiveMessage liveMessage = this.f200896r;
        if (liveMessage != null) {
            m216903M5(liveMessage.seq, -1L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.yh2
    public void init() {
        super.init();
        ((rwn0) m213810E2()).m168494Y().m113044a(new qcj() { // from class: l.tno0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175300a.m216905O5((LiveMessage) obj);
            }
        });
        if (((ChatListView) this.viewModel).getAdapter() != null && (((ChatListView) this.viewModel).getAdapter() instanceof m5n0)) {
            ((m5n0) ((ChatListView) this.viewModel).getAdapter()).m157107h0(true);
        }
        if (!LiveWatchCounter.m77513h().m77521m()) {
            m213811F2().BootBubbleEvent.showBubbleByType().mo199273j("voiceChatButtonBubble");
        }
        duringCreated(((rwn0) m213810E2()).m183396E3()).subscribe(dhw.m115825d(new y20() { // from class: l.uno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179751a.m216908R5((BLiveUserMask) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98302l0()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.vno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184904a.m216909S5((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.yh2
    /* JADX INFO: renamed from: o4 */
    public zh2 mo215928o4() {
        if (this.f199899m == null) {
            this.f199899m = (zh2) vr4.m202472a(jyb.m147507f0(new o2f(), new lx40(y6s.m214493a(((rwn0) m213810E2()).mo183435j().liveMode)), new m90(m213815L2(), ((rwn0) m213810E2()).mo146094F0() == 2)));
        }
        return this.f199899m;
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: p4 */
    public String mo130933p4() {
        return j35.f118152b;
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: q4 */
    public String mo130934q4() {
        return "voiceLiveRoom";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.csm0, p153l.yh2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98337x0()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.wno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189970a.m215923h4((gvn0) obj);
            }
        }));
        duringCreated(m213811F2().VoiceChatEvent.dismissInviteSpanEvent().m199270g()).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.xno0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ino0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115990a.m216893X5((String) obj);
            }
        }));
        duringCreated(m213811F2().VoiceVirtualLiveEvent.motionSwitch().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.jno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121878a.m216914Y5((b9m0) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.kno0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.lno0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132831a.m216915Z5((NetworkInfo) obj);
            }
        }));
    }
}
