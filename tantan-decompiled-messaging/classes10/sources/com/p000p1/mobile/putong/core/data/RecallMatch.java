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
public class RecallMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recallmatch";

    @ProtobufIndex(index = 1)
    public boolean matched;
    public static ProtobufAdapter<RecallMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecallMatch>() { // from class: com.p1.mobile.putong.core.data.RecallMatch.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecallMatch recallMatch) {
            int iB = CodedOutputByteBufferNano.b(1, recallMatch.matched);
            ((MessageNano) recallMatch).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecallMatch m15285parse(nb5 nb5Var) throws IOException {
            RecallMatch recallMatch = new RecallMatch();
            while (nb5Var.u() == 8) {
                recallMatch.matched = nb5Var.g();
            }
            return recallMatch;
        }

        public void serialize(RecallMatch recallMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, recallMatch.matched);
        }
    };
    public static JsonAdapter<RecallMatch> JSON_ADAPTER = new ObjectJsonAdapter<RecallMatch>() { // from class: com.p1.mobile.putong.core.data.RecallMatch.2
        public Class getDataClass() {
            return RecallMatch.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RecallMatch m15286newInstance() {
            return new RecallMatch();
        }

        public boolean parseField(RecallMatch recallMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("matched")) {
                return false;
            }
            recallMatch.matched = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(RecallMatch recallMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("matched")) {
                return true;
            }
            return super.parseFieldCheck(recallMatch, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RecallMatch recallMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("matched", recallMatch.matched);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecallMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecallMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecallMatch new_() {
        RecallMatch recallMatch = new RecallMatch();
        recallMatch.nullCheck();
        return recallMatch;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecallMatch m15284clone() {
        RecallMatch recallMatch = new RecallMatch();
        recallMatch.matched = this.matched;
        return recallMatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RecallMatch) && this.matched == ((RecallMatch) obj).matched;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.matched ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
