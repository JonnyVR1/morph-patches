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
public class BLiveGiftConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftConfig newInstance() {
            return new BLiveGiftConfig();
        }

        public boolean parseField(BLiveGiftConfig bLiveGiftConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enableDynamicUrl")) {
                bLiveGiftConfig.enableDynamicUrl = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("drawGiftConfig")) {
                return false;
            }
            bLiveGiftConfig.drawGiftConfig = BLiveDrawGiftConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftConfig bLiveGiftConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveGiftConfig.drawGiftConfig != null) {
                jsonGenerator.writeFieldName("drawGiftConfig");
                BLiveDrawGiftConfig.JSON_ADAPTER.serialize(bLiveGiftConfig.drawGiftConfig, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("enableDynamicUrl", bLiveGiftConfig.enableDynamicUrl);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveDrawGiftConfig drawGiftConfig;

    @ProtobufIndex(index = 2)
    public boolean enableDynamicUrl;

    public static BLiveGiftConfig new_() {
        BLiveGiftConfig bLiveGiftConfig = new BLiveGiftConfig();
        bLiveGiftConfig.nullCheck();
        return bLiveGiftConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftConfig mo223809clone() {
        BLiveGiftConfig bLiveGiftConfig = new BLiveGiftConfig();
        BLiveDrawGiftConfig bLiveDrawGiftConfig = this.drawGiftConfig;
        if (bLiveDrawGiftConfig != null) {
            bLiveGiftConfig.drawGiftConfig = bLiveDrawGiftConfig.mo223809clone();
        }
        bLiveGiftConfig.enableDynamicUrl = this.enableDynamicUrl;
        return bLiveGiftConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftConfig)) {
            return false;
        }
        BLiveGiftConfig bLiveGiftConfig = (BLiveGiftConfig) obj;
        return ValueObject.util_equals(this.drawGiftConfig, bLiveGiftConfig.drawGiftConfig) && this.enableDynamicUrl == bLiveGiftConfig.enableDynamicUrl;
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
        BLiveDrawGiftConfig bLiveDrawGiftConfig = this.drawGiftConfig;
        int iHashCode = ((i2 + (bLiveDrawGiftConfig != null ? bLiveDrawGiftConfig.hashCode() : 0)) * 41) + (this.enableDynamicUrl ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.drawGiftConfig == null) {
            this.drawGiftConfig = BLiveDrawGiftConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
