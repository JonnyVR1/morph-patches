package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePkOwner;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePk extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePk> JSON_ADAPTER = new ObjectJsonAdapter<BLivePk>() { // from class: com.p1.mobile.putong.live.base.data.BLivePk.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePk.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePk newInstance() {
            return new BLivePk();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLivePk bLivePk, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2114813146:
                    if (str.equals("bountyId")) {
                        b = 0;
                    }
                    break;
                case -1930828196:
                    if (str.equals("channelKey")) {
                        b = 1;
                    }
                    break;
                case -1886029058:
                    if (str.equals("pkScoreViewConfig")) {
                        b = 2;
                    }
                    break;
                case -1086850803:
                    if (str.equals("mvpUserId")) {
                        b = 3;
                    }
                    break;
                case -493567566:
                    if (str.equals("players")) {
                        b = 4;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 5;
                    }
                    break;
                case -73377282:
                    if (str.equals("situation")) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 8;
                    }
                    break;
                case 93029116:
                    if (str.equals("appid")) {
                        b = 9;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 10;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 11;
                    }
                    break;
                case 660882227:
                    if (str.equals("showWinTimesTag")) {
                        b = 12;
                    }
                    break;
                case 738950403:
                    if (str.equals("channel")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1156271296:
                    if (str.equals("isOnceMore")) {
                        b = 14;
                    }
                    break;
                case 1164140894:
                    if (str.equals("peerChannelKey")) {
                        b = 15;
                    }
                    break;
                case 1291944564:
                    if (str.equals("pkPlayingBuffInfo")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1296531482:
                    if (str.equals("categoryV2")) {
                        b = 17;
                    }
                    break;
                case 1543996371:
                    if (str.equals("otherChannel")) {
                        b = 18;
                    }
                    break;
                case 1726385129:
                    if (str.equals("pkBackgroundSvgaUrl")) {
                        b = 19;
                    }
                    break;
                case 1987228454:
                    if (str.equals("pkBackgroundUrl")) {
                        b = 20;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLivePk.bountyId = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLivePk.channelKey = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLivePk.pkScoreViewConfig = BLivePkScoreViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLivePk.mvpUserId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLivePk.players = JsonAdapter.parseArray(jsonParser, BLivePkOwner.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLivePk.createdTime = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLivePk.situation = BLivePkSituation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLivePk.f45269id = jsonParser.getValueAsString();
                    return false;
                case 8:
                    bLivePk.category = BLivePkCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 9:
                    bLivePk.appid = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLivePk.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 11:
                    bLivePk.state = BLivePkSeekState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 12:
                    bLivePk.showWinTimesTag = jsonParser.getValueAsBoolean();
                    return true;
                case 13:
                    bLivePk.channel = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLivePk.isOnceMore = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    bLivePk.peerChannelKey = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLivePk.pkPlayingBuffInfo = BLivePKBufferInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLivePk.categoryV2 = BLivePkCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 18:
                    bLivePk.otherChannel = jsonParser.getValueAsString();
                    return true;
                case 19:
                    bLivePk.pkBackgroundSvgaUrl = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLivePk.pkBackgroundUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePk bLivePk, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePk.f45269id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLivePk.category != null) {
                jsonGenerator.writeFieldName("category");
                BLivePkCategory.JSON_ADAPTER.serialize(bLivePk.category, jsonGenerator, true);
            }
            String str2 = bLivePk.channel;
            if (str2 != null) {
                jsonGenerator.writeStringField("channel", str2);
            }
            String str3 = bLivePk.channelKey;
            if (str3 != null) {
                jsonGenerator.writeStringField("channelKey", str3);
            }
            String str4 = bLivePk.otherChannel;
            if (str4 != null) {
                jsonGenerator.writeStringField("otherChannel", str4);
            }
            String str5 = bLivePk.appid;
            if (str5 != null) {
                jsonGenerator.writeStringField("appid", str5);
            }
            if (bLivePk.players != null) {
                jsonGenerator.writeFieldName("players");
                JsonAdapter.serializeArray(bLivePk.players, jsonGenerator, BLivePkOwner.JSON_ADAPTER);
            }
            if (bLivePk.situation != null) {
                jsonGenerator.writeFieldName("situation");
                BLivePkSituation.JSON_ADAPTER.serialize(bLivePk.situation, jsonGenerator, true);
            }
            if (bLivePk.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(bLivePk.owner, jsonGenerator, true);
            }
            if (bLivePk.state != null) {
                jsonGenerator.writeFieldName("state");
                BLivePkSeekState.JSON_ADAPTER.serialize(bLivePk.state, jsonGenerator, true);
            }
            String str6 = bLivePk.createdTime;
            if (str6 != null) {
                jsonGenerator.writeStringField("createdTime", str6);
            }
            jsonGenerator.writeBooleanField("isOnceMore", bLivePk.isOnceMore);
            String str7 = bLivePk.mvpUserId;
            if (str7 != null) {
                jsonGenerator.writeStringField("mvpUserId", str7);
            }
            jsonGenerator.writeBooleanField("showWinTimesTag", bLivePk.showWinTimesTag);
            if (bLivePk.categoryV2 != null) {
                jsonGenerator.writeFieldName("categoryV2");
                BLivePkCategory.JSON_ADAPTER.serialize(bLivePk.categoryV2, jsonGenerator, true);
            }
            String str8 = bLivePk.bountyId;
            if (str8 != null) {
                jsonGenerator.writeStringField("bountyId", str8);
            }
            if (bLivePk.pkScoreViewConfig != null) {
                jsonGenerator.writeFieldName("pkScoreViewConfig");
                BLivePkScoreViewConfig.JSON_ADAPTER.serialize(bLivePk.pkScoreViewConfig, jsonGenerator, true);
            }
            String str9 = bLivePk.pkBackgroundUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("pkBackgroundUrl", str9);
            }
            String str10 = bLivePk.pkBackgroundSvgaUrl;
            if (str10 != null) {
                jsonGenerator.writeStringField("pkBackgroundSvgaUrl", str10);
            }
            if (bLivePk.pkPlayingBuffInfo != null) {
                jsonGenerator.writeFieldName("pkPlayingBuffInfo");
                BLivePKBufferInfo.JSON_ADAPTER.serialize(bLivePk.pkPlayingBuffInfo, jsonGenerator, true);
            }
            String str11 = bLivePk.peerChannelKey;
            if (str11 != null) {
                jsonGenerator.writeStringField("peerChannelKey", str11);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePk) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepk";

    @NonNull
    @ProtobufIndex(index = 6)
    public String appid;

    @NonNull
    @ProtobufIndex(index = 16)
    public String bountyId;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLivePkCategory category;

    @NonNull
    @ProtobufIndex(index = 15)
    public BLivePkCategory categoryV2;

    @NonNull
    @ProtobufIndex(index = 3)
    public String channel;

    @NonNull
    @ProtobufIndex(index = 4)
    public String channelKey;

    @NonNull
    @ProtobufIndex(index = 11)
    public String createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45269id;

    @ProtobufIndex(index = 12)
    public boolean isOnceMore;

    @NonNull
    @ProtobufIndex(index = 13)
    public String mvpUserId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String otherChannel;

    @NonNull
    @ProtobufIndex(index = 9)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 24)
    public String peerChannelKey;

    @NonNull
    @ProtobufIndex(index = 22)
    public String pkBackgroundSvgaUrl;

    @NonNull
    @ProtobufIndex(index = 21)
    public String pkBackgroundUrl;

    @NonNull
    @ProtobufIndex(index = 23)
    public BLivePKBufferInfo pkPlayingBuffInfo;

    @NonNull
    @ProtobufIndex(index = 20)
    public BLivePkScoreViewConfig pkScoreViewConfig;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLivePkOwner> players;

    @ProtobufIndex(index = 14)
    public boolean showWinTimesTag;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLivePkSituation situation;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLivePkSeekState state;

    public static BLivePk new_() {
        BLivePk bLivePk = new BLivePk();
        bLivePk.nullCheck();
        return bLivePk;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePk mo225055clone() {
        BLivePk bLivePk = new BLivePk();
        bLivePk.f45269id = this.f45269id;
        bLivePk.category = this.category;
        bLivePk.channel = this.channel;
        bLivePk.channelKey = this.channelKey;
        bLivePk.otherChannel = this.otherChannel;
        bLivePk.appid = this.appid;
        List<BLivePkOwner> list = this.players;
        if (list != null) {
            bLivePk.players = ValueObject.util_map(list, new qcj() { // from class: l.h42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLivePkOwner) obj).mo225055clone();
                }
            });
        }
        BLivePkSituation bLivePkSituation = this.situation;
        if (bLivePkSituation != null) {
            bLivePk.situation = bLivePkSituation.mo225055clone();
        }
        bLivePk.owner = this.owner;
        bLivePk.state = this.state;
        bLivePk.createdTime = this.createdTime;
        bLivePk.isOnceMore = this.isOnceMore;
        bLivePk.mvpUserId = this.mvpUserId;
        bLivePk.showWinTimesTag = this.showWinTimesTag;
        bLivePk.categoryV2 = this.categoryV2;
        bLivePk.bountyId = this.bountyId;
        BLivePkScoreViewConfig bLivePkScoreViewConfig = this.pkScoreViewConfig;
        if (bLivePkScoreViewConfig != null) {
            bLivePk.pkScoreViewConfig = bLivePkScoreViewConfig.mo225055clone();
        }
        bLivePk.pkBackgroundUrl = this.pkBackgroundUrl;
        bLivePk.pkBackgroundSvgaUrl = this.pkBackgroundSvgaUrl;
        BLivePKBufferInfo bLivePKBufferInfo = this.pkPlayingBuffInfo;
        if (bLivePKBufferInfo != null) {
            bLivePk.pkPlayingBuffInfo = bLivePKBufferInfo.mo225055clone();
        }
        bLivePk.peerChannelKey = this.peerChannelKey;
        return bLivePk;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePk)) {
            return false;
        }
        BLivePk bLivePk = (BLivePk) obj;
        return ValueObject.util_equals(this.f45269id, bLivePk.f45269id) && ValueObject.util_equals(this.category, bLivePk.category) && ValueObject.util_equals(this.channel, bLivePk.channel) && ValueObject.util_equals(this.channelKey, bLivePk.channelKey) && ValueObject.util_equals(this.otherChannel, bLivePk.otherChannel) && ValueObject.util_equals(this.appid, bLivePk.appid) && ValueObject.util_equals(this.players, bLivePk.players) && ValueObject.util_equals(this.situation, bLivePk.situation) && ValueObject.util_equals(this.owner, bLivePk.owner) && ValueObject.util_equals(this.state, bLivePk.state) && ValueObject.util_equals(this.createdTime, bLivePk.createdTime) && this.isOnceMore == bLivePk.isOnceMore && ValueObject.util_equals(this.mvpUserId, bLivePk.mvpUserId) && this.showWinTimesTag == bLivePk.showWinTimesTag && ValueObject.util_equals(this.categoryV2, bLivePk.categoryV2) && ValueObject.util_equals(this.bountyId, bLivePk.bountyId) && ValueObject.util_equals(this.pkScoreViewConfig, bLivePk.pkScoreViewConfig) && ValueObject.util_equals(this.pkBackgroundUrl, bLivePk.pkBackgroundUrl) && ValueObject.util_equals(this.pkBackgroundSvgaUrl, bLivePk.pkBackgroundSvgaUrl) && ValueObject.util_equals(this.pkPlayingBuffInfo, bLivePk.pkPlayingBuffInfo) && ValueObject.util_equals(this.peerChannelKey, bLivePk.peerChannelKey);
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
        String str = this.f45269id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLivePkCategory bLivePkCategory = this.category;
        int iHashCode2 = (iHashCode + (bLivePkCategory != null ? bLivePkCategory.hashCode() : 0)) * 41;
        String str2 = this.channel;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.channelKey;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.otherChannel;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.appid;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<BLivePkOwner> list = this.players;
        int iHashCode7 = (iHashCode6 + (list != null ? list.hashCode() : 0)) * 41;
        BLivePkSituation bLivePkSituation = this.situation;
        int iHashCode8 = (iHashCode7 + (bLivePkSituation != null ? bLivePkSituation.hashCode() : 0)) * 41;
        String str6 = this.owner;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLivePkSeekState bLivePkSeekState = this.state;
        int iHashCode10 = (iHashCode9 + (bLivePkSeekState != null ? bLivePkSeekState.hashCode() : 0)) * 41;
        String str7 = this.createdTime;
        int iHashCode11 = (((iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.isOnceMore ? 1231 : 1237)) * 41;
        String str8 = this.mvpUserId;
        int iHashCode12 = (((iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 41) + (this.showWinTimesTag ? 1231 : 1237)) * 41;
        BLivePkCategory bLivePkCategory2 = this.categoryV2;
        int iHashCode13 = (iHashCode12 + (bLivePkCategory2 != null ? bLivePkCategory2.hashCode() : 0)) * 41;
        String str9 = this.bountyId;
        int iHashCode14 = (iHashCode13 + (str9 != null ? str9.hashCode() : 0)) * 41;
        BLivePkScoreViewConfig bLivePkScoreViewConfig = this.pkScoreViewConfig;
        int iHashCode15 = (iHashCode14 + (bLivePkScoreViewConfig != null ? bLivePkScoreViewConfig.hashCode() : 0)) * 41;
        String str10 = this.pkBackgroundUrl;
        int iHashCode16 = (iHashCode15 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.pkBackgroundSvgaUrl;
        int iHashCode17 = (iHashCode16 + (str11 != null ? str11.hashCode() : 0)) * 41;
        BLivePKBufferInfo bLivePKBufferInfo = this.pkPlayingBuffInfo;
        int iHashCode18 = (iHashCode17 + (bLivePKBufferInfo != null ? bLivePKBufferInfo.hashCode() : 0)) * 41;
        String str12 = this.peerChannelKey;
        int iHashCode19 = iHashCode18 + (str12 != null ? str12.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45269id == null) {
            this.f45269id = "";
        }
        if (this.category == null) {
            this.category = (BLivePkCategory) BLivePkCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.channel == null) {
            this.channel = "";
        }
        if (this.channelKey == null) {
            this.channelKey = "";
        }
        if (this.otherChannel == null) {
            this.otherChannel = "";
        }
        if (this.appid == null) {
            this.appid = "";
        }
        if (this.players == null) {
            this.players = new ArrayList();
        }
        if (this.situation == null) {
            this.situation = BLivePkSituation.new_();
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.state == null) {
            this.state = (BLivePkSeekState) BLivePkSeekState.JSON_ADAPTER.defaultEnum();
        }
        if (this.createdTime == null) {
            this.createdTime = "";
        }
        if (this.mvpUserId == null) {
            this.mvpUserId = "";
        }
        if (this.categoryV2 == null) {
            this.categoryV2 = (BLivePkCategory) BLivePkCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.bountyId == null) {
            this.bountyId = "";
        }
        if (this.pkScoreViewConfig == null) {
            this.pkScoreViewConfig = BLivePkScoreViewConfig.new_();
        }
        if (this.pkBackgroundUrl == null) {
            this.pkBackgroundUrl = "";
        }
        if (this.pkBackgroundSvgaUrl == null) {
            this.pkBackgroundSvgaUrl = "";
        }
        if (this.pkPlayingBuffInfo == null) {
            this.pkPlayingBuffInfo = BLivePKBufferInfo.new_();
        }
        if (this.peerChannelKey == null) {
            this.peerChannelKey = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
