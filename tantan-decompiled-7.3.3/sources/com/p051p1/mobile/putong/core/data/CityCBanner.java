package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class CityCBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "citycbanner";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cityName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;
    public static ProtobufAdapter<CityCBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<CityCBanner>() { // from class: com.p1.mobile.putong.core.data.CityCBanner.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CityCBanner cityCBanner) {
            String str = cityCBanner.cityName;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = cityCBanner.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = cityCBanner.text;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = cityCBanner.url;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            cityCBanner.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CityCBanner parse(nc5 nc5Var) throws IOException {
            CityCBanner cityCBanner = new CityCBanner();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (cityCBanner.cityName == null) {
                        cityCBanner.cityName = "";
                    }
                    if (cityCBanner.title == null) {
                        cityCBanner.title = "";
                    }
                    if (cityCBanner.text == null) {
                        cityCBanner.text = "";
                    }
                    if (cityCBanner.url != null) {
                        break;
                    }
                    cityCBanner.url = "";
                    break;
                }
                if (iM162497u == 10) {
                    cityCBanner.cityName = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    cityCBanner.title = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    cityCBanner.text = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (cityCBanner.cityName == null) {
                            cityCBanner.cityName = "";
                        }
                        if (cityCBanner.title == null) {
                            cityCBanner.title = "";
                        }
                        if (cityCBanner.text == null) {
                            cityCBanner.text = "";
                        }
                        if (cityCBanner.url != null) {
                            break;
                        }
                        cityCBanner.url = "";
                        return cityCBanner;
                    }
                    cityCBanner.url = nc5Var.m162495s();
                }
            }
            return cityCBanner;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CityCBanner cityCBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cityCBanner.cityName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = cityCBanner.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = cityCBanner.text;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = cityCBanner.url;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<CityCBanner> JSON_ADAPTER = new ObjectJsonAdapter<CityCBanner>() { // from class: com.p1.mobile.putong.core.data.CityCBanner.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CityCBanner.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CityCBanner newInstance() {
            return new CityCBanner();
        }

        public boolean parseField(CityCBanner cityCBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cityName":
                    cityCBanner.cityName = jsonParser.getValueAsString();
                    return true;
                case "url":
                    cityCBanner.url = jsonParser.getValueAsString();
                    return true;
                case "text":
                    cityCBanner.text = jsonParser.getValueAsString();
                    return true;
                case "title":
                    cityCBanner.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CityCBanner cityCBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cityName":
                case "url":
                case "text":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(cityCBanner, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CityCBanner cityCBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = cityCBanner.cityName;
            if (str != null) {
                jsonGenerator.writeStringField("cityName", str);
            }
            String str2 = cityCBanner.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = cityCBanner.text;
            if (str3 != null) {
                jsonGenerator.writeStringField("text", str3);
            }
            String str4 = cityCBanner.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityCBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityCBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CityCBanner new_() {
        CityCBanner cityCBanner = new CityCBanner();
        cityCBanner.nullCheck();
        return cityCBanner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CityCBanner mo225055clone() {
        CityCBanner cityCBanner = new CityCBanner();
        cityCBanner.cityName = this.cityName;
        cityCBanner.title = this.title;
        cityCBanner.text = this.text;
        cityCBanner.url = this.url;
        return cityCBanner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CityCBanner)) {
            return false;
        }
        CityCBanner cityCBanner = (CityCBanner) obj;
        return ValueObject.util_equals(this.cityName, cityCBanner.cityName) && ValueObject.util_equals(this.title, cityCBanner.title) && ValueObject.util_equals(this.text, cityCBanner.text) && ValueObject.util_equals(this.url, cityCBanner.url);
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
        String str = this.cityName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cityName == null) {
            this.cityName = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
