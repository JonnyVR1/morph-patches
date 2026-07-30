package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class RecallMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recallmatch";

    @ProtobufIndex(index = 1)
    public boolean matched;
    public static ProtobufAdapter<RecallMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecallMatch>() { // from class: com.p1.mobile.putong.core.data.RecallMatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecallMatch recallMatch) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, recallMatch.matched);
            recallMatch.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecallMatch parse(nb5 nb5Var) throws IOException {
            RecallMatch recallMatch = new RecallMatch();
            while (nb5Var.m158752u() == 8) {
                recallMatch.matched = nb5Var.m158738g();
            }
            return recallMatch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecallMatch recallMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, recallMatch.matched);
        }
    };
    public static JsonAdapter<RecallMatch> JSON_ADAPTER = new ObjectJsonAdapter<RecallMatch>() { // from class: com.p1.mobile.putong.core.data.RecallMatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecallMatch.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecallMatch newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecallMatch recallMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("matched", recallMatch.matched);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecallMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecallMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecallMatch new_() {
        RecallMatch recallMatch = new RecallMatch();
        recallMatch.nullCheck();
        return recallMatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecallMatch mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.matched ? 1231 : 1237);
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
