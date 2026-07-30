package com.p000p1.mobile.putong.core.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntlWebPay;
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
public class IntlWebPay extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlwebpay";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> intlWebPayBlackList;

    @ProtobufIndex(index = 1)
    public boolean intlWebPayValid;
    public static ProtobufAdapter<IntlWebPay> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlWebPay.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlWebPay intlWebPay) {
            int iB = CodedOutputByteBufferNano.b(1, intlWebPay.intlWebPayValid);
            List<String> list = intlWebPay.intlWebPayBlackList;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) intlWebPay).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlWebPay m13731parse(nb5 nb5Var) throws IOException {
            IntlWebPay intlWebPay = new IntlWebPay();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlWebPay.intlWebPayBlackList != null) {
                        break;
                    }
                    intlWebPay.intlWebPayBlackList = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    intlWebPay.intlWebPayValid = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (intlWebPay.intlWebPayBlackList != null) {
                            break;
                        }
                        intlWebPay.intlWebPayBlackList = new ArrayList();
                        return intlWebPay;
                    }
                    intlWebPay.intlWebPayBlackList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlWebPay;
        }

        public void serialize(IntlWebPay intlWebPay, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, intlWebPay.intlWebPayValid);
            List<String> list = intlWebPay.intlWebPayBlackList;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlWebPay> JSON_ADAPTER = new ObjectJsonAdapter<IntlWebPay>() { // from class: com.p1.mobile.putong.core.data.IntlWebPay.2
        public Class getDataClass() {
            return IntlWebPay.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlWebPay m13732newInstance() {
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

        public void serializeFields(IntlWebPay intlWebPay, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("intlWebPayValid", intlWebPay.intlWebPayValid);
            if (intlWebPay.intlWebPayBlackList != null) {
                jsonGenerator.writeFieldName("intlWebPayBlackList");
                JsonAdapter.serializeArray(intlWebPay.intlWebPayBlackList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlWebPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m432a(String str) {
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
        IntlWebPay intlWebPay = (IntlWebPay) JSON_ADAPTER.parse(str);
        intlWebPay.nullCheck();
        return intlWebPay;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlWebPay m13730clone() {
        IntlWebPay intlWebPay = new IntlWebPay();
        intlWebPay.intlWebPayValid = this.intlWebPayValid;
        List<String> list = this.intlWebPayBlackList;
        if (list != null) {
            intlWebPay.intlWebPayBlackList = ValueObject.util_map(list, new w9j() { // from class: l.yvp
                public final Object call(Object obj) {
                    return IntlWebPay.m432a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.intlWebPayValid ? 1231 : 1237)) * 41;
        List<String> list = this.intlWebPayBlackList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.intlWebPayBlackList == null) {
            this.intlWebPayBlackList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
