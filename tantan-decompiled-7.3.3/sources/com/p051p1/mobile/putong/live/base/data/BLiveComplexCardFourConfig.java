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
public class BLiveComplexCardFourConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveComplexCardFourConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveComplexCardFourConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveComplexCardFourConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveComplexCardFourConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveComplexCardFourConfig newInstance() {
            return new BLiveComplexCardFourConfig();
        }

        public boolean parseField(BLiveComplexCardFourConfig bLiveComplexCardFourConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subTitle")) {
                bLiveComplexCardFourConfig.subTitle = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            bLiveComplexCardFourConfig.title = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveComplexCardFourConfig bLiveComplexCardFourConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveComplexCardFourConfig.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveComplexCardFourConfig.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveComplexCardFourConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecomplexcardfourconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveComplexCardFourConfig new_() {
        BLiveComplexCardFourConfig bLiveComplexCardFourConfig = new BLiveComplexCardFourConfig();
        bLiveComplexCardFourConfig.nullCheck();
        return bLiveComplexCardFourConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveComplexCardFourConfig mo225055clone() {
        BLiveComplexCardFourConfig bLiveComplexCardFourConfig = new BLiveComplexCardFourConfig();
        bLiveComplexCardFourConfig.title = this.title;
        bLiveComplexCardFourConfig.subTitle = this.subTitle;
        return bLiveComplexCardFourConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveComplexCardFourConfig)) {
            return false;
        }
        BLiveComplexCardFourConfig bLiveComplexCardFourConfig = (BLiveComplexCardFourConfig) obj;
        return ValueObject.util_equals(this.title, bLiveComplexCardFourConfig.title) && ValueObject.util_equals(this.subTitle, bLiveComplexCardFourConfig.subTitle);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
