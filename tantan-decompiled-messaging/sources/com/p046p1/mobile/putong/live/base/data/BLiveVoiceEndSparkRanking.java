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
public class BLiveVoiceEndSparkRanking extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceEndSparkRanking> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceEndSparkRanking>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceEndSparkRanking.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceEndSparkRanking newInstance() {
            return new BLiveVoiceEndSparkRanking();
        }

        public boolean parseField(BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveVoiceEndSparkRanking.f44494id = jsonParser.getValueAsString();
                    return false;
                case "relationState":
                    bLiveVoiceEndSparkRanking.relationState = jsonParser.getValueAsString();
                    return true;
                case "followRelation":
                    bLiveVoiceEndSparkRanking.followRelation = jsonParser.getValueAsString();
                    return true;
                case "accompanyDuration":
                    bLiveVoiceEndSparkRanking.accompanyDuration = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceEndSparkRanking.f44494id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("accompanyDuration", bLiveVoiceEndSparkRanking.accompanyDuration);
            String str2 = bLiveVoiceEndSparkRanking.followRelation;
            if (str2 != null) {
                jsonGenerator.writeStringField("followRelation", str2);
            }
            String str3 = bLiveVoiceEndSparkRanking.relationState;
            if (str3 != null) {
                jsonGenerator.writeStringField("relationState", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceEndSparkRanking) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceendsparkranking";

    @ProtobufIndex(index = 2)
    public double accompanyDuration;

    @NonNull
    @ProtobufIndex(index = 3)
    public String followRelation;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44494id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String relationState;

    public static BLiveVoiceEndSparkRanking new_() {
        BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking = new BLiveVoiceEndSparkRanking();
        bLiveVoiceEndSparkRanking.nullCheck();
        return bLiveVoiceEndSparkRanking;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceEndSparkRanking mo223809clone() {
        BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking = new BLiveVoiceEndSparkRanking();
        bLiveVoiceEndSparkRanking.f44494id = this.f44494id;
        bLiveVoiceEndSparkRanking.accompanyDuration = this.accompanyDuration;
        bLiveVoiceEndSparkRanking.followRelation = this.followRelation;
        bLiveVoiceEndSparkRanking.relationState = this.relationState;
        return bLiveVoiceEndSparkRanking;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceEndSparkRanking)) {
            return false;
        }
        BLiveVoiceEndSparkRanking bLiveVoiceEndSparkRanking = (BLiveVoiceEndSparkRanking) obj;
        return ValueObject.util_equals(this.f44494id, bLiveVoiceEndSparkRanking.f44494id) && this.accompanyDuration == bLiveVoiceEndSparkRanking.accompanyDuration && ValueObject.util_equals(this.followRelation, bLiveVoiceEndSparkRanking.followRelation) && ValueObject.util_equals(this.relationState, bLiveVoiceEndSparkRanking.relationState);
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
        String str = this.f44494id;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.accompanyDuration);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.followRelation;
        int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.relationState;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44494id == null) {
            this.f44494id = "";
        }
        if (this.followRelation == null) {
            this.followRelation = "";
        }
        if (this.relationState == null) {
            this.relationState = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
