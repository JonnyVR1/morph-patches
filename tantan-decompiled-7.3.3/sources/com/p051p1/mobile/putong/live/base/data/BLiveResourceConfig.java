package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveResourceConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveResourceConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveResourceConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveResourceConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveResourceConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveResourceConfig newInstance() {
            return new BLiveResourceConfig();
        }

        public boolean parseField(BLiveResourceConfig bLiveResourceConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("loadingExpDisable")) {
                return false;
            }
            bLiveResourceConfig.loadingExpDisable = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveResourceConfig bLiveResourceConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("loadingExpDisable", bLiveResourceConfig.loadingExpDisable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveResourceConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveresourceconfig";

    @ProtobufIndex(index = 1)
    public boolean loadingExpDisable;

    public static BLiveResourceConfig new_() {
        BLiveResourceConfig bLiveResourceConfig = new BLiveResourceConfig();
        bLiveResourceConfig.nullCheck();
        return bLiveResourceConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveResourceConfig mo225055clone() {
        BLiveResourceConfig bLiveResourceConfig = new BLiveResourceConfig();
        bLiveResourceConfig.loadingExpDisable = this.loadingExpDisable;
        return bLiveResourceConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveResourceConfig) && this.loadingExpDisable == ((BLiveResourceConfig) obj).loadingExpDisable;
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
        int i2 = (i * 41) + (this.loadingExpDisable ? 1231 : 1237);
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
