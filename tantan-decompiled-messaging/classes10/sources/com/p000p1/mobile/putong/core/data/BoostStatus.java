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
public class BoostStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "booststatus";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean active;

    @ProtobufIndex(index = 8)
    public long boostRecordID;

    @Nullable
    @ProtobufIndex(index = 6)
    public String boostType;

    @ProtobufIndex(index = 7)
    public int duration;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public double endTime;

    @ProtobufIndex(index = 9)
    public boolean freeUse;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f17id;

    @ProtobufIndex(index = 4)
    public double startTime;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<BoostStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostStatus>() { // from class: com.p1.mobile.putong.core.data.BoostStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BoostStatus boostStatus) {
            String str = boostStatus.f17id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = boostStatus.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, boostStatus.active) + CodedOutputByteBufferNano.d(4, boostStatus.startTime) + CodedOutputByteBufferNano.d(5, boostStatus.endTime);
            String str3 = boostStatus.boostType;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(6, str3);
            }
            int iH = iB + CodedOutputByteBufferNano.h(7, boostStatus.duration) + CodedOutputByteBufferNano.j(8, boostStatus.boostRecordID) + CodedOutputByteBufferNano.b(9, boostStatus.freeUse);
            ((MessageNano) boostStatus).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BoostStatus m11803parse(nb5 nb5Var) throws IOException {
            BoostStatus boostStatus = new BoostStatus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    boostStatus.f17id = nb5Var.s();
                } else if (iU == 18) {
                    boostStatus.type = nb5Var.s();
                } else if (iU == 24) {
                    boostStatus.active = nb5Var.g();
                } else if (iU == 33) {
                    boostStatus.startTime = nb5Var.h();
                } else if (iU == 41) {
                    boostStatus.endTime = nb5Var.h();
                } else if (iU == 50) {
                    boostStatus.boostType = nb5Var.s();
                } else if (iU == 56) {
                    boostStatus.duration = nb5Var.j();
                } else if (iU == 64) {
                    boostStatus.boostRecordID = nb5Var.k();
                } else {
                    if (iU != 72) {
                        return boostStatus;
                    }
                    boostStatus.freeUse = nb5Var.g();
                }
            }
        }

        public void serialize(BoostStatus boostStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = boostStatus.f17id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = boostStatus.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, boostStatus.active);
            codedOutputByteBufferNano.C(4, boostStatus.startTime);
            codedOutputByteBufferNano.C(5, boostStatus.endTime);
            String str3 = boostStatus.boostType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            codedOutputByteBufferNano.G(7, boostStatus.duration);
            codedOutputByteBufferNano.I(8, boostStatus.boostRecordID);
            codedOutputByteBufferNano.A(9, boostStatus.freeUse);
        }
    };
    public static JsonAdapter<BoostStatus> JSON_ADAPTER = new ObjectJsonAdapter<BoostStatus>() { // from class: com.p1.mobile.putong.core.data.BoostStatus.2
        public Class getDataClass() {
            return BoostStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BoostStatus m11804newInstance() {
            return new BoostStatus();
        }

        public boolean parseField(BoostStatus boostStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    boostStatus.startTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "boostType":
                    boostStatus.boostType = jsonParser.getValueAsString();
                    return true;
                case "duration":
                    boostStatus.duration = jsonParser.getValueAsInt();
                    return true;
                case "endTime":
                    boostStatus.endTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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
                    boostStatus.f17id = jsonParser.getValueAsString();
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

        public void serializeFields(BoostStatus boostStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = boostStatus.f17id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = boostStatus.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, boostStatus.active);
            jsonGenerator.writeFieldName("startTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(boostStatus.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(boostStatus.endTime), jsonGenerator, true);
            String str3 = boostStatus.boostType;
            if (str3 != null) {
                jsonGenerator.writeStringField("boostType", str3);
            }
            jsonGenerator.writeNumberField("duration", boostStatus.duration);
            jsonGenerator.writeNumberField("boostRecordID", boostStatus.boostRecordID);
            jsonGenerator.writeBooleanField("freeUse", boostStatus.freeUse);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostStatus new_() {
        BoostStatus boostStatus = new BoostStatus();
        boostStatus.nullCheck();
        return boostStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BoostStatus m11802clone() {
        BoostStatus boostStatus = new BoostStatus();
        boostStatus.f17id = this.f17id;
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
        return ValueObject.util_equals(this.f17id, boostStatus.f17id) && ValueObject.util_equals(this.type, boostStatus.type) && this.active == boostStatus.active && this.startTime == boostStatus.startTime && this.endTime == boostStatus.endTime && ValueObject.util_equals(this.boostType, boostStatus.boostType) && this.duration == boostStatus.duration && this.boostRecordID == boostStatus.boostRecordID && this.freeUse == boostStatus.freeUse;
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
        String str = this.f17id;
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
        ((ValueObject) this).hashCode = i6;
        return i6;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
