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
public class BLivePushStreamConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePushStreamConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLivePushStreamConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLivePushStreamConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePushStreamConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePushStreamConfig newInstance() {
            return new BLivePushStreamConfig();
        }

        public boolean parseField(BLivePushStreamConfig bLivePushStreamConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "manualRetryCountDown":
                    bLivePushStreamConfig.manualRetryCountDown = jsonParser.getValueAsInt();
                    return true;
                case "hostLoadingText":
                    bLivePushStreamConfig.hostLoadingText = jsonParser.getValueAsString();
                    return true;
                case "pusherFailedManualLimit":
                    bLivePushStreamConfig.pusherFailedManualLimit = jsonParser.getValueAsInt();
                    return true;
                case "pusherFailedLimit":
                    bLivePushStreamConfig.pusherFailedLimit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePushStreamConfig bLivePushStreamConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("pusherFailedLimit", bLivePushStreamConfig.pusherFailedLimit);
            String str = bLivePushStreamConfig.hostLoadingText;
            if (str != null) {
                jsonGenerator.writeStringField("hostLoadingText", str);
            }
            jsonGenerator.writeNumberField("pusherFailedManualLimit", bLivePushStreamConfig.pusherFailedManualLimit);
            jsonGenerator.writeNumberField("manualRetryCountDown", bLivePushStreamConfig.manualRetryCountDown);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePushStreamConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepushstreamconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String hostLoadingText;

    @ProtobufIndex(index = 4)
    public int manualRetryCountDown;

    @ProtobufIndex(index = 1)
    public int pusherFailedLimit;

    @ProtobufIndex(index = 3)
    public int pusherFailedManualLimit;

    public static BLivePushStreamConfig new_() {
        BLivePushStreamConfig bLivePushStreamConfig = new BLivePushStreamConfig();
        bLivePushStreamConfig.nullCheck();
        return bLivePushStreamConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePushStreamConfig mo223809clone() {
        BLivePushStreamConfig bLivePushStreamConfig = new BLivePushStreamConfig();
        bLivePushStreamConfig.pusherFailedLimit = this.pusherFailedLimit;
        bLivePushStreamConfig.hostLoadingText = this.hostLoadingText;
        bLivePushStreamConfig.pusherFailedManualLimit = this.pusherFailedManualLimit;
        bLivePushStreamConfig.manualRetryCountDown = this.manualRetryCountDown;
        return bLivePushStreamConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePushStreamConfig)) {
            return false;
        }
        BLivePushStreamConfig bLivePushStreamConfig = (BLivePushStreamConfig) obj;
        return this.pusherFailedLimit == bLivePushStreamConfig.pusherFailedLimit && ValueObject.util_equals(this.hostLoadingText, bLivePushStreamConfig.hostLoadingText) && this.pusherFailedManualLimit == bLivePushStreamConfig.pusherFailedManualLimit && this.manualRetryCountDown == bLivePushStreamConfig.manualRetryCountDown;
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
        int i2 = ((i * 41) + this.pusherFailedLimit) * 41;
        String str = this.hostLoadingText;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.pusherFailedManualLimit) * 41) + this.manualRetryCountDown;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.hostLoadingText == null) {
            this.hostLoadingText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
