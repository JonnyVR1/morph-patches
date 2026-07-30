package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceCallSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCallSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCallSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCallSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCallSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCallSummary newInstance() {
            return new BLiveVoiceCallSummary();
        }

        public boolean parseField(BLiveVoiceCallSummary bLiveVoiceCallSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveVoiceCallSummary.duration = jsonParser.getValueAsLong();
                    return true;
                case "voiceCallId":
                    bLiveVoiceCallSummary.voiceCallId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceCallSummary.f44489id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveVoiceCallSummary.type = jsonParser.getValueAsString();
                    return true;
                case "strawberry":
                    bLiveVoiceCallSummary.strawberry = jsonParser.getValueAsLong();
                    return true;
                case "rewardPoint":
                    bLiveVoiceCallSummary.rewardPoint = jsonParser.getValueAsLong();
                    return true;
                case "display":
                    bLiveVoiceCallSummary.display = jsonParser.getValueAsBoolean();
                    return true;
                case "bonusGifts":
                    bLiveVoiceCallSummary.bonusGifts = BLiveVoiceBonusGifts.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "newFollowCount":
                    bLiveVoiceCallSummary.newFollowCount = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCallSummary bLiveVoiceCallSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCallSummary.f44489id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceCallSummary.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveVoiceCallSummary.voiceCallId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceCallId", str3);
            }
            jsonGenerator.writeNumberField("newFollowCount", bLiveVoiceCallSummary.newFollowCount);
            jsonGenerator.writeNumberField("rewardPoint", bLiveVoiceCallSummary.rewardPoint);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveVoiceCallSummary.duration);
            jsonGenerator.writeNumberField("strawberry", bLiveVoiceCallSummary.strawberry);
            if (bLiveVoiceCallSummary.bonusGifts != null) {
                jsonGenerator.writeFieldName("bonusGifts");
                BLiveVoiceBonusGifts.JSON_ADAPTER.serialize(bLiveVoiceCallSummary.bonusGifts, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, bLiveVoiceCallSummary.display);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCallSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecallsummary";

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveVoiceBonusGifts bonusGifts;

    @ProtobufIndex(index = 9)
    public boolean display;

    @ProtobufIndex(index = 6)
    public long duration;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44489id;

    @ProtobufIndex(index = 4)
    public long newFollowCount;

    @ProtobufIndex(index = 5)
    public long rewardPoint;

    @ProtobufIndex(index = 7)
    public long strawberry;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceCallId;

    public static BLiveVoiceCallSummary new_() {
        BLiveVoiceCallSummary bLiveVoiceCallSummary = new BLiveVoiceCallSummary();
        bLiveVoiceCallSummary.nullCheck();
        return bLiveVoiceCallSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCallSummary mo223809clone() {
        BLiveVoiceCallSummary bLiveVoiceCallSummary = new BLiveVoiceCallSummary();
        bLiveVoiceCallSummary.f44489id = this.f44489id;
        bLiveVoiceCallSummary.type = this.type;
        bLiveVoiceCallSummary.voiceCallId = this.voiceCallId;
        bLiveVoiceCallSummary.newFollowCount = this.newFollowCount;
        bLiveVoiceCallSummary.rewardPoint = this.rewardPoint;
        bLiveVoiceCallSummary.duration = this.duration;
        bLiveVoiceCallSummary.strawberry = this.strawberry;
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = this.bonusGifts;
        if (bLiveVoiceBonusGifts != null) {
            bLiveVoiceCallSummary.bonusGifts = bLiveVoiceBonusGifts.mo223809clone();
        }
        bLiveVoiceCallSummary.display = this.display;
        return bLiveVoiceCallSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCallSummary)) {
            return false;
        }
        BLiveVoiceCallSummary bLiveVoiceCallSummary = (BLiveVoiceCallSummary) obj;
        return ValueObject.util_equals(this.f44489id, bLiveVoiceCallSummary.f44489id) && ValueObject.util_equals(this.type, bLiveVoiceCallSummary.type) && ValueObject.util_equals(this.voiceCallId, bLiveVoiceCallSummary.voiceCallId) && this.newFollowCount == bLiveVoiceCallSummary.newFollowCount && this.rewardPoint == bLiveVoiceCallSummary.rewardPoint && this.duration == bLiveVoiceCallSummary.duration && this.strawberry == bLiveVoiceCallSummary.strawberry && ValueObject.util_equals(this.bonusGifts, bLiveVoiceCallSummary.bonusGifts) && this.display == bLiveVoiceCallSummary.display;
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
        String str = this.f44489id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceCallId;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.newFollowCount;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.rewardPoint;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.duration;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.strawberry;
        int i6 = (i5 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = this.bonusGifts;
        int iHashCode4 = ((i6 + (bLiveVoiceBonusGifts != null ? bLiveVoiceBonusGifts.hashCode() : 0)) * 41) + (this.display ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44489id == null) {
            this.f44489id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.voiceCallId == null) {
            this.voiceCallId = "";
        }
        if (this.bonusGifts == null) {
            this.bonusGifts = BLiveVoiceBonusGifts.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
