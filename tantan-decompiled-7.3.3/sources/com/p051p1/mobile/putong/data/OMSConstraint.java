package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSConstraint;
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
public class OMSConstraint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsconstraint";

    @ProtobufIndex(index = 1)
    public long count;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Long> histories;

    @ProtobufIndex(index = 2)
    public long latestMs;
    public static ProtobufAdapter<OMSConstraint> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSConstraint>() { // from class: com.p1.mobile.putong.data.OMSConstraint.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSConstraint oMSConstraint) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, oMSConstraint.count) + CodedOutputByteBufferNano.m17283j(2, oMSConstraint.latestMs);
            List<Long> list = oMSConstraint.histories;
            if (list != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            oMSConstraint.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSConstraint parse(nc5 nc5Var) throws IOException {
            OMSConstraint oMSConstraint = new OMSConstraint();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSConstraint.histories != null) {
                        break;
                    }
                    oMSConstraint.histories = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    oMSConstraint.count = nc5Var.m162487k();
                } else if (iM162497u == 16) {
                    oMSConstraint.latestMs = nc5Var.m162487k();
                } else {
                    if (iM162497u != 26) {
                        if (oMSConstraint.histories != null) {
                            break;
                        }
                        oMSConstraint.histories = new ArrayList();
                        return oMSConstraint;
                    }
                    oMSConstraint.histories = (List) nc5Var.m162488l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSConstraint;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSConstraint oMSConstraint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, oMSConstraint.count);
            codedOutputByteBufferNano.m17307I(2, oMSConstraint.latestMs);
            List<Long> list = oMSConstraint.histories;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSConstraint> JSON_ADAPTER = new ObjectJsonAdapter<OMSConstraint>() { // from class: com.p1.mobile.putong.data.OMSConstraint.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSConstraint.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSConstraint newInstance() {
            return new OMSConstraint();
        }

        public boolean parseField(OMSConstraint oMSConstraint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "latestMs":
                    oMSConstraint.latestMs = jsonParser.getValueAsLong();
                    return true;
                case "count":
                    oMSConstraint.count = jsonParser.getValueAsLong();
                    return true;
                case "histories":
                    oMSConstraint.histories = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSConstraint oMSConstraint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "latestMs":
                case "count":
                case "histories":
                    return true;
                default:
                    return super.parseFieldCheck(oMSConstraint, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSConstraint oMSConstraint, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", oMSConstraint.count);
            jsonGenerator.writeNumberField("latestMs", oMSConstraint.latestMs);
            if (oMSConstraint.histories != null) {
                jsonGenerator.writeFieldName("histories");
                JsonAdapter.serializeArray(oMSConstraint.histories, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSConstraint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSConstraint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m61071a(Long l2) {
        return l2;
    }

    public static OMSConstraint new_() {
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.nullCheck();
        return oMSConstraint;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSConstraint mo225055clone() {
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = this.count;
        oMSConstraint.latestMs = this.latestMs;
        List<Long> list = this.histories;
        if (list != null) {
            oMSConstraint.histories = ValueObject.util_map(list, new qcj() { // from class: l.s650
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSConstraint.m61071a((Long) obj);
                }
            });
        }
        return oMSConstraint;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSConstraint)) {
            return false;
        }
        OMSConstraint oMSConstraint = (OMSConstraint) obj;
        return this.count == oMSConstraint.count && this.latestMs == oMSConstraint.latestMs && ValueObject.util_equals(this.histories, oMSConstraint.histories);
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
        long j = this.count;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.latestMs;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        List<Long> list = this.histories;
        int iHashCode = i3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.histories == null) {
            this.histories = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
