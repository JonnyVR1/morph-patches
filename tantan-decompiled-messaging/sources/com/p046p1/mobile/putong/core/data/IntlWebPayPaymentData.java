package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class IntlWebPayPaymentData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlwebpaypaymentdata";

    @ProtobufIndex(index = 4)
    public boolean hardwareAccelerated;

    @ProtobufIndex(index = 1)
    public boolean hideNavigationBar;

    @ProtobufIndex(index = 5)
    public boolean isUseMkWebView;

    @NonNull
    @ProtobufIndex(index = 2)
    public String paymentRequest;

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;
    public static ProtobufAdapter<IntlWebPayPaymentData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlWebPayPaymentData>() { // from class: com.p1.mobile.putong.core.data.IntlWebPayPaymentData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlWebPayPaymentData intlWebPayPaymentData) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, intlWebPayPaymentData.hideNavigationBar);
            String str = intlWebPayPaymentData.paymentRequest;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = intlWebPayPaymentData.text;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(4, intlWebPayPaymentData.hardwareAccelerated) + CodedOutputByteBufferNano.m17220b(5, intlWebPayPaymentData.isUseMkWebView);
            intlWebPayPaymentData.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlWebPayPaymentData parse(nb5 nb5Var) throws IOException {
            IntlWebPayPaymentData intlWebPayPaymentData = new IntlWebPayPaymentData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlWebPayPaymentData.paymentRequest == null) {
                        intlWebPayPaymentData.paymentRequest = "";
                    }
                    if (intlWebPayPaymentData.text != null) {
                        break;
                    }
                    intlWebPayPaymentData.text = "";
                    break;
                }
                if (iM158752u == 8) {
                    intlWebPayPaymentData.hideNavigationBar = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    intlWebPayPaymentData.paymentRequest = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    intlWebPayPaymentData.text = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    intlWebPayPaymentData.hardwareAccelerated = nb5Var.m158738g();
                } else {
                    if (iM158752u != 40) {
                        if (intlWebPayPaymentData.paymentRequest == null) {
                            intlWebPayPaymentData.paymentRequest = "";
                        }
                        if (intlWebPayPaymentData.text != null) {
                            break;
                        }
                        intlWebPayPaymentData.text = "";
                        return intlWebPayPaymentData;
                    }
                    intlWebPayPaymentData.isUseMkWebView = nb5Var.m158738g();
                }
            }
            return intlWebPayPaymentData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlWebPayPaymentData intlWebPayPaymentData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, intlWebPayPaymentData.hideNavigationBar);
            String str = intlWebPayPaymentData.paymentRequest;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = intlWebPayPaymentData.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17244A(4, intlWebPayPaymentData.hardwareAccelerated);
            codedOutputByteBufferNano.m17244A(5, intlWebPayPaymentData.isUseMkWebView);
        }
    };
    public static JsonAdapter<IntlWebPayPaymentData> JSON_ADAPTER = new ObjectJsonAdapter<IntlWebPayPaymentData>() { // from class: com.p1.mobile.putong.core.data.IntlWebPayPaymentData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlWebPayPaymentData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlWebPayPaymentData newInstance() {
            return new IntlWebPayPaymentData();
        }

        public boolean parseField(IntlWebPayPaymentData intlWebPayPaymentData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hideNavigationBar":
                    intlWebPayPaymentData.hideNavigationBar = jsonParser.getValueAsBoolean();
                    return true;
                case "text":
                    intlWebPayPaymentData.text = jsonParser.getValueAsString();
                    return true;
                case "paymentRequest":
                    intlWebPayPaymentData.paymentRequest = jsonParser.getValueAsString();
                    return true;
                case "hardwareAccelerated":
                    intlWebPayPaymentData.hardwareAccelerated = jsonParser.getValueAsBoolean();
                    return true;
                case "isUseMkWebView":
                    intlWebPayPaymentData.isUseMkWebView = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlWebPayPaymentData intlWebPayPaymentData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hideNavigationBar":
                case "text":
                case "paymentRequest":
                case "hardwareAccelerated":
                case "isUseMkWebView":
                    return true;
                default:
                    return super.parseFieldCheck(intlWebPayPaymentData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlWebPayPaymentData intlWebPayPaymentData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hideNavigationBar", intlWebPayPaymentData.hideNavigationBar);
            String str = intlWebPayPaymentData.paymentRequest;
            if (str != null) {
                jsonGenerator.writeStringField("paymentRequest", str);
            }
            String str2 = intlWebPayPaymentData.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeBooleanField("hardwareAccelerated", intlWebPayPaymentData.hardwareAccelerated);
            jsonGenerator.writeBooleanField("isUseMkWebView", intlWebPayPaymentData.isUseMkWebView);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlWebPayPaymentData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlWebPayPaymentData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlWebPayPaymentData new_() {
        IntlWebPayPaymentData intlWebPayPaymentData = new IntlWebPayPaymentData();
        intlWebPayPaymentData.nullCheck();
        return intlWebPayPaymentData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlWebPayPaymentData mo223809clone() {
        IntlWebPayPaymentData intlWebPayPaymentData = new IntlWebPayPaymentData();
        intlWebPayPaymentData.hideNavigationBar = this.hideNavigationBar;
        intlWebPayPaymentData.paymentRequest = this.paymentRequest;
        intlWebPayPaymentData.text = this.text;
        intlWebPayPaymentData.hardwareAccelerated = this.hardwareAccelerated;
        intlWebPayPaymentData.isUseMkWebView = this.isUseMkWebView;
        return intlWebPayPaymentData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlWebPayPaymentData)) {
            return false;
        }
        IntlWebPayPaymentData intlWebPayPaymentData = (IntlWebPayPaymentData) obj;
        return this.hideNavigationBar == intlWebPayPaymentData.hideNavigationBar && ValueObject.util_equals(this.paymentRequest, intlWebPayPaymentData.paymentRequest) && ValueObject.util_equals(this.text, intlWebPayPaymentData.text) && this.hardwareAccelerated == intlWebPayPaymentData.hardwareAccelerated && this.isUseMkWebView == intlWebPayPaymentData.isUseMkWebView;
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
        int i2 = ((i * 41) + (this.hideNavigationBar ? 1231 : 1237)) * 41;
        String str = this.paymentRequest;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.hardwareAccelerated ? 1231 : 1237)) * 41) + (this.isUseMkWebView ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.paymentRequest == null) {
            this.paymentRequest = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
