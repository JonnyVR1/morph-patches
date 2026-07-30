package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveNewGiftWallSkin extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallSkin> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallSkin>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallSkin.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallSkin.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallSkin newInstance() {
            return new BLiveNewGiftWallSkin();
        }

        public boolean parseField(BLiveNewGiftWallSkin bLiveNewGiftWallSkin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isSkin":
                    bLiveNewGiftWallSkin.isSkin = jsonParser.getValueAsBoolean();
                    return true;
                case "status":
                    bLiveNewGiftWallSkin.status = jsonParser.getValueAsString();
                    return true;
                case "namedUserId":
                    bLiveNewGiftWallSkin.namedUserId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveNewGiftWallSkin.f45261id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveNewGiftWallSkin.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveNewGiftWallSkin.name = jsonParser.getValueAsString();
                    return true;
                case "interact":
                    bLiveNewGiftWallSkin.interact = BLiveNewGiftWallInteract.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "categoryId":
                    bLiveNewGiftWallSkin.categoryId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallSkin bLiveNewGiftWallSkin, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallSkin.f45261id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveNewGiftWallSkin.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveNewGiftWallSkin.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = bLiveNewGiftWallSkin.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
            String str5 = bLiveNewGiftWallSkin.namedUserId;
            if (str5 != null) {
                jsonGenerator.writeStringField("namedUserId", str5);
            }
            if (bLiveNewGiftWallSkin.interact != null) {
                jsonGenerator.writeFieldName("interact");
                BLiveNewGiftWallInteract.JSON_ADAPTER.serialize(bLiveNewGiftWallSkin.interact, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isSkin", bLiveNewGiftWallSkin.isSkin);
            String str6 = bLiveNewGiftWallSkin.categoryId;
            if (str6 != null) {
                jsonGenerator.writeStringField("categoryId", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallSkin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallskin";

    @NonNull
    @ProtobufIndex(index = 8)
    public String categoryId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45261id;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveNewGiftWallInteract interact;

    @ProtobufIndex(index = 7)
    public boolean isSkin;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String namedUserId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String status;

    public static BLiveNewGiftWallSkin new_() {
        BLiveNewGiftWallSkin bLiveNewGiftWallSkin = new BLiveNewGiftWallSkin();
        bLiveNewGiftWallSkin.nullCheck();
        return bLiveNewGiftWallSkin;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallSkin mo225055clone() {
        BLiveNewGiftWallSkin bLiveNewGiftWallSkin = new BLiveNewGiftWallSkin();
        bLiveNewGiftWallSkin.f45261id = this.f45261id;
        bLiveNewGiftWallSkin.icon = this.icon;
        bLiveNewGiftWallSkin.name = this.name;
        bLiveNewGiftWallSkin.status = this.status;
        bLiveNewGiftWallSkin.namedUserId = this.namedUserId;
        BLiveNewGiftWallInteract bLiveNewGiftWallInteract = this.interact;
        if (bLiveNewGiftWallInteract != null) {
            bLiveNewGiftWallSkin.interact = bLiveNewGiftWallInteract.mo225055clone();
        }
        bLiveNewGiftWallSkin.isSkin = this.isSkin;
        bLiveNewGiftWallSkin.categoryId = this.categoryId;
        return bLiveNewGiftWallSkin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallSkin)) {
            return false;
        }
        BLiveNewGiftWallSkin bLiveNewGiftWallSkin = (BLiveNewGiftWallSkin) obj;
        return ValueObject.util_equals(this.f45261id, bLiveNewGiftWallSkin.f45261id) && ValueObject.util_equals(this.icon, bLiveNewGiftWallSkin.icon) && ValueObject.util_equals(this.name, bLiveNewGiftWallSkin.name) && ValueObject.util_equals(this.status, bLiveNewGiftWallSkin.status) && ValueObject.util_equals(this.namedUserId, bLiveNewGiftWallSkin.namedUserId) && ValueObject.util_equals(this.interact, bLiveNewGiftWallSkin.interact) && this.isSkin == bLiveNewGiftWallSkin.isSkin && ValueObject.util_equals(this.categoryId, bLiveNewGiftWallSkin.categoryId);
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
        String str = this.f45261id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.status;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.namedUserId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveNewGiftWallInteract bLiveNewGiftWallInteract = this.interact;
        int iHashCode6 = (((iHashCode5 + (bLiveNewGiftWallInteract != null ? bLiveNewGiftWallInteract.hashCode() : 0)) * 41) + (this.isSkin ? 1231 : 1237)) * 41;
        String str6 = this.categoryId;
        int iHashCode7 = iHashCode6 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45261id == null) {
            this.f45261id = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.namedUserId == null) {
            this.namedUserId = "";
        }
        if (this.interact == null) {
            this.interact = BLiveNewGiftWallInteract.new_();
        }
        if (this.categoryId == null) {
            this.categoryId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
