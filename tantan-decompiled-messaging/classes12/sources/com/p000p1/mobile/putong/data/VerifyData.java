package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class VerifyData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verifydata";

    @NonNull
    @ProtobufIndex(index = 5)
    public VerifyReason action;

    @NonNull
    @ProtobufIndex(index = 14)
    public Captcha captcha;

    @NonNull
    @ProtobufIndex(index = 10)
    public String captchaToken;

    @NonNull
    @ProtobufIndex(index = 11)
    public String captchaValue;

    @NonNull
    @ProtobufIndex(index = 9)
    public String category;

    @NonNull
    @ProtobufIndex(index = 8)
    public String clientId;

    @ProtobufIndex(index = 3)
    public int code;

    @ProtobufIndex(index = 6)
    public int codeLength;

    @ProtobufIndex(index = 1)
    public int countryCode;

    @NonNull
    @ProtobufIndex(index = 7)
    public Device device;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public String email;

    @ProtobufIndex(index = 13)
    public boolean forceLogin;

    @NonNull
    @ProtobufIndex(index = 4)
    @Deprecated
    public String language;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mobileNumber;

    @NonNull
    @ProtobufIndex(index = 15)
    public String ttt_signin_token;

    @NonNull
    @ProtobufIndex(index = 17)
    public String verifyType;
    public static ProtobufAdapter<VerifyData> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerifyData>() { // from class: com.p1.mobile.putong.data.VerifyData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerifyData verifyData) {
            int iH = CodedOutputByteBufferNano.h(1, verifyData.countryCode);
            String str = verifyData.mobileNumber;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(3, verifyData.code);
            String str2 = verifyData.language;
            if (str2 != null) {
                iH2 += CodedOutputByteBufferNano.o(4, str2);
            }
            VerifyReason verifyReason = verifyData.action;
            if (verifyReason != null) {
                iH2 += CodedOutputByteBufferNano.h(5, verifyReason.ordinal());
            }
            int iH3 = iH2 + CodedOutputByteBufferNano.h(6, verifyData.codeLength);
            Device device = verifyData.device;
            if (device != null) {
                iH3 += CodedOutputByteBufferNano.l(7, device, Device.PROTOBUF_ADAPTER);
            }
            String str3 = verifyData.clientId;
            if (str3 != null) {
                iH3 += CodedOutputByteBufferNano.o(8, str3);
            }
            String str4 = verifyData.category;
            if (str4 != null) {
                iH3 += CodedOutputByteBufferNano.o(9, str4);
            }
            String str5 = verifyData.captchaToken;
            if (str5 != null) {
                iH3 += CodedOutputByteBufferNano.o(10, str5);
            }
            String str6 = verifyData.captchaValue;
            if (str6 != null) {
                iH3 += CodedOutputByteBufferNano.o(11, str6);
            }
            VerifyReason verifyReason2 = verifyData.action;
            if (verifyReason2 != null) {
                iH3 += CodedOutputByteBufferNano.l(12, verifyReason2, VerifyReason.PROTOBUF_ADAPTER);
            }
            int iB = iH3 + CodedOutputByteBufferNano.b(13, verifyData.forceLogin);
            Captcha captcha = verifyData.captcha;
            if (captcha != null) {
                iB += CodedOutputByteBufferNano.l(14, captcha, Captcha.PROTOBUF_ADAPTER);
            }
            String str7 = verifyData.ttt_signin_token;
            if (str7 != null) {
                iB += CodedOutputByteBufferNano.o(15, str7);
            }
            String str8 = verifyData.email;
            if (str8 != null) {
                iB += CodedOutputByteBufferNano.o(16, str8);
            }
            String str9 = verifyData.verifyType;
            if (str9 != null) {
                iB += CodedOutputByteBufferNano.o(17, str9);
            }
            ((MessageNano) verifyData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerifyData m19292parse(nb5 nb5Var) throws IOException {
            VerifyData verifyData = new VerifyData();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (verifyData.action == null && numValueOf != null) {
                            verifyData.action = (VerifyReason) VerifyReason.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (verifyData.mobileNumber == null) {
                            verifyData.mobileNumber = "";
                        }
                        if (verifyData.language == null) {
                            verifyData.language = "";
                        }
                        if (verifyData.action == null) {
                            verifyData.action = (VerifyReason) VerifyReason.JSON_ADAPTER.defaultEnum();
                        }
                        if (verifyData.device == null) {
                            verifyData.device = Device.new_();
                        }
                        if (verifyData.clientId == null) {
                            verifyData.clientId = "";
                        }
                        if (verifyData.category == null) {
                            verifyData.category = "";
                        }
                        if (verifyData.captchaToken == null) {
                            verifyData.captchaToken = "";
                        }
                        if (verifyData.captchaValue == null) {
                            verifyData.captchaValue = "";
                        }
                        if (verifyData.ttt_signin_token == null) {
                            verifyData.ttt_signin_token = "";
                        }
                        if (verifyData.captcha == null) {
                            verifyData.captcha = Captcha.new_();
                        }
                        if (verifyData.email == null) {
                            verifyData.email = "";
                        }
                        if (verifyData.verifyType == null) {
                            verifyData.verifyType = "";
                        }
                        break;
                    case 8:
                        verifyData.countryCode = nb5Var.j();
                        continue;
                    case 18:
                        verifyData.mobileNumber = nb5Var.s();
                        continue;
                    case 24:
                        verifyData.code = nb5Var.j();
                        continue;
                    case 34:
                        verifyData.language = nb5Var.s();
                        continue;
                    case 40:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 48:
                        verifyData.codeLength = nb5Var.j();
                        continue;
                    case 58:
                        verifyData.device = (Device) nb5Var.l(Device.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        verifyData.clientId = nb5Var.s();
                        continue;
                    case 74:
                        verifyData.category = nb5Var.s();
                        continue;
                    case 82:
                        verifyData.captchaToken = nb5Var.s();
                        continue;
                    case 90:
                        verifyData.captchaValue = nb5Var.s();
                        continue;
                    case 98:
                        verifyData.action = (VerifyReason) nb5Var.l(VerifyReason.PROTOBUF_ADAPTER);
                        continue;
                    case 104:
                        verifyData.forceLogin = nb5Var.g();
                        continue;
                    case 114:
                        verifyData.captcha = (Captcha) nb5Var.l(Captcha.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        verifyData.ttt_signin_token = nb5Var.s();
                        continue;
                    case 130:
                        verifyData.email = nb5Var.s();
                        continue;
                    case 138:
                        verifyData.verifyType = nb5Var.s();
                        continue;
                    default:
                        if (verifyData.action == null && numValueOf != null) {
                            verifyData.action = (VerifyReason) VerifyReason.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (verifyData.mobileNumber == null) {
                            verifyData.mobileNumber = "";
                        }
                        if (verifyData.language == null) {
                            verifyData.language = "";
                        }
                        if (verifyData.action == null) {
                            verifyData.action = (VerifyReason) VerifyReason.JSON_ADAPTER.defaultEnum();
                        }
                        if (verifyData.device == null) {
                            verifyData.device = Device.new_();
                        }
                        if (verifyData.clientId == null) {
                            verifyData.clientId = "";
                        }
                        if (verifyData.category == null) {
                            verifyData.category = "";
                        }
                        if (verifyData.captchaToken == null) {
                            verifyData.captchaToken = "";
                        }
                        if (verifyData.captchaValue == null) {
                            verifyData.captchaValue = "";
                        }
                        if (verifyData.ttt_signin_token == null) {
                            verifyData.ttt_signin_token = "";
                        }
                        if (verifyData.captcha == null) {
                            verifyData.captcha = Captcha.new_();
                        }
                        if (verifyData.email == null) {
                            verifyData.email = "";
                        }
                        if (verifyData.verifyType == null) {
                            verifyData.verifyType = "";
                            return verifyData;
                        }
                        break;
                }
            }
            return verifyData;
        }

        public void serialize(VerifyData verifyData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, verifyData.countryCode);
            String str = verifyData.mobileNumber;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.G(3, verifyData.code);
            String str2 = verifyData.language;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            VerifyReason verifyReason = verifyData.action;
            if (verifyReason != null) {
                codedOutputByteBufferNano.G(5, verifyReason.ordinal());
            }
            codedOutputByteBufferNano.G(6, verifyData.codeLength);
            Device device = verifyData.device;
            if (device != null) {
                codedOutputByteBufferNano.K(7, device, Device.PROTOBUF_ADAPTER);
            }
            String str3 = verifyData.clientId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(8, str3);
            }
            String str4 = verifyData.category;
            if (str4 != null) {
                codedOutputByteBufferNano.R(9, str4);
            }
            String str5 = verifyData.captchaToken;
            if (str5 != null) {
                codedOutputByteBufferNano.R(10, str5);
            }
            String str6 = verifyData.captchaValue;
            if (str6 != null) {
                codedOutputByteBufferNano.R(11, str6);
            }
            VerifyReason verifyReason2 = verifyData.action;
            if (verifyReason2 != null) {
                codedOutputByteBufferNano.K(12, verifyReason2, VerifyReason.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(13, verifyData.forceLogin);
            Captcha captcha = verifyData.captcha;
            if (captcha != null) {
                codedOutputByteBufferNano.K(14, captcha, Captcha.PROTOBUF_ADAPTER);
            }
            String str7 = verifyData.ttt_signin_token;
            if (str7 != null) {
                codedOutputByteBufferNano.R(15, str7);
            }
            String str8 = verifyData.email;
            if (str8 != null) {
                codedOutputByteBufferNano.R(16, str8);
            }
            String str9 = verifyData.verifyType;
            if (str9 != null) {
                codedOutputByteBufferNano.R(17, str9);
            }
        }
    };
    public static JsonAdapter<VerifyData> JSON_ADAPTER = new ObjectJsonAdapter<VerifyData>() { // from class: com.p1.mobile.putong.data.VerifyData.2
        public Class getDataClass() {
            return VerifyData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VerifyData mo17830newInstance() {
            return new VerifyData();
        }

        public boolean parseField(VerifyData verifyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "verify_type":
                    verifyData.verifyType = jsonParser.getValueAsString();
                    return true;
                case "language":
                    verifyData.language = jsonParser.getValueAsString();
                    return true;
                case "action":
                    verifyData.action = (VerifyReason) VerifyReason.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "device":
                    verifyData.device = (Device) Device.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "code_length":
                    verifyData.codeLength = jsonParser.getValueAsInt();
                    return true;
                case "captchaToken":
                    verifyData.captchaToken = jsonParser.getValueAsString();
                    return true;
                case "captchaValue":
                    verifyData.captchaValue = jsonParser.getValueAsString();
                    return true;
                case "code":
                    verifyData.code = jsonParser.getValueAsInt();
                    return true;
                case "mobile_number":
                    verifyData.mobileNumber = jsonParser.getValueAsString();
                    return true;
                case "category":
                    verifyData.category = jsonParser.getValueAsString();
                    return true;
                case "email":
                    verifyData.email = jsonParser.getValueAsString();
                    return true;
                case "forceLogin":
                    verifyData.forceLogin = jsonParser.getValueAsBoolean();
                    return true;
                case "captcha":
                    verifyData.captcha = (Captcha) Captcha.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "clientId":
                    verifyData.clientId = jsonParser.getValueAsString();
                    return true;
                case "ttt_signin_token":
                    verifyData.ttt_signin_token = jsonParser.getValueAsString();
                    return true;
                case "country_code":
                    verifyData.countryCode = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VerifyData verifyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "verify_type":
                case "language":
                case "action":
                case "device":
                case "code_length":
                case "captchaToken":
                case "captchaValue":
                case "code":
                case "mobile_number":
                case "category":
                case "email":
                case "forceLogin":
                case "captcha":
                case "clientId":
                case "ttt_signin_token":
                case "country_code":
                    return true;
                default:
                    return super.parseFieldCheck(verifyData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerifyData verifyData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("country_code", verifyData.countryCode);
            String str = verifyData.mobileNumber;
            if (str != null) {
                jsonGenerator.writeStringField("mobile_number", str);
            }
            jsonGenerator.writeNumberField("code", verifyData.code);
            String str2 = verifyData.language;
            if (str2 != null) {
                jsonGenerator.writeStringField("language", str2);
            }
            if (verifyData.action != null) {
                jsonGenerator.writeFieldName(Action.TYPE);
                VerifyReason.JSON_ADAPTER.serialize(verifyData.action, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("code_length", verifyData.codeLength);
            if (verifyData.device != null) {
                jsonGenerator.writeFieldName(Device.TYPE);
                Device.JSON_ADAPTER.serialize(verifyData.device, jsonGenerator, true);
            }
            String str3 = verifyData.clientId;
            if (str3 != null) {
                jsonGenerator.writeStringField("clientId", str3);
            }
            String str4 = verifyData.category;
            if (str4 != null) {
                jsonGenerator.writeStringField("category", str4);
            }
            String str5 = verifyData.captchaToken;
            if (str5 != null) {
                jsonGenerator.writeStringField("captchaToken", str5);
            }
            String str6 = verifyData.captchaValue;
            if (str6 != null) {
                jsonGenerator.writeStringField("captchaValue", str6);
            }
            String str7 = verifyData.ttt_signin_token;
            if (str7 != null) {
                jsonGenerator.writeStringField("ttt_signin_token", str7);
            }
            jsonGenerator.writeBooleanField("forceLogin", verifyData.forceLogin);
            if (verifyData.captcha != null) {
                jsonGenerator.writeFieldName(Captcha.TYPE);
                Captcha.JSON_ADAPTER.serialize(verifyData.captcha, jsonGenerator, true);
            }
            String str8 = verifyData.email;
            if (str8 != null) {
                jsonGenerator.writeStringField(SignInGrantType.email, str8);
            }
            String str9 = verifyData.verifyType;
            if (str9 != null) {
                jsonGenerator.writeStringField("verify_type", str9);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerifyData new_() {
        VerifyData verifyData = new VerifyData();
        verifyData.nullCheck();
        return verifyData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerifyData m19291clone() {
        VerifyData verifyData = new VerifyData();
        verifyData.countryCode = this.countryCode;
        verifyData.mobileNumber = this.mobileNumber;
        verifyData.code = this.code;
        verifyData.language = this.language;
        verifyData.action = this.action;
        verifyData.codeLength = this.codeLength;
        Device device = this.device;
        if (device != null) {
            verifyData.device = device.m17967clone();
        }
        verifyData.clientId = this.clientId;
        verifyData.category = this.category;
        verifyData.captchaToken = this.captchaToken;
        verifyData.captchaValue = this.captchaValue;
        verifyData.ttt_signin_token = this.ttt_signin_token;
        verifyData.forceLogin = this.forceLogin;
        Captcha captcha = this.captcha;
        if (captcha != null) {
            verifyData.captcha = captcha.m17795clone();
        }
        verifyData.email = this.email;
        verifyData.verifyType = this.verifyType;
        return verifyData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyData)) {
            return false;
        }
        VerifyData verifyData = (VerifyData) obj;
        return this.countryCode == verifyData.countryCode && ValueObject.util_equals(this.mobileNumber, verifyData.mobileNumber) && this.code == verifyData.code && ValueObject.util_equals(this.language, verifyData.language) && ValueObject.util_equals(this.action, verifyData.action) && this.codeLength == verifyData.codeLength && ValueObject.util_equals(this.device, verifyData.device) && ValueObject.util_equals(this.clientId, verifyData.clientId) && ValueObject.util_equals(this.category, verifyData.category) && ValueObject.util_equals(this.captchaToken, verifyData.captchaToken) && ValueObject.util_equals(this.captchaValue, verifyData.captchaValue) && ValueObject.util_equals(this.ttt_signin_token, verifyData.ttt_signin_token) && this.forceLogin == verifyData.forceLogin && ValueObject.util_equals(this.captcha, verifyData.captcha) && ValueObject.util_equals(this.email, verifyData.email) && ValueObject.util_equals(this.verifyType, verifyData.verifyType);
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
        String str = this.mobileNumber;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.code) * 41;
        String str2 = this.language;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        VerifyReason verifyReason = this.action;
        int iHashCode3 = (((iHashCode2 + (verifyReason != null ? verifyReason.hashCode() : 0)) * 41) + this.codeLength) * 41;
        Device device = this.device;
        int iHashCode4 = (iHashCode3 + (device != null ? device.hashCode() : 0)) * 41;
        String str3 = this.clientId;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.category;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.captchaToken;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.captchaValue;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.ttt_signin_token;
        int iHashCode9 = (((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.forceLogin ? 1231 : 1237)) * 41;
        Captcha captcha = this.captcha;
        int iHashCode10 = (iHashCode9 + (captcha != null ? captcha.hashCode() : 0)) * 41;
        String str8 = this.email;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.verifyType;
        int iHashCode12 = iHashCode11 + (str9 != null ? str9.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode12;
        return iHashCode12;
    }

    public void nullCheck() {
        if (this.mobileNumber == null) {
            this.mobileNumber = "";
        }
        if (this.language == null) {
            this.language = "";
        }
        if (this.action == null) {
            this.action = (VerifyReason) VerifyReason.JSON_ADAPTER.defaultEnum();
        }
        if (this.device == null) {
            this.device = Device.new_();
        }
        if (this.clientId == null) {
            this.clientId = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.captchaToken == null) {
            this.captchaToken = "";
        }
        if (this.captchaValue == null) {
            this.captchaValue = "";
        }
        if (this.ttt_signin_token == null) {
            this.ttt_signin_token = "";
        }
        if (this.captcha == null) {
            this.captcha = Captcha.new_();
        }
        if (this.email == null) {
            this.email = "";
        }
        if (this.verifyType == null) {
            this.verifyType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
