package com.p000p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.LiveBasicLabel;
import com.p000p1.mobile.putong.data.LiveSpecialLabel;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
    public String f228id;

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
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Live live) {
            String str = live.f228id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Owner owner = live.room;
            if (owner != null) {
                iO += CodedOutputByteBufferNano.l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            Owner owner2 = live.anchor;
            if (owner2 != null) {
                iO += CodedOutputByteBufferNano.l(3, owner2, Owner.PROTOBUF_ADAPTER);
            }
            StreamUrl streamUrl = live.streamUrl;
            if (streamUrl != null) {
                iO += CodedOutputByteBufferNano.l(4, streamUrl, StreamUrl.PROTOBUF_ADAPTER);
            }
            int iD = iO + CodedOutputByteBufferNano.d(5, live.rewardPoint) + CodedOutputByteBufferNano.d(6, live.memberCount);
            Media media = live.snapshot;
            if (media != null) {
                iD += CodedOutputByteBufferNano.l(7, media, Media.PROTOBUF_ADAPTER);
            }
            int iD2 = iD + CodedOutputByteBufferNano.d(8, live.startTime);
            LiveState liveState = live.state;
            if (liveState != null) {
                iD2 += CodedOutputByteBufferNano.h(9, liveState.ordinal());
            }
            String str2 = live.type;
            if (str2 != null) {
                iD2 += CodedOutputByteBufferNano.o(10, str2);
            }
            List<LiveBasicLabel> list = live.basicLabels;
            if (list != null) {
                iD2 += CodedOutputByteBufferNano.l(11, list, LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveSpecialLabel> list2 = live.specialLabels;
            if (list2 != null) {
                iD2 += CodedOutputByteBufferNano.l(12, list2, LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iD3 = iD2 + CodedOutputByteBufferNano.d(13, live.endTime) + CodedOutputByteBufferNano.j(14, live.messageCount) + CodedOutputByteBufferNano.d(15, live.rewarderCount);
            StreamCdnInfo streamCdnInfo = live.streamCdnInfo;
            if (streamCdnInfo != null) {
                iD3 += CodedOutputByteBufferNano.l(16, streamCdnInfo, StreamCdnInfo.PROTOBUF_ADAPTER);
            }
            RecommendInfo recommendInfo = live.recommendInfo;
            if (recommendInfo != null) {
                iD3 += CodedOutputByteBufferNano.l(17, recommendInfo, RecommendInfo.PROTOBUF_ADAPTER);
            }
            String str3 = live.source;
            if (str3 != null) {
                iD3 += CodedOutputByteBufferNano.o(18, str3);
            }
            Media media2 = live.videoCapture;
            if (media2 != null) {
                iD3 += CodedOutputByteBufferNano.l(19, media2, Media.PROTOBUF_ADAPTER);
            }
            List<String> list3 = live.redPacketIds;
            if (list3 != null) {
                iD3 += CodedOutputByteBufferNano.l(20, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = live.callback;
            if (str4 != null) {
                iD3 += CodedOutputByteBufferNano.o(21, str4);
            }
            int iB = iD3 + CodedOutputByteBufferNano.b(22, live.whetherToBlur);
            Media media3 = live.coverPicUrl;
            if (media3 != null) {
                iB += CodedOutputByteBufferNano.l(23, media3, Media.PROTOBUF_ADAPTER);
            }
            LiveState liveState2 = live.state;
            if (liveState2 != null) {
                iB += CodedOutputByteBufferNano.l(24, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
            ((MessageNano) live).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Live m18304parse(nb5 nb5Var) throws IOException {
            Live live = new Live();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (live.state == null && numValueOf != null) {
                            live.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (live.f228id == null) {
                            live.f228id = "";
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
                        live.f228id = nb5Var.s();
                        continue;
                    case 18:
                        live.room = (Owner) nb5Var.l(Owner.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        live.anchor = (Owner) nb5Var.l(Owner.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        live.streamUrl = (StreamUrl) nb5Var.l(StreamUrl.PROTOBUF_ADAPTER);
                        continue;
                    case 41:
                        live.rewardPoint = nb5Var.h();
                        continue;
                    case 49:
                        live.memberCount = nb5Var.h();
                        continue;
                    case 58:
                        live.snapshot = (Media) nb5Var.l(Media.PROTOBUF_ADAPTER);
                        continue;
                    case 65:
                        live.startTime = nb5Var.h();
                        continue;
                    case 72:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 82:
                        live.type = nb5Var.s();
                        continue;
                    case 90:
                        live.basicLabels = (List) nb5Var.l(LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        live.specialLabels = (List) nb5Var.l(LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 105:
                        live.endTime = nb5Var.h();
                        continue;
                    case 112:
                        live.messageCount = nb5Var.k();
                        continue;
                    case 121:
                        live.rewarderCount = nb5Var.h();
                        continue;
                    case 130:
                        live.streamCdnInfo = (StreamCdnInfo) nb5Var.l(StreamCdnInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 138:
                        live.recommendInfo = (RecommendInfo) nb5Var.l(RecommendInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        live.source = nb5Var.s();
                        continue;
                    case 154:
                        live.videoCapture = (Media) nb5Var.l(Media.PROTOBUF_ADAPTER);
                        continue;
                    case 162:
                        live.redPacketIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 170:
                        live.callback = nb5Var.s();
                        continue;
                    case 176:
                        live.whetherToBlur = nb5Var.g();
                        continue;
                    case 186:
                        live.coverPicUrl = (Media) nb5Var.l(Media.PROTOBUF_ADAPTER);
                        continue;
                    case 194:
                        live.state = (LiveState) nb5Var.l(LiveState.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (live.state == null && numValueOf != null) {
                            live.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (live.f228id == null) {
                            live.f228id = "";
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

        public void serialize(Live live, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = live.f228id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Owner owner = live.room;
            if (owner != null) {
                codedOutputByteBufferNano.K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            Owner owner2 = live.anchor;
            if (owner2 != null) {
                codedOutputByteBufferNano.K(3, owner2, Owner.PROTOBUF_ADAPTER);
            }
            StreamUrl streamUrl = live.streamUrl;
            if (streamUrl != null) {
                codedOutputByteBufferNano.K(4, streamUrl, StreamUrl.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(5, live.rewardPoint);
            codedOutputByteBufferNano.C(6, live.memberCount);
            Media media = live.snapshot;
            if (media != null) {
                codedOutputByteBufferNano.K(7, media, Media.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(8, live.startTime);
            LiveState liveState = live.state;
            if (liveState != null) {
                codedOutputByteBufferNano.G(9, liveState.ordinal());
            }
            String str2 = live.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(10, str2);
            }
            List<LiveBasicLabel> list = live.basicLabels;
            if (list != null) {
                codedOutputByteBufferNano.K(11, list, LiveBasicLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveSpecialLabel> list2 = live.specialLabels;
            if (list2 != null) {
                codedOutputByteBufferNano.K(12, list2, LiveSpecialLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.C(13, live.endTime);
            codedOutputByteBufferNano.I(14, live.messageCount);
            codedOutputByteBufferNano.C(15, live.rewarderCount);
            StreamCdnInfo streamCdnInfo = live.streamCdnInfo;
            if (streamCdnInfo != null) {
                codedOutputByteBufferNano.K(16, streamCdnInfo, StreamCdnInfo.PROTOBUF_ADAPTER);
            }
            RecommendInfo recommendInfo = live.recommendInfo;
            if (recommendInfo != null) {
                codedOutputByteBufferNano.K(17, recommendInfo, RecommendInfo.PROTOBUF_ADAPTER);
            }
            String str3 = live.source;
            if (str3 != null) {
                codedOutputByteBufferNano.R(18, str3);
            }
            Media media2 = live.videoCapture;
            if (media2 != null) {
                codedOutputByteBufferNano.K(19, media2, Media.PROTOBUF_ADAPTER);
            }
            List<String> list3 = live.redPacketIds;
            if (list3 != null) {
                codedOutputByteBufferNano.K(20, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = live.callback;
            if (str4 != null) {
                codedOutputByteBufferNano.R(21, str4);
            }
            codedOutputByteBufferNano.A(22, live.whetherToBlur);
            Media media3 = live.coverPicUrl;
            if (media3 != null) {
                codedOutputByteBufferNano.K(23, media3, Media.PROTOBUF_ADAPTER);
            }
            LiveState liveState2 = live.state;
            if (liveState2 != null) {
                codedOutputByteBufferNano.K(24, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Live> JSON_ADAPTER = new ObjectJsonAdapter<Live>() { // from class: com.p1.mobile.putong.data.Live.2
        public Class getDataClass() {
            return Live.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Live mo17830newInstance() {
            return new Live();
        }

        public boolean parseField(Live live, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    live.startTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "endTime":
                    live.endTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "anchor":
                    live.anchor = (Owner) Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "messageCount":
                    live.messageCount = jsonParser.getValueAsLong();
                    return true;
                case "recommendInfo":
                    live.recommendInfo = (RecommendInfo) RecommendInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "specialLabels":
                    live.specialLabels = JsonAdapter.parseArray(jsonParser, LiveSpecialLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "basicLabels":
                    live.basicLabels = JsonAdapter.parseArray(jsonParser, LiveBasicLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "whetherToBlur":
                    live.whetherToBlur = jsonParser.getValueAsBoolean();
                    return true;
                case "source":
                    live.source = jsonParser.getValueAsString();
                    return true;
                case "streamUrl":
                    live.streamUrl = (StreamUrl) StreamUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "coverPicUrl":
                    live.coverPicUrl = (Media) Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case "callback":
                    live.callback = jsonParser.getValueAsString();
                    return true;
                case "id":
                    live.f228id = jsonParser.getValueAsString();
                    return false;
                case "room":
                    live.room = (Owner) Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    live.type = jsonParser.getValueAsString();
                    return true;
                case "state":
                    live.state = (LiveState) LiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "snapshot":
                    live.snapshot = (Media) Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case "videoCapture":
                    live.videoCapture = (Media) Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case "rewardPoint":
                    live.rewardPoint = jsonParser.getValueAsDouble();
                    return true;
                case "streamCdnInfo":
                    live.streamCdnInfo = (StreamCdnInfo) StreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "rewarderCount":
                    live.rewarderCount = jsonParser.getValueAsDouble();
                    return true;
                case "memberCount":
                    live.memberCount = jsonParser.getValueAsDouble();
                    return true;
                case "redPacketIds":
                    live.redPacketIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Live live, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "endTime":
                case "anchor":
                case "messageCount":
                case "recommendInfo":
                case "specialLabels":
                case "basicLabels":
                case "whetherToBlur":
                case "source":
                case "streamUrl":
                case "coverPicUrl":
                case "callback":
                    return true;
                case "id":
                    return false;
                case "room":
                case "type":
                case "state":
                case "snapshot":
                case "videoCapture":
                case "rewardPoint":
                case "streamCdnInfo":
                case "rewarderCount":
                case "memberCount":
                case "redPacketIds":
                    return true;
                default:
                    return super.parseFieldCheck(live, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Live live, JsonGenerator jsonGenerator) throws IOException {
            String str = live.f228id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (live.room != null) {
                jsonGenerator.writeFieldName(Room.TYPE);
                Owner.JSON_ADAPTER.serialize(live.room, jsonGenerator, true);
            }
            if (live.anchor != null) {
                jsonGenerator.writeFieldName(LiveRole.anchor);
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
                jsonGenerator.writeFieldName(Channel.state);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Live) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Live) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m745b(String str) {
        return str;
    }

    public static Live new_() {
        Live live = new Live();
        live.nullCheck();
        return live;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Live m18303clone() {
        Live live = new Live();
        live.f228id = this.f228id;
        Owner owner = this.room;
        if (owner != null) {
            live.room = owner.m18761clone();
        }
        Owner owner2 = this.anchor;
        if (owner2 != null) {
            live.anchor = owner2.m18761clone();
        }
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl != null) {
            live.streamUrl = streamUrl.m19036clone();
        }
        live.rewardPoint = this.rewardPoint;
        live.memberCount = this.memberCount;
        Media media = this.snapshot;
        if (media != null) {
            live.snapshot = media.mo17714clone();
        }
        live.startTime = this.startTime;
        live.state = this.state;
        live.type = this.type;
        List<LiveBasicLabel> list = this.basicLabels;
        if (list != null) {
            live.basicLabels = ValueObject.util_map(list, new w9j() { // from class: l.ior
                public final Object call(Object obj) {
                    return ((LiveBasicLabel) obj).m18330clone();
                }
            });
        }
        List<LiveSpecialLabel> list2 = this.specialLabels;
        if (list2 != null) {
            live.specialLabels = ValueObject.util_map(list2, new w9j() { // from class: l.jor
                public final Object call(Object obj) {
                    return ((LiveSpecialLabel) obj).m18378clone();
                }
            });
        }
        live.endTime = this.endTime;
        live.messageCount = this.messageCount;
        live.rewarderCount = this.rewarderCount;
        StreamCdnInfo streamCdnInfo = this.streamCdnInfo;
        if (streamCdnInfo != null) {
            live.streamCdnInfo = streamCdnInfo.m19033clone();
        }
        RecommendInfo recommendInfo = this.recommendInfo;
        if (recommendInfo != null) {
            live.recommendInfo = recommendInfo.m18871clone();
        }
        live.source = this.source;
        Media media2 = this.videoCapture;
        if (media2 != null) {
            live.videoCapture = media2.mo17714clone();
        }
        List<String> list3 = this.redPacketIds;
        if (list3 != null) {
            live.redPacketIds = ValueObject.util_map(list3, new w9j() { // from class: l.kor
                public final Object call(Object obj) {
                    return Live.m745b((String) obj);
                }
            });
        }
        live.callback = this.callback;
        live.whetherToBlur = this.whetherToBlur;
        Media media3 = this.coverPicUrl;
        if (media3 != null) {
            live.coverPicUrl = media3.mo17714clone();
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
        return ValueObject.util_equals(this.f228id, live.f228id) && ValueObject.util_equals(this.room, live.room) && ValueObject.util_equals(this.anchor, live.anchor) && ValueObject.util_equals(this.streamUrl, live.streamUrl) && this.rewardPoint == live.rewardPoint && this.memberCount == live.memberCount && ValueObject.util_equals(this.snapshot, live.snapshot) && this.startTime == live.startTime && ValueObject.util_equals(this.state, live.state) && ValueObject.util_equals(this.type, live.type) && ValueObject.util_equals(this.basicLabels, live.basicLabels) && ValueObject.util_equals(this.specialLabels, live.specialLabels) && this.endTime == live.endTime && this.messageCount == live.messageCount && this.rewarderCount == live.rewarderCount && ValueObject.util_equals(this.streamCdnInfo, live.streamCdnInfo) && ValueObject.util_equals(this.recommendInfo, live.recommendInfo) && ValueObject.util_equals(this.source, live.source) && ValueObject.util_equals(this.videoCapture, live.videoCapture) && ValueObject.util_equals(this.redPacketIds, live.redPacketIds) && ValueObject.util_equals(this.callback, live.callback) && this.whetherToBlur == live.whetherToBlur && ValueObject.util_equals(this.coverPicUrl, live.coverPicUrl);
    }

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
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f228id;
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
        ((ValueObject) this).hashCode = iHashCode16;
        return iHashCode16;
    }

    public boolean isLiving() {
        return TEnum.equals(this.state, "onlive");
    }

    public void nullCheck() {
        if (this.f228id == null) {
            this.f228id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
