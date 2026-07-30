package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.AiAlbumFinishedData;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class AiAlbumFinishedData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumfinisheddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> images;
    public static ProtobufAdapter<AiAlbumFinishedData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumFinishedData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumFinishedData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiAlbumFinishedData aiAlbumFinishedData) {
            List<String> list = aiAlbumFinishedData.images;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            aiAlbumFinishedData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiAlbumFinishedData parse(nc5 nc5Var) throws IOException {
            AiAlbumFinishedData aiAlbumFinishedData = new AiAlbumFinishedData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiAlbumFinishedData.images != null) {
                        break;
                    }
                    aiAlbumFinishedData.images = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (aiAlbumFinishedData.images != null) {
                        break;
                    }
                    aiAlbumFinishedData.images = new ArrayList();
                    return aiAlbumFinishedData;
                }
                aiAlbumFinishedData.images = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return aiAlbumFinishedData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiAlbumFinishedData aiAlbumFinishedData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = aiAlbumFinishedData.images;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AiAlbumFinishedData> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumFinishedData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumFinishedData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiAlbumFinishedData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiAlbumFinishedData newInstance() {
            return new AiAlbumFinishedData();
        }

        public boolean parseField(AiAlbumFinishedData aiAlbumFinishedData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("images")) {
                return false;
            }
            aiAlbumFinishedData.images = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiAlbumFinishedData aiAlbumFinishedData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("images")) {
                return true;
            }
            return super.parseFieldCheck(aiAlbumFinishedData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiAlbumFinishedData aiAlbumFinishedData, JsonGenerator jsonGenerator) throws IOException {
            if (aiAlbumFinishedData.images != null) {
                jsonGenerator.writeFieldName("images");
                JsonAdapter.serializeArray(aiAlbumFinishedData.images, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumFinishedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumFinishedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36216a(String str) {
        return str;
    }

    public static AiAlbumFinishedData new_() {
        AiAlbumFinishedData aiAlbumFinishedData = new AiAlbumFinishedData();
        aiAlbumFinishedData.nullCheck();
        return aiAlbumFinishedData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiAlbumFinishedData mo225055clone() {
        AiAlbumFinishedData aiAlbumFinishedData = new AiAlbumFinishedData();
        List<String> list = this.images;
        if (list != null) {
            aiAlbumFinishedData.images = ValueObject.util_map(list, new qcj() { // from class: l.bf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return AiAlbumFinishedData.m36216a((String) obj);
                }
            });
        }
        return aiAlbumFinishedData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AiAlbumFinishedData) {
            return ValueObject.util_equals(this.images, ((AiAlbumFinishedData) obj).images);
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
        List<String> list = this.images;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.images == null) {
            this.images = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
