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
public class BLiveDefaultOpenConditions extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDefaultOpenConditions> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDefaultOpenConditions>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDefaultOpenConditions.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDefaultOpenConditions.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDefaultOpenConditions newInstance() {
            return new BLiveDefaultOpenConditions();
        }

        public boolean parseField(BLiveDefaultOpenConditions bLiveDefaultOpenConditions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("continousUnwatchDays")) {
                bLiveDefaultOpenConditions.continousUnwatchDays = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("onlyOneWatchContinousDays")) {
                return false;
            }
            bLiveDefaultOpenConditions.onlyOneWatchContinousDays = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDefaultOpenConditions bLiveDefaultOpenConditions, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("continousUnwatchDays", bLiveDefaultOpenConditions.continousUnwatchDays);
            jsonGenerator.writeNumberField("onlyOneWatchContinousDays", bLiveDefaultOpenConditions.onlyOneWatchContinousDays);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDefaultOpenConditions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedefaultopenconditions";

    @ProtobufIndex(index = 1)
    public int continousUnwatchDays;

    @ProtobufIndex(index = 2)
    public int onlyOneWatchContinousDays;

    public static BLiveDefaultOpenConditions new_() {
        BLiveDefaultOpenConditions bLiveDefaultOpenConditions = new BLiveDefaultOpenConditions();
        bLiveDefaultOpenConditions.nullCheck();
        return bLiveDefaultOpenConditions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDefaultOpenConditions mo225055clone() {
        BLiveDefaultOpenConditions bLiveDefaultOpenConditions = new BLiveDefaultOpenConditions();
        bLiveDefaultOpenConditions.continousUnwatchDays = this.continousUnwatchDays;
        bLiveDefaultOpenConditions.onlyOneWatchContinousDays = this.onlyOneWatchContinousDays;
        return bLiveDefaultOpenConditions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDefaultOpenConditions)) {
            return false;
        }
        BLiveDefaultOpenConditions bLiveDefaultOpenConditions = (BLiveDefaultOpenConditions) obj;
        return this.continousUnwatchDays == bLiveDefaultOpenConditions.continousUnwatchDays && this.onlyOneWatchContinousDays == bLiveDefaultOpenConditions.onlyOneWatchContinousDays;
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
        int i2 = (((i * 41) + this.continousUnwatchDays) * 41) + this.onlyOneWatchContinousDays;
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
