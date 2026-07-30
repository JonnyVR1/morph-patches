package com.p000p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Converter;
import com.p000p1.mobile.putong.data.IdBoxed;
import com.p000p1.mobile.putong.data.Link;
import com.p000p1.mobile.putong.data.LinkIntent;
import com.p000p1.mobile.putong.data.MatchFrom;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.VoteOptions;
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
public class TopicMoment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "topicmoment";

    @ProtobufIndex(index = 21)
    public int activityUserCounter;

    @NonNull
    @ProtobufIndex(index = 22)
    public List<String> activityUserIds;

    @ProtobufIndex(index = 14)
    public int commentCounter;

    @ProtobufIndex(index = 27)
    public int consensusCounter;

    @NonNull
    @ProtobufIndex(index = 28)
    public List<String> consensusUserIds;

    @ProtobufIndex(index = 9)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String description;

    @Nullable
    @ProtobufIndex(index = 29)
    public TopicActivityDetail details;

    @NonNull
    @ProtobufIndex(index = 25)
    public GroupIdBox group;

    @NonNull
    @ProtobufIndex(index = 17)
    public String guideTab;

    @NonNull
    @ProtobufIndex(index = 18)
    public String headIcon;

    @ProtobufIndex(index = 20)
    public boolean hideOwner;

    @NonNull
    @ProtobufIndex(index = 5)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f708id;
    private boolean isEnterGroup = false;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public String landingPage;

    @ProtobufIndex(index = 11)
    public int momentCounter;
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @Nullable
    @ProtobufIndex(index = 15)
    public List<VoteOptions> options;

    @NonNull
    @ProtobufIndex(index = 2)
    public IdBoxed owner;

    @Nullable
    @ProtobufIndex(index = 8)
    public String priority;

    @ProtobufIndex(index = 12)
    public boolean selected;

    @Nullable
    @ProtobufIndex(index = 26)
    public TopicSource source;

    @NonNull
    @ProtobufIndex(index = 19)
    public List<String> sourceTabs;

    @NonNull
    @ProtobufIndex(index = 10)
    public String status;

    @NonNull
    @ProtobufIndex(index = 6)
    public String topicType;

    @NonNull
    @ProtobufIndex(index = 7)
    public String typeAlias;

    @ProtobufIndex(index = 24)
    public int userViewCounter;

    @ProtobufIndex(index = 23)
    public int viewCounter;

    @ProtobufIndex(index = 13)
    public int voteCounter;
    public static ProtobufAdapter<TopicMoment> PROTOBUF_ADAPTER = new MessageNanoAdapter<TopicMoment>() { // from class: com.p1.mobile.putong.feed.data.TopicMoment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TopicMoment topicMoment) {
            String str = topicMoment.f708id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            IdBoxed idBoxed = topicMoment.owner;
            if (idBoxed != null) {
                iO += CodedOutputByteBufferNano.l(2, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            String str2 = topicMoment.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = topicMoment.description;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = topicMoment.icon;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = topicMoment.topicType;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            String str6 = topicMoment.typeAlias;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(7, str6);
            }
            String str7 = topicMoment.priority;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(8, str7);
            }
            int iD = iO + CodedOutputByteBufferNano.d(9, topicMoment.createdTime);
            String str8 = topicMoment.status;
            if (str8 != null) {
                iD += CodedOutputByteBufferNano.o(10, str8);
            }
            int iH = iD + CodedOutputByteBufferNano.h(11, topicMoment.momentCounter) + CodedOutputByteBufferNano.b(12, topicMoment.selected) + CodedOutputByteBufferNano.h(13, topicMoment.voteCounter) + CodedOutputByteBufferNano.h(14, topicMoment.commentCounter);
            List<VoteOptions> list = topicMoment.options;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(15, list, VoteOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str9 = topicMoment.landingPage;
            if (str9 != null) {
                iH += CodedOutputByteBufferNano.o(16, str9);
            }
            String str10 = topicMoment.guideTab;
            if (str10 != null) {
                iH += CodedOutputByteBufferNano.o(17, str10);
            }
            String str11 = topicMoment.headIcon;
            if (str11 != null) {
                iH += CodedOutputByteBufferNano.o(18, str11);
            }
            List<String> list2 = topicMoment.sourceTabs;
            if (list2 != null) {
                iH += CodedOutputByteBufferNano.l(19, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iB = iH + CodedOutputByteBufferNano.b(20, topicMoment.hideOwner) + CodedOutputByteBufferNano.h(21, topicMoment.activityUserCounter);
            List<String> list3 = topicMoment.activityUserIds;
            if (list3 != null) {
                iB += CodedOutputByteBufferNano.l(22, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH2 = iB + CodedOutputByteBufferNano.h(23, topicMoment.viewCounter) + CodedOutputByteBufferNano.h(24, topicMoment.userViewCounter);
            GroupIdBox groupIdBox = topicMoment.group;
            if (groupIdBox != null) {
                iH2 += CodedOutputByteBufferNano.l(25, groupIdBox, GroupIdBox.PROTOBUF_ADAPTER);
            }
            TopicSource topicSource = topicMoment.source;
            if (topicSource != null) {
                iH2 += CodedOutputByteBufferNano.l(26, topicSource, TopicSource.PROTOBUF_ADAPTER);
            }
            int iH3 = iH2 + CodedOutputByteBufferNano.h(27, topicMoment.consensusCounter);
            List<String> list4 = topicMoment.consensusUserIds;
            if (list4 != null) {
                iH3 += CodedOutputByteBufferNano.l(28, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            TopicActivityDetail topicActivityDetail = topicMoment.details;
            if (topicActivityDetail != null) {
                iH3 += CodedOutputByteBufferNano.l(29, topicActivityDetail, TopicActivityDetail.PROTOBUF_ADAPTER);
            }
            ((MessageNano) topicMoment).cachedSize = iH3;
            return iH3;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TopicMoment m19795parse(nb5 nb5Var) throws IOException {
            TopicMoment topicMoment = new TopicMoment();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (topicMoment.f708id == null) {
                            topicMoment.f708id = "";
                        }
                        if (topicMoment.owner == null) {
                            topicMoment.owner = IdBoxed.new_();
                        }
                        if (topicMoment.name == null) {
                            topicMoment.name = "";
                        }
                        if (topicMoment.description == null) {
                            topicMoment.description = "";
                        }
                        if (topicMoment.icon == null) {
                            topicMoment.icon = "";
                        }
                        if (topicMoment.topicType == null) {
                            topicMoment.topicType = "";
                        }
                        if (topicMoment.typeAlias == null) {
                            topicMoment.typeAlias = "";
                        }
                        if (topicMoment.status == null) {
                            topicMoment.status = "";
                        }
                        if (topicMoment.landingPage == null) {
                            topicMoment.landingPage = "";
                        }
                        if (topicMoment.guideTab == null) {
                            topicMoment.guideTab = "";
                        }
                        if (topicMoment.headIcon == null) {
                            topicMoment.headIcon = "";
                        }
                        if (topicMoment.sourceTabs == null) {
                            topicMoment.sourceTabs = new ArrayList();
                        }
                        if (topicMoment.activityUserIds == null) {
                            topicMoment.activityUserIds = new ArrayList();
                        }
                        if (topicMoment.group == null) {
                            topicMoment.group = GroupIdBox.new_();
                        }
                        if (topicMoment.consensusUserIds == null) {
                            topicMoment.consensusUserIds = new ArrayList();
                        }
                        break;
                    case 10:
                        topicMoment.f708id = nb5Var.s();
                        continue;
                    case 18:
                        topicMoment.owner = (IdBoxed) nb5Var.l(IdBoxed.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        topicMoment.name = nb5Var.s();
                        continue;
                    case 34:
                        topicMoment.description = nb5Var.s();
                        continue;
                    case 42:
                        topicMoment.icon = nb5Var.s();
                        continue;
                    case 50:
                        topicMoment.topicType = nb5Var.s();
                        continue;
                    case 58:
                        topicMoment.typeAlias = nb5Var.s();
                        continue;
                    case 66:
                        topicMoment.priority = nb5Var.s();
                        continue;
                    case 73:
                        topicMoment.createdTime = nb5Var.h();
                        continue;
                    case 82:
                        topicMoment.status = nb5Var.s();
                        continue;
                    case 88:
                        topicMoment.momentCounter = nb5Var.j();
                        continue;
                    case 96:
                        topicMoment.selected = nb5Var.g();
                        continue;
                    case 104:
                        topicMoment.voteCounter = nb5Var.j();
                        continue;
                    case 112:
                        topicMoment.commentCounter = nb5Var.j();
                        continue;
                    case 122:
                        topicMoment.options = (List) nb5Var.l(VoteOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 130:
                        topicMoment.landingPage = nb5Var.s();
                        continue;
                    case 138:
                        topicMoment.guideTab = nb5Var.s();
                        continue;
                    case 146:
                        topicMoment.headIcon = nb5Var.s();
                        continue;
                    case 154:
                        topicMoment.sourceTabs = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 160:
                        topicMoment.hideOwner = nb5Var.g();
                        continue;
                    case 168:
                        topicMoment.activityUserCounter = nb5Var.j();
                        continue;
                    case 178:
                        topicMoment.activityUserIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 184:
                        topicMoment.viewCounter = nb5Var.j();
                        continue;
                    case 192:
                        topicMoment.userViewCounter = nb5Var.j();
                        continue;
                    case 202:
                        topicMoment.group = (GroupIdBox) nb5Var.l(GroupIdBox.PROTOBUF_ADAPTER);
                        continue;
                    case 210:
                        topicMoment.source = (TopicSource) nb5Var.l(TopicSource.PROTOBUF_ADAPTER);
                        continue;
                    case 216:
                        topicMoment.consensusCounter = nb5Var.j();
                        continue;
                    case 226:
                        topicMoment.consensusUserIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 234:
                        topicMoment.details = (TopicActivityDetail) nb5Var.l(TopicActivityDetail.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (topicMoment.f708id == null) {
                            topicMoment.f708id = "";
                        }
                        if (topicMoment.owner == null) {
                            topicMoment.owner = IdBoxed.new_();
                        }
                        if (topicMoment.name == null) {
                            topicMoment.name = "";
                        }
                        if (topicMoment.description == null) {
                            topicMoment.description = "";
                        }
                        if (topicMoment.icon == null) {
                            topicMoment.icon = "";
                        }
                        if (topicMoment.topicType == null) {
                            topicMoment.topicType = "";
                        }
                        if (topicMoment.typeAlias == null) {
                            topicMoment.typeAlias = "";
                        }
                        if (topicMoment.status == null) {
                            topicMoment.status = "";
                        }
                        if (topicMoment.landingPage == null) {
                            topicMoment.landingPage = "";
                        }
                        if (topicMoment.guideTab == null) {
                            topicMoment.guideTab = "";
                        }
                        if (topicMoment.headIcon == null) {
                            topicMoment.headIcon = "";
                        }
                        if (topicMoment.sourceTabs == null) {
                            topicMoment.sourceTabs = new ArrayList();
                        }
                        if (topicMoment.activityUserIds == null) {
                            topicMoment.activityUserIds = new ArrayList();
                        }
                        if (topicMoment.group == null) {
                            topicMoment.group = GroupIdBox.new_();
                        }
                        if (topicMoment.consensusUserIds == null) {
                            topicMoment.consensusUserIds = new ArrayList();
                            return topicMoment;
                        }
                        break;
                }
            }
            return topicMoment;
        }

        public void serialize(TopicMoment topicMoment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicMoment.f708id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            IdBoxed idBoxed = topicMoment.owner;
            if (idBoxed != null) {
                codedOutputByteBufferNano.K(2, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            String str2 = topicMoment.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = topicMoment.description;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = topicMoment.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = topicMoment.topicType;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            String str6 = topicMoment.typeAlias;
            if (str6 != null) {
                codedOutputByteBufferNano.R(7, str6);
            }
            String str7 = topicMoment.priority;
            if (str7 != null) {
                codedOutputByteBufferNano.R(8, str7);
            }
            codedOutputByteBufferNano.C(9, topicMoment.createdTime);
            String str8 = topicMoment.status;
            if (str8 != null) {
                codedOutputByteBufferNano.R(10, str8);
            }
            codedOutputByteBufferNano.G(11, topicMoment.momentCounter);
            codedOutputByteBufferNano.A(12, topicMoment.selected);
            codedOutputByteBufferNano.G(13, topicMoment.voteCounter);
            codedOutputByteBufferNano.G(14, topicMoment.commentCounter);
            List<VoteOptions> list = topicMoment.options;
            if (list != null) {
                codedOutputByteBufferNano.K(15, list, VoteOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str9 = topicMoment.landingPage;
            if (str9 != null) {
                codedOutputByteBufferNano.R(16, str9);
            }
            String str10 = topicMoment.guideTab;
            if (str10 != null) {
                codedOutputByteBufferNano.R(17, str10);
            }
            String str11 = topicMoment.headIcon;
            if (str11 != null) {
                codedOutputByteBufferNano.R(18, str11);
            }
            List<String> list2 = topicMoment.sourceTabs;
            if (list2 != null) {
                codedOutputByteBufferNano.K(19, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(20, topicMoment.hideOwner);
            codedOutputByteBufferNano.G(21, topicMoment.activityUserCounter);
            List<String> list3 = topicMoment.activityUserIds;
            if (list3 != null) {
                codedOutputByteBufferNano.K(22, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(23, topicMoment.viewCounter);
            codedOutputByteBufferNano.G(24, topicMoment.userViewCounter);
            GroupIdBox groupIdBox = topicMoment.group;
            if (groupIdBox != null) {
                codedOutputByteBufferNano.K(25, groupIdBox, GroupIdBox.PROTOBUF_ADAPTER);
            }
            TopicSource topicSource = topicMoment.source;
            if (topicSource != null) {
                codedOutputByteBufferNano.K(26, topicSource, TopicSource.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(27, topicMoment.consensusCounter);
            List<String> list4 = topicMoment.consensusUserIds;
            if (list4 != null) {
                codedOutputByteBufferNano.K(28, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            TopicActivityDetail topicActivityDetail = topicMoment.details;
            if (topicActivityDetail != null) {
                codedOutputByteBufferNano.K(29, topicActivityDetail, TopicActivityDetail.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TopicMoment> JSON_ADAPTER = new ObjectJsonAdapter<TopicMoment>() { // from class: com.p1.mobile.putong.feed.data.TopicMoment.2
        public Class getDataClass() {
            return TopicMoment.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TopicMoment mo17830newInstance() {
            return new TopicMoment();
        }

        public boolean parseField(TopicMoment topicMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    topicMoment.description = jsonParser.getValueAsString();
                    return true;
                case "userViewCounter":
                    topicMoment.userViewCounter = jsonParser.getValueAsInt();
                    return true;
                case "guideTab":
                    topicMoment.guideTab = jsonParser.getValueAsString();
                    return true;
                case "options":
                    topicMoment.options = JsonAdapter.parseArray(jsonParser, VoteOptions.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "priority":
                    topicMoment.priority = jsonParser.getValueAsString();
                    return true;
                case "headIcon":
                    topicMoment.headIcon = jsonParser.getValueAsString();
                    return true;
                case "sourceTabs":
                    topicMoment.sourceTabs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "source":
                    topicMoment.source = (TopicSource) TopicSource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    topicMoment.status = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    topicMoment.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "consensusUserIds":
                    topicMoment.consensusUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    topicMoment.f708id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    topicMoment.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    topicMoment.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    topicMoment.typeAlias = jsonParser.getValueAsString();
                    return true;
                case "group":
                    topicMoment.group = (GroupIdBox) GroupIdBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    topicMoment.owner = (IdBoxed) IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "momentCounter":
                    topicMoment.momentCounter = jsonParser.getValueAsInt();
                    return true;
                case "activityUserIds":
                    topicMoment.activityUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "topicType":
                    topicMoment.topicType = jsonParser.getValueAsString();
                    return true;
                case "landingPage":
                    topicMoment.landingPage = jsonParser.getValueAsString();
                    return true;
                case "consensusCounter":
                    topicMoment.consensusCounter = jsonParser.getValueAsInt();
                    return true;
                case "hideOwner":
                    topicMoment.hideOwner = jsonParser.getValueAsBoolean();
                    return true;
                case "commentCounter":
                    topicMoment.commentCounter = jsonParser.getValueAsInt();
                    return true;
                case "viewCounter":
                    topicMoment.viewCounter = jsonParser.getValueAsInt();
                    return true;
                case "selected":
                    topicMoment.selected = jsonParser.getValueAsBoolean();
                    return true;
                case "activityUserCounter":
                    topicMoment.activityUserCounter = jsonParser.getValueAsInt();
                    return true;
                case "voteCounter":
                    topicMoment.voteCounter = jsonParser.getValueAsInt();
                    return true;
                case "details":
                    topicMoment.details = (TopicActivityDetail) TopicActivityDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TopicMoment topicMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "userViewCounter":
                case "guideTab":
                case "options":
                case "priority":
                case "headIcon":
                case "sourceTabs":
                case "source":
                case "status":
                case "createdTime":
                case "consensusUserIds":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "name":
                case "type":
                case "group":
                case "owner":
                case "momentCounter":
                case "activityUserIds":
                case "topicType":
                case "landingPage":
                case "consensusCounter":
                case "hideOwner":
                case "commentCounter":
                case "viewCounter":
                case "selected":
                case "activityUserCounter":
                case "voteCounter":
                case "details":
                    return true;
                default:
                    return super.parseFieldCheck(topicMoment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicMoment topicMoment, JsonGenerator jsonGenerator) throws IOException {
            String str = topicMoment.f708id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (topicMoment.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                IdBoxed.JSON_ADAPTER.serialize(topicMoment.owner, jsonGenerator, true);
            }
            String str2 = topicMoment.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = topicMoment.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            String str4 = topicMoment.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            String str5 = topicMoment.topicType;
            if (str5 != null) {
                jsonGenerator.writeStringField("topicType", str5);
            }
            String str6 = topicMoment.typeAlias;
            if (str6 != null) {
                jsonGenerator.writeStringField("type", str6);
            }
            String str7 = topicMoment.priority;
            if (str7 != null) {
                jsonGenerator.writeStringField("priority", str7);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(topicMoment.createdTime), jsonGenerator, true);
            String str8 = topicMoment.status;
            if (str8 != null) {
                jsonGenerator.writeStringField("status", str8);
            }
            jsonGenerator.writeNumberField("momentCounter", topicMoment.momentCounter);
            jsonGenerator.writeBooleanField(MatchFrom.selected, topicMoment.selected);
            jsonGenerator.writeNumberField("voteCounter", topicMoment.voteCounter);
            jsonGenerator.writeNumberField("commentCounter", topicMoment.commentCounter);
            if (topicMoment.options != null) {
                jsonGenerator.writeFieldName("options");
                JsonAdapter.serializeArray(topicMoment.options, jsonGenerator, VoteOptions.JSON_ADAPTER);
            }
            String str9 = topicMoment.landingPage;
            if (str9 != null) {
                jsonGenerator.writeStringField("landingPage", str9);
            }
            String str10 = topicMoment.guideTab;
            if (str10 != null) {
                jsonGenerator.writeStringField("guideTab", str10);
            }
            String str11 = topicMoment.headIcon;
            if (str11 != null) {
                jsonGenerator.writeStringField("headIcon", str11);
            }
            if (topicMoment.sourceTabs != null) {
                jsonGenerator.writeFieldName("sourceTabs");
                JsonAdapter.serializeArray(topicMoment.sourceTabs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("hideOwner", topicMoment.hideOwner);
            jsonGenerator.writeNumberField("activityUserCounter", topicMoment.activityUserCounter);
            if (topicMoment.activityUserIds != null) {
                jsonGenerator.writeFieldName("activityUserIds");
                JsonAdapter.serializeArray(topicMoment.activityUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("viewCounter", topicMoment.viewCounter);
            jsonGenerator.writeNumberField("userViewCounter", topicMoment.userViewCounter);
            if (topicMoment.group != null) {
                jsonGenerator.writeFieldName("group");
                GroupIdBox.JSON_ADAPTER.serialize(topicMoment.group, jsonGenerator, true);
            }
            if (topicMoment.source != null) {
                jsonGenerator.writeFieldName("source");
                TopicSource.JSON_ADAPTER.serialize(topicMoment.source, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("consensusCounter", topicMoment.consensusCounter);
            if (topicMoment.consensusUserIds != null) {
                jsonGenerator.writeFieldName("consensusUserIds");
                JsonAdapter.serializeArray(topicMoment.consensusUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (topicMoment.details != null) {
                jsonGenerator.writeFieldName("details");
                TopicActivityDetail.JSON_ADAPTER.serialize(topicMoment.details, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1828a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m1829b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m1831d(String str) {
        return str;
    }

    public static TopicMoment new_() {
        TopicMoment topicMoment = new TopicMoment();
        topicMoment.nullCheck();
        return topicMoment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TopicMoment m19794clone() {
        TopicMoment topicMoment = new TopicMoment();
        topicMoment.f708id = this.f708id;
        IdBoxed idBoxed = this.owner;
        if (idBoxed != null) {
            topicMoment.owner = idBoxed.m18204clone();
        }
        topicMoment.name = this.name;
        topicMoment.description = this.description;
        topicMoment.icon = this.icon;
        topicMoment.topicType = this.topicType;
        topicMoment.typeAlias = this.typeAlias;
        topicMoment.priority = this.priority;
        topicMoment.createdTime = this.createdTime;
        topicMoment.status = this.status;
        topicMoment.momentCounter = this.momentCounter;
        topicMoment.selected = this.selected;
        topicMoment.voteCounter = this.voteCounter;
        topicMoment.commentCounter = this.commentCounter;
        List<VoteOptions> list = this.options;
        if (list != null) {
            topicMoment.options = ValueObject.util_map(list, new w9j() { // from class: l.c0j0
                public final Object call(Object obj) {
                    return ((VoteOptions) obj).m19830clone();
                }
            });
        }
        topicMoment.landingPage = this.landingPage;
        topicMoment.guideTab = this.guideTab;
        topicMoment.headIcon = this.headIcon;
        List<String> list2 = this.sourceTabs;
        if (list2 != null) {
            topicMoment.sourceTabs = ValueObject.util_map(list2, new w9j() { // from class: l.d0j0
                public final Object call(Object obj) {
                    return TopicMoment.m1828a((String) obj);
                }
            });
        }
        topicMoment.hideOwner = this.hideOwner;
        topicMoment.activityUserCounter = this.activityUserCounter;
        List<String> list3 = this.activityUserIds;
        if (list3 != null) {
            topicMoment.activityUserIds = ValueObject.util_map(list3, new w9j() { // from class: l.e0j0
                public final Object call(Object obj) {
                    return TopicMoment.m1831d((String) obj);
                }
            });
        }
        topicMoment.viewCounter = this.viewCounter;
        topicMoment.userViewCounter = this.userViewCounter;
        GroupIdBox groupIdBox = this.group;
        if (groupIdBox != null) {
            topicMoment.group = groupIdBox.m19526clone();
        }
        TopicSource topicSource = this.source;
        if (topicSource != null) {
            topicMoment.source = topicSource.m19803clone();
        }
        topicMoment.consensusCounter = this.consensusCounter;
        List<String> list4 = this.consensusUserIds;
        if (list4 != null) {
            topicMoment.consensusUserIds = ValueObject.util_map(list4, new w9j() { // from class: l.f0j0
                public final Object call(Object obj) {
                    return TopicMoment.m1829b((String) obj);
                }
            });
        }
        TopicActivityDetail topicActivityDetail = this.details;
        if (topicActivityDetail != null) {
            topicMoment.details = topicActivityDetail.m19788clone();
        }
        return topicMoment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopicMoment)) {
            return false;
        }
        TopicMoment topicMoment = (TopicMoment) obj;
        return ValueObject.util_equals(this.f708id, topicMoment.f708id) && ValueObject.util_equals(this.owner, topicMoment.owner) && ValueObject.util_equals(this.name, topicMoment.name) && ValueObject.util_equals(this.description, topicMoment.description) && ValueObject.util_equals(this.icon, topicMoment.icon) && ValueObject.util_equals(this.topicType, topicMoment.topicType) && ValueObject.util_equals(this.typeAlias, topicMoment.typeAlias) && ValueObject.util_equals(this.priority, topicMoment.priority) && this.createdTime == topicMoment.createdTime && ValueObject.util_equals(this.status, topicMoment.status) && this.selected == topicMoment.selected && ValueObject.util_equals(this.landingPage, topicMoment.landingPage) && ValueObject.util_equals(this.guideTab, topicMoment.guideTab) && ValueObject.util_equals(this.headIcon, topicMoment.headIcon) && ValueObject.util_equals(this.sourceTabs, topicMoment.sourceTabs) && this.hideOwner == topicMoment.hideOwner && ValueObject.util_equals(this.activityUserIds, topicMoment.activityUserIds) && ValueObject.util_equals(this.group, topicMoment.group) && ValueObject.util_equals(this.source, topicMoment.source) && this.consensusCounter == topicMoment.consensusCounter && ValueObject.util_equals(this.consensusUserIds, topicMoment.consensusUserIds) && ValueObject.util_equals(this.details, topicMoment.details);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public String getTopicNameWithPrefix() {
        return "#" + this.name;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f708id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        IdBoxed idBoxed = this.owner;
        int iHashCode2 = (iHashCode + (idBoxed != null ? idBoxed.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.topicType;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.typeAlias;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.priority;
        int iHashCode8 = str7 != null ? str7.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((iHashCode7 + iHashCode8) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str8 = this.status;
        int iHashCode9 = (((i3 + (str8 != null ? str8.hashCode() : 0)) * 41) + (this.selected ? 1231 : 1237)) * 41;
        String str9 = this.landingPage;
        int iHashCode10 = (iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.guideTab;
        int iHashCode11 = (iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.headIcon;
        int iHashCode12 = (iHashCode11 + (str11 != null ? str11.hashCode() : 0)) * 41;
        List<String> list = this.sourceTabs;
        int iHashCode13 = (((iHashCode12 + (list != null ? list.hashCode() : 0)) * 41) + (this.hideOwner ? 1231 : 1237)) * 41;
        List<String> list2 = this.activityUserIds;
        int iHashCode14 = (iHashCode13 + (list2 != null ? list2.hashCode() : 0)) * 41;
        GroupIdBox groupIdBox = this.group;
        int iHashCode15 = (iHashCode14 + (groupIdBox != null ? groupIdBox.hashCode() : 0)) * 41;
        TopicSource topicSource = this.source;
        int iHashCode16 = (((iHashCode15 + (topicSource != null ? topicSource.hashCode() : 0)) * 41) + this.consensusCounter) * 41;
        List<String> list3 = this.consensusUserIds;
        int iHashCode17 = (iHashCode16 + (list3 != null ? list3.hashCode() : 0)) * 41;
        TopicActivityDetail topicActivityDetail = this.details;
        int iHashCode18 = iHashCode17 + (topicActivityDetail != null ? topicActivityDetail.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode18;
        return iHashCode18;
    }

    public boolean isActivityTopic() {
        return this.details != null;
    }

    public boolean isAudioTopicType() {
        return TextUtils.equals(this.guideTab, "audio");
    }

    public boolean isBookMovieDramaTopic() {
        TopicSource topicSource = this.source;
        return (topicSource == null || !TextUtils.equals(topicSource.sourceType, "literature") || TextUtils.isEmpty(this.source.f710id)) ? false : true;
    }

    public boolean isEnterGroup() {
        return this.isEnterGroup;
    }

    public boolean isQATopicType() {
        return TextUtils.equals(this.topicType, "qa");
    }

    public boolean isTopicAnonymousType() {
        return TextUtils.equals(this.topicType, "anonymous");
    }

    public boolean isTopicLinkType() {
        return TextUtils.equals(this.topicType, Link.TYPE);
    }

    public boolean isTopicVoteType() {
        return TextUtils.equals(this.topicType, LinkIntent.vote);
    }

    public boolean isUserCreate(String str) {
        return this.owner.f220id.equals(str);
    }

    public void nullCheck() {
        if (this.f708id == null) {
            this.f708id = "";
        }
        if (this.owner == null) {
            this.owner = IdBoxed.new_();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.topicType == null) {
            this.topicType = "";
        }
        if (this.typeAlias == null) {
            this.typeAlias = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.landingPage == null) {
            this.landingPage = "";
        }
        if (this.guideTab == null) {
            this.guideTab = "";
        }
        if (this.headIcon == null) {
            this.headIcon = "";
        }
        if (this.sourceTabs == null) {
            this.sourceTabs = new ArrayList();
        }
        if (this.activityUserIds == null) {
            this.activityUserIds = new ArrayList();
        }
        if (this.group == null) {
            this.group = GroupIdBox.new_();
        }
        if (this.consensusUserIds == null) {
            this.consensusUserIds = new ArrayList();
        }
    }

    public void setEnterGroup(boolean z) {
        this.isEnterGroup = z;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
