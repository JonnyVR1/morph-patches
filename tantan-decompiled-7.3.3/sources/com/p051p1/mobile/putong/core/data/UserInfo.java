package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class UserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userinfo";

    @ProtobufIndex(index = 1)
    public int poplevel;
    public static ProtobufAdapter<UserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserInfo>() { // from class: com.p1.mobile.putong.core.data.UserInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserInfo userInfo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, userInfo.poplevel);
            userInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserInfo parse(nc5 nc5Var) throws IOException {
            UserInfo userInfo = new UserInfo();
            while (nc5Var.m162497u() == 8) {
                userInfo.poplevel = nc5Var.m162486j();
            }
            return userInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserInfo userInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, userInfo.poplevel);
        }
    };
    public static JsonAdapter<UserInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserInfo>() { // from class: com.p1.mobile.putong.core.data.UserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserInfo newInstance() {
            return new UserInfo();
        }

        public boolean parseField(UserInfo userInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("poplevel")) {
                return false;
            }
            userInfo.poplevel = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(UserInfo userInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("poplevel")) {
                return true;
            }
            return super.parseFieldCheck(userInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserInfo userInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("poplevel", userInfo.poplevel);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserInfo new_() {
        UserInfo userInfo = new UserInfo();
        userInfo.nullCheck();
        return userInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserInfo mo225055clone() {
        UserInfo userInfo = new UserInfo();
        userInfo.poplevel = this.poplevel;
        return userInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UserInfo) && this.poplevel == ((UserInfo) obj).poplevel;
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
        int i2 = (i * 41) + this.poplevel;
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
