package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class FacebookInfoIdWithName extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facebookinfoidwithname";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38755id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<FacebookInfoIdWithName> PROTOBUF_ADAPTER = new MessageNanoAdapter<FacebookInfoIdWithName>() { // from class: com.p1.mobile.putong.data.FacebookInfoIdWithName.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FacebookInfoIdWithName facebookInfoIdWithName) {
            String str = facebookInfoIdWithName.f38755id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = facebookInfoIdWithName.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            facebookInfoIdWithName.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FacebookInfoIdWithName parse(nb5 nb5Var) throws IOException {
            FacebookInfoIdWithName facebookInfoIdWithName = new FacebookInfoIdWithName();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (facebookInfoIdWithName.f38755id == null) {
                        facebookInfoIdWithName.f38755id = "";
                    }
                    if (facebookInfoIdWithName.name != null) {
                        break;
                    }
                    facebookInfoIdWithName.name = "";
                    break;
                }
                if (iM158752u == 10) {
                    facebookInfoIdWithName.f38755id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (facebookInfoIdWithName.f38755id == null) {
                            facebookInfoIdWithName.f38755id = "";
                        }
                        if (facebookInfoIdWithName.name != null) {
                            break;
                        }
                        facebookInfoIdWithName.name = "";
                        return facebookInfoIdWithName;
                    }
                    facebookInfoIdWithName.name = nb5Var.m158750s();
                }
            }
            return facebookInfoIdWithName;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FacebookInfoIdWithName facebookInfoIdWithName, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = facebookInfoIdWithName.f38755id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = facebookInfoIdWithName.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<FacebookInfoIdWithName> JSON_ADAPTER = new ObjectJsonAdapter<FacebookInfoIdWithName>() { // from class: com.p1.mobile.putong.data.FacebookInfoIdWithName.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FacebookInfoIdWithName.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FacebookInfoIdWithName newInstance() {
            return new FacebookInfoIdWithName();
        }

        public boolean parseField(FacebookInfoIdWithName facebookInfoIdWithName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                facebookInfoIdWithName.f38755id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            facebookInfoIdWithName.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FacebookInfoIdWithName facebookInfoIdWithName, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(facebookInfoIdWithName, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FacebookInfoIdWithName facebookInfoIdWithName, JsonGenerator jsonGenerator) throws IOException {
            String str = facebookInfoIdWithName.f38755id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = facebookInfoIdWithName.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FacebookInfoIdWithName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FacebookInfoIdWithName) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FacebookInfoIdWithName new_() {
        FacebookInfoIdWithName facebookInfoIdWithName = new FacebookInfoIdWithName();
        facebookInfoIdWithName.nullCheck();
        return facebookInfoIdWithName;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FacebookInfoIdWithName mo223809clone() {
        FacebookInfoIdWithName facebookInfoIdWithName = new FacebookInfoIdWithName();
        facebookInfoIdWithName.f38755id = this.f38755id;
        facebookInfoIdWithName.name = this.name;
        return facebookInfoIdWithName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FacebookInfoIdWithName)) {
            return false;
        }
        FacebookInfoIdWithName facebookInfoIdWithName = (FacebookInfoIdWithName) obj;
        return ValueObject.util_equals(this.f38755id, facebookInfoIdWithName.f38755id) && ValueObject.util_equals(this.name, facebookInfoIdWithName.name);
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
        String str = this.f38755id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38755id == null) {
            this.f38755id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
