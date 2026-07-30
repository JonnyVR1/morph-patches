package com.p046p1.mobile.putong.data;

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
public class UserLiveCallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userlivecallinfo";

    @ProtobufIndex(index = 1)
    public boolean ongoingCall;
    public static ProtobufAdapter<UserLiveCallInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveCallInfo>() { // from class: com.p1.mobile.putong.data.UserLiveCallInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserLiveCallInfo userLiveCallInfo) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, userLiveCallInfo.ongoingCall);
            userLiveCallInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserLiveCallInfo parse(nb5 nb5Var) throws IOException {
            UserLiveCallInfo userLiveCallInfo = new UserLiveCallInfo();
            while (nb5Var.m158752u() == 8) {
                userLiveCallInfo.ongoingCall = nb5Var.m158738g();
            }
            return userLiveCallInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserLiveCallInfo userLiveCallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, userLiveCallInfo.ongoingCall);
        }
    };
    public static JsonAdapter<UserLiveCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveCallInfo>() { // from class: com.p1.mobile.putong.data.UserLiveCallInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserLiveCallInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserLiveCallInfo newInstance() {
            return new UserLiveCallInfo();
        }

        public boolean parseField(UserLiveCallInfo userLiveCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("ongoingCall")) {
                return false;
            }
            userLiveCallInfo.ongoingCall = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(UserLiveCallInfo userLiveCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("ongoingCall")) {
                return true;
            }
            return super.parseFieldCheck(userLiveCallInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserLiveCallInfo userLiveCallInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("ongoingCall", userLiveCallInfo.ongoingCall);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveCallInfo new_() {
        UserLiveCallInfo userLiveCallInfo = new UserLiveCallInfo();
        userLiveCallInfo.nullCheck();
        return userLiveCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserLiveCallInfo mo223809clone() {
        UserLiveCallInfo userLiveCallInfo = new UserLiveCallInfo();
        userLiveCallInfo.ongoingCall = this.ongoingCall;
        return userLiveCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UserLiveCallInfo) && this.ongoingCall == ((UserLiveCallInfo) obj).ongoingCall;
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
        int i2 = (i * 41) + (this.ongoingCall ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
