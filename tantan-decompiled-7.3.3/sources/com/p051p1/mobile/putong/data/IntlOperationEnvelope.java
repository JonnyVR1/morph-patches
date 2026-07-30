package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlOperationEnvelope intlOperationEnvelope) {
            Meta meta = intlOperationEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlOperationData intlOperationData = intlOperationEnvelope.data;
            if (intlOperationData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, intlOperationData, IntlOperationData.PROTOBUF_ADAPTER);
            }
            IntlOperationCounters intlOperationCounters = intlOperationEnvelope.counters;
            if (intlOperationCounters != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, intlOperationCounters, IntlOperationCounters.PROTOBUF_ADAPTER);
            }
            intlOperationEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlOperationEnvelope parse(nc5 nc5Var) throws IOException {
            IntlOperationEnvelope intlOperationEnvelope = new IntlOperationEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    intlOperationEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    intlOperationEnvelope.data = (IntlOperationData) nc5Var.m162488l(IntlOperationData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
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
                    intlOperationEnvelope.counters = (IntlOperationCounters) nc5Var.m162488l(IntlOperationCounters.PROTOBUF_ADAPTER);
                }
            }
            return intlOperationEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlOperationEnvelope intlOperationEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlOperationEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlOperationData intlOperationData = intlOperationEnvelope.data;
            if (intlOperationData != null) {
                codedOutputByteBufferNano.m17309K(2, intlOperationData, IntlOperationData.PROTOBUF_ADAPTER);
            }
            IntlOperationCounters intlOperationCounters = intlOperationEnvelope.counters;
            if (intlOperationCounters != null) {
                codedOutputByteBufferNano.m17309K(3, intlOperationCounters, IntlOperationCounters.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlOperationEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationEnvelope>() { // from class: com.p1.mobile.putong.data.IntlOperationEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlOperationEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlOperationEnvelope newInstance() {
            return new IntlOperationEnvelope();
        }

        public boolean parseField(IntlOperationEnvelope intlOperationEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "counters":
                    intlOperationEnvelope.counters = IntlOperationCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "data":
                    intlOperationEnvelope.data = IntlOperationData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    intlOperationEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationEnvelope intlOperationEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlOperationEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlOperationEnvelope.meta, jsonGenerator, true);
            }
            if (intlOperationEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlOperationData.JSON_ADAPTER.serialize(intlOperationEnvelope.data, jsonGenerator, true);
            }
            if (intlOperationEnvelope.counters != null) {
                jsonGenerator.writeFieldName("counters");
                IntlOperationCounters.JSON_ADAPTER.serialize(intlOperationEnvelope.counters, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationEnvelope new_() {
        IntlOperationEnvelope intlOperationEnvelope = new IntlOperationEnvelope();
        intlOperationEnvelope.nullCheck();
        return intlOperationEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlOperationEnvelope mo225055clone() {
        IntlOperationEnvelope intlOperationEnvelope = new IntlOperationEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlOperationEnvelope.meta = meta.mo225055clone();
        }
        IntlOperationData intlOperationData = this.data;
        if (intlOperationData != null) {
            intlOperationEnvelope.data = intlOperationData.mo225055clone();
        }
        IntlOperationCounters intlOperationCounters = this.counters;
        if (intlOperationCounters != null) {
            intlOperationEnvelope.counters = intlOperationCounters.mo225055clone();
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
        IntlOperationData intlOperationData = this.data;
        int iHashCode2 = (iHashCode + (intlOperationData != null ? intlOperationData.hashCode() : 0)) * 41;
        IntlOperationCounters intlOperationCounters = this.counters;
        int iHashCode3 = iHashCode2 + (intlOperationCounters != null ? intlOperationCounters.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
