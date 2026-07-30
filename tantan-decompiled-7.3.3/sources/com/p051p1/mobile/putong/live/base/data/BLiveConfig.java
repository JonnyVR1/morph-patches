package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.p051p1.mobile.putong.core.data.Square;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveConfig newInstance() {
            return new BLiveConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveConfig bLiveConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2137912508:
                    if (str.equals("enterRoomEffect")) {
                        b = 0;
                    }
                    break;
                case -1954664231:
                    if (str.equals("reportFeedback")) {
                        b = 1;
                    }
                    break;
                case -1832297963:
                    if (str.equals("liveSquareRefreshListInterval")) {
                        b = 2;
                    }
                    break;
                case -1806860296:
                    if (str.equals("swipeCardUnlimit")) {
                        b = 3;
                    }
                    break;
                case -1785490408:
                    if (str.equals("stormCommentConfig")) {
                        b = 4;
                    }
                    break;
                case -1779523090:
                    if (str.equals("stealthPrivilege")) {
                        b = 5;
                    }
                    break;
                case -1652076020:
                    if (str.equals("obsLive")) {
                        b = 6;
                    }
                    break;
                case -1592445274:
                    if (str.equals("vipReportGrade")) {
                        b = 7;
                    }
                    break;
                case -1553337443:
                    if (str.equals("teenMode")) {
                        b = 8;
                    }
                    break;
                case -1520085429:
                    if (str.equals("profileConfig")) {
                        b = 9;
                    }
                    break;
                case -1453305515:
                    if (str.equals("toStartLiveConfig")) {
                        b = 10;
                    }
                    break;
                case -1441099176:
                    if (str.equals("swipeLiveCardConfig")) {
                        b = 11;
                    }
                    break;
                case -1432219297:
                    if (str.equals("followSetting")) {
                        b = 12;
                    }
                    break;
                case -1347150868:
                    if (str.equals("memberListMax")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1312844238:
                    if (str.equals("suggestedTabAnimation")) {
                        b = 14;
                    }
                    break;
                case -1304820419:
                    if (str.equals("verificationConfig")) {
                        b = 15;
                    }
                    break;
                case -1250137377:
                    if (str.equals("blackListConfig")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -1243591908:
                    if (str.equals("pushStreamConfig")) {
                        b = 17;
                    }
                    break;
                case -1089713495:
                    if (str.equals("liveHierarchy")) {
                        b = 18;
                    }
                    break;
                case -1085801880:
                    if (str.equals("cardOnLiveText")) {
                        b = 19;
                    }
                    break;
                case -1082273692:
                    if (str.equals(BLiveOpenStatus.fanbase)) {
                        b = 20;
                    }
                    break;
                case -1078714986:
                    if (str.equals("roomSlide")) {
                        b = 21;
                    }
                    break;
                case -973256732:
                    if (str.equals("managerRights")) {
                        b = 22;
                    }
                    break;
                case -894674659:
                    if (str.equals(Square.TYPE)) {
                        b = 23;
                    }
                    break;
                case -839885020:
                    if (str.equals("showDebugInfo")) {
                        b = 24;
                    }
                    break;
                case -763348009:
                    if (str.equals("smallWindow")) {
                        b = 25;
                    }
                    break;
                case -758638628:
                    if (str.equals("nobleConfig")) {
                        b = 26;
                    }
                    break;
                case -605981505:
                    if (str.equals("msgSameLocationLimit")) {
                        b = 27;
                    }
                    break;
                case -589307568:
                    if (str.equals("liveBreakingLeaderboardConfig")) {
                        b = 28;
                    }
                    break;
                case -390493805:
                    if (str.equals("liveLeaderboardConfig")) {
                        b = 29;
                    }
                    break;
                case -381800732:
                    if (str.equals("intlFeedbackConfig")) {
                        b = 30;
                    }
                    break;
                case -296930158:
                    if (str.equals("giftConfig")) {
                        b = 31;
                    }
                    break;
                case -114314814:
                    if (str.equals("roomAnnouncement")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 3579:
                    if (str.equals("pk")) {
                        b = 33;
                    }
                    break;
                case 3045982:
                    if (str.equals("call")) {
                        b = 34;
                    }
                    break;
                case 3052376:
                    if (str.equals("chat")) {
                        b = 35;
                    }
                    break;
                case 63867751:
                    if (str.equals("hideLiveTab")) {
                        b = 36;
                    }
                    break;
                case 166757441:
                    if (str.equals("license")) {
                        b = 37;
                    }
                    break;
                case 170752507:
                    if (str.equals("leaderboardCollection")) {
                        b = 38;
                    }
                    break;
                case 184278793:
                    if (str.equals("liveTab")) {
                        b = 39;
                    }
                    break;
                case 273184745:
                    if (str.equals("discover")) {
                        b = 40;
                    }
                    break;
                case 363629127:
                    if (str.equals("roomManagerCountMax")) {
                        b = 41;
                    }
                    break;
                case 487830970:
                    if (str.equals("entertainmentTabText")) {
                        b = 42;
                    }
                    break;
                case 501265232:
                    if (str.equals("liveStreamEventConfig")) {
                        b = 43;
                    }
                    break;
                case 504058884:
                    if (str.equals("videoQuality")) {
                        b = 44;
                    }
                    break;
                case 521151663:
                    if (str.equals("followRateConfigV2")) {
                        b = 45;
                    }
                    break;
                case 537326394:
                    if (str.equals("enableFriendsLiveStartEntrance")) {
                        b = 46;
                    }
                    break;
                case 542916167:
                    if (str.equals("guardConfig")) {
                        b = 47;
                    }
                    break;
                case 658704265:
                    if (str.equals("unreadType")) {
                        b = 48;
                    }
                    break;
                case 899452620:
                    if (str.equals("notifyFollowers")) {
                        b = 49;
                    }
                    break;
                case 938467364:
                    if (str.equals("liveSquareRefreshStateInterval")) {
                        b = 50;
                    }
                    break;
                case 1002186219:
                    if (str.equals("userStatusInfo")) {
                        b = 51;
                    }
                    break;
                case 1005653767:
                    if (str.equals("fakeAlert")) {
                        b = 52;
                    }
                    break;
                case 1066938671:
                    if (str.equals("isMagicGestureOpened")) {
                        b = 53;
                    }
                    break;
                case 1117003062:
                    if (str.equals("quitLiveStayConfig")) {
                        b = 54;
                    }
                    break;
                case 1121706439:
                    if (str.equals("pullStreamConfig")) {
                        b = 55;
                    }
                    break;
                case 1167179706:
                    if (str.equals("inAppPushHideConfig")) {
                        b = 56;
                    }
                    break;
                case 1233933671:
                    if (str.equals("activityOngoingAdditionCount")) {
                        b = 57;
                    }
                    break;
                case 1289246879:
                    if (str.equals("bulletCommentConfig")) {
                        b = HttpTokens.COLON;
                    }
                    break;
                case 1300636242:
                    if (str.equals("inRoomSideBarEntrance")) {
                        b = HttpTokens.SEMI_COLON;
                    }
                    break;
                case 1383812221:
                    if (str.equals("recallFansLimitToast")) {
                        b = 60;
                    }
                    break;
                case 1461398796:
                    if (str.equals("showMomentLikesAndComments")) {
                        b = 61;
                    }
                    break;
                case 1482064292:
                    if (str.equals("signInConfig")) {
                        b = 62;
                    }
                    break;
                case 1574483403:
                    if (str.equals("followGuide")) {
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case 1660921766:
                    if (str.equals("anchorsSearch")) {
                        b = 64;
                    }
                    break;
                case 1678445076:
                    if (str.equals("activitySummaryRegularUnread")) {
                        b = 65;
                    }
                    break;
                case 1682401625:
                    if (str.equals("multiCallConfig")) {
                        b = 66;
                    }
                    break;
                case 2123794812:
                    if (str.equals("pushMaxTimes")) {
                        b = 67;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveConfig.enterRoomEffect = BLiveEnterRoomConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveConfig.reportFeedback = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveConfig.liveSquareRefreshListInterval = jsonParser.getValueAsInt();
                    return true;
                case 3:
                    bLiveConfig.swipeCardUnlimit = BLiveSwipeCardUnlimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveConfig.stormCommentConfig = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveConfig.stealthPrivilege = BLiveStealthPrivilege.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveConfig.obsLive = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveConfig.vipReportGrade = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Long.valueOf(jsonParser.getValueAsLong());
                    return true;
                case 8:
                    bLiveConfig.teenMode = BLiveTeenMode.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveConfig.profileConfig = BLiveProfileConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveConfig.toStartLiveConfig = BLiveStartBtnConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveConfig.swipeLiveCardConfig = BLiveSwipeLiveCardConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveConfig.followSetting = BLiveFollowSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLiveConfig.memberListMax = jsonParser.getValueAsInt();
                    return true;
                case 14:
                    bLiveConfig.suggestedTabAnimation = BSuggestedTabAnimation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveConfig.verificationConfig = BVerificationConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    bLiveConfig.blackListConfig = BLiveBlackListConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLiveConfig.pushStreamConfig = BLivePushStreamConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    bLiveConfig.liveHierarchy = BLiveUserLevelSwitch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    bLiveConfig.cardOnLiveText = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveConfig.fanbase = BLiveFanBaseSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    bLiveConfig.roomSlide = BLiveScrollGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveConfig.managerRights = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    bLiveConfig.square = BLiveSquareConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    bLiveConfig.showDebugInfo = jsonParser.getValueAsBoolean();
                    return true;
                case 25:
                    bLiveConfig.smallWindow = BLiveSmallWindow.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    bLiveConfig.nobleConfig = BLiveNobleConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    bLiveConfig.msgSameLocationLimit = jsonParser.getValueAsInt();
                    return true;
                case 28:
                    bLiveConfig.liveBreakingLeaderboardConfig = BLiveBreakingLeaderboardConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    bLiveConfig.liveLeaderboardConfig = BLiveLeaderBoardConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    bLiveConfig.intlFeedbackConfig = BLiveIntlFeedbackConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 31:
                    bLiveConfig.giftConfig = BLiveGiftConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 32:
                    bLiveConfig.roomAnnouncement = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 33:
                    bLiveConfig.f45200pk = BLivePkSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    bLiveConfig.call = BLiveCallSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 35:
                    bLiveConfig.chat = BLiveChatConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 36:
                    bLiveConfig.hideLiveTab = jsonParser.getValueAsBoolean();
                    return true;
                case 37:
                    bLiveConfig.license = BLiveLicense.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 38:
                    bLiveConfig.leaderboardCollection = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 39:
                    bLiveConfig.liveTab = BLiveDiscover.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 40:
                    bLiveConfig.discover = BLiveDiscover.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 41:
                    bLiveConfig.roomManagerCountMax = jsonParser.getValueAsInt();
                    return true;
                case 42:
                    bLiveConfig.entertainmentTabText = jsonParser.getValueAsString();
                    return true;
                case 43:
                    bLiveConfig.liveStreamEventConfig = BLiveStreamEventConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 44:
                    bLiveConfig.videoQuality = BLiveVideoQuality.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 45:
                    bLiveConfig.followRateConfigV2 = BLiveFollowRateConfigV2.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 46:
                    bLiveConfig.enableFriendsLiveStartEntrance = jsonParser.getValueAsBoolean();
                    return true;
                case 47:
                    bLiveConfig.guardConfig = BLiveGuardConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 48:
                    bLiveConfig.unreadType = BLiveUnreadType.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 49:
                    bLiveConfig.notifyFollowers = BLiveNotifyFollowers.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 50:
                    bLiveConfig.liveSquareRefreshStateInterval = jsonParser.getValueAsInt();
                    return true;
                case 51:
                    bLiveConfig.userStatusInfo = BLiveUserStatusInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 52:
                    bLiveConfig.fakeAlert = BLiveFakeAlert.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 53:
                    bLiveConfig.isMagicGestureOpened = jsonParser.getValueAsBoolean();
                    return true;
                case 54:
                    bLiveConfig.quitLiveStayConfig = BQuitLiveStayConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 55:
                    bLiveConfig.pullStreamConfig = BLivePullStreamConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 56:
                    bLiveConfig.inAppPushHideConfig = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 57:
                    bLiveConfig.activityOngoingAdditionCount = jsonParser.getValueAsInt();
                    return true;
                case 58:
                    bLiveConfig.bulletCommentConfig = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 59:
                    bLiveConfig.inRoomSideBarEntrance = BLiveInRoomSideBarEntrance.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 60:
                    bLiveConfig.recallFansLimitToast = jsonParser.getValueAsString();
                    return true;
                case 61:
                    bLiveConfig.showMomentLikesAndComments = jsonParser.getValueAsBoolean();
                    return true;
                case 62:
                    bLiveConfig.signInConfig = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 63:
                    bLiveConfig.followGuide = BLiveFollowGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 64:
                    bLiveConfig.anchorsSearch = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 65:
                    bLiveConfig.activitySummaryRegularUnread = BLiveActivitySummaryRegularUnread.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 66:
                    bLiveConfig.multiCallConfig = BLiveMultiCallConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 67:
                    bLiveConfig.pushMaxTimes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveConfig bLiveConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("memberListMax", bLiveConfig.memberListMax);
            if (bLiveConfig.license != null) {
                jsonGenerator.writeFieldName("license");
                BLiveLicense.JSON_ADAPTER.serialize(bLiveConfig.license, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("pushMaxTimes", bLiveConfig.pushMaxTimes);
            jsonGenerator.writeNumberField("liveSquareRefreshStateInterval", bLiveConfig.liveSquareRefreshStateInterval);
            jsonGenerator.writeNumberField("liveSquareRefreshListInterval", bLiveConfig.liveSquareRefreshListInterval);
            if (bLiveConfig.smallWindow != null) {
                jsonGenerator.writeFieldName("smallWindow");
                BLiveSmallWindow.JSON_ADAPTER.serialize(bLiveConfig.smallWindow, jsonGenerator, true);
            }
            if (bLiveConfig.followGuide != null) {
                jsonGenerator.writeFieldName("followGuide");
                BLiveFollowGuide.JSON_ADAPTER.serialize(bLiveConfig.followGuide, jsonGenerator, true);
            }
            if (bLiveConfig.managerRights != null) {
                jsonGenerator.writeFieldName("managerRights");
                JsonAdapter.serializeArray(bLiveConfig.managerRights, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLiveConfig.followSetting != null) {
                jsonGenerator.writeFieldName("followSetting");
                BLiveFollowSetting.JSON_ADAPTER.serialize(bLiveConfig.followSetting, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showMomentLikesAndComments", bLiveConfig.showMomentLikesAndComments);
            jsonGenerator.writeNumberField("roomManagerCountMax", bLiveConfig.roomManagerCountMax);
            if (bLiveConfig.liveHierarchy != null) {
                jsonGenerator.writeFieldName("liveHierarchy");
                BLiveUserLevelSwitch.JSON_ADAPTER.serialize(bLiveConfig.liveHierarchy, jsonGenerator, true);
            }
            String str = bLiveConfig.reportFeedback;
            if (str != null) {
                jsonGenerator.writeStringField("reportFeedback", str);
            }
            String str2 = bLiveConfig.recallFansLimitToast;
            if (str2 != null) {
                jsonGenerator.writeStringField("recallFansLimitToast", str2);
            }
            jsonGenerator.writeBooleanField("isMagicGestureOpened", bLiveConfig.isMagicGestureOpened);
            String str3 = bLiveConfig.cardOnLiveText;
            if (str3 != null) {
                jsonGenerator.writeStringField("cardOnLiveText", str3);
            }
            if (bLiveConfig.teenMode != null) {
                jsonGenerator.writeFieldName("teenMode");
                BLiveTeenMode.JSON_ADAPTER.serialize(bLiveConfig.teenMode, jsonGenerator, true);
            }
            if (bLiveConfig.videoQuality != null) {
                jsonGenerator.writeFieldName("videoQuality");
                BLiveVideoQuality.JSON_ADAPTER.serialize(bLiveConfig.videoQuality, jsonGenerator, true);
            }
            if (bLiveConfig.liveBreakingLeaderboardConfig != null) {
                jsonGenerator.writeFieldName("liveBreakingLeaderboardConfig");
                BLiveBreakingLeaderboardConfig.JSON_ADAPTER.serialize(bLiveConfig.liveBreakingLeaderboardConfig, jsonGenerator, true);
            }
            if (bLiveConfig.square != null) {
                jsonGenerator.writeFieldName(Square.TYPE);
                BLiveSquareConfig.JSON_ADAPTER.serialize(bLiveConfig.square, jsonGenerator, true);
            }
            if (bLiveConfig.chat != null) {
                jsonGenerator.writeFieldName("chat");
                BLiveChatConfig.JSON_ADAPTER.serialize(bLiveConfig.chat, jsonGenerator, true);
            }
            if (bLiveConfig.pushStreamConfig != null) {
                jsonGenerator.writeFieldName("pushStreamConfig");
                BLivePushStreamConfig.JSON_ADAPTER.serialize(bLiveConfig.pushStreamConfig, jsonGenerator, true);
            }
            if (bLiveConfig.discover != null) {
                jsonGenerator.writeFieldName("discover");
                BLiveDiscover.JSON_ADAPTER.serialize(bLiveConfig.discover, jsonGenerator, true);
            }
            if (bLiveConfig.inRoomSideBarEntrance != null) {
                jsonGenerator.writeFieldName("inRoomSideBarEntrance");
                BLiveInRoomSideBarEntrance.JSON_ADAPTER.serialize(bLiveConfig.inRoomSideBarEntrance, jsonGenerator, true);
            }
            if (bLiveConfig.liveTab != null) {
                jsonGenerator.writeFieldName("liveTab");
                BLiveDiscover.JSON_ADAPTER.serialize(bLiveConfig.liveTab, jsonGenerator, true);
            }
            if (bLiveConfig.unreadType != null) {
                jsonGenerator.writeFieldName("unreadType");
                BLiveUnreadType.JSON_ADAPTER.serialize(bLiveConfig.unreadType, jsonGenerator, true);
            }
            if (bLiveConfig.activitySummaryRegularUnread != null) {
                jsonGenerator.writeFieldName("activitySummaryRegularUnread");
                BLiveActivitySummaryRegularUnread.JSON_ADAPTER.serialize(bLiveConfig.activitySummaryRegularUnread, jsonGenerator, true);
            }
            if (bLiveConfig.roomSlide != null) {
                jsonGenerator.writeFieldName("roomSlide");
                BLiveScrollGuide.JSON_ADAPTER.serialize(bLiveConfig.roomSlide, jsonGenerator, true);
            }
            if (bLiveConfig.followRateConfigV2 != null) {
                jsonGenerator.writeFieldName("followRateConfigV2");
                BLiveFollowRateConfigV2.JSON_ADAPTER.serialize(bLiveConfig.followRateConfigV2, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("msgSameLocationLimit", bLiveConfig.msgSameLocationLimit);
            if (bLiveConfig.notifyFollowers != null) {
                jsonGenerator.writeFieldName("notifyFollowers");
                BLiveNotifyFollowers.JSON_ADAPTER.serialize(bLiveConfig.notifyFollowers, jsonGenerator, true);
            }
            if (bLiveConfig.anchorsSearch != null) {
                jsonGenerator.writeFieldName("anchorsSearch");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveConfig.anchorsSearch, jsonGenerator, true);
            }
            if (bLiveConfig.f45200pk != null) {
                jsonGenerator.writeFieldName("pk");
                BLivePkSetting.JSON_ADAPTER.serialize(bLiveConfig.f45200pk, jsonGenerator, true);
            }
            if (bLiveConfig.fakeAlert != null) {
                jsonGenerator.writeFieldName("fakeAlert");
                BLiveFakeAlert.JSON_ADAPTER.serialize(bLiveConfig.fakeAlert, jsonGenerator, true);
            }
            if (bLiveConfig.fanbase != null) {
                jsonGenerator.writeFieldName(BLiveOpenStatus.fanbase);
                BLiveFanBaseSetting.JSON_ADAPTER.serialize(bLiveConfig.fanbase, jsonGenerator, true);
            }
            if (bLiveConfig.call != null) {
                jsonGenerator.writeFieldName("call");
                BLiveCallSetting.JSON_ADAPTER.serialize(bLiveConfig.call, jsonGenerator, true);
            }
            if (bLiveConfig.enterRoomEffect != null) {
                jsonGenerator.writeFieldName("enterRoomEffect");
                BLiveEnterRoomConfig.JSON_ADAPTER.serialize(bLiveConfig.enterRoomEffect, jsonGenerator, true);
            }
            if (bLiveConfig.giftConfig != null) {
                jsonGenerator.writeFieldName("giftConfig");
                BLiveGiftConfig.JSON_ADAPTER.serialize(bLiveConfig.giftConfig, jsonGenerator, true);
            }
            Long l2 = bLiveConfig.vipReportGrade;
            if (l2 != null) {
                jsonGenerator.writeNumberField("vipReportGrade", l2.longValue());
            }
            if (bLiveConfig.guardConfig != null) {
                jsonGenerator.writeFieldName("guardConfig");
                BLiveGuardConfig.JSON_ADAPTER.serialize(bLiveConfig.guardConfig, jsonGenerator, true);
            }
            if (bLiveConfig.stealthPrivilege != null) {
                jsonGenerator.writeFieldName("stealthPrivilege");
                BLiveStealthPrivilege.JSON_ADAPTER.serialize(bLiveConfig.stealthPrivilege, jsonGenerator, true);
            }
            if (bLiveConfig.bulletCommentConfig != null) {
                jsonGenerator.writeFieldName("bulletCommentConfig");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveConfig.bulletCommentConfig, jsonGenerator, true);
            }
            if (bLiveConfig.profileConfig != null) {
                jsonGenerator.writeFieldName("profileConfig");
                BLiveProfileConfig.JSON_ADAPTER.serialize(bLiveConfig.profileConfig, jsonGenerator, true);
            }
            if (bLiveConfig.swipeCardUnlimit != null) {
                jsonGenerator.writeFieldName("swipeCardUnlimit");
                BLiveSwipeCardUnlimit.JSON_ADAPTER.serialize(bLiveConfig.swipeCardUnlimit, jsonGenerator, true);
            }
            if (bLiveConfig.signInConfig != null) {
                jsonGenerator.writeFieldName("signInConfig");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveConfig.signInConfig, jsonGenerator, true);
            }
            if (bLiveConfig.verificationConfig != null) {
                jsonGenerator.writeFieldName("verificationConfig");
                BVerificationConfig.JSON_ADAPTER.serialize(bLiveConfig.verificationConfig, jsonGenerator, true);
            }
            if (bLiveConfig.stormCommentConfig != null) {
                jsonGenerator.writeFieldName("stormCommentConfig");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveConfig.stormCommentConfig, jsonGenerator, true);
            }
            if (bLiveConfig.multiCallConfig != null) {
                jsonGenerator.writeFieldName("multiCallConfig");
                BLiveMultiCallConfig.JSON_ADAPTER.serialize(bLiveConfig.multiCallConfig, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("activityOngoingAdditionCount", bLiveConfig.activityOngoingAdditionCount);
            if (bLiveConfig.obsLive != null) {
                jsonGenerator.writeFieldName("obsLive");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveConfig.obsLive, jsonGenerator, true);
            }
            if (bLiveConfig.suggestedTabAnimation != null) {
                jsonGenerator.writeFieldName("suggestedTabAnimation");
                BSuggestedTabAnimation.JSON_ADAPTER.serialize(bLiveConfig.suggestedTabAnimation, jsonGenerator, true);
            }
            if (bLiveConfig.quitLiveStayConfig != null) {
                jsonGenerator.writeFieldName("quitLiveStayConfig");
                BQuitLiveStayConfig.JSON_ADAPTER.serialize(bLiveConfig.quitLiveStayConfig, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showDebugInfo", bLiveConfig.showDebugInfo);
            if (bLiveConfig.toStartLiveConfig != null) {
                jsonGenerator.writeFieldName("toStartLiveConfig");
                BLiveStartBtnConfig.JSON_ADAPTER.serialize(bLiveConfig.toStartLiveConfig, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("enableFriendsLiveStartEntrance", bLiveConfig.enableFriendsLiveStartEntrance);
            if (bLiveConfig.roomAnnouncement != null) {
                jsonGenerator.writeFieldName("roomAnnouncement");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveConfig.roomAnnouncement, jsonGenerator, true);
            }
            if (bLiveConfig.inAppPushHideConfig != null) {
                jsonGenerator.writeFieldName("inAppPushHideConfig");
                JsonAdapter.serializeArray(bLiveConfig.inAppPushHideConfig, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveConfig.blackListConfig != null) {
                jsonGenerator.writeFieldName("blackListConfig");
                BLiveBlackListConfig.JSON_ADAPTER.serialize(bLiveConfig.blackListConfig, jsonGenerator, true);
            }
            String str4 = bLiveConfig.entertainmentTabText;
            if (str4 != null) {
                jsonGenerator.writeStringField("entertainmentTabText", str4);
            }
            if (bLiveConfig.nobleConfig != null) {
                jsonGenerator.writeFieldName("nobleConfig");
                BLiveNobleConfig.JSON_ADAPTER.serialize(bLiveConfig.nobleConfig, jsonGenerator, true);
            }
            if (bLiveConfig.leaderboardCollection != null) {
                jsonGenerator.writeFieldName("leaderboardCollection");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveConfig.leaderboardCollection, jsonGenerator, true);
            }
            if (bLiveConfig.pullStreamConfig != null) {
                jsonGenerator.writeFieldName("pullStreamConfig");
                BLivePullStreamConfig.JSON_ADAPTER.serialize(bLiveConfig.pullStreamConfig, jsonGenerator, true);
            }
            if (bLiveConfig.swipeLiveCardConfig != null) {
                jsonGenerator.writeFieldName("swipeLiveCardConfig");
                BLiveSwipeLiveCardConfig.JSON_ADAPTER.serialize(bLiveConfig.swipeLiveCardConfig, jsonGenerator, true);
            }
            if (bLiveConfig.liveLeaderboardConfig != null) {
                jsonGenerator.writeFieldName("liveLeaderboardConfig");
                BLiveLeaderBoardConfig.JSON_ADAPTER.serialize(bLiveConfig.liveLeaderboardConfig, jsonGenerator, true);
            }
            if (bLiveConfig.userStatusInfo != null) {
                jsonGenerator.writeFieldName("userStatusInfo");
                BLiveUserStatusInfo.JSON_ADAPTER.serialize(bLiveConfig.userStatusInfo, jsonGenerator, true);
            }
            if (bLiveConfig.intlFeedbackConfig != null) {
                jsonGenerator.writeFieldName("intlFeedbackConfig");
                BLiveIntlFeedbackConfig.JSON_ADAPTER.serialize(bLiveConfig.intlFeedbackConfig, jsonGenerator, true);
            }
            if (bLiveConfig.liveStreamEventConfig != null) {
                jsonGenerator.writeFieldName("liveStreamEventConfig");
                BLiveStreamEventConfig.JSON_ADAPTER.serialize(bLiveConfig.liveStreamEventConfig, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("hideLiveTab", bLiveConfig.hideLiveTab);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveconfig";

    @ProtobufIndex(index = 49)
    public int activityOngoingAdditionCount;

    @Nullable
    @ProtobufIndex(index = 27)
    public BLiveActivitySummaryRegularUnread activitySummaryRegularUnread;

    @Nullable
    @ProtobufIndex(index = 32)
    public BLiveCommonViewConfig anchorsSearch;

    @NonNull
    @ProtobufIndex(index = 58)
    public BLiveBlackListConfig blackListConfig;

    @Nullable
    @ProtobufIndex(index = 42)
    public BLiveCommonConfig bulletCommentConfig;

    @NonNull
    @ProtobufIndex(index = 36)
    public BLiveCallSetting call;

    @NonNull
    @ProtobufIndex(index = 16)
    public String cardOnLiveText;

    @NonNull
    @ProtobufIndex(index = 21)
    public BLiveChatConfig chat;

    @NonNull
    @ProtobufIndex(index = 23)
    public BLiveDiscover discover;

    @ProtobufIndex(index = 55)
    public boolean enableFriendsLiveStartEntrance;

    @Nullable
    @ProtobufIndex(index = 37)
    public BLiveEnterRoomConfig enterRoomEffect;

    @NonNull
    @ProtobufIndex(index = 59)
    public String entertainmentTabText;

    @Nullable
    @ProtobufIndex(index = 34)
    public BLiveFakeAlert fakeAlert;

    @Nullable
    @ProtobufIndex(index = 35)
    public BLiveFanBaseSetting fanbase;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveFollowGuide followGuide;

    @NonNull
    @ProtobufIndex(index = 29)
    public BLiveFollowRateConfigV2 followRateConfigV2;

    @Nullable
    @ProtobufIndex(index = 9)
    public BLiveFollowSetting followSetting;

    @Nullable
    @ProtobufIndex(index = 38)
    public BLiveGiftConfig giftConfig;

    @Nullable
    @ProtobufIndex(index = 40)
    public BLiveGuardConfig guardConfig;

    @ProtobufIndex(index = 68)
    public boolean hideLiveTab;

    @NonNull
    @ProtobufIndex(index = 57)
    public List<String> inAppPushHideConfig;

    @NonNull
    @ProtobufIndex(index = 24)
    public BLiveInRoomSideBarEntrance inRoomSideBarEntrance;

    @NonNull
    @ProtobufIndex(index = 66)
    public BLiveIntlFeedbackConfig intlFeedbackConfig;

    @ProtobufIndex(index = 15)
    public boolean isMagicGestureOpened;

    @NonNull
    @ProtobufIndex(index = 61)
    public BLiveCommonConfig leaderboardCollection;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveLicense license;

    @NonNull
    @ProtobufIndex(index = 19)
    public BLiveBreakingLeaderboardConfig liveBreakingLeaderboardConfig;

    @NonNull
    @ProtobufIndex(index = 12)
    public BLiveUserLevelSwitch liveHierarchy;

    @NonNull
    @ProtobufIndex(index = 64)
    public BLiveLeaderBoardConfig liveLeaderboardConfig;

    @ProtobufIndex(index = 5)
    public int liveSquareRefreshListInterval;

    @ProtobufIndex(index = 4)
    public int liveSquareRefreshStateInterval;

    @NonNull
    @ProtobufIndex(index = 67)
    public BLiveStreamEventConfig liveStreamEventConfig;

    @NonNull
    @ProtobufIndex(index = 25)
    public BLiveDiscover liveTab;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<Integer> managerRights;

    @ProtobufIndex(index = 1)
    public int memberListMax;

    @ProtobufIndex(index = 30)
    public int msgSameLocationLimit;

    @Nullable
    @ProtobufIndex(index = 48)
    public BLiveMultiCallConfig multiCallConfig;

    @Nullable
    @ProtobufIndex(index = 60)
    public BLiveNobleConfig nobleConfig;

    @NonNull
    @ProtobufIndex(index = 31)
    public BLiveNotifyFollowers notifyFollowers;

    @NonNull
    @ProtobufIndex(index = 50)
    public BLiveCommonConfig obsLive;

    /* JADX INFO: renamed from: pk */
    @NonNull
    @ProtobufIndex(index = 33)
    public BLivePkSetting f45200pk;

    @Nullable
    @ProtobufIndex(index = 43)
    public BLiveProfileConfig profileConfig;

    @NonNull
    @ProtobufIndex(index = 62)
    public BLivePullStreamConfig pullStreamConfig;

    @ProtobufIndex(index = 3)
    public int pushMaxTimes;

    @NonNull
    @ProtobufIndex(index = 22)
    public BLivePushStreamConfig pushStreamConfig;

    @NonNull
    @ProtobufIndex(index = 51)
    public BQuitLiveStayConfig quitLiveStayConfig;

    @NonNull
    @ProtobufIndex(index = 14)
    public String recallFansLimitToast;

    @NonNull
    @ProtobufIndex(index = 13)
    public String reportFeedback;

    @NonNull
    @ProtobufIndex(index = 56)
    public BLiveCommonConfig roomAnnouncement;

    @ProtobufIndex(index = 11)
    public int roomManagerCountMax;

    @NonNull
    @ProtobufIndex(index = 28)
    public BLiveScrollGuide roomSlide;

    @ProtobufIndex(index = 53)
    public boolean showDebugInfo;

    @ProtobufIndex(index = 10)
    public boolean showMomentLikesAndComments;

    @NonNull
    @ProtobufIndex(index = 45)
    public BLiveCommonConfig signInConfig;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveSmallWindow smallWindow;

    @NonNull
    @ProtobufIndex(index = 20)
    public BLiveSquareConfig square;

    @NonNull
    @ProtobufIndex(index = 41)
    public BLiveStealthPrivilege stealthPrivilege;

    @Nullable
    @ProtobufIndex(index = 47)
    public BLiveCommonConfig stormCommentConfig;

    @NonNull
    @ProtobufIndex(index = 52)
    public BSuggestedTabAnimation suggestedTabAnimation;

    @NonNull
    @ProtobufIndex(index = 44)
    public BLiveSwipeCardUnlimit swipeCardUnlimit;

    @Nullable
    @ProtobufIndex(index = 63)
    public BLiveSwipeLiveCardConfig swipeLiveCardConfig;

    @NonNull
    @ProtobufIndex(index = 17)
    public BLiveTeenMode teenMode;

    @NonNull
    @ProtobufIndex(index = 54)
    public BLiveStartBtnConfig toStartLiveConfig;

    @Nullable
    @ProtobufIndex(index = 26)
    public BLiveUnreadType unreadType;

    @NonNull
    @ProtobufIndex(index = 65)
    public BLiveUserStatusInfo userStatusInfo;

    @NonNull
    @ProtobufIndex(index = 46)
    public BVerificationConfig verificationConfig;

    @NonNull
    @ProtobufIndex(index = 18)
    public BLiveVideoQuality videoQuality;

    @Nullable
    @ProtobufIndex(index = 39)
    public Long vipReportGrade;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m68941a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m68942b(String str) {
        return str;
    }

    public static BLiveConfig new_() {
        BLiveConfig bLiveConfig = new BLiveConfig();
        bLiveConfig.nullCheck();
        return bLiveConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveConfig mo225055clone() {
        BLiveConfig bLiveConfig = new BLiveConfig();
        bLiveConfig.memberListMax = this.memberListMax;
        BLiveLicense bLiveLicense = this.license;
        if (bLiveLicense != null) {
            bLiveConfig.license = bLiveLicense.mo225055clone();
        }
        bLiveConfig.pushMaxTimes = this.pushMaxTimes;
        bLiveConfig.liveSquareRefreshStateInterval = this.liveSquareRefreshStateInterval;
        bLiveConfig.liveSquareRefreshListInterval = this.liveSquareRefreshListInterval;
        BLiveSmallWindow bLiveSmallWindow = this.smallWindow;
        if (bLiveSmallWindow != null) {
            bLiveConfig.smallWindow = bLiveSmallWindow.mo225055clone();
        }
        BLiveFollowGuide bLiveFollowGuide = this.followGuide;
        if (bLiveFollowGuide != null) {
            bLiveConfig.followGuide = bLiveFollowGuide.mo225055clone();
        }
        List<Integer> list = this.managerRights;
        if (list != null) {
            bLiveConfig.managerRights = ValueObject.util_map(list, new qcj() { // from class: l.vs1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveConfig.m68941a((Integer) obj);
                }
            });
        }
        BLiveFollowSetting bLiveFollowSetting = this.followSetting;
        if (bLiveFollowSetting != null) {
            bLiveConfig.followSetting = bLiveFollowSetting.mo225055clone();
        }
        bLiveConfig.showMomentLikesAndComments = this.showMomentLikesAndComments;
        bLiveConfig.roomManagerCountMax = this.roomManagerCountMax;
        BLiveUserLevelSwitch bLiveUserLevelSwitch = this.liveHierarchy;
        if (bLiveUserLevelSwitch != null) {
            bLiveConfig.liveHierarchy = bLiveUserLevelSwitch.mo225055clone();
        }
        bLiveConfig.reportFeedback = this.reportFeedback;
        bLiveConfig.recallFansLimitToast = this.recallFansLimitToast;
        bLiveConfig.isMagicGestureOpened = this.isMagicGestureOpened;
        bLiveConfig.cardOnLiveText = this.cardOnLiveText;
        BLiveTeenMode bLiveTeenMode = this.teenMode;
        if (bLiveTeenMode != null) {
            bLiveConfig.teenMode = bLiveTeenMode.mo225055clone();
        }
        BLiveVideoQuality bLiveVideoQuality = this.videoQuality;
        if (bLiveVideoQuality != null) {
            bLiveConfig.videoQuality = bLiveVideoQuality.mo225055clone();
        }
        BLiveBreakingLeaderboardConfig bLiveBreakingLeaderboardConfig = this.liveBreakingLeaderboardConfig;
        if (bLiveBreakingLeaderboardConfig != null) {
            bLiveConfig.liveBreakingLeaderboardConfig = bLiveBreakingLeaderboardConfig.mo225055clone();
        }
        BLiveSquareConfig bLiveSquareConfig = this.square;
        if (bLiveSquareConfig != null) {
            bLiveConfig.square = bLiveSquareConfig.mo225055clone();
        }
        BLiveChatConfig bLiveChatConfig = this.chat;
        if (bLiveChatConfig != null) {
            bLiveConfig.chat = bLiveChatConfig.mo225055clone();
        }
        BLivePushStreamConfig bLivePushStreamConfig = this.pushStreamConfig;
        if (bLivePushStreamConfig != null) {
            bLiveConfig.pushStreamConfig = bLivePushStreamConfig.mo225055clone();
        }
        BLiveDiscover bLiveDiscover = this.discover;
        if (bLiveDiscover != null) {
            bLiveConfig.discover = bLiveDiscover.mo225055clone();
        }
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance = this.inRoomSideBarEntrance;
        if (bLiveInRoomSideBarEntrance != null) {
            bLiveConfig.inRoomSideBarEntrance = bLiveInRoomSideBarEntrance.mo225055clone();
        }
        BLiveDiscover bLiveDiscover2 = this.liveTab;
        if (bLiveDiscover2 != null) {
            bLiveConfig.liveTab = bLiveDiscover2.mo225055clone();
        }
        BLiveUnreadType bLiveUnreadType = this.unreadType;
        if (bLiveUnreadType != null) {
            bLiveConfig.unreadType = bLiveUnreadType.mo225055clone();
        }
        BLiveActivitySummaryRegularUnread bLiveActivitySummaryRegularUnread = this.activitySummaryRegularUnread;
        if (bLiveActivitySummaryRegularUnread != null) {
            bLiveConfig.activitySummaryRegularUnread = bLiveActivitySummaryRegularUnread.mo225055clone();
        }
        BLiveScrollGuide bLiveScrollGuide = this.roomSlide;
        if (bLiveScrollGuide != null) {
            bLiveConfig.roomSlide = bLiveScrollGuide.mo225055clone();
        }
        BLiveFollowRateConfigV2 bLiveFollowRateConfigV2 = this.followRateConfigV2;
        if (bLiveFollowRateConfigV2 != null) {
            bLiveConfig.followRateConfigV2 = bLiveFollowRateConfigV2.mo225055clone();
        }
        bLiveConfig.msgSameLocationLimit = this.msgSameLocationLimit;
        BLiveNotifyFollowers bLiveNotifyFollowers = this.notifyFollowers;
        if (bLiveNotifyFollowers != null) {
            bLiveConfig.notifyFollowers = bLiveNotifyFollowers.mo225055clone();
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = this.anchorsSearch;
        if (bLiveCommonViewConfig != null) {
            bLiveConfig.anchorsSearch = bLiveCommonViewConfig.mo225055clone();
        }
        BLivePkSetting bLivePkSetting = this.f45200pk;
        if (bLivePkSetting != null) {
            bLiveConfig.f45200pk = bLivePkSetting.mo225055clone();
        }
        BLiveFakeAlert bLiveFakeAlert = this.fakeAlert;
        if (bLiveFakeAlert != null) {
            bLiveConfig.fakeAlert = bLiveFakeAlert.mo225055clone();
        }
        BLiveFanBaseSetting bLiveFanBaseSetting = this.fanbase;
        if (bLiveFanBaseSetting != null) {
            bLiveConfig.fanbase = bLiveFanBaseSetting.mo225055clone();
        }
        BLiveCallSetting bLiveCallSetting = this.call;
        if (bLiveCallSetting != null) {
            bLiveConfig.call = bLiveCallSetting.mo225055clone();
        }
        BLiveEnterRoomConfig bLiveEnterRoomConfig = this.enterRoomEffect;
        if (bLiveEnterRoomConfig != null) {
            bLiveConfig.enterRoomEffect = bLiveEnterRoomConfig.mo225055clone();
        }
        BLiveGiftConfig bLiveGiftConfig = this.giftConfig;
        if (bLiveGiftConfig != null) {
            bLiveConfig.giftConfig = bLiveGiftConfig.mo225055clone();
        }
        bLiveConfig.vipReportGrade = this.vipReportGrade;
        BLiveGuardConfig bLiveGuardConfig = this.guardConfig;
        if (bLiveGuardConfig != null) {
            bLiveConfig.guardConfig = bLiveGuardConfig.mo225055clone();
        }
        BLiveStealthPrivilege bLiveStealthPrivilege = this.stealthPrivilege;
        if (bLiveStealthPrivilege != null) {
            bLiveConfig.stealthPrivilege = bLiveStealthPrivilege.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig = this.bulletCommentConfig;
        if (bLiveCommonConfig != null) {
            bLiveConfig.bulletCommentConfig = bLiveCommonConfig.mo225055clone();
        }
        BLiveProfileConfig bLiveProfileConfig = this.profileConfig;
        if (bLiveProfileConfig != null) {
            bLiveConfig.profileConfig = bLiveProfileConfig.mo225055clone();
        }
        BLiveSwipeCardUnlimit bLiveSwipeCardUnlimit = this.swipeCardUnlimit;
        if (bLiveSwipeCardUnlimit != null) {
            bLiveConfig.swipeCardUnlimit = bLiveSwipeCardUnlimit.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig2 = this.signInConfig;
        if (bLiveCommonConfig2 != null) {
            bLiveConfig.signInConfig = bLiveCommonConfig2.mo225055clone();
        }
        BVerificationConfig bVerificationConfig = this.verificationConfig;
        if (bVerificationConfig != null) {
            bLiveConfig.verificationConfig = bVerificationConfig.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig3 = this.stormCommentConfig;
        if (bLiveCommonConfig3 != null) {
            bLiveConfig.stormCommentConfig = bLiveCommonConfig3.mo225055clone();
        }
        BLiveMultiCallConfig bLiveMultiCallConfig = this.multiCallConfig;
        if (bLiveMultiCallConfig != null) {
            bLiveConfig.multiCallConfig = bLiveMultiCallConfig.mo225055clone();
        }
        bLiveConfig.activityOngoingAdditionCount = this.activityOngoingAdditionCount;
        BLiveCommonConfig bLiveCommonConfig4 = this.obsLive;
        if (bLiveCommonConfig4 != null) {
            bLiveConfig.obsLive = bLiveCommonConfig4.mo225055clone();
        }
        BSuggestedTabAnimation bSuggestedTabAnimation = this.suggestedTabAnimation;
        if (bSuggestedTabAnimation != null) {
            bLiveConfig.suggestedTabAnimation = bSuggestedTabAnimation.mo225055clone();
        }
        BQuitLiveStayConfig bQuitLiveStayConfig = this.quitLiveStayConfig;
        if (bQuitLiveStayConfig != null) {
            bLiveConfig.quitLiveStayConfig = bQuitLiveStayConfig.mo225055clone();
        }
        bLiveConfig.showDebugInfo = this.showDebugInfo;
        BLiveStartBtnConfig bLiveStartBtnConfig = this.toStartLiveConfig;
        if (bLiveStartBtnConfig != null) {
            bLiveConfig.toStartLiveConfig = bLiveStartBtnConfig.mo225055clone();
        }
        bLiveConfig.enableFriendsLiveStartEntrance = this.enableFriendsLiveStartEntrance;
        BLiveCommonConfig bLiveCommonConfig5 = this.roomAnnouncement;
        if (bLiveCommonConfig5 != null) {
            bLiveConfig.roomAnnouncement = bLiveCommonConfig5.mo225055clone();
        }
        List<String> list2 = this.inAppPushHideConfig;
        if (list2 != null) {
            bLiveConfig.inAppPushHideConfig = ValueObject.util_map(list2, new qcj() { // from class: l.ws1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveConfig.m68942b((String) obj);
                }
            });
        }
        BLiveBlackListConfig bLiveBlackListConfig = this.blackListConfig;
        if (bLiveBlackListConfig != null) {
            bLiveConfig.blackListConfig = bLiveBlackListConfig.mo225055clone();
        }
        bLiveConfig.entertainmentTabText = this.entertainmentTabText;
        BLiveNobleConfig bLiveNobleConfig = this.nobleConfig;
        if (bLiveNobleConfig != null) {
            bLiveConfig.nobleConfig = bLiveNobleConfig.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig6 = this.leaderboardCollection;
        if (bLiveCommonConfig6 != null) {
            bLiveConfig.leaderboardCollection = bLiveCommonConfig6.mo225055clone();
        }
        BLivePullStreamConfig bLivePullStreamConfig = this.pullStreamConfig;
        if (bLivePullStreamConfig != null) {
            bLiveConfig.pullStreamConfig = bLivePullStreamConfig.mo225055clone();
        }
        BLiveSwipeLiveCardConfig bLiveSwipeLiveCardConfig = this.swipeLiveCardConfig;
        if (bLiveSwipeLiveCardConfig != null) {
            bLiveConfig.swipeLiveCardConfig = bLiveSwipeLiveCardConfig.mo225055clone();
        }
        BLiveLeaderBoardConfig bLiveLeaderBoardConfig = this.liveLeaderboardConfig;
        if (bLiveLeaderBoardConfig != null) {
            bLiveConfig.liveLeaderboardConfig = bLiveLeaderBoardConfig.mo225055clone();
        }
        BLiveUserStatusInfo bLiveUserStatusInfo = this.userStatusInfo;
        if (bLiveUserStatusInfo != null) {
            bLiveConfig.userStatusInfo = bLiveUserStatusInfo.mo225055clone();
        }
        BLiveIntlFeedbackConfig bLiveIntlFeedbackConfig = this.intlFeedbackConfig;
        if (bLiveIntlFeedbackConfig != null) {
            bLiveConfig.intlFeedbackConfig = bLiveIntlFeedbackConfig.mo225055clone();
        }
        BLiveStreamEventConfig bLiveStreamEventConfig = this.liveStreamEventConfig;
        if (bLiveStreamEventConfig != null) {
            bLiveConfig.liveStreamEventConfig = bLiveStreamEventConfig.mo225055clone();
        }
        bLiveConfig.hideLiveTab = this.hideLiveTab;
        return bLiveConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveConfig)) {
            return false;
        }
        BLiveConfig bLiveConfig = (BLiveConfig) obj;
        return this.memberListMax == bLiveConfig.memberListMax && ValueObject.util_equals(this.license, bLiveConfig.license) && this.pushMaxTimes == bLiveConfig.pushMaxTimes && this.liveSquareRefreshStateInterval == bLiveConfig.liveSquareRefreshStateInterval && this.liveSquareRefreshListInterval == bLiveConfig.liveSquareRefreshListInterval && ValueObject.util_equals(this.smallWindow, bLiveConfig.smallWindow) && ValueObject.util_equals(this.followGuide, bLiveConfig.followGuide) && ValueObject.util_equals(this.managerRights, bLiveConfig.managerRights) && ValueObject.util_equals(this.followSetting, bLiveConfig.followSetting) && this.showMomentLikesAndComments == bLiveConfig.showMomentLikesAndComments && this.roomManagerCountMax == bLiveConfig.roomManagerCountMax && ValueObject.util_equals(this.liveHierarchy, bLiveConfig.liveHierarchy) && ValueObject.util_equals(this.reportFeedback, bLiveConfig.reportFeedback) && ValueObject.util_equals(this.recallFansLimitToast, bLiveConfig.recallFansLimitToast) && this.isMagicGestureOpened == bLiveConfig.isMagicGestureOpened && ValueObject.util_equals(this.cardOnLiveText, bLiveConfig.cardOnLiveText) && ValueObject.util_equals(this.teenMode, bLiveConfig.teenMode) && ValueObject.util_equals(this.videoQuality, bLiveConfig.videoQuality) && ValueObject.util_equals(this.liveBreakingLeaderboardConfig, bLiveConfig.liveBreakingLeaderboardConfig) && ValueObject.util_equals(this.square, bLiveConfig.square) && ValueObject.util_equals(this.chat, bLiveConfig.chat) && ValueObject.util_equals(this.pushStreamConfig, bLiveConfig.pushStreamConfig) && ValueObject.util_equals(this.discover, bLiveConfig.discover) && ValueObject.util_equals(this.inRoomSideBarEntrance, bLiveConfig.inRoomSideBarEntrance) && ValueObject.util_equals(this.liveTab, bLiveConfig.liveTab) && ValueObject.util_equals(this.unreadType, bLiveConfig.unreadType) && ValueObject.util_equals(this.activitySummaryRegularUnread, bLiveConfig.activitySummaryRegularUnread) && ValueObject.util_equals(this.roomSlide, bLiveConfig.roomSlide) && ValueObject.util_equals(this.followRateConfigV2, bLiveConfig.followRateConfigV2) && this.msgSameLocationLimit == bLiveConfig.msgSameLocationLimit && ValueObject.util_equals(this.notifyFollowers, bLiveConfig.notifyFollowers) && ValueObject.util_equals(this.anchorsSearch, bLiveConfig.anchorsSearch) && ValueObject.util_equals(this.f45200pk, bLiveConfig.f45200pk) && ValueObject.util_equals(this.fakeAlert, bLiveConfig.fakeAlert) && ValueObject.util_equals(this.fanbase, bLiveConfig.fanbase) && ValueObject.util_equals(this.call, bLiveConfig.call) && ValueObject.util_equals(this.enterRoomEffect, bLiveConfig.enterRoomEffect) && ValueObject.util_equals(this.giftConfig, bLiveConfig.giftConfig) && ValueObject.util_equals(this.vipReportGrade, bLiveConfig.vipReportGrade) && ValueObject.util_equals(this.guardConfig, bLiveConfig.guardConfig) && ValueObject.util_equals(this.stealthPrivilege, bLiveConfig.stealthPrivilege) && ValueObject.util_equals(this.bulletCommentConfig, bLiveConfig.bulletCommentConfig) && ValueObject.util_equals(this.profileConfig, bLiveConfig.profileConfig) && ValueObject.util_equals(this.swipeCardUnlimit, bLiveConfig.swipeCardUnlimit) && ValueObject.util_equals(this.signInConfig, bLiveConfig.signInConfig) && ValueObject.util_equals(this.verificationConfig, bLiveConfig.verificationConfig) && ValueObject.util_equals(this.stormCommentConfig, bLiveConfig.stormCommentConfig) && ValueObject.util_equals(this.multiCallConfig, bLiveConfig.multiCallConfig) && this.activityOngoingAdditionCount == bLiveConfig.activityOngoingAdditionCount && ValueObject.util_equals(this.obsLive, bLiveConfig.obsLive) && ValueObject.util_equals(this.suggestedTabAnimation, bLiveConfig.suggestedTabAnimation) && ValueObject.util_equals(this.quitLiveStayConfig, bLiveConfig.quitLiveStayConfig) && this.showDebugInfo == bLiveConfig.showDebugInfo && ValueObject.util_equals(this.toStartLiveConfig, bLiveConfig.toStartLiveConfig) && this.enableFriendsLiveStartEntrance == bLiveConfig.enableFriendsLiveStartEntrance && ValueObject.util_equals(this.roomAnnouncement, bLiveConfig.roomAnnouncement) && ValueObject.util_equals(this.inAppPushHideConfig, bLiveConfig.inAppPushHideConfig) && ValueObject.util_equals(this.blackListConfig, bLiveConfig.blackListConfig) && ValueObject.util_equals(this.entertainmentTabText, bLiveConfig.entertainmentTabText) && ValueObject.util_equals(this.nobleConfig, bLiveConfig.nobleConfig) && ValueObject.util_equals(this.leaderboardCollection, bLiveConfig.leaderboardCollection) && ValueObject.util_equals(this.pullStreamConfig, bLiveConfig.pullStreamConfig) && ValueObject.util_equals(this.swipeLiveCardConfig, bLiveConfig.swipeLiveCardConfig) && ValueObject.util_equals(this.liveLeaderboardConfig, bLiveConfig.liveLeaderboardConfig) && ValueObject.util_equals(this.userStatusInfo, bLiveConfig.userStatusInfo) && ValueObject.util_equals(this.intlFeedbackConfig, bLiveConfig.intlFeedbackConfig) && ValueObject.util_equals(this.liveStreamEventConfig, bLiveConfig.liveStreamEventConfig) && this.hideLiveTab == bLiveConfig.hideLiveTab;
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
        int i2 = ((i * 41) + this.memberListMax) * 41;
        BLiveLicense bLiveLicense = this.license;
        int iHashCode = (((((((i2 + (bLiveLicense != null ? bLiveLicense.hashCode() : 0)) * 41) + this.pushMaxTimes) * 41) + this.liveSquareRefreshStateInterval) * 41) + this.liveSquareRefreshListInterval) * 41;
        BLiveSmallWindow bLiveSmallWindow = this.smallWindow;
        int iHashCode2 = (iHashCode + (bLiveSmallWindow != null ? bLiveSmallWindow.hashCode() : 0)) * 41;
        BLiveFollowGuide bLiveFollowGuide = this.followGuide;
        int iHashCode3 = (iHashCode2 + (bLiveFollowGuide != null ? bLiveFollowGuide.hashCode() : 0)) * 41;
        List<Integer> list = this.managerRights;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveFollowSetting bLiveFollowSetting = this.followSetting;
        int iHashCode5 = (((((iHashCode4 + (bLiveFollowSetting != null ? bLiveFollowSetting.hashCode() : 0)) * 41) + (this.showMomentLikesAndComments ? 1231 : 1237)) * 41) + this.roomManagerCountMax) * 41;
        BLiveUserLevelSwitch bLiveUserLevelSwitch = this.liveHierarchy;
        int iHashCode6 = (iHashCode5 + (bLiveUserLevelSwitch != null ? bLiveUserLevelSwitch.hashCode() : 0)) * 41;
        String str = this.reportFeedback;
        int iHashCode7 = (iHashCode6 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.recallFansLimitToast;
        int iHashCode8 = (((iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isMagicGestureOpened ? 1231 : 1237)) * 41;
        String str3 = this.cardOnLiveText;
        int iHashCode9 = (iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveTeenMode bLiveTeenMode = this.teenMode;
        int iHashCode10 = (iHashCode9 + (bLiveTeenMode != null ? bLiveTeenMode.hashCode() : 0)) * 41;
        BLiveVideoQuality bLiveVideoQuality = this.videoQuality;
        int iHashCode11 = (iHashCode10 + (bLiveVideoQuality != null ? bLiveVideoQuality.hashCode() : 0)) * 41;
        BLiveBreakingLeaderboardConfig bLiveBreakingLeaderboardConfig = this.liveBreakingLeaderboardConfig;
        int iHashCode12 = (iHashCode11 + (bLiveBreakingLeaderboardConfig != null ? bLiveBreakingLeaderboardConfig.hashCode() : 0)) * 41;
        BLiveSquareConfig bLiveSquareConfig = this.square;
        int iHashCode13 = (iHashCode12 + (bLiveSquareConfig != null ? bLiveSquareConfig.hashCode() : 0)) * 41;
        BLiveChatConfig bLiveChatConfig = this.chat;
        int iHashCode14 = (iHashCode13 + (bLiveChatConfig != null ? bLiveChatConfig.hashCode() : 0)) * 41;
        BLivePushStreamConfig bLivePushStreamConfig = this.pushStreamConfig;
        int iHashCode15 = (iHashCode14 + (bLivePushStreamConfig != null ? bLivePushStreamConfig.hashCode() : 0)) * 41;
        BLiveDiscover bLiveDiscover = this.discover;
        int iHashCode16 = (iHashCode15 + (bLiveDiscover != null ? bLiveDiscover.hashCode() : 0)) * 41;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance = this.inRoomSideBarEntrance;
        int iHashCode17 = (iHashCode16 + (bLiveInRoomSideBarEntrance != null ? bLiveInRoomSideBarEntrance.hashCode() : 0)) * 41;
        BLiveDiscover bLiveDiscover2 = this.liveTab;
        int iHashCode18 = (iHashCode17 + (bLiveDiscover2 != null ? bLiveDiscover2.hashCode() : 0)) * 41;
        BLiveUnreadType bLiveUnreadType = this.unreadType;
        int iHashCode19 = (iHashCode18 + (bLiveUnreadType != null ? bLiveUnreadType.hashCode() : 0)) * 41;
        BLiveActivitySummaryRegularUnread bLiveActivitySummaryRegularUnread = this.activitySummaryRegularUnread;
        int iHashCode20 = (iHashCode19 + (bLiveActivitySummaryRegularUnread != null ? bLiveActivitySummaryRegularUnread.hashCode() : 0)) * 41;
        BLiveScrollGuide bLiveScrollGuide = this.roomSlide;
        int iHashCode21 = (iHashCode20 + (bLiveScrollGuide != null ? bLiveScrollGuide.hashCode() : 0)) * 41;
        BLiveFollowRateConfigV2 bLiveFollowRateConfigV2 = this.followRateConfigV2;
        int iHashCode22 = (((iHashCode21 + (bLiveFollowRateConfigV2 != null ? bLiveFollowRateConfigV2.hashCode() : 0)) * 41) + this.msgSameLocationLimit) * 41;
        BLiveNotifyFollowers bLiveNotifyFollowers = this.notifyFollowers;
        int iHashCode23 = (iHashCode22 + (bLiveNotifyFollowers != null ? bLiveNotifyFollowers.hashCode() : 0)) * 41;
        BLiveCommonViewConfig bLiveCommonViewConfig = this.anchorsSearch;
        int iHashCode24 = (iHashCode23 + (bLiveCommonViewConfig != null ? bLiveCommonViewConfig.hashCode() : 0)) * 41;
        BLivePkSetting bLivePkSetting = this.f45200pk;
        int iHashCode25 = (iHashCode24 + (bLivePkSetting != null ? bLivePkSetting.hashCode() : 0)) * 41;
        BLiveFakeAlert bLiveFakeAlert = this.fakeAlert;
        int iHashCode26 = (iHashCode25 + (bLiveFakeAlert != null ? bLiveFakeAlert.hashCode() : 0)) * 41;
        BLiveFanBaseSetting bLiveFanBaseSetting = this.fanbase;
        int iHashCode27 = (iHashCode26 + (bLiveFanBaseSetting != null ? bLiveFanBaseSetting.hashCode() : 0)) * 41;
        BLiveCallSetting bLiveCallSetting = this.call;
        int iHashCode28 = (iHashCode27 + (bLiveCallSetting != null ? bLiveCallSetting.hashCode() : 0)) * 41;
        BLiveEnterRoomConfig bLiveEnterRoomConfig = this.enterRoomEffect;
        int iHashCode29 = (iHashCode28 + (bLiveEnterRoomConfig != null ? bLiveEnterRoomConfig.hashCode() : 0)) * 41;
        BLiveGiftConfig bLiveGiftConfig = this.giftConfig;
        int iHashCode30 = (iHashCode29 + (bLiveGiftConfig != null ? bLiveGiftConfig.hashCode() : 0)) * 41;
        Long l2 = this.vipReportGrade;
        int iHashCode31 = (iHashCode30 + (l2 != null ? l2.hashCode() : 0)) * 41;
        BLiveGuardConfig bLiveGuardConfig = this.guardConfig;
        int iHashCode32 = (iHashCode31 + (bLiveGuardConfig != null ? bLiveGuardConfig.hashCode() : 0)) * 41;
        BLiveStealthPrivilege bLiveStealthPrivilege = this.stealthPrivilege;
        int iHashCode33 = (iHashCode32 + (bLiveStealthPrivilege != null ? bLiveStealthPrivilege.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig = this.bulletCommentConfig;
        int iHashCode34 = (iHashCode33 + (bLiveCommonConfig != null ? bLiveCommonConfig.hashCode() : 0)) * 41;
        BLiveProfileConfig bLiveProfileConfig = this.profileConfig;
        int iHashCode35 = (iHashCode34 + (bLiveProfileConfig != null ? bLiveProfileConfig.hashCode() : 0)) * 41;
        BLiveSwipeCardUnlimit bLiveSwipeCardUnlimit = this.swipeCardUnlimit;
        int iHashCode36 = (iHashCode35 + (bLiveSwipeCardUnlimit != null ? bLiveSwipeCardUnlimit.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig2 = this.signInConfig;
        int iHashCode37 = (iHashCode36 + (bLiveCommonConfig2 != null ? bLiveCommonConfig2.hashCode() : 0)) * 41;
        BVerificationConfig bVerificationConfig = this.verificationConfig;
        int iHashCode38 = (iHashCode37 + (bVerificationConfig != null ? bVerificationConfig.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig3 = this.stormCommentConfig;
        int iHashCode39 = (iHashCode38 + (bLiveCommonConfig3 != null ? bLiveCommonConfig3.hashCode() : 0)) * 41;
        BLiveMultiCallConfig bLiveMultiCallConfig = this.multiCallConfig;
        int iHashCode40 = (((iHashCode39 + (bLiveMultiCallConfig != null ? bLiveMultiCallConfig.hashCode() : 0)) * 41) + this.activityOngoingAdditionCount) * 41;
        BLiveCommonConfig bLiveCommonConfig4 = this.obsLive;
        int iHashCode41 = (iHashCode40 + (bLiveCommonConfig4 != null ? bLiveCommonConfig4.hashCode() : 0)) * 41;
        BSuggestedTabAnimation bSuggestedTabAnimation = this.suggestedTabAnimation;
        int iHashCode42 = (iHashCode41 + (bSuggestedTabAnimation != null ? bSuggestedTabAnimation.hashCode() : 0)) * 41;
        BQuitLiveStayConfig bQuitLiveStayConfig = this.quitLiveStayConfig;
        int iHashCode43 = (((iHashCode42 + (bQuitLiveStayConfig != null ? bQuitLiveStayConfig.hashCode() : 0)) * 41) + (this.showDebugInfo ? 1231 : 1237)) * 41;
        BLiveStartBtnConfig bLiveStartBtnConfig = this.toStartLiveConfig;
        int iHashCode44 = (((iHashCode43 + (bLiveStartBtnConfig != null ? bLiveStartBtnConfig.hashCode() : 0)) * 41) + (this.enableFriendsLiveStartEntrance ? 1231 : 1237)) * 41;
        BLiveCommonConfig bLiveCommonConfig5 = this.roomAnnouncement;
        int iHashCode45 = (iHashCode44 + (bLiveCommonConfig5 != null ? bLiveCommonConfig5.hashCode() : 0)) * 41;
        List<String> list2 = this.inAppPushHideConfig;
        int iHashCode46 = (iHashCode45 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveBlackListConfig bLiveBlackListConfig = this.blackListConfig;
        int iHashCode47 = (iHashCode46 + (bLiveBlackListConfig != null ? bLiveBlackListConfig.hashCode() : 0)) * 41;
        String str4 = this.entertainmentTabText;
        int iHashCode48 = (iHashCode47 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveNobleConfig bLiveNobleConfig = this.nobleConfig;
        int iHashCode49 = (iHashCode48 + (bLiveNobleConfig != null ? bLiveNobleConfig.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig6 = this.leaderboardCollection;
        int iHashCode50 = (iHashCode49 + (bLiveCommonConfig6 != null ? bLiveCommonConfig6.hashCode() : 0)) * 41;
        BLivePullStreamConfig bLivePullStreamConfig = this.pullStreamConfig;
        int iHashCode51 = (iHashCode50 + (bLivePullStreamConfig != null ? bLivePullStreamConfig.hashCode() : 0)) * 41;
        BLiveSwipeLiveCardConfig bLiveSwipeLiveCardConfig = this.swipeLiveCardConfig;
        int iHashCode52 = (iHashCode51 + (bLiveSwipeLiveCardConfig != null ? bLiveSwipeLiveCardConfig.hashCode() : 0)) * 41;
        BLiveLeaderBoardConfig bLiveLeaderBoardConfig = this.liveLeaderboardConfig;
        int iHashCode53 = (iHashCode52 + (bLiveLeaderBoardConfig != null ? bLiveLeaderBoardConfig.hashCode() : 0)) * 41;
        BLiveUserStatusInfo bLiveUserStatusInfo = this.userStatusInfo;
        int iHashCode54 = (iHashCode53 + (bLiveUserStatusInfo != null ? bLiveUserStatusInfo.hashCode() : 0)) * 41;
        BLiveIntlFeedbackConfig bLiveIntlFeedbackConfig = this.intlFeedbackConfig;
        int iHashCode55 = (iHashCode54 + (bLiveIntlFeedbackConfig != null ? bLiveIntlFeedbackConfig.hashCode() : 0)) * 41;
        BLiveStreamEventConfig bLiveStreamEventConfig = this.liveStreamEventConfig;
        int iHashCode56 = ((iHashCode55 + (bLiveStreamEventConfig != null ? bLiveStreamEventConfig.hashCode() : 0)) * 41) + (this.hideLiveTab ? 1231 : 1237);
        this.hashCode = iHashCode56;
        return iHashCode56;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.license == null) {
            this.license = BLiveLicense.new_();
        }
        if (this.smallWindow == null) {
            this.smallWindow = BLiveSmallWindow.new_();
        }
        if (this.followGuide == null) {
            this.followGuide = BLiveFollowGuide.new_();
        }
        if (this.managerRights == null) {
            this.managerRights = new ArrayList();
        }
        if (this.liveHierarchy == null) {
            this.liveHierarchy = BLiveUserLevelSwitch.new_();
        }
        if (this.reportFeedback == null) {
            this.reportFeedback = "";
        }
        if (this.recallFansLimitToast == null) {
            this.recallFansLimitToast = "";
        }
        if (this.cardOnLiveText == null) {
            this.cardOnLiveText = "";
        }
        if (this.teenMode == null) {
            this.teenMode = BLiveTeenMode.new_();
        }
        if (this.videoQuality == null) {
            this.videoQuality = BLiveVideoQuality.new_();
        }
        if (this.liveBreakingLeaderboardConfig == null) {
            this.liveBreakingLeaderboardConfig = BLiveBreakingLeaderboardConfig.new_();
        }
        if (this.square == null) {
            this.square = BLiveSquareConfig.new_();
        }
        if (this.chat == null) {
            this.chat = BLiveChatConfig.new_();
        }
        if (this.pushStreamConfig == null) {
            this.pushStreamConfig = BLivePushStreamConfig.new_();
        }
        if (this.discover == null) {
            this.discover = BLiveDiscover.new_();
        }
        if (this.inRoomSideBarEntrance == null) {
            this.inRoomSideBarEntrance = BLiveInRoomSideBarEntrance.new_();
        }
        if (this.liveTab == null) {
            this.liveTab = BLiveDiscover.new_();
        }
        if (this.roomSlide == null) {
            this.roomSlide = BLiveScrollGuide.new_();
        }
        if (this.followRateConfigV2 == null) {
            this.followRateConfigV2 = BLiveFollowRateConfigV2.new_();
        }
        if (this.notifyFollowers == null) {
            this.notifyFollowers = BLiveNotifyFollowers.new_();
        }
        if (this.f45200pk == null) {
            this.f45200pk = BLivePkSetting.new_();
        }
        if (this.call == null) {
            this.call = BLiveCallSetting.new_();
        }
        if (this.stealthPrivilege == null) {
            this.stealthPrivilege = BLiveStealthPrivilege.new_();
        }
        if (this.swipeCardUnlimit == null) {
            this.swipeCardUnlimit = BLiveSwipeCardUnlimit.new_();
        }
        if (this.signInConfig == null) {
            this.signInConfig = BLiveCommonConfig.new_();
        }
        if (this.verificationConfig == null) {
            this.verificationConfig = BVerificationConfig.new_();
        }
        if (this.obsLive == null) {
            this.obsLive = BLiveCommonConfig.new_();
        }
        if (this.suggestedTabAnimation == null) {
            this.suggestedTabAnimation = BSuggestedTabAnimation.new_();
        }
        if (this.quitLiveStayConfig == null) {
            this.quitLiveStayConfig = BQuitLiveStayConfig.new_();
        }
        if (this.toStartLiveConfig == null) {
            this.toStartLiveConfig = BLiveStartBtnConfig.new_();
        }
        if (this.roomAnnouncement == null) {
            this.roomAnnouncement = BLiveCommonConfig.new_();
        }
        if (this.inAppPushHideConfig == null) {
            this.inAppPushHideConfig = new ArrayList();
        }
        if (this.blackListConfig == null) {
            this.blackListConfig = BLiveBlackListConfig.new_();
        }
        if (this.entertainmentTabText == null) {
            this.entertainmentTabText = "";
        }
        if (this.leaderboardCollection == null) {
            this.leaderboardCollection = BLiveCommonConfig.new_();
        }
        if (this.pullStreamConfig == null) {
            this.pullStreamConfig = BLivePullStreamConfig.new_();
        }
        if (this.liveLeaderboardConfig == null) {
            this.liveLeaderboardConfig = BLiveLeaderBoardConfig.new_();
        }
        if (this.userStatusInfo == null) {
            this.userStatusInfo = BLiveUserStatusInfo.new_();
        }
        if (this.intlFeedbackConfig == null) {
            this.intlFeedbackConfig = BLiveIntlFeedbackConfig.new_();
        }
        if (this.liveStreamEventConfig == null) {
            this.liveStreamEventConfig = BLiveStreamEventConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
