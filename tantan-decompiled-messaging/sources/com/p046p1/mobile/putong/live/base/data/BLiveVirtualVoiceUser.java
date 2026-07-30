package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.UserLiveLabel;
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
public class BLiveVirtualVoiceUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVirtualVoiceUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVirtualVoiceUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVirtualVoiceUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVirtualVoiceUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVirtualVoiceUser newInstance() {
            return new BLiveVirtualVoiceUser();
        }

        public boolean parseField(BLiveVirtualVoiceUser bLiveVirtualVoiceUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "constellation":
                    bLiveVirtualVoiceUser.constellation = jsonParser.getValueAsString();
                    return true;
                case "profilePicture":
                    bLiveVirtualVoiceUser.profilePicture = jsonParser.getValueAsString();
                    return true;
                case "onCall":
                    bLiveVirtualVoiceUser.onCall = jsonParser.getValueAsBoolean();
                    return true;
                case "verificationStatus":
                    bLiveVirtualVoiceUser.verificationStatus = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveVirtualVoiceUser.f44481id = jsonParser.getValueAsString();
                    return false;
                case "age":
                    bLiveVirtualVoiceUser.age = jsonParser.getValueAsInt();
                    return true;
                case "city":
                    bLiveVirtualVoiceUser.city = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveVirtualVoiceUser.name = jsonParser.getValueAsString();
                    return true;
                case "distance":
                    bLiveVirtualVoiceUser.distance = jsonParser.getValueAsString();
                    return true;
                case "verificationStatusPicture":
                    bLiveVirtualVoiceUser.verificationStatusPicture = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVirtualVoiceUser bLiveVirtualVoiceUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVirtualVoiceUser.f44481id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVirtualVoiceUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveVirtualVoiceUser.profilePicture;
            if (str3 != null) {
                jsonGenerator.writeStringField("profilePicture", str3);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, bLiveVirtualVoiceUser.age);
            String str4 = bLiveVirtualVoiceUser.constellation;
            if (str4 != null) {
                jsonGenerator.writeStringField("constellation", str4);
            }
            String str5 = bLiveVirtualVoiceUser.city;
            if (str5 != null) {
                jsonGenerator.writeStringField(RankLevel.city, str5);
            }
            String str6 = bLiveVirtualVoiceUser.distance;
            if (str6 != null) {
                jsonGenerator.writeStringField("distance", str6);
            }
            jsonGenerator.writeBooleanField("verificationStatus", bLiveVirtualVoiceUser.verificationStatus);
            jsonGenerator.writeBooleanField("verificationStatusPicture", bLiveVirtualVoiceUser.verificationStatusPicture);
            jsonGenerator.writeBooleanField(UserLiveLabel.LIVE_ON_CALL_STATE, bLiveVirtualVoiceUser.onCall);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVirtualVoiceUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevirtualvoiceuser";

    @ProtobufIndex(index = 4)
    public int age;

    @NonNull
    @ProtobufIndex(index = 6)
    public String city;

    @NonNull
    @ProtobufIndex(index = 5)
    public String constellation;

    @NonNull
    @ProtobufIndex(index = 7)
    public String distance;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44481id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 9)
    public boolean onCall;

    @NonNull
    @ProtobufIndex(index = 3)
    public String profilePicture;

    @ProtobufIndex(index = 8)
    public boolean verificationStatus;

    @ProtobufIndex(index = 10)
    public boolean verificationStatusPicture;

    public static BLiveVirtualVoiceUser new_() {
        BLiveVirtualVoiceUser bLiveVirtualVoiceUser = new BLiveVirtualVoiceUser();
        bLiveVirtualVoiceUser.nullCheck();
        return bLiveVirtualVoiceUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVirtualVoiceUser mo223809clone() {
        BLiveVirtualVoiceUser bLiveVirtualVoiceUser = new BLiveVirtualVoiceUser();
        bLiveVirtualVoiceUser.f44481id = this.f44481id;
        bLiveVirtualVoiceUser.name = this.name;
        bLiveVirtualVoiceUser.profilePicture = this.profilePicture;
        bLiveVirtualVoiceUser.age = this.age;
        bLiveVirtualVoiceUser.constellation = this.constellation;
        bLiveVirtualVoiceUser.city = this.city;
        bLiveVirtualVoiceUser.distance = this.distance;
        bLiveVirtualVoiceUser.verificationStatus = this.verificationStatus;
        bLiveVirtualVoiceUser.verificationStatusPicture = this.verificationStatusPicture;
        bLiveVirtualVoiceUser.onCall = this.onCall;
        return bLiveVirtualVoiceUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVirtualVoiceUser)) {
            return false;
        }
        BLiveVirtualVoiceUser bLiveVirtualVoiceUser = (BLiveVirtualVoiceUser) obj;
        return ValueObject.util_equals(this.f44481id, bLiveVirtualVoiceUser.f44481id) && ValueObject.util_equals(this.name, bLiveVirtualVoiceUser.name) && ValueObject.util_equals(this.profilePicture, bLiveVirtualVoiceUser.profilePicture) && this.age == bLiveVirtualVoiceUser.age && ValueObject.util_equals(this.constellation, bLiveVirtualVoiceUser.constellation) && ValueObject.util_equals(this.city, bLiveVirtualVoiceUser.city) && ValueObject.util_equals(this.distance, bLiveVirtualVoiceUser.distance) && this.verificationStatus == bLiveVirtualVoiceUser.verificationStatus && this.verificationStatusPicture == bLiveVirtualVoiceUser.verificationStatusPicture && this.onCall == bLiveVirtualVoiceUser.onCall;
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
        String str = this.f44481id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.profilePicture;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.age) * 41;
        String str4 = this.constellation;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.city;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.distance;
        int iHashCode6 = ((((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.verificationStatus ? 1231 : 1237)) * 41) + (this.verificationStatusPicture ? 1231 : 1237)) * 41) + (this.onCall ? 1231 : 1237);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44481id == null) {
            this.f44481id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.profilePicture == null) {
            this.profilePicture = "";
        }
        if (this.constellation == null) {
            this.constellation = "";
        }
        if (this.city == null) {
            this.city = "";
        }
        if (this.distance == null) {
            this.distance = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
