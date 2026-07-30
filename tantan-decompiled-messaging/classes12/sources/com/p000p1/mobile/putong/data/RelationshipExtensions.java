package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RelationshipExtensions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "relationshipextensions";

    @NonNull
    @ProtobufIndex(index = 10)
    public String business_type;

    @NonNull
    @ProtobufIndex(index = 1)
    public String letter;

    @NonNull
    @ProtobufIndex(index = 8)
    public String literatureCommentId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String literatureId;

    @NonNull
    @ProtobufIndex(index = 13)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherLetter;

    @NonNull
    @ProtobufIndex(index = 7)
    public String otherLiteratureCommentId;

    @NonNull
    @ProtobufIndex(index = 14)
    public String otherMomentId;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public RelationshipStatus otherRelationType;

    @NonNull
    @ProtobufIndex(index = 12)
    public String recvSuperLikedNum;

    @NonNull
    @ProtobufIndex(index = 15)
    public RelationshipStatus relationType;

    @NonNull
    @ProtobufIndex(index = 17)
    public String roomID;

    @NonNull
    @ProtobufIndex(index = 11)
    public String sendSuperLikedNum;

    @ProtobufIndex(index = 5)
    public int soulScore;

    @NonNull
    @ProtobufIndex(index = 3)
    public String superlikeNum;

    @NonNull
    @ProtobufIndex(index = 4)
    public SuperlikeReason superlikeReason;
    public static ProtobufAdapter<RelationshipExtensions> PROTOBUF_ADAPTER = new MessageNanoAdapter<RelationshipExtensions>() { // from class: com.p1.mobile.putong.data.RelationshipExtensions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RelationshipExtensions relationshipExtensions) {
            String str = relationshipExtensions.letter;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = relationshipExtensions.otherLetter;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = relationshipExtensions.superlikeNum;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            SuperlikeReason superlikeReason = relationshipExtensions.superlikeReason;
            if (superlikeReason != null) {
                iO += CodedOutputByteBufferNano.h(4, superlikeReason.ordinal());
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, relationshipExtensions.soulScore);
            SuperlikeReason superlikeReason2 = relationshipExtensions.superlikeReason;
            if (superlikeReason2 != null) {
                iH += CodedOutputByteBufferNano.l(6, superlikeReason2, SuperlikeReason.PROTOBUF_ADAPTER);
            }
            String str4 = relationshipExtensions.otherLiteratureCommentId;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(7, str4);
            }
            String str5 = relationshipExtensions.literatureCommentId;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(8, str5);
            }
            String str6 = relationshipExtensions.literatureId;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(9, str6);
            }
            String str7 = relationshipExtensions.business_type;
            if (str7 != null) {
                iH += CodedOutputByteBufferNano.o(10, str7);
            }
            String str8 = relationshipExtensions.sendSuperLikedNum;
            if (str8 != null) {
                iH += CodedOutputByteBufferNano.o(11, str8);
            }
            String str9 = relationshipExtensions.recvSuperLikedNum;
            if (str9 != null) {
                iH += CodedOutputByteBufferNano.o(12, str9);
            }
            String str10 = relationshipExtensions.momentId;
            if (str10 != null) {
                iH += CodedOutputByteBufferNano.o(13, str10);
            }
            String str11 = relationshipExtensions.otherMomentId;
            if (str11 != null) {
                iH += CodedOutputByteBufferNano.o(14, str11);
            }
            RelationshipStatus relationshipStatus = relationshipExtensions.relationType;
            if (relationshipStatus != null) {
                iH += CodedOutputByteBufferNano.l(15, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = relationshipExtensions.otherRelationType;
            if (relationshipStatus2 != null) {
                iH += CodedOutputByteBufferNano.l(16, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            String str12 = relationshipExtensions.roomID;
            if (str12 != null) {
                iH += CodedOutputByteBufferNano.o(17, str12);
            }
            ((MessageNano) relationshipExtensions).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RelationshipExtensions m18899parse(nb5 nb5Var) throws IOException {
            RelationshipExtensions relationshipExtensions = new RelationshipExtensions();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (relationshipExtensions.superlikeReason == null && numValueOf != null) {
                            relationshipExtensions.superlikeReason = (SuperlikeReason) SuperlikeReason.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (relationshipExtensions.letter == null) {
                            relationshipExtensions.letter = "";
                        }
                        if (relationshipExtensions.otherLetter == null) {
                            relationshipExtensions.otherLetter = "";
                        }
                        if (relationshipExtensions.superlikeNum == null) {
                            relationshipExtensions.superlikeNum = "";
                        }
                        if (relationshipExtensions.superlikeReason == null) {
                            relationshipExtensions.superlikeReason = (SuperlikeReason) SuperlikeReason.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationshipExtensions.otherLiteratureCommentId == null) {
                            relationshipExtensions.otherLiteratureCommentId = "";
                        }
                        if (relationshipExtensions.literatureCommentId == null) {
                            relationshipExtensions.literatureCommentId = "";
                        }
                        if (relationshipExtensions.literatureId == null) {
                            relationshipExtensions.literatureId = "";
                        }
                        if (relationshipExtensions.business_type == null) {
                            relationshipExtensions.business_type = "";
                        }
                        if (relationshipExtensions.sendSuperLikedNum == null) {
                            relationshipExtensions.sendSuperLikedNum = "";
                        }
                        if (relationshipExtensions.recvSuperLikedNum == null) {
                            relationshipExtensions.recvSuperLikedNum = "";
                        }
                        if (relationshipExtensions.momentId == null) {
                            relationshipExtensions.momentId = "";
                        }
                        if (relationshipExtensions.otherMomentId == null) {
                            relationshipExtensions.otherMomentId = "";
                        }
                        if (relationshipExtensions.relationType == null) {
                            relationshipExtensions.relationType = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationshipExtensions.otherRelationType == null) {
                            relationshipExtensions.otherRelationType = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationshipExtensions.roomID == null) {
                            relationshipExtensions.roomID = "";
                        }
                        break;
                    case 10:
                        relationshipExtensions.letter = nb5Var.s();
                        continue;
                    case 18:
                        relationshipExtensions.otherLetter = nb5Var.s();
                        continue;
                    case 26:
                        relationshipExtensions.superlikeNum = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 40:
                        relationshipExtensions.soulScore = nb5Var.j();
                        continue;
                    case 50:
                        relationshipExtensions.superlikeReason = (SuperlikeReason) nb5Var.l(SuperlikeReason.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        relationshipExtensions.otherLiteratureCommentId = nb5Var.s();
                        continue;
                    case 66:
                        relationshipExtensions.literatureCommentId = nb5Var.s();
                        continue;
                    case 74:
                        relationshipExtensions.literatureId = nb5Var.s();
                        continue;
                    case 82:
                        relationshipExtensions.business_type = nb5Var.s();
                        continue;
                    case 90:
                        relationshipExtensions.sendSuperLikedNum = nb5Var.s();
                        continue;
                    case 98:
                        relationshipExtensions.recvSuperLikedNum = nb5Var.s();
                        continue;
                    case 106:
                        relationshipExtensions.momentId = nb5Var.s();
                        continue;
                    case 114:
                        relationshipExtensions.otherMomentId = nb5Var.s();
                        continue;
                    case 122:
                        relationshipExtensions.relationType = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        relationshipExtensions.otherRelationType = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 138:
                        relationshipExtensions.roomID = nb5Var.s();
                        continue;
                    default:
                        if (relationshipExtensions.superlikeReason == null && numValueOf != null) {
                            relationshipExtensions.superlikeReason = (SuperlikeReason) SuperlikeReason.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (relationshipExtensions.letter == null) {
                            relationshipExtensions.letter = "";
                        }
                        if (relationshipExtensions.otherLetter == null) {
                            relationshipExtensions.otherLetter = "";
                        }
                        if (relationshipExtensions.superlikeNum == null) {
                            relationshipExtensions.superlikeNum = "";
                        }
                        if (relationshipExtensions.superlikeReason == null) {
                            relationshipExtensions.superlikeReason = (SuperlikeReason) SuperlikeReason.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationshipExtensions.otherLiteratureCommentId == null) {
                            relationshipExtensions.otherLiteratureCommentId = "";
                        }
                        if (relationshipExtensions.literatureCommentId == null) {
                            relationshipExtensions.literatureCommentId = "";
                        }
                        if (relationshipExtensions.literatureId == null) {
                            relationshipExtensions.literatureId = "";
                        }
                        if (relationshipExtensions.business_type == null) {
                            relationshipExtensions.business_type = "";
                        }
                        if (relationshipExtensions.sendSuperLikedNum == null) {
                            relationshipExtensions.sendSuperLikedNum = "";
                        }
                        if (relationshipExtensions.recvSuperLikedNum == null) {
                            relationshipExtensions.recvSuperLikedNum = "";
                        }
                        if (relationshipExtensions.momentId == null) {
                            relationshipExtensions.momentId = "";
                        }
                        if (relationshipExtensions.otherMomentId == null) {
                            relationshipExtensions.otherMomentId = "";
                        }
                        if (relationshipExtensions.relationType == null) {
                            relationshipExtensions.relationType = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationshipExtensions.otherRelationType == null) {
                            relationshipExtensions.otherRelationType = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (relationshipExtensions.roomID == null) {
                            relationshipExtensions.roomID = "";
                            return relationshipExtensions;
                        }
                        break;
                }
            }
            return relationshipExtensions;
        }

        public void serialize(RelationshipExtensions relationshipExtensions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = relationshipExtensions.letter;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = relationshipExtensions.otherLetter;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = relationshipExtensions.superlikeNum;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            SuperlikeReason superlikeReason = relationshipExtensions.superlikeReason;
            if (superlikeReason != null) {
                codedOutputByteBufferNano.G(4, superlikeReason.ordinal());
            }
            codedOutputByteBufferNano.G(5, relationshipExtensions.soulScore);
            SuperlikeReason superlikeReason2 = relationshipExtensions.superlikeReason;
            if (superlikeReason2 != null) {
                codedOutputByteBufferNano.K(6, superlikeReason2, SuperlikeReason.PROTOBUF_ADAPTER);
            }
            String str4 = relationshipExtensions.otherLiteratureCommentId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(7, str4);
            }
            String str5 = relationshipExtensions.literatureCommentId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(8, str5);
            }
            String str6 = relationshipExtensions.literatureId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(9, str6);
            }
            String str7 = relationshipExtensions.business_type;
            if (str7 != null) {
                codedOutputByteBufferNano.R(10, str7);
            }
            String str8 = relationshipExtensions.sendSuperLikedNum;
            if (str8 != null) {
                codedOutputByteBufferNano.R(11, str8);
            }
            String str9 = relationshipExtensions.recvSuperLikedNum;
            if (str9 != null) {
                codedOutputByteBufferNano.R(12, str9);
            }
            String str10 = relationshipExtensions.momentId;
            if (str10 != null) {
                codedOutputByteBufferNano.R(13, str10);
            }
            String str11 = relationshipExtensions.otherMomentId;
            if (str11 != null) {
                codedOutputByteBufferNano.R(14, str11);
            }
            RelationshipStatus relationshipStatus = relationshipExtensions.relationType;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.K(15, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = relationshipExtensions.otherRelationType;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.K(16, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            String str12 = relationshipExtensions.roomID;
            if (str12 != null) {
                codedOutputByteBufferNano.R(17, str12);
            }
        }
    };
    public static JsonAdapter<RelationshipExtensions> JSON_ADAPTER = new ObjectJsonAdapter<RelationshipExtensions>() { // from class: com.p1.mobile.putong.data.RelationshipExtensions.2
        public Class getDataClass() {
            return RelationshipExtensions.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RelationshipExtensions mo17830newInstance() {
            return new RelationshipExtensions();
        }

        public boolean parseField(RelationshipExtensions relationshipExtensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherLetter":
                    relationshipExtensions.otherLetter = jsonParser.getValueAsString();
                    return true;
                case "soulScore":
                    relationshipExtensions.soulScore = jsonParser.getValueAsInt();
                    return true;
                case "literatureId":
                    relationshipExtensions.literatureId = jsonParser.getValueAsString();
                    return true;
                case "otherMomentId":
                    relationshipExtensions.otherMomentId = jsonParser.getValueAsString();
                    return true;
                case "sendSuperLikedNum":
                    relationshipExtensions.sendSuperLikedNum = jsonParser.getValueAsString();
                    return true;
                case "letter":
                    relationshipExtensions.letter = jsonParser.getValueAsString();
                    return true;
                case "roomID":
                    relationshipExtensions.roomID = jsonParser.getValueAsString();
                    return true;
                case "otherLiteratureCommentId":
                    relationshipExtensions.otherLiteratureCommentId = jsonParser.getValueAsString();
                    return true;
                case "momentId":
                    relationshipExtensions.momentId = jsonParser.getValueAsString();
                    return true;
                case "literatureCommentId":
                    relationshipExtensions.literatureCommentId = jsonParser.getValueAsString();
                    return true;
                case "relationType":
                    relationshipExtensions.relationType = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "otherRelationType":
                    relationshipExtensions.otherRelationType = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "superlikeReason":
                    relationshipExtensions.superlikeReason = (SuperlikeReason) SuperlikeReason.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "business_type":
                    relationshipExtensions.business_type = jsonParser.getValueAsString();
                    return true;
                case "superlikeNum":
                    relationshipExtensions.superlikeNum = jsonParser.getValueAsString();
                    return true;
                case "recvSuperLikedNum":
                    relationshipExtensions.recvSuperLikedNum = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RelationshipExtensions relationshipExtensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherLetter":
                case "soulScore":
                case "literatureId":
                case "otherMomentId":
                case "sendSuperLikedNum":
                case "letter":
                case "roomID":
                case "otherLiteratureCommentId":
                case "momentId":
                case "literatureCommentId":
                case "relationType":
                case "otherRelationType":
                case "superlikeReason":
                case "business_type":
                case "superlikeNum":
                case "recvSuperLikedNum":
                    return true;
                default:
                    return super.parseFieldCheck(relationshipExtensions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RelationshipExtensions relationshipExtensions, JsonGenerator jsonGenerator) throws IOException {
            String str = relationshipExtensions.letter;
            if (str != null) {
                jsonGenerator.writeStringField("letter", str);
            }
            String str2 = relationshipExtensions.otherLetter;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherLetter", str2);
            }
            String str3 = relationshipExtensions.superlikeNum;
            if (str3 != null) {
                jsonGenerator.writeStringField("superlikeNum", str3);
            }
            if (relationshipExtensions.superlikeReason != null) {
                jsonGenerator.writeFieldName("superlikeReason");
                SuperlikeReason.JSON_ADAPTER.serialize(relationshipExtensions.superlikeReason, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("soulScore", relationshipExtensions.soulScore);
            String str4 = relationshipExtensions.otherLiteratureCommentId;
            if (str4 != null) {
                jsonGenerator.writeStringField("otherLiteratureCommentId", str4);
            }
            String str5 = relationshipExtensions.literatureCommentId;
            if (str5 != null) {
                jsonGenerator.writeStringField("literatureCommentId", str5);
            }
            String str6 = relationshipExtensions.literatureId;
            if (str6 != null) {
                jsonGenerator.writeStringField("literatureId", str6);
            }
            String str7 = relationshipExtensions.business_type;
            if (str7 != null) {
                jsonGenerator.writeStringField("business_type", str7);
            }
            String str8 = relationshipExtensions.sendSuperLikedNum;
            if (str8 != null) {
                jsonGenerator.writeStringField("sendSuperLikedNum", str8);
            }
            String str9 = relationshipExtensions.recvSuperLikedNum;
            if (str9 != null) {
                jsonGenerator.writeStringField("recvSuperLikedNum", str9);
            }
            String str10 = relationshipExtensions.momentId;
            if (str10 != null) {
                jsonGenerator.writeStringField("momentId", str10);
            }
            String str11 = relationshipExtensions.otherMomentId;
            if (str11 != null) {
                jsonGenerator.writeStringField("otherMomentId", str11);
            }
            if (relationshipExtensions.relationType != null) {
                jsonGenerator.writeFieldName("relationType");
                RelationshipStatus.JSON_ADAPTER.serialize(relationshipExtensions.relationType, jsonGenerator, true);
            }
            if (relationshipExtensions.otherRelationType != null) {
                jsonGenerator.writeFieldName("otherRelationType");
                RelationshipStatus.JSON_ADAPTER.serialize(relationshipExtensions.otherRelationType, jsonGenerator, true);
            }
            String str12 = relationshipExtensions.roomID;
            if (str12 != null) {
                jsonGenerator.writeStringField("roomID", str12);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RelationshipExtensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RelationshipExtensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RelationshipExtensions new_() {
        RelationshipExtensions relationshipExtensions = new RelationshipExtensions();
        relationshipExtensions.nullCheck();
        return relationshipExtensions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RelationshipExtensions m18898clone() {
        RelationshipExtensions relationshipExtensions = new RelationshipExtensions();
        relationshipExtensions.letter = this.letter;
        relationshipExtensions.otherLetter = this.otherLetter;
        relationshipExtensions.superlikeNum = this.superlikeNum;
        relationshipExtensions.superlikeReason = this.superlikeReason;
        relationshipExtensions.soulScore = this.soulScore;
        relationshipExtensions.otherLiteratureCommentId = this.otherLiteratureCommentId;
        relationshipExtensions.literatureCommentId = this.literatureCommentId;
        relationshipExtensions.literatureId = this.literatureId;
        relationshipExtensions.business_type = this.business_type;
        relationshipExtensions.sendSuperLikedNum = this.sendSuperLikedNum;
        relationshipExtensions.recvSuperLikedNum = this.recvSuperLikedNum;
        relationshipExtensions.momentId = this.momentId;
        relationshipExtensions.otherMomentId = this.otherMomentId;
        relationshipExtensions.relationType = this.relationType;
        relationshipExtensions.otherRelationType = this.otherRelationType;
        relationshipExtensions.roomID = this.roomID;
        return relationshipExtensions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelationshipExtensions)) {
            return false;
        }
        RelationshipExtensions relationshipExtensions = (RelationshipExtensions) obj;
        return ValueObject.util_equals(this.letter, relationshipExtensions.letter) && ValueObject.util_equals(this.otherLetter, relationshipExtensions.otherLetter) && ValueObject.util_equals(this.superlikeNum, relationshipExtensions.superlikeNum) && ValueObject.util_equals(this.superlikeReason, relationshipExtensions.superlikeReason) && this.soulScore == relationshipExtensions.soulScore && ValueObject.util_equals(this.otherLiteratureCommentId, relationshipExtensions.otherLiteratureCommentId) && ValueObject.util_equals(this.literatureCommentId, relationshipExtensions.literatureCommentId) && ValueObject.util_equals(this.literatureId, relationshipExtensions.literatureId) && ValueObject.util_equals(this.business_type, relationshipExtensions.business_type) && ValueObject.util_equals(this.sendSuperLikedNum, relationshipExtensions.sendSuperLikedNum) && ValueObject.util_equals(this.recvSuperLikedNum, relationshipExtensions.recvSuperLikedNum) && ValueObject.util_equals(this.momentId, relationshipExtensions.momentId) && ValueObject.util_equals(this.otherMomentId, relationshipExtensions.otherMomentId) && ValueObject.util_equals(this.relationType, relationshipExtensions.relationType) && ValueObject.util_equals(this.otherRelationType, relationshipExtensions.otherRelationType) && ValueObject.util_equals(this.roomID, relationshipExtensions.roomID);
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
        String str = this.letter;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherLetter;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.superlikeNum;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        SuperlikeReason superlikeReason = this.superlikeReason;
        int iHashCode4 = (((iHashCode3 + (superlikeReason != null ? superlikeReason.hashCode() : 0)) * 41) + this.soulScore) * 41;
        String str4 = this.otherLiteratureCommentId;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.literatureCommentId;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.literatureId;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.business_type;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.sendSuperLikedNum;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.recvSuperLikedNum;
        int iHashCode10 = (iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.momentId;
        int iHashCode11 = (iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.otherMomentId;
        int iHashCode12 = (iHashCode11 + (str11 != null ? str11.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus = this.relationType;
        int iHashCode13 = (iHashCode12 + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus2 = this.otherRelationType;
        int iHashCode14 = (iHashCode13 + (relationshipStatus2 != null ? relationshipStatus2.hashCode() : 0)) * 41;
        String str12 = this.roomID;
        int iHashCode15 = iHashCode14 + (str12 != null ? str12.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode15;
        return iHashCode15;
    }

    public void nullCheck() {
        if (this.letter == null) {
            this.letter = "";
        }
        if (this.otherLetter == null) {
            this.otherLetter = "";
        }
        if (this.superlikeNum == null) {
            this.superlikeNum = "";
        }
        if (this.superlikeReason == null) {
            this.superlikeReason = (SuperlikeReason) SuperlikeReason.JSON_ADAPTER.defaultEnum();
        }
        if (this.otherLiteratureCommentId == null) {
            this.otherLiteratureCommentId = "";
        }
        if (this.literatureCommentId == null) {
            this.literatureCommentId = "";
        }
        if (this.literatureId == null) {
            this.literatureId = "";
        }
        if (this.business_type == null) {
            this.business_type = "";
        }
        if (this.sendSuperLikedNum == null) {
            this.sendSuperLikedNum = "";
        }
        if (this.recvSuperLikedNum == null) {
            this.recvSuperLikedNum = "";
        }
        if (this.momentId == null) {
            this.momentId = "";
        }
        if (this.otherMomentId == null) {
            this.otherMomentId = "";
        }
        if (this.relationType == null) {
            this.relationType = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.otherRelationType == null) {
            this.otherRelationType = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.roomID == null) {
            this.roomID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
