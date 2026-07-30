package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoomEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
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
public class BLiveEnterRoomEffect extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEnterRoomEffect> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEnterRoomEffect>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEnterRoomEffect.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEnterRoomEffect.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEnterRoomEffect newInstance() {
            return new BLiveEnterRoomEffect();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveEnterRoomEffect bLiveEnterRoomEffect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2101232695:
                    if (str.equals("dynamicEffectExtends")) {
                        b = 0;
                    }
                    break;
                case -1893613215:
                    if (str.equals("backgroundUrl")) {
                        b = 1;
                    }
                    break;
                case -1860123059:
                    if (str.equals("fixedBackgroundUrl")) {
                        b = 2;
                    }
                    break;
                case -1607531000:
                    if (str.equals("backgroundUrlEndMargin")) {
                        b = 3;
                    }
                    break;
                case -1345650231:
                    if (str.equals("resourceId")) {
                        b = 4;
                    }
                    break;
                case -1177092215:
                    if (str.equals("floatingUrl")) {
                        b = 5;
                    }
                    break;
                case -1123095539:
                    if (str.equals("userNameColor")) {
                        b = 6;
                    }
                    break;
                case -1063571914:
                    if (str.equals("textColor")) {
                        b = 7;
                    }
                    break;
                case -1017208180:
                    if (str.equals("effectId")) {
                        b = 8;
                    }
                    break;
                case -1016963242:
                    if (str.equals("userNameGradientColors")) {
                        b = 9;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 10;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 11;
                    }
                    break;
                case -834724724:
                    if (str.equals("expireTime")) {
                        b = 12;
                    }
                    break;
                case -674055735:
                    if (str.equals("newFloatingUrl")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -549278283:
                    if (str.equals("backgroundGradients")) {
                        b = 14;
                    }
                    break;
                case -498139255:
                    if (str.equals("newResourceId")) {
                        b = 15;
                    }
                    break;
                case -300561696:
                    if (str.equals("enterVersion")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 17;
                    }
                    break;
                case -79963766:
                    if (str.equals("internalText")) {
                        b = 18;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        b = 19;
                    }
                    break;
                case 318993488:
                    if (str.equals("userImage")) {
                        b = 20;
                    }
                    break;
                case 794880879:
                    if (str.equals("videoEffectExtras")) {
                        b = 21;
                    }
                    break;
                case 797475286:
                    if (str.equals("avatarGradientDirection")) {
                        b = 22;
                    }
                    break;
                case 872182433:
                    if (str.equals("backgroundGradientDirection")) {
                        b = 23;
                    }
                    break;
                case 1145025758:
                    if (str.equals("hierarchys")) {
                        b = 24;
                    }
                    break;
                case 1224717951:
                    if (str.equals("animationSizeType")) {
                        b = 25;
                    }
                    break;
                case 1425523178:
                    if (str.equals("avatarGradients")) {
                        b = 26;
                    }
                    break;
                case 1450983345:
                    if (str.equals("showDuration")) {
                        b = 27;
                    }
                    break;
                case 1507279486:
                    if (str.equals("isWealthHierarchy")) {
                        b = 28;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveEnterRoomEffect.dynamicEffectExtends = JsonAdapter.parseArray(jsonParser, BLiveDynamicEffectExtend.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveEnterRoomEffect.backgroundUrl = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveEnterRoomEffect.fixedBackgroundUrl = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveEnterRoomEffect.backgroundUrlEndMargin = jsonParser.getValueAsInt();
                    return true;
                case 4:
                    bLiveEnterRoomEffect.resourceId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveEnterRoomEffect.floatingUrl = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveEnterRoomEffect.userNameColor = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveEnterRoomEffect.textColor = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveEnterRoomEffect.effectId = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveEnterRoomEffect.userNameGradientColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveEnterRoomEffect.roomId = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveEnterRoomEffect.userId = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveEnterRoomEffect.expireTime = jsonParser.getValueAsLong();
                    return true;
                case 13:
                    bLiveEnterRoomEffect.newFloatingUrl = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveEnterRoomEffect.backgroundGradients = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveEnterRoomEffect.newResourceId = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveEnterRoomEffect.enterVersion = jsonParser.getValueAsLong();
                    return true;
                case 17:
                    bLiveEnterRoomEffect.userName = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveEnterRoomEffect.internalText = jsonParser.getValueAsString();
                    return true;
                case 19:
                    bLiveEnterRoomEffect.text = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveEnterRoomEffect.userImage = jsonParser.getValueAsString();
                    return true;
                case 21:
                    bLiveEnterRoomEffect.videoEffectExtras = JsonAdapter.parseArray(jsonParser, BLiveSpecialEffectResources.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveEnterRoomEffect.avatarGradientDirection = jsonParser.getValueAsInt();
                    return true;
                case 23:
                    bLiveEnterRoomEffect.backgroundGradientDirection = jsonParser.getValueAsInt();
                    return true;
                case 24:
                    bLiveEnterRoomEffect.hierarchys = BLiveWealthHierarchys.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    bLiveEnterRoomEffect.animationSizeType = jsonParser.getValueAsLong();
                    return true;
                case 26:
                    bLiveEnterRoomEffect.avatarGradients = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    bLiveEnterRoomEffect.showDuration = jsonParser.getValueAsInt();
                    return true;
                case 28:
                    bLiveEnterRoomEffect.isWealthHierarchy = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEnterRoomEffect bLiveEnterRoomEffect, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveEnterRoomEffect.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveEnterRoomEffect.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveEnterRoomEffect.userName;
            if (str3 != null) {
                jsonGenerator.writeStringField("userName", str3);
            }
            String str4 = bLiveEnterRoomEffect.userImage;
            if (str4 != null) {
                jsonGenerator.writeStringField("userImage", str4);
            }
            String str5 = bLiveEnterRoomEffect.userNameColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("userNameColor", str5);
            }
            if (bLiveEnterRoomEffect.userNameGradientColors != null) {
                jsonGenerator.writeFieldName("userNameGradientColors");
                JsonAdapter.serializeArray(bLiveEnterRoomEffect.userNameGradientColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str6 = bLiveEnterRoomEffect.text;
            if (str6 != null) {
                jsonGenerator.writeStringField("text", str6);
            }
            String str7 = bLiveEnterRoomEffect.textColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("textColor", str7);
            }
            String str8 = bLiveEnterRoomEffect.backgroundUrl;
            if (str8 != null) {
                jsonGenerator.writeStringField("backgroundUrl", str8);
            }
            jsonGenerator.writeNumberField("backgroundGradientDirection", bLiveEnterRoomEffect.backgroundGradientDirection);
            if (bLiveEnterRoomEffect.backgroundGradients != null) {
                jsonGenerator.writeFieldName("backgroundGradients");
                JsonAdapter.serializeArray(bLiveEnterRoomEffect.backgroundGradients, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str9 = bLiveEnterRoomEffect.floatingUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("floatingUrl", str9);
            }
            String str10 = bLiveEnterRoomEffect.resourceId;
            if (str10 != null) {
                jsonGenerator.writeStringField("resourceId", str10);
            }
            jsonGenerator.writeNumberField("showDuration", bLiveEnterRoomEffect.showDuration);
            jsonGenerator.writeBooleanField("isWealthHierarchy", bLiveEnterRoomEffect.isWealthHierarchy);
            if (bLiveEnterRoomEffect.hierarchys != null) {
                jsonGenerator.writeFieldName("hierarchys");
                BLiveWealthHierarchys.JSON_ADAPTER.serialize(bLiveEnterRoomEffect.hierarchys, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("avatarGradientDirection", bLiveEnterRoomEffect.avatarGradientDirection);
            if (bLiveEnterRoomEffect.avatarGradients != null) {
                jsonGenerator.writeFieldName("avatarGradients");
                JsonAdapter.serializeArray(bLiveEnterRoomEffect.avatarGradients, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str11 = bLiveEnterRoomEffect.effectId;
            if (str11 != null) {
                jsonGenerator.writeStringField("effectId", str11);
            }
            String str12 = bLiveEnterRoomEffect.internalText;
            if (str12 != null) {
                jsonGenerator.writeStringField("internalText", str12);
            }
            jsonGenerator.writeNumberField("expireTime", bLiveEnterRoomEffect.expireTime);
            jsonGenerator.writeNumberField("backgroundUrlEndMargin", bLiveEnterRoomEffect.backgroundUrlEndMargin);
            String str13 = bLiveEnterRoomEffect.fixedBackgroundUrl;
            if (str13 != null) {
                jsonGenerator.writeStringField("fixedBackgroundUrl", str13);
            }
            jsonGenerator.writeNumberField("animationSizeType", bLiveEnterRoomEffect.animationSizeType);
            jsonGenerator.writeNumberField("enterVersion", bLiveEnterRoomEffect.enterVersion);
            String str14 = bLiveEnterRoomEffect.newFloatingUrl;
            if (str14 != null) {
                jsonGenerator.writeStringField("newFloatingUrl", str14);
            }
            String str15 = bLiveEnterRoomEffect.newResourceId;
            if (str15 != null) {
                jsonGenerator.writeStringField("newResourceId", str15);
            }
            if (bLiveEnterRoomEffect.videoEffectExtras != null) {
                jsonGenerator.writeFieldName("videoEffectExtras");
                JsonAdapter.serializeArray(bLiveEnterRoomEffect.videoEffectExtras, jsonGenerator, BLiveSpecialEffectResources.JSON_ADAPTER);
            }
            if (bLiveEnterRoomEffect.dynamicEffectExtends != null) {
                jsonGenerator.writeFieldName("dynamicEffectExtends");
                JsonAdapter.serializeArray(bLiveEnterRoomEffect.dynamicEffectExtends, jsonGenerator, BLiveDynamicEffectExtend.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEnterRoomEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveenterroomeffect";

    @ProtobufIndex(index = 23)
    public long animationSizeType;

    @ProtobufIndex(index = 16)
    public int avatarGradientDirection;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<String> avatarGradients;

    @ProtobufIndex(index = 9)
    public int backgroundGradientDirection;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<String> backgroundGradients;

    @NonNull
    @ProtobufIndex(index = 8)
    public String backgroundUrl;

    @ProtobufIndex(index = 21)
    public int backgroundUrlEndMargin;

    @NonNull
    @ProtobufIndex(index = 28)
    public List<BLiveDynamicEffectExtend> dynamicEffectExtends;

    @NonNull
    @ProtobufIndex(index = 18)
    public String effectId;

    @ProtobufIndex(index = 24)
    public long enterVersion;

    @ProtobufIndex(index = 20)
    public long expireTime;

    @NonNull
    @ProtobufIndex(index = 22)
    public String fixedBackgroundUrl;

    @NonNull
    @ProtobufIndex(index = 11)
    public String floatingUrl;

    @NonNull
    @ProtobufIndex(index = 15)
    public BLiveWealthHierarchys hierarchys;

    @NonNull
    @ProtobufIndex(index = 19)
    public String internalText;

    @ProtobufIndex(index = 14)
    public boolean isWealthHierarchy;

    @NonNull
    @ProtobufIndex(index = 26)
    public String newFloatingUrl;

    @NonNull
    @ProtobufIndex(index = 25)
    public String newResourceId;

    @NonNull
    @ProtobufIndex(index = 12)
    public String resourceId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @ProtobufIndex(index = 13)
    public int showDuration;

    @NonNull
    @ProtobufIndex(index = 6)
    public String text;

    @NonNull
    @ProtobufIndex(index = 7)
    public String textColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userImage;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userName;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userNameColor;

    @NonNull
    @ProtobufIndex(index = 29)
    public List<String> userNameGradientColors;

    @NonNull
    @ProtobufIndex(index = 27)
    public List<BLiveSpecialEffectResources> videoEffectExtras;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m67934b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m67936d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m67937e(String str) {
        return str;
    }

    public static BLiveEnterRoomEffect new_() {
        BLiveEnterRoomEffect bLiveEnterRoomEffect = new BLiveEnterRoomEffect();
        bLiveEnterRoomEffect.nullCheck();
        return bLiveEnterRoomEffect;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEnterRoomEffect mo223809clone() {
        BLiveEnterRoomEffect bLiveEnterRoomEffect = new BLiveEnterRoomEffect();
        bLiveEnterRoomEffect.userId = this.userId;
        bLiveEnterRoomEffect.roomId = this.roomId;
        bLiveEnterRoomEffect.userName = this.userName;
        bLiveEnterRoomEffect.userImage = this.userImage;
        bLiveEnterRoomEffect.userNameColor = this.userNameColor;
        List<String> list = this.userNameGradientColors;
        if (list != null) {
            bLiveEnterRoomEffect.userNameGradientColors = ValueObject.util_map(list, new w9j() { // from class: l.ez1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveEnterRoomEffect.m67937e((String) obj);
                }
            });
        }
        bLiveEnterRoomEffect.text = this.text;
        bLiveEnterRoomEffect.textColor = this.textColor;
        bLiveEnterRoomEffect.backgroundUrl = this.backgroundUrl;
        bLiveEnterRoomEffect.backgroundGradientDirection = this.backgroundGradientDirection;
        List<String> list2 = this.backgroundGradients;
        if (list2 != null) {
            bLiveEnterRoomEffect.backgroundGradients = ValueObject.util_map(list2, new w9j() { // from class: l.fz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveEnterRoomEffect.m67936d((String) obj);
                }
            });
        }
        bLiveEnterRoomEffect.floatingUrl = this.floatingUrl;
        bLiveEnterRoomEffect.resourceId = this.resourceId;
        bLiveEnterRoomEffect.showDuration = this.showDuration;
        bLiveEnterRoomEffect.isWealthHierarchy = this.isWealthHierarchy;
        BLiveWealthHierarchys bLiveWealthHierarchys = this.hierarchys;
        if (bLiveWealthHierarchys != null) {
            bLiveEnterRoomEffect.hierarchys = bLiveWealthHierarchys.mo223809clone();
        }
        bLiveEnterRoomEffect.avatarGradientDirection = this.avatarGradientDirection;
        List<String> list3 = this.avatarGradients;
        if (list3 != null) {
            bLiveEnterRoomEffect.avatarGradients = ValueObject.util_map(list3, new w9j() { // from class: l.gz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveEnterRoomEffect.m67934b((String) obj);
                }
            });
        }
        bLiveEnterRoomEffect.effectId = this.effectId;
        bLiveEnterRoomEffect.internalText = this.internalText;
        bLiveEnterRoomEffect.expireTime = this.expireTime;
        bLiveEnterRoomEffect.backgroundUrlEndMargin = this.backgroundUrlEndMargin;
        bLiveEnterRoomEffect.fixedBackgroundUrl = this.fixedBackgroundUrl;
        bLiveEnterRoomEffect.animationSizeType = this.animationSizeType;
        bLiveEnterRoomEffect.enterVersion = this.enterVersion;
        bLiveEnterRoomEffect.newFloatingUrl = this.newFloatingUrl;
        bLiveEnterRoomEffect.newResourceId = this.newResourceId;
        List<BLiveSpecialEffectResources> list4 = this.videoEffectExtras;
        if (list4 != null) {
            bLiveEnterRoomEffect.videoEffectExtras = ValueObject.util_map(list4, new w9j() { // from class: l.hz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSpecialEffectResources) obj).mo223809clone();
                }
            });
        }
        List<BLiveDynamicEffectExtend> list5 = this.dynamicEffectExtends;
        if (list5 != null) {
            bLiveEnterRoomEffect.dynamicEffectExtends = ValueObject.util_map(list5, new w9j() { // from class: l.iz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveDynamicEffectExtend) obj).mo223809clone();
                }
            });
        }
        return bLiveEnterRoomEffect;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEnterRoomEffect)) {
            return false;
        }
        BLiveEnterRoomEffect bLiveEnterRoomEffect = (BLiveEnterRoomEffect) obj;
        return ValueObject.util_equals(this.userId, bLiveEnterRoomEffect.userId) && ValueObject.util_equals(this.roomId, bLiveEnterRoomEffect.roomId) && ValueObject.util_equals(this.userName, bLiveEnterRoomEffect.userName) && ValueObject.util_equals(this.userImage, bLiveEnterRoomEffect.userImage) && ValueObject.util_equals(this.userNameColor, bLiveEnterRoomEffect.userNameColor) && ValueObject.util_equals(this.userNameGradientColors, bLiveEnterRoomEffect.userNameGradientColors) && ValueObject.util_equals(this.text, bLiveEnterRoomEffect.text) && ValueObject.util_equals(this.textColor, bLiveEnterRoomEffect.textColor) && ValueObject.util_equals(this.backgroundUrl, bLiveEnterRoomEffect.backgroundUrl) && this.backgroundGradientDirection == bLiveEnterRoomEffect.backgroundGradientDirection && ValueObject.util_equals(this.backgroundGradients, bLiveEnterRoomEffect.backgroundGradients) && ValueObject.util_equals(this.floatingUrl, bLiveEnterRoomEffect.floatingUrl) && ValueObject.util_equals(this.resourceId, bLiveEnterRoomEffect.resourceId) && this.showDuration == bLiveEnterRoomEffect.showDuration && this.isWealthHierarchy == bLiveEnterRoomEffect.isWealthHierarchy && ValueObject.util_equals(this.hierarchys, bLiveEnterRoomEffect.hierarchys) && this.avatarGradientDirection == bLiveEnterRoomEffect.avatarGradientDirection && ValueObject.util_equals(this.avatarGradients, bLiveEnterRoomEffect.avatarGradients) && ValueObject.util_equals(this.effectId, bLiveEnterRoomEffect.effectId) && ValueObject.util_equals(this.internalText, bLiveEnterRoomEffect.internalText) && this.expireTime == bLiveEnterRoomEffect.expireTime && this.backgroundUrlEndMargin == bLiveEnterRoomEffect.backgroundUrlEndMargin && ValueObject.util_equals(this.fixedBackgroundUrl, bLiveEnterRoomEffect.fixedBackgroundUrl) && this.animationSizeType == bLiveEnterRoomEffect.animationSizeType && this.enterVersion == bLiveEnterRoomEffect.enterVersion && ValueObject.util_equals(this.newFloatingUrl, bLiveEnterRoomEffect.newFloatingUrl) && ValueObject.util_equals(this.newResourceId, bLiveEnterRoomEffect.newResourceId) && ValueObject.util_equals(this.videoEffectExtras, bLiveEnterRoomEffect.videoEffectExtras) && ValueObject.util_equals(this.dynamicEffectExtends, bLiveEnterRoomEffect.dynamicEffectExtends);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userImage;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userNameColor;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<String> list = this.userNameGradientColors;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        String str6 = this.text;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.textColor;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.backgroundUrl;
        int iHashCode9 = (((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41) + this.backgroundGradientDirection) * 41;
        List<String> list2 = this.backgroundGradients;
        int iHashCode10 = (iHashCode9 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str9 = this.floatingUrl;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.resourceId;
        int iHashCode12 = (((((iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 41) + this.showDuration) * 41) + (this.isWealthHierarchy ? 1231 : 1237)) * 41;
        BLiveWealthHierarchys bLiveWealthHierarchys = this.hierarchys;
        int iHashCode13 = (((iHashCode12 + (bLiveWealthHierarchys != null ? bLiveWealthHierarchys.hashCode() : 0)) * 41) + this.avatarGradientDirection) * 41;
        List<String> list3 = this.avatarGradients;
        int iHashCode14 = (iHashCode13 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str11 = this.effectId;
        int iHashCode15 = (iHashCode14 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.internalText;
        int iHashCode16 = str12 != null ? str12.hashCode() : 0;
        long j = this.expireTime;
        int i3 = (((((iHashCode15 + iHashCode16) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.backgroundUrlEndMargin) * 41;
        String str13 = this.fixedBackgroundUrl;
        int iHashCode17 = (i3 + (str13 != null ? str13.hashCode() : 0)) * 41;
        long j2 = this.animationSizeType;
        int i4 = (iHashCode17 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.enterVersion;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str14 = this.newFloatingUrl;
        int iHashCode18 = (i5 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.newResourceId;
        int iHashCode19 = (iHashCode18 + (str15 != null ? str15.hashCode() : 0)) * 41;
        List<BLiveSpecialEffectResources> list4 = this.videoEffectExtras;
        int iHashCode20 = (iHashCode19 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<BLiveDynamicEffectExtend> list5 = this.dynamicEffectExtends;
        int iHashCode21 = iHashCode20 + (list5 != null ? list5.hashCode() : 0);
        this.hashCode = iHashCode21;
        return iHashCode21;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
        if (this.userNameColor == null) {
            this.userNameColor = "";
        }
        if (this.userNameGradientColors == null) {
            this.userNameGradientColors = new ArrayList();
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.backgroundUrl == null) {
            this.backgroundUrl = "";
        }
        if (this.backgroundGradients == null) {
            this.backgroundGradients = new ArrayList();
        }
        if (this.floatingUrl == null) {
            this.floatingUrl = "";
        }
        if (this.resourceId == null) {
            this.resourceId = "";
        }
        if (this.hierarchys == null) {
            this.hierarchys = BLiveWealthHierarchys.new_();
        }
        if (this.avatarGradients == null) {
            this.avatarGradients = new ArrayList();
        }
        if (this.effectId == null) {
            this.effectId = "";
        }
        if (this.internalText == null) {
            this.internalText = "";
        }
        if (this.fixedBackgroundUrl == null) {
            this.fixedBackgroundUrl = "";
        }
        if (this.newFloatingUrl == null) {
            this.newFloatingUrl = "";
        }
        if (this.newResourceId == null) {
            this.newResourceId = "";
        }
        if (this.videoEffectExtras == null) {
            this.videoEffectExtras = new ArrayList();
        }
        if (this.dynamicEffectExtends == null) {
            this.dynamicEffectExtends = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
