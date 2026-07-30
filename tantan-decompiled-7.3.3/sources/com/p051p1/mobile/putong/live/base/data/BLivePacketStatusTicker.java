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
public class BLivePacketStatusTicker extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePacketStatusTicker> JSON_ADAPTER = new ObjectJsonAdapter<BLivePacketStatusTicker>() { // from class: com.p1.mobile.putong.live.base.data.BLivePacketStatusTicker.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePacketStatusTicker.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePacketStatusTicker newInstance() {
            return new BLivePacketStatusTicker();
        }

        public boolean parseField(BLivePacketStatusTicker bLivePacketStatusTicker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "start":
                    bLivePacketStatusTicker.start = jsonParser.getValueAsBoolean();
                    return true;
                case "totalDurationMs":
                    bLivePacketStatusTicker.totalDurationMs = jsonParser.getValueAsInt();
                    return true;
                case "durationMs":
                    bLivePacketStatusTicker.durationMs = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePacketStatusTicker bLivePacketStatusTicker, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("start", bLivePacketStatusTicker.start);
            jsonGenerator.writeNumberField("durationMs", bLivePacketStatusTicker.durationMs);
            jsonGenerator.writeNumberField("totalDurationMs", bLivePacketStatusTicker.totalDurationMs);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePacketStatusTicker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepacketstatusticker";

    @ProtobufIndex(index = 2)
    public int durationMs;

    @ProtobufIndex(index = 1)
    public boolean start;

    @ProtobufIndex(index = 3)
    public int totalDurationMs;

    public static BLivePacketStatusTicker new_() {
        BLivePacketStatusTicker bLivePacketStatusTicker = new BLivePacketStatusTicker();
        bLivePacketStatusTicker.nullCheck();
        return bLivePacketStatusTicker;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePacketStatusTicker mo225055clone() {
        BLivePacketStatusTicker bLivePacketStatusTicker = new BLivePacketStatusTicker();
        bLivePacketStatusTicker.start = this.start;
        bLivePacketStatusTicker.durationMs = this.durationMs;
        bLivePacketStatusTicker.totalDurationMs = this.totalDurationMs;
        return bLivePacketStatusTicker;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePacketStatusTicker)) {
            return false;
        }
        BLivePacketStatusTicker bLivePacketStatusTicker = (BLivePacketStatusTicker) obj;
        return this.start == bLivePacketStatusTicker.start && this.durationMs == bLivePacketStatusTicker.durationMs && this.totalDurationMs == bLivePacketStatusTicker.totalDurationMs;
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
        int i2 = (((((i * 41) + (this.start ? 1231 : 1237)) * 41) + this.durationMs) * 41) + this.totalDurationMs;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
