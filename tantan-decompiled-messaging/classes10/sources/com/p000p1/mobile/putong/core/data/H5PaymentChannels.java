package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.H5PaymentChannels;
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
public class H5PaymentChannels extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5paymentchannels";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> categories;

    @NonNull
    @ProtobufIndex(index = 1)
    public String payment;
    public static ProtobufAdapter<H5PaymentChannels> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5PaymentChannels>() { // from class: com.p1.mobile.putong.core.data.H5PaymentChannels.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5PaymentChannels h5PaymentChannels) {
            String str = h5PaymentChannels.payment;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = h5PaymentChannels.categories;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) h5PaymentChannels).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5PaymentChannels m13209parse(nb5 nb5Var) throws IOException {
            H5PaymentChannels h5PaymentChannels = new H5PaymentChannels();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (h5PaymentChannels.payment == null) {
                        h5PaymentChannels.payment = "";
                    }
                    if (h5PaymentChannels.categories != null) {
                        break;
                    }
                    h5PaymentChannels.categories = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    h5PaymentChannels.payment = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (h5PaymentChannels.payment == null) {
                            h5PaymentChannels.payment = "";
                        }
                        if (h5PaymentChannels.categories != null) {
                            break;
                        }
                        h5PaymentChannels.categories = new ArrayList();
                        return h5PaymentChannels;
                    }
                    h5PaymentChannels.categories = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return h5PaymentChannels;
        }

        public void serialize(H5PaymentChannels h5PaymentChannels, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5PaymentChannels.payment;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = h5PaymentChannels.categories;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<H5PaymentChannels> JSON_ADAPTER = new ObjectJsonAdapter<H5PaymentChannels>() { // from class: com.p1.mobile.putong.core.data.H5PaymentChannels.2
        public Class getDataClass() {
            return H5PaymentChannels.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public H5PaymentChannels m13210newInstance() {
            return new H5PaymentChannels();
        }

        public boolean parseField(H5PaymentChannels h5PaymentChannels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("payment")) {
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
            if (str.equals("payment") || str.equals("categories")) {
                return true;
            }
            return super.parseFieldCheck(h5PaymentChannels, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(H5PaymentChannels h5PaymentChannels, JsonGenerator jsonGenerator) throws IOException {
            String str = h5PaymentChannels.payment;
            if (str != null) {
                jsonGenerator.writeStringField("payment", str);
            }
            if (h5PaymentChannels.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(h5PaymentChannels.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5PaymentChannels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5PaymentChannels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m377a(String str) {
        return str;
    }

    public static H5PaymentChannels new_() {
        H5PaymentChannels h5PaymentChannels = new H5PaymentChannels();
        h5PaymentChannels.nullCheck();
        return h5PaymentChannels;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5PaymentChannels m13208clone() {
        H5PaymentChannels h5PaymentChannels = new H5PaymentChannels();
        h5PaymentChannels.payment = this.payment;
        List<String> list = this.categories;
        if (list != null) {
            h5PaymentChannels.categories = ValueObject.util_map(list, new w9j() { // from class: l.luk
                public final Object call(Object obj) {
                    return H5PaymentChannels.m377a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.payment;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.categories;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.payment == null) {
            this.payment = "";
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
