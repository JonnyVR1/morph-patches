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
public class LogoutRecommendUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "logoutrecommenduser";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int age;

    @NonNull
    @ProtobufIndex(index = 4)
    public String avatar;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f98id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<LogoutRecommendUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<LogoutRecommendUser>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LogoutRecommendUser logoutRecommendUser) {
            String str = logoutRecommendUser.f98id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = logoutRecommendUser.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = logoutRecommendUser.name;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = logoutRecommendUser.avatar;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, logoutRecommendUser.age);
            ((MessageNano) logoutRecommendUser).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LogoutRecommendUser m13977parse(nb5 nb5Var) throws IOException {
            LogoutRecommendUser logoutRecommendUser = new LogoutRecommendUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (logoutRecommendUser.f98id == null) {
                        logoutRecommendUser.f98id = "";
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
                if (iU == 10) {
                    logoutRecommendUser.f98id = nb5Var.s();
                } else if (iU == 18) {
                    logoutRecommendUser.type = nb5Var.s();
                } else if (iU == 26) {
                    logoutRecommendUser.name = nb5Var.s();
                } else if (iU == 34) {
                    logoutRecommendUser.avatar = nb5Var.s();
                } else {
                    if (iU != 40) {
                        if (logoutRecommendUser.f98id == null) {
                            logoutRecommendUser.f98id = "";
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
                    logoutRecommendUser.age = nb5Var.j();
                }
            }
            return logoutRecommendUser;
        }

        public void serialize(LogoutRecommendUser logoutRecommendUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = logoutRecommendUser.f98id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = logoutRecommendUser.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = logoutRecommendUser.name;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = logoutRecommendUser.avatar;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.G(5, logoutRecommendUser.age);
        }
    };
    public static JsonAdapter<LogoutRecommendUser> JSON_ADAPTER = new ObjectJsonAdapter<LogoutRecommendUser>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendUser.2
        public Class getDataClass() {
            return LogoutRecommendUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LogoutRecommendUser m13978newInstance() {
            return new LogoutRecommendUser();
        }

        public boolean parseField(LogoutRecommendUser logoutRecommendUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    logoutRecommendUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "id":
                    logoutRecommendUser.f98id = jsonParser.getValueAsString();
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

        public void serializeFields(LogoutRecommendUser logoutRecommendUser, JsonGenerator jsonGenerator) throws IOException {
            String str = logoutRecommendUser.f98id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = logoutRecommendUser.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = logoutRecommendUser.name;
            if (str3 != null) {
                jsonGenerator.writeStringField("name", str3);
            }
            String str4 = logoutRecommendUser.avatar;
            if (str4 != null) {
                jsonGenerator.writeStringField(ReminderAction.avatar, str4);
            }
            jsonGenerator.writeNumberField("age", logoutRecommendUser.age);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LogoutRecommendUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LogoutRecommendUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LogoutRecommendUser new_() {
        LogoutRecommendUser logoutRecommendUser = new LogoutRecommendUser();
        logoutRecommendUser.nullCheck();
        return logoutRecommendUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LogoutRecommendUser m13976clone() {
        LogoutRecommendUser logoutRecommendUser = new LogoutRecommendUser();
        logoutRecommendUser.f98id = this.f98id;
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
        return ValueObject.util_equals(this.f98id, logoutRecommendUser.f98id) && ValueObject.util_equals(this.type, logoutRecommendUser.type) && ValueObject.util_equals(this.name, logoutRecommendUser.name) && ValueObject.util_equals(this.avatar, logoutRecommendUser.avatar) && this.age == logoutRecommendUser.age;
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
        String str = this.f98id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.avatar;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.age;
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f98id == null) {
            this.f98id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
