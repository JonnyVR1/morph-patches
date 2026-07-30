package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ConversationBatchPatchIds;
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
public class ConversationBatchPatchIds extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationbatchpatchids";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> ids;
    public static ProtobufAdapter<ConversationBatchPatchIds> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationBatchPatchIds>() { // from class: com.p1.mobile.putong.core.data.ConversationBatchPatchIds.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationBatchPatchIds conversationBatchPatchIds) {
            List<String> list = conversationBatchPatchIds.ids;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            conversationBatchPatchIds.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationBatchPatchIds parse(nc5 nc5Var) throws IOException {
            ConversationBatchPatchIds conversationBatchPatchIds = new ConversationBatchPatchIds();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (conversationBatchPatchIds.ids != null) {
                        break;
                    }
                    conversationBatchPatchIds.ids = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (conversationBatchPatchIds.ids != null) {
                        break;
                    }
                    conversationBatchPatchIds.ids = new ArrayList();
                    return conversationBatchPatchIds;
                }
                conversationBatchPatchIds.ids = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return conversationBatchPatchIds;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationBatchPatchIds conversationBatchPatchIds, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = conversationBatchPatchIds.ids;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ConversationBatchPatchIds> JSON_ADAPTER = new ObjectJsonAdapter<ConversationBatchPatchIds>() { // from class: com.p1.mobile.putong.core.data.ConversationBatchPatchIds.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationBatchPatchIds.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationBatchPatchIds newInstance() {
            return new ConversationBatchPatchIds();
        }

        public boolean parseField(ConversationBatchPatchIds conversationBatchPatchIds, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("ids")) {
                return false;
            }
            conversationBatchPatchIds.ids = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ConversationBatchPatchIds conversationBatchPatchIds, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("ids")) {
                return true;
            }
            return super.parseFieldCheck(conversationBatchPatchIds, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationBatchPatchIds conversationBatchPatchIds, JsonGenerator jsonGenerator) throws IOException {
            if (conversationBatchPatchIds.ids != null) {
                jsonGenerator.writeFieldName("ids");
                JsonAdapter.serializeArray(conversationBatchPatchIds.ids, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationBatchPatchIds) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationBatchPatchIds) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36302a(String str) {
        return str;
    }

    public static ConversationBatchPatchIds new_() {
        ConversationBatchPatchIds conversationBatchPatchIds = new ConversationBatchPatchIds();
        conversationBatchPatchIds.nullCheck();
        return conversationBatchPatchIds;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationBatchPatchIds mo225055clone() {
        ConversationBatchPatchIds conversationBatchPatchIds = new ConversationBatchPatchIds();
        List<String> list = this.ids;
        if (list != null) {
            conversationBatchPatchIds.ids = ValueObject.util_map(list, new qcj() { // from class: l.l66
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ConversationBatchPatchIds.m36302a((String) obj);
                }
            });
        }
        return conversationBatchPatchIds;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationBatchPatchIds) {
            return ValueObject.util_equals(this.ids, ((ConversationBatchPatchIds) obj).ids);
        }
        return false;
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
        List<String> list = this.ids;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ids == null) {
            this.ids = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
