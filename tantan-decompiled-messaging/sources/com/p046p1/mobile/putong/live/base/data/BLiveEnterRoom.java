package com.p046p1.mobile.putong.live.base.data;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
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
public class BLiveEnterRoom extends ValueObject implements Cloneable, Serializable {
    public static long ENTER_EFFECT_V0 = 0;
    public static long ENTER_EFFECT_V1 = 1;
    public static long ENTER_EFFECT_V2 = 2;
    public static long ENTER_EFFECT_V3 = 3;
    public static long ENTER_EFFECT_V4 = 4;
    public static JsonAdapter<BLiveEnterRoom> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEnterRoom>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEnterRoom.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEnterRoom.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEnterRoom newInstance() {
            return new BLiveEnterRoom();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveEnterRoom bLiveEnterRoom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2101232695:
                    if (str.equals("dynamicEffectExtends")) {
                        b = 0;
                    }
                    break;
                case -1860123059:
                    if (str.equals("fixedBackgroundUrl")) {
                        b = 1;
                    }
                    break;
                case -1607531000:
                    if (str.equals("backgroundUrlEndMargin")) {
                        b = 2;
                    }
                    break;
                case -1539550337:
                    if (str.equals("enterRoomEffectId")) {
                        b = 3;
                    }
                    break;
                case -1345650231:
                    if (str.equals("resourceId")) {
                        b = 4;
                    }
                    break;
                case -1123095539:
                    if (str.equals("userNameColor")) {
                        b = 5;
                    }
                    break;
                case -1044044306:
                    if (str.equals("floatBgUrl")) {
                        b = 6;
                    }
                    break;
                case -1017208180:
                    if (str.equals("effectId")) {
                        b = 7;
                    }
                    break;
                case -1016963242:
                    if (str.equals("userNameGradientColors")) {
                        b = 8;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 9;
                    }
                    break;
                case -674055735:
                    if (str.equals("newFloatingUrl")) {
                        b = 10;
                    }
                    break;
                case -549278283:
                    if (str.equals("backgroundGradients")) {
                        b = 11;
                    }
                    break;
                case -498139255:
                    if (str.equals("newResourceId")) {
                        b = 12;
                    }
                    break;
                case -389150394:
                    if (str.equals(RXScreenCaptureService.KEY_CONTENT_TEXT)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -300561696:
                    if (str.equals("enterVersion")) {
                        b = 14;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 15;
                    }
                    break;
                case 115792:
                    if (str.equals(Oauth2AccessToken.KEY_UID)) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 93658858:
                    if (str.equals("bgUrl")) {
                        b = 17;
                    }
                    break;
                case 317295308:
                    if (str.equals("userGrade")) {
                        b = 18;
                    }
                    break;
                case 318993488:
                    if (str.equals("userImage")) {
                        b = 19;
                    }
                    break;
                case 443676005:
                    if (str.equals("userGradeIcon")) {
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
                case 1055330749:
                    if (str.equals("contentTextColor")) {
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
                    bLiveEnterRoom.dynamicEffectExtends = JsonAdapter.parseArray(jsonParser, BLiveDynamicEffectExtend.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveEnterRoom.fixedBackgroundUrl = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveEnterRoom.backgroundUrlEndMargin = jsonParser.getValueAsLong();
                    return true;
                case 3:
                    bLiveEnterRoom.enterRoomEffectId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveEnterRoom.resourceId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveEnterRoom.userNameColor = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveEnterRoom.floatBgUrl = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveEnterRoom.effectId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveEnterRoom.userNameGradientColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveEnterRoom.roomId = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveEnterRoom.newFloatingUrl = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveEnterRoom.backgroundGradients = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveEnterRoom.newResourceId = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveEnterRoom.contentText = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveEnterRoom.enterVersion = jsonParser.getValueAsLong();
                    return true;
                case 15:
                    bLiveEnterRoom.userName = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveEnterRoom.uid = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveEnterRoom.bgUrl = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveEnterRoom.userGrade = jsonParser.getValueAsLong();
                    return true;
                case 19:
                    bLiveEnterRoom.userImage = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveEnterRoom.userGradeIcon = jsonParser.getValueAsString();
                    return true;
                case 21:
                    bLiveEnterRoom.videoEffectExtras = JsonAdapter.parseArray(jsonParser, BLiveSpecialEffectResources.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveEnterRoom.avatarGradientDirection = jsonParser.getValueAsInt();
                    return true;
                case 23:
                    bLiveEnterRoom.backgroundGradientDirection = jsonParser.getValueAsInt();
                    return true;
                case 24:
                    bLiveEnterRoom.contentTextColor = jsonParser.getValueAsString();
                    return true;
                case 25:
                    bLiveEnterRoom.animationSizeType = jsonParser.getValueAsLong();
                    return true;
                case 26:
                    bLiveEnterRoom.avatarGradients = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    bLiveEnterRoom.showDuration = jsonParser.getValueAsLong();
                    return true;
                case 28:
                    bLiveEnterRoom.isWealthHierarchy = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEnterRoom bLiveEnterRoom, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveEnterRoom.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = bLiveEnterRoom.uid;
            if (str2 != null) {
                jsonGenerator.writeStringField(Oauth2AccessToken.KEY_UID, str2);
            }
            String str3 = bLiveEnterRoom.userName;
            if (str3 != null) {
                jsonGenerator.writeStringField("userName", str3);
            }
            String str4 = bLiveEnterRoom.userNameColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("userNameColor", str4);
            }
            if (bLiveEnterRoom.userNameGradientColors != null) {
                jsonGenerator.writeFieldName("userNameGradientColors");
                JsonAdapter.serializeArray(bLiveEnterRoom.userNameGradientColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = bLiveEnterRoom.userImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("userImage", str5);
            }
            jsonGenerator.writeNumberField("userGrade", bLiveEnterRoom.userGrade);
            String str6 = bLiveEnterRoom.userGradeIcon;
            if (str6 != null) {
                jsonGenerator.writeStringField("userGradeIcon", str6);
            }
            String str7 = bLiveEnterRoom.contentText;
            if (str7 != null) {
                jsonGenerator.writeStringField(RXScreenCaptureService.KEY_CONTENT_TEXT, str7);
            }
            String str8 = bLiveEnterRoom.contentTextColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("contentTextColor", str8);
            }
            String str9 = bLiveEnterRoom.bgUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("bgUrl", str9);
            }
            String str10 = bLiveEnterRoom.floatBgUrl;
            if (str10 != null) {
                jsonGenerator.writeStringField("floatBgUrl", str10);
            }
            String str11 = bLiveEnterRoom.effectId;
            if (str11 != null) {
                jsonGenerator.writeStringField("effectId", str11);
            }
            jsonGenerator.writeNumberField("showDuration", bLiveEnterRoom.showDuration);
            jsonGenerator.writeBooleanField("isWealthHierarchy", bLiveEnterRoom.isWealthHierarchy);
            jsonGenerator.writeNumberField("avatarGradientDirection", bLiveEnterRoom.avatarGradientDirection);
            if (bLiveEnterRoom.avatarGradients != null) {
                jsonGenerator.writeFieldName("avatarGradients");
                JsonAdapter.serializeArray(bLiveEnterRoom.avatarGradients, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("backgroundGradientDirection", bLiveEnterRoom.backgroundGradientDirection);
            if (bLiveEnterRoom.backgroundGradients != null) {
                jsonGenerator.writeFieldName("backgroundGradients");
                JsonAdapter.serializeArray(bLiveEnterRoom.backgroundGradients, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str12 = bLiveEnterRoom.enterRoomEffectId;
            if (str12 != null) {
                jsonGenerator.writeStringField("enterRoomEffectId", str12);
            }
            jsonGenerator.writeNumberField("backgroundUrlEndMargin", bLiveEnterRoom.backgroundUrlEndMargin);
            String str13 = bLiveEnterRoom.fixedBackgroundUrl;
            if (str13 != null) {
                jsonGenerator.writeStringField("fixedBackgroundUrl", str13);
            }
            jsonGenerator.writeNumberField("animationSizeType", bLiveEnterRoom.animationSizeType);
            jsonGenerator.writeNumberField("enterVersion", bLiveEnterRoom.enterVersion);
            String str14 = bLiveEnterRoom.newFloatingUrl;
            if (str14 != null) {
                jsonGenerator.writeStringField("newFloatingUrl", str14);
            }
            String str15 = bLiveEnterRoom.newResourceId;
            if (str15 != null) {
                jsonGenerator.writeStringField("newResourceId", str15);
            }
            if (bLiveEnterRoom.videoEffectExtras != null) {
                jsonGenerator.writeFieldName("videoEffectExtras");
                JsonAdapter.serializeArray(bLiveEnterRoom.videoEffectExtras, jsonGenerator, BLiveSpecialEffectResources.JSON_ADAPTER);
            }
            String str16 = bLiveEnterRoom.resourceId;
            if (str16 != null) {
                jsonGenerator.writeStringField("resourceId", str16);
            }
            if (bLiveEnterRoom.dynamicEffectExtends != null) {
                jsonGenerator.writeFieldName("dynamicEffectExtends");
                JsonAdapter.serializeArray(bLiveEnterRoom.dynamicEffectExtends, jsonGenerator, BLiveDynamicEffectExtend.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEnterRoom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveenterroom";

    @ProtobufIndex(index = 22)
    public long animationSizeType;

    @ProtobufIndex(index = 15)
    public int avatarGradientDirection;

    @NonNull
    @ProtobufIndex(index = 16)
    public List<String> avatarGradients;

    @ProtobufIndex(index = 17)
    public int backgroundGradientDirection;

    @NonNull
    @ProtobufIndex(index = 18)
    public List<String> backgroundGradients;

    @ProtobufIndex(index = 20)
    public long backgroundUrlEndMargin;

    @NonNull
    @ProtobufIndex(index = 10)
    public String bgUrl;

    @NonNull
    @ProtobufIndex(index = 8)
    public String contentText;

    @NonNull
    @ProtobufIndex(index = 9)
    public String contentTextColor;

    @NonNull
    @ProtobufIndex(index = 28)
    public List<BLiveDynamicEffectExtend> dynamicEffectExtends;

    @NonNull
    @ProtobufIndex(index = 12)
    public String effectId;

    @NonNull
    @ProtobufIndex(index = 19)
    public String enterRoomEffectId;

    @ProtobufIndex(index = 23)
    public long enterVersion;

    @NonNull
    @ProtobufIndex(index = 21)
    public String fixedBackgroundUrl;

    @NonNull
    @ProtobufIndex(index = 11)
    public String floatBgUrl;

    @ProtobufIndex(index = 14)
    public boolean isWealthHierarchy;

    @NonNull
    @ProtobufIndex(index = 25)
    public String newFloatingUrl;

    @NonNull
    @ProtobufIndex(index = 24)
    public String newResourceId;

    @NonNull
    @ProtobufIndex(index = 27)
    public String resourceId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    @ProtobufIndex(index = 13)
    public long showDuration;

    @NonNull
    @ProtobufIndex(index = 2)
    public String uid;

    @ProtobufIndex(index = 6)
    public long userGrade;

    @NonNull
    @ProtobufIndex(index = 7)
    public String userGradeIcon;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userImage;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userName;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userNameColor;

    @NonNull
    @ProtobufIndex(index = 29)
    public List<String> userNameGradientColors;

    @NonNull
    @ProtobufIndex(index = 26)
    public List<BLiveSpecialEffectResources> videoEffectExtras;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m67929b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m67930c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m67931d(String str) {
        return str;
    }

    public static BLiveEnterRoom new_() {
        BLiveEnterRoom bLiveEnterRoom = new BLiveEnterRoom();
        bLiveEnterRoom.nullCheck();
        return bLiveEnterRoom;
    }

    public void checkDefaultColor() {
        if (TextUtils.isEmpty(this.userNameColor)) {
            this.userNameColor = "ffffff";
        }
        if (TextUtils.isEmpty(this.contentTextColor)) {
            this.contentTextColor = "ffffff";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEnterRoom mo223809clone() {
        BLiveEnterRoom bLiveEnterRoom = new BLiveEnterRoom();
        bLiveEnterRoom.roomId = this.roomId;
        bLiveEnterRoom.uid = this.uid;
        bLiveEnterRoom.userName = this.userName;
        bLiveEnterRoom.userNameColor = this.userNameColor;
        List<String> list = this.userNameGradientColors;
        if (list != null) {
            bLiveEnterRoom.userNameGradientColors = ValueObject.util_map(list, new w9j() { // from class: l.zy1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveEnterRoom.m67929b((String) obj);
                }
            });
        }
        bLiveEnterRoom.userImage = this.userImage;
        bLiveEnterRoom.userGrade = this.userGrade;
        bLiveEnterRoom.userGradeIcon = this.userGradeIcon;
        bLiveEnterRoom.contentText = this.contentText;
        bLiveEnterRoom.contentTextColor = this.contentTextColor;
        bLiveEnterRoom.bgUrl = this.bgUrl;
        bLiveEnterRoom.floatBgUrl = this.floatBgUrl;
        bLiveEnterRoom.effectId = this.effectId;
        bLiveEnterRoom.showDuration = this.showDuration;
        bLiveEnterRoom.isWealthHierarchy = this.isWealthHierarchy;
        bLiveEnterRoom.avatarGradientDirection = this.avatarGradientDirection;
        List<String> list2 = this.avatarGradients;
        if (list2 != null) {
            bLiveEnterRoom.avatarGradients = ValueObject.util_map(list2, new w9j() { // from class: l.az1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveEnterRoom.m67931d((String) obj);
                }
            });
        }
        bLiveEnterRoom.backgroundGradientDirection = this.backgroundGradientDirection;
        List<String> list3 = this.backgroundGradients;
        if (list3 != null) {
            bLiveEnterRoom.backgroundGradients = ValueObject.util_map(list3, new w9j() { // from class: l.bz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveEnterRoom.m67930c((String) obj);
                }
            });
        }
        bLiveEnterRoom.enterRoomEffectId = this.enterRoomEffectId;
        bLiveEnterRoom.backgroundUrlEndMargin = this.backgroundUrlEndMargin;
        bLiveEnterRoom.fixedBackgroundUrl = this.fixedBackgroundUrl;
        bLiveEnterRoom.animationSizeType = this.animationSizeType;
        bLiveEnterRoom.enterVersion = this.enterVersion;
        bLiveEnterRoom.newFloatingUrl = this.newFloatingUrl;
        bLiveEnterRoom.newResourceId = this.newResourceId;
        List<BLiveSpecialEffectResources> list4 = this.videoEffectExtras;
        if (list4 != null) {
            bLiveEnterRoom.videoEffectExtras = ValueObject.util_map(list4, new w9j() { // from class: l.cz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSpecialEffectResources) obj).mo223809clone();
                }
            });
        }
        bLiveEnterRoom.resourceId = this.resourceId;
        List<BLiveDynamicEffectExtend> list5 = this.dynamicEffectExtends;
        if (list5 != null) {
            bLiveEnterRoom.dynamicEffectExtends = ValueObject.util_map(list5, new w9j() { // from class: l.dz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveDynamicEffectExtend) obj).mo223809clone();
                }
            });
        }
        return bLiveEnterRoom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEnterRoom)) {
            return false;
        }
        BLiveEnterRoom bLiveEnterRoom = (BLiveEnterRoom) obj;
        return ValueObject.util_equals(this.roomId, bLiveEnterRoom.roomId) && ValueObject.util_equals(this.uid, bLiveEnterRoom.uid) && ValueObject.util_equals(this.userName, bLiveEnterRoom.userName) && ValueObject.util_equals(this.userNameColor, bLiveEnterRoom.userNameColor) && ValueObject.util_equals(this.userNameGradientColors, bLiveEnterRoom.userNameGradientColors) && ValueObject.util_equals(this.userImage, bLiveEnterRoom.userImage) && this.userGrade == bLiveEnterRoom.userGrade && ValueObject.util_equals(this.userGradeIcon, bLiveEnterRoom.userGradeIcon) && ValueObject.util_equals(this.contentText, bLiveEnterRoom.contentText) && ValueObject.util_equals(this.contentTextColor, bLiveEnterRoom.contentTextColor) && ValueObject.util_equals(this.bgUrl, bLiveEnterRoom.bgUrl) && ValueObject.util_equals(this.floatBgUrl, bLiveEnterRoom.floatBgUrl) && ValueObject.util_equals(this.effectId, bLiveEnterRoom.effectId) && this.showDuration == bLiveEnterRoom.showDuration && this.isWealthHierarchy == bLiveEnterRoom.isWealthHierarchy && this.avatarGradientDirection == bLiveEnterRoom.avatarGradientDirection && ValueObject.util_equals(this.avatarGradients, bLiveEnterRoom.avatarGradients) && this.backgroundGradientDirection == bLiveEnterRoom.backgroundGradientDirection && ValueObject.util_equals(this.backgroundGradients, bLiveEnterRoom.backgroundGradients) && ValueObject.util_equals(this.enterRoomEffectId, bLiveEnterRoom.enterRoomEffectId) && this.backgroundUrlEndMargin == bLiveEnterRoom.backgroundUrlEndMargin && ValueObject.util_equals(this.fixedBackgroundUrl, bLiveEnterRoom.fixedBackgroundUrl) && this.animationSizeType == bLiveEnterRoom.animationSizeType && this.enterVersion == bLiveEnterRoom.enterVersion && ValueObject.util_equals(this.newFloatingUrl, bLiveEnterRoom.newFloatingUrl) && ValueObject.util_equals(this.newResourceId, bLiveEnterRoom.newResourceId) && ValueObject.util_equals(this.videoEffectExtras, bLiveEnterRoom.videoEffectExtras) && ValueObject.util_equals(this.resourceId, bLiveEnterRoom.resourceId) && ValueObject.util_equals(this.dynamicEffectExtends, bLiveEnterRoom.dynamicEffectExtends);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getContentText(Context context) {
        return TextUtils.isEmpty(this.contentText) ? context.getResources().getString(R$string.f44215w) : this.contentText;
    }

    public String getMixResId() {
        return this.enterVersion == ENTER_EFFECT_V0 ? this.resourceId : this.newResourceId;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.uid;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userNameColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.userNameGradientColors;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        String str5 = this.userImage;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        long j = this.userGrade;
        int i3 = (((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str6 = this.userGradeIcon;
        int iHashCode7 = (i3 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.contentText;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.contentTextColor;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.bgUrl;
        int iHashCode10 = (iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.floatBgUrl;
        int iHashCode11 = (iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.effectId;
        int iHashCode12 = (iHashCode11 + (str11 != null ? str11.hashCode() : 0)) * 41;
        long j2 = this.showDuration;
        int i4 = (((((iHashCode12 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + (this.isWealthHierarchy ? 1231 : 1237)) * 41) + this.avatarGradientDirection) * 41;
        List<String> list2 = this.avatarGradients;
        int iHashCode13 = (((i4 + (list2 != null ? list2.hashCode() : 0)) * 41) + this.backgroundGradientDirection) * 41;
        List<String> list3 = this.backgroundGradients;
        int iHashCode14 = (iHashCode13 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str12 = this.enterRoomEffectId;
        int iHashCode15 = (iHashCode14 + (str12 != null ? str12.hashCode() : 0)) * 41;
        long j3 = this.backgroundUrlEndMargin;
        int i5 = (iHashCode15 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str13 = this.fixedBackgroundUrl;
        int iHashCode16 = (i5 + (str13 != null ? str13.hashCode() : 0)) * 41;
        long j4 = this.animationSizeType;
        int i6 = (iHashCode16 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        long j5 = this.enterVersion;
        int i7 = (i6 + ((int) (j5 ^ (j5 >>> 32)))) * 41;
        String str14 = this.newFloatingUrl;
        int iHashCode17 = (i7 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.newResourceId;
        int iHashCode18 = (iHashCode17 + (str15 != null ? str15.hashCode() : 0)) * 41;
        List<BLiveSpecialEffectResources> list4 = this.videoEffectExtras;
        int iHashCode19 = (iHashCode18 + (list4 != null ? list4.hashCode() : 0)) * 41;
        String str16 = this.resourceId;
        int iHashCode20 = (iHashCode19 + (str16 != null ? str16.hashCode() : 0)) * 41;
        List<BLiveDynamicEffectExtend> list5 = this.dynamicEffectExtends;
        int iHashCode21 = iHashCode20 + (list5 != null ? list5.hashCode() : 0);
        this.hashCode = iHashCode21;
        return iHashCode21;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.uid == null) {
            this.uid = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userNameColor == null) {
            this.userNameColor = "";
        }
        if (this.userNameGradientColors == null) {
            this.userNameGradientColors = new ArrayList();
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
        if (this.userGradeIcon == null) {
            this.userGradeIcon = "";
        }
        if (this.contentText == null) {
            this.contentText = "";
        }
        if (this.contentTextColor == null) {
            this.contentTextColor = "";
        }
        if (this.bgUrl == null) {
            this.bgUrl = "";
        }
        if (this.floatBgUrl == null) {
            this.floatBgUrl = "";
        }
        if (this.effectId == null) {
            this.effectId = "";
        }
        if (this.avatarGradients == null) {
            this.avatarGradients = new ArrayList();
        }
        if (this.backgroundGradients == null) {
            this.backgroundGradients = new ArrayList();
        }
        if (this.enterRoomEffectId == null) {
            this.enterRoomEffectId = "";
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
        if (this.resourceId == null) {
            this.resourceId = "";
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
