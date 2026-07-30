package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveDiscountItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItemShort;
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
public class BLiveGiftItemShort extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftItemShort> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftItemShort>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftItemShort.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftItemShort.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftItemShort newInstance() {
            return new BLiveGiftItemShort();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveGiftItemShort bLiveGiftItemShort, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1930519286:
                    if (str.equals("endRightTagColor")) {
                        b = 0;
                    }
                    break;
                case -1768383972:
                    if (str.equals("slotGiftInfo")) {
                        b = 1;
                    }
                    break;
                case -1657916319:
                    if (str.equals("interactRules")) {
                        b = 2;
                    }
                    break;
                case -1651329118:
                    if (str.equals("flyMicInfo")) {
                        b = 3;
                    }
                    break;
                case -1436090402:
                    if (str.equals("rightTag")) {
                        b = 4;
                    }
                    break;
                case -1110417409:
                    if (str.equals("labels")) {
                        b = 5;
                    }
                    break;
                case -934624660:
                    if (str.equals("remain")) {
                        b = 6;
                    }
                    break;
                case -748363171:
                    if (str.equals("nameStatus")) {
                        b = 7;
                    }
                    break;
                case -717878296:
                    if (str.equals("showOutside")) {
                        b = 8;
                    }
                    break;
                case -662710677:
                    if (str.equals("startTagColor")) {
                        b = 9;
                    }
                    break;
                case -540719112:
                    if (str.equals("rightTagTextColor")) {
                        b = 10;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 11;
                    }
                    break;
                case -191636422:
                    if (str.equals("fastGiftNum")) {
                        b = 12;
                    }
                    break;
                case -162794529:
                    if (str.equals("expiredTimeText")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -121228462:
                    if (str.equals("discounts")) {
                        b = 14;
                    }
                    break;
                case -92515438:
                    if (str.equals("expiredTime")) {
                        b = 15;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 114586:
                    if (str.equals("tag")) {
                        b = 17;
                    }
                    break;
                case 99110611:
                    if (str.equals("hdUrl")) {
                        b = 18;
                    }
                    break;
                case 161356139:
                    if (str.equals("giftSource")) {
                        b = 19;
                    }
                    break;
                case 171594184:
                    if (str.equals("interactStatus")) {
                        b = 20;
                    }
                    break;
                case 463375081:
                    if (str.equals("showAnimRules")) {
                        b = 21;
                    }
                    break;
                case 925118262:
                    if (str.equals("nextValidTime")) {
                        b = 22;
                    }
                    break;
                case 1420994665:
                    if (str.equals("localRightTag")) {
                        b = 23;
                    }
                    break;
                case 1718785251:
                    if (str.equals("startRightTagColor")) {
                        b = 24;
                    }
                    break;
                case 1967854052:
                    if (str.equals("endTagColor")) {
                        b = 25;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveGiftItemShort.endRightTagColor = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveGiftItemShort.slotGiftInfo = BLiveSlotGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveGiftItemShort.interactRules = BLiveGiftInteractRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveGiftItemShort.flyMicInfo = BLiveIntlFlyMicEffectConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveGiftItemShort.rightTag = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveGiftItemShort.labels = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveGiftItemShort.remain = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    bLiveGiftItemShort.nameStatus = BLiveGiftNameStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveGiftItemShort.showOutside = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    bLiveGiftItemShort.startTagColor = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveGiftItemShort.rightTagTextColor = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveGiftItemShort.createdTime = jsonParser.getValueAsLong();
                    return true;
                case 12:
                    bLiveGiftItemShort.fastGiftNum = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    bLiveGiftItemShort.expiredTimeText = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveGiftItemShort.discounts = JsonAdapter.parseArray(jsonParser, BLiveDiscountItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveGiftItemShort.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case 16:
                    bLiveGiftItemShort.f44378id = jsonParser.getValueAsInt();
                    return false;
                case 17:
                    bLiveGiftItemShort.tag = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveGiftItemShort.hdUrl = jsonParser.getValueAsString();
                    return true;
                case 19:
                    bLiveGiftItemShort.giftSource = jsonParser.getValueAsInt();
                    return true;
                case 20:
                    bLiveGiftItemShort.interactStatus = jsonParser.getValueAsString();
                    return true;
                case 21:
                    bLiveGiftItemShort.showAnimRules = BLiveGiftShowRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveGiftItemShort.nextValidTime = jsonParser.getValueAsLong();
                    return true;
                case 23:
                    bLiveGiftItemShort.localRightTag = LangModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    bLiveGiftItemShort.startRightTagColor = jsonParser.getValueAsString();
                    return true;
                case 25:
                    bLiveGiftItemShort.endTagColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftItemShort bLiveGiftItemShort, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveGiftItemShort.f44378id);
            jsonGenerator.writeNumberField("fastGiftNum", bLiveGiftItemShort.fastGiftNum);
            jsonGenerator.writeNumberField("giftSource", bLiveGiftItemShort.giftSource);
            jsonGenerator.writeNumberField("remain", bLiveGiftItemShort.remain);
            jsonGenerator.writeNumberField("expiredTime", bLiveGiftItemShort.expiredTime);
            jsonGenerator.writeNumberField("nextValidTime", bLiveGiftItemShort.nextValidTime);
            jsonGenerator.writeBooleanField("showOutside", bLiveGiftItemShort.showOutside);
            jsonGenerator.writeNumberField("createdTime", bLiveGiftItemShort.createdTime);
            String str = bLiveGiftItemShort.interactStatus;
            if (str != null) {
                jsonGenerator.writeStringField("interactStatus", str);
            }
            if (bLiveGiftItemShort.interactRules != null) {
                jsonGenerator.writeFieldName("interactRules");
                BLiveGiftInteractRules.JSON_ADAPTER.serialize(bLiveGiftItemShort.interactRules, jsonGenerator, true);
            }
            String str2 = bLiveGiftItemShort.expiredTimeText;
            if (str2 != null) {
                jsonGenerator.writeStringField("expiredTimeText", str2);
            }
            if (bLiveGiftItemShort.labels != null) {
                jsonGenerator.writeFieldName("labels");
                JsonAdapter.serializeArray(bLiveGiftItemShort.labels, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveGiftItemShort.showAnimRules != null) {
                jsonGenerator.writeFieldName("showAnimRules");
                BLiveGiftShowRules.JSON_ADAPTER.serialize(bLiveGiftItemShort.showAnimRules, jsonGenerator, true);
            }
            if (bLiveGiftItemShort.slotGiftInfo != null) {
                jsonGenerator.writeFieldName("slotGiftInfo");
                BLiveSlotGiftInfo.JSON_ADAPTER.serialize(bLiveGiftItemShort.slotGiftInfo, jsonGenerator, true);
            }
            String str3 = bLiveGiftItemShort.hdUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("hdUrl", str3);
            }
            if (bLiveGiftItemShort.discounts != null) {
                jsonGenerator.writeFieldName("discounts");
                JsonAdapter.serializeArray(bLiveGiftItemShort.discounts, jsonGenerator, BLiveDiscountItem.JSON_ADAPTER);
            }
            String str4 = bLiveGiftItemShort.tag;
            if (str4 != null) {
                jsonGenerator.writeStringField("tag", str4);
            }
            String str5 = bLiveGiftItemShort.startTagColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("startTagColor", str5);
            }
            String str6 = bLiveGiftItemShort.endTagColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("endTagColor", str6);
            }
            if (bLiveGiftItemShort.nameStatus != null) {
                jsonGenerator.writeFieldName("nameStatus");
                BLiveGiftNameStatus.JSON_ADAPTER.serialize(bLiveGiftItemShort.nameStatus, jsonGenerator, true);
            }
            String str7 = bLiveGiftItemShort.rightTag;
            if (str7 != null) {
                jsonGenerator.writeStringField("rightTag", str7);
            }
            if (bLiveGiftItemShort.localRightTag != null) {
                jsonGenerator.writeFieldName("localRightTag");
                LangModel.JSON_ADAPTER.serialize(bLiveGiftItemShort.localRightTag, jsonGenerator, true);
            }
            String str8 = bLiveGiftItemShort.startRightTagColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("startRightTagColor", str8);
            }
            String str9 = bLiveGiftItemShort.endRightTagColor;
            if (str9 != null) {
                jsonGenerator.writeStringField("endRightTagColor", str9);
            }
            String str10 = bLiveGiftItemShort.rightTagTextColor;
            if (str10 != null) {
                jsonGenerator.writeStringField("rightTagTextColor", str10);
            }
            if (bLiveGiftItemShort.flyMicInfo != null) {
                jsonGenerator.writeFieldName("flyMicInfo");
                BLiveIntlFlyMicEffectConfig.JSON_ADAPTER.serialize(bLiveGiftItemShort.flyMicInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftItemShort) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftitemshort";

    @ProtobufIndex(index = 8)
    public long createdTime;

    @NonNull
    @ProtobufIndex(index = 16)
    public List<BLiveDiscountItem> discounts;

    @NonNull
    @ProtobufIndex(index = 24)
    public String endRightTagColor;

    @NonNull
    @ProtobufIndex(index = 19)
    public String endTagColor;

    @ProtobufIndex(index = 5)
    public long expiredTime;

    @NonNull
    @ProtobufIndex(index = 11)
    public String expiredTimeText;

    @ProtobufIndex(index = 2)
    public int fastGiftNum;

    @NonNull
    @ProtobufIndex(index = 26)
    public BLiveIntlFlyMicEffectConfig flyMicInfo;

    @ProtobufIndex(index = 3)
    public int giftSource;

    @NonNull
    @ProtobufIndex(index = 15)
    public String hdUrl;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44378id;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveGiftInteractRules interactRules;

    @NonNull
    @ProtobufIndex(index = 9)
    public String interactStatus;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<String> labels;

    @NonNull
    @ProtobufIndex(index = 22)
    public LangModel localRightTag;

    @Nullable
    @ProtobufIndex(index = 20)
    public BLiveGiftNameStatus nameStatus;

    @ProtobufIndex(index = 6)
    public long nextValidTime;

    @ProtobufIndex(index = 4)
    public int remain;

    @NonNull
    @ProtobufIndex(index = 21)
    public String rightTag;

    @NonNull
    @ProtobufIndex(index = 25)
    public String rightTagTextColor;

    @NonNull
    @ProtobufIndex(index = 13)
    public BLiveGiftShowRules showAnimRules;

    @ProtobufIndex(index = 7)
    public boolean showOutside;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveSlotGiftInfo slotGiftInfo;

    @NonNull
    @ProtobufIndex(index = 23)
    public String startRightTagColor;

    @NonNull
    @ProtobufIndex(index = 18)
    public String startTagColor;

    @NonNull
    @ProtobufIndex(index = 17)
    public String tag;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67988a(String str) {
        return str;
    }

    public static BLiveGiftItemShort new_() {
        BLiveGiftItemShort bLiveGiftItemShort = new BLiveGiftItemShort();
        bLiveGiftItemShort.nullCheck();
        return bLiveGiftItemShort;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftItemShort mo223809clone() {
        BLiveGiftItemShort bLiveGiftItemShort = new BLiveGiftItemShort();
        bLiveGiftItemShort.f44378id = this.f44378id;
        bLiveGiftItemShort.fastGiftNum = this.fastGiftNum;
        bLiveGiftItemShort.giftSource = this.giftSource;
        bLiveGiftItemShort.remain = this.remain;
        bLiveGiftItemShort.expiredTime = this.expiredTime;
        bLiveGiftItemShort.nextValidTime = this.nextValidTime;
        bLiveGiftItemShort.showOutside = this.showOutside;
        bLiveGiftItemShort.createdTime = this.createdTime;
        bLiveGiftItemShort.interactStatus = this.interactStatus;
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        if (bLiveGiftInteractRules != null) {
            bLiveGiftItemShort.interactRules = bLiveGiftInteractRules.mo223809clone();
        }
        bLiveGiftItemShort.expiredTimeText = this.expiredTimeText;
        List<String> list = this.labels;
        if (list != null) {
            bLiveGiftItemShort.labels = ValueObject.util_map(list, new w9j() { // from class: l.p02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveGiftItemShort.m67988a((String) obj);
                }
            });
        }
        BLiveGiftShowRules bLiveGiftShowRules = this.showAnimRules;
        if (bLiveGiftShowRules != null) {
            bLiveGiftItemShort.showAnimRules = bLiveGiftShowRules.mo223809clone();
        }
        BLiveSlotGiftInfo bLiveSlotGiftInfo = this.slotGiftInfo;
        if (bLiveSlotGiftInfo != null) {
            bLiveGiftItemShort.slotGiftInfo = bLiveSlotGiftInfo.mo223809clone();
        }
        bLiveGiftItemShort.hdUrl = this.hdUrl;
        List<BLiveDiscountItem> list2 = this.discounts;
        if (list2 != null) {
            bLiveGiftItemShort.discounts = ValueObject.util_map(list2, new w9j() { // from class: l.q02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveDiscountItem) obj).mo223809clone();
                }
            });
        }
        bLiveGiftItemShort.tag = this.tag;
        bLiveGiftItemShort.startTagColor = this.startTagColor;
        bLiveGiftItemShort.endTagColor = this.endTagColor;
        BLiveGiftNameStatus bLiveGiftNameStatus = this.nameStatus;
        if (bLiveGiftNameStatus != null) {
            bLiveGiftItemShort.nameStatus = bLiveGiftNameStatus.mo223809clone();
        }
        bLiveGiftItemShort.rightTag = this.rightTag;
        LangModel langModel = this.localRightTag;
        if (langModel != null) {
            bLiveGiftItemShort.localRightTag = langModel.mo223809clone();
        }
        bLiveGiftItemShort.startRightTagColor = this.startRightTagColor;
        bLiveGiftItemShort.endRightTagColor = this.endRightTagColor;
        bLiveGiftItemShort.rightTagTextColor = this.rightTagTextColor;
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = this.flyMicInfo;
        if (bLiveIntlFlyMicEffectConfig != null) {
            bLiveGiftItemShort.flyMicInfo = bLiveIntlFlyMicEffectConfig.mo223809clone();
        }
        return bLiveGiftItemShort;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftItemShort)) {
            return false;
        }
        BLiveGiftItemShort bLiveGiftItemShort = (BLiveGiftItemShort) obj;
        return this.f44378id == bLiveGiftItemShort.f44378id && this.fastGiftNum == bLiveGiftItemShort.fastGiftNum && this.giftSource == bLiveGiftItemShort.giftSource && this.remain == bLiveGiftItemShort.remain && this.expiredTime == bLiveGiftItemShort.expiredTime && this.nextValidTime == bLiveGiftItemShort.nextValidTime && this.showOutside == bLiveGiftItemShort.showOutside && this.createdTime == bLiveGiftItemShort.createdTime && ValueObject.util_equals(this.interactStatus, bLiveGiftItemShort.interactStatus) && ValueObject.util_equals(this.interactRules, bLiveGiftItemShort.interactRules) && ValueObject.util_equals(this.expiredTimeText, bLiveGiftItemShort.expiredTimeText) && ValueObject.util_equals(this.labels, bLiveGiftItemShort.labels) && ValueObject.util_equals(this.showAnimRules, bLiveGiftItemShort.showAnimRules) && ValueObject.util_equals(this.slotGiftInfo, bLiveGiftItemShort.slotGiftInfo) && ValueObject.util_equals(this.hdUrl, bLiveGiftItemShort.hdUrl) && ValueObject.util_equals(this.discounts, bLiveGiftItemShort.discounts) && ValueObject.util_equals(this.tag, bLiveGiftItemShort.tag) && ValueObject.util_equals(this.startTagColor, bLiveGiftItemShort.startTagColor) && ValueObject.util_equals(this.endTagColor, bLiveGiftItemShort.endTagColor) && ValueObject.util_equals(this.nameStatus, bLiveGiftItemShort.nameStatus) && ValueObject.util_equals(this.rightTag, bLiveGiftItemShort.rightTag) && ValueObject.util_equals(this.localRightTag, bLiveGiftItemShort.localRightTag) && ValueObject.util_equals(this.startRightTagColor, bLiveGiftItemShort.startRightTagColor) && ValueObject.util_equals(this.endRightTagColor, bLiveGiftItemShort.endRightTagColor) && ValueObject.util_equals(this.rightTagTextColor, bLiveGiftItemShort.rightTagTextColor) && ValueObject.util_equals(this.flyMicInfo, bLiveGiftItemShort.flyMicInfo);
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
        int i2 = ((((((((i * 41) + this.f44378id) * 41) + this.fastGiftNum) * 41) + this.giftSource) * 41) + this.remain) * 41;
        long j = this.expiredTime;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.nextValidTime;
        int i4 = (((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + (this.showOutside ? 1231 : 1237)) * 41;
        long j3 = this.createdTime;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str = this.interactStatus;
        int iHashCode = (i5 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        int iHashCode2 = (iHashCode + (bLiveGiftInteractRules != null ? bLiveGiftInteractRules.hashCode() : 0)) * 41;
        String str2 = this.expiredTimeText;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.labels;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveGiftShowRules bLiveGiftShowRules = this.showAnimRules;
        int iHashCode5 = (iHashCode4 + (bLiveGiftShowRules != null ? bLiveGiftShowRules.hashCode() : 0)) * 41;
        BLiveSlotGiftInfo bLiveSlotGiftInfo = this.slotGiftInfo;
        int iHashCode6 = (iHashCode5 + (bLiveSlotGiftInfo != null ? bLiveSlotGiftInfo.hashCode() : 0)) * 41;
        String str3 = this.hdUrl;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveDiscountItem> list2 = this.discounts;
        int iHashCode8 = (iHashCode7 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str4 = this.tag;
        int iHashCode9 = (iHashCode8 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.startTagColor;
        int iHashCode10 = (iHashCode9 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.endTagColor;
        int iHashCode11 = (iHashCode10 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLiveGiftNameStatus bLiveGiftNameStatus = this.nameStatus;
        int iHashCode12 = (iHashCode11 + (bLiveGiftNameStatus != null ? bLiveGiftNameStatus.hashCode() : 0)) * 41;
        String str7 = this.rightTag;
        int iHashCode13 = (iHashCode12 + (str7 != null ? str7.hashCode() : 0)) * 41;
        LangModel langModel = this.localRightTag;
        int iHashCode14 = (iHashCode13 + (langModel != null ? langModel.hashCode() : 0)) * 41;
        String str8 = this.startRightTagColor;
        int iHashCode15 = (iHashCode14 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.endRightTagColor;
        int iHashCode16 = (iHashCode15 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.rightTagTextColor;
        int iHashCode17 = (iHashCode16 + (str10 != null ? str10.hashCode() : 0)) * 41;
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = this.flyMicInfo;
        int iHashCode18 = iHashCode17 + (bLiveIntlFlyMicEffectConfig != null ? bLiveIntlFlyMicEffectConfig.hashCode() : 0);
        this.hashCode = iHashCode18;
        return iHashCode18;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.interactStatus == null) {
            this.interactStatus = "";
        }
        if (this.interactRules == null) {
            this.interactRules = BLiveGiftInteractRules.new_();
        }
        if (this.expiredTimeText == null) {
            this.expiredTimeText = "";
        }
        if (this.labels == null) {
            this.labels = new ArrayList();
        }
        if (this.showAnimRules == null) {
            this.showAnimRules = BLiveGiftShowRules.new_();
        }
        if (this.slotGiftInfo == null) {
            this.slotGiftInfo = BLiveSlotGiftInfo.new_();
        }
        if (this.hdUrl == null) {
            this.hdUrl = "";
        }
        if (this.discounts == null) {
            this.discounts = new ArrayList();
        }
        if (this.tag == null) {
            this.tag = "";
        }
        if (this.startTagColor == null) {
            this.startTagColor = "";
        }
        if (this.endTagColor == null) {
            this.endTagColor = "";
        }
        if (this.rightTag == null) {
            this.rightTag = "";
        }
        if (this.localRightTag == null) {
            this.localRightTag = LangModel.new_();
        }
        if (this.startRightTagColor == null) {
            this.startRightTagColor = "";
        }
        if (this.endRightTagColor == null) {
            this.endRightTagColor = "";
        }
        if (this.rightTagTextColor == null) {
            this.rightTagTextColor = "";
        }
        if (this.flyMicInfo == null) {
            this.flyMicInfo = BLiveIntlFlyMicEffectConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
