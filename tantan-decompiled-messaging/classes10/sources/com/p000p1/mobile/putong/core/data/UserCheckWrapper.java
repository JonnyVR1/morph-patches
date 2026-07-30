package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.User;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserCheckWrapper extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usercheckwrapper";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean checked;

    @NonNull
    @ProtobufIndex(index = 1)
    public User user;
    public static ProtobufAdapter<UserCheckWrapper> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserCheckWrapper>() { // from class: com.p1.mobile.putong.core.data.UserCheckWrapper.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserCheckWrapper userCheckWrapper) {
            User user = userCheckWrapper.user;
            int iL = (user != null ? CodedOutputByteBufferNano.l(1, user, User.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.b(2, userCheckWrapper.checked);
            ((MessageNano) userCheckWrapper).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserCheckWrapper m16106parse(nb5 nb5Var) throws IOException {
            UserCheckWrapper userCheckWrapper = new UserCheckWrapper();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userCheckWrapper.user != null) {
                        break;
                    }
                    userCheckWrapper.user = User.new_();
                    break;
                }
                if (iU == 10) {
                    userCheckWrapper.user = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 16) {
                        if (userCheckWrapper.user != null) {
                            break;
                        }
                        userCheckWrapper.user = User.new_();
                        return userCheckWrapper;
                    }
                    userCheckWrapper.checked = nb5Var.g();
                }
            }
            return userCheckWrapper;
        }

        public void serialize(UserCheckWrapper userCheckWrapper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            User user = userCheckWrapper.user;
            if (user != null) {
                codedOutputByteBufferNano.K(1, user, User.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(2, userCheckWrapper.checked);
        }
    };
    public static JsonAdapter<UserCheckWrapper> JSON_ADAPTER = new ObjectJsonAdapter<UserCheckWrapper>() { // from class: com.p1.mobile.putong.core.data.UserCheckWrapper.2
        public Class getDataClass() {
            return UserCheckWrapper.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserCheckWrapper m16107newInstance() {
            return new UserCheckWrapper();
        }

        public boolean parseField(UserCheckWrapper userCheckWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("user")) {
                userCheckWrapper.user = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(UserCheckWrapper userCheckWrapper, JsonGenerator jsonGenerator) throws IOException {
            if (userCheckWrapper.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(userCheckWrapper.user, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("checked", userCheckWrapper.checked);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserCheckWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserCheckWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserCheckWrapper new_() {
        UserCheckWrapper userCheckWrapper = new UserCheckWrapper();
        userCheckWrapper.nullCheck();
        return userCheckWrapper;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserCheckWrapper m16105clone() {
        UserCheckWrapper userCheckWrapper = new UserCheckWrapper();
        User user = this.user;
        if (user != null) {
            userCheckWrapper.user = user.clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        User user = this.user;
        int iHashCode = ((i2 + (user != null ? user.hashCode() : 0)) * 41) + (this.checked ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.user == null) {
            this.user = User.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
