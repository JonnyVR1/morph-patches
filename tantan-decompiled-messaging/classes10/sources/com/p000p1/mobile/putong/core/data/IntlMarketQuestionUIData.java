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
public class IntlMarketQuestionUIData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketquestionuidata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String bg_color;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String bg_url;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String font_color;
    public static ProtobufAdapter<IntlMarketQuestionUIData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketQuestionUIData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionUIData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketQuestionUIData intlMarketQuestionUIData) {
            String str = intlMarketQuestionUIData.bg_color;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlMarketQuestionUIData.bg_url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = intlMarketQuestionUIData.font_color;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) intlMarketQuestionUIData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketQuestionUIData m13607parse(nb5 nb5Var) throws IOException {
            IntlMarketQuestionUIData intlMarketQuestionUIData = new IntlMarketQuestionUIData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    intlMarketQuestionUIData.bg_color = nb5Var.s();
                } else if (iU == 18) {
                    intlMarketQuestionUIData.bg_url = nb5Var.s();
                } else {
                    if (iU != 26) {
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
                    intlMarketQuestionUIData.font_color = nb5Var.s();
                }
            }
            return intlMarketQuestionUIData;
        }

        public void serialize(IntlMarketQuestionUIData intlMarketQuestionUIData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMarketQuestionUIData.bg_color;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlMarketQuestionUIData.bg_url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = intlMarketQuestionUIData.font_color;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<IntlMarketQuestionUIData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketQuestionUIData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionUIData.2
        public Class getDataClass() {
            return IntlMarketQuestionUIData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketQuestionUIData m13608newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketQuestionUIData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketQuestionUIData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketQuestionUIData new_() {
        IntlMarketQuestionUIData intlMarketQuestionUIData = new IntlMarketQuestionUIData();
        intlMarketQuestionUIData.nullCheck();
        return intlMarketQuestionUIData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketQuestionUIData m13606clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
