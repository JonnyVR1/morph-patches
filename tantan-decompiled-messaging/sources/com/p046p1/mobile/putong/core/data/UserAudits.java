package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.UserStatus;
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
public class UserAudits extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "useraudits";

    @NonNull
    @ProtobufIndex(index = 2)
    public String audit;

    @NonNull
    @ProtobufIndex(index = 3)
    public Reason reason;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<UserAudits> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserAudits>() { // from class: com.p1.mobile.putong.core.data.UserAudits.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserAudits userAudits) {
            String str = userAudits.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = userAudits.audit;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            Reason reason = userAudits.reason;
            if (reason != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, reason, Reason.PROTOBUF_ADAPTER);
            }
            userAudits.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserAudits parse(nb5 nb5Var) throws IOException {
            UserAudits userAudits = new UserAudits();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userAudits.userId == null) {
                        userAudits.userId = "";
                    }
                    if (userAudits.audit == null) {
                        userAudits.audit = "";
                    }
                    if (userAudits.reason != null) {
                        break;
                    }
                    userAudits.reason = Reason.new_();
                    break;
                }
                if (iM158752u == 10) {
                    userAudits.userId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    userAudits.audit = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (userAudits.userId == null) {
                            userAudits.userId = "";
                        }
                        if (userAudits.audit == null) {
                            userAudits.audit = "";
                        }
                        if (userAudits.reason != null) {
                            break;
                        }
                        userAudits.reason = Reason.new_();
                        return userAudits;
                    }
                    userAudits.reason = (Reason) nb5Var.m158743l(Reason.PROTOBUF_ADAPTER);
                }
            }
            return userAudits;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserAudits userAudits, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userAudits.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = userAudits.audit;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            Reason reason = userAudits.reason;
            if (reason != null) {
                codedOutputByteBufferNano.m17254K(3, reason, Reason.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserAudits> JSON_ADAPTER = new ObjectJsonAdapter<UserAudits>() { // from class: com.p1.mobile.putong.core.data.UserAudits.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserAudits.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserAudits newInstance() {
            return new UserAudits();
        }

        public boolean parseField(UserAudits userAudits, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reason":
                    userAudits.reason = Reason.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    userAudits.userId = jsonParser.getValueAsString();
                    return true;
                case "audit":
                    userAudits.audit = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserAudits userAudits, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reason":
                case "userId":
                case "audit":
                    return true;
                default:
                    return super.parseFieldCheck(userAudits, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserAudits userAudits, JsonGenerator jsonGenerator) throws IOException {
            String str = userAudits.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = userAudits.audit;
            if (str2 != null) {
                jsonGenerator.writeStringField(UserStatus.audit, str2);
            }
            if (userAudits.reason != null) {
                jsonGenerator.writeFieldName(Reason.TYPE);
                Reason.JSON_ADAPTER.serialize(userAudits.reason, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserAudits) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserAudits) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserAudits new_() {
        UserAudits userAudits = new UserAudits();
        userAudits.nullCheck();
        return userAudits;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserAudits mo223809clone() {
        UserAudits userAudits = new UserAudits();
        userAudits.userId = this.userId;
        userAudits.audit = this.audit;
        Reason reason = this.reason;
        if (reason != null) {
            userAudits.reason = reason.mo223809clone();
        }
        return userAudits;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserAudits)) {
            return false;
        }
        UserAudits userAudits = (UserAudits) obj;
        return ValueObject.util_equals(this.userId, userAudits.userId) && ValueObject.util_equals(this.audit, userAudits.audit) && ValueObject.util_equals(this.reason, userAudits.reason);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.audit;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Reason reason = this.reason;
        int iHashCode3 = iHashCode2 + (reason != null ? reason.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.audit == null) {
            this.audit = "";
        }
        if (this.reason == null) {
            this.reason = Reason.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
