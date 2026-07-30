package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.AllowPayments;
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

/* JADX INFO: loaded from: classes12.dex */
public class AllowPayments extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "allowpayments";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> payments;

    @ProtobufIndex(index = 1)
    public int signup_country;
    public static ProtobufAdapter<AllowPayments> PROTOBUF_ADAPTER = new MessageNanoAdapter<AllowPayments>() { // from class: com.p1.mobile.putong.data.AllowPayments.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AllowPayments allowPayments) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, allowPayments.signup_country);
            List<String> list = allowPayments.payments;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            allowPayments.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AllowPayments parse(nb5 nb5Var) throws IOException {
            AllowPayments allowPayments = new AllowPayments();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (allowPayments.payments != null) {
                        break;
                    }
                    allowPayments.payments = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    allowPayments.signup_country = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (allowPayments.payments != null) {
                            break;
                        }
                        allowPayments.payments = new ArrayList();
                        return allowPayments;
                    }
                    allowPayments.payments = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return allowPayments;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AllowPayments allowPayments, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, allowPayments.signup_country);
            List<String> list = allowPayments.payments;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AllowPayments> JSON_ADAPTER = new ObjectJsonAdapter<AllowPayments>() { // from class: com.p1.mobile.putong.data.AllowPayments.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AllowPayments.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AllowPayments newInstance() {
            return new AllowPayments();
        }

        public boolean parseField(AllowPayments allowPayments, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("signup_country")) {
                allowPayments.signup_country = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("payments")) {
                return false;
            }
            allowPayments.payments = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AllowPayments allowPayments, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("signup_country") || str.equals("payments")) {
                return true;
            }
            return super.parseFieldCheck(allowPayments, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AllowPayments allowPayments, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("signup_country", allowPayments.signup_country);
            if (allowPayments.payments != null) {
                jsonGenerator.writeFieldName("payments");
                JsonAdapter.serializeArray(allowPayments.payments, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AllowPayments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AllowPayments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59664a(String str) {
        return str;
    }

    public static AllowPayments new_() {
        AllowPayments allowPayments = new AllowPayments();
        allowPayments.nullCheck();
        return allowPayments;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AllowPayments mo223809clone() {
        AllowPayments allowPayments = new AllowPayments();
        allowPayments.signup_country = this.signup_country;
        List<String> list = this.payments;
        if (list != null) {
            allowPayments.payments = ValueObject.util_map(list, new w9j() { // from class: l.tj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return AllowPayments.m59664a((String) obj);
                }
            });
        }
        return allowPayments;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AllowPayments)) {
            return false;
        }
        AllowPayments allowPayments = (AllowPayments) obj;
        return this.signup_country == allowPayments.signup_country && ValueObject.util_equals(this.payments, allowPayments.payments);
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
        int i2 = ((i * 41) + this.signup_country) * 41;
        List<String> list = this.payments;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.payments == null) {
            this.payments = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
