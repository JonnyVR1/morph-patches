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
public class BLiveBlackListItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBlackListItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBlackListItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBlackListItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBlackListItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBlackListItem newInstance() {
            return new BLiveBlackListItem();
        }

        public boolean parseField(BLiveBlackListItem bLiveBlackListItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roomId":
                    bLiveBlackListItem.roomId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveBlackListItem.userId = jsonParser.getValueAsString();
                    return true;
                case "avatarUrl":
                    bLiveBlackListItem.avatarUrl = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveBlackListItem.userName = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveBlackListItem.f44338id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBlackListItem bLiveBlackListItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBlackListItem.f44338id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveBlackListItem.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveBlackListItem.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = bLiveBlackListItem.userName;
            if (str4 != null) {
                jsonGenerator.writeStringField("userName", str4);
            }
            String str5 = bLiveBlackListItem.avatarUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("avatarUrl", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBlackListItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveblacklistitem";

    @NonNull
    @ProtobufIndex(index = 5)
    public String avatarUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44338id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userName;

    public static BLiveBlackListItem new_() {
        BLiveBlackListItem bLiveBlackListItem = new BLiveBlackListItem();
        bLiveBlackListItem.nullCheck();
        return bLiveBlackListItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBlackListItem mo223809clone() {
        BLiveBlackListItem bLiveBlackListItem = new BLiveBlackListItem();
        bLiveBlackListItem.f44338id = this.f44338id;
        bLiveBlackListItem.roomId = this.roomId;
        bLiveBlackListItem.userId = this.userId;
        bLiveBlackListItem.userName = this.userName;
        bLiveBlackListItem.avatarUrl = this.avatarUrl;
        return bLiveBlackListItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBlackListItem)) {
            return false;
        }
        BLiveBlackListItem bLiveBlackListItem = (BLiveBlackListItem) obj;
        return ValueObject.util_equals(this.f44338id, bLiveBlackListItem.f44338id) && ValueObject.util_equals(this.roomId, bLiveBlackListItem.roomId) && ValueObject.util_equals(this.userId, bLiveBlackListItem.userId) && ValueObject.util_equals(this.userName, bLiveBlackListItem.userName) && ValueObject.util_equals(this.avatarUrl, bLiveBlackListItem.avatarUrl);
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
        String str = this.f44338id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.avatarUrl;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44338id == null) {
            this.f44338id = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.avatarUrl == null) {
            this.avatarUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
