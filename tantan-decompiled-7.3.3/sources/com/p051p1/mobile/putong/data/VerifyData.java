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
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
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
    @ProtobufIndex(index = 16)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerifyData verifyData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, verifyData.countryCode);
            String str = verifyData.mobileNumber;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(3, verifyData.code);
            String str2 = verifyData.language;
            if (str2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            VerifyReason verifyReason = verifyData.action;
            if (verifyReason != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17281h(5, verifyReason.ordinal());
            }
            int iM17281h3 = iM17281h2 + CodedOutputByteBufferNano.m17281h(6, verifyData.codeLength);
            Device device = verifyData.device;
            if (device != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17285l(7, device, Device.PROTOBUF_ADAPTER);
            }
            String str3 = verifyData.clientId;
            if (str3 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17288o(8, str3);
            }
            String str4 = verifyData.category;
            if (str4 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17288o(9, str4);
            }
            String str5 = verifyData.captchaToken;
            if (str5 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17288o(10, str5);
            }
            String str6 = verifyData.captchaValue;
            if (str6 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17288o(11, str6);
            }
            VerifyReason verifyReason2 = verifyData.action;
            if (verifyReason2 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17285l(12, verifyReason2, VerifyReason.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17281h3 + CodedOutputByteBufferNano.m17275b(13, verifyData.forceLogin);
            Captcha captcha = verifyData.captcha;
            if (captcha != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(14, captcha, Captcha.PROTOBUF_ADAPTER);
            }
            String str7 = verifyData.ttt_signin_token;
            if (str7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(15, str7);
            }
            String str8 = verifyData.email;
            if (str8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(16, str8);
            }
            String str9 = verifyData.verifyType;
            if (str9 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(17, str9);
            }
            verifyData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerifyData parse(nc5 nc5Var) throws IOException {
            VerifyData verifyData = new VerifyData();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        verifyData.countryCode = nc5Var.m162486j();
                        continue;
                    case 18:
                        verifyData.mobileNumber = nc5Var.m162495s();
                        continue;
                    case 24:
                        verifyData.code = nc5Var.m162486j();
                        continue;
                    case 34:
                        verifyData.language = nc5Var.m162495s();
                        continue;
                    case 40:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 48:
                        verifyData.codeLength = nc5Var.m162486j();
                        continue;
                    case 58:
                        verifyData.device = (Device) nc5Var.m162488l(Device.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        verifyData.clientId = nc5Var.m162495s();
                        continue;
                    case 74:
                        verifyData.category = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        verifyData.captchaToken = nc5Var.m162495s();
                        continue;
                    case 90:
                        verifyData.captchaValue = nc5Var.m162495s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        verifyData.action = (VerifyReason) nc5Var.m162488l(VerifyReason.PROTOBUF_ADAPTER);
                        continue;
                    case 104:
                        verifyData.forceLogin = nc5Var.m162483g();
                        continue;
                    case 114:
                        verifyData.captcha = (Captcha) nc5Var.m162488l(Captcha.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        verifyData.ttt_signin_token = nc5Var.m162495s();
                        continue;
                    case 130:
                        verifyData.email = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        verifyData.verifyType = nc5Var.m162495s();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerifyData verifyData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, verifyData.countryCode);
            String str = verifyData.mobileNumber;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17305G(3, verifyData.code);
            String str2 = verifyData.language;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            VerifyReason verifyReason = verifyData.action;
            if (verifyReason != null) {
                codedOutputByteBufferNano.m17305G(5, verifyReason.ordinal());
            }
            codedOutputByteBufferNano.m17305G(6, verifyData.codeLength);
            Device device = verifyData.device;
            if (device != null) {
                codedOutputByteBufferNano.m17309K(7, device, Device.PROTOBUF_ADAPTER);
            }
            String str3 = verifyData.clientId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(8, str3);
            }
            String str4 = verifyData.category;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(9, str4);
            }
            String str5 = verifyData.captchaToken;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(10, str5);
            }
            String str6 = verifyData.captchaValue;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(11, str6);
            }
            VerifyReason verifyReason2 = verifyData.action;
            if (verifyReason2 != null) {
                codedOutputByteBufferNano.m17309K(12, verifyReason2, VerifyReason.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(13, verifyData.forceLogin);
            Captcha captcha = verifyData.captcha;
            if (captcha != null) {
                codedOutputByteBufferNano.m17309K(14, captcha, Captcha.PROTOBUF_ADAPTER);
            }
            String str7 = verifyData.ttt_signin_token;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(15, str7);
            }
            String str8 = verifyData.email;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(16, str8);
            }
            String str9 = verifyData.verifyType;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(17, str9);
            }
        }
    };
    public static JsonAdapter<VerifyData> JSON_ADAPTER = new ObjectJsonAdapter<VerifyData>() { // from class: com.p1.mobile.putong.data.VerifyData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerifyData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerifyData newInstance() {
            return new VerifyData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(VerifyData verifyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1948245184:
                    if (str.equals("verify_type")) {
                        b = 0;
                    }
                    break;
                case -1613589672:
                    if (str.equals(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
                        b = 1;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 2;
                    }
                    break;
                case -1335157162:
                    if (str.equals(Device.TYPE)) {
                        b = 3;
                    }
                    break;
                case -967215752:
                    if (str.equals("code_length")) {
                        b = 4;
                    }
                    break;
                case -948649057:
                    if (str.equals("captchaToken")) {
                        b = 5;
                    }
                    break;
                case -947217641:
                    if (str.equals("captchaValue")) {
                        b = 6;
                    }
                    break;
                case 3059181:
                    if (str.equals("code")) {
                        b = 7;
                    }
                    break;
                case 33205638:
                    if (str.equals("mobile_number")) {
                        b = 8;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 9;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        b = 10;
                    }
                    break;
                case 117083966:
                    if (str.equals("forceLogin")) {
                        b = 11;
                    }
                    break;
                case 552567418:
                    if (str.equals(Captcha.TYPE)) {
                        b = 12;
                    }
                    break;
                case 908408390:
                    if (str.equals("clientId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1294876551:
                    if (str.equals("ttt_signin_token")) {
                        b = 14;
                    }
                    break;
                case 1481071862:
                    if (str.equals("country_code")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    verifyData.verifyType = jsonParser.getValueAsString();
                    return true;
                case 1:
                    verifyData.language = jsonParser.getValueAsString();
                    return true;
                case 2:
                    verifyData.action = VerifyReason.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 3:
                    verifyData.device = Device.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    verifyData.codeLength = jsonParser.getValueAsInt();
                    return true;
                case 5:
                    verifyData.captchaToken = jsonParser.getValueAsString();
                    return true;
                case 6:
                    verifyData.captchaValue = jsonParser.getValueAsString();
                    return true;
                case 7:
                    verifyData.code = jsonParser.getValueAsInt();
                    return true;
                case 8:
                    verifyData.mobileNumber = jsonParser.getValueAsString();
                    return true;
                case 9:
                    verifyData.category = jsonParser.getValueAsString();
                    return true;
                case 10:
                    verifyData.email = jsonParser.getValueAsString();
                    return true;
                case 11:
                    verifyData.forceLogin = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    verifyData.captcha = Captcha.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    verifyData.clientId = jsonParser.getValueAsString();
                    return true;
                case 14:
                    verifyData.ttt_signin_token = jsonParser.getValueAsString();
                    return true;
                case 15:
                    verifyData.countryCode = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(VerifyData verifyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1948245184:
                    if (str.equals("verify_type")) {
                        b = 0;
                    }
                    break;
                case -1613589672:
                    if (str.equals(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
                        b = 1;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 2;
                    }
                    break;
                case -1335157162:
                    if (str.equals(Device.TYPE)) {
                        b = 3;
                    }
                    break;
                case -967215752:
                    if (str.equals("code_length")) {
                        b = 4;
                    }
                    break;
                case -948649057:
                    if (str.equals("captchaToken")) {
                        b = 5;
                    }
                    break;
                case -947217641:
                    if (str.equals("captchaValue")) {
                        b = 6;
                    }
                    break;
                case 3059181:
                    if (str.equals("code")) {
                        b = 7;
                    }
                    break;
                case 33205638:
                    if (str.equals("mobile_number")) {
                        b = 8;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 9;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        b = 10;
                    }
                    break;
                case 117083966:
                    if (str.equals("forceLogin")) {
                        b = 11;
                    }
                    break;
                case 552567418:
                    if (str.equals(Captcha.TYPE)) {
                        b = 12;
                    }
                    break;
                case 908408390:
                    if (str.equals("clientId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1294876551:
                    if (str.equals("ttt_signin_token")) {
                        b = 14;
                    }
                    break;
                case 1481071862:
                    if (str.equals("country_code")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return super.parseFieldCheck(verifyData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerifyData verifyData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("country_code", verifyData.countryCode);
            String str = verifyData.mobileNumber;
            if (str != null) {
                jsonGenerator.writeStringField("mobile_number", str);
            }
            jsonGenerator.writeNumberField("code", verifyData.code);
            String str2 = verifyData.language;
            if (str2 != null) {
                jsonGenerator.writeStringField(IjkMediaMeta.IJKM_KEY_LANGUAGE, str2);
            }
            if (verifyData.action != null) {
                jsonGenerator.writeFieldName("action");
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
                jsonGenerator.writeStringField("email", str8);
            }
            String str9 = verifyData.verifyType;
            if (str9 != null) {
                jsonGenerator.writeStringField("verify_type", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerifyData new_() {
        VerifyData verifyData = new VerifyData();
        verifyData.nullCheck();
        return verifyData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerifyData mo225055clone() {
        VerifyData verifyData = new VerifyData();
        verifyData.countryCode = this.countryCode;
        verifyData.mobileNumber = this.mobileNumber;
        verifyData.code = this.code;
        verifyData.language = this.language;
        verifyData.action = this.action;
        verifyData.codeLength = this.codeLength;
        Device device = this.device;
        if (device != null) {
            verifyData.device = device.mo225055clone();
        }
        verifyData.clientId = this.clientId;
        verifyData.category = this.category;
        verifyData.captchaToken = this.captchaToken;
        verifyData.captchaValue = this.captchaValue;
        verifyData.ttt_signin_token = this.ttt_signin_token;
        verifyData.forceLogin = this.forceLogin;
        Captcha captcha = this.captcha;
        if (captcha != null) {
            verifyData.captcha = captcha.mo225055clone();
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
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
