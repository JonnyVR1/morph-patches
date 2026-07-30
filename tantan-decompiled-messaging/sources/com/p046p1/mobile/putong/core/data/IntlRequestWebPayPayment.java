package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes10.dex */
public class IntlRequestWebPayPayment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlrequestwebpaypayment";

    @NonNull
    @ProtobufIndex(index = 1)
    public String currencyCode;

    @NonNull
    @ProtobufIndex(index = 5)
    public String membershipType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String payType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String platform;

    @ProtobufIndex(index = 4)
    public int quantity;
    public static ProtobufAdapter<IntlRequestWebPayPayment> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlRequestWebPayPayment>() { // from class: com.p1.mobile.putong.core.data.IntlRequestWebPayPayment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlRequestWebPayPayment intlRequestWebPayPayment) {
            String str = intlRequestWebPayPayment.currencyCode;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = intlRequestWebPayPayment.platform;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = intlRequestWebPayPayment.payType;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(4, intlRequestWebPayPayment.quantity);
            String str4 = intlRequestWebPayPayment.membershipType;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            intlRequestWebPayPayment.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlRequestWebPayPayment parse(nb5 nb5Var) throws IOException {
            IntlRequestWebPayPayment intlRequestWebPayPayment = new IntlRequestWebPayPayment();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlRequestWebPayPayment.currencyCode == null) {
                        intlRequestWebPayPayment.currencyCode = "";
                    }
                    if (intlRequestWebPayPayment.platform == null) {
                        intlRequestWebPayPayment.platform = "";
                    }
                    if (intlRequestWebPayPayment.payType == null) {
                        intlRequestWebPayPayment.payType = "";
                    }
                    if (intlRequestWebPayPayment.membershipType != null) {
                        break;
                    }
                    intlRequestWebPayPayment.membershipType = "";
                    break;
                }
                if (iM158752u == 10) {
                    intlRequestWebPayPayment.currencyCode = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    intlRequestWebPayPayment.platform = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    intlRequestWebPayPayment.payType = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    intlRequestWebPayPayment.quantity = nb5Var.m158741j();
                } else {
                    if (iM158752u != 42) {
                        if (intlRequestWebPayPayment.currencyCode == null) {
                            intlRequestWebPayPayment.currencyCode = "";
                        }
                        if (intlRequestWebPayPayment.platform == null) {
                            intlRequestWebPayPayment.platform = "";
                        }
                        if (intlRequestWebPayPayment.payType == null) {
                            intlRequestWebPayPayment.payType = "";
                        }
                        if (intlRequestWebPayPayment.membershipType != null) {
                            break;
                        }
                        intlRequestWebPayPayment.membershipType = "";
                        return intlRequestWebPayPayment;
                    }
                    intlRequestWebPayPayment.membershipType = nb5Var.m158750s();
                }
            }
            return intlRequestWebPayPayment;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlRequestWebPayPayment intlRequestWebPayPayment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlRequestWebPayPayment.currencyCode;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = intlRequestWebPayPayment.platform;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = intlRequestWebPayPayment.payType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17250G(4, intlRequestWebPayPayment.quantity);
            String str4 = intlRequestWebPayPayment.membershipType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
        }
    };
    public static JsonAdapter<IntlRequestWebPayPayment> JSON_ADAPTER = new ObjectJsonAdapter<IntlRequestWebPayPayment>() { // from class: com.p1.mobile.putong.core.data.IntlRequestWebPayPayment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlRequestWebPayPayment.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlRequestWebPayPayment newInstance() {
            return new IntlRequestWebPayPayment();
        }

        public boolean parseField(IntlRequestWebPayPayment intlRequestWebPayPayment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "quantity":
                    intlRequestWebPayPayment.quantity = jsonParser.getValueAsInt();
                    return true;
                case "payType":
                    intlRequestWebPayPayment.payType = jsonParser.getValueAsString();
                    return true;
                case "membershipType":
                    intlRequestWebPayPayment.membershipType = jsonParser.getValueAsString();
                    return true;
                case "currencyCode":
                    intlRequestWebPayPayment.currencyCode = jsonParser.getValueAsString();
                    return true;
                case "platform":
                    intlRequestWebPayPayment.platform = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlRequestWebPayPayment intlRequestWebPayPayment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "quantity":
                case "payType":
                case "membershipType":
                case "currencyCode":
                case "platform":
                    return true;
                default:
                    return super.parseFieldCheck(intlRequestWebPayPayment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlRequestWebPayPayment intlRequestWebPayPayment, JsonGenerator jsonGenerator) throws IOException {
            String str = intlRequestWebPayPayment.currencyCode;
            if (str != null) {
                jsonGenerator.writeStringField(AppsFlyerProperties.CURRENCY_CODE, str);
            }
            String str2 = intlRequestWebPayPayment.platform;
            if (str2 != null) {
                jsonGenerator.writeStringField("platform", str2);
            }
            String str3 = intlRequestWebPayPayment.payType;
            if (str3 != null) {
                jsonGenerator.writeStringField("payType", str3);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.QUANTITY, intlRequestWebPayPayment.quantity);
            String str4 = intlRequestWebPayPayment.membershipType;
            if (str4 != null) {
                jsonGenerator.writeStringField("membershipType", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlRequestWebPayPayment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlRequestWebPayPayment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlRequestWebPayPayment new_() {
        IntlRequestWebPayPayment intlRequestWebPayPayment = new IntlRequestWebPayPayment();
        intlRequestWebPayPayment.nullCheck();
        return intlRequestWebPayPayment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlRequestWebPayPayment mo223809clone() {
        IntlRequestWebPayPayment intlRequestWebPayPayment = new IntlRequestWebPayPayment();
        intlRequestWebPayPayment.currencyCode = this.currencyCode;
        intlRequestWebPayPayment.platform = this.platform;
        intlRequestWebPayPayment.payType = this.payType;
        intlRequestWebPayPayment.quantity = this.quantity;
        intlRequestWebPayPayment.membershipType = this.membershipType;
        return intlRequestWebPayPayment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlRequestWebPayPayment)) {
            return false;
        }
        IntlRequestWebPayPayment intlRequestWebPayPayment = (IntlRequestWebPayPayment) obj;
        return ValueObject.util_equals(this.currencyCode, intlRequestWebPayPayment.currencyCode) && ValueObject.util_equals(this.platform, intlRequestWebPayPayment.platform) && ValueObject.util_equals(this.payType, intlRequestWebPayPayment.payType) && this.quantity == intlRequestWebPayPayment.quantity && ValueObject.util_equals(this.membershipType, intlRequestWebPayPayment.membershipType);
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
        String str = this.currencyCode;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.platform;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.payType;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.quantity) * 41;
        String str4 = this.membershipType;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.currencyCode == null) {
            this.currencyCode = "";
        }
        if (this.platform == null) {
            this.platform = "";
        }
        if (this.payType == null) {
            this.payType = "";
        }
        if (this.membershipType == null) {
            this.membershipType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
