package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.RankLevel;
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

/* JADX INFO: loaded from: classes12.dex */
public class Region extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "region";

    @Nullable
    @ProtobufIndex(index = 2)
    public String city;

    @Nullable
    @ProtobufIndex(index = 3)
    public String country;

    @Nullable
    @ProtobufIndex(index = 1)
    public String district;

    @Nullable
    @ProtobufIndex(index = 4)
    public String province;
    public static ProtobufAdapter<Region> PROTOBUF_ADAPTER = new MessageNanoAdapter<Region>() { // from class: com.p1.mobile.putong.data.Region.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Region region) {
            String str = region.district;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = region.city;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = region.country;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = region.province;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            region.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Region parse(nc5 nc5Var) throws IOException {
            Region region = new Region();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    region.district = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    region.city = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    region.country = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        return region;
                    }
                    region.province = nc5Var.m162495s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Region region, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = region.district;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = region.city;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = region.country;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = region.province;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<Region> JSON_ADAPTER = new ObjectJsonAdapter<Region>() { // from class: com.p1.mobile.putong.data.Region.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Region.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Region newInstance() {
            return new Region();
        }

        public boolean parseField(Region region, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "province":
                    region.province = jsonParser.getValueAsString();
                    return true;
                case "city":
                    region.city = jsonParser.getValueAsString();
                    return true;
                case "district":
                    region.district = jsonParser.getValueAsString();
                    return true;
                case "country":
                    region.country = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Region region, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "province":
                case "city":
                case "district":
                case "country":
                    return true;
                default:
                    return super.parseFieldCheck(region, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Region region, JsonGenerator jsonGenerator) throws IOException {
            String str = region.district;
            if (str != null) {
                jsonGenerator.writeStringField(RankLevel.district, str);
            }
            String str2 = region.city;
            if (str2 != null) {
                jsonGenerator.writeStringField(RankLevel.city, str2);
            }
            String str3 = region.country;
            if (str3 != null) {
                jsonGenerator.writeStringField("country", str3);
            }
            String str4 = region.province;
            if (str4 != null) {
                jsonGenerator.writeStringField(RankLevel.province, str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Region) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Region) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Region new_() {
        Region region = new Region();
        region.nullCheck();
        return region;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Region mo225055clone() {
        Region region = new Region();
        region.district = this.district;
        region.city = this.city;
        region.country = this.country;
        region.province = this.province;
        return region;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Region)) {
            return false;
        }
        Region region = (Region) obj;
        return ValueObject.util_equals(this.district, region.district) && ValueObject.util_equals(this.city, region.city) && ValueObject.util_equals(this.country, region.country) && ValueObject.util_equals(this.province, region.province);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "region";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.district;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.city;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.country;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.province;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
