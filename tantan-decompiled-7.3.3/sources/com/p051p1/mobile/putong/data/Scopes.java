package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class Scopes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "scopes";

    @NonNull
    @ProtobufIndex(index = 3)
    public String user_email;

    @NonNull
    @ProtobufIndex(index = 2)
    public String user_mobile;

    @NonNull
    @ProtobufIndex(index = 1)
    public String user_profile;
    public static ProtobufAdapter<Scopes> PROTOBUF_ADAPTER = new MessageNanoAdapter<Scopes>() { // from class: com.p1.mobile.putong.data.Scopes.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Scopes scopes) {
            String str = scopes.user_profile;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = scopes.user_mobile;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = scopes.user_email;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            scopes.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Scopes parse(nc5 nc5Var) throws IOException {
            Scopes scopes = new Scopes();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (scopes.user_profile == null) {
                        scopes.user_profile = "";
                    }
                    if (scopes.user_mobile == null) {
                        scopes.user_mobile = "";
                    }
                    if (scopes.user_email != null) {
                        break;
                    }
                    scopes.user_email = "";
                    break;
                }
                if (iM162497u == 10) {
                    scopes.user_profile = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    scopes.user_mobile = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (scopes.user_profile == null) {
                            scopes.user_profile = "";
                        }
                        if (scopes.user_mobile == null) {
                            scopes.user_mobile = "";
                        }
                        if (scopes.user_email != null) {
                            break;
                        }
                        scopes.user_email = "";
                        return scopes;
                    }
                    scopes.user_email = nc5Var.m162495s();
                }
            }
            return scopes;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Scopes scopes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = scopes.user_profile;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = scopes.user_mobile;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = scopes.user_email;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<Scopes> JSON_ADAPTER = new ObjectJsonAdapter<Scopes>() { // from class: com.p1.mobile.putong.data.Scopes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Scopes.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Scopes newInstance() {
            return new Scopes();
        }

        public boolean parseField(Scopes scopes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "user_mobile":
                    scopes.user_mobile = jsonParser.getValueAsString();
                    return true;
                case "user_profile":
                    scopes.user_profile = jsonParser.getValueAsString();
                    return true;
                case "user_email":
                    scopes.user_email = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Scopes scopes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "user_mobile":
                case "user_profile":
                case "user_email":
                    return true;
                default:
                    return super.parseFieldCheck(scopes, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Scopes scopes, JsonGenerator jsonGenerator) throws IOException {
            String str = scopes.user_profile;
            if (str != null) {
                jsonGenerator.writeStringField("user_profile", str);
            }
            String str2 = scopes.user_mobile;
            if (str2 != null) {
                jsonGenerator.writeStringField("user_mobile", str2);
            }
            String str3 = scopes.user_email;
            if (str3 != null) {
                jsonGenerator.writeStringField("user_email", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Scopes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Scopes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Scopes new_() {
        Scopes scopes = new Scopes();
        scopes.nullCheck();
        return scopes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Scopes mo225055clone() {
        Scopes scopes = new Scopes();
        scopes.user_profile = this.user_profile;
        scopes.user_mobile = this.user_mobile;
        scopes.user_email = this.user_email;
        return scopes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Scopes)) {
            return false;
        }
        Scopes scopes = (Scopes) obj;
        return ValueObject.util_equals(this.user_profile, scopes.user_profile) && ValueObject.util_equals(this.user_mobile, scopes.user_mobile) && ValueObject.util_equals(this.user_email, scopes.user_email);
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
        String str = this.user_profile;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.user_mobile;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.user_email;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.user_profile == null) {
            this.user_profile = "";
        }
        if (this.user_mobile == null) {
            this.user_mobile = "";
        }
        if (this.user_email == null) {
            this.user_email = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
