package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IntlTopPickUserId;
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
public class IntlTopPickUserId extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltoppickuserid";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> users;
    public static ProtobufAdapter<IntlTopPickUserId> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTopPickUserId>() { // from class: com.p1.mobile.putong.core.data.IntlTopPickUserId.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlTopPickUserId intlTopPickUserId) {
            List<String> list = intlTopPickUserId.users;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            intlTopPickUserId.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlTopPickUserId parse(nc5 nc5Var) throws IOException {
            IntlTopPickUserId intlTopPickUserId = new IntlTopPickUserId();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlTopPickUserId.users != null) {
                        break;
                    }
                    intlTopPickUserId.users = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (intlTopPickUserId.users != null) {
                        break;
                    }
                    intlTopPickUserId.users = new ArrayList();
                    return intlTopPickUserId;
                }
                intlTopPickUserId.users = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return intlTopPickUserId;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlTopPickUserId intlTopPickUserId, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = intlTopPickUserId.users;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlTopPickUserId> JSON_ADAPTER = new ObjectJsonAdapter<IntlTopPickUserId>() { // from class: com.p1.mobile.putong.core.data.IntlTopPickUserId.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlTopPickUserId.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlTopPickUserId newInstance() {
            return new IntlTopPickUserId();
        }

        public boolean parseField(IntlTopPickUserId intlTopPickUserId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("users")) {
                return false;
            }
            intlTopPickUserId.users = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlTopPickUserId intlTopPickUserId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("users")) {
                return true;
            }
            return super.parseFieldCheck(intlTopPickUserId, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlTopPickUserId intlTopPickUserId, JsonGenerator jsonGenerator) throws IOException {
            if (intlTopPickUserId.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(intlTopPickUserId.users, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTopPickUserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTopPickUserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36632a(String str) {
        return str;
    }

    public static IntlTopPickUserId new_() {
        IntlTopPickUserId intlTopPickUserId = new IntlTopPickUserId();
        intlTopPickUserId.nullCheck();
        return intlTopPickUserId;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlTopPickUserId mo225055clone() {
        IntlTopPickUserId intlTopPickUserId = new IntlTopPickUserId();
        List<String> list = this.users;
        if (list != null) {
            intlTopPickUserId.users = ValueObject.util_map(list, new qcj() { // from class: l.rfp
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlTopPickUserId.m36632a((String) obj);
                }
            });
        }
        return intlTopPickUserId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntlTopPickUserId) {
            return ValueObject.util_equals(this.users, ((IntlTopPickUserId) obj).users);
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
        List<String> list = this.users;
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
