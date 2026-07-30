package com.p051p1.mobile.putong.feed.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class AttitudeSourceCounts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "attitudesourcecounts";

    @ProtobufIndex(index = 1)
    public int attitudeId;

    @ProtobufIndex(index = 2)
    public int total;
    public static ProtobufAdapter<AttitudeSourceCounts> PROTOBUF_ADAPTER = new MessageNanoAdapter<AttitudeSourceCounts>() { // from class: com.p1.mobile.putong.feed.data.AttitudeSourceCounts.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AttitudeSourceCounts attitudeSourceCounts) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, attitudeSourceCounts.attitudeId) + CodedOutputByteBufferNano.m17281h(2, attitudeSourceCounts.total);
            attitudeSourceCounts.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AttitudeSourceCounts parse(nc5 nc5Var) throws IOException {
            AttitudeSourceCounts attitudeSourceCounts = new AttitudeSourceCounts();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    attitudeSourceCounts.attitudeId = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return attitudeSourceCounts;
                    }
                    attitudeSourceCounts.total = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AttitudeSourceCounts attitudeSourceCounts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, attitudeSourceCounts.attitudeId);
            codedOutputByteBufferNano.m17305G(2, attitudeSourceCounts.total);
        }
    };
    public static JsonAdapter<AttitudeSourceCounts> JSON_ADAPTER = new ObjectJsonAdapter<AttitudeSourceCounts>() { // from class: com.p1.mobile.putong.feed.data.AttitudeSourceCounts.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AttitudeSourceCounts.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AttitudeSourceCounts newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AttitudeSourceCounts attitudeSourceCounts, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("attitudeId", attitudeSourceCounts.attitudeId);
            jsonGenerator.writeNumberField("total", attitudeSourceCounts.total);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AttitudeSourceCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AttitudeSourceCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AttitudeSourceCounts new_() {
        AttitudeSourceCounts attitudeSourceCounts = new AttitudeSourceCounts();
        attitudeSourceCounts.nullCheck();
        return attitudeSourceCounts;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AttitudeSourceCounts mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.attitudeId) * 41) + this.total;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
