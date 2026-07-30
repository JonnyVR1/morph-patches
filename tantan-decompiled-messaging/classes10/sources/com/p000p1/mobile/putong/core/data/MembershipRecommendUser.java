package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.RelationshipStatus;
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
public class MembershipRecommendUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "membershiprecommenduser";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f101id;

    @NonNull
    @ProtobufIndex(index = 4)
    public RelationshipStatus otherStatus;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public PicksTagType picksTagType;

    @NonNull
    @ProtobufIndex(index = 6)
    public String picksTracker;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public RelationshipStatus status;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MembershipRecommendUserType type;
    public static ProtobufAdapter<MembershipRecommendUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<MembershipRecommendUser>() { // from class: com.p1.mobile.putong.core.data.MembershipRecommendUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MembershipRecommendUser membershipRecommendUser) {
            String str = membershipRecommendUser.f101id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            MembershipRecommendUserType membershipRecommendUserType = membershipRecommendUser.type;
            if (membershipRecommendUserType != null) {
                iO += CodedOutputByteBufferNano.l(2, membershipRecommendUserType, MembershipRecommendUserType.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus = membershipRecommendUser.status;
            if (relationshipStatus != null) {
                iO += CodedOutputByteBufferNano.l(3, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = membershipRecommendUser.otherStatus;
            if (relationshipStatus2 != null) {
                iO += CodedOutputByteBufferNano.l(4, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            PicksTagType picksTagType = membershipRecommendUser.picksTagType;
            if (picksTagType != null) {
                iO += CodedOutputByteBufferNano.l(5, picksTagType, PicksTagType.PROTOBUF_ADAPTER);
            }
            String str2 = membershipRecommendUser.picksTracker;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(6, str2);
            }
            ((MessageNano) membershipRecommendUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MembershipRecommendUser m14121parse(nb5 nb5Var) throws IOException {
            MembershipRecommendUser membershipRecommendUser = new MembershipRecommendUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (membershipRecommendUser.f101id == null) {
                        membershipRecommendUser.f101id = "";
                    }
                    if (membershipRecommendUser.type == null) {
                        membershipRecommendUser.type = (MembershipRecommendUserType) MembershipRecommendUserType.JSON_ADAPTER.defaultEnum();
                    }
                    if (membershipRecommendUser.status == null) {
                        membershipRecommendUser.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (membershipRecommendUser.otherStatus == null) {
                        membershipRecommendUser.otherStatus = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (membershipRecommendUser.picksTagType == null) {
                        membershipRecommendUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                    }
                    if (membershipRecommendUser.picksTracker != null) {
                        break;
                    }
                    membershipRecommendUser.picksTracker = "";
                    break;
                }
                if (iU == 10) {
                    membershipRecommendUser.f101id = nb5Var.s();
                } else if (iU == 18) {
                    membershipRecommendUser.type = (MembershipRecommendUserType) nb5Var.l(MembershipRecommendUserType.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    membershipRecommendUser.status = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    membershipRecommendUser.otherStatus = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    membershipRecommendUser.picksTagType = (PicksTagType) nb5Var.l(PicksTagType.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (membershipRecommendUser.f101id == null) {
                            membershipRecommendUser.f101id = "";
                        }
                        if (membershipRecommendUser.type == null) {
                            membershipRecommendUser.type = (MembershipRecommendUserType) MembershipRecommendUserType.JSON_ADAPTER.defaultEnum();
                        }
                        if (membershipRecommendUser.status == null) {
                            membershipRecommendUser.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (membershipRecommendUser.otherStatus == null) {
                            membershipRecommendUser.otherStatus = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (membershipRecommendUser.picksTagType == null) {
                            membershipRecommendUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                        }
                        if (membershipRecommendUser.picksTracker != null) {
                            break;
                        }
                        membershipRecommendUser.picksTracker = "";
                        return membershipRecommendUser;
                    }
                    membershipRecommendUser.picksTracker = nb5Var.s();
                }
            }
            return membershipRecommendUser;
        }

        public void serialize(MembershipRecommendUser membershipRecommendUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = membershipRecommendUser.f101id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            MembershipRecommendUserType membershipRecommendUserType = membershipRecommendUser.type;
            if (membershipRecommendUserType != null) {
                codedOutputByteBufferNano.K(2, membershipRecommendUserType, MembershipRecommendUserType.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus = membershipRecommendUser.status;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.K(3, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = membershipRecommendUser.otherStatus;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.K(4, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            PicksTagType picksTagType = membershipRecommendUser.picksTagType;
            if (picksTagType != null) {
                codedOutputByteBufferNano.K(5, picksTagType, PicksTagType.PROTOBUF_ADAPTER);
            }
            String str2 = membershipRecommendUser.picksTracker;
            if (str2 != null) {
                codedOutputByteBufferNano.R(6, str2);
            }
        }
    };
    public static JsonAdapter<MembershipRecommendUser> JSON_ADAPTER = new ObjectJsonAdapter<MembershipRecommendUser>() { // from class: com.p1.mobile.putong.core.data.MembershipRecommendUser.2
        public Class getDataClass() {
            return MembershipRecommendUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MembershipRecommendUser m14122newInstance() {
            return new MembershipRecommendUser();
        }

        public boolean parseField(MembershipRecommendUser membershipRecommendUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picksTagType":
                    membershipRecommendUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "otherStatus":
                    membershipRecommendUser.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "picksTracker":
                    membershipRecommendUser.picksTracker = jsonParser.getValueAsString();
                    return true;
                case "status":
                    membershipRecommendUser.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    membershipRecommendUser.f101id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    membershipRecommendUser.type = (MembershipRecommendUserType) MembershipRecommendUserType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MembershipRecommendUser membershipRecommendUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picksTagType":
                case "otherStatus":
                case "picksTracker":
                case "status":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(membershipRecommendUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MembershipRecommendUser membershipRecommendUser, JsonGenerator jsonGenerator) throws IOException {
            String str = membershipRecommendUser.f101id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (membershipRecommendUser.type != null) {
                jsonGenerator.writeFieldName("type");
                MembershipRecommendUserType.JSON_ADAPTER.serialize(membershipRecommendUser.type, jsonGenerator, true);
            }
            if (membershipRecommendUser.status != null) {
                jsonGenerator.writeFieldName("status");
                RelationshipStatus.JSON_ADAPTER.serialize(membershipRecommendUser.status, jsonGenerator, true);
            }
            if (membershipRecommendUser.otherStatus != null) {
                jsonGenerator.writeFieldName("otherStatus");
                RelationshipStatus.JSON_ADAPTER.serialize(membershipRecommendUser.otherStatus, jsonGenerator, true);
            }
            if (membershipRecommendUser.picksTagType != null) {
                jsonGenerator.writeFieldName("picksTagType");
                PicksTagType.JSON_ADAPTER.serialize(membershipRecommendUser.picksTagType, jsonGenerator, true);
            }
            String str2 = membershipRecommendUser.picksTracker;
            if (str2 != null) {
                jsonGenerator.writeStringField("picksTracker", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MembershipRecommendUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MembershipRecommendUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MembershipRecommendUser new_() {
        MembershipRecommendUser membershipRecommendUser = new MembershipRecommendUser();
        membershipRecommendUser.nullCheck();
        return membershipRecommendUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MembershipRecommendUser m14120clone() {
        MembershipRecommendUser membershipRecommendUser = new MembershipRecommendUser();
        membershipRecommendUser.f101id = this.f101id;
        membershipRecommendUser.type = this.type;
        membershipRecommendUser.status = this.status;
        membershipRecommendUser.otherStatus = this.otherStatus;
        membershipRecommendUser.picksTagType = this.picksTagType;
        membershipRecommendUser.picksTracker = this.picksTracker;
        return membershipRecommendUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MembershipRecommendUser)) {
            return false;
        }
        MembershipRecommendUser membershipRecommendUser = (MembershipRecommendUser) obj;
        return ValueObject.util_equals(this.f101id, membershipRecommendUser.f101id) && ValueObject.util_equals(this.type, membershipRecommendUser.type) && ValueObject.util_equals(this.status, membershipRecommendUser.status) && ValueObject.util_equals(this.otherStatus, membershipRecommendUser.otherStatus) && ValueObject.util_equals(this.picksTagType, membershipRecommendUser.picksTagType) && ValueObject.util_equals(this.picksTracker, membershipRecommendUser.picksTracker);
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
        String str = this.f101id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        MembershipRecommendUserType membershipRecommendUserType = this.type;
        int iHashCode2 = (iHashCode + (membershipRecommendUserType != null ? membershipRecommendUserType.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus = this.status;
        int iHashCode3 = (iHashCode2 + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus2 = this.otherStatus;
        int iHashCode4 = (iHashCode3 + (relationshipStatus2 != null ? relationshipStatus2.hashCode() : 0)) * 41;
        PicksTagType picksTagType = this.picksTagType;
        int iHashCode5 = (iHashCode4 + (picksTagType != null ? picksTagType.hashCode() : 0)) * 41;
        String str2 = this.picksTracker;
        int iHashCode6 = iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.f101id == null) {
            this.f101id = "";
        }
        if (this.type == null) {
            this.type = (MembershipRecommendUserType) MembershipRecommendUserType.JSON_ADAPTER.defaultEnum();
        }
        if (this.status == null) {
            this.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.otherStatus == null) {
            this.otherStatus = RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.picksTagType == null) {
            this.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
