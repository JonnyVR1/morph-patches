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
public class TacitTestProfileCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tacittestprofilecard";

    @ProtobufIndex(index = 7)
    public boolean otherUserState;

    @NonNull
    @ProtobufIndex(index = 8)
    public String otherUserStateText;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ProfileCard profileCard;

    @NonNull
    @ProtobufIndex(index = 1)
    public String questionLib;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String questionTypes;

    @ProtobufIndex(index = 9)
    public boolean tacitTestNewQuestion;

    @ProtobufIndex(index = 4)
    public boolean triggerMsgGuideCard;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String updateText;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean userState;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userStateText;
    public static ProtobufAdapter<TacitTestProfileCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<TacitTestProfileCard>() { // from class: com.p1.mobile.putong.core.data.TacitTestProfileCard.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TacitTestProfileCard tacitTestProfileCard) {
            String str = tacitTestProfileCard.questionLib;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = tacitTestProfileCard.questionTypes;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ProfileCard profileCard = tacitTestProfileCard.profileCard;
            if (profileCard != null) {
                iO += CodedOutputByteBufferNano.l(3, profileCard, ProfileCard.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, tacitTestProfileCard.triggerMsgGuideCard) + CodedOutputByteBufferNano.b(5, tacitTestProfileCard.userState);
            String str3 = tacitTestProfileCard.userStateText;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(6, str3);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(7, tacitTestProfileCard.otherUserState);
            String str4 = tacitTestProfileCard.otherUserStateText;
            if (str4 != null) {
                iB2 += CodedOutputByteBufferNano.o(8, str4);
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(9, tacitTestProfileCard.tacitTestNewQuestion);
            String str5 = tacitTestProfileCard.updateText;
            if (str5 != null) {
                iB3 += CodedOutputByteBufferNano.o(10, str5);
            }
            ((MessageNano) tacitTestProfileCard).cachedSize = iB3;
            return iB3;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TacitTestProfileCard m15898parse(nb5 nb5Var) throws IOException {
            TacitTestProfileCard tacitTestProfileCard = new TacitTestProfileCard();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (tacitTestProfileCard.questionLib == null) {
                            tacitTestProfileCard.questionLib = "";
                        }
                        if (tacitTestProfileCard.questionTypes == null) {
                            tacitTestProfileCard.questionTypes = "";
                        }
                        if (tacitTestProfileCard.profileCard == null) {
                            tacitTestProfileCard.profileCard = ProfileCard.new_();
                        }
                        if (tacitTestProfileCard.userStateText == null) {
                            tacitTestProfileCard.userStateText = "";
                        }
                        if (tacitTestProfileCard.otherUserStateText == null) {
                            tacitTestProfileCard.otherUserStateText = "";
                        }
                        if (tacitTestProfileCard.updateText == null) {
                            tacitTestProfileCard.updateText = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        tacitTestProfileCard.questionLib = nb5Var.s();
                        continue;
                    case 18:
                        tacitTestProfileCard.questionTypes = nb5Var.s();
                        continue;
                    case 26:
                        tacitTestProfileCard.profileCard = (ProfileCard) nb5Var.l(ProfileCard.PROTOBUF_ADAPTER);
                        continue;
                    case 32:
                        tacitTestProfileCard.triggerMsgGuideCard = nb5Var.g();
                        continue;
                    case 40:
                        tacitTestProfileCard.userState = nb5Var.g();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        tacitTestProfileCard.userStateText = nb5Var.s();
                        continue;
                    case 56:
                        tacitTestProfileCard.otherUserState = nb5Var.g();
                        continue;
                    case 66:
                        tacitTestProfileCard.otherUserStateText = nb5Var.s();
                        continue;
                    case 72:
                        tacitTestProfileCard.tacitTestNewQuestion = nb5Var.g();
                        continue;
                    case 82:
                        tacitTestProfileCard.updateText = nb5Var.s();
                        continue;
                    default:
                        if (tacitTestProfileCard.questionLib == null) {
                            tacitTestProfileCard.questionLib = "";
                        }
                        if (tacitTestProfileCard.questionTypes == null) {
                            tacitTestProfileCard.questionTypes = "";
                        }
                        if (tacitTestProfileCard.profileCard == null) {
                            tacitTestProfileCard.profileCard = ProfileCard.new_();
                        }
                        if (tacitTestProfileCard.userStateText == null) {
                            tacitTestProfileCard.userStateText = "";
                        }
                        if (tacitTestProfileCard.otherUserStateText == null) {
                            tacitTestProfileCard.otherUserStateText = "";
                        }
                        if (tacitTestProfileCard.updateText == null) {
                            tacitTestProfileCard.updateText = "";
                            return tacitTestProfileCard;
                        }
                        break;
                }
            }
            return tacitTestProfileCard;
        }

        public void serialize(TacitTestProfileCard tacitTestProfileCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tacitTestProfileCard.questionLib;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = tacitTestProfileCard.questionTypes;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            ProfileCard profileCard = tacitTestProfileCard.profileCard;
            if (profileCard != null) {
                codedOutputByteBufferNano.K(3, profileCard, ProfileCard.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(4, tacitTestProfileCard.triggerMsgGuideCard);
            codedOutputByteBufferNano.A(5, tacitTestProfileCard.userState);
            String str3 = tacitTestProfileCard.userStateText;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            codedOutputByteBufferNano.A(7, tacitTestProfileCard.otherUserState);
            String str4 = tacitTestProfileCard.otherUserStateText;
            if (str4 != null) {
                codedOutputByteBufferNano.R(8, str4);
            }
            codedOutputByteBufferNano.A(9, tacitTestProfileCard.tacitTestNewQuestion);
            String str5 = tacitTestProfileCard.updateText;
            if (str5 != null) {
                codedOutputByteBufferNano.R(10, str5);
            }
        }
    };
    public static JsonAdapter<TacitTestProfileCard> JSON_ADAPTER = new ObjectJsonAdapter<TacitTestProfileCard>() { // from class: com.p1.mobile.putong.core.data.TacitTestProfileCard.2
        public Class getDataClass() {
            return TacitTestProfileCard.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TacitTestProfileCard m15899newInstance() {
            return new TacitTestProfileCard();
        }

        public boolean parseField(TacitTestProfileCard tacitTestProfileCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "triggerMsgGuideCard":
                    tacitTestProfileCard.triggerMsgGuideCard = jsonParser.getValueAsBoolean();
                    return true;
                case "otherUserStateText":
                    tacitTestProfileCard.otherUserStateText = jsonParser.getValueAsString();
                    return true;
                case "questionTypes":
                    tacitTestProfileCard.questionTypes = jsonParser.getValueAsString();
                    return true;
                case "tacitTestNewQuestion":
                    tacitTestProfileCard.tacitTestNewQuestion = jsonParser.getValueAsBoolean();
                    return true;
                case "updateText":
                    tacitTestProfileCard.updateText = jsonParser.getValueAsString();
                    return true;
                case "userStateText":
                    tacitTestProfileCard.userStateText = jsonParser.getValueAsString();
                    return true;
                case "profileCard":
                    tacitTestProfileCard.profileCard = (ProfileCard) ProfileCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userState":
                    tacitTestProfileCard.userState = jsonParser.getValueAsBoolean();
                    return true;
                case "otherUserState":
                    tacitTestProfileCard.otherUserState = jsonParser.getValueAsBoolean();
                    return true;
                case "questionLib":
                    tacitTestProfileCard.questionLib = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TacitTestProfileCard tacitTestProfileCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "triggerMsgGuideCard":
                case "otherUserStateText":
                case "questionTypes":
                case "tacitTestNewQuestion":
                case "updateText":
                case "userStateText":
                case "profileCard":
                case "userState":
                case "otherUserState":
                case "questionLib":
                    return true;
                default:
                    return super.parseFieldCheck(tacitTestProfileCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TacitTestProfileCard tacitTestProfileCard, JsonGenerator jsonGenerator) throws IOException {
            String str = tacitTestProfileCard.questionLib;
            if (str != null) {
                jsonGenerator.writeStringField("questionLib", str);
            }
            String str2 = tacitTestProfileCard.questionTypes;
            if (str2 != null) {
                jsonGenerator.writeStringField("questionTypes", str2);
            }
            if (tacitTestProfileCard.profileCard != null) {
                jsonGenerator.writeFieldName("profileCard");
                ProfileCard.JSON_ADAPTER.serialize(tacitTestProfileCard.profileCard, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("triggerMsgGuideCard", tacitTestProfileCard.triggerMsgGuideCard);
            jsonGenerator.writeBooleanField("userState", tacitTestProfileCard.userState);
            String str3 = tacitTestProfileCard.userStateText;
            if (str3 != null) {
                jsonGenerator.writeStringField("userStateText", str3);
            }
            jsonGenerator.writeBooleanField("otherUserState", tacitTestProfileCard.otherUserState);
            String str4 = tacitTestProfileCard.otherUserStateText;
            if (str4 != null) {
                jsonGenerator.writeStringField("otherUserStateText", str4);
            }
            jsonGenerator.writeBooleanField("tacitTestNewQuestion", tacitTestProfileCard.tacitTestNewQuestion);
            String str5 = tacitTestProfileCard.updateText;
            if (str5 != null) {
                jsonGenerator.writeStringField("updateText", str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TacitTestProfileCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TacitTestProfileCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TacitTestProfileCard new_() {
        TacitTestProfileCard tacitTestProfileCard = new TacitTestProfileCard();
        tacitTestProfileCard.nullCheck();
        return tacitTestProfileCard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TacitTestProfileCard m15897clone() {
        TacitTestProfileCard tacitTestProfileCard = new TacitTestProfileCard();
        tacitTestProfileCard.questionLib = this.questionLib;
        tacitTestProfileCard.questionTypes = this.questionTypes;
        ProfileCard profileCard = this.profileCard;
        if (profileCard != null) {
            tacitTestProfileCard.profileCard = profileCard.m14920clone();
        }
        tacitTestProfileCard.triggerMsgGuideCard = this.triggerMsgGuideCard;
        tacitTestProfileCard.userState = this.userState;
        tacitTestProfileCard.userStateText = this.userStateText;
        tacitTestProfileCard.otherUserState = this.otherUserState;
        tacitTestProfileCard.otherUserStateText = this.otherUserStateText;
        tacitTestProfileCard.tacitTestNewQuestion = this.tacitTestNewQuestion;
        tacitTestProfileCard.updateText = this.updateText;
        return tacitTestProfileCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TacitTestProfileCard)) {
            return false;
        }
        TacitTestProfileCard tacitTestProfileCard = (TacitTestProfileCard) obj;
        return ValueObject.util_equals(this.questionLib, tacitTestProfileCard.questionLib) && ValueObject.util_equals(this.questionTypes, tacitTestProfileCard.questionTypes) && ValueObject.util_equals(this.profileCard, tacitTestProfileCard.profileCard) && this.triggerMsgGuideCard == tacitTestProfileCard.triggerMsgGuideCard && this.userState == tacitTestProfileCard.userState && ValueObject.util_equals(this.userStateText, tacitTestProfileCard.userStateText) && this.otherUserState == tacitTestProfileCard.otherUserState && ValueObject.util_equals(this.otherUserStateText, tacitTestProfileCard.otherUserStateText) && this.tacitTestNewQuestion == tacitTestProfileCard.tacitTestNewQuestion && ValueObject.util_equals(this.updateText, tacitTestProfileCard.updateText);
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
        String str = this.questionLib;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.questionTypes;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        ProfileCard profileCard = this.profileCard;
        int iHashCode3 = (((((iHashCode2 + (profileCard != null ? profileCard.hashCode() : 0)) * 41) + (this.triggerMsgGuideCard ? 1231 : 1237)) * 41) + (this.userState ? 1231 : 1237)) * 41;
        String str3 = this.userStateText;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.otherUserState ? 1231 : 1237)) * 41;
        String str4 = this.otherUserStateText;
        int iHashCode5 = (((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.tacitTestNewQuestion ? 1231 : 1237)) * 41;
        String str5 = this.updateText;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.questionLib == null) {
            this.questionLib = "";
        }
        if (this.questionTypes == null) {
            this.questionTypes = "";
        }
        if (this.profileCard == null) {
            this.profileCard = ProfileCard.new_();
        }
        if (this.userStateText == null) {
            this.userStateText = "";
        }
        if (this.otherUserStateText == null) {
            this.otherUserStateText = "";
        }
        if (this.updateText == null) {
            this.updateText = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
