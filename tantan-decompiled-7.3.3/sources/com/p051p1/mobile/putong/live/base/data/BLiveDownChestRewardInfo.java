package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveDownBoxRewards;
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
public class BLiveDownChestRewardInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDownChestRewardInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDownChestRewardInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDownChestRewardInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDownChestRewardInfo newInstance() {
            return new BLiveDownChestRewardInfo();
        }

        public boolean parseField(BLiveDownChestRewardInfo bLiveDownChestRewardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "contents":
                    bLiveDownChestRewardInfo.contents = JsonAdapter.parseArray(jsonParser, BLiveCommonViewConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "jump":
                    bLiveDownChestRewardInfo.jump = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "rewards":
                    bLiveDownChestRewardInfo.rewards = JsonAdapter.parseArray(jsonParser, BLiveDownBoxRewards.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDownChestRewardInfo bLiveDownChestRewardInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveDownChestRewardInfo.contents != null) {
                jsonGenerator.writeFieldName("contents");
                JsonAdapter.serializeArray(bLiveDownChestRewardInfo.contents, jsonGenerator, BLiveCommonViewConfig.JSON_ADAPTER);
            }
            if (bLiveDownChestRewardInfo.rewards != null) {
                jsonGenerator.writeFieldName("rewards");
                JsonAdapter.serializeArray(bLiveDownChestRewardInfo.rewards, jsonGenerator, BLiveDownBoxRewards.JSON_ADAPTER);
            }
            if (bLiveDownChestRewardInfo.jump != null) {
                jsonGenerator.writeFieldName("jump");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveDownChestRewardInfo.jump, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDownChestRewardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedownchestrewardinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveCommonViewConfig> contents;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveCommonViewConfig jump;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveDownBoxRewards> rewards;

    public static BLiveDownChestRewardInfo new_() {
        BLiveDownChestRewardInfo bLiveDownChestRewardInfo = new BLiveDownChestRewardInfo();
        bLiveDownChestRewardInfo.nullCheck();
        return bLiveDownChestRewardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDownChestRewardInfo mo225055clone() {
        BLiveDownChestRewardInfo bLiveDownChestRewardInfo = new BLiveDownChestRewardInfo();
        List<BLiveCommonViewConfig> list = this.contents;
        if (list != null) {
            bLiveDownChestRewardInfo.contents = ValueObject.util_map(list, new qcj() { // from class: l.bz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCommonViewConfig) obj).mo225055clone();
                }
            });
        }
        List<BLiveDownBoxRewards> list2 = this.rewards;
        if (list2 != null) {
            bLiveDownChestRewardInfo.rewards = ValueObject.util_map(list2, new qcj() { // from class: l.cz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveDownBoxRewards) obj).mo225055clone();
                }
            });
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = this.jump;
        if (bLiveCommonViewConfig != null) {
            bLiveDownChestRewardInfo.jump = bLiveCommonViewConfig.mo225055clone();
        }
        return bLiveDownChestRewardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDownChestRewardInfo)) {
            return false;
        }
        BLiveDownChestRewardInfo bLiveDownChestRewardInfo = (BLiveDownChestRewardInfo) obj;
        return ValueObject.util_equals(this.contents, bLiveDownChestRewardInfo.contents) && ValueObject.util_equals(this.rewards, bLiveDownChestRewardInfo.rewards) && ValueObject.util_equals(this.jump, bLiveDownChestRewardInfo.jump);
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
        List<BLiveCommonViewConfig> list = this.contents;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveDownBoxRewards> list2 = this.rewards;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveCommonViewConfig bLiveCommonViewConfig = this.jump;
        int iHashCode3 = iHashCode2 + (bLiveCommonViewConfig != null ? bLiveCommonViewConfig.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.contents == null) {
            this.contents = new ArrayList();
        }
        if (this.rewards == null) {
            this.rewards = new ArrayList();
        }
        if (this.jump == null) {
            this.jump = BLiveCommonViewConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
