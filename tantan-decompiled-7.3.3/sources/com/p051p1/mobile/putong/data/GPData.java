package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.GPOrder;
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

/* JADX INFO: loaded from: classes12.dex */
public class GPData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GPOrder> googlePlayOrders;
    public static ProtobufAdapter<GPData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPData>() { // from class: com.p1.mobile.putong.data.GPData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPData gPData) {
            List<GPOrder> list = gPData.googlePlayOrders;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, GPOrder.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            gPData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPData parse(nc5 nc5Var) throws IOException {
            GPData gPData = new GPData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPData.googlePlayOrders != null) {
                        break;
                    }
                    gPData.googlePlayOrders = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (gPData.googlePlayOrders != null) {
                        break;
                    }
                    gPData.googlePlayOrders = new ArrayList();
                    return gPData;
                }
                gPData.googlePlayOrders = (List) nc5Var.m162488l(GPOrder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return gPData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPData gPData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPOrder> list = gPData.googlePlayOrders;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, GPOrder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPData> JSON_ADAPTER = new ObjectJsonAdapter<GPData>() { // from class: com.p1.mobile.putong.data.GPData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPData newInstance() {
            return new GPData();
        }

        public boolean parseField(GPData gPData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("googlePlayOrders")) {
                return false;
            }
            gPData.googlePlayOrders = JsonAdapter.parseArray(jsonParser, GPOrder.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPData gPData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("googlePlayOrders")) {
                return true;
            }
            return super.parseFieldCheck(gPData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPData gPData, JsonGenerator jsonGenerator) throws IOException {
            if (gPData.googlePlayOrders != null) {
                jsonGenerator.writeFieldName("googlePlayOrders");
                JsonAdapter.serializeArray(gPData.googlePlayOrders, jsonGenerator, GPOrder.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPData new_() {
        GPData gPData = new GPData();
        gPData.nullCheck();
        return gPData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPData mo225055clone() {
        GPData gPData = new GPData();
        List<GPOrder> list = this.googlePlayOrders;
        if (list != null) {
            gPData.googlePlayOrders = ValueObject.util_map(list, new qcj() { // from class: l.qgj
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GPOrder) obj).mo225055clone();
                }
            });
        }
        return gPData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GPData) {
            return ValueObject.util_equals(this.googlePlayOrders, ((GPData) obj).googlePlayOrders);
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
        List<GPOrder> list = this.googlePlayOrders;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.googlePlayOrders == null) {
            this.googlePlayOrders = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
