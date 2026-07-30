package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CityC cityC) {
            String str = cityC.cityID;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, cityC.cost) + CodedOutputByteBufferNano.d(3, cityC.expiredTime);
            ((MessageNano) cityC).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CityC m17817parse(nb5 nb5Var) throws IOException {
            CityC cityC = new CityC();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cityC.cityID != null) {
                        break;
                    }
                    cityC.cityID = "";
                    break;
                }
                if (iU == 10) {
                    cityC.cityID = nb5Var.s();
                } else if (iU == 16) {
                    cityC.cost = nb5Var.j();
                } else {
                    if (iU != 25) {
                        if (cityC.cityID != null) {
                            break;
                        }
                        cityC.cityID = "";
                        return cityC;
                    }
                    cityC.expiredTime = nb5Var.h();
                }
            }
            return cityC;
        }

        public void serialize(CityC cityC, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cityC.cityID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, cityC.cost);
            codedOutputByteBufferNano.C(3, cityC.expiredTime);
        }
    };
    public static JsonAdapter<CityC> JSON_ADAPTER = new ObjectJsonAdapter<CityC>() { // from class: com.p1.mobile.putong.data.CityC.2
        public Class getDataClass() {
            return CityC.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CityC mo17830newInstance() {
            return new CityC();
        }

        public boolean parseField(CityC cityC, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cityID":
                    cityC.cityID = jsonParser.getValueAsString();
                    return true;
                case "expiredTime":
                    cityC.expiredTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CityC cityC, JsonGenerator jsonGenerator) throws IOException {
            String str = cityC.cityID;
            if (str != null) {
                jsonGenerator.writeStringField("cityID", str);
            }
            jsonGenerator.writeNumberField("cost", cityC.cost);
            jsonGenerator.writeFieldName("expiredTime");
            Converter.API_TIME.serialize(Double.valueOf(cityC.expiredTime), jsonGenerator, true);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityC) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityC) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CityC new_() {
        CityC cityC = new CityC();
        cityC.nullCheck();
        return cityC;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CityC m17816clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.cityID;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.cost;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiredTime);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.cityID == null) {
            this.cityID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
