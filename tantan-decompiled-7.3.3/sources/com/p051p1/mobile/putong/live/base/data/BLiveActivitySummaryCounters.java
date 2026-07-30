package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
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
public class BLiveActivitySummaryCounters extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveActivitySummaryCounters> JSON_ADAPTER = new ObjectJsonAdapter<BLiveActivitySummaryCounters>() { // from class: com.p1.mobile.putong.live.base.data.BLiveActivitySummaryCounters.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveActivitySummaryCounters.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveActivitySummaryCounters newInstance() {
            return new BLiveActivitySummaryCounters();
        }

        public boolean parseField(BLiveActivitySummaryCounters bLiveActivitySummaryCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("squareDetail")) {
                bLiveActivitySummaryCounters.squareDetail = BLiveSquareDetailCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("squareSummary")) {
                return false;
            }
            bLiveActivitySummaryCounters.squareSummary = BLiveSquareDetailCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveActivitySummaryCounters bLiveActivitySummaryCounters, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveActivitySummaryCounters.squareSummary != null) {
                jsonGenerator.writeFieldName("squareSummary");
                BLiveSquareDetailCounters.JSON_ADAPTER.serialize(bLiveActivitySummaryCounters.squareSummary, jsonGenerator, true);
            }
            if (bLiveActivitySummaryCounters.squareDetail != null) {
                jsonGenerator.writeFieldName("squareDetail");
                BLiveSquareDetailCounters.JSON_ADAPTER.serialize(bLiveActivitySummaryCounters.squareDetail, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveActivitySummaryCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveactivitysummarycounters";

    @Nullable
    @ProtobufIndex(index = 2)
    public BLiveSquareDetailCounters squareDetail;

    @Nullable
    @ProtobufIndex(index = 1)
    public BLiveSquareDetailCounters squareSummary;

    public static BLiveActivitySummaryCounters new_() {
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters = new BLiveActivitySummaryCounters();
        bLiveActivitySummaryCounters.nullCheck();
        return bLiveActivitySummaryCounters;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveActivitySummaryCounters mo225055clone() {
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters = new BLiveActivitySummaryCounters();
        BLiveSquareDetailCounters bLiveSquareDetailCounters = this.squareSummary;
        if (bLiveSquareDetailCounters != null) {
            bLiveActivitySummaryCounters.squareSummary = bLiveSquareDetailCounters.mo225055clone();
        }
        BLiveSquareDetailCounters bLiveSquareDetailCounters2 = this.squareDetail;
        if (bLiveSquareDetailCounters2 != null) {
            bLiveActivitySummaryCounters.squareDetail = bLiveSquareDetailCounters2.mo225055clone();
        }
        return bLiveActivitySummaryCounters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveActivitySummaryCounters)) {
            return false;
        }
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters = (BLiveActivitySummaryCounters) obj;
        return ValueObject.util_equals(this.squareSummary, bLiveActivitySummaryCounters.squareSummary) && ValueObject.util_equals(this.squareDetail, bLiveActivitySummaryCounters.squareDetail);
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
        BLiveSquareDetailCounters bLiveSquareDetailCounters = this.squareSummary;
        int iHashCode = (i2 + (bLiveSquareDetailCounters != null ? bLiveSquareDetailCounters.hashCode() : 0)) * 41;
        BLiveSquareDetailCounters bLiveSquareDetailCounters2 = this.squareDetail;
        int iHashCode2 = iHashCode + (bLiveSquareDetailCounters2 != null ? bLiveSquareDetailCounters2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
