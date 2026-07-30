package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class BLiveJumpInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveJumpInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveJumpInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveJumpInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveJumpInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveJumpInfo newInstance() {
            return new BLiveJumpInfo();
        }

        public boolean parseField(BLiveJumpInfo bLiveJumpInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    bLiveJumpInfo.schema = jsonParser.getValueAsString();
                    return true;
                case "popupType":
                    bLiveJumpInfo.popupType = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveJumpInfo.text = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    bLiveJumpInfo.buttonText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveJumpInfo bLiveJumpInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveJumpInfo.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = bLiveJumpInfo.buttonText;
            if (str2 != null) {
                jsonGenerator.writeStringField("buttonText", str2);
            }
            String str3 = bLiveJumpInfo.popupType;
            if (str3 != null) {
                jsonGenerator.writeStringField("popupType", str3);
            }
            String str4 = bLiveJumpInfo.schema;
            if (str4 != null) {
                jsonGenerator.writeStringField("schema", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveJumpInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivejumpinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String popupType;

    @Nullable
    @ProtobufIndex(index = 3)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;

    public static BLiveJumpInfo new_() {
        BLiveJumpInfo bLiveJumpInfo = new BLiveJumpInfo();
        bLiveJumpInfo.nullCheck();
        return bLiveJumpInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveJumpInfo mo223809clone() {
        BLiveJumpInfo bLiveJumpInfo = new BLiveJumpInfo();
        bLiveJumpInfo.text = this.text;
        bLiveJumpInfo.buttonText = this.buttonText;
        bLiveJumpInfo.popupType = this.popupType;
        bLiveJumpInfo.schema = this.schema;
        return bLiveJumpInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveJumpInfo)) {
            return false;
        }
        BLiveJumpInfo bLiveJumpInfo = (BLiveJumpInfo) obj;
        return ValueObject.util_equals(this.text, bLiveJumpInfo.text) && ValueObject.util_equals(this.buttonText, bLiveJumpInfo.buttonText) && ValueObject.util_equals(this.popupType, bLiveJumpInfo.popupType) && ValueObject.util_equals(this.schema, bLiveJumpInfo.schema);
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.buttonText;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.popupType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.schema;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.popupType == null) {
            this.popupType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
