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
public class GroupSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupsetting";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String groupDescriptionEditTip;

    @NonNull
    @ProtobufIndex(index = 1)
    public String groupNameEditTip;

    @NonNull
    @ProtobufIndex(index = 4)
    public String groupNotificationsURL;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String groupSuggestURL;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean groupTabRedDotShow;
    public static ProtobufAdapter<GroupSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupSetting>() { // from class: com.p1.mobile.putong.core.data.GroupSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GroupSetting groupSetting) {
            String str = groupSetting.groupNameEditTip;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = groupSetting.groupDescriptionEditTip;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = groupSetting.groupSuggestURL;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = groupSetting.groupNotificationsURL;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, groupSetting.groupTabRedDotShow);
            ((MessageNano) groupSetting).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GroupSetting m13103parse(nb5 nb5Var) throws IOException {
            GroupSetting groupSetting = new GroupSetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    groupSetting.groupNameEditTip = nb5Var.s();
                } else if (iU == 18) {
                    groupSetting.groupDescriptionEditTip = nb5Var.s();
                } else if (iU == 26) {
                    groupSetting.groupSuggestURL = nb5Var.s();
                } else if (iU == 34) {
                    groupSetting.groupNotificationsURL = nb5Var.s();
                } else {
                    if (iU != 40) {
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
                    groupSetting.groupTabRedDotShow = nb5Var.g();
                }
            }
            return groupSetting;
        }

        public void serialize(GroupSetting groupSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupSetting.groupNameEditTip;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = groupSetting.groupDescriptionEditTip;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = groupSetting.groupSuggestURL;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = groupSetting.groupNotificationsURL;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.A(5, groupSetting.groupTabRedDotShow);
        }
    };
    public static JsonAdapter<GroupSetting> JSON_ADAPTER = new ObjectJsonAdapter<GroupSetting>() { // from class: com.p1.mobile.putong.core.data.GroupSetting.2
        public Class getDataClass() {
            return GroupSetting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GroupSetting m13104newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupSetting new_() {
        GroupSetting groupSetting = new GroupSetting();
        groupSetting.nullCheck();
        return groupSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GroupSetting m13102clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
