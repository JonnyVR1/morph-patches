package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardButtonColorConfig;
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
public class BLiveUserCardButtonColorConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserCardButtonColorConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserCardButtonColorConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserCardButtonColorConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserCardButtonColorConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserCardButtonColorConfig newInstance() {
            return new BLiveUserCardButtonColorConfig();
        }

        public boolean parseField(BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "transparency":
                    bLiveUserCardButtonColorConfig.transparency = jsonParser.getValueAsInt();
                    return true;
                case "colors":
                    bLiveUserCardButtonColorConfig.colors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "gradientDirection":
                    bLiveUserCardButtonColorConfig.gradientDirection = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("gradientDirection", bLiveUserCardButtonColorConfig.gradientDirection);
            if (bLiveUserCardButtonColorConfig.colors != null) {
                jsonGenerator.writeFieldName("colors");
                JsonAdapter.serializeArray(bLiveUserCardButtonColorConfig.colors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("transparency", bLiveUserCardButtonColorConfig.transparency);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserCardButtonColorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveusercardbuttoncolorconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> colors;

    @ProtobufIndex(index = 1)
    public int gradientDirection;

    @ProtobufIndex(index = 3)
    public int transparency;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69486a(String str) {
        return str;
    }

    public static BLiveUserCardButtonColorConfig new_() {
        BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig = new BLiveUserCardButtonColorConfig();
        bLiveUserCardButtonColorConfig.nullCheck();
        return bLiveUserCardButtonColorConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserCardButtonColorConfig mo225055clone() {
        BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig = new BLiveUserCardButtonColorConfig();
        bLiveUserCardButtonColorConfig.gradientDirection = this.gradientDirection;
        List<String> list = this.colors;
        if (list != null) {
            bLiveUserCardButtonColorConfig.colors = ValueObject.util_map(list, new qcj() { // from class: l.u72
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveUserCardButtonColorConfig.m69486a((String) obj);
                }
            });
        }
        bLiveUserCardButtonColorConfig.transparency = this.transparency;
        return bLiveUserCardButtonColorConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserCardButtonColorConfig)) {
            return false;
        }
        BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig = (BLiveUserCardButtonColorConfig) obj;
        return this.gradientDirection == bLiveUserCardButtonColorConfig.gradientDirection && ValueObject.util_equals(this.colors, bLiveUserCardButtonColorConfig.colors) && this.transparency == bLiveUserCardButtonColorConfig.transparency;
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
