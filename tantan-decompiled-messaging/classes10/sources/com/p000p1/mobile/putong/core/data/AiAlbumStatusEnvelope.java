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
public class AiAlbumStatusEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumstatusenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public AiAlbumStatusData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiAlbumStatusEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumStatusEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumStatusEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiAlbumStatusEnvelope aiAlbumStatusEnvelope) {
            Meta meta = aiAlbumStatusEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AiAlbumStatusData aiAlbumStatusData = aiAlbumStatusEnvelope.data;
            if (aiAlbumStatusData != null) {
                iL += CodedOutputByteBufferNano.l(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) aiAlbumStatusEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiAlbumStatusEnvelope m11581parse(nb5 nb5Var) throws IOException {
            AiAlbumStatusEnvelope aiAlbumStatusEnvelope = new AiAlbumStatusEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiAlbumStatusEnvelope.meta == null) {
                        aiAlbumStatusEnvelope.meta = Meta.new_();
                    }
                    if (aiAlbumStatusEnvelope.data != null) {
                        break;
                    }
                    aiAlbumStatusEnvelope.data = AiAlbumStatusData.new_();
                    break;
                }
                if (iU == 10) {
                    aiAlbumStatusEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (aiAlbumStatusEnvelope.meta == null) {
                            aiAlbumStatusEnvelope.meta = Meta.new_();
                        }
                        if (aiAlbumStatusEnvelope.data != null) {
                            break;
                        }
                        aiAlbumStatusEnvelope.data = AiAlbumStatusData.new_();
                        return aiAlbumStatusEnvelope;
                    }
                    aiAlbumStatusEnvelope.data = (AiAlbumStatusData) nb5Var.l(AiAlbumStatusData.PROTOBUF_ADAPTER);
                }
            }
            return aiAlbumStatusEnvelope;
        }

        public void serialize(AiAlbumStatusEnvelope aiAlbumStatusEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiAlbumStatusEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AiAlbumStatusData aiAlbumStatusData = aiAlbumStatusEnvelope.data;
            if (aiAlbumStatusData != null) {
                codedOutputByteBufferNano.K(2, aiAlbumStatusData, AiAlbumStatusData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AiAlbumStatusEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumStatusEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumStatusEnvelope.2
        public Class getDataClass() {
            return AiAlbumStatusEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiAlbumStatusEnvelope m11582newInstance() {
            return new AiAlbumStatusEnvelope();
        }

        public boolean parseField(AiAlbumStatusEnvelope aiAlbumStatusEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                aiAlbumStatusEnvelope.data = (AiAlbumStatusData) AiAlbumStatusData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            aiAlbumStatusEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiAlbumStatusEnvelope aiAlbumStatusEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumStatusEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumStatusEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumStatusEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumStatusEnvelope new_() {
        AiAlbumStatusEnvelope aiAlbumStatusEnvelope = new AiAlbumStatusEnvelope();
        aiAlbumStatusEnvelope.nullCheck();
        return aiAlbumStatusEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiAlbumStatusEnvelope m11580clone() {
        AiAlbumStatusEnvelope aiAlbumStatusEnvelope = new AiAlbumStatusEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            aiAlbumStatusEnvelope.meta = meta.clone();
        }
        AiAlbumStatusData aiAlbumStatusData = this.data;
        if (aiAlbumStatusData != null) {
            aiAlbumStatusEnvelope.data = aiAlbumStatusData.m11576clone();
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
