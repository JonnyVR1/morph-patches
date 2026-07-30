package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FaceidToken extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "faceidToken";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double expiredTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String faceidToken;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean omitLiveData;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;

    @ProtobufIndex(index = 4)
    public boolean withPV;
    public static ProtobufAdapter<FaceidToken> PROTOBUF_ADAPTER = new MessageNanoAdapter<FaceidToken>() { // from class: com.p1.mobile.putong.core.data.FaceidToken.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FaceidToken faceidToken) {
            String str = faceidToken.faceidToken;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = faceidToken.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, faceidToken.expiredTime) + CodedOutputByteBufferNano.b(4, faceidToken.withPV) + CodedOutputByteBufferNano.b(5, faceidToken.omitLiveData);
            ((MessageNano) faceidToken).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FaceidToken m12701parse(nb5 nb5Var) throws IOException {
            FaceidToken faceidToken = new FaceidToken();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (faceidToken.faceidToken == null) {
                        faceidToken.faceidToken = "";
                    }
                    if (faceidToken.value != null) {
                        break;
                    }
                    faceidToken.value = "";
                    break;
                }
                if (iU == 10) {
                    faceidToken.faceidToken = nb5Var.s();
                } else if (iU == 18) {
                    faceidToken.value = nb5Var.s();
                } else if (iU == 25) {
                    faceidToken.expiredTime = nb5Var.h();
                } else if (iU == 32) {
                    faceidToken.withPV = nb5Var.g();
                } else {
                    if (iU != 40) {
                        if (faceidToken.faceidToken == null) {
                            faceidToken.faceidToken = "";
                        }
                        if (faceidToken.value != null) {
                            break;
                        }
                        faceidToken.value = "";
                        return faceidToken;
                    }
                    faceidToken.omitLiveData = nb5Var.g();
                }
            }
            return faceidToken;
        }

        public void serialize(FaceidToken faceidToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = faceidToken.faceidToken;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = faceidToken.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.C(3, faceidToken.expiredTime);
            codedOutputByteBufferNano.A(4, faceidToken.withPV);
            codedOutputByteBufferNano.A(5, faceidToken.omitLiveData);
        }
    };
    public static JsonAdapter<FaceidToken> JSON_ADAPTER = new ObjectJsonAdapter<FaceidToken>() { // from class: com.p1.mobile.putong.core.data.FaceidToken.2
        public Class getDataClass() {
            return FaceidToken.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FaceidToken m12702newInstance() {
            return new FaceidToken();
        }

        public boolean parseField(FaceidToken faceidToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "faceidToken":
                    faceidToken.faceidToken = (String) Converter.FACEID_ID.parse(jsonParser, str2);
                    return true;
                case "withPV":
                    faceidToken.withPV = jsonParser.getValueAsBoolean();
                    return true;
                case "expiredTime":
                    faceidToken.expiredTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FaceidToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FaceidToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FaceidToken new_() {
        FaceidToken faceidToken = new FaceidToken();
        faceidToken.nullCheck();
        return faceidToken;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FaceidToken m12700clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.faceidToken == null) {
            this.faceidToken = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
