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
public class BLiveMenuItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMenuItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMenuItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMenuItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMenuItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMenuItem newInstance() {
            return new BLiveMenuItem();
        }

        public boolean parseField(BLiveMenuItem bLiveMenuItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "jumpUri":
                    bLiveMenuItem.jumpUri = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveMenuItem.f45247id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveMenuItem.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveMenuItem.type = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    bLiveMenuItem.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMenuItem bLiveMenuItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMenuItem.f45247id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMenuItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveMenuItem.jumpUri;
            if (str3 != null) {
                jsonGenerator.writeStringField("jumpUri", str3);
            }
            String str4 = bLiveMenuItem.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = bLiveMenuItem.iconUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("iconUrl", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMenuItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemenuitem";

    @NonNull
    @ProtobufIndex(index = 5)
    public String iconUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45247id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String jumpUri;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    private boolean showRedDots = false;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    public static BLiveMenuItem new_() {
        BLiveMenuItem bLiveMenuItem = new BLiveMenuItem();
        bLiveMenuItem.nullCheck();
        return bLiveMenuItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMenuItem mo225055clone() {
        BLiveMenuItem bLiveMenuItem = new BLiveMenuItem();
        bLiveMenuItem.f45247id = this.f45247id;
        bLiveMenuItem.name = this.name;
        bLiveMenuItem.jumpUri = this.jumpUri;
        bLiveMenuItem.type = this.type;
        bLiveMenuItem.iconUrl = this.iconUrl;
        return bLiveMenuItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMenuItem)) {
            return false;
        }
        BLiveMenuItem bLiveMenuItem = (BLiveMenuItem) obj;
        return ValueObject.util_equals(this.f45247id, bLiveMenuItem.f45247id) && ValueObject.util_equals(this.name, bLiveMenuItem.name) && ValueObject.util_equals(this.jumpUri, bLiveMenuItem.jumpUri) && ValueObject.util_equals(this.type, bLiveMenuItem.type) && ValueObject.util_equals(this.iconUrl, bLiveMenuItem.iconUrl);
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
        String str = this.f45247id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.jumpUri;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.iconUrl;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    public boolean isShowRedDots() {
        return this.showRedDots;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45247id == null) {
            this.f45247id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.jumpUri == null) {
            this.jumpUri = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
    }

    public void setShowRedDots(boolean z) {
        this.showRedDots = z;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
