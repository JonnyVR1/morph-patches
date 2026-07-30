package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveVideoChatUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatUser newInstance() {
            return new BLiveVideoChatUser();
        }

        public boolean parseField(BLiveVideoChatUser bLiveVideoChatUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveVideoChatUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVideoChatUser.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveVideoChatUser.userName = jsonParser.getValueAsString();
                    return true;
                case "role":
                    bLiveVideoChatUser.role = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatUser bLiveVideoChatUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVideoChatUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVideoChatUser.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveVideoChatUser.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            String str4 = bLiveVideoChatUser.role;
            if (str4 != null) {
                jsonGenerator.writeStringField("role", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatuser";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String role;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveVideoChatUser new_() {
        BLiveVideoChatUser bLiveVideoChatUser = new BLiveVideoChatUser();
        bLiveVideoChatUser.nullCheck();
        return bLiveVideoChatUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatUser mo223809clone() {
        BLiveVideoChatUser bLiveVideoChatUser = new BLiveVideoChatUser();
        bLiveVideoChatUser.userId = this.userId;
        bLiveVideoChatUser.userName = this.userName;
        bLiveVideoChatUser.avatar = this.avatar;
        bLiveVideoChatUser.role = this.role;
        return bLiveVideoChatUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatUser)) {
            return false;
        }
        BLiveVideoChatUser bLiveVideoChatUser = (BLiveVideoChatUser) obj;
        return ValueObject.util_equals(this.userId, bLiveVideoChatUser.userId) && ValueObject.util_equals(this.userName, bLiveVideoChatUser.userName) && ValueObject.util_equals(this.avatar, bLiveVideoChatUser.avatar) && ValueObject.util_equals(this.role, bLiveVideoChatUser.role);
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
        String str4 = this.role;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
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
        if (this.role == null) {
            this.role = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
