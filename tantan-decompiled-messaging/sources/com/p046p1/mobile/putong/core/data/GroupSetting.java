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
public class GroupSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupsetting";

    @NonNull
    @ProtobufIndex(index = 2)
    public String groupDescriptionEditTip;

    @NonNull
    @ProtobufIndex(index = 1)
    public String groupNameEditTip;

    @NonNull
    @ProtobufIndex(index = 4)
    public String groupNotificationsURL;

    @NonNull
    @ProtobufIndex(index = 3)
    public String groupSuggestURL;

    @ProtobufIndex(index = 5)
    public boolean groupTabRedDotShow;
    public static ProtobufAdapter<GroupSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupSetting>() { // from class: com.p1.mobile.putong.core.data.GroupSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupSetting groupSetting) {
            String str = groupSetting.groupNameEditTip;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = groupSetting.groupDescriptionEditTip;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = groupSetting.groupSuggestURL;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = groupSetting.groupNotificationsURL;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(5, groupSetting.groupTabRedDotShow);
            groupSetting.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupSetting parse(nb5 nb5Var) throws IOException {
            GroupSetting groupSetting = new GroupSetting();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (groupSetting.groupNameEditTip == null) {
                        groupSetting.groupNameEditTip = "";
                    }
                    if (groupSetting.groupDescriptionEditTip == null) {
                        groupSetting.groupDescriptionEditTip = "";
                    }
                    if (groupSetting.groupSuggestURL == null) {
                        groupSetting.groupSuggestURL = "";
                    }
                    if (groupSetting.groupNotificationsURL != null) {
                        break;
                    }
                    groupSetting.groupNotificationsURL = "";
                    break;
                }
                if (iM158752u == 10) {
                    groupSetting.groupNameEditTip = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    groupSetting.groupDescriptionEditTip = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    groupSetting.groupSuggestURL = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    groupSetting.groupNotificationsURL = nb5Var.m158750s();
                } else {
                    if (iM158752u != 40) {
                        if (groupSetting.groupNameEditTip == null) {
                            groupSetting.groupNameEditTip = "";
                        }
                        if (groupSetting.groupDescriptionEditTip == null) {
                            groupSetting.groupDescriptionEditTip = "";
                        }
                        if (groupSetting.groupSuggestURL == null) {
                            groupSetting.groupSuggestURL = "";
                        }
                        if (groupSetting.groupNotificationsURL != null) {
                            break;
                        }
                        groupSetting.groupNotificationsURL = "";
                        return groupSetting;
                    }
                    groupSetting.groupTabRedDotShow = nb5Var.m158738g();
                }
            }
            return groupSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupSetting groupSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupSetting.groupNameEditTip;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = groupSetting.groupDescriptionEditTip;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = groupSetting.groupSuggestURL;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = groupSetting.groupNotificationsURL;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17244A(5, groupSetting.groupTabRedDotShow);
        }
    };
    public static JsonAdapter<GroupSetting> JSON_ADAPTER = new ObjectJsonAdapter<GroupSetting>() { // from class: com.p1.mobile.putong.core.data.GroupSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupSetting.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupSetting newInstance() {
            return new GroupSetting();
        }

        public boolean parseField(GroupSetting groupSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "groupSuggestURL":
                    groupSetting.groupSuggestURL = jsonParser.getValueAsString();
                    return true;
                case "groupNotificationsURL":
                    groupSetting.groupNotificationsURL = jsonParser.getValueAsString();
                    return true;
                case "groupTabRedDotShow":
                    groupSetting.groupTabRedDotShow = jsonParser.getValueAsBoolean();
                    return true;
                case "groupNameEditTip":
                    groupSetting.groupNameEditTip = jsonParser.getValueAsString();
                    return true;
                case "groupDescriptionEditTip":
                    groupSetting.groupDescriptionEditTip = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupSetting groupSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "groupSuggestURL":
                case "groupNotificationsURL":
                case "groupTabRedDotShow":
                case "groupNameEditTip":
                case "groupDescriptionEditTip":
                    return true;
                default:
                    return super.parseFieldCheck(groupSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupSetting groupSetting, JsonGenerator jsonGenerator) throws IOException {
            String str = groupSetting.groupNameEditTip;
            if (str != null) {
                jsonGenerator.writeStringField("groupNameEditTip", str);
            }
            String str2 = groupSetting.groupDescriptionEditTip;
            if (str2 != null) {
                jsonGenerator.writeStringField("groupDescriptionEditTip", str2);
            }
            String str3 = groupSetting.groupSuggestURL;
            if (str3 != null) {
                jsonGenerator.writeStringField("groupSuggestURL", str3);
            }
            String str4 = groupSetting.groupNotificationsURL;
            if (str4 != null) {
                jsonGenerator.writeStringField("groupNotificationsURL", str4);
            }
            jsonGenerator.writeBooleanField("groupTabRedDotShow", groupSetting.groupTabRedDotShow);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupSetting new_() {
        GroupSetting groupSetting = new GroupSetting();
        groupSetting.nullCheck();
        return groupSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupSetting mo223809clone() {
        GroupSetting groupSetting = new GroupSetting();
        groupSetting.groupNameEditTip = this.groupNameEditTip;
        groupSetting.groupDescriptionEditTip = this.groupDescriptionEditTip;
        groupSetting.groupSuggestURL = this.groupSuggestURL;
        groupSetting.groupNotificationsURL = this.groupNotificationsURL;
        groupSetting.groupTabRedDotShow = this.groupTabRedDotShow;
        return groupSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupSetting)) {
            return false;
        }
        GroupSetting groupSetting = (GroupSetting) obj;
        return ValueObject.util_equals(this.groupNameEditTip, groupSetting.groupNameEditTip) && ValueObject.util_equals(this.groupDescriptionEditTip, groupSetting.groupDescriptionEditTip) && ValueObject.util_equals(this.groupSuggestURL, groupSetting.groupSuggestURL) && ValueObject.util_equals(this.groupNotificationsURL, groupSetting.groupNotificationsURL) && this.groupTabRedDotShow == groupSetting.groupTabRedDotShow;
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
        String str = this.groupNameEditTip;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.groupDescriptionEditTip;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.groupSuggestURL;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.groupNotificationsURL;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.groupTabRedDotShow ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.groupNameEditTip == null) {
            this.groupNameEditTip = "";
        }
        if (this.groupDescriptionEditTip == null) {
            this.groupDescriptionEditTip = "";
        }
        if (this.groupSuggestURL == null) {
            this.groupSuggestURL = "";
        }
        if (this.groupNotificationsURL == null) {
            this.groupNotificationsURL = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
