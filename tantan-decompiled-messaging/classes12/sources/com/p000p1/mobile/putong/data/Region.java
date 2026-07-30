package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Region region) {
            String str = region.district;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = region.city;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = region.country;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = region.province;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) region).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Region m18890parse(nb5 nb5Var) throws IOException {
            Region region = new Region();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    region.district = nb5Var.s();
                } else if (iU == 18) {
                    region.city = nb5Var.s();
                } else if (iU == 26) {
                    region.country = nb5Var.s();
                } else {
                    if (iU != 34) {
                        return region;
                    }
                    region.province = nb5Var.s();
                }
            }
        }

        public void serialize(Region region, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = region.district;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = region.city;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = region.country;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = region.province;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<Region> JSON_ADAPTER = new ObjectJsonAdapter<Region>() { // from class: com.p1.mobile.putong.data.Region.2
        public Class getDataClass() {
            return Region.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Region mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Region region, JsonGenerator jsonGenerator) throws IOException {
            String str = region.district;
            if (str != null) {
                jsonGenerator.writeStringField("district", str);
            }
            String str2 = region.city;
            if (str2 != null) {
                jsonGenerator.writeStringField("city", str2);
            }
            String str3 = region.country;
            if (str3 != null) {
                jsonGenerator.writeStringField("country", str3);
            }
            String str4 = region.province;
            if (str4 != null) {
                jsonGenerator.writeStringField("province", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Region) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Region) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Region new_() {
        Region region = new Region();
        region.nullCheck();
        return region;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Region m18889clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
