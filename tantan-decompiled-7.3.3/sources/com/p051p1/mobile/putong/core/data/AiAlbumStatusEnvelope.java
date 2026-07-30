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
public class AiAlbumStatusEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumstatusenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public AiAlbumStatusData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiAlbumStatusEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumStatusEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumStatusEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiAlbumStatusEnvelope aiAlbumStatusEnvelope) {
            Meta meta = aiAlbumStatusEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AiAlbumStatusData aiAlbumStatusData = aiAlbumStatusEnvelope.data;
            if (aiAlbumStatusData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
            aiAlbumStatusEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiAlbumStatusEnvelope parse(nc5 nc5Var) throws IOException {
            AiAlbumStatusEnvelope aiAlbumStatusEnvelope = new AiAlbumStatusEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiAlbumStatusEnvelope.meta == null) {
                        aiAlbumStatusEnvelope.meta = Meta.new_();
                    }
                    if (aiAlbumStatusEnvelope.data != null) {
                        break;
                    }
                    aiAlbumStatusEnvelope.data = AiAlbumStatusData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    aiAlbumStatusEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (aiAlbumStatusEnvelope.meta == null) {
                            aiAlbumStatusEnvelope.meta = Meta.new_();
                        }
                        if (aiAlbumStatusEnvelope.data != null) {
                            break;
                        }
                        aiAlbumStatusEnvelope.data = AiAlbumStatusData.new_();
                        return aiAlbumStatusEnvelope;
                    }
                    aiAlbumStatusEnvelope.data = (AiAlbumStatusData) nc5Var.m162488l(AiAlbumStatusData.PROTOBUF_ADAPTER);
                }
            }
            return aiAlbumStatusEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiAlbumStatusEnvelope aiAlbumStatusEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiAlbumStatusEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AiAlbumStatusData aiAlbumStatusData = aiAlbumStatusEnvelope.data;
            if (aiAlbumStatusData != null) {
                codedOutputByteBufferNano.m17309K(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AiAlbumStatusEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumStatusEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumStatusEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiAlbumStatusEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiAlbumStatusEnvelope newInstance() {
            return new AiAlbumStatusEnvelope();
        }

        public boolean parseField(AiAlbumStatusEnvelope aiAlbumStatusEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                aiAlbumStatusEnvelope.data = AiAlbumStatusData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            aiAlbumStatusEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiAlbumStatusEnvelope aiAlbumStatusEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumStatusEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiAlbumStatusEnvelope aiAlbumStatusEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (aiAlbumStatusEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(aiAlbumStatusEnvelope.meta, jsonGenerator, true);
            }
            if (aiAlbumStatusEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                AiAlbumStatusData.JSON_ADAPTER.serialize(aiAlbumStatusEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumStatusEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumStatusEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumStatusEnvelope new_() {
        AiAlbumStatusEnvelope aiAlbumStatusEnvelope = new AiAlbumStatusEnvelope();
        aiAlbumStatusEnvelope.nullCheck();
        return aiAlbumStatusEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiAlbumStatusEnvelope mo225055clone() {
        AiAlbumStatusEnvelope aiAlbumStatusEnvelope = new AiAlbumStatusEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            aiAlbumStatusEnvelope.meta = meta.mo225055clone();
        }
        AiAlbumStatusData aiAlbumStatusData = this.data;
        if (aiAlbumStatusData != null) {
            aiAlbumStatusEnvelope.data = aiAlbumStatusData.mo225055clone();
        }
        return aiAlbumStatusEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiAlbumStatusEnvelope)) {
            return false;
        }
        AiAlbumStatusEnvelope aiAlbumStatusEnvelope = (AiAlbumStatusEnvelope) obj;
        return ValueObject.util_equals(this.meta, aiAlbumStatusEnvelope.meta) && ValueObject.util_equals(this.data, aiAlbumStatusEnvelope.data);
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
        AiAlbumStatusData aiAlbumStatusData = this.data;
        int iHashCode2 = iHashCode + (aiAlbumStatusData != null ? aiAlbumStatusData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = AiAlbumStatusData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
