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
public class UserIdType extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "useridtype";

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<UserIdType> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserIdType>() { // from class: com.p1.mobile.putong.core.data.UserIdType.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserIdType userIdType) {
            String str = userIdType.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            userIdType.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserIdType parse(nb5 nb5Var) throws IOException {
            UserIdType userIdType = new UserIdType();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userIdType.userId != null) {
                        break;
                    }
                    userIdType.userId = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (userIdType.userId != null) {
                        break;
                    }
                    userIdType.userId = "";
                    return userIdType;
                }
                userIdType.userId = nb5Var.m158750s();
            }
            return userIdType;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserIdType userIdType, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userIdType.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<UserIdType> JSON_ADAPTER = new ObjectJsonAdapter<UserIdType>() { // from class: com.p1.mobile.putong.core.data.UserIdType.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserIdType.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserIdType newInstance() {
            return new UserIdType();
        }

        public boolean parseField(UserIdType userIdType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userId")) {
                return false;
            }
            userIdType.userId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(UserIdType userIdType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId")) {
                return true;
            }
            return super.parseFieldCheck(userIdType, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserIdType userIdType, JsonGenerator jsonGenerator) throws IOException {
            String str = userIdType.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserIdType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserIdType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserIdType new_() {
        UserIdType userIdType = new UserIdType();
        userIdType.nullCheck();
        return userIdType;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserIdType mo223809clone() {
        UserIdType userIdType = new UserIdType();
        userIdType.userId = this.userId;
        return userIdType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserIdType) {
            return ValueObject.util_equals(this.userId, ((UserIdType) obj).userId);
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
        String str = this.userId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
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
