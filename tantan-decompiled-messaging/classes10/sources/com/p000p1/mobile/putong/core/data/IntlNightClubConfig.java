package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class IntlNightClubConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlnightclubconfig";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String address;

    @ProtobufIndex(index = 7)
    public boolean enable;

    @ProtobufIndex(index = 6)
    public long endTimeStamp;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f89id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double latitude;

    @ProtobufIndex(index = 4)
    public double longitude;

    @ProtobufIndex(index = 8)
    public int radiusMeter;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public int roundNum;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public long startTimeStamp;

    @ProtobufIndex(index = 9)
    public int swipePopNum;
    public static ProtobufAdapter<IntlNightClubConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlNightClubConfig>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlNightClubConfig intlNightClubConfig) {
            String str = intlNightClubConfig.f89id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlNightClubConfig.address;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, intlNightClubConfig.latitude) + CodedOutputByteBufferNano.d(4, intlNightClubConfig.longitude) + CodedOutputByteBufferNano.j(5, intlNightClubConfig.startTimeStamp) + CodedOutputByteBufferNano.j(6, intlNightClubConfig.endTimeStamp) + CodedOutputByteBufferNano.b(7, intlNightClubConfig.enable) + CodedOutputByteBufferNano.h(8, intlNightClubConfig.radiusMeter) + CodedOutputByteBufferNano.h(9, intlNightClubConfig.swipePopNum) + CodedOutputByteBufferNano.h(10, intlNightClubConfig.roundNum);
            ((MessageNano) intlNightClubConfig).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlNightClubConfig m13649parse(nb5 nb5Var) throws IOException {
            IntlNightClubConfig intlNightClubConfig = new IntlNightClubConfig();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (intlNightClubConfig.f89id == null) {
                            intlNightClubConfig.f89id = "";
                        }
                        if (intlNightClubConfig.address == null) {
                            intlNightClubConfig.address = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        intlNightClubConfig.f89id = nb5Var.s();
                        continue;
                    case 18:
                        intlNightClubConfig.address = nb5Var.s();
                        continue;
                    case 25:
                        intlNightClubConfig.latitude = nb5Var.h();
                        continue;
                    case 33:
                        intlNightClubConfig.longitude = nb5Var.h();
                        continue;
                    case 40:
                        intlNightClubConfig.startTimeStamp = nb5Var.k();
                        continue;
                    case 48:
                        intlNightClubConfig.endTimeStamp = nb5Var.k();
                        continue;
                    case 56:
                        intlNightClubConfig.enable = nb5Var.g();
                        continue;
                    case 64:
                        intlNightClubConfig.radiusMeter = nb5Var.j();
                        continue;
                    case 72:
                        intlNightClubConfig.swipePopNum = nb5Var.j();
                        continue;
                    case 80:
                        intlNightClubConfig.roundNum = nb5Var.j();
                        continue;
                    default:
                        if (intlNightClubConfig.f89id == null) {
                            intlNightClubConfig.f89id = "";
                        }
                        if (intlNightClubConfig.address == null) {
                            intlNightClubConfig.address = "";
                            return intlNightClubConfig;
                        }
                        break;
                }
            }
            return intlNightClubConfig;
        }

        public void serialize(IntlNightClubConfig intlNightClubConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlNightClubConfig.f89id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlNightClubConfig.address;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.C(3, intlNightClubConfig.latitude);
            codedOutputByteBufferNano.C(4, intlNightClubConfig.longitude);
            codedOutputByteBufferNano.I(5, intlNightClubConfig.startTimeStamp);
            codedOutputByteBufferNano.I(6, intlNightClubConfig.endTimeStamp);
            codedOutputByteBufferNano.A(7, intlNightClubConfig.enable);
            codedOutputByteBufferNano.G(8, intlNightClubConfig.radiusMeter);
            codedOutputByteBufferNano.G(9, intlNightClubConfig.swipePopNum);
            codedOutputByteBufferNano.G(10, intlNightClubConfig.roundNum);
        }
    };
    public static JsonAdapter<IntlNightClubConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlNightClubConfig>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubConfig.2
        public Class getDataClass() {
            return IntlNightClubConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlNightClubConfig m13650newInstance() {
            return new IntlNightClubConfig();
        }

        public boolean parseField(IntlNightClubConfig intlNightClubConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "latitude":
                    intlNightClubConfig.latitude = jsonParser.getValueAsDouble();
                    return true;
                case "enable":
                    intlNightClubConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "address":
                    intlNightClubConfig.address = jsonParser.getValueAsString();
                    return true;
                case "endTimeStamp":
                    intlNightClubConfig.endTimeStamp = jsonParser.getValueAsLong();
                    return true;
                case "startTimeStamp":
                    intlNightClubConfig.startTimeStamp = jsonParser.getValueAsLong();
                    return true;
                case "roundNum":
                    intlNightClubConfig.roundNum = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    intlNightClubConfig.f89id = jsonParser.getValueAsString();
                    return false;
                case "longitude":
                    intlNightClubConfig.longitude = jsonParser.getValueAsDouble();
                    return true;
                case "swipePopNum":
                    intlNightClubConfig.swipePopNum = jsonParser.getValueAsInt();
                    return true;
                case "radiusMeter":
                    intlNightClubConfig.radiusMeter = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlNightClubConfig intlNightClubConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "latitude":
                case "enable":
                case "address":
                case "endTimeStamp":
                case "startTimeStamp":
                case "roundNum":
                    return true;
                case "id":
                    return false;
                case "longitude":
                case "swipePopNum":
                case "radiusMeter":
                    return true;
                default:
                    return super.parseFieldCheck(intlNightClubConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlNightClubConfig intlNightClubConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = intlNightClubConfig.f89id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = intlNightClubConfig.address;
            if (str2 != null) {
                jsonGenerator.writeStringField("address", str2);
            }
            jsonGenerator.writeNumberField("latitude", intlNightClubConfig.latitude);
            jsonGenerator.writeNumberField("longitude", intlNightClubConfig.longitude);
            jsonGenerator.writeNumberField("startTimeStamp", intlNightClubConfig.startTimeStamp);
            jsonGenerator.writeNumberField("endTimeStamp", intlNightClubConfig.endTimeStamp);
            jsonGenerator.writeBooleanField("enable", intlNightClubConfig.enable);
            jsonGenerator.writeNumberField("radiusMeter", intlNightClubConfig.radiusMeter);
            jsonGenerator.writeNumberField("swipePopNum", intlNightClubConfig.swipePopNum);
            jsonGenerator.writeNumberField("roundNum", intlNightClubConfig.roundNum);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlNightClubConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlNightClubConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlNightClubConfig new_() {
        IntlNightClubConfig intlNightClubConfig = new IntlNightClubConfig();
        intlNightClubConfig.nullCheck();
        return intlNightClubConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlNightClubConfig m13648clone() {
        IntlNightClubConfig intlNightClubConfig = new IntlNightClubConfig();
        intlNightClubConfig.f89id = this.f89id;
        intlNightClubConfig.address = this.address;
        intlNightClubConfig.latitude = this.latitude;
        intlNightClubConfig.longitude = this.longitude;
        intlNightClubConfig.startTimeStamp = this.startTimeStamp;
        intlNightClubConfig.endTimeStamp = this.endTimeStamp;
        intlNightClubConfig.enable = this.enable;
        intlNightClubConfig.radiusMeter = this.radiusMeter;
        intlNightClubConfig.swipePopNum = this.swipePopNum;
        intlNightClubConfig.roundNum = this.roundNum;
        return intlNightClubConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlNightClubConfig)) {
            return false;
        }
        IntlNightClubConfig intlNightClubConfig = (IntlNightClubConfig) obj;
        return ValueObject.util_equals(this.f89id, intlNightClubConfig.f89id) && ValueObject.util_equals(this.address, intlNightClubConfig.address) && this.latitude == intlNightClubConfig.latitude && this.longitude == intlNightClubConfig.longitude && this.startTimeStamp == intlNightClubConfig.startTimeStamp && this.endTimeStamp == intlNightClubConfig.endTimeStamp && this.enable == intlNightClubConfig.enable && this.radiusMeter == intlNightClubConfig.radiusMeter && this.swipePopNum == intlNightClubConfig.swipePopNum && this.roundNum == intlNightClubConfig.roundNum;
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
        String str = this.f89id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.address;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        long j = this.startTimeStamp;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endTimeStamp;
        int i6 = ((((((((i5 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + (this.enable ? 1231 : 1237)) * 41) + this.radiusMeter) * 41) + this.swipePopNum) * 41) + this.roundNum;
        ((ValueObject) this).hashCode = i6;
        return i6;
    }

    public void nullCheck() {
        if (this.f89id == null) {
            this.f89id = "";
        }
        if (this.address == null) {
            this.address = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
