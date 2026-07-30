package com.p051p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.HomeTabModuleId;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.LiveUserMask;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.Room;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.data.VoiceLiveGame;
import com.p051p1.mobile.putong.data.VoiceRoomInfo;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraFilter;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.FeedLiterature;
import com.p051p1.mobile.putong.feed.data.FeedLiteraturesComment;
import com.p051p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p051p1.mobile.putong.feed.data.Frame;
import com.p051p1.mobile.putong.feed.data.GreetingPermission;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.LiveCircleBanner;
import com.p051p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p051p1.mobile.putong.feed.data.LiveMultiCallLiveSchema;
import com.p051p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p051p1.mobile.putong.feed.data.Meet;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.data.MomentExtra;
import com.p051p1.mobile.putong.feed.data.MomentLevelCounter;
import com.p051p1.mobile.putong.feed.data.MomentLevelGuides;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p051p1.mobile.putong.feed.data.MusicCategory;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.p051p1.mobile.putong.feed.data.PersonAlbumBgInfo;
import com.p051p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p051p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.feed.data.VoiceLiveMomentFeed;
import com.p051p1.mobile.putong.feed.data.VoiceLiveStates;
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
import java.util.Comparator;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.jyb;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class FeedData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "feeddata";

    @NonNull
    @ProtobufIndex(index = 7)
    public List<MomentActivity> activities;

    @Nullable
    @ProtobufIndex(index = 29)
    public RankingBoards board;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<CameraCategory> cameraCategories;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<CameraFilter> cameraFilters;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<CameraSticker> cameraStickers;

    @NonNull
    @ProtobufIndex(index = 19)
    public List<MomentMessage> comments;

    @NonNull
    @ProtobufIndex(index = 28)
    public DetectInfo detect;

    @NonNull
    public List<Moment> dynamic_moments;

    @NonNull
    @ProtobufIndex(index = 15)
    public Extra extra;

    @NonNull
    @ProtobufIndex(index = 46)
    public List<BubbleInfo> fakeUserStates;

    @Nullable
    @ProtobufIndex(index = 8)
    public List<RawFeed> feeds;

    @NonNull
    @ProtobufIndex(index = 14)
    public List<Followship> followships;

    @NonNull
    @ProtobufIndex(index = 26)
    public List<Frame> frames;

    @Nullable
    @ProtobufIndex(index = 16)
    public List<GreetingPermission> greetingPermissions;

    @NonNull
    @ProtobufIndex(index = 35)
    public List<Group> groups;

    @NonNull
    @ProtobufIndex(index = 54)
    public GuideStatePostConfig guideStatePostConfig;

    @NonNull
    @ProtobufIndex(index = 39)
    public List<FeedLiterature> literatures;

    @NonNull
    @ProtobufIndex(index = 38)
    public List<FeedLiteraturesComment> literaturesComments;

    @NonNull
    @ProtobufIndex(index = 47)
    public List<LiveCircleExtInfo> liveCircleMomentExtInfos;

    @NonNull
    @ProtobufIndex(index = 48)
    public List<LiveCircleBanner> liveGroupCircleMomentBanners;

    @Nullable
    @ProtobufIndex(index = 17)
    public List<FeedUserLiveLabel> liveLabels;

    @Nullable
    @ProtobufIndex(index = 33)
    public List<LiveRecommendCard> liveRecommendCards;

    @Nullable
    @ProtobufIndex(index = 34)
    public List<LiveMultiCallLiveSchema> liveSchemas;

    @Nullable
    @ProtobufIndex(index = 13)
    public List<Live> lives;

    @NonNull
    @ProtobufIndex(index = 50)
    public PoiLocation location;

    @NonNull
    @ProtobufIndex(index = 21)
    public List<LiveUserMask> masks;

    @NonNull
    @ProtobufIndex(index = 41)
    public List<Meet> meets;

    @NonNull
    @ProtobufIndex(index = 18)
    public List<MomentMessage> messages;

    @Nullable
    @ProtobufIndex(index = 31)
    public List<MomentExtra> momentExtras;

    @NonNull
    @ProtobufIndex(index = 37)
    public List<MomentLevelCounter> momentLevelCounters;

    @NonNull
    @ProtobufIndex(index = 36)
    public List<MomentLevelGuides> momentLevelGuides;

    @NonNull
    @ProtobufIndex(index = 53)
    public List<PostBasePopWindow> momentPopWindows;

    @NonNull
    @ProtobufIndex(index = 22)
    public List<PersonAlbumBgInfo> momentSettings;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<TopicMoment> momentTopics;

    @NonNull
    @ProtobufIndex(index = 44)
    public MomentViewerBox momentViewer;

    @NonNull
    @ProtobufIndex(index = 40)
    public List<MomentVoiceLiveInfos> momentVoiceLiveInfos;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<Moment> moments;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<MusicCategory> musicCategories;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Music> musics;

    @NonNull
    @ProtobufIndex(index = 27)
    public List<Moment> myMeetFeeds;

    @NonNull
    @ProtobufIndex(index = 52)
    public FeedPoiNearbyWindow nearbyWindow;

    @NonNull
    @ProtobufIndex(index = 45)
    public List<NotifyUsers> notifyUsers;

    @Nullable
    @ProtobufIndex(index = 30)
    public PaginationWithTopic paginationWithTopic;

    @NonNull
    @ProtobufIndex(index = 49)
    public List<PoiGuidePopWindow> popWindows;

    @Nullable
    @ProtobufIndex(index = 10)
    public List<Room> rooms;

    @NonNull
    @ProtobufIndex(index = 42)
    public AttitudeSourceCatCount sourceCatCount;

    @NonNull
    @ProtobufIndex(index = 32)
    public List<BubbleInfo> states;

    @NonNull
    @ProtobufIndex(index = 51)
    public List<StickerInfo> stickers;

    @NonNull
    @ProtobufIndex(index = 23)
    public List<TopicCategorie> topicCategories;

    @NonNull
    @ProtobufIndex(index = 25)
    public List<TopicOperations> topicOperations;

    @NonNull
    @ProtobufIndex(index = 20)
    public List<VoiceLiveGame> voiceLiveGames;

    @NonNull
    @ProtobufIndex(index = 24)
    public List<VoiceLiveMomentFeed> voiceLiveMomentFeeds;

    @NonNull
    @ProtobufIndex(index = 43)
    public List<VoiceLiveStates> voiceLiveStates;

    @Nullable
    @ProtobufIndex(index = 11)
    public List<VoiceLive> voiceLives;

    @Nullable
    @ProtobufIndex(index = 12)
    public List<VoiceRoomInfo> voiceRooms;
    public static ProtobufAdapter<FeedData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedData>() { // from class: com.p1.mobile.putong.feed.data.FeedData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FeedData feedData) {
            List<CameraFilter> list = feedData.cameraFilters;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, CameraFilter.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<CameraSticker> list2 = feedData.cameraStickers;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, CameraSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MusicCategory> list3 = feedData.musicCategories;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list3, MusicCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Music> list4 = feedData.musics;
            if (list4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, list4, Music.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CameraCategory> list5 = feedData.cameraCategories;
            if (list5 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, list5, CameraCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Moment> list6 = feedData.moments;
            if (list6 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, list6, Moment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentActivity> list7 = feedData.activities;
            if (list7 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(7, list7, MomentActivity.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RawFeed> list8 = feedData.feeds;
            if (list8 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(8, list8, RawFeed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMoment> list9 = feedData.momentTopics;
            if (list9 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(9, list9, TopicMoment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Room> list10 = feedData.rooms;
            if (list10 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(10, list10, Room.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceLive> list11 = feedData.voiceLives;
            if (list11 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(11, list11, VoiceLive.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceRoomInfo> list12 = feedData.voiceRooms;
            if (list12 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(12, list12, VoiceRoomInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Live> list13 = feedData.lives;
            if (list13 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(13, list13, Live.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Followship> list14 = feedData.followships;
            if (list14 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(14, list14, Followship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Extra extra = feedData.extra;
            if (extra != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(15, extra, Extra.PROTOBUF_ADAPTER);
            }
            List<GreetingPermission> list15 = feedData.greetingPermissions;
            if (list15 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(16, list15, GreetingPermission.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FeedUserLiveLabel> list16 = feedData.liveLabels;
            if (list16 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(17, list16, FeedUserLiveLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentMessage> list17 = feedData.messages;
            if (list17 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(18, list17, MomentMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentMessage> list18 = feedData.comments;
            if (list18 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(19, list18, MomentMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceLiveGame> list19 = feedData.voiceLiveGames;
            if (list19 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(20, list19, VoiceLiveGame.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveUserMask> list20 = feedData.masks;
            if (list20 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(21, list20, LiveUserMask.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PersonAlbumBgInfo> list21 = feedData.momentSettings;
            if (list21 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(22, list21, PersonAlbumBgInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicCategorie> list22 = feedData.topicCategories;
            if (list22 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(23, list22, TopicCategorie.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceLiveMomentFeed> list23 = feedData.voiceLiveMomentFeeds;
            if (list23 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(24, list23, VoiceLiveMomentFeed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicOperations> list24 = feedData.topicOperations;
            if (list24 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(25, list24, TopicOperations.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Frame> list25 = feedData.frames;
            if (list25 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(26, list25, Frame.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Moment> list26 = feedData.myMeetFeeds;
            if (list26 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(27, list26, Moment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            DetectInfo detectInfo = feedData.detect;
            if (detectInfo != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(28, detectInfo, DetectInfo.PROTOBUF_ADAPTER);
            }
            RankingBoards rankingBoards = feedData.board;
            if (rankingBoards != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(29, rankingBoards, RankingBoards.PROTOBUF_ADAPTER);
            }
            PaginationWithTopic paginationWithTopic = feedData.paginationWithTopic;
            if (paginationWithTopic != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(30, paginationWithTopic, PaginationWithTopic.PROTOBUF_ADAPTER);
            }
            List<MomentExtra> list27 = feedData.momentExtras;
            if (list27 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(31, list27, MomentExtra.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BubbleInfo> list28 = feedData.states;
            if (list28 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(32, list28, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveRecommendCard> list29 = feedData.liveRecommendCards;
            if (list29 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(33, list29, LiveRecommendCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveMultiCallLiveSchema> list30 = feedData.liveSchemas;
            if (list30 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(34, list30, LiveMultiCallLiveSchema.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Group> list31 = feedData.groups;
            if (list31 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(35, list31, Group.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentLevelGuides> list32 = feedData.momentLevelGuides;
            if (list32 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(36, list32, MomentLevelGuides.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentLevelCounter> list33 = feedData.momentLevelCounters;
            if (list33 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(37, list33, MomentLevelCounter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FeedLiteraturesComment> list34 = feedData.literaturesComments;
            if (list34 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(38, list34, FeedLiteraturesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FeedLiterature> list35 = feedData.literatures;
            if (list35 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(39, list35, FeedLiterature.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentVoiceLiveInfos> list36 = feedData.momentVoiceLiveInfos;
            if (list36 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(40, list36, MomentVoiceLiveInfos.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Meet> list37 = feedData.meets;
            if (list37 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(41, list37, Meet.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AttitudeSourceCatCount attitudeSourceCatCount = feedData.sourceCatCount;
            if (attitudeSourceCatCount != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(42, attitudeSourceCatCount, AttitudeSourceCatCount.PROTOBUF_ADAPTER);
            }
            List<VoiceLiveStates> list38 = feedData.voiceLiveStates;
            if (list38 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(43, list38, VoiceLiveStates.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MomentViewerBox momentViewerBox = feedData.momentViewer;
            if (momentViewerBox != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(44, momentViewerBox, MomentViewerBox.PROTOBUF_ADAPTER);
            }
            List<NotifyUsers> list39 = feedData.notifyUsers;
            if (list39 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(45, list39, NotifyUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BubbleInfo> list40 = feedData.fakeUserStates;
            if (list40 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(46, list40, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveCircleExtInfo> list41 = feedData.liveCircleMomentExtInfos;
            if (list41 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(47, list41, LiveCircleExtInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveCircleBanner> list42 = feedData.liveGroupCircleMomentBanners;
            if (list42 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(48, list42, LiveCircleBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PoiGuidePopWindow> list43 = feedData.popWindows;
            if (list43 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(49, list43, PoiGuidePopWindow.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PoiLocation poiLocation = feedData.location;
            if (poiLocation != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(50, poiLocation, PoiLocation.PROTOBUF_ADAPTER);
            }
            List<StickerInfo> list44 = feedData.stickers;
            if (list44 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(51, list44, StickerInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FeedPoiNearbyWindow feedPoiNearbyWindow = feedData.nearbyWindow;
            if (feedPoiNearbyWindow != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(52, feedPoiNearbyWindow, FeedPoiNearbyWindow.PROTOBUF_ADAPTER);
            }
            List<PostBasePopWindow> list45 = feedData.momentPopWindows;
            if (list45 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(53, list45, PostBasePopWindow.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GuideStatePostConfig guideStatePostConfig = feedData.guideStatePostConfig;
            if (guideStatePostConfig != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(54, guideStatePostConfig, GuideStatePostConfig.PROTOBUF_ADAPTER);
            }
            feedData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FeedData parse(nc5 nc5Var) throws IOException {
            FeedData feedData = new FeedData();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (feedData.cameraFilters == null) {
                            feedData.cameraFilters = new ArrayList();
                        }
                        if (feedData.cameraStickers == null) {
                            feedData.cameraStickers = new ArrayList();
                        }
                        if (feedData.musicCategories == null) {
                            feedData.musicCategories = new ArrayList();
                        }
                        if (feedData.musics == null) {
                            feedData.musics = new ArrayList();
                        }
                        if (feedData.cameraCategories == null) {
                            feedData.cameraCategories = new ArrayList();
                        }
                        if (feedData.moments == null) {
                            feedData.moments = new ArrayList();
                        }
                        if (feedData.dynamic_moments == null) {
                            feedData.dynamic_moments = new ArrayList();
                        }
                        if (feedData.activities == null) {
                            feedData.activities = new ArrayList();
                        }
                        if (feedData.momentTopics == null) {
                            feedData.momentTopics = new ArrayList();
                        }
                        if (feedData.followships == null) {
                            feedData.followships = new ArrayList();
                        }
                        if (feedData.extra == null) {
                            feedData.extra = Extra.new_();
                        }
                        if (feedData.messages == null) {
                            feedData.messages = new ArrayList();
                        }
                        if (feedData.comments == null) {
                            feedData.comments = new ArrayList();
                        }
                        if (feedData.voiceLiveGames == null) {
                            feedData.voiceLiveGames = new ArrayList();
                        }
                        if (feedData.masks == null) {
                            feedData.masks = new ArrayList();
                        }
                        if (feedData.momentSettings == null) {
                            feedData.momentSettings = new ArrayList();
                        }
                        if (feedData.topicCategories == null) {
                            feedData.topicCategories = new ArrayList();
                        }
                        if (feedData.voiceLiveMomentFeeds == null) {
                            feedData.voiceLiveMomentFeeds = new ArrayList();
                        }
                        if (feedData.topicOperations == null) {
                            feedData.topicOperations = new ArrayList();
                        }
                        if (feedData.frames == null) {
                            feedData.frames = new ArrayList();
                        }
                        if (feedData.myMeetFeeds == null) {
                            feedData.myMeetFeeds = new ArrayList();
                        }
                        if (feedData.detect == null) {
                            feedData.detect = DetectInfo.new_();
                        }
                        if (feedData.states == null) {
                            feedData.states = new ArrayList();
                        }
                        if (feedData.groups == null) {
                            feedData.groups = new ArrayList();
                        }
                        if (feedData.momentLevelGuides == null) {
                            feedData.momentLevelGuides = new ArrayList();
                        }
                        if (feedData.momentLevelCounters == null) {
                            feedData.momentLevelCounters = new ArrayList();
                        }
                        if (feedData.literaturesComments == null) {
                            feedData.literaturesComments = new ArrayList();
                        }
                        if (feedData.literatures == null) {
                            feedData.literatures = new ArrayList();
                        }
                        if (feedData.momentVoiceLiveInfos == null) {
                            feedData.momentVoiceLiveInfos = new ArrayList();
                        }
                        if (feedData.meets == null) {
                            feedData.meets = new ArrayList();
                        }
                        if (feedData.sourceCatCount == null) {
                            feedData.sourceCatCount = AttitudeSourceCatCount.new_();
                        }
                        if (feedData.voiceLiveStates == null) {
                            feedData.voiceLiveStates = new ArrayList();
                        }
                        if (feedData.momentViewer == null) {
                            feedData.momentViewer = MomentViewerBox.new_();
                        }
                        if (feedData.notifyUsers == null) {
                            feedData.notifyUsers = new ArrayList();
                        }
                        if (feedData.fakeUserStates == null) {
                            feedData.fakeUserStates = new ArrayList();
                        }
                        if (feedData.liveCircleMomentExtInfos == null) {
                            feedData.liveCircleMomentExtInfos = new ArrayList();
                        }
                        if (feedData.liveGroupCircleMomentBanners == null) {
                            feedData.liveGroupCircleMomentBanners = new ArrayList();
                        }
                        if (feedData.popWindows == null) {
                            feedData.popWindows = new ArrayList();
                        }
                        if (feedData.location == null) {
                            feedData.location = PoiLocation.new_();
                        }
                        if (feedData.stickers == null) {
                            feedData.stickers = new ArrayList();
                        }
                        if (feedData.nearbyWindow == null) {
                            feedData.nearbyWindow = FeedPoiNearbyWindow.new_();
                        }
                        if (feedData.momentPopWindows == null) {
                            feedData.momentPopWindows = new ArrayList();
                        }
                        if (feedData.guideStatePostConfig == null) {
                            feedData.guideStatePostConfig = GuideStatePostConfig.new_();
                        }
                        break;
                    case 10:
                        feedData.cameraFilters = (List) nc5Var.m162488l(CameraFilter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        feedData.cameraStickers = (List) nc5Var.m162488l(CameraSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        feedData.musicCategories = (List) nc5Var.m162488l(MusicCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        feedData.musics = (List) nc5Var.m162488l(Music.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        feedData.cameraCategories = (List) nc5Var.m162488l(CameraCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        feedData.moments = (List) nc5Var.m162488l(Moment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        feedData.activities = (List) nc5Var.m162488l(MomentActivity.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        feedData.feeds = (List) nc5Var.m162488l(RawFeed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        feedData.momentTopics = (List) nc5Var.m162488l(TopicMoment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        feedData.rooms = (List) nc5Var.m162488l(Room.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        feedData.voiceLives = (List) nc5Var.m162488l(VoiceLive.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        feedData.voiceRooms = (List) nc5Var.m162488l(VoiceRoomInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        feedData.lives = (List) nc5Var.m162488l(Live.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        feedData.followships = (List) nc5Var.m162488l(Followship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 122:
                        feedData.extra = (Extra) nc5Var.m162488l(Extra.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        feedData.greetingPermissions = (List) nc5Var.m162488l(GreetingPermission.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        feedData.liveLabels = (List) nc5Var.m162488l(FeedUserLiveLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        feedData.messages = (List) nc5Var.m162488l(MomentMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 154:
                        feedData.comments = (List) nc5Var.m162488l(MomentMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 162:
                        feedData.voiceLiveGames = (List) nc5Var.m162488l(VoiceLiveGame.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        feedData.masks = (List) nc5Var.m162488l(LiveUserMask.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 178:
                        feedData.momentSettings = (List) nc5Var.m162488l(PersonAlbumBgInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        feedData.topicCategories = (List) nc5Var.m162488l(TopicCategorie.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        feedData.voiceLiveMomentFeeds = (List) nc5Var.m162488l(VoiceLiveMomentFeed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 202:
                        feedData.topicOperations = (List) nc5Var.m162488l(TopicOperations.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 210:
                        feedData.frames = (List) nc5Var.m162488l(Frame.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 218:
                        feedData.myMeetFeeds = (List) nc5Var.m162488l(Moment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 226:
                        feedData.detect = (DetectInfo) nc5Var.m162488l(DetectInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 234:
                        feedData.board = (RankingBoards) nc5Var.m162488l(RankingBoards.PROTOBUF_ADAPTER);
                        continue;
                    case 242:
                        feedData.paginationWithTopic = (PaginationWithTopic) nc5Var.m162488l(PaginationWithTopic.PROTOBUF_ADAPTER);
                        continue;
                    case 250:
                        feedData.momentExtras = (List) nc5Var.m162488l(MomentExtra.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 258:
                        feedData.states = (List) nc5Var.m162488l(BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 266:
                        feedData.liveRecommendCards = (List) nc5Var.m162488l(LiveRecommendCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 274:
                        feedData.liveSchemas = (List) nc5Var.m162488l(LiveMultiCallLiveSchema.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 282:
                        feedData.groups = (List) nc5Var.m162488l(Group.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 290:
                        feedData.momentLevelGuides = (List) nc5Var.m162488l(MomentLevelGuides.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 298:
                        feedData.momentLevelCounters = (List) nc5Var.m162488l(MomentLevelCounter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 306:
                        feedData.literaturesComments = (List) nc5Var.m162488l(FeedLiteraturesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 314:
                        feedData.literatures = (List) nc5Var.m162488l(FeedLiterature.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 322:
                        feedData.momentVoiceLiveInfos = (List) nc5Var.m162488l(MomentVoiceLiveInfos.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 330:
                        feedData.meets = (List) nc5Var.m162488l(Meet.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 338:
                        feedData.sourceCatCount = (AttitudeSourceCatCount) nc5Var.m162488l(AttitudeSourceCatCount.PROTOBUF_ADAPTER);
                        continue;
                    case 346:
                        feedData.voiceLiveStates = (List) nc5Var.m162488l(VoiceLiveStates.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 354:
                        feedData.momentViewer = (MomentViewerBox) nc5Var.m162488l(MomentViewerBox.PROTOBUF_ADAPTER);
                        continue;
                    case 362:
                        feedData.notifyUsers = (List) nc5Var.m162488l(NotifyUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 370:
                        feedData.fakeUserStates = (List) nc5Var.m162488l(BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 378:
                        feedData.liveCircleMomentExtInfos = (List) nc5Var.m162488l(LiveCircleExtInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 386:
                        feedData.liveGroupCircleMomentBanners = (List) nc5Var.m162488l(LiveCircleBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 394:
                        feedData.popWindows = (List) nc5Var.m162488l(PoiGuidePopWindow.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 402:
                        feedData.location = (PoiLocation) nc5Var.m162488l(PoiLocation.PROTOBUF_ADAPTER);
                        continue;
                    case 410:
                        feedData.stickers = (List) nc5Var.m162488l(StickerInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 418:
                        feedData.nearbyWindow = (FeedPoiNearbyWindow) nc5Var.m162488l(FeedPoiNearbyWindow.PROTOBUF_ADAPTER);
                        continue;
                    case 426:
                        feedData.momentPopWindows = (List) nc5Var.m162488l(PostBasePopWindow.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 434:
                        feedData.guideStatePostConfig = (GuideStatePostConfig) nc5Var.m162488l(GuideStatePostConfig.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (feedData.cameraFilters == null) {
                            feedData.cameraFilters = new ArrayList();
                        }
                        if (feedData.cameraStickers == null) {
                            feedData.cameraStickers = new ArrayList();
                        }
                        if (feedData.musicCategories == null) {
                            feedData.musicCategories = new ArrayList();
                        }
                        if (feedData.musics == null) {
                            feedData.musics = new ArrayList();
                        }
                        if (feedData.cameraCategories == null) {
                            feedData.cameraCategories = new ArrayList();
                        }
                        if (feedData.moments == null) {
                            feedData.moments = new ArrayList();
                        }
                        if (feedData.dynamic_moments == null) {
                            feedData.dynamic_moments = new ArrayList();
                        }
                        if (feedData.activities == null) {
                            feedData.activities = new ArrayList();
                        }
                        if (feedData.momentTopics == null) {
                            feedData.momentTopics = new ArrayList();
                        }
                        if (feedData.followships == null) {
                            feedData.followships = new ArrayList();
                        }
                        if (feedData.extra == null) {
                            feedData.extra = Extra.new_();
                        }
                        if (feedData.messages == null) {
                            feedData.messages = new ArrayList();
                        }
                        if (feedData.comments == null) {
                            feedData.comments = new ArrayList();
                        }
                        if (feedData.voiceLiveGames == null) {
                            feedData.voiceLiveGames = new ArrayList();
                        }
                        if (feedData.masks == null) {
                            feedData.masks = new ArrayList();
                        }
                        if (feedData.momentSettings == null) {
                            feedData.momentSettings = new ArrayList();
                        }
                        if (feedData.topicCategories == null) {
                            feedData.topicCategories = new ArrayList();
                        }
                        if (feedData.voiceLiveMomentFeeds == null) {
                            feedData.voiceLiveMomentFeeds = new ArrayList();
                        }
                        if (feedData.topicOperations == null) {
                            feedData.topicOperations = new ArrayList();
                        }
                        if (feedData.frames == null) {
                            feedData.frames = new ArrayList();
                        }
                        if (feedData.myMeetFeeds == null) {
                            feedData.myMeetFeeds = new ArrayList();
                        }
                        if (feedData.detect == null) {
                            feedData.detect = DetectInfo.new_();
                        }
                        if (feedData.states == null) {
                            feedData.states = new ArrayList();
                        }
                        if (feedData.groups == null) {
                            feedData.groups = new ArrayList();
                        }
                        if (feedData.momentLevelGuides == null) {
                            feedData.momentLevelGuides = new ArrayList();
                        }
                        if (feedData.momentLevelCounters == null) {
                            feedData.momentLevelCounters = new ArrayList();
                        }
                        if (feedData.literaturesComments == null) {
                            feedData.literaturesComments = new ArrayList();
                        }
                        if (feedData.literatures == null) {
                            feedData.literatures = new ArrayList();
                        }
                        if (feedData.momentVoiceLiveInfos == null) {
                            feedData.momentVoiceLiveInfos = new ArrayList();
                        }
                        if (feedData.meets == null) {
                            feedData.meets = new ArrayList();
                        }
                        if (feedData.sourceCatCount == null) {
                            feedData.sourceCatCount = AttitudeSourceCatCount.new_();
                        }
                        if (feedData.voiceLiveStates == null) {
                            feedData.voiceLiveStates = new ArrayList();
                        }
                        if (feedData.momentViewer == null) {
                            feedData.momentViewer = MomentViewerBox.new_();
                        }
                        if (feedData.notifyUsers == null) {
                            feedData.notifyUsers = new ArrayList();
                        }
                        if (feedData.fakeUserStates == null) {
                            feedData.fakeUserStates = new ArrayList();
                        }
                        if (feedData.liveCircleMomentExtInfos == null) {
                            feedData.liveCircleMomentExtInfos = new ArrayList();
                        }
                        if (feedData.liveGroupCircleMomentBanners == null) {
                            feedData.liveGroupCircleMomentBanners = new ArrayList();
                        }
                        if (feedData.popWindows == null) {
                            feedData.popWindows = new ArrayList();
                        }
                        if (feedData.location == null) {
                            feedData.location = PoiLocation.new_();
                        }
                        if (feedData.stickers == null) {
                            feedData.stickers = new ArrayList();
                        }
                        if (feedData.nearbyWindow == null) {
                            feedData.nearbyWindow = FeedPoiNearbyWindow.new_();
                        }
                        if (feedData.momentPopWindows == null) {
                            feedData.momentPopWindows = new ArrayList();
                        }
                        if (feedData.guideStatePostConfig == null) {
                            feedData.guideStatePostConfig = GuideStatePostConfig.new_();
                            return feedData;
                        }
                        break;
                }
            }
            return feedData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FeedData feedData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<CameraFilter> list = feedData.cameraFilters;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, CameraFilter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CameraSticker> list2 = feedData.cameraStickers;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, CameraSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MusicCategory> list3 = feedData.musicCategories;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(3, list3, MusicCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Music> list4 = feedData.musics;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(4, list4, Music.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CameraCategory> list5 = feedData.cameraCategories;
            if (list5 != null) {
                codedOutputByteBufferNano.m17309K(5, list5, CameraCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Moment> list6 = feedData.moments;
            if (list6 != null) {
                codedOutputByteBufferNano.m17309K(6, list6, Moment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentActivity> list7 = feedData.activities;
            if (list7 != null) {
                codedOutputByteBufferNano.m17309K(7, list7, MomentActivity.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RawFeed> list8 = feedData.feeds;
            if (list8 != null) {
                codedOutputByteBufferNano.m17309K(8, list8, RawFeed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicMoment> list9 = feedData.momentTopics;
            if (list9 != null) {
                codedOutputByteBufferNano.m17309K(9, list9, TopicMoment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Room> list10 = feedData.rooms;
            if (list10 != null) {
                codedOutputByteBufferNano.m17309K(10, list10, Room.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceLive> list11 = feedData.voiceLives;
            if (list11 != null) {
                codedOutputByteBufferNano.m17309K(11, list11, VoiceLive.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceRoomInfo> list12 = feedData.voiceRooms;
            if (list12 != null) {
                codedOutputByteBufferNano.m17309K(12, list12, VoiceRoomInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Live> list13 = feedData.lives;
            if (list13 != null) {
                codedOutputByteBufferNano.m17309K(13, list13, Live.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Followship> list14 = feedData.followships;
            if (list14 != null) {
                codedOutputByteBufferNano.m17309K(14, list14, Followship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Extra extra = feedData.extra;
            if (extra != null) {
                codedOutputByteBufferNano.m17309K(15, extra, Extra.PROTOBUF_ADAPTER);
            }
            List<GreetingPermission> list15 = feedData.greetingPermissions;
            if (list15 != null) {
                codedOutputByteBufferNano.m17309K(16, list15, GreetingPermission.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FeedUserLiveLabel> list16 = feedData.liveLabels;
            if (list16 != null) {
                codedOutputByteBufferNano.m17309K(17, list16, FeedUserLiveLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentMessage> list17 = feedData.messages;
            if (list17 != null) {
                codedOutputByteBufferNano.m17309K(18, list17, MomentMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentMessage> list18 = feedData.comments;
            if (list18 != null) {
                codedOutputByteBufferNano.m17309K(19, list18, MomentMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceLiveGame> list19 = feedData.voiceLiveGames;
            if (list19 != null) {
                codedOutputByteBufferNano.m17309K(20, list19, VoiceLiveGame.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveUserMask> list20 = feedData.masks;
            if (list20 != null) {
                codedOutputByteBufferNano.m17309K(21, list20, LiveUserMask.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PersonAlbumBgInfo> list21 = feedData.momentSettings;
            if (list21 != null) {
                codedOutputByteBufferNano.m17309K(22, list21, PersonAlbumBgInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicCategorie> list22 = feedData.topicCategories;
            if (list22 != null) {
                codedOutputByteBufferNano.m17309K(23, list22, TopicCategorie.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<VoiceLiveMomentFeed> list23 = feedData.voiceLiveMomentFeeds;
            if (list23 != null) {
                codedOutputByteBufferNano.m17309K(24, list23, VoiceLiveMomentFeed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TopicOperations> list24 = feedData.topicOperations;
            if (list24 != null) {
                codedOutputByteBufferNano.m17309K(25, list24, TopicOperations.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Frame> list25 = feedData.frames;
            if (list25 != null) {
                codedOutputByteBufferNano.m17309K(26, list25, Frame.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Moment> list26 = feedData.myMeetFeeds;
            if (list26 != null) {
                codedOutputByteBufferNano.m17309K(27, list26, Moment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            DetectInfo detectInfo = feedData.detect;
            if (detectInfo != null) {
                codedOutputByteBufferNano.m17309K(28, detectInfo, DetectInfo.PROTOBUF_ADAPTER);
            }
            RankingBoards rankingBoards = feedData.board;
            if (rankingBoards != null) {
                codedOutputByteBufferNano.m17309K(29, rankingBoards, RankingBoards.PROTOBUF_ADAPTER);
            }
            PaginationWithTopic paginationWithTopic = feedData.paginationWithTopic;
            if (paginationWithTopic != null) {
                codedOutputByteBufferNano.m17309K(30, paginationWithTopic, PaginationWithTopic.PROTOBUF_ADAPTER);
            }
            List<MomentExtra> list27 = feedData.momentExtras;
            if (list27 != null) {
                codedOutputByteBufferNano.m17309K(31, list27, MomentExtra.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BubbleInfo> list28 = feedData.states;
            if (list28 != null) {
                codedOutputByteBufferNano.m17309K(32, list28, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveRecommendCard> list29 = feedData.liveRecommendCards;
            if (list29 != null) {
                codedOutputByteBufferNano.m17309K(33, list29, LiveRecommendCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveMultiCallLiveSchema> list30 = feedData.liveSchemas;
            if (list30 != null) {
                codedOutputByteBufferNano.m17309K(34, list30, LiveMultiCallLiveSchema.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Group> list31 = feedData.groups;
            if (list31 != null) {
                codedOutputByteBufferNano.m17309K(35, list31, Group.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentLevelGuides> list32 = feedData.momentLevelGuides;
            if (list32 != null) {
                codedOutputByteBufferNano.m17309K(36, list32, MomentLevelGuides.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentLevelCounter> list33 = feedData.momentLevelCounters;
            if (list33 != null) {
                codedOutputByteBufferNano.m17309K(37, list33, MomentLevelCounter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FeedLiteraturesComment> list34 = feedData.literaturesComments;
            if (list34 != null) {
                codedOutputByteBufferNano.m17309K(38, list34, FeedLiteraturesComment.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<FeedLiterature> list35 = feedData.literatures;
            if (list35 != null) {
                codedOutputByteBufferNano.m17309K(39, list35, FeedLiterature.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentVoiceLiveInfos> list36 = feedData.momentVoiceLiveInfos;
            if (list36 != null) {
                codedOutputByteBufferNano.m17309K(40, list36, MomentVoiceLiveInfos.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Meet> list37 = feedData.meets;
            if (list37 != null) {
                codedOutputByteBufferNano.m17309K(41, list37, Meet.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AttitudeSourceCatCount attitudeSourceCatCount = feedData.sourceCatCount;
            if (attitudeSourceCatCount != null) {
                codedOutputByteBufferNano.m17309K(42, attitudeSourceCatCount, AttitudeSourceCatCount.PROTOBUF_ADAPTER);
            }
            List<VoiceLiveStates> list38 = feedData.voiceLiveStates;
            if (list38 != null) {
                codedOutputByteBufferNano.m17309K(43, list38, VoiceLiveStates.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MomentViewerBox momentViewerBox = feedData.momentViewer;
            if (momentViewerBox != null) {
                codedOutputByteBufferNano.m17309K(44, momentViewerBox, MomentViewerBox.PROTOBUF_ADAPTER);
            }
            List<NotifyUsers> list39 = feedData.notifyUsers;
            if (list39 != null) {
                codedOutputByteBufferNano.m17309K(45, list39, NotifyUsers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BubbleInfo> list40 = feedData.fakeUserStates;
            if (list40 != null) {
                codedOutputByteBufferNano.m17309K(46, list40, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveCircleExtInfo> list41 = feedData.liveCircleMomentExtInfos;
            if (list41 != null) {
                codedOutputByteBufferNano.m17309K(47, list41, LiveCircleExtInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LiveCircleBanner> list42 = feedData.liveGroupCircleMomentBanners;
            if (list42 != null) {
                codedOutputByteBufferNano.m17309K(48, list42, LiveCircleBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PoiGuidePopWindow> list43 = feedData.popWindows;
            if (list43 != null) {
                codedOutputByteBufferNano.m17309K(49, list43, PoiGuidePopWindow.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            PoiLocation poiLocation = feedData.location;
            if (poiLocation != null) {
                codedOutputByteBufferNano.m17309K(50, poiLocation, PoiLocation.PROTOBUF_ADAPTER);
            }
            List<StickerInfo> list44 = feedData.stickers;
            if (list44 != null) {
                codedOutputByteBufferNano.m17309K(51, list44, StickerInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FeedPoiNearbyWindow feedPoiNearbyWindow = feedData.nearbyWindow;
            if (feedPoiNearbyWindow != null) {
                codedOutputByteBufferNano.m17309K(52, feedPoiNearbyWindow, FeedPoiNearbyWindow.PROTOBUF_ADAPTER);
            }
            List<PostBasePopWindow> list45 = feedData.momentPopWindows;
            if (list45 != null) {
                codedOutputByteBufferNano.m17309K(53, list45, PostBasePopWindow.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GuideStatePostConfig guideStatePostConfig = feedData.guideStatePostConfig;
            if (guideStatePostConfig != null) {
                codedOutputByteBufferNano.m17309K(54, guideStatePostConfig, GuideStatePostConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FeedData> JSON_ADAPTER = new ObjectJsonAdapter<FeedData>() { // from class: com.p1.mobile.putong.feed.data.FeedData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FeedData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FeedData newInstance() {
            return new FeedData();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(FeedData feedData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2142207829:
                    if (str.equals("topicCategories")) {
                        b = 0;
                    }
                    break;
                case -2140564202:
                    if (str.equals("cameraFilters")) {
                        b = 1;
                    }
                    break;
                case -1999780028:
                    if (str.equals("momentTopics")) {
                        b = 2;
                    }
                    break;
                case -1948377038:
                    if (str.equals("momentViewer")) {
                        b = 3;
                    }
                    break;
                case -1867878176:
                    if (str.equals("voiceLiveStates")) {
                        b = 4;
                    }
                    break;
                case -1751897025:
                    if (str.equals("notifyUsers")) {
                        b = 5;
                    }
                    break;
                case -1532720395:
                    if (str.equals("voiceLives")) {
                        b = 6;
                    }
                    break;
                case -1527007002:
                    if (str.equals("voiceRooms")) {
                        b = 7;
                    }
                    break;
                case -1344153580:
                    if (str.equals("sourceCatCount")) {
                        b = 8;
                    }
                    break;
                case -1335220573:
                    if (str.equals(Detect.TYPE)) {
                        b = 9;
                    }
                    break;
                case -1321472373:
                    if (str.equals("greetingPermissions")) {
                        b = 10;
                    }
                    break;
                case -1266514778:
                    if (str.equals("frames")) {
                        b = 11;
                    }
                    break;
                case -1237460524:
                    if (str.equals("groups")) {
                        b = 12;
                    }
                    break;
                case -1062807826:
                    if (str.equals("musics")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -892482046:
                    if (str.equals("states")) {
                        b = 14;
                    }
                    break;
                case -752854766:
                    if (str.equals("momentPopWindows")) {
                        b = 15;
                    }
                    break;
                case -602415628:
                    if (str.equals("comments")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 17;
                    }
                    break;
                case -179540973:
                    if (str.equals("liveRecommendCards")) {
                        b = 18;
                    }
                    break;
                case 38983503:
                    if (str.equals("nearbyWindow")) {
                        b = 19;
                    }
                    break;
                case 93908710:
                    if (str.equals(HomeTabModuleId.board)) {
                        b = 20;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b = 21;
                    }
                    break;
                case 97308309:
                    if (str.equals("feeds")) {
                        b = 22;
                    }
                    break;
                case 102984967:
                    if (str.equals("lives")) {
                        b = 23;
                    }
                    break;
                case 103667463:
                    if (str.equals("masks")) {
                        b = 24;
                    }
                    break;
                case 103773452:
                    if (str.equals("meets")) {
                        b = 25;
                    }
                    break;
                case 105715315:
                    if (str.equals("dynamic_moments")) {
                        b = 26;
                    }
                    break;
                case 108698360:
                    if (str.equals("rooms")) {
                        b = 27;
                    }
                    break;
                case 113851844:
                    if (str.equals("liveGroupCircleMomentBanners")) {
                        b = 28;
                    }
                    break;
                case 259952015:
                    if (str.equals("paginationWithTopic")) {
                        b = 29;
                    }
                    break;
                case 284854535:
                    if (str.equals("momentVoiceLiveInfos")) {
                        b = 30;
                    }
                    break;
                case 319901979:
                    if (str.equals("cameraStickers")) {
                        b = 31;
                    }
                    break;
                case 424940098:
                    if (str.equals("myMeetFeeds")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 453681731:
                    if (str.equals("momentSettings")) {
                        b = 33;
                    }
                    break;
                case 571237921:
                    if (str.equals("musicCategories")) {
                        b = 34;
                    }
                    break;
                case 578327767:
                    if (str.equals("guideStatePostConfig")) {
                        b = 35;
                    }
                    break;
                case 649584128:
                    if (str.equals("liveCircleMomentExtInfos")) {
                        b = 36;
                    }
                    break;
                case 652385291:
                    if (str.equals("liveLabels")) {
                        b = 37;
                    }
                    break;
                case 680065825:
                    if (str.equals("cameraCategories")) {
                        b = 38;
                    }
                    break;
                case 690925282:
                    if (str.equals("fakeUserStates")) {
                        b = 39;
                    }
                    break;
                case 729465958:
                    if (str.equals("liveSchemas")) {
                        b = 40;
                    }
                    break;
                case 860426875:
                    if (str.equals("topicOperations")) {
                        b = 41;
                    }
                    break;
                case 930537339:
                    if (str.equals("momentLevelGuides")) {
                        b = 42;
                    }
                    break;
                case 1225504086:
                    if (str.equals("literaturesComments")) {
                        b = 43;
                    }
                    break;
                case 1235271283:
                    if (str.equals(Moments.TYPE)) {
                        b = 44;
                    }
                    break;
                case 1341750002:
                    if (str.equals("popWindows")) {
                        b = 45;
                    }
                    break;
                case 1452129315:
                    if (str.equals("voiceLiveGames")) {
                        b = 46;
                    }
                    break;
                case 1531715286:
                    if (str.equals("stickers")) {
                        b = 47;
                    }
                    break;
                case 1614731430:
                    if (str.equals("followships")) {
                        b = 48;
                    }
                    break;
                case 1655182423:
                    if (str.equals("voiceLiveMomentFeeds")) {
                        b = 49;
                    }
                    break;
                case 1746523458:
                    if (str.equals(Literatures.TYPE)) {
                        b = 50;
                    }
                    break;
                case 1835045755:
                    if (str.equals("momentLevelCounters")) {
                        b = 51;
                    }
                    break;
                case 1874189443:
                    if (str.equals("momentExtras")) {
                        b = 52;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 53;
                    }
                    break;
                case 2048605165:
                    if (str.equals("activities")) {
                        b = 54;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    feedData.topicCategories = JsonAdapter.parseArray(jsonParser, TopicCategorie.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    feedData.cameraFilters = JsonAdapter.parseArray(jsonParser, CameraFilter.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    feedData.momentTopics = JsonAdapter.parseArray(jsonParser, TopicMoment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    feedData.momentViewer = MomentViewerBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    feedData.voiceLiveStates = JsonAdapter.parseArray(jsonParser, VoiceLiveStates.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    feedData.notifyUsers = JsonAdapter.parseArray(jsonParser, NotifyUsers.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    feedData.voiceLives = JsonAdapter.parseArray(jsonParser, VoiceLive.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    feedData.voiceRooms = JsonAdapter.parseArray(jsonParser, VoiceRoomInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    feedData.sourceCatCount = AttitudeSourceCatCount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    feedData.detect = DetectInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    feedData.greetingPermissions = JsonAdapter.parseArray(jsonParser, GreetingPermission.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    feedData.frames = JsonAdapter.parseArray(jsonParser, Frame.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    feedData.groups = JsonAdapter.parseArray(jsonParser, Group.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    feedData.musics = JsonAdapter.parseArray(jsonParser, Music.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    feedData.states = JsonAdapter.parseArray(jsonParser, BubbleInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    feedData.momentPopWindows = JsonAdapter.parseArray(jsonParser, PostBasePopWindow.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    feedData.comments = JsonAdapter.parseArray(jsonParser, MomentMessage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    feedData.messages = JsonAdapter.parseArray(jsonParser, MomentMessage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    feedData.liveRecommendCards = JsonAdapter.parseArray(jsonParser, LiveRecommendCard.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 19:
                    feedData.nearbyWindow = FeedPoiNearbyWindow.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    feedData.board = RankingBoards.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    feedData.extra = Extra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 22:
                    feedData.feeds = JsonAdapter.parseArray(jsonParser, RawFeed.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 23:
                    feedData.lives = JsonAdapter.parseArray(jsonParser, Live.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 24:
                    feedData.masks = JsonAdapter.parseArray(jsonParser, LiveUserMask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 25:
                    feedData.meets = JsonAdapter.parseArray(jsonParser, Meet.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    feedData.dynamic_moments = JsonAdapter.parseArray(jsonParser, Moment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 27:
                    feedData.rooms = JsonAdapter.parseArray(jsonParser, Room.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 28:
                    feedData.liveGroupCircleMomentBanners = JsonAdapter.parseArray(jsonParser, LiveCircleBanner.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 29:
                    feedData.paginationWithTopic = PaginationWithTopic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 30:
                    feedData.momentVoiceLiveInfos = JsonAdapter.parseArray(jsonParser, MomentVoiceLiveInfos.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 31:
                    feedData.cameraStickers = JsonAdapter.parseArray(jsonParser, CameraSticker.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 32:
                    feedData.myMeetFeeds = JsonAdapter.parseArray(jsonParser, Moment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 33:
                    feedData.momentSettings = JsonAdapter.parseArray(jsonParser, PersonAlbumBgInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 34:
                    feedData.musicCategories = JsonAdapter.parseArray(jsonParser, MusicCategory.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 35:
                    feedData.guideStatePostConfig = GuideStatePostConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 36:
                    feedData.liveCircleMomentExtInfos = JsonAdapter.parseArray(jsonParser, LiveCircleExtInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 37:
                    feedData.liveLabels = JsonAdapter.parseArray(jsonParser, FeedUserLiveLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 38:
                    feedData.cameraCategories = JsonAdapter.parseArray(jsonParser, CameraCategory.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 39:
                    feedData.fakeUserStates = JsonAdapter.parseArray(jsonParser, BubbleInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 40:
                    feedData.liveSchemas = JsonAdapter.parseArray(jsonParser, LiveMultiCallLiveSchema.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 41:
                    feedData.topicOperations = JsonAdapter.parseArray(jsonParser, TopicOperations.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 42:
                    feedData.momentLevelGuides = JsonAdapter.parseArray(jsonParser, MomentLevelGuides.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 43:
                    feedData.literaturesComments = JsonAdapter.parseArray(jsonParser, FeedLiteraturesComment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 44:
                    feedData.moments = JsonAdapter.parseArray(jsonParser, Moment.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 45:
                    feedData.popWindows = JsonAdapter.parseArray(jsonParser, PoiGuidePopWindow.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 46:
                    feedData.voiceLiveGames = JsonAdapter.parseArray(jsonParser, VoiceLiveGame.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 47:
                    feedData.stickers = JsonAdapter.parseArray(jsonParser, StickerInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 48:
                    feedData.followships = JsonAdapter.parseArray(jsonParser, Followship.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 49:
                    feedData.voiceLiveMomentFeeds = JsonAdapter.parseArray(jsonParser, VoiceLiveMomentFeed.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 50:
                    feedData.literatures = JsonAdapter.parseArray(jsonParser, FeedLiterature.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 51:
                    feedData.momentLevelCounters = JsonAdapter.parseArray(jsonParser, MomentLevelCounter.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 52:
                    feedData.momentExtras = JsonAdapter.parseArray(jsonParser, MomentExtra.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 53:
                    feedData.location = PoiLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 54:
                    feedData.activities = JsonAdapter.parseArray(jsonParser, MomentActivity.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(FeedData feedData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2142207829:
                    if (str.equals("topicCategories")) {
                        b = 0;
                    }
                    break;
                case -2140564202:
                    if (str.equals("cameraFilters")) {
                        b = 1;
                    }
                    break;
                case -1999780028:
                    if (str.equals("momentTopics")) {
                        b = 2;
                    }
                    break;
                case -1948377038:
                    if (str.equals("momentViewer")) {
                        b = 3;
                    }
                    break;
                case -1867878176:
                    if (str.equals("voiceLiveStates")) {
                        b = 4;
                    }
                    break;
                case -1751897025:
                    if (str.equals("notifyUsers")) {
                        b = 5;
                    }
                    break;
                case -1532720395:
                    if (str.equals("voiceLives")) {
                        b = 6;
                    }
                    break;
                case -1527007002:
                    if (str.equals("voiceRooms")) {
                        b = 7;
                    }
                    break;
                case -1344153580:
                    if (str.equals("sourceCatCount")) {
                        b = 8;
                    }
                    break;
                case -1335220573:
                    if (str.equals(Detect.TYPE)) {
                        b = 9;
                    }
                    break;
                case -1321472373:
                    if (str.equals("greetingPermissions")) {
                        b = 10;
                    }
                    break;
                case -1266514778:
                    if (str.equals("frames")) {
                        b = 11;
                    }
                    break;
                case -1237460524:
                    if (str.equals("groups")) {
                        b = 12;
                    }
                    break;
                case -1062807826:
                    if (str.equals("musics")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -892482046:
                    if (str.equals("states")) {
                        b = 14;
                    }
                    break;
                case -752854766:
                    if (str.equals("momentPopWindows")) {
                        b = 15;
                    }
                    break;
                case -602415628:
                    if (str.equals("comments")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        b = 17;
                    }
                    break;
                case -179540973:
                    if (str.equals("liveRecommendCards")) {
                        b = 18;
                    }
                    break;
                case 38983503:
                    if (str.equals("nearbyWindow")) {
                        b = 19;
                    }
                    break;
                case 93908710:
                    if (str.equals(HomeTabModuleId.board)) {
                        b = 20;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b = 21;
                    }
                    break;
                case 97308309:
                    if (str.equals("feeds")) {
                        b = 22;
                    }
                    break;
                case 102984967:
                    if (str.equals("lives")) {
                        b = 23;
                    }
                    break;
                case 103667463:
                    if (str.equals("masks")) {
                        b = 24;
                    }
                    break;
                case 103773452:
                    if (str.equals("meets")) {
                        b = 25;
                    }
                    break;
                case 105715315:
                    if (str.equals("dynamic_moments")) {
                        b = 26;
                    }
                    break;
                case 108698360:
                    if (str.equals("rooms")) {
                        b = 27;
                    }
                    break;
                case 113851844:
                    if (str.equals("liveGroupCircleMomentBanners")) {
                        b = 28;
                    }
                    break;
                case 259952015:
                    if (str.equals("paginationWithTopic")) {
                        b = 29;
                    }
                    break;
                case 284854535:
                    if (str.equals("momentVoiceLiveInfos")) {
                        b = 30;
                    }
                    break;
                case 319901979:
                    if (str.equals("cameraStickers")) {
                        b = 31;
                    }
                    break;
                case 424940098:
                    if (str.equals("myMeetFeeds")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 453681731:
                    if (str.equals("momentSettings")) {
                        b = 33;
                    }
                    break;
                case 571237921:
                    if (str.equals("musicCategories")) {
                        b = 34;
                    }
                    break;
                case 578327767:
                    if (str.equals("guideStatePostConfig")) {
                        b = 35;
                    }
                    break;
                case 649584128:
                    if (str.equals("liveCircleMomentExtInfos")) {
                        b = 36;
                    }
                    break;
                case 652385291:
                    if (str.equals("liveLabels")) {
                        b = 37;
                    }
                    break;
                case 680065825:
                    if (str.equals("cameraCategories")) {
                        b = 38;
                    }
                    break;
                case 690925282:
                    if (str.equals("fakeUserStates")) {
                        b = 39;
                    }
                    break;
                case 729465958:
                    if (str.equals("liveSchemas")) {
                        b = 40;
                    }
                    break;
                case 860426875:
                    if (str.equals("topicOperations")) {
                        b = 41;
                    }
                    break;
                case 930537339:
                    if (str.equals("momentLevelGuides")) {
                        b = 42;
                    }
                    break;
                case 1225504086:
                    if (str.equals("literaturesComments")) {
                        b = 43;
                    }
                    break;
                case 1235271283:
                    if (str.equals(Moments.TYPE)) {
                        b = 44;
                    }
                    break;
                case 1341750002:
                    if (str.equals("popWindows")) {
                        b = 45;
                    }
                    break;
                case 1452129315:
                    if (str.equals("voiceLiveGames")) {
                        b = 46;
                    }
                    break;
                case 1531715286:
                    if (str.equals("stickers")) {
                        b = 47;
                    }
                    break;
                case 1614731430:
                    if (str.equals("followships")) {
                        b = 48;
                    }
                    break;
                case 1655182423:
                    if (str.equals("voiceLiveMomentFeeds")) {
                        b = 49;
                    }
                    break;
                case 1746523458:
                    if (str.equals(Literatures.TYPE)) {
                        b = 50;
                    }
                    break;
                case 1835045755:
                    if (str.equals("momentLevelCounters")) {
                        b = 51;
                    }
                    break;
                case 1874189443:
                    if (str.equals("momentExtras")) {
                        b = 52;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 53;
                    }
                    break;
                case 2048605165:
                    if (str.equals("activities")) {
                        b = 54;
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
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                    return true;
                default:
                    return super.parseFieldCheck(feedData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedData feedData, JsonGenerator jsonGenerator) throws IOException {
            if (feedData.cameraFilters != null) {
                jsonGenerator.writeFieldName("cameraFilters");
                JsonAdapter.serializeArray(feedData.cameraFilters, jsonGenerator, CameraFilter.JSON_ADAPTER);
            }
            if (feedData.cameraStickers != null) {
                jsonGenerator.writeFieldName("cameraStickers");
                JsonAdapter.serializeArray(feedData.cameraStickers, jsonGenerator, CameraSticker.JSON_ADAPTER);
            }
            if (feedData.musicCategories != null) {
                jsonGenerator.writeFieldName("musicCategories");
                JsonAdapter.serializeArray(feedData.musicCategories, jsonGenerator, MusicCategory.JSON_ADAPTER);
            }
            if (feedData.musics != null) {
                jsonGenerator.writeFieldName("musics");
                JsonAdapter.serializeArray(feedData.musics, jsonGenerator, Music.JSON_ADAPTER);
            }
            if (feedData.cameraCategories != null) {
                jsonGenerator.writeFieldName("cameraCategories");
                JsonAdapter.serializeArray(feedData.cameraCategories, jsonGenerator, CameraCategory.JSON_ADAPTER);
            }
            if (feedData.moments != null) {
                jsonGenerator.writeFieldName(Moments.TYPE);
                JsonAdapter.serializeArray(feedData.moments, jsonGenerator, Moment.JSON_ADAPTER);
            }
            if (feedData.dynamic_moments != null) {
                jsonGenerator.writeFieldName("dynamic_moments");
                JsonAdapter.serializeArray(feedData.dynamic_moments, jsonGenerator, Moment.JSON_ADAPTER);
            }
            if (feedData.activities != null) {
                jsonGenerator.writeFieldName("activities");
                JsonAdapter.serializeArray(feedData.activities, jsonGenerator, MomentActivity.JSON_ADAPTER);
            }
            if (feedData.feeds != null) {
                jsonGenerator.writeFieldName("feeds");
                JsonAdapter.serializeArray(feedData.feeds, jsonGenerator, RawFeed.JSON_ADAPTER);
            }
            if (feedData.momentTopics != null) {
                jsonGenerator.writeFieldName("momentTopics");
                JsonAdapter.serializeArray(feedData.momentTopics, jsonGenerator, TopicMoment.JSON_ADAPTER);
            }
            if (feedData.rooms != null) {
                jsonGenerator.writeFieldName("rooms");
                JsonAdapter.serializeArray(feedData.rooms, jsonGenerator, Room.JSON_ADAPTER);
            }
            if (feedData.voiceLives != null) {
                jsonGenerator.writeFieldName("voiceLives");
                JsonAdapter.serializeArray(feedData.voiceLives, jsonGenerator, VoiceLive.JSON_ADAPTER);
            }
            if (feedData.voiceRooms != null) {
                jsonGenerator.writeFieldName("voiceRooms");
                JsonAdapter.serializeArray(feedData.voiceRooms, jsonGenerator, VoiceRoomInfo.JSON_ADAPTER);
            }
            if (feedData.lives != null) {
                jsonGenerator.writeFieldName("lives");
                JsonAdapter.serializeArray(feedData.lives, jsonGenerator, Live.JSON_ADAPTER);
            }
            if (feedData.followships != null) {
                jsonGenerator.writeFieldName("followships");
                JsonAdapter.serializeArray(feedData.followships, jsonGenerator, Followship.JSON_ADAPTER);
            }
            if (feedData.extra != null) {
                jsonGenerator.writeFieldName("extra");
                Extra.JSON_ADAPTER.serialize(feedData.extra, jsonGenerator, true);
            }
            if (feedData.greetingPermissions != null) {
                jsonGenerator.writeFieldName("greetingPermissions");
                JsonAdapter.serializeArray(feedData.greetingPermissions, jsonGenerator, GreetingPermission.JSON_ADAPTER);
            }
            if (feedData.liveLabels != null) {
                jsonGenerator.writeFieldName("liveLabels");
                JsonAdapter.serializeArray(feedData.liveLabels, jsonGenerator, FeedUserLiveLabel.JSON_ADAPTER);
            }
            if (feedData.messages != null) {
                jsonGenerator.writeFieldName("messages");
                JsonAdapter.serializeArray(feedData.messages, jsonGenerator, MomentMessage.JSON_ADAPTER);
            }
            if (feedData.comments != null) {
                jsonGenerator.writeFieldName("comments");
                JsonAdapter.serializeArray(feedData.comments, jsonGenerator, MomentMessage.JSON_ADAPTER);
            }
            if (feedData.voiceLiveGames != null) {
                jsonGenerator.writeFieldName("voiceLiveGames");
                JsonAdapter.serializeArray(feedData.voiceLiveGames, jsonGenerator, VoiceLiveGame.JSON_ADAPTER);
            }
            if (feedData.masks != null) {
                jsonGenerator.writeFieldName("masks");
                JsonAdapter.serializeArray(feedData.masks, jsonGenerator, LiveUserMask.JSON_ADAPTER);
            }
            if (feedData.momentSettings != null) {
                jsonGenerator.writeFieldName("momentSettings");
                JsonAdapter.serializeArray(feedData.momentSettings, jsonGenerator, PersonAlbumBgInfo.JSON_ADAPTER);
            }
            if (feedData.topicCategories != null) {
                jsonGenerator.writeFieldName("topicCategories");
                JsonAdapter.serializeArray(feedData.topicCategories, jsonGenerator, TopicCategorie.JSON_ADAPTER);
            }
            if (feedData.voiceLiveMomentFeeds != null) {
                jsonGenerator.writeFieldName("voiceLiveMomentFeeds");
                JsonAdapter.serializeArray(feedData.voiceLiveMomentFeeds, jsonGenerator, VoiceLiveMomentFeed.JSON_ADAPTER);
            }
            if (feedData.topicOperations != null) {
                jsonGenerator.writeFieldName("topicOperations");
                JsonAdapter.serializeArray(feedData.topicOperations, jsonGenerator, TopicOperations.JSON_ADAPTER);
            }
            if (feedData.frames != null) {
                jsonGenerator.writeFieldName("frames");
                JsonAdapter.serializeArray(feedData.frames, jsonGenerator, Frame.JSON_ADAPTER);
            }
            if (feedData.myMeetFeeds != null) {
                jsonGenerator.writeFieldName("myMeetFeeds");
                JsonAdapter.serializeArray(feedData.myMeetFeeds, jsonGenerator, Moment.JSON_ADAPTER);
            }
            if (feedData.detect != null) {
                jsonGenerator.writeFieldName(Detect.TYPE);
                DetectInfo.JSON_ADAPTER.serialize(feedData.detect, jsonGenerator, true);
            }
            if (feedData.board != null) {
                jsonGenerator.writeFieldName(HomeTabModuleId.board);
                RankingBoards.JSON_ADAPTER.serialize(feedData.board, jsonGenerator, true);
            }
            if (feedData.paginationWithTopic != null) {
                jsonGenerator.writeFieldName("paginationWithTopic");
                PaginationWithTopic.JSON_ADAPTER.serialize(feedData.paginationWithTopic, jsonGenerator, true);
            }
            if (feedData.momentExtras != null) {
                jsonGenerator.writeFieldName("momentExtras");
                JsonAdapter.serializeArray(feedData.momentExtras, jsonGenerator, MomentExtra.JSON_ADAPTER);
            }
            if (feedData.states != null) {
                jsonGenerator.writeFieldName("states");
                JsonAdapter.serializeArray(feedData.states, jsonGenerator, BubbleInfo.JSON_ADAPTER);
            }
            if (feedData.liveRecommendCards != null) {
                jsonGenerator.writeFieldName("liveRecommendCards");
                JsonAdapter.serializeArray(feedData.liveRecommendCards, jsonGenerator, LiveRecommendCard.JSON_ADAPTER);
            }
            if (feedData.liveSchemas != null) {
                jsonGenerator.writeFieldName("liveSchemas");
                JsonAdapter.serializeArray(feedData.liveSchemas, jsonGenerator, LiveMultiCallLiveSchema.JSON_ADAPTER);
            }
            if (feedData.groups != null) {
                jsonGenerator.writeFieldName("groups");
                JsonAdapter.serializeArray(feedData.groups, jsonGenerator, Group.JSON_ADAPTER);
            }
            if (feedData.momentLevelGuides != null) {
                jsonGenerator.writeFieldName("momentLevelGuides");
                JsonAdapter.serializeArray(feedData.momentLevelGuides, jsonGenerator, MomentLevelGuides.JSON_ADAPTER);
            }
            if (feedData.momentLevelCounters != null) {
                jsonGenerator.writeFieldName("momentLevelCounters");
                JsonAdapter.serializeArray(feedData.momentLevelCounters, jsonGenerator, MomentLevelCounter.JSON_ADAPTER);
            }
            if (feedData.literaturesComments != null) {
                jsonGenerator.writeFieldName("literaturesComments");
                JsonAdapter.serializeArray(feedData.literaturesComments, jsonGenerator, FeedLiteraturesComment.JSON_ADAPTER);
            }
            if (feedData.literatures != null) {
                jsonGenerator.writeFieldName(Literatures.TYPE);
                JsonAdapter.serializeArray(feedData.literatures, jsonGenerator, FeedLiterature.JSON_ADAPTER);
            }
            if (feedData.momentVoiceLiveInfos != null) {
                jsonGenerator.writeFieldName("momentVoiceLiveInfos");
                JsonAdapter.serializeArray(feedData.momentVoiceLiveInfos, jsonGenerator, MomentVoiceLiveInfos.JSON_ADAPTER);
            }
            if (feedData.meets != null) {
                jsonGenerator.writeFieldName("meets");
                JsonAdapter.serializeArray(feedData.meets, jsonGenerator, Meet.JSON_ADAPTER);
            }
            if (feedData.sourceCatCount != null) {
                jsonGenerator.writeFieldName("sourceCatCount");
                AttitudeSourceCatCount.JSON_ADAPTER.serialize(feedData.sourceCatCount, jsonGenerator, true);
            }
            if (feedData.voiceLiveStates != null) {
                jsonGenerator.writeFieldName("voiceLiveStates");
                JsonAdapter.serializeArray(feedData.voiceLiveStates, jsonGenerator, VoiceLiveStates.JSON_ADAPTER);
            }
            if (feedData.momentViewer != null) {
                jsonGenerator.writeFieldName("momentViewer");
                MomentViewerBox.JSON_ADAPTER.serialize(feedData.momentViewer, jsonGenerator, true);
            }
            if (feedData.notifyUsers != null) {
                jsonGenerator.writeFieldName("notifyUsers");
                JsonAdapter.serializeArray(feedData.notifyUsers, jsonGenerator, NotifyUsers.JSON_ADAPTER);
            }
            if (feedData.fakeUserStates != null) {
                jsonGenerator.writeFieldName("fakeUserStates");
                JsonAdapter.serializeArray(feedData.fakeUserStates, jsonGenerator, BubbleInfo.JSON_ADAPTER);
            }
            if (feedData.liveCircleMomentExtInfos != null) {
                jsonGenerator.writeFieldName("liveCircleMomentExtInfos");
                JsonAdapter.serializeArray(feedData.liveCircleMomentExtInfos, jsonGenerator, LiveCircleExtInfo.JSON_ADAPTER);
            }
            if (feedData.liveGroupCircleMomentBanners != null) {
                jsonGenerator.writeFieldName("liveGroupCircleMomentBanners");
                JsonAdapter.serializeArray(feedData.liveGroupCircleMomentBanners, jsonGenerator, LiveCircleBanner.JSON_ADAPTER);
            }
            if (feedData.popWindows != null) {
                jsonGenerator.writeFieldName("popWindows");
                JsonAdapter.serializeArray(feedData.popWindows, jsonGenerator, PoiGuidePopWindow.JSON_ADAPTER);
            }
            if (feedData.location != null) {
                jsonGenerator.writeFieldName("location");
                PoiLocation.JSON_ADAPTER.serialize(feedData.location, jsonGenerator, true);
            }
            if (feedData.stickers != null) {
                jsonGenerator.writeFieldName("stickers");
                JsonAdapter.serializeArray(feedData.stickers, jsonGenerator, StickerInfo.JSON_ADAPTER);
            }
            if (feedData.nearbyWindow != null) {
                jsonGenerator.writeFieldName("nearbyWindow");
                FeedPoiNearbyWindow.JSON_ADAPTER.serialize(feedData.nearbyWindow, jsonGenerator, true);
            }
            if (feedData.momentPopWindows != null) {
                jsonGenerator.writeFieldName("momentPopWindows");
                JsonAdapter.serializeArray(feedData.momentPopWindows, jsonGenerator, PostBasePopWindow.JSON_ADAPTER);
            }
            if (feedData.guideStatePostConfig != null) {
                jsonGenerator.writeFieldName("guideStatePostConfig");
                GuideStatePostConfig.JSON_ADAPTER.serialize(feedData.guideStatePostConfig, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Boolean m61978E(TopicMomentIdBox topicMomentIdBox, TopicMoment topicMoment) {
        return TextUtils.equals(topicMoment.f40095id, topicMomentIdBox.f39672id) ? Boolean.TRUE : Boolean.FALSE;
    }

    private boolean checkTopicMomentCanUse() {
        List<Moment> list;
        List<TopicMoment> list2 = this.momentTopics;
        return list2 != null && list2.size() > 0 && (list = this.moments) != null && list.size() > 0;
    }

    public static FeedData new_() {
        FeedData feedData = new FeedData();
        feedData.nullCheck();
        return feedData;
    }

    private void processTopicMoment() {
        try {
            for (Moment moment : this.moments) {
                if (moment != null) {
                    ArrayList arrayList = new ArrayList();
                    List<TopicMomentIdBox> list = moment.topics;
                    if (!jyb.m147479J(list)) {
                        for (final TopicMomentIdBox topicMomentIdBox : list) {
                            TopicMoment topicMoment = (TopicMoment) jyb.m147529r(this.momentTopics, new qcj() { // from class: l.czg
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return FeedData.m61978E(topicMomentIdBox, (TopicMoment) obj);
                                }
                            });
                            if (topicMoment != null) {
                                arrayList.add(topicMoment);
                            }
                        }
                        moment.setTopicList(arrayList);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m62013q(Moment moment, Moment moment2) {
        return (int) (moment2.createdTime - moment.createdTime);
    }

    @Override // com.tantanapp.common.data.BaseData
    public void addAll(BaseData baseData) {
        super.addAll(baseData);
        if (baseData instanceof FeedData) {
            FeedData feedData = (FeedData) baseData;
            this.messages.addAll(feedData.messages);
            this.moments.addAll(feedData.moments);
            this.activities.addAll(feedData.activities);
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FeedData mo225055clone() {
        FeedData feedData = new FeedData();
        List<CameraFilter> list = this.cameraFilters;
        if (list != null) {
            feedData.cameraFilters = ValueObject.util_map(list, new qcj() { // from class: l.oxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((CameraFilter) obj).mo225055clone();
                }
            });
        }
        List<CameraSticker> list2 = this.cameraStickers;
        if (list2 != null) {
            feedData.cameraStickers = ValueObject.util_map(list2, new qcj() { // from class: l.qxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((CameraSticker) obj).mo225055clone();
                }
            });
        }
        List<MusicCategory> list3 = this.musicCategories;
        if (list3 != null) {
            feedData.musicCategories = ValueObject.util_map(list3, new qcj() { // from class: l.cyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MusicCategory) obj).mo225055clone();
                }
            });
        }
        List<Music> list4 = this.musics;
        if (list4 != null) {
            feedData.musics = ValueObject.util_map(list4, new qcj() { // from class: l.oyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Music) obj).mo225055clone();
                }
            });
        }
        List<CameraCategory> list5 = this.cameraCategories;
        if (list5 != null) {
            feedData.cameraCategories = ValueObject.util_map(list5, new qcj() { // from class: l.wyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((CameraCategory) obj).mo225055clone();
                }
            });
        }
        List<Moment> list6 = this.moments;
        if (list6 != null) {
            feedData.moments = ValueObject.util_map(list6, new qcj() { // from class: l.xyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Moment) obj).mo225055clone();
                }
            });
        }
        List<Moment> list7 = this.dynamic_moments;
        if (list7 != null) {
            feedData.dynamic_moments = ValueObject.util_map(list7, new qcj() { // from class: l.yyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Moment) obj).mo225055clone();
                }
            });
        }
        List<MomentActivity> list8 = this.activities;
        if (list8 != null) {
            feedData.activities = ValueObject.util_map(list8, new qcj() { // from class: l.zyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MomentActivity) obj).mo225055clone();
                }
            });
        }
        List<RawFeed> list9 = this.feeds;
        if (list9 != null) {
            feedData.feeds = ValueObject.util_map(list9, new qcj() { // from class: l.azg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((RawFeed) obj).mo225055clone();
                }
            });
        }
        List<TopicMoment> list10 = this.momentTopics;
        if (list10 != null) {
            feedData.momentTopics = ValueObject.util_map(list10, new qcj() { // from class: l.bzg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TopicMoment) obj).mo225055clone();
                }
            });
        }
        List<Room> list11 = this.rooms;
        if (list11 != null) {
            feedData.rooms = ValueObject.util_map(list11, new qcj() { // from class: l.zxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Room) obj).mo225055clone();
                }
            });
        }
        List<VoiceLive> list12 = this.voiceLives;
        if (list12 != null) {
            feedData.voiceLives = ValueObject.util_map(list12, new qcj() { // from class: l.kyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VoiceLive) obj).mo225055clone();
                }
            });
        }
        List<VoiceRoomInfo> list13 = this.voiceRooms;
        if (list13 != null) {
            feedData.voiceRooms = ValueObject.util_map(list13, new qcj() { // from class: l.vyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VoiceRoomInfo) obj).mo225055clone();
                }
            });
        }
        List<Live> list14 = this.lives;
        if (list14 != null) {
            feedData.lives = ValueObject.util_map(list14, new qcj() { // from class: l.ezg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Live) obj).mo225055clone();
                }
            });
        }
        List<Followship> list15 = this.followships;
        if (list15 != null) {
            feedData.followships = ValueObject.util_map(list15, new qcj() { // from class: l.fzg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Followship) obj).mo225055clone();
                }
            });
        }
        Extra extra = this.extra;
        if (extra != null) {
            feedData.extra = extra.mo225055clone();
        }
        List<GreetingPermission> list16 = this.greetingPermissions;
        if (list16 != null) {
            feedData.greetingPermissions = ValueObject.util_map(list16, new qcj() { // from class: l.gzg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GreetingPermission) obj).mo225055clone();
                }
            });
        }
        List<FeedUserLiveLabel> list17 = this.liveLabels;
        if (list17 != null) {
            feedData.liveLabels = ValueObject.util_map(list17, new qcj() { // from class: l.hzg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((FeedUserLiveLabel) obj).mo225055clone();
                }
            });
        }
        List<MomentMessage> list18 = this.messages;
        if (list18 != null) {
            feedData.messages = ValueObject.util_map(list18, new qcj() { // from class: l.izg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MomentMessage) obj).mo225055clone();
                }
            });
        }
        List<MomentMessage> list19 = this.comments;
        if (list19 != null) {
            feedData.comments = ValueObject.util_map(list19, new qcj() { // from class: l.jzg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MomentMessage) obj).mo225055clone();
                }
            });
        }
        List<VoiceLiveGame> list20 = this.voiceLiveGames;
        if (list20 != null) {
            feedData.voiceLiveGames = ValueObject.util_map(list20, new qcj() { // from class: l.pxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VoiceLiveGame) obj).mo225055clone();
                }
            });
        }
        List<LiveUserMask> list21 = this.masks;
        if (list21 != null) {
            feedData.masks = ValueObject.util_map(list21, new qcj() { // from class: l.rxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveUserMask) obj).mo225055clone();
                }
            });
        }
        List<PersonAlbumBgInfo> list22 = this.momentSettings;
        if (list22 != null) {
            feedData.momentSettings = ValueObject.util_map(list22, new qcj() { // from class: l.sxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PersonAlbumBgInfo) obj).mo225055clone();
                }
            });
        }
        List<TopicCategorie> list23 = this.topicCategories;
        if (list23 != null) {
            feedData.topicCategories = ValueObject.util_map(list23, new qcj() { // from class: l.txg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TopicCategorie) obj).mo225055clone();
                }
            });
        }
        List<VoiceLiveMomentFeed> list24 = this.voiceLiveMomentFeeds;
        if (list24 != null) {
            feedData.voiceLiveMomentFeeds = ValueObject.util_map(list24, new qcj() { // from class: l.uxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VoiceLiveMomentFeed) obj).mo225055clone();
                }
            });
        }
        List<TopicOperations> list25 = this.topicOperations;
        if (list25 != null) {
            feedData.topicOperations = ValueObject.util_map(list25, new qcj() { // from class: l.vxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TopicOperations) obj).mo225055clone();
                }
            });
        }
        List<Frame> list26 = this.frames;
        if (list26 != null) {
            feedData.frames = ValueObject.util_map(list26, new qcj() { // from class: l.wxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Frame) obj).mo225055clone();
                }
            });
        }
        List<Moment> list27 = this.myMeetFeeds;
        if (list27 != null) {
            feedData.myMeetFeeds = ValueObject.util_map(list27, new qcj() { // from class: l.xxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Moment) obj).mo225055clone();
                }
            });
        }
        DetectInfo detectInfo = this.detect;
        if (detectInfo != null) {
            feedData.detect = detectInfo.mo225055clone();
        }
        RankingBoards rankingBoards = this.board;
        if (rankingBoards != null) {
            feedData.board = rankingBoards.mo225055clone();
        }
        PaginationWithTopic paginationWithTopic = this.paginationWithTopic;
        if (paginationWithTopic != null) {
            feedData.paginationWithTopic = paginationWithTopic.mo225055clone();
        }
        List<MomentExtra> list28 = this.momentExtras;
        if (list28 != null) {
            feedData.momentExtras = ValueObject.util_map(list28, new qcj() { // from class: l.yxg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MomentExtra) obj).mo225055clone();
                }
            });
        }
        List<BubbleInfo> list29 = this.states;
        if (list29 != null) {
            feedData.states = ValueObject.util_map(list29, new qcj() { // from class: l.ayg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BubbleInfo) obj).mo225055clone();
                }
            });
        }
        List<LiveRecommendCard> list30 = this.liveRecommendCards;
        if (list30 != null) {
            feedData.liveRecommendCards = ValueObject.util_map(list30, new qcj() { // from class: l.byg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveRecommendCard) obj).mo225055clone();
                }
            });
        }
        List<LiveMultiCallLiveSchema> list31 = this.liveSchemas;
        if (list31 != null) {
            feedData.liveSchemas = ValueObject.util_map(list31, new qcj() { // from class: l.dyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveMultiCallLiveSchema) obj).mo225055clone();
                }
            });
        }
        List<Group> list32 = this.groups;
        if (list32 != null) {
            feedData.groups = ValueObject.util_map(list32, new qcj() { // from class: l.eyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Group) obj).mo225055clone();
                }
            });
        }
        List<MomentLevelGuides> list33 = this.momentLevelGuides;
        if (list33 != null) {
            feedData.momentLevelGuides = ValueObject.util_map(list33, new qcj() { // from class: l.fyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MomentLevelGuides) obj).mo225055clone();
                }
            });
        }
        List<MomentLevelCounter> list34 = this.momentLevelCounters;
        if (list34 != null) {
            feedData.momentLevelCounters = ValueObject.util_map(list34, new qcj() { // from class: l.gyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MomentLevelCounter) obj).mo225055clone();
                }
            });
        }
        List<FeedLiteraturesComment> list35 = this.literaturesComments;
        if (list35 != null) {
            feedData.literaturesComments = ValueObject.util_map(list35, new qcj() { // from class: l.hyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((FeedLiteraturesComment) obj).mo225055clone();
                }
            });
        }
        List<FeedLiterature> list36 = this.literatures;
        if (list36 != null) {
            feedData.literatures = ValueObject.util_map(list36, new qcj() { // from class: l.iyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((FeedLiterature) obj).mo225055clone();
                }
            });
        }
        List<MomentVoiceLiveInfos> list37 = this.momentVoiceLiveInfos;
        if (list37 != null) {
            feedData.momentVoiceLiveInfos = ValueObject.util_map(list37, new qcj() { // from class: l.jyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MomentVoiceLiveInfos) obj).mo225055clone();
                }
            });
        }
        List<Meet> list38 = this.meets;
        if (list38 != null) {
            feedData.meets = ValueObject.util_map(list38, new qcj() { // from class: l.lyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Meet) obj).mo225055clone();
                }
            });
        }
        AttitudeSourceCatCount attitudeSourceCatCount = this.sourceCatCount;
        if (attitudeSourceCatCount != null) {
            feedData.sourceCatCount = attitudeSourceCatCount.mo225055clone();
        }
        List<VoiceLiveStates> list39 = this.voiceLiveStates;
        if (list39 != null) {
            feedData.voiceLiveStates = ValueObject.util_map(list39, new qcj() { // from class: l.myg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VoiceLiveStates) obj).mo225055clone();
                }
            });
        }
        MomentViewerBox momentViewerBox = this.momentViewer;
        if (momentViewerBox != null) {
            feedData.momentViewer = momentViewerBox.mo225055clone();
        }
        List<NotifyUsers> list40 = this.notifyUsers;
        if (list40 != null) {
            feedData.notifyUsers = ValueObject.util_map(list40, new qcj() { // from class: l.nyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((NotifyUsers) obj).mo225055clone();
                }
            });
        }
        List<BubbleInfo> list41 = this.fakeUserStates;
        if (list41 != null) {
            feedData.fakeUserStates = ValueObject.util_map(list41, new qcj() { // from class: l.pyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BubbleInfo) obj).mo225055clone();
                }
            });
        }
        List<LiveCircleExtInfo> list42 = this.liveCircleMomentExtInfos;
        if (list42 != null) {
            feedData.liveCircleMomentExtInfos = ValueObject.util_map(list42, new qcj() { // from class: l.qyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveCircleExtInfo) obj).mo225055clone();
                }
            });
        }
        List<LiveCircleBanner> list43 = this.liveGroupCircleMomentBanners;
        if (list43 != null) {
            feedData.liveGroupCircleMomentBanners = ValueObject.util_map(list43, new qcj() { // from class: l.ryg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveCircleBanner) obj).mo225055clone();
                }
            });
        }
        List<PoiGuidePopWindow> list44 = this.popWindows;
        if (list44 != null) {
            feedData.popWindows = ValueObject.util_map(list44, new qcj() { // from class: l.syg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PoiGuidePopWindow) obj).mo225055clone();
                }
            });
        }
        PoiLocation poiLocation = this.location;
        if (poiLocation != null) {
            feedData.location = poiLocation.mo225055clone();
        }
        List<StickerInfo> list45 = this.stickers;
        if (list45 != null) {
            feedData.stickers = ValueObject.util_map(list45, new qcj() { // from class: l.tyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((StickerInfo) obj).mo225055clone();
                }
            });
        }
        FeedPoiNearbyWindow feedPoiNearbyWindow = this.nearbyWindow;
        if (feedPoiNearbyWindow != null) {
            feedData.nearbyWindow = feedPoiNearbyWindow.mo225055clone();
        }
        List<PostBasePopWindow> list46 = this.momentPopWindows;
        if (list46 != null) {
            feedData.momentPopWindows = ValueObject.util_map(list46, new qcj() { // from class: l.uyg
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PostBasePopWindow) obj).mo225055clone();
                }
            });
        }
        GuideStatePostConfig guideStatePostConfig = this.guideStatePostConfig;
        if (guideStatePostConfig != null) {
            feedData.guideStatePostConfig = guideStatePostConfig.mo225055clone();
        }
        return feedData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedData)) {
            return false;
        }
        FeedData feedData = (FeedData) obj;
        return this == obj && ValueObject.util_equals(this.cameraFilters, feedData.cameraFilters) && ValueObject.util_equals(this.cameraStickers, feedData.cameraStickers) && ValueObject.util_equals(this.musicCategories, feedData.musicCategories) && ValueObject.util_equals(this.musics, feedData.musics) && ValueObject.util_equals(this.cameraCategories, feedData.cameraCategories) && ValueObject.util_equals(this.moments, feedData.moments) && ValueObject.util_equals(this.dynamic_moments, feedData.dynamic_moments) && ValueObject.util_equals(this.activities, feedData.activities) && ValueObject.util_equals(this.feeds, feedData.feeds) && ValueObject.util_equals(this.momentTopics, feedData.momentTopics) && ValueObject.util_equals(this.rooms, feedData.rooms) && ValueObject.util_equals(this.voiceLives, feedData.voiceLives) && ValueObject.util_equals(this.voiceRooms, feedData.voiceRooms) && ValueObject.util_equals(this.lives, feedData.lives) && ValueObject.util_equals(this.followships, feedData.followships) && ValueObject.util_equals(this.extra, feedData.extra) && ValueObject.util_equals(this.greetingPermissions, feedData.greetingPermissions) && ValueObject.util_equals(this.liveLabels, feedData.liveLabels) && ValueObject.util_equals(this.messages, feedData.messages) && ValueObject.util_equals(this.comments, feedData.comments) && ValueObject.util_equals(this.voiceLiveGames, feedData.voiceLiveGames) && ValueObject.util_equals(this.masks, feedData.masks) && ValueObject.util_equals(this.momentSettings, feedData.momentSettings) && ValueObject.util_equals(this.topicCategories, feedData.topicCategories) && ValueObject.util_equals(this.voiceLiveMomentFeeds, feedData.voiceLiveMomentFeeds) && ValueObject.util_equals(this.topicOperations, feedData.topicOperations) && ValueObject.util_equals(this.frames, feedData.frames) && ValueObject.util_equals(this.myMeetFeeds, feedData.myMeetFeeds) && ValueObject.util_equals(this.detect, feedData.detect) && ValueObject.util_equals(this.board, feedData.board) && ValueObject.util_equals(this.paginationWithTopic, feedData.paginationWithTopic) && ValueObject.util_equals(this.momentExtras, feedData.momentExtras) && ValueObject.util_equals(this.states, feedData.states) && ValueObject.util_equals(this.liveRecommendCards, feedData.liveRecommendCards) && ValueObject.util_equals(this.liveSchemas, feedData.liveSchemas) && ValueObject.util_equals(this.groups, feedData.groups) && ValueObject.util_equals(this.momentLevelGuides, feedData.momentLevelGuides) && ValueObject.util_equals(this.momentLevelCounters, feedData.momentLevelCounters) && ValueObject.util_equals(this.literaturesComments, feedData.literaturesComments) && ValueObject.util_equals(this.literatures, feedData.literatures) && ValueObject.util_equals(this.momentVoiceLiveInfos, feedData.momentVoiceLiveInfos) && ValueObject.util_equals(this.meets, feedData.meets) && ValueObject.util_equals(this.sourceCatCount, feedData.sourceCatCount) && ValueObject.util_equals(this.voiceLiveStates, feedData.voiceLiveStates) && ValueObject.util_equals(this.momentViewer, feedData.momentViewer) && ValueObject.util_equals(this.notifyUsers, feedData.notifyUsers) && ValueObject.util_equals(this.fakeUserStates, feedData.fakeUserStates) && ValueObject.util_equals(this.liveCircleMomentExtInfos, feedData.liveCircleMomentExtInfos) && ValueObject.util_equals(this.liveGroupCircleMomentBanners, feedData.liveGroupCircleMomentBanners) && ValueObject.util_equals(this.popWindows, feedData.popWindows) && ValueObject.util_equals(this.location, feedData.location) && ValueObject.util_equals(this.stickers, feedData.stickers) && ValueObject.util_equals(this.nearbyWindow, feedData.nearbyWindow) && ValueObject.util_equals(this.momentPopWindows, feedData.momentPopWindows) && ValueObject.util_equals(this.guideStatePostConfig, feedData.guideStatePostConfig);
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
        int iHashCode = super.hashCode() * 41;
        List<CameraFilter> list = this.cameraFilters;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<CameraSticker> list2 = this.cameraStickers;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<MusicCategory> list3 = this.musicCategories;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<Music> list4 = this.musics;
        int iHashCode5 = (iHashCode4 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<CameraCategory> list5 = this.cameraCategories;
        int iHashCode6 = (iHashCode5 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<Moment> list6 = this.moments;
        int iHashCode7 = (iHashCode6 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<Moment> list7 = this.dynamic_moments;
        int iHashCode8 = (iHashCode7 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<MomentActivity> list8 = this.activities;
        int iHashCode9 = (iHashCode8 + (list8 != null ? list8.hashCode() : 0)) * 41;
        List<RawFeed> list9 = this.feeds;
        int iHashCode10 = (iHashCode9 + (list9 != null ? list9.hashCode() : 0)) * 41;
        List<TopicMoment> list10 = this.momentTopics;
        int iHashCode11 = (iHashCode10 + (list10 != null ? list10.hashCode() : 0)) * 41;
        List<Room> list11 = this.rooms;
        int iHashCode12 = (iHashCode11 + (list11 != null ? list11.hashCode() : 0)) * 41;
        List<VoiceLive> list12 = this.voiceLives;
        int iHashCode13 = (iHashCode12 + (list12 != null ? list12.hashCode() : 0)) * 41;
        List<VoiceRoomInfo> list13 = this.voiceRooms;
        int iHashCode14 = (iHashCode13 + (list13 != null ? list13.hashCode() : 0)) * 41;
        List<Live> list14 = this.lives;
        int iHashCode15 = (iHashCode14 + (list14 != null ? list14.hashCode() : 0)) * 41;
        List<Followship> list15 = this.followships;
        int iHashCode16 = (iHashCode15 + (list15 != null ? list15.hashCode() : 0)) * 41;
        Extra extra = this.extra;
        int iHashCode17 = (iHashCode16 + (extra != null ? extra.hashCode() : 0)) * 41;
        List<GreetingPermission> list16 = this.greetingPermissions;
        int iHashCode18 = (iHashCode17 + (list16 != null ? list16.hashCode() : 0)) * 41;
        List<FeedUserLiveLabel> list17 = this.liveLabels;
        int iHashCode19 = (iHashCode18 + (list17 != null ? list17.hashCode() : 0)) * 41;
        List<MomentMessage> list18 = this.messages;
        int iHashCode20 = (iHashCode19 + (list18 != null ? list18.hashCode() : 0)) * 41;
        List<MomentMessage> list19 = this.comments;
        int iHashCode21 = (iHashCode20 + (list19 != null ? list19.hashCode() : 0)) * 41;
        List<VoiceLiveGame> list20 = this.voiceLiveGames;
        int iHashCode22 = (iHashCode21 + (list20 != null ? list20.hashCode() : 0)) * 41;
        List<LiveUserMask> list21 = this.masks;
        int iHashCode23 = (iHashCode22 + (list21 != null ? list21.hashCode() : 0)) * 41;
        List<PersonAlbumBgInfo> list22 = this.momentSettings;
        int iHashCode24 = (iHashCode23 + (list22 != null ? list22.hashCode() : 0)) * 41;
        List<TopicCategorie> list23 = this.topicCategories;
        int iHashCode25 = (iHashCode24 + (list23 != null ? list23.hashCode() : 0)) * 41;
        List<VoiceLiveMomentFeed> list24 = this.voiceLiveMomentFeeds;
        int iHashCode26 = (iHashCode25 + (list24 != null ? list24.hashCode() : 0)) * 41;
        List<TopicOperations> list25 = this.topicOperations;
        int iHashCode27 = (iHashCode26 + (list25 != null ? list25.hashCode() : 0)) * 41;
        List<Frame> list26 = this.frames;
        int iHashCode28 = (iHashCode27 + (list26 != null ? list26.hashCode() : 0)) * 41;
        List<Moment> list27 = this.myMeetFeeds;
        int iHashCode29 = (iHashCode28 + (list27 != null ? list27.hashCode() : 0)) * 41;
        DetectInfo detectInfo = this.detect;
        int iHashCode30 = (iHashCode29 + (detectInfo != null ? detectInfo.hashCode() : 0)) * 41;
        RankingBoards rankingBoards = this.board;
        int iHashCode31 = (iHashCode30 + (rankingBoards != null ? rankingBoards.hashCode() : 0)) * 41;
        PaginationWithTopic paginationWithTopic = this.paginationWithTopic;
        int iHashCode32 = (iHashCode31 + (paginationWithTopic != null ? paginationWithTopic.hashCode() : 0)) * 41;
        List<MomentExtra> list28 = this.momentExtras;
        int iHashCode33 = (iHashCode32 + (list28 != null ? list28.hashCode() : 0)) * 41;
        List<BubbleInfo> list29 = this.states;
        int iHashCode34 = (iHashCode33 + (list29 != null ? list29.hashCode() : 0)) * 41;
        List<LiveRecommendCard> list30 = this.liveRecommendCards;
        int iHashCode35 = (iHashCode34 + (list30 != null ? list30.hashCode() : 0)) * 41;
        List<LiveMultiCallLiveSchema> list31 = this.liveSchemas;
        int iHashCode36 = (iHashCode35 + (list31 != null ? list31.hashCode() : 0)) * 41;
        List<Group> list32 = this.groups;
        int iHashCode37 = (iHashCode36 + (list32 != null ? list32.hashCode() : 0)) * 41;
        List<MomentLevelGuides> list33 = this.momentLevelGuides;
        int iHashCode38 = (iHashCode37 + (list33 != null ? list33.hashCode() : 0)) * 41;
        List<MomentLevelCounter> list34 = this.momentLevelCounters;
        int iHashCode39 = (iHashCode38 + (list34 != null ? list34.hashCode() : 0)) * 41;
        List<FeedLiteraturesComment> list35 = this.literaturesComments;
        int iHashCode40 = (iHashCode39 + (list35 != null ? list35.hashCode() : 0)) * 41;
        List<FeedLiterature> list36 = this.literatures;
        int iHashCode41 = (iHashCode40 + (list36 != null ? list36.hashCode() : 0)) * 41;
        List<MomentVoiceLiveInfos> list37 = this.momentVoiceLiveInfos;
        int iHashCode42 = (iHashCode41 + (list37 != null ? list37.hashCode() : 0)) * 41;
        List<Meet> list38 = this.meets;
        int iHashCode43 = (iHashCode42 + (list38 != null ? list38.hashCode() : 0)) * 41;
        AttitudeSourceCatCount attitudeSourceCatCount = this.sourceCatCount;
        int iHashCode44 = (iHashCode43 + (attitudeSourceCatCount != null ? attitudeSourceCatCount.hashCode() : 0)) * 41;
        List<VoiceLiveStates> list39 = this.voiceLiveStates;
        int iHashCode45 = (iHashCode44 + (list39 != null ? list39.hashCode() : 0)) * 41;
        MomentViewerBox momentViewerBox = this.momentViewer;
        int iHashCode46 = (iHashCode45 + (momentViewerBox != null ? momentViewerBox.hashCode() : 0)) * 41;
        List<NotifyUsers> list40 = this.notifyUsers;
        int iHashCode47 = (iHashCode46 + (list40 != null ? list40.hashCode() : 0)) * 41;
        List<BubbleInfo> list41 = this.fakeUserStates;
        int iHashCode48 = (iHashCode47 + (list41 != null ? list41.hashCode() : 0)) * 41;
        List<LiveCircleExtInfo> list42 = this.liveCircleMomentExtInfos;
        int iHashCode49 = (iHashCode48 + (list42 != null ? list42.hashCode() : 0)) * 41;
        List<LiveCircleBanner> list43 = this.liveGroupCircleMomentBanners;
        int iHashCode50 = (iHashCode49 + (list43 != null ? list43.hashCode() : 0)) * 41;
        List<PoiGuidePopWindow> list44 = this.popWindows;
        int iHashCode51 = (iHashCode50 + (list44 != null ? list44.hashCode() : 0)) * 41;
        PoiLocation poiLocation = this.location;
        int iHashCode52 = (iHashCode51 + (poiLocation != null ? poiLocation.hashCode() : 0)) * 41;
        List<StickerInfo> list45 = this.stickers;
        int iHashCode53 = (iHashCode52 + (list45 != null ? list45.hashCode() : 0)) * 41;
        FeedPoiNearbyWindow feedPoiNearbyWindow = this.nearbyWindow;
        int iHashCode54 = (iHashCode53 + (feedPoiNearbyWindow != null ? feedPoiNearbyWindow.hashCode() : 0)) * 41;
        List<PostBasePopWindow> list46 = this.momentPopWindows;
        int iHashCode55 = (iHashCode54 + (list46 != null ? list46.hashCode() : 0)) * 41;
        GuideStatePostConfig guideStatePostConfig = this.guideStatePostConfig;
        int iHashCode56 = iHashCode55 + (guideStatePostConfig != null ? guideStatePostConfig.hashCode() : 0);
        this.hashCode = iHashCode56;
        return iHashCode56;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.cameraFilters == null) {
            this.cameraFilters = new ArrayList();
        }
        if (this.cameraStickers == null) {
            this.cameraStickers = new ArrayList();
        }
        if (this.musicCategories == null) {
            this.musicCategories = new ArrayList();
        }
        if (this.musics == null) {
            this.musics = new ArrayList();
        }
        if (this.cameraCategories == null) {
            this.cameraCategories = new ArrayList();
        }
        if (this.moments == null) {
            this.moments = new ArrayList();
        }
        if (this.dynamic_moments == null) {
            this.dynamic_moments = new ArrayList();
        }
        if (this.activities == null) {
            this.activities = new ArrayList();
        }
        if (this.momentTopics == null) {
            this.momentTopics = new ArrayList();
        }
        if (this.followships == null) {
            this.followships = new ArrayList();
        }
        if (this.extra == null) {
            this.extra = Extra.new_();
        }
        if (this.messages == null) {
            this.messages = new ArrayList();
        }
        if (this.comments == null) {
            this.comments = new ArrayList();
        }
        if (this.voiceLiveGames == null) {
            this.voiceLiveGames = new ArrayList();
        }
        if (this.masks == null) {
            this.masks = new ArrayList();
        }
        if (this.momentSettings == null) {
            this.momentSettings = new ArrayList();
        }
        if (this.topicCategories == null) {
            this.topicCategories = new ArrayList();
        }
        if (this.voiceLiveMomentFeeds == null) {
            this.voiceLiveMomentFeeds = new ArrayList();
        }
        if (this.topicOperations == null) {
            this.topicOperations = new ArrayList();
        }
        if (this.frames == null) {
            this.frames = new ArrayList();
        }
        if (this.myMeetFeeds == null) {
            this.myMeetFeeds = new ArrayList();
        }
        if (this.detect == null) {
            this.detect = DetectInfo.new_();
        }
        if (this.states == null) {
            this.states = new ArrayList();
        }
        if (this.groups == null) {
            this.groups = new ArrayList();
        }
        if (this.momentLevelGuides == null) {
            this.momentLevelGuides = new ArrayList();
        }
        if (this.momentLevelCounters == null) {
            this.momentLevelCounters = new ArrayList();
        }
        if (this.literaturesComments == null) {
            this.literaturesComments = new ArrayList();
        }
        if (this.literatures == null) {
            this.literatures = new ArrayList();
        }
        if (this.momentVoiceLiveInfos == null) {
            this.momentVoiceLiveInfos = new ArrayList();
        }
        if (this.meets == null) {
            this.meets = new ArrayList();
        }
        if (this.sourceCatCount == null) {
            this.sourceCatCount = AttitudeSourceCatCount.new_();
        }
        if (this.voiceLiveStates == null) {
            this.voiceLiveStates = new ArrayList();
        }
        if (this.momentViewer == null) {
            this.momentViewer = MomentViewerBox.new_();
        }
        if (this.notifyUsers == null) {
            this.notifyUsers = new ArrayList();
        }
        if (this.fakeUserStates == null) {
            this.fakeUserStates = new ArrayList();
        }
        if (this.liveCircleMomentExtInfos == null) {
            this.liveCircleMomentExtInfos = new ArrayList();
        }
        if (this.liveGroupCircleMomentBanners == null) {
            this.liveGroupCircleMomentBanners = new ArrayList();
        }
        if (this.popWindows == null) {
            this.popWindows = new ArrayList();
        }
        if (this.location == null) {
            this.location = PoiLocation.new_();
        }
        if (this.stickers == null) {
            this.stickers = new ArrayList();
        }
        if (this.nearbyWindow == null) {
            this.nearbyWindow = FeedPoiNearbyWindow.new_();
        }
        if (this.momentPopWindows == null) {
            this.momentPopWindows = new ArrayList();
        }
        if (this.guideStatePostConfig == null) {
            this.guideStatePostConfig = GuideStatePostConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        super.onApiParseComplete();
        if (this.dynamic_moments.size() > 0) {
            this.moments.addAll(this.dynamic_moments);
            jyb.m147478I(this.moments, new Comparator() { // from class: l.dzg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return FeedData.m62013q((Moment) obj, (Moment) obj2);
                }
            });
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
