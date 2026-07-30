package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UserMomentSettings extends ValueObject<UserMomentSettings> implements Cloneable, Serializable {
    public static final String TYPE = "usermomentsettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public Boolean autoLike;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;
    public static ProtobufAdapter<UserMomentSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserMomentSettings>() { // from class: com.p1.mobile.putong.data.UserMomentSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserMomentSettings userMomentSettings) {
            Boolean bool = userMomentSettings.autoLike;
            int iB = bool != null ? CodedOutputByteBufferNano.b(1, bool.booleanValue()) : 0;
            ((MessageNano) userMomentSettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserMomentSettings m19199parse(nb5 nb5Var) throws IOException {
            UserMomentSettings userMomentSettings = new UserMomentSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userMomentSettings.autoLike != null) {
                        break;
                    }
                    userMomentSettings.autoLike = Boolean.FALSE;
                    break;
                }
                if (iU != 8) {
                    if (userMomentSettings.autoLike != null) {
                        break;
                    }
                    userMomentSettings.autoLike = Boolean.FALSE;
                    return userMomentSettings;
                }
                userMomentSettings.autoLike = Boolean.valueOf(nb5Var.g());
            }
            return userMomentSettings;
        }

        public void serialize(UserMomentSettings userMomentSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Boolean bool = userMomentSettings.autoLike;
            if (bool != null) {
                codedOutputByteBufferNano.A(1, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<UserMomentSettings> JSON_ADAPTER = new ObjectJsonAdapter<UserMomentSettings>() { // from class: com.p1.mobile.putong.data.UserMomentSettings.2
        public Class getDataClass() {
            return UserMomentSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserMomentSettings mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserMomentSettings userMomentSettings, JsonGenerator jsonGenerator) throws IOException {
            Boolean bool = userMomentSettings.autoLike;
            if (bool != null) {
                jsonGenerator.writeBooleanField("autoLike", bool.booleanValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserMomentSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserMomentSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserMomentSettings new_() {
        UserMomentSettings userMomentSettings = new UserMomentSettings();
        userMomentSettings.nullCheck();
        return userMomentSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserMomentSettings m19198clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Boolean bool = this.autoLike;
        int iHashCode = i2 + (bool != null ? bool.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(UserMomentSettings userMomentSettings) {
        if (!shouldMergeData() || equals(userMomentSettings)) {
            return;
        }
        if (!isFieldParsed("autoLike")) {
            this.autoLike = userMomentSettings.autoLike;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        if (this.autoLike == null) {
            this.autoLike = Boolean.FALSE;
        }
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
