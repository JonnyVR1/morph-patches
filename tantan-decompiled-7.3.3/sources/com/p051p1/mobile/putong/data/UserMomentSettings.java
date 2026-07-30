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
import java.util.HashSet;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class UserMomentSettings extends ValueObject<UserMomentSettings> implements Cloneable, Serializable {
    public static final String TYPE = "usermomentsettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean autoLike;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;
    public static ProtobufAdapter<UserMomentSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserMomentSettings>() { // from class: com.p1.mobile.putong.data.UserMomentSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserMomentSettings userMomentSettings) {
            Boolean bool = userMomentSettings.autoLike;
            int iM17275b = bool != null ? CodedOutputByteBufferNano.m17275b(1, bool.booleanValue()) : 0;
            userMomentSettings.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserMomentSettings parse(nc5 nc5Var) throws IOException {
            UserMomentSettings userMomentSettings = new UserMomentSettings();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userMomentSettings.autoLike != null) {
                        break;
                    }
                    userMomentSettings.autoLike = Boolean.FALSE;
                    break;
                }
                if (iM162497u != 8) {
                    if (userMomentSettings.autoLike != null) {
                        break;
                    }
                    userMomentSettings.autoLike = Boolean.FALSE;
                    return userMomentSettings;
                }
                userMomentSettings.autoLike = Boolean.valueOf(nc5Var.m162483g());
            }
            return userMomentSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserMomentSettings userMomentSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userMomentSettings.autoLike;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<UserMomentSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserMomentSettings>() { // from class: com.p1.mobile.putong.data.UserMomentSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserMomentSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserMomentSettings newInstance() {
            return new UserMomentSettings();
        }

        public boolean parseField(UserMomentSettings userMomentSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("autoLike")) {
                return false;
            }
            userMomentSettings.autoLike = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }

        public boolean parseFieldCheck(UserMomentSettings userMomentSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("autoLike")) {
                return true;
            }
            return super.parseFieldCheck(userMomentSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserMomentSettings userMomentSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userMomentSettings.autoLike;
            if (bool != null) {
                jsonGenerator.writeBooleanField("autoLike", bool.booleanValue());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserMomentSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserMomentSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserMomentSettings new_() {
        UserMomentSettings userMomentSettings = new UserMomentSettings();
        userMomentSettings.nullCheck();
        return userMomentSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserMomentSettings mo225055clone() {
        UserMomentSettings userMomentSettings = new UserMomentSettings();
        userMomentSettings.autoLike = this.autoLike;
        return userMomentSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserMomentSettings) {
            return ValueObject.util_equals(this.autoLike, ((UserMomentSettings) obj).autoLike);
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
        Boolean bool = this.autoLike;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(UserMomentSettings userMomentSettings) {
        if (!shouldMergeData() || equals(userMomentSettings)) {
            return;
        }
        if (!isFieldParsed("autoLike")) {
            this.autoLike = userMomentSettings.autoLike;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.autoLike == null) {
            this.autoLike = Boolean.FALSE;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public UserMomentSettings subtract(UserMomentSettings userMomentSettings) {
        UserMomentSettings userMomentSettings2 = new UserMomentSettings();
        if (!ValueObject.util_equals(this.autoLike, userMomentSettings.autoLike)) {
            userMomentSettings2.autoLike = this.autoLike;
        }
        if (userMomentSettings2.equals(new UserMomentSettings())) {
            return null;
        }
        return userMomentSettings2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
