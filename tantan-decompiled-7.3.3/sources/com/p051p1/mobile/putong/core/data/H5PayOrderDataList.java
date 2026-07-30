package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.H5PayOrderData;
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
public class H5PayOrderDataList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5payorderdatalist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<H5PayOrderData> orderList;
    public static ProtobufAdapter<H5PayOrderDataList> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5PayOrderDataList>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderDataList.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(H5PayOrderDataList h5PayOrderDataList) {
            List<H5PayOrderData> list = h5PayOrderDataList.orderList;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, H5PayOrderData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            h5PayOrderDataList.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public H5PayOrderDataList parse(nc5 nc5Var) throws IOException {
            H5PayOrderDataList h5PayOrderDataList = new H5PayOrderDataList();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (h5PayOrderDataList.orderList != null) {
                        break;
                    }
                    h5PayOrderDataList.orderList = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (h5PayOrderDataList.orderList != null) {
                        break;
                    }
                    h5PayOrderDataList.orderList = new ArrayList();
                    return h5PayOrderDataList;
                }
                h5PayOrderDataList.orderList = (List) nc5Var.m162488l(H5PayOrderData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return h5PayOrderDataList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(H5PayOrderDataList h5PayOrderDataList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<H5PayOrderData> list = h5PayOrderDataList.orderList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, H5PayOrderData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<H5PayOrderDataList> JSON_ADAPTER = new ObjectJsonAdapter<H5PayOrderDataList>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderDataList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return H5PayOrderDataList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public H5PayOrderDataList newInstance() {
            return new H5PayOrderDataList();
        }

        public boolean parseField(H5PayOrderDataList h5PayOrderDataList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("orderList")) {
                return false;
            }
            h5PayOrderDataList.orderList = JsonAdapter.parseArray(jsonParser, H5PayOrderData.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(H5PayOrderDataList h5PayOrderDataList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("orderList")) {
                return true;
            }
            return super.parseFieldCheck(h5PayOrderDataList, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(H5PayOrderDataList h5PayOrderDataList, JsonGenerator jsonGenerator) throws IOException {
            if (h5PayOrderDataList.orderList != null) {
                jsonGenerator.writeFieldName("orderList");
                JsonAdapter.serializeArray(h5PayOrderDataList.orderList, jsonGenerator, H5PayOrderData.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5PayOrderDataList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5PayOrderDataList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5PayOrderDataList new_() {
        H5PayOrderDataList h5PayOrderDataList = new H5PayOrderDataList();
        h5PayOrderDataList.nullCheck();
        return h5PayOrderDataList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public H5PayOrderDataList mo225055clone() {
        H5PayOrderDataList h5PayOrderDataList = new H5PayOrderDataList();
        List<H5PayOrderData> list = this.orderList;
        if (list != null) {
            h5PayOrderDataList.orderList = ValueObject.util_map(list, new qcj() { // from class: l.axk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((H5PayOrderData) obj).mo225055clone();
                }
            });
        }
        return h5PayOrderDataList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H5PayOrderDataList) {
            return ValueObject.util_equals(this.orderList, ((H5PayOrderDataList) obj).orderList);
        }
        return false;
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
        List<H5PayOrderData> list = this.orderList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.orderList == null) {
            this.orderList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
