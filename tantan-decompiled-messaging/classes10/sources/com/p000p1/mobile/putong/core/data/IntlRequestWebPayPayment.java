package com.p000p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlRequestWebPayPayment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlrequestwebpaypayment";

    @NonNull
    @ProtobufIndex(index = 1)
    public String currencyCode;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String membershipType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String payType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String platform;

    @ProtobufIndex(index = 4)
    public int quantity;
    public static ProtobufAdapter<IntlRequestWebPayPayment> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlRequestWebPayPayment>() { // from class: com.p1.mobile.putong.core.data.IntlRequestWebPayPayment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlRequestWebPayPayment intlRequestWebPayPayment) {
            String str = intlRequestWebPayPayment.currencyCode;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlRequestWebPayPayment.platform;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = intlRequestWebPayPayment.payType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iH = iO + CodedOutputByteBufferNano.h(4, intlRequestWebPayPayment.quantity);
            String str4 = intlRequestWebPayPayment.membershipType;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(5, str4);
            }
            ((MessageNano) intlRequestWebPayPayment).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlRequestWebPayPayment m13675parse(nb5 nb5Var) throws IOException {
            IntlRequestWebPayPayment intlRequestWebPayPayment = new IntlRequestWebPayPayment();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    intlRequestWebPayPayment.currencyCode = nb5Var.s();
                } else if (iU == 18) {
                    intlRequestWebPayPayment.platform = nb5Var.s();
                } else if (iU == 26) {
                    intlRequestWebPayPayment.payType = nb5Var.s();
                } else if (iU == 32) {
                    intlRequestWebPayPayment.quantity = nb5Var.j();
                } else {
                    if (iU != 42) {
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
                    intlRequestWebPayPayment.membershipType = nb5Var.s();
                }
            }
            return intlRequestWebPayPayment;
        }

        public void serialize(IntlRequestWebPayPayment intlRequestWebPayPayment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlRequestWebPayPayment.currencyCode;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlRequestWebPayPayment.platform;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = intlRequestWebPayPayment.payType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.G(4, intlRequestWebPayPayment.quantity);
            String str4 = intlRequestWebPayPayment.membershipType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
        }
    };
    public static JsonAdapter<IntlRequestWebPayPayment> JSON_ADAPTER = new ObjectJsonAdapter<IntlRequestWebPayPayment>() { // from class: com.p1.mobile.putong.core.data.IntlRequestWebPayPayment.2
        public Class getDataClass() {
            return IntlRequestWebPayPayment.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlRequestWebPayPayment m13676newInstance() {
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

        public void serializeFields(IntlRequestWebPayPayment intlRequestWebPayPayment, JsonGenerator jsonGenerator) throws IOException {
            String str = intlRequestWebPayPayment.currencyCode;
            if (str != null) {
                jsonGenerator.writeStringField("currencyCode", str);
            }
            String str2 = intlRequestWebPayPayment.platform;
            if (str2 != null) {
                jsonGenerator.writeStringField("platform", str2);
            }
            String str3 = intlRequestWebPayPayment.payType;
            if (str3 != null) {
                jsonGenerator.writeStringField("payType", str3);
            }
            jsonGenerator.writeNumberField("quantity", intlRequestWebPayPayment.quantity);
            String str4 = intlRequestWebPayPayment.membershipType;
            if (str4 != null) {
                jsonGenerator.writeStringField("membershipType", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlRequestWebPayPayment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlRequestWebPayPayment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlRequestWebPayPayment new_() {
        IntlRequestWebPayPayment intlRequestWebPayPayment = new IntlRequestWebPayPayment();
        intlRequestWebPayPayment.nullCheck();
        return intlRequestWebPayPayment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlRequestWebPayPayment m13674clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
