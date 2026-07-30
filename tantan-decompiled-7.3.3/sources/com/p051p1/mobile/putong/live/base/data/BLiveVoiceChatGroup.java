package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceChatGroup extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceChatGroup> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceChatGroup>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceChatGroup.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceChatGroup.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceChatGroup newInstance() {
            return new BLiveVoiceChatGroup();
        }

        public boolean parseField(BLiveVoiceChatGroup bLiveVoiceChatGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "chatGroupId":
                    bLiveVoiceChatGroup.chatGroupId = jsonParser.getValueAsString();
                    return true;
                case "chatGroupName":
                    bLiveVoiceChatGroup.chatGroupName = jsonParser.getValueAsString();
                    return true;
                case "chatGroupAvatar":
                    bLiveVoiceChatGroup.chatGroupAvatar = jsonParser.getValueAsString();
                    return true;
                case "maxMemberCount":
                    bLiveVoiceChatGroup.maxMemberCount = jsonParser.getValueAsInt();
                    return true;
                case "inChatGroup":
                    bLiveVoiceChatGroup.inChatGroup = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveVoiceChatGroup.f45339id = jsonParser.getValueAsString();
                    return false;
                case "chatGroupPermission":
                    bLiveVoiceChatGroup.chatGroupPermission = jsonParser.getValueAsBoolean();
                    return true;
                case "memberCount":
                    bLiveVoiceChatGroup.memberCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceChatGroup bLiveVoiceChatGroup, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceChatGroup.f45339id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("chatGroupPermission", bLiveVoiceChatGroup.chatGroupPermission);
            String str2 = bLiveVoiceChatGroup.chatGroupId;
            if (str2 != null) {
                jsonGenerator.writeStringField("chatGroupId", str2);
            }
            String str3 = bLiveVoiceChatGroup.chatGroupName;
            if (str3 != null) {
                jsonGenerator.writeStringField("chatGroupName", str3);
            }
            String str4 = bLiveVoiceChatGroup.chatGroupAvatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("chatGroupAvatar", str4);
            }
            jsonGenerator.writeNumberField("memberCount", bLiveVoiceChatGroup.memberCount);
            jsonGenerator.writeNumberField("maxMemberCount", bLiveVoiceChatGroup.maxMemberCount);
            jsonGenerator.writeBooleanField("inChatGroup", bLiveVoiceChatGroup.inChatGroup);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceChatGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicechatgroup";

    @NonNull
    @ProtobufIndex(index = 5)
    public String chatGroupAvatar;

    @NonNull
    @ProtobufIndex(index = 3)
    public String chatGroupId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String chatGroupName;

    @ProtobufIndex(index = 2)
    public boolean chatGroupPermission;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45339id;

    @ProtobufIndex(index = 8)
    public boolean inChatGroup;

    @ProtobufIndex(index = 7)
    public int maxMemberCount;

    @ProtobufIndex(index = 6)
    public int memberCount;

    public static BLiveVoiceChatGroup new_() {
        BLiveVoiceChatGroup bLiveVoiceChatGroup = new BLiveVoiceChatGroup();
        bLiveVoiceChatGroup.nullCheck();
        return bLiveVoiceChatGroup;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceChatGroup mo225055clone() {
        BLiveVoiceChatGroup bLiveVoiceChatGroup = new BLiveVoiceChatGroup();
        bLiveVoiceChatGroup.f45339id = this.f45339id;
        bLiveVoiceChatGroup.chatGroupPermission = this.chatGroupPermission;
        bLiveVoiceChatGroup.chatGroupId = this.chatGroupId;
        bLiveVoiceChatGroup.chatGroupName = this.chatGroupName;
        bLiveVoiceChatGroup.chatGroupAvatar = this.chatGroupAvatar;
        bLiveVoiceChatGroup.memberCount = this.memberCount;
        bLiveVoiceChatGroup.maxMemberCount = this.maxMemberCount;
        bLiveVoiceChatGroup.inChatGroup = this.inChatGroup;
        return bLiveVoiceChatGroup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceChatGroup)) {
            return false;
        }
        BLiveVoiceChatGroup bLiveVoiceChatGroup = (BLiveVoiceChatGroup) obj;
        return ValueObject.util_equals(this.f45339id, bLiveVoiceChatGroup.f45339id) && this.chatGroupPermission == bLiveVoiceChatGroup.chatGroupPermission && ValueObject.util_equals(this.chatGroupId, bLiveVoiceChatGroup.chatGroupId) && ValueObject.util_equals(this.chatGroupName, bLiveVoiceChatGroup.chatGroupName) && ValueObject.util_equals(this.chatGroupAvatar, bLiveVoiceChatGroup.chatGroupAvatar) && this.memberCount == bLiveVoiceChatGroup.memberCount && this.maxMemberCount == bLiveVoiceChatGroup.maxMemberCount && this.inChatGroup == bLiveVoiceChatGroup.inChatGroup;
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
        String str = this.f45339id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.chatGroupPermission ? 1231 : 1237)) * 41;
        String str2 = this.chatGroupId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.chatGroupName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.chatGroupAvatar;
        int iHashCode4 = ((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.memberCount) * 41) + this.maxMemberCount) * 41) + (this.inChatGroup ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45339id == null) {
            this.f45339id = "";
        }
        if (this.chatGroupId == null) {
            this.chatGroupId = "";
        }
        if (this.chatGroupName == null) {
            this.chatGroupName = "";
        }
        if (this.chatGroupAvatar == null) {
            this.chatGroupAvatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
