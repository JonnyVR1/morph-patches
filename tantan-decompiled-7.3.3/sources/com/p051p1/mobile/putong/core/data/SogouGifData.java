package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.SogouGifPicture;
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
public class SogouGifData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sogougifdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<SogouGifPicture> media;
    public static ProtobufAdapter<SogouGifData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SogouGifData>() { // from class: com.p1.mobile.putong.core.data.SogouGifData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SogouGifData sogouGifData) {
            List<SogouGifPicture> list = sogouGifData.media;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, SogouGifPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            sogouGifData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SogouGifData parse(nc5 nc5Var) throws IOException {
            SogouGifData sogouGifData = new SogouGifData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (sogouGifData.media != null) {
                        break;
                    }
                    sogouGifData.media = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (sogouGifData.media != null) {
                        break;
                    }
                    sogouGifData.media = new ArrayList();
                    return sogouGifData;
                }
                sogouGifData.media = (List) nc5Var.m162488l(SogouGifPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return sogouGifData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SogouGifData sogouGifData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<SogouGifPicture> list = sogouGifData.media;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, SogouGifPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SogouGifData> JSON_ADAPTER = new ObjectJsonAdapter<SogouGifData>() { // from class: com.p1.mobile.putong.core.data.SogouGifData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SogouGifData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SogouGifData newInstance() {
            return new SogouGifData();
        }

        public boolean parseField(SogouGifData sogouGifData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("media")) {
                return false;
            }
            sogouGifData.media = JsonAdapter.parseArray(jsonParser, SogouGifPicture.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SogouGifData sogouGifData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("media")) {
                return true;
            }
            return super.parseFieldCheck(sogouGifData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SogouGifData sogouGifData, JsonGenerator jsonGenerator) throws IOException {
            if (sogouGifData.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(sogouGifData.media, jsonGenerator, SogouGifPicture.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SogouGifData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SogouGifData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SogouGifData new_() {
        SogouGifData sogouGifData = new SogouGifData();
        sogouGifData.nullCheck();
        return sogouGifData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SogouGifData mo225055clone() {
        SogouGifData sogouGifData = new SogouGifData();
        List<SogouGifPicture> list = this.media;
        if (list != null) {
            sogouGifData.media = ValueObject.util_map(list, new qcj() { // from class: l.vtf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((SogouGifPicture) obj).mo225055clone();
                }
            });
        }
        return sogouGifData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SogouGifData) {
            return ValueObject.util_equals(this.media, ((SogouGifData) obj).media);
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
        List<SogouGifPicture> list = this.media;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.media == null) {
            this.media = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
