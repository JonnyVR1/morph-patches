package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.AppealMaterial;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AppealMaterial appealMaterial) {
            String str = appealMaterial.text;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = appealMaterial.pictures;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = appealMaterial.contact;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) appealMaterial).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AppealMaterial m17710parse(nb5 nb5Var) throws IOException {
            AppealMaterial appealMaterial = new AppealMaterial();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    appealMaterial.text = nb5Var.s();
                } else if (iU == 18) {
                    appealMaterial.pictures = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
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
                    appealMaterial.contact = nb5Var.s();
                }
            }
            return appealMaterial;
        }

        public void serialize(AppealMaterial appealMaterial, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealMaterial.text;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = appealMaterial.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = appealMaterial.contact;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<AppealMaterial> JSON_ADAPTER = new ObjectJsonAdapter<AppealMaterial>() { // from class: com.p1.mobile.putong.data.AppealMaterial.2
        public Class getDataClass() {
            return AppealMaterial.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AppealMaterial mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealMaterial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppealMaterial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m572a(String str) {
        return str;
    }

    public static AppealMaterial new_() {
        AppealMaterial appealMaterial = new AppealMaterial();
        appealMaterial.nullCheck();
        return appealMaterial;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AppealMaterial m17709clone() {
        AppealMaterial appealMaterial = new AppealMaterial();
        appealMaterial.text = this.text;
        List<String> list = this.pictures;
        if (list != null) {
            appealMaterial.pictures = ValueObject.util_map(list, new w9j() { // from class: l.dy0
                public final Object call(Object obj) {
                    return AppealMaterial.m572a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
