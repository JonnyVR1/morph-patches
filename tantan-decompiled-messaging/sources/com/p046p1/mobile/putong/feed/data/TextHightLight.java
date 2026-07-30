package com.p046p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TextHightLight textHightLight) {
            String str = textHightLight.targetText;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, textHightLight.frontSize);
            String str2 = textHightLight.frontColor;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = textHightLight.deepLink;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            textHightLight.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TextHightLight parse(nb5 nb5Var) throws IOException {
            TextHightLight textHightLight = new TextHightLight();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    textHightLight.targetText = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    textHightLight.frontSize = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    textHightLight.frontColor = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
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
                    textHightLight.deepLink = nb5Var.m158750s();
                }
            }
            return textHightLight;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TextHightLight textHightLight, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = textHightLight.targetText;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, textHightLight.frontSize);
            String str2 = textHightLight.frontColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = textHightLight.deepLink;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<TextHightLight> JSON_ADAPTER = new ObjectJsonAdapter<TextHightLight>() { // from class: com.p1.mobile.putong.feed.data.TextHightLight.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TextHightLight.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TextHightLight newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TextHightLight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TextHightLight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TextHightLight new_() {
        TextHightLight textHightLight = new TextHightLight();
        textHightLight.nullCheck();
        return textHightLight;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TextHightLight mo223809clone() {
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
        String str = this.targetText;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.frontSize) * 41;
        String str2 = this.frontColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.deepLink;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
