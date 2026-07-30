package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, intlWebPayPaymentData.hideNavigationBar);
            String str = intlWebPayPaymentData.paymentRequest;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = intlWebPayPaymentData.text;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(4, intlWebPayPaymentData.hardwareAccelerated) + CodedOutputByteBufferNano.m17275b(5, intlWebPayPaymentData.isUseMkWebView);
            intlWebPayPaymentData.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlWebPayPaymentData parse(nc5 nc5Var) throws IOException {
            IntlWebPayPaymentData intlWebPayPaymentData = new IntlWebPayPaymentData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlWebPayPaymentData.paymentRequest == null) {
                        intlWebPayPaymentData.paymentRequest = "";
                    }
                    if (intlWebPayPaymentData.text != null) {
                        break;
                    }
                    intlWebPayPaymentData.text = "";
                    break;
                }
                if (iM162497u == 8) {
                    intlWebPayPaymentData.hideNavigationBar = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    intlWebPayPaymentData.paymentRequest = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    intlWebPayPaymentData.text = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    intlWebPayPaymentData.hardwareAccelerated = nc5Var.m162483g();
                } else {
                    if (iM162497u != 40) {
                        if (intlWebPayPaymentData.paymentRequest == null) {
                            intlWebPayPaymentData.paymentRequest = "";
                        }
                        if (intlWebPayPaymentData.text != null) {
                            break;
                        }
                        intlWebPayPaymentData.text = "";
                        return intlWebPayPaymentData;
                    }
                    intlWebPayPaymentData.isUseMkWebView = nc5Var.m162483g();
                }
            }
            return intlWebPayPaymentData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlWebPayPaymentData intlWebPayPaymentData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, intlWebPayPaymentData.hideNavigationBar);
            String str = intlWebPayPaymentData.paymentRequest;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = intlWebPayPaymentData.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17299A(4, intlWebPayPaymentData.hardwareAccelerated);
            codedOutputByteBufferNano.m17299A(5, intlWebPayPaymentData.isUseMkWebView);
        }
    };
    public static JsonAdapter<IntlWebPayPaymentData> JSON_ADAPTER = new ObjectJsonAdapter<IntlWebPayPaymentData>() { // from class: com.p1.mobile.putong.core.data.IntlWebPayPaymentData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlWebPayPaymentData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlWebPayPaymentData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public IntlWebPayPaymentData mo225055clone() {
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
