package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p046p1.mobile.putong.live.base.data.BLivePledgeAuctionRight;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAuctionAsset extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionAsset> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionAsset>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionAsset.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionAsset.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionAsset newInstance() {
            return new BLiveAuctionAsset();
        }

        public boolean parseField(BLiveAuctionAsset bLiveAuctionAsset, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pledgeAuctionRights":
                    bLiveAuctionAsset.pledgeAuctionRights = JsonAdapter.parseArray(jsonParser, BLivePledgeAuctionRight.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "auctionRelationUnbindTTC":
                    bLiveAuctionAsset.auctionRelationUnbindTTC = jsonParser.getValueAsLong();
                    return true;
                case "pledgeAuctionRelations":
                    bLiveAuctionAsset.pledgeAuctionRelations = JsonAdapter.parseArray(jsonParser, BLiveAuctionRelation.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "auctionRelations":
                    bLiveAuctionAsset.auctionRelations = JsonAdapter.parseArray(jsonParser, BLiveAuctionRelation.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "auctionLevels":
                    bLiveAuctionAsset.auctionLevels = JsonAdapter.parseArray(jsonParser, BLiveAuctionLevel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "auctionRelationUnbindFreeCount":
                    bLiveAuctionAsset.auctionRelationUnbindFreeCount = jsonParser.getValueAsInt();
                    return true;
                case "autoRefreshSeconds":
                    bLiveAuctionAsset.autoRefreshSeconds = jsonParser.getValueAsInt();
                    return true;
                case "auctionRelationUnbindTips":
                    bLiveAuctionAsset.auctionRelationUnbindTips = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionAsset bLiveAuctionAsset, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("autoRefreshSeconds", bLiveAuctionAsset.autoRefreshSeconds);
            if (bLiveAuctionAsset.auctionRelations != null) {
                jsonGenerator.writeFieldName("auctionRelations");
                JsonAdapter.serializeArray(bLiveAuctionAsset.auctionRelations, jsonGenerator, BLiveAuctionRelation.JSON_ADAPTER);
            }
            if (bLiveAuctionAsset.auctionLevels != null) {
                jsonGenerator.writeFieldName("auctionLevels");
                JsonAdapter.serializeArray(bLiveAuctionAsset.auctionLevels, jsonGenerator, BLiveAuctionLevel.JSON_ADAPTER);
            }
            if (bLiveAuctionAsset.pledgeAuctionRelations != null) {
                jsonGenerator.writeFieldName("pledgeAuctionRelations");
                JsonAdapter.serializeArray(bLiveAuctionAsset.pledgeAuctionRelations, jsonGenerator, BLiveAuctionRelation.JSON_ADAPTER);
            }
            if (bLiveAuctionAsset.pledgeAuctionRights != null) {
                jsonGenerator.writeFieldName("pledgeAuctionRights");
                JsonAdapter.serializeArray(bLiveAuctionAsset.pledgeAuctionRights, jsonGenerator, BLivePledgeAuctionRight.JSON_ADAPTER);
            }
            String str = bLiveAuctionAsset.auctionRelationUnbindTips;
            if (str != null) {
                jsonGenerator.writeStringField("auctionRelationUnbindTips", str);
            }
            jsonGenerator.writeNumberField("auctionRelationUnbindTTC", bLiveAuctionAsset.auctionRelationUnbindTTC);
            jsonGenerator.writeNumberField("auctionRelationUnbindFreeCount", bLiveAuctionAsset.auctionRelationUnbindFreeCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionAsset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctionasset";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveAuctionLevel> auctionLevels;

    @ProtobufIndex(index = 8)
    public int auctionRelationUnbindFreeCount;

    @ProtobufIndex(index = 7)
    public long auctionRelationUnbindTTC;

    @NonNull
    @ProtobufIndex(index = 6)
    public String auctionRelationUnbindTips;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveAuctionRelation> auctionRelations;

    @ProtobufIndex(index = 1)
    public int autoRefreshSeconds;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveAuctionRelation> pledgeAuctionRelations;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLivePledgeAuctionRight> pledgeAuctionRights;

    public static BLiveAuctionAsset new_() {
        BLiveAuctionAsset bLiveAuctionAsset = new BLiveAuctionAsset();
        bLiveAuctionAsset.nullCheck();
        return bLiveAuctionAsset;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionAsset mo223809clone() {
        BLiveAuctionAsset bLiveAuctionAsset = new BLiveAuctionAsset();
        bLiveAuctionAsset.autoRefreshSeconds = this.autoRefreshSeconds;
        List<BLiveAuctionRelation> list = this.auctionRelations;
        if (list != null) {
            bLiveAuctionAsset.auctionRelations = ValueObject.util_map(list, new w9j() { // from class: l.fr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveAuctionRelation) obj).mo223809clone();
                }
            });
        }
        List<BLiveAuctionLevel> list2 = this.auctionLevels;
        if (list2 != null) {
            bLiveAuctionAsset.auctionLevels = ValueObject.util_map(list2, new w9j() { // from class: l.gr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveAuctionLevel) obj).mo223809clone();
                }
            });
        }
        List<BLiveAuctionRelation> list3 = this.pledgeAuctionRelations;
        if (list3 != null) {
            bLiveAuctionAsset.pledgeAuctionRelations = ValueObject.util_map(list3, new w9j() { // from class: l.hr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveAuctionRelation) obj).mo223809clone();
                }
            });
        }
        List<BLivePledgeAuctionRight> list4 = this.pledgeAuctionRights;
        if (list4 != null) {
            bLiveAuctionAsset.pledgeAuctionRights = ValueObject.util_map(list4, new w9j() { // from class: l.ir1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLivePledgeAuctionRight) obj).mo223809clone();
                }
            });
        }
        bLiveAuctionAsset.auctionRelationUnbindTips = this.auctionRelationUnbindTips;
        bLiveAuctionAsset.auctionRelationUnbindTTC = this.auctionRelationUnbindTTC;
        bLiveAuctionAsset.auctionRelationUnbindFreeCount = this.auctionRelationUnbindFreeCount;
        return bLiveAuctionAsset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionAsset)) {
            return false;
        }
        BLiveAuctionAsset bLiveAuctionAsset = (BLiveAuctionAsset) obj;
        return this.autoRefreshSeconds == bLiveAuctionAsset.autoRefreshSeconds && ValueObject.util_equals(this.auctionRelations, bLiveAuctionAsset.auctionRelations) && ValueObject.util_equals(this.auctionLevels, bLiveAuctionAsset.auctionLevels) && ValueObject.util_equals(this.pledgeAuctionRelations, bLiveAuctionAsset.pledgeAuctionRelations) && ValueObject.util_equals(this.pledgeAuctionRights, bLiveAuctionAsset.pledgeAuctionRights) && ValueObject.util_equals(this.auctionRelationUnbindTips, bLiveAuctionAsset.auctionRelationUnbindTips) && this.auctionRelationUnbindTTC == bLiveAuctionAsset.auctionRelationUnbindTTC && this.auctionRelationUnbindFreeCount == bLiveAuctionAsset.auctionRelationUnbindFreeCount;
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
        int i2 = ((i * 41) + this.autoRefreshSeconds) * 41;
        List<BLiveAuctionRelation> list = this.auctionRelations;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveAuctionLevel> list2 = this.auctionLevels;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveAuctionRelation> list3 = this.pledgeAuctionRelations;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<BLivePledgeAuctionRight> list4 = this.pledgeAuctionRights;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        String str = this.auctionRelationUnbindTips;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        long j = this.auctionRelationUnbindTTC;
        int i3 = ((((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.auctionRelationUnbindFreeCount;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.auctionRelations == null) {
            this.auctionRelations = new ArrayList();
        }
        if (this.auctionLevels == null) {
            this.auctionLevels = new ArrayList();
        }
        if (this.pledgeAuctionRelations == null) {
            this.pledgeAuctionRelations = new ArrayList();
        }
        if (this.pledgeAuctionRights == null) {
            this.pledgeAuctionRights = new ArrayList();
        }
        if (this.auctionRelationUnbindTips == null) {
            this.auctionRelationUnbindTips = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
