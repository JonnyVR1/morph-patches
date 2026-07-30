package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.heytap.mcssdk.mode.Message;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePkTimeRange;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePkEntranceShowLimit extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkEntranceShowLimit> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkEntranceShowLimit>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkEntranceShowLimit.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkEntranceShowLimit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkEntranceShowLimit newInstance() {
            return new BLivePkEntranceShowLimit();
        }

        public boolean parseField(BLivePkEntranceShowLimit bLivePkEntranceShowLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "allDay":
                    bLivePkEntranceShowLimit.allDay = jsonParser.getValueAsBoolean();
                    return true;
                case "timeRangesMessage":
                    bLivePkEntranceShowLimit.timeRangesMessage = jsonParser.getValueAsString();
                    return true;
                case "timeRanges":
                    bLivePkEntranceShowLimit.timeRanges = JsonAdapter.parseArray(jsonParser, BLivePkTimeRange.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkEntranceShowLimit bLivePkEntranceShowLimit, JsonGenerator jsonGenerator) throws IOException {
            if (bLivePkEntranceShowLimit.timeRanges != null) {
                jsonGenerator.writeFieldName(Message.TIME_RANGES);
                JsonAdapter.serializeArray(bLivePkEntranceShowLimit.timeRanges, jsonGenerator, BLivePkTimeRange.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("allDay", bLivePkEntranceShowLimit.allDay);
            String str = bLivePkEntranceShowLimit.timeRangesMessage;
            if (str != null) {
                jsonGenerator.writeStringField("timeRangesMessage", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkEntranceShowLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkentranceshowlimit";

    @ProtobufIndex(index = 2)
    public boolean allDay;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLivePkTimeRange> timeRanges;

    @NonNull
    @ProtobufIndex(index = 3)
    public String timeRangesMessage;

    public static BLivePkEntranceShowLimit new_() {
        BLivePkEntranceShowLimit bLivePkEntranceShowLimit = new BLivePkEntranceShowLimit();
        bLivePkEntranceShowLimit.nullCheck();
        return bLivePkEntranceShowLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkEntranceShowLimit mo225055clone() {
        BLivePkEntranceShowLimit bLivePkEntranceShowLimit = new BLivePkEntranceShowLimit();
        List<BLivePkTimeRange> list = this.timeRanges;
        if (list != null) {
            bLivePkEntranceShowLimit.timeRanges = ValueObject.util_map(list, new qcj() { // from class: l.l42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkTimeRange) obj).mo225055clone();
                }
            });
        }
        bLivePkEntranceShowLimit.allDay = this.allDay;
        bLivePkEntranceShowLimit.timeRangesMessage = this.timeRangesMessage;
        return bLivePkEntranceShowLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkEntranceShowLimit)) {
            return false;
        }
        BLivePkEntranceShowLimit bLivePkEntranceShowLimit = (BLivePkEntranceShowLimit) obj;
        return ValueObject.util_equals(this.timeRanges, bLivePkEntranceShowLimit.timeRanges) && this.allDay == bLivePkEntranceShowLimit.allDay && ValueObject.util_equals(this.timeRangesMessage, bLivePkEntranceShowLimit.timeRangesMessage);
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
        List<BLivePkTimeRange> list = this.timeRanges;
        int iHashCode = (((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.allDay ? 1231 : 1237)) * 41;
        String str = this.timeRangesMessage;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.timeRanges == null) {
            this.timeRanges = new ArrayList();
        }
        if (this.timeRangesMessage == null) {
            this.timeRangesMessage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
