package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class IntlInnerWebPayEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlinnerwebpayenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlInnerWebPayConfig data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlInnerWebPayEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlInnerWebPayEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPayEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlInnerWebPayEnvelope intlInnerWebPayEnvelope) {
            Meta meta = intlInnerWebPayEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlInnerWebPayConfig intlInnerWebPayConfig = intlInnerWebPayEnvelope.data;
            if (intlInnerWebPayConfig != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, intlInnerWebPayConfig, IntlInnerWebPayConfig.PROTOBUF_ADAPTER);
            }
            intlInnerWebPayEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlInnerWebPayEnvelope parse(nc5 nc5Var) throws IOException {
            IntlInnerWebPayEnvelope intlInnerWebPayEnvelope = new IntlInnerWebPayEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlInnerWebPayEnvelope.meta == null) {
                        intlInnerWebPayEnvelope.meta = Meta.new_();
                    }
                    if (intlInnerWebPayEnvelope.data != null) {
                        break;
                    }
                    intlInnerWebPayEnvelope.data = IntlInnerWebPayConfig.new_();
                    break;
                }
                if (iM162497u == 10) {
                    intlInnerWebPayEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (intlInnerWebPayEnvelope.meta == null) {
                            intlInnerWebPayEnvelope.meta = Meta.new_();
                        }
                        if (intlInnerWebPayEnvelope.data != null) {
                            break;
                        }
                        intlInnerWebPayEnvelope.data = IntlInnerWebPayConfig.new_();
                        return intlInnerWebPayEnvelope;
                    }
                    intlInnerWebPayEnvelope.data = (IntlInnerWebPayConfig) nc5Var.m162488l(IntlInnerWebPayConfig.PROTOBUF_ADAPTER);
                }
            }
            return intlInnerWebPayEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlInnerWebPayEnvelope intlInnerWebPayEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlInnerWebPayEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlInnerWebPayConfig intlInnerWebPayConfig = intlInnerWebPayEnvelope.data;
            if (intlInnerWebPayConfig != null) {
                codedOutputByteBufferNano.m17309K(2, intlInnerWebPayConfig, IntlInnerWebPayConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlInnerWebPayEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlInnerWebPayEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPayEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlInnerWebPayEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlInnerWebPayEnvelope newInstance() {
            return new IntlInnerWebPayEnvelope();
        }

        public boolean parseField(IntlInnerWebPayEnvelope intlInnerWebPayEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlInnerWebPayEnvelope.data = IntlInnerWebPayConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlInnerWebPayEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlInnerWebPayEnvelope intlInnerWebPayEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlInnerWebPayEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlInnerWebPayEnvelope intlInnerWebPayEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlInnerWebPayEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlInnerWebPayEnvelope.meta, jsonGenerator, true);
            }
            if (intlInnerWebPayEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlInnerWebPayConfig.JSON_ADAPTER.serialize(intlInnerWebPayEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlInnerWebPayEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlInnerWebPayEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlInnerWebPayEnvelope new_() {
        IntlInnerWebPayEnvelope intlInnerWebPayEnvelope = new IntlInnerWebPayEnvelope();
        intlInnerWebPayEnvelope.nullCheck();
        return intlInnerWebPayEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlInnerWebPayEnvelope mo225055clone() {
        IntlInnerWebPayEnvelope intlInnerWebPayEnvelope = new IntlInnerWebPayEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlInnerWebPayEnvelope.meta = meta.mo225055clone();
        }
        IntlInnerWebPayConfig intlInnerWebPayConfig = this.data;
        if (intlInnerWebPayConfig != null) {
            intlInnerWebPayEnvelope.data = intlInnerWebPayConfig.mo225055clone();
        }
        return intlInnerWebPayEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlInnerWebPayEnvelope)) {
            return false;
        }
        IntlInnerWebPayEnvelope intlInnerWebPayEnvelope = (IntlInnerWebPayEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlInnerWebPayEnvelope.meta) && ValueObject.util_equals(this.data, intlInnerWebPayEnvelope.data);
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
        IntlInnerWebPayConfig intlInnerWebPayConfig = this.data;
        int iHashCode2 = iHashCode + (intlInnerWebPayConfig != null ? intlInnerWebPayConfig.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlInnerWebPayConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
