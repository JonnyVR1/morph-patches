package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomContent;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomWindow;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftBubbleConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftBubbleConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftBubbleConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftBubbleConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftBubbleConfig newInstance() {
            return new BLiveGiftBubbleConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1929418501:
                    if (str.equals("showClose")) {
                        b = 0;
                    }
                    break;
                case -1921319945:
                    if (str.equals("descriptions")) {
                        b = 1;
                    }
                    break;
                case -1664056007:
                    if (str.equals("blackClose")) {
                        b = 2;
                    }
                    break;
                case -1377687758:
                    if (str.equals("button")) {
                        b = 3;
                    }
                    break;
                case -1221270899:
                    if (str.equals("header")) {
                        b = 4;
                    }
                    break;
                case -934616827:
                    if (str.equals("remind")) {
                        b = 5;
                    }
                    break;
                case -907987551:
                    if (str.equals("schema")) {
                        b = 6;
                    }
                    break;
                case -787751952:
                    if (str.equals(BLiveBottomPopupStyleTypeEnum.window)) {
                        b = 7;
                    }
                    break;
                case -518603552:
                    if (str.equals("remindID")) {
                        b = 8;
                    }
                    break;
                case -410152228:
                    if (str.equals("bubbleShowAfterWatch")) {
                        b = 9;
                    }
                    break;
                case -389627222:
                    if (str.equals("contentDesc")) {
                        b = 10;
                    }
                    break;
                case -120800034:
                    if (str.equals("giftItemId")) {
                        b = 11;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 12;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 14;
                    }
                    break;
                case 110532135:
                    if (str.equals(OMSTemplateModeType.toast)) {
                        b = 15;
                    }
                    break;
                case 163334105:
                    if (str.equals("bubbleText")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 805826154:
                    if (str.equals("contentColor")) {
                        b = 17;
                    }
                    break;
                case 849185533:
                    if (str.equals("giftNums")) {
                        b = 18;
                    }
                    break;
                case 951530617:
                    if (str.equals("content")) {
                        b = 19;
                    }
                    break;
                case 1287124693:
                    if (str.equals("backgroundColor")) {
                        b = 20;
                    }
                    break;
                case 1603299669:
                    if (str.equals("displayRules")) {
                        b = 21;
                    }
                    break;
                case 1638765110:
                    if (str.equals("iconUrl")) {
                        b = 22;
                    }
                    break;
                case 1805312139:
                    if (str.equals("styleType")) {
                        b = 23;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveGiftBubbleConfig.showClose = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveGiftBubbleConfig.descriptions = JsonAdapter.parseArray(jsonParser, BLiveBottomContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveGiftBubbleConfig.blackClose = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    bLiveGiftBubbleConfig.button = BLiveGiftBubblePopupButton.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveGiftBubbleConfig.header = BLiveGiftBubbleHeader.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveGiftBubbleConfig.remind = BLiveGiftBubblePopupRemind.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveGiftBubbleConfig.schema = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveGiftBubbleConfig.window = JsonAdapter.parseArray(jsonParser, BLiveBottomWindow.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveGiftBubbleConfig.remindID = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    bLiveGiftBubbleConfig.bubbleShowAfterWatch = jsonParser.getValueAsInt();
                    return true;
                case 10:
                    bLiveGiftBubbleConfig.contentDesc = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveGiftBubbleConfig.giftItemId = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    bLiveGiftBubbleConfig.type = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveGiftBubbleConfig.extra = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveGiftBubbleConfig.title = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveGiftBubbleConfig.toast = BLiveGiftBubbleToast.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    bLiveGiftBubbleConfig.bubbleText = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveGiftBubbleConfig.contentColor = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveGiftBubbleConfig.giftNums = jsonParser.getValueAsInt();
                    return true;
                case 19:
                    bLiveGiftBubbleConfig.content = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveGiftBubbleConfig.backgroundColor = jsonParser.getValueAsString();
                    return true;
                case 21:
                    bLiveGiftBubbleConfig.displayRules = BLiveGiftBubbleRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveGiftBubbleConfig.iconUrl = jsonParser.getValueAsString();
                    return true;
                case 23:
                    bLiveGiftBubbleConfig.styleType = BLiveBottomPopupStyleTypeEnum.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftBubbleConfig.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveGiftBubbleConfig.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
            String str3 = bLiveGiftBubbleConfig.bubbleText;
            if (str3 != null) {
                jsonGenerator.writeStringField("bubbleText", str3);
            }
            String str4 = bLiveGiftBubbleConfig.iconUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("iconUrl", str4);
            }
            jsonGenerator.writeNumberField("giftItemId", bLiveGiftBubbleConfig.giftItemId);
            jsonGenerator.writeNumberField("giftNums", bLiveGiftBubbleConfig.giftNums);
            jsonGenerator.writeNumberField("bubbleShowAfterWatch", bLiveGiftBubbleConfig.bubbleShowAfterWatch);
            if (bLiveGiftBubbleConfig.displayRules != null) {
                jsonGenerator.writeFieldName("displayRules");
                BLiveGiftBubbleRule.JSON_ADAPTER.serialize(bLiveGiftBubbleConfig.displayRules, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("remindID", bLiveGiftBubbleConfig.remindID);
            String str5 = bLiveGiftBubbleConfig.schema;
            if (str5 != null) {
                jsonGenerator.writeStringField("schema", str5);
            }
            if (bLiveGiftBubbleConfig.button != null) {
                jsonGenerator.writeFieldName("button");
                BLiveGiftBubblePopupButton.JSON_ADAPTER.serialize(bLiveGiftBubbleConfig.button, jsonGenerator, true);
            }
            if (bLiveGiftBubbleConfig.remind != null) {
                jsonGenerator.writeFieldName("remind");
                BLiveGiftBubblePopupRemind.JSON_ADAPTER.serialize(bLiveGiftBubbleConfig.remind, jsonGenerator, true);
            }
            String str6 = bLiveGiftBubbleConfig.type;
            if (str6 != null) {
                jsonGenerator.writeStringField("type", str6);
            }
            String str7 = bLiveGiftBubbleConfig.extra;
            if (str7 != null) {
                jsonGenerator.writeStringField("extra", str7);
            }
            if (bLiveGiftBubbleConfig.toast != null) {
                jsonGenerator.writeFieldName(OMSTemplateModeType.toast);
                BLiveGiftBubbleToast.JSON_ADAPTER.serialize(bLiveGiftBubbleConfig.toast, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showClose", bLiveGiftBubbleConfig.showClose);
            if (bLiveGiftBubbleConfig.header != null) {
                jsonGenerator.writeFieldName("header");
                BLiveGiftBubbleHeader.JSON_ADAPTER.serialize(bLiveGiftBubbleConfig.header, jsonGenerator, true);
            }
            String str8 = bLiveGiftBubbleConfig.backgroundColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("backgroundColor", str8);
            }
            String str9 = bLiveGiftBubbleConfig.contentColor;
            if (str9 != null) {
                jsonGenerator.writeStringField("contentColor", str9);
            }
            jsonGenerator.writeBooleanField("blackClose", bLiveGiftBubbleConfig.blackClose);
            if (bLiveGiftBubbleConfig.styleType != null) {
                jsonGenerator.writeFieldName("styleType");
                BLiveBottomPopupStyleTypeEnum.JSON_ADAPTER.serialize(bLiveGiftBubbleConfig.styleType, jsonGenerator, true);
            }
            if (bLiveGiftBubbleConfig.descriptions != null) {
                jsonGenerator.writeFieldName("descriptions");
                JsonAdapter.serializeArray(bLiveGiftBubbleConfig.descriptions, jsonGenerator, BLiveBottomContent.JSON_ADAPTER);
            }
            if (bLiveGiftBubbleConfig.window != null) {
                jsonGenerator.writeFieldName(BLiveBottomPopupStyleTypeEnum.window);
                JsonAdapter.serializeArray(bLiveGiftBubbleConfig.window, jsonGenerator, BLiveBottomWindow.JSON_ADAPTER);
            }
            String str10 = bLiveGiftBubbleConfig.contentDesc;
            if (str10 != null) {
                jsonGenerator.writeStringField("contentDesc", str10);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftBubbleConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftbubbleconfig";

    @NonNull
    @ProtobufIndex(index = 18)
    public String backgroundColor;

    @ProtobufIndex(index = 20)
    public boolean blackClose;

    @ProtobufIndex(index = 7)
    public int bubbleShowAfterWatch;

    @NonNull
    @ProtobufIndex(index = 3)
    public String bubbleText;

    @NonNull
    @ProtobufIndex(index = 11)
    public BLiveGiftBubblePopupButton button;

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    @NonNull
    @ProtobufIndex(index = 19)
    public String contentColor;

    @NonNull
    @ProtobufIndex(index = 24)
    public String contentDesc;

    @NonNull
    @ProtobufIndex(index = 22)
    public List<BLiveBottomContent> descriptions;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveGiftBubbleRule displayRules;

    @NonNull
    @ProtobufIndex(index = 14)
    public String extra;
    public x20 extraClickAction;

    @ProtobufIndex(index = 5)
    public int giftItemId;

    @ProtobufIndex(index = 6)
    public int giftNums;

    @NonNull
    @ProtobufIndex(index = 17)
    public BLiveGiftBubbleHeader header;

    @NonNull
    @ProtobufIndex(index = 4)
    public String iconUrl;
    public boolean isCircle;
    public boolean isFromLongLink;

    @NonNull
    @ProtobufIndex(index = 12)
    public BLiveGiftBubblePopupRemind remind;

    @ProtobufIndex(index = 9)
    public int remindID;

    @NonNull
    @ProtobufIndex(index = 10)
    public String schema;

    @ProtobufIndex(index = 16)
    public boolean showClose;

    @NonNull
    @ProtobufIndex(index = 21)
    public BLiveBottomPopupStyleTypeEnum styleType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 15)
    public BLiveGiftBubbleToast toast;

    @NonNull
    @ProtobufIndex(index = 13)
    public String type;

    @NonNull
    @ProtobufIndex(index = 23)
    public List<BLiveBottomWindow> window;

    public static BLiveGiftBubbleConfig new_() {
        BLiveGiftBubbleConfig bLiveGiftBubbleConfig = new BLiveGiftBubbleConfig();
        bLiveGiftBubbleConfig.nullCheck();
        return bLiveGiftBubbleConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftBubbleConfig mo225055clone() {
        BLiveGiftBubbleConfig bLiveGiftBubbleConfig = new BLiveGiftBubbleConfig();
        bLiveGiftBubbleConfig.title = this.title;
        bLiveGiftBubbleConfig.content = this.content;
        bLiveGiftBubbleConfig.bubbleText = this.bubbleText;
        bLiveGiftBubbleConfig.iconUrl = this.iconUrl;
        bLiveGiftBubbleConfig.giftItemId = this.giftItemId;
        bLiveGiftBubbleConfig.giftNums = this.giftNums;
        bLiveGiftBubbleConfig.bubbleShowAfterWatch = this.bubbleShowAfterWatch;
        BLiveGiftBubbleRule bLiveGiftBubbleRule = this.displayRules;
        if (bLiveGiftBubbleRule != null) {
            bLiveGiftBubbleConfig.displayRules = bLiveGiftBubbleRule.mo225055clone();
        }
        bLiveGiftBubbleConfig.remindID = this.remindID;
        bLiveGiftBubbleConfig.schema = this.schema;
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = this.button;
        if (bLiveGiftBubblePopupButton != null) {
            bLiveGiftBubbleConfig.button = bLiveGiftBubblePopupButton.mo225055clone();
        }
        BLiveGiftBubblePopupRemind bLiveGiftBubblePopupRemind = this.remind;
        if (bLiveGiftBubblePopupRemind != null) {
            bLiveGiftBubbleConfig.remind = bLiveGiftBubblePopupRemind.mo225055clone();
        }
        bLiveGiftBubbleConfig.type = this.type;
        bLiveGiftBubbleConfig.extra = this.extra;
        BLiveGiftBubbleToast bLiveGiftBubbleToast = this.toast;
        if (bLiveGiftBubbleToast != null) {
            bLiveGiftBubbleConfig.toast = bLiveGiftBubbleToast.mo225055clone();
        }
        bLiveGiftBubbleConfig.showClose = this.showClose;
        BLiveGiftBubbleHeader bLiveGiftBubbleHeader = this.header;
        if (bLiveGiftBubbleHeader != null) {
            bLiveGiftBubbleConfig.header = bLiveGiftBubbleHeader.mo225055clone();
        }
        bLiveGiftBubbleConfig.backgroundColor = this.backgroundColor;
        bLiveGiftBubbleConfig.contentColor = this.contentColor;
        bLiveGiftBubbleConfig.blackClose = this.blackClose;
        bLiveGiftBubbleConfig.styleType = this.styleType;
        List<BLiveBottomContent> list = this.descriptions;
        if (list != null) {
            bLiveGiftBubbleConfig.descriptions = ValueObject.util_map(list, new qcj() { // from class: l.k02
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveBottomContent) obj).mo225055clone();
                }
            });
        }
        List<BLiveBottomWindow> list2 = this.window;
        if (list2 != null) {
            bLiveGiftBubbleConfig.window = ValueObject.util_map(list2, new qcj() { // from class: l.l02
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveBottomWindow) obj).mo225055clone();
                }
            });
        }
        bLiveGiftBubbleConfig.contentDesc = this.contentDesc;
        return bLiveGiftBubbleConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftBubbleConfig)) {
            return false;
        }
        BLiveGiftBubbleConfig bLiveGiftBubbleConfig = (BLiveGiftBubbleConfig) obj;
        return ValueObject.util_equals(this.title, bLiveGiftBubbleConfig.title) && ValueObject.util_equals(this.content, bLiveGiftBubbleConfig.content) && ValueObject.util_equals(this.bubbleText, bLiveGiftBubbleConfig.bubbleText) && ValueObject.util_equals(this.iconUrl, bLiveGiftBubbleConfig.iconUrl) && this.giftItemId == bLiveGiftBubbleConfig.giftItemId && this.giftNums == bLiveGiftBubbleConfig.giftNums && this.bubbleShowAfterWatch == bLiveGiftBubbleConfig.bubbleShowAfterWatch && ValueObject.util_equals(this.displayRules, bLiveGiftBubbleConfig.displayRules) && this.remindID == bLiveGiftBubbleConfig.remindID && ValueObject.util_equals(this.schema, bLiveGiftBubbleConfig.schema) && ValueObject.util_equals(this.button, bLiveGiftBubbleConfig.button) && ValueObject.util_equals(this.remind, bLiveGiftBubbleConfig.remind) && ValueObject.util_equals(this.type, bLiveGiftBubbleConfig.type) && ValueObject.util_equals(this.extra, bLiveGiftBubbleConfig.extra) && ValueObject.util_equals(this.toast, bLiveGiftBubbleConfig.toast) && this.showClose == bLiveGiftBubbleConfig.showClose && ValueObject.util_equals(this.header, bLiveGiftBubbleConfig.header) && ValueObject.util_equals(this.backgroundColor, bLiveGiftBubbleConfig.backgroundColor) && ValueObject.util_equals(this.contentColor, bLiveGiftBubbleConfig.contentColor) && this.blackClose == bLiveGiftBubbleConfig.blackClose && ValueObject.util_equals(this.styleType, bLiveGiftBubbleConfig.styleType) && ValueObject.util_equals(this.descriptions, bLiveGiftBubbleConfig.descriptions) && ValueObject.util_equals(this.window, bLiveGiftBubbleConfig.window) && ValueObject.util_equals(this.contentDesc, bLiveGiftBubbleConfig.contentDesc);
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
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bubbleText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.iconUrl;
        int iHashCode4 = (((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.giftItemId) * 41) + this.giftNums) * 41) + this.bubbleShowAfterWatch) * 41;
        BLiveGiftBubbleRule bLiveGiftBubbleRule = this.displayRules;
        int iHashCode5 = (((iHashCode4 + (bLiveGiftBubbleRule != null ? bLiveGiftBubbleRule.hashCode() : 0)) * 41) + this.remindID) * 41;
        String str5 = this.schema;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveGiftBubblePopupButton bLiveGiftBubblePopupButton = this.button;
        int iHashCode7 = (iHashCode6 + (bLiveGiftBubblePopupButton != null ? bLiveGiftBubblePopupButton.hashCode() : 0)) * 41;
        BLiveGiftBubblePopupRemind bLiveGiftBubblePopupRemind = this.remind;
        int iHashCode8 = (iHashCode7 + (bLiveGiftBubblePopupRemind != null ? bLiveGiftBubblePopupRemind.hashCode() : 0)) * 41;
        String str6 = this.type;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.extra;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41;
        BLiveGiftBubbleToast bLiveGiftBubbleToast = this.toast;
        int iHashCode11 = (((iHashCode10 + (bLiveGiftBubbleToast != null ? bLiveGiftBubbleToast.hashCode() : 0)) * 41) + (this.showClose ? 1231 : 1237)) * 41;
        BLiveGiftBubbleHeader bLiveGiftBubbleHeader = this.header;
        int iHashCode12 = (iHashCode11 + (bLiveGiftBubbleHeader != null ? bLiveGiftBubbleHeader.hashCode() : 0)) * 41;
        String str8 = this.backgroundColor;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.contentColor;
        int iHashCode14 = (((iHashCode13 + (str9 != null ? str9.hashCode() : 0)) * 41) + (this.blackClose ? 1231 : 1237)) * 41;
        BLiveBottomPopupStyleTypeEnum bLiveBottomPopupStyleTypeEnum = this.styleType;
        int iHashCode15 = (iHashCode14 + (bLiveBottomPopupStyleTypeEnum != null ? bLiveBottomPopupStyleTypeEnum.hashCode() : 0)) * 41;
        List<BLiveBottomContent> list = this.descriptions;
        int iHashCode16 = (iHashCode15 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveBottomWindow> list2 = this.window;
        int iHashCode17 = (iHashCode16 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str10 = this.contentDesc;
        int iHashCode18 = iHashCode17 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode18;
        return iHashCode18;
    }

    public boolean isTitlePositionCenter() {
        return TEnum.equals(this.header.position, "center");
    }

    public boolean isTitlePositionMiddle() {
        return TEnum.equals(this.header.position, BLiveGiftBubblePopupTitlePosition.middle);
    }

    public boolean isTurboCoupon() {
        return "anchor-daily-task".equals(this.type);
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.bubbleText) && this.giftItemId > 0 && this.bubbleShowAfterWatch > 0;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.bubbleText == null) {
            this.bubbleText = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.displayRules == null) {
            this.displayRules = BLiveGiftBubbleRule.new_();
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.button == null) {
            this.button = BLiveGiftBubblePopupButton.new_();
        }
        if (this.remind == null) {
            this.remind = BLiveGiftBubblePopupRemind.new_();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.extra == null) {
            this.extra = "";
        }
        if (this.toast == null) {
            this.toast = BLiveGiftBubbleToast.new_();
        }
        if (this.header == null) {
            this.header = BLiveGiftBubbleHeader.new_();
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
        if (this.contentColor == null) {
            this.contentColor = "";
        }
        if (this.styleType == null) {
            this.styleType = (BLiveBottomPopupStyleTypeEnum) BLiveBottomPopupStyleTypeEnum.JSON_ADAPTER.defaultEnum();
        }
        if (this.descriptions == null) {
            this.descriptions = new ArrayList();
        }
        if (this.window == null) {
            this.window = new ArrayList();
        }
        if (this.contentDesc == null) {
            this.contentDesc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
