package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.LiveBasicLabel;
import com.p051p1.mobile.putong.data.LiveSpecialLabel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class Live extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "live";

    @NonNull
    @ProtobufIndex(index = 3)
    public Owner anchor;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<LiveBasicLabel> basicLabels;

    @NonNull
    @ProtobufIndex(index = 21)
    public String callback;

    @Nullable
    @ProtobufIndex(index = 23)
    public Media coverPicUrl;

    @ProtobufIndex(index = 13)
    public double endTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39615id;

    @ProtobufIndex(index = 6)
    public double memberCount;

    @ProtobufIndex(index = 14)
    public long messageCount;

    @NonNull
    @ProtobufIndex(index = 17)
    public RecommendInfo recommendInfo;

    @NonNull
    @ProtobufIndex(index = 20)
    public List<String> redPacketIds;

    @ProtobufIndex(index = 5)
    public double rewardPoint;

    @ProtobufIndex(index = 15)
    public double rewarderCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public Owner room;

    @Nullable
    @ProtobufIndex(index = 7)
    public Media snapshot;

    @NonNull
    @ProtobufIndex(index = 18)
    public String source;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<LiveSpecialLabel> specialLabels;

    @ProtobufIndex(index = 8)
    public double startTime;

    @NonNull
    @ProtobufIndex(index = 9)
    public LiveState state;

    @NonNull
    @ProtobufIndex(index = 16)
    public StreamCdnInfo streamCdnInfo;

    @NonNull
    @ProtobufIndex(index = 4)
    public StreamUrl streamUrl;

    @NonNull
    @ProtobufIndex(index = 10)
    public String type;

    @Nullable
    @ProtobufIndex(index = 19)
    public Media videoCapture;

    @ProtobufIndex(index = 22)
    public boolean whetherToBlur;
    public static final Live EMPTY = new_();
    public static ProtobufAdapter<Live> PROTOBUF_ADAPTER = new MessageNanoAdapter<Live>() { // from class: com.p1.mobile.putong.data.Live.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Live live) {
            String str = live.f39615id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Owner owner = live.room;
            if (owner != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            Owner owner2 = live.anchor;
            if (owner2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, owner2, Owner.PROTOBUF_ADAPTER);
            }
            StreamUrl streamUrl = live.streamUrl;
            if (streamUrl != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, streamUrl, StreamUrl.PROTOBUF_ADAPTER);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(5, live.rewardPoint) + CodedOutputByteBufferNano.m17277d(6, live.memberCount);
            Media media = live.snapshot;
            if (media != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(7, media, Media.PROTOBUF_ADAPTER);
            }
            int iM17277d2 = iM17277d + CodedOutputByteBufferNano.m17277d(8, live.startTime);
            LiveState liveState = live.state;
            if (liveState != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17281h(9, liveState.ordinal());
            }
            String str2 = live.type;
            if (str2 != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17288o(10, str2);
            }
            List<LiveBasicLabel> list = live.basicLabels;
            if (list != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17285l(11, list, LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveSpecialLabel> list2 = live.specialLabels;
            if (list2 != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17285l(12, list2, LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17277d3 = iM17277d2 + CodedOutputByteBufferNano.m17277d(13, live.endTime) + CodedOutputByteBufferNano.m17283j(14, live.messageCount) + CodedOutputByteBufferNano.m17277d(15, live.rewarderCount);
            StreamCdnInfo streamCdnInfo = live.streamCdnInfo;
            if (streamCdnInfo != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17285l(16, streamCdnInfo, StreamCdnInfo.PROTOBUF_ADAPTER);
            }
            RecommendInfo recommendInfo = live.recommendInfo;
            if (recommendInfo != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17285l(17, recommendInfo, RecommendInfo.PROTOBUF_ADAPTER);
            }
            String str3 = live.source;
            if (str3 != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17288o(18, str3);
            }
            Media media2 = live.videoCapture;
            if (media2 != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17285l(19, media2, Media.PROTOBUF_ADAPTER);
            }
            List<String> list3 = live.redPacketIds;
            if (list3 != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17285l(20, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = live.callback;
            if (str4 != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17288o(21, str4);
            }
            int iM17275b = iM17277d3 + CodedOutputByteBufferNano.m17275b(22, live.whetherToBlur);
            Media media3 = live.coverPicUrl;
            if (media3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(23, media3, Media.PROTOBUF_ADAPTER);
            }
            LiveState liveState2 = live.state;
            if (liveState2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(24, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
            live.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Live parse(nc5 nc5Var) throws IOException {
            Live live = new Live();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (live.state == null && numValueOf != null) {
                            live.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (live.f39615id == null) {
                            live.f39615id = "";
                        }
                        if (live.room == null) {
                            live.room = Owner.new_();
                        }
                        if (live.anchor == null) {
                            live.anchor = Owner.new_();
                        }
                        if (live.streamUrl == null) {
                            live.streamUrl = StreamUrl.new_();
                        }
                        if (live.state == null) {
                            live.state = (LiveState) LiveState.JSON_ADAPTER.defaultEnum();
                        }
                        if (live.type == null) {
                            live.type = "";
                        }
                        if (live.basicLabels == null) {
                            live.basicLabels = new ArrayList();
                        }
                        if (live.specialLabels == null) {
                            live.specialLabels = new ArrayList();
                        }
                        if (live.streamCdnInfo == null) {
                            live.streamCdnInfo = StreamCdnInfo.new_();
                        }
                        if (live.recommendInfo == null) {
                            live.recommendInfo = RecommendInfo.new_();
                        }
                        if (live.source == null) {
                            live.source = "";
                        }
                        if (live.redPacketIds == null) {
                            live.redPacketIds = new ArrayList();
                        }
                        if (live.callback == null) {
                            live.callback = "";
                        }
                        break;
                    case 10:
                        live.f39615id = nc5Var.m162495s();
                        continue;
                    case 18:
                        live.room = (Owner) nc5Var.m162488l(Owner.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        live.anchor = (Owner) nc5Var.m162488l(Owner.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        live.streamUrl = (StreamUrl) nc5Var.m162488l(StreamUrl.PROTOBUF_ADAPTER);
                        continue;
                    case 41:
                        live.rewardPoint = nc5Var.m162484h();
                        continue;
                    case 49:
                        live.memberCount = nc5Var.m162484h();
                        continue;
                    case 58:
                        live.snapshot = (Media) nc5Var.m162488l(Media.PROTOBUF_ADAPTER);
                        continue;
                    case 65:
                        live.startTime = nc5Var.m162484h();
                        continue;
                    case 72:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        live.type = nc5Var.m162495s();
                        continue;
                    case 90:
                        live.basicLabels = (List) nc5Var.m162488l(LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        live.specialLabels = (List) nc5Var.m162488l(LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 105:
                        live.endTime = nc5Var.m162484h();
                        continue;
                    case 112:
                        live.messageCount = nc5Var.m162487k();
                        continue;
                    case 121:
                        live.rewarderCount = nc5Var.m162484h();
                        continue;
                    case 130:
                        live.streamCdnInfo = (StreamCdnInfo) nc5Var.m162488l(StreamCdnInfo.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        live.recommendInfo = (RecommendInfo) nc5Var.m162488l(RecommendInfo.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        live.source = nc5Var.m162495s();
                        continue;
                    case 154:
                        live.videoCapture = (Media) nc5Var.m162488l(Media.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        live.redPacketIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        live.callback = nc5Var.m162495s();
                        continue;
                    case 176:
                        live.whetherToBlur = nc5Var.m162483g();
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        live.coverPicUrl = (Media) nc5Var.m162488l(Media.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        live.state = (LiveState) nc5Var.m162488l(LiveState.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (live.state == null && numValueOf != null) {
                            live.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (live.f39615id == null) {
                            live.f39615id = "";
                        }
                        if (live.room == null) {
                            live.room = Owner.new_();
                        }
                        if (live.anchor == null) {
                            live.anchor = Owner.new_();
                        }
                        if (live.streamUrl == null) {
                            live.streamUrl = StreamUrl.new_();
                        }
                        if (live.state == null) {
                            live.state = (LiveState) LiveState.JSON_ADAPTER.defaultEnum();
                        }
                        if (live.type == null) {
                            live.type = "";
                        }
                        if (live.basicLabels == null) {
                            live.basicLabels = new ArrayList();
                        }
                        if (live.specialLabels == null) {
                            live.specialLabels = new ArrayList();
                        }
                        if (live.streamCdnInfo == null) {
                            live.streamCdnInfo = StreamCdnInfo.new_();
                        }
                        if (live.recommendInfo == null) {
                            live.recommendInfo = RecommendInfo.new_();
                        }
                        if (live.source == null) {
                            live.source = "";
                        }
                        if (live.redPacketIds == null) {
                            live.redPacketIds = new ArrayList();
                        }
                        if (live.callback == null) {
                            live.callback = "";
                            return live;
                        }
                        break;
                }
            }
            return live;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Live live, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = live.f39615id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Owner owner = live.room;
            if (owner != null) {
                codedOutputByteBufferNano.m17309K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            Owner owner2 = live.anchor;
            if (owner2 != null) {
                codedOutputByteBufferNano.m17309K(3, owner2, Owner.PROTOBUF_ADAPTER);
            }
            StreamUrl streamUrl = live.streamUrl;
            if (streamUrl != null) {
                codedOutputByteBufferNano.m17309K(4, streamUrl, StreamUrl.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17301C(5, live.rewardPoint);
            codedOutputByteBufferNano.m17301C(6, live.memberCount);
            Media media = live.snapshot;
            if (media != null) {
                codedOutputByteBufferNano.m17309K(7, media, Media.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17301C(8, live.startTime);
            LiveState liveState = live.state;
            if (liveState != null) {
                codedOutputByteBufferNano.m17305G(9, liveState.ordinal());
            }
            String str2 = live.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(10, str2);
            }
            List<LiveBasicLabel> list = live.basicLabels;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(11, list, LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveSpecialLabel> list2 = live.specialLabels;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(12, list2, LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17301C(13, live.endTime);
            codedOutputByteBufferNano.m17307I(14, live.messageCount);
            codedOutputByteBufferNano.m17301C(15, live.rewarderCount);
            StreamCdnInfo streamCdnInfo = live.streamCdnInfo;
            if (streamCdnInfo != null) {
                codedOutputByteBufferNano.m17309K(16, streamCdnInfo, StreamCdnInfo.PROTOBUF_ADAPTER);
            }
            RecommendInfo recommendInfo = live.recommendInfo;
            if (recommendInfo != null) {
                codedOutputByteBufferNano.m17309K(17, recommendInfo, RecommendInfo.PROTOBUF_ADAPTER);
            }
            String str3 = live.source;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(18, str3);
            }
            Media media2 = live.videoCapture;
            if (media2 != null) {
                codedOutputByteBufferNano.m17309K(19, media2, Media.PROTOBUF_ADAPTER);
            }
            List<String> list3 = live.redPacketIds;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(20, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = live.callback;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(21, str4);
            }
            codedOutputByteBufferNano.m17299A(22, live.whetherToBlur);
            Media media3 = live.coverPicUrl;
            if (media3 != null) {
                codedOutputByteBufferNano.m17309K(23, media3, Media.PROTOBUF_ADAPTER);
            }
            LiveState liveState2 = live.state;
            if (liveState2 != null) {
                codedOutputByteBufferNano.m17309K(24, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Live> JSON_ADAPTER = new ObjectJsonAdapter<Live>() { // from class: com.p1.mobile.putong.data.Live.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Live.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Live newInstance() {
            return new Live();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Live live, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 1;
                    }
                    break;
                case -1413299531:
                    if (str.equals("anchor")) {
                        b = 2;
                    }
                    break;
                case -1312076472:
                    if (str.equals("messageCount")) {
                        b = 3;
                    }
                    break;
                case -1142281334:
                    if (str.equals("recommendInfo")) {
                        b = 4;
                    }
                    break;
                case -1108386280:
                    if (str.equals("specialLabels")) {
                        b = 5;
                    }
                    break;
                case -1044920883:
                    if (str.equals("basicLabels")) {
                        b = 6;
                    }
                    break;
                case -900590153:
                    if (str.equals("whetherToBlur")) {
                        b = 7;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 8;
                    }
                    break;
                case -315634225:
                    if (str.equals("streamUrl")) {
                        b = 9;
                    }
                    break;
                case -257224164:
                    if (str.equals("coverPicUrl")) {
                        b = 10;
                    }
                    break;
                case -172220347:
                    if (str.equals("callback")) {
                        b = 11;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 12;
                    }
                    break;
                case 3506395:
                    if (str.equals("room")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 14;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 15;
                    }
                    break;
                case 284874180:
                    if (str.equals("snapshot")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 405428811:
                    if (str.equals("videoCapture")) {
                        b = 17;
                    }
                    break;
                case 884554657:
                    if (str.equals("rewardPoint")) {
                        b = 18;
                    }
                    break;
                case 1108431579:
                    if (str.equals("streamCdnInfo")) {
                        b = 19;
                    }
                    break;
                case 1162036819:
                    if (str.equals("rewarderCount")) {
                        b = 20;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 21;
                    }
                    break;
                case 2065670015:
                    if (str.equals("redPacketIds")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    live.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 1:
                    live.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 2:
                    live.anchor = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    live.messageCount = jsonParser.getValueAsLong();
                    return true;
                case 4:
                    live.recommendInfo = RecommendInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    live.specialLabels = JsonAdapter.parseArray(jsonParser, LiveSpecialLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    live.basicLabels = JsonAdapter.parseArray(jsonParser, LiveBasicLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    live.whetherToBlur = jsonParser.getValueAsBoolean();
                    return true;
                case 8:
                    live.source = jsonParser.getValueAsString();
                    return true;
                case 9:
                    live.streamUrl = StreamUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    live.coverPicUrl = Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case 11:
                    live.callback = jsonParser.getValueAsString();
                    return true;
                case 12:
                    live.f39615id = jsonParser.getValueAsString();
                    return false;
                case 13:
                    live.room = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    live.type = jsonParser.getValueAsString();
                    return true;
                case 15:
                    live.state = LiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 16:
                    live.snapshot = Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case 17:
                    live.videoCapture = Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case 18:
                    live.rewardPoint = jsonParser.getValueAsDouble();
                    return true;
                case 19:
                    live.streamCdnInfo = StreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    live.rewarderCount = jsonParser.getValueAsDouble();
                    return true;
                case 21:
                    live.memberCount = jsonParser.getValueAsDouble();
                    return true;
                case 22:
                    live.redPacketIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Live live, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 1;
                    }
                    break;
                case -1413299531:
                    if (str.equals("anchor")) {
                        b = 2;
                    }
                    break;
                case -1312076472:
                    if (str.equals("messageCount")) {
                        b = 3;
                    }
                    break;
                case -1142281334:
                    if (str.equals("recommendInfo")) {
                        b = 4;
                    }
                    break;
                case -1108386280:
                    if (str.equals("specialLabels")) {
                        b = 5;
                    }
                    break;
                case -1044920883:
                    if (str.equals("basicLabels")) {
                        b = 6;
                    }
                    break;
                case -900590153:
                    if (str.equals("whetherToBlur")) {
                        b = 7;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 8;
                    }
                    break;
                case -315634225:
                    if (str.equals("streamUrl")) {
                        b = 9;
                    }
                    break;
                case -257224164:
                    if (str.equals("coverPicUrl")) {
                        b = 10;
                    }
                    break;
                case -172220347:
                    if (str.equals("callback")) {
                        b = 11;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 12;
                    }
                    break;
                case 3506395:
                    if (str.equals("room")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 14;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        b = 15;
                    }
                    break;
                case 284874180:
                    if (str.equals("snapshot")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 405428811:
                    if (str.equals("videoCapture")) {
                        b = 17;
                    }
                    break;
                case 884554657:
                    if (str.equals("rewardPoint")) {
                        b = 18;
                    }
                    break;
                case 1108431579:
                    if (str.equals("streamCdnInfo")) {
                        b = 19;
                    }
                    break;
                case 1162036819:
                    if (str.equals("rewarderCount")) {
                        b = 20;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 21;
                    }
                    break;
                case 2065670015:
                    if (str.equals("redPacketIds")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    return true;
                case 12:
                    return false;
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    return true;
                default:
                    return super.parseFieldCheck(live, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Live live, JsonGenerator jsonGenerator) throws IOException {
            String str = live.f39615id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (live.room != null) {
                jsonGenerator.writeFieldName("room");
                Owner.JSON_ADAPTER.serialize(live.room, jsonGenerator, true);
            }
            if (live.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                Owner.JSON_ADAPTER.serialize(live.anchor, jsonGenerator, true);
            }
            if (live.streamUrl != null) {
                jsonGenerator.writeFieldName("streamUrl");
                StreamUrl.JSON_ADAPTER.serialize(live.streamUrl, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("rewardPoint", live.rewardPoint);
            jsonGenerator.writeNumberField("memberCount", live.memberCount);
            if (live.snapshot != null) {
                jsonGenerator.writeFieldName("snapshot");
                Converter.RAW_PICTURE_TO_MEDIA.serialize(live.snapshot, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(live.startTime), jsonGenerator, true);
            if (live.state != null) {
                jsonGenerator.writeFieldName("state");
                LiveState.JSON_ADAPTER.serialize(live.state, jsonGenerator, true);
            }
            String str2 = live.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (live.basicLabels != null) {
                jsonGenerator.writeFieldName("basicLabels");
                JsonAdapter.serializeArray(live.basicLabels, jsonGenerator, LiveBasicLabel.JSON_ADAPTER);
            }
            if (live.specialLabels != null) {
                jsonGenerator.writeFieldName("specialLabels");
                JsonAdapter.serializeArray(live.specialLabels, jsonGenerator, LiveSpecialLabel.JSON_ADAPTER);
            }
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(live.endTime), jsonGenerator, true);
            jsonGenerator.writeNumberField("messageCount", live.messageCount);
            jsonGenerator.writeNumberField("rewarderCount", live.rewarderCount);
            if (live.streamCdnInfo != null) {
                jsonGenerator.writeFieldName("streamCdnInfo");
                StreamCdnInfo.JSON_ADAPTER.serialize(live.streamCdnInfo, jsonGenerator, true);
            }
            if (live.recommendInfo != null) {
                jsonGenerator.writeFieldName("recommendInfo");
                RecommendInfo.JSON_ADAPTER.serialize(live.recommendInfo, jsonGenerator, true);
            }
            String str3 = live.source;
            if (str3 != null) {
                jsonGenerator.writeStringField("source", str3);
            }
            if (live.videoCapture != null) {
                jsonGenerator.writeFieldName("videoCapture");
                Converter.RAW_PICTURE_TO_MEDIA.serialize(live.videoCapture, jsonGenerator, true);
            }
            if (live.redPacketIds != null) {
                jsonGenerator.writeFieldName("redPacketIds");
                JsonAdapter.serializeArray(live.redPacketIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str4 = live.callback;
            if (str4 != null) {
                jsonGenerator.writeStringField("callback", str4);
            }
            jsonGenerator.writeBooleanField("whetherToBlur", live.whetherToBlur);
            if (live.coverPicUrl != null) {
                jsonGenerator.writeFieldName("coverPicUrl");
                Converter.RAW_PICTURE_TO_MEDIA.serialize(live.coverPicUrl, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Live) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Live) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m61011b(String str) {
        return str;
    }

    public static Live new_() {
        Live live = new Live();
        live.nullCheck();
        return live;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Live mo225055clone() {
        Live live = new Live();
        live.f39615id = this.f39615id;
        Owner owner = this.room;
        if (owner != null) {
            live.room = owner.mo225055clone();
        }
        Owner owner2 = this.anchor;
        if (owner2 != null) {
            live.anchor = owner2.mo225055clone();
        }
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl != null) {
            live.streamUrl = streamUrl.mo225055clone();
        }
        live.rewardPoint = this.rewardPoint;
        live.memberCount = this.memberCount;
        Media media = this.snapshot;
        if (media != null) {
            live.snapshot = media.mo225055clone();
        }
        live.startTime = this.startTime;
        live.state = this.state;
        live.type = this.type;
        List<LiveBasicLabel> list = this.basicLabels;
        if (list != null) {
            live.basicLabels = ValueObject.util_map(list, new qcj() { // from class: l.jqr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveBasicLabel) obj).mo225055clone();
                }
            });
        }
        List<LiveSpecialLabel> list2 = this.specialLabels;
        if (list2 != null) {
            live.specialLabels = ValueObject.util_map(list2, new qcj() { // from class: l.kqr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveSpecialLabel) obj).mo225055clone();
                }
            });
        }
        live.endTime = this.endTime;
        live.messageCount = this.messageCount;
        live.rewarderCount = this.rewarderCount;
        StreamCdnInfo streamCdnInfo = this.streamCdnInfo;
        if (streamCdnInfo != null) {
            live.streamCdnInfo = streamCdnInfo.mo225055clone();
        }
        RecommendInfo recommendInfo = this.recommendInfo;
        if (recommendInfo != null) {
            live.recommendInfo = recommendInfo.mo225055clone();
        }
        live.source = this.source;
        Media media2 = this.videoCapture;
        if (media2 != null) {
            live.videoCapture = media2.mo225055clone();
        }
        List<String> list3 = this.redPacketIds;
        if (list3 != null) {
            live.redPacketIds = ValueObject.util_map(list3, new qcj() { // from class: l.lqr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Live.m61011b((String) obj);
                }
            });
        }
        live.callback = this.callback;
        live.whetherToBlur = this.whetherToBlur;
        Media media3 = this.coverPicUrl;
        if (media3 != null) {
            live.coverPicUrl = media3.mo225055clone();
        }
        return live;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Live)) {
            return false;
        }
        Live live = (Live) obj;
        return ValueObject.util_equals(this.f39615id, live.f39615id) && ValueObject.util_equals(this.room, live.room) && ValueObject.util_equals(this.anchor, live.anchor) && ValueObject.util_equals(this.streamUrl, live.streamUrl) && this.rewardPoint == live.rewardPoint && this.memberCount == live.memberCount && ValueObject.util_equals(this.snapshot, live.snapshot) && this.startTime == live.startTime && ValueObject.util_equals(this.state, live.state) && ValueObject.util_equals(this.type, live.type) && ValueObject.util_equals(this.basicLabels, live.basicLabels) && ValueObject.util_equals(this.specialLabels, live.specialLabels) && this.endTime == live.endTime && this.messageCount == live.messageCount && this.rewarderCount == live.rewarderCount && ValueObject.util_equals(this.streamCdnInfo, live.streamCdnInfo) && ValueObject.util_equals(this.recommendInfo, live.recommendInfo) && ValueObject.util_equals(this.source, live.source) && ValueObject.util_equals(this.videoCapture, live.videoCapture) && ValueObject.util_equals(this.redPacketIds, live.redPacketIds) && ValueObject.util_equals(this.callback, live.callback) && this.whetherToBlur == live.whetherToBlur && ValueObject.util_equals(this.coverPicUrl, live.coverPicUrl);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "live";
    }

    public String getCoverUrl() {
        return this.snapshot.url;
    }

    public String getRecommendCategory() {
        return TextUtils.isEmpty(this.recommendInfo.category) ? "basic" : this.recommendInfo.category;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f39615id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Owner owner = this.room;
        int iHashCode2 = (iHashCode + (owner != null ? owner.hashCode() : 0)) * 41;
        Owner owner2 = this.anchor;
        int iHashCode3 = (iHashCode2 + (owner2 != null ? owner2.hashCode() : 0)) * 41;
        StreamUrl streamUrl = this.streamUrl;
        int iHashCode4 = streamUrl != null ? streamUrl.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.rewardPoint);
        int i3 = ((iHashCode3 + iHashCode4) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.memberCount);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        Media media = this.snapshot;
        int iHashCode5 = i4 + (media != null ? media.hashCode() : 0);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.startTime);
        int i5 = ((iHashCode5 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        LiveState liveState = this.state;
        int iHashCode6 = (i5 + (liveState != null ? liveState.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<LiveBasicLabel> list = this.basicLabels;
        int iHashCode8 = (iHashCode7 + (list != null ? list.hashCode() : 0)) * 41;
        List<LiveSpecialLabel> list2 = this.specialLabels;
        int iHashCode9 = iHashCode8 + (list2 != null ? list2.hashCode() : 0);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.endTime);
        int i6 = ((iHashCode9 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41;
        long j = this.messageCount;
        int i7 = i6 + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.rewarderCount);
        int i8 = ((i7 * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 41;
        StreamCdnInfo streamCdnInfo = this.streamCdnInfo;
        int iHashCode10 = (i8 + (streamCdnInfo != null ? streamCdnInfo.hashCode() : 0)) * 41;
        RecommendInfo recommendInfo = this.recommendInfo;
        int iHashCode11 = (iHashCode10 + (recommendInfo != null ? recommendInfo.hashCode() : 0)) * 41;
        String str3 = this.source;
        int iHashCode12 = (iHashCode11 + (str3 != null ? str3.hashCode() : 0)) * 41;
        Media media2 = this.videoCapture;
        int iHashCode13 = (iHashCode12 + (media2 != null ? media2.hashCode() : 0)) * 41;
        List<String> list3 = this.redPacketIds;
        int iHashCode14 = (iHashCode13 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str4 = this.callback;
        int iHashCode15 = (((iHashCode14 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.whetherToBlur ? 1231 : 1237)) * 41;
        Media media3 = this.coverPicUrl;
        int iHashCode16 = iHashCode15 + (media3 != null ? media3.hashCode() : 0);
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    public boolean isLiving() {
        return TEnum.equals(this.state, "onlive");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39615id == null) {
            this.f39615id = "";
        }
        if (this.room == null) {
            this.room = Owner.new_();
        }
        if (this.anchor == null) {
            this.anchor = Owner.new_();
        }
        if (this.streamUrl == null) {
            this.streamUrl = StreamUrl.new_();
        }
        if (this.state == null) {
            this.state = (LiveState) LiveState.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.basicLabels == null) {
            this.basicLabels = new ArrayList();
        }
        if (this.specialLabels == null) {
            this.specialLabels = new ArrayList();
        }
        if (this.streamCdnInfo == null) {
            this.streamCdnInfo = StreamCdnInfo.new_();
        }
        if (this.recommendInfo == null) {
            this.recommendInfo = RecommendInfo.new_();
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.redPacketIds == null) {
            this.redPacketIds = new ArrayList();
        }
        if (this.callback == null) {
            this.callback = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
