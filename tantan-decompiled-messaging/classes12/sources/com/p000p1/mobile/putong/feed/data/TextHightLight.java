package com.p000p1.mobile.putong.feed.data;

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
public class TextHightLight extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "texthightlight";

    @NonNull
    @ProtobufIndex(index = 4)
    public String deepLink;

    @NonNull
    @ProtobufIndex(index = 3)
    public String frontColor;

    @ProtobufIndex(index = 2)
    public int frontSize;

    @NonNull
    @ProtobufIndex(index = 1)
    public String targetText;
    public static ProtobufAdapter<TextHightLight> PROTOBUF_ADAPTER = new MessageNanoAdapter<TextHightLight>() { // from class: com.p1.mobile.putong.feed.data.TextHightLight.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TextHightLight textHightLight) {
            String str = textHightLight.targetText;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, textHightLight.frontSize);
            String str2 = textHightLight.frontColor;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = textHightLight.deepLink;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) textHightLight).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TextHightLight m19783parse(nb5 nb5Var) throws IOException {
            TextHightLight textHightLight = new TextHightLight();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (textHightLight.targetText == null) {
                        textHightLight.targetText = "";
                    }
                    if (textHightLight.frontColor == null) {
                        textHightLight.frontColor = "";
                    }
                    if (textHightLight.deepLink != null) {
                        break;
                    }
                    textHightLight.deepLink = "";
                    break;
                }
                if (iU == 10) {
                    textHightLight.targetText = nb5Var.s();
                } else if (iU == 16) {
                    textHightLight.frontSize = nb5Var.j();
                } else if (iU == 26) {
                    textHightLight.frontColor = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (textHightLight.targetText == null) {
                            textHightLight.targetText = "";
                        }
                        if (textHightLight.frontColor == null) {
                            textHightLight.frontColor = "";
                        }
                        if (textHightLight.deepLink != null) {
                            break;
                        }
                        textHightLight.deepLink = "";
                        return textHightLight;
                    }
                    textHightLight.deepLink = nb5Var.s();
                }
            }
            return textHightLight;
        }

        public void serialize(TextHightLight textHightLight, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = textHightLight.targetText;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, textHightLight.frontSize);
            String str2 = textHightLight.frontColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = textHightLight.deepLink;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<TextHightLight> JSON_ADAPTER = new ObjectJsonAdapter<TextHightLight>() { // from class: com.p1.mobile.putong.feed.data.TextHightLight.2
        public Class getDataClass() {
            return TextHightLight.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TextHightLight mo17830newInstance() {
            return new TextHightLight();
        }

        public boolean parseField(TextHightLight textHightLight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "frontColor":
                    textHightLight.frontColor = jsonParser.getValueAsString();
                    return true;
                case "frontSize":
                    textHightLight.frontSize = jsonParser.getValueAsInt();
                    return true;
                case "targetText":
                    textHightLight.targetText = jsonParser.getValueAsString();
                    return true;
                case "deepLink":
                    textHightLight.deepLink = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TextHightLight textHightLight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "frontColor":
                case "frontSize":
                case "targetText":
                case "deepLink":
                    return true;
                default:
                    return super.parseFieldCheck(textHightLight, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TextHightLight textHightLight, JsonGenerator jsonGenerator) throws IOException {
            String str = textHightLight.targetText;
            if (str != null) {
                jsonGenerator.writeStringField("targetText", str);
            }
            jsonGenerator.writeNumberField("frontSize", textHightLight.frontSize);
            String str2 = textHightLight.frontColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("frontColor", str2);
            }
            String str3 = textHightLight.deepLink;
            if (str3 != null) {
                jsonGenerator.writeStringField("deepLink", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TextHightLight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TextHightLight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TextHightLight new_() {
        TextHightLight textHightLight = new TextHightLight();
        textHightLight.nullCheck();
        return textHightLight;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TextHightLight m19782clone() {
        TextHightLight textHightLight = new TextHightLight();
        textHightLight.targetText = this.targetText;
        textHightLight.frontSize = this.frontSize;
        textHightLight.frontColor = this.frontColor;
        textHightLight.deepLink = this.deepLink;
        return textHightLight;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextHightLight)) {
            return false;
        }
        TextHightLight textHightLight = (TextHightLight) obj;
        return ValueObject.util_equals(this.targetText, textHightLight.targetText) && this.frontSize == textHightLight.frontSize && ValueObject.util_equals(this.frontColor, textHightLight.frontColor) && ValueObject.util_equals(this.deepLink, textHightLight.deepLink);
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
        String str = this.targetText;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.frontSize) * 41;
        String str2 = this.frontColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.deepLink;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.targetText == null) {
            this.targetText = "";
        }
        if (this.frontColor == null) {
            this.frontColor = "";
        }
        if (this.deepLink == null) {
            this.deepLink = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
