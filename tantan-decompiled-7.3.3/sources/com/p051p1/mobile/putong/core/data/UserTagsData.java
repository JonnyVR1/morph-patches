package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.TagCategories;
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
public class UserTagsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usertagsdata";

    @ProtobufIndex(index = 3)
    public boolean clickable;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<TagCategories> tagCategories;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<UserTagData> tags;
    public static ProtobufAdapter<UserTagsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserTagsData>() { // from class: com.p1.mobile.putong.core.data.UserTagsData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserTagsData userTagsData) {
            List<UserTagData> list = userTagsData.tags;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<TagCategories> list2 = userTagsData.tagCategories;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17275b = iM17285l + CodedOutputByteBufferNano.m17275b(3, userTagsData.clickable);
            userTagsData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserTagsData parse(nc5 nc5Var) throws IOException {
            UserTagsData userTagsData = new UserTagsData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userTagsData.tags == null) {
                        userTagsData.tags = new ArrayList();
                    }
                    if (userTagsData.tagCategories != null) {
                        break;
                    }
                    userTagsData.tagCategories = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    userTagsData.tags = (List) nc5Var.m162488l(UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    userTagsData.tagCategories = (List) nc5Var.m162488l(TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 24) {
                        if (userTagsData.tags == null) {
                            userTagsData.tags = new ArrayList();
                        }
                        if (userTagsData.tagCategories != null) {
                            break;
                        }
                        userTagsData.tagCategories = new ArrayList();
                        return userTagsData;
                    }
                    userTagsData.clickable = nc5Var.m162483g();
                }
            }
            return userTagsData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserTagsData userTagsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<UserTagData> list = userTagsData.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TagCategories> list2 = userTagsData.tagCategories;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(3, userTagsData.clickable);
        }
    };
    public static JsonAdapter<UserTagsData> JSON_ADAPTER = new ObjectJsonAdapter<UserTagsData>() { // from class: com.p1.mobile.putong.core.data.UserTagsData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserTagsData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserTagsData newInstance() {
            return new UserTagsData();
        }

        public boolean parseField(UserTagsData userTagsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "clickable":
                    userTagsData.clickable = jsonParser.getValueAsBoolean();
                    return true;
                case "tagCategories":
                    userTagsData.tagCategories = JsonAdapter.parseArray(jsonParser, TagCategories.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tags":
                    userTagsData.tags = JsonAdapter.parseArray(jsonParser, UserTagData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserTagsData userTagsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "clickable":
                case "tagCategories":
                case "tags":
                    return true;
                default:
                    return super.parseFieldCheck(userTagsData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserTagsData userTagsData, JsonGenerator jsonGenerator) throws IOException {
            if (userTagsData.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(userTagsData.tags, jsonGenerator, UserTagData.JSON_ADAPTER);
            }
            if (userTagsData.tagCategories != null) {
                jsonGenerator.writeFieldName("tagCategories");
                JsonAdapter.serializeArray(userTagsData.tagCategories, jsonGenerator, TagCategories.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("clickable", userTagsData.clickable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserTagsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserTagsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserTagsData new_() {
        UserTagsData userTagsData = new UserTagsData();
        userTagsData.nullCheck();
        return userTagsData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserTagsData mo225055clone() {
        UserTagsData userTagsData = new UserTagsData();
        List<UserTagData> list = this.tags;
        if (list != null) {
            userTagsData.tags = ValueObject.util_map(list, new qcj() { // from class: l.gjk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UserTagData) obj).mo225055clone();
                }
            });
        }
        List<TagCategories> list2 = this.tagCategories;
        if (list2 != null) {
            userTagsData.tagCategories = ValueObject.util_map(list2, new qcj() { // from class: l.hjk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TagCategories) obj).mo225055clone();
                }
            });
        }
        userTagsData.clickable = this.clickable;
        return userTagsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserTagsData)) {
            return false;
        }
        UserTagsData userTagsData = (UserTagsData) obj;
        return ValueObject.util_equals(this.tags, userTagsData.tags) && ValueObject.util_equals(this.tagCategories, userTagsData.tagCategories) && this.clickable == userTagsData.clickable;
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
        List<UserTagData> list = this.tags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<TagCategories> list2 = this.tagCategories;
        int iHashCode2 = ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.clickable ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.tagCategories == null) {
            this.tagCategories = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
