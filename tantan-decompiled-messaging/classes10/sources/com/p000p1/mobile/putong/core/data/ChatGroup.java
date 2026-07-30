package com.p000p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChatGroup;
import com.p000p1.mobile.putong.core.data.ChatGroupTag;
import com.p000p1.mobile.putong.core.data.GroupMemberStatistic;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.mrf0;
import l.nb5;
import l.orh0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatGroup extends DbObject<ChatGroup> implements Cloneable, Serializable {
    public static final String TYPE = "chatgroup";

    @ProtobufIndex(index = 85)
    public int adminLimit;

    @NonNull
    @ProtobufIndex(index = 57)
    public List<String> adminUserIds;

    @NonNull
    @ProtobufIndex(index = 53)
    public String announcement;

    @NonNull
    @ProtobufIndex(index = 52)
    public List<Picture> avatars;

    @NonNull
    @ProtobufIndex(index = 68)
    public ChatGroupCateGory category;

    @ProtobufIndex(index = 64)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 58)
    public String creatorUserId;

    @NonNull
    @ProtobufIndex(index = 69)
    public String description;

    @ProtobufIndex(index = 82)
    public long duration;

    @ProtobufIndex(index = 76)
    public long expiredTime;

    @NonNull
    @ProtobufIndex(index = 71)
    public GroupApply groupApply;

    @NonNull
    @ProtobufIndex(index = 80)
    public ChatGroupTopic groupTopic;

    @NonNull
    @ProtobufIndex(index = 59)
    public ChatGroupType groupType;

    @NonNull
    @ProtobufIndex(index = 87)
    public InModeration inModeration;

    @NonNull
    @ProtobufIndex(index = 83)
    public JoinCondition joinCondition;

    @ProtobufIndex(index = 77)
    public int joinRemainedTime;

    @NonNull
    @ProtobufIndex(index = Conversation.TAG_LEVEL_TOP)
    public String localConId;

    @ProtobufIndex(index = 66)
    public boolean localMembersLoaded;

    @ProtobufIndex(index = 61)
    public int memberCount;

    @NonNull
    @ProtobufIndex(index = 60)
    public List<String> memberIds;

    @ProtobufIndex(index = 62)
    public int memberLimit;

    @NonNull
    @ProtobufIndex(index = 63)
    public List<GroupMemberStatistic> memberStatistics;

    @NonNull
    @ProtobufIndex(index = 51)
    public String name;

    @ProtobufIndex(index = 84)
    public int onlineCount;

    @NonNull
    @ProtobufIndex(index = 56)
    public String ownerUserId;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @NonNull
    @ProtobufIndex(index = 86)
    public Permissions permissions;

    @NonNull
    @ProtobufIndex(index = 67)
    public String publicId;

    @NonNull
    @ProtobufIndex(index = 73)
    public ChatPunishment punishment;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 88)
    public String shareToken;

    @NonNull
    @ProtobufIndex(index = 72)
    public ChatGroupSilence silence;

    @NonNull
    @ProtobufIndex(index = 78)
    public String source;

    @NonNull
    @ProtobufIndex(index = 54)
    public ChatGroupStatus status;

    @NonNull
    @ProtobufIndex(index = 70)
    public List<ChatGroupTag> tags;

    @NonNull
    @ProtobufIndex(index = 79)
    public String token;

    @ProtobufIndex(index = 65)
    public double updatedTime;

    @ProtobufIndex(index = 81)
    public boolean upgraded;
    public static ProtobufAdapter<ChatGroup> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroup>() { // from class: com.p1.mobile.putong.core.data.ChatGroup.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGroup chatGroup) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) chatGroup)._id);
            String str = ((DbObject) chatGroup).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = chatGroup.name;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            List<Picture> list = chatGroup.avatars;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(52, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGroup.announcement;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(53, str3);
            }
            ChatGroupStatus chatGroupStatus = chatGroup.status;
            if (chatGroupStatus != null) {
                iJ += CodedOutputByteBufferNano.h(54, chatGroupStatus.ordinal());
            }
            String str4 = chatGroup.localConId;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(55, str4);
            }
            String str5 = chatGroup.ownerUserId;
            if (str5 != null) {
                iJ += CodedOutputByteBufferNano.o(56, str5);
            }
            List<String> list2 = chatGroup.adminUserIds;
            if (list2 != null) {
                iJ += CodedOutputByteBufferNano.l(57, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = chatGroup.creatorUserId;
            if (str6 != null) {
                iJ += CodedOutputByteBufferNano.o(58, str6);
            }
            ChatGroupType chatGroupType = chatGroup.groupType;
            if (chatGroupType != null) {
                iJ += CodedOutputByteBufferNano.h(59, chatGroupType.ordinal());
            }
            List<String> list3 = chatGroup.memberIds;
            if (list3 != null) {
                iJ += CodedOutputByteBufferNano.l(60, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iJ + CodedOutputByteBufferNano.h(61, chatGroup.memberCount) + CodedOutputByteBufferNano.h(62, chatGroup.memberLimit);
            List<GroupMemberStatistic> list4 = chatGroup.memberStatistics;
            if (list4 != null) {
                iH += CodedOutputByteBufferNano.l(63, list4, GroupMemberStatistic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iD = iH + CodedOutputByteBufferNano.d(64, chatGroup.createdTime) + CodedOutputByteBufferNano.d(65, chatGroup.updatedTime) + CodedOutputByteBufferNano.b(66, chatGroup.localMembersLoaded);
            String str7 = chatGroup.publicId;
            if (str7 != null) {
                iD += CodedOutputByteBufferNano.o(67, str7);
            }
            ChatGroupCateGory chatGroupCateGory = chatGroup.category;
            if (chatGroupCateGory != null) {
                iD += CodedOutputByteBufferNano.l(68, chatGroupCateGory, ChatGroupCateGory.PROTOBUF_ADAPTER);
            }
            String str8 = chatGroup.description;
            if (str8 != null) {
                iD += CodedOutputByteBufferNano.o(69, str8);
            }
            List<ChatGroupTag> list5 = chatGroup.tags;
            if (list5 != null) {
                iD += CodedOutputByteBufferNano.l(70, list5, ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupApply groupApply = chatGroup.groupApply;
            if (groupApply != null) {
                iD += CodedOutputByteBufferNano.l(71, groupApply, GroupApply.PROTOBUF_ADAPTER);
            }
            ChatGroupSilence chatGroupSilence = chatGroup.silence;
            if (chatGroupSilence != null) {
                iD += CodedOutputByteBufferNano.l(72, chatGroupSilence, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            ChatPunishment chatPunishment = chatGroup.punishment;
            if (chatPunishment != null) {
                iD += CodedOutputByteBufferNano.l(73, chatPunishment, ChatPunishment.PROTOBUF_ADAPTER);
            }
            ChatGroupStatus chatGroupStatus2 = chatGroup.status;
            if (chatGroupStatus2 != null) {
                iD += CodedOutputByteBufferNano.l(74, chatGroupStatus2, ChatGroupStatus.PROTOBUF_ADAPTER);
            }
            ChatGroupType chatGroupType2 = chatGroup.groupType;
            if (chatGroupType2 != null) {
                iD += CodedOutputByteBufferNano.l(75, chatGroupType2, ChatGroupType.PROTOBUF_ADAPTER);
            }
            int iJ2 = iD + CodedOutputByteBufferNano.j(76, chatGroup.expiredTime) + CodedOutputByteBufferNano.h(77, chatGroup.joinRemainedTime);
            String str9 = chatGroup.source;
            if (str9 != null) {
                iJ2 += CodedOutputByteBufferNano.o(78, str9);
            }
            String str10 = chatGroup.token;
            if (str10 != null) {
                iJ2 += CodedOutputByteBufferNano.o(79, str10);
            }
            ChatGroupTopic chatGroupTopic = chatGroup.groupTopic;
            if (chatGroupTopic != null) {
                iJ2 += CodedOutputByteBufferNano.l(80, chatGroupTopic, ChatGroupTopic.PROTOBUF_ADAPTER);
            }
            int iB = iJ2 + CodedOutputByteBufferNano.b(81, chatGroup.upgraded) + CodedOutputByteBufferNano.j(82, chatGroup.duration);
            JoinCondition joinCondition = chatGroup.joinCondition;
            if (joinCondition != null) {
                iB += CodedOutputByteBufferNano.l(83, joinCondition, JoinCondition.PROTOBUF_ADAPTER);
            }
            int iH2 = iB + CodedOutputByteBufferNano.h(84, chatGroup.onlineCount) + CodedOutputByteBufferNano.h(85, chatGroup.adminLimit);
            Permissions permissions = chatGroup.permissions;
            if (permissions != null) {
                iH2 += CodedOutputByteBufferNano.l(86, permissions, Permissions.PROTOBUF_ADAPTER);
            }
            InModeration inModeration = chatGroup.inModeration;
            if (inModeration != null) {
                iH2 += CodedOutputByteBufferNano.l(87, inModeration, InModeration.PROTOBUF_ADAPTER);
            }
            String str11 = chatGroup.shareToken;
            if (str11 != null) {
                iH2 += CodedOutputByteBufferNano.o(88, str11);
            }
            ((MessageNano) chatGroup).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGroup m12015parse(nb5 nb5Var) throws IOException {
            ChatGroup chatGroup = new ChatGroup();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (chatGroup.status == null && numValueOf != null) {
                            chatGroup.status = (ChatGroupStatus) ChatGroupStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (chatGroup.groupType == null && numValueOf2 != null) {
                            chatGroup.groupType = (ChatGroupType) ChatGroupType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (chatGroup.name == null) {
                            chatGroup.name = "";
                        }
                        if (chatGroup.avatars == null) {
                            chatGroup.avatars = new ArrayList();
                        }
                        if (chatGroup.announcement == null) {
                            chatGroup.announcement = "";
                        }
                        if (chatGroup.status == null) {
                            chatGroup.status = (ChatGroupStatus) ChatGroupStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroup.localConId == null) {
                            chatGroup.localConId = "";
                        }
                        if (chatGroup.ownerUserId == null) {
                            chatGroup.ownerUserId = "";
                        }
                        if (chatGroup.adminUserIds == null) {
                            chatGroup.adminUserIds = new ArrayList();
                        }
                        if (chatGroup.creatorUserId == null) {
                            chatGroup.creatorUserId = "";
                        }
                        if (chatGroup.groupType == null) {
                            chatGroup.groupType = (ChatGroupType) ChatGroupType.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroup.memberIds == null) {
                            chatGroup.memberIds = new ArrayList();
                        }
                        if (chatGroup.memberStatistics == null) {
                            chatGroup.memberStatistics = new ArrayList();
                        }
                        if (chatGroup.publicId == null) {
                            chatGroup.publicId = "";
                        }
                        if (chatGroup.category == null) {
                            chatGroup.category = ChatGroupCateGory.new_();
                        }
                        if (chatGroup.description == null) {
                            chatGroup.description = "";
                        }
                        if (chatGroup.tags == null) {
                            chatGroup.tags = new ArrayList();
                        }
                        if (chatGroup.groupApply == null) {
                            chatGroup.groupApply = GroupApply.new_();
                        }
                        if (chatGroup.silence == null) {
                            chatGroup.silence = ChatGroupSilence.new_();
                        }
                        if (chatGroup.punishment == null) {
                            chatGroup.punishment = ChatPunishment.new_();
                        }
                        if (chatGroup.source == null) {
                            chatGroup.source = "";
                        }
                        if (chatGroup.token == null) {
                            chatGroup.token = "";
                        }
                        if (chatGroup.groupTopic == null) {
                            chatGroup.groupTopic = ChatGroupTopic.new_();
                        }
                        if (chatGroup.joinCondition == null) {
                            chatGroup.joinCondition = (JoinCondition) JoinCondition.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroup.permissions == null) {
                            chatGroup.permissions = Permissions.new_();
                        }
                        if (chatGroup.inModeration == null) {
                            chatGroup.inModeration = InModeration.new_();
                        }
                        if (chatGroup.shareToken == null) {
                            chatGroup.shareToken = "";
                        }
                        break;
                    case 8:
                        ((DbObject) chatGroup)._id = nb5Var.k();
                        continue;
                    case 18:
                        ((DbObject) chatGroup).id = nb5Var.s();
                        continue;
                    case 410:
                        chatGroup.name = nb5Var.s();
                        continue;
                    case 418:
                        chatGroup.avatars = (List) nb5Var.l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 426:
                        chatGroup.announcement = nb5Var.s();
                        continue;
                    case 432:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 442:
                        chatGroup.localConId = nb5Var.s();
                        continue;
                    case 450:
                        chatGroup.ownerUserId = nb5Var.s();
                        continue;
                    case 458:
                        chatGroup.adminUserIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 466:
                        chatGroup.creatorUserId = nb5Var.s();
                        continue;
                    case 472:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 482:
                        chatGroup.memberIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 488:
                        chatGroup.memberCount = nb5Var.j();
                        continue;
                    case 496:
                        chatGroup.memberLimit = nb5Var.j();
                        continue;
                    case 506:
                        chatGroup.memberStatistics = (List) nb5Var.l(GroupMemberStatistic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 513:
                        chatGroup.createdTime = nb5Var.h();
                        continue;
                    case 521:
                        chatGroup.updatedTime = nb5Var.h();
                        continue;
                    case 528:
                        chatGroup.localMembersLoaded = nb5Var.g();
                        continue;
                    case 538:
                        chatGroup.publicId = nb5Var.s();
                        continue;
                    case 546:
                        chatGroup.category = (ChatGroupCateGory) nb5Var.l(ChatGroupCateGory.PROTOBUF_ADAPTER);
                        continue;
                    case 554:
                        chatGroup.description = nb5Var.s();
                        continue;
                    case 562:
                        chatGroup.tags = (List) nb5Var.l(ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 570:
                        chatGroup.groupApply = (GroupApply) nb5Var.l(GroupApply.PROTOBUF_ADAPTER);
                        continue;
                    case 578:
                        chatGroup.silence = (ChatGroupSilence) nb5Var.l(ChatGroupSilence.PROTOBUF_ADAPTER);
                        continue;
                    case 586:
                        chatGroup.punishment = (ChatPunishment) nb5Var.l(ChatPunishment.PROTOBUF_ADAPTER);
                        continue;
                    case 594:
                        chatGroup.status = (ChatGroupStatus) nb5Var.l(ChatGroupStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 602:
                        chatGroup.groupType = (ChatGroupType) nb5Var.l(ChatGroupType.PROTOBUF_ADAPTER);
                        continue;
                    case 608:
                        chatGroup.expiredTime = nb5Var.k();
                        continue;
                    case 616:
                        chatGroup.joinRemainedTime = nb5Var.j();
                        continue;
                    case 626:
                        chatGroup.source = nb5Var.s();
                        continue;
                    case 634:
                        chatGroup.token = nb5Var.s();
                        continue;
                    case 642:
                        chatGroup.groupTopic = (ChatGroupTopic) nb5Var.l(ChatGroupTopic.PROTOBUF_ADAPTER);
                        continue;
                    case 648:
                        chatGroup.upgraded = nb5Var.g();
                        continue;
                    case 656:
                        chatGroup.duration = nb5Var.k();
                        continue;
                    case 666:
                        chatGroup.joinCondition = (JoinCondition) nb5Var.l(JoinCondition.PROTOBUF_ADAPTER);
                        continue;
                    case 672:
                        chatGroup.onlineCount = nb5Var.j();
                        continue;
                    case 680:
                        chatGroup.adminLimit = nb5Var.j();
                        continue;
                    case 690:
                        chatGroup.permissions = (Permissions) nb5Var.l(Permissions.PROTOBUF_ADAPTER);
                        continue;
                    case 698:
                        chatGroup.inModeration = (InModeration) nb5Var.l(InModeration.PROTOBUF_ADAPTER);
                        continue;
                    case 706:
                        chatGroup.shareToken = nb5Var.s();
                        continue;
                    default:
                        if (chatGroup.status == null && numValueOf != null) {
                            chatGroup.status = (ChatGroupStatus) ChatGroupStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (chatGroup.groupType == null && numValueOf2 != null) {
                            chatGroup.groupType = (ChatGroupType) ChatGroupType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (chatGroup.name == null) {
                            chatGroup.name = "";
                        }
                        if (chatGroup.avatars == null) {
                            chatGroup.avatars = new ArrayList();
                        }
                        if (chatGroup.announcement == null) {
                            chatGroup.announcement = "";
                        }
                        if (chatGroup.status == null) {
                            chatGroup.status = (ChatGroupStatus) ChatGroupStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroup.localConId == null) {
                            chatGroup.localConId = "";
                        }
                        if (chatGroup.ownerUserId == null) {
                            chatGroup.ownerUserId = "";
                        }
                        if (chatGroup.adminUserIds == null) {
                            chatGroup.adminUserIds = new ArrayList();
                        }
                        if (chatGroup.creatorUserId == null) {
                            chatGroup.creatorUserId = "";
                        }
                        if (chatGroup.groupType == null) {
                            chatGroup.groupType = (ChatGroupType) ChatGroupType.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroup.memberIds == null) {
                            chatGroup.memberIds = new ArrayList();
                        }
                        if (chatGroup.memberStatistics == null) {
                            chatGroup.memberStatistics = new ArrayList();
                        }
                        if (chatGroup.publicId == null) {
                            chatGroup.publicId = "";
                        }
                        if (chatGroup.category == null) {
                            chatGroup.category = ChatGroupCateGory.new_();
                        }
                        if (chatGroup.description == null) {
                            chatGroup.description = "";
                        }
                        if (chatGroup.tags == null) {
                            chatGroup.tags = new ArrayList();
                        }
                        if (chatGroup.groupApply == null) {
                            chatGroup.groupApply = GroupApply.new_();
                        }
                        if (chatGroup.silence == null) {
                            chatGroup.silence = ChatGroupSilence.new_();
                        }
                        if (chatGroup.punishment == null) {
                            chatGroup.punishment = ChatPunishment.new_();
                        }
                        if (chatGroup.source == null) {
                            chatGroup.source = "";
                        }
                        if (chatGroup.token == null) {
                            chatGroup.token = "";
                        }
                        if (chatGroup.groupTopic == null) {
                            chatGroup.groupTopic = ChatGroupTopic.new_();
                        }
                        if (chatGroup.joinCondition == null) {
                            chatGroup.joinCondition = (JoinCondition) JoinCondition.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroup.permissions == null) {
                            chatGroup.permissions = Permissions.new_();
                        }
                        if (chatGroup.inModeration == null) {
                            chatGroup.inModeration = InModeration.new_();
                        }
                        if (chatGroup.shareToken == null) {
                            chatGroup.shareToken = "";
                            return chatGroup;
                        }
                        break;
                }
            }
            return chatGroup;
        }

        public void serialize(ChatGroup chatGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) chatGroup)._id);
            String str = ((DbObject) chatGroup).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = chatGroup.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            List<Picture> list = chatGroup.avatars;
            if (list != null) {
                codedOutputByteBufferNano.K(52, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGroup.announcement;
            if (str3 != null) {
                codedOutputByteBufferNano.R(53, str3);
            }
            ChatGroupStatus chatGroupStatus = chatGroup.status;
            if (chatGroupStatus != null) {
                codedOutputByteBufferNano.G(54, chatGroupStatus.ordinal());
            }
            String str4 = chatGroup.localConId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(55, str4);
            }
            String str5 = chatGroup.ownerUserId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(56, str5);
            }
            List<String> list2 = chatGroup.adminUserIds;
            if (list2 != null) {
                codedOutputByteBufferNano.K(57, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = chatGroup.creatorUserId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(58, str6);
            }
            ChatGroupType chatGroupType = chatGroup.groupType;
            if (chatGroupType != null) {
                codedOutputByteBufferNano.G(59, chatGroupType.ordinal());
            }
            List<String> list3 = chatGroup.memberIds;
            if (list3 != null) {
                codedOutputByteBufferNano.K(60, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(61, chatGroup.memberCount);
            codedOutputByteBufferNano.G(62, chatGroup.memberLimit);
            List<GroupMemberStatistic> list4 = chatGroup.memberStatistics;
            if (list4 != null) {
                codedOutputByteBufferNano.K(63, list4, GroupMemberStatistic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.C(64, chatGroup.createdTime);
            codedOutputByteBufferNano.C(65, chatGroup.updatedTime);
            codedOutputByteBufferNano.A(66, chatGroup.localMembersLoaded);
            String str7 = chatGroup.publicId;
            if (str7 != null) {
                codedOutputByteBufferNano.R(67, str7);
            }
            ChatGroupCateGory chatGroupCateGory = chatGroup.category;
            if (chatGroupCateGory != null) {
                codedOutputByteBufferNano.K(68, chatGroupCateGory, ChatGroupCateGory.PROTOBUF_ADAPTER);
            }
            String str8 = chatGroup.description;
            if (str8 != null) {
                codedOutputByteBufferNano.R(69, str8);
            }
            List<ChatGroupTag> list5 = chatGroup.tags;
            if (list5 != null) {
                codedOutputByteBufferNano.K(70, list5, ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupApply groupApply = chatGroup.groupApply;
            if (groupApply != null) {
                codedOutputByteBufferNano.K(71, groupApply, GroupApply.PROTOBUF_ADAPTER);
            }
            ChatGroupSilence chatGroupSilence = chatGroup.silence;
            if (chatGroupSilence != null) {
                codedOutputByteBufferNano.K(72, chatGroupSilence, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            ChatPunishment chatPunishment = chatGroup.punishment;
            if (chatPunishment != null) {
                codedOutputByteBufferNano.K(73, chatPunishment, ChatPunishment.PROTOBUF_ADAPTER);
            }
            ChatGroupStatus chatGroupStatus2 = chatGroup.status;
            if (chatGroupStatus2 != null) {
                codedOutputByteBufferNano.K(74, chatGroupStatus2, ChatGroupStatus.PROTOBUF_ADAPTER);
            }
            ChatGroupType chatGroupType2 = chatGroup.groupType;
            if (chatGroupType2 != null) {
                codedOutputByteBufferNano.K(75, chatGroupType2, ChatGroupType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.I(76, chatGroup.expiredTime);
            codedOutputByteBufferNano.G(77, chatGroup.joinRemainedTime);
            String str9 = chatGroup.source;
            if (str9 != null) {
                codedOutputByteBufferNano.R(78, str9);
            }
            String str10 = chatGroup.token;
            if (str10 != null) {
                codedOutputByteBufferNano.R(79, str10);
            }
            ChatGroupTopic chatGroupTopic = chatGroup.groupTopic;
            if (chatGroupTopic != null) {
                codedOutputByteBufferNano.K(80, chatGroupTopic, ChatGroupTopic.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(81, chatGroup.upgraded);
            codedOutputByteBufferNano.I(82, chatGroup.duration);
            JoinCondition joinCondition = chatGroup.joinCondition;
            if (joinCondition != null) {
                codedOutputByteBufferNano.K(83, joinCondition, JoinCondition.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(84, chatGroup.onlineCount);
            codedOutputByteBufferNano.G(85, chatGroup.adminLimit);
            Permissions permissions = chatGroup.permissions;
            if (permissions != null) {
                codedOutputByteBufferNano.K(86, permissions, Permissions.PROTOBUF_ADAPTER);
            }
            InModeration inModeration = chatGroup.inModeration;
            if (inModeration != null) {
                codedOutputByteBufferNano.K(87, inModeration, InModeration.PROTOBUF_ADAPTER);
            }
            String str11 = chatGroup.shareToken;
            if (str11 != null) {
                codedOutputByteBufferNano.R(88, str11);
            }
        }
    };
    public static JsonAdapter<ChatGroup> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroup>() { // from class: com.p1.mobile.putong.core.data.ChatGroup.2
        public Class getDataClass() {
            return ChatGroup.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatGroup m12016newInstance() {
            return new ChatGroup();
        }

        public boolean parseField(ChatGroup chatGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    chatGroup.duration = jsonParser.getValueAsLong();
                    return true;
                case "shareToken":
                    chatGroup.shareToken = jsonParser.getValueAsString();
                    return true;
                case "description":
                    chatGroup.description = jsonParser.getValueAsString();
                    return true;
                case "memberStatistics":
                    chatGroup.memberStatistics = JsonAdapter.parseArray(jsonParser, GroupMemberStatistic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "punishment":
                    chatGroup.punishment = (ChatPunishment) ChatPunishment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "source":
                    chatGroup.source = jsonParser.getValueAsString();
                    return true;
                case "status":
                    chatGroup.status = (ChatGroupStatus) ChatGroupStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "avatars":
                    chatGroup.avatars = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case "updatedTime":
                    chatGroup.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "createdTime":
                    chatGroup.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "adminUserIds":
                    chatGroup.adminUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "joinRemainedTime":
                    chatGroup.joinRemainedTime = jsonParser.getValueAsInt();
                    return true;
                case "ownerUserId":
                    chatGroup.ownerUserId = jsonParser.getValueAsString();
                    return true;
                case "expiredTime":
                    chatGroup.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    ((DbObject) chatGroup).id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    chatGroup.name = jsonParser.getValueAsString();
                    return true;
                case "tags":
                    chatGroup.tags = JsonAdapter.parseArray(jsonParser, ChatGroupTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    chatGroup.groupType = (ChatGroupType) ChatGroupType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "category":
                    chatGroup.category = (ChatGroupCateGory) ChatGroupCateGory.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "token":
                    chatGroup.token = jsonParser.getValueAsString();
                    return true;
                case "announcement":
                    chatGroup.announcement = jsonParser.getValueAsString();
                    return true;
                case "onlineCount":
                    chatGroup.onlineCount = jsonParser.getValueAsInt();
                    return true;
                case "inModeration":
                    chatGroup.inModeration = (InModeration) InModeration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "adminLimit":
                    chatGroup.adminLimit = jsonParser.getValueAsInt();
                    return true;
                case "localMembersLoaded":
                    chatGroup.localMembersLoaded = jsonParser.getValueAsBoolean();
                    return true;
                case "permissions":
                    chatGroup.permissions = (Permissions) Permissions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "groupTopic":
                    chatGroup.groupTopic = (ChatGroupTopic) ChatGroupTopic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "localConId":
                    chatGroup.localConId = jsonParser.getValueAsString();
                    return true;
                case "publicId":
                    chatGroup.publicId = jsonParser.getValueAsString();
                    return true;
                case "memberIds":
                    chatGroup.memberIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "memberCount":
                    chatGroup.memberCount = jsonParser.getValueAsInt();
                    return true;
                case "memberLimit":
                    chatGroup.memberLimit = jsonParser.getValueAsInt();
                    return true;
                case "upgraded":
                    chatGroup.upgraded = jsonParser.getValueAsBoolean();
                    return true;
                case "creatorUserId":
                    chatGroup.creatorUserId = jsonParser.getValueAsString();
                    return true;
                case "joinCondition":
                    chatGroup.joinCondition = (JoinCondition) JoinCondition.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "silence":
                    chatGroup.silence = (ChatGroupSilence) ChatGroupSilence.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGroup chatGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "shareToken":
                case "description":
                case "memberStatistics":
                case "punishment":
                case "source":
                case "status":
                case "avatars":
                case "updatedTime":
                case "createdTime":
                case "adminUserIds":
                case "joinRemainedTime":
                case "ownerUserId":
                case "expiredTime":
                    return true;
                case "id":
                    return false;
                case "name":
                case "tags":
                case "type":
                case "category":
                case "token":
                case "announcement":
                case "onlineCount":
                case "inModeration":
                case "adminLimit":
                case "localMembersLoaded":
                case "permissions":
                case "groupTopic":
                case "localConId":
                case "publicId":
                case "memberIds":
                case "memberCount":
                case "memberLimit":
                case "upgraded":
                case "creatorUserId":
                case "joinCondition":
                case "silence":
                    return true;
                default:
                    return super.parseFieldCheck(chatGroup, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatGroup chatGroup, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) chatGroup).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = chatGroup.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (chatGroup.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(chatGroup.avatars, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
            String str3 = chatGroup.announcement;
            if (str3 != null) {
                jsonGenerator.writeStringField("announcement", str3);
            }
            if (chatGroup.status != null) {
                jsonGenerator.writeFieldName("status");
                ChatGroupStatus.JSON_ADAPTER.serialize(chatGroup.status, jsonGenerator, true);
            }
            String str4 = chatGroup.localConId;
            if (str4 != null) {
                jsonGenerator.writeStringField("localConId", str4);
            }
            String str5 = chatGroup.ownerUserId;
            if (str5 != null) {
                jsonGenerator.writeStringField("ownerUserId", str5);
            }
            if (chatGroup.adminUserIds != null) {
                jsonGenerator.writeFieldName("adminUserIds");
                JsonAdapter.serializeArray(chatGroup.adminUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str6 = chatGroup.creatorUserId;
            if (str6 != null) {
                jsonGenerator.writeStringField("creatorUserId", str6);
            }
            if (chatGroup.groupType != null) {
                jsonGenerator.writeFieldName("type");
                ChatGroupType.JSON_ADAPTER.serialize(chatGroup.groupType, jsonGenerator, true);
            }
            if (chatGroup.memberIds != null) {
                jsonGenerator.writeFieldName("memberIds");
                JsonAdapter.serializeArray(chatGroup.memberIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("memberCount", chatGroup.memberCount);
            jsonGenerator.writeNumberField("memberLimit", chatGroup.memberLimit);
            if (chatGroup.memberStatistics != null) {
                jsonGenerator.writeFieldName("memberStatistics");
                JsonAdapter.serializeArray(chatGroup.memberStatistics, jsonGenerator, GroupMemberStatistic.JSON_ADAPTER);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(chatGroup.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("updatedTime");
            jsonAdapter.serialize(Double.valueOf(chatGroup.updatedTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("localMembersLoaded", chatGroup.localMembersLoaded);
            String str7 = chatGroup.publicId;
            if (str7 != null) {
                jsonGenerator.writeStringField("publicId", str7);
            }
            if (chatGroup.category != null) {
                jsonGenerator.writeFieldName("category");
                ChatGroupCateGory.JSON_ADAPTER.serialize(chatGroup.category, jsonGenerator, true);
            }
            String str8 = chatGroup.description;
            if (str8 != null) {
                jsonGenerator.writeStringField("description", str8);
            }
            if (chatGroup.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(chatGroup.tags, jsonGenerator, ChatGroupTag.JSON_ADAPTER);
            }
            if (chatGroup.silence != null) {
                jsonGenerator.writeFieldName("silence");
                ChatGroupSilence.JSON_ADAPTER.serialize(chatGroup.silence, jsonGenerator, true);
            }
            if (chatGroup.punishment != null) {
                jsonGenerator.writeFieldName("punishment");
                ChatPunishment.JSON_ADAPTER.serialize(chatGroup.punishment, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("expiredTime", chatGroup.expiredTime);
            jsonGenerator.writeNumberField("joinRemainedTime", chatGroup.joinRemainedTime);
            String str9 = chatGroup.source;
            if (str9 != null) {
                jsonGenerator.writeStringField("source", str9);
            }
            String str10 = chatGroup.token;
            if (str10 != null) {
                jsonGenerator.writeStringField("token", str10);
            }
            if (chatGroup.groupTopic != null) {
                jsonGenerator.writeFieldName("groupTopic");
                ChatGroupTopic.JSON_ADAPTER.serialize(chatGroup.groupTopic, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("upgraded", chatGroup.upgraded);
            jsonGenerator.writeNumberField("duration", chatGroup.duration);
            if (chatGroup.joinCondition != null) {
                jsonGenerator.writeFieldName("joinCondition");
                JoinCondition.JSON_ADAPTER.serialize(chatGroup.joinCondition, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("onlineCount", chatGroup.onlineCount);
            jsonGenerator.writeNumberField("adminLimit", chatGroup.adminLimit);
            if (chatGroup.permissions != null) {
                jsonGenerator.writeFieldName(Permissions.TYPE);
                Permissions.JSON_ADAPTER.serialize(chatGroup.permissions, jsonGenerator, true);
            }
            if (chatGroup.inModeration != null) {
                jsonGenerator.writeFieldName("inModeration");
                InModeration.JSON_ADAPTER.serialize(chatGroup.inModeration, jsonGenerator, true);
            }
            String str11 = chatGroup.shareToken;
            if (str11 != null) {
                jsonGenerator.writeStringField("shareToken", str11);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<ChatGroup> _ID = new LongColumn<ChatGroup>("_id") { // from class: com.p1.mobile.putong.core.data.ChatGroup.3
        public Long get(ChatGroup chatGroup) {
            return Long.valueOf(((DbObject) chatGroup)._id);
        }

        public void set(ChatGroup chatGroup, Long l2) {
            ((DbObject) chatGroup)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<ChatGroup> f24ID = new StringColumn<ChatGroup>("id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.4
        public String get(ChatGroup chatGroup) {
            return ((DbObject) chatGroup).id;
        }

        public void set(ChatGroup chatGroup, String str) {
            ((DbObject) chatGroup).id = str;
        }
    };
    public static final StringColumn<ChatGroup> NAME = new StringColumn<ChatGroup>("name_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.5
        public String get(ChatGroup chatGroup) {
            return chatGroup.name;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.name = str;
        }
    };
    public static final Column<ChatGroup, List<Picture>> AVATARS = new Column<ChatGroup, List<Picture>>("avatars_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.6
        public List<Picture> get(ChatGroup chatGroup) {
            return chatGroup.avatars;
        }

        public void set(ChatGroup chatGroup, List<Picture> list) {
            chatGroup.avatars = list;
        }
    };
    public static final StringColumn<ChatGroup> ANNOUNCEMENT = new StringColumn<ChatGroup>("announcement_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.7
        public String get(ChatGroup chatGroup) {
            return chatGroup.announcement;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.announcement = str;
        }
    };
    public static final TEnumColumn<ChatGroup, ChatGroupStatus> STATUS = new TEnumColumn<ChatGroup, ChatGroupStatus>("str_status_c", "status_c", ChatGroupStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroup.8
        public ChatGroupStatus get(ChatGroup chatGroup) {
            return chatGroup.status;
        }

        public void setTEnum(ChatGroup chatGroup, ChatGroupStatus chatGroupStatus) {
            chatGroup.status = chatGroupStatus;
        }
    };
    public static final StringColumn<ChatGroup> LOCALCONID = new StringColumn<ChatGroup>("localConId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.9
        public String get(ChatGroup chatGroup) {
            return chatGroup.localConId;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.localConId = str;
        }
    };
    public static final StringColumn<ChatGroup> OWNERUSERID = new StringColumn<ChatGroup>("ownerUserId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.10
        public String get(ChatGroup chatGroup) {
            return chatGroup.ownerUserId;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.ownerUserId = str;
        }
    };
    public static final Column<ChatGroup, List<String>> ADMINUSERIDS = new Column<ChatGroup, List<String>>("adminUserIds_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.11
        public List<String> get(ChatGroup chatGroup) {
            return chatGroup.adminUserIds;
        }

        public void set(ChatGroup chatGroup, List<String> list) {
            chatGroup.adminUserIds = list;
        }
    };
    public static final StringColumn<ChatGroup> CREATORUSERID = new StringColumn<ChatGroup>("creatorUserId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.12
        public String get(ChatGroup chatGroup) {
            return chatGroup.creatorUserId;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.creatorUserId = str;
        }
    };
    public static final TEnumColumn<ChatGroup, ChatGroupType> GROUPTYPE = new TEnumColumn<ChatGroup, ChatGroupType>("str_groupType_c", "groupType_c", ChatGroupType.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroup.13
        public ChatGroupType get(ChatGroup chatGroup) {
            return chatGroup.groupType;
        }

        public void setTEnum(ChatGroup chatGroup, ChatGroupType chatGroupType) {
            chatGroup.groupType = chatGroupType;
        }
    };
    public static final Column<ChatGroup, List<String>> MEMBERIDS = new Column<ChatGroup, List<String>>("memberIds_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.14
        public List<String> get(ChatGroup chatGroup) {
            return chatGroup.memberIds;
        }

        public void set(ChatGroup chatGroup, List<String> list) {
            chatGroup.memberIds = list;
        }
    };
    public static final IntegerColumn<ChatGroup> MEMBERCOUNT = new IntegerColumn<ChatGroup>("memberCount_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.15
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.memberCount);
        }

        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.memberCount = num.intValue();
        }
    };
    public static final IntegerColumn<ChatGroup> MEMBERLIMIT = new IntegerColumn<ChatGroup>("memberLimit_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.16
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.memberLimit);
        }

        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.memberLimit = num.intValue();
        }
    };
    public static final Column<ChatGroup, List<GroupMemberStatistic>> MEMBERSTATISTICS = new Column<ChatGroup, List<GroupMemberStatistic>>("memberStatistics_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.17
        public List<GroupMemberStatistic> get(ChatGroup chatGroup) {
            return chatGroup.memberStatistics;
        }

        public void set(ChatGroup chatGroup, List<GroupMemberStatistic> list) {
            chatGroup.memberStatistics = list;
        }
    };
    public static final DoubleColumn<ChatGroup> CREATEDTIME = new DoubleColumn<ChatGroup>("createdTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.18
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.createdTime);
        }

        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.createdTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatGroup> UPDATEDTIME = new DoubleColumn<ChatGroup>("updatedTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.19
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.updatedTime);
        }

        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.updatedTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroup> LOCALMEMBERSLOADED = new BooleanColumn<ChatGroup>("localMembersLoaded_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.20
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.localMembersLoaded);
        }

        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.localMembersLoaded = bool.booleanValue();
        }
    };
    public static final StringColumn<ChatGroup> PUBLICID = new StringColumn<ChatGroup>("publicId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.21
        public String get(ChatGroup chatGroup) {
            return chatGroup.publicId;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.publicId = str;
        }
    };
    public static final StringColumn<ChatGroup> CATEGORY_ID = new StringColumn<ChatGroup>("category_id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.22
        public String get(ChatGroup chatGroup) {
            return chatGroup.category.f25id;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.category.f25id = str;
        }
    };
    public static final StringColumn<ChatGroup> CATEGORY_NAME = new StringColumn<ChatGroup>("category_name_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.23
        public String get(ChatGroup chatGroup) {
            return chatGroup.category.name;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.category.name = str;
        }
    };
    public static final StringColumn<ChatGroup> CATEGORY_BACKGROUNDCOLOR = new StringColumn<ChatGroup>("category_backgroundColor_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.24
        public String get(ChatGroup chatGroup) {
            return chatGroup.category.backgroundColor;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.category.backgroundColor = str;
        }
    };
    public static final StringColumn<ChatGroup> CATEGORY_TEXTCOLOR = new StringColumn<ChatGroup>("category_textColor_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.25
        public String get(ChatGroup chatGroup) {
            return chatGroup.category.textColor;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.category.textColor = str;
        }
    };
    public static final BooleanColumn<ChatGroup> CATEGORY_HIDDEN = new BooleanColumn<ChatGroup>("category_hidden_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.26
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.category.hidden);
        }

        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.category.hidden = bool.booleanValue();
        }
    };
    public static final StringColumn<ChatGroup> DESCRIPTION = new StringColumn<ChatGroup>("description_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.27
        public String get(ChatGroup chatGroup) {
            return chatGroup.description;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.description = str;
        }
    };
    public static final Column<ChatGroup, List<ChatGroupTag>> TAGS = new Column<ChatGroup, List<ChatGroupTag>>("tags_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.28
        public List<ChatGroupTag> get(ChatGroup chatGroup) {
            return chatGroup.tags;
        }

        public void set(ChatGroup chatGroup, List<ChatGroupTag> list) {
            chatGroup.tags = list;
        }
    };
    public static final StringColumn<ChatGroup> GROUPAPPLY_ID = new StringColumn<ChatGroup>("groupApply_id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.29
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupApply.f66id;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupApply.f66id = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPAPPLY_USERID = new StringColumn<ChatGroup>("groupApply_userId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.30
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupApply.userId;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupApply.userId = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPAPPLY_GROUPID = new StringColumn<ChatGroup>("groupApply_groupId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.31
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupApply.groupId;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupApply.groupId = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPAPPLY_REASON = new StringColumn<ChatGroup>("groupApply_reason_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.32
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupApply.reason;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupApply.reason = str;
        }
    };
    public static final TEnumColumn<ChatGroup, GroupApplyStatus> GROUPAPPLY_STATUS = new TEnumColumn<ChatGroup, GroupApplyStatus>("str_groupApply_status_c", "groupApply_status_c", GroupApplyStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroup.33
        public GroupApplyStatus get(ChatGroup chatGroup) {
            return chatGroup.groupApply.status;
        }

        public void setTEnum(ChatGroup chatGroup, GroupApplyStatus groupApplyStatus) {
            chatGroup.groupApply.status = groupApplyStatus;
        }
    };
    public static final DoubleColumn<ChatGroup> GROUPAPPLY_CREATEDTIME = new DoubleColumn<ChatGroup>("groupApply_createdTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.34
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.groupApply.createdTime);
        }

        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.groupApply.createdTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatGroup> GROUPAPPLY_UPDATEDTIME = new DoubleColumn<ChatGroup>("groupApply_updatedTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.35
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.groupApply.updatedTime);
        }

        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.groupApply.updatedTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroup> SILENCE_ENABLE = new BooleanColumn<ChatGroup>("silence_enable_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.36
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.silence.enable);
        }

        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.silence.enable = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroup> SILENCE_DURATION = new LongColumn<ChatGroup>("silence_duration_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.37
        public Long get(ChatGroup chatGroup) {
            return Long.valueOf(chatGroup.silence.duration);
        }

        public void set(ChatGroup chatGroup, Long l2) {
            chatGroup.silence.duration = l2.longValue();
        }
    };
    public static final DoubleColumn<ChatGroup> SILENCE_UNTIL = new DoubleColumn<ChatGroup>("silence_until_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.38
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.silence.until);
        }

        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.silence.until = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PUNISHMENT_SENDMESSAGE_ACTIVE = new BooleanColumn<ChatGroup>("punishment_sendMessage_active_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.39
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.punishment.sendMessage.active);
        }

        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.punishment.sendMessage.active = bool.booleanValue();
        }
    };
    public static final DoubleColumn<ChatGroup> PUNISHMENT_SENDMESSAGE_UNTIL = new DoubleColumn<ChatGroup>("punishment_sendMessage_until_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.40
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.punishment.sendMessage.until);
        }

        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.punishment.sendMessage.until = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PUNISHMENT_SENDREDPACKET_ACTIVE = new BooleanColumn<ChatGroup>("punishment_sendRedPacket_active_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.41
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.punishment.sendRedPacket.active);
        }

        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.punishment.sendRedPacket.active = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroup> EXPIREDTIME = new LongColumn<ChatGroup>("expiredTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.42
        public Long get(ChatGroup chatGroup) {
            return Long.valueOf(chatGroup.expiredTime);
        }

        public void set(ChatGroup chatGroup, Long l2) {
            chatGroup.expiredTime = l2.longValue();
        }
    };
    public static final IntegerColumn<ChatGroup> JOINREMAINEDTIME = new IntegerColumn<ChatGroup>("joinRemainedTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.43
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.joinRemainedTime);
        }

        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.joinRemainedTime = num.intValue();
        }
    };
    public static final StringColumn<ChatGroup> SOURCE = new StringColumn<ChatGroup>("source_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.44
        public String get(ChatGroup chatGroup) {
            return chatGroup.source;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.source = str;
        }
    };
    public static final StringColumn<ChatGroup> TOKEN = new StringColumn<ChatGroup>("token_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.45
        public String get(ChatGroup chatGroup) {
            return chatGroup.token;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.token = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPTOPIC_ID = new StringColumn<ChatGroup>("groupTopic_id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.46
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupTopic.f27id;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupTopic.f27id = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPTOPIC_OWNER = new StringColumn<ChatGroup>("groupTopic_owner_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.47
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupTopic.owner;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupTopic.owner = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPTOPIC_VALUE = new StringColumn<ChatGroup>("groupTopic_value_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.48
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupTopic.value;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupTopic.value = str;
        }
    };
    public static final Column<ChatGroup, List<Media>> GROUPTOPIC_MEDIAS = new Column<ChatGroup, List<Media>>("groupTopic_medias_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.49
        public List<Media> get(ChatGroup chatGroup) {
            return chatGroup.groupTopic.medias;
        }

        public void set(ChatGroup chatGroup, List<Media> list) {
            chatGroup.groupTopic.medias = list;
        }
    };
    public static final BooleanColumn<ChatGroup> UPGRADED = new BooleanColumn<ChatGroup>("upgraded_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.50
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.upgraded);
        }

        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.upgraded = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroup> DURATION = new LongColumn<ChatGroup>("duration_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.51
        public Long get(ChatGroup chatGroup) {
            return Long.valueOf(chatGroup.duration);
        }

        public void set(ChatGroup chatGroup, Long l2) {
            chatGroup.duration = l2.longValue();
        }
    };
    public static final TEnumColumn<ChatGroup, JoinCondition> JOINCONDITION = new TEnumColumn<ChatGroup, JoinCondition>("joinCondition_c", null, JoinCondition.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroup.52
        public JoinCondition get(ChatGroup chatGroup) {
            return chatGroup.joinCondition;
        }

        public void setTEnum(ChatGroup chatGroup, JoinCondition joinCondition) {
            chatGroup.joinCondition = joinCondition;
        }
    };
    public static final IntegerColumn<ChatGroup> ONLINECOUNT = new IntegerColumn<ChatGroup>("onlineCount_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.53
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.onlineCount);
        }

        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.onlineCount = num.intValue();
        }
    };
    public static final IntegerColumn<ChatGroup> ADMINLIMIT = new IntegerColumn<ChatGroup>("adminLimit_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.54
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.adminLimit);
        }

        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.adminLimit = num.intValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PERMISSIONS_CANSHARETOWECHAT = new BooleanColumn<ChatGroup>("permissions_canShareToWeChat_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.55
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.permissions.canShareToWeChat);
        }

        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.permissions.canShareToWeChat = bool.booleanValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PERMISSIONS_CANSHARETOTANTAN = new BooleanColumn<ChatGroup>("permissions_canShareToTantan_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.56
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.permissions.canShareToTantan);
        }

        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.permissions.canShareToTantan = bool.booleanValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PERMISSIONS_CANCHANGEJOINCONDITION = new BooleanColumn<ChatGroup>("permissions_canChangeJoinCondition_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.57
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.permissions.canChangeJoinCondition);
        }

        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.permissions.canChangeJoinCondition = bool.booleanValue();
        }
    };
    public static final StringColumn<ChatGroup> INMODERATION_NICKNAME = new StringColumn<ChatGroup>("inModeration_nickName_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.58
        public String get(ChatGroup chatGroup) {
            return chatGroup.inModeration.nickName;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.inModeration.nickName = str;
        }
    };
    public static final StringColumn<ChatGroup> INMODERATION_NAME = new StringColumn<ChatGroup>("inModeration_name_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.59
        public String get(ChatGroup chatGroup) {
            return chatGroup.inModeration.name;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.inModeration.name = str;
        }
    };
    public static final StringColumn<ChatGroup> INMODERATION_DESCRIPTION = new StringColumn<ChatGroup>("inModeration_description_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.60
        public String get(ChatGroup chatGroup) {
            return chatGroup.inModeration.description;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.inModeration.description = str;
        }
    };
    public static final StringColumn<ChatGroup> SHARETOKEN = new StringColumn<ChatGroup>("shareToken_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.61
        public String get(ChatGroup chatGroup) {
            return chatGroup.shareToken;
        }

        public void set(ChatGroup chatGroup, String str) {
            chatGroup.shareToken = str;
        }
    };
    public static mrf0<ChatGroup> DB_ADAPTER = new mrf0<ChatGroup>() { // from class: com.p1.mobile.putong.core.data.ChatGroup.62
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,avatars_c BLOB,announcement_c TEXT,status_c INTEGER,localConId_c TEXT,ownerUserId_c TEXT,adminUserIds_c BLOB,creatorUserId_c TEXT,groupType_c INTEGER,memberIds_c BLOB,memberCount_c INTEGER,memberLimit_c INTEGER,memberStatistics_c BLOB,createdTime_c REAL,updatedTime_c REAL,localMembersLoaded_c INTEGER,publicId_c TEXT,category_id_c TEXT,category_name_c TEXT,category_backgroundColor_c TEXT,category_textColor_c TEXT,category_hidden_c INTEGER,description_c TEXT,tags_c BLOB,groupApply_id_c TEXT,groupApply_userId_c TEXT,groupApply_groupId_c TEXT,groupApply_reason_c TEXT,groupApply_status_c INTEGER,groupApply_createdTime_c REAL,groupApply_updatedTime_c REAL,silence_enable_c INTEGER,silence_duration_c INTEGER,silence_until_c REAL,punishment_sendMessage_active_c INTEGER,punishment_sendMessage_until_c REAL,punishment_sendRedPacket_active_c INTEGER,str_status_c TEXT,str_groupType_c TEXT,str_groupApply_status_c TEXT,expiredTime_c INTEGER,joinRemainedTime_c INTEGER,source_c TEXT,token_c TEXT,groupTopic_id_c TEXT,groupTopic_owner_c TEXT,groupTopic_value_c TEXT,groupTopic_medias_c BLOB,upgraded_c INTEGER,duration_c INTEGER,joinCondition_c TEXT,onlineCount_c INTEGER,adminLimit_c INTEGER,permissions_canShareToWeChat_c INTEGER,permissions_canShareToTantan_c INTEGER,permissions_canChangeJoinCondition_c INTEGER,inModeration_nickName_c TEXT,inModeration_name_c TEXT,inModeration_description_c TEXT,shareToken_c TEXT)";
        }

        public Class getDataClass() {
            return ChatGroup.class;
        }

        /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
        public ChatGroup m12017init() {
            ChatGroup chatGroup = new ChatGroup();
            if (chatGroup.name == null) {
                chatGroup.name = "";
            }
            if (chatGroup.avatars == null) {
                chatGroup.avatars = new ArrayList();
            }
            if (chatGroup.announcement == null) {
                chatGroup.announcement = "";
            }
            if (chatGroup.status == null) {
                chatGroup.status = (ChatGroupStatus) ChatGroupStatus.JSON_ADAPTER.defaultEnum();
            }
            if (chatGroup.localConId == null) {
                chatGroup.localConId = "";
            }
            if (chatGroup.ownerUserId == null) {
                chatGroup.ownerUserId = "";
            }
            if (chatGroup.adminUserIds == null) {
                chatGroup.adminUserIds = new ArrayList();
            }
            if (chatGroup.creatorUserId == null) {
                chatGroup.creatorUserId = "";
            }
            if (chatGroup.groupType == null) {
                chatGroup.groupType = (ChatGroupType) ChatGroupType.JSON_ADAPTER.defaultEnum();
            }
            if (chatGroup.memberIds == null) {
                chatGroup.memberIds = new ArrayList();
            }
            if (chatGroup.memberStatistics == null) {
                chatGroup.memberStatistics = new ArrayList();
            }
            if (chatGroup.publicId == null) {
                chatGroup.publicId = "";
            }
            if (chatGroup.category == null) {
                chatGroup.category = ChatGroupCateGory.new_();
            }
            if (chatGroup.description == null) {
                chatGroup.description = "";
            }
            if (chatGroup.tags == null) {
                chatGroup.tags = new ArrayList();
            }
            if (chatGroup.groupApply == null) {
                chatGroup.groupApply = GroupApply.new_();
            }
            if (chatGroup.silence == null) {
                chatGroup.silence = ChatGroupSilence.new_();
            }
            if (chatGroup.punishment == null) {
                chatGroup.punishment = ChatPunishment.new_();
            }
            if (chatGroup.source == null) {
                chatGroup.source = "";
            }
            if (chatGroup.token == null) {
                chatGroup.token = "";
            }
            if (chatGroup.groupTopic == null) {
                chatGroup.groupTopic = ChatGroupTopic.new_();
            }
            if (chatGroup.joinCondition == null) {
                chatGroup.joinCondition = (JoinCondition) JoinCondition.JSON_ADAPTER.defaultEnum();
            }
            if (chatGroup.permissions == null) {
                chatGroup.permissions = Permissions.new_();
            }
            if (chatGroup.inModeration == null) {
                chatGroup.inModeration = InModeration.new_();
            }
            if (chatGroup.shareToken == null) {
                chatGroup.shareToken = "";
            }
            return chatGroup;
        }

        /* JADX WARN: Code duplicated, block: B:214:0x0462  */
        /* JADX WARN: Code duplicated, block: B:217:0x0468  */
        /* JADX WARN: Code duplicated, block: B:220:0x0473  */
        /* JADX WARN: Code duplicated, block: B:223:0x0479  */
        /* JADX WARN: Code duplicated, block: B:226:0x0485  */
        /* JADX WARN: Code duplicated, block: B:229:0x048b  */
        /* JADX WARN: Code duplicated, block: B:232:0x0491  */
        /* JADX WARN: Code duplicated, block: B:235:0x049c  */
        /* JADX WARN: Code duplicated, block: B:238:0x04a2  */
        /* JADX WARN: Code duplicated, block: B:241:0x04ae  */
        /* JADX WARN: Code duplicated, block: B:244:0x04b9  */
        /* JADX WARN: Code duplicated, block: B:247:0x04c4  */
        /* JADX WARN: Code duplicated, block: B:250:0x04ca  */
        /* JADX WARN: Code duplicated, block: B:253:0x04d4  */
        /* JADX WARN: Code duplicated, block: B:256:0x04da  */
        /* JADX WARN: Code duplicated, block: B:259:0x04e5  */
        /* JADX WARN: Code duplicated, block: B:262:0x04ef  */
        /* JADX WARN: Code duplicated, block: B:265:0x04f9  */
        /* JADX WARN: Code duplicated, block: B:268:0x0503  */
        /* JADX WARN: Code duplicated, block: B:271:0x0509  */
        /* JADX WARN: Code duplicated, block: B:274:0x050f  */
        /* JADX WARN: Code duplicated, block: B:277:0x0519  */
        /* JADX WARN: Code duplicated, block: B:280:0x0527  */
        /* JADX WARN: Code duplicated, block: B:283:0x0531  */
        /* JADX WARN: Code duplicated, block: B:286:0x053b  */
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public ChatGroup m12018read(Cursor cursor, int i) {
            String str;
            String string;
            int i2;
            int i3;
            String string2;
            int i4;
            TEnumJsonAdapter<ChatGroupStatus> tEnumJsonAdapter;
            TEnumJsonAdapter<ChatGroupType> tEnumJsonAdapter2;
            String string3 = "unknown_";
            if (i == 0) {
                ((mrf0) this).readIndex = 0;
            }
            ChatGroup chatGroup = new ChatGroup();
            int i5 = -1;
            try {
                chatGroup.category = new ChatGroupCateGory();
                chatGroup.groupApply = new GroupApply();
                chatGroup.silence = new ChatGroupSilence();
                chatGroup.punishment = new ChatPunishment();
                chatGroup.groupTopic = new ChatGroupTopic();
                chatGroup.permissions = new Permissions();
                chatGroup.inModeration = new InModeration();
                chatGroup.punishment.sendMessage = new ChatSendMessage();
                chatGroup.punishment.sendRedPacket = new SendRedPacket();
                ((DbObject) chatGroup)._id = cursor.getLong(i);
                int i6 = i + 1;
                String string4 = null;
                ((DbObject) chatGroup).id = cursor.isNull(i6) ? null : cursor.getString(i6);
                int i7 = i + 2;
                chatGroup.name = cursor.isNull(i7) ? null : cursor.getString(i7);
                int i8 = i + 3;
                chatGroup.avatars = cursor.isNull(i8) ? null : (List) Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i8));
                int i9 = i + 4;
                chatGroup.announcement = cursor.isNull(i9) ? null : cursor.getString(i9);
                int i10 = i + 5;
                i4 = cursor.isNull(i10) ? -1 : cursor.getInt(i10);
                int i11 = i + 6;
                try {
                    chatGroup.localConId = cursor.isNull(i11) ? null : cursor.getString(i11);
                    int i12 = i + 7;
                    chatGroup.ownerUserId = cursor.isNull(i12) ? null : cursor.getString(i12);
                    int i13 = i + 8;
                    chatGroup.adminUserIds = cursor.isNull(i13) ? null : (List) ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i13));
                    int i14 = i + 9;
                    chatGroup.creatorUserId = cursor.isNull(i14) ? null : cursor.getString(i14);
                    int i15 = i + 10;
                    i3 = cursor.isNull(i15) ? -1 : cursor.getInt(i15);
                    int i16 = i + 11;
                    try {
                        chatGroup.memberIds = cursor.isNull(i16) ? null : (List) ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i16));
                        chatGroup.memberCount = cursor.getInt(i + 12);
                        chatGroup.memberLimit = cursor.getInt(i + 13);
                        int i17 = i + 14;
                        chatGroup.memberStatistics = cursor.isNull(i17) ? null : (List) GroupMemberStatistic.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i17));
                        chatGroup.createdTime = cursor.getDouble(i + 15);
                        chatGroup.updatedTime = cursor.getDouble(i + 16);
                        chatGroup.localMembersLoaded = cursor.getInt(i + 17) == 1;
                        int i18 = i + 18;
                        chatGroup.publicId = cursor.isNull(i18) ? null : cursor.getString(i18);
                        int i19 = i + 19;
                        chatGroup.category.f25id = cursor.isNull(i19) ? null : cursor.getString(i19);
                        int i20 = i + 20;
                        chatGroup.category.name = cursor.isNull(i20) ? null : cursor.getString(i20);
                        int i21 = i + 21;
                        chatGroup.category.backgroundColor = cursor.isNull(i21) ? null : cursor.getString(i21);
                        int i22 = i + 22;
                        chatGroup.category.textColor = cursor.isNull(i22) ? null : cursor.getString(i22);
                        chatGroup.category.hidden = cursor.getInt(i + 23) == 1;
                        int i23 = i + 24;
                        chatGroup.description = cursor.isNull(i23) ? null : cursor.getString(i23);
                        int i24 = i + 25;
                        chatGroup.tags = cursor.isNull(i24) ? null : (List) ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i24));
                        int i25 = i + 26;
                        chatGroup.groupApply.f66id = cursor.isNull(i25) ? null : cursor.getString(i25);
                        int i26 = i + 27;
                        chatGroup.groupApply.userId = cursor.isNull(i26) ? null : cursor.getString(i26);
                        int i27 = i + 28;
                        chatGroup.groupApply.groupId = cursor.isNull(i27) ? null : cursor.getString(i27);
                        int i28 = i + 29;
                        chatGroup.groupApply.reason = cursor.isNull(i28) ? null : cursor.getString(i28);
                        int i29 = i + 30;
                        if (!cursor.isNull(i29)) {
                            i5 = cursor.getInt(i29);
                        }
                        chatGroup.groupApply.createdTime = cursor.getDouble(i + 31);
                        chatGroup.groupApply.updatedTime = cursor.getDouble(i + 32);
                        chatGroup.silence.enable = cursor.getInt(i + 33) == 1;
                        chatGroup.silence.duration = cursor.getLong(i + 34);
                        chatGroup.silence.until = cursor.getDouble(i + 35);
                        chatGroup.punishment.sendMessage.active = cursor.getInt(i + 36) == 1;
                        chatGroup.punishment.sendMessage.until = cursor.getDouble(i + 37);
                        chatGroup.punishment.sendRedPacket.active = cursor.getInt(i + 38) == 1;
                        int i30 = i + 39;
                        string2 = cursor.isNull(i30) ? null : cursor.getString(i30);
                        int i31 = i + 40;
                        try {
                            string = cursor.isNull(i31) ? null : cursor.getString(i31);
                            int i32 = i + 41;
                            try {
                                string3 = cursor.isNull(i32) ? null : cursor.getString(i32);
                                chatGroup.expiredTime = cursor.getLong(i + 42);
                                chatGroup.joinRemainedTime = cursor.getInt(i + 43);
                                int i33 = i + 44;
                                chatGroup.source = cursor.isNull(i33) ? null : cursor.getString(i33);
                                int i34 = i + 45;
                                chatGroup.token = cursor.isNull(i34) ? null : cursor.getString(i34);
                                int i35 = i + 46;
                                chatGroup.groupTopic.f27id = cursor.isNull(i35) ? null : cursor.getString(i35);
                                int i36 = i + 47;
                                chatGroup.groupTopic.owner = cursor.isNull(i36) ? null : cursor.getString(i36);
                                int i37 = i + 48;
                                chatGroup.groupTopic.value = cursor.isNull(i37) ? null : cursor.getString(i37);
                                int i38 = i + 49;
                                chatGroup.groupTopic.medias = cursor.isNull(i38) ? null : (List) Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i38));
                                chatGroup.upgraded = cursor.getInt(i + 50) == 1;
                                chatGroup.duration = cursor.getLong(i + 51);
                                int i39 = i + 52;
                                chatGroup.joinCondition = cursor.isNull(i39) ? null : JoinCondition.get(cursor.getString(i39));
                                chatGroup.onlineCount = cursor.getInt(i + 53);
                                chatGroup.adminLimit = cursor.getInt(i + 54);
                                chatGroup.permissions.canShareToWeChat = cursor.getInt(i + 55) == 1;
                                chatGroup.permissions.canShareToTantan = cursor.getInt(i + 56) == 1;
                                chatGroup.permissions.canChangeJoinCondition = cursor.getInt(i + 57) == 1;
                                int i40 = i + 58;
                                chatGroup.inModeration.nickName = cursor.isNull(i40) ? null : cursor.getString(i40);
                                int i41 = i + 59;
                                chatGroup.inModeration.name = cursor.isNull(i41) ? null : cursor.getString(i41);
                                int i42 = i + 60;
                                chatGroup.inModeration.description = cursor.isNull(i42) ? null : cursor.getString(i42);
                                int i43 = i + 61;
                                if (!cursor.isNull(i43)) {
                                    string4 = cursor.getString(i43);
                                }
                                chatGroup.shareToken = string4;
                                ((mrf0) this).readIndex = i + 62;
                            } catch (Exception e) {
                                e = e;
                                str = string3;
                                i2 = i5;
                                i5 = i4;
                                string3 = string2;
                                MessageNano.reportError(e, cursor);
                                string2 = string3;
                                i4 = i5;
                                string3 = str;
                                i5 = i2;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = "unknown_";
                            string = str;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str = "unknown_";
                        string = str;
                        i2 = i5;
                        i5 = i4;
                        MessageNano.reportError(e, cursor);
                        string2 = string3;
                        i4 = i5;
                        string3 = str;
                        i5 = i2;
                        tEnumJsonAdapter = ChatGroupStatus.JSON_ADAPTER;
                        chatGroup.status = (ChatGroupStatus) tEnumJsonAdapter.newTEnum(string2, i4);
                        tEnumJsonAdapter2 = ChatGroupType.JSON_ADAPTER;
                        chatGroup.groupType = (ChatGroupType) tEnumJsonAdapter2.newTEnum(string, i3);
                        chatGroup.groupApply.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.newTEnum(string3, i5);
                        if (chatGroup.name == null) {
                            chatGroup.name = "";
                        }
                        if (chatGroup.avatars == null) {
                            chatGroup.avatars = new ArrayList();
                        }
                        if (chatGroup.announcement == null) {
                            chatGroup.announcement = "";
                        }
                        if (chatGroup.status == null) {
                            chatGroup.status = (ChatGroupStatus) tEnumJsonAdapter.defaultEnum();
                        }
                        if (chatGroup.localConId == null) {
                            chatGroup.localConId = "";
                        }
                        if (chatGroup.ownerUserId == null) {
                            chatGroup.ownerUserId = "";
                        }
                        if (chatGroup.adminUserIds == null) {
                            chatGroup.adminUserIds = new ArrayList();
                        }
                        if (chatGroup.creatorUserId == null) {
                            chatGroup.creatorUserId = "";
                        }
                        if (chatGroup.groupType == null) {
                            chatGroup.groupType = (ChatGroupType) tEnumJsonAdapter2.defaultEnum();
                        }
                        if (chatGroup.memberIds == null) {
                            chatGroup.memberIds = new ArrayList();
                        }
                        if (chatGroup.memberStatistics == null) {
                            chatGroup.memberStatistics = new ArrayList();
                        }
                        if (chatGroup.publicId == null) {
                            chatGroup.publicId = "";
                        }
                        if (chatGroup.category == null) {
                            chatGroup.category = ChatGroupCateGory.new_();
                        }
                        if (chatGroup.description == null) {
                            chatGroup.description = "";
                        }
                        if (chatGroup.tags == null) {
                            chatGroup.tags = new ArrayList();
                        }
                        if (chatGroup.groupApply == null) {
                            chatGroup.groupApply = GroupApply.new_();
                        }
                        if (chatGroup.silence == null) {
                            chatGroup.silence = ChatGroupSilence.new_();
                        }
                        if (chatGroup.punishment == null) {
                            chatGroup.punishment = ChatPunishment.new_();
                        }
                        if (chatGroup.source == null) {
                            chatGroup.source = "";
                        }
                        if (chatGroup.token == null) {
                            chatGroup.token = "";
                        }
                        if (chatGroup.groupTopic == null) {
                            chatGroup.groupTopic = ChatGroupTopic.new_();
                        }
                        if (chatGroup.joinCondition == null) {
                            chatGroup.joinCondition = (JoinCondition) JoinCondition.JSON_ADAPTER.defaultEnum();
                        }
                        if (chatGroup.permissions == null) {
                            chatGroup.permissions = Permissions.new_();
                        }
                        if (chatGroup.inModeration == null) {
                            chatGroup.inModeration = InModeration.new_();
                        }
                        if (chatGroup.shareToken == null) {
                            chatGroup.shareToken = "";
                        }
                        return chatGroup;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str = "unknown_";
                    string = str;
                    i2 = -1;
                    i3 = -1;
                }
            } catch (Exception e5) {
                e = e5;
                str = "unknown_";
                string = str;
                i2 = -1;
                i3 = -1;
            }
            tEnumJsonAdapter = ChatGroupStatus.JSON_ADAPTER;
            chatGroup.status = (ChatGroupStatus) tEnumJsonAdapter.newTEnum(string2, i4);
            tEnumJsonAdapter2 = ChatGroupType.JSON_ADAPTER;
            chatGroup.groupType = (ChatGroupType) tEnumJsonAdapter2.newTEnum(string, i3);
            chatGroup.groupApply.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.newTEnum(string3, i5);
            if (chatGroup.name == null) {
                chatGroup.name = "";
            }
            if (chatGroup.avatars == null) {
                chatGroup.avatars = new ArrayList();
            }
            if (chatGroup.announcement == null) {
                chatGroup.announcement = "";
            }
            if (chatGroup.status == null) {
                chatGroup.status = (ChatGroupStatus) tEnumJsonAdapter.defaultEnum();
            }
            if (chatGroup.localConId == null) {
                chatGroup.localConId = "";
            }
            if (chatGroup.ownerUserId == null) {
                chatGroup.ownerUserId = "";
            }
            if (chatGroup.adminUserIds == null) {
                chatGroup.adminUserIds = new ArrayList();
            }
            if (chatGroup.creatorUserId == null) {
                chatGroup.creatorUserId = "";
            }
            if (chatGroup.groupType == null) {
                chatGroup.groupType = (ChatGroupType) tEnumJsonAdapter2.defaultEnum();
            }
            if (chatGroup.memberIds == null) {
                chatGroup.memberIds = new ArrayList();
            }
            if (chatGroup.memberStatistics == null) {
                chatGroup.memberStatistics = new ArrayList();
            }
            if (chatGroup.publicId == null) {
                chatGroup.publicId = "";
            }
            if (chatGroup.category == null) {
                chatGroup.category = ChatGroupCateGory.new_();
            }
            if (chatGroup.description == null) {
                chatGroup.description = "";
            }
            if (chatGroup.tags == null) {
                chatGroup.tags = new ArrayList();
            }
            if (chatGroup.groupApply == null) {
                chatGroup.groupApply = GroupApply.new_();
            }
            if (chatGroup.silence == null) {
                chatGroup.silence = ChatGroupSilence.new_();
            }
            if (chatGroup.punishment == null) {
                chatGroup.punishment = ChatPunishment.new_();
            }
            if (chatGroup.source == null) {
                chatGroup.source = "";
            }
            if (chatGroup.token == null) {
                chatGroup.token = "";
            }
            if (chatGroup.groupTopic == null) {
                chatGroup.groupTopic = ChatGroupTopic.new_();
            }
            if (chatGroup.joinCondition == null) {
                chatGroup.joinCondition = (JoinCondition) JoinCondition.JSON_ADAPTER.defaultEnum();
            }
            if (chatGroup.permissions == null) {
                chatGroup.permissions = Permissions.new_();
            }
            if (chatGroup.inModeration == null) {
                chatGroup.inModeration = InModeration.new_();
            }
            if (chatGroup.shareToken == null) {
                chatGroup.shareToken = "";
            }
            return chatGroup;
        }

        public void write(ChatGroup chatGroup, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) chatGroup).id);
                DbObject.cvPut(contentValues, "name_c", chatGroup.name);
                DbObject.cvPut(contentValues, "avatars_c", chatGroup.avatars == null ? null : Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(chatGroup.avatars));
                DbObject.cvPut(contentValues, "announcement_c", chatGroup.announcement);
                ChatGroupStatus chatGroupStatus = chatGroup.status;
                DbObject.cvPut(contentValues, "str_status_c", chatGroupStatus == null ? null : chatGroupStatus.toString());
                ChatGroupStatus chatGroupStatus2 = chatGroup.status;
                DbObject.cvPut(contentValues, "status_c", chatGroupStatus2 == null ? null : Integer.valueOf(chatGroupStatus2.ordinal()));
                DbObject.cvPut(contentValues, "localConId_c", chatGroup.localConId);
                DbObject.cvPut(contentValues, "ownerUserId_c", chatGroup.ownerUserId);
                DbObject.cvPut(contentValues, "adminUserIds_c", chatGroup.adminUserIds == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(chatGroup.adminUserIds));
                DbObject.cvPut(contentValues, "creatorUserId_c", chatGroup.creatorUserId);
                ChatGroupType chatGroupType = chatGroup.groupType;
                DbObject.cvPut(contentValues, "str_groupType_c", chatGroupType == null ? null : chatGroupType.toString());
                ChatGroupType chatGroupType2 = chatGroup.groupType;
                DbObject.cvPut(contentValues, "groupType_c", chatGroupType2 == null ? null : Integer.valueOf(chatGroupType2.ordinal()));
                DbObject.cvPut(contentValues, "memberIds_c", chatGroup.memberIds == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(chatGroup.memberIds));
                DbObject.cvPut(contentValues, "memberCount_c", Integer.valueOf(chatGroup.memberCount));
                DbObject.cvPut(contentValues, "memberLimit_c", Integer.valueOf(chatGroup.memberLimit));
                DbObject.cvPut(contentValues, "memberStatistics_c", chatGroup.memberStatistics == null ? null : GroupMemberStatistic.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(chatGroup.memberStatistics));
                DbObject.cvPut(contentValues, "createdTime_c", Double.valueOf(chatGroup.createdTime));
                DbObject.cvPut(contentValues, "updatedTime_c", Double.valueOf(chatGroup.updatedTime));
                DbObject.cvPut(contentValues, "localMembersLoaded_c", Integer.valueOf(chatGroup.localMembersLoaded ? 1 : 0));
                DbObject.cvPut(contentValues, "publicId_c", chatGroup.publicId);
                DbObject.cvPut(contentValues, "category_id_c", chatGroup.category.f25id);
                DbObject.cvPut(contentValues, "category_name_c", chatGroup.category.name);
                DbObject.cvPut(contentValues, "category_backgroundColor_c", chatGroup.category.backgroundColor);
                DbObject.cvPut(contentValues, "category_textColor_c", chatGroup.category.textColor);
                DbObject.cvPut(contentValues, "category_hidden_c", Integer.valueOf(chatGroup.category.hidden ? 1 : 0));
                DbObject.cvPut(contentValues, "description_c", chatGroup.description);
                DbObject.cvPut(contentValues, "tags_c", chatGroup.tags == null ? null : ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(chatGroup.tags));
                DbObject.cvPut(contentValues, "groupApply_id_c", chatGroup.groupApply.f66id);
                DbObject.cvPut(contentValues, "groupApply_userId_c", chatGroup.groupApply.userId);
                DbObject.cvPut(contentValues, "groupApply_groupId_c", chatGroup.groupApply.groupId);
                DbObject.cvPut(contentValues, "groupApply_reason_c", chatGroup.groupApply.reason);
                GroupApplyStatus groupApplyStatus = chatGroup.groupApply.status;
                DbObject.cvPut(contentValues, "str_groupApply_status_c", groupApplyStatus == null ? null : groupApplyStatus.toString());
                GroupApplyStatus groupApplyStatus2 = chatGroup.groupApply.status;
                DbObject.cvPut(contentValues, "groupApply_status_c", groupApplyStatus2 == null ? null : Integer.valueOf(groupApplyStatus2.ordinal()));
                DbObject.cvPut(contentValues, "groupApply_createdTime_c", Double.valueOf(chatGroup.groupApply.createdTime));
                DbObject.cvPut(contentValues, "groupApply_updatedTime_c", Double.valueOf(chatGroup.groupApply.updatedTime));
                DbObject.cvPut(contentValues, "silence_enable_c", Integer.valueOf(chatGroup.silence.enable ? 1 : 0));
                DbObject.cvPut(contentValues, "silence_duration_c", Long.valueOf(chatGroup.silence.duration));
                DbObject.cvPut(contentValues, "silence_until_c", Double.valueOf(chatGroup.silence.until));
                DbObject.cvPut(contentValues, "punishment_sendMessage_active_c", Integer.valueOf(chatGroup.punishment.sendMessage.active ? 1 : 0));
                DbObject.cvPut(contentValues, "punishment_sendMessage_until_c", Double.valueOf(chatGroup.punishment.sendMessage.until));
                DbObject.cvPut(contentValues, "punishment_sendRedPacket_active_c", Integer.valueOf(chatGroup.punishment.sendRedPacket.active ? 1 : 0));
                DbObject.cvPut(contentValues, "expiredTime_c", Long.valueOf(chatGroup.expiredTime));
                DbObject.cvPut(contentValues, "joinRemainedTime_c", Integer.valueOf(chatGroup.joinRemainedTime));
                DbObject.cvPut(contentValues, "source_c", chatGroup.source);
                DbObject.cvPut(contentValues, "token_c", chatGroup.token);
                DbObject.cvPut(contentValues, "groupTopic_id_c", chatGroup.groupTopic.f27id);
                DbObject.cvPut(contentValues, "groupTopic_owner_c", chatGroup.groupTopic.owner);
                DbObject.cvPut(contentValues, "groupTopic_value_c", chatGroup.groupTopic.value);
                DbObject.cvPut(contentValues, "groupTopic_medias_c", chatGroup.groupTopic.medias == null ? null : Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(chatGroup.groupTopic.medias));
                DbObject.cvPut(contentValues, "upgraded_c", Integer.valueOf(chatGroup.upgraded ? 1 : 0));
                DbObject.cvPut(contentValues, "duration_c", Long.valueOf(chatGroup.duration));
                JoinCondition joinCondition = chatGroup.joinCondition;
                DbObject.cvPut(contentValues, "joinCondition_c", joinCondition == null ? null : joinCondition.toString());
                DbObject.cvPut(contentValues, "onlineCount_c", Integer.valueOf(chatGroup.onlineCount));
                DbObject.cvPut(contentValues, "adminLimit_c", Integer.valueOf(chatGroup.adminLimit));
                DbObject.cvPut(contentValues, "permissions_canShareToWeChat_c", Integer.valueOf(chatGroup.permissions.canShareToWeChat ? 1 : 0));
                DbObject.cvPut(contentValues, "permissions_canShareToTantan_c", Integer.valueOf(chatGroup.permissions.canShareToTantan ? 1 : 0));
                DbObject.cvPut(contentValues, "permissions_canChangeJoinCondition_c", Integer.valueOf(chatGroup.permissions.canChangeJoinCondition ? 1 : 0));
                DbObject.cvPut(contentValues, "inModeration_nickName_c", chatGroup.inModeration.nickName);
                DbObject.cvPut(contentValues, "inModeration_name_c", chatGroup.inModeration.name);
                DbObject.cvPut(contentValues, "inModeration_description_c", chatGroup.inModeration.description);
                DbObject.cvPut(contentValues, "shareToken_c", chatGroup.shareToken);
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m57b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m58c(String str) {
        return str;
    }

    public static ChatGroup new_() {
        ChatGroup chatGroup = new ChatGroup();
        chatGroup.nullCheck();
        return chatGroup;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGroup m12014clone() {
        ChatGroup chatGroup = new ChatGroup();
        ((DbObject) chatGroup)._id = ((DbObject) this)._id;
        ((DbObject) chatGroup).id = ((DbObject) this).id;
        chatGroup.name = this.name;
        List<Picture> list = this.avatars;
        if (list != null) {
            chatGroup.avatars = ValueObject.util_map(list, new w9j() { // from class: l.rt4
                public final Object call(Object obj) {
                    return ((Picture) obj).clone();
                }
            });
        }
        chatGroup.announcement = this.announcement;
        chatGroup.status = this.status;
        chatGroup.localConId = this.localConId;
        chatGroup.ownerUserId = this.ownerUserId;
        List<String> list2 = this.adminUserIds;
        if (list2 != null) {
            chatGroup.adminUserIds = ValueObject.util_map(list2, new w9j() { // from class: l.st4
                public final Object call(Object obj) {
                    return ChatGroup.m58c((String) obj);
                }
            });
        }
        chatGroup.creatorUserId = this.creatorUserId;
        chatGroup.groupType = this.groupType;
        List<String> list3 = this.memberIds;
        if (list3 != null) {
            chatGroup.memberIds = ValueObject.util_map(list3, new w9j() { // from class: l.tt4
                public final Object call(Object obj) {
                    return ChatGroup.m57b((String) obj);
                }
            });
        }
        chatGroup.memberCount = this.memberCount;
        chatGroup.memberLimit = this.memberLimit;
        List<GroupMemberStatistic> list4 = this.memberStatistics;
        if (list4 != null) {
            chatGroup.memberStatistics = ValueObject.util_map(list4, new w9j() { // from class: l.ut4
                public final Object call(Object obj) {
                    return ((GroupMemberStatistic) obj).m13094clone();
                }
            });
        }
        chatGroup.createdTime = this.createdTime;
        chatGroup.updatedTime = this.updatedTime;
        chatGroup.localMembersLoaded = this.localMembersLoaded;
        chatGroup.publicId = this.publicId;
        ChatGroupCateGory chatGroupCateGory = this.category;
        if (chatGroupCateGory != null) {
            chatGroup.category = chatGroupCateGory.m12020clone();
        }
        chatGroup.description = this.description;
        List<ChatGroupTag> list5 = this.tags;
        if (list5 != null) {
            chatGroup.tags = ValueObject.util_map(list5, new w9j() { // from class: l.vt4
                public final Object call(Object obj) {
                    return ((ChatGroupTag) obj).m12038clone();
                }
            });
        }
        GroupApply groupApply = this.groupApply;
        if (groupApply != null) {
            chatGroup.groupApply = groupApply.m13064clone();
        }
        ChatGroupSilence chatGroupSilence = this.silence;
        if (chatGroupSilence != null) {
            chatGroup.silence = chatGroupSilence.m12032clone();
        }
        ChatPunishment chatPunishment = this.punishment;
        if (chatPunishment != null) {
            chatGroup.punishment = chatPunishment.m12136clone();
        }
        chatGroup.expiredTime = this.expiredTime;
        chatGroup.joinRemainedTime = this.joinRemainedTime;
        chatGroup.source = this.source;
        chatGroup.token = this.token;
        ChatGroupTopic chatGroupTopic = this.groupTopic;
        if (chatGroupTopic != null) {
            chatGroup.groupTopic = chatGroupTopic.m12042clone();
        }
        chatGroup.upgraded = this.upgraded;
        chatGroup.duration = this.duration;
        chatGroup.joinCondition = this.joinCondition;
        chatGroup.onlineCount = this.onlineCount;
        chatGroup.adminLimit = this.adminLimit;
        Permissions permissions = this.permissions;
        if (permissions != null) {
            chatGroup.permissions = permissions.m14746clone();
        }
        InModeration inModeration = this.inModeration;
        if (inModeration != null) {
            chatGroup.inModeration = inModeration.m13444clone();
        }
        chatGroup.shareToken = this.shareToken;
        return chatGroup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGroup)) {
            return false;
        }
        ChatGroup chatGroup = (ChatGroup) obj;
        return super.equals(obj) && ValueObject.util_equals(this.name, chatGroup.name) && ValueObject.util_equals(this.avatars, chatGroup.avatars) && ValueObject.util_equals(this.announcement, chatGroup.announcement) && ValueObject.util_equals(this.status, chatGroup.status) && ValueObject.util_equals(this.localConId, chatGroup.localConId) && ValueObject.util_equals(this.ownerUserId, chatGroup.ownerUserId) && ValueObject.util_equals(this.adminUserIds, chatGroup.adminUserIds) && ValueObject.util_equals(this.creatorUserId, chatGroup.creatorUserId) && ValueObject.util_equals(this.groupType, chatGroup.groupType) && ValueObject.util_equals(this.memberIds, chatGroup.memberIds) && this.memberCount == chatGroup.memberCount && this.memberLimit == chatGroup.memberLimit && ValueObject.util_equals(this.memberStatistics, chatGroup.memberStatistics) && this.createdTime == chatGroup.createdTime && this.updatedTime == chatGroup.updatedTime && this.localMembersLoaded == chatGroup.localMembersLoaded && ValueObject.util_equals(this.publicId, chatGroup.publicId) && ValueObject.util_equals(this.category, chatGroup.category) && ValueObject.util_equals(this.description, chatGroup.description) && ValueObject.util_equals(this.tags, chatGroup.tags) && ValueObject.util_equals(this.groupApply, chatGroup.groupApply) && ValueObject.util_equals(this.silence, chatGroup.silence) && ValueObject.util_equals(this.punishment, chatGroup.punishment) && this.expiredTime == chatGroup.expiredTime && this.joinRemainedTime == chatGroup.joinRemainedTime && ValueObject.util_equals(this.source, chatGroup.source) && ValueObject.util_equals(this.token, chatGroup.token) && ValueObject.util_equals(this.groupTopic, chatGroup.groupTopic) && this.upgraded == chatGroup.upgraded && this.duration == chatGroup.duration && ValueObject.util_equals(this.joinCondition, chatGroup.joinCondition) && this.onlineCount == chatGroup.onlineCount && this.adminLimit == chatGroup.adminLimit && ValueObject.util_equals(this.permissions, chatGroup.permissions) && ValueObject.util_equals(this.inModeration, chatGroup.inModeration) && ValueObject.util_equals(this.shareToken, chatGroup.shareToken);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<Picture> list = this.avatars;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.announcement;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        ChatGroupStatus chatGroupStatus = this.status;
        int iHashCode5 = (iHashCode4 + (chatGroupStatus != null ? chatGroupStatus.hashCode() : 0)) * 41;
        String str3 = this.localConId;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.ownerUserId;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list2 = this.adminUserIds;
        int iHashCode8 = (iHashCode7 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str5 = this.creatorUserId;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 41;
        ChatGroupType chatGroupType = this.groupType;
        int iHashCode10 = (iHashCode9 + (chatGroupType != null ? chatGroupType.hashCode() : 0)) * 41;
        List<String> list3 = this.memberIds;
        int iHashCode11 = (((((iHashCode10 + (list3 != null ? list3.hashCode() : 0)) * 41) + this.memberCount) * 41) + this.memberLimit) * 41;
        List<GroupMemberStatistic> list4 = this.memberStatistics;
        int iHashCode12 = list4 != null ? list4.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i2 = ((iHashCode11 + iHashCode12) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.updatedTime);
        int i3 = ((((i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41) + (this.localMembersLoaded ? 1231 : 1237)) * 41;
        String str6 = this.publicId;
        int iHashCode13 = (i3 + (str6 != null ? str6.hashCode() : 0)) * 41;
        ChatGroupCateGory chatGroupCateGory = this.category;
        int iHashCode14 = (iHashCode13 + (chatGroupCateGory != null ? chatGroupCateGory.hashCode() : 0)) * 41;
        String str7 = this.description;
        int iHashCode15 = (iHashCode14 + (str7 != null ? str7.hashCode() : 0)) * 41;
        List<ChatGroupTag> list5 = this.tags;
        int iHashCode16 = (iHashCode15 + (list5 != null ? list5.hashCode() : 0)) * 41;
        GroupApply groupApply = this.groupApply;
        int iHashCode17 = (iHashCode16 + (groupApply != null ? groupApply.hashCode() : 0)) * 41;
        ChatGroupSilence chatGroupSilence = this.silence;
        int iHashCode18 = (iHashCode17 + (chatGroupSilence != null ? chatGroupSilence.hashCode() : 0)) * 41;
        ChatPunishment chatPunishment = this.punishment;
        int iHashCode19 = chatPunishment != null ? chatPunishment.hashCode() : 0;
        long j = this.expiredTime;
        int i4 = (((((iHashCode18 + iHashCode19) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.joinRemainedTime) * 41;
        String str8 = this.source;
        int iHashCode20 = (i4 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.token;
        int iHashCode21 = (iHashCode20 + (str9 != null ? str9.hashCode() : 0)) * 41;
        ChatGroupTopic chatGroupTopic = this.groupTopic;
        int iHashCode22 = (iHashCode21 + (chatGroupTopic != null ? chatGroupTopic.hashCode() : 0)) * 41;
        int i5 = this.upgraded ? 1231 : 1237;
        long j2 = this.duration;
        int i6 = (((iHashCode22 + i5) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        JoinCondition joinCondition = this.joinCondition;
        int iHashCode23 = (((((i6 + (joinCondition != null ? joinCondition.hashCode() : 0)) * 41) + this.onlineCount) * 41) + this.adminLimit) * 41;
        Permissions permissions = this.permissions;
        int iHashCode24 = (iHashCode23 + (permissions != null ? permissions.hashCode() : 0)) * 41;
        InModeration inModeration = this.inModeration;
        int iHashCode25 = (iHashCode24 + (inModeration != null ? inModeration.hashCode() : 0)) * 41;
        String str10 = this.shareToken;
        int iHashCode26 = iHashCode25 + (str10 != null ? str10.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode26;
        return iHashCode26;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(ChatGroup chatGroup) {
        if (!shouldMergeData() || equals(chatGroup)) {
            return;
        }
        if (!isFieldParsed("name")) {
            this.name = chatGroup.name;
        }
        if (!isFieldParsed("avatars")) {
            this.avatars = chatGroup.avatars;
        }
        if (!isFieldParsed("announcement")) {
            this.announcement = chatGroup.announcement;
        }
        if (!isFieldParsed("status")) {
            this.status = chatGroup.status;
        }
        if (!isFieldParsed("localConId")) {
            this.localConId = chatGroup.localConId;
        }
        if (!isFieldParsed("ownerUserId")) {
            this.ownerUserId = chatGroup.ownerUserId;
        }
        if (!isFieldParsed("adminUserIds")) {
            this.adminUserIds = chatGroup.adminUserIds;
        }
        if (!isFieldParsed("creatorUserId")) {
            this.creatorUserId = chatGroup.creatorUserId;
        }
        if (!isFieldParsed("type")) {
            this.groupType = chatGroup.groupType;
        }
        if (!isFieldParsed("memberIds")) {
            this.memberIds = chatGroup.memberIds;
        }
        if (!isFieldParsed("memberCount")) {
            this.memberCount = chatGroup.memberCount;
        }
        if (!isFieldParsed("memberLimit")) {
            this.memberLimit = chatGroup.memberLimit;
        }
        if (!isFieldParsed("memberStatistics")) {
            this.memberStatistics = chatGroup.memberStatistics;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = chatGroup.createdTime;
        }
        if (!isFieldParsed("updatedTime")) {
            this.updatedTime = chatGroup.updatedTime;
        }
        if (!isFieldParsed("localMembersLoaded")) {
            this.localMembersLoaded = chatGroup.localMembersLoaded;
        }
        if (!isFieldParsed("publicId")) {
            this.publicId = chatGroup.publicId;
        }
        if (!isFieldParsed("category")) {
            this.category = chatGroup.category;
        }
        if (!isFieldParsed("description")) {
            this.description = chatGroup.description;
        }
        if (!isFieldParsed("tags")) {
            this.tags = chatGroup.tags;
        }
        if (!isFieldParsed("silence")) {
            this.silence = chatGroup.silence;
        }
        if (!isFieldParsed("punishment")) {
            this.punishment = chatGroup.punishment;
        }
        if (!isFieldParsed("expiredTime")) {
            this.expiredTime = chatGroup.expiredTime;
        }
        if (!isFieldParsed("joinRemainedTime")) {
            this.joinRemainedTime = chatGroup.joinRemainedTime;
        }
        if (!isFieldParsed("source")) {
            this.source = chatGroup.source;
        }
        if (!isFieldParsed("token")) {
            this.token = chatGroup.token;
        }
        if (!isFieldParsed("groupTopic")) {
            this.groupTopic = chatGroup.groupTopic;
        }
        if (!isFieldParsed("upgraded")) {
            this.upgraded = chatGroup.upgraded;
        }
        if (!isFieldParsed("duration")) {
            this.duration = chatGroup.duration;
        }
        if (!isFieldParsed("joinCondition")) {
            this.joinCondition = chatGroup.joinCondition;
        }
        if (!isFieldParsed("onlineCount")) {
            this.onlineCount = chatGroup.onlineCount;
        }
        if (!isFieldParsed("adminLimit")) {
            this.adminLimit = chatGroup.adminLimit;
        }
        if (!isFieldParsed(Permissions.TYPE)) {
            this.permissions = chatGroup.permissions;
        }
        if (!isFieldParsed("inModeration")) {
            this.inModeration = chatGroup.inModeration;
        }
        if (!isFieldParsed("shareToken")) {
            this.shareToken = chatGroup.shareToken;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
        if (this.announcement == null) {
            this.announcement = "";
        }
        if (this.status == null) {
            this.status = (ChatGroupStatus) ChatGroupStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.localConId == null) {
            this.localConId = "";
        }
        if (this.ownerUserId == null) {
            this.ownerUserId = "";
        }
        if (this.adminUserIds == null) {
            this.adminUserIds = new ArrayList();
        }
        if (this.creatorUserId == null) {
            this.creatorUserId = "";
        }
        if (this.groupType == null) {
            this.groupType = (ChatGroupType) ChatGroupType.JSON_ADAPTER.defaultEnum();
        }
        if (this.memberIds == null) {
            this.memberIds = new ArrayList();
        }
        if (this.memberStatistics == null) {
            this.memberStatistics = new ArrayList();
        }
        if (this.publicId == null) {
            this.publicId = "";
        }
        if (this.category == null) {
            this.category = ChatGroupCateGory.new_();
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.groupApply == null) {
            this.groupApply = GroupApply.new_();
        }
        if (this.silence == null) {
            this.silence = ChatGroupSilence.new_();
        }
        if (this.punishment == null) {
            this.punishment = ChatPunishment.new_();
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.token == null) {
            this.token = "";
        }
        if (this.groupTopic == null) {
            this.groupTopic = ChatGroupTopic.new_();
        }
        if (this.joinCondition == null) {
            this.joinCondition = (JoinCondition) JoinCondition.JSON_ADAPTER.defaultEnum();
        }
        if (this.permissions == null) {
            this.permissions = Permissions.new_();
        }
        if (this.inModeration == null) {
            this.inModeration = InModeration.new_();
        }
        if (this.shareToken == null) {
            this.shareToken = "";
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
