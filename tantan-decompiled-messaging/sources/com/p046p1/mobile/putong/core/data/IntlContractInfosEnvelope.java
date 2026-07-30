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
public class IntlContractInfosEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcontractinfosenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlContractdData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlContractInfosEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlContractInfosEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlContractInfosEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlContractInfosEnvelope intlContractInfosEnvelope) {
            Meta meta = intlContractInfosEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlContractdData intlContractdData = intlContractInfosEnvelope.data;
            if (intlContractdData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, intlContractdData, IntlContractdData.PROTOBUF_ADAPTER);
            }
            intlContractInfosEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlContractInfosEnvelope parse(nb5 nb5Var) throws IOException {
            IntlContractInfosEnvelope intlContractInfosEnvelope = new IntlContractInfosEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlContractInfosEnvelope.meta == null) {
                        intlContractInfosEnvelope.meta = Meta.new_();
                    }
                    if (intlContractInfosEnvelope.data != null) {
                        break;
                    }
                    intlContractInfosEnvelope.data = IntlContractdData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    intlContractInfosEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (intlContractInfosEnvelope.meta == null) {
                            intlContractInfosEnvelope.meta = Meta.new_();
                        }
                        if (intlContractInfosEnvelope.data != null) {
                            break;
                        }
                        intlContractInfosEnvelope.data = IntlContractdData.new_();
                        return intlContractInfosEnvelope;
                    }
                    intlContractInfosEnvelope.data = (IntlContractdData) nb5Var.m158743l(IntlContractdData.PROTOBUF_ADAPTER);
                }
            }
            return intlContractInfosEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlContractInfosEnvelope intlContractInfosEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlContractInfosEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlContractdData intlContractdData = intlContractInfosEnvelope.data;
            if (intlContractdData != null) {
                codedOutputByteBufferNano.m17254K(2, intlContractdData, IntlContractdData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlContractInfosEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlContractInfosEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlContractInfosEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlContractInfosEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlContractInfosEnvelope newInstance() {
            return new IntlContractInfosEnvelope();
        }

        public boolean parseField(IntlContractInfosEnvelope intlContractInfosEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlContractInfosEnvelope.data = IntlContractdData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlContractInfosEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlContractInfosEnvelope intlContractInfosEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlContractInfosEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlContractInfosEnvelope intlContractInfosEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlContractInfosEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlContractInfosEnvelope.meta, jsonGenerator, true);
            }
            if (intlContractInfosEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlContractdData.JSON_ADAPTER.serialize(intlContractInfosEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlContractInfosEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlContractInfosEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlContractInfosEnvelope new_() {
        IntlContractInfosEnvelope intlContractInfosEnvelope = new IntlContractInfosEnvelope();
        intlContractInfosEnvelope.nullCheck();
        return intlContractInfosEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlContractInfosEnvelope mo223809clone() {
        IntlContractInfosEnvelope intlContractInfosEnvelope = new IntlContractInfosEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlContractInfosEnvelope.meta = meta.mo223809clone();
        }
        IntlContractdData intlContractdData = this.data;
        if (intlContractdData != null) {
            intlContractInfosEnvelope.data = intlContractdData.mo223809clone();
        }
        return intlContractInfosEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlContractInfosEnvelope)) {
            return false;
        }
        IntlContractInfosEnvelope intlContractInfosEnvelope = (IntlContractInfosEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlContractInfosEnvelope.meta) && ValueObject.util_equals(this.data, intlContractInfosEnvelope.data);
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
        IntlContractdData intlContractdData = this.data;
        int iHashCode2 = iHashCode + (intlContractdData != null ? intlContractdData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlContractdData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
