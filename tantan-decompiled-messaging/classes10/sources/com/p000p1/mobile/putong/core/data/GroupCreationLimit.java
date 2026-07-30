package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GroupCreationLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupcreationlimit";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int groupRemaining;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int memberLimit;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<GroupCreationLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupCreationLimit>() { // from class: com.p1.mobile.putong.core.data.GroupCreationLimit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GroupCreationLimit groupCreationLimit) {
            String str = groupCreationLimit.value;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, groupCreationLimit.groupRemaining) + CodedOutputByteBufferNano.h(3, groupCreationLimit.memberLimit);
            ((MessageNano) groupCreationLimit).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GroupCreationLimit m13083parse(nb5 nb5Var) throws IOException {
            GroupCreationLimit groupCreationLimit = new GroupCreationLimit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (groupCreationLimit.value != null) {
                        break;
                    }
                    groupCreationLimit.value = "";
                    break;
                }
                if (iU == 10) {
                    groupCreationLimit.value = nb5Var.s();
                } else if (iU == 16) {
                    groupCreationLimit.groupRemaining = nb5Var.j();
                } else {
                    if (iU != 24) {
                        if (groupCreationLimit.value != null) {
                            break;
                        }
                        groupCreationLimit.value = "";
                        return groupCreationLimit;
                    }
                    groupCreationLimit.memberLimit = nb5Var.j();
                }
            }
            return groupCreationLimit;
        }

        public void serialize(GroupCreationLimit groupCreationLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupCreationLimit.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, groupCreationLimit.groupRemaining);
            codedOutputByteBufferNano.G(3, groupCreationLimit.memberLimit);
        }
    };
    public static JsonAdapter<GroupCreationLimit> JSON_ADAPTER = new ObjectJsonAdapter<GroupCreationLimit>() { // from class: com.p1.mobile.putong.core.data.GroupCreationLimit.2
        public Class getDataClass() {
            return GroupCreationLimit.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GroupCreationLimit m13084newInstance() {
            return new GroupCreationLimit();
        }

        public boolean parseField(GroupCreationLimit groupCreationLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "groupRemaining":
                    groupCreationLimit.groupRemaining = jsonParser.getValueAsInt();
                    return true;
                case "value":
                    groupCreationLimit.value = jsonParser.getValueAsString();
                    return true;
                case "memberLimit":
                    groupCreationLimit.memberLimit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupCreationLimit groupCreationLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "groupRemaining":
                case "value":
                case "memberLimit":
                    return true;
                default:
                    return super.parseFieldCheck(groupCreationLimit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GroupCreationLimit groupCreationLimit, JsonGenerator jsonGenerator) throws IOException {
            String str = groupCreationLimit.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeNumberField("groupRemaining", groupCreationLimit.groupRemaining);
            jsonGenerator.writeNumberField("memberLimit", groupCreationLimit.memberLimit);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupCreationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupCreationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupCreationLimit new_() {
        GroupCreationLimit groupCreationLimit = new GroupCreationLimit();
        groupCreationLimit.nullCheck();
        return groupCreationLimit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GroupCreationLimit m13082clone() {
        GroupCreationLimit groupCreationLimit = new GroupCreationLimit();
        groupCreationLimit.value = this.value;
        groupCreationLimit.groupRemaining = this.groupRemaining;
        groupCreationLimit.memberLimit = this.memberLimit;
        return groupCreationLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupCreationLimit)) {
            return false;
        }
        GroupCreationLimit groupCreationLimit = (GroupCreationLimit) obj;
        return ValueObject.util_equals(this.value, groupCreationLimit.value) && this.groupRemaining == groupCreationLimit.groupRemaining && this.memberLimit == groupCreationLimit.memberLimit;
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
        String str = this.value;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.groupRemaining) * 41) + this.memberLimit;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
