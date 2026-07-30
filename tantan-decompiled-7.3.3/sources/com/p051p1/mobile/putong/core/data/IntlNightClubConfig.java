package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class IntlNightClubConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlnightclubconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String address;

    @ProtobufIndex(index = 7)
    public boolean enable;

    @ProtobufIndex(index = 6)
    public long endTimeStamp;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21169id;

    @ProtobufIndex(index = 3)
    public double latitude;

    @ProtobufIndex(index = 4)
    public double longitude;

    @ProtobufIndex(index = 8)
    public int radiusMeter;

    @ProtobufIndex(index = 10)
    public int roundNum;

    @ProtobufIndex(index = 5)
    public long startTimeStamp;

    @ProtobufIndex(index = 9)
    public int swipePopNum;
    public static ProtobufAdapter<IntlNightClubConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlNightClubConfig>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlNightClubConfig intlNightClubConfig) {
            String str = intlNightClubConfig.f21169id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = intlNightClubConfig.address;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(3, intlNightClubConfig.latitude) + CodedOutputByteBufferNano.m17277d(4, intlNightClubConfig.longitude) + CodedOutputByteBufferNano.m17283j(5, intlNightClubConfig.startTimeStamp) + CodedOutputByteBufferNano.m17283j(6, intlNightClubConfig.endTimeStamp) + CodedOutputByteBufferNano.m17275b(7, intlNightClubConfig.enable) + CodedOutputByteBufferNano.m17281h(8, intlNightClubConfig.radiusMeter) + CodedOutputByteBufferNano.m17281h(9, intlNightClubConfig.swipePopNum) + CodedOutputByteBufferNano.m17281h(10, intlNightClubConfig.roundNum);
            intlNightClubConfig.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlNightClubConfig parse(nc5 nc5Var) throws IOException {
            IntlNightClubConfig intlNightClubConfig = new IntlNightClubConfig();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (intlNightClubConfig.f21169id == null) {
                            intlNightClubConfig.f21169id = "";
                        }
                        if (intlNightClubConfig.address == null) {
                            intlNightClubConfig.address = "";
                        }
                        break;
                    case 10:
                        intlNightClubConfig.f21169id = nc5Var.m162495s();
                        continue;
                    case 18:
                        intlNightClubConfig.address = nc5Var.m162495s();
                        continue;
                    case 25:
                        intlNightClubConfig.latitude = nc5Var.m162484h();
                        continue;
                    case 33:
                        intlNightClubConfig.longitude = nc5Var.m162484h();
                        continue;
                    case 40:
                        intlNightClubConfig.startTimeStamp = nc5Var.m162487k();
                        continue;
                    case 48:
                        intlNightClubConfig.endTimeStamp = nc5Var.m162487k();
                        continue;
                    case 56:
                        intlNightClubConfig.enable = nc5Var.m162483g();
                        continue;
                    case 64:
                        intlNightClubConfig.radiusMeter = nc5Var.m162486j();
                        continue;
                    case 72:
                        intlNightClubConfig.swipePopNum = nc5Var.m162486j();
                        continue;
                    case 80:
                        intlNightClubConfig.roundNum = nc5Var.m162486j();
                        continue;
                    default:
                        if (intlNightClubConfig.f21169id == null) {
                            intlNightClubConfig.f21169id = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlNightClubConfig intlNightClubConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlNightClubConfig.f21169id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = intlNightClubConfig.address;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17301C(3, intlNightClubConfig.latitude);
            codedOutputByteBufferNano.m17301C(4, intlNightClubConfig.longitude);
            codedOutputByteBufferNano.m17307I(5, intlNightClubConfig.startTimeStamp);
            codedOutputByteBufferNano.m17307I(6, intlNightClubConfig.endTimeStamp);
            codedOutputByteBufferNano.m17299A(7, intlNightClubConfig.enable);
            codedOutputByteBufferNano.m17305G(8, intlNightClubConfig.radiusMeter);
            codedOutputByteBufferNano.m17305G(9, intlNightClubConfig.swipePopNum);
            codedOutputByteBufferNano.m17305G(10, intlNightClubConfig.roundNum);
        }
    };
    public static JsonAdapter<IntlNightClubConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlNightClubConfig>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlNightClubConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlNightClubConfig newInstance() {
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
                    intlNightClubConfig.f21169id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlNightClubConfig intlNightClubConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = intlNightClubConfig.f21169id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = intlNightClubConfig.address;
            if (str2 != null) {
                jsonGenerator.writeStringField(PlaceTypes.ADDRESS, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlNightClubConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlNightClubConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlNightClubConfig new_() {
        IntlNightClubConfig intlNightClubConfig = new IntlNightClubConfig();
        intlNightClubConfig.nullCheck();
        return intlNightClubConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlNightClubConfig mo225055clone() {
        IntlNightClubConfig intlNightClubConfig = new IntlNightClubConfig();
        intlNightClubConfig.f21169id = this.f21169id;
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
        return ValueObject.util_equals(this.f21169id, intlNightClubConfig.f21169id) && ValueObject.util_equals(this.address, intlNightClubConfig.address) && this.latitude == intlNightClubConfig.latitude && this.longitude == intlNightClubConfig.longitude && this.startTimeStamp == intlNightClubConfig.startTimeStamp && this.endTimeStamp == intlNightClubConfig.endTimeStamp && this.enable == intlNightClubConfig.enable && this.radiusMeter == intlNightClubConfig.radiusMeter && this.swipePopNum == intlNightClubConfig.swipePopNum && this.roundNum == intlNightClubConfig.roundNum;
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
        String str = this.f21169id;
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
        this.hashCode = i6;
        return i6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21169id == null) {
            this.f21169id = "";
        }
        if (this.address == null) {
            this.address = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
