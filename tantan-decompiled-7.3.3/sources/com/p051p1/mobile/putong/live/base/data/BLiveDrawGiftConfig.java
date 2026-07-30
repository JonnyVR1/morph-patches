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
public class BLiveDrawGiftConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDrawGiftConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDrawGiftConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDrawGiftConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDrawGiftConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDrawGiftConfig newInstance() {
            return new BLiveDrawGiftConfig();
        }

        public boolean parseField(BLiveDrawGiftConfig bLiveDrawGiftConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "playDisplayLongDelay":
                    bLiveDrawGiftConfig.playDisplayLongDelay = jsonParser.getValueAsInt();
                    return true;
                case "playDisplayShortDelay":
                    bLiveDrawGiftConfig.playDisplayShortDelay = jsonParser.getValueAsInt();
                    return true;
                case "numLimitMax":
                    bLiveDrawGiftConfig.numLimitMax = jsonParser.getValueAsInt();
                    return true;
                case "numLimitMin":
                    bLiveDrawGiftConfig.numLimitMin = jsonParser.getValueAsInt();
                    return true;
                case "templateDisplayDelay":
                    bLiveDrawGiftConfig.templateDisplayDelay = jsonParser.getValueAsInt();
                    return true;
                case "playSplitNum":
                    bLiveDrawGiftConfig.playSplitNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDrawGiftConfig bLiveDrawGiftConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("numLimitMin", bLiveDrawGiftConfig.numLimitMin);
            jsonGenerator.writeNumberField("numLimitMax", bLiveDrawGiftConfig.numLimitMax);
            jsonGenerator.writeNumberField("templateDisplayDelay", bLiveDrawGiftConfig.templateDisplayDelay);
            jsonGenerator.writeNumberField("playDisplayLongDelay", bLiveDrawGiftConfig.playDisplayLongDelay);
            jsonGenerator.writeNumberField("playDisplayShortDelay", bLiveDrawGiftConfig.playDisplayShortDelay);
            jsonGenerator.writeNumberField("playSplitNum", bLiveDrawGiftConfig.playSplitNum);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDrawGiftConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedrawgiftconfig";

    @ProtobufIndex(index = 2)
    public int numLimitMax;

    @ProtobufIndex(index = 1)
    public int numLimitMin;

    @ProtobufIndex(index = 4)
    public int playDisplayLongDelay;

    @ProtobufIndex(index = 5)
    public int playDisplayShortDelay;

    @ProtobufIndex(index = 6)
    public int playSplitNum;

    @ProtobufIndex(index = 3)
    public int templateDisplayDelay;

    public static BLiveDrawGiftConfig new_() {
        BLiveDrawGiftConfig bLiveDrawGiftConfig = new BLiveDrawGiftConfig();
        bLiveDrawGiftConfig.nullCheck();
        return bLiveDrawGiftConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDrawGiftConfig mo225055clone() {
        BLiveDrawGiftConfig bLiveDrawGiftConfig = new BLiveDrawGiftConfig();
        bLiveDrawGiftConfig.numLimitMin = this.numLimitMin;
        bLiveDrawGiftConfig.numLimitMax = this.numLimitMax;
        bLiveDrawGiftConfig.templateDisplayDelay = this.templateDisplayDelay;
        bLiveDrawGiftConfig.playDisplayLongDelay = this.playDisplayLongDelay;
        bLiveDrawGiftConfig.playDisplayShortDelay = this.playDisplayShortDelay;
        bLiveDrawGiftConfig.playSplitNum = this.playSplitNum;
        return bLiveDrawGiftConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDrawGiftConfig)) {
            return false;
        }
        BLiveDrawGiftConfig bLiveDrawGiftConfig = (BLiveDrawGiftConfig) obj;
        return this.numLimitMin == bLiveDrawGiftConfig.numLimitMin && this.numLimitMax == bLiveDrawGiftConfig.numLimitMax && this.templateDisplayDelay == bLiveDrawGiftConfig.templateDisplayDelay && this.playDisplayLongDelay == bLiveDrawGiftConfig.playDisplayLongDelay && this.playDisplayShortDelay == bLiveDrawGiftConfig.playDisplayShortDelay && this.playSplitNum == bLiveDrawGiftConfig.playSplitNum;
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
        int i2 = (((((((((((i * 41) + this.numLimitMin) * 41) + this.numLimitMax) * 41) + this.templateDisplayDelay) * 41) + this.playDisplayLongDelay) * 41) + this.playDisplayShortDelay) * 41) + this.playSplitNum;
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
