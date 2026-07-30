package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveCapture extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCapture> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCapture>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCapture.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCapture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCapture newInstance() {
            return new BLiveCapture();
        }

        public boolean parseField(BLiveCapture bLiveCapture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "height":
                    bLiveCapture.height = jsonParser.getValueAsInt();
                    return true;
                case "heigth":
                    bLiveCapture.heigth = jsonParser.getValueAsInt();
                    return true;
                case "width":
                    bLiveCapture.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCapture bLiveCapture, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("width", bLiveCapture.width);
            jsonGenerator.writeNumberField("heigth", bLiveCapture.heigth);
            jsonGenerator.writeNumberField("height", bLiveCapture.height);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCapture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecapture";

    @ProtobufIndex(index = 3)
    public int height;

    @ProtobufIndex(index = 2)
    public int heigth;

    @ProtobufIndex(index = 1)
    public int width;

    public static BLiveCapture new_() {
        BLiveCapture bLiveCapture = new BLiveCapture();
        bLiveCapture.nullCheck();
        return bLiveCapture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCapture mo223809clone() {
        BLiveCapture bLiveCapture = new BLiveCapture();
        bLiveCapture.width = this.width;
        bLiveCapture.heigth = this.heigth;
        bLiveCapture.height = this.height;
        return bLiveCapture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCapture)) {
            return false;
        }
        BLiveCapture bLiveCapture = (BLiveCapture) obj;
        return this.width == bLiveCapture.width && this.heigth == bLiveCapture.heigth && this.height == bLiveCapture.height;
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
        int i2 = (((((i * 41) + this.width) * 41) + this.heigth) * 41) + this.height;
        this.hashCode = i2;
        return i2;
    }

    public boolean isValid() {
        if (this.width > 99) {
            return this.heigth > 176 || this.height > 176;
        }
        return false;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
