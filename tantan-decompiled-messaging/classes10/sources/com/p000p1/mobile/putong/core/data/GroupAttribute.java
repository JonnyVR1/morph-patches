package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GroupCategory;
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
public class GroupAttribute extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupattribute";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<GroupCategory> categories;

    @NonNull
    @ProtobufIndex(index = 1)
    public GroupCreationLimit creationLimit;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public GroupCreationType creationType;
    public static ProtobufAdapter<GroupAttribute> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupAttribute>() { // from class: com.p1.mobile.putong.core.data.GroupAttribute.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GroupAttribute groupAttribute) {
            GroupCreationLimit groupCreationLimit = groupAttribute.creationLimit;
            int iL = groupCreationLimit != null ? CodedOutputByteBufferNano.l(1, groupCreationLimit, GroupCreationLimit.PROTOBUF_ADAPTER) : 0;
            List<GroupCategory> list = groupAttribute.categories;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(2, list, GroupCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupCreationType groupCreationType = groupAttribute.creationType;
            if (groupCreationType != null) {
                iL += CodedOutputByteBufferNano.l(3, groupCreationType, GroupCreationType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) groupAttribute).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GroupAttribute m13071parse(nb5 nb5Var) throws IOException {
            GroupAttribute groupAttribute = new GroupAttribute();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    groupAttribute.creationLimit = (GroupCreationLimit) nb5Var.l(GroupCreationLimit.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    groupAttribute.categories = (List) nb5Var.l(GroupCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
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
                    groupAttribute.creationType = (GroupCreationType) nb5Var.l(GroupCreationType.PROTOBUF_ADAPTER);
                }
            }
            return groupAttribute;
        }

        public void serialize(GroupAttribute groupAttribute, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GroupCreationLimit groupCreationLimit = groupAttribute.creationLimit;
            if (groupCreationLimit != null) {
                codedOutputByteBufferNano.K(1, groupCreationLimit, GroupCreationLimit.PROTOBUF_ADAPTER);
            }
            List<GroupCategory> list = groupAttribute.categories;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, GroupCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupCreationType groupCreationType = groupAttribute.creationType;
            if (groupCreationType != null) {
                codedOutputByteBufferNano.K(3, groupCreationType, GroupCreationType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GroupAttribute> JSON_ADAPTER = new ObjectJsonAdapter<GroupAttribute>() { // from class: com.p1.mobile.putong.core.data.GroupAttribute.2
        public Class getDataClass() {
            return GroupAttribute.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GroupAttribute m13072newInstance() {
            return new GroupAttribute();
        }

        public boolean parseField(GroupAttribute groupAttribute, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "categories":
                    groupAttribute.categories = JsonAdapter.parseArray(jsonParser, GroupCategory.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "creationType":
                    groupAttribute.creationType = (GroupCreationType) GroupCreationType.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "creationLimit":
                    groupAttribute.creationLimit = (GroupCreationLimit) GroupCreationLimit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupAttribute) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupAttribute) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupAttribute new_() {
        GroupAttribute groupAttribute = new GroupAttribute();
        groupAttribute.nullCheck();
        return groupAttribute;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GroupAttribute m13070clone() {
        GroupAttribute groupAttribute = new GroupAttribute();
        GroupCreationLimit groupCreationLimit = this.creationLimit;
        if (groupCreationLimit != null) {
            groupAttribute.creationLimit = groupCreationLimit.m13082clone();
        }
        List<GroupCategory> list = this.categories;
        if (list != null) {
            groupAttribute.categories = ValueObject.util_map(list, new w9j() { // from class: l.obk
                public final Object call(Object obj) {
                    return ((GroupCategory) obj).m13074clone();
                }
            });
        }
        GroupCreationType groupCreationType = this.creationType;
        if (groupCreationType != null) {
            groupAttribute.creationType = groupCreationType.m13086clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
