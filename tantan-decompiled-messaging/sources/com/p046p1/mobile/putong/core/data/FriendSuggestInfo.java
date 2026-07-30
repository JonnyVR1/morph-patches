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
public class FriendSuggestInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "friendsuggestinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String forceText;

    @NonNull
    @ProtobufIndex(index = 5)
    public InteractionType interactionType;

    @NonNull
    @ProtobufIndex(index = 3)
    public FriendSuggestReason reason;

    @NonNull
    @ProtobufIndex(index = 6)
    public Relation relation;

    @NonNull
    @ProtobufIndex(index = 7)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<FriendSuggestInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FriendSuggestInfo>() { // from class: com.p1.mobile.putong.core.data.FriendSuggestInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FriendSuggestInfo friendSuggestInfo) {
            String str = friendSuggestInfo.forceText;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = friendSuggestInfo.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            FriendSuggestReason friendSuggestReason = friendSuggestInfo.reason;
            if (friendSuggestReason != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(3, friendSuggestReason.ordinal());
            }
            FriendSuggestReason friendSuggestReason2 = friendSuggestInfo.reason;
            if (friendSuggestReason2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, friendSuggestReason2, FriendSuggestReason.PROTOBUF_ADAPTER);
            }
            InteractionType interactionType = friendSuggestInfo.interactionType;
            if (interactionType != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, interactionType, InteractionType.PROTOBUF_ADAPTER);
            }
            Relation relation = friendSuggestInfo.relation;
            if (relation != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, relation, Relation.PROTOBUF_ADAPTER);
            }
            String str3 = friendSuggestInfo.roomId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str3);
            }
            friendSuggestInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FriendSuggestInfo parse(nb5 nb5Var) throws IOException {
            FriendSuggestInfo friendSuggestInfo = new FriendSuggestInfo();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (friendSuggestInfo.reason == null && numValueOf != null) {
                        friendSuggestInfo.reason = (FriendSuggestReason) FriendSuggestReason.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (friendSuggestInfo.forceText == null) {
                        friendSuggestInfo.forceText = "";
                    }
                    if (friendSuggestInfo.text == null) {
                        friendSuggestInfo.text = "";
                    }
                    if (friendSuggestInfo.reason == null) {
                        friendSuggestInfo.reason = (FriendSuggestReason) FriendSuggestReason.JSON_ADAPTER.defaultEnum();
                    }
                    if (friendSuggestInfo.interactionType == null) {
                        friendSuggestInfo.interactionType = (InteractionType) InteractionType.JSON_ADAPTER.defaultEnum();
                    }
                    if (friendSuggestInfo.relation == null) {
                        friendSuggestInfo.relation = (Relation) Relation.JSON_ADAPTER.defaultEnum();
                    }
                    if (friendSuggestInfo.roomId != null) {
                        break;
                    }
                    friendSuggestInfo.roomId = "";
                    break;
                }
                if (iM158752u == 10) {
                    friendSuggestInfo.forceText = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    friendSuggestInfo.text = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 34) {
                    friendSuggestInfo.reason = (FriendSuggestReason) nb5Var.m158743l(FriendSuggestReason.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    friendSuggestInfo.interactionType = (InteractionType) nb5Var.m158743l(InteractionType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 50) {
                    friendSuggestInfo.relation = (Relation) nb5Var.m158743l(Relation.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 58) {
                        if (friendSuggestInfo.reason == null && numValueOf != null) {
                            friendSuggestInfo.reason = (FriendSuggestReason) FriendSuggestReason.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (friendSuggestInfo.forceText == null) {
                            friendSuggestInfo.forceText = "";
                        }
                        if (friendSuggestInfo.text == null) {
                            friendSuggestInfo.text = "";
                        }
                        if (friendSuggestInfo.reason == null) {
                            friendSuggestInfo.reason = (FriendSuggestReason) FriendSuggestReason.JSON_ADAPTER.defaultEnum();
                        }
                        if (friendSuggestInfo.interactionType == null) {
                            friendSuggestInfo.interactionType = (InteractionType) InteractionType.JSON_ADAPTER.defaultEnum();
                        }
                        if (friendSuggestInfo.relation == null) {
                            friendSuggestInfo.relation = (Relation) Relation.JSON_ADAPTER.defaultEnum();
                        }
                        if (friendSuggestInfo.roomId != null) {
                            break;
                        }
                        friendSuggestInfo.roomId = "";
                        return friendSuggestInfo;
                    }
                    friendSuggestInfo.roomId = nb5Var.m158750s();
                }
            }
            return friendSuggestInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FriendSuggestInfo friendSuggestInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = friendSuggestInfo.forceText;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = friendSuggestInfo.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            FriendSuggestReason friendSuggestReason = friendSuggestInfo.reason;
            if (friendSuggestReason != null) {
                codedOutputByteBufferNano.m17250G(3, friendSuggestReason.ordinal());
            }
            FriendSuggestReason friendSuggestReason2 = friendSuggestInfo.reason;
            if (friendSuggestReason2 != null) {
                codedOutputByteBufferNano.m17254K(4, friendSuggestReason2, FriendSuggestReason.PROTOBUF_ADAPTER);
            }
            InteractionType interactionType = friendSuggestInfo.interactionType;
            if (interactionType != null) {
                codedOutputByteBufferNano.m17254K(5, interactionType, InteractionType.PROTOBUF_ADAPTER);
            }
            Relation relation = friendSuggestInfo.relation;
            if (relation != null) {
                codedOutputByteBufferNano.m17254K(6, relation, Relation.PROTOBUF_ADAPTER);
            }
            String str3 = friendSuggestInfo.roomId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(7, str3);
            }
        }
    };
    public static JsonAdapter<FriendSuggestInfo> JSON_ADAPTER = new ObjectJsonAdapter<FriendSuggestInfo>() { // from class: com.p1.mobile.putong.core.data.FriendSuggestInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FriendSuggestInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FriendSuggestInfo newInstance() {
            return new FriendSuggestInfo();
        }

        public boolean parseField(FriendSuggestInfo friendSuggestInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "interactionType":
                    friendSuggestInfo.interactionType = InteractionType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "reason":
                    friendSuggestInfo.reason = FriendSuggestReason.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "roomId":
                    friendSuggestInfo.roomId = jsonParser.getValueAsString();
                    return true;
                case "relation":
                    friendSuggestInfo.relation = Relation.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "text":
                    friendSuggestInfo.text = jsonParser.getValueAsString();
                    return true;
                case "forceText":
                    friendSuggestInfo.forceText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FriendSuggestInfo friendSuggestInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "interactionType":
                case "reason":
                case "roomId":
                case "relation":
                case "text":
                case "forceText":
                    return true;
                default:
                    return super.parseFieldCheck(friendSuggestInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FriendSuggestInfo friendSuggestInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = friendSuggestInfo.forceText;
            if (str != null) {
                jsonGenerator.writeStringField("forceText", str);
            }
            String str2 = friendSuggestInfo.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            if (friendSuggestInfo.reason != null) {
                jsonGenerator.writeFieldName(Reason.TYPE);
                FriendSuggestReason.JSON_ADAPTER.serialize(friendSuggestInfo.reason, jsonGenerator, true);
            }
            if (friendSuggestInfo.interactionType != null) {
                jsonGenerator.writeFieldName("interactionType");
                InteractionType.JSON_ADAPTER.serialize(friendSuggestInfo.interactionType, jsonGenerator, true);
            }
            if (friendSuggestInfo.relation != null) {
                jsonGenerator.writeFieldName("relation");
                Relation.JSON_ADAPTER.serialize(friendSuggestInfo.relation, jsonGenerator, true);
            }
            String str3 = friendSuggestInfo.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendSuggestInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendSuggestInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FriendSuggestInfo new_() {
        FriendSuggestInfo friendSuggestInfo = new FriendSuggestInfo();
        friendSuggestInfo.nullCheck();
        return friendSuggestInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FriendSuggestInfo mo223809clone() {
        FriendSuggestInfo friendSuggestInfo = new FriendSuggestInfo();
        friendSuggestInfo.forceText = this.forceText;
        friendSuggestInfo.text = this.text;
        friendSuggestInfo.reason = this.reason;
        friendSuggestInfo.interactionType = this.interactionType;
        friendSuggestInfo.relation = this.relation;
        friendSuggestInfo.roomId = this.roomId;
        return friendSuggestInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendSuggestInfo)) {
            return false;
        }
        FriendSuggestInfo friendSuggestInfo = (FriendSuggestInfo) obj;
        return ValueObject.util_equals(this.forceText, friendSuggestInfo.forceText) && ValueObject.util_equals(this.text, friendSuggestInfo.text) && ValueObject.util_equals(this.reason, friendSuggestInfo.reason) && ValueObject.util_equals(this.interactionType, friendSuggestInfo.interactionType) && ValueObject.util_equals(this.relation, friendSuggestInfo.relation) && ValueObject.util_equals(this.roomId, friendSuggestInfo.roomId);
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
        String str = this.forceText;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        FriendSuggestReason friendSuggestReason = this.reason;
        int iHashCode3 = (iHashCode2 + (friendSuggestReason != null ? friendSuggestReason.hashCode() : 0)) * 41;
        InteractionType interactionType = this.interactionType;
        int iHashCode4 = (iHashCode3 + (interactionType != null ? interactionType.hashCode() : 0)) * 41;
        Relation relation = this.relation;
        int iHashCode5 = (iHashCode4 + (relation != null ? relation.hashCode() : 0)) * 41;
        String str3 = this.roomId;
        int iHashCode6 = iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.forceText == null) {
            this.forceText = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.reason == null) {
            this.reason = (FriendSuggestReason) FriendSuggestReason.JSON_ADAPTER.defaultEnum();
        }
        if (this.interactionType == null) {
            this.interactionType = (InteractionType) InteractionType.JSON_ADAPTER.defaultEnum();
        }
        if (this.relation == null) {
            this.relation = (Relation) Relation.JSON_ADAPTER.defaultEnum();
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
