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
public class BLiveVoiceShareUrlConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceShareUrlConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceShareUrlConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceShareUrlConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceShareUrlConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceShareUrlConfig newInstance() {
            return new BLiveVoiceShareUrlConfig();
        }

        public boolean parseField(BLiveVoiceShareUrlConfig bLiveVoiceShareUrlConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("url")) {
                return false;
            }
            bLiveVoiceShareUrlConfig.url = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceShareUrlConfig bLiveVoiceShareUrlConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceShareUrlConfig.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceShareUrlConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceshareurlconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    public static BLiveVoiceShareUrlConfig new_() {
        BLiveVoiceShareUrlConfig bLiveVoiceShareUrlConfig = new BLiveVoiceShareUrlConfig();
        bLiveVoiceShareUrlConfig.nullCheck();
        return bLiveVoiceShareUrlConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceShareUrlConfig mo225055clone() {
        BLiveVoiceShareUrlConfig bLiveVoiceShareUrlConfig = new BLiveVoiceShareUrlConfig();
        bLiveVoiceShareUrlConfig.url = this.url;
        return bLiveVoiceShareUrlConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceShareUrlConfig) {
            return ValueObject.util_equals(this.url, ((BLiveVoiceShareUrlConfig) obj).url);
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
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
