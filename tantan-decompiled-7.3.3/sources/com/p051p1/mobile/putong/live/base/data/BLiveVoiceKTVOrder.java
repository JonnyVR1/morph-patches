package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.MessageType;
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
public class BLiveVoiceKTVOrder extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceKTVOrder> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceKTVOrder>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceKTVOrder.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceKTVOrder newInstance() {
            return new BLiveVoiceKTVOrder();
        }

        public boolean parseField(BLiveVoiceKTVOrder bLiveVoiceKTVOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "number":
                    bLiveVoiceKTVOrder.number = jsonParser.getValueAsString();
                    return true;
                case "provider":
                    bLiveVoiceKTVOrder.provider = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveVoiceKTVOrder.status = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceKTVOrder.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceKTVOrder.f45349id = jsonParser.getValueAsString();
                    return false;
                case "mask":
                    bLiveVoiceKTVOrder.mask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "song":
                    bLiveVoiceKTVOrder.song = BLiveVoiceKTVSong.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceKTVOrder bLiveVoiceKTVOrder, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceKTVOrder.f45349id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveVoiceKTVOrder.song != null) {
                jsonGenerator.writeFieldName(MessageType.song);
                BLiveVoiceKTVSong.JSON_ADAPTER.serialize(bLiveVoiceKTVOrder.song, jsonGenerator, true);
            }
            String str2 = bLiveVoiceKTVOrder.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            if (bLiveVoiceKTVOrder.mask != null) {
                jsonGenerator.writeFieldName("mask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceKTVOrder.mask, jsonGenerator, true);
            }
            String str3 = bLiveVoiceKTVOrder.number;
            if (str3 != null) {
                jsonGenerator.writeStringField("number", str3);
            }
            String str4 = bLiveVoiceKTVOrder.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
            String str5 = bLiveVoiceKTVOrder.provider;
            if (str5 != null) {
                jsonGenerator.writeStringField("provider", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceKTVOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicektvorder";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45349id;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveUserMask mask;

    @NonNull
    @ProtobufIndex(index = 4)
    public String number;

    @NonNull
    @ProtobufIndex(index = 7)
    public String provider;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVoiceKTVSong song;

    @NonNull
    @ProtobufIndex(index = 5)
    public String status;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    public static BLiveVoiceKTVOrder new_() {
        BLiveVoiceKTVOrder bLiveVoiceKTVOrder = new BLiveVoiceKTVOrder();
        bLiveVoiceKTVOrder.nullCheck();
        return bLiveVoiceKTVOrder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceKTVOrder mo225055clone() {
        BLiveVoiceKTVOrder bLiveVoiceKTVOrder = new BLiveVoiceKTVOrder();
        bLiveVoiceKTVOrder.f45349id = this.f45349id;
        BLiveVoiceKTVSong bLiveVoiceKTVSong = this.song;
        if (bLiveVoiceKTVSong != null) {
            bLiveVoiceKTVOrder.song = bLiveVoiceKTVSong.mo225055clone();
        }
        bLiveVoiceKTVOrder.userId = this.userId;
        BLiveUserMask bLiveUserMask = this.mask;
        if (bLiveUserMask != null) {
            bLiveVoiceKTVOrder.mask = bLiveUserMask.mo225055clone();
        }
        bLiveVoiceKTVOrder.number = this.number;
        bLiveVoiceKTVOrder.status = this.status;
        bLiveVoiceKTVOrder.provider = this.provider;
        return bLiveVoiceKTVOrder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceKTVOrder)) {
            return false;
        }
        BLiveVoiceKTVOrder bLiveVoiceKTVOrder = (BLiveVoiceKTVOrder) obj;
        return ValueObject.util_equals(this.f45349id, bLiveVoiceKTVOrder.f45349id) && ValueObject.util_equals(this.song, bLiveVoiceKTVOrder.song) && ValueObject.util_equals(this.userId, bLiveVoiceKTVOrder.userId) && ValueObject.util_equals(this.mask, bLiveVoiceKTVOrder.mask) && ValueObject.util_equals(this.number, bLiveVoiceKTVOrder.number) && ValueObject.util_equals(this.status, bLiveVoiceKTVOrder.status) && ValueObject.util_equals(this.provider, bLiveVoiceKTVOrder.provider);
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
        String str = this.f45349id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveVoiceKTVSong bLiveVoiceKTVSong = this.song;
        int iHashCode2 = (iHashCode + (bLiveVoiceKTVSong != null ? bLiveVoiceKTVSong.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask = this.mask;
        int iHashCode4 = (iHashCode3 + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41;
        String str3 = this.number;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.status;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.provider;
        int iHashCode7 = iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45349id == null) {
            this.f45349id = "";
        }
        if (this.song == null) {
            this.song = BLiveVoiceKTVSong.new_();
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.mask == null) {
            this.mask = BLiveUserMask.new_();
        }
        if (this.number == null) {
            this.number = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.provider == null) {
            this.provider = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
