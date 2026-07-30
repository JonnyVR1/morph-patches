package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class BoostStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "booststatus";

    @ProtobufIndex(index = 3)
    public boolean active;

    @ProtobufIndex(index = 8)
    public long boostRecordID;

    @Nullable
    @ProtobufIndex(index = 6)
    public String boostType;

    @ProtobufIndex(index = 7)
    public int duration;

    @ProtobufIndex(index = 5)
    public double endTime;

    @ProtobufIndex(index = 9)
    public boolean freeUse;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f21097id;

    @ProtobufIndex(index = 4)
    public double startTime;

    @Nullable
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<BoostStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostStatus>() { // from class: com.p1.mobile.putong.core.data.BoostStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BoostStatus boostStatus) {
            String str = boostStatus.f21097id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = boostStatus.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, boostStatus.active) + CodedOutputByteBufferNano.m17277d(4, boostStatus.startTime) + CodedOutputByteBufferNano.m17277d(5, boostStatus.endTime);
            String str3 = boostStatus.boostType;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(6, str3);
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(7, boostStatus.duration) + CodedOutputByteBufferNano.m17283j(8, boostStatus.boostRecordID) + CodedOutputByteBufferNano.m17275b(9, boostStatus.freeUse);
            boostStatus.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostStatus parse(nc5 nc5Var) throws IOException {
            BoostStatus boostStatus = new BoostStatus();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    boostStatus.f21097id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    boostStatus.type = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    boostStatus.active = nc5Var.m162483g();
                } else if (iM162497u == 33) {
                    boostStatus.startTime = nc5Var.m162484h();
                } else if (iM162497u == 41) {
                    boostStatus.endTime = nc5Var.m162484h();
                } else if (iM162497u == 50) {
                    boostStatus.boostType = nc5Var.m162495s();
                } else if (iM162497u == 56) {
                    boostStatus.duration = nc5Var.m162486j();
                } else if (iM162497u == 64) {
                    boostStatus.boostRecordID = nc5Var.m162487k();
                } else {
                    if (iM162497u != 72) {
                        return boostStatus;
                    }
                    boostStatus.freeUse = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostStatus boostStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = boostStatus.f21097id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = boostStatus.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, boostStatus.active);
            codedOutputByteBufferNano.m17301C(4, boostStatus.startTime);
            codedOutputByteBufferNano.m17301C(5, boostStatus.endTime);
            String str3 = boostStatus.boostType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(6, str3);
            }
            codedOutputByteBufferNano.m17305G(7, boostStatus.duration);
            codedOutputByteBufferNano.m17307I(8, boostStatus.boostRecordID);
            codedOutputByteBufferNano.m17299A(9, boostStatus.freeUse);
        }
    };
    public static JsonAdapter<BoostStatus> JSON_ADAPTER = new ObjectJsonAdapter<BoostStatus>() { // from class: com.p1.mobile.putong.core.data.BoostStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostStatus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BoostStatus newInstance() {
            return new BoostStatus();
        }

        public boolean parseField(BoostStatus boostStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    boostStatus.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "boostType":
                    boostStatus.boostType = jsonParser.getValueAsString();
                    return true;
                case "duration":
                    boostStatus.duration = jsonParser.getValueAsInt();
                    return true;
                case "endTime":
                    boostStatus.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "active":
                    boostStatus.active = jsonParser.getValueAsBoolean();
                    return true;
                case "freeUse":
                    boostStatus.freeUse = jsonParser.getValueAsBoolean();
                    return true;
                case "boostRecordID":
                    boostStatus.boostRecordID = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    boostStatus.f21097id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    boostStatus.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BoostStatus boostStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "boostType":
                case "duration":
                case "endTime":
                case "active":
                case "freeUse":
                case "boostRecordID":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(boostStatus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostStatus boostStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = boostStatus.f21097id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = boostStatus.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, boostStatus.active);
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(boostStatus.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(boostStatus.endTime), jsonGenerator, true);
            String str3 = boostStatus.boostType;
            if (str3 != null) {
                jsonGenerator.writeStringField("boostType", str3);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, boostStatus.duration);
            jsonGenerator.writeNumberField("boostRecordID", boostStatus.boostRecordID);
            jsonGenerator.writeBooleanField("freeUse", boostStatus.freeUse);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostStatus new_() {
        BoostStatus boostStatus = new BoostStatus();
        boostStatus.nullCheck();
        return boostStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BoostStatus mo225055clone() {
        BoostStatus boostStatus = new BoostStatus();
        boostStatus.f21097id = this.f21097id;
        boostStatus.type = this.type;
        boostStatus.active = this.active;
        boostStatus.startTime = this.startTime;
        boostStatus.endTime = this.endTime;
        boostStatus.boostType = this.boostType;
        boostStatus.duration = this.duration;
        boostStatus.boostRecordID = this.boostRecordID;
        boostStatus.freeUse = this.freeUse;
        return boostStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostStatus)) {
            return false;
        }
        BoostStatus boostStatus = (BoostStatus) obj;
        return ValueObject.util_equals(this.f21097id, boostStatus.f21097id) && ValueObject.util_equals(this.type, boostStatus.type) && this.active == boostStatus.active && this.startTime == boostStatus.startTime && this.endTime == boostStatus.endTime && ValueObject.util_equals(this.boostType, boostStatus.boostType) && this.duration == boostStatus.duration && this.boostRecordID == boostStatus.boostRecordID && this.freeUse == boostStatus.freeUse;
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
        String str = this.f21097id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        int i3 = this.active ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.startTime);
        int i4 = ((iHashCode2 + i3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.endTime);
        int i5 = ((i4 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str3 = this.boostType;
        int iHashCode3 = (((i5 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.duration) * 41;
        long j = this.boostRecordID;
        int i6 = ((iHashCode3 + ((int) ((j >>> 32) ^ j))) * 41) + (this.freeUse ? 1231 : 1237);
        this.hashCode = i6;
        return i6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
