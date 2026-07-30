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
public class BLiveGiftShowTipsBgConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftShowTipsBgConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftShowTipsBgConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftShowTipsBgConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftShowTipsBgConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftShowTipsBgConfig newInstance() {
            return new BLiveGiftShowTipsBgConfig();
        }

        public boolean parseField(BLiveGiftShowTipsBgConfig bLiveGiftShowTipsBgConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("startColor")) {
                bLiveGiftShowTipsBgConfig.startColor = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("endColor")) {
                return false;
            }
            bLiveGiftShowTipsBgConfig.endColor = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftShowTipsBgConfig bLiveGiftShowTipsBgConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftShowTipsBgConfig.startColor;
            if (str != null) {
                jsonGenerator.writeStringField("startColor", str);
            }
            String str2 = bLiveGiftShowTipsBgConfig.endColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("endColor", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftShowTipsBgConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftshowtipsbgconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;

    public static BLiveGiftShowTipsBgConfig new_() {
        BLiveGiftShowTipsBgConfig bLiveGiftShowTipsBgConfig = new BLiveGiftShowTipsBgConfig();
        bLiveGiftShowTipsBgConfig.nullCheck();
        return bLiveGiftShowTipsBgConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftShowTipsBgConfig mo225055clone() {
        BLiveGiftShowTipsBgConfig bLiveGiftShowTipsBgConfig = new BLiveGiftShowTipsBgConfig();
        bLiveGiftShowTipsBgConfig.startColor = this.startColor;
        bLiveGiftShowTipsBgConfig.endColor = this.endColor;
        return bLiveGiftShowTipsBgConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftShowTipsBgConfig)) {
            return false;
        }
        BLiveGiftShowTipsBgConfig bLiveGiftShowTipsBgConfig = (BLiveGiftShowTipsBgConfig) obj;
        return ValueObject.util_equals(this.startColor, bLiveGiftShowTipsBgConfig.startColor) && ValueObject.util_equals(this.endColor, bLiveGiftShowTipsBgConfig.endColor);
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
        String str = this.startColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endColor;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
