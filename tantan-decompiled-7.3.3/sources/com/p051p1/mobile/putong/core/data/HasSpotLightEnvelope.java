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
public class HasSpotLightEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hasspotlightenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public HasSpotLightData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<HasSpotLightEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<HasSpotLightEnvelope>() { // from class: com.p1.mobile.putong.core.data.HasSpotLightEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HasSpotLightEnvelope hasSpotLightEnvelope) {
            Meta meta = hasSpotLightEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            HasSpotLightData hasSpotLightData = hasSpotLightEnvelope.data;
            if (hasSpotLightData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, hasSpotLightData, HasSpotLightData.PROTOBUF_ADAPTER);
            }
            hasSpotLightEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HasSpotLightEnvelope parse(nc5 nc5Var) throws IOException {
            HasSpotLightEnvelope hasSpotLightEnvelope = new HasSpotLightEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hasSpotLightEnvelope.meta == null) {
                        hasSpotLightEnvelope.meta = Meta.new_();
                    }
                    if (hasSpotLightEnvelope.data != null) {
                        break;
                    }
                    hasSpotLightEnvelope.data = HasSpotLightData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    hasSpotLightEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (hasSpotLightEnvelope.meta == null) {
                            hasSpotLightEnvelope.meta = Meta.new_();
                        }
                        if (hasSpotLightEnvelope.data != null) {
                            break;
                        }
                        hasSpotLightEnvelope.data = HasSpotLightData.new_();
                        return hasSpotLightEnvelope;
                    }
                    hasSpotLightEnvelope.data = (HasSpotLightData) nc5Var.m162488l(HasSpotLightData.PROTOBUF_ADAPTER);
                }
            }
            return hasSpotLightEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HasSpotLightEnvelope hasSpotLightEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = hasSpotLightEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            HasSpotLightData hasSpotLightData = hasSpotLightEnvelope.data;
            if (hasSpotLightData != null) {
                codedOutputByteBufferNano.m17309K(2, hasSpotLightData, HasSpotLightData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HasSpotLightEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<HasSpotLightEnvelope>() { // from class: com.p1.mobile.putong.core.data.HasSpotLightEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HasSpotLightEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HasSpotLightEnvelope newInstance() {
            return new HasSpotLightEnvelope();
        }

        public boolean parseField(HasSpotLightEnvelope hasSpotLightEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                hasSpotLightEnvelope.data = HasSpotLightData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            hasSpotLightEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HasSpotLightEnvelope hasSpotLightEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(hasSpotLightEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HasSpotLightEnvelope hasSpotLightEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (hasSpotLightEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(hasSpotLightEnvelope.meta, jsonGenerator, true);
            }
            if (hasSpotLightEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                HasSpotLightData.JSON_ADAPTER.serialize(hasSpotLightEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HasSpotLightEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HasSpotLightEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HasSpotLightEnvelope new_() {
        HasSpotLightEnvelope hasSpotLightEnvelope = new HasSpotLightEnvelope();
        hasSpotLightEnvelope.nullCheck();
        return hasSpotLightEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HasSpotLightEnvelope mo225055clone() {
        HasSpotLightEnvelope hasSpotLightEnvelope = new HasSpotLightEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            hasSpotLightEnvelope.meta = meta.mo225055clone();
        }
        HasSpotLightData hasSpotLightData = this.data;
        if (hasSpotLightData != null) {
            hasSpotLightEnvelope.data = hasSpotLightData.mo225055clone();
        }
        return hasSpotLightEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HasSpotLightEnvelope)) {
            return false;
        }
        HasSpotLightEnvelope hasSpotLightEnvelope = (HasSpotLightEnvelope) obj;
        return ValueObject.util_equals(this.meta, hasSpotLightEnvelope.meta) && ValueObject.util_equals(this.data, hasSpotLightEnvelope.data);
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
        HasSpotLightData hasSpotLightData = this.data;
        int iHashCode2 = iHashCode + (hasSpotLightData != null ? hasSpotLightData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = HasSpotLightData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
