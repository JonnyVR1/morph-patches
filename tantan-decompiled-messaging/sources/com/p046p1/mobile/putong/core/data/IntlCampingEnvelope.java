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
public class IntlCampingEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlCampingData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlCampingEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlCampingEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlCampingEnvelope intlCampingEnvelope) {
            Meta meta = intlCampingEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlCampingData intlCampingData = intlCampingEnvelope.data;
            if (intlCampingData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, intlCampingData, IntlCampingData.PROTOBUF_ADAPTER);
            }
            intlCampingEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlCampingEnvelope parse(nb5 nb5Var) throws IOException {
            IntlCampingEnvelope intlCampingEnvelope = new IntlCampingEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlCampingEnvelope.meta == null) {
                        intlCampingEnvelope.meta = Meta.new_();
                    }
                    if (intlCampingEnvelope.data != null) {
                        break;
                    }
                    intlCampingEnvelope.data = IntlCampingData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    intlCampingEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (intlCampingEnvelope.meta == null) {
                            intlCampingEnvelope.meta = Meta.new_();
                        }
                        if (intlCampingEnvelope.data != null) {
                            break;
                        }
                        intlCampingEnvelope.data = IntlCampingData.new_();
                        return intlCampingEnvelope;
                    }
                    intlCampingEnvelope.data = (IntlCampingData) nb5Var.m158743l(IntlCampingData.PROTOBUF_ADAPTER);
                }
            }
            return intlCampingEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlCampingEnvelope intlCampingEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlCampingEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlCampingData intlCampingData = intlCampingEnvelope.data;
            if (intlCampingData != null) {
                codedOutputByteBufferNano.m17254K(2, intlCampingData, IntlCampingData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlCampingEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlCampingEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlCampingEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlCampingEnvelope newInstance() {
            return new IntlCampingEnvelope();
        }

        public boolean parseField(IntlCampingEnvelope intlCampingEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlCampingEnvelope.data = IntlCampingData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlCampingEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlCampingEnvelope intlCampingEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlCampingEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlCampingEnvelope intlCampingEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlCampingEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlCampingEnvelope.meta, jsonGenerator, true);
            }
            if (intlCampingEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlCampingData.JSON_ADAPTER.serialize(intlCampingEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingEnvelope new_() {
        IntlCampingEnvelope intlCampingEnvelope = new IntlCampingEnvelope();
        intlCampingEnvelope.nullCheck();
        return intlCampingEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlCampingEnvelope mo223809clone() {
        IntlCampingEnvelope intlCampingEnvelope = new IntlCampingEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlCampingEnvelope.meta = meta.mo223809clone();
        }
        IntlCampingData intlCampingData = this.data;
        if (intlCampingData != null) {
            intlCampingEnvelope.data = intlCampingData.mo223809clone();
        }
        return intlCampingEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingEnvelope)) {
            return false;
        }
        IntlCampingEnvelope intlCampingEnvelope = (IntlCampingEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlCampingEnvelope.meta) && ValueObject.util_equals(this.data, intlCampingEnvelope.data);
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
        IntlCampingData intlCampingData = this.data;
        int iHashCode2 = iHashCode + (intlCampingData != null ? intlCampingData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlCampingData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
