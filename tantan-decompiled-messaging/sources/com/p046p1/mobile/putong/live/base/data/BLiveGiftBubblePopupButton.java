package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomContent;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftBubblePopupButton extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftBubblePopupButton> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftBubblePopupButton>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButton.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftBubblePopupButton.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftBubblePopupButton newInstance() {
            return new BLiveGiftBubblePopupButton();
        }

        public boolean parseField(BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startColor":
                    bLiveGiftBubblePopupButton.startColor = jsonParser.getValueAsString();
                    return true;
                case "richText":
                    bLiveGiftBubblePopupButton.richText = JsonAdapter.parseArray(jsonParser, BLiveBottomContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "textColor":
                    bLiveGiftBubblePopupButton.textColor = jsonParser.getValueAsString();
                    return true;
                case "startAfterColor":
                    bLiveGiftBubblePopupButton.startAfterColor = jsonParser.getValueAsString();
                    return true;
                case "afterTextColor":
                    bLiveGiftBubblePopupButton.afterTextColor = jsonParser.getValueAsString();
                    return true;
                case "jumpSchema":
                    bLiveGiftBubblePopupButton.jumpSchema = jsonParser.getValueAsString();
                    return true;
                case "jumpType":
                    bLiveGiftBubblePopupButton.jumpType = BLiveGiftBubblePopupButtonJumpType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "text":
                    bLiveGiftBubblePopupButton.text = jsonParser.getValueAsString();
                    return true;
                case "endAfterColor":
                    bLiveGiftBubblePopupButton.endAfterColor = jsonParser.getValueAsString();
                    return true;
                case "endColor":
                    bLiveGiftBubblePopupButton.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftBubblePopupButton.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = bLiveGiftBubblePopupButton.textColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("textColor", str2);
            }
            String str3 = bLiveGiftBubblePopupButton.startColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("startColor", str3);
            }
            String str4 = bLiveGiftBubblePopupButton.endColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("endColor", str4);
            }
            if (bLiveGiftBubblePopupButton.jumpType != null) {
                jsonGenerator.writeFieldName("jumpType");
                BLiveGiftBubblePopupButtonJumpType.JSON_ADAPTER.serialize(bLiveGiftBubblePopupButton.jumpType, jsonGenerator, true);
            }
            String str5 = bLiveGiftBubblePopupButton.jumpSchema;
            if (str5 != null) {
                jsonGenerator.writeStringField("jumpSchema", str5);
            }
            String str6 = bLiveGiftBubblePopupButton.startAfterColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("startAfterColor", str6);
            }
            String str7 = bLiveGiftBubblePopupButton.endAfterColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("endAfterColor", str7);
            }
            if (bLiveGiftBubblePopupButton.richText != null) {
                jsonGenerator.writeFieldName("richText");
                JsonAdapter.serializeArray(bLiveGiftBubblePopupButton.richText, jsonGenerator, BLiveBottomContent.JSON_ADAPTER);
            }
            String str8 = bLiveGiftBubblePopupButton.afterTextColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("afterTextColor", str8);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftBubblePopupButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftbubblepopupbutton";

    @NonNull
    @ProtobufIndex(index = 11)
    public String afterTextColor;

    @NonNull
    @ProtobufIndex(index = 9)
    public String endAfterColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 6)
    public String jumpSchema;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveGiftBubblePopupButtonJumpType jumpType;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<BLiveBottomContent> richText;

    @NonNull
    @ProtobufIndex(index = 8)
    public String startAfterColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String startColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;

    @NonNull
    @ProtobufIndex(index = 2)
    public String textColor;

    public static BLiveGiftBubblePopupButton new_() {
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = new BLiveGiftBubblePopupButton();
        bLiveGiftBubblePopupButton.nullCheck();
        return bLiveGiftBubblePopupButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftBubblePopupButton mo223809clone() {
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = new BLiveGiftBubblePopupButton();
        bLiveGiftBubblePopupButton.text = this.text;
        bLiveGiftBubblePopupButton.textColor = this.textColor;
        bLiveGiftBubblePopupButton.startColor = this.startColor;
        bLiveGiftBubblePopupButton.endColor = this.endColor;
        bLiveGiftBubblePopupButton.jumpType = this.jumpType;
        bLiveGiftBubblePopupButton.jumpSchema = this.jumpSchema;
        bLiveGiftBubblePopupButton.startAfterColor = this.startAfterColor;
        bLiveGiftBubblePopupButton.endAfterColor = this.endAfterColor;
        List<BLiveBottomContent> list = this.richText;
        if (list != null) {
            bLiveGiftBubblePopupButton.richText = ValueObject.util_map(list, new w9j() { // from class: l.f02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveBottomContent) obj).mo223809clone();
                }
            });
        }
        bLiveGiftBubblePopupButton.afterTextColor = this.afterTextColor;
        return bLiveGiftBubblePopupButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftBubblePopupButton)) {
            return false;
        }
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = (BLiveGiftBubblePopupButton) obj;
        return ValueObject.util_equals(this.text, bLiveGiftBubblePopupButton.text) && ValueObject.util_equals(this.textColor, bLiveGiftBubblePopupButton.textColor) && ValueObject.util_equals(this.startColor, bLiveGiftBubblePopupButton.startColor) && ValueObject.util_equals(this.endColor, bLiveGiftBubblePopupButton.endColor) && ValueObject.util_equals(this.jumpType, bLiveGiftBubblePopupButton.jumpType) && ValueObject.util_equals(this.jumpSchema, bLiveGiftBubblePopupButton.jumpSchema) && ValueObject.util_equals(this.startAfterColor, bLiveGiftBubblePopupButton.startAfterColor) && ValueObject.util_equals(this.endAfterColor, bLiveGiftBubblePopupButton.endAfterColor) && ValueObject.util_equals(this.richText, bLiveGiftBubblePopupButton.richText) && ValueObject.util_equals(this.afterTextColor, bLiveGiftBubblePopupButton.afterTextColor);
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.textColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.startColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.endColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveGiftBubblePopupButtonJumpType bLiveGiftBubblePopupButtonJumpType = this.jumpType;
        int iHashCode5 = (iHashCode4 + (bLiveGiftBubblePopupButtonJumpType != null ? bLiveGiftBubblePopupButtonJumpType.hashCode() : 0)) * 41;
        String str5 = this.jumpSchema;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.startAfterColor;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.endAfterColor;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        List<BLiveBottomContent> list = this.richText;
        int iHashCode9 = (iHashCode8 + (list != null ? list.hashCode() : 0)) * 41;
        String str8 = this.afterTextColor;
        int iHashCode10 = iHashCode9 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
        if (this.jumpType == null) {
            this.jumpType = (BLiveGiftBubblePopupButtonJumpType) BLiveGiftBubblePopupButtonJumpType.JSON_ADAPTER.defaultEnum();
        }
        if (this.jumpSchema == null) {
            this.jumpSchema = "";
        }
        if (this.startAfterColor == null) {
            this.startAfterColor = "";
        }
        if (this.endAfterColor == null) {
            this.endAfterColor = "";
        }
        if (this.richText == null) {
            this.richText = new ArrayList();
        }
        if (this.afterTextColor == null) {
            this.afterTextColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
