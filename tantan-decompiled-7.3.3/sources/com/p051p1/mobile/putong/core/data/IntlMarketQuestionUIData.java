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
public class IntlMarketQuestionUIData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketquestionuidata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String bg_color;

    @NonNull
    @ProtobufIndex(index = 2)
    public String bg_url;

    @NonNull
    @ProtobufIndex(index = 3)
    public String font_color;
    public static ProtobufAdapter<IntlMarketQuestionUIData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketQuestionUIData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionUIData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketQuestionUIData intlMarketQuestionUIData) {
            String str = intlMarketQuestionUIData.bg_color;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = intlMarketQuestionUIData.bg_url;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = intlMarketQuestionUIData.font_color;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            intlMarketQuestionUIData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketQuestionUIData parse(nc5 nc5Var) throws IOException {
            IntlMarketQuestionUIData intlMarketQuestionUIData = new IntlMarketQuestionUIData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlMarketQuestionUIData.bg_color == null) {
                        intlMarketQuestionUIData.bg_color = "";
                    }
                    if (intlMarketQuestionUIData.bg_url == null) {
                        intlMarketQuestionUIData.bg_url = "";
                    }
                    if (intlMarketQuestionUIData.font_color != null) {
                        break;
                    }
                    intlMarketQuestionUIData.font_color = "";
                    break;
                }
                if (iM162497u == 10) {
                    intlMarketQuestionUIData.bg_color = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    intlMarketQuestionUIData.bg_url = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (intlMarketQuestionUIData.bg_color == null) {
                            intlMarketQuestionUIData.bg_color = "";
                        }
                        if (intlMarketQuestionUIData.bg_url == null) {
                            intlMarketQuestionUIData.bg_url = "";
                        }
                        if (intlMarketQuestionUIData.font_color != null) {
                            break;
                        }
                        intlMarketQuestionUIData.font_color = "";
                        return intlMarketQuestionUIData;
                    }
                    intlMarketQuestionUIData.font_color = nc5Var.m162495s();
                }
            }
            return intlMarketQuestionUIData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketQuestionUIData intlMarketQuestionUIData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMarketQuestionUIData.bg_color;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = intlMarketQuestionUIData.bg_url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = intlMarketQuestionUIData.font_color;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<IntlMarketQuestionUIData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketQuestionUIData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionUIData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketQuestionUIData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketQuestionUIData newInstance() {
            return new IntlMarketQuestionUIData();
        }

        public boolean parseField(IntlMarketQuestionUIData intlMarketQuestionUIData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bg_url":
                    intlMarketQuestionUIData.bg_url = jsonParser.getValueAsString();
                    return true;
                case "bg_color":
                    intlMarketQuestionUIData.bg_color = jsonParser.getValueAsString();
                    return true;
                case "font_color":
                    intlMarketQuestionUIData.font_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketQuestionUIData intlMarketQuestionUIData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bg_url":
                case "bg_color":
                case "font_color":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketQuestionUIData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketQuestionUIData intlMarketQuestionUIData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlMarketQuestionUIData.bg_color;
            if (str != null) {
                jsonGenerator.writeStringField("bg_color", str);
            }
            String str2 = intlMarketQuestionUIData.bg_url;
            if (str2 != null) {
                jsonGenerator.writeStringField("bg_url", str2);
            }
            String str3 = intlMarketQuestionUIData.font_color;
            if (str3 != null) {
                jsonGenerator.writeStringField("font_color", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketQuestionUIData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketQuestionUIData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketQuestionUIData new_() {
        IntlMarketQuestionUIData intlMarketQuestionUIData = new IntlMarketQuestionUIData();
        intlMarketQuestionUIData.nullCheck();
        return intlMarketQuestionUIData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketQuestionUIData mo225055clone() {
        IntlMarketQuestionUIData intlMarketQuestionUIData = new IntlMarketQuestionUIData();
        intlMarketQuestionUIData.bg_color = this.bg_color;
        intlMarketQuestionUIData.bg_url = this.bg_url;
        intlMarketQuestionUIData.font_color = this.font_color;
        return intlMarketQuestionUIData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketQuestionUIData)) {
            return false;
        }
        IntlMarketQuestionUIData intlMarketQuestionUIData = (IntlMarketQuestionUIData) obj;
        return ValueObject.util_equals(this.bg_color, intlMarketQuestionUIData.bg_color) && ValueObject.util_equals(this.bg_url, intlMarketQuestionUIData.bg_url) && ValueObject.util_equals(this.font_color, intlMarketQuestionUIData.font_color);
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
        String str = this.bg_color;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bg_url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.font_color;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.bg_color == null) {
            this.bg_color = "";
        }
        if (this.bg_url == null) {
            this.bg_url = "";
        }
        if (this.font_color == null) {
            this.font_color = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
