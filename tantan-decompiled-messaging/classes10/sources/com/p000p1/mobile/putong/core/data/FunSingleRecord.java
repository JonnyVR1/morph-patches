package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FunSingleRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "funsinglerecord";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long latestShowtime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int showCount;

    @ProtobufIndex(index = 1)
    public long startTime;
    public static ProtobufAdapter<FunSingleRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<FunSingleRecord>() { // from class: com.p1.mobile.putong.core.data.FunSingleRecord.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FunSingleRecord funSingleRecord) {
            int iJ = CodedOutputByteBufferNano.j(1, funSingleRecord.startTime) + CodedOutputByteBufferNano.j(2, funSingleRecord.latestShowtime) + CodedOutputByteBufferNano.h(3, funSingleRecord.showCount);
            ((MessageNano) funSingleRecord).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FunSingleRecord m12867parse(nb5 nb5Var) throws IOException {
            FunSingleRecord funSingleRecord = new FunSingleRecord();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    funSingleRecord.startTime = nb5Var.k();
                } else if (iU == 16) {
                    funSingleRecord.latestShowtime = nb5Var.k();
                } else {
                    if (iU != 24) {
                        return funSingleRecord;
                    }
                    funSingleRecord.showCount = nb5Var.j();
                }
            }
        }

        public void serialize(FunSingleRecord funSingleRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, funSingleRecord.startTime);
            codedOutputByteBufferNano.I(2, funSingleRecord.latestShowtime);
            codedOutputByteBufferNano.G(3, funSingleRecord.showCount);
        }
    };
    public static JsonAdapter<FunSingleRecord> JSON_ADAPTER = new ObjectJsonAdapter<FunSingleRecord>() { // from class: com.p1.mobile.putong.core.data.FunSingleRecord.2
        public Class getDataClass() {
            return FunSingleRecord.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FunSingleRecord m12868newInstance() {
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

        public void serializeFields(FunSingleRecord funSingleRecord, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("startTime", funSingleRecord.startTime);
            jsonGenerator.writeNumberField("latestShowtime", funSingleRecord.latestShowtime);
            jsonGenerator.writeNumberField("showCount", funSingleRecord.showCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FunSingleRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FunSingleRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FunSingleRecord new_() {
        FunSingleRecord funSingleRecord = new FunSingleRecord();
        funSingleRecord.nullCheck();
        return funSingleRecord;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FunSingleRecord m12866clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.startTime;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.latestShowtime;
        int i3 = ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.showCount;
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
