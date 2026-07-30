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
public class BLiveAvatarConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAvatarConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAvatarConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAvatarConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAvatarConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAvatarConfig newInstance() {
            return new BLiveAvatarConfig();
        }

        public boolean parseField(BLiveAvatarConfig bLiveAvatarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("connectorImage")) {
                return false;
            }
            bLiveAvatarConfig.connectorImage = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAvatarConfig bLiveAvatarConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAvatarConfig.connectorImage;
            if (str != null) {
                jsonGenerator.writeStringField("connectorImage", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAvatarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveavatarconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String connectorImage;

    public static BLiveAvatarConfig new_() {
        BLiveAvatarConfig bLiveAvatarConfig = new BLiveAvatarConfig();
        bLiveAvatarConfig.nullCheck();
        return bLiveAvatarConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAvatarConfig mo225055clone() {
        BLiveAvatarConfig bLiveAvatarConfig = new BLiveAvatarConfig();
        bLiveAvatarConfig.connectorImage = this.connectorImage;
        return bLiveAvatarConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveAvatarConfig) {
            return ValueObject.util_equals(this.connectorImage, ((BLiveAvatarConfig) obj).connectorImage);
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
        String str = this.connectorImage;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.connectorImage == null) {
            this.connectorImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
