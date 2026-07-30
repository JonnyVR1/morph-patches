package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceSettle extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSettle> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSettle>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSettle.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSettle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSettle newInstance() {
            return new BLiveVoiceSettle();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceSettle bLiveVoiceSettle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1268375501:
                    if (str.equals("starlightGrade")) {
                        b = 0;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 1;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 2;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 3;
                    }
                    break;
                case -10385663:
                    if (str.equals("canRecall")) {
                        b = 4;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 5;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 6;
                    }
                    break;
                case 96343182:
                    if (str.equals("isRoomOwner")) {
                        b = 7;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 8;
                    }
                    break;
                case 255481635:
                    if (str.equals("isManager")) {
                        b = 9;
                    }
                    break;
                case 296534248:
                    if (str.equals("starlightGradeImage")) {
                        b = 10;
                    }
                    break;
                case 317295308:
                    if (str.equals("userGrade")) {
                        b = 11;
                    }
                    break;
                case 567956364:
                    if (str.equals("userAvatarResourceType")) {
                        b = 12;
                    }
                    break;
                case 1078154500:
                    if (str.equals("userAvatar")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1234601580:
                    if (str.equals("userGender")) {
                        b = 14;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceSettle.starlightGrade = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    bLiveVoiceSettle.roomId = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveVoiceSettle.userId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoiceSettle.userName = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoiceSettle.canRecall = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveVoiceSettle.f45356id = jsonParser.getValueAsString();
                    return false;
                case 6:
                    bLiveVoiceSettle.type = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoiceSettle.isRoomOwner = jsonParser.getValueAsBoolean();
                    return true;
                case 8:
                    bLiveVoiceSettle.state = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveVoiceSettle.isManager = jsonParser.getValueAsBoolean();
                    return true;
                case 10:
                    bLiveVoiceSettle.starlightGradeImage = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoiceSettle.userGrade = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    bLiveVoiceSettle.userAvatarResourceType = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceSettle.userAvatar = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveVoiceSettle.userGender = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSettle bLiveVoiceSettle, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceSettle.f45356id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceSettle.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveVoiceSettle.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = bLiveVoiceSettle.state;
            if (str4 != null) {
                jsonGenerator.writeStringField("state", str4);
            }
            jsonGenerator.writeBooleanField("isRoomOwner", bLiveVoiceSettle.isRoomOwner);
            jsonGenerator.writeBooleanField("isManager", bLiveVoiceSettle.isManager);
            jsonGenerator.writeBooleanField("canRecall", bLiveVoiceSettle.canRecall);
            String str5 = bLiveVoiceSettle.userName;
            if (str5 != null) {
                jsonGenerator.writeStringField("userName", str5);
            }
            String str6 = bLiveVoiceSettle.userGender;
            if (str6 != null) {
                jsonGenerator.writeStringField("userGender", str6);
            }
            String str7 = bLiveVoiceSettle.userAvatar;
            if (str7 != null) {
                jsonGenerator.writeStringField("userAvatar", str7);
            }
            String str8 = bLiveVoiceSettle.type;
            if (str8 != null) {
                jsonGenerator.writeStringField("type", str8);
            }
            jsonGenerator.writeNumberField("userGrade", bLiveVoiceSettle.userGrade);
            String str9 = bLiveVoiceSettle.userAvatarResourceType;
            if (str9 != null) {
                jsonGenerator.writeStringField("userAvatarResourceType", str9);
            }
            jsonGenerator.writeNumberField("starlightGrade", bLiveVoiceSettle.starlightGrade);
            String str10 = bLiveVoiceSettle.starlightGradeImage;
            if (str10 != null) {
                jsonGenerator.writeStringField("starlightGradeImage", str10);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSettle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesettle";

    @ProtobufIndex(index = 8)
    public boolean canRecall;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45356id;

    @ProtobufIndex(index = 6)
    public boolean isManager;

    @ProtobufIndex(index = 5)
    public boolean isRoomOwner;
    public boolean isSelected = false;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @ProtobufIndex(index = 14)
    public long starlightGrade;

    @NonNull
    @ProtobufIndex(index = 15)
    public String starlightGradeImage;

    @NonNull
    @ProtobufIndex(index = 4)
    public String state;

    @NonNull
    @ProtobufIndex(index = 11)
    public String type;

    @NonNull
    @ProtobufIndex(index = 10)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 13)
    public String userAvatarResourceType;

    @NonNull
    @ProtobufIndex(index = 9)
    public String userGender;

    @ProtobufIndex(index = 12)
    public int userGrade;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String userName;

    public static BLiveVoiceSettle new_() {
        BLiveVoiceSettle bLiveVoiceSettle = new BLiveVoiceSettle();
        bLiveVoiceSettle.nullCheck();
        return bLiveVoiceSettle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSettle mo225055clone() {
        BLiveVoiceSettle bLiveVoiceSettle = new BLiveVoiceSettle();
        bLiveVoiceSettle.f45356id = this.f45356id;
        bLiveVoiceSettle.roomId = this.roomId;
        bLiveVoiceSettle.userId = this.userId;
        bLiveVoiceSettle.state = this.state;
        bLiveVoiceSettle.isRoomOwner = this.isRoomOwner;
        bLiveVoiceSettle.isManager = this.isManager;
        bLiveVoiceSettle.canRecall = this.canRecall;
        bLiveVoiceSettle.userName = this.userName;
        bLiveVoiceSettle.userGender = this.userGender;
        bLiveVoiceSettle.userAvatar = this.userAvatar;
        bLiveVoiceSettle.type = this.type;
        bLiveVoiceSettle.userGrade = this.userGrade;
        bLiveVoiceSettle.userAvatarResourceType = this.userAvatarResourceType;
        bLiveVoiceSettle.starlightGrade = this.starlightGrade;
        bLiveVoiceSettle.starlightGradeImage = this.starlightGradeImage;
        return bLiveVoiceSettle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSettle)) {
            return false;
        }
        BLiveVoiceSettle bLiveVoiceSettle = (BLiveVoiceSettle) obj;
        return ValueObject.util_equals(this.f45356id, bLiveVoiceSettle.f45356id) && ValueObject.util_equals(this.roomId, bLiveVoiceSettle.roomId) && ValueObject.util_equals(this.userId, bLiveVoiceSettle.userId) && ValueObject.util_equals(this.state, bLiveVoiceSettle.state) && this.isRoomOwner == bLiveVoiceSettle.isRoomOwner && this.isManager == bLiveVoiceSettle.isManager && this.canRecall == bLiveVoiceSettle.canRecall && ValueObject.util_equals(this.userName, bLiveVoiceSettle.userName) && ValueObject.util_equals(this.userGender, bLiveVoiceSettle.userGender) && ValueObject.util_equals(this.userAvatar, bLiveVoiceSettle.userAvatar) && ValueObject.util_equals(this.type, bLiveVoiceSettle.type) && this.userGrade == bLiveVoiceSettle.userGrade && ValueObject.util_equals(this.userAvatarResourceType, bLiveVoiceSettle.userAvatarResourceType) && this.starlightGrade == bLiveVoiceSettle.starlightGrade && ValueObject.util_equals(this.starlightGradeImage, bLiveVoiceSettle.starlightGradeImage);
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
        String str = this.f45356id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.state;
        int iHashCode4 = (((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.isRoomOwner ? 1231 : 1237)) * 41) + (this.isManager ? 1231 : 1237)) * 41) + (this.canRecall ? 1231 : 1237)) * 41;
        String str5 = this.userName;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.userGender;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.userAvatar;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.type;
        int iHashCode8 = (((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41) + this.userGrade) * 41;
        String str9 = this.userAvatarResourceType;
        int iHashCode9 = str9 != null ? str9.hashCode() : 0;
        long j = this.starlightGrade;
        int i3 = (((iHashCode8 + iHashCode9) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str10 = this.starlightGradeImage;
        int iHashCode10 = i3 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45356id == null) {
            this.f45356id = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userGender == null) {
            this.userGender = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.userAvatarResourceType == null) {
            this.userAvatarResourceType = "";
        }
        if (this.starlightGradeImage == null) {
            this.starlightGradeImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
