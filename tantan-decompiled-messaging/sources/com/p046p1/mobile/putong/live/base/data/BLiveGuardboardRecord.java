package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Followship;
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
public class BLiveGuardboardRecord extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGuardboardRecord> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGuardboardRecord>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGuardboardRecord.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGuardboardRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGuardboardRecord newInstance() {
            return new BLiveGuardboardRecord();
        }

        public boolean parseField(BLiveGuardboardRecord bLiveGuardboardRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "followship":
                    bLiveGuardboardRecord.followship = jsonParser.getValueAsString();
                    return true;
                case "amount":
                    bLiveGuardboardRecord.amount = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveGuardboardRecord.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveGuardboardRecord.roomId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveGuardboardRecord.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveGuardboardRecord.userName = jsonParser.getValueAsString();
                    return true;
                case "gap":
                    bLiveGuardboardRecord.gap = jsonParser.getValueAsInt();
                    return true;
                case "rank":
                    bLiveGuardboardRecord.rank = jsonParser.getValueAsInt();
                    return true;
                case "userImage":
                    bLiveGuardboardRecord.userImage = jsonParser.getValueAsString();
                    return true;
                case "liveStates":
                    bLiveGuardboardRecord.liveStates = BLiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGuardboardRecord bLiveGuardboardRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGuardboardRecord.amount;
            if (str != null) {
                jsonGenerator.writeStringField("amount", str);
            }
            String str2 = bLiveGuardboardRecord.followship;
            if (str2 != null) {
                jsonGenerator.writeStringField(Followship.TYPE, str2);
            }
            jsonGenerator.writeNumberField("gap", bLiveGuardboardRecord.gap);
            String str3 = bLiveGuardboardRecord.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            if (bLiveGuardboardRecord.liveStates != null) {
                jsonGenerator.writeFieldName("liveStates");
                BLiveState.JSON_ADAPTER.serialize(bLiveGuardboardRecord.liveStates, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveGuardboardRecord.rank);
            String str4 = bLiveGuardboardRecord.roomId;
            if (str4 != null) {
                jsonGenerator.writeStringField("roomId", str4);
            }
            String str5 = bLiveGuardboardRecord.userId;
            if (str5 != null) {
                jsonGenerator.writeStringField("userId", str5);
            }
            String str6 = bLiveGuardboardRecord.userName;
            if (str6 != null) {
                jsonGenerator.writeStringField("userName", str6);
            }
            String str7 = bLiveGuardboardRecord.userImage;
            if (str7 != null) {
                jsonGenerator.writeStringField("userImage", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGuardboardRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveguardboardrecord";

    @NonNull
    @ProtobufIndex(index = 1)
    public String amount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String followship;

    @ProtobufIndex(index = 3)
    public int gap;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveState liveStates;

    @ProtobufIndex(index = 6)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 7)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String userImage;

    @NonNull
    @ProtobufIndex(index = 9)
    public String userName;

    public static BLiveGuardboardRecord new_() {
        BLiveGuardboardRecord bLiveGuardboardRecord = new BLiveGuardboardRecord();
        bLiveGuardboardRecord.nullCheck();
        return bLiveGuardboardRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGuardboardRecord mo223809clone() {
        BLiveGuardboardRecord bLiveGuardboardRecord = new BLiveGuardboardRecord();
        bLiveGuardboardRecord.amount = this.amount;
        bLiveGuardboardRecord.followship = this.followship;
        bLiveGuardboardRecord.gap = this.gap;
        bLiveGuardboardRecord.liveId = this.liveId;
        bLiveGuardboardRecord.liveStates = this.liveStates;
        bLiveGuardboardRecord.rank = this.rank;
        bLiveGuardboardRecord.roomId = this.roomId;
        bLiveGuardboardRecord.userId = this.userId;
        bLiveGuardboardRecord.userName = this.userName;
        bLiveGuardboardRecord.userImage = this.userImage;
        return bLiveGuardboardRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGuardboardRecord)) {
            return false;
        }
        BLiveGuardboardRecord bLiveGuardboardRecord = (BLiveGuardboardRecord) obj;
        return ValueObject.util_equals(this.amount, bLiveGuardboardRecord.amount) && ValueObject.util_equals(this.followship, bLiveGuardboardRecord.followship) && this.gap == bLiveGuardboardRecord.gap && ValueObject.util_equals(this.liveId, bLiveGuardboardRecord.liveId) && ValueObject.util_equals(this.liveStates, bLiveGuardboardRecord.liveStates) && this.rank == bLiveGuardboardRecord.rank && ValueObject.util_equals(this.roomId, bLiveGuardboardRecord.roomId) && ValueObject.util_equals(this.userId, bLiveGuardboardRecord.userId) && ValueObject.util_equals(this.userName, bLiveGuardboardRecord.userName) && ValueObject.util_equals(this.userImage, bLiveGuardboardRecord.userImage);
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
        String str = this.amount;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.followship;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.gap) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveState bLiveState = this.liveStates;
        int iHashCode4 = (((iHashCode3 + (bLiveState != null ? bLiveState.hashCode() : 0)) * 41) + this.rank) * 41;
        String str4 = this.roomId;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userId;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.userName;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.userImage;
        int iHashCode8 = iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.amount == null) {
            this.amount = "";
        }
        if (this.followship == null) {
            this.followship = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.liveStates == null) {
            this.liveStates = (BLiveState) BLiveState.JSON_ADAPTER.defaultEnum();
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
