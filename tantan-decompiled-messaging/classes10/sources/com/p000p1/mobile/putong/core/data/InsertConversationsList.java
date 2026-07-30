package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.InsertConversationUser;
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
public class InsertConversationsList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "insertconversationslist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<InsertConversationUser> users;
    public static ProtobufAdapter<InsertConversationsList> PROTOBUF_ADAPTER = new MessageNanoAdapter<InsertConversationsList>() { // from class: com.p1.mobile.putong.core.data.InsertConversationsList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InsertConversationsList insertConversationsList) {
            List<InsertConversationUser> list = insertConversationsList.users;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, InsertConversationUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) insertConversationsList).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InsertConversationsList m13473parse(nb5 nb5Var) throws IOException {
            InsertConversationsList insertConversationsList = new InsertConversationsList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (insertConversationsList.users != null) {
                        break;
                    }
                    insertConversationsList.users = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (insertConversationsList.users != null) {
                        break;
                    }
                    insertConversationsList.users = new ArrayList();
                    return insertConversationsList;
                }
                insertConversationsList.users = (List) nb5Var.l(InsertConversationUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return insertConversationsList;
        }

        public void serialize(InsertConversationsList insertConversationsList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<InsertConversationUser> list = insertConversationsList.users;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, InsertConversationUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<InsertConversationsList> JSON_ADAPTER = new ObjectJsonAdapter<InsertConversationsList>() { // from class: com.p1.mobile.putong.core.data.InsertConversationsList.2
        public Class getDataClass() {
            return InsertConversationsList.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public InsertConversationsList m13474newInstance() {
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

        public void serializeFields(InsertConversationsList insertConversationsList, JsonGenerator jsonGenerator) throws IOException {
            if (insertConversationsList.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(insertConversationsList.users, jsonGenerator, InsertConversationUser.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InsertConversationsList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InsertConversationsList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InsertConversationsList new_() {
        InsertConversationsList insertConversationsList = new InsertConversationsList();
        insertConversationsList.nullCheck();
        return insertConversationsList;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InsertConversationsList m13472clone() {
        InsertConversationsList insertConversationsList = new InsertConversationsList();
        List<InsertConversationUser> list = this.users;
        if (list != null) {
            insertConversationsList.users = ValueObject.util_map(list, new w9j() { // from class: l.ctm
                public final Object call(Object obj) {
                    return ((InsertConversationUser) obj).m13468clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<InsertConversationUser> list = this.users;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
