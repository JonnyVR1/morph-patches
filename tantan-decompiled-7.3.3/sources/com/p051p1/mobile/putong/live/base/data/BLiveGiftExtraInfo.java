package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveDiscountSendGiftItem;
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
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftExtraInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftExtraInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftExtraInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftExtraInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftExtraInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftExtraInfo newInstance() {
            return new BLiveGiftExtraInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveGiftExtraInfo bLiveGiftExtraInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1848837903:
                    if (str.equals("guildCall")) {
                        b = 0;
                    }
                    break;
                case -1394371601:
                    if (str.equals("giftSourceEvent")) {
                        b = 1;
                    }
                    break;
                case -1250007754:
                    if (str.equals("stormComment")) {
                        b = 2;
                    }
                    break;
                case -1207468233:
                    if (str.equals(BLiveActivity.TYPE_MULTI_CALL)) {
                        b = 3;
                    }
                    break;
                case -1140386227:
                    if (str.equals("topChat")) {
                        b = 4;
                    }
                    break;
                case -1019273922:
                    if (str.equals(BLiveType.voiceLive)) {
                        b = 5;
                    }
                    break;
                case -834365659:
                    if (str.equals("voiceLiveAuction")) {
                        b = 6;
                    }
                    break;
                case -733246536:
                    if (str.equals("namingCard")) {
                        b = 7;
                    }
                    break;
                case -121228462:
                    if (str.equals("discounts")) {
                        b = 8;
                    }
                    break;
                case 3579:
                    if (str.equals("pk")) {
                        b = 9;
                    }
                    break;
                case 3045982:
                    if (str.equals("call")) {
                        b = 10;
                    }
                    break;
                case 3091780:
                    if (str.equals(BLiveOpenStatus.draw)) {
                        b = 11;
                    }
                    break;
                case 650896225:
                    if (str.equals("shoutingChat")) {
                        b = 12;
                    }
                    break;
                case 1332438643:
                    if (str.equals("videoChat")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1406563604:
                    if (str.equals("multiPk")) {
                        b = 14;
                    }
                    break;
                case 1486650504:
                    if (str.equals("officialShow")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveGiftExtraInfo.guildCall = BLiveGiftMultiCall.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveGiftExtraInfo.giftSourceEvent = BLiveTraceServerData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveGiftExtraInfo.stormComment = BLiveSendStormDanmaku.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveGiftExtraInfo.multiCall = BLiveGiftMultiCall.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveGiftExtraInfo.topChat = BLiveGiftExtraTopChatInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveGiftExtraInfo.voiceLive = BLiveGiftExtraVoiceInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveGiftExtraInfo.voiceLiveAuction = BLiveVoiceAuctionGiftExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveGiftExtraInfo.namingCard = BLiveGiftNamingCardInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveGiftExtraInfo.discounts = JsonAdapter.parseArray(jsonParser, BLiveDiscountSendGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveGiftExtraInfo.f45223pk = BLiveGiftExtraPkInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveGiftExtraInfo.call = BLiveGiftExtraCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveGiftExtraInfo.draw = BLiveGiftExtraDrawInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveGiftExtraInfo.shoutingChat = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLiveGiftExtraInfo.videoChat = BLiveGiftExtraVideoChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveGiftExtraInfo.multiPk = BLiveGiftExtraMultiPkInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveGiftExtraInfo.officialShow = BLiveGiftOfficialShowExtraInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftExtraInfo bLiveGiftExtraInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveGiftExtraInfo.f45223pk != null) {
                jsonGenerator.writeFieldName("pk");
                BLiveGiftExtraPkInfo.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.f45223pk, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.call != null) {
                jsonGenerator.writeFieldName("call");
                BLiveGiftExtraCallInfo.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.call, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.draw != null) {
                jsonGenerator.writeFieldName(BLiveOpenStatus.draw);
                BLiveGiftExtraDrawInfo.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.draw, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.voiceLive != null) {
                jsonGenerator.writeFieldName(BLiveType.voiceLive);
                BLiveGiftExtraVoiceInfo.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.voiceLive, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.giftSourceEvent != null) {
                jsonGenerator.writeFieldName("giftSourceEvent");
                BLiveTraceServerData.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.giftSourceEvent, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.stormComment != null) {
                jsonGenerator.writeFieldName("stormComment");
                BLiveSendStormDanmaku.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.stormComment, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.multiCall != null) {
                jsonGenerator.writeFieldName(BLiveActivity.TYPE_MULTI_CALL);
                BLiveGiftMultiCall.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.multiCall, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.namingCard != null) {
                jsonGenerator.writeFieldName("namingCard");
                BLiveGiftNamingCardInfo.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.namingCard, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.guildCall != null) {
                jsonGenerator.writeFieldName("guildCall");
                BLiveGiftMultiCall.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.guildCall, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.discounts != null) {
                jsonGenerator.writeFieldName("discounts");
                JsonAdapter.serializeArray(bLiveGiftExtraInfo.discounts, jsonGenerator, BLiveDiscountSendGiftItem.JSON_ADAPTER);
            }
            if (bLiveGiftExtraInfo.topChat != null) {
                jsonGenerator.writeFieldName("topChat");
                BLiveGiftExtraTopChatInfo.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.topChat, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.voiceLiveAuction != null) {
                jsonGenerator.writeFieldName("voiceLiveAuction");
                BLiveVoiceAuctionGiftExtra.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.voiceLiveAuction, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.shoutingChat != null) {
                jsonGenerator.writeFieldName("shoutingChat");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.shoutingChat, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.multiPk != null) {
                jsonGenerator.writeFieldName("multiPk");
                BLiveGiftExtraMultiPkInfo.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.multiPk, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.officialShow != null) {
                jsonGenerator.writeFieldName("officialShow");
                BLiveGiftOfficialShowExtraInfo.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.officialShow, jsonGenerator, true);
            }
            if (bLiveGiftExtraInfo.videoChat != null) {
                jsonGenerator.writeFieldName("videoChat");
                BLiveGiftExtraVideoChat.JSON_ADAPTER.serialize(bLiveGiftExtraInfo.videoChat, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftExtraInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftextrainfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveGiftExtraCallInfo call;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<BLiveDiscountSendGiftItem> discounts;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveGiftExtraDrawInfo draw;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveTraceServerData giftSourceEvent;

    @Nullable
    @ProtobufIndex(index = 9)
    public BLiveGiftMultiCall guildCall;

    @Nullable
    @ProtobufIndex(index = 7)
    public BLiveGiftMultiCall multiCall;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveGiftExtraMultiPkInfo multiPk;

    @Nullable
    @ProtobufIndex(index = 8)
    public BLiveGiftNamingCardInfo namingCard;

    @NonNull
    @ProtobufIndex(index = 15)
    public BLiveGiftOfficialShowExtraInfo officialShow;

    /* JADX INFO: renamed from: pk */
    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveGiftExtraPkInfo f45223pk;

    @NonNull
    @ProtobufIndex(index = 13)
    public BLiveCommonViewConfig shoutingChat;

    @Nullable
    @ProtobufIndex(index = 6)
    public BLiveSendStormDanmaku stormComment;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveGiftExtraTopChatInfo topChat;

    @NonNull
    @ProtobufIndex(index = 16)
    public BLiveGiftExtraVideoChat videoChat;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveGiftExtraVoiceInfo voiceLive;

    @NonNull
    @ProtobufIndex(index = 12)
    public BLiveVoiceAuctionGiftExtra voiceLiveAuction;

    public static BLiveGiftExtraInfo new_() {
        BLiveGiftExtraInfo bLiveGiftExtraInfo = new BLiveGiftExtraInfo();
        bLiveGiftExtraInfo.nullCheck();
        return bLiveGiftExtraInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftExtraInfo mo225055clone() {
        BLiveGiftExtraInfo bLiveGiftExtraInfo = new BLiveGiftExtraInfo();
        BLiveGiftExtraPkInfo bLiveGiftExtraPkInfo = this.f45223pk;
        if (bLiveGiftExtraPkInfo != null) {
            bLiveGiftExtraInfo.f45223pk = bLiveGiftExtraPkInfo.mo225055clone();
        }
        BLiveGiftExtraCallInfo bLiveGiftExtraCallInfo = this.call;
        if (bLiveGiftExtraCallInfo != null) {
            bLiveGiftExtraInfo.call = bLiveGiftExtraCallInfo.mo225055clone();
        }
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.draw;
        if (bLiveGiftExtraDrawInfo != null) {
            bLiveGiftExtraInfo.draw = bLiveGiftExtraDrawInfo.mo225055clone();
        }
        BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo = this.voiceLive;
        if (bLiveGiftExtraVoiceInfo != null) {
            bLiveGiftExtraInfo.voiceLive = bLiveGiftExtraVoiceInfo.mo225055clone();
        }
        BLiveTraceServerData bLiveTraceServerData = this.giftSourceEvent;
        if (bLiveTraceServerData != null) {
            bLiveGiftExtraInfo.giftSourceEvent = bLiveTraceServerData.mo225055clone();
        }
        BLiveSendStormDanmaku bLiveSendStormDanmaku = this.stormComment;
        if (bLiveSendStormDanmaku != null) {
            bLiveGiftExtraInfo.stormComment = bLiveSendStormDanmaku.mo225055clone();
        }
        BLiveGiftMultiCall bLiveGiftMultiCall = this.multiCall;
        if (bLiveGiftMultiCall != null) {
            bLiveGiftExtraInfo.multiCall = bLiveGiftMultiCall.mo225055clone();
        }
        BLiveGiftNamingCardInfo bLiveGiftNamingCardInfo = this.namingCard;
        if (bLiveGiftNamingCardInfo != null) {
            bLiveGiftExtraInfo.namingCard = bLiveGiftNamingCardInfo.mo225055clone();
        }
        BLiveGiftMultiCall bLiveGiftMultiCall2 = this.guildCall;
        if (bLiveGiftMultiCall2 != null) {
            bLiveGiftExtraInfo.guildCall = bLiveGiftMultiCall2.mo225055clone();
        }
        List<BLiveDiscountSendGiftItem> list = this.discounts;
        if (list != null) {
            bLiveGiftExtraInfo.discounts = ValueObject.util_map(list, new qcj() { // from class: l.o02
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveDiscountSendGiftItem) obj).mo225055clone();
                }
            });
        }
        BLiveGiftExtraTopChatInfo bLiveGiftExtraTopChatInfo = this.topChat;
        if (bLiveGiftExtraTopChatInfo != null) {
            bLiveGiftExtraInfo.topChat = bLiveGiftExtraTopChatInfo.mo225055clone();
        }
        BLiveVoiceAuctionGiftExtra bLiveVoiceAuctionGiftExtra = this.voiceLiveAuction;
        if (bLiveVoiceAuctionGiftExtra != null) {
            bLiveGiftExtraInfo.voiceLiveAuction = bLiveVoiceAuctionGiftExtra.mo225055clone();
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = this.shoutingChat;
        if (bLiveCommonViewConfig != null) {
            bLiveGiftExtraInfo.shoutingChat = bLiveCommonViewConfig.mo225055clone();
        }
        BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfo = this.multiPk;
        if (bLiveGiftExtraMultiPkInfo != null) {
            bLiveGiftExtraInfo.multiPk = bLiveGiftExtraMultiPkInfo.mo225055clone();
        }
        BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfo = this.officialShow;
        if (bLiveGiftOfficialShowExtraInfo != null) {
            bLiveGiftExtraInfo.officialShow = bLiveGiftOfficialShowExtraInfo.mo225055clone();
        }
        BLiveGiftExtraVideoChat bLiveGiftExtraVideoChat = this.videoChat;
        if (bLiveGiftExtraVideoChat != null) {
            bLiveGiftExtraInfo.videoChat = bLiveGiftExtraVideoChat.mo225055clone();
        }
        return bLiveGiftExtraInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftExtraInfo)) {
            return false;
        }
        BLiveGiftExtraInfo bLiveGiftExtraInfo = (BLiveGiftExtraInfo) obj;
        return ValueObject.util_equals(this.f45223pk, bLiveGiftExtraInfo.f45223pk) && ValueObject.util_equals(this.call, bLiveGiftExtraInfo.call) && ValueObject.util_equals(this.draw, bLiveGiftExtraInfo.draw) && ValueObject.util_equals(this.voiceLive, bLiveGiftExtraInfo.voiceLive) && ValueObject.util_equals(this.giftSourceEvent, bLiveGiftExtraInfo.giftSourceEvent) && ValueObject.util_equals(this.stormComment, bLiveGiftExtraInfo.stormComment) && ValueObject.util_equals(this.multiCall, bLiveGiftExtraInfo.multiCall) && ValueObject.util_equals(this.namingCard, bLiveGiftExtraInfo.namingCard) && ValueObject.util_equals(this.guildCall, bLiveGiftExtraInfo.guildCall) && ValueObject.util_equals(this.discounts, bLiveGiftExtraInfo.discounts) && ValueObject.util_equals(this.topChat, bLiveGiftExtraInfo.topChat) && ValueObject.util_equals(this.voiceLiveAuction, bLiveGiftExtraInfo.voiceLiveAuction) && ValueObject.util_equals(this.shoutingChat, bLiveGiftExtraInfo.shoutingChat) && ValueObject.util_equals(this.multiPk, bLiveGiftExtraInfo.multiPk) && ValueObject.util_equals(this.officialShow, bLiveGiftExtraInfo.officialShow) && ValueObject.util_equals(this.videoChat, bLiveGiftExtraInfo.videoChat);
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
        BLiveGiftExtraPkInfo bLiveGiftExtraPkInfo = this.f45223pk;
        int iHashCode = (i2 + (bLiveGiftExtraPkInfo != null ? bLiveGiftExtraPkInfo.hashCode() : 0)) * 41;
        BLiveGiftExtraCallInfo bLiveGiftExtraCallInfo = this.call;
        int iHashCode2 = (iHashCode + (bLiveGiftExtraCallInfo != null ? bLiveGiftExtraCallInfo.hashCode() : 0)) * 41;
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.draw;
        int iHashCode3 = (iHashCode2 + (bLiveGiftExtraDrawInfo != null ? bLiveGiftExtraDrawInfo.hashCode() : 0)) * 41;
        BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo = this.voiceLive;
        int iHashCode4 = (iHashCode3 + (bLiveGiftExtraVoiceInfo != null ? bLiveGiftExtraVoiceInfo.hashCode() : 0)) * 41;
        BLiveTraceServerData bLiveTraceServerData = this.giftSourceEvent;
        int iHashCode5 = (iHashCode4 + (bLiveTraceServerData != null ? bLiveTraceServerData.hashCode() : 0)) * 41;
        BLiveSendStormDanmaku bLiveSendStormDanmaku = this.stormComment;
        int iHashCode6 = (iHashCode5 + (bLiveSendStormDanmaku != null ? bLiveSendStormDanmaku.hashCode() : 0)) * 41;
        BLiveGiftMultiCall bLiveGiftMultiCall = this.multiCall;
        int iHashCode7 = (iHashCode6 + (bLiveGiftMultiCall != null ? bLiveGiftMultiCall.hashCode() : 0)) * 41;
        BLiveGiftNamingCardInfo bLiveGiftNamingCardInfo = this.namingCard;
        int iHashCode8 = (iHashCode7 + (bLiveGiftNamingCardInfo != null ? bLiveGiftNamingCardInfo.hashCode() : 0)) * 41;
        BLiveGiftMultiCall bLiveGiftMultiCall2 = this.guildCall;
        int iHashCode9 = (iHashCode8 + (bLiveGiftMultiCall2 != null ? bLiveGiftMultiCall2.hashCode() : 0)) * 41;
        List<BLiveDiscountSendGiftItem> list = this.discounts;
        int iHashCode10 = (iHashCode9 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveGiftExtraTopChatInfo bLiveGiftExtraTopChatInfo = this.topChat;
        int iHashCode11 = (iHashCode10 + (bLiveGiftExtraTopChatInfo != null ? bLiveGiftExtraTopChatInfo.hashCode() : 0)) * 41;
        BLiveVoiceAuctionGiftExtra bLiveVoiceAuctionGiftExtra = this.voiceLiveAuction;
        int iHashCode12 = (iHashCode11 + (bLiveVoiceAuctionGiftExtra != null ? bLiveVoiceAuctionGiftExtra.hashCode() : 0)) * 41;
        BLiveCommonViewConfig bLiveCommonViewConfig = this.shoutingChat;
        int iHashCode13 = (iHashCode12 + (bLiveCommonViewConfig != null ? bLiveCommonViewConfig.hashCode() : 0)) * 41;
        BLiveGiftExtraMultiPkInfo bLiveGiftExtraMultiPkInfo = this.multiPk;
        int iHashCode14 = (iHashCode13 + (bLiveGiftExtraMultiPkInfo != null ? bLiveGiftExtraMultiPkInfo.hashCode() : 0)) * 41;
        BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfo = this.officialShow;
        int iHashCode15 = (iHashCode14 + (bLiveGiftOfficialShowExtraInfo != null ? bLiveGiftOfficialShowExtraInfo.hashCode() : 0)) * 41;
        BLiveGiftExtraVideoChat bLiveGiftExtraVideoChat = this.videoChat;
        int iHashCode16 = iHashCode15 + (bLiveGiftExtraVideoChat != null ? bLiveGiftExtraVideoChat.hashCode() : 0);
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45223pk == null) {
            this.f45223pk = BLiveGiftExtraPkInfo.new_();
        }
        if (this.call == null) {
            this.call = BLiveGiftExtraCallInfo.new_();
        }
        if (this.draw == null) {
            this.draw = BLiveGiftExtraDrawInfo.new_();
        }
        if (this.voiceLive == null) {
            this.voiceLive = BLiveGiftExtraVoiceInfo.new_();
        }
        if (this.giftSourceEvent == null) {
            this.giftSourceEvent = BLiveTraceServerData.new_();
        }
        if (this.discounts == null) {
            this.discounts = new ArrayList();
        }
        if (this.topChat == null) {
            this.topChat = BLiveGiftExtraTopChatInfo.new_();
        }
        if (this.voiceLiveAuction == null) {
            this.voiceLiveAuction = BLiveVoiceAuctionGiftExtra.new_();
        }
        if (this.shoutingChat == null) {
            this.shoutingChat = BLiveCommonViewConfig.new_();
        }
        if (this.multiPk == null) {
            this.multiPk = BLiveGiftExtraMultiPkInfo.new_();
        }
        if (this.officialShow == null) {
            this.officialShow = BLiveGiftOfficialShowExtraInfo.new_();
        }
        if (this.videoChat == null) {
            this.videoChat = BLiveGiftExtraVideoChat.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
