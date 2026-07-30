package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p051p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p051p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether;
import com.p051p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard;
import com.p051p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p051p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage;
import com.p051p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;
import com.p051p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p051p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p051p1.mobile.longlink.msg.liveright.liveRight;
import com.p051p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceIntlCommonMsg;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p051p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p051p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p051p1.mobile.longlink.msg.voicegift.VoiceNewCampaign;
import com.p051p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import com.p051p1.mobile.putong.live.base.data.BLivePKBufferInfo;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth;
import com.p051p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPanelBgInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogether;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveSchemePopupMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.RewardPointMsg;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceSongGameMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class aj1 {

    /* JADX INFO: renamed from: a */
    public C22508b<LiveControlMessage> f71692a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public C22508b<List<BLiveHourLeaderBoardItem>> f71696b = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public C22508b<BLiveGivenGiftBrief> f71700c = C22508b.m222767b();

    /* JADX INFO: renamed from: d */
    public C22508b<BLiveGivenGiftBrief> f71704d = C22508b.m222767b();

    /* JADX INFO: renamed from: e */
    public C22508b<BLiveUserUpgrade> f71708e = C22508b.m222767b();

    /* JADX INFO: renamed from: f */
    public C22508b<BLiveEnterRoom> f71712f = C22508b.m222767b();

    /* JADX INFO: renamed from: g */
    public C22508b<LiveInfoMessage> f71716g = C22508b.m222767b();

    /* JADX INFO: renamed from: h */
    public C22508b<pf60<LongLinkChatMessage.PostMessageAck, String>> f71720h = C22508b.m222767b();

    /* JADX INFO: renamed from: i */
    public C22508b<LongLinkGiftMessage.LiveLeaderboardMessage> f71724i = C22508b.m222767b();

    /* JADX INFO: renamed from: j */
    public C22508b<LongLinkMedalMessage.TurboCardReceiveEvent> f71728j = C22508b.m222767b();

    /* JADX INFO: renamed from: k */
    public C22508b<LongLinkMedalMessage.TurboCardResultNotice> f71732k = C22508b.m222767b();

    /* JADX INFO: renamed from: l */
    public C22508b<LongLinkSocketMessage.TopEffect> f71736l = C22508b.m222767b();

    /* JADX INFO: renamed from: m */
    public C22508b<LongLinkSocketMessage.PopUp> f71740m = C22508b.m222767b();

    /* JADX INFO: renamed from: n */
    public C22508b<List<LongLinkGiftMessage.LiveCampaignInfo>> f71744n = C22508b.m222767b();

    /* JADX INFO: renamed from: o */
    public C22508b<LongLinkSocketMessage.PopUpContentUpdateNotice> f71748o = C22508b.m222767b();

    /* JADX INFO: renamed from: p */
    public C22508b<pf2> f71752p = C22508b.m222767b();

    /* JADX INFO: renamed from: q */
    public C22508b<LongLinkGiftMessage.LiveRankings> f71756q = C22508b.m222767b();

    /* JADX INFO: renamed from: r */
    public C22508b<LongLinkAdminMessage.UserWithBgColorSocketNotification> f71759r = C22508b.m222767b();

    /* JADX INFO: renamed from: s */
    public C22508b<LongLinkVirtualVoice.VoiceUserGuide> f71762s = C22508b.m222767b();

    /* JADX INFO: renamed from: t */
    public C22508b<LongLinkLiveMessage.AnchorDailyTaskMessage> f71765t = C22508b.m222767b();

    /* JADX INFO: renamed from: u */
    public C22508b<LongLinkLiveMessage.UserDailyTaskMessage> f71768u = C22508b.m222767b();

    /* JADX INFO: renamed from: v */
    public C22508b<LongLinkLiveDownBox.LiveAccessChannel> f71771v = C22508b.m222767b();

    /* JADX INFO: renamed from: w */
    public C22508b<BLiveHourLeaderBoardItem> f71774w = C22508b.m222767b();

    /* JADX INFO: renamed from: x */
    public C22508b<LongLinkGiftMessage.LiveRanking> f71777x = C22508b.m222767b();

    /* JADX INFO: renamed from: y */
    public C22508b<LongLinkGiftMessage.LiveRanking> f71780y = C22508b.m222767b();

    /* JADX INFO: renamed from: z */
    public C22508b<LongLinkGiftMessage.LiveRanking> f71783z = C22508b.m222767b();

    /* JADX INFO: renamed from: A */
    public C22508b<LongLinkLiveMessage.LiveStickerChangeMsg> f71614A = C22508b.m222767b();

    /* JADX INFO: renamed from: B */
    public C22508b<LivePkMessage> f71617B = C22508b.m222767b();

    /* JADX INFO: renamed from: C */
    public C22508b<LiveCallMessage> f71620C = C22508b.m222767b();

    /* JADX INFO: renamed from: D */
    public C22508b<gvn0> f71623D = C22508b.m222767b();

    /* JADX INFO: renamed from: E */
    public C22508b<LongLinkLiveFanbaseMessage.RedPacketEvent> f71626E = C22508b.m222767b();

    /* JADX INFO: renamed from: F */
    public C22508b<LongLinkSocketMessage.LiveAnimationPlayMsg> f71629F = C22508b.m222767b();

    /* JADX INFO: renamed from: G */
    public C22508b<LongLinkLiveMessage.RoomInfo> f71632G = C22508b.m222767b();

    /* JADX INFO: renamed from: H */
    public C22508b<RewardPointMsg> f71635H = C22508b.m222767b();

    /* JADX INFO: renamed from: I */
    public C22508b<LongLinkLiveMessage.VoiceRoomTopicUpdate> f71638I = C22508b.m222767b();

    /* JADX INFO: renamed from: J */
    public C22508b<fat> f71641J = C22508b.m222767b();

    /* JADX INFO: renamed from: K */
    public C22508b<LongLinkSocketMessage.OperationUpdateNotice> f71644K = C22508b.m222767b();

    /* JADX INFO: renamed from: L */
    public C22508b<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> f71647L = C22508b.m222767b();

    /* JADX INFO: renamed from: M */
    public C22508b<LongLinkLiveMessage.VoiceLiveGame> f71650M = C22508b.m222767b();

    /* JADX INFO: renamed from: N */
    public C22508b<LiveSchemePopupMessage> f71653N = C22508b.m222767b();

    /* JADX INFO: renamed from: O */
    public C22508b<VoiceSongGameMessage> f71656O = C22508b.m222767b();

    /* JADX INFO: renamed from: P */
    public C22508b<LongLinkLiveDanmakuMessage.BulletCommentInfo> f71659P = C22508b.m222767b();

    /* JADX INFO: renamed from: Q */
    public C22508b<LongLinkReportMsg.LiveReportMsg> f71662Q = C22508b.m222767b();

    /* JADX INFO: renamed from: R */
    public C22508b<liveRight.UserLiveRightResources> f71665R = C22508b.m222767b();

    /* JADX INFO: renamed from: S */
    public C22508b<x8p0> f71668S = C22508b.m222767b();

    /* JADX INFO: renamed from: T */
    public C22508b<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> f71671T = C22508b.m222767b();

    /* JADX INFO: renamed from: U */
    public C22508b<LongLinkLiveMessage.VoiceMemberUpdate> f71674U = C22508b.m222767b();

    /* JADX INFO: renamed from: V */
    public C22508b<BLiveGiftBubbleConfig> f71677V = C22508b.m222767b();

    /* JADX INFO: renamed from: W */
    public C22508b<LongLinkLiveMessage.AnnouncementAudit> f71680W = C22508b.m222767b();

    /* JADX INFO: renamed from: X */
    public C22508b<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> f71683X = C22508b.m222767b();

    /* JADX INFO: renamed from: Y */
    public C22508b<VoiceUndercoverBean.VoiceUndercover> f71686Y = C22508b.m222767b();

    /* JADX INFO: renamed from: Z */
    public C22508b<LongLinkLiveMessage.VoiceChatGroupInviteCreate> f71689Z = C22508b.m222767b();

    /* JADX INFO: renamed from: a0 */
    public C22508b<LongLinkLiveMessage.VoiceChatGroupApply> f71693a0 = C22508b.m222767b();

    /* JADX INFO: renamed from: b0 */
    public C22508b<VoiceLiveManager.VoiceManagerInvite> f71697b0 = C22508b.m222767b();

    /* JADX INFO: renamed from: c0 */
    public C22508b<VoiceLiveManager.VoiceManagerUpdate> f71701c0 = C22508b.m222767b();

    /* JADX INFO: renamed from: d0 */
    public C22508b<VoiceLiveManager.VoiceFreeCallUpdate> f71705d0 = C22508b.m222767b();

    /* JADX INFO: renamed from: e0 */
    public C22508b<v7t> f71709e0 = C22508b.m222767b();

    /* JADX INFO: renamed from: f0 */
    public C22508b<LongLinkMultiCallMessage.MultiCallTurnOnGuide> f71713f0 = C22508b.m222767b();

    /* JADX INFO: renamed from: g0 */
    public C22508b<LongLinkMultiCallMessage.MultiCallActionMessage> f71717g0 = C22508b.m222767b();

    /* JADX INFO: renamed from: h0 */
    public C22508b<c8t> f71721h0 = C22508b.m222767b();

    /* JADX INFO: renamed from: i0 */
    public C22508b<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage> f71725i0 = C22508b.m222767b();

    /* JADX INFO: renamed from: j0 */
    public C22508b<LongLinkVoicePublicLive.VoicePublicLive> f71729j0 = C22508b.m222767b();

    /* JADX INFO: renamed from: k0 */
    public C22508b<VoiceUpdateUserMaskProto.UserMaskUpdate> f71733k0 = C22508b.m222767b();

    /* JADX INFO: renamed from: l0 */
    public C22508b<LongLinkLiveMessage.VoiceLiveTopEffectMessage> f71737l0 = C22508b.m222767b();

    /* JADX INFO: renamed from: m0 */
    public C22508b<LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage> f71741m0 = C22508b.m222767b();

    /* JADX INFO: renamed from: n0 */
    public C22508b<LongLinkLiveMessage.VoiceLiveHighQualityTagMessage> f71745n0 = C22508b.m222767b();

    /* JADX INFO: renamed from: o0 */
    public C22508b<LongLinkConfession.ConfessionGiftReceiveMsg> f71749o0 = C22508b.m222767b();

    /* JADX INFO: renamed from: p0 */
    public C22508b<LongLinkLiveConfession.JumpSendMessage> f71753p0 = C22508b.m222767b();

    /* JADX INFO: renamed from: q0 */
    public C22508b<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> f71757q0 = C22508b.m222767b();

    /* JADX INFO: renamed from: r0 */
    public C22508b<LongLinkVideoFindPeople.LiveAnchorAvatarComment> f71760r0 = C22508b.m222767b();

    /* JADX INFO: renamed from: s0 */
    public C22508b<BLiveVoiceSingTogether> f71763s0 = C22508b.m222767b();

    /* JADX INFO: renamed from: t0 */
    public C22508b<voiceSingTogether.VoiceSingConfirm> f71766t0 = C22508b.m222767b();

    /* JADX INFO: renamed from: u0 */
    public C22508b<voiceSingTogether.VoiceSingStart> f71769u0 = C22508b.m222767b();

    /* JADX INFO: renamed from: v0 */
    public C22508b<VoiceLiveInfoMessage> f71772v0 = C22508b.m222767b();

    /* JADX INFO: renamed from: w0 */
    public C22508b<LongLinkVirtualVoice.VoiceAdminPanelCounterMessage> f71775w0 = C22508b.m222767b();

    /* JADX INFO: renamed from: x0 */
    public C22508b<LongLinkVirtualVoice.VoiceRoomDissolve> f71778x0 = C22508b.m222767b();

    /* JADX INFO: renamed from: y0 */
    public C22508b<LongLinkVirtualVoice.VoiceSettleMessage> f71781y0 = C22508b.m222767b();

    /* JADX INFO: renamed from: z0 */
    public C22508b<liveRight.TopChatUpdateNotice> f71784z0 = C22508b.m222767b();

    /* JADX INFO: renamed from: A0 */
    public C22508b<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> f71615A0 = C22508b.m222767b();

    /* JADX INFO: renamed from: B0 */
    public C22508b<VoiceLiveHeartBeatInfoMessage> f71618B0 = C22508b.m222767b();

    /* JADX INFO: renamed from: C0 */
    public C22508b<LongLinkGiftMessage.LiveRankings> f71621C0 = C22508b.m222767b();

    /* JADX INFO: renamed from: D0 */
    public C22508b<BLiveVoiceLeaderBoardItem> f71624D0 = C22508b.m222767b();

    /* JADX INFO: renamed from: E0 */
    public C22508b<iun0> f71627E0 = C22508b.m222767b();

    /* JADX INFO: renamed from: F0 */
    public C22508b<VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage> f71630F0 = C22508b.m222767b();

    /* JADX INFO: renamed from: G0 */
    public C22508b<BLiveVoiceGrabHatGame> f71633G0 = C22508b.m222767b();

    /* JADX INFO: renamed from: H0 */
    public C22508b<BLiveVoiceGrabHatCP> f71636H0 = C22508b.m222767b();

    /* JADX INFO: renamed from: I0 */
    public C22508b<b3v> f71639I0 = C22508b.m222767b();

    /* JADX INFO: renamed from: J0 */
    public C22508b<d3v> f71642J0 = C22508b.m222767b();

    /* JADX INFO: renamed from: K0 */
    public C22508b<String> f71645K0 = C22508b.m222767b();

    /* JADX INFO: renamed from: L0 */
    public C22508b<VoiceSweet.VoiceCpBindMessage> f71648L0 = C22508b.m222767b();

    /* JADX INFO: renamed from: M0 */
    public C22508b<VoiceSweet.VoiceCpHouseUpgradeMessage> f71651M0 = C22508b.m222767b();

    /* JADX INFO: renamed from: N0 */
    public C22508b<VoiceSweet.VoiceSweetCpAnimation> f71654N0 = C22508b.m222767b();

    /* JADX INFO: renamed from: O0 */
    public C22508b<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> f71657O0 = C22508b.m222767b();

    /* JADX INFO: renamed from: P0 */
    public C22508b<VoiceNewCampaign.VoiceLiveContentUpdateNotice> f71660P0 = C22508b.m222767b();

    /* JADX INFO: renamed from: Q0 */
    public C22508b<VoiceNewCampaignPopUp.VoiceLivePopUp> f71663Q0 = C22508b.m222767b();

    /* JADX INFO: renamed from: R0 */
    public C22508b<VoiceRollDice.VoiceGiftWallLightNoticeMessage> f71666R0 = C22508b.m222767b();

    /* JADX INFO: renamed from: S0 */
    public C22508b<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> f71669S0 = C22508b.m222767b();

    /* JADX INFO: renamed from: T0 */
    public C22508b<VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh> f71672T0 = C22508b.m222767b();

    /* JADX INFO: renamed from: U0 */
    public C22508b<LongLinkBottomMenu.LiveBottomMenuUpdate> f71675U0 = C22508b.m222767b();

    /* JADX INFO: renamed from: V0 */
    public C22508b<LongLinkLiveMessage.JailInRoom> f71678V0 = C22508b.m222767b();

    /* JADX INFO: renamed from: W0 */
    public C22508b<BLiveVoiceKtvGameInfo> f71681W0 = C22508b.m222767b();

    /* JADX INFO: renamed from: X0 */
    public C22508b<LongLinkVoiceKtv.VoiceKTVOrderRefresh> f71684X0 = C22508b.m222767b();

    /* JADX INFO: renamed from: Y0 */
    public C22508b<LongLinkVirtualVoice.VoiceRoomHeatUpdate> f71687Y0 = C22508b.m222767b();

    /* JADX INFO: renamed from: Z0 */
    public C22508b<LongLinkVirtualVoice.VoiceRoomLevelUp> f71690Z0 = C22508b.m222767b();

    /* JADX INFO: renamed from: a1 */
    public C22508b<LongLinkVirtualVoice.StarRedpacketInfo> f71694a1 = C22508b.m222767b();

    /* JADX INFO: renamed from: b1 */
    public C22508b<VoiceFunnyAvatar.VoiceLivePhotoSticker> f71698b1 = C22508b.m222767b();

    /* JADX INFO: renamed from: c1 */
    public C22508b<LongLinkLiveMultiPk.MultiPkInviteNotify> f71702c1 = C22508b.m222767b();

    /* JADX INFO: renamed from: d1 */
    public C22508b<LongLinkLiveMultiPk.MultiPkInviteRejected> f71706d1 = C22508b.m222767b();

    /* JADX INFO: renamed from: e1 */
    public C22508b<LongLinkLiveMultiPk.MultiPkInviteAccepted> f71710e1 = C22508b.m222767b();

    /* JADX INFO: renamed from: f1 */
    public C22508b<LongLinkLiveMultiPk.MultiPkAnimation> f71714f1 = C22508b.m222767b();

    /* JADX INFO: renamed from: g1 */
    public C22508b<LongLinkLiveMultiPk.MultiPkPoints> f71718g1 = C22508b.m222767b();

    /* JADX INFO: renamed from: h1 */
    public C22508b<LongLinkLiveMultiPk.MultiPkStageChange> f71722h1 = C22508b.m222767b();

    /* JADX INFO: renamed from: i1 */
    public C22508b<LongLinkVirtualVoice.VoiceLiveTemplateMessage> f71726i1 = C22508b.m222767b();

    /* JADX INFO: renamed from: j1 */
    public C22508b<LongLinkVirtualVoice.VoiceRoomTitleUpdate> f71730j1 = C22508b.m222767b();

    /* JADX INFO: renamed from: k1 */
    public C22508b<LongLinkVirtualVoice.VoiceChatTopicMessage> f71734k1 = C22508b.m222767b();

    /* JADX INFO: renamed from: l1 */
    public C22508b<LongLinkVirtualVoice.VoiceRoomPersonalUpdate> f71738l1 = C22508b.m222767b();

    /* JADX INFO: renamed from: m1 */
    public C22508b<VoiceNineMicUserScore.VoiceLiveBossUserScore> f71742m1 = C22508b.m222767b();

    /* JADX INFO: renamed from: n1 */
    public C22508b<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> f71746n1 = C22508b.m222767b();

    /* JADX INFO: renamed from: o1 */
    public C22508b<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> f71750o1 = C22508b.m222767b();

    /* JADX INFO: renamed from: p1 */
    public C22508b<LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation> f71754p1 = C22508b.m222767b();

    /* JADX INFO: renamed from: q1 */
    public C22508b<LongLinkLiveMessage.VoiceSettleGuideMessage> f71758q1 = C22508b.m222767b();

    /* JADX INFO: renamed from: r1 */
    public C22508b<LongLinkVirtualVoice.VoiceStreamBizTypeMessage> f71761r1 = C22508b.m222767b();

    /* JADX INFO: renamed from: s1 */
    public C22508b<BLiveIntlGiftLeaderboard> f71764s1 = C22508b.m222767b();

    /* JADX INFO: renamed from: t1 */
    public C22508b<LongLinkVirtualVoice.VoiceSettleInviteMessage> f71767t1 = C22508b.m222767b();

    /* JADX INFO: renamed from: u1 */
    public C22508b<z3j0> f71770u1 = C22508b.m222767b();

    /* JADX INFO: renamed from: v1 */
    public C22508b<LongLinkLiveUserLevel.RoomTopEffect> f71773v1 = C22508b.m222767b();

    /* JADX INFO: renamed from: w1 */
    public C22508b<LongLinkVirtualVoice.VoiceToneMessage> f71776w1 = C22508b.m222767b();

    /* JADX INFO: renamed from: x1 */
    public C22508b<LongLinkSocketMessage.DragonScourgeRecords> f71779x1 = C22508b.m222767b();

    /* JADX INFO: renamed from: y1 */
    public C22508b<LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage> f71782y1 = C22508b.m222767b();

    /* JADX INFO: renamed from: z1 */
    public C22508b<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> f71785z1 = C22508b.m222767b();

    /* JADX INFO: renamed from: A1 */
    public C22508b<LongLinkIntlLightPushMessage.IntlLightPushInfo> f71616A1 = C22508b.m222767b();

    /* JADX INFO: renamed from: B1 */
    public C22508b<LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg> f71619B1 = C22508b.m222767b();

    /* JADX INFO: renamed from: C1 */
    public C22508b<OfficialShowMessage.OfficialShowUpdateStatus> f71622C1 = C22508b.m222767b();

    /* JADX INFO: renamed from: D1 */
    public C22508b<OfficialShowMessage.OfficialShowJump> f71625D1 = C22508b.m222767b();

    /* JADX INFO: renamed from: E1 */
    public C22508b<LongLinkBottomMenu.LivePictureTextAlert> f71628E1 = C22508b.m222767b();

    /* JADX INFO: renamed from: F1 */
    public C22508b<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> f71631F1 = C22508b.m222767b();

    /* JADX INFO: renamed from: G1 */
    public C22508b<BLiveLuckyParadiseBottomEntrance> f71634G1 = C22508b.m222767b();

    /* JADX INFO: renamed from: H1 */
    public C22508b<BLiveLuckyParadiseBottomEntrance> f71637H1 = C22508b.m222767b();

    /* JADX INFO: renamed from: I1 */
    public C22508b<rdh0> f71640I1 = C22508b.m222767b();

    /* JADX INFO: renamed from: J1 */
    public C22508b<LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate> f71643J1 = C22508b.m222767b();

    /* JADX INFO: renamed from: K1 */
    public C22508b<LongLinkConfession.GiftWallGradeFiveNotice> f71646K1 = C22508b.m222767b();

    /* JADX INFO: renamed from: L1 */
    public C22508b<VoiceSweet.VoiceSweetCpEffect> f71649L1 = C22508b.m222767b();

    /* JADX INFO: renamed from: M1 */
    public C22508b<BLiveVoiceKtvPanelBgInfo> f71652M1 = C22508b.m222767b();

    /* JADX INFO: renamed from: N1 */
    public C22508b<LongLinkVirtualVoice.VoicePayGuidePopUp> f71655N1 = C22508b.m222767b();

    /* JADX INFO: renamed from: O1 */
    public C22508b<LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp> f71658O1 = C22508b.m222767b();

    /* JADX INFO: renamed from: P1 */
    public C22508b<rdh0> f71661P1 = C22508b.m222767b();

    /* JADX INFO: renamed from: Q1 */
    public C22508b<LongLinkVirtualVoice.VoicePayGuideV2PopUp> f71664Q1 = C22508b.m222767b();

    /* JADX INFO: renamed from: R1 */
    public C22508b<LongLinkVirtualVoice.VoicePayGuideUser> f71667R1 = C22508b.m222767b();

    /* JADX INFO: renamed from: S1 */
    public C22508b<BLiveVideoChat> f71670S1 = C22508b.m222767b();

    /* JADX INFO: renamed from: T1 */
    public C22508b<LongLinkVideoChat.LiveVideoChatToast> f71673T1 = C22508b.m222767b();

    /* JADX INFO: renamed from: U1 */
    public C22508b<LongLinkVideoChat.LiveVideoChatLiveChange> f71676U1 = C22508b.m222767b();

    /* JADX INFO: renamed from: V1 */
    public C22508b<liveAuthMessageNew.MultiDevice> f71679V1 = C22508b.m222767b();

    /* JADX INFO: renamed from: W1 */
    public C22508b<LongLinkVideoChat.LiveVideoChatAnchorCallResult> f71682W1 = C22508b.m222767b();

    /* JADX INFO: renamed from: X1 */
    public C22508b<LongLinkVideoChat.LiveVideoChatCdnFail> f71685X1 = C22508b.m222767b();

    /* JADX INFO: renamed from: Y1 */
    public C22508b<LongLinkVideoChat.LiveVideoChatBubble> f71688Y1 = C22508b.m222767b();

    /* JADX INFO: renamed from: Z1 */
    public C22508b<LongLinkGiftMessage.VideoChatDuration> f71691Z1 = C22508b.m222767b();

    /* JADX INFO: renamed from: a2 */
    public C22508b<LongLinkVirtualVoice.VoiceRoomCover> f71695a2 = C22508b.m222767b();

    /* JADX INFO: renamed from: b2 */
    public C22508b<LongLinkLiveBottomPopup.VideoLiveToast> f71699b2 = C22508b.m222767b();

    /* JADX INFO: renamed from: c2 */
    public C22508b<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> f71703c2 = C22508b.m222767b();

    /* JADX INFO: renamed from: d2 */
    public C22508b<BLivePKBufferInfo> f71707d2 = C22508b.m222767b();

    /* JADX INFO: renamed from: e2 */
    public C22508b<BLivePKCardShowListWithBoth> f71711e2 = C22508b.m222767b();

    /* JADX INFO: renamed from: f2 */
    public C22508b<LongLinkVoiceKtv.VoiceKTVOrderRating> f71715f2 = C22508b.m222767b();

    /* JADX INFO: renamed from: g2 */
    public C22508b<LongLinkVoiceKtv.VoiceKTVBubble> f71719g2 = C22508b.m222767b();

    /* JADX INFO: renamed from: h2 */
    public C22508b<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> f71723h2 = C22508b.m222767b();

    /* JADX INFO: renamed from: i2 */
    public C22508b<LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg> f71727i2 = C22508b.m222767b();

    /* JADX INFO: renamed from: j2 */
    public C22508b<LongLinkVirtualVoice.VoiceGameMessage> f71731j2 = C22508b.m222767b();

    /* JADX INFO: renamed from: k2 */
    public C22508b<LongLinkVirtualVoice.VoiceLiveGameTypeMessage> f71735k2 = C22508b.m222767b();

    /* JADX INFO: renamed from: l2 */
    public C22508b<LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray> f71739l2 = C22508b.m222767b();

    /* JADX INFO: renamed from: m2 */
    public C22508b<VoiceLivePk.VoiceLivePkModify> f71743m2 = C22508b.m222767b();

    /* JADX INFO: renamed from: n2 */
    public C22508b<VoiceLivePk.VoiceLivePkPoint> f71747n2 = C22508b.m222767b();

    /* JADX INFO: renamed from: o2 */
    public C22508b<LongLinkSocketMessage.MysteryBoxRecord> f71751o2 = C22508b.m222767b();

    /* JADX INFO: renamed from: p2 */
    public C22508b<LongLinkLiveMessage.GiftWallRefresh> f71755p2 = C22508b.m222767b();

    /* JADX INFO: renamed from: A */
    public C22421c<BLiveGivenGiftBrief> m98216A() {
        return this.f71704d.asObservable().onBackpressureBuffer(100L).filter(new qf1()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: A0 */
    public C22421c<LongLinkVoiceKtv.VoiceKTVBubble> m98217A0() {
        return this.f71719g2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.wg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVoiceKtv.VoiceKTVBubble) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: B */
    public C22421c<BLiveGivenGiftBrief> m98218B() {
        return this.f71700c.asObservable().onBackpressureBuffer(100L).filter(new qf1()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: B0 */
    public C22421c<BLiveVoiceKtvGameInfo> m98219B0() {
        return this.f71681W0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.hf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveVoiceKtvGameInfo) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: C */
    public C22421c<LiveInfoMessage> m98220C() {
        return this.f71716g.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.bh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LiveInfoMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: C0 */
    public C22421c<LongLinkVoiceKtv.VoiceKTVOrderRefresh> m98221C0() {
        return this.f71684X0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.qh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVoiceKtv.VoiceKTVOrderRefresh) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: D */
    public C22421c<LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray> m98222D() {
        return this.f71739l2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.gg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: D0 */
    public C22421c<LongLinkVoiceKtv.VoiceKTVOrderRating> m98223D0() {
        return this.f71715f2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.hg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVoiceKtv.VoiceKTVOrderRating) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: E */
    public C22421c<fat> m98224E() {
        return this.f71641J.asObservable().onBackpressureBuffer(100L).filter(new qcj() { // from class: l.og1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((fat) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: E0 */
    public C22421c<LongLinkVirtualVoice.VoiceAdminPanelCounterMessage> m98225E0() {
        return this.f71775w0.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.hi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceAdminPanelCounterMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: F */
    public C22421c<LongLinkSocketMessage.OperationUpdateNotice> m98226F() {
        return this.f71644K.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ch1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkSocketMessage.OperationUpdateNotice) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: F0 */
    public C22421c<BLiveVoiceLeaderBoardItem> m98227F0() {
        return this.f71624D0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.sg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveVoiceLeaderBoardItem) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: G */
    public C22421c<rdh0> m98228G() {
        return this.f71661P1.asObservable().onBackpressureLatest().filter(new ah1()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: G0 */
    public C22421c<LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation> m98229G0() {
        return this.f71754p1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.vh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: H */
    public C22421c<LongLinkMedalMessage.TurboCardResultNotice> m98230H() {
        return this.f71732k.asObservable().onBackpressureBuffer(100L).filter(new qcj() { // from class: l.zh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkMedalMessage.TurboCardResultNotice) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: H0 */
    public C22421c<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> m98231H0() {
        return this.f71631F1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.lh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: I */
    public C22421c<LongLinkMedalMessage.TurboCardReceiveEvent> m98232I() {
        return this.f71728j.asObservable().onBackpressureBuffer(100L).filter(new qcj() { // from class: l.ui1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkMedalMessage.TurboCardReceiveEvent) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: I0 */
    public C22421c<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> m98233I0() {
        return this.f71750o1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ki1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: J */
    public C22421c<LongLinkVirtualVoice.VoiceLiveGameTypeMessage> m98234J() {
        return this.f71735k2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.lg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceLiveGameTypeMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: J0 */
    public C22421c<x8p0> m98235J0() {
        return this.f71668S.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ih1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((x8p0) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: K */
    public C22421c<LongLinkVirtualVoice.VoiceGameMessage> m98236K() {
        return this.f71731j2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.jh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceGameMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: K0 */
    public C22421c<VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh> m98237K0() {
        return this.f71672T0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ni1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: L */
    public C22421c<BLiveUserUpgrade> m98238L() {
        return this.f71708e.asObservable().onBackpressureBuffer(100L).filter(new qcj() { // from class: l.zf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveUserUpgrade) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: L0 */
    public C22421c<iun0> m98239L0() {
        return this.f71627E0.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.pf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((iun0) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: M */
    public C22421c<LongLinkVirtualVoice.VoiceToneMessage> m98240M() {
        return this.f71776w1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.af1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceToneMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: M0 */
    public C22421c<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> m98241M0() {
        return this.f71657O0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.dg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: N */
    public C22421c<LongLinkMultiCallMessage.MultiCallActionMessage> m98242N() {
        return this.f71717g0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.mh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkMultiCallMessage.MultiCallActionMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: N0 */
    public C22421c<VoiceRollDice.VoiceGiftWallLightNoticeMessage> m98243N0() {
        return this.f71666R0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.xh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceRollDice.VoiceGiftWallLightNoticeMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: O */
    public C22421c<LongLinkMultiCallMessage.MultiCallTurnOnGuide> m98244O() {
        return this.f71713f0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.vi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkMultiCallMessage.MultiCallTurnOnGuide) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: O0 */
    public C22421c<VoiceLiveHeartBeatInfoMessage> m98245O0() {
        return this.f71618B0.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.jf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceLiveHeartBeatInfoMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: P */
    public C22421c<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage> m98246P() {
        return this.f71725i0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.nh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: P0 */
    public C22421c<VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage> m98247P0() {
        return this.f71630F0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ue1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Q */
    public C22421c<c8t> m98248Q() {
        return this.f71721h0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.pg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((c8t) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Q0 */
    public C22421c<VoiceLiveInfoMessage> m98249Q0() {
        return this.f71772v0.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.li1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceLiveInfoMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: R */
    public C22421c<v7t> m98250R() {
        return this.f71709e0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.gh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((v7t) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: R0 */
    public C22421c<VoiceLiveManager.VoiceManagerUpdate> m98251R0() {
        return this.f71701c0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.cf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceLiveManager.VoiceManagerUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: S */
    public C22421c<OfficialShowMessage.OfficialShowJump> m98252S() {
        return this.f71625D1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.th1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((OfficialShowMessage.OfficialShowJump) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: S0 */
    public C22421c<LongLinkGiftMessage.LiveRankings> m98253S0() {
        return this.f71621C0.asObservable().onBackpressureLatest().filter(new bg1()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: T */
    public C22421c<OfficialShowMessage.OfficialShowUpdateStatus> m98254T() {
        return this.f71622C1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.zi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((OfficialShowMessage.OfficialShowUpdateStatus) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: T0 */
    public C22421c<LongLinkVirtualVoice.VoiceSettleMessage> m98255T0() {
        return this.f71781y0.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.wf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceSettleMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: U */
    public C22421c<LivePkMessage> m98256U() {
        return this.f71617B.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.hh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LivePkMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: U0 */
    public C22421c<rdh0> m98257U0() {
        return this.f71640I1.asObservable().onBackpressureLatest().filter(new ah1()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: V */
    public C22421c<LongLinkLiveFanbaseMessage.RedPacketEvent> m98258V() {
        return this.f71626E.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.lf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveFanbaseMessage.RedPacketEvent) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: V0 */
    public C22421c<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> m98259V0() {
        return this.f71785z1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ji1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: W */
    public C22421c<LongLinkLiveMessage.GiftWallRefresh> m98260W() {
        return this.f71755p2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.yi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveMessage.GiftWallRefresh) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: W0 */
    public C22421c<LongLinkVirtualVoice.VoiceLiveTemplateMessage> m98261W0() {
        return this.f71726i1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.rg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: X */
    public C22421c<LongLinkReportMsg.LiveReportMsg> m98262X() {
        return this.f71662Q.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.wh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkReportMsg.LiveReportMsg) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: X0 */
    public C22421c<LongLinkVirtualVoice.VoiceRoomTitleUpdate> m98263X0() {
        return this.f71730j1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.kf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceRoomTitleUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Y */
    public C22421c<RewardPointMsg> m98264Y() {
        return this.f71635H.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ze1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((RewardPointMsg) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Y0 */
    public C22421c<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> m98265Y0() {
        return this.f71683X.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ei1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveMessage.VoiceRoomAnnouncementUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Z */
    public C22421c<LongLinkGiftMessage.LiveRankings> m98266Z() {
        return this.f71756q.asObservable().onBackpressureLatest().filter(new bg1()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Z0 */
    public C22421c<LongLinkVirtualVoice.VoiceChatTopicMessage> m98267Z0() {
        return this.f71734k1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ai1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceChatTopicMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: a */
    public C22421c<BLiveLuckyParadiseBottomEntrance> m98268a() {
        return this.f71637H1.asObservable().onBackpressureLatest().filter(new ef1()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: a0 */
    public C22421c<LiveSchemePopupMessage> m98269a0() {
        return this.f71653N.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ti1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LiveSchemePopupMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: a1 */
    public C22421c<VoiceLiveManager.VoiceFreeCallUpdate> m98270a1() {
        return this.f71705d0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ph1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceLiveManager.VoiceFreeCallUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: b */
    public C22421c<BLiveLuckyParadiseBottomEntrance> m98271b() {
        return this.f71634G1.asObservable().onBackpressureLatest().filter(new ef1()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: b0 */
    public void m98272b0(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f71774w.m137019l(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: b1 */
    public C22421c<LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate> m98273b1() {
        return this.f71643J1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ug1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: c */
    public C22421c<LongLinkSocketMessage.PopUp> m98274c() {
        return this.f71740m.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.sf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkSocketMessage.PopUp) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: c0 */
    public void m98275c0(pf2 pf2Var) {
        this.f71752p.m137019l(pf2Var);
    }

    /* JADX INFO: renamed from: c1 */
    public C22421c<LongLinkLiveMessage.VoiceMemberUpdate> m98276c1() {
        return this.f71674U.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.oh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveMessage.VoiceMemberUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: d */
    public C22421c<BLiveHourLeaderBoardItem> m98277d() {
        return this.f71774w.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.zg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveHourLeaderBoardItem) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: d0 */
    public C22421c<BLiveGiftBubbleConfig> m98278d0() {
        return this.f71677V.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.rh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveGiftBubbleConfig) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: d1 */
    public C22421c<VoiceNineMicUserScore.VoiceLiveBossUserScore> m98279d1() {
        return this.f71742m1.asObservable().onBackpressureLatest().filter(new dxm0()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: e */
    public C22421c<pf2> m98280e() {
        return this.f71752p.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.yg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((pf2) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: e0 */
    public void m98281e0(List<BLiveHourLeaderBoardItem> list) {
        this.f71696b.m137019l(list);
    }

    /* JADX INFO: renamed from: e1 */
    public C22421c<VoiceNewCampaignPopUp.VoiceLivePopUp> m98282e1() {
        return this.f71663Q0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.dh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceNewCampaignPopUp.VoiceLivePopUp) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: f */
    public C22421c<LiveCallMessage> m98283f() {
        return this.f71620C.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.qg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LiveCallMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: f0 */
    public void m98284f0(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f71700c.m137019l(bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: f1 */
    public C22421c<VoiceNewCampaign.VoiceLiveContentUpdateNotice> m98285f1() {
        return this.f71660P0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.tf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceNewCampaign.VoiceLiveContentUpdateNotice) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: g */
    public C22421c<LongLinkSocketMessage.PopUpContentUpdateNotice> m98286g() {
        return this.f71748o.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.uh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkSocketMessage.PopUpContentUpdateNotice) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: g0 */
    public void m98287g0(fat fatVar) {
        this.f71641J.m137019l(fatVar);
    }

    /* JADX INFO: renamed from: g1 */
    public C22421c<LongLinkVirtualVoice.VoicePayGuideV2PopUp> m98288g1() {
        return this.f71664Q1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.xi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoicePayGuideV2PopUp) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: h */
    public C22421c<LongLinkLiveDanmakuMessage.BulletCommentInfo> m98289h() {
        return this.f71659P.asObservable().onBackpressureBuffer(1000L).filter(new t3c()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: h0 */
    public void m98290h0(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        this.f71728j.m137019l(turboCardReceiveEvent);
    }

    /* JADX INFO: renamed from: h1 */
    public C22421c<LongLinkVirtualVoice.VoicePayGuidePopUp> m98291h1() {
        return this.f71655N1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.df1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoicePayGuidePopUp) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: i */
    public C22421c<LongLinkLiveDownBox.LiveAccessChannel> m98292i() {
        return this.f71771v.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.mi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveDownBox.LiveAccessChannel) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: i0 */
    public void m98293i0(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate) {
        this.f71750o1.m137019l(voiceLiveAuctionUpdate);
    }

    /* JADX INFO: renamed from: i1 */
    public C22421c<LongLinkVirtualVoice.VoicePayGuideUser> m98294i1() {
        return this.f71667R1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.bf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoicePayGuideUser) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: j */
    public C22421c<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> m98295j() {
        return this.f71746n1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.eh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: j0 */
    public C22421c<LongLinkSocketMessage.TopEffect> m98296j0() {
        return this.f71736l.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.xg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkSocketMessage.TopEffect) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: j1 */
    public C22421c<VoiceLivePk.VoiceLivePkModify> m98297j1() {
        return this.f71743m2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.eg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceLivePk.VoiceLivePkModify) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: k */
    public C22421c<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> m98298k() {
        return this.f71647L.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.vf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLeaderboard.GiftStarLeaderboardChangeMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: k0 */
    public C22421c<LongLinkLiveMessage.VoiceRoomTopicUpdate> m98299k0() {
        return this.f71638I.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.nf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveMessage.VoiceRoomTopicUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: k1 */
    public C22421c<VoiceLivePk.VoiceLivePkPoint> m98300k1() {
        return this.f71747n2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ng1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceLivePk.VoiceLivePkPoint) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: l */
    public C22421c<BLiveVoiceGrabHatCP> m98301l() {
        return this.f71636H0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.gi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveVoiceGrabHatCP) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: l0 */
    public C22421c<VoiceUpdateUserMaskProto.UserMaskUpdate> m98302l0() {
        return this.f71733k0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.of1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceUpdateUserMaskProto.UserMaskUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: l1 */
    public C22421c<LongLinkVoicePublicLive.VoicePublicLive> m98303l1() {
        return this.f71729j0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.si1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVoicePublicLive.VoicePublicLive) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: m */
    public C22421c<BLiveVoiceGrabHatGame> m98304m() {
        return this.f71633G0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.qi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveVoiceGrabHatGame) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: m0 */
    public C22421c<LongLinkAdminMessage.UserWithBgColorSocketNotification> m98305m0() {
        return this.f71759r.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.ig1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkAdminMessage.UserWithBgColorSocketNotification) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: m1 */
    public C22421c<LongLinkLiveMessage.VoiceLiveHighQualityTagMessage> m98306m1() {
        return this.f71745n0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ag1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveMessage.VoiceLiveHighQualityTagMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: n */
    public C22421c<LongLinkGiftMessage.LiveRanking> m98307n() {
        return this.f71777x.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.cg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkGiftMessage.LiveRanking) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: n0 */
    public C22421c<liveRight.UserLiveRightResources> m98308n0() {
        return this.f71665R.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.mg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((liveRight.UserLiveRightResources) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: n1 */
    public C22421c<LongLinkVirtualVoice.VoiceRoomCover> m98309n1() {
        return this.f71695a2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.di1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceRoomCover) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: o */
    public C22421c<List<BLiveHourLeaderBoardItem>> m98310o() {
        return this.f71696b.asObservable().onBackpressureLatest().filter(new z86()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: o0 */
    public C22421c<LongLinkVideoChat.LiveVideoChatAnchorCallResult> m98311o0() {
        return this.f71682W1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ii1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVideoChat.LiveVideoChatAnchorCallResult) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: o1 */
    public C22421c<LongLinkVirtualVoice.VoiceRoomPersonalUpdate> m98312o1() {
        return this.f71738l1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.kg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceRoomPersonalUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: p */
    public C22421c<BLiveIntlGiftLeaderboard> m98313p() {
        return this.f71764s1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.vg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveIntlGiftLeaderboard) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: p0 */
    public C22421c<LongLinkVideoChat.LiveVideoChatBubble> m98314p0() {
        return this.f71688Y1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.yf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVideoChat.LiveVideoChatBubble) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: p1 */
    public C22421c<LongLinkVirtualVoice.VoiceStreamBizTypeMessage> m98315p1() {
        return this.f71761r1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.xe1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceStreamBizTypeMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: q */
    public C22421c<LongLinkIntlLightPushMessage.IntlLightPushInfo> m98316q() {
        return this.f71616A1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ci1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkIntlLightPushMessage.IntlLightPushInfo) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: q0 */
    public C22421c<LongLinkGiftMessage.VideoChatDuration> m98317q0() {
        return this.f71691Z1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.oi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkGiftMessage.VideoChatDuration) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: q1 */
    public C22421c<VoiceSweet.VoiceCpBindMessage> m98318q1() {
        return this.f71648L0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ri1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceSweet.VoiceCpBindMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: r */
    public C22421c<z3j0> m98319r() {
        return this.f71770u1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.uf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((z3j0) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: r0 */
    public C22421c<LongLinkVideoChat.LiveVideoChatLiveChange> m98320r0() {
        return this.f71676U1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.sh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVideoChat.LiveVideoChatLiveChange) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: r1 */
    public C22421c<VoiceSweet.VoiceSweetCpEffect> m98321r1() {
        return this.f71649L1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.kh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceSweet.VoiceSweetCpEffect) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: s */
    public C22421c<LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg> m98322s() {
        return this.f71619B1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.fg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: s0 */
    public C22421c<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> m98323s0() {
        return this.f71703c2.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ff1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveMessage.RefreshVoiceRoomLeaderboard) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: s1 */
    public C22421c<VoiceSweet.VoiceCpHouseUpgradeMessage> m98324s1() {
        return this.f71651M0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.wi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((VoiceSweet.VoiceCpHouseUpgradeMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: t */
    public C22421c<LongLinkLiveMessage.JailInRoom> m98325t() {
        return this.f71678V0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.pi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveMessage.JailInRoom) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: t0 */
    public C22421c<LongLinkVirtualVoice.VoiceRoomLevelUp> m98326t0() {
        return this.f71690Z0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.if1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceRoomLevelUp) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: t1 */
    public C22421c<LongLinkLiveMessage.VoiceLiveTopEffectMessage> m98327t1() {
        return this.f71737l0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.jg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveMessage.VoiceLiveTopEffectMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: u */
    public C22421c<LongLinkSocketMessage.LiveAnimationPlayMsg> m98328u() {
        return this.f71629F.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.xf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkSocketMessage.LiveAnimationPlayMsg) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: u0 */
    public C22421c<LongLinkVirtualVoice.StarRedpacketInfo> m98329u0() {
        return this.f71694a1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ve1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.StarRedpacketInfo) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: u1 */
    public C22421c<LongLinkLiveMessage.VoiceSettleGuideMessage> m98330u1() {
        return this.f71758q1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.ye1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkLiveMessage.VoiceSettleGuideMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: v */
    public C22421c<LongLinkBottomMenu.LiveBottomMenuUpdate> m98331v() {
        return this.f71675U0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.yh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkBottomMenu.LiveBottomMenuUpdate) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: v0 */
    public C22421c<b3v> m98332v0() {
        return this.f71639I0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.fi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((b3v) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: v1 */
    public C22421c<LongLinkVirtualVoice.VoiceUserGuide> m98333v1() {
        return this.f71762s.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.fh1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceUserGuide) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: w */
    public C22421c<List<LongLinkGiftMessage.LiveCampaignInfo>> m98334w() {
        return this.f71744n.asObservable().onBackpressureLatest().filter(new z86()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: w0 */
    public C22421c<LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp> m98335w0() {
        return this.f71658O1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.we1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: x */
    public C22421c<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> m98336x() {
        return this.f71669S0.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.bi1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: x0 */
    public C22421c<gvn0> m98337x0() {
        return this.f71623D.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.tg1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((gvn0) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: y */
    public C22421c<LiveControlMessage> m98338y() {
        return this.f71692a.asObservable().onBackpressureBuffer(20000L).filter(new qcj() { // from class: l.gf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LiveControlMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: y0 */
    public C22421c<VoiceFunnyAvatar.VoiceLivePhotoSticker> m98339y0() {
        return this.f71698b1.asObservable().onBackpressureLatest().filter(new ppo0()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: z */
    public C22421c<BLiveEnterRoom> m98340z() {
        return this.f71712f.asObservable().onBackpressureBuffer(100L).filter(new qcj() { // from class: l.mf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveEnterRoom) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: z0 */
    public C22421c<LongLinkVirtualVoice.VoiceSettleInviteMessage> m98341z0() {
        return this.f71767t1.asObservable().onBackpressureLatest().filter(new qcj() { // from class: l.rf1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((LongLinkVirtualVoice.VoiceSettleInviteMessage) obj));
            }
        }).observeOn(fo0.m126432a());
    }
}
