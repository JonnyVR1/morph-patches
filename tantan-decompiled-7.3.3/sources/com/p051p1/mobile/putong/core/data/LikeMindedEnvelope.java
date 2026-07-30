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
public class LikeMindedEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindedenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public LikeMindedData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<LikeMindedEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedEnvelope>() { // from class: com.p1.mobile.putong.core.data.LikeMindedEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeMindedEnvelope likeMindedEnvelope) {
            Meta meta = likeMindedEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            LikeMindedData likeMindedData = likeMindedEnvelope.data;
            if (likeMindedData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, likeMindedData, LikeMindedData.PROTOBUF_ADAPTER);
            }
            likeMindedEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeMindedEnvelope parse(nc5 nc5Var) throws IOException {
            LikeMindedEnvelope likeMindedEnvelope = new LikeMindedEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (likeMindedEnvelope.meta == null) {
                        likeMindedEnvelope.meta = Meta.new_();
                    }
                    if (likeMindedEnvelope.data != null) {
                        break;
                    }
                    likeMindedEnvelope.data = LikeMindedData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    likeMindedEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (likeMindedEnvelope.meta == null) {
                            likeMindedEnvelope.meta = Meta.new_();
                        }
                        if (likeMindedEnvelope.data != null) {
                            break;
                        }
                        likeMindedEnvelope.data = LikeMindedData.new_();
                        return likeMindedEnvelope;
                    }
                    likeMindedEnvelope.data = (LikeMindedData) nc5Var.m162488l(LikeMindedData.PROTOBUF_ADAPTER);
                }
            }
            return likeMindedEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeMindedEnvelope likeMindedEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = likeMindedEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            LikeMindedData likeMindedData = likeMindedEnvelope.data;
            if (likeMindedData != null) {
                codedOutputByteBufferNano.m17309K(2, likeMindedData, LikeMindedData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LikeMindedEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedEnvelope>() { // from class: com.p1.mobile.putong.core.data.LikeMindedEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeMindedEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeMindedEnvelope newInstance() {
            return new LikeMindedEnvelope();
        }

        public boolean parseField(LikeMindedEnvelope likeMindedEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                likeMindedEnvelope.data = LikeMindedData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            likeMindedEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LikeMindedEnvelope likeMindedEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(likeMindedEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeMindedEnvelope likeMindedEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (likeMindedEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(likeMindedEnvelope.meta, jsonGenerator, true);
            }
            if (likeMindedEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                LikeMindedData.JSON_ADAPTER.serialize(likeMindedEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedEnvelope new_() {
        LikeMindedEnvelope likeMindedEnvelope = new LikeMindedEnvelope();
        likeMindedEnvelope.nullCheck();
        return likeMindedEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeMindedEnvelope mo225055clone() {
        LikeMindedEnvelope likeMindedEnvelope = new LikeMindedEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            likeMindedEnvelope.meta = meta.mo225055clone();
        }
        LikeMindedData likeMindedData = this.data;
        if (likeMindedData != null) {
            likeMindedEnvelope.data = likeMindedData.mo225055clone();
        }
        return likeMindedEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedEnvelope)) {
            return false;
        }
        LikeMindedEnvelope likeMindedEnvelope = (LikeMindedEnvelope) obj;
        return ValueObject.util_equals(this.meta, likeMindedEnvelope.meta) && ValueObject.util_equals(this.data, likeMindedEnvelope.data);
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
        LikeMindedData likeMindedData = this.data;
        int iHashCode2 = iHashCode + (likeMindedData != null ? likeMindedData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = LikeMindedData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
