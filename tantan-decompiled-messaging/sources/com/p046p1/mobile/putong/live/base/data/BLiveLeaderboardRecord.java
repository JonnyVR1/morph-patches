package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Owner;
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
public class BLiveLeaderboardRecord extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLeaderboardRecord> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLeaderboardRecord>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLeaderboardRecord.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLeaderboardRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLeaderboardRecord newInstance() {
            return new BLiveLeaderboardRecord();
        }

        public boolean parseField(BLiveLeaderboardRecord bLiveLeaderboardRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "followship":
                    bLiveLeaderboardRecord.followship = jsonParser.getValueAsString();
                    return true;
                case "amount":
                    bLiveLeaderboardRecord.amount = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveLeaderboardRecord.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveLeaderboardRecord.roomId = jsonParser.getValueAsString();
                    return true;
                case "gap":
                    bLiveLeaderboardRecord.gap = jsonParser.getValueAsLong();
                    return true;
                case "rank":
                    bLiveLeaderboardRecord.rank = jsonParser.getValueAsInt();
                    return true;
                case "owner":
                    bLiveLeaderboardRecord.owner = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveState":
                    bLiveLeaderboardRecord.liveState = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLeaderboardRecord bLiveLeaderboardRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLeaderboardRecord.amount;
            if (str != null) {
                jsonGenerator.writeStringField("amount", str);
            }
            String str2 = bLiveLeaderboardRecord.followship;
            if (str2 != null) {
                jsonGenerator.writeStringField(Followship.TYPE, str2);
            }
            jsonGenerator.writeNumberField("gap", bLiveLeaderboardRecord.gap);
            String str3 = bLiveLeaderboardRecord.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            String str4 = bLiveLeaderboardRecord.liveState;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveState", str4);
            }
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveLeaderboardRecord.rank);
            String str5 = bLiveLeaderboardRecord.roomId;
            if (str5 != null) {
                jsonGenerator.writeStringField("roomId", str5);
            }
            if (bLiveLeaderboardRecord.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                BLiveOwner.JSON_ADAPTER.serialize(bLiveLeaderboardRecord.owner, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLeaderboardRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveleaderboardrecord";

    @NonNull
    @ProtobufIndex(index = 1)
    public String amount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String followship;

    @ProtobufIndex(index = 3)
    public long gap;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String liveState;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveOwner owner;

    @ProtobufIndex(index = 6)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 7)
    public String roomId;

    public static BLiveLeaderboardRecord new_() {
        BLiveLeaderboardRecord bLiveLeaderboardRecord = new BLiveLeaderboardRecord();
        bLiveLeaderboardRecord.nullCheck();
        return bLiveLeaderboardRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLeaderboardRecord mo223809clone() {
        BLiveLeaderboardRecord bLiveLeaderboardRecord = new BLiveLeaderboardRecord();
        bLiveLeaderboardRecord.amount = this.amount;
        bLiveLeaderboardRecord.followship = this.followship;
        bLiveLeaderboardRecord.gap = this.gap;
        bLiveLeaderboardRecord.liveId = this.liveId;
        bLiveLeaderboardRecord.liveState = this.liveState;
        bLiveLeaderboardRecord.rank = this.rank;
        bLiveLeaderboardRecord.roomId = this.roomId;
        BLiveOwner bLiveOwner = this.owner;
        if (bLiveOwner != null) {
            bLiveLeaderboardRecord.owner = bLiveOwner.mo223809clone();
        }
        return bLiveLeaderboardRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLeaderboardRecord)) {
            return false;
        }
        BLiveLeaderboardRecord bLiveLeaderboardRecord = (BLiveLeaderboardRecord) obj;
        return ValueObject.util_equals(this.amount, bLiveLeaderboardRecord.amount) && ValueObject.util_equals(this.followship, bLiveLeaderboardRecord.followship) && this.gap == bLiveLeaderboardRecord.gap && ValueObject.util_equals(this.liveId, bLiveLeaderboardRecord.liveId) && ValueObject.util_equals(this.liveState, bLiveLeaderboardRecord.liveState) && this.rank == bLiveLeaderboardRecord.rank && ValueObject.util_equals(this.roomId, bLiveLeaderboardRecord.roomId) && ValueObject.util_equals(this.owner, bLiveLeaderboardRecord.owner);
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
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.gap;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveState;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.rank) * 41;
        String str5 = this.roomId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveOwner bLiveOwner = this.owner;
        int iHashCode6 = iHashCode5 + (bLiveOwner != null ? bLiveOwner.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
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
        if (this.liveState == null) {
            this.liveState = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.owner == null) {
            this.owner = BLiveOwner.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
