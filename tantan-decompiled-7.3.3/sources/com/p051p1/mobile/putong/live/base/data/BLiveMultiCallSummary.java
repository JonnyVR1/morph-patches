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
public class BLiveMultiCallSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCallSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCallSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCallSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCallSummary.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCallSummary newInstance() {
            return new BLiveMultiCallSummary();
        }

        public boolean parseField(BLiveMultiCallSummary bLiveMultiCallSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveMultiCallSummary.duration = jsonParser.getValueAsLong();
                    return true;
                case "multiCallId":
                    bLiveMultiCallSummary.multiCallId = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveMultiCallSummary.f45253id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveMultiCallSummary.type = jsonParser.getValueAsString();
                    return true;
                case "rewardPoint":
                    bLiveMultiCallSummary.rewardPoint = jsonParser.getValueAsLong();
                    return true;
                case "newFollowCount":
                    bLiveMultiCallSummary.newFollowCount = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCallSummary bLiveMultiCallSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiCallSummary.f45253id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMultiCallSummary.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("multiCallId", bLiveMultiCallSummary.multiCallId);
            jsonGenerator.writeNumberField("rewardPoint", bLiveMultiCallSummary.rewardPoint);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveMultiCallSummary.duration);
            jsonGenerator.writeNumberField("newFollowCount", bLiveMultiCallSummary.newFollowCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCallSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticallsummary";

    @ProtobufIndex(index = 5)
    public long duration;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45253id;

    @ProtobufIndex(index = 3)
    public boolean multiCallId;

    @ProtobufIndex(index = 6)
    public long newFollowCount;

    @ProtobufIndex(index = 4)
    public long rewardPoint;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveMultiCallSummary new_() {
        BLiveMultiCallSummary bLiveMultiCallSummary = new BLiveMultiCallSummary();
        bLiveMultiCallSummary.nullCheck();
        return bLiveMultiCallSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCallSummary mo225055clone() {
        BLiveMultiCallSummary bLiveMultiCallSummary = new BLiveMultiCallSummary();
        bLiveMultiCallSummary.f45253id = this.f45253id;
        bLiveMultiCallSummary.type = this.type;
        bLiveMultiCallSummary.multiCallId = this.multiCallId;
        bLiveMultiCallSummary.rewardPoint = this.rewardPoint;
        bLiveMultiCallSummary.duration = this.duration;
        bLiveMultiCallSummary.newFollowCount = this.newFollowCount;
        return bLiveMultiCallSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCallSummary)) {
            return false;
        }
        BLiveMultiCallSummary bLiveMultiCallSummary = (BLiveMultiCallSummary) obj;
        return ValueObject.util_equals(this.f45253id, bLiveMultiCallSummary.f45253id) && ValueObject.util_equals(this.type, bLiveMultiCallSummary.type) && this.multiCallId == bLiveMultiCallSummary.multiCallId && this.rewardPoint == bLiveMultiCallSummary.rewardPoint && this.duration == bLiveMultiCallSummary.duration && this.newFollowCount == bLiveMultiCallSummary.newFollowCount;
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
        String str = this.f45253id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.multiCallId ? 1231 : 1237)) * 41;
        long j = this.rewardPoint;
        int i3 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.duration;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.newFollowCount;
        int i5 = i4 + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45253id == null) {
            this.f45253id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
