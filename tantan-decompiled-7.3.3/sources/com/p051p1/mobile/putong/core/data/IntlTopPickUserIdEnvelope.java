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
public class IntlTopPickUserIdEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltoppickuseridenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlTopPickUserId data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlTopPickUserIdEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTopPickUserIdEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlTopPickUserIdEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope) {
            Meta meta = intlTopPickUserIdEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlTopPickUserId intlTopPickUserId = intlTopPickUserIdEnvelope.data;
            if (intlTopPickUserId != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, intlTopPickUserId, IntlTopPickUserId.PROTOBUF_ADAPTER);
            }
            intlTopPickUserIdEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlTopPickUserIdEnvelope parse(nc5 nc5Var) throws IOException {
            IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope = new IntlTopPickUserIdEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlTopPickUserIdEnvelope.meta == null) {
                        intlTopPickUserIdEnvelope.meta = Meta.new_();
                    }
                    if (intlTopPickUserIdEnvelope.data != null) {
                        break;
                    }
                    intlTopPickUserIdEnvelope.data = IntlTopPickUserId.new_();
                    break;
                }
                if (iM162497u == 10) {
                    intlTopPickUserIdEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (intlTopPickUserIdEnvelope.meta == null) {
                            intlTopPickUserIdEnvelope.meta = Meta.new_();
                        }
                        if (intlTopPickUserIdEnvelope.data != null) {
                            break;
                        }
                        intlTopPickUserIdEnvelope.data = IntlTopPickUserId.new_();
                        return intlTopPickUserIdEnvelope;
                    }
                    intlTopPickUserIdEnvelope.data = (IntlTopPickUserId) nc5Var.m162488l(IntlTopPickUserId.PROTOBUF_ADAPTER);
                }
            }
            return intlTopPickUserIdEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlTopPickUserIdEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlTopPickUserId intlTopPickUserId = intlTopPickUserIdEnvelope.data;
            if (intlTopPickUserId != null) {
                codedOutputByteBufferNano.m17309K(2, intlTopPickUserId, IntlTopPickUserId.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlTopPickUserIdEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlTopPickUserIdEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlTopPickUserIdEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlTopPickUserIdEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlTopPickUserIdEnvelope newInstance() {
            return new IntlTopPickUserIdEnvelope();
        }

        public boolean parseField(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlTopPickUserIdEnvelope.data = IntlTopPickUserId.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlTopPickUserIdEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlTopPickUserIdEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlTopPickUserIdEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlTopPickUserIdEnvelope.meta, jsonGenerator, true);
            }
            if (intlTopPickUserIdEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlTopPickUserId.JSON_ADAPTER.serialize(intlTopPickUserIdEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTopPickUserIdEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTopPickUserIdEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTopPickUserIdEnvelope new_() {
        IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope = new IntlTopPickUserIdEnvelope();
        intlTopPickUserIdEnvelope.nullCheck();
        return intlTopPickUserIdEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlTopPickUserIdEnvelope mo225055clone() {
        IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope = new IntlTopPickUserIdEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlTopPickUserIdEnvelope.meta = meta.mo225055clone();
        }
        IntlTopPickUserId intlTopPickUserId = this.data;
        if (intlTopPickUserId != null) {
            intlTopPickUserIdEnvelope.data = intlTopPickUserId.mo225055clone();
        }
        return intlTopPickUserIdEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlTopPickUserIdEnvelope)) {
            return false;
        }
        IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope = (IntlTopPickUserIdEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlTopPickUserIdEnvelope.meta) && ValueObject.util_equals(this.data, intlTopPickUserIdEnvelope.data);
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
        IntlTopPickUserId intlTopPickUserId = this.data;
        int iHashCode2 = iHashCode + (intlTopPickUserId != null ? intlTopPickUserId.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlTopPickUserId.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
