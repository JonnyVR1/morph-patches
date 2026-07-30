package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveFirstRechargePopupBonus extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFirstRechargePopupBonus> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFirstRechargePopupBonus>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFirstRechargePopupBonus.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFirstRechargePopupBonus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFirstRechargePopupBonus newInstance() {
            return new BLiveFirstRechargePopupBonus();
        }

        public boolean parseField(BLiveFirstRechargePopupBonus bLiveFirstRechargePopupBonus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveFirstRechargePopupBonus.description = jsonParser.getValueAsString();
                    return true;
                case "banner":
                    bLiveFirstRechargePopupBonus.banner = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveFirstRechargePopupBonus.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveFirstRechargePopupBonus.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFirstRechargePopupBonus bLiveFirstRechargePopupBonus, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFirstRechargePopupBonus.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveFirstRechargePopupBonus.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveFirstRechargePopupBonus.banner;
            if (str3 != null) {
                jsonGenerator.writeStringField("banner", str3);
            }
            String str4 = bLiveFirstRechargePopupBonus.description;
            if (str4 != null) {
                jsonGenerator.writeStringField("description", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFirstRechargePopupBonus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefirstrechargepopupbonus";

    @NonNull
    @ProtobufIndex(index = 3)
    public String banner;

    @NonNull
    @ProtobufIndex(index = 4)
    public String description;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveFirstRechargePopupBonus new_() {
        BLiveFirstRechargePopupBonus bLiveFirstRechargePopupBonus = new BLiveFirstRechargePopupBonus();
        bLiveFirstRechargePopupBonus.nullCheck();
        return bLiveFirstRechargePopupBonus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFirstRechargePopupBonus mo225055clone() {
        BLiveFirstRechargePopupBonus bLiveFirstRechargePopupBonus = new BLiveFirstRechargePopupBonus();
        bLiveFirstRechargePopupBonus.icon = this.icon;
        bLiveFirstRechargePopupBonus.title = this.title;
        bLiveFirstRechargePopupBonus.banner = this.banner;
        bLiveFirstRechargePopupBonus.description = this.description;
        return bLiveFirstRechargePopupBonus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFirstRechargePopupBonus)) {
            return false;
        }
        BLiveFirstRechargePopupBonus bLiveFirstRechargePopupBonus = (BLiveFirstRechargePopupBonus) obj;
        return ValueObject.util_equals(this.icon, bLiveFirstRechargePopupBonus.icon) && ValueObject.util_equals(this.title, bLiveFirstRechargePopupBonus.title) && ValueObject.util_equals(this.banner, bLiveFirstRechargePopupBonus.banner) && ValueObject.util_equals(this.description, bLiveFirstRechargePopupBonus.description);
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
        String str3 = this.banner;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.description;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
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
        if (this.banner == null) {
            this.banner = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
