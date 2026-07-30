package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveDiscountItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.ine0;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGivenGiftBrief extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGivenGiftBrief> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGivenGiftBrief>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGivenGiftBrief.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGivenGiftBrief newInstance() {
            return new BLiveGivenGiftBrief();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveGivenGiftBrief bLiveGivenGiftBrief, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1697648534:
                    if (str.equals("isDailyPaymentExceeded")) {
                        b = 0;
                    }
                    break;
                case -1657916319:
                    if (str.equals("interactRules")) {
                        b = 1;
                    }
                    break;
                case -1651329118:
                    if (str.equals("flyMicInfo")) {
                        b = 2;
                    }
                    break;
                case -1545477013:
                    if (str.equals("threshold")) {
                        b = 3;
                    }
                    break;
                case -1543492133:
                    if (str.equals("canBoomGearPercent")) {
                        b = 4;
                    }
                    break;
                case -1354825563:
                    if (str.equals("combos")) {
                        b = 5;
                    }
                    break;
                case -1291224811:
                    if (str.equals("previewText")) {
                        b = 6;
                    }
                    break;
                case -1180486183:
                    if (str.equals("isGear")) {
                        b = 7;
                    }
                    break;
                case -1150144887:
                    if (str.equals("canShowGearPercent")) {
                        b = 8;
                    }
                    break;
                case -979359017:
                    if (str.equals("canResetGearPercent")) {
                        b = 9;
                    }
                    break;
                case -934624660:
                    if (str.equals("remain")) {
                        b = 10;
                    }
                    break;
                case -862412412:
                    if (str.equals("gearPercentInfo")) {
                        b = 11;
                    }
                    break;
                case -853695194:
                    if (str.equals("luckyPrizeGiftInfoGiftItemId")) {
                        b = 12;
                    }
                    break;
                case -662710677:
                    if (str.equals("startTagColor")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -428647551:
                    if (str.equals("avatarTag")) {
                        b = 14;
                    }
                    break;
                case -324572240:
                    if (str.equals("stickFacePositionType")) {
                        b = 15;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -202206282:
                    if (str.equals("gearPercent")) {
                        b = 17;
                    }
                    break;
                case -162794529:
                    if (str.equals("expiredTimeText")) {
                        b = 18;
                    }
                    break;
                case -121228462:
                    if (str.equals("discounts")) {
                        b = 19;
                    }
                    break;
                case -92515438:
                    if (str.equals("expiredTime")) {
                        b = 20;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 21;
                    }
                    break;
                case 109446:
                    if (str.equals("num")) {
                        b = 22;
                    }
                    break;
                case 114586:
                    if (str.equals("tag")) {
                        b = 23;
                    }
                    break;
                case 3540684:
                    if (str.equals("step")) {
                        b = 24;
                    }
                    break;
                case 3568438:
                    if (str.equals("tray")) {
                        b = 25;
                    }
                    break;
                case 97621061:
                    if (str.equals("fpUrl")) {
                        b = 26;
                    }
                    break;
                case 161356139:
                    if (str.equals("giftSource")) {
                        b = 27;
                    }
                    break;
                case 171594184:
                    if (str.equals("interactStatus")) {
                        b = 28;
                    }
                    break;
                case 418647264:
                    if (str.equals("giftSetInfo")) {
                        b = 29;
                    }
                    break;
                case 528611132:
                    if (str.equals("enableComboEffect")) {
                        b = 30;
                    }
                    break;
                case 549753417:
                    if (str.equals("canStay")) {
                        b = 31;
                    }
                    break;
                case 735446559:
                    if (str.equals("giftBottomTag")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 794880879:
                    if (str.equals("videoEffectExtras")) {
                        b = 33;
                    }
                    break;
                case 925118262:
                    if (str.equals("nextValidTime")) {
                        b = 34;
                    }
                    break;
                case 950079305:
                    if (str.equals("comboId")) {
                        b = 35;
                    }
                    break;
                case 1204114652:
                    if (str.equals("isAnimationWithStarCombo")) {
                        b = 36;
                    }
                    break;
                case 1223010631:
                    if (str.equals("isFirstGivenGift")) {
                        b = 37;
                    }
                    break;
                case 1260025575:
                    if (str.equals("nextGearCnt")) {
                        b = 38;
                    }
                    break;
                case 1600999188:
                    if (str.equals("lotteryGiftId")) {
                        b = 39;
                    }
                    break;
                case 1967854052:
                    if (str.equals("endTagColor")) {
                        b = 40;
                    }
                    break;
                case 2055803880:
                    if (str.equals("canShowPreviewText")) {
                        b = 41;
                    }
                    break;
                case 2065990703:
                    if (str.equals("isNamed")) {
                        b = 42;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveGivenGiftBrief.isDailyPaymentExceeded = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveGivenGiftBrief.interactRules = BLiveGiftInteractRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveGivenGiftBrief.flyMicInfo = BLiveIntlFlyMicEffectConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveGivenGiftBrief.threshold = jsonParser.getValueAsLong();
                    return true;
                case 4:
                    bLiveGivenGiftBrief.canBoomGearPercent = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveGivenGiftBrief.combos = jsonParser.getValueAsInt();
                    return true;
                case 6:
                    bLiveGivenGiftBrief.previewText = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveGivenGiftBrief.isGear = jsonParser.getValueAsBoolean();
                    return true;
                case 8:
                    bLiveGivenGiftBrief.canShowGearPercent = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    bLiveGivenGiftBrief.canResetGearPercent = jsonParser.getValueAsBoolean();
                    return true;
                case 10:
                    bLiveGivenGiftBrief.remain = jsonParser.getValueAsInt();
                    return true;
                case 11:
                    bLiveGivenGiftBrief.gearPercentInfo = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveGivenGiftBrief.luckyPrizeGiftInfoGiftItemId = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    bLiveGivenGiftBrief.startTagColor = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveGivenGiftBrief.avatarTag = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveGivenGiftBrief.stickFacePositionType = jsonParser.getValueAsInt();
                    return true;
                case 16:
                    bLiveGivenGiftBrief.userName = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveGivenGiftBrief.gearPercent = (float) jsonParser.getValueAsDouble();
                    return true;
                case 18:
                    bLiveGivenGiftBrief.expiredTimeText = jsonParser.getValueAsString();
                    return true;
                case 19:
                    bLiveGivenGiftBrief.discounts = JsonAdapter.parseArray(jsonParser, BLiveDiscountItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    bLiveGivenGiftBrief.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case 21:
                    bLiveGivenGiftBrief.f45233id = jsonParser.getValueAsInt();
                    return false;
                case 22:
                    bLiveGivenGiftBrief.num = jsonParser.getValueAsInt();
                    return true;
                case 23:
                    bLiveGivenGiftBrief.tag = jsonParser.getValueAsString();
                    return true;
                case 24:
                    bLiveGivenGiftBrief.step = jsonParser.getValueAsLong();
                    return true;
                case 25:
                    bLiveGivenGiftBrief.tray = BLiveGivenGiftBriefTray.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    bLiveGivenGiftBrief.fpUrl = jsonParser.getValueAsString();
                    return true;
                case 27:
                    bLiveGivenGiftBrief.giftSource = jsonParser.getValueAsInt();
                    return true;
                case 28:
                    bLiveGivenGiftBrief.interactStatus = jsonParser.getValueAsString();
                    return true;
                case 29:
                    bLiveGivenGiftBrief.giftSetInfo = BLiveGiftSetInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    bLiveGivenGiftBrief.enableComboEffect = jsonParser.getValueAsBoolean();
                    return true;
                case 31:
                    bLiveGivenGiftBrief.canStay = jsonParser.getValueAsBoolean();
                    return true;
                case 32:
                    bLiveGivenGiftBrief.giftBottomTag = jsonParser.getValueAsString();
                    return true;
                case 33:
                    bLiveGivenGiftBrief.videoEffectExtras = JsonAdapter.parseArray(jsonParser, BLiveSpecialEffectResources.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    bLiveGivenGiftBrief.nextValidTime = jsonParser.getValueAsLong();
                    return true;
                case 35:
                    bLiveGivenGiftBrief.comboId = jsonParser.getValueAsString();
                    return true;
                case 36:
                    bLiveGivenGiftBrief.isAnimationWithStarCombo = jsonParser.getValueAsBoolean();
                    return true;
                case 37:
                    bLiveGivenGiftBrief.isFirstGivenGift = jsonParser.getValueAsBoolean();
                    return true;
                case 38:
                    bLiveGivenGiftBrief.nextGearCnt = jsonParser.getValueAsInt();
                    return true;
                case 39:
                    bLiveGivenGiftBrief.lotteryGiftId = jsonParser.getValueAsInt();
                    return true;
                case 40:
                    bLiveGivenGiftBrief.endTagColor = jsonParser.getValueAsString();
                    return true;
                case 41:
                    bLiveGivenGiftBrief.canShowPreviewText = jsonParser.getValueAsBoolean();
                    return true;
                case 42:
                    bLiveGivenGiftBrief.isNamed = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGivenGiftBrief bLiveGivenGiftBrief, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveGivenGiftBrief.f45233id);
            jsonGenerator.writeNumberField("num", bLiveGivenGiftBrief.num);
            String str = bLiveGivenGiftBrief.fpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("fpUrl", str);
            }
            String str2 = bLiveGivenGiftBrief.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveGivenGiftBrief.comboId;
            if (str3 != null) {
                jsonGenerator.writeStringField("comboId", str3);
            }
            jsonGenerator.writeNumberField("combos", bLiveGivenGiftBrief.combos);
            jsonGenerator.writeNumberField("stickFacePositionType", bLiveGivenGiftBrief.stickFacePositionType);
            jsonGenerator.writeNumberField("remain", bLiveGivenGiftBrief.remain);
            jsonGenerator.writeNumberField("expiredTime", bLiveGivenGiftBrief.expiredTime);
            jsonGenerator.writeBooleanField("isFirstGivenGift", bLiveGivenGiftBrief.isFirstGivenGift);
            jsonGenerator.writeNumberField("nextValidTime", bLiveGivenGiftBrief.nextValidTime);
            jsonGenerator.writeNumberField("luckyPrizeGiftInfoGiftItemId", bLiveGivenGiftBrief.luckyPrizeGiftInfoGiftItemId);
            jsonGenerator.writeNumberField("giftSource", bLiveGivenGiftBrief.giftSource);
            String str4 = bLiveGivenGiftBrief.interactStatus;
            if (str4 != null) {
                jsonGenerator.writeStringField("interactStatus", str4);
            }
            if (bLiveGivenGiftBrief.interactRules != null) {
                jsonGenerator.writeFieldName("interactRules");
                BLiveGiftInteractRules.JSON_ADAPTER.serialize(bLiveGivenGiftBrief.interactRules, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("enableComboEffect", bLiveGivenGiftBrief.enableComboEffect);
            String str5 = bLiveGivenGiftBrief.expiredTimeText;
            if (str5 != null) {
                jsonGenerator.writeStringField("expiredTimeText", str5);
            }
            if (bLiveGivenGiftBrief.videoEffectExtras != null) {
                jsonGenerator.writeFieldName("videoEffectExtras");
                JsonAdapter.serializeArray(bLiveGivenGiftBrief.videoEffectExtras, jsonGenerator, BLiveSpecialEffectResources.JSON_ADAPTER);
            }
            if (bLiveGivenGiftBrief.giftSetInfo != null) {
                jsonGenerator.writeFieldName("giftSetInfo");
                BLiveGiftSetInfo.JSON_ADAPTER.serialize(bLiveGivenGiftBrief.giftSetInfo, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isGear", bLiveGivenGiftBrief.isGear);
            jsonGenerator.writeBooleanField("canShowPreviewText", bLiveGivenGiftBrief.canShowPreviewText);
            String str6 = bLiveGivenGiftBrief.previewText;
            if (str6 != null) {
                jsonGenerator.writeStringField("previewText", str6);
            }
            jsonGenerator.writeNumberField("gearPercent", bLiveGivenGiftBrief.gearPercent);
            jsonGenerator.writeBooleanField("canShowGearPercent", bLiveGivenGiftBrief.canShowGearPercent);
            jsonGenerator.writeNumberField("threshold", bLiveGivenGiftBrief.threshold);
            jsonGenerator.writeNumberField("step", bLiveGivenGiftBrief.step);
            jsonGenerator.writeBooleanField("canBoomGearPercent", bLiveGivenGiftBrief.canBoomGearPercent);
            if (bLiveGivenGiftBrief.gearPercentInfo != null) {
                jsonGenerator.writeFieldName("gearPercentInfo");
                JsonAdapter.serializeArray(bLiveGivenGiftBrief.gearPercentInfo, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeBooleanField("isAnimationWithStarCombo", bLiveGivenGiftBrief.isAnimationWithStarCombo);
            jsonGenerator.writeBooleanField("canResetGearPercent", bLiveGivenGiftBrief.canResetGearPercent);
            jsonGenerator.writeNumberField("nextGearCnt", bLiveGivenGiftBrief.nextGearCnt);
            String str7 = bLiveGivenGiftBrief.tag;
            if (str7 != null) {
                jsonGenerator.writeStringField("tag", str7);
            }
            if (bLiveGivenGiftBrief.discounts != null) {
                jsonGenerator.writeFieldName("discounts");
                JsonAdapter.serializeArray(bLiveGivenGiftBrief.discounts, jsonGenerator, BLiveDiscountItem.JSON_ADAPTER);
            }
            String str8 = bLiveGivenGiftBrief.startTagColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("startTagColor", str8);
            }
            String str9 = bLiveGivenGiftBrief.endTagColor;
            if (str9 != null) {
                jsonGenerator.writeStringField("endTagColor", str9);
            }
            jsonGenerator.writeBooleanField("canStay", bLiveGivenGiftBrief.canStay);
            jsonGenerator.writeBooleanField("isDailyPaymentExceeded", bLiveGivenGiftBrief.isDailyPaymentExceeded);
            jsonGenerator.writeBooleanField("isNamed", bLiveGivenGiftBrief.isNamed);
            if (bLiveGivenGiftBrief.tray != null) {
                jsonGenerator.writeFieldName("tray");
                BLiveGivenGiftBriefTray.JSON_ADAPTER.serialize(bLiveGivenGiftBrief.tray, jsonGenerator, true);
            }
            if (bLiveGivenGiftBrief.flyMicInfo != null) {
                jsonGenerator.writeFieldName("flyMicInfo");
                BLiveIntlFlyMicEffectConfig.JSON_ADAPTER.serialize(bLiveGivenGiftBrief.flyMicInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("lotteryGiftId", bLiveGivenGiftBrief.lotteryGiftId);
            String str10 = bLiveGivenGiftBrief.avatarTag;
            if (str10 != null) {
                jsonGenerator.writeStringField("avatarTag", str10);
            }
            String str11 = bLiveGivenGiftBrief.giftBottomTag;
            if (str11 != null) {
                jsonGenerator.writeStringField("giftBottomTag", str11);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGivenGiftBrief) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegivengiftbrief";

    @NonNull
    @ProtobufIndex(index = 42)
    public String avatarTag;
    public String briefType;

    @ProtobufIndex(index = 27)
    public boolean canBoomGearPercent;

    @ProtobufIndex(index = 30)
    public boolean canResetGearPercent;

    @ProtobufIndex(index = 24)
    public boolean canShowGearPercent;

    @ProtobufIndex(index = 21)
    public boolean canShowPreviewText;

    @ProtobufIndex(index = 36)
    public boolean canStay;

    @NonNull
    @ProtobufIndex(index = 5)
    public String comboId;

    @ProtobufIndex(index = 6)
    public int combos;

    @NonNull
    @ProtobufIndex(index = 33)
    public List<BLiveDiscountItem> discounts;
    public BLiveGiftExtraDrawInfo drawParam;
    public String effectExt;

    @ProtobufIndex(index = 16)
    public boolean enableComboEffect;

    @NonNull
    @ProtobufIndex(index = 35)
    public String endTagColor;

    @ProtobufIndex(index = 9)
    public long expiredTime;

    @NonNull
    @ProtobufIndex(index = 17)
    public String expiredTimeText;

    @Nullable
    @ProtobufIndex(index = 40)
    public BLiveIntlFlyMicEffectConfig flyMicInfo;

    @NonNull
    @ProtobufIndex(index = 3)
    public String fpUrl;

    @ProtobufIndex(index = 23)
    public float gearPercent;

    @NonNull
    @ProtobufIndex(index = 28)
    public List<Integer> gearPercentInfo;

    @NonNull
    @ProtobufIndex(index = 43)
    public String giftBottomTag;

    @Nullable
    @ProtobufIndex(index = 19)
    public BLiveGiftSetInfo giftSetInfo;

    @ProtobufIndex(index = 13)
    public int giftSource;

    @Nullable
    public BLiveGiftMultiCall guildCall;
    public boolean hasVoiceMode;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f45233id;

    @NonNull
    @ProtobufIndex(index = 15)
    public BLiveGiftInteractRules interactRules;

    @NonNull
    @ProtobufIndex(index = 14)
    public String interactStatus;

    @ProtobufIndex(index = 29)
    public boolean isAnimationWithStarCombo;

    @ProtobufIndex(index = 37)
    public boolean isDailyPaymentExceeded;

    @ProtobufIndex(index = 10)
    public boolean isFirstGivenGift;

    @ProtobufIndex(index = 20)
    public boolean isGear;

    @ProtobufIndex(index = 38)
    public boolean isNamed;
    public BLiveUserMask liveUserMask;

    @ProtobufIndex(index = 41)
    public int lotteryGiftId;

    @ProtobufIndex(index = 12)
    public int luckyPrizeGiftInfoGiftItemId;

    @Nullable
    public BLiveGiftMultiCall multiCall;

    @ProtobufIndex(index = 31)
    public int nextGearCnt;

    @ProtobufIndex(index = 11)
    public long nextValidTime;

    @ProtobufIndex(index = 2)
    public int num;
    public boolean pollFromNetwork;

    @NonNull
    @ProtobufIndex(index = 22)
    public String previewText;
    public BLiveUserMask previewUserMask;
    public BLiveUserMask receiverShowMask;

    @ProtobufIndex(index = 8)
    public int remain;
    public String sendGiftBatchOriginalId = "";
    public ine0 sendGiftExtraInfo;

    @Nullable
    public String sendGiftOriginalId;
    public BLiveUserMask senderShowMask;

    @NonNull
    @ProtobufIndex(index = 34)
    public String startTagColor;

    @ProtobufIndex(index = 26)
    public long step;

    @ProtobufIndex(index = 7)
    public int stickFacePositionType;

    @NonNull
    @ProtobufIndex(index = 32)
    public String tag;

    @ProtobufIndex(index = 25)
    public long threshold;
    public String tradeNo;

    @NonNull
    @ProtobufIndex(index = 39)
    public BLiveGivenGiftBriefTray tray;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userName;
    public String videoChatId;

    @NonNull
    @ProtobufIndex(index = 18)
    public List<BLiveSpecialEffectResources> videoEffectExtras;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m69183b(Integer num) {
        return num;
    }

    public static BLiveGivenGiftBrief new_() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = new BLiveGivenGiftBrief();
        bLiveGivenGiftBrief.nullCheck();
        return bLiveGivenGiftBrief;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGivenGiftBrief mo225055clone() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = new BLiveGivenGiftBrief();
        bLiveGivenGiftBrief.f45233id = this.f45233id;
        bLiveGivenGiftBrief.num = this.num;
        bLiveGivenGiftBrief.fpUrl = this.fpUrl;
        bLiveGivenGiftBrief.userName = this.userName;
        bLiveGivenGiftBrief.comboId = this.comboId;
        bLiveGivenGiftBrief.combos = this.combos;
        bLiveGivenGiftBrief.stickFacePositionType = this.stickFacePositionType;
        bLiveGivenGiftBrief.remain = this.remain;
        bLiveGivenGiftBrief.expiredTime = this.expiredTime;
        bLiveGivenGiftBrief.isFirstGivenGift = this.isFirstGivenGift;
        bLiveGivenGiftBrief.nextValidTime = this.nextValidTime;
        bLiveGivenGiftBrief.luckyPrizeGiftInfoGiftItemId = this.luckyPrizeGiftInfoGiftItemId;
        bLiveGivenGiftBrief.giftSource = this.giftSource;
        bLiveGivenGiftBrief.interactStatus = this.interactStatus;
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        if (bLiveGiftInteractRules != null) {
            bLiveGivenGiftBrief.interactRules = bLiveGiftInteractRules.mo225055clone();
        }
        bLiveGivenGiftBrief.enableComboEffect = this.enableComboEffect;
        bLiveGivenGiftBrief.expiredTimeText = this.expiredTimeText;
        List<BLiveSpecialEffectResources> list = this.videoEffectExtras;
        if (list != null) {
            bLiveGivenGiftBrief.videoEffectExtras = ValueObject.util_map(list, new qcj() { // from class: l.h12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSpecialEffectResources) obj).mo225055clone();
                }
            });
        }
        BLiveGiftSetInfo bLiveGiftSetInfo = this.giftSetInfo;
        if (bLiveGiftSetInfo != null) {
            bLiveGivenGiftBrief.giftSetInfo = bLiveGiftSetInfo.mo225055clone();
        }
        bLiveGivenGiftBrief.isGear = this.isGear;
        bLiveGivenGiftBrief.canShowPreviewText = this.canShowPreviewText;
        bLiveGivenGiftBrief.previewText = this.previewText;
        bLiveGivenGiftBrief.gearPercent = this.gearPercent;
        bLiveGivenGiftBrief.canShowGearPercent = this.canShowGearPercent;
        bLiveGivenGiftBrief.threshold = this.threshold;
        bLiveGivenGiftBrief.step = this.step;
        bLiveGivenGiftBrief.canBoomGearPercent = this.canBoomGearPercent;
        List<Integer> list2 = this.gearPercentInfo;
        if (list2 != null) {
            bLiveGivenGiftBrief.gearPercentInfo = ValueObject.util_map(list2, new qcj() { // from class: l.i12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveGivenGiftBrief.m69183b((Integer) obj);
                }
            });
        }
        bLiveGivenGiftBrief.isAnimationWithStarCombo = this.isAnimationWithStarCombo;
        bLiveGivenGiftBrief.canResetGearPercent = this.canResetGearPercent;
        bLiveGivenGiftBrief.nextGearCnt = this.nextGearCnt;
        bLiveGivenGiftBrief.tag = this.tag;
        List<BLiveDiscountItem> list3 = this.discounts;
        if (list3 != null) {
            bLiveGivenGiftBrief.discounts = ValueObject.util_map(list3, new qcj() { // from class: l.j12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveDiscountItem) obj).mo225055clone();
                }
            });
        }
        bLiveGivenGiftBrief.startTagColor = this.startTagColor;
        bLiveGivenGiftBrief.endTagColor = this.endTagColor;
        bLiveGivenGiftBrief.canStay = this.canStay;
        bLiveGivenGiftBrief.isDailyPaymentExceeded = this.isDailyPaymentExceeded;
        bLiveGivenGiftBrief.isNamed = this.isNamed;
        BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray = this.tray;
        if (bLiveGivenGiftBriefTray != null) {
            bLiveGivenGiftBrief.tray = bLiveGivenGiftBriefTray.mo225055clone();
        }
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = this.flyMicInfo;
        if (bLiveIntlFlyMicEffectConfig != null) {
            bLiveGivenGiftBrief.flyMicInfo = bLiveIntlFlyMicEffectConfig.mo225055clone();
        }
        bLiveGivenGiftBrief.lotteryGiftId = this.lotteryGiftId;
        bLiveGivenGiftBrief.avatarTag = this.avatarTag;
        bLiveGivenGiftBrief.giftBottomTag = this.giftBottomTag;
        return bLiveGivenGiftBrief;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGivenGiftBrief)) {
            return false;
        }
        BLiveGivenGiftBrief bLiveGivenGiftBrief = (BLiveGivenGiftBrief) obj;
        return this.f45233id == bLiveGivenGiftBrief.f45233id && this.num == bLiveGivenGiftBrief.num && ValueObject.util_equals(this.fpUrl, bLiveGivenGiftBrief.fpUrl) && ValueObject.util_equals(this.userName, bLiveGivenGiftBrief.userName) && ValueObject.util_equals(this.comboId, bLiveGivenGiftBrief.comboId) && this.combos == bLiveGivenGiftBrief.combos && this.stickFacePositionType == bLiveGivenGiftBrief.stickFacePositionType && this.remain == bLiveGivenGiftBrief.remain && this.expiredTime == bLiveGivenGiftBrief.expiredTime && this.isFirstGivenGift == bLiveGivenGiftBrief.isFirstGivenGift && this.nextValidTime == bLiveGivenGiftBrief.nextValidTime && this.luckyPrizeGiftInfoGiftItemId == bLiveGivenGiftBrief.luckyPrizeGiftInfoGiftItemId && this.giftSource == bLiveGivenGiftBrief.giftSource && ValueObject.util_equals(this.interactStatus, bLiveGivenGiftBrief.interactStatus) && ValueObject.util_equals(this.interactRules, bLiveGivenGiftBrief.interactRules) && this.enableComboEffect == bLiveGivenGiftBrief.enableComboEffect && ValueObject.util_equals(this.expiredTimeText, bLiveGivenGiftBrief.expiredTimeText) && ValueObject.util_equals(this.videoEffectExtras, bLiveGivenGiftBrief.videoEffectExtras) && ValueObject.util_equals(this.giftSetInfo, bLiveGivenGiftBrief.giftSetInfo) && this.isGear == bLiveGivenGiftBrief.isGear && this.canShowPreviewText == bLiveGivenGiftBrief.canShowPreviewText && ValueObject.util_equals(this.previewText, bLiveGivenGiftBrief.previewText) && this.gearPercent == bLiveGivenGiftBrief.gearPercent && this.canShowGearPercent == bLiveGivenGiftBrief.canShowGearPercent && this.threshold == bLiveGivenGiftBrief.threshold && this.step == bLiveGivenGiftBrief.step && this.canBoomGearPercent == bLiveGivenGiftBrief.canBoomGearPercent && ValueObject.util_equals(this.gearPercentInfo, bLiveGivenGiftBrief.gearPercentInfo) && this.isAnimationWithStarCombo == bLiveGivenGiftBrief.isAnimationWithStarCombo && this.canResetGearPercent == bLiveGivenGiftBrief.canResetGearPercent && this.nextGearCnt == bLiveGivenGiftBrief.nextGearCnt && ValueObject.util_equals(this.tag, bLiveGivenGiftBrief.tag) && ValueObject.util_equals(this.discounts, bLiveGivenGiftBrief.discounts) && ValueObject.util_equals(this.startTagColor, bLiveGivenGiftBrief.startTagColor) && ValueObject.util_equals(this.endTagColor, bLiveGivenGiftBrief.endTagColor) && this.canStay == bLiveGivenGiftBrief.canStay && this.isDailyPaymentExceeded == bLiveGivenGiftBrief.isDailyPaymentExceeded && this.isNamed == bLiveGivenGiftBrief.isNamed && ValueObject.util_equals(this.tray, bLiveGivenGiftBrief.tray) && ValueObject.util_equals(this.flyMicInfo, bLiveGivenGiftBrief.flyMicInfo) && this.lotteryGiftId == bLiveGivenGiftBrief.lotteryGiftId && ValueObject.util_equals(this.avatarTag, bLiveGivenGiftBrief.avatarTag) && ValueObject.util_equals(this.giftBottomTag, bLiveGivenGiftBrief.giftBottomTag);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getClickAction(boolean z) {
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        return (z ? bLiveGiftInteractRules.longPress : bLiveGiftInteractRules.click).action;
    }

    public String getSendGiftExtraInfo() {
        return this.sendGiftExtraInfo.toString();
    }

    public boolean hasActionRule() {
        return hasSingleClickRule() || hasLongClickRule();
    }

    public boolean hasLongClickRule() {
        return !TextUtils.isEmpty(getClickAction(true));
    }

    public boolean hasSingleClickRule() {
        return !TextUtils.isEmpty(getClickAction(false));
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.f45233id) * 41) + this.num) * 41;
        String str = this.fpUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.comboId;
        int iHashCode3 = (((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.combos) * 41) + this.stickFacePositionType) * 41) + this.remain) * 41;
        long j = this.expiredTime;
        int i3 = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 41;
        int i4 = this.isFirstGivenGift ? 1231 : 1237;
        long j2 = this.nextValidTime;
        int i5 = (((((((i3 + i4) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.luckyPrizeGiftInfoGiftItemId) * 41) + this.giftSource) * 41;
        String str4 = this.interactStatus;
        int iHashCode4 = (i5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveGiftInteractRules bLiveGiftInteractRules = this.interactRules;
        int iHashCode5 = (((iHashCode4 + (bLiveGiftInteractRules != null ? bLiveGiftInteractRules.hashCode() : 0)) * 41) + (this.enableComboEffect ? 1231 : 1237)) * 41;
        String str5 = this.expiredTimeText;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<BLiveSpecialEffectResources> list = this.videoEffectExtras;
        int iHashCode7 = (iHashCode6 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveGiftSetInfo bLiveGiftSetInfo = this.giftSetInfo;
        int iHashCode8 = (((((iHashCode7 + (bLiveGiftSetInfo != null ? bLiveGiftSetInfo.hashCode() : 0)) * 41) + (this.isGear ? 1231 : 1237)) * 41) + (this.canShowPreviewText ? 1231 : 1237)) * 41;
        String str6 = this.previewText;
        int iHashCode9 = (((iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41) + Float.floatToIntBits(this.gearPercent)) * 41;
        int i6 = this.canShowGearPercent ? 1231 : 1237;
        long j3 = this.threshold;
        int i7 = (((iHashCode9 + i6) * 41) + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.step;
        int i8 = (((i7 + ((int) (j4 ^ (j4 >>> 32)))) * 41) + (this.canBoomGearPercent ? 1231 : 1237)) * 41;
        List<Integer> list2 = this.gearPercentInfo;
        int iHashCode10 = (((((((i8 + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.isAnimationWithStarCombo ? 1231 : 1237)) * 41) + (this.canResetGearPercent ? 1231 : 1237)) * 41) + this.nextGearCnt) * 41;
        String str7 = this.tag;
        int iHashCode11 = (iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 41;
        List<BLiveDiscountItem> list3 = this.discounts;
        int iHashCode12 = (iHashCode11 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str8 = this.startTagColor;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.endTagColor;
        int iHashCode14 = (((((((iHashCode13 + (str9 != null ? str9.hashCode() : 0)) * 41) + (this.canStay ? 1231 : 1237)) * 41) + (this.isDailyPaymentExceeded ? 1231 : 1237)) * 41) + (this.isNamed ? 1231 : 1237)) * 41;
        BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray = this.tray;
        int iHashCode15 = (iHashCode14 + (bLiveGivenGiftBriefTray != null ? bLiveGivenGiftBriefTray.hashCode() : 0)) * 41;
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = this.flyMicInfo;
        int iHashCode16 = (((iHashCode15 + (bLiveIntlFlyMicEffectConfig != null ? bLiveIntlFlyMicEffectConfig.hashCode() : 0)) * 41) + this.lotteryGiftId) * 41;
        String str10 = this.avatarTag;
        int iHashCode17 = (iHashCode16 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.giftBottomTag;
        int iHashCode18 = iHashCode17 + (str11 != null ? str11.hashCode() : 0);
        this.hashCode = iHashCode18;
        return iHashCode18;
    }

    public boolean isAuctionBrief() {
        return "extra_type_voice_auction".equals(this.briefType);
    }

    public boolean isAudienceBrief() {
        return "extra_type_audience".equals(this.briefType);
    }

    public boolean isEnterRoomBrief() {
        return "extra_type_enter_room".equals(this.briefType);
    }

    public boolean isGiftBrief() {
        return "extra_type_normal".equals(this.briefType);
    }

    public boolean isGuildCall() {
        return "extra_type_guild_live".equals(this.briefType) && NullChecker.m82486a(this.guildCall);
    }

    public boolean isLianMaiBrief() {
        return "extra_type_lian_mai".equals(this.briefType);
    }

    public boolean isMultiCall() {
        return "extra_type_multi_call".equals(this.briefType) && NullChecker.m82486a(this.multiCall);
    }

    public boolean isSendGiftFromBatch() {
        return !TextUtils.isEmpty(this.sendGiftBatchOriginalId);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.fpUrl == null) {
            this.fpUrl = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.comboId == null) {
            this.comboId = "";
        }
        if (this.interactStatus == null) {
            this.interactStatus = "";
        }
        if (this.interactRules == null) {
            this.interactRules = BLiveGiftInteractRules.new_();
        }
        if (this.expiredTimeText == null) {
            this.expiredTimeText = "";
        }
        if (this.videoEffectExtras == null) {
            this.videoEffectExtras = new ArrayList();
        }
        if (this.previewText == null) {
            this.previewText = "";
        }
        if (this.gearPercentInfo == null) {
            this.gearPercentInfo = new ArrayList();
        }
        if (this.tag == null) {
            this.tag = "";
        }
        if (this.discounts == null) {
            this.discounts = new ArrayList();
        }
        if (this.startTagColor == null) {
            this.startTagColor = "";
        }
        if (this.endTagColor == null) {
            this.endTagColor = "";
        }
        if (this.tray == null) {
            this.tray = BLiveGivenGiftBriefTray.new_();
        }
        if (this.avatarTag == null) {
            this.avatarTag = "";
        }
        if (this.giftBottomTag == null) {
            this.giftBottomTag = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
