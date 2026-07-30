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
public class BLiveVoiceSquareButton extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSquareButton> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSquareButton>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSquareButton.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSquareButton.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSquareButton newInstance() {
            return new BLiveVoiceSquareButton();
        }

        public boolean parseField(BLiveVoiceSquareButton bLiveVoiceSquareButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    bLiveVoiceSquareButton.schema = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveVoiceSquareButton.type = jsonParser.getValueAsString();
                    return true;
                case "showRedDot":
                    bLiveVoiceSquareButton.showRedDot = jsonParser.getValueAsBoolean();
                    return true;
                case "iconUrl":
                    bLiveVoiceSquareButton.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSquareButton bLiveVoiceSquareButton, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceSquareButton.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveVoiceSquareButton.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
            String str3 = bLiveVoiceSquareButton.schema;
            if (str3 != null) {
                jsonGenerator.writeStringField("schema", str3);
            }
            jsonGenerator.writeBooleanField("showRedDot", bLiveVoiceSquareButton.showRedDot);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSquareButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesquarebutton";

    @NonNull
    @ProtobufIndex(index = 2)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String schema;

    @ProtobufIndex(index = 4)
    public boolean showRedDot;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLiveVoiceSquareButton new_() {
        BLiveVoiceSquareButton bLiveVoiceSquareButton = new BLiveVoiceSquareButton();
        bLiveVoiceSquareButton.nullCheck();
        return bLiveVoiceSquareButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSquareButton mo225055clone() {
        BLiveVoiceSquareButton bLiveVoiceSquareButton = new BLiveVoiceSquareButton();
        bLiveVoiceSquareButton.type = this.type;
        bLiveVoiceSquareButton.iconUrl = this.iconUrl;
        bLiveVoiceSquareButton.schema = this.schema;
        bLiveVoiceSquareButton.showRedDot = this.showRedDot;
        return bLiveVoiceSquareButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSquareButton)) {
            return false;
        }
        BLiveVoiceSquareButton bLiveVoiceSquareButton = (BLiveVoiceSquareButton) obj;
        return ValueObject.util_equals(this.type, bLiveVoiceSquareButton.type) && ValueObject.util_equals(this.iconUrl, bLiveVoiceSquareButton.iconUrl) && ValueObject.util_equals(this.schema, bLiveVoiceSquareButton.schema) && this.showRedDot == bLiveVoiceSquareButton.showRedDot;
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.schema;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.showRedDot ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
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
