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
public class SuggestedTimeLimitedMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "suggestedtimelimitedmatch";

    @ProtobufIndex(index = 1)
    public long expiredTimestamp;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String recommendedUserId;
    public static ProtobufAdapter<SuggestedTimeLimitedMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuggestedTimeLimitedMatch>() { // from class: com.p1.mobile.putong.core.data.SuggestedTimeLimitedMatch.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SuggestedTimeLimitedMatch suggestedTimeLimitedMatch) {
            int iJ = CodedOutputByteBufferNano.j(1, suggestedTimeLimitedMatch.expiredTimestamp);
            String str = suggestedTimeLimitedMatch.recommendedUserId;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) suggestedTimeLimitedMatch).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SuggestedTimeLimitedMatch m15812parse(nb5 nb5Var) throws IOException {
            SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = new SuggestedTimeLimitedMatch();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (suggestedTimeLimitedMatch.recommendedUserId != null) {
                        break;
                    }
                    suggestedTimeLimitedMatch.recommendedUserId = "";
                    break;
                }
                if (iU == 8) {
                    suggestedTimeLimitedMatch.expiredTimestamp = nb5Var.k();
                } else {
                    if (iU != 18) {
                        if (suggestedTimeLimitedMatch.recommendedUserId != null) {
                            break;
                        }
                        suggestedTimeLimitedMatch.recommendedUserId = "";
                        return suggestedTimeLimitedMatch;
                    }
                    suggestedTimeLimitedMatch.recommendedUserId = nb5Var.s();
                }
            }
            return suggestedTimeLimitedMatch;
        }

        public void serialize(SuggestedTimeLimitedMatch suggestedTimeLimitedMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, suggestedTimeLimitedMatch.expiredTimestamp);
            String str = suggestedTimeLimitedMatch.recommendedUserId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<SuggestedTimeLimitedMatch> JSON_ADAPTER = new ObjectJsonAdapter<SuggestedTimeLimitedMatch>() { // from class: com.p1.mobile.putong.core.data.SuggestedTimeLimitedMatch.2
        public Class getDataClass() {
            return SuggestedTimeLimitedMatch.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SuggestedTimeLimitedMatch m15813newInstance() {
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

        public void serializeFields(SuggestedTimeLimitedMatch suggestedTimeLimitedMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("expiredTimestamp", suggestedTimeLimitedMatch.expiredTimestamp);
            String str = suggestedTimeLimitedMatch.recommendedUserId;
            if (str != null) {
                jsonGenerator.writeStringField("recommendedUserId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuggestedTimeLimitedMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuggestedTimeLimitedMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuggestedTimeLimitedMatch new_() {
        SuggestedTimeLimitedMatch suggestedTimeLimitedMatch = new SuggestedTimeLimitedMatch();
        suggestedTimeLimitedMatch.nullCheck();
        return suggestedTimeLimitedMatch;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SuggestedTimeLimitedMatch m15811clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.expiredTimestamp;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.recommendedUserId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.recommendedUserId == null) {
            this.recommendedUserId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
