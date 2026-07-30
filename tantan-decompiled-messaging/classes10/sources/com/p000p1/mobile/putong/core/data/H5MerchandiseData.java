package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.H5Merchandise;
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
public class H5MerchandiseData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "h5merchandisedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<H5Merchandise> merchandises;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<H5PaymentChannels> paymentChannels;
    public static ProtobufAdapter<H5MerchandiseData> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5MerchandiseData>() { // from class: com.p1.mobile.putong.core.data.H5MerchandiseData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5MerchandiseData h5MerchandiseData) {
            List<H5Merchandise> list = h5MerchandiseData.merchandises;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, H5Merchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<H5PaymentChannels> list2 = h5MerchandiseData.paymentChannels;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, H5PaymentChannels.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) h5MerchandiseData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5MerchandiseData m13185parse(nb5 nb5Var) throws IOException {
            H5MerchandiseData h5MerchandiseData = new H5MerchandiseData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (h5MerchandiseData.merchandises == null) {
                        h5MerchandiseData.merchandises = new ArrayList();
                    }
                    if (h5MerchandiseData.paymentChannels != null) {
                        break;
                    }
                    h5MerchandiseData.paymentChannels = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    h5MerchandiseData.merchandises = (List) nb5Var.l(H5Merchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (h5MerchandiseData.merchandises == null) {
                            h5MerchandiseData.merchandises = new ArrayList();
                        }
                        if (h5MerchandiseData.paymentChannels != null) {
                            break;
                        }
                        h5MerchandiseData.paymentChannels = new ArrayList();
                        return h5MerchandiseData;
                    }
                    h5MerchandiseData.paymentChannels = (List) nb5Var.l(H5PaymentChannels.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return h5MerchandiseData;
        }

        public void serialize(H5MerchandiseData h5MerchandiseData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<H5Merchandise> list = h5MerchandiseData.merchandises;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, H5Merchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<H5PaymentChannels> list2 = h5MerchandiseData.paymentChannels;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, H5PaymentChannels.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<H5MerchandiseData> JSON_ADAPTER = new ObjectJsonAdapter<H5MerchandiseData>() { // from class: com.p1.mobile.putong.core.data.H5MerchandiseData.2
        public Class getDataClass() {
            return H5MerchandiseData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public H5MerchandiseData m13186newInstance() {
            return new H5MerchandiseData();
        }

        public boolean parseField(H5MerchandiseData h5MerchandiseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("merchandises")) {
                h5MerchandiseData.merchandises = JsonAdapter.parseArray(jsonParser, H5Merchandise.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("paymentChannels")) {
                return false;
            }
            h5MerchandiseData.paymentChannels = JsonAdapter.parseArray(jsonParser, H5PaymentChannels.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(H5MerchandiseData h5MerchandiseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("merchandises") || str.equals("paymentChannels")) {
                return true;
            }
            return super.parseFieldCheck(h5MerchandiseData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(H5MerchandiseData h5MerchandiseData, JsonGenerator jsonGenerator) throws IOException {
            if (h5MerchandiseData.merchandises != null) {
                jsonGenerator.writeFieldName("merchandises");
                JsonAdapter.serializeArray(h5MerchandiseData.merchandises, jsonGenerator, H5Merchandise.JSON_ADAPTER);
            }
            if (h5MerchandiseData.paymentChannels != null) {
                jsonGenerator.writeFieldName("paymentChannels");
                JsonAdapter.serializeArray(h5MerchandiseData.paymentChannels, jsonGenerator, H5PaymentChannels.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5MerchandiseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5MerchandiseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5MerchandiseData new_() {
        H5MerchandiseData h5MerchandiseData = new H5MerchandiseData();
        h5MerchandiseData.nullCheck();
        return h5MerchandiseData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5MerchandiseData m13184clone() {
        H5MerchandiseData h5MerchandiseData = new H5MerchandiseData();
        List<H5Merchandise> list = this.merchandises;
        if (list != null) {
            h5MerchandiseData.merchandises = ValueObject.util_map(list, new w9j() { // from class: l.fuk
                public final Object call(Object obj) {
                    return ((H5Merchandise) obj).m13180clone();
                }
            });
        }
        List<H5PaymentChannels> list2 = this.paymentChannels;
        if (list2 != null) {
            h5MerchandiseData.paymentChannels = ValueObject.util_map(list2, new w9j() { // from class: l.guk
                public final Object call(Object obj) {
                    return ((H5PaymentChannels) obj).m13208clone();
                }
            });
        }
        return h5MerchandiseData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H5MerchandiseData)) {
            return false;
        }
        H5MerchandiseData h5MerchandiseData = (H5MerchandiseData) obj;
        return this == obj && ValueObject.util_equals(this.merchandises, h5MerchandiseData.merchandises) && ValueObject.util_equals(this.paymentChannels, h5MerchandiseData.paymentChannels);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<H5Merchandise> list = this.merchandises;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<H5PaymentChannels> list2 = this.paymentChannels;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.merchandises == null) {
            this.merchandises = new ArrayList();
        }
        if (this.paymentChannels == null) {
            this.paymentChannels = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
