package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMsg;
import com.p051p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
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
public class BLiveSuggestLive extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSuggestLive> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSuggestLive>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSuggestLive.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSuggestLive.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSuggestLive newInstance() {
            return new BLiveSuggestLive();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveSuggestLive bLiveSuggestLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        b = 0;
                    }
                    break;
                case -1963349241:
                    if (str.equals("videoCaptureScore")) {
                        b = 1;
                    }
                    break;
                case -1810381185:
                    if (str.equals("streamFlvUrl")) {
                        b = 2;
                    }
                    break;
                case -1645915898:
                    if (str.equals("streamFlvUrlIpv6")) {
                        b = 3;
                    }
                    break;
                case -1413299531:
                    if (str.equals("anchor")) {
                        b = 4;
                    }
                    break;
                case -1282680389:
                    if (str.equals("specialLabel")) {
                        b = 5;
                    }
                    break;
                case -1142281334:
                    if (str.equals("recommendInfo")) {
                        b = 6;
                    }
                    break;
                case -1142085786:
                    if (str.equals("basicLabel")) {
                        b = 7;
                    }
                    break;
                case -379143530:
                    if (str.equals("coverLabels")) {
                        b = 8;
                    }
                    break;
                case -172220347:
                    if (str.equals("callback")) {
                        b = 9;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 10;
                    }
                    break;
                case 3506395:
                    if (str.equals("room")) {
                        b = 11;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 12;
                    }
                    break;
                case 499196100:
                    if (str.equals("chatMessages")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 662750480:
                    if (str.equals("intlFrame")) {
                        b = 14;
                    }
                    break;
                case 681757476:
                    if (str.equals("videoCaptureUrl")) {
                        b = 15;
                    }
                    break;
                case 715290546:
                    if (str.equals("coverLabelsV2")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1108431579:
                    if (str.equals("streamCdnInfo")) {
                        b = 17;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 18;
                    }
                    break;
                case 1417480367:
                    if (str.equals("liveMode")) {
                        b = 19;
                    }
                    break;
                case 1417698886:
                    if (str.equals("liveType")) {
                        b = 20;
                    }
                    break;
                case 1510898351:
                    if (str.equals("rtcInfo")) {
                        b = 21;
                    }
                    break;
                case 1535142763:
                    if (str.equals("guildCallExtend")) {
                        b = 22;
                    }
                    break;
                case 1566172293:
                    if (str.equals("multiCallInfo")) {
                        b = 23;
                    }
                    break;
                case 1748149553:
                    if (str.equals("multiCallExtend")) {
                        b = 24;
                    }
                    break;
                case 2065670015:
                    if (str.equals("redPacketIds")) {
                        b = 25;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveSuggestLive.subtitle = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveSuggestLive.videoCaptureScore = (float) jsonParser.getValueAsDouble();
                    return true;
                case 2:
                    bLiveSuggestLive.streamFlvUrl = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveSuggestLive.streamFlvUrlIpv6 = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveSuggestLive.anchor = BLiveSuggestLiveAnchor.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    bLiveSuggestLive.specialLabel = BLiveSuggestLabel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveSuggestLive.recommendInfo = BLiveRecommendInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveSuggestLive.basicLabel = BLiveSuggestLabel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveSuggestLive.coverLabels = JsonAdapter.parseArray(jsonParser, BLiveCoverLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveSuggestLive.callback = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveSuggestLive.f45298id = jsonParser.getValueAsString();
                    return false;
                case 11:
                    bLiveSuggestLive.room = BLiveSuggestLiveRoom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveSuggestLive.state = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveSuggestLive.chatMessages = JsonAdapter.parseArray(jsonParser, BLiveChatMsg.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveSuggestLive.intlFrame = BLiveIntlLiveFrame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveSuggestLive.videoCaptureUrl = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveSuggestLive.coverLabelsV2 = JsonAdapter.parseArray(jsonParser, BLiveCoverLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    bLiveSuggestLive.streamCdnInfo = BLiveStreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    bLiveSuggestLive.memberCount = jsonParser.getValueAsInt();
                    return true;
                case 19:
                    bLiveSuggestLive.liveMode = jsonParser.getValueAsString();
                    return true;
                case 20:
                    bLiveSuggestLive.liveType = jsonParser.getValueAsString();
                    return true;
                case 21:
                    bLiveSuggestLive.rtcInfo = BLiveRtcInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    bLiveSuggestLive.guildCallExtend = BLiveMultiCallExtend.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    bLiveSuggestLive.multiCallInfo = BLiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    bLiveSuggestLive.multiCallExtend = BLiveMultiCallExtend.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    bLiveSuggestLive.redPacketIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSuggestLive bLiveSuggestLive, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSuggestLive.f45298id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveSuggestLive.room != null) {
                jsonGenerator.writeFieldName("room");
                BLiveSuggestLiveRoom.JSON_ADAPTER.serialize(bLiveSuggestLive.room, jsonGenerator, true);
            }
            if (bLiveSuggestLive.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveSuggestLiveAnchor.JSON_ADAPTER.serialize(bLiveSuggestLive.anchor, jsonGenerator, true);
            }
            String str2 = bLiveSuggestLive.streamFlvUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("streamFlvUrl", str2);
            }
            if (bLiveSuggestLive.streamCdnInfo != null) {
                jsonGenerator.writeFieldName("streamCdnInfo");
                BLiveStreamCdnInfo.JSON_ADAPTER.serialize(bLiveSuggestLive.streamCdnInfo, jsonGenerator, true);
            }
            if (bLiveSuggestLive.recommendInfo != null) {
                jsonGenerator.writeFieldName("recommendInfo");
                BLiveRecommendInfo.JSON_ADAPTER.serialize(bLiveSuggestLive.recommendInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("memberCount", bLiveSuggestLive.memberCount);
            String str3 = bLiveSuggestLive.videoCaptureUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("videoCaptureUrl", str3);
            }
            String str4 = bLiveSuggestLive.state;
            if (str4 != null) {
                jsonGenerator.writeStringField("state", str4);
            }
            String str5 = bLiveSuggestLive.callback;
            if (str5 != null) {
                jsonGenerator.writeStringField("callback", str5);
            }
            if (bLiveSuggestLive.specialLabel != null) {
                jsonGenerator.writeFieldName("specialLabel");
                BLiveSuggestLabel.JSON_ADAPTER.serialize(bLiveSuggestLive.specialLabel, jsonGenerator, true);
            }
            if (bLiveSuggestLive.basicLabel != null) {
                jsonGenerator.writeFieldName("basicLabel");
                BLiveSuggestLabel.JSON_ADAPTER.serialize(bLiveSuggestLive.basicLabel, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("videoCaptureScore", bLiveSuggestLive.videoCaptureScore);
            if (bLiveSuggestLive.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                BLiveMultiCallInfo.JSON_ADAPTER.serialize(bLiveSuggestLive.multiCallInfo, jsonGenerator, true);
            }
            if (bLiveSuggestLive.multiCallExtend != null) {
                jsonGenerator.writeFieldName("multiCallExtend");
                BLiveMultiCallExtend.JSON_ADAPTER.serialize(bLiveSuggestLive.multiCallExtend, jsonGenerator, true);
            }
            if (bLiveSuggestLive.redPacketIds != null) {
                jsonGenerator.writeFieldName("redPacketIds");
                JsonAdapter.serializeArray(bLiveSuggestLive.redPacketIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveSuggestLive.guildCallExtend != null) {
                jsonGenerator.writeFieldName("guildCallExtend");
                BLiveMultiCallExtend.JSON_ADAPTER.serialize(bLiveSuggestLive.guildCallExtend, jsonGenerator, true);
            }
            if (bLiveSuggestLive.coverLabels != null) {
                jsonGenerator.writeFieldName("coverLabels");
                JsonAdapter.serializeArray(bLiveSuggestLive.coverLabels, jsonGenerator, BLiveCoverLabel.JSON_ADAPTER);
            }
            String str6 = bLiveSuggestLive.liveType;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveType", str6);
            }
            if (bLiveSuggestLive.rtcInfo != null) {
                jsonGenerator.writeFieldName("rtcInfo");
                BLiveRtcInfo.JSON_ADAPTER.serialize(bLiveSuggestLive.rtcInfo, jsonGenerator, true);
            }
            if (bLiveSuggestLive.coverLabelsV2 != null) {
                jsonGenerator.writeFieldName("coverLabelsV2");
                JsonAdapter.serializeArray(bLiveSuggestLive.coverLabelsV2, jsonGenerator, BLiveCoverLabel.JSON_ADAPTER);
            }
            if (bLiveSuggestLive.chatMessages != null) {
                jsonGenerator.writeFieldName("chatMessages");
                JsonAdapter.serializeArray(bLiveSuggestLive.chatMessages, jsonGenerator, BLiveChatMsg.JSON_ADAPTER);
            }
            String str7 = bLiveSuggestLive.liveMode;
            if (str7 != null) {
                jsonGenerator.writeStringField("liveMode", str7);
            }
            if (bLiveSuggestLive.intlFrame != null) {
                jsonGenerator.writeFieldName("intlFrame");
                BLiveIntlLiveFrame.JSON_ADAPTER.serialize(bLiveSuggestLive.intlFrame, jsonGenerator, true);
            }
            String str8 = bLiveSuggestLive.subtitle;
            if (str8 != null) {
                jsonGenerator.writeStringField("subtitle", str8);
            }
            String str9 = bLiveSuggestLive.streamFlvUrlIpv6;
            if (str9 != null) {
                jsonGenerator.writeStringField("streamFlvUrlIpv6", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSuggestLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesuggestlive";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveSuggestLiveAnchor anchor;

    @NonNull
    @ProtobufIndex(index = 12)
    public BLiveSuggestLabel basicLabel;

    @NonNull
    @ProtobufIndex(index = 10)
    public String callback;

    @NonNull
    @ProtobufIndex(index = 22)
    public List<BLiveChatMsg> chatMessages;

    @NonNull
    @ProtobufIndex(index = 18)
    public List<BLiveCoverLabel> coverLabels;

    @NonNull
    @ProtobufIndex(index = 21)
    public List<BLiveCoverLabel> coverLabelsV2;

    @Nullable
    @ProtobufIndex(index = 17)
    public BLiveMultiCallExtend guildCallExtend;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45298id;

    @Nullable
    @ProtobufIndex(index = 24)
    public BLiveIntlLiveFrame intlFrame;

    @NonNull
    @ProtobufIndex(index = 23)
    public String liveMode;

    @NonNull
    @ProtobufIndex(index = 19)
    public String liveType;

    @ProtobufIndex(index = 7)
    public int memberCount;

    @Nullable
    @ProtobufIndex(index = 15)
    public BLiveMultiCallExtend multiCallExtend;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveMultiCallInfo multiCallInfo;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveRecommendInfo recommendInfo;

    @NonNull
    @ProtobufIndex(index = 16)
    public List<String> redPacketIds;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveSuggestLiveRoom room;

    @NonNull
    @ProtobufIndex(index = 20)
    public BLiveRtcInfo rtcInfo;

    @NonNull
    @ProtobufIndex(index = 11)
    public BLiveSuggestLabel specialLabel;

    @NonNull
    @ProtobufIndex(index = 9)
    public String state;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveStreamCdnInfo streamCdnInfo;

    @NonNull
    @ProtobufIndex(index = 4)
    public String streamFlvUrl;

    @NonNull
    @ProtobufIndex(index = 26)
    public String streamFlvUrlIpv6;

    @NonNull
    @ProtobufIndex(index = 25)
    public String subtitle;

    @ProtobufIndex(index = 13)
    public float videoCaptureScore;

    @NonNull
    @ProtobufIndex(index = 8)
    public String videoCaptureUrl;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m69438b(String str) {
        return str;
    }

    public static BLiveSuggestLive convertFrom(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, User user) {
        BLiveSuggestLive bLiveSuggestLiveNew_ = new_();
        bLiveSuggestLiveNew_.f45298id = bLiveAbsData.f45171id;
        BLiveSuggestLiveRoom bLiveSuggestLiveRoomNew_ = BLiveSuggestLiveRoom.new_();
        bLiveSuggestLiveNew_.room = bLiveSuggestLiveRoomNew_;
        bLiveSuggestLiveRoomNew_.f45300id = bLiveAbsData.room.f45267id;
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchorNew_ = BLiveSuggestLiveAnchor.new_();
        bLiveSuggestLiveNew_.anchor = bLiveSuggestLiveAnchorNew_;
        bLiveSuggestLiveAnchorNew_.f45299id = bLiveAbsData.anchor.f45267id;
        bLiveSuggestLiveNew_.state = bLiveAbsData.state.toString();
        bLiveSuggestLiveNew_.recommendInfo = bLiveAbsData.recommendInfo;
        Media media = bLiveAbsData.videoCapture;
        if (media != null) {
            bLiveSuggestLiveNew_.videoCaptureUrl = media.url;
        }
        BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
        if (bLiveStreamUrl != null) {
            bLiveSuggestLiveNew_.streamFlvUrl = bLiveStreamUrl.pullFlv;
            bLiveSuggestLiveNew_.streamFlvUrlIpv6 = bLiveStreamUrl.pullFlvIpv6;
        }
        bLiveSuggestLiveNew_.streamCdnInfo = bLiveAbsData.streamCdnInfo;
        bLiveSuggestLiveNew_.callback = bLiveAbsData.callback;
        bLiveSuggestLiveNew_.memberCount = (int) bLiveAbsData.memberCount;
        if (bLiveAbsData instanceof BLive) {
            bLiveSuggestLiveNew_.multiCallInfo = ((BLive) bLiveAbsData).multiCallInfo;
        }
        bLiveSuggestLiveNew_.liveMode = bLiveAbsData.liveMode;
        return bLiveSuggestLiveNew_;
    }

    public static BLiveSuggestLive new_() {
        BLiveSuggestLive bLiveSuggestLive = new BLiveSuggestLive();
        bLiveSuggestLive.nullCheck();
        return bLiveSuggestLive;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSuggestLive mo225055clone() {
        BLiveSuggestLive bLiveSuggestLive = new BLiveSuggestLive();
        bLiveSuggestLive.f45298id = this.f45298id;
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = this.room;
        if (bLiveSuggestLiveRoom != null) {
            bLiveSuggestLive.room = bLiveSuggestLiveRoom.mo225055clone();
        }
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = this.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            bLiveSuggestLive.anchor = bLiveSuggestLiveAnchor.mo225055clone();
        }
        bLiveSuggestLive.streamFlvUrl = this.streamFlvUrl;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        if (bLiveStreamCdnInfo != null) {
            bLiveSuggestLive.streamCdnInfo = bLiveStreamCdnInfo.mo225055clone();
        }
        BLiveRecommendInfo bLiveRecommendInfo = this.recommendInfo;
        if (bLiveRecommendInfo != null) {
            bLiveSuggestLive.recommendInfo = bLiveRecommendInfo.mo225055clone();
        }
        bLiveSuggestLive.memberCount = this.memberCount;
        bLiveSuggestLive.videoCaptureUrl = this.videoCaptureUrl;
        bLiveSuggestLive.state = this.state;
        bLiveSuggestLive.callback = this.callback;
        BLiveSuggestLabel bLiveSuggestLabel = this.specialLabel;
        if (bLiveSuggestLabel != null) {
            bLiveSuggestLive.specialLabel = bLiveSuggestLabel.mo225055clone();
        }
        BLiveSuggestLabel bLiveSuggestLabel2 = this.basicLabel;
        if (bLiveSuggestLabel2 != null) {
            bLiveSuggestLive.basicLabel = bLiveSuggestLabel2.mo225055clone();
        }
        bLiveSuggestLive.videoCaptureScore = this.videoCaptureScore;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        if (bLiveMultiCallInfo != null) {
            bLiveSuggestLive.multiCallInfo = bLiveMultiCallInfo.mo225055clone();
        }
        BLiveMultiCallExtend bLiveMultiCallExtend = this.multiCallExtend;
        if (bLiveMultiCallExtend != null) {
            bLiveSuggestLive.multiCallExtend = bLiveMultiCallExtend.mo225055clone();
        }
        List<String> list = this.redPacketIds;
        if (list != null) {
            bLiveSuggestLive.redPacketIds = ValueObject.util_map(list, new qcj() { // from class: l.p62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveSuggestLive.m69438b((String) obj);
                }
            });
        }
        BLiveMultiCallExtend bLiveMultiCallExtend2 = this.guildCallExtend;
        if (bLiveMultiCallExtend2 != null) {
            bLiveSuggestLive.guildCallExtend = bLiveMultiCallExtend2.mo225055clone();
        }
        List<BLiveCoverLabel> list2 = this.coverLabels;
        if (list2 != null) {
            bLiveSuggestLive.coverLabels = ValueObject.util_map(list2, new qcj() { // from class: l.q62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCoverLabel) obj).mo225055clone();
                }
            });
        }
        bLiveSuggestLive.liveType = this.liveType;
        BLiveRtcInfo bLiveRtcInfo = this.rtcInfo;
        if (bLiveRtcInfo != null) {
            bLiveSuggestLive.rtcInfo = bLiveRtcInfo.mo225055clone();
        }
        List<BLiveCoverLabel> list3 = this.coverLabelsV2;
        if (list3 != null) {
            bLiveSuggestLive.coverLabelsV2 = ValueObject.util_map(list3, new qcj() { // from class: l.r62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCoverLabel) obj).mo225055clone();
                }
            });
        }
        List<BLiveChatMsg> list4 = this.chatMessages;
        if (list4 != null) {
            bLiveSuggestLive.chatMessages = ValueObject.util_map(list4, new qcj() { // from class: l.s62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveChatMsg) obj).mo225055clone();
                }
            });
        }
        bLiveSuggestLive.liveMode = this.liveMode;
        BLiveIntlLiveFrame bLiveIntlLiveFrame = this.intlFrame;
        if (bLiveIntlLiveFrame != null) {
            bLiveSuggestLive.intlFrame = bLiveIntlLiveFrame.mo225055clone();
        }
        bLiveSuggestLive.subtitle = this.subtitle;
        bLiveSuggestLive.streamFlvUrlIpv6 = this.streamFlvUrlIpv6;
        return bLiveSuggestLive;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSuggestLive)) {
            return false;
        }
        BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) obj;
        return ValueObject.util_equals(this.f45298id, bLiveSuggestLive.f45298id) && ValueObject.util_equals(this.room, bLiveSuggestLive.room) && ValueObject.util_equals(this.anchor, bLiveSuggestLive.anchor) && ValueObject.util_equals(this.streamFlvUrl, bLiveSuggestLive.streamFlvUrl) && ValueObject.util_equals(this.streamCdnInfo, bLiveSuggestLive.streamCdnInfo) && ValueObject.util_equals(this.recommendInfo, bLiveSuggestLive.recommendInfo) && this.memberCount == bLiveSuggestLive.memberCount && ValueObject.util_equals(this.videoCaptureUrl, bLiveSuggestLive.videoCaptureUrl) && ValueObject.util_equals(this.state, bLiveSuggestLive.state) && ValueObject.util_equals(this.callback, bLiveSuggestLive.callback) && ValueObject.util_equals(this.specialLabel, bLiveSuggestLive.specialLabel) && ValueObject.util_equals(this.basicLabel, bLiveSuggestLive.basicLabel) && this.videoCaptureScore == bLiveSuggestLive.videoCaptureScore && ValueObject.util_equals(this.multiCallInfo, bLiveSuggestLive.multiCallInfo) && ValueObject.util_equals(this.multiCallExtend, bLiveSuggestLive.multiCallExtend) && ValueObject.util_equals(this.redPacketIds, bLiveSuggestLive.redPacketIds) && ValueObject.util_equals(this.guildCallExtend, bLiveSuggestLive.guildCallExtend) && ValueObject.util_equals(this.coverLabels, bLiveSuggestLive.coverLabels) && ValueObject.util_equals(this.liveType, bLiveSuggestLive.liveType) && ValueObject.util_equals(this.rtcInfo, bLiveSuggestLive.rtcInfo) && ValueObject.util_equals(this.coverLabelsV2, bLiveSuggestLive.coverLabelsV2) && ValueObject.util_equals(this.chatMessages, bLiveSuggestLive.chatMessages) && ValueObject.util_equals(this.liveMode, bLiveSuggestLive.liveMode) && ValueObject.util_equals(this.intlFrame, bLiveSuggestLive.intlFrame) && ValueObject.util_equals(this.subtitle, bLiveSuggestLive.subtitle) && ValueObject.util_equals(this.streamFlvUrlIpv6, bLiveSuggestLive.streamFlvUrlIpv6);
    }

    public BLive expendToFullLive() {
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.f45171id = this.f45298id;
        BLiveStreamUrl bLiveStreamUrlNew_ = BLiveStreamUrl.new_();
        bLiveNew_.streamUrl = bLiveStreamUrlNew_;
        bLiveStreamUrlNew_.pullFlv = this.streamFlvUrl;
        bLiveStreamUrlNew_.pullFlvIpv6 = this.streamFlvUrlIpv6;
        bLiveNew_.callback = this.callback;
        bLiveNew_.recommendInfo = this.recommendInfo;
        bLiveNew_.streamCdnInfo = this.streamCdnInfo;
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveNew_.room = bLiveOwnerNew_;
        bLiveOwnerNew_.f45267id = this.room.f45300id;
        BLiveOwner bLiveOwnerNew_2 = BLiveOwner.new_();
        bLiveNew_.anchor = bLiveOwnerNew_2;
        bLiveOwnerNew_2.f45267id = this.anchor.f45299id;
        bLiveNew_.state = BLiveState.get(this.state);
        bLiveNew_.memberCount = this.memberCount;
        bLiveNew_.multiCallInfo = this.multiCallInfo;
        bLiveNew_.rtcInfo = this.rtcInfo;
        bLiveNew_.setExtraRoomCoverUrl(this.room.coverUrl);
        bLiveNew_.liveMode = this.liveMode;
        return bLiveNew_;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getRecommendCategory() {
        return TextUtils.isEmpty(this.recommendInfo.category) ? "basic" : this.recommendInfo.category;
    }

    public String getRecommendCategoryForTrack() {
        return TextUtils.isEmpty(this.recommendInfo.category) ? "NA" : this.recommendInfo.category;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f45298id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom = this.room;
        int iHashCode2 = (iHashCode + (bLiveSuggestLiveRoom != null ? bLiveSuggestLiveRoom.hashCode() : 0)) * 41;
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = this.anchor;
        int iHashCode3 = (iHashCode2 + (bLiveSuggestLiveAnchor != null ? bLiveSuggestLiveAnchor.hashCode() : 0)) * 41;
        String str2 = this.streamFlvUrl;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        int iHashCode5 = (iHashCode4 + (bLiveStreamCdnInfo != null ? bLiveStreamCdnInfo.hashCode() : 0)) * 41;
        BLiveRecommendInfo bLiveRecommendInfo = this.recommendInfo;
        int iHashCode6 = (((iHashCode5 + (bLiveRecommendInfo != null ? bLiveRecommendInfo.hashCode() : 0)) * 41) + this.memberCount) * 41;
        String str3 = this.videoCaptureUrl;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.state;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.callback;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveSuggestLabel bLiveSuggestLabel = this.specialLabel;
        int iHashCode10 = (iHashCode9 + (bLiveSuggestLabel != null ? bLiveSuggestLabel.hashCode() : 0)) * 41;
        BLiveSuggestLabel bLiveSuggestLabel2 = this.basicLabel;
        int iHashCode11 = (((iHashCode10 + (bLiveSuggestLabel2 != null ? bLiveSuggestLabel2.hashCode() : 0)) * 41) + Float.floatToIntBits(this.videoCaptureScore)) * 41;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        int iHashCode12 = (iHashCode11 + (bLiveMultiCallInfo != null ? bLiveMultiCallInfo.hashCode() : 0)) * 41;
        BLiveMultiCallExtend bLiveMultiCallExtend = this.multiCallExtend;
        int iHashCode13 = (iHashCode12 + (bLiveMultiCallExtend != null ? bLiveMultiCallExtend.hashCode() : 0)) * 41;
        List<String> list = this.redPacketIds;
        int iHashCode14 = (iHashCode13 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveMultiCallExtend bLiveMultiCallExtend2 = this.guildCallExtend;
        int iHashCode15 = (iHashCode14 + (bLiveMultiCallExtend2 != null ? bLiveMultiCallExtend2.hashCode() : 0)) * 41;
        List<BLiveCoverLabel> list2 = this.coverLabels;
        int iHashCode16 = (iHashCode15 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str6 = this.liveType;
        int iHashCode17 = (iHashCode16 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLiveRtcInfo bLiveRtcInfo = this.rtcInfo;
        int iHashCode18 = (iHashCode17 + (bLiveRtcInfo != null ? bLiveRtcInfo.hashCode() : 0)) * 41;
        List<BLiveCoverLabel> list3 = this.coverLabelsV2;
        int iHashCode19 = (iHashCode18 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<BLiveChatMsg> list4 = this.chatMessages;
        int iHashCode20 = (iHashCode19 + (list4 != null ? list4.hashCode() : 0)) * 41;
        String str7 = this.liveMode;
        int iHashCode21 = (iHashCode20 + (str7 != null ? str7.hashCode() : 0)) * 41;
        BLiveIntlLiveFrame bLiveIntlLiveFrame = this.intlFrame;
        int iHashCode22 = (iHashCode21 + (bLiveIntlLiveFrame != null ? bLiveIntlLiveFrame.hashCode() : 0)) * 41;
        String str8 = this.subtitle;
        int iHashCode23 = (iHashCode22 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.streamFlvUrlIpv6;
        int iHashCode24 = iHashCode23 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode24;
        return iHashCode24;
    }

    public boolean isOnLive() {
        return TextUtils.equals(this.state, "onlive");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45298id == null) {
            this.f45298id = "";
        }
        if (this.room == null) {
            this.room = BLiveSuggestLiveRoom.new_();
        }
        if (this.anchor == null) {
            this.anchor = BLiveSuggestLiveAnchor.new_();
        }
        if (this.streamFlvUrl == null) {
            this.streamFlvUrl = "";
        }
        if (this.streamCdnInfo == null) {
            this.streamCdnInfo = BLiveStreamCdnInfo.new_();
        }
        if (this.recommendInfo == null) {
            this.recommendInfo = BLiveRecommendInfo.new_();
        }
        if (this.videoCaptureUrl == null) {
            this.videoCaptureUrl = "";
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.callback == null) {
            this.callback = "";
        }
        if (this.specialLabel == null) {
            this.specialLabel = BLiveSuggestLabel.new_();
        }
        if (this.basicLabel == null) {
            this.basicLabel = BLiveSuggestLabel.new_();
        }
        if (this.multiCallInfo == null) {
            this.multiCallInfo = BLiveMultiCallInfo.new_();
        }
        if (this.redPacketIds == null) {
            this.redPacketIds = new ArrayList();
        }
        if (this.coverLabels == null) {
            this.coverLabels = new ArrayList();
        }
        if (this.liveType == null) {
            this.liveType = "";
        }
        if (this.rtcInfo == null) {
            this.rtcInfo = BLiveRtcInfo.new_();
        }
        if (this.coverLabelsV2 == null) {
            this.coverLabelsV2 = new ArrayList();
        }
        if (this.chatMessages == null) {
            this.chatMessages = new ArrayList();
        }
        if (this.liveMode == null) {
            this.liveMode = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.streamFlvUrlIpv6 == null) {
            this.streamFlvUrlIpv6 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
