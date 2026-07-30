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
public class UserLiveLabel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userlivelabel";

    @NonNull
    @ProtobufIndex(index = 9)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String buttonTitle;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String iconTitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String liveState;

    @NonNull
    @ProtobufIndex(index = 1)
    public String mainTitle;

    @ProtobufIndex(index = 7)
    public boolean ongoingCall;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userId;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String voiceRoomTopicId;
    public static ProtobufAdapter<UserLiveLabel> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveLabel>() { // from class: com.p1.mobile.putong.core.data.UserLiveLabel.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserLiveLabel userLiveLabel) {
            String str = userLiveLabel.mainTitle;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = userLiveLabel.subTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = userLiveLabel.iconTitle;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = userLiveLabel.userId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = userLiveLabel.buttonTitle;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = userLiveLabel.liveId;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            int iB = iO + CodedOutputByteBufferNano.b(7, userLiveLabel.ongoingCall);
            String str7 = userLiveLabel.liveState;
            if (str7 != null) {
                iB += CodedOutputByteBufferNano.o(8, str7);
            }
            String str8 = userLiveLabel.anchorId;
            if (str8 != null) {
                iB += CodedOutputByteBufferNano.o(9, str8);
            }
            String str9 = userLiveLabel.voiceRoomTopicId;
            if (str9 != null) {
                iB += CodedOutputByteBufferNano.o(10, str9);
            }
            ((MessageNano) userLiveLabel).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserLiveLabel m16144parse(nb5 nb5Var) throws IOException {
            UserLiveLabel userLiveLabel = new UserLiveLabel();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (userLiveLabel.mainTitle == null) {
                            userLiveLabel.mainTitle = "";
                        }
                        if (userLiveLabel.subTitle == null) {
                            userLiveLabel.subTitle = "";
                        }
                        if (userLiveLabel.iconTitle == null) {
                            userLiveLabel.iconTitle = "";
                        }
                        if (userLiveLabel.userId == null) {
                            userLiveLabel.userId = "";
                        }
                        if (userLiveLabel.buttonTitle == null) {
                            userLiveLabel.buttonTitle = "";
                        }
                        if (userLiveLabel.liveId == null) {
                            userLiveLabel.liveId = "";
                        }
                        if (userLiveLabel.liveState == null) {
                            userLiveLabel.liveState = "";
                        }
                        if (userLiveLabel.anchorId == null) {
                            userLiveLabel.anchorId = "";
                        }
                        if (userLiveLabel.voiceRoomTopicId == null) {
                            userLiveLabel.voiceRoomTopicId = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        userLiveLabel.mainTitle = nb5Var.s();
                        continue;
                    case 18:
                        userLiveLabel.subTitle = nb5Var.s();
                        continue;
                    case 26:
                        userLiveLabel.iconTitle = nb5Var.s();
                        continue;
                    case 34:
                        userLiveLabel.userId = nb5Var.s();
                        continue;
                    case 42:
                        userLiveLabel.buttonTitle = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        userLiveLabel.liveId = nb5Var.s();
                        continue;
                    case 56:
                        userLiveLabel.ongoingCall = nb5Var.g();
                        continue;
                    case 66:
                        userLiveLabel.liveState = nb5Var.s();
                        continue;
                    case 74:
                        userLiveLabel.anchorId = nb5Var.s();
                        continue;
                    case 82:
                        userLiveLabel.voiceRoomTopicId = nb5Var.s();
                        continue;
                    default:
                        if (userLiveLabel.mainTitle == null) {
                            userLiveLabel.mainTitle = "";
                        }
                        if (userLiveLabel.subTitle == null) {
                            userLiveLabel.subTitle = "";
                        }
                        if (userLiveLabel.iconTitle == null) {
                            userLiveLabel.iconTitle = "";
                        }
                        if (userLiveLabel.userId == null) {
                            userLiveLabel.userId = "";
                        }
                        if (userLiveLabel.buttonTitle == null) {
                            userLiveLabel.buttonTitle = "";
                        }
                        if (userLiveLabel.liveId == null) {
                            userLiveLabel.liveId = "";
                        }
                        if (userLiveLabel.liveState == null) {
                            userLiveLabel.liveState = "";
                        }
                        if (userLiveLabel.anchorId == null) {
                            userLiveLabel.anchorId = "";
                        }
                        if (userLiveLabel.voiceRoomTopicId == null) {
                            userLiveLabel.voiceRoomTopicId = "";
                            return userLiveLabel;
                        }
                        break;
                }
            }
            return userLiveLabel;
        }

        public void serialize(UserLiveLabel userLiveLabel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userLiveLabel.mainTitle;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = userLiveLabel.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = userLiveLabel.iconTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = userLiveLabel.userId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = userLiveLabel.buttonTitle;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = userLiveLabel.liveId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            codedOutputByteBufferNano.A(7, userLiveLabel.ongoingCall);
            String str7 = userLiveLabel.liveState;
            if (str7 != null) {
                codedOutputByteBufferNano.R(8, str7);
            }
            String str8 = userLiveLabel.anchorId;
            if (str8 != null) {
                codedOutputByteBufferNano.R(9, str8);
            }
            String str9 = userLiveLabel.voiceRoomTopicId;
            if (str9 != null) {
                codedOutputByteBufferNano.R(10, str9);
            }
        }
    };
    public static JsonAdapter<UserLiveLabel> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveLabel>() { // from class: com.p1.mobile.putong.core.data.UserLiveLabel.2
        public Class getDataClass() {
            return UserLiveLabel.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserLiveLabel m16145newInstance() {
            return new UserLiveLabel();
        }

        public boolean parseField(UserLiveLabel userLiveLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    userLiveLabel.subTitle = jsonParser.getValueAsString();
                    return true;
                case "buttonTitle":
                    userLiveLabel.buttonTitle = jsonParser.getValueAsString();
                    return true;
                case "iconTitle":
                    userLiveLabel.iconTitle = jsonParser.getValueAsString();
                    return true;
                case "ongoingCall":
                    userLiveLabel.ongoingCall = jsonParser.getValueAsBoolean();
                    return true;
                case "liveId":
                    userLiveLabel.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    userLiveLabel.anchorId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    userLiveLabel.userId = jsonParser.getValueAsString();
                    return true;
                case "mainTitle":
                    userLiveLabel.mainTitle = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomTopicId":
                    userLiveLabel.voiceRoomTopicId = jsonParser.getValueAsString();
                    return true;
                case "liveState":
                    userLiveLabel.liveState = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserLiveLabel userLiveLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "buttonTitle":
                case "iconTitle":
                case "ongoingCall":
                case "liveId":
                case "anchorId":
                case "userId":
                case "mainTitle":
                case "voiceRoomTopicId":
                case "liveState":
                    return true;
                default:
                    return super.parseFieldCheck(userLiveLabel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(UserLiveLabel userLiveLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = userLiveLabel.mainTitle;
            if (str != null) {
                jsonGenerator.writeStringField("mainTitle", str);
            }
            String str2 = userLiveLabel.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = userLiveLabel.iconTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconTitle", str3);
            }
            String str4 = userLiveLabel.userId;
            if (str4 != null) {
                jsonGenerator.writeStringField("userId", str4);
            }
            String str5 = userLiveLabel.buttonTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("buttonTitle", str5);
            }
            String str6 = userLiveLabel.liveId;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveId", str6);
            }
            jsonGenerator.writeBooleanField("ongoingCall", userLiveLabel.ongoingCall);
            String str7 = userLiveLabel.liveState;
            if (str7 != null) {
                jsonGenerator.writeStringField("liveState", str7);
            }
            String str8 = userLiveLabel.anchorId;
            if (str8 != null) {
                jsonGenerator.writeStringField("anchorId", str8);
            }
            String str9 = userLiveLabel.voiceRoomTopicId;
            if (str9 != null) {
                jsonGenerator.writeStringField("voiceRoomTopicId", str9);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveLabel new_() {
        UserLiveLabel userLiveLabel = new UserLiveLabel();
        userLiveLabel.nullCheck();
        return userLiveLabel;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserLiveLabel m16143clone() {
        UserLiveLabel userLiveLabel = new UserLiveLabel();
        userLiveLabel.mainTitle = this.mainTitle;
        userLiveLabel.subTitle = this.subTitle;
        userLiveLabel.iconTitle = this.iconTitle;
        userLiveLabel.userId = this.userId;
        userLiveLabel.buttonTitle = this.buttonTitle;
        userLiveLabel.liveId = this.liveId;
        userLiveLabel.ongoingCall = this.ongoingCall;
        userLiveLabel.liveState = this.liveState;
        userLiveLabel.anchorId = this.anchorId;
        userLiveLabel.voiceRoomTopicId = this.voiceRoomTopicId;
        return userLiveLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserLiveLabel)) {
            return false;
        }
        UserLiveLabel userLiveLabel = (UserLiveLabel) obj;
        return ValueObject.util_equals(this.mainTitle, userLiveLabel.mainTitle) && ValueObject.util_equals(this.subTitle, userLiveLabel.subTitle) && ValueObject.util_equals(this.iconTitle, userLiveLabel.iconTitle) && ValueObject.util_equals(this.userId, userLiveLabel.userId) && ValueObject.util_equals(this.buttonTitle, userLiveLabel.buttonTitle) && ValueObject.util_equals(this.liveId, userLiveLabel.liveId) && this.ongoingCall == userLiveLabel.ongoingCall && ValueObject.util_equals(this.liveState, userLiveLabel.liveState) && ValueObject.util_equals(this.anchorId, userLiveLabel.anchorId) && ValueObject.util_equals(this.voiceRoomTopicId, userLiveLabel.voiceRoomTopicId);
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
        String str = this.mainTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.iconTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.buttonTitle;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.liveId;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.ongoingCall ? 1231 : 1237)) * 41;
        String str7 = this.liveState;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.anchorId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.voiceRoomTopicId;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.mainTitle == null) {
            this.mainTitle = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.iconTitle == null) {
            this.iconTitle = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.buttonTitle == null) {
            this.buttonTitle = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.liveState == null) {
            this.liveState = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.voiceRoomTopicId == null) {
            this.voiceRoomTopicId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
