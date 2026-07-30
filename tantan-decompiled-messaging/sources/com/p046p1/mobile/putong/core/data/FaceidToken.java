package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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

/* JADX INFO: loaded from: classes10.dex */
public class FaceidToken extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "faceidToken";

    @ProtobufIndex(index = 3)
    public double expiredTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String faceidToken;

    @ProtobufIndex(index = 5)
    public boolean omitLiveData;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;

    @ProtobufIndex(index = 4)
    public boolean withPV;
    public static ProtobufAdapter<FaceidToken> PROTOBUF_ADAPTER = new MessageNanoAdapter<FaceidToken>() { // from class: com.p1.mobile.putong.core.data.FaceidToken.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FaceidToken faceidToken) {
            String str = faceidToken.faceidToken;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = faceidToken.value;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(3, faceidToken.expiredTime) + CodedOutputByteBufferNano.m17220b(4, faceidToken.withPV) + CodedOutputByteBufferNano.m17220b(5, faceidToken.omitLiveData);
            faceidToken.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FaceidToken parse(nb5 nb5Var) throws IOException {
            FaceidToken faceidToken = new FaceidToken();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (faceidToken.faceidToken == null) {
                        faceidToken.faceidToken = "";
                    }
                    if (faceidToken.value != null) {
                        break;
                    }
                    faceidToken.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    faceidToken.faceidToken = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    faceidToken.value = nb5Var.m158750s();
                } else if (iM158752u == 25) {
                    faceidToken.expiredTime = nb5Var.m158739h();
                } else if (iM158752u == 32) {
                    faceidToken.withPV = nb5Var.m158738g();
                } else {
                    if (iM158752u != 40) {
                        if (faceidToken.faceidToken == null) {
                            faceidToken.faceidToken = "";
                        }
                        if (faceidToken.value != null) {
                            break;
                        }
                        faceidToken.value = "";
                        return faceidToken;
                    }
                    faceidToken.omitLiveData = nb5Var.m158738g();
                }
            }
            return faceidToken;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FaceidToken faceidToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = faceidToken.faceidToken;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = faceidToken.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17246C(3, faceidToken.expiredTime);
            codedOutputByteBufferNano.m17244A(4, faceidToken.withPV);
            codedOutputByteBufferNano.m17244A(5, faceidToken.omitLiveData);
        }
    };
    public static JsonAdapter<FaceidToken> JSON_ADAPTER = new ObjectJsonAdapter<FaceidToken>() { // from class: com.p1.mobile.putong.core.data.FaceidToken.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FaceidToken.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FaceidToken newInstance() {
            return new FaceidToken();
        }

        public boolean parseField(FaceidToken faceidToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "faceidToken":
                    faceidToken.faceidToken = Converter.FACEID_ID.parse(jsonParser, str2);
                    return true;
                case "withPV":
                    faceidToken.withPV = jsonParser.getValueAsBoolean();
                    return true;
                case "expiredTime":
                    faceidToken.expiredTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "value":
                    faceidToken.value = jsonParser.getValueAsString();
                    return true;
                case "omitLiveData":
                    faceidToken.omitLiveData = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FaceidToken faceidToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "faceidToken":
                case "withPV":
                case "expiredTime":
                case "value":
                case "omitLiveData":
                    return true;
                default:
                    return super.parseFieldCheck(faceidToken, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FaceidToken faceidToken, JsonGenerator jsonGenerator) throws IOException {
            if (faceidToken.faceidToken != null) {
                jsonGenerator.writeFieldName(FaceidToken.TYPE);
                Converter.FACEID_ID.serialize(faceidToken.faceidToken, jsonGenerator, true);
            }
            String str = faceidToken.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeFieldName("expiredTime");
            Converter.API_TIME.serialize(Double.valueOf(faceidToken.expiredTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("withPV", faceidToken.withPV);
            jsonGenerator.writeBooleanField("omitLiveData", faceidToken.omitLiveData);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FaceidToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FaceidToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FaceidToken new_() {
        FaceidToken faceidToken = new FaceidToken();
        faceidToken.nullCheck();
        return faceidToken;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FaceidToken mo223809clone() {
        FaceidToken faceidToken = new FaceidToken();
        faceidToken.faceidToken = this.faceidToken;
        faceidToken.value = this.value;
        faceidToken.expiredTime = this.expiredTime;
        faceidToken.withPV = this.withPV;
        faceidToken.omitLiveData = this.omitLiveData;
        return faceidToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FaceidToken)) {
            return false;
        }
        FaceidToken faceidToken = (FaceidToken) obj;
        return ValueObject.util_equals(this.faceidToken, faceidToken.faceidToken) && ValueObject.util_equals(this.value, faceidToken.value) && this.expiredTime == faceidToken.expiredTime && this.withPV == faceidToken.withPV && this.omitLiveData == faceidToken.omitLiveData;
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
        String str = this.faceidToken;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiredTime);
        int i3 = ((((((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.withPV ? 1231 : 1237)) * 41) + (this.omitLiveData ? 1231 : 1237);
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.faceidToken == null) {
            this.faceidToken = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
