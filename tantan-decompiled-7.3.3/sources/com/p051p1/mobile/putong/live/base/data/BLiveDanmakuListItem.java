package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveDanmakuListItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDanmakuListItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDanmakuListItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDanmakuListItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDanmakuListItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDanmakuListItem newInstance() {
            return new BLiveDanmakuListItem();
        }

        public boolean parseField(BLiveDanmakuListItem bLiveDanmakuListItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subType":
                    bLiveDanmakuListItem.subType = jsonParser.getValueAsString();
                    return true;
                case "noPermissionWarnText":
                    bLiveDanmakuListItem.noPermissionWarnText = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveDanmakuListItem.status = BLiveDanmakuListItemStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "inputPlaceholder":
                    bLiveDanmakuListItem.inputPlaceholder = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveDanmakuListItem.f45203id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveDanmakuListItem.type = jsonParser.getValueAsString();
                    return true;
                case "price":
                    bLiveDanmakuListItem.price = jsonParser.getValueAsInt();
                    return true;
                case "isDefault":
                    bLiveDanmakuListItem.isDefault = jsonParser.getValueAsBoolean();
                    return true;
                case "firstInputPlaceholder":
                    bLiveDanmakuListItem.firstInputPlaceholder = jsonParser.getValueAsString();
                    return true;
                case "confirmingText":
                    bLiveDanmakuListItem.confirmingText = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    bLiveDanmakuListItem.iconUrl = jsonParser.getValueAsString();
                    return true;
                case "isInUse":
                    bLiveDanmakuListItem.isInUse = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDanmakuListItem bLiveDanmakuListItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveDanmakuListItem.f45203id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("isDefault", bLiveDanmakuListItem.isDefault);
            String str2 = bLiveDanmakuListItem.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLiveDanmakuListItem.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveDanmakuListItemStatus.JSON_ADAPTER.serialize(bLiveDanmakuListItem.status, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, bLiveDanmakuListItem.price);
            String str3 = bLiveDanmakuListItem.iconUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconUrl", str3);
            }
            String str4 = bLiveDanmakuListItem.inputPlaceholder;
            if (str4 != null) {
                jsonGenerator.writeStringField("inputPlaceholder", str4);
            }
            String str5 = bLiveDanmakuListItem.noPermissionWarnText;
            if (str5 != null) {
                jsonGenerator.writeStringField("noPermissionWarnText", str5);
            }
            String str6 = bLiveDanmakuListItem.confirmingText;
            if (str6 != null) {
                jsonGenerator.writeStringField("confirmingText", str6);
            }
            String str7 = bLiveDanmakuListItem.subType;
            if (str7 != null) {
                jsonGenerator.writeStringField("subType", str7);
            }
            jsonGenerator.writeBooleanField("isInUse", bLiveDanmakuListItem.isInUse);
            String str8 = bLiveDanmakuListItem.firstInputPlaceholder;
            if (str8 != null) {
                jsonGenerator.writeStringField("firstInputPlaceholder", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDanmakuListItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedanmakulistitem";

    @NonNull
    @ProtobufIndex(index = 9)
    public String confirmingText;

    @NonNull
    @ProtobufIndex(index = 13)
    public String firstInputPlaceholder;

    @NonNull
    @ProtobufIndex(index = 6)
    public String iconUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45203id;

    @NonNull
    @ProtobufIndex(index = 7)
    public String inputPlaceholder;

    @ProtobufIndex(index = 2)
    @Deprecated
    public boolean isDefault;

    @ProtobufIndex(index = 12)
    public boolean isInUse;

    @NonNull
    @ProtobufIndex(index = 8)
    public String noPermissionWarnText;

    @ProtobufIndex(index = 5)
    public int price;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveDanmakuListItemStatus status;

    @NonNull
    @ProtobufIndex(index = 10)
    public String subType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    public static BLiveDanmakuListItem new_() {
        BLiveDanmakuListItem bLiveDanmakuListItem = new BLiveDanmakuListItem();
        bLiveDanmakuListItem.nullCheck();
        return bLiveDanmakuListItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDanmakuListItem mo225055clone() {
        BLiveDanmakuListItem bLiveDanmakuListItem = new BLiveDanmakuListItem();
        bLiveDanmakuListItem.f45203id = this.f45203id;
        bLiveDanmakuListItem.isDefault = this.isDefault;
        bLiveDanmakuListItem.type = this.type;
        bLiveDanmakuListItem.status = this.status;
        bLiveDanmakuListItem.price = this.price;
        bLiveDanmakuListItem.iconUrl = this.iconUrl;
        bLiveDanmakuListItem.inputPlaceholder = this.inputPlaceholder;
        bLiveDanmakuListItem.noPermissionWarnText = this.noPermissionWarnText;
        bLiveDanmakuListItem.confirmingText = this.confirmingText;
        bLiveDanmakuListItem.subType = this.subType;
        bLiveDanmakuListItem.isInUse = this.isInUse;
        bLiveDanmakuListItem.firstInputPlaceholder = this.firstInputPlaceholder;
        return bLiveDanmakuListItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDanmakuListItem)) {
            return false;
        }
        BLiveDanmakuListItem bLiveDanmakuListItem = (BLiveDanmakuListItem) obj;
        return ValueObject.util_equals(this.f45203id, bLiveDanmakuListItem.f45203id) && this.isDefault == bLiveDanmakuListItem.isDefault && ValueObject.util_equals(this.type, bLiveDanmakuListItem.type) && ValueObject.util_equals(this.status, bLiveDanmakuListItem.status) && this.price == bLiveDanmakuListItem.price && ValueObject.util_equals(this.iconUrl, bLiveDanmakuListItem.iconUrl) && ValueObject.util_equals(this.inputPlaceholder, bLiveDanmakuListItem.inputPlaceholder) && ValueObject.util_equals(this.noPermissionWarnText, bLiveDanmakuListItem.noPermissionWarnText) && ValueObject.util_equals(this.confirmingText, bLiveDanmakuListItem.confirmingText) && ValueObject.util_equals(this.subType, bLiveDanmakuListItem.subType) && this.isInUse == bLiveDanmakuListItem.isInUse && ValueObject.util_equals(this.firstInputPlaceholder, bLiveDanmakuListItem.firstInputPlaceholder);
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
        String str = this.f45203id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isDefault ? 1231 : 1237)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveDanmakuListItemStatus bLiveDanmakuListItemStatus = this.status;
        int iHashCode3 = (((iHashCode2 + (bLiveDanmakuListItemStatus != null ? bLiveDanmakuListItemStatus.hashCode() : 0)) * 41) + this.price) * 41;
        String str3 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.inputPlaceholder;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.noPermissionWarnText;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.confirmingText;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.subType;
        int iHashCode8 = (((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.isInUse ? 1231 : 1237)) * 41;
        String str8 = this.firstInputPlaceholder;
        int iHashCode9 = iHashCode8 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45203id == null) {
            this.f45203id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.status == null) {
            this.status = (BLiveDanmakuListItemStatus) BLiveDanmakuListItemStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.inputPlaceholder == null) {
            this.inputPlaceholder = "";
        }
        if (this.noPermissionWarnText == null) {
            this.noPermissionWarnText = "";
        }
        if (this.confirmingText == null) {
            this.confirmingText = "";
        }
        if (this.subType == null) {
            this.subType = "";
        }
        if (this.firstInputPlaceholder == null) {
            this.firstInputPlaceholder = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
