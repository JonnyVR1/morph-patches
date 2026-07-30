package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;

/* JADX INFO: loaded from: classes10.dex */
public class UserPrivilege extends DbObject<UserPrivilege> implements Cloneable, Serializable {
    public static final String TYPE = "userprivilege";

    @NonNull
    @ProtobufIndex(index = 51)
    public UserPrivilegeContent content;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;
    public static ProtobufAdapter<UserPrivilege> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserPrivilege>() { // from class: com.p1.mobile.putong.core.data.UserPrivilege.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserPrivilege userPrivilege) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, userPrivilege._id);
            String str = userPrivilege.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            UserPrivilegeContent userPrivilegeContent = userPrivilege.content;
            if (userPrivilegeContent != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(51, userPrivilegeContent, UserPrivilegeContent.PROTOBUF_ADAPTER);
            }
            userPrivilege.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserPrivilege parse(nb5 nb5Var) throws IOException {
            UserPrivilege userPrivilege = new UserPrivilege();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userPrivilege.content != null) {
                        break;
                    }
                    userPrivilege.content = UserPrivilegeContent.new_();
                    break;
                }
                if (iM158752u == 8) {
                    userPrivilege._id = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    userPrivilege.f56011id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 410) {
                        if (userPrivilege.content != null) {
                            break;
                        }
                        userPrivilege.content = UserPrivilegeContent.new_();
                        return userPrivilege;
                    }
                    userPrivilege.content = (UserPrivilegeContent) nb5Var.m158743l(UserPrivilegeContent.PROTOBUF_ADAPTER);
                }
            }
            return userPrivilege;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserPrivilege userPrivilege, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, userPrivilege._id);
            String str = userPrivilege.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            UserPrivilegeContent userPrivilegeContent = userPrivilege.content;
            if (userPrivilegeContent != null) {
                codedOutputByteBufferNano.m17254K(51, userPrivilegeContent, UserPrivilegeContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserPrivilege> JSON_ADAPTER = new ObjectJsonAdapter<UserPrivilege>() { // from class: com.p1.mobile.putong.core.data.UserPrivilege.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserPrivilege.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserPrivilege newInstance() {
            return new UserPrivilege();
        }

        public boolean parseField(UserPrivilege userPrivilege, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                userPrivilege.f56011id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("content")) {
                return false;
            }
            userPrivilege.content = UserPrivilegeContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserPrivilege userPrivilege, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("content")) {
                return true;
            }
            return super.parseFieldCheck(userPrivilege, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserPrivilege userPrivilege, JsonGenerator jsonGenerator) throws IOException {
            String str = userPrivilege.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (userPrivilege.content != null) {
                jsonGenerator.writeFieldName("content");
                UserPrivilegeContent.JSON_ADAPTER.serialize(userPrivilege.content, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserPrivilege) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserPrivilege) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<UserPrivilege> _ID = new LongColumn<UserPrivilege>("_id") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(UserPrivilege userPrivilege) {
            return Long.valueOf(userPrivilege._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(UserPrivilege userPrivilege, Long l2) {
            userPrivilege._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<UserPrivilege> f20525ID = new StringColumn<UserPrivilege>("id_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(UserPrivilege userPrivilege) {
            return userPrivilege.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(UserPrivilege userPrivilege, String str) {
            userPrivilege.f56011id = str;
        }
    };
    public static final LongColumn<UserPrivilege> CONTENT_EXPIREDTIME = new LongColumn<UserPrivilege>("content_expiredTime_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.5
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(UserPrivilege userPrivilege) {
            return Long.valueOf(userPrivilege.content.expiredTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(UserPrivilege userPrivilege, Long l2) {
            userPrivilege.content.expiredTime = l2.longValue();
        }
    };
    public static final BooleanColumn<UserPrivilege> CONTENT_INEXPERIENCE = new BooleanColumn<UserPrivilege>("content_inExperience_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.6
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(UserPrivilege userPrivilege) {
            return Boolean.valueOf(userPrivilege.content.inExperience);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(UserPrivilege userPrivilege, Boolean bool) {
            userPrivilege.content.inExperience = bool.booleanValue();
        }
    };
    public static final IntegerColumn<UserPrivilege> CONTENT_REMAINING = new IntegerColumn<UserPrivilege>("content_remaining_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.7
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(UserPrivilege userPrivilege) {
            return Integer.valueOf(userPrivilege.content.remaining);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(UserPrivilege userPrivilege, Integer num) {
            userPrivilege.content.remaining = num.intValue();
        }
    };
    public static final BooleanColumn<UserPrivilege> CONTENT_UNLIMIT = new BooleanColumn<UserPrivilege>("content_unlimit_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.8
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(UserPrivilege userPrivilege) {
            return Boolean.valueOf(userPrivilege.content.unlimit);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(UserPrivilege userPrivilege, Boolean bool) {
            userPrivilege.content.unlimit = bool.booleanValue();
        }
    };
    public static final LongColumn<UserPrivilege> CONTENT_BEGINTIME = new LongColumn<UserPrivilege>("content_beginTime_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.9
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(UserPrivilege userPrivilege) {
            return Long.valueOf(userPrivilege.content.beginTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(UserPrivilege userPrivilege, Long l2) {
            userPrivilege.content.beginTime = l2.longValue();
        }
    };
    public static final IntegerColumn<UserPrivilege> CONTENT_REFRESHMAXREMAINING = new IntegerColumn<UserPrivilege>("content_refreshMaxRemaining_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.10
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(UserPrivilege userPrivilege) {
            return Integer.valueOf(userPrivilege.content.refreshMaxRemaining);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(UserPrivilege userPrivilege, Integer num) {
            userPrivilege.content.refreshMaxRemaining = num.intValue();
        }
    };
    public static mrf0<UserPrivilege> DB_ADAPTER = new mrf0<UserPrivilege>() { // from class: com.p1.mobile.putong.core.data.UserPrivilege.11
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,content_expiredTime_c INTEGER,content_inExperience_c INTEGER,content_remaining_c INTEGER,content_unlimit_c INTEGER,content_beginTime_c INTEGER,content_refreshMaxRemaining_c INTEGER)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return UserPrivilege.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public UserPrivilege init() {
            UserPrivilege userPrivilege = new UserPrivilege();
            if (userPrivilege.content == null) {
                userPrivilege.content = UserPrivilegeContent.new_();
            }
            return userPrivilege;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public UserPrivilege read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            UserPrivilege userPrivilege = new UserPrivilege();
            try {
                userPrivilege.content = new UserPrivilegeContent();
                userPrivilege._id = cursor.getLong(i);
                int i2 = i + 1;
                userPrivilege.f56011id = cursor.isNull(i2) ? null : cursor.getString(i2);
                userPrivilege.content.expiredTime = cursor.getLong(i + 2);
                userPrivilege.content.inExperience = cursor.getInt(i + 3) == 1;
                userPrivilege.content.remaining = cursor.getInt(i + 4);
                userPrivilege.content.unlimit = cursor.getInt(i + 5) == 1;
                userPrivilege.content.beginTime = cursor.getLong(i + 6);
                userPrivilege.content.refreshMaxRemaining = cursor.getInt(i + 7);
                this.readIndex = i + 8;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (userPrivilege.content == null) {
                userPrivilege.content = UserPrivilegeContent.new_();
            }
            return userPrivilege;
        }

        @Override // p149l.mrf0
        public void write(UserPrivilege userPrivilege, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", userPrivilege.f56011id);
                DbObject.cvPut(contentValues, "content_expiredTime_c", Long.valueOf(userPrivilege.content.expiredTime));
                DbObject.cvPut(contentValues, "content_inExperience_c", Integer.valueOf(userPrivilege.content.inExperience ? 1 : 0));
                DbObject.cvPut(contentValues, "content_remaining_c", Integer.valueOf(userPrivilege.content.remaining));
                DbObject.cvPut(contentValues, "content_unlimit_c", Integer.valueOf(userPrivilege.content.unlimit ? 1 : 0));
                DbObject.cvPut(contentValues, "content_beginTime_c", Long.valueOf(userPrivilege.content.beginTime));
                DbObject.cvPut(contentValues, "content_refreshMaxRemaining_c", Integer.valueOf(userPrivilege.content.refreshMaxRemaining));
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    public static UserPrivilege new_() {
        UserPrivilege userPrivilege = new UserPrivilege();
        userPrivilege.nullCheck();
        return userPrivilege;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserPrivilege mo223809clone() {
        UserPrivilege userPrivilege = new UserPrivilege();
        userPrivilege._id = this._id;
        userPrivilege.f56011id = this.f56011id;
        UserPrivilegeContent userPrivilegeContent = this.content;
        if (userPrivilegeContent != null) {
            userPrivilege.content = userPrivilegeContent.mo223809clone();
        }
        return userPrivilege;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserPrivilege)) {
            return false;
        }
        UserPrivilege userPrivilege = (UserPrivilege) obj;
        if (super.equals(obj)) {
            return ValueObject.util_equals(this.content, userPrivilege.content);
        }
        return false;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        UserPrivilegeContent userPrivilegeContent = this.content;
        int iHashCode2 = iHashCode + (userPrivilegeContent != null ? userPrivilegeContent.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(UserPrivilege userPrivilege) {
        if (!shouldMergeData() || equals(userPrivilege)) {
            return;
        }
        if (!isFieldParsed("content")) {
            this.content = userPrivilege.content;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.content == null) {
            this.content = UserPrivilegeContent.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public UserPrivilege subtract(UserPrivilege userPrivilege) {
        UserPrivilege userPrivilege2 = new UserPrivilege();
        if (!ValueObject.util_equals(this.content, userPrivilege.content)) {
            userPrivilege2.content = this.content;
        }
        if (userPrivilege2.equals(new UserPrivilege())) {
            return null;
        }
        return userPrivilege2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
