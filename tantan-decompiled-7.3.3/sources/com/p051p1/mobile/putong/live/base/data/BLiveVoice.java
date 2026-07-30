package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.p051p1.mobile.putong.data.VoiceLiveExtension;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLabel;
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
public class BLiveVoice extends BLiveAbsData implements Cloneable, Serializable {
    public static final String TYPE = "blivevoice";

    @NonNull
    @ProtobufIndex(index = 60)
    public String auctionId;

    @NonNull
    @ProtobufIndex(index = 62)
    public String bossState;

    @NonNull
    @ProtobufIndex(index = 51)
    public BLiveVoiceCallInfo callInfo;

    @ProtobufIndex(index = 61)
    public int callNumbers;

    @ProtobufIndex(index = 56)
    public boolean canFollowAnchor;

    @NonNull
    @ProtobufIndex(index = 54)
    public VoiceLiveExtension extension;

    @NonNull
    @ProtobufIndex(index = 53)
    public String gameId;

    @NonNull
    @ProtobufIndex(index = 58)
    public String onCallView;

    @NonNull
    @ProtobufIndex(index = 55)
    public List<BLiveCommonViewConfig> tags;

    @NonNull
    @ProtobufIndex(index = 52)
    public String template;

    @NonNull
    @ProtobufIndex(index = 59)
    public String templateType;
    public static final BLiveVoice EMPTY = new_();
    public static String EIGHT_DEPUTY_STRATEGY = "eightCall";
    public static String NINE_DEPUTY_STRATEGY = "nineCall";
    public static String TEN_DEPUTY_STRATEGY = "tenCall";
    public static String ALL_DEPUTY_STRATEGY = "allCall";
    public static String AUCTION_STRATEGY = "auctionCall";
    public static String BOTTOM_EIGHT_DEPUTY_STRATEGY = "bottomEightCall";
    public static String BOTTOM_NINE_DEPUTY_STRATEGY = "bottomNineCall";
    public static String BOTTOM_TEN_DEPUTY_STRATEGY = "bottomTenCall";
    public static String THREE_DEPUTY_STRATEGY = "threeCall";
    public static String FIVE_DEPUTY_STRATEGY = "fiveCall";
    public static String VOICE_LIVE_MODEL_BOSS = "boss";
    public static String VOICE_LIVE_MODEL_RADIO_3 = "radio3";
    public static String VOICE_LIVE_MODEL_RADIO_5 = "radio5";
    public static int VOICE_NINE_MIC_BOSS_POSITION = 8;
    public static JsonAdapter<BLiveVoice> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoice>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoice.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoice.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoice newInstance() {
            return new BLiveVoice();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoice bLiveVoice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -1697583838:
                    if (str.equals("onCallView")) {
                        b = 1;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 2;
                    }
                    break;
                case -1431135222:
                    if (str.equals("simplechat")) {
                        b = 3;
                    }
                    break;
                case -1413299531:
                    if (str.equals("anchor")) {
                        b = 4;
                    }
                    break;
                case -1321546630:
                    if (str.equals("template")) {
                        b = 5;
                    }
                    break;
                case -1253236563:
                    if (str.equals("gameId")) {
                        b = 6;
                    }
                    break;
                case -1142281334:
                    if (str.equals("recommendInfo")) {
                        b = 7;
                    }
                    break;
                case -1108386280:
                    if (str.equals("specialLabels")) {
                        b = 8;
                    }
                    break;
                case -1044920883:
                    if (str.equals("basicLabels")) {
                        b = 9;
                    }
                    break;
                case -975961388:
                    if (str.equals("templateType")) {
                        b = 10;
                    }
                    break;
                case -612557761:
                    if (str.equals("extension")) {
                        b = 11;
                    }
                    break;
                case -389127490:
                    if (str.equals("auctionId")) {
                        b = 12;
                    }
                    break;
                case -315634225:
                    if (str.equals("streamUrl")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -172952532:
                    if (str.equals("callInfo")) {
                        b = 14;
                    }
                    break;
                case -172220347:
                    if (str.equals("callback")) {
                        b = 15;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 3506395:
                    if (str.equals("room")) {
                        b = 17;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 18;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 19;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 20;
                    }
                    break;
                case 405428811:
                    if (str.equals("videoCapture")) {
                        b = 21;
                    }
                    break;
                case 764886454:
                    if (str.equals("canFollowAnchor")) {
                        b = 22;
                    }
                    break;
                case 884554657:
                    if (str.equals("rewardPoint")) {
                        b = 23;
                    }
                    break;
                case 1084273069:
                    if (str.equals("enterRoomType")) {
                        b = 24;
                    }
                    break;
                case 1108431579:
                    if (str.equals("streamCdnInfo")) {
                        b = 25;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 26;
                    }
                    break;
                case 1417480367:
                    if (str.equals("liveMode")) {
                        b = 27;
                    }
                    break;
                case 1497806116:
                    if (str.equals("bossState")) {
                        b = 28;
                    }
                    break;
                case 1881007628:
                    if (str.equals("callNumbers")) {
                        b = 29;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoice.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 1:
                    bLiveVoice.onCallView = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveVoice.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 3:
                    bLiveVoice.simplechat = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    bLiveVoice.anchor = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveVoice.template = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVoice.gameId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoice.recommendInfo = BLiveRecommendInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveVoice.specialLabels = JsonAdapter.parseArray(jsonParser, BLiveSuggestLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveVoice.basicLabels = JsonAdapter.parseArray(jsonParser, BLiveSuggestLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveVoice.templateType = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoice.extension = VoiceLiveExtension.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveVoice.auctionId = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoice.streamUrl = BLiveStreamUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveVoice.callInfo = BLiveVoiceCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveVoice.callback = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveVoice.f45171id = jsonParser.getValueAsString();
                    return false;
                case 17:
                    bLiveVoice.room = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    bLiveVoice.tags = JsonAdapter.parseArray(jsonParser, BLiveCommonViewConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    bLiveVoice.type = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveVoice.state = BLiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 21:
                    bLiveVoice.videoCapture = Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case 22:
                    bLiveVoice.canFollowAnchor = jsonParser.getValueAsBoolean();
                    return true;
                case 23:
                    bLiveVoice.rewardPoint = jsonParser.getValueAsDouble();
                    return true;
                case 24:
                    bLiveVoice.enterRoomType = jsonParser.getValueAsInt();
                    return true;
                case 25:
                    bLiveVoice.streamCdnInfo = BLiveStreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    bLiveVoice.memberCount = jsonParser.getValueAsDouble();
                    return true;
                case 27:
                    bLiveVoice.liveMode = jsonParser.getValueAsString();
                    return true;
                case 28:
                    bLiveVoice.bossState = jsonParser.getValueAsString();
                    return true;
                case 29:
                    bLiveVoice.callNumbers = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoice bLiveVoice, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoice.f45171id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveVoice.room != null) {
                jsonGenerator.writeFieldName("room");
                BLiveOwner.JSON_ADAPTER.serialize(bLiveVoice.room, jsonGenerator, true);
            }
            if (bLiveVoice.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveOwner.JSON_ADAPTER.serialize(bLiveVoice.anchor, jsonGenerator, true);
            }
            if (bLiveVoice.recommendInfo != null) {
                jsonGenerator.writeFieldName("recommendInfo");
                BLiveRecommendInfo.JSON_ADAPTER.serialize(bLiveVoice.recommendInfo, jsonGenerator, true);
            }
            if (bLiveVoice.state != null) {
                jsonGenerator.writeFieldName("state");
                BLiveState.JSON_ADAPTER.serialize(bLiveVoice.state, jsonGenerator, true);
            }
            if (bLiveVoice.basicLabels != null) {
                jsonGenerator.writeFieldName("basicLabels");
                JsonAdapter.serializeArray(bLiveVoice.basicLabels, jsonGenerator, BLiveSuggestLabel.JSON_ADAPTER);
            }
            if (bLiveVoice.videoCapture != null) {
                jsonGenerator.writeFieldName("videoCapture");
                Converter.RAW_PICTURE_TO_MEDIA.serialize(bLiveVoice.videoCapture, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("memberCount", bLiveVoice.memberCount);
            String str2 = bLiveVoice.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLiveVoice.streamCdnInfo != null) {
                jsonGenerator.writeFieldName("streamCdnInfo");
                BLiveStreamCdnInfo.JSON_ADAPTER.serialize(bLiveVoice.streamCdnInfo, jsonGenerator, true);
            }
            if (bLiveVoice.streamUrl != null) {
                jsonGenerator.writeFieldName("streamUrl");
                BLiveStreamUrl.JSON_ADAPTER.serialize(bLiveVoice.streamUrl, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("rewardPoint", bLiveVoice.rewardPoint);
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(bLiveVoice.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(bLiveVoice.endTime), jsonGenerator, true);
            if (bLiveVoice.specialLabels != null) {
                jsonGenerator.writeFieldName("specialLabels");
                JsonAdapter.serializeArray(bLiveVoice.specialLabels, jsonGenerator, BLiveSuggestLabel.JSON_ADAPTER);
            }
            String str3 = bLiveVoice.callback;
            if (str3 != null) {
                jsonGenerator.writeStringField("callback", str3);
            }
            String str4 = bLiveVoice.liveMode;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveMode", str4);
            }
            jsonGenerator.writeBooleanField("simplechat", bLiveVoice.simplechat);
            jsonGenerator.writeNumberField("enterRoomType", bLiveVoice.enterRoomType);
            if (bLiveVoice.callInfo != null) {
                jsonGenerator.writeFieldName("callInfo");
                BLiveVoiceCallInfo.JSON_ADAPTER.serialize(bLiveVoice.callInfo, jsonGenerator, true);
            }
            String str5 = bLiveVoice.template;
            if (str5 != null) {
                jsonGenerator.writeStringField("template", str5);
            }
            String str6 = bLiveVoice.gameId;
            if (str6 != null) {
                jsonGenerator.writeStringField("gameId", str6);
            }
            if (bLiveVoice.extension != null) {
                jsonGenerator.writeFieldName("extension");
                VoiceLiveExtension.JSON_ADAPTER.serialize(bLiveVoice.extension, jsonGenerator, true);
            }
            if (bLiveVoice.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(bLiveVoice.tags, jsonGenerator, BLiveCommonViewConfig.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("canFollowAnchor", bLiveVoice.canFollowAnchor);
            String str7 = bLiveVoice.onCallView;
            if (str7 != null) {
                jsonGenerator.writeStringField("onCallView", str7);
            }
            String str8 = bLiveVoice.templateType;
            if (str8 != null) {
                jsonGenerator.writeStringField("templateType", str8);
            }
            String str9 = bLiveVoice.auctionId;
            if (str9 != null) {
                jsonGenerator.writeStringField("auctionId", str9);
            }
            jsonGenerator.writeNumberField("callNumbers", bLiveVoice.callNumbers);
            String str10 = bLiveVoice.bossState;
            if (str10 != null) {
                jsonGenerator.writeStringField("bossState", str10);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BLiveVoice new_() {
        BLiveVoice bLiveVoice = new BLiveVoice();
        bLiveVoice.nullCheck();
        return bLiveVoice;
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsData, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoice mo225055clone() {
        BLiveVoice bLiveVoice = new BLiveVoice();
        bLiveVoice.f45171id = this.f45171id;
        BLiveOwner bLiveOwner = this.room;
        if (bLiveOwner != null) {
            bLiveVoice.room = bLiveOwner.mo225055clone();
        }
        BLiveOwner bLiveOwner2 = this.anchor;
        if (bLiveOwner2 != null) {
            bLiveVoice.anchor = bLiveOwner2.mo225055clone();
        }
        BLiveRecommendInfo bLiveRecommendInfo = this.recommendInfo;
        if (bLiveRecommendInfo != null) {
            bLiveVoice.recommendInfo = bLiveRecommendInfo.mo225055clone();
        }
        bLiveVoice.state = this.state;
        List<BLiveSuggestLabel> list = this.basicLabels;
        if (list != null) {
            bLiveVoice.basicLabels = ValueObject.util_map(list, new qcj() { // from class: l.d82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSuggestLabel) obj).mo225055clone();
                }
            });
        }
        Media media = this.videoCapture;
        if (media != null) {
            bLiveVoice.videoCapture = media.mo225055clone();
        }
        bLiveVoice.memberCount = this.memberCount;
        bLiveVoice.type = this.type;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        if (bLiveStreamCdnInfo != null) {
            bLiveVoice.streamCdnInfo = bLiveStreamCdnInfo.mo225055clone();
        }
        BLiveStreamUrl bLiveStreamUrl = this.streamUrl;
        if (bLiveStreamUrl != null) {
            bLiveVoice.streamUrl = bLiveStreamUrl.mo225055clone();
        }
        bLiveVoice.rewardPoint = this.rewardPoint;
        bLiveVoice.startTime = this.startTime;
        bLiveVoice.endTime = this.endTime;
        List<BLiveSuggestLabel> list2 = this.specialLabels;
        if (list2 != null) {
            bLiveVoice.specialLabels = ValueObject.util_map(list2, new qcj() { // from class: l.e82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSuggestLabel) obj).mo225055clone();
                }
            });
        }
        bLiveVoice.callback = this.callback;
        bLiveVoice.liveMode = this.liveMode;
        bLiveVoice.simplechat = this.simplechat;
        bLiveVoice.enterRoomType = this.enterRoomType;
        BLiveVoiceCallInfo bLiveVoiceCallInfo = this.callInfo;
        if (bLiveVoiceCallInfo != null) {
            bLiveVoice.callInfo = bLiveVoiceCallInfo.mo225055clone();
        }
        bLiveVoice.template = this.template;
        bLiveVoice.gameId = this.gameId;
        VoiceLiveExtension voiceLiveExtension = this.extension;
        if (voiceLiveExtension != null) {
            bLiveVoice.extension = voiceLiveExtension.mo225055clone();
        }
        List<BLiveCommonViewConfig> list3 = this.tags;
        if (list3 != null) {
            bLiveVoice.tags = ValueObject.util_map(list3, new qcj() { // from class: l.f82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCommonViewConfig) obj).mo225055clone();
                }
            });
        }
        bLiveVoice.canFollowAnchor = this.canFollowAnchor;
        bLiveVoice.onCallView = this.onCallView;
        bLiveVoice.templateType = this.templateType;
        bLiveVoice.auctionId = this.auctionId;
        bLiveVoice.callNumbers = this.callNumbers;
        bLiveVoice.bossState = this.bossState;
        return bLiveVoice;
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsData
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoice)) {
            return false;
        }
        BLiveVoice bLiveVoice = (BLiveVoice) obj;
        return super.equals(obj) && ValueObject.util_equals(this.callInfo, bLiveVoice.callInfo) && ValueObject.util_equals(this.template, bLiveVoice.template) && ValueObject.util_equals(this.gameId, bLiveVoice.gameId) && ValueObject.util_equals(this.extension, bLiveVoice.extension) && ValueObject.util_equals(this.tags, bLiveVoice.tags) && this.canFollowAnchor == bLiveVoice.canFollowAnchor && ValueObject.util_equals(this.onCallView, bLiveVoice.onCallView) && ValueObject.util_equals(this.templateType, bLiveVoice.templateType) && ValueObject.util_equals(this.auctionId, bLiveVoice.auctionId) && this.callNumbers == bLiveVoice.callNumbers && ValueObject.util_equals(this.bossState, bLiveVoice.bossState);
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsData, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsData
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        BLiveVoiceCallInfo bLiveVoiceCallInfo = this.callInfo;
        int iHashCode2 = (iHashCode + (bLiveVoiceCallInfo != null ? bLiveVoiceCallInfo.hashCode() : 0)) * 41;
        String str = this.template;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.gameId;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        VoiceLiveExtension voiceLiveExtension = this.extension;
        int iHashCode5 = (iHashCode4 + (voiceLiveExtension != null ? voiceLiveExtension.hashCode() : 0)) * 41;
        List<BLiveCommonViewConfig> list = this.tags;
        int iHashCode6 = (((iHashCode5 + (list != null ? list.hashCode() : 0)) * 41) + (this.canFollowAnchor ? 1231 : 1237)) * 41;
        String str3 = this.onCallView;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.templateType;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.auctionId;
        int iHashCode9 = (((iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.callNumbers) * 41;
        String str6 = this.bossState;
        int iHashCode10 = iHashCode9 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    public boolean isIncomerArea() {
        return isOverseasArea() || isMainLandArea();
    }

    public boolean isMainLandArea() {
        return NINE_DEPUTY_STRATEGY.equals(this.onCallView);
    }

    public boolean isOverseasArea() {
        return EIGHT_DEPUTY_STRATEGY.equals(this.onCallView) || TEN_DEPUTY_STRATEGY.equals(this.onCallView) || NINE_DEPUTY_STRATEGY.equals(this.onCallView) || THREE_DEPUTY_STRATEGY.equals(this.onCallView) || FIVE_DEPUTY_STRATEGY.equals(this.onCallView);
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsData, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.callInfo == null) {
            this.callInfo = BLiveVoiceCallInfo.new_();
        }
        if (this.template == null) {
            this.template = "";
        }
        if (this.gameId == null) {
            this.gameId = "";
        }
        if (this.extension == null) {
            this.extension = VoiceLiveExtension.new_();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.onCallView == null) {
            this.onCallView = "";
        }
        if (this.templateType == null) {
            this.templateType = "";
        }
        if (this.auctionId == null) {
            this.auctionId = "";
        }
        if (this.bossState == null) {
            this.bossState = "";
        }
    }

    @Override // com.p051p1.mobile.putong.live.base.data.BLiveAbsData, com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public BLiveVoice update(BLiveAbsData bLiveAbsData) {
        this.f45171id = this.f45171id;
        BLiveOwner bLiveOwner = bLiveAbsData.room;
        if (bLiveOwner != null) {
            this.room = bLiveOwner.mo225055clone();
        }
        BLiveOwner bLiveOwner2 = bLiveAbsData.anchor;
        if (bLiveOwner2 != null) {
            this.anchor = bLiveOwner2.mo225055clone();
        }
        BLiveRecommendInfo bLiveRecommendInfo = bLiveAbsData.recommendInfo;
        if (bLiveRecommendInfo != null) {
            this.recommendInfo = bLiveRecommendInfo.mo225055clone();
        }
        this.state = bLiveAbsData.state;
        Media media = bLiveAbsData.videoCapture;
        if (media != null) {
            this.videoCapture = media.mo225055clone();
        }
        this.memberCount = bLiveAbsData.memberCount;
        this.type = bLiveAbsData.type;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = bLiveAbsData.streamCdnInfo;
        if (bLiveStreamCdnInfo != null) {
            this.streamCdnInfo = bLiveStreamCdnInfo.mo225055clone();
        }
        BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
        if (bLiveStreamUrl != null) {
            this.streamUrl = bLiveStreamUrl.mo225055clone();
        }
        this.rewardPoint = bLiveAbsData.rewardPoint;
        this.startTime = bLiveAbsData.startTime;
        this.endTime = bLiveAbsData.endTime;
        this.callback = bLiveAbsData.callback;
        return this;
    }
}
