package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.JsonObject;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p051p1.mobile.putong.data.AudioMedia;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipCounter;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.GifMedia;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.LiveUserMask;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.NearbyLocation;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Room;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.VoiceLiveGame;
import com.p051p1.mobile.putong.data.VoiceRoomInfo;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.AttitudeSourceCatCount;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.FeedLiterature;
import com.p051p1.mobile.putong.feed.data.FeedLiteraturesComment;
import com.p051p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.GroupType;
import com.p051p1.mobile.putong.feed.data.GuideStatePostConfig;
import com.p051p1.mobile.putong.feed.data.LiveCircleBanner;
import com.p051p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p051p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p051p1.mobile.putong.feed.data.LiveMultiCallLiveSchema;
import com.p051p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.feed.data.MomentFeedsExtra;
import com.p051p1.mobile.putong.feed.data.MomentForwards;
import com.p051p1.mobile.putong.feed.data.MomentLevelGuides;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.MomentMessageType;
import com.p051p1.mobile.putong.feed.data.MomentSettings;
import com.p051p1.mobile.putong.feed.data.MomentViewerBox;
import com.p051p1.mobile.putong.feed.data.MomentVisibilityStatus;
import com.p051p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.p051p1.mobile.putong.feed.data.OnVoiceCall;
import com.p051p1.mobile.putong.feed.data.OperationType;
import com.p051p1.mobile.putong.feed.data.PersonAlbumBgInfo;
import com.p051p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.data.UserSetVisibility;
import com.p051p1.mobile.putong.feed.data.ViewersBox;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.feed.data.VoiceLiveMomentFeed;
import com.p051p1.mobile.putong.feed.data.VoteOptions;
import com.p051p1.mobile.putong.feed.helper.MomentUserNullException;
import com.p051p1.mobile.putong.feed.helper.exception.MomentPostFailedExcepion;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes13.dex */
public class jka extends dog {

    /* JADX INFO: renamed from: L1 */
    public static pf60<String, Integer> f121282L1;

    /* JADX INFO: renamed from: M1 */
    public static C22508b<Boolean> f121283M1 = C22508b.m222767b();

    /* JADX INFO: renamed from: N1 */
    public static Throwable f121284N1 = new Throwable("对方取消了关注，暂时无法聊天");

    /* JADX INFO: renamed from: A0 */
    public final Map<String, User> f121285A0;

    /* JADX INFO: renamed from: A1 */
    public C22507a<uxj0> f121286A1;

    /* JADX INFO: renamed from: B0 */
    public C22508b<String> f121287B0;

    /* JADX INFO: renamed from: B1 */
    public C22508b<String> f121288B1;

    /* JADX INFO: renamed from: C0 */
    public C22508b<Map<String, User>> f121289C0;

    /* JADX INFO: renamed from: C1 */
    public C22508b<uxj0> f121290C1;

    /* JADX INFO: renamed from: D0 */
    public List<String> f121291D0;

    /* JADX INFO: renamed from: D1 */
    public byd0 f121292D1;

    /* JADX INFO: renamed from: E0 */
    public List<String> f121293E0;

    /* JADX INFO: renamed from: E1 */
    public byd0 f121294E1;

    /* JADX INFO: renamed from: F0 */
    public List<String> f121295F0;

    /* JADX INFO: renamed from: F1 */
    public ConcurrentHashMap<String, String> f121296F1;

    /* JADX INFO: renamed from: G0 */
    public long f121297G0;

    /* JADX INFO: renamed from: G1 */
    public String f121298G1;

    /* JADX INFO: renamed from: H */
    public boolean f121299H;

    /* JADX INFO: renamed from: H0 */
    public final Map<String, MomentMessage> f121300H0;

    /* JADX INFO: renamed from: H1 */
    public TopicOperations f121301H1;

    /* JADX INFO: renamed from: I */
    public jxd0 f121302I;

    /* JADX INFO: renamed from: I0 */
    public final Map<String, StickerInfo> f121303I0;

    /* JADX INFO: renamed from: I1 */
    public String f121304I1;

    /* JADX INFO: renamed from: J */
    public wyd0 f121305J;

    /* JADX INFO: renamed from: J0 */
    public C22508b<MomentMessage> f121306J0;

    /* JADX INFO: renamed from: J1 */
    public Map<String, nq00> f121307J1;

    /* JADX INFO: renamed from: K */
    public vxd0 f121308K;

    /* JADX INFO: renamed from: K0 */
    public C22508b<MomentMessage> f121309K0;

    /* JADX INFO: renamed from: K1 */
    public C22507a<List<User>> f121310K1;

    /* JADX INFO: renamed from: L */
    public byd0 f121311L;

    /* JADX INFO: renamed from: L0 */
    public final Map<String, Group> f121312L0;

    /* JADX INFO: renamed from: M */
    public byd0 f121313M;

    /* JADX INFO: renamed from: M0 */
    public final Map<String, BubbleInfo> f121314M0;

    /* JADX INFO: renamed from: N */
    public byd0 f121315N;

    /* JADX INFO: renamed from: N0 */
    public GuideStatePostConfig f121316N0;

    /* JADX INFO: renamed from: O */
    public byd0 f121317O;

    /* JADX INFO: renamed from: O0 */
    public C22507a<GuideStatePostConfig> f121318O0;

    /* JADX INFO: renamed from: P */
    public byd0 f121319P;

    /* JADX INFO: renamed from: P0 */
    public C22508b<pf60<String, Boolean>> f121320P0;

    /* JADX INFO: renamed from: Q */
    public vxd0 f121321Q;

    /* JADX INFO: renamed from: Q0 */
    public C22508b<pf60<User, Boolean>> f121322Q0;

    /* JADX INFO: renamed from: R0 */
    public C22508b<String> f121324R0;

    /* JADX INFO: renamed from: S0 */
    public C22508b<pf60<User, Boolean>> f121326S0;

    /* JADX INFO: renamed from: T0 */
    public LinkedHashMap<String, Moment> f121328T0;

    /* JADX INFO: renamed from: U */
    public jxd0 f121329U;

    /* JADX INFO: renamed from: U0 */
    public Map<String, PersonAlbumBgInfo> f121330U0;

    /* JADX INFO: renamed from: V */
    public jxd0 f121331V;

    /* JADX INFO: renamed from: V0 */
    public C22508b<Map<String, PersonAlbumBgInfo>> f121332V0;

    /* JADX INFO: renamed from: W */
    public jxd0 f121333W;

    /* JADX INFO: renamed from: W0 */
    public C22508b<bkj0<List<User>, Integer, Boolean>> f121334W0;

    /* JADX INFO: renamed from: X */
    public jxd0 f121335X;

    /* JADX INFO: renamed from: X0 */
    public C22508b<List<String>> f121336X0;

    /* JADX INFO: renamed from: Y */
    public jxd0 f121337Y;

    /* JADX INFO: renamed from: Y0 */
    public C22507a<Boolean> f121338Y0;

    /* JADX INFO: renamed from: Z */
    public jxd0 f121339Z;

    /* JADX INFO: renamed from: Z0 */
    public byd0 f121340Z0;

    /* JADX INFO: renamed from: a0 */
    public wyd0 f121341a0;

    /* JADX INFO: renamed from: a1 */
    public mxd0 f121342a1;

    /* JADX INFO: renamed from: b0 */
    public jxd0 f121343b0;

    /* JADX INFO: renamed from: b1 */
    public C22507a<pf60<Links, List<TopicMoment>>> f121344b1;

    /* JADX INFO: renamed from: c0 */
    public vxd0 f121345c0;

    /* JADX INFO: renamed from: c1 */
    public C22508b<Map<String, TopicMoment>> f121346c1;

    /* JADX INFO: renamed from: d0 */
    public vxd0 f121347d0;

    /* JADX INFO: renamed from: d1 */
    public C22507a<pf60<Links, List<TopicMoment>>> f121348d1;

    /* JADX INFO: renamed from: e0 */
    public jxd0 f121349e0;

    /* JADX INFO: renamed from: e1 */
    public C22507a<pf60<Links, List<TopicMoment>>> f121350e1;

    /* JADX INFO: renamed from: f0 */
    public Map<String, Boolean> f121351f0;

    /* JADX INFO: renamed from: f1 */
    public C22507a<TopicOperations> f121352f1;

    /* JADX INFO: renamed from: g0 */
    public Map<String, List<PostBasePopWindow>> f121353g0;

    /* JADX INFO: renamed from: g1 */
    public C22507a<pf60<List<TopicCategorie>, List<TopicMoment>>> f121354g1;

    /* JADX INFO: renamed from: h0 */
    public Map<String, MomentVoiceLiveInfos> f121355h0;

    /* JADX INFO: renamed from: h1 */
    public C22507a<Double> f121356h1;

    /* JADX INFO: renamed from: i0 */
    public Map<String, Moment> f121357i0;

    /* JADX INFO: renamed from: i1 */
    public C22507a<Map<String, BubbleInfo>> f121358i1;

    /* JADX INFO: renamed from: j0 */
    public Map<String, NotifyUsers> f121359j0;

    /* JADX INFO: renamed from: j1 */
    public C22507a<List<BubbleInfo>> f121360j1;

    /* JADX INFO: renamed from: k0 */
    public List<NotifyUsers> f121361k0;

    /* JADX INFO: renamed from: k1 */
    public mxd0 f121362k1;

    /* JADX INFO: renamed from: l0 */
    public C22508b<Map<String, Moment>> f121363l0;

    /* JADX INFO: renamed from: l1 */
    public ConcurrentHashMap<String, Live> f121364l1;

    /* JADX INFO: renamed from: m0 */
    public C22508b<Moment> f121365m0;

    /* JADX INFO: renamed from: m1 */
    public ConcurrentHashMap<String, VoiceLive> f121366m1;

    /* JADX INFO: renamed from: n0 */
    public C22508b<Moment> f121367n0;

    /* JADX INFO: renamed from: n1 */
    public ConcurrentHashMap<String, VoiceRoomInfo> f121368n1;

    /* JADX INFO: renamed from: o0 */
    public C22508b<Moment> f121369o0;

    /* JADX INFO: renamed from: o1 */
    public ConcurrentHashMap<String, VoiceLiveGame> f121370o1;

    /* JADX INFO: renamed from: p0 */
    public C22508b<Moment> f121371p0;

    /* JADX INFO: renamed from: p1 */
    public ConcurrentHashMap<String, VoiceLiveMomentFeed> f121372p1;

    /* JADX INFO: renamed from: q0 */
    public C22508b<Moment> f121373q0;

    /* JADX INFO: renamed from: q1 */
    public ConcurrentHashMap<String, LiveCircleExtInfo> f121374q1;

    /* JADX INFO: renamed from: r0 */
    public C22508b<Moment> f121375r0;

    /* JADX INFO: renamed from: r1 */
    public ConcurrentHashMap<String, LiveCircleBanner> f121376r1;

    /* JADX INFO: renamed from: s0 */
    public C22507a<List<Moment>> f121377s0;

    /* JADX INFO: renamed from: s1 */
    public kfh f121378s1;

    /* JADX INFO: renamed from: t0 */
    public C22507a<List<User>> f121379t0;

    /* JADX INFO: renamed from: t1 */
    public C22508b<Boolean> f121380t1;

    /* JADX INFO: renamed from: u0 */
    public C22507a<List<Moment>> f121381u0;

    /* JADX INFO: renamed from: u1 */
    public C22508b<MomentLevelGuides> f121382u1;

    /* JADX INFO: renamed from: v0 */
    public C22507a<bkj0<List<User>, List<Live>, Links>> f121383v0;

    /* JADX INFO: renamed from: v1 */
    public C22508b<Boolean> f121384v1;

    /* JADX INFO: renamed from: w0 */
    public C22507a<Boolean> f121385w0;

    /* JADX INFO: renamed from: w1 */
    public C22508b<Boolean> f121386w1;

    /* JADX INFO: renamed from: x0 */
    public C22507a<List<BubbleInfo>> f121387x0;

    /* JADX INFO: renamed from: x1 */
    public C22508b<Followship> f121388x1;

    /* JADX INFO: renamed from: y0 */
    public C22508b<uxj0> f121389y0;

    /* JADX INFO: renamed from: y1 */
    public C22508b<Relationship> f121390y1;

    /* JADX INFO: renamed from: z0 */
    public C22507a<Boolean> f121391z0;

    /* JADX INFO: renamed from: z1 */
    public C22508b<String> f121392z1;

    /* JADX INFO: renamed from: R */
    public final int f121323R = 20101;

    /* JADX INFO: renamed from: S */
    public final int f121325S = 20102;

    /* JADX INFO: renamed from: T */
    public byd0 f121327T = new byd0("like_show_bubble_number" + FeedModule.m61405F().userId(), 0L);

