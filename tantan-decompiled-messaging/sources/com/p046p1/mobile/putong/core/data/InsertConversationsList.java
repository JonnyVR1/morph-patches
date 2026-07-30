package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.InsertConversationUser;
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
public class InsertConversationsList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "insertconversationslist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<InsertConversationUser> users;
    public static ProtobufAdapter<InsertConversationsList> PROTOBUF_ADAPTER = new MessageNanoAdapter<InsertConversationsList>() { // from class: com.p1.mobile.putong.core.data.InsertConversationsList.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InsertConversationsList insertConversationsList) {
            List<InsertConversationUser> list = insertConversationsList.users;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, InsertConversationUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            insertConversationsList.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InsertConversationsList parse(nb5 nb5Var) throws IOException {
            InsertConversationsList insertConversationsList = new InsertConversationsList();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (insertConversationsList.users != null) {
                        break;
                    }
                    insertConversationsList.users = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (insertConversationsList.users != null) {
                        break;
                    }
                    insertConversationsList.users = new ArrayList();
                    return insertConversationsList;
                }
                insertConversationsList.users = (List) nb5Var.m158743l(InsertConversationUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return insertConversationsList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InsertConversationsList insertConversationsList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<InsertConversationUser> list = insertConversationsList.users;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, InsertConversationUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<InsertConversationsList> JSON_ADAPTER = new ObjectJsonAdapter<InsertConversationsList>() { // from class: com.p1.mobile.putong.core.data.InsertConversationsList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InsertConversationsList.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InsertConversationsList newInstance() {
            return new InsertConversationsList();
        }

        public boolean parseField(InsertConversationsList insertConversationsList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("users")) {
                return false;
            }
            insertConversationsList.users = JsonAdapter.parseArray(jsonParser, InsertConversationUser.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(InsertConversationsList insertConversationsList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("users")) {
                return true;
            }
            return super.parseFieldCheck(insertConversationsList, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InsertConversationsList insertConversationsList, JsonGenerator jsonGenerator) throws IOException {
            if (insertConversationsList.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(insertConversationsList.users, jsonGenerator, InsertConversationUser.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InsertConversationsList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InsertConversationsList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InsertConversationsList new_() {
        InsertConversationsList insertConversationsList = new InsertConversationsList();
        insertConversationsList.nullCheck();
        return insertConversationsList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InsertConversationsList mo223809clone() {
        InsertConversationsList insertConversationsList = new InsertConversationsList();
        List<InsertConversationUser> list = this.users;
        if (list != null) {
            insertConversationsList.users = ValueObject.util_map(list, new w9j() { // from class: l.ctm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((InsertConversationUser) obj).mo223809clone();
                }
            });
        }
        return insertConversationsList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InsertConversationsList) {
            return ValueObject.util_equals(this.users, ((InsertConversationsList) obj).users);
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
        List<InsertConversationUser> list = this.users;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
