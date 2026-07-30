package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Industries;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class Industries extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "industries";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> departments;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<Industries> PROTOBUF_ADAPTER = new MessageNanoAdapter<Industries>() { // from class: com.p1.mobile.putong.core.data.Industries.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Industries industries) {
            String str = industries.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = industries.departments;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            industries.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Industries parse(nb5 nb5Var) throws IOException {
            Industries industries = new Industries();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (industries.name == null) {
                        industries.name = "";
                    }
                    if (industries.departments != null) {
                        break;
                    }
                    industries.departments = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    industries.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (industries.name == null) {
                            industries.name = "";
                        }
                        if (industries.departments != null) {
                            break;
                        }
                        industries.departments = new ArrayList();
                        return industries;
                    }
                    industries.departments = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return industries;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Industries industries, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = industries.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = industries.departments;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Industries> JSON_ADAPTER = new ObjectJsonAdapter<Industries>() { // from class: com.p1.mobile.putong.core.data.Industries.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Industries.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Industries newInstance() {
            return new Industries();
        }

        public boolean parseField(Industries industries, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
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
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME) || str.equals("departments")) {
                return true;
            }
            return super.parseFieldCheck(industries, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Industries industries, JsonGenerator jsonGenerator) throws IOException {
            String str = industries.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (industries.departments != null) {
                jsonGenerator.writeFieldName("departments");
                JsonAdapter.serializeArray(industries.departments, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Industries) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Industries) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35608a(String str) {
        return str;
    }

    public static Industries new_() {
        Industries industries = new Industries();
        industries.nullCheck();
        return industries;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Industries mo223809clone() {
        Industries industries = new Industries();
        industries.name = this.name;
        List<String> list = this.departments;
        if (list != null) {
            industries.departments = ValueObject.util_map(list, new w9j() { // from class: l.zrm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Industries.m35608a((String) obj);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.departments;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.departments == null) {
            this.departments = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
