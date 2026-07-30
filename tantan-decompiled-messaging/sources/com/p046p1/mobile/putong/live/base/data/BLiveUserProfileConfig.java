package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
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
public class BLiveUserProfileConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserProfileConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserProfileConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserProfileConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserProfileConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserProfileConfig newInstance() {
            return new BLiveUserProfileConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveUserProfileConfig bLiveUserProfileConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1461215824:
                    if (str.equals("isBeautifulNumber")) {
                        b = 0;
                    }
                    break;
                case -1041364720:
                    if (str.equals("jumpConfig")) {
                        b = 1;
                    }
                    break;
                case -768013207:
                    if (str.equals("showGiftWallEntranceV2")) {
                        b = 2;
                    }
                    break;
                case -609685067:
                    if (str.equals("isUserInFanbaseGroup")) {
                        b = 3;
                    }
                    break;
                case -338815017:
                    if (str.equals("showType")) {
                        b = 4;
                    }
                    break;
                case -63368947:
                    if (str.equals("showGiftWallEntrance")) {
                        b = 5;
                    }
                    break;
                case 131578272:
                    if (str.equals("isHiddenUserHierachy")) {
                        b = 6;
                    }
                    break;
                case 242579691:
                    if (str.equals("contributionListShow")) {
                        b = 7;
                    }
                    break;
                case 389804426:
                    if (str.equals("isHiddenAnchorHierachy")) {
                        b = 8;
                    }
                    break;
                case 594571390:
                    if (str.equals("showGuardEntrance")) {
                        b = 9;
                    }
                    break;
                case 798226580:
                    if (str.equals("familyCard")) {
                        b = 10;
                    }
                    break;
                case 884351711:
                    if (str.equals("blockStatus")) {
                        b = 11;
                    }
                    break;
                case 905809428:
                    if (str.equals("enableNewPrivilege")) {
                        b = 12;
                    }
                    break;
                case 1245357109:
                    if (str.equals("hasFanbaseGroup")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 2060110747:
                    if (str.equals("isGuard")) {
                        b = 14;
                    }
                    break;
                case 2115146293:
                    if (str.equals("hierarchy")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveUserProfileConfig.isBeautifulNumber = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveUserProfileConfig.jumpConfig = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveUserProfileConfig.showGiftWallEntranceV2 = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    bLiveUserProfileConfig.isUserInFanbaseGroup = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    bLiveUserProfileConfig.showType = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveUserProfileConfig.showGiftWallEntrance = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    bLiveUserProfileConfig.isHiddenUserHierachy = jsonParser.getValueAsBoolean();
                    return true;
                case 7:
                    bLiveUserProfileConfig.contributionListShow = jsonParser.getValueAsBoolean();
                    return true;
                case 8:
                    bLiveUserProfileConfig.isHiddenAnchorHierachy = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    bLiveUserProfileConfig.showGuardEntrance = jsonParser.getValueAsBoolean();
                    return true;
                case 10:
                    bLiveUserProfileConfig.familyCard = BLiveUserFamilyCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveUserProfileConfig.blockStatus = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveUserProfileConfig.enableNewPrivilege = jsonParser.getValueAsBoolean();
                    return true;
                case 13:
                    bLiveUserProfileConfig.hasFanbaseGroup = jsonParser.getValueAsBoolean();
                    return true;
                case 14:
                    bLiveUserProfileConfig.isGuard = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    bLiveUserProfileConfig.hierarchy = JsonAdapter.parseArray(jsonParser, BLiveUserProfileConfigHierarchy.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserProfileConfig bLiveUserProfileConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserProfileConfig.showType;
            if (str != null) {
                jsonGenerator.writeStringField("showType", str);
            }
            jsonGenerator.writeBooleanField("contributionListShow", bLiveUserProfileConfig.contributionListShow);
            jsonGenerator.writeBooleanField("showGuardEntrance", bLiveUserProfileConfig.showGuardEntrance);
            if (bLiveUserProfileConfig.jumpConfig != null) {
                jsonGenerator.writeFieldName("jumpConfig");
                JsonAdapter.serializeArray(bLiveUserProfileConfig.jumpConfig, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveUserProfileConfig.hierarchy != null) {
                jsonGenerator.writeFieldName("hierarchy");
                JsonAdapter.serializeArray(bLiveUserProfileConfig.hierarchy, jsonGenerator, BLiveUserProfileConfigHierarchy.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("isGuard", bLiveUserProfileConfig.isGuard);
            jsonGenerator.writeBooleanField("hasFanbaseGroup", bLiveUserProfileConfig.hasFanbaseGroup);
            jsonGenerator.writeBooleanField("isUserInFanbaseGroup", bLiveUserProfileConfig.isUserInFanbaseGroup);
            jsonGenerator.writeBooleanField("showGiftWallEntrance", bLiveUserProfileConfig.showGiftWallEntrance);
            String str2 = bLiveUserProfileConfig.blockStatus;
            if (str2 != null) {
                jsonGenerator.writeStringField("blockStatus", str2);
            }
            jsonGenerator.writeBooleanField("enableNewPrivilege", bLiveUserProfileConfig.enableNewPrivilege);
            jsonGenerator.writeBooleanField("isBeautifulNumber", bLiveUserProfileConfig.isBeautifulNumber);
            jsonGenerator.writeBooleanField("showGiftWallEntranceV2", bLiveUserProfileConfig.showGiftWallEntranceV2);
            jsonGenerator.writeBooleanField("isHiddenUserHierachy", bLiveUserProfileConfig.isHiddenUserHierachy);
            jsonGenerator.writeBooleanField("isHiddenAnchorHierachy", bLiveUserProfileConfig.isHiddenAnchorHierachy);
            if (bLiveUserProfileConfig.familyCard != null) {
                jsonGenerator.writeFieldName("familyCard");
                BLiveUserFamilyCard.JSON_ADAPTER.serialize(bLiveUserProfileConfig.familyCard, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserProfileConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserprofileconfig";

    @NonNull
    @ProtobufIndex(index = 10)
    public String blockStatus;

    @ProtobufIndex(index = 2)
    public boolean contributionListShow;

    @ProtobufIndex(index = 11)
    public boolean enableNewPrivilege;

    @NonNull
    @ProtobufIndex(index = 16)
    public BLiveUserFamilyCard familyCard;

    @ProtobufIndex(index = 7)
    public boolean hasFanbaseGroup;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveUserProfileConfigHierarchy> hierarchy;

    @ProtobufIndex(index = 12)
    public boolean isBeautifulNumber;

    @ProtobufIndex(index = 6)
    public boolean isGuard;

    @ProtobufIndex(index = 15)
    public boolean isHiddenAnchorHierachy;

    @ProtobufIndex(index = 14)
    public boolean isHiddenUserHierachy;

    @ProtobufIndex(index = 8)
    public boolean isUserInFanbaseGroup;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> jumpConfig;

    @ProtobufIndex(index = 9)
    public boolean showGiftWallEntrance;

    @ProtobufIndex(index = 13)
    public boolean showGiftWallEntranceV2;

    @ProtobufIndex(index = 3)
    public boolean showGuardEntrance;

    @NonNull
    @ProtobufIndex(index = 1)
    public String showType;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68319a(String str) {
        return str;
    }

    public static BLiveUserProfileConfig new_() {
        BLiveUserProfileConfig bLiveUserProfileConfig = new BLiveUserProfileConfig();
        bLiveUserProfileConfig.nullCheck();
        return bLiveUserProfileConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserProfileConfig mo223809clone() {
        BLiveUserProfileConfig bLiveUserProfileConfig = new BLiveUserProfileConfig();
        bLiveUserProfileConfig.showType = this.showType;
        bLiveUserProfileConfig.contributionListShow = this.contributionListShow;
        bLiveUserProfileConfig.showGuardEntrance = this.showGuardEntrance;
        List<String> list = this.jumpConfig;
        if (list != null) {
            bLiveUserProfileConfig.jumpConfig = ValueObject.util_map(list, new w9j() { // from class: l.r72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveUserProfileConfig.m68319a((String) obj);
                }
            });
        }
        List<BLiveUserProfileConfigHierarchy> list2 = this.hierarchy;
        if (list2 != null) {
            bLiveUserProfileConfig.hierarchy = ValueObject.util_map(list2, new w9j() { // from class: l.s72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveUserProfileConfigHierarchy) obj).mo223809clone();
                }
            });
        }
        bLiveUserProfileConfig.isGuard = this.isGuard;
        bLiveUserProfileConfig.hasFanbaseGroup = this.hasFanbaseGroup;
        bLiveUserProfileConfig.isUserInFanbaseGroup = this.isUserInFanbaseGroup;
        bLiveUserProfileConfig.showGiftWallEntrance = this.showGiftWallEntrance;
        bLiveUserProfileConfig.blockStatus = this.blockStatus;
        bLiveUserProfileConfig.enableNewPrivilege = this.enableNewPrivilege;
        bLiveUserProfileConfig.isBeautifulNumber = this.isBeautifulNumber;
        bLiveUserProfileConfig.showGiftWallEntranceV2 = this.showGiftWallEntranceV2;
        bLiveUserProfileConfig.isHiddenUserHierachy = this.isHiddenUserHierachy;
        bLiveUserProfileConfig.isHiddenAnchorHierachy = this.isHiddenAnchorHierachy;
        BLiveUserFamilyCard bLiveUserFamilyCard = this.familyCard;
        if (bLiveUserFamilyCard != null) {
            bLiveUserProfileConfig.familyCard = bLiveUserFamilyCard.mo223809clone();
        }
        return bLiveUserProfileConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserProfileConfig)) {
            return false;
        }
        BLiveUserProfileConfig bLiveUserProfileConfig = (BLiveUserProfileConfig) obj;
        return ValueObject.util_equals(this.showType, bLiveUserProfileConfig.showType) && this.contributionListShow == bLiveUserProfileConfig.contributionListShow && this.showGuardEntrance == bLiveUserProfileConfig.showGuardEntrance && ValueObject.util_equals(this.jumpConfig, bLiveUserProfileConfig.jumpConfig) && ValueObject.util_equals(this.hierarchy, bLiveUserProfileConfig.hierarchy) && this.isGuard == bLiveUserProfileConfig.isGuard && this.hasFanbaseGroup == bLiveUserProfileConfig.hasFanbaseGroup && this.isUserInFanbaseGroup == bLiveUserProfileConfig.isUserInFanbaseGroup && this.showGiftWallEntrance == bLiveUserProfileConfig.showGiftWallEntrance && ValueObject.util_equals(this.blockStatus, bLiveUserProfileConfig.blockStatus) && this.enableNewPrivilege == bLiveUserProfileConfig.enableNewPrivilege && this.isBeautifulNumber == bLiveUserProfileConfig.isBeautifulNumber && this.showGiftWallEntranceV2 == bLiveUserProfileConfig.showGiftWallEntranceV2 && this.isHiddenUserHierachy == bLiveUserProfileConfig.isHiddenUserHierachy && this.isHiddenAnchorHierachy == bLiveUserProfileConfig.isHiddenAnchorHierachy && ValueObject.util_equals(this.familyCard, bLiveUserProfileConfig.familyCard);
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
        String str = this.showType;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.contributionListShow ? 1231 : 1237)) * 41) + (this.showGuardEntrance ? 1231 : 1237)) * 41;
        List<String> list = this.jumpConfig;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveUserProfileConfigHierarchy> list2 = this.hierarchy;
        int iHashCode3 = (((((((((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.isGuard ? 1231 : 1237)) * 41) + (this.hasFanbaseGroup ? 1231 : 1237)) * 41) + (this.isUserInFanbaseGroup ? 1231 : 1237)) * 41) + (this.showGiftWallEntrance ? 1231 : 1237)) * 41;
        String str2 = this.blockStatus;
        int iHashCode4 = (((((((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.enableNewPrivilege ? 1231 : 1237)) * 41) + (this.isBeautifulNumber ? 1231 : 1237)) * 41) + (this.showGiftWallEntranceV2 ? 1231 : 1237)) * 41) + (this.isHiddenUserHierachy ? 1231 : 1237)) * 41) + (this.isHiddenAnchorHierachy ? 1231 : 1237)) * 41;
        BLiveUserFamilyCard bLiveUserFamilyCard = this.familyCard;
        int iHashCode5 = iHashCode4 + (bLiveUserFamilyCard != null ? bLiveUserFamilyCard.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.showType == null) {
            this.showType = "";
        }
        if (this.jumpConfig == null) {
            this.jumpConfig = new ArrayList();
        }
        if (this.hierarchy == null) {
            this.hierarchy = new ArrayList();
        }
        if (this.blockStatus == null) {
            this.blockStatus = "";
        }
        if (this.familyCard == null) {
            this.familyCard = BLiveUserFamilyCard.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
