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
public class BLiveUndercoverCurrentPlayer extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUndercoverCurrentPlayer> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUndercoverCurrentPlayer>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUndercoverCurrentPlayer.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUndercoverCurrentPlayer newInstance() {
            return new BLiveUndercoverCurrentPlayer();
        }

        public boolean parseField(BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "number":
                    bLiveUndercoverCurrentPlayer.number = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    bLiveUndercoverCurrentPlayer.userId = jsonParser.getValueAsString();
                    return true;
                case "mask":
                    bLiveUndercoverCurrentPlayer.mask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "role":
                    bLiveUndercoverCurrentPlayer.role = jsonParser.getValueAsString();
                    return true;
                case "word":
                    bLiveUndercoverCurrentPlayer.word = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUndercoverCurrentPlayer.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("number", bLiveUndercoverCurrentPlayer.number);
            if (bLiveUndercoverCurrentPlayer.mask != null) {
                jsonGenerator.writeFieldName("mask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveUndercoverCurrentPlayer.mask, jsonGenerator, true);
            }
            String str2 = bLiveUndercoverCurrentPlayer.role;
            if (str2 != null) {
                jsonGenerator.writeStringField("role", str2);
            }
            String str3 = bLiveUndercoverCurrentPlayer.word;
            if (str3 != null) {
                jsonGenerator.writeStringField("word", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUndercoverCurrentPlayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveundercovercurrentplayer";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveUserMask mask;

    @ProtobufIndex(index = 2)
    public int number;

    @NonNull
    @ProtobufIndex(index = 4)
    public String role;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String word;

    public static BLiveUndercoverCurrentPlayer new_() {
        BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer = new BLiveUndercoverCurrentPlayer();
        bLiveUndercoverCurrentPlayer.nullCheck();
        return bLiveUndercoverCurrentPlayer;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUndercoverCurrentPlayer mo225055clone() {
        BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer = new BLiveUndercoverCurrentPlayer();
        bLiveUndercoverCurrentPlayer.userId = this.userId;
        bLiveUndercoverCurrentPlayer.number = this.number;
        BLiveUserMask bLiveUserMask = this.mask;
        if (bLiveUserMask != null) {
            bLiveUndercoverCurrentPlayer.mask = bLiveUserMask.mo225055clone();
        }
        bLiveUndercoverCurrentPlayer.role = this.role;
        bLiveUndercoverCurrentPlayer.word = this.word;
        return bLiveUndercoverCurrentPlayer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUndercoverCurrentPlayer)) {
            return false;
        }
        BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer = (BLiveUndercoverCurrentPlayer) obj;
        return ValueObject.util_equals(this.userId, bLiveUndercoverCurrentPlayer.userId) && this.number == bLiveUndercoverCurrentPlayer.number && ValueObject.util_equals(this.mask, bLiveUndercoverCurrentPlayer.mask) && ValueObject.util_equals(this.role, bLiveUndercoverCurrentPlayer.role) && ValueObject.util_equals(this.word, bLiveUndercoverCurrentPlayer.word);
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.number) * 41;
        BLiveUserMask bLiveUserMask = this.mask;
        int iHashCode2 = (iHashCode + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41;
        String str2 = this.role;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.word;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.mask == null) {
            this.mask = BLiveUserMask.new_();
        }
        if (this.role == null) {
            this.role = "";
        }
        if (this.word == null) {
            this.word = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public String toString() {
        return "BLiveUndercoverCurrentPlayer{userId='" + this.userId + "', number=" + this.number + ", mask=" + this.mask + ", role='" + this.role + "', word='" + this.word + "'}";
    }
}
