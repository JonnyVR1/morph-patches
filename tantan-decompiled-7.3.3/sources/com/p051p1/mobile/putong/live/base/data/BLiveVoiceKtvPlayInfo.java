package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceKtvPlayInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceKtvPlayInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceKtvPlayInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceKtvPlayInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceKtvPlayInfo newInstance() {
            return new BLiveVoiceKtvPlayInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2131636617:
                    if (str.equals("levelTip")) {
                        b = 0;
                    }
                    break;
                case -2058717429:
                    if (str.equals("quickGiftInfo")) {
                        b = 1;
                    }
                    break;
                case -2028682214:
                    if (str.equals("songUrl")) {
                        b = 2;
                    }
                    break;
                case -1921309049:
                    if (str.equals("showLevel")) {
                        b = 3;
                    }
                    break;
                case -1672521584:
                    if (str.equals("lyricUrl")) {
                        b = 4;
                    }
                    break;
                case -1406328437:
                    if (str.equals("author")) {
                        b = 5;
                    }
                    break;
                case -1246042127:
                    if (str.equals("giftUv")) {
                        b = 6;
                    }
                    break;
                case -1207110391:
                    if (str.equals("orderId")) {
                        b = 7;
                    }
                    break;
                case -1154247774:
                    if (str.equals("nextLevelGiftUv")) {
                        b = 8;
                    }
                    break;
                case -987494927:
                    if (str.equals("provider")) {
                        b = 9;
                    }
                    break;
                case -907987551:
                    if (str.equals("schema")) {
                        b = 10;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 11;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 12;
                    }
                    break;
                case -308584391:
                    if (str.equals("lyricType")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -292487384:
                    if (str.equals("durationSecond")) {
                        b = 14;
                    }
                    break;
                case 3344108:
                    if (str.equals("mask")) {
                        b = 15;
                    }
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 102865796:
                    if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                        b = 17;
                    }
                    break;
                case 109264530:
                    if (str.equals(FirebaseAnalytics.Param.SCORE)) {
                        b = 18;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = 19;
                    }
                    break;
                case 214078636:
                    if (str.equals("prepareRemainSeconds")) {
                        b = 20;
                    }
                    break;
                case 390120576:
                    if (str.equals("maxLevel")) {
                        b = 21;
                    }
                    break;
                case 521156907:
                    if (str.equals("bestSingerName")) {
                        b = 22;
                    }
                    break;
                case 1534821538:
                    if (str.equals("songCode")) {
                        b = 23;
                    }
                    break;
                case 1567344432:
                    if (str.equals("showBgSvgaUrl")) {
                        b = 24;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceKtvPlayInfo.levelTip = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoiceKtvPlayInfo.quickGiftInfo = BLiveQuickGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveVoiceKtvPlayInfo.songUrl = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoiceKtvPlayInfo.showLevel = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    bLiveVoiceKtvPlayInfo.lyricUrl = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveVoiceKtvPlayInfo.author = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVoiceKtvPlayInfo.giftUv = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    bLiveVoiceKtvPlayInfo.orderId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveVoiceKtvPlayInfo.nextLevelGiftUv = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    bLiveVoiceKtvPlayInfo.provider = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveVoiceKtvPlayInfo.schema = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoiceKtvPlayInfo.status = BLiveKtvPlayInfoStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 12:
                    bLiveVoiceKtvPlayInfo.userId = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveVoiceKtvPlayInfo.lyricType = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveVoiceKtvPlayInfo.durationSecond = jsonParser.getValueAsLong();
                    return true;
                case 15:
                    bLiveVoiceKtvPlayInfo.mask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    bLiveVoiceKtvPlayInfo.cover = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveVoiceKtvPlayInfo.level = jsonParser.getValueAsInt();
                    return true;
                case 18:
                    bLiveVoiceKtvPlayInfo.score = jsonParser.getValueAsLong();
                    return true;
                case 19:
                    bLiveVoiceKtvPlayInfo.title = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveVoiceKtvPlayInfo.prepareRemainSeconds = jsonParser.getValueAsLong();
                    return true;
                case 21:
                    bLiveVoiceKtvPlayInfo.maxLevel = jsonParser.getValueAsInt();
                    return true;
                case 22:
                    bLiveVoiceKtvPlayInfo.bestSingerName = jsonParser.getValueAsString();
                    return true;
                case 23:
                    bLiveVoiceKtvPlayInfo.songCode = jsonParser.getValueAsString();
                    return true;
                case 24:
                    bLiveVoiceKtvPlayInfo.showBgSvgaUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceKtvPlayInfo.orderId;
            if (str != null) {
                jsonGenerator.writeStringField("orderId", str);
            }
            String str2 = bLiveVoiceKtvPlayInfo.songCode;
            if (str2 != null) {
                jsonGenerator.writeStringField("songCode", str2);
            }
            String str3 = bLiveVoiceKtvPlayInfo.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            if (bLiveVoiceKtvPlayInfo.mask != null) {
                jsonGenerator.writeFieldName("mask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceKtvPlayInfo.mask, jsonGenerator, true);
            }
            String str4 = bLiveVoiceKtvPlayInfo.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
            String str5 = bLiveVoiceKtvPlayInfo.lyricUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("lyricUrl", str5);
            }
            String str6 = bLiveVoiceKtvPlayInfo.lyricType;
            if (str6 != null) {
                jsonGenerator.writeStringField("lyricType", str6);
            }
            String str7 = bLiveVoiceKtvPlayInfo.songUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("songUrl", str7);
            }
            jsonGenerator.writeNumberField("prepareRemainSeconds", bLiveVoiceKtvPlayInfo.prepareRemainSeconds);
            if (bLiveVoiceKtvPlayInfo.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveKtvPlayInfoStatus.JSON_ADAPTER.serialize(bLiveVoiceKtvPlayInfo.status, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("durationSecond", bLiveVoiceKtvPlayInfo.durationSecond);
            String str8 = bLiveVoiceKtvPlayInfo.author;
            if (str8 != null) {
                jsonGenerator.writeStringField("author", str8);
            }
            String str9 = bLiveVoiceKtvPlayInfo.cover;
            if (str9 != null) {
                jsonGenerator.writeStringField("cover", str9);
            }
            if (bLiveVoiceKtvPlayInfo.quickGiftInfo != null) {
                jsonGenerator.writeFieldName("quickGiftInfo");
                BLiveQuickGiftInfo.JSON_ADAPTER.serialize(bLiveVoiceKtvPlayInfo.quickGiftInfo, jsonGenerator, true);
            }
            String str10 = bLiveVoiceKtvPlayInfo.provider;
            if (str10 != null) {
                jsonGenerator.writeStringField("provider", str10);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveVoiceKtvPlayInfo.level);
            jsonGenerator.writeNumberField("maxLevel", bLiveVoiceKtvPlayInfo.maxLevel);
            String str11 = bLiveVoiceKtvPlayInfo.levelTip;
            if (str11 != null) {
                jsonGenerator.writeStringField("levelTip", str11);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveVoiceKtvPlayInfo.score);
            jsonGenerator.writeBooleanField("showLevel", bLiveVoiceKtvPlayInfo.showLevel);
            String str12 = bLiveVoiceKtvPlayInfo.schema;
            if (str12 != null) {
                jsonGenerator.writeStringField("schema", str12);
            }
            jsonGenerator.writeNumberField("giftUv", bLiveVoiceKtvPlayInfo.giftUv);
            jsonGenerator.writeNumberField("nextLevelGiftUv", bLiveVoiceKtvPlayInfo.nextLevelGiftUv);
            String str13 = bLiveVoiceKtvPlayInfo.bestSingerName;
            if (str13 != null) {
                jsonGenerator.writeStringField("bestSingerName", str13);
            }
            String str14 = bLiveVoiceKtvPlayInfo.showBgSvgaUrl;
            if (str14 != null) {
                jsonGenerator.writeStringField("showBgSvgaUrl", str14);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceKtvPlayInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicektvplayinfo";

    @NonNull
    @ProtobufIndex(index = 12)
    public String author;

    @NonNull
    @ProtobufIndex(index = 22)
    public String bestSingerName;

    @NonNull
    @ProtobufIndex(index = 13)
    public String cover;

    @ProtobufIndex(index = 11)
    public long durationSecond;

    @ProtobufIndex(index = 24)
    public int giftUv;

    @ProtobufIndex(index = 16)
    public int level;

    @NonNull
    @ProtobufIndex(index = 18)
    public String levelTip;

    @NonNull
    @ProtobufIndex(index = 7)
    public String lyricType;

    @NonNull
    @ProtobufIndex(index = 6)
    public String lyricUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveUserMask mask;

    @ProtobufIndex(index = 17)
    public int maxLevel;

    @ProtobufIndex(index = 25)
    public int nextLevelGiftUv;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderId;

    @ProtobufIndex(index = 9)
    public long prepareRemainSeconds;

    @NonNull
    @ProtobufIndex(index = 15)
    public String provider;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveQuickGiftInfo quickGiftInfo;

    @NonNull
    @ProtobufIndex(index = 20)
    public String schema;

    @ProtobufIndex(index = 21)
    public long score;

    @NonNull
    @ProtobufIndex(index = 23)
    public String showBgSvgaUrl;

    @ProtobufIndex(index = 19)
    public boolean showLevel;

    @NonNull
    @ProtobufIndex(index = 2)
    public String songCode;

    @NonNull
    @ProtobufIndex(index = 8)
    public String songUrl;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveKtvPlayInfoStatus status;

    @NonNull
    @ProtobufIndex(index = 5)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    public static boolean isValid(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        return (bLiveVoiceKtvPlayInfo == null || TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.songCode) || TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.songUrl) || TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.orderId) || TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.lyricUrl) || TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.userId) || TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.lyricType)) ? false : true;
    }

    public static BLiveVoiceKtvPlayInfo new_() {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = new BLiveVoiceKtvPlayInfo();
        bLiveVoiceKtvPlayInfo.nullCheck();
        return bLiveVoiceKtvPlayInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceKtvPlayInfo mo225055clone() {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = new BLiveVoiceKtvPlayInfo();
        bLiveVoiceKtvPlayInfo.orderId = this.orderId;
        bLiveVoiceKtvPlayInfo.songCode = this.songCode;
        bLiveVoiceKtvPlayInfo.userId = this.userId;
        BLiveUserMask bLiveUserMask = this.mask;
        if (bLiveUserMask != null) {
            bLiveVoiceKtvPlayInfo.mask = bLiveUserMask.mo225055clone();
        }
        bLiveVoiceKtvPlayInfo.title = this.title;
        bLiveVoiceKtvPlayInfo.lyricUrl = this.lyricUrl;
        bLiveVoiceKtvPlayInfo.lyricType = this.lyricType;
        bLiveVoiceKtvPlayInfo.songUrl = this.songUrl;
        bLiveVoiceKtvPlayInfo.prepareRemainSeconds = this.prepareRemainSeconds;
        bLiveVoiceKtvPlayInfo.status = this.status;
        bLiveVoiceKtvPlayInfo.durationSecond = this.durationSecond;
        bLiveVoiceKtvPlayInfo.author = this.author;
        bLiveVoiceKtvPlayInfo.cover = this.cover;
        BLiveQuickGiftInfo bLiveQuickGiftInfo = this.quickGiftInfo;
        if (bLiveQuickGiftInfo != null) {
            bLiveVoiceKtvPlayInfo.quickGiftInfo = bLiveQuickGiftInfo.mo225055clone();
        }
        bLiveVoiceKtvPlayInfo.provider = this.provider;
        bLiveVoiceKtvPlayInfo.level = this.level;
        bLiveVoiceKtvPlayInfo.maxLevel = this.maxLevel;
        bLiveVoiceKtvPlayInfo.levelTip = this.levelTip;
        bLiveVoiceKtvPlayInfo.score = this.score;
        bLiveVoiceKtvPlayInfo.showLevel = this.showLevel;
        bLiveVoiceKtvPlayInfo.schema = this.schema;
        bLiveVoiceKtvPlayInfo.giftUv = this.giftUv;
        bLiveVoiceKtvPlayInfo.nextLevelGiftUv = this.nextLevelGiftUv;
        bLiveVoiceKtvPlayInfo.bestSingerName = this.bestSingerName;
        bLiveVoiceKtvPlayInfo.showBgSvgaUrl = this.showBgSvgaUrl;
        return bLiveVoiceKtvPlayInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceKtvPlayInfo)) {
            return false;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = (BLiveVoiceKtvPlayInfo) obj;
        return ValueObject.util_equals(this.orderId, bLiveVoiceKtvPlayInfo.orderId) && ValueObject.util_equals(this.songCode, bLiveVoiceKtvPlayInfo.songCode) && ValueObject.util_equals(this.userId, bLiveVoiceKtvPlayInfo.userId) && ValueObject.util_equals(this.mask, bLiveVoiceKtvPlayInfo.mask) && ValueObject.util_equals(this.title, bLiveVoiceKtvPlayInfo.title) && ValueObject.util_equals(this.lyricUrl, bLiveVoiceKtvPlayInfo.lyricUrl) && ValueObject.util_equals(this.lyricType, bLiveVoiceKtvPlayInfo.lyricType) && ValueObject.util_equals(this.songUrl, bLiveVoiceKtvPlayInfo.songUrl) && this.prepareRemainSeconds == bLiveVoiceKtvPlayInfo.prepareRemainSeconds && ValueObject.util_equals(this.status, bLiveVoiceKtvPlayInfo.status) && this.durationSecond == bLiveVoiceKtvPlayInfo.durationSecond && ValueObject.util_equals(this.author, bLiveVoiceKtvPlayInfo.author) && ValueObject.util_equals(this.cover, bLiveVoiceKtvPlayInfo.cover) && ValueObject.util_equals(this.quickGiftInfo, bLiveVoiceKtvPlayInfo.quickGiftInfo) && ValueObject.util_equals(this.provider, bLiveVoiceKtvPlayInfo.provider) && this.level == bLiveVoiceKtvPlayInfo.level && this.maxLevel == bLiveVoiceKtvPlayInfo.maxLevel && ValueObject.util_equals(this.levelTip, bLiveVoiceKtvPlayInfo.levelTip) && this.score == bLiveVoiceKtvPlayInfo.score && this.showLevel == bLiveVoiceKtvPlayInfo.showLevel && ValueObject.util_equals(this.schema, bLiveVoiceKtvPlayInfo.schema) && this.giftUv == bLiveVoiceKtvPlayInfo.giftUv && this.nextLevelGiftUv == bLiveVoiceKtvPlayInfo.nextLevelGiftUv && ValueObject.util_equals(this.bestSingerName, bLiveVoiceKtvPlayInfo.bestSingerName) && ValueObject.util_equals(this.showBgSvgaUrl, bLiveVoiceKtvPlayInfo.showBgSvgaUrl);
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
        String str = this.orderId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.songCode;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask = this.mask;
        int iHashCode4 = (iHashCode3 + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.lyricUrl;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.lyricType;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.songUrl;
        int iHashCode8 = str7 != null ? str7.hashCode() : 0;
        long j = this.prepareRemainSeconds;
        int i3 = (((iHashCode7 + iHashCode8) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveKtvPlayInfoStatus bLiveKtvPlayInfoStatus = this.status;
        int iHashCode9 = (i3 + (bLiveKtvPlayInfoStatus != null ? bLiveKtvPlayInfoStatus.hashCode() : 0)) * 41;
        long j2 = this.durationSecond;
        int i4 = (iHashCode9 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str8 = this.author;
        int iHashCode10 = (i4 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.cover;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41;
        BLiveQuickGiftInfo bLiveQuickGiftInfo = this.quickGiftInfo;
        int iHashCode12 = (iHashCode11 + (bLiveQuickGiftInfo != null ? bLiveQuickGiftInfo.hashCode() : 0)) * 41;
        String str10 = this.provider;
        int iHashCode13 = (((((iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 41) + this.level) * 41) + this.maxLevel) * 41;
        String str11 = this.levelTip;
        int iHashCode14 = (iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 41;
        long j3 = this.score;
        int i5 = (((iHashCode14 + ((int) (j3 ^ (j3 >>> 32)))) * 41) + (this.showLevel ? 1231 : 1237)) * 41;
        String str12 = this.schema;
        int iHashCode15 = (((((i5 + (str12 != null ? str12.hashCode() : 0)) * 41) + this.giftUv) * 41) + this.nextLevelGiftUv) * 41;
        String str13 = this.bestSingerName;
        int iHashCode16 = (iHashCode15 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.showBgSvgaUrl;
        int iHashCode17 = iHashCode16 + (str14 != null ? str14.hashCode() : 0);
        this.hashCode = iHashCode17;
        return iHashCode17;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.orderId == null) {
            this.orderId = "";
        }
        if (this.songCode == null) {
            this.songCode = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.mask == null) {
            this.mask = BLiveUserMask.new_();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.lyricUrl == null) {
            this.lyricUrl = "";
        }
        if (this.lyricType == null) {
            this.lyricType = "";
        }
        if (this.songUrl == null) {
            this.songUrl = "";
        }
        if (this.status == null) {
            this.status = (BLiveKtvPlayInfoStatus) BLiveKtvPlayInfoStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.author == null) {
            this.author = "";
        }
        if (this.cover == null) {
            this.cover = "";
        }
        if (this.quickGiftInfo == null) {
            this.quickGiftInfo = BLiveQuickGiftInfo.new_();
        }
        if (this.provider == null) {
            this.provider = "";
        }
        if (this.levelTip == null) {
            this.levelTip = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.bestSingerName == null) {
            this.bestSingerName = "";
        }
        if (this.showBgSvgaUrl == null) {
            this.showBgSvgaUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
