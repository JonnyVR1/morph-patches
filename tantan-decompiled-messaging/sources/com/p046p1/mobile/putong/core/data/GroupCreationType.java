package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class GroupCreationType extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupcreationtype";

    @NonNull
    @ProtobufIndex(index = 1)
    public String defaultType;

    @ProtobufIndex(index = 2)
    public boolean selectable;
    public static ProtobufAdapter<GroupCreationType> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupCreationType>() { // from class: com.p1.mobile.putong.core.data.GroupCreationType.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupCreationType groupCreationType) {
            String str = groupCreationType.defaultType;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, groupCreationType.selectable);
            groupCreationType.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupCreationType parse(nb5 nb5Var) throws IOException {
            GroupCreationType groupCreationType = new GroupCreationType();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (groupCreationType.defaultType != null) {
                        break;
                    }
                    groupCreationType.defaultType = "";
                    break;
                }
                if (iM158752u == 10) {
                    groupCreationType.defaultType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (groupCreationType.defaultType != null) {
                            break;
                        }
                        groupCreationType.defaultType = "";
                        return groupCreationType;
                    }
                    groupCreationType.selectable = nb5Var.m158738g();
                }
            }
            return groupCreationType;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupCreationType groupCreationType, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupCreationType.defaultType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, groupCreationType.selectable);
        }
    };
    public static JsonAdapter<GroupCreationType> JSON_ADAPTER = new ObjectJsonAdapter<GroupCreationType>() { // from class: com.p1.mobile.putong.core.data.GroupCreationType.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupCreationType.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupCreationType newInstance() {
            return new GroupCreationType();
        }

        public boolean parseField(GroupCreationType groupCreationType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selectable")) {
                groupCreationType.selectable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("defaultType")) {
                return false;
            }
            groupCreationType.defaultType = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GroupCreationType groupCreationType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selectable") || str.equals("defaultType")) {
                return true;
            }
            return super.parseFieldCheck(groupCreationType, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupCreationType groupCreationType, JsonGenerator jsonGenerator) throws IOException {
            String str = groupCreationType.defaultType;
            if (str != null) {
                jsonGenerator.writeStringField("defaultType", str);
            }
            jsonGenerator.writeBooleanField("selectable", groupCreationType.selectable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupCreationType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupCreationType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupCreationType new_() {
        GroupCreationType groupCreationType = new GroupCreationType();
        groupCreationType.nullCheck();
        return groupCreationType;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupCreationType mo223809clone() {
        GroupCreationType groupCreationType = new GroupCreationType();
        groupCreationType.defaultType = this.defaultType;
        groupCreationType.selectable = this.selectable;
        return groupCreationType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupCreationType)) {
            return false;
        }
        GroupCreationType groupCreationType = (GroupCreationType) obj;
        return ValueObject.util_equals(this.defaultType, groupCreationType.defaultType) && this.selectable == groupCreationType.selectable;
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
        String str = this.defaultType;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.selectable ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.defaultType == null) {
            this.defaultType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
