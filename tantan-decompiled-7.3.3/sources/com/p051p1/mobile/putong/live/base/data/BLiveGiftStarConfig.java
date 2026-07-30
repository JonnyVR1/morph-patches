package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveGiftStarConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftStarConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftStarConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftStarConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftStarConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftStarConfig newInstance() {
            return new BLiveGiftStarConfig();
        }

        public boolean parseField(BLiveGiftStarConfig bLiveGiftStarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("pollingIntervalInSeconds")) {
                bLiveGiftStarConfig.pollingIntervalInSeconds = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("scrollIntervalInSeconds")) {
                return false;
            }
            bLiveGiftStarConfig.scrollIntervalInSeconds = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftStarConfig bLiveGiftStarConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("pollingIntervalInSeconds", bLiveGiftStarConfig.pollingIntervalInSeconds);
            jsonGenerator.writeNumberField("scrollIntervalInSeconds", bLiveGiftStarConfig.scrollIntervalInSeconds);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftStarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftstarconfig";

    @ProtobufIndex(index = 1)
    public int pollingIntervalInSeconds;

    @ProtobufIndex(index = 2)
    public int scrollIntervalInSeconds;

    public static BLiveGiftStarConfig new_() {
        BLiveGiftStarConfig bLiveGiftStarConfig = new BLiveGiftStarConfig();
        bLiveGiftStarConfig.nullCheck();
        return bLiveGiftStarConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftStarConfig mo225055clone() {
        BLiveGiftStarConfig bLiveGiftStarConfig = new BLiveGiftStarConfig();
        bLiveGiftStarConfig.pollingIntervalInSeconds = this.pollingIntervalInSeconds;
        bLiveGiftStarConfig.scrollIntervalInSeconds = this.scrollIntervalInSeconds;
        return bLiveGiftStarConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftStarConfig)) {
            return false;
        }
        BLiveGiftStarConfig bLiveGiftStarConfig = (BLiveGiftStarConfig) obj;
        return this.pollingIntervalInSeconds == bLiveGiftStarConfig.pollingIntervalInSeconds && this.scrollIntervalInSeconds == bLiveGiftStarConfig.scrollIntervalInSeconds;
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
        int i2 = (((i * 41) + this.pollingIntervalInSeconds) * 41) + this.scrollIntervalInSeconds;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
