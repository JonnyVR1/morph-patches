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
public class BLiveVoiceHourLeaderBoardItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceHourLeaderBoardItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceHourLeaderBoardItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceHourLeaderBoardItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceHourLeaderBoardItem newInstance() {
            return new BLiveVoiceHourLeaderBoardItem();
        }

        public boolean parseField(BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveVoiceHourLeaderBoardItem.amount = jsonParser.getValueAsLong();
                    return true;
                case "rank":
                    bLiveVoiceHourLeaderBoardItem.rank = jsonParser.getValueAsLong();
                    return true;
                case "room":
                    bLiveVoiceHourLeaderBoardItem.room = BLiveVoiceRoom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveVoiceHourLeaderBoardItem.type = jsonParser.getValueAsString();
                    return true;
                case "user":
                    bLiveVoiceHourLeaderBoardItem.user = BLiveVoiceHourLeaderBoardItemUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mvpUser":
                    bLiveVoiceHourLeaderBoardItem.mvpUser = BLiveVoiceHourLeaderBoardItemUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "sweetCpRoom":
                    bLiveVoiceHourLeaderBoardItem.sweetCpRoom = BLiveSweetCpRoom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "sweetCpUser":
                    bLiveVoiceHourLeaderBoardItem.sweetCpUser = BLiveVoiceHourLeaderBoardItemUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceHourLeaderBoardItem.user != null) {
                jsonGenerator.writeFieldName("user");
                BLiveVoiceHourLeaderBoardItemUser.JSON_ADAPTER.serialize(bLiveVoiceHourLeaderBoardItem.user, jsonGenerator, true);
            }
            if (bLiveVoiceHourLeaderBoardItem.mvpUser != null) {
                jsonGenerator.writeFieldName("mvpUser");
                BLiveVoiceHourLeaderBoardItemUser.JSON_ADAPTER.serialize(bLiveVoiceHourLeaderBoardItem.mvpUser, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveVoiceHourLeaderBoardItem.rank);
            jsonGenerator.writeNumberField("amount", bLiveVoiceHourLeaderBoardItem.amount);
            String str = bLiveVoiceHourLeaderBoardItem.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (bLiveVoiceHourLeaderBoardItem.room != null) {
                jsonGenerator.writeFieldName("room");
                BLiveVoiceRoom.JSON_ADAPTER.serialize(bLiveVoiceHourLeaderBoardItem.room, jsonGenerator, true);
            }
            if (bLiveVoiceHourLeaderBoardItem.sweetCpUser != null) {
                jsonGenerator.writeFieldName("sweetCpUser");
                BLiveVoiceHourLeaderBoardItemUser.JSON_ADAPTER.serialize(bLiveVoiceHourLeaderBoardItem.sweetCpUser, jsonGenerator, true);
            }
            if (bLiveVoiceHourLeaderBoardItem.sweetCpRoom != null) {
                jsonGenerator.writeFieldName("sweetCpRoom");
                BLiveSweetCpRoom.JSON_ADAPTER.serialize(bLiveVoiceHourLeaderBoardItem.sweetCpRoom, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceHourLeaderBoardItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicehourleaderboarditem";

    @ProtobufIndex(index = 4)
    public long amount;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVoiceHourLeaderBoardItemUser mvpUser;

    @ProtobufIndex(index = 3)
    public long rank;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveVoiceRoom room;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveSweetCpRoom sweetCpRoom;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveVoiceHourLeaderBoardItemUser sweetCpUser;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveVoiceHourLeaderBoardItemUser user;

    public static BLiveVoiceHourLeaderBoardItem new_() {
        BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = new BLiveVoiceHourLeaderBoardItem();
        bLiveVoiceHourLeaderBoardItem.nullCheck();
        return bLiveVoiceHourLeaderBoardItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceHourLeaderBoardItem mo223809clone() {
        BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = new BLiveVoiceHourLeaderBoardItem();
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser = this.user;
        if (bLiveVoiceHourLeaderBoardItemUser != null) {
            bLiveVoiceHourLeaderBoardItem.user = bLiveVoiceHourLeaderBoardItemUser.mo223809clone();
        }
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser2 = this.mvpUser;
        if (bLiveVoiceHourLeaderBoardItemUser2 != null) {
            bLiveVoiceHourLeaderBoardItem.mvpUser = bLiveVoiceHourLeaderBoardItemUser2.mo223809clone();
        }
        bLiveVoiceHourLeaderBoardItem.rank = this.rank;
        bLiveVoiceHourLeaderBoardItem.amount = this.amount;
        bLiveVoiceHourLeaderBoardItem.type = this.type;
        BLiveVoiceRoom bLiveVoiceRoom = this.room;
        if (bLiveVoiceRoom != null) {
            bLiveVoiceHourLeaderBoardItem.room = bLiveVoiceRoom.mo223809clone();
        }
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser3 = this.sweetCpUser;
        if (bLiveVoiceHourLeaderBoardItemUser3 != null) {
            bLiveVoiceHourLeaderBoardItem.sweetCpUser = bLiveVoiceHourLeaderBoardItemUser3.mo223809clone();
        }
        BLiveSweetCpRoom bLiveSweetCpRoom = this.sweetCpRoom;
        if (bLiveSweetCpRoom != null) {
            bLiveVoiceHourLeaderBoardItem.sweetCpRoom = bLiveSweetCpRoom.mo223809clone();
        }
        return bLiveVoiceHourLeaderBoardItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceHourLeaderBoardItem)) {
            return false;
        }
        BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = (BLiveVoiceHourLeaderBoardItem) obj;
        return ValueObject.util_equals(this.user, bLiveVoiceHourLeaderBoardItem.user) && ValueObject.util_equals(this.mvpUser, bLiveVoiceHourLeaderBoardItem.mvpUser) && this.rank == bLiveVoiceHourLeaderBoardItem.rank && this.amount == bLiveVoiceHourLeaderBoardItem.amount && ValueObject.util_equals(this.type, bLiveVoiceHourLeaderBoardItem.type) && ValueObject.util_equals(this.room, bLiveVoiceHourLeaderBoardItem.room) && ValueObject.util_equals(this.sweetCpUser, bLiveVoiceHourLeaderBoardItem.sweetCpUser) && ValueObject.util_equals(this.sweetCpRoom, bLiveVoiceHourLeaderBoardItem.sweetCpRoom);
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
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser = this.user;
        int iHashCode = (i2 + (bLiveVoiceHourLeaderBoardItemUser != null ? bLiveVoiceHourLeaderBoardItemUser.hashCode() : 0)) * 41;
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser2 = this.mvpUser;
        int iHashCode2 = bLiveVoiceHourLeaderBoardItemUser2 != null ? bLiveVoiceHourLeaderBoardItemUser2.hashCode() : 0;
        long j = this.rank;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.amount;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.type;
        int iHashCode3 = (i4 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveVoiceRoom bLiveVoiceRoom = this.room;
        int iHashCode4 = (iHashCode3 + (bLiveVoiceRoom != null ? bLiveVoiceRoom.hashCode() : 0)) * 41;
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser3 = this.sweetCpUser;
        int iHashCode5 = (iHashCode4 + (bLiveVoiceHourLeaderBoardItemUser3 != null ? bLiveVoiceHourLeaderBoardItemUser3.hashCode() : 0)) * 41;
        BLiveSweetCpRoom bLiveSweetCpRoom = this.sweetCpRoom;
        int iHashCode6 = iHashCode5 + (bLiveSweetCpRoom != null ? bLiveSweetCpRoom.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.user == null) {
            this.user = BLiveVoiceHourLeaderBoardItemUser.new_();
        }
        if (this.mvpUser == null) {
            this.mvpUser = BLiveVoiceHourLeaderBoardItemUser.new_();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.room == null) {
            this.room = BLiveVoiceRoom.new_();
        }
        if (this.sweetCpUser == null) {
            this.sweetCpUser = BLiveVoiceHourLeaderBoardItemUser.new_();
        }
        if (this.sweetCpRoom == null) {
            this.sweetCpRoom = BLiveSweetCpRoom.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
