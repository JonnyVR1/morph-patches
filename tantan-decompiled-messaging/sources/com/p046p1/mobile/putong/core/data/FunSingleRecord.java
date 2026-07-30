package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class FunSingleRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "funsinglerecord";

    @ProtobufIndex(index = 2)
    public long latestShowtime;

    @ProtobufIndex(index = 3)
    public int showCount;

    @ProtobufIndex(index = 1)
    public long startTime;
    public static ProtobufAdapter<FunSingleRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<FunSingleRecord>() { // from class: com.p1.mobile.putong.core.data.FunSingleRecord.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FunSingleRecord funSingleRecord) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, funSingleRecord.startTime) + CodedOutputByteBufferNano.m17228j(2, funSingleRecord.latestShowtime) + CodedOutputByteBufferNano.m17226h(3, funSingleRecord.showCount);
            funSingleRecord.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FunSingleRecord parse(nb5 nb5Var) throws IOException {
            FunSingleRecord funSingleRecord = new FunSingleRecord();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    funSingleRecord.startTime = nb5Var.m158742k();
                } else if (iM158752u == 16) {
                    funSingleRecord.latestShowtime = nb5Var.m158742k();
                } else {
                    if (iM158752u != 24) {
                        return funSingleRecord;
                    }
                    funSingleRecord.showCount = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FunSingleRecord funSingleRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, funSingleRecord.startTime);
            codedOutputByteBufferNano.m17252I(2, funSingleRecord.latestShowtime);
            codedOutputByteBufferNano.m17250G(3, funSingleRecord.showCount);
        }
    };
    public static JsonAdapter<FunSingleRecord> JSON_ADAPTER = new ObjectJsonAdapter<FunSingleRecord>() { // from class: com.p1.mobile.putong.core.data.FunSingleRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FunSingleRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FunSingleRecord newInstance() {
            return new FunSingleRecord();
        }

        public boolean parseField(FunSingleRecord funSingleRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    funSingleRecord.startTime = jsonParser.getValueAsLong();
                    return true;
                case "showCount":
                    funSingleRecord.showCount = jsonParser.getValueAsInt();
                    return true;
                case "latestShowtime":
                    funSingleRecord.latestShowtime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FunSingleRecord funSingleRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "showCount":
                case "latestShowtime":
                    return true;
                default:
                    return super.parseFieldCheck(funSingleRecord, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FunSingleRecord funSingleRecord, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, funSingleRecord.startTime);
            jsonGenerator.writeNumberField("latestShowtime", funSingleRecord.latestShowtime);
            jsonGenerator.writeNumberField("showCount", funSingleRecord.showCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FunSingleRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FunSingleRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FunSingleRecord new_() {
        FunSingleRecord funSingleRecord = new FunSingleRecord();
        funSingleRecord.nullCheck();
        return funSingleRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FunSingleRecord mo223809clone() {
        FunSingleRecord funSingleRecord = new FunSingleRecord();
        funSingleRecord.startTime = this.startTime;
        funSingleRecord.latestShowtime = this.latestShowtime;
        funSingleRecord.showCount = this.showCount;
        return funSingleRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunSingleRecord)) {
            return false;
        }
        FunSingleRecord funSingleRecord = (FunSingleRecord) obj;
        return this.startTime == funSingleRecord.startTime && this.latestShowtime == funSingleRecord.latestShowtime && this.showCount == funSingleRecord.showCount;
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
        long j = this.startTime;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.latestShowtime;
        int i3 = ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.showCount;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
