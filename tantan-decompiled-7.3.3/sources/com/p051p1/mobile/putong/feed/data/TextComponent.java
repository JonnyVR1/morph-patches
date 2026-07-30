package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.TextHightLight;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class TextComponent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "textcomponent";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 3)
    public String frontColor;

    @ProtobufIndex(index = 2)
    public int frontSize;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<TextHightLight> highLight;

    @ProtobufIndex(index = 4)
    public int maxLines;
    public static ProtobufAdapter<TextComponent> PROTOBUF_ADAPTER = new MessageNanoAdapter<TextComponent>() { // from class: com.p1.mobile.putong.feed.data.TextComponent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TextComponent textComponent) {
            String str = textComponent.content;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, textComponent.frontSize);
            String str2 = textComponent.frontColor;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(4, textComponent.maxLines);
            List<TextHightLight> list = textComponent.highLight;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(5, list, TextHightLight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            textComponent.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TextComponent parse(nc5 nc5Var) throws IOException {
            TextComponent textComponent = new TextComponent();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (textComponent.content == null) {
                        textComponent.content = "";
                    }
                    if (textComponent.frontColor == null) {
                        textComponent.frontColor = "";
                    }
                    if (textComponent.highLight != null) {
                        break;
                    }
                    textComponent.highLight = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    textComponent.content = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    textComponent.frontSize = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    textComponent.frontColor = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    textComponent.maxLines = nc5Var.m162486j();
                } else {
                    if (iM162497u != 42) {
                        if (textComponent.content == null) {
                            textComponent.content = "";
                        }
                        if (textComponent.frontColor == null) {
                            textComponent.frontColor = "";
                        }
                        if (textComponent.highLight != null) {
                            break;
                        }
                        textComponent.highLight = new ArrayList();
                        return textComponent;
                    }
                    textComponent.highLight = (List) nc5Var.m162488l(TextHightLight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return textComponent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TextComponent textComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = textComponent.content;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, textComponent.frontSize);
            String str2 = textComponent.frontColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17305G(4, textComponent.maxLines);
            List<TextHightLight> list = textComponent.highLight;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(5, list, TextHightLight.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TextComponent> JSON_ADAPTER = new ObjectJsonAdapter<TextComponent>() { // from class: com.p1.mobile.putong.feed.data.TextComponent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TextComponent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TextComponent newInstance() {
            return new TextComponent();
        }

        public boolean parseField(TextComponent textComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "highLight":
                    textComponent.highLight = JsonAdapter.parseArray(jsonParser, TextHightLight.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "frontColor":
                    textComponent.frontColor = jsonParser.getValueAsString();
                    return true;
                case "frontSize":
                    textComponent.frontSize = jsonParser.getValueAsInt();
                    return true;
                case "maxLines":
                    textComponent.maxLines = jsonParser.getValueAsInt();
                    return true;
                case "content":
                    textComponent.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TextComponent textComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "highLight":
                case "frontColor":
                case "frontSize":
                case "maxLines":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(textComponent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TextComponent textComponent, JsonGenerator jsonGenerator) throws IOException {
            String str = textComponent.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            jsonGenerator.writeNumberField("frontSize", textComponent.frontSize);
            String str2 = textComponent.frontColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("frontColor", str2);
            }
            jsonGenerator.writeNumberField("maxLines", textComponent.maxLines);
            if (textComponent.highLight != null) {
                jsonGenerator.writeFieldName("highLight");
                JsonAdapter.serializeArray(textComponent.highLight, jsonGenerator, TextHightLight.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TextComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TextComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TextComponent new_() {
        TextComponent textComponent = new TextComponent();
        textComponent.nullCheck();
        return textComponent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TextComponent mo225055clone() {
        TextComponent textComponent = new TextComponent();
        textComponent.content = this.content;
        textComponent.frontSize = this.frontSize;
        textComponent.frontColor = this.frontColor;
        textComponent.maxLines = this.maxLines;
        List<TextHightLight> list = this.highLight;
        if (list != null) {
            textComponent.highLight = ValueObject.util_map(list, new qcj() { // from class: l.mri0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TextHightLight) obj).mo225055clone();
                }
            });
        }
        return textComponent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextComponent)) {
            return false;
        }
        TextComponent textComponent = (TextComponent) obj;
        return ValueObject.util_equals(this.content, textComponent.content) && this.frontSize == textComponent.frontSize && ValueObject.util_equals(this.frontColor, textComponent.frontColor) && this.maxLines == textComponent.maxLines && ValueObject.util_equals(this.highLight, textComponent.highLight);
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
        String str = this.content;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.frontSize) * 41;
        String str2 = this.frontColor;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.maxLines) * 41;
        List<TextHightLight> list = this.highLight;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.frontColor == null) {
            this.frontColor = "";
        }
        if (this.highLight == null) {
            this.highLight = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
