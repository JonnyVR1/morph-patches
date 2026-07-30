package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMarketResponseEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketresponseenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlMarketResponseData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlMarketResponseEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketResponseEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
            Meta meta = intlMarketResponseEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlMarketResponseData intlMarketResponseData = intlMarketResponseEnvelope.data;
            if (intlMarketResponseData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, intlMarketResponseData, IntlMarketResponseData.PROTOBUF_ADAPTER);
            }
            intlMarketResponseEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketResponseEnvelope parse(nb5 nb5Var) throws IOException {
            IntlMarketResponseEnvelope intlMarketResponseEnvelope = new IntlMarketResponseEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlMarketResponseEnvelope.meta == null) {
                        intlMarketResponseEnvelope.meta = Meta.new_();
                    }
                    if (intlMarketResponseEnvelope.data != null) {
                        break;
                    }
                    intlMarketResponseEnvelope.data = IntlMarketResponseData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    intlMarketResponseEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (intlMarketResponseEnvelope.meta == null) {
                            intlMarketResponseEnvelope.meta = Meta.new_();
                        }
                        if (intlMarketResponseEnvelope.data != null) {
                            break;
                        }
                        intlMarketResponseEnvelope.data = IntlMarketResponseData.new_();
                        return intlMarketResponseEnvelope;
                    }
                    intlMarketResponseEnvelope.data = (IntlMarketResponseData) nb5Var.m158743l(IntlMarketResponseData.PROTOBUF_ADAPTER);
                }
            }
            return intlMarketResponseEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketResponseEnvelope intlMarketResponseEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlMarketResponseEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlMarketResponseData intlMarketResponseData = intlMarketResponseEnvelope.data;
            if (intlMarketResponseData != null) {
                codedOutputByteBufferNano.m17254K(2, intlMarketResponseData, IntlMarketResponseData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlMarketResponseEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketResponseEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlMarketResponseEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketResponseEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketResponseEnvelope newInstance() {
            return new IntlMarketResponseEnvelope();
        }

        public boolean parseField(IntlMarketResponseEnvelope intlMarketResponseEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlMarketResponseEnvelope.data = IntlMarketResponseData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlMarketResponseEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlMarketResponseEnvelope intlMarketResponseEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlMarketResponseEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketResponseEnvelope intlMarketResponseEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlMarketResponseEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlMarketResponseEnvelope.meta, jsonGenerator, true);
            }
            if (intlMarketResponseEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlMarketResponseData.JSON_ADAPTER.serialize(intlMarketResponseEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketResponseEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketResponseEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketResponseEnvelope new_() {
        IntlMarketResponseEnvelope intlMarketResponseEnvelope = new IntlMarketResponseEnvelope();
        intlMarketResponseEnvelope.nullCheck();
        return intlMarketResponseEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketResponseEnvelope mo223809clone() {
        IntlMarketResponseEnvelope intlMarketResponseEnvelope = new IntlMarketResponseEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlMarketResponseEnvelope.meta = meta.mo223809clone();
        }
        IntlMarketResponseData intlMarketResponseData = this.data;
        if (intlMarketResponseData != null) {
            intlMarketResponseEnvelope.data = intlMarketResponseData.mo223809clone();
        }
        return intlMarketResponseEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketResponseEnvelope)) {
            return false;
        }
        IntlMarketResponseEnvelope intlMarketResponseEnvelope = (IntlMarketResponseEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlMarketResponseEnvelope.meta) && ValueObject.util_equals(this.data, intlMarketResponseEnvelope.data);
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
        IntlMarketResponseData intlMarketResponseData = this.data;
        int iHashCode2 = iHashCode + (intlMarketResponseData != null ? intlMarketResponseData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlMarketResponseData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
