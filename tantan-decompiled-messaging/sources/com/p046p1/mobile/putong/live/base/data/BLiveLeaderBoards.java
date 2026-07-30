package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveLeaderBoards extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLeaderBoards> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLeaderBoards>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLeaderBoards.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLeaderBoards.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLeaderBoards newInstance() {
            return new BLiveLeaderBoards();
        }

        public boolean parseField(BLiveLeaderBoards bLiveLeaderBoards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveLeaderBoards.amount = jsonParser.getValueAsDouble();
                    return true;
                case "userNameGradientColors":
                    bLiveLeaderBoards.userNameGradientColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveLeaderBoards.f44393id = jsonParser.getValueAsString();
                    return false;
                case "gap":
                    bLiveLeaderBoards.gap = jsonParser.getValueAsDouble();
                    return true;
                case "rank":
                    bLiveLeaderBoards.rank = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    bLiveLeaderBoards.type = jsonParser.getValueAsString();
                    return true;
                case "owner":
                    bLiveLeaderBoards.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "rankDiff":
                    bLiveLeaderBoards.rankDiff = jsonParser.getValueAsInt();
                    return true;
                case "rankType":
                    bLiveLeaderBoards.rankType = jsonParser.getValueAsString();
                    return true;
                case "isNewUser":
                    bLiveLeaderBoards.isNewUser = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLeaderBoards bLiveLeaderBoards, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLeaderBoards.f44393id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveLeaderBoards.rank);
            if (bLiveLeaderBoards.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(bLiveLeaderBoards.owner, jsonGenerator, true);
            }
            String str2 = bLiveLeaderBoards.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("amount", bLiveLeaderBoards.amount);
            String str3 = bLiveLeaderBoards.rankType;
            if (str3 != null) {
                jsonGenerator.writeStringField("rankType", str3);
            }
            jsonGenerator.writeBooleanField("isNewUser", bLiveLeaderBoards.isNewUser);
            jsonGenerator.writeNumberField("rankDiff", bLiveLeaderBoards.rankDiff);
            jsonGenerator.writeNumberField("gap", bLiveLeaderBoards.gap);
            if (bLiveLeaderBoards.userNameGradientColors != null) {
                jsonGenerator.writeFieldName("userNameGradientColors");
                JsonAdapter.serializeArray(bLiveLeaderBoards.userNameGradientColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLeaderBoards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveleaderboards";

    @ProtobufIndex(index = 5)
    public double amount;

    @ProtobufIndex(index = 6)
    public double gap;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44393id;
    public boolean isFooter;
    public boolean isFooterDesc = false;

    @ProtobufIndex(index = 8)
    public boolean isNewUser;
    public BLiveUserLevel liveUserLevel;

    @NonNull
    @ProtobufIndex(index = 3)
    public String owner;

    @ProtobufIndex(index = 2)
    public int rank;

    @ProtobufIndex(index = 9)
    public int rankDiff;

    @NonNull
    @ProtobufIndex(index = 7)
    public String rankType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;
    public User user;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<String> userNameGradientColors;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68042a(String str) {
        return str;
    }

    public static BLiveLeaderBoards new_() {
        BLiveLeaderBoards bLiveLeaderBoards = new BLiveLeaderBoards();
        bLiveLeaderBoards.nullCheck();
        return bLiveLeaderBoards;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLeaderBoards mo223809clone() {
        BLiveLeaderBoards bLiveLeaderBoards = new BLiveLeaderBoards();
        bLiveLeaderBoards.f44393id = this.f44393id;
        bLiveLeaderBoards.rank = this.rank;
        bLiveLeaderBoards.owner = this.owner;
        bLiveLeaderBoards.type = this.type;
        bLiveLeaderBoards.amount = this.amount;
        bLiveLeaderBoards.rankType = this.rankType;
        bLiveLeaderBoards.isNewUser = this.isNewUser;
        bLiveLeaderBoards.rankDiff = this.rankDiff;
        bLiveLeaderBoards.gap = this.gap;
        List<String> list = this.userNameGradientColors;
        if (list != null) {
            bLiveLeaderBoards.userNameGradientColors = ValueObject.util_map(list, new w9j() { // from class: l.w12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveLeaderBoards.m68042a((String) obj);
                }
            });
        }
        return bLiveLeaderBoards;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLeaderBoards)) {
            return false;
        }
        BLiveLeaderBoards bLiveLeaderBoards = (BLiveLeaderBoards) obj;
        return ValueObject.util_equals(this.f44393id, bLiveLeaderBoards.f44393id) && this.rank == bLiveLeaderBoards.rank && ValueObject.util_equals(this.owner, bLiveLeaderBoards.owner) && ValueObject.util_equals(this.type, bLiveLeaderBoards.type) && this.amount == bLiveLeaderBoards.amount && ValueObject.util_equals(this.rankType, bLiveLeaderBoards.rankType) && this.isNewUser == bLiveLeaderBoards.isNewUser && this.rankDiff == bLiveLeaderBoards.rankDiff && this.gap == bLiveLeaderBoards.gap && ValueObject.util_equals(this.userNameGradientColors, bLiveLeaderBoards.userNameGradientColors);
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
        int i2 = i * 41;
        String str = this.f44393id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.rank) * 41;
        String str2 = this.owner;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str4 = this.rankType;
        int iHashCode4 = ((((i3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.isNewUser ? 1231 : 1237)) * 41) + this.rankDiff;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.gap);
        int i4 = ((iHashCode4 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        List<String> list = this.userNameGradientColors;
        int iHashCode5 = i4 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44393id == null) {
            this.f44393id = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.rankType == null) {
            this.rankType = "";
        }
        if (this.userNameGradientColors == null) {
            this.userNameGradientColors = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
