package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.MatchFrom;
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
public class BLiveClarity extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveClarity> JSON_ADAPTER = new ObjectJsonAdapter<BLiveClarity>() { // from class: com.p1.mobile.putong.live.base.data.BLiveClarity.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveClarity.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveClarity newInstance() {
            return new BLiveClarity();
        }

        public boolean parseField(BLiveClarity bLiveClarity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "idx":
                    bLiveClarity.idx = jsonParser.getValueAsInt();
                    return true;
                case "url":
                    bLiveClarity.url = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveClarity.text = jsonParser.getValueAsString();
                    return true;
                case "selected":
                    bLiveClarity.selected = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveClarity bLiveClarity, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveClarity.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = bLiveClarity.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            jsonGenerator.writeBooleanField(MatchFrom.selected, bLiveClarity.selected);
            jsonGenerator.writeNumberField("idx", bLiveClarity.idx);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveClarity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveclarity";

    @ProtobufIndex(index = 4)
    public int idx;

    @ProtobufIndex(index = 3)
    public boolean selected;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;

    public static BLiveClarity new_() {
        BLiveClarity bLiveClarity = new BLiveClarity();
        bLiveClarity.nullCheck();
        return bLiveClarity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveClarity mo223809clone() {
        BLiveClarity bLiveClarity = new BLiveClarity();
        bLiveClarity.text = this.text;
        bLiveClarity.url = this.url;
        bLiveClarity.selected = this.selected;
        bLiveClarity.idx = this.idx;
        return bLiveClarity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveClarity)) {
            return false;
        }
        BLiveClarity bLiveClarity = (BLiveClarity) obj;
        return ValueObject.util_equals(this.text, bLiveClarity.text) && ValueObject.util_equals(this.url, bLiveClarity.url) && this.selected == bLiveClarity.selected && this.idx == bLiveClarity.idx;
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
        String str2 = this.url;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.selected ? 1231 : 1237)) * 41) + this.idx;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
