package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialFriendRelation;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileBanners;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCards;
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
public class BLiveVoiceUserProfileConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserProfileConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserProfileConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserProfileConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserProfileConfig newInstance() {
            return new BLiveVoiceUserProfileConfig();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2145125482:
                    if (str.equals("payGuideConfig")) {
                        b = 0;
                    }
                    break;
                case -2103826765:
                    if (str.equals("receiveGift")) {
                        b = 1;
                    }
                    break;
                case -1687596344:
                    if (str.equals("giftShowCaseItemIds")) {
                        b = 2;
                    }
                    break;
                case -1608819124:
                    if (str.equals("fanAvatar")) {
                        b = 3;
                    }
                    break;
                case -1019279658:
                    if (str.equals("bottomButtons")) {
                        b = 4;
                    }
                    break;
                case -1016963242:
                    if (str.equals("userNameGradientColors")) {
                        b = 5;
                    }
                    break;
                case -987520404:
                    if (str.equals("moreButtons")) {
                        b = 6;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 7;
                    }
                    break;
                case -790383186:
                    if (str.equals("fanAvatarTag")) {
                        b = 8;
                    }
                    break;
                case -493426557:
                    if (str.equals("isJailed")) {
                        b = 9;
                    }
                    break;
                case -336959801:
                    if (str.equals(Banners.TYPE)) {
                        b = 10;
                    }
                    break;
                case -135761730:
                    if (str.equals("identity")) {
                        b = 11;
                    }
                    break;
                case -17367677:
                    if (str.equals("giftRuleUrl")) {
                        b = 12;
                    }
                    break;
                case 98705061:
                    if (str.equals(BLiveTraceServerBiz.guard)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 170385743:
                    if (str.equals("strawberry")) {
                        b = 14;
                    }
                    break;
                case 373494894:
                    if (str.equals("guildId")) {
                        b = 15;
                    }
                    break;
                case 388812380:
                    if (str.equals("manageButtons")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 394842830:
                    if (str.equals("middleCards")) {
                        b = 17;
                    }
                    break;
                case 402733824:
                    if (str.equals("specialFriendRelations")) {
                        b = 18;
                    }
                    break;
                case 443332597:
                    if (str.equals("relationState")) {
                        b = 19;
                    }
                    break;
                case 632808662:
                    if (str.equals("showSpecialFriendRelation")) {
                        b = 20;
                    }
                    break;
                case 798226580:
                    if (str.equals("familyCard")) {
                        b = 21;
                    }
                    break;
                case 905809428:
                    if (str.equals("enableNewPrivilege")) {
                        b = 22;
                    }
                    break;
                case 985653762:
                    if (str.equals("payGuideInfo")) {
                        b = 23;
                    }
                    break;
                case 1033140052:
                    if (str.equals("specialFriendRelationSchema")) {
                        b = 24;
                    }
                    break;
                case 1174240300:
                    if (str.equals("middleButtons")) {
                        b = 25;
                    }
                    break;
                case 1247062232:
                    if (str.equals("sendGift")) {
                        b = 26;
                    }
                    break;
                case 1554523181:
                    if (str.equals("sweetCpCard")) {
                        b = 27;
                    }
                    break;
                case 2115146293:
                    if (str.equals("hierarchy")) {
                        b = 28;
                    }
                    break;
                case 2117225405:
                    if (str.equals("showReceiveGifts")) {
                        b = 29;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceUserProfileConfig.payGuideConfig = BLivePayGuideConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveVoiceUserProfileConfig.receiveGift = jsonParser.getValueAsLong();
                    return true;
                case 2:
                    bLiveVoiceUserProfileConfig.giftShowCaseItemIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveVoiceUserProfileConfig.fanAvatar = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoiceUserProfileConfig.bottomButtons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveVoiceUserProfileConfig.userNameGradientColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveVoiceUserProfileConfig.moreButtons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveVoiceUserProfileConfig.userId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveVoiceUserProfileConfig.fanAvatarTag = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveVoiceUserProfileConfig.isJailed = jsonParser.getValueAsBoolean();
                    return true;
                case 10:
                    bLiveVoiceUserProfileConfig.banners = JsonAdapter.parseArray(jsonParser, BLiveVoiceUserProfileBanners.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveVoiceUserProfileConfig.identity = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVoiceUserProfileConfig.giftRuleUrl = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceUserProfileConfig.guard = BLiveBoardGuard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveVoiceUserProfileConfig.strawberry = jsonParser.getValueAsLong();
                    return true;
                case 15:
                    bLiveVoiceUserProfileConfig.guildId = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveVoiceUserProfileConfig.manageButtons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLiveVoiceUserProfileConfig.middleCards = JsonAdapter.parseArray(jsonParser, BLiveVoiceUserProfileMiddleCards.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    bLiveVoiceUserProfileConfig.specialFriendRelations = JsonAdapter.parseArray(jsonParser, BLiveSpecialFriendRelation.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    bLiveVoiceUserProfileConfig.relationState = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveVoiceUserProfileConfig.showSpecialFriendRelation = jsonParser.getValueAsBoolean();
                    return true;
                case 21:
                    bLiveVoiceUserProfileConfig.familyCard = BLiveUserFamilyCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveVoiceUserProfileConfig.enableNewPrivilege = jsonParser.getValueAsBoolean();
                    return true;
                case 23:
                    bLiveVoiceUserProfileConfig.payGuideInfo = BLivePayGuideInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    bLiveVoiceUserProfileConfig.specialFriendRelationSchema = jsonParser.getValueAsString();
                    return true;
                case 25:
                    bLiveVoiceUserProfileConfig.middleButtons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    bLiveVoiceUserProfileConfig.sendGift = jsonParser.getValueAsString();
                    return true;
                case 27:
                    bLiveVoiceUserProfileConfig.sweetCpCard = BLiveVirtualVoiceSweetCpCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    bLiveVoiceUserProfileConfig.hierarchy = JsonAdapter.parseArray(jsonParser, BLiveUserProfileConfigHierarchy.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    bLiveVoiceUserProfileConfig.showReceiveGifts = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceUserProfileConfig.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("showReceiveGifts", bLiveVoiceUserProfileConfig.showReceiveGifts);
            jsonGenerator.writeNumberField("strawberry", bLiveVoiceUserProfileConfig.strawberry);
            jsonGenerator.writeNumberField("receiveGift", bLiveVoiceUserProfileConfig.receiveGift);
            String str2 = bLiveVoiceUserProfileConfig.giftRuleUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftRuleUrl", str2);
            }
            String str3 = bLiveVoiceUserProfileConfig.sendGift;
            if (str3 != null) {
                jsonGenerator.writeStringField("sendGift", str3);
            }
            if (bLiveVoiceUserProfileConfig.bottomButtons != null) {
                jsonGenerator.writeFieldName("bottomButtons");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.bottomButtons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveVoiceUserProfileConfig.middleButtons != null) {
                jsonGenerator.writeFieldName("middleButtons");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.middleButtons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveVoiceUserProfileConfig.manageButtons != null) {
                jsonGenerator.writeFieldName("manageButtons");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.manageButtons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveVoiceUserProfileConfig.hierarchy != null) {
                jsonGenerator.writeFieldName("hierarchy");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.hierarchy, jsonGenerator, BLiveUserProfileConfigHierarchy.JSON_ADAPTER);
            }
            if (bLiveVoiceUserProfileConfig.banners != null) {
                jsonGenerator.writeFieldName(Banners.TYPE);
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.banners, jsonGenerator, BLiveVoiceUserProfileBanners.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("isJailed", bLiveVoiceUserProfileConfig.isJailed);
            if (bLiveVoiceUserProfileConfig.middleCards != null) {
                jsonGenerator.writeFieldName("middleCards");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.middleCards, jsonGenerator, BLiveVoiceUserProfileMiddleCards.JSON_ADAPTER);
            }
            String str4 = bLiveVoiceUserProfileConfig.relationState;
            if (str4 != null) {
                jsonGenerator.writeStringField("relationState", str4);
            }
            if (bLiveVoiceUserProfileConfig.giftShowCaseItemIds != null) {
                jsonGenerator.writeFieldName("giftShowCaseItemIds");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.giftShowCaseItemIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveVoiceUserProfileConfig.sweetCpCard != null) {
                jsonGenerator.writeFieldName("sweetCpCard");
                BLiveVirtualVoiceSweetCpCard.JSON_ADAPTER.serialize(bLiveVoiceUserProfileConfig.sweetCpCard, jsonGenerator, true);
            }
            String str5 = bLiveVoiceUserProfileConfig.identity;
            if (str5 != null) {
                jsonGenerator.writeStringField("identity", str5);
            }
            if (bLiveVoiceUserProfileConfig.moreButtons != null) {
                jsonGenerator.writeFieldName("moreButtons");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.moreButtons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("enableNewPrivilege", bLiveVoiceUserProfileConfig.enableNewPrivilege);
            String str6 = bLiveVoiceUserProfileConfig.fanAvatar;
            if (str6 != null) {
                jsonGenerator.writeStringField("fanAvatar", str6);
            }
            String str7 = bLiveVoiceUserProfileConfig.fanAvatarTag;
            if (str7 != null) {
                jsonGenerator.writeStringField("fanAvatarTag", str7);
            }
            if (bLiveVoiceUserProfileConfig.payGuideInfo != null) {
                jsonGenerator.writeFieldName("payGuideInfo");
                BLivePayGuideInfo.JSON_ADAPTER.serialize(bLiveVoiceUserProfileConfig.payGuideInfo, jsonGenerator, true);
            }
            if (bLiveVoiceUserProfileConfig.payGuideConfig != null) {
                jsonGenerator.writeFieldName("payGuideConfig");
                BLivePayGuideConfig.JSON_ADAPTER.serialize(bLiveVoiceUserProfileConfig.payGuideConfig, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showSpecialFriendRelation", bLiveVoiceUserProfileConfig.showSpecialFriendRelation);
            String str8 = bLiveVoiceUserProfileConfig.specialFriendRelationSchema;
            if (str8 != null) {
                jsonGenerator.writeStringField("specialFriendRelationSchema", str8);
            }
            if (bLiveVoiceUserProfileConfig.specialFriendRelations != null) {
                jsonGenerator.writeFieldName("specialFriendRelations");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.specialFriendRelations, jsonGenerator, BLiveSpecialFriendRelation.JSON_ADAPTER);
            }
            if (bLiveVoiceUserProfileConfig.familyCard != null) {
                jsonGenerator.writeFieldName("familyCard");
                BLiveUserFamilyCard.JSON_ADAPTER.serialize(bLiveVoiceUserProfileConfig.familyCard, jsonGenerator, true);
            }
            String str9 = bLiveVoiceUserProfileConfig.guildId;
            if (str9 != null) {
                jsonGenerator.writeStringField("guildId", str9);
            }
            if (bLiveVoiceUserProfileConfig.guard != null) {
                jsonGenerator.writeFieldName(BLiveTraceServerBiz.guard);
                BLiveBoardGuard.JSON_ADAPTER.serialize(bLiveVoiceUserProfileConfig.guard, jsonGenerator, true);
            }
            if (bLiveVoiceUserProfileConfig.userNameGradientColors != null) {
                jsonGenerator.writeFieldName("userNameGradientColors");
                JsonAdapter.serializeArray(bLiveVoiceUserProfileConfig.userNameGradientColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserProfileConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceuserprofileconfig";

    @NonNull
    @ProtobufIndex(index = 11)
    public List<BLiveVoiceUserProfileBanners> banners;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> bottomButtons;

    @ProtobufIndex(index = 19)
    public boolean enableNewPrivilege;

    @NonNull
    @ProtobufIndex(index = 27)
    public BLiveUserFamilyCard familyCard;

    @NonNull
    @ProtobufIndex(index = 20)
    public String fanAvatar;

    @NonNull
    @ProtobufIndex(index = 21)
    public String fanAvatarTag;

    @NonNull
    @ProtobufIndex(index = 5)
    public String giftRuleUrl;

    @NonNull
    @ProtobufIndex(index = 15)
    public List<String> giftShowCaseItemIds;

    @Nullable
    @ProtobufIndex(index = 29)
    public BLiveBoardGuard guard;

    @NonNull
    @ProtobufIndex(index = 28)
    public String guildId;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<BLiveUserProfileConfigHierarchy> hierarchy;

    @NonNull
    @ProtobufIndex(index = 17)
    public String identity;

    @ProtobufIndex(index = 12)
    public boolean isJailed;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<String> manageButtons;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> middleButtons;

    @NonNull
    @ProtobufIndex(index = 13)
    public List<BLiveVoiceUserProfileMiddleCards> middleCards;

    @NonNull
    @ProtobufIndex(index = 18)
    public List<String> moreButtons;

    @Nullable
    @ProtobufIndex(index = 23)
    public BLivePayGuideConfig payGuideConfig;

    @Nullable
    @ProtobufIndex(index = 22)
    public BLivePayGuideInfo payGuideInfo;

    @ProtobufIndex(index = 4)
    public long receiveGift;

    @NonNull
    @ProtobufIndex(index = 14)
    public String relationState;

    @NonNull
    @ProtobufIndex(index = 6)
    public String sendGift;

    @ProtobufIndex(index = 2)
    public boolean showReceiveGifts;

    @ProtobufIndex(index = 24)
    public boolean showSpecialFriendRelation;

    @NonNull
    @ProtobufIndex(index = 25)
    public String specialFriendRelationSchema;

    @NonNull
    @ProtobufIndex(index = 26)
    public List<BLiveSpecialFriendRelation> specialFriendRelations;

    @ProtobufIndex(index = 3)
    public long strawberry;

    @NonNull
    @ProtobufIndex(index = 16)
    public BLiveVirtualVoiceSweetCpCard sweetCpCard;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 30)
    public List<String> userNameGradientColors;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69633a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m69635c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m69636d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m69637e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m69640l(String str) {
        return str;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m69641m(String str) {
        return str;
    }

    public static BLiveVoiceUserProfileConfig new_() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = new BLiveVoiceUserProfileConfig();
        bLiveVoiceUserProfileConfig.nullCheck();
        return bLiveVoiceUserProfileConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserProfileConfig mo225055clone() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = new BLiveVoiceUserProfileConfig();
        bLiveVoiceUserProfileConfig.userId = this.userId;
        bLiveVoiceUserProfileConfig.showReceiveGifts = this.showReceiveGifts;
        bLiveVoiceUserProfileConfig.strawberry = this.strawberry;
        bLiveVoiceUserProfileConfig.receiveGift = this.receiveGift;
        bLiveVoiceUserProfileConfig.giftRuleUrl = this.giftRuleUrl;
        bLiveVoiceUserProfileConfig.sendGift = this.sendGift;
        List<String> list = this.bottomButtons;
        if (list != null) {
            bLiveVoiceUserProfileConfig.bottomButtons = ValueObject.util_map(list, new qcj() { // from class: l.ia2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceUserProfileConfig.m69640l((String) obj);
                }
            });
        }
        List<String> list2 = this.middleButtons;
        if (list2 != null) {
            bLiveVoiceUserProfileConfig.middleButtons = ValueObject.util_map(list2, new qcj() { // from class: l.ja2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceUserProfileConfig.m69636d((String) obj);
                }
            });
        }
        List<String> list3 = this.manageButtons;
        if (list3 != null) {
            bLiveVoiceUserProfileConfig.manageButtons = ValueObject.util_map(list3, new qcj() { // from class: l.ka2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceUserProfileConfig.m69637e((String) obj);
                }
            });
        }
        List<BLiveUserProfileConfigHierarchy> list4 = this.hierarchy;
        if (list4 != null) {
            bLiveVoiceUserProfileConfig.hierarchy = ValueObject.util_map(list4, new qcj() { // from class: l.la2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserProfileConfigHierarchy) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceUserProfileBanners> list5 = this.banners;
        if (list5 != null) {
            bLiveVoiceUserProfileConfig.banners = ValueObject.util_map(list5, new qcj() { // from class: l.ma2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceUserProfileBanners) obj).mo225055clone();
                }
            });
        }
        bLiveVoiceUserProfileConfig.isJailed = this.isJailed;
        List<BLiveVoiceUserProfileMiddleCards> list6 = this.middleCards;
        if (list6 != null) {
            bLiveVoiceUserProfileConfig.middleCards = ValueObject.util_map(list6, new qcj() { // from class: l.na2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceUserProfileMiddleCards) obj).mo225055clone();
                }
            });
        }
        bLiveVoiceUserProfileConfig.relationState = this.relationState;
        List<String> list7 = this.giftShowCaseItemIds;
        if (list7 != null) {
            bLiveVoiceUserProfileConfig.giftShowCaseItemIds = ValueObject.util_map(list7, new qcj() { // from class: l.oa2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceUserProfileConfig.m69635c((String) obj);
                }
            });
        }
        BLiveVirtualVoiceSweetCpCard bLiveVirtualVoiceSweetCpCard = this.sweetCpCard;
        if (bLiveVirtualVoiceSweetCpCard != null) {
            bLiveVoiceUserProfileConfig.sweetCpCard = bLiveVirtualVoiceSweetCpCard.mo225055clone();
        }
        bLiveVoiceUserProfileConfig.identity = this.identity;
        List<String> list8 = this.moreButtons;
        if (list8 != null) {
            bLiveVoiceUserProfileConfig.moreButtons = ValueObject.util_map(list8, new qcj() { // from class: l.pa2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceUserProfileConfig.m69633a((String) obj);
                }
            });
        }
        bLiveVoiceUserProfileConfig.enableNewPrivilege = this.enableNewPrivilege;
        bLiveVoiceUserProfileConfig.fanAvatar = this.fanAvatar;
        bLiveVoiceUserProfileConfig.fanAvatarTag = this.fanAvatarTag;
        BLivePayGuideInfo bLivePayGuideInfo = this.payGuideInfo;
        if (bLivePayGuideInfo != null) {
            bLiveVoiceUserProfileConfig.payGuideInfo = bLivePayGuideInfo.mo225055clone();
        }
        BLivePayGuideConfig bLivePayGuideConfig = this.payGuideConfig;
        if (bLivePayGuideConfig != null) {
            bLiveVoiceUserProfileConfig.payGuideConfig = bLivePayGuideConfig.mo225055clone();
        }
        bLiveVoiceUserProfileConfig.showSpecialFriendRelation = this.showSpecialFriendRelation;
        bLiveVoiceUserProfileConfig.specialFriendRelationSchema = this.specialFriendRelationSchema;
        List<BLiveSpecialFriendRelation> list9 = this.specialFriendRelations;
        if (list9 != null) {
            bLiveVoiceUserProfileConfig.specialFriendRelations = ValueObject.util_map(list9, new qcj() { // from class: l.qa2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSpecialFriendRelation) obj).mo225055clone();
                }
            });
        }
        BLiveUserFamilyCard bLiveUserFamilyCard = this.familyCard;
        if (bLiveUserFamilyCard != null) {
            bLiveVoiceUserProfileConfig.familyCard = bLiveUserFamilyCard.mo225055clone();
        }
        bLiveVoiceUserProfileConfig.guildId = this.guildId;
        BLiveBoardGuard bLiveBoardGuard = this.guard;
        if (bLiveBoardGuard != null) {
            bLiveVoiceUserProfileConfig.guard = bLiveBoardGuard.mo225055clone();
        }
        List<String> list10 = this.userNameGradientColors;
        if (list10 != null) {
            bLiveVoiceUserProfileConfig.userNameGradientColors = ValueObject.util_map(list10, new qcj() { // from class: l.ra2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveVoiceUserProfileConfig.m69641m((String) obj);
                }
            });
        }
        return bLiveVoiceUserProfileConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceUserProfileConfig)) {
            return false;
        }
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = (BLiveVoiceUserProfileConfig) obj;
        return ValueObject.util_equals(this.userId, bLiveVoiceUserProfileConfig.userId) && this.showReceiveGifts == bLiveVoiceUserProfileConfig.showReceiveGifts && this.strawberry == bLiveVoiceUserProfileConfig.strawberry && this.receiveGift == bLiveVoiceUserProfileConfig.receiveGift && ValueObject.util_equals(this.giftRuleUrl, bLiveVoiceUserProfileConfig.giftRuleUrl) && ValueObject.util_equals(this.sendGift, bLiveVoiceUserProfileConfig.sendGift) && ValueObject.util_equals(this.bottomButtons, bLiveVoiceUserProfileConfig.bottomButtons) && ValueObject.util_equals(this.middleButtons, bLiveVoiceUserProfileConfig.middleButtons) && ValueObject.util_equals(this.manageButtons, bLiveVoiceUserProfileConfig.manageButtons) && ValueObject.util_equals(this.hierarchy, bLiveVoiceUserProfileConfig.hierarchy) && ValueObject.util_equals(this.banners, bLiveVoiceUserProfileConfig.banners) && this.isJailed == bLiveVoiceUserProfileConfig.isJailed && ValueObject.util_equals(this.middleCards, bLiveVoiceUserProfileConfig.middleCards) && ValueObject.util_equals(this.relationState, bLiveVoiceUserProfileConfig.relationState) && ValueObject.util_equals(this.giftShowCaseItemIds, bLiveVoiceUserProfileConfig.giftShowCaseItemIds) && ValueObject.util_equals(this.sweetCpCard, bLiveVoiceUserProfileConfig.sweetCpCard) && ValueObject.util_equals(this.identity, bLiveVoiceUserProfileConfig.identity) && ValueObject.util_equals(this.moreButtons, bLiveVoiceUserProfileConfig.moreButtons) && this.enableNewPrivilege == bLiveVoiceUserProfileConfig.enableNewPrivilege && ValueObject.util_equals(this.fanAvatar, bLiveVoiceUserProfileConfig.fanAvatar) && ValueObject.util_equals(this.fanAvatarTag, bLiveVoiceUserProfileConfig.fanAvatarTag) && ValueObject.util_equals(this.payGuideInfo, bLiveVoiceUserProfileConfig.payGuideInfo) && ValueObject.util_equals(this.payGuideConfig, bLiveVoiceUserProfileConfig.payGuideConfig) && this.showSpecialFriendRelation == bLiveVoiceUserProfileConfig.showSpecialFriendRelation && ValueObject.util_equals(this.specialFriendRelationSchema, bLiveVoiceUserProfileConfig.specialFriendRelationSchema) && ValueObject.util_equals(this.specialFriendRelations, bLiveVoiceUserProfileConfig.specialFriendRelations) && ValueObject.util_equals(this.familyCard, bLiveVoiceUserProfileConfig.familyCard) && ValueObject.util_equals(this.guildId, bLiveVoiceUserProfileConfig.guildId) && ValueObject.util_equals(this.guard, bLiveVoiceUserProfileConfig.guard) && ValueObject.util_equals(this.userNameGradientColors, bLiveVoiceUserProfileConfig.userNameGradientColors);
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
        int i3 = this.showReceiveGifts ? 1231 : 1237;
        long j = this.strawberry;
        int i4 = (((iHashCode + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.receiveGift;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str2 = this.giftRuleUrl;
        int iHashCode2 = (i5 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.sendGift;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<String> list = this.bottomButtons;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.middleButtons;
        int iHashCode5 = (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.manageButtons;
        int iHashCode6 = (iHashCode5 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<BLiveUserProfileConfigHierarchy> list4 = this.hierarchy;
        int iHashCode7 = (iHashCode6 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<BLiveVoiceUserProfileBanners> list5 = this.banners;
        int iHashCode8 = (((iHashCode7 + (list5 != null ? list5.hashCode() : 0)) * 41) + (this.isJailed ? 1231 : 1237)) * 41;
        List<BLiveVoiceUserProfileMiddleCards> list6 = this.middleCards;
        int iHashCode9 = (iHashCode8 + (list6 != null ? list6.hashCode() : 0)) * 41;
        String str4 = this.relationState;
        int iHashCode10 = (iHashCode9 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list7 = this.giftShowCaseItemIds;
        int iHashCode11 = (iHashCode10 + (list7 != null ? list7.hashCode() : 0)) * 41;
        BLiveVirtualVoiceSweetCpCard bLiveVirtualVoiceSweetCpCard = this.sweetCpCard;
        int iHashCode12 = (iHashCode11 + (bLiveVirtualVoiceSweetCpCard != null ? bLiveVirtualVoiceSweetCpCard.hashCode() : 0)) * 41;
        String str5 = this.identity;
        int iHashCode13 = (iHashCode12 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<String> list8 = this.moreButtons;
        int iHashCode14 = (((iHashCode13 + (list8 != null ? list8.hashCode() : 0)) * 41) + (this.enableNewPrivilege ? 1231 : 1237)) * 41;
        String str6 = this.fanAvatar;
        int iHashCode15 = (iHashCode14 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.fanAvatarTag;
        int iHashCode16 = (iHashCode15 + (str7 != null ? str7.hashCode() : 0)) * 41;
        BLivePayGuideInfo bLivePayGuideInfo = this.payGuideInfo;
        int iHashCode17 = (iHashCode16 + (bLivePayGuideInfo != null ? bLivePayGuideInfo.hashCode() : 0)) * 41;
        BLivePayGuideConfig bLivePayGuideConfig = this.payGuideConfig;
        int iHashCode18 = (((iHashCode17 + (bLivePayGuideConfig != null ? bLivePayGuideConfig.hashCode() : 0)) * 41) + (this.showSpecialFriendRelation ? 1231 : 1237)) * 41;
        String str8 = this.specialFriendRelationSchema;
        int iHashCode19 = (iHashCode18 + (str8 != null ? str8.hashCode() : 0)) * 41;
        List<BLiveSpecialFriendRelation> list9 = this.specialFriendRelations;
        int iHashCode20 = (iHashCode19 + (list9 != null ? list9.hashCode() : 0)) * 41;
        BLiveUserFamilyCard bLiveUserFamilyCard = this.familyCard;
        int iHashCode21 = (iHashCode20 + (bLiveUserFamilyCard != null ? bLiveUserFamilyCard.hashCode() : 0)) * 41;
        String str9 = this.guildId;
        int iHashCode22 = (iHashCode21 + (str9 != null ? str9.hashCode() : 0)) * 41;
        BLiveBoardGuard bLiveBoardGuard = this.guard;
        int iHashCode23 = (iHashCode22 + (bLiveBoardGuard != null ? bLiveBoardGuard.hashCode() : 0)) * 41;
        List<String> list10 = this.userNameGradientColors;
        int iHashCode24 = iHashCode23 + (list10 != null ? list10.hashCode() : 0);
        this.hashCode = iHashCode24;
        return iHashCode24;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.giftRuleUrl == null) {
            this.giftRuleUrl = "";
        }
        if (this.sendGift == null) {
            this.sendGift = "";
        }
        if (this.bottomButtons == null) {
            this.bottomButtons = new ArrayList();
        }
        if (this.middleButtons == null) {
            this.middleButtons = new ArrayList();
        }
        if (this.manageButtons == null) {
            this.manageButtons = new ArrayList();
        }
        if (this.hierarchy == null) {
            this.hierarchy = new ArrayList();
        }
        if (this.banners == null) {
            this.banners = new ArrayList();
        }
        if (this.middleCards == null) {
            this.middleCards = new ArrayList();
        }
        if (this.relationState == null) {
            this.relationState = "";
        }
        if (this.giftShowCaseItemIds == null) {
            this.giftShowCaseItemIds = new ArrayList();
        }
        if (this.sweetCpCard == null) {
            this.sweetCpCard = BLiveVirtualVoiceSweetCpCard.new_();
        }
        if (this.identity == null) {
            this.identity = "";
        }
        if (this.moreButtons == null) {
            this.moreButtons = new ArrayList();
        }
        if (this.fanAvatar == null) {
            this.fanAvatar = "";
        }
        if (this.fanAvatarTag == null) {
            this.fanAvatarTag = "";
        }
        if (this.specialFriendRelationSchema == null) {
            this.specialFriendRelationSchema = "";
        }
        if (this.specialFriendRelations == null) {
            this.specialFriendRelations = new ArrayList();
        }
        if (this.familyCard == null) {
            this.familyCard = BLiveUserFamilyCard.new_();
        }
        if (this.guildId == null) {
            this.guildId = "";
        }
        if (this.userNameGradientColors == null) {
            this.userNameGradientColors = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
