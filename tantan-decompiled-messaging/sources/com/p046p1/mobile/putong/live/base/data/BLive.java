package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLive extends BLiveAbsData implements Cloneable, Serializable {
    public static final BLive EMPTY = new_();
    public static JsonAdapter<BLive> JSON_ADAPTER = new ObjectJsonAdapter<BLive>() { // from class: com.p1.mobile.putong.live.base.data.BLive.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLive.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLive newInstance() {
            return new BLive();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLive bLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -1963349241:
                    if (str.equals("videoCaptureScore")) {
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
                case -1312076472:
                    if (str.equals("messageCount")) {
                        b = 5;
                    }
                    break;
                case -1142281334:
                    if (str.equals("recommendInfo")) {
                        b = 6;
                    }
                    break;
                case -1108386280:
                    if (str.equals("specialLabels")) {
                        b = 7;
                    }
                    break;
                case -1063660216:
                    if (str.equals("videoQualityConf")) {
                        b = 8;
                    }
                    break;
                case -1044920883:
                    if (str.equals("basicLabels")) {
                        b = 9;
                    }
                    break;
                case -987401911:
                    if (str.equals("pkInfo")) {
                        b = 10;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 11;
                    }
                    break;
                case -315634225:
                    if (str.equals("streamUrl")) {
                        b = 12;
                    }
                    break;
                case -172952532:
                    if (str.equals("callInfo")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -172220347:
                    if (str.equals("callback")) {
                        b = 14;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 15;
                    }
                    break;
                case 3506395:
                    if (str.equals("room")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 17;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 18;
                    }
                    break;
                case 405428811:
                    if (str.equals("videoCapture")) {
                        b = 19;
                    }
                    break;
                case 884554657:
                    if (str.equals("rewardPoint")) {
                        b = 20;
                    }
                    break;
                case 1058081890:
                    if (str.equals("officialShowLiveInfo")) {
                        b = 21;
                    }
                    break;
                case 1084273069:
                    if (str.equals("enterRoomType")) {
                        b = 22;
                    }
                    break;
                case 1108431579:
                    if (str.equals("streamCdnInfo")) {
                        b = 23;
                    }
                    break;
                case 1162036819:
                    if (str.equals("rewarderCount")) {
                        b = 24;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 25;
                    }
                    break;
                case 1417480367:
                    if (str.equals("liveMode")) {
                        b = 26;
                    }
                    break;
                case 1510898351:
                    if (str.equals("rtcInfo")) {
                        b = 27;
                    }
                    break;
                case 1566172293:
                    if (str.equals("multiCallInfo")) {
                        b = 28;
                    }
                    break;
                case 1604875188:
                    if (str.equals("officialShowCurrentAnchorInfo")) {
                        b = 29;
                    }
                    break;
                case 2065670015:
                    if (str.equals("redPacketIds")) {
                        b = 30;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLive.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 1:
                    bLive.videoCaptureScore = (float) jsonParser.getValueAsDouble();
                    return true;
                case 2:
                    bLive.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 3:
                    bLive.simplechat = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    bLive.anchor = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLive.messageCount = jsonParser.getValueAsLong();
                    return true;
                case 6:
                    bLive.recommendInfo = BLiveRecommendInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLive.specialLabels = JsonAdapter.parseArray(jsonParser, BLiveSuggestLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLive.videoQualityConf = BLiveVideoQualityConf.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLive.basicLabels = JsonAdapter.parseArray(jsonParser, BLiveSuggestLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLive.pkInfo = BLivePkInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLive.source = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLive.streamUrl = BLiveStreamUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLive.callInfo = BLiveCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLive.callback = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLive.f44323id = jsonParser.getValueAsString();
                    return false;
                case 16:
                    bLive.room = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLive.type = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLive.state = BLiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 19:
                    bLive.videoCapture = Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case 20:
                    bLive.rewardPoint = jsonParser.getValueAsDouble();
                    return true;
                case 21:
                    bLive.officialShowLiveInfo = BLiveOfficialShowInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLive.enterRoomType = jsonParser.getValueAsInt();
                    return true;
                case 23:
                    bLive.streamCdnInfo = BLiveStreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    bLive.rewarderCount = jsonParser.getValueAsDouble();
                    return true;
                case 25:
                    bLive.memberCount = jsonParser.getValueAsDouble();
                    return true;
                case 26:
                    bLive.liveMode = jsonParser.getValueAsString();
                    return true;
                case 27:
                    bLive.rtcInfo = BLiveRtcInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    bLive.multiCallInfo = BLiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    bLive.officialShowCurrentAnchorInfo = BLiveOfficialShowCurrentAnchorInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    bLive.redPacketIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLive bLive, JsonGenerator jsonGenerator) throws IOException {
            String str = bLive.f44323id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLive.room != null) {
                jsonGenerator.writeFieldName("room");
                BLiveOwner.JSON_ADAPTER.serialize(bLive.room, jsonGenerator, true);
            }
            if (bLive.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveOwner.JSON_ADAPTER.serialize(bLive.anchor, jsonGenerator, true);
            }
            if (bLive.recommendInfo != null) {
                jsonGenerator.writeFieldName("recommendInfo");
                BLiveRecommendInfo.JSON_ADAPTER.serialize(bLive.recommendInfo, jsonGenerator, true);
            }
            if (bLive.state != null) {
                jsonGenerator.writeFieldName("state");
                BLiveState.JSON_ADAPTER.serialize(bLive.state, jsonGenerator, true);
            }
            if (bLive.basicLabels != null) {
                jsonGenerator.writeFieldName("basicLabels");
                JsonAdapter.serializeArray(bLive.basicLabels, jsonGenerator, BLiveSuggestLabel.JSON_ADAPTER);
            }
            if (bLive.videoCapture != null) {
                jsonGenerator.writeFieldName("videoCapture");
                Converter.RAW_PICTURE_TO_MEDIA.serialize(bLive.videoCapture, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("memberCount", bLive.memberCount);
            String str2 = bLive.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLive.streamCdnInfo != null) {
                jsonGenerator.writeFieldName("streamCdnInfo");
                BLiveStreamCdnInfo.JSON_ADAPTER.serialize(bLive.streamCdnInfo, jsonGenerator, true);
            }
            if (bLive.streamUrl != null) {
                jsonGenerator.writeFieldName("streamUrl");
                BLiveStreamUrl.JSON_ADAPTER.serialize(bLive.streamUrl, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("rewardPoint", bLive.rewardPoint);
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(bLive.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(bLive.endTime), jsonGenerator, true);
            if (bLive.specialLabels != null) {
                jsonGenerator.writeFieldName("specialLabels");
                JsonAdapter.serializeArray(bLive.specialLabels, jsonGenerator, BLiveSuggestLabel.JSON_ADAPTER);
            }
            String str3 = bLive.callback;
            if (str3 != null) {
                jsonGenerator.writeStringField("callback", str3);
            }
            String str4 = bLive.liveMode;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveMode", str4);
            }
            jsonGenerator.writeBooleanField("simplechat", bLive.simplechat);
            jsonGenerator.writeNumberField("enterRoomType", bLive.enterRoomType);
            jsonGenerator.writeNumberField("messageCount", bLive.messageCount);
            jsonGenerator.writeNumberField("rewarderCount", bLive.rewarderCount);
            String str5 = bLive.source;
            if (str5 != null) {
                jsonGenerator.writeStringField("source", str5);
            }
            if (bLive.redPacketIds != null) {
                jsonGenerator.writeFieldName("redPacketIds");
                JsonAdapter.serializeArray(bLive.redPacketIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLive.pkInfo != null) {
                jsonGenerator.writeFieldName("pkInfo");
                BLivePkInfo.JSON_ADAPTER.serialize(bLive.pkInfo, jsonGenerator, true);
            }
            if (bLive.videoQualityConf != null) {
                jsonGenerator.writeFieldName("videoQualityConf");
                BLiveVideoQualityConf.JSON_ADAPTER.serialize(bLive.videoQualityConf, jsonGenerator, true);
            }
            if (bLive.callInfo != null) {
                jsonGenerator.writeFieldName("callInfo");
                BLiveCallInfo.JSON_ADAPTER.serialize(bLive.callInfo, jsonGenerator, true);
            }
            if (bLive.rtcInfo != null) {
                jsonGenerator.writeFieldName("rtcInfo");
                BLiveRtcInfo.JSON_ADAPTER.serialize(bLive.rtcInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("videoCaptureScore", bLive.videoCaptureScore);
            if (bLive.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                BLiveMultiCallInfo.JSON_ADAPTER.serialize(bLive.multiCallInfo, jsonGenerator, true);
            }
            if (bLive.officialShowCurrentAnchorInfo != null) {
                jsonGenerator.writeFieldName("officialShowCurrentAnchorInfo");
                BLiveOfficialShowCurrentAnchorInfo.JSON_ADAPTER.serialize(bLive.officialShowCurrentAnchorInfo, jsonGenerator, true);
            }
            if (bLive.officialShowLiveInfo != null) {
                jsonGenerator.writeFieldName("officialShowLiveInfo");
                BLiveOfficialShowInfo.JSON_ADAPTER.serialize(bLive.officialShowLiveInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blive";

    @NonNull
    @ProtobufIndex(index = 57)
    public BLiveCallInfo callInfo;
    private int from;

    @ProtobufIndex(index = 51)
    public long messageCount;

    @Nullable
    @ProtobufIndex(index = 60)
    public BLiveMultiCallInfo multiCallInfo;

    @Nullable
    @ProtobufIndex(index = 62)
    public BLiveOfficialShowCurrentAnchorInfo officialShowCurrentAnchorInfo;

    @Nullable
    @ProtobufIndex(index = 63)
    public BLiveOfficialShowInfo officialShowLiveInfo;

    @NonNull
    @ProtobufIndex(index = 55)
    public BLivePkInfo pkInfo;

    @NonNull
    @ProtobufIndex(index = 54)
    public List<String> redPacketIds;

    @ProtobufIndex(index = 52)
    public double rewarderCount;
    private String roomCoverUrl;

    @NonNull
    @ProtobufIndex(index = 58)
    public BLiveRtcInfo rtcInfo;

    @NonNull
    @ProtobufIndex(index = 53)
    public String source;

    @ProtobufIndex(index = 59)
    public float videoCaptureScore;

    @Nullable
    @ProtobufIndex(index = 56)
    public BLiveVideoQualityConf videoQualityConf;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m67660d(String str) {
        return str;
    }

    public static BLive new_() {
        BLive bLive = new BLive();
        bLive.nullCheck();
        return bLive;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsData, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLive mo223809clone() {
        BLive bLive = new BLive();
        bLive.f44323id = this.f44323id;
        BLiveOwner bLiveOwner = this.room;
        if (bLiveOwner != null) {
            bLive.room = bLiveOwner.mo223809clone();
        }
        BLiveOwner bLiveOwner2 = this.anchor;
        if (bLiveOwner2 != null) {
            bLive.anchor = bLiveOwner2.mo223809clone();
        }
        BLiveRecommendInfo bLiveRecommendInfo = this.recommendInfo;
        if (bLiveRecommendInfo != null) {
            bLive.recommendInfo = bLiveRecommendInfo.mo223809clone();
        }
        bLive.state = this.state;
        List<BLiveSuggestLabel> list = this.basicLabels;
        if (list != null) {
            bLive.basicLabels = ValueObject.util_map(list, new w9j() { // from class: l.pq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSuggestLabel) obj).mo223809clone();
                }
            });
        }
        Media media = this.videoCapture;
        if (media != null) {
            bLive.videoCapture = media.mo223809clone();
        }
        bLive.memberCount = this.memberCount;
        bLive.type = this.type;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        if (bLiveStreamCdnInfo != null) {
            bLive.streamCdnInfo = bLiveStreamCdnInfo.mo223809clone();
        }
        BLiveStreamUrl bLiveStreamUrl = this.streamUrl;
        if (bLiveStreamUrl != null) {
            bLive.streamUrl = bLiveStreamUrl.mo223809clone();
        }
        bLive.rewardPoint = this.rewardPoint;
        bLive.startTime = this.startTime;
        bLive.endTime = this.endTime;
        List<BLiveSuggestLabel> list2 = this.specialLabels;
        if (list2 != null) {
            bLive.specialLabels = ValueObject.util_map(list2, new w9j() { // from class: l.qq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSuggestLabel) obj).mo223809clone();
                }
            });
        }
        bLive.callback = this.callback;
        bLive.liveMode = this.liveMode;
        bLive.simplechat = this.simplechat;
        bLive.enterRoomType = this.enterRoomType;
        bLive.messageCount = this.messageCount;
        bLive.rewarderCount = this.rewarderCount;
        bLive.source = this.source;
        List<String> list3 = this.redPacketIds;
        if (list3 != null) {
            bLive.redPacketIds = ValueObject.util_map(list3, new w9j() { // from class: l.rq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLive.m67660d((String) obj);
                }
            });
        }
        BLivePkInfo bLivePkInfo = this.pkInfo;
        if (bLivePkInfo != null) {
            bLive.pkInfo = bLivePkInfo.mo223809clone();
        }
        BLiveVideoQualityConf bLiveVideoQualityConf = this.videoQualityConf;
        if (bLiveVideoQualityConf != null) {
            bLive.videoQualityConf = bLiveVideoQualityConf.mo223809clone();
        }
        BLiveCallInfo bLiveCallInfo = this.callInfo;
        if (bLiveCallInfo != null) {
            bLive.callInfo = bLiveCallInfo.mo223809clone();
        }
        BLiveRtcInfo bLiveRtcInfo = this.rtcInfo;
        if (bLiveRtcInfo != null) {
            bLive.rtcInfo = bLiveRtcInfo.mo223809clone();
        }
        bLive.videoCaptureScore = this.videoCaptureScore;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        if (bLiveMultiCallInfo != null) {
            bLive.multiCallInfo = bLiveMultiCallInfo.mo223809clone();
        }
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = this.officialShowCurrentAnchorInfo;
        if (bLiveOfficialShowCurrentAnchorInfo != null) {
            bLive.officialShowCurrentAnchorInfo = bLiveOfficialShowCurrentAnchorInfo.mo223809clone();
        }
        BLiveOfficialShowInfo bLiveOfficialShowInfo = this.officialShowLiveInfo;
        if (bLiveOfficialShowInfo != null) {
            bLive.officialShowLiveInfo = bLiveOfficialShowInfo.mo223809clone();
        }
        return bLive;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsData
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLive)) {
            return false;
        }
        BLive bLive = (BLive) obj;
        return super.equals(obj) && this.messageCount == bLive.messageCount && this.rewarderCount == bLive.rewarderCount && ValueObject.util_equals(this.source, bLive.source) && ValueObject.util_equals(this.redPacketIds, bLive.redPacketIds) && ValueObject.util_equals(this.pkInfo, bLive.pkInfo) && ValueObject.util_equals(this.videoQualityConf, bLive.videoQualityConf) && ValueObject.util_equals(this.callInfo, bLive.callInfo) && ValueObject.util_equals(this.rtcInfo, bLive.rtcInfo) && this.videoCaptureScore == bLive.videoCaptureScore && ValueObject.util_equals(this.multiCallInfo, bLive.multiCallInfo) && ValueObject.util_equals(this.officialShowCurrentAnchorInfo, bLive.officialShowCurrentAnchorInfo) && ValueObject.util_equals(this.officialShowLiveInfo, bLive.officialShowLiveInfo);
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsData, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getExtraRoomCoverUrl() {
        return this.roomCoverUrl;
    }

    public int getFrom() {
        return this.from;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsData
    public String getRecommendCategory() {
        return TextUtils.isEmpty(this.recommendInfo.category) ? "basic" : this.recommendInfo.category;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsData
    public String getRecommendCategoryForTrack() {
        return TextUtils.isEmpty(this.recommendInfo.category) ? "NA" : this.recommendInfo.category;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsData
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        long j = this.messageCount;
        int i2 = iHashCode + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.rewarderCount);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.source;
        int iHashCode2 = (i3 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.redPacketIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        BLivePkInfo bLivePkInfo = this.pkInfo;
        int iHashCode4 = (iHashCode3 + (bLivePkInfo != null ? bLivePkInfo.hashCode() : 0)) * 41;
        BLiveVideoQualityConf bLiveVideoQualityConf = this.videoQualityConf;
        int iHashCode5 = (iHashCode4 + (bLiveVideoQualityConf != null ? bLiveVideoQualityConf.hashCode() : 0)) * 41;
        BLiveCallInfo bLiveCallInfo = this.callInfo;
        int iHashCode6 = (iHashCode5 + (bLiveCallInfo != null ? bLiveCallInfo.hashCode() : 0)) * 41;
        BLiveRtcInfo bLiveRtcInfo = this.rtcInfo;
        int iHashCode7 = (((iHashCode6 + (bLiveRtcInfo != null ? bLiveRtcInfo.hashCode() : 0)) * 41) + Float.floatToIntBits(this.videoCaptureScore)) * 41;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        int iHashCode8 = (iHashCode7 + (bLiveMultiCallInfo != null ? bLiveMultiCallInfo.hashCode() : 0)) * 41;
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = this.officialShowCurrentAnchorInfo;
        int iHashCode9 = (iHashCode8 + (bLiveOfficialShowCurrentAnchorInfo != null ? bLiveOfficialShowCurrentAnchorInfo.hashCode() : 0)) * 41;
        BLiveOfficialShowInfo bLiveOfficialShowInfo = this.officialShowLiveInfo;
        int iHashCode10 = iHashCode9 + (bLiveOfficialShowInfo != null ? bLiveOfficialShowInfo.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsData
    public boolean isLiving() {
        return TEnum.equals(this.state, "onlive");
    }

    public boolean isMultiCall() {
        return NullChecker.m81303a(this.multiCallInfo) && this.multiCallInfo.onGoing;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsData, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.source == null) {
            this.source = "";
        }
        if (this.redPacketIds == null) {
            this.redPacketIds = new ArrayList();
        }
        if (this.pkInfo == null) {
            this.pkInfo = BLivePkInfo.new_();
        }
        if (this.callInfo == null) {
            this.callInfo = BLiveCallInfo.new_();
        }
        if (this.rtcInfo == null) {
            this.rtcInfo = BLiveRtcInfo.new_();
        }
    }

    public void setExtraRoomCoverUrl(String str) {
        this.roomCoverUrl = str;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    @Override // com.p046p1.mobile.putong.live.base.data.BLiveAbsData, com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
