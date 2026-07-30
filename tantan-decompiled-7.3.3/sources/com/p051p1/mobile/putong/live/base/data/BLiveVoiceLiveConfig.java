package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceLiveConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceLiveConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceLiveConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceLiveConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceLiveConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceLiveConfig newInstance() {
            return new BLiveVoiceLiveConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceLiveConfig bLiveVoiceLiveConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2083311638:
                    if (str.equals("reflectAudioProcessSwitch")) {
                        b = 0;
                    }
                    break;
                case -2043887112:
                    if (str.equals("intlVoiceSingGameConfig")) {
                        b = 1;
                    }
                    break;
                case -2042252956:
                    if (str.equals("intlShareConfig")) {
                        b = 2;
                    }
                    break;
                case -1956091649:
                    if (str.equals("roomCardTemplateType")) {
                        b = 3;
                    }
                    break;
                case -1816452468:
                    if (str.equals("showRoomRegion")) {
                        b = 4;
                    }
                    break;
                case -1745763597:
                    if (str.equals("intlEnterRoomOptimize")) {
                        b = 5;
                    }
                    break;
                case -1679095200:
                    if (str.equals("voiceManagerLimit")) {
                        b = 6;
                    }
                    break;
                case -1665058610:
                    if (str.equals("voiceGiftWallConfig")) {
                        b = 7;
                    }
                    break;
                case -1654842701:
                    if (str.equals("feedStyle")) {
                        b = 8;
                    }
                    break;
                case -1636933259:
                    if (str.equals("isOverseaChineseMigrated")) {
                        b = 9;
                    }
                    break;
                case -1558090199:
                    if (str.equals("verificationLevel")) {
                        b = 10;
                    }
                    break;
                case -1508993723:
                    if (str.equals("voiceRecordConfig")) {
                        b = 11;
                    }
                    break;
                case -1488422760:
                    if (str.equals("virtualAvatarSwitch")) {
                        b = 12;
                    }
                    break;
                case -1409887714:
                    if (str.equals("updateChatV3")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1373616388:
                    if (str.equals("startVoiceLive")) {
                        b = 14;
                    }
                    break;
                case -1300013110:
                    if (str.equals("anchorGrowthEntrySwitch")) {
                        b = 15;
                    }
                    break;
                case -1132397629:
                    if (str.equals("chatEntryExp")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -974151830:
                    if (str.equals("voiceLiveActivityMomentShow")) {
                        b = 17;
                    }
                    break;
                case -974124801:
                    if (str.equals("voiceLiveActivityMomentTest")) {
                        b = 18;
                    }
                    break;
                case -763348009:
                    if (str.equals("smallWindow")) {
                        b = 19;
                    }
                    break;
                case -715328906:
                    if (str.equals("defaultTabTopicId")) {
                        b = 20;
                    }
                    break;
                case -690890005:
                    if (str.equals("voiceLeaderboard")) {
                        b = 21;
                    }
                    break;
                case -641923143:
                    if (str.equals("bindChatGroupPermission")) {
                        b = 22;
                    }
                    break;
                case -600246404:
                    if (str.equals("auctionTrickBubble")) {
                        b = 23;
                    }
                    break;
                case -476457822:
                    if (str.equals("voiceLiveHotChatMatchTest2")) {
                        b = 24;
                    }
                    break;
                case -415631002:
                    if (str.equals("chatEntryRefreshInterval")) {
                        b = 25;
                    }
                    break;
                case -398451711:
                    if (str.equals("shareConfig")) {
                        b = 26;
                    }
                    break;
                case -106764654:
                    if (str.equals("roomAdministratorExplainH5")) {
                        b = 27;
                    }
                    break;
                case -65187534:
                    if (str.equals("voiceLiveSparkletReportConfig")) {
                        b = 28;
                    }
                    break;
                case -52018081:
                    if (str.equals("audienceOperateMenu")) {
                        b = 29;
                    }
                    break;
                case -43387257:
                    if (str.equals("showPledgeAuctionNewTag")) {
                        b = 30;
                    }
                    break;
                case -20402713:
                    if (str.equals("voiceActivityShowNumber")) {
                        b = 31;
                    }
                    break;
                case 7320506:
                    if (str.equals("showAnnouncementEntrance")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 124989699:
                    if (str.equals("operateMenu")) {
                        b = 33;
                    }
                    break;
                case 473405187:
                    if (str.equals("intlVoiceBannerConfig")) {
                        b = 34;
                    }
                    break;
                case 485271905:
                    if (str.equals("voiceCpConfig")) {
                        b = 35;
                    }
                    break;
                case 815914384:
                    if (str.equals("voiceLiveHotChatMatchTest")) {
                        b = 36;
                    }
                    break;
                case 1074540607:
                    if (str.equals("shareScreenSwitch")) {
                        b = 37;
                    }
                    break;
                case 1102232392:
                    if (str.equals("memberListRefreshInterval")) {
                        b = 38;
                    }
                    break;
                case 1111152315:
                    if (str.equals("undercoverMinPlayerCount")) {
                        b = 39;
                    }
                    break;
                case 1149940875:
                    if (str.equals("directLeaveRoomMaxStaySeconds")) {
                        b = 40;
                    }
                    break;
                case 1188830133:
                    if (str.equals("isHideCreateRoomButton")) {
                        b = 41;
                    }
                    break;
                case 1340240388:
                    if (str.equals("intlVoiceCpConfig")) {
                        b = 42;
                    }
                    break;
                case 1348631763:
                    if (str.equals("showEntrance")) {
                        b = 43;
                    }
                    break;
                case 1381855839:
                    if (str.equals("quickGiftConfig")) {
                        b = 44;
                    }
                    break;
                case 1677760243:
                    if (str.equals("ownerCreateRoomNotify")) {
                        b = 45;
                    }
                    break;
                case 1729329854:
                    if (str.equals("fixRoomManagerLimit")) {
                        b = 46;
                    }
                    break;
                case 1804190128:
                    if (str.equals("shareScreenRealNameAuthSwitch")) {
                        b = 47;
                    }
                    break;
                case 1913172613:
                    if (str.equals("roomPopRefresh")) {
                        b = 48;
                    }
                    break;
                case 1949973604:
                    if (str.equals("intlFlyMicEffectConfig")) {
                        b = 49;
                    }
                    break;
                case 2113024539:
                    if (str.equals("voiceBottomTabMode")) {
                        b = 50;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceLiveConfig.reflectAudioProcessSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveVoiceLiveConfig.intlVoiceSingGameConfig = BLiveVoiceSingTogetherConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveVoiceLiveConfig.intlShareConfig = BLiveIntlShareCongfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveVoiceLiveConfig.roomCardTemplateType = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoiceLiveConfig.showRoomRegion = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveVoiceLiveConfig.intlEnterRoomOptimize = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    bLiveVoiceLiveConfig.voiceManagerLimit = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    bLiveVoiceLiveConfig.voiceGiftWallConfig = BLiveVoiceGiftWallConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveVoiceLiveConfig.feedStyle = BLiveVoiceFeedStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveVoiceLiveConfig.isOverseaChineseMigrated = jsonParser.getValueAsBoolean();
                    return true;
                case 10:
                    bLiveVoiceLiveConfig.verificationLevel = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoiceLiveConfig.voiceRecordConfig = BLiveVoiceRecordConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveVoiceLiveConfig.virtualAvatarSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case 13:
                    bLiveVoiceLiveConfig.updateChatV3 = jsonParser.getValueAsBoolean();
                    return true;
                case 14:
                    bLiveVoiceLiveConfig.startVoiceLive = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveVoiceLiveConfig.anchorGrowthEntrySwitch = jsonParser.getValueAsBoolean();
                    return true;
                case 16:
                    bLiveVoiceLiveConfig.chatEntryExp = jsonParser.getValueAsBoolean();
                    return true;
                case 17:
                    bLiveVoiceLiveConfig.voiceLiveActivityMomentShow = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveVoiceLiveConfig.voiceLiveActivityMomentTest = jsonParser.getValueAsString();
                    return true;
                case 19:
                    bLiveVoiceLiveConfig.smallWindow = BLiveVoiceSmallWindow.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    bLiveVoiceLiveConfig.defaultTabTopicId = jsonParser.getValueAsString();
                    return true;
                case 21:
                    bLiveVoiceLiveConfig.voiceLeaderboard = BLiveVoiceRankingBoard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveVoiceLiveConfig.bindChatGroupPermission = jsonParser.getValueAsBoolean();
                    return true;
                case 23:
                    bLiveVoiceLiveConfig.auctionTrickBubble = jsonParser.getValueAsString();
                    return true;
                case 24:
                    bLiveVoiceLiveConfig.voiceLiveHotChatMatchTest2 = jsonParser.getValueAsBoolean();
                    return true;
                case 25:
                    bLiveVoiceLiveConfig.chatEntryRefreshInterval = jsonParser.getValueAsInt();
                    return true;
                case 26:
                    bLiveVoiceLiveConfig.shareConfig = BLiveVoiceShareConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    bLiveVoiceLiveConfig.roomAdministratorExplainH5 = jsonParser.getValueAsString();
                    return true;
                case 28:
                    bLiveVoiceLiveConfig.voiceLiveSparkletReportConfig = BLiveVoiceSparkReportConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    bLiveVoiceLiveConfig.audienceOperateMenu = JsonAdapter.parseArray(jsonParser, BLiveCommonViewConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    bLiveVoiceLiveConfig.showPledgeAuctionNewTag = jsonParser.getValueAsBoolean();
                    return true;
                case 31:
                    bLiveVoiceLiveConfig.voiceActivityShowNumber = jsonParser.getValueAsBoolean();
                    return true;
                case 32:
                    bLiveVoiceLiveConfig.showAnnouncementEntrance = jsonParser.getValueAsBoolean();
                    return true;
                case 33:
                    bLiveVoiceLiveConfig.operateMenu = JsonAdapter.parseArray(jsonParser, BLiveCommonViewConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    bLiveVoiceLiveConfig.intlVoiceBannerConfig = BLiveVoiceNewOperationConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 35:
                    bLiveVoiceLiveConfig.voiceCpConfig = BLiveVoiceSweetCpConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 36:
                    bLiveVoiceLiveConfig.voiceLiveHotChatMatchTest = jsonParser.getValueAsBoolean();
                    return true;
                case 37:
                    bLiveVoiceLiveConfig.shareScreenSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case 38:
                    bLiveVoiceLiveConfig.memberListRefreshInterval = jsonParser.getValueAsInt();
                    return true;
                case 39:
                    bLiveVoiceLiveConfig.undercoverMinPlayerCount = jsonParser.getValueAsInt();
                    return true;
                case 40:
                    bLiveVoiceLiveConfig.directLeaveRoomMaxStaySeconds = jsonParser.getValueAsInt();
                    return true;
                case 41:
                    bLiveVoiceLiveConfig.isHideCreateRoomButton = jsonParser.getValueAsBoolean();
                    return true;
                case 42:
                    bLiveVoiceLiveConfig.intlVoiceCpConfig = BLiveVoiceCpConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 43:
                    bLiveVoiceLiveConfig.showEntrance = jsonParser.getValueAsBoolean();
                    return true;
                case 44:
                    bLiveVoiceLiveConfig.quickGiftConfig = BLiveVoiceQuickGiftConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 45:
                    bLiveVoiceLiveConfig.ownerCreateRoomNotify = BLiveVoiceCreateRoomNotify.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 46:
                    bLiveVoiceLiveConfig.fixRoomManagerLimit = jsonParser.getValueAsInt();
                    return true;
                case 47:
                    bLiveVoiceLiveConfig.shareScreenRealNameAuthSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case 48:
                    bLiveVoiceLiveConfig.roomPopRefresh = BLiveVoiceRoomPopRefresh.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 49:
                    bLiveVoiceLiveConfig.intlFlyMicEffectConfig = JsonAdapter.parseArray(jsonParser, BLiveIntlFlyMicEffectConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 50:
                    bLiveVoiceLiveConfig.voiceBottomTabMode = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceLiveConfig bLiveVoiceLiveConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceLiveConfig.startVoiceLive;
            if (str != null) {
                jsonGenerator.writeStringField("startVoiceLive", str);
            }
            if (bLiveVoiceLiveConfig.feedStyle != null) {
                jsonGenerator.writeFieldName("feedStyle");
                BLiveVoiceFeedStyle.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.feedStyle, jsonGenerator, true);
            }
            String str2 = bLiveVoiceLiveConfig.verificationLevel;
            if (str2 != null) {
                jsonGenerator.writeStringField("verificationLevel", str2);
            }
            jsonGenerator.writeBooleanField("voiceActivityShowNumber", bLiveVoiceLiveConfig.voiceActivityShowNumber);
            String str3 = bLiveVoiceLiveConfig.defaultTabTopicId;
            if (str3 != null) {
                jsonGenerator.writeStringField("defaultTabTopicId", str3);
            }
            jsonGenerator.writeNumberField("memberListRefreshInterval", bLiveVoiceLiveConfig.memberListRefreshInterval);
            if (bLiveVoiceLiveConfig.operateMenu != null) {
                jsonGenerator.writeFieldName("operateMenu");
                JsonAdapter.serializeArray(bLiveVoiceLiveConfig.operateMenu, jsonGenerator, BLiveCommonViewConfig.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("voiceBottomTabMode", bLiveVoiceLiveConfig.voiceBottomTabMode);
            if (bLiveVoiceLiveConfig.audienceOperateMenu != null) {
                jsonGenerator.writeFieldName("audienceOperateMenu");
                JsonAdapter.serializeArray(bLiveVoiceLiveConfig.audienceOperateMenu, jsonGenerator, BLiveCommonViewConfig.JSON_ADAPTER);
            }
            if (bLiveVoiceLiveConfig.ownerCreateRoomNotify != null) {
                jsonGenerator.writeFieldName("ownerCreateRoomNotify");
                BLiveVoiceCreateRoomNotify.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.ownerCreateRoomNotify, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showAnnouncementEntrance", bLiveVoiceLiveConfig.showAnnouncementEntrance);
            jsonGenerator.writeBooleanField("bindChatGroupPermission", bLiveVoiceLiveConfig.bindChatGroupPermission);
            jsonGenerator.writeBooleanField("updateChatV3", bLiveVoiceLiveConfig.updateChatV3);
            jsonGenerator.writeNumberField("voiceManagerLimit", bLiveVoiceLiveConfig.voiceManagerLimit);
            jsonGenerator.writeNumberField("undercoverMinPlayerCount", bLiveVoiceLiveConfig.undercoverMinPlayerCount);
            if (bLiveVoiceLiveConfig.voiceLiveSparkletReportConfig != null) {
                jsonGenerator.writeFieldName("voiceLiveSparkletReportConfig");
                BLiveVoiceSparkReportConfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.voiceLiveSparkletReportConfig, jsonGenerator, true);
            }
            if (bLiveVoiceLiveConfig.quickGiftConfig != null) {
                jsonGenerator.writeFieldName("quickGiftConfig");
                BLiveVoiceQuickGiftConfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.quickGiftConfig, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("voiceLiveHotChatMatchTest", bLiveVoiceLiveConfig.voiceLiveHotChatMatchTest);
            if (bLiveVoiceLiveConfig.voiceRecordConfig != null) {
                jsonGenerator.writeFieldName("voiceRecordConfig");
                BLiveVoiceRecordConfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.voiceRecordConfig, jsonGenerator, true);
            }
            String str4 = bLiveVoiceLiveConfig.voiceLiveActivityMomentTest;
            if (str4 != null) {
                jsonGenerator.writeStringField("voiceLiveActivityMomentTest", str4);
            }
            String str5 = bLiveVoiceLiveConfig.voiceLiveActivityMomentShow;
            if (str5 != null) {
                jsonGenerator.writeStringField("voiceLiveActivityMomentShow", str5);
            }
            jsonGenerator.writeBooleanField("voiceLiveHotChatMatchTest2", bLiveVoiceLiveConfig.voiceLiveHotChatMatchTest2);
            if (bLiveVoiceLiveConfig.voiceLeaderboard != null) {
                jsonGenerator.writeFieldName("voiceLeaderboard");
                BLiveVoiceRankingBoard.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.voiceLeaderboard, jsonGenerator, true);
            }
            if (bLiveVoiceLiveConfig.roomPopRefresh != null) {
                jsonGenerator.writeFieldName("roomPopRefresh");
                BLiveVoiceRoomPopRefresh.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.roomPopRefresh, jsonGenerator, true);
            }
            if (bLiveVoiceLiveConfig.voiceCpConfig != null) {
                jsonGenerator.writeFieldName("voiceCpConfig");
                BLiveVoiceSweetCpConfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.voiceCpConfig, jsonGenerator, true);
            }
            String str6 = bLiveVoiceLiveConfig.roomAdministratorExplainH5;
            if (str6 != null) {
                jsonGenerator.writeStringField("roomAdministratorExplainH5", str6);
            }
            jsonGenerator.writeNumberField("chatEntryRefreshInterval", bLiveVoiceLiveConfig.chatEntryRefreshInterval);
            jsonGenerator.writeBooleanField("chatEntryExp", bLiveVoiceLiveConfig.chatEntryExp);
            if (bLiveVoiceLiveConfig.intlVoiceBannerConfig != null) {
                jsonGenerator.writeFieldName("intlVoiceBannerConfig");
                BLiveVoiceNewOperationConfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.intlVoiceBannerConfig, jsonGenerator, true);
            }
            if (bLiveVoiceLiveConfig.voiceGiftWallConfig != null) {
                jsonGenerator.writeFieldName("voiceGiftWallConfig");
                BLiveVoiceGiftWallConfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.voiceGiftWallConfig, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("virtualAvatarSwitch", bLiveVoiceLiveConfig.virtualAvatarSwitch);
            if (bLiveVoiceLiveConfig.smallWindow != null) {
                jsonGenerator.writeFieldName("smallWindow");
                BLiveVoiceSmallWindow.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.smallWindow, jsonGenerator, true);
            }
            if (bLiveVoiceLiveConfig.shareConfig != null) {
                jsonGenerator.writeFieldName("shareConfig");
                BLiveVoiceShareConfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.shareConfig, jsonGenerator, true);
            }
            String str7 = bLiveVoiceLiveConfig.roomCardTemplateType;
            if (str7 != null) {
                jsonGenerator.writeStringField("roomCardTemplateType", str7);
            }
            jsonGenerator.writeBooleanField("showRoomRegion", bLiveVoiceLiveConfig.showRoomRegion);
            if (bLiveVoiceLiveConfig.intlShareConfig != null) {
                jsonGenerator.writeFieldName("intlShareConfig");
                BLiveIntlShareCongfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.intlShareConfig, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("fixRoomManagerLimit", bLiveVoiceLiveConfig.fixRoomManagerLimit);
            if (bLiveVoiceLiveConfig.intlVoiceSingGameConfig != null) {
                jsonGenerator.writeFieldName("intlVoiceSingGameConfig");
                BLiveVoiceSingTogetherConfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.intlVoiceSingGameConfig, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("shareScreenSwitch", bLiveVoiceLiveConfig.shareScreenSwitch);
            jsonGenerator.writeBooleanField("shareScreenRealNameAuthSwitch", bLiveVoiceLiveConfig.shareScreenRealNameAuthSwitch);
            jsonGenerator.writeBooleanField("reflectAudioProcessSwitch", bLiveVoiceLiveConfig.reflectAudioProcessSwitch);
            jsonGenerator.writeNumberField("directLeaveRoomMaxStaySeconds", bLiveVoiceLiveConfig.directLeaveRoomMaxStaySeconds);
            jsonGenerator.writeBooleanField("anchorGrowthEntrySwitch", bLiveVoiceLiveConfig.anchorGrowthEntrySwitch);
            if (bLiveVoiceLiveConfig.intlFlyMicEffectConfig != null) {
                jsonGenerator.writeFieldName("intlFlyMicEffectConfig");
                JsonAdapter.serializeArray(bLiveVoiceLiveConfig.intlFlyMicEffectConfig, jsonGenerator, BLiveIntlFlyMicEffectConfig.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("intlEnterRoomOptimize", bLiveVoiceLiveConfig.intlEnterRoomOptimize);
            if (bLiveVoiceLiveConfig.intlVoiceCpConfig != null) {
                jsonGenerator.writeFieldName("intlVoiceCpConfig");
                BLiveVoiceCpConfig.JSON_ADAPTER.serialize(bLiveVoiceLiveConfig.intlVoiceCpConfig, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showEntrance", bLiveVoiceLiveConfig.showEntrance);
            jsonGenerator.writeBooleanField("isOverseaChineseMigrated", bLiveVoiceLiveConfig.isOverseaChineseMigrated);
            jsonGenerator.writeBooleanField("isHideCreateRoomButton", bLiveVoiceLiveConfig.isHideCreateRoomButton);
            String str8 = bLiveVoiceLiveConfig.auctionTrickBubble;
            if (str8 != null) {
                jsonGenerator.writeStringField("auctionTrickBubble", str8);
            }
            jsonGenerator.writeBooleanField("showPledgeAuctionNewTag", bLiveVoiceLiveConfig.showPledgeAuctionNewTag);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceLiveConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceliveconfig";

    @ProtobufIndex(index = 43)
    public boolean anchorGrowthEntrySwitch;

    @NonNull
    @ProtobufIndex(index = 51)
    public String auctionTrickBubble;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<BLiveCommonViewConfig> audienceOperateMenu;

    @ProtobufIndex(index = 12)
    public boolean bindChatGroupPermission;

    @ProtobufIndex(index = 28)
    public boolean chatEntryExp;

    @ProtobufIndex(index = 27)
    public int chatEntryRefreshInterval;

    @NonNull
    @ProtobufIndex(index = 5)
    public String defaultTabTopicId;

    @ProtobufIndex(index = 42)
    public int directLeaveRoomMaxStaySeconds;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVoiceFeedStyle feedStyle;

    @ProtobufIndex(index = 37)
    public int fixRoomManagerLimit;

    @ProtobufIndex(index = 45)
    public boolean intlEnterRoomOptimize;

    @NonNull
    @ProtobufIndex(index = 44)
    public List<BLiveIntlFlyMicEffectConfig> intlFlyMicEffectConfig;

    @NonNull
    @ProtobufIndex(index = 36)
    public BLiveIntlShareCongfig intlShareConfig;

    @NonNull
    @ProtobufIndex(index = 29)
    public BLiveVoiceNewOperationConfig intlVoiceBannerConfig;

    @NonNull
    @ProtobufIndex(index = 46)
    public BLiveVoiceCpConfig intlVoiceCpConfig;

    @NonNull
    @ProtobufIndex(index = 38)
    public BLiveVoiceSingTogetherConfig intlVoiceSingGameConfig;

    @ProtobufIndex(index = 49)
    public boolean isHideCreateRoomButton;

    @ProtobufIndex(index = 48)
    public boolean isOverseaChineseMigrated;

    @ProtobufIndex(index = 6)
    public int memberListRefreshInterval;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveCommonViewConfig> operateMenu;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveVoiceCreateRoomNotify ownerCreateRoomNotify;

    @NonNull
    @ProtobufIndex(index = 16)
    public BLiveVoiceQuickGiftConfig quickGiftConfig;

    @ProtobufIndex(index = 41)
    public boolean reflectAudioProcessSwitch;

    @NonNull
    @ProtobufIndex(index = 26)
    public String roomAdministratorExplainH5;

    @NonNull
    @ProtobufIndex(index = 34)
    public String roomCardTemplateType;

    @NonNull
    @ProtobufIndex(index = 24)
    public BLiveVoiceRoomPopRefresh roomPopRefresh;

    @Nullable
    @ProtobufIndex(index = 33)
    public BLiveVoiceShareConfig shareConfig;

    @ProtobufIndex(index = 40)
    public boolean shareScreenRealNameAuthSwitch;

    @ProtobufIndex(index = 39)
    public boolean shareScreenSwitch;

    @ProtobufIndex(index = 11)
    public boolean showAnnouncementEntrance;

    @ProtobufIndex(index = 47)
    public boolean showEntrance;

    @ProtobufIndex(index = 50)
    public boolean showPledgeAuctionNewTag;

    @ProtobufIndex(index = 35)
    public boolean showRoomRegion;

    @NonNull
    @ProtobufIndex(index = 32)
    public BLiveVoiceSmallWindow smallWindow;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startVoiceLive;

    @ProtobufIndex(index = 15)
    public int undercoverMinPlayerCount;

    @ProtobufIndex(index = 13)
    public boolean updateChatV3;

    @NonNull
    @ProtobufIndex(index = 3)
    public String verificationLevel;

    @ProtobufIndex(index = 31)
    public boolean virtualAvatarSwitch;

    @ProtobufIndex(index = 4)
    public boolean voiceActivityShowNumber;

    @ProtobufIndex(index = 8)
    public int voiceBottomTabMode;

    @NonNull
    @ProtobufIndex(index = 25)
    public BLiveVoiceSweetCpConfig voiceCpConfig;

    @NonNull
    @ProtobufIndex(index = 30)
    public BLiveVoiceGiftWallConfig voiceGiftWallConfig;

    @NonNull
    @ProtobufIndex(index = 23)
    public BLiveVoiceRankingBoard voiceLeaderboard;

    @NonNull
    @ProtobufIndex(index = 21)
    public String voiceLiveActivityMomentShow;

    @NonNull
    @ProtobufIndex(index = 20)
    public String voiceLiveActivityMomentTest;

    @ProtobufIndex(index = 18)
    public boolean voiceLiveHotChatMatchTest;

    @ProtobufIndex(index = 22)
    public boolean voiceLiveHotChatMatchTest2;

    @NonNull
    @ProtobufIndex(index = 17)
    public BLiveVoiceSparkReportConfig voiceLiveSparkletReportConfig;

    @ProtobufIndex(index = 14)
    public int voiceManagerLimit;

    @NonNull
    @ProtobufIndex(index = 19)
    public BLiveVoiceRecordConfig voiceRecordConfig;

    public static BLiveVoiceLiveConfig new_() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig = new BLiveVoiceLiveConfig();
        bLiveVoiceLiveConfig.nullCheck();
        return bLiveVoiceLiveConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceLiveConfig mo225055clone() {
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig = new BLiveVoiceLiveConfig();
        bLiveVoiceLiveConfig.startVoiceLive = this.startVoiceLive;
        BLiveVoiceFeedStyle bLiveVoiceFeedStyle = this.feedStyle;
        if (bLiveVoiceFeedStyle != null) {
            bLiveVoiceLiveConfig.feedStyle = bLiveVoiceFeedStyle.mo225055clone();
        }
        bLiveVoiceLiveConfig.verificationLevel = this.verificationLevel;
        bLiveVoiceLiveConfig.voiceActivityShowNumber = this.voiceActivityShowNumber;
        bLiveVoiceLiveConfig.defaultTabTopicId = this.defaultTabTopicId;
        bLiveVoiceLiveConfig.memberListRefreshInterval = this.memberListRefreshInterval;
        List<BLiveCommonViewConfig> list = this.operateMenu;
        if (list != null) {
            bLiveVoiceLiveConfig.operateMenu = ValueObject.util_map(list, new qcj() { // from class: l.i92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCommonViewConfig) obj).mo225055clone();
                }
            });
        }
        bLiveVoiceLiveConfig.voiceBottomTabMode = this.voiceBottomTabMode;
        List<BLiveCommonViewConfig> list2 = this.audienceOperateMenu;
        if (list2 != null) {
            bLiveVoiceLiveConfig.audienceOperateMenu = ValueObject.util_map(list2, new qcj() { // from class: l.j92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCommonViewConfig) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceCreateRoomNotify bLiveVoiceCreateRoomNotify = this.ownerCreateRoomNotify;
        if (bLiveVoiceCreateRoomNotify != null) {
            bLiveVoiceLiveConfig.ownerCreateRoomNotify = bLiveVoiceCreateRoomNotify.mo225055clone();
        }
        bLiveVoiceLiveConfig.showAnnouncementEntrance = this.showAnnouncementEntrance;
        bLiveVoiceLiveConfig.bindChatGroupPermission = this.bindChatGroupPermission;
        bLiveVoiceLiveConfig.updateChatV3 = this.updateChatV3;
        bLiveVoiceLiveConfig.voiceManagerLimit = this.voiceManagerLimit;
        bLiveVoiceLiveConfig.undercoverMinPlayerCount = this.undercoverMinPlayerCount;
        BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig = this.voiceLiveSparkletReportConfig;
        if (bLiveVoiceSparkReportConfig != null) {
            bLiveVoiceLiveConfig.voiceLiveSparkletReportConfig = bLiveVoiceSparkReportConfig.mo225055clone();
        }
        BLiveVoiceQuickGiftConfig bLiveVoiceQuickGiftConfig = this.quickGiftConfig;
        if (bLiveVoiceQuickGiftConfig != null) {
            bLiveVoiceLiveConfig.quickGiftConfig = bLiveVoiceQuickGiftConfig.mo225055clone();
        }
        bLiveVoiceLiveConfig.voiceLiveHotChatMatchTest = this.voiceLiveHotChatMatchTest;
        BLiveVoiceRecordConfig bLiveVoiceRecordConfig = this.voiceRecordConfig;
        if (bLiveVoiceRecordConfig != null) {
            bLiveVoiceLiveConfig.voiceRecordConfig = bLiveVoiceRecordConfig.mo225055clone();
        }
        bLiveVoiceLiveConfig.voiceLiveActivityMomentTest = this.voiceLiveActivityMomentTest;
        bLiveVoiceLiveConfig.voiceLiveActivityMomentShow = this.voiceLiveActivityMomentShow;
        bLiveVoiceLiveConfig.voiceLiveHotChatMatchTest2 = this.voiceLiveHotChatMatchTest2;
        BLiveVoiceRankingBoard bLiveVoiceRankingBoard = this.voiceLeaderboard;
        if (bLiveVoiceRankingBoard != null) {
            bLiveVoiceLiveConfig.voiceLeaderboard = bLiveVoiceRankingBoard.mo225055clone();
        }
        BLiveVoiceRoomPopRefresh bLiveVoiceRoomPopRefresh = this.roomPopRefresh;
        if (bLiveVoiceRoomPopRefresh != null) {
            bLiveVoiceLiveConfig.roomPopRefresh = bLiveVoiceRoomPopRefresh.mo225055clone();
        }
        BLiveVoiceSweetCpConfig bLiveVoiceSweetCpConfig = this.voiceCpConfig;
        if (bLiveVoiceSweetCpConfig != null) {
            bLiveVoiceLiveConfig.voiceCpConfig = bLiveVoiceSweetCpConfig.mo225055clone();
        }
        bLiveVoiceLiveConfig.roomAdministratorExplainH5 = this.roomAdministratorExplainH5;
        bLiveVoiceLiveConfig.chatEntryRefreshInterval = this.chatEntryRefreshInterval;
        bLiveVoiceLiveConfig.chatEntryExp = this.chatEntryExp;
        BLiveVoiceNewOperationConfig bLiveVoiceNewOperationConfig = this.intlVoiceBannerConfig;
        if (bLiveVoiceNewOperationConfig != null) {
            bLiveVoiceLiveConfig.intlVoiceBannerConfig = bLiveVoiceNewOperationConfig.mo225055clone();
        }
        BLiveVoiceGiftWallConfig bLiveVoiceGiftWallConfig = this.voiceGiftWallConfig;
        if (bLiveVoiceGiftWallConfig != null) {
            bLiveVoiceLiveConfig.voiceGiftWallConfig = bLiveVoiceGiftWallConfig.mo225055clone();
        }
        bLiveVoiceLiveConfig.virtualAvatarSwitch = this.virtualAvatarSwitch;
        BLiveVoiceSmallWindow bLiveVoiceSmallWindow = this.smallWindow;
        if (bLiveVoiceSmallWindow != null) {
            bLiveVoiceLiveConfig.smallWindow = bLiveVoiceSmallWindow.mo225055clone();
        }
        BLiveVoiceShareConfig bLiveVoiceShareConfig = this.shareConfig;
        if (bLiveVoiceShareConfig != null) {
            bLiveVoiceLiveConfig.shareConfig = bLiveVoiceShareConfig.mo225055clone();
        }
        bLiveVoiceLiveConfig.roomCardTemplateType = this.roomCardTemplateType;
        bLiveVoiceLiveConfig.showRoomRegion = this.showRoomRegion;
        BLiveIntlShareCongfig bLiveIntlShareCongfig = this.intlShareConfig;
        if (bLiveIntlShareCongfig != null) {
            bLiveVoiceLiveConfig.intlShareConfig = bLiveIntlShareCongfig.mo225055clone();
        }
        bLiveVoiceLiveConfig.fixRoomManagerLimit = this.fixRoomManagerLimit;
        BLiveVoiceSingTogetherConfig bLiveVoiceSingTogetherConfig = this.intlVoiceSingGameConfig;
        if (bLiveVoiceSingTogetherConfig != null) {
            bLiveVoiceLiveConfig.intlVoiceSingGameConfig = bLiveVoiceSingTogetherConfig.mo225055clone();
        }
        bLiveVoiceLiveConfig.shareScreenSwitch = this.shareScreenSwitch;
        bLiveVoiceLiveConfig.shareScreenRealNameAuthSwitch = this.shareScreenRealNameAuthSwitch;
        bLiveVoiceLiveConfig.reflectAudioProcessSwitch = this.reflectAudioProcessSwitch;
        bLiveVoiceLiveConfig.directLeaveRoomMaxStaySeconds = this.directLeaveRoomMaxStaySeconds;
        bLiveVoiceLiveConfig.anchorGrowthEntrySwitch = this.anchorGrowthEntrySwitch;
        List<BLiveIntlFlyMicEffectConfig> list3 = this.intlFlyMicEffectConfig;
        if (list3 != null) {
            bLiveVoiceLiveConfig.intlFlyMicEffectConfig = ValueObject.util_map(list3, new qcj() { // from class: l.k92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveIntlFlyMicEffectConfig) obj).mo225055clone();
                }
            });
        }
        bLiveVoiceLiveConfig.intlEnterRoomOptimize = this.intlEnterRoomOptimize;
        BLiveVoiceCpConfig bLiveVoiceCpConfig = this.intlVoiceCpConfig;
        if (bLiveVoiceCpConfig != null) {
            bLiveVoiceLiveConfig.intlVoiceCpConfig = bLiveVoiceCpConfig.mo225055clone();
        }
        bLiveVoiceLiveConfig.showEntrance = this.showEntrance;
        bLiveVoiceLiveConfig.isOverseaChineseMigrated = this.isOverseaChineseMigrated;
        bLiveVoiceLiveConfig.isHideCreateRoomButton = this.isHideCreateRoomButton;
        bLiveVoiceLiveConfig.auctionTrickBubble = this.auctionTrickBubble;
        bLiveVoiceLiveConfig.showPledgeAuctionNewTag = this.showPledgeAuctionNewTag;
        return bLiveVoiceLiveConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceLiveConfig)) {
            return false;
        }
        BLiveVoiceLiveConfig bLiveVoiceLiveConfig = (BLiveVoiceLiveConfig) obj;
        return ValueObject.util_equals(this.startVoiceLive, bLiveVoiceLiveConfig.startVoiceLive) && ValueObject.util_equals(this.feedStyle, bLiveVoiceLiveConfig.feedStyle) && ValueObject.util_equals(this.verificationLevel, bLiveVoiceLiveConfig.verificationLevel) && this.voiceActivityShowNumber == bLiveVoiceLiveConfig.voiceActivityShowNumber && ValueObject.util_equals(this.defaultTabTopicId, bLiveVoiceLiveConfig.defaultTabTopicId) && this.memberListRefreshInterval == bLiveVoiceLiveConfig.memberListRefreshInterval && ValueObject.util_equals(this.operateMenu, bLiveVoiceLiveConfig.operateMenu) && this.voiceBottomTabMode == bLiveVoiceLiveConfig.voiceBottomTabMode && ValueObject.util_equals(this.audienceOperateMenu, bLiveVoiceLiveConfig.audienceOperateMenu) && ValueObject.util_equals(this.ownerCreateRoomNotify, bLiveVoiceLiveConfig.ownerCreateRoomNotify) && this.showAnnouncementEntrance == bLiveVoiceLiveConfig.showAnnouncementEntrance && this.bindChatGroupPermission == bLiveVoiceLiveConfig.bindChatGroupPermission && this.updateChatV3 == bLiveVoiceLiveConfig.updateChatV3 && this.voiceManagerLimit == bLiveVoiceLiveConfig.voiceManagerLimit && this.undercoverMinPlayerCount == bLiveVoiceLiveConfig.undercoverMinPlayerCount && ValueObject.util_equals(this.voiceLiveSparkletReportConfig, bLiveVoiceLiveConfig.voiceLiveSparkletReportConfig) && ValueObject.util_equals(this.quickGiftConfig, bLiveVoiceLiveConfig.quickGiftConfig) && this.voiceLiveHotChatMatchTest == bLiveVoiceLiveConfig.voiceLiveHotChatMatchTest && ValueObject.util_equals(this.voiceRecordConfig, bLiveVoiceLiveConfig.voiceRecordConfig) && ValueObject.util_equals(this.voiceLiveActivityMomentTest, bLiveVoiceLiveConfig.voiceLiveActivityMomentTest) && ValueObject.util_equals(this.voiceLiveActivityMomentShow, bLiveVoiceLiveConfig.voiceLiveActivityMomentShow) && this.voiceLiveHotChatMatchTest2 == bLiveVoiceLiveConfig.voiceLiveHotChatMatchTest2 && ValueObject.util_equals(this.voiceLeaderboard, bLiveVoiceLiveConfig.voiceLeaderboard) && ValueObject.util_equals(this.roomPopRefresh, bLiveVoiceLiveConfig.roomPopRefresh) && ValueObject.util_equals(this.voiceCpConfig, bLiveVoiceLiveConfig.voiceCpConfig) && ValueObject.util_equals(this.roomAdministratorExplainH5, bLiveVoiceLiveConfig.roomAdministratorExplainH5) && this.chatEntryRefreshInterval == bLiveVoiceLiveConfig.chatEntryRefreshInterval && this.chatEntryExp == bLiveVoiceLiveConfig.chatEntryExp && ValueObject.util_equals(this.intlVoiceBannerConfig, bLiveVoiceLiveConfig.intlVoiceBannerConfig) && ValueObject.util_equals(this.voiceGiftWallConfig, bLiveVoiceLiveConfig.voiceGiftWallConfig) && this.virtualAvatarSwitch == bLiveVoiceLiveConfig.virtualAvatarSwitch && ValueObject.util_equals(this.smallWindow, bLiveVoiceLiveConfig.smallWindow) && ValueObject.util_equals(this.shareConfig, bLiveVoiceLiveConfig.shareConfig) && ValueObject.util_equals(this.roomCardTemplateType, bLiveVoiceLiveConfig.roomCardTemplateType) && this.showRoomRegion == bLiveVoiceLiveConfig.showRoomRegion && ValueObject.util_equals(this.intlShareConfig, bLiveVoiceLiveConfig.intlShareConfig) && this.fixRoomManagerLimit == bLiveVoiceLiveConfig.fixRoomManagerLimit && ValueObject.util_equals(this.intlVoiceSingGameConfig, bLiveVoiceLiveConfig.intlVoiceSingGameConfig) && this.shareScreenSwitch == bLiveVoiceLiveConfig.shareScreenSwitch && this.shareScreenRealNameAuthSwitch == bLiveVoiceLiveConfig.shareScreenRealNameAuthSwitch && this.reflectAudioProcessSwitch == bLiveVoiceLiveConfig.reflectAudioProcessSwitch && this.directLeaveRoomMaxStaySeconds == bLiveVoiceLiveConfig.directLeaveRoomMaxStaySeconds && this.anchorGrowthEntrySwitch == bLiveVoiceLiveConfig.anchorGrowthEntrySwitch && ValueObject.util_equals(this.intlFlyMicEffectConfig, bLiveVoiceLiveConfig.intlFlyMicEffectConfig) && this.intlEnterRoomOptimize == bLiveVoiceLiveConfig.intlEnterRoomOptimize && ValueObject.util_equals(this.intlVoiceCpConfig, bLiveVoiceLiveConfig.intlVoiceCpConfig) && this.showEntrance == bLiveVoiceLiveConfig.showEntrance && this.isOverseaChineseMigrated == bLiveVoiceLiveConfig.isOverseaChineseMigrated && this.isHideCreateRoomButton == bLiveVoiceLiveConfig.isHideCreateRoomButton && ValueObject.util_equals(this.auctionTrickBubble, bLiveVoiceLiveConfig.auctionTrickBubble) && this.showPledgeAuctionNewTag == bLiveVoiceLiveConfig.showPledgeAuctionNewTag;
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
        String str = this.startVoiceLive;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveVoiceFeedStyle bLiveVoiceFeedStyle = this.feedStyle;
        int iHashCode2 = (iHashCode + (bLiveVoiceFeedStyle != null ? bLiveVoiceFeedStyle.hashCode() : 0)) * 41;
        String str2 = this.verificationLevel;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.voiceActivityShowNumber ? 1231 : 1237)) * 41;
        String str3 = this.defaultTabTopicId;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.memberListRefreshInterval) * 41;
        List<BLiveCommonViewConfig> list = this.operateMenu;
        int iHashCode5 = (((iHashCode4 + (list != null ? list.hashCode() : 0)) * 41) + this.voiceBottomTabMode) * 41;
        List<BLiveCommonViewConfig> list2 = this.audienceOperateMenu;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveVoiceCreateRoomNotify bLiveVoiceCreateRoomNotify = this.ownerCreateRoomNotify;
        int iHashCode7 = (((((((((((iHashCode6 + (bLiveVoiceCreateRoomNotify != null ? bLiveVoiceCreateRoomNotify.hashCode() : 0)) * 41) + (this.showAnnouncementEntrance ? 1231 : 1237)) * 41) + (this.bindChatGroupPermission ? 1231 : 1237)) * 41) + (this.updateChatV3 ? 1231 : 1237)) * 41) + this.voiceManagerLimit) * 41) + this.undercoverMinPlayerCount) * 41;
        BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig = this.voiceLiveSparkletReportConfig;
        int iHashCode8 = (iHashCode7 + (bLiveVoiceSparkReportConfig != null ? bLiveVoiceSparkReportConfig.hashCode() : 0)) * 41;
        BLiveVoiceQuickGiftConfig bLiveVoiceQuickGiftConfig = this.quickGiftConfig;
        int iHashCode9 = (((iHashCode8 + (bLiveVoiceQuickGiftConfig != null ? bLiveVoiceQuickGiftConfig.hashCode() : 0)) * 41) + (this.voiceLiveHotChatMatchTest ? 1231 : 1237)) * 41;
        BLiveVoiceRecordConfig bLiveVoiceRecordConfig = this.voiceRecordConfig;
        int iHashCode10 = (iHashCode9 + (bLiveVoiceRecordConfig != null ? bLiveVoiceRecordConfig.hashCode() : 0)) * 41;
        String str4 = this.voiceLiveActivityMomentTest;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.voiceLiveActivityMomentShow;
        int iHashCode12 = (((iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.voiceLiveHotChatMatchTest2 ? 1231 : 1237)) * 41;
        BLiveVoiceRankingBoard bLiveVoiceRankingBoard = this.voiceLeaderboard;
        int iHashCode13 = (iHashCode12 + (bLiveVoiceRankingBoard != null ? bLiveVoiceRankingBoard.hashCode() : 0)) * 41;
        BLiveVoiceRoomPopRefresh bLiveVoiceRoomPopRefresh = this.roomPopRefresh;
        int iHashCode14 = (iHashCode13 + (bLiveVoiceRoomPopRefresh != null ? bLiveVoiceRoomPopRefresh.hashCode() : 0)) * 41;
        BLiveVoiceSweetCpConfig bLiveVoiceSweetCpConfig = this.voiceCpConfig;
        int iHashCode15 = (iHashCode14 + (bLiveVoiceSweetCpConfig != null ? bLiveVoiceSweetCpConfig.hashCode() : 0)) * 41;
        String str6 = this.roomAdministratorExplainH5;
        int iHashCode16 = (((((iHashCode15 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.chatEntryRefreshInterval) * 41) + (this.chatEntryExp ? 1231 : 1237)) * 41;
        BLiveVoiceNewOperationConfig bLiveVoiceNewOperationConfig = this.intlVoiceBannerConfig;
        int iHashCode17 = (iHashCode16 + (bLiveVoiceNewOperationConfig != null ? bLiveVoiceNewOperationConfig.hashCode() : 0)) * 41;
        BLiveVoiceGiftWallConfig bLiveVoiceGiftWallConfig = this.voiceGiftWallConfig;
        int iHashCode18 = (((iHashCode17 + (bLiveVoiceGiftWallConfig != null ? bLiveVoiceGiftWallConfig.hashCode() : 0)) * 41) + (this.virtualAvatarSwitch ? 1231 : 1237)) * 41;
        BLiveVoiceSmallWindow bLiveVoiceSmallWindow = this.smallWindow;
        int iHashCode19 = (iHashCode18 + (bLiveVoiceSmallWindow != null ? bLiveVoiceSmallWindow.hashCode() : 0)) * 41;
        BLiveVoiceShareConfig bLiveVoiceShareConfig = this.shareConfig;
        int iHashCode20 = (iHashCode19 + (bLiveVoiceShareConfig != null ? bLiveVoiceShareConfig.hashCode() : 0)) * 41;
        String str7 = this.roomCardTemplateType;
        int iHashCode21 = (((iHashCode20 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.showRoomRegion ? 1231 : 1237)) * 41;
        BLiveIntlShareCongfig bLiveIntlShareCongfig = this.intlShareConfig;
        int iHashCode22 = (((iHashCode21 + (bLiveIntlShareCongfig != null ? bLiveIntlShareCongfig.hashCode() : 0)) * 41) + this.fixRoomManagerLimit) * 41;
        BLiveVoiceSingTogetherConfig bLiveVoiceSingTogetherConfig = this.intlVoiceSingGameConfig;
        int iHashCode23 = (((((((((((iHashCode22 + (bLiveVoiceSingTogetherConfig != null ? bLiveVoiceSingTogetherConfig.hashCode() : 0)) * 41) + (this.shareScreenSwitch ? 1231 : 1237)) * 41) + (this.shareScreenRealNameAuthSwitch ? 1231 : 1237)) * 41) + (this.reflectAudioProcessSwitch ? 1231 : 1237)) * 41) + this.directLeaveRoomMaxStaySeconds) * 41) + (this.anchorGrowthEntrySwitch ? 1231 : 1237)) * 41;
        List<BLiveIntlFlyMicEffectConfig> list3 = this.intlFlyMicEffectConfig;
        int iHashCode24 = (((iHashCode23 + (list3 != null ? list3.hashCode() : 0)) * 41) + (this.intlEnterRoomOptimize ? 1231 : 1237)) * 41;
        BLiveVoiceCpConfig bLiveVoiceCpConfig = this.intlVoiceCpConfig;
        int iHashCode25 = (((((((iHashCode24 + (bLiveVoiceCpConfig != null ? bLiveVoiceCpConfig.hashCode() : 0)) * 41) + (this.showEntrance ? 1231 : 1237)) * 41) + (this.isOverseaChineseMigrated ? 1231 : 1237)) * 41) + (this.isHideCreateRoomButton ? 1231 : 1237)) * 41;
        String str8 = this.auctionTrickBubble;
        int iHashCode26 = ((iHashCode25 + (str8 != null ? str8.hashCode() : 0)) * 41) + (this.showPledgeAuctionNewTag ? 1231 : 1237);
        this.hashCode = iHashCode26;
        return iHashCode26;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startVoiceLive == null) {
            this.startVoiceLive = "";
        }
        if (this.feedStyle == null) {
            this.feedStyle = BLiveVoiceFeedStyle.new_();
        }
        if (this.verificationLevel == null) {
            this.verificationLevel = "";
        }
        if (this.defaultTabTopicId == null) {
            this.defaultTabTopicId = "";
        }
        if (this.operateMenu == null) {
            this.operateMenu = new ArrayList();
        }
        if (this.audienceOperateMenu == null) {
            this.audienceOperateMenu = new ArrayList();
        }
        if (this.ownerCreateRoomNotify == null) {
            this.ownerCreateRoomNotify = BLiveVoiceCreateRoomNotify.new_();
        }
        if (this.voiceLiveSparkletReportConfig == null) {
            this.voiceLiveSparkletReportConfig = BLiveVoiceSparkReportConfig.new_();
        }
        if (this.quickGiftConfig == null) {
            this.quickGiftConfig = BLiveVoiceQuickGiftConfig.new_();
        }
        if (this.voiceRecordConfig == null) {
            this.voiceRecordConfig = BLiveVoiceRecordConfig.new_();
        }
        if (this.voiceLiveActivityMomentTest == null) {
            this.voiceLiveActivityMomentTest = "";
        }
        if (this.voiceLiveActivityMomentShow == null) {
            this.voiceLiveActivityMomentShow = "";
        }
        if (this.voiceLeaderboard == null) {
            this.voiceLeaderboard = BLiveVoiceRankingBoard.new_();
        }
        if (this.roomPopRefresh == null) {
            this.roomPopRefresh = BLiveVoiceRoomPopRefresh.new_();
        }
        if (this.voiceCpConfig == null) {
            this.voiceCpConfig = BLiveVoiceSweetCpConfig.new_();
        }
        if (this.roomAdministratorExplainH5 == null) {
            this.roomAdministratorExplainH5 = "";
        }
        if (this.intlVoiceBannerConfig == null) {
            this.intlVoiceBannerConfig = BLiveVoiceNewOperationConfig.new_();
        }
        if (this.voiceGiftWallConfig == null) {
            this.voiceGiftWallConfig = BLiveVoiceGiftWallConfig.new_();
        }
        if (this.smallWindow == null) {
            this.smallWindow = BLiveVoiceSmallWindow.new_();
        }
        if (this.roomCardTemplateType == null) {
            this.roomCardTemplateType = "";
        }
        if (this.intlShareConfig == null) {
            this.intlShareConfig = BLiveIntlShareCongfig.new_();
        }
        if (this.intlVoiceSingGameConfig == null) {
            this.intlVoiceSingGameConfig = BLiveVoiceSingTogetherConfig.new_();
        }
        if (this.intlFlyMicEffectConfig == null) {
            this.intlFlyMicEffectConfig = new ArrayList();
        }
        if (this.intlVoiceCpConfig == null) {
            this.intlVoiceCpConfig = BLiveVoiceCpConfig.new_();
        }
        if (this.auctionTrickBubble == null) {
            this.auctionTrickBubble = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
