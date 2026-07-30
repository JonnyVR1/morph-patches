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
public class BLiveBlackListConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBlackListConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBlackListConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBlackListConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBlackListConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBlackListConfig newInstance() {
            return new BLiveBlackListConfig();
        }

        public boolean parseField(BLiveBlackListConfig bLiveBlackListConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isOpen")) {
                bLiveBlackListConfig.isOpen = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("tipsFormat")) {
                return false;
            }
            bLiveBlackListConfig.tipsFormat = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBlackListConfig bLiveBlackListConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", bLiveBlackListConfig.isOpen);
            String str = bLiveBlackListConfig.tipsFormat;
            if (str != null) {
                jsonGenerator.writeStringField("tipsFormat", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBlackListConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveblacklistconfig";

    @ProtobufIndex(index = 1)
    public boolean isOpen;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tipsFormat;

    public static BLiveBlackListConfig new_() {
        BLiveBlackListConfig bLiveBlackListConfig = new BLiveBlackListConfig();
        bLiveBlackListConfig.nullCheck();
        return bLiveBlackListConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBlackListConfig mo223809clone() {
        BLiveBlackListConfig bLiveBlackListConfig = new BLiveBlackListConfig();
        bLiveBlackListConfig.isOpen = this.isOpen;
        bLiveBlackListConfig.tipsFormat = this.tipsFormat;
        return bLiveBlackListConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBlackListConfig)) {
            return false;
        }
        BLiveBlackListConfig bLiveBlackListConfig = (BLiveBlackListConfig) obj;
        return this.isOpen == bLiveBlackListConfig.isOpen && ValueObject.util_equals(this.tipsFormat, bLiveBlackListConfig.tipsFormat);
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
        String str = this.tipsFormat;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tipsFormat == null) {
            this.tipsFormat = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
