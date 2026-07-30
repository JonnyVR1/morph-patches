package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveAnchors extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAnchors> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchors>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAnchors.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAnchors.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAnchors newInstance() {
            return new BLiveAnchors();
        }

        public boolean parseField(BLiveAnchors bLiveAnchors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveAnchors.avatar = BAvatar.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "roomId":
                    bLiveAnchors.roomId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveAnchors.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveAnchors.userName = jsonParser.getValueAsString();
                    return true;
                case "onGoingLiveId":
                    bLiveAnchors.onGoingLiveId = jsonParser.getValueAsString();
                    return true;
                case "followerCount":
                    bLiveAnchors.followerCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAnchors bLiveAnchors, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAnchors.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveAnchors.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveAnchors.onGoingLiveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("onGoingLiveId", str3);
            }
            String str4 = bLiveAnchors.roomId;
            if (str4 != null) {
                jsonGenerator.writeStringField("roomId", str4);
            }
            if (bLiveAnchors.avatar != null) {
                jsonGenerator.writeFieldName("avatar");
                BAvatar.JSON_ADAPTER.serialize(bLiveAnchors.avatar, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("followerCount", bLiveAnchors.followerCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveanchors";

    @NonNull
    @ProtobufIndex(index = 5)
    public BAvatar avatar;

    @ProtobufIndex(index = 6)
    public int followerCount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String onGoingLiveId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveAnchors new_() {
        BLiveAnchors bLiveAnchors = new BLiveAnchors();
        bLiveAnchors.nullCheck();
        return bLiveAnchors;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAnchors mo225055clone() {
        BLiveAnchors bLiveAnchors = new BLiveAnchors();
        bLiveAnchors.userId = this.userId;
        bLiveAnchors.userName = this.userName;
        bLiveAnchors.onGoingLiveId = this.onGoingLiveId;
        bLiveAnchors.roomId = this.roomId;
        BAvatar bAvatar = this.avatar;
        if (bAvatar != null) {
            bLiveAnchors.avatar = bAvatar.mo225055clone();
        }
        bLiveAnchors.followerCount = this.followerCount;
        return bLiveAnchors;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAnchors)) {
            return false;
        }
        BLiveAnchors bLiveAnchors = (BLiveAnchors) obj;
        return ValueObject.util_equals(this.userId, bLiveAnchors.userId) && ValueObject.util_equals(this.userName, bLiveAnchors.userName) && ValueObject.util_equals(this.onGoingLiveId, bLiveAnchors.onGoingLiveId) && ValueObject.util_equals(this.roomId, bLiveAnchors.roomId) && ValueObject.util_equals(this.avatar, bLiveAnchors.avatar) && this.followerCount == bLiveAnchors.followerCount;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "bliveanchors";
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
        String str3 = this.onGoingLiveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.roomId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BAvatar bAvatar = this.avatar;
        int iHashCode5 = ((iHashCode4 + (bAvatar != null ? bAvatar.hashCode() : 0)) * 41) + this.followerCount;
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.onGoingLiveId == null) {
            this.onGoingLiveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.avatar == null) {
            this.avatar = BAvatar.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
