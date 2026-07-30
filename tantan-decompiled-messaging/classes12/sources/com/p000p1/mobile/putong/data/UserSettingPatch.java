package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserSettingPatch userSettingPatch) {
            String str = userSettingPatch.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            SettingGroups settingGroups = userSettingPatch.settingGroups;
            if (settingGroups != null) {
                iO += CodedOutputByteBufferNano.l(2, settingGroups, SettingGroups.PROTOBUF_ADAPTER);
            }
            ((MessageNano) userSettingPatch).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserSettingPatch m19223parse(nb5 nb5Var) throws IOException {
            UserSettingPatch userSettingPatch = new UserSettingPatch();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userSettingPatch.type == null) {
                        userSettingPatch.type = "";
                    }
                    if (userSettingPatch.settingGroups != null) {
                        break;
                    }
                    userSettingPatch.settingGroups = SettingGroups.new_();
                    break;
                }
                if (iU == 10) {
                    userSettingPatch.type = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (userSettingPatch.type == null) {
                            userSettingPatch.type = "";
                        }
                        if (userSettingPatch.settingGroups != null) {
                            break;
                        }
                        userSettingPatch.settingGroups = SettingGroups.new_();
                        return userSettingPatch;
                    }
                    userSettingPatch.settingGroups = (SettingGroups) nb5Var.l(SettingGroups.PROTOBUF_ADAPTER);
                }
            }
            return userSettingPatch;
        }

        public void serialize(UserSettingPatch userSettingPatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userSettingPatch.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            SettingGroups settingGroups = userSettingPatch.settingGroups;
            if (settingGroups != null) {
                codedOutputByteBufferNano.K(2, settingGroups, SettingGroups.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserSettingPatch> JSON_ADAPTER = new ObjectJsonAdapter<UserSettingPatch>() { // from class: com.p1.mobile.putong.data.UserSettingPatch.2
        public Class getDataClass() {
            return UserSettingPatch.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserSettingPatch mo17830newInstance() {
            return new UserSettingPatch();
        }

        public boolean parseField(UserSettingPatch userSettingPatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("settingGroups")) {
                userSettingPatch.settingGroups = (SettingGroups) SettingGroups.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSettingPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSettingPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserSettingPatch new_() {
        UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.nullCheck();
        return userSettingPatch;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserSettingPatch m19222clone() {
        UserSettingPatch userSettingPatch = new UserSettingPatch();
        userSettingPatch.type = this.type;
        SettingGroups settingGroups = this.settingGroups;
        if (settingGroups != null) {
            userSettingPatch.settingGroups = settingGroups.m18946clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        SettingGroups settingGroups = this.settingGroups;
        int iHashCode2 = iHashCode + (settingGroups != null ? settingGroups.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.settingGroups == null) {
            this.settingGroups = SettingGroups.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
