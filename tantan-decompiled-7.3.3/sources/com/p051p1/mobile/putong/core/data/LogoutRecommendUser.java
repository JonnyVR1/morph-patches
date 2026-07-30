package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
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
public class LogoutRecommendUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "logoutrecommenduser";

    @ProtobufIndex(index = 5)
    public int age;

    @NonNull
    @ProtobufIndex(index = 4)
    public String avatar;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21178id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<LogoutRecommendUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<LogoutRecommendUser>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LogoutRecommendUser logoutRecommendUser) {
            String str = logoutRecommendUser.f21178id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = logoutRecommendUser.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = logoutRecommendUser.name;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = logoutRecommendUser.avatar;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(5, logoutRecommendUser.age);
            logoutRecommendUser.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LogoutRecommendUser parse(nc5 nc5Var) throws IOException {
            LogoutRecommendUser logoutRecommendUser = new LogoutRecommendUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (logoutRecommendUser.f21178id == null) {
                        logoutRecommendUser.f21178id = "";
                    }
                    if (logoutRecommendUser.type == null) {
                        logoutRecommendUser.type = "";
                    }
                    if (logoutRecommendUser.name == null) {
                        logoutRecommendUser.name = "";
                    }
                    if (logoutRecommendUser.avatar != null) {
                        break;
                    }
                    logoutRecommendUser.avatar = "";
                    break;
                }
                if (iM162497u == 10) {
                    logoutRecommendUser.f21178id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    logoutRecommendUser.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    logoutRecommendUser.name = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    logoutRecommendUser.avatar = nc5Var.m162495s();
                } else {
                    if (iM162497u != 40) {
                        if (logoutRecommendUser.f21178id == null) {
                            logoutRecommendUser.f21178id = "";
                        }
                        if (logoutRecommendUser.type == null) {
                            logoutRecommendUser.type = "";
                        }
                        if (logoutRecommendUser.name == null) {
                            logoutRecommendUser.name = "";
                        }
                        if (logoutRecommendUser.avatar != null) {
                            break;
                        }
                        logoutRecommendUser.avatar = "";
                        return logoutRecommendUser;
                    }
                    logoutRecommendUser.age = nc5Var.m162486j();
                }
            }
            return logoutRecommendUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LogoutRecommendUser logoutRecommendUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = logoutRecommendUser.f21178id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = logoutRecommendUser.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = logoutRecommendUser.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = logoutRecommendUser.avatar;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17305G(5, logoutRecommendUser.age);
        }
    };
    public static JsonAdapter<LogoutRecommendUser> JSON_ADAPTER = new ObjectJsonAdapter<LogoutRecommendUser>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LogoutRecommendUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LogoutRecommendUser newInstance() {
            return new LogoutRecommendUser();
        }

        public boolean parseField(LogoutRecommendUser logoutRecommendUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    logoutRecommendUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "id":
                    logoutRecommendUser.f21178id = jsonParser.getValueAsString();
                    return false;
                case "age":
                    logoutRecommendUser.age = jsonParser.getValueAsInt();
                    return true;
                case "name":
                    logoutRecommendUser.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    logoutRecommendUser.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LogoutRecommendUser logoutRecommendUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                    return true;
                case "id":
                    return false;
                case "age":
                case "name":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(logoutRecommendUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LogoutRecommendUser logoutRecommendUser, JsonGenerator jsonGenerator) throws IOException {
            String str = logoutRecommendUser.f21178id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = logoutRecommendUser.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = logoutRecommendUser.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = logoutRecommendUser.avatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("avatar", str4);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, logoutRecommendUser.age);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LogoutRecommendUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LogoutRecommendUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LogoutRecommendUser new_() {
        LogoutRecommendUser logoutRecommendUser = new LogoutRecommendUser();
        logoutRecommendUser.nullCheck();
        return logoutRecommendUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LogoutRecommendUser mo225055clone() {
        LogoutRecommendUser logoutRecommendUser = new LogoutRecommendUser();
        logoutRecommendUser.f21178id = this.f21178id;
        logoutRecommendUser.type = this.type;
        logoutRecommendUser.name = this.name;
        logoutRecommendUser.avatar = this.avatar;
        logoutRecommendUser.age = this.age;
        return logoutRecommendUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogoutRecommendUser)) {
            return false;
        }
        LogoutRecommendUser logoutRecommendUser = (LogoutRecommendUser) obj;
        return ValueObject.util_equals(this.f21178id, logoutRecommendUser.f21178id) && ValueObject.util_equals(this.type, logoutRecommendUser.type) && ValueObject.util_equals(this.name, logoutRecommendUser.name) && ValueObject.util_equals(this.avatar, logoutRecommendUser.avatar) && this.age == logoutRecommendUser.age;
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
        String str = this.f21178id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.avatar;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.age;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21178id == null) {
            this.f21178id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.name == null) {
            this.name = "";
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
