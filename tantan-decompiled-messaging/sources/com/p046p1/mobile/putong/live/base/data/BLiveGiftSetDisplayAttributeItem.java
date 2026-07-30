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
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftSetDisplayAttributeItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftSetDisplayAttributeItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftSetDisplayAttributeItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftSetDisplayAttributeItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftSetDisplayAttributeItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftSetDisplayAttributeItem newInstance() {
            return new BLiveGiftSetDisplayAttributeItem();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2095429765:
                    if (str.equals("purchasePriceColor")) {
                        b = 0;
                    }
                    break;
                case -2062203549:
                    if (str.equals("processFramePicUrl")) {
                        b = 1;
                    }
                    break;
                case -2001724631:
                    if (str.equals("givenGiftIconUrl")) {
                        b = 2;
                    }
                    break;
                case -1063571914:
                    if (str.equals("textColor")) {
                        b = 3;
                    }
                    break;
                case -601169098:
                    if (str.equals("giftSetDescBackgroundPicUrl")) {
                        b = 4;
                    }
                    break;
                case -235878574:
                    if (str.equals("framePicUrl")) {
                        b = 5;
                    }
                    break;
                case -152897142:
                    if (str.equals("schemeUrl")) {
                        b = 6;
                    }
                    break;
                case -136731341:
                    if (str.equals("resourcePicUrl")) {
                        b = 7;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        b = 8;
                    }
                    break;
                case 824133225:
                    if (str.equals("givenGiftTextColor")) {
                        b = 9;
                    }
                    break;
                case 1367839411:
                    if (str.equals("giftSetDescTextColor")) {
                        b = 10;
                    }
                    break;
                case 1638765110:
                    if (str.equals("iconUrl")) {
                        b = 11;
                    }
                    break;
                case 1720862352:
                    if (str.equals("giftSetDescText")) {
                        b = 12;
                    }
                    break;
                case 1967377972:
                    if (str.equals("processColor")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveGiftSetDisplayAttributeItem.purchasePriceColor = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveGiftSetDisplayAttributeItem.processFramePicUrl = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveGiftSetDisplayAttributeItem.givenGiftIconUrl = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveGiftSetDisplayAttributeItem.textColor = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveGiftSetDisplayAttributeItem.giftSetDescBackgroundPicUrl = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveGiftSetDisplayAttributeItem.framePicUrl = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveGiftSetDisplayAttributeItem.schemeUrl = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveGiftSetDisplayAttributeItem.resourcePicUrl = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveGiftSetDisplayAttributeItem.text = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveGiftSetDisplayAttributeItem.givenGiftTextColor = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveGiftSetDisplayAttributeItem.giftSetDescTextColor = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveGiftSetDisplayAttributeItem.iconUrl = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveGiftSetDisplayAttributeItem.giftSetDescText = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveGiftSetDisplayAttributeItem.processColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftSetDisplayAttributeItem.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            String str2 = bLiveGiftSetDisplayAttributeItem.textColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("textColor", str2);
            }
            String str3 = bLiveGiftSetDisplayAttributeItem.giftSetDescText;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftSetDescText", str3);
            }
            String str4 = bLiveGiftSetDisplayAttributeItem.giftSetDescTextColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("giftSetDescTextColor", str4);
            }
            String str5 = bLiveGiftSetDisplayAttributeItem.framePicUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("framePicUrl", str5);
            }
            String str6 = bLiveGiftSetDisplayAttributeItem.processFramePicUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("processFramePicUrl", str6);
            }
            String str7 = bLiveGiftSetDisplayAttributeItem.processColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("processColor", str7);
            }
            String str8 = bLiveGiftSetDisplayAttributeItem.purchasePriceColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("purchasePriceColor", str8);
            }
            String str9 = bLiveGiftSetDisplayAttributeItem.givenGiftIconUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("givenGiftIconUrl", str9);
            }
            String str10 = bLiveGiftSetDisplayAttributeItem.givenGiftTextColor;
            if (str10 != null) {
                jsonGenerator.writeStringField("givenGiftTextColor", str10);
            }
            String str11 = bLiveGiftSetDisplayAttributeItem.resourcePicUrl;
            if (str11 != null) {
                jsonGenerator.writeStringField("resourcePicUrl", str11);
            }
            String str12 = bLiveGiftSetDisplayAttributeItem.schemeUrl;
            if (str12 != null) {
                jsonGenerator.writeStringField("schemeUrl", str12);
            }
            String str13 = bLiveGiftSetDisplayAttributeItem.giftSetDescBackgroundPicUrl;
            if (str13 != null) {
                jsonGenerator.writeStringField("giftSetDescBackgroundPicUrl", str13);
            }
            String str14 = bLiveGiftSetDisplayAttributeItem.text;
            if (str14 != null) {
                jsonGenerator.writeStringField("text", str14);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftSetDisplayAttributeItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftsetdisplayattributeitem";

    @NonNull
    @ProtobufIndex(index = 5)
    public String framePicUrl;

    @NonNull
    @ProtobufIndex(index = 13)
    public String giftSetDescBackgroundPicUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftSetDescText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String giftSetDescTextColor;

    @NonNull
    @ProtobufIndex(index = 9)
    public String givenGiftIconUrl;

    @NonNull
    @ProtobufIndex(index = 10)
    public String givenGiftTextColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 7)
    public String processColor;

    @NonNull
    @ProtobufIndex(index = 6)
    public String processFramePicUrl;

    @NonNull
    @ProtobufIndex(index = 8)
    public String purchasePriceColor;

    @NonNull
    @ProtobufIndex(index = 11)
    public String resourcePicUrl;

    @NonNull
    @ProtobufIndex(index = 12)
    public String schemeUrl;

    @NonNull
    @ProtobufIndex(index = 14)
    public String text;

    @NonNull
    @ProtobufIndex(index = 2)
    public String textColor;

    public static BLiveGiftSetDisplayAttributeItem new_() {
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem = new BLiveGiftSetDisplayAttributeItem();
        bLiveGiftSetDisplayAttributeItem.nullCheck();
        return bLiveGiftSetDisplayAttributeItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftSetDisplayAttributeItem mo223809clone() {
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem = new BLiveGiftSetDisplayAttributeItem();
        bLiveGiftSetDisplayAttributeItem.iconUrl = this.iconUrl;
        bLiveGiftSetDisplayAttributeItem.textColor = this.textColor;
        bLiveGiftSetDisplayAttributeItem.giftSetDescText = this.giftSetDescText;
        bLiveGiftSetDisplayAttributeItem.giftSetDescTextColor = this.giftSetDescTextColor;
        bLiveGiftSetDisplayAttributeItem.framePicUrl = this.framePicUrl;
        bLiveGiftSetDisplayAttributeItem.processFramePicUrl = this.processFramePicUrl;
        bLiveGiftSetDisplayAttributeItem.processColor = this.processColor;
        bLiveGiftSetDisplayAttributeItem.purchasePriceColor = this.purchasePriceColor;
        bLiveGiftSetDisplayAttributeItem.givenGiftIconUrl = this.givenGiftIconUrl;
        bLiveGiftSetDisplayAttributeItem.givenGiftTextColor = this.givenGiftTextColor;
        bLiveGiftSetDisplayAttributeItem.resourcePicUrl = this.resourcePicUrl;
        bLiveGiftSetDisplayAttributeItem.schemeUrl = this.schemeUrl;
        bLiveGiftSetDisplayAttributeItem.giftSetDescBackgroundPicUrl = this.giftSetDescBackgroundPicUrl;
        bLiveGiftSetDisplayAttributeItem.text = this.text;
        return bLiveGiftSetDisplayAttributeItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftSetDisplayAttributeItem)) {
            return false;
        }
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem = (BLiveGiftSetDisplayAttributeItem) obj;
        return ValueObject.util_equals(this.iconUrl, bLiveGiftSetDisplayAttributeItem.iconUrl) && ValueObject.util_equals(this.textColor, bLiveGiftSetDisplayAttributeItem.textColor) && ValueObject.util_equals(this.giftSetDescText, bLiveGiftSetDisplayAttributeItem.giftSetDescText) && ValueObject.util_equals(this.giftSetDescTextColor, bLiveGiftSetDisplayAttributeItem.giftSetDescTextColor) && ValueObject.util_equals(this.framePicUrl, bLiveGiftSetDisplayAttributeItem.framePicUrl) && ValueObject.util_equals(this.processFramePicUrl, bLiveGiftSetDisplayAttributeItem.processFramePicUrl) && ValueObject.util_equals(this.processColor, bLiveGiftSetDisplayAttributeItem.processColor) && ValueObject.util_equals(this.purchasePriceColor, bLiveGiftSetDisplayAttributeItem.purchasePriceColor) && ValueObject.util_equals(this.givenGiftIconUrl, bLiveGiftSetDisplayAttributeItem.givenGiftIconUrl) && ValueObject.util_equals(this.givenGiftTextColor, bLiveGiftSetDisplayAttributeItem.givenGiftTextColor) && ValueObject.util_equals(this.resourcePicUrl, bLiveGiftSetDisplayAttributeItem.resourcePicUrl) && ValueObject.util_equals(this.schemeUrl, bLiveGiftSetDisplayAttributeItem.schemeUrl) && ValueObject.util_equals(this.giftSetDescBackgroundPicUrl, bLiveGiftSetDisplayAttributeItem.giftSetDescBackgroundPicUrl) && ValueObject.util_equals(this.text, bLiveGiftSetDisplayAttributeItem.text);
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
        String str = this.iconUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.textColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.giftSetDescText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.giftSetDescTextColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.framePicUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.processFramePicUrl;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.processColor;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.purchasePriceColor;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.givenGiftIconUrl;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.givenGiftTextColor;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.resourcePicUrl;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.schemeUrl;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.giftSetDescBackgroundPicUrl;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.text;
        int iHashCode14 = iHashCode13 + (str14 != null ? str14.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.giftSetDescText == null) {
            this.giftSetDescText = "";
        }
        if (this.giftSetDescTextColor == null) {
            this.giftSetDescTextColor = "";
        }
        if (this.framePicUrl == null) {
            this.framePicUrl = "";
        }
        if (this.processFramePicUrl == null) {
            this.processFramePicUrl = "";
        }
        if (this.processColor == null) {
            this.processColor = "";
        }
        if (this.purchasePriceColor == null) {
            this.purchasePriceColor = "";
        }
        if (this.givenGiftIconUrl == null) {
            this.givenGiftIconUrl = "";
        }
        if (this.givenGiftTextColor == null) {
            this.givenGiftTextColor = "";
        }
        if (this.resourcePicUrl == null) {
            this.resourcePicUrl = "";
        }
        if (this.schemeUrl == null) {
            this.schemeUrl = "";
        }
        if (this.giftSetDescBackgroundPicUrl == null) {
            this.giftSetDescBackgroundPicUrl = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
