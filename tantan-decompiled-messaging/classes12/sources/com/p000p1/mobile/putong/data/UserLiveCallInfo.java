package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UserLiveCallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userlivecallinfo";

    @ProtobufIndex(index = 1)
    public boolean ongoingCall;
    public static ProtobufAdapter<UserLiveCallInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveCallInfo>() { // from class: com.p1.mobile.putong.data.UserLiveCallInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserLiveCallInfo userLiveCallInfo) {
            int iB = CodedOutputByteBufferNano.b(1, userLiveCallInfo.ongoingCall);
            ((MessageNano) userLiveCallInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserLiveCallInfo m19181parse(nb5 nb5Var) throws IOException {
            UserLiveCallInfo userLiveCallInfo = new UserLiveCallInfo();
            while (nb5Var.u() == 8) {
                userLiveCallInfo.ongoingCall = nb5Var.g();
            }
            return userLiveCallInfo;
        }

        public void serialize(UserLiveCallInfo userLiveCallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, userLiveCallInfo.ongoingCall);
        }
    };
    public static JsonAdapter<UserLiveCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveCallInfo>() { // from class: com.p1.mobile.putong.data.UserLiveCallInfo.2
        public Class getDataClass() {
            return UserLiveCallInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserLiveCallInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserLiveCallInfo userLiveCallInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("ongoingCall", userLiveCallInfo.ongoingCall);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveCallInfo new_() {
        UserLiveCallInfo userLiveCallInfo = new UserLiveCallInfo();
        userLiveCallInfo.nullCheck();
        return userLiveCallInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserLiveCallInfo m19180clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.ongoingCall ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
