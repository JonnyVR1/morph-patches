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
public class UssTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usstags";

    @NonNull
    @ProtobufIndex(index = 5)
    public String avatarIdentifier;

    @NonNull
    @ProtobufIndex(index = 4)
    public String cardStyle;

    @NonNull
    @ProtobufIndex(index = 9)
    public String debugInfo;

    @NonNull
    @ProtobufIndex(index = 10)
    public String eventInfo;

    @ProtobufIndex(index = 3)
    public boolean newUser;

    @ProtobufIndex(index = 1)
    public int onlineStatus;

    @ProtobufIndex(index = 12)
    public boolean onlyShowAboutMeInside;

    @ProtobufIndex(index = 13)
    public boolean profileShowFollowButton;

    @ProtobufIndex(index = 6)
    public boolean repeatedUser;

    @ProtobufIndex(index = 2)
    public int selected;

    @ProtobufIndex(index = 11)
    public boolean showAboutMeOnCard;

    @NonNull
    @ProtobufIndex(index = 8)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 7)
    public String title;
    public static ProtobufAdapter<UssTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<UssTags>() { // from class: com.p1.mobile.putong.data.UssTags.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UssTags ussTags) {
            int iH = CodedOutputByteBufferNano.h(1, ussTags.onlineStatus) + CodedOutputByteBufferNano.h(2, ussTags.selected) + CodedOutputByteBufferNano.b(3, ussTags.newUser);
            String str = ussTags.cardStyle;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(4, str);
            }
            String str2 = ussTags.avatarIdentifier;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(5, str2);
            }
            int iB = iH + CodedOutputByteBufferNano.b(6, ussTags.repeatedUser);
            String str3 = ussTags.title;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(7, str3);
            }
            String str4 = ussTags.subTitle;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(8, str4);
            }
            String str5 = ussTags.debugInfo;
            if (str5 != null) {
                iB += CodedOutputByteBufferNano.o(9, str5);
            }
            String str6 = ussTags.eventInfo;
            if (str6 != null) {
                iB += CodedOutputByteBufferNano.o(10, str6);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(11, ussTags.showAboutMeOnCard) + CodedOutputByteBufferNano.b(12, ussTags.onlyShowAboutMeInside) + CodedOutputByteBufferNano.b(13, ussTags.profileShowFollowButton);
            ((MessageNano) ussTags).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UssTags m19250parse(nb5 nb5Var) throws IOException {
            UssTags ussTags = new UssTags();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (ussTags.cardStyle == null) {
                            ussTags.cardStyle = "";
                        }
                        if (ussTags.avatarIdentifier == null) {
                            ussTags.avatarIdentifier = "";
                        }
                        if (ussTags.title == null) {
                            ussTags.title = "";
                        }
                        if (ussTags.subTitle == null) {
                            ussTags.subTitle = "";
                        }
                        if (ussTags.debugInfo == null) {
                            ussTags.debugInfo = "";
                        }
                        if (ussTags.eventInfo == null) {
                            ussTags.eventInfo = "";
                        }
                        break;
                    case 8:
                        ussTags.onlineStatus = nb5Var.j();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                        ussTags.selected = nb5Var.j();
                        continue;
                    case 24:
                        ussTags.newUser = nb5Var.g();
                        continue;
                    case 34:
                        ussTags.cardStyle = nb5Var.s();
                        continue;
                    case 42:
                        ussTags.avatarIdentifier = nb5Var.s();
                        continue;
                    case 48:
                        ussTags.repeatedUser = nb5Var.g();
                        continue;
                    case 58:
                        ussTags.title = nb5Var.s();
                        continue;
                    case 66:
                        ussTags.subTitle = nb5Var.s();
                        continue;
                    case 74:
                        ussTags.debugInfo = nb5Var.s();
                        continue;
                    case 82:
                        ussTags.eventInfo = nb5Var.s();
                        continue;
                    case 88:
                        ussTags.showAboutMeOnCard = nb5Var.g();
                        continue;
                    case 96:
                        ussTags.onlyShowAboutMeInside = nb5Var.g();
                        continue;
                    case 104:
                        ussTags.profileShowFollowButton = nb5Var.g();
                        continue;
                    default:
                        if (ussTags.cardStyle == null) {
                            ussTags.cardStyle = "";
                        }
                        if (ussTags.avatarIdentifier == null) {
                            ussTags.avatarIdentifier = "";
                        }
                        if (ussTags.title == null) {
                            ussTags.title = "";
                        }
                        if (ussTags.subTitle == null) {
                            ussTags.subTitle = "";
                        }
                        if (ussTags.debugInfo == null) {
                            ussTags.debugInfo = "";
                        }
                        if (ussTags.eventInfo == null) {
                            ussTags.eventInfo = "";
                            return ussTags;
                        }
                        break;
                }
            }
            return ussTags;
        }

        public void serialize(UssTags ussTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, ussTags.onlineStatus);
            codedOutputByteBufferNano.G(2, ussTags.selected);
            codedOutputByteBufferNano.A(3, ussTags.newUser);
            String str = ussTags.cardStyle;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            String str2 = ussTags.avatarIdentifier;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            codedOutputByteBufferNano.A(6, ussTags.repeatedUser);
            String str3 = ussTags.title;
            if (str3 != null) {
                codedOutputByteBufferNano.R(7, str3);
            }
            String str4 = ussTags.subTitle;
            if (str4 != null) {
                codedOutputByteBufferNano.R(8, str4);
            }
            String str5 = ussTags.debugInfo;
            if (str5 != null) {
                codedOutputByteBufferNano.R(9, str5);
            }
            String str6 = ussTags.eventInfo;
            if (str6 != null) {
                codedOutputByteBufferNano.R(10, str6);
            }
            codedOutputByteBufferNano.A(11, ussTags.showAboutMeOnCard);
            codedOutputByteBufferNano.A(12, ussTags.onlyShowAboutMeInside);
            codedOutputByteBufferNano.A(13, ussTags.profileShowFollowButton);
        }
    };
    public static JsonAdapter<UssTags> JSON_ADAPTER = new ObjectJsonAdapter<UssTags>() { // from class: com.p1.mobile.putong.data.UssTags.2
        public Class getDataClass() {
            return UssTags.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UssTags mo17830newInstance() {
            return new UssTags();
        }

        public boolean parseField(UssTags ussTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    ussTags.subTitle = jsonParser.getValueAsString();
                    return true;
                case "repeatedUser":
                    ussTags.repeatedUser = jsonParser.getValueAsBoolean();
                    return true;
                case "avatarIdentifier":
                    ussTags.avatarIdentifier = jsonParser.getValueAsString();
                    return true;
                case "onlyShowAboutMeInside":
                    ussTags.onlyShowAboutMeInside = jsonParser.getValueAsBoolean();
                    return true;
                case "cardStyle":
                    ussTags.cardStyle = jsonParser.getValueAsString();
                    return true;
                case "debugInfo":
                    ussTags.debugInfo = jsonParser.getValueAsString();
                    return true;
                case "eventInfo":
                    ussTags.eventInfo = jsonParser.getValueAsString();
                    return true;
                case "title":
                    ussTags.title = jsonParser.getValueAsString();
                    return true;
                case "profileShowFollowButton":
                    ussTags.profileShowFollowButton = jsonParser.getValueAsBoolean();
                    return true;
                case "onlineStatus":
                    ussTags.onlineStatus = jsonParser.getValueAsInt();
                    return true;
                case "selected":
                    ussTags.selected = jsonParser.getValueAsInt();
                    return true;
                case "showAboutMeOnCard":
                    ussTags.showAboutMeOnCard = jsonParser.getValueAsBoolean();
                    return true;
                case "newUser":
                    ussTags.newUser = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UssTags ussTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "repeatedUser":
                case "avatarIdentifier":
                case "onlyShowAboutMeInside":
                case "cardStyle":
                case "debugInfo":
                case "eventInfo":
                case "title":
                case "profileShowFollowButton":
                case "onlineStatus":
                case "selected":
                case "showAboutMeOnCard":
                case "newUser":
                    return true;
                default:
                    return super.parseFieldCheck(ussTags, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UssTags ussTags, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("onlineStatus", ussTags.onlineStatus);
            jsonGenerator.writeNumberField(MatchFrom.selected, ussTags.selected);
            jsonGenerator.writeBooleanField("newUser", ussTags.newUser);
            String str = ussTags.cardStyle;
            if (str != null) {
                jsonGenerator.writeStringField("cardStyle", str);
            }
            String str2 = ussTags.avatarIdentifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatarIdentifier", str2);
            }
            jsonGenerator.writeBooleanField("repeatedUser", ussTags.repeatedUser);
            String str3 = ussTags.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            String str4 = ussTags.subTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("subTitle", str4);
            }
            String str5 = ussTags.debugInfo;
            if (str5 != null) {
                jsonGenerator.writeStringField("debugInfo", str5);
            }
            String str6 = ussTags.eventInfo;
            if (str6 != null) {
                jsonGenerator.writeStringField("eventInfo", str6);
            }
            jsonGenerator.writeBooleanField("showAboutMeOnCard", ussTags.showAboutMeOnCard);
            jsonGenerator.writeBooleanField("onlyShowAboutMeInside", ussTags.onlyShowAboutMeInside);
            jsonGenerator.writeBooleanField("profileShowFollowButton", ussTags.profileShowFollowButton);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UssTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UssTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UssTags new_() {
        UssTags ussTags = new UssTags();
        ussTags.nullCheck();
        return ussTags;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UssTags m19249clone() {
        UssTags ussTags = new UssTags();
        ussTags.onlineStatus = this.onlineStatus;
        ussTags.selected = this.selected;
        ussTags.newUser = this.newUser;
        ussTags.cardStyle = this.cardStyle;
        ussTags.avatarIdentifier = this.avatarIdentifier;
        ussTags.repeatedUser = this.repeatedUser;
        ussTags.title = this.title;
        ussTags.subTitle = this.subTitle;
        ussTags.debugInfo = this.debugInfo;
        ussTags.eventInfo = this.eventInfo;
        ussTags.showAboutMeOnCard = this.showAboutMeOnCard;
        ussTags.onlyShowAboutMeInside = this.onlyShowAboutMeInside;
        ussTags.profileShowFollowButton = this.profileShowFollowButton;
        return ussTags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UssTags)) {
            return false;
        }
        UssTags ussTags = (UssTags) obj;
        return this.onlineStatus == ussTags.onlineStatus && this.selected == ussTags.selected && this.newUser == ussTags.newUser && ValueObject.util_equals(this.cardStyle, ussTags.cardStyle) && ValueObject.util_equals(this.avatarIdentifier, ussTags.avatarIdentifier) && this.repeatedUser == ussTags.repeatedUser && ValueObject.util_equals(this.title, ussTags.title) && ValueObject.util_equals(this.subTitle, ussTags.subTitle) && ValueObject.util_equals(this.debugInfo, ussTags.debugInfo) && ValueObject.util_equals(this.eventInfo, ussTags.eventInfo) && this.showAboutMeOnCard == ussTags.showAboutMeOnCard && this.onlyShowAboutMeInside == ussTags.onlyShowAboutMeInside && this.profileShowFollowButton == ussTags.profileShowFollowButton;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + this.onlineStatus) * 41) + this.selected) * 41) + (this.newUser ? 1231 : 1237)) * 41;
        String str = this.cardStyle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatarIdentifier;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.repeatedUser ? 1231 : 1237)) * 41;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.subTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.debugInfo;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.eventInfo;
        int iHashCode6 = ((((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.showAboutMeOnCard ? 1231 : 1237)) * 41) + (this.onlyShowAboutMeInside ? 1231 : 1237)) * 41) + (this.profileShowFollowButton ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.cardStyle == null) {
            this.cardStyle = "";
        }
        if (this.avatarIdentifier == null) {
            this.avatarIdentifier = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.debugInfo == null) {
            this.debugInfo = "";
        }
        if (this.eventInfo == null) {
            this.eventInfo = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
