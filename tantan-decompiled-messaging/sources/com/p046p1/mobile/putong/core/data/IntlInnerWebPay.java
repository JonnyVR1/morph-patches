package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.IntlInnerWebPay;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class IntlInnerWebPay extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlinnerwebpay";

    /* JADX INFO: renamed from: android, reason: collision with root package name */
    @ProtobufIndex(index = 1)
    public boolean f210115android;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> reverse_mcc;
    public static ProtobufAdapter<IntlInnerWebPay> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlInnerWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPay.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlInnerWebPay intlInnerWebPay) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, intlInnerWebPay.f210115android);
            List<String> list = intlInnerWebPay.reverse_mcc;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            intlInnerWebPay.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlInnerWebPay parse(nb5 nb5Var) throws IOException {
            IntlInnerWebPay intlInnerWebPay = new IntlInnerWebPay();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlInnerWebPay.reverse_mcc != null) {
                        break;
                    }
                    intlInnerWebPay.reverse_mcc = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    intlInnerWebPay.f210115android = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (intlInnerWebPay.reverse_mcc != null) {
                            break;
                        }
                        intlInnerWebPay.reverse_mcc = new ArrayList();
                        return intlInnerWebPay;
                    }
                    intlInnerWebPay.reverse_mcc = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlInnerWebPay;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlInnerWebPay intlInnerWebPay, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, intlInnerWebPay.f210115android);
            List<String> list = intlInnerWebPay.reverse_mcc;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlInnerWebPay> JSON_ADAPTER = new ObjectJsonAdapter<IntlInnerWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPay.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlInnerWebPay.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlInnerWebPay newInstance() {
            return new IntlInnerWebPay();
        }

        public boolean parseField(IntlInnerWebPay intlInnerWebPay, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("android")) {
                intlInnerWebPay.f210115android = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("reverse_mcc")) {
                return false;
            }
            intlInnerWebPay.reverse_mcc = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlInnerWebPay intlInnerWebPay, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("android") || str.equals("reverse_mcc")) {
                return true;
            }
            return super.parseFieldCheck(intlInnerWebPay, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlInnerWebPay intlInnerWebPay, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("android", intlInnerWebPay.f210115android);
            if (intlInnerWebPay.reverse_mcc != null) {
                jsonGenerator.writeFieldName("reverse_mcc");
                JsonAdapter.serializeArray(intlInnerWebPay.reverse_mcc, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlInnerWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlInnerWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35617a(String str) {
        return str;
    }

    public static IntlInnerWebPay new_() {
        IntlInnerWebPay intlInnerWebPay = new IntlInnerWebPay();
        intlInnerWebPay.nullCheck();
        return intlInnerWebPay;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlInnerWebPay mo223809clone() {
        IntlInnerWebPay intlInnerWebPay = new IntlInnerWebPay();
        intlInnerWebPay.f210115android = this.f210115android;
        List<String> list = this.reverse_mcc;
        if (list != null) {
            intlInnerWebPay.reverse_mcc = ValueObject.util_map(list, new w9j() { // from class: l.jpn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlInnerWebPay.m35617a((String) obj);
                }
            });
        }
        return intlInnerWebPay;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlInnerWebPay)) {
            return false;
        }
        IntlInnerWebPay intlInnerWebPay = (IntlInnerWebPay) obj;
        return this.f210115android == intlInnerWebPay.f210115android && ValueObject.util_equals(this.reverse_mcc, intlInnerWebPay.reverse_mcc);
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
        int i2 = ((i * 41) + (this.f210115android ? 1231 : 1237)) * 41;
        List<String> list = this.reverse_mcc;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.reverse_mcc == null) {
            this.reverse_mcc = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
