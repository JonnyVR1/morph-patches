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
public class BLiveMaskAvatarConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMaskAvatarConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMaskAvatarConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMaskAvatarConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMaskAvatarConfig newInstance() {
            return new BLiveMaskAvatarConfig();
        }

        public boolean parseField(BLiveMaskAvatarConfig bLiveMaskAvatarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("frameConfig")) {
                return false;
            }
            bLiveMaskAvatarConfig.frameConfig = BLiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMaskAvatarConfig bLiveMaskAvatarConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveMaskAvatarConfig.frameConfig != null) {
                jsonGenerator.writeFieldName("frameConfig");
                BLiveAvatarFrameConfig.JSON_ADAPTER.serialize(bLiveMaskAvatarConfig.frameConfig, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMaskAvatarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemaskavatarconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveAvatarFrameConfig frameConfig;

    public static BLiveMaskAvatarConfig new_() {
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = new BLiveMaskAvatarConfig();
        bLiveMaskAvatarConfig.nullCheck();
        return bLiveMaskAvatarConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMaskAvatarConfig mo225055clone() {
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = new BLiveMaskAvatarConfig();
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = this.frameConfig;
        if (bLiveAvatarFrameConfig != null) {
            bLiveMaskAvatarConfig.frameConfig = bLiveAvatarFrameConfig.mo225055clone();
        }
        return bLiveMaskAvatarConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveMaskAvatarConfig) {
            return ValueObject.util_equals(this.frameConfig, ((BLiveMaskAvatarConfig) obj).frameConfig);
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
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = this.frameConfig;
        int iHashCode = i2 + (bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.frameConfig == null) {
            this.frameConfig = BLiveAvatarFrameConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
