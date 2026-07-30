package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class UserSVIPSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usersvipsettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean isSvip;
    public static ProtobufAdapter<UserSVIPSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserSVIPSettings>() { // from class: com.p1.mobile.putong.data.UserSVIPSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserSVIPSettings userSVIPSettings) {
            Boolean bool = userSVIPSettings.isSvip;
            int iM17220b = bool != null ? CodedOutputByteBufferNano.m17220b(1, bool.booleanValue()) : 0;
            userSVIPSettings.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserSVIPSettings parse(nb5 nb5Var) throws IOException {
            UserSVIPSettings userSVIPSettings = new UserSVIPSettings();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userSVIPSettings.isSvip != null) {
                        break;
                    }
                    userSVIPSettings.isSvip = Boolean.FALSE;
                    break;
                }
                if (iM158752u != 8) {
                    if (userSVIPSettings.isSvip != null) {
                        break;
                    }
                    userSVIPSettings.isSvip = Boolean.FALSE;
                    return userSVIPSettings;
                }
                userSVIPSettings.isSvip = Boolean.valueOf(nb5Var.m158738g());
            }
            return userSVIPSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserSVIPSettings userSVIPSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userSVIPSettings.isSvip;
            if (bool != null) {
                codedOutputByteBufferNano.m17244A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<UserSVIPSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserSVIPSettings>() { // from class: com.p1.mobile.putong.data.UserSVIPSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserSVIPSettings.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserSVIPSettings newInstance() {
            return new UserSVIPSettings();
        }

        public boolean parseField(UserSVIPSettings userSVIPSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isSvip")) {
                return false;
            }
            userSVIPSettings.isSvip = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }

        public boolean parseFieldCheck(UserSVIPSettings userSVIPSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isSvip")) {
                return true;
            }
            return super.parseFieldCheck(userSVIPSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserSVIPSettings userSVIPSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userSVIPSettings.isSvip;
            if (bool != null) {
                jsonGenerator.writeBooleanField("isSvip", bool.booleanValue());
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSVIPSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSVIPSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserSVIPSettings new_() {
        UserSVIPSettings userSVIPSettings = new UserSVIPSettings();
        userSVIPSettings.nullCheck();
        return userSVIPSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserSVIPSettings mo223809clone() {
        UserSVIPSettings userSVIPSettings = new UserSVIPSettings();
        userSVIPSettings.isSvip = this.isSvip;
        return userSVIPSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserSVIPSettings) {
            return ValueObject.util_equals(this.isSvip, ((UserSVIPSettings) obj).isSvip);
        }
        return false;
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
        Boolean bool = this.isSvip;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.isSvip == null) {
            this.isSvip = Boolean.FALSE;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
