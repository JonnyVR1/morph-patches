package com.p046p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class UserSimpleInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usersimpleinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String nickName;
    public static ProtobufAdapter<UserSimpleInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserSimpleInfo>() { // from class: com.p1.mobile.putong.feed.data.UserSimpleInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserSimpleInfo userSimpleInfo) {
            String str = userSimpleInfo.nickName;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = userSimpleInfo.avatar;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            userSimpleInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserSimpleInfo parse(nb5 nb5Var) throws IOException {
            UserSimpleInfo userSimpleInfo = new UserSimpleInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userSimpleInfo.nickName == null) {
                        userSimpleInfo.nickName = "";
                    }
                    if (userSimpleInfo.avatar != null) {
                        break;
                    }
                    userSimpleInfo.avatar = "";
                    break;
                }
                if (iM158752u == 10) {
                    userSimpleInfo.nickName = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (userSimpleInfo.nickName == null) {
                            userSimpleInfo.nickName = "";
                        }
                        if (userSimpleInfo.avatar != null) {
                            break;
                        }
                        userSimpleInfo.avatar = "";
                        return userSimpleInfo;
                    }
                    userSimpleInfo.avatar = nb5Var.m158750s();
                }
            }
            return userSimpleInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserSimpleInfo userSimpleInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userSimpleInfo.nickName;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = userSimpleInfo.avatar;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<UserSimpleInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserSimpleInfo>() { // from class: com.p1.mobile.putong.feed.data.UserSimpleInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserSimpleInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserSimpleInfo newInstance() {
            return new UserSimpleInfo();
        }

        public boolean parseField(UserSimpleInfo userSimpleInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("avatar")) {
                userSimpleInfo.avatar = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("nickName")) {
                return false;
            }
            userSimpleInfo.nickName = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(UserSimpleInfo userSimpleInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("avatar") || str.equals("nickName")) {
                return true;
            }
            return super.parseFieldCheck(userSimpleInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserSimpleInfo userSimpleInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = userSimpleInfo.nickName;
            if (str != null) {
                jsonGenerator.writeStringField("nickName", str);
            }
            String str2 = userSimpleInfo.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatar", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSimpleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSimpleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserSimpleInfo new_() {
        UserSimpleInfo userSimpleInfo = new UserSimpleInfo();
        userSimpleInfo.nullCheck();
        return userSimpleInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserSimpleInfo mo223809clone() {
        UserSimpleInfo userSimpleInfo = new UserSimpleInfo();
        userSimpleInfo.nickName = this.nickName;
        userSimpleInfo.avatar = this.avatar;
        return userSimpleInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserSimpleInfo)) {
            return false;
        }
        UserSimpleInfo userSimpleInfo = (UserSimpleInfo) obj;
        return ValueObject.util_equals(this.nickName, userSimpleInfo.nickName) && ValueObject.util_equals(this.avatar, userSimpleInfo.avatar);
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
        String str = this.nickName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatar;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nickName == null) {
            this.nickName = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
