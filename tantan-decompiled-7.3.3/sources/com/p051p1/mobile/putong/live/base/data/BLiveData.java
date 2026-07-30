package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.putong.data.Connector;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.data.VoiceLiveGame;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.ActivitySuggests;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLiveAdvanceTask;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionRelationCard;
import com.p051p1.mobile.putong.live.base.data.BLiveBoardHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.base.data.BLiveCallInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveCallSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p051p1.mobile.putong.live.base.data.BLiveClarity;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveComplexCard;
import com.p051p1.mobile.putong.live.base.data.BLiveDailyTasks;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoomEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveFakeUserProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseRelationShip;
import com.p051p1.mobile.putong.live.base.data.BLiveFeedSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftShowcaseItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardAnchorRankInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMlnMedia;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveKnightsInfosSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveKnightsRuleInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p051p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallExtend;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p051p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p051p1.mobile.putong.live.base.data.BLivePkSeek;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import com.p051p1.mobile.putong.live.base.data.BLivePkSummary;
import com.p051p1.mobile.putong.live.base.data.BLivePush;
import com.p051p1.mobile.putong.live.base.data.BLiveRightAnchorInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapTabData;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveSignPrizes;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareDetailCounters;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveStarlightHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveTask;
import com.p051p1.mobile.putong.live.base.data.BLiveTeenagerLive;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p051p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p051p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveUserPrivacyPrivilege;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserRightResource;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.base.data.BLiveVirtualVoiceCard;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenu;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardEntranceItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLiveUserFeedList;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMutexMode;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomClass;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceShareItems;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceStarRedPacket;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetLimitHouse;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserFeedInfos;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p051p1.mobile.putong.live.base.data.LiveMultiCallLiveSchema;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;
import org.apache.commons.sudcompress.archivers.zip.X5455_ExtendedTimestamp;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveData newInstance() {
            return new BLiveData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveData bLiveData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2132447057:
                    if (str.equals("equippedGift")) {
                        b = 0;
                    }
                    break;
                case -2100611621:
                    if (str.equals("grabRedPacketInfo")) {
                        b = 1;
                    }
                    break;
                case -2068400244:
                    if (str.equals("cpInviteRecords")) {
                        b = 2;
                    }
                    break;
                case -2058282289:
                    if (str.equals("voiceUserMessageRemind")) {
                        b = 3;
                    }
                    break;
                case -2053169850:
                    if (str.equals("officialShowList")) {
                        b = 4;
                    }
                    break;
                case -2052892557:
                    if (str.equals("officialShowUser")) {
                        b = 5;
                    }
                    break;
                case -2050303534:
                    if (str.equals("liveAnchors")) {
                        b = 6;
                    }
                    break;
                case -2045031828:
                    if (str.equals("voiceGiftWall")) {
                        b = 7;
                    }
                    break;
                case -2028139618:
                    if (str.equals("userWeekLeaderboard")) {
                        b = 8;
                    }
                    break;
                case -2024056032:
                    if (str.equals("userDailyTasks")) {
                        b = 9;
                    }
                    break;
                case -1980494804:
                    if (str.equals("canJoinGame")) {
                        b = 10;
                    }
                    break;
                case -1965070063:
                    if (str.equals("nobleNiceNumberDetail")) {
                        b = 11;
                    }
                    break;
                case -1938760423:
                    if (str.equals("userPushSwitch")) {
                        b = 12;
                    }
                    break;
                case -1907451825:
                    if (str.equals("voiceMedalWall")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1903074447:
                    if (str.equals("voicePayGuideUser")) {
                        b = 14;
                    }
                    break;
                case -1899045989:
                    if (str.equals("chatSettings")) {
                        b = 15;
                    }
                    break;
                case -1864882631:
                    if (str.equals("voiceRoomClasses")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -1839251138:
                    if (str.equals("fanbaseDetails")) {
                        b = 17;
                    }
                    break;
                case -1834241148:
                    if (str.equals("intlMedalWall")) {
                        b = 18;
                    }
                    break;
                case -1821289233:
                    if (str.equals("starlightHierarchies")) {
                        b = 19;
                    }
                    break;
                case -1818237504:
                    if (str.equals("flameCoinMarket")) {
                        b = 20;
                    }
                    break;
                case -1808286943:
                    if (str.equals("shareItems")) {
                        b = 21;
                    }
                    break;
                case -1774954263:
                    if (str.equals("liveActivitySummaries")) {
                        b = 22;
                    }
                    break;
                case -1762071343:
                    if (str.equals("fanbaseMedalPanel")) {
                        b = 23;
                    }
                    break;
                case -1751964641:
                    if (str.equals("guardAnchorRankInfos")) {
                        b = 24;
                    }
                    break;
                case -1733198406:
                    if (str.equals("voiceCallInvites")) {
                        b = 25;
                    }
                    break;
                case -1691033800:
                    if (str.equals("liveSummaries")) {
                        b = 26;
                    }
                    break;
                case -1682762198:
                    if (str.equals("bottomMenu")) {
                        b = 27;
                    }
                    break;
                case -1665053676:
                    if (str.equals("voiceFollowships")) {
                        b = 28;
                    }
                    break;
                case -1660624289:
                    if (str.equals("voiceLiveBulletComment")) {
                        b = 29;
                    }
                    break;
                case -1656424213:
                    if (str.equals("userLiveHierarchyProgress")) {
                        b = 30;
                    }
                    break;
                case -1650805603:
                    if (str.equals("liveRoomInProfile")) {
                        b = 31;
                    }
                    break;
                case -1646875697:
                    if (str.equals("weekCpInfo")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case -1641938590:
                    if (str.equals("multiCallExtends")) {
                        b = 33;
                    }
                    break;
                case -1641417307:
                    if (str.equals("rightBindAnchors")) {
                        b = 34;
                    }
                    break;
                case -1622861169:
                    if (str.equals("fanbaseHierarchies")) {
                        b = 35;
                    }
                    break;
                case -1590280234:
                    if (str.equals("pkSuggestedAnchors")) {
                        b = 36;
                    }
                    break;
                case -1560928723:
                    if (str.equals("siteWideBroadcastFinder")) {
                        b = 37;
                    }
                    break;
                case -1547082335:
                    if (str.equals("menuItems")) {
                        b = 38;
                    }
                    break;
                case -1542156837:
                    if (str.equals("liveOperation")) {
                        b = 39;
                    }
                    break;
                case -1541279805:
                    if (str.equals("voiceCalls")) {
                        b = 40;
                    }
                    break;
                case -1532720395:
                    if (str.equals("voiceLives")) {
                        b = 41;
                    }
                    break;
                case -1527007002:
                    if (str.equals("voiceRooms")) {
                        b = 42;
                    }
                    break;
                case -1477752918:
                    if (str.equals(VirtualVoiceMotionType.lovePlanet)) {
                        b = 43;
                    }
                    break;
                case -1476890248:
                    if (str.equals("voiceLivePush")) {
                        b = 44;
                    }
                    break;
                case -1441517551:
                    if (str.equals("liveQuitPopup")) {
                        b = 45;
                    }
                    break;
                case -1413833504:
                    if (str.equals("familyMedals")) {
                        b = 46;
                    }
                    break;
                case -1404871417:
                    if (str.equals("knightsInfosSummary")) {
                        b = 47;
                    }
                    break;
                case -1389350756:
                    if (str.equals("treasureBox")) {
                        b = 48;
                    }
                    break;
                case -1363136798:
                    if (str.equals("redPacketGrabResult")) {
                        b = 49;
                    }
                    break;
                case -1348630378:
                    if (str.equals("leaderboards")) {
                        b = 50;
                    }
                    break;
                case -1326165536:
                    if (str.equals("fanbaseMedals")) {
                        b = 51;
                    }
                    break;
                case -1314281181:
                    if (str.equals("voiceKTVSongs")) {
                        b = 52;
                    }
                    break;
                case -1312179162:
                    if (str.equals("voiceGiftWallBookDetail")) {
                        b = 53;
                    }
                    break;
                case -1297592653:
                    if (str.equals("anchorCall")) {
                        b = 54;
                    }
                    break;
                case -1289693139:
                    if (str.equals("voiceKTVGame")) {
                        b = 55;
                    }
                    break;
                case -1281860764:
                    if (str.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY)) {
                        b = 56;
                    }
                    break;
                case -1275936761:
                    if (str.equals("memberActivityList")) {
                        b = 57;
                    }
                    break;
                case -1273784917:
                    if (str.equals("previews")) {
                        b = HttpTokens.COLON;
                    }
                    break;
                case -1260477289:
                    if (str.equals("virtualVoiceCard")) {
                        b = HttpTokens.SEMI_COLON;
                    }
                    break;
                case -1250007754:
                    if (str.equals("stormComment")) {
                        b = 60;
                    }
                    break;
                case -1232584676:
                    if (str.equals("turboCardInfo")) {
                        b = 61;
                    }
                    break;
                case -1218014994:
                    if (str.equals("bossGiftRecord")) {
                        b = 62;
                    }
                    break;
                case -1213834257:
                    if (str.equals("voiceManagerInvites")) {
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case -1208966907:
                    if (str.equals("voiceUserProfileConfigs")) {
                        b = 64;
                    }
                    break;
                case -1187654891:
                    if (str.equals("auctionPlatformLeaderboardInfo")) {
                        b = 65;
                    }
                    break;
                case -1183049579:
                    if (str.equals("fanbaseRecall")) {
                        b = 66;
                    }
                    break;
                case -1167409869:
                    if (str.equals("squareEntranceSummary")) {
                        b = 67;
                    }
                    break;
                case -1148164909:
                    if (str.equals("voiceUserGiftItems")) {
                        b = 68;
                    }
                    break;
                case -1086876724:
                    if (str.equals("slotInfo")) {
                        b = 69;
                    }
                    break;
                case -1086328493:
                    if (str.equals("voiceUserLeaderboards")) {
                        b = 70;
                    }
                    break;
                case -1078183482:
                    if (str.equals("startLivePageCampaigns")) {
                        b = 71;
                    }
                    break;
                case -1078038436:
                    if (str.equals("medals")) {
                        b = 72;
                    }
                    break;
                case -1075286714:
                    if (str.equals("accompanyTaskSummary")) {
                        b = 73;
                    }
                    break;
                case -1069661294:
                    if (str.equals("voiceSquareButtons")) {
                        b = 74;
                    }
                    break;
                case -1058525402:
                    if (str.equals("voiceLiveSummaries")) {
                        b = 75;
                    }
                    break;
                case -1053298508:
                    if (str.equals("superUserBirthdayDetail")) {
                        b = 76;
                    }
                    break;
                case -1048701848:
                    if (str.equals("touchMeDetail")) {
                        b = 77;
                    }
                    break;
                case -1037096238:
                    if (str.equals("voiceFanbase")) {
                        b = 78;
                    }
                    break;
                case -1021571527:
                    if (str.equals("auctionCounter")) {
                        b = 79;
                    }
                    break;
                case -1019043888:
                    if (str.equals("voiceTabs")) {
                        b = 80;
                    }
                    break;
                case -1017848833:
                    if (str.equals("intlConfig")) {
                        b = 81;
                    }
                    break;
                case -989581415:
                    if (str.equals("videoChatAttendeeCallInfo")) {
                        b = 82;
                    }
                    break;
                case -986992631:
                    if (str.equals("liveClarityLevelInfos")) {
                        b = 83;
                    }
                    break;
                case -979613803:
                    if (str.equals("voiceCpLeaderBoards")) {
                        b = 84;
                    }
                    break;
                case -950842941:
                    if (str.equals("voiceFanbaseDetail")) {
                        b = 85;
                    }
                    break;
                case -945875574:
                    if (str.equals("anchorDailyTasks")) {
                        b = 86;
                    }
                    break;
                case -945232938:
                    if (str.equals("videoChatAssets")) {
                        b = 87;
                    }
                    break;
                case -931102249:
                    if (str.equals("rights")) {
                        b = 88;
                    }
                    break;
                case -930729054:
                    if (str.equals("videoQualities")) {
                        b = 89;
                    }
                    break;
                case -926971934:
                    if (str.equals("liveStickers")) {
                        b = 90;
                    }
                    break;
                case -907987551:
                    if (str.equals("schema")) {
                        b = 91;
                    }
                    break;
                case -892963175:
                    if (str.equals("liveResources")) {
                        b = 92;
                    }
                    break;
                case -868034268:
                    if (str.equals("topics")) {
                        b = 93;
                    }
                    break;
                case -864480612:
                    if (str.equals("anchorHierarchyGrades")) {
                        b = 94;
                    }
                    break;
                case -862612386:
                    if (str.equals("anchors")) {
                        b = 95;
                    }
                    break;
                case -855543815:
                    if (str.equals("randomMatchCouponDetail")) {
                        b = 96;
                    }
                    break;
                case -851412221:
                    if (str.equals("knightsRuleInfos")) {
                        b = 97;
                    }
                    break;
                case -849243103:
                    if (str.equals("gameInfoResponse")) {
                        b = 98;
                    }
                    break;
                case -834775917:
                    if (str.equals("livePopUpGuild")) {
                        b = 99;
                    }
                    break;
                case -810601071:
                    if (str.equals("heatBoxEntrance")) {
                        b = 100;
                    }
                    break;
                case -808579477:
                    if (str.equals("sparkletProgress")) {
                        b = 101;
                    }
                    break;
                case -766939237:
                    if (str.equals("liveSquareSummaries")) {
                        b = 102;
                    }
                    break;
                case -761764407:
                    if (str.equals("multiPkLeaderboard")) {
                        b = 103;
                    }
                    break;
                case -753584662:
                    if (str.equals("liveBeautyConfig")) {
                        b = 104;
                    }
                    break;
                case -743724459:
                    if (str.equals("gameOperationPositions")) {
                        b = 105;
                    }
                    break;
                case -739265409:
                    if (str.equals("isAnchor")) {
                        b = 106;
                    }
                    break;
                case -739091396:
                    if (str.equals("fanbaseRedPacketEventCounters")) {
                        b = 107;
                    }
                    break;
                case -727516792:
                    if (str.equals("anchorLeaderboard")) {
                        b = 108;
                    }
                    break;
                case -716885666:
                    if (str.equals("nobleNiceNumberList")) {
                        b = 109;
                    }
                    break;
                case -694042592:
                    if (str.equals("signInDetails")) {
                        b = 110;
                    }
                    break;
                case -693657138:
                    if (str.equals("voiceFanbaseMedals")) {
                        b = 111;
                    }
                    break;
                case -673881917:
                    if (str.equals("giftShowcaseItems")) {
                        b = 112;
                    }
                    break;
                case -669018618:
                    if (str.equals("callSummaries")) {
                        b = 113;
                    }
                    break;
                case -629259837:
                    if (str.equals("voiceRoomAsset")) {
                        b = 114;
                    }
                    break;
                case -625072792:
                    if (str.equals("voiceRoomFeeds")) {
                        b = 115;
                    }
                    break;
                case -604359071:
                    if (str.equals("multiCallSwitchToLeadRoleInvite")) {
                        b = 116;
                    }
                    break;
                case -586923271:
                    if (str.equals("hourLeaderboard")) {
                        b = 117;
                    }
                    break;
                case -579210163:
                    if (str.equals(Connector.TYPE)) {
                        b = 118;
                    }
                    break;
                case -576546424:
                    if (str.equals("voiceRoomLevelDetail")) {
                        b = 119;
                    }
                    break;
                case -573516673:
                    if (str.equals("exchangeTTCRedpoint")) {
                        b = 120;
                    }
                    break;
                case -535722048:
                    if (str.equals("pkSeeks")) {
                        b = 121;
                    }
                    break;
                case -520489196:
                    if (str.equals("dragonScourgeDisplayChatMessage")) {
                        b = 122;
                    }
                    break;
                case -509468759:
                    if (str.equals("voiceLiveBanners")) {
                        b = 123;
                    }
                    break;
                case -494686986:
                    if (str.equals("missedCallCount")) {
                        b = 124;
                    }
                    break;
                case -480168839:
                    if (str.equals("chatTopicAsset")) {
                        b = 125;
                    }
                    break;
                case -474072093:
                    if (str.equals("chatMsgLiveInfo")) {
                        b = 126;
                    }
                    break;
                case -451456433:
                    if (str.equals("videoChatRandomMatch")) {
                        b = 127;
                    }
                    break;
                case -429432624:
                    if (str.equals("accompanyUserRanking")) {
                        b = 128;
                    }
                    break;
                case -410678392:
                    if (str.equals("liveStickerTemplates")) {
                        b = 129;
                    }
                    break;
                case -390315597:
                    if (str.equals("videoChatSummary")) {
                        b = 130;
                    }
                    break;
                case -337258316:
                    if (str.equals("scoreSummary")) {
                        b = 131;
                    }
                    break;
                case -323369485:
                    if (str.equals("fanbaseRelations")) {
                        b = 132;
                    }
                    break;
                case -281176647:
                    if (str.equals("voiceRoomSummary")) {
                        b = 133;
                    }
                    break;
                case -217988131:
                    if (str.equals("guardRecords")) {
                        b = 134;
                    }
                    break;
                case -154660581:
                    if (str.equals("voicePkInfo")) {
                        b = 135;
                    }
                    break;
                case -114314814:
                    if (str.equals("roomAnnouncement")) {
                        b = 136;
                    }
                    break;
                case -95531538:
                    if (str.equals("voiceLiveAuctions")) {
                        b = 137;
                    }
                    break;
                case -36510220:
                    if (str.equals("voiceCallSummaries")) {
                        b = 138;
                    }
                    break;
                case -19371321:
                    if (str.equals("auctionInvites")) {
                        b = 139;
                    }
                    break;
                case -8342175:
                    if (str.equals("mysteryConfig")) {
                        b = 140;
                    }
                    break;
                case -8295694:
                    if (str.equals("giftDetails")) {
                        b = 141;
                    }
                    break;
                case 111064:
                    if (str.equals("pks")) {
                        b = 142;
                    }
                    break;
                case 3059181:
                    if (str.equals("code")) {
                        b = 143;
                    }
                    break;
                case 3165170:
                    if (str.equals("game")) {
                        b = 144;
                    }
                    break;
                case 19963631:
                    if (str.equals("scrapTabs")) {
                        b = 145;
                    }
                    break;
                case 27142523:
                    if (str.equals("voiceRoomTagInfo")) {
                        b = 146;
                    }
                    break;
                case 30390881:
                    if (str.equals("taskSummary")) {
                        b = 147;
                    }
                    break;
                case 34334860:
                    if (str.equals("advancedTasks")) {
                        b = 148;
                    }
                    break;
                case 54700767:
                    if (str.equals("voiceCpHouseTaskInfos")) {
                        b = 149;
                    }
                    break;
                case 70501726:
                    if (str.equals("pkAssets")) {
                        b = 150;
                    }
                    break;
                case 94425557:
                    if (str.equals("calls")) {
                        b = 151;
                    }
                    break;
                case 94544721:
                    if (str.equals("cells")) {
                        b = 152;
                    }
                    break;
                case 98705061:
                    if (str.equals(BLiveTraceServerBiz.guard)) {
                        b = 153;
                    }
                    break;
                case 102984967:
                    if (str.equals("lives")) {
                        b = 154;
                    }
                    break;
                case 103667463:
                    if (str.equals("masks")) {
                        b = 155;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        b = 156;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        b = 157;
                    }
                    break;
                case 108698360:
                    if (str.equals("rooms")) {
                        b = 158;
                    }
                    break;
                case 109496982:
                    if (str.equals("skins")) {
                        b = 159;
                    }
                    break;
                case 110132110:
                    if (str.equals("tasks")) {
                        b = 160;
                    }
                    break;
                case 111578632:
                    if (str.equals("users")) {
                        b = 161;
                    }
                    break;
                case 119348723:
                    if (str.equals("auctionCandidates")) {
                        b = 162;
                    }
                    break;
                case 123266662:
                    if (str.equals("managers")) {
                        b = 163;
                    }
                    break;
                case 133144802:
                    if (str.equals("gamePanelMenus")) {
                        b = 164;
                    }
                    break;
                case 150307650:
                    if (str.equals("complexCardConfig")) {
                        b = 165;
                    }
                    break;
                case 160801328:
                    if (str.equals("voiceHouseRankUpgradeInfo")) {
                        b = 166;
                    }
                    break;
                case 166729616:
                    if (str.equals("octopusUrl")) {
                        b = 167;
                    }
                    break;
                case 208627378:
                    if (str.equals("userLeaderboard")) {
                        b = 168;
                    }
                    break;
                case 216430150:
                    if (str.equals("userCompliance")) {
                        b = 169;
                    }
                    break;
                case 220037099:
                    if (str.equals("monetizationConfig")) {
                        b = 170;
                    }
                    break;
                case 233755850:
                    if (str.equals("fakeUserProfiles")) {
                        b = 171;
                    }
                    break;
                case 260201536:
                    if (str.equals("userProfileConfig")) {
                        b = 172;
                    }
                    break;
                case 275628809:
                    if (str.equals("pkSummaries")) {
                        b = 173;
                    }
                    break;
                case 309630629:
                    if (str.equals("bigTVLives")) {
                        b = 174;
                    }
                    break;
                case 315535356:
                    if (str.equals("voiceWeekLeaderboards")) {
                        b = 175;
                    }
                    break;
                case 318842679:
                    if (str.equals("giftSkinPanel")) {
                        b = 176;
                    }
                    break;
                case 340625974:
                    if (str.equals("videoLiveBulletComment")) {
                        b = 177;
                    }
                    break;
                case 345722788:
                    if (str.equals("suggestedLives")) {
                        b = 178;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 179;
                    }
                    break;
                case 353483114:
                    if (str.equals("anchorGuildCheck")) {
                        b = 180;
                    }
                    break;
                case 354594703:
                    if (str.equals("liveAssets")) {
                        b = 181;
                    }
                    break;
                case 366214216:
                    if (str.equals("anchorFanbaseMedal")) {
                        b = 182;
                    }
                    break;
                case 418647264:
                    if (str.equals("giftSetInfo")) {
                        b = 183;
                    }
                    break;
                case 422025114:
                    if (str.equals("userEnterRoomEffects")) {
                        b = 184;
                    }
                    break;
                case 427579690:
                    if (str.equals("voiceGiftWallList")) {
                        b = 185;
                    }
                    break;
                case 435445685:
                    if (str.equals("liveRoomTabGifts")) {
                        b = 186;
                    }
                    break;
                case 472535355:
                    if (str.equals("relationships")) {
                        b = 187;
                    }
                    break;
                case 476732555:
                    if (str.equals("leaderboardUsers")) {
                        b = PSSSigner.TRAILER_IMPLICIT;
                    }
                    break;
                case 476781769:
                    if (str.equals("signInAchievementMedals")) {
                        b = 189;
                    }
                    break;
                case 550159562:
                    if (str.equals("giftItemCDN")) {
                        b = 190;
                    }
                    break;
                case 555392015:
                    if (str.equals("pkInvites")) {
                        b = 191;
                    }
                    break;
                case 560346779:
                    if (str.equals("liveStickerTemplatesGifts")) {
                        b = 192;
                    }
                    break;
                case 565268226:
                    if (str.equals("intlVoiceLiveCampaigns")) {
                        b = 193;
                    }
                    break;
                case 590356315:
                    if (str.equals("rtcTokens")) {
                        b = 194;
                    }
                    break;
                case 637120836:
                    if (str.equals("auctionRelationCards")) {
                        b = 195;
                    }
                    break;
                case 642678323:
                    if (str.equals("accompanyTasks")) {
                        b = 196;
                    }
                    break;
                case 649646865:
                    if (str.equals("userLivePush")) {
                        b = 197;
                    }
                    break;
                case 690573470:
                    if (str.equals("userLiveHierarchy")) {
                        b = 198;
                    }
                    break;
                case 725779648:
                    if (str.equals("fakeUser")) {
                        b = 199;
                    }
                    break;
                case 729465958:
                    if (str.equals("liveSchemas")) {
                        b = 200;
                    }
                    break;
                case 758305960:
                    if (str.equals("firstRechargeDetail")) {
                        b = 201;
                    }
                    break;
                case 761551572:
                    if (str.equals("liveResourcesCDN")) {
                        b = 202;
                    }
                    break;
                case 785881428:
                    if (str.equals("livePushes")) {
                        b = 203;
                    }
                    break;
                case 799321409:
                    if (str.equals("grabHatGame")) {
                        b = 204;
                    }
                    break;
                case 809254031:
                    if (str.equals("fanbases")) {
                        b = 205;
                    }
                    break;
                case 849333154:
                    if (str.equals("giftStar")) {
                        b = 206;
                    }
                    break;
                case 866986330:
                    if (str.equals("voiceLiveBulletCommentTypes")) {
                        b = 207;
                    }
                    break;
                case 928417474:
                    if (str.equals("liveMedalCDN")) {
                        b = 208;
                    }
                    break;
                case 932234986:
                    if (str.equals("voiceUserFeedInfos")) {
                        b = 209;
                    }
                    break;
                case 948881689:
                    if (str.equals("members")) {
                        b = 210;
                    }
                    break;
                case 954732880:
                    if (str.equals("giftWallV3Briefs")) {
                        b = 211;
                    }
                    break;
                case 973428254:
                    if (str.equals("gameAsset")) {
                        b = 212;
                    }
                    break;
                case 998890772:
                    if (str.equals("modelDescribe")) {
                        b = 213;
                    }
                    break;
                case 1024144516:
                    if (str.equals("voiceLivePopsTotal")) {
                        b = 214;
                    }
                    break;
                case 1025950012:
                    if (str.equals("shareRoomConfig")) {
                        b = 215;
                    }
                    break;
                case 1047583191:
                    if (str.equals("liveCampaigns")) {
                        b = 216;
                    }
                    break;
                case 1053167493:
                    if (str.equals("liveHierarchyGrades")) {
                        b = 217;
                    }
                    break;
                case 1065981794:
                    if (str.equals("needTitle")) {
                        b = 218;
                    }
                    break;
                case 1082596930:
                    if (str.equals("records")) {
                        b = 219;
                    }
                    break;
                case 1101538212:
                    if (str.equals("superChatDetail")) {
                        b = 220;
                    }
                    break;
                case 1117706549:
                    if (str.equals("voiceAdminPanelCounter")) {
                        b = 221;
                    }
                    break;
                case 1133103200:
                    if (str.equals("luckyParadiseBottomEntrance")) {
                        b = 222;
                    }
                    break;
                case 1136044435:
                    if (str.equals("hierarchies")) {
                        b = 223;
                    }
                    break;
                case 1170283007:
                    if (str.equals("videoChatLive")) {
                        b = 224;
                    }
                    break;
                case 1182320578:
                    if (str.equals("mutexMode")) {
                        b = 225;
                    }
                    break;
                case 1197441209:
                    if (str.equals("userKnightInfosSummary")) {
                        b = 226;
                    }
                    break;
                case 1201048649:
                    if (str.equals("firstRechargeStatus")) {
                        b = 227;
                    }
                    break;
                case 1203843852:
                    if (str.equals("starRedPackets")) {
                        b = 228;
                    }
                    break;
                case 1208420900:
                    if (str.equals("funFairBottomEntrance")) {
                        b = 229;
                    }
                    break;
                case 1221125285:
                    if (str.equals("voiceLiveUserFeedList")) {
                        b = 230;
                    }
                    break;
                case 1223190556:
                    if (str.equals("multiCalls")) {
                        b = 231;
                    }
                    break;
                case 1228205496:
                    if (str.equals("verifications")) {
                        b = 232;
                    }
                    break;
                case 1242021126:
                    if (str.equals("pkItemCardsDetail")) {
                        b = 233;
                    }
                    break;
                case 1253880595:
                    if (str.equals("givenGiftRes")) {
                        b = 234;
                    }
                    break;
                case 1299473913:
                    if (str.equals("multiCallAsset")) {
                        b = 235;
                    }
                    break;
                case 1303119917:
                    if (str.equals("giftLeaderboard")) {
                        b = 236;
                    }
                    break;
                case 1332261022:
                    if (str.equals("complexCardList")) {
                        b = 237;
                    }
                    break;
                case 1332438643:
                    if (str.equals("videoChat")) {
                        b = 238;
                    }
                    break;
                case 1342202051:
                    if (str.equals("memberLbs")) {
                        b = 239;
                    }
                    break;
                case 1356199171:
                    if (str.equals("anchorKnightInfos")) {
                        b = 240;
                    }
                    break;
                case 1382433596:
                    if (str.equals("voiceGiftWallBriefInfo")) {
                        b = 241;
                    }
                    break;
                case 1406563604:
                    if (str.equals("multiPk")) {
                        b = 242;
                    }
                    break;
                case 1437396656:
                    if (str.equals("chatTips")) {
                        b = 243;
                    }
                    break;
                case 1452129315:
                    if (str.equals("voiceLiveGames")) {
                        b = 244;
                    }
                    break;
                case 1455909897:
                    if (str.equals("privacyPrivilege")) {
                        b = 245;
                    }
                    break;
                case 1482199545:
                    if (str.equals("liveActivities")) {
                        b = 246;
                    }
                    break;
                case 1485068702:
                    if (str.equals("activitySuggests")) {
                        b = 247;
                    }
                    break;
                case 1489188256:
                    if (str.equals("voiceLiveUserHeartbeatRewardList")) {
                        b = 248;
                    }
                    break;
                case 1489532477:
                    if (str.equals("myJoins")) {
                        b = 249;
                    }
                    break;
                case 1506515225:
                    if (str.equals("emojiPlayMenu")) {
                        b = 250;
                    }
                    break;
                case 1522329801:
                    if (str.equals("auctionApplies")) {
                        b = 251;
                    }
                    break;
                case 1523767736:
                    if (str.equals("voiceManagers")) {
                        b = 252;
                    }
                    break;
                case 1526657854:
                    if (str.equals("intlLiveFramesMetadata")) {
                        b = 253;
                    }
                    break;
                case 1544251121:
                    if (str.equals("voiceLivesSummary")) {
                        b = 254;
                    }
                    break;
                case 1546586700:
                    if (str.equals("callInvites")) {
                        b = 255;
                    }
                    break;
                case 1575017269:
                    if (str.equals("userRealVoiceLive")) {
                        b = 256;
                    }
                    break;
                case 1593115237:
                    if (str.equals("voiceLivePopUpGuild")) {
                        b = X5455_ExtendedTimestamp.MODIFY_TIME_BIT;
                    }
                    break;
                case 1604875188:
                    if (str.equals("officialShowCurrentAnchorInfo")) {
                        b = X5455_ExtendedTimestamp.ACCESS_TIME_BIT;
                    }
                    break;
                case 1609801911:
                    if (str.equals(VirtualVoiceMotionType.chatTopic)) {
                        b = 259;
                    }
                    break;
                case 1610469268:
                    if (str.equals("givenGiftRemindConfig")) {
                        b = 260;
                    }
                    break;
                case 1614731430:
                    if (str.equals("followships")) {
                        b = 261;
                    }
                    break;
                case 1623756627:
                    if (str.equals("multiCallInvites")) {
                        b = 262;
                    }
                    break;
                case 1644241872:
                    if (str.equals("liveChatMessages")) {
                        b = 263;
                    }
                    break;
                case 1671401684:
                    if (str.equals("bagpackItem")) {
                        b = 264;
                    }
                    break;
                case 1672392286:
                    if (str.equals("chestRewardInfo")) {
                        b = HttpTokens.TAB;
                    }
                    break;
                case 1713324399:
                    if (str.equals("voiceCpHouseInfo")) {
                        b = HttpTokens.LINE_FEED;
                    }
                    break;
                case 1713409375:
                    if (str.equals("voiceCpHouseList")) {
                        b = 267;
                    }
                    break;
                case 1729999110:
                    if (str.equals("liveTopChatMessage")) {
                        b = 268;
                    }
                    break;
                case 1739008466:
                    if (str.equals("voiceLeaderboardEntrances")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1747804887:
                    if (str.equals("liveStickerTemplatesMetadata")) {
                        b = 270;
                    }
                    break;
                case 1751546327:
                    if (str.equals("voiceChatGroupApplies")) {
                        b = 271;
                    }
                    break;
                case 1773955066:
                    if (str.equals("missedCalls")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1777053837:
                    if (str.equals("accompanyTaskProgress")) {
                        b = 273;
                    }
                    break;
                case 1794052811:
                    if (str.equals("voiceLiveAuctionAsset")) {
                        b = 274;
                    }
                    break;
                case 1808429410:
                    if (str.equals("momentConfig")) {
                        b = 275;
                    }
                    break;
                case 1826896503:
                    if (str.equals("grabHatCps")) {
                        b = 276;
                    }
                    break;
                case 1856883971:
                    if (str.equals("signInPrizes")) {
                        b = 277;
                    }
                    break;
                case 1859490364:
                    if (str.equals("multiPkAsset")) {
                        b = 278;
                    }
                    break;
                case 1860777355:
                    if (str.equals("voiceFanbaseLbs")) {
                        b = 279;
                    }
                    break;
                case 1862702752:
                    if (str.equals("userLiveRightResources")) {
                        b = 280;
                    }
                    break;
                case 1865165240:
                    if (str.equals("storeBackgroundPics")) {
                        b = 281;
                    }
                    break;
                case 1872802128:
                    if (str.equals("multiPkPanel")) {
                        b = 282;
                    }
                    break;
                case 1904460762:
                    if (str.equals("teenagerLives")) {
                        b = 283;
                    }
                    break;
                case 1905709027:
                    if (str.equals("videoLiveBulletCommentTypes")) {
                        b = 284;
                    }
                    break;
                case 1911167039:
                    if (str.equals("firstChargeCampaigns")) {
                        b = 285;
                    }
                    break;
                case 1911363108:
                    if (str.equals("voiceLiveAssert")) {
                        b = 286;
                    }
                    break;
                case 1911455437:
                    if (str.equals("voiceLiveActivityMoment")) {
                        b = 287;
                    }
                    break;
                case 1921655137:
                    if (str.equals("medalWall")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1922559358:
                    if (str.equals("voiceLiveHeartBeat")) {
                        b = 289;
                    }
                    break;
                case 1972840184:
                    if (str.equals("cpRecommendUserList")) {
                        b = 290;
                    }
                    break;
                case 2006285729:
                    if (str.equals("showSideBarConfig")) {
                        b = 291;
                    }
                    break;
                case 2020570665:
                    if (str.equals("familyShareInfo")) {
                        b = 292;
                    }
                    break;
                case 2021259286:
                    if (str.equals("videoChatSquareSummary")) {
                        b = 293;
                    }
                    break;
                case 2026737069:
                    if (str.equals("dailyPayment")) {
                        b = 294;
                    }
                    break;
                case 2031121142:
                    if (str.equals("voiceSettles")) {
                        b = 295;
                    }
                    break;
                case 2063745269:
                    if (str.equals("voiceChatGroup")) {
                        b = 296;
                    }
                    break;
                case 2072779844:
                    if (str.equals("givenGiftRemindStatus")) {
                        b = 297;
                    }
                    break;
                case 2094910560:
                    if (str.equals("voiceKTVOrders")) {
                        b = 298;
                    }
                    break;
                case 2101052527:
                    if (str.equals("multiCallSummary")) {
                        b = 299;
                    }
                    break;
                case 2105497940:
                    if (str.equals("backGroundPicSetting")) {
                        b = 300;
                    }
                    break;
                case 2109884529:
                    if (str.equals("heatVoiceRoomTasks")) {
                        b = 301;
                    }
                    break;
                case 2126031723:
                    if (str.equals("bossCall")) {
                        b = 302;
                    }
                    break;
                case 2139989527:
                    if (str.equals("voiceRoomInProfile")) {
                        b = 303;
                    }
                    break;
                case 2143355835:
                    if (str.equals("skinList")) {
                        b = 304;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveData.equippedGift = BLiveGiftItemShort.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveData.grabRedPacketInfo = BLiveFanBaseRedPacketInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveData.cpInviteRecords = JsonAdapter.parseArray(jsonParser, BLiveVoiceSweetCpInviteRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveData.voiceUserMessageRemind = BLiveVoiceUserMessageRemind.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveData.officialShowList = JsonAdapter.parseArray(jsonParser, BLiveOfficialShowListItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveData.officialShowUser = BLiveOfficialShowUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveData.liveAnchors = JsonAdapter.parseArray(jsonParser, BLiveAnchors.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveData.voiceGiftWall = BLiveVoiceGiftWall.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveData.userWeekLeaderboard = BLiveUserLeaderboard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveData.userDailyTasks = JsonAdapter.parseArray(jsonParser, BLiveDailyTasks.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveData.canJoinGame = BLiveVoiceCanJoinGame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveData.nobleNiceNumberDetail = BLiveNiceNumberDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveData.userPushSwitch = BLiveIntlPushSwitch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLiveData.voiceMedalWall = BLiveVoiceMedalWallIList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveData.voicePayGuideUser = BLiveVoicePayGuideUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveData.chatSettings = BLiveChatMangerSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    bLiveData.voiceRoomClasses = JsonAdapter.parseArray(jsonParser, BLiveVoiceRoomClass.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLiveData.fanbaseDetails = JsonAdapter.parseArray(jsonParser, BLiveFanBaseDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    bLiveData.intlMedalWall = BLiveIntlMedalWallInUserCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    bLiveData.starlightHierarchies = JsonAdapter.parseArray(jsonParser, BLiveStarlightHierarchy.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    bLiveData.flameCoinMarket = BLiveHeaddressCoinMarket.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    bLiveData.shareItems = JsonAdapter.parseArray(jsonParser, BLiveVoiceShareItems.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveData.liveActivitySummaries = JsonAdapter.parseArray(jsonParser, BLiveActivitySummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    bLiveData.fanbaseMedalPanel = BLiveFanBaseMedalPanel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    bLiveData.guardAnchorRankInfos = JsonAdapter.parseArray(jsonParser, BLiveGuardAnchorRankInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    bLiveData.voiceCallInvites = JsonAdapter.parseArray(jsonParser, BLiveVoiceCallInvite.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    bLiveData.liveSummaries = JsonAdapter.parseArray(jsonParser, BLiveSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    bLiveData.bottomMenu = BLiveBottomMenu.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    bLiveData.voiceFollowships = JsonAdapter.parseArray(jsonParser, BLiveVoiceFollowship.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    bLiveData.voiceLiveBulletComment = BLiveDanmakuItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    bLiveData.userLiveHierarchyProgress = BLiveHierarchyProgress.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 31:
                    bLiveData.liveRoomInProfile = BLiveRoomInProfile.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 32:
                    bLiveData.weekCpInfo = BLiveWeekCpInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 33:
                    bLiveData.multiCallExtends = JsonAdapter.parseArray(jsonParser, BLiveMultiCallExtend.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    bLiveData.rightBindAnchors = JsonAdapter.parseArray(jsonParser, BLiveRightAnchorInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 35:
                    bLiveData.fanbaseHierarchies = JsonAdapter.parseArray(jsonParser, BLiveFanBaseHierarchy.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 36:
                    bLiveData.pkSuggestedAnchors = JsonAdapter.parseArray(jsonParser, BLivePkSuggestAnchors.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 37:
                    bLiveData.siteWideBroadcastFinder = SiteWideBroadcastFinder.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 38:
                    bLiveData.menuItems = JsonAdapter.parseArray(jsonParser, BLiveMenuItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 39:
                    bLiveData.liveOperation = BLiveOperation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 40:
                    bLiveData.voiceCalls = JsonAdapter.parseArray(jsonParser, BLiveVoiceCall.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 41:
                    bLiveData.voiceLives = JsonAdapter.parseArray(jsonParser, BLiveVoice.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 42:
                    bLiveData.voiceRooms = JsonAdapter.parseArray(jsonParser, BLiveVoiceRoom.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 43:
                    bLiveData.lovePlanet = BLiveLovePlanet.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 44:
                    bLiveData.voiceLivePush = BLiveVoiceLivePush.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 45:
                    bLiveData.liveQuitPopup = BLiveQuitPopup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 46:
                    bLiveData.familyMedals = JsonAdapter.parseArray(jsonParser, BLiveIntlVoiceMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 47:
                    bLiveData.knightsInfosSummary = JsonAdapter.parseArray(jsonParser, BLiveKnightsInfosSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 48:
                    bLiveData.treasureBox = BLiveTreasureBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 49:
                    bLiveData.redPacketGrabResult = BLiveFanBaseRedPacketInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 50:
                    bLiveData.leaderboards = JsonAdapter.parseArray(jsonParser, BLiveLeaderBoards.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 51:
                    bLiveData.fanbaseMedals = JsonAdapter.parseArray(jsonParser, BLiveFanBaseMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 52:
                    bLiveData.voiceKTVSongs = JsonAdapter.parseArray(jsonParser, BLiveVoiceKTVSong.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 53:
                    bLiveData.voiceGiftWallBookDetail = BLiveVoiceGiftWallBookInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 54:
                    bLiveData.anchorCall = BLiveVideoChatAnchorCall.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 55:
                    bLiveData.voiceKTVGame = BLiveVoiceKtvGameInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 56:
                    bLiveData.family = BLiveIntlFamilyInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 57:
                    bLiveData.memberActivityList = JsonAdapter.parseArray(jsonParser, BLiveMemberActivityData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 58:
                    bLiveData.previews = JsonAdapter.parseArray(jsonParser, BLiveCommonViewConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 59:
                    bLiveData.virtualVoiceCard = JsonAdapter.parseArray(jsonParser, BLiveVirtualVoiceCard.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 60:
                    bLiveData.stormComment = BLiveStormDanmaku.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 61:
                    bLiveData.turboCardInfo = BLiveTurboCardInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 62:
                    bLiveData.bossGiftRecord = BLiveBossGiftRecord.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 63:
                    bLiveData.voiceManagerInvites = JsonAdapter.parseArray(jsonParser, BLiveVoiceManagerInvite.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 64:
                    bLiveData.voiceUserProfileConfigs = JsonAdapter.parseArray(jsonParser, BLiveVoiceUserProfileConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 65:
                    bLiveData.auctionPlatformLeaderboardInfo = BLiveAuctionPlatformLeaderboardInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 66:
                    bLiveData.fanbaseRecall = BFansBaseRecall.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 67:
                    bLiveData.squareEntranceSummary = JsonAdapter.parseArray(jsonParser, BLiveEntranceSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 68:
                    bLiveData.voiceUserGiftItems = JsonAdapter.parseArray(jsonParser, BLiveVoiceUserGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 69:
                    bLiveData.slotInfo = BLiveUpgradeGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 70:
                    bLiveData.voiceUserLeaderboards = BLiveVoiceUserLeaderBoard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 71:
                    bLiveData.startLivePageCampaigns = JsonAdapter.parseArray(jsonParser, BLivePageCampaign.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 72:
                    bLiveData.medals = JsonAdapter.parseArray(jsonParser, BLiveLeaderboardMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                    bLiveData.accompanyTaskSummary = BLiveAccommpanyTaskSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 74:
                    bLiveData.voiceSquareButtons = JsonAdapter.parseArray(jsonParser, BLiveVoiceSquareButton.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 75:
                    bLiveData.voiceLiveSummaries = JsonAdapter.parseArray(jsonParser, BLiveSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 76:
                    bLiveData.superUserBirthdayDetail = BLiveSuperGodDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 77:
                    bLiveData.touchMeDetail = BLiveTouchMeDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 78:
                    bLiveData.voiceFanbase = BLiveFansMemberNum.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 79:
                    bLiveData.auctionCounter = BLiveAuctionCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 80:
                    bLiveData.voiceTabs = JsonAdapter.parseArray(jsonParser, BLiveVoiceTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.FILE_REFERENCE /* 81 */:
                    bLiveData.intlConfig = BLiveIntlConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                    bLiveData.videoChatAttendeeCallInfo = BLiveVideoChatAttendeeCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.DISCRETIONARY_DATA /* 83 */:
                    bLiveData.liveClarityLevelInfos = JsonAdapter.parseArray(jsonParser, BLiveClarity.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                    bLiveData.voiceCpLeaderBoards = BLiveVoiceCpLeaderBoards.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 85:
                    bLiveData.voiceFanbaseDetail = BLiveVoiceFanBaseDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.TRACK1_APPLICATION /* 86 */:
                    bLiveData.anchorDailyTasks = JsonAdapter.parseArray(jsonParser, BLiveDailyTasks.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 87:
                    bLiveData.videoChatAssets = BLiveVideoChatAssets.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 88:
                    bLiveData.rights = JsonAdapter.parseArray(jsonParser, BLiveUserDressUp.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 89:
                    bLiveData.videoQualities = JsonAdapter.parseArray(jsonParser, BLiveVideoQuality.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 90:
                    bLiveData.liveStickers = JsonAdapter.parseArray(jsonParser, BLiveAddStickerResult.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.NAME /* 91 */:
                    bLiveData.schema = jsonParser.getValueAsString();
                    return true;
                case EACTags.TAG_LIST /* 92 */:
                    bLiveData.liveResources = JsonAdapter.parseArray(jsonParser, BLiveEffect.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.HEADER_LIST /* 93 */:
                    bLiveData.topics = JsonAdapter.parseArray(jsonParser, BLiveVoiceTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.LOGIN_DATA /* 94 */:
                    bLiveData.anchorHierarchyGrades = JsonAdapter.parseArray(jsonParser, BLiveAnchorLevel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 95:
                    bLiveData.anchors = JsonAdapter.parseArray(jsonParser, BLiveAnchor.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case Opcodes.IADD /* 96 */:
                    bLiveData.randomMatchCouponDetail = BLiveRandomMatchCouponDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case EACTags.APPLICATION_TEMPLATE /* 97 */:
                    bLiveData.knightsRuleInfos = JsonAdapter.parseArray(jsonParser, BLiveKnightsRuleInfoItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case EACTags.FCP_TEMPLATE /* 98 */:
                    bLiveData.gameInfoResponse = jsonParser.getValueAsString();
                    return true;
                case 99:
                    bLiveData.livePopUpGuild = BLivePopUp.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 100:
                    bLiveData.heatBoxEntrance = BLiveVoiceHeatBoxEntrance.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 101:
                    bLiveData.sparkletProgress = BLiveVoiceEndSparkProgress.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 102:
                    bLiveData.liveSquareSummaries = JsonAdapter.parseArray(jsonParser, BLiveSquareSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 103:
                    bLiveData.multiPkLeaderboard = BLiveMultiPkLeaderboard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 104:
                    bLiveData.liveBeautyConfig = BLiveBeautyFilterConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 105:
                    bLiveData.gameOperationPositions = JsonAdapter.parseArray(jsonParser, BLiveGameOperationConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 106:
                    bLiveData.isAnchor = jsonParser.getValueAsBoolean();
                    return true;
                case 107:
                    bLiveData.fanbaseRedPacketEventCounters = JsonAdapter.parseArray(jsonParser, BLiveSquareDetailCounters.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 108:
                    bLiveData.anchorLeaderboard = BLiveAnchorLeaderboard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 109:
                    bLiveData.nobleNiceNumberList = BLiveNiceNumberList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 110:
                    bLiveData.signInDetails = JsonAdapter.parseArray(jsonParser, BLiveSignInDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 111:
                    bLiveData.voiceFanbaseMedals = JsonAdapter.parseArray(jsonParser, BLiveIntlVoiceMedal.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 112:
                    bLiveData.giftShowcaseItems = JsonAdapter.parseArray(jsonParser, BLiveGiftShowcaseItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 113:
                    bLiveData.callSummaries = JsonAdapter.parseArray(jsonParser, BLiveCallSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 114:
                    bLiveData.voiceRoomAsset = BLiveVoiceRoomAsset.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 115:
                    bLiveData.voiceRoomFeeds = JsonAdapter.parseArray(jsonParser, BLiveVoiceRoomFeed.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 116:
                    bLiveData.multiCallSwitchToLeadRoleInvite = BLiveMultiCallSwitchToLeadRoleInvite.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 117:
                    bLiveData.hourLeaderboard = BLiveHourLeaderBoard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 118:
                    bLiveData.connector = Connector.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 119:
                    bLiveData.voiceRoomLevelDetail = BLiveVoiceRoomLevelDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 120:
                    bLiveData.exchangeTTCRedpoint = jsonParser.getValueAsBoolean();
                    return true;
                case 121:
                    bLiveData.pkSeeks = JsonAdapter.parseArray(jsonParser, BLivePkSeek.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 122:
                    bLiveData.dragonScourgeDisplayChatMessage = BLiveDragonScourgeDisplayChatMessage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 123:
                    bLiveData.voiceLiveBanners = JsonAdapter.parseArray(jsonParser, BLiveVoiceFeedBanners.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 124:
                    bLiveData.missedCallCount = jsonParser.getValueAsInt();
                    return true;
                case 125:
                    bLiveData.chatTopicAsset = BLiveVoiceChatTopicAsset.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 126:
                    bLiveData.chatMsgLiveInfo = BLiveChatRealMsgLiveInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 127:
                    bLiveData.videoChatRandomMatch = BLiveVideoChatRandomMatch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 128:
                    bLiveData.accompanyUserRanking = JsonAdapter.parseArray(jsonParser, BLiveVoiceEndSparkRanking.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case MMConstants.ERR_WATERMARK_READ /* 129 */:
                    bLiveData.liveStickerTemplates = JsonAdapter.parseArray(jsonParser, BLiveStickerMetaDataItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 130:
                    bLiveData.videoChatSummary = BLiveVideoChatSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 131:
                    bLiveData.scoreSummary = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA /* 132 */:
                    bLiveData.fanbaseRelations = JsonAdapter.parseArray(jsonParser, BLiveFanBaseRelationShip.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                    bLiveData.voiceRoomSummary = BLiveVoiceVirtualRoomSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 134:
                    bLiveData.guardRecords = JsonAdapter.parseArray(jsonParser, BLiveGuardboardRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA /* 135 */:
                    bLiveData.voicePkInfo = BLiveVoicePkInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                    bLiveData.roomAnnouncement = BLiveMultiCallAnnouncement.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /* 137 */:
                    bLiveData.voiceLiveAuctions = JsonAdapter.parseArray(jsonParser, BLiveVoiceAuction.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                    bLiveData.voiceCallSummaries = JsonAdapter.parseArray(jsonParser, BLiveVoiceCallSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA /* 139 */:
                    bLiveData.auctionInvites = JsonAdapter.parseArray(jsonParser, BLiveAuctionQueueInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 140:
                    bLiveData.mysteryConfig = BLiveHideAvatarEnterConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                    bLiveData.giftDetails = JsonAdapter.parseArray(jsonParser, BLiveGiftDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA /* 142 */:
                    bLiveData.pks = JsonAdapter.parseArray(jsonParser, BLivePk.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /* 143 */:
                    bLiveData.code = jsonParser.getValueAsString();
                    return true;
                case 144:
                    bLiveData.game = BLiveVoiceGame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /* 145 */:
                    bLiveData.scrapTabs = JsonAdapter.parseArray(jsonParser, BLiveScrapTabData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                    bLiveData.voiceRoomTagInfo = BLiveVoiceRoomTagInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
                    bLiveData.taskSummary = BLiveTaskSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 148:
                    bLiveData.advancedTasks = JsonAdapter.parseArray(jsonParser, BLiveAdvanceTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 149:
                    bLiveData.voiceCpHouseTaskInfos = BLiveVoiceCpHouseTaskInfos.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 150:
                    bLiveData.pkAssets = BLivePkAssets.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 151:
                    bLiveData.calls = JsonAdapter.parseArray(jsonParser, BLiveCall.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                    bLiveData.cells = JsonAdapter.parseArray(jsonParser, VirtualVoiceGroupConversationCell.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 153:
                    bLiveData.guard = BLiveBoardGuard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 154:
                    bLiveData.lives = JsonAdapter.parseArray(jsonParser, BLive.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                    bLiveData.masks = JsonAdapter.parseArray(jsonParser, BLiveUserMask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                    bLiveData.media = JsonAdapter.parseArray(jsonParser, BLiveIntlMlnMedia.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 157:
                    bLiveData.right = BLiveRightInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 158:
                    bLiveData.rooms = JsonAdapter.parseArray(jsonParser, BLiveRoom.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 159:
                    bLiveData.skins = JsonAdapter.parseArray(jsonParser, BLiveGiftSkin.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 160:
                    bLiveData.tasks = JsonAdapter.parseArray(jsonParser, BLiveTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 161:
                    bLiveData.users = JsonAdapter.parseArray(jsonParser, User.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 162:
                    bLiveData.auctionCandidates = JsonAdapter.parseArray(jsonParser, BLiveAuctionQueueInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 163:
                    bLiveData.managers = JsonAdapter.parseArray(jsonParser, BLiveMember.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                    bLiveData.gamePanelMenus = BLiveIntlGamePanelMenus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 165:
                    bLiveData.complexCardConfig = BLiveComplexCardFourConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 166:
                    bLiveData.voiceHouseRankUpgradeInfo = BLiveVoiceHouseRankUpgradeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 167:
                    bLiveData.octopusUrl = jsonParser.getValueAsString();
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                    bLiveData.userLeaderboard = BLiveUserLeaderboard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 169:
                    bLiveData.userCompliance = BLiveUserCompliance.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                    bLiveData.monetizationConfig = BLiveMonetizationConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                    bLiveData.fakeUserProfiles = JsonAdapter.parseArray(jsonParser, BLiveFakeUserProfile.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                    bLiveData.userProfileConfig = JsonAdapter.parseArray(jsonParser, BLiveUserProfileConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                    bLiveData.pkSummaries = JsonAdapter.parseArray(jsonParser, BLivePkSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                    bLiveData.bigTVLives = JsonAdapter.parseArray(jsonParser, BLiveSuggestLive.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                    bLiveData.voiceWeekLeaderboards = BLiveVoiceHourLeaderBoard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 176:
                    bLiveData.giftSkinPanel = BLiveNewGiftSkinListData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 177:
                    bLiveData.videoLiveBulletComment = BLiveDanmakuItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 178:
                    bLiveData.suggestedLives = JsonAdapter.parseArray(jsonParser, BLiveSuggestLive.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                    bLiveData.version = jsonParser.getValueAsLong();
                    return true;
                case 180:
                    bLiveData.anchorGuildCheck = BLiveGuildAnchorCheck.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 181:
                    bLiveData.liveAssets = BLiveAssets.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 182:
                    bLiveData.anchorFanbaseMedal = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 183:
                    bLiveData.giftSetInfo = BLiveGiftSetInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 184:
                    bLiveData.userEnterRoomEffects = JsonAdapter.parseArray(jsonParser, BLiveEnterRoomEffect.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 185:
                    bLiveData.voiceGiftWallList = JsonAdapter.parseArray(jsonParser, BLiveVoiceGiftWallBookInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                    bLiveData.liveRoomTabGifts = BLiveRoomTabGifts.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 187:
                    bLiveData.relationships = JsonAdapter.parseArray(jsonParser, Relationship.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 188:
                    bLiveData.leaderboardUsers = JsonAdapter.parseArray(jsonParser, BLiveLeaderboardUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                    bLiveData.signInAchievementMedals = JsonAdapter.parseArray(jsonParser, BLiveSignInAchievementMedals.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                    bLiveData.giftItemCDN = BLiveGiftItemCDN.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                    bLiveData.pkInvites = JsonAdapter.parseArray(jsonParser, BLivePkInvite.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 192:
                    bLiveData.liveStickerTemplatesGifts = JsonAdapter.parseArray(jsonParser, BLiveStickerTemplatesGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 193:
                    bLiveData.intlVoiceLiveCampaigns = JsonAdapter.parseArray(jsonParser, BLiveVoiceCampaign.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                    bLiveData.rtcTokens = JsonAdapter.parseArray(jsonParser, BLiveRtcToken.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                    bLiveData.auctionRelationCards = JsonAdapter.parseArray(jsonParser, BLiveAuctionRelationCard.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                    bLiveData.accompanyTasks = JsonAdapter.parseArray(jsonParser, BLiveAccommpanyTasks.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                    bLiveData.userLivePush = BLivePush.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case Opcodes.IFNULL /* 198 */:
                    bLiveData.userLiveHierarchy = BLiveUserLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case Opcodes.IFNONNULL /* 199 */:
                    bLiveData.fakeUser = BLiveFakeUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 200:
                    bLiveData.liveSchemas = JsonAdapter.parseArray(jsonParser, LiveMultiCallLiveSchema.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 201:
                    bLiveData.firstRechargeDetail = BLiveFirstRechargeDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 202:
                    bLiveData.liveResourcesCDN = BLiveResourceCDN.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 203:
                    bLiveData.livePushes = JsonAdapter.parseArray(jsonParser, BLivePush.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 204:
                    bLiveData.grabHatGame = BLiveVoiceGrabHatGame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 205:
                    bLiveData.fanbases = JsonAdapter.parseArray(jsonParser, BLiveFanBase.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 206:
                    bLiveData.giftStar = BLiveGiftStarBoard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 207:
                    bLiveData.voiceLiveBulletCommentTypes = JsonAdapter.parseArray(jsonParser, BLiveDanmakuListItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 208:
                    bLiveData.liveMedalCDN = BLiveLiveMedalCDN.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 209:
                    bLiveData.voiceUserFeedInfos = JsonAdapter.parseArray(jsonParser, BLiveVoiceUserFeedInfos.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 210:
                    bLiveData.members = JsonAdapter.parseArray(jsonParser, BLiveMember.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                    bLiveData.giftWallV3Briefs = JsonAdapter.parseArray(jsonParser, BLiveUserCardGiftWall.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 212:
                    bLiveData.gameAsset = BLiveVoicePlayModeList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 213:
                    bLiveData.modelDescribe = BLiveVoiceModelDescribe.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 214:
                    bLiveData.voiceLivePopsTotal = BLiveVoicePopTotal.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 215:
                    bLiveData.shareRoomConfig = BLiveVoiceShareUrlConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 216:
                    bLiveData.liveCampaigns = JsonAdapter.parseArray(jsonParser, BLiveCampaign.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 217:
                    bLiveData.liveHierarchyGrades = JsonAdapter.parseArray(jsonParser, BLiveUserLevel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 218:
                    bLiveData.needTitle = jsonParser.getValueAsBoolean();
                    return true;
                case 219:
                    bLiveData.records = JsonAdapter.parseArray(jsonParser, BLiveLeaderboardRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 220:
                    bLiveData.superChatDetail = BLiveSuperChatDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 221:
                    bLiveData.voiceAdminPanelCounter = BLiveVoiceAdminPanelCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 222:
                    bLiveData.luckyParadiseBottomEntrance = BLiveLuckyParadiseBottomEntrance.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 223:
                    bLiveData.hierarchies = JsonAdapter.parseArray(jsonParser, BLiveBoardHierarchy.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 224:
                    bLiveData.videoChatLive = BLiveVideoChatLive.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 225:
                    bLiveData.mutexMode = JsonAdapter.parseArray(jsonParser, BLiveVoiceMutexMode.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 226:
                    bLiveData.userKnightInfosSummary = JsonAdapter.parseArray(jsonParser, BLiveUserKnightInfoSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 227:
                    bLiveData.firstRechargeStatus = BLiveFirstRechargeStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 228:
                    bLiveData.starRedPackets = JsonAdapter.parseArray(jsonParser, BLiveVoiceStarRedPacket.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 229:
                    bLiveData.funFairBottomEntrance = BLiveLuckyParadiseBottomEntrance.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 230:
                    bLiveData.voiceLiveUserFeedList = JsonAdapter.parseArray(jsonParser, BLiveVoiceLiveUserFeedList.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 231:
                    bLiveData.multiCalls = JsonAdapter.parseArray(jsonParser, BLiveMultiCall.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 232:
                    bLiveData.verificationCenter = JsonAdapter.parseArray(jsonParser, BLiveVerificationCenter.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 233:
                    bLiveData.pkItemCardsDetail = BLivePKCardShowList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 234:
                    bLiveData.givenGiftRes = BLiveSendLiveGiftResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 235:
                    bLiveData.multiCallAsset = BLiveMultiCallAsset.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 236:
                    bLiveData.giftLeaderboard = BLiveIntlGiftLeaderboard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 237:
                    bLiveData.complexCardList = JsonAdapter.parseArray(jsonParser, BLiveComplexCard.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 238:
                    bLiveData.videoChat = BLiveVideoChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 239:
                    bLiveData.memberLbs = JsonAdapter.parseArray(jsonParser, BLiveVoiceMemberLb.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 240:
                    bLiveData.anchorKnightInfos = JsonAdapter.parseArray(jsonParser, BLiveAnchorKnightInfos.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 241:
                    bLiveData.voiceGiftWallBriefInfo = BLiveVoiceGiftWallBrief.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 242:
                    bLiveData.multiPk = BLiveMultiPkDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 243:
                    bLiveData.chatTips = JsonAdapter.parseArray(jsonParser, BLiveChatTip.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                    bLiveData.voiceLiveGames = JsonAdapter.parseArray(jsonParser, VoiceLiveGame.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 245:
                    bLiveData.privacyPrivilege = JsonAdapter.parseArray(jsonParser, BLiveUserPrivacyPrivilege.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 246:
                    bLiveData.liveActivities = JsonAdapter.parseArray(jsonParser, BLiveActivity.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 247:
                    bLiveData.activitySuggests = JsonAdapter.parseArray(jsonParser, ActivitySuggests.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 248:
                    bLiveData.voiceLiveUserHeartbeatRewardList = BLiveVoiceUserHeartbeatRewardList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 249:
                    bLiveData.myJoins = JsonAdapter.parseArray(jsonParser, BLiveVoiceFansMyJoin.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 250:
                    bLiveData.emojiPlayMenu = JsonAdapter.parseArray(jsonParser, BLiveVoiceEmojiMenu.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 251:
                    bLiveData.auctionApplies = JsonAdapter.parseArray(jsonParser, BLiveAuctionQueueInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 252:
                    bLiveData.voiceManagers = JsonAdapter.parseArray(jsonParser, BLiveVoiceManager.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 253:
                    bLiveData.intlLiveFramesMetadata = BLiveIntlLiveFramesCDN.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 254:
                    bLiveData.voiceLivesSummary = JsonAdapter.parseArray(jsonParser, BLiveFeedSummary.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 255:
                    bLiveData.callInvites = JsonAdapter.parseArray(jsonParser, BLiveCallInvite.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 256:
                    bLiveData.userRealVoiceLive = BLiveVoiceUserRealVoiceLive.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 257:
                    bLiveData.voiceLivePopUpGuild = BLivePopUp.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 258:
                    bLiveData.officialShowCurrentAnchorInfo = BLiveOfficialShowCurrentAnchorInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 259:
                    bLiveData.chatTopic = BLiveVoiceChatTopic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 260:
                    bLiveData.givenGiftRemindConfig = BLiveGiftBubbleConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 261:
                    bLiveData.followships = JsonAdapter.parseArray(jsonParser, Followship.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 262:
                    bLiveData.multiCallInvites = JsonAdapter.parseArray(jsonParser, BLiveMultiCallInvite.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 263:
                    bLiveData.liveChatMessages = JsonAdapter.parseArray(jsonParser, BLiveChatMessage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 264:
                    bLiveData.bagpackItem = BLiveTabGiftExpiration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 265:
                    bLiveData.chestRewardInfo = JsonAdapter.parseArray(jsonParser, BLiveDownChestRewardInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 266:
                    bLiveData.voiceCpHouseInfo = BLiveVoiceCpHouseRankAwardInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 267:
                    bLiveData.voiceCpHouseList = JsonAdapter.parseArray(jsonParser, BLiveVoiceCpHouseInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 268:
                    bLiveData.liveTopChatMessage = BLiveTopChatMessage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 269:
                    bLiveData.voiceLeaderboardEntrances = JsonAdapter.parseArray(jsonParser, BLiveVoiceLeaderBoardEntranceItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 270:
                    bLiveData.liveStickerTemplatesMetadata = BLiveStickerMetaData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 271:
                    bLiveData.voiceChatGroupApplies = JsonAdapter.parseArray(jsonParser, BLiveVoiceChatGroupApply.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 272:
                    bLiveData.missedCalls = JsonAdapter.parseArray(jsonParser, BLiveVideoChatMissedCall.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 273:
                    bLiveData.accompanyTaskProgress = BLiveAccommpanyTasksProgress.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 274:
                    bLiveData.voiceLiveAuctionAsset = BLiveAuctionAsset.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 275:
                    bLiveData.momentConfig = BLiveMomentConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 276:
                    bLiveData.grabHatCps = JsonAdapter.parseArray(jsonParser, BLiveVoiceGrabHatCP.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 277:
                    bLiveData.signInPrizes = JsonAdapter.parseArray(jsonParser, BLiveSignPrizes.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 278:
                    bLiveData.multiPkAsset = BLiveMultiPkAsset.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 279:
                    bLiveData.voiceFanbaseLbs = JsonAdapter.parseArray(jsonParser, BLiveVoicePlayModeAnchorItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 280:
                    bLiveData.userLiveRightResources = JsonAdapter.parseArray(jsonParser, BLiveUserRightResource.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 281:
                    bLiveData.storeBackgroundPics = JsonAdapter.parseArray(jsonParser, BLiveVoiceBackGroundPics.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 282:
                    bLiveData.multiPkPanel = BLiveMultiPkPanel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 283:
                    bLiveData.teenagerLives = JsonAdapter.parseArray(jsonParser, BLiveTeenagerLive.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 284:
                    bLiveData.videoLiveBulletCommentTypes = BLiveDanmakuList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 285:
                    bLiveData.firstChargeCampaigns = BLiveFirstChargeCampaign.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 286:
                    bLiveData.voiceLiveAssert = BLiveVoiceLiveAssert.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 287:
                    bLiveData.voiceLiveActivityMoment = BLiveVoiceLiveActivityMoment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 288:
                    bLiveData.medalWall = BLiveIntlMedalWall.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 289:
                    bLiveData.voiceLiveHeartBeat = BLiveVoiceHeartBeat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 290:
                    bLiveData.cpRecommendUserList = JsonAdapter.parseArray(jsonParser, BLiveVoiceSweetCpRecommendUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 291:
                    bLiveData.showSideBarConfig = BLiveSideBarConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 292:
                    bLiveData.familyShareInfo = BLiveIntlFamilyShareInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 293:
                    bLiveData.videoChatSquareSummary = BLiveVideoChatSquareSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 294:
                    bLiveData.dailyPayment = BLiveDailyPayment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 295:
                    bLiveData.voiceSettles = JsonAdapter.parseArray(jsonParser, BLiveVoiceSettle.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 296:
                    bLiveData.voiceChatGroup = BLiveVoiceChatGroup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 297:
                    bLiveData.givenGiftRemindStatus = BLiveGivenGiftRemindStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 298:
                    bLiveData.voiceKTVOrders = JsonAdapter.parseArray(jsonParser, BLiveVoiceKTVOrder.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 299:
                    bLiveData.multiCallSummary = BLiveMultiCallSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 300:
                    bLiveData.backGroundPicSetting = BLiveVoiceBackGroundPicSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 301:
                    bLiveData.heatVoiceRoomTasks = JsonAdapter.parseArray(jsonParser, BLiveHeatVoiceRoomTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 302:
                    bLiveData.bossCall = BLiveBossCall.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 303:
                    bLiveData.voiceRoomInProfile = BLiveVoiceRoomInProfile.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case HttpStatus.NOT_MODIFIED_304 /* 304 */:
                    bLiveData.skinList = JsonAdapter.parseArray(jsonParser, BLiveVoiceSweetLimitHouse.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveData bLiveData, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveData.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(bLiveData.users, jsonGenerator, User.JSON_ADAPTER);
            }
            if (bLiveData.relationships != null) {
                jsonGenerator.writeFieldName("relationships");
                JsonAdapter.serializeArray(bLiveData.relationships, jsonGenerator, Relationship.JSON_ADAPTER);
            }
            if (bLiveData.verificationCenter != null) {
                jsonGenerator.writeFieldName("verifications");
                JsonAdapter.serializeArray(bLiveData.verificationCenter, jsonGenerator, BLiveVerificationCenter.JSON_ADAPTER);
            }
            if (bLiveData.monetizationConfig != null) {
                jsonGenerator.writeFieldName("monetizationConfig");
                BLiveMonetizationConfig.JSON_ADAPTER.serialize(bLiveData.monetizationConfig, jsonGenerator, true);
            }
            if (bLiveData.members != null) {
                jsonGenerator.writeFieldName("members");
                JsonAdapter.serializeArray(bLiveData.members, jsonGenerator, BLiveMember.JSON_ADAPTER);
            }
            if (bLiveData.anchors != null) {
                jsonGenerator.writeFieldName("anchors");
                JsonAdapter.serializeArray(bLiveData.anchors, jsonGenerator, BLiveAnchor.JSON_ADAPTER);
            }
            if (bLiveData.rooms != null) {
                jsonGenerator.writeFieldName("rooms");
                JsonAdapter.serializeArray(bLiveData.rooms, jsonGenerator, BLiveRoom.JSON_ADAPTER);
            }
            if (bLiveData.lives != null) {
                jsonGenerator.writeFieldName("lives");
                JsonAdapter.serializeArray(bLiveData.lives, jsonGenerator, BLive.JSON_ADAPTER);
            }
            if (bLiveData.liveSummaries != null) {
                jsonGenerator.writeFieldName("liveSummaries");
                JsonAdapter.serializeArray(bLiveData.liveSummaries, jsonGenerator, BLiveSummary.JSON_ADAPTER);
            }
            if (bLiveData.givenGiftRes != null) {
                jsonGenerator.writeFieldName("givenGiftRes");
                BLiveSendLiveGiftResult.JSON_ADAPTER.serialize(bLiveData.givenGiftRes, jsonGenerator, true);
            }
            if (bLiveData.liveChatMessages != null) {
                jsonGenerator.writeFieldName("liveChatMessages");
                JsonAdapter.serializeArray(bLiveData.liveChatMessages, jsonGenerator, BLiveChatMessage.JSON_ADAPTER);
            }
            if (bLiveData.liveSquareSummaries != null) {
                jsonGenerator.writeFieldName("liveSquareSummaries");
                JsonAdapter.serializeArray(bLiveData.liveSquareSummaries, jsonGenerator, BLiveSquareSummary.JSON_ADAPTER);
            }
            if (bLiveData.liveActivitySummaries != null) {
                jsonGenerator.writeFieldName("liveActivitySummaries");
                JsonAdapter.serializeArray(bLiveData.liveActivitySummaries, jsonGenerator, BLiveActivitySummary.JSON_ADAPTER);
            }
            if (bLiveData.liveActivities != null) {
                jsonGenerator.writeFieldName("liveActivities");
                JsonAdapter.serializeArray(bLiveData.liveActivities, jsonGenerator, BLiveActivity.JSON_ADAPTER);
            }
            if (bLiveData.managers != null) {
                jsonGenerator.writeFieldName("managers");
                JsonAdapter.serializeArray(bLiveData.managers, jsonGenerator, BLiveMember.JSON_ADAPTER);
            }
            if (bLiveData.menuItems != null) {
                jsonGenerator.writeFieldName("menuItems");
                JsonAdapter.serializeArray(bLiveData.menuItems, jsonGenerator, BLiveMenuItem.JSON_ADAPTER);
            }
            if (bLiveData.liveCampaigns != null) {
                jsonGenerator.writeFieldName("liveCampaigns");
                JsonAdapter.serializeArray(bLiveData.liveCampaigns, jsonGenerator, BLiveCampaign.JSON_ADAPTER);
            }
            if (bLiveData.liveHierarchyGrades != null) {
                jsonGenerator.writeFieldName("liveHierarchyGrades");
                JsonAdapter.serializeArray(bLiveData.liveHierarchyGrades, jsonGenerator, BLiveUserLevel.JSON_ADAPTER);
            }
            if (bLiveData.chatTips != null) {
                jsonGenerator.writeFieldName("chatTips");
                JsonAdapter.serializeArray(bLiveData.chatTips, jsonGenerator, BLiveChatTip.JSON_ADAPTER);
            }
            if (bLiveData.livePushes != null) {
                jsonGenerator.writeFieldName("livePushes");
                JsonAdapter.serializeArray(bLiveData.livePushes, jsonGenerator, BLivePush.JSON_ADAPTER);
            }
            if (bLiveData.giftItemCDN != null) {
                jsonGenerator.writeFieldName("giftItemCDN");
                BLiveGiftItemCDN.JSON_ADAPTER.serialize(bLiveData.giftItemCDN, jsonGenerator, true);
            }
            if (bLiveData.liveRoomTabGifts != null) {
                jsonGenerator.writeFieldName("liveRoomTabGifts");
                BLiveRoomTabGifts.JSON_ADAPTER.serialize(bLiveData.liveRoomTabGifts, jsonGenerator, true);
            }
            if (bLiveData.followships != null) {
                jsonGenerator.writeFieldName("followships");
                JsonAdapter.serializeArray(bLiveData.followships, jsonGenerator, Followship.JSON_ADAPTER);
            }
            if (bLiveData.firstChargeCampaigns != null) {
                jsonGenerator.writeFieldName("firstChargeCampaigns");
                BLiveFirstChargeCampaign.JSON_ADAPTER.serialize(bLiveData.firstChargeCampaigns, jsonGenerator, true);
            }
            if (bLiveData.leaderboards != null) {
                jsonGenerator.writeFieldName("leaderboards");
                JsonAdapter.serializeArray(bLiveData.leaderboards, jsonGenerator, BLiveLeaderBoards.JSON_ADAPTER);
            }
            if (bLiveData.startLivePageCampaigns != null) {
                jsonGenerator.writeFieldName("startLivePageCampaigns");
                JsonAdapter.serializeArray(bLiveData.startLivePageCampaigns, jsonGenerator, BLivePageCampaign.JSON_ADAPTER);
            }
            if (bLiveData.hourLeaderboard != null) {
                jsonGenerator.writeFieldName("hourLeaderboard");
                BLiveHourLeaderBoard.JSON_ADAPTER.serialize(bLiveData.hourLeaderboard, jsonGenerator, true);
            }
            if (bLiveData.momentConfig != null) {
                jsonGenerator.writeFieldName("momentConfig");
                BLiveMomentConfig.JSON_ADAPTER.serialize(bLiveData.momentConfig, jsonGenerator, true);
            }
            if (bLiveData.treasureBox != null) {
                jsonGenerator.writeFieldName("treasureBox");
                BLiveTreasureBox.JSON_ADAPTER.serialize(bLiveData.treasureBox, jsonGenerator, true);
            }
            if (bLiveData.videoQualities != null) {
                jsonGenerator.writeFieldName("videoQualities");
                JsonAdapter.serializeArray(bLiveData.videoQualities, jsonGenerator, BLiveVideoQuality.JSON_ADAPTER);
            }
            if (bLiveData.liveAssets != null) {
                jsonGenerator.writeFieldName("liveAssets");
                BLiveAssets.JSON_ADAPTER.serialize(bLiveData.liveAssets, jsonGenerator, true);
            }
            if (bLiveData.anchorHierarchyGrades != null) {
                jsonGenerator.writeFieldName("anchorHierarchyGrades");
                JsonAdapter.serializeArray(bLiveData.anchorHierarchyGrades, jsonGenerator, BLiveAnchorLevel.JSON_ADAPTER);
            }
            if (bLiveData.givenGiftRemindConfig != null) {
                jsonGenerator.writeFieldName("givenGiftRemindConfig");
                BLiveGiftBubbleConfig.JSON_ADAPTER.serialize(bLiveData.givenGiftRemindConfig, jsonGenerator, true);
            }
            if (bLiveData.liveStickerTemplatesMetadata != null) {
                jsonGenerator.writeFieldName("liveStickerTemplatesMetadata");
                BLiveStickerMetaData.JSON_ADAPTER.serialize(bLiveData.liveStickerTemplatesMetadata, jsonGenerator, true);
            }
            if (bLiveData.liveStickerTemplates != null) {
                jsonGenerator.writeFieldName("liveStickerTemplates");
                JsonAdapter.serializeArray(bLiveData.liveStickerTemplates, jsonGenerator, BLiveStickerMetaDataItem.JSON_ADAPTER);
            }
            if (bLiveData.liveStickers != null) {
                jsonGenerator.writeFieldName("liveStickers");
                JsonAdapter.serializeArray(bLiveData.liveStickers, jsonGenerator, BLiveAddStickerResult.JSON_ADAPTER);
            }
            if (bLiveData.pkSeeks != null) {
                jsonGenerator.writeFieldName("pkSeeks");
                JsonAdapter.serializeArray(bLiveData.pkSeeks, jsonGenerator, BLivePkSeek.JSON_ADAPTER);
            }
            if (bLiveData.pkInvites != null) {
                jsonGenerator.writeFieldName("pkInvites");
                JsonAdapter.serializeArray(bLiveData.pkInvites, jsonGenerator, BLivePkInvite.JSON_ADAPTER);
            }
            if (bLiveData.pks != null) {
                jsonGenerator.writeFieldName("pks");
                JsonAdapter.serializeArray(bLiveData.pks, jsonGenerator, BLivePk.JSON_ADAPTER);
            }
            if (bLiveData.liveResources != null) {
                jsonGenerator.writeFieldName("liveResources");
                JsonAdapter.serializeArray(bLiveData.liveResources, jsonGenerator, BLiveEffect.JSON_ADAPTER);
            }
            if (bLiveData.fanbases != null) {
                jsonGenerator.writeFieldName("fanbases");
                JsonAdapter.serializeArray(bLiveData.fanbases, jsonGenerator, BLiveFanBase.JSON_ADAPTER);
            }
            if (bLiveData.fanbaseDetails != null) {
                jsonGenerator.writeFieldName("fanbaseDetails");
                JsonAdapter.serializeArray(bLiveData.fanbaseDetails, jsonGenerator, BLiveFanBaseDetail.JSON_ADAPTER);
            }
            if (bLiveData.tasks != null) {
                jsonGenerator.writeFieldName("tasks");
                JsonAdapter.serializeArray(bLiveData.tasks, jsonGenerator, BLiveTask.JSON_ADAPTER);
            }
            if (bLiveData.taskSummary != null) {
                jsonGenerator.writeFieldName("taskSummary");
                BLiveTaskSummary.JSON_ADAPTER.serialize(bLiveData.taskSummary, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, bLiveData.version);
            if (bLiveData.fanbaseMedalPanel != null) {
                jsonGenerator.writeFieldName("fanbaseMedalPanel");
                BLiveFanBaseMedalPanel.JSON_ADAPTER.serialize(bLiveData.fanbaseMedalPanel, jsonGenerator, true);
            }
            if (bLiveData.grabRedPacketInfo != null) {
                jsonGenerator.writeFieldName("grabRedPacketInfo");
                BLiveFanBaseRedPacketInfo.JSON_ADAPTER.serialize(bLiveData.grabRedPacketInfo, jsonGenerator, true);
            }
            if (bLiveData.redPacketGrabResult != null) {
                jsonGenerator.writeFieldName("redPacketGrabResult");
                BLiveFanBaseRedPacketInfo.JSON_ADAPTER.serialize(bLiveData.redPacketGrabResult, jsonGenerator, true);
            }
            if (bLiveData.fanbaseRelations != null) {
                jsonGenerator.writeFieldName("fanbaseRelations");
                JsonAdapter.serializeArray(bLiveData.fanbaseRelations, jsonGenerator, BLiveFanBaseRelationShip.JSON_ADAPTER);
            }
            if (bLiveData.fanbaseHierarchies != null) {
                jsonGenerator.writeFieldName("fanbaseHierarchies");
                JsonAdapter.serializeArray(bLiveData.fanbaseHierarchies, jsonGenerator, BLiveFanBaseHierarchy.JSON_ADAPTER);
            }
            if (bLiveData.fanbaseMedals != null) {
                jsonGenerator.writeFieldName("fanbaseMedals");
                JsonAdapter.serializeArray(bLiveData.fanbaseMedals, jsonGenerator, BLiveFanBaseMedal.JSON_ADAPTER);
            }
            if (bLiveData.records != null) {
                jsonGenerator.writeFieldName("records");
                JsonAdapter.serializeArray(bLiveData.records, jsonGenerator, BLiveLeaderboardRecord.JSON_ADAPTER);
            }
            if (bLiveData.anchorFanbaseMedal != null) {
                jsonGenerator.writeFieldName("anchorFanbaseMedal");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveData.anchorFanbaseMedal, jsonGenerator, true);
            }
            if (bLiveData.medals != null) {
                jsonGenerator.writeFieldName("medals");
                JsonAdapter.serializeArray(bLiveData.medals, jsonGenerator, BLiveLeaderboardMedal.JSON_ADAPTER);
            }
            if (bLiveData.leaderboardUsers != null) {
                jsonGenerator.writeFieldName("leaderboardUsers");
                JsonAdapter.serializeArray(bLiveData.leaderboardUsers, jsonGenerator, BLiveLeaderboardUser.JSON_ADAPTER);
            }
            if (bLiveData.fanbaseRedPacketEventCounters != null) {
                jsonGenerator.writeFieldName("fanbaseRedPacketEventCounters");
                JsonAdapter.serializeArray(bLiveData.fanbaseRedPacketEventCounters, jsonGenerator, BLiveSquareDetailCounters.JSON_ADAPTER);
            }
            if (bLiveData.calls != null) {
                jsonGenerator.writeFieldName("calls");
                JsonAdapter.serializeArray(bLiveData.calls, jsonGenerator, BLiveCall.JSON_ADAPTER);
            }
            if (bLiveData.callInvites != null) {
                jsonGenerator.writeFieldName("callInvites");
                JsonAdapter.serializeArray(bLiveData.callInvites, jsonGenerator, BLiveCallInvite.JSON_ADAPTER);
            }
            if (bLiveData.rtcTokens != null) {
                jsonGenerator.writeFieldName("rtcTokens");
                JsonAdapter.serializeArray(bLiveData.rtcTokens, jsonGenerator, BLiveRtcToken.JSON_ADAPTER);
            }
            if (bLiveData.callSummaries != null) {
                jsonGenerator.writeFieldName("callSummaries");
                JsonAdapter.serializeArray(bLiveData.callSummaries, jsonGenerator, BLiveCallSummary.JSON_ADAPTER);
            }
            if (bLiveData.hierarchies != null) {
                jsonGenerator.writeFieldName("hierarchies");
                JsonAdapter.serializeArray(bLiveData.hierarchies, jsonGenerator, BLiveBoardHierarchy.JSON_ADAPTER);
            }
            if (bLiveData.userEnterRoomEffects != null) {
                jsonGenerator.writeFieldName("userEnterRoomEffects");
                JsonAdapter.serializeArray(bLiveData.userEnterRoomEffects, jsonGenerator, BLiveEnterRoomEffect.JSON_ADAPTER);
            }
            if (bLiveData.bottomMenu != null) {
                jsonGenerator.writeFieldName("bottomMenu");
                BLiveBottomMenu.JSON_ADAPTER.serialize(bLiveData.bottomMenu, jsonGenerator, true);
            }
            if (bLiveData.connector != null) {
                jsonGenerator.writeFieldName(Connector.TYPE);
                Connector.JSON_ADAPTER.serialize(bLiveData.connector, jsonGenerator, true);
            }
            if (bLiveData.userProfileConfig != null) {
                jsonGenerator.writeFieldName("userProfileConfig");
                JsonAdapter.serializeArray(bLiveData.userProfileConfig, jsonGenerator, BLiveUserProfileConfig.JSON_ADAPTER);
            }
            if (bLiveData.turboCardInfo != null) {
                jsonGenerator.writeFieldName("turboCardInfo");
                BLiveTurboCardInfo.JSON_ADAPTER.serialize(bLiveData.turboCardInfo, jsonGenerator, true);
            }
            if (bLiveData.voiceCalls != null) {
                jsonGenerator.writeFieldName("voiceCalls");
                JsonAdapter.serializeArray(bLiveData.voiceCalls, jsonGenerator, BLiveVoiceCall.JSON_ADAPTER);
            }
            if (bLiveData.voiceCallInvites != null) {
                jsonGenerator.writeFieldName("voiceCallInvites");
                JsonAdapter.serializeArray(bLiveData.voiceCallInvites, jsonGenerator, BLiveVoiceCallInvite.JSON_ADAPTER);
            }
            if (bLiveData.voiceCallSummaries != null) {
                jsonGenerator.writeFieldName("voiceCallSummaries");
                JsonAdapter.serializeArray(bLiveData.voiceCallSummaries, jsonGenerator, BLiveVoiceCallSummary.JSON_ADAPTER);
            }
            if (bLiveData.voiceRooms != null) {
                jsonGenerator.writeFieldName("voiceRooms");
                JsonAdapter.serializeArray(bLiveData.voiceRooms, jsonGenerator, BLiveVoiceRoom.JSON_ADAPTER);
            }
            if (bLiveData.voiceLives != null) {
                jsonGenerator.writeFieldName("voiceLives");
                JsonAdapter.serializeArray(bLiveData.voiceLives, jsonGenerator, BLiveVoice.JSON_ADAPTER);
            }
            if (bLiveData.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(bLiveData.topics, jsonGenerator, BLiveVoiceTopic.JSON_ADAPTER);
            }
            if (bLiveData.voiceLiveSummaries != null) {
                jsonGenerator.writeFieldName("voiceLiveSummaries");
                JsonAdapter.serializeArray(bLiveData.voiceLiveSummaries, jsonGenerator, BLiveSummary.JSON_ADAPTER);
            }
            if (bLiveData.right != null) {
                jsonGenerator.writeFieldName("right");
                BLiveRightInfo.JSON_ADAPTER.serialize(bLiveData.right, jsonGenerator, true);
            }
            if (bLiveData.rightBindAnchors != null) {
                jsonGenerator.writeFieldName("rightBindAnchors");
                JsonAdapter.serializeArray(bLiveData.rightBindAnchors, jsonGenerator, BLiveRightAnchorInfo.JSON_ADAPTER);
            }
            if (bLiveData.liveOperation != null) {
                jsonGenerator.writeFieldName("liveOperation");
                BLiveOperation.JSON_ADAPTER.serialize(bLiveData.liveOperation, jsonGenerator, true);
            }
            if (bLiveData.voiceLivesSummary != null) {
                jsonGenerator.writeFieldName("voiceLivesSummary");
                JsonAdapter.serializeArray(bLiveData.voiceLivesSummary, jsonGenerator, BLiveFeedSummary.JSON_ADAPTER);
            }
            if (bLiveData.voiceRoomTagInfo != null) {
                jsonGenerator.writeFieldName("voiceRoomTagInfo");
                BLiveVoiceRoomTagInfo.JSON_ADAPTER.serialize(bLiveData.voiceRoomTagInfo, jsonGenerator, true);
            }
            if (bLiveData.giftStar != null) {
                jsonGenerator.writeFieldName("giftStar");
                BLiveGiftStarBoard.JSON_ADAPTER.serialize(bLiveData.giftStar, jsonGenerator, true);
            }
            if (bLiveData.advancedTasks != null) {
                jsonGenerator.writeFieldName("advancedTasks");
                JsonAdapter.serializeArray(bLiveData.advancedTasks, jsonGenerator, BLiveAdvanceTask.JSON_ADAPTER);
            }
            if (bLiveData.knightsInfosSummary != null) {
                jsonGenerator.writeFieldName("knightsInfosSummary");
                JsonAdapter.serializeArray(bLiveData.knightsInfosSummary, jsonGenerator, BLiveKnightsInfosSummary.JSON_ADAPTER);
            }
            if (bLiveData.userKnightInfosSummary != null) {
                jsonGenerator.writeFieldName("userKnightInfosSummary");
                JsonAdapter.serializeArray(bLiveData.userKnightInfosSummary, jsonGenerator, BLiveUserKnightInfoSummary.JSON_ADAPTER);
            }
            if (bLiveData.knightsRuleInfos != null) {
                jsonGenerator.writeFieldName("knightsRuleInfos");
                JsonAdapter.serializeArray(bLiveData.knightsRuleInfos, jsonGenerator, BLiveKnightsRuleInfoItem.JSON_ADAPTER);
            }
            if (bLiveData.anchorKnightInfos != null) {
                jsonGenerator.writeFieldName("anchorKnightInfos");
                JsonAdapter.serializeArray(bLiveData.anchorKnightInfos, jsonGenerator, BLiveAnchorKnightInfos.JSON_ADAPTER);
            }
            if (bLiveData.slotInfo != null) {
                jsonGenerator.writeFieldName("slotInfo");
                BLiveUpgradeGiftInfo.JSON_ADAPTER.serialize(bLiveData.slotInfo, jsonGenerator, true);
            }
            if (bLiveData.equippedGift != null) {
                jsonGenerator.writeFieldName("equippedGift");
                BLiveGiftItemShort.JSON_ADAPTER.serialize(bLiveData.equippedGift, jsonGenerator, true);
            }
            if (bLiveData.masks != null) {
                jsonGenerator.writeFieldName("masks");
                JsonAdapter.serializeArray(bLiveData.masks, jsonGenerator, BLiveUserMask.JSON_ADAPTER);
            }
            if (bLiveData.chatSettings != null) {
                jsonGenerator.writeFieldName("chatSettings");
                BLiveChatMangerSettings.JSON_ADAPTER.serialize(bLiveData.chatSettings, jsonGenerator, true);
            }
            if (bLiveData.voiceLiveGames != null) {
                jsonGenerator.writeFieldName("voiceLiveGames");
                JsonAdapter.serializeArray(bLiveData.voiceLiveGames, jsonGenerator, VoiceLiveGame.JSON_ADAPTER);
            }
            if (bLiveData.pkAssets != null) {
                jsonGenerator.writeFieldName("pkAssets");
                BLivePkAssets.JSON_ADAPTER.serialize(bLiveData.pkAssets, jsonGenerator, true);
            }
            if (bLiveData.privacyPrivilege != null) {
                jsonGenerator.writeFieldName("privacyPrivilege");
                JsonAdapter.serializeArray(bLiveData.privacyPrivilege, jsonGenerator, BLiveUserPrivacyPrivilege.JSON_ADAPTER);
            }
            if (bLiveData.fakeUser != null) {
                jsonGenerator.writeFieldName("fakeUser");
                BLiveFakeUser.JSON_ADAPTER.serialize(bLiveData.fakeUser, jsonGenerator, true);
            }
            if (bLiveData.mysteryConfig != null) {
                jsonGenerator.writeFieldName("mysteryConfig");
                BLiveHideAvatarEnterConfig.JSON_ADAPTER.serialize(bLiveData.mysteryConfig, jsonGenerator, true);
            }
            if (bLiveData.fakeUserProfiles != null) {
                jsonGenerator.writeFieldName("fakeUserProfiles");
                JsonAdapter.serializeArray(bLiveData.fakeUserProfiles, jsonGenerator, BLiveFakeUserProfile.JSON_ADAPTER);
            }
            if (bLiveData.pkSummaries != null) {
                jsonGenerator.writeFieldName("pkSummaries");
                JsonAdapter.serializeArray(bLiveData.pkSummaries, jsonGenerator, BLivePkSummary.JSON_ADAPTER);
            }
            if (bLiveData.previews != null) {
                jsonGenerator.writeFieldName("previews");
                JsonAdapter.serializeArray(bLiveData.previews, jsonGenerator, BLiveCommonViewConfig.JSON_ADAPTER);
            }
            if (bLiveData.videoLiveBulletCommentTypes != null) {
                jsonGenerator.writeFieldName("videoLiveBulletCommentTypes");
                BLiveDanmakuList.JSON_ADAPTER.serialize(bLiveData.videoLiveBulletCommentTypes, jsonGenerator, true);
            }
            if (bLiveData.videoLiveBulletComment != null) {
                jsonGenerator.writeFieldName("videoLiveBulletComment");
                BLiveDanmakuItem.JSON_ADAPTER.serialize(bLiveData.videoLiveBulletComment, jsonGenerator, true);
            }
            if (bLiveData.userLiveRightResources != null) {
                jsonGenerator.writeFieldName("userLiveRightResources");
                JsonAdapter.serializeArray(bLiveData.userLiveRightResources, jsonGenerator, BLiveUserRightResource.JSON_ADAPTER);
            }
            if (bLiveData.voiceUserProfileConfigs != null) {
                jsonGenerator.writeFieldName("voiceUserProfileConfigs");
                JsonAdapter.serializeArray(bLiveData.voiceUserProfileConfigs, jsonGenerator, BLiveVoiceUserProfileConfig.JSON_ADAPTER);
            }
            if (bLiveData.giftShowcaseItems != null) {
                jsonGenerator.writeFieldName("giftShowcaseItems");
                JsonAdapter.serializeArray(bLiveData.giftShowcaseItems, jsonGenerator, BLiveGiftShowcaseItem.JSON_ADAPTER);
            }
            if (bLiveData.accompanyTaskSummary != null) {
                jsonGenerator.writeFieldName("accompanyTaskSummary");
                BLiveAccommpanyTaskSummary.JSON_ADAPTER.serialize(bLiveData.accompanyTaskSummary, jsonGenerator, true);
            }
            if (bLiveData.accompanyTasks != null) {
                jsonGenerator.writeFieldName("accompanyTasks");
                JsonAdapter.serializeArray(bLiveData.accompanyTasks, jsonGenerator, BLiveAccommpanyTasks.JSON_ADAPTER);
            }
            if (bLiveData.accompanyTaskProgress != null) {
                jsonGenerator.writeFieldName("accompanyTaskProgress");
                BLiveAccommpanyTasksProgress.JSON_ADAPTER.serialize(bLiveData.accompanyTaskProgress, jsonGenerator, true);
            }
            if (bLiveData.giftSetInfo != null) {
                jsonGenerator.writeFieldName("giftSetInfo");
                BLiveGiftSetInfo.JSON_ADAPTER.serialize(bLiveData.giftSetInfo, jsonGenerator, true);
            }
            if (bLiveData.scrapTabs != null) {
                jsonGenerator.writeFieldName("scrapTabs");
                JsonAdapter.serializeArray(bLiveData.scrapTabs, jsonGenerator, BLiveScrapTabData.JSON_ADAPTER);
            }
            if (bLiveData.givenGiftRemindStatus != null) {
                jsonGenerator.writeFieldName("givenGiftRemindStatus");
                BLiveGivenGiftRemindStatus.JSON_ADAPTER.serialize(bLiveData.givenGiftRemindStatus, jsonGenerator, true);
            }
            if (bLiveData.userLiveHierarchy != null) {
                jsonGenerator.writeFieldName("userLiveHierarchy");
                BLiveUserLevel.JSON_ADAPTER.serialize(bLiveData.userLiveHierarchy, jsonGenerator, true);
            }
            if (bLiveData.chestRewardInfo != null) {
                jsonGenerator.writeFieldName("chestRewardInfo");
                JsonAdapter.serializeArray(bLiveData.chestRewardInfo, jsonGenerator, BLiveDownChestRewardInfo.JSON_ADAPTER);
            }
            if (bLiveData.signInDetails != null) {
                jsonGenerator.writeFieldName("signInDetails");
                JsonAdapter.serializeArray(bLiveData.signInDetails, jsonGenerator, BLiveSignInDetail.JSON_ADAPTER);
            }
            if (bLiveData.signInPrizes != null) {
                jsonGenerator.writeFieldName("signInPrizes");
                JsonAdapter.serializeArray(bLiveData.signInPrizes, jsonGenerator, BLiveSignPrizes.JSON_ADAPTER);
            }
            if (bLiveData.liveBeautyConfig != null) {
                jsonGenerator.writeFieldName("liveBeautyConfig");
                BLiveBeautyFilterConfig.JSON_ADAPTER.serialize(bLiveData.liveBeautyConfig, jsonGenerator, true);
            }
            if (bLiveData.voiceUserFeedInfos != null) {
                jsonGenerator.writeFieldName("voiceUserFeedInfos");
                JsonAdapter.serializeArray(bLiveData.voiceUserFeedInfos, jsonGenerator, BLiveVoiceUserFeedInfos.JSON_ADAPTER);
            }
            if (bLiveData.userLiveHierarchyProgress != null) {
                jsonGenerator.writeFieldName("userLiveHierarchyProgress");
                BLiveHierarchyProgress.JSON_ADAPTER.serialize(bLiveData.userLiveHierarchyProgress, jsonGenerator, true);
            }
            if (bLiveData.teenagerLives != null) {
                jsonGenerator.writeFieldName("teenagerLives");
                JsonAdapter.serializeArray(bLiveData.teenagerLives, jsonGenerator, BLiveTeenagerLive.JSON_ADAPTER);
            }
            String str = bLiveData.gameInfoResponse;
            if (str != null) {
                jsonGenerator.writeStringField("gameInfoResponse", str);
            }
            if (bLiveData.signInAchievementMedals != null) {
                jsonGenerator.writeFieldName("signInAchievementMedals");
                JsonAdapter.serializeArray(bLiveData.signInAchievementMedals, jsonGenerator, BLiveSignInAchievementMedals.JSON_ADAPTER);
            }
            if (bLiveData.guardAnchorRankInfos != null) {
                jsonGenerator.writeFieldName("guardAnchorRankInfos");
                JsonAdapter.serializeArray(bLiveData.guardAnchorRankInfos, jsonGenerator, BLiveGuardAnchorRankInfo.JSON_ADAPTER);
            }
            if (bLiveData.guardRecords != null) {
                jsonGenerator.writeFieldName("guardRecords");
                JsonAdapter.serializeArray(bLiveData.guardRecords, jsonGenerator, BLiveGuardboardRecord.JSON_ADAPTER);
            }
            if (bLiveData.userDailyTasks != null) {
                jsonGenerator.writeFieldName("userDailyTasks");
                JsonAdapter.serializeArray(bLiveData.userDailyTasks, jsonGenerator, BLiveDailyTasks.JSON_ADAPTER);
            }
            if (bLiveData.anchorDailyTasks != null) {
                jsonGenerator.writeFieldName("anchorDailyTasks");
                JsonAdapter.serializeArray(bLiveData.anchorDailyTasks, jsonGenerator, BLiveDailyTasks.JSON_ADAPTER);
            }
            if (bLiveData.stormComment != null) {
                jsonGenerator.writeFieldName("stormComment");
                BLiveStormDanmaku.JSON_ADAPTER.serialize(bLiveData.stormComment, jsonGenerator, true);
            }
            if (bLiveData.liveResourcesCDN != null) {
                jsonGenerator.writeFieldName("liveResourcesCDN");
                BLiveResourceCDN.JSON_ADAPTER.serialize(bLiveData.liveResourcesCDN, jsonGenerator, true);
            }
            if (bLiveData.voiceLiveAssert != null) {
                jsonGenerator.writeFieldName("voiceLiveAssert");
                BLiveVoiceLiveAssert.JSON_ADAPTER.serialize(bLiveData.voiceLiveAssert, jsonGenerator, true);
            }
            if (bLiveData.firstRechargeStatus != null) {
                jsonGenerator.writeFieldName("firstRechargeStatus");
                BLiveFirstRechargeStatus.JSON_ADAPTER.serialize(bLiveData.firstRechargeStatus, jsonGenerator, true);
            }
            if (bLiveData.firstRechargeDetail != null) {
                jsonGenerator.writeFieldName("firstRechargeDetail");
                BLiveFirstRechargeDetail.JSON_ADAPTER.serialize(bLiveData.firstRechargeDetail, jsonGenerator, true);
            }
            if (bLiveData.voiceTabs != null) {
                jsonGenerator.writeFieldName("voiceTabs");
                JsonAdapter.serializeArray(bLiveData.voiceTabs, jsonGenerator, BLiveVoiceTab.JSON_ADAPTER);
            }
            if (bLiveData.shareItems != null) {
                jsonGenerator.writeFieldName("shareItems");
                JsonAdapter.serializeArray(bLiveData.shareItems, jsonGenerator, BLiveVoiceShareItems.JSON_ADAPTER);
            }
            if (bLiveData.voiceRoomFeeds != null) {
                jsonGenerator.writeFieldName("voiceRoomFeeds");
                JsonAdapter.serializeArray(bLiveData.voiceRoomFeeds, jsonGenerator, BLiveVoiceRoomFeed.JSON_ADAPTER);
            }
            if (bLiveData.skins != null) {
                jsonGenerator.writeFieldName("skins");
                JsonAdapter.serializeArray(bLiveData.skins, jsonGenerator, BLiveGiftSkin.JSON_ADAPTER);
            }
            if (bLiveData.voiceChatGroup != null) {
                jsonGenerator.writeFieldName("voiceChatGroup");
                BLiveVoiceChatGroup.JSON_ADAPTER.serialize(bLiveData.voiceChatGroup, jsonGenerator, true);
            }
            if (bLiveData.voiceChatGroupApplies != null) {
                jsonGenerator.writeFieldName("voiceChatGroupApplies");
                JsonAdapter.serializeArray(bLiveData.voiceChatGroupApplies, jsonGenerator, BLiveVoiceChatGroupApply.JSON_ADAPTER);
            }
            if (bLiveData.voiceManagerInvites != null) {
                jsonGenerator.writeFieldName("voiceManagerInvites");
                JsonAdapter.serializeArray(bLiveData.voiceManagerInvites, jsonGenerator, BLiveVoiceManagerInvite.JSON_ADAPTER);
            }
            if (bLiveData.voiceManagers != null) {
                jsonGenerator.writeFieldName("voiceManagers");
                JsonAdapter.serializeArray(bLiveData.voiceManagers, jsonGenerator, BLiveVoiceManager.JSON_ADAPTER);
            }
            if (bLiveData.multiCalls != null) {
                jsonGenerator.writeFieldName("multiCalls");
                JsonAdapter.serializeArray(bLiveData.multiCalls, jsonGenerator, BLiveMultiCall.JSON_ADAPTER);
            }
            if (bLiveData.multiCallAsset != null) {
                jsonGenerator.writeFieldName("multiCallAsset");
                BLiveMultiCallAsset.JSON_ADAPTER.serialize(bLiveData.multiCallAsset, jsonGenerator, true);
            }
            if (bLiveData.multiCallInvites != null) {
                jsonGenerator.writeFieldName("multiCallInvites");
                JsonAdapter.serializeArray(bLiveData.multiCallInvites, jsonGenerator, BLiveMultiCallInvite.JSON_ADAPTER);
            }
            if (bLiveData.multiCallSummary != null) {
                jsonGenerator.writeFieldName("multiCallSummary");
                BLiveMultiCallSummary.JSON_ADAPTER.serialize(bLiveData.multiCallSummary, jsonGenerator, true);
            }
            if (bLiveData.activitySuggests != null) {
                jsonGenerator.writeFieldName("activitySuggests");
                JsonAdapter.serializeArray(bLiveData.activitySuggests, jsonGenerator, ActivitySuggests.JSON_ADAPTER);
            }
            if (bLiveData.fanbaseRecall != null) {
                jsonGenerator.writeFieldName("fanbaseRecall");
                BFansBaseRecall.JSON_ADAPTER.serialize(bLiveData.fanbaseRecall, jsonGenerator, true);
            }
            if (bLiveData.accompanyUserRanking != null) {
                jsonGenerator.writeFieldName("accompanyUserRanking");
                JsonAdapter.serializeArray(bLiveData.accompanyUserRanking, jsonGenerator, BLiveVoiceEndSparkRanking.JSON_ADAPTER);
            }
            if (bLiveData.sparkletProgress != null) {
                jsonGenerator.writeFieldName("sparkletProgress");
                BLiveVoiceEndSparkProgress.JSON_ADAPTER.serialize(bLiveData.sparkletProgress, jsonGenerator, true);
            }
            if (bLiveData.liveAnchors != null) {
                jsonGenerator.writeFieldName("liveAnchors");
                JsonAdapter.serializeArray(bLiveData.liveAnchors, jsonGenerator, BLiveAnchors.JSON_ADAPTER);
            }
            if (bLiveData.suggestedLives != null) {
                jsonGenerator.writeFieldName("suggestedLives");
                JsonAdapter.serializeArray(bLiveData.suggestedLives, jsonGenerator, BLiveSuggestLive.JSON_ADAPTER);
            }
            if (bLiveData.liveSchemas != null) {
                jsonGenerator.writeFieldName("liveSchemas");
                JsonAdapter.serializeArray(bLiveData.liveSchemas, jsonGenerator, LiveMultiCallLiveSchema.JSON_ADAPTER);
            }
            if (bLiveData.userLivePush != null) {
                jsonGenerator.writeFieldName("userLivePush");
                BLivePush.JSON_ADAPTER.serialize(bLiveData.userLivePush, jsonGenerator, true);
            }
            if (bLiveData.touchMeDetail != null) {
                jsonGenerator.writeFieldName("touchMeDetail");
                BLiveTouchMeDetail.JSON_ADAPTER.serialize(bLiveData.touchMeDetail, jsonGenerator, true);
            }
            if (bLiveData.multiCallSwitchToLeadRoleInvite != null) {
                jsonGenerator.writeFieldName("multiCallSwitchToLeadRoleInvite");
                BLiveMultiCallSwitchToLeadRoleInvite.JSON_ADAPTER.serialize(bLiveData.multiCallSwitchToLeadRoleInvite, jsonGenerator, true);
            }
            if (bLiveData.multiCallExtends != null) {
                jsonGenerator.writeFieldName("multiCallExtends");
                JsonAdapter.serializeArray(bLiveData.multiCallExtends, jsonGenerator, BLiveMultiCallExtend.JSON_ADAPTER);
            }
            if (bLiveData.scoreSummary != null) {
                jsonGenerator.writeFieldName("scoreSummary");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveData.scoreSummary, jsonGenerator, true);
            }
            if (bLiveData.liveTopChatMessage != null) {
                jsonGenerator.writeFieldName("liveTopChatMessage");
                BLiveTopChatMessage.JSON_ADAPTER.serialize(bLiveData.liveTopChatMessage, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("needTitle", bLiveData.needTitle);
            if (bLiveData.squareEntranceSummary != null) {
                jsonGenerator.writeFieldName("squareEntranceSummary");
                JsonAdapter.serializeArray(bLiveData.squareEntranceSummary, jsonGenerator, BLiveEntranceSummary.JSON_ADAPTER);
            }
            if (bLiveData.memberActivityList != null) {
                jsonGenerator.writeFieldName("memberActivityList");
                JsonAdapter.serializeArray(bLiveData.memberActivityList, jsonGenerator, BLiveMemberActivityData.JSON_ADAPTER);
            }
            if (bLiveData.voiceLiveActivityMoment != null) {
                jsonGenerator.writeFieldName("voiceLiveActivityMoment");
                BLiveVoiceLiveActivityMoment.JSON_ADAPTER.serialize(bLiveData.voiceLiveActivityMoment, jsonGenerator, true);
            }
            if (bLiveData.roomAnnouncement != null) {
                jsonGenerator.writeFieldName("roomAnnouncement");
                BLiveMultiCallAnnouncement.JSON_ADAPTER.serialize(bLiveData.roomAnnouncement, jsonGenerator, true);
            }
            if (bLiveData.voiceLiveUserHeartbeatRewardList != null) {
                jsonGenerator.writeFieldName("voiceLiveUserHeartbeatRewardList");
                BLiveVoiceUserHeartbeatRewardList.JSON_ADAPTER.serialize(bLiveData.voiceLiveUserHeartbeatRewardList, jsonGenerator, true);
            }
            if (bLiveData.voiceLiveHeartBeat != null) {
                jsonGenerator.writeFieldName("voiceLiveHeartBeat");
                BLiveVoiceHeartBeat.JSON_ADAPTER.serialize(bLiveData.voiceLiveHeartBeat, jsonGenerator, true);
            }
            if (bLiveData.liveStickerTemplatesGifts != null) {
                jsonGenerator.writeFieldName("liveStickerTemplatesGifts");
                JsonAdapter.serializeArray(bLiveData.liveStickerTemplatesGifts, jsonGenerator, BLiveStickerTemplatesGiftItem.JSON_ADAPTER);
            }
            if (bLiveData.voiceLivePopsTotal != null) {
                jsonGenerator.writeFieldName("voiceLivePopsTotal");
                BLiveVoicePopTotal.JSON_ADAPTER.serialize(bLiveData.voiceLivePopsTotal, jsonGenerator, true);
            }
            if (bLiveData.grabHatGame != null) {
                jsonGenerator.writeFieldName("grabHatGame");
                BLiveVoiceGrabHatGame.JSON_ADAPTER.serialize(bLiveData.grabHatGame, jsonGenerator, true);
            }
            if (bLiveData.grabHatCps != null) {
                jsonGenerator.writeFieldName("grabHatCps");
                JsonAdapter.serializeArray(bLiveData.grabHatCps, jsonGenerator, BLiveVoiceGrabHatCP.JSON_ADAPTER);
            }
            if (bLiveData.voiceLiveAuctions != null) {
                jsonGenerator.writeFieldName("voiceLiveAuctions");
                JsonAdapter.serializeArray(bLiveData.voiceLiveAuctions, jsonGenerator, BLiveVoiceAuction.JSON_ADAPTER);
            }
            if (bLiveData.cpRecommendUserList != null) {
                jsonGenerator.writeFieldName("cpRecommendUserList");
                JsonAdapter.serializeArray(bLiveData.cpRecommendUserList, jsonGenerator, BLiveVoiceSweetCpRecommendUser.JSON_ADAPTER);
            }
            if (bLiveData.voiceCpLeaderBoards != null) {
                jsonGenerator.writeFieldName("voiceCpLeaderBoards");
                BLiveVoiceCpLeaderBoards.JSON_ADAPTER.serialize(bLiveData.voiceCpLeaderBoards, jsonGenerator, true);
            }
            if (bLiveData.voiceCpHouseTaskInfos != null) {
                jsonGenerator.writeFieldName("voiceCpHouseTaskInfos");
                BLiveVoiceCpHouseTaskInfos.JSON_ADAPTER.serialize(bLiveData.voiceCpHouseTaskInfos, jsonGenerator, true);
            }
            if (bLiveData.voiceCpHouseInfo != null) {
                jsonGenerator.writeFieldName("voiceCpHouseInfo");
                BLiveVoiceCpHouseRankAwardInfo.JSON_ADAPTER.serialize(bLiveData.voiceCpHouseInfo, jsonGenerator, true);
            }
            if (bLiveData.voiceCpHouseList != null) {
                jsonGenerator.writeFieldName("voiceCpHouseList");
                JsonAdapter.serializeArray(bLiveData.voiceCpHouseList, jsonGenerator, BLiveVoiceCpHouseInfo.JSON_ADAPTER);
            }
            if (bLiveData.voiceHouseRankUpgradeInfo != null) {
                jsonGenerator.writeFieldName("voiceHouseRankUpgradeInfo");
                BLiveVoiceHouseRankUpgradeInfo.JSON_ADAPTER.serialize(bLiveData.voiceHouseRankUpgradeInfo, jsonGenerator, true);
            }
            if (bLiveData.backGroundPicSetting != null) {
                jsonGenerator.writeFieldName("backGroundPicSetting");
                BLiveVoiceBackGroundPicSetting.JSON_ADAPTER.serialize(bLiveData.backGroundPicSetting, jsonGenerator, true);
            }
            if (bLiveData.dailyPayment != null) {
                jsonGenerator.writeFieldName("dailyPayment");
                BLiveDailyPayment.JSON_ADAPTER.serialize(bLiveData.dailyPayment, jsonGenerator, true);
            }
            if (bLiveData.intlVoiceLiveCampaigns != null) {
                jsonGenerator.writeFieldName("intlVoiceLiveCampaigns");
                JsonAdapter.serializeArray(bLiveData.intlVoiceLiveCampaigns, jsonGenerator, BLiveVoiceCampaign.JSON_ADAPTER);
            }
            if (bLiveData.complexCardList != null) {
                jsonGenerator.writeFieldName("complexCardList");
                JsonAdapter.serializeArray(bLiveData.complexCardList, jsonGenerator, BLiveComplexCard.JSON_ADAPTER);
            }
            if (bLiveData.voiceGiftWallList != null) {
                jsonGenerator.writeFieldName("voiceGiftWallList");
                JsonAdapter.serializeArray(bLiveData.voiceGiftWallList, jsonGenerator, BLiveVoiceGiftWallBookInfo.JSON_ADAPTER);
            }
            if (bLiveData.voiceGiftWallBriefInfo != null) {
                jsonGenerator.writeFieldName("voiceGiftWallBriefInfo");
                BLiveVoiceGiftWallBrief.JSON_ADAPTER.serialize(bLiveData.voiceGiftWallBriefInfo, jsonGenerator, true);
            }
            if (bLiveData.voiceGiftWallBookDetail != null) {
                jsonGenerator.writeFieldName("voiceGiftWallBookDetail");
                BLiveVoiceGiftWallBookInfo.JSON_ADAPTER.serialize(bLiveData.voiceGiftWallBookDetail, jsonGenerator, true);
            }
            if (bLiveData.voiceFollowships != null) {
                jsonGenerator.writeFieldName("voiceFollowships");
                JsonAdapter.serializeArray(bLiveData.voiceFollowships, jsonGenerator, BLiveVoiceFollowship.JSON_ADAPTER);
            }
            if (bLiveData.voiceUserGiftItems != null) {
                jsonGenerator.writeFieldName("voiceUserGiftItems");
                JsonAdapter.serializeArray(bLiveData.voiceUserGiftItems, jsonGenerator, BLiveVoiceUserGiftItem.JSON_ADAPTER);
            }
            if (bLiveData.flameCoinMarket != null) {
                jsonGenerator.writeFieldName("flameCoinMarket");
                BLiveHeaddressCoinMarket.JSON_ADAPTER.serialize(bLiveData.flameCoinMarket, jsonGenerator, true);
            }
            if (bLiveData.virtualVoiceCard != null) {
                jsonGenerator.writeFieldName("virtualVoiceCard");
                JsonAdapter.serializeArray(bLiveData.virtualVoiceCard, jsonGenerator, BLiveVirtualVoiceCard.JSON_ADAPTER);
            }
            if (bLiveData.chatMsgLiveInfo != null) {
                jsonGenerator.writeFieldName("chatMsgLiveInfo");
                BLiveChatRealMsgLiveInfo.JSON_ADAPTER.serialize(bLiveData.chatMsgLiveInfo, jsonGenerator, true);
            }
            if (bLiveData.voiceKTVGame != null) {
                jsonGenerator.writeFieldName("voiceKTVGame");
                BLiveVoiceKtvGameInfo.JSON_ADAPTER.serialize(bLiveData.voiceKTVGame, jsonGenerator, true);
            }
            if (bLiveData.voiceKTVSongs != null) {
                jsonGenerator.writeFieldName("voiceKTVSongs");
                JsonAdapter.serializeArray(bLiveData.voiceKTVSongs, jsonGenerator, BLiveVoiceKTVSong.JSON_ADAPTER);
            }
            if (bLiveData.voiceKTVOrders != null) {
                jsonGenerator.writeFieldName("voiceKTVOrders");
                JsonAdapter.serializeArray(bLiveData.voiceKTVOrders, jsonGenerator, BLiveVoiceKTVOrder.JSON_ADAPTER);
            }
            if (bLiveData.complexCardConfig != null) {
                jsonGenerator.writeFieldName("complexCardConfig");
                BLiveComplexCardFourConfig.JSON_ADAPTER.serialize(bLiveData.complexCardConfig, jsonGenerator, true);
            }
            if (bLiveData.familyMedals != null) {
                jsonGenerator.writeFieldName("familyMedals");
                JsonAdapter.serializeArray(bLiveData.familyMedals, jsonGenerator, BLiveIntlVoiceMedal.JSON_ADAPTER);
            }
            String str2 = bLiveData.schema;
            if (str2 != null) {
                jsonGenerator.writeStringField("schema", str2);
            }
            if (bLiveData.cells != null) {
                jsonGenerator.writeFieldName("cells");
                JsonAdapter.serializeArray(bLiveData.cells, jsonGenerator, VirtualVoiceGroupConversationCell.JSON_ADAPTER);
            }
            if (bLiveData.voiceSettles != null) {
                jsonGenerator.writeFieldName("voiceSettles");
                JsonAdapter.serializeArray(bLiveData.voiceSettles, jsonGenerator, BLiveVoiceSettle.JSON_ADAPTER);
            }
            if (bLiveData.voiceLivePush != null) {
                jsonGenerator.writeFieldName("voiceLivePush");
                BLiveVoiceLivePush.JSON_ADAPTER.serialize(bLiveData.voiceLivePush, jsonGenerator, true);
            }
            if (bLiveData.voiceAdminPanelCounter != null) {
                jsonGenerator.writeFieldName("voiceAdminPanelCounter");
                BLiveVoiceAdminPanelCounter.JSON_ADAPTER.serialize(bLiveData.voiceAdminPanelCounter, jsonGenerator, true);
            }
            if (bLiveData.voiceUserMessageRemind != null) {
                jsonGenerator.writeFieldName("voiceUserMessageRemind");
                BLiveVoiceUserMessageRemind.JSON_ADAPTER.serialize(bLiveData.voiceUserMessageRemind, jsonGenerator, true);
            }
            if (bLiveData.shareRoomConfig != null) {
                jsonGenerator.writeFieldName("shareRoomConfig");
                BLiveVoiceShareUrlConfig.JSON_ADAPTER.serialize(bLiveData.shareRoomConfig, jsonGenerator, true);
            }
            if (bLiveData.nobleNiceNumberDetail != null) {
                jsonGenerator.writeFieldName("nobleNiceNumberDetail");
                BLiveNiceNumberDetail.JSON_ADAPTER.serialize(bLiveData.nobleNiceNumberDetail, jsonGenerator, true);
            }
            if (bLiveData.nobleNiceNumberList != null) {
                jsonGenerator.writeFieldName("nobleNiceNumberList");
                BLiveNiceNumberList.JSON_ADAPTER.serialize(bLiveData.nobleNiceNumberList, jsonGenerator, true);
            }
            if (bLiveData.heatVoiceRoomTasks != null) {
                jsonGenerator.writeFieldName("heatVoiceRoomTasks");
                JsonAdapter.serializeArray(bLiveData.heatVoiceRoomTasks, jsonGenerator, BLiveHeatVoiceRoomTask.JSON_ADAPTER);
            }
            if (bLiveData.liveRoomInProfile != null) {
                jsonGenerator.writeFieldName("liveRoomInProfile");
                BLiveRoomInProfile.JSON_ADAPTER.serialize(bLiveData.liveRoomInProfile, jsonGenerator, true);
            }
            if (bLiveData.voiceRoomInProfile != null) {
                jsonGenerator.writeFieldName("voiceRoomInProfile");
                BLiveVoiceRoomInProfile.JSON_ADAPTER.serialize(bLiveData.voiceRoomInProfile, jsonGenerator, true);
            }
            if (bLiveData.voiceGiftWall != null) {
                jsonGenerator.writeFieldName("voiceGiftWall");
                BLiveVoiceGiftWall.JSON_ADAPTER.serialize(bLiveData.voiceGiftWall, jsonGenerator, true);
            }
            if (bLiveData.voiceMedalWall != null) {
                jsonGenerator.writeFieldName("voiceMedalWall");
                BLiveVoiceMedalWallIList.JSON_ADAPTER.serialize(bLiveData.voiceMedalWall, jsonGenerator, true);
            }
            if (bLiveData.voiceWeekLeaderboards != null) {
                jsonGenerator.writeFieldName("voiceWeekLeaderboards");
                BLiveVoiceHourLeaderBoard.JSON_ADAPTER.serialize(bLiveData.voiceWeekLeaderboards, jsonGenerator, true);
            }
            if (bLiveData.voiceRoomLevelDetail != null) {
                jsonGenerator.writeFieldName("voiceRoomLevelDetail");
                BLiveVoiceRoomLevelDetail.JSON_ADAPTER.serialize(bLiveData.voiceRoomLevelDetail, jsonGenerator, true);
            }
            if (bLiveData.voiceRoomSummary != null) {
                jsonGenerator.writeFieldName("voiceRoomSummary");
                BLiveVoiceVirtualRoomSummary.JSON_ADAPTER.serialize(bLiveData.voiceRoomSummary, jsonGenerator, true);
            }
            if (bLiveData.starRedPackets != null) {
                jsonGenerator.writeFieldName("starRedPackets");
                JsonAdapter.serializeArray(bLiveData.starRedPackets, jsonGenerator, BLiveVoiceStarRedPacket.JSON_ADAPTER);
            }
            if (bLiveData.showSideBarConfig != null) {
                jsonGenerator.writeFieldName("showSideBarConfig");
                BLiveSideBarConfig.JSON_ADAPTER.serialize(bLiveData.showSideBarConfig, jsonGenerator, true);
            }
            if (bLiveData.voiceLiveBanners != null) {
                jsonGenerator.writeFieldName("voiceLiveBanners");
                JsonAdapter.serializeArray(bLiveData.voiceLiveBanners, jsonGenerator, BLiveVoiceFeedBanners.JSON_ADAPTER);
            }
            if (bLiveData.multiPk != null) {
                jsonGenerator.writeFieldName("multiPk");
                BLiveMultiPkDetail.JSON_ADAPTER.serialize(bLiveData.multiPk, jsonGenerator, true);
            }
            if (bLiveData.multiPkPanel != null) {
                jsonGenerator.writeFieldName("multiPkPanel");
                BLiveMultiPkPanel.JSON_ADAPTER.serialize(bLiveData.multiPkPanel, jsonGenerator, true);
            }
            if (bLiveData.multiPkAsset != null) {
                jsonGenerator.writeFieldName("multiPkAsset");
                BLiveMultiPkAsset.JSON_ADAPTER.serialize(bLiveData.multiPkAsset, jsonGenerator, true);
            }
            if (bLiveData.multiPkLeaderboard != null) {
                jsonGenerator.writeFieldName("multiPkLeaderboard");
                BLiveMultiPkLeaderboard.JSON_ADAPTER.serialize(bLiveData.multiPkLeaderboard, jsonGenerator, true);
            }
            if (bLiveData.voiceRoomClasses != null) {
                jsonGenerator.writeFieldName("voiceRoomClasses");
                JsonAdapter.serializeArray(bLiveData.voiceRoomClasses, jsonGenerator, BLiveVoiceRoomClass.JSON_ADAPTER);
            }
            if (bLiveData.chatTopicAsset != null) {
                jsonGenerator.writeFieldName("chatTopicAsset");
                BLiveVoiceChatTopicAsset.JSON_ADAPTER.serialize(bLiveData.chatTopicAsset, jsonGenerator, true);
            }
            if (bLiveData.chatTopic != null) {
                jsonGenerator.writeFieldName(VirtualVoiceMotionType.chatTopic);
                BLiveVoiceChatTopic.JSON_ADAPTER.serialize(bLiveData.chatTopic, jsonGenerator, true);
            }
            if (bLiveData.mutexMode != null) {
                jsonGenerator.writeFieldName("mutexMode");
                JsonAdapter.serializeArray(bLiveData.mutexMode, jsonGenerator, BLiveVoiceMutexMode.JSON_ADAPTER);
            }
            if (bLiveData.modelDescribe != null) {
                jsonGenerator.writeFieldName("modelDescribe");
                BLiveVoiceModelDescribe.JSON_ADAPTER.serialize(bLiveData.modelDescribe, jsonGenerator, true);
            }
            if (bLiveData.liveMedalCDN != null) {
                jsonGenerator.writeFieldName("liveMedalCDN");
                BLiveLiveMedalCDN.JSON_ADAPTER.serialize(bLiveData.liveMedalCDN, jsonGenerator, true);
            }
            if (bLiveData.voiceLiveUserFeedList != null) {
                jsonGenerator.writeFieldName("voiceLiveUserFeedList");
                JsonAdapter.serializeArray(bLiveData.voiceLiveUserFeedList, jsonGenerator, BLiveVoiceLiveUserFeedList.JSON_ADAPTER);
            }
            if (bLiveData.userRealVoiceLive != null) {
                jsonGenerator.writeFieldName("userRealVoiceLive");
                BLiveVoiceUserRealVoiceLive.JSON_ADAPTER.serialize(bLiveData.userRealVoiceLive, jsonGenerator, true);
            }
            if (bLiveData.userLeaderboard != null) {
                jsonGenerator.writeFieldName("userLeaderboard");
                BLiveUserLeaderboard.JSON_ADAPTER.serialize(bLiveData.userLeaderboard, jsonGenerator, true);
            }
            if (bLiveData.anchorLeaderboard != null) {
                jsonGenerator.writeFieldName("anchorLeaderboard");
                BLiveAnchorLeaderboard.JSON_ADAPTER.serialize(bLiveData.anchorLeaderboard, jsonGenerator, true);
            }
            if (bLiveData.userWeekLeaderboard != null) {
                jsonGenerator.writeFieldName("userWeekLeaderboard");
                BLiveUserLeaderboard.JSON_ADAPTER.serialize(bLiveData.userWeekLeaderboard, jsonGenerator, true);
            }
            if (bLiveData.weekCpInfo != null) {
                jsonGenerator.writeFieldName("weekCpInfo");
                BLiveWeekCpInfo.JSON_ADAPTER.serialize(bLiveData.weekCpInfo, jsonGenerator, true);
            }
            if (bLiveData.auctionCandidates != null) {
                jsonGenerator.writeFieldName("auctionCandidates");
                JsonAdapter.serializeArray(bLiveData.auctionCandidates, jsonGenerator, BLiveAuctionQueueInfo.JSON_ADAPTER);
            }
            if (bLiveData.auctionApplies != null) {
                jsonGenerator.writeFieldName("auctionApplies");
                JsonAdapter.serializeArray(bLiveData.auctionApplies, jsonGenerator, BLiveAuctionQueueInfo.JSON_ADAPTER);
            }
            if (bLiveData.auctionInvites != null) {
                jsonGenerator.writeFieldName("auctionInvites");
                JsonAdapter.serializeArray(bLiveData.auctionInvites, jsonGenerator, BLiveAuctionQueueInfo.JSON_ADAPTER);
            }
            if (bLiveData.voiceLiveAuctionAsset != null) {
                jsonGenerator.writeFieldName("voiceLiveAuctionAsset");
                BLiveAuctionAsset.JSON_ADAPTER.serialize(bLiveData.voiceLiveAuctionAsset, jsonGenerator, true);
            }
            if (bLiveData.auctionRelationCards != null) {
                jsonGenerator.writeFieldName("auctionRelationCards");
                JsonAdapter.serializeArray(bLiveData.auctionRelationCards, jsonGenerator, BLiveAuctionRelationCard.JSON_ADAPTER);
            }
            if (bLiveData.bigTVLives != null) {
                jsonGenerator.writeFieldName("bigTVLives");
                JsonAdapter.serializeArray(bLiveData.bigTVLives, jsonGenerator, BLiveSuggestLive.JSON_ADAPTER);
            }
            if (bLiveData.giftLeaderboard != null) {
                jsonGenerator.writeFieldName("giftLeaderboard");
                BLiveIntlGiftLeaderboard.JSON_ADAPTER.serialize(bLiveData.giftLeaderboard, jsonGenerator, true);
            }
            if (bLiveData.liveClarityLevelInfos != null) {
                jsonGenerator.writeFieldName("liveClarityLevelInfos");
                JsonAdapter.serializeArray(bLiveData.liveClarityLevelInfos, jsonGenerator, BLiveClarity.JSON_ADAPTER);
            }
            if (bLiveData.voiceUserLeaderboards != null) {
                jsonGenerator.writeFieldName("voiceUserLeaderboards");
                BLiveVoiceUserLeaderBoard.JSON_ADAPTER.serialize(bLiveData.voiceUserLeaderboards, jsonGenerator, true);
            }
            if (bLiveData.pkSuggestedAnchors != null) {
                jsonGenerator.writeFieldName("pkSuggestedAnchors");
                JsonAdapter.serializeArray(bLiveData.pkSuggestedAnchors, jsonGenerator, BLivePkSuggestAnchors.JSON_ADAPTER);
            }
            if (bLiveData.liveQuitPopup != null) {
                jsonGenerator.writeFieldName("liveQuitPopup");
                BLiveQuitPopup.JSON_ADAPTER.serialize(bLiveData.liveQuitPopup, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("exchangeTTCRedpoint", bLiveData.exchangeTTCRedpoint);
            if (bLiveData.voiceRoomAsset != null) {
                jsonGenerator.writeFieldName("voiceRoomAsset");
                BLiveVoiceRoomAsset.JSON_ADAPTER.serialize(bLiveData.voiceRoomAsset, jsonGenerator, true);
            }
            if (bLiveData.family != null) {
                jsonGenerator.writeFieldName(IjkMediaPlayer.OnNativeInvokeListener.ARG_FAMILIY);
                BLiveIntlFamilyInfo.JSON_ADAPTER.serialize(bLiveData.family, jsonGenerator, true);
            }
            if (bLiveData.familyShareInfo != null) {
                jsonGenerator.writeFieldName("familyShareInfo");
                BLiveIntlFamilyShareInfo.JSON_ADAPTER.serialize(bLiveData.familyShareInfo, jsonGenerator, true);
            }
            if (bLiveData.userPushSwitch != null) {
                jsonGenerator.writeFieldName("userPushSwitch");
                BLiveIntlPushSwitch.JSON_ADAPTER.serialize(bLiveData.userPushSwitch, jsonGenerator, true);
            }
            if (bLiveData.officialShowCurrentAnchorInfo != null) {
                jsonGenerator.writeFieldName("officialShowCurrentAnchorInfo");
                BLiveOfficialShowCurrentAnchorInfo.JSON_ADAPTER.serialize(bLiveData.officialShowCurrentAnchorInfo, jsonGenerator, true);
            }
            if (bLiveData.officialShowList != null) {
                jsonGenerator.writeFieldName("officialShowList");
                JsonAdapter.serializeArray(bLiveData.officialShowList, jsonGenerator, BLiveOfficialShowListItem.JSON_ADAPTER);
            }
            if (bLiveData.officialShowUser != null) {
                jsonGenerator.writeFieldName("officialShowUser");
                BLiveOfficialShowUser.JSON_ADAPTER.serialize(bLiveData.officialShowUser, jsonGenerator, true);
            }
            if (bLiveData.dragonScourgeDisplayChatMessage != null) {
                jsonGenerator.writeFieldName("dragonScourgeDisplayChatMessage");
                BLiveDragonScourgeDisplayChatMessage.JSON_ADAPTER.serialize(bLiveData.dragonScourgeDisplayChatMessage, jsonGenerator, true);
            }
            if (bLiveData.rights != null) {
                jsonGenerator.writeFieldName("rights");
                JsonAdapter.serializeArray(bLiveData.rights, jsonGenerator, BLiveUserDressUp.JSON_ADAPTER);
            }
            if (bLiveData.auctionPlatformLeaderboardInfo != null) {
                jsonGenerator.writeFieldName("auctionPlatformLeaderboardInfo");
                BLiveAuctionPlatformLeaderboardInfo.JSON_ADAPTER.serialize(bLiveData.auctionPlatformLeaderboardInfo, jsonGenerator, true);
            }
            if (bLiveData.auctionCounter != null) {
                jsonGenerator.writeFieldName("auctionCounter");
                BLiveAuctionCounter.JSON_ADAPTER.serialize(bLiveData.auctionCounter, jsonGenerator, true);
            }
            if (bLiveData.bagpackItem != null) {
                jsonGenerator.writeFieldName("bagpackItem");
                BLiveTabGiftExpiration.JSON_ADAPTER.serialize(bLiveData.bagpackItem, jsonGenerator, true);
            }
            if (bLiveData.giftDetails != null) {
                jsonGenerator.writeFieldName("giftDetails");
                JsonAdapter.serializeArray(bLiveData.giftDetails, jsonGenerator, BLiveGiftDetail.JSON_ADAPTER);
            }
            if (bLiveData.luckyParadiseBottomEntrance != null) {
                jsonGenerator.writeFieldName("luckyParadiseBottomEntrance");
                BLiveLuckyParadiseBottomEntrance.JSON_ADAPTER.serialize(bLiveData.luckyParadiseBottomEntrance, jsonGenerator, true);
            }
            if (bLiveData.intlLiveFramesMetadata != null) {
                jsonGenerator.writeFieldName("intlLiveFramesMetadata");
                BLiveIntlLiveFramesCDN.JSON_ADAPTER.serialize(bLiveData.intlLiveFramesMetadata, jsonGenerator, true);
            }
            if (bLiveData.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(bLiveData.media, jsonGenerator, BLiveIntlMlnMedia.JSON_ADAPTER);
            }
            if (bLiveData.lovePlanet != null) {
                jsonGenerator.writeFieldName(VirtualVoiceMotionType.lovePlanet);
                BLiveLovePlanet.JSON_ADAPTER.serialize(bLiveData.lovePlanet, jsonGenerator, true);
            }
            if (bLiveData.storeBackgroundPics != null) {
                jsonGenerator.writeFieldName("storeBackgroundPics");
                JsonAdapter.serializeArray(bLiveData.storeBackgroundPics, jsonGenerator, BLiveVoiceBackGroundPics.JSON_ADAPTER);
            }
            if (bLiveData.livePopUpGuild != null) {
                jsonGenerator.writeFieldName("livePopUpGuild");
                BLivePopUp.JSON_ADAPTER.serialize(bLiveData.livePopUpGuild, jsonGenerator, true);
            }
            if (bLiveData.voiceLivePopUpGuild != null) {
                jsonGenerator.writeFieldName("voiceLivePopUpGuild");
                BLivePopUp.JSON_ADAPTER.serialize(bLiveData.voiceLivePopUpGuild, jsonGenerator, true);
            }
            if (bLiveData.giftSkinPanel != null) {
                jsonGenerator.writeFieldName("giftSkinPanel");
                BLiveNewGiftSkinListData.JSON_ADAPTER.serialize(bLiveData.giftSkinPanel, jsonGenerator, true);
            }
            if (bLiveData.emojiPlayMenu != null) {
                jsonGenerator.writeFieldName("emojiPlayMenu");
                JsonAdapter.serializeArray(bLiveData.emojiPlayMenu, jsonGenerator, BLiveVoiceEmojiMenu.JSON_ADAPTER);
            }
            if (bLiveData.voicePayGuideUser != null) {
                jsonGenerator.writeFieldName("voicePayGuideUser");
                BLiveVoicePayGuideUser.JSON_ADAPTER.serialize(bLiveData.voicePayGuideUser, jsonGenerator, true);
            }
            if (bLiveData.anchorGuildCheck != null) {
                jsonGenerator.writeFieldName("anchorGuildCheck");
                BLiveGuildAnchorCheck.JSON_ADAPTER.serialize(bLiveData.anchorGuildCheck, jsonGenerator, true);
            }
            if (bLiveData.cpInviteRecords != null) {
                jsonGenerator.writeFieldName("cpInviteRecords");
                JsonAdapter.serializeArray(bLiveData.cpInviteRecords, jsonGenerator, BLiveVoiceSweetCpInviteRecord.JSON_ADAPTER);
            }
            if (bLiveData.siteWideBroadcastFinder != null) {
                jsonGenerator.writeFieldName("siteWideBroadcastFinder");
                SiteWideBroadcastFinder.JSON_ADAPTER.serialize(bLiveData.siteWideBroadcastFinder, jsonGenerator, true);
            }
            if (bLiveData.gameOperationPositions != null) {
                jsonGenerator.writeFieldName("gameOperationPositions");
                JsonAdapter.serializeArray(bLiveData.gameOperationPositions, jsonGenerator, BLiveGameOperationConfig.JSON_ADAPTER);
            }
            if (bLiveData.videoChatLive != null) {
                jsonGenerator.writeFieldName("videoChatLive");
                BLiveVideoChatLive.JSON_ADAPTER.serialize(bLiveData.videoChatLive, jsonGenerator, true);
            }
            if (bLiveData.videoChat != null) {
                jsonGenerator.writeFieldName("videoChat");
                BLiveVideoChat.JSON_ADAPTER.serialize(bLiveData.videoChat, jsonGenerator, true);
            }
            if (bLiveData.videoChatSummary != null) {
                jsonGenerator.writeFieldName("videoChatSummary");
                BLiveVideoChatSummary.JSON_ADAPTER.serialize(bLiveData.videoChatSummary, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isAnchor", bLiveData.isAnchor);
            if (bLiveData.superUserBirthdayDetail != null) {
                jsonGenerator.writeFieldName("superUserBirthdayDetail");
                BLiveSuperGodDetail.JSON_ADAPTER.serialize(bLiveData.superUserBirthdayDetail, jsonGenerator, true);
            }
            if (bLiveData.missedCalls != null) {
                jsonGenerator.writeFieldName("missedCalls");
                JsonAdapter.serializeArray(bLiveData.missedCalls, jsonGenerator, BLiveVideoChatMissedCall.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("missedCallCount", bLiveData.missedCallCount);
            if (bLiveData.anchorCall != null) {
                jsonGenerator.writeFieldName("anchorCall");
                BLiveVideoChatAnchorCall.JSON_ADAPTER.serialize(bLiveData.anchorCall, jsonGenerator, true);
            }
            if (bLiveData.videoChatAssets != null) {
                jsonGenerator.writeFieldName("videoChatAssets");
                BLiveVideoChatAssets.JSON_ADAPTER.serialize(bLiveData.videoChatAssets, jsonGenerator, true);
            }
            if (bLiveData.videoChatSquareSummary != null) {
                jsonGenerator.writeFieldName("videoChatSquareSummary");
                BLiveVideoChatSquareSummary.JSON_ADAPTER.serialize(bLiveData.videoChatSquareSummary, jsonGenerator, true);
            }
            if (bLiveData.videoChatAttendeeCallInfo != null) {
                jsonGenerator.writeFieldName("videoChatAttendeeCallInfo");
                BLiveVideoChatAttendeeCallInfo.JSON_ADAPTER.serialize(bLiveData.videoChatAttendeeCallInfo, jsonGenerator, true);
            }
            if (bLiveData.randomMatchCouponDetail != null) {
                jsonGenerator.writeFieldName("randomMatchCouponDetail");
                BLiveRandomMatchCouponDetail.JSON_ADAPTER.serialize(bLiveData.randomMatchCouponDetail, jsonGenerator, true);
            }
            if (bLiveData.videoChatRandomMatch != null) {
                jsonGenerator.writeFieldName("videoChatRandomMatch");
                BLiveVideoChatRandomMatch.JSON_ADAPTER.serialize(bLiveData.videoChatRandomMatch, jsonGenerator, true);
            }
            String str3 = bLiveData.code;
            if (str3 != null) {
                jsonGenerator.writeStringField("code", str3);
            }
            if (bLiveData.userCompliance != null) {
                jsonGenerator.writeFieldName("userCompliance");
                BLiveUserCompliance.JSON_ADAPTER.serialize(bLiveData.userCompliance, jsonGenerator, true);
            }
            if (bLiveData.gamePanelMenus != null) {
                jsonGenerator.writeFieldName("gamePanelMenus");
                BLiveIntlGamePanelMenus.JSON_ADAPTER.serialize(bLiveData.gamePanelMenus, jsonGenerator, true);
            }
            if (bLiveData.funFairBottomEntrance != null) {
                jsonGenerator.writeFieldName("funFairBottomEntrance");
                BLiveLuckyParadiseBottomEntrance.JSON_ADAPTER.serialize(bLiveData.funFairBottomEntrance, jsonGenerator, true);
            }
            if (bLiveData.voiceSquareButtons != null) {
                jsonGenerator.writeFieldName("voiceSquareButtons");
                JsonAdapter.serializeArray(bLiveData.voiceSquareButtons, jsonGenerator, BLiveVoiceSquareButton.JSON_ADAPTER);
            }
            if (bLiveData.superChatDetail != null) {
                jsonGenerator.writeFieldName("superChatDetail");
                BLiveSuperChatDetail.JSON_ADAPTER.serialize(bLiveData.superChatDetail, jsonGenerator, true);
            }
            if (bLiveData.voiceLeaderboardEntrances != null) {
                jsonGenerator.writeFieldName("voiceLeaderboardEntrances");
                JsonAdapter.serializeArray(bLiveData.voiceLeaderboardEntrances, jsonGenerator, BLiveVoiceLeaderBoardEntranceItem.JSON_ADAPTER);
            }
            if (bLiveData.skinList != null) {
                jsonGenerator.writeFieldName("skinList");
                JsonAdapter.serializeArray(bLiveData.skinList, jsonGenerator, BLiveVoiceSweetLimitHouse.JSON_ADAPTER);
            }
            if (bLiveData.starlightHierarchies != null) {
                jsonGenerator.writeFieldName("starlightHierarchies");
                JsonAdapter.serializeArray(bLiveData.starlightHierarchies, jsonGenerator, BLiveStarlightHierarchy.JSON_ADAPTER);
            }
            if (bLiveData.pkItemCardsDetail != null) {
                jsonGenerator.writeFieldName("pkItemCardsDetail");
                BLivePKCardShowList.JSON_ADAPTER.serialize(bLiveData.pkItemCardsDetail, jsonGenerator, true);
            }
            String str4 = bLiveData.octopusUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("octopusUrl", str4);
            }
            if (bLiveData.intlConfig != null) {
                jsonGenerator.writeFieldName("intlConfig");
                BLiveIntlConfig.JSON_ADAPTER.serialize(bLiveData.intlConfig, jsonGenerator, true);
            }
            if (bLiveData.intlMedalWall != null) {
                jsonGenerator.writeFieldName("intlMedalWall");
                BLiveIntlMedalWallInUserCard.JSON_ADAPTER.serialize(bLiveData.intlMedalWall, jsonGenerator, true);
            }
            if (bLiveData.medalWall != null) {
                jsonGenerator.writeFieldName("medalWall");
                BLiveIntlMedalWall.JSON_ADAPTER.serialize(bLiveData.medalWall, jsonGenerator, true);
            }
            if (bLiveData.gameAsset != null) {
                jsonGenerator.writeFieldName("gameAsset");
                BLiveVoicePlayModeList.JSON_ADAPTER.serialize(bLiveData.gameAsset, jsonGenerator, true);
            }
            if (bLiveData.game != null) {
                jsonGenerator.writeFieldName("game");
                BLiveVoiceGame.JSON_ADAPTER.serialize(bLiveData.game, jsonGenerator, true);
            }
            if (bLiveData.canJoinGame != null) {
                jsonGenerator.writeFieldName("canJoinGame");
                BLiveVoiceCanJoinGame.JSON_ADAPTER.serialize(bLiveData.canJoinGame, jsonGenerator, true);
            }
            if (bLiveData.voiceFanbase != null) {
                jsonGenerator.writeFieldName("voiceFanbase");
                BLiveFansMemberNum.JSON_ADAPTER.serialize(bLiveData.voiceFanbase, jsonGenerator, true);
            }
            if (bLiveData.voiceFanbaseDetail != null) {
                jsonGenerator.writeFieldName("voiceFanbaseDetail");
                BLiveVoiceFanBaseDetail.JSON_ADAPTER.serialize(bLiveData.voiceFanbaseDetail, jsonGenerator, true);
            }
            if (bLiveData.memberLbs != null) {
                jsonGenerator.writeFieldName("memberLbs");
                JsonAdapter.serializeArray(bLiveData.memberLbs, jsonGenerator, BLiveVoiceMemberLb.JSON_ADAPTER);
            }
            if (bLiveData.voiceFanbaseLbs != null) {
                jsonGenerator.writeFieldName("voiceFanbaseLbs");
                JsonAdapter.serializeArray(bLiveData.voiceFanbaseLbs, jsonGenerator, BLiveVoicePlayModeAnchorItem.JSON_ADAPTER);
            }
            if (bLiveData.myJoins != null) {
                jsonGenerator.writeFieldName("myJoins");
                JsonAdapter.serializeArray(bLiveData.myJoins, jsonGenerator, BLiveVoiceFansMyJoin.JSON_ADAPTER);
            }
            if (bLiveData.voiceFanbaseMedals != null) {
                jsonGenerator.writeFieldName("voiceFanbaseMedals");
                JsonAdapter.serializeArray(bLiveData.voiceFanbaseMedals, jsonGenerator, BLiveIntlVoiceMedal.JSON_ADAPTER);
            }
            if (bLiveData.heatBoxEntrance != null) {
                jsonGenerator.writeFieldName("heatBoxEntrance");
                BLiveVoiceHeatBoxEntrance.JSON_ADAPTER.serialize(bLiveData.heatBoxEntrance, jsonGenerator, true);
            }
            if (bLiveData.voicePkInfo != null) {
                jsonGenerator.writeFieldName("voicePkInfo");
                BLiveVoicePkInfo.JSON_ADAPTER.serialize(bLiveData.voicePkInfo, jsonGenerator, true);
            }
            if (bLiveData.guard != null) {
                jsonGenerator.writeFieldName(BLiveTraceServerBiz.guard);
                BLiveBoardGuard.JSON_ADAPTER.serialize(bLiveData.guard, jsonGenerator, true);
            }
            if (bLiveData.bossCall != null) {
                jsonGenerator.writeFieldName("bossCall");
                BLiveBossCall.JSON_ADAPTER.serialize(bLiveData.bossCall, jsonGenerator, true);
            }
            if (bLiveData.bossGiftRecord != null) {
                jsonGenerator.writeFieldName("bossGiftRecord");
                BLiveBossGiftRecord.JSON_ADAPTER.serialize(bLiveData.bossGiftRecord, jsonGenerator, true);
            }
            if (bLiveData.giftWallV3Briefs != null) {
                jsonGenerator.writeFieldName("giftWallV3Briefs");
                JsonAdapter.serializeArray(bLiveData.giftWallV3Briefs, jsonGenerator, BLiveUserCardGiftWall.JSON_ADAPTER);
            }
            if (bLiveData.voiceLiveBulletCommentTypes != null) {
                jsonGenerator.writeFieldName("voiceLiveBulletCommentTypes");
                JsonAdapter.serializeArray(bLiveData.voiceLiveBulletCommentTypes, jsonGenerator, BLiveDanmakuListItem.JSON_ADAPTER);
            }
            if (bLiveData.voiceLiveBulletComment != null) {
                jsonGenerator.writeFieldName("voiceLiveBulletComment");
                BLiveDanmakuItem.JSON_ADAPTER.serialize(bLiveData.voiceLiveBulletComment, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedata";

    @Nullable
    @ProtobufIndex(index = 104)
    public BLiveAccommpanyTasksProgress accompanyTaskProgress;

    @Nullable
    @ProtobufIndex(index = 102)
    public BLiveAccommpanyTaskSummary accompanyTaskSummary;

    @Nullable
    @ProtobufIndex(index = 103)
    public List<BLiveAccommpanyTasks> accompanyTasks;

    @NonNull
    @ProtobufIndex(index = 140)
    public List<BLiveVoiceEndSparkRanking> accompanyUserRanking;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA)
    public List<ActivitySuggests> activitySuggests;

    @Nullable
    @ProtobufIndex(index = 80)
    public List<BLiveAdvanceTask> advancedTasks;

    @NonNull
    @ProtobufIndex(index = 269)
    public BLiveVideoChatAnchorCall anchorCall;

    @NonNull
    @ProtobufIndex(index = 121)
    public List<BLiveDailyTasks> anchorDailyTasks;

    @Nullable
    @ProtobufIndex(index = 53)
    public BLiveCommonViewConfig anchorFanbaseMedal;

    @NonNull
    @ProtobufIndex(index = 258)
    public BLiveGuildAnchorCheck anchorGuildCheck;

    @Nullable
    @ProtobufIndex(index = 32)
    public List<BLiveAnchorLevel> anchorHierarchyGrades;

    @NonNull
    @ProtobufIndex(index = EACTags.OFFSET_DATA_OBJECT)
    public List<BLiveAnchorKnightInfos> anchorKnightInfos;

    @Nullable
    @ProtobufIndex(index = 219)
    public BLiveAnchorLeaderboard anchorLeaderboard;

    @Nullable
    @ProtobufIndex(index = 6)
    public List<BLiveAnchor> anchors;

    @NonNull
    @ProtobufIndex(index = 224)
    public List<BLiveAuctionQueueInfo> auctionApplies;

    @NonNull
    @ProtobufIndex(index = 223)
    public List<BLiveAuctionQueueInfo> auctionCandidates;

    @NonNull
    @ProtobufIndex(index = 246)
    public BLiveAuctionCounter auctionCounter;

    @NonNull
    @ProtobufIndex(index = 225)
    public List<BLiveAuctionQueueInfo> auctionInvites;

    @NonNull
    @ProtobufIndex(index = 243)
    public BLiveAuctionPlatformLeaderboardInfo auctionPlatformLeaderboardInfo;

    @NonNull
    @ProtobufIndex(index = 227)
    public List<BLiveAuctionRelationCard> auctionRelationCards;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256)
    public BLiveVoiceBackGroundPicSetting backGroundPicSetting;

    @Nullable
    @ProtobufIndex(index = 247)
    public BLiveTabGiftExpiration bagpackItem;

    @NonNull
    @ProtobufIndex(index = 228)
    public List<BLiveSuggestLive> bigTVLives;

    @NonNull
    @ProtobufIndex(index = 301)
    public BLiveBossCall bossCall;

    @NonNull
    @ProtobufIndex(index = 302)
    public BLiveBossGiftRecord bossGiftRecord;

    @Nullable
    @ProtobufIndex(index = 63)
    public BLiveBottomMenu bottomMenu;

    @NonNull
    @ProtobufIndex(index = 58)
    public List<BLiveCallInvite> callInvites;

    @NonNull
    @ProtobufIndex(index = 60)
    public List<BLiveCallSummary> callSummaries;

    @NonNull
    @ProtobufIndex(index = 57)
    public List<BLiveCall> calls;

    @NonNull
    @ProtobufIndex(index = 291)
    public BLiveVoiceCanJoinGame canJoinGame;

    @NonNull
    @ProtobufIndex(index = 188)
    public List<VirtualVoiceGroupConversationCell> cells;

    @NonNull
    @ProtobufIndex(index = 181)
    public BLiveChatRealMsgLiveInfo chatMsgLiveInfo;

    @Nullable
    @ProtobufIndex(index = 88)
    public BLiveChatMangerSettings chatSettings;

    @Nullable
    @ProtobufIndex(index = 19)
    public List<BLiveChatTip> chatTips;

    @NonNull
    @ProtobufIndex(index = 213)
    public BLiveVoiceChatTopic chatTopic;

    @NonNull
    @ProtobufIndex(index = 212)
    public BLiveVoiceChatTopicAsset chatTopicAsset;

    @NonNull
    @ProtobufIndex(index = 109)
    public List<BLiveDownChestRewardInfo> chestRewardInfo;

    @NonNull
    @ProtobufIndex(index = 275)
    public String code;

    @NonNull
    @ProtobufIndex(index = 185)
    public BLiveComplexCardFourConfig complexCardConfig;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384)
    public List<BLiveComplexCard> complexCardList;

    @Nullable
    @ProtobufIndex(index = 64)
    public Connector connector;

    @NonNull
    @ProtobufIndex(index = 259)
    public List<BLiveVoiceSweetCpInviteRecord> cpInviteRecords;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256)
    public List<BLiveVoiceSweetCpRecommendUser> cpRecommendUserList;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384)
    public BLiveDailyPayment dailyPayment;

    @NonNull
    @ProtobufIndex(index = IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE)
    public BLiveDragonScourgeDisplayChatMessage dragonScourgeDisplayChatMessage;

    @NonNull
    @ProtobufIndex(index = 256)
    public List<BLiveVoiceEmojiMenu> emojiPlayMenu;

    @NonNull
    @ProtobufIndex(index = EACTags.TRACK1_APPLICATION)
    public BLiveGiftItemShort equippedGift;

    @ProtobufIndex(index = 234)
    public boolean exchangeTTCRedpoint;

    @NonNull
    @ProtobufIndex(index = EACTags.TAG_LIST)
    public BLiveFakeUser fakeUser;

    @NonNull
    @ProtobufIndex(index = EACTags.LOGIN_DATA)
    public List<BLiveFakeUserProfile> fakeUserProfiles;

    @NonNull
    @ProtobufIndex(index = 236)
    public BLiveIntlFamilyInfo family;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256)
    public List<BLiveIntlVoiceMedal> familyMedals;

    @NonNull
    @ProtobufIndex(index = 237)
    public BLiveIntlFamilyShareInfo familyShareInfo;

    @Nullable
    @ProtobufIndex(index = 42)
    public List<BLiveFanBaseDetail> fanbaseDetails;

    @Nullable
    @ProtobufIndex(index = 50)
    public List<BLiveFanBaseHierarchy> fanbaseHierarchies;

    @Nullable
    @ProtobufIndex(index = 46)
    public BLiveFanBaseMedalPanel fanbaseMedalPanel;

    @Nullable
    @ProtobufIndex(index = 51)
    public List<BLiveFanBaseMedal> fanbaseMedals;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA)
    public BFansBaseRecall fanbaseRecall;

    @Nullable
    @ProtobufIndex(index = 56)
    public List<BLiveSquareDetailCounters> fanbaseRedPacketEventCounters;

    @Nullable
    @ProtobufIndex(index = 49)
    public List<BLiveFanBaseRelationShip> fanbaseRelations;

    @Nullable
    @ProtobufIndex(index = 41)
    public List<BLiveFanBase> fanbases;

    @Nullable
    @ProtobufIndex(index = 24)
    public BLiveFirstChargeCampaign firstChargeCampaigns;

    @NonNull
    @ProtobufIndex(index = 126)
    public BLiveFirstRechargeDetail firstRechargeDetail;

    @NonNull
    @ProtobufIndex(index = 125)
    public BLiveFirstRechargeStatus firstRechargeStatus;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384)
    public BLiveHeaddressCoinMarket flameCoinMarket;

    @NonNull
    @ProtobufIndex(index = 23)
    public List<Followship> followships;

    @NonNull
    @ProtobufIndex(index = 278)
    public BLiveLuckyParadiseBottomEntrance funFairBottomEntrance;

    @NonNull
    @ProtobufIndex(index = 290)
    public BLiveVoiceGame game;

    @NonNull
    @ProtobufIndex(index = 289)
    public BLiveVoicePlayModeList gameAsset;

    @NonNull
    @ProtobufIndex(index = 116)
    public String gameInfoResponse;

    @NonNull
    @ProtobufIndex(index = 261)
    public List<BLiveGameOperationConfig> gameOperationPositions;

    @NonNull
    @ProtobufIndex(index = 277)
    public BLiveIntlGamePanelMenus gamePanelMenus;

    @NonNull
    @ProtobufIndex(index = 242)
    public List<BLiveGiftDetail> giftDetails;

    @NonNull
    @ProtobufIndex(index = 21)
    public BLiveGiftItemCDN giftItemCDN;

    @Nullable
    @ProtobufIndex(index = 229)
    public BLiveIntlGiftLeaderboard giftLeaderboard;

    @Nullable
    @ProtobufIndex(index = 105)
    public BLiveGiftSetInfo giftSetInfo;

    @NonNull
    @ProtobufIndex(index = 101)
    public List<BLiveGiftShowcaseItem> giftShowcaseItems;

    @NonNull
    @ProtobufIndex(index = 255)
    public BLiveNewGiftSkinListData giftSkinPanel;

    @Nullable
    @ProtobufIndex(index = 79)
    public BLiveGiftStarBoard giftStar;

    @NonNull
    @ProtobufIndex(index = 303)
    public List<BLiveUserCardGiftWall> giftWallV3Briefs;

    @Nullable
    @ProtobufIndex(index = 33)
    public BLiveGiftBubbleConfig givenGiftRemindConfig;

    @NonNull
    @ProtobufIndex(index = 107)
    public BLiveGivenGiftRemindStatus givenGiftRemindStatus;

    @Nullable
    @ProtobufIndex(index = 10)
    public BLiveSendLiveGiftResult givenGiftRes;

    @NonNull
    @ProtobufIndex(index = 162)
    public List<BLiveVoiceGrabHatCP> grabHatCps;

    @Nullable
    @ProtobufIndex(index = 161)
    public BLiveVoiceGrabHatGame grabHatGame;

    @Nullable
    @ProtobufIndex(index = 47)
    public BLiveFanBaseRedPacketInfo grabRedPacketInfo;

    @Nullable
    @ProtobufIndex(index = 300)
    public BLiveBoardGuard guard;

    @Nullable
    @ProtobufIndex(index = 118)
    public List<BLiveGuardAnchorRankInfo> guardAnchorRankInfos;

    @Nullable
    @ProtobufIndex(index = 119)
    public List<BLiveGuardboardRecord> guardRecords;

    @NonNull
    @ProtobufIndex(index = 298)
    public BLiveVoiceHeatBoxEntrance heatBoxEntrance;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256)
    public List<BLiveHeatVoiceRoomTask> heatVoiceRoomTasks;

    @NonNull
    @ProtobufIndex(index = 61)
    public List<BLiveBoardHierarchy> hierarchies;

    @Nullable
    @ProtobufIndex(index = 27)
    public BLiveHourLeaderBoard hourLeaderboard;

    @NonNull
    @ProtobufIndex(index = 286)
    public BLiveIntlConfig intlConfig;

    @NonNull
    @ProtobufIndex(index = 249)
    public BLiveIntlLiveFramesCDN intlLiveFramesMetadata;

    @NonNull
    @ProtobufIndex(index = 288)
    public BLiveIntlMedalWallInUserCard intlMedalWall;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256)
    public List<BLiveVoiceCampaign> intlVoiceLiveCampaigns;

    @ProtobufIndex(index = 265)
    public boolean isAnchor;

    @NonNull
    @ProtobufIndex(index = EACTags.FILE_REFERENCE)
    public List<BLiveKnightsInfosSummary> knightsInfosSummary;

    @NonNull
    @ProtobufIndex(index = EACTags.DISCRETIONARY_DATA)
    public List<BLiveKnightsRuleInfoItem> knightsRuleInfos;

    @Nullable
    @ProtobufIndex(index = 55)
    public List<BLiveLeaderboardUser> leaderboardUsers;

    @Nullable
    @ProtobufIndex(index = 25)
    public List<BLiveLeaderBoards> leaderboards;

    @Nullable
    @ProtobufIndex(index = 14)
    public List<BLiveActivity> liveActivities;

    @Nullable
    @ProtobufIndex(index = 13)
    public List<BLiveActivitySummary> liveActivitySummaries;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA)
    public List<BLiveAnchors> liveAnchors;

    @Nullable
    @ProtobufIndex(index = 31)
    public BLiveAssets liveAssets;

    @Nullable
    @ProtobufIndex(index = 112)
    public BLiveBeautyFilterConfig liveBeautyConfig;

    @Nullable
    @ProtobufIndex(index = 17)
    public List<BLiveCampaign> liveCampaigns;

    @Nullable
    @ProtobufIndex(index = 11)
    public List<BLiveChatMessage> liveChatMessages;

    @NonNull
    @ProtobufIndex(index = 230)
    public List<BLiveClarity> liveClarityLevelInfos;

    @Nullable
    @ProtobufIndex(index = 18)
    public List<BLiveUserLevel> liveHierarchyGrades;

    @NonNull
    @ProtobufIndex(index = 221)
    public BLiveLiveMedalCDN liveMedalCDN;

    @Nullable
    @ProtobufIndex(index = 76)
    public BLiveOperation liveOperation;

    @Nullable
    @ProtobufIndex(index = 253)
    public BLivePopUp livePopUpGuild;

    @Nullable
    @ProtobufIndex(index = 20)
    public List<BLivePush> livePushes;

    @Nullable
    @ProtobufIndex(index = 233)
    public BLiveQuitPopup liveQuitPopup;

    @Nullable
    @ProtobufIndex(index = 40)
    public List<BLiveEffect> liveResources;

    @Nullable
    @ProtobufIndex(index = 123)
    public BLiveResourceCDN liveResourcesCDN;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256)
    public BLiveRoomInProfile liveRoomInProfile;

    @NonNull
    @ProtobufIndex(index = 22)
    public BLiveRoomTabGifts liveRoomTabGifts;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA)
    public List<LiveMultiCallLiveSchema> liveSchemas;

    @Nullable
    @ProtobufIndex(index = 12)
    public List<BLiveSquareSummary> liveSquareSummaries;

    @Nullable
    @ProtobufIndex(index = 35)
    public List<BLiveStickerMetaDataItem> liveStickerTemplates;

    @Nullable
    @ProtobufIndex(index = 159)
    public List<BLiveStickerTemplatesGiftItem> liveStickerTemplatesGifts;

    @Nullable
    @ProtobufIndex(index = 34)
    public BLiveStickerMetaData liveStickerTemplatesMetadata;

    @Nullable
    @ProtobufIndex(index = 36)
    public List<BLiveAddStickerResult> liveStickers;

    @Nullable
    @ProtobufIndex(index = 9)
    public List<BLiveSummary> liveSummaries;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA)
    public BLiveTopChatMessage liveTopChatMessage;

    @Nullable
    @ProtobufIndex(index = 8)
    public List<BLive> lives;

    @NonNull
    @ProtobufIndex(index = 251)
    public BLiveLovePlanet lovePlanet;

    @NonNull
    @ProtobufIndex(index = 248)
    public BLiveLuckyParadiseBottomEntrance luckyParadiseBottomEntrance;

    @NonNull
    @ProtobufIndex(index = 15)
    public List<BLiveMember> managers;

    @NonNull
    @ProtobufIndex(index = 87)
    public List<BLiveUserMask> masks;

    @NonNull
    @ProtobufIndex(index = 287)
    public BLiveIntlMedalWall medalWall;

    @Nullable
    @ProtobufIndex(index = 54)
    public List<BLiveLeaderboardMedal> medals;

    @NonNull
    @ProtobufIndex(index = 250)
    public List<BLiveIntlMlnMedia> media;

    @NonNull
    @ProtobufIndex(index = 153)
    public List<BLiveMemberActivityData> memberActivityList;

    @NonNull
    @ProtobufIndex(index = 294)
    public List<BLiveVoiceMemberLb> memberLbs;

    @Nullable
    @ProtobufIndex(index = 5)
    public List<BLiveMember> members;

    @Nullable
    @ProtobufIndex(index = 16)
    public List<BLiveMenuItem> menuItems;

    @ProtobufIndex(index = 268)
    public int missedCallCount;

    @NonNull
    @ProtobufIndex(index = 267)
    public List<BLiveVideoChatMissedCall> missedCalls;

    @NonNull
    @ProtobufIndex(index = 215)
    public BLiveVoiceModelDescribe modelDescribe;

    @Nullable
    @ProtobufIndex(index = 28)
    public BLiveMomentConfig momentConfig;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveMonetizationConfig monetizationConfig;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA)
    public BLiveMultiCallAsset multiCallAsset;

    @Nullable
    @ProtobufIndex(index = 149)
    public List<BLiveMultiCallExtend> multiCallExtends;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA)
    public List<BLiveMultiCallInvite> multiCallInvites;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_RC4_128_SHA)
    public BLiveMultiCallSummary multiCallSummary;

    @NonNull
    @ProtobufIndex(index = 148)
    public BLiveMultiCallSwitchToLeadRoleInvite multiCallSwitchToLeadRoleInvite;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA)
    public List<BLiveMultiCall> multiCalls;

    @NonNull
    @ProtobufIndex(index = 207)
    public BLiveMultiPkDetail multiPk;

    @NonNull
    @ProtobufIndex(index = 209)
    public BLiveMultiPkAsset multiPkAsset;

    @NonNull
    @ProtobufIndex(index = 210)
    public BLiveMultiPkLeaderboard multiPkLeaderboard;

    @NonNull
    @ProtobufIndex(index = 208)
    public BLiveMultiPkPanel multiPkPanel;

    @Nullable
    @ProtobufIndex(index = 214)
    public List<BLiveVoiceMutexMode> mutexMode;

    @NonNull
    @ProtobufIndex(index = 296)
    public List<BLiveVoiceFansMyJoin> myJoins;

    @NonNull
    @ProtobufIndex(index = EACTags.HEADER_LIST)
    public BLiveHideAvatarEnterConfig mysteryConfig;

    @ProtobufIndex(index = 151)
    public boolean needTitle;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256)
    public BLiveNiceNumberDetail nobleNiceNumberDetail;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256)
    public BLiveNiceNumberList nobleNiceNumberList;

    @NonNull
    @ProtobufIndex(index = 285)
    public String octopusUrl;

    @Nullable
    @ProtobufIndex(index = 239)
    public BLiveOfficialShowCurrentAnchorInfo officialShowCurrentAnchorInfo;

    @Nullable
    @ProtobufIndex(index = 240)
    public List<BLiveOfficialShowListItem> officialShowList;

    @Nullable
    @ProtobufIndex(index = 241)
    public BLiveOfficialShowUser officialShowUser;

    @NonNull
    @ProtobufIndex(index = 90)
    public BLivePkAssets pkAssets;

    @Nullable
    @ProtobufIndex(index = 38)
    public List<BLivePkInvite> pkInvites;

    @NonNull
    @ProtobufIndex(index = 284)
    public BLivePKCardShowList pkItemCardsDetail;

    @Nullable
    @ProtobufIndex(index = 37)
    public List<BLivePkSeek> pkSeeks;

    @NonNull
    @ProtobufIndex(index = 232)
    public List<BLivePkSuggestAnchors> pkSuggestedAnchors;

    @NonNull
    @ProtobufIndex(index = 95)
    public List<BLivePkSummary> pkSummaries;

    @Nullable
    @ProtobufIndex(index = 39)
    public List<BLivePk> pks;

    @NonNull
    @ProtobufIndex(index = Opcodes.IADD)
    public List<BLiveCommonViewConfig> previews;

    @NonNull
    @ProtobufIndex(index = EACTags.NAME)
    public List<BLiveUserPrivacyPrivilege> privacyPrivilege;

    @NonNull
    @ProtobufIndex(index = 273)
    public BLiveRandomMatchCouponDetail randomMatchCouponDetail;

    @Nullable
    @ProtobufIndex(index = 52)
    public List<BLiveLeaderboardRecord> records;

    @Nullable
    @ProtobufIndex(index = 48)
    public BLiveFanBaseRedPacketInfo redPacketGrabResult;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Relationship> relationships;

    @Nullable
    @ProtobufIndex(index = 74)
    public BLiveRightInfo right;

    @Nullable
    @ProtobufIndex(index = 75)
    public List<BLiveRightAnchorInfo> rightBindAnchors;

    @NonNull
    @ProtobufIndex(index = 245)
    public List<BLiveUserDressUp> rights;

    @NonNull
    @ProtobufIndex(index = 158)
    public BLiveMultiCallAnnouncement roomAnnouncement;

    @Nullable
    @ProtobufIndex(index = 7)
    public List<BLiveRoom> rooms;

    @NonNull
    @ProtobufIndex(index = 59)
    public List<BLiveRtcToken> rtcTokens;

    @NonNull
    @ProtobufIndex(index = 187)
    public String schema;

    @Nullable
    @ProtobufIndex(index = 150)
    public BLiveCommonViewConfig scoreSummary;

    @Nullable
    @ProtobufIndex(index = 106)
    public List<BLiveScrapTabData> scrapTabs;

    @Nullable
    @ProtobufIndex(index = 128)
    public List<BLiveVoiceShareItems> shareItems;

    @NonNull
    @ProtobufIndex(index = 193)
    public BLiveVoiceShareUrlConfig shareRoomConfig;

    @NonNull
    @ProtobufIndex(index = 205)
    public BLiveSideBarConfig showSideBarConfig;

    @Nullable
    @ProtobufIndex(index = 117)
    public List<BLiveSignInAchievementMedals> signInAchievementMedals;

    @Nullable
    @ProtobufIndex(index = 110)
    public List<BLiveSignInDetail> signInDetails;

    @Nullable
    @ProtobufIndex(index = 111)
    public List<BLiveSignPrizes> signInPrizes;

    @NonNull
    @ProtobufIndex(index = 260)
    public SiteWideBroadcastFinder siteWideBroadcastFinder;

    @NonNull
    @ProtobufIndex(index = 282)
    public List<BLiveVoiceSweetLimitHouse> skinList;

    @NonNull
    @ProtobufIndex(index = 130)
    public List<BLiveGiftSkin> skins;

    @NonNull
    @ProtobufIndex(index = 85)
    public BLiveUpgradeGiftInfo slotInfo;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA)
    public BLiveVoiceEndSparkProgress sparkletProgress;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA)
    public List<BLiveEntranceSummary> squareEntranceSummary;

    @NonNull
    @ProtobufIndex(index = 204)
    public List<BLiveVoiceStarRedPacket> starRedPackets;

    @NonNull
    @ProtobufIndex(index = 283)
    public List<BLiveStarlightHierarchy> starlightHierarchies;

    @NonNull
    @ProtobufIndex(index = 26)
    public List<BLivePageCampaign> startLivePageCampaigns;

    @NonNull
    @ProtobufIndex(index = 252)
    public List<BLiveVoiceBackGroundPics> storeBackgroundPics;

    @NonNull
    @ProtobufIndex(index = 122)
    public BLiveStormDanmaku stormComment;

    @NonNull
    @ProtobufIndex(index = 144)
    public List<BLiveSuggestLive> suggestedLives;

    @NonNull
    @ProtobufIndex(index = 279)
    public BLiveSuperChatDetail superChatDetail;

    @NonNull
    @ProtobufIndex(index = 266)
    public BLiveSuperGodDetail superUserBirthdayDetail;

    @Nullable
    @ProtobufIndex(index = 44)
    public BLiveTaskSummary taskSummary;

    @Nullable
    @ProtobufIndex(index = 43)
    public List<BLiveTask> tasks;

    @Nullable
    @ProtobufIndex(index = 115)
    public List<BLiveTeenagerLive> teenagerLives;

    @NonNull
    @ProtobufIndex(index = 72)
    public List<BLiveVoiceTopic> topics;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA)
    public BLiveTouchMeDetail touchMeDetail;

    @Nullable
    @ProtobufIndex(index = 29)
    public BLiveTreasureBox treasureBox;

    @Nullable
    @ProtobufIndex(index = 66)
    public BLiveTurboCardInfo turboCardInfo;

    @NonNull
    @ProtobufIndex(index = 276)
    public BLiveUserCompliance userCompliance;

    @NonNull
    @ProtobufIndex(index = 120)
    public List<BLiveDailyTasks> userDailyTasks;

    @Nullable
    @ProtobufIndex(index = 62)
    public List<BLiveEnterRoomEffect> userEnterRoomEffects;

    @NonNull
    @ProtobufIndex(index = EACTags.COMMAND_TO_PERFORM)
    public List<BLiveUserKnightInfoSummary> userKnightInfosSummary;

    @NonNull
    @ProtobufIndex(index = 218)
    public BLiveUserLeaderboard userLeaderboard;

    @NonNull
    @ProtobufIndex(index = 108)
    public BLiveUserLevel userLiveHierarchy;

    @Nullable
    @ProtobufIndex(index = 114)
    public BLiveHierarchyProgress userLiveHierarchyProgress;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA)
    public BLivePush userLivePush;

    @NonNull
    @ProtobufIndex(index = 99)
    public List<BLiveUserRightResource> userLiveRightResources;

    @Nullable
    @ProtobufIndex(index = 65)
    public List<BLiveUserProfileConfig> userProfileConfig;

    @NonNull
    @ProtobufIndex(index = 238)
    public BLiveIntlPushSwitch userPushSwitch;

    @NonNull
    @ProtobufIndex(index = 217)
    public BLiveVoiceUserRealVoiceLive userRealVoiceLive;

    @NonNull
    @ProtobufIndex(index = 222)
    public BLiveUserLeaderboard userWeekLeaderboard;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<User> users;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveVerificationCenter> verificationCenter;

    @ProtobufIndex(index = 45)
    public long version;

    @NonNull
    @ProtobufIndex(index = 263)
    public BLiveVideoChat videoChat;

    @NonNull
    @ProtobufIndex(index = 270)
    public BLiveVideoChatAssets videoChatAssets;

    @NonNull
    @ProtobufIndex(index = 272)
    public BLiveVideoChatAttendeeCallInfo videoChatAttendeeCallInfo;

    @NonNull
    @ProtobufIndex(index = 262)
    public BLiveVideoChatLive videoChatLive;

    @NonNull
    @ProtobufIndex(index = 274)
    public BLiveVideoChatRandomMatch videoChatRandomMatch;

    @NonNull
    @ProtobufIndex(index = 271)
    public BLiveVideoChatSquareSummary videoChatSquareSummary;

    @NonNull
    @ProtobufIndex(index = 264)
    public BLiveVideoChatSummary videoChatSummary;

    @Nullable
    @ProtobufIndex(index = EACTags.FCP_TEMPLATE)
    public BLiveDanmakuItem videoLiveBulletComment;

    @Nullable
    @ProtobufIndex(index = EACTags.APPLICATION_TEMPLATE)
    public BLiveDanmakuList videoLiveBulletCommentTypes;

    @Nullable
    @ProtobufIndex(index = 30)
    public List<BLiveVideoQuality> videoQualities;

    @NonNull
    @ProtobufIndex(index = 180)
    public List<BLiveVirtualVoiceCard> virtualVoiceCard;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256)
    public BLiveVoiceAdminPanelCounter voiceAdminPanelCounter;

    @NonNull
    @ProtobufIndex(index = 68)
    public List<BLiveVoiceCallInvite> voiceCallInvites;

    @NonNull
    @ProtobufIndex(index = 69)
    public List<BLiveVoiceCallSummary> voiceCallSummaries;

    @NonNull
    @ProtobufIndex(index = 67)
    public List<BLiveVoiceCall> voiceCalls;

    @NonNull
    @ProtobufIndex(index = 131)
    public BLiveVoiceChatGroup voiceChatGroup;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA)
    public List<BLiveVoiceChatGroupApply> voiceChatGroupApplies;

    @NonNull
    @ProtobufIndex(index = 167)
    public BLiveVoiceCpHouseRankAwardInfo voiceCpHouseInfo;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256)
    public List<BLiveVoiceCpHouseInfo> voiceCpHouseList;

    @NonNull
    @ProtobufIndex(index = 166)
    public BLiveVoiceCpHouseTaskInfos voiceCpHouseTaskInfos;

    @NonNull
    @ProtobufIndex(index = 165)
    public BLiveVoiceCpLeaderBoards voiceCpLeaderBoards;

    @NonNull
    @ProtobufIndex(index = 292)
    public BLiveFansMemberNum voiceFanbase;

    @NonNull
    @ProtobufIndex(index = 293)
    public BLiveVoiceFanBaseDetail voiceFanbaseDetail;

    @NonNull
    @ProtobufIndex(index = 295)
    public List<BLiveVoicePlayModeAnchorItem> voiceFanbaseLbs;

    @NonNull
    @ProtobufIndex(index = 297)
    public List<BLiveIntlVoiceMedal> voiceFanbaseMedals;

    @NonNull
    @ProtobufIndex(index = 177)
    public List<BLiveVoiceFollowship> voiceFollowships;

    @NonNull
    @ProtobufIndex(index = Opcodes.IFNONNULL)
    public BLiveVoiceGiftWall voiceGiftWall;

    @NonNull
    @ProtobufIndex(index = 176)
    public BLiveVoiceGiftWallBookInfo voiceGiftWallBookDetail;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384)
    public BLiveVoiceGiftWallBrief voiceGiftWallBriefInfo;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256)
    public List<BLiveVoiceGiftWallBookInfo> voiceGiftWallList;

    @NonNull
    @ProtobufIndex(index = 169)
    public BLiveVoiceHouseRankUpgradeInfo voiceHouseRankUpgradeInfo;

    @NonNull
    @ProtobufIndex(index = 182)
    public BLiveVoiceKtvGameInfo voiceKTVGame;

    @NonNull
    @ProtobufIndex(index = 184)
    public List<BLiveVoiceKTVOrder> voiceKTVOrders;

    @NonNull
    @ProtobufIndex(index = 183)
    public List<BLiveVoiceKTVSong> voiceKTVSongs;

    @NonNull
    @ProtobufIndex(index = 281)
    public List<BLiveVoiceLeaderBoardEntranceItem> voiceLeaderboardEntrances;

    @NonNull
    @ProtobufIndex(index = 154)
    public BLiveVoiceLiveActivityMoment voiceLiveActivityMoment;

    @NonNull
    @ProtobufIndex(index = 124)
    public BLiveVoiceLiveAssert voiceLiveAssert;

    @NonNull
    @ProtobufIndex(index = 226)
    public BLiveAuctionAsset voiceLiveAuctionAsset;

    @NonNull
    @ProtobufIndex(index = 163)
    public List<BLiveVoiceAuction> voiceLiveAuctions;

    @NonNull
    @ProtobufIndex(index = 206)
    public List<BLiveVoiceFeedBanners> voiceLiveBanners;

    @NonNull
    @ProtobufIndex(index = HttpStatus.USE_PROXY_305)
    public BLiveDanmakuItem voiceLiveBulletComment;

    @NonNull
    @ProtobufIndex(index = HttpStatus.NOT_MODIFIED_304)
    public List<BLiveDanmakuListItem> voiceLiveBulletCommentTypes;

    @NonNull
    @ProtobufIndex(index = 89)
    public List<VoiceLiveGame> voiceLiveGames;

    @NonNull
    @ProtobufIndex(index = 157)
    public BLiveVoiceHeartBeat voiceLiveHeartBeat;

    @Nullable
    @ProtobufIndex(index = 254)
    public BLivePopUp voiceLivePopUpGuild;

    @NonNull
    @ProtobufIndex(index = 160)
    public BLiveVoicePopTotal voiceLivePopsTotal;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256)
    public BLiveVoiceLivePush voiceLivePush;

    @NonNull
    @ProtobufIndex(index = EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE)
    public List<BLiveSummary> voiceLiveSummaries;

    @NonNull
    @ProtobufIndex(index = 216)
    public List<BLiveVoiceLiveUserFeedList> voiceLiveUserFeedList;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256)
    public BLiveVoiceUserHeartbeatRewardList voiceLiveUserHeartbeatRewardList;

    @NonNull
    @ProtobufIndex(index = 71)
    public List<BLiveVoice> voiceLives;

    @NonNull
    @ProtobufIndex(index = 77)
    public List<BLiveFeedSummary> voiceLivesSummary;

    @Nullable
    @ProtobufIndex(index = CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA)
    public List<BLiveVoiceManagerInvite> voiceManagerInvites;

    @NonNull
    @ProtobufIndex(index = 134)
    public List<BLiveVoiceManager> voiceManagers;

    @NonNull
    @ProtobufIndex(index = 200)
    public BLiveVoiceMedalWallIList voiceMedalWall;

    @NonNull
    @ProtobufIndex(index = 257)
    public BLiveVoicePayGuideUser voicePayGuideUser;

    @NonNull
    @ProtobufIndex(index = 299)
    public BLiveVoicePkInfo voicePkInfo;

    @NonNull
    @ProtobufIndex(index = 235)
    public BLiveVoiceRoomAsset voiceRoomAsset;

    @NonNull
    @ProtobufIndex(index = Primes.SMALL_FACTOR_LIMIT)
    public List<BLiveVoiceRoomClass> voiceRoomClasses;

    @Nullable
    @ProtobufIndex(index = MMConstants.ERR_WATERMARK_READ)
    public List<BLiveVoiceRoomFeed> voiceRoomFeeds;

    @Nullable
    @ProtobufIndex(index = Opcodes.IFNULL)
    public BLiveVoiceRoomInProfile voiceRoomInProfile;

    @NonNull
    @ProtobufIndex(index = 202)
    public BLiveVoiceRoomLevelDetail voiceRoomLevelDetail;

    @NonNull
    @ProtobufIndex(index = 203)
    public BLiveVoiceVirtualRoomSummary voiceRoomSummary;

    @NonNull
    @ProtobufIndex(index = 78)
    public BLiveVoiceRoomTagInfo voiceRoomTagInfo;

    @NonNull
    @ProtobufIndex(index = 70)
    public List<BLiveVoiceRoom> voiceRooms;

    @NonNull
    @ProtobufIndex(index = CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256)
    public List<BLiveVoiceSettle> voiceSettles;

    @NonNull
    @ProtobufIndex(index = 280)
    public List<BLiveVoiceSquareButton> voiceSquareButtons;

    @NonNull
    @ProtobufIndex(index = 127)
    public List<BLiveVoiceTab> voiceTabs;

    @NonNull
    @ProtobufIndex(index = 113)
    public List<BLiveVoiceUserFeedInfos> voiceUserFeedInfos;

    @NonNull
    @ProtobufIndex(index = 178)
    public List<BLiveVoiceUserGiftItem> voiceUserGiftItems;

    @NonNull
    @ProtobufIndex(index = 231)
    public BLiveVoiceUserLeaderBoard voiceUserLeaderboards;

    @NonNull
    @ProtobufIndex(index = 192)
    public BLiveVoiceUserMessageRemind voiceUserMessageRemind;

    @NonNull
    @ProtobufIndex(index = 100)
    public List<BLiveVoiceUserProfileConfig> voiceUserProfileConfigs;

    @NonNull
    @ProtobufIndex(index = 201)
    public BLiveVoiceHourLeaderBoard voiceWeekLeaderboards;

    @NonNull
    @ProtobufIndex(index = 220)
    public BLiveWeekCpInfo weekCpInfo;

    public static BLiveData new_() {
        BLiveData bLiveData = new BLiveData();
        bLiveData.nullCheck();
        return bLiveData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveData mo225055clone() {
        BLiveData bLiveData = new BLiveData();
        List<User> list = this.users;
        if (list != null) {
            bLiveData.users = ValueObject.util_map(list, new qcj() { // from class: l.it1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).mo225055clone();
                }
            });
        }
        List<Relationship> list2 = this.relationships;
        if (list2 != null) {
            bLiveData.relationships = ValueObject.util_map(list2, new qcj() { // from class: l.cx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Relationship) obj).mo225055clone();
                }
            });
        }
        List<BLiveVerificationCenter> list3 = this.verificationCenter;
        if (list3 != null) {
            bLiveData.verificationCenter = ValueObject.util_map(list3, new qcj() { // from class: l.ox1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVerificationCenter) obj).mo225055clone();
                }
            });
        }
        BLiveMonetizationConfig bLiveMonetizationConfig = this.monetizationConfig;
        if (bLiveMonetizationConfig != null) {
            bLiveData.monetizationConfig = bLiveMonetizationConfig.mo225055clone();
        }
        List<BLiveMember> list4 = this.members;
        if (list4 != null) {
            bLiveData.members = ValueObject.util_map(list4, new qcj() { // from class: l.ay1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMember) obj).mo225055clone();
                }
            });
        }
        List<BLiveAnchor> list5 = this.anchors;
        if (list5 != null) {
            bLiveData.anchors = ValueObject.util_map(list5, new qcj() { // from class: l.ny1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAnchor) obj).mo225055clone();
                }
            });
        }
        List<BLiveRoom> list6 = this.rooms;
        if (list6 != null) {
            bLiveData.rooms = ValueObject.util_map(list6, new qcj() { // from class: l.kt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveRoom) obj).mo225055clone();
                }
            });
        }
        List<BLive> list7 = this.lives;
        if (list7 != null) {
            bLiveData.lives = ValueObject.util_map(list7, new qcj() { // from class: l.wt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLive) obj).mo225055clone();
                }
            });
        }
        List<BLiveSummary> list8 = this.liveSummaries;
        if (list8 != null) {
            bLiveData.liveSummaries = ValueObject.util_map(list8, new qcj() { // from class: l.iu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSummary) obj).mo225055clone();
                }
            });
        }
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = this.givenGiftRes;
        if (bLiveSendLiveGiftResult != null) {
            bLiveData.givenGiftRes = bLiveSendLiveGiftResult.mo225055clone();
        }
        List<BLiveChatMessage> list9 = this.liveChatMessages;
        if (list9 != null) {
            bLiveData.liveChatMessages = ValueObject.util_map(list9, new qcj() { // from class: l.uu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveChatMessage) obj).mo225055clone();
                }
            });
        }
        List<BLiveSquareSummary> list10 = this.liveSquareSummaries;
        if (list10 != null) {
            bLiveData.liveSquareSummaries = ValueObject.util_map(list10, new qcj() { // from class: l.gv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSquareSummary) obj).mo225055clone();
                }
            });
        }
        List<BLiveActivitySummary> list11 = this.liveActivitySummaries;
        if (list11 != null) {
            bLiveData.liveActivitySummaries = ValueObject.util_map(list11, new qcj() { // from class: l.eu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveActivitySummary) obj).mo225055clone();
                }
            });
        }
        List<BLiveActivity> list12 = this.liveActivities;
        if (list12 != null) {
            bLiveData.liveActivities = ValueObject.util_map(list12, new qcj() { // from class: l.qv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveActivity) obj).mo225055clone();
                }
            });
        }
        List<BLiveMember> list13 = this.managers;
        if (list13 != null) {
            bLiveData.managers = ValueObject.util_map(list13, new qcj() { // from class: l.cw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMember) obj).mo225055clone();
                }
            });
        }
        List<BLiveMenuItem> list14 = this.menuItems;
        if (list14 != null) {
            bLiveData.menuItems = ValueObject.util_map(list14, new qcj() { // from class: l.ow1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMenuItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveCampaign> list15 = this.liveCampaigns;
        if (list15 != null) {
            bLiveData.liveCampaigns = ValueObject.util_map(list15, new qcj() { // from class: l.ww1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCampaign) obj).mo225055clone();
                }
            });
        }
        List<BLiveUserLevel> list16 = this.liveHierarchyGrades;
        if (list16 != null) {
            bLiveData.liveHierarchyGrades = ValueObject.util_map(list16, new qcj() { // from class: l.xw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserLevel) obj).mo225055clone();
                }
            });
        }
        List<BLiveChatTip> list17 = this.chatTips;
        if (list17 != null) {
            bLiveData.chatTips = ValueObject.util_map(list17, new qcj() { // from class: l.yw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveChatTip) obj).mo225055clone();
                }
            });
        }
        List<BLivePush> list18 = this.livePushes;
        if (list18 != null) {
            bLiveData.livePushes = ValueObject.util_map(list18, new qcj() { // from class: l.zw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePush) obj).mo225055clone();
                }
            });
        }
        BLiveGiftItemCDN bLiveGiftItemCDN = this.giftItemCDN;
        if (bLiveGiftItemCDN != null) {
            bLiveData.giftItemCDN = bLiveGiftItemCDN.mo225055clone();
        }
        BLiveRoomTabGifts bLiveRoomTabGifts = this.liveRoomTabGifts;
        if (bLiveRoomTabGifts != null) {
            bLiveData.liveRoomTabGifts = bLiveRoomTabGifts.mo225055clone();
        }
        List<Followship> list19 = this.followships;
        if (list19 != null) {
            bLiveData.followships = ValueObject.util_map(list19, new qcj() { // from class: l.ax1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Followship) obj).mo225055clone();
                }
            });
        }
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign = this.firstChargeCampaigns;
        if (bLiveFirstChargeCampaign != null) {
            bLiveData.firstChargeCampaigns = bLiveFirstChargeCampaign.mo225055clone();
        }
        List<BLiveLeaderBoards> list20 = this.leaderboards;
        if (list20 != null) {
            bLiveData.leaderboards = ValueObject.util_map(list20, new qcj() { // from class: l.bx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveLeaderBoards) obj).mo225055clone();
                }
            });
        }
        List<BLivePageCampaign> list21 = this.startLivePageCampaigns;
        if (list21 != null) {
            bLiveData.startLivePageCampaigns = ValueObject.util_map(list21, new qcj() { // from class: l.dx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePageCampaign) obj).mo225055clone();
                }
            });
        }
        BLiveHourLeaderBoard bLiveHourLeaderBoard = this.hourLeaderboard;
        if (bLiveHourLeaderBoard != null) {
            bLiveData.hourLeaderboard = bLiveHourLeaderBoard.mo225055clone();
        }
        BLiveMomentConfig bLiveMomentConfig = this.momentConfig;
        if (bLiveMomentConfig != null) {
            bLiveData.momentConfig = bLiveMomentConfig.mo225055clone();
        }
        BLiveTreasureBox bLiveTreasureBox = this.treasureBox;
        if (bLiveTreasureBox != null) {
            bLiveData.treasureBox = bLiveTreasureBox.mo225055clone();
        }
        List<BLiveVideoQuality> list22 = this.videoQualities;
        if (list22 != null) {
            bLiveData.videoQualities = ValueObject.util_map(list22, new qcj() { // from class: l.ex1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVideoQuality) obj).mo225055clone();
                }
            });
        }
        BLiveAssets bLiveAssets = this.liveAssets;
        if (bLiveAssets != null) {
            bLiveData.liveAssets = bLiveAssets.mo225055clone();
        }
        List<BLiveAnchorLevel> list23 = this.anchorHierarchyGrades;
        if (list23 != null) {
            bLiveData.anchorHierarchyGrades = ValueObject.util_map(list23, new qcj() { // from class: l.gx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAnchorLevel) obj).mo225055clone();
                }
            });
        }
        BLiveGiftBubbleConfig bLiveGiftBubbleConfig = this.givenGiftRemindConfig;
        if (bLiveGiftBubbleConfig != null) {
            bLiveData.givenGiftRemindConfig = bLiveGiftBubbleConfig.mo225055clone();
        }
        BLiveStickerMetaData bLiveStickerMetaData = this.liveStickerTemplatesMetadata;
        if (bLiveStickerMetaData != null) {
            bLiveData.liveStickerTemplatesMetadata = bLiveStickerMetaData.mo225055clone();
        }
        List<BLiveStickerMetaDataItem> list24 = this.liveStickerTemplates;
        if (list24 != null) {
            bLiveData.liveStickerTemplates = ValueObject.util_map(list24, new qcj() { // from class: l.hx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveStickerMetaDataItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveAddStickerResult> list25 = this.liveStickers;
        if (list25 != null) {
            bLiveData.liveStickers = ValueObject.util_map(list25, new qcj() { // from class: l.ix1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAddStickerResult) obj).mo225055clone();
                }
            });
        }
        List<BLivePkSeek> list26 = this.pkSeeks;
        if (list26 != null) {
            bLiveData.pkSeeks = ValueObject.util_map(list26, new qcj() { // from class: l.jx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkSeek) obj).mo225055clone();
                }
            });
        }
        List<BLivePkInvite> list27 = this.pkInvites;
        if (list27 != null) {
            bLiveData.pkInvites = ValueObject.util_map(list27, new qcj() { // from class: l.kx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkInvite) obj).mo225055clone();
                }
            });
        }
        List<BLivePk> list28 = this.pks;
        if (list28 != null) {
            bLiveData.pks = ValueObject.util_map(list28, new qcj() { // from class: l.lx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePk) obj).mo225055clone();
                }
            });
        }
        List<BLiveEffect> list29 = this.liveResources;
        if (list29 != null) {
            bLiveData.liveResources = ValueObject.util_map(list29, new qcj() { // from class: l.mx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveEffect) obj).mo225055clone();
                }
            });
        }
        List<BLiveFanBase> list30 = this.fanbases;
        if (list30 != null) {
            bLiveData.fanbases = ValueObject.util_map(list30, new qcj() { // from class: l.nx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFanBase) obj).mo225055clone();
                }
            });
        }
        List<BLiveFanBaseDetail> list31 = this.fanbaseDetails;
        if (list31 != null) {
            bLiveData.fanbaseDetails = ValueObject.util_map(list31, new qcj() { // from class: l.px1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFanBaseDetail) obj).mo225055clone();
                }
            });
        }
        List<BLiveTask> list32 = this.tasks;
        if (list32 != null) {
            bLiveData.tasks = ValueObject.util_map(list32, new qcj() { // from class: l.rx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveTask) obj).mo225055clone();
                }
            });
        }
        BLiveTaskSummary bLiveTaskSummary = this.taskSummary;
        if (bLiveTaskSummary != null) {
            bLiveData.taskSummary = bLiveTaskSummary.mo225055clone();
        }
        bLiveData.version = this.version;
        BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel = this.fanbaseMedalPanel;
        if (bLiveFanBaseMedalPanel != null) {
            bLiveData.fanbaseMedalPanel = bLiveFanBaseMedalPanel.mo225055clone();
        }
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = this.grabRedPacketInfo;
        if (bLiveFanBaseRedPacketInfo != null) {
            bLiveData.grabRedPacketInfo = bLiveFanBaseRedPacketInfo.mo225055clone();
        }
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo2 = this.redPacketGrabResult;
        if (bLiveFanBaseRedPacketInfo2 != null) {
            bLiveData.redPacketGrabResult = bLiveFanBaseRedPacketInfo2.mo225055clone();
        }
        List<BLiveFanBaseRelationShip> list33 = this.fanbaseRelations;
        if (list33 != null) {
            bLiveData.fanbaseRelations = ValueObject.util_map(list33, new qcj() { // from class: l.sx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFanBaseRelationShip) obj).mo225055clone();
                }
            });
        }
        List<BLiveFanBaseHierarchy> list34 = this.fanbaseHierarchies;
        if (list34 != null) {
            bLiveData.fanbaseHierarchies = ValueObject.util_map(list34, new qcj() { // from class: l.tx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFanBaseHierarchy) obj).mo225055clone();
                }
            });
        }
        List<BLiveFanBaseMedal> list35 = this.fanbaseMedals;
        if (list35 != null) {
            bLiveData.fanbaseMedals = ValueObject.util_map(list35, new qcj() { // from class: l.ux1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFanBaseMedal) obj).mo225055clone();
                }
            });
        }
        List<BLiveLeaderboardRecord> list36 = this.records;
        if (list36 != null) {
            bLiveData.records = ValueObject.util_map(list36, new qcj() { // from class: l.vx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveLeaderboardRecord) obj).mo225055clone();
                }
            });
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = this.anchorFanbaseMedal;
        if (bLiveCommonViewConfig != null) {
            bLiveData.anchorFanbaseMedal = bLiveCommonViewConfig.mo225055clone();
        }
        List<BLiveLeaderboardMedal> list37 = this.medals;
        if (list37 != null) {
            bLiveData.medals = ValueObject.util_map(list37, new qcj() { // from class: l.wx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveLeaderboardMedal) obj).mo225055clone();
                }
            });
        }
        List<BLiveLeaderboardUser> list38 = this.leaderboardUsers;
        if (list38 != null) {
            bLiveData.leaderboardUsers = ValueObject.util_map(list38, new qcj() { // from class: l.xx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveLeaderboardUser) obj).mo225055clone();
                }
            });
        }
        List<BLiveSquareDetailCounters> list39 = this.fanbaseRedPacketEventCounters;
        if (list39 != null) {
            bLiveData.fanbaseRedPacketEventCounters = ValueObject.util_map(list39, new qcj() { // from class: l.yx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSquareDetailCounters) obj).mo225055clone();
                }
            });
        }
        List<BLiveCall> list40 = this.calls;
        if (list40 != null) {
            bLiveData.calls = ValueObject.util_map(list40, new qcj() { // from class: l.zx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCall) obj).mo225055clone();
                }
            });
        }
        List<BLiveCallInvite> list41 = this.callInvites;
        if (list41 != null) {
            bLiveData.callInvites = ValueObject.util_map(list41, new qcj() { // from class: l.cy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCallInvite) obj).mo225055clone();
                }
            });
        }
        List<BLiveRtcToken> list42 = this.rtcTokens;
        if (list42 != null) {
            bLiveData.rtcTokens = ValueObject.util_map(list42, new qcj() { // from class: l.dy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveRtcToken) obj).mo225055clone();
                }
            });
        }
        List<BLiveCallSummary> list43 = this.callSummaries;
        if (list43 != null) {
            bLiveData.callSummaries = ValueObject.util_map(list43, new qcj() { // from class: l.ey1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCallSummary) obj).mo225055clone();
                }
            });
        }
        List<BLiveBoardHierarchy> list44 = this.hierarchies;
        if (list44 != null) {
            bLiveData.hierarchies = ValueObject.util_map(list44, new qcj() { // from class: l.fy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveBoardHierarchy) obj).mo225055clone();
                }
            });
        }
        List<BLiveEnterRoomEffect> list45 = this.userEnterRoomEffects;
        if (list45 != null) {
            bLiveData.userEnterRoomEffects = ValueObject.util_map(list45, new qcj() { // from class: l.gy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveEnterRoomEffect) obj).mo225055clone();
                }
            });
        }
        BLiveBottomMenu bLiveBottomMenu = this.bottomMenu;
        if (bLiveBottomMenu != null) {
            bLiveData.bottomMenu = bLiveBottomMenu.mo225055clone();
        }
        Connector connector = this.connector;
        if (connector != null) {
            bLiveData.connector = connector.mo225055clone();
        }
        List<BLiveUserProfileConfig> list46 = this.userProfileConfig;
        if (list46 != null) {
            bLiveData.userProfileConfig = ValueObject.util_map(list46, new qcj() { // from class: l.hy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserProfileConfig) obj).mo225055clone();
                }
            });
        }
        BLiveTurboCardInfo bLiveTurboCardInfo = this.turboCardInfo;
        if (bLiveTurboCardInfo != null) {
            bLiveData.turboCardInfo = bLiveTurboCardInfo.mo225055clone();
        }
        List<BLiveVoiceCall> list47 = this.voiceCalls;
        if (list47 != null) {
            bLiveData.voiceCalls = ValueObject.util_map(list47, new qcj() { // from class: l.iy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceCall) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceCallInvite> list48 = this.voiceCallInvites;
        if (list48 != null) {
            bLiveData.voiceCallInvites = ValueObject.util_map(list48, new qcj() { // from class: l.jy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceCallInvite) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceCallSummary> list49 = this.voiceCallSummaries;
        if (list49 != null) {
            bLiveData.voiceCallSummaries = ValueObject.util_map(list49, new qcj() { // from class: l.ky1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceCallSummary) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceRoom> list50 = this.voiceRooms;
        if (list50 != null) {
            bLiveData.voiceRooms = ValueObject.util_map(list50, new qcj() { // from class: l.ly1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceRoom) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoice> list51 = this.voiceLives;
        if (list51 != null) {
            bLiveData.voiceLives = ValueObject.util_map(list51, new qcj() { // from class: l.oy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoice) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceTopic> list52 = this.topics;
        if (list52 != null) {
            bLiveData.topics = ValueObject.util_map(list52, new qcj() { // from class: l.py1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceTopic) obj).mo225055clone();
                }
            });
        }
        List<BLiveSummary> list53 = this.voiceLiveSummaries;
        if (list53 != null) {
            bLiveData.voiceLiveSummaries = ValueObject.util_map(list53, new qcj() { // from class: l.qy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSummary) obj).mo225055clone();
                }
            });
        }
        BLiveRightInfo bLiveRightInfo = this.right;
        if (bLiveRightInfo != null) {
            bLiveData.right = bLiveRightInfo.mo225055clone();
        }
        List<BLiveRightAnchorInfo> list54 = this.rightBindAnchors;
        if (list54 != null) {
            bLiveData.rightBindAnchors = ValueObject.util_map(list54, new qcj() { // from class: l.ry1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveRightAnchorInfo) obj).mo225055clone();
                }
            });
        }
        BLiveOperation bLiveOperation = this.liveOperation;
        if (bLiveOperation != null) {
            bLiveData.liveOperation = bLiveOperation.mo225055clone();
        }
        List<BLiveFeedSummary> list55 = this.voiceLivesSummary;
        if (list55 != null) {
            bLiveData.voiceLivesSummary = ValueObject.util_map(list55, new qcj() { // from class: l.sy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFeedSummary) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = this.voiceRoomTagInfo;
        if (bLiveVoiceRoomTagInfo != null) {
            bLiveData.voiceRoomTagInfo = bLiveVoiceRoomTagInfo.mo225055clone();
        }
        BLiveGiftStarBoard bLiveGiftStarBoard = this.giftStar;
        if (bLiveGiftStarBoard != null) {
            bLiveData.giftStar = bLiveGiftStarBoard.mo225055clone();
        }
        List<BLiveAdvanceTask> list56 = this.advancedTasks;
        if (list56 != null) {
            bLiveData.advancedTasks = ValueObject.util_map(list56, new qcj() { // from class: l.ty1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAdvanceTask) obj).mo225055clone();
                }
            });
        }
        List<BLiveKnightsInfosSummary> list57 = this.knightsInfosSummary;
        if (list57 != null) {
            bLiveData.knightsInfosSummary = ValueObject.util_map(list57, new qcj() { // from class: l.uy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveKnightsInfosSummary) obj).mo225055clone();
                }
            });
        }
        List<BLiveUserKnightInfoSummary> list58 = this.userKnightInfosSummary;
        if (list58 != null) {
            bLiveData.userKnightInfosSummary = ValueObject.util_map(list58, new qcj() { // from class: l.vy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserKnightInfoSummary) obj).mo225055clone();
                }
            });
        }
        List<BLiveKnightsRuleInfoItem> list59 = this.knightsRuleInfos;
        if (list59 != null) {
            bLiveData.knightsRuleInfos = ValueObject.util_map(list59, new qcj() { // from class: l.wy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveKnightsRuleInfoItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveAnchorKnightInfos> list60 = this.anchorKnightInfos;
        if (list60 != null) {
            bLiveData.anchorKnightInfos = ValueObject.util_map(list60, new qcj() { // from class: l.jt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAnchorKnightInfos) obj).mo225055clone();
                }
            });
        }
        BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo = this.slotInfo;
        if (bLiveUpgradeGiftInfo != null) {
            bLiveData.slotInfo = bLiveUpgradeGiftInfo.mo225055clone();
        }
        BLiveGiftItemShort bLiveGiftItemShort = this.equippedGift;
        if (bLiveGiftItemShort != null) {
            bLiveData.equippedGift = bLiveGiftItemShort.mo225055clone();
        }
        List<BLiveUserMask> list61 = this.masks;
        if (list61 != null) {
            bLiveData.masks = ValueObject.util_map(list61, new qcj() { // from class: l.lt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserMask) obj).mo225055clone();
                }
            });
        }
        BLiveChatMangerSettings bLiveChatMangerSettings = this.chatSettings;
        if (bLiveChatMangerSettings != null) {
            bLiveData.chatSettings = bLiveChatMangerSettings.mo225055clone();
        }
        List<VoiceLiveGame> list62 = this.voiceLiveGames;
        if (list62 != null) {
            bLiveData.voiceLiveGames = ValueObject.util_map(list62, new qcj() { // from class: l.mt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VoiceLiveGame) obj).mo225055clone();
                }
            });
        }
        BLivePkAssets bLivePkAssets = this.pkAssets;
        if (bLivePkAssets != null) {
            bLiveData.pkAssets = bLivePkAssets.mo225055clone();
        }
        List<BLiveUserPrivacyPrivilege> list63 = this.privacyPrivilege;
        if (list63 != null) {
            bLiveData.privacyPrivilege = ValueObject.util_map(list63, new qcj() { // from class: l.nt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserPrivacyPrivilege) obj).mo225055clone();
                }
            });
        }
        BLiveFakeUser bLiveFakeUser = this.fakeUser;
        if (bLiveFakeUser != null) {
            bLiveData.fakeUser = bLiveFakeUser.mo225055clone();
        }
        BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig = this.mysteryConfig;
        if (bLiveHideAvatarEnterConfig != null) {
            bLiveData.mysteryConfig = bLiveHideAvatarEnterConfig.mo225055clone();
        }
        List<BLiveFakeUserProfile> list64 = this.fakeUserProfiles;
        if (list64 != null) {
            bLiveData.fakeUserProfiles = ValueObject.util_map(list64, new qcj() { // from class: l.ot1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFakeUserProfile) obj).mo225055clone();
                }
            });
        }
        List<BLivePkSummary> list65 = this.pkSummaries;
        if (list65 != null) {
            bLiveData.pkSummaries = ValueObject.util_map(list65, new qcj() { // from class: l.pt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkSummary) obj).mo225055clone();
                }
            });
        }
        List<BLiveCommonViewConfig> list66 = this.previews;
        if (list66 != null) {
            bLiveData.previews = ValueObject.util_map(list66, new qcj() { // from class: l.qt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCommonViewConfig) obj).mo225055clone();
                }
            });
        }
        BLiveDanmakuList bLiveDanmakuList = this.videoLiveBulletCommentTypes;
        if (bLiveDanmakuList != null) {
            bLiveData.videoLiveBulletCommentTypes = bLiveDanmakuList.mo225055clone();
        }
        BLiveDanmakuItem bLiveDanmakuItem = this.videoLiveBulletComment;
        if (bLiveDanmakuItem != null) {
            bLiveData.videoLiveBulletComment = bLiveDanmakuItem.mo225055clone();
        }
        List<BLiveUserRightResource> list67 = this.userLiveRightResources;
        if (list67 != null) {
            bLiveData.userLiveRightResources = ValueObject.util_map(list67, new qcj() { // from class: l.rt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserRightResource) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceUserProfileConfig> list68 = this.voiceUserProfileConfigs;
        if (list68 != null) {
            bLiveData.voiceUserProfileConfigs = ValueObject.util_map(list68, new qcj() { // from class: l.st1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceUserProfileConfig) obj).mo225055clone();
                }
            });
        }
        List<BLiveGiftShowcaseItem> list69 = this.giftShowcaseItems;
        if (list69 != null) {
            bLiveData.giftShowcaseItems = ValueObject.util_map(list69, new qcj() { // from class: l.ut1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftShowcaseItem) obj).mo225055clone();
                }
            });
        }
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = this.accompanyTaskSummary;
        if (bLiveAccommpanyTaskSummary != null) {
            bLiveData.accompanyTaskSummary = bLiveAccommpanyTaskSummary.mo225055clone();
        }
        List<BLiveAccommpanyTasks> list70 = this.accompanyTasks;
        if (list70 != null) {
            bLiveData.accompanyTasks = ValueObject.util_map(list70, new qcj() { // from class: l.vt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAccommpanyTasks) obj).mo225055clone();
                }
            });
        }
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = this.accompanyTaskProgress;
        if (bLiveAccommpanyTasksProgress != null) {
            bLiveData.accompanyTaskProgress = bLiveAccommpanyTasksProgress.mo225055clone();
        }
        BLiveGiftSetInfo bLiveGiftSetInfo = this.giftSetInfo;
        if (bLiveGiftSetInfo != null) {
            bLiveData.giftSetInfo = bLiveGiftSetInfo.mo225055clone();
        }
        List<BLiveScrapTabData> list71 = this.scrapTabs;
        if (list71 != null) {
            bLiveData.scrapTabs = ValueObject.util_map(list71, new qcj() { // from class: l.xt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveScrapTabData) obj).mo225055clone();
                }
            });
        }
        BLiveGivenGiftRemindStatus bLiveGivenGiftRemindStatus = this.givenGiftRemindStatus;
        if (bLiveGivenGiftRemindStatus != null) {
            bLiveData.givenGiftRemindStatus = bLiveGivenGiftRemindStatus.mo225055clone();
        }
        BLiveUserLevel bLiveUserLevel = this.userLiveHierarchy;
        if (bLiveUserLevel != null) {
            bLiveData.userLiveHierarchy = bLiveUserLevel.mo225055clone();
        }
        List<BLiveDownChestRewardInfo> list72 = this.chestRewardInfo;
        if (list72 != null) {
            bLiveData.chestRewardInfo = ValueObject.util_map(list72, new qcj() { // from class: l.yt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveDownChestRewardInfo) obj).mo225055clone();
                }
            });
        }
        List<BLiveSignInDetail> list73 = this.signInDetails;
        if (list73 != null) {
            bLiveData.signInDetails = ValueObject.util_map(list73, new qcj() { // from class: l.zt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSignInDetail) obj).mo225055clone();
                }
            });
        }
        List<BLiveSignPrizes> list74 = this.signInPrizes;
        if (list74 != null) {
            bLiveData.signInPrizes = ValueObject.util_map(list74, new qcj() { // from class: l.au1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSignPrizes) obj).mo225055clone();
                }
            });
        }
        BLiveBeautyFilterConfig bLiveBeautyFilterConfig = this.liveBeautyConfig;
        if (bLiveBeautyFilterConfig != null) {
            bLiveData.liveBeautyConfig = bLiveBeautyFilterConfig.mo225055clone();
        }
        List<BLiveVoiceUserFeedInfos> list75 = this.voiceUserFeedInfos;
        if (list75 != null) {
            bLiveData.voiceUserFeedInfos = ValueObject.util_map(list75, new qcj() { // from class: l.bu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceUserFeedInfos) obj).mo225055clone();
                }
            });
        }
        BLiveHierarchyProgress bLiveHierarchyProgress = this.userLiveHierarchyProgress;
        if (bLiveHierarchyProgress != null) {
            bLiveData.userLiveHierarchyProgress = bLiveHierarchyProgress.mo225055clone();
        }
        List<BLiveTeenagerLive> list76 = this.teenagerLives;
        if (list76 != null) {
            bLiveData.teenagerLives = ValueObject.util_map(list76, new qcj() { // from class: l.cu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveTeenagerLive) obj).mo225055clone();
                }
            });
        }
        bLiveData.gameInfoResponse = this.gameInfoResponse;
        List<BLiveSignInAchievementMedals> list77 = this.signInAchievementMedals;
        if (list77 != null) {
            bLiveData.signInAchievementMedals = ValueObject.util_map(list77, new qcj() { // from class: l.du1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSignInAchievementMedals) obj).mo225055clone();
                }
            });
        }
        List<BLiveGuardAnchorRankInfo> list78 = this.guardAnchorRankInfos;
        if (list78 != null) {
            bLiveData.guardAnchorRankInfos = ValueObject.util_map(list78, new qcj() { // from class: l.fu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGuardAnchorRankInfo) obj).mo225055clone();
                }
            });
        }
        List<BLiveGuardboardRecord> list79 = this.guardRecords;
        if (list79 != null) {
            bLiveData.guardRecords = ValueObject.util_map(list79, new qcj() { // from class: l.gu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGuardboardRecord) obj).mo225055clone();
                }
            });
        }
        List<BLiveDailyTasks> list80 = this.userDailyTasks;
        if (list80 != null) {
            bLiveData.userDailyTasks = ValueObject.util_map(list80, new qcj() { // from class: l.hu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveDailyTasks) obj).mo225055clone();
                }
            });
        }
        List<BLiveDailyTasks> list81 = this.anchorDailyTasks;
        if (list81 != null) {
            bLiveData.anchorDailyTasks = ValueObject.util_map(list81, new qcj() { // from class: l.ju1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveDailyTasks) obj).mo225055clone();
                }
            });
        }
        BLiveStormDanmaku bLiveStormDanmaku = this.stormComment;
        if (bLiveStormDanmaku != null) {
            bLiveData.stormComment = bLiveStormDanmaku.mo225055clone();
        }
        BLiveResourceCDN bLiveResourceCDN = this.liveResourcesCDN;
        if (bLiveResourceCDN != null) {
            bLiveData.liveResourcesCDN = bLiveResourceCDN.mo225055clone();
        }
        BLiveVoiceLiveAssert bLiveVoiceLiveAssert = this.voiceLiveAssert;
        if (bLiveVoiceLiveAssert != null) {
            bLiveData.voiceLiveAssert = bLiveVoiceLiveAssert.mo225055clone();
        }
        BLiveFirstRechargeStatus bLiveFirstRechargeStatus = this.firstRechargeStatus;
        if (bLiveFirstRechargeStatus != null) {
            bLiveData.firstRechargeStatus = bLiveFirstRechargeStatus.mo225055clone();
        }
        BLiveFirstRechargeDetail bLiveFirstRechargeDetail = this.firstRechargeDetail;
        if (bLiveFirstRechargeDetail != null) {
            bLiveData.firstRechargeDetail = bLiveFirstRechargeDetail.mo225055clone();
        }
        List<BLiveVoiceTab> list82 = this.voiceTabs;
        if (list82 != null) {
            bLiveData.voiceTabs = ValueObject.util_map(list82, new qcj() { // from class: l.ku1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceTab) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceShareItems> list83 = this.shareItems;
        if (list83 != null) {
            bLiveData.shareItems = ValueObject.util_map(list83, new qcj() { // from class: l.lu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceShareItems) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceRoomFeed> list84 = this.voiceRoomFeeds;
        if (list84 != null) {
            bLiveData.voiceRoomFeeds = ValueObject.util_map(list84, new qcj() { // from class: l.mu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceRoomFeed) obj).mo225055clone();
                }
            });
        }
        List<BLiveGiftSkin> list85 = this.skins;
        if (list85 != null) {
            bLiveData.skins = ValueObject.util_map(list85, new qcj() { // from class: l.nu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftSkin) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceChatGroup bLiveVoiceChatGroup = this.voiceChatGroup;
        if (bLiveVoiceChatGroup != null) {
            bLiveData.voiceChatGroup = bLiveVoiceChatGroup.mo225055clone();
        }
        List<BLiveVoiceChatGroupApply> list86 = this.voiceChatGroupApplies;
        if (list86 != null) {
            bLiveData.voiceChatGroupApplies = ValueObject.util_map(list86, new qcj() { // from class: l.ou1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceChatGroupApply) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceManagerInvite> list87 = this.voiceManagerInvites;
        if (list87 != null) {
            bLiveData.voiceManagerInvites = ValueObject.util_map(list87, new qcj() { // from class: l.qu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceManagerInvite) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceManager> list88 = this.voiceManagers;
        if (list88 != null) {
            bLiveData.voiceManagers = ValueObject.util_map(list88, new qcj() { // from class: l.ru1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceManager) obj).mo225055clone();
                }
            });
        }
        List<BLiveMultiCall> list89 = this.multiCalls;
        if (list89 != null) {
            bLiveData.multiCalls = ValueObject.util_map(list89, new qcj() { // from class: l.su1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMultiCall) obj).mo225055clone();
                }
            });
        }
        BLiveMultiCallAsset bLiveMultiCallAsset = this.multiCallAsset;
        if (bLiveMultiCallAsset != null) {
            bLiveData.multiCallAsset = bLiveMultiCallAsset.mo225055clone();
        }
        List<BLiveMultiCallInvite> list90 = this.multiCallInvites;
        if (list90 != null) {
            bLiveData.multiCallInvites = ValueObject.util_map(list90, new qcj() { // from class: l.tu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMultiCallInvite) obj).mo225055clone();
                }
            });
        }
        BLiveMultiCallSummary bLiveMultiCallSummary = this.multiCallSummary;
        if (bLiveMultiCallSummary != null) {
            bLiveData.multiCallSummary = bLiveMultiCallSummary.mo225055clone();
        }
        List<ActivitySuggests> list91 = this.activitySuggests;
        if (list91 != null) {
            bLiveData.activitySuggests = ValueObject.util_map(list91, new qcj() { // from class: l.vu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ActivitySuggests) obj).mo225055clone();
                }
            });
        }
        BFansBaseRecall bFansBaseRecall = this.fanbaseRecall;
        if (bFansBaseRecall != null) {
            bLiveData.fanbaseRecall = bFansBaseRecall.mo225055clone();
        }
        List<BLiveVoiceEndSparkRanking> list92 = this.accompanyUserRanking;
        if (list92 != null) {
            bLiveData.accompanyUserRanking = ValueObject.util_map(list92, new qcj() { // from class: l.wu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceEndSparkRanking) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress = this.sparkletProgress;
        if (bLiveVoiceEndSparkProgress != null) {
            bLiveData.sparkletProgress = bLiveVoiceEndSparkProgress.mo225055clone();
        }
        List<BLiveAnchors> list93 = this.liveAnchors;
        if (list93 != null) {
            bLiveData.liveAnchors = ValueObject.util_map(list93, new qcj() { // from class: l.xu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAnchors) obj).mo225055clone();
                }
            });
        }
        List<BLiveSuggestLive> list94 = this.suggestedLives;
        if (list94 != null) {
            bLiveData.suggestedLives = ValueObject.util_map(list94, new qcj() { // from class: l.yu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).mo225055clone();
                }
            });
        }
        List<LiveMultiCallLiveSchema> list95 = this.liveSchemas;
        if (list95 != null) {
            bLiveData.liveSchemas = ValueObject.util_map(list95, new qcj() { // from class: l.zu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveMultiCallLiveSchema) obj).mo225055clone();
                }
            });
        }
        BLivePush bLivePush = this.userLivePush;
        if (bLivePush != null) {
            bLiveData.userLivePush = bLivePush.mo225055clone();
        }
        BLiveTouchMeDetail bLiveTouchMeDetail = this.touchMeDetail;
        if (bLiveTouchMeDetail != null) {
            bLiveData.touchMeDetail = bLiveTouchMeDetail.mo225055clone();
        }
        BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite = this.multiCallSwitchToLeadRoleInvite;
        if (bLiveMultiCallSwitchToLeadRoleInvite != null) {
            bLiveData.multiCallSwitchToLeadRoleInvite = bLiveMultiCallSwitchToLeadRoleInvite.mo225055clone();
        }
        List<BLiveMultiCallExtend> list96 = this.multiCallExtends;
        if (list96 != null) {
            bLiveData.multiCallExtends = ValueObject.util_map(list96, new qcj() { // from class: l.bv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMultiCallExtend) obj).mo225055clone();
                }
            });
        }
        BLiveCommonViewConfig bLiveCommonViewConfig2 = this.scoreSummary;
        if (bLiveCommonViewConfig2 != null) {
            bLiveData.scoreSummary = bLiveCommonViewConfig2.mo225055clone();
        }
        BLiveTopChatMessage bLiveTopChatMessage = this.liveTopChatMessage;
        if (bLiveTopChatMessage != null) {
            bLiveData.liveTopChatMessage = bLiveTopChatMessage.mo225055clone();
        }
        bLiveData.needTitle = this.needTitle;
        List<BLiveEntranceSummary> list97 = this.squareEntranceSummary;
        if (list97 != null) {
            bLiveData.squareEntranceSummary = ValueObject.util_map(list97, new qcj() { // from class: l.cv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveEntranceSummary) obj).mo225055clone();
                }
            });
        }
        List<BLiveMemberActivityData> list98 = this.memberActivityList;
        if (list98 != null) {
            bLiveData.memberActivityList = ValueObject.util_map(list98, new qcj() { // from class: l.dv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveMemberActivityData) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = this.voiceLiveActivityMoment;
        if (bLiveVoiceLiveActivityMoment != null) {
            bLiveData.voiceLiveActivityMoment = bLiveVoiceLiveActivityMoment.mo225055clone();
        }
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = this.roomAnnouncement;
        if (bLiveMultiCallAnnouncement != null) {
            bLiveData.roomAnnouncement = bLiveMultiCallAnnouncement.mo225055clone();
        }
        BLiveVoiceUserHeartbeatRewardList bLiveVoiceUserHeartbeatRewardList = this.voiceLiveUserHeartbeatRewardList;
        if (bLiveVoiceUserHeartbeatRewardList != null) {
            bLiveData.voiceLiveUserHeartbeatRewardList = bLiveVoiceUserHeartbeatRewardList.mo225055clone();
        }
        BLiveVoiceHeartBeat bLiveVoiceHeartBeat = this.voiceLiveHeartBeat;
        if (bLiveVoiceHeartBeat != null) {
            bLiveData.voiceLiveHeartBeat = bLiveVoiceHeartBeat.mo225055clone();
        }
        List<BLiveStickerTemplatesGiftItem> list99 = this.liveStickerTemplatesGifts;
        if (list99 != null) {
            bLiveData.liveStickerTemplatesGifts = ValueObject.util_map(list99, new qcj() { // from class: l.ev1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveStickerTemplatesGiftItem) obj).mo225055clone();
                }
            });
        }
        BLiveVoicePopTotal bLiveVoicePopTotal = this.voiceLivePopsTotal;
        if (bLiveVoicePopTotal != null) {
            bLiveData.voiceLivePopsTotal = bLiveVoicePopTotal.mo225055clone();
        }
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = this.grabHatGame;
        if (bLiveVoiceGrabHatGame != null) {
            bLiveData.grabHatGame = bLiveVoiceGrabHatGame.mo225055clone();
        }
        List<BLiveVoiceGrabHatCP> list100 = this.grabHatCps;
        if (list100 != null) {
            bLiveData.grabHatCps = ValueObject.util_map(list100, new qcj() { // from class: l.fv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceGrabHatCP) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceAuction> list101 = this.voiceLiveAuctions;
        if (list101 != null) {
            bLiveData.voiceLiveAuctions = ValueObject.util_map(list101, new qcj() { // from class: l.nv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceAuction) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceSweetCpRecommendUser> list102 = this.cpRecommendUserList;
        if (list102 != null) {
            bLiveData.cpRecommendUserList = ValueObject.util_map(list102, new qcj() { // from class: l.yv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceSweetCpRecommendUser) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards = this.voiceCpLeaderBoards;
        if (bLiveVoiceCpLeaderBoards != null) {
            bLiveData.voiceCpLeaderBoards = bLiveVoiceCpLeaderBoards.mo225055clone();
        }
        BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos = this.voiceCpHouseTaskInfos;
        if (bLiveVoiceCpHouseTaskInfos != null) {
            bLiveData.voiceCpHouseTaskInfos = bLiveVoiceCpHouseTaskInfos.mo225055clone();
        }
        BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo = this.voiceCpHouseInfo;
        if (bLiveVoiceCpHouseRankAwardInfo != null) {
            bLiveData.voiceCpHouseInfo = bLiveVoiceCpHouseRankAwardInfo.mo225055clone();
        }
        List<BLiveVoiceCpHouseInfo> list103 = this.voiceCpHouseList;
        if (list103 != null) {
            bLiveData.voiceCpHouseList = ValueObject.util_map(list103, new qcj() { // from class: l.jw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceCpHouseInfo) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo = this.voiceHouseRankUpgradeInfo;
        if (bLiveVoiceHouseRankUpgradeInfo != null) {
            bLiveData.voiceHouseRankUpgradeInfo = bLiveVoiceHouseRankUpgradeInfo.mo225055clone();
        }
        BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = this.backGroundPicSetting;
        if (bLiveVoiceBackGroundPicSetting != null) {
            bLiveData.backGroundPicSetting = bLiveVoiceBackGroundPicSetting.mo225055clone();
        }
        BLiveDailyPayment bLiveDailyPayment = this.dailyPayment;
        if (bLiveDailyPayment != null) {
            bLiveData.dailyPayment = bLiveDailyPayment.mo225055clone();
        }
        List<BLiveVoiceCampaign> list104 = this.intlVoiceLiveCampaigns;
        if (list104 != null) {
            bLiveData.intlVoiceLiveCampaigns = ValueObject.util_map(list104, new qcj() { // from class: l.uw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceCampaign) obj).mo225055clone();
                }
            });
        }
        List<BLiveComplexCard> list105 = this.complexCardList;
        if (list105 != null) {
            bLiveData.complexCardList = ValueObject.util_map(list105, new qcj() { // from class: l.fx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveComplexCard) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceGiftWallBookInfo> list106 = this.voiceGiftWallList;
        if (list106 != null) {
            bLiveData.voiceGiftWallList = ValueObject.util_map(list106, new qcj() { // from class: l.qx1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceGiftWallBookInfo) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief = this.voiceGiftWallBriefInfo;
        if (bLiveVoiceGiftWallBrief != null) {
            bLiveData.voiceGiftWallBriefInfo = bLiveVoiceGiftWallBrief.mo225055clone();
        }
        BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo = this.voiceGiftWallBookDetail;
        if (bLiveVoiceGiftWallBookInfo != null) {
            bLiveData.voiceGiftWallBookDetail = bLiveVoiceGiftWallBookInfo.mo225055clone();
        }
        List<BLiveVoiceFollowship> list107 = this.voiceFollowships;
        if (list107 != null) {
            bLiveData.voiceFollowships = ValueObject.util_map(list107, new qcj() { // from class: l.by1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceFollowship) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceUserGiftItem> list108 = this.voiceUserGiftItems;
        if (list108 != null) {
            bLiveData.voiceUserGiftItems = ValueObject.util_map(list108, new qcj() { // from class: l.my1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceUserGiftItem) obj).mo225055clone();
                }
            });
        }
        BLiveHeaddressCoinMarket bLiveHeaddressCoinMarket = this.flameCoinMarket;
        if (bLiveHeaddressCoinMarket != null) {
            bLiveData.flameCoinMarket = bLiveHeaddressCoinMarket.mo225055clone();
        }
        List<BLiveVirtualVoiceCard> list109 = this.virtualVoiceCard;
        if (list109 != null) {
            bLiveData.virtualVoiceCard = ValueObject.util_map(list109, new qcj() { // from class: l.xy1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVirtualVoiceCard) obj).mo225055clone();
                }
            });
        }
        BLiveChatRealMsgLiveInfo bLiveChatRealMsgLiveInfo = this.chatMsgLiveInfo;
        if (bLiveChatRealMsgLiveInfo != null) {
            bLiveData.chatMsgLiveInfo = bLiveChatRealMsgLiveInfo.mo225055clone();
        }
        BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = this.voiceKTVGame;
        if (bLiveVoiceKtvGameInfo != null) {
            bLiveData.voiceKTVGame = bLiveVoiceKtvGameInfo.mo225055clone();
        }
        List<BLiveVoiceKTVSong> list110 = this.voiceKTVSongs;
        if (list110 != null) {
            bLiveData.voiceKTVSongs = ValueObject.util_map(list110, new qcj() { // from class: l.tt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceKTVSong) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceKTVOrder> list111 = this.voiceKTVOrders;
        if (list111 != null) {
            bLiveData.voiceKTVOrders = ValueObject.util_map(list111, new qcj() { // from class: l.pu1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceKTVOrder) obj).mo225055clone();
                }
            });
        }
        BLiveComplexCardFourConfig bLiveComplexCardFourConfig = this.complexCardConfig;
        if (bLiveComplexCardFourConfig != null) {
            bLiveData.complexCardConfig = bLiveComplexCardFourConfig.mo225055clone();
        }
        List<BLiveIntlVoiceMedal> list112 = this.familyMedals;
        if (list112 != null) {
            bLiveData.familyMedals = ValueObject.util_map(list112, new qcj() { // from class: l.av1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveIntlVoiceMedal) obj).mo225055clone();
                }
            });
        }
        bLiveData.schema = this.schema;
        List<VirtualVoiceGroupConversationCell> list113 = this.cells;
        if (list113 != null) {
            bLiveData.cells = ValueObject.util_map(list113, new qcj() { // from class: l.hv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VirtualVoiceGroupConversationCell) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceSettle> list114 = this.voiceSettles;
        if (list114 != null) {
            bLiveData.voiceSettles = ValueObject.util_map(list114, new qcj() { // from class: l.iv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceSettle) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceLivePush bLiveVoiceLivePush = this.voiceLivePush;
        if (bLiveVoiceLivePush != null) {
            bLiveData.voiceLivePush = bLiveVoiceLivePush.mo225055clone();
        }
        BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter = this.voiceAdminPanelCounter;
        if (bLiveVoiceAdminPanelCounter != null) {
            bLiveData.voiceAdminPanelCounter = bLiveVoiceAdminPanelCounter.mo225055clone();
        }
        BLiveVoiceUserMessageRemind bLiveVoiceUserMessageRemind = this.voiceUserMessageRemind;
        if (bLiveVoiceUserMessageRemind != null) {
            bLiveData.voiceUserMessageRemind = bLiveVoiceUserMessageRemind.mo225055clone();
        }
        BLiveVoiceShareUrlConfig bLiveVoiceShareUrlConfig = this.shareRoomConfig;
        if (bLiveVoiceShareUrlConfig != null) {
            bLiveData.shareRoomConfig = bLiveVoiceShareUrlConfig.mo225055clone();
        }
        BLiveNiceNumberDetail bLiveNiceNumberDetail = this.nobleNiceNumberDetail;
        if (bLiveNiceNumberDetail != null) {
            bLiveData.nobleNiceNumberDetail = bLiveNiceNumberDetail.mo225055clone();
        }
        BLiveNiceNumberList bLiveNiceNumberList = this.nobleNiceNumberList;
        if (bLiveNiceNumberList != null) {
            bLiveData.nobleNiceNumberList = bLiveNiceNumberList.mo225055clone();
        }
        List<BLiveHeatVoiceRoomTask> list115 = this.heatVoiceRoomTasks;
        if (list115 != null) {
            bLiveData.heatVoiceRoomTasks = ValueObject.util_map(list115, new qcj() { // from class: l.jv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveHeatVoiceRoomTask) obj).mo225055clone();
                }
            });
        }
        BLiveRoomInProfile bLiveRoomInProfile = this.liveRoomInProfile;
        if (bLiveRoomInProfile != null) {
            bLiveData.liveRoomInProfile = bLiveRoomInProfile.mo225055clone();
        }
        BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile = this.voiceRoomInProfile;
        if (bLiveVoiceRoomInProfile != null) {
            bLiveData.voiceRoomInProfile = bLiveVoiceRoomInProfile.mo225055clone();
        }
        BLiveVoiceGiftWall bLiveVoiceGiftWall = this.voiceGiftWall;
        if (bLiveVoiceGiftWall != null) {
            bLiveData.voiceGiftWall = bLiveVoiceGiftWall.mo225055clone();
        }
        BLiveVoiceMedalWallIList bLiveVoiceMedalWallIList = this.voiceMedalWall;
        if (bLiveVoiceMedalWallIList != null) {
            bLiveData.voiceMedalWall = bLiveVoiceMedalWallIList.mo225055clone();
        }
        BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard = this.voiceWeekLeaderboards;
        if (bLiveVoiceHourLeaderBoard != null) {
            bLiveData.voiceWeekLeaderboards = bLiveVoiceHourLeaderBoard.mo225055clone();
        }
        BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail = this.voiceRoomLevelDetail;
        if (bLiveVoiceRoomLevelDetail != null) {
            bLiveData.voiceRoomLevelDetail = bLiveVoiceRoomLevelDetail.mo225055clone();
        }
        BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary = this.voiceRoomSummary;
        if (bLiveVoiceVirtualRoomSummary != null) {
            bLiveData.voiceRoomSummary = bLiveVoiceVirtualRoomSummary.mo225055clone();
        }
        List<BLiveVoiceStarRedPacket> list116 = this.starRedPackets;
        if (list116 != null) {
            bLiveData.starRedPackets = ValueObject.util_map(list116, new qcj() { // from class: l.kv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceStarRedPacket) obj).mo225055clone();
                }
            });
        }
        BLiveSideBarConfig bLiveSideBarConfig = this.showSideBarConfig;
        if (bLiveSideBarConfig != null) {
            bLiveData.showSideBarConfig = bLiveSideBarConfig.mo225055clone();
        }
        List<BLiveVoiceFeedBanners> list117 = this.voiceLiveBanners;
        if (list117 != null) {
            bLiveData.voiceLiveBanners = ValueObject.util_map(list117, new qcj() { // from class: l.lv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceFeedBanners) obj).mo225055clone();
                }
            });
        }
        BLiveMultiPkDetail bLiveMultiPkDetail = this.multiPk;
        if (bLiveMultiPkDetail != null) {
            bLiveData.multiPk = bLiveMultiPkDetail.mo225055clone();
        }
        BLiveMultiPkPanel bLiveMultiPkPanel = this.multiPkPanel;
        if (bLiveMultiPkPanel != null) {
            bLiveData.multiPkPanel = bLiveMultiPkPanel.mo225055clone();
        }
        BLiveMultiPkAsset bLiveMultiPkAsset = this.multiPkAsset;
        if (bLiveMultiPkAsset != null) {
            bLiveData.multiPkAsset = bLiveMultiPkAsset.mo225055clone();
        }
        BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard = this.multiPkLeaderboard;
        if (bLiveMultiPkLeaderboard != null) {
            bLiveData.multiPkLeaderboard = bLiveMultiPkLeaderboard.mo225055clone();
        }
        List<BLiveVoiceRoomClass> list118 = this.voiceRoomClasses;
        if (list118 != null) {
            bLiveData.voiceRoomClasses = ValueObject.util_map(list118, new qcj() { // from class: l.mv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceRoomClass) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceChatTopicAsset bLiveVoiceChatTopicAsset = this.chatTopicAsset;
        if (bLiveVoiceChatTopicAsset != null) {
            bLiveData.chatTopicAsset = bLiveVoiceChatTopicAsset.mo225055clone();
        }
        BLiveVoiceChatTopic bLiveVoiceChatTopic = this.chatTopic;
        if (bLiveVoiceChatTopic != null) {
            bLiveData.chatTopic = bLiveVoiceChatTopic.mo225055clone();
        }
        List<BLiveVoiceMutexMode> list119 = this.mutexMode;
        if (list119 != null) {
            bLiveData.mutexMode = ValueObject.util_map(list119, new qcj() { // from class: l.ov1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceMutexMode) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceModelDescribe bLiveVoiceModelDescribe = this.modelDescribe;
        if (bLiveVoiceModelDescribe != null) {
            bLiveData.modelDescribe = bLiveVoiceModelDescribe.mo225055clone();
        }
        BLiveLiveMedalCDN bLiveLiveMedalCDN = this.liveMedalCDN;
        if (bLiveLiveMedalCDN != null) {
            bLiveData.liveMedalCDN = bLiveLiveMedalCDN.mo225055clone();
        }
        List<BLiveVoiceLiveUserFeedList> list120 = this.voiceLiveUserFeedList;
        if (list120 != null) {
            bLiveData.voiceLiveUserFeedList = ValueObject.util_map(list120, new qcj() { // from class: l.pv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceLiveUserFeedList) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceUserRealVoiceLive bLiveVoiceUserRealVoiceLive = this.userRealVoiceLive;
        if (bLiveVoiceUserRealVoiceLive != null) {
            bLiveData.userRealVoiceLive = bLiveVoiceUserRealVoiceLive.mo225055clone();
        }
        BLiveUserLeaderboard bLiveUserLeaderboard = this.userLeaderboard;
        if (bLiveUserLeaderboard != null) {
            bLiveData.userLeaderboard = bLiveUserLeaderboard.mo225055clone();
        }
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = this.anchorLeaderboard;
        if (bLiveAnchorLeaderboard != null) {
            bLiveData.anchorLeaderboard = bLiveAnchorLeaderboard.mo225055clone();
        }
        BLiveUserLeaderboard bLiveUserLeaderboard2 = this.userWeekLeaderboard;
        if (bLiveUserLeaderboard2 != null) {
            bLiveData.userWeekLeaderboard = bLiveUserLeaderboard2.mo225055clone();
        }
        BLiveWeekCpInfo bLiveWeekCpInfo = this.weekCpInfo;
        if (bLiveWeekCpInfo != null) {
            bLiveData.weekCpInfo = bLiveWeekCpInfo.mo225055clone();
        }
        List<BLiveAuctionQueueInfo> list121 = this.auctionCandidates;
        if (list121 != null) {
            bLiveData.auctionCandidates = ValueObject.util_map(list121, new qcj() { // from class: l.rv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAuctionQueueInfo) obj).mo225055clone();
                }
            });
        }
        List<BLiveAuctionQueueInfo> list122 = this.auctionApplies;
        if (list122 != null) {
            bLiveData.auctionApplies = ValueObject.util_map(list122, new qcj() { // from class: l.sv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAuctionQueueInfo) obj).mo225055clone();
                }
            });
        }
        List<BLiveAuctionQueueInfo> list123 = this.auctionInvites;
        if (list123 != null) {
            bLiveData.auctionInvites = ValueObject.util_map(list123, new qcj() { // from class: l.tv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAuctionQueueInfo) obj).mo225055clone();
                }
            });
        }
        BLiveAuctionAsset bLiveAuctionAsset = this.voiceLiveAuctionAsset;
        if (bLiveAuctionAsset != null) {
            bLiveData.voiceLiveAuctionAsset = bLiveAuctionAsset.mo225055clone();
        }
        List<BLiveAuctionRelationCard> list124 = this.auctionRelationCards;
        if (list124 != null) {
            bLiveData.auctionRelationCards = ValueObject.util_map(list124, new qcj() { // from class: l.uv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAuctionRelationCard) obj).mo225055clone();
                }
            });
        }
        List<BLiveSuggestLive> list125 = this.bigTVLives;
        if (list125 != null) {
            bLiveData.bigTVLives = ValueObject.util_map(list125, new qcj() { // from class: l.vv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).mo225055clone();
                }
            });
        }
        BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard = this.giftLeaderboard;
        if (bLiveIntlGiftLeaderboard != null) {
            bLiveData.giftLeaderboard = bLiveIntlGiftLeaderboard.mo225055clone();
        }
        List<BLiveClarity> list126 = this.liveClarityLevelInfos;
        if (list126 != null) {
            bLiveData.liveClarityLevelInfos = ValueObject.util_map(list126, new qcj() { // from class: l.wv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveClarity) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard = this.voiceUserLeaderboards;
        if (bLiveVoiceUserLeaderBoard != null) {
            bLiveData.voiceUserLeaderboards = bLiveVoiceUserLeaderBoard.mo225055clone();
        }
        List<BLivePkSuggestAnchors> list127 = this.pkSuggestedAnchors;
        if (list127 != null) {
            bLiveData.pkSuggestedAnchors = ValueObject.util_map(list127, new qcj() { // from class: l.xv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkSuggestAnchors) obj).mo225055clone();
                }
            });
        }
        BLiveQuitPopup bLiveQuitPopup = this.liveQuitPopup;
        if (bLiveQuitPopup != null) {
            bLiveData.liveQuitPopup = bLiveQuitPopup.mo225055clone();
        }
        bLiveData.exchangeTTCRedpoint = this.exchangeTTCRedpoint;
        BLiveVoiceRoomAsset bLiveVoiceRoomAsset = this.voiceRoomAsset;
        if (bLiveVoiceRoomAsset != null) {
            bLiveData.voiceRoomAsset = bLiveVoiceRoomAsset.mo225055clone();
        }
        BLiveIntlFamilyInfo bLiveIntlFamilyInfo = this.family;
        if (bLiveIntlFamilyInfo != null) {
            bLiveData.family = bLiveIntlFamilyInfo.mo225055clone();
        }
        BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo = this.familyShareInfo;
        if (bLiveIntlFamilyShareInfo != null) {
            bLiveData.familyShareInfo = bLiveIntlFamilyShareInfo.mo225055clone();
        }
        BLiveIntlPushSwitch bLiveIntlPushSwitch = this.userPushSwitch;
        if (bLiveIntlPushSwitch != null) {
            bLiveData.userPushSwitch = bLiveIntlPushSwitch.mo225055clone();
        }
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = this.officialShowCurrentAnchorInfo;
        if (bLiveOfficialShowCurrentAnchorInfo != null) {
            bLiveData.officialShowCurrentAnchorInfo = bLiveOfficialShowCurrentAnchorInfo.mo225055clone();
        }
        List<BLiveOfficialShowListItem> list128 = this.officialShowList;
        if (list128 != null) {
            bLiveData.officialShowList = ValueObject.util_map(list128, new qcj() { // from class: l.zv1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveOfficialShowListItem) obj).mo225055clone();
                }
            });
        }
        BLiveOfficialShowUser bLiveOfficialShowUser = this.officialShowUser;
        if (bLiveOfficialShowUser != null) {
            bLiveData.officialShowUser = bLiveOfficialShowUser.mo225055clone();
        }
        BLiveDragonScourgeDisplayChatMessage bLiveDragonScourgeDisplayChatMessage = this.dragonScourgeDisplayChatMessage;
        if (bLiveDragonScourgeDisplayChatMessage != null) {
            bLiveData.dragonScourgeDisplayChatMessage = bLiveDragonScourgeDisplayChatMessage.mo225055clone();
        }
        List<BLiveUserDressUp> list129 = this.rights;
        if (list129 != null) {
            bLiveData.rights = ValueObject.util_map(list129, new qcj() { // from class: l.aw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserDressUp) obj).mo225055clone();
                }
            });
        }
        BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo = this.auctionPlatformLeaderboardInfo;
        if (bLiveAuctionPlatformLeaderboardInfo != null) {
            bLiveData.auctionPlatformLeaderboardInfo = bLiveAuctionPlatformLeaderboardInfo.mo225055clone();
        }
        BLiveAuctionCounter bLiveAuctionCounter = this.auctionCounter;
        if (bLiveAuctionCounter != null) {
            bLiveData.auctionCounter = bLiveAuctionCounter.mo225055clone();
        }
        BLiveTabGiftExpiration bLiveTabGiftExpiration = this.bagpackItem;
        if (bLiveTabGiftExpiration != null) {
            bLiveData.bagpackItem = bLiveTabGiftExpiration.mo225055clone();
        }
        List<BLiveGiftDetail> list130 = this.giftDetails;
        if (list130 != null) {
            bLiveData.giftDetails = ValueObject.util_map(list130, new qcj() { // from class: l.bw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftDetail) obj).mo225055clone();
                }
            });
        }
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance = this.luckyParadiseBottomEntrance;
        if (bLiveLuckyParadiseBottomEntrance != null) {
            bLiveData.luckyParadiseBottomEntrance = bLiveLuckyParadiseBottomEntrance.mo225055clone();
        }
        BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN = this.intlLiveFramesMetadata;
        if (bLiveIntlLiveFramesCDN != null) {
            bLiveData.intlLiveFramesMetadata = bLiveIntlLiveFramesCDN.mo225055clone();
        }
        List<BLiveIntlMlnMedia> list131 = this.media;
        if (list131 != null) {
            bLiveData.media = ValueObject.util_map(list131, new qcj() { // from class: l.dw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveIntlMlnMedia) obj).mo225055clone();
                }
            });
        }
        BLiveLovePlanet bLiveLovePlanet = this.lovePlanet;
        if (bLiveLovePlanet != null) {
            bLiveData.lovePlanet = bLiveLovePlanet.mo225055clone();
        }
        List<BLiveVoiceBackGroundPics> list132 = this.storeBackgroundPics;
        if (list132 != null) {
            bLiveData.storeBackgroundPics = ValueObject.util_map(list132, new qcj() { // from class: l.ew1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceBackGroundPics) obj).mo225055clone();
                }
            });
        }
        BLivePopUp bLivePopUp = this.livePopUpGuild;
        if (bLivePopUp != null) {
            bLiveData.livePopUpGuild = bLivePopUp.mo225055clone();
        }
        BLivePopUp bLivePopUp2 = this.voiceLivePopUpGuild;
        if (bLivePopUp2 != null) {
            bLiveData.voiceLivePopUpGuild = bLivePopUp2.mo225055clone();
        }
        BLiveNewGiftSkinListData bLiveNewGiftSkinListData = this.giftSkinPanel;
        if (bLiveNewGiftSkinListData != null) {
            bLiveData.giftSkinPanel = bLiveNewGiftSkinListData.mo225055clone();
        }
        List<BLiveVoiceEmojiMenu> list133 = this.emojiPlayMenu;
        if (list133 != null) {
            bLiveData.emojiPlayMenu = ValueObject.util_map(list133, new qcj() { // from class: l.fw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceEmojiMenu) obj).mo225055clone();
                }
            });
        }
        BLiveVoicePayGuideUser bLiveVoicePayGuideUser = this.voicePayGuideUser;
        if (bLiveVoicePayGuideUser != null) {
            bLiveData.voicePayGuideUser = bLiveVoicePayGuideUser.mo225055clone();
        }
        BLiveGuildAnchorCheck bLiveGuildAnchorCheck = this.anchorGuildCheck;
        if (bLiveGuildAnchorCheck != null) {
            bLiveData.anchorGuildCheck = bLiveGuildAnchorCheck.mo225055clone();
        }
        List<BLiveVoiceSweetCpInviteRecord> list134 = this.cpInviteRecords;
        if (list134 != null) {
            bLiveData.cpInviteRecords = ValueObject.util_map(list134, new qcj() { // from class: l.gw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceSweetCpInviteRecord) obj).mo225055clone();
                }
            });
        }
        SiteWideBroadcastFinder siteWideBroadcastFinder = this.siteWideBroadcastFinder;
        if (siteWideBroadcastFinder != null) {
            bLiveData.siteWideBroadcastFinder = siteWideBroadcastFinder.mo225055clone();
        }
        List<BLiveGameOperationConfig> list135 = this.gameOperationPositions;
        if (list135 != null) {
            bLiveData.gameOperationPositions = ValueObject.util_map(list135, new qcj() { // from class: l.hw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGameOperationConfig) obj).mo225055clone();
                }
            });
        }
        BLiveVideoChatLive bLiveVideoChatLive = this.videoChatLive;
        if (bLiveVideoChatLive != null) {
            bLiveData.videoChatLive = bLiveVideoChatLive.mo225055clone();
        }
        BLiveVideoChat bLiveVideoChat = this.videoChat;
        if (bLiveVideoChat != null) {
            bLiveData.videoChat = bLiveVideoChat.mo225055clone();
        }
        BLiveVideoChatSummary bLiveVideoChatSummary = this.videoChatSummary;
        if (bLiveVideoChatSummary != null) {
            bLiveData.videoChatSummary = bLiveVideoChatSummary.mo225055clone();
        }
        bLiveData.isAnchor = this.isAnchor;
        BLiveSuperGodDetail bLiveSuperGodDetail = this.superUserBirthdayDetail;
        if (bLiveSuperGodDetail != null) {
            bLiveData.superUserBirthdayDetail = bLiveSuperGodDetail.mo225055clone();
        }
        List<BLiveVideoChatMissedCall> list136 = this.missedCalls;
        if (list136 != null) {
            bLiveData.missedCalls = ValueObject.util_map(list136, new qcj() { // from class: l.iw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVideoChatMissedCall) obj).mo225055clone();
                }
            });
        }
        bLiveData.missedCallCount = this.missedCallCount;
        BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall = this.anchorCall;
        if (bLiveVideoChatAnchorCall != null) {
            bLiveData.anchorCall = bLiveVideoChatAnchorCall.mo225055clone();
        }
        BLiveVideoChatAssets bLiveVideoChatAssets = this.videoChatAssets;
        if (bLiveVideoChatAssets != null) {
            bLiveData.videoChatAssets = bLiveVideoChatAssets.mo225055clone();
        }
        BLiveVideoChatSquareSummary bLiveVideoChatSquareSummary = this.videoChatSquareSummary;
        if (bLiveVideoChatSquareSummary != null) {
            bLiveData.videoChatSquareSummary = bLiveVideoChatSquareSummary.mo225055clone();
        }
        BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo = this.videoChatAttendeeCallInfo;
        if (bLiveVideoChatAttendeeCallInfo != null) {
            bLiveData.videoChatAttendeeCallInfo = bLiveVideoChatAttendeeCallInfo.mo225055clone();
        }
        BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail = this.randomMatchCouponDetail;
        if (bLiveRandomMatchCouponDetail != null) {
            bLiveData.randomMatchCouponDetail = bLiveRandomMatchCouponDetail.mo225055clone();
        }
        BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch = this.videoChatRandomMatch;
        if (bLiveVideoChatRandomMatch != null) {
            bLiveData.videoChatRandomMatch = bLiveVideoChatRandomMatch.mo225055clone();
        }
        bLiveData.code = this.code;
        BLiveUserCompliance bLiveUserCompliance = this.userCompliance;
        if (bLiveUserCompliance != null) {
            bLiveData.userCompliance = bLiveUserCompliance.mo225055clone();
        }
        BLiveIntlGamePanelMenus bLiveIntlGamePanelMenus = this.gamePanelMenus;
        if (bLiveIntlGamePanelMenus != null) {
            bLiveData.gamePanelMenus = bLiveIntlGamePanelMenus.mo225055clone();
        }
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance2 = this.funFairBottomEntrance;
        if (bLiveLuckyParadiseBottomEntrance2 != null) {
            bLiveData.funFairBottomEntrance = bLiveLuckyParadiseBottomEntrance2.mo225055clone();
        }
        List<BLiveVoiceSquareButton> list137 = this.voiceSquareButtons;
        if (list137 != null) {
            bLiveData.voiceSquareButtons = ValueObject.util_map(list137, new qcj() { // from class: l.kw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceSquareButton) obj).mo225055clone();
                }
            });
        }
        BLiveSuperChatDetail bLiveSuperChatDetail = this.superChatDetail;
        if (bLiveSuperChatDetail != null) {
            bLiveData.superChatDetail = bLiveSuperChatDetail.mo225055clone();
        }
        List<BLiveVoiceLeaderBoardEntranceItem> list138 = this.voiceLeaderboardEntrances;
        if (list138 != null) {
            bLiveData.voiceLeaderboardEntrances = ValueObject.util_map(list138, new qcj() { // from class: l.lw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceLeaderBoardEntranceItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceSweetLimitHouse> list139 = this.skinList;
        if (list139 != null) {
            bLiveData.skinList = ValueObject.util_map(list139, new qcj() { // from class: l.mw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceSweetLimitHouse) obj).mo225055clone();
                }
            });
        }
        List<BLiveStarlightHierarchy> list140 = this.starlightHierarchies;
        if (list140 != null) {
            bLiveData.starlightHierarchies = ValueObject.util_map(list140, new qcj() { // from class: l.nw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveStarlightHierarchy) obj).mo225055clone();
                }
            });
        }
        BLivePKCardShowList bLivePKCardShowList = this.pkItemCardsDetail;
        if (bLivePKCardShowList != null) {
            bLiveData.pkItemCardsDetail = bLivePKCardShowList.mo225055clone();
        }
        bLiveData.octopusUrl = this.octopusUrl;
        BLiveIntlConfig bLiveIntlConfig = this.intlConfig;
        if (bLiveIntlConfig != null) {
            bLiveData.intlConfig = bLiveIntlConfig.mo225055clone();
        }
        BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard = this.intlMedalWall;
        if (bLiveIntlMedalWallInUserCard != null) {
            bLiveData.intlMedalWall = bLiveIntlMedalWallInUserCard.mo225055clone();
        }
        BLiveIntlMedalWall bLiveIntlMedalWall = this.medalWall;
        if (bLiveIntlMedalWall != null) {
            bLiveData.medalWall = bLiveIntlMedalWall.mo225055clone();
        }
        BLiveVoicePlayModeList bLiveVoicePlayModeList = this.gameAsset;
        if (bLiveVoicePlayModeList != null) {
            bLiveData.gameAsset = bLiveVoicePlayModeList.mo225055clone();
        }
        BLiveVoiceGame bLiveVoiceGame = this.game;
        if (bLiveVoiceGame != null) {
            bLiveData.game = bLiveVoiceGame.mo225055clone();
        }
        BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame = this.canJoinGame;
        if (bLiveVoiceCanJoinGame != null) {
            bLiveData.canJoinGame = bLiveVoiceCanJoinGame.mo225055clone();
        }
        BLiveFansMemberNum bLiveFansMemberNum = this.voiceFanbase;
        if (bLiveFansMemberNum != null) {
            bLiveData.voiceFanbase = bLiveFansMemberNum.mo225055clone();
        }
        BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail = this.voiceFanbaseDetail;
        if (bLiveVoiceFanBaseDetail != null) {
            bLiveData.voiceFanbaseDetail = bLiveVoiceFanBaseDetail.mo225055clone();
        }
        List<BLiveVoiceMemberLb> list141 = this.memberLbs;
        if (list141 != null) {
            bLiveData.memberLbs = ValueObject.util_map(list141, new qcj() { // from class: l.pw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceMemberLb) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoicePlayModeAnchorItem> list142 = this.voiceFanbaseLbs;
        if (list142 != null) {
            bLiveData.voiceFanbaseLbs = ValueObject.util_map(list142, new qcj() { // from class: l.qw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoicePlayModeAnchorItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceFansMyJoin> list143 = this.myJoins;
        if (list143 != null) {
            bLiveData.myJoins = ValueObject.util_map(list143, new qcj() { // from class: l.rw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceFansMyJoin) obj).mo225055clone();
                }
            });
        }
        List<BLiveIntlVoiceMedal> list144 = this.voiceFanbaseMedals;
        if (list144 != null) {
            bLiveData.voiceFanbaseMedals = ValueObject.util_map(list144, new qcj() { // from class: l.sw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveIntlVoiceMedal) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance = this.heatBoxEntrance;
        if (bLiveVoiceHeatBoxEntrance != null) {
            bLiveData.heatBoxEntrance = bLiveVoiceHeatBoxEntrance.mo225055clone();
        }
        BLiveVoicePkInfo bLiveVoicePkInfo = this.voicePkInfo;
        if (bLiveVoicePkInfo != null) {
            bLiveData.voicePkInfo = bLiveVoicePkInfo.mo225055clone();
        }
        BLiveBoardGuard bLiveBoardGuard = this.guard;
        if (bLiveBoardGuard != null) {
            bLiveData.guard = bLiveBoardGuard.mo225055clone();
        }
        BLiveBossCall bLiveBossCall = this.bossCall;
        if (bLiveBossCall != null) {
            bLiveData.bossCall = bLiveBossCall.mo225055clone();
        }
        BLiveBossGiftRecord bLiveBossGiftRecord = this.bossGiftRecord;
        if (bLiveBossGiftRecord != null) {
            bLiveData.bossGiftRecord = bLiveBossGiftRecord.mo225055clone();
        }
        List<BLiveUserCardGiftWall> list145 = this.giftWallV3Briefs;
        if (list145 != null) {
            bLiveData.giftWallV3Briefs = ValueObject.util_map(list145, new qcj() { // from class: l.tw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserCardGiftWall) obj).mo225055clone();
                }
            });
        }
        List<BLiveDanmakuListItem> list146 = this.voiceLiveBulletCommentTypes;
        if (list146 != null) {
            bLiveData.voiceLiveBulletCommentTypes = ValueObject.util_map(list146, new qcj() { // from class: l.vw1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveDanmakuListItem) obj).mo225055clone();
                }
            });
        }
        BLiveDanmakuItem bLiveDanmakuItem2 = this.voiceLiveBulletComment;
        if (bLiveDanmakuItem2 != null) {
            bLiveData.voiceLiveBulletComment = bLiveDanmakuItem2.mo225055clone();
        }
        return bLiveData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveData)) {
            return false;
        }
        BLiveData bLiveData = (BLiveData) obj;
        return ValueObject.util_equals(this.users, bLiveData.users) && ValueObject.util_equals(this.relationships, bLiveData.relationships) && ValueObject.util_equals(this.verificationCenter, bLiveData.verificationCenter) && ValueObject.util_equals(this.monetizationConfig, bLiveData.monetizationConfig) && ValueObject.util_equals(this.members, bLiveData.members) && ValueObject.util_equals(this.anchors, bLiveData.anchors) && ValueObject.util_equals(this.rooms, bLiveData.rooms) && ValueObject.util_equals(this.lives, bLiveData.lives) && ValueObject.util_equals(this.liveSummaries, bLiveData.liveSummaries) && ValueObject.util_equals(this.givenGiftRes, bLiveData.givenGiftRes) && ValueObject.util_equals(this.liveChatMessages, bLiveData.liveChatMessages) && ValueObject.util_equals(this.liveSquareSummaries, bLiveData.liveSquareSummaries) && ValueObject.util_equals(this.liveActivitySummaries, bLiveData.liveActivitySummaries) && ValueObject.util_equals(this.liveActivities, bLiveData.liveActivities) && ValueObject.util_equals(this.managers, bLiveData.managers) && ValueObject.util_equals(this.menuItems, bLiveData.menuItems) && ValueObject.util_equals(this.liveCampaigns, bLiveData.liveCampaigns) && ValueObject.util_equals(this.liveHierarchyGrades, bLiveData.liveHierarchyGrades) && ValueObject.util_equals(this.chatTips, bLiveData.chatTips) && ValueObject.util_equals(this.livePushes, bLiveData.livePushes) && ValueObject.util_equals(this.giftItemCDN, bLiveData.giftItemCDN) && ValueObject.util_equals(this.liveRoomTabGifts, bLiveData.liveRoomTabGifts) && ValueObject.util_equals(this.followships, bLiveData.followships) && ValueObject.util_equals(this.firstChargeCampaigns, bLiveData.firstChargeCampaigns) && ValueObject.util_equals(this.leaderboards, bLiveData.leaderboards) && ValueObject.util_equals(this.startLivePageCampaigns, bLiveData.startLivePageCampaigns) && ValueObject.util_equals(this.hourLeaderboard, bLiveData.hourLeaderboard) && ValueObject.util_equals(this.momentConfig, bLiveData.momentConfig) && ValueObject.util_equals(this.treasureBox, bLiveData.treasureBox) && ValueObject.util_equals(this.videoQualities, bLiveData.videoQualities) && ValueObject.util_equals(this.liveAssets, bLiveData.liveAssets) && ValueObject.util_equals(this.anchorHierarchyGrades, bLiveData.anchorHierarchyGrades) && ValueObject.util_equals(this.givenGiftRemindConfig, bLiveData.givenGiftRemindConfig) && ValueObject.util_equals(this.liveStickerTemplatesMetadata, bLiveData.liveStickerTemplatesMetadata) && ValueObject.util_equals(this.liveStickerTemplates, bLiveData.liveStickerTemplates) && ValueObject.util_equals(this.liveStickers, bLiveData.liveStickers) && ValueObject.util_equals(this.pkSeeks, bLiveData.pkSeeks) && ValueObject.util_equals(this.pkInvites, bLiveData.pkInvites) && ValueObject.util_equals(this.pks, bLiveData.pks) && ValueObject.util_equals(this.liveResources, bLiveData.liveResources) && ValueObject.util_equals(this.fanbases, bLiveData.fanbases) && ValueObject.util_equals(this.fanbaseDetails, bLiveData.fanbaseDetails) && ValueObject.util_equals(this.tasks, bLiveData.tasks) && ValueObject.util_equals(this.taskSummary, bLiveData.taskSummary) && this.version == bLiveData.version && ValueObject.util_equals(this.fanbaseMedalPanel, bLiveData.fanbaseMedalPanel) && ValueObject.util_equals(this.grabRedPacketInfo, bLiveData.grabRedPacketInfo) && ValueObject.util_equals(this.redPacketGrabResult, bLiveData.redPacketGrabResult) && ValueObject.util_equals(this.fanbaseRelations, bLiveData.fanbaseRelations) && ValueObject.util_equals(this.fanbaseHierarchies, bLiveData.fanbaseHierarchies) && ValueObject.util_equals(this.fanbaseMedals, bLiveData.fanbaseMedals) && ValueObject.util_equals(this.records, bLiveData.records) && ValueObject.util_equals(this.anchorFanbaseMedal, bLiveData.anchorFanbaseMedal) && ValueObject.util_equals(this.medals, bLiveData.medals) && ValueObject.util_equals(this.leaderboardUsers, bLiveData.leaderboardUsers) && ValueObject.util_equals(this.fanbaseRedPacketEventCounters, bLiveData.fanbaseRedPacketEventCounters) && ValueObject.util_equals(this.calls, bLiveData.calls) && ValueObject.util_equals(this.callInvites, bLiveData.callInvites) && ValueObject.util_equals(this.rtcTokens, bLiveData.rtcTokens) && ValueObject.util_equals(this.callSummaries, bLiveData.callSummaries) && ValueObject.util_equals(this.hierarchies, bLiveData.hierarchies) && ValueObject.util_equals(this.userEnterRoomEffects, bLiveData.userEnterRoomEffects) && ValueObject.util_equals(this.bottomMenu, bLiveData.bottomMenu) && ValueObject.util_equals(this.connector, bLiveData.connector) && ValueObject.util_equals(this.userProfileConfig, bLiveData.userProfileConfig) && ValueObject.util_equals(this.turboCardInfo, bLiveData.turboCardInfo) && ValueObject.util_equals(this.voiceCalls, bLiveData.voiceCalls) && ValueObject.util_equals(this.voiceCallInvites, bLiveData.voiceCallInvites) && ValueObject.util_equals(this.voiceCallSummaries, bLiveData.voiceCallSummaries) && ValueObject.util_equals(this.voiceRooms, bLiveData.voiceRooms) && ValueObject.util_equals(this.voiceLives, bLiveData.voiceLives) && ValueObject.util_equals(this.topics, bLiveData.topics) && ValueObject.util_equals(this.voiceLiveSummaries, bLiveData.voiceLiveSummaries) && ValueObject.util_equals(this.right, bLiveData.right) && ValueObject.util_equals(this.rightBindAnchors, bLiveData.rightBindAnchors) && ValueObject.util_equals(this.liveOperation, bLiveData.liveOperation) && ValueObject.util_equals(this.voiceLivesSummary, bLiveData.voiceLivesSummary) && ValueObject.util_equals(this.voiceRoomTagInfo, bLiveData.voiceRoomTagInfo) && ValueObject.util_equals(this.giftStar, bLiveData.giftStar) && ValueObject.util_equals(this.advancedTasks, bLiveData.advancedTasks) && ValueObject.util_equals(this.knightsInfosSummary, bLiveData.knightsInfosSummary) && ValueObject.util_equals(this.userKnightInfosSummary, bLiveData.userKnightInfosSummary) && ValueObject.util_equals(this.knightsRuleInfos, bLiveData.knightsRuleInfos) && ValueObject.util_equals(this.anchorKnightInfos, bLiveData.anchorKnightInfos) && ValueObject.util_equals(this.slotInfo, bLiveData.slotInfo) && ValueObject.util_equals(this.equippedGift, bLiveData.equippedGift) && ValueObject.util_equals(this.masks, bLiveData.masks) && ValueObject.util_equals(this.chatSettings, bLiveData.chatSettings) && ValueObject.util_equals(this.voiceLiveGames, bLiveData.voiceLiveGames) && ValueObject.util_equals(this.pkAssets, bLiveData.pkAssets) && ValueObject.util_equals(this.privacyPrivilege, bLiveData.privacyPrivilege) && ValueObject.util_equals(this.fakeUser, bLiveData.fakeUser) && ValueObject.util_equals(this.mysteryConfig, bLiveData.mysteryConfig) && ValueObject.util_equals(this.fakeUserProfiles, bLiveData.fakeUserProfiles) && ValueObject.util_equals(this.pkSummaries, bLiveData.pkSummaries) && ValueObject.util_equals(this.previews, bLiveData.previews) && ValueObject.util_equals(this.videoLiveBulletCommentTypes, bLiveData.videoLiveBulletCommentTypes) && ValueObject.util_equals(this.videoLiveBulletComment, bLiveData.videoLiveBulletComment) && ValueObject.util_equals(this.userLiveRightResources, bLiveData.userLiveRightResources) && ValueObject.util_equals(this.voiceUserProfileConfigs, bLiveData.voiceUserProfileConfigs) && ValueObject.util_equals(this.giftShowcaseItems, bLiveData.giftShowcaseItems) && ValueObject.util_equals(this.accompanyTaskSummary, bLiveData.accompanyTaskSummary) && ValueObject.util_equals(this.accompanyTasks, bLiveData.accompanyTasks) && ValueObject.util_equals(this.accompanyTaskProgress, bLiveData.accompanyTaskProgress) && ValueObject.util_equals(this.giftSetInfo, bLiveData.giftSetInfo) && ValueObject.util_equals(this.scrapTabs, bLiveData.scrapTabs) && ValueObject.util_equals(this.givenGiftRemindStatus, bLiveData.givenGiftRemindStatus) && ValueObject.util_equals(this.userLiveHierarchy, bLiveData.userLiveHierarchy) && ValueObject.util_equals(this.chestRewardInfo, bLiveData.chestRewardInfo) && ValueObject.util_equals(this.signInDetails, bLiveData.signInDetails) && ValueObject.util_equals(this.signInPrizes, bLiveData.signInPrizes) && ValueObject.util_equals(this.liveBeautyConfig, bLiveData.liveBeautyConfig) && ValueObject.util_equals(this.voiceUserFeedInfos, bLiveData.voiceUserFeedInfos) && ValueObject.util_equals(this.userLiveHierarchyProgress, bLiveData.userLiveHierarchyProgress) && ValueObject.util_equals(this.teenagerLives, bLiveData.teenagerLives) && ValueObject.util_equals(this.gameInfoResponse, bLiveData.gameInfoResponse) && ValueObject.util_equals(this.signInAchievementMedals, bLiveData.signInAchievementMedals) && ValueObject.util_equals(this.guardAnchorRankInfos, bLiveData.guardAnchorRankInfos) && ValueObject.util_equals(this.guardRecords, bLiveData.guardRecords) && ValueObject.util_equals(this.userDailyTasks, bLiveData.userDailyTasks) && ValueObject.util_equals(this.anchorDailyTasks, bLiveData.anchorDailyTasks) && ValueObject.util_equals(this.stormComment, bLiveData.stormComment) && ValueObject.util_equals(this.liveResourcesCDN, bLiveData.liveResourcesCDN) && ValueObject.util_equals(this.voiceLiveAssert, bLiveData.voiceLiveAssert) && ValueObject.util_equals(this.firstRechargeStatus, bLiveData.firstRechargeStatus) && ValueObject.util_equals(this.firstRechargeDetail, bLiveData.firstRechargeDetail) && ValueObject.util_equals(this.voiceTabs, bLiveData.voiceTabs) && ValueObject.util_equals(this.shareItems, bLiveData.shareItems) && ValueObject.util_equals(this.voiceRoomFeeds, bLiveData.voiceRoomFeeds) && ValueObject.util_equals(this.skins, bLiveData.skins) && ValueObject.util_equals(this.voiceChatGroup, bLiveData.voiceChatGroup) && ValueObject.util_equals(this.voiceChatGroupApplies, bLiveData.voiceChatGroupApplies) && ValueObject.util_equals(this.voiceManagerInvites, bLiveData.voiceManagerInvites) && ValueObject.util_equals(this.voiceManagers, bLiveData.voiceManagers) && ValueObject.util_equals(this.multiCalls, bLiveData.multiCalls) && ValueObject.util_equals(this.multiCallAsset, bLiveData.multiCallAsset) && ValueObject.util_equals(this.multiCallInvites, bLiveData.multiCallInvites) && ValueObject.util_equals(this.multiCallSummary, bLiveData.multiCallSummary) && ValueObject.util_equals(this.activitySuggests, bLiveData.activitySuggests) && ValueObject.util_equals(this.fanbaseRecall, bLiveData.fanbaseRecall) && ValueObject.util_equals(this.accompanyUserRanking, bLiveData.accompanyUserRanking) && ValueObject.util_equals(this.sparkletProgress, bLiveData.sparkletProgress) && ValueObject.util_equals(this.liveAnchors, bLiveData.liveAnchors) && ValueObject.util_equals(this.suggestedLives, bLiveData.suggestedLives) && ValueObject.util_equals(this.liveSchemas, bLiveData.liveSchemas) && ValueObject.util_equals(this.userLivePush, bLiveData.userLivePush) && ValueObject.util_equals(this.touchMeDetail, bLiveData.touchMeDetail) && ValueObject.util_equals(this.multiCallSwitchToLeadRoleInvite, bLiveData.multiCallSwitchToLeadRoleInvite) && ValueObject.util_equals(this.multiCallExtends, bLiveData.multiCallExtends) && ValueObject.util_equals(this.scoreSummary, bLiveData.scoreSummary) && ValueObject.util_equals(this.liveTopChatMessage, bLiveData.liveTopChatMessage) && this.needTitle == bLiveData.needTitle && ValueObject.util_equals(this.squareEntranceSummary, bLiveData.squareEntranceSummary) && ValueObject.util_equals(this.memberActivityList, bLiveData.memberActivityList) && ValueObject.util_equals(this.voiceLiveActivityMoment, bLiveData.voiceLiveActivityMoment) && ValueObject.util_equals(this.roomAnnouncement, bLiveData.roomAnnouncement) && ValueObject.util_equals(this.voiceLiveUserHeartbeatRewardList, bLiveData.voiceLiveUserHeartbeatRewardList) && ValueObject.util_equals(this.voiceLiveHeartBeat, bLiveData.voiceLiveHeartBeat) && ValueObject.util_equals(this.liveStickerTemplatesGifts, bLiveData.liveStickerTemplatesGifts) && ValueObject.util_equals(this.voiceLivePopsTotal, bLiveData.voiceLivePopsTotal) && ValueObject.util_equals(this.grabHatGame, bLiveData.grabHatGame) && ValueObject.util_equals(this.grabHatCps, bLiveData.grabHatCps) && ValueObject.util_equals(this.voiceLiveAuctions, bLiveData.voiceLiveAuctions) && ValueObject.util_equals(this.cpRecommendUserList, bLiveData.cpRecommendUserList) && ValueObject.util_equals(this.voiceCpLeaderBoards, bLiveData.voiceCpLeaderBoards) && ValueObject.util_equals(this.voiceCpHouseTaskInfos, bLiveData.voiceCpHouseTaskInfos) && ValueObject.util_equals(this.voiceCpHouseInfo, bLiveData.voiceCpHouseInfo) && ValueObject.util_equals(this.voiceCpHouseList, bLiveData.voiceCpHouseList) && ValueObject.util_equals(this.voiceHouseRankUpgradeInfo, bLiveData.voiceHouseRankUpgradeInfo) && ValueObject.util_equals(this.backGroundPicSetting, bLiveData.backGroundPicSetting) && ValueObject.util_equals(this.dailyPayment, bLiveData.dailyPayment) && ValueObject.util_equals(this.intlVoiceLiveCampaigns, bLiveData.intlVoiceLiveCampaigns) && ValueObject.util_equals(this.complexCardList, bLiveData.complexCardList) && ValueObject.util_equals(this.voiceGiftWallList, bLiveData.voiceGiftWallList) && ValueObject.util_equals(this.voiceGiftWallBriefInfo, bLiveData.voiceGiftWallBriefInfo) && ValueObject.util_equals(this.voiceGiftWallBookDetail, bLiveData.voiceGiftWallBookDetail) && ValueObject.util_equals(this.voiceFollowships, bLiveData.voiceFollowships) && ValueObject.util_equals(this.voiceUserGiftItems, bLiveData.voiceUserGiftItems) && ValueObject.util_equals(this.flameCoinMarket, bLiveData.flameCoinMarket) && ValueObject.util_equals(this.virtualVoiceCard, bLiveData.virtualVoiceCard) && ValueObject.util_equals(this.chatMsgLiveInfo, bLiveData.chatMsgLiveInfo) && ValueObject.util_equals(this.voiceKTVGame, bLiveData.voiceKTVGame) && ValueObject.util_equals(this.voiceKTVSongs, bLiveData.voiceKTVSongs) && ValueObject.util_equals(this.voiceKTVOrders, bLiveData.voiceKTVOrders) && ValueObject.util_equals(this.complexCardConfig, bLiveData.complexCardConfig) && ValueObject.util_equals(this.familyMedals, bLiveData.familyMedals) && ValueObject.util_equals(this.schema, bLiveData.schema) && ValueObject.util_equals(this.cells, bLiveData.cells) && ValueObject.util_equals(this.voiceSettles, bLiveData.voiceSettles) && ValueObject.util_equals(this.voiceLivePush, bLiveData.voiceLivePush) && ValueObject.util_equals(this.voiceAdminPanelCounter, bLiveData.voiceAdminPanelCounter) && ValueObject.util_equals(this.voiceUserMessageRemind, bLiveData.voiceUserMessageRemind) && ValueObject.util_equals(this.shareRoomConfig, bLiveData.shareRoomConfig) && ValueObject.util_equals(this.nobleNiceNumberDetail, bLiveData.nobleNiceNumberDetail) && ValueObject.util_equals(this.nobleNiceNumberList, bLiveData.nobleNiceNumberList) && ValueObject.util_equals(this.heatVoiceRoomTasks, bLiveData.heatVoiceRoomTasks) && ValueObject.util_equals(this.liveRoomInProfile, bLiveData.liveRoomInProfile) && ValueObject.util_equals(this.voiceRoomInProfile, bLiveData.voiceRoomInProfile) && ValueObject.util_equals(this.voiceGiftWall, bLiveData.voiceGiftWall) && ValueObject.util_equals(this.voiceMedalWall, bLiveData.voiceMedalWall) && ValueObject.util_equals(this.voiceWeekLeaderboards, bLiveData.voiceWeekLeaderboards) && ValueObject.util_equals(this.voiceRoomLevelDetail, bLiveData.voiceRoomLevelDetail) && ValueObject.util_equals(this.voiceRoomSummary, bLiveData.voiceRoomSummary) && ValueObject.util_equals(this.starRedPackets, bLiveData.starRedPackets) && ValueObject.util_equals(this.showSideBarConfig, bLiveData.showSideBarConfig) && ValueObject.util_equals(this.voiceLiveBanners, bLiveData.voiceLiveBanners) && ValueObject.util_equals(this.multiPk, bLiveData.multiPk) && ValueObject.util_equals(this.multiPkPanel, bLiveData.multiPkPanel) && ValueObject.util_equals(this.multiPkAsset, bLiveData.multiPkAsset) && ValueObject.util_equals(this.multiPkLeaderboard, bLiveData.multiPkLeaderboard) && ValueObject.util_equals(this.voiceRoomClasses, bLiveData.voiceRoomClasses) && ValueObject.util_equals(this.chatTopicAsset, bLiveData.chatTopicAsset) && ValueObject.util_equals(this.chatTopic, bLiveData.chatTopic) && ValueObject.util_equals(this.mutexMode, bLiveData.mutexMode) && ValueObject.util_equals(this.modelDescribe, bLiveData.modelDescribe) && ValueObject.util_equals(this.liveMedalCDN, bLiveData.liveMedalCDN) && ValueObject.util_equals(this.voiceLiveUserFeedList, bLiveData.voiceLiveUserFeedList) && ValueObject.util_equals(this.userRealVoiceLive, bLiveData.userRealVoiceLive) && ValueObject.util_equals(this.userLeaderboard, bLiveData.userLeaderboard) && ValueObject.util_equals(this.anchorLeaderboard, bLiveData.anchorLeaderboard) && ValueObject.util_equals(this.userWeekLeaderboard, bLiveData.userWeekLeaderboard) && ValueObject.util_equals(this.weekCpInfo, bLiveData.weekCpInfo) && ValueObject.util_equals(this.auctionCandidates, bLiveData.auctionCandidates) && ValueObject.util_equals(this.auctionApplies, bLiveData.auctionApplies) && ValueObject.util_equals(this.auctionInvites, bLiveData.auctionInvites) && ValueObject.util_equals(this.voiceLiveAuctionAsset, bLiveData.voiceLiveAuctionAsset) && ValueObject.util_equals(this.auctionRelationCards, bLiveData.auctionRelationCards) && ValueObject.util_equals(this.bigTVLives, bLiveData.bigTVLives) && ValueObject.util_equals(this.giftLeaderboard, bLiveData.giftLeaderboard) && ValueObject.util_equals(this.liveClarityLevelInfos, bLiveData.liveClarityLevelInfos) && ValueObject.util_equals(this.voiceUserLeaderboards, bLiveData.voiceUserLeaderboards) && ValueObject.util_equals(this.pkSuggestedAnchors, bLiveData.pkSuggestedAnchors) && ValueObject.util_equals(this.liveQuitPopup, bLiveData.liveQuitPopup) && this.exchangeTTCRedpoint == bLiveData.exchangeTTCRedpoint && ValueObject.util_equals(this.voiceRoomAsset, bLiveData.voiceRoomAsset) && ValueObject.util_equals(this.family, bLiveData.family) && ValueObject.util_equals(this.familyShareInfo, bLiveData.familyShareInfo) && ValueObject.util_equals(this.userPushSwitch, bLiveData.userPushSwitch) && ValueObject.util_equals(this.officialShowCurrentAnchorInfo, bLiveData.officialShowCurrentAnchorInfo) && ValueObject.util_equals(this.officialShowList, bLiveData.officialShowList) && ValueObject.util_equals(this.officialShowUser, bLiveData.officialShowUser) && ValueObject.util_equals(this.dragonScourgeDisplayChatMessage, bLiveData.dragonScourgeDisplayChatMessage) && ValueObject.util_equals(this.rights, bLiveData.rights) && ValueObject.util_equals(this.auctionPlatformLeaderboardInfo, bLiveData.auctionPlatformLeaderboardInfo) && ValueObject.util_equals(this.auctionCounter, bLiveData.auctionCounter) && ValueObject.util_equals(this.bagpackItem, bLiveData.bagpackItem) && ValueObject.util_equals(this.giftDetails, bLiveData.giftDetails) && ValueObject.util_equals(this.luckyParadiseBottomEntrance, bLiveData.luckyParadiseBottomEntrance) && ValueObject.util_equals(this.intlLiveFramesMetadata, bLiveData.intlLiveFramesMetadata) && ValueObject.util_equals(this.media, bLiveData.media) && ValueObject.util_equals(this.lovePlanet, bLiveData.lovePlanet) && ValueObject.util_equals(this.storeBackgroundPics, bLiveData.storeBackgroundPics) && ValueObject.util_equals(this.livePopUpGuild, bLiveData.livePopUpGuild) && ValueObject.util_equals(this.voiceLivePopUpGuild, bLiveData.voiceLivePopUpGuild) && ValueObject.util_equals(this.giftSkinPanel, bLiveData.giftSkinPanel) && ValueObject.util_equals(this.emojiPlayMenu, bLiveData.emojiPlayMenu) && ValueObject.util_equals(this.voicePayGuideUser, bLiveData.voicePayGuideUser) && ValueObject.util_equals(this.anchorGuildCheck, bLiveData.anchorGuildCheck) && ValueObject.util_equals(this.cpInviteRecords, bLiveData.cpInviteRecords) && ValueObject.util_equals(this.siteWideBroadcastFinder, bLiveData.siteWideBroadcastFinder) && ValueObject.util_equals(this.gameOperationPositions, bLiveData.gameOperationPositions) && ValueObject.util_equals(this.videoChatLive, bLiveData.videoChatLive) && ValueObject.util_equals(this.videoChat, bLiveData.videoChat) && ValueObject.util_equals(this.videoChatSummary, bLiveData.videoChatSummary) && this.isAnchor == bLiveData.isAnchor && ValueObject.util_equals(this.superUserBirthdayDetail, bLiveData.superUserBirthdayDetail) && ValueObject.util_equals(this.missedCalls, bLiveData.missedCalls) && this.missedCallCount == bLiveData.missedCallCount && ValueObject.util_equals(this.anchorCall, bLiveData.anchorCall) && ValueObject.util_equals(this.videoChatAssets, bLiveData.videoChatAssets) && ValueObject.util_equals(this.videoChatSquareSummary, bLiveData.videoChatSquareSummary) && ValueObject.util_equals(this.videoChatAttendeeCallInfo, bLiveData.videoChatAttendeeCallInfo) && ValueObject.util_equals(this.randomMatchCouponDetail, bLiveData.randomMatchCouponDetail) && ValueObject.util_equals(this.videoChatRandomMatch, bLiveData.videoChatRandomMatch) && ValueObject.util_equals(this.code, bLiveData.code) && ValueObject.util_equals(this.userCompliance, bLiveData.userCompliance) && ValueObject.util_equals(this.gamePanelMenus, bLiveData.gamePanelMenus) && ValueObject.util_equals(this.funFairBottomEntrance, bLiveData.funFairBottomEntrance) && ValueObject.util_equals(this.voiceSquareButtons, bLiveData.voiceSquareButtons) && ValueObject.util_equals(this.superChatDetail, bLiveData.superChatDetail) && ValueObject.util_equals(this.voiceLeaderboardEntrances, bLiveData.voiceLeaderboardEntrances) && ValueObject.util_equals(this.skinList, bLiveData.skinList) && ValueObject.util_equals(this.starlightHierarchies, bLiveData.starlightHierarchies) && ValueObject.util_equals(this.pkItemCardsDetail, bLiveData.pkItemCardsDetail) && ValueObject.util_equals(this.octopusUrl, bLiveData.octopusUrl) && ValueObject.util_equals(this.intlConfig, bLiveData.intlConfig) && ValueObject.util_equals(this.intlMedalWall, bLiveData.intlMedalWall) && ValueObject.util_equals(this.medalWall, bLiveData.medalWall) && ValueObject.util_equals(this.gameAsset, bLiveData.gameAsset) && ValueObject.util_equals(this.game, bLiveData.game) && ValueObject.util_equals(this.canJoinGame, bLiveData.canJoinGame) && ValueObject.util_equals(this.voiceFanbase, bLiveData.voiceFanbase) && ValueObject.util_equals(this.voiceFanbaseDetail, bLiveData.voiceFanbaseDetail) && ValueObject.util_equals(this.memberLbs, bLiveData.memberLbs) && ValueObject.util_equals(this.voiceFanbaseLbs, bLiveData.voiceFanbaseLbs) && ValueObject.util_equals(this.myJoins, bLiveData.myJoins) && ValueObject.util_equals(this.voiceFanbaseMedals, bLiveData.voiceFanbaseMedals) && ValueObject.util_equals(this.heatBoxEntrance, bLiveData.heatBoxEntrance) && ValueObject.util_equals(this.voicePkInfo, bLiveData.voicePkInfo) && ValueObject.util_equals(this.guard, bLiveData.guard) && ValueObject.util_equals(this.bossCall, bLiveData.bossCall) && ValueObject.util_equals(this.bossGiftRecord, bLiveData.bossGiftRecord) && ValueObject.util_equals(this.giftWallV3Briefs, bLiveData.giftWallV3Briefs) && ValueObject.util_equals(this.voiceLiveBulletCommentTypes, bLiveData.voiceLiveBulletCommentTypes) && ValueObject.util_equals(this.voiceLiveBulletComment, bLiveData.voiceLiveBulletComment);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<User> list = this.users;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Relationship> list2 = this.relationships;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveVerificationCenter> list3 = this.verificationCenter;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        BLiveMonetizationConfig bLiveMonetizationConfig = this.monetizationConfig;
        int iHashCode4 = (iHashCode3 + (bLiveMonetizationConfig != null ? bLiveMonetizationConfig.hashCode() : 0)) * 41;
        List<BLiveMember> list4 = this.members;
        int iHashCode5 = (iHashCode4 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<BLiveAnchor> list5 = this.anchors;
        int iHashCode6 = (iHashCode5 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<BLiveRoom> list6 = this.rooms;
        int iHashCode7 = (iHashCode6 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<BLive> list7 = this.lives;
        int iHashCode8 = (iHashCode7 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<BLiveSummary> list8 = this.liveSummaries;
        int iHashCode9 = (iHashCode8 + (list8 != null ? list8.hashCode() : 0)) * 41;
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = this.givenGiftRes;
        int iHashCode10 = (iHashCode9 + (bLiveSendLiveGiftResult != null ? bLiveSendLiveGiftResult.hashCode() : 0)) * 41;
        List<BLiveChatMessage> list9 = this.liveChatMessages;
        int iHashCode11 = (iHashCode10 + (list9 != null ? list9.hashCode() : 0)) * 41;
        List<BLiveSquareSummary> list10 = this.liveSquareSummaries;
        int iHashCode12 = (iHashCode11 + (list10 != null ? list10.hashCode() : 0)) * 41;
        List<BLiveActivitySummary> list11 = this.liveActivitySummaries;
        int iHashCode13 = (iHashCode12 + (list11 != null ? list11.hashCode() : 0)) * 41;
        List<BLiveActivity> list12 = this.liveActivities;
        int iHashCode14 = (iHashCode13 + (list12 != null ? list12.hashCode() : 0)) * 41;
        List<BLiveMember> list13 = this.managers;
        int iHashCode15 = (iHashCode14 + (list13 != null ? list13.hashCode() : 0)) * 41;
        List<BLiveMenuItem> list14 = this.menuItems;
        int iHashCode16 = (iHashCode15 + (list14 != null ? list14.hashCode() : 0)) * 41;
        List<BLiveCampaign> list15 = this.liveCampaigns;
        int iHashCode17 = (iHashCode16 + (list15 != null ? list15.hashCode() : 0)) * 41;
        List<BLiveUserLevel> list16 = this.liveHierarchyGrades;
        int iHashCode18 = (iHashCode17 + (list16 != null ? list16.hashCode() : 0)) * 41;
        List<BLiveChatTip> list17 = this.chatTips;
        int iHashCode19 = (iHashCode18 + (list17 != null ? list17.hashCode() : 0)) * 41;
        List<BLivePush> list18 = this.livePushes;
        int iHashCode20 = (iHashCode19 + (list18 != null ? list18.hashCode() : 0)) * 41;
        BLiveGiftItemCDN bLiveGiftItemCDN = this.giftItemCDN;
        int iHashCode21 = (iHashCode20 + (bLiveGiftItemCDN != null ? bLiveGiftItemCDN.hashCode() : 0)) * 41;
        BLiveRoomTabGifts bLiveRoomTabGifts = this.liveRoomTabGifts;
        int iHashCode22 = (iHashCode21 + (bLiveRoomTabGifts != null ? bLiveRoomTabGifts.hashCode() : 0)) * 41;
        List<Followship> list19 = this.followships;
        int iHashCode23 = (iHashCode22 + (list19 != null ? list19.hashCode() : 0)) * 41;
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign = this.firstChargeCampaigns;
        int iHashCode24 = (iHashCode23 + (bLiveFirstChargeCampaign != null ? bLiveFirstChargeCampaign.hashCode() : 0)) * 41;
        List<BLiveLeaderBoards> list20 = this.leaderboards;
        int iHashCode25 = (iHashCode24 + (list20 != null ? list20.hashCode() : 0)) * 41;
        List<BLivePageCampaign> list21 = this.startLivePageCampaigns;
        int iHashCode26 = (iHashCode25 + (list21 != null ? list21.hashCode() : 0)) * 41;
        BLiveHourLeaderBoard bLiveHourLeaderBoard = this.hourLeaderboard;
        int iHashCode27 = (iHashCode26 + (bLiveHourLeaderBoard != null ? bLiveHourLeaderBoard.hashCode() : 0)) * 41;
        BLiveMomentConfig bLiveMomentConfig = this.momentConfig;
        int iHashCode28 = (iHashCode27 + (bLiveMomentConfig != null ? bLiveMomentConfig.hashCode() : 0)) * 41;
        BLiveTreasureBox bLiveTreasureBox = this.treasureBox;
        int iHashCode29 = (iHashCode28 + (bLiveTreasureBox != null ? bLiveTreasureBox.hashCode() : 0)) * 41;
        List<BLiveVideoQuality> list22 = this.videoQualities;
        int iHashCode30 = (iHashCode29 + (list22 != null ? list22.hashCode() : 0)) * 41;
        BLiveAssets bLiveAssets = this.liveAssets;
        int iHashCode31 = (iHashCode30 + (bLiveAssets != null ? bLiveAssets.hashCode() : 0)) * 41;
        List<BLiveAnchorLevel> list23 = this.anchorHierarchyGrades;
        int iHashCode32 = (iHashCode31 + (list23 != null ? list23.hashCode() : 0)) * 41;
        BLiveGiftBubbleConfig bLiveGiftBubbleConfig = this.givenGiftRemindConfig;
        int iHashCode33 = (iHashCode32 + (bLiveGiftBubbleConfig != null ? bLiveGiftBubbleConfig.hashCode() : 0)) * 41;
        BLiveStickerMetaData bLiveStickerMetaData = this.liveStickerTemplatesMetadata;
        int iHashCode34 = (iHashCode33 + (bLiveStickerMetaData != null ? bLiveStickerMetaData.hashCode() : 0)) * 41;
        List<BLiveStickerMetaDataItem> list24 = this.liveStickerTemplates;
        int iHashCode35 = (iHashCode34 + (list24 != null ? list24.hashCode() : 0)) * 41;
        List<BLiveAddStickerResult> list25 = this.liveStickers;
        int iHashCode36 = (iHashCode35 + (list25 != null ? list25.hashCode() : 0)) * 41;
        List<BLivePkSeek> list26 = this.pkSeeks;
        int iHashCode37 = (iHashCode36 + (list26 != null ? list26.hashCode() : 0)) * 41;
        List<BLivePkInvite> list27 = this.pkInvites;
        int iHashCode38 = (iHashCode37 + (list27 != null ? list27.hashCode() : 0)) * 41;
        List<BLivePk> list28 = this.pks;
        int iHashCode39 = (iHashCode38 + (list28 != null ? list28.hashCode() : 0)) * 41;
        List<BLiveEffect> list29 = this.liveResources;
        int iHashCode40 = (iHashCode39 + (list29 != null ? list29.hashCode() : 0)) * 41;
        List<BLiveFanBase> list30 = this.fanbases;
        int iHashCode41 = (iHashCode40 + (list30 != null ? list30.hashCode() : 0)) * 41;
        List<BLiveFanBaseDetail> list31 = this.fanbaseDetails;
        int iHashCode42 = (iHashCode41 + (list31 != null ? list31.hashCode() : 0)) * 41;
        List<BLiveTask> list32 = this.tasks;
        int iHashCode43 = (iHashCode42 + (list32 != null ? list32.hashCode() : 0)) * 41;
        BLiveTaskSummary bLiveTaskSummary = this.taskSummary;
        int iHashCode44 = bLiveTaskSummary != null ? bLiveTaskSummary.hashCode() : 0;
        long j = this.version;
        int i3 = (((iHashCode43 + iHashCode44) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel = this.fanbaseMedalPanel;
        int iHashCode45 = (i3 + (bLiveFanBaseMedalPanel != null ? bLiveFanBaseMedalPanel.hashCode() : 0)) * 41;
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = this.grabRedPacketInfo;
        int iHashCode46 = (iHashCode45 + (bLiveFanBaseRedPacketInfo != null ? bLiveFanBaseRedPacketInfo.hashCode() : 0)) * 41;
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo2 = this.redPacketGrabResult;
        int iHashCode47 = (iHashCode46 + (bLiveFanBaseRedPacketInfo2 != null ? bLiveFanBaseRedPacketInfo2.hashCode() : 0)) * 41;
        List<BLiveFanBaseRelationShip> list33 = this.fanbaseRelations;
        int iHashCode48 = (iHashCode47 + (list33 != null ? list33.hashCode() : 0)) * 41;
        List<BLiveFanBaseHierarchy> list34 = this.fanbaseHierarchies;
        int iHashCode49 = (iHashCode48 + (list34 != null ? list34.hashCode() : 0)) * 41;
        List<BLiveFanBaseMedal> list35 = this.fanbaseMedals;
        int iHashCode50 = (iHashCode49 + (list35 != null ? list35.hashCode() : 0)) * 41;
        List<BLiveLeaderboardRecord> list36 = this.records;
        int iHashCode51 = (iHashCode50 + (list36 != null ? list36.hashCode() : 0)) * 41;
        BLiveCommonViewConfig bLiveCommonViewConfig = this.anchorFanbaseMedal;
        int iHashCode52 = (iHashCode51 + (bLiveCommonViewConfig != null ? bLiveCommonViewConfig.hashCode() : 0)) * 41;
        List<BLiveLeaderboardMedal> list37 = this.medals;
        int iHashCode53 = (iHashCode52 + (list37 != null ? list37.hashCode() : 0)) * 41;
        List<BLiveLeaderboardUser> list38 = this.leaderboardUsers;
        int iHashCode54 = (iHashCode53 + (list38 != null ? list38.hashCode() : 0)) * 41;
        List<BLiveSquareDetailCounters> list39 = this.fanbaseRedPacketEventCounters;
        int iHashCode55 = (iHashCode54 + (list39 != null ? list39.hashCode() : 0)) * 41;
        List<BLiveCall> list40 = this.calls;
        int iHashCode56 = (iHashCode55 + (list40 != null ? list40.hashCode() : 0)) * 41;
        List<BLiveCallInvite> list41 = this.callInvites;
        int iHashCode57 = (iHashCode56 + (list41 != null ? list41.hashCode() : 0)) * 41;
        List<BLiveRtcToken> list42 = this.rtcTokens;
        int iHashCode58 = (iHashCode57 + (list42 != null ? list42.hashCode() : 0)) * 41;
        List<BLiveCallSummary> list43 = this.callSummaries;
        int iHashCode59 = (iHashCode58 + (list43 != null ? list43.hashCode() : 0)) * 41;
        List<BLiveBoardHierarchy> list44 = this.hierarchies;
        int iHashCode60 = (iHashCode59 + (list44 != null ? list44.hashCode() : 0)) * 41;
        List<BLiveEnterRoomEffect> list45 = this.userEnterRoomEffects;
        int iHashCode61 = (iHashCode60 + (list45 != null ? list45.hashCode() : 0)) * 41;
        BLiveBottomMenu bLiveBottomMenu = this.bottomMenu;
        int iHashCode62 = (iHashCode61 + (bLiveBottomMenu != null ? bLiveBottomMenu.hashCode() : 0)) * 41;
        Connector connector = this.connector;
        int iHashCode63 = (iHashCode62 + (connector != null ? connector.hashCode() : 0)) * 41;
        List<BLiveUserProfileConfig> list46 = this.userProfileConfig;
        int iHashCode64 = (iHashCode63 + (list46 != null ? list46.hashCode() : 0)) * 41;
        BLiveTurboCardInfo bLiveTurboCardInfo = this.turboCardInfo;
        int iHashCode65 = (iHashCode64 + (bLiveTurboCardInfo != null ? bLiveTurboCardInfo.hashCode() : 0)) * 41;
        List<BLiveVoiceCall> list47 = this.voiceCalls;
        int iHashCode66 = (iHashCode65 + (list47 != null ? list47.hashCode() : 0)) * 41;
        List<BLiveVoiceCallInvite> list48 = this.voiceCallInvites;
        int iHashCode67 = (iHashCode66 + (list48 != null ? list48.hashCode() : 0)) * 41;
        List<BLiveVoiceCallSummary> list49 = this.voiceCallSummaries;
        int iHashCode68 = (iHashCode67 + (list49 != null ? list49.hashCode() : 0)) * 41;
        List<BLiveVoiceRoom> list50 = this.voiceRooms;
        int iHashCode69 = (iHashCode68 + (list50 != null ? list50.hashCode() : 0)) * 41;
        List<BLiveVoice> list51 = this.voiceLives;
        int iHashCode70 = (iHashCode69 + (list51 != null ? list51.hashCode() : 0)) * 41;
        List<BLiveVoiceTopic> list52 = this.topics;
        int iHashCode71 = (iHashCode70 + (list52 != null ? list52.hashCode() : 0)) * 41;
        List<BLiveSummary> list53 = this.voiceLiveSummaries;
        int iHashCode72 = (iHashCode71 + (list53 != null ? list53.hashCode() : 0)) * 41;
        BLiveRightInfo bLiveRightInfo = this.right;
        int iHashCode73 = (iHashCode72 + (bLiveRightInfo != null ? bLiveRightInfo.hashCode() : 0)) * 41;
        List<BLiveRightAnchorInfo> list54 = this.rightBindAnchors;
        int iHashCode74 = (iHashCode73 + (list54 != null ? list54.hashCode() : 0)) * 41;
        BLiveOperation bLiveOperation = this.liveOperation;
        int iHashCode75 = (iHashCode74 + (bLiveOperation != null ? bLiveOperation.hashCode() : 0)) * 41;
        List<BLiveFeedSummary> list55 = this.voiceLivesSummary;
        int iHashCode76 = (iHashCode75 + (list55 != null ? list55.hashCode() : 0)) * 41;
        BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = this.voiceRoomTagInfo;
        int iHashCode77 = (iHashCode76 + (bLiveVoiceRoomTagInfo != null ? bLiveVoiceRoomTagInfo.hashCode() : 0)) * 41;
        BLiveGiftStarBoard bLiveGiftStarBoard = this.giftStar;
        int iHashCode78 = (iHashCode77 + (bLiveGiftStarBoard != null ? bLiveGiftStarBoard.hashCode() : 0)) * 41;
        List<BLiveAdvanceTask> list56 = this.advancedTasks;
        int iHashCode79 = (iHashCode78 + (list56 != null ? list56.hashCode() : 0)) * 41;
        List<BLiveKnightsInfosSummary> list57 = this.knightsInfosSummary;
        int iHashCode80 = (iHashCode79 + (list57 != null ? list57.hashCode() : 0)) * 41;
        List<BLiveUserKnightInfoSummary> list58 = this.userKnightInfosSummary;
        int iHashCode81 = (iHashCode80 + (list58 != null ? list58.hashCode() : 0)) * 41;
        List<BLiveKnightsRuleInfoItem> list59 = this.knightsRuleInfos;
        int iHashCode82 = (iHashCode81 + (list59 != null ? list59.hashCode() : 0)) * 41;
        List<BLiveAnchorKnightInfos> list60 = this.anchorKnightInfos;
        int iHashCode83 = (iHashCode82 + (list60 != null ? list60.hashCode() : 0)) * 41;
        BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo = this.slotInfo;
        int iHashCode84 = (iHashCode83 + (bLiveUpgradeGiftInfo != null ? bLiveUpgradeGiftInfo.hashCode() : 0)) * 41;
        BLiveGiftItemShort bLiveGiftItemShort = this.equippedGift;
        int iHashCode85 = (iHashCode84 + (bLiveGiftItemShort != null ? bLiveGiftItemShort.hashCode() : 0)) * 41;
        List<BLiveUserMask> list61 = this.masks;
        int iHashCode86 = (iHashCode85 + (list61 != null ? list61.hashCode() : 0)) * 41;
        BLiveChatMangerSettings bLiveChatMangerSettings = this.chatSettings;
        int iHashCode87 = (iHashCode86 + (bLiveChatMangerSettings != null ? bLiveChatMangerSettings.hashCode() : 0)) * 41;
        List<VoiceLiveGame> list62 = this.voiceLiveGames;
        int iHashCode88 = (iHashCode87 + (list62 != null ? list62.hashCode() : 0)) * 41;
        BLivePkAssets bLivePkAssets = this.pkAssets;
        int iHashCode89 = (iHashCode88 + (bLivePkAssets != null ? bLivePkAssets.hashCode() : 0)) * 41;
        List<BLiveUserPrivacyPrivilege> list63 = this.privacyPrivilege;
        int iHashCode90 = (iHashCode89 + (list63 != null ? list63.hashCode() : 0)) * 41;
        BLiveFakeUser bLiveFakeUser = this.fakeUser;
        int iHashCode91 = (iHashCode90 + (bLiveFakeUser != null ? bLiveFakeUser.hashCode() : 0)) * 41;
        BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig = this.mysteryConfig;
        int iHashCode92 = (iHashCode91 + (bLiveHideAvatarEnterConfig != null ? bLiveHideAvatarEnterConfig.hashCode() : 0)) * 41;
        List<BLiveFakeUserProfile> list64 = this.fakeUserProfiles;
        int iHashCode93 = (iHashCode92 + (list64 != null ? list64.hashCode() : 0)) * 41;
        List<BLivePkSummary> list65 = this.pkSummaries;
        int iHashCode94 = (iHashCode93 + (list65 != null ? list65.hashCode() : 0)) * 41;
        List<BLiveCommonViewConfig> list66 = this.previews;
        int iHashCode95 = (iHashCode94 + (list66 != null ? list66.hashCode() : 0)) * 41;
        BLiveDanmakuList bLiveDanmakuList = this.videoLiveBulletCommentTypes;
        int iHashCode96 = (iHashCode95 + (bLiveDanmakuList != null ? bLiveDanmakuList.hashCode() : 0)) * 41;
        BLiveDanmakuItem bLiveDanmakuItem = this.videoLiveBulletComment;
        int iHashCode97 = (iHashCode96 + (bLiveDanmakuItem != null ? bLiveDanmakuItem.hashCode() : 0)) * 41;
        List<BLiveUserRightResource> list67 = this.userLiveRightResources;
        int iHashCode98 = (iHashCode97 + (list67 != null ? list67.hashCode() : 0)) * 41;
        List<BLiveVoiceUserProfileConfig> list68 = this.voiceUserProfileConfigs;
        int iHashCode99 = (iHashCode98 + (list68 != null ? list68.hashCode() : 0)) * 41;
        List<BLiveGiftShowcaseItem> list69 = this.giftShowcaseItems;
        int iHashCode100 = (iHashCode99 + (list69 != null ? list69.hashCode() : 0)) * 41;
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = this.accompanyTaskSummary;
        int iHashCode101 = (iHashCode100 + (bLiveAccommpanyTaskSummary != null ? bLiveAccommpanyTaskSummary.hashCode() : 0)) * 41;
        List<BLiveAccommpanyTasks> list70 = this.accompanyTasks;
        int iHashCode102 = (iHashCode101 + (list70 != null ? list70.hashCode() : 0)) * 41;
        BLiveAccommpanyTasksProgress bLiveAccommpanyTasksProgress = this.accompanyTaskProgress;
        int iHashCode103 = (iHashCode102 + (bLiveAccommpanyTasksProgress != null ? bLiveAccommpanyTasksProgress.hashCode() : 0)) * 41;
        BLiveGiftSetInfo bLiveGiftSetInfo = this.giftSetInfo;
        int iHashCode104 = (iHashCode103 + (bLiveGiftSetInfo != null ? bLiveGiftSetInfo.hashCode() : 0)) * 41;
        List<BLiveScrapTabData> list71 = this.scrapTabs;
        int iHashCode105 = (iHashCode104 + (list71 != null ? list71.hashCode() : 0)) * 41;
        BLiveGivenGiftRemindStatus bLiveGivenGiftRemindStatus = this.givenGiftRemindStatus;
        int iHashCode106 = (iHashCode105 + (bLiveGivenGiftRemindStatus != null ? bLiveGivenGiftRemindStatus.hashCode() : 0)) * 41;
        BLiveUserLevel bLiveUserLevel = this.userLiveHierarchy;
        int iHashCode107 = (iHashCode106 + (bLiveUserLevel != null ? bLiveUserLevel.hashCode() : 0)) * 41;
        List<BLiveDownChestRewardInfo> list72 = this.chestRewardInfo;
        int iHashCode108 = (iHashCode107 + (list72 != null ? list72.hashCode() : 0)) * 41;
        List<BLiveSignInDetail> list73 = this.signInDetails;
        int iHashCode109 = (iHashCode108 + (list73 != null ? list73.hashCode() : 0)) * 41;
        List<BLiveSignPrizes> list74 = this.signInPrizes;
        int iHashCode110 = (iHashCode109 + (list74 != null ? list74.hashCode() : 0)) * 41;
        BLiveBeautyFilterConfig bLiveBeautyFilterConfig = this.liveBeautyConfig;
        int iHashCode111 = (iHashCode110 + (bLiveBeautyFilterConfig != null ? bLiveBeautyFilterConfig.hashCode() : 0)) * 41;
        List<BLiveVoiceUserFeedInfos> list75 = this.voiceUserFeedInfos;
        int iHashCode112 = (iHashCode111 + (list75 != null ? list75.hashCode() : 0)) * 41;
        BLiveHierarchyProgress bLiveHierarchyProgress = this.userLiveHierarchyProgress;
        int iHashCode113 = (iHashCode112 + (bLiveHierarchyProgress != null ? bLiveHierarchyProgress.hashCode() : 0)) * 41;
        List<BLiveTeenagerLive> list76 = this.teenagerLives;
        int iHashCode114 = (iHashCode113 + (list76 != null ? list76.hashCode() : 0)) * 41;
        String str = this.gameInfoResponse;
        int iHashCode115 = (iHashCode114 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveSignInAchievementMedals> list77 = this.signInAchievementMedals;
        int iHashCode116 = (iHashCode115 + (list77 != null ? list77.hashCode() : 0)) * 41;
        List<BLiveGuardAnchorRankInfo> list78 = this.guardAnchorRankInfos;
        int iHashCode117 = (iHashCode116 + (list78 != null ? list78.hashCode() : 0)) * 41;
        List<BLiveGuardboardRecord> list79 = this.guardRecords;
        int iHashCode118 = (iHashCode117 + (list79 != null ? list79.hashCode() : 0)) * 41;
        List<BLiveDailyTasks> list80 = this.userDailyTasks;
        int iHashCode119 = (iHashCode118 + (list80 != null ? list80.hashCode() : 0)) * 41;
        List<BLiveDailyTasks> list81 = this.anchorDailyTasks;
        int iHashCode120 = (iHashCode119 + (list81 != null ? list81.hashCode() : 0)) * 41;
        BLiveStormDanmaku bLiveStormDanmaku = this.stormComment;
        int iHashCode121 = (iHashCode120 + (bLiveStormDanmaku != null ? bLiveStormDanmaku.hashCode() : 0)) * 41;
        BLiveResourceCDN bLiveResourceCDN = this.liveResourcesCDN;
        int iHashCode122 = (iHashCode121 + (bLiveResourceCDN != null ? bLiveResourceCDN.hashCode() : 0)) * 41;
        BLiveVoiceLiveAssert bLiveVoiceLiveAssert = this.voiceLiveAssert;
        int iHashCode123 = (iHashCode122 + (bLiveVoiceLiveAssert != null ? bLiveVoiceLiveAssert.hashCode() : 0)) * 41;
        BLiveFirstRechargeStatus bLiveFirstRechargeStatus = this.firstRechargeStatus;
        int iHashCode124 = (iHashCode123 + (bLiveFirstRechargeStatus != null ? bLiveFirstRechargeStatus.hashCode() : 0)) * 41;
        BLiveFirstRechargeDetail bLiveFirstRechargeDetail = this.firstRechargeDetail;
        int iHashCode125 = (iHashCode124 + (bLiveFirstRechargeDetail != null ? bLiveFirstRechargeDetail.hashCode() : 0)) * 41;
        List<BLiveVoiceTab> list82 = this.voiceTabs;
        int iHashCode126 = (iHashCode125 + (list82 != null ? list82.hashCode() : 0)) * 41;
        List<BLiveVoiceShareItems> list83 = this.shareItems;
        int iHashCode127 = (iHashCode126 + (list83 != null ? list83.hashCode() : 0)) * 41;
        List<BLiveVoiceRoomFeed> list84 = this.voiceRoomFeeds;
        int iHashCode128 = (iHashCode127 + (list84 != null ? list84.hashCode() : 0)) * 41;
        List<BLiveGiftSkin> list85 = this.skins;
        int iHashCode129 = (iHashCode128 + (list85 != null ? list85.hashCode() : 0)) * 41;
        BLiveVoiceChatGroup bLiveVoiceChatGroup = this.voiceChatGroup;
        int iHashCode130 = (iHashCode129 + (bLiveVoiceChatGroup != null ? bLiveVoiceChatGroup.hashCode() : 0)) * 41;
        List<BLiveVoiceChatGroupApply> list86 = this.voiceChatGroupApplies;
        int iHashCode131 = (iHashCode130 + (list86 != null ? list86.hashCode() : 0)) * 41;
        List<BLiveVoiceManagerInvite> list87 = this.voiceManagerInvites;
        int iHashCode132 = (iHashCode131 + (list87 != null ? list87.hashCode() : 0)) * 41;
        List<BLiveVoiceManager> list88 = this.voiceManagers;
        int iHashCode133 = (iHashCode132 + (list88 != null ? list88.hashCode() : 0)) * 41;
        List<BLiveMultiCall> list89 = this.multiCalls;
        int iHashCode134 = (iHashCode133 + (list89 != null ? list89.hashCode() : 0)) * 41;
        BLiveMultiCallAsset bLiveMultiCallAsset = this.multiCallAsset;
        int iHashCode135 = (iHashCode134 + (bLiveMultiCallAsset != null ? bLiveMultiCallAsset.hashCode() : 0)) * 41;
        List<BLiveMultiCallInvite> list90 = this.multiCallInvites;
        int iHashCode136 = (iHashCode135 + (list90 != null ? list90.hashCode() : 0)) * 41;
        BLiveMultiCallSummary bLiveMultiCallSummary = this.multiCallSummary;
        int iHashCode137 = (iHashCode136 + (bLiveMultiCallSummary != null ? bLiveMultiCallSummary.hashCode() : 0)) * 41;
        List<ActivitySuggests> list91 = this.activitySuggests;
        int iHashCode138 = (iHashCode137 + (list91 != null ? list91.hashCode() : 0)) * 41;
        BFansBaseRecall bFansBaseRecall = this.fanbaseRecall;
        int iHashCode139 = (iHashCode138 + (bFansBaseRecall != null ? bFansBaseRecall.hashCode() : 0)) * 41;
        List<BLiveVoiceEndSparkRanking> list92 = this.accompanyUserRanking;
        int iHashCode140 = (iHashCode139 + (list92 != null ? list92.hashCode() : 0)) * 41;
        BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress = this.sparkletProgress;
        int iHashCode141 = (iHashCode140 + (bLiveVoiceEndSparkProgress != null ? bLiveVoiceEndSparkProgress.hashCode() : 0)) * 41;
        List<BLiveAnchors> list93 = this.liveAnchors;
        int iHashCode142 = (iHashCode141 + (list93 != null ? list93.hashCode() : 0)) * 41;
        List<BLiveSuggestLive> list94 = this.suggestedLives;
        int iHashCode143 = (iHashCode142 + (list94 != null ? list94.hashCode() : 0)) * 41;
        List<LiveMultiCallLiveSchema> list95 = this.liveSchemas;
        int iHashCode144 = (iHashCode143 + (list95 != null ? list95.hashCode() : 0)) * 41;
        BLivePush bLivePush = this.userLivePush;
        int iHashCode145 = (iHashCode144 + (bLivePush != null ? bLivePush.hashCode() : 0)) * 41;
        BLiveTouchMeDetail bLiveTouchMeDetail = this.touchMeDetail;
        int iHashCode146 = (iHashCode145 + (bLiveTouchMeDetail != null ? bLiveTouchMeDetail.hashCode() : 0)) * 41;
        BLiveMultiCallSwitchToLeadRoleInvite bLiveMultiCallSwitchToLeadRoleInvite = this.multiCallSwitchToLeadRoleInvite;
        int iHashCode147 = (iHashCode146 + (bLiveMultiCallSwitchToLeadRoleInvite != null ? bLiveMultiCallSwitchToLeadRoleInvite.hashCode() : 0)) * 41;
        List<BLiveMultiCallExtend> list96 = this.multiCallExtends;
        int iHashCode148 = (iHashCode147 + (list96 != null ? list96.hashCode() : 0)) * 41;
        BLiveCommonViewConfig bLiveCommonViewConfig2 = this.scoreSummary;
        int iHashCode149 = (iHashCode148 + (bLiveCommonViewConfig2 != null ? bLiveCommonViewConfig2.hashCode() : 0)) * 41;
        BLiveTopChatMessage bLiveTopChatMessage = this.liveTopChatMessage;
        int iHashCode150 = (((iHashCode149 + (bLiveTopChatMessage != null ? bLiveTopChatMessage.hashCode() : 0)) * 41) + (this.needTitle ? 1231 : 1237)) * 41;
        List<BLiveEntranceSummary> list97 = this.squareEntranceSummary;
        int iHashCode151 = (iHashCode150 + (list97 != null ? list97.hashCode() : 0)) * 41;
        List<BLiveMemberActivityData> list98 = this.memberActivityList;
        int iHashCode152 = (iHashCode151 + (list98 != null ? list98.hashCode() : 0)) * 41;
        BLiveVoiceLiveActivityMoment bLiveVoiceLiveActivityMoment = this.voiceLiveActivityMoment;
        int iHashCode153 = (iHashCode152 + (bLiveVoiceLiveActivityMoment != null ? bLiveVoiceLiveActivityMoment.hashCode() : 0)) * 41;
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = this.roomAnnouncement;
        int iHashCode154 = (iHashCode153 + (bLiveMultiCallAnnouncement != null ? bLiveMultiCallAnnouncement.hashCode() : 0)) * 41;
        BLiveVoiceUserHeartbeatRewardList bLiveVoiceUserHeartbeatRewardList = this.voiceLiveUserHeartbeatRewardList;
        int iHashCode155 = (iHashCode154 + (bLiveVoiceUserHeartbeatRewardList != null ? bLiveVoiceUserHeartbeatRewardList.hashCode() : 0)) * 41;
        BLiveVoiceHeartBeat bLiveVoiceHeartBeat = this.voiceLiveHeartBeat;
        int iHashCode156 = (iHashCode155 + (bLiveVoiceHeartBeat != null ? bLiveVoiceHeartBeat.hashCode() : 0)) * 41;
        List<BLiveStickerTemplatesGiftItem> list99 = this.liveStickerTemplatesGifts;
        int iHashCode157 = (iHashCode156 + (list99 != null ? list99.hashCode() : 0)) * 41;
        BLiveVoicePopTotal bLiveVoicePopTotal = this.voiceLivePopsTotal;
        int iHashCode158 = (iHashCode157 + (bLiveVoicePopTotal != null ? bLiveVoicePopTotal.hashCode() : 0)) * 41;
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = this.grabHatGame;
        int iHashCode159 = (iHashCode158 + (bLiveVoiceGrabHatGame != null ? bLiveVoiceGrabHatGame.hashCode() : 0)) * 41;
        List<BLiveVoiceGrabHatCP> list100 = this.grabHatCps;
        int iHashCode160 = (iHashCode159 + (list100 != null ? list100.hashCode() : 0)) * 41;
        List<BLiveVoiceAuction> list101 = this.voiceLiveAuctions;
        int iHashCode161 = (iHashCode160 + (list101 != null ? list101.hashCode() : 0)) * 41;
        List<BLiveVoiceSweetCpRecommendUser> list102 = this.cpRecommendUserList;
        int iHashCode162 = (iHashCode161 + (list102 != null ? list102.hashCode() : 0)) * 41;
        BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards = this.voiceCpLeaderBoards;
        int iHashCode163 = (iHashCode162 + (bLiveVoiceCpLeaderBoards != null ? bLiveVoiceCpLeaderBoards.hashCode() : 0)) * 41;
        BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos = this.voiceCpHouseTaskInfos;
        int iHashCode164 = (iHashCode163 + (bLiveVoiceCpHouseTaskInfos != null ? bLiveVoiceCpHouseTaskInfos.hashCode() : 0)) * 41;
        BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo = this.voiceCpHouseInfo;
        int iHashCode165 = (iHashCode164 + (bLiveVoiceCpHouseRankAwardInfo != null ? bLiveVoiceCpHouseRankAwardInfo.hashCode() : 0)) * 41;
        List<BLiveVoiceCpHouseInfo> list103 = this.voiceCpHouseList;
        int iHashCode166 = (iHashCode165 + (list103 != null ? list103.hashCode() : 0)) * 41;
        BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo = this.voiceHouseRankUpgradeInfo;
        int iHashCode167 = (iHashCode166 + (bLiveVoiceHouseRankUpgradeInfo != null ? bLiveVoiceHouseRankUpgradeInfo.hashCode() : 0)) * 41;
        BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = this.backGroundPicSetting;
        int iHashCode168 = (iHashCode167 + (bLiveVoiceBackGroundPicSetting != null ? bLiveVoiceBackGroundPicSetting.hashCode() : 0)) * 41;
        BLiveDailyPayment bLiveDailyPayment = this.dailyPayment;
        int iHashCode169 = (iHashCode168 + (bLiveDailyPayment != null ? bLiveDailyPayment.hashCode() : 0)) * 41;
        List<BLiveVoiceCampaign> list104 = this.intlVoiceLiveCampaigns;
        int iHashCode170 = (iHashCode169 + (list104 != null ? list104.hashCode() : 0)) * 41;
        List<BLiveComplexCard> list105 = this.complexCardList;
        int iHashCode171 = (iHashCode170 + (list105 != null ? list105.hashCode() : 0)) * 41;
        List<BLiveVoiceGiftWallBookInfo> list106 = this.voiceGiftWallList;
        int iHashCode172 = (iHashCode171 + (list106 != null ? list106.hashCode() : 0)) * 41;
        BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief = this.voiceGiftWallBriefInfo;
        int iHashCode173 = (iHashCode172 + (bLiveVoiceGiftWallBrief != null ? bLiveVoiceGiftWallBrief.hashCode() : 0)) * 41;
        BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo = this.voiceGiftWallBookDetail;
        int iHashCode174 = (iHashCode173 + (bLiveVoiceGiftWallBookInfo != null ? bLiveVoiceGiftWallBookInfo.hashCode() : 0)) * 41;
        List<BLiveVoiceFollowship> list107 = this.voiceFollowships;
        int iHashCode175 = (iHashCode174 + (list107 != null ? list107.hashCode() : 0)) * 41;
        List<BLiveVoiceUserGiftItem> list108 = this.voiceUserGiftItems;
        int iHashCode176 = (iHashCode175 + (list108 != null ? list108.hashCode() : 0)) * 41;
        BLiveHeaddressCoinMarket bLiveHeaddressCoinMarket = this.flameCoinMarket;
        int iHashCode177 = (iHashCode176 + (bLiveHeaddressCoinMarket != null ? bLiveHeaddressCoinMarket.hashCode() : 0)) * 41;
        List<BLiveVirtualVoiceCard> list109 = this.virtualVoiceCard;
        int iHashCode178 = (iHashCode177 + (list109 != null ? list109.hashCode() : 0)) * 41;
        BLiveChatRealMsgLiveInfo bLiveChatRealMsgLiveInfo = this.chatMsgLiveInfo;
        int iHashCode179 = (iHashCode178 + (bLiveChatRealMsgLiveInfo != null ? bLiveChatRealMsgLiveInfo.hashCode() : 0)) * 41;
        BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = this.voiceKTVGame;
        int iHashCode180 = (iHashCode179 + (bLiveVoiceKtvGameInfo != null ? bLiveVoiceKtvGameInfo.hashCode() : 0)) * 41;
        List<BLiveVoiceKTVSong> list110 = this.voiceKTVSongs;
        int iHashCode181 = (iHashCode180 + (list110 != null ? list110.hashCode() : 0)) * 41;
        List<BLiveVoiceKTVOrder> list111 = this.voiceKTVOrders;
        int iHashCode182 = (iHashCode181 + (list111 != null ? list111.hashCode() : 0)) * 41;
        BLiveComplexCardFourConfig bLiveComplexCardFourConfig = this.complexCardConfig;
        int iHashCode183 = (iHashCode182 + (bLiveComplexCardFourConfig != null ? bLiveComplexCardFourConfig.hashCode() : 0)) * 41;
        List<BLiveIntlVoiceMedal> list112 = this.familyMedals;
        int iHashCode184 = (iHashCode183 + (list112 != null ? list112.hashCode() : 0)) * 41;
        String str2 = this.schema;
        int iHashCode185 = (iHashCode184 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<VirtualVoiceGroupConversationCell> list113 = this.cells;
        int iHashCode186 = (iHashCode185 + (list113 != null ? list113.hashCode() : 0)) * 41;
        List<BLiveVoiceSettle> list114 = this.voiceSettles;
        int iHashCode187 = (iHashCode186 + (list114 != null ? list114.hashCode() : 0)) * 41;
        BLiveVoiceLivePush bLiveVoiceLivePush = this.voiceLivePush;
        int iHashCode188 = (iHashCode187 + (bLiveVoiceLivePush != null ? bLiveVoiceLivePush.hashCode() : 0)) * 41;
        BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter = this.voiceAdminPanelCounter;
        int iHashCode189 = (iHashCode188 + (bLiveVoiceAdminPanelCounter != null ? bLiveVoiceAdminPanelCounter.hashCode() : 0)) * 41;
        BLiveVoiceUserMessageRemind bLiveVoiceUserMessageRemind = this.voiceUserMessageRemind;
        int iHashCode190 = (iHashCode189 + (bLiveVoiceUserMessageRemind != null ? bLiveVoiceUserMessageRemind.hashCode() : 0)) * 41;
        BLiveVoiceShareUrlConfig bLiveVoiceShareUrlConfig = this.shareRoomConfig;
        int iHashCode191 = (iHashCode190 + (bLiveVoiceShareUrlConfig != null ? bLiveVoiceShareUrlConfig.hashCode() : 0)) * 41;
        BLiveNiceNumberDetail bLiveNiceNumberDetail = this.nobleNiceNumberDetail;
        int iHashCode192 = (iHashCode191 + (bLiveNiceNumberDetail != null ? bLiveNiceNumberDetail.hashCode() : 0)) * 41;
        BLiveNiceNumberList bLiveNiceNumberList = this.nobleNiceNumberList;
        int iHashCode193 = (iHashCode192 + (bLiveNiceNumberList != null ? bLiveNiceNumberList.hashCode() : 0)) * 41;
        List<BLiveHeatVoiceRoomTask> list115 = this.heatVoiceRoomTasks;
        int iHashCode194 = (iHashCode193 + (list115 != null ? list115.hashCode() : 0)) * 41;
        BLiveRoomInProfile bLiveRoomInProfile = this.liveRoomInProfile;
        int iHashCode195 = (iHashCode194 + (bLiveRoomInProfile != null ? bLiveRoomInProfile.hashCode() : 0)) * 41;
        BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile = this.voiceRoomInProfile;
        int iHashCode196 = (iHashCode195 + (bLiveVoiceRoomInProfile != null ? bLiveVoiceRoomInProfile.hashCode() : 0)) * 41;
        BLiveVoiceGiftWall bLiveVoiceGiftWall = this.voiceGiftWall;
        int iHashCode197 = (iHashCode196 + (bLiveVoiceGiftWall != null ? bLiveVoiceGiftWall.hashCode() : 0)) * 41;
        BLiveVoiceMedalWallIList bLiveVoiceMedalWallIList = this.voiceMedalWall;
        int iHashCode198 = (iHashCode197 + (bLiveVoiceMedalWallIList != null ? bLiveVoiceMedalWallIList.hashCode() : 0)) * 41;
        BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard = this.voiceWeekLeaderboards;
        int iHashCode199 = (iHashCode198 + (bLiveVoiceHourLeaderBoard != null ? bLiveVoiceHourLeaderBoard.hashCode() : 0)) * 41;
        BLiveVoiceRoomLevelDetail bLiveVoiceRoomLevelDetail = this.voiceRoomLevelDetail;
        int iHashCode200 = (iHashCode199 + (bLiveVoiceRoomLevelDetail != null ? bLiveVoiceRoomLevelDetail.hashCode() : 0)) * 41;
        BLiveVoiceVirtualRoomSummary bLiveVoiceVirtualRoomSummary = this.voiceRoomSummary;
        int iHashCode201 = (iHashCode200 + (bLiveVoiceVirtualRoomSummary != null ? bLiveVoiceVirtualRoomSummary.hashCode() : 0)) * 41;
        List<BLiveVoiceStarRedPacket> list116 = this.starRedPackets;
        int iHashCode202 = (iHashCode201 + (list116 != null ? list116.hashCode() : 0)) * 41;
        BLiveSideBarConfig bLiveSideBarConfig = this.showSideBarConfig;
        int iHashCode203 = (iHashCode202 + (bLiveSideBarConfig != null ? bLiveSideBarConfig.hashCode() : 0)) * 41;
        List<BLiveVoiceFeedBanners> list117 = this.voiceLiveBanners;
        int iHashCode204 = (iHashCode203 + (list117 != null ? list117.hashCode() : 0)) * 41;
        BLiveMultiPkDetail bLiveMultiPkDetail = this.multiPk;
        int iHashCode205 = (iHashCode204 + (bLiveMultiPkDetail != null ? bLiveMultiPkDetail.hashCode() : 0)) * 41;
        BLiveMultiPkPanel bLiveMultiPkPanel = this.multiPkPanel;
        int iHashCode206 = (iHashCode205 + (bLiveMultiPkPanel != null ? bLiveMultiPkPanel.hashCode() : 0)) * 41;
        BLiveMultiPkAsset bLiveMultiPkAsset = this.multiPkAsset;
        int iHashCode207 = (iHashCode206 + (bLiveMultiPkAsset != null ? bLiveMultiPkAsset.hashCode() : 0)) * 41;
        BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard = this.multiPkLeaderboard;
        int iHashCode208 = (iHashCode207 + (bLiveMultiPkLeaderboard != null ? bLiveMultiPkLeaderboard.hashCode() : 0)) * 41;
        List<BLiveVoiceRoomClass> list118 = this.voiceRoomClasses;
        int iHashCode209 = (iHashCode208 + (list118 != null ? list118.hashCode() : 0)) * 41;
        BLiveVoiceChatTopicAsset bLiveVoiceChatTopicAsset = this.chatTopicAsset;
        int iHashCode210 = (iHashCode209 + (bLiveVoiceChatTopicAsset != null ? bLiveVoiceChatTopicAsset.hashCode() : 0)) * 41;
        BLiveVoiceChatTopic bLiveVoiceChatTopic = this.chatTopic;
        int iHashCode211 = (iHashCode210 + (bLiveVoiceChatTopic != null ? bLiveVoiceChatTopic.hashCode() : 0)) * 41;
        List<BLiveVoiceMutexMode> list119 = this.mutexMode;
        int iHashCode212 = (iHashCode211 + (list119 != null ? list119.hashCode() : 0)) * 41;
        BLiveVoiceModelDescribe bLiveVoiceModelDescribe = this.modelDescribe;
        int iHashCode213 = (iHashCode212 + (bLiveVoiceModelDescribe != null ? bLiveVoiceModelDescribe.hashCode() : 0)) * 41;
        BLiveLiveMedalCDN bLiveLiveMedalCDN = this.liveMedalCDN;
        int iHashCode214 = (iHashCode213 + (bLiveLiveMedalCDN != null ? bLiveLiveMedalCDN.hashCode() : 0)) * 41;
        List<BLiveVoiceLiveUserFeedList> list120 = this.voiceLiveUserFeedList;
        int iHashCode215 = (iHashCode214 + (list120 != null ? list120.hashCode() : 0)) * 41;
        BLiveVoiceUserRealVoiceLive bLiveVoiceUserRealVoiceLive = this.userRealVoiceLive;
        int iHashCode216 = (iHashCode215 + (bLiveVoiceUserRealVoiceLive != null ? bLiveVoiceUserRealVoiceLive.hashCode() : 0)) * 41;
        BLiveUserLeaderboard bLiveUserLeaderboard = this.userLeaderboard;
        int iHashCode217 = (iHashCode216 + (bLiveUserLeaderboard != null ? bLiveUserLeaderboard.hashCode() : 0)) * 41;
        BLiveAnchorLeaderboard bLiveAnchorLeaderboard = this.anchorLeaderboard;
        int iHashCode218 = (iHashCode217 + (bLiveAnchorLeaderboard != null ? bLiveAnchorLeaderboard.hashCode() : 0)) * 41;
        BLiveUserLeaderboard bLiveUserLeaderboard2 = this.userWeekLeaderboard;
        int iHashCode219 = (iHashCode218 + (bLiveUserLeaderboard2 != null ? bLiveUserLeaderboard2.hashCode() : 0)) * 41;
        BLiveWeekCpInfo bLiveWeekCpInfo = this.weekCpInfo;
        int iHashCode220 = (iHashCode219 + (bLiveWeekCpInfo != null ? bLiveWeekCpInfo.hashCode() : 0)) * 41;
        List<BLiveAuctionQueueInfo> list121 = this.auctionCandidates;
        int iHashCode221 = (iHashCode220 + (list121 != null ? list121.hashCode() : 0)) * 41;
        List<BLiveAuctionQueueInfo> list122 = this.auctionApplies;
        int iHashCode222 = (iHashCode221 + (list122 != null ? list122.hashCode() : 0)) * 41;
        List<BLiveAuctionQueueInfo> list123 = this.auctionInvites;
        int iHashCode223 = (iHashCode222 + (list123 != null ? list123.hashCode() : 0)) * 41;
        BLiveAuctionAsset bLiveAuctionAsset = this.voiceLiveAuctionAsset;
        int iHashCode224 = (iHashCode223 + (bLiveAuctionAsset != null ? bLiveAuctionAsset.hashCode() : 0)) * 41;
        List<BLiveAuctionRelationCard> list124 = this.auctionRelationCards;
        int iHashCode225 = (iHashCode224 + (list124 != null ? list124.hashCode() : 0)) * 41;
        List<BLiveSuggestLive> list125 = this.bigTVLives;
        int iHashCode226 = (iHashCode225 + (list125 != null ? list125.hashCode() : 0)) * 41;
        BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard = this.giftLeaderboard;
        int iHashCode227 = (iHashCode226 + (bLiveIntlGiftLeaderboard != null ? bLiveIntlGiftLeaderboard.hashCode() : 0)) * 41;
        List<BLiveClarity> list126 = this.liveClarityLevelInfos;
        int iHashCode228 = (iHashCode227 + (list126 != null ? list126.hashCode() : 0)) * 41;
        BLiveVoiceUserLeaderBoard bLiveVoiceUserLeaderBoard = this.voiceUserLeaderboards;
        int iHashCode229 = (iHashCode228 + (bLiveVoiceUserLeaderBoard != null ? bLiveVoiceUserLeaderBoard.hashCode() : 0)) * 41;
        List<BLivePkSuggestAnchors> list127 = this.pkSuggestedAnchors;
        int iHashCode230 = (iHashCode229 + (list127 != null ? list127.hashCode() : 0)) * 41;
        BLiveQuitPopup bLiveQuitPopup = this.liveQuitPopup;
        int iHashCode231 = (((iHashCode230 + (bLiveQuitPopup != null ? bLiveQuitPopup.hashCode() : 0)) * 41) + (this.exchangeTTCRedpoint ? 1231 : 1237)) * 41;
        BLiveVoiceRoomAsset bLiveVoiceRoomAsset = this.voiceRoomAsset;
        int iHashCode232 = (iHashCode231 + (bLiveVoiceRoomAsset != null ? bLiveVoiceRoomAsset.hashCode() : 0)) * 41;
        BLiveIntlFamilyInfo bLiveIntlFamilyInfo = this.family;
        int iHashCode233 = (iHashCode232 + (bLiveIntlFamilyInfo != null ? bLiveIntlFamilyInfo.hashCode() : 0)) * 41;
        BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo = this.familyShareInfo;
        int iHashCode234 = (iHashCode233 + (bLiveIntlFamilyShareInfo != null ? bLiveIntlFamilyShareInfo.hashCode() : 0)) * 41;
        BLiveIntlPushSwitch bLiveIntlPushSwitch = this.userPushSwitch;
        int iHashCode235 = (iHashCode234 + (bLiveIntlPushSwitch != null ? bLiveIntlPushSwitch.hashCode() : 0)) * 41;
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = this.officialShowCurrentAnchorInfo;
        int iHashCode236 = (iHashCode235 + (bLiveOfficialShowCurrentAnchorInfo != null ? bLiveOfficialShowCurrentAnchorInfo.hashCode() : 0)) * 41;
        List<BLiveOfficialShowListItem> list128 = this.officialShowList;
        int iHashCode237 = (iHashCode236 + (list128 != null ? list128.hashCode() : 0)) * 41;
        BLiveOfficialShowUser bLiveOfficialShowUser = this.officialShowUser;
        int iHashCode238 = (iHashCode237 + (bLiveOfficialShowUser != null ? bLiveOfficialShowUser.hashCode() : 0)) * 41;
        BLiveDragonScourgeDisplayChatMessage bLiveDragonScourgeDisplayChatMessage = this.dragonScourgeDisplayChatMessage;
        int iHashCode239 = (iHashCode238 + (bLiveDragonScourgeDisplayChatMessage != null ? bLiveDragonScourgeDisplayChatMessage.hashCode() : 0)) * 41;
        List<BLiveUserDressUp> list129 = this.rights;
        int iHashCode240 = (iHashCode239 + (list129 != null ? list129.hashCode() : 0)) * 41;
        BLiveAuctionPlatformLeaderboardInfo bLiveAuctionPlatformLeaderboardInfo = this.auctionPlatformLeaderboardInfo;
        int iHashCode241 = (iHashCode240 + (bLiveAuctionPlatformLeaderboardInfo != null ? bLiveAuctionPlatformLeaderboardInfo.hashCode() : 0)) * 41;
        BLiveAuctionCounter bLiveAuctionCounter = this.auctionCounter;
        int iHashCode242 = (iHashCode241 + (bLiveAuctionCounter != null ? bLiveAuctionCounter.hashCode() : 0)) * 41;
        BLiveTabGiftExpiration bLiveTabGiftExpiration = this.bagpackItem;
        int iHashCode243 = (iHashCode242 + (bLiveTabGiftExpiration != null ? bLiveTabGiftExpiration.hashCode() : 0)) * 41;
        List<BLiveGiftDetail> list130 = this.giftDetails;
        int iHashCode244 = (iHashCode243 + (list130 != null ? list130.hashCode() : 0)) * 41;
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance = this.luckyParadiseBottomEntrance;
        int iHashCode245 = (iHashCode244 + (bLiveLuckyParadiseBottomEntrance != null ? bLiveLuckyParadiseBottomEntrance.hashCode() : 0)) * 41;
        BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN = this.intlLiveFramesMetadata;
        int iHashCode246 = (iHashCode245 + (bLiveIntlLiveFramesCDN != null ? bLiveIntlLiveFramesCDN.hashCode() : 0)) * 41;
        List<BLiveIntlMlnMedia> list131 = this.media;
        int iHashCode247 = (iHashCode246 + (list131 != null ? list131.hashCode() : 0)) * 41;
        BLiveLovePlanet bLiveLovePlanet = this.lovePlanet;
        int iHashCode248 = (iHashCode247 + (bLiveLovePlanet != null ? bLiveLovePlanet.hashCode() : 0)) * 41;
        List<BLiveVoiceBackGroundPics> list132 = this.storeBackgroundPics;
        int iHashCode249 = (iHashCode248 + (list132 != null ? list132.hashCode() : 0)) * 41;
        BLivePopUp bLivePopUp = this.livePopUpGuild;
        int iHashCode250 = (iHashCode249 + (bLivePopUp != null ? bLivePopUp.hashCode() : 0)) * 41;
        BLivePopUp bLivePopUp2 = this.voiceLivePopUpGuild;
        int iHashCode251 = (iHashCode250 + (bLivePopUp2 != null ? bLivePopUp2.hashCode() : 0)) * 41;
        BLiveNewGiftSkinListData bLiveNewGiftSkinListData = this.giftSkinPanel;
        int iHashCode252 = (iHashCode251 + (bLiveNewGiftSkinListData != null ? bLiveNewGiftSkinListData.hashCode() : 0)) * 41;
        List<BLiveVoiceEmojiMenu> list133 = this.emojiPlayMenu;
        int iHashCode253 = (iHashCode252 + (list133 != null ? list133.hashCode() : 0)) * 41;
        BLiveVoicePayGuideUser bLiveVoicePayGuideUser = this.voicePayGuideUser;
        int iHashCode254 = (iHashCode253 + (bLiveVoicePayGuideUser != null ? bLiveVoicePayGuideUser.hashCode() : 0)) * 41;
        BLiveGuildAnchorCheck bLiveGuildAnchorCheck = this.anchorGuildCheck;
        int iHashCode255 = (iHashCode254 + (bLiveGuildAnchorCheck != null ? bLiveGuildAnchorCheck.hashCode() : 0)) * 41;
        List<BLiveVoiceSweetCpInviteRecord> list134 = this.cpInviteRecords;
        int iHashCode256 = (iHashCode255 + (list134 != null ? list134.hashCode() : 0)) * 41;
        SiteWideBroadcastFinder siteWideBroadcastFinder = this.siteWideBroadcastFinder;
        int iHashCode257 = (iHashCode256 + (siteWideBroadcastFinder != null ? siteWideBroadcastFinder.hashCode() : 0)) * 41;
        List<BLiveGameOperationConfig> list135 = this.gameOperationPositions;
        int iHashCode258 = (iHashCode257 + (list135 != null ? list135.hashCode() : 0)) * 41;
        BLiveVideoChatLive bLiveVideoChatLive = this.videoChatLive;
        int iHashCode259 = (iHashCode258 + (bLiveVideoChatLive != null ? bLiveVideoChatLive.hashCode() : 0)) * 41;
        BLiveVideoChat bLiveVideoChat = this.videoChat;
        int iHashCode260 = (iHashCode259 + (bLiveVideoChat != null ? bLiveVideoChat.hashCode() : 0)) * 41;
        BLiveVideoChatSummary bLiveVideoChatSummary = this.videoChatSummary;
        int iHashCode261 = (((iHashCode260 + (bLiveVideoChatSummary != null ? bLiveVideoChatSummary.hashCode() : 0)) * 41) + (this.isAnchor ? 1231 : 1237)) * 41;
        BLiveSuperGodDetail bLiveSuperGodDetail = this.superUserBirthdayDetail;
        int iHashCode262 = (iHashCode261 + (bLiveSuperGodDetail != null ? bLiveSuperGodDetail.hashCode() : 0)) * 41;
        List<BLiveVideoChatMissedCall> list136 = this.missedCalls;
        int iHashCode263 = (((iHashCode262 + (list136 != null ? list136.hashCode() : 0)) * 41) + this.missedCallCount) * 41;
        BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall = this.anchorCall;
        int iHashCode264 = (iHashCode263 + (bLiveVideoChatAnchorCall != null ? bLiveVideoChatAnchorCall.hashCode() : 0)) * 41;
        BLiveVideoChatAssets bLiveVideoChatAssets = this.videoChatAssets;
        int iHashCode265 = (iHashCode264 + (bLiveVideoChatAssets != null ? bLiveVideoChatAssets.hashCode() : 0)) * 41;
        BLiveVideoChatSquareSummary bLiveVideoChatSquareSummary = this.videoChatSquareSummary;
        int iHashCode266 = (iHashCode265 + (bLiveVideoChatSquareSummary != null ? bLiveVideoChatSquareSummary.hashCode() : 0)) * 41;
        BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo = this.videoChatAttendeeCallInfo;
        int iHashCode267 = (iHashCode266 + (bLiveVideoChatAttendeeCallInfo != null ? bLiveVideoChatAttendeeCallInfo.hashCode() : 0)) * 41;
        BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail = this.randomMatchCouponDetail;
        int iHashCode268 = (iHashCode267 + (bLiveRandomMatchCouponDetail != null ? bLiveRandomMatchCouponDetail.hashCode() : 0)) * 41;
        BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch = this.videoChatRandomMatch;
        int iHashCode269 = (iHashCode268 + (bLiveVideoChatRandomMatch != null ? bLiveVideoChatRandomMatch.hashCode() : 0)) * 41;
        String str3 = this.code;
        int iHashCode270 = (iHashCode269 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveUserCompliance bLiveUserCompliance = this.userCompliance;
        int iHashCode271 = (iHashCode270 + (bLiveUserCompliance != null ? bLiveUserCompliance.hashCode() : 0)) * 41;
        BLiveIntlGamePanelMenus bLiveIntlGamePanelMenus = this.gamePanelMenus;
        int iHashCode272 = (iHashCode271 + (bLiveIntlGamePanelMenus != null ? bLiveIntlGamePanelMenus.hashCode() : 0)) * 41;
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance2 = this.funFairBottomEntrance;
        int iHashCode273 = (iHashCode272 + (bLiveLuckyParadiseBottomEntrance2 != null ? bLiveLuckyParadiseBottomEntrance2.hashCode() : 0)) * 41;
        List<BLiveVoiceSquareButton> list137 = this.voiceSquareButtons;
        int iHashCode274 = (iHashCode273 + (list137 != null ? list137.hashCode() : 0)) * 41;
        BLiveSuperChatDetail bLiveSuperChatDetail = this.superChatDetail;
        int iHashCode275 = (iHashCode274 + (bLiveSuperChatDetail != null ? bLiveSuperChatDetail.hashCode() : 0)) * 41;
        List<BLiveVoiceLeaderBoardEntranceItem> list138 = this.voiceLeaderboardEntrances;
        int iHashCode276 = (iHashCode275 + (list138 != null ? list138.hashCode() : 0)) * 41;
        List<BLiveVoiceSweetLimitHouse> list139 = this.skinList;
        int iHashCode277 = (iHashCode276 + (list139 != null ? list139.hashCode() : 0)) * 41;
        List<BLiveStarlightHierarchy> list140 = this.starlightHierarchies;
        int iHashCode278 = (iHashCode277 + (list140 != null ? list140.hashCode() : 0)) * 41;
        BLivePKCardShowList bLivePKCardShowList = this.pkItemCardsDetail;
        int iHashCode279 = (iHashCode278 + (bLivePKCardShowList != null ? bLivePKCardShowList.hashCode() : 0)) * 41;
        String str4 = this.octopusUrl;
        int iHashCode280 = (iHashCode279 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveIntlConfig bLiveIntlConfig = this.intlConfig;
        int iHashCode281 = (iHashCode280 + (bLiveIntlConfig != null ? bLiveIntlConfig.hashCode() : 0)) * 41;
        BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard = this.intlMedalWall;
        int iHashCode282 = (iHashCode281 + (bLiveIntlMedalWallInUserCard != null ? bLiveIntlMedalWallInUserCard.hashCode() : 0)) * 41;
        BLiveIntlMedalWall bLiveIntlMedalWall = this.medalWall;
        int iHashCode283 = (iHashCode282 + (bLiveIntlMedalWall != null ? bLiveIntlMedalWall.hashCode() : 0)) * 41;
        BLiveVoicePlayModeList bLiveVoicePlayModeList = this.gameAsset;
        int iHashCode284 = (iHashCode283 + (bLiveVoicePlayModeList != null ? bLiveVoicePlayModeList.hashCode() : 0)) * 41;
        BLiveVoiceGame bLiveVoiceGame = this.game;
        int iHashCode285 = (iHashCode284 + (bLiveVoiceGame != null ? bLiveVoiceGame.hashCode() : 0)) * 41;
        BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame = this.canJoinGame;
        int iHashCode286 = (iHashCode285 + (bLiveVoiceCanJoinGame != null ? bLiveVoiceCanJoinGame.hashCode() : 0)) * 41;
        BLiveFansMemberNum bLiveFansMemberNum = this.voiceFanbase;
        int iHashCode287 = (iHashCode286 + (bLiveFansMemberNum != null ? bLiveFansMemberNum.hashCode() : 0)) * 41;
        BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail = this.voiceFanbaseDetail;
        int iHashCode288 = (iHashCode287 + (bLiveVoiceFanBaseDetail != null ? bLiveVoiceFanBaseDetail.hashCode() : 0)) * 41;
        List<BLiveVoiceMemberLb> list141 = this.memberLbs;
        int iHashCode289 = (iHashCode288 + (list141 != null ? list141.hashCode() : 0)) * 41;
        List<BLiveVoicePlayModeAnchorItem> list142 = this.voiceFanbaseLbs;
        int iHashCode290 = (iHashCode289 + (list142 != null ? list142.hashCode() : 0)) * 41;
        List<BLiveVoiceFansMyJoin> list143 = this.myJoins;
        int iHashCode291 = (iHashCode290 + (list143 != null ? list143.hashCode() : 0)) * 41;
        List<BLiveIntlVoiceMedal> list144 = this.voiceFanbaseMedals;
        int iHashCode292 = (iHashCode291 + (list144 != null ? list144.hashCode() : 0)) * 41;
        BLiveVoiceHeatBoxEntrance bLiveVoiceHeatBoxEntrance = this.heatBoxEntrance;
        int iHashCode293 = (iHashCode292 + (bLiveVoiceHeatBoxEntrance != null ? bLiveVoiceHeatBoxEntrance.hashCode() : 0)) * 41;
        BLiveVoicePkInfo bLiveVoicePkInfo = this.voicePkInfo;
        int iHashCode294 = (iHashCode293 + (bLiveVoicePkInfo != null ? bLiveVoicePkInfo.hashCode() : 0)) * 41;
        BLiveBoardGuard bLiveBoardGuard = this.guard;
        int iHashCode295 = (iHashCode294 + (bLiveBoardGuard != null ? bLiveBoardGuard.hashCode() : 0)) * 41;
        BLiveBossCall bLiveBossCall = this.bossCall;
        int iHashCode296 = (iHashCode295 + (bLiveBossCall != null ? bLiveBossCall.hashCode() : 0)) * 41;
        BLiveBossGiftRecord bLiveBossGiftRecord = this.bossGiftRecord;
        int iHashCode297 = (iHashCode296 + (bLiveBossGiftRecord != null ? bLiveBossGiftRecord.hashCode() : 0)) * 41;
        List<BLiveUserCardGiftWall> list145 = this.giftWallV3Briefs;
        int iHashCode298 = (iHashCode297 + (list145 != null ? list145.hashCode() : 0)) * 41;
        List<BLiveDanmakuListItem> list146 = this.voiceLiveBulletCommentTypes;
        int iHashCode299 = (iHashCode298 + (list146 != null ? list146.hashCode() : 0)) * 41;
        BLiveDanmakuItem bLiveDanmakuItem2 = this.voiceLiveBulletComment;
        int iHashCode300 = iHashCode299 + (bLiveDanmakuItem2 != null ? bLiveDanmakuItem2.hashCode() : 0);
        this.hashCode = iHashCode300;
        return iHashCode300;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
        if (this.relationships == null) {
            this.relationships = new ArrayList();
        }
        if (this.verificationCenter == null) {
            this.verificationCenter = new ArrayList();
        }
        if (this.monetizationConfig == null) {
            this.monetizationConfig = BLiveMonetizationConfig.new_();
        }
        if (this.managers == null) {
            this.managers = new ArrayList();
        }
        if (this.giftItemCDN == null) {
            this.giftItemCDN = BLiveGiftItemCDN.new_();
        }
        if (this.liveRoomTabGifts == null) {
            this.liveRoomTabGifts = BLiveRoomTabGifts.new_();
        }
        if (this.followships == null) {
            this.followships = new ArrayList();
        }
        if (this.startLivePageCampaigns == null) {
            this.startLivePageCampaigns = new ArrayList();
        }
        if (this.calls == null) {
            this.calls = new ArrayList();
        }
        if (this.callInvites == null) {
            this.callInvites = new ArrayList();
        }
        if (this.rtcTokens == null) {
            this.rtcTokens = new ArrayList();
        }
        if (this.callSummaries == null) {
            this.callSummaries = new ArrayList();
        }
        if (this.hierarchies == null) {
            this.hierarchies = new ArrayList();
        }
        if (this.voiceCalls == null) {
            this.voiceCalls = new ArrayList();
        }
        if (this.voiceCallInvites == null) {
            this.voiceCallInvites = new ArrayList();
        }
        if (this.voiceCallSummaries == null) {
            this.voiceCallSummaries = new ArrayList();
        }
        if (this.voiceRooms == null) {
            this.voiceRooms = new ArrayList();
        }
        if (this.voiceLives == null) {
            this.voiceLives = new ArrayList();
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
        if (this.voiceLiveSummaries == null) {
            this.voiceLiveSummaries = new ArrayList();
        }
        if (this.voiceLivesSummary == null) {
            this.voiceLivesSummary = new ArrayList();
        }
        if (this.voiceRoomTagInfo == null) {
            this.voiceRoomTagInfo = BLiveVoiceRoomTagInfo.new_();
        }
        if (this.knightsInfosSummary == null) {
            this.knightsInfosSummary = new ArrayList();
        }
        if (this.userKnightInfosSummary == null) {
            this.userKnightInfosSummary = new ArrayList();
        }
        if (this.knightsRuleInfos == null) {
            this.knightsRuleInfos = new ArrayList();
        }
        if (this.anchorKnightInfos == null) {
            this.anchorKnightInfos = new ArrayList();
        }
        if (this.slotInfo == null) {
            this.slotInfo = BLiveUpgradeGiftInfo.new_();
        }
        if (this.equippedGift == null) {
            this.equippedGift = BLiveGiftItemShort.new_();
        }
        if (this.masks == null) {
            this.masks = new ArrayList();
        }
        if (this.voiceLiveGames == null) {
            this.voiceLiveGames = new ArrayList();
        }
        if (this.pkAssets == null) {
            this.pkAssets = BLivePkAssets.new_();
        }
        if (this.privacyPrivilege == null) {
            this.privacyPrivilege = new ArrayList();
        }
        if (this.fakeUser == null) {
            this.fakeUser = BLiveFakeUser.new_();
        }
        if (this.mysteryConfig == null) {
            this.mysteryConfig = BLiveHideAvatarEnterConfig.new_();
        }
        if (this.fakeUserProfiles == null) {
            this.fakeUserProfiles = new ArrayList();
        }
        if (this.pkSummaries == null) {
            this.pkSummaries = new ArrayList();
        }
        if (this.previews == null) {
            this.previews = new ArrayList();
        }
        if (this.userLiveRightResources == null) {
            this.userLiveRightResources = new ArrayList();
        }
        if (this.voiceUserProfileConfigs == null) {
            this.voiceUserProfileConfigs = new ArrayList();
        }
        if (this.giftShowcaseItems == null) {
            this.giftShowcaseItems = new ArrayList();
        }
        if (this.givenGiftRemindStatus == null) {
            this.givenGiftRemindStatus = BLiveGivenGiftRemindStatus.new_();
        }
        if (this.userLiveHierarchy == null) {
            this.userLiveHierarchy = BLiveUserLevel.new_();
        }
        if (this.chestRewardInfo == null) {
            this.chestRewardInfo = new ArrayList();
        }
        if (this.voiceUserFeedInfos == null) {
            this.voiceUserFeedInfos = new ArrayList();
        }
        if (this.gameInfoResponse == null) {
            this.gameInfoResponse = "";
        }
        if (this.userDailyTasks == null) {
            this.userDailyTasks = new ArrayList();
        }
        if (this.anchorDailyTasks == null) {
            this.anchorDailyTasks = new ArrayList();
        }
        if (this.stormComment == null) {
            this.stormComment = BLiveStormDanmaku.new_();
        }
        if (this.voiceLiveAssert == null) {
            this.voiceLiveAssert = BLiveVoiceLiveAssert.new_();
        }
        if (this.firstRechargeStatus == null) {
            this.firstRechargeStatus = BLiveFirstRechargeStatus.new_();
        }
        if (this.firstRechargeDetail == null) {
            this.firstRechargeDetail = BLiveFirstRechargeDetail.new_();
        }
        if (this.voiceTabs == null) {
            this.voiceTabs = new ArrayList();
        }
        if (this.skins == null) {
            this.skins = new ArrayList();
        }
        if (this.voiceChatGroup == null) {
            this.voiceChatGroup = BLiveVoiceChatGroup.new_();
        }
        if (this.voiceChatGroupApplies == null) {
            this.voiceChatGroupApplies = new ArrayList();
        }
        if (this.voiceManagers == null) {
            this.voiceManagers = new ArrayList();
        }
        if (this.multiCalls == null) {
            this.multiCalls = new ArrayList();
        }
        if (this.multiCallInvites == null) {
            this.multiCallInvites = new ArrayList();
        }
        if (this.multiCallSummary == null) {
            this.multiCallSummary = BLiveMultiCallSummary.new_();
        }
        if (this.activitySuggests == null) {
            this.activitySuggests = new ArrayList();
        }
        if (this.fanbaseRecall == null) {
            this.fanbaseRecall = BFansBaseRecall.new_();
        }
        if (this.accompanyUserRanking == null) {
            this.accompanyUserRanking = new ArrayList();
        }
        if (this.liveAnchors == null) {
            this.liveAnchors = new ArrayList();
        }
        if (this.suggestedLives == null) {
            this.suggestedLives = new ArrayList();
        }
        if (this.userLivePush == null) {
            this.userLivePush = BLivePush.new_();
        }
        if (this.touchMeDetail == null) {
            this.touchMeDetail = BLiveTouchMeDetail.new_();
        }
        if (this.multiCallSwitchToLeadRoleInvite == null) {
            this.multiCallSwitchToLeadRoleInvite = BLiveMultiCallSwitchToLeadRoleInvite.new_();
        }
        if (this.liveTopChatMessage == null) {
            this.liveTopChatMessage = BLiveTopChatMessage.new_();
        }
        if (this.squareEntranceSummary == null) {
            this.squareEntranceSummary = new ArrayList();
        }
        if (this.memberActivityList == null) {
            this.memberActivityList = new ArrayList();
        }
        if (this.voiceLiveActivityMoment == null) {
            this.voiceLiveActivityMoment = BLiveVoiceLiveActivityMoment.new_();
        }
        if (this.roomAnnouncement == null) {
            this.roomAnnouncement = BLiveMultiCallAnnouncement.new_();
        }
        if (this.voiceLiveUserHeartbeatRewardList == null) {
            this.voiceLiveUserHeartbeatRewardList = BLiveVoiceUserHeartbeatRewardList.new_();
        }
        if (this.voiceLiveHeartBeat == null) {
            this.voiceLiveHeartBeat = BLiveVoiceHeartBeat.new_();
        }
        if (this.voiceLivePopsTotal == null) {
            this.voiceLivePopsTotal = BLiveVoicePopTotal.new_();
        }
        if (this.grabHatCps == null) {
            this.grabHatCps = new ArrayList();
        }
        if (this.voiceLiveAuctions == null) {
            this.voiceLiveAuctions = new ArrayList();
        }
        if (this.cpRecommendUserList == null) {
            this.cpRecommendUserList = new ArrayList();
        }
        if (this.voiceCpLeaderBoards == null) {
            this.voiceCpLeaderBoards = BLiveVoiceCpLeaderBoards.new_();
        }
        if (this.voiceCpHouseTaskInfos == null) {
            this.voiceCpHouseTaskInfos = BLiveVoiceCpHouseTaskInfos.new_();
        }
        if (this.voiceCpHouseInfo == null) {
            this.voiceCpHouseInfo = BLiveVoiceCpHouseRankAwardInfo.new_();
        }
        if (this.voiceCpHouseList == null) {
            this.voiceCpHouseList = new ArrayList();
        }
        if (this.voiceHouseRankUpgradeInfo == null) {
            this.voiceHouseRankUpgradeInfo = BLiveVoiceHouseRankUpgradeInfo.new_();
        }
        if (this.backGroundPicSetting == null) {
            this.backGroundPicSetting = BLiveVoiceBackGroundPicSetting.new_();
        }
        if (this.dailyPayment == null) {
            this.dailyPayment = BLiveDailyPayment.new_();
        }
        if (this.intlVoiceLiveCampaigns == null) {
            this.intlVoiceLiveCampaigns = new ArrayList();
        }
        if (this.complexCardList == null) {
            this.complexCardList = new ArrayList();
        }
        if (this.voiceGiftWallList == null) {
            this.voiceGiftWallList = new ArrayList();
        }
        if (this.voiceGiftWallBookDetail == null) {
            this.voiceGiftWallBookDetail = BLiveVoiceGiftWallBookInfo.new_();
        }
        if (this.voiceFollowships == null) {
            this.voiceFollowships = new ArrayList();
        }
        if (this.voiceUserGiftItems == null) {
            this.voiceUserGiftItems = new ArrayList();
        }
        if (this.flameCoinMarket == null) {
            this.flameCoinMarket = BLiveHeaddressCoinMarket.new_();
        }
        if (this.virtualVoiceCard == null) {
            this.virtualVoiceCard = new ArrayList();
        }
        if (this.chatMsgLiveInfo == null) {
            this.chatMsgLiveInfo = BLiveChatRealMsgLiveInfo.new_();
        }
        if (this.voiceKTVGame == null) {
            this.voiceKTVGame = BLiveVoiceKtvGameInfo.new_();
        }
        if (this.voiceKTVSongs == null) {
            this.voiceKTVSongs = new ArrayList();
        }
        if (this.voiceKTVOrders == null) {
            this.voiceKTVOrders = new ArrayList();
        }
        if (this.complexCardConfig == null) {
            this.complexCardConfig = BLiveComplexCardFourConfig.new_();
        }
        if (this.familyMedals == null) {
            this.familyMedals = new ArrayList();
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.cells == null) {
            this.cells = new ArrayList();
        }
        if (this.voiceSettles == null) {
            this.voiceSettles = new ArrayList();
        }
        if (this.voiceLivePush == null) {
            this.voiceLivePush = BLiveVoiceLivePush.new_();
        }
        if (this.voiceAdminPanelCounter == null) {
            this.voiceAdminPanelCounter = BLiveVoiceAdminPanelCounter.new_();
        }
        if (this.voiceUserMessageRemind == null) {
            this.voiceUserMessageRemind = BLiveVoiceUserMessageRemind.new_();
        }
        if (this.shareRoomConfig == null) {
            this.shareRoomConfig = BLiveVoiceShareUrlConfig.new_();
        }
        if (this.nobleNiceNumberDetail == null) {
            this.nobleNiceNumberDetail = BLiveNiceNumberDetail.new_();
        }
        if (this.nobleNiceNumberList == null) {
            this.nobleNiceNumberList = BLiveNiceNumberList.new_();
        }
        if (this.heatVoiceRoomTasks == null) {
            this.heatVoiceRoomTasks = new ArrayList();
        }
        if (this.voiceGiftWall == null) {
            this.voiceGiftWall = BLiveVoiceGiftWall.new_();
        }
        if (this.voiceMedalWall == null) {
            this.voiceMedalWall = BLiveVoiceMedalWallIList.new_();
        }
        if (this.voiceWeekLeaderboards == null) {
            this.voiceWeekLeaderboards = BLiveVoiceHourLeaderBoard.new_();
        }
        if (this.voiceRoomLevelDetail == null) {
            this.voiceRoomLevelDetail = BLiveVoiceRoomLevelDetail.new_();
        }
        if (this.voiceRoomSummary == null) {
            this.voiceRoomSummary = BLiveVoiceVirtualRoomSummary.new_();
        }
        if (this.starRedPackets == null) {
            this.starRedPackets = new ArrayList();
        }
        if (this.showSideBarConfig == null) {
            this.showSideBarConfig = BLiveSideBarConfig.new_();
        }
        if (this.voiceLiveBanners == null) {
            this.voiceLiveBanners = new ArrayList();
        }
        if (this.multiPk == null) {
            this.multiPk = BLiveMultiPkDetail.new_();
        }
        if (this.multiPkPanel == null) {
            this.multiPkPanel = BLiveMultiPkPanel.new_();
        }
        if (this.multiPkAsset == null) {
            this.multiPkAsset = BLiveMultiPkAsset.new_();
        }
        if (this.multiPkLeaderboard == null) {
            this.multiPkLeaderboard = BLiveMultiPkLeaderboard.new_();
        }
        if (this.voiceRoomClasses == null) {
            this.voiceRoomClasses = new ArrayList();
        }
        if (this.chatTopicAsset == null) {
            this.chatTopicAsset = BLiveVoiceChatTopicAsset.new_();
        }
        if (this.chatTopic == null) {
            this.chatTopic = BLiveVoiceChatTopic.new_();
        }
        if (this.modelDescribe == null) {
            this.modelDescribe = BLiveVoiceModelDescribe.new_();
        }
        if (this.liveMedalCDN == null) {
            this.liveMedalCDN = BLiveLiveMedalCDN.new_();
        }
        if (this.voiceLiveUserFeedList == null) {
            this.voiceLiveUserFeedList = new ArrayList();
        }
        if (this.userRealVoiceLive == null) {
            this.userRealVoiceLive = BLiveVoiceUserRealVoiceLive.new_();
        }
        if (this.userLeaderboard == null) {
            this.userLeaderboard = BLiveUserLeaderboard.new_();
        }
        if (this.userWeekLeaderboard == null) {
            this.userWeekLeaderboard = BLiveUserLeaderboard.new_();
        }
        if (this.weekCpInfo == null) {
            this.weekCpInfo = BLiveWeekCpInfo.new_();
        }
        if (this.auctionCandidates == null) {
            this.auctionCandidates = new ArrayList();
        }
        if (this.auctionApplies == null) {
            this.auctionApplies = new ArrayList();
        }
        if (this.auctionInvites == null) {
            this.auctionInvites = new ArrayList();
        }
        if (this.voiceLiveAuctionAsset == null) {
            this.voiceLiveAuctionAsset = BLiveAuctionAsset.new_();
        }
        if (this.auctionRelationCards == null) {
            this.auctionRelationCards = new ArrayList();
        }
        if (this.bigTVLives == null) {
            this.bigTVLives = new ArrayList();
        }
        if (this.liveClarityLevelInfos == null) {
            this.liveClarityLevelInfos = new ArrayList();
        }
        if (this.voiceUserLeaderboards == null) {
            this.voiceUserLeaderboards = BLiveVoiceUserLeaderBoard.new_();
        }
        if (this.pkSuggestedAnchors == null) {
            this.pkSuggestedAnchors = new ArrayList();
        }
        if (this.voiceRoomAsset == null) {
            this.voiceRoomAsset = BLiveVoiceRoomAsset.new_();
        }
        if (this.family == null) {
            this.family = BLiveIntlFamilyInfo.new_();
        }
        if (this.familyShareInfo == null) {
            this.familyShareInfo = BLiveIntlFamilyShareInfo.new_();
        }
        if (this.userPushSwitch == null) {
            this.userPushSwitch = BLiveIntlPushSwitch.new_();
        }
        if (this.dragonScourgeDisplayChatMessage == null) {
            this.dragonScourgeDisplayChatMessage = BLiveDragonScourgeDisplayChatMessage.new_();
        }
        if (this.rights == null) {
            this.rights = new ArrayList();
        }
        if (this.auctionPlatformLeaderboardInfo == null) {
            this.auctionPlatformLeaderboardInfo = BLiveAuctionPlatformLeaderboardInfo.new_();
        }
        if (this.auctionCounter == null) {
            this.auctionCounter = BLiveAuctionCounter.new_();
        }
        if (this.giftDetails == null) {
            this.giftDetails = new ArrayList();
        }
        if (this.luckyParadiseBottomEntrance == null) {
            this.luckyParadiseBottomEntrance = BLiveLuckyParadiseBottomEntrance.new_();
        }
        if (this.intlLiveFramesMetadata == null) {
            this.intlLiveFramesMetadata = BLiveIntlLiveFramesCDN.new_();
        }
        if (this.media == null) {
            this.media = new ArrayList();
        }
        if (this.lovePlanet == null) {
            this.lovePlanet = BLiveLovePlanet.new_();
        }
        if (this.storeBackgroundPics == null) {
            this.storeBackgroundPics = new ArrayList();
        }
        if (this.giftSkinPanel == null) {
            this.giftSkinPanel = BLiveNewGiftSkinListData.new_();
        }
        if (this.emojiPlayMenu == null) {
            this.emojiPlayMenu = new ArrayList();
        }
        if (this.voicePayGuideUser == null) {
            this.voicePayGuideUser = BLiveVoicePayGuideUser.new_();
        }
        if (this.anchorGuildCheck == null) {
            this.anchorGuildCheck = BLiveGuildAnchorCheck.new_();
        }
        if (this.cpInviteRecords == null) {
            this.cpInviteRecords = new ArrayList();
        }
        if (this.siteWideBroadcastFinder == null) {
            this.siteWideBroadcastFinder = SiteWideBroadcastFinder.new_();
        }
        if (this.gameOperationPositions == null) {
            this.gameOperationPositions = new ArrayList();
        }
        if (this.videoChatLive == null) {
            this.videoChatLive = BLiveVideoChatLive.new_();
        }
        if (this.videoChat == null) {
            this.videoChat = BLiveVideoChat.new_();
        }
        if (this.videoChatSummary == null) {
            this.videoChatSummary = BLiveVideoChatSummary.new_();
        }
        if (this.superUserBirthdayDetail == null) {
            this.superUserBirthdayDetail = BLiveSuperGodDetail.new_();
        }
        if (this.missedCalls == null) {
            this.missedCalls = new ArrayList();
        }
        if (this.anchorCall == null) {
            this.anchorCall = BLiveVideoChatAnchorCall.new_();
        }
        if (this.videoChatAssets == null) {
            this.videoChatAssets = BLiveVideoChatAssets.new_();
        }
        if (this.videoChatSquareSummary == null) {
            this.videoChatSquareSummary = BLiveVideoChatSquareSummary.new_();
        }
        if (this.videoChatAttendeeCallInfo == null) {
            this.videoChatAttendeeCallInfo = BLiveVideoChatAttendeeCallInfo.new_();
        }
        if (this.randomMatchCouponDetail == null) {
            this.randomMatchCouponDetail = BLiveRandomMatchCouponDetail.new_();
        }
        if (this.videoChatRandomMatch == null) {
            this.videoChatRandomMatch = BLiveVideoChatRandomMatch.new_();
        }
        if (this.code == null) {
            this.code = "";
        }
        if (this.userCompliance == null) {
            this.userCompliance = BLiveUserCompliance.new_();
        }
        if (this.gamePanelMenus == null) {
            this.gamePanelMenus = BLiveIntlGamePanelMenus.new_();
        }
        if (this.funFairBottomEntrance == null) {
            this.funFairBottomEntrance = BLiveLuckyParadiseBottomEntrance.new_();
        }
        if (this.voiceSquareButtons == null) {
            this.voiceSquareButtons = new ArrayList();
        }
        if (this.superChatDetail == null) {
            this.superChatDetail = BLiveSuperChatDetail.new_();
        }
        if (this.voiceLeaderboardEntrances == null) {
            this.voiceLeaderboardEntrances = new ArrayList();
        }
        if (this.skinList == null) {
            this.skinList = new ArrayList();
        }
        if (this.starlightHierarchies == null) {
            this.starlightHierarchies = new ArrayList();
        }
        if (this.pkItemCardsDetail == null) {
            this.pkItemCardsDetail = BLivePKCardShowList.new_();
        }
        if (this.octopusUrl == null) {
            this.octopusUrl = "";
        }
        if (this.intlConfig == null) {
            this.intlConfig = BLiveIntlConfig.new_();
        }
        if (this.intlMedalWall == null) {
            this.intlMedalWall = BLiveIntlMedalWallInUserCard.new_();
        }
        if (this.medalWall == null) {
            this.medalWall = BLiveIntlMedalWall.new_();
        }
        if (this.gameAsset == null) {
            this.gameAsset = BLiveVoicePlayModeList.new_();
        }
        if (this.game == null) {
            this.game = BLiveVoiceGame.new_();
        }
        if (this.canJoinGame == null) {
            this.canJoinGame = BLiveVoiceCanJoinGame.new_();
        }
        if (this.voiceFanbase == null) {
            this.voiceFanbase = BLiveFansMemberNum.new_();
        }
        if (this.voiceFanbaseDetail == null) {
            this.voiceFanbaseDetail = BLiveVoiceFanBaseDetail.new_();
        }
        if (this.memberLbs == null) {
            this.memberLbs = new ArrayList();
        }
        if (this.voiceFanbaseLbs == null) {
            this.voiceFanbaseLbs = new ArrayList();
        }
        if (this.myJoins == null) {
            this.myJoins = new ArrayList();
        }
        if (this.voiceFanbaseMedals == null) {
            this.voiceFanbaseMedals = new ArrayList();
        }
        if (this.heatBoxEntrance == null) {
            this.heatBoxEntrance = BLiveVoiceHeatBoxEntrance.new_();
        }
        if (this.voicePkInfo == null) {
            this.voicePkInfo = BLiveVoicePkInfo.new_();
        }
        if (this.bossCall == null) {
            this.bossCall = BLiveBossCall.new_();
        }
        if (this.bossGiftRecord == null) {
            this.bossGiftRecord = BLiveBossGiftRecord.new_();
        }
        if (this.giftWallV3Briefs == null) {
            this.giftWallV3Briefs = new ArrayList();
        }
        if (this.voiceLiveBulletCommentTypes == null) {
            this.voiceLiveBulletCommentTypes = new ArrayList();
        }
        if (this.voiceLiveBulletComment == null) {
            this.voiceLiveBulletComment = BLiveDanmakuItem.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
