package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
public class AcceleratePairingStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "acceleratepairingstatus";

    @ProtobufIndex(index = 3)
    public boolean active;

    @Nullable
    @ProtobufIndex(index = 2)
    public String businessType;

    @ProtobufIndex(index = 6)
    public int duration;

    @ProtobufIndex(index = 5)
    public double endTime;

    @ProtobufIndex(index = 7)
    public boolean freeUse;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f20339id;

    @ProtobufIndex(index = 4)
    public double startTime;
    public static ProtobufAdapter<AcceleratePairingStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<AcceleratePairingStatus>() { // from class: com.p1.mobile.putong.core.data.AcceleratePairingStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AcceleratePairingStatus acceleratePairingStatus) {
            String str = acceleratePairingStatus.f20339id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = acceleratePairingStatus.businessType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, acceleratePairingStatus.active) + CodedOutputByteBufferNano.m17222d(4, acceleratePairingStatus.startTime) + CodedOutputByteBufferNano.m17222d(5, acceleratePairingStatus.endTime) + CodedOutputByteBufferNano.m17226h(6, acceleratePairingStatus.duration) + CodedOutputByteBufferNano.m17220b(7, acceleratePairingStatus.freeUse);
            acceleratePairingStatus.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AcceleratePairingStatus parse(nb5 nb5Var) throws IOException {
            AcceleratePairingStatus acceleratePairingStatus = new AcceleratePairingStatus();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    acceleratePairingStatus.f20339id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    acceleratePairingStatus.businessType = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    acceleratePairingStatus.active = nb5Var.m158738g();
                } else if (iM158752u == 33) {
                    acceleratePairingStatus.startTime = nb5Var.m158739h();
                } else if (iM158752u == 41) {
                    acceleratePairingStatus.endTime = nb5Var.m158739h();
                } else if (iM158752u == 48) {
                    acceleratePairingStatus.duration = nb5Var.m158741j();
                } else {
                    if (iM158752u != 56) {
                        return acceleratePairingStatus;
                    }
                    acceleratePairingStatus.freeUse = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AcceleratePairingStatus acceleratePairingStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = acceleratePairingStatus.f20339id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = acceleratePairingStatus.businessType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, acceleratePairingStatus.active);
            codedOutputByteBufferNano.m17246C(4, acceleratePairingStatus.startTime);
            codedOutputByteBufferNano.m17246C(5, acceleratePairingStatus.endTime);
            codedOutputByteBufferNano.m17250G(6, acceleratePairingStatus.duration);
            codedOutputByteBufferNano.m17244A(7, acceleratePairingStatus.freeUse);
        }
    };
    public static JsonAdapter<AcceleratePairingStatus> JSON_ADAPTER = new ObjectJsonAdapter<AcceleratePairingStatus>() { // from class: com.p1.mobile.putong.core.data.AcceleratePairingStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AcceleratePairingStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AcceleratePairingStatus newInstance() {
            return new AcceleratePairingStatus();
        }

        public boolean parseField(AcceleratePairingStatus acceleratePairingStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    acceleratePairingStatus.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "duration":
                    acceleratePairingStatus.duration = jsonParser.getValueAsInt();
                    return true;
                case "endTime":
                    acceleratePairingStatus.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "active":
                    acceleratePairingStatus.active = jsonParser.getValueAsBoolean();
                    return true;
                case "businessType":
                    acceleratePairingStatus.businessType = jsonParser.getValueAsString();
                    return true;
                case "freeUse":
                    acceleratePairingStatus.freeUse = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    acceleratePairingStatus.f20339id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AcceleratePairingStatus acceleratePairingStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "duration":
                case "endTime":
                case "active":
                case "businessType":
                case "freeUse":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(acceleratePairingStatus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AcceleratePairingStatus acceleratePairingStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = acceleratePairingStatus.f20339id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = acceleratePairingStatus.businessType;
            if (str2 != null) {
                jsonGenerator.writeStringField("businessType", str2);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, acceleratePairingStatus.active);
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(acceleratePairingStatus.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(acceleratePairingStatus.endTime), jsonGenerator, true);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, acceleratePairingStatus.duration);
            jsonGenerator.writeBooleanField("freeUse", acceleratePairingStatus.freeUse);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AcceleratePairingStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AcceleratePairingStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AcceleratePairingStatus new_() {
        AcceleratePairingStatus acceleratePairingStatus = new AcceleratePairingStatus();
        acceleratePairingStatus.nullCheck();
        return acceleratePairingStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AcceleratePairingStatus mo223809clone() {
        AcceleratePairingStatus acceleratePairingStatus = new AcceleratePairingStatus();
        acceleratePairingStatus.f20339id = this.f20339id;
        acceleratePairingStatus.businessType = this.businessType;
        acceleratePairingStatus.active = this.active;
        acceleratePairingStatus.startTime = this.startTime;
        acceleratePairingStatus.endTime = this.endTime;
        acceleratePairingStatus.duration = this.duration;
        acceleratePairingStatus.freeUse = this.freeUse;
        return acceleratePairingStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AcceleratePairingStatus)) {
            return false;
        }
        AcceleratePairingStatus acceleratePairingStatus = (AcceleratePairingStatus) obj;
        return ValueObject.util_equals(this.f20339id, acceleratePairingStatus.f20339id) && ValueObject.util_equals(this.businessType, acceleratePairingStatus.businessType) && this.active == acceleratePairingStatus.active && this.startTime == acceleratePairingStatus.startTime && this.endTime == acceleratePairingStatus.endTime && this.duration == acceleratePairingStatus.duration && this.freeUse == acceleratePairingStatus.freeUse;
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
        String str = this.f20339id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.businessType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        int i3 = this.active ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.startTime);
        int i4 = ((iHashCode2 + i3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.endTime);
        int i5 = (((((i4 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41) + this.duration) * 41) + (this.freeUse ? 1231 : 1237);
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
