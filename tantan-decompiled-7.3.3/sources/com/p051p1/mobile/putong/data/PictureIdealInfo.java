package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.PictureIdealInfo;
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

/* JADX INFO: loaded from: classes12.dex */
public class PictureIdealInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pictureidealinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> idealTypes;

    @ProtobufIndex(index = 1)
    public int index;
    public static ProtobufAdapter<PictureIdealInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureIdealInfo>() { // from class: com.p1.mobile.putong.data.PictureIdealInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PictureIdealInfo pictureIdealInfo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, pictureIdealInfo.index);
            List<String> list = pictureIdealInfo.idealTypes;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            pictureIdealInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PictureIdealInfo parse(nc5 nc5Var) throws IOException {
            PictureIdealInfo pictureIdealInfo = new PictureIdealInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (pictureIdealInfo.idealTypes != null) {
                        break;
                    }
                    pictureIdealInfo.idealTypes = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    pictureIdealInfo.index = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (pictureIdealInfo.idealTypes != null) {
                            break;
                        }
                        pictureIdealInfo.idealTypes = new ArrayList();
                        return pictureIdealInfo;
                    }
                    pictureIdealInfo.idealTypes = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return pictureIdealInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PictureIdealInfo pictureIdealInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, pictureIdealInfo.index);
            List<String> list = pictureIdealInfo.idealTypes;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PictureIdealInfo> JSON_ADAPTER = new ObjectJsonAdapter<PictureIdealInfo>() { // from class: com.p1.mobile.putong.data.PictureIdealInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PictureIdealInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PictureIdealInfo newInstance() {
            return new PictureIdealInfo();
        }

        public boolean parseField(PictureIdealInfo pictureIdealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("idealTypes")) {
                pictureIdealInfo.idealTypes = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.INDEX)) {
                return false;
            }
            pictureIdealInfo.index = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PictureIdealInfo pictureIdealInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("idealTypes") || str.equals(FirebaseAnalytics.Param.INDEX)) {
                return true;
            }
            return super.parseFieldCheck(pictureIdealInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PictureIdealInfo pictureIdealInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, pictureIdealInfo.index);
            if (pictureIdealInfo.idealTypes != null) {
                jsonGenerator.writeFieldName("idealTypes");
                JsonAdapter.serializeArray(pictureIdealInfo.idealTypes, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureIdealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureIdealInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61183a(String str) {
        return str;
    }

    public static PictureIdealInfo new_() {
        PictureIdealInfo pictureIdealInfo = new PictureIdealInfo();
        pictureIdealInfo.nullCheck();
        return pictureIdealInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PictureIdealInfo mo225055clone() {
        PictureIdealInfo pictureIdealInfo = new PictureIdealInfo();
        pictureIdealInfo.index = this.index;
        List<String> list = this.idealTypes;
        if (list != null) {
            pictureIdealInfo.idealTypes = ValueObject.util_map(list, new qcj() { // from class: l.qp70
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PictureIdealInfo.m61183a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.index) * 41;
        List<String> list = this.idealTypes;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.idealTypes == null) {
            this.idealTypes = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
