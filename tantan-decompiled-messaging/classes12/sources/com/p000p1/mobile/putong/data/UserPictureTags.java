package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.UserPictureTags;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UserPictureTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userpicturetags";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> categories;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f293id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<UserPictureTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserPictureTags>() { // from class: com.p1.mobile.putong.data.UserPictureTags.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserPictureTags userPictureTags) {
            String str = userPictureTags.f293id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = userPictureTags.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<String> list = userPictureTags.categories;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) userPictureTags).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserPictureTags m19202parse(nb5 nb5Var) throws IOException {
            UserPictureTags userPictureTags = new UserPictureTags();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userPictureTags.f293id == null) {
                        userPictureTags.f293id = "";
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
                if (iU == 10) {
                    userPictureTags.f293id = nb5Var.s();
                } else if (iU == 18) {
                    userPictureTags.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (userPictureTags.f293id == null) {
                            userPictureTags.f293id = "";
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
                    userPictureTags.categories = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userPictureTags;
        }

        public void serialize(UserPictureTags userPictureTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userPictureTags.f293id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = userPictureTags.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<String> list = userPictureTags.categories;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserPictureTags> JSON_ADAPTER = new ObjectJsonAdapter<UserPictureTags>() { // from class: com.p1.mobile.putong.data.UserPictureTags.2
        public Class getDataClass() {
            return UserPictureTags.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserPictureTags mo17830newInstance() {
            return new UserPictureTags();
        }

        public boolean parseField(UserPictureTags userPictureTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    userPictureTags.f293id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserPictureTags userPictureTags, JsonGenerator jsonGenerator) throws IOException {
            String str = userPictureTags.f293id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = userPictureTags.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (userPictureTags.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(userPictureTags.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserPictureTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserPictureTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1051a(String str) {
        return str;
    }

    public static UserPictureTags new_() {
        UserPictureTags userPictureTags = new UserPictureTags();
        userPictureTags.nullCheck();
        return userPictureTags;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserPictureTags m19201clone() {
        UserPictureTags userPictureTags = new UserPictureTags();
        userPictureTags.f293id = this.f293id;
        userPictureTags.name = this.name;
        List<String> list = this.categories;
        if (list != null) {
            userPictureTags.categories = ValueObject.util_map(list, new w9j() { // from class: l.i7k0
                public final Object call(Object obj) {
                    return UserPictureTags.m1051a((String) obj);
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
        return ValueObject.util_equals(this.f293id, userPictureTags.f293id) && ValueObject.util_equals(this.name, userPictureTags.name) && ValueObject.util_equals(this.categories, userPictureTags.categories);
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
        String str = this.f293id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.categories;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f293id == null) {
            this.f293id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
