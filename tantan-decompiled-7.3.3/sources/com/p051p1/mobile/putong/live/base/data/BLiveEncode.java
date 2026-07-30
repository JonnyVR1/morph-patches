package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveEncode extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEncode> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEncode>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEncode.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEncode.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEncode newInstance() {
            return new BLiveEncode();
        }

        public boolean parseField(BLiveEncode bLiveEncode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "height":
                    bLiveEncode.height = jsonParser.getValueAsInt();
                    return true;
                case "heigth":
                    bLiveEncode.heigth = jsonParser.getValueAsInt();
                    return true;
                case "bitRate":
                    bLiveEncode.bitRate = jsonParser.getValueAsInt();
                    return true;
                case "fps":
                    bLiveEncode.fps = jsonParser.getValueAsInt();
                    return true;
                case "width":
                    bLiveEncode.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEncode bLiveEncode, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("width", bLiveEncode.width);
            jsonGenerator.writeNumberField("heigth", bLiveEncode.heigth);
            jsonGenerator.writeNumberField("bitRate", bLiveEncode.bitRate);
            jsonGenerator.writeNumberField("fps", bLiveEncode.fps);
            jsonGenerator.writeNumberField("height", bLiveEncode.height);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEncode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveencode";

    @ProtobufIndex(index = 3)
    public int bitRate;

    @ProtobufIndex(index = 4)
    public int fps;

    @ProtobufIndex(index = 5)
    public int height;

    @ProtobufIndex(index = 2)
    public int heigth;

    @ProtobufIndex(index = 1)
    public int width;

    public static BLiveEncode new_() {
        BLiveEncode bLiveEncode = new BLiveEncode();
        bLiveEncode.nullCheck();
        return bLiveEncode;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEncode mo225055clone() {
        BLiveEncode bLiveEncode = new BLiveEncode();
        bLiveEncode.width = this.width;
        bLiveEncode.heigth = this.heigth;
        bLiveEncode.bitRate = this.bitRate;
        bLiveEncode.fps = this.fps;
        bLiveEncode.height = this.height;
        return bLiveEncode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEncode)) {
            return false;
        }
        BLiveEncode bLiveEncode = (BLiveEncode) obj;
        return this.width == bLiveEncode.width && this.heigth == bLiveEncode.heigth && this.bitRate == bLiveEncode.bitRate && this.fps == bLiveEncode.fps && this.height == bLiveEncode.height;
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
        int i2 = (((((((((i * 41) + this.width) * 41) + this.heigth) * 41) + this.bitRate) * 41) + this.fps) * 41) + this.height;
        this.hashCode = i2;
        return i2;
    }

    public boolean isValid() {
        if (this.width > 99) {
            return (this.heigth > 176 || this.height > 176) && this.fps > 5 && this.bitRate > 1000;
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
