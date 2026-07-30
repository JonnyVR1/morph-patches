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
public class FriendSuggestInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "friendsuggestinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String forceText;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public InteractionType interactionType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public FriendSuggestReason reason;

    @NonNull
    @ProtobufIndex(index = 6)
    public Relation relation;

    @NonNull
    @ProtobufIndex(index = 7)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;
    public static ProtobufAdapter<FriendSuggestInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FriendSuggestInfo>() { // from class: com.p1.mobile.putong.core.data.FriendSuggestInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FriendSuggestInfo friendSuggestInfo) {
            String str = friendSuggestInfo.forceText;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = friendSuggestInfo.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            FriendSuggestReason friendSuggestReason = friendSuggestInfo.reason;
            if (friendSuggestReason != null) {
                iO += CodedOutputByteBufferNano.h(3, friendSuggestReason.ordinal());
            }
            FriendSuggestReason friendSuggestReason2 = friendSuggestInfo.reason;
            if (friendSuggestReason2 != null) {
                iO += CodedOutputByteBufferNano.l(4, friendSuggestReason2, FriendSuggestReason.PROTOBUF_ADAPTER);
            }
            InteractionType interactionType = friendSuggestInfo.interactionType;
            if (interactionType != null) {
                iO += CodedOutputByteBufferNano.l(5, interactionType, InteractionType.PROTOBUF_ADAPTER);
            }
            Relation relation = friendSuggestInfo.relation;
            if (relation != null) {
                iO += CodedOutputByteBufferNano.l(6, relation, Relation.PROTOBUF_ADAPTER);
            }
            String str3 = friendSuggestInfo.roomId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(7, str3);
            }
            ((MessageNano) friendSuggestInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FriendSuggestInfo m12857parse(nb5 nb5Var) throws IOException {
            FriendSuggestInfo friendSuggestInfo = new FriendSuggestInfo();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (friendSuggestInfo.reason == null && numValueOf != null) {
                        friendSuggestInfo.reason = (FriendSuggestReason) FriendSuggestReason.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                if (iU == 10) {
                    friendSuggestInfo.forceText = nb5Var.s();
                } else if (iU == 18) {
                    friendSuggestInfo.text = nb5Var.s();
                } else if (iU == 24) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 34) {
                    friendSuggestInfo.reason = (FriendSuggestReason) nb5Var.l(FriendSuggestReason.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    friendSuggestInfo.interactionType = (InteractionType) nb5Var.l(InteractionType.PROTOBUF_ADAPTER);
                } else if (iU == 50) {
                    friendSuggestInfo.relation = (Relation) nb5Var.l(Relation.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 58) {
                        if (friendSuggestInfo.reason == null && numValueOf != null) {
                            friendSuggestInfo.reason = (FriendSuggestReason) FriendSuggestReason.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                    friendSuggestInfo.roomId = nb5Var.s();
                }
            }
            return friendSuggestInfo;
        }

        public void serialize(FriendSuggestInfo friendSuggestInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = friendSuggestInfo.forceText;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = friendSuggestInfo.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            FriendSuggestReason friendSuggestReason = friendSuggestInfo.reason;
            if (friendSuggestReason != null) {
                codedOutputByteBufferNano.G(3, friendSuggestReason.ordinal());
            }
            FriendSuggestReason friendSuggestReason2 = friendSuggestInfo.reason;
            if (friendSuggestReason2 != null) {
                codedOutputByteBufferNano.K(4, friendSuggestReason2, FriendSuggestReason.PROTOBUF_ADAPTER);
            }
            InteractionType interactionType = friendSuggestInfo.interactionType;
            if (interactionType != null) {
                codedOutputByteBufferNano.K(5, interactionType, InteractionType.PROTOBUF_ADAPTER);
            }
            Relation relation = friendSuggestInfo.relation;
            if (relation != null) {
                codedOutputByteBufferNano.K(6, relation, Relation.PROTOBUF_ADAPTER);
            }
            String str3 = friendSuggestInfo.roomId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(7, str3);
            }
        }
    };
    public static JsonAdapter<FriendSuggestInfo> JSON_ADAPTER = new ObjectJsonAdapter<FriendSuggestInfo>() { // from class: com.p1.mobile.putong.core.data.FriendSuggestInfo.2
        public Class getDataClass() {
            return FriendSuggestInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FriendSuggestInfo m12858newInstance() {
            return new FriendSuggestInfo();
        }

        public boolean parseField(FriendSuggestInfo friendSuggestInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "interactionType":
                    friendSuggestInfo.interactionType = (InteractionType) InteractionType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "reason":
                    friendSuggestInfo.reason = (FriendSuggestReason) FriendSuggestReason.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "roomId":
                    friendSuggestInfo.roomId = jsonParser.getValueAsString();
                    return true;
                case "relation":
                    friendSuggestInfo.relation = (Relation) Relation.JSON_ADAPTER.parse(jsonParser, str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendSuggestInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendSuggestInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FriendSuggestInfo new_() {
        FriendSuggestInfo friendSuggestInfo = new FriendSuggestInfo();
        friendSuggestInfo.nullCheck();
        return friendSuggestInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FriendSuggestInfo m12856clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
