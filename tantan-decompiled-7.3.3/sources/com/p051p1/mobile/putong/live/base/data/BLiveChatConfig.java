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
public class BLiveChatConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatConfig newInstance() {
            return new BLiveChatConfig();
        }

        public boolean parseField(BLiveChatConfig bLiveChatConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("limitation")) {
                return false;
            }
            bLiveChatConfig.limitation = BLiveChatLimitation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatConfig bLiveChatConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveChatConfig.limitation != null) {
                jsonGenerator.writeFieldName("limitation");
                BLiveChatLimitation.JSON_ADAPTER.serialize(bLiveChatConfig.limitation, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveChatLimitation limitation;

    public static BLiveChatConfig new_() {
        BLiveChatConfig bLiveChatConfig = new BLiveChatConfig();
        bLiveChatConfig.nullCheck();
        return bLiveChatConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatConfig mo225055clone() {
        BLiveChatConfig bLiveChatConfig = new BLiveChatConfig();
        BLiveChatLimitation bLiveChatLimitation = this.limitation;
        if (bLiveChatLimitation != null) {
            bLiveChatConfig.limitation = bLiveChatLimitation.mo225055clone();
        }
        return bLiveChatConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveChatConfig) {
            return ValueObject.util_equals(this.limitation, ((BLiveChatConfig) obj).limitation);
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
        BLiveChatLimitation bLiveChatLimitation = this.limitation;
        int iHashCode = i2 + (bLiveChatLimitation != null ? bLiveChatLimitation.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.limitation == null) {
            this.limitation = BLiveChatLimitation.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
