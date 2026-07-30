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
public class AiAlbumCheckEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumcheckenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public AiAlbumCheckingData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiAlbumCheckEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumCheckEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumCheckEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiAlbumCheckEnvelope aiAlbumCheckEnvelope) {
            Meta meta = aiAlbumCheckEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AiAlbumCheckingData aiAlbumCheckingData = aiAlbumCheckEnvelope.data;
            if (aiAlbumCheckingData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, aiAlbumCheckingData, AiAlbumCheckingData.PROTOBUF_ADAPTER);
            }
            aiAlbumCheckEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiAlbumCheckEnvelope parse(nb5 nb5Var) throws IOException {
            AiAlbumCheckEnvelope aiAlbumCheckEnvelope = new AiAlbumCheckEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (aiAlbumCheckEnvelope.meta == null) {
                        aiAlbumCheckEnvelope.meta = Meta.new_();
                    }
                    if (aiAlbumCheckEnvelope.data != null) {
                        break;
                    }
                    aiAlbumCheckEnvelope.data = AiAlbumCheckingData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    aiAlbumCheckEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (aiAlbumCheckEnvelope.meta == null) {
                            aiAlbumCheckEnvelope.meta = Meta.new_();
                        }
                        if (aiAlbumCheckEnvelope.data != null) {
                            break;
                        }
                        aiAlbumCheckEnvelope.data = AiAlbumCheckingData.new_();
                        return aiAlbumCheckEnvelope;
                    }
                    aiAlbumCheckEnvelope.data = (AiAlbumCheckingData) nb5Var.m158743l(AiAlbumCheckingData.PROTOBUF_ADAPTER);
                }
            }
            return aiAlbumCheckEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiAlbumCheckEnvelope aiAlbumCheckEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiAlbumCheckEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AiAlbumCheckingData aiAlbumCheckingData = aiAlbumCheckEnvelope.data;
            if (aiAlbumCheckingData != null) {
                codedOutputByteBufferNano.m17254K(2, aiAlbumCheckingData, AiAlbumCheckingData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AiAlbumCheckEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumCheckEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumCheckEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiAlbumCheckEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiAlbumCheckEnvelope newInstance() {
            return new AiAlbumCheckEnvelope();
        }

        public boolean parseField(AiAlbumCheckEnvelope aiAlbumCheckEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                aiAlbumCheckEnvelope.data = AiAlbumCheckingData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            aiAlbumCheckEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiAlbumCheckEnvelope aiAlbumCheckEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumCheckEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiAlbumCheckEnvelope aiAlbumCheckEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (aiAlbumCheckEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(aiAlbumCheckEnvelope.meta, jsonGenerator, true);
            }
            if (aiAlbumCheckEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                AiAlbumCheckingData.JSON_ADAPTER.serialize(aiAlbumCheckEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumCheckEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumCheckEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumCheckEnvelope new_() {
        AiAlbumCheckEnvelope aiAlbumCheckEnvelope = new AiAlbumCheckEnvelope();
        aiAlbumCheckEnvelope.nullCheck();
        return aiAlbumCheckEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiAlbumCheckEnvelope mo223809clone() {
        AiAlbumCheckEnvelope aiAlbumCheckEnvelope = new AiAlbumCheckEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            aiAlbumCheckEnvelope.meta = meta.mo223809clone();
        }
        AiAlbumCheckingData aiAlbumCheckingData = this.data;
        if (aiAlbumCheckingData != null) {
            aiAlbumCheckEnvelope.data = aiAlbumCheckingData.mo223809clone();
        }
        return aiAlbumCheckEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiAlbumCheckEnvelope)) {
            return false;
        }
        AiAlbumCheckEnvelope aiAlbumCheckEnvelope = (AiAlbumCheckEnvelope) obj;
        return ValueObject.util_equals(this.meta, aiAlbumCheckEnvelope.meta) && ValueObject.util_equals(this.data, aiAlbumCheckEnvelope.data);
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
        AiAlbumCheckingData aiAlbumCheckingData = this.data;
        int iHashCode2 = iHashCode + (aiAlbumCheckingData != null ? aiAlbumCheckingData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = AiAlbumCheckingData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
