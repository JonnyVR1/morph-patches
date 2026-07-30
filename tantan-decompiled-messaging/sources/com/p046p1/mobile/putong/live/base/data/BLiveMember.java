package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.Reference;
import com.p046p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveMember extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMember> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMember>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMember.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMember.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMember newInstance() {
            return new BLiveMember();
        }

        public boolean parseField(BLiveMember bLiveMember, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userNameGradientColors":
                    bLiveMember.userNameGradientColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "reference":
                    bLiveMember.reference = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "entryTime":
                    bLiveMember.entryTime = jsonParser.getValueAsString();
                    return true;
                case "cpUserId":
                    bLiveMember.cpUserId = jsonParser.getValueAsString();
                    return true;
                case "identity":
                    bLiveMember.identity = jsonParser.getValueAsString();
                    return true;
                case "callConnections":
                    bLiveMember.callConnections = JsonAdapter.parseArray(jsonParser, BLiveCallConnection.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveMember.f44398id = jsonParser.getValueAsString();
                    return false;
                case "role":
                    bLiveMember.role = BLiveRole.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "type":
                    bLiveMember.type = jsonParser.getValueAsString();
                    return true;
                case "isManager":
                    bLiveMember.isManager = jsonParser.getValueAsBoolean();
                    return true;
                case "inviteStatus":
                    bLiveMember.inviteStatus = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMember bLiveMember, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMember.f44398id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveMember.reference != null) {
                jsonGenerator.writeFieldName(Reference.TYPE);
                Converter.USER_ID.serialize(bLiveMember.reference, jsonGenerator, true);
            }
            if (bLiveMember.role != null) {
                jsonGenerator.writeFieldName("role");
                BLiveRole.JSON_ADAPTER.serialize(bLiveMember.role, jsonGenerator, true);
            }
            String str2 = bLiveMember.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("isManager", bLiveMember.isManager);
            String str3 = bLiveMember.entryTime;
            if (str3 != null) {
                jsonGenerator.writeStringField("entryTime", str3);
            }
            String str4 = bLiveMember.inviteStatus;
            if (str4 != null) {
                jsonGenerator.writeStringField("inviteStatus", str4);
            }
            String str5 = bLiveMember.identity;
            if (str5 != null) {
                jsonGenerator.writeStringField("identity", str5);
            }
            String str6 = bLiveMember.cpUserId;
            if (str6 != null) {
                jsonGenerator.writeStringField("cpUserId", str6);
            }
            if (bLiveMember.callConnections != null) {
                jsonGenerator.writeFieldName("callConnections");
                JsonAdapter.serializeArray(bLiveMember.callConnections, jsonGenerator, BLiveCallConnection.JSON_ADAPTER);
            }
            if (bLiveMember.userNameGradientColors != null) {
                jsonGenerator.writeFieldName("userNameGradientColors");
                JsonAdapter.serializeArray(bLiveMember.userNameGradientColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMember) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String STATUS_INVITE_CAN_INVITE = "canInvite";
    public static final String STATUS_INVITE_INVITED = "invited";
    public static final String TYPE = "blivemember";

    @NonNull
    @ProtobufIndex(index = 61)
    public List<BLiveCallConnection> callConnections;

    @NonNull
    @ProtobufIndex(index = 60)
    public String cpUserId;

    @NonNull
    @ProtobufIndex(index = 57)
    public String entryTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 51)
    public String f44398id;

    @NonNull
    @ProtobufIndex(index = 59)
    public String identity;

    @NonNull
    @ProtobufIndex(index = 58)
    public String inviteStatus;

    @ProtobufIndex(index = 55)
    public boolean isManager;
    public BLiveUserLevel liveUserLevel;
    public BLiveUserMask liveUserMask;

    @NonNull
    @ProtobufIndex(index = 52)
    public String reference;

    @NonNull
    @ProtobufIndex(index = 53)
    public BLiveRole role;

    @NonNull
    @ProtobufIndex(index = 54)
    public String type;
    public User user;

    @NonNull
    @ProtobufIndex(index = 62)
    public List<String> userNameGradientColors;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68055a(String str) {
        return str;
    }

    public static BLiveMember new_() {
        BLiveMember bLiveMember = new BLiveMember();
        bLiveMember.nullCheck();
        return bLiveMember;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMember mo223809clone() {
        BLiveMember bLiveMember = new BLiveMember();
        bLiveMember.f44398id = this.f44398id;
        bLiveMember.reference = this.reference;
        bLiveMember.role = this.role;
        bLiveMember.type = this.type;
        bLiveMember.isManager = this.isManager;
        bLiveMember.entryTime = this.entryTime;
        bLiveMember.inviteStatus = this.inviteStatus;
        bLiveMember.identity = this.identity;
        bLiveMember.cpUserId = this.cpUserId;
        List<BLiveCallConnection> list = this.callConnections;
        if (list != null) {
            bLiveMember.callConnections = ValueObject.util_map(list, new w9j() { // from class: l.j22
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveCallConnection) obj).mo223809clone();
                }
            });
        }
        List<String> list2 = this.userNameGradientColors;
        if (list2 != null) {
            bLiveMember.userNameGradientColors = ValueObject.util_map(list2, new w9j() { // from class: l.k22
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveMember.m68055a((String) obj);
                }
            });
        }
        return bLiveMember;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMember)) {
            return false;
        }
        BLiveMember bLiveMember = (BLiveMember) obj;
        return ValueObject.util_equals(this.f44398id, bLiveMember.f44398id) && ValueObject.util_equals(this.reference, bLiveMember.reference) && ValueObject.util_equals(this.role, bLiveMember.role) && ValueObject.util_equals(this.type, bLiveMember.type) && this.isManager == bLiveMember.isManager && ValueObject.util_equals(this.entryTime, bLiveMember.entryTime) && ValueObject.util_equals(this.inviteStatus, bLiveMember.inviteStatus) && ValueObject.util_equals(this.identity, bLiveMember.identity) && ValueObject.util_equals(this.cpUserId, bLiveMember.cpUserId) && ValueObject.util_equals(this.callConnections, bLiveMember.callConnections) && ValueObject.util_equals(this.userNameGradientColors, bLiveMember.userNameGradientColors);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getId() {
        return this.f44398id;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f44398id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.reference;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveRole bLiveRole = this.role;
        int iHashCode3 = (iHashCode2 + (bLiveRole != null ? bLiveRole.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isManager ? 1231 : 1237)) * 41;
        String str4 = this.entryTime;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.inviteStatus;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.identity;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.cpUserId;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        List<BLiveCallConnection> list = this.callConnections;
        int iHashCode9 = (iHashCode8 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.userNameGradientColors;
        int iHashCode10 = iHashCode9 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44398id == null) {
            this.f44398id = "";
        }
        if (this.reference == null) {
            this.reference = "";
        }
        if (this.role == null) {
            this.role = (BLiveRole) BLiveRole.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.entryTime == null) {
            this.entryTime = "";
        }
        if (this.inviteStatus == null) {
            this.inviteStatus = "";
        }
        if (this.identity == null) {
            this.identity = "";
        }
        if (this.cpUserId == null) {
            this.cpUserId = "";
        }
        if (this.callConnections == null) {
            this.callConnections = new ArrayList();
        }
        if (this.userNameGradientColors == null) {
            this.userNameGradientColors = new ArrayList();
        }
    }

    public BLiveMember subtract(BLiveMember bLiveMember) {
        BLiveMember bLiveMember2 = new BLiveMember();
        if (!ValueObject.util_equals(this.f44398id, bLiveMember.f44398id)) {
            bLiveMember2.f44398id = this.f44398id;
        }
        if (!ValueObject.util_equals(this.reference, bLiveMember.reference)) {
            bLiveMember2.reference = this.reference;
        }
        if (!ValueObject.util_equals(this.role, bLiveMember.role)) {
            bLiveMember2.role = this.role;
        }
        if (!ValueObject.util_equals(this.type, bLiveMember.type)) {
            bLiveMember2.type = this.type;
        }
        if (!ValueObject.util_equals(this.entryTime, bLiveMember.entryTime)) {
            bLiveMember2.entryTime = this.entryTime;
        }
        if (!ValueObject.util_equals(this.inviteStatus, bLiveMember.inviteStatus)) {
            bLiveMember2.inviteStatus = this.inviteStatus;
        }
        if (!ValueObject.util_equals(this.identity, bLiveMember.identity)) {
            bLiveMember2.identity = this.identity;
        }
        if (!ValueObject.util_equals(this.cpUserId, bLiveMember.cpUserId)) {
            bLiveMember2.cpUserId = this.cpUserId;
        }
        if (!ValueObject.util_equals(this.callConnections, bLiveMember.callConnections)) {
            bLiveMember2.callConnections = this.callConnections;
        }
        if (!ValueObject.util_equals(this.userNameGradientColors, bLiveMember.userNameGradientColors)) {
            bLiveMember2.userNameGradientColors = this.userNameGradientColors;
        }
        if (bLiveMember2.equals(new BLiveMember())) {
            return null;
        }
        return bLiveMember2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
