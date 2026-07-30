package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.GroupCategory;
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
public class GroupAttribute extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupattribute";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<GroupCategory> categories;

    @NonNull
    @ProtobufIndex(index = 1)
    public GroupCreationLimit creationLimit;

    @NonNull
    @ProtobufIndex(index = 3)
    public GroupCreationType creationType;
    public static ProtobufAdapter<GroupAttribute> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupAttribute>() { // from class: com.p1.mobile.putong.core.data.GroupAttribute.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupAttribute groupAttribute) {
            GroupCreationLimit groupCreationLimit = groupAttribute.creationLimit;
            int iM17285l = groupCreationLimit != null ? CodedOutputByteBufferNano.m17285l(1, groupCreationLimit, GroupCreationLimit.PROTOBUF_ADAPTER) : 0;
            List<GroupCategory> list = groupAttribute.categories;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list, GroupCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupCreationType groupCreationType = groupAttribute.creationType;
            if (groupCreationType != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, groupCreationType, GroupCreationType.PROTOBUF_ADAPTER);
            }
            groupAttribute.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupAttribute parse(nc5 nc5Var) throws IOException {
            GroupAttribute groupAttribute = new GroupAttribute();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (groupAttribute.creationLimit == null) {
                        groupAttribute.creationLimit = GroupCreationLimit.new_();
                    }
                    if (groupAttribute.categories == null) {
                        groupAttribute.categories = new ArrayList();
                    }
                    if (groupAttribute.creationType != null) {
                        break;
                    }
                    groupAttribute.creationType = GroupCreationType.new_();
                    break;
                }
                if (iM162497u == 10) {
                    groupAttribute.creationLimit = (GroupCreationLimit) nc5Var.m162488l(GroupCreationLimit.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    groupAttribute.categories = (List) nc5Var.m162488l(GroupCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (groupAttribute.creationLimit == null) {
                            groupAttribute.creationLimit = GroupCreationLimit.new_();
                        }
                        if (groupAttribute.categories == null) {
                            groupAttribute.categories = new ArrayList();
                        }
                        if (groupAttribute.creationType != null) {
                            break;
                        }
                        groupAttribute.creationType = GroupCreationType.new_();
                        return groupAttribute;
                    }
                    groupAttribute.creationType = (GroupCreationType) nc5Var.m162488l(GroupCreationType.PROTOBUF_ADAPTER);
                }
            }
            return groupAttribute;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupAttribute groupAttribute, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GroupCreationLimit groupCreationLimit = groupAttribute.creationLimit;
            if (groupCreationLimit != null) {
                codedOutputByteBufferNano.m17309K(1, groupCreationLimit, GroupCreationLimit.PROTOBUF_ADAPTER);
            }
            List<GroupCategory> list = groupAttribute.categories;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, GroupCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupCreationType groupCreationType = groupAttribute.creationType;
            if (groupCreationType != null) {
                codedOutputByteBufferNano.m17309K(3, groupCreationType, GroupCreationType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GroupAttribute> JSON_ADAPTER = new ObjectJsonAdapter<GroupAttribute>() { // from class: com.p1.mobile.putong.core.data.GroupAttribute.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupAttribute.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupAttribute newInstance() {
            return new GroupAttribute();
        }

        public boolean parseField(GroupAttribute groupAttribute, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "categories":
                    groupAttribute.categories = JsonAdapter.parseArray(jsonParser, GroupCategory.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "creationType":
                    groupAttribute.creationType = GroupCreationType.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "creationLimit":
                    groupAttribute.creationLimit = GroupCreationLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupAttribute groupAttribute, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "categories":
                case "creationType":
                case "creationLimit":
                    return true;
                default:
                    return super.parseFieldCheck(groupAttribute, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupAttribute groupAttribute, JsonGenerator jsonGenerator) throws IOException {
            if (groupAttribute.creationLimit != null) {
                jsonGenerator.writeFieldName("creationLimit");
                GroupCreationLimit.JSON_ADAPTER.serialize(groupAttribute.creationLimit, jsonGenerator, true);
            }
            if (groupAttribute.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(groupAttribute.categories, jsonGenerator, GroupCategory.JSON_ADAPTER);
            }
            if (groupAttribute.creationType != null) {
                jsonGenerator.writeFieldName("creationType");
                GroupCreationType.JSON_ADAPTER.serialize(groupAttribute.creationType, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupAttribute) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupAttribute) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupAttribute new_() {
        GroupAttribute groupAttribute = new GroupAttribute();
        groupAttribute.nullCheck();
        return groupAttribute;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupAttribute mo225055clone() {
        GroupAttribute groupAttribute = new GroupAttribute();
        GroupCreationLimit groupCreationLimit = this.creationLimit;
        if (groupCreationLimit != null) {
            groupAttribute.creationLimit = groupCreationLimit.mo225055clone();
        }
        List<GroupCategory> list = this.categories;
        if (list != null) {
            groupAttribute.categories = ValueObject.util_map(list, new qcj() { // from class: l.eek
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GroupCategory) obj).mo225055clone();
                }
            });
        }
        GroupCreationType groupCreationType = this.creationType;
        if (groupCreationType != null) {
            groupAttribute.creationType = groupCreationType.mo225055clone();
        }
        return groupAttribute;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupAttribute)) {
            return false;
        }
        GroupAttribute groupAttribute = (GroupAttribute) obj;
        return ValueObject.util_equals(this.creationLimit, groupAttribute.creationLimit) && ValueObject.util_equals(this.categories, groupAttribute.categories) && ValueObject.util_equals(this.creationType, groupAttribute.creationType);
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
        GroupCreationLimit groupCreationLimit = this.creationLimit;
        int iHashCode = (i2 + (groupCreationLimit != null ? groupCreationLimit.hashCode() : 0)) * 41;
        List<GroupCategory> list = this.categories;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        GroupCreationType groupCreationType = this.creationType;
        int iHashCode3 = iHashCode2 + (groupCreationType != null ? groupCreationType.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.creationLimit == null) {
            this.creationLimit = GroupCreationLimit.new_();
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
        if (this.creationType == null) {
            this.creationType = GroupCreationType.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
