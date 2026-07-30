package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class VerifyDataV2 extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verifydatav2";

    @NonNull
    @ProtobufIndex(index = 5)
    public VerifyReason action;

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
    @ProtobufIndex(index = 12)
    public String email;

    @NonNull
    @ProtobufIndex(index = 4)
    @Deprecated
    public String language;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mobileNumber;

    @NonNull
    @ProtobufIndex(index = 13)
    public String ttt_signin_token;

    @NonNull
    @ProtobufIndex(index = 10)
    public String userId;
    public static ProtobufAdapter<VerifyDataV2> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerifyDataV2>() { // from class: com.p1.mobile.putong.data.VerifyDataV2.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerifyDataV2 verifyDataV2) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, verifyDataV2.countryCode);
            String str = verifyDataV2.mobileNumber;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(3, verifyDataV2.code);
            String str2 = verifyDataV2.language;
            if (str2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            VerifyReason verifyReason = verifyDataV2.action;
            if (verifyReason != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17281h(5, verifyReason.ordinal());
            }
            int iM17281h3 = iM17281h2 + CodedOutputByteBufferNano.m17281h(6, verifyDataV2.codeLength);
            Device device = verifyDataV2.device;
            if (device != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17285l(7, device, Device.PROTOBUF_ADAPTER);
            }
            String str3 = verifyDataV2.clientId;
            if (str3 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17288o(8, str3);
            }
            String str4 = verifyDataV2.category;
            if (str4 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17288o(9, str4);
            }
            String str5 = verifyDataV2.userId;
            if (str5 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17288o(10, str5);
            }
            VerifyReason verifyReason2 = verifyDataV2.action;
            if (verifyReason2 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17285l(11, verifyReason2, VerifyReason.PROTOBUF_ADAPTER);
            }
            String str6 = verifyDataV2.email;
            if (str6 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17288o(12, str6);
            }
            String str7 = verifyDataV2.ttt_signin_token;
            if (str7 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17288o(13, str7);
            }
            verifyDataV2.cachedSize = iM17281h3;
            return iM17281h3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerifyDataV2 parse(nc5 nc5Var) throws IOException {
            VerifyDataV2 verifyDataV2 = new VerifyDataV2();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (verifyDataV2.action == null && numValueOf != null) {
                            verifyDataV2.action = (VerifyReason) VerifyReason.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (verifyDataV2.mobileNumber == null) {
                            verifyDataV2.mobileNumber = "";
                        }
                        if (verifyDataV2.language == null) {
                            verifyDataV2.language = "";
                        }
                        if (verifyDataV2.action == null) {
                            verifyDataV2.action = (VerifyReason) VerifyReason.JSON_ADAPTER.defaultEnum();
                        }
                        if (verifyDataV2.device == null) {
                            verifyDataV2.device = Device.new_();
                        }
                        if (verifyDataV2.clientId == null) {
                            verifyDataV2.clientId = "";
                        }
                        if (verifyDataV2.category == null) {
                            verifyDataV2.category = "";
                        }
                        if (verifyDataV2.userId == null) {
                            verifyDataV2.userId = "";
                        }
                        if (verifyDataV2.email == null) {
                            verifyDataV2.email = "";
                        }
                        if (verifyDataV2.ttt_signin_token == null) {
                            verifyDataV2.ttt_signin_token = "";
                        }
                        break;
                    case 8:
                        verifyDataV2.countryCode = nc5Var.m162486j();
                        continue;
                    case 18:
                        verifyDataV2.mobileNumber = nc5Var.m162495s();
                        continue;
                    case 24:
                        verifyDataV2.code = nc5Var.m162486j();
                        continue;
                    case 34:
                        verifyDataV2.language = nc5Var.m162495s();
                        continue;
                    case 40:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 48:
                        verifyDataV2.codeLength = nc5Var.m162486j();
                        continue;
                    case 58:
                        verifyDataV2.device = (Device) nc5Var.m162488l(Device.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        verifyDataV2.clientId = nc5Var.m162495s();
                        continue;
                    case 74:
                        verifyDataV2.category = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        verifyDataV2.userId = nc5Var.m162495s();
                        continue;
                    case 90:
                        verifyDataV2.action = (VerifyReason) nc5Var.m162488l(VerifyReason.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        verifyDataV2.email = nc5Var.m162495s();
                        continue;
                    case 106:
                        verifyDataV2.ttt_signin_token = nc5Var.m162495s();
                        continue;
                    default:
                        if (verifyDataV2.action == null && numValueOf != null) {
                            verifyDataV2.action = (VerifyReason) VerifyReason.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (verifyDataV2.mobileNumber == null) {
                            verifyDataV2.mobileNumber = "";
                        }
                        if (verifyDataV2.language == null) {
                            verifyDataV2.language = "";
                        }
                        if (verifyDataV2.action == null) {
                            verifyDataV2.action = (VerifyReason) VerifyReason.JSON_ADAPTER.defaultEnum();
                        }
                        if (verifyDataV2.device == null) {
                            verifyDataV2.device = Device.new_();
                        }
                        if (verifyDataV2.clientId == null) {
                            verifyDataV2.clientId = "";
                        }
                        if (verifyDataV2.category == null) {
                            verifyDataV2.category = "";
                        }
                        if (verifyDataV2.userId == null) {
                            verifyDataV2.userId = "";
                        }
                        if (verifyDataV2.email == null) {
                            verifyDataV2.email = "";
                        }
                        if (verifyDataV2.ttt_signin_token == null) {
                            verifyDataV2.ttt_signin_token = "";
                            return verifyDataV2;
                        }
                        break;
                }
            }
            return verifyDataV2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerifyDataV2 verifyDataV2, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, verifyDataV2.countryCode);
            String str = verifyDataV2.mobileNumber;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17305G(3, verifyDataV2.code);
            String str2 = verifyDataV2.language;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            VerifyReason verifyReason = verifyDataV2.action;
            if (verifyReason != null) {
                codedOutputByteBufferNano.m17305G(5, verifyReason.ordinal());
            }
            codedOutputByteBufferNano.m17305G(6, verifyDataV2.codeLength);
            Device device = verifyDataV2.device;
            if (device != null) {
                codedOutputByteBufferNano.m17309K(7, device, Device.PROTOBUF_ADAPTER);
            }
            String str3 = verifyDataV2.clientId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(8, str3);
            }
            String str4 = verifyDataV2.category;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(9, str4);
            }
            String str5 = verifyDataV2.userId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(10, str5);
            }
            VerifyReason verifyReason2 = verifyDataV2.action;
            if (verifyReason2 != null) {
                codedOutputByteBufferNano.m17309K(11, verifyReason2, VerifyReason.PROTOBUF_ADAPTER);
            }
            String str6 = verifyDataV2.email;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(12, str6);
            }
            String str7 = verifyDataV2.ttt_signin_token;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(13, str7);
            }
        }
    };
    public static JsonAdapter<VerifyDataV2> JSON_ADAPTER = new ObjectJsonAdapter<VerifyDataV2>() { // from class: com.p1.mobile.putong.data.VerifyDataV2.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerifyDataV2.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerifyDataV2 newInstance() {
            return new VerifyDataV2();
        }

        public boolean parseField(VerifyDataV2 verifyDataV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "language":
                    verifyDataV2.language = jsonParser.getValueAsString();
                    return true;
                case "countryCode":
                    verifyDataV2.countryCode = jsonParser.getValueAsInt();
                    return true;
                case "action":
                    verifyDataV2.action = VerifyReason.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "device":
                    verifyDataV2.device = Device.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "codeLength":
                    verifyDataV2.codeLength = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    verifyDataV2.userId = jsonParser.getValueAsString();
                    return true;
                case "code":
                    verifyDataV2.code = jsonParser.getValueAsInt();
                    return true;
                case "category":
                    verifyDataV2.category = jsonParser.getValueAsString();
                    return true;
                case "email":
                    verifyDataV2.email = jsonParser.getValueAsString();
                    return true;
                case "clientId":
                    verifyDataV2.clientId = jsonParser.getValueAsString();
                    return true;
                case "ttt_signin_token":
                    verifyDataV2.ttt_signin_token = jsonParser.getValueAsString();
                    return true;
                case "mobileNumber":
                    verifyDataV2.mobileNumber = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VerifyDataV2 verifyDataV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "language":
                case "countryCode":
                case "action":
                case "device":
                case "codeLength":
                case "userId":
                case "code":
                case "category":
                case "email":
                case "clientId":
                case "ttt_signin_token":
                case "mobileNumber":
                    return true;
                default:
                    return super.parseFieldCheck(verifyDataV2, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerifyDataV2 verifyDataV2, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, verifyDataV2.countryCode);
            String str = verifyDataV2.mobileNumber;
            if (str != null) {
                jsonGenerator.writeStringField("mobileNumber", str);
            }
            jsonGenerator.writeNumberField("code", verifyDataV2.code);
            String str2 = verifyDataV2.language;
            if (str2 != null) {
                jsonGenerator.writeStringField(IjkMediaMeta.IJKM_KEY_LANGUAGE, str2);
            }
            if (verifyDataV2.action != null) {
                jsonGenerator.writeFieldName("action");
                VerifyReason.JSON_ADAPTER.serialize(verifyDataV2.action, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("codeLength", verifyDataV2.codeLength);
            if (verifyDataV2.device != null) {
                jsonGenerator.writeFieldName(Device.TYPE);
                Device.JSON_ADAPTER.serialize(verifyDataV2.device, jsonGenerator, true);
            }
            String str3 = verifyDataV2.clientId;
            if (str3 != null) {
                jsonGenerator.writeStringField("clientId", str3);
            }
            String str4 = verifyDataV2.category;
            if (str4 != null) {
                jsonGenerator.writeStringField("category", str4);
            }
            String str5 = verifyDataV2.userId;
            if (str5 != null) {
                jsonGenerator.writeStringField("userId", str5);
            }
            String str6 = verifyDataV2.email;
            if (str6 != null) {
                jsonGenerator.writeStringField("email", str6);
            }
            String str7 = verifyDataV2.ttt_signin_token;
            if (str7 != null) {
                jsonGenerator.writeStringField("ttt_signin_token", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerifyDataV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerifyDataV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerifyDataV2 new_() {
        VerifyDataV2 verifyDataV2 = new VerifyDataV2();
        verifyDataV2.nullCheck();
        return verifyDataV2;
    }

    public static VerifyDataV2 v1ConvertV2(VerifyData verifyData) {
        VerifyDataV2 verifyDataV2New_ = new_();
        verifyDataV2New_.countryCode = verifyData.countryCode;
        verifyDataV2New_.mobileNumber = verifyData.mobileNumber;
        verifyDataV2New_.code = verifyData.code;
        verifyDataV2New_.language = verifyData.language;
        verifyDataV2New_.action = verifyData.action;
        verifyDataV2New_.codeLength = verifyData.codeLength;
        verifyDataV2New_.device = verifyData.device;
        verifyDataV2New_.clientId = verifyData.clientId;
        verifyDataV2New_.category = verifyData.category;
        verifyDataV2New_.userId = uqb0.f180397c0.userId();
        return verifyDataV2New_;
    }

    public static VerifyData v2ConvertV1(VerifyDataV2 verifyDataV2) {
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.countryCode = verifyDataV2.countryCode;
        verifyDataNew_.mobileNumber = verifyDataV2.mobileNumber;
        verifyDataNew_.code = verifyDataV2.code;
        verifyDataNew_.language = verifyDataV2.language;
        verifyDataNew_.action = verifyDataV2.action;
        verifyDataNew_.codeLength = verifyDataV2.codeLength;
        verifyDataNew_.device = verifyDataV2.device;
        verifyDataNew_.clientId = verifyDataV2.clientId;
        verifyDataNew_.category = verifyDataV2.category;
        verifyDataNew_.ttt_signin_token = verifyDataV2.ttt_signin_token;
        return verifyDataNew_;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerifyDataV2 mo225055clone() {
        VerifyDataV2 verifyDataV2 = new VerifyDataV2();
        verifyDataV2.countryCode = this.countryCode;
        verifyDataV2.mobileNumber = this.mobileNumber;
        verifyDataV2.code = this.code;
        verifyDataV2.language = this.language;
        verifyDataV2.action = this.action;
        verifyDataV2.codeLength = this.codeLength;
        Device device = this.device;
        if (device != null) {
            verifyDataV2.device = device.mo225055clone();
        }
        verifyDataV2.clientId = this.clientId;
        verifyDataV2.category = this.category;
        verifyDataV2.userId = this.userId;
        verifyDataV2.email = this.email;
        verifyDataV2.ttt_signin_token = this.ttt_signin_token;
        return verifyDataV2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyDataV2)) {
            return false;
        }
        VerifyDataV2 verifyDataV2 = (VerifyDataV2) obj;
        return this.countryCode == verifyDataV2.countryCode && ValueObject.util_equals(this.mobileNumber, verifyDataV2.mobileNumber) && this.code == verifyDataV2.code && ValueObject.util_equals(this.language, verifyDataV2.language) && ValueObject.util_equals(this.action, verifyDataV2.action) && this.codeLength == verifyDataV2.codeLength && ValueObject.util_equals(this.device, verifyDataV2.device) && ValueObject.util_equals(this.clientId, verifyDataV2.clientId) && ValueObject.util_equals(this.category, verifyDataV2.category) && ValueObject.util_equals(this.userId, verifyDataV2.userId) && ValueObject.util_equals(this.email, verifyDataV2.email) && ValueObject.util_equals(this.ttt_signin_token, verifyDataV2.ttt_signin_token);
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
        String str5 = this.userId;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.email;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.ttt_signin_token;
        int iHashCode9 = iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
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
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.email == null) {
            this.email = "";
        }
        if (this.ttt_signin_token == null) {
            this.ttt_signin_token = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
