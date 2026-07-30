package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class CityC extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cityc";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cityID;

    @ProtobufIndex(index = 2)
    public int cost;

    @ProtobufIndex(index = 3)
    public double expiredTime;
    public static ProtobufAdapter<CityC> PROTOBUF_ADAPTER = new MessageNanoAdapter<CityC>() { // from class: com.p1.mobile.putong.data.CityC.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CityC cityC) {
            String str = cityC.cityID;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, cityC.cost) + CodedOutputByteBufferNano.m17222d(3, cityC.expiredTime);
            cityC.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CityC parse(nb5 nb5Var) throws IOException {
            CityC cityC = new CityC();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cityC.cityID != null) {
                        break;
                    }
                    cityC.cityID = "";
                    break;
                }
                if (iM158752u == 10) {
                    cityC.cityID = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    cityC.cost = nb5Var.m158741j();
                } else {
                    if (iM158752u != 25) {
                        if (cityC.cityID != null) {
                            break;
                        }
                        cityC.cityID = "";
                        return cityC;
                    }
                    cityC.expiredTime = nb5Var.m158739h();
                }
            }
            return cityC;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CityC cityC, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cityC.cityID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, cityC.cost);
            codedOutputByteBufferNano.m17246C(3, cityC.expiredTime);
        }
    };
    public static JsonAdapter<CityC> JSON_ADAPTER = new ObjectJsonAdapter<CityC>() { // from class: com.p1.mobile.putong.data.CityC.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CityC.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CityC newInstance() {
            return new CityC();
        }

        public boolean parseField(CityC cityC, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cityID":
                    cityC.cityID = jsonParser.getValueAsString();
                    return true;
                case "expiredTime":
                    cityC.expiredTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "cost":
                    cityC.cost = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CityC cityC, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cityID":
                case "expiredTime":
                case "cost":
                    return true;
                default:
                    return super.parseFieldCheck(cityC, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CityC cityC, JsonGenerator jsonGenerator) throws IOException {
            String str = cityC.cityID;
            if (str != null) {
                jsonGenerator.writeStringField("cityID", str);
            }
            jsonGenerator.writeNumberField("cost", cityC.cost);
            jsonGenerator.writeFieldName("expiredTime");
            Converter.API_TIME.serialize(Double.valueOf(cityC.expiredTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityC) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityC) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CityC new_() {
        CityC cityC = new CityC();
        cityC.nullCheck();
        return cityC;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CityC mo223809clone() {
        CityC cityC = new CityC();
        cityC.cityID = this.cityID;
        cityC.cost = this.cost;
        cityC.expiredTime = this.expiredTime;
        return cityC;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CityC)) {
            return false;
        }
        CityC cityC = (CityC) obj;
        return ValueObject.util_equals(this.cityID, cityC.cityID) && this.cost == cityC.cost && this.expiredTime == cityC.expiredTime;
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
        String str = this.cityID;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.cost;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiredTime);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cityID == null) {
            this.cityID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
