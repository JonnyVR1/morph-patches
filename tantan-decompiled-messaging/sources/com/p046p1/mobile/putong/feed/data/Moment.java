package com.p046p1.mobile.putong.feed.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.DyMomentSource;
import com.p046p1.mobile.putong.data.LinkAction;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.LocalStatus;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.MomentLabels;
import com.p046p1.mobile.putong.data.MomentType;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.Room;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.NotifyUser;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
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
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.aai;
import p149l.bkn0;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;
import p149l.vwb;
import p149l.w9j;
import p149l.xh5;

/* JADX INFO: loaded from: classes12.dex */
public class Moment extends DbObject<Moment> implements Cloneable, Serializable {
    public static String LOCAL_ID_INVALID = "invalid_moment_id";
    public static final String TYPE = "moment";
    private String activityName;

    @NonNull
    @ProtobufIndex(index = 75)
    public MomentAdditionalData additionalData;

    @NonNull
    @ProtobufIndex(index = EACTags.COMMAND_TO_PERFORM)
    public MomentAllowForwardState allowForward;

    @ProtobufIndex(index = 79)
    public int attitudeId;

    @NonNull
    @ProtobufIndex(index = 80)
    public Attitudes attitudes;

    @Nullable
    public List<String> cameraStickerIds;
    public boolean commentAtOnce;

    @ProtobufIndex(index = 55)
    public double createdTime;
    public int curForwardRenderState;

    @NonNull
    @ProtobufIndex(index = 77)
    public String deeplink;

    @Nullable
    @ProtobufIndex(index = 64)
    public DyMomentSource dynamicType;

    @NonNull
    public String feedTime;

    @NonNull
    @ProtobufIndex(index = EACTags.DISCRETIONARY_DATA)
    public MomentForwards forwards;
    public String from;

    @NonNull
    @ProtobufIndex(index = 76)
    public GroupIdBox group;
    public boolean hasHeadFrame;

    @ProtobufIndex(index = 58)
    public boolean haveLiked;
    public String headImage;

    @NonNull
    @ProtobufIndex(index = 69)
    public String hyperlink;

    @NonNull
    public String iconTitle;
    public boolean isLive;

    @ProtobufIndex(index = EACTags.OFFSET_DATA_OBJECT)
    public boolean isNewUserAIMoment;
    public boolean isVoiceLive;

    @NonNull
    public List<MomentLabels> labels;

    @NonNull
    @ProtobufIndex(index = 61)
    public String landingPage;

    @NonNull
    @ProtobufIndex(index = 57)
    public PartialIdList likes;

    @NonNull
    public Live live;

    @Nullable
    public LiveRecommendCard liveRecommendCard;

    @Nullable
    public Room liveRoom;

    @NonNull
    public String liveState;

    @ProtobufIndex(index = 51)
    public int localCreatedSession;

    @ProtobufIndex(index = 52)
    public boolean localInFeed;

    @ProtobufIndex(index = 53)
    public boolean localInUserFeed;

    @Nullable
    @ProtobufIndex(index = 59)
    public MessageLocation location;
    private String locationName;
    public FeedSeeMoreFollowingMomentInfo mFeedSeeMoreFollowingMomentInfo;
    public List<TopicMoment> mTopicList;

    @NonNull
    @ProtobufIndex(index = 60)
    public List<Media> media;
    public List<Integer> mediaRepeatIndexList;

    @NonNull
    @ProtobufIndex(index = 62)
    public PartialIdList messages;
    private String momentShowFrom;

    @Nullable
    @ProtobufIndex(index = 67)
    public MomentType momentType;
    public String momentValue;

    @NonNull
    public MomentViewerBox momentViewer;
    public MomentVoiceLiveInfos momentVoiceLiveInfos;

    @Nullable
    public LiveMultiCallInfo multiCallInfo;

    @NonNull
    @ProtobufIndex(index = 65)
    public String musicId;

    @NonNull
    public List<NotifyUser> notifyUsers;

    @NonNull
    @ProtobufIndex(index = 56)
    public String owner;
    private String recommendReasonBackgroundColor;
    private String recommendReasonFontColor;
    private String recommendReasonIcon;
    private double recommendTime;

