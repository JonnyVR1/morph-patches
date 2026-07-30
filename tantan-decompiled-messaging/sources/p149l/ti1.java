package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p046p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p046p1.mobile.longlink.msg.intlvoicesing.voiceSingTogether;
import com.p046p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard;
import com.p046p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p046p1.mobile.longlink.msg.live_fanbase.LongLinkLiveFanbaseMessage;
import com.p046p1.mobile.longlink.msg.liveadmininner.LongLinkAdminMessage;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.livedistribution.LongLinkReportMsg;
import com.p046p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p046p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p046p1.mobile.longlink.msg.liveright.liveRight;
import com.p046p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkBottomMenu;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveConfession;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVideoFindPeople;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceIntlCommonMsg;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceUndercoverBean;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p046p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p046p1.mobile.longlink.msg.videoChat.LongLinkVideoChat;
import com.p046p1.mobile.longlink.msg.voicegift.VoiceNewCampaign;
import com.p046p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceFunnyAvatar;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLivePk;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceNineMicUserScore;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceRollDice;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p046p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance;
import com.p046p1.mobile.putong.live.base.data.BLivePKBufferInfo;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth;
import com.p046p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPanelBgInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogether;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveSchemePopupMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.RewardPointMsg;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveHeartBeatInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceSongGameMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class ti1 {

    /* JADX INFO: renamed from: a */
    public C22393b<LiveControlMessage> f170425a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public C22393b<List<BLiveHourLeaderBoardItem>> f170429b = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public C22393b<BLiveGivenGiftBrief> f170433c = C22393b.m221521b();

    /* JADX INFO: renamed from: d */
    public C22393b<BLiveGivenGiftBrief> f170437d = C22393b.m221521b();

    /* JADX INFO: renamed from: e */
    public C22393b<BLiveUserUpgrade> f170441e = C22393b.m221521b();

    /* JADX INFO: renamed from: f */
    public C22393b<BLiveEnterRoom> f170445f = C22393b.m221521b();

    /* JADX INFO: renamed from: g */
    public C22393b<LiveInfoMessage> f170449g = C22393b.m221521b();

    /* JADX INFO: renamed from: h */
    public C22393b<j760<LongLinkChatMessage.PostMessageAck, String>> f170453h = C22393b.m221521b();

    /* JADX INFO: renamed from: i */
    public C22393b<LongLinkGiftMessage.LiveLeaderboardMessage> f170457i = C22393b.m221521b();

    /* JADX INFO: renamed from: j */
    public C22393b<LongLinkMedalMessage.TurboCardReceiveEvent> f170461j = C22393b.m221521b();

    /* JADX INFO: renamed from: k */
    public C22393b<LongLinkMedalMessage.TurboCardResultNotice> f170465k = C22393b.m221521b();

    /* JADX INFO: renamed from: l */
    public C22393b<LongLinkSocketMessage.TopEffect> f170469l = C22393b.m221521b();

    /* JADX INFO: renamed from: m */
    public C22393b<LongLinkSocketMessage.PopUp> f170473m = C22393b.m221521b();

    /* JADX INFO: renamed from: n */
    public C22393b<List<LongLinkGiftMessage.LiveCampaignInfo>> f170477n = C22393b.m221521b();

    /* JADX INFO: renamed from: o */
    public C22393b<LongLinkSocketMessage.PopUpContentUpdateNotice> f170481o = C22393b.m221521b();

    /* JADX INFO: renamed from: p */
    public C22393b<if2> f170485p = C22393b.m221521b();

    /* JADX INFO: renamed from: q */
    public C22393b<LongLinkGiftMessage.LiveRankings> f170489q = C22393b.m221521b();

    /* JADX INFO: renamed from: r */
    public C22393b<LongLinkAdminMessage.UserWithBgColorSocketNotification> f170492r = C22393b.m221521b();

    /* JADX INFO: renamed from: s */
    public C22393b<LongLinkVirtualVoice.VoiceUserGuide> f170495s = C22393b.m221521b();

    /* JADX INFO: renamed from: t */
    public C22393b<LongLinkLiveMessage.AnchorDailyTaskMessage> f170498t = C22393b.m221521b();

    /* JADX INFO: renamed from: u */
    public C22393b<LongLinkLiveMessage.UserDailyTaskMessage> f170501u = C22393b.m221521b();

    /* JADX INFO: renamed from: v */
    public C22393b<LongLinkLiveDownBox.LiveAccessChannel> f170504v = C22393b.m221521b();

    /* JADX INFO: renamed from: w */
    public C22393b<BLiveHourLeaderBoardItem> f170507w = C22393b.m221521b();

    /* JADX INFO: renamed from: x */
    public C22393b<LongLinkGiftMessage.LiveRanking> f170510x = C22393b.m221521b();

    /* JADX INFO: renamed from: y */
    public C22393b<LongLinkGiftMessage.LiveRanking> f170513y = C22393b.m221521b();

    /* JADX INFO: renamed from: z */
    public C22393b<LongLinkGiftMessage.LiveRanking> f170516z = C22393b.m221521b();

    /* JADX INFO: renamed from: A */
    public C22393b<LongLinkLiveMessage.LiveStickerChangeMsg> f170347A = C22393b.m221521b();

    /* JADX INFO: renamed from: B */
    public C22393b<LivePkMessage> f170350B = C22393b.m221521b();

    /* JADX INFO: renamed from: C */
    public C22393b<LiveCallMessage> f170353C = C22393b.m221521b();

    /* JADX INFO: renamed from: D */
    public C22393b<cmn0> f170356D = C22393b.m221521b();

    /* JADX INFO: renamed from: E */
    public C22393b<LongLinkLiveFanbaseMessage.RedPacketEvent> f170359E = C22393b.m221521b();

    /* JADX INFO: renamed from: F */
    public C22393b<LongLinkSocketMessage.LiveAnimationPlayMsg> f170362F = C22393b.m221521b();

    /* JADX INFO: renamed from: G */
    public C22393b<LongLinkLiveMessage.RoomInfo> f170365G = C22393b.m221521b();

    /* JADX INFO: renamed from: H */
    public C22393b<RewardPointMsg> f170368H = C22393b.m221521b();

    /* JADX INFO: renamed from: I */
    public C22393b<LongLinkLiveMessage.VoiceRoomTopicUpdate> f170371I = C22393b.m221521b();

    /* JADX INFO: renamed from: J */
    public C22393b<e8t> f170374J = C22393b.m221521b();

    /* JADX INFO: renamed from: K */
    public C22393b<LongLinkSocketMessage.OperationUpdateNotice> f170377K = C22393b.m221521b();

    /* JADX INFO: renamed from: L */
    public C22393b<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> f170380L = C22393b.m221521b();

    /* JADX INFO: renamed from: M */
    public C22393b<LongLinkLiveMessage.VoiceLiveGame> f170383M = C22393b.m221521b();

    /* JADX INFO: renamed from: N */
    public C22393b<LiveSchemePopupMessage> f170386N = C22393b.m221521b();

    /* JADX INFO: renamed from: O */
    public C22393b<VoiceSongGameMessage> f170389O = C22393b.m221521b();

    /* JADX INFO: renamed from: P */
    public C22393b<LongLinkLiveDanmakuMessage.BulletCommentInfo> f170392P = C22393b.m221521b();

    /* JADX INFO: renamed from: Q */
    public C22393b<LongLinkReportMsg.LiveReportMsg> f170395Q = C22393b.m221521b();

    /* JADX INFO: renamed from: R */
    public C22393b<liveRight.UserLiveRightResources> f170398R = C22393b.m221521b();

    /* JADX INFO: renamed from: S */
    public C22393b<tzo0> f170401S = C22393b.m221521b();

    /* JADX INFO: renamed from: T */
    public C22393b<LongLinkLiveUserLevel.UserLiveHierarchyProgressChange> f170404T = C22393b.m221521b();

    /* JADX INFO: renamed from: U */
    public C22393b<LongLinkLiveMessage.VoiceMemberUpdate> f170407U = C22393b.m221521b();

    /* JADX INFO: renamed from: V */
    public C22393b<BLiveGiftBubbleConfig> f170410V = C22393b.m221521b();

    /* JADX INFO: renamed from: W */
    public C22393b<LongLinkLiveMessage.AnnouncementAudit> f170413W = C22393b.m221521b();

    /* JADX INFO: renamed from: X */
    public C22393b<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> f170416X = C22393b.m221521b();

    /* JADX INFO: renamed from: Y */
    public C22393b<VoiceUndercoverBean.VoiceUndercover> f170419Y = C22393b.m221521b();

    /* JADX INFO: renamed from: Z */
    public C22393b<LongLinkLiveMessage.VoiceChatGroupInviteCreate> f170422Z = C22393b.m221521b();

    /* JADX INFO: renamed from: a0 */
    public C22393b<LongLinkLiveMessage.VoiceChatGroupApply> f170426a0 = C22393b.m221521b();

    /* JADX INFO: renamed from: b0 */
    public C22393b<VoiceLiveManager.VoiceManagerInvite> f170430b0 = C22393b.m221521b();

    /* JADX INFO: renamed from: c0 */
    public C22393b<VoiceLiveManager.VoiceManagerUpdate> f170434c0 = C22393b.m221521b();

    /* JADX INFO: renamed from: d0 */
    public C22393b<VoiceLiveManager.VoiceFreeCallUpdate> f170438d0 = C22393b.m221521b();

    /* JADX INFO: renamed from: e0 */
    public C22393b<u5t> f170442e0 = C22393b.m221521b();

    /* JADX INFO: renamed from: f0 */
    public C22393b<LongLinkMultiCallMessage.MultiCallTurnOnGuide> f170446f0 = C22393b.m221521b();

    /* JADX INFO: renamed from: g0 */
    public C22393b<LongLinkMultiCallMessage.MultiCallActionMessage> f170450g0 = C22393b.m221521b();

    /* JADX INFO: renamed from: h0 */
    public C22393b<b6t> f170454h0 = C22393b.m221521b();

    /* JADX INFO: renamed from: i0 */
    public C22393b<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage> f170458i0 = C22393b.m221521b();

    /* JADX INFO: renamed from: j0 */
    public C22393b<LongLinkVoicePublicLive.VoicePublicLive> f170462j0 = C22393b.m221521b();

    /* JADX INFO: renamed from: k0 */
    public C22393b<VoiceUpdateUserMaskProto.UserMaskUpdate> f170466k0 = C22393b.m221521b();

    /* JADX INFO: renamed from: l0 */
    public C22393b<LongLinkLiveMessage.VoiceLiveTopEffectMessage> f170470l0 = C22393b.m221521b();

    /* JADX INFO: renamed from: m0 */
    public C22393b<LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage> f170474m0 = C22393b.m221521b();

    /* JADX INFO: renamed from: n0 */
    public C22393b<LongLinkLiveMessage.VoiceLiveHighQualityTagMessage> f170478n0 = C22393b.m221521b();

    /* JADX INFO: renamed from: o0 */
    public C22393b<LongLinkConfession.ConfessionGiftReceiveMsg> f170482o0 = C22393b.m221521b();

    /* JADX INFO: renamed from: p0 */
    public C22393b<LongLinkLiveConfession.JumpSendMessage> f170486p0 = C22393b.m221521b();

    /* JADX INFO: renamed from: q0 */
    public C22393b<LongLinkVideoFindPeople.LiveMultiCallPartyFinderMessage> f170490q0 = C22393b.m221521b();

    /* JADX INFO: renamed from: r0 */
    public C22393b<LongLinkVideoFindPeople.LiveAnchorAvatarComment> f170493r0 = C22393b.m221521b();

    /* JADX INFO: renamed from: s0 */
    public C22393b<BLiveVoiceSingTogether> f170496s0 = C22393b.m221521b();

    /* JADX INFO: renamed from: t0 */
    public C22393b<voiceSingTogether.VoiceSingConfirm> f170499t0 = C22393b.m221521b();

    /* JADX INFO: renamed from: u0 */
    public C22393b<voiceSingTogether.VoiceSingStart> f170502u0 = C22393b.m221521b();

    /* JADX INFO: renamed from: v0 */
    public C22393b<VoiceLiveInfoMessage> f170505v0 = C22393b.m221521b();

    /* JADX INFO: renamed from: w0 */
    public C22393b<LongLinkVirtualVoice.VoiceAdminPanelCounterMessage> f170508w0 = C22393b.m221521b();

    /* JADX INFO: renamed from: x0 */
    public C22393b<LongLinkVirtualVoice.VoiceRoomDissolve> f170511x0 = C22393b.m221521b();

    /* JADX INFO: renamed from: y0 */
    public C22393b<LongLinkVirtualVoice.VoiceSettleMessage> f170514y0 = C22393b.m221521b();

    /* JADX INFO: renamed from: z0 */
    public C22393b<liveRight.TopChatUpdateNotice> f170517z0 = C22393b.m221521b();

    /* JADX INFO: renamed from: A0 */
    public C22393b<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> f170348A0 = C22393b.m221521b();

    /* JADX INFO: renamed from: B0 */
    public C22393b<VoiceLiveHeartBeatInfoMessage> f170351B0 = C22393b.m221521b();

    /* JADX INFO: renamed from: C0 */
    public C22393b<LongLinkGiftMessage.LiveRankings> f170354C0 = C22393b.m221521b();

    /* JADX INFO: renamed from: D0 */
    public C22393b<BLiveVoiceLeaderBoardItem> f170357D0 = C22393b.m221521b();

    /* JADX INFO: renamed from: E0 */
    public C22393b<eln0> f170360E0 = C22393b.m221521b();

    /* JADX INFO: renamed from: F0 */
    public C22393b<VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage> f170363F0 = C22393b.m221521b();

    /* JADX INFO: renamed from: G0 */
    public C22393b<BLiveVoiceGrabHatGame> f170366G0 = C22393b.m221521b();

    /* JADX INFO: renamed from: H0 */
    public C22393b<BLiveVoiceGrabHatCP> f170369H0 = C22393b.m221521b();

    /* JADX INFO: renamed from: I0 */
    public C22393b<a1v> f170372I0 = C22393b.m221521b();

    /* JADX INFO: renamed from: J0 */
    public C22393b<c1v> f170375J0 = C22393b.m221521b();

    /* JADX INFO: renamed from: K0 */
    public C22393b<String> f170378K0 = C22393b.m221521b();

    /* JADX INFO: renamed from: L0 */
    public C22393b<VoiceSweet.VoiceCpBindMessage> f170381L0 = C22393b.m221521b();

    /* JADX INFO: renamed from: M0 */
    public C22393b<VoiceSweet.VoiceCpHouseUpgradeMessage> f170384M0 = C22393b.m221521b();

    /* JADX INFO: renamed from: N0 */
    public C22393b<VoiceSweet.VoiceSweetCpAnimation> f170387N0 = C22393b.m221521b();

    /* JADX INFO: renamed from: O0 */
    public C22393b<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> f170390O0 = C22393b.m221521b();

    /* JADX INFO: renamed from: P0 */
    public C22393b<VoiceNewCampaign.VoiceLiveContentUpdateNotice> f170393P0 = C22393b.m221521b();

    /* JADX INFO: renamed from: Q0 */
    public C22393b<VoiceNewCampaignPopUp.VoiceLivePopUp> f170396Q0 = C22393b.m221521b();

    /* JADX INFO: renamed from: R0 */
    public C22393b<VoiceRollDice.VoiceGiftWallLightNoticeMessage> f170399R0 = C22393b.m221521b();

    /* JADX INFO: renamed from: S0 */
    public C22393b<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> f170402S0 = C22393b.m221521b();

    /* JADX INFO: renamed from: T0 */
    public C22393b<VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh> f170405T0 = C22393b.m221521b();

    /* JADX INFO: renamed from: U0 */
    public C22393b<LongLinkBottomMenu.LiveBottomMenuUpdate> f170408U0 = C22393b.m221521b();

    /* JADX INFO: renamed from: V0 */
    public C22393b<LongLinkLiveMessage.JailInRoom> f170411V0 = C22393b.m221521b();

    /* JADX INFO: renamed from: W0 */
    public C22393b<BLiveVoiceKtvGameInfo> f170414W0 = C22393b.m221521b();

    /* JADX INFO: renamed from: X0 */
    public C22393b<LongLinkVoiceKtv.VoiceKTVOrderRefresh> f170417X0 = C22393b.m221521b();

    /* JADX INFO: renamed from: Y0 */
    public C22393b<LongLinkVirtualVoice.VoiceRoomHeatUpdate> f170420Y0 = C22393b.m221521b();

    /* JADX INFO: renamed from: Z0 */
    public C22393b<LongLinkVirtualVoice.VoiceRoomLevelUp> f170423Z0 = C22393b.m221521b();

    /* JADX INFO: renamed from: a1 */
    public C22393b<LongLinkVirtualVoice.StarRedpacketInfo> f170427a1 = C22393b.m221521b();

    /* JADX INFO: renamed from: b1 */
    public C22393b<VoiceFunnyAvatar.VoiceLivePhotoSticker> f170431b1 = C22393b.m221521b();

    /* JADX INFO: renamed from: c1 */
    public C22393b<LongLinkLiveMultiPk.MultiPkInviteNotify> f170435c1 = C22393b.m221521b();

    /* JADX INFO: renamed from: d1 */
    public C22393b<LongLinkLiveMultiPk.MultiPkInviteRejected> f170439d1 = C22393b.m221521b();

    /* JADX INFO: renamed from: e1 */
    public C22393b<LongLinkLiveMultiPk.MultiPkInviteAccepted> f170443e1 = C22393b.m221521b();

    /* JADX INFO: renamed from: f1 */
    public C22393b<LongLinkLiveMultiPk.MultiPkAnimation> f170447f1 = C22393b.m221521b();

    /* JADX INFO: renamed from: g1 */
    public C22393b<LongLinkLiveMultiPk.MultiPkPoints> f170451g1 = C22393b.m221521b();

    /* JADX INFO: renamed from: h1 */
    public C22393b<LongLinkLiveMultiPk.MultiPkStageChange> f170455h1 = C22393b.m221521b();

    /* JADX INFO: renamed from: i1 */
    public C22393b<LongLinkVirtualVoice.VoiceLiveTemplateMessage> f170459i1 = C22393b.m221521b();

    /* JADX INFO: renamed from: j1 */
    public C22393b<LongLinkVirtualVoice.VoiceRoomTitleUpdate> f170463j1 = C22393b.m221521b();

    /* JADX INFO: renamed from: k1 */
    public C22393b<LongLinkVirtualVoice.VoiceChatTopicMessage> f170467k1 = C22393b.m221521b();

    /* JADX INFO: renamed from: l1 */
    public C22393b<LongLinkVirtualVoice.VoiceRoomPersonalUpdate> f170471l1 = C22393b.m221521b();

    /* JADX INFO: renamed from: m1 */
    public C22393b<VoiceNineMicUserScore.VoiceLiveBossUserScore> f170475m1 = C22393b.m221521b();

    /* JADX INFO: renamed from: n1 */
    public C22393b<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> f170479n1 = C22393b.m221521b();

    /* JADX INFO: renamed from: o1 */
    public C22393b<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> f170483o1 = C22393b.m221521b();

    /* JADX INFO: renamed from: p1 */
    public C22393b<LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation> f170487p1 = C22393b.m221521b();

    /* JADX INFO: renamed from: q1 */
    public C22393b<LongLinkLiveMessage.VoiceSettleGuideMessage> f170491q1 = C22393b.m221521b();

    /* JADX INFO: renamed from: r1 */
    public C22393b<LongLinkVirtualVoice.VoiceStreamBizTypeMessage> f170494r1 = C22393b.m221521b();

    /* JADX INFO: renamed from: s1 */
    public C22393b<BLiveIntlGiftLeaderboard> f170497s1 = C22393b.m221521b();

    /* JADX INFO: renamed from: t1 */
    public C22393b<LongLinkVirtualVoice.VoiceSettleInviteMessage> f170500t1 = C22393b.m221521b();

    /* JADX INFO: renamed from: u1 */
    public C22393b<vui0> f170503u1 = C22393b.m221521b();

    /* JADX INFO: renamed from: v1 */
    public C22393b<LongLinkLiveUserLevel.RoomTopEffect> f170506v1 = C22393b.m221521b();

    /* JADX INFO: renamed from: w1 */
    public C22393b<LongLinkVirtualVoice.VoiceToneMessage> f170509w1 = C22393b.m221521b();

    /* JADX INFO: renamed from: x1 */
    public C22393b<LongLinkSocketMessage.DragonScourgeRecords> f170512x1 = C22393b.m221521b();

    /* JADX INFO: renamed from: y1 */
    public C22393b<LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage> f170515y1 = C22393b.m221521b();

    /* JADX INFO: renamed from: z1 */
    public C22393b<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> f170518z1 = C22393b.m221521b();

    /* JADX INFO: renamed from: A1 */
    public C22393b<LongLinkIntlLightPushMessage.IntlLightPushInfo> f170349A1 = C22393b.m221521b();

    /* JADX INFO: renamed from: B1 */
    public C22393b<LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg> f170352B1 = C22393b.m221521b();

    /* JADX INFO: renamed from: C1 */
    public C22393b<OfficialShowMessage.OfficialShowUpdateStatus> f170355C1 = C22393b.m221521b();

    /* JADX INFO: renamed from: D1 */
    public C22393b<OfficialShowMessage.OfficialShowJump> f170358D1 = C22393b.m221521b();

    /* JADX INFO: renamed from: E1 */
    public C22393b<LongLinkBottomMenu.LivePictureTextAlert> f170361E1 = C22393b.m221521b();

    /* JADX INFO: renamed from: F1 */
    public C22393b<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> f170364F1 = C22393b.m221521b();

    /* JADX INFO: renamed from: G1 */
    public C22393b<BLiveLuckyParadiseBottomEntrance> f170367G1 = C22393b.m221521b();

    /* JADX INFO: renamed from: H1 */
    public C22393b<BLiveLuckyParadiseBottomEntrance> f170370H1 = C22393b.m221521b();

    /* JADX INFO: renamed from: I1 */
    public C22393b<j5h0> f170373I1 = C22393b.m221521b();

    /* JADX INFO: renamed from: J1 */
    public C22393b<LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate> f170376J1 = C22393b.m221521b();

    /* JADX INFO: renamed from: K1 */
    public C22393b<LongLinkConfession.GiftWallGradeFiveNotice> f170379K1 = C22393b.m221521b();

    /* JADX INFO: renamed from: L1 */
    public C22393b<VoiceSweet.VoiceSweetCpEffect> f170382L1 = C22393b.m221521b();

    /* JADX INFO: renamed from: M1 */
    public C22393b<BLiveVoiceKtvPanelBgInfo> f170385M1 = C22393b.m221521b();

    /* JADX INFO: renamed from: N1 */
    public C22393b<LongLinkVirtualVoice.VoicePayGuidePopUp> f170388N1 = C22393b.m221521b();

    /* JADX INFO: renamed from: O1 */
    public C22393b<LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp> f170391O1 = C22393b.m221521b();

    /* JADX INFO: renamed from: P1 */
    public C22393b<j5h0> f170394P1 = C22393b.m221521b();

    /* JADX INFO: renamed from: Q1 */
    public C22393b<LongLinkVirtualVoice.VoicePayGuideV2PopUp> f170397Q1 = C22393b.m221521b();

    /* JADX INFO: renamed from: R1 */
    public C22393b<LongLinkVirtualVoice.VoicePayGuideUser> f170400R1 = C22393b.m221521b();

    /* JADX INFO: renamed from: S1 */
    public C22393b<BLiveVideoChat> f170403S1 = C22393b.m221521b();

    /* JADX INFO: renamed from: T1 */
    public C22393b<LongLinkVideoChat.LiveVideoChatToast> f170406T1 = C22393b.m221521b();

    /* JADX INFO: renamed from: U1 */
    public C22393b<LongLinkVideoChat.LiveVideoChatLiveChange> f170409U1 = C22393b.m221521b();

    /* JADX INFO: renamed from: V1 */
    public C22393b<liveAuthMessageNew.MultiDevice> f170412V1 = C22393b.m221521b();

    /* JADX INFO: renamed from: W1 */
    public C22393b<LongLinkVideoChat.LiveVideoChatAnchorCallResult> f170415W1 = C22393b.m221521b();

    /* JADX INFO: renamed from: X1 */
    public C22393b<LongLinkVideoChat.LiveVideoChatCdnFail> f170418X1 = C22393b.m221521b();

    /* JADX INFO: renamed from: Y1 */
    public C22393b<LongLinkVideoChat.LiveVideoChatBubble> f170421Y1 = C22393b.m221521b();

    /* JADX INFO: renamed from: Z1 */
    public C22393b<LongLinkGiftMessage.VideoChatDuration> f170424Z1 = C22393b.m221521b();

    /* JADX INFO: renamed from: a2 */
    public C22393b<LongLinkVirtualVoice.VoiceRoomCover> f170428a2 = C22393b.m221521b();

    /* JADX INFO: renamed from: b2 */
    public C22393b<LongLinkLiveBottomPopup.VideoLiveToast> f170432b2 = C22393b.m221521b();

    /* JADX INFO: renamed from: c2 */
    public C22393b<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> f170436c2 = C22393b.m221521b();

    /* JADX INFO: renamed from: d2 */
    public C22393b<BLivePKBufferInfo> f170440d2 = C22393b.m221521b();

    /* JADX INFO: renamed from: e2 */
    public C22393b<BLivePKCardShowListWithBoth> f170444e2 = C22393b.m221521b();

    /* JADX INFO: renamed from: f2 */
    public C22393b<LongLinkVoiceKtv.VoiceKTVOrderRating> f170448f2 = C22393b.m221521b();

    /* JADX INFO: renamed from: g2 */
    public C22393b<LongLinkVoiceKtv.VoiceKTVBubble> f170452g2 = C22393b.m221521b();

    /* JADX INFO: renamed from: h2 */
    public C22393b<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose> f170456h2 = C22393b.m221521b();

    /* JADX INFO: renamed from: i2 */
    public C22393b<LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg> f170460i2 = C22393b.m221521b();

    /* JADX INFO: renamed from: j2 */
    public C22393b<LongLinkVirtualVoice.VoiceGameMessage> f170464j2 = C22393b.m221521b();

    /* JADX INFO: renamed from: k2 */
    public C22393b<LongLinkVirtualVoice.VoiceLiveGameTypeMessage> f170468k2 = C22393b.m221521b();

    /* JADX INFO: renamed from: l2 */
    public C22393b<LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray> f170472l2 = C22393b.m221521b();

    /* JADX INFO: renamed from: m2 */
    public C22393b<VoiceLivePk.VoiceLivePkModify> f170476m2 = C22393b.m221521b();

    /* JADX INFO: renamed from: n2 */
    public C22393b<VoiceLivePk.VoiceLivePkPoint> f170480n2 = C22393b.m221521b();

    /* JADX INFO: renamed from: o2 */
    public C22393b<LongLinkSocketMessage.MysteryBoxRecord> f170484o2 = C22393b.m221521b();

    /* JADX INFO: renamed from: p2 */
    public C22393b<LongLinkLiveMessage.GiftWallRefresh> f170488p2 = C22393b.m221521b();

    /* JADX INFO: renamed from: A */
    public C22306c<BLiveGivenGiftBrief> m189034A() {
        return this.f170437d.asObservable().onBackpressureBuffer(100L).filter(new jf1()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: A0 */
    public C22306c<LongLinkVoiceKtv.VoiceKTVBubble> m189035A0() {
        return this.f170452g2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.pg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVoiceKtv.VoiceKTVBubble) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: B */
    public C22306c<BLiveGivenGiftBrief> m189036B() {
        return this.f170433c.asObservable().onBackpressureBuffer(100L).filter(new jf1()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: B0 */
    public C22306c<BLiveVoiceKtvGameInfo> m189037B0() {
        return this.f170414W0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.af1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveVoiceKtvGameInfo) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: C */
    public C22306c<LiveInfoMessage> m189038C() {
        return this.f170449g.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.ug1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LiveInfoMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: C0 */
    public C22306c<LongLinkVoiceKtv.VoiceKTVOrderRefresh> m189039C0() {
        return this.f170417X0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.jh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVoiceKtv.VoiceKTVOrderRefresh) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: D */
    public C22306c<LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray> m189040D() {
        return this.f170472l2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.zf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: D0 */
    public C22306c<LongLinkVoiceKtv.VoiceKTVOrderRating> m189041D0() {
        return this.f170448f2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ag1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVoiceKtv.VoiceKTVOrderRating) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: E */
    public C22306c<e8t> m189042E() {
        return this.f170374J.asObservable().onBackpressureBuffer(100L).filter(new w9j() { // from class: l.hg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((e8t) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: E0 */
    public C22306c<LongLinkVirtualVoice.VoiceAdminPanelCounterMessage> m189043E0() {
        return this.f170508w0.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.ai1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceAdminPanelCounterMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: F */
    public C22306c<LongLinkSocketMessage.OperationUpdateNotice> m189044F() {
        return this.f170377K.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.vg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkSocketMessage.OperationUpdateNotice) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: F0 */
    public C22306c<BLiveVoiceLeaderBoardItem> m189045F0() {
        return this.f170357D0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.lg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveVoiceLeaderBoardItem) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: G */
    public C22306c<j5h0> m189046G() {
        return this.f170394P1.asObservable().onBackpressureLatest().filter(new tg1()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: G0 */
    public C22306c<LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation> m189047G0() {
        return this.f170487p1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.oh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: H */
    public C22306c<LongLinkMedalMessage.TurboCardResultNotice> m189048H() {
        return this.f170465k.asObservable().onBackpressureBuffer(100L).filter(new w9j() { // from class: l.sh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkMedalMessage.TurboCardResultNotice) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: H0 */
    public C22306c<LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter> m189049H0() {
        return this.f170364F1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.eh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: I */
    public C22306c<LongLinkMedalMessage.TurboCardReceiveEvent> m189050I() {
        return this.f170461j.asObservable().onBackpressureBuffer(100L).filter(new w9j() { // from class: l.ni1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkMedalMessage.TurboCardReceiveEvent) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: I0 */
    public C22306c<LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate> m189051I0() {
        return this.f170483o1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.di1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: J */
    public C22306c<LongLinkVirtualVoice.VoiceLiveGameTypeMessage> m189052J() {
        return this.f170468k2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.eg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceLiveGameTypeMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: J0 */
    public C22306c<tzo0> m189053J0() {
        return this.f170401S.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.bh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((tzo0) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: K */
    public C22306c<LongLinkVirtualVoice.VoiceGameMessage> m189054K() {
        return this.f170464j2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ch1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceGameMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: K0 */
    public C22306c<VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh> m189055K0() {
        return this.f170405T0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.gi1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceIntlCommonMsg.VoiceLiveBottomMenuRefresh) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: L */
    public C22306c<BLiveUserUpgrade> m189056L() {
        return this.f170441e.asObservable().onBackpressureBuffer(100L).filter(new w9j() { // from class: l.sf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveUserUpgrade) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: L0 */
    public C22306c<eln0> m189057L0() {
        return this.f170360E0.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.if1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((eln0) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: M */
    public C22306c<LongLinkVirtualVoice.VoiceToneMessage> m189058M() {
        return this.f170509w1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.te1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceToneMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: M0 */
    public C22306c<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> m189059M0() {
        return this.f170390O0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.wf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: N */
    public C22306c<LongLinkMultiCallMessage.MultiCallActionMessage> m189060N() {
        return this.f170450g0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.fh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkMultiCallMessage.MultiCallActionMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: N0 */
    public C22306c<VoiceRollDice.VoiceGiftWallLightNoticeMessage> m189061N0() {
        return this.f170399R0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.qh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceRollDice.VoiceGiftWallLightNoticeMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: O */
    public C22306c<LongLinkMultiCallMessage.MultiCallTurnOnGuide> m189062O() {
        return this.f170446f0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.oi1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkMultiCallMessage.MultiCallTurnOnGuide) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: O0 */
    public C22306c<VoiceLiveHeartBeatInfoMessage> m189063O0() {
        return this.f170351B0.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.cf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceLiveHeartBeatInfoMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: P */
    public C22306c<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage> m189064P() {
        return this.f170458i0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.gh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: P0 */
    public C22306c<VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage> m189065P0() {
        return this.f170363F0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ne1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Q */
    public C22306c<b6t> m189066Q() {
        return this.f170454h0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ig1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((b6t) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Q0 */
    public C22306c<VoiceLiveInfoMessage> m189067Q0() {
        return this.f170505v0.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.ei1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceLiveInfoMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: R */
    public C22306c<u5t> m189068R() {
        return this.f170442e0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.zg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((u5t) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: R0 */
    public C22306c<VoiceLiveManager.VoiceManagerUpdate> m189069R0() {
        return this.f170434c0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ve1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceLiveManager.VoiceManagerUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: S */
    public C22306c<OfficialShowMessage.OfficialShowJump> m189070S() {
        return this.f170358D1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.mh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((OfficialShowMessage.OfficialShowJump) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: S0 */
    public C22306c<LongLinkGiftMessage.LiveRankings> m189071S0() {
        return this.f170354C0.asObservable().onBackpressureLatest().filter(new uf1()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: T */
    public C22306c<OfficialShowMessage.OfficialShowUpdateStatus> m189072T() {
        return this.f170355C1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.si1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((OfficialShowMessage.OfficialShowUpdateStatus) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: T0 */
    public C22306c<LongLinkVirtualVoice.VoiceSettleMessage> m189073T0() {
        return this.f170514y0.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.pf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceSettleMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: U */
    public C22306c<LivePkMessage> m189074U() {
        return this.f170350B.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.ah1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LivePkMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: U0 */
    public C22306c<j5h0> m189075U0() {
        return this.f170373I1.asObservable().onBackpressureLatest().filter(new tg1()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: V */
    public C22306c<LongLinkLiveFanbaseMessage.RedPacketEvent> m189076V() {
        return this.f170359E.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ef1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveFanbaseMessage.RedPacketEvent) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: V0 */
    public C22306c<LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage> m189077V0() {
        return this.f170518z1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ci1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: W */
    public C22306c<LongLinkLiveMessage.GiftWallRefresh> m189078W() {
        return this.f170488p2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ri1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveMessage.GiftWallRefresh) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: W0 */
    public C22306c<LongLinkVirtualVoice.VoiceLiveTemplateMessage> m189079W0() {
        return this.f170459i1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.kg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: X */
    public C22306c<LongLinkReportMsg.LiveReportMsg> m189080X() {
        return this.f170395Q.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ph1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkReportMsg.LiveReportMsg) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: X0 */
    public C22306c<LongLinkVirtualVoice.VoiceRoomTitleUpdate> m189081X0() {
        return this.f170463j1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.df1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceRoomTitleUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Y */
    public C22306c<RewardPointMsg> m189082Y() {
        return this.f170368H.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.se1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((RewardPointMsg) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Y0 */
    public C22306c<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> m189083Y0() {
        return this.f170416X.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.xh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveMessage.VoiceRoomAnnouncementUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Z */
    public C22306c<LongLinkGiftMessage.LiveRankings> m189084Z() {
        return this.f170489q.asObservable().onBackpressureLatest().filter(new uf1()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Z0 */
    public C22306c<LongLinkVirtualVoice.VoiceChatTopicMessage> m189085Z0() {
        return this.f170467k1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.th1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceChatTopicMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: a */
    public C22306c<BLiveLuckyParadiseBottomEntrance> m189086a() {
        return this.f170370H1.asObservable().onBackpressureLatest().filter(new xe1()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: a0 */
    public C22306c<LiveSchemePopupMessage> m189087a0() {
        return this.f170386N.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.mi1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LiveSchemePopupMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: a1 */
    public C22306c<VoiceLiveManager.VoiceFreeCallUpdate> m189088a1() {
        return this.f170438d0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ih1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceLiveManager.VoiceFreeCallUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: b */
    public C22306c<BLiveLuckyParadiseBottomEntrance> m189089b() {
        return this.f170367G1.asObservable().onBackpressureLatest().filter(new xe1()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: b0 */
    public void m189090b0(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        this.f170507w.m132487l(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: b1 */
    public C22306c<LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate> m189091b1() {
        return this.f170376J1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ng1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: c */
    public C22306c<LongLinkSocketMessage.PopUp> m189092c() {
        return this.f170473m.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.lf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkSocketMessage.PopUp) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: c0 */
    public void m189093c0(if2 if2Var) {
        this.f170485p.m132487l(if2Var);
    }

    /* JADX INFO: renamed from: c1 */
    public C22306c<LongLinkLiveMessage.VoiceMemberUpdate> m189094c1() {
        return this.f170407U.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.hh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveMessage.VoiceMemberUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: d */
    public C22306c<BLiveHourLeaderBoardItem> m189095d() {
        return this.f170507w.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.sg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveHourLeaderBoardItem) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: d0 */
    public C22306c<BLiveGiftBubbleConfig> m189096d0() {
        return this.f170410V.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.kh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveGiftBubbleConfig) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: d1 */
    public C22306c<VoiceNineMicUserScore.VoiceLiveBossUserScore> m189097d1() {
        return this.f170475m1.asObservable().onBackpressureLatest().filter(new znm0()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: e */
    public C22306c<if2> m189098e() {
        return this.f170485p.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.rg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((if2) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: e0 */
    public void m189099e0(List<BLiveHourLeaderBoardItem> list) {
        this.f170429b.m132487l(list);
    }

    /* JADX INFO: renamed from: e1 */
    public C22306c<VoiceNewCampaignPopUp.VoiceLivePopUp> m189100e1() {
        return this.f170396Q0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.wg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceNewCampaignPopUp.VoiceLivePopUp) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: f */
    public C22306c<LiveCallMessage> m189101f() {
        return this.f170353C.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.jg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LiveCallMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: f0 */
    public void m189102f0(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f170433c.m132487l(bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: f1 */
    public C22306c<VoiceNewCampaign.VoiceLiveContentUpdateNotice> m189103f1() {
        return this.f170393P0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.mf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceNewCampaign.VoiceLiveContentUpdateNotice) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: g */
    public C22306c<LongLinkSocketMessage.PopUpContentUpdateNotice> m189104g() {
        return this.f170481o.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.nh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkSocketMessage.PopUpContentUpdateNotice) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: g0 */
    public void m189105g0(e8t e8tVar) {
        this.f170374J.m132487l(e8tVar);
    }

    /* JADX INFO: renamed from: g1 */
    public C22306c<LongLinkVirtualVoice.VoicePayGuideV2PopUp> m189106g1() {
        return this.f170397Q1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.qi1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoicePayGuideV2PopUp) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: h */
    public C22306c<LongLinkLiveDanmakuMessage.BulletCommentInfo> m189107h() {
        return this.f170392P.asObservable().onBackpressureBuffer(1000L).filter(new g2c()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: h0 */
    public void m189108h0(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        this.f170461j.m132487l(turboCardReceiveEvent);
    }

    /* JADX INFO: renamed from: h1 */
    public C22306c<LongLinkVirtualVoice.VoicePayGuidePopUp> m189109h1() {
        return this.f170388N1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.we1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoicePayGuidePopUp) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: i */
    public C22306c<LongLinkLiveDownBox.LiveAccessChannel> m189110i() {
        return this.f170504v.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.fi1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveDownBox.LiveAccessChannel) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: i0 */
    public void m189111i0(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate) {
        this.f170483o1.m132487l(voiceLiveAuctionUpdate);
    }

    /* JADX INFO: renamed from: i1 */
    public C22306c<LongLinkVirtualVoice.VoicePayGuideUser> m189112i1() {
        return this.f170400R1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ue1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoicePayGuideUser) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: j */
    public C22306c<LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo> m189113j() {
        return this.f170479n1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.xg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: j0 */
    public C22306c<LongLinkSocketMessage.TopEffect> m189114j0() {
        return this.f170469l.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.qg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkSocketMessage.TopEffect) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: j1 */
    public C22306c<VoiceLivePk.VoiceLivePkModify> m189115j1() {
        return this.f170476m2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.xf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceLivePk.VoiceLivePkModify) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: k */
    public C22306c<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> m189116k() {
        return this.f170380L.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.of1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLeaderboard.GiftStarLeaderboardChangeMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: k0 */
    public C22306c<LongLinkLiveMessage.VoiceRoomTopicUpdate> m189117k0() {
        return this.f170371I.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.gf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveMessage.VoiceRoomTopicUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: k1 */
    public C22306c<VoiceLivePk.VoiceLivePkPoint> m189118k1() {
        return this.f170480n2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.gg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceLivePk.VoiceLivePkPoint) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: l */
    public C22306c<BLiveVoiceGrabHatCP> m189119l() {
        return this.f170369H0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.zh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveVoiceGrabHatCP) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: l0 */
    public C22306c<VoiceUpdateUserMaskProto.UserMaskUpdate> m189120l0() {
        return this.f170466k0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.hf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceUpdateUserMaskProto.UserMaskUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: l1 */
    public C22306c<LongLinkVoicePublicLive.VoicePublicLive> m189121l1() {
        return this.f170462j0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.li1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVoicePublicLive.VoicePublicLive) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: m */
    public C22306c<BLiveVoiceGrabHatGame> m189122m() {
        return this.f170366G0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ji1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveVoiceGrabHatGame) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: m0 */
    public C22306c<LongLinkAdminMessage.UserWithBgColorSocketNotification> m189123m0() {
        return this.f170492r.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.bg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkAdminMessage.UserWithBgColorSocketNotification) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: m1 */
    public C22306c<LongLinkLiveMessage.VoiceLiveHighQualityTagMessage> m189124m1() {
        return this.f170478n0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.tf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveMessage.VoiceLiveHighQualityTagMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: n */
    public C22306c<LongLinkGiftMessage.LiveRanking> m189125n() {
        return this.f170510x.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.vf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkGiftMessage.LiveRanking) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: n0 */
    public C22306c<liveRight.UserLiveRightResources> m189126n0() {
        return this.f170398R.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.fg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((liveRight.UserLiveRightResources) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: n1 */
    public C22306c<LongLinkVirtualVoice.VoiceRoomCover> m189127n1() {
        return this.f170428a2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.wh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceRoomCover) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: o */
    public C22306c<List<BLiveHourLeaderBoardItem>> m189128o() {
        return this.f170429b.asObservable().onBackpressureLatest().filter(new u76()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: o0 */
    public C22306c<LongLinkVideoChat.LiveVideoChatAnchorCallResult> m189129o0() {
        return this.f170415W1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.bi1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVideoChat.LiveVideoChatAnchorCallResult) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: o1 */
    public C22306c<LongLinkVirtualVoice.VoiceRoomPersonalUpdate> m189130o1() {
        return this.f170471l1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.dg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceRoomPersonalUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: p */
    public C22306c<BLiveIntlGiftLeaderboard> m189131p() {
        return this.f170497s1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.og1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveIntlGiftLeaderboard) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: p0 */
    public C22306c<LongLinkVideoChat.LiveVideoChatBubble> m189132p0() {
        return this.f170421Y1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.rf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVideoChat.LiveVideoChatBubble) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: p1 */
    public C22306c<LongLinkVirtualVoice.VoiceStreamBizTypeMessage> m189133p1() {
        return this.f170494r1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.qe1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceStreamBizTypeMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: q */
    public C22306c<LongLinkIntlLightPushMessage.IntlLightPushInfo> m189134q() {
        return this.f170349A1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.vh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkIntlLightPushMessage.IntlLightPushInfo) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: q0 */
    public C22306c<LongLinkGiftMessage.VideoChatDuration> m189135q0() {
        return this.f170424Z1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.hi1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkGiftMessage.VideoChatDuration) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: q1 */
    public C22306c<VoiceSweet.VoiceCpBindMessage> m189136q1() {
        return this.f170381L0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ki1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceSweet.VoiceCpBindMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: r */
    public C22306c<vui0> m189137r() {
        return this.f170503u1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.nf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((vui0) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: r0 */
    public C22306c<LongLinkVideoChat.LiveVideoChatLiveChange> m189138r0() {
        return this.f170409U1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.lh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVideoChat.LiveVideoChatLiveChange) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: r1 */
    public C22306c<VoiceSweet.VoiceSweetCpEffect> m189139r1() {
        return this.f170382L1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.dh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceSweet.VoiceSweetCpEffect) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: s */
    public C22306c<LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg> m189140s() {
        return this.f170352B1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.yf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkIntlLightPushMessage.RefreshVoiceOperationMsg) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: s0 */
    public C22306c<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> m189141s0() {
        return this.f170436c2.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ye1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveMessage.RefreshVoiceRoomLeaderboard) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: s1 */
    public C22306c<VoiceSweet.VoiceCpHouseUpgradeMessage> m189142s1() {
        return this.f170384M0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.pi1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((VoiceSweet.VoiceCpHouseUpgradeMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: t */
    public C22306c<LongLinkLiveMessage.JailInRoom> m189143t() {
        return this.f170411V0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.ii1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveMessage.JailInRoom) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: t0 */
    public C22306c<LongLinkVirtualVoice.VoiceRoomLevelUp> m189144t0() {
        return this.f170423Z0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.bf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceRoomLevelUp) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: t1 */
    public C22306c<LongLinkLiveMessage.VoiceLiveTopEffectMessage> m189145t1() {
        return this.f170470l0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.cg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveMessage.VoiceLiveTopEffectMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: u */
    public C22306c<LongLinkSocketMessage.LiveAnimationPlayMsg> m189146u() {
        return this.f170362F.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.qf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkSocketMessage.LiveAnimationPlayMsg) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: u0 */
    public C22306c<LongLinkVirtualVoice.StarRedpacketInfo> m189147u0() {
        return this.f170427a1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.oe1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.StarRedpacketInfo) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: u1 */
    public C22306c<LongLinkLiveMessage.VoiceSettleGuideMessage> m189148u1() {
        return this.f170491q1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.re1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkLiveMessage.VoiceSettleGuideMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: v */
    public C22306c<LongLinkBottomMenu.LiveBottomMenuUpdate> m189149v() {
        return this.f170408U0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.rh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkBottomMenu.LiveBottomMenuUpdate) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: v0 */
    public C22306c<a1v> m189150v0() {
        return this.f170372I0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.yh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((a1v) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: v1 */
    public C22306c<LongLinkVirtualVoice.VoiceUserGuide> m189151v1() {
        return this.f170495s.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.yg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceUserGuide) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: w */
    public C22306c<List<LongLinkGiftMessage.LiveCampaignInfo>> m189152w() {
        return this.f170477n.asObservable().onBackpressureLatest().filter(new u76()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: w0 */
    public C22306c<LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp> m189153w0() {
        return this.f170391O1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.pe1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: x */
    public C22306c<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> m189154x() {
        return this.f170402S0.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.uh1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: x0 */
    public C22306c<cmn0> m189155x0() {
        return this.f170356D.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.mg1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((cmn0) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: y */
    public C22306c<LiveControlMessage> m189156y() {
        return this.f170425a.asObservable().onBackpressureBuffer(20000L).filter(new w9j() { // from class: l.ze1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LiveControlMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: y0 */
    public C22306c<VoiceFunnyAvatar.VoiceLivePhotoSticker> m189157y0() {
        return this.f170431b1.asObservable().onBackpressureLatest().filter(new lgo0()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: z */
    public C22306c<BLiveEnterRoom> m189158z() {
        return this.f170445f.asObservable().onBackpressureBuffer(100L).filter(new w9j() { // from class: l.ff1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveEnterRoom) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: z0 */
    public C22306c<LongLinkVirtualVoice.VoiceSettleInviteMessage> m189159z0() {
        return this.f170500t1.asObservable().onBackpressureLatest().filter(new w9j() { // from class: l.kf1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((LongLinkVirtualVoice.VoiceSettleInviteMessage) obj));
            }
        }).observeOn(jo0.m142408a());
    }
}
