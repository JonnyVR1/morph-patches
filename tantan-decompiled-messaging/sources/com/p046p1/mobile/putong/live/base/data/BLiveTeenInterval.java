package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveTeenInterval extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTeenInterval> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTeenInterval>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTeenInterval.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTeenInterval.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTeenInterval newInstance() {
            return new BLiveTeenInterval();
        }

        public boolean parseField(BLiveTeenInterval bLiveTeenInterval, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    bLiveTeenInterval.startTime = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    bLiveTeenInterval.endTime = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveTeenInterval.text = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTeenInterval bLiveTeenInterval, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTeenInterval.startTime;
            if (str != null) {
                jsonGenerator.writeStringField(StudentVerRejectedReason.startTime, str);
            }
            String str2 = bLiveTeenInterval.endTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("endTime", str2);
            }
            String str3 = bLiveTeenInterval.text;
            if (str3 != null) {
                jsonGenerator.writeStringField("text", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTeenInterval) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveteeninterval";

    @NonNull
    @ProtobufIndex(index = 2)
    public String endTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;

    public static BLiveTeenInterval new_() {
        BLiveTeenInterval bLiveTeenInterval = new BLiveTeenInterval();
        bLiveTeenInterval.nullCheck();
        return bLiveTeenInterval;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTeenInterval mo223809clone() {
        BLiveTeenInterval bLiveTeenInterval = new BLiveTeenInterval();
        bLiveTeenInterval.startTime = this.startTime;
        bLiveTeenInterval.endTime = this.endTime;
        bLiveTeenInterval.text = this.text;
        return bLiveTeenInterval;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTeenInterval)) {
            return false;
        }
        BLiveTeenInterval bLiveTeenInterval = (BLiveTeenInterval) obj;
        return ValueObject.util_equals(this.startTime, bLiveTeenInterval.startTime) && ValueObject.util_equals(this.endTime, bLiveTeenInterval.endTime) && ValueObject.util_equals(this.text, bLiveTeenInterval.text);
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
        String str = this.startTime;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endTime;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startTime == null) {
            this.startTime = "";
        }
        if (this.endTime == null) {
            this.endTime = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
