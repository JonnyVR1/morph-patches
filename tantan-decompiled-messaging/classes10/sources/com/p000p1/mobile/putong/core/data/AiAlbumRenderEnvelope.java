package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AiAlbumRenderEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumrenderenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public AiAlbumStatusData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiAlbumRenderEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumRenderEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumRenderEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiAlbumRenderEnvelope aiAlbumRenderEnvelope) {
            Meta meta = aiAlbumRenderEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AiAlbumStatusData aiAlbumStatusData = aiAlbumRenderEnvelope.data;
            if (aiAlbumStatusData != null) {
                iL += CodedOutputByteBufferNano.l(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) aiAlbumRenderEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiAlbumRenderEnvelope m11573parse(nb5 nb5Var) throws IOException {
            AiAlbumRenderEnvelope aiAlbumRenderEnvelope = new AiAlbumRenderEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiAlbumRenderEnvelope.meta == null) {
                        aiAlbumRenderEnvelope.meta = Meta.new_();
                    }
                    if (aiAlbumRenderEnvelope.data != null) {
                        break;
                    }
                    aiAlbumRenderEnvelope.data = AiAlbumStatusData.new_();
                    break;
                }
                if (iU == 10) {
                    aiAlbumRenderEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (aiAlbumRenderEnvelope.meta == null) {
                            aiAlbumRenderEnvelope.meta = Meta.new_();
                        }
                        if (aiAlbumRenderEnvelope.data != null) {
                            break;
                        }
                        aiAlbumRenderEnvelope.data = AiAlbumStatusData.new_();
                        return aiAlbumRenderEnvelope;
                    }
                    aiAlbumRenderEnvelope.data = (AiAlbumStatusData) nb5Var.l(AiAlbumStatusData.PROTOBUF_ADAPTER);
                }
            }
            return aiAlbumRenderEnvelope;
        }

        public void serialize(AiAlbumRenderEnvelope aiAlbumRenderEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiAlbumRenderEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AiAlbumStatusData aiAlbumStatusData = aiAlbumRenderEnvelope.data;
            if (aiAlbumStatusData != null) {
                codedOutputByteBufferNano.K(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AiAlbumRenderEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumRenderEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumRenderEnvelope.2
        public Class getDataClass() {
            return AiAlbumRenderEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiAlbumRenderEnvelope m11574newInstance() {
            return new AiAlbumRenderEnvelope();
        }

        public boolean parseField(AiAlbumRenderEnvelope aiAlbumRenderEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                aiAlbumRenderEnvelope.data = (AiAlbumStatusData) AiAlbumStatusData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            aiAlbumRenderEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiAlbumRenderEnvelope aiAlbumRenderEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumRenderEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumRenderEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumRenderEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumRenderEnvelope new_() {
        AiAlbumRenderEnvelope aiAlbumRenderEnvelope = new AiAlbumRenderEnvelope();
        aiAlbumRenderEnvelope.nullCheck();
        return aiAlbumRenderEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiAlbumRenderEnvelope m11572clone() {
        AiAlbumRenderEnvelope aiAlbumRenderEnvelope = new AiAlbumRenderEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            aiAlbumRenderEnvelope.meta = meta.clone();
        }
        AiAlbumStatusData aiAlbumStatusData = this.data;
        if (aiAlbumStatusData != null) {
            aiAlbumRenderEnvelope.data = aiAlbumStatusData.m11576clone();
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
        AiAlbumStatusData aiAlbumStatusData = this.data;
        int iHashCode2 = iHashCode + (aiAlbumStatusData != null ? aiAlbumStatusData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = AiAlbumStatusData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
