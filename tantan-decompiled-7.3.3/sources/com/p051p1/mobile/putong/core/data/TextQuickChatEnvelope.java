package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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
public class TextQuickChatEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "textquickchatenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public TextQuickChatCardData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<TextQuickChatEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<TextQuickChatEnvelope>() { // from class: com.p1.mobile.putong.core.data.TextQuickChatEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TextQuickChatEnvelope textQuickChatEnvelope) {
            Meta meta = textQuickChatEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            TextQuickChatCardData textQuickChatCardData = textQuickChatEnvelope.data;
            if (textQuickChatCardData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, textQuickChatCardData, TextQuickChatCardData.PROTOBUF_ADAPTER);
            }
            textQuickChatEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TextQuickChatEnvelope parse(nc5 nc5Var) throws IOException {
            TextQuickChatEnvelope textQuickChatEnvelope = new TextQuickChatEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (textQuickChatEnvelope.meta == null) {
                        textQuickChatEnvelope.meta = Meta.new_();
                    }
                    if (textQuickChatEnvelope.data != null) {
                        break;
                    }
                    textQuickChatEnvelope.data = TextQuickChatCardData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    textQuickChatEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (textQuickChatEnvelope.meta == null) {
                            textQuickChatEnvelope.meta = Meta.new_();
                        }
                        if (textQuickChatEnvelope.data != null) {
                            break;
                        }
                        textQuickChatEnvelope.data = TextQuickChatCardData.new_();
                        return textQuickChatEnvelope;
                    }
                    textQuickChatEnvelope.data = (TextQuickChatCardData) nc5Var.m162488l(TextQuickChatCardData.PROTOBUF_ADAPTER);
                }
            }
            return textQuickChatEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TextQuickChatEnvelope textQuickChatEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = textQuickChatEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            TextQuickChatCardData textQuickChatCardData = textQuickChatEnvelope.data;
            if (textQuickChatCardData != null) {
                codedOutputByteBufferNano.m17309K(2, textQuickChatCardData, TextQuickChatCardData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TextQuickChatEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<TextQuickChatEnvelope>() { // from class: com.p1.mobile.putong.core.data.TextQuickChatEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TextQuickChatEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TextQuickChatEnvelope newInstance() {
            return new TextQuickChatEnvelope();
        }

        public boolean parseField(TextQuickChatEnvelope textQuickChatEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                textQuickChatEnvelope.data = TextQuickChatCardData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            textQuickChatEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TextQuickChatEnvelope textQuickChatEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(textQuickChatEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TextQuickChatEnvelope textQuickChatEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (textQuickChatEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(textQuickChatEnvelope.meta, jsonGenerator, true);
            }
            if (textQuickChatEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                TextQuickChatCardData.JSON_ADAPTER.serialize(textQuickChatEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TextQuickChatEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TextQuickChatEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TextQuickChatEnvelope new_() {
        TextQuickChatEnvelope textQuickChatEnvelope = new TextQuickChatEnvelope();
        textQuickChatEnvelope.nullCheck();
        return textQuickChatEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TextQuickChatEnvelope mo225055clone() {
        TextQuickChatEnvelope textQuickChatEnvelope = new TextQuickChatEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            textQuickChatEnvelope.meta = meta.mo225055clone();
        }
        TextQuickChatCardData textQuickChatCardData = this.data;
        if (textQuickChatCardData != null) {
            textQuickChatEnvelope.data = textQuickChatCardData.mo225055clone();
        }
        return textQuickChatEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextQuickChatEnvelope)) {
            return false;
        }
        TextQuickChatEnvelope textQuickChatEnvelope = (TextQuickChatEnvelope) obj;
        return ValueObject.util_equals(this.meta, textQuickChatEnvelope.meta) && ValueObject.util_equals(this.data, textQuickChatEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        TextQuickChatCardData textQuickChatCardData = this.data;
        int iHashCode2 = iHashCode + (textQuickChatCardData != null ? textQuickChatCardData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = TextQuickChatCardData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
