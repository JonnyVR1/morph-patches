package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class UserLiveLabel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userlivelabel";

    @NonNull
    @ProtobufIndex(index = 9)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String buttonTitle;

    @NonNull
    @ProtobufIndex(index = 3)
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
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String voiceRoomTopicId;
    public static ProtobufAdapter<UserLiveLabel> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveLabel>() { // from class: com.p1.mobile.putong.core.data.UserLiveLabel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserLiveLabel userLiveLabel) {
            String str = userLiveLabel.mainTitle;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = userLiveLabel.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = userLiveLabel.iconTitle;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = userLiveLabel.userId;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = userLiveLabel.buttonTitle;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = userLiveLabel.liveId;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(7, userLiveLabel.ongoingCall);
            String str7 = userLiveLabel.liveState;
            if (str7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str7);
            }
            String str8 = userLiveLabel.anchorId;
            if (str8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(9, str8);
            }
            String str9 = userLiveLabel.voiceRoomTopicId;
            if (str9 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(10, str9);
            }
            userLiveLabel.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserLiveLabel parse(nc5 nc5Var) throws IOException {
            UserLiveLabel userLiveLabel = new UserLiveLabel();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                    case 10:
                        userLiveLabel.mainTitle = nc5Var.m162495s();
                        continue;
                    case 18:
                        userLiveLabel.subTitle = nc5Var.m162495s();
                        continue;
                    case 26:
                        userLiveLabel.iconTitle = nc5Var.m162495s();
                        continue;
                    case 34:
                        userLiveLabel.userId = nc5Var.m162495s();
                        continue;
                    case 42:
                        userLiveLabel.buttonTitle = nc5Var.m162495s();
                        continue;
                    case 50:
                        userLiveLabel.liveId = nc5Var.m162495s();
                        continue;
                    case 56:
                        userLiveLabel.ongoingCall = nc5Var.m162483g();
                        continue;
                    case 66:
                        userLiveLabel.liveState = nc5Var.m162495s();
                        continue;
                    case 74:
                        userLiveLabel.anchorId = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        userLiveLabel.voiceRoomTopicId = nc5Var.m162495s();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserLiveLabel userLiveLabel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userLiveLabel.mainTitle;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = userLiveLabel.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = userLiveLabel.iconTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = userLiveLabel.userId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = userLiveLabel.buttonTitle;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = userLiveLabel.liveId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            codedOutputByteBufferNano.m17299A(7, userLiveLabel.ongoingCall);
            String str7 = userLiveLabel.liveState;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(8, str7);
            }
            String str8 = userLiveLabel.anchorId;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(9, str8);
            }
            String str9 = userLiveLabel.voiceRoomTopicId;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(10, str9);
            }
        }
    };
    public static JsonAdapter<UserLiveLabel> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveLabel>() { // from class: com.p1.mobile.putong.core.data.UserLiveLabel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserLiveLabel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserLiveLabel newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveLabel new_() {
        UserLiveLabel userLiveLabel = new UserLiveLabel();
        userLiveLabel.nullCheck();
        return userLiveLabel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserLiveLabel mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "userlivelabel";
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
