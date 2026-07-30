package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveDiscountItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveLuckyGiftInfo;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.dfe0;
import p149l.u6n;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftItem newInstance() {
            return new BLiveGiftItem();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveGiftItem bLiveGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        b = 0;
                    }
                    break;
                case -1930519286:
                    if (str.equals("endRightTagColor")) {
                        b = 1;
                    }
                    break;
                case -1912055851:
                    if (str.equals("liveResourceId")) {
                        b = 2;
                    }
                    break;
                case -1768383972:
                    if (str.equals("slotGiftInfo")) {
                        b = 3;
                    }
                    break;
                case -1657916319:
                    if (str.equals("interactRules")) {
                        b = 4;
                    }
                    break;
                case -1651329118:
                    if (str.equals("flyMicInfo")) {
                        b = 5;
                    }
                    break;
                case -1541721002:
                    if (str.equals("minWealthHierarchy")) {
                        b = 6;
                    }
                    break;
                case -1436090402:
                    if (str.equals("rightTag")) {
                        b = 7;
                    }
                    break;
                case -1337740088:
                    if (str.equals("purchasePrice")) {
                        b = 8;
                    }
                    break;
                case -1205395306:
                    if (str.equals("localName")) {
                        b = 9;
                    }
                    break;
                case -1110417409:
                    if (str.equals("labels")) {
                        b = 10;
                    }
                    break;
                case -934624660:
                    if (str.equals("remain")) {
                        b = 11;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 12;
                    }
                    break;
                case -748363171:
                    if (str.equals("nameStatus")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -717878296:
                    if (str.equals("showOutside")) {
                        b = 14;
                    }
                    break;
                case -662710677:
                    if (str.equals("startTagColor")) {
                        b = 15;
                    }
                    break;
                case -540719112:
                    if (str.equals("rightTagTextColor")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 17;
                    }
                    break;
                case -486196699:
                    if (str.equals("unitPrice")) {
                        b = 18;
                    }
                    break;
                case -289038363:
                    if (str.equals("longPressGotoUrl")) {
                        b = 19;
                    }
                    break;
                case -285437776:
                    if (str.equals("dynamicUrl")) {
                        b = 20;
                    }
                    break;
                case -191636422:
                    if (str.equals("fastGiftNum")) {
                        b = 21;
                    }
                    break;
                case -162794529:
                    if (str.equals("expiredTimeText")) {
                        b = 22;
                    }
                    break;
                case -121228462:
                    if (str.equals("discounts")) {
                        b = 23;
                    }
                    break;
                case -92515438:
                    if (str.equals("expiredTime")) {
                        b = 24;
                    }
                    break;
                case -83311924:
                    if (str.equals("generationDuration")) {
                        b = 25;
                    }
                    break;
                case -73298198:
                    if (str.equals("trayDuration")) {
                        b = 26;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 27;
                    }
                    break;
                case 114586:
                    if (str.equals("tag")) {
                        b = 28;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 29;
                    }
                    break;
                case 3168655:
                    if (str.equals("gear")) {
                        b = 30;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 31;
                    }
                    break;
                case 99110611:
                    if (str.equals("hdUrl")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 161356139:
                    if (str.equals("giftSource")) {
                        b = 33;
                    }
                    break;
                case 171594184:
                    if (str.equals("interactStatus")) {
                        b = 34;
                    }
                    break;
                case 239066879:
                    if (str.equals("longPressGotoLocation")) {
                        b = 35;
                    }
                    break;
                case 283384561:
                    if (str.equals("longPressGotoHeight")) {
                        b = 36;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 37;
                    }
                    break;
                case 463375081:
                    if (str.equals("showAnimRules")) {
                        b = 38;
                    }
                    break;
                case 494484825:
                    if (str.equals("combosDuration")) {
                        b = 39;
                    }
                    break;
                case 552632372:
                    if (str.equals("giftLevel")) {
                        b = 40;
                    }
                    break;
                case 839769383:
                    if (str.equals("hidePrice")) {
                        b = 41;
                    }
                    break;
                case 849368202:
                    if (str.equals("giftType")) {
                        b = 42;
                    }
                    break;
                case 925118262:
                    if (str.equals("nextValidTime")) {
                        b = 43;
                    }
                    break;
                case 955929685:
                    if (str.equals("diamondPrice")) {
                        b = 44;
                    }
                    break;
                case 1268914192:
                    if (str.equals("mobileVibration")) {
                        b = 45;
                    }
                    break;
                case 1332961877:
                    if (str.equals("videoType")) {
                        b = 46;
                    }
                    break;
                case 1408582332:
                    if (str.equals("longPressGotoWidth")) {
                        b = 47;
                    }
                    break;
                case 1420994665:
                    if (str.equals("localRightTag")) {
                        b = 48;
                    }
                    break;
                case 1718785251:
                    if (str.equals("startRightTagColor")) {
                        b = 49;
                    }
                    break;
                case 1757445052:
                    if (str.equals("tagTextColor")) {
                        b = 50;
                    }
                    break;
                case 1856186187:
                    if (str.equals("luckyPrizeGiftInfos")) {
                        b = 51;
                    }
                    break;
                case 1900784687:
                    if (str.equals("localTag")) {
                        b = 52;
                    }
                    break;
                case 1967854052:
                    if (str.equals("endTagColor")) {
                        b = 53;
                    }
                    break;
                case 2031205598:
                    if (str.equals("animationType")) {
                        b = 54;
                    }
                    break;
                case 2052483316:
                    if (str.equals("longPressText")) {
                        b = 55;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveGiftItem.subtitle = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveGiftItem.endRightTagColor = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveGiftItem.liveResourceId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveGiftItem.slotGiftInfo = BLiveSlotGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveGiftItem.interactRules = BLiveGiftInteractRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveGiftItem.flyMicInfo = BLiveIntlFlyMicEffectConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveGiftItem.minWealthHierarchy = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    bLiveGiftItem.rightTag = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveGiftItem.purchasePrice = jsonParser.getValueAsLong();
                    return true;
                case 9:
                    bLiveGiftItem.localName = LangModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveGiftItem.labels = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveGiftItem.remain = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    bLiveGiftItem.status = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveGiftItem.nameStatus = BLiveGiftNameStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveGiftItem.showOutside = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    bLiveGiftItem.startTagColor = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveGiftItem.rightTagTextColor = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveGiftItem.createdTime = jsonParser.getValueAsLong();
                    return true;
                case 18:
                    bLiveGiftItem.unitPrice = jsonParser.getValueAsDouble();
                    return true;
                case 19:
                    bLiveGiftItem.longPressGotoUrl = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveGiftItem.dynamicUrl = jsonParser.getValueAsString();
                    return true;
                case 21:
                    bLiveGiftItem.fastGiftNum = jsonParser.getValueAsInt();
                    return true;
                case 22:
                    bLiveGiftItem.expiredTimeText = jsonParser.getValueAsString();
                    return true;
                case 23:
                    bLiveGiftItem.discounts = JsonAdapter.parseArray(jsonParser, BLiveDiscountItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    bLiveGiftItem.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case 25:
                    bLiveGiftItem.generationDuration = jsonParser.getValueAsLong();
                    return true;
                case 26:
                    bLiveGiftItem.trayDuration = jsonParser.getValueAsLong();
                    return true;
                case 27:
                    bLiveGiftItem.f44377id = jsonParser.getValueAsInt();
                    return false;
                case 28:
                    bLiveGiftItem.tag = jsonParser.getValueAsString();
                    return true;
                case 29:
                    bLiveGiftItem.url = jsonParser.getValueAsString();
                    return true;
                case 30:
                    bLiveGiftItem.gear = BLiveGiftGearInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 31:
                    bLiveGiftItem.name = jsonParser.getValueAsString();
                    return true;
                case 32:
                    bLiveGiftItem.hdUrl = jsonParser.getValueAsString();
                    return true;
                case 33:
                    bLiveGiftItem.giftSource = jsonParser.getValueAsInt();
                    return true;
                case 34:
                    bLiveGiftItem.interactStatus = jsonParser.getValueAsString();
                    return true;
                case 35:
                    bLiveGiftItem.longPressGotoLocation = jsonParser.getValueAsInt();
                    return true;
                case 36:
                    bLiveGiftItem.longPressGotoHeight = jsonParser.getValueAsDouble();
                    return true;
                case 37:
                    bLiveGiftItem.version = jsonParser.getValueAsLong();
                    return true;
                case 38:
                    bLiveGiftItem.showAnimRules = BLiveGiftShowRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 39:
                    bLiveGiftItem.combosDuration = jsonParser.getValueAsLong();
                    return true;
                case 40:
                    bLiveGiftItem.giftLevel = jsonParser.getValueAsInt();
                    return true;
                case 41:
                    bLiveGiftItem.hidePrice = jsonParser.getValueAsBoolean();
                    return true;
                case 42:
                    bLiveGiftItem.giftType = jsonParser.getValueAsString();
                    return true;
                case 43:
                    bLiveGiftItem.nextValidTime = jsonParser.getValueAsLong();
                    return true;
                case 44:
                    bLiveGiftItem.diamondPrice = BLiveGiftDiamondPrice.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 45:
                    bLiveGiftItem.mobileVibration = jsonParser.getValueAsBoolean();
                    return true;
                case 46:
                    bLiveGiftItem.videoType = jsonParser.getValueAsInt();
                    return true;
                case 47:
                    bLiveGiftItem.longPressGotoWidth = jsonParser.getValueAsDouble();
                    return true;
                case 48:
                    bLiveGiftItem.localRightTag = LangModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 49:
                    bLiveGiftItem.startRightTagColor = jsonParser.getValueAsString();
                    return true;
                case 50:
                    bLiveGiftItem.tagTextColor = jsonParser.getValueAsString();
                    return true;
                case 51:
                    bLiveGiftItem.luckyPrizeGiftInfos = JsonAdapter.parseArray(jsonParser, BLiveLuckyGiftInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 52:
                    bLiveGiftItem.localTag = LangModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 53:
                    bLiveGiftItem.endTagColor = jsonParser.getValueAsString();
                    return true;
                case 54:
                    bLiveGiftItem.animationType = jsonParser.getValueAsString();
                    return true;
                case 55:
                    bLiveGiftItem.longPressText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftItem bLiveGiftItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveGiftItem.f44377id);
            String str = bLiveGiftItem.giftType;
            if (str != null) {
                jsonGenerator.writeStringField("giftType", str);
            }
            String str2 = bLiveGiftItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (bLiveGiftItem.localName != null) {
                jsonGenerator.writeFieldName("localName");
                LangModel.JSON_ADAPTER.serialize(bLiveGiftItem.localName, jsonGenerator, true);
            }
            String str3 = bLiveGiftItem.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeNumberField("unitPrice", bLiveGiftItem.unitPrice);
            jsonGenerator.writeNumberField("purchasePrice", bLiveGiftItem.purchasePrice);
            String str4 = bLiveGiftItem.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
            String str5 = bLiveGiftItem.tag;
            if (str5 != null) {
                jsonGenerator.writeStringField("tag", str5);
            }
            if (bLiveGiftItem.localTag != null) {
                jsonGenerator.writeFieldName("localTag");
                LangModel.JSON_ADAPTER.serialize(bLiveGiftItem.localTag, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("giftLevel", bLiveGiftItem.giftLevel);
            jsonGenerator.writeNumberField("combosDuration", bLiveGiftItem.combosDuration);
            jsonGenerator.writeNumberField("fastGiftNum", bLiveGiftItem.fastGiftNum);
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, bLiveGiftItem.version);
            String str6 = bLiveGiftItem.startTagColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("startTagColor", str6);
            }
            String str7 = bLiveGiftItem.endTagColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("endTagColor", str7);
            }
            String str8 = bLiveGiftItem.tagTextColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("tagTextColor", str8);
            }
            jsonGenerator.writeNumberField("trayDuration", bLiveGiftItem.trayDuration);
            jsonGenerator.writeNumberField("giftSource", bLiveGiftItem.giftSource);
            jsonGenerator.writeNumberField("remain", bLiveGiftItem.remain);
            jsonGenerator.writeNumberField("expiredTime", bLiveGiftItem.expiredTime);
            jsonGenerator.writeBooleanField("mobileVibration", bLiveGiftItem.mobileVibration);
            jsonGenerator.writeNumberField("nextValidTime", bLiveGiftItem.nextValidTime);
            jsonGenerator.writeBooleanField("showOutside", bLiveGiftItem.showOutside);
            jsonGenerator.writeNumberField("generationDuration", bLiveGiftItem.generationDuration);
            String str9 = bLiveGiftItem.longPressText;
            if (str9 != null) {
                jsonGenerator.writeStringField("longPressText", str9);
            }
            String str10 = bLiveGiftItem.longPressGotoUrl;
            if (str10 != null) {
                jsonGenerator.writeStringField("longPressGotoUrl", str10);
            }
            jsonGenerator.writeNumberField("minWealthHierarchy", bLiveGiftItem.minWealthHierarchy);
            if (bLiveGiftItem.luckyPrizeGiftInfos != null) {
                jsonGenerator.writeFieldName("luckyPrizeGiftInfos");
                JsonAdapter.serializeArray(bLiveGiftItem.luckyPrizeGiftInfos, jsonGenerator, BLiveLuckyGiftInfo.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("longPressGotoLocation", bLiveGiftItem.longPressGotoLocation);
            jsonGenerator.writeNumberField("longPressGotoHeight", bLiveGiftItem.longPressGotoHeight);
            jsonGenerator.writeNumberField("longPressGotoWidth", bLiveGiftItem.longPressGotoWidth);
            jsonGenerator.writeNumberField("createdTime", bLiveGiftItem.createdTime);
            String str11 = bLiveGiftItem.liveResourceId;
            if (str11 != null) {
                jsonGenerator.writeStringField("liveResourceId", str11);
            }
            String str12 = bLiveGiftItem.interactStatus;
            if (str12 != null) {
                jsonGenerator.writeStringField("interactStatus", str12);
            }
            if (bLiveGiftItem.interactRules != null) {
                jsonGenerator.writeFieldName("interactRules");
                BLiveGiftInteractRules.JSON_ADAPTER.serialize(bLiveGiftItem.interactRules, jsonGenerator, true);
            }
            String str13 = bLiveGiftItem.subtitle;
            if (str13 != null) {
                jsonGenerator.writeStringField("subtitle", str13);
            }
            String str14 = bLiveGiftItem.expiredTimeText;
            if (str14 != null) {
                jsonGenerator.writeStringField("expiredTimeText", str14);
            }
            String str15 = bLiveGiftItem.animationType;
            if (str15 != null) {
                jsonGenerator.writeStringField("animationType", str15);
            }
            if (bLiveGiftItem.labels != null) {
                jsonGenerator.writeFieldName("labels");
                JsonAdapter.serializeArray(bLiveGiftItem.labels, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveGiftItem.showAnimRules != null) {
                jsonGenerator.writeFieldName("showAnimRules");
                BLiveGiftShowRules.JSON_ADAPTER.serialize(bLiveGiftItem.showAnimRules, jsonGenerator, true);
            }
            if (bLiveGiftItem.slotGiftInfo != null) {
                jsonGenerator.writeFieldName("slotGiftInfo");
                BLiveSlotGiftInfo.JSON_ADAPTER.serialize(bLiveGiftItem.slotGiftInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("videoType", bLiveGiftItem.videoType);
            String str16 = bLiveGiftItem.hdUrl;
            if (str16 != null) {
                jsonGenerator.writeStringField("hdUrl", str16);
            }
            if (bLiveGiftItem.gear != null) {
                jsonGenerator.writeFieldName("gear");
                BLiveGiftGearInfo.JSON_ADAPTER.serialize(bLiveGiftItem.gear, jsonGenerator, true);
            }
            if (bLiveGiftItem.discounts != null) {
                jsonGenerator.writeFieldName("discounts");
                JsonAdapter.serializeArray(bLiveGiftItem.discounts, jsonGenerator, BLiveDiscountItem.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("hidePrice", bLiveGiftItem.hidePrice);
            if (bLiveGiftItem.nameStatus != null) {
                jsonGenerator.writeFieldName("nameStatus");
                BLiveGiftNameStatus.JSON_ADAPTER.serialize(bLiveGiftItem.nameStatus, jsonGenerator, true);
            }
            String str17 = bLiveGiftItem.dynamicUrl;
            if (str17 != null) {
                jsonGenerator.writeStringField("dynamicUrl", str17);
            }
            String str18 = bLiveGiftItem.rightTag;
            if (str18 != null) {
                jsonGenerator.writeStringField("rightTag", str18);
            }
            if (bLiveGiftItem.localRightTag != null) {
                jsonGenerator.writeFieldName("localRightTag");
                LangModel.JSON_ADAPTER.serialize(bLiveGiftItem.localRightTag, jsonGenerator, true);
            }
            String str19 = bLiveGiftItem.startRightTagColor;
            if (str19 != null) {
                jsonGenerator.writeStringField("startRightTagColor", str19);
            }
            String str20 = bLiveGiftItem.endRightTagColor;
            if (str20 != null) {
                jsonGenerator.writeStringField("endRightTagColor", str20);
            }
            String str21 = bLiveGiftItem.rightTagTextColor;
            if (str21 != null) {
                jsonGenerator.writeStringField("rightTagTextColor", str21);
            }
            if (bLiveGiftItem.diamondPrice != null) {
                jsonGenerator.writeFieldName("diamondPrice");
                BLiveGiftDiamondPrice.JSON_ADAPTER.serialize(bLiveGiftItem.diamondPrice, jsonGenerator, true);
            }
            if (bLiveGiftItem.flyMicInfo != null) {
                jsonGenerator.writeFieldName("flyMicInfo");
                BLiveIntlFlyMicEffectConfig.JSON_ADAPTER.serialize(bLiveGiftItem.flyMicInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftitem";
    public static final String TYPE_ROTATION = "rotation";

    @NonNull
    @ProtobufIndex(index = 39)
    public String animationType;

    @ProtobufIndex(index = 12)
    public long combosDuration;

    @ProtobufIndex(index = 33)
    public long createdTime;

    @NonNull
    @ProtobufIndex(index = 55)
    public BLiveGiftDiamondPrice diamondPrice;

    @NonNull
    @ProtobufIndex(index = 46)
    public List<BLiveDiscountItem> discounts;

    @NonNull
    @ProtobufIndex(index = 49)
    public String dynamicUrl;

    @NonNull
    @ProtobufIndex(index = 52)
    public String endRightTagColor;

    @NonNull
    @ProtobufIndex(index = 16)
    public String endTagColor;

    @ProtobufIndex(index = 21)
    public long expiredTime;

    @NonNull
    @ProtobufIndex(index = 38)
    public String expiredTimeText;

    @ProtobufIndex(index = 13)
    public int fastGiftNum;

    @NonNull
    @ProtobufIndex(index = 56)
    public BLiveIntlFlyMicEffectConfig flyMicInfo;

    @NonNull
    @ProtobufIndex(index = 45)
    public BLiveGiftGearInfo gear;

    @ProtobufIndex(index = 25)
    public long generationDuration;

    @ProtobufIndex(index = 11)
    public int giftLevel;

    @ProtobufIndex(index = 19)
    public int giftSource;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftType;

    @NonNull
    @ProtobufIndex(index = 44)
    public String hdUrl;

    @ProtobufIndex(index = 47)
    public boolean hidePrice;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44377id;

    @NonNull
    @ProtobufIndex(index = 36)
    public BLiveGiftInteractRules interactRules;

    @NonNull
    @ProtobufIndex(index = 35)
    public String interactStatus;

    @NonNull
    @ProtobufIndex(index = 40)
    public List<String> labels;

    @NonNull
    @ProtobufIndex(index = 34)
    public String liveResourceId;

    @NonNull
    @ProtobufIndex(index = 4)
    public LangModel localName;

    @NonNull
    @ProtobufIndex(index = 53)
    public LangModel localRightTag;
    public LangModel localSubtitle;

    @Nullable
    @ProtobufIndex(index = 10)
    public LangModel localTag;

    @ProtobufIndex(index = 31)
    public double longPressGotoHeight;

    @ProtobufIndex(index = 30)
    public int longPressGotoLocation;

    @NonNull
    @ProtobufIndex(index = 27)
    public String longPressGotoUrl;

    @ProtobufIndex(index = 32)
    public double longPressGotoWidth;

    @NonNull
    @ProtobufIndex(index = 26)
    public String longPressText;

    @NonNull
    @ProtobufIndex(index = 29)
    public List<BLiveLuckyGiftInfo> luckyPrizeGiftInfos;

    @ProtobufIndex(index = 28)
    public int minWealthHierarchy;

    @ProtobufIndex(index = 22)
    public boolean mobileVibration;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @Nullable
    @ProtobufIndex(index = 48)
    public BLiveGiftNameStatus nameStatus;
    public boolean needToPlayAnim = true;

    @ProtobufIndex(index = 23)
    public long nextValidTime;
    public int position;

    @ProtobufIndex(index = 7)
    public long purchasePrice;

    @ProtobufIndex(index = 20)
    public int remain;

    @NonNull
    @ProtobufIndex(index = 50)
    public String rightTag;

    @NonNull
    @ProtobufIndex(index = 54)
    public String rightTagTextColor;
    public dfe0 sendGiftExtraInfo;

    @NonNull
    @ProtobufIndex(index = 41)
    public BLiveGiftShowRules showAnimRules;

    @ProtobufIndex(index = 24)
    public boolean showOutside;

    @NonNull
    @ProtobufIndex(index = 42)
    public BLiveSlotGiftInfo slotGiftInfo;

    @NonNull
    @ProtobufIndex(index = 51)
    public String startRightTagColor;

    @NonNull
    @ProtobufIndex(index = 15)
    public String startTagColor;

    @NonNull
    @ProtobufIndex(index = 8)
    public String status;

    @NonNull
    @ProtobufIndex(index = 37)
    public String subtitle;

    @Nullable
    @ProtobufIndex(index = 9)
    public String tag;

    @NonNull
    @ProtobufIndex(index = 17)
    public String tagTextColor;
    public String title;

    @ProtobufIndex(index = 18)
    public long trayDuration;

    @ProtobufIndex(index = 6)
    public double unitPrice;

    @NonNull
    @ProtobufIndex(index = 5)
    public String url;

    @ProtobufIndex(index = 14)
    public long version;

    @ProtobufIndex(index = 43)
    public int videoType;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m67983b(String str) {
        return str;
    }

    public static BLiveGiftItem new_() {
        BLiveGiftItem bLiveGiftItem = new BLiveGiftItem();
        bLiveGiftItem.nullCheck();
        return bLiveGiftItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftItem mo223809clone() {
        BLiveGiftItem bLiveGiftItem = new BLiveGiftItem();
        bLiveGiftItem.f44377id = this.f44377id;
        bLiveGiftItem.giftType = this.giftType;
        bLiveGiftItem.name = this.name;
        LangModel langModel = this.localName;
        if (langModel != null) {
            bLiveGiftItem.localName = langModel.mo223809clone();
        }
        bLiveGiftItem.url = this.url;
        bLiveGiftItem.unitPrice = this.unitPrice;
        bLiveGiftItem.purchasePrice = this.purchasePrice;
        bLiveGiftItem.status = this.status;
        bLiveGiftItem.tag = this.tag;
        LangModel langModel2 = this.localTag;
        if (langModel2 != null) {
            bLiveGiftItem.localTag = langModel2.mo223809clone();
        }
        bLiveGiftItem.giftLevel = this.giftLevel;
        bLiveGiftItem.combosDuration = this.combosDuration;
        bLiveGiftItem.fastGiftNum = this.fastGiftNum;
        bLiveGiftItem.version = this.version;
        bLiveGiftItem.startTagColor = this.startTagColor;
        bLiveGiftItem.endTagColor = this.endTagColor;
        bLiveGiftItem.tagTextColor = this.tagTextColor;
        bLiveGiftItem.trayDuration = this.trayDuration;
        bLiveGiftItem.giftSource = this.giftSource;
        bLiveGiftItem.remain = this.remain;
        bLiveGiftItem.expiredTime = this.expiredTime;
        bLiveGiftItem.mobileVibration = this.mobileVibration;
        bLiveGiftItem.nextValidTime = this.nextValidTime;
        bLiveGiftItem.showOutside = this.showOutside;
        bLiveGiftItem.generationDuration = this.generationDuration;
        bLiveGiftItem.longPressText = this.longPressText;
        bLiveGiftItem.longPressGotoUrl = this.longPressGotoUrl;
        bLiveGiftItem.minWealthHierarchy = this.minWealthHierarchy;
        List<BLiveLuckyGiftInfo> list = this.luckyPrizeGiftInfos;
        if (list != null) {
            bLiveGiftItem.luckyPrizeGiftInfos = ValueObject.util_map(list, new w9j() { // from class: l.k02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveLuckyGiftInfo) obj).mo223809clone();
                }
            });
        }
        bLiveGiftItem.longPressGotoLocation = this.longPressGotoLocation;
        bLiveGiftItem.longPressGotoHeight = this.longPressGotoHeight;
        bLiveGiftItem.longPressGotoWidth = this.longPressGotoWidth;
        bLiveGiftItem.createdTime = this.createdTime;
        bLiveGiftItem.liveResourceId = this.liveResourceId;
        bLiveGiftItem.interactStatus = this.interactStatus;
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        if (bLiveGiftInteractRules != null) {
            bLiveGiftItem.interactRules = bLiveGiftInteractRules.mo223809clone();
        }
        bLiveGiftItem.subtitle = this.subtitle;
        bLiveGiftItem.expiredTimeText = this.expiredTimeText;
        bLiveGiftItem.animationType = this.animationType;
        List<String> list2 = this.labels;
        if (list2 != null) {
            bLiveGiftItem.labels = ValueObject.util_map(list2, new w9j() { // from class: l.l02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveGiftItem.m67983b((String) obj);
                }
            });
        }
        BLiveGiftShowRules bLiveGiftShowRules = this.showAnimRules;
        if (bLiveGiftShowRules != null) {
            bLiveGiftItem.showAnimRules = bLiveGiftShowRules.mo223809clone();
        }
        BLiveSlotGiftInfo bLiveSlotGiftInfo = this.slotGiftInfo;
        if (bLiveSlotGiftInfo != null) {
            bLiveGiftItem.slotGiftInfo = bLiveSlotGiftInfo.mo223809clone();
        }
        bLiveGiftItem.videoType = this.videoType;
        bLiveGiftItem.hdUrl = this.hdUrl;
        BLiveGiftGearInfo bLiveGiftGearInfo = this.gear;
        if (bLiveGiftGearInfo != null) {
            bLiveGiftItem.gear = bLiveGiftGearInfo.mo223809clone();
        }
        List<BLiveDiscountItem> list3 = this.discounts;
        if (list3 != null) {
            bLiveGiftItem.discounts = ValueObject.util_map(list3, new w9j() { // from class: l.m02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveDiscountItem) obj).mo223809clone();
                }
            });
        }
        bLiveGiftItem.hidePrice = this.hidePrice;
        BLiveGiftNameStatus bLiveGiftNameStatus = this.nameStatus;
        if (bLiveGiftNameStatus != null) {
            bLiveGiftItem.nameStatus = bLiveGiftNameStatus.mo223809clone();
        }
        bLiveGiftItem.dynamicUrl = this.dynamicUrl;
        bLiveGiftItem.rightTag = this.rightTag;
        LangModel langModel3 = this.localRightTag;
        if (langModel3 != null) {
            bLiveGiftItem.localRightTag = langModel3.mo223809clone();
        }
        bLiveGiftItem.startRightTagColor = this.startRightTagColor;
        bLiveGiftItem.endRightTagColor = this.endRightTagColor;
        bLiveGiftItem.rightTagTextColor = this.rightTagTextColor;
        BLiveGiftDiamondPrice bLiveGiftDiamondPrice = this.diamondPrice;
        if (bLiveGiftDiamondPrice != null) {
            bLiveGiftItem.diamondPrice = bLiveGiftDiamondPrice.mo223809clone();
        }
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = this.flyMicInfo;
        if (bLiveIntlFlyMicEffectConfig != null) {
            bLiveGiftItem.flyMicInfo = bLiveIntlFlyMicEffectConfig.mo223809clone();
        }
        return bLiveGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftItem)) {
            return false;
        }
        BLiveGiftItem bLiveGiftItem = (BLiveGiftItem) obj;
        return this.f44377id == bLiveGiftItem.f44377id && ValueObject.util_equals(this.giftType, bLiveGiftItem.giftType) && ValueObject.util_equals(this.name, bLiveGiftItem.name) && ValueObject.util_equals(this.localName, bLiveGiftItem.localName) && ValueObject.util_equals(this.url, bLiveGiftItem.url) && this.unitPrice == bLiveGiftItem.unitPrice && this.purchasePrice == bLiveGiftItem.purchasePrice && ValueObject.util_equals(this.status, bLiveGiftItem.status) && ValueObject.util_equals(this.tag, bLiveGiftItem.tag) && ValueObject.util_equals(this.localTag, bLiveGiftItem.localTag) && this.giftLevel == bLiveGiftItem.giftLevel && this.combosDuration == bLiveGiftItem.combosDuration && this.fastGiftNum == bLiveGiftItem.fastGiftNum && this.version == bLiveGiftItem.version && ValueObject.util_equals(this.startTagColor, bLiveGiftItem.startTagColor) && ValueObject.util_equals(this.endTagColor, bLiveGiftItem.endTagColor) && ValueObject.util_equals(this.tagTextColor, bLiveGiftItem.tagTextColor) && this.trayDuration == bLiveGiftItem.trayDuration && this.giftSource == bLiveGiftItem.giftSource && this.remain == bLiveGiftItem.remain && this.expiredTime == bLiveGiftItem.expiredTime && this.mobileVibration == bLiveGiftItem.mobileVibration && this.nextValidTime == bLiveGiftItem.nextValidTime && this.showOutside == bLiveGiftItem.showOutside && this.generationDuration == bLiveGiftItem.generationDuration && ValueObject.util_equals(this.longPressText, bLiveGiftItem.longPressText) && ValueObject.util_equals(this.longPressGotoUrl, bLiveGiftItem.longPressGotoUrl) && this.minWealthHierarchy == bLiveGiftItem.minWealthHierarchy && ValueObject.util_equals(this.luckyPrizeGiftInfos, bLiveGiftItem.luckyPrizeGiftInfos) && this.longPressGotoLocation == bLiveGiftItem.longPressGotoLocation && this.longPressGotoHeight == bLiveGiftItem.longPressGotoHeight && this.longPressGotoWidth == bLiveGiftItem.longPressGotoWidth && this.createdTime == bLiveGiftItem.createdTime && ValueObject.util_equals(this.liveResourceId, bLiveGiftItem.liveResourceId) && ValueObject.util_equals(this.interactStatus, bLiveGiftItem.interactStatus) && ValueObject.util_equals(this.interactRules, bLiveGiftItem.interactRules) && ValueObject.util_equals(this.subtitle, bLiveGiftItem.subtitle) && ValueObject.util_equals(this.expiredTimeText, bLiveGiftItem.expiredTimeText) && ValueObject.util_equals(this.animationType, bLiveGiftItem.animationType) && ValueObject.util_equals(this.labels, bLiveGiftItem.labels) && ValueObject.util_equals(this.showAnimRules, bLiveGiftItem.showAnimRules) && ValueObject.util_equals(this.slotGiftInfo, bLiveGiftItem.slotGiftInfo) && this.videoType == bLiveGiftItem.videoType && ValueObject.util_equals(this.hdUrl, bLiveGiftItem.hdUrl) && ValueObject.util_equals(this.gear, bLiveGiftItem.gear) && ValueObject.util_equals(this.discounts, bLiveGiftItem.discounts) && this.hidePrice == bLiveGiftItem.hidePrice && ValueObject.util_equals(this.nameStatus, bLiveGiftItem.nameStatus) && ValueObject.util_equals(this.dynamicUrl, bLiveGiftItem.dynamicUrl) && ValueObject.util_equals(this.rightTag, bLiveGiftItem.rightTag) && ValueObject.util_equals(this.localRightTag, bLiveGiftItem.localRightTag) && ValueObject.util_equals(this.startRightTagColor, bLiveGiftItem.startRightTagColor) && ValueObject.util_equals(this.endRightTagColor, bLiveGiftItem.endRightTagColor) && ValueObject.util_equals(this.rightTagTextColor, bLiveGiftItem.rightTagTextColor) && ValueObject.util_equals(this.diamondPrice, bLiveGiftItem.diamondPrice) && ValueObject.util_equals(this.flyMicInfo, bLiveGiftItem.flyMicInfo);
    }

    public String getActionNotice(boolean z) {
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        return (z ? bLiveGiftInteractRules.longPress : bLiveGiftInteractRules.click).notice;
    }

    public String getActionScheme(boolean z) {
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        return (z ? bLiveGiftInteractRules.longPress : bLiveGiftInteractRules.click).scheme;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getClickAction(boolean z) {
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        return (z ? bLiveGiftInteractRules.longPress : bLiveGiftInteractRules.click).action;
    }

    public long getCoinPrice() {
        if (vwb.m200296J(this.discounts)) {
            return this.purchasePrice;
        }
        ArrayList arrayListM200339n = vwb.m200339n(this.discounts, new w9j() { // from class: l.o02
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveDiscountItem) obj).remain > 0);
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return this.purchasePrice;
        }
        return (long) Math.ceil(this.purchasePrice * (((double) ((BLiveDiscountItem) arrayListM200339n.get(0)).discount) / 100.0d));
    }

    public long getDiamondPrice() {
        if (vwb.m200296J(this.discounts)) {
            return this.diamondPrice.purchasePrice;
        }
        ArrayList arrayListM200339n = vwb.m200339n(this.discounts, new w9j() { // from class: l.j02
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveDiscountItem) obj).remain > 0);
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return this.diamondPrice.purchasePrice;
        }
        return (long) Math.ceil(this.diamondPrice.purchasePrice * (((double) ((BLiveDiscountItem) arrayListM200339n.get(0)).discount) / 100.0d));
    }

    public List<String> getGearsEffectIds() {
        return isGearsGift() ? vwb.m200303Q(this.gear.gearEffects, new w9j() { // from class: l.n02
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveGiftGearEffectInfo) obj).liveResourceId;
            }
        }) : Collections.EMPTY_LIST;
    }

    public String getJumpGiftName() {
        if (isJumpGift()) {
            return TextUtils.isEmpty(this.title) ? getLocalName() : this.title;
        }
        return getLocalName();
    }

    public String getLocalName() {
        LangModel langModel = this.localName;
        return langModel != null ? langModel.getLocalName() : "";
    }

    public String getLocalRightTagName() {
        LangModel langModel = this.localRightTag;
        return langModel != null ? langModel.getLocalName() : "";
    }

    public String getLocalSubtitle() {
        LangModel langModel = this.localSubtitle;
        return langModel != null ? langModel.getLocalName() : "";
    }

    public String getLocalTagName() {
        LangModel langModel = this.localTag;
        return langModel != null ? langModel.getLocalName() : "";
    }

    public long getPrice() {
        return u6n.m192015a() ? getDiamondPrice() : getCoinPrice();
    }

    public boolean hasEffectRes() {
        return !TextUtils.isEmpty(this.liveResourceId);
    }

    public boolean hasRotationAnim() {
        return TextUtils.equals(this.showAnimRules.showAction.type, TYPE_ROTATION);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f44377id) * 41;
        String str = this.giftType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        LangModel langModel = this.localName;
        int iHashCode3 = (iHashCode2 + (langModel != null ? langModel.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.unitPrice);
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        long j = this.purchasePrice;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.status;
        int iHashCode5 = (i4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.tag;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        LangModel langModel2 = this.localTag;
        int iHashCode7 = (((iHashCode6 + (langModel2 != null ? langModel2.hashCode() : 0)) * 41) + this.giftLevel) * 41;
        long j2 = this.combosDuration;
        int i5 = (((iHashCode7 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.fastGiftNum) * 41;
        long j3 = this.version;
        int i6 = (i5 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str6 = this.startTagColor;
        int iHashCode8 = (i6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.endTagColor;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.tagTextColor;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        long j4 = this.trayDuration;
        int i7 = (((((iHashCode10 + ((int) (j4 ^ (j4 >>> 32)))) * 41) + this.giftSource) * 41) + this.remain) * 41;
        long j5 = this.expiredTime;
        int i8 = (i7 + ((int) (j5 ^ (j5 >>> 32)))) * 41;
        int i9 = this.mobileVibration ? 1231 : 1237;
        long j6 = this.nextValidTime;
        int i10 = (((i8 + i9) * 41) + ((int) (j6 ^ (j6 >>> 32)))) * 41;
        int i11 = this.showOutside ? 1231 : 1237;
        long j7 = this.generationDuration;
        int i12 = (((i10 + i11) * 41) + ((int) (j7 ^ (j7 >>> 32)))) * 41;
        String str9 = this.longPressText;
        int iHashCode11 = (i12 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.longPressGotoUrl;
        int iHashCode12 = (((iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 41) + this.minWealthHierarchy) * 41;
        List<BLiveLuckyGiftInfo> list = this.luckyPrizeGiftInfos;
        int iHashCode13 = ((iHashCode12 + (list != null ? list.hashCode() : 0)) * 41) + this.longPressGotoLocation;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longPressGotoHeight);
        int i13 = (iHashCode13 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.longPressGotoWidth);
        int i14 = ((i13 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        long j8 = this.createdTime;
        int i15 = (i14 + ((int) (j8 ^ (j8 >>> 32)))) * 41;
        String str11 = this.liveResourceId;
        int iHashCode14 = (i15 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.interactStatus;
        int iHashCode15 = (iHashCode14 + (str12 != null ? str12.hashCode() : 0)) * 41;
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        int iHashCode16 = (iHashCode15 + (bLiveGiftInteractRules != null ? bLiveGiftInteractRules.hashCode() : 0)) * 41;
        String str13 = this.subtitle;
        int iHashCode17 = (iHashCode16 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.expiredTimeText;
        int iHashCode18 = (iHashCode17 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.animationType;
        int iHashCode19 = (iHashCode18 + (str15 != null ? str15.hashCode() : 0)) * 41;
        List<String> list2 = this.labels;
        int iHashCode20 = (iHashCode19 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveGiftShowRules bLiveGiftShowRules = this.showAnimRules;
        int iHashCode21 = (iHashCode20 + (bLiveGiftShowRules != null ? bLiveGiftShowRules.hashCode() : 0)) * 41;
        BLiveSlotGiftInfo bLiveSlotGiftInfo = this.slotGiftInfo;
        int iHashCode22 = (((iHashCode21 + (bLiveSlotGiftInfo != null ? bLiveSlotGiftInfo.hashCode() : 0)) * 41) + this.videoType) * 41;
        String str16 = this.hdUrl;
        int iHashCode23 = (iHashCode22 + (str16 != null ? str16.hashCode() : 0)) * 41;
        BLiveGiftGearInfo bLiveGiftGearInfo = this.gear;
        int iHashCode24 = (iHashCode23 + (bLiveGiftGearInfo != null ? bLiveGiftGearInfo.hashCode() : 0)) * 41;
        List<BLiveDiscountItem> list3 = this.discounts;
        int iHashCode25 = (((iHashCode24 + (list3 != null ? list3.hashCode() : 0)) * 41) + (this.hidePrice ? 1231 : 1237)) * 41;
        BLiveGiftNameStatus bLiveGiftNameStatus = this.nameStatus;
        int iHashCode26 = (iHashCode25 + (bLiveGiftNameStatus != null ? bLiveGiftNameStatus.hashCode() : 0)) * 41;
        String str17 = this.dynamicUrl;
        int iHashCode27 = (iHashCode26 + (str17 != null ? str17.hashCode() : 0)) * 41;
        String str18 = this.rightTag;
        int iHashCode28 = (iHashCode27 + (str18 != null ? str18.hashCode() : 0)) * 41;
        LangModel langModel3 = this.localRightTag;
        int iHashCode29 = (iHashCode28 + (langModel3 != null ? langModel3.hashCode() : 0)) * 41;
        String str19 = this.startRightTagColor;
        int iHashCode30 = (iHashCode29 + (str19 != null ? str19.hashCode() : 0)) * 41;
        String str20 = this.endRightTagColor;
        int iHashCode31 = (iHashCode30 + (str20 != null ? str20.hashCode() : 0)) * 41;
        String str21 = this.rightTagTextColor;
        int iHashCode32 = (iHashCode31 + (str21 != null ? str21.hashCode() : 0)) * 41;
        BLiveGiftDiamondPrice bLiveGiftDiamondPrice = this.diamondPrice;
        int iHashCode33 = (iHashCode32 + (bLiveGiftDiamondPrice != null ? bLiveGiftDiamondPrice.hashCode() : 0)) * 41;
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = this.flyMicInfo;
        int iHashCode34 = iHashCode33 + (bLiveIntlFlyMicEffectConfig != null ? bLiveIntlFlyMicEffectConfig.hashCode() : 0);
        this.hashCode = iHashCode34;
        return iHashCode34;
    }

    public boolean isCountTimeGift() {
        return this.giftSource == -6;
    }

    public boolean isDiscountCard() {
        return !vwb.m200296J(this.labels) && this.labels.contains("discountCard");
    }

    public boolean isFaceGift() {
        return TextUtils.equals(this.animationType, "stickFace");
    }

    public boolean isGearsGift() {
        return !vwb.m200296J(this.gear.gearEffects);
    }

    public boolean isHighRankGift() {
        int i = this.giftLevel;
        return i == 200 || i == 300;
    }

    public boolean isJumpGift() {
        return this.giftSource == -4;
    }

    public boolean isLuckyGift() {
        return this.giftSource == 3;
    }

    public boolean isNormalGift() {
        return this.giftSource == 0;
    }

    public boolean isNotPacketGift() {
        return !isPacketGift();
    }

    public boolean isPacketGift() {
        return this.giftSource == 1;
    }

    public boolean isPaidGift() {
        return isNormalGift() || isLuckyGift();
    }

    public boolean isScrapGift() {
        return this.giftSource == 4;
    }

    public boolean isSupportDiscountGift() {
        return !vwb.m200296J(this.discounts);
    }

    public boolean isSupportDraw() {
        return "Draw".equals(getClickAction(true)) || "Draw".equals(getClickAction(false));
    }

    public boolean isValidGiftType() {
        return isNormalGift() || isLuckyGift() || isJumpGift() || isPacketGift() || isScrapGift() || isCountTimeGift();
    }

    public boolean isValidPacketGift(@NotNull Date date) {
        return isPacketGift() && this.remain > 0 && !date.after(new Date(this.expiredTime));
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftType == null) {
            this.giftType = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.localName == null) {
            this.localName = LangModel.new_();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.startTagColor == null) {
            this.startTagColor = "";
        }
        if (this.endTagColor == null) {
            this.endTagColor = "";
        }
        if (this.tagTextColor == null) {
            this.tagTextColor = "";
        }
        if (this.longPressText == null) {
            this.longPressText = "";
        }
        if (this.longPressGotoUrl == null) {
            this.longPressGotoUrl = "";
        }
        if (this.luckyPrizeGiftInfos == null) {
            this.luckyPrizeGiftInfos = new ArrayList();
        }
        if (this.liveResourceId == null) {
            this.liveResourceId = "";
        }
        if (this.interactStatus == null) {
            this.interactStatus = "";
        }
        if (this.interactRules == null) {
            this.interactRules = BLiveGiftInteractRules.new_();
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.expiredTimeText == null) {
            this.expiredTimeText = "";
        }
        if (this.animationType == null) {
            this.animationType = "";
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
        if (this.gear == null) {
            this.gear = BLiveGiftGearInfo.new_();
        }
        if (this.discounts == null) {
            this.discounts = new ArrayList();
        }
        if (this.dynamicUrl == null) {
            this.dynamicUrl = "";
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
        if (this.diamondPrice == null) {
            this.diamondPrice = BLiveGiftDiamondPrice.new_();
        }
        if (this.flyMicInfo == null) {
            this.flyMicInfo = BLiveIntlFlyMicEffectConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public void updateTagColorFromBrief(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.startTagColor)) {
            this.startTagColor = bLiveGivenGiftBrief.startTagColor;
        }
        if (TextUtils.isEmpty(bLiveGivenGiftBrief.endTagColor)) {
            return;
        }
        this.endTagColor = bLiveGivenGiftBrief.endTagColor;
    }
}
