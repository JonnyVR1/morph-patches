package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class AiAlbumProcessingData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumprocessingdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String rate;
    public static ProtobufAdapter<AiAlbumProcessingData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumProcessingData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumProcessingData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiAlbumProcessingData aiAlbumProcessingData) {
            String str = aiAlbumProcessingData.rate;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            aiAlbumProcessingData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiAlbumProcessingData parse(nc5 nc5Var) throws IOException {
            AiAlbumProcessingData aiAlbumProcessingData = new AiAlbumProcessingData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiAlbumProcessingData.rate != null) {
                        break;
                    }
                    aiAlbumProcessingData.rate = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (aiAlbumProcessingData.rate != null) {
                        break;
                    }
                    aiAlbumProcessingData.rate = "";
                    return aiAlbumProcessingData;
                }
                aiAlbumProcessingData.rate = nc5Var.m162495s();
            }
            return aiAlbumProcessingData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiAlbumProcessingData aiAlbumProcessingData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiAlbumProcessingData.rate;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<AiAlbumProcessingData> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumProcessingData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumProcessingData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiAlbumProcessingData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiAlbumProcessingData newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiAlbumProcessingData aiAlbumProcessingData, JsonGenerator jsonGenerator) throws IOException {
            String str = aiAlbumProcessingData.rate;
            if (str != null) {
                jsonGenerator.writeStringField("rate", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumProcessingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumProcessingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumProcessingData new_() {
        AiAlbumProcessingData aiAlbumProcessingData = new AiAlbumProcessingData();
        aiAlbumProcessingData.nullCheck();
        return aiAlbumProcessingData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiAlbumProcessingData mo225055clone() {
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
        String str = this.rate;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.rate == null) {
            this.rate = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
