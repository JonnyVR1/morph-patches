package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCampaignNotifyData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCampaignNotifyData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCampaignNotifyData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCampaignNotifyData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCampaignNotifyData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCampaignNotifyData newInstance() {
            return new BLiveCampaignNotifyData();
        }

        public boolean parseField(BLiveCampaignNotifyData bLiveCampaignNotifyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveCampaignNotifyData.duration = jsonParser.getValueAsLong();
                    return true;
                case "campaignId":
                    bLiveCampaignNotifyData.campaignId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveCampaignNotifyData.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveCampaignNotifyData.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveCampaignNotifyData.roomId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCampaignNotifyData bLiveCampaignNotifyData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCampaignNotifyData.campaignId;
            if (str != null) {
                jsonGenerator.writeStringField("campaignId", str);
            }
            String str2 = bLiveCampaignNotifyData.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveCampaignNotifyData.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveCampaignNotifyData.duration);
            String str4 = bLiveCampaignNotifyData.anchorId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorId", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCampaignNotifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecampaignnotifydata";

    @NonNull
    @ProtobufIndex(index = 5)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String campaignId;

    @ProtobufIndex(index = 4)
    public long duration;

    @NonNull
    @ProtobufIndex(index = 3)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    public static BLiveCampaignNotifyData new_() {
        BLiveCampaignNotifyData bLiveCampaignNotifyData = new BLiveCampaignNotifyData();
        bLiveCampaignNotifyData.nullCheck();
        return bLiveCampaignNotifyData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCampaignNotifyData mo223809clone() {
        BLiveCampaignNotifyData bLiveCampaignNotifyData = new BLiveCampaignNotifyData();
        bLiveCampaignNotifyData.campaignId = this.campaignId;
        bLiveCampaignNotifyData.roomId = this.roomId;
        bLiveCampaignNotifyData.liveId = this.liveId;
        bLiveCampaignNotifyData.duration = this.duration;
        bLiveCampaignNotifyData.anchorId = this.anchorId;
        return bLiveCampaignNotifyData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCampaignNotifyData)) {
            return false;
        }
        BLiveCampaignNotifyData bLiveCampaignNotifyData = (BLiveCampaignNotifyData) obj;
        return ValueObject.util_equals(this.campaignId, bLiveCampaignNotifyData.campaignId) && ValueObject.util_equals(this.roomId, bLiveCampaignNotifyData.roomId) && ValueObject.util_equals(this.liveId, bLiveCampaignNotifyData.liveId) && this.duration == bLiveCampaignNotifyData.duration && ValueObject.util_equals(this.anchorId, bLiveCampaignNotifyData.anchorId);
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
        String str = this.campaignId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.duration;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.anchorId;
        int iHashCode4 = i3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.campaignId == null) {
            this.campaignId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
