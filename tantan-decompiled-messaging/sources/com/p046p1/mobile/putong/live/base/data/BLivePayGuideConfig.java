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
public class BLivePayGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePayGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLivePayGuideConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLivePayGuideConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePayGuideConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePayGuideConfig newInstance() {
            return new BLivePayGuideConfig();
        }

        public boolean parseField(BLivePayGuideConfig bLivePayGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "buttonTitle":
                    bLivePayGuideConfig.buttonTitle = jsonParser.getValueAsString();
                    return true;
                case "giftId":
                    bLivePayGuideConfig.giftId = jsonParser.getValueAsInt();
                    return true;
                case "giftCount":
                    bLivePayGuideConfig.giftCount = jsonParser.getValueAsInt();
                    return true;
                case "giftIcon":
                    bLivePayGuideConfig.giftIcon = jsonParser.getValueAsString();
                    return true;
                case "giftName":
                    bLivePayGuideConfig.giftName = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLivePayGuideConfig.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePayGuideConfig bLivePayGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("giftId", bLivePayGuideConfig.giftId);
            jsonGenerator.writeNumberField("giftCount", bLivePayGuideConfig.giftCount);
            String str = bLivePayGuideConfig.giftIcon;
            if (str != null) {
                jsonGenerator.writeStringField("giftIcon", str);
            }
            String str2 = bLivePayGuideConfig.giftName;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftName", str2);
            }
            String str3 = bLivePayGuideConfig.content;
            if (str3 != null) {
                jsonGenerator.writeStringField("content", str3);
            }
            String str4 = bLivePayGuideConfig.buttonTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonTitle", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePayGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepayguideconfig";

    @NonNull
    @ProtobufIndex(index = 6)
    public String buttonTitle;

    @NonNull
    @ProtobufIndex(index = 5)
    public String content;

    @ProtobufIndex(index = 2)
    public int giftCount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftIcon;

    @ProtobufIndex(index = 1)
    public int giftId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String giftName;

    public static BLivePayGuideConfig new_() {
        BLivePayGuideConfig bLivePayGuideConfig = new BLivePayGuideConfig();
        bLivePayGuideConfig.nullCheck();
        return bLivePayGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePayGuideConfig mo223809clone() {
        BLivePayGuideConfig bLivePayGuideConfig = new BLivePayGuideConfig();
        bLivePayGuideConfig.giftId = this.giftId;
        bLivePayGuideConfig.giftCount = this.giftCount;
        bLivePayGuideConfig.giftIcon = this.giftIcon;
        bLivePayGuideConfig.giftName = this.giftName;
        bLivePayGuideConfig.content = this.content;
        bLivePayGuideConfig.buttonTitle = this.buttonTitle;
        return bLivePayGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePayGuideConfig)) {
            return false;
        }
        BLivePayGuideConfig bLivePayGuideConfig = (BLivePayGuideConfig) obj;
        return this.giftId == bLivePayGuideConfig.giftId && this.giftCount == bLivePayGuideConfig.giftCount && ValueObject.util_equals(this.giftIcon, bLivePayGuideConfig.giftIcon) && ValueObject.util_equals(this.giftName, bLivePayGuideConfig.giftName) && ValueObject.util_equals(this.content, bLivePayGuideConfig.content) && ValueObject.util_equals(this.buttonTitle, bLivePayGuideConfig.buttonTitle);
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
        int i2 = ((((i * 41) + this.giftId) * 41) + this.giftCount) * 41;
        String str = this.giftIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giftName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonTitle;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftIcon == null) {
            this.giftIcon = "";
        }
        if (this.giftName == null) {
            this.giftName = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.buttonTitle == null) {
            this.buttonTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
