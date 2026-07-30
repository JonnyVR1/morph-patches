package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveActivitySummaryCounters extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveactivitysummarycounters";

    @Nullable
    @ProtobufIndex(index = 2)
    public SquareDetail squareDetail;

    @Nullable
    @ProtobufIndex(index = 1)
    public SquareSummary squareSummary;
    public static ProtobufAdapter<LiveActivitySummaryCounters> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveActivitySummaryCounters>() { // from class: com.p1.mobile.putong.data.LiveActivitySummaryCounters.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveActivitySummaryCounters liveActivitySummaryCounters) {
            SquareSummary squareSummary = liveActivitySummaryCounters.squareSummary;
            int iM17285l = squareSummary != null ? CodedOutputByteBufferNano.m17285l(1, squareSummary, SquareSummary.PROTOBUF_ADAPTER) : 0;
            SquareDetail squareDetail = liveActivitySummaryCounters.squareDetail;
            if (squareDetail != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, squareDetail, SquareDetail.PROTOBUF_ADAPTER);
            }
            liveActivitySummaryCounters.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveActivitySummaryCounters parse(nc5 nc5Var) throws IOException {
            LiveActivitySummaryCounters liveActivitySummaryCounters = new LiveActivitySummaryCounters();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    liveActivitySummaryCounters.squareSummary = (SquareSummary) nc5Var.m162488l(SquareSummary.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        return liveActivitySummaryCounters;
                    }
                    liveActivitySummaryCounters.squareDetail = (SquareDetail) nc5Var.m162488l(SquareDetail.PROTOBUF_ADAPTER);
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveActivitySummaryCounters liveActivitySummaryCounters, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SquareSummary squareSummary = liveActivitySummaryCounters.squareSummary;
            if (squareSummary != null) {
                codedOutputByteBufferNano.m17309K(1, squareSummary, SquareSummary.PROTOBUF_ADAPTER);
            }
            SquareDetail squareDetail = liveActivitySummaryCounters.squareDetail;
            if (squareDetail != null) {
                codedOutputByteBufferNano.m17309K(2, squareDetail, SquareDetail.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveActivitySummaryCounters> JSON_ADAPTER = new ObjectJsonAdapter<LiveActivitySummaryCounters>() { // from class: com.p1.mobile.putong.data.LiveActivitySummaryCounters.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveActivitySummaryCounters.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveActivitySummaryCounters newInstance() {
            return new LiveActivitySummaryCounters();
        }

        public boolean parseField(LiveActivitySummaryCounters liveActivitySummaryCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("squareDetail")) {
                liveActivitySummaryCounters.squareDetail = SquareDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("squareSummary")) {
                return false;
            }
            liveActivitySummaryCounters.squareSummary = SquareSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LiveActivitySummaryCounters liveActivitySummaryCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("squareDetail") || str.equals("squareSummary")) {
                return true;
            }
            return super.parseFieldCheck(liveActivitySummaryCounters, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveActivitySummaryCounters liveActivitySummaryCounters, JsonGenerator jsonGenerator) throws IOException {
            if (liveActivitySummaryCounters.squareSummary != null) {
                jsonGenerator.writeFieldName("squareSummary");
                SquareSummary.JSON_ADAPTER.serialize(liveActivitySummaryCounters.squareSummary, jsonGenerator, true);
            }
            if (liveActivitySummaryCounters.squareDetail != null) {
                jsonGenerator.writeFieldName("squareDetail");
                SquareDetail.JSON_ADAPTER.serialize(liveActivitySummaryCounters.squareDetail, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveActivitySummaryCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveActivitySummaryCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveActivitySummaryCounters new_() {
        LiveActivitySummaryCounters liveActivitySummaryCounters = new LiveActivitySummaryCounters();
        liveActivitySummaryCounters.nullCheck();
        return liveActivitySummaryCounters;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveActivitySummaryCounters mo225055clone() {
        LiveActivitySummaryCounters liveActivitySummaryCounters = new LiveActivitySummaryCounters();
        SquareSummary squareSummary = this.squareSummary;
        if (squareSummary != null) {
            liveActivitySummaryCounters.squareSummary = squareSummary.mo225055clone();
        }
        SquareDetail squareDetail = this.squareDetail;
        if (squareDetail != null) {
            liveActivitySummaryCounters.squareDetail = squareDetail.mo225055clone();
        }
        return liveActivitySummaryCounters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveActivitySummaryCounters)) {
            return false;
        }
        LiveActivitySummaryCounters liveActivitySummaryCounters = (LiveActivitySummaryCounters) obj;
        return ValueObject.util_equals(this.squareSummary, liveActivitySummaryCounters.squareSummary) && ValueObject.util_equals(this.squareDetail, liveActivitySummaryCounters.squareDetail);
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
        SquareSummary squareSummary = this.squareSummary;
        int iHashCode = (i2 + (squareSummary != null ? squareSummary.hashCode() : 0)) * 41;
        SquareDetail squareDetail = this.squareDetail;
        int iHashCode2 = iHashCode + (squareDetail != null ? squareDetail.hashCode() : 0);
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
