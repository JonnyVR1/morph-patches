package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Position;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.CategoryTopic;
import com.p000p1.mobile.putong.feed.data.RecommendUsers;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
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
public class TopicOperations extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "topicoperations";

    @NonNull
    @ProtobufIndex(index = 5)
    public List<CategoryTopic> categoryTopic;

    @NonNull
    @ProtobufIndex(index = 12)
    public TopicOperationsGroup group;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f709id;

    @NonNull
    @ProtobufIndex(index = 15)
    public MomentViewerBox momentViewer;

    @NonNull
    @ProtobufIndex(index = 17)
    public MyTabPostGuide myTabPostGuide;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 11)
    public NearbyOnline nearbyOnline;

    @NonNull
    @ProtobufIndex(index = 4)
    public OperationType operationType;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public PoiGuide poiGuide;

    @ProtobufIndex(index = 3)
    public int position;

    @NonNull
    @ProtobufIndex(index = 7)
    public PostGuide postGuide;

    @NonNull
    @ProtobufIndex(index = 18)
    public PublishGuide publishGuide;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<String> recommendTopics;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<RecommendUsers> recommendUsers;

    @NonNull
    @ProtobufIndex(index = 14)
    public TopicOperationsGroup singleGroup;

    @NonNull
    @ProtobufIndex(index = 6)
    public SingleTopic singleTopic;

    @NonNull
    @ProtobufIndex(index = 13)
    public StateSquareEntrance stateSquareEntrance;
    public static ProtobufAdapter<TopicOperations> PROTOBUF_ADAPTER = new MessageNanoAdapter<TopicOperations>() { // from class: com.p1.mobile.putong.feed.data.TopicOperations.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TopicOperations topicOperations) {
            String str = topicOperations.f709id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = topicOperations.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, topicOperations.position);
            OperationType operationType = topicOperations.operationType;
            if (operationType != null) {
                iH += CodedOutputByteBufferNano.h(4, operationType.ordinal());
            }
            List<CategoryTopic> list = topicOperations.categoryTopic;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(5, list, CategoryTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SingleTopic singleTopic = topicOperations.singleTopic;
            if (singleTopic != null) {
                iH += CodedOutputByteBufferNano.l(6, singleTopic, SingleTopic.PROTOBUF_ADAPTER);
            }
            PostGuide postGuide = topicOperations.postGuide;
            if (postGuide != null) {
                iH += CodedOutputByteBufferNano.l(7, postGuide, PostGuide.PROTOBUF_ADAPTER);
            }
            OperationType operationType2 = topicOperations.operationType;
            if (operationType2 != null) {
                iH += CodedOutputByteBufferNano.l(8, operationType2, OperationType.PROTOBUF_ADAPTER);
            }
            List<RecommendUsers> list2 = topicOperations.recommendUsers;
            if (list2 != null) {
                iH += CodedOutputByteBufferNano.l(9, list2, RecommendUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = topicOperations.recommendTopics;
            if (list3 != null) {
                iH += CodedOutputByteBufferNano.l(10, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            NearbyOnline nearbyOnline = topicOperations.nearbyOnline;
            if (nearbyOnline != null) {
                iH += CodedOutputByteBufferNano.l(11, nearbyOnline, NearbyOnline.PROTOBUF_ADAPTER);
            }
            TopicOperationsGroup topicOperationsGroup = topicOperations.group;
            if (topicOperationsGroup != null) {
                iH += CodedOutputByteBufferNano.l(12, topicOperationsGroup, TopicOperationsGroup.PROTOBUF_ADAPTER);
            }
            StateSquareEntrance stateSquareEntrance = topicOperations.stateSquareEntrance;
            if (stateSquareEntrance != null) {
                iH += CodedOutputByteBufferNano.l(13, stateSquareEntrance, StateSquareEntrance.PROTOBUF_ADAPTER);
            }
            TopicOperationsGroup topicOperationsGroup2 = topicOperations.singleGroup;
            if (topicOperationsGroup2 != null) {
                iH += CodedOutputByteBufferNano.l(14, topicOperationsGroup2, TopicOperationsGroup.PROTOBUF_ADAPTER);
            }
            MomentViewerBox momentViewerBox = topicOperations.momentViewer;
            if (momentViewerBox != null) {
                iH += CodedOutputByteBufferNano.l(15, momentViewerBox, MomentViewerBox.PROTOBUF_ADAPTER);
            }
            PoiGuide poiGuide = topicOperations.poiGuide;
            if (poiGuide != null) {
                iH += CodedOutputByteBufferNano.l(16, poiGuide, PoiGuide.PROTOBUF_ADAPTER);
            }
            MyTabPostGuide myTabPostGuide = topicOperations.myTabPostGuide;
            if (myTabPostGuide != null) {
                iH += CodedOutputByteBufferNano.l(17, myTabPostGuide, MyTabPostGuide.PROTOBUF_ADAPTER);
            }
            PublishGuide publishGuide = topicOperations.publishGuide;
            if (publishGuide != null) {
                iH += CodedOutputByteBufferNano.l(18, publishGuide, PublishGuide.PROTOBUF_ADAPTER);
            }
            ((MessageNano) topicOperations).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TopicOperations m19798parse(nb5 nb5Var) throws IOException {
            TopicOperations topicOperations = new TopicOperations();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (topicOperations.operationType == null && numValueOf != null) {
                            topicOperations.operationType = (OperationType) OperationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (topicOperations.f709id == null) {
                            topicOperations.f709id = "";
                        }
                        if (topicOperations.name == null) {
                            topicOperations.name = "";
                        }
                        if (topicOperations.operationType == null) {
                            topicOperations.operationType = (OperationType) OperationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (topicOperations.categoryTopic == null) {
                            topicOperations.categoryTopic = new ArrayList();
                        }
                        if (topicOperations.singleTopic == null) {
                            topicOperations.singleTopic = SingleTopic.new_();
                        }
                        if (topicOperations.postGuide == null) {
                            topicOperations.postGuide = PostGuide.new_();
                        }
                        if (topicOperations.recommendUsers == null) {
                            topicOperations.recommendUsers = new ArrayList();
                        }
                        if (topicOperations.recommendTopics == null) {
                            topicOperations.recommendTopics = new ArrayList();
                        }
                        if (topicOperations.nearbyOnline == null) {
                            topicOperations.nearbyOnline = NearbyOnline.new_();
                        }
                        if (topicOperations.group == null) {
                            topicOperations.group = TopicOperationsGroup.new_();
                        }
                        if (topicOperations.stateSquareEntrance == null) {
                            topicOperations.stateSquareEntrance = StateSquareEntrance.new_();
                        }
                        if (topicOperations.singleGroup == null) {
                            topicOperations.singleGroup = TopicOperationsGroup.new_();
                        }
                        if (topicOperations.momentViewer == null) {
                            topicOperations.momentViewer = MomentViewerBox.new_();
                        }
                        if (topicOperations.poiGuide == null) {
                            topicOperations.poiGuide = PoiGuide.new_();
                        }
                        if (topicOperations.myTabPostGuide == null) {
                            topicOperations.myTabPostGuide = MyTabPostGuide.new_();
                        }
                        if (topicOperations.publishGuide == null) {
                            topicOperations.publishGuide = PublishGuide.new_();
                        }
                        break;
                    case 10:
                        topicOperations.f709id = nb5Var.s();
                        continue;
                    case 18:
                        topicOperations.name = nb5Var.s();
                        continue;
                    case 24:
                        topicOperations.position = nb5Var.j();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 42:
                        topicOperations.categoryTopic = (List) nb5Var.l(CategoryTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        topicOperations.singleTopic = (SingleTopic) nb5Var.l(SingleTopic.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        topicOperations.postGuide = (PostGuide) nb5Var.l(PostGuide.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        topicOperations.operationType = (OperationType) nb5Var.l(OperationType.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        topicOperations.recommendUsers = (List) nb5Var.l(RecommendUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 82:
                        topicOperations.recommendTopics = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        topicOperations.nearbyOnline = (NearbyOnline) nb5Var.l(NearbyOnline.PROTOBUF_ADAPTER);
                        continue;
                    case 98:
                        topicOperations.group = (TopicOperationsGroup) nb5Var.l(TopicOperationsGroup.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        topicOperations.stateSquareEntrance = (StateSquareEntrance) nb5Var.l(StateSquareEntrance.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        topicOperations.singleGroup = (TopicOperationsGroup) nb5Var.l(TopicOperationsGroup.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        topicOperations.momentViewer = (MomentViewerBox) nb5Var.l(MomentViewerBox.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        topicOperations.poiGuide = (PoiGuide) nb5Var.l(PoiGuide.PROTOBUF_ADAPTER);
                        continue;
                    case 138:
                        topicOperations.myTabPostGuide = (MyTabPostGuide) nb5Var.l(MyTabPostGuide.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        topicOperations.publishGuide = (PublishGuide) nb5Var.l(PublishGuide.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (topicOperations.operationType == null && numValueOf != null) {
                            topicOperations.operationType = (OperationType) OperationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (topicOperations.f709id == null) {
                            topicOperations.f709id = "";
                        }
                        if (topicOperations.name == null) {
                            topicOperations.name = "";
                        }
                        if (topicOperations.operationType == null) {
                            topicOperations.operationType = (OperationType) OperationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (topicOperations.categoryTopic == null) {
                            topicOperations.categoryTopic = new ArrayList();
                        }
                        if (topicOperations.singleTopic == null) {
                            topicOperations.singleTopic = SingleTopic.new_();
                        }
                        if (topicOperations.postGuide == null) {
                            topicOperations.postGuide = PostGuide.new_();
                        }
                        if (topicOperations.recommendUsers == null) {
                            topicOperations.recommendUsers = new ArrayList();
                        }
                        if (topicOperations.recommendTopics == null) {
                            topicOperations.recommendTopics = new ArrayList();
                        }
                        if (topicOperations.nearbyOnline == null) {
                            topicOperations.nearbyOnline = NearbyOnline.new_();
                        }
                        if (topicOperations.group == null) {
                            topicOperations.group = TopicOperationsGroup.new_();
                        }
                        if (topicOperations.stateSquareEntrance == null) {
                            topicOperations.stateSquareEntrance = StateSquareEntrance.new_();
                        }
                        if (topicOperations.singleGroup == null) {
                            topicOperations.singleGroup = TopicOperationsGroup.new_();
                        }
                        if (topicOperations.momentViewer == null) {
                            topicOperations.momentViewer = MomentViewerBox.new_();
                        }
                        if (topicOperations.poiGuide == null) {
                            topicOperations.poiGuide = PoiGuide.new_();
                        }
                        if (topicOperations.myTabPostGuide == null) {
                            topicOperations.myTabPostGuide = MyTabPostGuide.new_();
                        }
                        if (topicOperations.publishGuide == null) {
                            topicOperations.publishGuide = PublishGuide.new_();
                            return topicOperations;
                        }
                        break;
                }
            }
            return topicOperations;
        }

        public void serialize(TopicOperations topicOperations, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicOperations.f709id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = topicOperations.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, topicOperations.position);
            OperationType operationType = topicOperations.operationType;
            if (operationType != null) {
                codedOutputByteBufferNano.G(4, operationType.ordinal());
            }
            List<CategoryTopic> list = topicOperations.categoryTopic;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, CategoryTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SingleTopic singleTopic = topicOperations.singleTopic;
            if (singleTopic != null) {
                codedOutputByteBufferNano.K(6, singleTopic, SingleTopic.PROTOBUF_ADAPTER);
            }
            PostGuide postGuide = topicOperations.postGuide;
            if (postGuide != null) {
                codedOutputByteBufferNano.K(7, postGuide, PostGuide.PROTOBUF_ADAPTER);
            }
            OperationType operationType2 = topicOperations.operationType;
            if (operationType2 != null) {
                codedOutputByteBufferNano.K(8, operationType2, OperationType.PROTOBUF_ADAPTER);
            }
            List<RecommendUsers> list2 = topicOperations.recommendUsers;
            if (list2 != null) {
                codedOutputByteBufferNano.K(9, list2, RecommendUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = topicOperations.recommendTopics;
            if (list3 != null) {
                codedOutputByteBufferNano.K(10, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            NearbyOnline nearbyOnline = topicOperations.nearbyOnline;
            if (nearbyOnline != null) {
                codedOutputByteBufferNano.K(11, nearbyOnline, NearbyOnline.PROTOBUF_ADAPTER);
            }
            TopicOperationsGroup topicOperationsGroup = topicOperations.group;
            if (topicOperationsGroup != null) {
                codedOutputByteBufferNano.K(12, topicOperationsGroup, TopicOperationsGroup.PROTOBUF_ADAPTER);
            }
            StateSquareEntrance stateSquareEntrance = topicOperations.stateSquareEntrance;
            if (stateSquareEntrance != null) {
                codedOutputByteBufferNano.K(13, stateSquareEntrance, StateSquareEntrance.PROTOBUF_ADAPTER);
            }
            TopicOperationsGroup topicOperationsGroup2 = topicOperations.singleGroup;
            if (topicOperationsGroup2 != null) {
                codedOutputByteBufferNano.K(14, topicOperationsGroup2, TopicOperationsGroup.PROTOBUF_ADAPTER);
            }
            MomentViewerBox momentViewerBox = topicOperations.momentViewer;
            if (momentViewerBox != null) {
                codedOutputByteBufferNano.K(15, momentViewerBox, MomentViewerBox.PROTOBUF_ADAPTER);
            }
            PoiGuide poiGuide = topicOperations.poiGuide;
            if (poiGuide != null) {
                codedOutputByteBufferNano.K(16, poiGuide, PoiGuide.PROTOBUF_ADAPTER);
            }
            MyTabPostGuide myTabPostGuide = topicOperations.myTabPostGuide;
            if (myTabPostGuide != null) {
                codedOutputByteBufferNano.K(17, myTabPostGuide, MyTabPostGuide.PROTOBUF_ADAPTER);
            }
            PublishGuide publishGuide = topicOperations.publishGuide;
            if (publishGuide != null) {
                codedOutputByteBufferNano.K(18, publishGuide, PublishGuide.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TopicOperations> JSON_ADAPTER = new ObjectJsonAdapter<TopicOperations>() { // from class: com.p1.mobile.putong.feed.data.TopicOperations.2
        public Class getDataClass() {
            return TopicOperations.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TopicOperations mo17830newInstance() {
            return new TopicOperations();
        }

        public boolean parseField(TopicOperations topicOperations, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "momentViewer":
                    topicOperations.momentViewer = (MomentViewerBox) MomentViewerBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "publishGuide":
                    topicOperations.publishGuide = (PublishGuide) PublishGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "singleGroup":
                    topicOperations.singleGroup = (TopicOperationsGroup) TopicOperationsGroup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "singleTopic":
                    topicOperations.singleTopic = (SingleTopic) SingleTopic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "recommendUsers":
                    topicOperations.recommendUsers = JsonAdapter.parseArray(jsonParser, RecommendUsers.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "stateSquareEntrance":
                    topicOperations.stateSquareEntrance = (StateSquareEntrance) StateSquareEntrance.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "nearbyOnline":
                    topicOperations.nearbyOnline = (NearbyOnline) NearbyOnline.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    topicOperations.f709id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    topicOperations.name = jsonParser.getValueAsString();
                    return true;
                case "operationType":
                    topicOperations.operationType = (OperationType) OperationType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "group":
                    topicOperations.group = (TopicOperationsGroup) TopicOperationsGroup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "categoryTopic":
                    topicOperations.categoryTopic = JsonAdapter.parseArray(jsonParser, CategoryTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "poiGuide":
                    topicOperations.poiGuide = (PoiGuide) PoiGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "position":
                    topicOperations.position = jsonParser.getValueAsInt();
                    return true;
                case "myTabPostGuide":
                    topicOperations.myTabPostGuide = (MyTabPostGuide) MyTabPostGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "postGuide":
                    topicOperations.postGuide = (PostGuide) PostGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "recommendTopics":
                    topicOperations.recommendTopics = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TopicOperations topicOperations, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "momentViewer":
                case "publishGuide":
                case "singleGroup":
                case "singleTopic":
                case "recommendUsers":
                case "stateSquareEntrance":
                case "nearbyOnline":
                    return true;
                case "id":
                    return false;
                case "name":
                case "operationType":
                case "group":
                case "categoryTopic":
                case "poiGuide":
                case "position":
                case "myTabPostGuide":
                case "postGuide":
                case "recommendTopics":
                    return true;
                default:
                    return super.parseFieldCheck(topicOperations, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicOperations topicOperations, JsonGenerator jsonGenerator) throws IOException {
            String str = topicOperations.f709id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = topicOperations.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            jsonGenerator.writeNumberField(Position.TYPE, topicOperations.position);
            if (topicOperations.operationType != null) {
                jsonGenerator.writeFieldName("operationType");
                OperationType.JSON_ADAPTER.serialize(topicOperations.operationType, jsonGenerator, true);
            }
            if (topicOperations.categoryTopic != null) {
                jsonGenerator.writeFieldName("categoryTopic");
                JsonAdapter.serializeArray(topicOperations.categoryTopic, jsonGenerator, CategoryTopic.JSON_ADAPTER);
            }
            if (topicOperations.singleTopic != null) {
                jsonGenerator.writeFieldName("singleTopic");
                SingleTopic.JSON_ADAPTER.serialize(topicOperations.singleTopic, jsonGenerator, true);
            }
            if (topicOperations.postGuide != null) {
                jsonGenerator.writeFieldName("postGuide");
                PostGuide.JSON_ADAPTER.serialize(topicOperations.postGuide, jsonGenerator, true);
            }
            if (topicOperations.recommendUsers != null) {
                jsonGenerator.writeFieldName("recommendUsers");
                JsonAdapter.serializeArray(topicOperations.recommendUsers, jsonGenerator, RecommendUsers.JSON_ADAPTER);
            }
            if (topicOperations.recommendTopics != null) {
                jsonGenerator.writeFieldName("recommendTopics");
                JsonAdapter.serializeArray(topicOperations.recommendTopics, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (topicOperations.nearbyOnline != null) {
                jsonGenerator.writeFieldName("nearbyOnline");
                NearbyOnline.JSON_ADAPTER.serialize(topicOperations.nearbyOnline, jsonGenerator, true);
            }
            if (topicOperations.group != null) {
                jsonGenerator.writeFieldName("group");
                TopicOperationsGroup.JSON_ADAPTER.serialize(topicOperations.group, jsonGenerator, true);
            }
            if (topicOperations.stateSquareEntrance != null) {
                jsonGenerator.writeFieldName("stateSquareEntrance");
                StateSquareEntrance.JSON_ADAPTER.serialize(topicOperations.stateSquareEntrance, jsonGenerator, true);
            }
            if (topicOperations.singleGroup != null) {
                jsonGenerator.writeFieldName("singleGroup");
                TopicOperationsGroup.JSON_ADAPTER.serialize(topicOperations.singleGroup, jsonGenerator, true);
            }
            if (topicOperations.momentViewer != null) {
                jsonGenerator.writeFieldName("momentViewer");
                MomentViewerBox.JSON_ADAPTER.serialize(topicOperations.momentViewer, jsonGenerator, true);
            }
            if (topicOperations.poiGuide != null) {
                jsonGenerator.writeFieldName("poiGuide");
                PoiGuide.JSON_ADAPTER.serialize(topicOperations.poiGuide, jsonGenerator, true);
            }
            if (topicOperations.myTabPostGuide != null) {
                jsonGenerator.writeFieldName(OperationType.myTabPostGuide);
                MyTabPostGuide.JSON_ADAPTER.serialize(topicOperations.myTabPostGuide, jsonGenerator, true);
            }
            if (topicOperations.publishGuide != null) {
                jsonGenerator.writeFieldName("publishGuide");
                PublishGuide.JSON_ADAPTER.serialize(topicOperations.publishGuide, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicOperations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicOperations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1832a(String str) {
        return str;
    }

    public static TopicOperations new_() {
        TopicOperations topicOperations = new TopicOperations();
        topicOperations.nullCheck();
        return topicOperations;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TopicOperations m19797clone() {
        TopicOperations topicOperations = new TopicOperations();
        topicOperations.f709id = this.f709id;
        topicOperations.name = this.name;
        topicOperations.position = this.position;
        topicOperations.operationType = this.operationType;
        List<CategoryTopic> list = this.categoryTopic;
        if (list != null) {
            topicOperations.categoryTopic = ValueObject.util_map(list, new w9j() { // from class: l.j0j0
                public final Object call(Object obj) {
                    return ((CategoryTopic) obj).m19457clone();
                }
            });
        }
        SingleTopic singleTopic = this.singleTopic;
        if (singleTopic != null) {
            topicOperations.singleTopic = singleTopic.m19755clone();
        }
        PostGuide postGuide = this.postGuide;
        if (postGuide != null) {
            topicOperations.postGuide = postGuide.m19722clone();
        }
        List<RecommendUsers> list2 = this.recommendUsers;
        if (list2 != null) {
            topicOperations.recommendUsers = ValueObject.util_map(list2, new w9j() { // from class: l.k0j0
                public final Object call(Object obj) {
                    return ((RecommendUsers) obj).m19746clone();
                }
            });
        }
        List<String> list3 = this.recommendTopics;
        if (list3 != null) {
            topicOperations.recommendTopics = ValueObject.util_map(list3, new w9j() { // from class: l.l0j0
                public final Object call(Object obj) {
                    return TopicOperations.m1832a((String) obj);
                }
            });
        }
        NearbyOnline nearbyOnline = this.nearbyOnline;
        if (nearbyOnline != null) {
            topicOperations.nearbyOnline = nearbyOnline.m19674clone();
        }
        TopicOperationsGroup topicOperationsGroup = this.group;
        if (topicOperationsGroup != null) {
            topicOperations.group = topicOperationsGroup.m19800clone();
        }
        StateSquareEntrance stateSquareEntrance = this.stateSquareEntrance;
        if (stateSquareEntrance != null) {
            topicOperations.stateSquareEntrance = stateSquareEntrance.m19770clone();
        }
        TopicOperationsGroup topicOperationsGroup2 = this.singleGroup;
        if (topicOperationsGroup2 != null) {
            topicOperations.singleGroup = topicOperationsGroup2.m19800clone();
        }
        MomentViewerBox momentViewerBox = this.momentViewer;
        if (momentViewerBox != null) {
            topicOperations.momentViewer = momentViewerBox.m19656clone();
        }
        PoiGuide poiGuide = this.poiGuide;
        if (poiGuide != null) {
            topicOperations.poiGuide = poiGuide.m19707clone();
        }
        MyTabPostGuide myTabPostGuide = this.myTabPostGuide;
        if (myTabPostGuide != null) {
            topicOperations.myTabPostGuide = myTabPostGuide.m19671clone();
        }
        PublishGuide publishGuide = this.publishGuide;
        if (publishGuide != null) {
            topicOperations.publishGuide = publishGuide.m19725clone();
        }
        return topicOperations;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopicOperations)) {
            return false;
        }
        TopicOperations topicOperations = (TopicOperations) obj;
        return ValueObject.util_equals(this.f709id, topicOperations.f709id) && ValueObject.util_equals(this.name, topicOperations.name) && this.position == topicOperations.position && ValueObject.util_equals(this.operationType, topicOperations.operationType) && ValueObject.util_equals(this.categoryTopic, topicOperations.categoryTopic) && ValueObject.util_equals(this.singleTopic, topicOperations.singleTopic) && ValueObject.util_equals(this.postGuide, topicOperations.postGuide) && ValueObject.util_equals(this.recommendUsers, topicOperations.recommendUsers) && ValueObject.util_equals(this.recommendTopics, topicOperations.recommendTopics) && ValueObject.util_equals(this.nearbyOnline, topicOperations.nearbyOnline) && ValueObject.util_equals(this.group, topicOperations.group) && ValueObject.util_equals(this.stateSquareEntrance, topicOperations.stateSquareEntrance) && ValueObject.util_equals(this.singleGroup, topicOperations.singleGroup) && ValueObject.util_equals(this.momentViewer, topicOperations.momentViewer) && ValueObject.util_equals(this.poiGuide, topicOperations.poiGuide) && ValueObject.util_equals(this.myTabPostGuide, topicOperations.myTabPostGuide) && ValueObject.util_equals(this.publishGuide, topicOperations.publishGuide);
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
        String str = this.f709id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.position) * 41;
        OperationType operationType = this.operationType;
        int iHashCode3 = (iHashCode2 + (operationType != null ? operationType.hashCode() : 0)) * 41;
        List<CategoryTopic> list = this.categoryTopic;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        SingleTopic singleTopic = this.singleTopic;
        int iHashCode5 = (iHashCode4 + (singleTopic != null ? singleTopic.hashCode() : 0)) * 41;
        PostGuide postGuide = this.postGuide;
        int iHashCode6 = (iHashCode5 + (postGuide != null ? postGuide.hashCode() : 0)) * 41;
        List<RecommendUsers> list2 = this.recommendUsers;
        int iHashCode7 = (iHashCode6 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.recommendTopics;
        int iHashCode8 = (iHashCode7 + (list3 != null ? list3.hashCode() : 0)) * 41;
        NearbyOnline nearbyOnline = this.nearbyOnline;
        int iHashCode9 = (iHashCode8 + (nearbyOnline != null ? nearbyOnline.hashCode() : 0)) * 41;
        TopicOperationsGroup topicOperationsGroup = this.group;
        int iHashCode10 = (iHashCode9 + (topicOperationsGroup != null ? topicOperationsGroup.hashCode() : 0)) * 41;
        StateSquareEntrance stateSquareEntrance = this.stateSquareEntrance;
        int iHashCode11 = (iHashCode10 + (stateSquareEntrance != null ? stateSquareEntrance.hashCode() : 0)) * 41;
        TopicOperationsGroup topicOperationsGroup2 = this.singleGroup;
        int iHashCode12 = (iHashCode11 + (topicOperationsGroup2 != null ? topicOperationsGroup2.hashCode() : 0)) * 41;
        MomentViewerBox momentViewerBox = this.momentViewer;
        int iHashCode13 = (iHashCode12 + (momentViewerBox != null ? momentViewerBox.hashCode() : 0)) * 41;
        PoiGuide poiGuide = this.poiGuide;
        int iHashCode14 = (iHashCode13 + (poiGuide != null ? poiGuide.hashCode() : 0)) * 41;
        MyTabPostGuide myTabPostGuide = this.myTabPostGuide;
        int iHashCode15 = (iHashCode14 + (myTabPostGuide != null ? myTabPostGuide.hashCode() : 0)) * 41;
        PublishGuide publishGuide = this.publishGuide;
        int iHashCode16 = iHashCode15 + (publishGuide != null ? publishGuide.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode16;
        return iHashCode16;
    }

    public void nullCheck() {
        if (this.f709id == null) {
            this.f709id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.operationType == null) {
            this.operationType = (OperationType) OperationType.JSON_ADAPTER.defaultEnum();
        }
        if (this.categoryTopic == null) {
            this.categoryTopic = new ArrayList();
        }
        if (this.singleTopic == null) {
            this.singleTopic = SingleTopic.new_();
        }
        if (this.postGuide == null) {
            this.postGuide = PostGuide.new_();
        }
        if (this.recommendUsers == null) {
            this.recommendUsers = new ArrayList();
        }
        if (this.recommendTopics == null) {
            this.recommendTopics = new ArrayList();
        }
        if (this.nearbyOnline == null) {
            this.nearbyOnline = NearbyOnline.new_();
        }
        if (this.group == null) {
            this.group = TopicOperationsGroup.new_();
        }
        if (this.stateSquareEntrance == null) {
            this.stateSquareEntrance = StateSquareEntrance.new_();
        }
        if (this.singleGroup == null) {
            this.singleGroup = TopicOperationsGroup.new_();
        }
        if (this.momentViewer == null) {
            this.momentViewer = MomentViewerBox.new_();
        }
        if (this.poiGuide == null) {
            this.poiGuide = PoiGuide.new_();
        }
        if (this.myTabPostGuide == null) {
            this.myTabPostGuide = MyTabPostGuide.new_();
        }
        if (this.publishGuide == null) {
            this.publishGuide = PublishGuide.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
