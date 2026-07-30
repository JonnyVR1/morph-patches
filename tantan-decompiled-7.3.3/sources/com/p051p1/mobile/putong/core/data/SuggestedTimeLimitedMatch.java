package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class SuggestedTimeLimitedMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "suggestedtimelimitedmatch";

    @ProtobufIndex(index = 1)
    public long expiredTimestamp;

    @NonNull
    @ProtobufIndex(index = 2)
    public String recommendedUserId;
    public static ProtobufAdapter<SuggestedTimeLimitedMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuggestedTimeLimitedMatch>() { // from class: com.p1.mobile.putong.core.data.SuggestedTimeLimitedMatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SuggestedTimeLimitedMatch suggestedTimeLimitedMatch) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, suggestedTimeLimitedMatch.expiredTimestamp);
            String str = suggestedTimeLimitedMatch.recommendedUserId;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            suggestedTimeLimitedMatch.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SuggestedTimeLimitedMatch parse(nc5 nc5Var) throws IOException {
            SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = new SuggestedTimeLimitedMatch();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (suggestedTimeLimitedMatch.recommendedUserId != null) {
                        break;
                    }
                    suggestedTimeLimitedMatch.recommendedUserId = "";
                    break;
                }
                if (iM162497u == 8) {
                    suggestedTimeLimitedMatch.expiredTimestamp = nc5Var.m162487k();
                } else {
                    if (iM162497u != 18) {
                        if (suggestedTimeLimitedMatch.recommendedUserId != null) {
                            break;
                        }
                        suggestedTimeLimitedMatch.recommendedUserId = "";
                        return suggestedTimeLimitedMatch;
                    }
                    suggestedTimeLimitedMatch.recommendedUserId = nc5Var.m162495s();
                }
            }
            return suggestedTimeLimitedMatch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SuggestedTimeLimitedMatch suggestedTimeLimitedMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, suggestedTimeLimitedMatch.expiredTimestamp);
            String str = suggestedTimeLimitedMatch.recommendedUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<SuggestedTimeLimitedMatch> JSON_ADAPTER = new ObjectJsonAdapter<SuggestedTimeLimitedMatch>() { // from class: com.p1.mobile.putong.core.data.SuggestedTimeLimitedMatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SuggestedTimeLimitedMatch.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SuggestedTimeLimitedMatch newInstance() {
            return new SuggestedTimeLimitedMatch();
        }

        public boolean parseField(SuggestedTimeLimitedMatch suggestedTimeLimitedMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expiredTimestamp")) {
                suggestedTimeLimitedMatch.expiredTimestamp = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("recommendedUserId")) {
                return false;
            }
            suggestedTimeLimitedMatch.recommendedUserId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SuggestedTimeLimitedMatch suggestedTimeLimitedMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expiredTimestamp") || str.equals("recommendedUserId")) {
                return true;
            }
            return super.parseFieldCheck(suggestedTimeLimitedMatch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SuggestedTimeLimitedMatch suggestedTimeLimitedMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("expiredTimestamp", suggestedTimeLimitedMatch.expiredTimestamp);
            String str = suggestedTimeLimitedMatch.recommendedUserId;
            if (str != null) {
                jsonGenerator.writeStringField("recommendedUserId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuggestedTimeLimitedMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuggestedTimeLimitedMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuggestedTimeLimitedMatch new_() {
        SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = new SuggestedTimeLimitedMatch();
        suggestedTimeLimitedMatch.nullCheck();
        return suggestedTimeLimitedMatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SuggestedTimeLimitedMatch mo225055clone() {
        SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = new SuggestedTimeLimitedMatch();
        suggestedTimeLimitedMatch.expiredTimestamp = this.expiredTimestamp;
        suggestedTimeLimitedMatch.recommendedUserId = this.recommendedUserId;
        return suggestedTimeLimitedMatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuggestedTimeLimitedMatch)) {
            return false;
        }
        SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = (SuggestedTimeLimitedMatch) obj;
        return this.expiredTimestamp == suggestedTimeLimitedMatch.expiredTimestamp && ValueObject.util_equals(this.recommendedUserId, suggestedTimeLimitedMatch.recommendedUserId);
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
        long j = this.expiredTimestamp;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.recommendedUserId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.recommendedUserId == null) {
            this.recommendedUserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
