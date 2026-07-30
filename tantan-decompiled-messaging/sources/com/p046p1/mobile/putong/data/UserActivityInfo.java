package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.UserActivityInfoItem;
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

/* JADX INFO: loaded from: classes12.dex */
public class UserActivityInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "useractivityinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<UserActivityInfoItem> activityInfos;

    @ProtobufIndex(index = 3)
    public boolean actorPrivilege;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<UserActivityInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserActivityInfo>() { // from class: com.p1.mobile.putong.data.UserActivityInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserActivityInfo userActivityInfo) {
            String str = userActivityInfo.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<UserActivityInfoItem> list = userActivityInfo.activityInfos;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, UserActivityInfoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, userActivityInfo.actorPrivilege);
            userActivityInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserActivityInfo parse(nb5 nb5Var) throws IOException {
            UserActivityInfo userActivityInfo = new UserActivityInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userActivityInfo.userId == null) {
                        userActivityInfo.userId = "";
                    }
                    if (userActivityInfo.activityInfos != null) {
                        break;
                    }
                    userActivityInfo.activityInfos = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    userActivityInfo.userId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    userActivityInfo.activityInfos = (List) nb5Var.m158743l(UserActivityInfoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 24) {
                        if (userActivityInfo.userId == null) {
                            userActivityInfo.userId = "";
                        }
                        if (userActivityInfo.activityInfos != null) {
                            break;
                        }
                        userActivityInfo.activityInfos = new ArrayList();
                        return userActivityInfo;
                    }
                    userActivityInfo.actorPrivilege = nb5Var.m158738g();
                }
            }
            return userActivityInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserActivityInfo userActivityInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userActivityInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<UserActivityInfoItem> list = userActivityInfo.activityInfos;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, UserActivityInfoItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(3, userActivityInfo.actorPrivilege);
        }
    };
    public static JsonAdapter<UserActivityInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserActivityInfo>() { // from class: com.p1.mobile.putong.data.UserActivityInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserActivityInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserActivityInfo newInstance() {
            return new UserActivityInfo();
        }

        public boolean parseField(UserActivityInfo userActivityInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "actorPrivilege":
                    userActivityInfo.actorPrivilege = jsonParser.getValueAsBoolean();
                    return true;
                case "activityInfos":
                    userActivityInfo.activityInfos = JsonAdapter.parseArray(jsonParser, UserActivityInfoItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    userActivityInfo.userId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserActivityInfo userActivityInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "actorPrivilege":
                case "activityInfos":
                case "userId":
                    return true;
                default:
                    return super.parseFieldCheck(userActivityInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserActivityInfo userActivityInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = userActivityInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("actorPrivilege", userActivityInfo.actorPrivilege);
            if (userActivityInfo.activityInfos != null) {
                jsonGenerator.writeFieldName("activityInfos");
                JsonAdapter.serializeArray(userActivityInfo.activityInfos, jsonGenerator, UserActivityInfoItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserActivityInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserActivityInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserActivityInfo new_() {
        UserActivityInfo userActivityInfo = new UserActivityInfo();
        userActivityInfo.nullCheck();
        return userActivityInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserActivityInfo mo223809clone() {
        UserActivityInfo userActivityInfo = new UserActivityInfo();
        userActivityInfo.userId = this.userId;
        userActivityInfo.actorPrivilege = this.actorPrivilege;
        List<UserActivityInfoItem> list = this.activityInfos;
        if (list != null) {
            userActivityInfo.activityInfos = ValueObject.util_map(list, new w9j() { // from class: l.lxj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserActivityInfoItem) obj).mo223809clone();
                }
            });
        }
        return userActivityInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserActivityInfo)) {
            return false;
        }
        UserActivityInfo userActivityInfo = (UserActivityInfo) obj;
        return ValueObject.util_equals(this.userId, userActivityInfo.userId) && this.actorPrivilege == userActivityInfo.actorPrivilege && ValueObject.util_equals(this.activityInfos, userActivityInfo.activityInfos);
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
        String str = this.userId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.actorPrivilege ? 1231 : 1237)) * 41;
        List<UserActivityInfoItem> list = this.activityInfos;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.activityInfos == null) {
            this.activityInfos = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
