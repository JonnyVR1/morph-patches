package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.OptionsSecond;
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

/* JADX INFO: loaded from: classes10.dex */
public class SelectionSecond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selectionsecond";

    @ProtobufIndex(index = 2)
    public int maxChoices;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<OptionsSecond> options;
    public static ProtobufAdapter<SelectionSecond> PROTOBUF_ADAPTER = new MessageNanoAdapter<SelectionSecond>() { // from class: com.p1.mobile.putong.core.data.SelectionSecond.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SelectionSecond selectionSecond) {
            List<OptionsSecond> list = selectionSecond.options;
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, OptionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17281h(2, selectionSecond.maxChoices);
            selectionSecond.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SelectionSecond parse(nc5 nc5Var) throws IOException {
            SelectionSecond selectionSecond = new SelectionSecond();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (selectionSecond.options != null) {
                        break;
                    }
                    selectionSecond.options = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    selectionSecond.options = (List) nc5Var.m162488l(OptionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 16) {
                        if (selectionSecond.options != null) {
                            break;
                        }
                        selectionSecond.options = new ArrayList();
                        return selectionSecond;
                    }
                    selectionSecond.maxChoices = nc5Var.m162486j();
                }
            }
            return selectionSecond;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SelectionSecond selectionSecond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<OptionsSecond> list = selectionSecond.options;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, OptionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(2, selectionSecond.maxChoices);
        }
    };
    public static JsonAdapter<SelectionSecond> JSON_ADAPTER = new ObjectJsonAdapter<SelectionSecond>() { // from class: com.p1.mobile.putong.core.data.SelectionSecond.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SelectionSecond.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SelectionSecond newInstance() {
            return new SelectionSecond();
        }

        public boolean parseField(SelectionSecond selectionSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Options.TYPE)) {
                selectionSecond.options = JsonAdapter.parseArray(jsonParser, OptionsSecond.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("maxChoices")) {
                return false;
            }
            selectionSecond.maxChoices = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SelectionSecond selectionSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Options.TYPE) || str.equals("maxChoices")) {
                return true;
            }
            return super.parseFieldCheck(selectionSecond, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SelectionSecond selectionSecond, JsonGenerator jsonGenerator) throws IOException {
            if (selectionSecond.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(selectionSecond.options, jsonGenerator, OptionsSecond.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("maxChoices", selectionSecond.maxChoices);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SelectionSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SelectionSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SelectionSecond new_() {
        SelectionSecond selectionSecond = new SelectionSecond();
        selectionSecond.nullCheck();
        return selectionSecond;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SelectionSecond mo225055clone() {
        SelectionSecond selectionSecond = new SelectionSecond();
        List<OptionsSecond> list = this.options;
        if (list != null) {
            selectionSecond.options = ValueObject.util_map(list, new qcj() { // from class: l.ime0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OptionsSecond) obj).mo225055clone();
                }
            });
        }
        selectionSecond.maxChoices = this.maxChoices;
        return selectionSecond;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectionSecond)) {
            return false;
        }
        SelectionSecond selectionSecond = (SelectionSecond) obj;
        return ValueObject.util_equals(this.options, selectionSecond.options) && this.maxChoices == selectionSecond.maxChoices;
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
        List<OptionsSecond> list = this.options;
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
