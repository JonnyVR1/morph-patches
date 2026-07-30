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
public class IntlMarketQuestionOptionUIData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketquestionoptionuidata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String bg_url;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String focus_bg_url;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String focus_font_color;

    @NonNull
    @ProtobufIndex(index = 4)
    public String font_color;
    public static ProtobufAdapter<IntlMarketQuestionOptionUIData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketQuestionOptionUIData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData) {
            String str = intlMarketQuestionOptionUIData.bg_url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlMarketQuestionOptionUIData.focus_bg_url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = intlMarketQuestionOptionUIData.focus_font_color;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = intlMarketQuestionOptionUIData.font_color;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) intlMarketQuestionOptionUIData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketQuestionOptionUIData m13603parse(nb5 nb5Var) throws IOException {
            IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = new IntlMarketQuestionOptionUIData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    intlMarketQuestionOptionUIData.bg_url = nb5Var.s();
                } else if (iU == 18) {
                    intlMarketQuestionOptionUIData.focus_bg_url = nb5Var.s();
                } else if (iU == 26) {
                    intlMarketQuestionOptionUIData.focus_font_color = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    intlMarketQuestionOptionUIData.font_color = nb5Var.s();
                }
            }
            return intlMarketQuestionOptionUIData;
        }

        public void serialize(IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMarketQuestionOptionUIData.bg_url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlMarketQuestionOptionUIData.focus_bg_url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = intlMarketQuestionOptionUIData.focus_font_color;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = intlMarketQuestionOptionUIData.font_color;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<IntlMarketQuestionOptionUIData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketQuestionOptionUIData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData.2
        public Class getDataClass() {
            return IntlMarketQuestionOptionUIData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketQuestionOptionUIData m13604newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketQuestionOptionUIData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketQuestionOptionUIData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketQuestionOptionUIData new_() {
        IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = new IntlMarketQuestionOptionUIData();
        intlMarketQuestionOptionUIData.nullCheck();
        return intlMarketQuestionOptionUIData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketQuestionOptionUIData m13602clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
