package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.H5Merchandise;
import com.p051p1.mobile.putong.core.data.H5PaymentChannels;
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
public class H5MerchandiseData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "h5merchandisedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<H5Merchandise> merchandises;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<H5PaymentChannels> paymentChannels;
    public static ProtobufAdapter<H5MerchandiseData> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5MerchandiseData>() { // from class: com.p1.mobile.putong.core.data.H5MerchandiseData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(H5MerchandiseData h5MerchandiseData) {
            List<H5Merchandise> list = h5MerchandiseData.merchandises;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, H5Merchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<H5PaymentChannels> list2 = h5MerchandiseData.paymentChannels;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, H5PaymentChannels.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            h5MerchandiseData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public H5MerchandiseData parse(nc5 nc5Var) throws IOException {
            H5MerchandiseData h5MerchandiseData = new H5MerchandiseData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (h5MerchandiseData.merchandises == null) {
                        h5MerchandiseData.merchandises = new ArrayList();
                    }
                    if (h5MerchandiseData.paymentChannels != null) {
                        break;
                    }
                    h5MerchandiseData.paymentChannels = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    h5MerchandiseData.merchandises = (List) nc5Var.m162488l(H5Merchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (h5MerchandiseData.merchandises == null) {
                            h5MerchandiseData.merchandises = new ArrayList();
                        }
                        if (h5MerchandiseData.paymentChannels != null) {
                            break;
                        }
                        h5MerchandiseData.paymentChannels = new ArrayList();
                        return h5MerchandiseData;
                    }
                    h5MerchandiseData.paymentChannels = (List) nc5Var.m162488l(H5PaymentChannels.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return h5MerchandiseData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(H5MerchandiseData h5MerchandiseData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<H5Merchandise> list = h5MerchandiseData.merchandises;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, H5Merchandise.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<H5PaymentChannels> list2 = h5MerchandiseData.paymentChannels;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, H5PaymentChannels.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<H5MerchandiseData> JSON_ADAPTER = new ObjectJsonAdapter<H5MerchandiseData>() { // from class: com.p1.mobile.putong.core.data.H5MerchandiseData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return H5MerchandiseData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public H5MerchandiseData newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5MerchandiseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5MerchandiseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5MerchandiseData new_() {
        H5MerchandiseData h5MerchandiseData = new H5MerchandiseData();
        h5MerchandiseData.nullCheck();
        return h5MerchandiseData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public H5MerchandiseData mo225055clone() {
        H5MerchandiseData h5MerchandiseData = new H5MerchandiseData();
        List<H5Merchandise> list = this.merchandises;
        if (list != null) {
            h5MerchandiseData.merchandises = ValueObject.util_map(list, new qcj() { // from class: l.vwk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((H5Merchandise) obj).mo225055clone();
                }
            });
        }
        List<H5PaymentChannels> list2 = this.paymentChannels;
        if (list2 != null) {
            h5MerchandiseData.paymentChannels = ValueObject.util_map(list2, new qcj() { // from class: l.wwk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((H5PaymentChannels) obj).mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<H5Merchandise> list = this.merchandises;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<H5PaymentChannels> list2 = this.paymentChannels;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.merchandises == null) {
            this.merchandises = new ArrayList();
        }
        if (this.paymentChannels == null) {
            this.paymentChannels = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
