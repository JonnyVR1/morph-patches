package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.SogouGifPicture;
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
public class SogouGifData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sogougifdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<SogouGifPicture> media;
    public static ProtobufAdapter<SogouGifData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SogouGifData>() { // from class: com.p1.mobile.putong.core.data.SogouGifData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SogouGifData sogouGifData) {
            List<SogouGifPicture> list = sogouGifData.media;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, SogouGifPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) sogouGifData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SogouGifData m15676parse(nb5 nb5Var) throws IOException {
            SogouGifData sogouGifData = new SogouGifData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (sogouGifData.media != null) {
                        break;
                    }
                    sogouGifData.media = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (sogouGifData.media != null) {
                        break;
                    }
                    sogouGifData.media = new ArrayList();
                    return sogouGifData;
                }
                sogouGifData.media = (List) nb5Var.l(SogouGifPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return sogouGifData;
        }

        public void serialize(SogouGifData sogouGifData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<SogouGifPicture> list = sogouGifData.media;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, SogouGifPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SogouGifData> JSON_ADAPTER = new ObjectJsonAdapter<SogouGifData>() { // from class: com.p1.mobile.putong.core.data.SogouGifData.2
        public Class getDataClass() {
            return SogouGifData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SogouGifData m15677newInstance() {
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

        public void serializeFields(SogouGifData sogouGifData, JsonGenerator jsonGenerator) throws IOException {
            if (sogouGifData.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(sogouGifData.media, jsonGenerator, SogouGifPicture.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SogouGifData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SogouGifData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SogouGifData new_() {
        SogouGifData sogouGifData = new SogouGifData();
        sogouGifData.nullCheck();
        return sogouGifData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SogouGifData m15675clone() {
        SogouGifData sogouGifData = new SogouGifData();
        List<SogouGifPicture> list = this.media;
        if (list != null) {
            sogouGifData.media = ValueObject.util_map(list, new w9j() { // from class: l.mlf0
                public final Object call(Object obj) {
                    return ((SogouGifPicture) obj).m15683clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<SogouGifPicture> list = this.media;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.media == null) {
            this.media = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
