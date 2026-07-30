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
public class BLiveVoiceUserGiftItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserGiftItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserGiftItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserGiftItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserGiftItem newInstance() {
            return new BLiveVoiceUserGiftItem();
        }

        public boolean parseField(BLiveVoiceUserGiftItem bLiveVoiceUserGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftUrl":
                    bLiveVoiceUserGiftItem.giftUrl = jsonParser.getValueAsString();
                    return true;
                case "lightUp":
                    bLiveVoiceUserGiftItem.lightUp = jsonParser.getValueAsBoolean();
                    return true;
                case "giftCount":
                    bLiveVoiceUserGiftItem.giftCount = jsonParser.getValueAsInt();
                    return true;
                case "giftPrice":
                    bLiveVoiceUserGiftItem.giftPrice = jsonParser.getValueAsInt();
                    return true;
                case "giftName":
                    bLiveVoiceUserGiftItem.giftName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserGiftItem bLiveVoiceUserGiftItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceUserGiftItem.giftUrl;
            if (str != null) {
                jsonGenerator.writeStringField("giftUrl", str);
            }
            String str2 = bLiveVoiceUserGiftItem.giftName;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftName", str2);
            }
            jsonGenerator.writeNumberField("giftCount", bLiveVoiceUserGiftItem.giftCount);
            jsonGenerator.writeNumberField("giftPrice", bLiveVoiceUserGiftItem.giftPrice);
            jsonGenerator.writeBooleanField("lightUp", bLiveVoiceUserGiftItem.lightUp);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceusergiftitem";

    @ProtobufIndex(index = 3)
    public int giftCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftName;

    @ProtobufIndex(index = 4)
    public int giftPrice;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftUrl;

    @ProtobufIndex(index = 5)
    public boolean lightUp;

    public static BLiveVoiceUserGiftItem new_() {
        BLiveVoiceUserGiftItem bLiveVoiceUserGiftItem = new BLiveVoiceUserGiftItem();
        bLiveVoiceUserGiftItem.nullCheck();
        return bLiveVoiceUserGiftItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserGiftItem mo223809clone() {
        BLiveVoiceUserGiftItem bLiveVoiceUserGiftItem = new BLiveVoiceUserGiftItem();
        bLiveVoiceUserGiftItem.giftUrl = this.giftUrl;
        bLiveVoiceUserGiftItem.giftName = this.giftName;
        bLiveVoiceUserGiftItem.giftCount = this.giftCount;
        bLiveVoiceUserGiftItem.giftPrice = this.giftPrice;
        bLiveVoiceUserGiftItem.lightUp = this.lightUp;
        return bLiveVoiceUserGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceUserGiftItem)) {
            return false;
        }
        BLiveVoiceUserGiftItem bLiveVoiceUserGiftItem = (BLiveVoiceUserGiftItem) obj;
        return ValueObject.util_equals(this.giftUrl, bLiveVoiceUserGiftItem.giftUrl) && ValueObject.util_equals(this.giftName, bLiveVoiceUserGiftItem.giftName) && this.giftCount == bLiveVoiceUserGiftItem.giftCount && this.giftPrice == bLiveVoiceUserGiftItem.giftPrice && this.lightUp == bLiveVoiceUserGiftItem.lightUp;
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
        String str = this.giftUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giftName;
        int iHashCode2 = ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.giftCount) * 41) + this.giftPrice) * 41) + (this.lightUp ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftUrl == null) {
            this.giftUrl = "";
        }
        if (this.giftName == null) {
            this.giftName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
