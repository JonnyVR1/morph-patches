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
public class BLiveVoiceTab extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceTab> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceTab>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceTab.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceTab.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceTab newInstance() {
            return new BLiveVoiceTab();
        }

        public boolean parseField(BLiveVoiceTab bLiveVoiceTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tabDefaultUrl":
                    bLiveVoiceTab.tabDefaultUrl = jsonParser.getValueAsString();
                    return true;
                case "height":
                    bLiveVoiceTab.height = jsonParser.getValueAsInt();
                    return true;
                case "source":
                    bLiveVoiceTab.source = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceTab.f45361id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveVoiceTab.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveVoiceTab.type = jsonParser.getValueAsString();
                    return true;
                case "color":
                    bLiveVoiceTab.color = jsonParser.getValueAsString();
                    return true;
                case "width":
                    bLiveVoiceTab.width = jsonParser.getValueAsInt();
                    return true;
                case "tabSelectedUrl":
                    bLiveVoiceTab.tabSelectedUrl = jsonParser.getValueAsString();
                    return true;
                case "viewUrl":
                    bLiveVoiceTab.viewUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceTab bLiveVoiceTab, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceTab.f45361id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceTab.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveVoiceTab.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = bLiveVoiceTab.tabSelectedUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("tabSelectedUrl", str4);
            }
            String str5 = bLiveVoiceTab.tabDefaultUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("tabDefaultUrl", str5);
            }
            String str6 = bLiveVoiceTab.viewUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("viewUrl", str6);
            }
            jsonGenerator.writeNumberField("width", bLiveVoiceTab.width);
            jsonGenerator.writeNumberField("height", bLiveVoiceTab.height);
            String str7 = bLiveVoiceTab.color;
            if (str7 != null) {
                jsonGenerator.writeStringField("color", str7);
            }
            String str8 = bLiveVoiceTab.source;
            if (str8 != null) {
                jsonGenerator.writeStringField("source", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicetab";

    @NonNull
    @ProtobufIndex(index = 9)
    public String color;

    @ProtobufIndex(index = 8)
    public int height;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45361id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 10)
    public String source;

    @NonNull
    @ProtobufIndex(index = 5)
    public String tabDefaultUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String tabSelectedUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 6)
    public String viewUrl;

    @ProtobufIndex(index = 7)
    public int width;

    public static BLiveVoiceTab new_() {
        BLiveVoiceTab bLiveVoiceTab = new BLiveVoiceTab();
        bLiveVoiceTab.nullCheck();
        return bLiveVoiceTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceTab mo225055clone() {
        BLiveVoiceTab bLiveVoiceTab = new BLiveVoiceTab();
        bLiveVoiceTab.f45361id = this.f45361id;
        bLiveVoiceTab.name = this.name;
        bLiveVoiceTab.type = this.type;
        bLiveVoiceTab.tabSelectedUrl = this.tabSelectedUrl;
        bLiveVoiceTab.tabDefaultUrl = this.tabDefaultUrl;
        bLiveVoiceTab.viewUrl = this.viewUrl;
        bLiveVoiceTab.width = this.width;
        bLiveVoiceTab.height = this.height;
        bLiveVoiceTab.color = this.color;
        bLiveVoiceTab.source = this.source;
        return bLiveVoiceTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceTab)) {
            return false;
        }
        BLiveVoiceTab bLiveVoiceTab = (BLiveVoiceTab) obj;
        return ValueObject.util_equals(this.f45361id, bLiveVoiceTab.f45361id) && ValueObject.util_equals(this.name, bLiveVoiceTab.name) && ValueObject.util_equals(this.type, bLiveVoiceTab.type) && ValueObject.util_equals(this.tabSelectedUrl, bLiveVoiceTab.tabSelectedUrl) && ValueObject.util_equals(this.tabDefaultUrl, bLiveVoiceTab.tabDefaultUrl) && ValueObject.util_equals(this.viewUrl, bLiveVoiceTab.viewUrl) && this.width == bLiveVoiceTab.width && this.height == bLiveVoiceTab.height && ValueObject.util_equals(this.color, bLiveVoiceTab.color) && ValueObject.util_equals(this.source, bLiveVoiceTab.source);
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
        String str = this.f45361id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.tabSelectedUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.tabDefaultUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.viewUrl;
        int iHashCode6 = (((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.width) * 41) + this.height) * 41;
        String str7 = this.color;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.source;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45361id == null) {
            this.f45361id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.tabSelectedUrl == null) {
            this.tabSelectedUrl = "";
        }
        if (this.tabDefaultUrl == null) {
            this.tabDefaultUrl = "";
        }
        if (this.viewUrl == null) {
            this.viewUrl = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.source == null) {
            this.source = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
