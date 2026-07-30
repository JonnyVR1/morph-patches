package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstChargeActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
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
public class BLiveFirstChargeCampaign extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFirstChargeCampaign> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFirstChargeCampaign>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFirstChargeCampaign.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFirstChargeCampaign newInstance() {
            return new BLiveFirstChargeCampaign();
        }

        public boolean parseField(BLiveFirstChargeCampaign bLiveFirstChargeCampaign, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "firstEnterLiveRoomTime":
                    bLiveFirstChargeCampaign.firstEnterLiveRoomTime = jsonParser.getValueAsLong();
                    return true;
                case "detailInset":
                    bLiveFirstChargeCampaign.detailInset = JsonAdapter.parseArray(jsonParser, JsonAdapter.DOUBLE_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "detailUrl":
                    bLiveFirstChargeCampaign.detailUrl = jsonParser.getValueAsString();
                    return true;
                case "firstChargeStatus":
                    bLiveFirstChargeCampaign.firstChargeStatus = BLiveFirstChargeStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "activityArray":
                    bLiveFirstChargeCampaign.activityArray = JsonAdapter.parseArray(jsonParser, BLiveFirstChargeActivity.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isCoinRecharged":
                    bLiveFirstChargeCampaign.isCoinRecharged = jsonParser.getValueAsBoolean();
                    return true;
                case "hasConsumedGift":
                    bLiveFirstChargeCampaign.hasConsumedGift = jsonParser.getValueAsBoolean();
                    return true;
                case "position":
                    bLiveFirstChargeCampaign.position = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFirstChargeCampaign bLiveFirstChargeCampaign, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isCoinRecharged", bLiveFirstChargeCampaign.isCoinRecharged);
            jsonGenerator.writeNumberField("firstEnterLiveRoomTime", bLiveFirstChargeCampaign.firstEnterLiveRoomTime);
            if (bLiveFirstChargeCampaign.firstChargeStatus != null) {
                jsonGenerator.writeFieldName("firstChargeStatus");
                BLiveFirstChargeStatus.JSON_ADAPTER.serialize(bLiveFirstChargeCampaign.firstChargeStatus, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("position", bLiveFirstChargeCampaign.position);
            String str = bLiveFirstChargeCampaign.detailUrl;
            if (str != null) {
                jsonGenerator.writeStringField("detailUrl", str);
            }
            if (bLiveFirstChargeCampaign.detailInset != null) {
                jsonGenerator.writeFieldName("detailInset");
                JsonAdapter.serializeArray(bLiveFirstChargeCampaign.detailInset, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
            if (bLiveFirstChargeCampaign.activityArray != null) {
                jsonGenerator.writeFieldName("activityArray");
                JsonAdapter.serializeArray(bLiveFirstChargeCampaign.activityArray, jsonGenerator, BLiveFirstChargeActivity.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("hasConsumedGift", bLiveFirstChargeCampaign.hasConsumedGift);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFirstChargeCampaign) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefirstchargecampaign";

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveFirstChargeActivity> activityArray;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<Double> detailInset;

    @NonNull
    @ProtobufIndex(index = 5)
    public String detailUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveFirstChargeStatus firstChargeStatus;

    @ProtobufIndex(index = 2)
    public long firstEnterLiveRoomTime;

    @ProtobufIndex(index = 8)
    public boolean hasConsumedGift;

    @ProtobufIndex(index = 1)
    public boolean isCoinRecharged;

    @ProtobufIndex(index = 4)
    public int position;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Double m67956b(Double d) {
        return d;
    }

    public static BLiveFirstChargeCampaign new_() {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign = new BLiveFirstChargeCampaign();
        bLiveFirstChargeCampaign.nullCheck();
        return bLiveFirstChargeCampaign;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFirstChargeCampaign mo223809clone() {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign = new BLiveFirstChargeCampaign();
        bLiveFirstChargeCampaign.isCoinRecharged = this.isCoinRecharged;
        bLiveFirstChargeCampaign.firstEnterLiveRoomTime = this.firstEnterLiveRoomTime;
        bLiveFirstChargeCampaign.firstChargeStatus = this.firstChargeStatus;
        bLiveFirstChargeCampaign.position = this.position;
        bLiveFirstChargeCampaign.detailUrl = this.detailUrl;
        List<Double> list = this.detailInset;
        if (list != null) {
            bLiveFirstChargeCampaign.detailInset = ValueObject.util_map(list, new w9j() { // from class: l.uz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveFirstChargeCampaign.m67956b((Double) obj);
                }
            });
        }
        List<BLiveFirstChargeActivity> list2 = this.activityArray;
        if (list2 != null) {
            bLiveFirstChargeCampaign.activityArray = ValueObject.util_map(list2, new w9j() { // from class: l.vz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveFirstChargeActivity) obj).mo223809clone();
                }
            });
        }
        bLiveFirstChargeCampaign.hasConsumedGift = this.hasConsumedGift;
        return bLiveFirstChargeCampaign;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFirstChargeCampaign)) {
            return false;
        }
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign = (BLiveFirstChargeCampaign) obj;
        return this.isCoinRecharged == bLiveFirstChargeCampaign.isCoinRecharged && this.firstEnterLiveRoomTime == bLiveFirstChargeCampaign.firstEnterLiveRoomTime && ValueObject.util_equals(this.firstChargeStatus, bLiveFirstChargeCampaign.firstChargeStatus) && this.position == bLiveFirstChargeCampaign.position && ValueObject.util_equals(this.detailUrl, bLiveFirstChargeCampaign.detailUrl) && ValueObject.util_equals(this.detailInset, bLiveFirstChargeCampaign.detailInset) && ValueObject.util_equals(this.activityArray, bLiveFirstChargeCampaign.activityArray) && this.hasConsumedGift == bLiveFirstChargeCampaign.hasConsumedGift;
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
        int i3 = this.isCoinRecharged ? 1231 : 1237;
        long j = this.firstEnterLiveRoomTime;
        int i4 = (((i2 + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveFirstChargeStatus bLiveFirstChargeStatus = this.firstChargeStatus;
        int iHashCode = (((i4 + (bLiveFirstChargeStatus != null ? bLiveFirstChargeStatus.hashCode() : 0)) * 41) + this.position) * 41;
        String str = this.detailUrl;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<Double> list = this.detailInset;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveFirstChargeActivity> list2 = this.activityArray;
        int iHashCode4 = ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.hasConsumedGift ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.firstChargeStatus == null) {
            this.firstChargeStatus = (BLiveFirstChargeStatus) BLiveFirstChargeStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.detailUrl == null) {
            this.detailUrl = "";
        }
        if (this.detailInset == null) {
            this.detailInset = new ArrayList();
        }
        if (this.activityArray == null) {
            this.activityArray = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
