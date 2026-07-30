package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.OptionsSecond;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SelectionSecond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selectionsecond";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int maxChoices;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<OptionsSecond> options;
    public static ProtobufAdapter<SelectionSecond> PROTOBUF_ADAPTER = new MessageNanoAdapter<SelectionSecond>() { // from class: com.p1.mobile.putong.core.data.SelectionSecond.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SelectionSecond selectionSecond) {
            List<OptionsSecond> list = selectionSecond.options;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, OptionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.h(2, selectionSecond.maxChoices);
            ((MessageNano) selectionSecond).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SelectionSecond m15569parse(nb5 nb5Var) throws IOException {
            SelectionSecond selectionSecond = new SelectionSecond();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (selectionSecond.options != null) {
                        break;
                    }
                    selectionSecond.options = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    selectionSecond.options = (List) nb5Var.l(OptionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 16) {
                        if (selectionSecond.options != null) {
                            break;
                        }
                        selectionSecond.options = new ArrayList();
                        return selectionSecond;
                    }
                    selectionSecond.maxChoices = nb5Var.j();
                }
            }
            return selectionSecond;
        }

        public void serialize(SelectionSecond selectionSecond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<OptionsSecond> list = selectionSecond.options;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, OptionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(2, selectionSecond.maxChoices);
        }
    };
    public static JsonAdapter<SelectionSecond> JSON_ADAPTER = new ObjectJsonAdapter<SelectionSecond>() { // from class: com.p1.mobile.putong.core.data.SelectionSecond.2
        public Class getDataClass() {
            return SelectionSecond.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SelectionSecond m15570newInstance() {
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

        public void serializeFields(SelectionSecond selectionSecond, JsonGenerator jsonGenerator) throws IOException {
            if (selectionSecond.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(selectionSecond.options, jsonGenerator, OptionsSecond.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("maxChoices", selectionSecond.maxChoices);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SelectionSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SelectionSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SelectionSecond new_() {
        SelectionSecond selectionSecond = new SelectionSecond();
        selectionSecond.nullCheck();
        return selectionSecond;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SelectionSecond m15568clone() {
        SelectionSecond selectionSecond = new SelectionSecond();
        List<OptionsSecond> list = this.options;
        if (list != null) {
            selectionSecond.options = ValueObject.util_map(list, new w9j() { // from class: l.dee0
                public final Object call(Object obj) {
                    return ((OptionsSecond) obj).m14698clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<OptionsSecond> list = this.options;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.maxChoices;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.options == null) {
            this.options = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
