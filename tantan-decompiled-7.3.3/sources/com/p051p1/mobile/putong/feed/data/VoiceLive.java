package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.LiveBasicLabel;
import com.p051p1.mobile.putong.data.LiveSpecialLabel;
import com.p051p1.mobile.putong.data.LiveState;
import com.p051p1.mobile.putong.data.LiveUserMask;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.StreamCdnInfo;
import com.p051p1.mobile.putong.data.StreamUrl;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VoiceLiveExtension;
import com.p051p1.mobile.putong.data.VoiceLiveGame;
import com.p051p1.mobile.putong.data.VoiceRoomInfo;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceLive extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelive";

    @NonNull
    @ProtobufIndex(index = 3)
    public Owner anchor;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<LiveBasicLabel> basicLabels;

    @NonNull
    @ProtobufIndex(index = 18)
    public UserVoiceLiveCallInfo callInfo;

    @NonNull
    @ProtobufIndex(index = 14)
    public String callback;

    @ProtobufIndex(index = 12)
    public double endTime;

    @NonNull
    @ProtobufIndex(index = 21)
    public VoiceLiveExtension extension;

    @NonNull
    @ProtobufIndex(index = 15)
    public String feedStyle;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40098id;
    public Map<String, LiveUserMask> masksMap = new HashMap();

    @ProtobufIndex(index = 6)
    public double memberCount;

    @ProtobufIndex(index = 20)
    public double messageCount;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<String> messages;

    @NonNull
    @ProtobufIndex(index = 16)
    public String momentText;

    @ProtobufIndex(index = 5)
    public double rewardPoint;

    @ProtobufIndex(index = 19)
    public double rewarderCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public Owner room;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<LiveSpecialLabel> specialLabels;

    @ProtobufIndex(index = 7)
    public double startTime;

    @NonNull
    @ProtobufIndex(index = 8)
    public LiveState state;

    @NonNull
    @ProtobufIndex(index = 13)
    public StreamCdnInfo streamCdnInfo;

    @NonNull
    @ProtobufIndex(index = 4)
    public StreamUrl streamUrl;

    @NonNull
    @ProtobufIndex(index = 9)
    public String type;
    public List<User> users;
    public VoiceLiveGame voiceLiveGame;
    public VoiceRoomInfo voiceRoomInfo;
    public static ProtobufAdapter<VoiceLive> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLive>() { // from class: com.p1.mobile.putong.feed.data.VoiceLive.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceLive voiceLive) {
            String str = voiceLive.f40098id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Owner owner = voiceLive.room;
            if (owner != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            Owner owner2 = voiceLive.anchor;
            if (owner2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, owner2, Owner.PROTOBUF_ADAPTER);
            }
            StreamUrl streamUrl = voiceLive.streamUrl;
            if (streamUrl != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, streamUrl, StreamUrl.PROTOBUF_ADAPTER);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(5, voiceLive.rewardPoint) + CodedOutputByteBufferNano.m17277d(6, voiceLive.memberCount) + CodedOutputByteBufferNano.m17277d(7, voiceLive.startTime);
            LiveState liveState = voiceLive.state;
            if (liveState != null) {
                iM17277d += CodedOutputByteBufferNano.m17281h(8, liveState.ordinal());
            }
            String str2 = voiceLive.type;
            if (str2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(9, str2);
            }
            List<LiveBasicLabel> list = voiceLive.basicLabels;
            if (list != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(10, list, LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveSpecialLabel> list2 = voiceLive.specialLabels;
            if (list2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(11, list2, LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17277d2 = iM17277d + CodedOutputByteBufferNano.m17277d(12, voiceLive.endTime);
            StreamCdnInfo streamCdnInfo = voiceLive.streamCdnInfo;
            if (streamCdnInfo != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17285l(13, streamCdnInfo, StreamCdnInfo.PROTOBUF_ADAPTER);
            }
            String str3 = voiceLive.callback;
            if (str3 != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17288o(14, str3);
            }
            String str4 = voiceLive.feedStyle;
            if (str4 != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17288o(15, str4);
            }
            String str5 = voiceLive.momentText;
            if (str5 != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17288o(16, str5);
            }
            List<String> list3 = voiceLive.messages;
            if (list3 != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17285l(17, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            UserVoiceLiveCallInfo userVoiceLiveCallInfo = voiceLive.callInfo;
            if (userVoiceLiveCallInfo != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17285l(18, userVoiceLiveCallInfo, UserVoiceLiveCallInfo.PROTOBUF_ADAPTER);
            }
            int iM17277d3 = iM17277d2 + CodedOutputByteBufferNano.m17277d(19, voiceLive.rewarderCount) + CodedOutputByteBufferNano.m17277d(20, voiceLive.messageCount);
            VoiceLiveExtension voiceLiveExtension = voiceLive.extension;
            if (voiceLiveExtension != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17285l(21, voiceLiveExtension, VoiceLiveExtension.PROTOBUF_ADAPTER);
            }
            LiveState liveState2 = voiceLive.state;
            if (liveState2 != null) {
                iM17277d3 += CodedOutputByteBufferNano.m17285l(22, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
            voiceLive.cachedSize = iM17277d3;
            return iM17277d3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceLive parse(nc5 nc5Var) throws IOException {
            VoiceLive voiceLive = new VoiceLive();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (voiceLive.state == null && numValueOf != null) {
                            voiceLive.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (voiceLive.f40098id == null) {
                            voiceLive.f40098id = "";
                        }
                        if (voiceLive.room == null) {
                            voiceLive.room = Owner.new_();
                        }
                        if (voiceLive.anchor == null) {
                            voiceLive.anchor = Owner.new_();
                        }
                        if (voiceLive.streamUrl == null) {
                            voiceLive.streamUrl = StreamUrl.new_();
                        }
                        if (voiceLive.state == null) {
                            voiceLive.state = (LiveState) LiveState.JSON_ADAPTER.defaultEnum();
                        }
                        if (voiceLive.type == null) {
                            voiceLive.type = "";
                        }
                        if (voiceLive.basicLabels == null) {
                            voiceLive.basicLabels = new ArrayList();
                        }
                        if (voiceLive.specialLabels == null) {
                            voiceLive.specialLabels = new ArrayList();
                        }
                        if (voiceLive.streamCdnInfo == null) {
                            voiceLive.streamCdnInfo = StreamCdnInfo.new_();
                        }
                        if (voiceLive.callback == null) {
                            voiceLive.callback = "";
                        }
                        if (voiceLive.feedStyle == null) {
                            voiceLive.feedStyle = "";
                        }
                        if (voiceLive.momentText == null) {
                            voiceLive.momentText = "";
                        }
                        if (voiceLive.messages == null) {
                            voiceLive.messages = new ArrayList();
                        }
                        if (voiceLive.callInfo == null) {
                            voiceLive.callInfo = UserVoiceLiveCallInfo.new_();
                        }
                        if (voiceLive.extension == null) {
                            voiceLive.extension = VoiceLiveExtension.new_();
                        }
                        break;
                    case 10:
                        voiceLive.f40098id = nc5Var.m162495s();
                        continue;
                    case 18:
                        voiceLive.room = (Owner) nc5Var.m162488l(Owner.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        voiceLive.anchor = (Owner) nc5Var.m162488l(Owner.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        voiceLive.streamUrl = (StreamUrl) nc5Var.m162488l(StreamUrl.PROTOBUF_ADAPTER);
                        continue;
                    case 41:
                        voiceLive.rewardPoint = nc5Var.m162484h();
                        continue;
                    case 49:
                        voiceLive.memberCount = nc5Var.m162484h();
                        continue;
                    case 57:
                        voiceLive.startTime = nc5Var.m162484h();
                        continue;
                    case 64:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 74:
                        voiceLive.type = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        voiceLive.basicLabels = (List) nc5Var.m162488l(LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        voiceLive.specialLabels = (List) nc5Var.m162488l(LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.APPLICATION_TEMPLATE /* 97 */:
                        voiceLive.endTime = nc5Var.m162484h();
                        continue;
                    case 106:
                        voiceLive.streamCdnInfo = (StreamCdnInfo) nc5Var.m162488l(StreamCdnInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        voiceLive.callback = nc5Var.m162495s();
                        continue;
                    case 122:
                        voiceLive.feedStyle = nc5Var.m162495s();
                        continue;
                    case 130:
                        voiceLive.momentText = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        voiceLive.messages = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        voiceLive.callInfo = (UserVoiceLiveCallInfo) nc5Var.m162488l(UserVoiceLiveCallInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 153:
                        voiceLive.rewarderCount = nc5Var.m162484h();
                        continue;
                    case 161:
                        voiceLive.messageCount = nc5Var.m162484h();
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        voiceLive.extension = (VoiceLiveExtension) nc5Var.m162488l(VoiceLiveExtension.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        voiceLive.state = (LiveState) nc5Var.m162488l(LiveState.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (voiceLive.state == null && numValueOf != null) {
                            voiceLive.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (voiceLive.f40098id == null) {
                            voiceLive.f40098id = "";
                        }
                        if (voiceLive.room == null) {
                            voiceLive.room = Owner.new_();
                        }
                        if (voiceLive.anchor == null) {
                            voiceLive.anchor = Owner.new_();
                        }
                        if (voiceLive.streamUrl == null) {
                            voiceLive.streamUrl = StreamUrl.new_();
                        }
                        if (voiceLive.state == null) {
                            voiceLive.state = (LiveState) LiveState.JSON_ADAPTER.defaultEnum();
                        }
                        if (voiceLive.type == null) {
                            voiceLive.type = "";
                        }
                        if (voiceLive.basicLabels == null) {
                            voiceLive.basicLabels = new ArrayList();
                        }
                        if (voiceLive.specialLabels == null) {
                            voiceLive.specialLabels = new ArrayList();
                        }
                        if (voiceLive.streamCdnInfo == null) {
                            voiceLive.streamCdnInfo = StreamCdnInfo.new_();
                        }
                        if (voiceLive.callback == null) {
                            voiceLive.callback = "";
                        }
                        if (voiceLive.feedStyle == null) {
                            voiceLive.feedStyle = "";
                        }
                        if (voiceLive.momentText == null) {
                            voiceLive.momentText = "";
                        }
                        if (voiceLive.messages == null) {
                            voiceLive.messages = new ArrayList();
                        }
                        if (voiceLive.callInfo == null) {
                            voiceLive.callInfo = UserVoiceLiveCallInfo.new_();
                        }
                        if (voiceLive.extension == null) {
                            voiceLive.extension = VoiceLiveExtension.new_();
                            return voiceLive;
                        }
                        break;
                }
            }
            return voiceLive;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceLive voiceLive, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLive.f40098id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Owner owner = voiceLive.room;
            if (owner != null) {
                codedOutputByteBufferNano.m17309K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            Owner owner2 = voiceLive.anchor;
            if (owner2 != null) {
                codedOutputByteBufferNano.m17309K(3, owner2, Owner.PROTOBUF_ADAPTER);
            }
            StreamUrl streamUrl = voiceLive.streamUrl;
            if (streamUrl != null) {
                codedOutputByteBufferNano.m17309K(4, streamUrl, StreamUrl.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17301C(5, voiceLive.rewardPoint);
            codedOutputByteBufferNano.m17301C(6, voiceLive.memberCount);
            codedOutputByteBufferNano.m17301C(7, voiceLive.startTime);
            LiveState liveState = voiceLive.state;
            if (liveState != null) {
                codedOutputByteBufferNano.m17305G(8, liveState.ordinal());
            }
            String str2 = voiceLive.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(9, str2);
            }
            List<LiveBasicLabel> list = voiceLive.basicLabels;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(10, list, LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveSpecialLabel> list2 = voiceLive.specialLabels;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(11, list2, LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17301C(12, voiceLive.endTime);
            StreamCdnInfo streamCdnInfo = voiceLive.streamCdnInfo;
            if (streamCdnInfo != null) {
                codedOutputByteBufferNano.m17309K(13, streamCdnInfo, StreamCdnInfo.PROTOBUF_ADAPTER);
            }
            String str3 = voiceLive.callback;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(14, str3);
            }
            String str4 = voiceLive.feedStyle;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(15, str4);
            }
            String str5 = voiceLive.momentText;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(16, str5);
            }
            List<String> list3 = voiceLive.messages;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(17, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            UserVoiceLiveCallInfo userVoiceLiveCallInfo = voiceLive.callInfo;
            if (userVoiceLiveCallInfo != null) {
                codedOutputByteBufferNano.m17309K(18, userVoiceLiveCallInfo, UserVoiceLiveCallInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17301C(19, voiceLive.rewarderCount);
            codedOutputByteBufferNano.m17301C(20, voiceLive.messageCount);
            VoiceLiveExtension voiceLiveExtension = voiceLive.extension;
            if (voiceLiveExtension != null) {
                codedOutputByteBufferNano.m17309K(21, voiceLiveExtension, VoiceLiveExtension.PROTOBUF_ADAPTER);
            }
            LiveState liveState2 = voiceLive.state;
            if (liveState2 != null) {
                codedOutputByteBufferNano.m17309K(22, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VoiceLive> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLive>() { // from class: com.p1.mobile.putong.feed.data.VoiceLive.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceLive.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceLive newInstance() {
            return new VoiceLive();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(VoiceLive voiceLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -1654842701:
                    if (str.equals("feedStyle")) {
                        b = 1;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 2;
                    }
                    break;
                case -1413299531:
                    if (str.equals("anchor")) {
                        b = 3;
                    }
                    break;
                case -1312076472:
                    if (str.equals("messageCount")) {
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
                case -612557761:
                    if (str.equals("extension")) {
                        b = 7;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 8;
                    }
                    break;
                case -315634225:
                    if (str.equals("streamUrl")) {
                        b = 9;
                    }
                    break;
                case -172952532:
                    if (str.equals("callInfo")) {
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
                case 686177101:
                    if (str.equals("momentText")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 884554657:
                    if (str.equals("rewardPoint")) {
                        b = 17;
                    }
                    break;
                case 1108431579:
                    if (str.equals("streamCdnInfo")) {
                        b = 18;
                    }
                    break;
                case 1162036819:
                    if (str.equals("rewarderCount")) {
                        b = 19;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 20;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    voiceLive.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 1:
                    voiceLive.feedStyle = jsonParser.getValueAsString();
                    return true;
                case 2:
                    voiceLive.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 3:
                    voiceLive.anchor = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    voiceLive.messageCount = jsonParser.getValueAsDouble();
                    return true;
                case 5:
                    voiceLive.specialLabels = JsonAdapter.parseArray(jsonParser, LiveSpecialLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    voiceLive.basicLabels = JsonAdapter.parseArray(jsonParser, LiveBasicLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    voiceLive.extension = VoiceLiveExtension.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    voiceLive.messages = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    voiceLive.streamUrl = StreamUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    voiceLive.callInfo = UserVoiceLiveCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    voiceLive.callback = jsonParser.getValueAsString();
                    return true;
                case 12:
                    voiceLive.f40098id = jsonParser.getValueAsString();
                    return false;
                case 13:
                    voiceLive.room = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    voiceLive.type = jsonParser.getValueAsString();
                    return true;
                case 15:
                    voiceLive.state = LiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 16:
                    voiceLive.momentText = jsonParser.getValueAsString();
                    return true;
                case 17:
                    voiceLive.rewardPoint = jsonParser.getValueAsDouble();
                    return true;
                case 18:
                    voiceLive.streamCdnInfo = StreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    voiceLive.rewarderCount = jsonParser.getValueAsDouble();
                    return true;
                case 20:
                    voiceLive.memberCount = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(VoiceLive voiceLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -1654842701:
                    if (str.equals("feedStyle")) {
                        b = 1;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 2;
                    }
                    break;
                case -1413299531:
                    if (str.equals("anchor")) {
                        b = 3;
                    }
                    break;
                case -1312076472:
                    if (str.equals("messageCount")) {
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
                case -612557761:
                    if (str.equals("extension")) {
                        b = 7;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 8;
                    }
                    break;
                case -315634225:
                    if (str.equals("streamUrl")) {
                        b = 9;
                    }
                    break;
                case -172952532:
                    if (str.equals("callInfo")) {
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
                case 686177101:
                    if (str.equals("momentText")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 884554657:
                    if (str.equals("rewardPoint")) {
                        b = 17;
                    }
                    break;
                case 1108431579:
                    if (str.equals("streamCdnInfo")) {
                        b = 18;
                    }
                    break;
                case 1162036819:
                    if (str.equals("rewarderCount")) {
                        b = 19;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 20;
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
                    return true;
                default:
                    return super.parseFieldCheck(voiceLive, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLive voiceLive, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLive.f40098id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (voiceLive.room != null) {
                jsonGenerator.writeFieldName("room");
                Owner.JSON_ADAPTER.serialize(voiceLive.room, jsonGenerator, true);
            }
            if (voiceLive.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                Owner.JSON_ADAPTER.serialize(voiceLive.anchor, jsonGenerator, true);
            }
            if (voiceLive.streamUrl != null) {
                jsonGenerator.writeFieldName("streamUrl");
                StreamUrl.JSON_ADAPTER.serialize(voiceLive.streamUrl, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("rewardPoint", voiceLive.rewardPoint);
            jsonGenerator.writeNumberField("memberCount", voiceLive.memberCount);
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(voiceLive.startTime), jsonGenerator, true);
            if (voiceLive.state != null) {
                jsonGenerator.writeFieldName("state");
                LiveState.JSON_ADAPTER.serialize(voiceLive.state, jsonGenerator, true);
            }
            String str2 = voiceLive.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (voiceLive.basicLabels != null) {
                jsonGenerator.writeFieldName("basicLabels");
                JsonAdapter.serializeArray(voiceLive.basicLabels, jsonGenerator, LiveBasicLabel.JSON_ADAPTER);
            }
            if (voiceLive.specialLabels != null) {
                jsonGenerator.writeFieldName("specialLabels");
                JsonAdapter.serializeArray(voiceLive.specialLabels, jsonGenerator, LiveSpecialLabel.JSON_ADAPTER);
            }
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(voiceLive.endTime), jsonGenerator, true);
            if (voiceLive.streamCdnInfo != null) {
                jsonGenerator.writeFieldName("streamCdnInfo");
                StreamCdnInfo.JSON_ADAPTER.serialize(voiceLive.streamCdnInfo, jsonGenerator, true);
            }
            String str3 = voiceLive.callback;
            if (str3 != null) {
                jsonGenerator.writeStringField("callback", str3);
            }
            String str4 = voiceLive.feedStyle;
            if (str4 != null) {
                jsonGenerator.writeStringField("feedStyle", str4);
            }
            String str5 = voiceLive.momentText;
            if (str5 != null) {
                jsonGenerator.writeStringField("momentText", str5);
            }
            if (voiceLive.messages != null) {
                jsonGenerator.writeFieldName("messages");
                JsonAdapter.serializeArray(voiceLive.messages, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (voiceLive.callInfo != null) {
                jsonGenerator.writeFieldName("callInfo");
                UserVoiceLiveCallInfo.JSON_ADAPTER.serialize(voiceLive.callInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("rewarderCount", voiceLive.rewarderCount);
            jsonGenerator.writeNumberField("messageCount", voiceLive.messageCount);
            if (voiceLive.extension != null) {
                jsonGenerator.writeFieldName("extension");
                VoiceLiveExtension.JSON_ADAPTER.serialize(voiceLive.extension, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m62098c(String str) {
        return str;
    }

    public static VoiceLive new_() {
        VoiceLive voiceLive = new VoiceLive();
        voiceLive.nullCheck();
        return voiceLive;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceLive mo225055clone() {
        VoiceLive voiceLive = new VoiceLive();
        voiceLive.f40098id = this.f40098id;
        Owner owner = this.room;
        if (owner != null) {
            voiceLive.room = owner.mo225055clone();
        }
        Owner owner2 = this.anchor;
        if (owner2 != null) {
            voiceLive.anchor = owner2.mo225055clone();
        }
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl != null) {
            voiceLive.streamUrl = streamUrl.mo225055clone();
        }
        voiceLive.rewardPoint = this.rewardPoint;
        voiceLive.memberCount = this.memberCount;
        voiceLive.startTime = this.startTime;
        voiceLive.state = this.state;
        voiceLive.type = this.type;
        List<LiveBasicLabel> list = this.basicLabels;
        if (list != null) {
            voiceLive.basicLabels = ValueObject.util_map(list, new qcj() { // from class: l.wsn0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveBasicLabel) obj).mo225055clone();
                }
            });
        }
        List<LiveSpecialLabel> list2 = this.specialLabels;
        if (list2 != null) {
            voiceLive.specialLabels = ValueObject.util_map(list2, new qcj() { // from class: l.xsn0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveSpecialLabel) obj).mo225055clone();
                }
            });
        }
        voiceLive.endTime = this.endTime;
        StreamCdnInfo streamCdnInfo = this.streamCdnInfo;
        if (streamCdnInfo != null) {
            voiceLive.streamCdnInfo = streamCdnInfo.mo225055clone();
        }
        voiceLive.callback = this.callback;
        voiceLive.feedStyle = this.feedStyle;
        voiceLive.momentText = this.momentText;
        List<String> list3 = this.messages;
        if (list3 != null) {
            voiceLive.messages = ValueObject.util_map(list3, new qcj() { // from class: l.ysn0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return VoiceLive.m62098c((String) obj);
                }
            });
        }
        UserVoiceLiveCallInfo userVoiceLiveCallInfo = this.callInfo;
        if (userVoiceLiveCallInfo != null) {
            voiceLive.callInfo = userVoiceLiveCallInfo.mo225055clone();
        }
        voiceLive.rewarderCount = this.rewarderCount;
        voiceLive.messageCount = this.messageCount;
        VoiceLiveExtension voiceLiveExtension = this.extension;
        if (voiceLiveExtension != null) {
            voiceLive.extension = voiceLiveExtension.mo225055clone();
        }
        return voiceLive;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceLive)) {
            return false;
        }
        VoiceLive voiceLive = (VoiceLive) obj;
        return ValueObject.util_equals(this.f40098id, voiceLive.f40098id) && ValueObject.util_equals(this.room, voiceLive.room) && ValueObject.util_equals(this.anchor, voiceLive.anchor) && ValueObject.util_equals(this.streamUrl, voiceLive.streamUrl) && this.rewardPoint == voiceLive.rewardPoint && this.memberCount == voiceLive.memberCount && this.startTime == voiceLive.startTime && ValueObject.util_equals(this.state, voiceLive.state) && ValueObject.util_equals(this.type, voiceLive.type) && ValueObject.util_equals(this.basicLabels, voiceLive.basicLabels) && ValueObject.util_equals(this.specialLabels, voiceLive.specialLabels) && this.endTime == voiceLive.endTime && ValueObject.util_equals(this.streamCdnInfo, voiceLive.streamCdnInfo) && ValueObject.util_equals(this.callback, voiceLive.callback) && ValueObject.util_equals(this.feedStyle, voiceLive.feedStyle) && ValueObject.util_equals(this.momentText, voiceLive.momentText) && ValueObject.util_equals(this.messages, voiceLive.messages) && ValueObject.util_equals(this.callInfo, voiceLive.callInfo) && this.rewarderCount == voiceLive.rewarderCount && this.messageCount == voiceLive.messageCount && ValueObject.util_equals(this.extension, voiceLive.extension);
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
        String str = this.f40098id;
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
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.startTime);
        int i5 = ((i4 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        LiveState liveState = this.state;
        int iHashCode5 = (i5 + (liveState != null ? liveState.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<LiveBasicLabel> list = this.basicLabels;
        int iHashCode7 = (iHashCode6 + (list != null ? list.hashCode() : 0)) * 41;
        List<LiveSpecialLabel> list2 = this.specialLabels;
        int iHashCode8 = iHashCode7 + (list2 != null ? list2.hashCode() : 0);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.endTime);
        int i6 = ((iHashCode8 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41;
        StreamCdnInfo streamCdnInfo = this.streamCdnInfo;
        int iHashCode9 = (i6 + (streamCdnInfo != null ? streamCdnInfo.hashCode() : 0)) * 41;
        String str3 = this.callback;
        int iHashCode10 = (iHashCode9 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.feedStyle;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.momentText;
        int iHashCode12 = (iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<String> list3 = this.messages;
        int iHashCode13 = (iHashCode12 + (list3 != null ? list3.hashCode() : 0)) * 41;
        UserVoiceLiveCallInfo userVoiceLiveCallInfo = this.callInfo;
        int iHashCode14 = iHashCode13 + (userVoiceLiveCallInfo != null ? userVoiceLiveCallInfo.hashCode() : 0);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.rewarderCount);
        int i7 = (iHashCode14 * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.messageCount);
        int i8 = ((i7 * 41) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 41;
        VoiceLiveExtension voiceLiveExtension = this.extension;
        int iHashCode15 = i8 + (voiceLiveExtension != null ? voiceLiveExtension.hashCode() : 0);
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40098id == null) {
            this.f40098id = "";
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
        if (this.callback == null) {
            this.callback = "";
        }
        if (this.feedStyle == null) {
            this.feedStyle = "";
        }
        if (this.momentText == null) {
            this.momentText = "";
        }
        if (this.messages == null) {
            this.messages = new ArrayList();
        }
        if (this.callInfo == null) {
            this.callInfo = UserVoiceLiveCallInfo.new_();
        }
        if (this.extension == null) {
            this.extension = VoiceLiveExtension.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
