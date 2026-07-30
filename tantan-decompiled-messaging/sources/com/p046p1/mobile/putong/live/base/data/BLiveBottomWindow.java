package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomContent;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveBottomWindow extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBottomWindow> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBottomWindow>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBottomWindow.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBottomWindow.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBottomWindow newInstance() {
            return new BLiveBottomWindow();
        }

        public boolean parseField(BLiveBottomWindow bLiveBottomWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picture":
                    bLiveBottomWindow.picture = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveBottomWindow.text = JsonAdapter.parseArray(jsonParser, BLiveBottomContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "backgroundColor":
                    bLiveBottomWindow.backgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBottomWindow bLiveBottomWindow, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBottomWindow.picture;
            if (str != null) {
                jsonGenerator.writeStringField("picture", str);
            }
            if (bLiveBottomWindow.text != null) {
                jsonGenerator.writeFieldName("text");
                JsonAdapter.serializeArray(bLiveBottomWindow.text, jsonGenerator, BLiveBottomContent.JSON_ADAPTER);
            }
            String str2 = bLiveBottomWindow.backgroundColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("backgroundColor", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBottomWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebottomwindow";

    @NonNull
    @ProtobufIndex(index = 3)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String picture;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveBottomContent> text;

    public static BLiveBottomWindow new_() {
        BLiveBottomWindow bLiveBottomWindow = new BLiveBottomWindow();
        bLiveBottomWindow.nullCheck();
        return bLiveBottomWindow;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBottomWindow mo223809clone() {
        BLiveBottomWindow bLiveBottomWindow = new BLiveBottomWindow();
        bLiveBottomWindow.picture = this.picture;
        List<BLiveBottomContent> list = this.text;
        if (list != null) {
            bLiveBottomWindow.text = ValueObject.util_map(list, new w9j() { // from class: l.cs1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveBottomContent) obj).mo223809clone();
                }
            });
        }
        bLiveBottomWindow.backgroundColor = this.backgroundColor;
        return bLiveBottomWindow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBottomWindow)) {
            return false;
        }
        BLiveBottomWindow bLiveBottomWindow = (BLiveBottomWindow) obj;
        return ValueObject.util_equals(this.picture, bLiveBottomWindow.picture) && ValueObject.util_equals(this.text, bLiveBottomWindow.text) && ValueObject.util_equals(this.backgroundColor, bLiveBottomWindow.backgroundColor);
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
        String str = this.picture;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveBottomContent> list = this.text;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.backgroundColor;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.picture == null) {
            this.picture = "";
        }
        if (this.text == null) {
            this.text = new ArrayList();
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
