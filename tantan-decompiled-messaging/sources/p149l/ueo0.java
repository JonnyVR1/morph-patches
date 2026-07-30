package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ueo0 extends yim0<nnn0> {

    /* JADX INFO: renamed from: q */
    public final HashSet<String> f176055q;

    /* JADX INFO: renamed from: r */
    public LiveMessage f176056r;

    /* JADX INFO: renamed from: s */
    public boolean f176057s;

    public ueo0(bsm bsmVar, ChatListView chatListView) {
        super(bsmVar, chatListView);
        this.f176055q = new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X5 */
    public /* synthetic */ void m193283X5(String str) {
        m179314j4("voiceCallApply", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yim0, p149l.rh2
    /* JADX INFO: renamed from: J4 */
    public void mo179300J4(LiveMessage liveMessage) {
        super.mo179300J4(liveMessage);
        j25.m139415k((nnn0) m206027E2(), liveMessage, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yim0, p149l.rh2
    /* JADX INFO: renamed from: K4 */
    public void mo152703K4(z2s z2sVar, View view, String str, LiveMessage liveMessage) {
        super.mo152703K4(z2sVar, view, str, liveMessage);
        str.getClass();
        switch (str) {
            case "userApplyVoiceCall":
                m193291K5(z2sVar, liveMessage);
                break;
            case "openAuctionApplyPanel":
                m206028F2().VoiceAuctionEvent.openAuctionQueueDlg().mo172463j(Boolean.TRUE);
                pul0.m171450h(this);
                return;
            case "userProfile":
                LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
                if (liveUserInfo == null || TextUtils.isEmpty(liveUserInfo.userId)) {
                    return;
                }
                u4n0.m191752k(this, ((nnn0) m206027E2()).m132146l0().f56011id, liveMessage.liveUserInfo.userId);
                return;
            case "grabStarRedPacket":
                duf0.m113689c(this, z2sVar.m216987b(), ((nnn0) m206027E2()).m149818o());
                return;
            case "voiceRoomApplaud":
                break;
            case "returnGift":
                m179320r4(liveMessage.extInfo.buttonSchema);
                return;
            case "roomLevelDetail":
                m206028F2().VirtualRoomInfoEvent.showVoiceRoomLevelDetail().m172467p();
                return;
            case "openAnchorGradeWeb":
                m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(9000).m142598B(ddv.f85638J).m142609z(1.0d, 1.0d).m142603t(80).m142600q());
                return;
            case "ktvKingCongratulate":
                m206028F2().ChatEvent.sendNormalMessage().mo172463j(new sn40("恭喜成为歌曲擂主"));
                m179314j4("ktvKingCongratulate", null);
                return;
            default:
                return;
        }
        m206028F2().ChatEvent.sendNormalMessage().mo172463j(new sn40("恭喜群主！👏🏻"));
        m179314j4("voiceRoomApplaud", null);
        pul0.m171444b(this);
    }

    /* JADX INFO: renamed from: K5 */
    public final void m193291K5(z2s z2sVar, LiveMessage liveMessage) {
        z2sVar.mo207186h(false);
        z2sVar.m216990f(false);
        ((ChatListView) this.viewModel).m72691M(liveMessage);
        zvf0.m220399u("e_audio_user_application", "p_user_audio_room", new j760("scene", "welcome_message"));
        if (e0o0.m114323i(this)) {
            lsi0.m151595y("你已在麦上");
        } else {
            m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0().m210510d("apply"));
        }
    }

    /* JADX INFO: renamed from: L5 */
    public final List<LiveMessage> m193292L5(List<BLiveChatMessage> list) {
        return vwb.m200303Q(list, new w9j() { // from class: l.jeo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117592a.m193296P5((BLiveChatMessage) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.rh2
    /* JADX INFO: renamed from: M4 */
    public void mo179302M4() {
        if (((nnn0) m206027E2()).m160259W2() == null || this.f176057s) {
            return;
        }
        this.f176057s = true;
        duringCreated(VoiceRoomApiProvider.requestHistoryMessages(((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).m149818o(), ((nnn0) m206027E2()).m160259W2())).doOnNext(new e30() { // from class: l.deo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85824a.m193302V5((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.leo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127730a.m193303W5((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.meo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133468a.m193292L5((List) obj);
            }
        }).doOnNext(new e30() { // from class: l.neo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138635a.m193300T5((List) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.oeo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143354a.m193301U5((List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M5 */
    public final void m193293M5(long j, long j2) {
        String str = j + "-" + j2;
        if (this.f176055q.contains(str)) {
            return;
        }
        this.f176055q.add(str);
        duringCreated(VoiceRoomApiProvider.requestHistoryMessages(((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).m149818o(), j, j2)).subscribe(ffw.m121197h(new e30() { // from class: l.ieo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112817a.m193294N5((BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N5 */
    public final void m193294N5(BLiveEnvelope bLiveEnvelope) {
        Links links;
        if (vwb.m200296J(bLiveEnvelope.data.liveChatMessages)) {
            return;
        }
        Pagination pagination = bLiveEnvelope.pagination;
        if (pagination == null || (links = pagination.links) == null || TextUtils.isEmpty(links.next)) {
            vwb.m200354z(bLiveEnvelope.data.liveChatMessages, new e30() { // from class: l.keo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f122736a.m193297Q5((BLiveChatMessage) obj);
                }
            });
            return;
        }
        ((nnn0) m206027E2()).m160250P3(bLiveEnvelope.pagination);
        this.f159328i.clear();
        this.f159328i.addAll(m193292L5(bLiveEnvelope.data.liveChatMessages));
        ((ChatListView) this.viewModel).m72689K(this.f159328i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O5 */
    public final Boolean m193295O5(LiveMessage liveMessage) {
        int i = liveMessage.category;
        int i2 = LiveMessage.VOICE_CHAT_CATEGORY;
        long j = liveMessage.seq;
        if (i != i2) {
            return Boolean.TRUE;
        }
        if (j == 0) {
            return Boolean.TRUE;
        }
        LiveMessage liveMessage2 = this.f176056r;
        if (liveMessage2 == null) {
            this.f176056r = liveMessage;
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
            m193293M5(j3, j);
            ((nnn0) m206027E2()).m160236G3(liveMessage.seq);
            return Boolean.FALSE;
        }
        this.f176056r = liveMessage;
        ((nnn0) m206027E2()).m160236G3(liveMessage.seq);
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P5 */
    public final /* synthetic */ LiveMessage m193296P5(BLiveChatMessage bLiveChatMessage) {
        return lz00.m152304d().m152309g(e5t.m114921y(bLiveChatMessage, ((nnn0) m206027E2()).mo132103W0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m193297Q5(BLiveChatMessage bLiveChatMessage) {
        lz00.m152304d().m152306c("msg_from_request_" + bLiveChatMessage.hashCode(), "live.chat.msg", e5t.m114921y(bLiveChatMessage, ((nnn0) m206027E2()).mo132103W0()), rzv.f161691j);
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m193298R5(BLiveUserMask bLiveUserMask) {
        ((ChatListView) this.viewModel).m72692N(bLiveUserMask);
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ void m193299S5(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        ((ChatListView) this.viewModel).m72692N(rxn0.m181617a(userMaskUpdate.getMask()));
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m193300T5(List list) {
        this.f176057s = false;
    }

    /* JADX INFO: renamed from: U5 */
    public final /* synthetic */ void m193301U5(List list) {
        this.f159328i.addAll(0, list);
        ((ChatListView) this.viewModel).m72689K(this.f159328i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m193302V5(BLiveEnvelope bLiveEnvelope) {
        ((nnn0) m206027E2()).m160250P3(bLiveEnvelope.pagination);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ List m193303W5(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.m200296J(bLiveEnvelope.data.liveChatMessages) && ((nnn0) m206027E2()).m160259W2() == null) {
            bLiveEnvelope.data.liveChatMessages.get(0).preTimestamp = 0L;
        }
        return bLiveEnvelope.data.liveChatMessages;
    }

    /* JADX INFO: renamed from: Y5 */
    public final /* synthetic */ void m193304Y5(xzl0 xzl0Var) {
        ((ChatListView) this.viewModel).m72686H();
    }

    /* JADX INFO: renamed from: Z5 */
    public final /* synthetic */ void m193305Z5(NetworkInfo networkInfo) {
        LiveMessage liveMessage = this.f176056r;
        if (liveMessage != null) {
            m193293M5(liveMessage.seq, -1L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.rh2
    public void init() {
        super.init();
        ((nnn0) m206027E2()).m132108Y().m171439a(new w9j() { // from class: l.peo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148462a.m193295O5((LiveMessage) obj);
            }
        });
        if (((ChatListView) this.viewModel).getAdapter() != null && (((ChatListView) this.viewModel).getAdapter() instanceof iwm0)) {
            ((iwm0) ((ChatListView) this.viewModel).getAdapter()).m138756h0(true);
        }
        if (!LiveWatchCounter.m76330h().m76338m()) {
            m206028F2().BootBubbleEvent.showBubbleByType().mo172463j("voiceChatButtonBubble");
        }
        duringCreated(((nnn0) m206027E2()).m160234E3()).subscribe(ffw.m121193d(new e30() { // from class: l.qeo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154047a.m193298R5((BLiveUserMask) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189120l0()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.reo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159075a.m193299S5((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.rh2
    /* JADX INFO: renamed from: o4 */
    public sh2 mo179319o4() {
        if (this.f159332m == null) {
            this.f159332m = (sh2) wq4.m205013a(vwb.m200324f0(new j1f(), new xo40(x4s.m207011a(((nnn0) m206027E2()).mo149813j().liveMode)), new q90(m206032L2(), ((nnn0) m206027E2()).mo120451F0() == 2)));
        }
        return this.f159332m;
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: p4 */
    public String mo106339p4() {
        return k25.f120691b;
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: q4 */
    public String mo106340q4() {
        return "voiceLiveRoom";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yim0, p149l.rh2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189155x0()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.seo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164027a.m179312h4((cmn0) obj);
            }
        }));
        duringCreated(m206028F2().VoiceChatEvent.dismissInviteSpanEvent().m172460g()).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.teo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.eeo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90761a.m193283X5((String) obj);
            }
        }));
        duringCreated(m206028F2().VoiceVirtualLiveEvent.motionSwitch().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.feo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97146a.m193304Y5((xzl0) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.geo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.heo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107386a.m193305Z5((NetworkInfo) obj);
            }
        }));
    }
}
