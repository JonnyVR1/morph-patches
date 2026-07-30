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
public class BLiveInAppPromptContent extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveInAppPromptContent> JSON_ADAPTER = new ObjectJsonAdapter<BLiveInAppPromptContent>() { // from class: com.p1.mobile.putong.live.base.data.BLiveInAppPromptContent.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveInAppPromptContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveInAppPromptContent newInstance() {
            return new BLiveInAppPromptContent();
        }

        public boolean parseField(BLiveInAppPromptContent bLiveInAppPromptContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subTitle")) {
                bLiveInAppPromptContent.subTitle = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            bLiveInAppPromptContent.title = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveInAppPromptContent bLiveInAppPromptContent, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveInAppPromptContent.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveInAppPromptContent.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveInAppPromptContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveinapppromptcontent";

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveInAppPromptContent new_() {
        BLiveInAppPromptContent bLiveInAppPromptContent = new BLiveInAppPromptContent();
        bLiveInAppPromptContent.nullCheck();
        return bLiveInAppPromptContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveInAppPromptContent mo225055clone() {
        BLiveInAppPromptContent bLiveInAppPromptContent = new BLiveInAppPromptContent();
        bLiveInAppPromptContent.title = this.title;
        bLiveInAppPromptContent.subTitle = this.subTitle;
        return bLiveInAppPromptContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveInAppPromptContent)) {
            return false;
        }
        BLiveInAppPromptContent bLiveInAppPromptContent = (BLiveInAppPromptContent) obj;
        return ValueObject.util_equals(this.title, bLiveInAppPromptContent.title) && ValueObject.util_equals(this.subTitle, bLiveInAppPromptContent.subTitle);
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
