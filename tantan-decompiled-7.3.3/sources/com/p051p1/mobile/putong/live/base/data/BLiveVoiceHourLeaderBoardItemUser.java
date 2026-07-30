package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceHourLeaderBoardItemUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceHourLeaderBoardItemUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceHourLeaderBoardItemUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItemUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceHourLeaderBoardItemUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceHourLeaderBoardItemUser newInstance() {
            return new BLiveVoiceHourLeaderBoardItemUser();
        }

        public boolean parseField(BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveVoiceHourLeaderBoardItemUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "gender":
                    bLiveVoiceHourLeaderBoardItemUser.gender = jsonParser.getValueAsString();
                    return true;
                case "onCall":
                    bLiveVoiceHourLeaderBoardItemUser.onCall = jsonParser.getValueAsBoolean();
                    return true;
                case "schema":
                    bLiveVoiceHourLeaderBoardItemUser.schema = jsonParser.getValueAsString();
                    return true;
                case "age":
                    bLiveVoiceHourLeaderBoardItemUser.age = jsonParser.getValueAsLong();
                    return true;
                case "uid":
                    bLiveVoiceHourLeaderBoardItemUser.uid = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveVoiceHourLeaderBoardItemUser.name = jsonParser.getValueAsString();
                    return true;
                case "dynamicFrame":
                    bLiveVoiceHourLeaderBoardItemUser.dynamicFrame = jsonParser.getValueAsString();
                    return true;
                case "staticFrame":
                    bLiveVoiceHourLeaderBoardItemUser.staticFrame = jsonParser.getValueAsString();
                    return true;
                case "smallDynamicFrame":
                    bLiveVoiceHourLeaderBoardItemUser.smallDynamicFrame = jsonParser.getValueAsString();
                    return true;
                case "mediumDynamicFrame":
                    bLiveVoiceHourLeaderBoardItemUser.mediumDynamicFrame = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceHourLeaderBoardItemUser.uid;
            if (str != null) {
                jsonGenerator.writeStringField(Oauth2AccessToken.KEY_UID, str);
            }
            String str2 = bLiveVoiceHourLeaderBoardItemUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveVoiceHourLeaderBoardItemUser.gender;
            if (str3 != null) {
                jsonGenerator.writeStringField("gender", str3);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, bLiveVoiceHourLeaderBoardItemUser.age);
            String str4 = bLiveVoiceHourLeaderBoardItemUser.avatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("avatar", str4);
            }
            String str5 = bLiveVoiceHourLeaderBoardItemUser.staticFrame;
            if (str5 != null) {
                jsonGenerator.writeStringField("staticFrame", str5);
            }
            String str6 = bLiveVoiceHourLeaderBoardItemUser.dynamicFrame;
            if (str6 != null) {
                jsonGenerator.writeStringField("dynamicFrame", str6);
            }
            String str7 = bLiveVoiceHourLeaderBoardItemUser.schema;
            if (str7 != null) {
                jsonGenerator.writeStringField("schema", str7);
            }
            jsonGenerator.writeBooleanField(UserLiveLabel.LIVE_ON_CALL_STATE, bLiveVoiceHourLeaderBoardItemUser.onCall);
            String str8 = bLiveVoiceHourLeaderBoardItemUser.smallDynamicFrame;
            if (str8 != null) {
                jsonGenerator.writeStringField("smallDynamicFrame", str8);
            }
            String str9 = bLiveVoiceHourLeaderBoardItemUser.mediumDynamicFrame;
            if (str9 != null) {
                jsonGenerator.writeStringField("mediumDynamicFrame", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceHourLeaderBoardItemUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicehourleaderboarditemuser";

    @ProtobufIndex(index = 4)
    public long age;

    @NonNull
    @ProtobufIndex(index = 5)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 7)
    public String dynamicFrame;

    @NonNull
    @ProtobufIndex(index = 3)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 11)
    public String mediumDynamicFrame;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 9)
    public boolean onCall;

    @NonNull
    @ProtobufIndex(index = 8)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 10)
    public String smallDynamicFrame;

    @NonNull
    @ProtobufIndex(index = 6)
    public String staticFrame;

    @NonNull
    @ProtobufIndex(index = 1)
    public String uid;

    public static BLiveVoiceHourLeaderBoardItemUser new_() {
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser = new BLiveVoiceHourLeaderBoardItemUser();
        bLiveVoiceHourLeaderBoardItemUser.nullCheck();
        return bLiveVoiceHourLeaderBoardItemUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceHourLeaderBoardItemUser mo225055clone() {
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser = new BLiveVoiceHourLeaderBoardItemUser();
        bLiveVoiceHourLeaderBoardItemUser.uid = this.uid;
        bLiveVoiceHourLeaderBoardItemUser.name = this.name;
        bLiveVoiceHourLeaderBoardItemUser.gender = this.gender;
        bLiveVoiceHourLeaderBoardItemUser.age = this.age;
        bLiveVoiceHourLeaderBoardItemUser.avatar = this.avatar;
        bLiveVoiceHourLeaderBoardItemUser.staticFrame = this.staticFrame;
        bLiveVoiceHourLeaderBoardItemUser.dynamicFrame = this.dynamicFrame;
        bLiveVoiceHourLeaderBoardItemUser.schema = this.schema;
        bLiveVoiceHourLeaderBoardItemUser.onCall = this.onCall;
        bLiveVoiceHourLeaderBoardItemUser.smallDynamicFrame = this.smallDynamicFrame;
        bLiveVoiceHourLeaderBoardItemUser.mediumDynamicFrame = this.mediumDynamicFrame;
        return bLiveVoiceHourLeaderBoardItemUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceHourLeaderBoardItemUser)) {
            return false;
        }
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser = (BLiveVoiceHourLeaderBoardItemUser) obj;
        return ValueObject.util_equals(this.uid, bLiveVoiceHourLeaderBoardItemUser.uid) && ValueObject.util_equals(this.name, bLiveVoiceHourLeaderBoardItemUser.name) && ValueObject.util_equals(this.gender, bLiveVoiceHourLeaderBoardItemUser.gender) && this.age == bLiveVoiceHourLeaderBoardItemUser.age && ValueObject.util_equals(this.avatar, bLiveVoiceHourLeaderBoardItemUser.avatar) && ValueObject.util_equals(this.staticFrame, bLiveVoiceHourLeaderBoardItemUser.staticFrame) && ValueObject.util_equals(this.dynamicFrame, bLiveVoiceHourLeaderBoardItemUser.dynamicFrame) && ValueObject.util_equals(this.schema, bLiveVoiceHourLeaderBoardItemUser.schema) && this.onCall == bLiveVoiceHourLeaderBoardItemUser.onCall && ValueObject.util_equals(this.smallDynamicFrame, bLiveVoiceHourLeaderBoardItemUser.smallDynamicFrame) && ValueObject.util_equals(this.mediumDynamicFrame, bLiveVoiceHourLeaderBoardItemUser.mediumDynamicFrame);
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
        String str = this.uid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.gender;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.age;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.avatar;
        int iHashCode4 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.staticFrame;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.dynamicFrame;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.schema;
        int iHashCode7 = (((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.onCall ? 1231 : 1237)) * 41;
        String str8 = this.smallDynamicFrame;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.mediumDynamicFrame;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.uid == null) {
            this.uid = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.staticFrame == null) {
            this.staticFrame = "";
        }
        if (this.dynamicFrame == null) {
            this.dynamicFrame = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.smallDynamicFrame == null) {
            this.smallDynamicFrame = "";
        }
        if (this.mediumDynamicFrame == null) {
            this.mediumDynamicFrame = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
