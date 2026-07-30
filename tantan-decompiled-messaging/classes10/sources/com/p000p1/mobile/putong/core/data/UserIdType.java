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
public class UserIdType extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "useridtype";

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<UserIdType> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserIdType>() { // from class: com.p1.mobile.putong.core.data.UserIdType.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserIdType userIdType) {
            String str = userIdType.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) userIdType).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserIdType m16124parse(nb5 nb5Var) throws IOException {
            UserIdType userIdType = new UserIdType();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userIdType.userId != null) {
                        break;
                    }
                    userIdType.userId = "";
                    break;
                }
                if (iU != 10) {
                    if (userIdType.userId != null) {
                        break;
                    }
                    userIdType.userId = "";
                    return userIdType;
                }
                userIdType.userId = nb5Var.s();
            }
            return userIdType;
        }

        public void serialize(UserIdType userIdType, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userIdType.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<UserIdType> JSON_ADAPTER = new ObjectJsonAdapter<UserIdType>() { // from class: com.p1.mobile.putong.core.data.UserIdType.2
        public Class getDataClass() {
            return UserIdType.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserIdType m16125newInstance() {
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

        public void serializeFields(UserIdType userIdType, JsonGenerator jsonGenerator) throws IOException {
            String str = userIdType.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserIdType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserIdType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserIdType new_() {
        UserIdType userIdType = new UserIdType();
        userIdType.nullCheck();
        return userIdType;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserIdType m16123clone() {
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
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
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
