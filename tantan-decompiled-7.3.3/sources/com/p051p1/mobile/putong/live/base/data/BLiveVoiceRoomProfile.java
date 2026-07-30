package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomAttributes;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomHeatDesc;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleUser;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceRoomProfile extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomProfile> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomProfile>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomProfile.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomProfile newInstance() {
            return new BLiveVoiceRoomProfile();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceRoomProfile bLiveVoiceRoomProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1984535910:
                    if (str.equals("canOpenPersonal")) {
                        b = 0;
                    }
                    break;
                case -1737480435:
                    if (str.equals("settleMembersLimit")) {
                        b = 1;
                    }
                    break;
                case -1656559075:
                    if (str.equals("levelIcon")) {
                        b = 2;
                    }
                    break;
                case -1538855190:
                    if (str.equals("freeCall")) {
                        b = 3;
                    }
                    break;
                case -1101477727:
                    if (str.equals("heatDesc")) {
                        b = 4;
                    }
                    break;
                case -1101330807:
                    if (str.equals("heatIcon")) {
                        b = 5;
                    }
                    break;
                case -1101014899:
                    if (str.equals("heatSvga")) {
                        b = 6;
                    }
                    break;
                case -1093498531:
                    if (str.equals("roomClass")) {
                        b = 7;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 8;
                    }
                    break;
                case -909077801:
                    if (str.equals("freeSettle")) {
                        b = 9;
                    }
                    break;
                case -626571951:
                    if (str.equals("levelBgEndColor")) {
                        b = 10;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 11;
                    }
                    break;
                case -351778248:
                    if (str.equals("coverUrl")) {
                        b = 12;
                    }
                    break;
                case -350106230:
                    if (str.equals("isPersonal")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -198250976:
                    if (str.equals("debugText")) {
                        b = 14;
                    }
                    break;
                case -161424929:
                    if (str.equals("remindType")) {
                        b = 15;
                    }
                    break;
                case -161207671:
                    if (str.equals("coverStatus")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -135761730:
                    if (str.equals("identity")) {
                        b = 17;
                    }
                    break;
                case 3198448:
                    if (str.equals("heat")) {
                        b = 18;
                    }
                    break;
                case 102865796:
                    if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                        b = 19;
                    }
                    break;
                case 109764752:
                    if (str.equals("stick")) {
                        b = 20;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 21;
                    }
                    break;
                case 156781895:
                    if (str.equals(VirtualVoiceMotionType.announcement)) {
                        b = 22;
                    }
                    break;
                case 212101422:
                    if (str.equals("heatBgImg")) {
                        b = 23;
                    }
                    break;
                case 228825672:
                    if (str.equals("heatTitle")) {
                        b = 24;
                    }
                    break;
                case 500968223:
                    if (str.equals("publicRoomId")) {
                        b = 25;
                    }
                    break;
                case 516537450:
                    if (str.equals("titleStatus")) {
                        b = 26;
                    }
                    break;
                case 657963033:
                    if (str.equals("announcementStatus")) {
                        b = 27;
                    }
                    break;
                case 678545386:
                    if (str.equals("levelBgStartColor")) {
                        b = 28;
                    }
                    break;
                case 1241116818:
                    if (str.equals("roomAttributes")) {
                        b = 29;
                    }
                    break;
                case 1406164975:
                    if (str.equals("isSettled")) {
                        b = 30;
                    }
                    break;
                case 2069321038:
                    if (str.equals("settleMembers")) {
                        b = 31;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceRoomProfile.canOpenPersonal = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveVoiceRoomProfile.settleMembersLimit = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    bLiveVoiceRoomProfile.levelIcon = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoiceRoomProfile.freeCall = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    bLiveVoiceRoomProfile.heatDesc = JsonAdapter.parseArray(jsonParser, BLiveVoiceVirtualRoomHeatDesc.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveVoiceRoomProfile.heatIcon = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVoiceRoomProfile.heatSvga = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoiceRoomProfile.roomClass = BLiveVoiceRoomClass.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveVoiceRoomProfile.roomId = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveVoiceRoomProfile.freeSettle = jsonParser.getValueAsBoolean();
                    return true;
                case 10:
                    bLiveVoiceRoomProfile.levelBgEndColor = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoiceRoomProfile.createdTime = jsonParser.getValueAsLong();
                    return true;
                case 12:
                    bLiveVoiceRoomProfile.coverUrl = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceRoomProfile.isPersonal = jsonParser.getValueAsBoolean();
                    return true;
                case 14:
                    bLiveVoiceRoomProfile.debugText = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveVoiceRoomProfile.remindType = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveVoiceRoomProfile.coverStatus = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveVoiceRoomProfile.identity = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveVoiceRoomProfile.heat = jsonParser.getValueAsInt();
                    return true;
                case 19:
                    bLiveVoiceRoomProfile.level = jsonParser.getValueAsInt();
                    return true;
                case 20:
                    bLiveVoiceRoomProfile.stick = jsonParser.getValueAsBoolean();
                    return true;
                case 21:
                    bLiveVoiceRoomProfile.title = jsonParser.getValueAsString();
                    return true;
                case 22:
                    bLiveVoiceRoomProfile.announcement = jsonParser.getValueAsString();
                    return true;
                case 23:
                    bLiveVoiceRoomProfile.heatBgImg = jsonParser.getValueAsString();
                    return true;
                case 24:
                    bLiveVoiceRoomProfile.heatTitle = jsonParser.getValueAsString();
                    return true;
                case 25:
                    bLiveVoiceRoomProfile.publicRoomId = jsonParser.getValueAsString();
                    return true;
                case 26:
                    bLiveVoiceRoomProfile.titleStatus = jsonParser.getValueAsString();
                    return true;
                case 27:
                    bLiveVoiceRoomProfile.announcementStatus = jsonParser.getValueAsString();
                    return true;
                case 28:
                    bLiveVoiceRoomProfile.levelBgStartColor = jsonParser.getValueAsString();
                    return true;
                case 29:
                    bLiveVoiceRoomProfile.roomAttributes = JsonAdapter.parseArray(jsonParser, BLiveVoiceVirtualRoomAttributes.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    bLiveVoiceRoomProfile.isSettled = jsonParser.getValueAsBoolean();
                    return true;
                case 31:
                    bLiveVoiceRoomProfile.settleMembers = JsonAdapter.parseArray(jsonParser, BLiveVoiceVirtualRoomSettleUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomProfile bLiveVoiceRoomProfile, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoomProfile.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = bLiveVoiceRoomProfile.announcement;
            if (str2 != null) {
                jsonGenerator.writeStringField(VirtualVoiceMotionType.announcement, str2);
            }
            String str3 = bLiveVoiceRoomProfile.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            jsonGenerator.writeNumberField("createdTime", bLiveVoiceRoomProfile.createdTime);
            jsonGenerator.writeBooleanField("isPersonal", bLiveVoiceRoomProfile.isPersonal);
            jsonGenerator.writeBooleanField("freeSettle", bLiveVoiceRoomProfile.freeSettle);
            jsonGenerator.writeNumberField("settleMembersLimit", bLiveVoiceRoomProfile.settleMembersLimit);
            if (bLiveVoiceRoomProfile.settleMembers != null) {
                jsonGenerator.writeFieldName("settleMembers");
                JsonAdapter.serializeArray(bLiveVoiceRoomProfile.settleMembers, jsonGenerator, BLiveVoiceVirtualRoomSettleUser.JSON_ADAPTER);
            }
            String str4 = bLiveVoiceRoomProfile.levelIcon;
            if (str4 != null) {
                jsonGenerator.writeStringField("levelIcon", str4);
            }
            String str5 = bLiveVoiceRoomProfile.levelBgStartColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("levelBgStartColor", str5);
            }
            String str6 = bLiveVoiceRoomProfile.levelBgEndColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("levelBgEndColor", str6);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveVoiceRoomProfile.level);
            jsonGenerator.writeNumberField("heat", bLiveVoiceRoomProfile.heat);
            String str7 = bLiveVoiceRoomProfile.heatIcon;
            if (str7 != null) {
                jsonGenerator.writeStringField("heatIcon", str7);
            }
            String str8 = bLiveVoiceRoomProfile.heatTitle;
            if (str8 != null) {
                jsonGenerator.writeStringField("heatTitle", str8);
            }
            String str9 = bLiveVoiceRoomProfile.heatSvga;
            if (str9 != null) {
                jsonGenerator.writeStringField("heatSvga", str9);
            }
            String str10 = bLiveVoiceRoomProfile.heatBgImg;
            if (str10 != null) {
                jsonGenerator.writeStringField("heatBgImg", str10);
            }
            if (bLiveVoiceRoomProfile.heatDesc != null) {
                jsonGenerator.writeFieldName("heatDesc");
                JsonAdapter.serializeArray(bLiveVoiceRoomProfile.heatDesc, jsonGenerator, BLiveVoiceVirtualRoomHeatDesc.JSON_ADAPTER);
            }
            String str11 = bLiveVoiceRoomProfile.debugText;
            if (str11 != null) {
                jsonGenerator.writeStringField("debugText", str11);
            }
            String str12 = bLiveVoiceRoomProfile.remindType;
            if (str12 != null) {
                jsonGenerator.writeStringField("remindType", str12);
            }
            jsonGenerator.writeBooleanField("freeCall", bLiveVoiceRoomProfile.freeCall);
            jsonGenerator.writeBooleanField("stick", bLiveVoiceRoomProfile.stick);
            if (bLiveVoiceRoomProfile.roomClass != null) {
                jsonGenerator.writeFieldName("roomClass");
                BLiveVoiceRoomClass.JSON_ADAPTER.serialize(bLiveVoiceRoomProfile.roomClass, jsonGenerator, true);
            }
            String str13 = bLiveVoiceRoomProfile.identity;
            if (str13 != null) {
                jsonGenerator.writeStringField("identity", str13);
            }
            jsonGenerator.writeBooleanField("isSettled", bLiveVoiceRoomProfile.isSettled);
            if (bLiveVoiceRoomProfile.roomAttributes != null) {
                jsonGenerator.writeFieldName("roomAttributes");
                JsonAdapter.serializeArray(bLiveVoiceRoomProfile.roomAttributes, jsonGenerator, BLiveVoiceVirtualRoomAttributes.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("canOpenPersonal", bLiveVoiceRoomProfile.canOpenPersonal);
            String str14 = bLiveVoiceRoomProfile.titleStatus;
            if (str14 != null) {
                jsonGenerator.writeStringField("titleStatus", str14);
            }
            String str15 = bLiveVoiceRoomProfile.announcementStatus;
            if (str15 != null) {
                jsonGenerator.writeStringField("announcementStatus", str15);
            }
            String str16 = bLiveVoiceRoomProfile.publicRoomId;
            if (str16 != null) {
                jsonGenerator.writeStringField("publicRoomId", str16);
            }
            String str17 = bLiveVoiceRoomProfile.coverUrl;
            if (str17 != null) {
                jsonGenerator.writeStringField("coverUrl", str17);
            }
            String str18 = bLiveVoiceRoomProfile.coverStatus;
            if (str18 != null) {
                jsonGenerator.writeStringField("coverStatus", str18);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String STATE_DEFAULT = "default";
    public static final String STATE_DELETED = "deleted";
    public static final String STATE_PENDING = "pending";
    public static final String TYPE = "blivevoiceroomprofile";

    @NonNull
    @ProtobufIndex(index = 2)
    public String announcement;

    @NonNull
    @ProtobufIndex(index = 29)
    public String announcementStatus;

    @ProtobufIndex(index = 27)
    public boolean canOpenPersonal = true;

    @NonNull
    @ProtobufIndex(index = 32)
    public String coverStatus;

    @NonNull
    @ProtobufIndex(index = 31)
    public String coverUrl;

    @ProtobufIndex(index = 4)
    public long createdTime;

    @NonNull
    @ProtobufIndex(index = 19)
    public String debugText;

    @ProtobufIndex(index = 21)
    public boolean freeCall;

    @ProtobufIndex(index = 6)
    public boolean freeSettle;

    @ProtobufIndex(index = 11)
    public int heat;

    @NonNull
    @ProtobufIndex(index = 15)
    public String heatBgImg;

    @NonNull
    @ProtobufIndex(index = 16)
    public List<BLiveVoiceVirtualRoomHeatDesc> heatDesc;

    @NonNull
    @ProtobufIndex(index = 12)
    public String heatIcon;

    @NonNull
    @ProtobufIndex(index = 14)
    public String heatSvga;

    @NonNull
    @ProtobufIndex(index = 13)
    public String heatTitle;

    @NonNull
    @ProtobufIndex(index = 24)
    public String identity;

    @ProtobufIndex(index = 5)
    public boolean isPersonal;

    @ProtobufIndex(index = 25)
    public boolean isSettled;

    @ProtobufIndex(index = 10)
    public int level;

    @NonNull
    @ProtobufIndex(index = 18)
    public String levelBgEndColor;

    @NonNull
    @ProtobufIndex(index = 17)
    public String levelBgStartColor;

    @NonNull
    @ProtobufIndex(index = 9)
    public String levelIcon;

    @NonNull
    @ProtobufIndex(index = 30)
    public String publicRoomId;

    @NonNull
    @ProtobufIndex(index = 20)
    public String remindType;

    @NonNull
    @ProtobufIndex(index = 26)
    public List<BLiveVoiceVirtualRoomAttributes> roomAttributes;

    @NonNull
    @ProtobufIndex(index = 23)
    public BLiveVoiceRoomClass roomClass;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BLiveVoiceVirtualRoomSettleUser> settleMembers;

    @ProtobufIndex(index = 7)
    public int settleMembersLimit;

    @ProtobufIndex(index = 22)
    public boolean stick;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @NonNull
    @ProtobufIndex(index = 28)
    public String titleStatus;

    public static final boolean isStatePending(String str) {
        return TextUtils.equals(str, "pending");
    }

    public static BLiveVoiceRoomProfile new_() {
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = new BLiveVoiceRoomProfile();
        bLiveVoiceRoomProfile.nullCheck();
        return bLiveVoiceRoomProfile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomProfile mo225055clone() {
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = new BLiveVoiceRoomProfile();
        bLiveVoiceRoomProfile.roomId = this.roomId;
        bLiveVoiceRoomProfile.announcement = this.announcement;
        bLiveVoiceRoomProfile.title = this.title;
        bLiveVoiceRoomProfile.createdTime = this.createdTime;
        bLiveVoiceRoomProfile.isPersonal = this.isPersonal;
        bLiveVoiceRoomProfile.freeSettle = this.freeSettle;
        bLiveVoiceRoomProfile.settleMembersLimit = this.settleMembersLimit;
        List<BLiveVoiceVirtualRoomSettleUser> list = this.settleMembers;
        if (list != null) {
            bLiveVoiceRoomProfile.settleMembers = ValueObject.util_map(list, new qcj() { // from class: l.aa2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceVirtualRoomSettleUser) obj).mo225055clone();
                }
            });
        }
        bLiveVoiceRoomProfile.levelIcon = this.levelIcon;
        bLiveVoiceRoomProfile.levelBgStartColor = this.levelBgStartColor;
        bLiveVoiceRoomProfile.levelBgEndColor = this.levelBgEndColor;
        bLiveVoiceRoomProfile.level = this.level;
        bLiveVoiceRoomProfile.heat = this.heat;
        bLiveVoiceRoomProfile.heatIcon = this.heatIcon;
        bLiveVoiceRoomProfile.heatTitle = this.heatTitle;
        bLiveVoiceRoomProfile.heatSvga = this.heatSvga;
        bLiveVoiceRoomProfile.heatBgImg = this.heatBgImg;
        List<BLiveVoiceVirtualRoomHeatDesc> list2 = this.heatDesc;
        if (list2 != null) {
            bLiveVoiceRoomProfile.heatDesc = ValueObject.util_map(list2, new qcj() { // from class: l.ba2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceVirtualRoomHeatDesc) obj).mo225055clone();
                }
            });
        }
        bLiveVoiceRoomProfile.debugText = this.debugText;
        bLiveVoiceRoomProfile.remindType = this.remindType;
        bLiveVoiceRoomProfile.freeCall = this.freeCall;
        bLiveVoiceRoomProfile.stick = this.stick;
        BLiveVoiceRoomClass bLiveVoiceRoomClass = this.roomClass;
        if (bLiveVoiceRoomClass != null) {
            bLiveVoiceRoomProfile.roomClass = bLiveVoiceRoomClass.mo225055clone();
        }
        bLiveVoiceRoomProfile.identity = this.identity;
        bLiveVoiceRoomProfile.isSettled = this.isSettled;
        List<BLiveVoiceVirtualRoomAttributes> list3 = this.roomAttributes;
        if (list3 != null) {
            bLiveVoiceRoomProfile.roomAttributes = ValueObject.util_map(list3, new qcj() { // from class: l.ca2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceVirtualRoomAttributes) obj).mo225055clone();
                }
            });
        }
        bLiveVoiceRoomProfile.canOpenPersonal = this.canOpenPersonal;
        bLiveVoiceRoomProfile.titleStatus = this.titleStatus;
        bLiveVoiceRoomProfile.announcementStatus = this.announcementStatus;
        bLiveVoiceRoomProfile.publicRoomId = this.publicRoomId;
        bLiveVoiceRoomProfile.coverUrl = this.coverUrl;
        bLiveVoiceRoomProfile.coverStatus = this.coverStatus;
        return bLiveVoiceRoomProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomProfile)) {
            return false;
        }
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = (BLiveVoiceRoomProfile) obj;
        return ValueObject.util_equals(this.roomId, bLiveVoiceRoomProfile.roomId) && ValueObject.util_equals(this.announcement, bLiveVoiceRoomProfile.announcement) && ValueObject.util_equals(this.title, bLiveVoiceRoomProfile.title) && this.createdTime == bLiveVoiceRoomProfile.createdTime && this.isPersonal == bLiveVoiceRoomProfile.isPersonal && this.freeSettle == bLiveVoiceRoomProfile.freeSettle && this.settleMembersLimit == bLiveVoiceRoomProfile.settleMembersLimit && ValueObject.util_equals(this.settleMembers, bLiveVoiceRoomProfile.settleMembers) && ValueObject.util_equals(this.levelIcon, bLiveVoiceRoomProfile.levelIcon) && ValueObject.util_equals(this.levelBgStartColor, bLiveVoiceRoomProfile.levelBgStartColor) && ValueObject.util_equals(this.levelBgEndColor, bLiveVoiceRoomProfile.levelBgEndColor) && this.level == bLiveVoiceRoomProfile.level && this.heat == bLiveVoiceRoomProfile.heat && ValueObject.util_equals(this.heatIcon, bLiveVoiceRoomProfile.heatIcon) && ValueObject.util_equals(this.heatTitle, bLiveVoiceRoomProfile.heatTitle) && ValueObject.util_equals(this.heatSvga, bLiveVoiceRoomProfile.heatSvga) && ValueObject.util_equals(this.heatBgImg, bLiveVoiceRoomProfile.heatBgImg) && ValueObject.util_equals(this.heatDesc, bLiveVoiceRoomProfile.heatDesc) && ValueObject.util_equals(this.debugText, bLiveVoiceRoomProfile.debugText) && ValueObject.util_equals(this.remindType, bLiveVoiceRoomProfile.remindType) && this.freeCall == bLiveVoiceRoomProfile.freeCall && this.stick == bLiveVoiceRoomProfile.stick && ValueObject.util_equals(this.roomClass, bLiveVoiceRoomProfile.roomClass) && ValueObject.util_equals(this.identity, bLiveVoiceRoomProfile.identity) && this.isSettled == bLiveVoiceRoomProfile.isSettled && ValueObject.util_equals(this.roomAttributes, bLiveVoiceRoomProfile.roomAttributes) && this.canOpenPersonal == bLiveVoiceRoomProfile.canOpenPersonal && ValueObject.util_equals(this.titleStatus, bLiveVoiceRoomProfile.titleStatus) && ValueObject.util_equals(this.announcementStatus, bLiveVoiceRoomProfile.announcementStatus) && ValueObject.util_equals(this.publicRoomId, bLiveVoiceRoomProfile.publicRoomId) && ValueObject.util_equals(this.coverUrl, bLiveVoiceRoomProfile.coverUrl) && ValueObject.util_equals(this.coverStatus, bLiveVoiceRoomProfile.coverStatus);
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
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.announcement;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.createdTime;
        int i3 = (((((((((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.isPersonal ? 1231 : 1237)) * 41) + (this.freeSettle ? 1231 : 1237)) * 41) + this.settleMembersLimit) * 41;
        List<BLiveVoiceVirtualRoomSettleUser> list = this.settleMembers;
        int iHashCode4 = (i3 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.levelIcon;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.levelBgStartColor;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.levelBgEndColor;
        int iHashCode7 = (((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.level) * 41) + this.heat) * 41;
        String str7 = this.heatIcon;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.heatTitle;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.heatSvga;
        int iHashCode10 = (iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.heatBgImg;
        int iHashCode11 = (iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 41;
        List<BLiveVoiceVirtualRoomHeatDesc> list2 = this.heatDesc;
        int iHashCode12 = (iHashCode11 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str11 = this.debugText;
        int iHashCode13 = (iHashCode12 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.remindType;
        int iHashCode14 = (((((iHashCode13 + (str12 != null ? str12.hashCode() : 0)) * 41) + (this.freeCall ? 1231 : 1237)) * 41) + (this.stick ? 1231 : 1237)) * 41;
        BLiveVoiceRoomClass bLiveVoiceRoomClass = this.roomClass;
        int iHashCode15 = (iHashCode14 + (bLiveVoiceRoomClass != null ? bLiveVoiceRoomClass.hashCode() : 0)) * 41;
        String str13 = this.identity;
        int iHashCode16 = (((iHashCode15 + (str13 != null ? str13.hashCode() : 0)) * 41) + (this.isSettled ? 1231 : 1237)) * 41;
        List<BLiveVoiceVirtualRoomAttributes> list3 = this.roomAttributes;
        int iHashCode17 = (((iHashCode16 + (list3 != null ? list3.hashCode() : 0)) * 41) + (this.canOpenPersonal ? 1231 : 1237)) * 41;
        String str14 = this.titleStatus;
        int iHashCode18 = (iHashCode17 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.announcementStatus;
        int iHashCode19 = (iHashCode18 + (str15 != null ? str15.hashCode() : 0)) * 41;
        String str16 = this.publicRoomId;
        int iHashCode20 = (iHashCode19 + (str16 != null ? str16.hashCode() : 0)) * 41;
        String str17 = this.coverUrl;
        int iHashCode21 = (iHashCode20 + (str17 != null ? str17.hashCode() : 0)) * 41;
        String str18 = this.coverStatus;
        int iHashCode22 = iHashCode21 + (str18 != null ? str18.hashCode() : 0);
        this.hashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.announcement == null) {
            this.announcement = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.settleMembers == null) {
            this.settleMembers = new ArrayList();
        }
        if (this.levelIcon == null) {
            this.levelIcon = "";
        }
        if (this.levelBgStartColor == null) {
            this.levelBgStartColor = "";
        }
        if (this.levelBgEndColor == null) {
            this.levelBgEndColor = "";
        }
        if (this.heatIcon == null) {
            this.heatIcon = "";
        }
        if (this.heatTitle == null) {
            this.heatTitle = "";
        }
        if (this.heatSvga == null) {
            this.heatSvga = "";
        }
        if (this.heatBgImg == null) {
            this.heatBgImg = "";
        }
        if (this.heatDesc == null) {
            this.heatDesc = new ArrayList();
        }
        if (this.debugText == null) {
            this.debugText = "";
        }
        if (this.remindType == null) {
            this.remindType = "";
        }
        if (this.roomClass == null) {
            this.roomClass = BLiveVoiceRoomClass.new_();
        }
        if (this.identity == null) {
            this.identity = "";
        }
        if (this.roomAttributes == null) {
            this.roomAttributes = new ArrayList();
        }
        if (this.titleStatus == null) {
            this.titleStatus = "";
        }
        if (this.announcementStatus == null) {
            this.announcementStatus = "";
        }
        if (this.publicRoomId == null) {
            this.publicRoomId = "";
        }
        if (this.coverUrl == null) {
            this.coverUrl = "";
        }
        if (this.coverStatus == null) {
            this.coverStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
