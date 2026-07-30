package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.User;
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
import p149l.nb5;

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
            int iM17230l = (user != null ? CodedOutputByteBufferNano.m17230l(1, user, User.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17220b(2, userCheckWrapper.checked);
            userCheckWrapper.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserCheckWrapper parse(nb5 nb5Var) throws IOException {
            UserCheckWrapper userCheckWrapper = new UserCheckWrapper();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userCheckWrapper.user != null) {
                        break;
                    }
                    userCheckWrapper.user = User.new_();
                    break;
                }
                if (iM158752u == 10) {
                    userCheckWrapper.user = (User) nb5Var.m158743l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 16) {
                        if (userCheckWrapper.user != null) {
                            break;
                        }
                        userCheckWrapper.user = User.new_();
                        return userCheckWrapper;
                    }
                    userCheckWrapper.checked = nb5Var.m158738g();
                }
            }
            return userCheckWrapper;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserCheckWrapper userCheckWrapper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            User user = userCheckWrapper.user;
            if (user != null) {
                codedOutputByteBufferNano.m17254K(1, user, User.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(2, userCheckWrapper.checked);
        }
    };
    public static JsonAdapter<UserCheckWrapper> JSON_ADAPTER = new ObjectJsonAdapter<UserCheckWrapper>() { // from class: com.p1.mobile.putong.core.data.UserCheckWrapper.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserCheckWrapper.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserCheckWrapper userCheckWrapper, JsonGenerator jsonGenerator) throws IOException {
            if (userCheckWrapper.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(userCheckWrapper.user, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("checked", userCheckWrapper.checked);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserCheckWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public UserCheckWrapper mo223809clone() {
        UserCheckWrapper userCheckWrapper = new UserCheckWrapper();
        User user = this.user;
        if (user != null) {
            userCheckWrapper.user = user.mo223809clone();
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
