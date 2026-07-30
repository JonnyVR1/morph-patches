package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IntlInnerWebPay;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class IntlInnerWebPay extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlinnerwebpay";

    /* JADX INFO: renamed from: android, reason: collision with root package name */
    @ProtobufIndex(index = 1)
    public boolean f211037android;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> reverse_mcc;
    public static ProtobufAdapter<IntlInnerWebPay> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlInnerWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPay.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlInnerWebPay intlInnerWebPay) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, intlInnerWebPay.f211037android);
            List<String> list = intlInnerWebPay.reverse_mcc;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            intlInnerWebPay.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlInnerWebPay parse(nc5 nc5Var) throws IOException {
            IntlInnerWebPay intlInnerWebPay = new IntlInnerWebPay();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlInnerWebPay.reverse_mcc != null) {
                        break;
                    }
                    intlInnerWebPay.reverse_mcc = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    intlInnerWebPay.f211037android = nc5Var.m162483g();
                } else {
                    if (iM162497u != 18) {
                        if (intlInnerWebPay.reverse_mcc != null) {
                            break;
                        }
                        intlInnerWebPay.reverse_mcc = new ArrayList();
                        return intlInnerWebPay;
                    }
                    intlInnerWebPay.reverse_mcc = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlInnerWebPay;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlInnerWebPay intlInnerWebPay, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, intlInnerWebPay.f211037android);
            List<String> list = intlInnerWebPay.reverse_mcc;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlInnerWebPay> JSON_ADAPTER = new ObjectJsonAdapter<IntlInnerWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPay.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlInnerWebPay.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlInnerWebPay newInstance() {
            return new IntlInnerWebPay();
        }

        public boolean parseField(IntlInnerWebPay intlInnerWebPay, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("android")) {
                intlInnerWebPay.f211037android = jsonParser.getValueAsBoolean();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlInnerWebPay intlInnerWebPay, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("android", intlInnerWebPay.f211037android);
            if (intlInnerWebPay.reverse_mcc != null) {
                jsonGenerator.writeFieldName("reverse_mcc");
                JsonAdapter.serializeArray(intlInnerWebPay.reverse_mcc, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlInnerWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlInnerWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36620a(String str) {
        return str;
    }

    public static IntlInnerWebPay new_() {
        IntlInnerWebPay intlInnerWebPay = new IntlInnerWebPay();
        intlInnerWebPay.nullCheck();
        return intlInnerWebPay;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlInnerWebPay mo225055clone() {
        IntlInnerWebPay intlInnerWebPay = new IntlInnerWebPay();
        intlInnerWebPay.f211037android = this.f211037android;
        List<String> list = this.reverse_mcc;
        if (list != null) {
            intlInnerWebPay.reverse_mcc = ValueObject.util_map(list, new qcj() { // from class: l.jrn
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlInnerWebPay.m36620a((String) obj);
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
        return this.f211037android == intlInnerWebPay.f211037android && ValueObject.util_equals(this.reverse_mcc, intlInnerWebPay.reverse_mcc);
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
        int i2 = ((i * 41) + (this.f211037android ? 1231 : 1237)) * 41;
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
