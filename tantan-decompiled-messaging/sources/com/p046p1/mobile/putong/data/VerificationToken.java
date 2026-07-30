package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class VerificationToken extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationtoken";

    @NonNull
    @ProtobufIndex(index = 5)
    public String bizId;

    @Nullable
    @ProtobufIndex(index = 14)
    public String bizSeq;

    @NonNull
    @ProtobufIndex(index = 9)
    public String certifyId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String expiredTime;

    @ProtobufIndex(index = 10)
    public boolean omitLiveData;

    @NonNull
    @ProtobufIndex(index = 3)
    public String provider;

    @NonNull
    @ProtobufIndex(index = 12)
    public ReflectResponse response;

    @Nullable
    @ProtobufIndex(index = 8)
    public TencentToken tencentToken;

    @NonNull
    @ProtobufIndex(index = 4)
    public String token;

    @Nullable
    @ProtobufIndex(index = 15)
    public String transactionId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String uid;

    @NonNull
    @ProtobufIndex(index = 7)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String verifyType;

    @Nullable
    @ProtobufIndex(index = 13)
    public VolcEngineProToken volcEngineProToken;

    @ProtobufIndex(index = 11)
    public boolean withPV;
    public static ProtobufAdapter<VerificationToken> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationToken>() { // from class: com.p1.mobile.putong.data.VerificationToken.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationToken verificationToken) {
            String str = verificationToken.uid;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = verificationToken.verifyType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = verificationToken.provider;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = verificationToken.token;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = verificationToken.bizId;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = verificationToken.expiredTime;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = verificationToken.userId;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            TencentToken tencentToken = verificationToken.tencentToken;
            if (tencentToken != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(8, tencentToken, TencentToken.PROTOBUF_ADAPTER);
            }
            String str8 = verificationToken.certifyId;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str8);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(10, verificationToken.omitLiveData) + CodedOutputByteBufferNano.m17220b(11, verificationToken.withPV);
            ReflectResponse reflectResponse = verificationToken.response;
            if (reflectResponse != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(12, reflectResponse, ReflectResponse.PROTOBUF_ADAPTER);
            }
            VolcEngineProToken volcEngineProToken = verificationToken.volcEngineProToken;
            if (volcEngineProToken != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(13, volcEngineProToken, VolcEngineProToken.PROTOBUF_ADAPTER);
            }
            String str9 = verificationToken.bizSeq;
            if (str9 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(14, str9);
            }
            String str10 = verificationToken.transactionId;
            if (str10 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(15, str10);
            }
            verificationToken.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationToken parse(nb5 nb5Var) throws IOException {
            VerificationToken verificationToken = new VerificationToken();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (verificationToken.uid == null) {
                            verificationToken.uid = "";
                        }
                        if (verificationToken.verifyType == null) {
                            verificationToken.verifyType = "";
                        }
                        if (verificationToken.provider == null) {
                            verificationToken.provider = "";
                        }
                        if (verificationToken.token == null) {
                            verificationToken.token = "";
                        }
                        if (verificationToken.bizId == null) {
                            verificationToken.bizId = "";
                        }
                        if (verificationToken.expiredTime == null) {
                            verificationToken.expiredTime = "";
                        }
                        if (verificationToken.userId == null) {
                            verificationToken.userId = "";
                        }
                        if (verificationToken.certifyId == null) {
                            verificationToken.certifyId = "";
                        }
                        if (verificationToken.response == null) {
                            verificationToken.response = ReflectResponse.new_();
                        }
                        break;
                    case 10:
                        verificationToken.uid = nb5Var.m158750s();
                        continue;
                    case 18:
                        verificationToken.verifyType = nb5Var.m158750s();
                        continue;
                    case 26:
                        verificationToken.provider = nb5Var.m158750s();
                        continue;
                    case 34:
                        verificationToken.token = nb5Var.m158750s();
                        continue;
                    case 42:
                        verificationToken.bizId = nb5Var.m158750s();
                        continue;
                    case 50:
                        verificationToken.expiredTime = nb5Var.m158750s();
                        continue;
                    case 58:
                        verificationToken.userId = nb5Var.m158750s();
                        continue;
                    case 66:
                        verificationToken.tencentToken = (TencentToken) nb5Var.m158743l(TencentToken.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        verificationToken.certifyId = nb5Var.m158750s();
                        continue;
                    case 80:
                        verificationToken.omitLiveData = nb5Var.m158738g();
                        continue;
                    case 88:
                        verificationToken.withPV = nb5Var.m158738g();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        verificationToken.response = (ReflectResponse) nb5Var.m158743l(ReflectResponse.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        verificationToken.volcEngineProToken = (VolcEngineProToken) nb5Var.m158743l(VolcEngineProToken.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        verificationToken.bizSeq = nb5Var.m158750s();
                        continue;
                    case 122:
                        verificationToken.transactionId = nb5Var.m158750s();
                        continue;
                    default:
                        if (verificationToken.uid == null) {
                            verificationToken.uid = "";
                        }
                        if (verificationToken.verifyType == null) {
                            verificationToken.verifyType = "";
                        }
                        if (verificationToken.provider == null) {
                            verificationToken.provider = "";
                        }
                        if (verificationToken.token == null) {
                            verificationToken.token = "";
                        }
                        if (verificationToken.bizId == null) {
                            verificationToken.bizId = "";
                        }
                        if (verificationToken.expiredTime == null) {
                            verificationToken.expiredTime = "";
                        }
                        if (verificationToken.userId == null) {
                            verificationToken.userId = "";
                        }
                        if (verificationToken.certifyId == null) {
                            verificationToken.certifyId = "";
                        }
                        if (verificationToken.response == null) {
                            verificationToken.response = ReflectResponse.new_();
                            return verificationToken;
                        }
                        break;
                }
            }
            return verificationToken;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationToken verificationToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = verificationToken.uid;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = verificationToken.verifyType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = verificationToken.provider;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = verificationToken.token;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = verificationToken.bizId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = verificationToken.expiredTime;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = verificationToken.userId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            TencentToken tencentToken = verificationToken.tencentToken;
            if (tencentToken != null) {
                codedOutputByteBufferNano.m17254K(8, tencentToken, TencentToken.PROTOBUF_ADAPTER);
            }
            String str8 = verificationToken.certifyId;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(9, str8);
            }
            codedOutputByteBufferNano.m17244A(10, verificationToken.omitLiveData);
            codedOutputByteBufferNano.m17244A(11, verificationToken.withPV);
            ReflectResponse reflectResponse = verificationToken.response;
            if (reflectResponse != null) {
                codedOutputByteBufferNano.m17254K(12, reflectResponse, ReflectResponse.PROTOBUF_ADAPTER);
            }
            VolcEngineProToken volcEngineProToken = verificationToken.volcEngineProToken;
            if (volcEngineProToken != null) {
                codedOutputByteBufferNano.m17254K(13, volcEngineProToken, VolcEngineProToken.PROTOBUF_ADAPTER);
            }
            String str9 = verificationToken.bizSeq;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(14, str9);
            }
            String str10 = verificationToken.transactionId;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(15, str10);
            }
        }
    };
    public static JsonAdapter<VerificationToken> JSON_ADAPTER = new ObjectJsonAdapter<VerificationToken>() { // from class: com.p1.mobile.putong.data.VerificationToken.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationToken.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationToken newInstance() {
            return new VerificationToken();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(VerificationToken verificationToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1396834925:
                    if (str.equals("certifyId")) {
                        b = 0;
                    }
                    break;
                case -1388623284:
                    if (str.equals("bizSeq")) {
                        b = 1;
                    }
                    break;
                case -1033001133:
                    if (str.equals("verifyType")) {
                        b = 2;
                    }
                    break;
                case -987494927:
                    if (str.equals("provider")) {
                        b = 3;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 4;
                    }
                    break;
                case -787570356:
                    if (str.equals("withPV")) {
                        b = 5;
                    }
                    break;
                case -340323263:
                    if (str.equals("response")) {
                        b = 6;
                    }
                    break;
                case -92515438:
                    if (str.equals("expiredTime")) {
                        b = 7;
                    }
                    break;
                case 115792:
                    if (str.equals(Oauth2AccessToken.KEY_UID)) {
                        b = 8;
                    }
                    break;
                case 93752718:
                    if (str.equals("bizId")) {
                        b = 9;
                    }
                    break;
                case 110541305:
                    if (str.equals("token")) {
                        b = 10;
                    }
                    break;
                case 172562868:
                    if (str.equals("tencentToken")) {
                        b = 11;
                    }
                    break;
                case 448240793:
                    if (str.equals("transactionId")) {
                        b = 12;
                    }
                    break;
                case 1129623998:
                    if (str.equals("volcEngineProToken")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1960551775:
                    if (str.equals("omitLiveData")) {
                        b = 14;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    verificationToken.certifyId = jsonParser.getValueAsString();
                    return true;
                case 1:
                    verificationToken.bizSeq = jsonParser.getValueAsString();
                    return true;
                case 2:
                    verificationToken.verifyType = jsonParser.getValueAsString();
                    return true;
                case 3:
                    verificationToken.provider = jsonParser.getValueAsString();
                    return true;
                case 4:
                    verificationToken.userId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    verificationToken.withPV = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    verificationToken.response = ReflectResponse.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    verificationToken.expiredTime = jsonParser.getValueAsString();
                    return true;
                case 8:
                    verificationToken.uid = jsonParser.getValueAsString();
                    return true;
                case 9:
                    verificationToken.bizId = jsonParser.getValueAsString();
                    return true;
                case 10:
                    verificationToken.token = jsonParser.getValueAsString();
                    return true;
                case 11:
                    verificationToken.tencentToken = TencentToken.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    verificationToken.transactionId = jsonParser.getValueAsString();
                    return true;
                case 13:
                    verificationToken.volcEngineProToken = VolcEngineProToken.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    verificationToken.omitLiveData = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(VerificationToken verificationToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1396834925:
                    if (str.equals("certifyId")) {
                        b = 0;
                    }
                    break;
                case -1388623284:
                    if (str.equals("bizSeq")) {
                        b = 1;
                    }
                    break;
                case -1033001133:
                    if (str.equals("verifyType")) {
                        b = 2;
                    }
                    break;
                case -987494927:
                    if (str.equals("provider")) {
                        b = 3;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 4;
                    }
                    break;
                case -787570356:
                    if (str.equals("withPV")) {
                        b = 5;
                    }
                    break;
                case -340323263:
                    if (str.equals("response")) {
                        b = 6;
                    }
                    break;
                case -92515438:
                    if (str.equals("expiredTime")) {
                        b = 7;
                    }
                    break;
                case 115792:
                    if (str.equals(Oauth2AccessToken.KEY_UID)) {
                        b = 8;
                    }
                    break;
                case 93752718:
                    if (str.equals("bizId")) {
                        b = 9;
                    }
                    break;
                case 110541305:
                    if (str.equals("token")) {
                        b = 10;
                    }
                    break;
                case 172562868:
                    if (str.equals("tencentToken")) {
                        b = 11;
                    }
                    break;
                case 448240793:
                    if (str.equals("transactionId")) {
                        b = 12;
                    }
                    break;
                case 1129623998:
                    if (str.equals("volcEngineProToken")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1960551775:
                    if (str.equals("omitLiveData")) {
                        b = 14;
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
                    return true;
                default:
                    return super.parseFieldCheck(verificationToken, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationToken verificationToken, JsonGenerator jsonGenerator) throws IOException {
            String str = verificationToken.uid;
            if (str != null) {
                jsonGenerator.writeStringField(Oauth2AccessToken.KEY_UID, str);
            }
            String str2 = verificationToken.verifyType;
            if (str2 != null) {
                jsonGenerator.writeStringField("verifyType", str2);
            }
            String str3 = verificationToken.provider;
            if (str3 != null) {
                jsonGenerator.writeStringField("provider", str3);
            }
            String str4 = verificationToken.token;
            if (str4 != null) {
                jsonGenerator.writeStringField("token", str4);
            }
            String str5 = verificationToken.bizId;
            if (str5 != null) {
                jsonGenerator.writeStringField("bizId", str5);
            }
            String str6 = verificationToken.expiredTime;
            if (str6 != null) {
                jsonGenerator.writeStringField("expiredTime", str6);
            }
            String str7 = verificationToken.userId;
            if (str7 != null) {
                jsonGenerator.writeStringField("userId", str7);
            }
            if (verificationToken.tencentToken != null) {
                jsonGenerator.writeFieldName("tencentToken");
                TencentToken.JSON_ADAPTER.serialize(verificationToken.tencentToken, jsonGenerator, true);
            }
            String str8 = verificationToken.certifyId;
            if (str8 != null) {
                jsonGenerator.writeStringField("certifyId", str8);
            }
            jsonGenerator.writeBooleanField("omitLiveData", verificationToken.omitLiveData);
            jsonGenerator.writeBooleanField("withPV", verificationToken.withPV);
            if (verificationToken.response != null) {
                jsonGenerator.writeFieldName("response");
                ReflectResponse.JSON_ADAPTER.serialize(verificationToken.response, jsonGenerator, true);
            }
            if (verificationToken.volcEngineProToken != null) {
                jsonGenerator.writeFieldName("volcEngineProToken");
                VolcEngineProToken.JSON_ADAPTER.serialize(verificationToken.volcEngineProToken, jsonGenerator, true);
            }
            String str9 = verificationToken.bizSeq;
            if (str9 != null) {
                jsonGenerator.writeStringField("bizSeq", str9);
            }
            String str10 = verificationToken.transactionId;
            if (str10 != null) {
                jsonGenerator.writeStringField("transactionId", str10);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationToken new_() {
        VerificationToken verificationToken = new VerificationToken();
        verificationToken.nullCheck();
        return verificationToken;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationToken mo223809clone() {
        VerificationToken verificationToken = new VerificationToken();
        verificationToken.uid = this.uid;
        verificationToken.verifyType = this.verifyType;
        verificationToken.provider = this.provider;
        verificationToken.token = this.token;
        verificationToken.bizId = this.bizId;
        verificationToken.expiredTime = this.expiredTime;
        verificationToken.userId = this.userId;
        TencentToken tencentToken = this.tencentToken;
        if (tencentToken != null) {
            verificationToken.tencentToken = tencentToken.mo223809clone();
        }
        verificationToken.certifyId = this.certifyId;
        verificationToken.omitLiveData = this.omitLiveData;
        verificationToken.withPV = this.withPV;
        ReflectResponse reflectResponse = this.response;
        if (reflectResponse != null) {
            verificationToken.response = reflectResponse.mo223809clone();
        }
        VolcEngineProToken volcEngineProToken = this.volcEngineProToken;
        if (volcEngineProToken != null) {
            verificationToken.volcEngineProToken = volcEngineProToken.mo223809clone();
        }
        verificationToken.bizSeq = this.bizSeq;
        verificationToken.transactionId = this.transactionId;
        return verificationToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationToken)) {
            return false;
        }
        VerificationToken verificationToken = (VerificationToken) obj;
        return ValueObject.util_equals(this.uid, verificationToken.uid) && ValueObject.util_equals(this.verifyType, verificationToken.verifyType) && ValueObject.util_equals(this.provider, verificationToken.provider) && ValueObject.util_equals(this.token, verificationToken.token) && ValueObject.util_equals(this.bizId, verificationToken.bizId) && ValueObject.util_equals(this.expiredTime, verificationToken.expiredTime) && ValueObject.util_equals(this.userId, verificationToken.userId) && ValueObject.util_equals(this.tencentToken, verificationToken.tencentToken) && ValueObject.util_equals(this.certifyId, verificationToken.certifyId) && this.omitLiveData == verificationToken.omitLiveData && this.withPV == verificationToken.withPV && ValueObject.util_equals(this.response, verificationToken.response) && ValueObject.util_equals(this.volcEngineProToken, verificationToken.volcEngineProToken) && ValueObject.util_equals(this.bizSeq, verificationToken.bizSeq) && ValueObject.util_equals(this.transactionId, verificationToken.transactionId);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getProviderNameForTracker() {
        if (isTencentProvider()) {
            return "tencent";
        }
        if (isALiProvider()) {
            return "aliyun";
        }
        if (isMoMoProvider()) {
            return "momocv";
        }
        if (isTencentIntlProvider() || isTencentIntlProviderV2()) {
            return "tencentIntl";
        }
        if (isVolcProvider()) {
            return "volcEnginePro";
        }
        return isAliyunIntlProvider() ? "aliyunIntl" : "";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.uid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.verifyType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.provider;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.token;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.bizId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.expiredTime;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.userId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        TencentToken tencentToken = this.tencentToken;
        int iHashCode8 = (iHashCode7 + (tencentToken != null ? tencentToken.hashCode() : 0)) * 41;
        String str8 = this.certifyId;
        int iHashCode9 = (((((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41) + (this.omitLiveData ? 1231 : 1237)) * 41) + (this.withPV ? 1231 : 1237)) * 41;
        ReflectResponse reflectResponse = this.response;
        int iHashCode10 = (iHashCode9 + (reflectResponse != null ? reflectResponse.hashCode() : 0)) * 41;
        VolcEngineProToken volcEngineProToken = this.volcEngineProToken;
        int iHashCode11 = (iHashCode10 + (volcEngineProToken != null ? volcEngineProToken.hashCode() : 0)) * 41;
        String str9 = this.bizSeq;
        int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.transactionId;
        int iHashCode13 = iHashCode12 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    public boolean isALiProvider() {
        return "aliyun".equals(this.provider);
    }

    public boolean isAliyunIntlProvider() {
        return "aliyunIntl".equals(this.provider);
    }

    public boolean isFaceidProvider() {
        return "faceid".equals(this.provider);
    }

    public boolean isMoMoProvider() {
        return "momocv".equals(this.provider);
    }

    public boolean isTencentIntlProvider() {
        return "tencentIntl".equals(this.provider);
    }

    public boolean isTencentIntlProviderV2() {
        return "tencentIntlV2".equals(this.provider);
    }

    public boolean isTencentProvider() {
        return "tencent".equals(this.provider) && this.tencentToken != null;
    }

    public boolean isVolcProvider() {
        return "volcEnginePro".equals(this.provider);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.uid == null) {
            this.uid = "";
        }
        if (this.verifyType == null) {
            this.verifyType = "";
        }
        if (this.provider == null) {
            this.provider = "";
        }
        if (this.token == null) {
            this.token = "";
        }
        if (this.bizId == null) {
            this.bizId = "";
        }
        if (this.expiredTime == null) {
            this.expiredTime = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.certifyId == null) {
            this.certifyId = "";
        }
        if (this.response == null) {
            this.response = ReflectResponse.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
