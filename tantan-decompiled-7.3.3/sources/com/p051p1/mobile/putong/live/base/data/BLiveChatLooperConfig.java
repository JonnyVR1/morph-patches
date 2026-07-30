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
public class BLiveChatLooperConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatLooperConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatLooperConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatLooperConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatLooperConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatLooperConfig newInstance() {
            return new BLiveChatLooperConfig();
        }

        public boolean parseField(BLiveChatLooperConfig bLiveChatLooperConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "timeout":
                    bLiveChatLooperConfig.timeout = jsonParser.getValueAsInt();
                    return true;
                case "retryCount":
                    bLiveChatLooperConfig.retryCount = jsonParser.getValueAsInt();
                    return true;
                case "fetchInterval":
                    bLiveChatLooperConfig.fetchInterval = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatLooperConfig bLiveChatLooperConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("timeout", bLiveChatLooperConfig.timeout);
            jsonGenerator.writeNumberField("fetchInterval", bLiveChatLooperConfig.fetchInterval);
            jsonGenerator.writeNumberField("retryCount", bLiveChatLooperConfig.retryCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatLooperConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatlooperconfig";

    @ProtobufIndex(index = 2)
    public int fetchInterval;

    @ProtobufIndex(index = 3)
    public int retryCount;

    @ProtobufIndex(index = 1)
    public int timeout;

    public static BLiveChatLooperConfig new_() {
        BLiveChatLooperConfig bLiveChatLooperConfig = new BLiveChatLooperConfig();
        bLiveChatLooperConfig.nullCheck();
        return bLiveChatLooperConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatLooperConfig mo225055clone() {
        BLiveChatLooperConfig bLiveChatLooperConfig = new BLiveChatLooperConfig();
        bLiveChatLooperConfig.timeout = this.timeout;
        bLiveChatLooperConfig.fetchInterval = this.fetchInterval;
        bLiveChatLooperConfig.retryCount = this.retryCount;
        return bLiveChatLooperConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatLooperConfig)) {
            return false;
        }
        BLiveChatLooperConfig bLiveChatLooperConfig = (BLiveChatLooperConfig) obj;
        return this.timeout == bLiveChatLooperConfig.timeout && this.fetchInterval == bLiveChatLooperConfig.fetchInterval && this.retryCount == bLiveChatLooperConfig.retryCount;
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
        int i2 = (((((i * 41) + this.timeout) * 41) + this.fetchInterval) * 41) + this.retryCount;
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
