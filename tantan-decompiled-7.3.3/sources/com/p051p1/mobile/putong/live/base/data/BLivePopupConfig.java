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
public class BLivePopupConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePopupConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLivePopupConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLivePopupConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePopupConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePopupConfig newInstance() {
            return new BLivePopupConfig();
        }

        public boolean parseField(BLivePopupConfig bLivePopupConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "button":
                    bLivePopupConfig.button = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    bLivePopupConfig.picture = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLivePopupConfig.title = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLivePopupConfig.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePopupConfig bLivePopupConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePopupConfig.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLivePopupConfig.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
            String str3 = bLivePopupConfig.picture;
            if (str3 != null) {
                jsonGenerator.writeStringField("picture", str3);
            }
            String str4 = bLivePopupConfig.button;
            if (str4 != null) {
                jsonGenerator.writeStringField("button", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePopupConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepopupconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public String button;

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    @NonNull
    @ProtobufIndex(index = 3)
    public String picture;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLivePopupConfig new_() {
        BLivePopupConfig bLivePopupConfig = new BLivePopupConfig();
        bLivePopupConfig.nullCheck();
        return bLivePopupConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePopupConfig mo225055clone() {
        BLivePopupConfig bLivePopupConfig = new BLivePopupConfig();
        bLivePopupConfig.title = this.title;
        bLivePopupConfig.content = this.content;
        bLivePopupConfig.picture = this.picture;
        bLivePopupConfig.button = this.button;
        return bLivePopupConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePopupConfig)) {
            return false;
        }
        BLivePopupConfig bLivePopupConfig = (BLivePopupConfig) obj;
        return ValueObject.util_equals(this.title, bLivePopupConfig.title) && ValueObject.util_equals(this.content, bLivePopupConfig.content) && ValueObject.util_equals(this.picture, bLivePopupConfig.picture) && ValueObject.util_equals(this.button, bLivePopupConfig.button);
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
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.picture;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.button;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.picture == null) {
            this.picture = "";
        }
        if (this.button == null) {
            this.button = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
