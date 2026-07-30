package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveTemplateItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTemplateItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTemplateItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTemplateItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTemplateItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTemplateItem newInstance() {
            return new BLiveTemplateItem();
        }

        public boolean parseField(BLiveTemplateItem bLiveTemplateItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startColor":
                    bLiveTemplateItem.startColor = jsonParser.getValueAsString();
                    return true;
                case "background":
                    bLiveTemplateItem.background = jsonParser.getValueAsString();
                    return true;
                case "gradientColors":
                    bLiveTemplateItem.gradientColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    bLiveTemplateItem.url = jsonParser.getValueAsString();
                    return true;
                case "size":
                    bLiveTemplateItem.size = jsonParser.getValueAsInt();
                    return true;
                case "text":
                    bLiveTemplateItem.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveTemplateItem.type = jsonParser.getValueAsString();
                    return true;
                case "color":
                    bLiveTemplateItem.color = jsonParser.getValueAsString();
                    return true;
                case "index":
                    bLiveTemplateItem.index = jsonParser.getValueAsInt();
                    return true;
                case "scene":
                    bLiveTemplateItem.scene = jsonParser.getValueAsString();
                    return true;
                case "endColor":
                    bLiveTemplateItem.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTemplateItem bLiveTemplateItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, bLiveTemplateItem.index);
            String str = bLiveTemplateItem.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveTemplateItem.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = bLiveTemplateItem.color;
            if (str3 != null) {
                jsonGenerator.writeStringField("color", str3);
            }
            jsonGenerator.writeNumberField("size", bLiveTemplateItem.size);
            String str4 = bLiveTemplateItem.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
            String str5 = bLiveTemplateItem.background;
            if (str5 != null) {
                jsonGenerator.writeStringField(OMSResourceType.background, str5);
            }
            String str6 = bLiveTemplateItem.scene;
            if (str6 != null) {
                jsonGenerator.writeStringField("scene", str6);
            }
            String str7 = bLiveTemplateItem.startColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("startColor", str7);
            }
            String str8 = bLiveTemplateItem.endColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("endColor", str8);
            }
            if (bLiveTemplateItem.gradientColors != null) {
                jsonGenerator.writeFieldName("gradientColors");
                JsonAdapter.serializeArray(bLiveTemplateItem.gradientColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTemplateItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetemplateitem";

    @NonNull
    @ProtobufIndex(index = 7)
    public String background;

    @NonNull
    @ProtobufIndex(index = 4)
    public String color;

    @NonNull
    @ProtobufIndex(index = 10)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<String> gradientColors;

    @ProtobufIndex(index = 1)
    public int index;

    @NonNull
    @ProtobufIndex(index = 8)
    public String scene;

    @ProtobufIndex(index = 5)
    public int size;

    @NonNull
    @ProtobufIndex(index = 9)
    public String startColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 6)
    public String url;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69451a(String str) {
        return str;
    }

    public static BLiveTemplateItem new_() {
        BLiveTemplateItem bLiveTemplateItem = new BLiveTemplateItem();
        bLiveTemplateItem.nullCheck();
        return bLiveTemplateItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTemplateItem mo225055clone() {
        BLiveTemplateItem bLiveTemplateItem = new BLiveTemplateItem();
        bLiveTemplateItem.index = this.index;
        bLiveTemplateItem.type = this.type;
        bLiveTemplateItem.text = this.text;
        bLiveTemplateItem.color = this.color;
        bLiveTemplateItem.size = this.size;
        bLiveTemplateItem.url = this.url;
        bLiveTemplateItem.background = this.background;
        bLiveTemplateItem.scene = this.scene;
        bLiveTemplateItem.startColor = this.startColor;
        bLiveTemplateItem.endColor = this.endColor;
        List<String> list = this.gradientColors;
        if (list != null) {
            bLiveTemplateItem.gradientColors = ValueObject.util_map(list, new qcj() { // from class: l.d72
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveTemplateItem.m69451a((String) obj);
                }
            });
        }
        return bLiveTemplateItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTemplateItem)) {
            return false;
        }
        BLiveTemplateItem bLiveTemplateItem = (BLiveTemplateItem) obj;
        return this.index == bLiveTemplateItem.index && ValueObject.util_equals(this.type, bLiveTemplateItem.type) && ValueObject.util_equals(this.text, bLiveTemplateItem.text) && ValueObject.util_equals(this.color, bLiveTemplateItem.color) && this.size == bLiveTemplateItem.size && ValueObject.util_equals(this.url, bLiveTemplateItem.url) && ValueObject.util_equals(this.background, bLiveTemplateItem.background) && ValueObject.util_equals(this.scene, bLiveTemplateItem.scene) && ValueObject.util_equals(this.startColor, bLiveTemplateItem.startColor) && ValueObject.util_equals(this.endColor, bLiveTemplateItem.endColor) && ValueObject.util_equals(this.gradientColors, bLiveTemplateItem.gradientColors);
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
        int i2 = ((i * 41) + this.index) * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.color;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.size) * 41;
        String str4 = this.url;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.background;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.scene;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.startColor;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.endColor;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        List<String> list = this.gradientColors;
        int iHashCode9 = iHashCode8 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.background == null) {
            this.background = "";
        }
        if (this.scene == null) {
            this.scene = "";
        }
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
        if (this.gradientColors == null) {
            this.gradientColors = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
