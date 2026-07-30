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
public class UserActivityInfoItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "useractivityinfoitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<UserActivityInfoItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserActivityInfoItem>() { // from class: com.p1.mobile.putong.data.UserActivityInfoItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserActivityInfoItem userActivityInfoItem) {
            String str = userActivityInfoItem.category;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = userActivityInfoItem.value;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = userActivityInfoItem.icon;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            userActivityInfoItem.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserActivityInfoItem parse(nb5 nb5Var) throws IOException {
            UserActivityInfoItem userActivityInfoItem = new UserActivityInfoItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userActivityInfoItem.category == null) {
                        userActivityInfoItem.category = "";
                    }
                    if (userActivityInfoItem.value == null) {
                        userActivityInfoItem.value = "";
                    }
                    if (userActivityInfoItem.icon != null) {
                        break;
                    }
                    userActivityInfoItem.icon = "";
                    break;
                }
                if (iM158752u == 10) {
                    userActivityInfoItem.category = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    userActivityInfoItem.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (userActivityInfoItem.category == null) {
                            userActivityInfoItem.category = "";
                        }
                        if (userActivityInfoItem.value == null) {
                            userActivityInfoItem.value = "";
                        }
                        if (userActivityInfoItem.icon != null) {
                            break;
                        }
                        userActivityInfoItem.icon = "";
                        return userActivityInfoItem;
                    }
                    userActivityInfoItem.icon = nb5Var.m158750s();
                }
            }
            return userActivityInfoItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserActivityInfoItem userActivityInfoItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userActivityInfoItem.category;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = userActivityInfoItem.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = userActivityInfoItem.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<UserActivityInfoItem> JSON_ADAPTER = new ObjectJsonAdapter<UserActivityInfoItem>() { // from class: com.p1.mobile.putong.data.UserActivityInfoItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserActivityInfoItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserActivityInfoItem newInstance() {
            return new UserActivityInfoItem();
        }

        public boolean parseField(UserActivityInfoItem userActivityInfoItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "icon":
                    userActivityInfoItem.icon = jsonParser.getValueAsString();
                    return true;
                case "category":
                    userActivityInfoItem.category = jsonParser.getValueAsString();
                    return true;
                case "value":
                    userActivityInfoItem.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserActivityInfoItem userActivityInfoItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "icon":
                case "category":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(userActivityInfoItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserActivityInfoItem userActivityInfoItem, JsonGenerator jsonGenerator) throws IOException {
            String str = userActivityInfoItem.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
            String str2 = userActivityInfoItem.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            String str3 = userActivityInfoItem.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserActivityInfoItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserActivityInfoItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserActivityInfoItem new_() {
        UserActivityInfoItem userActivityInfoItem = new UserActivityInfoItem();
        userActivityInfoItem.nullCheck();
        return userActivityInfoItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserActivityInfoItem mo223809clone() {
        UserActivityInfoItem userActivityInfoItem = new UserActivityInfoItem();
        userActivityInfoItem.category = this.category;
        userActivityInfoItem.value = this.value;
        userActivityInfoItem.icon = this.icon;
        return userActivityInfoItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserActivityInfoItem)) {
            return false;
        }
        UserActivityInfoItem userActivityInfoItem = (UserActivityInfoItem) obj;
        return ValueObject.util_equals(this.category, userActivityInfoItem.category) && ValueObject.util_equals(this.value, userActivityInfoItem.value) && ValueObject.util_equals(this.icon, userActivityInfoItem.icon);
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
        String str = this.category;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
