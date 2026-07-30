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
public class UserSubscriptionSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usersubscriptionsettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean refuseSMS;
    public static ProtobufAdapter<UserSubscriptionSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserSubscriptionSettings>() { // from class: com.p1.mobile.putong.data.UserSubscriptionSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserSubscriptionSettings userSubscriptionSettings) {
            Boolean bool = userSubscriptionSettings.refuseSMS;
            int iM17275b = bool != null ? CodedOutputByteBufferNano.m17275b(1, bool.booleanValue()) : 0;
            userSubscriptionSettings.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserSubscriptionSettings parse(nc5 nc5Var) throws IOException {
            UserSubscriptionSettings userSubscriptionSettings = new UserSubscriptionSettings();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userSubscriptionSettings.refuseSMS != null) {
                        break;
                    }
                    userSubscriptionSettings.refuseSMS = Boolean.FALSE;
                    break;
                }
                if (iM162497u != 8) {
                    if (userSubscriptionSettings.refuseSMS != null) {
                        break;
                    }
                    userSubscriptionSettings.refuseSMS = Boolean.FALSE;
                    return userSubscriptionSettings;
                }
                userSubscriptionSettings.refuseSMS = Boolean.valueOf(nc5Var.m162483g());
            }
            return userSubscriptionSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserSubscriptionSettings userSubscriptionSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userSubscriptionSettings.refuseSMS;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<UserSubscriptionSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserSubscriptionSettings>() { // from class: com.p1.mobile.putong.data.UserSubscriptionSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserSubscriptionSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserSubscriptionSettings newInstance() {
            return new UserSubscriptionSettings();
        }

        public boolean parseField(UserSubscriptionSettings userSubscriptionSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("refuseSMS")) {
                return false;
            }
            userSubscriptionSettings.refuseSMS = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }

        public boolean parseFieldCheck(UserSubscriptionSettings userSubscriptionSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("refuseSMS")) {
                return true;
            }
            return super.parseFieldCheck(userSubscriptionSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserSubscriptionSettings userSubscriptionSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userSubscriptionSettings.refuseSMS;
            if (bool != null) {
                jsonGenerator.writeBooleanField("refuseSMS", bool.booleanValue());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSubscriptionSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSubscriptionSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserSubscriptionSettings new_() {
        UserSubscriptionSettings userSubscriptionSettings = new UserSubscriptionSettings();
        userSubscriptionSettings.nullCheck();
        return userSubscriptionSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserSubscriptionSettings mo225055clone() {
        UserSubscriptionSettings userSubscriptionSettings = new UserSubscriptionSettings();
        userSubscriptionSettings.refuseSMS = this.refuseSMS;
        return userSubscriptionSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserSubscriptionSettings) {
            return ValueObject.util_equals(this.refuseSMS, ((UserSubscriptionSettings) obj).refuseSMS);
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
        Boolean bool = this.refuseSMS;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.refuseSMS == null) {
            this.refuseSMS = Boolean.FALSE;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