    @NonNull
    public String report;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 63)
    public MomentSettings settings;

    @ProtobufIndex(index = EACTags.FILE_REFERENCE)
    public boolean shareMyVote;

    @NonNull
    @ProtobufIndex(index = 74)
    public MomentSimpleActivity simpleActivity;

    @NonNull
    @ProtobufIndex(index = 66)
    public String status;

    @NonNull
    @ProtobufIndex(index = 78)
    public ThirdShareSource thirdShareSource;

    @NonNull
    @ProtobufIndex(index = 68)
    public List<TopicMomentIdBox> topics;

    @Nullable
    @ProtobufIndex(index = EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE)
    public UserSetVisibility userSetVisibility;

    @NonNull
    @ProtobufIndex(index = 54)
    public String value;
    public int views;

    @NonNull
    public VoiceLive voiceLive;
    public static ProtobufAdapter<Moment> PROTOBUF_ADAPTER = new MessageNanoAdapter<Moment>() { // from class: com.p1.mobile.putong.feed.data.Moment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Moment moment) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, moment._id);
            String str = moment.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17226h = iM17228j + CodedOutputByteBufferNano.m17226h(51, moment.localCreatedSession) + CodedOutputByteBufferNano.m17220b(52, moment.localInFeed) + CodedOutputByteBufferNano.m17220b(53, moment.localInUserFeed);
            String str2 = moment.value;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(54, str2);
            }
            int iM17222d = iM17226h + CodedOutputByteBufferNano.m17222d(55, moment.createdTime);
            String str3 = moment.owner;
            if (str3 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(56, str3);
            }
            PartialIdList partialIdList = moment.likes;
            if (partialIdList != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(57, partialIdList, PartialIdList.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17222d + CodedOutputByteBufferNano.m17220b(58, moment.haveLiked);
            MessageLocation messageLocation = moment.location;
            if (messageLocation != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(59, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            List<Media> list = moment.media;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(60, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = moment.landingPage;
            if (str4 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(61, str4);
            }
            PartialIdList partialIdList2 = moment.messages;
            if (partialIdList2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(62, partialIdList2, PartialIdList.PROTOBUF_ADAPTER);
            }
            MomentSettings momentSettings = moment.settings;
            if (momentSettings != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(63, momentSettings, MomentSettings.PROTOBUF_ADAPTER);
            }
            DyMomentSource dyMomentSource = moment.dynamicType;
            if (dyMomentSource != null) {
                iM17220b += CodedOutputByteBufferNano.m17226h(64, dyMomentSource.ordinal());
            }
            String str5 = moment.musicId;
            if (str5 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(65, str5);
            }
            String str6 = moment.status;
            if (str6 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(66, str6);
            }
            MomentType momentType = moment.momentType;
            if (momentType != null) {
                iM17220b += CodedOutputByteBufferNano.m17226h(67, momentType.ordinal());
            }
            List<TopicMomentIdBox> list2 = moment.topics;
            if (list2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(68, list2, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str7 = moment.hyperlink;
            if (str7 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(69, str7);
            }
            DyMomentSource dyMomentSource2 = moment.dynamicType;
            if (dyMomentSource2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(70, dyMomentSource2, DyMomentSource.PROTOBUF_ADAPTER);
            }
            MomentType momentType2 = moment.momentType;
            if (momentType2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(71, momentType2, MomentType.PROTOBUF_ADAPTER);
            }
            UserSetVisibility userSetVisibility = moment.userSetVisibility;
            if (userSetVisibility != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(72, userSetVisibility, UserSetVisibility.PROTOBUF_ADAPTER);
            }
            UserSetVisibility userSetVisibility2 = moment.userSetVisibility;
            if (userSetVisibility2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17226h(73, userSetVisibility2.ordinal());
            }
            MomentSimpleActivity momentSimpleActivity = moment.simpleActivity;
            if (momentSimpleActivity != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(74, momentSimpleActivity, MomentSimpleActivity.PROTOBUF_ADAPTER);
            }
            MomentAdditionalData momentAdditionalData = moment.additionalData;
            if (momentAdditionalData != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(75, momentAdditionalData, MomentAdditionalData.PROTOBUF_ADAPTER);
            }
            GroupIdBox groupIdBox = moment.group;
            if (groupIdBox != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(76, groupIdBox, GroupIdBox.PROTOBUF_ADAPTER);
            }
            String str8 = moment.deeplink;
            if (str8 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(77, str8);
            }
            ThirdShareSource thirdShareSource = moment.thirdShareSource;
            if (thirdShareSource != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(78, thirdShareSource, ThirdShareSource.PROTOBUF_ADAPTER);
            }
            int iM17226h2 = iM17220b + CodedOutputByteBufferNano.m17226h(79, moment.attitudeId);
            Attitudes attitudes = moment.attitudes;
            if (attitudes != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(80, attitudes, Attitudes.PROTOBUF_ADAPTER);
            }
            int iM17220b2 = iM17226h2 + CodedOutputByteBufferNano.m17220b(81, moment.shareMyVote);
            MomentAllowForwardState momentAllowForwardState = moment.allowForward;
            if (momentAllowForwardState != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(82, momentAllowForwardState, MomentAllowForwardState.PROTOBUF_ADAPTER);
            }
            MomentForwards momentForwards = moment.forwards;
            if (momentForwards != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(83, momentForwards, MomentForwards.PROTOBUF_ADAPTER);
            }
            int iM17220b3 = iM17220b2 + CodedOutputByteBufferNano.m17220b(84, moment.isNewUserAIMoment);
            moment.cachedSize = iM17220b3;
            return iM17220b3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Moment parse(nb5 nb5Var) throws IOException {
            Moment moment = new Moment();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (moment.dynamicType == null && numValueOf != null) {
                            moment.dynamicType = (DyMomentSource) DyMomentSource.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (moment.momentType == null && numValueOf2 != null) {
                            moment.momentType = (MomentType) MomentType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (moment.userSetVisibility == null && numValueOf3 != null) {
                            moment.userSetVisibility = (UserSetVisibility) UserSetVisibility.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (moment.value == null) {
                            moment.value = "";
                        }
                        if (moment.owner == null) {
                            moment.owner = "";
                        }
                        if (moment.likes == null) {
                            moment.likes = PartialIdList.new_();
                        }
                        if (moment.media == null) {
                            moment.media = new ArrayList();
                        }
                        if (moment.landingPage == null) {
                            moment.landingPage = "";
                        }
                        if (moment.messages == null) {
                            moment.messages = PartialIdList.new_();
                        }
                        if (moment.settings == null) {
                            moment.settings = MomentSettings.new_();
                        }
                        if (moment.musicId == null) {
                            moment.musicId = "";
                        }
                        if (moment.status == null) {
                            moment.status = "";
                        }
                        if (moment.topics == null) {
                            moment.topics = new ArrayList();
                        }
                        if (moment.live == null) {
                            moment.live = Live.new_();
                        }
                        if (moment.voiceLive == null) {
                            moment.voiceLive = VoiceLive.new_();
                        }
                        if (moment.liveState == null) {
                            moment.liveState = "";
                        }
                        if (moment.iconTitle == null) {
                            moment.iconTitle = "";
                        }
                        if (moment.labels == null) {
                            moment.labels = new ArrayList();
                        }
                        if (moment.hyperlink == null) {
                            moment.hyperlink = "";
                        }
                        if (moment.simpleActivity == null) {
                            moment.simpleActivity = MomentSimpleActivity.new_();
                        }
                        if (moment.additionalData == null) {
                            moment.additionalData = MomentAdditionalData.new_();
                        }
                        if (moment.group == null) {
                            moment.group = GroupIdBox.new_();
                        }
                        if (moment.deeplink == null) {
                            moment.deeplink = "";
                        }
                        if (moment.thirdShareSource == null) {
                            moment.thirdShareSource = ThirdShareSource.new_();
                        }
                        if (moment.attitudes == null) {
                            moment.attitudes = Attitudes.new_();
                        }
                        if (moment.allowForward == null) {
                            moment.allowForward = (MomentAllowForwardState) MomentAllowForwardState.JSON_ADAPTER.defaultEnum();
                        }
                        if (moment.forwards == null) {
                            moment.forwards = MomentForwards.new_();
                        }
                        if (moment.momentViewer == null) {
                            moment.momentViewer = MomentViewerBox.new_();
                        }
                        if (moment.notifyUsers == null) {
                            moment.notifyUsers = new ArrayList();
                        }
                        if (moment.report == null) {
                            moment.report = "";
                        }
                        break;
                    case 8:
                        moment._id = nb5Var.m158742k();
                        continue;
                    case 18:
                        moment.f56011id = nb5Var.m158750s();
                        continue;
                    case HttpStatus.REQUEST_TIMEOUT_408 /* 408 */:
                        moment.localCreatedSession = nb5Var.m158741j();
                        continue;
                    case HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416 /* 416 */:
                        moment.localInFeed = nb5Var.m158738g();
                        continue;
                    case HttpStatus.FAILED_DEPENDENCY_424 /* 424 */:
                        moment.localInUserFeed = nb5Var.m158738g();
                        continue;
                    case 434:
                        moment.value = nb5Var.m158750s();
                        continue;
                    case 441:
                        moment.createdTime = nb5Var.m158739h();
                        continue;
                    case 450:
                        moment.owner = nb5Var.m158750s();
                        continue;
                    case 458:
                        moment.likes = (PartialIdList) nb5Var.m158743l(PartialIdList.PROTOBUF_ADAPTER);
                        continue;
                    case 464:
                        moment.haveLiked = nb5Var.m158738g();
                        continue;
                    case 474:
                        moment.location = (MessageLocation) nb5Var.m158743l(MessageLocation.PROTOBUF_ADAPTER);
                        continue;
                    case 482:
                        moment.media = (List) nb5Var.m158743l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 490:
                        moment.landingPage = nb5Var.m158750s();
                        continue;
                    case 498:
                        moment.messages = (PartialIdList) nb5Var.m158743l(PartialIdList.PROTOBUF_ADAPTER);
                        continue;
                    case 506:
                        moment.settings = (MomentSettings) nb5Var.m158743l(MomentSettings.PROTOBUF_ADAPTER);
                        continue;
                    case 512:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 522:
                        moment.musicId = nb5Var.m158750s();
                        continue;
                    case 530:
                        moment.status = nb5Var.m158750s();
                        continue;
                    case 536:
                        numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 546:
                        moment.topics = (List) nb5Var.m158743l(TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 554:
                        moment.hyperlink = nb5Var.m158750s();
                        continue;
                    case 562:
                        moment.dynamicType = (DyMomentSource) nb5Var.m158743l(DyMomentSource.PROTOBUF_ADAPTER);
                        continue;
                    case 570:
                        moment.momentType = (MomentType) nb5Var.m158743l(MomentType.PROTOBUF_ADAPTER);
                        continue;
                    case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE /* 578 */:
                        moment.userSetVisibility = (UserSetVisibility) nb5Var.m158743l(UserSetVisibility.PROTOBUF_ADAPTER);
                        continue;
                    case 584:
                        numValueOf3 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 594:
                        moment.simpleActivity = (MomentSimpleActivity) nb5Var.m158743l(MomentSimpleActivity.PROTOBUF_ADAPTER);
                        continue;
                    case 602:
                        moment.additionalData = (MomentAdditionalData) nb5Var.m158743l(MomentAdditionalData.PROTOBUF_ADAPTER);
                        continue;
                    case 610:
                        moment.group = (GroupIdBox) nb5Var.m158743l(GroupIdBox.PROTOBUF_ADAPTER);
                        continue;
                    case 618:
                        moment.deeplink = nb5Var.m158750s();
                        continue;
                    case 626:
                        moment.thirdShareSource = (ThirdShareSource) nb5Var.m158743l(ThirdShareSource.PROTOBUF_ADAPTER);
                        continue;
                    case 632:
                        moment.attitudeId = nb5Var.m158741j();
                        continue;
                    case 642:
                        moment.attitudes = (Attitudes) nb5Var.m158743l(Attitudes.PROTOBUF_ADAPTER);
                        continue;
                    case 648:
                        moment.shareMyVote = nb5Var.m158738g();
                        continue;
                    case 658:
                        moment.allowForward = (MomentAllowForwardState) nb5Var.m158743l(MomentAllowForwardState.PROTOBUF_ADAPTER);
                        continue;
                    case 666:
                        moment.forwards = (MomentForwards) nb5Var.m158743l(MomentForwards.PROTOBUF_ADAPTER);
                        continue;
                    case 672:
                        moment.isNewUserAIMoment = nb5Var.m158738g();
                        continue;
                    default:
                        if (moment.dynamicType == null && numValueOf != null) {
                            moment.dynamicType = (DyMomentSource) DyMomentSource.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (moment.momentType == null && numValueOf2 != null) {
                            moment.momentType = (MomentType) MomentType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (moment.userSetVisibility == null && numValueOf3 != null) {
                            moment.userSetVisibility = (UserSetVisibility) UserSetVisibility.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (moment.value == null) {
                            moment.value = "";
                        }
                        if (moment.owner == null) {
                            moment.owner = "";
                        }
                        if (moment.likes == null) {
                            moment.likes = PartialIdList.new_();
                        }
                        if (moment.media == null) {
                            moment.media = new ArrayList();
                        }
                        if (moment.landingPage == null) {
                            moment.landingPage = "";
                        }
                        if (moment.messages == null) {
                            moment.messages = PartialIdList.new_();
                        }
                        if (moment.settings == null) {
                            moment.settings = MomentSettings.new_();
                        }
                        if (moment.musicId == null) {
                            moment.musicId = "";
                        }
                        if (moment.status == null) {
                            moment.status = "";
                        }
                        if (moment.topics == null) {
                            moment.topics = new ArrayList();
                        }
                        if (moment.live == null) {
                            moment.live = Live.new_();
                        }
                        if (moment.voiceLive == null) {
                            moment.voiceLive = VoiceLive.new_();
                        }
                        if (moment.liveState == null) {
                            moment.liveState = "";
                        }
                        if (moment.iconTitle == null) {
                            moment.iconTitle = "";
                        }
                        if (moment.labels == null) {
                            moment.labels = new ArrayList();
                        }
                        if (moment.hyperlink == null) {
                            moment.hyperlink = "";
                        }
                        if (moment.simpleActivity == null) {
                            moment.simpleActivity = MomentSimpleActivity.new_();
                        }
                        if (moment.additionalData == null) {
                            moment.additionalData = MomentAdditionalData.new_();
                        }
                        if (moment.group == null) {
                            moment.group = GroupIdBox.new_();
                        }
                        if (moment.deeplink == null) {
                            moment.deeplink = "";
                        }
                        if (moment.thirdShareSource == null) {
                            moment.thirdShareSource = ThirdShareSource.new_();
                        }
                        if (moment.attitudes == null) {
                            moment.attitudes = Attitudes.new_();
                        }
                        if (moment.allowForward == null) {
                            moment.allowForward = (MomentAllowForwardState) MomentAllowForwardState.JSON_ADAPTER.defaultEnum();
                        }
                        if (moment.forwards == null) {
                            moment.forwards = MomentForwards.new_();
                        }
                        if (moment.momentViewer == null) {
                            moment.momentViewer = MomentViewerBox.new_();
                        }
                        if (moment.notifyUsers == null) {
                            moment.notifyUsers = new ArrayList();
                        }
                        if (moment.report == null) {
                            moment.report = "";
                            return moment;
                        }
                        break;
                }
            }
            return moment;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Moment moment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, moment._id);
            String str = moment.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17250G(51, moment.localCreatedSession);
            codedOutputByteBufferNano.m17244A(52, moment.localInFeed);
            codedOutputByteBufferNano.m17244A(53, moment.localInUserFeed);
            String str2 = moment.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(54, str2);
            }
            codedOutputByteBufferNano.m17246C(55, moment.createdTime);
            String str3 = moment.owner;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(56, str3);
            }
            PartialIdList partialIdList = moment.likes;
            if (partialIdList != null) {
                codedOutputByteBufferNano.m17254K(57, partialIdList, PartialIdList.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(58, moment.haveLiked);
            MessageLocation messageLocation = moment.location;
            if (messageLocation != null) {
                codedOutputByteBufferNano.m17254K(59, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            List<Media> list = moment.media;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(60, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = moment.landingPage;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(61, str4);
            }
            PartialIdList partialIdList2 = moment.messages;
            if (partialIdList2 != null) {
                codedOutputByteBufferNano.m17254K(62, partialIdList2, PartialIdList.PROTOBUF_ADAPTER);
            }
            MomentSettings momentSettings = moment.settings;
            if (momentSettings != null) {
                codedOutputByteBufferNano.m17254K(63, momentSettings, MomentSettings.PROTOBUF_ADAPTER);
            }
            DyMomentSource dyMomentSource = moment.dynamicType;
            if (dyMomentSource != null) {
                codedOutputByteBufferNano.m17250G(64, dyMomentSource.ordinal());
            }
            String str5 = moment.musicId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(65, str5);
            }
            String str6 = moment.status;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(66, str6);
            }
            MomentType momentType = moment.momentType;
            if (momentType != null) {
                codedOutputByteBufferNano.m17250G(67, momentType.ordinal());
            }
            List<TopicMomentIdBox> list2 = moment.topics;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(68, list2, TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str7 = moment.hyperlink;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(69, str7);
            }
            DyMomentSource dyMomentSource2 = moment.dynamicType;
            if (dyMomentSource2 != null) {
                codedOutputByteBufferNano.m17254K(70, dyMomentSource2, DyMomentSource.PROTOBUF_ADAPTER);
            }
            MomentType momentType2 = moment.momentType;
            if (momentType2 != null) {
                codedOutputByteBufferNano.m17254K(71, momentType2, MomentType.PROTOBUF_ADAPTER);
            }
            UserSetVisibility userSetVisibility = moment.userSetVisibility;
            if (userSetVisibility != null) {
                codedOutputByteBufferNano.m17254K(72, userSetVisibility, UserSetVisibility.PROTOBUF_ADAPTER);
            }
            UserSetVisibility userSetVisibility2 = moment.userSetVisibility;
            if (userSetVisibility2 != null) {
                codedOutputByteBufferNano.m17250G(73, userSetVisibility2.ordinal());
            }
            MomentSimpleActivity momentSimpleActivity = moment.simpleActivity;
            if (momentSimpleActivity != null) {
                codedOutputByteBufferNano.m17254K(74, momentSimpleActivity, MomentSimpleActivity.PROTOBUF_ADAPTER);
            }
            MomentAdditionalData momentAdditionalData = moment.additionalData;
            if (momentAdditionalData != null) {
                codedOutputByteBufferNano.m17254K(75, momentAdditionalData, MomentAdditionalData.PROTOBUF_ADAPTER);
            }
            GroupIdBox groupIdBox = moment.group;
            if (groupIdBox != null) {
                codedOutputByteBufferNano.m17254K(76, groupIdBox, GroupIdBox.PROTOBUF_ADAPTER);
            }
            String str8 = moment.deeplink;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(77, str8);
            }
            ThirdShareSource thirdShareSource = moment.thirdShareSource;
            if (thirdShareSource != null) {
                codedOutputByteBufferNano.m17254K(78, thirdShareSource, ThirdShareSource.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(79, moment.attitudeId);
            Attitudes attitudes = moment.attitudes;
            if (attitudes != null) {
                codedOutputByteBufferNano.m17254K(80, attitudes, Attitudes.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(81, moment.shareMyVote);
            MomentAllowForwardState momentAllowForwardState = moment.allowForward;
            if (momentAllowForwardState != null) {
                codedOutputByteBufferNano.m17254K(82, momentAllowForwardState, MomentAllowForwardState.PROTOBUF_ADAPTER);
            }
            MomentForwards momentForwards = moment.forwards;
            if (momentForwards != null) {
                codedOutputByteBufferNano.m17254K(83, momentForwards, MomentForwards.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(84, moment.isNewUserAIMoment);
        }
    };
    public static JsonAdapter<Moment> JSON_ADAPTER = new ObjectJsonAdapter<Moment>() { // from class: com.p1.mobile.putong.feed.data.Moment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Moment.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Moment newInstance() {
            return new Moment();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(Moment moment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1965120365:
                    if (str.equals("commentAtOnce")) {
                        b = 0;
                    }
                    break;
                case -1948377038:
                    if (str.equals("momentViewer")) {
                        b = 1;
                    }
                    break;
                case -1811880640:
                    if (str.equals("cameraStickerIds")) {
                        b = 2;
                    }
                    break;
                case -1751897025:
                    if (str.equals("notifyUsers")) {
                        b = 3;
                    }
                    break;
                case -1745161412:
                    if (str.equals("allowForward")) {
                        b = 4;
                    }
                    break;
                case -1641502647:
                    if (str.equals("isNewUserAIMoment")) {
                        b = 5;
                    }
                    break;
                case -1426574555:
                    if (str.equals("haveLiked")) {
                        b = 6;
                    }
                    break;
                case -1400907425:
                    if (str.equals("iconTitle")) {
                        b = 7;
                    }
                    break;
                case -1180332746:
                    if (str.equals("isLive")) {
                        b = 8;
                    }
                    break;
                case -1110417409:
                    if (str.equals("labels")) {
                        b = 9;
                    }
                    break;
                case -1019273922:
                    if (str.equals(BLiveType.voiceLive)) {
                        b = 10;
                    }
                    break;
                case -974458767:
                    if (str.equals("additionalData")) {
                        b = 11;
                    }
                    break;
                case -934521548:
                    if (str.equals("report")) {
                        b = 12;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -868034268:
                    if (str.equals("topics")) {
                        b = 14;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 15;
                    }
                    break;
                case -466438431:
                    if (str.equals("simpleActivity")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 17;
                    }
                    break;
                case -258659303:
                    if (str.equals("dynamicType")) {
                        b = 18;
                    }
                    break;
                case -233869047:
                    if (str.equals(Attitudes.TYPE)) {
                        b = 19;
                    }
                    break;
                case -103630987:
                    if (str.equals("shareMyVote")) {
                        b = 20;
                    }
                    break;
                case -102003469:
                    if (str.equals("thirdShareSource")) {
                        b = 21;
                    }
                    break;
                case -96964855:
                    if (str.equals("userSetVisibility")) {
                        b = 22;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 23;
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        b = 24;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        b = 25;
                    }
                    break;
                case 102974396:
                    if (str.equals("likes")) {
                        b = 26;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        b = 27;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 28;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        b = 29;
                    }
                    break;
                case 112204398:
                    if (str.equals("views")) {
                        b = 30;
                    }
                    break;
                case 159145780:
                    if (str.equals("isVoiceLive")) {
                        b = 31;
                    }
                    break;
                case 483313230:
                    if (str.equals("forwards")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 497102150:
                    if (str.equals("landingPage")) {
                        b = 33;
                    }
                    break;
                case 629233382:
                    if (str.equals(LinkAction.deeplink)) {
                        b = 34;
                    }
                    break;
                case 686196058:
                    if (str.equals("momentType")) {
                        b = 35;
                    }
                    break;
                case 751294566:
                    if (str.equals("hyperlink")) {
                        b = 36;
                    }
                    break;
                case 997906181:
                    if (str.equals("liveState")) {
                        b = 37;
                    }
                    break;
                case 1339992933:
                    if (str.equals("attitudeId")) {
                        b = 38;
                    }
                    break;
                case 1412694560:
                    if (str.equals("musicId")) {
                        b = 39;
                    }
                    break;
                case 1434631203:
                    if (str.equals(Settings.TYPE)) {
                        b = 40;
                    }
                    break;
                case 1566172293:
                    if (str.equals("multiCallInfo")) {
                        b = 41;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 42;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    moment.commentAtOnce = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    moment.momentViewer = MomentViewerBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    moment.cameraStickerIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    moment.notifyUsers = JsonAdapter.parseArray(jsonParser, NotifyUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    moment.allowForward = MomentAllowForwardState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 5:
                    moment.isNewUserAIMoment = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    moment.haveLiked = jsonParser.getValueAsBoolean();
                    return true;
                case 7:
                    moment.iconTitle = jsonParser.getValueAsString();
                    return true;
                case 8:
                    moment.isLive = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    moment.labels = JsonAdapter.parseArray(jsonParser, MomentLabels.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    moment.voiceLive = VoiceLive.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    moment.additionalData = MomentAdditionalData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    moment.report = jsonParser.getValueAsString();
                    return true;
                case 13:
                    moment.status = jsonParser.getValueAsString();
                    return true;
                case 14:
                    moment.topics = JsonAdapter.parseArray(jsonParser, TopicMomentIdBox.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    moment.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 16:
                    moment.simpleActivity = MomentSimpleActivity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    moment.messages = PartialIdList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    moment.dynamicType = DyMomentSource.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 19:
                    moment.attitudes = Attitudes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    moment.shareMyVote = jsonParser.getValueAsBoolean();
                    return true;
                case 21:
                    moment.thirdShareSource = ThirdShareSource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    moment.userSetVisibility = UserSetVisibility.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 23:
                    moment.f56011id = jsonParser.getValueAsString();
                    return false;
                case 24:
                    moment.live = Live.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    moment.group = GroupIdBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    moment.likes = PartialIdList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    moment.media = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    moment.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case 29:
                    moment.value = jsonParser.getValueAsString();
                    return true;
                case 30:
                    moment.views = jsonParser.getValueAsInt();
                    return true;
                case 31:
                    moment.isVoiceLive = jsonParser.getValueAsBoolean();
                    return true;
                case 32:
                    moment.forwards = MomentForwards.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 33:
                    moment.landingPage = jsonParser.getValueAsString();
                    return true;
                case 34:
                    moment.deeplink = jsonParser.getValueAsString();
                    return true;
                case 35:
                    moment.momentType = MomentType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 36:
                    moment.hyperlink = jsonParser.getValueAsString();
                    return true;
                case 37:
                    moment.liveState = jsonParser.getValueAsString();
                    return true;
                case 38:
                    moment.attitudeId = jsonParser.getValueAsInt();
                    return true;
                case 39:
                    moment.musicId = jsonParser.getValueAsString();
                    return true;
                case 40:
                    moment.settings = MomentSettings.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 41:
                    moment.multiCallInfo = LiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 42:
                    moment.location = MessageLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(Moment moment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1965120365:
                    if (str.equals("commentAtOnce")) {
                        b = 0;
                    }
                    break;
                case -1948377038:
                    if (str.equals("momentViewer")) {
                        b = 1;
                    }
                    break;
                case -1811880640:
                    if (str.equals("cameraStickerIds")) {
                        b = 2;
                    }
                    break;
                case -1751897025:
                    if (str.equals("notifyUsers")) {
                        b = 3;
                    }
                    break;
                case -1745161412:
                    if (str.equals("allowForward")) {
                        b = 4;
                    }
                    break;
                case -1641502647:
                    if (str.equals("isNewUserAIMoment")) {
                        b = 5;
                    }
                    break;
                case -1426574555:
                    if (str.equals("haveLiked")) {
                        b = 6;
                    }
                    break;
                case -1400907425:
                    if (str.equals("iconTitle")) {
                        b = 7;
                    }
                    break;
                case -1180332746:
                    if (str.equals("isLive")) {
                        b = 8;
                    }
                    break;
                case -1110417409:
                    if (str.equals("labels")) {
                        b = 9;
                    }
                    break;
                case -1019273922:
                    if (str.equals(BLiveType.voiceLive)) {
                        b = 10;
                    }
                    break;
                case -974458767:
                    if (str.equals("additionalData")) {
                        b = 11;
                    }
                    break;
                case -934521548:
                    if (str.equals("report")) {
                        b = 12;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -868034268:
                    if (str.equals("topics")) {
                        b = 14;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 15;
                    }
                    break;
                case -466438431:
                    if (str.equals("simpleActivity")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 17;
                    }
                    break;
                case -258659303:
                    if (str.equals("dynamicType")) {
                        b = 18;
                    }
                    break;
                case -233869047:
                    if (str.equals(Attitudes.TYPE)) {
                        b = 19;
                    }
                    break;
                case -103630987:
                    if (str.equals("shareMyVote")) {
                        b = 20;
                    }
                    break;
                case -102003469:
                    if (str.equals("thirdShareSource")) {
                        b = 21;
                    }
                    break;
                case -96964855:
                    if (str.equals("userSetVisibility")) {
                        b = 22;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 23;
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        b = 24;
                    }
                    break;
                case 98629247:
                    if (str.equals("group")) {
                        b = 25;
                    }
                    break;
                case 102974396:
                    if (str.equals("likes")) {
                        b = 26;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        b = 27;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 28;
                    }
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        b = 29;
                    }
                    break;
                case 112204398:
                    if (str.equals("views")) {
                        b = 30;
                    }
                    break;
                case 159145780:
                    if (str.equals("isVoiceLive")) {
                        b = 31;
                    }
                    break;
                case 483313230:
                    if (str.equals("forwards")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 497102150:
                    if (str.equals("landingPage")) {
                        b = 33;
                    }
                    break;
                case 629233382:
                    if (str.equals(LinkAction.deeplink)) {
                        b = 34;
                    }
                    break;
                case 686196058:
                    if (str.equals("momentType")) {
                        b = 35;
                    }
                    break;
                case 751294566:
                    if (str.equals("hyperlink")) {
                        b = 36;
                    }
                    break;
                case 997906181:
                    if (str.equals("liveState")) {
                        b = 37;
                    }
                    break;
                case 1339992933:
                    if (str.equals("attitudeId")) {
                        b = 38;
                    }
                    break;
                case 1412694560:
                    if (str.equals("musicId")) {
                        b = 39;
                    }
                    break;
                case 1434631203:
                    if (str.equals(Settings.TYPE)) {
                        b = 40;
                    }
                    break;
                case 1566172293:
                    if (str.equals("multiCallInfo")) {
                        b = 41;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 42;
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
                case 23:
                    return false;
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
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    return true;
                default:
                    return super.parseFieldCheck(moment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Moment moment, JsonGenerator jsonGenerator) throws IOException {
            String str = moment.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = moment.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(moment.createdTime), jsonGenerator, true);
            if (moment.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(moment.owner, jsonGenerator, true);
            }
            if (moment.likes != null) {
                jsonGenerator.writeFieldName("likes");
                PartialIdList.JSON_ADAPTER.serialize(moment.likes, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("haveLiked", moment.haveLiked);
            if (moment.location != null) {
                jsonGenerator.writeFieldName("location");
                MessageLocation.JSON_ADAPTER.serialize(moment.location, jsonGenerator, true);
            }
            if (moment.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(moment.media, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str3 = moment.landingPage;
            if (str3 != null) {
                jsonGenerator.writeStringField("landingPage", str3);
            }
            if (moment.messages != null) {
                jsonGenerator.writeFieldName("messages");
                PartialIdList.JSON_ADAPTER.serialize(moment.messages, jsonGenerator, true);
            }
            if (moment.settings != null) {
                jsonGenerator.writeFieldName(Settings.TYPE);
                MomentSettings.JSON_ADAPTER.serialize(moment.settings, jsonGenerator, true);
            }
            if (moment.dynamicType != null) {
                jsonGenerator.writeFieldName("dynamicType");
                DyMomentSource.JSON_ADAPTER.serialize(moment.dynamicType, jsonGenerator, true);
            }
            String str4 = moment.musicId;
            if (str4 != null) {
                jsonGenerator.writeStringField("musicId", str4);
            }
            String str5 = moment.status;
            if (str5 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str5);
            }
            if (moment.momentType != null) {
                jsonGenerator.writeFieldName("momentType");
                MomentType.JSON_ADAPTER.serialize(moment.momentType, jsonGenerator, true);
            }
            if (moment.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(moment.topics, jsonGenerator, TopicMomentIdBox.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("isLive", moment.isLive);
            if (moment.live != null) {
                jsonGenerator.writeFieldName("live");
                Live.JSON_ADAPTER.serialize(moment.live, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isVoiceLive", moment.isVoiceLive);
            if (moment.voiceLive != null) {
                jsonGenerator.writeFieldName(BLiveType.voiceLive);
                VoiceLive.JSON_ADAPTER.serialize(moment.voiceLive, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("views", moment.views);
            String str6 = moment.liveState;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveState", str6);
            }
            String str7 = moment.iconTitle;
            if (str7 != null) {
                jsonGenerator.writeStringField("iconTitle", str7);
            }
            if (moment.labels != null) {
                jsonGenerator.writeFieldName("labels");
                JsonAdapter.serializeArray(moment.labels, jsonGenerator, MomentLabels.JSON_ADAPTER);
            }
            String str8 = moment.hyperlink;
            if (str8 != null) {
                jsonGenerator.writeStringField("hyperlink", str8);
            }
            if (moment.userSetVisibility != null) {
                jsonGenerator.writeFieldName("userSetVisibility");
                UserSetVisibility.JSON_ADAPTER.serialize(moment.userSetVisibility, jsonGenerator, true);
            }
            if (moment.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                LiveMultiCallInfo.JSON_ADAPTER.serialize(moment.multiCallInfo, jsonGenerator, true);
            }
            if (moment.simpleActivity != null) {
                jsonGenerator.writeFieldName("simpleActivity");
                MomentSimpleActivity.JSON_ADAPTER.serialize(moment.simpleActivity, jsonGenerator, true);
            }
            if (moment.additionalData != null) {
                jsonGenerator.writeFieldName("additionalData");
                MomentAdditionalData.JSON_ADAPTER.serialize(moment.additionalData, jsonGenerator, true);
            }
            if (moment.group != null) {
                jsonGenerator.writeFieldName("group");
                GroupIdBox.JSON_ADAPTER.serialize(moment.group, jsonGenerator, true);
            }
            String str9 = moment.deeplink;
            if (str9 != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str9);
            }
            if (moment.cameraStickerIds != null) {
                jsonGenerator.writeFieldName("cameraStickerIds");
                JsonAdapter.serializeArray(moment.cameraStickerIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (moment.thirdShareSource != null) {
                jsonGenerator.writeFieldName("thirdShareSource");
                ThirdShareSource.JSON_ADAPTER.serialize(moment.thirdShareSource, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("attitudeId", moment.attitudeId);
            if (moment.attitudes != null) {
                jsonGenerator.writeFieldName(Attitudes.TYPE);
                Attitudes.JSON_ADAPTER.serialize(moment.attitudes, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("shareMyVote", moment.shareMyVote);
            jsonGenerator.writeBooleanField("commentAtOnce", moment.commentAtOnce);
            if (moment.allowForward != null) {
                jsonGenerator.writeFieldName("allowForward");
                MomentAllowForwardState.JSON_ADAPTER.serialize(moment.allowForward, jsonGenerator, true);
            }
            if (moment.forwards != null) {
                jsonGenerator.writeFieldName("forwards");
                MomentForwards.JSON_ADAPTER.serialize(moment.forwards, jsonGenerator, true);
            }
            if (moment.momentViewer != null) {
                jsonGenerator.writeFieldName("momentViewer");
                MomentViewerBox.JSON_ADAPTER.serialize(moment.momentViewer, jsonGenerator, true);
            }
            if (moment.notifyUsers != null) {
                jsonGenerator.writeFieldName("notifyUsers");
                JsonAdapter.serializeArray(moment.notifyUsers, jsonGenerator, NotifyUser.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("isNewUserAIMoment", moment.isNewUserAIMoment);
            String str10 = moment.report;
            if (str10 != null) {
                jsonGenerator.writeStringField("report", str10);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Moment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Moment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Moment> _ID = new LongColumn<Moment>("_id") { // from class: com.p1.mobile.putong.feed.data.Moment.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Moment moment) {
            return Long.valueOf(moment._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Long l2) {
            moment._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Moment> f39230ID = new StringColumn<Moment>("id_c") { // from class: com.p1.mobile.putong.feed.data.Moment.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.f56011id = str;
        }
    };
    public static final IntegerColumn<Moment> LOCALCREATEDSESSION = new IntegerColumn<Moment>("localCreatedSession_c") { // from class: com.p1.mobile.putong.feed.data.Moment.5
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Moment moment) {
            return Integer.valueOf(moment.localCreatedSession);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Integer num) {
            moment.localCreatedSession = num.intValue();
        }
    };
    public static final BooleanColumn<Moment> LOCALINFEED = new BooleanColumn<Moment>("localInFeed_c") { // from class: com.p1.mobile.putong.feed.data.Moment.6
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Moment moment) {
            return Boolean.valueOf(moment.localInFeed);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Boolean bool) {
            moment.localInFeed = bool.booleanValue();
        }
    };
    public static final BooleanColumn<Moment> LOCALINUSERFEED = new BooleanColumn<Moment>("localInUserFeed_c") { // from class: com.p1.mobile.putong.feed.data.Moment.7
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Moment moment) {
            return Boolean.valueOf(moment.localInUserFeed);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Boolean bool) {
            moment.localInUserFeed = bool.booleanValue();
        }
    };
    public static final StringColumn<Moment> VALUE = new StringColumn<Moment>("value_c") { // from class: com.p1.mobile.putong.feed.data.Moment.8
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.value;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.value = str;
        }
    };
    public static final DoubleColumn<Moment> CREATEDTIME = new DoubleColumn<Moment>("createdTime_c") { // from class: com.p1.mobile.putong.feed.data.Moment.9
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(Moment moment) {
            return Double.valueOf(moment.createdTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Double d) {
            moment.createdTime = d.doubleValue();
        }
    };
    public static final StringColumn<Moment> OWNER = new StringColumn<Moment>("owner_c") { // from class: com.p1.mobile.putong.feed.data.Moment.10
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.owner;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.owner = str;
        }
    };
    public static final IntegerColumn<Moment> LIKES_COUNT = new IntegerColumn<Moment>("likes_count_c") { // from class: com.p1.mobile.putong.feed.data.Moment.11
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Moment moment) {
            return Integer.valueOf(moment.likes.count);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Integer num) {
            moment.likes.count = num.intValue();
        }
    };
    public static final Column<Moment, List<String>> LIKES_IDS = new Column<Moment, List<String>>("likes_ids_c") { // from class: com.p1.mobile.putong.feed.data.Moment.12
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Moment moment) {
            return moment.likes.ids;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, List<String> list) {
            moment.likes.ids = list;
        }
    };
    public static final StringColumn<Moment> LIKES_LINKS_PREVIOUS = new StringColumn<Moment>("likes_links_previous_c") { // from class: com.p1.mobile.putong.feed.data.Moment.13
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.likes.links.previous;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.likes.links.previous = str;
        }
    };
    public static final StringColumn<Moment> LIKES_LINKS_NEXT = new StringColumn<Moment>("likes_links_next_c") { // from class: com.p1.mobile.putong.feed.data.Moment.14
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.likes.links.next;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.likes.links.next = str;
        }
    };
    public static final BooleanColumn<Moment> HAVELIKED = new BooleanColumn<Moment>("haveLiked_c") { // from class: com.p1.mobile.putong.feed.data.Moment.15
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Moment moment) {
            return Boolean.valueOf(moment.haveLiked);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Boolean bool) {
            moment.haveLiked = bool.booleanValue();
        }
    };
    public static final Column<Moment, MessageLocation> LOCATION = new Column<Moment, MessageLocation>("location_c") { // from class: com.p1.mobile.putong.feed.data.Moment.16
        @Override // com.tantanapp.common.data.orm.Column
        public MessageLocation get(Moment moment) {
            return moment.location;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, MessageLocation messageLocation) {
            moment.location = messageLocation;
        }
    };
    public static final Column<Moment, List<Media>> MEDIA = new Column<Moment, List<Media>>("media_c") { // from class: com.p1.mobile.putong.feed.data.Moment.17
        @Override // com.tantanapp.common.data.orm.Column
        public List<Media> get(Moment moment) {
            return moment.media;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, List<Media> list) {
            moment.media = list;
        }
    };
    public static final StringColumn<Moment> LANDINGPAGE = new StringColumn<Moment>("landingPage_c") { // from class: com.p1.mobile.putong.feed.data.Moment.18
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.landingPage;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.landingPage = str;
        }
    };
    public static final IntegerColumn<Moment> MESSAGES_COUNT = new IntegerColumn<Moment>("messages_count_c") { // from class: com.p1.mobile.putong.feed.data.Moment.19
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Moment moment) {
            return Integer.valueOf(moment.messages.count);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Integer num) {
            moment.messages.count = num.intValue();
        }
    };
    public static final Column<Moment, List<String>> MESSAGES_IDS = new Column<Moment, List<String>>("messages_ids_c") { // from class: com.p1.mobile.putong.feed.data.Moment.20
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Moment moment) {
            return moment.messages.ids;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, List<String> list) {
            moment.messages.ids = list;
        }
    };
    public static final StringColumn<Moment> MESSAGES_LINKS_PREVIOUS = new StringColumn<Moment>("messages_links_previous_c") { // from class: com.p1.mobile.putong.feed.data.Moment.21
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.messages.links.previous;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.messages.links.previous = str;
        }
    };
    public static final StringColumn<Moment> MESSAGES_LINKS_NEXT = new StringColumn<Moment>("messages_links_next_c") { // from class: com.p1.mobile.putong.feed.data.Moment.22
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.messages.links.next;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.messages.links.next = str;
        }
    };
    public static final TEnumColumn<Moment, MomentVisibilityStatus> SETTINGS_VISIBILITY = new TEnumColumn<Moment, MomentVisibilityStatus>("str_settings_visibility_c", "settings_visibility_c", MomentVisibilityStatus.JSON_ADAPTER) { // from class: com.p1.mobile.putong.feed.data.Moment.23
        @Override // com.tantanapp.common.data.orm.Column
        public MomentVisibilityStatus get(Moment moment) {
            return moment.settings.visibility;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Moment moment, MomentVisibilityStatus momentVisibilityStatus) {
            moment.settings.visibility = momentVisibilityStatus;
        }
    };
    public static final BooleanColumn<Moment> SETTINGS_MUTED = new BooleanColumn<Moment>("settings_muted_c") { // from class: com.p1.mobile.putong.feed.data.Moment.24
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Moment moment) {
            return Boolean.valueOf(moment.settings.muted);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Boolean bool) {
            moment.settings.muted = bool.booleanValue();
        }
    };
    public static final TEnumColumn<Moment, DyMomentSource> DYNAMICTYPE = new TEnumColumn<Moment, DyMomentSource>("str_dynamicType_c", "dynamicType_c", DyMomentSource.JSON_ADAPTER) { // from class: com.p1.mobile.putong.feed.data.Moment.25
        @Override // com.tantanapp.common.data.orm.Column
        public DyMomentSource get(Moment moment) {
            return moment.dynamicType;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Moment moment, DyMomentSource dyMomentSource) {
            moment.dynamicType = dyMomentSource;
        }
    };
    public static final StringColumn<Moment> MUSICID = new StringColumn<Moment>("musicId_c") { // from class: com.p1.mobile.putong.feed.data.Moment.26
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.musicId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.musicId = str;
        }
    };
    public static final StringColumn<Moment> STATUS = new StringColumn<Moment>("status_c") { // from class: com.p1.mobile.putong.feed.data.Moment.27
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.status;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.status = str;
        }
    };
    public static final TEnumColumn<Moment, MomentType> MOMENTTYPE = new TEnumColumn<Moment, MomentType>("str_momentType_c", "momentType_c", MomentType.JSON_ADAPTER) { // from class: com.p1.mobile.putong.feed.data.Moment.28
        @Override // com.tantanapp.common.data.orm.Column
        public MomentType get(Moment moment) {
            return moment.momentType;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Moment moment, MomentType momentType) {
            moment.momentType = momentType;
        }
    };
    public static final Column<Moment, List<TopicMomentIdBox>> TOPICS = new Column<Moment, List<TopicMomentIdBox>>("topics_c") { // from class: com.p1.mobile.putong.feed.data.Moment.29
        @Override // com.tantanapp.common.data.orm.Column
        public List<TopicMomentIdBox> get(Moment moment) {
            return moment.topics;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, List<TopicMomentIdBox> list) {
            moment.topics = list;
        }
    };
    public static final TEnumColumn<Moment, MomentVisibleState> SETTINGS_USERSETVISIBILITY = new TEnumColumn<Moment, MomentVisibleState>("str_settings_userSetVisibility_c", "settings_userSetVisibility_c", MomentVisibleState.JSON_ADAPTER) { // from class: com.p1.mobile.putong.feed.data.Moment.30
        @Override // com.tantanapp.common.data.orm.Column
        public MomentVisibleState get(Moment moment) {
            return moment.settings.userSetVisibility;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Moment moment, MomentVisibleState momentVisibleState) {
            moment.settings.userSetVisibility = momentVisibleState;
        }
    };
    public static final BooleanColumn<Moment> SETTINGS_ANONYMOUS = new BooleanColumn<Moment>("settings_anonymous_c") { // from class: com.p1.mobile.putong.feed.data.Moment.31
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Moment moment) {
            return Boolean.valueOf(moment.settings.anonymous);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Boolean bool) {
            moment.settings.anonymous = bool.booleanValue();
        }
    };
    public static final StringColumn<Moment> HYPERLINK = new StringColumn<Moment>("hyperlink_c") { // from class: com.p1.mobile.putong.feed.data.Moment.32
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.hyperlink;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.hyperlink = str;
        }
    };
    public static final TEnumColumn<Moment, UserSetVisibility> USERSETVISIBILITY = new TEnumColumn<Moment, UserSetVisibility>("str_userSetVisibility_c", "userSetVisibility_c", UserSetVisibility.JSON_ADAPTER) { // from class: com.p1.mobile.putong.feed.data.Moment.33
        @Override // com.tantanapp.common.data.orm.Column
        public UserSetVisibility get(Moment moment) {
            return moment.userSetVisibility;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Moment moment, UserSetVisibility userSetVisibility) {
            moment.userSetVisibility = userSetVisibility;
        }
    };
    public static final StringColumn<Moment> SIMPLEACTIVITY_ID = new StringColumn<Moment>("simpleActivity_id_c") { // from class: com.p1.mobile.putong.feed.data.Moment.34
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.simpleActivity.f39235id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.simpleActivity.f39235id = str;
        }
    };
    public static final StringColumn<Moment> SIMPLEACTIVITY_NAME = new StringColumn<Moment>("simpleActivity_name_c") { // from class: com.p1.mobile.putong.feed.data.Moment.35
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.simpleActivity.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.simpleActivity.name = str;
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SENDFROM_ID = new StringColumn<Moment>("additionalData_sendFrom_id_c") { // from class: com.p1.mobile.putong.feed.data.Moment.36
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.sendFrom.f39234id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.sendFrom.f39234id = str;
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SENDFROM_NAME = new StringColumn<Moment>("additionalData_sendFrom_name_c") { // from class: com.p1.mobile.putong.feed.data.Moment.37
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.sendFrom.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.sendFrom.name = str;
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SENDFROM_SOURCETYPE = new StringColumn<Moment>("additionalData_sendFrom_sourceType_c") { // from class: com.p1.mobile.putong.feed.data.Moment.38
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.sendFrom.sourceType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.sendFrom.sourceType = str;
        }
    };
    public static final StringColumn<Moment> GROUP_ID = new StringColumn<Moment>("group_id_c") { // from class: com.p1.mobile.putong.feed.data.Moment.39
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.group.f39223id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.group.f39223id = str;
        }
    };
    public static final StringColumn<Moment> GROUP_NAME = new StringColumn<Moment>("group_name_c") { // from class: com.p1.mobile.putong.feed.data.Moment.40
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.group.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.group.name = str;
        }
    };
    public static final BooleanColumn<Moment> GROUP_LASTJOINED = new BooleanColumn<Moment>("group_lastJoined_c") { // from class: com.p1.mobile.putong.feed.data.Moment.41
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Moment moment) {
            return Boolean.valueOf(moment.group.lastJoined);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Boolean bool) {
            moment.group.lastJoined = bool.booleanValue();
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SHARE_TITLE = new StringColumn<Moment>("additionalData_share_title_c") { // from class: com.p1.mobile.putong.feed.data.Moment.42
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.share.title;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.share.title = str;
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SHARE_DESCRIPTION = new StringColumn<Moment>("additionalData_share_description_c") { // from class: com.p1.mobile.putong.feed.data.Moment.43
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.share.description;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.share.description = str;
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SHARE_URL = new StringColumn<Moment>("additionalData_share_url_c") { // from class: com.p1.mobile.putong.feed.data.Moment.44
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.share.url;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.share.url = str;
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SHARE_LANDINGPAGE = new StringColumn<Moment>("additionalData_share_landingPage_c") { // from class: com.p1.mobile.putong.feed.data.Moment.45
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.share.landingPage;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.share.landingPage = str;
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SHARE_NAME = new StringColumn<Moment>("additionalData_share_name_c") { // from class: com.p1.mobile.putong.feed.data.Moment.46
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.share.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.share.name = str;
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SHARE_SHAREFROM = new StringColumn<Moment>("additionalData_share_shareFrom_c") { // from class: com.p1.mobile.putong.feed.data.Moment.47
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.share.shareFrom;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.share.shareFrom = str;
        }
    };
    public static final StringColumn<Moment> ADDITIONALDATA_SHARE_TESTID = new StringColumn<Moment>("additionalData_share_testId_c") { // from class: com.p1.mobile.putong.feed.data.Moment.48
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.additionalData.share.testId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.additionalData.share.testId = str;
        }
    };
    public static final StringColumn<Moment> DEEPLINK = new StringColumn<Moment>("deeplink_c") { // from class: com.p1.mobile.putong.feed.data.Moment.49
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.deeplink;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.deeplink = str;
        }
    };
    public static final StringColumn<Moment> THIRDSHARESOURCE_SOURCEID = new StringColumn<Moment>("thirdShareSource_sourceId_c") { // from class: com.p1.mobile.putong.feed.data.Moment.50
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.thirdShareSource.sourceId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.thirdShareSource.sourceId = str;
        }
    };
    public static final StringColumn<Moment> THIRDSHARESOURCE_SOURCETYPE = new StringColumn<Moment>("thirdShareSource_sourceType_c") { // from class: com.p1.mobile.putong.feed.data.Moment.51
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.thirdShareSource.sourceType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.thirdShareSource.sourceType = str;
        }
    };
    public static final IntegerColumn<Moment> ATTITUDEID = new IntegerColumn<Moment>("attitudeId_c") { // from class: com.p1.mobile.putong.feed.data.Moment.52
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Moment moment) {
            return Integer.valueOf(moment.attitudeId);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Integer num) {
            moment.attitudeId = num.intValue();
        }
    };
    public static final IntegerColumn<Moment> ATTITUDES_COUNT = new IntegerColumn<Moment>("attitudes_count_c") { // from class: com.p1.mobile.putong.feed.data.Moment.53
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Moment moment) {
            return Integer.valueOf(moment.attitudes.count);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Integer num) {
            moment.attitudes.count = num.intValue();
        }
    };
    public static final BooleanColumn<Moment> SHAREMYVOTE = new BooleanColumn<Moment>("shareMyVote_c") { // from class: com.p1.mobile.putong.feed.data.Moment.54
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Moment moment) {
            return Boolean.valueOf(moment.shareMyVote);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Boolean bool) {
            moment.shareMyVote = bool.booleanValue();
        }
    };
    public static final StringColumn<Moment> SIMPLEACTIVITY_URL = new StringColumn<Moment>("simpleActivity_url_c") { // from class: com.p1.mobile.putong.feed.data.Moment.55
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Moment moment) {
            return moment.simpleActivity.url;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, String str) {
            moment.simpleActivity.url = str;
        }
    };
    public static final TEnumColumn<Moment, MomentAllowForwardState> ALLOWFORWARD = new TEnumColumn<Moment, MomentAllowForwardState>("allowForward_c", null, MomentAllowForwardState.JSON_ADAPTER) { // from class: com.p1.mobile.putong.feed.data.Moment.56
        @Override // com.tantanapp.common.data.orm.Column
        public MomentAllowForwardState get(Moment moment) {
            return moment.allowForward;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Moment moment, MomentAllowForwardState momentAllowForwardState) {
            moment.allowForward = momentAllowForwardState;
        }
    };
    public static final IntegerColumn<Moment> FORWARDS_COUNT = new IntegerColumn<Moment>("forwards_count_c") { // from class: com.p1.mobile.putong.feed.data.Moment.57
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(Moment moment) {
            return Integer.valueOf(moment.forwards.count);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Integer num) {
            moment.forwards.count = num.intValue();
        }
    };
    public static final BooleanColumn<Moment> ISNEWUSERAIMOMENT = new BooleanColumn<Moment>("isNewUserAIMoment_c") { // from class: com.p1.mobile.putong.feed.data.Moment.58
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Moment moment) {
            return Boolean.valueOf(moment.isNewUserAIMoment);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Moment moment, Boolean bool) {
            moment.isNewUserAIMoment = bool.booleanValue();
        }
    };
    public static mrf0<Moment> DB_ADAPTER = new mrf0<Moment>() { // from class: com.p1.mobile.putong.feed.data.Moment.59
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,localCreatedSession_c INTEGER,localInFeed_c INTEGER,localInUserFeed_c INTEGER,value_c TEXT,createdTime_c REAL,owner_c TEXT,likes_count_c INTEGER,likes_ids_c BLOB,likes_links_previous_c TEXT,likes_links_next_c TEXT,haveLiked_c INTEGER,location_c BLOB,media_c BLOB,landingPage_c TEXT,messages_count_c INTEGER,messages_ids_c BLOB,messages_links_previous_c TEXT,messages_links_next_c TEXT,settings_visibility_c INTEGER,settings_muted_c INTEGER,dynamicType_c INTEGER,musicId_c TEXT,status_c TEXT,momentType_c INTEGER,topics_c BLOB,settings_userSetVisibility_c INTEGER,settings_anonymous_c INTEGER,hyperlink_c TEXT,str_settings_visibility_c TEXT,str_dynamicType_c TEXT,str_momentType_c TEXT,str_settings_userSetVisibility_c TEXT,userSetVisibility_c INTEGER,str_userSetVisibility_c TEXT,simpleActivity_id_c TEXT,simpleActivity_name_c TEXT,additionalData_sendFrom_id_c TEXT,additionalData_sendFrom_name_c TEXT,additionalData_sendFrom_sourceType_c TEXT,group_id_c TEXT,group_name_c TEXT,group_lastJoined_c INTEGER,additionalData_share_title_c TEXT,additionalData_share_description_c TEXT,additionalData_share_url_c TEXT,additionalData_share_landingPage_c TEXT,additionalData_share_name_c TEXT,additionalData_share_shareFrom_c TEXT,additionalData_share_testId_c TEXT,deeplink_c TEXT,thirdShareSource_sourceId_c TEXT,thirdShareSource_sourceType_c TEXT,attitudeId_c INTEGER,attitudes_count_c INTEGER,shareMyVote_c INTEGER,simpleActivity_url_c TEXT,allowForward_c TEXT,forwards_count_c INTEGER,isNewUserAIMoment_c INTEGER)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return Moment.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public Moment init() {
            Moment moment = new Moment();
            if (moment.value == null) {
                moment.value = "";
            }
            if (moment.owner == null) {
                moment.owner = "";
            }
            if (moment.likes == null) {
                moment.likes = PartialIdList.new_();
            }
            if (moment.media == null) {
                moment.media = new ArrayList();
            }
            if (moment.landingPage == null) {
                moment.landingPage = "";
            }
            if (moment.messages == null) {
                moment.messages = PartialIdList.new_();
            }
            if (moment.settings == null) {
                moment.settings = MomentSettings.new_();
            }
            if (moment.musicId == null) {
                moment.musicId = "";
            }
            if (moment.status == null) {
                moment.status = "";
            }
            if (moment.topics == null) {
                moment.topics = new ArrayList();
            }
            if (moment.live == null) {
                moment.live = Live.new_();
            }
            if (moment.voiceLive == null) {
                moment.voiceLive = VoiceLive.new_();
            }
            if (moment.liveState == null) {
                moment.liveState = "";
            }
            if (moment.iconTitle == null) {
                moment.iconTitle = "";
            }
            if (moment.labels == null) {
                moment.labels = new ArrayList();
            }
            if (moment.hyperlink == null) {
                moment.hyperlink = "";
            }
            if (moment.simpleActivity == null) {
                moment.simpleActivity = MomentSimpleActivity.new_();
            }
            if (moment.additionalData == null) {
                moment.additionalData = MomentAdditionalData.new_();
            }
            if (moment.group == null) {
                moment.group = GroupIdBox.new_();
            }
            if (moment.deeplink == null) {
                moment.deeplink = "";
            }
            if (moment.thirdShareSource == null) {
                moment.thirdShareSource = ThirdShareSource.new_();
            }
            if (moment.attitudes == null) {
                moment.attitudes = Attitudes.new_();
            }
            if (moment.allowForward == null) {
                moment.allowForward = (MomentAllowForwardState) MomentAllowForwardState.JSON_ADAPTER.defaultEnum();
            }
            if (moment.forwards == null) {
                moment.forwards = MomentForwards.new_();
            }
            if (moment.momentViewer == null) {
                moment.momentViewer = MomentViewerBox.new_();
            }
            if (moment.notifyUsers == null) {
                moment.notifyUsers = new ArrayList();
            }
            if (moment.report == null) {
                moment.report = "";
            }
            return moment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:253:0x04fe  */
        /* JADX WARN: Code duplicated, block: B:256:0x0504  */
        /* JADX WARN: Code duplicated, block: B:259:0x050a  */
        /* JADX WARN: Code duplicated, block: B:262:0x0514  */
        /* JADX WARN: Code duplicated, block: B:265:0x051f  */
        /* JADX WARN: Code duplicated, block: B:268:0x0525  */
        /* JADX WARN: Code duplicated, block: B:271:0x052f  */
        /* JADX WARN: Code duplicated, block: B:274:0x0539  */
        /* JADX WARN: Code duplicated, block: B:277:0x053f  */
        /* JADX WARN: Code duplicated, block: B:280:0x0545  */
        /* JADX WARN: Code duplicated, block: B:283:0x0550  */
        /* JADX WARN: Code duplicated, block: B:286:0x055a  */
        /* JADX WARN: Code duplicated, block: B:289:0x0564  */
        /* JADX WARN: Code duplicated, block: B:292:0x056a  */
        /* JADX WARN: Code duplicated, block: B:295:0x0570  */
        /* JADX WARN: Code duplicated, block: B:298:0x057b  */
        /* JADX WARN: Code duplicated, block: B:301:0x0581  */
        /* JADX WARN: Code duplicated, block: B:304:0x058b  */
        /* JADX WARN: Code duplicated, block: B:307:0x0595  */
        /* JADX WARN: Code duplicated, block: B:310:0x059f  */
        /* JADX WARN: Code duplicated, block: B:313:0x05a5  */
        /* JADX WARN: Code duplicated, block: B:316:0x05af  */
        /* JADX WARN: Code duplicated, block: B:319:0x05b9  */
        /* JADX WARN: Code duplicated, block: B:322:0x05c7  */
        /* JADX WARN: Code duplicated, block: B:325:0x05d1  */
        /* JADX WARN: Code duplicated, block: B:328:0x05db  */
        /* JADX WARN: Code duplicated, block: B:331:0x05e6  */
        @Override // p149l.mrf0
        public Moment read(Cursor cursor, int i) {
            String str;
            String string;
            String string2;
            String string3;
            int i2;
            int i3;
            int i4;
            int i5;
            String string4;
            String string5 = "unknown_";
            if (i == 0) {
                this.readIndex = 0;
            }
            Moment moment = new Moment();
            int i6 = -1;
            try {
                moment.likes = new PartialIdList();
                moment.messages = new PartialIdList();
                moment.settings = new MomentSettings();
                moment.simpleActivity = new MomentSimpleActivity();
                moment.additionalData = new MomentAdditionalData();
                moment.group = new GroupIdBox();
                moment.thirdShareSource = new ThirdShareSource();
                moment.attitudes = new Attitudes();
                moment.forwards = new MomentForwards();
                moment.likes.links = new Links();
                moment.messages.links = new Links();
                moment.additionalData.sendFrom = new MomentSendFrom();
                moment.additionalData.share = new MomentShareInfo();
                moment._id = cursor.getLong(i);
                int i7 = i + 1;
                moment.f56011id = cursor.isNull(i7) ? null : cursor.getString(i7);
                moment.localCreatedSession = cursor.getInt(i + 2);
                moment.localInFeed = cursor.getInt(i + 3) == 1;
                moment.localInUserFeed = cursor.getInt(i + 4) == 1;
                int i8 = i + 5;
                moment.value = cursor.isNull(i8) ? null : cursor.getString(i8);
                moment.createdTime = cursor.getDouble(i + 6);
                int i9 = i + 7;
                moment.owner = cursor.isNull(i9) ? null : cursor.getString(i9);
                moment.likes.count = cursor.getInt(i + 8);
                int i10 = i + 9;
                moment.likes.ids = cursor.isNull(i10) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i10));
                int i11 = i + 10;
                moment.likes.links.previous = cursor.isNull(i11) ? null : cursor.getString(i11);
                int i12 = i + 11;
                moment.likes.links.next = cursor.isNull(i12) ? null : cursor.getString(i12);
                moment.haveLiked = cursor.getInt(i + 12) == 1;
                int i13 = i + 13;
                moment.location = cursor.isNull(i13) ? null : MessageLocation.PROTOBUF_ADAPTER.parse(cursor.getBlob(i13));
                int i14 = i + 14;
                moment.media = cursor.isNull(i14) ? null : Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i14));
                int i15 = i + 15;
                moment.landingPage = cursor.isNull(i15) ? null : cursor.getString(i15);
                moment.messages.count = cursor.getInt(i + 16);
                int i16 = i + 17;
                moment.messages.ids = cursor.isNull(i16) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i16));
                int i17 = i + 18;
                moment.messages.links.previous = cursor.isNull(i17) ? null : cursor.getString(i17);
                int i18 = i + 19;
                moment.messages.links.next = cursor.isNull(i18) ? null : cursor.getString(i18);
                int i19 = i + 20;
                i5 = cursor.isNull(i19) ? -1 : cursor.getInt(i19);
                try {
                    moment.settings.muted = cursor.getInt(i + 21) == 1;
                    int i20 = i + 22;
                    i2 = cursor.isNull(i20) ? -1 : cursor.getInt(i20);
                    int i21 = i + 23;
                    try {
                        moment.musicId = cursor.isNull(i21) ? null : cursor.getString(i21);
                        int i22 = i + 24;
                        moment.status = cursor.isNull(i22) ? null : cursor.getString(i22);
                        int i23 = i + 25;
                        i3 = cursor.isNull(i23) ? -1 : cursor.getInt(i23);
                        int i24 = i + 26;
                        try {
                            moment.topics = cursor.isNull(i24) ? null : TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i24));
                            int i25 = i + 27;
                            i4 = cursor.isNull(i25) ? -1 : cursor.getInt(i25);
                            try {
                                moment.settings.anonymous = cursor.getInt(i + 28) == 1;
                                int i26 = i + 29;
                                moment.hyperlink = cursor.isNull(i26) ? null : cursor.getString(i26);
                                int i27 = i + 30;
                                string4 = cursor.isNull(i27) ? null : cursor.getString(i27);
                                int i28 = i + 31;
                                try {
                                    string = cursor.isNull(i28) ? null : cursor.getString(i28);
                                    int i29 = i + 32;
                                    try {
                                        string2 = cursor.isNull(i29) ? null : cursor.getString(i29);
                                        int i30 = i + 33;
                                        try {
                                            string3 = cursor.isNull(i30) ? null : cursor.getString(i30);
                                            int i31 = i + 34;
                                            try {
                                                if (!cursor.isNull(i31)) {
                                                    i6 = cursor.getInt(i31);
                                                }
                                                int i32 = i + 35;
                                                string5 = cursor.isNull(i32) ? null : cursor.getString(i32);
                                                int i33 = i + 36;
                                                moment.simpleActivity.f39235id = cursor.isNull(i33) ? null : cursor.getString(i33);
                                                int i34 = i + 37;
                                                moment.simpleActivity.name = cursor.isNull(i34) ? null : cursor.getString(i34);
                                                int i35 = i + 38;
                                                moment.additionalData.sendFrom.f39234id = cursor.isNull(i35) ? null : cursor.getString(i35);
                                                int i36 = i + 39;
                                                moment.additionalData.sendFrom.name = cursor.isNull(i36) ? null : cursor.getString(i36);
                                                int i37 = i + 40;
                                                moment.additionalData.sendFrom.sourceType = cursor.isNull(i37) ? null : cursor.getString(i37);
                                                int i38 = i + 41;
                                                moment.group.f39223id = cursor.isNull(i38) ? null : cursor.getString(i38);
                                                int i39 = i + 42;
                                                moment.group.name = cursor.isNull(i39) ? null : cursor.getString(i39);
                                                moment.group.lastJoined = cursor.getInt(i + 43) == 1;
                                                int i40 = i + 44;
                                                moment.additionalData.share.title = cursor.isNull(i40) ? null : cursor.getString(i40);
                                                int i41 = i + 45;
                                                moment.additionalData.share.description = cursor.isNull(i41) ? null : cursor.getString(i41);
                                                int i42 = i + 46;
                                                moment.additionalData.share.url = cursor.isNull(i42) ? null : cursor.getString(i42);
                                                int i43 = i + 47;
                                                moment.additionalData.share.landingPage = cursor.isNull(i43) ? null : cursor.getString(i43);
                                                int i44 = i + 48;
                                                moment.additionalData.share.name = cursor.isNull(i44) ? null : cursor.getString(i44);
                                                int i45 = i + 49;
                                                moment.additionalData.share.shareFrom = cursor.isNull(i45) ? null : cursor.getString(i45);
                                                int i46 = i + 50;
                                                moment.additionalData.share.testId = cursor.isNull(i46) ? null : cursor.getString(i46);
                                                int i47 = i + 51;
                                                moment.deeplink = cursor.isNull(i47) ? null : cursor.getString(i47);
                                                int i48 = i + 52;
                                                moment.thirdShareSource.sourceId = cursor.isNull(i48) ? null : cursor.getString(i48);
                                                int i49 = i + 53;
                                                moment.thirdShareSource.sourceType = cursor.isNull(i49) ? null : cursor.getString(i49);
                                                moment.attitudeId = cursor.getInt(i + 54);
                                                moment.attitudes.count = cursor.getInt(i + 55);
                                                moment.shareMyVote = cursor.getInt(i + 56) == 1;
                                                int i50 = i + 57;
                                                moment.simpleActivity.url = cursor.isNull(i50) ? null : cursor.getString(i50);
                                                int i51 = i + 58;
                                                moment.allowForward = cursor.isNull(i51) ? null : MomentAllowForwardState.get(cursor.getString(i51));
                                                moment.forwards.count = cursor.getInt(i + 59);
                                                moment.isNewUserAIMoment = cursor.getInt(i + 60) == 1;
                                                this.readIndex = i + 61;
                                            } catch (Exception e) {
                                                e = e;
                                                int i52 = i5;
                                                i6 = i6;
                                                i6 = i52;
                                                str = string5;
                                                string5 = string4;
                                                MessageNano.reportError(e, cursor);
                                                int i53 = i6;
                                                i5 = i6;
                                                i6 = i53;
                                                string4 = string5;
                                                string5 = str;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            int i54 = i5;
                                            i6 = -1;
                                            i6 = i54;
                                            str = "unknown_";
                                            string3 = str;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        i6 = i5;
                                        str = "unknown_";
                                        string2 = str;
                                        string3 = string2;
                                        string5 = string4;
                                        MessageNano.reportError(e, cursor);
                                        int i55 = i6;
                                        i5 = i6;
                                        i6 = i55;
                                        string4 = string5;
                                        string5 = str;
                                        moment.settings.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.newTEnum(string4, i5);
                                        moment.dynamicType = (DyMomentSource) DyMomentSource.JSON_ADAPTER.newTEnum(string, i2);
                                        moment.momentType = (MomentType) MomentType.JSON_ADAPTER.newTEnum(string2, i3);
                                        moment.settings.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.newTEnum(string3, i4);
                                        moment.userSetVisibility = (UserSetVisibility) UserSetVisibility.JSON_ADAPTER.newTEnum(string5, i6);
                                        if (moment.value == null) {
                                            moment.value = "";
                                        }
                                        if (moment.owner == null) {
                                            moment.owner = "";
                                        }
                                        if (moment.likes == null) {
                                            moment.likes = PartialIdList.new_();
                                        }
                                        if (moment.media == null) {
                                            moment.media = new ArrayList();
                                        }
                                        if (moment.landingPage == null) {
                                            moment.landingPage = "";
                                        }
                                        if (moment.messages == null) {
                                            moment.messages = PartialIdList.new_();
                                        }
                                        if (moment.settings == null) {
                                            moment.settings = MomentSettings.new_();
                                        }
                                        if (moment.musicId == null) {
                                            moment.musicId = "";
                                        }
                                        if (moment.status == null) {
                                            moment.status = "";
                                        }
                                        if (moment.topics == null) {
                                            moment.topics = new ArrayList();
                                        }
                                        if (moment.live == null) {
                                            moment.live = Live.new_();
                                        }
                                        if (moment.voiceLive == null) {
                                            moment.voiceLive = VoiceLive.new_();
                                        }
                                        if (moment.liveState == null) {
                                            moment.liveState = "";
                                        }
                                        if (moment.iconTitle == null) {
                                            moment.iconTitle = "";
                                        }
                                        if (moment.labels == null) {
                                            moment.labels = new ArrayList();
                                        }
                                        if (moment.hyperlink == null) {
                                            moment.hyperlink = "";
                                        }
                                        if (moment.simpleActivity == null) {
                                            moment.simpleActivity = MomentSimpleActivity.new_();
                                        }
                                        if (moment.additionalData == null) {
                                            moment.additionalData = MomentAdditionalData.new_();
                                        }
                                        if (moment.group == null) {
                                            moment.group = GroupIdBox.new_();
                                        }
                                        if (moment.deeplink == null) {
                                            moment.deeplink = "";
                                        }
                                        if (moment.thirdShareSource == null) {
                                            moment.thirdShareSource = ThirdShareSource.new_();
                                        }
                                        if (moment.attitudes == null) {
                                            moment.attitudes = Attitudes.new_();
                                        }
                                        if (moment.allowForward == null) {
                                            moment.allowForward = (MomentAllowForwardState) MomentAllowForwardState.JSON_ADAPTER.defaultEnum();
                                        }
                                        if (moment.forwards == null) {
                                            moment.forwards = MomentForwards.new_();
                                        }
                                        if (moment.momentViewer == null) {
                                            moment.momentViewer = MomentViewerBox.new_();
                                        }
                                        if (moment.notifyUsers == null) {
                                            moment.notifyUsers = new ArrayList();
                                        }
                                        if (moment.report == null) {
                                            moment.report = "";
                                        }
                                        return moment;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    i6 = i5;
                                    str = "unknown_";
                                    string = str;
                                    string2 = string;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                int i56 = i5;
                                i6 = -1;
                                i6 = i56;
                                str = "unknown_";
                                string = str;
                                string2 = string;
                                string3 = string2;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            str = "unknown_";
                            string = str;
                            string2 = string;
                            string3 = string2;
                            i4 = -1;
                            i6 = i5;
                            i6 = i4;
                            MessageNano.reportError(e, cursor);
                            int i57 = i6;
                            i5 = i6;
                            i6 = i57;
                            string4 = string5;
                            string5 = str;
                            moment.settings.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.newTEnum(string4, i5);
                            moment.dynamicType = (DyMomentSource) DyMomentSource.JSON_ADAPTER.newTEnum(string, i2);
                            moment.momentType = (MomentType) MomentType.JSON_ADAPTER.newTEnum(string2, i3);
                            moment.settings.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.newTEnum(string3, i4);
                            moment.userSetVisibility = (UserSetVisibility) UserSetVisibility.JSON_ADAPTER.newTEnum(string5, i6);
                            if (moment.value == null) {
                                moment.value = "";
                            }
                            if (moment.owner == null) {
                                moment.owner = "";
                            }
                            if (moment.likes == null) {
                                moment.likes = PartialIdList.new_();
                            }
                            if (moment.media == null) {
                                moment.media = new ArrayList();
                            }
                            if (moment.landingPage == null) {
                                moment.landingPage = "";
                            }
                            if (moment.messages == null) {
                                moment.messages = PartialIdList.new_();
                            }
                            if (moment.settings == null) {
                                moment.settings = MomentSettings.new_();
                            }
                            if (moment.musicId == null) {
                                moment.musicId = "";
                            }
                            if (moment.status == null) {
                                moment.status = "";
                            }
                            if (moment.topics == null) {
                                moment.topics = new ArrayList();
                            }
                            if (moment.live == null) {
                                moment.live = Live.new_();
                            }
                            if (moment.voiceLive == null) {
                                moment.voiceLive = VoiceLive.new_();
                            }
                            if (moment.liveState == null) {
                                moment.liveState = "";
                            }
                            if (moment.iconTitle == null) {
                                moment.iconTitle = "";
                            }
                            if (moment.labels == null) {
                                moment.labels = new ArrayList();
                            }
                            if (moment.hyperlink == null) {
                                moment.hyperlink = "";
                            }
                            if (moment.simpleActivity == null) {
                                moment.simpleActivity = MomentSimpleActivity.new_();
                            }
                            if (moment.additionalData == null) {
                                moment.additionalData = MomentAdditionalData.new_();
                            }
                            if (moment.group == null) {
                                moment.group = GroupIdBox.new_();
                            }
                            if (moment.deeplink == null) {
                                moment.deeplink = "";
                            }
                            if (moment.thirdShareSource == null) {
                                moment.thirdShareSource = ThirdShareSource.new_();
                            }
                            if (moment.attitudes == null) {
                                moment.attitudes = Attitudes.new_();
                            }
                            if (moment.allowForward == null) {
                                moment.allowForward = (MomentAllowForwardState) MomentAllowForwardState.JSON_ADAPTER.defaultEnum();
                            }
                            if (moment.forwards == null) {
                                moment.forwards = MomentForwards.new_();
                            }
                            if (moment.momentViewer == null) {
                                moment.momentViewer = MomentViewerBox.new_();
                            }
                            if (moment.notifyUsers == null) {
                                moment.notifyUsers = new ArrayList();
                            }
                            if (moment.report == null) {
                                moment.report = "";
                            }
                            return moment;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        str = "unknown_";
                        string = str;
                        string2 = string;
                        string3 = string2;
                        i3 = -1;
                        i4 = i3;
                        i6 = i5;
                        i6 = i4;
                        MessageNano.reportError(e, cursor);
                        int i58 = i6;
                        i5 = i6;
                        i6 = i58;
                        string4 = string5;
                        string5 = str;
                        moment.settings.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.newTEnum(string4, i5);
                        moment.dynamicType = (DyMomentSource) DyMomentSource.JSON_ADAPTER.newTEnum(string, i2);
                        moment.momentType = (MomentType) MomentType.JSON_ADAPTER.newTEnum(string2, i3);
                        moment.settings.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.newTEnum(string3, i4);
                        moment.userSetVisibility = (UserSetVisibility) UserSetVisibility.JSON_ADAPTER.newTEnum(string5, i6);
                        if (moment.value == null) {
                            moment.value = "";
                        }
                        if (moment.owner == null) {
                            moment.owner = "";
                        }
                        if (moment.likes == null) {
                            moment.likes = PartialIdList.new_();
                        }
                        if (moment.media == null) {
                            moment.media = new ArrayList();
                        }
                        if (moment.landingPage == null) {
                            moment.landingPage = "";
                        }
                        if (moment.messages == null) {
                            moment.messages = PartialIdList.new_();
                        }
                        if (moment.settings == null) {
                            moment.settings = MomentSettings.new_();
                        }
                        if (moment.musicId == null) {
                            moment.musicId = "";
                        }
                        if (moment.status == null) {
                            moment.status = "";
                        }
                        if (moment.topics == null) {
                            moment.topics = new ArrayList();
                        }
                        if (moment.live == null) {
                            moment.live = Live.new_();
                        }
                        if (moment.voiceLive == null) {
                            moment.voiceLive = VoiceLive.new_();
                        }
                        if (moment.liveState == null) {
                            moment.liveState = "";
                        }
                        if (moment.iconTitle == null) {
                            moment.iconTitle = "";
                        }
                        if (moment.labels == null) {
                            moment.labels = new ArrayList();
                        }
                        if (moment.hyperlink == null) {
                            moment.hyperlink = "";
                        }
                        if (moment.simpleActivity == null) {
                            moment.simpleActivity = MomentSimpleActivity.new_();
                        }
                        if (moment.additionalData == null) {
                            moment.additionalData = MomentAdditionalData.new_();
                        }
                        if (moment.group == null) {
                            moment.group = GroupIdBox.new_();
                        }
                        if (moment.deeplink == null) {
                            moment.deeplink = "";
                        }
                        if (moment.thirdShareSource == null) {
                            moment.thirdShareSource = ThirdShareSource.new_();
                        }
                        if (moment.attitudes == null) {
                            moment.attitudes = Attitudes.new_();
                        }
                        if (moment.allowForward == null) {
                            moment.allowForward = (MomentAllowForwardState) MomentAllowForwardState.JSON_ADAPTER.defaultEnum();
                        }
                        if (moment.forwards == null) {
                            moment.forwards = MomentForwards.new_();
                        }
                        if (moment.momentViewer == null) {
                            moment.momentViewer = MomentViewerBox.new_();
                        }
                        if (moment.notifyUsers == null) {
                            moment.notifyUsers = new ArrayList();
                        }
                        if (moment.report == null) {
                            moment.report = "";
                        }
                        return moment;
                    }
                } catch (Exception e8) {
                    e = e8;
                    str = "unknown_";
                    string = str;
                    string2 = string;
                    string3 = string2;
                    i2 = -1;
                    i3 = -1;
                }
            } catch (Exception e9) {
                e = e9;
                str = "unknown_";
                string = str;
                string2 = string;
                string3 = string2;
                i6 = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
            }
            moment.settings.visibility = (MomentVisibilityStatus) MomentVisibilityStatus.JSON_ADAPTER.newTEnum(string4, i5);
            moment.dynamicType = (DyMomentSource) DyMomentSource.JSON_ADAPTER.newTEnum(string, i2);
            moment.momentType = (MomentType) MomentType.JSON_ADAPTER.newTEnum(string2, i3);
            moment.settings.userSetVisibility = (MomentVisibleState) MomentVisibleState.JSON_ADAPTER.newTEnum(string3, i4);
            moment.userSetVisibility = (UserSetVisibility) UserSetVisibility.JSON_ADAPTER.newTEnum(string5, i6);
            if (moment.value == null) {
                moment.value = "";
            }
            if (moment.owner == null) {
                moment.owner = "";
            }
            if (moment.likes == null) {
                moment.likes = PartialIdList.new_();
            }
            if (moment.media == null) {
                moment.media = new ArrayList();
            }
            if (moment.landingPage == null) {
                moment.landingPage = "";
            }
            if (moment.messages == null) {
                moment.messages = PartialIdList.new_();
            }
            if (moment.settings == null) {
                moment.settings = MomentSettings.new_();
            }
            if (moment.musicId == null) {
                moment.musicId = "";
            }
            if (moment.status == null) {
                moment.status = "";
            }
            if (moment.topics == null) {
                moment.topics = new ArrayList();
            }
            if (moment.live == null) {
                moment.live = Live.new_();
            }
            if (moment.voiceLive == null) {
                moment.voiceLive = VoiceLive.new_();
            }
            if (moment.liveState == null) {
                moment.liveState = "";
            }
            if (moment.iconTitle == null) {
                moment.iconTitle = "";
            }
            if (moment.labels == null) {
                moment.labels = new ArrayList();
            }
            if (moment.hyperlink == null) {
                moment.hyperlink = "";
            }
            if (moment.simpleActivity == null) {
                moment.simpleActivity = MomentSimpleActivity.new_();
            }
            if (moment.additionalData == null) {
                moment.additionalData = MomentAdditionalData.new_();
            }
            if (moment.group == null) {
                moment.group = GroupIdBox.new_();
            }
            if (moment.deeplink == null) {
                moment.deeplink = "";
            }
            if (moment.thirdShareSource == null) {
                moment.thirdShareSource = ThirdShareSource.new_();
            }
            if (moment.attitudes == null) {
                moment.attitudes = Attitudes.new_();
            }
            if (moment.allowForward == null) {
                moment.allowForward = (MomentAllowForwardState) MomentAllowForwardState.JSON_ADAPTER.defaultEnum();
            }
            if (moment.forwards == null) {
                moment.forwards = MomentForwards.new_();
            }
            if (moment.momentViewer == null) {
                moment.momentViewer = MomentViewerBox.new_();
            }
            if (moment.notifyUsers == null) {
                moment.notifyUsers = new ArrayList();
            }
            if (moment.report == null) {
                moment.report = "";
            }
            return moment;
        }

        @Override // p149l.mrf0
        public void write(Moment moment, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", moment.f56011id);
                DbObject.cvPut(contentValues, "localCreatedSession_c", Integer.valueOf(moment.localCreatedSession));
                DbObject.cvPut(contentValues, "localInFeed_c", Integer.valueOf(moment.localInFeed ? 1 : 0));
                DbObject.cvPut(contentValues, "localInUserFeed_c", Integer.valueOf(moment.localInUserFeed ? 1 : 0));
                DbObject.cvPut(contentValues, "value_c", moment.value);
                DbObject.cvPut(contentValues, "createdTime_c", Double.valueOf(moment.createdTime));
                DbObject.cvPut(contentValues, "owner_c", moment.owner);
                DbObject.cvPut(contentValues, "likes_count_c", Integer.valueOf(moment.likes.count));
                DbObject.cvPut(contentValues, "likes_ids_c", moment.likes.ids == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(moment.likes.ids));
                DbObject.cvPut(contentValues, "likes_links_previous_c", moment.likes.links.previous);
                DbObject.cvPut(contentValues, "likes_links_next_c", moment.likes.links.next);
                DbObject.cvPut(contentValues, "haveLiked_c", Integer.valueOf(moment.haveLiked ? 1 : 0));
                MessageLocation messageLocation = moment.location;
                DbObject.cvPut(contentValues, "location_c", messageLocation == null ? null : MessageLocation.PROTOBUF_ADAPTER.serialize(messageLocation));
                DbObject.cvPut(contentValues, "media_c", moment.media == null ? null : Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(moment.media));
                DbObject.cvPut(contentValues, "landingPage_c", moment.landingPage);
                DbObject.cvPut(contentValues, "messages_count_c", Integer.valueOf(moment.messages.count));
                DbObject.cvPut(contentValues, "messages_ids_c", moment.messages.ids == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(moment.messages.ids));
                DbObject.cvPut(contentValues, "messages_links_previous_c", moment.messages.links.previous);
                DbObject.cvPut(contentValues, "messages_links_next_c", moment.messages.links.next);
                MomentVisibilityStatus momentVisibilityStatus = moment.settings.visibility;
                DbObject.cvPut(contentValues, "str_settings_visibility_c", momentVisibilityStatus == null ? null : momentVisibilityStatus.toString());
                MomentVisibilityStatus momentVisibilityStatus2 = moment.settings.visibility;
                DbObject.cvPut(contentValues, "settings_visibility_c", momentVisibilityStatus2 == null ? null : Integer.valueOf(momentVisibilityStatus2.ordinal()));
                DbObject.cvPut(contentValues, "settings_muted_c", Integer.valueOf(moment.settings.muted ? 1 : 0));
                DyMomentSource dyMomentSource = moment.dynamicType;
                DbObject.cvPut(contentValues, "str_dynamicType_c", dyMomentSource == null ? null : dyMomentSource.toString());
                DyMomentSource dyMomentSource2 = moment.dynamicType;
                DbObject.cvPut(contentValues, "dynamicType_c", dyMomentSource2 == null ? null : Integer.valueOf(dyMomentSource2.ordinal()));
                DbObject.cvPut(contentValues, "musicId_c", moment.musicId);
                DbObject.cvPut(contentValues, "status_c", moment.status);
                MomentType momentType = moment.momentType;
                DbObject.cvPut(contentValues, "str_momentType_c", momentType == null ? null : momentType.toString());
                MomentType momentType2 = moment.momentType;
                DbObject.cvPut(contentValues, "momentType_c", momentType2 == null ? null : Integer.valueOf(momentType2.ordinal()));
                DbObject.cvPut(contentValues, "topics_c", moment.topics == null ? null : TopicMomentIdBox.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(moment.topics));
                MomentVisibleState momentVisibleState = moment.settings.userSetVisibility;
                DbObject.cvPut(contentValues, "str_settings_userSetVisibility_c", momentVisibleState == null ? null : momentVisibleState.toString());
                MomentVisibleState momentVisibleState2 = moment.settings.userSetVisibility;
                DbObject.cvPut(contentValues, "settings_userSetVisibility_c", momentVisibleState2 == null ? null : Integer.valueOf(momentVisibleState2.ordinal()));
                DbObject.cvPut(contentValues, "settings_anonymous_c", Integer.valueOf(moment.settings.anonymous ? 1 : 0));
                DbObject.cvPut(contentValues, "hyperlink_c", moment.hyperlink);
                UserSetVisibility userSetVisibility = moment.userSetVisibility;
                DbObject.cvPut(contentValues, "str_userSetVisibility_c", userSetVisibility == null ? null : userSetVisibility.toString());
                UserSetVisibility userSetVisibility2 = moment.userSetVisibility;
                DbObject.cvPut(contentValues, "userSetVisibility_c", userSetVisibility2 == null ? null : Integer.valueOf(userSetVisibility2.ordinal()));
                DbObject.cvPut(contentValues, "simpleActivity_id_c", moment.simpleActivity.f39235id);
                DbObject.cvPut(contentValues, "simpleActivity_name_c", moment.simpleActivity.name);
                DbObject.cvPut(contentValues, "additionalData_sendFrom_id_c", moment.additionalData.sendFrom.f39234id);
                DbObject.cvPut(contentValues, "additionalData_sendFrom_name_c", moment.additionalData.sendFrom.name);
                DbObject.cvPut(contentValues, "additionalData_sendFrom_sourceType_c", moment.additionalData.sendFrom.sourceType);
                DbObject.cvPut(contentValues, "group_id_c", moment.group.f39223id);
                DbObject.cvPut(contentValues, "group_name_c", moment.group.name);
                DbObject.cvPut(contentValues, "group_lastJoined_c", Integer.valueOf(moment.group.lastJoined ? 1 : 0));
                DbObject.cvPut(contentValues, "additionalData_share_title_c", moment.additionalData.share.title);
                DbObject.cvPut(contentValues, "additionalData_share_description_c", moment.additionalData.share.description);
                DbObject.cvPut(contentValues, "additionalData_share_url_c", moment.additionalData.share.url);
                DbObject.cvPut(contentValues, "additionalData_share_landingPage_c", moment.additionalData.share.landingPage);
                DbObject.cvPut(contentValues, "additionalData_share_name_c", moment.additionalData.share.name);
                DbObject.cvPut(contentValues, "additionalData_share_shareFrom_c", moment.additionalData.share.shareFrom);
                DbObject.cvPut(contentValues, "additionalData_share_testId_c", moment.additionalData.share.testId);
                DbObject.cvPut(contentValues, "deeplink_c", moment.deeplink);
                DbObject.cvPut(contentValues, "thirdShareSource_sourceId_c", moment.thirdShareSource.sourceId);
                DbObject.cvPut(contentValues, "thirdShareSource_sourceType_c", moment.thirdShareSource.sourceType);
                DbObject.cvPut(contentValues, "attitudeId_c", Integer.valueOf(moment.attitudeId));
                DbObject.cvPut(contentValues, "attitudes_count_c", Integer.valueOf(moment.attitudes.count));
                DbObject.cvPut(contentValues, "shareMyVote_c", Integer.valueOf(moment.shareMyVote ? 1 : 0));
                DbObject.cvPut(contentValues, "simpleActivity_url_c", moment.simpleActivity.url);
                MomentAllowForwardState momentAllowForwardState = moment.allowForward;
                DbObject.cvPut(contentValues, "allowForward_c", momentAllowForwardState == null ? null : momentAllowForwardState.toString());
                DbObject.cvPut(contentValues, "forwards_count_c", Integer.valueOf(moment.forwards.count));
                DbObject.cvPut(contentValues, "isNewUserAIMoment_c", Integer.valueOf(moment.isNewUserAIMoment ? 1 : 0));
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };
    public long momentViewTime = -1;
    public boolean showGreetView = false;
    public bkn0.C15894a voiceLiveApiInfo = null;
    public aai feedVoiceUserEntryInfo = null;
    public LiveCircleExtInfo liveCircleExtInfo = null;
    public LiveCircleBanner liveCircleBanner = null;
    private String recommendReason = "";
    private boolean isLiveDataChange = false;
    private HashSet<String> parseFieldSet = new HashSet<>();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m60863e(String str) {
        return str;
    }

    public static Moment new_() {
        Moment moment = new Moment();
        moment.nullCheck();
        return moment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Moment mo223809clone() {
        Moment moment = new Moment();
        moment._id = this._id;
        moment.f56011id = this.f56011id;
        moment.localCreatedSession = this.localCreatedSession;
        moment.localInFeed = this.localInFeed;
        moment.localInUserFeed = this.localInUserFeed;
        moment.value = this.value;
        moment.createdTime = this.createdTime;
        moment.owner = this.owner;
        PartialIdList partialIdList = this.likes;
        if (partialIdList != null) {
            moment.likes = partialIdList.mo223809clone();
        }
        moment.haveLiked = this.haveLiked;
        MessageLocation messageLocation = this.location;
        if (messageLocation != null) {
            moment.location = messageLocation.mo223809clone();
        }
        List<Media> list = this.media;
        if (list != null) {
            moment.media = ValueObject.util_map(list, new w9j() { // from class: l.b800
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).mo223809clone();
                }
            });
        }
        moment.landingPage = this.landingPage;
        PartialIdList partialIdList2 = this.messages;
        if (partialIdList2 != null) {
            moment.messages = partialIdList2.mo223809clone();
        }
        MomentSettings momentSettings = this.settings;
        if (momentSettings != null) {
            moment.settings = momentSettings.mo223809clone();
        }
        moment.dynamicType = this.dynamicType;
        moment.musicId = this.musicId;
        moment.status = this.status;
        moment.momentType = this.momentType;
        List<TopicMomentIdBox> list2 = this.topics;
        if (list2 != null) {
            moment.topics = ValueObject.util_map(list2, new w9j() { // from class: l.c800
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((TopicMomentIdBox) obj).mo223809clone();
                }
            });
        }
        moment.isLive = this.isLive;
        Live live = this.live;
        if (live != null) {
            moment.live = live.mo223809clone();
        }
        moment.isVoiceLive = this.isVoiceLive;
        VoiceLive voiceLive = this.voiceLive;
        if (voiceLive != null) {
            moment.voiceLive = voiceLive.mo223809clone();
        }
        moment.views = this.views;
        moment.liveState = this.liveState;
        moment.iconTitle = this.iconTitle;
        List<MomentLabels> list3 = this.labels;
        if (list3 != null) {
            moment.labels = ValueObject.util_map(list3, new w9j() { // from class: l.d800
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MomentLabels) obj).mo223809clone();
                }
            });
        }
        moment.hyperlink = this.hyperlink;
        moment.userSetVisibility = this.userSetVisibility;
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        if (liveMultiCallInfo != null) {
            moment.multiCallInfo = liveMultiCallInfo.mo223809clone();
        }
        MomentSimpleActivity momentSimpleActivity = this.simpleActivity;
        if (momentSimpleActivity != null) {
            moment.simpleActivity = momentSimpleActivity.mo223809clone();
        }
        MomentAdditionalData momentAdditionalData = this.additionalData;
        if (momentAdditionalData != null) {
            moment.additionalData = momentAdditionalData.mo223809clone();
        }
        GroupIdBox groupIdBox = this.group;
        if (groupIdBox != null) {
            moment.group = groupIdBox.mo223809clone();
        }
        moment.deeplink = this.deeplink;
        List<String> list4 = this.cameraStickerIds;
        if (list4 != null) {
            moment.cameraStickerIds = ValueObject.util_map(list4, new w9j() { // from class: l.e800
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Moment.m60863e((String) obj);
                }
            });
        }
        ThirdShareSource thirdShareSource = this.thirdShareSource;
        if (thirdShareSource != null) {
            moment.thirdShareSource = thirdShareSource.mo223809clone();
        }
        moment.attitudeId = this.attitudeId;
        Attitudes attitudes = this.attitudes;
        if (attitudes != null) {
            moment.attitudes = attitudes.mo223809clone();
        }
        moment.shareMyVote = this.shareMyVote;
        moment.commentAtOnce = this.commentAtOnce;
        moment.allowForward = this.allowForward;
        MomentForwards momentForwards = this.forwards;
        if (momentForwards != null) {
            moment.forwards = momentForwards.mo223809clone();
        }
        MomentViewerBox momentViewerBox = this.momentViewer;
        if (momentViewerBox != null) {
            moment.momentViewer = momentViewerBox.mo223809clone();
        }
        List<NotifyUser> list5 = this.notifyUsers;
        if (list5 != null) {
            moment.notifyUsers = ValueObject.util_map(list5, new w9j() { // from class: l.f800
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NotifyUser) obj).mo223809clone();
                }
            });
        }
        moment.isNewUserAIMoment = this.isNewUserAIMoment;
        moment.report = this.report;
        return moment;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void createTransValue() {
        super.createTransValue();
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Moment)) {
            return false;
        }
        Moment moment = (Moment) obj;
        return super.equals(obj) && this.localCreatedSession == moment.localCreatedSession && this.localInFeed == moment.localInFeed && this.localInUserFeed == moment.localInUserFeed && ValueObject.util_equals(this.value, moment.value) && this.createdTime == moment.createdTime && ValueObject.util_equals(this.owner, moment.owner) && ValueObject.util_equals(this.likes, moment.likes) && this.haveLiked == moment.haveLiked && ValueObject.util_equals(this.location, moment.location) && ValueObject.util_equals(this.media, moment.media) && ValueObject.util_equals(this.landingPage, moment.landingPage) && ValueObject.util_equals(this.messages, moment.messages) && ValueObject.util_equals(this.settings, moment.settings) && ValueObject.util_equals(this.dynamicType, moment.dynamicType) && ValueObject.util_equals(this.musicId, moment.musicId) && ValueObject.util_equals(this.status, moment.status) && ValueObject.util_equals(this.momentType, moment.momentType) && ValueObject.util_equals(this.topics, moment.topics) && this.isLive == moment.isLive && ValueObject.util_equals(this.live, moment.live) && this.isVoiceLive == moment.isVoiceLive && ValueObject.util_equals(this.voiceLive, moment.voiceLive) && this.views == moment.views && ValueObject.util_equals(this.liveState, moment.liveState) && ValueObject.util_equals(this.iconTitle, moment.iconTitle) && ValueObject.util_equals(this.labels, moment.labels) && ValueObject.util_equals(this.hyperlink, moment.hyperlink) && ValueObject.util_equals(this.userSetVisibility, moment.userSetVisibility) && ValueObject.util_equals(this.multiCallInfo, moment.multiCallInfo) && ValueObject.util_equals(this.simpleActivity, moment.simpleActivity) && ValueObject.util_equals(this.additionalData, moment.additionalData) && ValueObject.util_equals(this.group, moment.group) && ValueObject.util_equals(this.deeplink, moment.deeplink) && ValueObject.util_equals(this.cameraStickerIds, moment.cameraStickerIds) && ValueObject.util_equals(this.thirdShareSource, moment.thirdShareSource) && this.attitudeId == moment.attitudeId && ValueObject.util_equals(this.attitudes, moment.attitudes) && this.shareMyVote == moment.shareMyVote && this.commentAtOnce == moment.commentAtOnce && ValueObject.util_equals(this.allowForward, moment.allowForward) && ValueObject.util_equals(this.forwards, moment.forwards) && ValueObject.util_equals(this.momentViewer, moment.momentViewer) && ValueObject.util_equals(this.notifyUsers, moment.notifyUsers) && this.isNewUserAIMoment == moment.isNewUserAIMoment && ValueObject.util_equals(this.report, moment.report);
    }

    public String getActivityName() {
        return this.activityName;
    }

    public List<String> getCameraStickerIds() {
        return this.cameraStickerIds;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "moment";
    }

    public String getLocationName() {
        return this.locationName;
    }

    public String getMomentShowFrom() {
        String str = this.momentShowFrom;
        return str == null ? "" : str;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRecommendReasonBackgroundColor() {
        return this.recommendReasonBackgroundColor;
    }

    public String getRecommendReasonFontColor() {
        return this.recommendReasonFontColor;
    }

    public String getRecommendReasonIcon() {
        return this.recommendReasonIcon;
    }

    public double getRecommendTime() {
        return this.recommendTime;
    }

    public List<TopicMoment> getTopicList() {
        return this.mTopicList;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((super.hashCode() * 41) + this.localCreatedSession) * 41) + (this.localInFeed ? 1231 : 1237)) * 41) + (this.localInUserFeed ? 1231 : 1237)) * 41;
        String str = this.value;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i2 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.owner;
        int iHashCode3 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        PartialIdList partialIdList = this.likes;
        int iHashCode4 = (((iHashCode3 + (partialIdList != null ? partialIdList.hashCode() : 0)) * 41) + (this.haveLiked ? 1231 : 1237)) * 41;
        MessageLocation messageLocation = this.location;
        int iHashCode5 = (iHashCode4 + (messageLocation != null ? messageLocation.hashCode() : 0)) * 41;
        List<Media> list = this.media;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.landingPage;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 41;
        PartialIdList partialIdList2 = this.messages;
        int iHashCode8 = (iHashCode7 + (partialIdList2 != null ? partialIdList2.hashCode() : 0)) * 41;
        MomentSettings momentSettings = this.settings;
        int iHashCode9 = (iHashCode8 + (momentSettings != null ? momentSettings.hashCode() : 0)) * 41;
        DyMomentSource dyMomentSource = this.dynamicType;
        int iHashCode10 = (iHashCode9 + (dyMomentSource != null ? dyMomentSource.hashCode() : 0)) * 41;
        String str4 = this.musicId;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode12 = (iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 41;
        MomentType momentType = this.momentType;
        int iHashCode13 = (iHashCode12 + (momentType != null ? momentType.hashCode() : 0)) * 41;
        List<TopicMomentIdBox> list2 = this.topics;
        int iHashCode14 = (((iHashCode13 + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.isLive ? 1231 : 1237)) * 41;
        Live live = this.live;
        int iHashCode15 = (((iHashCode14 + (live != null ? live.hashCode() : 0)) * 41) + (this.isVoiceLive ? 1231 : 1237)) * 41;
        VoiceLive voiceLive = this.voiceLive;
        int iHashCode16 = (((iHashCode15 + (voiceLive != null ? voiceLive.hashCode() : 0)) * 41) + this.views) * 41;
        String str6 = this.liveState;
        int iHashCode17 = (iHashCode16 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.iconTitle;
        int iHashCode18 = (iHashCode17 + (str7 != null ? str7.hashCode() : 0)) * 41;
        List<MomentLabels> list3 = this.labels;
        int iHashCode19 = (iHashCode18 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str8 = this.hyperlink;
        int iHashCode20 = (iHashCode19 + (str8 != null ? str8.hashCode() : 0)) * 41;
        UserSetVisibility userSetVisibility = this.userSetVisibility;
        int iHashCode21 = (iHashCode20 + (userSetVisibility != null ? userSetVisibility.hashCode() : 0)) * 41;
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        int iHashCode22 = (iHashCode21 + (liveMultiCallInfo != null ? liveMultiCallInfo.hashCode() : 0)) * 41;
        MomentSimpleActivity momentSimpleActivity = this.simpleActivity;
        int iHashCode23 = (iHashCode22 + (momentSimpleActivity != null ? momentSimpleActivity.hashCode() : 0)) * 41;
        MomentAdditionalData momentAdditionalData = this.additionalData;
        int iHashCode24 = (iHashCode23 + (momentAdditionalData != null ? momentAdditionalData.hashCode() : 0)) * 41;
        GroupIdBox groupIdBox = this.group;
        int iHashCode25 = (iHashCode24 + (groupIdBox != null ? groupIdBox.hashCode() : 0)) * 41;
        String str9 = this.deeplink;
        int iHashCode26 = (iHashCode25 + (str9 != null ? str9.hashCode() : 0)) * 41;
        List<String> list4 = this.cameraStickerIds;
        int iHashCode27 = (iHashCode26 + (list4 != null ? list4.hashCode() : 0)) * 41;
        ThirdShareSource thirdShareSource = this.thirdShareSource;
        int iHashCode28 = (((iHashCode27 + (thirdShareSource != null ? thirdShareSource.hashCode() : 0)) * 41) + this.attitudeId) * 41;
        Attitudes attitudes = this.attitudes;
        int iHashCode29 = (((((iHashCode28 + (attitudes != null ? attitudes.hashCode() : 0)) * 41) + (this.shareMyVote ? 1231 : 1237)) * 41) + (this.commentAtOnce ? 1231 : 1237)) * 41;
        MomentAllowForwardState momentAllowForwardState = this.allowForward;
        int iHashCode30 = (iHashCode29 + (momentAllowForwardState != null ? momentAllowForwardState.hashCode() : 0)) * 41;
        MomentForwards momentForwards = this.forwards;
        int iHashCode31 = (iHashCode30 + (momentForwards != null ? momentForwards.hashCode() : 0)) * 41;
        MomentViewerBox momentViewerBox = this.momentViewer;
        int iHashCode32 = (iHashCode31 + (momentViewerBox != null ? momentViewerBox.hashCode() : 0)) * 41;
        List<NotifyUser> list5 = this.notifyUsers;
        int iHashCode33 = (((iHashCode32 + (list5 != null ? list5.hashCode() : 0)) * 41) + (this.isNewUserAIMoment ? 1231 : 1237)) * 41;
        String str10 = this.report;
        int iHashCode34 = iHashCode33 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode34;
        return iHashCode34;
    }

    public boolean isAnonymousGroup() {
        GroupIdBox groupIdBox = this.group;
        if (groupIdBox != null && !TextUtils.isEmpty(groupIdBox.f39223id)) {
            Group groupM209558u7 = FeedModule.f38855d.m209558u7(this.group.f39223id);
            if (NullChecker.m81303a(groupM209558u7)) {
                return groupM209558u7.isGroupAnonymousType();
            }
        }
        return false;
    }

    public boolean isAnonymousMoment() {
        return (!vwb.m200296J(this.mTopicList) && this.mTopicList.get(0).isTopicAnonymousType()) || TEnum.equals(this.momentType, "anonymous") || isAnonymousGroup();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isLiveDataChange() {
        return this.isLiveDataChange;
    }

    public boolean isOnlyMatchVisiable() {
        return NullChecker.m81303a(this.settings) && TEnum.equals(this.settings.userSetVisibility, "matches");
    }

    public boolean isQATopicMoment() {
        return !vwb.m200296J(this.mTopicList) && this.mTopicList.get(0).isQATopicType();
    }

    public boolean isVoteTopicMoment() {
        return !vwb.m200296J(this.mTopicList) && this.mTopicList.get(0).isTopicVoteType();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(Moment moment) {
        if (!shouldMergeData() || equals(moment)) {
            return;
        }
        if (!isFieldParsed("value")) {
            this.value = moment.value;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = moment.createdTime;
        }
        if (!isFieldParsed(Owner.TYPE)) {
            this.owner = moment.owner;
        }
        if (!isFieldParsed("likes")) {
            this.likes = moment.likes;
        }
        if (!isFieldParsed("haveLiked")) {
            this.haveLiked = moment.haveLiked;
        }
        if (!isFieldParsed("location")) {
            this.location = moment.location;
        }
        if (!isFieldParsed("media")) {
            this.media = moment.media;
        }
        if (!isFieldParsed("landingPage")) {
            this.landingPage = moment.landingPage;
        }
        if (!isFieldParsed("messages")) {
            this.messages = moment.messages;
        }
        if (!isFieldParsed(Settings.TYPE)) {
            this.settings = moment.settings;
        }
        if (!isFieldParsed("dynamicType")) {
            this.dynamicType = moment.dynamicType;
        }
        if (!isFieldParsed("musicId")) {
            this.musicId = moment.musicId;
        }
        if (!isFieldParsed(NotificationCompat.CATEGORY_STATUS)) {
            this.status = moment.status;
        }
        if (!isFieldParsed("momentType")) {
            this.momentType = moment.momentType;
        }
        if (!isFieldParsed("topics")) {
            this.topics = moment.topics;
        }
        if (!isFieldParsed("isLive")) {
            this.isLive = moment.isLive;
        }
        if (!isFieldParsed("live")) {
            this.live = moment.live;
        }
        if (!isFieldParsed("isVoiceLive")) {
            this.isVoiceLive = moment.isVoiceLive;
        }
        if (!isFieldParsed(BLiveType.voiceLive)) {
            this.voiceLive = moment.voiceLive;
        }
        if (!isFieldParsed("views")) {
            this.views = moment.views;
        }
        if (!isFieldParsed("liveState")) {
            this.liveState = moment.liveState;
        }
        if (!isFieldParsed("iconTitle")) {
            this.iconTitle = moment.iconTitle;
        }
        if (!isFieldParsed("labels")) {
            this.labels = moment.labels;
        }
        if (!isFieldParsed("hyperlink")) {
            this.hyperlink = moment.hyperlink;
        }
        if (!isFieldParsed("userSetVisibility")) {
            this.userSetVisibility = moment.userSetVisibility;
        }
        if (!isFieldParsed("multiCallInfo")) {
            this.multiCallInfo = moment.multiCallInfo;
        }
        if (!isFieldParsed("simpleActivity")) {
            this.simpleActivity = moment.simpleActivity;
        }
        if (!isFieldParsed("additionalData")) {
            this.additionalData = moment.additionalData;
        }
        if (!isFieldParsed("group")) {
            this.group = moment.group;
        }
        if (!isFieldParsed(LinkAction.deeplink)) {
            this.deeplink = moment.deeplink;
        }
        if (!isFieldParsed("cameraStickerIds")) {
            this.cameraStickerIds = moment.cameraStickerIds;
        }
        if (!isFieldParsed("thirdShareSource")) {
            this.thirdShareSource = moment.thirdShareSource;
        }
        if (!isFieldParsed("attitudeId")) {
            this.attitudeId = moment.attitudeId;
        }
        if (!isFieldParsed(Attitudes.TYPE)) {
            this.attitudes = moment.attitudes;
        }
        if (!isFieldParsed("shareMyVote")) {
            this.shareMyVote = moment.shareMyVote;
        }
        if (!isFieldParsed("commentAtOnce")) {
            this.commentAtOnce = moment.commentAtOnce;
        }
        if (!isFieldParsed("allowForward")) {
            this.allowForward = moment.allowForward;
        }
        if (!isFieldParsed("forwards")) {
            this.forwards = moment.forwards;
        }
        if (!isFieldParsed("momentViewer")) {
            this.momentViewer = moment.momentViewer;
        }
        if (!isFieldParsed("notifyUsers")) {
            this.notifyUsers = moment.notifyUsers;
        }
        if (!isFieldParsed("isNewUserAIMoment")) {
            this.isNewUserAIMoment = moment.isNewUserAIMoment;
        }
        if (!isFieldParsed("report")) {
            this.report = moment.report;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.value == null) {
            this.value = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.likes == null) {
            this.likes = PartialIdList.new_();
        }
        if (this.media == null) {
            this.media = new ArrayList();
        }
        if (this.landingPage == null) {
            this.landingPage = "";
        }
        if (this.messages == null) {
            this.messages = PartialIdList.new_();
        }
        if (this.settings == null) {
            this.settings = MomentSettings.new_();
        }
        if (this.musicId == null) {
            this.musicId = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
        if (this.live == null) {
            this.live = Live.new_();
        }
        if (this.voiceLive == null) {
            this.voiceLive = VoiceLive.new_();
        }
        if (this.liveState == null) {
            this.liveState = "";
        }
        if (this.iconTitle == null) {
            this.iconTitle = "";
        }
        if (this.labels == null) {
            this.labels = new ArrayList();
        }
        if (this.hyperlink == null) {
            this.hyperlink = "";
        }
        if (this.simpleActivity == null) {
            this.simpleActivity = MomentSimpleActivity.new_();
        }
        if (this.additionalData == null) {
            this.additionalData = MomentAdditionalData.new_();
        }
        if (this.group == null) {
            this.group = GroupIdBox.new_();
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
        if (this.thirdShareSource == null) {
            this.thirdShareSource = ThirdShareSource.new_();
        }
        if (this.attitudes == null) {
            this.attitudes = Attitudes.new_();
        }
        if (this.allowForward == null) {
            this.allowForward = (MomentAllowForwardState) MomentAllowForwardState.JSON_ADAPTER.defaultEnum();
        }
        if (this.forwards == null) {
            this.forwards = MomentForwards.new_();
        }
        if (this.momentViewer == null) {
            this.momentViewer = MomentViewerBox.new_();
        }
        if (this.notifyUsers == null) {
            this.notifyUsers = new ArrayList();
        }
        if (this.report == null) {
            this.report = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        this.localCreatedSession = App.f15373i.get().intValue();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void putParsedField(String str) {
        if ("v2".equals(xh5.m208774v(this.requestUrl)) || xh5.API_VERSION_V3.equals(xh5.m208774v(this.requestUrl))) {
            this.parseFieldSet.add(str);
        }
    }

    public void setActivityName(String str) {
        this.activityName = str;
    }

    public void setCameraStickerIds(List<String> list) {
        this.cameraStickerIds = list;
    }

    public void setHasHeadFrame(boolean z) {
        this.hasHeadFrame = z;
    }

    public void setLiveDataChange(boolean z) {
        this.isLiveDataChange = z;
    }

    public void setLocationName(String str) {
        this.locationName = str;
    }

    public void setMomentShowFrom(String str) {
        this.momentShowFrom = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendReasonBackgroundColor(String str) {
        this.recommendReasonBackgroundColor = str;
    }

    public void setRecommendReasonFontColor(String str) {
        this.recommendReasonFontColor = str;
    }

    public void setRecommendReasonIcon(String str) {
        this.recommendReasonIcon = str;
    }

    public void setRecommendTime(double d) {
        this.recommendTime = d;
    }

    public void setTopicList(List<TopicMoment> list) {
        this.mTopicList = list;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean shouldMergeData() {
        return "v2".equals(xh5.m208774v(this.requestUrl)) || xh5.API_VERSION_V3.equals(xh5.m208774v(this.requestUrl));
    }

    public LocalStatus status() {
        if (this.f56011id.startsWith("fake_id_")) {
            return this.localCreatedSession == App.f15373i.get().intValue() ? LocalStatus.get(LocalStatus.sending) : LocalStatus.get("failed");
        }
        return LocalStatus.get("normal");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public void mergeData(Moment moment, String str) {
        mergeData(moment);
        this.momentValue = str;
        this.showGreetView = moment.showGreetView;
        if (!vwb.m200296J(moment.mediaRepeatIndexList)) {
            this.mediaRepeatIndexList = moment.mediaRepeatIndexList;
        }
        this.curForwardRenderState = moment.curForwardRenderState;
        this.momentViewTime = moment.momentViewTime;
    }
}
