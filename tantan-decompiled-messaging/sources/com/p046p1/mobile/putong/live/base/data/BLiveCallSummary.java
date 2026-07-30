package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveCallSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCallSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCallSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCallSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCallSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCallSummary newInstance() {
            return new BLiveCallSummary();
        }

        public boolean parseField(BLiveCallSummary bLiveCallSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveCallSummary.duration = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    bLiveCallSummary.f44345id = jsonParser.getValueAsString();
                    return false;
                case "rewardPoint":
                    bLiveCallSummary.rewardPoint = jsonParser.getValueAsLong();
                    return true;
                case "newFollowCount":
                    bLiveCallSummary.newFollowCount = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCallSummary bLiveCallSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCallSummary.f44345id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("newFollowCount", bLiveCallSummary.newFollowCount);
            jsonGenerator.writeNumberField("rewardPoint", bLiveCallSummary.rewardPoint);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveCallSummary.duration);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCallSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecallsummary";

    @ProtobufIndex(index = 4)
    public long duration;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44345id;

    @ProtobufIndex(index = 2)
    public long newFollowCount;

    @ProtobufIndex(index = 3)
    public long rewardPoint;

    public static BLiveCallSummary new_() {
        BLiveCallSummary bLiveCallSummary = new BLiveCallSummary();
        bLiveCallSummary.nullCheck();
        return bLiveCallSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCallSummary mo223809clone() {
        BLiveCallSummary bLiveCallSummary = new BLiveCallSummary();
        bLiveCallSummary.f44345id = this.f44345id;
        bLiveCallSummary.newFollowCount = this.newFollowCount;
        bLiveCallSummary.rewardPoint = this.rewardPoint;
        bLiveCallSummary.duration = this.duration;
        return bLiveCallSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCallSummary)) {
            return false;
        }
        BLiveCallSummary bLiveCallSummary = (BLiveCallSummary) obj;
        return ValueObject.util_equals(this.f44345id, bLiveCallSummary.f44345id) && this.newFollowCount == bLiveCallSummary.newFollowCount && this.rewardPoint == bLiveCallSummary.rewardPoint && this.duration == bLiveCallSummary.duration;
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
        String str = this.f44345id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.newFollowCount;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.rewardPoint;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.duration;
        int i5 = i4 + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44345id == null) {
            this.f44345id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
