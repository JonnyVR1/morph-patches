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
public class BLiveActivityCounter extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveActivityCounter> JSON_ADAPTER = new ObjectJsonAdapter<BLiveActivityCounter>() { // from class: com.p1.mobile.putong.live.base.data.BLiveActivityCounter.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveActivityCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveActivityCounter newInstance() {
            return new BLiveActivityCounter();
        }

        public boolean parseField(BLiveActivityCounter bLiveActivityCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "squareDetailUnread":
                    bLiveActivityCounter.squareDetailUnread = jsonParser.getValueAsInt();
                    return true;
                case "squareSummaryUnread":
                    bLiveActivityCounter.squareSummaryUnread = jsonParser.getValueAsInt();
                    return true;
                case "momentUnReadCon":
                    bLiveActivityCounter.momentUnReadCon = jsonParser.getValueAsInt();
                    return true;
                case "voiceActivityUnread":
                    bLiveActivityCounter.voiceActivityUnread = jsonParser.getValueAsInt();
                    return true;
                case "total":
                    bLiveActivityCounter.total = jsonParser.getValueAsInt();
                    return true;
                case "momentRedDotType":
                    bLiveActivityCounter.momentRedDotType = jsonParser.getValueAsString();
                    return true;
                case "discoverUnread":
                    bLiveActivityCounter.discoverUnread = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveActivityCounter bLiveActivityCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("discoverUnread", bLiveActivityCounter.discoverUnread);
            jsonGenerator.writeNumberField("squareSummaryUnread", bLiveActivityCounter.squareSummaryUnread);
            jsonGenerator.writeNumberField("squareDetailUnread", bLiveActivityCounter.squareDetailUnread);
            jsonGenerator.writeNumberField("voiceActivityUnread", bLiveActivityCounter.voiceActivityUnread);
            jsonGenerator.writeNumberField("total", bLiveActivityCounter.total);
            jsonGenerator.writeNumberField("momentUnReadCon", bLiveActivityCounter.momentUnReadCon);
            String str = bLiveActivityCounter.momentRedDotType;
            if (str != null) {
                jsonGenerator.writeStringField("momentRedDotType", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveActivityCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveactivitycounter";

    @ProtobufIndex(index = 1)
    public int discoverUnread;

    @NonNull
    @ProtobufIndex(index = 7)
    public String momentRedDotType;

    @ProtobufIndex(index = 6)
    public int momentUnReadCon;

    @ProtobufIndex(index = 3)
    public int squareDetailUnread;

    @ProtobufIndex(index = 2)
    public int squareSummaryUnread;

    @ProtobufIndex(index = 5)
    public int total;

    @ProtobufIndex(index = 4)
    public int voiceActivityUnread;

    public static BLiveActivityCounter new_() {
        BLiveActivityCounter bLiveActivityCounter = new BLiveActivityCounter();
        bLiveActivityCounter.nullCheck();
        return bLiveActivityCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveActivityCounter mo225055clone() {
        BLiveActivityCounter bLiveActivityCounter = new BLiveActivityCounter();
        bLiveActivityCounter.discoverUnread = this.discoverUnread;
        bLiveActivityCounter.squareSummaryUnread = this.squareSummaryUnread;
        bLiveActivityCounter.squareDetailUnread = this.squareDetailUnread;
        bLiveActivityCounter.voiceActivityUnread = this.voiceActivityUnread;
        bLiveActivityCounter.total = this.total;
        bLiveActivityCounter.momentUnReadCon = this.momentUnReadCon;
        bLiveActivityCounter.momentRedDotType = this.momentRedDotType;
        return bLiveActivityCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveActivityCounter)) {
            return false;
        }
        BLiveActivityCounter bLiveActivityCounter = (BLiveActivityCounter) obj;
        return this.discoverUnread == bLiveActivityCounter.discoverUnread && this.squareSummaryUnread == bLiveActivityCounter.squareSummaryUnread && this.squareDetailUnread == bLiveActivityCounter.squareDetailUnread && this.voiceActivityUnread == bLiveActivityCounter.voiceActivityUnread && this.total == bLiveActivityCounter.total && this.momentUnReadCon == bLiveActivityCounter.momentUnReadCon && ValueObject.util_equals(this.momentRedDotType, bLiveActivityCounter.momentRedDotType);
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
        int i2 = ((((((((((((i * 41) + this.discoverUnread) * 41) + this.squareSummaryUnread) * 41) + this.squareDetailUnread) * 41) + this.voiceActivityUnread) * 41) + this.total) * 41) + this.momentUnReadCon) * 41;
        String str = this.momentRedDotType;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.momentRedDotType == null) {
            this.momentRedDotType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
