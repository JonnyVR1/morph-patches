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
public class BLiveUserCardButtonContent extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserCardButtonContent> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserCardButtonContent>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserCardButtonContent.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserCardButtonContent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserCardButtonContent newInstance() {
            return new BLiveUserCardButtonContent();
        }

        public boolean parseField(BLiveUserCardButtonContent bLiveUserCardButtonContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                bLiveUserCardButtonContent.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("color")) {
                return false;
            }
            bLiveUserCardButtonContent.color = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserCardButtonContent bLiveUserCardButtonContent, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserCardButtonContent.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = bLiveUserCardButtonContent.color;
            if (str2 != null) {
                jsonGenerator.writeStringField("color", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserCardButtonContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveusercardbuttoncontent";

    @NonNull
    @ProtobufIndex(index = 2)
    public String color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;

    public static BLiveUserCardButtonContent new_() {
        BLiveUserCardButtonContent bLiveUserCardButtonContent = new BLiveUserCardButtonContent();
        bLiveUserCardButtonContent.nullCheck();
        return bLiveUserCardButtonContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserCardButtonContent mo225055clone() {
        BLiveUserCardButtonContent bLiveUserCardButtonContent = new BLiveUserCardButtonContent();
        bLiveUserCardButtonContent.text = this.text;
        bLiveUserCardButtonContent.color = this.color;
        return bLiveUserCardButtonContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserCardButtonContent)) {
            return false;
        }
        BLiveUserCardButtonContent bLiveUserCardButtonContent = (BLiveUserCardButtonContent) obj;
        return ValueObject.util_equals(this.text, bLiveUserCardButtonContent.text) && ValueObject.util_equals(this.color, bLiveUserCardButtonContent.color);
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
        String str2 = this.color;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
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
