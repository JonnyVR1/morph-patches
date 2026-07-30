package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveActivitySummaryCounters liveActivitySummaryCounters) {
            SquareSummary squareSummary = liveActivitySummaryCounters.squareSummary;
            int iL = squareSummary != null ? CodedOutputByteBufferNano.l(1, squareSummary, SquareSummary.PROTOBUF_ADAPTER) : 0;
            SquareDetail squareDetail = liveActivitySummaryCounters.squareDetail;
            if (squareDetail != null) {
                iL += CodedOutputByteBufferNano.l(2, squareDetail, SquareDetail.PROTOBUF_ADAPTER);
            }
            ((MessageNano) liveActivitySummaryCounters).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveActivitySummaryCounters m18319parse(nb5 nb5Var) throws IOException {
            LiveActivitySummaryCounters liveActivitySummaryCounters = new LiveActivitySummaryCounters();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    liveActivitySummaryCounters.squareSummary = (SquareSummary) nb5Var.l(SquareSummary.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        return liveActivitySummaryCounters;
                    }
                    liveActivitySummaryCounters.squareDetail = (SquareDetail) nb5Var.l(SquareDetail.PROTOBUF_ADAPTER);
                }
            }
        }

        public void serialize(LiveActivitySummaryCounters liveActivitySummaryCounters, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SquareSummary squareSummary = liveActivitySummaryCounters.squareSummary;
            if (squareSummary != null) {
                codedOutputByteBufferNano.K(1, squareSummary, SquareSummary.PROTOBUF_ADAPTER);
            }
            SquareDetail squareDetail = liveActivitySummaryCounters.squareDetail;
            if (squareDetail != null) {
                codedOutputByteBufferNano.K(2, squareDetail, SquareDetail.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveActivitySummaryCounters> JSON_ADAPTER = new ObjectJsonAdapter<LiveActivitySummaryCounters>() { // from class: com.p1.mobile.putong.data.LiveActivitySummaryCounters.2
        public Class getDataClass() {
            return LiveActivitySummaryCounters.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveActivitySummaryCounters mo17830newInstance() {
            return new LiveActivitySummaryCounters();
        }

        public boolean parseField(LiveActivitySummaryCounters liveActivitySummaryCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("squareDetail")) {
                liveActivitySummaryCounters.squareDetail = (SquareDetail) SquareDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("squareSummary")) {
                return false;
            }
            liveActivitySummaryCounters.squareSummary = (SquareSummary) SquareSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LiveActivitySummaryCounters liveActivitySummaryCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("squareDetail") || str.equals("squareSummary")) {
                return true;
            }
            return super.parseFieldCheck(liveActivitySummaryCounters, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveActivitySummaryCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveActivitySummaryCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveActivitySummaryCounters new_() {
        LiveActivitySummaryCounters liveActivitySummaryCounters = new LiveActivitySummaryCounters();
        liveActivitySummaryCounters.nullCheck();
        return liveActivitySummaryCounters;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveActivitySummaryCounters m18318clone() {
        LiveActivitySummaryCounters liveActivitySummaryCounters = new LiveActivitySummaryCounters();
        SquareSummary squareSummary = this.squareSummary;
        if (squareSummary != null) {
            liveActivitySummaryCounters.squareSummary = squareSummary.m19018clone();
        }
        SquareDetail squareDetail = this.squareDetail;
        if (squareDetail != null) {
            liveActivitySummaryCounters.squareDetail = squareDetail.m19015clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        SquareSummary squareSummary = this.squareSummary;
        int iHashCode = (i2 + (squareSummary != null ? squareSummary.hashCode() : 0)) * 41;
        SquareDetail squareDetail = this.squareDetail;
        int iHashCode2 = iHashCode + (squareDetail != null ? squareDetail.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
