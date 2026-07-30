package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LikeFilterSortType;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.CategoryTopic;
import com.p051p1.mobile.putong.feed.data.RecommendUsers;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
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

/* JADX INFO: loaded from: classes13.dex */
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
    public String f40096id;

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
    @ProtobufIndex(index = 16)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TopicOperations topicOperations) {
            String str = topicOperations.f40096id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = topicOperations.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, topicOperations.position);
            OperationType operationType = topicOperations.operationType;
            if (operationType != null) {
                iM17281h += CodedOutputByteBufferNano.m17281h(4, operationType.ordinal());
            }
            List<CategoryTopic> list = topicOperations.categoryTopic;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(5, list, CategoryTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SingleTopic singleTopic = topicOperations.singleTopic;
            if (singleTopic != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(6, singleTopic, SingleTopic.PROTOBUF_ADAPTER);
            }
            PostGuide postGuide = topicOperations.postGuide;
            if (postGuide != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(7, postGuide, PostGuide.PROTOBUF_ADAPTER);
            }
            OperationType operationType2 = topicOperations.operationType;
            if (operationType2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(8, operationType2, OperationType.PROTOBUF_ADAPTER);
            }
            List<RecommendUsers> list2 = topicOperations.recommendUsers;
            if (list2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(9, list2, RecommendUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = topicOperations.recommendTopics;
            if (list3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(10, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            NearbyOnline nearbyOnline = topicOperations.nearbyOnline;
            if (nearbyOnline != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(11, nearbyOnline, NearbyOnline.PROTOBUF_ADAPTER);
            }
            TopicOperationsGroup topicOperationsGroup = topicOperations.group;
            if (topicOperationsGroup != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(12, topicOperationsGroup, TopicOperationsGroup.PROTOBUF_ADAPTER);
            }
            StateSquareEntrance stateSquareEntrance = topicOperations.stateSquareEntrance;
            if (stateSquareEntrance != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(13, stateSquareEntrance, StateSquareEntrance.PROTOBUF_ADAPTER);
            }
            TopicOperationsGroup topicOperationsGroup2 = topicOperations.singleGroup;
            if (topicOperationsGroup2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(14, topicOperationsGroup2, TopicOperationsGroup.PROTOBUF_ADAPTER);
            }
            MomentViewerBox momentViewerBox = topicOperations.momentViewer;
            if (momentViewerBox != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(15, momentViewerBox, MomentViewerBox.PROTOBUF_ADAPTER);
            }
            PoiGuide poiGuide = topicOperations.poiGuide;
            if (poiGuide != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(16, poiGuide, PoiGuide.PROTOBUF_ADAPTER);
            }
            MyTabPostGuide myTabPostGuide = topicOperations.myTabPostGuide;
            if (myTabPostGuide != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(17, myTabPostGuide, MyTabPostGuide.PROTOBUF_ADAPTER);
            }
            PublishGuide publishGuide = topicOperations.publishGuide;
            if (publishGuide != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(18, publishGuide, PublishGuide.PROTOBUF_ADAPTER);
            }
            topicOperations.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TopicOperations parse(nc5 nc5Var) throws IOException {
            TopicOperations topicOperations = new TopicOperations();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (topicOperations.operationType == null && numValueOf != null) {
                            topicOperations.operationType = (OperationType) OperationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (topicOperations.f40096id == null) {
                            topicOperations.f40096id = "";
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
                        topicOperations.f40096id = nc5Var.m162495s();
                        continue;
                    case 18:
                        topicOperations.name = nc5Var.m162495s();
                        continue;
                    case 24:
                        topicOperations.position = nc5Var.m162486j();
                        continue;
                    case 32:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 42:
                        topicOperations.categoryTopic = (List) nc5Var.m162488l(CategoryTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        topicOperations.singleTopic = (SingleTopic) nc5Var.m162488l(SingleTopic.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        topicOperations.postGuide = (PostGuide) nc5Var.m162488l(PostGuide.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        topicOperations.operationType = (OperationType) nc5Var.m162488l(OperationType.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        topicOperations.recommendUsers = (List) nc5Var.m162488l(RecommendUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        topicOperations.recommendTopics = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        topicOperations.nearbyOnline = (NearbyOnline) nc5Var.m162488l(NearbyOnline.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        topicOperations.group = (TopicOperationsGroup) nc5Var.m162488l(TopicOperationsGroup.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        topicOperations.stateSquareEntrance = (StateSquareEntrance) nc5Var.m162488l(StateSquareEntrance.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        topicOperations.singleGroup = (TopicOperationsGroup) nc5Var.m162488l(TopicOperationsGroup.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        topicOperations.momentViewer = (MomentViewerBox) nc5Var.m162488l(MomentViewerBox.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        topicOperations.poiGuide = (PoiGuide) nc5Var.m162488l(PoiGuide.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        topicOperations.myTabPostGuide = (MyTabPostGuide) nc5Var.m162488l(MyTabPostGuide.PROTOBUF_ADAPTER);
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        topicOperations.publishGuide = (PublishGuide) nc5Var.m162488l(PublishGuide.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (topicOperations.operationType == null && numValueOf != null) {
                            topicOperations.operationType = (OperationType) OperationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (topicOperations.f40096id == null) {
                            topicOperations.f40096id = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TopicOperations topicOperations, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicOperations.f40096id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = topicOperations.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17305G(3, topicOperations.position);
            OperationType operationType = topicOperations.operationType;
            if (operationType != null) {
                codedOutputByteBufferNano.m17305G(4, operationType.ordinal());
            }
            List<CategoryTopic> list = topicOperations.categoryTopic;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(5, list, CategoryTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            SingleTopic singleTopic = topicOperations.singleTopic;
            if (singleTopic != null) {
                codedOutputByteBufferNano.m17309K(6, singleTopic, SingleTopic.PROTOBUF_ADAPTER);
            }
            PostGuide postGuide = topicOperations.postGuide;
            if (postGuide != null) {
                codedOutputByteBufferNano.m17309K(7, postGuide, PostGuide.PROTOBUF_ADAPTER);
            }
            OperationType operationType2 = topicOperations.operationType;
            if (operationType2 != null) {
                codedOutputByteBufferNano.m17309K(8, operationType2, OperationType.PROTOBUF_ADAPTER);
            }
            List<RecommendUsers> list2 = topicOperations.recommendUsers;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(9, list2, RecommendUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = topicOperations.recommendTopics;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(10, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            NearbyOnline nearbyOnline = topicOperations.nearbyOnline;
            if (nearbyOnline != null) {
                codedOutputByteBufferNano.m17309K(11, nearbyOnline, NearbyOnline.PROTOBUF_ADAPTER);
            }
            TopicOperationsGroup topicOperationsGroup = topicOperations.group;
            if (topicOperationsGroup != null) {
                codedOutputByteBufferNano.m17309K(12, topicOperationsGroup, TopicOperationsGroup.PROTOBUF_ADAPTER);
            }
            StateSquareEntrance stateSquareEntrance = topicOperations.stateSquareEntrance;
            if (stateSquareEntrance != null) {
                codedOutputByteBufferNano.m17309K(13, stateSquareEntrance, StateSquareEntrance.PROTOBUF_ADAPTER);
            }
            TopicOperationsGroup topicOperationsGroup2 = topicOperations.singleGroup;
            if (topicOperationsGroup2 != null) {
                codedOutputByteBufferNano.m17309K(14, topicOperationsGroup2, TopicOperationsGroup.PROTOBUF_ADAPTER);
            }
            MomentViewerBox momentViewerBox = topicOperations.momentViewer;
            if (momentViewerBox != null) {
                codedOutputByteBufferNano.m17309K(15, momentViewerBox, MomentViewerBox.PROTOBUF_ADAPTER);
            }
            PoiGuide poiGuide = topicOperations.poiGuide;
            if (poiGuide != null) {
                codedOutputByteBufferNano.m17309K(16, poiGuide, PoiGuide.PROTOBUF_ADAPTER);
            }
            MyTabPostGuide myTabPostGuide = topicOperations.myTabPostGuide;
            if (myTabPostGuide != null) {
                codedOutputByteBufferNano.m17309K(17, myTabPostGuide, MyTabPostGuide.PROTOBUF_ADAPTER);
            }
            PublishGuide publishGuide = topicOperations.publishGuide;
            if (publishGuide != null) {
                codedOutputByteBufferNano.m17309K(18, publishGuide, PublishGuide.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TopicOperations> JSON_ADAPTER = new ObjectJsonAdapter<TopicOperations>() { // from class: com.p1.mobile.putong.feed.data.TopicOperations.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TopicOperations.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TopicOperations newInstance() {
            return new TopicOperations();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(TopicOperations topicOperations, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1948377038:
                    if (str.equals("momentViewer")) {
                        b = 0;
                    }
                    break;
                case -1885765843:
                    if (str.equals("publishGuide")) {
                        b = 1;
                    }
                    break;
                case -1753944297:
                    if (str.equals("singleGroup")) {
                        b = 2;
                    }
                    break;
                case -1742027321:
                    if (str.equals("singleTopic")) {
                        b = 3;
                    }
                    break;
                case -1039752532:
                    if (str.equals("recommendUsers")) {
                        b = 4;
                    }
                    break;
                case -268789276:
                    if (str.equals("stateSquareEntrance")) {
                        b = 5;
                    }
                    break;
                case -185486926:
                    if (str.equals(LikeFilterSortType.nearbyOnline)) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 8;
                    }
                    break;
                case 91999553:
                    if (str.equals("operationType")) {
                        b = 9;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        b = 10;
                    }
                    break;
                case 328568529:
                    if (str.equals("categoryTopic")) {
                        b = 11;
                    }
                    break;
                case 430143186:
                    if (str.equals("poiGuide")) {
                        b = 12;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1240428019:
                    if (str.equals(OperationType.myTabPostGuide)) {
                        b = 14;
                    }
                    break;
                case 1980831292:
                    if (str.equals("postGuide")) {
                        b = 15;
                    }
                    break;
                case 2095405312:
                    if (str.equals("recommendTopics")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    topicOperations.momentViewer = MomentViewerBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    topicOperations.publishGuide = PublishGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    topicOperations.singleGroup = TopicOperationsGroup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    topicOperations.singleTopic = SingleTopic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    topicOperations.recommendUsers = JsonAdapter.parseArray(jsonParser, RecommendUsers.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    topicOperations.stateSquareEntrance = StateSquareEntrance.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    topicOperations.nearbyOnline = NearbyOnline.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    topicOperations.f40096id = jsonParser.getValueAsString();
                    return false;
                case 8:
                    topicOperations.name = jsonParser.getValueAsString();
                    return true;
                case 9:
                    topicOperations.operationType = OperationType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 10:
                    topicOperations.group = TopicOperationsGroup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    topicOperations.categoryTopic = JsonAdapter.parseArray(jsonParser, CategoryTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    topicOperations.poiGuide = PoiGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    topicOperations.position = jsonParser.getValueAsInt();
                    return true;
                case 14:
                    topicOperations.myTabPostGuide = MyTabPostGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    topicOperations.postGuide = PostGuide.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    topicOperations.recommendTopics = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(TopicOperations topicOperations, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1948377038:
                    if (str.equals("momentViewer")) {
                        b = 0;
                    }
                    break;
                case -1885765843:
                    if (str.equals("publishGuide")) {
                        b = 1;
                    }
                    break;
                case -1753944297:
                    if (str.equals("singleGroup")) {
                        b = 2;
                    }
                    break;
                case -1742027321:
                    if (str.equals("singleTopic")) {
                        b = 3;
                    }
                    break;
                case -1039752532:
                    if (str.equals("recommendUsers")) {
                        b = 4;
                    }
                    break;
                case -268789276:
                    if (str.equals("stateSquareEntrance")) {
                        b = 5;
                    }
                    break;
                case -185486926:
                    if (str.equals(LikeFilterSortType.nearbyOnline)) {
                        b = 6;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 7;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 8;
                    }
                    break;
                case 91999553:
                    if (str.equals("operationType")) {
                        b = 9;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        b = 10;
                    }
                    break;
                case 328568529:
                    if (str.equals("categoryTopic")) {
                        b = 11;
                    }
                    break;
                case 430143186:
                    if (str.equals("poiGuide")) {
                        b = 12;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1240428019:
                    if (str.equals(OperationType.myTabPostGuide)) {
                        b = 14;
                    }
                    break;
                case 1980831292:
                    if (str.equals("postGuide")) {
                        b = 15;
                    }
                    break;
                case 2095405312:
                    if (str.equals("recommendTopics")) {
                        b = Tnaf.POW_2_WIDTH;
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
                    return true;
                case 7:
                    return false;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    return true;
                default:
                    return super.parseFieldCheck(topicOperations, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicOperations topicOperations, JsonGenerator jsonGenerator) throws IOException {
            String str = topicOperations.f40096id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = topicOperations.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField("position", topicOperations.position);
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
                jsonGenerator.writeFieldName(LikeFilterSortType.nearbyOnline);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicOperations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicOperations) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62090a(String str) {
        return str;
    }

    public static TopicOperations new_() {
        TopicOperations topicOperations = new TopicOperations();
        topicOperations.nullCheck();
        return topicOperations;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TopicOperations mo225055clone() {
        TopicOperations topicOperations = new TopicOperations();
        topicOperations.f40096id = this.f40096id;
        topicOperations.name = this.name;
        topicOperations.position = this.position;
        topicOperations.operationType = this.operationType;
        List<CategoryTopic> list = this.categoryTopic;
        if (list != null) {
            topicOperations.categoryTopic = ValueObject.util_map(list, new qcj() { // from class: l.n9j0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((CategoryTopic) obj).mo225055clone();
                }
            });
        }
        SingleTopic singleTopic = this.singleTopic;
        if (singleTopic != null) {
            topicOperations.singleTopic = singleTopic.mo225055clone();
        }
        PostGuide postGuide = this.postGuide;
        if (postGuide != null) {
            topicOperations.postGuide = postGuide.mo225055clone();
        }
        List<RecommendUsers> list2 = this.recommendUsers;
        if (list2 != null) {
            topicOperations.recommendUsers = ValueObject.util_map(list2, new qcj() { // from class: l.o9j0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((RecommendUsers) obj).mo225055clone();
                }
            });
        }
        List<String> list3 = this.recommendTopics;
        if (list3 != null) {
            topicOperations.recommendTopics = ValueObject.util_map(list3, new qcj() { // from class: l.p9j0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TopicOperations.m62090a((String) obj);
                }
            });
        }
        NearbyOnline nearbyOnline = this.nearbyOnline;
        if (nearbyOnline != null) {
            topicOperations.nearbyOnline = nearbyOnline.mo225055clone();
        }
        TopicOperationsGroup topicOperationsGroup = this.group;
        if (topicOperationsGroup != null) {
            topicOperations.group = topicOperationsGroup.mo225055clone();
        }
        StateSquareEntrance stateSquareEntrance = this.stateSquareEntrance;
        if (stateSquareEntrance != null) {
            topicOperations.stateSquareEntrance = stateSquareEntrance.mo225055clone();
        }
        TopicOperationsGroup topicOperationsGroup2 = this.singleGroup;
        if (topicOperationsGroup2 != null) {
            topicOperations.singleGroup = topicOperationsGroup2.mo225055clone();
        }
        MomentViewerBox momentViewerBox = this.momentViewer;
        if (momentViewerBox != null) {
            topicOperations.momentViewer = momentViewerBox.mo225055clone();
        }
        PoiGuide poiGuide = this.poiGuide;
        if (poiGuide != null) {
            topicOperations.poiGuide = poiGuide.mo225055clone();
        }
        MyTabPostGuide myTabPostGuide = this.myTabPostGuide;
        if (myTabPostGuide != null) {
            topicOperations.myTabPostGuide = myTabPostGuide.mo225055clone();
        }
        PublishGuide publishGuide = this.publishGuide;
        if (publishGuide != null) {
            topicOperations.publishGuide = publishGuide.mo225055clone();
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
        return ValueObject.util_equals(this.f40096id, topicOperations.f40096id) && ValueObject.util_equals(this.name, topicOperations.name) && this.position == topicOperations.position && ValueObject.util_equals(this.operationType, topicOperations.operationType) && ValueObject.util_equals(this.categoryTopic, topicOperations.categoryTopic) && ValueObject.util_equals(this.singleTopic, topicOperations.singleTopic) && ValueObject.util_equals(this.postGuide, topicOperations.postGuide) && ValueObject.util_equals(this.recommendUsers, topicOperations.recommendUsers) && ValueObject.util_equals(this.recommendTopics, topicOperations.recommendTopics) && ValueObject.util_equals(this.nearbyOnline, topicOperations.nearbyOnline) && ValueObject.util_equals(this.group, topicOperations.group) && ValueObject.util_equals(this.stateSquareEntrance, topicOperations.stateSquareEntrance) && ValueObject.util_equals(this.singleGroup, topicOperations.singleGroup) && ValueObject.util_equals(this.momentViewer, topicOperations.momentViewer) && ValueObject.util_equals(this.poiGuide, topicOperations.poiGuide) && ValueObject.util_equals(this.myTabPostGuide, topicOperations.myTabPostGuide) && ValueObject.util_equals(this.publishGuide, topicOperations.publishGuide);
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
        String str = this.f40096id;
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
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40096id == null) {
            this.f40096id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
