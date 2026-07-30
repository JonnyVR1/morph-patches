package com.p046p1.mobile.putong.core.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.IntlWebPay;
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
public class IntlWebPay extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlwebpay";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> intlWebPayBlackList;

    @ProtobufIndex(index = 1)
    public boolean intlWebPayValid;
    public static ProtobufAdapter<IntlWebPay> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlWebPay.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlWebPay intlWebPay) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, intlWebPay.intlWebPayValid);
            List<String> list = intlWebPay.intlWebPayBlackList;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            intlWebPay.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlWebPay parse(nb5 nb5Var) throws IOException {
            IntlWebPay intlWebPay = new IntlWebPay();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlWebPay.intlWebPayBlackList != null) {
                        break;
                    }
                    intlWebPay.intlWebPayBlackList = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    intlWebPay.intlWebPayValid = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (intlWebPay.intlWebPayBlackList != null) {
                            break;
                        }
                        intlWebPay.intlWebPayBlackList = new ArrayList();
                        return intlWebPay;
                    }
                    intlWebPay.intlWebPayBlackList = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlWebPay;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlWebPay intlWebPay, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, intlWebPay.intlWebPayValid);
            List<String> list = intlWebPay.intlWebPayBlackList;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlWebPay> JSON_ADAPTER = new ObjectJsonAdapter<IntlWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlWebPay.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlWebPay.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlWebPay newInstance() {
            return new IntlWebPay();
        }

        public boolean parseField(IntlWebPay intlWebPay, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("intlWebPayBlackList")) {
                intlWebPay.intlWebPayBlackList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("intlWebPayValid")) {
                return false;
            }
            intlWebPay.intlWebPayValid = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(IntlWebPay intlWebPay, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("intlWebPayBlackList") || str.equals("intlWebPayValid")) {
                return true;
            }
            return super.parseFieldCheck(intlWebPay, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlWebPay intlWebPay, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("intlWebPayValid", intlWebPay.intlWebPayValid);
            if (intlWebPay.intlWebPayBlackList != null) {
                jsonGenerator.writeFieldName("intlWebPayBlackList");
                JsonAdapter.serializeArray(intlWebPay.intlWebPayBlackList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35630a(String str) {
        return str;
    }

    public static IntlWebPay new_() {
        IntlWebPay intlWebPay = new IntlWebPay();
        intlWebPay.nullCheck();
        return intlWebPay;
    }

    public static IntlWebPay parse(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return new_();
        }
        IntlWebPay intlWebPay = JSON_ADAPTER.parse(str);
        intlWebPay.nullCheck();
        return intlWebPay;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlWebPay mo223809clone() {
        IntlWebPay intlWebPay = new IntlWebPay();
        intlWebPay.intlWebPayValid = this.intlWebPayValid;
        List<String> list = this.intlWebPayBlackList;
        if (list != null) {
            intlWebPay.intlWebPayBlackList = ValueObject.util_map(list, new w9j() { // from class: l.yvp
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlWebPay.m35630a((String) obj);
                }
            });
        }
        return intlWebPay;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlWebPay)) {
            return false;
        }
        IntlWebPay intlWebPay = (IntlWebPay) obj;
        return this.intlWebPayValid == intlWebPay.intlWebPayValid && ValueObject.util_equals(this.intlWebPayBlackList, intlWebPay.intlWebPayBlackList);
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
        int i2 = ((i * 41) + (this.intlWebPayValid ? 1231 : 1237)) * 41;
        List<String> list = this.intlWebPayBlackList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.intlWebPayBlackList == null) {
            this.intlWebPayBlackList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
