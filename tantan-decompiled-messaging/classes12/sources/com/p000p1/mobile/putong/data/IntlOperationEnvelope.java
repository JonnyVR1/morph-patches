package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class IntlOperationEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intloperationenvelope";

    @NonNull
    @ProtobufIndex(index = 3)
    public IntlOperationCounters counters;

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlOperationData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlOperationEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlOperationEnvelope>() { // from class: com.p1.mobile.putong.data.IntlOperationEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlOperationEnvelope intlOperationEnvelope) {
            Meta meta = intlOperationEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlOperationData intlOperationData = intlOperationEnvelope.data;
            if (intlOperationData != null) {
                iL += CodedOutputByteBufferNano.l(2, intlOperationData, IntlOperationData.PROTOBUF_ADAPTER);
            }
            IntlOperationCounters intlOperationCounters = intlOperationEnvelope.counters;
            if (intlOperationCounters != null) {
                iL += CodedOutputByteBufferNano.l(3, intlOperationCounters, IntlOperationCounters.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlOperationEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlOperationEnvelope m18250parse(nb5 nb5Var) throws IOException {
            IntlOperationEnvelope intlOperationEnvelope = new IntlOperationEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlOperationEnvelope.meta == null) {
                        intlOperationEnvelope.meta = Meta.new_();
                    }
                    if (intlOperationEnvelope.data == null) {
                        intlOperationEnvelope.data = IntlOperationData.new_();
                    }
                    if (intlOperationEnvelope.counters != null) {
                        break;
                    }
                    intlOperationEnvelope.counters = IntlOperationCounters.new_();
                    break;
                }
                if (iU == 10) {
                    intlOperationEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    intlOperationEnvelope.data = (IntlOperationData) nb5Var.l(IntlOperationData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (intlOperationEnvelope.meta == null) {
                            intlOperationEnvelope.meta = Meta.new_();
                        }
                        if (intlOperationEnvelope.data == null) {
                            intlOperationEnvelope.data = IntlOperationData.new_();
                        }
                        if (intlOperationEnvelope.counters != null) {
                            break;
                        }
                        intlOperationEnvelope.counters = IntlOperationCounters.new_();
                        return intlOperationEnvelope;
                    }
                    intlOperationEnvelope.counters = (IntlOperationCounters) nb5Var.l(IntlOperationCounters.PROTOBUF_ADAPTER);
                }
            }
            return intlOperationEnvelope;
        }

        public void serialize(IntlOperationEnvelope intlOperationEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlOperationEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlOperationData intlOperationData = intlOperationEnvelope.data;
            if (intlOperationData != null) {
                codedOutputByteBufferNano.K(2, intlOperationData, IntlOperationData.PROTOBUF_ADAPTER);
            }
            IntlOperationCounters intlOperationCounters = intlOperationEnvelope.counters;
            if (intlOperationCounters != null) {
                codedOutputByteBufferNano.K(3, intlOperationCounters, IntlOperationCounters.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlOperationEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationEnvelope>() { // from class: com.p1.mobile.putong.data.IntlOperationEnvelope.2
        public Class getDataClass() {
            return IntlOperationEnvelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IntlOperationEnvelope mo17830newInstance() {
            return new IntlOperationEnvelope();
        }

        public boolean parseField(IntlOperationEnvelope intlOperationEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "counters":
                    intlOperationEnvelope.counters = (IntlOperationCounters) IntlOperationCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "data":
                    intlOperationEnvelope.data = (IntlOperationData) IntlOperationData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    intlOperationEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlOperationEnvelope intlOperationEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "counters":
                case "data":
                case "meta":
                    return true;
                default:
                    return super.parseFieldCheck(intlOperationEnvelope, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationEnvelope intlOperationEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlOperationEnvelope.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(intlOperationEnvelope.meta, jsonGenerator, true);
            }
            if (intlOperationEnvelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                IntlOperationData.JSON_ADAPTER.serialize(intlOperationEnvelope.data, jsonGenerator, true);
            }
            if (intlOperationEnvelope.counters != null) {
                jsonGenerator.writeFieldName("counters");
                IntlOperationCounters.JSON_ADAPTER.serialize(intlOperationEnvelope.counters, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationEnvelope new_() {
        IntlOperationEnvelope intlOperationEnvelope = new IntlOperationEnvelope();
        intlOperationEnvelope.nullCheck();
        return intlOperationEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlOperationEnvelope m18249clone() {
        IntlOperationEnvelope intlOperationEnvelope = new IntlOperationEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlOperationEnvelope.meta = meta.m18461clone();
        }
        IntlOperationData intlOperationData = this.data;
        if (intlOperationData != null) {
            intlOperationEnvelope.data = intlOperationData.m18246clone();
        }
        IntlOperationCounters intlOperationCounters = this.counters;
        if (intlOperationCounters != null) {
            intlOperationEnvelope.counters = intlOperationCounters.m18243clone();
        }
        return intlOperationEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlOperationEnvelope)) {
            return false;
        }
        IntlOperationEnvelope intlOperationEnvelope = (IntlOperationEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlOperationEnvelope.meta) && ValueObject.util_equals(this.data, intlOperationEnvelope.data) && ValueObject.util_equals(this.counters, intlOperationEnvelope.counters);
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
        IntlOperationData intlOperationData = this.data;
        int iHashCode2 = (iHashCode + (intlOperationData != null ? intlOperationData.hashCode() : 0)) * 41;
        IntlOperationCounters intlOperationCounters = this.counters;
        int iHashCode3 = iHashCode2 + (intlOperationCounters != null ? intlOperationCounters.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlOperationData.new_();
        }
        if (this.counters == null) {
            this.counters = IntlOperationCounters.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
