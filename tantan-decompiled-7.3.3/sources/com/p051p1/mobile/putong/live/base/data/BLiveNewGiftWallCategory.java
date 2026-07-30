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
public class BLiveNewGiftWallCategory extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallCategory> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallCategory>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallCategory.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallCategory.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallCategory newInstance() {
            return new BLiveNewGiftWallCategory();
        }

        public boolean parseField(BLiveNewGiftWallCategory bLiveNewGiftWallCategory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "detailBgUrl":
                    bLiveNewGiftWallCategory.detailBgUrl = jsonParser.getValueAsString();
                    return true;
                case "cardBgSvgaUrl":
                    bLiveNewGiftWallCategory.cardBgSvgaUrl = jsonParser.getValueAsString();
                    return true;
                case "cardBgUrl":
                    bLiveNewGiftWallCategory.cardBgUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveNewGiftWallCategory.f45258id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveNewGiftWallCategory.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveNewGiftWallCategory.name = jsonParser.getValueAsString();
                    return true;
                case "canName":
                    bLiveNewGiftWallCategory.canName = jsonParser.getValueAsBoolean();
                    return true;
                case "detailBaseUrl":
                    bLiveNewGiftWallCategory.detailBaseUrl = jsonParser.getValueAsString();
                    return true;
                case "avatarBorderColor":
                    bLiveNewGiftWallCategory.avatarBorderColor = jsonParser.getValueAsString();
                    return true;
                case "detailBaseSvgaUrl":
                    bLiveNewGiftWallCategory.detailBaseSvgaUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallCategory bLiveNewGiftWallCategory, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallCategory.f45258id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveNewGiftWallCategory.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveNewGiftWallCategory.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = bLiveNewGiftWallCategory.cardBgUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("cardBgUrl", str4);
            }
            String str5 = bLiveNewGiftWallCategory.cardBgSvgaUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("cardBgSvgaUrl", str5);
            }
            String str6 = bLiveNewGiftWallCategory.detailBgUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("detailBgUrl", str6);
            }
            jsonGenerator.writeBooleanField("canName", bLiveNewGiftWallCategory.canName);
            String str7 = bLiveNewGiftWallCategory.detailBaseUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("detailBaseUrl", str7);
            }
            String str8 = bLiveNewGiftWallCategory.avatarBorderColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("avatarBorderColor", str8);
            }
            String str9 = bLiveNewGiftWallCategory.detailBaseSvgaUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("detailBaseSvgaUrl", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallcategory";

    @NonNull
    @ProtobufIndex(index = 9)
    public String avatarBorderColor;

    @ProtobufIndex(index = 7)
    public boolean canName;

    @NonNull
    @ProtobufIndex(index = 5)
    public String cardBgSvgaUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String cardBgUrl;

    @NonNull
    @ProtobufIndex(index = 10)
    public String detailBaseSvgaUrl;

    @NonNull
    @ProtobufIndex(index = 8)
    public String detailBaseUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String detailBgUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45258id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    public static BLiveNewGiftWallCategory new_() {
        BLiveNewGiftWallCategory bLiveNewGiftWallCategory = new BLiveNewGiftWallCategory();
        bLiveNewGiftWallCategory.nullCheck();
        return bLiveNewGiftWallCategory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallCategory mo225055clone() {
        BLiveNewGiftWallCategory bLiveNewGiftWallCategory = new BLiveNewGiftWallCategory();
        bLiveNewGiftWallCategory.f45258id = this.f45258id;
        bLiveNewGiftWallCategory.name = this.name;
        bLiveNewGiftWallCategory.icon = this.icon;
        bLiveNewGiftWallCategory.cardBgUrl = this.cardBgUrl;
        bLiveNewGiftWallCategory.cardBgSvgaUrl = this.cardBgSvgaUrl;
        bLiveNewGiftWallCategory.detailBgUrl = this.detailBgUrl;
        bLiveNewGiftWallCategory.canName = this.canName;
        bLiveNewGiftWallCategory.detailBaseUrl = this.detailBaseUrl;
        bLiveNewGiftWallCategory.avatarBorderColor = this.avatarBorderColor;
        bLiveNewGiftWallCategory.detailBaseSvgaUrl = this.detailBaseSvgaUrl;
        return bLiveNewGiftWallCategory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallCategory)) {
            return false;
        }
        BLiveNewGiftWallCategory bLiveNewGiftWallCategory = (BLiveNewGiftWallCategory) obj;
        return ValueObject.util_equals(this.f45258id, bLiveNewGiftWallCategory.f45258id) && ValueObject.util_equals(this.name, bLiveNewGiftWallCategory.name) && ValueObject.util_equals(this.icon, bLiveNewGiftWallCategory.icon) && ValueObject.util_equals(this.cardBgUrl, bLiveNewGiftWallCategory.cardBgUrl) && ValueObject.util_equals(this.cardBgSvgaUrl, bLiveNewGiftWallCategory.cardBgSvgaUrl) && ValueObject.util_equals(this.detailBgUrl, bLiveNewGiftWallCategory.detailBgUrl) && this.canName == bLiveNewGiftWallCategory.canName && ValueObject.util_equals(this.detailBaseUrl, bLiveNewGiftWallCategory.detailBaseUrl) && ValueObject.util_equals(this.avatarBorderColor, bLiveNewGiftWallCategory.avatarBorderColor) && ValueObject.util_equals(this.detailBaseSvgaUrl, bLiveNewGiftWallCategory.detailBaseSvgaUrl);
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
        String str = this.f45258id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.cardBgUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.cardBgSvgaUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.detailBgUrl;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.canName ? 1231 : 1237)) * 41;
        String str7 = this.detailBaseUrl;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.avatarBorderColor;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.detailBaseSvgaUrl;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45258id == null) {
            this.f45258id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.cardBgUrl == null) {
            this.cardBgUrl = "";
        }
        if (this.cardBgSvgaUrl == null) {
            this.cardBgSvgaUrl = "";
        }
        if (this.detailBgUrl == null) {
            this.detailBgUrl = "";
        }
        if (this.detailBaseUrl == null) {
            this.detailBaseUrl = "";
        }
        if (this.avatarBorderColor == null) {
            this.avatarBorderColor = "";
        }
        if (this.detailBaseSvgaUrl == null) {
            this.detailBaseSvgaUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
