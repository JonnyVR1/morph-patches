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
public class AiAlbumCheckEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumcheckenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public AiAlbumCheckingData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiAlbumCheckEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumCheckEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumCheckEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiAlbumCheckEnvelope aiAlbumCheckEnvelope) {
            Meta meta = aiAlbumCheckEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AiAlbumCheckingData aiAlbumCheckingData = aiAlbumCheckEnvelope.data;
            if (aiAlbumCheckingData != null) {
                iL += CodedOutputByteBufferNano.l(2, aiAlbumCheckingData, AiAlbumCheckingData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) aiAlbumCheckEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiAlbumCheckEnvelope m11557parse(nb5 nb5Var) throws IOException {
            AiAlbumCheckEnvelope aiAlbumCheckEnvelope = new AiAlbumCheckEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiAlbumCheckEnvelope.meta == null) {
                        aiAlbumCheckEnvelope.meta = Meta.new_();
                    }
                    if (aiAlbumCheckEnvelope.data != null) {
                        break;
                    }
                    aiAlbumCheckEnvelope.data = AiAlbumCheckingData.new_();
                    break;
                }
                if (iU == 10) {
                    aiAlbumCheckEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (aiAlbumCheckEnvelope.meta == null) {
                            aiAlbumCheckEnvelope.meta = Meta.new_();
                        }
                        if (aiAlbumCheckEnvelope.data != null) {
                            break;
                        }
                        aiAlbumCheckEnvelope.data = AiAlbumCheckingData.new_();
                        return aiAlbumCheckEnvelope;
                    }
                    aiAlbumCheckEnvelope.data = (AiAlbumCheckingData) nb5Var.l(AiAlbumCheckingData.PROTOBUF_ADAPTER);
                }
            }
            return aiAlbumCheckEnvelope;
        }

        public void serialize(AiAlbumCheckEnvelope aiAlbumCheckEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiAlbumCheckEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AiAlbumCheckingData aiAlbumCheckingData = aiAlbumCheckEnvelope.data;
            if (aiAlbumCheckingData != null) {
                codedOutputByteBufferNano.K(2, aiAlbumCheckingData, AiAlbumCheckingData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AiAlbumCheckEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumCheckEnvelope>() { // from class: com.p1.mobile.putong.core.data.AiAlbumCheckEnvelope.2
        public Class getDataClass() {
            return AiAlbumCheckEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiAlbumCheckEnvelope m11558newInstance() {
            return new AiAlbumCheckEnvelope();
        }

        public boolean parseField(AiAlbumCheckEnvelope aiAlbumCheckEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                aiAlbumCheckEnvelope.data = (AiAlbumCheckingData) AiAlbumCheckingData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            aiAlbumCheckEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiAlbumCheckEnvelope aiAlbumCheckEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumCheckEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumCheckEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumCheckEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumCheckEnvelope new_() {
        AiAlbumCheckEnvelope aiAlbumCheckEnvelope = new AiAlbumCheckEnvelope();
        aiAlbumCheckEnvelope.nullCheck();
        return aiAlbumCheckEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiAlbumCheckEnvelope m11556clone() {
        AiAlbumCheckEnvelope aiAlbumCheckEnvelope = new AiAlbumCheckEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            aiAlbumCheckEnvelope.meta = meta.clone();
        }
        AiAlbumCheckingData aiAlbumCheckingData = this.data;
        if (aiAlbumCheckingData != null) {
            aiAlbumCheckEnvelope.data = aiAlbumCheckingData.m11560clone();
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
        AiAlbumCheckingData aiAlbumCheckingData = this.data;
        int iHashCode2 = iHashCode + (aiAlbumCheckingData != null ? aiAlbumCheckingData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = AiAlbumCheckingData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
