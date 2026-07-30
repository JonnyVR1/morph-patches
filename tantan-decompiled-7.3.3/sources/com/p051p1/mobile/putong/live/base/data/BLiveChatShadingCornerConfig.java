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
public class BLiveChatShadingCornerConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatShadingCornerConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatShadingCornerConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatShadingCornerConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatShadingCornerConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatShadingCornerConfig newInstance() {
            return new BLiveChatShadingCornerConfig();
        }

        public boolean parseField(BLiveChatShadingCornerConfig bLiveChatShadingCornerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("pictureUrl")) {
                bLiveChatShadingCornerConfig.pictureUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("position")) {
                return false;
            }
            bLiveChatShadingCornerConfig.position = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatShadingCornerConfig bLiveChatShadingCornerConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveChatShadingCornerConfig.pictureUrl;
            if (str != null) {
                jsonGenerator.writeStringField("pictureUrl", str);
            }
            jsonGenerator.writeNumberField("position", bLiveChatShadingCornerConfig.position);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatShadingCornerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatshadingcornerconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String pictureUrl;

    @ProtobufIndex(index = 2)
    public int position;

    public static BLiveChatShadingCornerConfig new_() {
        BLiveChatShadingCornerConfig bLiveChatShadingCornerConfig = new BLiveChatShadingCornerConfig();
        bLiveChatShadingCornerConfig.nullCheck();
        return bLiveChatShadingCornerConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatShadingCornerConfig mo225055clone() {
        BLiveChatShadingCornerConfig bLiveChatShadingCornerConfig = new BLiveChatShadingCornerConfig();
        bLiveChatShadingCornerConfig.pictureUrl = this.pictureUrl;
        bLiveChatShadingCornerConfig.position = this.position;
        return bLiveChatShadingCornerConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatShadingCornerConfig)) {
            return false;
        }
        BLiveChatShadingCornerConfig bLiveChatShadingCornerConfig = (BLiveChatShadingCornerConfig) obj;
        return ValueObject.util_equals(this.pictureUrl, bLiveChatShadingCornerConfig.pictureUrl) && this.position == bLiveChatShadingCornerConfig.position;
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
        String str = this.pictureUrl;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.position;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pictureUrl == null) {
            this.pictureUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
