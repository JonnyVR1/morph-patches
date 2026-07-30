package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Picture;
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
public class GroupCreate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupcreate";

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public List<Picture> avatars;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public GroupCategory category;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String description;

    @Nullable
    @ProtobufIndex(index = 1)
    public String name;

    @Nullable
    @ProtobufIndex(index = 4)
    public String type;
    public static ProtobufAdapter<GroupCreate> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupCreate>() { // from class: com.p1.mobile.putong.core.data.GroupCreate.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GroupCreate groupCreate) {
            String str = groupCreate.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = groupCreate.description;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            GroupCategory groupCategory = groupCreate.category;
            if (groupCategory != null) {
                iO += CodedOutputByteBufferNano.l(3, groupCategory, GroupCategory.PROTOBUF_ADAPTER);
            }
            String str3 = groupCreate.type;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            List<Picture> list = groupCreate.avatars;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(5, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) groupCreate).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GroupCreate m13079parse(nb5 nb5Var) throws IOException {
            GroupCreate groupCreate = new GroupCreate();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    groupCreate.name = nb5Var.s();
                } else if (iU == 18) {
                    groupCreate.description = nb5Var.s();
                } else if (iU == 26) {
                    groupCreate.category = (GroupCategory) nb5Var.l(GroupCategory.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    groupCreate.type = nb5Var.s();
                } else {
                    if (iU != 42) {
                        return groupCreate;
                    }
                    groupCreate.avatars = (List) nb5Var.l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        public void serialize(GroupCreate groupCreate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupCreate.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = groupCreate.description;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            GroupCategory groupCategory = groupCreate.category;
            if (groupCategory != null) {
                codedOutputByteBufferNano.K(3, groupCategory, GroupCategory.PROTOBUF_ADAPTER);
            }
            String str3 = groupCreate.type;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            List<Picture> list = groupCreate.avatars;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GroupCreate> JSON_ADAPTER = new ObjectJsonAdapter<GroupCreate>() { // from class: com.p1.mobile.putong.core.data.GroupCreate.2
        public Class getDataClass() {
            return GroupCreate.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GroupCreate m13080newInstance() {
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
                    groupCreate.category = (GroupCategory) GroupCategory.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(GroupCreate groupCreate, JsonGenerator jsonGenerator) throws IOException {
            String str = groupCreate.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupCreate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupCreate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupCreate new_() {
        GroupCreate groupCreate = new GroupCreate();
        groupCreate.nullCheck();
        return groupCreate;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GroupCreate m13078clone() {
        GroupCreate groupCreate = new GroupCreate();
        groupCreate.name = this.name;
        groupCreate.description = this.description;
        GroupCategory groupCategory = this.category;
        if (groupCategory != null) {
            groupCreate.category = groupCategory.m13074clone();
        }
        groupCreate.type = this.type;
        List<Picture> list = this.avatars;
        if (list != null) {
            groupCreate.avatars = ValueObject.util_map(list, new w9j() { // from class: l.ubk
                public final Object call(Object obj) {
                    return ((Picture) obj).clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
