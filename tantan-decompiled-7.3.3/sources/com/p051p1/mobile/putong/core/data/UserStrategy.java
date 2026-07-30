package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.UserStrategy;
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
public class UserStrategy extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userstrategy";

    @ProtobufIndex(index = 1)
    public int strategyID;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> values;
    public static ProtobufAdapter<UserStrategy> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserStrategy>() { // from class: com.p1.mobile.putong.core.data.UserStrategy.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserStrategy userStrategy) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, userStrategy.strategyID);
            List<Integer> list = userStrategy.values;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            userStrategy.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserStrategy parse(nc5 nc5Var) throws IOException {
            UserStrategy userStrategy = new UserStrategy();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userStrategy.values != null) {
                        break;
                    }
                    userStrategy.values = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    userStrategy.strategyID = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (userStrategy.values != null) {
                            break;
                        }
                        userStrategy.values = new ArrayList();
                        return userStrategy;
                    }
                    userStrategy.values = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userStrategy;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserStrategy userStrategy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, userStrategy.strategyID);
            List<Integer> list = userStrategy.values;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserStrategy> JSON_ADAPTER = new ObjectJsonAdapter<UserStrategy>() { // from class: com.p1.mobile.putong.core.data.UserStrategy.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserStrategy.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserStrategy newInstance() {
            return new UserStrategy();
        }

        public boolean parseField(UserStrategy userStrategy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("values")) {
                userStrategy.values = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("strategyID")) {
                return false;
            }
            userStrategy.strategyID = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(UserStrategy userStrategy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("values") || str.equals("strategyID")) {
                return true;
            }
            return super.parseFieldCheck(userStrategy, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserStrategy userStrategy, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("strategyID", userStrategy.strategyID);
            if (userStrategy.values != null) {
                jsonGenerator.writeFieldName("values");
                JsonAdapter.serializeArray(userStrategy.values, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m36898a(Integer num) {
        return num;
    }

    public static UserStrategy new_() {
        UserStrategy userStrategy = new UserStrategy();
        userStrategy.nullCheck();
        return userStrategy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserStrategy mo225055clone() {
        UserStrategy userStrategy = new UserStrategy();
        userStrategy.strategyID = this.strategyID;
        List<Integer> list = this.values;
        if (list != null) {
            userStrategy.values = ValueObject.util_map(list, new qcj() { // from class: l.bjk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserStrategy.m36898a((Integer) obj);
                }
            });
        }
        return userStrategy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserStrategy)) {
            return false;
        }
        UserStrategy userStrategy = (UserStrategy) obj;
        return this.strategyID == userStrategy.strategyID && ValueObject.util_equals(this.values, userStrategy.values);
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
        int i2 = ((i * 41) + this.strategyID) * 41;
        List<Integer> list = this.values;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.values == null) {
            this.values = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
