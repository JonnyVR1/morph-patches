package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceGiftItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGiftItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGiftItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGiftItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGiftItem newInstance() {
            return new BLiveVoiceGiftItem();
        }

        public boolean parseField(BLiveVoiceGiftItem bLiveVoiceGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "mvpAmount":
                    bLiveVoiceGiftItem.mvpAmount = jsonParser.getValueAsInt();
                    return true;
                case "mvpAvatar":
                    bLiveVoiceGiftItem.mvpAvatar = jsonParser.getValueAsString();
                    return true;
                case "amount":
                    bLiveVoiceGiftItem.amount = jsonParser.getValueAsInt();
                    return true;
                case "mvpUserId":
                    bLiveVoiceGiftItem.mvpUserId = jsonParser.getValueAsString();
                    return true;
                case "unlocked":
                    bLiveVoiceGiftItem.unlocked = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveVoiceGiftItem.f45346id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveVoiceGiftItem.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveVoiceGiftItem.name = jsonParser.getValueAsString();
                    return true;
                case "interact":
                    bLiveVoiceGiftItem.interact = BLiveVoiceGiftWallGiftItemInteract.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGiftItem bLiveVoiceGiftItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGiftItem.f45346id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceGiftItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveVoiceGiftItem.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            jsonGenerator.writeBooleanField("unlocked", bLiveVoiceGiftItem.unlocked);
            String str4 = bLiveVoiceGiftItem.mvpUserId;
            if (str4 != null) {
                jsonGenerator.writeStringField("mvpUserId", str4);
            }
            jsonGenerator.writeNumberField("mvpAmount", bLiveVoiceGiftItem.mvpAmount);
            String str5 = bLiveVoiceGiftItem.mvpAvatar;
            if (str5 != null) {
                jsonGenerator.writeStringField("mvpAvatar", str5);
            }
            if (bLiveVoiceGiftItem.interact != null) {
                jsonGenerator.writeFieldName("interact");
                BLiveVoiceGiftWallGiftItemInteract.JSON_ADAPTER.serialize(bLiveVoiceGiftItem.interact, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("amount", bLiveVoiceGiftItem.amount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegiftitem";

    @ProtobufIndex(index = 9)
    public int amount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45346id;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveVoiceGiftWallGiftItemInteract interact;

    @ProtobufIndex(index = 5)
    public int mvpAmount;

    @NonNull
    @ProtobufIndex(index = 6)
    public String mvpAvatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mvpUserId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 8)
    public boolean unlocked;

    public static BLiveVoiceGiftItem new_() {
        BLiveVoiceGiftItem bLiveVoiceGiftItem = new BLiveVoiceGiftItem();
        bLiveVoiceGiftItem.nullCheck();
        return bLiveVoiceGiftItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGiftItem mo225055clone() {
        BLiveVoiceGiftItem bLiveVoiceGiftItem = new BLiveVoiceGiftItem();
        bLiveVoiceGiftItem.f45346id = this.f45346id;
        bLiveVoiceGiftItem.name = this.name;
        bLiveVoiceGiftItem.icon = this.icon;
        bLiveVoiceGiftItem.unlocked = this.unlocked;
        bLiveVoiceGiftItem.mvpUserId = this.mvpUserId;
        bLiveVoiceGiftItem.mvpAmount = this.mvpAmount;
        bLiveVoiceGiftItem.mvpAvatar = this.mvpAvatar;
        BLiveVoiceGiftWallGiftItemInteract bLiveVoiceGiftWallGiftItemInteract = this.interact;
        if (bLiveVoiceGiftWallGiftItemInteract != null) {
            bLiveVoiceGiftItem.interact = bLiveVoiceGiftWallGiftItemInteract.mo225055clone();
        }
        bLiveVoiceGiftItem.amount = this.amount;
        return bLiveVoiceGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGiftItem)) {
            return false;
        }
        BLiveVoiceGiftItem bLiveVoiceGiftItem = (BLiveVoiceGiftItem) obj;
        return ValueObject.util_equals(this.f45346id, bLiveVoiceGiftItem.f45346id) && ValueObject.util_equals(this.name, bLiveVoiceGiftItem.name) && ValueObject.util_equals(this.icon, bLiveVoiceGiftItem.icon) && this.unlocked == bLiveVoiceGiftItem.unlocked && ValueObject.util_equals(this.mvpUserId, bLiveVoiceGiftItem.mvpUserId) && this.mvpAmount == bLiveVoiceGiftItem.mvpAmount && ValueObject.util_equals(this.mvpAvatar, bLiveVoiceGiftItem.mvpAvatar) && ValueObject.util_equals(this.interact, bLiveVoiceGiftItem.interact) && this.amount == bLiveVoiceGiftItem.amount;
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
        String str = this.f45346id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.unlocked ? 1231 : 1237)) * 41;
        String str4 = this.mvpUserId;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.mvpAmount) * 41;
        String str5 = this.mvpAvatar;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveVoiceGiftWallGiftItemInteract bLiveVoiceGiftWallGiftItemInteract = this.interact;
        int iHashCode6 = ((iHashCode5 + (bLiveVoiceGiftWallGiftItemInteract != null ? bLiveVoiceGiftWallGiftItemInteract.hashCode() : 0)) * 41) + this.amount;
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45346id == null) {
            this.f45346id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.mvpUserId == null) {
            this.mvpUserId = "";
        }
        if (this.mvpAvatar == null) {
            this.mvpAvatar = "";
        }
        if (this.interact == null) {
            this.interact = BLiveVoiceGiftWallGiftItemInteract.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
