package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
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
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveJsDialogItemType extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveJsDialogItemType> JSON_ADAPTER = new ObjectJsonAdapter<BLiveJsDialogItemType>() { // from class: com.p1.mobile.putong.live.base.data.BLiveJsDialogItemType.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveJsDialogItemType.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveJsDialogItemType newInstance() {
            return new BLiveJsDialogItemType();
        }

        public boolean parseField(BLiveJsDialogItemType bLiveJsDialogItemType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "withShadow":
                    bLiveJsDialogItemType.withShadow = jsonParser.getValueAsBoolean();
                    return true;
                case "textColor":
                    bLiveJsDialogItemType.textColor = jsonParser.getValueAsString();
                    return true;
                case "textSize":
                    bLiveJsDialogItemType.textSize = jsonParser.getValueAsInt();
                    return true;
                case "topMargin":
                    bLiveJsDialogItemType.topMargin = jsonParser.getValueAsInt();
                    return true;
                case "btnBgColors":
                    bLiveJsDialogItemType.btnBgColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bgColor":
                    bLiveJsDialogItemType.bgColor = jsonParser.getValueAsString();
                    return true;
                case "callback":
                    bLiveJsDialogItemType.callback = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveJsDialogItemType.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveJsDialogItemType.title = jsonParser.getValueAsString();
                    return true;
                case "contentGravity":
                    bLiveJsDialogItemType.contentGravity = jsonParser.getValueAsInt();
                    return true;
                case "checked":
                    bLiveJsDialogItemType.checked = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveJsDialogItemType bLiveJsDialogItemType, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveJsDialogItemType.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveJsDialogItemType.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            jsonGenerator.writeNumberField("textSize", bLiveJsDialogItemType.textSize);
            String str3 = bLiveJsDialogItemType.textColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("textColor", str3);
            }
            jsonGenerator.writeNumberField("contentGravity", bLiveJsDialogItemType.contentGravity);
            if (bLiveJsDialogItemType.btnBgColors != null) {
                jsonGenerator.writeFieldName("btnBgColors");
                JsonAdapter.serializeArray(bLiveJsDialogItemType.btnBgColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str4 = bLiveJsDialogItemType.callback;
            if (str4 != null) {
                jsonGenerator.writeStringField("callback", str4);
            }
            jsonGenerator.writeBooleanField("checked", bLiveJsDialogItemType.checked);
            String str5 = bLiveJsDialogItemType.bgColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("bgColor", str5);
            }
            jsonGenerator.writeNumberField("topMargin", bLiveJsDialogItemType.topMargin);
            jsonGenerator.writeBooleanField("withShadow", bLiveJsDialogItemType.withShadow);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveJsDialogItemType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivejsdialogitemtype";
    public z20<String, String> actionListener;

    @NonNull
    @ProtobufIndex(index = 9)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> btnBgColors;

    @NonNull
    @ProtobufIndex(index = 7)
    public String callback;

    @ProtobufIndex(index = 8)
    public boolean checked;

    @ProtobufIndex(index = 5)
    public int contentGravity;

    @NonNull
    @ProtobufIndex(index = 4)
    public String textColor;

    @ProtobufIndex(index = 3)
    public int textSize;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @ProtobufIndex(index = 10)
    public int topMargin;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @ProtobufIndex(index = 11)
    public boolean withShadow;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69220a(String str) {
        return str;
    }

    public static BLiveJsDialogItemType new_() {
        BLiveJsDialogItemType bLiveJsDialogItemType = new BLiveJsDialogItemType();
        bLiveJsDialogItemType.nullCheck();
        return bLiveJsDialogItemType;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveJsDialogItemType mo225055clone() {
        BLiveJsDialogItemType bLiveJsDialogItemType = new BLiveJsDialogItemType();
        bLiveJsDialogItemType.type = this.type;
        bLiveJsDialogItemType.title = this.title;
        bLiveJsDialogItemType.textSize = this.textSize;
        bLiveJsDialogItemType.textColor = this.textColor;
        bLiveJsDialogItemType.contentGravity = this.contentGravity;
        List<String> list = this.btnBgColors;
        if (list != null) {
            bLiveJsDialogItemType.btnBgColors = ValueObject.util_map(list, new qcj() { // from class: l.b22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveJsDialogItemType.m69220a((String) obj);
                }
            });
        }
        bLiveJsDialogItemType.callback = this.callback;
        bLiveJsDialogItemType.checked = this.checked;
        bLiveJsDialogItemType.bgColor = this.bgColor;
        bLiveJsDialogItemType.topMargin = this.topMargin;
        bLiveJsDialogItemType.withShadow = this.withShadow;
        return bLiveJsDialogItemType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveJsDialogItemType)) {
            return false;
        }
        BLiveJsDialogItemType bLiveJsDialogItemType = (BLiveJsDialogItemType) obj;
        return ValueObject.util_equals(this.type, bLiveJsDialogItemType.type) && ValueObject.util_equals(this.title, bLiveJsDialogItemType.title) && this.textSize == bLiveJsDialogItemType.textSize && ValueObject.util_equals(this.textColor, bLiveJsDialogItemType.textColor) && this.contentGravity == bLiveJsDialogItemType.contentGravity && ValueObject.util_equals(this.btnBgColors, bLiveJsDialogItemType.btnBgColors) && ValueObject.util_equals(this.callback, bLiveJsDialogItemType.callback) && this.checked == bLiveJsDialogItemType.checked && ValueObject.util_equals(this.bgColor, bLiveJsDialogItemType.bgColor) && this.topMargin == bLiveJsDialogItemType.topMargin && this.withShadow == bLiveJsDialogItemType.withShadow;
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
        String str2 = this.title;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.textSize) * 41;
        String str3 = this.textColor;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.contentGravity) * 41;
        List<String> list = this.btnBgColors;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.callback;
        int iHashCode5 = (((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.checked ? 1231 : 1237)) * 41;
        String str5 = this.bgColor;
        int iHashCode6 = ((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.topMargin) * 41) + (this.withShadow ? 1231 : 1237);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.btnBgColors == null) {
            this.btnBgColors = new ArrayList();
        }
        if (this.callback == null) {
            this.callback = "";
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
