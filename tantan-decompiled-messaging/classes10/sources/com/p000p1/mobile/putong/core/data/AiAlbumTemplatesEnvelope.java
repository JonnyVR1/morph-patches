package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AiAlbumTemplatesEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumtemplatesenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<AiAlbumTemplateData> data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiAlbumTemplatesEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumTemplatesEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope) {
            Meta meta = aiAlbumTemplatesEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            List<AiAlbumTemplateData> list = aiAlbumTemplatesEnvelope.data;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(2, list, AiAlbumTemplateData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) aiAlbumTemplatesEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiAlbumTemplatesEnvelope m11589parse(nb5 nb5Var) throws IOException {
            AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope = new AiAlbumTemplatesEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiAlbumTemplatesEnvelope.meta == null) {
                        aiAlbumTemplatesEnvelope.meta = Meta.new_();
                    }
                    if (aiAlbumTemplatesEnvelope.data != null) {
                        break;
                    }
                    aiAlbumTemplatesEnvelope.data = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    aiAlbumTemplatesEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (aiAlbumTemplatesEnvelope.meta == null) {
                            aiAlbumTemplatesEnvelope.meta = Meta.new_();
                        }
                        if (aiAlbumTemplatesEnvelope.data != null) {
                            break;
                        }
                        aiAlbumTemplatesEnvelope.data = new ArrayList();
                        return aiAlbumTemplatesEnvelope;
                    }
                    aiAlbumTemplatesEnvelope.data = (List) nb5Var.l(AiAlbumTemplateData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return aiAlbumTemplatesEnvelope;
        }

        public void serialize(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiAlbumTemplatesEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            List<AiAlbumTemplateData> list = aiAlbumTemplatesEnvelope.data;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, AiAlbumTemplateData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AiAlbumTemplatesEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumTemplatesEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope.2
        public Class getDataClass() {
            return AiAlbumTemplatesEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiAlbumTemplatesEnvelope m11590newInstance() {
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
            aiAlbumTemplatesEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumTemplatesEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumTemplatesEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumTemplatesEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumTemplatesEnvelope new_() {
        AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope = new AiAlbumTemplatesEnvelope();
        aiAlbumTemplatesEnvelope.nullCheck();
        return aiAlbumTemplatesEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiAlbumTemplatesEnvelope m11588clone() {
        AiAlbumTemplatesEnvelope aiAlbumTemplatesEnvelope = new AiAlbumTemplatesEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            aiAlbumTemplatesEnvelope.meta = meta.clone();
        }
        List<AiAlbumTemplateData> list = this.data;
        if (list != null) {
            aiAlbumTemplatesEnvelope.data = ValueObject.util_map(list, new w9j() { // from class: l.ug0
                public final Object call(Object obj) {
                    return ((AiAlbumTemplateData) obj).m11584clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        List<AiAlbumTemplateData> list = this.data;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
