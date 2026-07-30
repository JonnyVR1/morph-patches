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
public class BLiveTotalTaskCompleteReward extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTotalTaskCompleteReward> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTotalTaskCompleteReward>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTotalTaskCompleteReward.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTotalTaskCompleteReward.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTotalTaskCompleteReward newInstance() {
            return new BLiveTotalTaskCompleteReward();
        }

        public boolean parseField(BLiveTotalTaskCompleteReward bLiveTotalTaskCompleteReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftId":
                    bLiveTotalTaskCompleteReward.giftId = jsonParser.getValueAsLong();
                    return true;
                case "giftCount":
                    bLiveTotalTaskCompleteReward.giftCount = jsonParser.getValueAsLong();
                    return true;
                case "giftName":
                    bLiveTotalTaskCompleteReward.giftName = jsonParser.getValueAsString();
                    return true;
                case "giftImageUrl":
                    bLiveTotalTaskCompleteReward.giftImageUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTotalTaskCompleteReward bLiveTotalTaskCompleteReward, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("giftId", bLiveTotalTaskCompleteReward.giftId);
            jsonGenerator.writeNumberField("giftCount", bLiveTotalTaskCompleteReward.giftCount);
            String str = bLiveTotalTaskCompleteReward.giftName;
            if (str != null) {
                jsonGenerator.writeStringField("giftName", str);
            }
            String str2 = bLiveTotalTaskCompleteReward.giftImageUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftImageUrl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTotalTaskCompleteReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetotaltaskcompletereward";

    @ProtobufIndex(index = 2)
    public long giftCount;

    @ProtobufIndex(index = 1)
    public long giftId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String giftImageUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftName;

    public static BLiveTotalTaskCompleteReward new_() {
        BLiveTotalTaskCompleteReward bLiveTotalTaskCompleteReward = new BLiveTotalTaskCompleteReward();
        bLiveTotalTaskCompleteReward.nullCheck();
        return bLiveTotalTaskCompleteReward;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTotalTaskCompleteReward mo225055clone() {
        BLiveTotalTaskCompleteReward bLiveTotalTaskCompleteReward = new BLiveTotalTaskCompleteReward();
        bLiveTotalTaskCompleteReward.giftId = this.giftId;
        bLiveTotalTaskCompleteReward.giftCount = this.giftCount;
        bLiveTotalTaskCompleteReward.giftName = this.giftName;
        bLiveTotalTaskCompleteReward.giftImageUrl = this.giftImageUrl;
        return bLiveTotalTaskCompleteReward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTotalTaskCompleteReward)) {
            return false;
        }
        BLiveTotalTaskCompleteReward bLiveTotalTaskCompleteReward = (BLiveTotalTaskCompleteReward) obj;
        return this.giftId == bLiveTotalTaskCompleteReward.giftId && this.giftCount == bLiveTotalTaskCompleteReward.giftCount && ValueObject.util_equals(this.giftName, bLiveTotalTaskCompleteReward.giftName) && ValueObject.util_equals(this.giftImageUrl, bLiveTotalTaskCompleteReward.giftImageUrl);
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
        long j = this.giftId;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.giftCount;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.giftName;
        int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giftImageUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftName == null) {
            this.giftName = "";
        }
        if (this.giftImageUrl == null) {
            this.giftImageUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
