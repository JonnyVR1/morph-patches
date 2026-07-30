package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Reason;
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
public class UserStateContent extends ValueObject implements Cloneable, Serializable {
    public static final String BANNED_CODE = "60009";
    public static final String TYPE = "userstatecontent";

    @ProtobufIndex(index = 1)
    public boolean active;

    @NonNull
    @ProtobufIndex(index = 4)
    public String code;

    @ProtobufIndex(index = 3)
    public double expireTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String reason;
    public static ProtobufAdapter<UserStateContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserStateContent>() { // from class: com.p1.mobile.putong.data.UserStateContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserStateContent userStateContent) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, userStateContent.active);
            String str = userStateContent.reason;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17222d = iM17220b + CodedOutputByteBufferNano.m17222d(3, userStateContent.expireTime);
            String str2 = userStateContent.code;
            if (str2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            userStateContent.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserStateContent parse(nb5 nb5Var) throws IOException {
            UserStateContent userStateContent = new UserStateContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userStateContent.reason == null) {
                        userStateContent.reason = "";
                    }
                    if (userStateContent.code != null) {
                        break;
                    }
                    userStateContent.code = "";
                    break;
                }
                if (iM158752u == 8) {
                    userStateContent.active = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    userStateContent.reason = nb5Var.m158750s();
                } else if (iM158752u == 25) {
                    userStateContent.expireTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 34) {
                        if (userStateContent.reason == null) {
                            userStateContent.reason = "";
                        }
                        if (userStateContent.code != null) {
                            break;
                        }
                        userStateContent.code = "";
                        return userStateContent;
                    }
                    userStateContent.code = nb5Var.m158750s();
                }
            }
            return userStateContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserStateContent userStateContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, userStateContent.active);
            String str = userStateContent.reason;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17246C(3, userStateContent.expireTime);
            String str2 = userStateContent.code;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
        }
    };
    public static JsonAdapter<UserStateContent> JSON_ADAPTER = new ObjectJsonAdapter<UserStateContent>() { // from class: com.p1.mobile.putong.data.UserStateContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserStateContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserStateContent newInstance() {
            return new UserStateContent();
        }

        public boolean parseField(UserStateContent userStateContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "active":
                    userStateContent.active = jsonParser.getValueAsBoolean();
                    return true;
                case "reason":
                    userStateContent.reason = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    userStateContent.expireTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "code":
                    userStateContent.code = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserStateContent userStateContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "active":
                case "reason":
                case "expireTime":
                case "code":
                    return true;
                default:
                    return super.parseFieldCheck(userStateContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserStateContent userStateContent, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Active.TYPE, userStateContent.active);
            String str = userStateContent.reason;
            if (str != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str);
            }
            jsonGenerator.writeFieldName("expireTime");
            Converter.API_TIME.serialize(Double.valueOf(userStateContent.expireTime), jsonGenerator, true);
            String str2 = userStateContent.code;
            if (str2 != null) {
                jsonGenerator.writeStringField("code", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserStateContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserStateContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserStateContent new_() {
        UserStateContent userStateContent = new UserStateContent();
        userStateContent.nullCheck();
        return userStateContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserStateContent mo223809clone() {
        UserStateContent userStateContent = new UserStateContent();
        userStateContent.active = this.active;
        userStateContent.reason = this.reason;
        userStateContent.expireTime = this.expireTime;
        userStateContent.code = this.code;
        return userStateContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserStateContent)) {
            return false;
        }
        UserStateContent userStateContent = (UserStateContent) obj;
        return this.active == userStateContent.active && ValueObject.util_equals(this.reason, userStateContent.reason) && this.expireTime == userStateContent.expireTime && ValueObject.util_equals(this.code, userStateContent.code);
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
        int i2 = ((i * 41) + (this.active ? 1231 : 1237)) * 41;
        String str = this.reason;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expireTime);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.code;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.reason == null) {
            this.reason = "";
        }
        if (this.code == null) {
            this.code = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
