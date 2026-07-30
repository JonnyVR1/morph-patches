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
public class BLiveButtonConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveButtonConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveButtonConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveButtonConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveButtonConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveButtonConfig newInstance() {
            return new BLiveButtonConfig();
        }

        public boolean parseField(BLiveButtonConfig bLiveButtonConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                bLiveButtonConfig.f44341id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            bLiveButtonConfig.type = BLiveButtonType.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveButtonConfig bLiveButtonConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveButtonConfig.f44341id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveButtonConfig.type != null) {
                jsonGenerator.writeFieldName("type");
                BLiveButtonType.JSON_ADAPTER.serialize(bLiveButtonConfig.type, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveButtonConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebuttonconfig";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44341id;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveButtonType type;

    public static BLiveButtonConfig new_() {
        BLiveButtonConfig bLiveButtonConfig = new BLiveButtonConfig();
        bLiveButtonConfig.nullCheck();
        return bLiveButtonConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveButtonConfig mo223809clone() {
        BLiveButtonConfig bLiveButtonConfig = new BLiveButtonConfig();
        bLiveButtonConfig.f44341id = this.f44341id;
        bLiveButtonConfig.type = this.type;
        return bLiveButtonConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveButtonConfig)) {
            return false;
        }
        BLiveButtonConfig bLiveButtonConfig = (BLiveButtonConfig) obj;
        return ValueObject.util_equals(this.f44341id, bLiveButtonConfig.f44341id) && ValueObject.util_equals(this.type, bLiveButtonConfig.type);
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
        String str = this.f44341id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveButtonType bLiveButtonType = this.type;
        int iHashCode2 = iHashCode + (bLiveButtonType != null ? bLiveButtonType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44341id == null) {
            this.f44341id = "";
        }
        if (this.type == null) {
            this.type = (BLiveButtonType) BLiveButtonType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
