package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Industries;
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
public class Industries extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "industries";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> departments;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<Industries> PROTOBUF_ADAPTER = new MessageNanoAdapter<Industries>() { // from class: com.p1.mobile.putong.core.data.Industries.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Industries industries) {
            String str = industries.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = industries.departments;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) industries).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Industries m13457parse(nb5 nb5Var) throws IOException {
            Industries industries = new Industries();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (industries.name == null) {
                        industries.name = "";
                    }
                    if (industries.departments != null) {
                        break;
                    }
                    industries.departments = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    industries.name = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (industries.name == null) {
                            industries.name = "";
                        }
                        if (industries.departments != null) {
                            break;
                        }
                        industries.departments = new ArrayList();
                        return industries;
                    }
                    industries.departments = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return industries;
        }

        public void serialize(Industries industries, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = industries.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = industries.departments;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Industries> JSON_ADAPTER = new ObjectJsonAdapter<Industries>() { // from class: com.p1.mobile.putong.core.data.Industries.2
        public Class getDataClass() {
            return Industries.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Industries m13458newInstance() {
            return new Industries();
        }

        public boolean parseField(Industries industries, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("name")) {
                industries.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("departments")) {
                return false;
            }
            industries.departments = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Industries industries, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("name") || str.equals("departments")) {
                return true;
            }
            return super.parseFieldCheck(industries, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Industries industries, JsonGenerator jsonGenerator) throws IOException {
            String str = industries.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            if (industries.departments != null) {
                jsonGenerator.writeFieldName("departments");
                JsonAdapter.serializeArray(industries.departments, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Industries) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Industries) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m410a(String str) {
        return str;
    }

    public static Industries new_() {
        Industries industries = new Industries();
        industries.nullCheck();
        return industries;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Industries m13456clone() {
        Industries industries = new Industries();
        industries.name = this.name;
        List<String> list = this.departments;
        if (list != null) {
            industries.departments = ValueObject.util_map(list, new w9j() { // from class: l.zrm
                public final Object call(Object obj) {
                    return Industries.m410a((String) obj);
                }
            });
        }
        return industries;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Industries)) {
            return false;
        }
        Industries industries = (Industries) obj;
        return ValueObject.util_equals(this.name, industries.name) && ValueObject.util_equals(this.departments, industries.departments);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.departments;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.departments == null) {
            this.departments = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
