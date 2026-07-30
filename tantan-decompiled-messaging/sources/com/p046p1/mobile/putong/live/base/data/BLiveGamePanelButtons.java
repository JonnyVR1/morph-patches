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
public class BLiveGamePanelButtons extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGamePanelButtons> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGamePanelButtons>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGamePanelButtons.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGamePanelButtons.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGamePanelButtons newInstance() {
            return new BLiveGamePanelButtons();
        }

        public boolean parseField(BLiveGamePanelButtons bLiveGamePanelButtons, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enableRedDot":
                    bLiveGamePanelButtons.enableRedDot = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveGamePanelButtons.f44373id = jsonParser.getValueAsInt();
                    return false;
                case "url":
                    bLiveGamePanelButtons.url = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveGamePanelButtons.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveGamePanelButtons.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveGamePanelButtons.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGamePanelButtons bLiveGamePanelButtons, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveGamePanelButtons.f44373id);
            String str = bLiveGamePanelButtons.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveGamePanelButtons.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = bLiveGamePanelButtons.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            jsonGenerator.writeBooleanField("enableRedDot", bLiveGamePanelButtons.enableRedDot);
            String str4 = bLiveGamePanelButtons.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGamePanelButtons) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegamepanelbuttons";

    @ProtobufIndex(index = 5)
    public boolean enableRedDot;

    @NonNull
    @ProtobufIndex(index = 6)
    public String icon;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44373id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;

    public static BLiveGamePanelButtons new_() {
        BLiveGamePanelButtons bLiveGamePanelButtons = new BLiveGamePanelButtons();
        bLiveGamePanelButtons.nullCheck();
        return bLiveGamePanelButtons;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGamePanelButtons mo223809clone() {
        BLiveGamePanelButtons bLiveGamePanelButtons = new BLiveGamePanelButtons();
        bLiveGamePanelButtons.f44373id = this.f44373id;
        bLiveGamePanelButtons.name = this.name;
        bLiveGamePanelButtons.url = this.url;
        bLiveGamePanelButtons.type = this.type;
        bLiveGamePanelButtons.enableRedDot = this.enableRedDot;
        bLiveGamePanelButtons.icon = this.icon;
        return bLiveGamePanelButtons;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGamePanelButtons)) {
            return false;
        }
        BLiveGamePanelButtons bLiveGamePanelButtons = (BLiveGamePanelButtons) obj;
        return this.f44373id == bLiveGamePanelButtons.f44373id && ValueObject.util_equals(this.name, bLiveGamePanelButtons.name) && ValueObject.util_equals(this.url, bLiveGamePanelButtons.url) && ValueObject.util_equals(this.type, bLiveGamePanelButtons.type) && this.enableRedDot == bLiveGamePanelButtons.enableRedDot && ValueObject.util_equals(this.icon, bLiveGamePanelButtons.icon);
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
        int i2 = ((i * 41) + this.f44373id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.enableRedDot ? 1231 : 1237)) * 41;
        String str4 = this.icon;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
