package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupTag;
import com.p046p1.mobile.putong.core.data.GroupMemberStatistic;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
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
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
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

    @ProtobufIndex(index = EACTags.COMMAND_TO_PERFORM)
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
    @ProtobufIndex(index = EACTags.DISCRETIONARY_DATA)
    public JoinCondition joinCondition;

    @ProtobufIndex(index = 77)
    public int joinRemainedTime;

    @NonNull
    @ProtobufIndex(index = 55)
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

    @ProtobufIndex(index = EACTags.OFFSET_DATA_OBJECT)
    public int onlineCount;

    @NonNull
    @ProtobufIndex(index = 56)
    public String ownerUserId;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @NonNull
    @ProtobufIndex(index = EACTags.TRACK1_APPLICATION)
    public Permissions permissions;

    @NonNull
    @ProtobufIndex(index = 67)
    public String publicId;

    @NonNull
    @ProtobufIndex(index = EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE)
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

    @ProtobufIndex(index = EACTags.FILE_REFERENCE)
    public boolean upgraded;
    public static ProtobufAdapter<ChatGroup> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroup>() { // from class: com.p1.mobile.putong.core.data.ChatGroup.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatGroup chatGroup) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, chatGroup._id);
            String str = chatGroup.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = chatGroup.name;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(51, str2);
            }
            List<Picture> list = chatGroup.avatars;
            if (list != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(52, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGroup.announcement;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(53, str3);
            }
            ChatGroupStatus chatGroupStatus = chatGroup.status;
            if (chatGroupStatus != null) {
                iM17228j += CodedOutputByteBufferNano.m17226h(54, chatGroupStatus.ordinal());
            }
            String str4 = chatGroup.localConId;
            if (str4 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(55, str4);
            }
            String str5 = chatGroup.ownerUserId;
            if (str5 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(56, str5);
            }
            List<String> list2 = chatGroup.adminUserIds;
            if (list2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(57, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = chatGroup.creatorUserId;
            if (str6 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(58, str6);
            }
            ChatGroupType chatGroupType = chatGroup.groupType;
            if (chatGroupType != null) {
                iM17228j += CodedOutputByteBufferNano.m17226h(59, chatGroupType.ordinal());
            }
            List<String> list3 = chatGroup.memberIds;
            if (list3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(60, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h = iM17228j + CodedOutputByteBufferNano.m17226h(61, chatGroup.memberCount) + CodedOutputByteBufferNano.m17226h(62, chatGroup.memberLimit);
            List<GroupMemberStatistic> list4 = chatGroup.memberStatistics;
            if (list4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(63, list4, GroupMemberStatistic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17222d = iM17226h + CodedOutputByteBufferNano.m17222d(64, chatGroup.createdTime) + CodedOutputByteBufferNano.m17222d(65, chatGroup.updatedTime) + CodedOutputByteBufferNano.m17220b(66, chatGroup.localMembersLoaded);
            String str7 = chatGroup.publicId;
            if (str7 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(67, str7);
            }
            ChatGroupCateGory chatGroupCateGory = chatGroup.category;
            if (chatGroupCateGory != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(68, chatGroupCateGory, ChatGroupCateGory.PROTOBUF_ADAPTER);
            }
            String str8 = chatGroup.description;
            if (str8 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(69, str8);
            }
            List<ChatGroupTag> list5 = chatGroup.tags;
            if (list5 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(70, list5, ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupApply groupApply = chatGroup.groupApply;
            if (groupApply != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(71, groupApply, GroupApply.PROTOBUF_ADAPTER);
            }
            ChatGroupSilence chatGroupSilence = chatGroup.silence;
            if (chatGroupSilence != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(72, chatGroupSilence, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            ChatPunishment chatPunishment = chatGroup.punishment;
            if (chatPunishment != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(73, chatPunishment, ChatPunishment.PROTOBUF_ADAPTER);
            }
            ChatGroupStatus chatGroupStatus2 = chatGroup.status;
            if (chatGroupStatus2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(74, chatGroupStatus2, ChatGroupStatus.PROTOBUF_ADAPTER);
            }
            ChatGroupType chatGroupType2 = chatGroup.groupType;
            if (chatGroupType2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(75, chatGroupType2, ChatGroupType.PROTOBUF_ADAPTER);
            }
            int iM17228j2 = iM17222d + CodedOutputByteBufferNano.m17228j(76, chatGroup.expiredTime) + CodedOutputByteBufferNano.m17226h(77, chatGroup.joinRemainedTime);
            String str9 = chatGroup.source;
            if (str9 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(78, str9);
            }
            String str10 = chatGroup.token;
            if (str10 != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17233o(79, str10);
            }
            ChatGroupTopic chatGroupTopic = chatGroup.groupTopic;
            if (chatGroupTopic != null) {
                iM17228j2 += CodedOutputByteBufferNano.m17230l(80, chatGroupTopic, ChatGroupTopic.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17228j2 + CodedOutputByteBufferNano.m17220b(81, chatGroup.upgraded) + CodedOutputByteBufferNano.m17228j(82, chatGroup.duration);
            JoinCondition joinCondition = chatGroup.joinCondition;
            if (joinCondition != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(83, joinCondition, JoinCondition.PROTOBUF_ADAPTER);
            }
            int iM17226h2 = iM17220b + CodedOutputByteBufferNano.m17226h(84, chatGroup.onlineCount) + CodedOutputByteBufferNano.m17226h(85, chatGroup.adminLimit);
            Permissions permissions = chatGroup.permissions;
            if (permissions != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(86, permissions, Permissions.PROTOBUF_ADAPTER);
            }
            InModeration inModeration = chatGroup.inModeration;
            if (inModeration != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(87, inModeration, InModeration.PROTOBUF_ADAPTER);
            }
            String str11 = chatGroup.shareToken;
            if (str11 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17233o(88, str11);
            }
            chatGroup.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGroup parse(nb5 nb5Var) throws IOException {
            ChatGroup chatGroup = new ChatGroup();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (chatGroup.status == null && numValueOf != null) {
                            chatGroup.status = (ChatGroupStatus) ChatGroupStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (chatGroup.groupType == null && numValueOf2 != null) {
                            chatGroup.groupType = (ChatGroupType) ChatGroupType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
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
                        chatGroup._id = nb5Var.m158742k();
                        continue;
                    case 18:
                        chatGroup.f56011id = nb5Var.m158750s();
                        continue;
                    case 410:
                        chatGroup.name = nb5Var.m158750s();
                        continue;
                    case 418:
                        chatGroup.avatars = (List) nb5Var.m158743l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 426:
                        chatGroup.announcement = nb5Var.m158750s();
                        continue;
                    case 432:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 442:
                        chatGroup.localConId = nb5Var.m158750s();
                        continue;
                    case 450:
                        chatGroup.ownerUserId = nb5Var.m158750s();
                        continue;
                    case 458:
                        chatGroup.adminUserIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 466:
                        chatGroup.creatorUserId = nb5Var.m158750s();
                        continue;
                    case 472:
                        numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 482:
                        chatGroup.memberIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 488:
                        chatGroup.memberCount = nb5Var.m158741j();
                        continue;
                    case 496:
                        chatGroup.memberLimit = nb5Var.m158741j();
                        continue;
                    case 506:
                        chatGroup.memberStatistics = (List) nb5Var.m158743l(GroupMemberStatistic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 513:
                        chatGroup.createdTime = nb5Var.m158739h();
                        continue;
                    case 521:
                        chatGroup.updatedTime = nb5Var.m158739h();
                        continue;
                    case 528:
                        chatGroup.localMembersLoaded = nb5Var.m158738g();
                        continue;
                    case 538:
                        chatGroup.publicId = nb5Var.m158750s();
                        continue;
                    case 546:
                        chatGroup.category = (ChatGroupCateGory) nb5Var.m158743l(ChatGroupCateGory.PROTOBUF_ADAPTER);
                        continue;
                    case 554:
                        chatGroup.description = nb5Var.m158750s();
                        continue;
                    case 562:
                        chatGroup.tags = (List) nb5Var.m158743l(ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 570:
                        chatGroup.groupApply = (GroupApply) nb5Var.m158743l(GroupApply.PROTOBUF_ADAPTER);
                        continue;
                    case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE /* 578 */:
                        chatGroup.silence = (ChatGroupSilence) nb5Var.m158743l(ChatGroupSilence.PROTOBUF_ADAPTER);
                        continue;
                    case 586:
                        chatGroup.punishment = (ChatPunishment) nb5Var.m158743l(ChatPunishment.PROTOBUF_ADAPTER);
                        continue;
                    case 594:
                        chatGroup.status = (ChatGroupStatus) nb5Var.m158743l(ChatGroupStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 602:
                        chatGroup.groupType = (ChatGroupType) nb5Var.m158743l(ChatGroupType.PROTOBUF_ADAPTER);
                        continue;
                    case 608:
                        chatGroup.expiredTime = nb5Var.m158742k();
                        continue;
                    case 616:
                        chatGroup.joinRemainedTime = nb5Var.m158741j();
                        continue;
                    case 626:
                        chatGroup.source = nb5Var.m158750s();
                        continue;
                    case 634:
                        chatGroup.token = nb5Var.m158750s();
                        continue;
                    case 642:
                        chatGroup.groupTopic = (ChatGroupTopic) nb5Var.m158743l(ChatGroupTopic.PROTOBUF_ADAPTER);
                        continue;
                    case 648:
                        chatGroup.upgraded = nb5Var.m158738g();
                        continue;
                    case 656:
                        chatGroup.duration = nb5Var.m158742k();
                        continue;
                    case 666:
                        chatGroup.joinCondition = (JoinCondition) nb5Var.m158743l(JoinCondition.PROTOBUF_ADAPTER);
                        continue;
                    case 672:
                        chatGroup.onlineCount = nb5Var.m158741j();
                        continue;
                    case 680:
                        chatGroup.adminLimit = nb5Var.m158741j();
                        continue;
                    case 690:
                        chatGroup.permissions = (Permissions) nb5Var.m158743l(Permissions.PROTOBUF_ADAPTER);
                        continue;
                    case 698:
                        chatGroup.inModeration = (InModeration) nb5Var.m158743l(InModeration.PROTOBUF_ADAPTER);
                        continue;
                    case 706:
                        chatGroup.shareToken = nb5Var.m158750s();
                        continue;
                    default:
                        if (chatGroup.status == null && numValueOf != null) {
                            chatGroup.status = (ChatGroupStatus) ChatGroupStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (chatGroup.groupType == null && numValueOf2 != null) {
                            chatGroup.groupType = (ChatGroupType) ChatGroupType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGroup chatGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, chatGroup._id);
            String str = chatGroup.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = chatGroup.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(51, str2);
            }
            List<Picture> list = chatGroup.avatars;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(52, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = chatGroup.announcement;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(53, str3);
            }
            ChatGroupStatus chatGroupStatus = chatGroup.status;
            if (chatGroupStatus != null) {
                codedOutputByteBufferNano.m17250G(54, chatGroupStatus.ordinal());
            }
            String str4 = chatGroup.localConId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(55, str4);
            }
            String str5 = chatGroup.ownerUserId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(56, str5);
            }
            List<String> list2 = chatGroup.adminUserIds;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(57, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = chatGroup.creatorUserId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(58, str6);
            }
            ChatGroupType chatGroupType = chatGroup.groupType;
            if (chatGroupType != null) {
                codedOutputByteBufferNano.m17250G(59, chatGroupType.ordinal());
            }
            List<String> list3 = chatGroup.memberIds;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(60, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(61, chatGroup.memberCount);
            codedOutputByteBufferNano.m17250G(62, chatGroup.memberLimit);
            List<GroupMemberStatistic> list4 = chatGroup.memberStatistics;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(63, list4, GroupMemberStatistic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17246C(64, chatGroup.createdTime);
            codedOutputByteBufferNano.m17246C(65, chatGroup.updatedTime);
            codedOutputByteBufferNano.m17244A(66, chatGroup.localMembersLoaded);
            String str7 = chatGroup.publicId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(67, str7);
            }
            ChatGroupCateGory chatGroupCateGory = chatGroup.category;
            if (chatGroupCateGory != null) {
                codedOutputByteBufferNano.m17254K(68, chatGroupCateGory, ChatGroupCateGory.PROTOBUF_ADAPTER);
            }
            String str8 = chatGroup.description;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(69, str8);
            }
            List<ChatGroupTag> list5 = chatGroup.tags;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(70, list5, ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GroupApply groupApply = chatGroup.groupApply;
            if (groupApply != null) {
                codedOutputByteBufferNano.m17254K(71, groupApply, GroupApply.PROTOBUF_ADAPTER);
            }
            ChatGroupSilence chatGroupSilence = chatGroup.silence;
            if (chatGroupSilence != null) {
                codedOutputByteBufferNano.m17254K(72, chatGroupSilence, ChatGroupSilence.PROTOBUF_ADAPTER);
            }
            ChatPunishment chatPunishment = chatGroup.punishment;
            if (chatPunishment != null) {
                codedOutputByteBufferNano.m17254K(73, chatPunishment, ChatPunishment.PROTOBUF_ADAPTER);
            }
            ChatGroupStatus chatGroupStatus2 = chatGroup.status;
            if (chatGroupStatus2 != null) {
                codedOutputByteBufferNano.m17254K(74, chatGroupStatus2, ChatGroupStatus.PROTOBUF_ADAPTER);
            }
            ChatGroupType chatGroupType2 = chatGroup.groupType;
            if (chatGroupType2 != null) {
                codedOutputByteBufferNano.m17254K(75, chatGroupType2, ChatGroupType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17252I(76, chatGroup.expiredTime);
            codedOutputByteBufferNano.m17250G(77, chatGroup.joinRemainedTime);
            String str9 = chatGroup.source;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(78, str9);
            }
            String str10 = chatGroup.token;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(79, str10);
            }
            ChatGroupTopic chatGroupTopic = chatGroup.groupTopic;
            if (chatGroupTopic != null) {
                codedOutputByteBufferNano.m17254K(80, chatGroupTopic, ChatGroupTopic.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(81, chatGroup.upgraded);
            codedOutputByteBufferNano.m17252I(82, chatGroup.duration);
            JoinCondition joinCondition = chatGroup.joinCondition;
            if (joinCondition != null) {
                codedOutputByteBufferNano.m17254K(83, joinCondition, JoinCondition.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(84, chatGroup.onlineCount);
            codedOutputByteBufferNano.m17250G(85, chatGroup.adminLimit);
            Permissions permissions = chatGroup.permissions;
            if (permissions != null) {
                codedOutputByteBufferNano.m17254K(86, permissions, Permissions.PROTOBUF_ADAPTER);
            }
            InModeration inModeration = chatGroup.inModeration;
            if (inModeration != null) {
                codedOutputByteBufferNano.m17254K(87, inModeration, InModeration.PROTOBUF_ADAPTER);
            }
            String str11 = chatGroup.shareToken;
            if (str11 != null) {
                codedOutputByteBufferNano.m17261R(88, str11);
            }
        }
    };
    public static JsonAdapter<ChatGroup> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroup>() { // from class: com.p1.mobile.putong.core.data.ChatGroup.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGroup.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatGroup newInstance() {
            return new ChatGroup();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(ChatGroup chatGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 0;
                    }
                    break;
                case -1798271654:
                    if (str.equals("shareToken")) {
                        b = 1;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        b = 2;
                    }
                    break;
                case -1067442339:
                    if (str.equals("memberStatistics")) {
                        b = 3;
                    }
                    break;
                case -1027489869:
                    if (str.equals("punishment")) {
                        b = 4;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 5;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 6;
                    }
                    break;
                case -635082182:
                    if (str.equals("avatars")) {
                        b = 7;
                    }
                    break;
                case -569781720:
                    if (str.equals(LocationInvisibleField.updatedTime)) {
                        b = 8;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 9;
                    }
                    break;
                case -466573154:
                    if (str.equals("adminUserIds")) {
                        b = 10;
                    }
                    break;
                case -345149502:
                    if (str.equals("joinRemainedTime")) {
                        b = 11;
                    }
                    break;
                case -190711079:
                    if (str.equals("ownerUserId")) {
                        b = 12;
                    }
                    break;
                case -92515438:
                    if (str.equals("expiredTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 14;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 15;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 17;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 18;
                    }
                    break;
                case 110541305:
                    if (str.equals("token")) {
                        b = 19;
                    }
                    break;
                case 156781895:
                    if (str.equals(VirtualVoiceMotionType.announcement)) {
                        b = 20;
                    }
                    break;
                case 438150780:
                    if (str.equals("onlineCount")) {
                        b = 21;
                    }
                    break;
                case 549807147:
                    if (str.equals("inModeration")) {
                        b = 22;
                    }
                    break;
                case 670241196:
                    if (str.equals("adminLimit")) {
                        b = 23;
                    }
                    break;
                case 888726739:
                    if (str.equals("localMembersLoaded")) {
                        b = 24;
                    }
                    break;
                case 1133704324:
                    if (str.equals(Permissions.TYPE)) {
                        b = 25;
                    }
                    break;
                case 1272192496:
                    if (str.equals("groupTopic")) {
                        b = 26;
                    }
                    break;
                case 1277709714:
                    if (str.equals("localConId")) {
                        b = 27;
                    }
                    break;
                case 1293600100:
                    if (str.equals("publicId")) {
                        b = 28;
                    }
                    break;
                case 1342199230:
                    if (str.equals("memberIds")) {
                        b = 29;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 30;
                    }
                    break;
                case 1366188353:
                    if (str.equals("memberLimit")) {
                        b = 31;
                    }
                    break;
                case 1423616456:
                    if (str.equals("upgraded")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1469106578:
                    if (str.equals("creatorUserId")) {
                        b = 33;
                    }
                    break;
                case 1707007761:
                    if (str.equals("joinCondition")) {
                        b = 34;
                    }
                    break;
                case 2092627105:
                    if (str.equals("silence")) {
                        b = 35;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    chatGroup.duration = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    chatGroup.shareToken = jsonParser.getValueAsString();
                    return true;
                case 2:
                    chatGroup.description = jsonParser.getValueAsString();
                    return true;
                case 3:
                    chatGroup.memberStatistics = JsonAdapter.parseArray(jsonParser, GroupMemberStatistic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    chatGroup.punishment = ChatPunishment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    chatGroup.source = jsonParser.getValueAsString();
                    return true;
                case 6:
                    chatGroup.status = ChatGroupStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 7:
                    chatGroup.avatars = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    chatGroup.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 9:
                    chatGroup.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 10:
                    chatGroup.adminUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    chatGroup.joinRemainedTime = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    chatGroup.ownerUserId = jsonParser.getValueAsString();
                    return true;
                case 13:
                    chatGroup.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case 14:
                    chatGroup.f56011id = jsonParser.getValueAsString();
                    return false;
                case 15:
                    chatGroup.name = jsonParser.getValueAsString();
                    return true;
                case 16:
                    chatGroup.tags = JsonAdapter.parseArray(jsonParser, ChatGroupTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    chatGroup.groupType = ChatGroupType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 18:
                    chatGroup.category = ChatGroupCateGory.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    chatGroup.token = jsonParser.getValueAsString();
                    return true;
                case 20:
                    chatGroup.announcement = jsonParser.getValueAsString();
                    return true;
                case 21:
                    chatGroup.onlineCount = jsonParser.getValueAsInt();
                    return true;
                case 22:
                    chatGroup.inModeration = InModeration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    chatGroup.adminLimit = jsonParser.getValueAsInt();
                    return true;
                case 24:
                    chatGroup.localMembersLoaded = jsonParser.getValueAsBoolean();
                    return true;
                case 25:
                    chatGroup.permissions = Permissions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    chatGroup.groupTopic = ChatGroupTopic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    chatGroup.localConId = jsonParser.getValueAsString();
                    return true;
                case 28:
                    chatGroup.publicId = jsonParser.getValueAsString();
                    return true;
                case 29:
                    chatGroup.memberIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    chatGroup.memberCount = jsonParser.getValueAsInt();
                    return true;
                case 31:
                    chatGroup.memberLimit = jsonParser.getValueAsInt();
                    return true;
                case 32:
                    chatGroup.upgraded = jsonParser.getValueAsBoolean();
                    return true;
                case 33:
                    chatGroup.creatorUserId = jsonParser.getValueAsString();
                    return true;
                case 34:
                    chatGroup.joinCondition = JoinCondition.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 35:
                    chatGroup.silence = ChatGroupSilence.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(ChatGroup chatGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 0;
                    }
                    break;
                case -1798271654:
                    if (str.equals("shareToken")) {
                        b = 1;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        b = 2;
                    }
                    break;
                case -1067442339:
                    if (str.equals("memberStatistics")) {
                        b = 3;
                    }
                    break;
                case -1027489869:
                    if (str.equals("punishment")) {
                        b = 4;
                    }
                    break;
                case -896505829:
                    if (str.equals("source")) {
                        b = 5;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 6;
                    }
                    break;
                case -635082182:
                    if (str.equals("avatars")) {
                        b = 7;
                    }
                    break;
                case -569781720:
                    if (str.equals(LocationInvisibleField.updatedTime)) {
                        b = 8;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 9;
                    }
                    break;
                case -466573154:
                    if (str.equals("adminUserIds")) {
                        b = 10;
                    }
                    break;
                case -345149502:
                    if (str.equals("joinRemainedTime")) {
                        b = 11;
                    }
                    break;
                case -190711079:
                    if (str.equals("ownerUserId")) {
                        b = 12;
                    }
                    break;
                case -92515438:
                    if (str.equals("expiredTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 14;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 15;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 17;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 18;
                    }
                    break;
                case 110541305:
                    if (str.equals("token")) {
                        b = 19;
                    }
                    break;
                case 156781895:
                    if (str.equals(VirtualVoiceMotionType.announcement)) {
                        b = 20;
                    }
                    break;
                case 438150780:
                    if (str.equals("onlineCount")) {
                        b = 21;
                    }
                    break;
                case 549807147:
                    if (str.equals("inModeration")) {
                        b = 22;
                    }
                    break;
                case 670241196:
                    if (str.equals("adminLimit")) {
                        b = 23;
                    }
                    break;
                case 888726739:
                    if (str.equals("localMembersLoaded")) {
                        b = 24;
                    }
                    break;
                case 1133704324:
                    if (str.equals(Permissions.TYPE)) {
                        b = 25;
                    }
                    break;
                case 1272192496:
                    if (str.equals("groupTopic")) {
                        b = 26;
                    }
                    break;
                case 1277709714:
                    if (str.equals("localConId")) {
                        b = 27;
                    }
                    break;
                case 1293600100:
                    if (str.equals("publicId")) {
                        b = 28;
                    }
                    break;
                case 1342199230:
                    if (str.equals("memberIds")) {
                        b = 29;
                    }
                    break;
                case 1358063253:
                    if (str.equals("memberCount")) {
                        b = 30;
                    }
                    break;
                case 1366188353:
                    if (str.equals("memberLimit")) {
                        b = 31;
                    }
                    break;
                case 1423616456:
                    if (str.equals("upgraded")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 1469106578:
                    if (str.equals("creatorUserId")) {
                        b = 33;
                    }
                    break;
                case 1707007761:
                    if (str.equals("joinCondition")) {
                        b = 34;
                    }
                    break;
                case 2092627105:
                    if (str.equals("silence")) {
                        b = 35;
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
                case 12:
                case 13:
                    return true;
                case 14:
                    return false;
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
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                    return true;
                default:
                    return super.parseFieldCheck(chatGroup, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGroup chatGroup, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGroup.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = chatGroup.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (chatGroup.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(chatGroup.avatars, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
            String str3 = chatGroup.announcement;
            if (str3 != null) {
                jsonGenerator.writeStringField(VirtualVoiceMotionType.announcement, str3);
            }
            if (chatGroup.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
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
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(chatGroup.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
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
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, chatGroup.duration);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<ChatGroup> _ID = new LongColumn<ChatGroup>("_id") { // from class: com.p1.mobile.putong.core.data.ChatGroup.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(ChatGroup chatGroup) {
            return Long.valueOf(chatGroup._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Long l2) {
            chatGroup._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<ChatGroup> f20362ID = new StringColumn<ChatGroup>("id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.f56011id = str;
        }
    };
    public static final StringColumn<ChatGroup> NAME = new StringColumn<ChatGroup>("name_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.name = str;
        }
    };
    public static final Column<ChatGroup, List<Picture>> AVATARS = new Column<ChatGroup, List<Picture>>("avatars_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.6
        @Override // com.tantanapp.common.data.orm.Column
        public List<Picture> get(ChatGroup chatGroup) {
            return chatGroup.avatars;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, List<Picture> list) {
            chatGroup.avatars = list;
        }
    };
    public static final StringColumn<ChatGroup> ANNOUNCEMENT = new StringColumn<ChatGroup>("announcement_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.7
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.announcement;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.announcement = str;
        }
    };
    public static final TEnumColumn<ChatGroup, ChatGroupStatus> STATUS = new TEnumColumn<ChatGroup, ChatGroupStatus>("str_status_c", "status_c", ChatGroupStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroup.8
        @Override // com.tantanapp.common.data.orm.Column
        public ChatGroupStatus get(ChatGroup chatGroup) {
            return chatGroup.status;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(ChatGroup chatGroup, ChatGroupStatus chatGroupStatus) {
            chatGroup.status = chatGroupStatus;
        }
    };
    public static final StringColumn<ChatGroup> LOCALCONID = new StringColumn<ChatGroup>("localConId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.9
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.localConId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.localConId = str;
        }
    };
    public static final StringColumn<ChatGroup> OWNERUSERID = new StringColumn<ChatGroup>("ownerUserId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.10
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.ownerUserId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.ownerUserId = str;
        }
    };
    public static final Column<ChatGroup, List<String>> ADMINUSERIDS = new Column<ChatGroup, List<String>>("adminUserIds_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.11
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(ChatGroup chatGroup) {
            return chatGroup.adminUserIds;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, List<String> list) {
            chatGroup.adminUserIds = list;
        }
    };
    public static final StringColumn<ChatGroup> CREATORUSERID = new StringColumn<ChatGroup>("creatorUserId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.12
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.creatorUserId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.creatorUserId = str;
        }
    };
    public static final TEnumColumn<ChatGroup, ChatGroupType> GROUPTYPE = new TEnumColumn<ChatGroup, ChatGroupType>("str_groupType_c", "groupType_c", ChatGroupType.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroup.13
        @Override // com.tantanapp.common.data.orm.Column
        public ChatGroupType get(ChatGroup chatGroup) {
            return chatGroup.groupType;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(ChatGroup chatGroup, ChatGroupType chatGroupType) {
            chatGroup.groupType = chatGroupType;
        }
    };
    public static final Column<ChatGroup, List<String>> MEMBERIDS = new Column<ChatGroup, List<String>>("memberIds_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.14
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(ChatGroup chatGroup) {
            return chatGroup.memberIds;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, List<String> list) {
            chatGroup.memberIds = list;
        }
    };
    public static final IntegerColumn<ChatGroup> MEMBERCOUNT = new IntegerColumn<ChatGroup>("memberCount_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.15
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.memberCount);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.memberCount = num.intValue();
        }
    };
    public static final IntegerColumn<ChatGroup> MEMBERLIMIT = new IntegerColumn<ChatGroup>("memberLimit_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.16
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.memberLimit);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.memberLimit = num.intValue();
        }
    };
    public static final Column<ChatGroup, List<GroupMemberStatistic>> MEMBERSTATISTICS = new Column<ChatGroup, List<GroupMemberStatistic>>("memberStatistics_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.17
        @Override // com.tantanapp.common.data.orm.Column
        public List<GroupMemberStatistic> get(ChatGroup chatGroup) {
            return chatGroup.memberStatistics;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, List<GroupMemberStatistic> list) {
            chatGroup.memberStatistics = list;
        }
    };
    public static final DoubleColumn<ChatGroup> CREATEDTIME = new DoubleColumn<ChatGroup>("createdTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.18
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.createdTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.createdTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatGroup> UPDATEDTIME = new DoubleColumn<ChatGroup>("updatedTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.19
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.updatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.updatedTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroup> LOCALMEMBERSLOADED = new BooleanColumn<ChatGroup>("localMembersLoaded_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.20
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.localMembersLoaded);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.localMembersLoaded = bool.booleanValue();
        }
    };
    public static final StringColumn<ChatGroup> PUBLICID = new StringColumn<ChatGroup>("publicId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.21
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.publicId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.publicId = str;
        }
    };
    public static final StringColumn<ChatGroup> CATEGORY_ID = new StringColumn<ChatGroup>("category_id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.22
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.category.f20363id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.category.f20363id = str;
        }
    };
    public static final StringColumn<ChatGroup> CATEGORY_NAME = new StringColumn<ChatGroup>("category_name_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.23
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.category.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.category.name = str;
        }
    };
    public static final StringColumn<ChatGroup> CATEGORY_BACKGROUNDCOLOR = new StringColumn<ChatGroup>("category_backgroundColor_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.24
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.category.backgroundColor;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.category.backgroundColor = str;
        }
    };
    public static final StringColumn<ChatGroup> CATEGORY_TEXTCOLOR = new StringColumn<ChatGroup>("category_textColor_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.25
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.category.textColor;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.category.textColor = str;
        }
    };
    public static final BooleanColumn<ChatGroup> CATEGORY_HIDDEN = new BooleanColumn<ChatGroup>("category_hidden_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.26
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.category.hidden);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.category.hidden = bool.booleanValue();
        }
    };
    public static final StringColumn<ChatGroup> DESCRIPTION = new StringColumn<ChatGroup>("description_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.27
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.description;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.description = str;
        }
    };
    public static final Column<ChatGroup, List<ChatGroupTag>> TAGS = new Column<ChatGroup, List<ChatGroupTag>>("tags_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.28
        @Override // com.tantanapp.common.data.orm.Column
        public List<ChatGroupTag> get(ChatGroup chatGroup) {
            return chatGroup.tags;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, List<ChatGroupTag> list) {
            chatGroup.tags = list;
        }
    };
    public static final StringColumn<ChatGroup> GROUPAPPLY_ID = new StringColumn<ChatGroup>("groupApply_id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.29
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupApply.f20404id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupApply.f20404id = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPAPPLY_USERID = new StringColumn<ChatGroup>("groupApply_userId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.30
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupApply.userId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupApply.userId = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPAPPLY_GROUPID = new StringColumn<ChatGroup>("groupApply_groupId_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.31
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupApply.groupId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupApply.groupId = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPAPPLY_REASON = new StringColumn<ChatGroup>("groupApply_reason_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.32
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupApply.reason;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupApply.reason = str;
        }
    };
    public static final TEnumColumn<ChatGroup, GroupApplyStatus> GROUPAPPLY_STATUS = new TEnumColumn<ChatGroup, GroupApplyStatus>("str_groupApply_status_c", "groupApply_status_c", GroupApplyStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroup.33
        @Override // com.tantanapp.common.data.orm.Column
        public GroupApplyStatus get(ChatGroup chatGroup) {
            return chatGroup.groupApply.status;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(ChatGroup chatGroup, GroupApplyStatus groupApplyStatus) {
            chatGroup.groupApply.status = groupApplyStatus;
        }
    };
    public static final DoubleColumn<ChatGroup> GROUPAPPLY_CREATEDTIME = new DoubleColumn<ChatGroup>("groupApply_createdTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.34
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.groupApply.createdTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.groupApply.createdTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatGroup> GROUPAPPLY_UPDATEDTIME = new DoubleColumn<ChatGroup>("groupApply_updatedTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.35
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.groupApply.updatedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.groupApply.updatedTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroup> SILENCE_ENABLE = new BooleanColumn<ChatGroup>("silence_enable_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.36
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.silence.enable);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.silence.enable = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroup> SILENCE_DURATION = new LongColumn<ChatGroup>("silence_duration_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.37
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(ChatGroup chatGroup) {
            return Long.valueOf(chatGroup.silence.duration);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Long l2) {
            chatGroup.silence.duration = l2.longValue();
        }
    };
    public static final DoubleColumn<ChatGroup> SILENCE_UNTIL = new DoubleColumn<ChatGroup>("silence_until_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.38
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.silence.until);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.silence.until = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PUNISHMENT_SENDMESSAGE_ACTIVE = new BooleanColumn<ChatGroup>("punishment_sendMessage_active_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.39
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.punishment.sendMessage.active);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.punishment.sendMessage.active = bool.booleanValue();
        }
    };
    public static final DoubleColumn<ChatGroup> PUNISHMENT_SENDMESSAGE_UNTIL = new DoubleColumn<ChatGroup>("punishment_sendMessage_until_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.40
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatGroup chatGroup) {
            return Double.valueOf(chatGroup.punishment.sendMessage.until);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Double d) {
            chatGroup.punishment.sendMessage.until = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PUNISHMENT_SENDREDPACKET_ACTIVE = new BooleanColumn<ChatGroup>("punishment_sendRedPacket_active_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.41
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.punishment.sendRedPacket.active);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.punishment.sendRedPacket.active = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroup> EXPIREDTIME = new LongColumn<ChatGroup>("expiredTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.42
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(ChatGroup chatGroup) {
            return Long.valueOf(chatGroup.expiredTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Long l2) {
            chatGroup.expiredTime = l2.longValue();
        }
    };
    public static final IntegerColumn<ChatGroup> JOINREMAINEDTIME = new IntegerColumn<ChatGroup>("joinRemainedTime_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.43
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.joinRemainedTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.joinRemainedTime = num.intValue();
        }
    };
    public static final StringColumn<ChatGroup> SOURCE = new StringColumn<ChatGroup>("source_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.44
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.source;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.source = str;
        }
    };
    public static final StringColumn<ChatGroup> TOKEN = new StringColumn<ChatGroup>("token_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.45
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.token;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.token = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPTOPIC_ID = new StringColumn<ChatGroup>("groupTopic_id_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.46
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupTopic.f20365id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupTopic.f20365id = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPTOPIC_OWNER = new StringColumn<ChatGroup>("groupTopic_owner_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.47
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupTopic.owner;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupTopic.owner = str;
        }
    };
    public static final StringColumn<ChatGroup> GROUPTOPIC_VALUE = new StringColumn<ChatGroup>("groupTopic_value_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.48
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.groupTopic.value;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.groupTopic.value = str;
        }
    };
    public static final Column<ChatGroup, List<Media>> GROUPTOPIC_MEDIAS = new Column<ChatGroup, List<Media>>("groupTopic_medias_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.49
        @Override // com.tantanapp.common.data.orm.Column
        public List<Media> get(ChatGroup chatGroup) {
            return chatGroup.groupTopic.medias;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, List<Media> list) {
            chatGroup.groupTopic.medias = list;
        }
    };
    public static final BooleanColumn<ChatGroup> UPGRADED = new BooleanColumn<ChatGroup>("upgraded_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.50
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.upgraded);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.upgraded = bool.booleanValue();
        }
    };
    public static final LongColumn<ChatGroup> DURATION = new LongColumn<ChatGroup>("duration_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.51
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(ChatGroup chatGroup) {
            return Long.valueOf(chatGroup.duration);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Long l2) {
            chatGroup.duration = l2.longValue();
        }
    };
    public static final TEnumColumn<ChatGroup, JoinCondition> JOINCONDITION = new TEnumColumn<ChatGroup, JoinCondition>("joinCondition_c", null, JoinCondition.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ChatGroup.52
        @Override // com.tantanapp.common.data.orm.Column
        public JoinCondition get(ChatGroup chatGroup) {
            return chatGroup.joinCondition;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(ChatGroup chatGroup, JoinCondition joinCondition) {
            chatGroup.joinCondition = joinCondition;
        }
    };
    public static final IntegerColumn<ChatGroup> ONLINECOUNT = new IntegerColumn<ChatGroup>("onlineCount_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.53
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.onlineCount);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.onlineCount = num.intValue();
        }
    };
    public static final IntegerColumn<ChatGroup> ADMINLIMIT = new IntegerColumn<ChatGroup>("adminLimit_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.54
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(ChatGroup chatGroup) {
            return Integer.valueOf(chatGroup.adminLimit);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Integer num) {
            chatGroup.adminLimit = num.intValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PERMISSIONS_CANSHARETOWECHAT = new BooleanColumn<ChatGroup>("permissions_canShareToWeChat_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.55
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.permissions.canShareToWeChat);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.permissions.canShareToWeChat = bool.booleanValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PERMISSIONS_CANSHARETOTANTAN = new BooleanColumn<ChatGroup>("permissions_canShareToTantan_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.56
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.permissions.canShareToTantan);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.permissions.canShareToTantan = bool.booleanValue();
        }
    };
    public static final BooleanColumn<ChatGroup> PERMISSIONS_CANCHANGEJOINCONDITION = new BooleanColumn<ChatGroup>("permissions_canChangeJoinCondition_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.57
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatGroup chatGroup) {
            return Boolean.valueOf(chatGroup.permissions.canChangeJoinCondition);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, Boolean bool) {
            chatGroup.permissions.canChangeJoinCondition = bool.booleanValue();
        }
    };
    public static final StringColumn<ChatGroup> INMODERATION_NICKNAME = new StringColumn<ChatGroup>("inModeration_nickName_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.58
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.inModeration.nickName;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.inModeration.nickName = str;
        }
    };
    public static final StringColumn<ChatGroup> INMODERATION_NAME = new StringColumn<ChatGroup>("inModeration_name_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.59
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.inModeration.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.inModeration.name = str;
        }
    };
    public static final StringColumn<ChatGroup> INMODERATION_DESCRIPTION = new StringColumn<ChatGroup>("inModeration_description_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.60
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.inModeration.description;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.inModeration.description = str;
        }
    };
    public static final StringColumn<ChatGroup> SHARETOKEN = new StringColumn<ChatGroup>("shareToken_c") { // from class: com.p1.mobile.putong.core.data.ChatGroup.61
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatGroup chatGroup) {
            return chatGroup.shareToken;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatGroup chatGroup, String str) {
            chatGroup.shareToken = str;
        }
    };
    public static mrf0<ChatGroup> DB_ADAPTER = new mrf0<ChatGroup>() { // from class: com.p1.mobile.putong.core.data.ChatGroup.62
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,avatars_c BLOB,announcement_c TEXT,status_c INTEGER,localConId_c TEXT,ownerUserId_c TEXT,adminUserIds_c BLOB,creatorUserId_c TEXT,groupType_c INTEGER,memberIds_c BLOB,memberCount_c INTEGER,memberLimit_c INTEGER,memberStatistics_c BLOB,createdTime_c REAL,updatedTime_c REAL,localMembersLoaded_c INTEGER,publicId_c TEXT,category_id_c TEXT,category_name_c TEXT,category_backgroundColor_c TEXT,category_textColor_c TEXT,category_hidden_c INTEGER,description_c TEXT,tags_c BLOB,groupApply_id_c TEXT,groupApply_userId_c TEXT,groupApply_groupId_c TEXT,groupApply_reason_c TEXT,groupApply_status_c INTEGER,groupApply_createdTime_c REAL,groupApply_updatedTime_c REAL,silence_enable_c INTEGER,silence_duration_c INTEGER,silence_until_c REAL,punishment_sendMessage_active_c INTEGER,punishment_sendMessage_until_c REAL,punishment_sendRedPacket_active_c INTEGER,str_status_c TEXT,str_groupType_c TEXT,str_groupApply_status_c TEXT,expiredTime_c INTEGER,joinRemainedTime_c INTEGER,source_c TEXT,token_c TEXT,groupTopic_id_c TEXT,groupTopic_owner_c TEXT,groupTopic_value_c TEXT,groupTopic_medias_c BLOB,upgraded_c INTEGER,duration_c INTEGER,joinCondition_c TEXT,onlineCount_c INTEGER,adminLimit_c INTEGER,permissions_canShareToWeChat_c INTEGER,permissions_canShareToTantan_c INTEGER,permissions_canChangeJoinCondition_c INTEGER,inModeration_nickName_c TEXT,inModeration_name_c TEXT,inModeration_description_c TEXT,shareToken_c TEXT)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return ChatGroup.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public ChatGroup init() {
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

        /* JADX WARN: Can't rename method to resolve collision */
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
        @Override // p149l.mrf0
        public ChatGroup read(Cursor cursor, int i) {
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
                this.readIndex = 0;
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
                chatGroup._id = cursor.getLong(i);
                int i6 = i + 1;
                String string4 = null;
                chatGroup.f56011id = cursor.isNull(i6) ? null : cursor.getString(i6);
                int i7 = i + 2;
                chatGroup.name = cursor.isNull(i7) ? null : cursor.getString(i7);
                int i8 = i + 3;
                chatGroup.avatars = cursor.isNull(i8) ? null : Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i8));
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
                    chatGroup.adminUserIds = cursor.isNull(i13) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i13));
                    int i14 = i + 9;
                    chatGroup.creatorUserId = cursor.isNull(i14) ? null : cursor.getString(i14);
                    int i15 = i + 10;
                    i3 = cursor.isNull(i15) ? -1 : cursor.getInt(i15);
                    int i16 = i + 11;
                    try {
                        chatGroup.memberIds = cursor.isNull(i16) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i16));
                        chatGroup.memberCount = cursor.getInt(i + 12);
                        chatGroup.memberLimit = cursor.getInt(i + 13);
                        int i17 = i + 14;
                        chatGroup.memberStatistics = cursor.isNull(i17) ? null : GroupMemberStatistic.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i17));
                        chatGroup.createdTime = cursor.getDouble(i + 15);
                        chatGroup.updatedTime = cursor.getDouble(i + 16);
                        chatGroup.localMembersLoaded = cursor.getInt(i + 17) == 1;
                        int i18 = i + 18;
                        chatGroup.publicId = cursor.isNull(i18) ? null : cursor.getString(i18);
                        int i19 = i + 19;
                        chatGroup.category.f20363id = cursor.isNull(i19) ? null : cursor.getString(i19);
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
                        chatGroup.tags = cursor.isNull(i24) ? null : ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i24));
                        int i25 = i + 26;
                        chatGroup.groupApply.f20404id = cursor.isNull(i25) ? null : cursor.getString(i25);
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
                                chatGroup.groupTopic.f20365id = cursor.isNull(i35) ? null : cursor.getString(i35);
                                int i36 = i + 47;
                                chatGroup.groupTopic.owner = cursor.isNull(i36) ? null : cursor.getString(i36);
                                int i37 = i + 48;
                                chatGroup.groupTopic.value = cursor.isNull(i37) ? null : cursor.getString(i37);
                                int i38 = i + 49;
                                chatGroup.groupTopic.medias = cursor.isNull(i38) ? null : Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i38));
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
                                this.readIndex = i + 62;
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

        @Override // p149l.mrf0
        public void write(ChatGroup chatGroup, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", chatGroup.f56011id);
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
                DbObject.cvPut(contentValues, "category_id_c", chatGroup.category.f20363id);
                DbObject.cvPut(contentValues, "category_name_c", chatGroup.category.name);
                DbObject.cvPut(contentValues, "category_backgroundColor_c", chatGroup.category.backgroundColor);
                DbObject.cvPut(contentValues, "category_textColor_c", chatGroup.category.textColor);
                DbObject.cvPut(contentValues, "category_hidden_c", Integer.valueOf(chatGroup.category.hidden ? 1 : 0));
                DbObject.cvPut(contentValues, "description_c", chatGroup.description);
                DbObject.cvPut(contentValues, "tags_c", chatGroup.tags == null ? null : ChatGroupTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(chatGroup.tags));
                DbObject.cvPut(contentValues, "groupApply_id_c", chatGroup.groupApply.f20404id);
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
                DbObject.cvPut(contentValues, "groupTopic_id_c", chatGroup.groupTopic.f20365id);
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
                MessageNano.reportError(e, null);
            }
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35255b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m35256c(String str) {
        return str;
    }

    public static ChatGroup new_() {
        ChatGroup chatGroup = new ChatGroup();
        chatGroup.nullCheck();
        return chatGroup;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatGroup mo223809clone() {
        ChatGroup chatGroup = new ChatGroup();
        chatGroup._id = this._id;
        chatGroup.f56011id = this.f56011id;
        chatGroup.name = this.name;
        List<Picture> list = this.avatars;
        if (list != null) {
            chatGroup.avatars = ValueObject.util_map(list, new w9j() { // from class: l.rt4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Picture) obj).mo223809clone();
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
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ChatGroup.m35256c((String) obj);
                }
            });
        }
        chatGroup.creatorUserId = this.creatorUserId;
        chatGroup.groupType = this.groupType;
        List<String> list3 = this.memberIds;
        if (list3 != null) {
            chatGroup.memberIds = ValueObject.util_map(list3, new w9j() { // from class: l.tt4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ChatGroup.m35255b((String) obj);
                }
            });
        }
        chatGroup.memberCount = this.memberCount;
        chatGroup.memberLimit = this.memberLimit;
        List<GroupMemberStatistic> list4 = this.memberStatistics;
        if (list4 != null) {
            chatGroup.memberStatistics = ValueObject.util_map(list4, new w9j() { // from class: l.ut4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GroupMemberStatistic) obj).mo223809clone();
                }
            });
        }
        chatGroup.createdTime = this.createdTime;
        chatGroup.updatedTime = this.updatedTime;
        chatGroup.localMembersLoaded = this.localMembersLoaded;
        chatGroup.publicId = this.publicId;
        ChatGroupCateGory chatGroupCateGory = this.category;
        if (chatGroupCateGory != null) {
            chatGroup.category = chatGroupCateGory.mo223809clone();
        }
        chatGroup.description = this.description;
        List<ChatGroupTag> list5 = this.tags;
        if (list5 != null) {
            chatGroup.tags = ValueObject.util_map(list5, new w9j() { // from class: l.vt4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatGroupTag) obj).mo223809clone();
                }
            });
        }
        GroupApply groupApply = this.groupApply;
        if (groupApply != null) {
            chatGroup.groupApply = groupApply.mo223809clone();
        }
        ChatGroupSilence chatGroupSilence = this.silence;
        if (chatGroupSilence != null) {
            chatGroup.silence = chatGroupSilence.mo223809clone();
        }
        ChatPunishment chatPunishment = this.punishment;
        if (chatPunishment != null) {
            chatGroup.punishment = chatPunishment.mo223809clone();
        }
        chatGroup.expiredTime = this.expiredTime;
        chatGroup.joinRemainedTime = this.joinRemainedTime;
        chatGroup.source = this.source;
        chatGroup.token = this.token;
        ChatGroupTopic chatGroupTopic = this.groupTopic;
        if (chatGroupTopic != null) {
            chatGroup.groupTopic = chatGroupTopic.mo223809clone();
        }
        chatGroup.upgraded = this.upgraded;
        chatGroup.duration = this.duration;
        chatGroup.joinCondition = this.joinCondition;
        chatGroup.onlineCount = this.onlineCount;
        chatGroup.adminLimit = this.adminLimit;
        Permissions permissions = this.permissions;
        if (permissions != null) {
            chatGroup.permissions = permissions.mo223809clone();
        }
        InModeration inModeration = this.inModeration;
        if (inModeration != null) {
            chatGroup.inModeration = inModeration.mo223809clone();
        }
        chatGroup.shareToken = this.shareToken;
        return chatGroup;
    }

    @Override // com.tantanapp.common.data.DbObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode26;
        return iHashCode26;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(ChatGroup chatGroup) {
        if (!shouldMergeData() || equals(chatGroup)) {
            return;
        }
        if (!isFieldParsed(AuthenticationTokenClaims.JSON_KEY_NAME)) {
            this.name = chatGroup.name;
        }
        if (!isFieldParsed("avatars")) {
            this.avatars = chatGroup.avatars;
        }
        if (!isFieldParsed(VirtualVoiceMotionType.announcement)) {
            this.announcement = chatGroup.announcement;
        }
        if (!isFieldParsed(NotificationCompat.CATEGORY_STATUS)) {
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
        if (!isFieldParsed(LocationInvisibleField.updatedTime)) {
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
        if (!isFieldParsed(BLiveOperationTitleShowType.duration)) {
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

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
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

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
