package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class MobileRespInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mobilerespinfo";

    @NonNull
    @ProtobufIndex(index = 8)
    public String accessCode;

    @ProtobufIndex(index = 6)
    public boolean failForNetwork;

    @ProtobufIndex(index = 5)
    public boolean failed;

    @NonNull
    @ProtobufIndex(index = 1)
    public SignInGrantType grantType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mobileNumber;

    @NonNull
    @ProtobufIndex(index = 3)
    public String openId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String token;
    public static ProtobufAdapter<MobileRespInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MobileRespInfo>() { // from class: com.p1.mobile.putong.data.MobileRespInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MobileRespInfo mobileRespInfo) {
            SignInGrantType signInGrantType = mobileRespInfo.grantType;
            int iM17226h = signInGrantType != null ? CodedOutputByteBufferNano.m17226h(1, signInGrantType.ordinal()) : 0;
            String str = mobileRespInfo.token;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = mobileRespInfo.openId;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = mobileRespInfo.mobileNumber;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(5, mobileRespInfo.failed) + CodedOutputByteBufferNano.m17220b(6, mobileRespInfo.failForNetwork);
            SignInGrantType signInGrantType2 = mobileRespInfo.grantType;
            if (signInGrantType2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(7, signInGrantType2, SignInGrantType.PROTOBUF_ADAPTER);
            }
            String str4 = mobileRespInfo.accessCode;
            if (str4 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(8, str4);
            }
            mobileRespInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MobileRespInfo parse(nb5 nb5Var) throws IOException {
            MobileRespInfo mobileRespInfo = new MobileRespInfo();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (mobileRespInfo.grantType == null && numValueOf != null) {
                        mobileRespInfo.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (mobileRespInfo.grantType == null) {
                        mobileRespInfo.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.defaultEnum();
                    }
                    if (mobileRespInfo.token == null) {
                        mobileRespInfo.token = "";
                    }
                    if (mobileRespInfo.openId == null) {
                        mobileRespInfo.openId = "";
                    }
                    if (mobileRespInfo.mobileNumber == null) {
                        mobileRespInfo.mobileNumber = "";
                    }
                    if (mobileRespInfo.accessCode != null) {
                        break;
                    }
                    mobileRespInfo.accessCode = "";
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 18) {
                    mobileRespInfo.token = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    mobileRespInfo.openId = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    mobileRespInfo.mobileNumber = nb5Var.m158750s();
                } else if (iM158752u == 40) {
                    mobileRespInfo.failed = nb5Var.m158738g();
                } else if (iM158752u == 48) {
                    mobileRespInfo.failForNetwork = nb5Var.m158738g();
                } else if (iM158752u == 58) {
                    mobileRespInfo.grantType = (SignInGrantType) nb5Var.m158743l(SignInGrantType.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 66) {
                        if (mobileRespInfo.grantType == null && numValueOf != null) {
                            mobileRespInfo.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (mobileRespInfo.grantType == null) {
                            mobileRespInfo.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.defaultEnum();
                        }
                        if (mobileRespInfo.token == null) {
                            mobileRespInfo.token = "";
                        }
                        if (mobileRespInfo.openId == null) {
                            mobileRespInfo.openId = "";
                        }
                        if (mobileRespInfo.mobileNumber == null) {
                            mobileRespInfo.mobileNumber = "";
                        }
                        if (mobileRespInfo.accessCode != null) {
                            break;
                        }
                        mobileRespInfo.accessCode = "";
                        return mobileRespInfo;
                    }
                    mobileRespInfo.accessCode = nb5Var.m158750s();
                }
            }
            return mobileRespInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MobileRespInfo mobileRespInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SignInGrantType signInGrantType = mobileRespInfo.grantType;
            if (signInGrantType != null) {
                codedOutputByteBufferNano.m17250G(1, signInGrantType.ordinal());
            }
            String str = mobileRespInfo.token;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = mobileRespInfo.openId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = mobileRespInfo.mobileNumber;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17244A(5, mobileRespInfo.failed);
            codedOutputByteBufferNano.m17244A(6, mobileRespInfo.failForNetwork);
            SignInGrantType signInGrantType2 = mobileRespInfo.grantType;
            if (signInGrantType2 != null) {
                codedOutputByteBufferNano.m17254K(7, signInGrantType2, SignInGrantType.PROTOBUF_ADAPTER);
            }
            String str4 = mobileRespInfo.accessCode;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(8, str4);
            }
        }
    };
    public static JsonAdapter<MobileRespInfo> JSON_ADAPTER = new ObjectJsonAdapter<MobileRespInfo>() { // from class: com.p1.mobile.putong.data.MobileRespInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MobileRespInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MobileRespInfo newInstance() {
            return new MobileRespInfo();
        }

        public boolean parseField(MobileRespInfo mobileRespInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "failed":
                    mobileRespInfo.failed = jsonParser.getValueAsBoolean();
                    return true;
                case "grantType":
                    mobileRespInfo.grantType = SignInGrantType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "accessCode":
                    mobileRespInfo.accessCode = jsonParser.getValueAsString();
                    return true;
                case "openId":
                    mobileRespInfo.openId = jsonParser.getValueAsString();
                    return true;
                case "token":
                    mobileRespInfo.token = jsonParser.getValueAsString();
                    return true;
                case "mobileNumber":
                    mobileRespInfo.mobileNumber = jsonParser.getValueAsString();
                    return true;
                case "failForNetwork":
                    mobileRespInfo.failForNetwork = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MobileRespInfo mobileRespInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "failed":
                case "grantType":
                case "accessCode":
                case "openId":
                case "token":
                case "mobileNumber":
                case "failForNetwork":
                    return true;
                default:
                    return super.parseFieldCheck(mobileRespInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MobileRespInfo mobileRespInfo, JsonGenerator jsonGenerator) throws IOException {
            if (mobileRespInfo.grantType != null) {
                jsonGenerator.writeFieldName("grantType");
                SignInGrantType.JSON_ADAPTER.serialize(mobileRespInfo.grantType, jsonGenerator, true);
            }
            String str = mobileRespInfo.token;
            if (str != null) {
                jsonGenerator.writeStringField("token", str);
            }
            String str2 = mobileRespInfo.openId;
            if (str2 != null) {
                jsonGenerator.writeStringField("openId", str2);
            }
            String str3 = mobileRespInfo.mobileNumber;
            if (str3 != null) {
                jsonGenerator.writeStringField("mobileNumber", str3);
            }
            jsonGenerator.writeBooleanField("failed", mobileRespInfo.failed);
            jsonGenerator.writeBooleanField("failForNetwork", mobileRespInfo.failForNetwork);
            String str4 = mobileRespInfo.accessCode;
            if (str4 != null) {
                jsonGenerator.writeStringField("accessCode", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MobileRespInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MobileRespInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MobileRespInfo new_() {
        MobileRespInfo mobileRespInfo = new MobileRespInfo();
        mobileRespInfo.nullCheck();
        return mobileRespInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MobileRespInfo mo223809clone() {
        MobileRespInfo mobileRespInfo = new MobileRespInfo();
        mobileRespInfo.grantType = this.grantType;
        mobileRespInfo.token = this.token;
        mobileRespInfo.openId = this.openId;
        mobileRespInfo.mobileNumber = this.mobileNumber;
        mobileRespInfo.failed = this.failed;
        mobileRespInfo.failForNetwork = this.failForNetwork;
        mobileRespInfo.accessCode = this.accessCode;
        return mobileRespInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MobileRespInfo)) {
            return false;
        }
        MobileRespInfo mobileRespInfo = (MobileRespInfo) obj;
        return ValueObject.util_equals(this.grantType, mobileRespInfo.grantType) && ValueObject.util_equals(this.token, mobileRespInfo.token) && ValueObject.util_equals(this.openId, mobileRespInfo.openId) && ValueObject.util_equals(this.mobileNumber, mobileRespInfo.mobileNumber) && this.failed == mobileRespInfo.failed && this.failForNetwork == mobileRespInfo.failForNetwork && ValueObject.util_equals(this.accessCode, mobileRespInfo.accessCode);
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
        SignInGrantType signInGrantType = this.grantType;
        int iHashCode = (i2 + (signInGrantType != null ? signInGrantType.hashCode() : 0)) * 41;
        String str = this.token;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.openId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.mobileNumber;
        int iHashCode4 = (((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.failed ? 1231 : 1237)) * 41) + (this.failForNetwork ? 1231 : 1237)) * 41;
        String str4 = this.accessCode;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.grantType == null) {
            this.grantType = (SignInGrantType) SignInGrantType.JSON_ADAPTER.defaultEnum();
        }
        if (this.token == null) {
            this.token = "";
        }
        if (this.openId == null) {
            this.openId = "";
        }
        if (this.mobileNumber == null) {
            this.mobileNumber = "";
        }
        if (this.accessCode == null) {
            this.accessCode = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
