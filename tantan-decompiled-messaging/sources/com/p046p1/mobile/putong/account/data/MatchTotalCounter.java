package com.p046p1.mobile.putong.account.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes9.dex */
public class MatchTotalCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchtotalcounter";

    @ProtobufIndex(index = 1)
    public long matches;
    public static ProtobufAdapter<MatchTotalCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchTotalCounter>() { // from class: com.p1.mobile.putong.account.data.MatchTotalCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatchTotalCounter matchTotalCounter) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, matchTotalCounter.matches);
            matchTotalCounter.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatchTotalCounter parse(nb5 nb5Var) throws IOException {
            MatchTotalCounter matchTotalCounter = new MatchTotalCounter();
            while (nb5Var.m158752u() == 8) {
                matchTotalCounter.matches = nb5Var.m158742k();
            }
            return matchTotalCounter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatchTotalCounter matchTotalCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, matchTotalCounter.matches);
        }
    };
    public static JsonAdapter<MatchTotalCounter> JSON_ADAPTER = new ObjectJsonAdapter<MatchTotalCounter>() { // from class: com.p1.mobile.putong.account.data.MatchTotalCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatchTotalCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatchTotalCounter newInstance() {
            return new MatchTotalCounter();
        }

        public boolean parseField(MatchTotalCounter matchTotalCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("matches")) {
                return false;
            }
            matchTotalCounter.matches = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(MatchTotalCounter matchTotalCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("matches")) {
                return true;
            }
            return super.parseFieldCheck(matchTotalCounter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatchTotalCounter matchTotalCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("matches", matchTotalCounter.matches);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchTotalCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchTotalCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchTotalCounter new_() {
        MatchTotalCounter matchTotalCounter = new MatchTotalCounter();
        matchTotalCounter.nullCheck();
        return matchTotalCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatchTotalCounter mo223809clone() {
        MatchTotalCounter matchTotalCounter = new MatchTotalCounter();
        matchTotalCounter.matches = this.matches;
        return matchTotalCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MatchTotalCounter) && this.matches == ((MatchTotalCounter) obj).matches;
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
        long j = this.matches;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
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
