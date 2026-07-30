package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
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
import org.spongycastle.math.p131ec.Tnaf;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveBottomButton extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBottomButton> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBottomButton>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBottomButton.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBottomButton.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBottomButton newInstance() {
            return new BLiveBottomButton();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveBottomButton bLiveBottomButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1730092453:
                    if (str.equals("enableRedDot")) {
                        b = 0;
                    }
                    break;
                case -1274500226:
                    if (str.equals("fillUp")) {
                        b = 1;
                    }
                    break;
                case -1110417409:
                    if (str.equals("labels")) {
                        b = 2;
                    }
                    break;
                case -873960694:
                    if (str.equals("ticker")) {
                        b = 3;
                    }
                    break;
                case -683486410:
                    if (str.equals("isClosed")) {
                        b = 4;
                    }
                    break;
                case -454188645:
                    if (str.equals("enableNewlyEffect")) {
                        b = 5;
                    }
                    break;
                case -351879945:
                    if (str.equals("redDotCount")) {
                        b = 6;
                    }
                    break;
                case -255315832:
                    if (str.equals("jumpType")) {
                        b = 7;
                    }
                    break;
                case -172220347:
                    if (str.equals("callback")) {
                        b = 8;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 9;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 10;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 11;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 12;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 14;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 15;
                    }
                    break;
                case 697994892:
                    if (str.equals("bubbleIds")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1018334798:
                    if (str.equals("minAnchorHierarchy")) {
                        b = 17;
                    }
                    break;
                case 1118509956:
                    if (str.equals("animation")) {
                        b = 18;
                    }
                    break;
                case 1767875043:
                    if (str.equals("alignment")) {
                        b = 19;
                    }
                    break;
                case 1858039661:
                    if (str.equals("minAnchorHierarchyTip")) {
                        b = 20;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveBottomButton.enableRedDot = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveBottomButton.fillUp = jsonParser.getValueAsBoolean();
                    return true;
                case 2:
                    bLiveBottomButton.labels = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveBottomButton.ticker = BLiveTicker.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveBottomButton.isClosed = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveBottomButton.enableNewlyEffect = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    bLiveBottomButton.redDotCount = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    bLiveBottomButton.jumpType = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveBottomButton.callback = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    bLiveBottomButton.f44339id = jsonParser.getValueAsInt();
                    return false;
                case 10:
                    bLiveBottomButton.url = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveBottomButton.icon = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveBottomButton.name = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveBottomButton.text = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveBottomButton.type = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveBottomButton.category = jsonParser.getValueAsInt();
                    return true;
                case 16:
                    bLiveBottomButton.bubbleIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLiveBottomButton.minAnchorHierarchy = jsonParser.getValueAsInt();
                    return true;
                case 18:
                    bLiveBottomButton.animation = BLiveButtonAnimation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    bLiveBottomButton.alignment = jsonParser.getValueAsInt();
                    return true;
                case 20:
                    bLiveBottomButton.minAnchorHierarchyTip = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBottomButton bLiveBottomButton, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveBottomButton.f44339id);
            String str = bLiveBottomButton.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveBottomButton.jumpType;
            if (str2 != null) {
                jsonGenerator.writeStringField("jumpType", str2);
            }
            jsonGenerator.writeNumberField("category", bLiveBottomButton.category);
            String str3 = bLiveBottomButton.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            if (bLiveBottomButton.bubbleIds != null) {
                jsonGenerator.writeFieldName("bubbleIds");
                JsonAdapter.serializeArray(bLiveBottomButton.bubbleIds, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeBooleanField("enableRedDot", bLiveBottomButton.enableRedDot);
            if (bLiveBottomButton.icon != null) {
                jsonGenerator.writeFieldName("icon");
                JsonAdapter.serializeArray(bLiveBottomButton.icon, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("fillUp", bLiveBottomButton.fillUp);
            String str4 = bLiveBottomButton.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            jsonGenerator.writeNumberField("minAnchorHierarchy", bLiveBottomButton.minAnchorHierarchy);
            String str5 = bLiveBottomButton.minAnchorHierarchyTip;
            if (str5 != null) {
                jsonGenerator.writeStringField("minAnchorHierarchyTip", str5);
            }
            jsonGenerator.writeBooleanField("callback", bLiveBottomButton.callback);
            jsonGenerator.writeBooleanField("enableNewlyEffect", bLiveBottomButton.enableNewlyEffect);
            if (bLiveBottomButton.labels != null) {
                jsonGenerator.writeFieldName("labels");
                JsonAdapter.serializeArray(bLiveBottomButton.labels, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("isClosed", bLiveBottomButton.isClosed);
            String str6 = bLiveBottomButton.text;
            if (str6 != null) {
                jsonGenerator.writeStringField("text", str6);
            }
            if (bLiveBottomButton.ticker != null) {
                jsonGenerator.writeFieldName("ticker");
                BLiveTicker.JSON_ADAPTER.serialize(bLiveBottomButton.ticker, jsonGenerator, true);
            }
            if (bLiveBottomButton.animation != null) {
                jsonGenerator.writeFieldName("animation");
                BLiveButtonAnimation.JSON_ADAPTER.serialize(bLiveBottomButton.animation, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("redDotCount", bLiveBottomButton.redDotCount);
            jsonGenerator.writeNumberField("alignment", bLiveBottomButton.alignment);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBottomButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebottombutton";

    @ProtobufIndex(index = 21)
    public int alignment;

    @NonNull
    @ProtobufIndex(index = 19)
    public BLiveButtonAnimation animation;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<Integer> bubbleIds;

    @ProtobufIndex(index = 13)
    public boolean callback;

    @ProtobufIndex(index = 4)
    public int category;

    @ProtobufIndex(index = 14)
    public boolean enableNewlyEffect;

    @ProtobufIndex(index = 7)
    public boolean enableRedDot;

    @ProtobufIndex(index = 9)
    public boolean fillUp;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> icon;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44339id;

    @ProtobufIndex(index = 16)
    public boolean isClosed;

    @NonNull
    @ProtobufIndex(index = 3)
    public String jumpType;

    @NonNull
    @ProtobufIndex(index = 15)
    public List<String> labels;
    public BLiveButtonType localType;

    @ProtobufIndex(index = 11)
    public int minAnchorHierarchy;

    @NonNull
    @ProtobufIndex(index = 12)
    public String minAnchorHierarchyTip;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 20)
    public int redDotCount;

    @NonNull
    @ProtobufIndex(index = 17)
    public String text;

    @NonNull
    @ProtobufIndex(index = 18)
    public BLiveTicker ticker;

    @NonNull
    @ProtobufIndex(index = 10)
    public String type;

    @NonNull
    @ProtobufIndex(index = 5)
    public String url;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m67699a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m67700b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m67701c(String str) {
        return str;
    }

    public static BLiveBottomButton new_() {
        BLiveBottomButton bLiveBottomButton = new BLiveBottomButton();
        bLiveBottomButton.nullCheck();
        return bLiveBottomButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBottomButton mo223809clone() {
        BLiveBottomButton bLiveBottomButton = new BLiveBottomButton();
        bLiveBottomButton.f44339id = this.f44339id;
        bLiveBottomButton.name = this.name;
        bLiveBottomButton.jumpType = this.jumpType;
        bLiveBottomButton.category = this.category;
        bLiveBottomButton.url = this.url;
        List<Integer> list = this.bubbleIds;
        if (list != null) {
            bLiveBottomButton.bubbleIds = ValueObject.util_map(list, new w9j() { // from class: l.rr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveBottomButton.m67699a((Integer) obj);
                }
            });
        }
        bLiveBottomButton.enableRedDot = this.enableRedDot;
        List<String> list2 = this.icon;
        if (list2 != null) {
            bLiveBottomButton.icon = ValueObject.util_map(list2, new w9j() { // from class: l.sr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveBottomButton.m67701c((String) obj);
                }
            });
        }
        bLiveBottomButton.fillUp = this.fillUp;
        bLiveBottomButton.type = this.type;
        bLiveBottomButton.minAnchorHierarchy = this.minAnchorHierarchy;
        bLiveBottomButton.minAnchorHierarchyTip = this.minAnchorHierarchyTip;
        bLiveBottomButton.callback = this.callback;
        bLiveBottomButton.enableNewlyEffect = this.enableNewlyEffect;
        List<String> list3 = this.labels;
        if (list3 != null) {
            bLiveBottomButton.labels = ValueObject.util_map(list3, new w9j() { // from class: l.tr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveBottomButton.m67700b((String) obj);
                }
            });
        }
        bLiveBottomButton.isClosed = this.isClosed;
        bLiveBottomButton.text = this.text;
        BLiveTicker bLiveTicker = this.ticker;
        if (bLiveTicker != null) {
            bLiveBottomButton.ticker = bLiveTicker.mo223809clone();
        }
        BLiveButtonAnimation bLiveButtonAnimation = this.animation;
        if (bLiveButtonAnimation != null) {
            bLiveBottomButton.animation = bLiveButtonAnimation.mo223809clone();
        }
        bLiveBottomButton.redDotCount = this.redDotCount;
        bLiveBottomButton.alignment = this.alignment;
        return bLiveBottomButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBottomButton)) {
            return false;
        }
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) obj;
        return this.f44339id == bLiveBottomButton.f44339id && ValueObject.util_equals(this.name, bLiveBottomButton.name) && ValueObject.util_equals(this.jumpType, bLiveBottomButton.jumpType) && this.category == bLiveBottomButton.category && ValueObject.util_equals(this.url, bLiveBottomButton.url) && ValueObject.util_equals(this.bubbleIds, bLiveBottomButton.bubbleIds) && this.enableRedDot == bLiveBottomButton.enableRedDot && ValueObject.util_equals(this.icon, bLiveBottomButton.icon) && this.fillUp == bLiveBottomButton.fillUp && ValueObject.util_equals(this.type, bLiveBottomButton.type) && this.minAnchorHierarchy == bLiveBottomButton.minAnchorHierarchy && ValueObject.util_equals(this.minAnchorHierarchyTip, bLiveBottomButton.minAnchorHierarchyTip) && this.callback == bLiveBottomButton.callback && this.enableNewlyEffect == bLiveBottomButton.enableNewlyEffect && ValueObject.util_equals(this.labels, bLiveBottomButton.labels) && this.isClosed == bLiveBottomButton.isClosed && ValueObject.util_equals(this.text, bLiveBottomButton.text) && ValueObject.util_equals(this.ticker, bLiveBottomButton.ticker) && ValueObject.util_equals(this.animation, bLiveBottomButton.animation) && this.redDotCount == bLiveBottomButton.redDotCount && this.alignment == bLiveBottomButton.alignment;
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
        int i2 = ((i * 41) + this.f44339id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.jumpType;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.category) * 41;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<Integer> list = this.bubbleIds;
        int iHashCode4 = (((iHashCode3 + (list != null ? list.hashCode() : 0)) * 41) + (this.enableRedDot ? 1231 : 1237)) * 41;
        List<String> list2 = this.icon;
        int iHashCode5 = (((iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.fillUp ? 1231 : 1237)) * 41;
        String str4 = this.type;
        int iHashCode6 = (((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.minAnchorHierarchy) * 41;
        String str5 = this.minAnchorHierarchyTip;
        int iHashCode7 = (((((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.callback ? 1231 : 1237)) * 41) + (this.enableNewlyEffect ? 1231 : 1237)) * 41;
        List<String> list3 = this.labels;
        int iHashCode8 = (((iHashCode7 + (list3 != null ? list3.hashCode() : 0)) * 41) + (this.isClosed ? 1231 : 1237)) * 41;
        String str6 = this.text;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLiveTicker bLiveTicker = this.ticker;
        int iHashCode10 = (iHashCode9 + (bLiveTicker != null ? bLiveTicker.hashCode() : 0)) * 41;
        BLiveButtonAnimation bLiveButtonAnimation = this.animation;
        int iHashCode11 = ((((iHashCode10 + (bLiveButtonAnimation != null ? bLiveButtonAnimation.hashCode() : 0)) * 41) + this.redDotCount) * 41) + this.alignment;
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    public boolean isGame() {
        return this.category == 2;
    }

    public boolean isGiftSwitch() {
        return this.f44339id == 118;
    }

    public boolean isMsgRemind() {
        return this.f44339id == 141;
    }

    public boolean isSetting() {
        return this.category == 3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.jumpType == null) {
            this.jumpType = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.bubbleIds == null) {
            this.bubbleIds = new ArrayList();
        }
        if (this.icon == null) {
            this.icon = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.minAnchorHierarchyTip == null) {
            this.minAnchorHierarchyTip = "";
        }
        if (this.labels == null) {
            this.labels = new ArrayList();
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.ticker == null) {
            this.ticker = BLiveTicker.new_();
        }
        if (this.animation == null) {
            this.animation = BLiveButtonAnimation.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
