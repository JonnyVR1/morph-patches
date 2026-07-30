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
public class BLiveVoiceHouseRankUpgradeInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceHouseRankUpgradeInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceHouseRankUpgradeInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceHouseRankUpgradeInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceHouseRankUpgradeInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceHouseRankUpgradeInfo newInstance() {
            return new BLiveVoiceHouseRankUpgradeInfo();
        }

        public boolean parseField(BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "profileEffectImage":
                    bLiveVoiceHouseRankUpgradeInfo.profileEffectImage = jsonParser.getValueAsString();
                    return true;
                case "maxRankHouseInfo":
                    bLiveVoiceHouseRankUpgradeInfo.maxRankHouseInfo = BLiveVoiceCpHouseInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileVideoEffect":
                    bLiveVoiceHouseRankUpgradeInfo.profileVideoEffect = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceHouseRankUpgradeInfo.maxRankHouseInfo != null) {
                jsonGenerator.writeFieldName("maxRankHouseInfo");
                BLiveVoiceCpHouseInfo.JSON_ADAPTER.serialize(bLiveVoiceHouseRankUpgradeInfo.maxRankHouseInfo, jsonGenerator, true);
            }
            String str = bLiveVoiceHouseRankUpgradeInfo.profileEffectImage;
            if (str != null) {
                jsonGenerator.writeStringField("profileEffectImage", str);
            }
            String str2 = bLiveVoiceHouseRankUpgradeInfo.profileVideoEffect;
            if (str2 != null) {
                jsonGenerator.writeStringField("profileVideoEffect", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceHouseRankUpgradeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicehouserankupgradeinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveVoiceCpHouseInfo maxRankHouseInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public String profileEffectImage;

    @NonNull
    @ProtobufIndex(index = 3)
    public String profileVideoEffect;

    public static BLiveVoiceHouseRankUpgradeInfo new_() {
        BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo = new BLiveVoiceHouseRankUpgradeInfo();
        bLiveVoiceHouseRankUpgradeInfo.nullCheck();
        return bLiveVoiceHouseRankUpgradeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceHouseRankUpgradeInfo mo225055clone() {
        BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo = new BLiveVoiceHouseRankUpgradeInfo();
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.maxRankHouseInfo;
        if (bLiveVoiceCpHouseInfo != null) {
            bLiveVoiceHouseRankUpgradeInfo.maxRankHouseInfo = bLiveVoiceCpHouseInfo.mo225055clone();
        }
        bLiveVoiceHouseRankUpgradeInfo.profileEffectImage = this.profileEffectImage;
        bLiveVoiceHouseRankUpgradeInfo.profileVideoEffect = this.profileVideoEffect;
        return bLiveVoiceHouseRankUpgradeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceHouseRankUpgradeInfo)) {
            return false;
        }
        BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo = (BLiveVoiceHouseRankUpgradeInfo) obj;
        return ValueObject.util_equals(this.maxRankHouseInfo, bLiveVoiceHouseRankUpgradeInfo.maxRankHouseInfo) && ValueObject.util_equals(this.profileEffectImage, bLiveVoiceHouseRankUpgradeInfo.profileEffectImage) && ValueObject.util_equals(this.profileVideoEffect, bLiveVoiceHouseRankUpgradeInfo.profileVideoEffect);
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
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.maxRankHouseInfo;
        int iHashCode = (i2 + (bLiveVoiceCpHouseInfo != null ? bLiveVoiceCpHouseInfo.hashCode() : 0)) * 41;
        String str = this.profileEffectImage;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.profileVideoEffect;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.maxRankHouseInfo == null) {
            this.maxRankHouseInfo = BLiveVoiceCpHouseInfo.new_();
        }
        if (this.profileEffectImage == null) {
            this.profileEffectImage = "";
        }
        if (this.profileVideoEffect == null) {
            this.profileVideoEffect = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
