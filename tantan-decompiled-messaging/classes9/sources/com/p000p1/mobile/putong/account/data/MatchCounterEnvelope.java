package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MatchCounterEnvelope matchCounterEnvelope) {
            Meta meta = matchCounterEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            MatchTotalCounter matchTotalCounter = matchCounterEnvelope.totalCounters;
            if (matchTotalCounter != null) {
                iL += CodedOutputByteBufferNano.l(2, matchTotalCounter, MatchTotalCounter.PROTOBUF_ADAPTER);
            }
            ((MessageNano) matchCounterEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MatchCounterEnvelope m28927parse(nb5 nb5Var) throws IOException {
            MatchCounterEnvelope matchCounterEnvelope = new MatchCounterEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (matchCounterEnvelope.meta == null) {
                        matchCounterEnvelope.meta = Meta.new_();
                    }
                    if (matchCounterEnvelope.totalCounters != null) {
                        break;
                    }
                    matchCounterEnvelope.totalCounters = MatchTotalCounter.new_();
                    break;
                }
                if (iU == 10) {
                    matchCounterEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (matchCounterEnvelope.meta == null) {
                            matchCounterEnvelope.meta = Meta.new_();
                        }
                        if (matchCounterEnvelope.totalCounters != null) {
                            break;
                        }
                        matchCounterEnvelope.totalCounters = MatchTotalCounter.new_();
                        return matchCounterEnvelope;
                    }
                    matchCounterEnvelope.totalCounters = (MatchTotalCounter) nb5Var.l(MatchTotalCounter.PROTOBUF_ADAPTER);
                }
            }
            return matchCounterEnvelope;
        }

        public void serialize(MatchCounterEnvelope matchCounterEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = matchCounterEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            MatchTotalCounter matchTotalCounter = matchCounterEnvelope.totalCounters;
            if (matchTotalCounter != null) {
                codedOutputByteBufferNano.K(2, matchTotalCounter, MatchTotalCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MatchCounterEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<MatchCounterEnvelope>() { // from class: com.p1.mobile.putong.account.data.MatchCounterEnvelope.2
        public Class getDataClass() {
            return MatchCounterEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MatchCounterEnvelope m28928newInstance() {
            return new MatchCounterEnvelope();
        }

        public boolean parseField(MatchCounterEnvelope matchCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("totalCounters")) {
                matchCounterEnvelope.totalCounters = (MatchTotalCounter) MatchTotalCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            matchCounterEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MatchCounterEnvelope matchCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("totalCounters") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(matchCounterEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchCounterEnvelope new_() {
        MatchCounterEnvelope matchCounterEnvelope = new MatchCounterEnvelope();
        matchCounterEnvelope.nullCheck();
        return matchCounterEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MatchCounterEnvelope m28926clone() {
        MatchCounterEnvelope matchCounterEnvelope = new MatchCounterEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            matchCounterEnvelope.meta = meta.clone();
        }
        MatchTotalCounter matchTotalCounter = this.totalCounters;
        if (matchTotalCounter != null) {
            matchCounterEnvelope.totalCounters = matchTotalCounter.m28930clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        MatchTotalCounter matchTotalCounter = this.totalCounters;
        int iHashCode2 = iHashCode + (matchTotalCounter != null ? matchTotalCounter.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.totalCounters == null) {
            this.totalCounters = MatchTotalCounter.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
