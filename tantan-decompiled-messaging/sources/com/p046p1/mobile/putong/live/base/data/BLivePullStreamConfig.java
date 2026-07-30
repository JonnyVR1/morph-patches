package com.p046p1.mobile.putong.live.base.data;

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
public class BLivePullStreamConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePullStreamConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLivePullStreamConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLivePullStreamConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePullStreamConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePullStreamConfig newInstance() {
            return new BLivePullStreamConfig();
        }

        public boolean parseField(BLivePullStreamConfig bLivePullStreamConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("retryCountDown")) {
                bLivePullStreamConfig.retryCountDown = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("pullFailedLimit")) {
                return false;
            }
            bLivePullStreamConfig.pullFailedLimit = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePullStreamConfig bLivePullStreamConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("pullFailedLimit", bLivePullStreamConfig.pullFailedLimit);
            jsonGenerator.writeNumberField("retryCountDown", bLivePullStreamConfig.retryCountDown);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePullStreamConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepullstreamconfig";

    @ProtobufIndex(index = 1)
    public int pullFailedLimit;

    @ProtobufIndex(index = 2)
    public int retryCountDown;

    public static BLivePullStreamConfig new_() {
        BLivePullStreamConfig bLivePullStreamConfig = new BLivePullStreamConfig();
        bLivePullStreamConfig.nullCheck();
        return bLivePullStreamConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePullStreamConfig mo223809clone() {
        BLivePullStreamConfig bLivePullStreamConfig = new BLivePullStreamConfig();
        bLivePullStreamConfig.pullFailedLimit = this.pullFailedLimit;
        bLivePullStreamConfig.retryCountDown = this.retryCountDown;
        return bLivePullStreamConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePullStreamConfig)) {
            return false;
        }
        BLivePullStreamConfig bLivePullStreamConfig = (BLivePullStreamConfig) obj;
        return this.pullFailedLimit == bLivePullStreamConfig.pullFailedLimit && this.retryCountDown == bLivePullStreamConfig.retryCountDown;
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
        int i2 = (((i * 41) + this.pullFailedLimit) * 41) + this.retryCountDown;
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
