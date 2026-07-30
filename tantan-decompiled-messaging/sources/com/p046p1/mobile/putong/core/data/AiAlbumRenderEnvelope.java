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
public class AiAlbumRenderEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumrenderenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public AiAlbumStatusData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiAlbumRenderEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumRenderEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumRenderEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiAlbumRenderEnvelope aiAlbumRenderEnvelope) {
            Meta meta = aiAlbumRenderEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AiAlbumStatusData aiAlbumStatusData = aiAlbumRenderEnvelope.data;
            if (aiAlbumStatusData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
            aiAlbumRenderEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiAlbumRenderEnvelope parse(nb5 nb5Var) throws IOException {
            AiAlbumRenderEnvelope aiAlbumRenderEnvelope = new AiAlbumRenderEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (aiAlbumRenderEnvelope.meta == null) {
                        aiAlbumRenderEnvelope.meta = Meta.new_();
                    }
                    if (aiAlbumRenderEnvelope.data != null) {
                        break;
                    }
                    aiAlbumRenderEnvelope.data = AiAlbumStatusData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    aiAlbumRenderEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (aiAlbumRenderEnvelope.meta == null) {
                            aiAlbumRenderEnvelope.meta = Meta.new_();
                        }
                        if (aiAlbumRenderEnvelope.data != null) {
                            break;
                        }
                        aiAlbumRenderEnvelope.data = AiAlbumStatusData.new_();
                        return aiAlbumRenderEnvelope;
                    }
                    aiAlbumRenderEnvelope.data = (AiAlbumStatusData) nb5Var.m158743l(AiAlbumStatusData.PROTOBUF_ADAPTER);
                }
            }
            return aiAlbumRenderEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiAlbumRenderEnvelope aiAlbumRenderEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiAlbumRenderEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AiAlbumStatusData aiAlbumStatusData = aiAlbumRenderEnvelope.data;
            if (aiAlbumStatusData != null) {
                codedOutputByteBufferNano.m17254K(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AiAlbumRenderEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumRenderEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumRenderEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiAlbumRenderEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiAlbumRenderEnvelope newInstance() {
            return new AiAlbumRenderEnvelope();
        }

        public boolean parseField(AiAlbumRenderEnvelope aiAlbumRenderEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                aiAlbumRenderEnvelope.data = AiAlbumStatusData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            aiAlbumRenderEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiAlbumRenderEnvelope aiAlbumRenderEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumRenderEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiAlbumRenderEnvelope aiAlbumRenderEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (aiAlbumRenderEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(aiAlbumRenderEnvelope.meta, jsonGenerator, true);
            }
            if (aiAlbumRenderEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                AiAlbumStatusData.JSON_ADAPTER.serialize(aiAlbumRenderEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumRenderEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumRenderEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumRenderEnvelope new_() {
        AiAlbumRenderEnvelope aiAlbumRenderEnvelope = new AiAlbumRenderEnvelope();
        aiAlbumRenderEnvelope.nullCheck();
        return aiAlbumRenderEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiAlbumRenderEnvelope mo223809clone() {
        AiAlbumRenderEnvelope aiAlbumRenderEnvelope = new AiAlbumRenderEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            aiAlbumRenderEnvelope.meta = meta.mo223809clone();
        }
        AiAlbumStatusData aiAlbumStatusData = this.data;
        if (aiAlbumStatusData != null) {
            aiAlbumRenderEnvelope.data = aiAlbumStatusData.mo223809clone();
        }
        return aiAlbumRenderEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiAlbumRenderEnvelope)) {
            return false;
        }
        AiAlbumRenderEnvelope aiAlbumRenderEnvelope = (AiAlbumRenderEnvelope) obj;
        return ValueObject.util_equals(this.meta, aiAlbumRenderEnvelope.meta) && ValueObject.util_equals(this.data, aiAlbumRenderEnvelope.data);
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
