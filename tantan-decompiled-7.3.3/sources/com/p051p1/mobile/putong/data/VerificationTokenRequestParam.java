package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.facertification.TTFacertificationClient;
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
import org.jetbrains.annotations.TestOnly;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class VerificationTokenRequestParam extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationtokenrequestparam";

    @NonNull
    @ProtobufIndex(index = 1)
    public String appId;

    @ProtobufIndex(index = 8)
    public boolean enableVolcEnginePro;

    @NonNull
    @ProtobufIndex(index = 4)
    public VerificationTokenIdentity identity;

    @ProtobufIndex(index = 9)
    public boolean newProcess;

    @NonNull
    @ProtobufIndex(index = 5)
    public VerificationTokenIdentity picture;

    @NonNull
    @ProtobufIndex(index = 2)
    public String productId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String region;

    @NonNull
    @ProtobufIndex(index = 7)
    public String retrieveId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String verifyType;
    public static ProtobufAdapter<VerificationTokenRequestParam> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationTokenRequestParam>() { // from class: com.p1.mobile.putong.data.VerificationTokenRequestParam.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationTokenRequestParam verificationTokenRequestParam) {
            String str = verificationTokenRequestParam.appId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = verificationTokenRequestParam.productId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = verificationTokenRequestParam.verifyType;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            VerificationTokenIdentity verificationTokenIdentity = verificationTokenRequestParam.identity;
            if (verificationTokenIdentity != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, verificationTokenIdentity, VerificationTokenIdentity.PROTOBUF_ADAPTER);
            }
            VerificationTokenIdentity verificationTokenIdentity2 = verificationTokenRequestParam.picture;
            if (verificationTokenIdentity2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, verificationTokenIdentity2, VerificationTokenIdentity.PROTOBUF_ADAPTER);
            }
            String str4 = verificationTokenRequestParam.region;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = verificationTokenRequestParam.retrieveId;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(8, verificationTokenRequestParam.enableVolcEnginePro) + CodedOutputByteBufferNano.m17275b(9, verificationTokenRequestParam.newProcess);
            verificationTokenRequestParam.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationTokenRequestParam parse(nc5 nc5Var) throws IOException {
            VerificationTokenRequestParam verificationTokenRequestParam = new VerificationTokenRequestParam();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (verificationTokenRequestParam.appId == null) {
                        verificationTokenRequestParam.appId = "";
                    }
                    if (verificationTokenRequestParam.productId == null) {
                        verificationTokenRequestParam.productId = "";
                    }
                    if (verificationTokenRequestParam.verifyType == null) {
                        verificationTokenRequestParam.verifyType = "";
                    }
                    if (verificationTokenRequestParam.identity == null) {
                        verificationTokenRequestParam.identity = VerificationTokenIdentity.new_();
                    }
                    if (verificationTokenRequestParam.picture == null) {
                        verificationTokenRequestParam.picture = VerificationTokenIdentity.new_();
                    }
                    if (verificationTokenRequestParam.region == null) {
                        verificationTokenRequestParam.region = "";
                    }
                    if (verificationTokenRequestParam.retrieveId != null) {
                        break;
                    }
                    verificationTokenRequestParam.retrieveId = "";
                    break;
                }
                if (iM162497u == 10) {
                    verificationTokenRequestParam.appId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    verificationTokenRequestParam.productId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    verificationTokenRequestParam.verifyType = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    verificationTokenRequestParam.identity = (VerificationTokenIdentity) nc5Var.m162488l(VerificationTokenIdentity.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    verificationTokenRequestParam.picture = (VerificationTokenIdentity) nc5Var.m162488l(VerificationTokenIdentity.PROTOBUF_ADAPTER);
                } else if (iM162497u == 50) {
                    verificationTokenRequestParam.region = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    verificationTokenRequestParam.retrieveId = nc5Var.m162495s();
                } else if (iM162497u == 64) {
                    verificationTokenRequestParam.enableVolcEnginePro = nc5Var.m162483g();
                } else {
                    if (iM162497u != 72) {
                        if (verificationTokenRequestParam.appId == null) {
                            verificationTokenRequestParam.appId = "";
                        }
                        if (verificationTokenRequestParam.productId == null) {
                            verificationTokenRequestParam.productId = "";
                        }
                        if (verificationTokenRequestParam.verifyType == null) {
                            verificationTokenRequestParam.verifyType = "";
                        }
                        if (verificationTokenRequestParam.identity == null) {
                            verificationTokenRequestParam.identity = VerificationTokenIdentity.new_();
                        }
                        if (verificationTokenRequestParam.picture == null) {
                            verificationTokenRequestParam.picture = VerificationTokenIdentity.new_();
                        }
                        if (verificationTokenRequestParam.region == null) {
                            verificationTokenRequestParam.region = "";
                        }
                        if (verificationTokenRequestParam.retrieveId != null) {
                            break;
                        }
                        verificationTokenRequestParam.retrieveId = "";
                        return verificationTokenRequestParam;
                    }
                    verificationTokenRequestParam.newProcess = nc5Var.m162483g();
                }
            }
            return verificationTokenRequestParam;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationTokenRequestParam verificationTokenRequestParam, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = verificationTokenRequestParam.appId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = verificationTokenRequestParam.productId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = verificationTokenRequestParam.verifyType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            VerificationTokenIdentity verificationTokenIdentity = verificationTokenRequestParam.identity;
            if (verificationTokenIdentity != null) {
                codedOutputByteBufferNano.m17309K(4, verificationTokenIdentity, VerificationTokenIdentity.PROTOBUF_ADAPTER);
            }
            VerificationTokenIdentity verificationTokenIdentity2 = verificationTokenRequestParam.picture;
            if (verificationTokenIdentity2 != null) {
                codedOutputByteBufferNano.m17309K(5, verificationTokenIdentity2, VerificationTokenIdentity.PROTOBUF_ADAPTER);
            }
            String str4 = verificationTokenRequestParam.region;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = verificationTokenRequestParam.retrieveId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            codedOutputByteBufferNano.m17299A(8, verificationTokenRequestParam.enableVolcEnginePro);
            codedOutputByteBufferNano.m17299A(9, verificationTokenRequestParam.newProcess);
        }
    };
    public static JsonAdapter<VerificationTokenRequestParam> JSON_ADAPTER = new ObjectJsonAdapter<VerificationTokenRequestParam>() { // from class: com.p1.mobile.putong.data.VerificationTokenRequestParam.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationTokenRequestParam.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationTokenRequestParam newInstance() {
            return new VerificationTokenRequestParam();
        }

        public boolean parseField(VerificationTokenRequestParam verificationTokenRequestParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "retrieveId":
                    verificationTokenRequestParam.retrieveId = jsonParser.getValueAsString();
                    return true;
                case "productId":
                    verificationTokenRequestParam.productId = jsonParser.getValueAsString();
                    return true;
                case "verifyType":
                    verificationTokenRequestParam.verifyType = jsonParser.getValueAsString();
                    return true;
                case "region":
                    verificationTokenRequestParam.region = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    verificationTokenRequestParam.picture = VerificationTokenIdentity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "enableVolcEnginePro":
                    verificationTokenRequestParam.enableVolcEnginePro = jsonParser.getValueAsBoolean();
                    return true;
                case "identity":
                    verificationTokenRequestParam.identity = VerificationTokenIdentity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "appId":
                    verificationTokenRequestParam.appId = jsonParser.getValueAsString();
                    return true;
                case "newProcess":
                    verificationTokenRequestParam.newProcess = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VerificationTokenRequestParam verificationTokenRequestParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "retrieveId":
                case "productId":
                case "verifyType":
                case "region":
                case "picture":
                case "enableVolcEnginePro":
                case "identity":
                case "appId":
                case "newProcess":
                    return true;
                default:
                    return super.parseFieldCheck(verificationTokenRequestParam, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationTokenRequestParam verificationTokenRequestParam, JsonGenerator jsonGenerator) throws IOException {
            String str = verificationTokenRequestParam.appId;
            if (str != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_ID, str);
            }
            String str2 = verificationTokenRequestParam.productId;
            if (str2 != null) {
                jsonGenerator.writeStringField("productId", str2);
            }
            String str3 = verificationTokenRequestParam.verifyType;
            if (str3 != null) {
                jsonGenerator.writeStringField("verifyType", str3);
            }
            if (verificationTokenRequestParam.identity != null) {
                jsonGenerator.writeFieldName("identity");
                VerificationTokenIdentity.JSON_ADAPTER.serialize(verificationTokenRequestParam.identity, jsonGenerator, true);
            }
            if (verificationTokenRequestParam.picture != null) {
                jsonGenerator.writeFieldName("picture");
                VerificationTokenIdentity.JSON_ADAPTER.serialize(verificationTokenRequestParam.picture, jsonGenerator, true);
            }
            String str4 = verificationTokenRequestParam.region;
            if (str4 != null) {
                jsonGenerator.writeStringField("region", str4);
            }
            String str5 = verificationTokenRequestParam.retrieveId;
            if (str5 != null) {
                jsonGenerator.writeStringField("retrieveId", str5);
            }
            jsonGenerator.writeBooleanField("enableVolcEnginePro", verificationTokenRequestParam.enableVolcEnginePro);
            jsonGenerator.writeBooleanField("newProcess", verificationTokenRequestParam.newProcess);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationTokenRequestParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationTokenRequestParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static final class VerificationTokenRequestParamBuilder {
        public String appId;
        private String idName;
        private String idNumber;
        private VerificationTokenIdentity identity;
        private VerificationTokenIdentity picture;
        public String productId;
        private String provider;
        private String retrieveId;
        public String type;

        public VerificationTokenRequestParam build() {
            VerificationTokenRequestParam verificationTokenRequestParam = new VerificationTokenRequestParam();
            VerificationTokenIdentity verificationTokenIdentity = this.identity;
            if (verificationTokenIdentity != null) {
                verificationTokenRequestParam.identity = verificationTokenIdentity;
            }
            VerificationTokenIdentity verificationTokenIdentity2 = this.picture;
            if (verificationTokenIdentity2 != null) {
                verificationTokenRequestParam.picture = verificationTokenIdentity2;
            }
            verificationTokenRequestParam.verifyType = this.type;
            verificationTokenRequestParam.appId = this.appId;
            verificationTokenRequestParam.productId = this.productId;
            String str = this.retrieveId;
            verificationTokenRequestParam.region = LiveRegionTag.oversea;
            verificationTokenRequestParam.retrieveId = str;
            return verificationTokenRequestParam;
        }

        public VerificationTokenRequestParamBuilder setAppId(String str) {
            this.appId = str;
            return this;
        }

        public VerificationTokenRequestParamBuilder setIdName(String str) {
            this.idName = str;
            return this;
        }

        public VerificationTokenRequestParamBuilder setIdNumber(String str) {
            this.idNumber = str;
            return this;
        }

        public VerificationTokenRequestParamBuilder setIdentity(VerificationTokenIdentity verificationTokenIdentity) {
            this.identity = verificationTokenIdentity;
            return this;
        }

        public VerificationTokenRequestParamBuilder setPicture(VerificationTokenIdentity verificationTokenIdentity) {
            this.picture = verificationTokenIdentity;
            return this;
        }

        public VerificationTokenRequestParamBuilder setProductId(String str) {
            this.productId = str;
            return this;
        }

        public VerificationTokenRequestParamBuilder setProvider(String str) {
            this.provider = str;
            return this;
        }

        public VerificationTokenRequestParamBuilder setRetrieveId(String str) {
            this.retrieveId = str;
            return this;
        }

        public VerificationTokenRequestParamBuilder setVerifyType(String str) {
            this.type = str;
            return this;
        }

        public VerificationTokenRequestParamBuilder useAccountBackTemplate(String str, boolean z, String str2, String str3, String str4) {
            this.appId = "1";
            this.productId = str3;
            this.type = "identity";
            this.retrieveId = str4;
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.provider = str2;
            verificationTokenIdentityNew_.dynamicProvider = true;
            verificationTokenIdentityNew_.identityName = this.idName;
            verificationTokenIdentityNew_.identityNumber = this.idNumber;
            verificationTokenIdentityNew_.upgrade = z;
            verificationTokenIdentityNew_.providerAppId = TTFacertificationClient.m61386q();
            verificationTokenIdentityNew_.metaInfo = str;
            this.identity = verificationTokenIdentityNew_;
            return this;
        }

        public VerificationTokenRequestParamBuilder useCoreTemplate(String str, String str2, String str3) {
            this.appId = "1";
            this.productId = str;
            this.type = "picture";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.providerAppId = TTFacertificationClient.m61386q();
            verificationTokenIdentityNew_.dynamicProvider = TextUtils.isEmpty(str3);
            verificationTokenIdentityNew_.provider = str3;
            verificationTokenIdentityNew_.metaInfo = str2;
            this.picture = verificationTokenIdentityNew_;
            return this;
        }

        public VerificationTokenRequestParamBuilder useCountryAccountBackTemplate(String str, boolean z, String str2, String str3, String str4) {
            this.appId = "1";
            this.productId = str3;
            this.type = "ctdid_picture";
            this.retrieveId = str4;
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.providerAppId = TTFacertificationClient.m61386q();
            verificationTokenIdentityNew_.dynamicProvider = TextUtils.isEmpty(str2);
            verificationTokenIdentityNew_.metaInfo = str;
            this.picture = verificationTokenIdentityNew_;
            return this;
        }

        public VerificationTokenRequestParamBuilder useCountryTemplate(String str, String str2, String str3) {
            this.appId = "1";
            this.productId = str;
            this.type = "ctdid_picture";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.providerAppId = TTFacertificationClient.m61386q();
            verificationTokenIdentityNew_.dynamicProvider = TextUtils.isEmpty(str3);
            verificationTokenIdentityNew_.provider = str3;
            verificationTokenIdentityNew_.metaInfo = str2;
            this.picture = verificationTokenIdentityNew_;
            return this;
        }

        public VerificationTokenRequestParamBuilder useLiveTemplate() {
            this.appId = "1";
            this.productId = "3";
            this.type = "identity";
            this.provider = "aliyun";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.provider = this.provider;
            verificationTokenIdentityNew_.identityNumber = this.idNumber;
            verificationTokenIdentityNew_.identityName = this.idName;
            this.identity = verificationTokenIdentityNew_;
            return this;
        }

        public VerificationTokenRequestParamBuilder useNewLiveTemplate(String str, boolean z, String str2, String str3) {
            this.appId = "1";
            this.productId = str3;
            this.type = "identity";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.provider = str2;
            verificationTokenIdentityNew_.dynamicProvider = false;
            verificationTokenIdentityNew_.identityName = this.idName;
            verificationTokenIdentityNew_.identityNumber = this.idNumber;
            verificationTokenIdentityNew_.upgrade = z;
            verificationTokenIdentityNew_.metaInfo = str;
            this.identity = verificationTokenIdentityNew_;
            return this;
        }

        public VerificationTokenRequestParamBuilder useServerTemplate(String str, boolean z, String str2, String str3) {
            this.appId = "1";
            this.productId = str3;
            this.type = "identity";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.provider = str2;
            verificationTokenIdentityNew_.dynamicProvider = TextUtils.isEmpty(str2);
            verificationTokenIdentityNew_.identityName = this.idName;
            verificationTokenIdentityNew_.identityNumber = this.idNumber;
            verificationTokenIdentityNew_.upgrade = z;
            verificationTokenIdentityNew_.providerAppId = TTFacertificationClient.m61386q();
            verificationTokenIdentityNew_.metaInfo = str;
            this.identity = verificationTokenIdentityNew_;
            return this;
        }

        @TestOnly
        public VerificationTokenRequestParamBuilder useTestAliTemplate(String str, String str2) {
            this.appId = "1";
            this.productId = str2;
            this.type = "picture";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.dynamicProvider = false;
            verificationTokenIdentityNew_.provider = "aliyun";
            verificationTokenIdentityNew_.metaInfo = str;
            this.picture = verificationTokenIdentityNew_;
            return this;
        }

        @TestOnly
        public VerificationTokenRequestParamBuilder useTestMoMoTemplate(String str) {
            this.appId = "1";
            this.productId = str;
            this.type = "picture";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.providerAppId = TTFacertificationClient.m61386q();
            verificationTokenIdentityNew_.dynamicProvider = false;
            verificationTokenIdentityNew_.provider = "momocv";
            this.picture = verificationTokenIdentityNew_;
            return this;
        }

        @TestOnly
        public VerificationTokenRequestParamBuilder useTestTencentIntlTemplate(String str) {
            this.appId = "1";
            this.productId = str;
            this.type = "picture";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.providerAppId = TTFacertificationClient.m61386q();
            verificationTokenIdentityNew_.dynamicProvider = false;
            verificationTokenIdentityNew_.provider = "tencentIntl";
            this.picture = verificationTokenIdentityNew_;
            return this;
        }

        @TestOnly
        public VerificationTokenRequestParamBuilder useTestTencentTemplate(String str) {
            this.appId = "1";
            this.productId = str;
            this.type = "picture";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.providerAppId = TTFacertificationClient.m61386q();
            verificationTokenIdentityNew_.dynamicProvider = false;
            verificationTokenIdentityNew_.provider = "tencent";
            this.picture = verificationTokenIdentityNew_;
            return this;
        }

        @TestOnly
        public VerificationTokenRequestParamBuilder useTestVolcFaceTemplate(String str) {
            this.appId = "1";
            this.productId = str;
            this.type = "picture";
            VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
            verificationTokenIdentityNew_.dynamicProvider = false;
            verificationTokenIdentityNew_.provider = "volcEnginePro";
            this.picture = verificationTokenIdentityNew_;
            return this;
        }

        private VerificationTokenRequestParamBuilder() {
        }
    }

    public static VerificationTokenRequestParamBuilder builder() {
        return new VerificationTokenRequestParamBuilder();
    }

    public static VerificationTokenRequestParam new_() {
        VerificationTokenRequestParam verificationTokenRequestParam = new VerificationTokenRequestParam();
        verificationTokenRequestParam.nullCheck();
        return verificationTokenRequestParam;
    }

    public String cacheKey() {
        return "cache" + this.appId + this.productId + this.verifyType + hashCode();
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationTokenRequestParam mo225055clone() {
        VerificationTokenRequestParam verificationTokenRequestParam = new VerificationTokenRequestParam();
        verificationTokenRequestParam.appId = this.appId;
        verificationTokenRequestParam.productId = this.productId;
        verificationTokenRequestParam.verifyType = this.verifyType;
        VerificationTokenIdentity verificationTokenIdentity = this.identity;
        if (verificationTokenIdentity != null) {
            verificationTokenRequestParam.identity = verificationTokenIdentity.mo225055clone();
        }
        VerificationTokenIdentity verificationTokenIdentity2 = this.picture;
        if (verificationTokenIdentity2 != null) {
            verificationTokenRequestParam.picture = verificationTokenIdentity2.mo225055clone();
        }
        verificationTokenRequestParam.region = this.region;
        verificationTokenRequestParam.retrieveId = this.retrieveId;
        verificationTokenRequestParam.enableVolcEnginePro = this.enableVolcEnginePro;
        verificationTokenRequestParam.newProcess = this.newProcess;
        return verificationTokenRequestParam;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationTokenRequestParam)) {
            return false;
        }
        VerificationTokenRequestParam verificationTokenRequestParam = (VerificationTokenRequestParam) obj;
        return ValueObject.util_equals(this.appId, verificationTokenRequestParam.appId) && ValueObject.util_equals(this.productId, verificationTokenRequestParam.productId) && ValueObject.util_equals(this.verifyType, verificationTokenRequestParam.verifyType) && ValueObject.util_equals(this.identity, verificationTokenRequestParam.identity) && ValueObject.util_equals(this.picture, verificationTokenRequestParam.picture) && ValueObject.util_equals(this.region, verificationTokenRequestParam.region) && ValueObject.util_equals(this.retrieveId, verificationTokenRequestParam.retrieveId) && this.enableVolcEnginePro == verificationTokenRequestParam.enableVolcEnginePro && this.newProcess == verificationTokenRequestParam.newProcess;
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
        String str = this.appId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.verifyType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        VerificationTokenIdentity verificationTokenIdentity = this.identity;
        int iHashCode4 = (iHashCode3 + (verificationTokenIdentity != null ? verificationTokenIdentity.hashCode() : 0)) * 41;
        VerificationTokenIdentity verificationTokenIdentity2 = this.picture;
        int iHashCode5 = (iHashCode4 + (verificationTokenIdentity2 != null ? verificationTokenIdentity2.hashCode() : 0)) * 41;
        String str4 = this.region;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.retrieveId;
        int iHashCode7 = ((((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.enableVolcEnginePro ? 1231 : 1237)) * 41) + (this.newProcess ? 1231 : 1237);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.appId == null) {
            this.appId = "";
        }
        if (this.productId == null) {
            this.productId = "";
        }
        if (this.verifyType == null) {
            this.verifyType = "";
        }
        if (this.identity == null) {
            this.identity = VerificationTokenIdentity.new_();
        }
        if (this.picture == null) {
            this.picture = VerificationTokenIdentity.new_();
        }
        if (this.region == null) {
            this.region = "";
        }
        if (this.retrieveId == null) {
            this.retrieveId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
