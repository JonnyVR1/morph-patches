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
public class OMSResourceContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsresourcecontent";

    @NonNull
    @ProtobufIndex(index = 5)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String color;

    @NonNull
    @ProtobufIndex(index = 4)
    public OMSFontStyle font;

    @ProtobufIndex(index = 2)
    public int size;

    @ProtobufIndex(index = 6)
    public boolean strikethrough;

    @ProtobufIndex(index = 7)
    public boolean underline;

    @NonNull
    @ProtobufIndex(index = 8)
    public String url;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;
    public static ProtobufAdapter<OMSResourceContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSResourceContent>() { // from class: com.p1.mobile.putong.data.OMSResourceContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSResourceContent oMSResourceContent) {
            String str = oMSResourceContent.color;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, oMSResourceContent.size);
            String str2 = oMSResourceContent.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            OMSFontStyle oMSFontStyle = oMSResourceContent.font;
            if (oMSFontStyle != null) {
                iO += CodedOutputByteBufferNano.h(4, oMSFontStyle.ordinal());
            }
            String str3 = oMSResourceContent.bgColor;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(6, oMSResourceContent.strikethrough) + CodedOutputByteBufferNano.b(7, oMSResourceContent.underline);
            String str4 = oMSResourceContent.url;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(8, str4);
            }
            OMSFontStyle oMSFontStyle2 = oMSResourceContent.font;
            if (oMSFontStyle2 != null) {
                iB += CodedOutputByteBufferNano.l(9, oMSFontStyle2, OMSFontStyle.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSResourceContent).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSResourceContent m18654parse(nb5 nb5Var) throws IOException {
            OMSResourceContent oMSResourceContent = new OMSResourceContent();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSResourceContent.font == null && numValueOf != null) {
                        oMSResourceContent.font = (OMSFontStyle) OMSFontStyle.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSResourceContent.color == null) {
                        oMSResourceContent.color = "";
                    }
                    if (oMSResourceContent.value == null) {
                        oMSResourceContent.value = "";
                    }
                    if (oMSResourceContent.font == null) {
                        oMSResourceContent.font = (OMSFontStyle) OMSFontStyle.JSON_ADAPTER.defaultEnum();
                    }
                    if (oMSResourceContent.bgColor == null) {
                        oMSResourceContent.bgColor = "";
                    }
                    if (oMSResourceContent.url != null) {
                        break;
                    }
                    oMSResourceContent.url = "";
                    break;
                }
                if (iU == 10) {
                    oMSResourceContent.color = nb5Var.s();
                } else if (iU == 16) {
                    oMSResourceContent.size = nb5Var.j();
                } else if (iU == 26) {
                    oMSResourceContent.value = nb5Var.s();
                } else if (iU == 32) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 42) {
                    oMSResourceContent.bgColor = nb5Var.s();
                } else if (iU == 48) {
                    oMSResourceContent.strikethrough = nb5Var.g();
                } else if (iU == 56) {
                    oMSResourceContent.underline = nb5Var.g();
                } else if (iU == 66) {
                    oMSResourceContent.url = nb5Var.s();
                } else {
                    if (iU != 74) {
                        if (oMSResourceContent.font == null && numValueOf != null) {
                            oMSResourceContent.font = (OMSFontStyle) OMSFontStyle.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSResourceContent.color == null) {
                            oMSResourceContent.color = "";
                        }
                        if (oMSResourceContent.value == null) {
                            oMSResourceContent.value = "";
                        }
                        if (oMSResourceContent.font == null) {
                            oMSResourceContent.font = (OMSFontStyle) OMSFontStyle.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSResourceContent.bgColor == null) {
                            oMSResourceContent.bgColor = "";
                        }
                        if (oMSResourceContent.url != null) {
                            break;
                        }
                        oMSResourceContent.url = "";
                        return oMSResourceContent;
                    }
                    oMSResourceContent.font = (OMSFontStyle) nb5Var.l(OMSFontStyle.PROTOBUF_ADAPTER);
                }
            }
            return oMSResourceContent;
        }

        public void serialize(OMSResourceContent oMSResourceContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSResourceContent.color;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, oMSResourceContent.size);
            String str2 = oMSResourceContent.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            OMSFontStyle oMSFontStyle = oMSResourceContent.font;
            if (oMSFontStyle != null) {
                codedOutputByteBufferNano.G(4, oMSFontStyle.ordinal());
            }
            String str3 = oMSResourceContent.bgColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            codedOutputByteBufferNano.A(6, oMSResourceContent.strikethrough);
            codedOutputByteBufferNano.A(7, oMSResourceContent.underline);
            String str4 = oMSResourceContent.url;
            if (str4 != null) {
                codedOutputByteBufferNano.R(8, str4);
            }
            OMSFontStyle oMSFontStyle2 = oMSResourceContent.font;
            if (oMSFontStyle2 != null) {
                codedOutputByteBufferNano.K(9, oMSFontStyle2, OMSFontStyle.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSResourceContent> JSON_ADAPTER = new ObjectJsonAdapter<OMSResourceContent>() { // from class: com.p1.mobile.putong.data.OMSResourceContent.2
        public Class getDataClass() {
            return OMSResourceContent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSResourceContent mo17830newInstance() {
            return new OMSResourceContent();
        }

        public boolean parseField(OMSResourceContent oMSResourceContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "underline":
                    oMSResourceContent.underline = jsonParser.getValueAsBoolean();
                    return true;
                case "strikethrough":
                    oMSResourceContent.strikethrough = jsonParser.getValueAsBoolean();
                    return true;
                case "bgColor":
                    oMSResourceContent.bgColor = jsonParser.getValueAsString();
                    return true;
                case "url":
                    oMSResourceContent.url = jsonParser.getValueAsString();
                    return true;
                case "font":
                    oMSResourceContent.font = (OMSFontStyle) OMSFontStyle.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "size":
                    oMSResourceContent.size = jsonParser.getValueAsInt();
                    return true;
                case "color":
                    oMSResourceContent.color = jsonParser.getValueAsString();
                    return true;
                case "value":
                    oMSResourceContent.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSResourceContent oMSResourceContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "underline":
                case "strikethrough":
                case "bgColor":
                case "url":
                case "font":
                case "size":
                case "color":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(oMSResourceContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSResourceContent oMSResourceContent, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSResourceContent.color;
            if (str != null) {
                jsonGenerator.writeStringField("color", str);
            }
            jsonGenerator.writeNumberField("size", oMSResourceContent.size);
            String str2 = oMSResourceContent.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            if (oMSResourceContent.font != null) {
                jsonGenerator.writeFieldName("font");
                OMSFontStyle.JSON_ADAPTER.serialize(oMSResourceContent.font, jsonGenerator, true);
            }
            String str3 = oMSResourceContent.bgColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgColor", str3);
            }
            jsonGenerator.writeBooleanField("strikethrough", oMSResourceContent.strikethrough);
            jsonGenerator.writeBooleanField("underline", oMSResourceContent.underline);
            String str4 = oMSResourceContent.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSResourceContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSResourceContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSResourceContent new_() {
        OMSResourceContent oMSResourceContent = new OMSResourceContent();
        oMSResourceContent.nullCheck();
        return oMSResourceContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSResourceContent m18653clone() {
        OMSResourceContent oMSResourceContent = new OMSResourceContent();
        oMSResourceContent.color = this.color;
        oMSResourceContent.size = this.size;
        oMSResourceContent.value = this.value;
        oMSResourceContent.font = this.font;
        oMSResourceContent.bgColor = this.bgColor;
        oMSResourceContent.strikethrough = this.strikethrough;
        oMSResourceContent.underline = this.underline;
        oMSResourceContent.url = this.url;
        return oMSResourceContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSResourceContent)) {
            return false;
        }
        OMSResourceContent oMSResourceContent = (OMSResourceContent) obj;
        return ValueObject.util_equals(this.color, oMSResourceContent.color) && this.size == oMSResourceContent.size && ValueObject.util_equals(this.value, oMSResourceContent.value) && ValueObject.util_equals(this.font, oMSResourceContent.font) && ValueObject.util_equals(this.bgColor, oMSResourceContent.bgColor) && this.strikethrough == oMSResourceContent.strikethrough && this.underline == oMSResourceContent.underline && ValueObject.util_equals(this.url, oMSResourceContent.url);
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
        String str = this.color;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.size) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        OMSFontStyle oMSFontStyle = this.font;
        int iHashCode3 = (iHashCode2 + (oMSFontStyle != null ? oMSFontStyle.hashCode() : 0)) * 41;
        String str3 = this.bgColor;
        int iHashCode4 = (((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.strikethrough ? 1231 : 1237)) * 41) + (this.underline ? 1231 : 1237)) * 41;
        String str4 = this.url;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.color == null) {
            this.color = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.font == null) {
            this.font = (OMSFontStyle) OMSFontStyle.JSON_ADAPTER.defaultEnum();
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
