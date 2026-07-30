package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class ContentSecond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contentsecond";

    @NonNull
    @ProtobufIndex(index = 2)
    public FillBlankSecond fillBlank;

    @NonNull
    @ProtobufIndex(index = 1)
    public SelectionSecond selection;
    public static ProtobufAdapter<ContentSecond> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContentSecond>() { // from class: com.p1.mobile.putong.core.data.ContentSecond.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ContentSecond contentSecond) {
            SelectionSecond selectionSecond = contentSecond.selection;
            int iM17285l = selectionSecond != null ? CodedOutputByteBufferNano.m17285l(1, selectionSecond, SelectionSecond.PROTOBUF_ADAPTER) : 0;
            FillBlankSecond fillBlankSecond = contentSecond.fillBlank;
            if (fillBlankSecond != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, fillBlankSecond, FillBlankSecond.PROTOBUF_ADAPTER);
            }
            contentSecond.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ContentSecond parse(nc5 nc5Var) throws IOException {
            ContentSecond contentSecond = new ContentSecond();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (contentSecond.selection == null) {
                        contentSecond.selection = SelectionSecond.new_();
                    }
                    if (contentSecond.fillBlank != null) {
                        break;
                    }
                    contentSecond.fillBlank = FillBlankSecond.new_();
                    break;
                }
                if (iM162497u == 10) {
                    contentSecond.selection = (SelectionSecond) nc5Var.m162488l(SelectionSecond.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (contentSecond.selection == null) {
                            contentSecond.selection = SelectionSecond.new_();
                        }
                        if (contentSecond.fillBlank != null) {
                            break;
                        }
                        contentSecond.fillBlank = FillBlankSecond.new_();
                        return contentSecond;
                    }
                    contentSecond.fillBlank = (FillBlankSecond) nc5Var.m162488l(FillBlankSecond.PROTOBUF_ADAPTER);
                }
            }
            return contentSecond;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ContentSecond contentSecond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SelectionSecond selectionSecond = contentSecond.selection;
            if (selectionSecond != null) {
                codedOutputByteBufferNano.m17309K(1, selectionSecond, SelectionSecond.PROTOBUF_ADAPTER);
            }
            FillBlankSecond fillBlankSecond = contentSecond.fillBlank;
            if (fillBlankSecond != null) {
                codedOutputByteBufferNano.m17309K(2, fillBlankSecond, FillBlankSecond.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ContentSecond> JSON_ADAPTER = new ObjectJsonAdapter<ContentSecond>() { // from class: com.p1.mobile.putong.core.data.ContentSecond.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ContentSecond.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ContentSecond newInstance() {
            return new ContentSecond();
        }

        public boolean parseField(ContentSecond contentSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selection")) {
                contentSecond.selection = SelectionSecond.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("fillBlank")) {
                return false;
            }
            contentSecond.fillBlank = FillBlankSecond.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ContentSecond contentSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selection") || str.equals("fillBlank")) {
                return true;
            }
            return super.parseFieldCheck(contentSecond, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContentSecond contentSecond, JsonGenerator jsonGenerator) throws IOException {
            if (contentSecond.selection != null) {
                jsonGenerator.writeFieldName("selection");
                SelectionSecond.JSON_ADAPTER.serialize(contentSecond.selection, jsonGenerator, true);
            }
            if (contentSecond.fillBlank != null) {
                jsonGenerator.writeFieldName("fillBlank");
                FillBlankSecond.JSON_ADAPTER.serialize(contentSecond.fillBlank, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContentSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContentSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContentSecond new_() {
        ContentSecond contentSecond = new ContentSecond();
        contentSecond.nullCheck();
        return contentSecond;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ContentSecond mo225055clone() {
        ContentSecond contentSecond = new ContentSecond();
        SelectionSecond selectionSecond = this.selection;
        if (selectionSecond != null) {
            contentSecond.selection = selectionSecond.mo225055clone();
        }
        FillBlankSecond fillBlankSecond = this.fillBlank;
        if (fillBlankSecond != null) {
            contentSecond.fillBlank = fillBlankSecond.mo225055clone();
        }
        return contentSecond;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContentSecond)) {
            return false;
        }
        ContentSecond contentSecond = (ContentSecond) obj;
        return ValueObject.util_equals(this.selection, contentSecond.selection) && ValueObject.util_equals(this.fillBlank, contentSecond.fillBlank);
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
        SelectionSecond selectionSecond = this.selection;
        int iHashCode = (i2 + (selectionSecond != null ? selectionSecond.hashCode() : 0)) * 41;
        FillBlankSecond fillBlankSecond = this.fillBlank;
        int iHashCode2 = iHashCode + (fillBlankSecond != null ? fillBlankSecond.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.selection == null) {
            this.selection = SelectionSecond.new_();
        }
        if (this.fillBlank == null) {
            this.fillBlank = FillBlankSecond.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
