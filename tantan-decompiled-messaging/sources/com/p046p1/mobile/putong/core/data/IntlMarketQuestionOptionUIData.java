package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class IntlMarketQuestionOptionUIData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketquestionoptionuidata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String bg_url;

    @NonNull
    @ProtobufIndex(index = 2)
    public String focus_bg_url;

    @NonNull
    @ProtobufIndex(index = 3)
    public String focus_font_color;

    @NonNull
    @ProtobufIndex(index = 4)
    public String font_color;
    public static ProtobufAdapter<IntlMarketQuestionOptionUIData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketQuestionOptionUIData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData) {
            String str = intlMarketQuestionOptionUIData.bg_url;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = intlMarketQuestionOptionUIData.focus_bg_url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = intlMarketQuestionOptionUIData.focus_font_color;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = intlMarketQuestionOptionUIData.font_color;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            intlMarketQuestionOptionUIData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketQuestionOptionUIData parse(nb5 nb5Var) throws IOException {
            IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = new IntlMarketQuestionOptionUIData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlMarketQuestionOptionUIData.bg_url == null) {
                        intlMarketQuestionOptionUIData.bg_url = "";
                    }
                    if (intlMarketQuestionOptionUIData.focus_bg_url == null) {
                        intlMarketQuestionOptionUIData.focus_bg_url = "";
                    }
                    if (intlMarketQuestionOptionUIData.focus_font_color == null) {
                        intlMarketQuestionOptionUIData.focus_font_color = "";
                    }
                    if (intlMarketQuestionOptionUIData.font_color != null) {
                        break;
                    }
                    intlMarketQuestionOptionUIData.font_color = "";
                    break;
                }
                if (iM158752u == 10) {
                    intlMarketQuestionOptionUIData.bg_url = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    intlMarketQuestionOptionUIData.focus_bg_url = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    intlMarketQuestionOptionUIData.focus_font_color = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (intlMarketQuestionOptionUIData.bg_url == null) {
                            intlMarketQuestionOptionUIData.bg_url = "";
                        }
                        if (intlMarketQuestionOptionUIData.focus_bg_url == null) {
                            intlMarketQuestionOptionUIData.focus_bg_url = "";
                        }
                        if (intlMarketQuestionOptionUIData.focus_font_color == null) {
                            intlMarketQuestionOptionUIData.focus_font_color = "";
                        }
                        if (intlMarketQuestionOptionUIData.font_color != null) {
                            break;
                        }
                        intlMarketQuestionOptionUIData.font_color = "";
                        return intlMarketQuestionOptionUIData;
                    }
                    intlMarketQuestionOptionUIData.font_color = nb5Var.m158750s();
                }
            }
            return intlMarketQuestionOptionUIData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMarketQuestionOptionUIData.bg_url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = intlMarketQuestionOptionUIData.focus_bg_url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = intlMarketQuestionOptionUIData.focus_font_color;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = intlMarketQuestionOptionUIData.font_color;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<IntlMarketQuestionOptionUIData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketQuestionOptionUIData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketQuestionOptionUIData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketQuestionOptionUIData newInstance() {
            return new IntlMarketQuestionOptionUIData();
        }

        public boolean parseField(IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bg_url":
                    intlMarketQuestionOptionUIData.bg_url = jsonParser.getValueAsString();
                    return true;
                case "focus_font_color":
                    intlMarketQuestionOptionUIData.focus_font_color = jsonParser.getValueAsString();
                    return true;
                case "focus_bg_url":
                    intlMarketQuestionOptionUIData.focus_bg_url = jsonParser.getValueAsString();
                    return true;
                case "font_color":
                    intlMarketQuestionOptionUIData.font_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bg_url":
                case "focus_font_color":
                case "focus_bg_url":
                case "font_color":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketQuestionOptionUIData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlMarketQuestionOptionUIData.bg_url;
            if (str != null) {
                jsonGenerator.writeStringField("bg_url", str);
            }
            String str2 = intlMarketQuestionOptionUIData.focus_bg_url;
            if (str2 != null) {
                jsonGenerator.writeStringField("focus_bg_url", str2);
            }
            String str3 = intlMarketQuestionOptionUIData.focus_font_color;
            if (str3 != null) {
                jsonGenerator.writeStringField("focus_font_color", str3);
            }
            String str4 = intlMarketQuestionOptionUIData.font_color;
            if (str4 != null) {
                jsonGenerator.writeStringField("font_color", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketQuestionOptionUIData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketQuestionOptionUIData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketQuestionOptionUIData new_() {
        IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = new IntlMarketQuestionOptionUIData();
        intlMarketQuestionOptionUIData.nullCheck();
        return intlMarketQuestionOptionUIData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketQuestionOptionUIData mo223809clone() {
        IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = new IntlMarketQuestionOptionUIData();
        intlMarketQuestionOptionUIData.bg_url = this.bg_url;
        intlMarketQuestionOptionUIData.focus_bg_url = this.focus_bg_url;
        intlMarketQuestionOptionUIData.focus_font_color = this.focus_font_color;
        intlMarketQuestionOptionUIData.font_color = this.font_color;
        return intlMarketQuestionOptionUIData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketQuestionOptionUIData)) {
            return false;
        }
        IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = (IntlMarketQuestionOptionUIData) obj;
        return ValueObject.util_equals(this.bg_url, intlMarketQuestionOptionUIData.bg_url) && ValueObject.util_equals(this.focus_bg_url, intlMarketQuestionOptionUIData.focus_bg_url) && ValueObject.util_equals(this.focus_font_color, intlMarketQuestionOptionUIData.focus_font_color) && ValueObject.util_equals(this.font_color, intlMarketQuestionOptionUIData.font_color);
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
        String str = this.bg_url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.focus_bg_url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.focus_font_color;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.font_color;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.bg_url == null) {
            this.bg_url = "";
        }
        if (this.focus_bg_url == null) {
            this.focus_bg_url = "";
        }
        if (this.focus_font_color == null) {
            this.focus_font_color = "";
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
