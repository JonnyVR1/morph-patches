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
public class BLiveVoiceSingTogetherConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSingTogetherConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSingTogetherConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSingTogetherConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSingTogetherConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSingTogetherConfig newInstance() {
            return new BLiveVoiceSingTogetherConfig();
        }

        public boolean parseField(BLiveVoiceSingTogetherConfig bLiveVoiceSingTogetherConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("h5HelpUrl")) {
                return false;
            }
            bLiveVoiceSingTogetherConfig.h5HelpUrl = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSingTogetherConfig bLiveVoiceSingTogetherConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceSingTogetherConfig.h5HelpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("h5HelpUrl", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSingTogetherConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesingtogetherconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String h5HelpUrl;

    public static BLiveVoiceSingTogetherConfig new_() {
        BLiveVoiceSingTogetherConfig bLiveVoiceSingTogetherConfig = new BLiveVoiceSingTogetherConfig();
        bLiveVoiceSingTogetherConfig.nullCheck();
        return bLiveVoiceSingTogetherConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSingTogetherConfig mo225055clone() {
        BLiveVoiceSingTogetherConfig bLiveVoiceSingTogetherConfig = new BLiveVoiceSingTogetherConfig();
        bLiveVoiceSingTogetherConfig.h5HelpUrl = this.h5HelpUrl;
        return bLiveVoiceSingTogetherConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveVoiceSingTogetherConfig) {
            return ValueObject.util_equals(this.h5HelpUrl, ((BLiveVoiceSingTogetherConfig) obj).h5HelpUrl);
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
