package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveNewGiftWallUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallUser newInstance() {
            return new BLiveNewGiftWallUser();
        }

        public boolean parseField(BLiveNewGiftWallUser bLiveNewGiftWallUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveNewGiftWallUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveNewGiftWallUser.f45264id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveNewGiftWallUser.name = jsonParser.getValueAsString();
                    return true;
                case "fakeType":
                    bLiveNewGiftWallUser.fakeType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallUser bLiveNewGiftWallUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallUser.f45264id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveNewGiftWallUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveNewGiftWallUser.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            String str4 = bLiveNewGiftWallUser.fakeType;
            if (str4 != null) {
                jsonGenerator.writeStringField("fakeType", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwalluser";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String fakeType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45264id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    public static BLiveNewGiftWallUser new_() {
        BLiveNewGiftWallUser bLiveNewGiftWallUser = new BLiveNewGiftWallUser();
        bLiveNewGiftWallUser.nullCheck();
        return bLiveNewGiftWallUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallUser mo225055clone() {
        BLiveNewGiftWallUser bLiveNewGiftWallUser = new BLiveNewGiftWallUser();
        bLiveNewGiftWallUser.f45264id = this.f45264id;
        bLiveNewGiftWallUser.name = this.name;
        bLiveNewGiftWallUser.avatar = this.avatar;
        bLiveNewGiftWallUser.fakeType = this.fakeType;
        return bLiveNewGiftWallUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallUser)) {
            return false;
        }
        BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) obj;
        return ValueObject.util_equals(this.f45264id, bLiveNewGiftWallUser.f45264id) && ValueObject.util_equals(this.name, bLiveNewGiftWallUser.name) && ValueObject.util_equals(this.avatar, bLiveNewGiftWallUser.avatar) && ValueObject.util_equals(this.fakeType, bLiveNewGiftWallUser.fakeType);
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
        String str = this.f45264id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.fakeType;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45264id == null) {
            this.f45264id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.fakeType == null) {
            this.fakeType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
