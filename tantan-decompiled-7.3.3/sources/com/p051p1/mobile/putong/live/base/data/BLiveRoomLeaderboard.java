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
public class BLiveRoomLeaderboard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRoomLeaderboard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRoomLeaderboard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRoomLeaderboard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRoomLeaderboard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRoomLeaderboard newInstance() {
            return new BLiveRoomLeaderboard();
        }

        public boolean parseField(BLiveRoomLeaderboard bLiveRoomLeaderboard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveRoomLeaderboard.userId = jsonParser.getValueAsString();
                    return true;
                case "url":
                    bLiveRoomLeaderboard.url = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    bLiveRoomLeaderboard.rank = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRoomLeaderboard bLiveRoomLeaderboard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveRoomLeaderboard.rank);
            String str = bLiveRoomLeaderboard.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveRoomLeaderboard.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRoomLeaderboard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveroomleaderboard";

    @ProtobufIndex(index = 1)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveRoomLeaderboard new_() {
        BLiveRoomLeaderboard bLiveRoomLeaderboard = new BLiveRoomLeaderboard();
        bLiveRoomLeaderboard.nullCheck();
        return bLiveRoomLeaderboard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRoomLeaderboard mo225055clone() {
        BLiveRoomLeaderboard bLiveRoomLeaderboard = new BLiveRoomLeaderboard();
        bLiveRoomLeaderboard.rank = this.rank;
        bLiveRoomLeaderboard.userId = this.userId;
        bLiveRoomLeaderboard.url = this.url;
        return bLiveRoomLeaderboard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRoomLeaderboard)) {
            return false;
        }
        BLiveRoomLeaderboard bLiveRoomLeaderboard = (BLiveRoomLeaderboard) obj;
        return this.rank == bLiveRoomLeaderboard.rank && ValueObject.util_equals(this.userId, bLiveRoomLeaderboard.userId) && ValueObject.util_equals(this.url, bLiveRoomLeaderboard.url);
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
        int i2 = ((i * 41) + this.rank) * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
