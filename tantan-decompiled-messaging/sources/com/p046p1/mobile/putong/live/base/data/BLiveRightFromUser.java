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
public class BLiveRightFromUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRightFromUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRightFromUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRightFromUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRightFromUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRightFromUser newInstance() {
            return new BLiveRightFromUser();
        }

        public boolean parseField(BLiveRightFromUser bLiveRightFromUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveRightFromUser.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveRightFromUser.userName = jsonParser.getValueAsString();
                    return true;
                case "userImage":
                    bLiveRightFromUser.userImage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRightFromUser bLiveRightFromUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRightFromUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveRightFromUser.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveRightFromUser.userImage;
            if (str3 != null) {
                jsonGenerator.writeStringField("userImage", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRightFromUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverightfromuser";
    public long createTimeInSeconds;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userImage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveRightFromUser new_() {
        BLiveRightFromUser bLiveRightFromUser = new BLiveRightFromUser();
        bLiveRightFromUser.nullCheck();
        return bLiveRightFromUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRightFromUser mo223809clone() {
        BLiveRightFromUser bLiveRightFromUser = new BLiveRightFromUser();
        bLiveRightFromUser.userId = this.userId;
        bLiveRightFromUser.userName = this.userName;
        bLiveRightFromUser.userImage = this.userImage;
        return bLiveRightFromUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRightFromUser)) {
            return false;
        }
        BLiveRightFromUser bLiveRightFromUser = (BLiveRightFromUser) obj;
        return ValueObject.util_equals(this.userId, bLiveRightFromUser.userId) && ValueObject.util_equals(this.userName, bLiveRightFromUser.userName) && ValueObject.util_equals(this.userImage, bLiveRightFromUser.userImage);
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
        String str3 = this.userImage;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
