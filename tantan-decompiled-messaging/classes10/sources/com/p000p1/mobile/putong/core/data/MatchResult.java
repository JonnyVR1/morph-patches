package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class MatchResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchresult";

    @ProtobufIndex(index = 1)
    public long code;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int match_rate;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String message;
    public static ProtobufAdapter<MatchResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchResult>() { // from class: com.p1.mobile.putong.core.data.MatchResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MatchResult matchResult) {
            int iJ = CodedOutputByteBufferNano.j(1, matchResult.code) + CodedOutputByteBufferNano.h(2, matchResult.match_rate);
            String str = matchResult.message;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) matchResult).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MatchResult m14073parse(nb5 nb5Var) throws IOException {
            MatchResult matchResult = new MatchResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (matchResult.message != null) {
                        break;
                    }
                    matchResult.message = "";
                    break;
                }
                if (iU == 8) {
                    matchResult.code = nb5Var.k();
                } else if (iU == 16) {
                    matchResult.match_rate = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (matchResult.message != null) {
                            break;
                        }
                        matchResult.message = "";
                        return matchResult;
                    }
                    matchResult.message = nb5Var.s();
                }
            }
            return matchResult;
        }

        public void serialize(MatchResult matchResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, matchResult.code);
            codedOutputByteBufferNano.G(2, matchResult.match_rate);
            String str = matchResult.message;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<MatchResult> JSON_ADAPTER = new ObjectJsonAdapter<MatchResult>() { // from class: com.p1.mobile.putong.core.data.MatchResult.2
        public Class getDataClass() {
            return MatchResult.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MatchResult m14074newInstance() {
            return new MatchResult();
        }

        public boolean parseField(MatchResult matchResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "code":
                    matchResult.code = jsonParser.getValueAsLong();
                    return true;
                case "message":
                    matchResult.message = jsonParser.getValueAsString();
                    return true;
                case "match_rate":
                    matchResult.match_rate = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MatchResult matchResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "code":
                case "message":
                case "match_rate":
                    return true;
                default:
                    return super.parseFieldCheck(matchResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MatchResult matchResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", matchResult.code);
            jsonGenerator.writeNumberField("match_rate", matchResult.match_rate);
            String str = matchResult.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchResult new_() {
        MatchResult matchResult = new MatchResult();
        matchResult.nullCheck();
        return matchResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MatchResult m14072clone() {
        MatchResult matchResult = new MatchResult();
        matchResult.code = this.code;
        matchResult.match_rate = this.match_rate;
        matchResult.message = this.message;
        return matchResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchResult)) {
            return false;
        }
        MatchResult matchResult = (MatchResult) obj;
        return this.code == matchResult.code && this.match_rate == matchResult.match_rate && ValueObject.util_equals(this.message, matchResult.message);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.code;
        int i2 = ((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.match_rate) * 41;
        String str = this.message;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