    public jka() {
        String str = "new_moment_draft_media" + FeedModule.m61405F().userId();
        Boolean bool = Boolean.FALSE;
        this.f121329U = new jxd0(str, bool);
        this.f121331V = new jxd0("new_moment_draft_text" + FeedModule.m61405F().userId(), bool);
        this.f121333W = new jxd0("near_by_feed_show_follow_tips_" + FeedModule.m61405F().userId(), bool);
        this.f121335X = new jxd0("has_show_follow_fans_tips_" + FeedModule.m61405F().userId(), bool);
        this.f121337Y = new jxd0("live_show_follow" + FeedModule.m61405F().userId(), bool);
        this.f121339Z = new jxd0("show_pop_window" + FeedModule.m61405F().userId(), bool);
        this.f121341a0 = new wyd0("first_like_moment" + FeedModule.m61405F().userId(), "");
        this.f121343b0 = new jxd0("default_sync_moment" + FeedModule.m61405F().userId(), bool);
        this.f121345c0 = new vxd0("fans_enter_count", 0);
        this.f121347d0 = new vxd0("following_enter_count", 0);
        this.f121349e0 = new jxd0("discovery_show_new_user_tips_" + FeedModule.m61405F().userId(), bool);
        this.f121351f0 = new HashMap();
        this.f121353g0 = new HashMap();
        this.f121355h0 = new HashMap();
        this.f121357i0 = new HashMap();
        this.f121359j0 = new HashMap();
        this.f121361k0 = jyb.m147507f0(new NotifyUsers[0]);
        this.f121363l0 = C22508b.m222767b();
        this.f121365m0 = C22508b.m222767b();
        this.f121367n0 = C22508b.m222767b();
        this.f121369o0 = C22508b.m222767b();
        this.f121371p0 = C22508b.m222767b();
        this.f121373q0 = C22508b.m222767b();
        this.f121375r0 = C22508b.m222767b();
        this.f121377s0 = C22507a.m222759c(new ArrayList());
        this.f121379t0 = C22507a.m222759c(new ArrayList());
        this.f121381u0 = C22507a.m222759c(new ArrayList());
        this.f121383v0 = C22507a.m222758b();
        this.f121385w0 = C22507a.m222758b();
        this.f121387x0 = C22507a.m222758b();
        this.f121389y0 = C22508b.m222767b();
        this.f121391z0 = C22507a.m222758b();
        this.f121285A0 = new HashMap();
        this.f121287B0 = C22508b.m222767b();
        this.f121289C0 = C22508b.m222767b();
        this.f121291D0 = jyb.m147507f0(new String[0]);
        this.f121293E0 = jyb.m147507f0(new String[0]);
        this.f121295F0 = jyb.m147507f0(new String[0]);
        this.f121297G0 = ksg.m151170I("feedTime");
        this.f121300H0 = new HashMap();
        this.f121303I0 = new HashMap();
        this.f121306J0 = C22508b.m222767b();
        this.f121309K0 = C22508b.m222767b();
        this.f121312L0 = new HashMap();
        this.f121314M0 = new HashMap();
        this.f121318O0 = C22507a.m222758b();
        this.f121320P0 = C22508b.m222767b();
        this.f121322Q0 = C22508b.m222767b();
        this.f121324R0 = C22508b.m222767b();
        this.f121326S0 = C22508b.m222767b();
        this.f121328T0 = new LinkedHashMap<>();
        this.f121330U0 = new HashMap();
        this.f121332V0 = C22508b.m222767b();
        this.f121334W0 = C22508b.m222767b();
        this.f121336X0 = C22508b.m222767b();
        this.f121338Y0 = C22507a.m222758b();
        this.f121340Z0 = new byd0("nearby_fix_time_dot_show_time", 0L);
        this.f121342a1 = new mxd0("follow_moment_latest_create_time_" + FeedModule.m61405F().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f121344b1 = C22507a.m222758b();
        this.f121346c1 = C22508b.m222767b();
        this.f121348d1 = C22507a.m222758b();
        this.f121350e1 = C22507a.m222758b();
        this.f121352f1 = C22507a.m222758b();
        this.f121354g1 = C22507a.m222758b();
        this.f121356h1 = C22507a.m222759c(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        this.f121358i1 = C22507a.m222759c(new HashMap());
        this.f121360j1 = C22507a.m222758b();
        this.f121362k1 = new mxd0("moment_topic_latest_create_time_" + FeedModule.m61405F().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f121364l1 = new ConcurrentHashMap<>();
        this.f121366m1 = new ConcurrentHashMap<>();
        this.f121368n1 = new ConcurrentHashMap<>();
        this.f121370o1 = new ConcurrentHashMap<>();
        this.f121372p1 = new ConcurrentHashMap<>();
        this.f121374q1 = new ConcurrentHashMap<>();
        this.f121376r1 = new ConcurrentHashMap<>();
        this.f121378s1 = new kfh();
        this.f121380t1 = C22508b.m222767b();
        this.f121382u1 = C22508b.m222767b();
        this.f121384v1 = C22508b.m222767b();
        this.f121386w1 = C22508b.m222767b();
        this.f121388x1 = C22508b.m222767b();
        this.f121390y1 = C22508b.m222767b();
        this.f121392z1 = C22508b.m222767b();
        this.f121286A1 = C22507a.m222758b();
        this.f121288B1 = C22508b.m222767b();
        this.f121290C1 = C22508b.m222767b();
        this.f121292D1 = new byd0("have_new_user_ai_moment_award_time_" + FeedModule.m61405F().userId(), 0L);
        this.f121294E1 = new byd0("last_show_my_tab_man_post_guide_time_" + FeedModule.m61405F().userId(), 0L);
        this.f121296F1 = new ConcurrentHashMap<>();
        this.f121298G1 = "";
        this.f121301H1 = null;
        this.f121304I1 = "dating";
        this.f121307J1 = new HashMap();
        this.f121310K1 = C22507a.m222758b();
        rrq.m182815b().m182820f("live", LiveExtraInFeed.JSON_ADAPTER);
        this.f121299H = !cmg.m111170A0();
        this.f121302I = new jxd0("has_showed_voice_mute_tips" + FeedModule.m61405F().userId(), bool);
        this.f121305J = new wyd0("feed_search_history_" + FeedModule.m61405F().userId(), "");
        this.f121308K = new vxd0("feed_like_tab_success_tips_count_" + FeedModule.m61405F().userId(), 0);
        this.f121311L = new byd0("show_guide_time_for_thanks_in_interest_people" + FeedModule.m61405F().userId(), 0L);
        this.f121313M = new byd0("last_show_poi_seek_guide_dialog_time_" + FeedModule.m61405F().userId(), 0L);
        this.f121315N = new byd0("last_show_poi_share_guide_dialog_time_" + FeedModule.m61405F().userId(), 0L);
        this.f121317O = new byd0("last_show_feed_activity_tips_time_" + FeedModule.m61405F().userId(), 0L);
        this.f121319P = new byd0("last_show_topic_activity_tips_time_" + FeedModule.m61405F().userId(), 0L);
        this.f121321Q = new vxd0("feed_topic_activity_tips_count_" + FeedModule.m61405F().userId(), 0);
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ C22421c m145164B1(qcj qcjVar, Moment moment) {
        return (C22421c) qcjVar.call(moment);
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ C22421c m145165B2(qcj qcjVar, Moment moment) {
        return (C22421c) qcjVar.call(moment);
    }

    /* JADX INFO: renamed from: D3 */
    public static /* synthetic */ void m145178D3(Moment moment) {
        moment.localCreatedSession = App.f16092i.get().intValue();
        FeedModule.f39708i.f160257c.insert(moment);
    }

    /* JADX INFO: renamed from: D4 */
    public static /* synthetic */ int m145179D4(TopicMoment topicMoment, TopicMoment topicMoment2) {
        double d = topicMoment.createdTime - topicMoment2.createdTime;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return -1;
        }
        return d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : 0;
    }

    /* JADX INFO: renamed from: Db */
    private boolean m145181Db(String str) {
        return FeedModule.m61405F().signedIn_() && TextUtils.equals(str, FeedModule.m61405F().userId());
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ x1d0 m145197G3(boolean z) {
        x1d0.C21228a c21228aAuth = dog.f89929G.auth();
        StringBuilder sb = new StringBuilder();
        sb.append(dog.m117246k("/followConfigs"));
        sb.append(z ? "?with=defaultTab" : "");
        return c21228aAuth.m209043q(sb.toString()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ Envelope m145212J0(final Moment moment, Envelope envelope) {
        if (moment._id != 0) {
            l9c.m153394o().m153397B(new x20() { // from class: l.dfa
                @Override // p153l.x20
                public final void call() {
                    FeedModule.f39708i.f160257c.delete(moment._id);
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ x1d0 m145213J1(String str, String str2, String str3, boolean z, JSONObject jSONObject) {
        x1d0.C21228a c21228aM209043q = dog.f89929G.auth().m209043q(dog.m117205F(str, str2, str3, z));
        return (z ? c21228aM209043q.m209039m(z1d0.create(Network.JSON, jSONObject.toString())) : c21228aM209043q.m209030d()).m209028b();
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m145240N4(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ C22421c m145244O2(qcj qcjVar, MomentMessage momentMessage) {
        return (C22421c) qcjVar.call(momentMessage);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m145275T3(Throwable th) {
        if (th == f121284N1) {
            return;
        }
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ void m145279U1(Moment moment) {
        moment.localCreatedSession = App.f16092i.get().intValue();
        FeedModule.f39708i.f160257c.insert(moment);
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ C22421c m145296X0(qcj qcjVar, MomentMessage momentMessage) {
        return (C22421c) qcjVar.call(momentMessage);
    }

    /* JADX INFO: renamed from: X5 */
    public static /* synthetic */ x1d0 m145301X5(String str, String str2, String str3, boolean z) {
        x1d0.C21228a c21228aM209043q = dog.f89929G.auth().m209043q(dog.m117251m0(str, str2, str3));
        return (z ? c21228aM209043q.m209039m(z1d0.create(Network.JSON, "")) : c21228aM209043q.m209030d()).m209028b();
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ int m145304Y2(MomentMessage momentMessage, MomentMessage momentMessage2) {
        return (int) (momentMessage.createdTime - momentMessage2.createdTime);
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m145315a2(Throwable th) {
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ void m145330c5(HashMap map, HashMap map2, OnVoiceCall onVoiceCall) {
        if (NullChecker.m82486a(map.get(onVoiceCall.user.f40092id))) {
            String str = onVoiceCall.user.f40092id;
            map2.put(str, (LiveUserMask) map.get(str));
        }
    }

    /* JADX INFO: renamed from: c6 */
    public static /* synthetic */ Envelope m145331c6(jv00 jv00Var, String str, Envelope envelope) {
        if (NullChecker.m82486a(jv00Var)) {
            jv00Var.mo104111d(str, envelope);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ x1d0 m145332d1(String str, String str2, String str3, String str4, String str5) {
        x1d0.C21228a c21228aAuth = dog.f89929G.auth();
        if (!TextUtils.isEmpty(str)) {
            str5 = dog.m117261s(str2, str3, str4, str);
        }
        return c21228aAuth.m209043q(str5).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ C22421c m145338e1(Envelope envelope) {
        return (envelope == null || jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).messages)) ? C22421c.error(new Throwable("Envelope return onNext is null")) : C22421c.just(envelope);
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ C22421c m145341e4(qcj qcjVar, Moment moment) {
        return (C22421c) qcjVar.call(moment);
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ Envelope m145344f1(Envelope envelope) {
        FriendsFeedViewPagerFrag.f42345J0 = true;
        mrb0.m159653g();
        ksg.m151177L0();
        return envelope;
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ x1d0 m145347f4(String str, String str2) {
        String str3;
        x1d0.C21228a c21228aAuth = dog.f89929G.auth();
        StringBuilder sb = new StringBuilder("/popWindows?page_id=");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&scene=" + str2;
        }
        sb.append(str3);
        return c21228aAuth.m209043q(dog.m117263t(sb.toString())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ x1d0 m145350g1(String str, String str2, String str3, boolean z) {
        x1d0.C21228a c21228aM209043q = dog.f89929G.auth().m209043q(dog.m117204E(str, str2, str3));
        return (z ? c21228aM209043q.m209039m(z1d0.create(Network.JSON, "")) : c21228aM209043q.m209030d()).m209028b();
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ x1d0 m145358h3(String str, String str2, User user, String str3, String str4, Followship followship) {
        x1d0.C21228a c21228aM209043q = dog.f89929G.auth().m209043q(!TextUtils.isEmpty(str) ? dog.m117224Y(str2, user.f56859id, str, str3, str4) : dog.m117222W(str2, user.f56859id, str4));
        c21228aM209043q.m209039m(z1d0.create(Network.JSON, followship.toJson()));
        return c21228aM209043q.m209028b();
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ List m145359h4(Moment moment) {
        if (NullChecker.m82486a(moment)) {
            return moment.media;
        }
        return null;
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ Envelope m145363i2(jv00 jv00Var, String str, Envelope envelope) {
        if (NullChecker.m82486a(jv00Var)) {
            jv00Var.mo104110b(str, envelope);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ x1d0 m145369j2(String str, String str2, String str3, String str4, String str5) {
        x1d0.C21228a c21228aAuth = dog.f89929G.auth();
        if (!TextUtils.isEmpty(str)) {
            str5 = dog.m117259r(str2, str3, str4, str);
        }
        return c21228aAuth.m209043q(str5).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: k6 */
    public static /* synthetic */ x1d0 m145379k6(String str, User user, Followship followship) {
        x1d0.C21228a c21228aM209043q = dog.f89929G.auth().m209043q(dog.m117225Z(str, user.f56859id));
        c21228aM209043q.m209039m(z1d0.create(Network.JSON, followship.toJson()));
        return c21228aM209043q.m209028b();
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ MomentMessage m145382l3(MomentMessage momentMessage, String str) {
        momentMessage.owner = FeedModule.m61405F().userId();
        momentMessage.createdTime = dog.m117260r0() + 10000.0d;
        if (TextUtils.isEmpty(momentMessage.api_only_otherUser)) {
            momentMessage.cid = str;
        } else {
            momentMessage.cid = momentMessage.api_only_otherUser;
        }
        vxd0 vxd0Var = App.f16092i;
        momentMessage.f56856id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        if (momentMessage.value == null) {
            momentMessage.value = "";
        }
        momentMessage.localCreatedSession = vxd0Var.get().intValue();
        return momentMessage;
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m145407p4(String str, long j, pf60 pf60Var) {
        String str2;
        if ("following/moments/next".equals(str)) {
            str2 = "follow";
        } else if ("nearby/next".equals(str)) {
            str2 = "nearby";
        } else {
            str2 = "like/next".equals(str) ? "like" : "";
        }
        TrackMediaUploadUtil.m81481b0(str2, SystemClock.elapsedRealtime() - j);
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ Envelope m145411q2(final Moment moment, Envelope envelope) {
        if (moment._id != 0) {
            l9c.m153394o().m153397B(new x20() { // from class: l.aca
                @Override // p153l.x20
                public final void call() {
                    FeedModule.f39708i.f160257c.delete(moment._id);
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ void m145429t1(Throwable th) {
        if (cn40.m111360L(th)) {
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ uxj0 m145436u1(final Moment moment) {
        l9c.m153394o().m153397B(new x20() { // from class: l.jba
            @Override // p153l.x20
            public final void call() {
                FeedModule.f39708i.f160257c.updateBy_id(moment);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: u6 */
    public static /* synthetic */ List m145441u6(Envelope envelope) {
        return ((FeedData) envelope.getModuleData(FeedData.class)).liveLabels == null ? new ArrayList() : ((FeedData) envelope.getModuleData(FeedData.class)).liveLabels;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ Envelope m145456x0(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ uxj0 m145461x5(Envelope envelope) {
        mrb0.m159652f();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ Envelope m145467y5(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ Envelope m145469z1(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ C22421c m145470z2(final String str, final String str2, final MomentMessage momentMessage) {
        new MomentMessage().recalled = Boolean.TRUE;
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.gaa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117243i0(str, str2, momentMessage.f56856id)).m209030d().m209028b();
            }
        }, 0).compose(dog.m117253n0()).map(new qcj() { // from class: l.haa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: A6, reason: merged with bridge method [inline-methods] */
    public void m145509Ea(Moment moment) {
        if (moment == null) {
            return;
        }
        this.f121357i0.put(moment.f56859id, moment);
        if (moment.f56859id.startsWith("fake_id_")) {
            this.f121328T0.put(moment.f56859id, moment);
        }
    }

    /* JADX INFO: renamed from: A7 */
    public C22421c<Envelope> m145475A7(final String str) {
        final String strM117246k;
        if (TextUtils.isEmpty(str)) {
            strM117246k = dog.m117246k("/states?with=users&limit=20");
        } else {
            strM117246k = dog.m117246k("/states?with=users&limit=20&" + str);
        }
        return scheduled("getFriendState", 0, new pcj() { // from class: l.hga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f109380a.m145696f9(strM117246k, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ C22421c m145476A8(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.pda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117244j()).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).map(new qcj() { // from class: l.qda
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156681a.m145838z8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A9 */
    public final /* synthetic */ BubbleInfo m145477A9(String str, Envelope envelope) {
        m145791sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        if (list.size() <= 0 || !TextUtils.equals(list.get(0).owner.f39651id, str)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: Aa */
    public final /* synthetic */ Boolean m145478Aa(String str, Moment moment) {
        return Boolean.valueOf(m145181Db(str));
    }

    /* JADX INFO: renamed from: Ab */
    public final /* synthetic */ C22421c m145479Ab(String str, String str2, final String str3) {
        final String strM117246k = dog.m117246k("/users/" + str + "/moments/" + str2);
        return new ti20(new pcj() { // from class: l.gga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209037k(z1d0.create(Network.JSON, "{\"userSetVisibility\": \"" + str3 + "\"}")).m209043q(strM117246k).m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.iga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f114772a.m145841zb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ac */
    public C22421c<pf60<Links, List<Moment>>> m145480Ac(String str, jv00 jv00Var) {
        return m145664ac(dog.m117235e0(str, "limit=20"), "poi_location_feeds_pre", false, FeedModule.m61405F().userId(), jv00Var);
    }

    /* JADX INFO: renamed from: Ad */
    public void m145481Ad(User user) {
        if (user == null) {
            return;
        }
        User user2 = this.f121285A0.get(user.f56859id);
        if (user2 == null) {
            this.f121285A0.put(user.f56859id, user);
        } else {
            if (user2.equals(user)) {
                return;
            }
            this.f121285A0.put(user.f56859id, user);
            this.f121289C0.m137019l(this.f121285A0);
        }
    }

    /* JADX INFO: renamed from: B6 */
    public C22421c<List<Group>> m145482B6(final String str, String str2) {
        return scheduled(str2, 0, new pcj() { // from class: l.gia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104210a.m145758o8(str);
            }
        });
    }

    /* JADX INFO: renamed from: B7 */
    public C22421c<Envelope> m145483B7(String str) {
        final String strM117246k = dog.m117246k("/groups/" + str);
        return scheduled("getGroupDetailByGroupId" + str, -1, new pcj() { // from class: l.tha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f174285a.m145710h9(strM117246k);
            }
        });
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m145484B8(RawFeed rawFeed) {
        if (rawFeed.type.equals("live")) {
            this.f121364l1.remove(rawFeed.f40091id);
        } else if (rawFeed.type.equals(BLiveType.voiceLive)) {
            this.f121372p1.remove(rawFeed.f40091id);
        } else if (rawFeed.type.equals("liveCircleMomentBanner")) {
            this.f121376r1.remove(rawFeed.f40091id);
        }
    }

    /* JADX INFO: renamed from: B9 */
    public final /* synthetic */ C22421c m145485B9(final String str, final String str2) {
        return qi20.m176654a(new pcj() { // from class: l.h9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.i9a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f113454a.m145477A9(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ba */
    public final /* synthetic */ Boolean m145486Ba(String str, Moment moment) {
        return Boolean.valueOf(m145181Db(str));
    }

    /* JADX INFO: renamed from: Bb */
    public final /* synthetic */ pf60 m145487Bb(Envelope envelope) {
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        return new pf60(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).users);
    }

    /* JADX INFO: renamed from: Bc */
    public C22421c<uxj0> m145488Bc(final Moment moment, final boolean z, final boolean z2) {
        final String strUserId = FeedModule.m61405F().userId();
        m145843zd(z, 0, moment);
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("everyone");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        if (TEnum.equals(moment.allowForward, "unknown_")) {
            moment.allowForward = null;
        }
        pcj pcjVar = new pcj() { // from class: l.p8a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f151000a.m145781ra(moment, z);
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.r8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161678a.m145809va(strUserId, z, moment, (Moment) obj);
            }
        };
        final y20<Throwable> y20Var = new y20() { // from class: l.s8a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166756a.m145816wa(strUserId, z, moment, (Throwable) obj);
            }
        };
        final qcj qcjVar2 = new qcj() { // from class: l.t8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172509a.m145840za(z2, moment, z, y20Var, (Moment) obj);
            }
        };
        return now(((C22421c) pcjVar.call()).compose(psd0.m173606Q()).filter(new qcj() { // from class: l.u8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177996a.m145478Aa(strUserId, (Moment) obj);
            }
        }).flatMap(new qcj() { // from class: l.v8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145341e4(qcjVar, (Moment) obj);
            }
        }).filter(new qcj() { // from class: l.w8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187838a.m145486Ba(strUserId, (Moment) obj);
            }
        }).compose(TrackMediaUploadUtil.m81489f0("moment", moment.media, new qcj() { // from class: l.x8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145359h4((Moment) obj);
            }
        })).doOnError(y20Var).filter(new qcj() { // from class: l.y8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f197957a.m145494Ca(strUserId, (Moment) obj);
            }
        }).flatMap(new qcj() { // from class: l.z8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145165B2(qcjVar2, (Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Bd */
    public void m145489Bd(String str) {
        User userM145688e8 = m145688e8(str);
        if (NullChecker.m82486a(userM145688e8.localFollowship)) {
            if (TEnum.equals(userM145688e8.localFollowship.state, "matched") || TEnum.equals(userM145688e8.localFollowship.state, FollowshipStatus.following)) {
                boolean zEquals = TEnum.equals(userM145688e8.localFollowship.state, "matched");
                Followship followship = userM145688e8.localFollowship;
                if (zEquals) {
                    followship.state = FollowshipStatus.get(FollowshipStatus.followed);
                } else if (TEnum.equals(followship.state, FollowshipStatus.following)) {
                    userM145688e8.localFollowship.state = FollowshipStatus.get("default");
                }
                this.f121285A0.put(userM145688e8.f56859id, userM145688e8);
                this.f121289C0.m137019l(this.f121285A0);
                this.f121322Q0.m137019l(new pf60<>(userM145688e8, Boolean.FALSE));
            }
        }
    }

    /* JADX INFO: renamed from: C6 */
    public Moment m145490C6(Live live) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56859id = live.f39615id;
        momentNew_.isLive = true;
        momentNew_.live = live;
        LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(live);
        if (fromLive == null || !fromLive.isMultiCallType() || TextUtils.isEmpty(fromLive.momentOwner.f39651id)) {
            momentNew_.owner = live.anchor.f39651id;
            return momentNew_;
        }
        momentNew_.owner = fromLive.momentOwner.f39651id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: C7 */
    public C22421c<Envelope> m145491C7(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(dog.m117246k("/groups/" + str + "/users?search=recommend&with=users,followships,relationships"));
        if (i > 0) {
            sb.append("&limit=");
            sb.append(i);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&");
            sb.append(str2);
        }
        final String string = sb.toString();
        return scheduled("getGroupFriendEnvByGroupId" + str, 0, new pcj() { // from class: l.iba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.vda
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.wda
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return jka.m145469z1((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ Boolean m145492C8(RawFeed rawFeed) {
        return Boolean.valueOf((rawFeed.type.equals("live") && this.f121364l1.get(rawFeed.f40091id) != null) || (rawFeed.type.equals(BLiveType.voiceLive) && this.f121372p1.get(rawFeed.f40091id) != null));
    }

    /* JADX INFO: renamed from: C9 */
    public final /* synthetic */ pf60 m145493C9(Envelope envelope) {
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        ArrayList arrayListM147507f0 = jyb.m147507f0(new ViewersBox[0]);
        MomentViewerBox momentViewerBox = ((FeedData) envelope.getModuleData(FeedData.class)).momentViewer;
        if (momentViewerBox != null && !jyb.m147479J(momentViewerBox.viewers)) {
            arrayListM147507f0.addAll(momentViewerBox.viewers);
        }
        return new pf60(envelope.pagination.links, arrayListM147507f0);
    }

    /* JADX INFO: renamed from: Ca */
    public final /* synthetic */ Boolean m145494Ca(String str, Moment moment) {
        return Boolean.valueOf(m145181Db(str));
    }

    /* JADX INFO: renamed from: Cb */
    public final /* synthetic */ C22421c m145495Cb(final String str) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.nia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }, dog.f89926D).compose(dog.m117253n0()).map(new qcj() { // from class: l.oia
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147518a.m145487Bb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Cc */
    public C22421c<uxj0> m145496Cc(final Moment moment) {
        final String strUserId = FeedModule.m61405F().userId();
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("everyone");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        if (TEnum.equals(moment.allowForward, "unknown_")) {
            moment.allowForward = null;
        }
        pcj pcjVar = new pcj() { // from class: l.xga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f194162a.m145523Ga(moment);
            }
        };
        final y20<Throwable> y20Var = new y20() { // from class: l.yga
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199743a.m145530Ha(strUserId, moment, (Throwable) obj);
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.zga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204281a.m145551Ka(moment, y20Var, (Moment) obj);
            }
        };
        return now(((C22421c) pcjVar.call()).compose(psd0.m173606Q()).filter(new qcj() { // from class: l.aha
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71332a.m145558La(strUserId, (Moment) obj);
            }
        }).doOnError(y20Var).filter(new qcj() { // from class: l.bha
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76740a.m145565Ma(strUserId, (Moment) obj);
            }
        }).flatMap(new qcj() { // from class: l.cha
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145164B1(qcjVar, (Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Cd */
    public C22421c<pf60<Links, List<User>>> m145497Cd(final String str, String str2) {
        return scheduled(str2, 0, new pcj() { // from class: l.dia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f88596a.m145495Cb(str);
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public Moment m145498D6(LiveCircleBanner liveCircleBanner) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56859id = liveCircleBanner.f40072id;
        momentNew_.liveCircleBanner = liveCircleBanner;
        return momentNew_;
    }

    /* JADX INFO: renamed from: D7 */
    public C22421c<bkj0<List<Group>, List<User>, Links>> m145499D7(String str, int i, String str2) {
        return m145491C7(str, i, str2).map(new qcj() { // from class: l.eka
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f94349a.m145717i9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ void m145500D8(Map map, List list, Map map2, Map map3, final HashMap map4, Envelope envelope, RawFeed rawFeed) {
        LiveCircleBanner liveCircleBanner;
        if ("moment".equals(rawFeed.type) && NullChecker.m82486a(map.get(rawFeed.f40091id))) {
            Moment moment = (Moment) map.get(rawFeed.f40091id);
            double d = rawFeed.recommendTime;
            if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                moment.setRecommendTime(d);
            }
            moment.setActivityName(rawFeed.activityName);
            moment.setLocationName(rawFeed.locationName);
            if (!TextUtils.isEmpty(rawFeed.recommendReason)) {
                moment.setRecommendReason(rawFeed.recommendReason);
            }
            if (!TextUtils.isEmpty(rawFeed.recommendReasonIcon)) {
                moment.setRecommendReasonIcon(rawFeed.recommendReasonIcon);
            }
            if (!TextUtils.isEmpty(rawFeed.recommendReasonBackgroundColor)) {
                moment.setRecommendReasonBackgroundColor(rawFeed.recommendReasonBackgroundColor);
            }
            if (!TextUtils.isEmpty(rawFeed.recommendReasonFontColor)) {
                moment.setRecommendReasonFontColor(rawFeed.recommendReasonFontColor);
            }
            if (ksg.m151191Z(moment) && !map.containsKey(moment.thirdShareSource.sourceId)) {
                m145784rd(moment.thirdShareSource.sourceId);
            }
            if (this.f121374q1.get(moment.f56859id) != null) {
                moment.liveCircleExtInfo = this.f121374q1.get(moment.f56859id);
            }
            list.add(moment);
            return;
        }
        if ("liveRecommendCard".equals(rawFeed.type)) {
            LiveRecommendCard liveRecommendCard = (LiveRecommendCard) map2.get(rawFeed.f40091id);
            if (NullChecker.m82486a(liveRecommendCard)) {
                list.add(m145505E6(liveRecommendCard));
                return;
            }
            return;
        }
        if ("live".equals(rawFeed.type)) {
            Live live = this.f121364l1.get(rawFeed.f40091id);
            Moment momentM145490C6 = m145490C6(live);
            if (NullChecker.m82486a(map3.get(live.room.f39651id))) {
                momentM145490C6.value = ((Room) map3.get(live.room.f39651id)).title;
                momentM145490C6.liveRoom = (Room) map3.get(live.room.f39651id);
            }
            list.add(momentM145490C6);
            return;
        }
        if (!BLiveType.voiceLive.equals(rawFeed.type)) {
            if (!"liveCircleMomentBanner".equals(rawFeed.type) || ((FeedData) envelope.getModuleData(FeedData.class)).liveGroupCircleMomentBanners.size() <= 0 || (liveCircleBanner = this.f121376r1.get(rawFeed.f40091id)) == null) {
                return;
            }
            list.add(m145498D6(liveCircleBanner));
            return;
        }
        VoiceLiveMomentFeed voiceLiveMomentFeed = this.f121372p1.get(rawFeed.f40091id);
        if (NullChecker.m82486a(voiceLiveMomentFeed)) {
            VoiceLive voiceLive = this.f121366m1.get(voiceLiveMomentFeed.liveId);
            final HashMap map5 = new HashMap();
            jyb.m147537z(voiceLive.callInfo.onVoiceCalls, new y20() { // from class: l.jea
                @Override // p153l.y20
                public final void call(Object obj) {
                    jka.m145330c5(map4, map5, (OnVoiceCall) obj);
                }
            });
            voiceLive.masksMap = map5;
            VoiceRoomInfo voiceRoomInfo = this.f121368n1.get(voiceLive.room.f39651id);
            if (NullChecker.m82486a(voiceRoomInfo)) {
                voiceLive.voiceRoomInfo = voiceRoomInfo;
            }
            voiceLive.voiceLiveGame = this.f121370o1.get(voiceLive.f40098id);
            voiceLiveMomentFeed.voiceLive = voiceLive;
            list.add(m145512F6(voiceLiveMomentFeed));
        }
    }

    /* JADX INFO: renamed from: D9 */
    public final /* synthetic */ C22421c m145501D9(String str, String str2, String str3) {
        final String strM117246k;
        if (TextUtils.isEmpty(str)) {
            strM117246k = dog.m117246k("/users/" + str2 + "/moments/" + str3 + "/viewers?with=users&limit=20");
        } else {
            strM117246k = dog.m117246k("/users/" + str2 + "/moments/" + str3 + "/viewers?with=users&limit=20&" + str);
        }
        return new ti20(new pcj() { // from class: l.jga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(strM117246k).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.kga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126592a.m145493C9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Da */
    public final /* synthetic */ void m145502Da(Moment moment) {
        m145509Ea(moment);
        this.f121373q0.m137019l(moment);
    }

    /* JADX INFO: renamed from: Dc */
    public C22421c<uxj0> m145503Dc(final String str, final String str2, final String str3, final int i) {
        final pcj pcjVar = new pcj() { // from class: l.waa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117241h0(str, str2, str3)).m209039m(z1d0.create(Network.JSON, "")).m209028b();
            }
        };
        return scheduled("postVote", -1, new pcj() { // from class: l.xaa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f192998a.m145579Oa(pcjVar, str2, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: Dd */
    public C22421c<Envelope> m145504Dd(boolean z) {
        String str = z ? "show" : "reject";
        final String strM117246k = dog.m117246k("/voice-nearby-feedback?type=".concat(str));
        return scheduled("VoiceFeedBack".concat(str), -1, new pcj() { // from class: l.jda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.pfa
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, "")).m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public Moment m145505E6(LiveRecommendCard liveRecommendCard) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56859id = liveRecommendCard.f40076id;
        momentNew_.isLive = true;
        momentNew_.liveRecommendCard = liveRecommendCard;
        return momentNew_;
    }

    /* JADX INFO: renamed from: E7 */
    public C22421c<uxj0> m145506E7() {
        return scheduled("get_guide_state_post_config", 0, new pcj() { // from class: l.j9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118859a.m145731k9();
            }
        });
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ TopicMoment m145507E8(Envelope envelope) {
        m145791sd(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        if (feedData == null || jyb.m147479J(feedData.momentTopics)) {
            return null;
        }
        return feedData.momentTopics.get(0);
    }

    /* JADX INFO: renamed from: E9 */
    public final /* synthetic */ uxj0 m145508E9(boolean z, Envelope envelope) {
        FeedModule.f39707h.followConfigSub.m137019l(((FeedData) envelope.getModuleData(FeedData.class)).extra);
        FeedModule.f39707h.followConfig = ((FeedData) envelope.getModuleData(FeedData.class)).extra;
        owi.f149482a.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.bindPhone));
        ksg.m151163E0(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.momentMedia.audio));
        this.f121337Y.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.liveShowFollowButton));
        owi.f149483b.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.feedDefaultPage);
        if (j4h.m143417a() || cmg.m111245y()) {
            owi.f149484c.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.feedShowAccostButton));
        } else {
            owi.f149484c.put(Boolean.TRUE);
        }
        owi.f149485d.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.topicH5RedirectURL);
        owi.f149488g.put(JSON.toJSONString(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateEmotion));
        this.f121339Z.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.showPopWindow));
        this.f121343b0.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.defaultSyncMoment));
        owi.f149486e.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.showAudit.moment));
        owi.f149487f.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.showAudit.comment));
        owi.f149489h.put(JSON.toJSONString(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateGuide));
        if (z) {
            owi.f149493l.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.defaultTab);
        }
        owi.f149494m.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.activityShowReadButton));
        ymg.m216676f().m216688n(((FeedData) envelope.getModuleData(FeedData.class)).extra.explorePostBubble);
        owi.f149495n.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateWindow.title);
        owi.f149496o.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateWindow.subTitle);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Eb */
    public C22421c<uxj0> m145510Eb(final String str, final String str2, final String str3, final boolean z) {
        return scheduled("/moments/" + str2 + "/messages/" + str3 + "/likes/me", -1, new pcj() { // from class: l.hda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.yea
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return jka.m145350g1(str, str, str, z);
                    }
                }).compose(psd0.m173592C()).map(new qcj() { // from class: l.zea
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Ec */
    public C22421c<pf60<Links, List<Moment>>> m145511Ec(jv00 jv00Var) {
        return m145664ac(dog.m117227a0("limit=20&query=preload"), "friends/previous/preload", false, null, jv00Var);
    }

    /* JADX INFO: renamed from: F6 */
    public Moment m145512F6(VoiceLiveMomentFeed voiceLiveMomentFeed) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56859id = voiceLiveMomentFeed.f40099id;
        momentNew_.isVoiceLive = true;
        VoiceLive voiceLive = voiceLiveMomentFeed.voiceLive;
        momentNew_.voiceLive = voiceLive;
        momentNew_.headImage = voiceLiveMomentFeed.image;
        momentNew_.owner = voiceLive.anchor.f39651id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: F7 */
    public C22507a<Double> m145513F7() {
        return this.f121356h1;
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ C22421c m145514F8(final String str) {
        return new ti20(new pcj() { // from class: l.gfa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117246k("/topics")).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.hfa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f109265a.m145507E8((Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.ifa
            @Override // p153l.y20
            public final void call(Object obj) {
                i4h.m138538g((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F9 */
    public final /* synthetic */ C22421c m145515F9(final boolean z) {
        return new ti20(new pcj() { // from class: l.pha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jka.m145197G3(z);
            }
        }).map(new qcj() { // from class: l.qha
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157522a.m145508E9(z, (Envelope) obj);
            }
        }).compose(dog.m117253n0());
    }

    /* JADX INFO: renamed from: Fa */
    public final /* synthetic */ Moment m145516Fa(final Moment moment) throws Exception {
        if (!TextUtils.isEmpty(moment.f56859id)) {
            final Moment momentMo225055clone = moment.mo225055clone();
            momentMo225055clone.localCreatedSession = App.f16092i.get().intValue();
            l9c.m153394o().m153397B(new x20() { // from class: l.x9a
                @Override // p153l.x20
                public final void call() {
                    FeedModule.f39708i.f160257c.updateBy_id(momentMo225055clone);
                }
            });
            l51.m152893M(new Runnable() { // from class: l.iaa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113568a.m145509Ea(momentMo225055clone);
                }
            });
            return momentMo225055clone;
        }
        moment.createdTime = dog.m117260r0();
        moment.owner = FeedModule.m61405F().userId();
        if (moment.value == null) {
            moment.value = "";
        }
        moment.likes = PartialIdList.new_();
        moment.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
        if (TEnum.equals(moment.userSetVisibility, "unknown_")) {
            moment.userSetVisibility = UserSetVisibility.get(nt00.m164664k().m164673p(moment));
        }
        moment.media = new ArrayList();
        l9c.m153394o().m153397B(new x20() { // from class: l.b9a
            @Override // p153l.x20
            public final void call() {
                jka.m145279U1(moment);
            }
        });
        l51.m152893M(new Runnable() { // from class: l.m9a
            @Override // java.lang.Runnable
            public final void run() {
                this.f135361a.m145502Da(moment);
            }
        });
        return moment;
    }

    /* JADX INFO: renamed from: Fb */
    public C22421c<Envelope> m145517Fb(String str, String str2, boolean z, String str3) {
        return m145524Gb(str, str2, z, str3, 0);
    }

    /* JADX INFO: renamed from: Fc */
    public C22421c<pf60<Links, List<Moment>>> m145518Fc(jv00 jv00Var) {
        return m145664ac(dog.m117229b0("limit=20", "recommend"), "liked/previous", false, null, jv00Var);
    }

    /* JADX INFO: renamed from: G6 */
    public Moment m145519G6(pbi pbiVar) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56859id = "";
        momentNew_.feedVoiceUserEntryInfo = pbiVar;
        return momentNew_;
    }

    /* JADX INFO: renamed from: G7 */
    public C22421c<pf60<FeedLiterature, FeedLiteraturesComment>> m145520G7(String str) {
        final String str2 = "/literature/" + str + "?user_id=" + FeedModule.m61405F().userId();
        return scheduled(str2, 0, new pcj() { // from class: l.eca
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f93023a.m145745m9(str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ Notification m145521G8(Moment moment, Notification notification) {
        if (!notification.m222546k() && (!notification.m222545j() || !(notification.m222540e() instanceof ApiExcep.Client.NotFound))) {
            return notification;
        }
        mrb0.m159636N(FeedModule.m61405F().userId(), false);
        this.f121371p0.m137019l(moment);
        m145784rd(moment.f56859id);
        return Notification.m222538c(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: G9 */
    public final /* synthetic */ Envelope m145522G9(String str, String str2, boolean z, int i, Envelope envelope) {
        if (cmg.m111191S() && NullChecker.m82486a(envelope) && envelope.meta.code == 20101) {
            User userM145688e8 = m145688e8(str);
            if (NullChecker.m82486a(userM145688e8)) {
                Relationship relationshipNew_ = userM145688e8.localRelationship;
                if (relationshipNew_ == null) {
                    relationshipNew_ = Relationship.new_();
                }
                if (userM145688e8.letter() || userM145688e8.likedMe() || TEnum.equals(relationshipNew_.state, "blocked") || ((NullChecker.m82486a(relationshipNew_.relationshipExtensions) && TEnum.equals(relationshipNew_.relationshipExtensions.otherRelationType, RelationshipStatus.LIKED)) || (NullChecker.m82486a(relationshipNew_.relationshipExtensions) && TEnum.equals(relationshipNew_.relationshipExtensions.otherRelationType, "liked")))) {
                    relationshipNew_.state = RelationshipStatus.get("matched");
                    userM145688e8.localRelationship = relationshipNew_;
                    m145481Ad(userM145688e8);
                } else {
                    relationshipNew_.state = RelationshipStatus.get("liked");
                    userM145688e8.localRelationship = relationshipNew_;
                    m145481Ad(userM145688e8);
                    m145553Kc(relationshipNew_, userM145688e8, true, false);
                }
            }
            this.f121392z1.m137019l(str2);
        }
        Moment moment = this.f121357i0.get(str2);
        if (moment == null) {
            return envelope;
        }
        boolean z2 = moment.haveLiked;
        if (z2 && !z) {
            if (moment.attitudeId > 0) {
                moment.attitudes.count--;
                moment.attitudeId = 0;
            }
            PartialIdList partialIdList = moment.likes;
            partialIdList.count--;
            partialIdList.ids = jyb.m147501c0(partialIdList.ids, FeedModule.m61405F().userId());
        } else if (!z2 && z) {
            if (i > 0) {
                moment.attitudeId = i;
                moment.attitudes.count++;
            }
            PartialIdList partialIdList2 = moment.likes;
            partialIdList2.count++;
            partialIdList2.ids = jyb.m147500c(partialIdList2.ids, FeedModule.m61405F().userId());
        } else if (z2 && z && i > 0) {
            if (moment.attitudeId <= 0) {
                moment.attitudes.count++;
            }
            moment.attitudeId = i;
        }
        moment.haveLiked = z;
        this.f121357i0.put(str2, moment);
        f121282L1 = jyb.m147494Y(moment.f56859id, 0);
        this.f121363l0.m137019l(this.f121357i0);
        if (z) {
            mrb0.m159641S(envelope);
        }
        FeedModule.f39707h.m112654A0(moment);
        return envelope;
    }

    /* JADX INFO: renamed from: Ga */
    public final /* synthetic */ C22421c m145523Ga(final Moment moment) {
        return C22421c.fromCallable(new Callable() { // from class: l.dha
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f88429a.m145516Fa(moment);
            }
        });
    }

    /* JADX INFO: renamed from: Gb */
    public C22421c<Envelope> m145524Gb(final String str, final String str2, final boolean z, final String str3, final int i) {
        final JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("attitudeId", i);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        return scheduled("/moments/" + str2 + "/likes/me", -1, new pcj() { // from class: l.xia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f194442a.m145529H9(str, str2, str3, z, jSONObject, i);
            }
        });
    }

    /* JADX INFO: renamed from: Gc */
    public C22421c<pf60<Links, List<Moment>>> m145525Gc(jv00 jv00Var) {
        return m145664ac(dog.m117233d0("limit=20&query=preload"), "preload/nearby/previous", false, null, jv00Var);
    }

    /* JADX INFO: renamed from: H6 */
    public Moment m145526H6(ftn0.C17070a c17070a) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56859id = "";
        momentNew_.voiceLiveApiInfo = c17070a;
        return momentNew_;
    }

    /* JADX INFO: renamed from: H7 */
    public final String m145527H7() {
        return "/live-circle-moments";
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ C22421c m145528H8(final Moment moment) {
        return new ti20(new pcj() { // from class: l.qja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117265v(moment.f56859id)).m209030d().m209028b();
            }
        }).materialize().compose(dog.m117253n0()).map(new qcj() { // from class: l.rja
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163437a.m145521G8(moment, (Notification) obj);
            }
        }).dematerialize().take(1);
    }

    /* JADX INFO: renamed from: H9 */
    public final /* synthetic */ C22421c m145529H9(final String str, final String str2, final String str3, final boolean z, final JSONObject jSONObject, final int i) {
        return new ti20(new pcj() { // from class: l.rba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jka.m145213J1(str, str2, str3, z, jSONObject);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.sba
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167120a.m145522G9(str, str2, z, i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ha */
    public final /* synthetic */ void m145530Ha(String str, Moment moment, final Throwable th) {
        MomentPostFailedExcepion.reportMomentPostFailed(th, true);
        i4g0.m138493B("e_post_moment_error", "post_error_feed_moments", jyb.m147494Y("error", th == null ? CardButtonsShowAndHideType.unknow : th.toString()));
        if (m145181Db(str)) {
            Moment momentMo225055clone = this.f121357i0.get(moment.f56859id).mo225055clone();
            momentMo225055clone.localCreatedSession--;
            m145819wd(momentMo225055clone);
            m145509Ea(momentMo225055clone);
            l51.m152893M(new Runnable() { // from class: l.hha
                @Override // java.lang.Runnable
                public final void run() {
                    bsj0.m106246D(th);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Hb */
    public C22421c<Envelope> m145531Hb(final String str, final String str2, final boolean z) {
        final String strM117246k = dog.m117246k(String.format("/users/%s/states/%s/likes/me", str2, str));
        return scheduled("likeState", -1, new pcj() { // from class: l.yia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f200052a.m145550K9(strM117246k, z, str2, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Hc */
    public void m145532Hc(User user) {
        if (user.localFollowship == null) {
            user.localFollowship = new Followship();
        }
        if (!TEnum.equals(user.localFollowship.state, "matched")) {
            if (!TEnum.equals(user.localFollowship.state, FollowshipStatus.following)) {
                user.profile.followships.counters.followers++;
            }
            user.localFollowship.state = FollowshipStatus.get("matched");
        }
        jxd0 jxd0Var = PhotoAlbumFeedAct.f42469e;
        if (!jxd0Var.get().booleanValue() && !m145737l8()) {
            o1j0.m165649w(R$string.f39772K2);
            jxd0Var.put(Boolean.TRUE);
        }
        this.f121285A0.put(user.f56859id, user);
        this.f121289C0.m137019l(this.f121285A0);
        this.f121322Q0.m137019l(new pf60<>(user, Boolean.TRUE));
        mrb0.m159636N(FeedModule.m61405F().userId(), false);
    }

    /* JADX INFO: renamed from: I6 */
    public C22421c<uxj0> m145533I6(final String str, final String str2, final String str3) {
        final pcj pcjVar = new pcj() { // from class: l.lda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(dog.m117241h0(str, str2, str3)).m209030d().m209028b();
            }
        };
        return scheduled("cancelVote", -1, new pcj() { // from class: l.mda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.ffa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: I7 */
    public BubbleInfo m145534I7() {
        return this.f121358i1.m222761e().get(FeedModule.m61406H().me_().f56859id);
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ Envelope m145535I8(Envelope envelope) {
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: I9 */
    public final /* synthetic */ void m145536I9(String str, String str2, ConversationStatus conversationStatus) {
        if (TEnum.equals(conversationStatus, "default")) {
            FeedModule.m61406H().mo31753ci(str, str2, "", true);
            return;
        }
        if (TEnum.equals(conversationStatus, "deleted") || TEnum.equals(conversationStatus, "blocked")) {
            this.f121380t1.m137019l(Boolean.TRUE);
            o1j0.m165636j("配对已解除");
        } else {
            this.f121380t1.m137019l(Boolean.TRUE);
            o1j0.m165636j("对方账号异常");
        }
    }

    /* JADX INFO: renamed from: Ia */
    public final /* synthetic */ uxj0 m145537Ia(Moment moment, Moment moment2, Envelope envelope) {
        Moment moment3 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        this.f121357i0.remove(moment.f56859id);
        if (moment.f56859id.startsWith("fake_id_")) {
            this.f121328T0.remove(moment.f56859id);
        }
        m145791sd(envelope);
        this.f121375r0.m137019l(moment2);
        this.f121357i0.put(moment3.f56859id, moment3);
        this.f121373q0.m137019l(moment3);
        mrb0.m159636N(FeedModule.m61405F().userId(), false);
        mrb0.m159641S(envelope);
        moment.f56859id = moment3.f56859id;
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Ib */
    public C22421c<uxj0> m145538Ib(final String str, final String str2, final String str3, final boolean z) {
        return scheduled("/topics/" + str2 + "/comments/" + str3 + "/likes/me", -1, new pcj() { // from class: l.jca
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.wea
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return jka.m145301X5(str, str, str, z);
                    }
                }).compose(psd0.m173592C()).map(new qcj() { // from class: l.xea
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Ic */
    public void m145539Ic(User user, boolean z) {
        m145546Jc(user, z, null);
    }

    /* JADX INFO: renamed from: J6 */
    public synchronized void m145540J6() {
        synchronized (jka.class) {
            if (jyb.m147479J(this.f121295F0)) {
                return;
            }
            ArrayList arrayListM147507f0 = jyb.m147507f0(new String[0]);
            for (int i = 0; i < this.f121295F0.size(); i++) {
                Moment momentM145813w7 = m145813w7(this.f121295F0.get(i));
                if (momentM145813w7 != null && momentM145813w7.momentViewTime != -1 && pzi0.m174454o() - momentM145813w7.momentViewTime >= this.f121297G0 * 1000 && !this.f121291D0.contains(momentM145813w7.f56859id)) {
                    arrayListM147507f0.add(this.f121295F0.get(i));
                }
            }
            if (!jyb.m147479J(arrayListM147507f0)) {
                this.f121295F0.clear();
                m145776qc(arrayListM147507f0);
            }
        }
    }

    /* JADX INFO: renamed from: J7 */
    public C22421c<Envelope> m145541J7() {
        final String strM117246k = dog.m117246k("/users/" + FeedModule.m61406H().me_().f56859id + "/states");
        return scheduled("getMineStateObs", 0, new pcj() { // from class: l.sia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f168810a.m145759o9(strM117246k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ C22421c m145542J8(final String str) {
        return new ti20(new pcj() { // from class: l.tba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117246k("/activity-users/" + str)).m209030d().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.uba
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178296a.m145535I8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J9 */
    public final /* synthetic */ Envelope m145543J9(boolean z, final String str, final String str2, Envelope envelope) {
        if (envelope == null) {
            this.f121380t1.m137019l(Boolean.TRUE);
            return Envelope.new_();
        }
        m145791sd(envelope);
        if (!z) {
            FeedModule.m61406H().mo31747ab(str).first().subscribe(psd0.m173596G(new y20() { // from class: l.zda
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203862a.m145536I9(str, str2, (ConversationStatus) obj);
                }
            }));
        }
        return envelope;
    }

    /* JADX INFO: renamed from: Ja */
    public final /* synthetic */ C22421c m145544Ja(final Moment moment, final Moment moment2, y20 y20Var) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.taa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117268y()).m209038l(z1d0.create(Network.JSON, moment.toJson())).m209028b();
            }
        }, dog.f89927E).map(new qcj() { // from class: l.eba
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145411q2(moment2, (Envelope) obj);
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.pba
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151361a.m145537Ia(moment2, moment, (Envelope) obj);
            }
        }).doOnError(y20Var);
    }

    /* JADX INFO: renamed from: Jb */
    public C22421c<pf60<Links, List<Moment>>> m145545Jb(Links links, jv00 jv00Var) {
        return m145650Yb(dog.m117229b0(links.next, this.f121298G1), "like/next", jv00Var);
    }

    /* JADX INFO: renamed from: Jc */
    public void m145546Jc(final User user, boolean z, @Nullable MatchScData matchScData) {
        if (user.localFollowship == null) {
            user.localFollowship = new Followship();
        }
        FollowshipStatus followshipStatus = user.localFollowship.state;
        String str = FollowshipStatus.followed;
        if (TEnum.equals(followshipStatus, FollowshipStatus.followed) || TEnum.equals(user.localFollowship.state, "matched")) {
            Followship followship = user.localFollowship;
            if (z) {
                str = "matched";
            }
            followship.state = FollowshipStatus.get(str);
            mrb0.m159631I();
            if (TEnum.equals(user.localFollowship.state, "matched")) {
                jxd0 jxd0Var = PhotoAlbumFeedAct.f42469e;
                if (!jxd0Var.get().booleanValue() && !m145737l8()) {
                    o1j0.m165649w(R$string.f39772K2);
                    jxd0Var.put(Boolean.TRUE);
                }
                if (NullChecker.m82486a(matchScData)) {
                    q4f q4fVar = new q4f();
                    q4fVar.f155581s = MatchScData.MID;
                    q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
                    q4fVar.f155576n = matchScData.pageId;
                    i4g0.m138516n(q4fVar, matchScData.toTrackParamMap());
                }
            } else {
                Relationship relationship = user.localRelationship;
                if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
                    l51.m152919y(new Runnable() { // from class: l.afa
                        @Override // java.lang.Runnable
                        public final void run() {
                            mrb0.m159658l(user);
                        }
                    });
                }
            }
        } else {
            user.localFollowship.state = FollowshipStatus.get(z ? FollowshipStatus.following : "default");
        }
        Profile profile = user.profile;
        if (z) {
            profile.followships.counters.followers++;
        } else {
            FollowshipCounter followshipCounter = profile.followships.counters;
            int i = followshipCounter.followers;
            if (i > 0) {
                followshipCounter.followers = i - 1;
            }
        }
        this.f121285A0.put(user.f56859id, user);
        this.f121289C0.m137019l(this.f121285A0);
        this.f121322Q0.m137019l(new pf60<>(user, Boolean.valueOf(z)));
        mrb0.m159636N(FeedModule.m61405F().userId(), false);
        if (j4h.m143419c()) {
            mrb0.m159636N(user.f56859id, false);
        }
    }

    /* JADX INFO: renamed from: K6 */
    public final List<String> m145547K6(List<String> list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (NullChecker.m82486a(list.get(i)) && !this.f121291D0.contains(list.get(i))) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K7 */
    public C22507a<Map<String, BubbleInfo>> m145548K7() {
        return this.f121358i1;
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ Envelope m145549K8(Envelope envelope) {
        if (envelope == null) {
            this.f121380t1.m137019l(Boolean.TRUE);
            return Envelope.new_();
        }
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: K9 */
    public final /* synthetic */ C22421c m145550K9(final String str, final boolean z, final String str2, final String str3) {
        return qi20.m176654a(new pcj() { // from class: l.fba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209039m(z1d0.create(Network.JSON, "")).m209028b();
            }
        }).map(new qcj() { // from class: l.gba
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f103066a.m145543J9(z, str2, str3, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ka */
    public final /* synthetic */ C22421c m145551Ka(final Moment moment, final y20 y20Var, final Moment moment2) {
        return scheduled("postTheMoment", -1, new pcj() { // from class: l.gha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104084a.m145544Ja(moment2, moment, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: Kb */
    public C22421c<pf60<Links, List<Moment>>> m145552Kb(jv00 jv00Var) {
        return m145664ac(dog.m117229b0(cch.m108707b() ? "limit=10" : "limit=20", this.f121298G1), "liked/previous", false, null, jv00Var);
    }

    /* JADX INFO: renamed from: Kc */
    public void m145553Kc(Relationship relationship, User user, boolean z, boolean z2) {
        if (relationship != null && jyb.m147479J(relationship.status)) {
            relationship.status = new ArrayList();
        }
        user.localRelationship = relationship;
        this.f121285A0.put(user.f56859id, user);
        this.f121289C0.m137019l(this.f121285A0);
        this.f121326S0.m137019l(new pf60<>(user, Boolean.valueOf(z)));
    }

    @Deprecated
    /* JADX INFO: renamed from: L6 */
    public C22421c<uxj0> m145554L6(final MomentMessage momentMessage) {
        if (!TEnum.equals(momentMessage.status(), "failed")) {
            return scheduled("commentDelete", -1, new pcj() { // from class: l.uea
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f178642a.m145772q8(momentMessage);
                }
            });
        }
        this.f121309K0.m137019l(momentMessage);
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: L7 */
    public MomentVoiceLiveInfos m145555L7(String str) {
        return this.f121355h0.get(str);
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ C22421c m145556L8(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.z9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209030d().m209028b();
            }
        }).map(new qcj() { // from class: l.aaa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f69112a.m145549K8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L9 */
    public final /* synthetic */ pf60 m145557L9(String str, Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(feedData.messages);
        for (int i = 0; i < arrayList.size(); i++) {
            ((MomentMessage) arrayList.get(i)).moment = str;
        }
        m145798td(envelope, false);
        return new pf60(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: La */
    public final /* synthetic */ Boolean m145558La(String str, Moment moment) {
        return Boolean.valueOf(m145181Db(str));
    }

    /* JADX INFO: renamed from: Lb */
    public C22421c<pf60<Links, List<Moment>>> m145559Lb(Links links) {
        return m145650Yb(dog.m117258q(links.next), m145527H7() + "next", null);
    }

    /* JADX INFO: renamed from: Lc */
    public final void m145560Lc(List<TopicMoment> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new Comparator() { // from class: l.d9a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jka.m145179D4((TopicMoment) obj, (TopicMoment) obj2);
            }
        });
        double d = ((TopicMoment) arrayList.get(0)).createdTime;
        if (d > this.f121362k1.get().doubleValue()) {
            this.f121356h1.m137019l(Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: M6 */
    public C22421c<bkj0<Links, List<MomentMessage>, List<StickerInfo>>> m145561M6(final String str, final String str2, final Links links) {
        return scheduled("moments/" + str2 + "/comments/next", 0, new pcj() { // from class: l.baa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f75655a.m145786s8(str, str2, links);
            }
        });
    }

    /* JADX INFO: renamed from: M7 */
    public C22421c<List<LiveMultiCallLiveSchema>> m145562M7(String str) {
        final rnl.C19886a c19886aM182288p = rnl.m182263l(dog.m117246k("/live-schemas")).m182288p();
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c(FirebaseAnalytics.Event.SEARCH, str);
        }
        return scheduled("getMultiCallLiveSchema", 0, new pcj() { // from class: l.kda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.mfa
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209045s(c19886a.m182301d()).m209032f().m209028b();
                    }
                }).compose(dog.m117253n0()).map(new qcj() { // from class: l.nfa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).liveSchemas;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ Envelope m145563M8(Moment moment, Envelope envelope) {
        Moment moment2 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        this.f121357i0.put(moment2.f56859id, moment2);
        mrb0.m159636N(FeedModule.m61405F().userId(), false);
        mrb0.m159641S(envelope);
        moment.f56859id = moment2.f56859id;
        if (ksg.m151191Z(moment2)) {
            this.f121369o0.m137019l(moment2);
            return envelope;
        }
        this.f121367n0.m137019l(moment2);
        return envelope;
    }

    /* JADX INFO: renamed from: M9 */
    public final /* synthetic */ C22421c m145564M9(final String str, final String str2, final String str3, final String str4, final String str5) {
        return new ti20(new pcj() { // from class: l.oba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jka.m145369j2(str, str2, str3, str4, str5);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.qba
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156462a.m145557L9(str3, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ma */
    public final /* synthetic */ Boolean m145565Ma(String str, Moment moment) {
        return Boolean.valueOf(m145181Db(str));
    }

    /* JADX INFO: renamed from: Mb */
    public C22421c<pf60<Links, List<Moment>>> m145566Mb(String str) {
        return m145664ac(dog.m117256p(), m145527H7(), true, str, null);
    }

    /* JADX INFO: renamed from: Mc */
    public C22421c<TopicOperations> m145567Mc() {
        return scheduled("publishGuide", 0, new pcj() { // from class: l.eha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f94013a.m145593Qa();
            }
        });
    }

    /* JADX INFO: renamed from: N6 */
    public C22421c<MomentMessage> m145568N6(final String str, final MomentMessage momentMessage) {
        momentMessage.messageType = MomentMessageType.get("moment_comment");
        pcj pcjVar = new pcj() { // from class: l.rfa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f162770a.m145800u8(momentMessage, str);
            }
        };
        ue60 ue60VarM201037d = ve60.m201037d();
        final String strM195739c = NullChecker.m82486a(ue60VarM201037d) ? ue60VarM201037d.m195739c() : "";
        final y20<Throwable> y20Var = new y20() { // from class: l.sfa
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167676a.m145807v8(momentMessage, str, strM195739c, (Throwable) obj);
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.tfa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f173934a.m145830y8(str, momentMessage, strM195739c, y20Var, (MomentMessage) obj);
            }
        };
        return now(((C22421c) pcjVar.call()).doOnError(y20Var).flatMap(new qcj() { // from class: l.ufa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145244O2(qcjVar, (MomentMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N7 */
    public C22421c<NearbyLocation> m145569N7(String str, String str2) {
        return m145576O7(str, str2, "", "");
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ C22421c m145570N8(final String str, final Moment moment) {
        return qi20.m176655b(new pcj() { // from class: l.aga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return dog.f89929G.auth().m209043q(TextUtils.isEmpty(str2) ? dog.m117268y() : dog.m117269z(str2)).m209038l(z1d0.create(Network.JSON, moment.toJson())).m209028b();
            }
        }, dog.f89927E).map(new qcj() { // from class: l.bga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76573a.m145563M8(moment, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N9 */
    public final /* synthetic */ pf60 m145571N9(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        m145791sd(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(feedData.comments);
        return new pf60(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Na */
    public final /* synthetic */ uxj0 m145572Na(String str, int i, Envelope envelope) {
        HashSet hashSet = new HashSet();
        Iterator<String> it = this.f121357i0.keySet().iterator();
        while (it.hasNext()) {
            Moment moment = this.f121357i0.get(it.next());
            if (NullChecker.m82486a(moment) && !jyb.m147479J(moment.mTopicList) && TextUtils.equals(moment.mTopicList.get(0).f40095id, str) && !hashSet.contains(moment.mTopicList.get(0))) {
                hashSet.add(moment.mTopicList.get(0));
                List<VoteOptions> list = moment.mTopicList.get(0).options;
                moment.mTopicList.get(0).voteCounter++;
                if (!jyb.m147479J(list)) {
                    list.get(i).haveliked = true;
                    list.get(i).counter++;
                }
            }
        }
        this.f121363l0.m137019l(this.f121357i0);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Nb */
    public C22421c<pf60<Links, List<MomentMessage>>> m145573Nb(final String str, final String str2, final String str3, final String str4, final String str5) {
        return scheduled("/moments/" + str3 + "/messages/" + str4 + "/subMessages", 0, new pcj() { // from class: l.uja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f179191a.m145564M9(str5, str2, str3, str4, str);
            }
        });
    }

    /* JADX INFO: renamed from: Nc */
    public void m145574Nc(List<String> list) {
        List<String> listM145547K6 = m145547K6(list);
        if (jyb.m147479J(listM145547K6)) {
            return;
        }
        m145776qc(listM145547K6);
    }

    /* JADX INFO: renamed from: O6 */
    public List<MomentMessage> m145575O6(Moment moment) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(moment.messages) && NullChecker.m82486a(moment.messages.ids)) {
            Iterator<String> it = moment.messages.ids.iterator();
            while (it.hasNext()) {
                MomentMessage momentMessage = this.f121300H0.get(it.next());
                if (NullChecker.m82486a(momentMessage)) {
                    arrayList.add(momentMessage);
                }
            }
            jyb.m147478I(arrayList, new Comparator() { // from class: l.oea
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return jka.m145304Y2((MomentMessage) obj, (MomentMessage) obj2);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O7 */
    public C22421c<NearbyLocation> m145576O7(String str, String str2, String str3, String str4) {
        final String strM211116r = xi5.m211116r(str, str2, str3, str4);
        return scheduled("map_nearby_local" + str3 + str4, 0, new pcj() { // from class: l.cba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.rea
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
                    }
                }, NearbyLocation.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: O8 */
    public final /* synthetic */ Envelope m145577O8(Envelope envelope) {
        if (envelope != null) {
            m145791sd(envelope);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: O9 */
    public final /* synthetic */ C22421c m145578O9(final String str, final String str2, final String str3, final String str4, final String str5) {
        return new ti20(new pcj() { // from class: l.v9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jka.m145332d1(str, str2, str3, str4, str5);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.w9a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f187989a.m145571N9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Oa */
    public final /* synthetic */ C22421c m145579Oa(pcj pcjVar, final String str, final int i) {
        return new ti20(pcjVar).compose(psd0.m173592C()).map(new qcj() { // from class: l.eda
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f93155a.m145572Na(str, i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ob */
    public C22421c<pf60<Links, List<MomentMessage>>> m145580Ob(final String str, final String str2, final String str3, final String str4, final String str5) {
        return scheduled("/topics/" + str3 + "/comments/" + str4 + "/subComments", 0, new pcj() { // from class: l.vja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f184361a.m145578O9(str5, str2, str3, str4, str);
            }
        });
    }

    /* JADX INFO: renamed from: Oc */
    public final void m145581Oc(List<LiveCircleBanner> list) {
        this.f121376r1.clear();
        if (NullChecker.m82486a(list)) {
            jyb.m147537z(list, new y20() { // from class: l.fea
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98648a.m145600Ra((LiveCircleBanner) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P6 */
    public C22421c<Envelope> m145582P6(DetectRequest detectRequest) {
        final String json = detectRequest.toJson();
        return scheduled("contentDetect", -1, new pcj() { // from class: l.hba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f108577a.m145476A8(json);
            }
        }, false);
    }

    /* JADX INFO: renamed from: P7 */
    public C22508b<Map<String, TopicMoment>> m145583P7() {
        return this.f121346c1;
    }

    /* JADX INFO: renamed from: P8 */
    public final /* synthetic */ C22421c m145584P8(final String str) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.ega
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209030d().m209028b();
            }
        }, 0).compose(dog.m117253n0()).map(new qcj() { // from class: l.fga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f98895a.m145577O8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P9 */
    public final /* synthetic */ bkj0 m145585P9(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        List<StickerInfo> list = feedData.stickers;
        Moment moment = jyb.m147479J(feedData.moments) ? null : feedData.moments.get(0);
        Music music = !jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).musics) ? ((FeedData) envelope.getModuleData(FeedData.class)).musics.get(0) : null;
        RawFeed rawFeed = jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).feeds) ? null : ((FeedData) envelope.getModuleData(FeedData.class)).feeds.get(0);
        if (ksg.m151191Z(moment) && feedData.moments.size() < 2) {
            m145784rd(moment.thirdShareSource.sourceId);
        }
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        return new bkj0(moment, new pf60(list, feedData.messages), new pf60(music, rawFeed));
    }

    /* JADX INFO: renamed from: Pa */
    public final /* synthetic */ TopicOperations m145586Pa(Envelope envelope) {
        m145798td(envelope, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).topicOperations);
        TopicOperations topicOperations = (TopicOperations) jyb.m147529r(arrayList, new qcj() { // from class: l.paa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, OperationType.newUserAIMoment));
            }
        });
        this.f121301H1 = topicOperations;
        return topicOperations;
    }

    /* JADX INFO: renamed from: Pb */
    public jfh m145587Pb() {
        return this.f121378s1.m149509a();
    }

    /* JADX INFO: renamed from: Pc */
    public final void m145588Pc(List<LiveCircleExtInfo> list) {
        this.f121374q1.clear();
        if (NullChecker.m82486a(list)) {
            jyb.m147537z(list, new y20() { // from class: l.zca
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203743a.m145607Sa((LiveCircleExtInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public List<Moment> m145589Q6(final Envelope envelope, boolean z) {
        final HashMap map = new HashMap();
        jyb.m147537z(((FeedData) envelope.getModuleData(FeedData.class)).moments, new y20() { // from class: l.vba
            @Override // p153l.y20
            public final void call(Object obj) {
                Moment moment = (Moment) obj;
                map.put(moment.f56859id, moment);
            }
        });
        final HashMap map2 = new HashMap();
        if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).rooms)) {
            jyb.m147537z(((FeedData) envelope.getModuleData(FeedData.class)).rooms, new y20() { // from class: l.wba
                @Override // p153l.y20
                public final void call(Object obj) {
                    Room room = (Room) obj;
                    map2.put(room.f39658id, room);
                }
            });
        }
        final HashMap map3 = new HashMap();
        if (NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).liveRecommendCards)) {
            jyb.m147537z(((FeedData) envelope.getModuleData(FeedData.class)).liveRecommendCards, new y20() { // from class: l.xba
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveRecommendCard liveRecommendCard = (LiveRecommendCard) obj;
                    map3.put(liveRecommendCard.f40076id, liveRecommendCard);
                }
            });
        }
        final ArrayList arrayList = new ArrayList();
        if (((FeedData) envelope.getModuleData(FeedData.class)).feeds == null) {
            return arrayList;
        }
        if (z) {
            jyb.m147537z(((FeedData) envelope.getModuleData(FeedData.class)).feeds, new y20() { // from class: l.yba
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f198287a.m145484B8((RawFeed) obj);
                }
            });
        } else {
            jyb.m147503d0(((FeedData) envelope.getModuleData(FeedData.class)).feeds, new qcj() { // from class: l.zba
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f203637a.m145492C8((RawFeed) obj);
                }
            });
        }
        m145595Qc(((FeedData) envelope.getModuleData(FeedData.class)).lives);
        m145616Tc(((FeedData) envelope.getModuleData(FeedData.class)).voiceLives);
        m145630Vc(((FeedData) envelope.getModuleData(FeedData.class)).voiceRooms);
        m145602Rc(((FeedData) envelope.getModuleData(FeedData.class)).voiceLiveGames);
        m145609Sc(((FeedData) envelope.getModuleData(FeedData.class)).voiceLiveMomentFeeds);
        m145588Pc(((FeedData) envelope.getModuleData(FeedData.class)).liveCircleMomentExtInfos);
        m145581Oc(((FeedData) envelope.getModuleData(FeedData.class)).liveGroupCircleMomentBanners);
        final HashMap<String, LiveUserMask> mapM145623Uc = m145623Uc(((FeedData) envelope.getModuleData(FeedData.class)).masks);
        jyb.m147537z(((FeedData) envelope.getModuleData(FeedData.class)).feeds, new y20() { // from class: l.bca
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76114a.m145500D8(map, arrayList, map3, map2, mapM145623Uc, envelope, (RawFeed) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: Q7 */
    public C22421c<uxj0> m145590Q7(String str) {
        final String strM117246k = dog.m117246k("/notify-users?search=" + str + "&with=" + dog.f89949t + ",topic");
        return scheduled("getNotifyUsers" + str, 0, new pcj() { // from class: l.y9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f198069a.m145773q9(strM117246k);
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public final /* synthetic */ uxj0 m145591Q8(MomentMessage momentMessage, String str, Envelope envelope) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        String str2 = commentInfo.parentMessageId;
        List<String> list = commentInfo.subMessageIds;
        Moment moment = this.f121357i0.get(str);
        if (moment == null) {
            return uxj0.f181467a;
        }
        if (TextUtils.isEmpty(str2) || str2.equals("0")) {
            PartialIdList partialIdList = moment.messages;
            partialIdList.count--;
            partialIdList.ids.remove(momentMessage.f56856id);
            f121282L1 = jyb.m147494Y(str, 2);
            this.f121309K0.m137019l(momentMessage);
            this.f121300H0.remove(momentMessage.f56856id);
            if (NullChecker.m82487b(list)) {
                for (int i = 0; i < list.size(); i++) {
                    String str3 = list.get(i);
                    MomentMessage momentMessage2 = this.f121300H0.get(str3);
                    if (NullChecker.m82486a(momentMessage2)) {
                        PartialIdList partialIdList2 = moment.messages;
                        partialIdList2.count--;
                        partialIdList2.ids.remove(str3);
                        this.f121309K0.m137019l(momentMessage2);
                        this.f121300H0.remove(str3);
                    }
                }
            }
            this.f121357i0.put(str, moment);
            this.f121363l0.m137019l(this.f121357i0);
        } else {
            PartialIdList partialIdList3 = moment.messages;
            partialIdList3.count--;
            partialIdList3.ids.remove(momentMessage.f56856id);
            this.f121309K0.m137019l(momentMessage);
            this.f121300H0.remove(momentMessage.f56856id);
            MomentMessage momentMessage3 = this.f121300H0.get(str2);
            if (NullChecker.m82487b(momentMessage3)) {
                momentMessage3.commentInfo.subMessageIds.remove(momentMessage.f56856id);
                this.f121300H0.put(str2, momentMessage3);
            }
            this.f121357i0.put(str, moment);
            this.f121363l0.m137019l(this.f121357i0);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Q9 */
    public final /* synthetic */ void m145592Q9(String str, Throwable th) {
        if ((th instanceof ApiExcep.Client.Forbidden) || (th instanceof ApiExcep.Client.NotFound)) {
            m145784rd(str);
        }
    }

    /* JADX INFO: renamed from: Qa */
    public final /* synthetic */ C22421c m145593Qa() {
        return new ti20(new pcj() { // from class: l.pia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117263t("/publishGuide?scene=newUserAIMoment")).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.ria
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163345a.m145586Pa((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Qb */
    public void m145594Qb(Moment moment) {
        if (moment == null) {
            return;
        }
        if (moment.forwards == null) {
            moment.forwards = MomentForwards.new_();
        }
        moment.forwards.count++;
        this.f121357i0.put(moment.f56859id, moment);
        this.f121363l0.m137019l(this.f121357i0);
    }

    /* JADX INFO: renamed from: Qc */
    public void m145595Qc(List<Live> list) {
        if (j4h.m143420d() && NullChecker.m82486a(list)) {
            jyb.m147537z(list, new y20() { // from class: l.dea
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f87992a.m145614Ta((Live) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R6 */
    public C22421c<TopicMoment> m145596R6(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", str);
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            jSONObject.put(Owner.TYPE, jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        final String string = jSONObject.toString();
        return scheduled("createTopicNew", -1, new pcj() { // from class: l.bea
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f76353a.m145514F8(string);
            }
        }, false);
    }

    /* JADX INFO: renamed from: R7 */
    public NotifyUsers m145597R7(String str) {
        return this.f121359j0.get(str);
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ C22421c m145598R8(final String str, final String str2, final MomentMessage momentMessage) {
        new MomentMessage().recalled = Boolean.TRUE;
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.jfa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117248l(str, str2, momentMessage.f56856id)).m209030d().m209028b();
            }
        }, 0).compose(dog.m117253n0()).map(new qcj() { // from class: l.kfa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126258a.m145591Q8(momentMessage, str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R9 */
    public final /* synthetic */ C22421c m145599R9(final String str, final String str2, final boolean z, final String str3) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.fka
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117212M(str, str2, z, str3) + "&" + dog.f89955z + "&source=viewer").m209028b();
            }
        }, dog.f89926D).compose(dog.m117253n0()).map(new qcj() { // from class: l.gka
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f104717a.m145585P9((Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.hka
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110400a.m145592Q9(str2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ra */
    public final /* synthetic */ void m145600Ra(LiveCircleBanner liveCircleBanner) {
        this.f121376r1.put(liveCircleBanner.f40072id, liveCircleBanner);
    }

    /* JADX INFO: renamed from: Rb */
    public C22421c<bkj0<Moment, pf60<List<StickerInfo>, List<MomentMessage>>, pf60<Music, RawFeed>>> m145601Rb(String str, String str2) {
        return m145615Tb(str, str2, true);
    }

    /* JADX INFO: renamed from: Rc */
    public final void m145602Rc(List<VoiceLiveGame> list) {
        if (j4h.m143420d()) {
            this.f121370o1.clear();
            if (NullChecker.m82486a(list)) {
                jyb.m147537z(list, new y20() { // from class: l.fca
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f98206a.m145621Ua((VoiceLiveGame) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: S6 */
    public C22421c<uxj0> m145603S6(final Moment moment) {
        boolean zEquals = TEnum.equals(moment.status(), "failed");
        String str = moment.f56859id;
        if (!zEquals) {
            return !str.startsWith("fake_id_") ? scheduled("momentDelete", -1, new pcj() { // from class: l.eea
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f93626a.m145528H8(moment);
                }
            }) : C22421c.just(uxj0.f181467a);
        }
        if (str.startsWith("fake_id_")) {
            this.f121328T0.remove(moment.f56859id);
        }
        this.f121371p0.m137019l(moment);
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: S7 */
    public final String m145604S7(String str, String str2) {
        return str + "/personal/media/previous" + str2;
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ List m145605S8(Envelope envelope) {
        m145798td(envelope, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentPopWindows);
        return arrayList;
    }

    /* JADX INFO: renamed from: S9 */
    public final /* synthetic */ pf60 m145606S9(Envelope envelope) {
        m145791sd(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        return new pf60(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Sa */
    public final /* synthetic */ void m145607Sa(LiveCircleExtInfo liveCircleExtInfo) {
        this.f121374q1.put(liveCircleExtInfo.f40073id, liveCircleExtInfo);
    }

    /* JADX INFO: renamed from: Sb */
    public C22421c<bkj0<Moment, pf60<List<StickerInfo>, List<MomentMessage>>, pf60<Music, RawFeed>>> m145608Sb(String str, String str2, String str3) {
        return m145622Ub(str, str2, true, str3);
    }

    /* JADX INFO: renamed from: Sc */
    public final void m145609Sc(List<VoiceLiveMomentFeed> list) {
        if (j4h.m143420d()) {
            this.f121372p1.clear();
            if (NullChecker.m82486a(list)) {
                jyb.m147537z(list, new y20() { // from class: l.rda
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f162297a.m145628Va((VoiceLiveMomentFeed) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: T6 */
    public C22421c<Envelope> m145610T6(final String str) {
        return scheduled("activity-users/delete" + str, -1, new pcj() { // from class: l.cja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f82109a.m145542J8(str);
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    public final String m145611T7(String str) {
        return str + "/personal/feed/previous";
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ C22421c m145612T8(final String str, final String str2) {
        return new ti20(new pcj() { // from class: l.kea
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jka.m145347f4(str, str2);
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.lea
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131722a.m145605S8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T9 */
    public final /* synthetic */ C22421c m145613T9(final String str, final String str2) {
        return new ti20(new pcj() { // from class: l.o9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117210K(str, str2)).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.p9a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151122a.m145606S9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ta */
    public final /* synthetic */ void m145614Ta(Live live) {
        this.f121364l1.put(live.f39615id, live);
    }

    /* JADX INFO: renamed from: Tb */
    public C22421c<bkj0<Moment, pf60<List<StickerInfo>, List<MomentMessage>>, pf60<Music, RawFeed>>> m145615Tb(String str, String str2, boolean z) {
        return m145622Ub(str, str2, true, "");
    }

    /* JADX INFO: renamed from: Tc */
    public void m145616Tc(List<VoiceLive> list) {
        if (j4h.m143420d() && NullChecker.m82486a(list)) {
            jyb.m147537z(list, new y20() { // from class: l.kca
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f125033a.m145635Wa((VoiceLive) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U6 */
    public C22421c<pf60<Links, List<Moment>>> m145617U6(Links links, jv00 jv00Var) {
        return m145650Yb(dog.m117221V(links.next), "discussion/next", jv00Var);
    }

    /* JADX INFO: renamed from: U7 */
    public C22421c<Envelope> m145618U7(String str) {
        final String strM117237f0 = dog.m117237f0(str, "limit=20");
        return scheduled("getPoiTraceCardInfoData" + str, 0, new pcj() { // from class: l.oha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f147351a.m145787s9(strM117237f0);
            }
        });
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ Followship m145619U8(boolean z, User user, MatchScData matchScData, Envelope envelope) {
        C22507a<List<User>> c22507a = this.f121379t0;
        if (z) {
            c22507a.m222761e().add(user);
        } else {
            c22507a.m222761e().remove(user);
        }
        C22507a<List<User>> c22507a2 = this.f121379t0;
        c22507a2.m137019l(c22507a2.m222761e());
        mrb0.m159641S(envelope);
        if (cmg.m111183K()) {
            mrb0.m159631I();
        }
        m145546Jc(user, z, matchScData);
        if (j4h.m143420d() || j4h.m143419c()) {
            mrb0.m159643U(user, true);
        }
        Followship followshipNew_ = jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).followships) ? Followship.new_() : ((FeedData) envelope.getModuleData(FeedData.class)).followships.get(0);
        this.f121388x1.m137019l(followshipNew_);
        return followshipNew_;
    }

    /* JADX INFO: renamed from: U9 */
    public final /* synthetic */ pf60 m145620U9(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        return new pf60(feedData.stickers, feedData.messages);
    }

    /* JADX INFO: renamed from: Ua */
    public final /* synthetic */ void m145621Ua(VoiceLiveGame voiceLiveGame) {
        this.f121370o1.put(voiceLiveGame.voiceLiveId, voiceLiveGame);
    }

    /* JADX INFO: renamed from: Ub */
    public C22421c<bkj0<Moment, pf60<List<StickerInfo>, List<MomentMessage>>, pf60<Music, RawFeed>>> m145622Ub(final String str, final String str2, final boolean z, final String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !"null".equals(str) && !"null".equals(str2)) {
            return scheduled("moment/refresh/" + str2, 0, new pcj() { // from class: l.aia
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f71464a.m145599R9(str, str2, z, str3);
                }
            });
        }
        String str4 = str;
        StringBuilder sb = new StringBuilder("Illegal params x2 uid=");
        if (str4 == null) {
            str4 = "";
        }
        sb.append(str4);
        sb.append(" mid=");
        sb.append(str2 == null ? "" : str2);
        return C22421c.error(new Throwable(sb.toString()));
    }

    /* JADX INFO: renamed from: Uc */
    public HashMap<String, LiveUserMask> m145623Uc(List<LiveUserMask> list) {
        if (!j4h.m143420d()) {
            return new HashMap<>();
        }
        final HashMap<String, LiveUserMask> map = new HashMap<>();
        if (NullChecker.m82486a(list)) {
            jyb.m147537z(list, new y20() { // from class: l.ica
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveUserMask liveUserMask = (LiveUserMask) obj;
                    map.put(liveUserMask.userId, liveUserMask);
                }
            });
        }
        return map;
    }

    /* JADX INFO: renamed from: V6 */
    public C22421c<pf60<Links, List<Moment>>> m145624V6(jv00 jv00Var) {
        return m145664ac(dog.m117221V("limit=20"), "discussion/previous", false, null, jv00Var);
    }

    /* JADX INFO: renamed from: V7 */
    public final String m145625V7(BubbleInfo bubbleInfo, qn00 qn00Var) {
        if (!NullChecker.m82486a(bubbleInfo) || TextUtils.isEmpty(bubbleInfo.f39578id) || !NullChecker.m82486a(qn00Var)) {
            return null;
        }
        RawFeed rawFeedM177160c = qn00Var.m177160c(bubbleInfo.f39578id);
        if (!NullChecker.m82486a(rawFeedM177160c) || TextUtils.isEmpty(rawFeedM177160c.locationName)) {
            return null;
        }
        return rawFeedM177160c.locationName;
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ C22421c m145626V8(final String str, final String str2, final User user, final String str3, final String str4, final Followship followship, final boolean z, final MatchScData matchScData) {
        return new ti20(new pcj() { // from class: l.lca
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jka.m145358h3(str, str2, user, str3, str4, followship);
            }
        }).compose(psd0.m173592C()).map(new qcj() { // from class: l.xca
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193281a.m145619U8(z, user, matchScData, (Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.ida
            @Override // p153l.y20
            public final void call(Object obj) {
                i4h.m138539h((Throwable) obj, z);
            }
        });
    }

    /* JADX INFO: renamed from: V9 */
    public final /* synthetic */ C22421c m145627V9(final String str, final String str2, final String str3) {
        return new ti20(new pcj() { // from class: l.fda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117211L(str, str2, str3)).m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.gda
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f103639a.m145620U9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Va */
    public final /* synthetic */ void m145628Va(VoiceLiveMomentFeed voiceLiveMomentFeed) {
        this.f121372p1.put(voiceLiveMomentFeed.f40099id, voiceLiveMomentFeed);
    }

    /* JADX INFO: renamed from: Vb */
    public C22421c<pf60<Links, List<TopicMoment>>> m145629Vb(String str, final String str2, final String str3) {
        return scheduled(str, 0, new pcj() { // from class: l.f9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f97846a.m145613T9(str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: Vc */
    public void m145630Vc(List<VoiceRoomInfo> list) {
        if (j4h.m143420d() && NullChecker.m82486a(list)) {
            jyb.m147537z(list, new y20() { // from class: l.sca
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167205a.m145642Xa((VoiceRoomInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W6 */
    public C22421c<Envelope> m145631W6(String str, String str2) {
        final String strM117246k = dog.m117246k(String.format("/users/%s/states/%s/likes/me", str2, str));
        return scheduled("dislikeState", -1, new pcj() { // from class: l.o8a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f145366a.m145556L8(strM117246k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: W7 */
    public final String m145632W7(BubbleInfo bubbleInfo, qn00 qn00Var) {
        if (!NullChecker.m82486a(bubbleInfo) || TextUtils.isEmpty(bubbleInfo.f39578id) || !NullChecker.m82486a(qn00Var)) {
            return null;
        }
        RawFeed rawFeedM177160c = qn00Var.m177160c(bubbleInfo.f39578id);
        if (!NullChecker.m82486a(rawFeedM177160c) || TextUtils.isEmpty(rawFeedM177160c.recommendReason)) {
            return null;
        }
        return rawFeedM177160c.recommendReason;
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ C22421c m145633W8(User user, Envelope envelope) {
        if (jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).followships) || TEnum.equals(((FeedData) envelope.getModuleData(FeedData.class)).followships.get(0).state, "matched")) {
            mrb0.m159631I();
            mrb0.m159641S(envelope);
            m145532Hc(user);
            return C22421c.just(user.localFollowship);
        }
        user.localFollowship = ((FeedData) envelope.getModuleData(FeedData.class)).followships.get(0);
        this.f121285A0.put(user.f56859id, user);
        this.f121289C0.m137019l(this.f121285A0);
        this.f121322Q0.m137019l(new pf60<>(user, Boolean.TRUE));
        mrb0.m159636N(FeedModule.m61405F().userId(), false);
        o1j0.m165636j("对方取消了关注，暂时无法聊天");
        return C22421c.error(f121284N1);
    }

    /* JADX INFO: renamed from: W9 */
    public final /* synthetic */ pf60 m145634W9(jv00 jv00Var, Envelope envelope) {
        if (NullChecker.m82486a(jv00Var)) {
            jv00Var.mo66886a(envelope);
        }
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        List<BubbleInfo> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (cmg.m111218k0() && NullChecker.m82486a(list) && !jyb.m147479J(list2)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).states.addAll(list2);
            }
        }
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        ArrayList arrayList = new ArrayList();
        if (j4h.m143420d() && NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            arrayList.addAll(m145589Q6(envelope, false));
        } else {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        return new pf60(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Wa */
    public final /* synthetic */ void m145635Wa(VoiceLive voiceLive) {
        this.f121366m1.put(voiceLive.f40098id, voiceLive);
    }

    /* JADX INFO: renamed from: Wb */
    public C22421c<pf60<List<StickerInfo>, List<MomentMessage>>> m145636Wb(final String str, final String str2, final String str3) {
        return scheduled("moment/get/message" + str3, 0, new pcj() { // from class: l.laa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f130668a.m145627V9(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: Wc */
    public C22421c<pf60<Links, List<Moment>>> m145637Wc(boolean z) {
        return m145643Xb(dog.m117208I("limit=20", z), "recommend/next");
    }

    /* JADX INFO: renamed from: X6 */
    public C22421c<Envelope> m145638X6(Moment moment) {
        return m145645Y6(moment, null);
    }

    /* JADX INFO: renamed from: X7 */
    public C22421c<pf60<List<Moment>, List<RawFeed>>> m145639X7(String str, String str2, String str3) {
        final String strM117246k = dog.m117246k("/moments?search=interaction&pagesource=" + str + "&query=" + str2 + "&interaction=" + str3);
        return scheduled("moments/interaction/" + str2, 0, new pcj() { // from class: l.qaa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f156366a.m145801u9(strM117246k);
            }
        });
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ C22421c m145640X8(final String str, final User user, final Followship followship) {
        return new ti20(new pcj() { // from class: l.wha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jka.m145379k6(str, user, followship);
            }
        }).compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.xha
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194283a.m145633W8(user, (Envelope) obj);
            }
        }).doOnError(new y20() { // from class: l.yha
            @Override // p153l.y20
            public final void call(Object obj) {
                jka.m145275T3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X9 */
    public final /* synthetic */ C22421c m145641X9(final String str, final jv00 jv00Var, final String str2, final long j) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.dja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }, dog.f89926D | dog.f89927E).map(new qcj() { // from class: l.eja
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145363i2(jv00Var, str2, (Envelope) obj);
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.fja
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99308a.m145634W9(jv00Var, (Envelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.gja
            @Override // p153l.y20
            public final void call(Object obj) {
                jka.m145407p4(str2, j, (pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Xa */
    public final /* synthetic */ void m145642Xa(VoiceRoomInfo voiceRoomInfo) {
        this.f121368n1.put(voiceRoomInfo.f39686id, voiceRoomInfo);
    }

    /* JADX INFO: renamed from: Xb */
    public C22421c<pf60<Links, List<Moment>>> m145643Xb(String str, String str2) {
        return m145650Yb(str, str2, null);
    }

    /* JADX INFO: renamed from: Xc */
    public C22421c<pf60<Links, List<Moment>>> m145644Xc(boolean z) {
        return m145657Zb(dog.m117208I("limit=20", z), "recommend/previous", false, null);
    }

    /* JADX INFO: renamed from: Y6 */
    public C22421c<Envelope> m145645Y6(final Moment moment, final String str) {
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("everyone");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        moment.allowForward = MomentAllowForwardState.get(MomentAllowForwardState.allow);
        if (moment.createdTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            moment.createdTime = dog.m117260r0();
        }
        if (TextUtils.isEmpty(moment.owner)) {
            moment.owner = FeedModule.m61405F().userId();
        }
        if (TEnum.equals(moment.userSetVisibility, "unknown_")) {
            moment.userSetVisibility = UserSetVisibility.get("everyone");
        }
        return scheduled("postTheMoment", -1, new pcj() { // from class: l.nca
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f141328a.m145570N8(str, moment);
            }
        });
    }

    /* JADX INFO: renamed from: Y7 */
    public C22421c<Envelope> m145646Y7(String str, final jv00 jv00Var) {
        final String strM117246k;
        if (TextUtils.isEmpty(str)) {
            strM117246k = dog.m117246k("/states?search=square&with=users");
        } else {
            strM117246k = dog.m117246k("/states?search=square&with=users&" + str);
        }
        return scheduled("getSquareStateData", 0, new pcj() { // from class: l.e9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f92608a.m145815w9(strM117246k, jv00Var);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ pf60 m145647Y8(Envelope envelope) {
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        Pagination pagination = envelope.pagination;
        return commonData == null ? new pf60(pagination.links, null) : new pf60(pagination.links, commonData.users);
    }

    /* JADX INFO: renamed from: Y9 */
    public final /* synthetic */ pf60 m145648Y9(jv00 jv00Var, String str, String str2, boolean z, Envelope envelope) {
        if (NullChecker.m82486a(jv00Var)) {
            jv00Var.mo66887c(envelope);
        }
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        List<BubbleInfo> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (cmg.m111218k0() && NullChecker.m82486a(list) && !jyb.m147479J(list2)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).states.addAll(list2);
            }
        }
        mrb0.m159640R(envelope.counters);
        m145791sd(envelope);
        m145744m8(envelope, str, str2);
        ArrayList arrayList = new ArrayList();
        if (z) {
            for (Moment moment : this.f121328T0.values()) {
                if (moment.owner.equals(str)) {
                    arrayList.add(moment);
                }
            }
        }
        if (j4h.m143420d() && NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            arrayList.addAll(m145589Q6(envelope, true));
        } else {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        mrb0.m159641S(envelope);
        return new pf60(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Ya */
    public final /* synthetic */ Envelope m145649Ya(Envelope envelope) {
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: Yb */
    public C22421c<pf60<Links, List<Moment>>> m145650Yb(final String str, final String str2, final jv00 jv00Var) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return scheduled(str2, 0, new pcj() { // from class: l.sha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f168604a.m145641X9(str, jv00Var, str2, jElapsedRealtime);
            }
        });
    }

    /* JADX INFO: renamed from: Yc */
    public void m145651Yc(String str) {
        m145742ld(str).subscribe(psd0.m173597H(new y20() { // from class: l.f8a
            @Override // p153l.y20
            public final void call(Object obj) {
                jka.m145240N4((uxj0) obj);
            }
        }, new y20() { // from class: l.mca
            @Override // p153l.y20
            public final void call(Object obj) {
                jka.m145315a2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z6 */
    public C22421c<Envelope> m145652Z6(String str, String str2) {
        final String strM117246k = dog.m117246k(String.format("/users/%s/states/%s", str2, str));
        return scheduled("endState", -1, new pcj() { // from class: l.dba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.sda
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(str).m209030d().m209028b();
                    }
                }).map(new qcj() { // from class: l.uda
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return jka.m145467y5((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: Z7 */
    public C22421c<Envelope> m145653Z7(String str, String str2) {
        final String strM117246k = dog.m117246k(String.format("/users/%s/states/%s", str2, str));
        return scheduled("endState", 0, new pcj() { // from class: l.vha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.tia
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.uia
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return jka.m145456x0((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ C22421c m145654Z8(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.ika
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117246k(str)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.q8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156087a.m145647Y8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z9 */
    public final /* synthetic */ C22421c m145655Z9(final String str, final jv00 jv00Var, final String str2, final String str3, final boolean z) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.bka
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }, dog.f89926D | dog.f89927E).map(new qcj() { // from class: l.cka
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145331c6(jv00Var, str2, (Envelope) obj);
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.dka
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f88985a.m145648Y9(jv00Var, str3, str, z, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Za */
    public final /* synthetic */ C22421c m145656Za(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.i8a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.j8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118764a.m145649Ya((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Zb */
    public C22421c<pf60<Links, List<Moment>>> m145657Zb(String str, String str2, boolean z, String str3) {
        return m145664ac(str, str2, z, str3, null);
    }

    /* JADX INFO: renamed from: Zc */
    public C22421c<Envelope> m145658Zc(String str) {
        final String strM117246k = dog.m117246k("/users/" + str + "/topics?search=profile");
        return scheduled("requestAllProfileTopic", 0, new pcj() { // from class: l.eia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f94116a.m145656Za(strM117246k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: a7 */
    public C22421c<Envelope> m145659a7(String str, String str2) {
        final String strM117246k = dog.m117246k("/groups/" + str + "/users/" + str2);
        return scheduled("exitTheGroup" + str, -1, new pcj() { // from class: l.efa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f93723a.m145584P8(strM117246k);
            }
        });
    }

    /* JADX INFO: renamed from: a8 */
    public C22421c<List<BubbleInfo>> m145660a8() {
        return scheduled("states?search=quickchat", 0, new pcj() { // from class: l.nha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f141949a.m145831y9();
            }
        });
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ bkj0 m145661a9(Envelope envelope) {
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return (commonData == null || feedData == null) ? new bkj0(envelope.pagination.links, null, null) : new bkj0(envelope.pagination.links, commonData.users, feedData.sourceCatCount);
    }

    /* JADX INFO: renamed from: aa */
    public final /* synthetic */ pf60 m145662aa(Envelope envelope) {
        mrb0.m159640R(envelope.counters);
        m145791sd(envelope);
        ArrayList arrayList = new ArrayList();
        if (j4h.m143420d() && NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            arrayList.addAll(m145589Q6(envelope, true));
        } else {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        mrb0.m159641S(envelope);
        return new pf60(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: ab */
    public final /* synthetic */ Envelope m145663ab(Envelope envelope) {
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ac */
    public C22421c<pf60<Links, List<Moment>>> m145664ac(final String str, final String str2, final boolean z, final String str3, final jv00 jv00Var) {
        return scheduled(str2, 0, new pcj() { // from class: l.rha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f163084a.m145655Z9(str, jv00Var, str2, str3, z);
            }
        });
    }

    /* JADX INFO: renamed from: ad */
    public C22421c<Envelope> m145665ad(String str, int i) {
        final String str2;
        String strM117246k = dog.m117246k("/moments?search=recommend&with=musics&filter=video");
        if (TextUtils.isEmpty(str)) {
            str2 = strM117246k + "&limit=" + i;
        } else {
            str2 = strM117246k + "&" + str;
        }
        return scheduled("/moments?search=recommend&filter=video", 0, new pcj() { // from class: l.cca
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f80898a.m145670bb(str2);
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public C22421c<uxj0> m145666b7(final String str, final String str2, final MomentMessage momentMessage) {
        if (TEnum.equals(momentMessage.status(), "failed")) {
            this.f121309K0.m137019l(momentMessage);
            return C22421c.just(uxj0.f181467a);
        }
        return scheduled("/moments/" + str2 + "/messages/" + momentMessage.f56856id, -1, new pcj() { // from class: l.tca
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f173220a.m145598R8(str, str2, momentMessage);
            }
        });
    }

    /* JADX INFO: renamed from: b8 */
    public C22507a<pf60<List<TopicCategorie>, List<TopicMoment>>> m145667b8() {
        return this.f121354g1;
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ C22421c m145668b9(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.mja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117246k(str)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.xja
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194544a.m145661a9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ba */
    public final /* synthetic */ C22421c m145669ba(final String str) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.cda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }, dog.f89926D | dog.f89927E).compose(dog.m117253n0()).map(new qcj() { // from class: l.dda
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f87868a.m145662aa((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: bb */
    public final /* synthetic */ C22421c m145670bb(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.mea
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.nea
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141579a.m145663ab((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: bc */
    public C22421c<pf60<Links, List<Moment>>> m145671bc(final String str, String str2, boolean z, String str3, jv00 jv00Var) {
        return scheduled(str2, 0, new pcj() { // from class: l.k9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f124465a.m145669ba(str);
            }
        });
    }

    /* JADX INFO: renamed from: bd */
    public C22421c<Envelope> m145672bd(String str, int i, String str2, String str3) {
        String str4;
        final String str5;
        if ("from_nearby_falls_feed".equals(str2)) {
            str4 = "nearby";
        } else if ("from_discover_discussion".equals(str2)) {
            str4 = "discussion";
        } else {
            str4 = "from_discover_dating".equals(str2) ? "dating" : "recommend";
        }
        String strM117246k = dog.m117246k("/moments?search=immersion&pagesource=" + str4 + "&query=" + str3);
        if (TextUtils.isEmpty(str)) {
            str5 = strM117246k + "&limit=" + i;
        } else {
            str5 = strM117246k + "&" + str;
        }
        return scheduled("/moments?search=immersion", 0, new pcj() { // from class: l.yaa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f198160a.m145684db(str5);
            }
        });
    }

    /* JADX INFO: renamed from: c7 */
    public C22421c<pf60<Links, List<User>>> m145673c7() {
        return m145497Cd(dog.m117252n(""), "fans/list/previous");
    }

    /* JADX INFO: renamed from: c8 */
    public C22507a<pf60<Links, List<TopicMoment>>> m145674c8() {
        return this.f121348d1;
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ Envelope m145675c9(Envelope envelope) {
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ca */
    public final /* synthetic */ uxj0 m145676ca(Envelope envelope) {
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        C22508b<uxj0> c22508b = this.f121290C1;
        uxj0 uxj0Var = uxj0.f181467a;
        c22508b.m137019l(uxj0Var);
        this.f121292D1.put(Long.valueOf(pzi0.m174454o()));
        return uxj0Var;
    }

    /* JADX INFO: renamed from: cb */
    public final /* synthetic */ Envelope m145677cb(Envelope envelope) {
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: cc */
    public C22421c<uxj0> m145678cc(String str, boolean z) {
        this.f121320P0.m137019l(jyb.m147494Y(str, Boolean.valueOf(z)));
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: cd */
    public C22421c<pf60<Links, List<TopicMoment>>> m145679cd(final String str) {
        return scheduled("searchTopics_" + str, 0, new pcj() { // from class: l.nba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f141080a.m145698fb(str);
            }
        });
    }

    @Override // com.tantanapp.common.network.RunnerProxy
    public void clearRequestsAndStop() {
        super.clearRequestsAndStop();
        Iterator<nq00> it = this.f121307J1.values().iterator();
        while (it.hasNext()) {
            it.next().m164281a();
        }
    }

    /* JADX INFO: renamed from: d7 */
    public C22421c<List<PostBasePopWindow>> m145680d7(final String str, final String str2) {
        return scheduled("feedPostPopWindow_" + str + str2, 0, new pcj() { // from class: l.jaa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118963a.m145612T8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: d8 */
    public C22507a<pf60<Links, List<TopicMoment>>> m145681d8() {
        return this.f121350e1;
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ C22421c m145682d9() {
        return new ti20(new pcj() { // from class: l.via
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117246k("/meets")).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.wia
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189347a.m145675c9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: da */
    public final /* synthetic */ C22421c m145683da(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.lga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117263t("/award")).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).map(new qcj() { // from class: l.mga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f136701a.m145676ca((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: db */
    public final /* synthetic */ C22421c m145684db(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.oca
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.pca
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151542a.m145677cb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: dc */
    public C22421c<List<Moment>> m145685dc() {
        return this.f121381u0;
    }

    /* JADX INFO: renamed from: dd */
    public void m145686dd(double d) {
        if (this.f121342a1.get().doubleValue() < d) {
            this.f121342a1.put(Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: e7 */
    public C22421c<List<FeedUserLiveLabel>> m145687e7(String str, HashSet<String> hashSet) {
        if (hashSet.size() == 0) {
            return C22421c.just(new ArrayList());
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = hashSet.iterator();
        sb.append(it.next());
        while (it.hasNext()) {
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(it.next());
        }
        final JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("source", str);
            jsonObject.addProperty("userIds", sb.toString());
        } catch (Exception unused) {
        }
        return scheduled("live-labels".concat(sb.toString()), -1, new pcj() { // from class: l.sja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.mba
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117246k("/live-labels")).m209038l(z1d0.create(Network.JSON, jsonObject.toString())).m209028b();
                    }
                });
            }
        }).map(new qcj() { // from class: l.tja
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145441u6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e8 */
    public User m145688e8(String str) {
        User userM159659m = this.f121285A0.get(str);
        if (userM159659m == null) {
            if (j4h.m143420d() || j4h.m143419c()) {
                userM159659m = mrb0.m159659m(str);
            }
            if (userM159659m == null) {
                userM159659m = FeedModule.f39707h.m112663z0(str);
            }
            if (userM159659m == null) {
                userM159659m = mrb0.m159646X(str);
            }
        }
        this.f121285A0.put(str, userM159659m);
        return userM159659m;
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ Envelope m145689e9(String str, Envelope envelope) {
        m145791sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        if (list.size() > 0 && FeedModule.m61406H().me_().f56859id.equals(list.get(0).owner.f39651id)) {
            m145741lc(list.get(0));
            return envelope;
        }
        if (TextUtils.isEmpty(str)) {
            m145741lc(null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: ea */
    public final /* synthetic */ bkj0 m145690ea(String str, Envelope envelope) {
        m145798td(envelope, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(((FeedData) envelope.getModuleData(FeedData.class)).topicOperations);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        if (cmg.m111177E()) {
            List<BubbleInfo> list = ((FeedData) envelope.getModuleData(FeedData.class)).states;
            if (NullChecker.m82486a(list) && list.size() != 0) {
                this.f121387x0.m137019l(list);
            }
        }
        if ("follow".equals(str) || "like".equals(str) || "dating".equals(str)) {
            this.f121352f1.m137019l((TopicOperations) jyb.m147529r(arrayList2, new qcj() { // from class: l.n9a
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, OperationType.draft));
                }
            }));
        }
        return new bkj0(arrayList2, arrayList, arrayList3);
    }

    /* JADX INFO: renamed from: eb */
    public final /* synthetic */ pf60 m145691eb(Envelope envelope) {
        m145791sd(envelope);
        return new pf60(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
    }

    /* JADX INFO: renamed from: ec */
    public C22421c<pf60<Links, List<Moment>>> m145692ec(Links links) {
        return m145699fc(links, null);
    }

    /* JADX INFO: renamed from: ed */
    public C22421c<Envelope> m145693ed() {
        final String strM117246k = dog.m117246k("/activity-entrance/nearby?interUser=false");
        return scheduled("showChristmasEntrance", 0, new pcj() { // from class: l.pja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f152677a.m145712hb(strM117246k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: f7 */
    public C22421c<Followship> m145694f7(String str, User user, boolean z) {
        return m145701g7(str, user, z, null, null);
    }

    /* JADX INFO: renamed from: f8 */
    public C22421c<User> m145695f8(final String str) {
        return now(new ti20(new pcj() { // from class: l.lja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117247k0(str)).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.nja
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f142281a.m145839z9(str, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f9 */
    public final /* synthetic */ C22421c m145696f9(final String str, final String str2) {
        return qi20.m176654a(new pcj() { // from class: l.zja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.aka
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71974a.m145689e9(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fa */
    public final /* synthetic */ C22421c m145697fa(final String str, final String str2) {
        return new ti20(new pcj() { // from class: l.k8a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117214O(str, str2)).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.l8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130428a.m145690ea(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fb */
    public final /* synthetic */ C22421c m145698fb(final String str) {
        return new ti20(new pcj() { // from class: l.ada
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117246k("/search/topics?limit=20&query=" + str)).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.bda
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76237a.m145691eb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fc */
    public C22421c<pf60<Links, List<Moment>>> m145699fc(Links links, jv00 jv00Var) {
        return m145650Yb(dog.m117233d0(links.next), "nearby/next", jv00Var);
    }

    /* JADX INFO: renamed from: fd */
    public C22421c<pf60<Links, List<Moment>>> m145700fd(String str, Links links, jv00 jv00Var, String str2) {
        return m145650Yb(dog.m117239g0(str, links.next, str2), "/moments/topicAggregation/next/" + str + str2, jv00Var);
    }

    /* JADX INFO: renamed from: g7 */
    public C22421c<Followship> m145701g7(String str, User user, boolean z, String str2, String str3) {
        return m145708h7(str, user, z, str2, str3, null);
    }

    /* JADX INFO: renamed from: g8 */
    public C22421c<BubbleInfo> m145702g8(final String str) {
        final String strM117246k = dog.m117246k("/users/" + str + "/states");
        return scheduled("getUserState", 0, new pcj() { // from class: l.pea
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f151881a.m145485B9(strM117246k, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: g9 */
    public final /* synthetic */ Envelope m145703g9(Envelope envelope) {
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ga */
    public final /* synthetic */ Envelope m145704ga(List list, Envelope envelope) {
        this.f121291D0.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            if (this.f121295F0.contains(list.get(i))) {
                this.f121295F0.remove(list.get(i));
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: gb */
    public final /* synthetic */ Envelope m145705gb(Envelope envelope) {
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: gc */
    public C22421c<pf60<Links, List<Moment>>> m145706gc() {
        return m145713hc(null);
    }

    /* JADX INFO: renamed from: gd */
    public C22421c<bkj0<Links, List<Moment>, List<TopicMoment>>> m145707gd(String str, jv00 jv00Var, String str2) {
        return m145749md(dog.m117239g0(str, "limit=20", str2), "/moments/topicAggregation/prev/" + str + str2, jv00Var);
    }

    /* JADX INFO: renamed from: h7 */
    public C22421c<Followship> m145708h7(final String str, final User user, final boolean z, final String str2, final String str3, @Nullable final String str4) {
        MatchScData matchScDataBuild;
        if (z) {
            ue60 ue60VarM201037d = ve60.m201037d();
            matchScDataBuild = new MatchScData.MatchBuilder().isLike(true).matchSource("follow").isSuperLiked(false).isFromButton(true).isFromFollow(true).user(user).pageId(ue60VarM201037d != null ? ue60VarM201037d.m195739c() : "").build();
        } else {
            matchScDataBuild = null;
        }
        final MatchScData matchScData = matchScDataBuild;
        final Followship followship = new Followship();
        followship.state = FollowshipStatus.get(z ? FollowshipStatus.following : FollowshipStatus.unfollow);
        followship.userTime = uqb0.f180376H.guessedCurrentServerTime();
        followship.toJson();
        return scheduled(FollowshipStatus.following + user.f56859id, -1, new pcj() { // from class: l.fia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f99160a.m145626V8(str2, str, user, str3, str4, followship, z, matchScData);
            }
        });
    }

    /* JADX INFO: renamed from: h8 */
    public C22421c<pf60<Links, List<ViewersBox>>> m145709h8(final String str, final String str2, final String str3) {
        return scheduled("getUserViewsHistoryList", 0, new pcj() { // from class: l.ofa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f147058a.m145501D9(str3, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: h9 */
    public final /* synthetic */ C22421c m145710h9(final String str) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.jia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }, 0).compose(dog.m117253n0()).map(new qcj() { // from class: l.kia
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126975a.m145703g9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ha */
    public final /* synthetic */ C22421c m145711ha(final String str, final List list) {
        return qi20.m176654a(new pcj() { // from class: l.lha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117246k("/moment-viewers")).m209038l(z1d0.create(Network.JSON, str)).m209028b();
            }
        }).map(new qcj() { // from class: l.mha
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f136834a.m145704ga(list, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: hb */
    public final /* synthetic */ C22421c m145712hb(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.uaa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.vaa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183076a.m145705gb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: hc */
    public C22421c<pf60<Links, List<Moment>>> m145713hc(jv00 jv00Var) {
        return m145664ac(dog.m117233d0("limit=20"), "nearby/previous", false, null, jv00Var);
    }

    /* JADX INFO: renamed from: hd */
    public C22421c<uxj0> m145714hd(final String str) {
        return scheduled("topicCategories" + str, 0, new pcj() { // from class: l.qea
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f156801a.m145726jb(str);
            }
        });
    }

    /* JADX INFO: renamed from: i7 */
    public C22421c<pf60<Links, List<Moment>>> m145715i7(Links links, jv00 jv00Var) {
        return m145650Yb(dog.m117223X(links.next), "following/moments/next", jv00Var);
    }

    /* JADX INFO: renamed from: i8 */
    public C22421c<uxj0> m145716i8(final boolean z) {
        return scheduled("get_follow_configs", 0, new pcj() { // from class: l.uha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f179004a.m145515F9(z);
            }
        });
    }

    /* JADX INFO: renamed from: i9 */
    public final /* synthetic */ bkj0 m145717i9(Envelope envelope) {
        m145791sd(envelope);
        return new bkj0(((FeedData) envelope.data.getModuleData(FeedData.class)).groups, ((CommonData) envelope.data.getModuleData(CommonData.class)).users, envelope.pagination.links);
    }

    /* JADX INFO: renamed from: ia */
    public final /* synthetic */ bkj0 m145718ia(Envelope envelope) {
        m145791sd(envelope);
        return new bkj0(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).users, Integer.valueOf(envelope.pagination.total));
    }

    /* JADX INFO: renamed from: ib */
    public final /* synthetic */ uxj0 m145719ib(Envelope envelope) {
        m145791sd(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(((FeedData) envelope.getModuleData(FeedData.class)).topicCategories);
        this.f121354g1.m137019l(new pf60<>(arrayList2, arrayList));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ic */
    public C22421c<pf60<Links, List<Moment>>> m145720ic(Links links, jv00 jv00Var) {
        return m145650Yb(dog.m117231c0(links.next), "nearbyOnline/next", jv00Var);
    }

    /* JADX INFO: renamed from: id */
    public C22421c<uxj0> m145721id(final MomentMessage momentMessage, final String str, final String str2) {
        return TEnum.equals(momentMessage.status(), "failed") ? C22421c.just(uxj0.f181467a) : scheduled("topicCommentDelete", -1, new pcj() { // from class: l.n8a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jka.m145470z2(str, str2, momentMessage);
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public C22421c<pf60<Links, List<Moment>>> m145722j7(jv00 jv00Var) {
        return m145664ac(dog.m117223X("limit=20"), "following/previous", true, FeedModule.m61405F().userId(), jv00Var);
    }

    /* JADX INFO: renamed from: j8 */
    public C22421c<pf60<Links, List<Moment>>> m145723j8(jv00 jv00Var, String str, String str2, Links links) {
        return m145671bc(dog.m117246k("/moments?search=group&sort=" + str + "&query=" + str2 + "&" + links.next), "group/previous" + str2, false, null, jv00Var);
    }

    /* JADX INFO: renamed from: j9 */
    public final /* synthetic */ uxj0 m145724j9(Envelope envelope) {
        GuideStatePostConfig guideStatePostConfig = ((FeedData) envelope.getModuleData(FeedData.class)).guideStatePostConfig;
        this.f121316N0 = guideStatePostConfig;
        this.f121318O0.m137019l(guideStatePostConfig);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: ja */
    public final /* synthetic */ C22421c m145725ja(final String str) {
        return new ti20(new pcj() { // from class: l.zia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.aja
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71803a.m145718ia((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jb */
    public final /* synthetic */ C22421c m145726jb(final String str) {
        return new ti20(new pcj() { // from class: l.yfa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117209J(str)).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.zfa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204112a.m145719ib((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jc */
    public C22421c<pf60<Links, List<Moment>>> m145727jc(jv00 jv00Var) {
        return m145664ac(dog.m117231c0("limit=20"), "nearbyOnline/previous", false, null, jv00Var);
    }

    /* JADX INFO: renamed from: jd */
    public C22421c<MomentMessage> m145728jd(final MomentMessage momentMessage, final String str, final String str2) {
        pcj pcjVar = new pcj() { // from class: l.q9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.fromCallable(new Callable() { // from class: l.dca
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return jka.m145382l3(momentMessage, str);
                    }
                });
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.r9a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161799a.m145747mb(str, str2, (MomentMessage) obj);
            }
        };
        return now(((C22421c) pcjVar.call()).flatMap(new qcj() { // from class: l.s9a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145296X0(qcjVar, (MomentMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k7 */
    public C22421c<pf60<Links, List<Moment>>> m145729k7(jv00 jv00Var) {
        return m145664ac(dog.m117223X("limit=20&pagesource=dating"), "following/previous", true, FeedModule.m61405F().userId(), jv00Var);
    }

    /* JADX INFO: renamed from: k8 */
    public C22421c<pf60<Links, List<Moment>>> m145730k8(jv00 jv00Var, String str, String str2) {
        return m145671bc(dog.m117246k("/moments?search=group&sort=" + str + "&query=" + str2), "/moments?search=group&sort=" + str + "&query=" + str2, false, null, jv00Var);
    }

    /* JADX INFO: renamed from: k9 */
    public final /* synthetic */ C22421c m145731k9() {
        return new ti20(new pcj() { // from class: l.gca
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117263t("/guideState")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.hca
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108684a.m145724j9((Envelope) obj);
            }
        }).compose(dog.m117253n0());
    }

    /* JADX INFO: renamed from: ka */
    public final /* synthetic */ bkj0 m145732ka(Envelope envelope) {
        m145791sd(envelope);
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        HashMap map = new HashMap();
        for (Moment moment : ((FeedData) envelope.getModuleData(FeedData.class)).moments) {
            String str = moment.owner;
            List arrayList = (List) map.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(moment);
            map.put(str, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (User user : list) {
            mah mahVar = new mah();
            mahVar.m157653f(user);
            mahVar.m157652e((List) map.get(user.f56859id));
            arrayList2.add(mahVar);
        }
        Pagination pagination = envelope.pagination;
        return new bkj0(pagination.links, arrayList2, Integer.valueOf(pagination.total));
    }

    /* JADX INFO: renamed from: kb */
    public final /* synthetic */ MomentMessage m145733kb(Envelope envelope) {
        m145791sd(envelope);
        return ((FeedData) envelope.getModuleData(FeedData.class)).comments.get(0);
    }

    /* JADX INFO: renamed from: kc */
    public C22421c<uxj0> m145734kc(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", OperationType.newUserAIMoment);
            jSONObject.put("momentId", str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        final String string = jSONObject.toString();
        return scheduled("newUserAIMomentAward", -1, new pcj() { // from class: l.qfa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f157278a.m145683da(string);
            }
        }, false);
    }

    /* JADX INFO: renamed from: kd */
    public C22421c<uxj0> m145735kd(final String str, String str2) {
        return m145629Vb("moment/topics/next/" + str, str, str2).map(new qcj() { // from class: l.saa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167020a.m145754nb(str, (pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l7 */
    public C22421c<Followship> m145736l7(final String str, final User user) {
        final Followship followship = new Followship();
        followship.state = FollowshipStatus.get(FollowshipStatus.following);
        followship.userTime = uqb0.f180376H.guessedCurrentServerTime();
        return scheduled("followingToChat", -1, new pcj() { // from class: l.tga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f174048a.m145640X8(str, user, followship);
            }
        });
    }

    /* JADX INFO: renamed from: l8 */
    public final boolean m145737l8() {
        return orb0.m168902s();
    }

    /* JADX INFO: renamed from: l9 */
    public final /* synthetic */ pf60 m145738l9(Envelope envelope) {
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return new pf60(jyb.m147479J(feedData.literatures) ? null : feedData.literatures.get(0), jyb.m147479J(feedData.literaturesComments) ? null : feedData.literaturesComments.get(0));
    }

    /* JADX INFO: renamed from: la */
    public final /* synthetic */ C22421c m145739la(final String str) {
        return new ti20(new pcj() { // from class: l.t9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.u9a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178106a.m145732ka((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lb */
    public final /* synthetic */ C22421c m145740lb(MomentMessage momentMessage, final String str, final String str2) {
        final MomentMessage momentMessageMo225055clone = momentMessage.mo225055clone();
        return new ti20(new pcj() { // from class: l.bfa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117243i0(str, str2, null)).m209038l(z1d0.create(Network.JSON, momentMessageMo225055clone.toJson())).m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.cfa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f81493a.m145733kb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lc */
    public void m145741lc(BubbleInfo bubbleInfo) {
        Map<String, BubbleInfo> mapM222761e = this.f121358i1.m222761e();
        mapM222761e.put(FeedModule.m61406H().me_().f56859id, bubbleInfo);
        this.f121358i1.m137019l(mapM222761e);
    }

    /* JADX INFO: renamed from: ld */
    public C22421c<uxj0> m145742ld(final String str) {
        return m145629Vb("moment/topics/prev/" + str, str, "limit=20").map(new qcj() { // from class: l.sga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167839a.m145761ob(str, (pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public C22421c<Followship> m145743m7(String str, User user, boolean z, String str2) {
        return m145750n7(str, user, z, null, null, str2);
    }

    /* JADX INFO: renamed from: m8 */
    public final void m145744m8(Envelope envelope, String str, String str2) {
        if (((CommonData) envelope.getModuleData(CommonData.class)).users == null || ((CommonData) envelope.getModuleData(CommonData.class)).users.size() == 0) {
            MomentUserNullException.reportNulAlllUserMoment(str, str2);
            return;
        }
        if (!NullChecker.m82486a(((FeedData) envelope.getModuleData(FeedData.class)).moments) || ((FeedData) envelope.getModuleData(FeedData.class)).moments.size() <= 0) {
            return;
        }
        for (int i = 0; i < ((FeedData) envelope.getModuleData(FeedData.class)).moments.size(); i++) {
            Moment moment = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(i);
            if (m145688e8(moment.owner) == null) {
                String str3 = moment.f56859id;
                if ("1".equals(str3.substring(str3.length() - 1))) {
                    MomentUserNullException.reportNullUserMoment(moment.f56859id, str, str2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final /* synthetic */ C22421c m145745m9(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.vfa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117246k(str)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.xfa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194018a.m145738l9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ma */
    public final /* synthetic */ Envelope m145746ma(Envelope envelope) {
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: mb */
    public final /* synthetic */ C22421c m145747mb(final String str, final String str2, final MomentMessage momentMessage) {
        return scheduled("postTheTopicComment", -1, new pcj() { // from class: l.aea
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f70775a.m145740lb(momentMessage, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: mc */
    public C22421c<bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>>> m145748mc(String str) {
        return m145755nc(str, "");
    }

    /* JADX INFO: renamed from: md */
    public C22421c<bkj0<Links, List<Moment>, List<TopicMoment>>> m145749md(final String str, String str2, final jv00 jv00Var) {
        return scheduled(str2, 0, new pcj() { // from class: l.oaa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f145673a.m145775qb(str, jv00Var);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public C22421c<Followship> m145750n7(String str, User user, boolean z, String str2, String str3, @Nullable String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("page_id", str4);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        return m145708h7(str, user, z, str2, str3, "pagesource=" + jSONObject.toString());
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ List m145751n8(Envelope envelope) {
        mrb0.m159640R(envelope.counters);
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        List<Group> list = ((FeedData) envelope.getModuleData(FeedData.class)).groups;
        ArrayList arrayList = new ArrayList();
        for (Group group : list) {
            if (TEnum.equals(group.groupType, "group")) {
                arrayList.add(group);
            }
            if (cmg.m111187O() && TEnum.equals(group.groupType, GroupType.anonymous_group)) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n9 */
    public final /* synthetic */ Envelope m145752n9(Envelope envelope) {
        m145791sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        Map<String, BubbleInfo> mapM222761e = this.f121358i1.m222761e();
        if (list.size() <= 0) {
            this.f121358i1.m137019l(mapM222761e);
            return envelope;
        }
        mapM222761e.put(FeedModule.m61406H().me_().f56859id, list.get(0));
        this.f121358i1.m137019l(mapM222761e);
        return envelope;
    }

    /* JADX INFO: renamed from: na */
    public final /* synthetic */ C22421c m145753na(final String str) {
        return new ti20(new pcj() { // from class: l.aba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.bba
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f75779a.m145746ma((Envelope) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: nb */
    public final /* synthetic */ uxj0 m145754nb(String str, pf60 pf60Var) {
        pf60<Links, List<TopicMoment>> pf60VarM222761e = str.equals("suggest") ? this.f121350e1.m222761e() : this.f121344b1.m222761e();
        final List<TopicMoment> arrayList = pf60VarM222761e == null ? new ArrayList<>() : pf60VarM222761e.f152157b;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.addAll(jyb.m147522n((Collection) pf60Var.f152157b, new qcj() { // from class: l.cea
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayList.contains((TopicMoment) obj));
            }
        }));
        if (str.equals("suggest")) {
            this.f121350e1.m137019l(new pf60<>((Links) pf60Var.f152156a, arrayList));
        } else {
            this.f121344b1.m137019l(new pf60<>((Links) pf60Var.f152156a, arrayList));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: nc */
    public C22421c<bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>>> m145755nc(final String str, final String str2) {
        return scheduled("operationGuides/search" + str, 0, new pcj() { // from class: l.hia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f109998a.m145697fa(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: nd */
    public C22421c<pf60<Links, List<MomentMessage>>> m145756nd(final String str, final String str2, final Links links) {
        return scheduled("topic_vote_comment_next", 0, new pcj() { // from class: l.iia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f115062a.m145789sb(str, str2, links);
            }
        });
    }

    /* JADX INFO: renamed from: o7 */
    public C22421c<pf60<Links, List<Moment>>> m145757o7(Links links, jv00 jv00Var) {
        String string;
        String str;
        if (TextUtils.isEmpty(FriendsFeedViewPagerFrag.f42341F0) || !cmg.m111175D()) {
            string = null;
        } else {
            string = FriendsFeedViewPagerFrag.f42341F0;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gender", FriendsFeedViewPagerFrag.f42341F0);
                string = jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dog.m117227a0(links.next));
        if (TextUtils.isEmpty(string)) {
            str = "";
        } else {
            str = "&settings=" + string;
        }
        sb.append(str);
        return m145650Yb(sb.toString(), "friends/next", jv00Var);
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ C22421c m145758o8(final String str) {
        return new ti20(new pcj() { // from class: l.wja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.yja
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f200282a.m145751n8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o9 */
    public final /* synthetic */ C22421c m145759o9(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.kba
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.lba
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130794a.m145752n9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: oa */
    public final /* synthetic */ void m145760oa(Moment moment) {
        m145509Ea(moment);
        this.f121367n0.m137019l(moment);
    }

    /* JADX INFO: renamed from: ob */
    public final /* synthetic */ uxj0 m145761ob(String str, pf60 pf60Var) {
        if (NullChecker.m82487b(pf60Var.f152157b)) {
            if (str.equals("nearby") || str.equals("recommend")) {
                this.f121348d1.m137019l(pf60Var);
            } else if (str.equals("suggest")) {
                this.f121350e1.m137019l(pf60Var);
            } else {
                this.f121344b1.m137019l(pf60Var);
                m145560Lc((List) pf60Var.f152157b);
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: oc */
    public C22421c<Envelope> m145762oc() {
        return scheduled("feed-counters", -1, new pcj() { // from class: l.tda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.hja
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117263t("/feed-counters")).m209037k(z1d0.create(Network.JSON, "{\"unreadLikeFeeds\": 0}")).m209028b();
                    }
                }).map(new qcj() { // from class: l.ija
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return jka.m145344f1((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: od */
    public C22421c<bkj0<Links, List<TopicMoment>, List<MomentMessage>>> m145763od(final String str, final String str2) {
        return scheduled("topic_vote_comment_pre", 0, new pcj() { // from class: l.lfa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f131834a.m145803ub(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public C22421c<pf60<Links, List<Moment>>> m145764p7(jv00 jv00Var) {
        String string;
        String str;
        if (TextUtils.isEmpty(FriendsFeedViewPagerFrag.f42341F0) || !cmg.m111175D()) {
            string = null;
        } else {
            string = FriendsFeedViewPagerFrag.f42341F0;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gender", string);
                string = jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        String str2 = "";
        if (FeedModule.m61406H().mo31711Md()) {
            String strMo31816qp = FeedModule.m61406H().mo31816qp();
            if (TextUtils.isEmpty(strMo31816qp)) {
                str = "";
            } else {
                str = "&query=" + strMo31816qp;
            }
            FeedModule.m61406H().mo31677B6();
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dog.m117227a0("limit=20"));
        if (!TextUtils.isEmpty(string)) {
            str2 = "&settings=" + string;
        }
        sb.append(str2);
        sb.append(str);
        return m145664ac(sb.toString(), "friends/previous", false, null, jv00Var);
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ uxj0 m145765p8(MomentMessage momentMessage, Envelope envelope) {
        Moment moment = this.f121357i0.get(momentMessage.moment);
        PartialIdList partialIdList = moment.messages;
        partialIdList.count--;
        partialIdList.ids.remove(momentMessage.f56856id);
        this.f121357i0.put(momentMessage.moment, moment);
        f121282L1 = jyb.m147494Y(momentMessage.moment, 2);
        this.f121363l0.m137019l(this.f121357i0);
        this.f121309K0.m137019l(momentMessage);
        mrb0.m159641S(envelope);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: p9 */
    public final /* synthetic */ uxj0 m145766p9(Envelope envelope) {
        mrb0.m159640R(envelope.counters);
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: pa */
    public final /* synthetic */ void m145767pa(Moment moment) {
        m145509Ea(moment);
        this.f121363l0.m137019l(this.f121357i0);
    }

    /* JADX INFO: renamed from: pb */
    public final /* synthetic */ bkj0 m145768pb(jv00 jv00Var, Envelope envelope) {
        if (NullChecker.m82486a(jv00Var)) {
            jv00Var.mo66887c(envelope);
        }
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        List<BubbleInfo> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (cmg.m111218k0() && NullChecker.m82486a(list) && !jyb.m147479J(list2)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).states.addAll(list2);
            }
        }
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m145589Q6(envelope, false));
        return new bkj0(envelope.pagination.links, arrayList, ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
    }

    /* JADX INFO: renamed from: pc */
    public C22421c<Envelope> m145769pc(String str) {
        return m145776qc(jyb.m147507f0(str));
    }

    /* JADX INFO: renamed from: pd */
    public C22421c<uxj0> m145770pd() {
        return scheduled("un/read/fans/patch", -1, new pcj() { // from class: l.bja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.bia
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117242i() + "&method=patch").m209038l(z1d0.create(Network.JSON, "{\"read\": true}")).m209028b();
                    }
                }).compose(dog.m117253n0()).map(new qcj() { // from class: l.cia
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return jka.m145461x5((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public C22421c<List<Group>> m145771q7(String str, int i) {
        return m145482B6(dog.m117220U(str, i), "get/all/group" + str + i);
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ C22421c m145772q8(final MomentMessage momentMessage) {
        final MomentMessage momentMessage2 = new MomentMessage();
        momentMessage2.recalled = Boolean.TRUE;
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.nga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                MomentMessage momentMessage3 = momentMessage;
                return dog.f89929G.auth().m209043q(dog.m117264u(momentMessage3.cid, momentMessage3.f56856id) + "&method=patch").m209038l(z1d0.create(Network.JSON, momentMessage2.toJson())).m209028b();
            }
        }, 0).compose(dog.m117253n0()).map(new qcj() { // from class: l.oga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147199a.m145765p8(momentMessage, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q9 */
    public final /* synthetic */ C22421c m145773q9(final String str) {
        return new ti20(new pcj() { // from class: l.xda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.yda
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f198585a.m145766p9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: qa */
    public final /* synthetic */ Moment m145774qa(final Moment moment, boolean z) throws Exception {
        Picture picture;
        if (!TextUtils.isEmpty(moment.f56859id)) {
            final Moment momentMo225055clone = moment.mo225055clone();
            momentMo225055clone.localCreatedSession = App.f16092i.get().intValue();
            l9c.m153394o().m153397B(new x20() { // from class: l.wca
                @Override // p153l.x20
                public final void call() {
                    FeedModule.f39708i.f160257c.updateBy_id(momentMo225055clone);
                }
            });
            l51.m152893M(new Runnable() { // from class: l.yca
                @Override // java.lang.Runnable
                public final void run() {
                    this.f198398a.m145767pa(momentMo225055clone);
                }
            });
            return momentMo225055clone;
        }
        moment.createdTime = dog.m117260r0();
        moment.owner = FeedModule.m61405F().userId();
        if (moment.value == null) {
            moment.value = "";
        }
        moment.likes = PartialIdList.new_();
        moment.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
        if (TEnum.equals(moment.userSetVisibility, "unknown_")) {
            moment.userSetVisibility = UserSetVisibility.get(nt00.m164664k().m164673p(moment));
        }
        if (NullChecker.m82487b(moment.media)) {
            for (Media media : moment.media) {
                TrackMediaUploadUtil.m81479a0(media);
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Picture) {
                        Picture picture2 = (Picture) media;
                        if (picture2.size == null || media.mediaType == null) {
                            sim simVar = new sim(oki.m168038z(media.url));
                            picture2.size = new Dimension(simVar.f168843d);
                            media.mediaType = simVar.f168842c;
                        }
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        vel0 vel0Var = new vel0(oki.m168038z(video.url));
                        if (!vel0Var.f183811g && video.isFromNewCamera) {
                            video.hasOriginalSound = false;
                        }
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            wel0 wel0Var = new wel0(vel0Var, false, false);
                            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                            video.size = new Dimension(wel0Var.m206021m());
                            video.duration = wel0Var.f188702b;
                            Picture picture3 = video.cover;
                            if (picture3 == null || picture3.url == null) {
                                video.processStartTime = SystemClock.uptimeMillis();
                                video.cover = new Picture();
                                try {
                                    boolean zM82486a = NullChecker.m82486a(video.cutting);
                                    Picture picture4 = video.cover;
                                    if (zM82486a) {
                                        picture4.url = oki.m168011B(wel0Var.m206014e((int) video.cutting.start));
                                    } else {
                                        picture4.url = oki.m168011B(wel0Var.m206013c(0));
                                    }
                                    video.cover.size = new Dimension(wel0Var.m206019k());
                                    video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                    uqb0.f180374G.m127160x0(video.url);
                                } catch (Exception e) {
                                    CrashHelper.m82479c(e);
                                    throw new TrackMediaUploadUtil.GetVideoFrameException(e.getMessage(), e.getCause());
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            moment.media = new ArrayList();
        }
        m145843zd(z, 1, moment);
        l9c.m153394o().m153397B(new x20() { // from class: l.uca
            @Override // p153l.x20
            public final void call() {
                jka.m145178D3(moment);
            }
        });
        l51.m152893M(new Runnable() { // from class: l.vca
            @Override // java.lang.Runnable
            public final void run() {
                this.f183350a.m145760oa(moment);
            }
        });
        return moment;
    }

    /* JADX INFO: renamed from: qb */
    public final /* synthetic */ C22421c m145775qb(final String str, final jv00 jv00Var) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.sea
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }, dog.f89926D | dog.f89927E).compose(dog.m117253n0()).map(new qcj() { // from class: l.tea
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f173451a.m145768pb(jv00Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: qc */
    public final C22421c<Envelope> m145776qc(final List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(list.get(i));
            }
            jSONObject.put("momentIds", jSONArray);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        final String string = jSONObject.toString();
        return scheduled("view-record", -1, new pcj() { // from class: l.qia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f157807a.m145711ha(string, list);
            }
        }, false);
    }

    /* JADX INFO: renamed from: qd */
    public C22421c<uxj0> m145777qd(String str, String str2, String str3, String str4) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sourceId", str);
            jSONObject.put("sourceOwnerId", str2);
            jSONObject.put("sourceType", str4);
            jSONObject.put(OMSTemplateModeType.page, str3);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        final String strM117246k = dog.m117246k("/moment-feedback");
        return FeedModule.f39703d.scheduled("uninterested/moment", -1, new pcj() { // from class: l.dga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f88272a.m145817wb(jSONObject, strM117246k);
            }
        });
    }

    /* JADX INFO: renamed from: r7 */
    public C22421c<pf60<Links, List<User>>> m145778r7(String str, String str2, int i, String str3) {
        final String str4 = "/users/" + str + "/moments/" + str2 + "/likes?search=attitude&query=" + i + "&" + str3;
        return scheduled(str4, 0, new pcj() { // from class: l.fha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f99022a.m145654Z8(str4);
            }
        }, false);
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ bkj0 m145779r8(Envelope envelope) {
        m145798td(envelope, false);
        mrb0.m159641S(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return new bkj0(envelope.pagination.links, feedData.messages, feedData.stickers);
    }

    /* JADX INFO: renamed from: r9 */
    public final /* synthetic */ Envelope m145780r9(Envelope envelope) {
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ra */
    public final /* synthetic */ C22421c m145781ra(final Moment moment, final boolean z) {
        return C22421c.fromCallable(new Callable() { // from class: l.kaa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f124642a.m145774qa(moment, z);
            }
        });
    }

    /* JADX INFO: renamed from: rb */
    public final /* synthetic */ pf60 m145782rb(Envelope envelope) {
        m145791sd(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(feedData.comments);
        return new pf60(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: rc */
    public C22421c<pf60<Links, List<Moment>>> m145783rc(String str, boolean z, String str2) {
        return m145657Zb(dog.m117217R(str, dog.f89955z, z, str2), m145604S7(str, str2), true, str);
    }

    /* JADX INFO: renamed from: rd */
    public void m145784rd(String str) {
        Moment moment = this.f121357i0.get(str);
        if (!NullChecker.m82486a(moment) || TEnum.equals(moment.userSetVisibility, "selfOnly")) {
            return;
        }
        moment.userSetVisibility = UserSetVisibility.get("selfOnly");
        this.f121357i0.put(moment.f56859id, moment);
        this.f121363l0.m137019l(this.f121357i0);
    }

    /* JADX INFO: renamed from: s7 */
    public C22421c<bkj0<Links, List<User>, AttitudeSourceCatCount>> m145785s7(String str, String str2, int i) {
        final String str3 = "/users/" + str + "/moments/" + str2 + "/likes?search=attitude&query=" + i + "&limit=50";
        return scheduled(str3, 0, new pcj() { // from class: l.iha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f114880a.m145668b9(str3);
            }
        }, false);
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ C22421c m145786s8(final String str, final String str2, final Links links) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.nda
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117201B(str, str2, links.next)).m209032f().m209028b();
            }
        }, dog.f89926D).compose(dog.m117253n0()).map(new qcj() { // from class: l.oda
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f146860a.m145779r8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s9 */
    public final /* synthetic */ C22421c m145787s9(final String str) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.g8a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }, dog.f89926D | dog.f89927E).compose(dog.m117253n0()).map(new qcj() { // from class: l.h8a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108221a.m145780r9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: sa */
    public final /* synthetic */ void m145788sa(Moment moment, List list) {
        Moment momentMo225055clone = moment.mo225055clone();
        momentMo225055clone.media = new ArrayList(list);
        m145509Ea(momentMo225055clone);
        this.f121363l0.m137019l(this.f121357i0);
    }

    /* JADX INFO: renamed from: sb */
    public final /* synthetic */ C22421c m145789sb(final String str, final String str2, final Links links) {
        return new ti20(new pcj() { // from class: l.jja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117245j0(str, str2, links.next)).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.kja
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f127084a.m145782rb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: sc */
    public C22421c<pf60<Links, List<Moment>>> m145790sc(String str, Links links, boolean z, jv00 jv00Var) {
        return m145650Yb(dog.m117215P(str, links.next, z), str + "/personal/feed/next", jv00Var);
    }

    /* JADX INFO: renamed from: sd */
    public void m145791sd(Envelope envelope) {
        m145798td(envelope, true);
    }

    /* JADX INFO: renamed from: t7 */
    public C22507a<TopicOperations> m145792t7() {
        return this.f121352f1;
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ MomentMessage m145793t8(MomentMessage momentMessage, String str) throws Exception {
        momentMessage.owner = FeedModule.m61405F().userId();
        momentMessage.createdTime = dog.m117260r0() + 10000.0d;
        if (TextUtils.isEmpty(momentMessage.api_only_otherUser)) {
            momentMessage.cid = str;
        } else {
            momentMessage.cid = momentMessage.api_only_otherUser;
        }
        vxd0 vxd0Var = App.f16092i;
        momentMessage.f56856id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        if (momentMessage.value == null) {
            momentMessage.value = "";
        }
        momentMessage.localCreatedSession = vxd0Var.get().intValue();
        this.f121300H0.put(momentMessage.f56856id, momentMessage);
        Moment momentM112661x0 = this.f121357i0.get(momentMessage.moment);
        if (momentM112661x0 == null && FeedModule.f39707h.m112657t0(Moments.TYPE, momentMessage.moment)) {
            momentM112661x0 = FeedModule.f39707h.m112661x0(momentMessage.moment);
        }
        PartialIdList partialIdList = momentM112661x0.messages;
        partialIdList.count++;
        partialIdList.ids.add(momentMessage.f56856id);
        this.f121357i0.put(momentMessage.moment, momentM112661x0);
        f121282L1 = jyb.m147494Y(momentMessage.moment, 1);
        this.f121363l0.m137019l(this.f121357i0);
        this.f121306J0.m137019l(momentMessage);
        return momentMessage;
    }

    /* JADX INFO: renamed from: t9 */
    public final /* synthetic */ pf60 m145794t9(Envelope envelope) {
        m145791sd(envelope);
        if (!NullChecker.m82486a(envelope.getModuleData(FeedData.class)) || jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).moments) || jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        ArrayList arrayList2 = new ArrayList(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
        if (NullChecker.m82486a(envelope.getModuleData(CommonData.class)) && !jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            ArrayList arrayList3 = new ArrayList(((CommonData) envelope.getModuleData(CommonData.class)).users);
            if (!jyb.m147479J(arrayList3)) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    m145481Ad((User) it.next());
                }
            }
        }
        return new pf60(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ta */
    public final /* synthetic */ Boolean m145795ta(String str, List list) {
        return Boolean.valueOf(m145181Db(str));
    }

    /* JADX INFO: renamed from: tb */
    public final /* synthetic */ bkj0 m145796tb(Envelope envelope) {
        m145791sd(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(feedData.comments);
        return new bkj0(envelope.pagination.links, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: tc */
    public C22421c<pf60<Links, List<Moment>>> m145797tc(String str, Links links, String str2) {
        return m145643Xb(dog.m117216Q(str, links.next, str2), str + "/personal/feed/next" + System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: td */
    public void m145798td(Envelope envelope, boolean z) {
        boolean z2;
        boolean z3;
        Map<String, List<PostBasePopWindow>> map;
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        List<RawFeed> list = feedData.feeds;
        if (!jyb.m147479J(list)) {
            for (RawFeed rawFeed : list) {
                if (NullChecker.m82486a(rawFeed.extra) && NullChecker.m82486a(rawFeed.extra.report)) {
                    this.f121296F1.put(rawFeed.f40091id, rawFeed.extra.report);
                }
            }
        }
        if (!NullChecker.m82487b(((FeedData) envelope.getModuleData(FeedData.class)).moments) || ((FeedData) envelope.getModuleData(FeedData.class)).moments.size() <= 0) {
            z2 = false;
        } else {
            z2 = false;
            for (int i = 0; i < ((FeedData) envelope.getModuleData(FeedData.class)).moments.size(); i++) {
                Moment moment = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(i);
                Moment moment2 = this.f121357i0.get(moment.f56859id);
                if (moment2 != null) {
                    if (moment.views <= 0 && NullChecker.m82486a(moment2)) {
                        moment.views = moment2.views;
                    }
                    if (moment.getRecommendTime() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && NullChecker.m82486a(moment2) && moment2.getRecommendTime() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        moment.setRecommendTime(moment2.getRecommendTime());
                    }
                    if (NullChecker.m82486a(moment2.thirdShareSource) && !TextUtils.isEmpty(moment2.thirdShareSource.sourceId)) {
                        moment.thirdShareSource = moment2.thirdShareSource;
                    }
                    MomentViewerBox momentViewerBoxMo225055clone = moment.momentViewer.mo225055clone();
                    moment.mergeData(moment2, moment2.momentValue);
                    moment.momentViewer = momentViewerBoxMo225055clone;
                    if (!moment.equals(moment2)) {
                        z2 = true;
                    }
                    if (!TextUtils.isEmpty(moment2.getLocationName()) && TextUtils.isEmpty(moment.getLocationName())) {
                        moment.setLocationName(moment2.getLocationName());
                    }
                    if (!TextUtils.isEmpty(moment2.getRecommendReason()) && TextUtils.isEmpty(moment.getRecommendReason())) {
                        moment.setRecommendReason(moment2.getRecommendReason());
                    }
                    if (!TextUtils.isEmpty(moment2.getRecommendReasonIcon()) && TextUtils.isEmpty(moment.getRecommendReasonIcon())) {
                        moment.setRecommendReasonIcon(moment2.getRecommendReasonIcon());
                    }
                    if (!TextUtils.isEmpty(moment2.getRecommendReasonBackgroundColor()) && TextUtils.isEmpty(moment.getRecommendReasonBackgroundColor())) {
                        moment.setRecommendReasonBackgroundColor(moment2.getRecommendReasonBackgroundColor());
                    }
                    if (!TextUtils.isEmpty(moment2.getRecommendReasonFontColor()) && TextUtils.isEmpty(moment.getRecommendReasonFontColor())) {
                        moment.setRecommendReasonFontColor(moment2.getRecommendReasonFontColor());
                    }
                    if (!TextUtils.isEmpty(moment2.getActivityName()) && TextUtils.isEmpty(moment.getActivityName())) {
                        moment.setActivityName(moment2.getActivityName());
                    }
                    LiveCircleExtInfo liveCircleExtInfo = moment2.liveCircleExtInfo;
                    if (liveCircleExtInfo != null) {
                        moment.liveCircleExtInfo = liveCircleExtInfo;
                    }
                }
                this.f121357i0.put(moment.f56859id, moment);
                if (FeedModule.f39707h.m112657t0(Moments.TYPE, moment.f56859id)) {
                    FeedModule.f39707h.m112654A0(moment);
                }
            }
        }
        if (NullChecker.m82487b(feedData.messages) && feedData.messages.size() > 0) {
            for (int i2 = 0; i2 < feedData.messages.size(); i2++) {
                MomentMessage momentMessage = feedData.messages.get(i2);
                MomentMessage momentMessage2 = this.f121300H0.get(momentMessage.f56856id);
                if (momentMessage2 != null) {
                    momentMessage.mergeData(momentMessage2);
                }
                this.f121300H0.put(momentMessage.f56856id, momentMessage);
            }
        }
        if (NullChecker.m82487b(feedData.stickers) && feedData.stickers.size() > 0) {
            for (int i3 = 0; i3 < feedData.stickers.size(); i3++) {
                StickerInfo stickerInfo = feedData.stickers.get(i3);
                StickerInfo stickerInfo2 = this.f121303I0.get(stickerInfo.f56859id);
                if (stickerInfo2 != null) {
                    stickerInfo.mergeData(stickerInfo2);
                }
                this.f121303I0.put(stickerInfo.f56859id, stickerInfo);
            }
        }
        if (NullChecker.m82486a(feedData.groups) && feedData.groups.size() > 0) {
            for (int i4 = 0; i4 < feedData.groups.size(); i4++) {
                Group group = feedData.groups.get(i4);
                Group group2 = this.f121312L0.get(group.f56859id);
                if (group2 != null) {
                    group.mergeData(group2);
                }
                this.f121312L0.put(group.f56859id, group);
            }
        }
        if (!jyb.m147479J(feedData.notifyUsers)) {
            this.f121361k0.clear();
            for (int i5 = 0; i5 < feedData.notifyUsers.size(); i5++) {
                NotifyUsers notifyUsers = feedData.notifyUsers.get(i5);
                this.f121361k0.add(notifyUsers);
                NotifyUsers notifyUsers2 = this.f121359j0.get(notifyUsers.userId);
                if (notifyUsers2 != null) {
                    notifyUsers.mergeData(notifyUsers2);
                }
                this.f121359j0.put(notifyUsers.userId, notifyUsers);
            }
        }
        if (NullChecker.m82486a(feedData.states) && feedData.states.size() > 0) {
            for (int i6 = 0; i6 < feedData.states.size(); i6++) {
                BubbleInfo bubbleInfo = feedData.states.get(i6);
                BubbleInfo bubbleInfo2 = this.f121314M0.get(bubbleInfo.owner.f39651id);
                if (bubbleInfo2 != null) {
                    bubbleInfo.mergeData(bubbleInfo2);
                }
                this.f121314M0.put(bubbleInfo.owner.f39651id, bubbleInfo);
            }
        }
        if (!NullChecker.m82487b(((CommonData) envelope.getModuleData(CommonData.class)).users) || ((CommonData) envelope.getModuleData(CommonData.class)).users.size() <= 0) {
            z3 = false;
        } else {
            z3 = false;
            for (int i7 = 0; i7 < ((CommonData) envelope.getModuleData(CommonData.class)).users.size(); i7++) {
                User user = ((CommonData) envelope.getModuleData(CommonData.class)).users.get(i7);
                Map<String, User> map2 = this.f121285A0;
                if (z) {
                    User user2 = map2.get(user.f56859id);
                    if (user2 != null) {
                        if (user.localFollowship == null && NullChecker.m82486a(user2)) {
                            user.localFollowship = this.f121285A0.get(user.f56859id).localFollowship;
                        }
                        if (user.localRelationship == null && NullChecker.m82486a(this.f121285A0.get(user.f56859id))) {
                            user.localRelationship = this.f121285A0.get(user.f56859id).localRelationship;
                        }
                        if (NullChecker.m82486a(this.f121285A0.get(user.f56859id))) {
                            user.mergeData(this.f121285A0.get(user.f56859id));
                        }
                        if (!user.equals(this.f121285A0.get(user.f56859id))) {
                            z3 = true;
                        }
                    }
                    this.f121285A0.put(user.f56859id, user);
                } else if (!map2.containsKey(user.f56859id)) {
                    this.f121285A0.put(user.f56859id, user);
                }
            }
        }
        if (NullChecker.m82487b(((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos) && ((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos.size() > 0) {
            for (int i8 = 0; i8 < ((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos.size(); i8++) {
                MomentVoiceLiveInfos momentVoiceLiveInfos = ((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos.get(i8);
                MomentVoiceLiveInfos momentVoiceLiveInfos2 = this.f121355h0.get(momentVoiceLiveInfos.roomID);
                if (momentVoiceLiveInfos2 != null) {
                    momentVoiceLiveInfos.mergeData(momentVoiceLiveInfos2);
                }
                this.f121355h0.put(momentVoiceLiveInfos.roomID, momentVoiceLiveInfos);
            }
        }
        if (!jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).momentPopWindows)) {
            ArrayList arrayList = new ArrayList();
            List<PostBasePopWindow> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).momentPopWindows;
            for (int i9 = 0; i9 < list2.size(); i9++) {
                String str = list2.get(i9).basic.pageId;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                String str2 = (String) arrayList.get(i10);
                List<PostBasePopWindow> arrayList2 = null;
                int i11 = 0;
                while (true) {
                    int size = list2.size();
                    map = this.f121353g0;
                    if (i11 < size) {
                        arrayList2 = map.get(str2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        final PostBasePopWindow postBasePopWindow = list2.get(i11);
                        PostBasePopWindow postBasePopWindow2 = (PostBasePopWindow) jyb.m147529r(arrayList2, new qcj() { // from class: l.zaa
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((PostBasePopWindow) obj).basic.name, postBasePopWindow.basic.name));
                            }
                        });
                        if (postBasePopWindow2 != null) {
                            postBasePopWindow.mergeData(postBasePopWindow2);
                            arrayList2.remove(postBasePopWindow2);
                        }
                        arrayList2.add(postBasePopWindow);
                        i11++;
                    }
                }
                map.put(str2, arrayList2);
            }
        }
        if (z2) {
            this.f121363l0.m137019l(this.f121357i0);
        }
        if (z3) {
            this.f121289C0.m137019l(this.f121285A0);
        }
    }

    /* JADX INFO: renamed from: u7 */
    public Group m145799u7(String str) {
        return this.f121312L0.get(str);
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ C22421c m145800u8(final MomentMessage momentMessage, final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.cga
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f81639a.m145793t8(momentMessage, str);
            }
        });
    }

    /* JADX INFO: renamed from: u9 */
    public final /* synthetic */ C22421c m145801u9(final String str) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.qca
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }, dog.f89926D | dog.f89927E).compose(dog.m117253n0()).map(new qcj() { // from class: l.rca
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162080a.m145794t9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ua */
    public final /* synthetic */ Moment m145802ua(Moment moment, boolean z, Moment moment2, List list) {
        if (moment.media.size() > 0 && (moment.media.get(0) instanceof Video)) {
            Video video = (Video) moment.media.get(0);
            if (video.isFromNewCamera) {
                if (NullChecker.m82486a(video.audio)) {
                    moment.musicId = video.audio.musicId;
                }
                if (list.size() > 0 && (list.get(0) instanceof Video)) {
                    Video video2 = (Video) list.get(0);
                    GifMedia gifMediaNew_ = GifMedia.new_();
                    video2.gif = gifMediaNew_;
                    gifMediaNew_.url = video2.url;
                    gifMediaNew_.type = "image/gif";
                    AudioMedia audioMediaNew_ = AudioMedia.new_();
                    video2.audio = audioMediaNew_;
                    if (video.hasOriginalSound || video.isLocalMusic) {
                        audioMediaNew_.url = video2.url;
                        audioMediaNew_.type = "audio/mp3";
                    }
                }
            }
        }
        m145843zd(z, 3, moment2);
        Moment momentMo225055clone = moment.mo225055clone();
        momentMo225055clone.media = new ArrayList(list);
        m145509Ea(momentMo225055clone);
        this.f121363l0.m137019l(this.f121357i0);
        return momentMo225055clone;
    }

    /* JADX INFO: renamed from: ub */
    public final /* synthetic */ C22421c m145803ub(final String str, final String str2) {
        return new ti20(new pcj() { // from class: l.lia
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117245j0(str, str2, null)).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.mia
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f136940a.m145796tb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: uc */
    public C22421c<pf60<Links, List<Moment>>> m145804uc(String str, boolean z, jv00 jv00Var, String str2) {
        return m145664ac(dog.m117218S(str, dog.f89955z, z, str2), m145611T7(str), true, str, jv00Var);
    }

    /* JADX INFO: renamed from: ud */
    public void m145805ud(long j) {
        this.f121340Z0.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: v7 */
    public C22421c<Envelope> m145806v7() {
        return scheduled("meets", 0, new pcj() { // from class: l.zha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f204390a.m145682d9();
            }
        }, true);
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m145807v8(MomentMessage momentMessage, String str, String str2, Throwable th) {
        zzg.m222255g(false, th);
        MomentMessage momentMessage2 = this.f121300H0.get(momentMessage.f56856id);
        momentMessage2.localCreatedSession = -App.f16092i.get().intValue();
        this.f121300H0.put(momentMessage.f56856id, momentMessage2);
        Moment moment = this.f121357i0.get(momentMessage2.moment);
        moment.messages.ids.remove(momentMessage2.f56856id);
        PartialIdList partialIdList = moment.messages;
        int i = partialIdList.count;
        if (i > 0) {
            partialIdList.count = i - 1;
        }
        this.f121357i0.put(momentMessage2.moment, moment);
        f121282L1 = jyb.m147494Y(momentMessage2.moment, 2);
        this.f121363l0.m137019l(this.f121357i0);
        User userM145688e8 = FeedModule.f39703d.m145688e8(str);
        i4g0.m138495D("e_message_send", str2, new pf60("page_id", str2), new pf60(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, momentMessage.f56856id), new pf60("message_send_status", "fail"), new pf60(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, "moment_comment"), new pf60("receiver_user_id", str), new pf60("code", 0), new pf60(BLiveOperationTitleShowType.duration, ""), new pf60("matchfrom", NullChecker.m82486a(userM145688e8) ? userM145688e8.matchFromForTrack() : ""), new pf60("message_origin", NullChecker.m82486a(momentMessage.messageType) ? momentMessage.messageType : ""));
    }

    /* JADX INFO: renamed from: v9 */
    public final /* synthetic */ Envelope m145808v9(jv00 jv00Var, Envelope envelope) {
        if (NullChecker.m82486a(jv00Var)) {
            jv00Var.mo66886a(envelope);
        }
        m145791sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        if (list.size() > 0 && FeedModule.m61406H().me_().f56859id.equals(list.get(0).owner.f39651id)) {
            m145741lc(list.get(0));
        }
        return envelope;
    }

    /* JADX INFO: renamed from: va */
    public final /* synthetic */ C22421c m145809va(final String str, final boolean z, final Moment moment, final Moment moment2) {
        if (NullChecker.m82487b(moment2.media) && moment2.media.size() > 0) {
            return new i1y(new ArrayList(moment2.media), false, str, true).observeOn(fo0.m126432a()).doOnNext(new y20() { // from class: l.caa
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f80562a.m145788sa(moment2, (List) obj);
                }
            }).last().compose(psd0.m173606Q()).filter(new qcj() { // from class: l.daa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f85854a.m145795ta(str, (List) obj);
                }
            }).flatMap(new qcj() { // from class: l.eaa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return mrb0.m159634L((List) obj, "moment", null, UploadSource.get("moment"));
                }
            }).compose(dog.m117253n0()).map(new qcj() { // from class: l.faa
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f97965a.m145802ua(moment2, z, moment, (List) obj);
                }
            });
        }
        m145843zd(z, 3, moment);
        return C22421c.just(moment2);
    }

    /* JADX INFO: renamed from: vb */
    public final /* synthetic */ uxj0 m145810vb(Envelope envelope) {
        m145791sd(envelope);
        mrb0.m159641S(envelope);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: vc */
    public C22421c<pf60<Links, List<Moment>>> m145811vc(String str, String str2) {
        return m145657Zb(dog.m117216Q(str, dog.f89955z, str2), m145611T7(str) + System.currentTimeMillis(), true, str);
    }

    /* JADX INFO: renamed from: vd */
    public void m145812vd() {
        Double dM222761e = this.f121356h1.m222761e();
        if (!NullChecker.m82487b(dM222761e) || dM222761e.doubleValue() <= this.f121362k1.get().doubleValue()) {
            return;
        }
        this.f121362k1.put(dM222761e);
    }

    /* JADX INFO: renamed from: w7 */
    public Moment m145813w7(String str) {
        MomentFeedsExtra momentFeedsExtra;
        Moment momentM112661x0 = this.f121357i0.get(str);
        if (momentM112661x0 == null) {
            momentM112661x0 = FeedModule.f39707h.m112661x0(str);
        }
        if (momentM112661x0 != null) {
            RawFeed rawFeedM112660w0 = FeedModule.f39707h.m112660w0(str);
            if (rawFeedM112660w0 != null && (momentFeedsExtra = rawFeedM112660w0.extra) != null && !TextUtils.isEmpty(momentFeedsExtra.report)) {
                momentM112661x0.report = rawFeedM112660w0.extra.report;
                return momentM112661x0;
            }
            String str2 = this.f121296F1.get(str);
            if (!TextUtils.isEmpty(str2)) {
                momentM112661x0.report = str2;
            }
        }
        return momentM112661x0;
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ MomentMessage m145814w8(MomentMessage momentMessage, MomentMessage momentMessage2, String str, String str2, Envelope envelope) {
        String str3;
        boolean z;
        String str4;
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        m145791sd(envelope);
        MomentMessage momentMessage3 = feedData.messages.get(0);
        this.f121300H0.remove(momentMessage.f56856id);
        this.f121309K0.m137019l(momentMessage);
        this.f121300H0.put(momentMessage3.f56856id, momentMessage3);
        if (momentMessage3.isChildComment()) {
            momentMessage3.replyCommentId = momentMessage2.replyCommentId;
            if (NullChecker.m82487b(momentMessage3.commentInfo) && !TextUtils.isEmpty(momentMessage3.commentInfo.parentMessageId) && !momentMessage3.commentInfo.parentMessageId.equals("0")) {
                str4 = momentMessage3.commentInfo.parentMessageId;
                z = true;
            } else if (TextUtils.isEmpty(momentMessage3.parentCommentId) || momentMessage3.parentCommentId.equals("0")) {
                z = false;
                str4 = null;
            } else {
                str4 = momentMessage3.parentCommentId;
                z = false;
            }
            if (NullChecker.m82486a(str4)) {
                MomentMessage momentMessage4 = this.f121300H0.get(str4);
                if (NullChecker.m82486a(momentMessage4)) {
                    if (z) {
                        momentMessage4.commentInfo.subMessageIds.add(0, momentMessage3.f56856id);
                    } else {
                        momentMessage4.subCommentIds.add(0, momentMessage3.f56856id);
                    }
                    this.f121300H0.put(str4, momentMessage4);
                }
            }
        }
        this.f121306J0.m137019l(momentMessage3);
        Moment moment = this.f121357i0.get(momentMessage2.moment);
        moment.messages.ids.remove(momentMessage.f56856id);
        moment.messages.ids.add(momentMessage3.f56856id);
        this.f121357i0.put(momentMessage2.moment, moment);
        f121282L1 = jyb.m147494Y(momentMessage3.moment, 3);
        this.f121363l0.m137019l(this.f121357i0);
        mrb0.m159641S(envelope);
        User userM145688e8 = FeedModule.f39703d.m145688e8(str);
        if (!User.isMatched(userM145688e8)) {
            i4g0.m138495D("e_message_send", str2, new pf60("page_id", str2), new pf60(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, momentMessage2.f56856id), new pf60("message_send_status", "success"), new pf60(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, "moment_comment"), new pf60("receiver_user_id", str), new pf60("code", 1), new pf60(BLiveOperationTitleShowType.duration, ""), new pf60("matchfrom", NullChecker.m82486a(userM145688e8) ? userM145688e8.matchFromForTrack() : ""), new pf60("message_origin", NullChecker.m82486a(momentMessage2.messageType) ? momentMessage2.messageType : ""));
        }
        if (TextUtils.isEmpty(momentMessage2.api_only_otherUser)) {
            str3 = !TextUtils.isEmpty(str) ? str : null;
        } else {
            str3 = momentMessage2.api_only_otherUser;
        }
        TextUtils.equals(FeedModule.m61405F().userId(), str3);
        FeedModule.f39707h.m112654A0(moment);
        return momentMessage3;
    }

    /* JADX INFO: renamed from: w9 */
    public final /* synthetic */ C22421c m145815w9(final String str, final jv00 jv00Var) {
        return qi20.m176654a(new pcj() { // from class: l.maa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.naa
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f140995a.m145808v9(jv00Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wa */
    public final /* synthetic */ void m145816wa(String str, boolean z, Moment moment, final Throwable th) {
        MomentPostFailedExcepion.reportMomentPostFailed(th, true);
        i4g0.m138493B("e_post_moment_error", "post_error_feed_moments", jyb.m147494Y("error", th == null ? CardButtonsShowAndHideType.unknow : th.toString()));
        if (m145181Db(str)) {
            m145843zd(z, 5, null);
            Moment momentMo225055clone = this.f121357i0.get(moment.f56859id).mo225055clone();
            momentMo225055clone.localCreatedSession--;
            m145819wd(momentMo225055clone);
            m145509Ea(momentMo225055clone);
            this.f121363l0.m137019l(this.f121357i0);
            l51.m152893M(new Runnable() { // from class: l.l9a
                @Override // java.lang.Runnable
                public final void run() {
                    jka.m145429t1(th);
                }
            });
        }
    }

    /* JADX INFO: renamed from: wb */
    public final /* synthetic */ C22421c m145817wb(final JSONObject jSONObject, final String str) {
        return new ti20(new pcj() { // from class: l.qga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209043q(str).m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.rga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162988a.m145810vb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wc */
    public C22421c<bkj0<Links, List<User>, Integer>> m145818wc(final String str) {
        return scheduled("photo/album/activity/user/poll", 0, new pcj() { // from class: l.wfa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f188778a.m145725ja(str);
            }
        });
    }

    /* JADX INFO: renamed from: wd */
    public void m145819wd(final Moment moment) {
        if (NullChecker.m82487b(moment)) {
            now(C22421c.fromCallable(new Callable() { // from class: l.m8a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return jka.m145436u1(moment);
                }
            }).compose(dog.m117253n0()));
        }
    }

    /* JADX INFO: renamed from: x6 */
    public C22421c<pf60<Links, List<Moment>>> m145820x6(Links links, jv00 jv00Var, String str) {
        return m145650Yb(dog.m117219T(links.next, str), "activity/" + str + "/next", jv00Var);
    }

    /* JADX INFO: renamed from: x7 */
    public List<PostBasePopWindow> m145821x7(String str) {
        return this.f121353g0.get(str);
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ C22421c m145822x8(final String str, final MomentMessage momentMessage, final MomentMessage momentMessage2, final String str2, y20 y20Var) {
        return mrb0.m159632J(str, momentMessage).compose(dog.m117253n0()).flatMap(new qcj() { // from class: l.uga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145338e1((Envelope) obj);
            }
        }).map(new qcj() { // from class: l.vga
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184008a.m145814w8(momentMessage, momentMessage2, str, str2, (Envelope) obj);
            }
        }).doOnError(y20Var);
    }

    /* JADX INFO: renamed from: x9 */
    public final /* synthetic */ List m145823x9(Envelope envelope) {
        m145791sd(envelope);
        qn00 qn00Var = new qn00(12);
        qn00Var.m177166i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
        List<BubbleInfo> list = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (!jyb.m147479J(list)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setLocationName(m145625V7(list.get(i), qn00Var));
                list.get(i).setRecommendReason(m145632W7(list.get(i), qn00Var));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: xa */
    public final /* synthetic */ uxj0 m145824xa(boolean z, Moment moment, Moment moment2, Envelope envelope) {
        Moment moment3 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        m145843zd(z, 41, moment3);
        m145843zd(z, 4, null);
        this.f121357i0.remove(moment.f56859id);
        if (moment.f56859id.startsWith("fake_id_")) {
            this.f121328T0.remove(moment.f56859id);
        }
        this.f121371p0.m137019l(moment2);
        this.f121357i0.put(moment3.f56859id, moment3);
        this.f121367n0.m137019l(moment3);
        mrb0.m159636N(FeedModule.m61405F().userId(), false);
        mrb0.m159641S(envelope);
        moment.f56859id = moment3.f56859id;
        if (NullChecker.m82486a(envelope)) {
            int i = envelope.meta.code;
            Objects.requireNonNull(FeedModule.f39703d);
            if (i == 20102) {
                this.f121288B1.m137019l(moment3.f56859id);
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: xb */
    public final /* synthetic */ uxj0 m145825xb(Envelope envelope) {
        m145791sd(envelope);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: xc */
    public C22421c<bkj0<Links, List<mah>, Integer>> m145826xc(final String str) {
        return scheduled("photo/album/activity/user/poll/moment", 0, new pcj() { // from class: l.oja
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f147645a.m145739la(str);
            }
        });
    }

    /* JADX INFO: renamed from: xd */
    public C22421c<uxj0> m145827xd(final String str, final String str2, final String str3) {
        return scheduled("updateMomentAllowForward" + str + str2, -1, new pcj() { // from class: l.wga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f188923a.m145833yb(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: y6 */
    public C22421c<pf60<Links, List<Moment>>> m145828y6(jv00 jv00Var, String str) {
        return m145664ac(dog.m117219T("limit=20", str), "activity/" + str + "/previous", false, null, jv00Var);
    }

    /* JADX INFO: renamed from: y7 */
    public BubbleInfo m145829y7(String str) {
        return this.f121314M0.get(str);
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ C22421c m145830y8(final String str, final MomentMessage momentMessage, final String str2, final y20 y20Var, final MomentMessage momentMessage2) {
        return scheduled("postTheMessage", -1, new pcj() { // from class: l.pga
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f152245a.m145822x8(str, momentMessage2, momentMessage, str2, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: y9 */
    public final /* synthetic */ C22421c m145831y9() {
        return new ti20(new pcj() { // from class: l.a9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117246k("/states?search=quickchat&with=users")).m209032f().m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.c9a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f80315a.m145823x9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ya */
    public final /* synthetic */ C22421c m145832ya(final boolean z, final Moment moment, final Moment moment2, final boolean z2, y20 y20Var) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.gea
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                boolean z3 = z;
                Moment moment3 = moment;
                return dog.f89929G.auth().m209043q(dog.m117200A(z3, moment3.isNewUserAIMoment)).m209038l(z1d0.create(Network.JSON, moment3.toJson())).m209028b();
            }
        }, dog.f89927E).map(new qcj() { // from class: l.hea
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jka.m145212J0(moment2, (Envelope) obj);
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.iea
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f114559a.m145824xa(z2, moment2, moment, (Envelope) obj);
            }
        }).doOnError(y20Var);
    }

    /* JADX INFO: renamed from: yb */
    public final /* synthetic */ C22421c m145833yb(String str, String str2, final String str3) {
        final String strM117246k = dog.m117246k("/users/" + str + "/moments/" + str2);
        return new ti20(new pcj() { // from class: l.jha
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209037k(z1d0.create(Network.JSON, "{\"allowForward\": \"" + str3 + "\"}")).m209043q(strM117246k).m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.kha
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126707a.m145825xb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: yc */
    public C22421c<Envelope> m145834yc(final String str) {
        return scheduled("photo/album/activity/user/poll/moment", 0, new pcj() { // from class: l.g9a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f102775a.m145753na(str);
            }
        });
    }

    /* JADX INFO: renamed from: yd */
    public C22421c<uxj0> m145835yd(final String str, final String str2, final String str3) {
        return scheduled("updateMomentUserSetVisibility" + str + str2, -1, new pcj() { // from class: l.vea
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f183711a.m145479Ab(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public void m145836z6(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.f121293E0.contains(str)) {
            this.f121293E0.add(str);
        }
        if (this.f121293E0.size() >= 3) {
            ArrayList arrayList = new ArrayList(this.f121293E0);
            this.f121293E0.clear();
            m145574Nc(arrayList);
        }
    }

    /* JADX INFO: renamed from: z7 */
    public Long m145837z7() {
        return this.f121340Z0.get();
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ Envelope m145838z8(Envelope envelope) {
        m145791sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: z9 */
    public final /* synthetic */ User m145839z9(String str, Envelope envelope) {
        if (((CommonData) envelope.getModuleData(CommonData.class)).users.size() <= 0) {
            return m145688e8(str);
        }
        m145791sd(envelope);
        return m145688e8(((CommonData) envelope.getModuleData(CommonData.class)).users.get(0).f56859id);
    }

    /* JADX INFO: renamed from: za */
    public final /* synthetic */ C22421c m145840za(final boolean z, final Moment moment, final boolean z2, final y20 y20Var, final Moment moment2) {
        return scheduled("postTheMoment", -1, new pcj() { // from class: l.raa
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f161910a.m145832ya(z, moment2, moment, z2, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: zb */
    public final /* synthetic */ uxj0 m145841zb(Envelope envelope) {
        m145791sd(envelope);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: zc */
    public C22421c<pf60<Links, List<Moment>>> m145842zc(String str, Links links, jv00 jv00Var) {
        return m145650Yb(dog.m117235e0(str, links.next), "poi_location_feeds_next", jv00Var);
    }

    /* JADX INFO: renamed from: zd */
    public final void m145843zd(boolean z, int i, Moment moment) {
        if (z) {
            cn40.m111426z0(new pf60(Integer.valueOf(i), moment));
        } else {
            cn40.m111349A0(new pf60(Integer.valueOf(i), moment));
        }
    }
}
