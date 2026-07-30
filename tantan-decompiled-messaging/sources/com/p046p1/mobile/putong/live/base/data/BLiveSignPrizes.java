package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveSignPrizesRewards;
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
public class BLiveSignPrizes extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSignPrizes> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSignPrizes>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSignPrizes.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSignPrizes.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSignPrizes newInstance() {
            return new BLiveSignPrizes();
        }

        public boolean parseField(BLiveSignPrizes bLiveSignPrizes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "rewardId":
                    bLiveSignPrizes.rewardId = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveSignPrizes.title = jsonParser.getValueAsString();
                    return true;
                case "rewards":
                    bLiveSignPrizes.rewards = JsonAdapter.parseArray(jsonParser, BLiveSignPrizesRewards.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSignPrizes bLiveSignPrizes, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSignPrizes.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveSignPrizes.rewardId;
            if (str2 != null) {
                jsonGenerator.writeStringField("rewardId", str2);
            }
            if (bLiveSignPrizes.rewards != null) {
                jsonGenerator.writeFieldName("rewards");
                JsonAdapter.serializeArray(bLiveSignPrizes.rewards, jsonGenerator, BLiveSignPrizesRewards.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSignPrizes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesignprizes";

    @NonNull
    @ProtobufIndex(index = 2)
    public String rewardId;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveSignPrizesRewards> rewards;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveSignPrizes new_() {
        BLiveSignPrizes bLiveSignPrizes = new BLiveSignPrizes();
        bLiveSignPrizes.nullCheck();
        return bLiveSignPrizes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSignPrizes mo223809clone() {
        BLiveSignPrizes bLiveSignPrizes = new BLiveSignPrizes();
        bLiveSignPrizes.title = this.title;
        bLiveSignPrizes.rewardId = this.rewardId;
        List<BLiveSignPrizesRewards> list = this.rewards;
        if (list != null) {
            bLiveSignPrizes.rewards = ValueObject.util_map(list, new w9j() { // from class: l.z52
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSignPrizesRewards) obj).mo223809clone();
                }
            });
        }
        return bLiveSignPrizes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSignPrizes)) {
            return false;
        }
        BLiveSignPrizes bLiveSignPrizes = (BLiveSignPrizes) obj;
        return ValueObject.util_equals(this.title, bLiveSignPrizes.title) && ValueObject.util_equals(this.rewardId, bLiveSignPrizes.rewardId) && ValueObject.util_equals(this.rewards, bLiveSignPrizes.rewards);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.rewardId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveSignPrizesRewards> list = this.rewards;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.rewardId == null) {
            this.rewardId = "";
        }
        if (this.rewards == null) {
            this.rewards = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
