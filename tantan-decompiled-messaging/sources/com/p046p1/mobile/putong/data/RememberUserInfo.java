package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
public class RememberUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rememberuserinfo";

    @NonNull
    @ProtobufIndex(index = 5)
    public AuthData auth;

    @ProtobufIndex(index = 1)
    public int countryCode;

    @NonNull
    @ProtobufIndex(index = 3)
    public String imgUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String phoneNumber;

    @ProtobufIndex(index = 4)
    public int pwdLength;
    public static ProtobufAdapter<RememberUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RememberUserInfo>() { // from class: com.p1.mobile.putong.data.RememberUserInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RememberUserInfo rememberUserInfo) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, rememberUserInfo.countryCode);
            String str = rememberUserInfo.phoneNumber;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = rememberUserInfo.imgUrl;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(4, rememberUserInfo.pwdLength);
            AuthData authData = rememberUserInfo.auth;
            if (authData != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(5, authData, AuthData.PROTOBUF_ADAPTER);
            }
            String str3 = rememberUserInfo.name;
            if (str3 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            rememberUserInfo.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RememberUserInfo parse(nb5 nb5Var) throws IOException {
            RememberUserInfo rememberUserInfo = new RememberUserInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (rememberUserInfo.phoneNumber == null) {
                        rememberUserInfo.phoneNumber = "";
                    }
                    if (rememberUserInfo.imgUrl == null) {
                        rememberUserInfo.imgUrl = "";
                    }
                    if (rememberUserInfo.auth == null) {
                        rememberUserInfo.auth = AuthData.new_();
                    }
                    if (rememberUserInfo.name != null) {
                        break;
                    }
                    rememberUserInfo.name = "";
                    break;
                }
                if (iM158752u == 8) {
                    rememberUserInfo.countryCode = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    rememberUserInfo.phoneNumber = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    rememberUserInfo.imgUrl = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    rememberUserInfo.pwdLength = nb5Var.m158741j();
                } else if (iM158752u == 42) {
                    rememberUserInfo.auth = (AuthData) nb5Var.m158743l(AuthData.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 50) {
                        if (rememberUserInfo.phoneNumber == null) {
                            rememberUserInfo.phoneNumber = "";
                        }
                        if (rememberUserInfo.imgUrl == null) {
                            rememberUserInfo.imgUrl = "";
                        }
                        if (rememberUserInfo.auth == null) {
                            rememberUserInfo.auth = AuthData.new_();
                        }
                        if (rememberUserInfo.name != null) {
                            break;
                        }
                        rememberUserInfo.name = "";
                        return rememberUserInfo;
                    }
                    rememberUserInfo.name = nb5Var.m158750s();
                }
            }
            return rememberUserInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RememberUserInfo rememberUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, rememberUserInfo.countryCode);
            String str = rememberUserInfo.phoneNumber;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = rememberUserInfo.imgUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17250G(4, rememberUserInfo.pwdLength);
            AuthData authData = rememberUserInfo.auth;
            if (authData != null) {
                codedOutputByteBufferNano.m17254K(5, authData, AuthData.PROTOBUF_ADAPTER);
            }
            String str3 = rememberUserInfo.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
        }
    };
    public static JsonAdapter<RememberUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<RememberUserInfo>() { // from class: com.p1.mobile.putong.data.RememberUserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RememberUserInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RememberUserInfo newInstance() {
            return new RememberUserInfo();
        }

        public boolean parseField(RememberUserInfo rememberUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "countryCode":
                    rememberUserInfo.countryCode = jsonParser.getValueAsInt();
                    return true;
                case "phoneNumber":
                    rememberUserInfo.phoneNumber = jsonParser.getValueAsString();
                    return true;
                case "imgUrl":
                    rememberUserInfo.imgUrl = jsonParser.getValueAsString();
                    return true;
                case "auth":
                    rememberUserInfo.auth = AuthData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    rememberUserInfo.name = jsonParser.getValueAsString();
                    return true;
                case "pwdLength":
                    rememberUserInfo.pwdLength = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RememberUserInfo rememberUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "countryCode":
                case "phoneNumber":
                case "imgUrl":
                case "auth":
                case "name":
                case "pwdLength":
                    return true;
                default:
                    return super.parseFieldCheck(rememberUserInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RememberUserInfo rememberUserInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, rememberUserInfo.countryCode);
            String str = rememberUserInfo.phoneNumber;
            if (str != null) {
                jsonGenerator.writeStringField("phoneNumber", str);
            }
            String str2 = rememberUserInfo.imgUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("imgUrl", str2);
            }
            jsonGenerator.writeNumberField("pwdLength", rememberUserInfo.pwdLength);
            if (rememberUserInfo.auth != null) {
                jsonGenerator.writeFieldName("auth");
                AuthData.JSON_ADAPTER.serialize(rememberUserInfo.auth, jsonGenerator, true);
            }
            String str3 = rememberUserInfo.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RememberUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RememberUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RememberUserInfo new_() {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.nullCheck();
        return rememberUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RememberUserInfo mo223809clone() {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.countryCode = this.countryCode;
        rememberUserInfo.phoneNumber = this.phoneNumber;
        rememberUserInfo.imgUrl = this.imgUrl;
        rememberUserInfo.pwdLength = this.pwdLength;
        AuthData authData = this.auth;
        if (authData != null) {
            rememberUserInfo.auth = authData.mo223809clone();
        }
        rememberUserInfo.name = this.name;
        return rememberUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RememberUserInfo)) {
            return false;
        }
        RememberUserInfo rememberUserInfo = (RememberUserInfo) obj;
        return this.countryCode == rememberUserInfo.countryCode && ValueObject.util_equals(this.phoneNumber, rememberUserInfo.phoneNumber) && ValueObject.util_equals(this.imgUrl, rememberUserInfo.imgUrl) && this.pwdLength == rememberUserInfo.pwdLength && ValueObject.util_equals(this.auth, rememberUserInfo.auth) && ValueObject.util_equals(this.name, rememberUserInfo.name);
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
        int i2 = ((i * 41) + this.countryCode) * 41;
        String str = this.phoneNumber;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.imgUrl;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.pwdLength) * 41;
        AuthData authData = this.auth;
        int iHashCode3 = (iHashCode2 + (authData != null ? authData.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.phoneNumber == null) {
            this.phoneNumber = "";
        }
        if (this.imgUrl == null) {
            this.imgUrl = "";
        }
        if (this.auth == null) {
            this.auth = AuthData.new_();
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
