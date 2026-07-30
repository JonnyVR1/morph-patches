package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes12.dex */
public class GroupIdBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupidbox";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39223id;

    @ProtobufIndex(index = 3)
    public boolean lastJoined;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<GroupIdBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupIdBox>() { // from class: com.p1.mobile.putong.feed.data.GroupIdBox.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupIdBox groupIdBox) {
            String str = groupIdBox.f39223id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = groupIdBox.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, groupIdBox.lastJoined);
            groupIdBox.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupIdBox parse(nb5 nb5Var) throws IOException {
            GroupIdBox groupIdBox = new GroupIdBox();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (groupIdBox.f39223id == null) {
                        groupIdBox.f39223id = "";
                    }
                    if (groupIdBox.name != null) {
                        break;
                    }
                    groupIdBox.name = "";
                    break;
                }
                if (iM158752u == 10) {
                    groupIdBox.f39223id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    groupIdBox.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 24) {
                        if (groupIdBox.f39223id == null) {
                            groupIdBox.f39223id = "";
                        }
                        if (groupIdBox.name != null) {
                            break;
                        }
                        groupIdBox.name = "";
                        return groupIdBox;
                    }
                    groupIdBox.lastJoined = nb5Var.m158738g();
                }
            }
            return groupIdBox;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupIdBox groupIdBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupIdBox.f39223id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = groupIdBox.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, groupIdBox.lastJoined);
        }
    };
    public static JsonAdapter<GroupIdBox> JSON_ADAPTER = new ObjectJsonAdapter<GroupIdBox>() { // from class: com.p1.mobile.putong.feed.data.GroupIdBox.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupIdBox.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupIdBox newInstance() {
            return new GroupIdBox();
        }

        public boolean parseField(GroupIdBox groupIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    groupIdBox.f39223id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    groupIdBox.name = jsonParser.getValueAsString();
                    return true;
                case "lastJoined":
                    groupIdBox.lastJoined = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupIdBox groupIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "name":
                case "lastJoined":
                    return true;
                default:
                    return super.parseFieldCheck(groupIdBox, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupIdBox groupIdBox, JsonGenerator jsonGenerator) throws IOException {
            String str = groupIdBox.f39223id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = groupIdBox.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeBooleanField("lastJoined", groupIdBox.lastJoined);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupIdBox new_() {
        GroupIdBox groupIdBox = new GroupIdBox();
        groupIdBox.nullCheck();
        return groupIdBox;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupIdBox mo223809clone() {
        GroupIdBox groupIdBox = new GroupIdBox();
        groupIdBox.f39223id = this.f39223id;
        groupIdBox.name = this.name;
        groupIdBox.lastJoined = this.lastJoined;
        return groupIdBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupIdBox)) {
            return false;
        }
        GroupIdBox groupIdBox = (GroupIdBox) obj;
        return ValueObject.util_equals(this.f39223id, groupIdBox.f39223id) && ValueObject.util_equals(this.name, groupIdBox.name) && this.lastJoined == groupIdBox.lastJoined;
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
        String str = this.f39223id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.lastJoined ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39223id == null) {
            this.f39223id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
