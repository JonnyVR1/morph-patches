package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.PictureIdealInfo;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PictureIdealInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pictureidealinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> idealTypes;

    @ProtobufIndex(index = 1)
    public int index;
    public static ProtobufAdapter<PictureIdealInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureIdealInfo>() { // from class: com.p1.mobile.putong.data.PictureIdealInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PictureIdealInfo pictureIdealInfo) {
            int iH = CodedOutputByteBufferNano.h(1, pictureIdealInfo.index);
            List<String> list = pictureIdealInfo.idealTypes;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) pictureIdealInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PictureIdealInfo m18808parse(nb5 nb5Var) throws IOException {
            PictureIdealInfo pictureIdealInfo = new PictureIdealInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (pictureIdealInfo.idealTypes != null) {
                        break;
                    }
                    pictureIdealInfo.idealTypes = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    pictureIdealInfo.index = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (pictureIdealInfo.idealTypes != null) {
                            break;
                        }
                        pictureIdealInfo.idealTypes = new ArrayList();
                        return pictureIdealInfo;
                    }
                    pictureIdealInfo.idealTypes = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return pictureIdealInfo;
        }

        public void serialize(PictureIdealInfo pictureIdealInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, pictureIdealInfo.index);
            List<String> list = pictureIdealInfo.idealTypes;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PictureIdealInfo> JSON_ADAPTER = new ObjectJsonAdapter<PictureIdealInfo>() { // from class: com.p1.mobile.putong.data.PictureIdealInfo.2
        public Class getDataClass() {
            return PictureIdealInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PictureIdealInfo mo17830newInstance() {
            return new PictureIdealInfo();
        }

        public boolean parseField(PictureIdealInfo pictureIdealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("idealTypes")) {
                pictureIdealInfo.idealTypes = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("index")) {
                return false;
            }
            pictureIdealInfo.index = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PictureIdealInfo pictureIdealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("idealTypes") || str.equals("index")) {
                return true;
            }
            return super.parseFieldCheck(pictureIdealInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PictureIdealInfo pictureIdealInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("index", pictureIdealInfo.index);
            if (pictureIdealInfo.idealTypes != null) {
                jsonGenerator.writeFieldName("idealTypes");
                JsonAdapter.serializeArray(pictureIdealInfo.idealTypes, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureIdealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureIdealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m917a(String str) {
        return str;
    }

    public static PictureIdealInfo new_() {
        PictureIdealInfo pictureIdealInfo = new PictureIdealInfo();
        pictureIdealInfo.nullCheck();
        return pictureIdealInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PictureIdealInfo m18807clone() {
        PictureIdealInfo pictureIdealInfo = new PictureIdealInfo();
        pictureIdealInfo.index = this.index;
        List<String> list = this.idealTypes;
        if (list != null) {
            pictureIdealInfo.idealTypes = ValueObject.util_map(list, new w9j() { // from class: l.kh70
                public final Object call(Object obj) {
                    return PictureIdealInfo.m917a((String) obj);
                }
            });
        }
        return pictureIdealInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PictureIdealInfo)) {
            return false;
        }
        PictureIdealInfo pictureIdealInfo = (PictureIdealInfo) obj;
        return this.index == pictureIdealInfo.index && ValueObject.util_equals(this.idealTypes, pictureIdealInfo.idealTypes);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.index) * 41;
        List<String> list = this.idealTypes;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.idealTypes == null) {
            this.idealTypes = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
