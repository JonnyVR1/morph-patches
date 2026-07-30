package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveVoiceSweetCpRecommendUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSweetCpRecommendUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSweetCpRecommendUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSweetCpRecommendUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSweetCpRecommendUser newInstance() {
            return new BLiveVoiceSweetCpRecommendUser();
        }

        public boolean parseField(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    bLiveVoiceSweetCpRecommendUser.gender = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceSweetCpRecommendUser.userId = jsonParser.getValueAsString();
                    return true;
                case "age":
                    bLiveVoiceSweetCpRecommendUser.age = jsonParser.getValueAsInt();
                    return true;
                case "nickName":
                    bLiveVoiceSweetCpRecommendUser.nickName = jsonParser.getValueAsString();
                    return true;
                case "wealthHierarchy":
                    bLiveVoiceSweetCpRecommendUser.wealthHierarchy = BLiveVoiceWealthHierarchy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userAvatar":
                    bLiveVoiceSweetCpRecommendUser.userAvatar = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceSweetCpRecommendUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVoiceSweetCpRecommendUser.nickName;
            if (str2 != null) {
                jsonGenerator.writeStringField("nickName", str2);
            }
            String str3 = bLiveVoiceSweetCpRecommendUser.gender;
            if (str3 != null) {
                jsonGenerator.writeStringField("gender", str3);
            }
            if (bLiveVoiceSweetCpRecommendUser.wealthHierarchy != null) {
                jsonGenerator.writeFieldName("wealthHierarchy");
                BLiveVoiceWealthHierarchy.JSON_ADAPTER.serialize(bLiveVoiceSweetCpRecommendUser.wealthHierarchy, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, bLiveVoiceSweetCpRecommendUser.age);
            String str4 = bLiveVoiceSweetCpRecommendUser.userAvatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("userAvatar", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSweetCpRecommendUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesweetcprecommenduser";

    @ProtobufIndex(index = 5)
    public int age;

    @NonNull
    @ProtobufIndex(index = 3)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 2)
    public String nickName;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveVoiceWealthHierarchy wealthHierarchy;

    public static BLiveVoiceSweetCpRecommendUser new_() {
        BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser = new BLiveVoiceSweetCpRecommendUser();
        bLiveVoiceSweetCpRecommendUser.nullCheck();
        return bLiveVoiceSweetCpRecommendUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSweetCpRecommendUser mo225055clone() {
        BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser = new BLiveVoiceSweetCpRecommendUser();
        bLiveVoiceSweetCpRecommendUser.userId = this.userId;
        bLiveVoiceSweetCpRecommendUser.nickName = this.nickName;
        bLiveVoiceSweetCpRecommendUser.gender = this.gender;
        BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy = this.wealthHierarchy;
        if (bLiveVoiceWealthHierarchy != null) {
            bLiveVoiceSweetCpRecommendUser.wealthHierarchy = bLiveVoiceWealthHierarchy.mo225055clone();
        }
        bLiveVoiceSweetCpRecommendUser.age = this.age;
        bLiveVoiceSweetCpRecommendUser.userAvatar = this.userAvatar;
        return bLiveVoiceSweetCpRecommendUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSweetCpRecommendUser)) {
            return false;
        }
        BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser = (BLiveVoiceSweetCpRecommendUser) obj;
        return ValueObject.util_equals(this.userId, bLiveVoiceSweetCpRecommendUser.userId) && ValueObject.util_equals(this.nickName, bLiveVoiceSweetCpRecommendUser.nickName) && ValueObject.util_equals(this.gender, bLiveVoiceSweetCpRecommendUser.gender) && ValueObject.util_equals(this.wealthHierarchy, bLiveVoiceSweetCpRecommendUser.wealthHierarchy) && this.age == bLiveVoiceSweetCpRecommendUser.age && ValueObject.util_equals(this.userAvatar, bLiveVoiceSweetCpRecommendUser.userAvatar);
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
        String str2 = this.nickName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.gender;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy = this.wealthHierarchy;
        int iHashCode4 = (((iHashCode3 + (bLiveVoiceWealthHierarchy != null ? bLiveVoiceWealthHierarchy.hashCode() : 0)) * 41) + this.age) * 41;
        String str4 = this.userAvatar;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.nickName == null) {
            this.nickName = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.wealthHierarchy == null) {
            this.wealthHierarchy = BLiveVoiceWealthHierarchy.new_();
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
