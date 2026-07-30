package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePkScoreViewConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkScoreViewConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkScoreViewConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkScoreViewConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkScoreViewConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkScoreViewConfig newInstance() {
            return new BLivePkScoreViewConfig();
        }

        public boolean parseField(BLivePkScoreViewConfig bLivePkScoreViewConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "rightUrl":
                    bLivePkScoreViewConfig.rightUrl = jsonParser.getValueAsString();
                    return true;
                case "topUrl":
                    bLivePkScoreViewConfig.topUrl = jsonParser.getValueAsString();
                    return true;
                case "centerUrl":
                    bLivePkScoreViewConfig.centerUrl = jsonParser.getValueAsString();
                    return true;
                case "leftUrl":
                    bLivePkScoreViewConfig.leftUrl = jsonParser.getValueAsString();
                    return true;
                case "cursorUrl":
                    bLivePkScoreViewConfig.cursorUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkScoreViewConfig bLivePkScoreViewConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkScoreViewConfig.leftUrl;
            if (str != null) {
                jsonGenerator.writeStringField("leftUrl", str);
            }
            String str2 = bLivePkScoreViewConfig.centerUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("centerUrl", str2);
            }
            String str3 = bLivePkScoreViewConfig.rightUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("rightUrl", str3);
            }
            String str4 = bLivePkScoreViewConfig.topUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("topUrl", str4);
            }
            String str5 = bLivePkScoreViewConfig.cursorUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("cursorUrl", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkScoreViewConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkscoreviewconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String centerUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String cursorUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String leftUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String rightUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String topUrl;

    public static BLivePkScoreViewConfig new_() {
        BLivePkScoreViewConfig bLivePkScoreViewConfig = new BLivePkScoreViewConfig();
        bLivePkScoreViewConfig.nullCheck();
        return bLivePkScoreViewConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkScoreViewConfig mo223809clone() {
        BLivePkScoreViewConfig bLivePkScoreViewConfig = new BLivePkScoreViewConfig();
        bLivePkScoreViewConfig.leftUrl = this.leftUrl;
        bLivePkScoreViewConfig.centerUrl = this.centerUrl;
        bLivePkScoreViewConfig.rightUrl = this.rightUrl;
        bLivePkScoreViewConfig.topUrl = this.topUrl;
        bLivePkScoreViewConfig.cursorUrl = this.cursorUrl;
        return bLivePkScoreViewConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkScoreViewConfig)) {
            return false;
        }
        BLivePkScoreViewConfig bLivePkScoreViewConfig = (BLivePkScoreViewConfig) obj;
        return ValueObject.util_equals(this.leftUrl, bLivePkScoreViewConfig.leftUrl) && ValueObject.util_equals(this.centerUrl, bLivePkScoreViewConfig.centerUrl) && ValueObject.util_equals(this.rightUrl, bLivePkScoreViewConfig.rightUrl) && ValueObject.util_equals(this.topUrl, bLivePkScoreViewConfig.topUrl) && ValueObject.util_equals(this.cursorUrl, bLivePkScoreViewConfig.cursorUrl);
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
        String str = this.leftUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.centerUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.rightUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.topUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.cursorUrl;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.leftUrl == null) {
            this.leftUrl = "";
        }
        if (this.centerUrl == null) {
            this.centerUrl = "";
        }
        if (this.rightUrl == null) {
            this.rightUrl = "";
        }
        if (this.topUrl == null) {
            this.topUrl = "";
        }
        if (this.cursorUrl == null) {
            this.cursorUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
