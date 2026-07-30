package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUpgradeGiftEquipInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUpgradeGiftEquipInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUpgradeGiftEquipInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftEquipInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUpgradeGiftEquipInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUpgradeGiftEquipInfo newInstance() {
            return new BLiveUpgradeGiftEquipInfo();
        }

        public boolean parseField(BLiveUpgradeGiftEquipInfo bLiveUpgradeGiftEquipInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "itemId":
                    bLiveUpgradeGiftEquipInfo.itemId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveUpgradeGiftEquipInfo.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveUpgradeGiftEquipInfo.roomId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUpgradeGiftEquipInfo bLiveUpgradeGiftEquipInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUpgradeGiftEquipInfo.itemId;
            if (str != null) {
                jsonGenerator.writeStringField("itemId", str);
            }
            String str2 = bLiveUpgradeGiftEquipInfo.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveUpgradeGiftEquipInfo.anchorId;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorId", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUpgradeGiftEquipInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveupgradegiftequipinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    public static BLiveUpgradeGiftEquipInfo new_() {
        BLiveUpgradeGiftEquipInfo bLiveUpgradeGiftEquipInfo = new BLiveUpgradeGiftEquipInfo();
        bLiveUpgradeGiftEquipInfo.nullCheck();
        return bLiveUpgradeGiftEquipInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUpgradeGiftEquipInfo mo225055clone() {
        BLiveUpgradeGiftEquipInfo bLiveUpgradeGiftEquipInfo = new BLiveUpgradeGiftEquipInfo();
        bLiveUpgradeGiftEquipInfo.itemId = this.itemId;
        bLiveUpgradeGiftEquipInfo.roomId = this.roomId;
        bLiveUpgradeGiftEquipInfo.anchorId = this.anchorId;
        return bLiveUpgradeGiftEquipInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUpgradeGiftEquipInfo)) {
            return false;
        }
        BLiveUpgradeGiftEquipInfo bLiveUpgradeGiftEquipInfo = (BLiveUpgradeGiftEquipInfo) obj;
        return ValueObject.util_equals(this.itemId, bLiveUpgradeGiftEquipInfo.itemId) && ValueObject.util_equals(this.roomId, bLiveUpgradeGiftEquipInfo.roomId) && ValueObject.util_equals(this.anchorId, bLiveUpgradeGiftEquipInfo.anchorId);
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
        String str = this.itemId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
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
