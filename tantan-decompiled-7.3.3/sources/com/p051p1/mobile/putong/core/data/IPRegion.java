package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class IPRegion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ipregion";

    @Nullable
    @ProtobufIndex(index = 3)
    public String city;

    @Nullable
    @ProtobufIndex(index = 4)
    public String country;

    @Nullable
    @ProtobufIndex(index = 2)
    public String district;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21160id;

    @Nullable
    @ProtobufIndex(index = 5)
    public String province;
    public static ProtobufAdapter<IPRegion> PROTOBUF_ADAPTER = new MessageNanoAdapter<IPRegion>() { // from class: com.p1.mobile.putong.core.data.IPRegion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IPRegion iPRegion) {
            String str = iPRegion.f21160id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = iPRegion.district;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = iPRegion.city;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = iPRegion.country;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = iPRegion.province;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            iPRegion.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IPRegion parse(nc5 nc5Var) throws IOException {
            IPRegion iPRegion = new IPRegion();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (iPRegion.f21160id != null) {
                        break;
                    }
                    iPRegion.f21160id = "";
                    break;
                }
                if (iM162497u == 10) {
                    iPRegion.f21160id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    iPRegion.district = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    iPRegion.city = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    iPRegion.country = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (iPRegion.f21160id != null) {
                            break;
                        }
                        iPRegion.f21160id = "";
                        return iPRegion;
                    }
                    iPRegion.province = nc5Var.m162495s();
                }
            }
            return iPRegion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IPRegion iPRegion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iPRegion.f21160id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = iPRegion.district;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = iPRegion.city;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = iPRegion.country;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = iPRegion.province;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
        }
    };
    public static JsonAdapter<IPRegion> JSON_ADAPTER = new ObjectJsonAdapter<IPRegion>() { // from class: com.p1.mobile.putong.core.data.IPRegion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IPRegion.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IPRegion newInstance() {
            return new IPRegion();
        }

        public boolean parseField(IPRegion iPRegion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "province":
                    iPRegion.province = jsonParser.getValueAsString();
                    return true;
                case "id":
                    iPRegion.f21160id = jsonParser.getValueAsString();
                    return false;
                case "city":
                    iPRegion.city = jsonParser.getValueAsString();
                    return true;
                case "district":
                    iPRegion.district = jsonParser.getValueAsString();
                    return true;
                case "country":
                    iPRegion.country = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IPRegion iPRegion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "province":
                    return true;
                case "id":
                    return false;
                case "city":
                case "district":
                case "country":
                    return true;
                default:
                    return super.parseFieldCheck(iPRegion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IPRegion iPRegion, JsonGenerator jsonGenerator) throws IOException {
            String str = iPRegion.f21160id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = iPRegion.district;
            if (str2 != null) {
                jsonGenerator.writeStringField(RankLevel.district, str2);
            }
            String str3 = iPRegion.city;
            if (str3 != null) {
                jsonGenerator.writeStringField(RankLevel.city, str3);
            }
            String str4 = iPRegion.country;
            if (str4 != null) {
                jsonGenerator.writeStringField("country", str4);
            }
            String str5 = iPRegion.province;
            if (str5 != null) {
                jsonGenerator.writeStringField(RankLevel.province, str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IPRegion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IPRegion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IPRegion new_() {
        IPRegion iPRegion = new IPRegion();
        iPRegion.nullCheck();
        return iPRegion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IPRegion mo225055clone() {
        IPRegion iPRegion = new IPRegion();
        iPRegion.f21160id = this.f21160id;
        iPRegion.district = this.district;
        iPRegion.city = this.city;
        iPRegion.country = this.country;
        iPRegion.province = this.province;
        return iPRegion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IPRegion)) {
            return false;
        }
        IPRegion iPRegion = (IPRegion) obj;
        return ValueObject.util_equals(this.f21160id, iPRegion.f21160id) && ValueObject.util_equals(this.district, iPRegion.district) && ValueObject.util_equals(this.city, iPRegion.city) && ValueObject.util_equals(this.country, iPRegion.country) && ValueObject.util_equals(this.province, iPRegion.province);
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
        String str = this.f21160id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.district;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.country;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.province;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21160id == null) {
            this.f21160id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
