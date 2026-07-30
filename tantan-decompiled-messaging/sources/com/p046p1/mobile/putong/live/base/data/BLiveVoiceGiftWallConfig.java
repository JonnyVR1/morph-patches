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
public class BLiveVoiceGiftWallConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGiftWallConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGiftWallConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGiftWallConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGiftWallConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGiftWallConfig newInstance() {
            return new BLiveVoiceGiftWallConfig();
        }

        public boolean parseField(BLiveVoiceGiftWallConfig bLiveVoiceGiftWallConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("h5HelpUrl")) {
                return false;
            }
            bLiveVoiceGiftWallConfig.h5HelpUrl = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGiftWallConfig bLiveVoiceGiftWallConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGiftWallConfig.h5HelpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("h5HelpUrl", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGiftWallConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegiftwallconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String h5HelpUrl;

    public static BLiveVoiceGiftWallConfig new_() {
        BLiveVoiceGiftWallConfig bLiveVoiceGiftWallConfig = new BLiveVoiceGiftWallConfig();
        bLiveVoiceGiftWallConfig.nullCheck();
        return bLiveVoiceGiftWallConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGiftWallConfig mo223809clone() {
        BLiveVoiceGiftWallConfig bLiveVoiceGiftWallConfig = new BLiveVoiceGiftWallConfig();
        bLiveVoiceGiftWallConfig.h5HelpUrl = this.h5HelpUrl;
        return bLiveVoiceGiftWallConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceGiftWallConfig) {
            return ValueObject.util_equals(this.h5HelpUrl, ((BLiveVoiceGiftWallConfig) obj).h5HelpUrl);
        }
        return false;
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
        String str = this.h5HelpUrl;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.h5HelpUrl == null) {
            this.h5HelpUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
