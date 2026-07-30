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
public class BLiveStartBtnConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStartBtnConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStartBtnConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStartBtnConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStartBtnConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStartBtnConfig newInstance() {
            return new BLiveStartBtnConfig();
        }

        public boolean parseField(BLiveStartBtnConfig bLiveStartBtnConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "textColor":
                    bLiveStartBtnConfig.textColor = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveStartBtnConfig.text = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    bLiveStartBtnConfig.backgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStartBtnConfig bLiveStartBtnConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStartBtnConfig.backgroundColor;
            if (str != null) {
                jsonGenerator.writeStringField("backgroundColor", str);
            }
            String str2 = bLiveStartBtnConfig.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = bLiveStartBtnConfig.textColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("textColor", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStartBtnConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestartbtnconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 3)
    public String textColor;

    public static BLiveStartBtnConfig new_() {
        BLiveStartBtnConfig bLiveStartBtnConfig = new BLiveStartBtnConfig();
        bLiveStartBtnConfig.nullCheck();
        return bLiveStartBtnConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStartBtnConfig mo223809clone() {
        BLiveStartBtnConfig bLiveStartBtnConfig = new BLiveStartBtnConfig();
        bLiveStartBtnConfig.backgroundColor = this.backgroundColor;
        bLiveStartBtnConfig.text = this.text;
        bLiveStartBtnConfig.textColor = this.textColor;
        return bLiveStartBtnConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStartBtnConfig)) {
            return false;
        }
        BLiveStartBtnConfig bLiveStartBtnConfig = (BLiveStartBtnConfig) obj;
        return ValueObject.util_equals(this.backgroundColor, bLiveStartBtnConfig.backgroundColor) && ValueObject.util_equals(this.text, bLiveStartBtnConfig.text) && ValueObject.util_equals(this.textColor, bLiveStartBtnConfig.textColor);
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
        String str = this.backgroundColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.textColor;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
