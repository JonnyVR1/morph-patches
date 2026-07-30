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
public class IntlCampingConfigEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingconfigenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlCampingConfigData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlCampingConfigEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlCampingConfigEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
            Meta meta = intlCampingConfigEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlCampingConfigData intlCampingConfigData = intlCampingConfigEnvelope.data;
            if (intlCampingConfigData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, intlCampingConfigData, IntlCampingConfigData.PROTOBUF_ADAPTER);
            }
            intlCampingConfigEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlCampingConfigEnvelope parse(nb5 nb5Var) throws IOException {
            IntlCampingConfigEnvelope intlCampingConfigEnvelope = new IntlCampingConfigEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlCampingConfigEnvelope.meta == null) {
                        intlCampingConfigEnvelope.meta = Meta.new_();
                    }
                    if (intlCampingConfigEnvelope.data != null) {
                        break;
                    }
                    intlCampingConfigEnvelope.data = IntlCampingConfigData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    intlCampingConfigEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (intlCampingConfigEnvelope.meta == null) {
                            intlCampingConfigEnvelope.meta = Meta.new_();
                        }
                        if (intlCampingConfigEnvelope.data != null) {
                            break;
                        }
                        intlCampingConfigEnvelope.data = IntlCampingConfigData.new_();
                        return intlCampingConfigEnvelope;
                    }
                    intlCampingConfigEnvelope.data = (IntlCampingConfigData) nb5Var.m158743l(IntlCampingConfigData.PROTOBUF_ADAPTER);
                }
            }
            return intlCampingConfigEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlCampingConfigEnvelope intlCampingConfigEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlCampingConfigEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlCampingConfigData intlCampingConfigData = intlCampingConfigEnvelope.data;
            if (intlCampingConfigData != null) {
                codedOutputByteBufferNano.m17254K(2, intlCampingConfigData, IntlCampingConfigData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlCampingConfigEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlCampingConfigEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlCampingConfigEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlCampingConfigEnvelope newInstance() {
            return new IntlCampingConfigEnvelope();
        }

        public boolean parseField(IntlCampingConfigEnvelope intlCampingConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlCampingConfigEnvelope.data = IntlCampingConfigData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlCampingConfigEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlCampingConfigEnvelope intlCampingConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlCampingConfigEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlCampingConfigEnvelope intlCampingConfigEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlCampingConfigEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlCampingConfigEnvelope.meta, jsonGenerator, true);
            }
            if (intlCampingConfigEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlCampingConfigData.JSON_ADAPTER.serialize(intlCampingConfigEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingConfigEnvelope new_() {
        IntlCampingConfigEnvelope intlCampingConfigEnvelope = new IntlCampingConfigEnvelope();
        intlCampingConfigEnvelope.nullCheck();
        return intlCampingConfigEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlCampingConfigEnvelope mo223809clone() {
        IntlCampingConfigEnvelope intlCampingConfigEnvelope = new IntlCampingConfigEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlCampingConfigEnvelope.meta = meta.mo223809clone();
        }
        IntlCampingConfigData intlCampingConfigData = this.data;
        if (intlCampingConfigData != null) {
            intlCampingConfigEnvelope.data = intlCampingConfigData.mo223809clone();
        }
        return intlCampingConfigEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingConfigEnvelope)) {
            return false;
        }
        IntlCampingConfigEnvelope intlCampingConfigEnvelope = (IntlCampingConfigEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlCampingConfigEnvelope.meta) && ValueObject.util_equals(this.data, intlCampingConfigEnvelope.data);
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
        IntlCampingConfigData intlCampingConfigData = this.data;
        int iHashCode2 = iHashCode + (intlCampingConfigData != null ? intlCampingConfigData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlCampingConfigData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
