package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Shows;
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
public class BLiveLotteryGiftRedPacketAnimationMsg extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLotteryGiftRedPacketAnimationMsg> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLotteryGiftRedPacketAnimationMsg>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketAnimationMsg.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLotteryGiftRedPacketAnimationMsg.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLotteryGiftRedPacketAnimationMsg newInstance() {
            return new BLiveLotteryGiftRedPacketAnimationMsg();
        }

        public boolean parseField(BLiveLotteryGiftRedPacketAnimationMsg bLiveLotteryGiftRedPacketAnimationMsg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sender":
                    bLiveLotteryGiftRedPacketAnimationMsg.sender = BLiveLotteryGiftRedPacketSender.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showMillisecond":
                    bLiveLotteryGiftRedPacketAnimationMsg.showMillisecond = jsonParser.getValueAsInt();
                    return true;
                case "gift":
                    bLiveLotteryGiftRedPacketAnimationMsg.gift = BLiveLotteryGiftRedPacketGift.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLotteryGiftRedPacketAnimationMsg bLiveLotteryGiftRedPacketAnimationMsg, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveLotteryGiftRedPacketAnimationMsg.sender != null) {
                jsonGenerator.writeFieldName(Shows.sender);
                BLiveLotteryGiftRedPacketSender.JSON_ADAPTER.serialize(bLiveLotteryGiftRedPacketAnimationMsg.sender, jsonGenerator, true);
            }
            if (bLiveLotteryGiftRedPacketAnimationMsg.gift != null) {
                jsonGenerator.writeFieldName("gift");
                BLiveLotteryGiftRedPacketGift.JSON_ADAPTER.serialize(bLiveLotteryGiftRedPacketAnimationMsg.gift, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("showMillisecond", bLiveLotteryGiftRedPacketAnimationMsg.showMillisecond);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLotteryGiftRedPacketAnimationMsg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivelotterygiftredpacketanimationmsg";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveLotteryGiftRedPacketGift gift;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveLotteryGiftRedPacketSender sender;

    @ProtobufIndex(index = 3)
    public int showMillisecond;

    public static BLiveLotteryGiftRedPacketAnimationMsg new_() {
        BLiveLotteryGiftRedPacketAnimationMsg bLiveLotteryGiftRedPacketAnimationMsg = new BLiveLotteryGiftRedPacketAnimationMsg();
        bLiveLotteryGiftRedPacketAnimationMsg.nullCheck();
        return bLiveLotteryGiftRedPacketAnimationMsg;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLotteryGiftRedPacketAnimationMsg mo223809clone() {
        BLiveLotteryGiftRedPacketAnimationMsg bLiveLotteryGiftRedPacketAnimationMsg = new BLiveLotteryGiftRedPacketAnimationMsg();
        BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender = this.sender;
        if (bLiveLotteryGiftRedPacketSender != null) {
            bLiveLotteryGiftRedPacketAnimationMsg.sender = bLiveLotteryGiftRedPacketSender.mo223809clone();
        }
        BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift = this.gift;
        if (bLiveLotteryGiftRedPacketGift != null) {
            bLiveLotteryGiftRedPacketAnimationMsg.gift = bLiveLotteryGiftRedPacketGift.mo223809clone();
        }
        bLiveLotteryGiftRedPacketAnimationMsg.showMillisecond = this.showMillisecond;
        return bLiveLotteryGiftRedPacketAnimationMsg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLotteryGiftRedPacketAnimationMsg)) {
            return false;
        }
        BLiveLotteryGiftRedPacketAnimationMsg bLiveLotteryGiftRedPacketAnimationMsg = (BLiveLotteryGiftRedPacketAnimationMsg) obj;
        return ValueObject.util_equals(this.sender, bLiveLotteryGiftRedPacketAnimationMsg.sender) && ValueObject.util_equals(this.gift, bLiveLotteryGiftRedPacketAnimationMsg.gift) && this.showMillisecond == bLiveLotteryGiftRedPacketAnimationMsg.showMillisecond;
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
        BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender = this.sender;
        int iHashCode = (i2 + (bLiveLotteryGiftRedPacketSender != null ? bLiveLotteryGiftRedPacketSender.hashCode() : 0)) * 41;
        BLiveLotteryGiftRedPacketGift bLiveLotteryGiftRedPacketGift = this.gift;
        int iHashCode2 = ((iHashCode + (bLiveLotteryGiftRedPacketGift != null ? bLiveLotteryGiftRedPacketGift.hashCode() : 0)) * 41) + this.showMillisecond;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.sender == null) {
            this.sender = BLiveLotteryGiftRedPacketSender.new_();
        }
        if (this.gift == null) {
            this.gift = BLiveLotteryGiftRedPacketGift.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
