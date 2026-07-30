package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftStarInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftStarInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftStarInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftStarInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftStarInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftStarInfo newInstance() {
            return new BLiveGiftStarInfo();
        }

        public boolean parseField(BLiveGiftStarInfo bLiveGiftStarInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveGiftStarInfo.amount = jsonParser.getValueAsInt();
                    return true;
                case "giftId":
                    bLiveGiftStarInfo.giftId = jsonParser.getValueAsInt();
                    return true;
                case "liveId":
                    bLiveGiftStarInfo.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveGiftStarInfo.roomId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveGiftStarInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveGiftStarInfo.userName = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    bLiveGiftStarInfo.rank = jsonParser.getValueAsInt();
                    return true;
                case "userImage":
                    bLiveGiftStarInfo.userImage = jsonParser.getValueAsString();
                    return true;
                case "giftIcon":
                    bLiveGiftStarInfo.giftIcon = jsonParser.getValueAsString();
                    return true;
                case "rankShowLimit":
                    bLiveGiftStarInfo.rankShowLimit = jsonParser.getValueAsInt();
                    return true;
                case "liveState":
                    bLiveGiftStarInfo.liveState = BLiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftStarInfo bLiveGiftStarInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftStarInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("giftId", bLiveGiftStarInfo.giftId);
            String str2 = bLiveGiftStarInfo.giftIcon;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftIcon", str2);
            }
            jsonGenerator.writeNumberField("amount", bLiveGiftStarInfo.amount);
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveGiftStarInfo.rank);
            String str3 = bLiveGiftStarInfo.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
            String str4 = bLiveGiftStarInfo.liveId;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveId", str4);
            }
            String str5 = bLiveGiftStarInfo.userImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("userImage", str5);
            }
            String str6 = bLiveGiftStarInfo.userName;
            if (str6 != null) {
                jsonGenerator.writeStringField("userName", str6);
            }
            if (bLiveGiftStarInfo.liveState != null) {
                jsonGenerator.writeFieldName("liveState");
                BLiveState.JSON_ADAPTER.serialize(bLiveGiftStarInfo.liveState, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("rankShowLimit", bLiveGiftStarInfo.rankShowLimit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftStarInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftstarinfo";

    @ProtobufIndex(index = 4)
    public int amount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftIcon;

    @ProtobufIndex(index = 2)
    public int giftId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveState liveState;

    @ProtobufIndex(index = 5)
    public int rank;

    @ProtobufIndex(index = 11)
    public int rankShowLimit;

    @NonNull
    @ProtobufIndex(index = 6)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String userImage;

    @NonNull
    @ProtobufIndex(index = 9)
    public String userName;

    public static BLiveGiftStarInfo new_() {
        BLiveGiftStarInfo bLiveGiftStarInfo = new BLiveGiftStarInfo();
        bLiveGiftStarInfo.nullCheck();
        return bLiveGiftStarInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftStarInfo mo223809clone() {
        BLiveGiftStarInfo bLiveGiftStarInfo = new BLiveGiftStarInfo();
        bLiveGiftStarInfo.userId = this.userId;
        bLiveGiftStarInfo.giftId = this.giftId;
        bLiveGiftStarInfo.giftIcon = this.giftIcon;
        bLiveGiftStarInfo.amount = this.amount;
        bLiveGiftStarInfo.rank = this.rank;
        bLiveGiftStarInfo.roomId = this.roomId;
        bLiveGiftStarInfo.liveId = this.liveId;
        bLiveGiftStarInfo.userImage = this.userImage;
        bLiveGiftStarInfo.userName = this.userName;
        bLiveGiftStarInfo.liveState = this.liveState;
        bLiveGiftStarInfo.rankShowLimit = this.rankShowLimit;
        return bLiveGiftStarInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftStarInfo)) {
            return false;
        }
        BLiveGiftStarInfo bLiveGiftStarInfo = (BLiveGiftStarInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveGiftStarInfo.userId) && this.giftId == bLiveGiftStarInfo.giftId && ValueObject.util_equals(this.giftIcon, bLiveGiftStarInfo.giftIcon) && this.amount == bLiveGiftStarInfo.amount && this.rank == bLiveGiftStarInfo.rank && ValueObject.util_equals(this.roomId, bLiveGiftStarInfo.roomId) && ValueObject.util_equals(this.liveId, bLiveGiftStarInfo.liveId) && ValueObject.util_equals(this.userImage, bLiveGiftStarInfo.userImage) && ValueObject.util_equals(this.userName, bLiveGiftStarInfo.userName) && ValueObject.util_equals(this.liveState, bLiveGiftStarInfo.liveState) && this.rankShowLimit == bLiveGiftStarInfo.rankShowLimit;
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
        String str = this.userId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.giftId) * 41;
        String str2 = this.giftIcon;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.amount) * 41) + this.rank) * 41;
        String str3 = this.roomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userImage;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.userName;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLiveState bLiveState = this.liveState;
        int iHashCode7 = ((iHashCode6 + (bLiveState != null ? bLiveState.hashCode() : 0)) * 41) + this.rankShowLimit;
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.giftIcon == null) {
            this.giftIcon = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.liveState == null) {
            this.liveState = (BLiveState) BLiveState.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
