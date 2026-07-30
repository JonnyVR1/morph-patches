package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class UserUpVipSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userupvipsettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean isUpvip;
    public static ProtobufAdapter<UserUpVipSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserUpVipSettings>() { // from class: com.p1.mobile.putong.data.UserUpVipSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserUpVipSettings userUpVipSettings) {
            Boolean bool = userUpVipSettings.isUpvip;
            int iM17275b = bool != null ? CodedOutputByteBufferNano.m17275b(1, bool.booleanValue()) : 0;
            userUpVipSettings.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserUpVipSettings parse(nc5 nc5Var) throws IOException {
            UserUpVipSettings userUpVipSettings = new UserUpVipSettings();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userUpVipSettings.isUpvip != null) {
                        break;
                    }
                    userUpVipSettings.isUpvip = Boolean.FALSE;
                    break;
                }
                if (iM162497u != 8) {
                    if (userUpVipSettings.isUpvip != null) {
                        break;
                    }
                    userUpVipSettings.isUpvip = Boolean.FALSE;
                    return userUpVipSettings;
                }
                userUpVipSettings.isUpvip = Boolean.valueOf(nc5Var.m162483g());
            }
            return userUpVipSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserUpVipSettings userUpVipSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userUpVipSettings.isUpvip;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<UserUpVipSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserUpVipSettings>() { // from class: com.p1.mobile.putong.data.UserUpVipSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserUpVipSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserUpVipSettings newInstance() {
            return new UserUpVipSettings();
        }

        public boolean parseField(UserUpVipSettings userUpVipSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isUpvip")) {
                return false;
            }
            userUpVipSettings.isUpvip = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }

        public boolean parseFieldCheck(UserUpVipSettings userUpVipSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isUpvip")) {
                return true;
            }
            return super.parseFieldCheck(userUpVipSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserUpVipSettings userUpVipSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userUpVipSettings.isUpvip;
            if (bool != null) {
                jsonGenerator.writeBooleanField("isUpvip", bool.booleanValue());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserUpVipSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserUpVipSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserUpVipSettings new_() {
        UserUpVipSettings userUpVipSettings = new UserUpVipSettings();
        userUpVipSettings.nullCheck();
        return userUpVipSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserUpVipSettings mo225055clone() {
        UserUpVipSettings userUpVipSettings = new UserUpVipSettings();
        userUpVipSettings.isUpvip = this.isUpvip;
        return userUpVipSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserUpVipSettings) {
            return ValueObject.util_equals(this.isUpvip, ((UserUpVipSettings) obj).isUpvip);
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
        Boolean bool = this.isUpvip;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.isUpvip == null) {
            this.isUpvip = Boolean.FALSE;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
