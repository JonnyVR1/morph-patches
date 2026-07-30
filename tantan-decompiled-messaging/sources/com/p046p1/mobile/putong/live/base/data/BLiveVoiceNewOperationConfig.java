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
public class BLiveVoiceNewOperationConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceNewOperationConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceNewOperationConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceNewOperationConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceNewOperationConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceNewOperationConfig newInstance() {
            return new BLiveVoiceNewOperationConfig();
        }

        public boolean parseField(BLiveVoiceNewOperationConfig bLiveVoiceNewOperationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("bannerOpen")) {
                return false;
            }
            bLiveVoiceNewOperationConfig.bannerOpen = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceNewOperationConfig bLiveVoiceNewOperationConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("bannerOpen", bLiveVoiceNewOperationConfig.bannerOpen);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceNewOperationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicenewoperationconfig";

    @ProtobufIndex(index = 1)
    public boolean bannerOpen;

    public static BLiveVoiceNewOperationConfig new_() {
        BLiveVoiceNewOperationConfig bLiveVoiceNewOperationConfig = new BLiveVoiceNewOperationConfig();
        bLiveVoiceNewOperationConfig.nullCheck();
        return bLiveVoiceNewOperationConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceNewOperationConfig mo223809clone() {
        BLiveVoiceNewOperationConfig bLiveVoiceNewOperationConfig = new BLiveVoiceNewOperationConfig();
        bLiveVoiceNewOperationConfig.bannerOpen = this.bannerOpen;
        return bLiveVoiceNewOperationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveVoiceNewOperationConfig) && this.bannerOpen == ((BLiveVoiceNewOperationConfig) obj).bannerOpen;
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
        int i2 = (i * 41) + (this.bannerOpen ? 1231 : 1237);
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
