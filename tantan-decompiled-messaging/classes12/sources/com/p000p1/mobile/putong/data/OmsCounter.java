package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSCounterInfo;
import com.p000p1.mobile.putong.data.OMSMetasData;
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
public class OmsCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omscounter";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<OMSCounterInfo> counters;

    @Nullable
    @ProtobufIndex(index = 1)
    public List<OMSMetasData> omsMetas;
    public static ProtobufAdapter<OmsCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsCounter>() { // from class: com.p1.mobile.putong.data.OmsCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OmsCounter omsCounter) {
            List<OMSMetasData> list = omsCounter.omsMetas;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, OMSMetasData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<OMSCounterInfo> list2 = omsCounter.counters;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, OMSCounterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) omsCounter).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OmsCounter m18714parse(nb5 nb5Var) throws IOException {
            OmsCounter omsCounter = new OmsCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (omsCounter.counters != null) {
                        break;
                    }
                    omsCounter.counters = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    omsCounter.omsMetas = (List) nb5Var.l(OMSMetasData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (omsCounter.counters != null) {
                            break;
                        }
                        omsCounter.counters = new ArrayList();
                        return omsCounter;
                    }
                    omsCounter.counters = (List) nb5Var.l(OMSCounterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return omsCounter;
        }

        public void serialize(OmsCounter omsCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<OMSMetasData> list = omsCounter.omsMetas;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, OMSMetasData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSCounterInfo> list2 = omsCounter.counters;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, OMSCounterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OmsCounter> JSON_ADAPTER = new ObjectJsonAdapter<OmsCounter>() { // from class: com.p1.mobile.putong.data.OmsCounter.2
        public Class getDataClass() {
            return OmsCounter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OmsCounter mo17830newInstance() {
            return new OmsCounter();
        }

        public boolean parseField(OmsCounter omsCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("counters")) {
                omsCounter.counters = JsonAdapter.parseArray(jsonParser, OMSCounterInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("omsMetas")) {
                return false;
            }
            omsCounter.omsMetas = JsonAdapter.parseArray(jsonParser, OMSMetasData.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OmsCounter omsCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("counters") || str.equals("omsMetas")) {
                return true;
            }
            return super.parseFieldCheck(omsCounter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsCounter omsCounter, JsonGenerator jsonGenerator) throws IOException {
            if (omsCounter.omsMetas != null) {
                jsonGenerator.writeFieldName("omsMetas");
                JsonAdapter.serializeArray(omsCounter.omsMetas, jsonGenerator, OMSMetasData.JSON_ADAPTER);
            }
            if (omsCounter.counters != null) {
                jsonGenerator.writeFieldName("counters");
                JsonAdapter.serializeArray(omsCounter.counters, jsonGenerator, OMSCounterInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsCounter new_() {
        OmsCounter omsCounter = new OmsCounter();
        omsCounter.nullCheck();
        return omsCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OmsCounter m18713clone() {
        OmsCounter omsCounter = new OmsCounter();
        List<OMSMetasData> list = this.omsMetas;
        if (list != null) {
            omsCounter.omsMetas = ValueObject.util_map(list, new w9j() { // from class: l.oa50
                public final Object call(Object obj) {
                    return ((OMSMetasData) obj).m18641clone();
                }
            });
        }
        List<OMSCounterInfo> list2 = this.counters;
        if (list2 != null) {
            omsCounter.counters = ValueObject.util_map(list2, new w9j() { // from class: l.pa50
                public final Object call(Object obj) {
                    return ((OMSCounterInfo) obj).m18587clone();
                }
            });
        }
        return omsCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsCounter)) {
            return false;
        }
        OmsCounter omsCounter = (OmsCounter) obj;
        return ValueObject.util_equals(this.omsMetas, omsCounter.omsMetas) && ValueObject.util_equals(this.counters, omsCounter.counters);
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
        List<OMSMetasData> list = this.omsMetas;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<OMSCounterInfo> list2 = this.counters;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.counters == null) {
            this.counters = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
