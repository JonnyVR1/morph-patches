package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AcceleratePairingStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "acceleratepairingstatus";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean active;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String businessType;

    @ProtobufIndex(index = 6)
    public int duration;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public double endTime;

    @ProtobufIndex(index = 7)
    public boolean freeUse;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f1id;

    @ProtobufIndex(index = 4)
    public double startTime;
    public static ProtobufAdapter<AcceleratePairingStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<AcceleratePairingStatus>() { // from class: com.p1.mobile.putong.core.data.AcceleratePairingStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AcceleratePairingStatus acceleratePairingStatus) {
            String str = acceleratePairingStatus.f1id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = acceleratePairingStatus.businessType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, acceleratePairingStatus.active) + CodedOutputByteBufferNano.d(4, acceleratePairingStatus.startTime) + CodedOutputByteBufferNano.d(5, acceleratePairingStatus.endTime) + CodedOutputByteBufferNano.h(6, acceleratePairingStatus.duration) + CodedOutputByteBufferNano.b(7, acceleratePairingStatus.freeUse);
            ((MessageNano) acceleratePairingStatus).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AcceleratePairingStatus m11483parse(nb5 nb5Var) throws IOException {
            AcceleratePairingStatus acceleratePairingStatus = new AcceleratePairingStatus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    acceleratePairingStatus.f1id = nb5Var.s();
                } else if (iU == 18) {
                    acceleratePairingStatus.businessType = nb5Var.s();
                } else if (iU == 24) {
                    acceleratePairingStatus.active = nb5Var.g();
                } else if (iU == 33) {
                    acceleratePairingStatus.startTime = nb5Var.h();
                } else if (iU == 41) {
                    acceleratePairingStatus.endTime = nb5Var.h();
                } else if (iU == 48) {
                    acceleratePairingStatus.duration = nb5Var.j();
                } else {
                    if (iU != 56) {
                        return acceleratePairingStatus;
                    }
                    acceleratePairingStatus.freeUse = nb5Var.g();
                }
            }
        }

        public void serialize(AcceleratePairingStatus acceleratePairingStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = acceleratePairingStatus.f1id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = acceleratePairingStatus.businessType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, acceleratePairingStatus.active);
            codedOutputByteBufferNano.C(4, acceleratePairingStatus.startTime);
            codedOutputByteBufferNano.C(5, acceleratePairingStatus.endTime);
            codedOutputByteBufferNano.G(6, acceleratePairingStatus.duration);
            codedOutputByteBufferNano.A(7, acceleratePairingStatus.freeUse);
        }
    };
    public static JsonAdapter<AcceleratePairingStatus> JSON_ADAPTER = new ObjectJsonAdapter<AcceleratePairingStatus>() { // from class: com.p1.mobile.putong.core.data.AcceleratePairingStatus.2
        public Class getDataClass() {
            return AcceleratePairingStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AcceleratePairingStatus m11484newInstance() {
            return new AcceleratePairingStatus();
        }

        public boolean parseField(AcceleratePairingStatus acceleratePairingStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    acceleratePairingStatus.startTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "duration":
                    acceleratePairingStatus.duration = jsonParser.getValueAsInt();
                    return true;
                case "endTime":
                    acceleratePairingStatus.endTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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
                    acceleratePairingStatus.f1id = jsonParser.getValueAsString();
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

        public void serializeFields(AcceleratePairingStatus acceleratePairingStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = acceleratePairingStatus.f1id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = acceleratePairingStatus.businessType;
            if (str2 != null) {
                jsonGenerator.writeStringField("businessType", str2);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, acceleratePairingStatus.active);
            jsonGenerator.writeFieldName("startTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(acceleratePairingStatus.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(acceleratePairingStatus.endTime), jsonGenerator, true);
            jsonGenerator.writeNumberField("duration", acceleratePairingStatus.duration);
            jsonGenerator.writeBooleanField("freeUse", acceleratePairingStatus.freeUse);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AcceleratePairingStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AcceleratePairingStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AcceleratePairingStatus new_() {
        AcceleratePairingStatus acceleratePairingStatus = new AcceleratePairingStatus();
        acceleratePairingStatus.nullCheck();
        return acceleratePairingStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AcceleratePairingStatus m11482clone() {
        AcceleratePairingStatus acceleratePairingStatus = new AcceleratePairingStatus();
        acceleratePairingStatus.f1id = this.f1id;
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
        return ValueObject.util_equals(this.f1id, acceleratePairingStatus.f1id) && ValueObject.util_equals(this.businessType, acceleratePairingStatus.businessType) && this.active == acceleratePairingStatus.active && this.startTime == acceleratePairingStatus.startTime && this.endTime == acceleratePairingStatus.endTime && this.duration == acceleratePairingStatus.duration && this.freeUse == acceleratePairingStatus.freeUse;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f1id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.businessType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        int i3 = this.active ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.startTime);
        int i4 = ((iHashCode2 + i3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.endTime);
        int i5 = (((((i4 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41) + this.duration) * 41) + (this.freeUse ? 1231 : 1237);
        ((ValueObject) this).hashCode = i5;
        return i5;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
