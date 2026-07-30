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
public class BLiveStretchRange extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStretchRange> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStretchRange>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStretchRange.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStretchRange.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStretchRange newInstance() {
            return new BLiveStretchRange();
        }

        public boolean parseField(BLiveStretchRange bLiveStretchRange, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("end")) {
                bLiveStretchRange.end = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("start")) {
                return false;
            }
            bLiveStretchRange.start = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStretchRange bLiveStretchRange, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("start", bLiveStretchRange.start);
            jsonGenerator.writeNumberField("end", bLiveStretchRange.end);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStretchRange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestretchrange";

    @ProtobufIndex(index = 2)
    public long end;

    @ProtobufIndex(index = 1)
    public long start;

    public static BLiveStretchRange new_() {
        BLiveStretchRange bLiveStretchRange = new BLiveStretchRange();
        bLiveStretchRange.nullCheck();
        return bLiveStretchRange;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStretchRange mo225055clone() {
        BLiveStretchRange bLiveStretchRange = new BLiveStretchRange();
        bLiveStretchRange.start = this.start;
        bLiveStretchRange.end = this.end;
        return bLiveStretchRange;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStretchRange)) {
            return false;
        }
        BLiveStretchRange bLiveStretchRange = (BLiveStretchRange) obj;
        return this.start == bLiveStretchRange.start && this.end == bLiveStretchRange.end;
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
        long j = this.start;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.end;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
