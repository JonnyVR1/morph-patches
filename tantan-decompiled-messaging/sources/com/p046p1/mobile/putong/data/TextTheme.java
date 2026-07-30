package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.TextTheme;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class TextTheme extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "texttheme";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> backgroundColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> iconColor;
    public static ProtobufAdapter<TextTheme> PROTOBUF_ADAPTER = new MessageNanoAdapter<TextTheme>() { // from class: com.p1.mobile.putong.data.TextTheme.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TextTheme textTheme) {
            List<String> list = textTheme.backgroundColor;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = textTheme.iconColor;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            textTheme.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TextTheme parse(nb5 nb5Var) throws IOException {
            TextTheme textTheme = new TextTheme();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (textTheme.backgroundColor == null) {
                        textTheme.backgroundColor = new ArrayList();
                    }
                    if (textTheme.iconColor != null) {
                        break;
                    }
                    textTheme.iconColor = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    textTheme.backgroundColor = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (textTheme.backgroundColor == null) {
                            textTheme.backgroundColor = new ArrayList();
                        }
                        if (textTheme.iconColor != null) {
                            break;
                        }
                        textTheme.iconColor = new ArrayList();
                        return textTheme;
                    }
                    textTheme.iconColor = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return textTheme;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TextTheme textTheme, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = textTheme.backgroundColor;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = textTheme.iconColor;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TextTheme> JSON_ADAPTER = new ObjectJsonAdapter<TextTheme>() { // from class: com.p1.mobile.putong.data.TextTheme.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TextTheme.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TextTheme newInstance() {
            return new TextTheme();
        }

        public boolean parseField(TextTheme textTheme, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("iconColor")) {
                textTheme.iconColor = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("backgroundColor")) {
                return false;
            }
            textTheme.backgroundColor = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TextTheme textTheme, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("iconColor") || str.equals("backgroundColor")) {
                return true;
            }
            return super.parseFieldCheck(textTheme, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TextTheme textTheme, JsonGenerator jsonGenerator) throws IOException {
            if (textTheme.backgroundColor != null) {
                jsonGenerator.writeFieldName("backgroundColor");
                JsonAdapter.serializeArray(textTheme.backgroundColor, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (textTheme.iconColor != null) {
                jsonGenerator.writeFieldName("iconColor");
                JsonAdapter.serializeArray(textTheme.iconColor, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TextTheme) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TextTheme) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60104a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60105b(String str) {
        return str;
    }

    public static TextTheme new_() {
        TextTheme textTheme = new TextTheme();
        textTheme.nullCheck();
        return textTheme;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TextTheme mo223809clone() {
        TextTheme textTheme = new TextTheme();
        List<String> list = this.backgroundColor;
        if (list != null) {
            textTheme.backgroundColor = ValueObject.util_map(list, new w9j() { // from class: l.hji0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TextTheme.m60105b((String) obj);
                }
            });
        }
        List<String> list2 = this.iconColor;
        if (list2 != null) {
            textTheme.iconColor = ValueObject.util_map(list2, new w9j() { // from class: l.iji0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TextTheme.m60104a((String) obj);
                }
            });
        }
        return textTheme;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextTheme)) {
            return false;
        }
        TextTheme textTheme = (TextTheme) obj;
        return ValueObject.util_equals(this.backgroundColor, textTheme.backgroundColor) && ValueObject.util_equals(this.iconColor, textTheme.iconColor);
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
        List<String> list = this.backgroundColor;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.iconColor;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.backgroundColor == null) {
            this.backgroundColor = new ArrayList();
        }
        if (this.iconColor == null) {
            this.iconColor = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
