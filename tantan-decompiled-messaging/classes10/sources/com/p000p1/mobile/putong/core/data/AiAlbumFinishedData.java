package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.AiAlbumFinishedData;
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
public class AiAlbumFinishedData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumfinisheddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> images;
    public static ProtobufAdapter<AiAlbumFinishedData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumFinishedData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumFinishedData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiAlbumFinishedData aiAlbumFinishedData) {
            List<String> list = aiAlbumFinishedData.images;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) aiAlbumFinishedData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiAlbumFinishedData m11565parse(nb5 nb5Var) throws IOException {
            AiAlbumFinishedData aiAlbumFinishedData = new AiAlbumFinishedData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiAlbumFinishedData.images != null) {
                        break;
                    }
                    aiAlbumFinishedData.images = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (aiAlbumFinishedData.images != null) {
                        break;
                    }
                    aiAlbumFinishedData.images = new ArrayList();
                    return aiAlbumFinishedData;
                }
                aiAlbumFinishedData.images = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return aiAlbumFinishedData;
        }

        public void serialize(AiAlbumFinishedData aiAlbumFinishedData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = aiAlbumFinishedData.images;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AiAlbumFinishedData> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumFinishedData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumFinishedData.2
        public Class getDataClass() {
            return AiAlbumFinishedData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiAlbumFinishedData m11566newInstance() {
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

        public void serializeFields(AiAlbumFinishedData aiAlbumFinishedData, JsonGenerator jsonGenerator) throws IOException {
            if (aiAlbumFinishedData.images != null) {
                jsonGenerator.writeFieldName("images");
                JsonAdapter.serializeArray(aiAlbumFinishedData.images, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumFinishedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumFinishedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m15a(String str) {
        return str;
    }

    public static AiAlbumFinishedData new_() {
        AiAlbumFinishedData aiAlbumFinishedData = new AiAlbumFinishedData();
        aiAlbumFinishedData.nullCheck();
        return aiAlbumFinishedData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiAlbumFinishedData m11564clone() {
        AiAlbumFinishedData aiAlbumFinishedData = new AiAlbumFinishedData();
        List<String> list = this.images;
        if (list != null) {
            aiAlbumFinishedData.images = ValueObject.util_map(list, new w9j() { // from class: l.ff0
                public final Object call(Object obj) {
                    return AiAlbumFinishedData.m15a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.images;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.images == null) {
            this.images = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
