package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Options;
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

/* JADX INFO: loaded from: classes10.dex */
public class Selection extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selection";

    @ProtobufIndex(index = 2)
    public int maxChoices;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Options> options;
    public static ProtobufAdapter<Selection> PROTOBUF_ADAPTER = new MessageNanoAdapter<Selection>() { // from class: com.p1.mobile.putong.core.data.Selection.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Selection selection) {
            List<Options> list = selection.options;
            int iM17230l = (list != null ? CodedOutputByteBufferNano.m17230l(1, list, Options.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17226h(2, selection.maxChoices);
            selection.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Selection parse(nb5 nb5Var) throws IOException {
            Selection selection = new Selection();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (selection.options != null) {
                        break;
                    }
                    selection.options = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    selection.options = (List) nb5Var.m158743l(Options.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 16) {
                        if (selection.options != null) {
                            break;
                        }
                        selection.options = new ArrayList();
                        return selection;
                    }
                    selection.maxChoices = nb5Var.m158741j();
                }
            }
            return selection;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Selection selection, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Options> list = selection.options;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Options.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(2, selection.maxChoices);
        }
    };
    public static JsonAdapter<Selection> JSON_ADAPTER = new ObjectJsonAdapter<Selection>() { // from class: com.p1.mobile.putong.core.data.Selection.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Selection.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Selection newInstance() {
            return new Selection();
        }

        public boolean parseField(Selection selection, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Options.TYPE)) {
                selection.options = JsonAdapter.parseArray(jsonParser, Options.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("maxChoices")) {
                return false;
            }
            selection.maxChoices = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Selection selection, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Options.TYPE) || str.equals("maxChoices")) {
                return true;
            }
            return super.parseFieldCheck(selection, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Selection selection, JsonGenerator jsonGenerator) throws IOException {
            if (selection.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(selection.options, jsonGenerator, Options.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("maxChoices", selection.maxChoices);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Selection) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Selection) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Selection new_() {
        Selection selection = new Selection();
        selection.nullCheck();
        return selection;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Selection mo223809clone() {
        Selection selection = new Selection();
        List<Options> list = this.options;
        if (list != null) {
            selection.options = ValueObject.util_map(list, new w9j() { // from class: l.cee0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Options) obj).mo223809clone();
                }
            });
        }
        selection.maxChoices = this.maxChoices;
        return selection;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return ValueObject.util_equals(this.options, selection.options) && this.maxChoices == selection.maxChoices;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "selection";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<Options> list = this.options;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.maxChoices;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.options == null) {
            this.options = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
