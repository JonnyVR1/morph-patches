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
public class BLiveSlotGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSlotGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSlotGiftInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSlotGiftInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSlotGiftInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSlotGiftInfo newInstance() {
            return new BLiveSlotGiftInfo();
        }

        public boolean parseField(BLiveSlotGiftInfo bLiveSlotGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "slotId":
                    bLiveSlotGiftInfo.slotId = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveSlotGiftInfo.type = jsonParser.getValueAsString();
                    return true;
                case "giftLevel":
                    bLiveSlotGiftInfo.giftLevel = BLiveSlotGiftLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSlotGiftInfo bLiveSlotGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSlotGiftInfo.slotId;
            if (str != null) {
                jsonGenerator.writeStringField("slotId", str);
            }
            String str2 = bLiveSlotGiftInfo.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLiveSlotGiftInfo.giftLevel != null) {
                jsonGenerator.writeFieldName("giftLevel");
                BLiveSlotGiftLevel.JSON_ADAPTER.serialize(bLiveSlotGiftInfo.giftLevel, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSlotGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveslotgiftinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveSlotGiftLevel giftLevel;

    @NonNull
    @ProtobufIndex(index = 1)
    public String slotId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveSlotGiftInfo new_() {
        BLiveSlotGiftInfo bLiveSlotGiftInfo = new BLiveSlotGiftInfo();
        bLiveSlotGiftInfo.nullCheck();
        return bLiveSlotGiftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSlotGiftInfo mo223809clone() {
        BLiveSlotGiftInfo bLiveSlotGiftInfo = new BLiveSlotGiftInfo();
        bLiveSlotGiftInfo.slotId = this.slotId;
        bLiveSlotGiftInfo.type = this.type;
        BLiveSlotGiftLevel bLiveSlotGiftLevel = this.giftLevel;
        if (bLiveSlotGiftLevel != null) {
            bLiveSlotGiftInfo.giftLevel = bLiveSlotGiftLevel.mo223809clone();
        }
        return bLiveSlotGiftInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSlotGiftInfo)) {
            return false;
        }
        BLiveSlotGiftInfo bLiveSlotGiftInfo = (BLiveSlotGiftInfo) obj;
        return ValueObject.util_equals(this.slotId, bLiveSlotGiftInfo.slotId) && ValueObject.util_equals(this.type, bLiveSlotGiftInfo.type) && ValueObject.util_equals(this.giftLevel, bLiveSlotGiftInfo.giftLevel);
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
        String str = this.slotId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveSlotGiftLevel bLiveSlotGiftLevel = this.giftLevel;
        int iHashCode3 = iHashCode2 + (bLiveSlotGiftLevel != null ? bLiveSlotGiftLevel.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.slotId == null) {
            this.slotId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.giftLevel == null) {
            this.giftLevel = BLiveSlotGiftLevel.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
