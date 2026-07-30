package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveBlackListItem;
import com.p051p1.mobile.putong.live.base.data.BLiveSchema;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
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
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveExtraData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveExtraData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveExtraData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveExtraData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveExtraData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveExtraData newInstance() {
            return new BLiveExtraData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveExtraData bLiveExtraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2040115464:
                    if (str.equals("wealthLogo")) {
                        b = 0;
                    }
                    break;
                case -1989016106:
                    if (str.equals("shootGameTask")) {
                        b = 1;
                    }
                    break;
                case -1556097171:
                    if (str.equals("batchGivenGiftRes")) {
                        b = 2;
                    }
                    break;
                case -1297401597:
                    if (str.equals("anchorInfo")) {
                        b = 3;
                    }
                    break;
                case -1258827663:
                    if (str.equals("undercoverGame")) {
                        b = 4;
                    }
                    break;
                case -614324502:
                    if (str.equals("shootGameUserInfo")) {
                        b = 5;
                    }
                    break;
                case 94839810:
                    if (str.equals("coins")) {
                        b = 6;
                    }
                    break;
                case 262669110:
                    if (str.equals("giftWallV2")) {
                        b = 7;
                    }
                    break;
                case 729465958:
                    if (str.equals("liveSchemas")) {
                        b = 8;
                    }
                    break;
                case 1267038140:
                    if (str.equals("voiceRoomProfile")) {
                        b = 9;
                    }
                    break;
                case 1332059453:
                    if (str.equals(BLiveButtonType.blackList)) {
                        b = 10;
                    }
                    break;
                case 1417666655:
                    if (str.equals("confessionRelationship")) {
                        b = 11;
                    }
                    break;
                case 1655054676:
                    if (str.equals("diamond")) {
                        b = 12;
                    }
                    break;
                case 2031121142:
                    if (str.equals("voiceSettles")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveExtraData.wealthLogo = BLiveWealthLogoInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveExtraData.shootGameTask = BLiveShootGameTask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveExtraData.batchGivenGiftRes = JsonAdapter.parseArray(jsonParser, BLiveSendLiveMultiGiftResultItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveExtraData.anchorInfo = BLiveUnJailAnchorInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveExtraData.undercoverGame = BLiveUndercoverGame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveExtraData.shootGameUserInfo = BLiveShootGameInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveExtraData.coins = BLiveCoin.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveExtraData.giftWallV2 = BLiveNewGiftWallDetailInfoItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveExtraData.liveSchemas = JsonAdapter.parseArray(jsonParser, BLiveSchema.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveExtraData.voiceRoomProfile = BLiveVoiceRoomProfile.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveExtraData.blackList = JsonAdapter.parseArray(jsonParser, BLiveBlackListItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveExtraData.confessionRelationship = BLiveMatchRelationshipInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveExtraData.diamond = BLiveCoin.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLiveExtraData.voiceSettles = JsonAdapter.parseArray(jsonParser, BLiveVoiceVirtualRoomSettleItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveExtraData bLiveExtraData, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveExtraData.giftWallV2 != null) {
                jsonGenerator.writeFieldName("giftWallV2");
                BLiveNewGiftWallDetailInfoItem.JSON_ADAPTER.serialize(bLiveExtraData.giftWallV2, jsonGenerator, true);
            }
            if (bLiveExtraData.shootGameUserInfo != null) {
                jsonGenerator.writeFieldName("shootGameUserInfo");
                BLiveShootGameInfo.JSON_ADAPTER.serialize(bLiveExtraData.shootGameUserInfo, jsonGenerator, true);
            }
            if (bLiveExtraData.shootGameTask != null) {
                jsonGenerator.writeFieldName("shootGameTask");
                BLiveShootGameTask.JSON_ADAPTER.serialize(bLiveExtraData.shootGameTask, jsonGenerator, true);
            }
            if (bLiveExtraData.undercoverGame != null) {
                jsonGenerator.writeFieldName("undercoverGame");
                BLiveUndercoverGame.JSON_ADAPTER.serialize(bLiveExtraData.undercoverGame, jsonGenerator, true);
            }
            if (bLiveExtraData.anchorInfo != null) {
                jsonGenerator.writeFieldName("anchorInfo");
                BLiveUnJailAnchorInfo.JSON_ADAPTER.serialize(bLiveExtraData.anchorInfo, jsonGenerator, true);
            }
            if (bLiveExtraData.wealthLogo != null) {
                jsonGenerator.writeFieldName("wealthLogo");
                BLiveWealthLogoInfo.JSON_ADAPTER.serialize(bLiveExtraData.wealthLogo, jsonGenerator, true);
            }
            if (bLiveExtraData.confessionRelationship != null) {
                jsonGenerator.writeFieldName("confessionRelationship");
                BLiveMatchRelationshipInfo.JSON_ADAPTER.serialize(bLiveExtraData.confessionRelationship, jsonGenerator, true);
            }
            if (bLiveExtraData.batchGivenGiftRes != null) {
                jsonGenerator.writeFieldName("batchGivenGiftRes");
                JsonAdapter.serializeArray(bLiveExtraData.batchGivenGiftRes, jsonGenerator, BLiveSendLiveMultiGiftResultItem.JSON_ADAPTER);
            }
            if (bLiveExtraData.blackList != null) {
                jsonGenerator.writeFieldName(BLiveButtonType.blackList);
                JsonAdapter.serializeArray(bLiveExtraData.blackList, jsonGenerator, BLiveBlackListItem.JSON_ADAPTER);
            }
            if (bLiveExtraData.voiceSettles != null) {
                jsonGenerator.writeFieldName("voiceSettles");
                JsonAdapter.serializeArray(bLiveExtraData.voiceSettles, jsonGenerator, BLiveVoiceVirtualRoomSettleItem.JSON_ADAPTER);
            }
            if (bLiveExtraData.voiceRoomProfile != null) {
                jsonGenerator.writeFieldName("voiceRoomProfile");
                BLiveVoiceRoomProfile.JSON_ADAPTER.serialize(bLiveExtraData.voiceRoomProfile, jsonGenerator, true);
            }
            if (bLiveExtraData.coins != null) {
                jsonGenerator.writeFieldName("coins");
                BLiveCoin.JSON_ADAPTER.serialize(bLiveExtraData.coins, jsonGenerator, true);
            }
            if (bLiveExtraData.liveSchemas != null) {
                jsonGenerator.writeFieldName("liveSchemas");
                JsonAdapter.serializeArray(bLiveExtraData.liveSchemas, jsonGenerator, BLiveSchema.JSON_ADAPTER);
            }
            if (bLiveExtraData.diamond != null) {
                jsonGenerator.writeFieldName("diamond");
                BLiveCoin.JSON_ADAPTER.serialize(bLiveExtraData.diamond, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveExtraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveextradata";

    @Nullable
    @ProtobufIndex(index = 4)
    public BLiveUnJailAnchorInfo anchorInfo;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BLiveSendLiveMultiGiftResultItem> batchGivenGiftRes;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<BLiveBlackListItem> blackList;

    @NonNull
    @ProtobufIndex(index = 12)
    public BLiveCoin coins;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveMatchRelationshipInfo confessionRelationship;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveCoin diamond;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveNewGiftWallDetailInfoItem giftWallV2;

    @NonNull
    @ProtobufIndex(index = 13)
    public List<BLiveSchema> liveSchemas;

    @Nullable
    @ProtobufIndex(index = 2)
    public BLiveShootGameTask shootGameTask;

    @Nullable
    @ProtobufIndex(index = 1)
    public BLiveShootGameInfo shootGameUserInfo;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveUndercoverGame undercoverGame;

    @NonNull
    @ProtobufIndex(index = 11)
    public BLiveVoiceRoomProfile voiceRoomProfile;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<BLiveVoiceVirtualRoomSettleItem> voiceSettles;

    @Nullable
    @ProtobufIndex(index = 6)
    public BLiveWealthLogoInfo wealthLogo;

    public static BLiveExtraData new_() {
        BLiveExtraData bLiveExtraData = new BLiveExtraData();
        bLiveExtraData.nullCheck();
        return bLiveExtraData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveExtraData mo225055clone() {
        BLiveExtraData bLiveExtraData = new BLiveExtraData();
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = this.giftWallV2;
        if (bLiveNewGiftWallDetailInfoItem != null) {
            bLiveExtraData.giftWallV2 = bLiveNewGiftWallDetailInfoItem.mo225055clone();
        }
        BLiveShootGameInfo bLiveShootGameInfo = this.shootGameUserInfo;
        if (bLiveShootGameInfo != null) {
            bLiveExtraData.shootGameUserInfo = bLiveShootGameInfo.mo225055clone();
        }
        BLiveShootGameTask bLiveShootGameTask = this.shootGameTask;
        if (bLiveShootGameTask != null) {
            bLiveExtraData.shootGameTask = bLiveShootGameTask.mo225055clone();
        }
        BLiveUndercoverGame bLiveUndercoverGame = this.undercoverGame;
        if (bLiveUndercoverGame != null) {
            bLiveExtraData.undercoverGame = bLiveUndercoverGame.mo225055clone();
        }
        BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo = this.anchorInfo;
        if (bLiveUnJailAnchorInfo != null) {
            bLiveExtraData.anchorInfo = bLiveUnJailAnchorInfo.mo225055clone();
        }
        BLiveWealthLogoInfo bLiveWealthLogoInfo = this.wealthLogo;
        if (bLiveWealthLogoInfo != null) {
            bLiveExtraData.wealthLogo = bLiveWealthLogoInfo.mo225055clone();
        }
        BLiveMatchRelationshipInfo bLiveMatchRelationshipInfo = this.confessionRelationship;
        if (bLiveMatchRelationshipInfo != null) {
            bLiveExtraData.confessionRelationship = bLiveMatchRelationshipInfo.mo225055clone();
        }
        List<BLiveSendLiveMultiGiftResultItem> list = this.batchGivenGiftRes;
        if (list != null) {
            bLiveExtraData.batchGivenGiftRes = ValueObject.util_map(list, new qcj() { // from class: l.sz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSendLiveMultiGiftResultItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveBlackListItem> list2 = this.blackList;
        if (list2 != null) {
            bLiveExtraData.blackList = ValueObject.util_map(list2, new qcj() { // from class: l.tz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveBlackListItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveVoiceVirtualRoomSettleItem> list3 = this.voiceSettles;
        if (list3 != null) {
            bLiveExtraData.voiceSettles = ValueObject.util_map(list3, new qcj() { // from class: l.uz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceVirtualRoomSettleItem) obj).mo225055clone();
                }
            });
        }
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = this.voiceRoomProfile;
        if (bLiveVoiceRoomProfile != null) {
            bLiveExtraData.voiceRoomProfile = bLiveVoiceRoomProfile.mo225055clone();
        }
        BLiveCoin bLiveCoin = this.coins;
        if (bLiveCoin != null) {
            bLiveExtraData.coins = bLiveCoin.mo225055clone();
        }
        List<BLiveSchema> list4 = this.liveSchemas;
        if (list4 != null) {
            bLiveExtraData.liveSchemas = ValueObject.util_map(list4, new qcj() { // from class: l.vz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSchema) obj).mo225055clone();
                }
            });
        }
        BLiveCoin bLiveCoin2 = this.diamond;
        if (bLiveCoin2 != null) {
            bLiveExtraData.diamond = bLiveCoin2.mo225055clone();
        }
        return bLiveExtraData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveExtraData)) {
            return false;
        }
        BLiveExtraData bLiveExtraData = (BLiveExtraData) obj;
        return ValueObject.util_equals(this.giftWallV2, bLiveExtraData.giftWallV2) && ValueObject.util_equals(this.shootGameUserInfo, bLiveExtraData.shootGameUserInfo) && ValueObject.util_equals(this.shootGameTask, bLiveExtraData.shootGameTask) && ValueObject.util_equals(this.undercoverGame, bLiveExtraData.undercoverGame) && ValueObject.util_equals(this.anchorInfo, bLiveExtraData.anchorInfo) && ValueObject.util_equals(this.wealthLogo, bLiveExtraData.wealthLogo) && ValueObject.util_equals(this.confessionRelationship, bLiveExtraData.confessionRelationship) && ValueObject.util_equals(this.batchGivenGiftRes, bLiveExtraData.batchGivenGiftRes) && ValueObject.util_equals(this.blackList, bLiveExtraData.blackList) && ValueObject.util_equals(this.voiceSettles, bLiveExtraData.voiceSettles) && ValueObject.util_equals(this.voiceRoomProfile, bLiveExtraData.voiceRoomProfile) && ValueObject.util_equals(this.coins, bLiveExtraData.coins) && ValueObject.util_equals(this.liveSchemas, bLiveExtraData.liveSchemas) && ValueObject.util_equals(this.diamond, bLiveExtraData.diamond);
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
        BLiveNewGiftWallDetailInfoItem bLiveNewGiftWallDetailInfoItem = this.giftWallV2;
        int iHashCode = (i2 + (bLiveNewGiftWallDetailInfoItem != null ? bLiveNewGiftWallDetailInfoItem.hashCode() : 0)) * 41;
        BLiveShootGameInfo bLiveShootGameInfo = this.shootGameUserInfo;
        int iHashCode2 = (iHashCode + (bLiveShootGameInfo != null ? bLiveShootGameInfo.hashCode() : 0)) * 41;
        BLiveShootGameTask bLiveShootGameTask = this.shootGameTask;
        int iHashCode3 = (iHashCode2 + (bLiveShootGameTask != null ? bLiveShootGameTask.hashCode() : 0)) * 41;
        BLiveUndercoverGame bLiveUndercoverGame = this.undercoverGame;
        int iHashCode4 = (iHashCode3 + (bLiveUndercoverGame != null ? bLiveUndercoverGame.hashCode() : 0)) * 41;
        BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo = this.anchorInfo;
        int iHashCode5 = (iHashCode4 + (bLiveUnJailAnchorInfo != null ? bLiveUnJailAnchorInfo.hashCode() : 0)) * 41;
        BLiveWealthLogoInfo bLiveWealthLogoInfo = this.wealthLogo;
        int iHashCode6 = (iHashCode5 + (bLiveWealthLogoInfo != null ? bLiveWealthLogoInfo.hashCode() : 0)) * 41;
        BLiveMatchRelationshipInfo bLiveMatchRelationshipInfo = this.confessionRelationship;
        int iHashCode7 = (iHashCode6 + (bLiveMatchRelationshipInfo != null ? bLiveMatchRelationshipInfo.hashCode() : 0)) * 41;
        List<BLiveSendLiveMultiGiftResultItem> list = this.batchGivenGiftRes;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveBlackListItem> list2 = this.blackList;
        int iHashCode9 = (iHashCode8 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveVoiceVirtualRoomSettleItem> list3 = this.voiceSettles;
        int iHashCode10 = (iHashCode9 + (list3 != null ? list3.hashCode() : 0)) * 41;
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = this.voiceRoomProfile;
        int iHashCode11 = (iHashCode10 + (bLiveVoiceRoomProfile != null ? bLiveVoiceRoomProfile.hashCode() : 0)) * 41;
        BLiveCoin bLiveCoin = this.coins;
        int iHashCode12 = (iHashCode11 + (bLiveCoin != null ? bLiveCoin.hashCode() : 0)) * 41;
        List<BLiveSchema> list4 = this.liveSchemas;
        int iHashCode13 = (iHashCode12 + (list4 != null ? list4.hashCode() : 0)) * 41;
        BLiveCoin bLiveCoin2 = this.diamond;
        int iHashCode14 = iHashCode13 + (bLiveCoin2 != null ? bLiveCoin2.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftWallV2 == null) {
            this.giftWallV2 = BLiveNewGiftWallDetailInfoItem.new_();
        }
        if (this.undercoverGame == null) {
            this.undercoverGame = BLiveUndercoverGame.new_();
        }
        if (this.confessionRelationship == null) {
            this.confessionRelationship = BLiveMatchRelationshipInfo.new_();
        }
        if (this.batchGivenGiftRes == null) {
            this.batchGivenGiftRes = new ArrayList();
        }
        if (this.blackList == null) {
            this.blackList = new ArrayList();
        }
        if (this.voiceSettles == null) {
            this.voiceSettles = new ArrayList();
        }
        if (this.voiceRoomProfile == null) {
            this.voiceRoomProfile = BLiveVoiceRoomProfile.new_();
        }
        if (this.coins == null) {
            this.coins = BLiveCoin.new_();
        }
        if (this.liveSchemas == null) {
            this.liveSchemas = new ArrayList();
        }
        if (this.diamond == null) {
            this.diamond = BLiveCoin.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
