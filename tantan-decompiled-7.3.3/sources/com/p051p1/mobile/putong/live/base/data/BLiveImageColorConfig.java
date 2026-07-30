package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveImageColorConfig;
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
public class BLiveImageColorConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveImageColorConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveImageColorConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveImageColorConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveImageColorConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveImageColorConfig newInstance() {
            return new BLiveImageColorConfig();
        }

        public boolean parseField(BLiveImageColorConfig bLiveImageColorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isGary":
                    bLiveImageColorConfig.isGary = jsonParser.getValueAsBoolean();
                    return true;
                case "gary_number":
                    bLiveImageColorConfig.gary_number = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "on":
                    bLiveImageColorConfig.f45235on = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveImageColorConfig bLiveImageColorConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("on", bLiveImageColorConfig.f45235on);
            jsonGenerator.writeBooleanField("isGary", bLiveImageColorConfig.isGary);
            if (bLiveImageColorConfig.gary_number != null) {
                jsonGenerator.writeFieldName("gary_number");
                JsonAdapter.serializeArray(bLiveImageColorConfig.gary_number, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveImageColorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveimagecolorconfig";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> gary_number;

    @ProtobufIndex(index = 2)
    public boolean isGary;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 1)
    public boolean f45235on;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69199a(String str) {
        return str;
    }

    public static BLiveImageColorConfig new_() {
        BLiveImageColorConfig bLiveImageColorConfig = new BLiveImageColorConfig();
        bLiveImageColorConfig.nullCheck();
        return bLiveImageColorConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveImageColorConfig mo225055clone() {
        BLiveImageColorConfig bLiveImageColorConfig = new BLiveImageColorConfig();
        bLiveImageColorConfig.f45235on = this.f45235on;
        bLiveImageColorConfig.isGary = this.isGary;
        List<String> list = this.gary_number;
        if (list != null) {
            bLiveImageColorConfig.gary_number = ValueObject.util_map(list, new qcj() { // from class: l.s12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveImageColorConfig.m69199a((String) obj);
                }
            });
        }
        return bLiveImageColorConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveImageColorConfig)) {
            return false;
        }
        BLiveImageColorConfig bLiveImageColorConfig = (BLiveImageColorConfig) obj;
        return this.f45235on == bLiveImageColorConfig.f45235on && this.isGary == bLiveImageColorConfig.isGary && ValueObject.util_equals(this.gary_number, bLiveImageColorConfig.gary_number);
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
        int i2 = ((((i * 41) + (this.f45235on ? 1231 : 1237)) * 41) + (this.isGary ? 1231 : 1237)) * 41;
        List<String> list = this.gary_number;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gary_number == null) {
            this.gary_number = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
