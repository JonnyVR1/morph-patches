package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionUserInfo;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAuctionUserInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionUserInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionUserInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionUserInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionUserInfo newInstance() {
            return new BLiveAuctionUserInfo();
        }

        public boolean parseField(BLiveAuctionUserInfo bLiveAuctionUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveAuctionUserInfo.avatar = jsonParser.getValueAsString();
                    return true;
                case "gender":
                    bLiveAuctionUserInfo.gender = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveAuctionUserInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "tagImage":
                    bLiveAuctionUserInfo.tagImage = jsonParser.getValueAsString();
                    return true;
                case "profilePictures":
                    bLiveAuctionUserInfo.profilePictures = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "userName":
                    bLiveAuctionUserInfo.userName = jsonParser.getValueAsString();
                    return true;
                case "age":
                    bLiveAuctionUserInfo.age = jsonParser.getValueAsInt();
                    return true;
                case "avatarFrame":
                    bLiveAuctionUserInfo.avatarFrame = BLiveVoiceMedalWallItemHeaderUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "curLevel":
                    bLiveAuctionUserInfo.curLevel = jsonParser.getValueAsInt();
                    return true;
                case "curWorth":
                    bLiveAuctionUserInfo.curWorth = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionUserInfo bLiveAuctionUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAuctionUserInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveAuctionUserInfo.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, bLiveAuctionUserInfo.age);
            String str3 = bLiveAuctionUserInfo.gender;
            if (str3 != null) {
                jsonGenerator.writeStringField("gender", str3);
            }
            String str4 = bLiveAuctionUserInfo.avatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("avatar", str4);
            }
            if (bLiveAuctionUserInfo.avatarFrame != null) {
                jsonGenerator.writeFieldName("avatarFrame");
                BLiveVoiceMedalWallItemHeaderUrl.JSON_ADAPTER.serialize(bLiveAuctionUserInfo.avatarFrame, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("curWorth", bLiveAuctionUserInfo.curWorth);
            jsonGenerator.writeNumberField("curLevel", bLiveAuctionUserInfo.curLevel);
            if (bLiveAuctionUserInfo.profilePictures != null) {
                jsonGenerator.writeFieldName("profilePictures");
                JsonAdapter.serializeArray(bLiveAuctionUserInfo.profilePictures, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = bLiveAuctionUserInfo.tagImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("tagImage", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctionuserinfo";

    @ProtobufIndex(index = 3)
    public int age;

    @NonNull
    @ProtobufIndex(index = 5)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveVoiceMedalWallItemHeaderUrl avatarFrame;

    @ProtobufIndex(index = 8)
    public int curLevel;

    @ProtobufIndex(index = 7)
    public long curWorth;

    @NonNull
    @ProtobufIndex(index = 4)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<String> profilePictures;

    @NonNull
    @ProtobufIndex(index = 10)
    public String tagImage;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68866a(String str) {
        return str;
    }

    public static BLiveAuctionUserInfo new_() {
        BLiveAuctionUserInfo bLiveAuctionUserInfo = new BLiveAuctionUserInfo();
        bLiveAuctionUserInfo.nullCheck();
        return bLiveAuctionUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionUserInfo mo225055clone() {
        BLiveAuctionUserInfo bLiveAuctionUserInfo = new BLiveAuctionUserInfo();
        bLiveAuctionUserInfo.userId = this.userId;
        bLiveAuctionUserInfo.userName = this.userName;
        bLiveAuctionUserInfo.age = this.age;
        bLiveAuctionUserInfo.gender = this.gender;
        bLiveAuctionUserInfo.avatar = this.avatar;
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = this.avatarFrame;
        if (bLiveVoiceMedalWallItemHeaderUrl != null) {
            bLiveAuctionUserInfo.avatarFrame = bLiveVoiceMedalWallItemHeaderUrl.mo225055clone();
        }
        bLiveAuctionUserInfo.curWorth = this.curWorth;
        bLiveAuctionUserInfo.curLevel = this.curLevel;
        List<String> list = this.profilePictures;
        if (list != null) {
            bLiveAuctionUserInfo.profilePictures = ValueObject.util_map(list, new qcj() { // from class: l.rr1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveAuctionUserInfo.m68866a((String) obj);
                }
            });
        }
        bLiveAuctionUserInfo.tagImage = this.tagImage;
        return bLiveAuctionUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionUserInfo)) {
            return false;
        }
        BLiveAuctionUserInfo bLiveAuctionUserInfo = (BLiveAuctionUserInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveAuctionUserInfo.userId) && ValueObject.util_equals(this.userName, bLiveAuctionUserInfo.userName) && this.age == bLiveAuctionUserInfo.age && ValueObject.util_equals(this.gender, bLiveAuctionUserInfo.gender) && ValueObject.util_equals(this.avatar, bLiveAuctionUserInfo.avatar) && ValueObject.util_equals(this.avatarFrame, bLiveAuctionUserInfo.avatarFrame) && this.curWorth == bLiveAuctionUserInfo.curWorth && this.curLevel == bLiveAuctionUserInfo.curLevel && ValueObject.util_equals(this.profilePictures, bLiveAuctionUserInfo.profilePictures) && ValueObject.util_equals(this.tagImage, bLiveAuctionUserInfo.tagImage);
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
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.age) * 41;
        String str3 = this.gender;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.avatar;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = this.avatarFrame;
        int iHashCode5 = bLiveVoiceMedalWallItemHeaderUrl != null ? bLiveVoiceMedalWallItemHeaderUrl.hashCode() : 0;
        long j = this.curWorth;
        int i3 = (((((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.curLevel) * 41;
        List<String> list = this.profilePictures;
        int iHashCode6 = (i3 + (list != null ? list.hashCode() : 0)) * 41;
        String str5 = this.tagImage;
        int iHashCode7 = iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.avatarFrame == null) {
            this.avatarFrame = BLiveVoiceMedalWallItemHeaderUrl.new_();
        }
        if (this.profilePictures == null) {
            this.profilePictures = new ArrayList();
        }
        if (this.tagImage == null) {
            this.tagImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
