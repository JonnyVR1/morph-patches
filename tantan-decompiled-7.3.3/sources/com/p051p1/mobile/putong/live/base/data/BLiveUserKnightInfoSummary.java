package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserKnightInfoSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserKnightInfoSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserKnightInfoSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserKnightInfoSummary.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserKnightInfoSummary newInstance() {
            return new BLiveUserKnightInfoSummary();
        }

        public boolean parseField(BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sessionSendCoins":
                    bLiveUserKnightInfoSummary.sessionSendCoins = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    bLiveUserKnightInfoSummary.userId = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    bLiveUserKnightInfoSummary.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "isInRoom":
                    bLiveUserKnightInfoSummary.isInRoom = jsonParser.getValueAsBoolean();
                    return true;
                case "createdTime":
                    bLiveUserKnightInfoSummary.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "isKnight":
                    bLiveUserKnightInfoSummary.isKnight = jsonParser.getValueAsBoolean();
                    return true;
                case "guardType":
                    bLiveUserKnightInfoSummary.guardType = BLiveGuardType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "guardScoreIncrement":
                    bLiveUserKnightInfoSummary.guardScoreIncrement = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isKnight", bLiveUserKnightInfoSummary.isKnight);
            jsonGenerator.writeNumberField("createdTime", bLiveUserKnightInfoSummary.createdTime);
            jsonGenerator.writeNumberField("expireTime", bLiveUserKnightInfoSummary.expireTime);
            String str = bLiveUserKnightInfoSummary.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("sessionSendCoins", bLiveUserKnightInfoSummary.sessionSendCoins);
            if (bLiveUserKnightInfoSummary.guardType != null) {
                jsonGenerator.writeFieldName("guardType");
                BLiveGuardType.JSON_ADAPTER.serialize(bLiveUserKnightInfoSummary.guardType, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isInRoom", bLiveUserKnightInfoSummary.isInRoom);
            jsonGenerator.writeNumberField("guardScoreIncrement", bLiveUserKnightInfoSummary.guardScoreIncrement);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserKnightInfoSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserknightinfosummary";

    @ProtobufIndex(index = 2)
    public long createdTime;

    @ProtobufIndex(index = 3)
    public long expireTime;

    @ProtobufIndex(index = 8)
    public long guardScoreIncrement;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveGuardType guardType;

    @ProtobufIndex(index = 7)
    public boolean isInRoom;

    @ProtobufIndex(index = 1)
    public boolean isKnight;

    @ProtobufIndex(index = 5)
    public int sessionSendCoins;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userId;

    public static BLiveUserKnightInfoSummary new_() {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary = new BLiveUserKnightInfoSummary();
        bLiveUserKnightInfoSummary.nullCheck();
        return bLiveUserKnightInfoSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserKnightInfoSummary mo225055clone() {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary = new BLiveUserKnightInfoSummary();
        bLiveUserKnightInfoSummary.isKnight = this.isKnight;
        bLiveUserKnightInfoSummary.createdTime = this.createdTime;
        bLiveUserKnightInfoSummary.expireTime = this.expireTime;
        bLiveUserKnightInfoSummary.userId = this.userId;
        bLiveUserKnightInfoSummary.sessionSendCoins = this.sessionSendCoins;
        bLiveUserKnightInfoSummary.guardType = this.guardType;
        bLiveUserKnightInfoSummary.isInRoom = this.isInRoom;
        bLiveUserKnightInfoSummary.guardScoreIncrement = this.guardScoreIncrement;
        return bLiveUserKnightInfoSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserKnightInfoSummary)) {
            return false;
        }
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary = (BLiveUserKnightInfoSummary) obj;
        return this.isKnight == bLiveUserKnightInfoSummary.isKnight && this.createdTime == bLiveUserKnightInfoSummary.createdTime && this.expireTime == bLiveUserKnightInfoSummary.expireTime && ValueObject.util_equals(this.userId, bLiveUserKnightInfoSummary.userId) && this.sessionSendCoins == bLiveUserKnightInfoSummary.sessionSendCoins && ValueObject.util_equals(this.guardType, bLiveUserKnightInfoSummary.guardType) && this.isInRoom == bLiveUserKnightInfoSummary.isInRoom && this.guardScoreIncrement == bLiveUserKnightInfoSummary.guardScoreIncrement;
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
        int i3 = this.isKnight ? 1231 : 1237;
        long j = this.createdTime;
        int i4 = (((i2 + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.expireTime;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.userId;
        int iHashCode = (((i5 + (str != null ? str.hashCode() : 0)) * 41) + this.sessionSendCoins) * 41;
        BLiveGuardType bLiveGuardType = this.guardType;
        int iHashCode2 = (((iHashCode + (bLiveGuardType != null ? bLiveGuardType.hashCode() : 0)) * 41) + (this.isInRoom ? 1231 : 1237)) * 41;
        long j3 = this.guardScoreIncrement;
        int i6 = iHashCode2 + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i6;
        return i6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.guardType == null) {
            this.guardType = (BLiveGuardType) BLiveGuardType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
