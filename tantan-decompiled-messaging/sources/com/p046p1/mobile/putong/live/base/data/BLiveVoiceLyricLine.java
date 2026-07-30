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
public class BLiveVoiceLyricLine extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceLyricLine> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceLyricLine>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceLyricLine.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceLyricLine.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceLyricLine newInstance() {
            return new BLiveVoiceLyricLine();
        }

        public boolean parseField(BLiveVoiceLyricLine bLiveVoiceLyricLine, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "end":
                    bLiveVoiceLyricLine.end = jsonParser.getValueAsLong();
                    return true;
                case "text":
                    bLiveVoiceLyricLine.text = jsonParser.getValueAsString();
                    return true;
                case "start":
                    bLiveVoiceLyricLine.start = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceLyricLine bLiveVoiceLyricLine, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("start", bLiveVoiceLyricLine.start);
            jsonGenerator.writeNumberField("end", bLiveVoiceLyricLine.end);
            String str = bLiveVoiceLyricLine.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceLyricLine) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicelyricline";

    @ProtobufIndex(index = 2)
    public long end;

    @ProtobufIndex(index = 1)
    public long start;

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;

    public static BLiveVoiceLyricLine new_() {
        BLiveVoiceLyricLine bLiveVoiceLyricLine = new BLiveVoiceLyricLine();
        bLiveVoiceLyricLine.nullCheck();
        return bLiveVoiceLyricLine;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceLyricLine mo223809clone() {
        BLiveVoiceLyricLine bLiveVoiceLyricLine = new BLiveVoiceLyricLine();
        bLiveVoiceLyricLine.start = this.start;
        bLiveVoiceLyricLine.end = this.end;
        bLiveVoiceLyricLine.text = this.text;
        return bLiveVoiceLyricLine;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceLyricLine)) {
            return false;
        }
        BLiveVoiceLyricLine bLiveVoiceLyricLine = (BLiveVoiceLyricLine) obj;
        return this.start == bLiveVoiceLyricLine.start && this.end == bLiveVoiceLyricLine.end && ValueObject.util_equals(this.text, bLiveVoiceLyricLine.text);
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
        long j = this.start;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.end;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.text;
        int iHashCode = i3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
