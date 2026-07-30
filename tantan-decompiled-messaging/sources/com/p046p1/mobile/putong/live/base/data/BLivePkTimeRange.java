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
public class BLivePkTimeRange extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkTimeRange> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkTimeRange>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkTimeRange.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkTimeRange.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkTimeRange newInstance() {
            return new BLivePkTimeRange();
        }

        public boolean parseField(BLivePkTimeRange bLivePkTimeRange, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("to")) {
                bLivePkTimeRange.f44429to = BLivePkTimeRangeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("from")) {
                return false;
            }
            bLivePkTimeRange.from = BLivePkTimeRangeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkTimeRange bLivePkTimeRange, JsonGenerator jsonGenerator) throws IOException {
            if (bLivePkTimeRange.from != null) {
                jsonGenerator.writeFieldName("from");
                BLivePkTimeRangeInfo.JSON_ADAPTER.serialize(bLivePkTimeRange.from, jsonGenerator, true);
            }
            if (bLivePkTimeRange.f44429to != null) {
                jsonGenerator.writeFieldName("to");
                BLivePkTimeRangeInfo.JSON_ADAPTER.serialize(bLivePkTimeRange.f44429to, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkTimeRange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepktimerange";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLivePkTimeRangeInfo from;

    /* JADX INFO: renamed from: to */
    @NonNull
    @ProtobufIndex(index = 2)
    public BLivePkTimeRangeInfo f44429to;

    public static BLivePkTimeRange new_() {
        BLivePkTimeRange bLivePkTimeRange = new BLivePkTimeRange();
        bLivePkTimeRange.nullCheck();
        return bLivePkTimeRange;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkTimeRange mo223809clone() {
        BLivePkTimeRange bLivePkTimeRange = new BLivePkTimeRange();
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo = this.from;
        if (bLivePkTimeRangeInfo != null) {
            bLivePkTimeRange.from = bLivePkTimeRangeInfo.mo223809clone();
        }
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo2 = this.f44429to;
        if (bLivePkTimeRangeInfo2 != null) {
            bLivePkTimeRange.f44429to = bLivePkTimeRangeInfo2.mo223809clone();
        }
        return bLivePkTimeRange;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkTimeRange)) {
            return false;
        }
        BLivePkTimeRange bLivePkTimeRange = (BLivePkTimeRange) obj;
        return ValueObject.util_equals(this.from, bLivePkTimeRange.from) && ValueObject.util_equals(this.f44429to, bLivePkTimeRange.f44429to);
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
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo = this.from;
        int iHashCode = (i2 + (bLivePkTimeRangeInfo != null ? bLivePkTimeRangeInfo.hashCode() : 0)) * 41;
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo2 = this.f44429to;
        int iHashCode2 = iHashCode + (bLivePkTimeRangeInfo2 != null ? bLivePkTimeRangeInfo2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.from == null) {
            this.from = BLivePkTimeRangeInfo.new_();
        }
        if (this.f44429to == null) {
            this.f44429to = BLivePkTimeRangeInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
