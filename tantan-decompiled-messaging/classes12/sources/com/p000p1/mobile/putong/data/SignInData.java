package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
public class SignInData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "signindata";

    @Nullable
    @ProtobufIndex(index = 10)
    public String captchaToken;

    @Nullable
    @ProtobufIndex(index = 11)
    public String captchaValue;

    @Nullable
    @ProtobufIndex(index = 4)
    public Integer code;

    @NonNull
    @ProtobufIndex(index = 5)
    public Device device;

    @NonNull
    @ProtobufIndex(index = 1)
    public SignInGrantType grantType;
    public boolean isSmartlock = false;

    @Nullable
    @ProtobufIndex(index = 9)
    public String operator;

    @NonNull
    @ProtobufIndex(index = 3)
    public String password;

    @NonNull
    @ProtobufIndex(index = 8)
    public String scope;

    @NonNull
    @ProtobufIndex(index = 15)
    public String thirdEmail;

    @Nullable
    @ProtobufIndex(index = 13)
    public String thirdPartyAccessCode;

    @Nullable
    @ProtobufIndex(index = 6)
    public String thirdPartyId;

    @Nullable
    @ProtobufIndex(index = 7)
    public String thirdPartyToken;

    @NonNull
    @ProtobufIndex(index = 14)
    public String ttcToken;

    @NonNull
    @ProtobufIndex(index = 2)
    public String username;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public String verifyType;
    public static ProtobufAdapter<SignInData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SignInData>() { // from class: com.p1.mobile.putong.data.SignInData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SignInData signInData) {
            SignInGrantType signInGrantType = signInData.grantType;
            int iH = signInGrantType != null ? CodedOutputByteBufferNano.h(1, signInGrantType.ordinal()) : 0;
            String str = signInData.username;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = signInData.password;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            Integer num = signInData.code;
            if (num != null) {
                iH += CodedOutputByteBufferNano.h(4, num.intValue());
            }
            Device device = signInData.device;
            if (device != null) {
                iH += CodedOutputByteBufferNano.l(5, device, Device.PROTOBUF_ADAPTER);
            }
            String str3 = signInData.thirdPartyId;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(6, str3);
            }
            String str4 = signInData.thirdPartyToken;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(7, str4);
            }
            String str5 = signInData.scope;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(8, str5);
            }
            String str6 = signInData.operator;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(9, str6);
            }
            String str7 = signInData.captchaToken;
            if (str7 != null) {
                iH += CodedOutputByteBufferNano.o(10, str7);
            }
            String str8 = signInData.captchaValue;
            if (str8 != null) {
                iH += CodedOutputByteBufferNano.o(11, str8);
            }
            SignInGrantType signInGrantType2 = signInData.grantType;
            if (signInGrantType2 != null) {
                iH += CodedOutputByteBufferNano.l(12, signInGrantType2, SignInGrantType.PROTOBUF_ADAPTER);
            }
            String str9 = signInData.thirdPartyAccessCode;
            if (str9 != null) {
                iH += CodedOutputByteBufferNano.o(13, str9);
            }
            String str10 = signInData.ttcToken;
            if (str10 != null) {
                iH += CodedOutputByteBufferNano.o(14, str10);
            }
            String str11 = signInData.thirdEmail;
            if (str11 != null) {
                iH += CodedOutputByteBufferNano.o(15, str11);
            }
            String str12 = signInData.verifyType;
            if (str12 != null) {
                iH += CodedOutputByteBufferNano.o(16, str12);
            }
            ((MessageNano) signInData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SignInData m18980parse(nb5 nb5Var) throws IOException {
            SignInData signInData = new SignInData();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (signInData.grantType == null && numValueOf != null) {
                            signInData.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (signInData.grantType == null) {
                            signInData.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.defaultEnum();
                        }
                        if (signInData.username == null) {
                            signInData.username = "";
                        }
                        if (signInData.password == null) {
                            signInData.password = "";
                        }
                        if (signInData.device == null) {
                            signInData.device = Device.new_();
                        }
                        if (signInData.scope == null) {
                            signInData.scope = "";
                        }
                        if (signInData.ttcToken == null) {
                            signInData.ttcToken = "";
                        }
                        if (signInData.thirdEmail == null) {
                            signInData.thirdEmail = "";
                        }
                        if (signInData.verifyType == null) {
                            signInData.verifyType = "";
                        }
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 18:
                        signInData.username = nb5Var.s();
                        continue;
                    case 26:
                        signInData.password = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        signInData.code = Integer.valueOf(nb5Var.j());
                        continue;
                    case 42:
                        signInData.device = (Device) nb5Var.l(Device.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        signInData.thirdPartyId = nb5Var.s();
                        continue;
                    case 58:
                        signInData.thirdPartyToken = nb5Var.s();
                        continue;
                    case 66:
                        signInData.scope = nb5Var.s();
                        continue;
                    case 74:
                        signInData.operator = nb5Var.s();
                        continue;
                    case 82:
                        signInData.captchaToken = nb5Var.s();
                        continue;
                    case 90:
                        signInData.captchaValue = nb5Var.s();
                        continue;
                    case 98:
                        signInData.grantType = (SignInGrantType) nb5Var.l(SignInGrantType.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        signInData.thirdPartyAccessCode = nb5Var.s();
                        continue;
                    case 114:
                        signInData.ttcToken = nb5Var.s();
                        continue;
                    case 122:
                        signInData.thirdEmail = nb5Var.s();
                        continue;
                    case 130:
                        signInData.verifyType = nb5Var.s();
                        continue;
                    default:
                        if (signInData.grantType == null && numValueOf != null) {
                            signInData.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (signInData.grantType == null) {
                            signInData.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.defaultEnum();
                        }
                        if (signInData.username == null) {
                            signInData.username = "";
                        }
                        if (signInData.password == null) {
                            signInData.password = "";
                        }
                        if (signInData.device == null) {
                            signInData.device = Device.new_();
                        }
                        if (signInData.scope == null) {
                            signInData.scope = "";
                        }
                        if (signInData.ttcToken == null) {
                            signInData.ttcToken = "";
                        }
                        if (signInData.thirdEmail == null) {
                            signInData.thirdEmail = "";
                        }
                        if (signInData.verifyType == null) {
                            signInData.verifyType = "";
                            return signInData;
                        }
                        break;
                }
            }
            return signInData;
        }

        public void serialize(SignInData signInData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SignInGrantType signInGrantType = signInData.grantType;
            if (signInGrantType != null) {
                codedOutputByteBufferNano.G(1, signInGrantType.ordinal());
            }
            String str = signInData.username;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = signInData.password;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            Integer num = signInData.code;
            if (num != null) {
                codedOutputByteBufferNano.G(4, num.intValue());
            }
            Device device = signInData.device;
            if (device != null) {
                codedOutputByteBufferNano.K(5, device, Device.PROTOBUF_ADAPTER);
            }
            String str3 = signInData.thirdPartyId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            String str4 = signInData.thirdPartyToken;
            if (str4 != null) {
                codedOutputByteBufferNano.R(7, str4);
            }
            String str5 = signInData.scope;
            if (str5 != null) {
                codedOutputByteBufferNano.R(8, str5);
            }
            String str6 = signInData.operator;
            if (str6 != null) {
                codedOutputByteBufferNano.R(9, str6);
            }
            String str7 = signInData.captchaToken;
            if (str7 != null) {
                codedOutputByteBufferNano.R(10, str7);
            }
            String str8 = signInData.captchaValue;
            if (str8 != null) {
                codedOutputByteBufferNano.R(11, str8);
            }
            SignInGrantType signInGrantType2 = signInData.grantType;
            if (signInGrantType2 != null) {
                codedOutputByteBufferNano.K(12, signInGrantType2, SignInGrantType.PROTOBUF_ADAPTER);
            }
            String str9 = signInData.thirdPartyAccessCode;
            if (str9 != null) {
                codedOutputByteBufferNano.R(13, str9);
            }
            String str10 = signInData.ttcToken;
            if (str10 != null) {
                codedOutputByteBufferNano.R(14, str10);
            }
            String str11 = signInData.thirdEmail;
            if (str11 != null) {
                codedOutputByteBufferNano.R(15, str11);
            }
            String str12 = signInData.verifyType;
            if (str12 != null) {
                codedOutputByteBufferNano.R(16, str12);
            }
        }
    };
    public static JsonAdapter<SignInData> JSON_ADAPTER = new ObjectJsonAdapter<SignInData>() { // from class: com.p1.mobile.putong.data.SignInData.2
        public Class getDataClass() {
            return SignInData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SignInData mo17830newInstance() {
            return new SignInData();
        }

        public boolean parseField(SignInData signInData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "verify_type":
                    signInData.verifyType = jsonParser.getValueAsString();
                    return true;
                case "device":
                    signInData.device = (Device) Device.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ttcToken":
                    signInData.ttcToken = jsonParser.getValueAsString();
                    return true;
                case "thirdEmail":
                    signInData.thirdEmail = jsonParser.getValueAsString();
                    return true;
                case "captchaToken":
                    signInData.captchaToken = jsonParser.getValueAsString();
                    return true;
                case "captchaValue":
                    signInData.captchaValue = jsonParser.getValueAsString();
                    return true;
                case "operator":
                    signInData.operator = jsonParser.getValueAsString();
                    return true;
                case "username":
                    signInData.username = jsonParser.getValueAsString();
                    return true;
                case "code":
                    signInData.code = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Integer.valueOf(jsonParser.getValueAsInt());
                    return true;
                case "scope":
                    signInData.scope = jsonParser.getValueAsString();
                    return true;
                case "grant_type":
                    signInData.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "thirdparty_accessCode":
                    signInData.thirdPartyAccessCode = jsonParser.getValueAsString();
                    return true;
                case "thirdparty_id":
                    signInData.thirdPartyId = jsonParser.getValueAsString();
                    return true;
                case "password":
                    signInData.password = jsonParser.getValueAsString();
                    return true;
                case "thirdparty_access_token":
                    signInData.thirdPartyToken = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SignInData signInData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "verify_type":
                case "device":
                case "ttcToken":
                case "thirdEmail":
                case "captchaToken":
                case "captchaValue":
                case "operator":
                case "username":
                case "code":
                case "scope":
                case "grant_type":
                case "thirdparty_accessCode":
                case "thirdparty_id":
                case "password":
                case "thirdparty_access_token":
                    return true;
                default:
                    return super.parseFieldCheck(signInData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SignInData signInData, JsonGenerator jsonGenerator) throws IOException {
            if (signInData.grantType != null) {
                jsonGenerator.writeFieldName("grant_type");
                SignInGrantType.JSON_ADAPTER.serialize(signInData.grantType, jsonGenerator, true);
            }
            String str = signInData.username;
            if (str != null) {
                jsonGenerator.writeStringField("username", str);
            }
            String str2 = signInData.password;
            if (str2 != null) {
                jsonGenerator.writeStringField(SignInGrantType.password, str2);
            }
            Integer num = signInData.code;
            if (num != null) {
                jsonGenerator.writeNumberField("code", num.intValue());
            }
            if (signInData.device != null) {
                jsonGenerator.writeFieldName(Device.TYPE);
                Device.JSON_ADAPTER.serialize(signInData.device, jsonGenerator, true);
            }
            String str3 = signInData.thirdPartyId;
            if (str3 != null) {
                jsonGenerator.writeStringField("thirdparty_id", str3);
            }
            String str4 = signInData.thirdPartyToken;
            if (str4 != null) {
                jsonGenerator.writeStringField("thirdparty_access_token", str4);
            }
            String str5 = signInData.scope;
            if (str5 != null) {
                jsonGenerator.writeStringField("scope", str5);
            }
            String str6 = signInData.operator;
            if (str6 != null) {
                jsonGenerator.writeStringField("operator", str6);
            }
            String str7 = signInData.captchaToken;
            if (str7 != null) {
                jsonGenerator.writeStringField("captchaToken", str7);
            }
            String str8 = signInData.captchaValue;
            if (str8 != null) {
                jsonGenerator.writeStringField("captchaValue", str8);
            }
            String str9 = signInData.thirdPartyAccessCode;
            if (str9 != null) {
                jsonGenerator.writeStringField("thirdparty_accessCode", str9);
            }
            String str10 = signInData.ttcToken;
            if (str10 != null) {
                jsonGenerator.writeStringField("ttcToken", str10);
            }
            String str11 = signInData.thirdEmail;
            if (str11 != null) {
                jsonGenerator.writeStringField("thirdEmail", str11);
            }
            String str12 = signInData.verifyType;
            if (str12 != null) {
                jsonGenerator.writeStringField("verify_type", str12);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SignInData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SignInData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SignInData new_() {
        SignInData signInData = new SignInData();
        signInData.nullCheck();
        return signInData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SignInData m18979clone() {
        SignInData signInData = new SignInData();
        signInData.grantType = this.grantType;
        signInData.username = this.username;
        signInData.password = this.password;
        signInData.code = this.code;
        Device device = this.device;
        if (device != null) {
            signInData.device = device.m17967clone();
        }
        signInData.thirdPartyId = this.thirdPartyId;
        signInData.thirdPartyToken = this.thirdPartyToken;
        signInData.scope = this.scope;
        signInData.operator = this.operator;
        signInData.captchaToken = this.captchaToken;
        signInData.captchaValue = this.captchaValue;
        signInData.thirdPartyAccessCode = this.thirdPartyAccessCode;
        signInData.ttcToken = this.ttcToken;
        signInData.thirdEmail = this.thirdEmail;
        signInData.verifyType = this.verifyType;
        return signInData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInData)) {
            return false;
        }
        SignInData signInData = (SignInData) obj;
        return ValueObject.util_equals(this.grantType, signInData.grantType) && ValueObject.util_equals(this.username, signInData.username) && ValueObject.util_equals(this.password, signInData.password) && ValueObject.util_equals(this.code, signInData.code) && ValueObject.util_equals(this.device, signInData.device) && ValueObject.util_equals(this.thirdPartyId, signInData.thirdPartyId) && ValueObject.util_equals(this.thirdPartyToken, signInData.thirdPartyToken) && ValueObject.util_equals(this.scope, signInData.scope) && ValueObject.util_equals(this.operator, signInData.operator) && ValueObject.util_equals(this.captchaToken, signInData.captchaToken) && ValueObject.util_equals(this.captchaValue, signInData.captchaValue) && ValueObject.util_equals(this.thirdPartyAccessCode, signInData.thirdPartyAccessCode) && ValueObject.util_equals(this.ttcToken, signInData.ttcToken) && ValueObject.util_equals(this.thirdEmail, signInData.thirdEmail) && ValueObject.util_equals(this.verifyType, signInData.verifyType);
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
        SignInGrantType signInGrantType = this.grantType;
        int iHashCode = (i2 + (signInGrantType != null ? signInGrantType.hashCode() : 0)) * 41;
        String str = this.username;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.password;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        Integer num = this.code;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 41;
        Device device = this.device;
        int iHashCode5 = (iHashCode4 + (device != null ? device.hashCode() : 0)) * 41;
        String str3 = this.thirdPartyId;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.thirdPartyToken;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.scope;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.operator;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.captchaToken;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.captchaValue;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.thirdPartyAccessCode;
        int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.ttcToken;
        int iHashCode13 = (iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.thirdEmail;
        int iHashCode14 = (iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.verifyType;
        int iHashCode15 = iHashCode14 + (str12 != null ? str12.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode15;
        return iHashCode15;
    }

    public void nullCheck() {
        if (this.grantType == null) {
            this.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.defaultEnum();
        }
        if (this.username == null) {
            this.username = "";
        }
        if (this.password == null) {
            this.password = "";
        }
        if (this.device == null) {
            this.device = Device.new_();
        }
        if (this.scope == null) {
            this.scope = "";
        }
        if (this.ttcToken == null) {
            this.ttcToken = "";
        }
        if (this.thirdEmail == null) {
            this.thirdEmail = "";
        }
        if (this.verifyType == null) {
            this.verifyType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
