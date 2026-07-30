package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class GrowthExposureInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthexposureinfo";

    @ProtobufIndex(index = 1)
    public int continuousSignDays;

    @ProtobufIndex(index = 2)
    public int exposureNum;

    @ProtobufIndex(index = 4)
    public boolean isSignedToday;

    @ProtobufIndex(index = 3)
    public long lastSignTime;
    public static ProtobufAdapter<GrowthExposureInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthExposureInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthExposureInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthExposureInfo growthExposureInfo) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, growthExposureInfo.continuousSignDays) + CodedOutputByteBufferNano.m17226h(2, growthExposureInfo.exposureNum) + CodedOutputByteBufferNano.m17228j(3, growthExposureInfo.lastSignTime) + CodedOutputByteBufferNano.m17220b(4, growthExposureInfo.isSignedToday);
            growthExposureInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthExposureInfo parse(nb5 nb5Var) throws IOException {
            GrowthExposureInfo growthExposureInfo = new GrowthExposureInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    growthExposureInfo.continuousSignDays = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    growthExposureInfo.exposureNum = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    growthExposureInfo.lastSignTime = nb5Var.m158742k();
                } else {
                    if (iM158752u != 32) {
                        return growthExposureInfo;
                    }
                    growthExposureInfo.isSignedToday = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthExposureInfo growthExposureInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, growthExposureInfo.continuousSignDays);
            codedOutputByteBufferNano.m17250G(2, growthExposureInfo.exposureNum);
            codedOutputByteBufferNano.m17252I(3, growthExposureInfo.lastSignTime);
            codedOutputByteBufferNano.m17244A(4, growthExposureInfo.isSignedToday);
        }
    };
    public static JsonAdapter<GrowthExposureInfo> JSON_ADAPTER = new ObjectJsonAdapter<GrowthExposureInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthExposureInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthExposureInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthExposureInfo newInstance() {
            return new GrowthExposureInfo();
        }

        public boolean parseField(GrowthExposureInfo growthExposureInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isSignedToday":
                    growthExposureInfo.isSignedToday = jsonParser.getValueAsBoolean();
                    return true;
                case "lastSignTime":
                    growthExposureInfo.lastSignTime = jsonParser.getValueAsLong();
                    return true;
                case "exposureNum":
                    growthExposureInfo.exposureNum = jsonParser.getValueAsInt();
                    return true;
                case "continuousSignDays":
                    growthExposureInfo.continuousSignDays = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthExposureInfo growthExposureInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isSignedToday":
                case "lastSignTime":
                case "exposureNum":
                case "continuousSignDays":
                    return true;
                default:
                    return super.parseFieldCheck(growthExposureInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GrowthExposureInfo growthExposureInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("continuousSignDays", growthExposureInfo.continuousSignDays);
            jsonGenerator.writeNumberField("exposureNum", growthExposureInfo.exposureNum);
            jsonGenerator.writeNumberField("lastSignTime", growthExposureInfo.lastSignTime);
            jsonGenerator.writeBooleanField("isSignedToday", growthExposureInfo.isSignedToday);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthExposureInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthExposureInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthExposureInfo new_() {
        GrowthExposureInfo growthExposureInfo = new GrowthExposureInfo();
        growthExposureInfo.nullCheck();
        return growthExposureInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthExposureInfo mo223809clone() {
        GrowthExposureInfo growthExposureInfo = new GrowthExposureInfo();
        growthExposureInfo.continuousSignDays = this.continuousSignDays;
        growthExposureInfo.exposureNum = this.exposureNum;
        growthExposureInfo.lastSignTime = this.lastSignTime;
        growthExposureInfo.isSignedToday = this.isSignedToday;
        return growthExposureInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthExposureInfo)) {
            return false;
        }
        GrowthExposureInfo growthExposureInfo = (GrowthExposureInfo) obj;
        return this.continuousSignDays == growthExposureInfo.continuousSignDays && this.exposureNum == growthExposureInfo.exposureNum && this.lastSignTime == growthExposureInfo.lastSignTime && this.isSignedToday == growthExposureInfo.isSignedToday;
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
        int i2 = ((((i * 41) + this.continuousSignDays) * 41) + this.exposureNum) * 41;
        long j = this.lastSignTime;
        int i3 = ((i2 + ((int) (j ^ (j >>> 32)))) * 41) + (this.isSignedToday ? 1231 : 1237);
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
