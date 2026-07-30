package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.UserTagData;
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
public class UserTagData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usertagdata";

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> categories;

    @ProtobufIndex(index = 10)
    public int count;

    @NonNull
    @ProtobufIndex(index = 8)
    public String gender;

    @ProtobufIndex(index = 5)
    public boolean highlighted;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20527id;

    @ProtobufIndex(index = 9)
    public int index;

    @NonNull
    @ProtobufIndex(index = 7)
    public String status;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<UserTagData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserTagData>() { // from class: com.p1.mobile.putong.core.data.UserTagData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserTagData userTagData) {
            String str = userTagData.f20527id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = userTagData.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = userTagData.icon;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = userTagData.subtitle;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(5, userTagData.highlighted);
            List<String> list = userTagData.categories;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = userTagData.status;
            if (str5 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(7, str5);
            }
            String str6 = userTagData.gender;
            if (str6 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(8, str6);
            }
            int iM17226h = iM17220b + CodedOutputByteBufferNano.m17226h(9, userTagData.index) + CodedOutputByteBufferNano.m17226h(10, userTagData.count);
            userTagData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserTagData parse(nb5 nb5Var) throws IOException {
            UserTagData userTagData = new UserTagData();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (userTagData.f20527id == null) {
                            userTagData.f20527id = "";
                        }
                        if (userTagData.title == null) {
                            userTagData.title = "";
                        }
                        if (userTagData.icon == null) {
                            userTagData.icon = "";
                        }
                        if (userTagData.subtitle == null) {
                            userTagData.subtitle = "";
                        }
                        if (userTagData.categories == null) {
                            userTagData.categories = new ArrayList();
                        }
                        if (userTagData.status == null) {
                            userTagData.status = "";
                        }
                        if (userTagData.gender == null) {
                            userTagData.gender = "";
                        }
                        break;
                    case 10:
                        userTagData.f20527id = nb5Var.m158750s();
                        continue;
                    case 18:
                        userTagData.title = nb5Var.m158750s();
                        continue;
                    case 26:
                        userTagData.icon = nb5Var.m158750s();
                        continue;
                    case 34:
                        userTagData.subtitle = nb5Var.m158750s();
                        continue;
                    case 40:
                        userTagData.highlighted = nb5Var.m158738g();
                        continue;
                    case 50:
                        userTagData.categories = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        userTagData.status = nb5Var.m158750s();
                        continue;
                    case 66:
                        userTagData.gender = nb5Var.m158750s();
                        continue;
                    case 72:
                        userTagData.index = nb5Var.m158741j();
                        continue;
                    case 80:
                        userTagData.count = nb5Var.m158741j();
                        continue;
                    default:
                        if (userTagData.f20527id == null) {
                            userTagData.f20527id = "";
                        }
                        if (userTagData.title == null) {
                            userTagData.title = "";
                        }
                        if (userTagData.icon == null) {
                            userTagData.icon = "";
                        }
                        if (userTagData.subtitle == null) {
                            userTagData.subtitle = "";
                        }
                        if (userTagData.categories == null) {
                            userTagData.categories = new ArrayList();
                        }
                        if (userTagData.status == null) {
                            userTagData.status = "";
                        }
                        if (userTagData.gender == null) {
                            userTagData.gender = "";
                            return userTagData;
                        }
                        break;
                }
            }
            return userTagData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserTagData userTagData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userTagData.f20527id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = userTagData.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = userTagData.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = userTagData.subtitle;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17244A(5, userTagData.highlighted);
            List<String> list = userTagData.categories;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = userTagData.status;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(7, str5);
            }
            String str6 = userTagData.gender;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(8, str6);
            }
            codedOutputByteBufferNano.m17250G(9, userTagData.index);
            codedOutputByteBufferNano.m17250G(10, userTagData.count);
        }
    };
    public static JsonAdapter<UserTagData> JSON_ADAPTER = new ObjectJsonAdapter<UserTagData>() { // from class: com.p1.mobile.putong.core.data.UserTagData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserTagData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserTagData newInstance() {
            return new UserTagData();
        }

        public boolean parseField(UserTagData userTagData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    userTagData.subtitle = jsonParser.getValueAsString();
                    return true;
                case "highlighted":
                    userTagData.highlighted = jsonParser.getValueAsBoolean();
                    return true;
                case "gender":
                    userTagData.gender = jsonParser.getValueAsString();
                    return true;
                case "status":
                    userTagData.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    userTagData.f20527id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    userTagData.icon = jsonParser.getValueAsString();
                    return true;
                case "count":
                    userTagData.count = jsonParser.getValueAsInt();
                    return true;
                case "index":
                    userTagData.index = jsonParser.getValueAsInt();
                    return true;
                case "title":
                    userTagData.title = jsonParser.getValueAsString();
                    return true;
                case "categories":
                    userTagData.categories = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserTagData userTagData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "highlighted":
                case "gender":
                case "status":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "count":
                case "index":
                case "title":
                case "categories":
                    return true;
                default:
                    return super.parseFieldCheck(userTagData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserTagData userTagData, JsonGenerator jsonGenerator) throws IOException {
            String str = userTagData.f20527id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = userTagData.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = userTagData.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = userTagData.subtitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("subtitle", str4);
            }
            jsonGenerator.writeBooleanField("highlighted", userTagData.highlighted);
            if (userTagData.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(userTagData.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = userTagData.status;
            if (str5 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str5);
            }
            String str6 = userTagData.gender;
            if (str6 != null) {
                jsonGenerator.writeStringField("gender", str6);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, userTagData.index);
            jsonGenerator.writeNumberField("count", userTagData.count);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserTagData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserTagData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35897a(String str) {
        return str;
    }

    public static UserTagData new_() {
        UserTagData userTagData = new UserTagData();
        userTagData.nullCheck();
        return userTagData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserTagData mo223809clone() {
        UserTagData userTagData = new UserTagData();
        userTagData.f20527id = this.f20527id;
        userTagData.title = this.title;
        userTagData.icon = this.icon;
        userTagData.subtitle = this.subtitle;
        userTagData.highlighted = this.highlighted;
        List<String> list = this.categories;
        if (list != null) {
            userTagData.categories = ValueObject.util_map(list, new w9j() { // from class: l.z9k0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return UserTagData.m35897a((String) obj);
                }
            });
        }
        userTagData.status = this.status;
        userTagData.gender = this.gender;
        userTagData.index = this.index;
        userTagData.count = this.count;
        return userTagData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserTagData)) {
            return false;
        }
        UserTagData userTagData = (UserTagData) obj;
        return ValueObject.util_equals(this.f20527id, userTagData.f20527id) && ValueObject.util_equals(this.title, userTagData.title) && ValueObject.util_equals(this.icon, userTagData.icon) && ValueObject.util_equals(this.subtitle, userTagData.subtitle) && this.highlighted == userTagData.highlighted && ValueObject.util_equals(this.categories, userTagData.categories) && ValueObject.util_equals(this.status, userTagData.status) && ValueObject.util_equals(this.gender, userTagData.gender) && this.index == userTagData.index && this.count == userTagData.count;
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
        String str = this.f20527id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.subtitle;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.highlighted ? 1231 : 1237)) * 41;
        List<String> list = this.categories;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.gender;
        int iHashCode7 = ((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.index) * 41) + this.count;
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20527id == null) {
            this.f20527id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
