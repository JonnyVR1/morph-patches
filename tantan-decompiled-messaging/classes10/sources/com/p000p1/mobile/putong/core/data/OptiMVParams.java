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
public class OptiMVParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "optimvparams";

    @ProtobufIndex(index = 19)
    public boolean chat_game_show;

    @NonNull
    @ProtobufIndex(index = 24)
    public String chat_guide;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double createTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String curUserId;

    @NonNull
    @ProtobufIndex(index = 21)
    public String day_number;

    @NonNull
    @ProtobufIndex(index = 18)
    public String equipment_type;

    @NonNull
    @ProtobufIndex(index = 26)
    public String guide_type;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public boolean hasSendMV;

    @NonNull
    @ProtobufIndex(index = 12)
    public String isNewMoment;

    @NonNull
    @ProtobufIndex(index = 4)
    public String isOnline;

    @NonNull
    @ProtobufIndex(index = 9)
    public String isOnliveAnchor;

    @NonNull
    @ProtobufIndex(index = 11)
    public String isRedDot;

    @ProtobufIndex(index = 29)
    public int is_close_friend;

    @ProtobufIndex(index = 20)
    public boolean is_fake;

    @ProtobufIndex(index = 22)
    public boolean is_platinum_top_chat;

    @ProtobufIndex(index = 30)
    public int is_top_recommend;

    @NonNull
    @ProtobufIndex(index = 25)
    public String love_letter;

    @NonNull
    @ProtobufIndex(index = 16)
    public String messageTab;

    @ProtobufIndex(index = 28)
    public int message_pairs;

    @NonNull
    @ProtobufIndex(index = 15)
    public String messagecCellType;

    @NonNull
    @ProtobufIndex(index = 6)
    public String momentsUserId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String newMatchRank;

    @NonNull
    @ProtobufIndex(index = 8)
    public String newMsgPageModule;

    @NonNull
    @ProtobufIndex(index = 7)
    public String operationId;

    @NonNull
    @ProtobufIndex(index = 13)
    public String otherUid;

    @NonNull
    @ProtobufIndex(index = 23)
    public String pairing_type;

    @NonNull
    @ProtobufIndex(index = 14)
    public String redDotNum;

    @ProtobufIndex(index = 27)
    public int spark_level;

    @NonNull
    @ProtobufIndex(index = 31)
    public String top_chat_type;

    @NonNull
    @ProtobufIndex(index = 17)
    public String user_tag;
    public static ProtobufAdapter<OptiMVParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<OptiMVParams>() { // from class: com.p1.mobile.putong.core.data.OptiMVParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OptiMVParams optiMVParams) {
            String str = optiMVParams.curUserId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = optiMVParams.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, optiMVParams.createTime);
            String str3 = optiMVParams.isOnline;
            if (str3 != null) {
                iD += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = optiMVParams.newMatchRank;
            if (str4 != null) {
                iD += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = optiMVParams.momentsUserId;
            if (str5 != null) {
                iD += CodedOutputByteBufferNano.o(6, str5);
            }
            String str6 = optiMVParams.operationId;
            if (str6 != null) {
                iD += CodedOutputByteBufferNano.o(7, str6);
            }
            String str7 = optiMVParams.newMsgPageModule;
            if (str7 != null) {
                iD += CodedOutputByteBufferNano.o(8, str7);
            }
            String str8 = optiMVParams.isOnliveAnchor;
            if (str8 != null) {
                iD += CodedOutputByteBufferNano.o(9, str8);
            }
            int iB = iD + CodedOutputByteBufferNano.b(10, optiMVParams.hasSendMV);
            String str9 = optiMVParams.isRedDot;
            if (str9 != null) {
                iB += CodedOutputByteBufferNano.o(11, str9);
            }
            String str10 = optiMVParams.isNewMoment;
            if (str10 != null) {
                iB += CodedOutputByteBufferNano.o(12, str10);
            }
            String str11 = optiMVParams.otherUid;
            if (str11 != null) {
                iB += CodedOutputByteBufferNano.o(13, str11);
            }
            String str12 = optiMVParams.redDotNum;
            if (str12 != null) {
                iB += CodedOutputByteBufferNano.o(14, str12);
            }
            String str13 = optiMVParams.messagecCellType;
            if (str13 != null) {
                iB += CodedOutputByteBufferNano.o(15, str13);
            }
            String str14 = optiMVParams.messageTab;
            if (str14 != null) {
                iB += CodedOutputByteBufferNano.o(16, str14);
            }
            String str15 = optiMVParams.user_tag;
            if (str15 != null) {
                iB += CodedOutputByteBufferNano.o(17, str15);
            }
            String str16 = optiMVParams.equipment_type;
            if (str16 != null) {
                iB += CodedOutputByteBufferNano.o(18, str16);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(19, optiMVParams.chat_game_show) + CodedOutputByteBufferNano.b(20, optiMVParams.is_fake);
            String str17 = optiMVParams.day_number;
            if (str17 != null) {
                iB2 += CodedOutputByteBufferNano.o(21, str17);
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(22, optiMVParams.is_platinum_top_chat);
            String str18 = optiMVParams.pairing_type;
            if (str18 != null) {
                iB3 += CodedOutputByteBufferNano.o(23, str18);
            }
            String str19 = optiMVParams.chat_guide;
            if (str19 != null) {
                iB3 += CodedOutputByteBufferNano.o(24, str19);
            }
            String str20 = optiMVParams.love_letter;
            if (str20 != null) {
                iB3 += CodedOutputByteBufferNano.o(25, str20);
            }
            String str21 = optiMVParams.guide_type;
            if (str21 != null) {
                iB3 += CodedOutputByteBufferNano.o(26, str21);
            }
            int iH = iB3 + CodedOutputByteBufferNano.h(27, optiMVParams.spark_level) + CodedOutputByteBufferNano.h(28, optiMVParams.message_pairs) + CodedOutputByteBufferNano.h(29, optiMVParams.is_close_friend) + CodedOutputByteBufferNano.h(30, optiMVParams.is_top_recommend);
            String str22 = optiMVParams.top_chat_type;
            if (str22 != null) {
                iH += CodedOutputByteBufferNano.o(31, str22);
            }
            ((MessageNano) optiMVParams).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OptiMVParams m14679parse(nb5 nb5Var) throws IOException {
            OptiMVParams optiMVParams = new OptiMVParams();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (optiMVParams.curUserId == null) {
                            optiMVParams.curUserId = "";
                        }
                        if (optiMVParams.name == null) {
                            optiMVParams.name = "";
                        }
                        if (optiMVParams.isOnline == null) {
                            optiMVParams.isOnline = "";
                        }
                        if (optiMVParams.newMatchRank == null) {
                            optiMVParams.newMatchRank = "";
                        }
                        if (optiMVParams.momentsUserId == null) {
                            optiMVParams.momentsUserId = "";
                        }
                        if (optiMVParams.operationId == null) {
                            optiMVParams.operationId = "";
                        }
                        if (optiMVParams.newMsgPageModule == null) {
                            optiMVParams.newMsgPageModule = "";
                        }
                        if (optiMVParams.isOnliveAnchor == null) {
                            optiMVParams.isOnliveAnchor = "";
                        }
                        if (optiMVParams.isRedDot == null) {
                            optiMVParams.isRedDot = "";
                        }
                        if (optiMVParams.isNewMoment == null) {
                            optiMVParams.isNewMoment = "";
                        }
                        if (optiMVParams.otherUid == null) {
                            optiMVParams.otherUid = "";
                        }
                        if (optiMVParams.redDotNum == null) {
                            optiMVParams.redDotNum = "";
                        }
                        if (optiMVParams.messagecCellType == null) {
                            optiMVParams.messagecCellType = "";
                        }
                        if (optiMVParams.messageTab == null) {
                            optiMVParams.messageTab = "";
                        }
                        if (optiMVParams.user_tag == null) {
                            optiMVParams.user_tag = "";
                        }
                        if (optiMVParams.equipment_type == null) {
                            optiMVParams.equipment_type = "";
                        }
                        if (optiMVParams.day_number == null) {
                            optiMVParams.day_number = "";
                        }
                        if (optiMVParams.pairing_type == null) {
                            optiMVParams.pairing_type = "";
                        }
                        if (optiMVParams.chat_guide == null) {
                            optiMVParams.chat_guide = "";
                        }
                        if (optiMVParams.love_letter == null) {
                            optiMVParams.love_letter = "";
                        }
                        if (optiMVParams.guide_type == null) {
                            optiMVParams.guide_type = "";
                        }
                        if (optiMVParams.top_chat_type == null) {
                            optiMVParams.top_chat_type = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        optiMVParams.curUserId = nb5Var.s();
                        continue;
                    case 18:
                        optiMVParams.name = nb5Var.s();
                        continue;
                    case 25:
                        optiMVParams.createTime = nb5Var.h();
                        continue;
                    case 34:
                        optiMVParams.isOnline = nb5Var.s();
                        continue;
                    case 42:
                        optiMVParams.newMatchRank = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        optiMVParams.momentsUserId = nb5Var.s();
                        continue;
                    case 58:
                        optiMVParams.operationId = nb5Var.s();
                        continue;
                    case 66:
                        optiMVParams.newMsgPageModule = nb5Var.s();
                        continue;
                    case 74:
                        optiMVParams.isOnliveAnchor = nb5Var.s();
                        continue;
                    case 80:
                        optiMVParams.hasSendMV = nb5Var.g();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        optiMVParams.isRedDot = nb5Var.s();
                        continue;
                    case 98:
                        optiMVParams.isNewMoment = nb5Var.s();
                        continue;
                    case 106:
                        optiMVParams.otherUid = nb5Var.s();
                        continue;
                    case 114:
                        optiMVParams.redDotNum = nb5Var.s();
                        continue;
                    case 122:
                        optiMVParams.messagecCellType = nb5Var.s();
                        continue;
                    case 130:
                        optiMVParams.messageTab = nb5Var.s();
                        continue;
                    case 138:
                        optiMVParams.user_tag = nb5Var.s();
                        continue;
                    case 146:
                        optiMVParams.equipment_type = nb5Var.s();
                        continue;
                    case 152:
                        optiMVParams.chat_game_show = nb5Var.g();
                        continue;
                    case 160:
                        optiMVParams.is_fake = nb5Var.g();
                        continue;
                    case 170:
                        optiMVParams.day_number = nb5Var.s();
                        continue;
                    case 176:
                        optiMVParams.is_platinum_top_chat = nb5Var.g();
                        continue;
                    case 186:
                        optiMVParams.pairing_type = nb5Var.s();
                        continue;
                    case 194:
                        optiMVParams.chat_guide = nb5Var.s();
                        continue;
                    case 202:
                        optiMVParams.love_letter = nb5Var.s();
                        continue;
                    case 210:
                        optiMVParams.guide_type = nb5Var.s();
                        continue;
                    case 216:
                        optiMVParams.spark_level = nb5Var.j();
                        continue;
                    case 224:
                        optiMVParams.message_pairs = nb5Var.j();
                        continue;
                    case 232:
                        optiMVParams.is_close_friend = nb5Var.j();
                        continue;
                    case 240:
                        optiMVParams.is_top_recommend = nb5Var.j();
                        continue;
                    case 250:
                        optiMVParams.top_chat_type = nb5Var.s();
                        continue;
                    default:
                        if (optiMVParams.curUserId == null) {
                            optiMVParams.curUserId = "";
                        }
                        if (optiMVParams.name == null) {
                            optiMVParams.name = "";
                        }
                        if (optiMVParams.isOnline == null) {
                            optiMVParams.isOnline = "";
                        }
                        if (optiMVParams.newMatchRank == null) {
                            optiMVParams.newMatchRank = "";
                        }
                        if (optiMVParams.momentsUserId == null) {
                            optiMVParams.momentsUserId = "";
                        }
                        if (optiMVParams.operationId == null) {
                            optiMVParams.operationId = "";
                        }
                        if (optiMVParams.newMsgPageModule == null) {
                            optiMVParams.newMsgPageModule = "";
                        }
                        if (optiMVParams.isOnliveAnchor == null) {
                            optiMVParams.isOnliveAnchor = "";
                        }
                        if (optiMVParams.isRedDot == null) {
                            optiMVParams.isRedDot = "";
                        }
                        if (optiMVParams.isNewMoment == null) {
                            optiMVParams.isNewMoment = "";
                        }
                        if (optiMVParams.otherUid == null) {
                            optiMVParams.otherUid = "";
                        }
                        if (optiMVParams.redDotNum == null) {
                            optiMVParams.redDotNum = "";
                        }
                        if (optiMVParams.messagecCellType == null) {
                            optiMVParams.messagecCellType = "";
                        }
                        if (optiMVParams.messageTab == null) {
                            optiMVParams.messageTab = "";
                        }
                        if (optiMVParams.user_tag == null) {
                            optiMVParams.user_tag = "";
                        }
                        if (optiMVParams.equipment_type == null) {
                            optiMVParams.equipment_type = "";
                        }
                        if (optiMVParams.day_number == null) {
                            optiMVParams.day_number = "";
                        }
                        if (optiMVParams.pairing_type == null) {
                            optiMVParams.pairing_type = "";
                        }
                        if (optiMVParams.chat_guide == null) {
                            optiMVParams.chat_guide = "";
                        }
                        if (optiMVParams.love_letter == null) {
                            optiMVParams.love_letter = "";
                        }
                        if (optiMVParams.guide_type == null) {
                            optiMVParams.guide_type = "";
                        }
                        if (optiMVParams.top_chat_type == null) {
                            optiMVParams.top_chat_type = "";
                            return optiMVParams;
                        }
                        break;
                }
            }
            return optiMVParams;
        }

        public void serialize(OptiMVParams optiMVParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = optiMVParams.curUserId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = optiMVParams.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.C(3, optiMVParams.createTime);
            String str3 = optiMVParams.isOnline;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = optiMVParams.newMatchRank;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = optiMVParams.momentsUserId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            String str6 = optiMVParams.operationId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(7, str6);
            }
            String str7 = optiMVParams.newMsgPageModule;
            if (str7 != null) {
                codedOutputByteBufferNano.R(8, str7);
            }
            String str8 = optiMVParams.isOnliveAnchor;
            if (str8 != null) {
                codedOutputByteBufferNano.R(9, str8);
            }
            codedOutputByteBufferNano.A(10, optiMVParams.hasSendMV);
            String str9 = optiMVParams.isRedDot;
            if (str9 != null) {
                codedOutputByteBufferNano.R(11, str9);
            }
            String str10 = optiMVParams.isNewMoment;
            if (str10 != null) {
                codedOutputByteBufferNano.R(12, str10);
            }
            String str11 = optiMVParams.otherUid;
            if (str11 != null) {
                codedOutputByteBufferNano.R(13, str11);
            }
            String str12 = optiMVParams.redDotNum;
            if (str12 != null) {
                codedOutputByteBufferNano.R(14, str12);
            }
            String str13 = optiMVParams.messagecCellType;
            if (str13 != null) {
                codedOutputByteBufferNano.R(15, str13);
            }
            String str14 = optiMVParams.messageTab;
            if (str14 != null) {
                codedOutputByteBufferNano.R(16, str14);
            }
            String str15 = optiMVParams.user_tag;
            if (str15 != null) {
                codedOutputByteBufferNano.R(17, str15);
            }
            String str16 = optiMVParams.equipment_type;
            if (str16 != null) {
                codedOutputByteBufferNano.R(18, str16);
            }
            codedOutputByteBufferNano.A(19, optiMVParams.chat_game_show);
            codedOutputByteBufferNano.A(20, optiMVParams.is_fake);
            String str17 = optiMVParams.day_number;
            if (str17 != null) {
                codedOutputByteBufferNano.R(21, str17);
            }
            codedOutputByteBufferNano.A(22, optiMVParams.is_platinum_top_chat);
            String str18 = optiMVParams.pairing_type;
            if (str18 != null) {
                codedOutputByteBufferNano.R(23, str18);
            }
            String str19 = optiMVParams.chat_guide;
            if (str19 != null) {
                codedOutputByteBufferNano.R(24, str19);
            }
            String str20 = optiMVParams.love_letter;
            if (str20 != null) {
                codedOutputByteBufferNano.R(25, str20);
            }
            String str21 = optiMVParams.guide_type;
            if (str21 != null) {
                codedOutputByteBufferNano.R(26, str21);
            }
            codedOutputByteBufferNano.G(27, optiMVParams.spark_level);
            codedOutputByteBufferNano.G(28, optiMVParams.message_pairs);
            codedOutputByteBufferNano.G(29, optiMVParams.is_close_friend);
            codedOutputByteBufferNano.G(30, optiMVParams.is_top_recommend);
            String str22 = optiMVParams.top_chat_type;
            if (str22 != null) {
                codedOutputByteBufferNano.R(31, str22);
            }
        }
    };
    public static JsonAdapter<OptiMVParams> JSON_ADAPTER = new ObjectJsonAdapter<OptiMVParams>() { // from class: com.p1.mobile.putong.core.data.OptiMVParams.2
        public Class getDataClass() {
            return OptiMVParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OptiMVParams m14680newInstance() {
            return new OptiMVParams();
        }

        public boolean parseField(OptiMVParams optiMVParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "chat_game_show":
                    optiMVParams.chat_game_show = jsonParser.getValueAsBoolean();
                    return true;
                case "top_chat_type":
                    optiMVParams.top_chat_type = jsonParser.getValueAsString();
                    return true;
                case "messageTab":
                    optiMVParams.messageTab = jsonParser.getValueAsString();
                    return true;
                case "chat_guide":
                    optiMVParams.chat_guide = jsonParser.getValueAsString();
                    return true;
                case "message_pairs":
                    optiMVParams.message_pairs = jsonParser.getValueAsInt();
                    return true;
                case "otherUid":
                    optiMVParams.otherUid = jsonParser.getValueAsString();
                    return true;
                case "momentsUserId":
                    optiMVParams.momentsUserId = jsonParser.getValueAsString();
                    return true;
                case "isOnline":
                    optiMVParams.isOnline = jsonParser.getValueAsString();
                    return true;
                case "hasSendMV":
                    optiMVParams.hasSendMV = jsonParser.getValueAsBoolean();
                    return true;
                case "user_tag":
                    optiMVParams.user_tag = jsonParser.getValueAsString();
                    return true;
                case "isRedDot":
                    optiMVParams.isRedDot = jsonParser.getValueAsString();
                    return true;
                case "curUserId":
                    optiMVParams.curUserId = jsonParser.getValueAsString();
                    return true;
                case "spark_level":
                    optiMVParams.spark_level = jsonParser.getValueAsInt();
                    return true;
                case "name":
                    optiMVParams.name = jsonParser.getValueAsString();
                    return true;
                case "guide_type":
                    optiMVParams.guide_type = jsonParser.getValueAsString();
                    return true;
                case "operationId":
                    optiMVParams.operationId = jsonParser.getValueAsString();
                    return true;
                case "pairing_type":
                    optiMVParams.pairing_type = jsonParser.getValueAsString();
                    return true;
                case "day_number":
                    optiMVParams.day_number = jsonParser.getValueAsString();
                    return true;
                case "isNewMoment":
                    optiMVParams.isNewMoment = jsonParser.getValueAsString();
                    return true;
                case "is_top_recommend":
                    optiMVParams.is_top_recommend = jsonParser.getValueAsInt();
                    return true;
                case "redDotNum":
                    optiMVParams.redDotNum = jsonParser.getValueAsString();
                    return true;
                case "is_platinum_top_chat":
                    optiMVParams.is_platinum_top_chat = jsonParser.getValueAsBoolean();
                    return true;
                case "newMsgPageModule":
                    optiMVParams.newMsgPageModule = jsonParser.getValueAsString();
                    return true;
                case "newMatchRank":
                    optiMVParams.newMatchRank = jsonParser.getValueAsString();
                    return true;
                case "isOnliveAnchor":
                    optiMVParams.isOnliveAnchor = jsonParser.getValueAsString();
                    return true;
                case "createTime":
                    optiMVParams.createTime = jsonParser.getValueAsDouble();
                    return true;
                case "love_letter":
                    optiMVParams.love_letter = jsonParser.getValueAsString();
                    return true;
                case "messagecCellType":
                    optiMVParams.messagecCellType = jsonParser.getValueAsString();
                    return true;
                case "is_close_friend":
                    optiMVParams.is_close_friend = jsonParser.getValueAsInt();
                    return true;
                case "is_fake":
                    optiMVParams.is_fake = jsonParser.getValueAsBoolean();
                    return true;
                case "equipment_type":
                    optiMVParams.equipment_type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OptiMVParams optiMVParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "chat_game_show":
                case "top_chat_type":
                case "messageTab":
                case "chat_guide":
                case "message_pairs":
                case "otherUid":
                case "momentsUserId":
                case "isOnline":
                case "hasSendMV":
                case "user_tag":
                case "isRedDot":
                case "curUserId":
                case "spark_level":
                case "name":
                case "guide_type":
                case "operationId":
                case "pairing_type":
                case "day_number":
                case "isNewMoment":
                case "is_top_recommend":
                case "redDotNum":
                case "is_platinum_top_chat":
                case "newMsgPageModule":
                case "newMatchRank":
                case "isOnliveAnchor":
                case "createTime":
                case "love_letter":
                case "messagecCellType":
                case "is_close_friend":
                case "is_fake":
                case "equipment_type":
                    return true;
                default:
                    return super.parseFieldCheck(optiMVParams, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(OptiMVParams optiMVParams, JsonGenerator jsonGenerator) throws IOException {
            String str = optiMVParams.curUserId;
            if (str != null) {
                jsonGenerator.writeStringField("curUserId", str);
            }
            String str2 = optiMVParams.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            jsonGenerator.writeNumberField("createTime", optiMVParams.createTime);
            String str3 = optiMVParams.isOnline;
            if (str3 != null) {
                jsonGenerator.writeStringField("isOnline", str3);
            }
            String str4 = optiMVParams.newMatchRank;
            if (str4 != null) {
                jsonGenerator.writeStringField("newMatchRank", str4);
            }
            String str5 = optiMVParams.momentsUserId;
            if (str5 != null) {
                jsonGenerator.writeStringField("momentsUserId", str5);
            }
            String str6 = optiMVParams.operationId;
            if (str6 != null) {
                jsonGenerator.writeStringField("operationId", str6);
            }
            String str7 = optiMVParams.newMsgPageModule;
            if (str7 != null) {
                jsonGenerator.writeStringField("newMsgPageModule", str7);
            }
            String str8 = optiMVParams.isOnliveAnchor;
            if (str8 != null) {
                jsonGenerator.writeStringField("isOnliveAnchor", str8);
            }
            jsonGenerator.writeBooleanField("hasSendMV", optiMVParams.hasSendMV);
            String str9 = optiMVParams.isRedDot;
            if (str9 != null) {
                jsonGenerator.writeStringField("isRedDot", str9);
            }
            String str10 = optiMVParams.isNewMoment;
            if (str10 != null) {
                jsonGenerator.writeStringField("isNewMoment", str10);
            }
            String str11 = optiMVParams.otherUid;
            if (str11 != null) {
                jsonGenerator.writeStringField("otherUid", str11);
            }
            String str12 = optiMVParams.redDotNum;
            if (str12 != null) {
                jsonGenerator.writeStringField("redDotNum", str12);
            }
            String str13 = optiMVParams.messagecCellType;
            if (str13 != null) {
                jsonGenerator.writeStringField("messagecCellType", str13);
            }
            String str14 = optiMVParams.messageTab;
            if (str14 != null) {
                jsonGenerator.writeStringField("messageTab", str14);
            }
            String str15 = optiMVParams.user_tag;
            if (str15 != null) {
                jsonGenerator.writeStringField("user_tag", str15);
            }
            String str16 = optiMVParams.equipment_type;
            if (str16 != null) {
                jsonGenerator.writeStringField("equipment_type", str16);
            }
            jsonGenerator.writeBooleanField("chat_game_show", optiMVParams.chat_game_show);
            jsonGenerator.writeBooleanField("is_fake", optiMVParams.is_fake);
            String str17 = optiMVParams.day_number;
            if (str17 != null) {
                jsonGenerator.writeStringField("day_number", str17);
            }
            jsonGenerator.writeBooleanField("is_platinum_top_chat", optiMVParams.is_platinum_top_chat);
            String str18 = optiMVParams.pairing_type;
            if (str18 != null) {
                jsonGenerator.writeStringField("pairing_type", str18);
            }
            String str19 = optiMVParams.chat_guide;
            if (str19 != null) {
                jsonGenerator.writeStringField("chat_guide", str19);
            }
            String str20 = optiMVParams.love_letter;
            if (str20 != null) {
                jsonGenerator.writeStringField(MessageType.love_letter, str20);
            }
            String str21 = optiMVParams.guide_type;
            if (str21 != null) {
                jsonGenerator.writeStringField("guide_type", str21);
            }
            jsonGenerator.writeNumberField("spark_level", optiMVParams.spark_level);
            jsonGenerator.writeNumberField("message_pairs", optiMVParams.message_pairs);
            jsonGenerator.writeNumberField("is_close_friend", optiMVParams.is_close_friend);
            jsonGenerator.writeNumberField("is_top_recommend", optiMVParams.is_top_recommend);
            String str22 = optiMVParams.top_chat_type;
            if (str22 != null) {
                jsonGenerator.writeStringField("top_chat_type", str22);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OptiMVParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OptiMVParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OptiMVParams new_() {
        OptiMVParams optiMVParams = new OptiMVParams();
        optiMVParams.nullCheck();
        return optiMVParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OptiMVParams m14678clone() {
        OptiMVParams optiMVParams = new OptiMVParams();
        optiMVParams.curUserId = this.curUserId;
        optiMVParams.name = this.name;
        optiMVParams.createTime = this.createTime;
        optiMVParams.isOnline = this.isOnline;
        optiMVParams.newMatchRank = this.newMatchRank;
        optiMVParams.momentsUserId = this.momentsUserId;
        optiMVParams.operationId = this.operationId;
        optiMVParams.newMsgPageModule = this.newMsgPageModule;
        optiMVParams.isOnliveAnchor = this.isOnliveAnchor;
        optiMVParams.hasSendMV = this.hasSendMV;
        optiMVParams.isRedDot = this.isRedDot;
        optiMVParams.isNewMoment = this.isNewMoment;
        optiMVParams.otherUid = this.otherUid;
        optiMVParams.redDotNum = this.redDotNum;
        optiMVParams.messagecCellType = this.messagecCellType;
        optiMVParams.messageTab = this.messageTab;
        optiMVParams.user_tag = this.user_tag;
        optiMVParams.equipment_type = this.equipment_type;
        optiMVParams.chat_game_show = this.chat_game_show;
        optiMVParams.is_fake = this.is_fake;
        optiMVParams.day_number = this.day_number;
        optiMVParams.is_platinum_top_chat = this.is_platinum_top_chat;
        optiMVParams.pairing_type = this.pairing_type;
        optiMVParams.chat_guide = this.chat_guide;
        optiMVParams.love_letter = this.love_letter;
        optiMVParams.guide_type = this.guide_type;
        optiMVParams.spark_level = this.spark_level;
        optiMVParams.message_pairs = this.message_pairs;
        optiMVParams.is_close_friend = this.is_close_friend;
        optiMVParams.is_top_recommend = this.is_top_recommend;
        optiMVParams.top_chat_type = this.top_chat_type;
        return optiMVParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OptiMVParams)) {
            return false;
        }
        OptiMVParams optiMVParams = (OptiMVParams) obj;
        return ValueObject.util_equals(this.curUserId, optiMVParams.curUserId) && ValueObject.util_equals(this.name, optiMVParams.name) && this.createTime == optiMVParams.createTime && ValueObject.util_equals(this.isOnline, optiMVParams.isOnline) && ValueObject.util_equals(this.newMatchRank, optiMVParams.newMatchRank) && ValueObject.util_equals(this.momentsUserId, optiMVParams.momentsUserId) && ValueObject.util_equals(this.operationId, optiMVParams.operationId) && ValueObject.util_equals(this.newMsgPageModule, optiMVParams.newMsgPageModule) && ValueObject.util_equals(this.isOnliveAnchor, optiMVParams.isOnliveAnchor) && this.hasSendMV == optiMVParams.hasSendMV && ValueObject.util_equals(this.isRedDot, optiMVParams.isRedDot) && ValueObject.util_equals(this.isNewMoment, optiMVParams.isNewMoment) && ValueObject.util_equals(this.otherUid, optiMVParams.otherUid) && ValueObject.util_equals(this.redDotNum, optiMVParams.redDotNum) && ValueObject.util_equals(this.messagecCellType, optiMVParams.messagecCellType) && ValueObject.util_equals(this.messageTab, optiMVParams.messageTab) && ValueObject.util_equals(this.user_tag, optiMVParams.user_tag) && ValueObject.util_equals(this.equipment_type, optiMVParams.equipment_type) && this.chat_game_show == optiMVParams.chat_game_show && this.is_fake == optiMVParams.is_fake && ValueObject.util_equals(this.day_number, optiMVParams.day_number) && this.is_platinum_top_chat == optiMVParams.is_platinum_top_chat && ValueObject.util_equals(this.pairing_type, optiMVParams.pairing_type) && ValueObject.util_equals(this.chat_guide, optiMVParams.chat_guide) && ValueObject.util_equals(this.love_letter, optiMVParams.love_letter) && ValueObject.util_equals(this.guide_type, optiMVParams.guide_type) && this.spark_level == optiMVParams.spark_level && this.message_pairs == optiMVParams.message_pairs && this.is_close_friend == optiMVParams.is_close_friend && this.is_top_recommend == optiMVParams.is_top_recommend && ValueObject.util_equals(this.top_chat_type, optiMVParams.top_chat_type);
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
        String str = this.curUserId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createTime);
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str3 = this.isOnline;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.newMatchRank;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.momentsUserId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.operationId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.newMsgPageModule;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.isOnliveAnchor;
        int iHashCode8 = (((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41) + (this.hasSendMV ? 1231 : 1237)) * 41;
        String str9 = this.isRedDot;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.isNewMoment;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.otherUid;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.redDotNum;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.messagecCellType;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.messageTab;
        int iHashCode14 = (iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.user_tag;
        int iHashCode15 = (iHashCode14 + (str15 != null ? str15.hashCode() : 0)) * 41;
        String str16 = this.equipment_type;
        int iHashCode16 = (((((iHashCode15 + (str16 != null ? str16.hashCode() : 0)) * 41) + (this.chat_game_show ? 1231 : 1237)) * 41) + (this.is_fake ? 1231 : 1237)) * 41;
        String str17 = this.day_number;
        int iHashCode17 = (((iHashCode16 + (str17 != null ? str17.hashCode() : 0)) * 41) + (this.is_platinum_top_chat ? 1231 : 1237)) * 41;
        String str18 = this.pairing_type;
        int iHashCode18 = (iHashCode17 + (str18 != null ? str18.hashCode() : 0)) * 41;
        String str19 = this.chat_guide;
        int iHashCode19 = (iHashCode18 + (str19 != null ? str19.hashCode() : 0)) * 41;
        String str20 = this.love_letter;
        int iHashCode20 = (iHashCode19 + (str20 != null ? str20.hashCode() : 0)) * 41;
        String str21 = this.guide_type;
        int iHashCode21 = (((((((((iHashCode20 + (str21 != null ? str21.hashCode() : 0)) * 41) + this.spark_level) * 41) + this.message_pairs) * 41) + this.is_close_friend) * 41) + this.is_top_recommend) * 41;
        String str22 = this.top_chat_type;
        int iHashCode22 = iHashCode21 + (str22 != null ? str22.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode22;
        return iHashCode22;
    }

    public void nullCheck() {
        if (this.curUserId == null) {
            this.curUserId = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.isOnline == null) {
            this.isOnline = "";
        }
        if (this.newMatchRank == null) {
            this.newMatchRank = "";
        }
        if (this.momentsUserId == null) {
            this.momentsUserId = "";
        }
        if (this.operationId == null) {
            this.operationId = "";
        }
        if (this.newMsgPageModule == null) {
            this.newMsgPageModule = "";
        }
        if (this.isOnliveAnchor == null) {
            this.isOnliveAnchor = "";
        }
        if (this.isRedDot == null) {
            this.isRedDot = "";
        }
        if (this.isNewMoment == null) {
            this.isNewMoment = "";
        }
        if (this.otherUid == null) {
            this.otherUid = "";
        }
        if (this.redDotNum == null) {
            this.redDotNum = "";
        }
        if (this.messagecCellType == null) {
            this.messagecCellType = "";
        }
        if (this.messageTab == null) {
            this.messageTab = "";
        }
        if (this.user_tag == null) {
            this.user_tag = "";
        }
        if (this.equipment_type == null) {
            this.equipment_type = "";
        }
        if (this.day_number == null) {
            this.day_number = "";
        }
        if (this.pairing_type == null) {
            this.pairing_type = "";
        }
        if (this.chat_guide == null) {
            this.chat_guide = "";
        }
        if (this.love_letter == null) {
            this.love_letter = "";
        }
        if (this.guide_type == null) {
            this.guide_type = "";
        }
        if (this.top_chat_type == null) {
            this.top_chat_type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
