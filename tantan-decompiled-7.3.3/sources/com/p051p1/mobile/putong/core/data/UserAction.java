package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CardOption;
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
public class UserAction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "useraction";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<CardOption> options;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<UserAction> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserAction>() { // from class: com.p1.mobile.putong.core.data.UserAction.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserAction userAction) {
            String str = userAction.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<CardOption> list = userAction.options;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, CardOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            userAction.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserAction parse(nc5 nc5Var) throws IOException {
            UserAction userAction = new UserAction();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userAction.userId == null) {
                        userAction.userId = "";
                    }
                    if (userAction.options != null) {
                        break;
                    }
                    userAction.options = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    userAction.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (userAction.userId == null) {
                            userAction.userId = "";
                        }
                        if (userAction.options != null) {
                            break;
                        }
                        userAction.options = new ArrayList();
                        return userAction;
                    }
                    userAction.options = (List) nc5Var.m162488l(CardOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userAction;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserAction userAction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userAction.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<CardOption> list = userAction.options;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, CardOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserAction> JSON_ADAPTER = new ObjectJsonAdapter<UserAction>() { // from class: com.p1.mobile.putong.core.data.UserAction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserAction.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserAction newInstance() {
            return new UserAction();
        }

        public boolean parseField(UserAction userAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Options.TYPE)) {
                userAction.options = JsonAdapter.parseArray(jsonParser, CardOption.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("userId")) {
                return false;
            }
            userAction.userId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(UserAction userAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Options.TYPE) || str.equals("userId")) {
                return true;
            }
            return super.parseFieldCheck(userAction, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserAction userAction, JsonGenerator jsonGenerator) throws IOException {
            String str = userAction.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (userAction.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(userAction.options, jsonGenerator, CardOption.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserAction new_() {
        UserAction userAction = new UserAction();
        userAction.nullCheck();
        return userAction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserAction mo225055clone() {
        UserAction userAction = new UserAction();
        userAction.userId = this.userId;
        List<CardOption> list = this.options;
        if (list != null) {
            userAction.options = ValueObject.util_map(list, new qcj() { // from class: l.q6k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((CardOption) obj).mo225055clone();
                }
            });
        }
        return userAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserAction)) {
            return false;
        }
        UserAction userAction = (UserAction) obj;
        return ValueObject.util_equals(this.userId, userAction.userId) && ValueObject.util_equals(this.options, userAction.options);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<CardOption> list = this.options;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.options == null) {
            this.options = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
