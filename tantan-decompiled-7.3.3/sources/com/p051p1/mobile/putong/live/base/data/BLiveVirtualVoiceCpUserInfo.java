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
public class BLiveVirtualVoiceCpUserInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVirtualVoiceCpUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVirtualVoiceCpUserInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVirtualVoiceCpUserInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVirtualVoiceCpUserInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVirtualVoiceCpUserInfo newInstance() {
            return new BLiveVirtualVoiceCpUserInfo();
        }

        public boolean parseField(BLiveVirtualVoiceCpUserInfo bLiveVirtualVoiceCpUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveVirtualVoiceCpUserInfo.avatar = jsonParser.getValueAsString();
                    return true;
                case "gender":
                    bLiveVirtualVoiceCpUserInfo.gender = jsonParser.getValueAsString();
                    return true;
                case "avatarFrameStaticUrl":
                    bLiveVirtualVoiceCpUserInfo.avatarFrameStaticUrl = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVirtualVoiceCpUserInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveVirtualVoiceCpUserInfo.userName = jsonParser.getValueAsString();
                    return true;
                case "age":
                    bLiveVirtualVoiceCpUserInfo.age = jsonParser.getValueAsInt();
                    return true;
                case "avatarFrameDynamicUrl":
                    bLiveVirtualVoiceCpUserInfo.avatarFrameDynamicUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVirtualVoiceCpUserInfo bLiveVirtualVoiceCpUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVirtualVoiceCpUserInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVirtualVoiceCpUserInfo.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, bLiveVirtualVoiceCpUserInfo.age);
            String str3 = bLiveVirtualVoiceCpUserInfo.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            String str4 = bLiveVirtualVoiceCpUserInfo.gender;
            if (str4 != null) {
                jsonGenerator.writeStringField("gender", str4);
            }
            String str5 = bLiveVirtualVoiceCpUserInfo.avatarFrameStaticUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("avatarFrameStaticUrl", str5);
            }
            String str6 = bLiveVirtualVoiceCpUserInfo.avatarFrameDynamicUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("avatarFrameDynamicUrl", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVirtualVoiceCpUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevirtualvoicecpuserinfo";

    @ProtobufIndex(index = 3)
    public int age;

    @NonNull
    @ProtobufIndex(index = 4)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 7)
    public String avatarFrameDynamicUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String avatarFrameStaticUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveVirtualVoiceCpUserInfo new_() {
        BLiveVirtualVoiceCpUserInfo bLiveVirtualVoiceCpUserInfo = new BLiveVirtualVoiceCpUserInfo();
        bLiveVirtualVoiceCpUserInfo.nullCheck();
        return bLiveVirtualVoiceCpUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVirtualVoiceCpUserInfo mo225055clone() {
        BLiveVirtualVoiceCpUserInfo bLiveVirtualVoiceCpUserInfo = new BLiveVirtualVoiceCpUserInfo();
        bLiveVirtualVoiceCpUserInfo.userId = this.userId;
        bLiveVirtualVoiceCpUserInfo.userName = this.userName;
        bLiveVirtualVoiceCpUserInfo.age = this.age;
        bLiveVirtualVoiceCpUserInfo.avatar = this.avatar;
        bLiveVirtualVoiceCpUserInfo.gender = this.gender;
        bLiveVirtualVoiceCpUserInfo.avatarFrameStaticUrl = this.avatarFrameStaticUrl;
        bLiveVirtualVoiceCpUserInfo.avatarFrameDynamicUrl = this.avatarFrameDynamicUrl;
        return bLiveVirtualVoiceCpUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVirtualVoiceCpUserInfo)) {
            return false;
        }
        BLiveVirtualVoiceCpUserInfo bLiveVirtualVoiceCpUserInfo = (BLiveVirtualVoiceCpUserInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveVirtualVoiceCpUserInfo.userId) && ValueObject.util_equals(this.userName, bLiveVirtualVoiceCpUserInfo.userName) && this.age == bLiveVirtualVoiceCpUserInfo.age && ValueObject.util_equals(this.avatar, bLiveVirtualVoiceCpUserInfo.avatar) && ValueObject.util_equals(this.gender, bLiveVirtualVoiceCpUserInfo.gender) && ValueObject.util_equals(this.avatarFrameStaticUrl, bLiveVirtualVoiceCpUserInfo.avatarFrameStaticUrl) && ValueObject.util_equals(this.avatarFrameDynamicUrl, bLiveVirtualVoiceCpUserInfo.avatarFrameDynamicUrl);
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
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.gender;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.avatarFrameStaticUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.avatarFrameDynamicUrl;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
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
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.avatarFrameStaticUrl == null) {
            this.avatarFrameStaticUrl = "";
        }
        if (this.avatarFrameDynamicUrl == null) {
            this.avatarFrameDynamicUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
