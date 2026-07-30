package com.p046p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Options;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.VoteOptions;
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
import org.spongycastle.i18n.ErrorBundle;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
    public String f39247id;
    private boolean isEnterGroup = false;

    @NonNull
    @ProtobufIndex(index = 16)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TopicMoment topicMoment) {
            String str = topicMoment.f39247id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            IdBoxed idBoxed = topicMoment.owner;
            if (idBoxed != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            String str2 = topicMoment.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = topicMoment.description;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = topicMoment.icon;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            String str5 = topicMoment.topicType;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            String str6 = topicMoment.typeAlias;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str6);
            }
            String str7 = topicMoment.priority;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str7);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(9, topicMoment.createdTime);
            String str8 = topicMoment.status;
            if (str8 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(10, str8);
            }
            int iM17226h = iM17222d + CodedOutputByteBufferNano.m17226h(11, topicMoment.momentCounter) + CodedOutputByteBufferNano.m17220b(12, topicMoment.selected) + CodedOutputByteBufferNano.m17226h(13, topicMoment.voteCounter) + CodedOutputByteBufferNano.m17226h(14, topicMoment.commentCounter);
            List<VoteOptions> list = topicMoment.options;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(15, list, VoteOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str9 = topicMoment.landingPage;
            if (str9 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(16, str9);
            }
            String str10 = topicMoment.guideTab;
            if (str10 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(17, str10);
            }
            String str11 = topicMoment.headIcon;
            if (str11 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(18, str11);
            }
            List<String> list2 = topicMoment.sourceTabs;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(19, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(20, topicMoment.hideOwner) + CodedOutputByteBufferNano.m17226h(21, topicMoment.activityUserCounter);
            List<String> list3 = topicMoment.activityUserIds;
            if (list3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(22, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h2 = iM17220b + CodedOutputByteBufferNano.m17226h(23, topicMoment.viewCounter) + CodedOutputByteBufferNano.m17226h(24, topicMoment.userViewCounter);
            GroupIdBox groupIdBox = topicMoment.group;
            if (groupIdBox != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(25, groupIdBox, GroupIdBox.PROTOBUF_ADAPTER);
            }
            TopicSource topicSource = topicMoment.source;
            if (topicSource != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(26, topicSource, TopicSource.PROTOBUF_ADAPTER);
            }
            int iM17226h3 = iM17226h2 + CodedOutputByteBufferNano.m17226h(27, topicMoment.consensusCounter);
            List<String> list4 = topicMoment.consensusUserIds;
            if (list4 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(28, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            TopicActivityDetail topicActivityDetail = topicMoment.details;
            if (topicActivityDetail != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(29, topicActivityDetail, TopicActivityDetail.PROTOBUF_ADAPTER);
            }
            topicMoment.cachedSize = iM17226h3;
            return iM17226h3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TopicMoment parse(nb5 nb5Var) throws IOException {
            TopicMoment topicMoment = new TopicMoment();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (topicMoment.f39247id == null) {
                            topicMoment.f39247id = "";
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
                        topicMoment.f39247id = nb5Var.m158750s();
                        continue;
                    case 18:
                        topicMoment.owner = (IdBoxed) nb5Var.m158743l(IdBoxed.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        topicMoment.name = nb5Var.m158750s();
                        continue;
                    case 34:
                        topicMoment.description = nb5Var.m158750s();
                        continue;
                    case 42:
                        topicMoment.icon = nb5Var.m158750s();
                        continue;
                    case 50:
                        topicMoment.topicType = nb5Var.m158750s();
                        continue;
                    case 58:
                        topicMoment.typeAlias = nb5Var.m158750s();
                        continue;
                    case 66:
                        topicMoment.priority = nb5Var.m158750s();
                        continue;
                    case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                        topicMoment.createdTime = nb5Var.m158739h();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        topicMoment.status = nb5Var.m158750s();
                        continue;
                    case 88:
                        topicMoment.momentCounter = nb5Var.m158741j();
                        continue;
                    case Opcodes.IADD /* 96 */:
                        topicMoment.selected = nb5Var.m158738g();
                        continue;
                    case 104:
                        topicMoment.voteCounter = nb5Var.m158741j();
                        continue;
                    case 112:
                        topicMoment.commentCounter = nb5Var.m158741j();
                        continue;
                    case 122:
                        topicMoment.options = (List) nb5Var.m158743l(VoteOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 130:
                        topicMoment.landingPage = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        topicMoment.guideTab = nb5Var.m158750s();
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        topicMoment.headIcon = nb5Var.m158750s();
                        continue;
                    case 154:
                        topicMoment.sourceTabs = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 160:
                        topicMoment.hideOwner = nb5Var.m158738g();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256 /* 168 */:
                        topicMoment.activityUserCounter = nb5Var.m158741j();
                        continue;
                    case 178:
                        topicMoment.activityUserIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 184:
                        topicMoment.viewCounter = nb5Var.m158741j();
                        continue;
                    case 192:
                        topicMoment.userViewCounter = nb5Var.m158741j();
                        continue;
                    case 202:
                        topicMoment.group = (GroupIdBox) nb5Var.m158743l(GroupIdBox.PROTOBUF_ADAPTER);
                        continue;
                    case 210:
                        topicMoment.source = (TopicSource) nb5Var.m158743l(TopicSource.PROTOBUF_ADAPTER);
                        continue;
                    case 216:
                        topicMoment.consensusCounter = nb5Var.m158741j();
                        continue;
                    case 226:
                        topicMoment.consensusUserIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 234:
                        topicMoment.details = (TopicActivityDetail) nb5Var.m158743l(TopicActivityDetail.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (topicMoment.f39247id == null) {
                            topicMoment.f39247id = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TopicMoment topicMoment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicMoment.f39247id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            IdBoxed idBoxed = topicMoment.owner;
            if (idBoxed != null) {
                codedOutputByteBufferNano.m17254K(2, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            String str2 = topicMoment.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = topicMoment.description;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = topicMoment.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            String str5 = topicMoment.topicType;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
            String str6 = topicMoment.typeAlias;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(7, str6);
            }
            String str7 = topicMoment.priority;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(8, str7);
            }
            codedOutputByteBufferNano.m17246C(9, topicMoment.createdTime);
            String str8 = topicMoment.status;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(10, str8);
            }
            codedOutputByteBufferNano.m17250G(11, topicMoment.momentCounter);
            codedOutputByteBufferNano.m17244A(12, topicMoment.selected);
            codedOutputByteBufferNano.m17250G(13, topicMoment.voteCounter);
            codedOutputByteBufferNano.m17250G(14, topicMoment.commentCounter);
            List<VoteOptions> list = topicMoment.options;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(15, list, VoteOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str9 = topicMoment.landingPage;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(16, str9);
            }
            String str10 = topicMoment.guideTab;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(17, str10);
            }
            String str11 = topicMoment.headIcon;
            if (str11 != null) {
                codedOutputByteBufferNano.m17261R(18, str11);
            }
            List<String> list2 = topicMoment.sourceTabs;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(19, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(20, topicMoment.hideOwner);
            codedOutputByteBufferNano.m17250G(21, topicMoment.activityUserCounter);
            List<String> list3 = topicMoment.activityUserIds;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(22, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(23, topicMoment.viewCounter);
            codedOutputByteBufferNano.m17250G(24, topicMoment.userViewCounter);
            GroupIdBox groupIdBox = topicMoment.group;
            if (groupIdBox != null) {
                codedOutputByteBufferNano.m17254K(25, groupIdBox, GroupIdBox.PROTOBUF_ADAPTER);
            }
            TopicSource topicSource = topicMoment.source;
            if (topicSource != null) {
                codedOutputByteBufferNano.m17254K(26, topicSource, TopicSource.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(27, topicMoment.consensusCounter);
            List<String> list4 = topicMoment.consensusUserIds;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(28, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            TopicActivityDetail topicActivityDetail = topicMoment.details;
            if (topicActivityDetail != null) {
                codedOutputByteBufferNano.m17254K(29, topicActivityDetail, TopicActivityDetail.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TopicMoment> JSON_ADAPTER = new ObjectJsonAdapter<TopicMoment>() { // from class: com.p1.mobile.putong.feed.data.TopicMoment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TopicMoment.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TopicMoment newInstance() {
            return new TopicMoment();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(TopicMoment topicMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1724546052:
                    if (str.equals("description")) {
                        b = 0;
                    }
                    break;
                case -1432002868:
                    if (str.equals("userViewCounter")) {
                        b = 1;
                    }
                    break;
                case -1313907975:
                    if (str.equals("guideTab")) {
                        b = 2;
                    }
                    break;
                case -1249474914:
                    if (str.equals(Options.TYPE)) {
                        b = 3;
                    }
                    break;
                case -1165461084:
                    if (str.equals("priority")) {
                        b = 4;
                    }
                    break;
                case -1116107143:
                    if (str.equals("headIcon")) {
                        b = 5;
                    }
                    break;
                case -1111455175:
                    if (str.equals("sourceTabs")) {
                        b = 6;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 7;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 8;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 9;
                    }
                    break;
                case -336698762:
                    if (str.equals("consensusUserIds")) {
                        b = 10;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 11;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 12;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 14;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        b = 15;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 233450460:
                    if (str.equals("momentCounter")) {
                        b = 17;
                    }
                    break;
                case 378634462:
                    if (str.equals("activityUserIds")) {
                        b = 18;
                    }
                    break;
                case 388407561:
                    if (str.equals("topicType")) {
                        b = 19;
                    }
                    break;
                case 497102150:
                    if (str.equals("landingPage")) {
                        b = 20;
                    }
                    break;
                case 768286085:
                    if (str.equals("consensusCounter")) {
                        b = 21;
                    }
                    break;
                case 838999697:
                    if (str.equals("hideOwner")) {
                        b = 22;
                    }
                    break;
                case 877782685:
                    if (str.equals("commentCounter")) {
                        b = 23;
                    }
                    break;
                case 948264855:
                    if (str.equals("viewCounter")) {
                        b = 24;
                    }
                    break;
                case 1191572123:
                    if (str.equals(MatchFrom.selected)) {
                        b = 25;
                    }
                    break;
                case 1404681506:
                    if (str.equals("activityUserCounter")) {
                        b = 26;
                    }
                    break;
                case 1416322994:
                    if (str.equals("voteCounter")) {
                        b = 27;
                    }
                    break;
                case 1557721666:
                    if (str.equals(ErrorBundle.DETAIL_ENTRY)) {
                        b = 28;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    topicMoment.description = jsonParser.getValueAsString();
                    return true;
                case 1:
                    topicMoment.userViewCounter = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    topicMoment.guideTab = jsonParser.getValueAsString();
                    return true;
                case 3:
                    topicMoment.options = JsonAdapter.parseArray(jsonParser, VoteOptions.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    topicMoment.priority = jsonParser.getValueAsString();
                    return true;
                case 5:
                    topicMoment.headIcon = jsonParser.getValueAsString();
                    return true;
                case 6:
                    topicMoment.sourceTabs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    topicMoment.source = TopicSource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    topicMoment.status = jsonParser.getValueAsString();
                    return true;
                case 9:
                    topicMoment.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 10:
                    topicMoment.consensusUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    topicMoment.f39247id = jsonParser.getValueAsString();
                    return false;
                case 12:
                    topicMoment.icon = jsonParser.getValueAsString();
                    return true;
                case 13:
                    topicMoment.name = jsonParser.getValueAsString();
                    return true;
                case 14:
                    topicMoment.typeAlias = jsonParser.getValueAsString();
                    return true;
                case 15:
                    topicMoment.group = GroupIdBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    topicMoment.owner = IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    topicMoment.momentCounter = jsonParser.getValueAsInt();
                    return true;
                case 18:
                    topicMoment.activityUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    topicMoment.topicType = jsonParser.getValueAsString();
                    return true;
                case 20:
                    topicMoment.landingPage = jsonParser.getValueAsString();
                    return true;
                case 21:
                    topicMoment.consensusCounter = jsonParser.getValueAsInt();
                    return true;
                case 22:
                    topicMoment.hideOwner = jsonParser.getValueAsBoolean();
                    return true;
                case 23:
                    topicMoment.commentCounter = jsonParser.getValueAsInt();
                    return true;
                case 24:
                    topicMoment.viewCounter = jsonParser.getValueAsInt();
                    return true;
                case 25:
                    topicMoment.selected = jsonParser.getValueAsBoolean();
                    return true;
                case 26:
                    topicMoment.activityUserCounter = jsonParser.getValueAsInt();
                    return true;
                case 27:
                    topicMoment.voteCounter = jsonParser.getValueAsInt();
                    return true;
                case 28:
                    topicMoment.details = TopicActivityDetail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(TopicMoment topicMoment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1724546052:
                    if (str.equals("description")) {
                        b = 0;
                    }
                    break;
                case -1432002868:
                    if (str.equals("userViewCounter")) {
                        b = 1;
                    }
                    break;
                case -1313907975:
                    if (str.equals("guideTab")) {
                        b = 2;
                    }
                    break;
                case -1249474914:
                    if (str.equals(Options.TYPE)) {
                        b = 3;
                    }
                    break;
                case -1165461084:
                    if (str.equals("priority")) {
                        b = 4;
                    }
                    break;
                case -1116107143:
                    if (str.equals("headIcon")) {
                        b = 5;
                    }
                    break;
                case -1111455175:
                    if (str.equals("sourceTabs")) {
                        b = 6;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 7;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 8;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 9;
                    }
                    break;
                case -336698762:
                    if (str.equals("consensusUserIds")) {
                        b = 10;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 11;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 12;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 14;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        b = 15;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 233450460:
                    if (str.equals("momentCounter")) {
                        b = 17;
                    }
                    break;
                case 378634462:
                    if (str.equals("activityUserIds")) {
                        b = 18;
                    }
                    break;
                case 388407561:
                    if (str.equals("topicType")) {
                        b = 19;
                    }
                    break;
                case 497102150:
                    if (str.equals("landingPage")) {
                        b = 20;
                    }
                    break;
                case 768286085:
                    if (str.equals("consensusCounter")) {
                        b = 21;
                    }
                    break;
                case 838999697:
                    if (str.equals("hideOwner")) {
                        b = 22;
                    }
                    break;
                case 877782685:
                    if (str.equals("commentCounter")) {
                        b = 23;
                    }
                    break;
                case 948264855:
                    if (str.equals("viewCounter")) {
                        b = 24;
                    }
                    break;
                case 1191572123:
                    if (str.equals(MatchFrom.selected)) {
                        b = 25;
                    }
                    break;
                case 1404681506:
                    if (str.equals("activityUserCounter")) {
                        b = 26;
                    }
                    break;
                case 1416322994:
                    if (str.equals("voteCounter")) {
                        b = 27;
                    }
                    break;
                case 1557721666:
                    if (str.equals(ErrorBundle.DETAIL_ENTRY)) {
                        b = 28;
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
                    return true;
                case 11:
                    return false;
                case 12:
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
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    return true;
                default:
                    return super.parseFieldCheck(topicMoment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicMoment topicMoment, JsonGenerator jsonGenerator) throws IOException {
            String str = topicMoment.f39247id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (topicMoment.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                IdBoxed.JSON_ADAPTER.serialize(topicMoment.owner, jsonGenerator, true);
            }
            String str2 = topicMoment.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
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
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str8);
            }
            jsonGenerator.writeNumberField("momentCounter", topicMoment.momentCounter);
            jsonGenerator.writeBooleanField(MatchFrom.selected, topicMoment.selected);
            jsonGenerator.writeNumberField("voteCounter", topicMoment.voteCounter);
            jsonGenerator.writeNumberField("commentCounter", topicMoment.commentCounter);
            if (topicMoment.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
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
                jsonGenerator.writeFieldName(ErrorBundle.DETAIL_ENTRY);
                TopicActivityDetail.JSON_ADAPTER.serialize(topicMoment.details, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicMoment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60902a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60903b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m60905d(String str) {
        return str;
    }

    public static TopicMoment new_() {
        TopicMoment topicMoment = new TopicMoment();
        topicMoment.nullCheck();
        return topicMoment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TopicMoment mo223809clone() {
        TopicMoment topicMoment = new TopicMoment();
        topicMoment.f39247id = this.f39247id;
        IdBoxed idBoxed = this.owner;
        if (idBoxed != null) {
            topicMoment.owner = idBoxed.mo223809clone();
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
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VoteOptions) obj).mo223809clone();
                }
            });
        }
        topicMoment.landingPage = this.landingPage;
        topicMoment.guideTab = this.guideTab;
        topicMoment.headIcon = this.headIcon;
        List<String> list2 = this.sourceTabs;
        if (list2 != null) {
            topicMoment.sourceTabs = ValueObject.util_map(list2, new w9j() { // from class: l.d0j0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TopicMoment.m60902a((String) obj);
                }
            });
        }
        topicMoment.hideOwner = this.hideOwner;
        topicMoment.activityUserCounter = this.activityUserCounter;
        List<String> list3 = this.activityUserIds;
        if (list3 != null) {
            topicMoment.activityUserIds = ValueObject.util_map(list3, new w9j() { // from class: l.e0j0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TopicMoment.m60905d((String) obj);
                }
            });
        }
        topicMoment.viewCounter = this.viewCounter;
        topicMoment.userViewCounter = this.userViewCounter;
        GroupIdBox groupIdBox = this.group;
        if (groupIdBox != null) {
            topicMoment.group = groupIdBox.mo223809clone();
        }
        TopicSource topicSource = this.source;
        if (topicSource != null) {
            topicMoment.source = topicSource.mo223809clone();
        }
        topicMoment.consensusCounter = this.consensusCounter;
        List<String> list4 = this.consensusUserIds;
        if (list4 != null) {
            topicMoment.consensusUserIds = ValueObject.util_map(list4, new w9j() { // from class: l.f0j0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TopicMoment.m60903b((String) obj);
                }
            });
        }
        TopicActivityDetail topicActivityDetail = this.details;
        if (topicActivityDetail != null) {
            topicMoment.details = topicActivityDetail.mo223809clone();
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
        return ValueObject.util_equals(this.f39247id, topicMoment.f39247id) && ValueObject.util_equals(this.owner, topicMoment.owner) && ValueObject.util_equals(this.name, topicMoment.name) && ValueObject.util_equals(this.description, topicMoment.description) && ValueObject.util_equals(this.icon, topicMoment.icon) && ValueObject.util_equals(this.topicType, topicMoment.topicType) && ValueObject.util_equals(this.typeAlias, topicMoment.typeAlias) && ValueObject.util_equals(this.priority, topicMoment.priority) && this.createdTime == topicMoment.createdTime && ValueObject.util_equals(this.status, topicMoment.status) && this.selected == topicMoment.selected && ValueObject.util_equals(this.landingPage, topicMoment.landingPage) && ValueObject.util_equals(this.guideTab, topicMoment.guideTab) && ValueObject.util_equals(this.headIcon, topicMoment.headIcon) && ValueObject.util_equals(this.sourceTabs, topicMoment.sourceTabs) && this.hideOwner == topicMoment.hideOwner && ValueObject.util_equals(this.activityUserIds, topicMoment.activityUserIds) && ValueObject.util_equals(this.group, topicMoment.group) && ValueObject.util_equals(this.source, topicMoment.source) && this.consensusCounter == topicMoment.consensusCounter && ValueObject.util_equals(this.consensusUserIds, topicMoment.consensusUserIds) && ValueObject.util_equals(this.details, topicMoment.details);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getTopicNameWithPrefix() {
        return "#" + this.name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f39247id;
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
        this.hashCode = iHashCode18;
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
        return (topicSource == null || !TextUtils.equals(topicSource.sourceType, "literature") || TextUtils.isEmpty(this.source.f39249id)) ? false : true;
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
        return this.owner.f38759id.equals(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39247id == null) {
            this.f39247id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
