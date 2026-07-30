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
public class BLiveEntranceLimitation extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEntranceLimitation> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEntranceLimitation>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEntranceLimitation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEntranceLimitation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEntranceLimitation newInstance() {
            return new BLiveEntranceLimitation();
        }

        public boolean parseField(BLiveEntranceLimitation bLiveEntranceLimitation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "maxShowPerNDays":
                    bLiveEntranceLimitation.maxShowPerNDays = BLivePerNDays.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "maxShowPerDay":
                    bLiveEntranceLimitation.maxShowPerDay = jsonParser.getValueAsInt();
                    return true;
                case "unwatchDays":
                    bLiveEntranceLimitation.unwatchDays = jsonParser.getValueAsInt();
                    return true;
                case "unopenedEntranceDays":
                    bLiveEntranceLimitation.unopenedEntranceDays = jsonParser.getValueAsInt();
                    return true;
                case "maxShow":
                    bLiveEntranceLimitation.maxShow = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEntranceLimitation bLiveEntranceLimitation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unopenedEntranceDays", bLiveEntranceLimitation.unopenedEntranceDays);
            jsonGenerator.writeNumberField("unwatchDays", bLiveEntranceLimitation.unwatchDays);
            jsonGenerator.writeNumberField("maxShow", bLiveEntranceLimitation.maxShow);
            jsonGenerator.writeNumberField("maxShowPerDay", bLiveEntranceLimitation.maxShowPerDay);
            if (bLiveEntranceLimitation.maxShowPerNDays != null) {
                jsonGenerator.writeFieldName("maxShowPerNDays");
                BLivePerNDays.JSON_ADAPTER.serialize(bLiveEntranceLimitation.maxShowPerNDays, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEntranceLimitation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveentrancelimitation";

    @ProtobufIndex(index = 3)
    public int maxShow;

    @ProtobufIndex(index = 4)
    public int maxShowPerDay;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLivePerNDays maxShowPerNDays;

    @ProtobufIndex(index = 1)
    public int unopenedEntranceDays;

    @ProtobufIndex(index = 2)
    public int unwatchDays;

    public static BLiveEntranceLimitation new_() {
        BLiveEntranceLimitation bLiveEntranceLimitation = new BLiveEntranceLimitation();
        bLiveEntranceLimitation.nullCheck();
        return bLiveEntranceLimitation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEntranceLimitation mo223809clone() {
        BLiveEntranceLimitation bLiveEntranceLimitation = new BLiveEntranceLimitation();
        bLiveEntranceLimitation.unopenedEntranceDays = this.unopenedEntranceDays;
        bLiveEntranceLimitation.unwatchDays = this.unwatchDays;
        bLiveEntranceLimitation.maxShow = this.maxShow;
        bLiveEntranceLimitation.maxShowPerDay = this.maxShowPerDay;
        BLivePerNDays bLivePerNDays = this.maxShowPerNDays;
        if (bLivePerNDays != null) {
            bLiveEntranceLimitation.maxShowPerNDays = bLivePerNDays.mo223809clone();
        }
        return bLiveEntranceLimitation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEntranceLimitation)) {
            return false;
        }
        BLiveEntranceLimitation bLiveEntranceLimitation = (BLiveEntranceLimitation) obj;
        return this.unopenedEntranceDays == bLiveEntranceLimitation.unopenedEntranceDays && this.unwatchDays == bLiveEntranceLimitation.unwatchDays && this.maxShow == bLiveEntranceLimitation.maxShow && this.maxShowPerDay == bLiveEntranceLimitation.maxShowPerDay && ValueObject.util_equals(this.maxShowPerNDays, bLiveEntranceLimitation.maxShowPerNDays);
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
        int i2 = ((((((((i * 41) + this.unopenedEntranceDays) * 41) + this.unwatchDays) * 41) + this.maxShow) * 41) + this.maxShowPerDay) * 41;
        BLivePerNDays bLivePerNDays = this.maxShowPerNDays;
        int iHashCode = i2 + (bLivePerNDays != null ? bLivePerNDays.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.maxShowPerNDays == null) {
            this.maxShowPerNDays = BLivePerNDays.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
