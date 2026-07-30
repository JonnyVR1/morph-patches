package com.p000p1.mobile.putong.account.data;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MatchTotalCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchtotalcounter";

    @ProtobufIndex(index = 1)
    public long matches;
    public static ProtobufAdapter<MatchTotalCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchTotalCounter>() { // from class: com.p1.mobile.putong.account.data.MatchTotalCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MatchTotalCounter matchTotalCounter) {
            int iJ = CodedOutputByteBufferNano.j(1, matchTotalCounter.matches);
            ((MessageNano) matchTotalCounter).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MatchTotalCounter m28931parse(nb5 nb5Var) throws IOException {
            MatchTotalCounter matchTotalCounter = new MatchTotalCounter();
            while (nb5Var.u() == 8) {
                matchTotalCounter.matches = nb5Var.k();
            }
            return matchTotalCounter;
        }

        public void serialize(MatchTotalCounter matchTotalCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, matchTotalCounter.matches);
        }
    };
    public static JsonAdapter<MatchTotalCounter> JSON_ADAPTER = new ObjectJsonAdapter<MatchTotalCounter>() { // from class: com.p1.mobile.putong.account.data.MatchTotalCounter.2
        public Class getDataClass() {
            return MatchTotalCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MatchTotalCounter m28932newInstance() {
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

        public void serializeFields(MatchTotalCounter matchTotalCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("matches", matchTotalCounter.matches);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchTotalCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchTotalCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchTotalCounter new_() {
        MatchTotalCounter matchTotalCounter = new MatchTotalCounter();
        matchTotalCounter.nullCheck();
        return matchTotalCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MatchTotalCounter m28930clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.matches;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
