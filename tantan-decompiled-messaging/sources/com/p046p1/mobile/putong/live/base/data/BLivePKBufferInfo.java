package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLivePKBufferInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePKBufferInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLivePKBufferInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLivePKBufferInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePKBufferInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePKBufferInfo newInstance() {
            return new BLivePKBufferInfo();
        }

        public boolean parseField(BLivePKBufferInfo bLivePKBufferInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLivePKBufferInfo.duration = jsonParser.getValueAsInt();
                    return true;
                case "startTs":
                    bLivePKBufferInfo.startTs = jsonParser.getValueAsLong();
                    return true;
                case "text":
                    bLivePKBufferInfo.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLivePKBufferInfo.type = jsonParser.getValueAsString();
                    return true;
                case "showCountdown":
                    bLivePKBufferInfo.showCountdown = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePKBufferInfo bLivePKBufferInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePKBufferInfo.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLivePKBufferInfo.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeNumberField("startTs", bLivePKBufferInfo.startTs);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLivePKBufferInfo.duration);
            jsonGenerator.writeBooleanField("showCountdown", bLivePKBufferInfo.showCountdown);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePKBufferInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkbufferinfo";

    @ProtobufIndex(index = 4)
    public int duration;

    @ProtobufIndex(index = 5)
    public boolean showCountdown;

    @ProtobufIndex(index = 3)
    public long startTs;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLivePKBufferInfo new_() {
        BLivePKBufferInfo bLivePKBufferInfo = new BLivePKBufferInfo();
        bLivePKBufferInfo.nullCheck();
        return bLivePKBufferInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePKBufferInfo mo223809clone() {
        BLivePKBufferInfo bLivePKBufferInfo = new BLivePKBufferInfo();
        bLivePKBufferInfo.type = this.type;
        bLivePKBufferInfo.text = this.text;
        bLivePKBufferInfo.startTs = this.startTs;
        bLivePKBufferInfo.duration = this.duration;
        bLivePKBufferInfo.showCountdown = this.showCountdown;
        return bLivePKBufferInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePKBufferInfo)) {
            return false;
        }
        BLivePKBufferInfo bLivePKBufferInfo = (BLivePKBufferInfo) obj;
        return ValueObject.util_equals(this.type, bLivePKBufferInfo.type) && ValueObject.util_equals(this.text, bLivePKBufferInfo.text) && this.startTs == bLivePKBufferInfo.startTs && this.duration == bLivePKBufferInfo.duration && this.showCountdown == bLivePKBufferInfo.showCountdown;
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.startTs;
        int i3 = ((((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.duration) * 41) + (this.showCountdown ? 1231 : 1237);
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
