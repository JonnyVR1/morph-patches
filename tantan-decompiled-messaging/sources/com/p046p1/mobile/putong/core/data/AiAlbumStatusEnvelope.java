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
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AiAlbumStatusData aiAlbumStatusData = aiAlbumStatusEnvelope.data;
            if (aiAlbumStatusData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
            aiAlbumStatusEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiAlbumStatusEnvelope parse(nb5 nb5Var) throws IOException {
            AiAlbumStatusEnvelope aiAlbumStatusEnvelope = new AiAlbumStatusEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (aiAlbumStatusEnvelope.meta == null) {
                        aiAlbumStatusEnvelope.meta = Meta.new_();
                    }
                    if (aiAlbumStatusEnvelope.data != null) {
                        break;
                    }
                    aiAlbumStatusEnvelope.data = AiAlbumStatusData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    aiAlbumStatusEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (aiAlbumStatusEnvelope.meta == null) {
                            aiAlbumStatusEnvelope.meta = Meta.new_();
                        }
                        if (aiAlbumStatusEnvelope.data != null) {
                            break;
                        }
                        aiAlbumStatusEnvelope.data = AiAlbumStatusData.new_();
                        return aiAlbumStatusEnvelope;
                    }
                    aiAlbumStatusEnvelope.data = (AiAlbumStatusData) nb5Var.m158743l(AiAlbumStatusData.PROTOBUF_ADAPTER);
                }
            }
            return aiAlbumStatusEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiAlbumStatusEnvelope aiAlbumStatusEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiAlbumStatusEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AiAlbumStatusData aiAlbumStatusData = aiAlbumStatusEnvelope.data;
            if (aiAlbumStatusData != null) {
                codedOutputByteBufferNano.m17254K(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AiAlbumStatusEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumStatusEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumStatusEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiAlbumStatusEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumStatusEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public AiAlbumStatusEnvelope mo223809clone() {
        AiAlbumStatusEnvelope aiAlbumStatusEnvelope = new AiAlbumStatusEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            aiAlbumStatusEnvelope.meta = meta.mo223809clone();
        }
        AiAlbumStatusData aiAlbumStatusData = this.data;
        if (aiAlbumStatusData != null) {
            aiAlbumStatusEnvelope.data = aiAlbumStatusData.mo223809clone();
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
