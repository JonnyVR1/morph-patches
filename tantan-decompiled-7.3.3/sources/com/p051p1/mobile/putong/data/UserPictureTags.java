package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.UserPictureTags;
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

/* JADX INFO: loaded from: classes12.dex */
public class UserPictureTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userpicturetags";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> categories;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39680id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<UserPictureTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserPictureTags>() { // from class: com.p1.mobile.putong.data.UserPictureTags.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserPictureTags userPictureTags) {
            String str = userPictureTags.f39680id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = userPictureTags.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<String> list = userPictureTags.categories;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            userPictureTags.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserPictureTags parse(nc5 nc5Var) throws IOException {
            UserPictureTags userPictureTags = new UserPictureTags();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userPictureTags.f39680id == null) {
                        userPictureTags.f39680id = "";
                    }
                    if (userPictureTags.name == null) {
                        userPictureTags.name = "";
                    }
                    if (userPictureTags.categories != null) {
                        break;
                    }
                    userPictureTags.categories = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    userPictureTags.f39680id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    userPictureTags.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (userPictureTags.f39680id == null) {
                            userPictureTags.f39680id = "";
                        }
                        if (userPictureTags.name == null) {
                            userPictureTags.name = "";
                        }
                        if (userPictureTags.categories != null) {
                            break;
                        }
                        userPictureTags.categories = new ArrayList();
                        return userPictureTags;
                    }
                    userPictureTags.categories = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userPictureTags;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserPictureTags userPictureTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userPictureTags.f39680id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = userPictureTags.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<String> list = userPictureTags.categories;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserPictureTags> JSON_ADAPTER = new ObjectJsonAdapter<UserPictureTags>() { // from class: com.p1.mobile.putong.data.UserPictureTags.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserPictureTags.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserPictureTags newInstance() {
            return new UserPictureTags();
        }

        public boolean parseField(UserPictureTags userPictureTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    userPictureTags.f39680id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    userPictureTags.name = jsonParser.getValueAsString();
                    return true;
                case "categories":
                    userPictureTags.categories = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserPictureTags userPictureTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "name":
                case "categories":
                    return true;
                default:
                    return super.parseFieldCheck(userPictureTags, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserPictureTags userPictureTags, JsonGenerator jsonGenerator) throws IOException {
            String str = userPictureTags.f39680id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = userPictureTags.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (userPictureTags.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(userPictureTags.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserPictureTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserPictureTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61317a(String str) {
        return str;
    }

    public static UserPictureTags new_() {
        UserPictureTags userPictureTags = new UserPictureTags();
        userPictureTags.nullCheck();
        return userPictureTags;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserPictureTags mo225055clone() {
        UserPictureTags userPictureTags = new UserPictureTags();
        userPictureTags.f39680id = this.f39680id;
        userPictureTags.name = this.name;
        List<String> list = this.categories;
        if (list != null) {
            userPictureTags.categories = ValueObject.util_map(list, new qcj() { // from class: l.ogk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserPictureTags.m61317a((String) obj);
                }
            });
        }
        return userPictureTags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserPictureTags)) {
            return false;
        }
        UserPictureTags userPictureTags = (UserPictureTags) obj;
        return ValueObject.util_equals(this.f39680id, userPictureTags.f39680id) && ValueObject.util_equals(this.name, userPictureTags.name) && ValueObject.util_equals(this.categories, userPictureTags.categories);
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
        String str = this.f39680id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.categories;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39680id == null) {
            this.f39680id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
