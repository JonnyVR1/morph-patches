package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.app.media.MediaFrontService;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
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
    @ProtobufIndex(index = 16)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RelationshipExtensions relationshipExtensions) {
            String str = relationshipExtensions.letter;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = relationshipExtensions.otherLetter;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = relationshipExtensions.superlikeNum;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            SuperlikeReason superlikeReason = relationshipExtensions.superlikeReason;
            if (superlikeReason != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(4, superlikeReason.ordinal());
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(5, relationshipExtensions.soulScore);
            SuperlikeReason superlikeReason2 = relationshipExtensions.superlikeReason;
            if (superlikeReason2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(6, superlikeReason2, SuperlikeReason.PROTOBUF_ADAPTER);
            }
            String str4 = relationshipExtensions.otherLiteratureCommentId;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str4);
            }
            String str5 = relationshipExtensions.literatureCommentId;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str5);
            }
            String str6 = relationshipExtensions.literatureId;
            if (str6 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(9, str6);
            }
            String str7 = relationshipExtensions.business_type;
            if (str7 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(10, str7);
            }
            String str8 = relationshipExtensions.sendSuperLikedNum;
            if (str8 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(11, str8);
            }
            String str9 = relationshipExtensions.recvSuperLikedNum;
            if (str9 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(12, str9);
            }
            String str10 = relationshipExtensions.momentId;
            if (str10 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(13, str10);
            }
            String str11 = relationshipExtensions.otherMomentId;
            if (str11 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(14, str11);
            }
            RelationshipStatus relationshipStatus = relationshipExtensions.relationType;
            if (relationshipStatus != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(15, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = relationshipExtensions.otherRelationType;
            if (relationshipStatus2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(16, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            String str12 = relationshipExtensions.roomID;
            if (str12 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(17, str12);
            }
            relationshipExtensions.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RelationshipExtensions parse(nc5 nc5Var) throws IOException {
            RelationshipExtensions relationshipExtensions = new RelationshipExtensions();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        relationshipExtensions.letter = nc5Var.m162495s();
                        continue;
                    case 18:
                        relationshipExtensions.otherLetter = nc5Var.m162495s();
                        continue;
                    case 26:
                        relationshipExtensions.superlikeNum = nc5Var.m162495s();
                        continue;
                    case 32:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 40:
                        relationshipExtensions.soulScore = nc5Var.m162486j();
                        continue;
                    case 50:
                        relationshipExtensions.superlikeReason = (SuperlikeReason) nc5Var.m162488l(SuperlikeReason.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        relationshipExtensions.otherLiteratureCommentId = nc5Var.m162495s();
                        continue;
                    case 66:
                        relationshipExtensions.literatureCommentId = nc5Var.m162495s();
                        continue;
                    case 74:
                        relationshipExtensions.literatureId = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        relationshipExtensions.business_type = nc5Var.m162495s();
                        continue;
                    case 90:
                        relationshipExtensions.sendSuperLikedNum = nc5Var.m162495s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        relationshipExtensions.recvSuperLikedNum = nc5Var.m162495s();
                        continue;
                    case 106:
                        relationshipExtensions.momentId = nc5Var.m162495s();
                        continue;
                    case 114:
                        relationshipExtensions.otherMomentId = nc5Var.m162495s();
                        continue;
                    case 122:
                        relationshipExtensions.relationType = (RelationshipStatus) nc5Var.m162488l(RelationshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        relationshipExtensions.otherRelationType = (RelationshipStatus) nc5Var.m162488l(RelationshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        relationshipExtensions.roomID = nc5Var.m162495s();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RelationshipExtensions relationshipExtensions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = relationshipExtensions.letter;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = relationshipExtensions.otherLetter;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = relationshipExtensions.superlikeNum;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            SuperlikeReason superlikeReason = relationshipExtensions.superlikeReason;
            if (superlikeReason != null) {
                codedOutputByteBufferNano.m17305G(4, superlikeReason.ordinal());
            }
            codedOutputByteBufferNano.m17305G(5, relationshipExtensions.soulScore);
            SuperlikeReason superlikeReason2 = relationshipExtensions.superlikeReason;
            if (superlikeReason2 != null) {
                codedOutputByteBufferNano.m17309K(6, superlikeReason2, SuperlikeReason.PROTOBUF_ADAPTER);
            }
            String str4 = relationshipExtensions.otherLiteratureCommentId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(7, str4);
            }
            String str5 = relationshipExtensions.literatureCommentId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(8, str5);
            }
            String str6 = relationshipExtensions.literatureId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(9, str6);
            }
            String str7 = relationshipExtensions.business_type;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(10, str7);
            }
            String str8 = relationshipExtensions.sendSuperLikedNum;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(11, str8);
            }
            String str9 = relationshipExtensions.recvSuperLikedNum;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(12, str9);
            }
            String str10 = relationshipExtensions.momentId;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(13, str10);
            }
            String str11 = relationshipExtensions.otherMomentId;
            if (str11 != null) {
                codedOutputByteBufferNano.m17316R(14, str11);
            }
            RelationshipStatus relationshipStatus = relationshipExtensions.relationType;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.m17309K(15, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = relationshipExtensions.otherRelationType;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.m17309K(16, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            String str12 = relationshipExtensions.roomID;
            if (str12 != null) {
                codedOutputByteBufferNano.m17316R(17, str12);
            }
        }
    };
    public static JsonAdapter<RelationshipExtensions> JSON_ADAPTER = new ObjectJsonAdapter<RelationshipExtensions>() { // from class: com.p1.mobile.putong.data.RelationshipExtensions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RelationshipExtensions.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RelationshipExtensions newInstance() {
            return new RelationshipExtensions();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(RelationshipExtensions relationshipExtensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1911487658:
                    if (str.equals("otherLetter")) {
                        b = 0;
                    }
                    break;
                case -1885005729:
                    if (str.equals("soulScore")) {
                        b = 1;
                    }
                    break;
                case -1692348852:
                    if (str.equals("literatureId")) {
                        b = 2;
                    }
                    break;
                case -1174675861:
                    if (str.equals("otherMomentId")) {
                        b = 3;
                    }
                    break;
                case -1148274036:
                    if (str.equals("sendSuperLikedNum")) {
                        b = 4;
                    }
                    break;
                case -1106172890:
                    if (str.equals("letter")) {
                        b = 5;
                    }
                    break;
                case -925319370:
                    if (str.equals("roomID")) {
                        b = 6;
                    }
                    break;
                case -548806567:
                    if (str.equals("otherLiteratureCommentId")) {
                        b = 7;
                    }
                    break;
                case -361297093:
                    if (str.equals("momentId")) {
                        b = 8;
                    }
                    break;
                case -323907191:
                    if (str.equals("literatureCommentId")) {
                        b = 9;
                    }
                    break;
                case -262758570:
                    if (str.equals("relationType")) {
                        b = 10;
                    }
                    break;
                case -35759482:
                    if (str.equals("otherRelationType")) {
                        b = 11;
                    }
                    break;
                case 47805046:
                    if (str.equals("superlikeReason")) {
                        b = 12;
                    }
                    break;
                case 630087769:
                    if (str.equals(MediaFrontService.BUSINESS_TYPE)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 756746388:
                    if (str.equals("superlikeNum")) {
                        b = 14;
                    }
                    break;
                case 1880062190:
                    if (str.equals("recvSuperLikedNum")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    relationshipExtensions.otherLetter = jsonParser.getValueAsString();
                    return true;
                case 1:
                    relationshipExtensions.soulScore = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    relationshipExtensions.literatureId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    relationshipExtensions.otherMomentId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    relationshipExtensions.sendSuperLikedNum = jsonParser.getValueAsString();
                    return true;
                case 5:
                    relationshipExtensions.letter = jsonParser.getValueAsString();
                    return true;
                case 6:
                    relationshipExtensions.roomID = jsonParser.getValueAsString();
                    return true;
                case 7:
                    relationshipExtensions.otherLiteratureCommentId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    relationshipExtensions.momentId = jsonParser.getValueAsString();
                    return true;
                case 9:
                    relationshipExtensions.literatureCommentId = jsonParser.getValueAsString();
                    return true;
                case 10:
                    relationshipExtensions.relationType = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 11:
                    relationshipExtensions.otherRelationType = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 12:
                    relationshipExtensions.superlikeReason = SuperlikeReason.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 13:
                    relationshipExtensions.business_type = jsonParser.getValueAsString();
                    return true;
                case 14:
                    relationshipExtensions.superlikeNum = jsonParser.getValueAsString();
                    return true;
                case 15:
                    relationshipExtensions.recvSuperLikedNum = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(RelationshipExtensions relationshipExtensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1911487658:
                    if (str.equals("otherLetter")) {
                        b = 0;
                    }
                    break;
                case -1885005729:
                    if (str.equals("soulScore")) {
                        b = 1;
                    }
                    break;
                case -1692348852:
                    if (str.equals("literatureId")) {
                        b = 2;
                    }
                    break;
                case -1174675861:
                    if (str.equals("otherMomentId")) {
                        b = 3;
                    }
                    break;
                case -1148274036:
                    if (str.equals("sendSuperLikedNum")) {
                        b = 4;
                    }
                    break;
                case -1106172890:
                    if (str.equals("letter")) {
                        b = 5;
                    }
                    break;
                case -925319370:
                    if (str.equals("roomID")) {
                        b = 6;
                    }
                    break;
                case -548806567:
                    if (str.equals("otherLiteratureCommentId")) {
                        b = 7;
                    }
                    break;
                case -361297093:
                    if (str.equals("momentId")) {
                        b = 8;
                    }
                    break;
                case -323907191:
                    if (str.equals("literatureCommentId")) {
                        b = 9;
                    }
                    break;
                case -262758570:
                    if (str.equals("relationType")) {
                        b = 10;
                    }
                    break;
                case -35759482:
                    if (str.equals("otherRelationType")) {
                        b = 11;
                    }
                    break;
                case 47805046:
                    if (str.equals("superlikeReason")) {
                        b = 12;
                    }
                    break;
                case 630087769:
                    if (str.equals(MediaFrontService.BUSINESS_TYPE)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 756746388:
                    if (str.equals("superlikeNum")) {
                        b = 14;
                    }
                    break;
                case 1880062190:
                    if (str.equals("recvSuperLikedNum")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return super.parseFieldCheck(relationshipExtensions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField(MediaFrontService.BUSINESS_TYPE, str7);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RelationshipExtensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RelationshipExtensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RelationshipExtensions new_() {
        RelationshipExtensions relationshipExtensions = new RelationshipExtensions();
        relationshipExtensions.nullCheck();
        return relationshipExtensions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RelationshipExtensions mo225055clone() {
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
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
