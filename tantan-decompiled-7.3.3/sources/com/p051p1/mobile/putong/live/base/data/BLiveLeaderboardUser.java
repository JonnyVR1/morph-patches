package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveLeaderboardUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLeaderboardUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLeaderboardUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLeaderboardUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLeaderboardUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLeaderboardUser newInstance() {
            return new BLiveLeaderboardUser();
        }

        public boolean parseField(BLiveLeaderboardUser bLiveLeaderboardUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    bLiveLeaderboardUser.gender = jsonParser.getValueAsString();
                    return true;
                case "imageUrl":
                    bLiveLeaderboardUser.imageUrl = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveLeaderboardUser.userId = jsonParser.getValueAsString();
                    return true;
                case "age":
                    bLiveLeaderboardUser.age = jsonParser.getValueAsInt();
                    return true;
                case "name":
                    bLiveLeaderboardUser.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLeaderboardUser bLiveLeaderboardUser, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, bLiveLeaderboardUser.age);
            String str = bLiveLeaderboardUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveLeaderboardUser.imageUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("imageUrl", str2);
            }
            String str3 = bLiveLeaderboardUser.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = bLiveLeaderboardUser.gender;
            if (str4 != null) {
                jsonGenerator.writeStringField("gender", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLeaderboardUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveleaderboarduser";

    @ProtobufIndex(index = 1)
    public int age;

    @NonNull
    @ProtobufIndex(index = 5)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 3)
    public String imageUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveLeaderboardUser new_() {
        BLiveLeaderboardUser bLiveLeaderboardUser = new BLiveLeaderboardUser();
        bLiveLeaderboardUser.nullCheck();
        return bLiveLeaderboardUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLeaderboardUser mo225055clone() {
        BLiveLeaderboardUser bLiveLeaderboardUser = new BLiveLeaderboardUser();
        bLiveLeaderboardUser.age = this.age;
        bLiveLeaderboardUser.userId = this.userId;
        bLiveLeaderboardUser.imageUrl = this.imageUrl;
        bLiveLeaderboardUser.name = this.name;
        bLiveLeaderboardUser.gender = this.gender;
        return bLiveLeaderboardUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLeaderboardUser)) {
            return false;
        }
        BLiveLeaderboardUser bLiveLeaderboardUser = (BLiveLeaderboardUser) obj;
        return this.age == bLiveLeaderboardUser.age && ValueObject.util_equals(this.userId, bLiveLeaderboardUser.userId) && ValueObject.util_equals(this.imageUrl, bLiveLeaderboardUser.imageUrl) && ValueObject.util_equals(this.name, bLiveLeaderboardUser.name) && ValueObject.util_equals(this.gender, bLiveLeaderboardUser.gender);
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
        int i2 = ((i * 41) + this.age) * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.gender;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.imageUrl == null) {
            this.imageUrl = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
