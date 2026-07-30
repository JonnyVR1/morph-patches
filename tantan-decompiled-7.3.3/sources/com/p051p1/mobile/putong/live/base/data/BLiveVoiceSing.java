package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
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
public class BLiveVoiceSing extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSing> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSing>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSing.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSing.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSing newInstance() {
            return new BLiveVoiceSing();
        }

        public boolean parseField(BLiveVoiceSing bLiveVoiceSing, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "remainSeconds":
                    bLiveVoiceSing.remainSeconds = jsonParser.getValueAsLong();
                    return true;
                case "accompany":
                    bLiveVoiceSing.accompany = jsonParser.getValueAsString();
                    return true;
                case "lyricUrl":
                    bLiveVoiceSing.lyricUrl = jsonParser.getValueAsString();
                    return true;
                case "orderId":
                    bLiveVoiceSing.orderId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceSing.userId = jsonParser.getValueAsString();
                    return true;
                case "lyricType":
                    bLiveVoiceSing.lyricType = jsonParser.getValueAsString();
                    return true;
                case "mask":
                    bLiveVoiceSing.mask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "cover":
                    bLiveVoiceSing.cover = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceSing.title = jsonParser.getValueAsString();
                    return true;
                case "hasStart":
                    bLiveVoiceSing.hasStart = jsonParser.getValueAsBoolean();
                    return true;
                case "progressMilliseconds":
                    bLiveVoiceSing.progressMilliseconds = jsonParser.getValueAsString();
                    return true;
                case "countDownSeconds":
                    bLiveVoiceSing.countDownSeconds = jsonParser.getValueAsInt();
                    return true;
                case "songCode":
                    bLiveVoiceSing.songCode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSing bLiveVoiceSing, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceSing.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (bLiveVoiceSing.mask != null) {
                jsonGenerator.writeFieldName("mask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceSing.mask, jsonGenerator, true);
            }
            String str2 = bLiveVoiceSing.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            jsonGenerator.writeNumberField("remainSeconds", bLiveVoiceSing.remainSeconds);
            String str3 = bLiveVoiceSing.accompany;
            if (str3 != null) {
                jsonGenerator.writeStringField("accompany", str3);
            }
            String str4 = bLiveVoiceSing.progressMilliseconds;
            if (str4 != null) {
                jsonGenerator.writeStringField("progressMilliseconds", str4);
            }
            String str5 = bLiveVoiceSing.orderId;
            if (str5 != null) {
                jsonGenerator.writeStringField("orderId", str5);
            }
            jsonGenerator.writeNumberField("countDownSeconds", bLiveVoiceSing.countDownSeconds);
            jsonGenerator.writeBooleanField("hasStart", bLiveVoiceSing.hasStart);
            String str6 = bLiveVoiceSing.cover;
            if (str6 != null) {
                jsonGenerator.writeStringField("cover", str6);
            }
            String str7 = bLiveVoiceSing.lyricType;
            if (str7 != null) {
                jsonGenerator.writeStringField("lyricType", str7);
            }
            String str8 = bLiveVoiceSing.lyricUrl;
            if (str8 != null) {
                jsonGenerator.writeStringField("lyricUrl", str8);
            }
            String str9 = bLiveVoiceSing.songCode;
            if (str9 != null) {
                jsonGenerator.writeStringField("songCode", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSing) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesing";

    @NonNull
    @ProtobufIndex(index = 5)
    public String accompany;

    @ProtobufIndex(index = 8)
    public int countDownSeconds;

    @NonNull
    @ProtobufIndex(index = 10)
    public String cover;

    @ProtobufIndex(index = 9)
    public boolean hasStart;

    @NonNull
    @ProtobufIndex(index = 11)
    public String lyricType;

    @NonNull
    @ProtobufIndex(index = 12)
    public String lyricUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveUserMask mask;

    @NonNull
    @ProtobufIndex(index = 7)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String progressMilliseconds;

    @ProtobufIndex(index = 4)
    public long remainSeconds;

    @NonNull
    @ProtobufIndex(index = 13)
    public String songCode;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static boolean isValid(BLiveVoiceSing bLiveVoiceSing) {
        return (bLiveVoiceSing == null || TextUtils.isEmpty(bLiveVoiceSing.songCode) || TextUtils.isEmpty(bLiveVoiceSing.accompany) || TextUtils.isEmpty(bLiveVoiceSing.orderId) || TextUtils.isEmpty(bLiveVoiceSing.lyricType) || TextUtils.isEmpty(bLiveVoiceSing.userId) || TextUtils.isEmpty(bLiveVoiceSing.lyricUrl)) ? false : true;
    }

    public static BLiveVoiceSing new_() {
        BLiveVoiceSing bLiveVoiceSing = new BLiveVoiceSing();
        bLiveVoiceSing.nullCheck();
        return bLiveVoiceSing;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSing mo225055clone() {
        BLiveVoiceSing bLiveVoiceSing = new BLiveVoiceSing();
        bLiveVoiceSing.userId = this.userId;
        BLiveUserMask bLiveUserMask = this.mask;
        if (bLiveUserMask != null) {
            bLiveVoiceSing.mask = bLiveUserMask.mo225055clone();
        }
        bLiveVoiceSing.title = this.title;
        bLiveVoiceSing.remainSeconds = this.remainSeconds;
        bLiveVoiceSing.accompany = this.accompany;
        bLiveVoiceSing.progressMilliseconds = this.progressMilliseconds;
        bLiveVoiceSing.orderId = this.orderId;
        bLiveVoiceSing.countDownSeconds = this.countDownSeconds;
        bLiveVoiceSing.hasStart = this.hasStart;
        bLiveVoiceSing.cover = this.cover;
        bLiveVoiceSing.lyricType = this.lyricType;
        bLiveVoiceSing.lyricUrl = this.lyricUrl;
        bLiveVoiceSing.songCode = this.songCode;
        return bLiveVoiceSing;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSing)) {
            return false;
        }
        BLiveVoiceSing bLiveVoiceSing = (BLiveVoiceSing) obj;
        return ValueObject.util_equals(this.userId, bLiveVoiceSing.userId) && ValueObject.util_equals(this.mask, bLiveVoiceSing.mask) && ValueObject.util_equals(this.title, bLiveVoiceSing.title) && this.remainSeconds == bLiveVoiceSing.remainSeconds && ValueObject.util_equals(this.accompany, bLiveVoiceSing.accompany) && ValueObject.util_equals(this.progressMilliseconds, bLiveVoiceSing.progressMilliseconds) && ValueObject.util_equals(this.orderId, bLiveVoiceSing.orderId) && this.countDownSeconds == bLiveVoiceSing.countDownSeconds && this.hasStart == bLiveVoiceSing.hasStart && ValueObject.util_equals(this.cover, bLiveVoiceSing.cover) && ValueObject.util_equals(this.lyricType, bLiveVoiceSing.lyricType) && ValueObject.util_equals(this.lyricUrl, bLiveVoiceSing.lyricUrl) && ValueObject.util_equals(this.songCode, bLiveVoiceSing.songCode);
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
        BLiveUserMask bLiveUserMask = this.mask;
        int iHashCode2 = (iHashCode + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        long j = this.remainSeconds;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.accompany;
        int iHashCode4 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.progressMilliseconds;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.orderId;
        int iHashCode6 = (((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.countDownSeconds) * 41) + (this.hasStart ? 1231 : 1237)) * 41;
        String str6 = this.cover;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.lyricType;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.lyricUrl;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.songCode;
        int iHashCode10 = iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.mask == null) {
            this.mask = BLiveUserMask.new_();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.accompany == null) {
            this.accompany = "";
        }
        if (this.progressMilliseconds == null) {
            this.progressMilliseconds = "";
        }
        if (this.orderId == null) {
            this.orderId = "";
        }
        if (this.cover == null) {
            this.cover = "";
        }
        if (this.lyricType == null) {
            this.lyricType = "";
        }
        if (this.lyricUrl == null) {
            this.lyricUrl = "";
        }
        if (this.songCode == null) {
            this.songCode = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
