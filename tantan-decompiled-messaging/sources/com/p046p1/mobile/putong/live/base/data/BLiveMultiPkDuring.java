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
public class BLiveMultiPkDuring extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiPkDuring> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiPkDuring>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiPkDuring.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiPkDuring.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiPkDuring newInstance() {
            return new BLiveMultiPkDuring();
        }

        public boolean parseField(BLiveMultiPkDuring bLiveMultiPkDuring, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BLiveOperationTitleShowType.duration)) {
                bLiveMultiPkDuring.duration = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("picked")) {
                return false;
            }
            bLiveMultiPkDuring.picked = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiPkDuring bLiveMultiPkDuring, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveMultiPkDuring.duration);
            jsonGenerator.writeBooleanField("picked", bLiveMultiPkDuring.picked);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiPkDuring) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemultipkduring";

    @ProtobufIndex(index = 1)
    public int duration;

    @ProtobufIndex(index = 2)
    public boolean picked;

    public static BLiveMultiPkDuring new_() {
        BLiveMultiPkDuring bLiveMultiPkDuring = new BLiveMultiPkDuring();
        bLiveMultiPkDuring.nullCheck();
        return bLiveMultiPkDuring;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiPkDuring mo223809clone() {
        BLiveMultiPkDuring bLiveMultiPkDuring = new BLiveMultiPkDuring();
        bLiveMultiPkDuring.duration = this.duration;
        bLiveMultiPkDuring.picked = this.picked;
        return bLiveMultiPkDuring;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiPkDuring)) {
            return false;
        }
        BLiveMultiPkDuring bLiveMultiPkDuring = (BLiveMultiPkDuring) obj;
        return this.duration == bLiveMultiPkDuring.duration && this.picked == bLiveMultiPkDuring.picked;
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
        int i2 = (((i * 41) + this.duration) * 41) + (this.picked ? 1231 : 1237);
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
