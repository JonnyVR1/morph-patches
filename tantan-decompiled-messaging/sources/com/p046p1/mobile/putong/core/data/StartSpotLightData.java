package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
public class StartSpotLightData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "startspotlightdata";

    @ProtobufIndex(index = 2)
    public boolean active;

    @ProtobufIndex(index = 9)
    public int available;

    @NonNull
    @ProtobufIndex(index = 8)
    public String boostType;

    @ProtobufIndex(index = 5)
    public long duration;

    @NonNull
    @ProtobufIndex(index = 4)
    public String endTime;

    @ProtobufIndex(index = 7)
    public long endTimeInt;

    @ProtobufIndex(index = 10)
    public int remain;

    @NonNull
    @ProtobufIndex(index = 3)
    public String startTime;

    @ProtobufIndex(index = 6)
    public long startTimeInt;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<StartSpotLightData> PROTOBUF_ADAPTER = new MessageNanoAdapter<StartSpotLightData>() { // from class: com.p1.mobile.putong.core.data.StartSpotLightData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StartSpotLightData startSpotLightData) {
            String str = startSpotLightData.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, startSpotLightData.active);
            String str2 = startSpotLightData.startTime;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = startSpotLightData.endTime;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(5, startSpotLightData.duration) + CodedOutputByteBufferNano.m17228j(6, startSpotLightData.startTimeInt) + CodedOutputByteBufferNano.m17228j(7, startSpotLightData.endTimeInt);
            String str4 = startSpotLightData.boostType;
            if (str4 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(8, str4);
            }
            int iM17226h = iM17228j + CodedOutputByteBufferNano.m17226h(9, startSpotLightData.available) + CodedOutputByteBufferNano.m17226h(10, startSpotLightData.remain);
            startSpotLightData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StartSpotLightData parse(nb5 nb5Var) throws IOException {
            StartSpotLightData startSpotLightData = new StartSpotLightData();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (startSpotLightData.userId == null) {
                            startSpotLightData.userId = "";
                        }
                        if (startSpotLightData.startTime == null) {
                            startSpotLightData.startTime = "";
                        }
                        if (startSpotLightData.endTime == null) {
                            startSpotLightData.endTime = "";
                        }
                        if (startSpotLightData.boostType == null) {
                            startSpotLightData.boostType = "";
                        }
                        break;
                    case 10:
                        startSpotLightData.userId = nb5Var.m158750s();
                        continue;
                    case 16:
                        startSpotLightData.active = nb5Var.m158738g();
                        continue;
                    case 26:
                        startSpotLightData.startTime = nb5Var.m158750s();
                        continue;
                    case 34:
                        startSpotLightData.endTime = nb5Var.m158750s();
                        continue;
                    case 40:
                        startSpotLightData.duration = nb5Var.m158742k();
                        continue;
                    case 48:
                        startSpotLightData.startTimeInt = nb5Var.m158742k();
                        continue;
                    case 56:
                        startSpotLightData.endTimeInt = nb5Var.m158742k();
                        continue;
                    case 66:
                        startSpotLightData.boostType = nb5Var.m158750s();
                        continue;
                    case 72:
                        startSpotLightData.available = nb5Var.m158741j();
                        continue;
                    case 80:
                        startSpotLightData.remain = nb5Var.m158741j();
                        continue;
                    default:
                        if (startSpotLightData.userId == null) {
                            startSpotLightData.userId = "";
                        }
                        if (startSpotLightData.startTime == null) {
                            startSpotLightData.startTime = "";
                        }
                        if (startSpotLightData.endTime == null) {
                            startSpotLightData.endTime = "";
                        }
                        if (startSpotLightData.boostType == null) {
                            startSpotLightData.boostType = "";
                            return startSpotLightData;
                        }
                        break;
                }
            }
            return startSpotLightData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StartSpotLightData startSpotLightData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = startSpotLightData.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, startSpotLightData.active);
            String str2 = startSpotLightData.startTime;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = startSpotLightData.endTime;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17252I(5, startSpotLightData.duration);
            codedOutputByteBufferNano.m17252I(6, startSpotLightData.startTimeInt);
            codedOutputByteBufferNano.m17252I(7, startSpotLightData.endTimeInt);
            String str4 = startSpotLightData.boostType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(8, str4);
            }
            codedOutputByteBufferNano.m17250G(9, startSpotLightData.available);
            codedOutputByteBufferNano.m17250G(10, startSpotLightData.remain);
        }
    };
    public static JsonAdapter<StartSpotLightData> JSON_ADAPTER = new ObjectJsonAdapter<StartSpotLightData>() { // from class: com.p1.mobile.putong.core.data.StartSpotLightData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StartSpotLightData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StartSpotLightData newInstance() {
            return new StartSpotLightData();
        }

        public boolean parseField(StartSpotLightData startSpotLightData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    startSpotLightData.startTime = jsonParser.getValueAsString();
                    return true;
                case "boostType":
                    startSpotLightData.boostType = jsonParser.getValueAsString();
                    return true;
                case "duration":
                    startSpotLightData.duration = jsonParser.getValueAsLong();
                    return true;
                case "endTime":
                    startSpotLightData.endTime = jsonParser.getValueAsString();
                    return true;
                case "startTimeInt":
                    startSpotLightData.startTimeInt = jsonParser.getValueAsLong();
                    return true;
                case "active":
                    startSpotLightData.active = jsonParser.getValueAsBoolean();
                    return true;
                case "endTimeInt":
                    startSpotLightData.endTimeInt = jsonParser.getValueAsLong();
                    return true;
                case "remain":
                    startSpotLightData.remain = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    startSpotLightData.userId = jsonParser.getValueAsString();
                    return true;
                case "available":
                    startSpotLightData.available = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StartSpotLightData startSpotLightData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "boostType":
                case "duration":
                case "endTime":
                case "startTimeInt":
                case "active":
                case "endTimeInt":
                case "remain":
                case "userId":
                case "available":
                    return true;
                default:
                    return super.parseFieldCheck(startSpotLightData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StartSpotLightData startSpotLightData, JsonGenerator jsonGenerator) throws IOException {
            String str = startSpotLightData.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, startSpotLightData.active);
            String str2 = startSpotLightData.startTime;
            if (str2 != null) {
                jsonGenerator.writeStringField(StudentVerRejectedReason.startTime, str2);
            }
            String str3 = startSpotLightData.endTime;
            if (str3 != null) {
                jsonGenerator.writeStringField("endTime", str3);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, startSpotLightData.duration);
            jsonGenerator.writeNumberField("startTimeInt", startSpotLightData.startTimeInt);
            jsonGenerator.writeNumberField("endTimeInt", startSpotLightData.endTimeInt);
            String str4 = startSpotLightData.boostType;
            if (str4 != null) {
                jsonGenerator.writeStringField("boostType", str4);
            }
            jsonGenerator.writeNumberField("available", startSpotLightData.available);
            jsonGenerator.writeNumberField("remain", startSpotLightData.remain);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StartSpotLightData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StartSpotLightData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StartSpotLightData new_() {
        StartSpotLightData startSpotLightData = new StartSpotLightData();
        startSpotLightData.nullCheck();
        return startSpotLightData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StartSpotLightData mo223809clone() {
        StartSpotLightData startSpotLightData = new StartSpotLightData();
        startSpotLightData.userId = this.userId;
        startSpotLightData.active = this.active;
        startSpotLightData.startTime = this.startTime;
        startSpotLightData.endTime = this.endTime;
        startSpotLightData.duration = this.duration;
        startSpotLightData.startTimeInt = this.startTimeInt;
        startSpotLightData.endTimeInt = this.endTimeInt;
        startSpotLightData.boostType = this.boostType;
        startSpotLightData.available = this.available;
        startSpotLightData.remain = this.remain;
        return startSpotLightData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartSpotLightData)) {
            return false;
        }
        StartSpotLightData startSpotLightData = (StartSpotLightData) obj;
        return ValueObject.util_equals(this.userId, startSpotLightData.userId) && this.active == startSpotLightData.active && ValueObject.util_equals(this.startTime, startSpotLightData.startTime) && ValueObject.util_equals(this.endTime, startSpotLightData.endTime) && this.duration == startSpotLightData.duration && this.startTimeInt == startSpotLightData.startTimeInt && this.endTimeInt == startSpotLightData.endTimeInt && ValueObject.util_equals(this.boostType, startSpotLightData.boostType) && this.available == startSpotLightData.available && this.remain == startSpotLightData.remain;
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
        String str = this.userId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.active ? 1231 : 1237)) * 41;
        String str2 = this.startTime;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.endTime;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.duration;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.startTimeInt;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.endTimeInt;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str4 = this.boostType;
        int iHashCode4 = ((((i5 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.available) * 41) + this.remain;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.startTime == null) {
            this.startTime = "";
        }
        if (this.endTime == null) {
            this.endTime = "";
        }
        if (this.boostType == null) {
            this.boostType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
