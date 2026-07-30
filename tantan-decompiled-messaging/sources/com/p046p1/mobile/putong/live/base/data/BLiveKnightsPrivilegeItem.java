package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveKnightsPrivilegeItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveKnightsPrivilegeItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveKnightsPrivilegeItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveKnightsPrivilegeItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveKnightsPrivilegeItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveKnightsPrivilegeItem newInstance() {
            return new BLiveKnightsPrivilegeItem();
        }

        public boolean parseField(BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pictureUrl":
                    bLiveKnightsPrivilegeItem.pictureUrl = jsonParser.getValueAsString();
                    return true;
                case "remain":
                    bLiveKnightsPrivilegeItem.remain = jsonParser.getValueAsInt();
                    return true;
                case "icon":
                    bLiveKnightsPrivilegeItem.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveKnightsPrivilegeItem.name = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveKnightsPrivilegeItem.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveKnightsPrivilegeItem.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveKnightsPrivilegeItem.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveKnightsPrivilegeItem.pictureUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("pictureUrl", str3);
            }
            String str4 = bLiveKnightsPrivilegeItem.name;
            if (str4 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str4);
            }
            jsonGenerator.writeNumberField("remain", bLiveKnightsPrivilegeItem.remain);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveKnightsPrivilegeItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveknightsprivilegeitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 4)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String pictureUrl;

    @ProtobufIndex(index = 5)
    public int remain;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveKnightsPrivilegeItem new_() {
        BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem = new BLiveKnightsPrivilegeItem();
        bLiveKnightsPrivilegeItem.nullCheck();
        return bLiveKnightsPrivilegeItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveKnightsPrivilegeItem mo223809clone() {
        BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem = new BLiveKnightsPrivilegeItem();
        bLiveKnightsPrivilegeItem.icon = this.icon;
        bLiveKnightsPrivilegeItem.title = this.title;
        bLiveKnightsPrivilegeItem.pictureUrl = this.pictureUrl;
        bLiveKnightsPrivilegeItem.name = this.name;
        bLiveKnightsPrivilegeItem.remain = this.remain;
        return bLiveKnightsPrivilegeItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveKnightsPrivilegeItem)) {
            return false;
        }
        BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem = (BLiveKnightsPrivilegeItem) obj;
        return ValueObject.util_equals(this.icon, bLiveKnightsPrivilegeItem.icon) && ValueObject.util_equals(this.title, bLiveKnightsPrivilegeItem.title) && ValueObject.util_equals(this.pictureUrl, bLiveKnightsPrivilegeItem.pictureUrl) && ValueObject.util_equals(this.name, bLiveKnightsPrivilegeItem.name) && this.remain == bLiveKnightsPrivilegeItem.remain;
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
        String str3 = this.pictureUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.name;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.remain;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.pictureUrl == null) {
            this.pictureUrl = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
