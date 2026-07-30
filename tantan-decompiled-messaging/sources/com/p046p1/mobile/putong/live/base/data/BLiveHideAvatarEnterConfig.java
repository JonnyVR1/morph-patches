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
public class BLiveHideAvatarEnterConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHideAvatarEnterConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHideAvatarEnterConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHideAvatarEnterConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHideAvatarEnterConfig newInstance() {
            return new BLiveHideAvatarEnterConfig();
        }

        public boolean parseField(BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("usage")) {
                bLiveHideAvatarEnterConfig.usage = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("switchCount")) {
                return false;
            }
            bLiveHideAvatarEnterConfig.switchCount = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("switchCount", bLiveHideAvatarEnterConfig.switchCount);
            String str = bLiveHideAvatarEnterConfig.usage;
            if (str != null) {
                jsonGenerator.writeStringField("usage", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHideAvatarEnterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivehideavatarenterconfig";

    @ProtobufIndex(index = 1)
    public int switchCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String usage;

    public static BLiveHideAvatarEnterConfig new_() {
        BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig = new BLiveHideAvatarEnterConfig();
        bLiveHideAvatarEnterConfig.nullCheck();
        return bLiveHideAvatarEnterConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHideAvatarEnterConfig mo223809clone() {
        BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig = new BLiveHideAvatarEnterConfig();
        bLiveHideAvatarEnterConfig.switchCount = this.switchCount;
        bLiveHideAvatarEnterConfig.usage = this.usage;
        return bLiveHideAvatarEnterConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHideAvatarEnterConfig)) {
            return false;
        }
        BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig = (BLiveHideAvatarEnterConfig) obj;
        return this.switchCount == bLiveHideAvatarEnterConfig.switchCount && ValueObject.util_equals(this.usage, bLiveHideAvatarEnterConfig.usage);
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
        int i2 = ((i * 41) + this.switchCount) * 41;
        String str = this.usage;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.usage == null) {
            this.usage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
