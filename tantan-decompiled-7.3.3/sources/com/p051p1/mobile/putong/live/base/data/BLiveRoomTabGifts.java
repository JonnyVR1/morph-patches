package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveTabGiftItem;
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
public class BLiveRoomTabGifts extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRoomTabGifts> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRoomTabGifts>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRoomTabGifts.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRoomTabGifts.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRoomTabGifts newInstance() {
            return new BLiveRoomTabGifts();
        }

        public boolean parseField(BLiveRoomTabGifts bLiveRoomTabGifts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "latestBagGiftUpdateTime":
                    bLiveRoomTabGifts.latestBagGiftUpdateTime = jsonParser.getValueAsLong();
                    return true;
                case "followStarResourceId":
                    bLiveRoomTabGifts.followStarResourceId = jsonParser.getValueAsString();
                    return true;
                case "region":
                    bLiveRoomTabGifts.region = LiveRegionTag.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "defaultTabId":
                    bLiveRoomTabGifts.defaultTabId = jsonParser.getValueAsInt();
                    return true;
                case "bagSystemCommentStatus":
                    bLiveRoomTabGifts.bagSystemCommentStatus = BLivePacketSystemCommentStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "defaultBagpackTabId":
                    bLiveRoomTabGifts.defaultBagpackTabId = jsonParser.getValueAsInt();
                    return true;
                case "currentCDNVersion":
                    bLiveRoomTabGifts.currentCDNVersion = jsonParser.getValueAsString();
                    return true;
                case "giftTabs":
                    bLiveRoomTabGifts.giftTabs = JsonAdapter.parseArray(jsonParser, BLiveTabGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bagpackTabs":
                    bLiveRoomTabGifts.bagpackTabs = JsonAdapter.parseArray(jsonParser, BLiveTabGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "chargeStarResourceId":
                    bLiveRoomTabGifts.chargeStarResourceId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRoomTabGifts bLiveRoomTabGifts, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRoomTabGifts.currentCDNVersion;
            if (str != null) {
                jsonGenerator.writeStringField("currentCDNVersion", str);
            }
            jsonGenerator.writeNumberField("latestBagGiftUpdateTime", bLiveRoomTabGifts.latestBagGiftUpdateTime);
            if (bLiveRoomTabGifts.giftTabs != null) {
                jsonGenerator.writeFieldName("giftTabs");
                JsonAdapter.serializeArray(bLiveRoomTabGifts.giftTabs, jsonGenerator, BLiveTabGiftItem.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("defaultTabId", bLiveRoomTabGifts.defaultTabId);
            if (bLiveRoomTabGifts.region != null) {
                jsonGenerator.writeFieldName("region");
                LiveRegionTag.JSON_ADAPTER.serialize(bLiveRoomTabGifts.region, jsonGenerator, true);
            }
            if (bLiveRoomTabGifts.bagpackTabs != null) {
                jsonGenerator.writeFieldName("bagpackTabs");
                JsonAdapter.serializeArray(bLiveRoomTabGifts.bagpackTabs, jsonGenerator, BLiveTabGiftItem.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("defaultBagpackTabId", bLiveRoomTabGifts.defaultBagpackTabId);
            String str2 = bLiveRoomTabGifts.followStarResourceId;
            if (str2 != null) {
                jsonGenerator.writeStringField("followStarResourceId", str2);
            }
            String str3 = bLiveRoomTabGifts.chargeStarResourceId;
            if (str3 != null) {
                jsonGenerator.writeStringField("chargeStarResourceId", str3);
            }
            if (bLiveRoomTabGifts.bagSystemCommentStatus != null) {
                jsonGenerator.writeFieldName("bagSystemCommentStatus");
                BLivePacketSystemCommentStatus.JSON_ADAPTER.serialize(bLiveRoomTabGifts.bagSystemCommentStatus, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRoomTabGifts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveroomtabgifts";

    @NonNull
    @ProtobufIndex(index = 11)
    public BLivePacketSystemCommentStatus bagSystemCommentStatus;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveTabGiftItem> bagpackTabs;

    @NonNull
    @ProtobufIndex(index = 9)
    public String chargeStarResourceId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String currentCDNVersion;

    @ProtobufIndex(index = 7)
    public int defaultBagpackTabId;

    @ProtobufIndex(index = 4)
    public int defaultTabId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String followStarResourceId;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveTabGiftItem> giftTabs;

    @ProtobufIndex(index = 2)
    public long latestBagGiftUpdateTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public LiveRegionTag region;

    public static BLiveRoomTabGifts new_() {
        BLiveRoomTabGifts bLiveRoomTabGifts = new BLiveRoomTabGifts();
        bLiveRoomTabGifts.nullCheck();
        return bLiveRoomTabGifts;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRoomTabGifts mo225055clone() {
        BLiveRoomTabGifts bLiveRoomTabGifts = new BLiveRoomTabGifts();
        bLiveRoomTabGifts.currentCDNVersion = this.currentCDNVersion;
        bLiveRoomTabGifts.latestBagGiftUpdateTime = this.latestBagGiftUpdateTime;
        List<BLiveTabGiftItem> list = this.giftTabs;
        if (list != null) {
            bLiveRoomTabGifts.giftTabs = ValueObject.util_map(list, new qcj() { // from class: l.j52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveTabGiftItem) obj).mo225055clone();
                }
            });
        }
        bLiveRoomTabGifts.defaultTabId = this.defaultTabId;
        bLiveRoomTabGifts.region = this.region;
        List<BLiveTabGiftItem> list2 = this.bagpackTabs;
        if (list2 != null) {
            bLiveRoomTabGifts.bagpackTabs = ValueObject.util_map(list2, new qcj() { // from class: l.k52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveTabGiftItem) obj).mo225055clone();
                }
            });
        }
        bLiveRoomTabGifts.defaultBagpackTabId = this.defaultBagpackTabId;
        bLiveRoomTabGifts.followStarResourceId = this.followStarResourceId;
        bLiveRoomTabGifts.chargeStarResourceId = this.chargeStarResourceId;
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.bagSystemCommentStatus;
        if (bLivePacketSystemCommentStatus != null) {
            bLiveRoomTabGifts.bagSystemCommentStatus = bLivePacketSystemCommentStatus.mo225055clone();
        }
        return bLiveRoomTabGifts;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRoomTabGifts)) {
            return false;
        }
        BLiveRoomTabGifts bLiveRoomTabGifts = (BLiveRoomTabGifts) obj;
        return ValueObject.util_equals(this.currentCDNVersion, bLiveRoomTabGifts.currentCDNVersion) && this.latestBagGiftUpdateTime == bLiveRoomTabGifts.latestBagGiftUpdateTime && ValueObject.util_equals(this.giftTabs, bLiveRoomTabGifts.giftTabs) && this.defaultTabId == bLiveRoomTabGifts.defaultTabId && ValueObject.util_equals(this.region, bLiveRoomTabGifts.region) && ValueObject.util_equals(this.bagpackTabs, bLiveRoomTabGifts.bagpackTabs) && this.defaultBagpackTabId == bLiveRoomTabGifts.defaultBagpackTabId && ValueObject.util_equals(this.followStarResourceId, bLiveRoomTabGifts.followStarResourceId) && ValueObject.util_equals(this.chargeStarResourceId, bLiveRoomTabGifts.chargeStarResourceId) && ValueObject.util_equals(this.bagSystemCommentStatus, bLiveRoomTabGifts.bagSystemCommentStatus);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int getDefaultTabId(boolean z) {
        return z ? this.defaultBagpackTabId : this.defaultTabId;
    }

    public List<BLiveTabGiftItem> getGiftTabs(boolean z) {
        return z ? this.bagpackTabs : this.giftTabs;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.currentCDNVersion;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.latestBagGiftUpdateTime;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        List<BLiveTabGiftItem> list = this.giftTabs;
        int iHashCode2 = (((i3 + (list != null ? list.hashCode() : 0)) * 41) + this.defaultTabId) * 41;
        LiveRegionTag liveRegionTag = this.region;
        int iHashCode3 = (iHashCode2 + (liveRegionTag != null ? liveRegionTag.hashCode() : 0)) * 41;
        List<BLiveTabGiftItem> list2 = this.bagpackTabs;
        int iHashCode4 = (((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41) + this.defaultBagpackTabId) * 41;
        String str2 = this.followStarResourceId;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.chargeStarResourceId;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.bagSystemCommentStatus;
        int iHashCode7 = iHashCode6 + (bLivePacketSystemCommentStatus != null ? bLivePacketSystemCommentStatus.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.currentCDNVersion == null) {
            this.currentCDNVersion = "";
        }
        if (this.giftTabs == null) {
            this.giftTabs = new ArrayList();
        }
        if (this.region == null) {
            this.region = (LiveRegionTag) LiveRegionTag.JSON_ADAPTER.defaultEnum();
        }
        if (this.bagpackTabs == null) {
            this.bagpackTabs = new ArrayList();
        }
        if (this.followStarResourceId == null) {
            this.followStarResourceId = "";
        }
        if (this.chargeStarResourceId == null) {
            this.chargeStarResourceId = "";
        }
        if (this.bagSystemCommentStatus == null) {
            this.bagSystemCommentStatus = BLivePacketSystemCommentStatus.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
