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
public class BLiveVoiceTag extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceTag> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceTag>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceTag.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceTag.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceTag newInstance() {
            return new BLiveVoiceTag();
        }

        public boolean parseField(BLiveVoiceTag bLiveVoiceTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startColor":
                    bLiveVoiceTag.startColor = jsonParser.getValueAsString();
                    return true;
                case "url":
                    bLiveVoiceTag.url = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveVoiceTag.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveVoiceTag.type = jsonParser.getValueAsString();
                    return true;
                case "endColor":
                    bLiveVoiceTag.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceTag bLiveVoiceTag, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceTag.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveVoiceTag.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = bLiveVoiceTag.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            String str4 = bLiveVoiceTag.startColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("startColor", str4);
            }
            String str5 = bLiveVoiceTag.endColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("endColor", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicetag";

    @NonNull
    @ProtobufIndex(index = 5)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String startColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;

    public static BLiveVoiceTag new_() {
        BLiveVoiceTag bLiveVoiceTag = new BLiveVoiceTag();
        bLiveVoiceTag.nullCheck();
        return bLiveVoiceTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceTag mo223809clone() {
        BLiveVoiceTag bLiveVoiceTag = new BLiveVoiceTag();
        bLiveVoiceTag.type = this.type;
        bLiveVoiceTag.text = this.text;
        bLiveVoiceTag.url = this.url;
        bLiveVoiceTag.startColor = this.startColor;
        bLiveVoiceTag.endColor = this.endColor;
        return bLiveVoiceTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceTag)) {
            return false;
        }
        BLiveVoiceTag bLiveVoiceTag = (BLiveVoiceTag) obj;
        return ValueObject.util_equals(this.type, bLiveVoiceTag.type) && ValueObject.util_equals(this.text, bLiveVoiceTag.text) && ValueObject.util_equals(this.url, bLiveVoiceTag.url) && ValueObject.util_equals(this.startColor, bLiveVoiceTag.startColor) && ValueObject.util_equals(this.endColor, bLiveVoiceTag.endColor);
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
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.startColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.endColor;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
