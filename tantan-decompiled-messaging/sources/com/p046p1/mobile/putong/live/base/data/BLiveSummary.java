package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSummary newInstance() {
            return new BLiveSummary();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveSummary bLiveSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -2041374357:
                    if (str.equals("audienceCount")) {
                        b = 1;
                    }
                    break;
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 2;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 3;
                    }
                    break;
                case -1498891061:
                    if (str.equals("newFanbaseCount")) {
                        b = 4;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 5;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 6;
                    }
                    break;
                case -606197697:
                    if (str.equals("voiceCallCount")) {
                        b = 7;
                    }
                    break;
                case -542396476:
                    if (str.equals("receiveGiftsUserCount")) {
                        b = 8;
                    }
                    break;
                case -537014602:
                    if (str.equals("riseDirection")) {
                        b = 9;
                    }
                    break;
                case -535034901:
                    if (str.equals("voiceCallId")) {
                        b = 10;
                    }
                    break;
                case -348102266:
                    if (str.equals("chatMsgCount")) {
                        b = 11;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 12;
                    }
                    break;
                case 109638365:
                    if (str.equals("spark")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 170385743:
                    if (str.equals("strawberry")) {
                        b = 14;
                    }
                    break;
                case 884554657:
                    if (str.equals("rewardPoint")) {
                        b = 15;
                    }
                    break;
                case 901716478:
                    if (str.equals("officialShowSummary")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 994154946:
                    if (str.equals("liveOrder")) {
                        b = 17;
                    }
                    break;
                case 1162036819:
                    if (str.equals("rewarderCount")) {
                        b = 18;
                    }
                    break;
                case 1713039460:
                    if (str.equals("bonusGifts")) {
                        b = 19;
                    }
                    break;
                case 1951000546:
                    if (str.equals("receivedGifts")) {
                        b = 20;
                    }
                    break;
                case 2024310395:
                    if (str.equals("rewardPointType")) {
                        b = 21;
                    }
                    break;
                case 2073658910:
                    if (str.equals("newFollowCount")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveSummary.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 1:
                    bLiveSummary.audienceCount = jsonParser.getValueAsDouble();
                    return true;
                case 2:
                    bLiveSummary.duration = jsonParser.getValueAsLong();
                    return true;
                case 3:
                    bLiveSummary.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 4:
                    bLiveSummary.newFanbaseCount = jsonParser.getValueAsInt();
                    return true;
                case 5:
                    bLiveSummary.liveId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveSummary.roomId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveSummary.voiceCallCount = jsonParser.getValueAsDouble();
                    return true;
                case 8:
                    bLiveSummary.receiveGiftsUserCount = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    bLiveSummary.riseDirection = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveSummary.voiceCallId = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveSummary.chatMsgCount = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    bLiveSummary.type = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveSummary.spark = jsonParser.getValueAsInt();
                    return true;
                case 14:
                    bLiveSummary.strawberry = jsonParser.getValueAsDouble();
                    return true;
                case 15:
                    bLiveSummary.rewardPoint = jsonParser.getValueAsDouble();
                    return true;
                case 16:
                    bLiveSummary.officialShowSummary = BLiveOfficialShowSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLiveSummary.liveOrder = jsonParser.getValueAsLong();
                    return true;
                case 18:
                    bLiveSummary.rewarderCount = jsonParser.getValueAsDouble();
                    return true;
                case 19:
                    bLiveSummary.bonusGifts = BLiveVoiceBonusGifts.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    bLiveSummary.receivedGifts = jsonParser.getValueAsInt();
                    return true;
                case 21:
                    bLiveSummary.rewardPointType = jsonParser.getValueAsString();
                    return true;
                case 22:
                    bLiveSummary.newFollowCount = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSummary bLiveSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSummary.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            String str2 = bLiveSummary.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            jsonGenerator.writeNumberField("liveOrder", bLiveSummary.liveOrder);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveSummary.duration);
            jsonGenerator.writeNumberField("rewardPoint", bLiveSummary.rewardPoint);
            jsonGenerator.writeNumberField("rewarderCount", bLiveSummary.rewarderCount);
            jsonGenerator.writeNumberField("newFollowCount", bLiveSummary.newFollowCount);
            jsonGenerator.writeNumberField("audienceCount", bLiveSummary.audienceCount);
            jsonGenerator.writeNumberField("voiceCallCount", bLiveSummary.voiceCallCount);
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(bLiveSummary.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(bLiveSummary.endTime), jsonGenerator, true);
            String str3 = bLiveSummary.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            jsonGenerator.writeNumberField("strawberry", bLiveSummary.strawberry);
            if (bLiveSummary.bonusGifts != null) {
                jsonGenerator.writeFieldName("bonusGifts");
                BLiveVoiceBonusGifts.JSON_ADAPTER.serialize(bLiveSummary.bonusGifts, jsonGenerator, true);
            }
            String str4 = bLiveSummary.voiceCallId;
            if (str4 != null) {
                jsonGenerator.writeStringField("voiceCallId", str4);
            }
            jsonGenerator.writeNumberField("spark", bLiveSummary.spark);
            jsonGenerator.writeNumberField("receivedGifts", bLiveSummary.receivedGifts);
            jsonGenerator.writeNumberField("receiveGiftsUserCount", bLiveSummary.receiveGiftsUserCount);
            String str5 = bLiveSummary.rewardPointType;
            if (str5 != null) {
                jsonGenerator.writeStringField("rewardPointType", str5);
            }
            jsonGenerator.writeNumberField("newFanbaseCount", bLiveSummary.newFanbaseCount);
            jsonGenerator.writeNumberField("chatMsgCount", bLiveSummary.chatMsgCount);
            if (bLiveSummary.officialShowSummary != null) {
                jsonGenerator.writeFieldName("officialShowSummary");
                BLiveOfficialShowSummary.JSON_ADAPTER.serialize(bLiveSummary.officialShowSummary, jsonGenerator, true);
            }
            String str6 = bLiveSummary.riseDirection;
            if (str6 != null) {
                jsonGenerator.writeStringField("riseDirection", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesummary";

    @ProtobufIndex(index = 8)
    public double audienceCount;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveVoiceBonusGifts bonusGifts;

    @ProtobufIndex(index = 21)
    public int chatMsgCount;

    @ProtobufIndex(index = 4)
    public long duration;

    @ProtobufIndex(index = 11)
    public double endTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String liveId;

    @ProtobufIndex(index = 3)
    public long liveOrder;

    @ProtobufIndex(index = 20)
    public int newFanbaseCount;

    @ProtobufIndex(index = 7)
    public double newFollowCount;

    @Nullable
    @ProtobufIndex(index = 22)
    public BLiveOfficialShowSummary officialShowSummary;

    @ProtobufIndex(index = 18)
    public int receiveGiftsUserCount;

    @ProtobufIndex(index = 17)
    public int receivedGifts;

    @ProtobufIndex(index = 5)
    public double rewardPoint;

    @NonNull
    @ProtobufIndex(index = 19)
    public String rewardPointType;

    @ProtobufIndex(index = 6)
    public double rewarderCount;

    @NonNull
    @ProtobufIndex(index = 23)
    public String riseDirection;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @ProtobufIndex(index = 16)
    public int spark;

    @ProtobufIndex(index = 10)
    public double startTime;

    @ProtobufIndex(index = 13)
    public double strawberry;

    @NonNull
    @ProtobufIndex(index = 12)
    public String type;

    @ProtobufIndex(index = 9)
    public double voiceCallCount;

    @NonNull
    @ProtobufIndex(index = 15)
    public String voiceCallId;

    public static BLiveSummary new_() {
        BLiveSummary bLiveSummary = new BLiveSummary();
        bLiveSummary.nullCheck();
        return bLiveSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSummary mo223809clone() {
        BLiveSummary bLiveSummary = new BLiveSummary();
        bLiveSummary.liveId = this.liveId;
        bLiveSummary.roomId = this.roomId;
        bLiveSummary.liveOrder = this.liveOrder;
        bLiveSummary.duration = this.duration;
        bLiveSummary.rewardPoint = this.rewardPoint;
        bLiveSummary.rewarderCount = this.rewarderCount;
        bLiveSummary.newFollowCount = this.newFollowCount;
        bLiveSummary.audienceCount = this.audienceCount;
        bLiveSummary.voiceCallCount = this.voiceCallCount;
        bLiveSummary.startTime = this.startTime;
        bLiveSummary.endTime = this.endTime;
        bLiveSummary.type = this.type;
        bLiveSummary.strawberry = this.strawberry;
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = this.bonusGifts;
        if (bLiveVoiceBonusGifts != null) {
            bLiveSummary.bonusGifts = bLiveVoiceBonusGifts.mo223809clone();
        }
        bLiveSummary.voiceCallId = this.voiceCallId;
        bLiveSummary.spark = this.spark;
        bLiveSummary.receivedGifts = this.receivedGifts;
        bLiveSummary.receiveGiftsUserCount = this.receiveGiftsUserCount;
        bLiveSummary.rewardPointType = this.rewardPointType;
        bLiveSummary.newFanbaseCount = this.newFanbaseCount;
        bLiveSummary.chatMsgCount = this.chatMsgCount;
        BLiveOfficialShowSummary bLiveOfficialShowSummary = this.officialShowSummary;
        if (bLiveOfficialShowSummary != null) {
            bLiveSummary.officialShowSummary = bLiveOfficialShowSummary.mo223809clone();
        }
        bLiveSummary.riseDirection = this.riseDirection;
        return bLiveSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSummary)) {
            return false;
        }
        BLiveSummary bLiveSummary = (BLiveSummary) obj;
        return ValueObject.util_equals(this.liveId, bLiveSummary.liveId) && ValueObject.util_equals(this.roomId, bLiveSummary.roomId) && this.liveOrder == bLiveSummary.liveOrder && this.duration == bLiveSummary.duration && this.rewardPoint == bLiveSummary.rewardPoint && this.rewarderCount == bLiveSummary.rewarderCount && this.newFollowCount == bLiveSummary.newFollowCount && this.audienceCount == bLiveSummary.audienceCount && this.voiceCallCount == bLiveSummary.voiceCallCount && this.startTime == bLiveSummary.startTime && this.endTime == bLiveSummary.endTime && ValueObject.util_equals(this.type, bLiveSummary.type) && this.strawberry == bLiveSummary.strawberry && ValueObject.util_equals(this.bonusGifts, bLiveSummary.bonusGifts) && ValueObject.util_equals(this.voiceCallId, bLiveSummary.voiceCallId) && this.spark == bLiveSummary.spark && this.receivedGifts == bLiveSummary.receivedGifts && this.receiveGiftsUserCount == bLiveSummary.receiveGiftsUserCount && ValueObject.util_equals(this.rewardPointType, bLiveSummary.rewardPointType) && this.newFanbaseCount == bLiveSummary.newFanbaseCount && this.chatMsgCount == bLiveSummary.chatMsgCount && ValueObject.util_equals(this.officialShowSummary, bLiveSummary.officialShowSummary) && ValueObject.util_equals(this.riseDirection, bLiveSummary.riseDirection);
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
        String str = this.liveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.liveOrder;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.duration;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.rewardPoint);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.rewarderCount);
        int i6 = (i5 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.newFollowCount);
        int i7 = (i6 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.audienceCount);
        int i8 = (i7 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.voiceCallCount);
        int i9 = (i8 * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.startTime);
        int i10 = (i9 * 41) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.endTime);
        int i11 = ((i10 * 41) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 41;
        String str3 = this.type;
        int iHashCode3 = i11 + (str3 != null ? str3.hashCode() : 0);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.strawberry);
        int i12 = ((iHashCode3 * 41) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 41;
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = this.bonusGifts;
        int iHashCode4 = (i12 + (bLiveVoiceBonusGifts != null ? bLiveVoiceBonusGifts.hashCode() : 0)) * 41;
        String str4 = this.voiceCallId;
        int iHashCode5 = (((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.spark) * 41) + this.receivedGifts) * 41) + this.receiveGiftsUserCount) * 41;
        String str5 = this.rewardPointType;
        int iHashCode6 = (((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.newFanbaseCount) * 41) + this.chatMsgCount) * 41;
        BLiveOfficialShowSummary bLiveOfficialShowSummary = this.officialShowSummary;
        int iHashCode7 = (iHashCode6 + (bLiveOfficialShowSummary != null ? bLiveOfficialShowSummary.hashCode() : 0)) * 41;
        String str6 = this.riseDirection;
        int iHashCode8 = iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.bonusGifts == null) {
            this.bonusGifts = BLiveVoiceBonusGifts.new_();
        }
        if (this.voiceCallId == null) {
            this.voiceCallId = "";
        }
        if (this.rewardPointType == null) {
            this.rewardPointType = "";
        }
        if (this.riseDirection == null) {
            this.riseDirection = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
