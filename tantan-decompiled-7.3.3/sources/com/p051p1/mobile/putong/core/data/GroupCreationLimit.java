package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class GroupCreationLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupcreationlimit";

    @ProtobufIndex(index = 2)
    public int groupRemaining;

    @ProtobufIndex(index = 3)
    public int memberLimit;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<GroupCreationLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupCreationLimit>() { // from class: com.p1.mobile.putong.core.data.GroupCreationLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupCreationLimit groupCreationLimit) {
            String str = groupCreationLimit.value;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, groupCreationLimit.groupRemaining) + CodedOutputByteBufferNano.m17281h(3, groupCreationLimit.memberLimit);
            groupCreationLimit.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupCreationLimit parse(nc5 nc5Var) throws IOException {
            GroupCreationLimit groupCreationLimit = new GroupCreationLimit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (groupCreationLimit.value != null) {
                        break;
                    }
                    groupCreationLimit.value = "";
                    break;
                }
                if (iM162497u == 10) {
                    groupCreationLimit.value = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    groupCreationLimit.groupRemaining = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        if (groupCreationLimit.value != null) {
                            break;
                        }
                        groupCreationLimit.value = "";
                        return groupCreationLimit;
                    }
                    groupCreationLimit.memberLimit = nc5Var.m162486j();
                }
            }
            return groupCreationLimit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupCreationLimit groupCreationLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupCreationLimit.value;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, groupCreationLimit.groupRemaining);
            codedOutputByteBufferNano.m17305G(3, groupCreationLimit.memberLimit);
        }
    };
    public static JsonAdapter<GroupCreationLimit> JSON_ADAPTER = new ObjectJsonAdapter<GroupCreationLimit>() { // from class: com.p1.mobile.putong.core.data.GroupCreationLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupCreationLimit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupCreationLimit newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupCreationLimit groupCreationLimit, JsonGenerator jsonGenerator) throws IOException {
            String str = groupCreationLimit.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeNumberField("groupRemaining", groupCreationLimit.groupRemaining);
            jsonGenerator.writeNumberField("memberLimit", groupCreationLimit.memberLimit);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupCreationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupCreationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupCreationLimit new_() {
        GroupCreationLimit groupCreationLimit = new GroupCreationLimit();
        groupCreationLimit.nullCheck();
        return groupCreationLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupCreationLimit mo225055clone() {
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
        String str = this.value;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.groupRemaining) * 41) + this.memberLimit;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
