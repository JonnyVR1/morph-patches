package com.p046p1.mobile.putong.account.data;

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

/* JADX INFO: loaded from: classes9.dex */
public class ThirdPartyData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartydata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String email;

    @NonNull
    @ProtobufIndex(index = 3)
    public String grantType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String thirdPartyId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String thirdPartyToken;
    public static ProtobufAdapter<ThirdPartyData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartyData>() { // from class: com.p1.mobile.putong.account.data.ThirdPartyData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThirdPartyData thirdPartyData) {
            String str = thirdPartyData.thirdPartyId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = thirdPartyData.thirdPartyToken;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = thirdPartyData.grantType;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = thirdPartyData.email;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            thirdPartyData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThirdPartyData parse(nb5 nb5Var) throws IOException {
            ThirdPartyData thirdPartyData = new ThirdPartyData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (thirdPartyData.thirdPartyId == null) {
                        thirdPartyData.thirdPartyId = "";
                    }
                    if (thirdPartyData.thirdPartyToken == null) {
                        thirdPartyData.thirdPartyToken = "";
                    }
                    if (thirdPartyData.grantType == null) {
                        thirdPartyData.grantType = "";
                    }
                    if (thirdPartyData.email != null) {
                        break;
                    }
                    thirdPartyData.email = "";
                    break;
                }
                if (iM158752u == 10) {
                    thirdPartyData.thirdPartyId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    thirdPartyData.thirdPartyToken = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    thirdPartyData.grantType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (thirdPartyData.thirdPartyId == null) {
                            thirdPartyData.thirdPartyId = "";
                        }
                        if (thirdPartyData.thirdPartyToken == null) {
                            thirdPartyData.thirdPartyToken = "";
                        }
                        if (thirdPartyData.grantType == null) {
                            thirdPartyData.grantType = "";
                        }
                        if (thirdPartyData.email != null) {
                            break;
                        }
                        thirdPartyData.email = "";
                        return thirdPartyData;
                    }
                    thirdPartyData.email = nb5Var.m158750s();
                }
            }
            return thirdPartyData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThirdPartyData thirdPartyData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thirdPartyData.thirdPartyId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = thirdPartyData.thirdPartyToken;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = thirdPartyData.grantType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = thirdPartyData.email;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<ThirdPartyData> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartyData>() { // from class: com.p1.mobile.putong.account.data.ThirdPartyData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThirdPartyData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThirdPartyData newInstance() {
            return new ThirdPartyData();
        }

        public boolean parseField(ThirdPartyData thirdPartyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "grantType":
                    thirdPartyData.grantType = jsonParser.getValueAsString();
                    return true;
                case "thirdPartyId":
                    thirdPartyData.thirdPartyId = jsonParser.getValueAsString();
                    return true;
                case "email":
                    thirdPartyData.email = jsonParser.getValueAsString();
                    return true;
                case "thirdPartyToken":
                    thirdPartyData.thirdPartyToken = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ThirdPartyData thirdPartyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "grantType":
                case "thirdPartyId":
                case "email":
                case "thirdPartyToken":
                    return true;
                default:
                    return super.parseFieldCheck(thirdPartyData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThirdPartyData thirdPartyData, JsonGenerator jsonGenerator) throws IOException {
            String str = thirdPartyData.thirdPartyId;
            if (str != null) {
                jsonGenerator.writeStringField("thirdPartyId", str);
            }
            String str2 = thirdPartyData.thirdPartyToken;
            if (str2 != null) {
                jsonGenerator.writeStringField("thirdPartyToken", str2);
            }
            String str3 = thirdPartyData.grantType;
            if (str3 != null) {
                jsonGenerator.writeStringField("grantType", str3);
            }
            String str4 = thirdPartyData.email;
            if (str4 != null) {
                jsonGenerator.writeStringField("email", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartyData new_() {
        ThirdPartyData thirdPartyData = new ThirdPartyData();
        thirdPartyData.nullCheck();
        return thirdPartyData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThirdPartyData mo223809clone() {
        ThirdPartyData thirdPartyData = new ThirdPartyData();
        thirdPartyData.thirdPartyId = this.thirdPartyId;
        thirdPartyData.thirdPartyToken = this.thirdPartyToken;
        thirdPartyData.grantType = this.grantType;
        thirdPartyData.email = this.email;
        return thirdPartyData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdPartyData)) {
            return false;
        }
        ThirdPartyData thirdPartyData = (ThirdPartyData) obj;
        return ValueObject.util_equals(this.thirdPartyId, thirdPartyData.thirdPartyId) && ValueObject.util_equals(this.thirdPartyToken, thirdPartyData.thirdPartyToken) && ValueObject.util_equals(this.grantType, thirdPartyData.grantType) && ValueObject.util_equals(this.email, thirdPartyData.email);
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
        String str = this.thirdPartyId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.thirdPartyToken;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.grantType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.email;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.thirdPartyId == null) {
            this.thirdPartyId = "";
        }
        if (this.thirdPartyToken == null) {
            this.thirdPartyToken = "";
        }
        if (this.grantType == null) {
            this.grantType = "";
        }
        if (this.email == null) {
            this.email = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
