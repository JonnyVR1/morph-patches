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
public class BLiveMixEncode extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMixEncode> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMixEncode>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMixEncode.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMixEncode.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMixEncode newInstance() {
            return new BLiveMixEncode();
        }

        public boolean parseField(BLiveMixEncode bLiveMixEncode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "height":
                    bLiveMixEncode.height = jsonParser.getValueAsInt();
                    return true;
                case "heigth":
                    bLiveMixEncode.heigth = jsonParser.getValueAsInt();
                    return true;
                case "bitRate":
                    bLiveMixEncode.bitRate = jsonParser.getValueAsInt();
                    return true;
                case "fps":
                    bLiveMixEncode.fps = jsonParser.getValueAsInt();
                    return true;
                case "width":
                    bLiveMixEncode.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMixEncode bLiveMixEncode, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("width", bLiveMixEncode.width);
            jsonGenerator.writeNumberField("heigth", bLiveMixEncode.heigth);
            jsonGenerator.writeNumberField("bitRate", bLiveMixEncode.bitRate);
            jsonGenerator.writeNumberField("fps", bLiveMixEncode.fps);
            jsonGenerator.writeNumberField("height", bLiveMixEncode.height);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMixEncode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemixencode";

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

    public static BLiveMixEncode new_() {
        BLiveMixEncode bLiveMixEncode = new BLiveMixEncode();
        bLiveMixEncode.nullCheck();
        return bLiveMixEncode;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMixEncode mo223809clone() {
        BLiveMixEncode bLiveMixEncode = new BLiveMixEncode();
        bLiveMixEncode.width = this.width;
        bLiveMixEncode.heigth = this.heigth;
        bLiveMixEncode.bitRate = this.bitRate;
        bLiveMixEncode.fps = this.fps;
        bLiveMixEncode.height = this.height;
        return bLiveMixEncode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMixEncode)) {
            return false;
        }
        BLiveMixEncode bLiveMixEncode = (BLiveMixEncode) obj;
        return this.width == bLiveMixEncode.width && this.heigth == bLiveMixEncode.heigth && this.bitRate == bLiveMixEncode.bitRate && this.fps == bLiveMixEncode.fps && this.height == bLiveMixEncode.height;
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
