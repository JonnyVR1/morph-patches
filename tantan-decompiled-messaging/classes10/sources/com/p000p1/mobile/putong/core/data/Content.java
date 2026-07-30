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
public class Content extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "content";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public FillBlank fillBlank;

    @NonNull
    @ProtobufIndex(index = 1)
    public Selection selection;
    public static ProtobufAdapter<Content> PROTOBUF_ADAPTER = new MessageNanoAdapter<Content>() { // from class: com.p1.mobile.putong.core.data.Content.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Content content) {
            Selection selection = content.selection;
            int iL = selection != null ? CodedOutputByteBufferNano.l(1, selection, Selection.PROTOBUF_ADAPTER) : 0;
            FillBlank fillBlank = content.fillBlank;
            if (fillBlank != null) {
                iL += CodedOutputByteBufferNano.l(2, fillBlank, FillBlank.PROTOBUF_ADAPTER);
            }
            ((MessageNano) content).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Content m12261parse(nb5 nb5Var) throws IOException {
            Content content = new Content();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (content.selection == null) {
                        content.selection = Selection.new_();
                    }
                    if (content.fillBlank != null) {
                        break;
                    }
                    content.fillBlank = FillBlank.new_();
                    break;
                }
                if (iU == 10) {
                    content.selection = (Selection) nb5Var.l(Selection.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (content.selection == null) {
                            content.selection = Selection.new_();
                        }
                        if (content.fillBlank != null) {
                            break;
                        }
                        content.fillBlank = FillBlank.new_();
                        return content;
                    }
                    content.fillBlank = (FillBlank) nb5Var.l(FillBlank.PROTOBUF_ADAPTER);
                }
            }
            return content;
        }

        public void serialize(Content content, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Selection selection = content.selection;
            if (selection != null) {
                codedOutputByteBufferNano.K(1, selection, Selection.PROTOBUF_ADAPTER);
            }
            FillBlank fillBlank = content.fillBlank;
            if (fillBlank != null) {
                codedOutputByteBufferNano.K(2, fillBlank, FillBlank.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Content> JSON_ADAPTER = new ObjectJsonAdapter<Content>() { // from class: com.p1.mobile.putong.core.data.Content.2
        public Class getDataClass() {
            return Content.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Content m12262newInstance() {
            return new Content();
        }

        public boolean parseField(Content content, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selection")) {
                content.selection = (Selection) Selection.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("fillBlank")) {
                return false;
            }
            content.fillBlank = (FillBlank) FillBlank.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Content content, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selection") || str.equals("fillBlank")) {
                return true;
            }
            return super.parseFieldCheck(content, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Content) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Content) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Content new_() {
        Content content = new Content();
        content.nullCheck();
        return content;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Content m12260clone() {
        Content content = new Content();
        Selection selection = this.selection;
        if (selection != null) {
            content.selection = selection.m15564clone();
        }
        FillBlank fillBlank = this.fillBlank;
        if (fillBlank != null) {
            content.fillBlank = fillBlank.m12784clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Selection selection = this.selection;
        int iHashCode = (i2 + (selection != null ? selection.hashCode() : 0)) * 41;
        FillBlank fillBlank = this.fillBlank;
        int iHashCode2 = iHashCode + (fillBlank != null ? fillBlank.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.selection == null) {
            this.selection = Selection.new_();
        }
        if (this.fillBlank == null) {
            this.fillBlank = FillBlank.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
