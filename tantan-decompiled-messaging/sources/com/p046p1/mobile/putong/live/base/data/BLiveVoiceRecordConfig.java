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
public class BLiveVoiceRecordConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRecordConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRecordConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRecordConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRecordConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRecordConfig newInstance() {
            return new BLiveVoiceRecordConfig();
        }

        public boolean parseField(BLiveVoiceRecordConfig bLiveVoiceRecordConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isOpen":
                    bLiveVoiceRecordConfig.isOpen = jsonParser.getValueAsBoolean();
                    return true;
                case "targetH5":
                    bLiveVoiceRecordConfig.targetH5 = jsonParser.getValueAsString();
                    return true;
                case "isShowHeartbeatReward":
                    bLiveVoiceRecordConfig.isShowHeartbeatReward = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRecordConfig bLiveVoiceRecordConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", bLiveVoiceRecordConfig.isOpen);
            String str = bLiveVoiceRecordConfig.targetH5;
            if (str != null) {
                jsonGenerator.writeStringField("targetH5", str);
            }
            jsonGenerator.writeBooleanField("isShowHeartbeatReward", bLiveVoiceRecordConfig.isShowHeartbeatReward);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRecordConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicerecordconfig";

    @ProtobufIndex(index = 1)
    public boolean isOpen;

    @ProtobufIndex(index = 3)
    public boolean isShowHeartbeatReward;

    @NonNull
    @ProtobufIndex(index = 2)
    public String targetH5;

    public static BLiveVoiceRecordConfig new_() {
        BLiveVoiceRecordConfig bLiveVoiceRecordConfig = new BLiveVoiceRecordConfig();
        bLiveVoiceRecordConfig.nullCheck();
        return bLiveVoiceRecordConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRecordConfig mo223809clone() {
        BLiveVoiceRecordConfig bLiveVoiceRecordConfig = new BLiveVoiceRecordConfig();
        bLiveVoiceRecordConfig.isOpen = this.isOpen;
        bLiveVoiceRecordConfig.targetH5 = this.targetH5;
        bLiveVoiceRecordConfig.isShowHeartbeatReward = this.isShowHeartbeatReward;
        return bLiveVoiceRecordConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRecordConfig)) {
            return false;
        }
        BLiveVoiceRecordConfig bLiveVoiceRecordConfig = (BLiveVoiceRecordConfig) obj;
        return this.isOpen == bLiveVoiceRecordConfig.isOpen && ValueObject.util_equals(this.targetH5, bLiveVoiceRecordConfig.targetH5) && this.isShowHeartbeatReward == bLiveVoiceRecordConfig.isShowHeartbeatReward;
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
        int i2 = ((i * 41) + (this.isOpen ? 1231 : 1237)) * 41;
        String str = this.targetH5;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isShowHeartbeatReward ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.targetH5 == null) {
            this.targetH5 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
