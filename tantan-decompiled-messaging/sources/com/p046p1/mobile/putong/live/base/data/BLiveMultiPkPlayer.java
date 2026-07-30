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
public class BLiveMultiPkPlayer extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiPkPlayer> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiPkPlayer>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiPkPlayer.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiPkPlayer.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiPkPlayer newInstance() {
            return new BLiveMultiPkPlayer();
        }

        public boolean parseField(BLiveMultiPkPlayer bLiveMultiPkPlayer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    bLiveMultiPkPlayer.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveMultiPkPlayer.roomId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveMultiPkPlayer.userId = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    bLiveMultiPkPlayer.rank = jsonParser.getValueAsInt();
                    return true;
                case "role":
                    bLiveMultiPkPlayer.role = jsonParser.getValueAsString();
                    return true;
                case "point":
                    bLiveMultiPkPlayer.point = jsonParser.getValueAsLong();
                    return true;
                case "position":
                    bLiveMultiPkPlayer.position = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiPkPlayer bLiveMultiPkPlayer, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiPkPlayer.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveMultiPkPlayer.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = bLiveMultiPkPlayer.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
            jsonGenerator.writeNumberField("position", bLiveMultiPkPlayer.position);
            String str4 = bLiveMultiPkPlayer.role;
            if (str4 != null) {
                jsonGenerator.writeStringField("role", str4);
            }
            jsonGenerator.writeNumberField("point", bLiveMultiPkPlayer.point);
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveMultiPkPlayer.rank);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiPkPlayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemultipkplayer";

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveId;

    @ProtobufIndex(index = 6)
    public long point;

    @ProtobufIndex(index = 4)
    public int position;

    @ProtobufIndex(index = 7)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 5)
    public String role;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveMultiPkPlayer new_() {
        BLiveMultiPkPlayer bLiveMultiPkPlayer = new BLiveMultiPkPlayer();
        bLiveMultiPkPlayer.nullCheck();
        return bLiveMultiPkPlayer;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiPkPlayer mo223809clone() {
        BLiveMultiPkPlayer bLiveMultiPkPlayer = new BLiveMultiPkPlayer();
        bLiveMultiPkPlayer.userId = this.userId;
        bLiveMultiPkPlayer.liveId = this.liveId;
        bLiveMultiPkPlayer.roomId = this.roomId;
        bLiveMultiPkPlayer.position = this.position;
        bLiveMultiPkPlayer.role = this.role;
        bLiveMultiPkPlayer.point = this.point;
        bLiveMultiPkPlayer.rank = this.rank;
        return bLiveMultiPkPlayer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiPkPlayer)) {
            return false;
        }
        BLiveMultiPkPlayer bLiveMultiPkPlayer = (BLiveMultiPkPlayer) obj;
        return ValueObject.util_equals(this.userId, bLiveMultiPkPlayer.userId) && ValueObject.util_equals(this.liveId, bLiveMultiPkPlayer.liveId) && ValueObject.util_equals(this.roomId, bLiveMultiPkPlayer.roomId) && this.position == bLiveMultiPkPlayer.position && ValueObject.util_equals(this.role, bLiveMultiPkPlayer.role) && this.point == bLiveMultiPkPlayer.point && this.rank == bLiveMultiPkPlayer.rank;
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
        String str2 = this.liveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomId;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.position) * 41;
        String str4 = this.role;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        long j = this.point;
        int i3 = ((((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.rank;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
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
