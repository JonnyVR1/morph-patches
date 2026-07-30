package com.p000p1.mobile.putong.feed.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AttitudeSourceCounts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "attitudesourcecounts";

    @ProtobufIndex(index = 1)
    public int attitudeId;

    @ProtobufIndex(index = 2)
    public int total;
    public static ProtobufAdapter<AttitudeSourceCounts> PROTOBUF_ADAPTER = new MessageNanoAdapter<AttitudeSourceCounts>() { // from class: com.p1.mobile.putong.feed.data.AttitudeSourceCounts.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AttitudeSourceCounts attitudeSourceCounts) {
            int iH = CodedOutputByteBufferNano.h(1, attitudeSourceCounts.attitudeId) + CodedOutputByteBufferNano.h(2, attitudeSourceCounts.total);
            ((MessageNano) attitudeSourceCounts).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AttitudeSourceCounts m19419parse(nb5 nb5Var) throws IOException {
            AttitudeSourceCounts attitudeSourceCounts = new AttitudeSourceCounts();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    attitudeSourceCounts.attitudeId = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return attitudeSourceCounts;
                    }
                    attitudeSourceCounts.total = nb5Var.j();
                }
            }
        }

        public void serialize(AttitudeSourceCounts attitudeSourceCounts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, attitudeSourceCounts.attitudeId);
            codedOutputByteBufferNano.G(2, attitudeSourceCounts.total);
        }
    };
    public static JsonAdapter<AttitudeSourceCounts> JSON_ADAPTER = new ObjectJsonAdapter<AttitudeSourceCounts>() { // from class: com.p1.mobile.putong.feed.data.AttitudeSourceCounts.2
        public Class getDataClass() {
            return AttitudeSourceCounts.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AttitudeSourceCounts mo17830newInstance() {
            return new AttitudeSourceCounts();
        }

        public boolean parseField(AttitudeSourceCounts attitudeSourceCounts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("total")) {
                attitudeSourceCounts.total = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("attitudeId")) {
                return false;
            }
            attitudeSourceCounts.attitudeId = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(AttitudeSourceCounts attitudeSourceCounts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("total") || str.equals("attitudeId")) {
                return true;
            }
            return super.parseFieldCheck(attitudeSourceCounts, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AttitudeSourceCounts attitudeSourceCounts, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("attitudeId", attitudeSourceCounts.attitudeId);
            jsonGenerator.writeNumberField("total", attitudeSourceCounts.total);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AttitudeSourceCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AttitudeSourceCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AttitudeSourceCounts new_() {
        AttitudeSourceCounts attitudeSourceCounts = new AttitudeSourceCounts();
        attitudeSourceCounts.nullCheck();
        return attitudeSourceCounts;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AttitudeSourceCounts m19418clone() {
        AttitudeSourceCounts attitudeSourceCounts = new AttitudeSourceCounts();
        attitudeSourceCounts.attitudeId = this.attitudeId;
        attitudeSourceCounts.total = this.total;
        return attitudeSourceCounts;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttitudeSourceCounts)) {
            return false;
        }
        AttitudeSourceCounts attitudeSourceCounts = (AttitudeSourceCounts) obj;
        return this.attitudeId == attitudeSourceCounts.attitudeId && this.total == attitudeSourceCounts.total;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.attitudeId) * 41) + this.total;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
