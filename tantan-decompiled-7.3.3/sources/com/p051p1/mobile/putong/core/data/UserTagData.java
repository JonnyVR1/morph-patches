package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;

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
    public String f21269id;

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
            String str = userTagData.f21269id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = userTagData.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = userTagData.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = userTagData.subtitle;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(5, userTagData.highlighted);
            List<String> list = userTagData.categories;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = userTagData.status;
            if (str5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            String str6 = userTagData.gender;
            if (str6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str6);
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(9, userTagData.index) + CodedOutputByteBufferNano.m17281h(10, userTagData.count);
            userTagData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserTagData parse(nc5 nc5Var) throws IOException {
            UserTagData userTagData = new UserTagData();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (userTagData.f21269id == null) {
                            userTagData.f21269id = "";
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
                        userTagData.f21269id = nc5Var.m162495s();
                        continue;
                    case 18:
                        userTagData.title = nc5Var.m162495s();
                        continue;
                    case 26:
                        userTagData.icon = nc5Var.m162495s();
                        continue;
                    case 34:
                        userTagData.subtitle = nc5Var.m162495s();
                        continue;
                    case 40:
                        userTagData.highlighted = nc5Var.m162483g();
                        continue;
                    case 50:
                        userTagData.categories = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        userTagData.status = nc5Var.m162495s();
                        continue;
                    case 66:
                        userTagData.gender = nc5Var.m162495s();
                        continue;
                    case 72:
                        userTagData.index = nc5Var.m162486j();
                        continue;
                    case 80:
                        userTagData.count = nc5Var.m162486j();
                        continue;
                    default:
                        if (userTagData.f21269id == null) {
                            userTagData.f21269id = "";
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
            String str = userTagData.f21269id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = userTagData.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = userTagData.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = userTagData.subtitle;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17299A(5, userTagData.highlighted);
            List<String> list = userTagData.categories;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = userTagData.status;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            String str6 = userTagData.gender;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(8, str6);
            }
            codedOutputByteBufferNano.m17305G(9, userTagData.index);
            codedOutputByteBufferNano.m17305G(10, userTagData.count);
        }
    };
    public static JsonAdapter<UserTagData> JSON_ADAPTER = new ObjectJsonAdapter<UserTagData>() { // from class: com.p1.mobile.putong.core.data.UserTagData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserTagData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    userTagData.f21269id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserTagData userTagData, JsonGenerator jsonGenerator) throws IOException {
            String str = userTagData.f21269id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserTagData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserTagData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36900a(String str) {
        return str;
    }

    public static UserTagData new_() {
        UserTagData userTagData = new UserTagData();
        userTagData.nullCheck();
        return userTagData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserTagData mo225055clone() {
        UserTagData userTagData = new UserTagData();
        userTagData.f21269id = this.f21269id;
        userTagData.title = this.title;
        userTagData.icon = this.icon;
        userTagData.subtitle = this.subtitle;
        userTagData.highlighted = this.highlighted;
        List<String> list = this.categories;
        if (list != null) {
            userTagData.categories = ValueObject.util_map(list, new qcj() { // from class: l.fjk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserTagData.m36900a((String) obj);
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
        return ValueObject.util_equals(this.f21269id, userTagData.f21269id) && ValueObject.util_equals(this.title, userTagData.title) && ValueObject.util_equals(this.icon, userTagData.icon) && ValueObject.util_equals(this.subtitle, userTagData.subtitle) && this.highlighted == userTagData.highlighted && ValueObject.util_equals(this.categories, userTagData.categories) && ValueObject.util_equals(this.status, userTagData.status) && ValueObject.util_equals(this.gender, userTagData.gender) && this.index == userTagData.index && this.count == userTagData.count;
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
        String str = this.f21269id;
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
        if (this.f21269id == null) {
            this.f21269id = "";
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
