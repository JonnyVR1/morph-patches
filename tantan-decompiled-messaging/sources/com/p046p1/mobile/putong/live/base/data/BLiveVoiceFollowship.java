package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceFollowship extends ValueObject implements Cloneable, Serializable {
    public static String FOLLOWED = "followed";
    public static String FOLLOWING = "following";
    public static JsonAdapter<BLiveVoiceFollowship> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceFollowship>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceFollowship.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceFollowship.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceFollowship newInstance() {
            return new BLiveVoiceFollowship();
        }

        public boolean parseField(BLiveVoiceFollowship bLiveVoiceFollowship, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    bLiveVoiceFollowship.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceFollowship.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceFollowship.f44496id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveVoiceFollowship.type = jsonParser.getValueAsString();
                    return true;
                case "state":
                    bLiveVoiceFollowship.state = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceFollowship bLiveVoiceFollowship, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceFollowship.f44496id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceFollowship.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveVoiceFollowship.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = bLiveVoiceFollowship.otherUserId;
            if (str4 != null) {
                jsonGenerator.writeStringField("otherUserId", str4);
            }
            String str5 = bLiveVoiceFollowship.state;
            if (str5 != null) {
                jsonGenerator.writeStringField("state", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceFollowship) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static String MUTUALFOLLOWING = "mutualFollowing";
    public static final String TYPE = "blivevoicefollowship";
    public static String UNFOLLOW = "unfollow";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44496id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String state;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    public static Followship convert(BLiveVoiceFollowship bLiveVoiceFollowship) {
        if (bLiveVoiceFollowship == null) {
            return Followship.EMPTY;
        }
        Followship followshipNew_ = Followship.new_();
        followshipNew_.owner = bLiveVoiceFollowship.userId;
        followshipNew_.otherUser = bLiveVoiceFollowship.otherUserId;
        followshipNew_.f38756id = bLiveVoiceFollowship.f44496id;
        if (FOLLOWING.equals(bLiveVoiceFollowship.state)) {
            followshipNew_.state = FollowshipStatus.get(FollowshipStatus.following);
            return followshipNew_;
        }
        if (FOLLOWED.equals(bLiveVoiceFollowship.state)) {
            followshipNew_.state = FollowshipStatus.get(FollowshipStatus.followed);
            return followshipNew_;
        }
        if (MUTUALFOLLOWING.equals(bLiveVoiceFollowship.state)) {
            followshipNew_.state = FollowshipStatus.get("matched");
            return followshipNew_;
        }
        followshipNew_.state = FollowshipStatus.get(FollowshipStatus.unfollow);
        return followshipNew_;
    }

    public static boolean isFollow(BLiveVoiceFollowship bLiveVoiceFollowship) {
        if (bLiveVoiceFollowship != null) {
            return FOLLOWING.equals(bLiveVoiceFollowship.state) || MUTUALFOLLOWING.equals(bLiveVoiceFollowship.state);
        }
        return false;
    }

    public static BLiveVoiceFollowship new_() {
        BLiveVoiceFollowship bLiveVoiceFollowship = new BLiveVoiceFollowship();
        bLiveVoiceFollowship.nullCheck();
        return bLiveVoiceFollowship;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceFollowship mo223809clone() {
        BLiveVoiceFollowship bLiveVoiceFollowship = new BLiveVoiceFollowship();
        bLiveVoiceFollowship.f44496id = this.f44496id;
        bLiveVoiceFollowship.type = this.type;
        bLiveVoiceFollowship.userId = this.userId;
        bLiveVoiceFollowship.otherUserId = this.otherUserId;
        bLiveVoiceFollowship.state = this.state;
        return bLiveVoiceFollowship;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceFollowship)) {
            return false;
        }
        BLiveVoiceFollowship bLiveVoiceFollowship = (BLiveVoiceFollowship) obj;
        return ValueObject.util_equals(this.f44496id, bLiveVoiceFollowship.f44496id) && ValueObject.util_equals(this.type, bLiveVoiceFollowship.type) && ValueObject.util_equals(this.userId, bLiveVoiceFollowship.userId) && ValueObject.util_equals(this.otherUserId, bLiveVoiceFollowship.otherUserId) && ValueObject.util_equals(this.state, bLiveVoiceFollowship.state);
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
        String str = this.f44496id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.otherUserId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.state;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44496id == null) {
            this.f44496id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.state == null) {
            this.state = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
