package com.p000p1.mobile.putong.data;

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
public class CuttingData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cuttingdata";

    @ProtobufIndex(index = 2)
    public long end;

    @ProtobufIndex(index = 1)
    public long start;
    public static ProtobufAdapter<CuttingData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CuttingData>() { // from class: com.p1.mobile.putong.data.CuttingData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CuttingData cuttingData) {
            int iJ = CodedOutputByteBufferNano.j(1, cuttingData.start) + CodedOutputByteBufferNano.j(2, cuttingData.end);
            ((MessageNano) cuttingData).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CuttingData m17935parse(nb5 nb5Var) throws IOException {
            CuttingData cuttingData = new CuttingData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    cuttingData.start = nb5Var.k();
                } else {
                    if (iU != 16) {
                        return cuttingData;
                    }
                    cuttingData.end = nb5Var.k();
                }
            }
        }

        public void serialize(CuttingData cuttingData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, cuttingData.start);
            codedOutputByteBufferNano.I(2, cuttingData.end);
        }
    };
    public static JsonAdapter<CuttingData> JSON_ADAPTER = new ObjectJsonAdapter<CuttingData>() { // from class: com.p1.mobile.putong.data.CuttingData.2
        public Class getDataClass() {
            return CuttingData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CuttingData mo17830newInstance() {
            return new CuttingData();
        }

        public boolean parseField(CuttingData cuttingData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("end")) {
                cuttingData.end = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals(KanKanStatus.start)) {
                return false;
            }
            cuttingData.start = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(CuttingData cuttingData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("end") || str.equals(KanKanStatus.start)) {
                return true;
            }
            return super.parseFieldCheck(cuttingData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CuttingData cuttingData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(KanKanStatus.start, cuttingData.start);
            jsonGenerator.writeNumberField("end", cuttingData.end);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CuttingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CuttingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CuttingData new_() {
        CuttingData cuttingData = new CuttingData();
        cuttingData.nullCheck();
        return cuttingData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CuttingData m17934clone() {
        CuttingData cuttingData = new CuttingData();
        cuttingData.start = this.start;
        cuttingData.end = this.end;
        return cuttingData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CuttingData)) {
            return false;
        }
        CuttingData cuttingData = (CuttingData) obj;
        return this.start == cuttingData.start && this.end == cuttingData.end;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.start;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.end;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
