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
public class BLivePacketStatusProgress extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePacketStatusProgress> JSON_ADAPTER = new ObjectJsonAdapter<BLivePacketStatusProgress>() { // from class: com.p1.mobile.putong.live.base.data.BLivePacketStatusProgress.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePacketStatusProgress.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePacketStatusProgress newInstance() {
            return new BLivePacketStatusProgress();
        }

        public boolean parseField(BLivePacketStatusProgress bLivePacketStatusProgress, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("goal")) {
                bLivePacketStatusProgress.goal = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("current")) {
                return false;
            }
            bLivePacketStatusProgress.current = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePacketStatusProgress bLivePacketStatusProgress, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("goal", bLivePacketStatusProgress.goal);
            jsonGenerator.writeNumberField("current", bLivePacketStatusProgress.current);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePacketStatusProgress) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepacketstatusprogress";

    @ProtobufIndex(index = 2)
    public int current;

    @ProtobufIndex(index = 1)
    public int goal;

    public static BLivePacketStatusProgress new_() {
        BLivePacketStatusProgress bLivePacketStatusProgress = new BLivePacketStatusProgress();
        bLivePacketStatusProgress.nullCheck();
        return bLivePacketStatusProgress;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePacketStatusProgress mo223809clone() {
        BLivePacketStatusProgress bLivePacketStatusProgress = new BLivePacketStatusProgress();
        bLivePacketStatusProgress.goal = this.goal;
        bLivePacketStatusProgress.current = this.current;
        return bLivePacketStatusProgress;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePacketStatusProgress)) {
            return false;
        }
        BLivePacketStatusProgress bLivePacketStatusProgress = (BLivePacketStatusProgress) obj;
        return this.goal == bLivePacketStatusProgress.goal && this.current == bLivePacketStatusProgress.current;
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
        int i2 = (((i * 41) + this.goal) * 41) + this.current;
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
