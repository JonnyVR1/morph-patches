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
public class BLiveStreamEventConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStreamEventConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStreamEventConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStreamEventConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStreamEventConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStreamEventConfig newInstance() {
            return new BLiveStreamEventConfig();
        }

        public boolean parseField(BLiveStreamEventConfig bLiveStreamEventConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("minReportBufferingTimeDuration")) {
                bLiveStreamEventConfig.minReportBufferingTimeDuration = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("bufferStopReportDuration")) {
                return false;
            }
            bLiveStreamEventConfig.bufferStopReportDuration = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStreamEventConfig bLiveStreamEventConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("bufferStopReportDuration", bLiveStreamEventConfig.bufferStopReportDuration);
            jsonGenerator.writeNumberField("minReportBufferingTimeDuration", bLiveStreamEventConfig.minReportBufferingTimeDuration);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStreamEventConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestreameventconfig";

    @ProtobufIndex(index = 1)
    public int bufferStopReportDuration;

    @ProtobufIndex(index = 2)
    public int minReportBufferingTimeDuration;

    public static BLiveStreamEventConfig new_() {
        BLiveStreamEventConfig bLiveStreamEventConfig = new BLiveStreamEventConfig();
        bLiveStreamEventConfig.nullCheck();
        return bLiveStreamEventConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStreamEventConfig mo225055clone() {
        BLiveStreamEventConfig bLiveStreamEventConfig = new BLiveStreamEventConfig();
        bLiveStreamEventConfig.bufferStopReportDuration = this.bufferStopReportDuration;
        bLiveStreamEventConfig.minReportBufferingTimeDuration = this.minReportBufferingTimeDuration;
        return bLiveStreamEventConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStreamEventConfig)) {
            return false;
        }
        BLiveStreamEventConfig bLiveStreamEventConfig = (BLiveStreamEventConfig) obj;
        return this.bufferStopReportDuration == bLiveStreamEventConfig.bufferStopReportDuration && this.minReportBufferingTimeDuration == bLiveStreamEventConfig.minReportBufferingTimeDuration;
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
        int i2 = (((i * 41) + this.bufferStopReportDuration) * 41) + this.minReportBufferingTimeDuration;
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
