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
public class BLiveGuardConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGuardConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGuardConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGuardConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGuardConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGuardConfig newInstance() {
            return new BLiveGuardConfig();
        }

        public boolean parseField(BLiveGuardConfig bLiveGuardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showGuardScoreIncrement")) {
                bLiveGuardConfig.showGuardScoreIncrement = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("sessionDuration")) {
                return false;
            }
            bLiveGuardConfig.sessionDuration = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGuardConfig bLiveGuardConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("sessionDuration", bLiveGuardConfig.sessionDuration);
            jsonGenerator.writeBooleanField("showGuardScoreIncrement", bLiveGuardConfig.showGuardScoreIncrement);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGuardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveguardconfig";

    @ProtobufIndex(index = 1)
    public int sessionDuration;

    @ProtobufIndex(index = 2)
    public boolean showGuardScoreIncrement;

    public static BLiveGuardConfig new_() {
        BLiveGuardConfig bLiveGuardConfig = new BLiveGuardConfig();
        bLiveGuardConfig.nullCheck();
        return bLiveGuardConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGuardConfig mo223809clone() {
        BLiveGuardConfig bLiveGuardConfig = new BLiveGuardConfig();
        bLiveGuardConfig.sessionDuration = this.sessionDuration;
        bLiveGuardConfig.showGuardScoreIncrement = this.showGuardScoreIncrement;
        return bLiveGuardConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGuardConfig)) {
            return false;
        }
        BLiveGuardConfig bLiveGuardConfig = (BLiveGuardConfig) obj;
        return this.sessionDuration == bLiveGuardConfig.sessionDuration && this.showGuardScoreIncrement == bLiveGuardConfig.showGuardScoreIncrement;
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
        int i2 = (((i * 41) + this.sessionDuration) * 41) + (this.showGuardScoreIncrement ? 1231 : 1237);
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
