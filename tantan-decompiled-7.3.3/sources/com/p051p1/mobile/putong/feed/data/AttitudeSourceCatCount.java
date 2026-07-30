package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.AttitudeSourceCounts;
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

/* JADX INFO: loaded from: classes13.dex */
public class AttitudeSourceCatCount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "attitudesourcecatcount";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40064id;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<AttitudeSourceCounts> sourceCounts;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<AttitudeSourceCatCount> PROTOBUF_ADAPTER = new MessageNanoAdapter<AttitudeSourceCatCount>() { // from class: com.p1.mobile.putong.feed.data.AttitudeSourceCatCount.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AttitudeSourceCatCount attitudeSourceCatCount) {
            String str = attitudeSourceCatCount.f40064id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = attitudeSourceCatCount.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<AttitudeSourceCounts> list = attitudeSourceCatCount.sourceCounts;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, AttitudeSourceCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            attitudeSourceCatCount.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AttitudeSourceCatCount parse(nc5 nc5Var) throws IOException {
            AttitudeSourceCatCount attitudeSourceCatCount = new AttitudeSourceCatCount();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (attitudeSourceCatCount.f40064id == null) {
                        attitudeSourceCatCount.f40064id = "";
                    }
                    if (attitudeSourceCatCount.type == null) {
                        attitudeSourceCatCount.type = "";
                    }
                    if (attitudeSourceCatCount.sourceCounts != null) {
                        break;
                    }
                    attitudeSourceCatCount.sourceCounts = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    attitudeSourceCatCount.f40064id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    attitudeSourceCatCount.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (attitudeSourceCatCount.f40064id == null) {
                            attitudeSourceCatCount.f40064id = "";
                        }
                        if (attitudeSourceCatCount.type == null) {
                            attitudeSourceCatCount.type = "";
                        }
                        if (attitudeSourceCatCount.sourceCounts != null) {
                            break;
                        }
                        attitudeSourceCatCount.sourceCounts = new ArrayList();
                        return attitudeSourceCatCount;
                    }
                    attitudeSourceCatCount.sourceCounts = (List) nc5Var.m162488l(AttitudeSourceCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return attitudeSourceCatCount;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AttitudeSourceCatCount attitudeSourceCatCount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = attitudeSourceCatCount.f40064id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = attitudeSourceCatCount.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<AttitudeSourceCounts> list = attitudeSourceCatCount.sourceCounts;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, AttitudeSourceCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AttitudeSourceCatCount> JSON_ADAPTER = new ObjectJsonAdapter<AttitudeSourceCatCount>() { // from class: com.p1.mobile.putong.feed.data.AttitudeSourceCatCount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AttitudeSourceCatCount.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AttitudeSourceCatCount newInstance() {
            return new AttitudeSourceCatCount();
        }

        public boolean parseField(AttitudeSourceCatCount attitudeSourceCatCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    attitudeSourceCatCount.f40064id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    attitudeSourceCatCount.type = jsonParser.getValueAsString();
                    return true;
                case "sourceCounts":
                    attitudeSourceCatCount.sourceCounts = JsonAdapter.parseArray(jsonParser, AttitudeSourceCounts.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AttitudeSourceCatCount attitudeSourceCatCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "sourceCounts":
                    return true;
                default:
                    return super.parseFieldCheck(attitudeSourceCatCount, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AttitudeSourceCatCount attitudeSourceCatCount, JsonGenerator jsonGenerator) throws IOException {
            String str = attitudeSourceCatCount.f40064id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = attitudeSourceCatCount.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (attitudeSourceCatCount.sourceCounts != null) {
                jsonGenerator.writeFieldName("sourceCounts");
                JsonAdapter.serializeArray(attitudeSourceCatCount.sourceCounts, jsonGenerator, AttitudeSourceCounts.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AttitudeSourceCatCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AttitudeSourceCatCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AttitudeSourceCatCount new_() {
        AttitudeSourceCatCount attitudeSourceCatCount = new AttitudeSourceCatCount();
        attitudeSourceCatCount.nullCheck();
        return attitudeSourceCatCount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AttitudeSourceCatCount mo225055clone() {
        AttitudeSourceCatCount attitudeSourceCatCount = new AttitudeSourceCatCount();
        attitudeSourceCatCount.f40064id = this.f40064id;
        attitudeSourceCatCount.type = this.type;
        List<AttitudeSourceCounts> list = this.sourceCounts;
        if (list != null) {
            attitudeSourceCatCount.sourceCounts = ValueObject.util_map(list, new qcj() { // from class: l.w41
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((AttitudeSourceCounts) obj).mo225055clone();
                }
            });
        }
        return attitudeSourceCatCount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttitudeSourceCatCount)) {
            return false;
        }
        AttitudeSourceCatCount attitudeSourceCatCount = (AttitudeSourceCatCount) obj;
        return ValueObject.util_equals(this.f40064id, attitudeSourceCatCount.f40064id) && ValueObject.util_equals(this.type, attitudeSourceCatCount.type) && ValueObject.util_equals(this.sourceCounts, attitudeSourceCatCount.sourceCounts);
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
        String str = this.f40064id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<AttitudeSourceCounts> list = this.sourceCounts;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40064id == null) {
            this.f40064id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.sourceCounts == null) {
            this.sourceCounts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
