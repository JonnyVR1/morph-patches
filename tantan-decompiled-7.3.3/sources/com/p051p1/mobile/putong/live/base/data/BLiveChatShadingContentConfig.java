package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveChatShadingContentConfig;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveChatShadingContentConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatShadingContentConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatShadingContentConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatShadingContentConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatShadingContentConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatShadingContentConfig newInstance() {
            return new BLiveChatShadingContentConfig();
        }

        public boolean parseField(BLiveChatShadingContentConfig bLiveChatShadingContentConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "transparency":
                    bLiveChatShadingContentConfig.transparency = jsonParser.getValueAsInt();
                    return true;
                case "colors":
                    bLiveChatShadingContentConfig.colors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "gradientDirection":
                    bLiveChatShadingContentConfig.gradientDirection = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatShadingContentConfig bLiveChatShadingContentConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("gradientDirection", bLiveChatShadingContentConfig.gradientDirection);
            if (bLiveChatShadingContentConfig.colors != null) {
                jsonGenerator.writeFieldName("colors");
                JsonAdapter.serializeArray(bLiveChatShadingContentConfig.colors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("transparency", bLiveChatShadingContentConfig.transparency);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatShadingContentConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatshadingcontentconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> colors;

    @ProtobufIndex(index = 1)
    public int gradientDirection;

    @ProtobufIndex(index = 3)
    public int transparency;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68928a(String str) {
        return str;
    }

    public static BLiveChatShadingContentConfig new_() {
        BLiveChatShadingContentConfig bLiveChatShadingContentConfig = new BLiveChatShadingContentConfig();
        bLiveChatShadingContentConfig.nullCheck();
        return bLiveChatShadingContentConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatShadingContentConfig mo225055clone() {
        BLiveChatShadingContentConfig bLiveChatShadingContentConfig = new BLiveChatShadingContentConfig();
        bLiveChatShadingContentConfig.gradientDirection = this.gradientDirection;
        List<String> list = this.colors;
        if (list != null) {
            bLiveChatShadingContentConfig.colors = ValueObject.util_map(list, new qcj() { // from class: l.rs1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveChatShadingContentConfig.m68928a((String) obj);
                }
            });
        }
        bLiveChatShadingContentConfig.transparency = this.transparency;
        return bLiveChatShadingContentConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatShadingContentConfig)) {
            return false;
        }
        BLiveChatShadingContentConfig bLiveChatShadingContentConfig = (BLiveChatShadingContentConfig) obj;
        return this.gradientDirection == bLiveChatShadingContentConfig.gradientDirection && ValueObject.util_equals(this.colors, bLiveChatShadingContentConfig.colors) && this.transparency == bLiveChatShadingContentConfig.transparency;
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
        int i2 = ((i * 41) + this.gradientDirection) * 41;
        List<String> list = this.colors;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.transparency;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.colors == null) {
            this.colors = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
