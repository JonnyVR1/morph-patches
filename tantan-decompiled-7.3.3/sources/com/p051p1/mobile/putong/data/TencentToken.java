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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class TencentToken extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tencenttoken";

    @NonNull
    @ProtobufIndex(index = 2)
    public String agreementNo;

    @NonNull
    @ProtobufIndex(index = 3)
    public String appId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String faceId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String keyLicence;

    @NonNull
    @ProtobufIndex(index = 4)
    public String nonce;

    @NonNull
    @ProtobufIndex(index = 6)
    public String sign;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String verifyMode;
    public static ProtobufAdapter<TencentToken> PROTOBUF_ADAPTER = new MessageNanoAdapter<TencentToken>() { // from class: com.p1.mobile.putong.data.TencentToken.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TencentToken tencentToken) {
            String str = tencentToken.faceId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = tencentToken.agreementNo;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = tencentToken.appId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = tencentToken.nonce;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = tencentToken.userId;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = tencentToken.sign;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = tencentToken.verifyMode;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            String str8 = tencentToken.keyLicence;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str8);
            }
            tencentToken.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TencentToken parse(nc5 nc5Var) throws IOException {
            TencentToken tencentToken = new TencentToken();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (tencentToken.faceId == null) {
                        tencentToken.faceId = "";
                    }
                    if (tencentToken.agreementNo == null) {
                        tencentToken.agreementNo = "";
                    }
                    if (tencentToken.appId == null) {
                        tencentToken.appId = "";
                    }
                    if (tencentToken.nonce == null) {
                        tencentToken.nonce = "";
                    }
                    if (tencentToken.userId == null) {
                        tencentToken.userId = "";
                    }
                    if (tencentToken.sign == null) {
                        tencentToken.sign = "";
                    }
                    if (tencentToken.verifyMode == null) {
                        tencentToken.verifyMode = "";
                    }
                    if (tencentToken.keyLicence != null) {
                        break;
                    }
                    tencentToken.keyLicence = "";
                    break;
                }
                if (iM162497u == 10) {
                    tencentToken.faceId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    tencentToken.agreementNo = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    tencentToken.appId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    tencentToken.nonce = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    tencentToken.userId = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    tencentToken.sign = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    tencentToken.verifyMode = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
                        if (tencentToken.faceId == null) {
                            tencentToken.faceId = "";
                        }
                        if (tencentToken.agreementNo == null) {
                            tencentToken.agreementNo = "";
                        }
                        if (tencentToken.appId == null) {
                            tencentToken.appId = "";
                        }
                        if (tencentToken.nonce == null) {
                            tencentToken.nonce = "";
                        }
                        if (tencentToken.userId == null) {
                            tencentToken.userId = "";
                        }
                        if (tencentToken.sign == null) {
                            tencentToken.sign = "";
                        }
                        if (tencentToken.verifyMode == null) {
                            tencentToken.verifyMode = "";
                        }
                        if (tencentToken.keyLicence != null) {
                            break;
                        }
                        tencentToken.keyLicence = "";
                        return tencentToken;
                    }
                    tencentToken.keyLicence = nc5Var.m162495s();
                }
            }
            return tencentToken;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TencentToken tencentToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tencentToken.faceId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = tencentToken.agreementNo;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = tencentToken.appId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = tencentToken.nonce;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = tencentToken.userId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = tencentToken.sign;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = tencentToken.verifyMode;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            String str8 = tencentToken.keyLicence;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(8, str8);
            }
        }
    };
    public static JsonAdapter<TencentToken> JSON_ADAPTER = new ObjectJsonAdapter<TencentToken>() { // from class: com.p1.mobile.putong.data.TencentToken.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TencentToken.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TencentToken newInstance() {
            return new TencentToken();
        }

        public boolean parseField(TencentToken tencentToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "faceId":
                    tencentToken.faceId = jsonParser.getValueAsString();
                    return true;
                case "verifyMode":
                    tencentToken.verifyMode = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    tencentToken.userId = jsonParser.getValueAsString();
                    return true;
                case "sign":
                    tencentToken.sign = jsonParser.getValueAsString();
                    return true;
                case "appId":
                    tencentToken.appId = jsonParser.getValueAsString();
                    return true;
                case "nonce":
                    tencentToken.nonce = jsonParser.getValueAsString();
                    return true;
                case "keyLicence":
                    tencentToken.keyLicence = jsonParser.getValueAsString();
                    return true;
                case "agreementNo":
                    tencentToken.agreementNo = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TencentToken tencentToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "faceId":
                case "verifyMode":
                case "userId":
                case "sign":
                case "appId":
                case "nonce":
                case "keyLicence":
                case "agreementNo":
                    return true;
                default:
                    return super.parseFieldCheck(tencentToken, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TencentToken tencentToken, JsonGenerator jsonGenerator) throws IOException {
            String str = tencentToken.faceId;
            if (str != null) {
                jsonGenerator.writeStringField("faceId", str);
            }
            String str2 = tencentToken.agreementNo;
            if (str2 != null) {
                jsonGenerator.writeStringField("agreementNo", str2);
            }
            String str3 = tencentToken.appId;
            if (str3 != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_ID, str3);
            }
            String str4 = tencentToken.nonce;
            if (str4 != null) {
                jsonGenerator.writeStringField("nonce", str4);
            }
            String str5 = tencentToken.userId;
            if (str5 != null) {
                jsonGenerator.writeStringField("userId", str5);
            }
            String str6 = tencentToken.sign;
            if (str6 != null) {
                jsonGenerator.writeStringField("sign", str6);
            }
            String str7 = tencentToken.verifyMode;
            if (str7 != null) {
                jsonGenerator.writeStringField("verifyMode", str7);
            }
            String str8 = tencentToken.keyLicence;
            if (str8 != null) {
                jsonGenerator.writeStringField("keyLicence", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TencentToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TencentToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TencentToken new_() {
        TencentToken tencentToken = new TencentToken();
        tencentToken.nullCheck();
        return tencentToken;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TencentToken mo225055clone() {
        TencentToken tencentToken = new TencentToken();
        tencentToken.faceId = this.faceId;
        tencentToken.agreementNo = this.agreementNo;
        tencentToken.appId = this.appId;
        tencentToken.nonce = this.nonce;
        tencentToken.userId = this.userId;
        tencentToken.sign = this.sign;
        tencentToken.verifyMode = this.verifyMode;
        tencentToken.keyLicence = this.keyLicence;
        return tencentToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TencentToken)) {
            return false;
        }
        TencentToken tencentToken = (TencentToken) obj;
        return ValueObject.util_equals(this.faceId, tencentToken.faceId) && ValueObject.util_equals(this.agreementNo, tencentToken.agreementNo) && ValueObject.util_equals(this.appId, tencentToken.appId) && ValueObject.util_equals(this.nonce, tencentToken.nonce) && ValueObject.util_equals(this.userId, tencentToken.userId) && ValueObject.util_equals(this.sign, tencentToken.sign) && ValueObject.util_equals(this.verifyMode, tencentToken.verifyMode) && ValueObject.util_equals(this.keyLicence, tencentToken.keyLicence);
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
        String str = this.faceId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.agreementNo;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.appId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.nonce;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.sign;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.verifyMode;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.keyLicence;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.faceId == null) {
            this.faceId = "";
        }
        if (this.agreementNo == null) {
            this.agreementNo = "";
        }
        if (this.appId == null) {
            this.appId = "";
        }
        if (this.nonce == null) {
            this.nonce = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.sign == null) {
            this.sign = "";
        }
        if (this.verifyMode == null) {
            this.verifyMode = "";
        }
        if (this.keyLicence == null) {
            this.keyLicence = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
