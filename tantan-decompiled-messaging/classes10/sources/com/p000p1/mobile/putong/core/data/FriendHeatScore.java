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
public class FriendHeatScore extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "friendheatscore";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String marks;

    /* JADX INFO: renamed from: mm */
    @ProtobufIndex(index = 4)
    public int f56mm;

    @ProtobufIndex(index = 1)
    public int orderScore;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int score;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int showScore;
    public static ProtobufAdapter<FriendHeatScore> PROTOBUF_ADAPTER = new MessageNanoAdapter<FriendHeatScore>() { // from class: com.p1.mobile.putong.core.data.FriendHeatScore.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FriendHeatScore friendHeatScore) {
            int iH = CodedOutputByteBufferNano.h(1, friendHeatScore.orderScore) + CodedOutputByteBufferNano.h(2, friendHeatScore.showScore);
            String str = friendHeatScore.marks;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(4, friendHeatScore.f56mm) + CodedOutputByteBufferNano.h(5, friendHeatScore.score);
            ((MessageNano) friendHeatScore).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FriendHeatScore m12849parse(nb5 nb5Var) throws IOException {
            FriendHeatScore friendHeatScore = new FriendHeatScore();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (friendHeatScore.marks != null) {
                        break;
                    }
                    friendHeatScore.marks = "";
                    break;
                }
                if (iU == 8) {
                    friendHeatScore.orderScore = nb5Var.j();
                } else if (iU == 16) {
                    friendHeatScore.showScore = nb5Var.j();
                } else if (iU == 26) {
                    friendHeatScore.marks = nb5Var.s();
                } else if (iU == 32) {
                    friendHeatScore.f56mm = nb5Var.j();
                } else {
                    if (iU != 40) {
                        if (friendHeatScore.marks != null) {
                            break;
                        }
                        friendHeatScore.marks = "";
                        return friendHeatScore;
                    }
                    friendHeatScore.score = nb5Var.j();
                }
            }
            return friendHeatScore;
        }

        public void serialize(FriendHeatScore friendHeatScore, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, friendHeatScore.orderScore);
            codedOutputByteBufferNano.G(2, friendHeatScore.showScore);
            String str = friendHeatScore.marks;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            codedOutputByteBufferNano.G(4, friendHeatScore.f56mm);
            codedOutputByteBufferNano.G(5, friendHeatScore.score);
        }
    };
    public static JsonAdapter<FriendHeatScore> JSON_ADAPTER = new ObjectJsonAdapter<FriendHeatScore>() { // from class: com.p1.mobile.putong.core.data.FriendHeatScore.2
        public Class getDataClass() {
            return FriendHeatScore.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FriendHeatScore m12850newInstance() {
            return new FriendHeatScore();
        }

        public boolean parseField(FriendHeatScore friendHeatScore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showScore":
                    friendHeatScore.showScore = jsonParser.getValueAsInt();
                    return true;
                case "mm":
                    friendHeatScore.f56mm = jsonParser.getValueAsInt();
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

        public void serializeFields(FriendHeatScore friendHeatScore, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("orderScore", friendHeatScore.orderScore);
            jsonGenerator.writeNumberField("showScore", friendHeatScore.showScore);
            String str = friendHeatScore.marks;
            if (str != null) {
                jsonGenerator.writeStringField("marks", str);
            }
            jsonGenerator.writeNumberField("mm", friendHeatScore.f56mm);
            jsonGenerator.writeNumberField("score", friendHeatScore.score);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendHeatScore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendHeatScore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FriendHeatScore new_() {
        FriendHeatScore friendHeatScore = new FriendHeatScore();
        friendHeatScore.nullCheck();
        return friendHeatScore;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FriendHeatScore m12848clone() {
        FriendHeatScore friendHeatScore = new FriendHeatScore();
        friendHeatScore.orderScore = this.orderScore;
        friendHeatScore.showScore = this.showScore;
        friendHeatScore.marks = this.marks;
        friendHeatScore.f56mm = this.f56mm;
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
        return this.orderScore == friendHeatScore.orderScore && this.showScore == friendHeatScore.showScore && ValueObject.util_equals(this.marks, friendHeatScore.marks) && this.f56mm == friendHeatScore.f56mm && this.score == friendHeatScore.score;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.orderScore) * 41) + this.showScore) * 41;
        String str = this.marks;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.f56mm) * 41) + this.score;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.marks == null) {
            this.marks = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
