package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSCounterInfo;
import com.p046p1.mobile.putong.data.OMSMetasData;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OmsCounter omsCounter) {
            List<OMSMetasData> list = omsCounter.omsMetas;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, OMSMetasData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<OMSCounterInfo> list2 = omsCounter.counters;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, OMSCounterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            omsCounter.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OmsCounter parse(nb5 nb5Var) throws IOException {
            OmsCounter omsCounter = new OmsCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (omsCounter.counters != null) {
                        break;
                    }
                    omsCounter.counters = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    omsCounter.omsMetas = (List) nb5Var.m158743l(OMSMetasData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (omsCounter.counters != null) {
                            break;
                        }
                        omsCounter.counters = new ArrayList();
                        return omsCounter;
                    }
                    omsCounter.counters = (List) nb5Var.m158743l(OMSCounterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return omsCounter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OmsCounter omsCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<OMSMetasData> list = omsCounter.omsMetas;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, OMSMetasData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<OMSCounterInfo> list2 = omsCounter.counters;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, OMSCounterInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OmsCounter> JSON_ADAPTER = new ObjectJsonAdapter<OmsCounter>() { // from class: com.p1.mobile.putong.data.OmsCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OmsCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OmsCounter newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsCounter new_() {
        OmsCounter omsCounter = new OmsCounter();
        omsCounter.nullCheck();
        return omsCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OmsCounter mo223809clone() {
        OmsCounter omsCounter = new OmsCounter();
        List<OMSMetasData> list = this.omsMetas;
        if (list != null) {
            omsCounter.omsMetas = ValueObject.util_map(list, new w9j() { // from class: l.oa50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSMetasData) obj).mo223809clone();
                }
            });
        }
        List<OMSCounterInfo> list2 = this.counters;
        if (list2 != null) {
            omsCounter.counters = ValueObject.util_map(list2, new w9j() { // from class: l.pa50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSCounterInfo) obj).mo223809clone();
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
        List<OMSMetasData> list = this.omsMetas;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<OMSCounterInfo> list2 = this.counters;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.counters == null) {
            this.counters = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
