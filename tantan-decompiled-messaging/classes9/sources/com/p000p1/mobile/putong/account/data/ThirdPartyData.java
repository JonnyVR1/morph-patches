package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ThirdPartyData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartydata";

    @NonNull
    @ProtobufIndex(index = CameraSticker.STATE_ERROR)
    public String email;

    @NonNull
    @ProtobufIndex(index = CameraSticker.STATE_COMPLETE)
    public String grantType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String thirdPartyId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String thirdPartyToken;
    public static ProtobufAdapter<ThirdPartyData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartyData>() { // from class: com.p1.mobile.putong.account.data.ThirdPartyData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ThirdPartyData thirdPartyData) {
            String str = thirdPartyData.thirdPartyId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = thirdPartyData.thirdPartyToken;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = thirdPartyData.grantType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = thirdPartyData.email;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) thirdPartyData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ThirdPartyData m28947parse(nb5 nb5Var) throws IOException {
            ThirdPartyData thirdPartyData = new ThirdPartyData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    thirdPartyData.thirdPartyId = nb5Var.s();
                } else if (iU == 18) {
                    thirdPartyData.thirdPartyToken = nb5Var.s();
                } else if (iU == 26) {
                    thirdPartyData.grantType = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    thirdPartyData.email = nb5Var.s();
                }
            }
            return thirdPartyData;
        }

        public void serialize(ThirdPartyData thirdPartyData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thirdPartyData.thirdPartyId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = thirdPartyData.thirdPartyToken;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = thirdPartyData.grantType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = thirdPartyData.email;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<ThirdPartyData> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartyData>() { // from class: com.p1.mobile.putong.account.data.ThirdPartyData.2
        public Class getDataClass() {
            return ThirdPartyData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ThirdPartyData m28948newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartyData new_() {
        ThirdPartyData thirdPartyData = new ThirdPartyData();
        thirdPartyData.nullCheck();
        return thirdPartyData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ThirdPartyData m28946clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
