package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class AiAlbumProcessingData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumprocessingdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String rate;
    public static ProtobufAdapter<AiAlbumProcessingData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumProcessingData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumProcessingData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiAlbumProcessingData aiAlbumProcessingData) {
            String str = aiAlbumProcessingData.rate;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) aiAlbumProcessingData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiAlbumProcessingData m11569parse(nb5 nb5Var) throws IOException {
            AiAlbumProcessingData aiAlbumProcessingData = new AiAlbumProcessingData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiAlbumProcessingData.rate != null) {
                        break;
                    }
                    aiAlbumProcessingData.rate = "";
                    break;
                }
                if (iU != 10) {
                    if (aiAlbumProcessingData.rate != null) {
                        break;
                    }
                    aiAlbumProcessingData.rate = "";
                    return aiAlbumProcessingData;
                }
                aiAlbumProcessingData.rate = nb5Var.s();
            }
            return aiAlbumProcessingData;
        }

        public void serialize(AiAlbumProcessingData aiAlbumProcessingData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiAlbumProcessingData.rate;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<AiAlbumProcessingData> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumProcessingData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumProcessingData.2
        public Class getDataClass() {
            return AiAlbumProcessingData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiAlbumProcessingData m11570newInstance() {
            return new AiAlbumProcessingData();
        }

        public boolean parseField(AiAlbumProcessingData aiAlbumProcessingData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("rate")) {
                return false;
            }
            aiAlbumProcessingData.rate = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AiAlbumProcessingData aiAlbumProcessingData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("rate")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumProcessingData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AiAlbumProcessingData aiAlbumProcessingData, JsonGenerator jsonGenerator) throws IOException {
            String str = aiAlbumProcessingData.rate;
            if (str != null) {
                jsonGenerator.writeStringField("rate", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumProcessingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumProcessingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumProcessingData new_() {
        AiAlbumProcessingData aiAlbumProcessingData = new AiAlbumProcessingData();
        aiAlbumProcessingData.nullCheck();
        return aiAlbumProcessingData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiAlbumProcessingData m11568clone() {
        AiAlbumProcessingData aiAlbumProcessingData = new AiAlbumProcessingData();
        aiAlbumProcessingData.rate = this.rate;
        return aiAlbumProcessingData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AiAlbumProcessingData) {
            return ValueObject.util_equals(this.rate, ((AiAlbumProcessingData) obj).rate);
        }
        return false;
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
        String str = this.rate;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.rate == null) {
            this.rate = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
