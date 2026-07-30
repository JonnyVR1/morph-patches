package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.UserRights;
import com.p046p1.mobile.putong.core.data.UserRightsData;
import com.p046p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class UserRightsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userrightsdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<UserRights> rights;
    public static ProtobufAdapter<UserRightsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserRightsData>() { // from class: com.p1.mobile.putong.core.data.UserRightsData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserRightsData userRightsData) {
            List<UserRights> list = userRightsData.rights;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, UserRights.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<UserRights> list2 = userRightsData.rights;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, UserRights.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            userRightsData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserRightsData parse(nb5 nb5Var) throws IOException {
            UserRightsData userRightsData = new UserRightsData();
            List list = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userRightsData.rights == null && list != null) {
                        userRightsData.rights = UserRights.oldEnumCovertList(list);
                    }
                    if (userRightsData.rights != null) {
                        break;
                    }
                    userRightsData.rights = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    list = (List) nb5Var.m158743l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (userRightsData.rights == null && list != null) {
                            userRightsData.rights = UserRights.oldEnumCovertList(list);
                        }
                        if (userRightsData.rights != null) {
                            break;
                        }
                        userRightsData.rights = new ArrayList();
                        return userRightsData;
                    }
                    userRightsData.rights = (List) nb5Var.m158743l(UserRights.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userRightsData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserRightsData userRightsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<UserRights> list = userRightsData.rights;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, UserRights.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserRights> list2 = userRightsData.rights;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, UserRights.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserRightsData> JSON_ADAPTER = new ObjectJsonAdapter<UserRightsData>() { // from class: com.p1.mobile.putong.core.data.UserRightsData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserRightsData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserRightsData newInstance() {
            return new UserRightsData();
        }

        public boolean parseField(UserRightsData userRightsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("rights")) {
                return false;
            }
            userRightsData.rights = JsonAdapter.parseArray(jsonParser, UserRights.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserRightsData userRightsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("rights")) {
                return true;
            }
            return super.parseFieldCheck(userRightsData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserRightsData userRightsData, JsonGenerator jsonGenerator) throws IOException {
            if (userRightsData.rights != null) {
                jsonGenerator.writeFieldName("rights");
                JsonAdapter.serializeArray(userRightsData.rights, jsonGenerator, UserRights.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserRightsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserRightsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UserRights m35892a(UserRights userRights) {
        return userRights;
    }

    public static UserRightsData new_() {
        UserRightsData userRightsData = new UserRightsData();
        userRightsData.nullCheck();
        return userRightsData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserRightsData mo223809clone() {
        UserRightsData userRightsData = new UserRightsData();
        List<UserRights> list = this.rights;
        if (list != null) {
            userRightsData.rights = ValueObject.util_map(list, new w9j() { // from class: l.x8k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserRightsData.m35892a((UserRights) obj);
                }
            });
        }
        return userRightsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserRightsData) {
            return ValueObject.util_equals(this.rights, ((UserRightsData) obj).rights);
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
        List<UserRights> list = this.rights;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.rights == null) {
            this.rights = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
