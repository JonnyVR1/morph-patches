package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class UserGreetInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usergreetinfo";

    @ProtobufIndex(index = 2)
    public boolean canGreet;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<UserGreetInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserGreetInfo>() { // from class: com.p1.mobile.putong.core.data.UserGreetInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserGreetInfo userGreetInfo) {
            String str = userGreetInfo.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, userGreetInfo.canGreet);
            userGreetInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserGreetInfo parse(nb5 nb5Var) throws IOException {
            UserGreetInfo userGreetInfo = new UserGreetInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userGreetInfo.userId != null) {
                        break;
                    }
                    userGreetInfo.userId = "";
                    break;
                }
                if (iM158752u == 10) {
                    userGreetInfo.userId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (userGreetInfo.userId != null) {
                            break;
                        }
                        userGreetInfo.userId = "";
                        return userGreetInfo;
                    }
                    userGreetInfo.canGreet = nb5Var.m158738g();
                }
            }
            return userGreetInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserGreetInfo userGreetInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userGreetInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, userGreetInfo.canGreet);
        }
    };
    public static JsonAdapter<UserGreetInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserGreetInfo>() { // from class: com.p1.mobile.putong.core.data.UserGreetInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserGreetInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserGreetInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserGreetInfo userGreetInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = userGreetInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("canGreet", userGreetInfo.canGreet);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserGreetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserGreetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserGreetInfo new_() {
        UserGreetInfo userGreetInfo = new UserGreetInfo();
        userGreetInfo.nullCheck();
        return userGreetInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserGreetInfo mo223809clone() {
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
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.canGreet ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
