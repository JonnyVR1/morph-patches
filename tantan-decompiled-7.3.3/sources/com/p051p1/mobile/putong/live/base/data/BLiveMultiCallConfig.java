package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveMultiCallConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCallConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCallConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCallConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCallConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCallConfig newInstance() {
            return new BLiveMultiCallConfig();
        }

        public boolean parseField(BLiveMultiCallConfig bLiveMultiCallConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("upgradeStartModePopUp")) {
                bLiveMultiCallConfig.upgradeStartModePopUp = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("multiCallVoiceEnable")) {
                return false;
            }
            bLiveMultiCallConfig.multiCallVoiceEnable = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCallConfig bLiveMultiCallConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("multiCallVoiceEnable", bLiveMultiCallConfig.multiCallVoiceEnable);
            if (bLiveMultiCallConfig.upgradeStartModePopUp != null) {
                jsonGenerator.writeFieldName("upgradeStartModePopUp");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveMultiCallConfig.upgradeStartModePopUp, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCallConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticallconfig";

    @ProtobufIndex(index = 1)
    public boolean multiCallVoiceEnable;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveCommonConfig upgradeStartModePopUp;

    public static BLiveMultiCallConfig new_() {
        BLiveMultiCallConfig bLiveMultiCallConfig = new BLiveMultiCallConfig();
        bLiveMultiCallConfig.nullCheck();
        return bLiveMultiCallConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCallConfig mo225055clone() {
        BLiveMultiCallConfig bLiveMultiCallConfig = new BLiveMultiCallConfig();
        bLiveMultiCallConfig.multiCallVoiceEnable = this.multiCallVoiceEnable;
        BLiveCommonConfig bLiveCommonConfig = this.upgradeStartModePopUp;
        if (bLiveCommonConfig != null) {
            bLiveMultiCallConfig.upgradeStartModePopUp = bLiveCommonConfig.mo225055clone();
        }
        return bLiveMultiCallConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCallConfig)) {
            return false;
        }
        BLiveMultiCallConfig bLiveMultiCallConfig = (BLiveMultiCallConfig) obj;
        return this.multiCallVoiceEnable == bLiveMultiCallConfig.multiCallVoiceEnable && ValueObject.util_equals(this.upgradeStartModePopUp, bLiveMultiCallConfig.upgradeStartModePopUp);
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
        int i2 = ((i * 41) + (this.multiCallVoiceEnable ? 1231 : 1237)) * 41;
        BLiveCommonConfig bLiveCommonConfig = this.upgradeStartModePopUp;
        int iHashCode = i2 + (bLiveCommonConfig != null ? bLiveCommonConfig.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.upgradeStartModePopUp == null) {
            this.upgradeStartModePopUp = BLiveCommonConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
