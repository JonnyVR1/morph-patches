package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.AiAlbumTemplateData;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class AiAlbumTemplatesEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumtemplatesenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<AiAlbumTemplateData> data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiAlbumTemplatesEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumTemplatesEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope) {
            Meta meta = aiAlbumTemplatesEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            List<AiAlbumTemplateData> list = aiAlbumTemplatesEnvelope.data;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list, AiAlbumTemplateData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            aiAlbumTemplatesEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiAlbumTemplatesEnvelope parse(nb5 nb5Var) throws IOException {
            AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope = new AiAlbumTemplatesEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (aiAlbumTemplatesEnvelope.meta == null) {
                        aiAlbumTemplatesEnvelope.meta = Meta.new_();
                    }
                    if (aiAlbumTemplatesEnvelope.data != null) {
                        break;
                    }
                    aiAlbumTemplatesEnvelope.data = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    aiAlbumTemplatesEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (aiAlbumTemplatesEnvelope.meta == null) {
                            aiAlbumTemplatesEnvelope.meta = Meta.new_();
                        }
                        if (aiAlbumTemplatesEnvelope.data != null) {
                            break;
                        }
                        aiAlbumTemplatesEnvelope.data = new ArrayList();
                        return aiAlbumTemplatesEnvelope;
                    }
                    aiAlbumTemplatesEnvelope.data = (List) nb5Var.m158743l(AiAlbumTemplateData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return aiAlbumTemplatesEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiAlbumTemplatesEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            List<AiAlbumTemplateData> list = aiAlbumTemplatesEnvelope.data;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, AiAlbumTemplateData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AiAlbumTemplatesEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumTemplatesEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiAlbumTemplatesEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiAlbumTemplatesEnvelope newInstance() {
            return new AiAlbumTemplatesEnvelope();
        }

        public boolean parseField(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                aiAlbumTemplatesEnvelope.data = JsonAdapter.parseArray(jsonParser, AiAlbumTemplateData.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            aiAlbumTemplatesEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumTemplatesEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (aiAlbumTemplatesEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(aiAlbumTemplatesEnvelope.meta, jsonGenerator, true);
            }
            if (aiAlbumTemplatesEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(aiAlbumTemplatesEnvelope.data, jsonGenerator, AiAlbumTemplateData.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumTemplatesEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumTemplatesEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumTemplatesEnvelope new_() {
        AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope = new AiAlbumTemplatesEnvelope();
        aiAlbumTemplatesEnvelope.nullCheck();
        return aiAlbumTemplatesEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiAlbumTemplatesEnvelope mo223809clone() {
        AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope = new AiAlbumTemplatesEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            aiAlbumTemplatesEnvelope.meta = meta.mo223809clone();
        }
        List<AiAlbumTemplateData> list = this.data;
        if (list != null) {
            aiAlbumTemplatesEnvelope.data = ValueObject.util_map(list, new w9j() { // from class: l.ug0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((AiAlbumTemplateData) obj).mo223809clone();
                }
            });
        }
        return aiAlbumTemplatesEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiAlbumTemplatesEnvelope)) {
            return false;
        }
        AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope = (AiAlbumTemplatesEnvelope) obj;
        return ValueObject.util_equals(this.meta, aiAlbumTemplatesEnvelope.meta) && ValueObject.util_equals(this.data, aiAlbumTemplatesEnvelope.data);
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
        List<AiAlbumTemplateData> list = this.data;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
