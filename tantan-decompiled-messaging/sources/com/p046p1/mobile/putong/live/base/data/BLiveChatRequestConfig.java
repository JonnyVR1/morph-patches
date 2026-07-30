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
public class BLiveChatRequestConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatRequestConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatRequestConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatRequestConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatRequestConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatRequestConfig newInstance() {
            return new BLiveChatRequestConfig();
        }

        public boolean parseField(BLiveChatRequestConfig bLiveChatRequestConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "autoFakeCallResetHours":
                    bLiveChatRequestConfig.autoFakeCallResetHours = jsonParser.getValueAsInt();
                    return true;
                case "call":
                    bLiveChatRequestConfig.call = BLiveChatLooperConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "dial":
                    bLiveChatRequestConfig.dial = BLiveChatLooperConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "live":
                    bLiveChatRequestConfig.live = BLiveChatLooperConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "fakeCallTimeout":
                    bLiveChatRequestConfig.fakeCallTimeout = jsonParser.getValueAsInt();
                    return true;
                case "autoFakeCallTimesLimit":
                    bLiveChatRequestConfig.autoFakeCallTimesLimit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatRequestConfig bLiveChatRequestConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveChatRequestConfig.dial != null) {
                jsonGenerator.writeFieldName("dial");
                BLiveChatLooperConfig.JSON_ADAPTER.serialize(bLiveChatRequestConfig.dial, jsonGenerator, true);
            }
            if (bLiveChatRequestConfig.live != null) {
                jsonGenerator.writeFieldName("live");
                BLiveChatLooperConfig.JSON_ADAPTER.serialize(bLiveChatRequestConfig.live, jsonGenerator, true);
            }
            if (bLiveChatRequestConfig.call != null) {
                jsonGenerator.writeFieldName("call");
                BLiveChatLooperConfig.JSON_ADAPTER.serialize(bLiveChatRequestConfig.call, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("fakeCallTimeout", bLiveChatRequestConfig.fakeCallTimeout);
            jsonGenerator.writeNumberField("autoFakeCallTimesLimit", bLiveChatRequestConfig.autoFakeCallTimesLimit);
            jsonGenerator.writeNumberField("autoFakeCallResetHours", bLiveChatRequestConfig.autoFakeCallResetHours);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatRequestConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatrequestconfig";

    @ProtobufIndex(index = 6)
    public int autoFakeCallResetHours;

    @ProtobufIndex(index = 5)
    public int autoFakeCallTimesLimit;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveChatLooperConfig call;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveChatLooperConfig dial;

    @ProtobufIndex(index = 4)
    public int fakeCallTimeout;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveChatLooperConfig live;

    public static BLiveChatRequestConfig new_() {
        BLiveChatRequestConfig bLiveChatRequestConfig = new BLiveChatRequestConfig();
        bLiveChatRequestConfig.nullCheck();
        return bLiveChatRequestConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatRequestConfig mo223809clone() {
        BLiveChatRequestConfig bLiveChatRequestConfig = new BLiveChatRequestConfig();
        BLiveChatLooperConfig bLiveChatLooperConfig = this.dial;
        if (bLiveChatLooperConfig != null) {
            bLiveChatRequestConfig.dial = bLiveChatLooperConfig.mo223809clone();
        }
        BLiveChatLooperConfig bLiveChatLooperConfig2 = this.live;
        if (bLiveChatLooperConfig2 != null) {
            bLiveChatRequestConfig.live = bLiveChatLooperConfig2.mo223809clone();
        }
        BLiveChatLooperConfig bLiveChatLooperConfig3 = this.call;
        if (bLiveChatLooperConfig3 != null) {
            bLiveChatRequestConfig.call = bLiveChatLooperConfig3.mo223809clone();
        }
        bLiveChatRequestConfig.fakeCallTimeout = this.fakeCallTimeout;
        bLiveChatRequestConfig.autoFakeCallTimesLimit = this.autoFakeCallTimesLimit;
        bLiveChatRequestConfig.autoFakeCallResetHours = this.autoFakeCallResetHours;
        return bLiveChatRequestConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatRequestConfig)) {
            return false;
        }
        BLiveChatRequestConfig bLiveChatRequestConfig = (BLiveChatRequestConfig) obj;
        return ValueObject.util_equals(this.dial, bLiveChatRequestConfig.dial) && ValueObject.util_equals(this.live, bLiveChatRequestConfig.live) && ValueObject.util_equals(this.call, bLiveChatRequestConfig.call) && this.fakeCallTimeout == bLiveChatRequestConfig.fakeCallTimeout && this.autoFakeCallTimesLimit == bLiveChatRequestConfig.autoFakeCallTimesLimit && this.autoFakeCallResetHours == bLiveChatRequestConfig.autoFakeCallResetHours;
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
        BLiveChatLooperConfig bLiveChatLooperConfig = this.dial;
        int iHashCode = (i2 + (bLiveChatLooperConfig != null ? bLiveChatLooperConfig.hashCode() : 0)) * 41;
        BLiveChatLooperConfig bLiveChatLooperConfig2 = this.live;
        int iHashCode2 = (iHashCode + (bLiveChatLooperConfig2 != null ? bLiveChatLooperConfig2.hashCode() : 0)) * 41;
        BLiveChatLooperConfig bLiveChatLooperConfig3 = this.call;
        int iHashCode3 = ((((((iHashCode2 + (bLiveChatLooperConfig3 != null ? bLiveChatLooperConfig3.hashCode() : 0)) * 41) + this.fakeCallTimeout) * 41) + this.autoFakeCallTimesLimit) * 41) + this.autoFakeCallResetHours;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.dial == null) {
            this.dial = BLiveChatLooperConfig.new_();
        }
        if (this.live == null) {
            this.live = BLiveChatLooperConfig.new_();
        }
        if (this.call == null) {
            this.call = BLiveChatLooperConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
