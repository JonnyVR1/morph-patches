package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.OMSResourceType;
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
public class BLiveGiftShowTipsConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftShowTipsConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftShowTipsConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftShowTipsConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftShowTipsConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftShowTipsConfig newInstance() {
            return new BLiveGiftShowTipsConfig();
        }

        public boolean parseField(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "background":
                    bLiveGiftShowTipsConfig.background = BLiveGiftShowTipsBgConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "textColor":
                    bLiveGiftShowTipsConfig.textColor = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveGiftShowTipsConfig.content = jsonParser.getValueAsString();
                    return true;
                case "strokeColor":
                    bLiveGiftShowTipsConfig.strokeColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftShowTipsConfig.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            String str2 = bLiveGiftShowTipsConfig.textColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("textColor", str2);
            }
            if (bLiveGiftShowTipsConfig.background != null) {
                jsonGenerator.writeFieldName(OMSResourceType.background);
                BLiveGiftShowTipsBgConfig.JSON_ADAPTER.serialize(bLiveGiftShowTipsConfig.background, jsonGenerator, true);
            }
            String str3 = bLiveGiftShowTipsConfig.strokeColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("strokeColor", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftShowTipsConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftshowtipsconfig";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveGiftShowTipsBgConfig background;

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 4)
    public String strokeColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String textColor;

    public static BLiveGiftShowTipsConfig new_() {
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = new BLiveGiftShowTipsConfig();
        bLiveGiftShowTipsConfig.nullCheck();
        return bLiveGiftShowTipsConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftShowTipsConfig mo223809clone() {
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = new BLiveGiftShowTipsConfig();
        bLiveGiftShowTipsConfig.content = this.content;
        bLiveGiftShowTipsConfig.textColor = this.textColor;
        BLiveGiftShowTipsBgConfig bLiveGiftShowTipsBgConfig = this.background;
        if (bLiveGiftShowTipsBgConfig != null) {
            bLiveGiftShowTipsConfig.background = bLiveGiftShowTipsBgConfig.mo223809clone();
        }
        bLiveGiftShowTipsConfig.strokeColor = this.strokeColor;
        return bLiveGiftShowTipsConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftShowTipsConfig)) {
            return false;
        }
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = (BLiveGiftShowTipsConfig) obj;
        return ValueObject.util_equals(this.content, bLiveGiftShowTipsConfig.content) && ValueObject.util_equals(this.textColor, bLiveGiftShowTipsConfig.textColor) && ValueObject.util_equals(this.background, bLiveGiftShowTipsConfig.background) && ValueObject.util_equals(this.strokeColor, bLiveGiftShowTipsConfig.strokeColor);
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
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.textColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveGiftShowTipsBgConfig bLiveGiftShowTipsBgConfig = this.background;
        int iHashCode3 = (iHashCode2 + (bLiveGiftShowTipsBgConfig != null ? bLiveGiftShowTipsBgConfig.hashCode() : 0)) * 41;
        String str3 = this.strokeColor;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.background == null) {
            this.background = BLiveGiftShowTipsBgConfig.new_();
        }
        if (this.strokeColor == null) {
            this.strokeColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
