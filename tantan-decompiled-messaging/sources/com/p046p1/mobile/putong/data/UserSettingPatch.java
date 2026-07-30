package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class UserSettingPatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usersettingpatch";

    @NonNull
    @ProtobufIndex(index = 2)
    public SettingGroups settingGroups;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<UserSettingPatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserSettingPatch>() { // from class: com.p1.mobile.putong.data.UserSettingPatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserSettingPatch userSettingPatch) {
            String str = userSettingPatch.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            SettingGroups settingGroups = userSettingPatch.settingGroups;
            if (settingGroups != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, settingGroups, SettingGroups.PROTOBUF_ADAPTER);
            }
            userSettingPatch.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserSettingPatch parse(nb5 nb5Var) throws IOException {
            UserSettingPatch userSettingPatch = new UserSettingPatch();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userSettingPatch.type == null) {
                        userSettingPatch.type = "";
                    }
                    if (userSettingPatch.settingGroups != null) {
                        break;
                    }
                    userSettingPatch.settingGroups = SettingGroups.new_();
                    break;
                }
                if (iM158752u == 10) {
                    userSettingPatch.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (userSettingPatch.type == null) {
                            userSettingPatch.type = "";
                        }
                        if (userSettingPatch.settingGroups != null) {
                            break;
                        }
                        userSettingPatch.settingGroups = SettingGroups.new_();
                        return userSettingPatch;
                    }
                    userSettingPatch.settingGroups = (SettingGroups) nb5Var.m158743l(SettingGroups.PROTOBUF_ADAPTER);
                }
            }
            return userSettingPatch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserSettingPatch userSettingPatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userSettingPatch.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            SettingGroups settingGroups = userSettingPatch.settingGroups;
            if (settingGroups != null) {
                codedOutputByteBufferNano.m17254K(2, settingGroups, SettingGroups.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserSettingPatch> JSON_ADAPTER = new ObjectJsonAdapter<UserSettingPatch>() { // from class: com.p1.mobile.putong.data.UserSettingPatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserSettingPatch.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserSettingPatch newInstance() {
            return new UserSettingPatch();
        }

        public boolean parseField(UserSettingPatch userSettingPatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("settingGroups")) {
                userSettingPatch.settingGroups = SettingGroups.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            userSettingPatch.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(UserSettingPatch userSettingPatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("settingGroups") || str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(userSettingPatch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserSettingPatch userSettingPatch, JsonGenerator jsonGenerator) throws IOException {
            String str = userSettingPatch.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (userSettingPatch.settingGroups != null) {
                jsonGenerator.writeFieldName("settingGroups");
                SettingGroups.JSON_ADAPTER.serialize(userSettingPatch.settingGroups, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSettingPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSettingPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserSettingPatch new_() {
        UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.nullCheck();
        return userSettingPatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserSettingPatch mo223809clone() {
        UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.type = this.type;
        SettingGroups settingGroups = this.settingGroups;
        if (settingGroups != null) {
            userSettingPatch.settingGroups = settingGroups.mo223809clone();
        }
        return userSettingPatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserSettingPatch)) {
            return false;
        }
        UserSettingPatch userSettingPatch = (UserSettingPatch) obj;
        return ValueObject.util_equals(this.type, userSettingPatch.type) && ValueObject.util_equals(this.settingGroups, userSettingPatch.settingGroups);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        SettingGroups settingGroups = this.settingGroups;
        int iHashCode2 = iHashCode + (settingGroups != null ? settingGroups.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.settingGroups == null) {
            this.settingGroups = SettingGroups.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
