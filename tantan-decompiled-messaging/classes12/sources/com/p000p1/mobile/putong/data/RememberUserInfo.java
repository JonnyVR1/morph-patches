package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RememberUserInfo rememberUserInfo) {
            int iH = CodedOutputByteBufferNano.h(1, rememberUserInfo.countryCode);
            String str = rememberUserInfo.phoneNumber;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = rememberUserInfo.imgUrl;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(4, rememberUserInfo.pwdLength);
            AuthData authData = rememberUserInfo.auth;
            if (authData != null) {
                iH2 += CodedOutputByteBufferNano.l(5, authData, AuthData.PROTOBUF_ADAPTER);
            }
            String str3 = rememberUserInfo.name;
            if (str3 != null) {
                iH2 += CodedOutputByteBufferNano.o(6, str3);
            }
            ((MessageNano) rememberUserInfo).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RememberUserInfo m18902parse(nb5 nb5Var) throws IOException {
            RememberUserInfo rememberUserInfo = new RememberUserInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    rememberUserInfo.countryCode = nb5Var.j();
                } else if (iU == 18) {
                    rememberUserInfo.phoneNumber = nb5Var.s();
                } else if (iU == 26) {
                    rememberUserInfo.imgUrl = nb5Var.s();
                } else if (iU == 32) {
                    rememberUserInfo.pwdLength = nb5Var.j();
                } else if (iU == 42) {
                    rememberUserInfo.auth = (AuthData) nb5Var.l(AuthData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
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
                    rememberUserInfo.name = nb5Var.s();
                }
            }
            return rememberUserInfo;
        }

        public void serialize(RememberUserInfo rememberUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, rememberUserInfo.countryCode);
            String str = rememberUserInfo.phoneNumber;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = rememberUserInfo.imgUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.G(4, rememberUserInfo.pwdLength);
            AuthData authData = rememberUserInfo.auth;
            if (authData != null) {
                codedOutputByteBufferNano.K(5, authData, AuthData.PROTOBUF_ADAPTER);
            }
            String str3 = rememberUserInfo.name;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
        }
    };
    public static JsonAdapter<RememberUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<RememberUserInfo>() { // from class: com.p1.mobile.putong.data.RememberUserInfo.2
        public Class getDataClass() {
            return RememberUserInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RememberUserInfo mo17830newInstance() {
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
                    rememberUserInfo.auth = (AuthData) AuthData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RememberUserInfo rememberUserInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("countryCode", rememberUserInfo.countryCode);
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
                jsonGenerator.writeStringField("name", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RememberUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RememberUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RememberUserInfo new_() {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.nullCheck();
        return rememberUserInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RememberUserInfo m18901clone() {
        RememberUserInfo rememberUserInfo = new RememberUserInfo();
        rememberUserInfo.countryCode = this.countryCode;
        rememberUserInfo.phoneNumber = this.phoneNumber;
        rememberUserInfo.imgUrl = this.imgUrl;
        rememberUserInfo.pwdLength = this.pwdLength;
        AuthData authData = this.auth;
        if (authData != null) {
            rememberUserInfo.auth = authData.m17726clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
