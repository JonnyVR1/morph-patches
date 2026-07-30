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
public class BLiveVoiceGuideTemplate extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGuideTemplate> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGuideTemplate>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGuideTemplate.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGuideTemplate.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGuideTemplate newInstance() {
            return new BLiveVoiceGuideTemplate();
        }

        public boolean parseField(BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "template":
                    bLiveVoiceGuideTemplate.template = jsonParser.getValueAsString();
                    return true;
                case "bgColor":
                    bLiveVoiceGuideTemplate.bgColor = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveVoiceGuideTemplate.icon = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveVoiceGuideTemplate.text = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGuideTemplate.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveVoiceGuideTemplate.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = bLiveVoiceGuideTemplate.template;
            if (str3 != null) {
                jsonGenerator.writeStringField("template", str3);
            }
            String str4 = bLiveVoiceGuideTemplate.bgColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("bgColor", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGuideTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceguidetemplate";

    @NonNull
    @ProtobufIndex(index = 4)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String template;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    public static BLiveVoiceGuideTemplate new_() {
        BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate = new BLiveVoiceGuideTemplate();
        bLiveVoiceGuideTemplate.nullCheck();
        return bLiveVoiceGuideTemplate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGuideTemplate mo225055clone() {
        BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate = new BLiveVoiceGuideTemplate();
        bLiveVoiceGuideTemplate.icon = this.icon;
        bLiveVoiceGuideTemplate.text = this.text;
        bLiveVoiceGuideTemplate.template = this.template;
        bLiveVoiceGuideTemplate.bgColor = this.bgColor;
        return bLiveVoiceGuideTemplate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGuideTemplate)) {
            return false;
        }
        BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate = (BLiveVoiceGuideTemplate) obj;
        return ValueObject.util_equals(this.icon, bLiveVoiceGuideTemplate.icon) && ValueObject.util_equals(this.text, bLiveVoiceGuideTemplate.text) && ValueObject.util_equals(this.template, bLiveVoiceGuideTemplate.template) && ValueObject.util_equals(this.bgColor, bLiveVoiceGuideTemplate.bgColor);
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
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.template;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.bgColor;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.template == null) {
            this.template = "";
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
