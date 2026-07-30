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
public class BLiveVoiceSparkReportConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSparkReportConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSparkReportConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSparkReportConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSparkReportConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSparkReportConfig newInstance() {
            return new BLiveVoiceSparkReportConfig();
        }

        public boolean parseField(BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roomType":
                    bLiveVoiceSparkReportConfig.roomType = jsonParser.getValueAsString();
                    return true;
                case "delaySecond":
                    bLiveVoiceSparkReportConfig.delaySecond = jsonParser.getValueAsInt();
                    return true;
                case "reportType":
                    bLiveVoiceSparkReportConfig.reportType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceSparkReportConfig.reportType;
            if (str != null) {
                jsonGenerator.writeStringField("reportType", str);
            }
            String str2 = bLiveVoiceSparkReportConfig.roomType;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomType", str2);
            }
            jsonGenerator.writeNumberField("delaySecond", bLiveVoiceSparkReportConfig.delaySecond);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSparkReportConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesparkreportconfig";

    @ProtobufIndex(index = 3)
    public int delaySecond;

    @NonNull
    @ProtobufIndex(index = 1)
    public String reportType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomType;

    public static BLiveVoiceSparkReportConfig new_() {
        BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig = new BLiveVoiceSparkReportConfig();
        bLiveVoiceSparkReportConfig.nullCheck();
        return bLiveVoiceSparkReportConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSparkReportConfig mo223809clone() {
        BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig = new BLiveVoiceSparkReportConfig();
        bLiveVoiceSparkReportConfig.reportType = this.reportType;
        bLiveVoiceSparkReportConfig.roomType = this.roomType;
        bLiveVoiceSparkReportConfig.delaySecond = this.delaySecond;
        return bLiveVoiceSparkReportConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSparkReportConfig)) {
            return false;
        }
        BLiveVoiceSparkReportConfig bLiveVoiceSparkReportConfig = (BLiveVoiceSparkReportConfig) obj;
        return ValueObject.util_equals(this.reportType, bLiveVoiceSparkReportConfig.reportType) && ValueObject.util_equals(this.roomType, bLiveVoiceSparkReportConfig.roomType) && this.delaySecond == bLiveVoiceSparkReportConfig.delaySecond;
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
        String str = this.reportType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomType;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.delaySecond;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.reportType == null) {
            this.reportType = "";
        }
        if (this.roomType == null) {
            this.roomType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
