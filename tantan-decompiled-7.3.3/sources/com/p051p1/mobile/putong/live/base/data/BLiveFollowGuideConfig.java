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
public class BLiveFollowGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFollowGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFollowGuideConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFollowGuideConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFollowGuideConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFollowGuideConfig newInstance() {
            return new BLiveFollowGuideConfig();
        }

        public boolean parseField(BLiveFollowGuideConfig bLiveFollowGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("show")) {
                return false;
            }
            bLiveFollowGuideConfig.show = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFollowGuideConfig bLiveFollowGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", bLiveFollowGuideConfig.show);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFollowGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefollowguideconfig";

    @ProtobufIndex(index = 1)
    public boolean show;

    public static BLiveFollowGuideConfig new_() {
        BLiveFollowGuideConfig bLiveFollowGuideConfig = new BLiveFollowGuideConfig();
        bLiveFollowGuideConfig.nullCheck();
        return bLiveFollowGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFollowGuideConfig mo225055clone() {
        BLiveFollowGuideConfig bLiveFollowGuideConfig = new BLiveFollowGuideConfig();
        bLiveFollowGuideConfig.show = this.show;
        return bLiveFollowGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveFollowGuideConfig) && this.show == ((BLiveFollowGuideConfig) obj).show;
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
        int i2 = (i * 41) + (this.show ? 1231 : 1237);
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
