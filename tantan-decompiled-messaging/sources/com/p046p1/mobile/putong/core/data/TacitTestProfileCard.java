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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class TacitTestProfileCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tacittestprofilecard";

    @ProtobufIndex(index = 7)
    public boolean otherUserState;

    @NonNull
    @ProtobufIndex(index = 8)
    public String otherUserStateText;

    @NonNull
    @ProtobufIndex(index = 3)
    public ProfileCard profileCard;

    @NonNull
    @ProtobufIndex(index = 1)
    public String questionLib;

    @NonNull
    @ProtobufIndex(index = 2)
    public String questionTypes;

    @ProtobufIndex(index = 9)
    public boolean tacitTestNewQuestion;

    @ProtobufIndex(index = 4)
    public boolean triggerMsgGuideCard;

    @NonNull
    @ProtobufIndex(index = 10)
    public String updateText;

    @ProtobufIndex(index = 5)
    public boolean userState;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userStateText;
    public static ProtobufAdapter<TacitTestProfileCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<TacitTestProfileCard>() { // from class: com.p1.mobile.putong.core.data.TacitTestProfileCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TacitTestProfileCard tacitTestProfileCard) {
            String str = tacitTestProfileCard.questionLib;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = tacitTestProfileCard.questionTypes;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            ProfileCard profileCard = tacitTestProfileCard.profileCard;
            if (profileCard != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, profileCard, ProfileCard.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(4, tacitTestProfileCard.triggerMsgGuideCard) + CodedOutputByteBufferNano.m17220b(5, tacitTestProfileCard.userState);
            String str3 = tacitTestProfileCard.userStateText;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(7, tacitTestProfileCard.otherUserState);
            String str4 = tacitTestProfileCard.otherUserStateText;
            if (str4 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(8, str4);
            }
            int iM17220b3 = iM17220b2 + CodedOutputByteBufferNano.m17220b(9, tacitTestProfileCard.tacitTestNewQuestion);
            String str5 = tacitTestProfileCard.updateText;
            if (str5 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(10, str5);
            }
            tacitTestProfileCard.cachedSize = iM17220b3;
            return iM17220b3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TacitTestProfileCard parse(nb5 nb5Var) throws IOException {
            TacitTestProfileCard tacitTestProfileCard = new TacitTestProfileCard();
            while (true) {
                switch (nb5Var.m158752u()) {
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
                    case 10:
                        tacitTestProfileCard.questionLib = nb5Var.m158750s();
                        continue;
                    case 18:
                        tacitTestProfileCard.questionTypes = nb5Var.m158750s();
                        continue;
                    case 26:
                        tacitTestProfileCard.profileCard = (ProfileCard) nb5Var.m158743l(ProfileCard.PROTOBUF_ADAPTER);
                        continue;
                    case 32:
                        tacitTestProfileCard.triggerMsgGuideCard = nb5Var.m158738g();
                        continue;
                    case 40:
                        tacitTestProfileCard.userState = nb5Var.m158738g();
                        continue;
                    case 50:
                        tacitTestProfileCard.userStateText = nb5Var.m158750s();
                        continue;
                    case 56:
                        tacitTestProfileCard.otherUserState = nb5Var.m158738g();
                        continue;
                    case 66:
                        tacitTestProfileCard.otherUserStateText = nb5Var.m158750s();
                        continue;
                    case 72:
                        tacitTestProfileCard.tacitTestNewQuestion = nb5Var.m158738g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        tacitTestProfileCard.updateText = nb5Var.m158750s();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TacitTestProfileCard tacitTestProfileCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tacitTestProfileCard.questionLib;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = tacitTestProfileCard.questionTypes;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            ProfileCard profileCard = tacitTestProfileCard.profileCard;
            if (profileCard != null) {
                codedOutputByteBufferNano.m17254K(3, profileCard, ProfileCard.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(4, tacitTestProfileCard.triggerMsgGuideCard);
            codedOutputByteBufferNano.m17244A(5, tacitTestProfileCard.userState);
            String str3 = tacitTestProfileCard.userStateText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
            codedOutputByteBufferNano.m17244A(7, tacitTestProfileCard.otherUserState);
            String str4 = tacitTestProfileCard.otherUserStateText;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(8, str4);
            }
            codedOutputByteBufferNano.m17244A(9, tacitTestProfileCard.tacitTestNewQuestion);
            String str5 = tacitTestProfileCard.updateText;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(10, str5);
            }
        }
    };
    public static JsonAdapter<TacitTestProfileCard> JSON_ADAPTER = new ObjectJsonAdapter<TacitTestProfileCard>() { // from class: com.p1.mobile.putong.core.data.TacitTestProfileCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TacitTestProfileCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TacitTestProfileCard newInstance() {
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
                    tacitTestProfileCard.profileCard = ProfileCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TacitTestProfileCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TacitTestProfileCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TacitTestProfileCard new_() {
        TacitTestProfileCard tacitTestProfileCard = new TacitTestProfileCard();
        tacitTestProfileCard.nullCheck();
        return tacitTestProfileCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TacitTestProfileCard mo223809clone() {
        TacitTestProfileCard tacitTestProfileCard = new TacitTestProfileCard();
        tacitTestProfileCard.questionLib = this.questionLib;
        tacitTestProfileCard.questionTypes = this.questionTypes;
        ProfileCard profileCard = this.profileCard;
        if (profileCard != null) {
            tacitTestProfileCard.profileCard = profileCard.mo223809clone();
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
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
