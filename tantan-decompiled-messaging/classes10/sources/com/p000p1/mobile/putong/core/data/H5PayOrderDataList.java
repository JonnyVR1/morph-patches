package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.H5PayOrderData;
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
public class H5PayOrderDataList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5payorderdatalist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<H5PayOrderData> orderList;
    public static ProtobufAdapter<H5PayOrderDataList> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5PayOrderDataList>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderDataList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5PayOrderDataList h5PayOrderDataList) {
            List<H5PayOrderData> list = h5PayOrderDataList.orderList;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, H5PayOrderData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) h5PayOrderDataList).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5PayOrderDataList m13205parse(nb5 nb5Var) throws IOException {
            H5PayOrderDataList h5PayOrderDataList = new H5PayOrderDataList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (h5PayOrderDataList.orderList != null) {
                        break;
                    }
                    h5PayOrderDataList.orderList = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (h5PayOrderDataList.orderList != null) {
                        break;
                    }
                    h5PayOrderDataList.orderList = new ArrayList();
                    return h5PayOrderDataList;
                }
                h5PayOrderDataList.orderList = (List) nb5Var.l(H5PayOrderData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return h5PayOrderDataList;
        }

        public void serialize(H5PayOrderDataList h5PayOrderDataList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<H5PayOrderData> list = h5PayOrderDataList.orderList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, H5PayOrderData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<H5PayOrderDataList> JSON_ADAPTER = new ObjectJsonAdapter<H5PayOrderDataList>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderDataList.2
        public Class getDataClass() {
            return H5PayOrderDataList.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public H5PayOrderDataList m13206newInstance() {
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

        public void serializeFields(H5PayOrderDataList h5PayOrderDataList, JsonGenerator jsonGenerator) throws IOException {
            if (h5PayOrderDataList.orderList != null) {
                jsonGenerator.writeFieldName("orderList");
                JsonAdapter.serializeArray(h5PayOrderDataList.orderList, jsonGenerator, H5PayOrderData.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5PayOrderDataList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5PayOrderDataList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5PayOrderDataList new_() {
        H5PayOrderDataList h5PayOrderDataList = new H5PayOrderDataList();
        h5PayOrderDataList.nullCheck();
        return h5PayOrderDataList;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5PayOrderDataList m13204clone() {
        H5PayOrderDataList h5PayOrderDataList = new H5PayOrderDataList();
        List<H5PayOrderData> list = this.orderList;
        if (list != null) {
            h5PayOrderDataList.orderList = ValueObject.util_map(list, new w9j() { // from class: l.kuk
                public final Object call(Object obj) {
                    return ((H5PayOrderData) obj).m13196clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<H5PayOrderData> list = this.orderList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.orderList == null) {
            this.orderList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
