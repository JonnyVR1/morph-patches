package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.JustRealUserList;
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
public class JustRealUserList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "justrealuserlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> uids;
    public static ProtobufAdapter<JustRealUserList> PROTOBUF_ADAPTER = new MessageNanoAdapter<JustRealUserList>() { // from class: com.p1.mobile.putong.core.data.JustRealUserList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(JustRealUserList justRealUserList) {
            List<String> list = justRealUserList.uids;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) justRealUserList).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public JustRealUserList m13773parse(nb5 nb5Var) throws IOException {
            JustRealUserList justRealUserList = new JustRealUserList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (justRealUserList.uids != null) {
                        break;
                    }
                    justRealUserList.uids = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (justRealUserList.uids != null) {
                        break;
                    }
                    justRealUserList.uids = new ArrayList();
                    return justRealUserList;
                }
                justRealUserList.uids = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return justRealUserList;
        }

        public void serialize(JustRealUserList justRealUserList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = justRealUserList.uids;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<JustRealUserList> JSON_ADAPTER = new ObjectJsonAdapter<JustRealUserList>() { // from class: com.p1.mobile.putong.core.data.JustRealUserList.2
        public Class getDataClass() {
            return JustRealUserList.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public JustRealUserList m13774newInstance() {
            return new JustRealUserList();
        }

        public boolean parseField(JustRealUserList justRealUserList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("uids")) {
                return false;
            }
            justRealUserList.uids = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(JustRealUserList justRealUserList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("uids")) {
                return true;
            }
            return super.parseFieldCheck(justRealUserList, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(JustRealUserList justRealUserList, JsonGenerator jsonGenerator) throws IOException {
            if (justRealUserList.uids != null) {
                jsonGenerator.writeFieldName("uids");
                JsonAdapter.serializeArray(justRealUserList.uids, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JustRealUserList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JustRealUserList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m436a(String str) {
        return str;
    }

    public static JustRealUserList new_() {
        JustRealUserList justRealUserList = new JustRealUserList();
        justRealUserList.nullCheck();
        return justRealUserList;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public JustRealUserList m13772clone() {
        JustRealUserList justRealUserList = new JustRealUserList();
        List<String> list = this.uids;
        if (list != null) {
            justRealUserList.uids = ValueObject.util_map(list, new w9j() { // from class: l.ctq
                public final Object call(Object obj) {
                    return JustRealUserList.m436a((String) obj);
                }
            });
        }
        return justRealUserList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JustRealUserList) {
            return ValueObject.util_equals(this.uids, ((JustRealUserList) obj).uids);
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
        List<String> list = this.uids;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.uids == null) {
            this.uids = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
