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
public class IntlThirdQuickLoginEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlthirdquickloginenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlThirdQuickLoginData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlThirdQuickLoginEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlThirdQuickLoginEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope) {
            Meta meta = intlThirdQuickLoginEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlThirdQuickLoginData intlThirdQuickLoginData = intlThirdQuickLoginEnvelope.data;
            if (intlThirdQuickLoginData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, intlThirdQuickLoginData, IntlThirdQuickLoginData.PROTOBUF_ADAPTER);
            }
            intlThirdQuickLoginEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlThirdQuickLoginEnvelope parse(nc5 nc5Var) throws IOException {
            IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope = new IntlThirdQuickLoginEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlThirdQuickLoginEnvelope.meta == null) {
                        intlThirdQuickLoginEnvelope.meta = Meta.new_();
                    }
                    if (intlThirdQuickLoginEnvelope.data != null) {
                        break;
                    }
                    intlThirdQuickLoginEnvelope.data = IntlThirdQuickLoginData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    intlThirdQuickLoginEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (intlThirdQuickLoginEnvelope.meta == null) {
                            intlThirdQuickLoginEnvelope.meta = Meta.new_();
                        }
                        if (intlThirdQuickLoginEnvelope.data != null) {
                            break;
                        }
                        intlThirdQuickLoginEnvelope.data = IntlThirdQuickLoginData.new_();
                        return intlThirdQuickLoginEnvelope;
                    }
                    intlThirdQuickLoginEnvelope.data = (IntlThirdQuickLoginData) nc5Var.m162488l(IntlThirdQuickLoginData.PROTOBUF_ADAPTER);
                }
            }
            return intlThirdQuickLoginEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlThirdQuickLoginEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlThirdQuickLoginData intlThirdQuickLoginData = intlThirdQuickLoginEnvelope.data;
            if (intlThirdQuickLoginData != null) {
                codedOutputByteBufferNano.m17309K(2, intlThirdQuickLoginData, IntlThirdQuickLoginData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlThirdQuickLoginEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlThirdQuickLoginEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlThirdQuickLoginEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlThirdQuickLoginEnvelope newInstance() {
            return new IntlThirdQuickLoginEnvelope();
        }

        public boolean parseField(IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlThirdQuickLoginEnvelope.data = IntlThirdQuickLoginData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlThirdQuickLoginEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlThirdQuickLoginEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlThirdQuickLoginEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlThirdQuickLoginEnvelope.meta, jsonGenerator, true);
            }
            if (intlThirdQuickLoginEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlThirdQuickLoginData.JSON_ADAPTER.serialize(intlThirdQuickLoginEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlThirdQuickLoginEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlThirdQuickLoginEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlThirdQuickLoginEnvelope new_() {
        IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope = new IntlThirdQuickLoginEnvelope();
        intlThirdQuickLoginEnvelope.nullCheck();
        return intlThirdQuickLoginEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlThirdQuickLoginEnvelope mo225055clone() {
        IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope = new IntlThirdQuickLoginEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlThirdQuickLoginEnvelope.meta = meta.mo225055clone();
        }
        IntlThirdQuickLoginData intlThirdQuickLoginData = this.data;
        if (intlThirdQuickLoginData != null) {
            intlThirdQuickLoginEnvelope.data = intlThirdQuickLoginData.mo225055clone();
        }
        return intlThirdQuickLoginEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlThirdQuickLoginEnvelope)) {
            return false;
        }
        IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope = (IntlThirdQuickLoginEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlThirdQuickLoginEnvelope.meta) && ValueObject.util_equals(this.data, intlThirdQuickLoginEnvelope.data);
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
        IntlThirdQuickLoginData intlThirdQuickLoginData = this.data;
        int iHashCode2 = iHashCode + (intlThirdQuickLoginData != null ? intlThirdQuickLoginData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlThirdQuickLoginData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
