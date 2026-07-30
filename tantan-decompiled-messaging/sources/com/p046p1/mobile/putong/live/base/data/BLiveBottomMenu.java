package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Bubbles;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomMenu;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveChatBox;
import com.p046p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.sina.weibo.sdk.constant.WBConstants;
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
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveBottomMenu extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBottomMenu> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBottomMenu>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBottomMenu.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBottomMenu.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBottomMenu newInstance() {
            return new BLiveBottomMenu();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveBottomMenu bLiveBottomMenu, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1986648670:
                    if (str.equals("settingButton")) {
                        b = 0;
                    }
                    break;
                case -1428973705:
                    if (str.equals("redDotDisappearMod")) {
                        b = 1;
                    }
                    break;
                case -689612272:
                    if (str.equals("enableLatestPlayButton")) {
                        b = 2;
                    }
                    break;
                case 3347807:
                    if (str.equals(NavigationIntent.menu)) {
                        b = 3;
                    }
                    break;
                case 224189799:
                    if (str.equals(Bubbles.TYPE)) {
                        b = 4;
                    }
                    break;
                case 241352577:
                    if (str.equals(Constants.KEY_BUTTONS)) {
                        b = 5;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 6;
                    }
                    break;
                case 525528601:
                    if (str.equals("enableInputButton")) {
                        b = 7;
                    }
                    break;
                case 739087187:
                    if (str.equals("chatBox")) {
                        b = 8;
                    }
                    break;
                case 764140066:
                    if (str.equals("bubbleOrder")) {
                        b = 9;
                    }
                    break;
                case 1130527967:
                    if (str.equals("enableSettingButton")) {
                        b = 10;
                    }
                    break;
                case 1347698522:
                    if (str.equals("userEnableBubble")) {
                        b = 11;
                    }
                    break;
                case 1565844277:
                    if (str.equals("categorys")) {
                        b = 12;
                    }
                    break;
                case 1670448457:
                    if (str.equals("everyDayShowMaxCount")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveBottomMenu.settingButton = BLiveSettingButton.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveBottomMenu.redDotDisappearMod = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveBottomMenu.enableLatestPlayButton = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    bLiveBottomMenu.menu = BLiveBottomButtonDivision.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveBottomMenu.bubbles = JsonAdapter.parseArray(jsonParser, BLiveBubbleConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveBottomMenu.buttons = JsonAdapter.parseArray(jsonParser, BLiveBottomButton.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveBottomMenu.version = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveBottomMenu.enableInputButton = jsonParser.getValueAsBoolean();
                    return true;
                case 8:
                    bLiveBottomMenu.chatBox = JsonAdapter.parseArray(jsonParser, BLiveChatBox.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveBottomMenu.bubbleOrder = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveBottomMenu.enableSettingButton = jsonParser.getValueAsBoolean();
                    return true;
                case 11:
                    bLiveBottomMenu.userEnableBubble = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    bLiveBottomMenu.categorys = JsonAdapter.parseArray(jsonParser, BLiveSettingButtonCategory.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLiveBottomMenu.everyDayShowMaxCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBottomMenu bLiveBottomMenu, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveBottomMenu.settingButton != null) {
                jsonGenerator.writeFieldName("settingButton");
                BLiveSettingButton.JSON_ADAPTER.serialize(bLiveBottomMenu.settingButton, jsonGenerator, true);
            }
            if (bLiveBottomMenu.buttons != null) {
                jsonGenerator.writeFieldName(Constants.KEY_BUTTONS);
                JsonAdapter.serializeArray(bLiveBottomMenu.buttons, jsonGenerator, BLiveBottomButton.JSON_ADAPTER);
            }
            if (bLiveBottomMenu.categorys != null) {
                jsonGenerator.writeFieldName("categorys");
                JsonAdapter.serializeArray(bLiveBottomMenu.categorys, jsonGenerator, BLiveSettingButtonCategory.JSON_ADAPTER);
            }
            if (bLiveBottomMenu.menu != null) {
                jsonGenerator.writeFieldName(NavigationIntent.menu);
                BLiveBottomButtonDivision.JSON_ADAPTER.serialize(bLiveBottomMenu.menu, jsonGenerator, true);
            }
            if (bLiveBottomMenu.bubbleOrder != null) {
                jsonGenerator.writeFieldName("bubbleOrder");
                JsonAdapter.serializeArray(bLiveBottomMenu.bubbleOrder, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = bLiveBottomMenu.redDotDisappearMod;
            if (str != null) {
                jsonGenerator.writeStringField("redDotDisappearMod", str);
            }
            jsonGenerator.writeBooleanField("userEnableBubble", bLiveBottomMenu.userEnableBubble);
            jsonGenerator.writeNumberField("everyDayShowMaxCount", bLiveBottomMenu.everyDayShowMaxCount);
            jsonGenerator.writeBooleanField("enableSettingButton", bLiveBottomMenu.enableSettingButton);
            jsonGenerator.writeBooleanField("enableInputButton", bLiveBottomMenu.enableInputButton);
            if (bLiveBottomMenu.bubbles != null) {
                jsonGenerator.writeFieldName(Bubbles.TYPE);
                JsonAdapter.serializeArray(bLiveBottomMenu.bubbles, jsonGenerator, BLiveBubbleConfig.JSON_ADAPTER);
            }
            if (bLiveBottomMenu.chatBox != null) {
                jsonGenerator.writeFieldName("chatBox");
                JsonAdapter.serializeArray(bLiveBottomMenu.chatBox, jsonGenerator, BLiveChatBox.JSON_ADAPTER);
            }
            String str2 = bLiveBottomMenu.version;
            if (str2 != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str2);
            }
            jsonGenerator.writeBooleanField("enableLatestPlayButton", bLiveBottomMenu.enableLatestPlayButton);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBottomMenu) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebottommenu";

    @Nullable
    @ProtobufIndex(index = 5)
    public List<String> bubbleOrder;

    @Nullable
    @ProtobufIndex(index = 11)
    public List<BLiveBubbleConfig> bubbles;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<BLiveBottomButton> buttons;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<BLiveSettingButtonCategory> categorys;

    @Nullable
    @ProtobufIndex(index = 12)
    public List<BLiveChatBox> chatBox;

    @ProtobufIndex(index = 10)
    public boolean enableInputButton;

    @ProtobufIndex(index = 14)
    public boolean enableLatestPlayButton;

    @ProtobufIndex(index = 9)
    public boolean enableSettingButton;

    @ProtobufIndex(index = 8)
    public int everyDayShowMaxCount;

    @Nullable
    @ProtobufIndex(index = 4)
    public BLiveBottomButtonDivision menu;

    @Nullable
    @ProtobufIndex(index = 6)
    public String redDotDisappearMod;

    @Nullable
    @ProtobufIndex(index = 1)
    public BLiveSettingButton settingButton;

    @ProtobufIndex(index = 7)
    public boolean userEnableBubble;

    @Nullable
    @ProtobufIndex(index = 13)
    public String version;

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m67715e(String str) {
        return str;
    }

    public static BLiveBottomMenu new_() {
        BLiveBottomMenu bLiveBottomMenu = new BLiveBottomMenu();
        bLiveBottomMenu.nullCheck();
        return bLiveBottomMenu;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBottomMenu mo223809clone() {
        BLiveBottomMenu bLiveBottomMenu = new BLiveBottomMenu();
        BLiveSettingButton bLiveSettingButton = this.settingButton;
        if (bLiveSettingButton != null) {
            bLiveBottomMenu.settingButton = bLiveSettingButton.mo223809clone();
        }
        List<BLiveBottomButton> list = this.buttons;
        if (list != null) {
            bLiveBottomMenu.buttons = ValueObject.util_map(list, new w9j() { // from class: l.xr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveBottomButton) obj).mo223809clone();
                }
            });
        }
        List<BLiveSettingButtonCategory> list2 = this.categorys;
        if (list2 != null) {
            bLiveBottomMenu.categorys = ValueObject.util_map(list2, new w9j() { // from class: l.yr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSettingButtonCategory) obj).mo223809clone();
                }
            });
        }
        BLiveBottomButtonDivision bLiveBottomButtonDivision = this.menu;
        if (bLiveBottomButtonDivision != null) {
            bLiveBottomMenu.menu = bLiveBottomButtonDivision.mo223809clone();
        }
        List<String> list3 = this.bubbleOrder;
        if (list3 != null) {
            bLiveBottomMenu.bubbleOrder = ValueObject.util_map(list3, new w9j() { // from class: l.zr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveBottomMenu.m67715e((String) obj);
                }
            });
        }
        bLiveBottomMenu.redDotDisappearMod = this.redDotDisappearMod;
        bLiveBottomMenu.userEnableBubble = this.userEnableBubble;
        bLiveBottomMenu.everyDayShowMaxCount = this.everyDayShowMaxCount;
        bLiveBottomMenu.enableSettingButton = this.enableSettingButton;
        bLiveBottomMenu.enableInputButton = this.enableInputButton;
        List<BLiveBubbleConfig> list4 = this.bubbles;
        if (list4 != null) {
            bLiveBottomMenu.bubbles = ValueObject.util_map(list4, new w9j() { // from class: l.as1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveBubbleConfig) obj).mo223809clone();
                }
            });
        }
        List<BLiveChatBox> list5 = this.chatBox;
        if (list5 != null) {
            bLiveBottomMenu.chatBox = ValueObject.util_map(list5, new w9j() { // from class: l.bs1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveChatBox) obj).mo223809clone();
                }
            });
        }
        bLiveBottomMenu.version = this.version;
        bLiveBottomMenu.enableLatestPlayButton = this.enableLatestPlayButton;
        return bLiveBottomMenu;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBottomMenu)) {
            return false;
        }
        BLiveBottomMenu bLiveBottomMenu = (BLiveBottomMenu) obj;
        return ValueObject.util_equals(this.settingButton, bLiveBottomMenu.settingButton) && ValueObject.util_equals(this.buttons, bLiveBottomMenu.buttons) && ValueObject.util_equals(this.categorys, bLiveBottomMenu.categorys) && ValueObject.util_equals(this.menu, bLiveBottomMenu.menu) && ValueObject.util_equals(this.bubbleOrder, bLiveBottomMenu.bubbleOrder) && ValueObject.util_equals(this.redDotDisappearMod, bLiveBottomMenu.redDotDisappearMod) && this.userEnableBubble == bLiveBottomMenu.userEnableBubble && this.everyDayShowMaxCount == bLiveBottomMenu.everyDayShowMaxCount && this.enableSettingButton == bLiveBottomMenu.enableSettingButton && this.enableInputButton == bLiveBottomMenu.enableInputButton && ValueObject.util_equals(this.bubbles, bLiveBottomMenu.bubbles) && ValueObject.util_equals(this.chatBox, bLiveBottomMenu.chatBox) && ValueObject.util_equals(this.version, bLiveBottomMenu.version) && this.enableLatestPlayButton == bLiveBottomMenu.enableLatestPlayButton;
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
        BLiveSettingButton bLiveSettingButton = this.settingButton;
        int iHashCode = (i2 + (bLiveSettingButton != null ? bLiveSettingButton.hashCode() : 0)) * 41;
        List<BLiveBottomButton> list = this.buttons;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveSettingButtonCategory> list2 = this.categorys;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveBottomButtonDivision bLiveBottomButtonDivision = this.menu;
        int iHashCode4 = (iHashCode3 + (bLiveBottomButtonDivision != null ? bLiveBottomButtonDivision.hashCode() : 0)) * 41;
        List<String> list3 = this.bubbleOrder;
        int iHashCode5 = (iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str = this.redDotDisappearMod;
        int iHashCode6 = (((((((((iHashCode5 + (str != null ? str.hashCode() : 0)) * 41) + (this.userEnableBubble ? 1231 : 1237)) * 41) + this.everyDayShowMaxCount) * 41) + (this.enableSettingButton ? 1231 : 1237)) * 41) + (this.enableInputButton ? 1231 : 1237)) * 41;
        List<BLiveBubbleConfig> list4 = this.bubbles;
        int iHashCode7 = (iHashCode6 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<BLiveChatBox> list5 = this.chatBox;
        int iHashCode8 = (iHashCode7 + (list5 != null ? list5.hashCode() : 0)) * 41;
        String str2 = this.version;
        int iHashCode9 = ((iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.enableLatestPlayButton ? 1231 : 1237);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
