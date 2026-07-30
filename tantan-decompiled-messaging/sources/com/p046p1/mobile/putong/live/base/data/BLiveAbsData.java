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
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
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
import org.spongycastle.math.p131ec.Tnaf;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAbsData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAbsData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAbsData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAbsData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAbsData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAbsData newInstance() {
            return new BLiveAbsData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveAbsData bLiveAbsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 1;
                    }
                    break;
                case -1431135222:
                    if (str.equals("simplechat")) {
                        b = 2;
                    }
                    break;
                case -1413299531:
                    if (str.equals("anchor")) {
                        b = 3;
                    }
                    break;
                case -1142281334:
                    if (str.equals("recommendInfo")) {
                        b = 4;
                    }
                    break;
                case -1108386280:
                    if (str.equals("specialLabels")) {
                        b = 5;
                    }
                    break;
                case -1044920883:
                    if (str.equals("basicLabels")) {
                        b = 6;
                    }
                    break;
                case -315634225:
                    if (str.equals("streamUrl")) {
                        b = 7;
                    }
                    break;
                case -172220347:
                    if (str.equals("callback")) {
                        b = 8;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 9;
                    }
                    break;
                case 3506395:
                    if (str.equals("room")) {
                        b = 10;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 11;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 12;
                    }
                    break;
                case 405428811:
                    if (str.equals("videoCapture")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 884554657:
                    if (str.equals("rewardPoint")) {
                        b = 14;
                    }
                    break;
                case 1084273069:
                    if (str.equals("enterRoomType")) {
                        b = 15;
                    }
                    break;
                case 1108431579:
                    if (str.equals("streamCdnInfo")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 17;
                    }
                    break;
                case 1417480367:
                    if (str.equals("liveMode")) {
                        b = 18;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveAbsData.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 1:
                    bLiveAbsData.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 2:
                    bLiveAbsData.simplechat = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    bLiveAbsData.anchor = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveAbsData.recommendInfo = BLiveRecommendInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveAbsData.specialLabels = JsonAdapter.parseArray(jsonParser, BLiveSuggestLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveAbsData.basicLabels = JsonAdapter.parseArray(jsonParser, BLiveSuggestLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveAbsData.streamUrl = BLiveStreamUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveAbsData.callback = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveAbsData.f44323id = jsonParser.getValueAsString();
                    return false;
                case 10:
                    bLiveAbsData.room = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveAbsData.type = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveAbsData.state = BLiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 13:
                    bLiveAbsData.videoCapture = Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case 14:
                    bLiveAbsData.rewardPoint = jsonParser.getValueAsDouble();
                    return true;
                case 15:
                    bLiveAbsData.enterRoomType = jsonParser.getValueAsInt();
                    return true;
                case 16:
                    bLiveAbsData.streamCdnInfo = BLiveStreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLiveAbsData.memberCount = jsonParser.getValueAsDouble();
                    return true;
                case 18:
                    bLiveAbsData.liveMode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAbsData bLiveAbsData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAbsData.f44323id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveAbsData.room != null) {
                jsonGenerator.writeFieldName("room");
                BLiveOwner.JSON_ADAPTER.serialize(bLiveAbsData.room, jsonGenerator, true);
            }
            if (bLiveAbsData.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveOwner.JSON_ADAPTER.serialize(bLiveAbsData.anchor, jsonGenerator, true);
            }
            if (bLiveAbsData.recommendInfo != null) {
                jsonGenerator.writeFieldName("recommendInfo");
                BLiveRecommendInfo.JSON_ADAPTER.serialize(bLiveAbsData.recommendInfo, jsonGenerator, true);
            }
            if (bLiveAbsData.state != null) {
                jsonGenerator.writeFieldName("state");
                BLiveState.JSON_ADAPTER.serialize(bLiveAbsData.state, jsonGenerator, true);
            }
            if (bLiveAbsData.basicLabels != null) {
                jsonGenerator.writeFieldName("basicLabels");
                JsonAdapter.serializeArray(bLiveAbsData.basicLabels, jsonGenerator, BLiveSuggestLabel.JSON_ADAPTER);
            }
            if (bLiveAbsData.videoCapture != null) {
                jsonGenerator.writeFieldName("videoCapture");
                Converter.RAW_PICTURE_TO_MEDIA.serialize(bLiveAbsData.videoCapture, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("memberCount", bLiveAbsData.memberCount);
            String str2 = bLiveAbsData.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLiveAbsData.streamCdnInfo != null) {
                jsonGenerator.writeFieldName("streamCdnInfo");
                BLiveStreamCdnInfo.JSON_ADAPTER.serialize(bLiveAbsData.streamCdnInfo, jsonGenerator, true);
            }
            if (bLiveAbsData.streamUrl != null) {
                jsonGenerator.writeFieldName("streamUrl");
                BLiveStreamUrl.JSON_ADAPTER.serialize(bLiveAbsData.streamUrl, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("rewardPoint", bLiveAbsData.rewardPoint);
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(bLiveAbsData.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(bLiveAbsData.endTime), jsonGenerator, true);
            if (bLiveAbsData.specialLabels != null) {
                jsonGenerator.writeFieldName("specialLabels");
                JsonAdapter.serializeArray(bLiveAbsData.specialLabels, jsonGenerator, BLiveSuggestLabel.JSON_ADAPTER);
            }
            String str3 = bLiveAbsData.callback;
            if (str3 != null) {
                jsonGenerator.writeStringField("callback", str3);
            }
            String str4 = bLiveAbsData.liveMode;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveMode", str4);
            }
            jsonGenerator.writeBooleanField("simplechat", bLiveAbsData.simplechat);
            jsonGenerator.writeNumberField("enterRoomType", bLiveAbsData.enterRoomType);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAbsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String MULTI_CALL = "multi_call";
    public static final String NORMAL_LIVE = "live";
    public static final String TYPE = "bliveabsdata";
    public static final String VOICE_LIVE = "voice-live";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveOwner anchor;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveSuggestLabel> basicLabels;

    @NonNull
    @ProtobufIndex(index = 16)
    public String callback;

    @ProtobufIndex(index = 14)
    public double endTime;

    @ProtobufIndex(index = 20)
    public int enterRoomType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44323id;

    @NonNull
    @ProtobufIndex(index = 19)
    public String liveMode;

    @ProtobufIndex(index = 8)
    public double memberCount;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveRecommendInfo recommendInfo;
    public String requestExtra;

    @ProtobufIndex(index = 12)
    public double rewardPoint;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOwner room;

    @ProtobufIndex(index = 18)
    public boolean simplechat;

    @NonNull
    @ProtobufIndex(index = 15)
    public List<BLiveSuggestLabel> specialLabels;

    @ProtobufIndex(index = 13)
    public double startTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveState state;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveStreamCdnInfo streamCdnInfo;

    @NonNull
    @ProtobufIndex(index = 11)
    public BLiveStreamUrl streamUrl;
    public String subSource;

    @NonNull
    @ProtobufIndex(index = 9)
    public String type;

    @Nullable
    @ProtobufIndex(index = 7)
    public Media videoCapture;

    public static BLiveAbsData new_() {
        BLiveAbsData bLiveAbsData = new BLiveAbsData();
        bLiveAbsData.nullCheck();
        return bLiveAbsData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAbsData mo223809clone() {
        BLiveAbsData bLiveAbsData = new BLiveAbsData();
        bLiveAbsData.f44323id = this.f44323id;
        BLiveOwner bLiveOwner = this.room;
        if (bLiveOwner != null) {
            bLiveAbsData.room = bLiveOwner.mo223809clone();
        }
        BLiveOwner bLiveOwner2 = this.anchor;
        if (bLiveOwner2 != null) {
            bLiveAbsData.anchor = bLiveOwner2.mo223809clone();
        }
        BLiveRecommendInfo bLiveRecommendInfo = this.recommendInfo;
        if (bLiveRecommendInfo != null) {
            bLiveAbsData.recommendInfo = bLiveRecommendInfo.mo223809clone();
        }
        bLiveAbsData.state = this.state;
        List<BLiveSuggestLabel> list = this.basicLabels;
        if (list != null) {
            bLiveAbsData.basicLabels = ValueObject.util_map(list, new w9j() { // from class: l.sq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSuggestLabel) obj).mo223809clone();
                }
            });
        }
        Media media = this.videoCapture;
        if (media != null) {
            bLiveAbsData.videoCapture = media.mo223809clone();
        }
        bLiveAbsData.memberCount = this.memberCount;
        bLiveAbsData.type = this.type;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        if (bLiveStreamCdnInfo != null) {
            bLiveAbsData.streamCdnInfo = bLiveStreamCdnInfo.mo223809clone();
        }
        BLiveStreamUrl bLiveStreamUrl = this.streamUrl;
        if (bLiveStreamUrl != null) {
            bLiveAbsData.streamUrl = bLiveStreamUrl.mo223809clone();
        }
        bLiveAbsData.rewardPoint = this.rewardPoint;
        bLiveAbsData.startTime = this.startTime;
        bLiveAbsData.endTime = this.endTime;
        List<BLiveSuggestLabel> list2 = this.specialLabels;
        if (list2 != null) {
            bLiveAbsData.specialLabels = ValueObject.util_map(list2, new w9j() { // from class: l.tq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSuggestLabel) obj).mo223809clone();
                }
            });
        }
        bLiveAbsData.callback = this.callback;
        bLiveAbsData.liveMode = this.liveMode;
        bLiveAbsData.simplechat = this.simplechat;
        bLiveAbsData.enterRoomType = this.enterRoomType;
        return bLiveAbsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAbsData)) {
            return false;
        }
        BLiveAbsData bLiveAbsData = (BLiveAbsData) obj;
        return ValueObject.util_equals(this.f44323id, bLiveAbsData.f44323id) && ValueObject.util_equals(this.room, bLiveAbsData.room) && ValueObject.util_equals(this.anchor, bLiveAbsData.anchor) && ValueObject.util_equals(this.recommendInfo, bLiveAbsData.recommendInfo) && ValueObject.util_equals(this.state, bLiveAbsData.state) && ValueObject.util_equals(this.basicLabels, bLiveAbsData.basicLabels) && ValueObject.util_equals(this.videoCapture, bLiveAbsData.videoCapture) && this.memberCount == bLiveAbsData.memberCount && ValueObject.util_equals(this.type, bLiveAbsData.type) && ValueObject.util_equals(this.streamCdnInfo, bLiveAbsData.streamCdnInfo) && ValueObject.util_equals(this.streamUrl, bLiveAbsData.streamUrl) && this.rewardPoint == bLiveAbsData.rewardPoint && this.startTime == bLiveAbsData.startTime && this.endTime == bLiveAbsData.endTime && ValueObject.util_equals(this.specialLabels, bLiveAbsData.specialLabels) && ValueObject.util_equals(this.callback, bLiveAbsData.callback) && ValueObject.util_equals(this.liveMode, bLiveAbsData.liveMode) && this.simplechat == bLiveAbsData.simplechat && this.enterRoomType == bLiveAbsData.enterRoomType;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getRecommendCategory() {
        return TextUtils.isEmpty(this.recommendInfo.category) ? "basic" : this.recommendInfo.category;
    }

    public String getRecommendCategoryForTrack() {
        return TextUtils.isEmpty(this.recommendInfo.category) ? "NA" : this.recommendInfo.category;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f44323id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveOwner bLiveOwner = this.room;
        int iHashCode2 = (iHashCode + (bLiveOwner != null ? bLiveOwner.hashCode() : 0)) * 41;
        BLiveOwner bLiveOwner2 = this.anchor;
        int iHashCode3 = (iHashCode2 + (bLiveOwner2 != null ? bLiveOwner2.hashCode() : 0)) * 41;
        BLiveRecommendInfo bLiveRecommendInfo = this.recommendInfo;
        int iHashCode4 = (iHashCode3 + (bLiveRecommendInfo != null ? bLiveRecommendInfo.hashCode() : 0)) * 41;
        BLiveState bLiveState = this.state;
        int iHashCode5 = (iHashCode4 + (bLiveState != null ? bLiveState.hashCode() : 0)) * 41;
        List<BLiveSuggestLabel> list = this.basicLabels;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        Media media = this.videoCapture;
        int iHashCode7 = media != null ? media.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.memberCount);
        int i3 = (((iHashCode6 + iHashCode7) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.type;
        int iHashCode8 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        int iHashCode9 = (iHashCode8 + (bLiveStreamCdnInfo != null ? bLiveStreamCdnInfo.hashCode() : 0)) * 41;
        BLiveStreamUrl bLiveStreamUrl = this.streamUrl;
        int iHashCode10 = iHashCode9 + (bLiveStreamUrl != null ? bLiveStreamUrl.hashCode() : 0);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.rewardPoint);
        int i4 = (iHashCode10 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.startTime);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.endTime);
        int i6 = ((i5 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41;
        List<BLiveSuggestLabel> list2 = this.specialLabels;
        int iHashCode11 = (i6 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str3 = this.callback;
        int iHashCode12 = (iHashCode11 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveMode;
        int iHashCode13 = ((((iHashCode12 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.simplechat ? 1231 : 1237)) * 41) + this.enterRoomType;
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    public boolean isFriendLive() {
        return "friends".equals(this.liveMode);
    }

    public boolean isLiving() {
        return TEnum.equals(this.state, "onlive");
    }

    public boolean isNormalLive() {
        return TextUtils.equals("live", this.type) || (this instanceof BLive);
    }

    public boolean isOfficialShowRoom() {
        return TextUtils.equals(this.liveMode, "officialShow");
    }

    public boolean isVoiceLive() {
        return TextUtils.equals(VOICE_LIVE, this.type) || (this instanceof BLiveVoice);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44323id == null) {
            this.f44323id = "";
        }
        if (this.room == null) {
            this.room = BLiveOwner.new_();
        }
        if (this.anchor == null) {
            this.anchor = BLiveOwner.new_();
        }
        if (this.recommendInfo == null) {
            this.recommendInfo = BLiveRecommendInfo.new_();
        }
        if (this.state == null) {
            this.state = (BLiveState) BLiveState.JSON_ADAPTER.defaultEnum();
        }
        if (this.basicLabels == null) {
            this.basicLabels = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.streamCdnInfo == null) {
            this.streamCdnInfo = BLiveStreamCdnInfo.new_();
        }
        if (this.streamUrl == null) {
            this.streamUrl = BLiveStreamUrl.new_();
        }
        if (this.specialLabels == null) {
            this.specialLabels = new ArrayList();
        }
        if (this.callback == null) {
            this.callback = "";
        }
        if (this.liveMode == null) {
            this.liveMode = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
