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
public class SogouGifEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sogougifenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public SogouGifData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<SogouGifEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<SogouGifEnvelope>() { // from class: com.p1.mobile.putong.core.data.SogouGifEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SogouGifEnvelope sogouGifEnvelope) {
            Meta meta = sogouGifEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            SogouGifData sogouGifData = sogouGifEnvelope.data;
            if (sogouGifData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, sogouGifData, SogouGifData.PROTOBUF_ADAPTER);
            }
            sogouGifEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SogouGifEnvelope parse(nb5 nb5Var) throws IOException {
            SogouGifEnvelope sogouGifEnvelope = new SogouGifEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (sogouGifEnvelope.meta == null) {
                        sogouGifEnvelope.meta = Meta.new_();
                    }
                    if (sogouGifEnvelope.data != null) {
                        break;
                    }
                    sogouGifEnvelope.data = SogouGifData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    sogouGifEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (sogouGifEnvelope.meta == null) {
                            sogouGifEnvelope.meta = Meta.new_();
                        }
                        if (sogouGifEnvelope.data != null) {
                            break;
                        }
                        sogouGifEnvelope.data = SogouGifData.new_();
                        return sogouGifEnvelope;
                    }
                    sogouGifEnvelope.data = (SogouGifData) nb5Var.m158743l(SogouGifData.PROTOBUF_ADAPTER);
                }
            }
            return sogouGifEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SogouGifEnvelope sogouGifEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = sogouGifEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            SogouGifData sogouGifData = sogouGifEnvelope.data;
            if (sogouGifData != null) {
                codedOutputByteBufferNano.m17254K(2, sogouGifData, SogouGifData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SogouGifEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<SogouGifEnvelope>() { // from class: com.p1.mobile.putong.core.data.SogouGifEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SogouGifEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SogouGifEnvelope newInstance() {
            return new SogouGifEnvelope();
        }

        public boolean parseField(SogouGifEnvelope sogouGifEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                sogouGifEnvelope.data = SogouGifData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            sogouGifEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SogouGifEnvelope sogouGifEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(sogouGifEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SogouGifEnvelope sogouGifEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (sogouGifEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(sogouGifEnvelope.meta, jsonGenerator, true);
            }
            if (sogouGifEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                SogouGifData.JSON_ADAPTER.serialize(sogouGifEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SogouGifEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SogouGifEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SogouGifEnvelope new_() {
        SogouGifEnvelope sogouGifEnvelope = new SogouGifEnvelope();
        sogouGifEnvelope.nullCheck();
        return sogouGifEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SogouGifEnvelope mo223809clone() {
        SogouGifEnvelope sogouGifEnvelope = new SogouGifEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            sogouGifEnvelope.meta = meta.mo223809clone();
        }
        SogouGifData sogouGifData = this.data;
        if (sogouGifData != null) {
            sogouGifEnvelope.data = sogouGifData.mo223809clone();
        }
        return sogouGifEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SogouGifEnvelope)) {
            return false;
        }
        SogouGifEnvelope sogouGifEnvelope = (SogouGifEnvelope) obj;
        return ValueObject.util_equals(this.meta, sogouGifEnvelope.meta) && ValueObject.util_equals(this.data, sogouGifEnvelope.data);
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
        SogouGifData sogouGifData = this.data;
        int iHashCode2 = iHashCode + (sogouGifData != null ? sogouGifData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = SogouGifData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
