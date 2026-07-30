package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class MatchResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchresult";

    @ProtobufIndex(index = 1)
    public long code;

    @ProtobufIndex(index = 2)
    public int match_rate;

    @NonNull
    @ProtobufIndex(index = 3)
    public String message;
    public static ProtobufAdapter<MatchResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchResult>() { // from class: com.p1.mobile.putong.core.data.MatchResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatchResult matchResult) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, matchResult.code) + CodedOutputByteBufferNano.m17226h(2, matchResult.match_rate);
            String str = matchResult.message;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(3, str);
            }
            matchResult.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatchResult parse(nb5 nb5Var) throws IOException {
            MatchResult matchResult = new MatchResult();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (matchResult.message != null) {
                        break;
                    }
                    matchResult.message = "";
                    break;
                }
                if (iM158752u == 8) {
                    matchResult.code = nb5Var.m158742k();
                } else if (iM158752u == 16) {
                    matchResult.match_rate = nb5Var.m158741j();
                } else {
                    if (iM158752u != 26) {
                        if (matchResult.message != null) {
                            break;
                        }
                        matchResult.message = "";
                        return matchResult;
                    }
                    matchResult.message = nb5Var.m158750s();
                }
            }
            return matchResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatchResult matchResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, matchResult.code);
            codedOutputByteBufferNano.m17250G(2, matchResult.match_rate);
            String str = matchResult.message;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<MatchResult> JSON_ADAPTER = new ObjectJsonAdapter<MatchResult>() { // from class: com.p1.mobile.putong.core.data.MatchResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatchResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatchResult newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatchResult matchResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", matchResult.code);
            jsonGenerator.writeNumberField("match_rate", matchResult.match_rate);
            String str = matchResult.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchResult new_() {
        MatchResult matchResult = new MatchResult();
        matchResult.nullCheck();
        return matchResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatchResult mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.code;
        int i2 = ((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.match_rate) * 41;
        String str = this.message;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
