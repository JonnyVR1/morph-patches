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
public class BLiveGiftSetProcesses extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftSetProcesses> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftSetProcesses>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftSetProcesses.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftSetProcesses.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftSetProcesses newInstance() {
            return new BLiveGiftSetProcesses();
        }

        public boolean parseField(BLiveGiftSetProcesses bLiveGiftSetProcesses, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "entranceNum":
                    bLiveGiftSetProcesses.entranceNum = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveGiftSetProcesses.f45229id = jsonParser.getValueAsInt();
                    return false;
                case "accumulatedNum":
                    bLiveGiftSetProcesses.accumulatedNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftSetProcesses bLiveGiftSetProcesses, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveGiftSetProcesses.f45229id);
            jsonGenerator.writeNumberField("accumulatedNum", bLiveGiftSetProcesses.accumulatedNum);
            jsonGenerator.writeNumberField("entranceNum", bLiveGiftSetProcesses.entranceNum);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftSetProcesses) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftsetprocesses";

    @ProtobufIndex(index = 2)
    public int accumulatedNum;

    @ProtobufIndex(index = 3)
    public int entranceNum;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f45229id;

    public static BLiveGiftSetProcesses new_() {
        BLiveGiftSetProcesses bLiveGiftSetProcesses = new BLiveGiftSetProcesses();
        bLiveGiftSetProcesses.nullCheck();
        return bLiveGiftSetProcesses;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftSetProcesses mo225055clone() {
        BLiveGiftSetProcesses bLiveGiftSetProcesses = new BLiveGiftSetProcesses();
        bLiveGiftSetProcesses.f45229id = this.f45229id;
        bLiveGiftSetProcesses.accumulatedNum = this.accumulatedNum;
        bLiveGiftSetProcesses.entranceNum = this.entranceNum;
        return bLiveGiftSetProcesses;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftSetProcesses)) {
            return false;
        }
        BLiveGiftSetProcesses bLiveGiftSetProcesses = (BLiveGiftSetProcesses) obj;
        return this.f45229id == bLiveGiftSetProcesses.f45229id && this.accumulatedNum == bLiveGiftSetProcesses.accumulatedNum && this.entranceNum == bLiveGiftSetProcesses.entranceNum;
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
        int i2 = (((((i * 41) + this.f45229id) * 41) + this.accumulatedNum) * 41) + this.entranceNum;
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
