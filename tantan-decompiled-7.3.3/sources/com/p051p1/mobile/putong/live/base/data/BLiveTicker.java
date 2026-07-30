package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveTicker extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTicker> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTicker>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTicker.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTicker.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTicker newInstance() {
            return new BLiveTicker();
        }

        public boolean parseField(BLiveTicker bLiveTicker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "currentTimeMs":
                    bLiveTicker.currentTimeMs = jsonParser.getValueAsLong();
                    return true;
                case "startTimeMs":
                    bLiveTicker.startTimeMs = jsonParser.getValueAsLong();
                    return true;
                case "endTimeMs":
                    bLiveTicker.endTimeMs = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTicker bLiveTicker, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("startTimeMs", bLiveTicker.startTimeMs);
            jsonGenerator.writeNumberField("endTimeMs", bLiveTicker.endTimeMs);
            jsonGenerator.writeNumberField("currentTimeMs", bLiveTicker.currentTimeMs);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTicker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveticker";

    @ProtobufIndex(index = 3)
    public long currentTimeMs;

    @ProtobufIndex(index = 2)
    public long endTimeMs;

    @ProtobufIndex(index = 1)
    public long startTimeMs;

    public static BLiveTicker new_() {
        BLiveTicker bLiveTicker = new BLiveTicker();
        bLiveTicker.nullCheck();
        return bLiveTicker;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTicker mo225055clone() {
        BLiveTicker bLiveTicker = new BLiveTicker();
        bLiveTicker.startTimeMs = this.startTimeMs;
        bLiveTicker.endTimeMs = this.endTimeMs;
        bLiveTicker.currentTimeMs = this.currentTimeMs;
        return bLiveTicker;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTicker)) {
            return false;
        }
        BLiveTicker bLiveTicker = (BLiveTicker) obj;
        return this.startTimeMs == bLiveTicker.startTimeMs && this.endTimeMs == bLiveTicker.endTimeMs && this.currentTimeMs == bLiveTicker.currentTimeMs;
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
        long j = this.startTimeMs;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endTimeMs;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.currentTimeMs;
        int i4 = i3 + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
