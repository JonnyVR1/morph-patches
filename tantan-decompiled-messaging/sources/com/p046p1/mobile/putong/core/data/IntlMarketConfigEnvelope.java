package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class IntlMarketConfigEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketconfigenvelope";

    @Nullable
    @ProtobufIndex(index = 2)
    public IntlMarketConfigData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlMarketConfigEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
            Meta meta = intlMarketConfigEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlMarketConfigData intlMarketConfigData = intlMarketConfigEnvelope.data;
            if (intlMarketConfigData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, intlMarketConfigData, IntlMarketConfigData.PROTOBUF_ADAPTER);
            }
            intlMarketConfigEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketConfigEnvelope parse(nb5 nb5Var) throws IOException {
            IntlMarketConfigEnvelope intlMarketConfigEnvelope = new IntlMarketConfigEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlMarketConfigEnvelope.meta != null) {
                        break;
                    }
                    intlMarketConfigEnvelope.meta = Meta.new_();
                    break;
                }
                if (iM158752u == 10) {
                    intlMarketConfigEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (intlMarketConfigEnvelope.meta != null) {
                            break;
                        }
                        intlMarketConfigEnvelope.meta = Meta.new_();
                        return intlMarketConfigEnvelope;
                    }
                    intlMarketConfigEnvelope.data = (IntlMarketConfigData) nb5Var.m158743l(IntlMarketConfigData.PROTOBUF_ADAPTER);
                }
            }
            return intlMarketConfigEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketConfigEnvelope intlMarketConfigEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlMarketConfigEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlMarketConfigData intlMarketConfigData = intlMarketConfigEnvelope.data;
            if (intlMarketConfigData != null) {
                codedOutputByteBufferNano.m17254K(2, intlMarketConfigData, IntlMarketConfigData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlMarketConfigEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketConfigEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketConfigEnvelope newInstance() {
            return new IntlMarketConfigEnvelope();
        }

        public boolean parseField(IntlMarketConfigEnvelope intlMarketConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlMarketConfigEnvelope.data = IntlMarketConfigData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlMarketConfigEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlMarketConfigEnvelope intlMarketConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlMarketConfigEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketConfigEnvelope intlMarketConfigEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlMarketConfigEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlMarketConfigEnvelope.meta, jsonGenerator, true);
            }
            if (intlMarketConfigEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlMarketConfigData.JSON_ADAPTER.serialize(intlMarketConfigEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketConfigEnvelope new_() {
        IntlMarketConfigEnvelope intlMarketConfigEnvelope = new IntlMarketConfigEnvelope();
        intlMarketConfigEnvelope.nullCheck();
        return intlMarketConfigEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketConfigEnvelope mo223809clone() {
        IntlMarketConfigEnvelope intlMarketConfigEnvelope = new IntlMarketConfigEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlMarketConfigEnvelope.meta = meta.mo223809clone();
        }
        IntlMarketConfigData intlMarketConfigData = this.data;
        if (intlMarketConfigData != null) {
            intlMarketConfigEnvelope.data = intlMarketConfigData.mo223809clone();
        }
        return intlMarketConfigEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketConfigEnvelope)) {
            return false;
        }
        IntlMarketConfigEnvelope intlMarketConfigEnvelope = (IntlMarketConfigEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlMarketConfigEnvelope.meta) && ValueObject.util_equals(this.data, intlMarketConfigEnvelope.data);
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
        IntlMarketConfigData intlMarketConfigData = this.data;
        int iHashCode2 = iHashCode + (intlMarketConfigData != null ? intlMarketConfigData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
