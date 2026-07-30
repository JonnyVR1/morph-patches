package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntlInnerWebPay;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlInnerWebPay extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlinnerwebpay";

    @ProtobufIndex(index = 1)
    public boolean android;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> reverse_mcc;
    public static ProtobufAdapter<IntlInnerWebPay> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlInnerWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPay.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlInnerWebPay intlInnerWebPay) {
            int iB = CodedOutputByteBufferNano.b(1, intlInnerWebPay.android);
            List<String> list = intlInnerWebPay.reverse_mcc;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) intlInnerWebPay).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlInnerWebPay m13559parse(nb5 nb5Var) throws IOException {
            IntlInnerWebPay intlInnerWebPay = new IntlInnerWebPay();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlInnerWebPay.reverse_mcc != null) {
                        break;
                    }
                    intlInnerWebPay.reverse_mcc = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    intlInnerWebPay.android = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (intlInnerWebPay.reverse_mcc != null) {
                            break;
                        }
                        intlInnerWebPay.reverse_mcc = new ArrayList();
                        return intlInnerWebPay;
                    }
                    intlInnerWebPay.reverse_mcc = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlInnerWebPay;
        }

        public void serialize(IntlInnerWebPay intlInnerWebPay, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, intlInnerWebPay.android);
            List<String> list = intlInnerWebPay.reverse_mcc;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlInnerWebPay> JSON_ADAPTER = new ObjectJsonAdapter<IntlInnerWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlInnerWebPay.2
        public Class getDataClass() {
            return IntlInnerWebPay.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlInnerWebPay m13560newInstance() {
            return new IntlInnerWebPay();
        }

        public boolean parseField(IntlInnerWebPay intlInnerWebPay, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(DeviceType.android)) {
                intlInnerWebPay.android = jsonParser.getValueAsBoolean();
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
            if (str.equals(DeviceType.android) || str.equals("reverse_mcc")) {
                return true;
            }
            return super.parseFieldCheck(intlInnerWebPay, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlInnerWebPay intlInnerWebPay, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(DeviceType.android, intlInnerWebPay.android);
            if (intlInnerWebPay.reverse_mcc != null) {
                jsonGenerator.writeFieldName("reverse_mcc");
                JsonAdapter.serializeArray(intlInnerWebPay.reverse_mcc, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlInnerWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlInnerWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m419a(String str) {
        return str;
    }

    public static IntlInnerWebPay new_() {
        IntlInnerWebPay intlInnerWebPay = new IntlInnerWebPay();
        intlInnerWebPay.nullCheck();
        return intlInnerWebPay;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlInnerWebPay m13558clone() {
        IntlInnerWebPay intlInnerWebPay = new IntlInnerWebPay();
        intlInnerWebPay.android = this.android;
        List<String> list = this.reverse_mcc;
        if (list != null) {
            intlInnerWebPay.reverse_mcc = ValueObject.util_map(list, new w9j() { // from class: l.jpn
                public final Object call(Object obj) {
                    return IntlInnerWebPay.m419a((String) obj);
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
        return this.android == intlInnerWebPay.android && ValueObject.util_equals(this.reverse_mcc, intlInnerWebPay.reverse_mcc);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.android ? 1231 : 1237)) * 41;
        List<String> list = this.reverse_mcc;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.reverse_mcc == null) {
            this.reverse_mcc = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
