package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationToken verificationToken) {
            String str = verificationToken.uid;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = verificationToken.verifyType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = verificationToken.provider;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = verificationToken.token;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = verificationToken.bizId;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = verificationToken.expiredTime;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = verificationToken.userId;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            TencentToken tencentToken = verificationToken.tencentToken;
            if (tencentToken != null) {
                iO += CodedOutputByteBufferNano.l(8, tencentToken, TencentToken.PROTOBUF_ADAPTER);
            }
            String str8 = verificationToken.certifyId;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(9, str8);
            }
            int iB = iO + CodedOutputByteBufferNano.b(10, verificationToken.omitLiveData) + CodedOutputByteBufferNano.b(11, verificationToken.withPV);
            ReflectResponse reflectResponse = verificationToken.response;
            if (reflectResponse != null) {
                iB += CodedOutputByteBufferNano.l(12, reflectResponse, ReflectResponse.PROTOBUF_ADAPTER);
            }
            VolcEngineProToken volcEngineProToken = verificationToken.volcEngineProToken;
            if (volcEngineProToken != null) {
                iB += CodedOutputByteBufferNano.l(13, volcEngineProToken, VolcEngineProToken.PROTOBUF_ADAPTER);
            }
            String str9 = verificationToken.bizSeq;
            if (str9 != null) {
                iB += CodedOutputByteBufferNano.o(14, str9);
            }
            String str10 = verificationToken.transactionId;
            if (str10 != null) {
                iB += CodedOutputByteBufferNano.o(15, str10);
            }
            ((MessageNano) verificationToken).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationToken m19283parse(nb5 nb5Var) throws IOException {
            VerificationToken verificationToken = new VerificationToken();
            while (true) {
                switch (nb5Var.u()) {
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
                        verificationToken.uid = nb5Var.s();
                        continue;
                    case 18:
                        verificationToken.verifyType = nb5Var.s();
                        continue;
                    case 26:
                        verificationToken.provider = nb5Var.s();
                        continue;
                    case 34:
                        verificationToken.token = nb5Var.s();
                        continue;
                    case 42:
                        verificationToken.bizId = nb5Var.s();
                        continue;
                    case 50:
                        verificationToken.expiredTime = nb5Var.s();
                        continue;
                    case 58:
                        verificationToken.userId = nb5Var.s();
                        continue;
                    case 66:
                        verificationToken.tencentToken = (TencentToken) nb5Var.l(TencentToken.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        verificationToken.certifyId = nb5Var.s();
                        continue;
                    case 80:
                        verificationToken.omitLiveData = nb5Var.g();
                        continue;
                    case 88:
                        verificationToken.withPV = nb5Var.g();
                        continue;
                    case 98:
                        verificationToken.response = (ReflectResponse) nb5Var.l(ReflectResponse.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        verificationToken.volcEngineProToken = (VolcEngineProToken) nb5Var.l(VolcEngineProToken.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        verificationToken.bizSeq = nb5Var.s();
                        continue;
                    case 122:
                        verificationToken.transactionId = nb5Var.s();
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

        public void serialize(VerificationToken verificationToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = verificationToken.uid;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = verificationToken.verifyType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = verificationToken.provider;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = verificationToken.token;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = verificationToken.bizId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = verificationToken.expiredTime;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = verificationToken.userId;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            TencentToken tencentToken = verificationToken.tencentToken;
            if (tencentToken != null) {
                codedOutputByteBufferNano.K(8, tencentToken, TencentToken.PROTOBUF_ADAPTER);
            }
            String str8 = verificationToken.certifyId;
            if (str8 != null) {
                codedOutputByteBufferNano.R(9, str8);
            }
            codedOutputByteBufferNano.A(10, verificationToken.omitLiveData);
            codedOutputByteBufferNano.A(11, verificationToken.withPV);
            ReflectResponse reflectResponse = verificationToken.response;
            if (reflectResponse != null) {
                codedOutputByteBufferNano.K(12, reflectResponse, ReflectResponse.PROTOBUF_ADAPTER);
            }
            VolcEngineProToken volcEngineProToken = verificationToken.volcEngineProToken;
            if (volcEngineProToken != null) {
                codedOutputByteBufferNano.K(13, volcEngineProToken, VolcEngineProToken.PROTOBUF_ADAPTER);
            }
            String str9 = verificationToken.bizSeq;
            if (str9 != null) {
                codedOutputByteBufferNano.R(14, str9);
            }
            String str10 = verificationToken.transactionId;
            if (str10 != null) {
                codedOutputByteBufferNano.R(15, str10);
            }
        }
    };
    public static JsonAdapter<VerificationToken> JSON_ADAPTER = new ObjectJsonAdapter<VerificationToken>() { // from class: com.p1.mobile.putong.data.VerificationToken.2
        public Class getDataClass() {
            return VerificationToken.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VerificationToken mo17830newInstance() {
            return new VerificationToken();
        }

        public boolean parseField(VerificationToken verificationToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "certifyId":
                    verificationToken.certifyId = jsonParser.getValueAsString();
                    return true;
                case "bizSeq":
                    verificationToken.bizSeq = jsonParser.getValueAsString();
                    return true;
                case "verifyType":
                    verificationToken.verifyType = jsonParser.getValueAsString();
                    return true;
                case "provider":
                    verificationToken.provider = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    verificationToken.userId = jsonParser.getValueAsString();
                    return true;
                case "withPV":
                    verificationToken.withPV = jsonParser.getValueAsBoolean();
                    return true;
                case "response":
                    verificationToken.response = (ReflectResponse) ReflectResponse.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "expiredTime":
                    verificationToken.expiredTime = jsonParser.getValueAsString();
                    return true;
                case "uid":
                    verificationToken.uid = jsonParser.getValueAsString();
                    return true;
                case "bizId":
                    verificationToken.bizId = jsonParser.getValueAsString();
                    return true;
                case "token":
                    verificationToken.token = jsonParser.getValueAsString();
                    return true;
                case "tencentToken":
                    verificationToken.tencentToken = (TencentToken) TencentToken.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "transactionId":
                    verificationToken.transactionId = jsonParser.getValueAsString();
                    return true;
                case "volcEngineProToken":
                    verificationToken.volcEngineProToken = (VolcEngineProToken) VolcEngineProToken.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "omitLiveData":
                    verificationToken.omitLiveData = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VerificationToken verificationToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "certifyId":
                case "bizSeq":
                case "verifyType":
                case "provider":
                case "userId":
                case "withPV":
                case "response":
                case "expiredTime":
                case "uid":
                case "bizId":
                case "token":
                case "tencentToken":
                case "transactionId":
                case "volcEngineProToken":
                case "omitLiveData":
                    return true;
                default:
                    return super.parseFieldCheck(verificationToken, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationToken verificationToken, JsonGenerator jsonGenerator) throws IOException {
            String str = verificationToken.uid;
            if (str != null) {
                jsonGenerator.writeStringField("uid", str);
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
                jsonGenerator.writeStringField(Token.TYPE, str4);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationToken new_() {
        VerificationToken verificationToken = new VerificationToken();
        verificationToken.nullCheck();
        return verificationToken;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationToken m19282clone() {
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
            verificationToken.tencentToken = tencentToken.m19087clone();
        }
        verificationToken.certifyId = this.certifyId;
        verificationToken.omitLiveData = this.omitLiveData;
        verificationToken.withPV = this.withPV;
        ReflectResponse reflectResponse = this.response;
        if (reflectResponse != null) {
            verificationToken.response = reflectResponse.m18883clone();
        }
        VolcEngineProToken volcEngineProToken = this.volcEngineProToken;
        if (volcEngineProToken != null) {
            verificationToken.volcEngineProToken = volcEngineProToken.m19367clone();
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
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode13;
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
