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
public class BLiveVoiceQuickGiftConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceQuickGiftConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceQuickGiftConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceQuickGiftConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceQuickGiftConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceQuickGiftConfig newInstance() {
            return new BLiveVoiceQuickGiftConfig();
        }

        public boolean parseField(BLiveVoiceQuickGiftConfig bLiveVoiceQuickGiftConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("longPressOn")) {
                return false;
            }
            bLiveVoiceQuickGiftConfig.longPressOn = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceQuickGiftConfig bLiveVoiceQuickGiftConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("longPressOn", bLiveVoiceQuickGiftConfig.longPressOn);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceQuickGiftConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicequickgiftconfig";

    @ProtobufIndex(index = 1)
    public boolean longPressOn;

    public static BLiveVoiceQuickGiftConfig new_() {
        BLiveVoiceQuickGiftConfig bLiveVoiceQuickGiftConfig = new BLiveVoiceQuickGiftConfig();
        bLiveVoiceQuickGiftConfig.nullCheck();
        return bLiveVoiceQuickGiftConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceQuickGiftConfig mo223809clone() {
        BLiveVoiceQuickGiftConfig bLiveVoiceQuickGiftConfig = new BLiveVoiceQuickGiftConfig();
        bLiveVoiceQuickGiftConfig.longPressOn = this.longPressOn;
        return bLiveVoiceQuickGiftConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveVoiceQuickGiftConfig) && this.longPressOn == ((BLiveVoiceQuickGiftConfig) obj).longPressOn;
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
        int i2 = (i * 41) + (this.longPressOn ? 1231 : 1237);
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
