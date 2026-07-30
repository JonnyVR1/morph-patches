package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class UserGreetInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usergreetinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean canGreet;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<UserGreetInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserGreetInfo>() { // from class: com.p1.mobile.putong.core.data.UserGreetInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserGreetInfo userGreetInfo) {
            String str = userGreetInfo.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, userGreetInfo.canGreet);
            ((MessageNano) userGreetInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserGreetInfo m16114parse(nb5 nb5Var) throws IOException {
            UserGreetInfo userGreetInfo = new UserGreetInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userGreetInfo.userId != null) {
                        break;
                    }
                    userGreetInfo.userId = "";
                    break;
                }
                if (iU == 10) {
                    userGreetInfo.userId = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (userGreetInfo.userId != null) {
                            break;
                        }
                        userGreetInfo.userId = "";
                        return userGreetInfo;
                    }
                    userGreetInfo.canGreet = nb5Var.g();
                }
            }
            return userGreetInfo;
        }

        public void serialize(UserGreetInfo userGreetInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userGreetInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, userGreetInfo.canGreet);
        }
    };
    public static JsonAdapter<UserGreetInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserGreetInfo>() { // from class: com.p1.mobile.putong.core.data.UserGreetInfo.2
        public Class getDataClass() {
            return UserGreetInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserGreetInfo m16115newInstance() {
            return new UserGreetInfo();
        }

        public boolean parseField(UserGreetInfo userGreetInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                userGreetInfo.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("canGreet")) {
                return false;
            }
            userGreetInfo.canGreet = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(UserGreetInfo userGreetInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("canGreet")) {
                return true;
            }
            return super.parseFieldCheck(userGreetInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(UserGreetInfo userGreetInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = userGreetInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("canGreet", userGreetInfo.canGreet);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserGreetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserGreetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserGreetInfo new_() {
        UserGreetInfo userGreetInfo = new UserGreetInfo();
        userGreetInfo.nullCheck();
        return userGreetInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserGreetInfo m16113clone() {
        UserGreetInfo userGreetInfo = new UserGreetInfo();
        userGreetInfo.userId = this.userId;
        userGreetInfo.canGreet = this.canGreet;
        return userGreetInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserGreetInfo)) {
            return false;
        }
        UserGreetInfo userGreetInfo = (UserGreetInfo) obj;
        return ValueObject.util_equals(this.userId, userGreetInfo.userId) && this.canGreet == userGreetInfo.canGreet;
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
        String str = this.userId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.canGreet ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
