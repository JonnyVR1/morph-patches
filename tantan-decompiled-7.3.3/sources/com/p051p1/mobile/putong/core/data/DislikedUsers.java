package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.User;
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
public class DislikedUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dislikedusers";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21129id;

    @NonNull
    @ProtobufIndex(index = 2)
    public User userInfo;
    public static ProtobufAdapter<DislikedUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<DislikedUsers>() { // from class: com.p1.mobile.putong.core.data.DislikedUsers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DislikedUsers dislikedUsers) {
            String str = dislikedUsers.f21129id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            User user = dislikedUsers.userInfo;
            if (user != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, user, User.PROTOBUF_ADAPTER);
            }
            dislikedUsers.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DislikedUsers parse(nc5 nc5Var) throws IOException {
            DislikedUsers dislikedUsers = new DislikedUsers();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (dislikedUsers.f21129id == null) {
                        dislikedUsers.f21129id = "";
                    }
                    if (dislikedUsers.userInfo != null) {
                        break;
                    }
                    dislikedUsers.userInfo = User.new_();
                    break;
                }
                if (iM162497u == 10) {
                    dislikedUsers.f21129id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (dislikedUsers.f21129id == null) {
                            dislikedUsers.f21129id = "";
                        }
                        if (dislikedUsers.userInfo != null) {
                            break;
                        }
                        dislikedUsers.userInfo = User.new_();
                        return dislikedUsers;
                    }
                    dislikedUsers.userInfo = (User) nc5Var.m162488l(User.PROTOBUF_ADAPTER);
                }
            }
            return dislikedUsers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DislikedUsers dislikedUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = dislikedUsers.f21129id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            User user = dislikedUsers.userInfo;
            if (user != null) {
                codedOutputByteBufferNano.m17309K(2, user, User.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<DislikedUsers> JSON_ADAPTER = new ObjectJsonAdapter<DislikedUsers>() { // from class: com.p1.mobile.putong.core.data.DislikedUsers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DislikedUsers.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DislikedUsers newInstance() {
            return new DislikedUsers();
        }

        public boolean parseField(DislikedUsers dislikedUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userInfo")) {
                dislikedUsers.userInfo = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            dislikedUsers.f21129id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(DislikedUsers dislikedUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userInfo")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(dislikedUsers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DislikedUsers dislikedUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = dislikedUsers.f21129id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (dislikedUsers.userInfo != null) {
                jsonGenerator.writeFieldName("userInfo");
                User.JSON_ADAPTER.serialize(dislikedUsers.userInfo, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DislikedUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DislikedUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DislikedUsers new_() {
        DislikedUsers dislikedUsers = new DislikedUsers();
        dislikedUsers.nullCheck();
        return dislikedUsers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DislikedUsers mo225055clone() {
        DislikedUsers dislikedUsers = new DislikedUsers();
        dislikedUsers.f21129id = this.f21129id;
        User user = this.userInfo;
        if (user != null) {
            dislikedUsers.userInfo = user.mo225055clone();
        }
        return dislikedUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DislikedUsers)) {
            return false;
        }
        DislikedUsers dislikedUsers = (DislikedUsers) obj;
        return ValueObject.util_equals(this.f21129id, dislikedUsers.f21129id) && ValueObject.util_equals(this.userInfo, dislikedUsers.userInfo);
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
        String str = this.f21129id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        User user = this.userInfo;
        int iHashCode2 = iHashCode + (user != null ? user.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21129id == null) {
            this.f21129id = "";
        }
        if (this.userInfo == null) {
            this.userInfo = User.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
