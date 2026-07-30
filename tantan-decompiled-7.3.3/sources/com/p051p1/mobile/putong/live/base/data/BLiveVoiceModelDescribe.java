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
public class BLiveVoiceModelDescribe extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceModelDescribe> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceModelDescribe>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceModelDescribe.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceModelDescribe.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceModelDescribe newInstance() {
            return new BLiveVoiceModelDescribe();
        }

        public boolean parseField(BLiveVoiceModelDescribe bLiveVoiceModelDescribe, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "content3":
                    bLiveVoiceModelDescribe.content3 = jsonParser.getValueAsString();
                    return true;
                case "content5":
                    bLiveVoiceModelDescribe.content5 = jsonParser.getValueAsString();
                    return true;
                case "content9":
                    bLiveVoiceModelDescribe.content9 = jsonParser.getValueAsString();
                    return true;
                case "content10":
                    bLiveVoiceModelDescribe.content10 = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceModelDescribe.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceModelDescribe bLiveVoiceModelDescribe, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceModelDescribe.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveVoiceModelDescribe.content9;
            if (str2 != null) {
                jsonGenerator.writeStringField("content9", str2);
            }
            String str3 = bLiveVoiceModelDescribe.content10;
            if (str3 != null) {
                jsonGenerator.writeStringField("content10", str3);
            }
            String str4 = bLiveVoiceModelDescribe.content3;
            if (str4 != null) {
                jsonGenerator.writeStringField("content3", str4);
            }
            String str5 = bLiveVoiceModelDescribe.content5;
            if (str5 != null) {
                jsonGenerator.writeStringField("content5", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceModelDescribe) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicemodeldescribe";

    @NonNull
    @ProtobufIndex(index = 3)
    public String content10;

    @NonNull
    @ProtobufIndex(index = 4)
    public String content3;

    @NonNull
    @ProtobufIndex(index = 5)
    public String content5;

    @NonNull
    @ProtobufIndex(index = 2)
    public String content9;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveVoiceModelDescribe new_() {
        BLiveVoiceModelDescribe bLiveVoiceModelDescribe = new BLiveVoiceModelDescribe();
        bLiveVoiceModelDescribe.nullCheck();
        return bLiveVoiceModelDescribe;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceModelDescribe mo225055clone() {
        BLiveVoiceModelDescribe bLiveVoiceModelDescribe = new BLiveVoiceModelDescribe();
        bLiveVoiceModelDescribe.title = this.title;
        bLiveVoiceModelDescribe.content9 = this.content9;
        bLiveVoiceModelDescribe.content10 = this.content10;
        bLiveVoiceModelDescribe.content3 = this.content3;
        bLiveVoiceModelDescribe.content5 = this.content5;
        return bLiveVoiceModelDescribe;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceModelDescribe)) {
            return false;
        }
        BLiveVoiceModelDescribe bLiveVoiceModelDescribe = (BLiveVoiceModelDescribe) obj;
        return ValueObject.util_equals(this.title, bLiveVoiceModelDescribe.title) && ValueObject.util_equals(this.content9, bLiveVoiceModelDescribe.content9) && ValueObject.util_equals(this.content10, bLiveVoiceModelDescribe.content10) && ValueObject.util_equals(this.content3, bLiveVoiceModelDescribe.content3) && ValueObject.util_equals(this.content5, bLiveVoiceModelDescribe.content5);
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
        String str2 = this.content9;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content10;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.content3;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.content5;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.content9 == null) {
            this.content9 = "";
        }
        if (this.content10 == null) {
            this.content10 = "";
        }
        if (this.content3 == null) {
            this.content3 = "";
        }
        if (this.content5 == null) {
            this.content5 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
