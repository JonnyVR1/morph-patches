package com.p051p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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

/* JADX INFO: loaded from: classes9.dex */
public class MatchCounterEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchcounterenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;

    @NonNull
    @ProtobufIndex(index = 2)
    public MatchTotalCounter totalCounters;
    public static ProtobufAdapter<MatchCounterEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchCounterEnvelope>() { // from class: com.p1.mobile.putong.account.data.MatchCounterEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatchCounterEnvelope matchCounterEnvelope) {
            Meta meta = matchCounterEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            MatchTotalCounter matchTotalCounter = matchCounterEnvelope.totalCounters;
            if (matchTotalCounter != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, matchTotalCounter, MatchTotalCounter.PROTOBUF_ADAPTER);
            }
            matchCounterEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatchCounterEnvelope parse(nc5 nc5Var) throws IOException {
            MatchCounterEnvelope matchCounterEnvelope = new MatchCounterEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (matchCounterEnvelope.meta == null) {
                        matchCounterEnvelope.meta = Meta.new_();
                    }
                    if (matchCounterEnvelope.totalCounters != null) {
                        break;
                    }
                    matchCounterEnvelope.totalCounters = MatchTotalCounter.new_();
                    break;
                }
                if (iM162497u == 10) {
                    matchCounterEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (matchCounterEnvelope.meta == null) {
                            matchCounterEnvelope.meta = Meta.new_();
                        }
                        if (matchCounterEnvelope.totalCounters != null) {
                            break;
                        }
                        matchCounterEnvelope.totalCounters = MatchTotalCounter.new_();
                        return matchCounterEnvelope;
                    }
                    matchCounterEnvelope.totalCounters = (MatchTotalCounter) nc5Var.m162488l(MatchTotalCounter.PROTOBUF_ADAPTER);
                }
            }
            return matchCounterEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatchCounterEnvelope matchCounterEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = matchCounterEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            MatchTotalCounter matchTotalCounter = matchCounterEnvelope.totalCounters;
            if (matchTotalCounter != null) {
                codedOutputByteBufferNano.m17309K(2, matchTotalCounter, MatchTotalCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MatchCounterEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<MatchCounterEnvelope>() { // from class: com.p1.mobile.putong.account.data.MatchCounterEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatchCounterEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatchCounterEnvelope newInstance() {
            return new MatchCounterEnvelope();
        }

        public boolean parseField(MatchCounterEnvelope matchCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("totalCounters")) {
                matchCounterEnvelope.totalCounters = MatchTotalCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            matchCounterEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MatchCounterEnvelope matchCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("totalCounters") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(matchCounterEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatchCounterEnvelope matchCounterEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (matchCounterEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(matchCounterEnvelope.meta, jsonGenerator, true);
            }
            if (matchCounterEnvelope.totalCounters != null) {
                jsonGenerator.writeFieldName("totalCounters");
                MatchTotalCounter.JSON_ADAPTER.serialize(matchCounterEnvelope.totalCounters, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchCounterEnvelope new_() {
        MatchCounterEnvelope matchCounterEnvelope = new MatchCounterEnvelope();
        matchCounterEnvelope.nullCheck();
        return matchCounterEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatchCounterEnvelope mo225055clone() {
        MatchCounterEnvelope matchCounterEnvelope = new MatchCounterEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            matchCounterEnvelope.meta = meta.mo225055clone();
        }
        MatchTotalCounter matchTotalCounter = this.totalCounters;
        if (matchTotalCounter != null) {
            matchCounterEnvelope.totalCounters = matchTotalCounter.mo225055clone();
        }
        return matchCounterEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchCounterEnvelope)) {
            return false;
        }
        MatchCounterEnvelope matchCounterEnvelope = (MatchCounterEnvelope) obj;
        return ValueObject.util_equals(this.meta, matchCounterEnvelope.meta) && ValueObject.util_equals(this.totalCounters, matchCounterEnvelope.totalCounters);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        MatchTotalCounter matchTotalCounter = this.totalCounters;
        int iHashCode2 = iHashCode + (matchTotalCounter != null ? matchTotalCounter.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.totalCounters == null) {
            this.totalCounters = MatchTotalCounter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
