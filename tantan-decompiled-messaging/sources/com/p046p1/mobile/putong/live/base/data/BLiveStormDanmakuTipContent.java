package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
public class BLiveStormDanmakuTipContent extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStormDanmakuTipContent> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStormDanmakuTipContent>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStormDanmakuTipContent.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStormDanmakuTipContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStormDanmakuTipContent newInstance() {
            return new BLiveStormDanmakuTipContent();
        }

        public boolean parseField(BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "key":
                    bLiveStormDanmakuTipContent.key = jsonParser.getValueAsString();
                    return true;
                case "color":
                    bLiveStormDanmakuTipContent.color = jsonParser.getValueAsString();
                    return true;
                case "value":
                    bLiveStormDanmakuTipContent.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStormDanmakuTipContent.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            String str2 = bLiveStormDanmakuTipContent.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            String str3 = bLiveStormDanmakuTipContent.color;
            if (str3 != null) {
                jsonGenerator.writeStringField("color", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStormDanmakuTipContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestormdanmakutipcontent";

    @NonNull
    @ProtobufIndex(index = 3)
    public String color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;

    public static BLiveStormDanmakuTipContent new_() {
        BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent = new BLiveStormDanmakuTipContent();
        bLiveStormDanmakuTipContent.nullCheck();
        return bLiveStormDanmakuTipContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStormDanmakuTipContent mo223809clone() {
        BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent = new BLiveStormDanmakuTipContent();
        bLiveStormDanmakuTipContent.key = this.key;
        bLiveStormDanmakuTipContent.value = this.value;
        bLiveStormDanmakuTipContent.color = this.color;
        return bLiveStormDanmakuTipContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStormDanmakuTipContent)) {
            return false;
        }
        BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent = (BLiveStormDanmakuTipContent) obj;
        return ValueObject.util_equals(this.key, bLiveStormDanmakuTipContent.key) && ValueObject.util_equals(this.value, bLiveStormDanmakuTipContent.value) && ValueObject.util_equals(this.color, bLiveStormDanmakuTipContent.color);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.color;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.color == null) {
            this.color = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
