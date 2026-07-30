package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Grade;
import com.p051p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoicePayGuideUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoicePayGuideUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoicePayGuideUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoicePayGuideUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoicePayGuideUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoicePayGuideUser newInstance() {
            return new BLiveVoicePayGuideUser();
        }

        public boolean parseField(BLiveVoicePayGuideUser bLiveVoicePayGuideUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveVoicePayGuideUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "gender":
                    bLiveVoicePayGuideUser.gender = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoicePayGuideUser.userId = jsonParser.getValueAsString();
                    return true;
                case "zodiac":
                    bLiveVoicePayGuideUser.zodiac = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveVoicePayGuideUser.userName = jsonParser.getValueAsString();
                    return true;
                case "age":
                    bLiveVoicePayGuideUser.age = jsonParser.getValueAsInt();
                    return true;
                case "grade":
                    bLiveVoicePayGuideUser.grade = jsonParser.getValueAsInt();
                    return true;
                case "avatarFrame":
                    bLiveVoicePayGuideUser.avatarFrame = BLiveVoiceMedalWallItemHeaderUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoicePayGuideUser bLiveVoicePayGuideUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoicePayGuideUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVoicePayGuideUser.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveVoicePayGuideUser.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            if (bLiveVoicePayGuideUser.avatarFrame != null) {
                jsonGenerator.writeFieldName("avatarFrame");
                BLiveVoiceMedalWallItemHeaderUrl.JSON_ADAPTER.serialize(bLiveVoicePayGuideUser.avatarFrame, jsonGenerator, true);
            }
            String str4 = bLiveVoicePayGuideUser.gender;
            if (str4 != null) {
                jsonGenerator.writeStringField("gender", str4);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, bLiveVoicePayGuideUser.age);
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveVoicePayGuideUser.grade);
            String str5 = bLiveVoicePayGuideUser.zodiac;
            if (str5 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.zodiac, str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoicePayGuideUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicepayguideuser";

    @ProtobufIndex(index = 6)
    public int age;

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveVoiceMedalWallItemHeaderUrl avatarFrame;

    @NonNull
    @ProtobufIndex(index = 5)
    public String gender;

    @ProtobufIndex(index = 7)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    @NonNull
    @ProtobufIndex(index = 8)
    public String zodiac;

    public static BLiveVoicePayGuideUser new_() {
        BLiveVoicePayGuideUser bLiveVoicePayGuideUser = new BLiveVoicePayGuideUser();
        bLiveVoicePayGuideUser.nullCheck();
        return bLiveVoicePayGuideUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoicePayGuideUser mo225055clone() {
        BLiveVoicePayGuideUser bLiveVoicePayGuideUser = new BLiveVoicePayGuideUser();
        bLiveVoicePayGuideUser.userId = this.userId;
        bLiveVoicePayGuideUser.userName = this.userName;
        bLiveVoicePayGuideUser.avatar = this.avatar;
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = this.avatarFrame;
        if (bLiveVoiceMedalWallItemHeaderUrl != null) {
            bLiveVoicePayGuideUser.avatarFrame = bLiveVoiceMedalWallItemHeaderUrl.mo225055clone();
        }
        bLiveVoicePayGuideUser.gender = this.gender;
        bLiveVoicePayGuideUser.age = this.age;
        bLiveVoicePayGuideUser.grade = this.grade;
        bLiveVoicePayGuideUser.zodiac = this.zodiac;
        return bLiveVoicePayGuideUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoicePayGuideUser)) {
            return false;
        }
        BLiveVoicePayGuideUser bLiveVoicePayGuideUser = (BLiveVoicePayGuideUser) obj;
        return ValueObject.util_equals(this.userId, bLiveVoicePayGuideUser.userId) && ValueObject.util_equals(this.userName, bLiveVoicePayGuideUser.userName) && ValueObject.util_equals(this.avatar, bLiveVoicePayGuideUser.avatar) && ValueObject.util_equals(this.avatarFrame, bLiveVoicePayGuideUser.avatarFrame) && ValueObject.util_equals(this.gender, bLiveVoicePayGuideUser.gender) && this.age == bLiveVoicePayGuideUser.age && this.grade == bLiveVoicePayGuideUser.grade && ValueObject.util_equals(this.zodiac, bLiveVoicePayGuideUser.zodiac);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = this.avatarFrame;
        int iHashCode4 = (iHashCode3 + (bLiveVoiceMedalWallItemHeaderUrl != null ? bLiveVoiceMedalWallItemHeaderUrl.hashCode() : 0)) * 41;
        String str4 = this.gender;
        int iHashCode5 = (((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.age) * 41) + this.grade) * 41;
        String str5 = this.zodiac;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.avatarFrame == null) {
            this.avatarFrame = BLiveVoiceMedalWallItemHeaderUrl.new_();
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.zodiac == null) {
            this.zodiac = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
