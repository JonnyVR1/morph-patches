package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.UserRights;
import com.p000p1.mobile.putong.core.data.UserRightsData;
import com.p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserRightsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userrightsdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<UserRights> rights;
    public static ProtobufAdapter<UserRightsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserRightsData>() { // from class: com.p1.mobile.putong.core.data.UserRightsData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserRightsData userRightsData) {
            List<UserRights> list = userRightsData.rights;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, UserRights.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<UserRights> list2 = userRightsData.rights;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, UserRights.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) userRightsData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserRightsData m16164parse(nb5 nb5Var) throws IOException {
            UserRightsData userRightsData = new UserRightsData();
            List list = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userRightsData.rights == null && list != null) {
                        userRightsData.rights = UserRights.oldEnumCovertList(list);
                    }
                    if (userRightsData.rights != null) {
                        break;
                    }
                    userRightsData.rights = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (userRightsData.rights == null && list != null) {
                            userRightsData.rights = UserRights.oldEnumCovertList(list);
                        }
                        if (userRightsData.rights != null) {
                            break;
                        }
                        userRightsData.rights = new ArrayList();
                        return userRightsData;
                    }
                    userRightsData.rights = (List) nb5Var.l(UserRights.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userRightsData;
        }

        public void serialize(UserRightsData userRightsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<UserRights> list = userRightsData.rights;
            if (list != null) {
                codedOutputByteBufferNano.K(1, UserRights.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<UserRights> list2 = userRightsData.rights;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, UserRights.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserRightsData> JSON_ADAPTER = new ObjectJsonAdapter<UserRightsData>() { // from class: com.p1.mobile.putong.core.data.UserRightsData.2
        public Class getDataClass() {
            return UserRightsData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserRightsData m16165newInstance() {
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

        public void serializeFields(UserRightsData userRightsData, JsonGenerator jsonGenerator) throws IOException {
            if (userRightsData.rights != null) {
                jsonGenerator.writeFieldName("rights");
                JsonAdapter.serializeArray(userRightsData.rights, jsonGenerator, UserRights.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserRightsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserRightsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UserRights m694a(UserRights userRights) {
        return userRights;
    }

    public static UserRightsData new_() {
        UserRightsData userRightsData = new UserRightsData();
        userRightsData.nullCheck();
        return userRightsData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserRightsData m16163clone() {
        UserRightsData userRightsData = new UserRightsData();
        List<UserRights> list = this.rights;
        if (list != null) {
            userRightsData.rights = ValueObject.util_map(list, new w9j() { // from class: l.x8k0
                public final Object call(Object obj) {
                    return UserRightsData.m694a((UserRights) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<UserRights> list = this.rights;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.rights == null) {
            this.rights = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
