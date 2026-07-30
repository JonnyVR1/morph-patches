package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Options;
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
public class Selection extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selection";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int maxChoices;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Options> options;
    public static ProtobufAdapter<Selection> PROTOBUF_ADAPTER = new MessageNanoAdapter<Selection>() { // from class: com.p1.mobile.putong.core.data.Selection.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Selection selection) {
            List<Options> list = selection.options;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, Options.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.h(2, selection.maxChoices);
            ((MessageNano) selection).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Selection m15565parse(nb5 nb5Var) throws IOException {
            Selection selection = new Selection();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (selection.options != null) {
                        break;
                    }
                    selection.options = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    selection.options = (List) nb5Var.l(Options.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 16) {
                        if (selection.options != null) {
                            break;
                        }
                        selection.options = new ArrayList();
                        return selection;
                    }
                    selection.maxChoices = nb5Var.j();
                }
            }
            return selection;
        }

        public void serialize(Selection selection, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Options> list = selection.options;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Options.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(2, selection.maxChoices);
        }
    };
    public static JsonAdapter<Selection> JSON_ADAPTER = new ObjectJsonAdapter<Selection>() { // from class: com.p1.mobile.putong.core.data.Selection.2
        public Class getDataClass() {
            return Selection.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Selection m15566newInstance() {
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

        public void serializeFields(Selection selection, JsonGenerator jsonGenerator) throws IOException {
            if (selection.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(selection.options, jsonGenerator, Options.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("maxChoices", selection.maxChoices);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Selection) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Selection) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Selection new_() {
        Selection selection = new Selection();
        selection.nullCheck();
        return selection;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Selection m15564clone() {
        Selection selection = new Selection();
        List<Options> list = this.options;
        if (list != null) {
            selection.options = ValueObject.util_map(list, new w9j() { // from class: l.cee0
                public final Object call(Object obj) {
                    return ((Options) obj).m14690clone();
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

    public String getClassParseName() {
        return "selection";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<Options> list = this.options;
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
