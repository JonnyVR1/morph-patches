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
public class Content extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "content";

    @NonNull
    @ProtobufIndex(index = 2)
    public FillBlank fillBlank;

    @NonNull
    @ProtobufIndex(index = 1)
    public Selection selection;
    public static ProtobufAdapter<Content> PROTOBUF_ADAPTER = new MessageNanoAdapter<Content>() { // from class: com.p1.mobile.putong.core.data.Content.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Content content) {
            Selection selection = content.selection;
            int iM17230l = selection != null ? CodedOutputByteBufferNano.m17230l(1, selection, Selection.PROTOBUF_ADAPTER) : 0;
            FillBlank fillBlank = content.fillBlank;
            if (fillBlank != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, fillBlank, FillBlank.PROTOBUF_ADAPTER);
            }
            content.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Content parse(nb5 nb5Var) throws IOException {
            Content content = new Content();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (content.selection == null) {
                        content.selection = Selection.new_();
                    }
                    if (content.fillBlank != null) {
                        break;
                    }
                    content.fillBlank = FillBlank.new_();
                    break;
                }
                if (iM158752u == 10) {
                    content.selection = (Selection) nb5Var.m158743l(Selection.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (content.selection == null) {
                            content.selection = Selection.new_();
                        }
                        if (content.fillBlank != null) {
                            break;
                        }
                        content.fillBlank = FillBlank.new_();
                        return content;
                    }
                    content.fillBlank = (FillBlank) nb5Var.m158743l(FillBlank.PROTOBUF_ADAPTER);
                }
            }
            return content;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Content content, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Selection selection = content.selection;
            if (selection != null) {
                codedOutputByteBufferNano.m17254K(1, selection, Selection.PROTOBUF_ADAPTER);
            }
            FillBlank fillBlank = content.fillBlank;
            if (fillBlank != null) {
                codedOutputByteBufferNano.m17254K(2, fillBlank, FillBlank.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Content> JSON_ADAPTER = new ObjectJsonAdapter<Content>() { // from class: com.p1.mobile.putong.core.data.Content.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Content.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Content newInstance() {
            return new Content();
        }

        public boolean parseField(Content content, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selection")) {
                content.selection = Selection.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("fillBlank")) {
                return false;
            }
            content.fillBlank = FillBlank.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Content content, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selection") || str.equals("fillBlank")) {
                return true;
            }
            return super.parseFieldCheck(content, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Content content, JsonGenerator jsonGenerator) throws IOException {
            if (content.selection != null) {
                jsonGenerator.writeFieldName("selection");
                Selection.JSON_ADAPTER.serialize(content.selection, jsonGenerator, true);
            }
            if (content.fillBlank != null) {
                jsonGenerator.writeFieldName("fillBlank");
                FillBlank.JSON_ADAPTER.serialize(content.fillBlank, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Content) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Content) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Content new_() {
        Content content = new Content();
        content.nullCheck();
        return content;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Content mo223809clone() {
        Content content = new Content();
        Selection selection = this.selection;
        if (selection != null) {
            content.selection = selection.mo223809clone();
        }
        FillBlank fillBlank = this.fillBlank;
        if (fillBlank != null) {
            content.fillBlank = fillBlank.mo223809clone();
        }
        return content;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return ValueObject.util_equals(this.selection, content.selection) && ValueObject.util_equals(this.fillBlank, content.fillBlank);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "content";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Selection selection = this.selection;
        int iHashCode = (i2 + (selection != null ? selection.hashCode() : 0)) * 41;
        FillBlank fillBlank = this.fillBlank;
        int iHashCode2 = iHashCode + (fillBlank != null ? fillBlank.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.selection == null) {
            this.selection = Selection.new_();
        }
        if (this.fillBlank == null) {
            this.fillBlank = FillBlank.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
