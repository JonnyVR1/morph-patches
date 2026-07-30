package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.H5PaymentChannels;
import com.p046p1.mobile.putong.data.SchemeKey;
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
public class H5PaymentChannels extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5paymentchannels";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> categories;

    @NonNull
    @ProtobufIndex(index = 1)
    public String payment;
    public static ProtobufAdapter<H5PaymentChannels> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5PaymentChannels>() { // from class: com.p1.mobile.putong.core.data.H5PaymentChannels.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(H5PaymentChannels h5PaymentChannels) {
            String str = h5PaymentChannels.payment;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = h5PaymentChannels.categories;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            h5PaymentChannels.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public H5PaymentChannels parse(nb5 nb5Var) throws IOException {
            H5PaymentChannels h5PaymentChannels = new H5PaymentChannels();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (h5PaymentChannels.payment == null) {
                        h5PaymentChannels.payment = "";
                    }
                    if (h5PaymentChannels.categories != null) {
                        break;
                    }
                    h5PaymentChannels.categories = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    h5PaymentChannels.payment = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (h5PaymentChannels.payment == null) {
                            h5PaymentChannels.payment = "";
                        }
                        if (h5PaymentChannels.categories != null) {
                            break;
                        }
                        h5PaymentChannels.categories = new ArrayList();
                        return h5PaymentChannels;
                    }
                    h5PaymentChannels.categories = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return h5PaymentChannels;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(H5PaymentChannels h5PaymentChannels, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5PaymentChannels.payment;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = h5PaymentChannels.categories;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<H5PaymentChannels> JSON_ADAPTER = new ObjectJsonAdapter<H5PaymentChannels>() { // from class: com.p1.mobile.putong.core.data.H5PaymentChannels.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return H5PaymentChannels.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public H5PaymentChannels newInstance() {
            return new H5PaymentChannels();
        }

        public boolean parseField(H5PaymentChannels h5PaymentChannels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(SchemeKey.payment)) {
                h5PaymentChannels.payment = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("categories")) {
                return false;
            }
            h5PaymentChannels.categories = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(H5PaymentChannels h5PaymentChannels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(SchemeKey.payment) || str.equals("categories")) {
                return true;
            }
            return super.parseFieldCheck(h5PaymentChannels, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(H5PaymentChannels h5PaymentChannels, JsonGenerator jsonGenerator) throws IOException {
            String str = h5PaymentChannels.payment;
            if (str != null) {
                jsonGenerator.writeStringField(SchemeKey.payment, str);
            }
            if (h5PaymentChannels.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(h5PaymentChannels.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5PaymentChannels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5PaymentChannels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35575a(String str) {
        return str;
    }

    public static H5PaymentChannels new_() {
        H5PaymentChannels h5PaymentChannels = new H5PaymentChannels();
        h5PaymentChannels.nullCheck();
        return h5PaymentChannels;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public H5PaymentChannels mo223809clone() {
        H5PaymentChannels h5PaymentChannels = new H5PaymentChannels();
        h5PaymentChannels.payment = this.payment;
        List<String> list = this.categories;
        if (list != null) {
            h5PaymentChannels.categories = ValueObject.util_map(list, new w9j() { // from class: l.luk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return H5PaymentChannels.m35575a((String) obj);
                }
            });
        }
        return h5PaymentChannels;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H5PaymentChannels)) {
            return false;
        }
        H5PaymentChannels h5PaymentChannels = (H5PaymentChannels) obj;
        return ValueObject.util_equals(this.payment, h5PaymentChannels.payment) && ValueObject.util_equals(this.categories, h5PaymentChannels.categories);
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
        String str = this.payment;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.categories;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.payment == null) {
            this.payment = "";
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
