package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.AppealMaterial;
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
public class AppealMaterial extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appealmaterial";

    @NonNull
    @ProtobufIndex(index = 3)
    public String contact;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> pictures;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<AppealMaterial> PROTOBUF_ADAPTER = new MessageNanoAdapter<AppealMaterial>() { // from class: com.p1.mobile.putong.data.AppealMaterial.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AppealMaterial appealMaterial) {
            String str = appealMaterial.text;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = appealMaterial.pictures;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = appealMaterial.contact;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            appealMaterial.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AppealMaterial parse(nc5 nc5Var) throws IOException {
            AppealMaterial appealMaterial = new AppealMaterial();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (appealMaterial.text == null) {
                        appealMaterial.text = "";
                    }
                    if (appealMaterial.pictures == null) {
                        appealMaterial.pictures = new ArrayList();
                    }
                    if (appealMaterial.contact != null) {
                        break;
                    }
                    appealMaterial.contact = "";
                    break;
                }
                if (iM162497u == 10) {
                    appealMaterial.text = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    appealMaterial.pictures = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (appealMaterial.text == null) {
                            appealMaterial.text = "";
                        }
                        if (appealMaterial.pictures == null) {
                            appealMaterial.pictures = new ArrayList();
                        }
                        if (appealMaterial.contact != null) {
                            break;
                        }
                        appealMaterial.contact = "";
                        return appealMaterial;
                    }
                    appealMaterial.contact = nc5Var.m162495s();
                }
            }
            return appealMaterial;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AppealMaterial appealMaterial, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealMaterial.text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = appealMaterial.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = appealMaterial.contact;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<AppealMaterial> JSON_ADAPTER = new ObjectJsonAdapter<AppealMaterial>() { // from class: com.p1.mobile.putong.data.AppealMaterial.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AppealMaterial.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AppealMaterial newInstance() {
            return new AppealMaterial();
        }

        public boolean parseField(AppealMaterial appealMaterial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pictures":
                    appealMaterial.pictures = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "text":
                    appealMaterial.text = jsonParser.getValueAsString();
                    return true;
                case "contact":
                    appealMaterial.contact = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AppealMaterial appealMaterial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "pictures":
                case "text":
                case "contact":
                    return true;
                default:
                    return super.parseFieldCheck(appealMaterial, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AppealMaterial appealMaterial, JsonGenerator jsonGenerator) throws IOException {
            String str = appealMaterial.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            if (appealMaterial.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(appealMaterial.pictures, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = appealMaterial.contact;
            if (str2 != null) {
                jsonGenerator.writeStringField(Contact.TYPE, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealMaterial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppealMaterial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60854a(String str) {
        return str;
    }

    public static AppealMaterial new_() {
        AppealMaterial appealMaterial = new AppealMaterial();
        appealMaterial.nullCheck();
        return appealMaterial;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AppealMaterial mo225055clone() {
        AppealMaterial appealMaterial = new AppealMaterial();
        appealMaterial.text = this.text;
        List<String> list = this.pictures;
        if (list != null) {
            appealMaterial.pictures = ValueObject.util_map(list, new qcj() { // from class: l.ky0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return AppealMaterial.m60854a((String) obj);
                }
            });
        }
        appealMaterial.contact = this.contact;
        return appealMaterial;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppealMaterial)) {
            return false;
        }
        AppealMaterial appealMaterial = (AppealMaterial) obj;
        return ValueObject.util_equals(this.text, appealMaterial.text) && ValueObject.util_equals(this.pictures, appealMaterial.pictures) && ValueObject.util_equals(this.contact, appealMaterial.contact);
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.pictures;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.contact;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.contact == null) {
            this.contact = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
