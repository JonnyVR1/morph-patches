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
public class BLiveGiftGearEffectInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftGearEffectInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftGearEffectInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftGearEffectInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftGearEffectInfo newInstance() {
            return new BLiveGiftGearEffectInfo();
        }

        public boolean parseField(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveResourceId":
                    bLiveGiftGearEffectInfo.liveResourceId = jsonParser.getValueAsString();
                    return true;
                case "trayDuration":
                    bLiveGiftGearEffectInfo.trayDuration = jsonParser.getValueAsLong();
                    return true;
                case "since":
                    bLiveGiftGearEffectInfo.since = jsonParser.getValueAsLong();
                    return true;
                case "until":
                    bLiveGiftGearEffectInfo.until = jsonParser.getValueAsLong();
                    return true;
                case "liveGiftLevel":
                    bLiveGiftGearEffectInfo.liveGiftLevel = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("since", bLiveGiftGearEffectInfo.since);
            jsonGenerator.writeNumberField("until", bLiveGiftGearEffectInfo.until);
            jsonGenerator.writeNumberField("liveGiftLevel", bLiveGiftGearEffectInfo.liveGiftLevel);
            jsonGenerator.writeNumberField("trayDuration", bLiveGiftGearEffectInfo.trayDuration);
            String str = bLiveGiftGearEffectInfo.liveResourceId;
            if (str != null) {
                jsonGenerator.writeStringField("liveResourceId", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftGearEffectInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftgeareffectinfo";

    @ProtobufIndex(index = 3)
    public int liveGiftLevel;

    @NonNull
    @ProtobufIndex(index = 5)
    public String liveResourceId;

    @ProtobufIndex(index = 1)
    public long since;

    @ProtobufIndex(index = 4)
    public long trayDuration;

    @ProtobufIndex(index = 2)
    public long until;

    public static BLiveGiftGearEffectInfo new_() {
        BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo = new BLiveGiftGearEffectInfo();
        bLiveGiftGearEffectInfo.nullCheck();
        return bLiveGiftGearEffectInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftGearEffectInfo mo223809clone() {
        BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo = new BLiveGiftGearEffectInfo();
        bLiveGiftGearEffectInfo.since = this.since;
        bLiveGiftGearEffectInfo.until = this.until;
        bLiveGiftGearEffectInfo.liveGiftLevel = this.liveGiftLevel;
        bLiveGiftGearEffectInfo.trayDuration = this.trayDuration;
        bLiveGiftGearEffectInfo.liveResourceId = this.liveResourceId;
        return bLiveGiftGearEffectInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftGearEffectInfo)) {
            return false;
        }
        BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo = (BLiveGiftGearEffectInfo) obj;
        return this.since == bLiveGiftGearEffectInfo.since && this.until == bLiveGiftGearEffectInfo.until && this.liveGiftLevel == bLiveGiftGearEffectInfo.liveGiftLevel && this.trayDuration == bLiveGiftGearEffectInfo.trayDuration && ValueObject.util_equals(this.liveResourceId, bLiveGiftGearEffectInfo.liveResourceId);
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
        long j = this.since;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.until;
        int i3 = (((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.liveGiftLevel) * 41;
        long j3 = this.trayDuration;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str = this.liveResourceId;
        int iHashCode = i4 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveResourceId == null) {
            this.liveResourceId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
