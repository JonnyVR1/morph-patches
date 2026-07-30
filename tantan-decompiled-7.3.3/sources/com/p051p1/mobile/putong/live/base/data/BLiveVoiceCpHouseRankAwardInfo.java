package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicehouseReward;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceCpHouseRankAwardInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCpHouseRankAwardInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCpHouseRankAwardInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseRankAwardInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCpHouseRankAwardInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCpHouseRankAwardInfo newInstance() {
            return new BLiveVoiceCpHouseRankAwardInfo();
        }

        public boolean parseField(BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "houseRewardList":
                    bLiveVoiceCpHouseRankAwardInfo.houseRewardList = JsonAdapter.parseArray(jsonParser, BLiveVoicehouseReward.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "upgradeGap":
                    bLiveVoiceCpHouseRankAwardInfo.upgradeGap = jsonParser.getValueAsString();
                    return true;
                case "medalImage":
                    bLiveVoiceCpHouseRankAwardInfo.medalImage = jsonParser.getValueAsString();
                    return true;
                case "isUnLock":
                    bLiveVoiceCpHouseRankAwardInfo.isUnLock = jsonParser.getValueAsBoolean();
                    return true;
                case "houseLuxuryValue":
                    bLiveVoiceCpHouseRankAwardInfo.houseLuxuryValue = jsonParser.getValueAsString();
                    return true;
                case "medalId":
                    bLiveVoiceCpHouseRankAwardInfo.medalId = jsonParser.getValueAsString();
                    return true;
                case "houseName":
                    bLiveVoiceCpHouseRankAwardInfo.houseName = jsonParser.getValueAsString();
                    return true;
                case "houseRank":
                    bLiveVoiceCpHouseRankAwardInfo.houseRank = jsonParser.getValueAsInt();
                    return true;
                case "houseId":
                    bLiveVoiceCpHouseRankAwardInfo.houseId = jsonParser.getValueAsString();
                    return true;
                case "medalName":
                    bLiveVoiceCpHouseRankAwardInfo.medalName = jsonParser.getValueAsString();
                    return true;
                case "houseImage":
                    bLiveVoiceCpHouseRankAwardInfo.houseImage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCpHouseRankAwardInfo.houseId;
            if (str != null) {
                jsonGenerator.writeStringField("houseId", str);
            }
            String str2 = bLiveVoiceCpHouseRankAwardInfo.houseLuxuryValue;
            if (str2 != null) {
                jsonGenerator.writeStringField("houseLuxuryValue", str2);
            }
            String str3 = bLiveVoiceCpHouseRankAwardInfo.upgradeGap;
            if (str3 != null) {
                jsonGenerator.writeStringField("upgradeGap", str3);
            }
            String str4 = bLiveVoiceCpHouseRankAwardInfo.medalId;
            if (str4 != null) {
                jsonGenerator.writeStringField("medalId", str4);
            }
            String str5 = bLiveVoiceCpHouseRankAwardInfo.houseImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("houseImage", str5);
            }
            String str6 = bLiveVoiceCpHouseRankAwardInfo.houseName;
            if (str6 != null) {
                jsonGenerator.writeStringField("houseName", str6);
            }
            String str7 = bLiveVoiceCpHouseRankAwardInfo.medalImage;
            if (str7 != null) {
                jsonGenerator.writeStringField("medalImage", str7);
            }
            jsonGenerator.writeNumberField("houseRank", bLiveVoiceCpHouseRankAwardInfo.houseRank);
            jsonGenerator.writeBooleanField("isUnLock", bLiveVoiceCpHouseRankAwardInfo.isUnLock);
            String str8 = bLiveVoiceCpHouseRankAwardInfo.medalName;
            if (str8 != null) {
                jsonGenerator.writeStringField("medalName", str8);
            }
            if (bLiveVoiceCpHouseRankAwardInfo.houseRewardList != null) {
                jsonGenerator.writeFieldName("houseRewardList");
                JsonAdapter.serializeArray(bLiveVoiceCpHouseRankAwardInfo.houseRewardList, jsonGenerator, BLiveVoicehouseReward.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCpHouseRankAwardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecphouserankawardinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String houseId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String houseImage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String houseLuxuryValue;

    @NonNull
    @ProtobufIndex(index = 6)
    public String houseName;

    @ProtobufIndex(index = 8)
    public int houseRank;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<BLiveVoicehouseReward> houseRewardList;

    @ProtobufIndex(index = 9)
    public boolean isUnLock;

    @NonNull
    @ProtobufIndex(index = 4)
    public String medalId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String medalImage;

    @NonNull
    @ProtobufIndex(index = 10)
    public String medalName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String upgradeGap;

    public static BLiveVoiceCpHouseRankAwardInfo new_() {
        BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo = new BLiveVoiceCpHouseRankAwardInfo();
        bLiveVoiceCpHouseRankAwardInfo.nullCheck();
        return bLiveVoiceCpHouseRankAwardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCpHouseRankAwardInfo mo225055clone() {
        BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo = new BLiveVoiceCpHouseRankAwardInfo();
        bLiveVoiceCpHouseRankAwardInfo.houseId = this.houseId;
        bLiveVoiceCpHouseRankAwardInfo.houseLuxuryValue = this.houseLuxuryValue;
        bLiveVoiceCpHouseRankAwardInfo.upgradeGap = this.upgradeGap;
        bLiveVoiceCpHouseRankAwardInfo.medalId = this.medalId;
        bLiveVoiceCpHouseRankAwardInfo.houseImage = this.houseImage;
        bLiveVoiceCpHouseRankAwardInfo.houseName = this.houseName;
        bLiveVoiceCpHouseRankAwardInfo.medalImage = this.medalImage;
        bLiveVoiceCpHouseRankAwardInfo.houseRank = this.houseRank;
        bLiveVoiceCpHouseRankAwardInfo.isUnLock = this.isUnLock;
        bLiveVoiceCpHouseRankAwardInfo.medalName = this.medalName;
        List<BLiveVoicehouseReward> list = this.houseRewardList;
        if (list != null) {
            bLiveVoiceCpHouseRankAwardInfo.houseRewardList = ValueObject.util_map(list, new qcj() { // from class: l.r82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoicehouseReward) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceCpHouseRankAwardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCpHouseRankAwardInfo)) {
            return false;
        }
        BLiveVoiceCpHouseRankAwardInfo bLiveVoiceCpHouseRankAwardInfo = (BLiveVoiceCpHouseRankAwardInfo) obj;
        return ValueObject.util_equals(this.houseId, bLiveVoiceCpHouseRankAwardInfo.houseId) && ValueObject.util_equals(this.houseLuxuryValue, bLiveVoiceCpHouseRankAwardInfo.houseLuxuryValue) && ValueObject.util_equals(this.upgradeGap, bLiveVoiceCpHouseRankAwardInfo.upgradeGap) && ValueObject.util_equals(this.medalId, bLiveVoiceCpHouseRankAwardInfo.medalId) && ValueObject.util_equals(this.houseImage, bLiveVoiceCpHouseRankAwardInfo.houseImage) && ValueObject.util_equals(this.houseName, bLiveVoiceCpHouseRankAwardInfo.houseName) && ValueObject.util_equals(this.medalImage, bLiveVoiceCpHouseRankAwardInfo.medalImage) && this.houseRank == bLiveVoiceCpHouseRankAwardInfo.houseRank && this.isUnLock == bLiveVoiceCpHouseRankAwardInfo.isUnLock && ValueObject.util_equals(this.medalName, bLiveVoiceCpHouseRankAwardInfo.medalName) && ValueObject.util_equals(this.houseRewardList, bLiveVoiceCpHouseRankAwardInfo.houseRewardList);
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
        String str = this.houseId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.houseLuxuryValue;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.upgradeGap;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.medalId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.houseImage;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.houseName;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.medalImage;
        int iHashCode7 = (((((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41) + this.houseRank) * 41) + (this.isUnLock ? 1231 : 1237)) * 41;
        String str8 = this.medalName;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        List<BLiveVoicehouseReward> list = this.houseRewardList;
        int iHashCode9 = iHashCode8 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.houseId == null) {
            this.houseId = "";
        }
        if (this.houseLuxuryValue == null) {
            this.houseLuxuryValue = "";
        }
        if (this.upgradeGap == null) {
            this.upgradeGap = "";
        }
        if (this.medalId == null) {
            this.medalId = "";
        }
        if (this.houseImage == null) {
            this.houseImage = "";
        }
        if (this.houseName == null) {
            this.houseName = "";
        }
        if (this.medalImage == null) {
            this.medalImage = "";
        }
        if (this.medalName == null) {
            this.medalName = "";
        }
        if (this.houseRewardList == null) {
            this.houseRewardList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
