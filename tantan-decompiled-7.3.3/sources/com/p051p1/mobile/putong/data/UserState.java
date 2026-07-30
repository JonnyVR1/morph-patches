package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes12.dex */
public class UserState extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userstate";

    @Nullable
    @ProtobufIndex(index = 1)
    public UserStateContent jailed;

    @Nullable
    @ProtobufIndex(index = 3)
    public JailedBusiness jailedBusiness;

    @Nullable
    @ProtobufIndex(index = 2)
    public UserStateContent restricted;
    public static ProtobufAdapter<UserState> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserState>() { // from class: com.p1.mobile.putong.data.UserState.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserState userState) {
            UserStateContent userStateContent = userState.jailed;
            int iM17285l = userStateContent != null ? CodedOutputByteBufferNano.m17285l(1, userStateContent, UserStateContent.PROTOBUF_ADAPTER) : 0;
            UserStateContent userStateContent2 = userState.restricted;
            if (userStateContent2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, userStateContent2, UserStateContent.PROTOBUF_ADAPTER);
            }
            JailedBusiness jailedBusiness = userState.jailedBusiness;
            if (jailedBusiness != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, jailedBusiness, JailedBusiness.PROTOBUF_ADAPTER);
            }
            userState.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserState parse(nc5 nc5Var) throws IOException {
            UserState userState = new UserState();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    userState.jailed = (UserStateContent) nc5Var.m162488l(UserStateContent.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    userState.restricted = (UserStateContent) nc5Var.m162488l(UserStateContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
                        return userState;
                    }
                    userState.jailedBusiness = (JailedBusiness) nc5Var.m162488l(JailedBusiness.PROTOBUF_ADAPTER);
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserState userState, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            UserStateContent userStateContent = userState.jailed;
            if (userStateContent != null) {
                codedOutputByteBufferNano.m17309K(1, userStateContent, UserStateContent.PROTOBUF_ADAPTER);
            }
            UserStateContent userStateContent2 = userState.restricted;
            if (userStateContent2 != null) {
                codedOutputByteBufferNano.m17309K(2, userStateContent2, UserStateContent.PROTOBUF_ADAPTER);
            }
            JailedBusiness jailedBusiness = userState.jailedBusiness;
            if (jailedBusiness != null) {
                codedOutputByteBufferNano.m17309K(3, jailedBusiness, JailedBusiness.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserState> JSON_ADAPTER = new ObjectJsonAdapter<UserState>() { // from class: com.p1.mobile.putong.data.UserState.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserState.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserState newInstance() {
            return new UserState();
        }

        public boolean parseField(UserState userState, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "restricted":
                    userState.restricted = UserStateContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "jailed":
                    userState.jailed = UserStateContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "jailedBusiness":
                    userState.jailedBusiness = JailedBusiness.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserState userState, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "restricted":
                case "jailed":
                case "jailedBusiness":
                    return true;
                default:
                    return super.parseFieldCheck(userState, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserState userState, JsonGenerator jsonGenerator) throws IOException {
            if (userState.jailed != null) {
                jsonGenerator.writeFieldName("jailed");
                UserStateContent.JSON_ADAPTER.serialize(userState.jailed, jsonGenerator, true);
            }
            if (userState.restricted != null) {
                jsonGenerator.writeFieldName("restricted");
                UserStateContent.JSON_ADAPTER.serialize(userState.restricted, jsonGenerator, true);
            }
            if (userState.jailedBusiness != null) {
                jsonGenerator.writeFieldName("jailedBusiness");
                JailedBusiness.JSON_ADAPTER.serialize(userState.jailedBusiness, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserState new_() {
        UserState userState = new UserState();
        userState.nullCheck();
        return userState;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserState mo225055clone() {
        UserState userState = new UserState();
        UserStateContent userStateContent = this.jailed;
        if (userStateContent != null) {
            userState.jailed = userStateContent.mo225055clone();
        }
        UserStateContent userStateContent2 = this.restricted;
        if (userStateContent2 != null) {
            userState.restricted = userStateContent2.mo225055clone();
        }
        JailedBusiness jailedBusiness = this.jailedBusiness;
        if (jailedBusiness != null) {
            userState.jailedBusiness = jailedBusiness.mo225055clone();
        }
        return userState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserState)) {
            return false;
        }
        UserState userState = (UserState) obj;
        return ValueObject.util_equals(this.jailed, userState.jailed) && ValueObject.util_equals(this.restricted, userState.restricted) && ValueObject.util_equals(this.jailedBusiness, userState.jailedBusiness);
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
        UserStateContent userStateContent = this.jailed;
        int iHashCode = (i2 + (userStateContent != null ? userStateContent.hashCode() : 0)) * 41;
        UserStateContent userStateContent2 = this.restricted;
        int iHashCode2 = (iHashCode + (userStateContent2 != null ? userStateContent2.hashCode() : 0)) * 41;
        JailedBusiness jailedBusiness = this.jailedBusiness;
        int iHashCode3 = iHashCode2 + (jailedBusiness != null ? jailedBusiness.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
