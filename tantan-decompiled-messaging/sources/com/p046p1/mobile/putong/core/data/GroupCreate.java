package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Picture;
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
public class GroupCreate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupcreate";

    @Nullable
    @ProtobufIndex(index = 5)
    public List<Picture> avatars;

    @Nullable
    @ProtobufIndex(index = 3)
    public GroupCategory category;

    @Nullable
    @ProtobufIndex(index = 2)
    public String description;

    @Nullable
    @ProtobufIndex(index = 1)
    public String name;

    @Nullable
    @ProtobufIndex(index = 4)
    public String type;
    public static ProtobufAdapter<GroupCreate> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupCreate>() { // from class: com.p1.mobile.putong.core.data.GroupCreate.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupCreate groupCreate) {
            String str = groupCreate.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = groupCreate.description;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            GroupCategory groupCategory = groupCreate.category;
            if (groupCategory != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, groupCategory, GroupCategory.PROTOBUF_ADAPTER);
            }
            String str3 = groupCreate.type;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            List<Picture> list = groupCreate.avatars;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            groupCreate.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupCreate parse(nb5 nb5Var) throws IOException {
            GroupCreate groupCreate = new GroupCreate();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    groupCreate.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    groupCreate.description = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    groupCreate.category = (GroupCategory) nb5Var.m158743l(GroupCategory.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    groupCreate.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        return groupCreate;
                    }
                    groupCreate.avatars = (List) nb5Var.m158743l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupCreate groupCreate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupCreate.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = groupCreate.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            GroupCategory groupCategory = groupCreate.category;
            if (groupCategory != null) {
                codedOutputByteBufferNano.m17254K(3, groupCategory, GroupCategory.PROTOBUF_ADAPTER);
            }
            String str3 = groupCreate.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            List<Picture> list = groupCreate.avatars;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GroupCreate> JSON_ADAPTER = new ObjectJsonAdapter<GroupCreate>() { // from class: com.p1.mobile.putong.core.data.GroupCreate.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupCreate.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupCreate newInstance() {
            return new GroupCreate();
        }

        public boolean parseField(GroupCreate groupCreate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    groupCreate.description = jsonParser.getValueAsString();
                    return true;
                case "avatars":
                    groupCreate.avatars = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    groupCreate.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    groupCreate.type = jsonParser.getValueAsString();
                    return true;
                case "category":
                    groupCreate.category = GroupCategory.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupCreate groupCreate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "avatars":
                case "name":
                case "type":
                case "category":
                    return true;
                default:
                    return super.parseFieldCheck(groupCreate, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupCreate groupCreate, JsonGenerator jsonGenerator) throws IOException {
            String str = groupCreate.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = groupCreate.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            if (groupCreate.category != null) {
                jsonGenerator.writeFieldName("category");
                GroupCategory.JSON_ADAPTER.serialize(groupCreate.category, jsonGenerator, true);
            }
            String str3 = groupCreate.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            if (groupCreate.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(groupCreate.avatars, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupCreate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupCreate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupCreate new_() {
        GroupCreate groupCreate = new GroupCreate();
        groupCreate.nullCheck();
        return groupCreate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupCreate mo223809clone() {
        GroupCreate groupCreate = new GroupCreate();
        groupCreate.name = this.name;
        groupCreate.description = this.description;
        GroupCategory groupCategory = this.category;
        if (groupCategory != null) {
            groupCreate.category = groupCategory.mo223809clone();
        }
        groupCreate.type = this.type;
        List<Picture> list = this.avatars;
        if (list != null) {
            groupCreate.avatars = ValueObject.util_map(list, new w9j() { // from class: l.ubk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Picture) obj).mo223809clone();
                }
            });
        }
        return groupCreate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupCreate)) {
            return false;
        }
        GroupCreate groupCreate = (GroupCreate) obj;
        return ValueObject.util_equals(this.name, groupCreate.name) && ValueObject.util_equals(this.description, groupCreate.description) && ValueObject.util_equals(this.category, groupCreate.category) && ValueObject.util_equals(this.type, groupCreate.type) && ValueObject.util_equals(this.avatars, groupCreate.avatars);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        GroupCategory groupCategory = this.category;
        int iHashCode3 = (iHashCode2 + (groupCategory != null ? groupCategory.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<Picture> list = this.avatars;
        int iHashCode5 = iHashCode4 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
