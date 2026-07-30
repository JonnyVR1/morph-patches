package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.AttitudeSourceCounts;
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
public class AttitudeSourceCatCount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "attitudesourcecatcount";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f677id;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<AttitudeSourceCounts> sourceCounts;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<AttitudeSourceCatCount> PROTOBUF_ADAPTER = new MessageNanoAdapter<AttitudeSourceCatCount>() { // from class: com.p1.mobile.putong.feed.data.AttitudeSourceCatCount.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AttitudeSourceCatCount attitudeSourceCatCount) {
            String str = attitudeSourceCatCount.f677id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = attitudeSourceCatCount.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<AttitudeSourceCounts> list = attitudeSourceCatCount.sourceCounts;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, AttitudeSourceCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) attitudeSourceCatCount).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AttitudeSourceCatCount m19416parse(nb5 nb5Var) throws IOException {
            AttitudeSourceCatCount attitudeSourceCatCount = new AttitudeSourceCatCount();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (attitudeSourceCatCount.f677id == null) {
                        attitudeSourceCatCount.f677id = "";
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
                if (iU == 10) {
                    attitudeSourceCatCount.f677id = nb5Var.s();
                } else if (iU == 18) {
                    attitudeSourceCatCount.type = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (attitudeSourceCatCount.f677id == null) {
                            attitudeSourceCatCount.f677id = "";
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
                    attitudeSourceCatCount.sourceCounts = (List) nb5Var.l(AttitudeSourceCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return attitudeSourceCatCount;
        }

        public void serialize(AttitudeSourceCatCount attitudeSourceCatCount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = attitudeSourceCatCount.f677id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = attitudeSourceCatCount.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<AttitudeSourceCounts> list = attitudeSourceCatCount.sourceCounts;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, AttitudeSourceCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AttitudeSourceCatCount> JSON_ADAPTER = new ObjectJsonAdapter<AttitudeSourceCatCount>() { // from class: com.p1.mobile.putong.feed.data.AttitudeSourceCatCount.2
        public Class getDataClass() {
            return AttitudeSourceCatCount.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AttitudeSourceCatCount mo17830newInstance() {
            return new AttitudeSourceCatCount();
        }

        public boolean parseField(AttitudeSourceCatCount attitudeSourceCatCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    attitudeSourceCatCount.f677id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AttitudeSourceCatCount attitudeSourceCatCount, JsonGenerator jsonGenerator) throws IOException {
            String str = attitudeSourceCatCount.f677id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AttitudeSourceCatCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AttitudeSourceCatCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AttitudeSourceCatCount new_() {
        AttitudeSourceCatCount attitudeSourceCatCount = new AttitudeSourceCatCount();
        attitudeSourceCatCount.nullCheck();
        return attitudeSourceCatCount;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AttitudeSourceCatCount m19415clone() {
        AttitudeSourceCatCount attitudeSourceCatCount = new AttitudeSourceCatCount();
        attitudeSourceCatCount.f677id = this.f677id;
        attitudeSourceCatCount.type = this.type;
        List<AttitudeSourceCounts> list = this.sourceCounts;
        if (list != null) {
            attitudeSourceCatCount.sourceCounts = ValueObject.util_map(list, new w9j() { // from class: l.p41
                public final Object call(Object obj) {
                    return ((AttitudeSourceCounts) obj).m19418clone();
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
        return ValueObject.util_equals(this.f677id, attitudeSourceCatCount.f677id) && ValueObject.util_equals(this.type, attitudeSourceCatCount.type) && ValueObject.util_equals(this.sourceCounts, attitudeSourceCatCount.sourceCounts);
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
        String str = this.f677id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<AttitudeSourceCounts> list = this.sourceCounts;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f677id == null) {
            this.f677id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.sourceCounts == null) {
            this.sourceCounts = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
