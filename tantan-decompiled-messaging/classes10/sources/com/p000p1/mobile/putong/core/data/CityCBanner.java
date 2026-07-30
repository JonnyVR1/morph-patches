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
public class CityCBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "citycbanner";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cityName;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String text;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;
    public static ProtobufAdapter<CityCBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<CityCBanner>() { // from class: com.p1.mobile.putong.core.data.CityCBanner.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CityCBanner cityCBanner) {
            String str = cityCBanner.cityName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = cityCBanner.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = cityCBanner.text;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = cityCBanner.url;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) cityCBanner).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CityCBanner m12177parse(nb5 nb5Var) throws IOException {
            CityCBanner cityCBanner = new CityCBanner();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    cityCBanner.cityName = nb5Var.s();
                } else if (iU == 18) {
                    cityCBanner.title = nb5Var.s();
                } else if (iU == 26) {
                    cityCBanner.text = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    cityCBanner.url = nb5Var.s();
                }
            }
            return cityCBanner;
        }

        public void serialize(CityCBanner cityCBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cityCBanner.cityName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = cityCBanner.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = cityCBanner.text;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = cityCBanner.url;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<CityCBanner> JSON_ADAPTER = new ObjectJsonAdapter<CityCBanner>() { // from class: com.p1.mobile.putong.core.data.CityCBanner.2
        public Class getDataClass() {
            return CityCBanner.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CityCBanner m12178newInstance() {
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

        public void serializeFields(CityCBanner cityCBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = cityCBanner.cityName;
            if (str != null) {
                jsonGenerator.writeStringField("cityName", str);
            }
            String str2 = cityCBanner.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityCBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityCBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CityCBanner new_() {
        CityCBanner cityCBanner = new CityCBanner();
        cityCBanner.nullCheck();
        return cityCBanner;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CityCBanner m12176clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
