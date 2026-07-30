package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
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
public class BLiveOperationDefaultConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationDefaultConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationDefaultConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationDefaultConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationDefaultConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationDefaultConfig newInstance() {
            return new BLiveOperationDefaultConfig();
        }

        public boolean parseField(BLiveOperationDefaultConfig bLiveOperationDefaultConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(BLiveOperationActionAfterCountdown.textDrawer)) {
                return false;
            }
            bLiveOperationDefaultConfig.textDrawer = BLiveOperationTextDrawerConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationDefaultConfig bLiveOperationDefaultConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveOperationDefaultConfig.textDrawer != null) {
                jsonGenerator.writeFieldName(BLiveOperationActionAfterCountdown.textDrawer);
                BLiveOperationTextDrawerConfig.JSON_ADAPTER.serialize(bLiveOperationDefaultConfig.textDrawer, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationDefaultConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationdefaultconfig";

    @Nullable
    @ProtobufIndex(index = 1)
    public BLiveOperationTextDrawerConfig textDrawer;

    public static BLiveOperationDefaultConfig new_() {
        BLiveOperationDefaultConfig bLiveOperationDefaultConfig = new BLiveOperationDefaultConfig();
        bLiveOperationDefaultConfig.nullCheck();
        return bLiveOperationDefaultConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationDefaultConfig mo225055clone() {
        BLiveOperationDefaultConfig bLiveOperationDefaultConfig = new BLiveOperationDefaultConfig();
        BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig = this.textDrawer;
        if (bLiveOperationTextDrawerConfig != null) {
            bLiveOperationDefaultConfig.textDrawer = bLiveOperationTextDrawerConfig.mo225055clone();
        }
        return bLiveOperationDefaultConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveOperationDefaultConfig) {
            return ValueObject.util_equals(this.textDrawer, ((BLiveOperationDefaultConfig) obj).textDrawer);
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
        BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig = this.textDrawer;
        int iHashCode = i2 + (bLiveOperationTextDrawerConfig != null ? bLiveOperationTextDrawerConfig.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
