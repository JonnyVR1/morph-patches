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
public class BLivePkTimeRangeInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkTimeRangeInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkTimeRangeInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkTimeRangeInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkTimeRangeInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkTimeRangeInfo newInstance() {
            return new BLivePkTimeRangeInfo();
        }

        public boolean parseField(BLivePkTimeRangeInfo bLivePkTimeRangeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("minute")) {
                bLivePkTimeRangeInfo.minute = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("hour")) {
                return false;
            }
            bLivePkTimeRangeInfo.hour = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkTimeRangeInfo bLivePkTimeRangeInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("hour", bLivePkTimeRangeInfo.hour);
            jsonGenerator.writeNumberField("minute", bLivePkTimeRangeInfo.minute);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkTimeRangeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepktimerangeinfo";

    @ProtobufIndex(index = 1)
    public int hour;

    @ProtobufIndex(index = 2)
    public int minute;

    public static BLivePkTimeRangeInfo new_() {
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo = new BLivePkTimeRangeInfo();
        bLivePkTimeRangeInfo.nullCheck();
        return bLivePkTimeRangeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkTimeRangeInfo mo225055clone() {
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo = new BLivePkTimeRangeInfo();
        bLivePkTimeRangeInfo.hour = this.hour;
        bLivePkTimeRangeInfo.minute = this.minute;
        return bLivePkTimeRangeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkTimeRangeInfo)) {
            return false;
        }
        BLivePkTimeRangeInfo bLivePkTimeRangeInfo = (BLivePkTimeRangeInfo) obj;
        return this.hour == bLivePkTimeRangeInfo.hour && this.minute == bLivePkTimeRangeInfo.minute;
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
        int i2 = (((i * 41) + this.hour) * 41) + this.minute;
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
