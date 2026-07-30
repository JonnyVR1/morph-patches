package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Converter;
import com.p000p1.mobile.putong.data.LiveBasicLabel;
import com.p000p1.mobile.putong.data.LiveRole;
import com.p000p1.mobile.putong.data.LiveSpecialLabel;
import com.p000p1.mobile.putong.data.LiveState;
import com.p000p1.mobile.putong.data.LiveUserMask;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.Room;
import com.p000p1.mobile.putong.data.StreamCdnInfo;
import com.p000p1.mobile.putong.data.StreamUrl;
import com.p000p1.mobile.putong.data.StudentVerRejectedReason;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.VoiceLiveExtension;
import com.p000p1.mobile.putong.data.VoiceLiveGame;
import com.p000p1.mobile.putong.data.VoiceRoomInfo;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.VoiceLive;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
    public String f711id;
    public Map<String, LiveUserMask> masksMap = new HashMap();

    @ProtobufIndex(index = 6)
    public double memberCount;

    @ProtobufIndex(index = 20)
    public double messageCount;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<String> messages;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceLive voiceLive) {
            String str = voiceLive.f711id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Owner owner = voiceLive.room;
            if (owner != null) {
                iO += CodedOutputByteBufferNano.l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            Owner owner2 = voiceLive.anchor;
            if (owner2 != null) {
                iO += CodedOutputByteBufferNano.l(3, owner2, Owner.PROTOBUF_ADAPTER);
            }
            StreamUrl streamUrl = voiceLive.streamUrl;
            if (streamUrl != null) {
                iO += CodedOutputByteBufferNano.l(4, streamUrl, StreamUrl.PROTOBUF_ADAPTER);
            }
            int iD = iO + CodedOutputByteBufferNano.d(5, voiceLive.rewardPoint) + CodedOutputByteBufferNano.d(6, voiceLive.memberCount) + CodedOutputByteBufferNano.d(7, voiceLive.startTime);
            LiveState liveState = voiceLive.state;
            if (liveState != null) {
                iD += CodedOutputByteBufferNano.h(8, liveState.ordinal());
            }
            String str2 = voiceLive.type;
            if (str2 != null) {
                iD += CodedOutputByteBufferNano.o(9, str2);
            }
            List<LiveBasicLabel> list = voiceLive.basicLabels;
            if (list != null) {
                iD += CodedOutputByteBufferNano.l(10, list, LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveSpecialLabel> list2 = voiceLive.specialLabels;
            if (list2 != null) {
                iD += CodedOutputByteBufferNano.l(11, list2, LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iD2 = iD + CodedOutputByteBufferNano.d(12, voiceLive.endTime);
            StreamCdnInfo streamCdnInfo = voiceLive.streamCdnInfo;
            if (streamCdnInfo != null) {
                iD2 += CodedOutputByteBufferNano.l(13, streamCdnInfo, StreamCdnInfo.PROTOBUF_ADAPTER);
            }
            String str3 = voiceLive.callback;
            if (str3 != null) {
                iD2 += CodedOutputByteBufferNano.o(14, str3);
            }
            String str4 = voiceLive.feedStyle;
            if (str4 != null) {
                iD2 += CodedOutputByteBufferNano.o(15, str4);
            }
            String str5 = voiceLive.momentText;
            if (str5 != null) {
                iD2 += CodedOutputByteBufferNano.o(16, str5);
            }
            List<String> list3 = voiceLive.messages;
            if (list3 != null) {
                iD2 += CodedOutputByteBufferNano.l(17, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            UserVoiceLiveCallInfo userVoiceLiveCallInfo = voiceLive.callInfo;
            if (userVoiceLiveCallInfo != null) {
                iD2 += CodedOutputByteBufferNano.l(18, userVoiceLiveCallInfo, UserVoiceLiveCallInfo.PROTOBUF_ADAPTER);
            }
            int iD3 = iD2 + CodedOutputByteBufferNano.d(19, voiceLive.rewarderCount) + CodedOutputByteBufferNano.d(20, voiceLive.messageCount);
            VoiceLiveExtension voiceLiveExtension = voiceLive.extension;
            if (voiceLiveExtension != null) {
                iD3 += CodedOutputByteBufferNano.l(21, voiceLiveExtension, VoiceLiveExtension.PROTOBUF_ADAPTER);
            }
            LiveState liveState2 = voiceLive.state;
            if (liveState2 != null) {
                iD3 += CodedOutputByteBufferNano.l(22, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
            ((MessageNano) voiceLive).cachedSize = iD3;
            return iD3;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceLive m19822parse(nb5 nb5Var) throws IOException {
            VoiceLive voiceLive = new VoiceLive();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (voiceLive.state == null && numValueOf != null) {
                            voiceLive.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (voiceLive.f711id == null) {
                            voiceLive.f711id = "";
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
                        voiceLive.f711id = nb5Var.s();
                        continue;
                    case 18:
                        voiceLive.room = (Owner) nb5Var.l(Owner.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        voiceLive.anchor = (Owner) nb5Var.l(Owner.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        voiceLive.streamUrl = (StreamUrl) nb5Var.l(StreamUrl.PROTOBUF_ADAPTER);
                        continue;
                    case 41:
                        voiceLive.rewardPoint = nb5Var.h();
                        continue;
                    case 49:
                        voiceLive.memberCount = nb5Var.h();
                        continue;
                    case 57:
                        voiceLive.startTime = nb5Var.h();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 74:
                        voiceLive.type = nb5Var.s();
                        continue;
                    case 82:
                        voiceLive.basicLabels = (List) nb5Var.l(LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        voiceLive.specialLabels = (List) nb5Var.l(LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 97:
                        voiceLive.endTime = nb5Var.h();
                        continue;
                    case 106:
                        voiceLive.streamCdnInfo = (StreamCdnInfo) nb5Var.l(StreamCdnInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        voiceLive.callback = nb5Var.s();
                        continue;
                    case 122:
                        voiceLive.feedStyle = nb5Var.s();
                        continue;
                    case 130:
                        voiceLive.momentText = nb5Var.s();
                        continue;
                    case 138:
                        voiceLive.messages = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 146:
                        voiceLive.callInfo = (UserVoiceLiveCallInfo) nb5Var.l(UserVoiceLiveCallInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 153:
                        voiceLive.rewarderCount = nb5Var.h();
                        continue;
                    case 161:
                        voiceLive.messageCount = nb5Var.h();
                        continue;
                    case 170:
                        voiceLive.extension = (VoiceLiveExtension) nb5Var.l(VoiceLiveExtension.PROTOBUF_ADAPTER);
                        continue;
                    case 178:
                        voiceLive.state = (LiveState) nb5Var.l(LiveState.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (voiceLive.state == null && numValueOf != null) {
                            voiceLive.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (voiceLive.f711id == null) {
                            voiceLive.f711id = "";
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

        public void serialize(VoiceLive voiceLive, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLive.f711id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Owner owner = voiceLive.room;
            if (owner != null) {
                codedOutputByteBufferNano.K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            Owner owner2 = voiceLive.anchor;
            if (owner2 != null) {
                codedOutputByteBufferNano.K(3, owner2, Owner.PROTOBUF_ADAPTER);
            }
            StreamUrl streamUrl = voiceLive.streamUrl;
            if (streamUrl != null) {
                codedOutputByteBufferNano.K(4, streamUrl, StreamUrl.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(5, voiceLive.rewardPoint);
            codedOutputByteBufferNano.C(6, voiceLive.memberCount);
            codedOutputByteBufferNano.C(7, voiceLive.startTime);
            LiveState liveState = voiceLive.state;
            if (liveState != null) {
                codedOutputByteBufferNano.G(8, liveState.ordinal());
            }
            String str2 = voiceLive.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(9, str2);
            }
            List<LiveBasicLabel> list = voiceLive.basicLabels;
            if (list != null) {
                codedOutputByteBufferNano.K(10, list, LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveSpecialLabel> list2 = voiceLive.specialLabels;
            if (list2 != null) {
                codedOutputByteBufferNano.K(11, list2, LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.C(12, voiceLive.endTime);
            StreamCdnInfo streamCdnInfo = voiceLive.streamCdnInfo;
            if (streamCdnInfo != null) {
                codedOutputByteBufferNano.K(13, streamCdnInfo, StreamCdnInfo.PROTOBUF_ADAPTER);
            }
            String str3 = voiceLive.callback;
            if (str3 != null) {
                codedOutputByteBufferNano.R(14, str3);
            }
            String str4 = voiceLive.feedStyle;
            if (str4 != null) {
                codedOutputByteBufferNano.R(15, str4);
            }
            String str5 = voiceLive.momentText;
            if (str5 != null) {
                codedOutputByteBufferNano.R(16, str5);
            }
            List<String> list3 = voiceLive.messages;
            if (list3 != null) {
                codedOutputByteBufferNano.K(17, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            UserVoiceLiveCallInfo userVoiceLiveCallInfo = voiceLive.callInfo;
            if (userVoiceLiveCallInfo != null) {
                codedOutputByteBufferNano.K(18, userVoiceLiveCallInfo, UserVoiceLiveCallInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(19, voiceLive.rewarderCount);
            codedOutputByteBufferNano.C(20, voiceLive.messageCount);
            VoiceLiveExtension voiceLiveExtension = voiceLive.extension;
            if (voiceLiveExtension != null) {
                codedOutputByteBufferNano.K(21, voiceLiveExtension, VoiceLiveExtension.PROTOBUF_ADAPTER);
            }
            LiveState liveState2 = voiceLive.state;
            if (liveState2 != null) {
                codedOutputByteBufferNano.K(22, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VoiceLive> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLive>() { // from class: com.p1.mobile.putong.feed.data.VoiceLive.2
        public Class getDataClass() {
            return VoiceLive.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VoiceLive mo17830newInstance() {
            return new VoiceLive();
        }

        public boolean parseField(VoiceLive voiceLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    voiceLive.startTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "feedStyle":
                    voiceLive.feedStyle = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    voiceLive.endTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "anchor":
                    voiceLive.anchor = (Owner) Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "messageCount":
                    voiceLive.messageCount = jsonParser.getValueAsDouble();
                    return true;
                case "specialLabels":
                    voiceLive.specialLabels = JsonAdapter.parseArray(jsonParser, LiveSpecialLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "basicLabels":
                    voiceLive.basicLabels = JsonAdapter.parseArray(jsonParser, LiveBasicLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "extension":
                    voiceLive.extension = (VoiceLiveExtension) VoiceLiveExtension.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "messages":
                    voiceLive.messages = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "streamUrl":
                    voiceLive.streamUrl = (StreamUrl) StreamUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "callInfo":
                    voiceLive.callInfo = (UserVoiceLiveCallInfo) UserVoiceLiveCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "callback":
                    voiceLive.callback = jsonParser.getValueAsString();
                    return true;
                case "id":
                    voiceLive.f711id = jsonParser.getValueAsString();
                    return false;
                case "room":
                    voiceLive.room = (Owner) Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    voiceLive.type = jsonParser.getValueAsString();
                    return true;
                case "state":
                    voiceLive.state = (LiveState) LiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "momentText":
                    voiceLive.momentText = jsonParser.getValueAsString();
                    return true;
                case "rewardPoint":
                    voiceLive.rewardPoint = jsonParser.getValueAsDouble();
                    return true;
                case "streamCdnInfo":
                    voiceLive.streamCdnInfo = (StreamCdnInfo) StreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "rewarderCount":
                    voiceLive.rewarderCount = jsonParser.getValueAsDouble();
                    return true;
                case "memberCount":
                    voiceLive.memberCount = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceLive voiceLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "feedStyle":
                case "endTime":
                case "anchor":
                case "messageCount":
                case "specialLabels":
                case "basicLabels":
                case "extension":
                case "messages":
                case "streamUrl":
                case "callInfo":
                case "callback":
                    return true;
                case "id":
                    return false;
                case "room":
                case "type":
                case "state":
                case "momentText":
                case "rewardPoint":
                case "streamCdnInfo":
                case "rewarderCount":
                case "memberCount":
                    return true;
                default:
                    return super.parseFieldCheck(voiceLive, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLive voiceLive, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLive.f711id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (voiceLive.room != null) {
                jsonGenerator.writeFieldName(Room.TYPE);
                Owner.JSON_ADAPTER.serialize(voiceLive.room, jsonGenerator, true);
            }
            if (voiceLive.anchor != null) {
                jsonGenerator.writeFieldName(LiveRole.anchor);
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
                jsonGenerator.writeFieldName(Channel.state);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m1840c(String str) {
        return str;
    }

    public static VoiceLive new_() {
        VoiceLive voiceLive = new VoiceLive();
        voiceLive.nullCheck();
        return voiceLive;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceLive m19821clone() {
        VoiceLive voiceLive = new VoiceLive();
        voiceLive.f711id = this.f711id;
        Owner owner = this.room;
        if (owner != null) {
            voiceLive.room = owner.m18761clone();
        }
        Owner owner2 = this.anchor;
        if (owner2 != null) {
            voiceLive.anchor = owner2.m18761clone();
        }
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl != null) {
            voiceLive.streamUrl = streamUrl.m19036clone();
        }
        voiceLive.rewardPoint = this.rewardPoint;
        voiceLive.memberCount = this.memberCount;
        voiceLive.startTime = this.startTime;
        voiceLive.state = this.state;
        voiceLive.type = this.type;
        List<LiveBasicLabel> list = this.basicLabels;
        if (list != null) {
            voiceLive.basicLabels = ValueObject.util_map(list, new w9j() { // from class: l.sjn0
                public final Object call(Object obj) {
                    return ((LiveBasicLabel) obj).m18330clone();
                }
            });
        }
        List<LiveSpecialLabel> list2 = this.specialLabels;
        if (list2 != null) {
            voiceLive.specialLabels = ValueObject.util_map(list2, new w9j() { // from class: l.tjn0
                public final Object call(Object obj) {
                    return ((LiveSpecialLabel) obj).m18378clone();
                }
            });
        }
        voiceLive.endTime = this.endTime;
        StreamCdnInfo streamCdnInfo = this.streamCdnInfo;
        if (streamCdnInfo != null) {
            voiceLive.streamCdnInfo = streamCdnInfo.m19033clone();
        }
        voiceLive.callback = this.callback;
        voiceLive.feedStyle = this.feedStyle;
        voiceLive.momentText = this.momentText;
        List<String> list3 = this.messages;
        if (list3 != null) {
            voiceLive.messages = ValueObject.util_map(list3, new w9j() { // from class: l.ujn0
                public final Object call(Object obj) {
                    return VoiceLive.m1840c((String) obj);
                }
            });
        }
        UserVoiceLiveCallInfo userVoiceLiveCallInfo = this.callInfo;
        if (userVoiceLiveCallInfo != null) {
            voiceLive.callInfo = userVoiceLiveCallInfo.m19815clone();
        }
        voiceLive.rewarderCount = this.rewarderCount;
        voiceLive.messageCount = this.messageCount;
        VoiceLiveExtension voiceLiveExtension = this.extension;
        if (voiceLiveExtension != null) {
            voiceLive.extension = voiceLiveExtension.m19343clone();
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
        return ValueObject.util_equals(this.f711id, voiceLive.f711id) && ValueObject.util_equals(this.room, voiceLive.room) && ValueObject.util_equals(this.anchor, voiceLive.anchor) && ValueObject.util_equals(this.streamUrl, voiceLive.streamUrl) && this.rewardPoint == voiceLive.rewardPoint && this.memberCount == voiceLive.memberCount && this.startTime == voiceLive.startTime && ValueObject.util_equals(this.state, voiceLive.state) && ValueObject.util_equals(this.type, voiceLive.type) && ValueObject.util_equals(this.basicLabels, voiceLive.basicLabels) && ValueObject.util_equals(this.specialLabels, voiceLive.specialLabels) && this.endTime == voiceLive.endTime && ValueObject.util_equals(this.streamCdnInfo, voiceLive.streamCdnInfo) && ValueObject.util_equals(this.callback, voiceLive.callback) && ValueObject.util_equals(this.feedStyle, voiceLive.feedStyle) && ValueObject.util_equals(this.momentText, voiceLive.momentText) && ValueObject.util_equals(this.messages, voiceLive.messages) && ValueObject.util_equals(this.callInfo, voiceLive.callInfo) && this.rewarderCount == voiceLive.rewarderCount && this.messageCount == voiceLive.messageCount && ValueObject.util_equals(this.extension, voiceLive.extension);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f711id;
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
        ((ValueObject) this).hashCode = iHashCode15;
        return iHashCode15;
    }

    public void nullCheck() {
        if (this.f711id == null) {
            this.f711id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
