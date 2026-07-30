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
public class BLiveVoiceGiftWallGiftItemInteract extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGiftWallGiftItemInteract> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGiftWallGiftItemInteract>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGiftWallGiftItemInteract.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGiftWallGiftItemInteract.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGiftWallGiftItemInteract newInstance() {
            return new BLiveVoiceGiftWallGiftItemInteract();
        }

        public boolean parseField(BLiveVoiceGiftWallGiftItemInteract bLiveVoiceGiftWallGiftItemInteract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLiveVoiceGiftWallGiftItemInteract.subTitle = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceGiftWallGiftItemInteract.title = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    bLiveVoiceGiftWallGiftItemInteract.buttonText = jsonParser.getValueAsString();
                    return true;
                case "buttonSchema":
                    bLiveVoiceGiftWallGiftItemInteract.buttonSchema = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGiftWallGiftItemInteract bLiveVoiceGiftWallGiftItemInteract, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGiftWallGiftItemInteract.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveVoiceGiftWallGiftItemInteract.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = bLiveVoiceGiftWallGiftItemInteract.buttonText;
            if (str3 != null) {
                jsonGenerator.writeStringField("buttonText", str3);
            }
            String str4 = bLiveVoiceGiftWallGiftItemInteract.buttonSchema;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonSchema", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGiftWallGiftItemInteract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegiftwallgiftiteminteract";

    @NonNull
    @ProtobufIndex(index = 2)
    public String buttonSchema;

    @NonNull
    @ProtobufIndex(index = 1)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    public static BLiveVoiceGiftWallGiftItemInteract new_() {
        BLiveVoiceGiftWallGiftItemInteract bLiveVoiceGiftWallGiftItemInteract = new BLiveVoiceGiftWallGiftItemInteract();
        bLiveVoiceGiftWallGiftItemInteract.nullCheck();
        return bLiveVoiceGiftWallGiftItemInteract;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGiftWallGiftItemInteract mo225055clone() {
        BLiveVoiceGiftWallGiftItemInteract bLiveVoiceGiftWallGiftItemInteract = new BLiveVoiceGiftWallGiftItemInteract();
        bLiveVoiceGiftWallGiftItemInteract.title = this.title;
        bLiveVoiceGiftWallGiftItemInteract.subTitle = this.subTitle;
        bLiveVoiceGiftWallGiftItemInteract.buttonText = this.buttonText;
        bLiveVoiceGiftWallGiftItemInteract.buttonSchema = this.buttonSchema;
        return bLiveVoiceGiftWallGiftItemInteract;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGiftWallGiftItemInteract)) {
            return false;
        }
        BLiveVoiceGiftWallGiftItemInteract bLiveVoiceGiftWallGiftItemInteract = (BLiveVoiceGiftWallGiftItemInteract) obj;
        return ValueObject.util_equals(this.title, bLiveVoiceGiftWallGiftItemInteract.title) && ValueObject.util_equals(this.subTitle, bLiveVoiceGiftWallGiftItemInteract.subTitle) && ValueObject.util_equals(this.buttonText, bLiveVoiceGiftWallGiftItemInteract.buttonText) && ValueObject.util_equals(this.buttonSchema, bLiveVoiceGiftWallGiftItemInteract.buttonSchema);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.buttonText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonSchema;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.buttonSchema == null) {
            this.buttonSchema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
