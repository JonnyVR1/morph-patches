package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
import com.p046p1.mobile.putong.data.User;
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
public class GroupNotification extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupnotification";

    @Nullable
    @ProtobufIndex(index = 8)
    public ChatGroup chatGroupData;

    @ProtobufIndex(index = 4)
    public double createdTime;

    @Nullable
    @ProtobufIndex(index = 3)
    public GroupApply groupApply;

    @Nullable
    @ProtobufIndex(index = 7)
    public GroupApply groupApplyData;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20406id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @ProtobufIndex(index = 5)
    public double updatedTime;

    @Nullable
    @ProtobufIndex(index = 9)
    public User userData;

    @Nullable
    @ProtobufIndex(index = 6)
    public String userId;
    public static ProtobufAdapter<GroupNotification> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupNotification>() { // from class: com.p1.mobile.putong.core.data.GroupNotification.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupNotification groupNotification) {
            String str = groupNotification.f20406id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = groupNotification.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            GroupApply groupApply = groupNotification.groupApply;
            if (groupApply != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, groupApply, GroupApply.PROTOBUF_ADAPTER);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(4, groupNotification.createdTime) + CodedOutputByteBufferNano.m17222d(5, groupNotification.updatedTime);
            String str3 = groupNotification.userId;
            if (str3 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            GroupApply groupApply2 = groupNotification.groupApplyData;
            if (groupApply2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(7, groupApply2, GroupApply.PROTOBUF_ADAPTER);
            }
            ChatGroup chatGroup = groupNotification.chatGroupData;
            if (chatGroup != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(8, chatGroup, ChatGroup.PROTOBUF_ADAPTER);
            }
            User user = groupNotification.userData;
            if (user != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(9, user, User.PROTOBUF_ADAPTER);
            }
            groupNotification.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupNotification parse(nb5 nb5Var) throws IOException {
            GroupNotification groupNotification = new GroupNotification();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (groupNotification.f20406id == null) {
                        groupNotification.f20406id = "";
                    }
                    if (groupNotification.type != null) {
                        break;
                    }
                    groupNotification.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    groupNotification.f20406id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    groupNotification.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    groupNotification.groupApply = (GroupApply) nb5Var.m158743l(GroupApply.PROTOBUF_ADAPTER);
                } else if (iM158752u == 33) {
                    groupNotification.createdTime = nb5Var.m158739h();
                } else if (iM158752u == 41) {
                    groupNotification.updatedTime = nb5Var.m158739h();
                } else if (iM158752u == 50) {
                    groupNotification.userId = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    groupNotification.groupApplyData = (GroupApply) nb5Var.m158743l(GroupApply.PROTOBUF_ADAPTER);
                } else if (iM158752u == 66) {
                    groupNotification.chatGroupData = (ChatGroup) nb5Var.m158743l(ChatGroup.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 74) {
                        if (groupNotification.f20406id == null) {
                            groupNotification.f20406id = "";
                        }
                        if (groupNotification.type != null) {
                            break;
                        }
                        groupNotification.type = "";
                        return groupNotification;
                    }
                    groupNotification.userData = (User) nb5Var.m158743l(User.PROTOBUF_ADAPTER);
                }
            }
            return groupNotification;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupNotification groupNotification, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupNotification.f20406id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = groupNotification.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            GroupApply groupApply = groupNotification.groupApply;
            if (groupApply != null) {
                codedOutputByteBufferNano.m17254K(3, groupApply, GroupApply.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17246C(4, groupNotification.createdTime);
            codedOutputByteBufferNano.m17246C(5, groupNotification.updatedTime);
            String str3 = groupNotification.userId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
            GroupApply groupApply2 = groupNotification.groupApplyData;
            if (groupApply2 != null) {
                codedOutputByteBufferNano.m17254K(7, groupApply2, GroupApply.PROTOBUF_ADAPTER);
            }
            ChatGroup chatGroup = groupNotification.chatGroupData;
            if (chatGroup != null) {
                codedOutputByteBufferNano.m17254K(8, chatGroup, ChatGroup.PROTOBUF_ADAPTER);
            }
            User user = groupNotification.userData;
            if (user != null) {
                codedOutputByteBufferNano.m17254K(9, user, User.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GroupNotification> JSON_ADAPTER = new ObjectJsonAdapter<GroupNotification>() { // from class: com.p1.mobile.putong.core.data.GroupNotification.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupNotification.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupNotification newInstance() {
            return new GroupNotification();
        }

        public boolean parseField(GroupNotification groupNotification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    groupNotification.userId = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    groupNotification.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "createdTime":
                    groupNotification.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    groupNotification.f20406id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    groupNotification.type = jsonParser.getValueAsString();
                    return true;
                case "groupApply":
                    groupNotification.groupApply = GroupApply.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupNotification groupNotification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "updatedTime":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "type":
                case "groupApply":
                    return true;
                default:
                    return super.parseFieldCheck(groupNotification, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupNotification groupNotification, JsonGenerator jsonGenerator) throws IOException {
            String str = groupNotification.f20406id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = groupNotification.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (groupNotification.groupApply != null) {
                jsonGenerator.writeFieldName("groupApply");
                GroupApply.JSON_ADAPTER.serialize(groupNotification.groupApply, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(groupNotification.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            jsonAdapter.serialize(Double.valueOf(groupNotification.updatedTime), jsonGenerator, true);
            String str3 = groupNotification.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupNotification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupNotification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupNotification new_() {
        GroupNotification groupNotification = new GroupNotification();
        groupNotification.nullCheck();
        return groupNotification;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupNotification mo223809clone() {
        GroupNotification groupNotification = new GroupNotification();
        groupNotification.f20406id = this.f20406id;
        groupNotification.type = this.type;
        GroupApply groupApply = this.groupApply;
        if (groupApply != null) {
            groupNotification.groupApply = groupApply.mo223809clone();
        }
        groupNotification.createdTime = this.createdTime;
        groupNotification.updatedTime = this.updatedTime;
        groupNotification.userId = this.userId;
        GroupApply groupApply2 = this.groupApplyData;
        if (groupApply2 != null) {
            groupNotification.groupApplyData = groupApply2.mo223809clone();
        }
        ChatGroup chatGroup = this.chatGroupData;
        if (chatGroup != null) {
            groupNotification.chatGroupData = chatGroup.mo223809clone();
        }
        User user = this.userData;
        if (user != null) {
            groupNotification.userData = user.mo223809clone();
        }
        return groupNotification;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupNotification)) {
            return false;
        }
        GroupNotification groupNotification = (GroupNotification) obj;
        return ValueObject.util_equals(this.f20406id, groupNotification.f20406id) && ValueObject.util_equals(this.type, groupNotification.type) && ValueObject.util_equals(this.groupApply, groupNotification.groupApply) && this.createdTime == groupNotification.createdTime && this.updatedTime == groupNotification.updatedTime && ValueObject.util_equals(this.userId, groupNotification.userId) && ValueObject.util_equals(this.groupApplyData, groupNotification.groupApplyData) && ValueObject.util_equals(this.chatGroupData, groupNotification.chatGroupData) && ValueObject.util_equals(this.userData, groupNotification.userData);
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
        String str = this.f20406id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        GroupApply groupApply = this.groupApply;
        int iHashCode3 = groupApply != null ? groupApply.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.updatedTime);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str3 = this.userId;
        int iHashCode4 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        GroupApply groupApply2 = this.groupApplyData;
        int iHashCode5 = (iHashCode4 + (groupApply2 != null ? groupApply2.hashCode() : 0)) * 41;
        ChatGroup chatGroup = this.chatGroupData;
        int iHashCode6 = (iHashCode5 + (chatGroup != null ? chatGroup.hashCode() : 0)) * 41;
        User user = this.userData;
        int iHashCode7 = iHashCode6 + (user != null ? user.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20406id == null) {
            this.f20406id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
