package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.TextTheme;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

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
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = textTheme.iconColor;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            textTheme.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TextTheme parse(nc5 nc5Var) throws IOException {
            TextTheme textTheme = new TextTheme();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (textTheme.backgroundColor == null) {
                        textTheme.backgroundColor = new ArrayList();
                    }
                    if (textTheme.iconColor != null) {
                        break;
                    }
                    textTheme.iconColor = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    textTheme.backgroundColor = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (textTheme.backgroundColor == null) {
                            textTheme.backgroundColor = new ArrayList();
                        }
                        if (textTheme.iconColor != null) {
                            break;
                        }
                        textTheme.iconColor = new ArrayList();
                        return textTheme;
                    }
                    textTheme.iconColor = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return textTheme;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TextTheme textTheme, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = textTheme.backgroundColor;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = textTheme.iconColor;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TextTheme> JSON_ADAPTER = new ObjectJsonAdapter<TextTheme>() { // from class: com.p1.mobile.putong.data.TextTheme.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TextTheme.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TextTheme) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TextTheme) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61288a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m61289b(String str) {
        return str;
    }

    public static TextTheme new_() {
        TextTheme textTheme = new TextTheme();
        textTheme.nullCheck();
        return textTheme;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TextTheme mo225055clone() {
        TextTheme textTheme = new TextTheme();
        List<String> list = this.backgroundColor;
        if (list != null) {
            textTheme.backgroundColor = ValueObject.util_map(list, new qcj() { // from class: l.hsi0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TextTheme.m61289b((String) obj);
                }
            });
        }
        List<String> list2 = this.iconColor;
        if (list2 != null) {
            textTheme.iconColor = ValueObject.util_map(list2, new qcj() { // from class: l.isi0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TextTheme.m61288a((String) obj);
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
