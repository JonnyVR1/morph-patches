package com.p000p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.mrf0;
import l.nb5;
import l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserPrivilege extends DbObject<UserPrivilege> implements Cloneable, Serializable {
    public static final String TYPE = "userprivilege";

    @NonNull
    @ProtobufIndex(index = 51)
    public UserPrivilegeContent content;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;
    public static ProtobufAdapter<UserPrivilege> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserPrivilege>() { // from class: com.p1.mobile.putong.core.data.UserPrivilege.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserPrivilege userPrivilege) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) userPrivilege)._id);
            String str = ((DbObject) userPrivilege).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            UserPrivilegeContent userPrivilegeContent = userPrivilege.content;
            if (userPrivilegeContent != null) {
                iJ += CodedOutputByteBufferNano.l(51, userPrivilegeContent, UserPrivilegeContent.PROTOBUF_ADAPTER);
            }
            ((MessageNano) userPrivilege).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserPrivilege m16152parse(nb5 nb5Var) throws IOException {
            UserPrivilege userPrivilege = new UserPrivilege();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userPrivilege.content != null) {
                        break;
                    }
                    userPrivilege.content = UserPrivilegeContent.new_();
                    break;
                }
                if (iU == 8) {
                    ((DbObject) userPrivilege)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) userPrivilege).id = nb5Var.s();
                } else {
                    if (iU != 410) {
                        if (userPrivilege.content != null) {
                            break;
                        }
                        userPrivilege.content = UserPrivilegeContent.new_();
                        return userPrivilege;
                    }
                    userPrivilege.content = (UserPrivilegeContent) nb5Var.l(UserPrivilegeContent.PROTOBUF_ADAPTER);
                }
            }
            return userPrivilege;
        }

        public void serialize(UserPrivilege userPrivilege, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) userPrivilege)._id);
            String str = ((DbObject) userPrivilege).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            UserPrivilegeContent userPrivilegeContent = userPrivilege.content;
            if (userPrivilegeContent != null) {
                codedOutputByteBufferNano.K(51, userPrivilegeContent, UserPrivilegeContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserPrivilege> JSON_ADAPTER = new ObjectJsonAdapter<UserPrivilege>() { // from class: com.p1.mobile.putong.core.data.UserPrivilege.2
        public Class getDataClass() {
            return UserPrivilege.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserPrivilege m16155newInstance() {
            return new UserPrivilege();
        }

        public boolean parseField(UserPrivilege userPrivilege, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                ((DbObject) userPrivilege).id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals(Content.TYPE)) {
                return false;
            }
            userPrivilege.content = (UserPrivilegeContent) UserPrivilegeContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserPrivilege userPrivilege, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals(Content.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(userPrivilege, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(UserPrivilege userPrivilege, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) userPrivilege).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (userPrivilege.content != null) {
                jsonGenerator.writeFieldName(Content.TYPE);
                UserPrivilegeContent.JSON_ADAPTER.serialize(userPrivilege.content, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserPrivilege) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserPrivilege) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<UserPrivilege> _ID = new LongColumn<UserPrivilege>("_id") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.3
        public Long get(UserPrivilege userPrivilege) {
            return Long.valueOf(((DbObject) userPrivilege)._id);
        }

        public void set(UserPrivilege userPrivilege, Long l2) {
            ((DbObject) userPrivilege)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<UserPrivilege> f187ID = new StringColumn<UserPrivilege>("id_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.4
        public String get(UserPrivilege userPrivilege) {
            return ((DbObject) userPrivilege).id;
        }

        public void set(UserPrivilege userPrivilege, String str) {
            ((DbObject) userPrivilege).id = str;
        }
    };
    public static final LongColumn<UserPrivilege> CONTENT_EXPIREDTIME = new LongColumn<UserPrivilege>("content_expiredTime_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.5
        public Long get(UserPrivilege userPrivilege) {
            return Long.valueOf(userPrivilege.content.expiredTime);
        }

        public void set(UserPrivilege userPrivilege, Long l2) {
            userPrivilege.content.expiredTime = l2.longValue();
        }
    };
    public static final BooleanColumn<UserPrivilege> CONTENT_INEXPERIENCE = new BooleanColumn<UserPrivilege>("content_inExperience_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.6
        public Boolean get(UserPrivilege userPrivilege) {
            return Boolean.valueOf(userPrivilege.content.inExperience);
        }

        public void set(UserPrivilege userPrivilege, Boolean bool) {
            userPrivilege.content.inExperience = bool.booleanValue();
        }
    };
    public static final IntegerColumn<UserPrivilege> CONTENT_REMAINING = new IntegerColumn<UserPrivilege>("content_remaining_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.7
        public Integer get(UserPrivilege userPrivilege) {
            return Integer.valueOf(userPrivilege.content.remaining);
        }

        public void set(UserPrivilege userPrivilege, Integer num) {
            userPrivilege.content.remaining = num.intValue();
        }
    };
    public static final BooleanColumn<UserPrivilege> CONTENT_UNLIMIT = new BooleanColumn<UserPrivilege>("content_unlimit_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.8
        public Boolean get(UserPrivilege userPrivilege) {
            return Boolean.valueOf(userPrivilege.content.unlimit);
        }

        public void set(UserPrivilege userPrivilege, Boolean bool) {
            userPrivilege.content.unlimit = bool.booleanValue();
        }
    };
    public static final LongColumn<UserPrivilege> CONTENT_BEGINTIME = new LongColumn<UserPrivilege>("content_beginTime_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.9
        public Long get(UserPrivilege userPrivilege) {
            return Long.valueOf(userPrivilege.content.beginTime);
        }

        public void set(UserPrivilege userPrivilege, Long l2) {
            userPrivilege.content.beginTime = l2.longValue();
        }
    };
    public static final IntegerColumn<UserPrivilege> CONTENT_REFRESHMAXREMAINING = new IntegerColumn<UserPrivilege>("content_refreshMaxRemaining_c") { // from class: com.p1.mobile.putong.core.data.UserPrivilege.10
        public Integer get(UserPrivilege userPrivilege) {
            return Integer.valueOf(userPrivilege.content.refreshMaxRemaining);
        }

        public void set(UserPrivilege userPrivilege, Integer num) {
            userPrivilege.content.refreshMaxRemaining = num.intValue();
        }
    };
    public static mrf0<UserPrivilege> DB_ADAPTER = new mrf0<UserPrivilege>() { // from class: com.p1.mobile.putong.core.data.UserPrivilege.11
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.d + " (_id INTEGER PRIMARY KEY,id_c TEXT,content_expiredTime_c INTEGER,content_inExperience_c INTEGER,content_remaining_c INTEGER,content_unlimit_c INTEGER,content_beginTime_c INTEGER,content_refreshMaxRemaining_c INTEGER)";
        }

        public Class getDataClass() {
            return UserPrivilege.class;
        }

        /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
        public UserPrivilege m16153init() {
            UserPrivilege userPrivilege = new UserPrivilege();
            if (userPrivilege.content == null) {
                userPrivilege.content = UserPrivilegeContent.new_();
            }
            return userPrivilege;
        }

        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public UserPrivilege m16154read(Cursor cursor, int i) {
            if (i == 0) {
                ((mrf0) this).readIndex = 0;
            }
            UserPrivilege userPrivilege = new UserPrivilege();
            try {
                userPrivilege.content = new UserPrivilegeContent();
                ((DbObject) userPrivilege)._id = cursor.getLong(i);
                int i2 = i + 1;
                ((DbObject) userPrivilege).id = cursor.isNull(i2) ? null : cursor.getString(i2);
                userPrivilege.content.expiredTime = cursor.getLong(i + 2);
                userPrivilege.content.inExperience = cursor.getInt(i + 3) == 1;
                userPrivilege.content.remaining = cursor.getInt(i + 4);
                userPrivilege.content.unlimit = cursor.getInt(i + 5) == 1;
                userPrivilege.content.beginTime = cursor.getLong(i + 6);
                userPrivilege.content.refreshMaxRemaining = cursor.getInt(i + 7);
                ((mrf0) this).readIndex = i + 8;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (userPrivilege.content == null) {
                userPrivilege.content = UserPrivilegeContent.new_();
            }
            return userPrivilege;
        }

        public void write(UserPrivilege userPrivilege, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) userPrivilege).id);
                DbObject.cvPut(contentValues, "content_expiredTime_c", Long.valueOf(userPrivilege.content.expiredTime));
                DbObject.cvPut(contentValues, "content_inExperience_c", Integer.valueOf(userPrivilege.content.inExperience ? 1 : 0));
                DbObject.cvPut(contentValues, "content_remaining_c", Integer.valueOf(userPrivilege.content.remaining));
                DbObject.cvPut(contentValues, "content_unlimit_c", Integer.valueOf(userPrivilege.content.unlimit ? 1 : 0));
                DbObject.cvPut(contentValues, "content_beginTime_c", Long.valueOf(userPrivilege.content.beginTime));
                DbObject.cvPut(contentValues, "content_refreshMaxRemaining_c", Integer.valueOf(userPrivilege.content.refreshMaxRemaining));
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static UserPrivilege new_() {
        UserPrivilege userPrivilege = new UserPrivilege();
        userPrivilege.nullCheck();
        return userPrivilege;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserPrivilege m16151clone() {
        UserPrivilege userPrivilege = new UserPrivilege();
        ((DbObject) userPrivilege)._id = ((DbObject) this)._id;
        ((DbObject) userPrivilege).id = ((DbObject) this).id;
        UserPrivilegeContent userPrivilegeContent = this.content;
        if (userPrivilegeContent != null) {
            userPrivilege.content = userPrivilegeContent.m16157clone();
        }
        return userPrivilege;
    }

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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        UserPrivilegeContent userPrivilegeContent = this.content;
        int iHashCode2 = iHashCode + (userPrivilegeContent != null ? userPrivilegeContent.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(UserPrivilege userPrivilege) {
        if (!shouldMergeData() || equals(userPrivilege)) {
            return;
        }
        if (!isFieldParsed(Content.TYPE)) {
            this.content = userPrivilege.content;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.content == null) {
            this.content = UserPrivilegeContent.new_();
        }
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
