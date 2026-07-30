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
public class BLiveSquareConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSquareConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSquareConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSquareConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSquareConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSquareConfig newInstance() {
            return new BLiveSquareConfig();
        }

        public boolean parseField(BLiveSquareConfig bLiveSquareConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("nearby")) {
                return false;
            }
            bLiveSquareConfig.nearby = BLiveSquareNearByConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSquareConfig bLiveSquareConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveSquareConfig.nearby != null) {
                jsonGenerator.writeFieldName("nearby");
                BLiveSquareNearByConfig.JSON_ADAPTER.serialize(bLiveSquareConfig.nearby, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSquareConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesquareconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveSquareNearByConfig nearby;

    public static BLiveSquareConfig new_() {
        BLiveSquareConfig bLiveSquareConfig = new BLiveSquareConfig();
        bLiveSquareConfig.nullCheck();
        return bLiveSquareConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSquareConfig mo225055clone() {
        BLiveSquareConfig bLiveSquareConfig = new BLiveSquareConfig();
        BLiveSquareNearByConfig bLiveSquareNearByConfig = this.nearby;
        if (bLiveSquareNearByConfig != null) {
            bLiveSquareConfig.nearby = bLiveSquareNearByConfig.mo225055clone();
        }
        return bLiveSquareConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveSquareConfig) {
            return ValueObject.util_equals(this.nearby, ((BLiveSquareConfig) obj).nearby);
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
        BLiveSquareNearByConfig bLiveSquareNearByConfig = this.nearby;
        int iHashCode = i2 + (bLiveSquareNearByConfig != null ? bLiveSquareNearByConfig.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nearby == null) {
            this.nearby = BLiveSquareNearByConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
