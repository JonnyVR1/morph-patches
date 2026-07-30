package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.GPOrder;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class GPData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GPOrder> googlePlayOrders;
    public static ProtobufAdapter<GPData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPData>() { // from class: com.p1.mobile.putong.data.GPData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPData gPData) {
            List<GPOrder> list = gPData.googlePlayOrders;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, GPOrder.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) gPData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPData m18145parse(nb5 nb5Var) throws IOException {
            GPData gPData = new GPData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gPData.googlePlayOrders != null) {
                        break;
                    }
                    gPData.googlePlayOrders = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (gPData.googlePlayOrders != null) {
                        break;
                    }
                    gPData.googlePlayOrders = new ArrayList();
                    return gPData;
                }
                gPData.googlePlayOrders = (List) nb5Var.l(GPOrder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return gPData;
        }

        public void serialize(GPData gPData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPOrder> list = gPData.googlePlayOrders;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, GPOrder.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPData> JSON_ADAPTER = new ObjectJsonAdapter<GPData>() { // from class: com.p1.mobile.putong.data.GPData.2
        public Class getDataClass() {
            return GPData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GPData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPData gPData, JsonGenerator jsonGenerator) throws IOException {
            if (gPData.googlePlayOrders != null) {
                jsonGenerator.writeFieldName("googlePlayOrders");
                JsonAdapter.serializeArray(gPData.googlePlayOrders, jsonGenerator, GPOrder.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPData new_() {
        GPData gPData = new GPData();
        gPData.nullCheck();
        return gPData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPData m18144clone() {
        GPData gPData = new GPData();
        List<GPOrder> list = this.googlePlayOrders;
        if (list != null) {
            gPData.googlePlayOrders = ValueObject.util_map(list, new w9j() { // from class: l.wdj
                public final Object call(Object obj) {
                    return ((GPOrder) obj).m18159clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<GPOrder> list = this.googlePlayOrders;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.googlePlayOrders == null) {
            this.googlePlayOrders = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
