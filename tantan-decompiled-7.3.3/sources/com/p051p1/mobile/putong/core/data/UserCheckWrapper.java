package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.User;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class UserCheckWrapper extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usercheckwrapper";

    @ProtobufIndex(index = 2)
    public boolean checked;

    @NonNull
    @ProtobufIndex(index = 1)
    public User user;
    public static ProtobufAdapter<UserCheckWrapper> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserCheckWrapper>() { // from class: com.p1.mobile.putong.core.data.UserCheckWrapper.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserCheckWrapper userCheckWrapper) {
            User user = userCheckWrapper.user;
            int iM17285l = (user != null ? CodedOutputByteBufferNano.m17285l(1, user, User.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17275b(2, userCheckWrapper.checked);
            userCheckWrapper.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserCheckWrapper parse(nc5 nc5Var) throws IOException {
            UserCheckWrapper userCheckWrapper = new UserCheckWrapper();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userCheckWrapper.user != null) {
                        break;
                    }
                    userCheckWrapper.user = User.new_();
                    break;
                }
                if (iM162497u == 10) {
                    userCheckWrapper.user = (User) nc5Var.m162488l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 16) {
                        if (userCheckWrapper.user != null) {
                            break;
                        }
                        userCheckWrapper.user = User.new_();
                        return userCheckWrapper;
                    }
                    userCheckWrapper.checked = nc5Var.m162483g();
                }
            }
            return userCheckWrapper;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserCheckWrapper userCheckWrapper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            User user = userCheckWrapper.user;
            if (user != null) {
                codedOutputByteBufferNano.m17309K(1, user, User.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(2, userCheckWrapper.checked);
        }
    };
    public static JsonAdapter<UserCheckWrapper> JSON_ADAPTER = new ObjectJsonAdapter<UserCheckWrapper>() { // from class: com.p1.mobile.putong.core.data.UserCheckWrapper.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserCheckWrapper.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserCheckWrapper newInstance() {
            return new UserCheckWrapper();
        }

        public boolean parseField(UserCheckWrapper userCheckWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("user")) {
                userCheckWrapper.user = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("checked")) {
                return false;
            }
            userCheckWrapper.checked = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(UserCheckWrapper userCheckWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("user") || str.equals("checked")) {
                return true;
            }
            return super.parseFieldCheck(userCheckWrapper, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserCheckWrapper userCheckWrapper, JsonGenerator jsonGenerator) throws IOException {
            if (userCheckWrapper.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(userCheckWrapper.user, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("checked", userCheckWrapper.checked);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserCheckWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserCheckWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserCheckWrapper new_() {
        UserCheckWrapper userCheckWrapper = new UserCheckWrapper();
        userCheckWrapper.nullCheck();
        return userCheckWrapper;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserCheckWrapper mo225055clone() {
        UserCheckWrapper userCheckWrapper = new UserCheckWrapper();
        User user = this.user;
        if (user != null) {
            userCheckWrapper.user = user.mo225055clone();
        }
        userCheckWrapper.checked = this.checked;
        return userCheckWrapper;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserCheckWrapper)) {
            return false;
        }
        UserCheckWrapper userCheckWrapper = (UserCheckWrapper) obj;
        return ValueObject.util_equals(this.user, userCheckWrapper.user) && this.checked == userCheckWrapper.checked;
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
        User user = this.user;
        int iHashCode = ((i2 + (user != null ? user.hashCode() : 0)) * 41) + (this.checked ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.user == null) {
            this.user = User.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
