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
public class BLiveBonus extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBonus> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBonus>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBonus.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBonus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBonus newInstance() {
            return new BLiveBonus();
        }

        public boolean parseField(BLiveBonus bLiveBonus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveBonus.description = jsonParser.getValueAsString();
                    return true;
                case "banner":
                    bLiveBonus.banner = jsonParser.getValueAsString();
                    return true;
                case "resourceId":
                    bLiveBonus.resourceId = jsonParser.getValueAsString();
                    return true;
                case "noticeText":
                    bLiveBonus.noticeText = jsonParser.getValueAsString();
                    return true;
                case "schema":
                    bLiveBonus.schema = jsonParser.getValueAsString();
                    return true;
                case "bonusDescription":
                    bLiveBonus.bonusDescription = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveBonus.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveBonus.title = jsonParser.getValueAsString();
                    return true;
                case "clickAction":
                    bLiveBonus.clickAction = jsonParser.getValueAsString();
                    return true;
                case "bonusIcon":
                    bLiveBonus.bonusIcon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBonus bLiveBonus, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBonus.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveBonus.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveBonus.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            String str4 = bLiveBonus.bonusIcon;
            if (str4 != null) {
                jsonGenerator.writeStringField("bonusIcon", str4);
            }
            String str5 = bLiveBonus.bonusDescription;
            if (str5 != null) {
                jsonGenerator.writeStringField("bonusDescription", str5);
            }
            String str6 = bLiveBonus.clickAction;
            if (str6 != null) {
                jsonGenerator.writeStringField("clickAction", str6);
            }
            String str7 = bLiveBonus.noticeText;
            if (str7 != null) {
                jsonGenerator.writeStringField("noticeText", str7);
            }
            String str8 = bLiveBonus.resourceId;
            if (str8 != null) {
                jsonGenerator.writeStringField("resourceId", str8);
            }
            String str9 = bLiveBonus.banner;
            if (str9 != null) {
                jsonGenerator.writeStringField("banner", str9);
            }
            String str10 = bLiveBonus.schema;
            if (str10 != null) {
                jsonGenerator.writeStringField("schema", str10);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBonus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebonus";

    @NonNull
    @ProtobufIndex(index = 9)
    public String banner;

    @NonNull
    @ProtobufIndex(index = 5)
    public String bonusDescription;

    @NonNull
    @ProtobufIndex(index = 4)
    public String bonusIcon;

    @NonNull
    @ProtobufIndex(index = 6)
    public String clickAction;

    @NonNull
    @ProtobufIndex(index = 3)
    public String description;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 7)
    public String noticeText;

    @NonNull
    @ProtobufIndex(index = 8)
    public String resourceId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveBonus new_() {
        BLiveBonus bLiveBonus = new BLiveBonus();
        bLiveBonus.nullCheck();
        return bLiveBonus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBonus mo223809clone() {
        BLiveBonus bLiveBonus = new BLiveBonus();
        bLiveBonus.icon = this.icon;
        bLiveBonus.title = this.title;
        bLiveBonus.description = this.description;
        bLiveBonus.bonusIcon = this.bonusIcon;
        bLiveBonus.bonusDescription = this.bonusDescription;
        bLiveBonus.clickAction = this.clickAction;
        bLiveBonus.noticeText = this.noticeText;
        bLiveBonus.resourceId = this.resourceId;
        bLiveBonus.banner = this.banner;
        bLiveBonus.schema = this.schema;
        return bLiveBonus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBonus)) {
            return false;
        }
        BLiveBonus bLiveBonus = (BLiveBonus) obj;
        return ValueObject.util_equals(this.icon, bLiveBonus.icon) && ValueObject.util_equals(this.title, bLiveBonus.title) && ValueObject.util_equals(this.description, bLiveBonus.description) && ValueObject.util_equals(this.bonusIcon, bLiveBonus.bonusIcon) && ValueObject.util_equals(this.bonusDescription, bLiveBonus.bonusDescription) && ValueObject.util_equals(this.clickAction, bLiveBonus.clickAction) && ValueObject.util_equals(this.noticeText, bLiveBonus.noticeText) && ValueObject.util_equals(this.resourceId, bLiveBonus.resourceId) && ValueObject.util_equals(this.banner, bLiveBonus.banner) && ValueObject.util_equals(this.schema, bLiveBonus.schema);
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
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.bonusIcon;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.bonusDescription;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.clickAction;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.noticeText;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.resourceId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.banner;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.schema;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.bonusIcon == null) {
            this.bonusIcon = "";
        }
        if (this.bonusDescription == null) {
            this.bonusDescription = "";
        }
        if (this.clickAction == null) {
            this.clickAction = "";
        }
        if (this.noticeText == null) {
            this.noticeText = "";
        }
        if (this.resourceId == null) {
            this.resourceId = "";
        }
        if (this.banner == null) {
            this.banner = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
