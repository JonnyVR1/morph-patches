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
public class BLiveHourLeaderBoardBattleGiftItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHourLeaderBoardBattleGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHourLeaderBoardBattleGiftItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardBattleGiftItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHourLeaderBoardBattleGiftItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHourLeaderBoardBattleGiftItem newInstance() {
            return new BLiveHourLeaderBoardBattleGiftItem();
        }

        public boolean parseField(BLiveHourLeaderBoardBattleGiftItem bLiveHourLeaderBoardBattleGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "threshold":
                    bLiveHourLeaderBoardBattleGiftItem.threshold = jsonParser.getValueAsLong();
                    return true;
                case "giftPrice":
                    bLiveHourLeaderBoardBattleGiftItem.giftPrice = jsonParser.getValueAsLong();
                    return true;
                case "giftIcon":
                    bLiveHourLeaderBoardBattleGiftItem.giftIcon = jsonParser.getValueAsString();
                    return true;
                case "giftName":
                    bLiveHourLeaderBoardBattleGiftItem.giftName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHourLeaderBoardBattleGiftItem bLiveHourLeaderBoardBattleGiftItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveHourLeaderBoardBattleGiftItem.giftName;
            if (str != null) {
                jsonGenerator.writeStringField("giftName", str);
            }
            String str2 = bLiveHourLeaderBoardBattleGiftItem.giftIcon;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftIcon", str2);
            }
            jsonGenerator.writeNumberField("giftPrice", bLiveHourLeaderBoardBattleGiftItem.giftPrice);
            jsonGenerator.writeNumberField("threshold", bLiveHourLeaderBoardBattleGiftItem.threshold);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHourLeaderBoardBattleGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivehourleaderboardbattlegiftitem";

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftIcon;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftName;

    @ProtobufIndex(index = 3)
    public long giftPrice;

    @ProtobufIndex(index = 4)
    public long threshold;

    public static BLiveHourLeaderBoardBattleGiftItem new_() {
        BLiveHourLeaderBoardBattleGiftItem bLiveHourLeaderBoardBattleGiftItem = new BLiveHourLeaderBoardBattleGiftItem();
        bLiveHourLeaderBoardBattleGiftItem.nullCheck();
        return bLiveHourLeaderBoardBattleGiftItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHourLeaderBoardBattleGiftItem mo223809clone() {
        BLiveHourLeaderBoardBattleGiftItem bLiveHourLeaderBoardBattleGiftItem = new BLiveHourLeaderBoardBattleGiftItem();
        bLiveHourLeaderBoardBattleGiftItem.giftName = this.giftName;
        bLiveHourLeaderBoardBattleGiftItem.giftIcon = this.giftIcon;
        bLiveHourLeaderBoardBattleGiftItem.giftPrice = this.giftPrice;
        bLiveHourLeaderBoardBattleGiftItem.threshold = this.threshold;
        return bLiveHourLeaderBoardBattleGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHourLeaderBoardBattleGiftItem)) {
            return false;
        }
        BLiveHourLeaderBoardBattleGiftItem bLiveHourLeaderBoardBattleGiftItem = (BLiveHourLeaderBoardBattleGiftItem) obj;
        return ValueObject.util_equals(this.giftName, bLiveHourLeaderBoardBattleGiftItem.giftName) && ValueObject.util_equals(this.giftIcon, bLiveHourLeaderBoardBattleGiftItem.giftIcon) && this.giftPrice == bLiveHourLeaderBoardBattleGiftItem.giftPrice && this.threshold == bLiveHourLeaderBoardBattleGiftItem.threshold;
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
        String str = this.giftName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giftIcon;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.giftPrice;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.threshold;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftName == null) {
            this.giftName = "";
        }
        if (this.giftIcon == null) {
            this.giftIcon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
