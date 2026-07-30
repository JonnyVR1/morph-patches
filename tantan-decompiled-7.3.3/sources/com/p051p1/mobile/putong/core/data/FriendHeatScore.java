package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class FriendHeatScore extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "friendheatscore";

    @NonNull
    @ProtobufIndex(index = 3)
    public String marks;

    /* JADX INFO: renamed from: mm */
    @ProtobufIndex(index = 4)
    public int f21136mm;

    @ProtobufIndex(index = 1)
    public int orderScore;

    @ProtobufIndex(index = 5)
    public int score;

    @ProtobufIndex(index = 2)
    public int showScore;
    public static ProtobufAdapter<FriendHeatScore> PROTOBUF_ADAPTER = new MessageNanoAdapter<FriendHeatScore>() { // from class: com.p1.mobile.putong.core.data.FriendHeatScore.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FriendHeatScore friendHeatScore) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, friendHeatScore.orderScore) + CodedOutputByteBufferNano.m17281h(2, friendHeatScore.showScore);
            String str = friendHeatScore.marks;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(4, friendHeatScore.f21136mm) + CodedOutputByteBufferNano.m17281h(5, friendHeatScore.score);
            friendHeatScore.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FriendHeatScore parse(nc5 nc5Var) throws IOException {
            FriendHeatScore friendHeatScore = new FriendHeatScore();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (friendHeatScore.marks != null) {
                        break;
                    }
                    friendHeatScore.marks = "";
                    break;
                }
                if (iM162497u == 8) {
                    friendHeatScore.orderScore = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    friendHeatScore.showScore = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    friendHeatScore.marks = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    friendHeatScore.f21136mm = nc5Var.m162486j();
                } else {
                    if (iM162497u != 40) {
                        if (friendHeatScore.marks != null) {
                            break;
                        }
                        friendHeatScore.marks = "";
                        return friendHeatScore;
                    }
                    friendHeatScore.score = nc5Var.m162486j();
                }
            }
            return friendHeatScore;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FriendHeatScore friendHeatScore, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, friendHeatScore.orderScore);
            codedOutputByteBufferNano.m17305G(2, friendHeatScore.showScore);
            String str = friendHeatScore.marks;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            codedOutputByteBufferNano.m17305G(4, friendHeatScore.f21136mm);
            codedOutputByteBufferNano.m17305G(5, friendHeatScore.score);
        }
    };
    public static JsonAdapter<FriendHeatScore> JSON_ADAPTER = new ObjectJsonAdapter<FriendHeatScore>() { // from class: com.p1.mobile.putong.core.data.FriendHeatScore.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FriendHeatScore.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FriendHeatScore newInstance() {
            return new FriendHeatScore();
        }

        public boolean parseField(FriendHeatScore friendHeatScore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showScore":
                    friendHeatScore.showScore = jsonParser.getValueAsInt();
                    return true;
                case "mm":
                    friendHeatScore.f21136mm = jsonParser.getValueAsInt();
                    return true;
                case "marks":
                    friendHeatScore.marks = jsonParser.getValueAsString();
                    return true;
                case "score":
                    friendHeatScore.score = jsonParser.getValueAsInt();
                    return true;
                case "orderScore":
                    friendHeatScore.orderScore = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FriendHeatScore friendHeatScore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showScore":
                case "mm":
                case "marks":
                case "score":
                case "orderScore":
                    return true;
                default:
                    return super.parseFieldCheck(friendHeatScore, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FriendHeatScore friendHeatScore, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("orderScore", friendHeatScore.orderScore);
            jsonGenerator.writeNumberField("showScore", friendHeatScore.showScore);
            String str = friendHeatScore.marks;
            if (str != null) {
                jsonGenerator.writeStringField("marks", str);
            }
            jsonGenerator.writeNumberField("mm", friendHeatScore.f21136mm);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, friendHeatScore.score);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendHeatScore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendHeatScore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FriendHeatScore new_() {
        FriendHeatScore friendHeatScore = new FriendHeatScore();
        friendHeatScore.nullCheck();
        return friendHeatScore;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FriendHeatScore mo225055clone() {
        FriendHeatScore friendHeatScore = new FriendHeatScore();
        friendHeatScore.orderScore = this.orderScore;
        friendHeatScore.showScore = this.showScore;
        friendHeatScore.marks = this.marks;
        friendHeatScore.f21136mm = this.f21136mm;
        friendHeatScore.score = this.score;
        return friendHeatScore;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendHeatScore)) {
            return false;
        }
        FriendHeatScore friendHeatScore = (FriendHeatScore) obj;
        return this.orderScore == friendHeatScore.orderScore && this.showScore == friendHeatScore.showScore && ValueObject.util_equals(this.marks, friendHeatScore.marks) && this.f21136mm == friendHeatScore.f21136mm && this.score == friendHeatScore.score;
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
        int i2 = ((((i * 41) + this.orderScore) * 41) + this.showScore) * 41;
        String str = this.marks;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.f21136mm) * 41) + this.score;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.marks == null) {
            this.marks = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
