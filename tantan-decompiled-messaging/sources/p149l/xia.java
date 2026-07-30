package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.JsonObject;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p046p1.mobile.putong.data.AudioMedia;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipCounter;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.GifMedia;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.LiveUserMask;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.NearbyLocation;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Room;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.VoiceLiveGame;
import com.p046p1.mobile.putong.data.VoiceRoomInfo;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.AttitudeSourceCatCount;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.FeedLiterature;
import com.p046p1.mobile.putong.feed.data.FeedLiteraturesComment;
import com.p046p1.mobile.putong.feed.data.FeedUserLiveLabel;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.data.GroupType;
import com.p046p1.mobile.putong.feed.data.GuideStatePostConfig;
import com.p046p1.mobile.putong.feed.data.LiveCircleBanner;
import com.p046p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p046p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p046p1.mobile.putong.feed.data.LiveMultiCallLiveSchema;
import com.p046p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.feed.data.MomentFeedsExtra;
import com.p046p1.mobile.putong.feed.data.MomentForwards;
import com.p046p1.mobile.putong.feed.data.MomentLevelGuides;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.MomentMessageType;
import com.p046p1.mobile.putong.feed.data.MomentSettings;
import com.p046p1.mobile.putong.feed.data.MomentViewerBox;
import com.p046p1.mobile.putong.feed.data.MomentVisibilityStatus;
import com.p046p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import com.p046p1.mobile.putong.feed.data.OnVoiceCall;
import com.p046p1.mobile.putong.feed.data.OperationType;
import com.p046p1.mobile.putong.feed.data.PersonAlbumBgInfo;
import com.p046p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.data.UserSetVisibility;
import com.p046p1.mobile.putong.feed.data.ViewersBox;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.feed.data.VoiceLiveMomentFeed;
import com.p046p1.mobile.putong.feed.data.VoteOptions;
import com.p046p1.mobile.putong.feed.helper.MomentUserNullException;
import com.p046p1.mobile.putong.feed.helper.exception.MomentPostFailedExcepion;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.FriendsFeedViewPagerFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
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
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes12.dex */
public class xia extends omg {

    /* JADX INFO: renamed from: L1 */
    public static j760<String, Integer> f192972L1;

    /* JADX INFO: renamed from: M1 */
    public static C22393b<Boolean> f192973M1 = C22393b.m221521b();

    /* JADX INFO: renamed from: N1 */
    public static Throwable f192974N1 = new Throwable("对方取消了关注，暂时无法聊天");

    /* JADX INFO: renamed from: A0 */
    public final Map<String, User> f192975A0;

    /* JADX INFO: renamed from: A1 */
    public C22392a<roj0> f192976A1;

    /* JADX INFO: renamed from: B0 */
    public C22393b<String> f192977B0;

    /* JADX INFO: renamed from: B1 */
    public C22393b<String> f192978B1;

    /* JADX INFO: renamed from: C0 */
    public C22393b<Map<String, User>> f192979C0;

    /* JADX INFO: renamed from: C1 */
    public C22393b<roj0> f192980C1;

    /* JADX INFO: renamed from: D0 */
    public List<String> f192981D0;

    /* JADX INFO: renamed from: D1 */
    public zpd0 f192982D1;

    /* JADX INFO: renamed from: E0 */
    public List<String> f192983E0;

    /* JADX INFO: renamed from: E1 */
    public zpd0 f192984E1;

    /* JADX INFO: renamed from: F0 */
    public List<String> f192985F0;

    /* JADX INFO: renamed from: F1 */
    public ConcurrentHashMap<String, String> f192986F1;

    /* JADX INFO: renamed from: G0 */
    public long f192987G0;

    /* JADX INFO: renamed from: G1 */
    public String f192988G1;

    /* JADX INFO: renamed from: H */
    public boolean f192989H;

    /* JADX INFO: renamed from: H0 */
    public final Map<String, MomentMessage> f192990H0;

    /* JADX INFO: renamed from: H1 */
    public TopicOperations f192991H1;

    /* JADX INFO: renamed from: I */
    public hpd0 f192992I;

    /* JADX INFO: renamed from: I0 */
    public final Map<String, StickerInfo> f192993I0;

    /* JADX INFO: renamed from: I1 */
    public String f192994I1;

    /* JADX INFO: renamed from: J */
    public uqd0 f192995J;

    /* JADX INFO: renamed from: J0 */
    public C22393b<MomentMessage> f192996J0;

    /* JADX INFO: renamed from: J1 */
    public Map<String, ei00> f192997J1;

    /* JADX INFO: renamed from: K */
    public tpd0 f192998K;

    /* JADX INFO: renamed from: K0 */
    public C22393b<MomentMessage> f192999K0;

    /* JADX INFO: renamed from: K1 */
    public C22392a<List<User>> f193000K1;

    /* JADX INFO: renamed from: L */
    public zpd0 f193001L;

    /* JADX INFO: renamed from: L0 */
    public final Map<String, Group> f193002L0;

    /* JADX INFO: renamed from: M */
    public zpd0 f193003M;

    /* JADX INFO: renamed from: M0 */
    public final Map<String, BubbleInfo> f193004M0;

    /* JADX INFO: renamed from: N */
    public zpd0 f193005N;

    /* JADX INFO: renamed from: N0 */
    public GuideStatePostConfig f193006N0;

    /* JADX INFO: renamed from: O */
    public zpd0 f193007O;

    /* JADX INFO: renamed from: O0 */
    public C22392a<GuideStatePostConfig> f193008O0;

    /* JADX INFO: renamed from: P */
    public zpd0 f193009P;

    /* JADX INFO: renamed from: P0 */
    public C22393b<j760<String, Boolean>> f193010P0;

    /* JADX INFO: renamed from: Q */
    public tpd0 f193011Q;

    /* JADX INFO: renamed from: Q0 */
    public C22393b<j760<User, Boolean>> f193012Q0;

    /* JADX INFO: renamed from: R0 */
    public C22393b<String> f193014R0;

    /* JADX INFO: renamed from: S0 */
    public C22393b<j760<User, Boolean>> f193016S0;

    /* JADX INFO: renamed from: T0 */
    public LinkedHashMap<String, Moment> f193018T0;

    /* JADX INFO: renamed from: U */
    public hpd0 f193019U;

    /* JADX INFO: renamed from: U0 */
    public Map<String, PersonAlbumBgInfo> f193020U0;

    /* JADX INFO: renamed from: V */
    public hpd0 f193021V;

    /* JADX INFO: renamed from: V0 */
    public C22393b<Map<String, PersonAlbumBgInfo>> f193022V0;

    /* JADX INFO: renamed from: W */
    public hpd0 f193023W;

    /* JADX INFO: renamed from: W0 */
    public C22393b<xaj0<List<User>, Integer, Boolean>> f193024W0;

    /* JADX INFO: renamed from: X */
    public hpd0 f193025X;

    /* JADX INFO: renamed from: X0 */
    public C22393b<List<String>> f193026X0;

    /* JADX INFO: renamed from: Y */
    public hpd0 f193027Y;

    /* JADX INFO: renamed from: Y0 */
    public C22392a<Boolean> f193028Y0;

    /* JADX INFO: renamed from: Z */
    public hpd0 f193029Z;

    /* JADX INFO: renamed from: Z0 */
    public zpd0 f193030Z0;

    /* JADX INFO: renamed from: a0 */
    public uqd0 f193031a0;

    /* JADX INFO: renamed from: a1 */
    public kpd0 f193032a1;

    /* JADX INFO: renamed from: b0 */
    public hpd0 f193033b0;

    /* JADX INFO: renamed from: b1 */
    public C22392a<j760<Links, List<TopicMoment>>> f193034b1;

    /* JADX INFO: renamed from: c0 */
    public tpd0 f193035c0;

    /* JADX INFO: renamed from: c1 */
    public C22393b<Map<String, TopicMoment>> f193036c1;

    /* JADX INFO: renamed from: d0 */
    public tpd0 f193037d0;

    /* JADX INFO: renamed from: d1 */
    public C22392a<j760<Links, List<TopicMoment>>> f193038d1;

    /* JADX INFO: renamed from: e0 */
    public hpd0 f193039e0;

    /* JADX INFO: renamed from: e1 */
    public C22392a<j760<Links, List<TopicMoment>>> f193040e1;

    /* JADX INFO: renamed from: f0 */
    public Map<String, Boolean> f193041f0;

    /* JADX INFO: renamed from: f1 */
    public C22392a<TopicOperations> f193042f1;

    /* JADX INFO: renamed from: g0 */
    public Map<String, List<PostBasePopWindow>> f193043g0;

    /* JADX INFO: renamed from: g1 */
    public C22392a<j760<List<TopicCategorie>, List<TopicMoment>>> f193044g1;

    /* JADX INFO: renamed from: h0 */
    public Map<String, MomentVoiceLiveInfos> f193045h0;

    /* JADX INFO: renamed from: h1 */
    public C22392a<Double> f193046h1;

    /* JADX INFO: renamed from: i0 */
    public Map<String, Moment> f193047i0;

    /* JADX INFO: renamed from: i1 */
    public C22392a<Map<String, BubbleInfo>> f193048i1;

    /* JADX INFO: renamed from: j0 */
    public Map<String, NotifyUsers> f193049j0;

    /* JADX INFO: renamed from: j1 */
    public C22392a<List<BubbleInfo>> f193050j1;

    /* JADX INFO: renamed from: k0 */
    public List<NotifyUsers> f193051k0;

    /* JADX INFO: renamed from: k1 */
    public kpd0 f193052k1;

    /* JADX INFO: renamed from: l0 */
    public C22393b<Map<String, Moment>> f193053l0;

    /* JADX INFO: renamed from: l1 */
    public ConcurrentHashMap<String, Live> f193054l1;

    /* JADX INFO: renamed from: m0 */
    public C22393b<Moment> f193055m0;

    /* JADX INFO: renamed from: m1 */
    public ConcurrentHashMap<String, VoiceLive> f193056m1;

    /* JADX INFO: renamed from: n0 */
    public C22393b<Moment> f193057n0;

    /* JADX INFO: renamed from: n1 */
    public ConcurrentHashMap<String, VoiceRoomInfo> f193058n1;

    /* JADX INFO: renamed from: o0 */
    public C22393b<Moment> f193059o0;

    /* JADX INFO: renamed from: o1 */
    public ConcurrentHashMap<String, VoiceLiveGame> f193060o1;

    /* JADX INFO: renamed from: p0 */
    public C22393b<Moment> f193061p0;

    /* JADX INFO: renamed from: p1 */
    public ConcurrentHashMap<String, VoiceLiveMomentFeed> f193062p1;

    /* JADX INFO: renamed from: q0 */
    public C22393b<Moment> f193063q0;

    /* JADX INFO: renamed from: q1 */
    public ConcurrentHashMap<String, LiveCircleExtInfo> f193064q1;

    /* JADX INFO: renamed from: r0 */
    public C22393b<Moment> f193065r0;

    /* JADX INFO: renamed from: r1 */
    public ConcurrentHashMap<String, LiveCircleBanner> f193066r1;

    /* JADX INFO: renamed from: s0 */
    public C22392a<List<Moment>> f193067s0;

    /* JADX INFO: renamed from: s1 */
    public vdh f193068s1;

    /* JADX INFO: renamed from: t0 */
    public C22392a<List<User>> f193069t0;

    /* JADX INFO: renamed from: t1 */
    public C22393b<Boolean> f193070t1;

    /* JADX INFO: renamed from: u0 */
    public C22392a<List<Moment>> f193071u0;

    /* JADX INFO: renamed from: u1 */
    public C22393b<MomentLevelGuides> f193072u1;

    /* JADX INFO: renamed from: v0 */
    public C22392a<xaj0<List<User>, List<Live>, Links>> f193073v0;

    /* JADX INFO: renamed from: v1 */
    public C22393b<Boolean> f193074v1;

    /* JADX INFO: renamed from: w0 */
    public C22392a<Boolean> f193075w0;

    /* JADX INFO: renamed from: w1 */
    public C22393b<Boolean> f193076w1;

    /* JADX INFO: renamed from: x0 */
    public C22392a<List<BubbleInfo>> f193077x0;

    /* JADX INFO: renamed from: x1 */
    public C22393b<Followship> f193078x1;

    /* JADX INFO: renamed from: y0 */
    public C22393b<roj0> f193079y0;

    /* JADX INFO: renamed from: y1 */
    public C22393b<Relationship> f193080y1;

    /* JADX INFO: renamed from: z0 */
    public C22392a<Boolean> f193081z0;

    /* JADX INFO: renamed from: z1 */
    public C22393b<String> f193082z1;

    /* JADX INFO: renamed from: R */
    public final int f193013R = 20101;

    /* JADX INFO: renamed from: S */
    public final int f193015S = 20102;

    /* JADX INFO: renamed from: T */
    public zpd0 f193017T = new zpd0("like_show_bubble_number" + FeedModule.m60221F().userId(), 0L);

    public xia() {
        String str = "new_moment_draft_media" + FeedModule.m60221F().userId();
        Boolean bool = Boolean.FALSE;
        this.f193019U = new hpd0(str, bool);
        this.f193021V = new hpd0("new_moment_draft_text" + FeedModule.m60221F().userId(), bool);
        this.f193023W = new hpd0("near_by_feed_show_follow_tips_" + FeedModule.m60221F().userId(), bool);
        this.f193025X = new hpd0("has_show_follow_fans_tips_" + FeedModule.m60221F().userId(), bool);
        this.f193027Y = new hpd0("live_show_follow" + FeedModule.m60221F().userId(), bool);
        this.f193029Z = new hpd0("show_pop_window" + FeedModule.m60221F().userId(), bool);
        this.f193031a0 = new uqd0("first_like_moment" + FeedModule.m60221F().userId(), "");
        this.f193033b0 = new hpd0("default_sync_moment" + FeedModule.m60221F().userId(), bool);
        this.f193035c0 = new tpd0("fans_enter_count", 0);
        this.f193037d0 = new tpd0("following_enter_count", 0);
        this.f193039e0 = new hpd0("discovery_show_new_user_tips_" + FeedModule.m60221F().userId(), bool);
        this.f193041f0 = new HashMap();
        this.f193043g0 = new HashMap();
        this.f193045h0 = new HashMap();
        this.f193047i0 = new HashMap();
        this.f193049j0 = new HashMap();
        this.f193051k0 = vwb.m200324f0(new NotifyUsers[0]);
        this.f193053l0 = C22393b.m221521b();
        this.f193055m0 = C22393b.m221521b();
        this.f193057n0 = C22393b.m221521b();
        this.f193059o0 = C22393b.m221521b();
        this.f193061p0 = C22393b.m221521b();
        this.f193063q0 = C22393b.m221521b();
        this.f193065r0 = C22393b.m221521b();
        this.f193067s0 = C22392a.m221513c(new ArrayList());
        this.f193069t0 = C22392a.m221513c(new ArrayList());
        this.f193071u0 = C22392a.m221513c(new ArrayList());
        this.f193073v0 = C22392a.m221512b();
        this.f193075w0 = C22392a.m221512b();
        this.f193077x0 = C22392a.m221512b();
        this.f193079y0 = C22393b.m221521b();
        this.f193081z0 = C22392a.m221512b();
        this.f192975A0 = new HashMap();
        this.f192977B0 = C22393b.m221521b();
        this.f192979C0 = C22393b.m221521b();
        this.f192981D0 = vwb.m200324f0(new String[0]);
        this.f192983E0 = vwb.m200324f0(new String[0]);
        this.f192985F0 = vwb.m200324f0(new String[0]);
        this.f192987G0 = vqg.m199511I("feedTime");
        this.f192990H0 = new HashMap();
        this.f192993I0 = new HashMap();
        this.f192996J0 = C22393b.m221521b();
        this.f192999K0 = C22393b.m221521b();
        this.f193002L0 = new HashMap();
        this.f193004M0 = new HashMap();
        this.f193008O0 = C22392a.m221512b();
        this.f193010P0 = C22393b.m221521b();
        this.f193012Q0 = C22393b.m221521b();
        this.f193014R0 = C22393b.m221521b();
        this.f193016S0 = C22393b.m221521b();
        this.f193018T0 = new LinkedHashMap<>();
        this.f193020U0 = new HashMap();
        this.f193022V0 = C22393b.m221521b();
        this.f193024W0 = C22393b.m221521b();
        this.f193026X0 = C22393b.m221521b();
        this.f193028Y0 = C22392a.m221512b();
        this.f193030Z0 = new zpd0("nearby_fix_time_dot_show_time", 0L);
        this.f193032a1 = new kpd0("follow_moment_latest_create_time_" + FeedModule.m60221F().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f193034b1 = C22392a.m221512b();
        this.f193036c1 = C22393b.m221521b();
        this.f193038d1 = C22392a.m221512b();
        this.f193040e1 = C22392a.m221512b();
        this.f193042f1 = C22392a.m221512b();
        this.f193044g1 = C22392a.m221512b();
        this.f193046h1 = C22392a.m221513c(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        this.f193048i1 = C22392a.m221513c(new HashMap());
        this.f193050j1 = C22392a.m221512b();
        this.f193052k1 = new kpd0("moment_topic_latest_create_time_" + FeedModule.m60221F().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f193054l1 = new ConcurrentHashMap<>();
        this.f193056m1 = new ConcurrentHashMap<>();
        this.f193058n1 = new ConcurrentHashMap<>();
        this.f193060o1 = new ConcurrentHashMap<>();
        this.f193062p1 = new ConcurrentHashMap<>();
        this.f193064q1 = new ConcurrentHashMap<>();
        this.f193066r1 = new ConcurrentHashMap<>();
        this.f193068s1 = new vdh();
        this.f193070t1 = C22393b.m221521b();
        this.f193072u1 = C22393b.m221521b();
        this.f193074v1 = C22393b.m221521b();
        this.f193076w1 = C22393b.m221521b();
        this.f193078x1 = C22393b.m221521b();
        this.f193080y1 = C22393b.m221521b();
        this.f193082z1 = C22393b.m221521b();
        this.f192976A1 = C22392a.m221512b();
        this.f192978B1 = C22393b.m221521b();
        this.f192980C1 = C22393b.m221521b();
        this.f192982D1 = new zpd0("have_new_user_ai_moment_award_time_" + FeedModule.m60221F().userId(), 0L);
        this.f192984E1 = new zpd0("last_show_my_tab_man_post_guide_time_" + FeedModule.m60221F().userId(), 0L);
        this.f192986F1 = new ConcurrentHashMap<>();
        this.f192988G1 = "";
        this.f192991H1 = null;
        this.f192994I1 = "dating";
        this.f192997J1 = new HashMap();
        this.f193000K1 = C22392a.m221512b();
        rpq.m180387b().m180392f("live", LiveExtraInFeed.JSON_ADAPTER);
        this.f192989H = !nkg.m159841A0();
        this.f192992I = new hpd0("has_showed_voice_mute_tips" + FeedModule.m60221F().userId(), bool);
        this.f192995J = new uqd0("feed_search_history_" + FeedModule.m60221F().userId(), "");
        this.f192998K = new tpd0("feed_like_tab_success_tips_count_" + FeedModule.m60221F().userId(), 0);
        this.f193001L = new zpd0("show_guide_time_for_thanks_in_interest_people" + FeedModule.m60221F().userId(), 0L);
        this.f193003M = new zpd0("last_show_poi_seek_guide_dialog_time_" + FeedModule.m60221F().userId(), 0L);
        this.f193005N = new zpd0("last_show_poi_share_guide_dialog_time_" + FeedModule.m60221F().userId(), 0L);
        this.f193007O = new zpd0("last_show_feed_activity_tips_time_" + FeedModule.m60221F().userId(), 0L);
        this.f193009P = new zpd0("last_show_topic_activity_tips_time_" + FeedModule.m60221F().userId(), 0L);
        this.f193011Q = new tpd0("feed_topic_activity_tips_count_" + FeedModule.m60221F().userId(), 0);
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ C22306c m208923B1(w9j w9jVar, Moment moment) {
        return (C22306c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ C22306c m208924B2(w9j w9jVar, Moment moment) {
        return (C22306c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: D3 */
    public static /* synthetic */ void m208937D3(Moment moment) {
        moment.localCreatedSession = App.f15373i.get().intValue();
        FeedModule.f38860i.f77913c.insert(moment);
    }

    /* JADX INFO: renamed from: D4 */
    public static /* synthetic */ int m208938D4(TopicMoment topicMoment, TopicMoment topicMoment2) {
        double d = topicMoment.createdTime - topicMoment2.createdTime;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return -1;
        }
        return d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : 0;
    }

    /* JADX INFO: renamed from: Db */
    private boolean m208940Db(String str) {
        return FeedModule.m60221F().signedIn_() && TextUtils.equals(str, FeedModule.m60221F().userId());
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ stc0 m208956G3(boolean z) {
        stc0.C20027a c20027aAuth = omg.f144622G.auth();
        StringBuilder sb = new StringBuilder();
        sb.append(omg.m165085k("/followConfigs"));
        sb.append(z ? "?with=defaultTab" : "");
        return c20027aAuth.m185898q(sb.toString()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ Envelope m208971J0(final Moment moment, Envelope envelope) {
        if (moment._id != 0) {
            f8c.m119878o().m119881B(new d30() { // from class: l.rda
                @Override // p149l.d30
                public final void call() {
                    FeedModule.f38860i.f77913c.delete(moment._id);
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ stc0 m208972J1(String str, String str2, String str3, boolean z, JSONObject jSONObject) {
        stc0.C20027a c20027aM185898q = omg.f144622G.auth().m185898q(omg.m165044F(str, str2, str3, z));
        return (z ? c20027aM185898q.m185894m(utc0.create(Network.JSON, jSONObject.toString())) : c20027aM185898q.m185885d()).m185883b();
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m208999N4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ C22306c m209003O2(w9j w9jVar, MomentMessage momentMessage) {
        return (C22306c) w9jVar.call(momentMessage);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m209034T3(Throwable th) {
        if (th == f192974N1) {
            return;
        }
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ void m209038U1(Moment moment) {
        moment.localCreatedSession = App.f15373i.get().intValue();
        FeedModule.f38860i.f77913c.insert(moment);
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ C22306c m209055X0(w9j w9jVar, MomentMessage momentMessage) {
        return (C22306c) w9jVar.call(momentMessage);
    }

    /* JADX INFO: renamed from: X5 */
    public static /* synthetic */ stc0 m209060X5(String str, String str2, String str3, boolean z) {
        stc0.C20027a c20027aM185898q = omg.f144622G.auth().m185898q(omg.m165090m0(str, str2, str3));
        return (z ? c20027aM185898q.m185894m(utc0.create(Network.JSON, "")) : c20027aM185898q.m185885d()).m185883b();
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ int m209063Y2(MomentMessage momentMessage, MomentMessage momentMessage2) {
        return (int) (momentMessage.createdTime - momentMessage2.createdTime);
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m209074a2(Throwable th) {
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ void m209089c5(HashMap map, HashMap map2, OnVoiceCall onVoiceCall) {
        if (NullChecker.m81303a(map.get(onVoiceCall.user.f39244id))) {
            String str = onVoiceCall.user.f39244id;
            map2.put(str, (LiveUserMask) map.get(str));
        }
    }

    /* JADX INFO: renamed from: c6 */
    public static /* synthetic */ Envelope m209090c6(an00 an00Var, String str, Envelope envelope) {
        if (NullChecker.m81303a(an00Var)) {
            an00Var.mo97702d(str, envelope);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ stc0 m209091d1(String str, String str2, String str3, String str4, String str5) {
        stc0.C20027a c20027aAuth = omg.f144622G.auth();
        if (!TextUtils.isEmpty(str)) {
            str5 = omg.m165100s(str2, str3, str4, str);
        }
        return c20027aAuth.m185898q(str5).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ C22306c m209097e1(Envelope envelope) {
        return (envelope == null || vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).messages)) ? C22306c.error(new Throwable("Envelope return onNext is null")) : C22306c.just(envelope);
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ C22306c m209100e4(w9j w9jVar, Moment moment) {
        return (C22306c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ Envelope m209103f1(Envelope envelope) {
        FriendsFeedViewPagerFrag.f41497J0 = true;
        ijb0.m136567g();
        vqg.m199518L0();
        return envelope;
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ stc0 m209106f4(String str, String str2) {
        String str3;
        stc0.C20027a c20027aAuth = omg.f144622G.auth();
        StringBuilder sb = new StringBuilder("/popWindows?page_id=");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "&scene=" + str2;
        }
        sb.append(str3);
        return c20027aAuth.m185898q(omg.m165102t(sb.toString())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ stc0 m209109g1(String str, String str2, String str3, boolean z) {
        stc0.C20027a c20027aM185898q = omg.f144622G.auth().m185898q(omg.m165043E(str, str2, str3));
        return (z ? c20027aM185898q.m185894m(utc0.create(Network.JSON, "")) : c20027aM185898q.m185885d()).m185883b();
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ stc0 m209117h3(String str, String str2, User user, String str3, String str4, Followship followship) {
        stc0.C20027a c20027aM185898q = omg.f144622G.auth().m185898q(!TextUtils.isEmpty(str) ? omg.m165063Y(str2, user.f56011id, str, str3, str4) : omg.m165061W(str2, user.f56011id, str4));
        c20027aM185898q.m185894m(utc0.create(Network.JSON, followship.toJson()));
        return c20027aM185898q.m185883b();
    }

    /* JADX INFO: renamed from: h4 */
    public static /* synthetic */ List m209118h4(Moment moment) {
        if (NullChecker.m81303a(moment)) {
            return moment.media;
        }
        return null;
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ Envelope m209122i2(an00 an00Var, String str, Envelope envelope) {
        if (NullChecker.m81303a(an00Var)) {
            an00Var.mo97701b(str, envelope);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ stc0 m209128j2(String str, String str2, String str3, String str4, String str5) {
        stc0.C20027a c20027aAuth = omg.f144622G.auth();
        if (!TextUtils.isEmpty(str)) {
            str5 = omg.m165098r(str2, str3, str4, str);
        }
        return c20027aAuth.m185898q(str5).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: k6 */
    public static /* synthetic */ stc0 m209138k6(String str, User user, Followship followship) {
        stc0.C20027a c20027aM185898q = omg.f144622G.auth().m185898q(omg.m165064Z(str, user.f56011id));
        c20027aM185898q.m185894m(utc0.create(Network.JSON, followship.toJson()));
        return c20027aM185898q.m185883b();
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ MomentMessage m209141l3(MomentMessage momentMessage, String str) {
        momentMessage.owner = FeedModule.m60221F().userId();
        momentMessage.createdTime = omg.m165099r0() + 10000.0d;
        if (TextUtils.isEmpty(momentMessage.api_only_otherUser)) {
            momentMessage.cid = str;
        } else {
            momentMessage.cid = momentMessage.api_only_otherUser;
        }
        tpd0 tpd0Var = App.f15373i;
        momentMessage.f56008id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        if (momentMessage.value == null) {
            momentMessage.value = "";
        }
        momentMessage.localCreatedSession = tpd0Var.get().intValue();
        return momentMessage;
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m209166p4(String str, long j, j760 j760Var) {
        String str2;
        if ("following/moments/next".equals(str)) {
            str2 = "follow";
        } else if ("nearby/next".equals(str)) {
            str2 = "nearby";
        } else {
            str2 = "like/next".equals(str) ? "like" : "";
        }
        TrackMediaUploadUtil.m80298b0(str2, SystemClock.elapsedRealtime() - j);
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ Envelope m209170q2(final Moment moment, Envelope envelope) {
        if (moment._id != 0) {
            f8c.m119878o().m119881B(new d30() { // from class: l.oaa
                @Override // p149l.d30
                public final void call() {
                    FeedModule.f38860i.f77913c.delete(moment._id);
                }
            });
        }
        return envelope;
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ void m209188t1(Throwable th) {
        if (oe40.m163810L(th)) {
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ roj0 m209195u1(final Moment moment) {
        f8c.m119878o().m119881B(new d30() { // from class: l.x9a
            @Override // p149l.d30
            public final void call() {
                FeedModule.f38860i.f77913c.updateBy_id(moment);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: u6 */
    public static /* synthetic */ List m209200u6(Envelope envelope) {
        return ((FeedData) envelope.getModuleData(FeedData.class)).liveLabels == null ? new ArrayList() : ((FeedData) envelope.getModuleData(FeedData.class)).liveLabels;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ Envelope m209215x0(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ roj0 m209220x5(Envelope envelope) {
        ijb0.m136566f();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ Envelope m209226y5(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ Envelope m209228z1(Envelope envelope) {
        return envelope;
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ C22306c m209229z2(final String str, final String str2, final MomentMessage momentMessage) {
        new MomentMessage().recalled = Boolean.TRUE;
        return new la20((v9j<stc0>) new v9j() { // from class: l.u8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165082i0(str, str2, momentMessage.f56008id)).m185885d().m185883b();
            }
        }, 0).compose(omg.m165092n0()).map(new w9j() { // from class: l.v8a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: A6, reason: merged with bridge method [inline-methods] */
    public void m209268Ea(Moment moment) {
        if (moment == null) {
            return;
        }
        this.f193047i0.put(moment.f56011id, moment);
        if (moment.f56011id.startsWith("fake_id_")) {
            this.f193018T0.put(moment.f56011id, moment);
        }
    }

    /* JADX INFO: renamed from: A7 */
    public C22306c<Envelope> m209234A7(final String str) {
        final String strM165085k;
        if (TextUtils.isEmpty(str)) {
            strM165085k = omg.m165085k("/states?with=users&limit=20");
        } else {
            strM165085k = omg.m165085k("/states?with=users&limit=20&" + str);
        }
        return scheduled("getFriendState", 0, new v9j() { // from class: l.vea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f181162a.m209455f9(strM165085k, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ C22306c m209235A8(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.dca
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165083j()).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).map(new w9j() { // from class: l.eca
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90488a.m209597z8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A9 */
    public final /* synthetic */ BubbleInfo m209236A9(String str, Envelope envelope) {
        m209550sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        if (list.size() <= 0 || !TextUtils.equals(list.get(0).owner.f38803id, str)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: Aa */
    public final /* synthetic */ Boolean m209237Aa(String str, Moment moment) {
        return Boolean.valueOf(m208940Db(str));
    }

    /* JADX INFO: renamed from: Ab */
    public final /* synthetic */ C22306c m209238Ab(String str, String str2, final String str3) {
        final String strM165085k = omg.m165085k("/users/" + str + "/moments/" + str2);
        return new la20(new v9j() { // from class: l.uea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185892k(utc0.create(Network.JSON, "{\"userSetVisibility\": \"" + str3 + "\"}")).m185898q(strM165085k).m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.wea
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185917a.m209600zb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ac */
    public C22306c<j760<Links, List<Moment>>> m209239Ac(String str, an00 an00Var) {
        return m209423ac(omg.m165074e0(str, "limit=20"), "poi_location_feeds_pre", false, FeedModule.m60221F().userId(), an00Var);
    }

    /* JADX INFO: renamed from: Ad */
    public void m209240Ad(User user) {
        if (user == null) {
            return;
        }
        User user2 = this.f192975A0.get(user.f56011id);
        if (user2 == null) {
            this.f192975A0.put(user.f56011id, user);
        } else {
            if (user2.equals(user)) {
                return;
            }
            this.f192975A0.put(user.f56011id, user);
            this.f192979C0.m132487l(this.f192975A0);
        }
    }

    /* JADX INFO: renamed from: B6 */
    public C22306c<List<Group>> m209241B6(final String str, String str2) {
        return scheduled(str2, 0, new v9j() { // from class: l.uga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f176364a.m209517o8(str);
            }
        });
    }

    /* JADX INFO: renamed from: B7 */
    public C22306c<Envelope> m209242B7(String str) {
        final String strM165085k = omg.m165085k("/groups/" + str);
        return scheduled("getGroupDetailByGroupId" + str, -1, new v9j() { // from class: l.hga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f107584a.m209469h9(strM165085k);
            }
        });
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m209243B8(RawFeed rawFeed) {
        if (rawFeed.type.equals("live")) {
            this.f193054l1.remove(rawFeed.f39243id);
        } else if (rawFeed.type.equals(BLiveType.voiceLive)) {
            this.f193062p1.remove(rawFeed.f39243id);
        } else if (rawFeed.type.equals("liveCircleMomentBanner")) {
            this.f193066r1.remove(rawFeed.f39243id);
        }
    }

    /* JADX INFO: renamed from: B9 */
    public final /* synthetic */ C22306c m209244B9(final String str, final String str2) {
        return ia20.m135117a(new v9j() { // from class: l.v7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.w7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185035a.m209236A9(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ba */
    public final /* synthetic */ Boolean m209245Ba(String str, Moment moment) {
        return Boolean.valueOf(m208940Db(str));
    }

    /* JADX INFO: renamed from: Bb */
    public final /* synthetic */ j760 m209246Bb(Envelope envelope) {
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        return new j760(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).users);
    }

    /* JADX INFO: renamed from: Bc */
    public C22306c<roj0> m209247Bc(final Moment moment, final boolean z, final boolean z2) {
        final String strUserId = FeedModule.m60221F().userId();
        m209602zd(z, 0, moment);
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("everyone");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        if (TEnum.equals(moment.allowForward, "unknown_")) {
            moment.allowForward = null;
        }
        v9j v9jVar = new v9j() { // from class: l.d7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f84719a.m209540ra(moment, z);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.f7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f96228a.m209568va(strUserId, z, moment, (Moment) obj);
            }
        };
        final e30<Throwable> e30Var = new e30() { // from class: l.g7a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101340a.m209575wa(strUserId, z, moment, (Throwable) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.h7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f106207a.m209599za(z2, moment, z, e30Var, (Moment) obj);
            }
        };
        return now(((C22306c) v9jVar.call()).compose(mkd0.m154965Q()).filter(new w9j() { // from class: l.i7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f111842a.m209237Aa(strUserId, (Moment) obj);
            }
        }).flatMap(new w9j() { // from class: l.j7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m209100e4(w9jVar, (Moment) obj);
            }
        }).filter(new w9j() { // from class: l.k7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f121560a.m209245Ba(strUserId, (Moment) obj);
            }
        }).compose(TrackMediaUploadUtil.m80306f0("moment", moment.media, new w9j() { // from class: l.l7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m209118h4((Moment) obj);
            }
        })).doOnError(e30Var).filter(new w9j() { // from class: l.m7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f131800a.m209253Ca(strUserId, (Moment) obj);
            }
        }).flatMap(new w9j() { // from class: l.n7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m208924B2(w9jVar2, (Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Bd */
    public void m209248Bd(String str) {
        User userM209447e8 = m209447e8(str);
        if (NullChecker.m81303a(userM209447e8.localFollowship)) {
            if (TEnum.equals(userM209447e8.localFollowship.state, "matched") || TEnum.equals(userM209447e8.localFollowship.state, FollowshipStatus.following)) {
                boolean zEquals = TEnum.equals(userM209447e8.localFollowship.state, "matched");
                Followship followship = userM209447e8.localFollowship;
                if (zEquals) {
                    followship.state = FollowshipStatus.get(FollowshipStatus.followed);
                } else if (TEnum.equals(followship.state, FollowshipStatus.following)) {
                    userM209447e8.localFollowship.state = FollowshipStatus.get("default");
                }
                this.f192975A0.put(userM209447e8.f56011id, userM209447e8);
                this.f192979C0.m132487l(this.f192975A0);
                this.f193012Q0.m132487l(new j760<>(userM209447e8, Boolean.FALSE));
            }
        }
    }

    /* JADX INFO: renamed from: C6 */
    public Moment m209249C6(Live live) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56011id = live.f38767id;
        momentNew_.isLive = true;
        momentNew_.live = live;
        LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(live);
        if (fromLive == null || !fromLive.isMultiCallType() || TextUtils.isEmpty(fromLive.momentOwner.f38803id)) {
            momentNew_.owner = live.anchor.f38803id;
            return momentNew_;
        }
        momentNew_.owner = fromLive.momentOwner.f38803id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: C7 */
    public C22306c<Envelope> m209250C7(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(omg.m165085k("/groups/" + str + "/users?search=recommend&with=users,followships,relationships"));
        if (i > 0) {
            sb.append("&limit=");
            sb.append(i);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&");
            sb.append(str2);
        }
        final String string = sb.toString();
        return scheduled("getGroupFriendEnvByGroupId" + str, 0, new v9j() { // from class: l.w9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.jca
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.kca
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return xia.m209228z1((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ Boolean m209251C8(RawFeed rawFeed) {
        return Boolean.valueOf((rawFeed.type.equals("live") && this.f193054l1.get(rawFeed.f39243id) != null) || (rawFeed.type.equals(BLiveType.voiceLive) && this.f193062p1.get(rawFeed.f39243id) != null));
    }

    /* JADX INFO: renamed from: C9 */
    public final /* synthetic */ j760 m209252C9(Envelope envelope) {
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        ArrayList arrayListM200324f0 = vwb.m200324f0(new ViewersBox[0]);
        MomentViewerBox momentViewerBox = ((FeedData) envelope.getModuleData(FeedData.class)).momentViewer;
        if (momentViewerBox != null && !vwb.m200296J(momentViewerBox.viewers)) {
            arrayListM200324f0.addAll(momentViewerBox.viewers);
        }
        return new j760(envelope.pagination.links, arrayListM200324f0);
    }

    /* JADX INFO: renamed from: Ca */
    public final /* synthetic */ Boolean m209253Ca(String str, Moment moment) {
        return Boolean.valueOf(m208940Db(str));
    }

    /* JADX INFO: renamed from: Cb */
    public final /* synthetic */ C22306c m209254Cb(final String str) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.bha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }, omg.f144619D).compose(omg.m165092n0()).map(new w9j() { // from class: l.cha
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80840a.m209246Bb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Cc */
    public C22306c<roj0> m209255Cc(final Moment moment) {
        final String strUserId = FeedModule.m60221F().userId();
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("everyone");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        if (TEnum.equals(moment.allowForward, "unknown_")) {
            moment.allowForward = null;
        }
        v9j v9jVar = new v9j() { // from class: l.lfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f127857a.m209282Ga(moment);
            }
        };
        final e30<Throwable> e30Var = new e30() { // from class: l.mfa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133571a.m209289Ha(strUserId, moment, (Throwable) obj);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.nfa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138703a.m209310Ka(moment, e30Var, (Moment) obj);
            }
        };
        return now(((C22306c) v9jVar.call()).compose(mkd0.m154965Q()).filter(new w9j() { // from class: l.ofa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f143637a.m209317La(strUserId, (Moment) obj);
            }
        }).doOnError(e30Var).filter(new w9j() { // from class: l.pfa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148537a.m209324Ma(strUserId, (Moment) obj);
            }
        }).flatMap(new w9j() { // from class: l.qfa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m208923B1(w9jVar, (Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Cd */
    public C22306c<j760<Links, List<User>>> m209256Cd(final String str, String str2) {
        return scheduled(str2, 0, new v9j() { // from class: l.rga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f159233a.m209254Cb(str);
            }
        });
    }

    /* JADX INFO: renamed from: D6 */
    public Moment m209257D6(LiveCircleBanner liveCircleBanner) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56011id = liveCircleBanner.f39224id;
        momentNew_.liveCircleBanner = liveCircleBanner;
        return momentNew_;
    }

    /* JADX INFO: renamed from: D7 */
    public C22306c<xaj0<List<Group>, List<User>, Links>> m209258D7(String str, int i, String str2) {
        return m209250C7(str, i, str2).map(new w9j() { // from class: l.sia
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f164697a.m209476i9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ void m209259D8(Map map, List list, Map map2, Map map3, final HashMap map4, Envelope envelope, RawFeed rawFeed) {
        LiveCircleBanner liveCircleBanner;
        if ("moment".equals(rawFeed.type) && NullChecker.m81303a(map.get(rawFeed.f39243id))) {
            Moment moment = (Moment) map.get(rawFeed.f39243id);
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
            if (vqg.m199532Z(moment) && !map.containsKey(moment.thirdShareSource.sourceId)) {
                m209543rd(moment.thirdShareSource.sourceId);
            }
            if (this.f193064q1.get(moment.f56011id) != null) {
                moment.liveCircleExtInfo = this.f193064q1.get(moment.f56011id);
            }
            list.add(moment);
            return;
        }
        if ("liveRecommendCard".equals(rawFeed.type)) {
            LiveRecommendCard liveRecommendCard = (LiveRecommendCard) map2.get(rawFeed.f39243id);
            if (NullChecker.m81303a(liveRecommendCard)) {
                list.add(m209264E6(liveRecommendCard));
                return;
            }
            return;
        }
        if ("live".equals(rawFeed.type)) {
            Live live = this.f193054l1.get(rawFeed.f39243id);
            Moment momentM209249C6 = m209249C6(live);
            if (NullChecker.m81303a(map3.get(live.room.f38803id))) {
                momentM209249C6.value = ((Room) map3.get(live.room.f38803id)).title;
                momentM209249C6.liveRoom = (Room) map3.get(live.room.f38803id);
            }
            list.add(momentM209249C6);
            return;
        }
        if (!BLiveType.voiceLive.equals(rawFeed.type)) {
            if (!"liveCircleMomentBanner".equals(rawFeed.type) || ((FeedData) envelope.getModuleData(FeedData.class)).liveGroupCircleMomentBanners.size() <= 0 || (liveCircleBanner = this.f193066r1.get(rawFeed.f39243id)) == null) {
                return;
            }
            list.add(m209257D6(liveCircleBanner));
            return;
        }
        VoiceLiveMomentFeed voiceLiveMomentFeed = this.f193062p1.get(rawFeed.f39243id);
        if (NullChecker.m81303a(voiceLiveMomentFeed)) {
            VoiceLive voiceLive = this.f193056m1.get(voiceLiveMomentFeed.liveId);
            final HashMap map5 = new HashMap();
            vwb.m200354z(voiceLive.callInfo.onVoiceCalls, new e30() { // from class: l.xca
                @Override // p149l.e30
                public final void call(Object obj) {
                    xia.m209089c5(map4, map5, (OnVoiceCall) obj);
                }
            });
            voiceLive.masksMap = map5;
            VoiceRoomInfo voiceRoomInfo = this.f193058n1.get(voiceLive.room.f38803id);
            if (NullChecker.m81303a(voiceRoomInfo)) {
                voiceLive.voiceRoomInfo = voiceRoomInfo;
            }
            voiceLive.voiceLiveGame = this.f193060o1.get(voiceLive.f39250id);
            voiceLiveMomentFeed.voiceLive = voiceLive;
            list.add(m209271F6(voiceLiveMomentFeed));
        }
    }

    /* JADX INFO: renamed from: D9 */
    public final /* synthetic */ C22306c m209260D9(String str, String str2, String str3) {
        final String strM165085k;
        if (TextUtils.isEmpty(str)) {
            strM165085k = omg.m165085k("/users/" + str2 + "/moments/" + str3 + "/viewers?with=users&limit=20");
        } else {
            strM165085k = omg.m165085k("/users/" + str2 + "/moments/" + str3 + "/viewers?with=users&limit=20&" + str);
        }
        return new la20(new v9j() { // from class: l.xea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(strM165085k).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.yea
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f197672a.m209252C9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Da */
    public final /* synthetic */ void m209261Da(Moment moment) {
        m209268Ea(moment);
        this.f193063q0.m132487l(moment);
    }

    /* JADX INFO: renamed from: Dc */
    public C22306c<roj0> m209262Dc(final String str, final String str2, final String str3, final int i) {
        final v9j v9jVar = new v9j() { // from class: l.k9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165080h0(str, str2, str3)).m185894m(utc0.create(Network.JSON, "")).m185883b();
            }
        };
        return scheduled("postVote", -1, new v9j() { // from class: l.l9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f126929a.m209338Oa(v9jVar, str2, i);
            }
        }, false);
    }

    /* JADX INFO: renamed from: Dd */
    public C22306c<Envelope> m209263Dd(boolean z) {
        String str = z ? "show" : "reject";
        final String strM165085k = omg.m165085k("/voice-nearby-feedback?type=".concat(str));
        return scheduled("VoiceFeedBack".concat(str), -1, new v9j() { // from class: l.xba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.dea
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(str).m185893l(utc0.create(Network.JSON, "")).m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public Moment m209264E6(LiveRecommendCard liveRecommendCard) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56011id = liveRecommendCard.f39228id;
        momentNew_.isLive = true;
        momentNew_.liveRecommendCard = liveRecommendCard;
        return momentNew_;
    }

    /* JADX INFO: renamed from: E7 */
    public C22306c<roj0> m209265E7() {
        return scheduled("get_guide_state_post_config", 0, new v9j() { // from class: l.x7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f191328a.m209490k9();
            }
        });
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ TopicMoment m209266E8(Envelope envelope) {
        m209550sd(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        if (feedData == null || vwb.m200296J(feedData.momentTopics)) {
            return null;
        }
        return feedData.momentTopics.get(0);
    }

    /* JADX INFO: renamed from: E9 */
    public final /* synthetic */ roj0 m209267E9(boolean z, Envelope envelope) {
        FeedModule.f38859h.followConfigSub.m132487l(((FeedData) envelope.getModuleData(FeedData.class)).extra);
        FeedModule.f38859h.followConfig = ((FeedData) envelope.getModuleData(FeedData.class)).extra;
        sti.f166357a.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.bindPhone));
        vqg.m199504E0(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.momentMedia.audio));
        this.f193027Y.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.liveShowFollowButton));
        sti.f166358b.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.feedDefaultPage);
        if (u2h.m191492a() || nkg.m159916y()) {
            sti.f166359c.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.feedShowAccostButton));
        } else {
            sti.f166359c.put(Boolean.TRUE);
        }
        sti.f166360d.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.topicH5RedirectURL);
        sti.f166363g.put(JSON.toJSONString(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateEmotion));
        this.f193029Z.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.showPopWindow));
        this.f193033b0.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.defaultSyncMoment));
        sti.f166361e.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.showAudit.moment));
        sti.f166362f.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.showAudit.comment));
        sti.f166364h.put(JSON.toJSONString(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateGuide));
        if (z) {
            sti.f166368l.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.defaultTab);
        }
        sti.f166369m.put(Boolean.valueOf(((FeedData) envelope.getModuleData(FeedData.class)).extra.activityShowReadButton));
        jlg.m142074f().m142086n(((FeedData) envelope.getModuleData(FeedData.class)).extra.explorePostBubble);
        sti.f166370n.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateWindow.title);
        sti.f166371o.put(((FeedData) envelope.getModuleData(FeedData.class)).extra.stateWindow.subTitle);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Eb */
    public C22306c<roj0> m209269Eb(final String str, final String str2, final String str3, final boolean z) {
        return scheduled("/moments/" + str2 + "/messages/" + str3 + "/likes/me", -1, new v9j() { // from class: l.vba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.mda
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return xia.m209109g1(str, str, str, z);
                    }
                }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.nda
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Ec */
    public C22306c<j760<Links, List<Moment>>> m209270Ec(an00 an00Var) {
        return m209423ac(omg.m165066a0("limit=20&query=preload"), "friends/previous/preload", false, null, an00Var);
    }

    /* JADX INFO: renamed from: F6 */
    public Moment m209271F6(VoiceLiveMomentFeed voiceLiveMomentFeed) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56011id = voiceLiveMomentFeed.f39251id;
        momentNew_.isVoiceLive = true;
        VoiceLive voiceLive = voiceLiveMomentFeed.voiceLive;
        momentNew_.voiceLive = voiceLive;
        momentNew_.headImage = voiceLiveMomentFeed.image;
        momentNew_.owner = voiceLive.anchor.f38803id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: F7 */
    public C22392a<Double> m209272F7() {
        return this.f193046h1;
    }

    /* JADX INFO: renamed from: F8 */
    public final /* synthetic */ C22306c m209273F8(final String str) {
        return new la20(new v9j() { // from class: l.uda
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165085k("/topics")).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.vda
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181070a.m209266E8((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.wda
            @Override // p149l.e30
            public final void call(Object obj) {
                t2h.m186976g((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F9 */
    public final /* synthetic */ C22306c m209274F9(final boolean z) {
        return new la20(new v9j() { // from class: l.dga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xia.m208956G3(z);
            }
        }).map(new w9j() { // from class: l.ega
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90910a.m209267E9(z, (Envelope) obj);
            }
        }).compose(omg.m165092n0());
    }

    /* JADX INFO: renamed from: Fa */
    public final /* synthetic */ Moment m209275Fa(final Moment moment) throws Exception {
        if (!TextUtils.isEmpty(moment.f56011id)) {
            final Moment momentMo223809clone = moment.mo223809clone();
            momentMo223809clone.localCreatedSession = App.f15373i.get().intValue();
            f8c.m119878o().m119881B(new d30() { // from class: l.l8a
                @Override // p149l.d30
                public final void call() {
                    FeedModule.f38860i.f77913c.updateBy_id(momentMo223809clone);
                }
            });
            e51.m114748M(new Runnable() { // from class: l.w8a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185169a.m209268Ea(momentMo223809clone);
                }
            });
            return momentMo223809clone;
        }
        moment.createdTime = omg.m165099r0();
        moment.owner = FeedModule.m60221F().userId();
        if (moment.value == null) {
            moment.value = "";
        }
        moment.likes = PartialIdList.new_();
        moment.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
        if (TEnum.equals(moment.userSetVisibility, "unknown_")) {
            moment.userSetVisibility = UserSetVisibility.get(el00.m117022k().m117031p(moment));
        }
        moment.media = new ArrayList();
        f8c.m119878o().m119881B(new d30() { // from class: l.p7a
            @Override // p149l.d30
            public final void call() {
                xia.m209038U1(moment);
            }
        });
        e51.m114748M(new Runnable() { // from class: l.a8a
            @Override // java.lang.Runnable
            public final void run() {
                this.f68007a.m209261Da(moment);
            }
        });
        return moment;
    }

    /* JADX INFO: renamed from: Fb */
    public C22306c<Envelope> m209276Fb(String str, String str2, boolean z, String str3) {
        return m209283Gb(str, str2, z, str3, 0);
    }

    /* JADX INFO: renamed from: Fc */
    public C22306c<j760<Links, List<Moment>>> m209277Fc(an00 an00Var) {
        return m209423ac(omg.m165068b0("limit=20", "recommend"), "liked/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: G6 */
    public Moment m209278G6(aai aaiVar) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56011id = "";
        momentNew_.feedVoiceUserEntryInfo = aaiVar;
        return momentNew_;
    }

    /* JADX INFO: renamed from: G7 */
    public C22306c<j760<FeedLiterature, FeedLiteraturesComment>> m209279G7(String str) {
        final String str2 = "/literature/" + str + "?user_id=" + FeedModule.m60221F().userId();
        return scheduled(str2, 0, new v9j() { // from class: l.saa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f163344a.m209504m9(str2);
            }
        }, false);
    }

    /* JADX INFO: renamed from: G8 */
    public final /* synthetic */ Notification m209280G8(Moment moment, Notification notification) {
        if (!notification.m221300k() && (!notification.m221299j() || !(notification.m221294e() instanceof ApiExcep.Client.NotFound))) {
            return notification;
        }
        ijb0.m136550N(FeedModule.m60221F().userId(), false);
        this.f193061p0.m132487l(moment);
        m209543rd(moment.f56011id);
        return Notification.m221292c(roj0.f160388a);
    }

    /* JADX INFO: renamed from: G9 */
    public final /* synthetic */ Envelope m209281G9(String str, String str2, boolean z, int i, Envelope envelope) {
        if (nkg.m159862S() && NullChecker.m81303a(envelope) && envelope.meta.code == 20101) {
            User userM209447e8 = m209447e8(str);
            if (NullChecker.m81303a(userM209447e8)) {
                Relationship relationshipNew_ = userM209447e8.localRelationship;
                if (relationshipNew_ == null) {
                    relationshipNew_ = Relationship.new_();
                }
                if (userM209447e8.letter() || userM209447e8.likedMe() || TEnum.equals(relationshipNew_.state, "blocked") || ((NullChecker.m81303a(relationshipNew_.relationshipExtensions) && TEnum.equals(relationshipNew_.relationshipExtensions.otherRelationType, RelationshipStatus.LIKED)) || (NullChecker.m81303a(relationshipNew_.relationshipExtensions) && TEnum.equals(relationshipNew_.relationshipExtensions.otherRelationType, "liked")))) {
                    relationshipNew_.state = RelationshipStatus.get("matched");
                    userM209447e8.localRelationship = relationshipNew_;
                    m209240Ad(userM209447e8);
                } else {
                    relationshipNew_.state = RelationshipStatus.get("liked");
                    userM209447e8.localRelationship = relationshipNew_;
                    m209240Ad(userM209447e8);
                    m209312Kc(relationshipNew_, userM209447e8, true, false);
                }
            }
            this.f193082z1.m132487l(str2);
        }
        Moment moment = this.f193047i0.get(str2);
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
            partialIdList.ids = vwb.m200318c0(partialIdList.ids, FeedModule.m60221F().userId());
        } else if (!z2 && z) {
            if (i > 0) {
                moment.attitudeId = i;
                moment.attitudes.count++;
            }
            PartialIdList partialIdList2 = moment.likes;
            partialIdList2.count++;
            partialIdList2.ids = vwb.m200317c(partialIdList2.ids, FeedModule.m60221F().userId());
        } else if (z2 && z && i > 0) {
            if (moment.attitudeId <= 0) {
                moment.attitudes.count++;
            }
            moment.attitudeId = i;
        }
        moment.haveLiked = z;
        this.f193047i0.put(str2, moment);
        f192972L1 = vwb.m200311Y(moment.f56011id, 0);
        this.f193053l0.m132487l(this.f193047i0);
        if (z) {
            ijb0.m136555S(envelope);
        }
        FeedModule.f38859h.m180641A0(moment);
        return envelope;
    }

    /* JADX INFO: renamed from: Ga */
    public final /* synthetic */ C22306c m209282Ga(final Moment moment) {
        return C22306c.fromCallable(new Callable() { // from class: l.rfa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f159131a.m209275Fa(moment);
            }
        });
    }

    /* JADX INFO: renamed from: Gb */
    public C22306c<Envelope> m209283Gb(final String str, final String str2, final boolean z, final String str3, final int i) {
        final JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("attitudeId", i);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        return scheduled("/moments/" + str2 + "/likes/me", -1, new v9j() { // from class: l.lha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f128076a.m209288H9(str, str2, str3, z, jSONObject, i);
            }
        });
    }

    /* JADX INFO: renamed from: Gc */
    public C22306c<j760<Links, List<Moment>>> m209284Gc(an00 an00Var) {
        return m209423ac(omg.m165072d0("limit=20&query=preload"), "preload/nearby/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: H6 */
    public Moment m209285H6(bkn0.C15894a c15894a) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56011id = "";
        momentNew_.voiceLiveApiInfo = c15894a;
        return momentNew_;
    }

    /* JADX INFO: renamed from: H7 */
    public final String m209286H7() {
        return "/live-circle-moments";
    }

    /* JADX INFO: renamed from: H8 */
    public final /* synthetic */ C22306c m209287H8(final Moment moment) {
        return new la20(new v9j() { // from class: l.eia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165104v(moment.f56011id)).m185885d().m185883b();
            }
        }).materialize().compose(omg.m165092n0()).map(new w9j() { // from class: l.fia
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97647a.m209280G8(moment, (Notification) obj);
            }
        }).dematerialize().take(1);
    }

    /* JADX INFO: renamed from: H9 */
    public final /* synthetic */ C22306c m209288H9(final String str, final String str2, final String str3, final boolean z, final JSONObject jSONObject, final int i) {
        return new la20(new v9j() { // from class: l.faa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xia.m208972J1(str, str2, str3, z, jSONObject);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.gaa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f101653a.m209281G9(str, str2, z, i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ha */
    public final /* synthetic */ void m209289Ha(String str, Moment moment, final Throwable th) {
        MomentPostFailedExcepion.reportMomentPostFailed(th, true);
        zvf0.m220369B("e_post_moment_error", "post_error_feed_moments", vwb.m200311Y("error", th == null ? CardButtonsShowAndHideType.unknow : th.toString()));
        if (m208940Db(str)) {
            Moment momentMo223809clone = this.f193047i0.get(moment.f56011id).mo223809clone();
            momentMo223809clone.localCreatedSession--;
            m209578wd(momentMo223809clone);
            m209268Ea(momentMo223809clone);
            e51.m114748M(new Runnable() { // from class: l.vfa
                @Override // java.lang.Runnable
                public final void run() {
                    yij0.m214926D(th);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Hb */
    public C22306c<Envelope> m209290Hb(final String str, final String str2, final boolean z) {
        final String strM165085k = omg.m165085k(String.format("/users/%s/states/%s/likes/me", str2, str));
        return scheduled("likeState", -1, new v9j() { // from class: l.mha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f133788a.m209309K9(strM165085k, z, str2, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Hc */
    public void m209291Hc(User user) {
        if (user.localFollowship == null) {
            user.localFollowship = new Followship();
        }
        if (!TEnum.equals(user.localFollowship.state, "matched")) {
            if (!TEnum.equals(user.localFollowship.state, FollowshipStatus.following)) {
                user.profile.followships.counters.followers++;
            }
            user.localFollowship.state = FollowshipStatus.get("matched");
        }
        hpd0 hpd0Var = PhotoAlbumFeedAct.f41621e;
        if (!hpd0Var.get().booleanValue() && !m209496l8()) {
            lsi0.m151593w(R$string.f38924K2);
            hpd0Var.put(Boolean.TRUE);
        }
        this.f192975A0.put(user.f56011id, user);
        this.f192979C0.m132487l(this.f192975A0);
        this.f193012Q0.m132487l(new j760<>(user, Boolean.TRUE));
        ijb0.m136550N(FeedModule.m60221F().userId(), false);
    }

    /* JADX INFO: renamed from: I6 */
    public C22306c<roj0> m209292I6(final String str, final String str2, final String str3) {
        final v9j v9jVar = new v9j() { // from class: l.zba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(omg.m165080h0(str, str2, str3)).m185885d().m185883b();
            }
        };
        return scheduled("cancelVote", -1, new v9j() { // from class: l.aca
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.tda
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: I7 */
    public BubbleInfo m209293I7() {
        return this.f193048i1.m221515e().get(FeedModule.m60222H().me_().f56011id);
    }

    /* JADX INFO: renamed from: I8 */
    public final /* synthetic */ Envelope m209294I8(Envelope envelope) {
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: I9 */
    public final /* synthetic */ void m209295I9(String str, String str2, ConversationStatus conversationStatus) {
        if (TEnum.equals(conversationStatus, "default")) {
            FeedModule.m60222H().mo30750ci(str, str2, "", true);
            return;
        }
        if (TEnum.equals(conversationStatus, "deleted") || TEnum.equals(conversationStatus, "blocked")) {
            this.f193070t1.m132487l(Boolean.TRUE);
            lsi0.m151580j("配对已解除");
        } else {
            this.f193070t1.m132487l(Boolean.TRUE);
            lsi0.m151580j("对方账号异常");
        }
    }

    /* JADX INFO: renamed from: Ia */
    public final /* synthetic */ roj0 m209296Ia(Moment moment, Moment moment2, Envelope envelope) {
        Moment moment3 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        this.f193047i0.remove(moment.f56011id);
        if (moment.f56011id.startsWith("fake_id_")) {
            this.f193018T0.remove(moment.f56011id);
        }
        m209550sd(envelope);
        this.f193065r0.m132487l(moment2);
        this.f193047i0.put(moment3.f56011id, moment3);
        this.f193063q0.m132487l(moment3);
        ijb0.m136550N(FeedModule.m60221F().userId(), false);
        ijb0.m136555S(envelope);
        moment.f56011id = moment3.f56011id;
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Ib */
    public C22306c<roj0> m209297Ib(final String str, final String str2, final String str3, final boolean z) {
        return scheduled("/topics/" + str2 + "/comments/" + str3 + "/likes/me", -1, new v9j() { // from class: l.xaa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.kda
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return xia.m209060X5(str, str, str, z);
                    }
                }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.lda
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: Ic */
    public void m209298Ic(User user, boolean z) {
        m209305Jc(user, z, null);
    }

    /* JADX INFO: renamed from: J6 */
    public synchronized void m209299J6() {
        synchronized (xia.class) {
            if (vwb.m200296J(this.f192985F0)) {
                return;
            }
            ArrayList arrayListM200324f0 = vwb.m200324f0(new String[0]);
            for (int i = 0; i < this.f192985F0.size(); i++) {
                Moment momentM209572w7 = m209572w7(this.f192985F0.get(i));
                if (momentM209572w7 != null && momentM209572w7.momentViewTime != -1 && mqi0.m155944o() - momentM209572w7.momentViewTime >= this.f192987G0 * 1000 && !this.f192981D0.contains(momentM209572w7.f56011id)) {
                    arrayListM200324f0.add(this.f192985F0.get(i));
                }
            }
            if (!vwb.m200296J(arrayListM200324f0)) {
                this.f192985F0.clear();
                m209535qc(arrayListM200324f0);
            }
        }
    }

    /* JADX INFO: renamed from: J7 */
    public C22306c<Envelope> m209300J7() {
        final String strM165085k = omg.m165085k("/users/" + FeedModule.m60222H().me_().f56011id + "/states");
        return scheduled("getMineStateObs", 0, new v9j() { // from class: l.gha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f102641a.m209518o9(strM165085k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: J8 */
    public final /* synthetic */ C22306c m209301J8(final String str) {
        return new la20(new v9j() { // from class: l.haa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165085k("/activity-users/" + str)).m185885d().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.iaa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112293a.m209294I8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J9 */
    public final /* synthetic */ Envelope m209302J9(boolean z, final String str, final String str2, Envelope envelope) {
        if (envelope == null) {
            this.f193070t1.m132487l(Boolean.TRUE);
            return Envelope.new_();
        }
        m209550sd(envelope);
        if (!z) {
            FeedModule.m60222H().mo30744ab(str).first().subscribe(mkd0.m154955G(new e30() { // from class: l.nca
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138140a.m209295I9(str, str2, (ConversationStatus) obj);
                }
            }));
        }
        return envelope;
    }

    /* JADX INFO: renamed from: Ja */
    public final /* synthetic */ C22306c m209303Ja(final Moment moment, final Moment moment2, e30 e30Var) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.h9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165107y()).m185893l(utc0.create(Network.JSON, moment.toJson())).m185883b();
            }
        }, omg.f144620E).map(new w9j() { // from class: l.s9a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m209170q2(moment2, (Envelope) obj);
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.daa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f85207a.m209296Ia(moment2, moment, (Envelope) obj);
            }
        }).doOnError(e30Var);
    }

    /* JADX INFO: renamed from: Jb */
    public C22306c<j760<Links, List<Moment>>> m209304Jb(Links links, an00 an00Var) {
        return m209409Yb(omg.m165068b0(links.next, this.f192988G1), "like/next", an00Var);
    }

    /* JADX INFO: renamed from: Jc */
    public void m209305Jc(final User user, boolean z, @Nullable MatchScData matchScData) {
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
            ijb0.m136545I();
            if (TEnum.equals(user.localFollowship.state, "matched")) {
                hpd0 hpd0Var = PhotoAlbumFeedAct.f41621e;
                if (!hpd0Var.get().booleanValue() && !m209496l8()) {
                    lsi0.m151593w(R$string.f38924K2);
                    hpd0Var.put(Boolean.TRUE);
                }
                if (NullChecker.m81303a(matchScData)) {
                    l3f l3fVar = new l3f();
                    l3fVar.f125900s = MatchScData.MID;
                    l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
                    l3fVar.f125895n = matchScData.pageId;
                    zvf0.m220392n(l3fVar, matchScData.toTrackParamMap());
                }
            } else {
                Relationship relationship = user.localRelationship;
                if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
                    e51.m114774y(new Runnable() { // from class: l.oda
                        @Override // java.lang.Runnable
                        public final void run() {
                            ijb0.m136572l(user);
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
        this.f192975A0.put(user.f56011id, user);
        this.f192979C0.m132487l(this.f192975A0);
        this.f193012Q0.m132487l(new j760<>(user, Boolean.valueOf(z)));
        ijb0.m136550N(FeedModule.m60221F().userId(), false);
        if (u2h.m191494c()) {
            ijb0.m136550N(user.f56011id, false);
        }
    }

    /* JADX INFO: renamed from: K6 */
    public final List<String> m209306K6(List<String> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (NullChecker.m81303a(list.get(i)) && !this.f192981D0.contains(list.get(i))) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K7 */
    public C22392a<Map<String, BubbleInfo>> m209307K7() {
        return this.f193048i1;
    }

    /* JADX INFO: renamed from: K8 */
    public final /* synthetic */ Envelope m209308K8(Envelope envelope) {
        if (envelope == null) {
            this.f193070t1.m132487l(Boolean.TRUE);
            return Envelope.new_();
        }
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: K9 */
    public final /* synthetic */ C22306c m209309K9(final String str, final boolean z, final String str2, final String str3) {
        return ia20.m135117a(new v9j() { // from class: l.t9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185894m(utc0.create(Network.JSON, "")).m185883b();
            }
        }).map(new w9j() { // from class: l.u9a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f175201a.m209302J9(z, str2, str3, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ka */
    public final /* synthetic */ C22306c m209310Ka(final Moment moment, final e30 e30Var, final Moment moment2) {
        return scheduled("postTheMoment", -1, new v9j() { // from class: l.ufa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f176240a.m209303Ja(moment2, moment, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: Kb */
    public C22306c<j760<Links, List<Moment>>> m209311Kb(an00 an00Var) {
        return m209423ac(omg.m165068b0(nah.m158678b() ? "limit=10" : "limit=20", this.f192988G1), "liked/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: Kc */
    public void m209312Kc(Relationship relationship, User user, boolean z, boolean z2) {
        if (relationship != null && vwb.m200296J(relationship.status)) {
            relationship.status = new ArrayList();
        }
        user.localRelationship = relationship;
        this.f192975A0.put(user.f56011id, user);
        this.f192979C0.m132487l(this.f192975A0);
        this.f193016S0.m132487l(new j760<>(user, Boolean.valueOf(z)));
    }

    @Deprecated
    /* JADX INFO: renamed from: L6 */
    public C22306c<roj0> m209313L6(final MomentMessage momentMessage) {
        if (!TEnum.equals(momentMessage.status(), "failed")) {
            return scheduled("commentDelete", -1, new v9j() { // from class: l.ida
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f112539a.m209531q8(momentMessage);
                }
            });
        }
        this.f192999K0.m132487l(momentMessage);
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: L7 */
    public MomentVoiceLiveInfos m209314L7(String str) {
        return this.f193045h0.get(str);
    }

    /* JADX INFO: renamed from: L8 */
    public final /* synthetic */ C22306c m209315L8(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.n8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185885d().m185883b();
            }
        }).map(new w9j() { // from class: l.o8a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f142605a.m209308K8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L9 */
    public final /* synthetic */ j760 m209316L9(String str, Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(feedData.messages);
        for (int i = 0; i < arrayList.size(); i++) {
            ((MomentMessage) arrayList.get(i)).moment = str;
        }
        m209557td(envelope, false);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: La */
    public final /* synthetic */ Boolean m209317La(String str, Moment moment) {
        return Boolean.valueOf(m208940Db(str));
    }

    /* JADX INFO: renamed from: Lb */
    public C22306c<j760<Links, List<Moment>>> m209318Lb(Links links) {
        return m209409Yb(omg.m165097q(links.next), m209286H7() + "next", null);
    }

    /* JADX INFO: renamed from: Lc */
    public final void m209319Lc(List<TopicMoment> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new Comparator() { // from class: l.r7a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return xia.m208938D4((TopicMoment) obj, (TopicMoment) obj2);
            }
        });
        double d = ((TopicMoment) arrayList.get(0)).createdTime;
        if (d > this.f193052k1.get().doubleValue()) {
            this.f193046h1.m132487l(Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: M6 */
    public C22306c<xaj0<Links, List<MomentMessage>, List<StickerInfo>>> m209320M6(final String str, final String str2, final Links links) {
        return scheduled("moments/" + str2 + "/comments/next", 0, new v9j() { // from class: l.p8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f147573a.m209545s8(str, str2, links);
            }
        });
    }

    /* JADX INFO: renamed from: M7 */
    public C22306c<List<LiveMultiCallLiveSchema>> m209321M7(String str) {
        final cll.C16188a c16188aM107524p = cll.m107499l(omg.m165085k("/live-schemas")).m107524p();
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c(FirebaseAnalytics.Event.SEARCH, str);
        }
        return scheduled("getMultiCallLiveSchema", 0, new v9j() { // from class: l.yba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.aea
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185900s(c16188a.m107537d()).m185887f().m185883b();
                    }
                }).compose(omg.m165092n0()).map(new w9j() { // from class: l.bea
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).liveSchemas;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: M8 */
    public final /* synthetic */ Envelope m209322M8(Moment moment, Envelope envelope) {
        Moment moment2 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        this.f193047i0.put(moment2.f56011id, moment2);
        ijb0.m136550N(FeedModule.m60221F().userId(), false);
        ijb0.m136555S(envelope);
        moment.f56011id = moment2.f56011id;
        if (vqg.m199532Z(moment2)) {
            this.f193059o0.m132487l(moment2);
            return envelope;
        }
        this.f193057n0.m132487l(moment2);
        return envelope;
    }

    /* JADX INFO: renamed from: M9 */
    public final /* synthetic */ C22306c m209323M9(final String str, final String str2, final String str3, final String str4, final String str5) {
        return new la20(new v9j() { // from class: l.caa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xia.m209128j2(str, str2, str3, str4, str5);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.eaa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f90181a.m209316L9(str3, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ma */
    public final /* synthetic */ Boolean m209324Ma(String str, Moment moment) {
        return Boolean.valueOf(m208940Db(str));
    }

    /* JADX INFO: renamed from: Mb */
    public C22306c<j760<Links, List<Moment>>> m209325Mb(String str) {
        return m209423ac(omg.m165095p(), m209286H7(), true, str, null);
    }

    /* JADX INFO: renamed from: Mc */
    public C22306c<TopicOperations> m209326Mc() {
        return scheduled("publishGuide", 0, new v9j() { // from class: l.sfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f164268a.m209352Qa();
            }
        });
    }

    /* JADX INFO: renamed from: N6 */
    public C22306c<MomentMessage> m209327N6(final String str, final MomentMessage momentMessage) {
        momentMessage.messageType = MomentMessageType.get("moment_comment");
        v9j v9jVar = new v9j() { // from class: l.fea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f97109a.m209559u8(momentMessage, str);
            }
        };
        o660 o660VarM167645d = p660.m167645d();
        final String strM162820c = NullChecker.m81303a(o660VarM167645d) ? o660VarM167645d.m162820c() : "";
        final e30<Throwable> e30Var = new e30() { // from class: l.gea
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102174a.m209566v8(momentMessage, str, strM162820c, (Throwable) obj);
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.hea
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107340a.m209589y8(str, momentMessage, strM162820c, e30Var, (MomentMessage) obj);
            }
        };
        return now(((C22306c) v9jVar.call()).doOnError(e30Var).flatMap(new w9j() { // from class: l.iea
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m209003O2(w9jVar, (MomentMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N7 */
    public C22306c<NearbyLocation> m209328N7(String str, String str2) {
        return m209335O7(str, str2, "", "");
    }

    /* JADX INFO: renamed from: N8 */
    public final /* synthetic */ C22306c m209329N8(final String str, final Moment moment) {
        return ia20.m135118b(new v9j() { // from class: l.oea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return omg.f144622G.auth().m185898q(TextUtils.isEmpty(str2) ? omg.m165107y() : omg.m165108z(str2)).m185893l(utc0.create(Network.JSON, moment.toJson())).m185883b();
            }
        }, omg.f144620E).map(new w9j() { // from class: l.pea
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148414a.m209322M8(moment, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N9 */
    public final /* synthetic */ j760 m209330N9(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        m209550sd(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(feedData.comments);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Na */
    public final /* synthetic */ roj0 m209331Na(String str, int i, Envelope envelope) {
        HashSet hashSet = new HashSet();
        Iterator<String> it = this.f193047i0.keySet().iterator();
        while (it.hasNext()) {
            Moment moment = this.f193047i0.get(it.next());
            if (NullChecker.m81303a(moment) && !vwb.m200296J(moment.mTopicList) && TextUtils.equals(moment.mTopicList.get(0).f39247id, str) && !hashSet.contains(moment.mTopicList.get(0))) {
                hashSet.add(moment.mTopicList.get(0));
                List<VoteOptions> list = moment.mTopicList.get(0).options;
                moment.mTopicList.get(0).voteCounter++;
                if (!vwb.m200296J(list)) {
                    list.get(i).haveliked = true;
                    list.get(i).counter++;
                }
            }
        }
        this.f193053l0.m132487l(this.f193047i0);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Nb */
    public C22306c<j760<Links, List<MomentMessage>>> m209332Nb(final String str, final String str2, final String str3, final String str4, final String str5) {
        return scheduled("/moments/" + str3 + "/messages/" + str4 + "/subMessages", 0, new v9j() { // from class: l.iia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f113376a.m209323M9(str5, str2, str3, str4, str);
            }
        });
    }

    /* JADX INFO: renamed from: Nc */
    public void m209333Nc(List<String> list) {
        List<String> listM209306K6 = m209306K6(list);
        if (vwb.m200296J(listM209306K6)) {
            return;
        }
        m209535qc(listM209306K6);
    }

    /* JADX INFO: renamed from: O6 */
    public List<MomentMessage> m209334O6(Moment moment) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(moment.messages) && NullChecker.m81303a(moment.messages.ids)) {
            Iterator<String> it = moment.messages.ids.iterator();
            while (it.hasNext()) {
                MomentMessage momentMessage = this.f192990H0.get(it.next());
                if (NullChecker.m81303a(momentMessage)) {
                    arrayList.add(momentMessage);
                }
            }
            vwb.m200295I(arrayList, new Comparator() { // from class: l.cda
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return xia.m209063Y2((MomentMessage) obj, (MomentMessage) obj2);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O7 */
    public C22306c<NearbyLocation> m209335O7(String str, String str2, String str3, String str4) {
        final String strM208770r = xh5.m208770r(str, str2, str3, str4);
        return scheduled("map_nearby_local" + str3 + str4, 0, new v9j() { // from class: l.q9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.fda
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
                    }
                }, NearbyLocation.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: O8 */
    public final /* synthetic */ Envelope m209336O8(Envelope envelope) {
        if (envelope != null) {
            m209550sd(envelope);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: O9 */
    public final /* synthetic */ C22306c m209337O9(final String str, final String str2, final String str3, final String str4, final String str5) {
        return new la20(new v9j() { // from class: l.j8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xia.m209091d1(str, str2, str3, str4, str5);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.k8a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f121790a.m209330N9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Oa */
    public final /* synthetic */ C22306c m209338Oa(v9j v9jVar, final String str, final int i) {
        return new la20(v9jVar).compose(mkd0.m154951C()).map(new w9j() { // from class: l.sba
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163511a.m209331Na(str, i, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ob */
    public C22306c<j760<Links, List<MomentMessage>>> m209339Ob(final String str, final String str2, final String str3, final String str4, final String str5) {
        return scheduled("/topics/" + str3 + "/comments/" + str4 + "/subComments", 0, new v9j() { // from class: l.jia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f118068a.m209337O9(str5, str2, str3, str4, str);
            }
        });
    }

    /* JADX INFO: renamed from: Oc */
    public final void m209340Oc(List<LiveCircleBanner> list) {
        this.f193066r1.clear();
        if (NullChecker.m81303a(list)) {
            vwb.m200354z(list, new e30() { // from class: l.tca
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169431a.m209359Ra((LiveCircleBanner) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P6 */
    public C22306c<Envelope> m209341P6(DetectRequest detectRequest) {
        final String json = detectRequest.toJson();
        return scheduled("contentDetect", -1, new v9j() { // from class: l.v9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f180618a.m209235A8(json);
            }
        }, false);
    }

    /* JADX INFO: renamed from: P7 */
    public C22393b<Map<String, TopicMoment>> m209342P7() {
        return this.f193036c1;
    }

    /* JADX INFO: renamed from: P8 */
    public final /* synthetic */ C22306c m209343P8(final String str) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.sea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185885d().m185883b();
            }
        }, 0).compose(omg.m165092n0()).map(new w9j() { // from class: l.tea
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169807a.m209336O8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P9 */
    public final /* synthetic */ xaj0 m209344P9(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        List<StickerInfo> list = feedData.stickers;
        Moment moment = vwb.m200296J(feedData.moments) ? null : feedData.moments.get(0);
        Music music = !vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).musics) ? ((FeedData) envelope.getModuleData(FeedData.class)).musics.get(0) : null;
        RawFeed rawFeed = vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).feeds) ? null : ((FeedData) envelope.getModuleData(FeedData.class)).feeds.get(0);
        if (vqg.m199532Z(moment) && feedData.moments.size() < 2) {
            m209543rd(moment.thirdShareSource.sourceId);
        }
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        return new xaj0(moment, new j760(list, feedData.messages), new j760(music, rawFeed));
    }

    /* JADX INFO: renamed from: Pa */
    public final /* synthetic */ TopicOperations m209345Pa(Envelope envelope) {
        m209557td(envelope, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).topicOperations);
        TopicOperations topicOperations = (TopicOperations) vwb.m200346r(arrayList, new w9j() { // from class: l.d9a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, OperationType.newUserAIMoment));
            }
        });
        this.f192991H1 = topicOperations;
        return topicOperations;
    }

    /* JADX INFO: renamed from: Pb */
    public udh m209346Pb() {
        return this.f193068s1.m197998a();
    }

    /* JADX INFO: renamed from: Pc */
    public final void m209347Pc(List<LiveCircleExtInfo> list) {
        this.f193064q1.clear();
        if (NullChecker.m81303a(list)) {
            vwb.m200354z(list, new e30() { // from class: l.nba
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138022a.m209366Sa((LiveCircleExtInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public List<Moment> m209348Q6(final Envelope envelope, boolean z) {
        final HashMap map = new HashMap();
        vwb.m200354z(((FeedData) envelope.getModuleData(FeedData.class)).moments, new e30() { // from class: l.jaa
            @Override // p149l.e30
            public final void call(Object obj) {
                Moment moment = (Moment) obj;
                map.put(moment.f56011id, moment);
            }
        });
        final HashMap map2 = new HashMap();
        if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).rooms)) {
            vwb.m200354z(((FeedData) envelope.getModuleData(FeedData.class)).rooms, new e30() { // from class: l.kaa
                @Override // p149l.e30
                public final void call(Object obj) {
                    Room room = (Room) obj;
                    map2.put(room.f38810id, room);
                }
            });
        }
        final HashMap map3 = new HashMap();
        if (NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).liveRecommendCards)) {
            vwb.m200354z(((FeedData) envelope.getModuleData(FeedData.class)).liveRecommendCards, new e30() { // from class: l.laa
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveRecommendCard liveRecommendCard = (LiveRecommendCard) obj;
                    map3.put(liveRecommendCard.f39228id, liveRecommendCard);
                }
            });
        }
        final ArrayList arrayList = new ArrayList();
        if (((FeedData) envelope.getModuleData(FeedData.class)).feeds == null) {
            return arrayList;
        }
        if (z) {
            vwb.m200354z(((FeedData) envelope.getModuleData(FeedData.class)).feeds, new e30() { // from class: l.maa
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f132839a.m209243B8((RawFeed) obj);
                }
            });
        } else {
            vwb.m200320d0(((FeedData) envelope.getModuleData(FeedData.class)).feeds, new w9j() { // from class: l.naa
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f137871a.m209251C8((RawFeed) obj);
                }
            });
        }
        m209354Qc(((FeedData) envelope.getModuleData(FeedData.class)).lives);
        m209375Tc(((FeedData) envelope.getModuleData(FeedData.class)).voiceLives);
        m209389Vc(((FeedData) envelope.getModuleData(FeedData.class)).voiceRooms);
        m209361Rc(((FeedData) envelope.getModuleData(FeedData.class)).voiceLiveGames);
        m209368Sc(((FeedData) envelope.getModuleData(FeedData.class)).voiceLiveMomentFeeds);
        m209347Pc(((FeedData) envelope.getModuleData(FeedData.class)).liveCircleMomentExtInfos);
        m209340Oc(((FeedData) envelope.getModuleData(FeedData.class)).liveGroupCircleMomentBanners);
        final HashMap<String, LiveUserMask> mapM209382Uc = m209382Uc(((FeedData) envelope.getModuleData(FeedData.class)).masks);
        vwb.m200354z(((FeedData) envelope.getModuleData(FeedData.class)).feeds, new e30() { // from class: l.paa
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147961a.m209259D8(map, arrayList, map3, map2, mapM209382Uc, envelope, (RawFeed) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: Q7 */
    public C22306c<roj0> m209349Q7(String str) {
        final String strM165085k = omg.m165085k("/notify-users?search=" + str + "&with=" + omg.f144642t + ",topic");
        return scheduled("getNotifyUsers" + str, 0, new v9j() { // from class: l.m8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f132550a.m209532q9(strM165085k);
            }
        });
    }

    /* JADX INFO: renamed from: Q8 */
    public final /* synthetic */ roj0 m209350Q8(MomentMessage momentMessage, String str, Envelope envelope) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        String str2 = commentInfo.parentMessageId;
        List<String> list = commentInfo.subMessageIds;
        Moment moment = this.f193047i0.get(str);
        if (moment == null) {
            return roj0.f160388a;
        }
        if (TextUtils.isEmpty(str2) || str2.equals("0")) {
            PartialIdList partialIdList = moment.messages;
            partialIdList.count--;
            partialIdList.ids.remove(momentMessage.f56008id);
            f192972L1 = vwb.m200311Y(str, 2);
            this.f192999K0.m132487l(momentMessage);
            this.f192990H0.remove(momentMessage.f56008id);
            if (NullChecker.m81304b(list)) {
                for (int i = 0; i < list.size(); i++) {
                    String str3 = list.get(i);
                    MomentMessage momentMessage2 = this.f192990H0.get(str3);
                    if (NullChecker.m81303a(momentMessage2)) {
                        PartialIdList partialIdList2 = moment.messages;
                        partialIdList2.count--;
                        partialIdList2.ids.remove(str3);
                        this.f192999K0.m132487l(momentMessage2);
                        this.f192990H0.remove(str3);
                    }
                }
            }
            this.f193047i0.put(str, moment);
            this.f193053l0.m132487l(this.f193047i0);
        } else {
            PartialIdList partialIdList3 = moment.messages;
            partialIdList3.count--;
            partialIdList3.ids.remove(momentMessage.f56008id);
            this.f192999K0.m132487l(momentMessage);
            this.f192990H0.remove(momentMessage.f56008id);
            MomentMessage momentMessage3 = this.f192990H0.get(str2);
            if (NullChecker.m81304b(momentMessage3)) {
                momentMessage3.commentInfo.subMessageIds.remove(momentMessage.f56008id);
                this.f192990H0.put(str2, momentMessage3);
            }
            this.f193047i0.put(str, moment);
            this.f193053l0.m132487l(this.f193047i0);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Q9 */
    public final /* synthetic */ void m209351Q9(String str, Throwable th) {
        if ((th instanceof ApiExcep.Client.Forbidden) || (th instanceof ApiExcep.Client.NotFound)) {
            m209543rd(str);
        }
    }

    /* JADX INFO: renamed from: Qa */
    public final /* synthetic */ C22306c m209352Qa() {
        return new la20(new v9j() { // from class: l.dha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165102t("/publishGuide?scene=newUserAIMoment")).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.fha
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97491a.m209345Pa((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Qb */
    public void m209353Qb(Moment moment) {
        if (moment == null) {
            return;
        }
        if (moment.forwards == null) {
            moment.forwards = MomentForwards.new_();
        }
        moment.forwards.count++;
        this.f193047i0.put(moment.f56011id, moment);
        this.f193053l0.m132487l(this.f193047i0);
    }

    /* JADX INFO: renamed from: Qc */
    public void m209354Qc(List<Live> list) {
        if (u2h.m191495d() && NullChecker.m81303a(list)) {
            vwb.m200354z(list, new e30() { // from class: l.rca
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f158758a.m209373Ta((Live) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R6 */
    public C22306c<TopicMoment> m209355R6(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", str);
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            jSONObject.put(Owner.TYPE, jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        final String string = jSONObject.toString();
        return scheduled("createTopicNew", -1, new v9j() { // from class: l.pca
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f148161a.m209273F8(string);
            }
        }, false);
    }

    /* JADX INFO: renamed from: R7 */
    public NotifyUsers m209356R7(String str) {
        return this.f193049j0.get(str);
    }

    /* JADX INFO: renamed from: R8 */
    public final /* synthetic */ C22306c m209357R8(final String str, final String str2, final MomentMessage momentMessage) {
        new MomentMessage().recalled = Boolean.TRUE;
        return new la20((v9j<stc0>) new v9j() { // from class: l.xda
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165087l(str, str2, momentMessage.f56008id)).m185885d().m185883b();
            }
        }, 0).compose(omg.m165092n0()).map(new w9j() { // from class: l.yda
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f197529a.m209350Q8(momentMessage, str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R9 */
    public final /* synthetic */ C22306c m209358R9(final String str, final String str2, final boolean z, final String str3) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.tia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165051M(str, str2, z, str3) + "&" + omg.f144648z + "&source=viewer").m185883b();
            }
        }, omg.f144619D).compose(omg.m165092n0()).map(new w9j() { // from class: l.uia
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176638a.m209344P9((Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.via
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181591a.m209351Q9(str2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ra */
    public final /* synthetic */ void m209359Ra(LiveCircleBanner liveCircleBanner) {
        this.f193066r1.put(liveCircleBanner.f39224id, liveCircleBanner);
    }

    /* JADX INFO: renamed from: Rb */
    public C22306c<xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>>> m209360Rb(String str, String str2) {
        return m209374Tb(str, str2, true);
    }

    /* JADX INFO: renamed from: Rc */
    public final void m209361Rc(List<VoiceLiveGame> list) {
        if (u2h.m191495d()) {
            this.f193060o1.clear();
            if (NullChecker.m81303a(list)) {
                vwb.m200354z(list, new e30() { // from class: l.taa
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f169104a.m209380Ua((VoiceLiveGame) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: S6 */
    public C22306c<roj0> m209362S6(final Moment moment) {
        boolean zEquals = TEnum.equals(moment.status(), "failed");
        String str = moment.f56011id;
        if (!zEquals) {
            return !str.startsWith("fake_id_") ? scheduled("momentDelete", -1, new v9j() { // from class: l.sca
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f163716a.m209287H8(moment);
                }
            }) : C22306c.just(roj0.f160388a);
        }
        if (str.startsWith("fake_id_")) {
            this.f193018T0.remove(moment.f56011id);
        }
        this.f193061p0.m132487l(moment);
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: S7 */
    public final String m209363S7(String str, String str2) {
        return str + "/personal/media/previous" + str2;
    }

    /* JADX INFO: renamed from: S8 */
    public final /* synthetic */ List m209364S8(Envelope envelope) {
        m209557td(envelope, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentPopWindows);
        return arrayList;
    }

    /* JADX INFO: renamed from: S9 */
    public final /* synthetic */ j760 m209365S9(Envelope envelope) {
        m209550sd(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Sa */
    public final /* synthetic */ void m209366Sa(LiveCircleExtInfo liveCircleExtInfo) {
        this.f193064q1.put(liveCircleExtInfo.f39225id, liveCircleExtInfo);
    }

    /* JADX INFO: renamed from: Sb */
    public C22306c<xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>>> m209367Sb(String str, String str2, String str3) {
        return m209381Ub(str, str2, true, str3);
    }

    /* JADX INFO: renamed from: Sc */
    public final void m209368Sc(List<VoiceLiveMomentFeed> list) {
        if (u2h.m191495d()) {
            this.f193062p1.clear();
            if (NullChecker.m81303a(list)) {
                vwb.m200354z(list, new e30() { // from class: l.fca
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f96781a.m209387Va((VoiceLiveMomentFeed) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: T6 */
    public C22306c<Envelope> m209369T6(final String str) {
        return scheduled("activity-users/delete" + str, -1, new v9j() { // from class: l.qha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f154439a.m209301J8(str);
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    public final String m209370T7(String str) {
        return str + "/personal/feed/previous";
    }

    /* JADX INFO: renamed from: T8 */
    public final /* synthetic */ C22306c m209371T8(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.yca
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xia.m209106f4(str, str2);
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.zca
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202522a.m209364S8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T9 */
    public final /* synthetic */ C22306c m209372T9(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.c8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165049K(str, str2)).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.d8a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f84840a.m209365S9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Ta */
    public final /* synthetic */ void m209373Ta(Live live) {
        this.f193054l1.put(live.f38767id, live);
    }

    /* JADX INFO: renamed from: Tb */
    public C22306c<xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>>> m209374Tb(String str, String str2, boolean z) {
        return m209381Ub(str, str2, true, "");
    }

    /* JADX INFO: renamed from: Tc */
    public void m209375Tc(List<VoiceLive> list) {
        if (u2h.m191495d() && NullChecker.m81303a(list)) {
            vwb.m200354z(list, new e30() { // from class: l.yaa
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f197158a.m209394Wa((VoiceLive) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U6 */
    public C22306c<j760<Links, List<Moment>>> m209376U6(Links links, an00 an00Var) {
        return m209409Yb(omg.m165060V(links.next), "discussion/next", an00Var);
    }

    /* JADX INFO: renamed from: U7 */
    public C22306c<Envelope> m209377U7(String str) {
        final String strM165076f0 = omg.m165076f0(str, "limit=20");
        return scheduled("getPoiTraceCardInfoData" + str, 0, new v9j() { // from class: l.cga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f80730a.m209546s9(strM165076f0);
            }
        });
    }

    /* JADX INFO: renamed from: U8 */
    public final /* synthetic */ Followship m209378U8(boolean z, User user, MatchScData matchScData, Envelope envelope) {
        C22392a<List<User>> c22392a = this.f193069t0;
        if (z) {
            c22392a.m221515e().add(user);
        } else {
            c22392a.m221515e().remove(user);
        }
        C22392a<List<User>> c22392a2 = this.f193069t0;
        c22392a2.m132487l(c22392a2.m221515e());
        ijb0.m136555S(envelope);
        if (nkg.m159854K()) {
            ijb0.m136545I();
        }
        m209305Jc(user, z, matchScData);
        if (u2h.m191495d() || u2h.m191494c()) {
            ijb0.m136557U(user, true);
        }
        Followship followshipNew_ = vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).followships) ? Followship.new_() : ((FeedData) envelope.getModuleData(FeedData.class)).followships.get(0);
        this.f193078x1.m132487l(followshipNew_);
        return followshipNew_;
    }

    /* JADX INFO: renamed from: U9 */
    public final /* synthetic */ j760 m209379U9(Envelope envelope) {
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        return new j760(feedData.stickers, feedData.messages);
    }

    /* JADX INFO: renamed from: Ua */
    public final /* synthetic */ void m209380Ua(VoiceLiveGame voiceLiveGame) {
        this.f193060o1.put(voiceLiveGame.voiceLiveId, voiceLiveGame);
    }

    /* JADX INFO: renamed from: Ub */
    public C22306c<xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>>> m209381Ub(final String str, final String str2, final boolean z, final String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !"null".equals(str) && !"null".equals(str2)) {
            return scheduled("moment/refresh/" + str2, 0, new v9j() { // from class: l.oga
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f143831a.m209358R9(str, str2, z, str3);
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
        return C22306c.error(new Throwable(sb.toString()));
    }

    /* JADX INFO: renamed from: Uc */
    public HashMap<String, LiveUserMask> m209382Uc(List<LiveUserMask> list) {
        if (!u2h.m191495d()) {
            return new HashMap<>();
        }
        final HashMap<String, LiveUserMask> map = new HashMap<>();
        if (NullChecker.m81303a(list)) {
            vwb.m200354z(list, new e30() { // from class: l.waa
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveUserMask liveUserMask = (LiveUserMask) obj;
                    map.put(liveUserMask.userId, liveUserMask);
                }
            });
        }
        return map;
    }

    /* JADX INFO: renamed from: V6 */
    public C22306c<j760<Links, List<Moment>>> m209383V6(an00 an00Var) {
        return m209423ac(omg.m165060V("limit=20"), "discussion/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: V7 */
    public final String m209384V7(BubbleInfo bubbleInfo, hf00 hf00Var) {
        if (!NullChecker.m81303a(bubbleInfo) || TextUtils.isEmpty(bubbleInfo.f38730id) || !NullChecker.m81303a(hf00Var)) {
            return null;
        }
        RawFeed rawFeedM130721c = hf00Var.m130721c(bubbleInfo.f38730id);
        if (!NullChecker.m81303a(rawFeedM130721c) || TextUtils.isEmpty(rawFeedM130721c.locationName)) {
            return null;
        }
        return rawFeedM130721c.locationName;
    }

    /* JADX INFO: renamed from: V8 */
    public final /* synthetic */ C22306c m209385V8(final String str, final String str2, final User user, final String str3, final String str4, final Followship followship, final boolean z, final MatchScData matchScData) {
        return new la20(new v9j() { // from class: l.zaa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xia.m209117h3(str, str2, user, str3, str4, followship);
            }
        }).compose(mkd0.m154951C()).map(new w9j() { // from class: l.lba
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127279a.m209378U8(z, user, matchScData, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.wba
            @Override // p149l.e30
            public final void call(Object obj) {
                t2h.m186977h((Throwable) obj, z);
            }
        });
    }

    /* JADX INFO: renamed from: V9 */
    public final /* synthetic */ C22306c m209386V9(final String str, final String str2, final String str3) {
        return new la20(new v9j() { // from class: l.tba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165050L(str, str2, str3)).m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.uba
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f175678a.m209379U9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Va */
    public final /* synthetic */ void m209387Va(VoiceLiveMomentFeed voiceLiveMomentFeed) {
        this.f193062p1.put(voiceLiveMomentFeed.f39251id, voiceLiveMomentFeed);
    }

    /* JADX INFO: renamed from: Vb */
    public C22306c<j760<Links, List<TopicMoment>>> m209388Vb(String str, final String str2, final String str3) {
        return scheduled(str, 0, new v9j() { // from class: l.t7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f168680a.m209372T9(str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: Vc */
    public void m209389Vc(List<VoiceRoomInfo> list) {
        if (u2h.m191495d() && NullChecker.m81303a(list)) {
            vwb.m200354z(list, new e30() { // from class: l.gba
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f101824a.m209401Xa((VoiceRoomInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W6 */
    public C22306c<Envelope> m209390W6(String str, String str2) {
        final String strM165085k = omg.m165085k(String.format("/users/%s/states/%s/likes/me", str2, str));
        return scheduled("dislikeState", -1, new v9j() { // from class: l.c7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f79602a.m209315L8(strM165085k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: W7 */
    public final String m209391W7(BubbleInfo bubbleInfo, hf00 hf00Var) {
        if (!NullChecker.m81303a(bubbleInfo) || TextUtils.isEmpty(bubbleInfo.f38730id) || !NullChecker.m81303a(hf00Var)) {
            return null;
        }
        RawFeed rawFeedM130721c = hf00Var.m130721c(bubbleInfo.f38730id);
        if (!NullChecker.m81303a(rawFeedM130721c) || TextUtils.isEmpty(rawFeedM130721c.recommendReason)) {
            return null;
        }
        return rawFeedM130721c.recommendReason;
    }

    /* JADX INFO: renamed from: W8 */
    public final /* synthetic */ C22306c m209392W8(User user, Envelope envelope) {
        if (vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).followships) || TEnum.equals(((FeedData) envelope.getModuleData(FeedData.class)).followships.get(0).state, "matched")) {
            ijb0.m136545I();
            ijb0.m136555S(envelope);
            m209291Hc(user);
            return C22306c.just(user.localFollowship);
        }
        user.localFollowship = ((FeedData) envelope.getModuleData(FeedData.class)).followships.get(0);
        this.f192975A0.put(user.f56011id, user);
        this.f192979C0.m132487l(this.f192975A0);
        this.f193012Q0.m132487l(new j760<>(user, Boolean.TRUE));
        ijb0.m136550N(FeedModule.m60221F().userId(), false);
        lsi0.m151580j("对方取消了关注，暂时无法聊天");
        return C22306c.error(f192974N1);
    }

    /* JADX INFO: renamed from: W9 */
    public final /* synthetic */ j760 m209393W9(an00 an00Var, Envelope envelope) {
        if (NullChecker.m81303a(an00Var)) {
            an00Var.mo65703a(envelope);
        }
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        List<BubbleInfo> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (nkg.m159889k0() && NullChecker.m81303a(list) && !vwb.m200296J(list2)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).states.addAll(list2);
            }
        }
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        ArrayList arrayList = new ArrayList();
        if (u2h.m191495d() && NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            arrayList.addAll(m209348Q6(envelope, false));
        } else {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Wa */
    public final /* synthetic */ void m209394Wa(VoiceLive voiceLive) {
        this.f193056m1.put(voiceLive.f39250id, voiceLive);
    }

    /* JADX INFO: renamed from: Wb */
    public C22306c<j760<List<StickerInfo>, List<MomentMessage>>> m209395Wb(final String str, final String str2, final String str3) {
        return scheduled("moment/get/message" + str3, 0, new v9j() { // from class: l.z8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f202113a.m209386V9(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: Wc */
    public C22306c<j760<Links, List<Moment>>> m209396Wc(boolean z) {
        return m209402Xb(omg.m165047I("limit=20", z), "recommend/next");
    }

    /* JADX INFO: renamed from: X6 */
    public C22306c<Envelope> m209397X6(Moment moment) {
        return m209404Y6(moment, null);
    }

    /* JADX INFO: renamed from: X7 */
    public C22306c<j760<List<Moment>, List<RawFeed>>> m209398X7(String str, String str2, String str3) {
        final String strM165085k = omg.m165085k("/moments?search=interaction&pagesource=" + str + "&query=" + str2 + "&interaction=" + str3);
        return scheduled("moments/interaction/" + str2, 0, new v9j() { // from class: l.e9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f89932a.m209560u9(strM165085k);
            }
        });
    }

    /* JADX INFO: renamed from: X8 */
    public final /* synthetic */ C22306c m209399X8(final String str, final User user, final Followship followship) {
        return new la20(new v9j() { // from class: l.kga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xia.m209138k6(str, user, followship);
            }
        }).compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.lga
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127967a.m209392W8(user, (Envelope) obj);
            }
        }).doOnError(new e30() { // from class: l.mga
            @Override // p149l.e30
            public final void call(Object obj) {
                xia.m209034T3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X9 */
    public final /* synthetic */ C22306c m209400X9(final String str, final an00 an00Var, final String str2, final long j) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.rha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }, omg.f144619D | omg.f144620E).map(new w9j() { // from class: l.sha
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m209122i2(an00Var, str2, (Envelope) obj);
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.tha
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f170213a.m209393W9(an00Var, (Envelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.uha
            @Override // p149l.e30
            public final void call(Object obj) {
                xia.m209166p4(str2, j, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Xa */
    public final /* synthetic */ void m209401Xa(VoiceRoomInfo voiceRoomInfo) {
        this.f193058n1.put(voiceRoomInfo.f38838id, voiceRoomInfo);
    }

    /* JADX INFO: renamed from: Xb */
    public C22306c<j760<Links, List<Moment>>> m209402Xb(String str, String str2) {
        return m209409Yb(str, str2, null);
    }

    /* JADX INFO: renamed from: Xc */
    public C22306c<j760<Links, List<Moment>>> m209403Xc(boolean z) {
        return m209416Zb(omg.m165047I("limit=20", z), "recommend/previous", false, null);
    }

    /* JADX INFO: renamed from: Y6 */
    public C22306c<Envelope> m209404Y6(final Moment moment, final String str) {
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("everyone");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        moment.allowForward = MomentAllowForwardState.get(MomentAllowForwardState.allow);
        if (moment.createdTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            moment.createdTime = omg.m165099r0();
        }
        if (TextUtils.isEmpty(moment.owner)) {
            moment.owner = FeedModule.m60221F().userId();
        }
        if (TEnum.equals(moment.userSetVisibility, "unknown_")) {
            moment.userSetVisibility = UserSetVisibility.get("everyone");
        }
        return scheduled("postTheMoment", -1, new v9j() { // from class: l.bba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f74788a.m209329N8(str, moment);
            }
        });
    }

    /* JADX INFO: renamed from: Y7 */
    public C22306c<Envelope> m209405Y7(String str, final an00 an00Var) {
        final String strM165085k;
        if (TextUtils.isEmpty(str)) {
            strM165085k = omg.m165085k("/states?search=square&with=users");
        } else {
            strM165085k = omg.m165085k("/states?search=square&with=users&" + str);
        }
        return scheduled("getSquareStateData", 0, new v9j() { // from class: l.s7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f162901a.m209574w9(strM165085k, an00Var);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Y8 */
    public final /* synthetic */ j760 m209406Y8(Envelope envelope) {
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        Pagination pagination = envelope.pagination;
        return commonData == null ? new j760(pagination.links, null) : new j760(pagination.links, commonData.users);
    }

    /* JADX INFO: renamed from: Y9 */
    public final /* synthetic */ j760 m209407Y9(an00 an00Var, String str, String str2, boolean z, Envelope envelope) {
        if (NullChecker.m81303a(an00Var)) {
            an00Var.mo65704c(envelope);
        }
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        List<BubbleInfo> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (nkg.m159889k0() && NullChecker.m81303a(list) && !vwb.m200296J(list2)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).states.addAll(list2);
            }
        }
        ijb0.m136554R(envelope.counters);
        m209550sd(envelope);
        m209503m8(envelope, str, str2);
        ArrayList arrayList = new ArrayList();
        if (z) {
            for (Moment moment : this.f193018T0.values()) {
                if (moment.owner.equals(str)) {
                    arrayList.add(moment);
                }
            }
        }
        if (u2h.m191495d() && NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            arrayList.addAll(m209348Q6(envelope, true));
        } else {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        ijb0.m136555S(envelope);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: Ya */
    public final /* synthetic */ Envelope m209408Ya(Envelope envelope) {
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: Yb */
    public C22306c<j760<Links, List<Moment>>> m209409Yb(final String str, final String str2, final an00 an00Var) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return scheduled(str2, 0, new v9j() { // from class: l.gga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f102478a.m209400X9(str, an00Var, str2, jElapsedRealtime);
            }
        });
    }

    /* JADX INFO: renamed from: Yc */
    public void m209410Yc(String str) {
        m209501ld(str).subscribe(mkd0.m154956H(new e30() { // from class: l.t6a
            @Override // p149l.e30
            public final void call(Object obj) {
                xia.m208999N4((roj0) obj);
            }
        }, new e30() { // from class: l.aba
            @Override // p149l.e30
            public final void call(Object obj) {
                xia.m209074a2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z6 */
    public C22306c<Envelope> m209411Z6(String str, String str2) {
        final String strM165085k = omg.m165085k(String.format("/users/%s/states/%s", str2, str));
        return scheduled("endState", -1, new v9j() { // from class: l.r9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.gca
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(str).m185885d().m185883b();
                    }
                }).map(new w9j() { // from class: l.ica
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return xia.m209226y5((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: Z7 */
    public C22306c<Envelope> m209412Z7(String str, String str2) {
        final String strM165085k = omg.m165085k(String.format("/users/%s/states/%s", str2, str));
        return scheduled("endState", 0, new v9j() { // from class: l.jga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.hha
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.iha
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return xia.m209215x0((Envelope) obj);
                    }
                });
            }
        }, true);
    }

    /* JADX INFO: renamed from: Z8 */
    public final /* synthetic */ C22306c m209413Z8(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.wia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165085k(str)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.e7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f89679a.m209406Y8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z9 */
    public final /* synthetic */ C22306c m209414Z9(final String str, final an00 an00Var, final String str2, final String str3, final boolean z) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.pia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }, omg.f144619D | omg.f144620E).map(new w9j() { // from class: l.qia
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m209090c6(an00Var, str2, (Envelope) obj);
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.ria
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159528a.m209407Y9(an00Var, str3, str, z, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Za */
    public final /* synthetic */ C22306c m209415Za(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.w6a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.x6a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f191225a.m209408Ya((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Zb */
    public C22306c<j760<Links, List<Moment>>> m209416Zb(String str, String str2, boolean z, String str3) {
        return m209423ac(str, str2, z, str3, null);
    }

    /* JADX INFO: renamed from: Zc */
    public C22306c<Envelope> m209417Zc(String str) {
        final String strM165085k = omg.m165085k("/users/" + str + "/topics?search=profile");
        return scheduled("requestAllProfileTopic", 0, new v9j() { // from class: l.sga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f164378a.m209415Za(strM165085k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: a7 */
    public C22306c<Envelope> m209418a7(String str, String str2) {
        final String strM165085k = omg.m165085k("/groups/" + str + "/users/" + str2);
        return scheduled("exitTheGroup" + str, -1, new v9j() { // from class: l.sda
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f163819a.m209343P8(strM165085k);
            }
        });
    }

    /* JADX INFO: renamed from: a8 */
    public C22306c<List<BubbleInfo>> m209419a8() {
        return scheduled("states?search=quickchat", 0, new v9j() { // from class: l.bga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f75418a.m209590y9();
            }
        });
    }

    /* JADX INFO: renamed from: a9 */
    public final /* synthetic */ xaj0 m209420a9(Envelope envelope) {
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return (commonData == null || feedData == null) ? new xaj0(envelope.pagination.links, null, null) : new xaj0(envelope.pagination.links, commonData.users, feedData.sourceCatCount);
    }

    /* JADX INFO: renamed from: aa */
    public final /* synthetic */ j760 m209421aa(Envelope envelope) {
        ijb0.m136554R(envelope.counters);
        m209550sd(envelope);
        ArrayList arrayList = new ArrayList();
        if (u2h.m191495d() && NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            arrayList.addAll(m209348Q6(envelope, true));
        } else {
            arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        }
        ijb0.m136555S(envelope);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: ab */
    public final /* synthetic */ Envelope m209422ab(Envelope envelope) {
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ac */
    public C22306c<j760<Links, List<Moment>>> m209423ac(final String str, final String str2, final boolean z, final String str3, final an00 an00Var) {
        return scheduled(str2, 0, new v9j() { // from class: l.fga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f97342a.m209414Z9(str, an00Var, str2, str3, z);
            }
        });
    }

    /* JADX INFO: renamed from: ad */
    public C22306c<Envelope> m209424ad(String str, int i) {
        final String str2;
        String strM165085k = omg.m165085k("/moments?search=recommend&with=musics&filter=video");
        if (TextUtils.isEmpty(str)) {
            str2 = strM165085k + "&limit=" + i;
        } else {
            str2 = strM165085k + "&" + str;
        }
        return scheduled("/moments?search=recommend&filter=video", 0, new v9j() { // from class: l.qaa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f153516a.m209429bb(str2);
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public C22306c<roj0> m209425b7(final String str, final String str2, final MomentMessage momentMessage) {
        if (TEnum.equals(momentMessage.status(), "failed")) {
            this.f192999K0.m132487l(momentMessage);
            return C22306c.just(roj0.f160388a);
        }
        return scheduled("/moments/" + str2 + "/messages/" + momentMessage.f56008id, -1, new v9j() { // from class: l.hba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f106916a.m209357R8(str, str2, momentMessage);
            }
        });
    }

    /* JADX INFO: renamed from: b8 */
    public C22392a<j760<List<TopicCategorie>, List<TopicMoment>>> m209426b8() {
        return this.f193044g1;
    }

    /* JADX INFO: renamed from: b9 */
    public final /* synthetic */ C22306c m209427b9(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.aia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165085k(str)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.lia
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128178a.m209420a9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ba */
    public final /* synthetic */ C22306c m209428ba(final String str) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.qba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }, omg.f144619D | omg.f144620E).compose(omg.m165092n0()).map(new w9j() { // from class: l.rba
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158592a.m209421aa((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: bb */
    public final /* synthetic */ C22306c m209429bb(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.ada
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.bda
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75014a.m209422ab((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: bc */
    public C22306c<j760<Links, List<Moment>>> m209430bc(final String str, String str2, boolean z, String str3, an00 an00Var) {
        return scheduled(str2, 0, new v9j() { // from class: l.y7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f196687a.m209428ba(str);
            }
        });
    }

    /* JADX INFO: renamed from: bd */
    public C22306c<Envelope> m209431bd(String str, int i, String str2, String str3) {
        String str4;
        final String str5;
        if ("from_nearby_falls_feed".equals(str2)) {
            str4 = "nearby";
        } else if ("from_discover_discussion".equals(str2)) {
            str4 = "discussion";
        } else {
            str4 = "from_discover_dating".equals(str2) ? "dating" : "recommend";
        }
        String strM165085k = omg.m165085k("/moments?search=immersion&pagesource=" + str4 + "&query=" + str3);
        if (TextUtils.isEmpty(str)) {
            str5 = strM165085k + "&limit=" + i;
        } else {
            str5 = strM165085k + "&" + str;
        }
        return scheduled("/moments?search=immersion", 0, new v9j() { // from class: l.m9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f132686a.m209443db(str5);
            }
        });
    }

    /* JADX INFO: renamed from: c7 */
    public C22306c<j760<Links, List<User>>> m209432c7() {
        return m209256Cd(omg.m165091n(""), "fans/list/previous");
    }

    /* JADX INFO: renamed from: c8 */
    public C22392a<j760<Links, List<TopicMoment>>> m209433c8() {
        return this.f193038d1;
    }

    /* JADX INFO: renamed from: c9 */
    public final /* synthetic */ Envelope m209434c9(Envelope envelope) {
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ca */
    public final /* synthetic */ roj0 m209435ca(Envelope envelope) {
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        C22393b<roj0> c22393b = this.f192980C1;
        roj0 roj0Var = roj0.f160388a;
        c22393b.m132487l(roj0Var);
        this.f192982D1.put(Long.valueOf(mqi0.m155944o()));
        return roj0Var;
    }

    /* JADX INFO: renamed from: cb */
    public final /* synthetic */ Envelope m209436cb(Envelope envelope) {
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: cc */
    public C22306c<roj0> m209437cc(String str, boolean z) {
        this.f193010P0.m132487l(vwb.m200311Y(str, Boolean.valueOf(z)));
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: cd */
    public C22306c<j760<Links, List<TopicMoment>>> m209438cd(final String str) {
        return scheduled("searchTopics_" + str, 0, new v9j() { // from class: l.baa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f74662a.m209457fb(str);
            }
        });
    }

    @Override // com.tantanapp.common.network.RunnerProxy
    public void clearRequestsAndStop() {
        super.clearRequestsAndStop();
        Iterator<ei00> it = this.f192997J1.values().iterator();
        while (it.hasNext()) {
            it.next().m116617a();
        }
    }

    /* JADX INFO: renamed from: d7 */
    public C22306c<List<PostBasePopWindow>> m209439d7(final String str, final String str2) {
        return scheduled("feedPostPopWindow_" + str + str2, 0, new v9j() { // from class: l.x8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f191450a.m209371T8(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: d8 */
    public C22392a<j760<Links, List<TopicMoment>>> m209440d8() {
        return this.f193040e1;
    }

    /* JADX INFO: renamed from: d9 */
    public final /* synthetic */ C22306c m209441d9() {
        return new la20(new v9j() { // from class: l.jha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165085k("/meets")).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.kha
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123125a.m209434c9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: da */
    public final /* synthetic */ C22306c m209442da(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.zea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165102t("/award")).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).map(new w9j() { // from class: l.afa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f69161a.m209435ca((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: db */
    public final /* synthetic */ C22306c m209443db(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.cba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.dba
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f85303a.m209436cb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: dc */
    public C22306c<List<Moment>> m209444dc() {
        return this.f193071u0;
    }

    /* JADX INFO: renamed from: dd */
    public void m209445dd(double d) {
        if (this.f193032a1.get().doubleValue() < d) {
            this.f193032a1.put(Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: e7 */
    public C22306c<List<FeedUserLiveLabel>> m209446e7(String str, HashSet<String> hashSet) {
        if (hashSet.size() == 0) {
            return C22306c.just(new ArrayList());
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
        return scheduled("live-labels".concat(sb.toString()), -1, new v9j() { // from class: l.gia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.aaa
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165085k("/live-labels")).m185893l(utc0.create(Network.JSON, jsonObject.toString())).m185883b();
                    }
                });
            }
        }).map(new w9j() { // from class: l.hia
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m209200u6((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e8 */
    public User m209447e8(String str) {
        User userM136573m = this.f192975A0.get(str);
        if (userM136573m == null) {
            if (u2h.m191495d() || u2h.m191494c()) {
                userM136573m = ijb0.m136573m(str);
            }
            if (userM136573m == null) {
                userM136573m = FeedModule.f38859h.m180650z0(str);
            }
            if (userM136573m == null) {
                userM136573m = ijb0.m136560X(str);
            }
        }
        this.f192975A0.put(str, userM136573m);
        return userM136573m;
    }

    /* JADX INFO: renamed from: e9 */
    public final /* synthetic */ Envelope m209448e9(String str, Envelope envelope) {
        m209550sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        if (list.size() > 0 && FeedModule.m60222H().me_().f56011id.equals(list.get(0).owner.f38803id)) {
            m209500lc(list.get(0));
            return envelope;
        }
        if (TextUtils.isEmpty(str)) {
            m209500lc(null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: ea */
    public final /* synthetic */ xaj0 m209449ea(String str, Envelope envelope) {
        m209557td(envelope, false);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(((FeedData) envelope.getModuleData(FeedData.class)).topicOperations);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        if (nkg.m159848E()) {
            List<BubbleInfo> list = ((FeedData) envelope.getModuleData(FeedData.class)).states;
            if (NullChecker.m81303a(list) && list.size() != 0) {
                this.f193077x0.m132487l(list);
            }
        }
        if ("follow".equals(str) || "like".equals(str) || "dating".equals(str)) {
            this.f193042f1.m132487l((TopicOperations) vwb.m200346r(arrayList2, new w9j() { // from class: l.b8a
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, OperationType.draft));
                }
            }));
        }
        return new xaj0(arrayList2, arrayList, arrayList3);
    }

    /* JADX INFO: renamed from: eb */
    public final /* synthetic */ j760 m209450eb(Envelope envelope) {
        m209550sd(envelope);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
    }

    /* JADX INFO: renamed from: ec */
    public C22306c<j760<Links, List<Moment>>> m209451ec(Links links) {
        return m209458fc(links, null);
    }

    /* JADX INFO: renamed from: ed */
    public C22306c<Envelope> m209452ed() {
        final String strM165085k = omg.m165085k("/activity-entrance/nearby?interUser=false");
        return scheduled("showChristmasEntrance", 0, new v9j() { // from class: l.dia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f86368a.m209471hb(strM165085k);
            }
        }, true);
    }

    /* JADX INFO: renamed from: f7 */
    public C22306c<Followship> m209453f7(String str, User user, boolean z) {
        return m209460g7(str, user, z, null, null);
    }

    /* JADX INFO: renamed from: f8 */
    public C22306c<User> m209454f8(final String str) {
        return now(new la20(new v9j() { // from class: l.zha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165086k0(str)).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.bia
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75713a.m209598z9(str, (Envelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f9 */
    public final /* synthetic */ C22306c m209455f9(final String str, final String str2) {
        return ia20.m135117a(new v9j() { // from class: l.nia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.oia
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144098a.m209448e9(str2, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fa */
    public final /* synthetic */ C22306c m209456fa(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.y6a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165053O(str, str2)).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.z6a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f201899a.m209449ea(str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fb */
    public final /* synthetic */ C22306c m209457fb(final String str) {
        return new la20(new v9j() { // from class: l.oba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165085k("/search/topics?limit=20&query=" + str)).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.pba
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148071a.m209450eb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: fc */
    public C22306c<j760<Links, List<Moment>>> m209458fc(Links links, an00 an00Var) {
        return m209409Yb(omg.m165072d0(links.next), "nearby/next", an00Var);
    }

    /* JADX INFO: renamed from: fd */
    public C22306c<j760<Links, List<Moment>>> m209459fd(String str, Links links, an00 an00Var, String str2) {
        return m209409Yb(omg.m165078g0(str, links.next, str2), "/moments/topicAggregation/next/" + str + str2, an00Var);
    }

    /* JADX INFO: renamed from: g7 */
    public C22306c<Followship> m209460g7(String str, User user, boolean z, String str2, String str3) {
        return m209467h7(str, user, z, str2, str3, null);
    }

    /* JADX INFO: renamed from: g8 */
    public C22306c<BubbleInfo> m209461g8(final String str) {
        final String strM165085k = omg.m165085k("/users/" + str + "/states");
        return scheduled("getUserState", 0, new v9j() { // from class: l.dda
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f85583a.m209244B9(strM165085k, str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: g9 */
    public final /* synthetic */ Envelope m209462g9(Envelope envelope) {
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ga */
    public final /* synthetic */ Envelope m209463ga(List list, Envelope envelope) {
        this.f192981D0.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            if (this.f192985F0.contains(list.get(i))) {
                this.f192985F0.remove(list.get(i));
            }
        }
        return envelope;
    }

    /* JADX INFO: renamed from: gb */
    public final /* synthetic */ Envelope m209464gb(Envelope envelope) {
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: gc */
    public C22306c<j760<Links, List<Moment>>> m209465gc() {
        return m209472hc(null);
    }

    /* JADX INFO: renamed from: gd */
    public C22306c<xaj0<Links, List<Moment>, List<TopicMoment>>> m209466gd(String str, an00 an00Var, String str2) {
        return m209508md(omg.m165078g0(str, "limit=20", str2), "/moments/topicAggregation/prev/" + str + str2, an00Var);
    }

    /* JADX INFO: renamed from: h7 */
    public C22306c<Followship> m209467h7(final String str, final User user, final boolean z, final String str2, final String str3, @Nullable final String str4) {
        MatchScData matchScDataBuild;
        if (z) {
            o660 o660VarM167645d = p660.m167645d();
            matchScDataBuild = new MatchScData.MatchBuilder().isLike(true).matchSource("follow").isSuperLiked(false).isFromButton(true).isFromFollow(true).user(user).pageId(o660VarM167645d != null ? o660VarM167645d.m162820c() : "").build();
        } else {
            matchScDataBuild = null;
        }
        final MatchScData matchScData = matchScDataBuild;
        final Followship followship = new Followship();
        followship.state = FollowshipStatus.get(z ? FollowshipStatus.following : FollowshipStatus.unfollow);
        followship.userTime = qib0.f154693H.guessedCurrentServerTime();
        followship.toJson();
        return scheduled(FollowshipStatus.following + user.f56011id, -1, new v9j() { // from class: l.tga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f170070a.m209385V8(str2, str, user, str3, str4, followship, z, matchScData);
            }
        });
    }

    /* JADX INFO: renamed from: h8 */
    public C22306c<j760<Links, List<ViewersBox>>> m209468h8(final String str, final String str2, final String str3) {
        return scheduled("getUserViewsHistoryList", 0, new v9j() { // from class: l.cea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f80445a.m209260D9(str3, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: h9 */
    public final /* synthetic */ C22306c m209469h9(final String str) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.xga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }, 0).compose(omg.m165092n0()).map(new w9j() { // from class: l.yga
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198147a.m209462g9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ha */
    public final /* synthetic */ C22306c m209470ha(final String str, final List list) {
        return ia20.m135117a(new v9j() { // from class: l.zfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165085k("/moment-viewers")).m185893l(utc0.create(Network.JSON, str)).m185883b();
            }
        }).map(new w9j() { // from class: l.aga
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f69343a.m209463ga(list, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: hb */
    public final /* synthetic */ C22306c m209471hb(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.i9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.j9a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f116874a.m209464gb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: hc */
    public C22306c<j760<Links, List<Moment>>> m209472hc(an00 an00Var) {
        return m209423ac(omg.m165072d0("limit=20"), "nearby/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: hd */
    public C22306c<roj0> m209473hd(final String str) {
        return scheduled("topicCategories" + str, 0, new v9j() { // from class: l.eda
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f90595a.m209485jb(str);
            }
        });
    }

    /* JADX INFO: renamed from: i7 */
    public C22306c<j760<Links, List<Moment>>> m209474i7(Links links, an00 an00Var) {
        return m209409Yb(omg.m165062X(links.next), "following/moments/next", an00Var);
    }

    /* JADX INFO: renamed from: i8 */
    public C22306c<roj0> m209475i8(final boolean z) {
        return scheduled("get_follow_configs", 0, new v9j() { // from class: l.iga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f113088a.m209274F9(z);
            }
        });
    }

    /* JADX INFO: renamed from: i9 */
    public final /* synthetic */ xaj0 m209476i9(Envelope envelope) {
        m209550sd(envelope);
        return new xaj0(((FeedData) envelope.data.getModuleData(FeedData.class)).groups, ((CommonData) envelope.data.getModuleData(CommonData.class)).users, envelope.pagination.links);
    }

    /* JADX INFO: renamed from: ia */
    public final /* synthetic */ xaj0 m209477ia(Envelope envelope) {
        m209550sd(envelope);
        return new xaj0(envelope.pagination.links, ((CommonData) envelope.getModuleData(CommonData.class)).users, Integer.valueOf(envelope.pagination.total));
    }

    /* JADX INFO: renamed from: ib */
    public final /* synthetic */ roj0 m209478ib(Envelope envelope) {
        m209550sd(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(((FeedData) envelope.getModuleData(FeedData.class)).topicCategories);
        this.f193044g1.m132487l(new j760<>(arrayList2, arrayList));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: ic */
    public C22306c<j760<Links, List<Moment>>> m209479ic(Links links, an00 an00Var) {
        return m209409Yb(omg.m165070c0(links.next), "nearbyOnline/next", an00Var);
    }

    /* JADX INFO: renamed from: id */
    public C22306c<roj0> m209480id(final MomentMessage momentMessage, final String str, final String str2) {
        return TEnum.equals(momentMessage.status(), "failed") ? C22306c.just(roj0.f160388a) : scheduled("topicCommentDelete", -1, new v9j() { // from class: l.b7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xia.m209229z2(str, str2, momentMessage);
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public C22306c<j760<Links, List<Moment>>> m209481j7(an00 an00Var) {
        return m209423ac(omg.m165062X("limit=20"), "following/previous", true, FeedModule.m60221F().userId(), an00Var);
    }

    /* JADX INFO: renamed from: j8 */
    public C22306c<j760<Links, List<Moment>>> m209482j8(an00 an00Var, String str, String str2, Links links) {
        return m209430bc(omg.m165085k("/moments?search=group&sort=" + str + "&query=" + str2 + "&" + links.next), "group/previous" + str2, false, null, an00Var);
    }

    /* JADX INFO: renamed from: j9 */
    public final /* synthetic */ roj0 m209483j9(Envelope envelope) {
        GuideStatePostConfig guideStatePostConfig = ((FeedData) envelope.getModuleData(FeedData.class)).guideStatePostConfig;
        this.f193006N0 = guideStatePostConfig;
        this.f193008O0.m132487l(guideStatePostConfig);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: ja */
    public final /* synthetic */ C22306c m209484ja(final String str) {
        return new la20(new v9j() { // from class: l.nha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.oha
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f143960a.m209477ia((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jb */
    public final /* synthetic */ C22306c m209485jb(final String str) {
        return new la20(new v9j() { // from class: l.mea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165048J(str)).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.nea
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138597a.m209478ib((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: jc */
    public C22306c<j760<Links, List<Moment>>> m209486jc(an00 an00Var) {
        return m209423ac(omg.m165070c0("limit=20"), "nearbyOnline/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: jd */
    public C22306c<MomentMessage> m209487jd(final MomentMessage momentMessage, final String str, final String str2) {
        v9j v9jVar = new v9j() { // from class: l.e8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.fromCallable(new Callable() { // from class: l.raa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return xia.m209141l3(momentMessage, str);
                    }
                });
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.f8a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f96326a.m209506mb(str, str2, (MomentMessage) obj);
            }
        };
        return now(((C22306c) v9jVar.call()).flatMap(new w9j() { // from class: l.g8a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m209055X0(w9jVar, (MomentMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k7 */
    public C22306c<j760<Links, List<Moment>>> m209488k7(an00 an00Var) {
        return m209423ac(omg.m165062X("limit=20&pagesource=dating"), "following/previous", true, FeedModule.m60221F().userId(), an00Var);
    }

    /* JADX INFO: renamed from: k8 */
    public C22306c<j760<Links, List<Moment>>> m209489k8(an00 an00Var, String str, String str2) {
        return m209430bc(omg.m165085k("/moments?search=group&sort=" + str + "&query=" + str2), "/moments?search=group&sort=" + str + "&query=" + str2, false, null, an00Var);
    }

    /* JADX INFO: renamed from: k9 */
    public final /* synthetic */ C22306c m209490k9() {
        return new la20(new v9j() { // from class: l.uaa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165102t("/guideState")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.vaa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180724a.m209483j9((Envelope) obj);
            }
        }).compose(omg.m165092n0());
    }

    /* JADX INFO: renamed from: ka */
    public final /* synthetic */ xaj0 m209491ka(Envelope envelope) {
        m209550sd(envelope);
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
            x8h x8hVar = new x8h();
            x8hVar.m207400f(user);
            x8hVar.m207399e((List) map.get(user.f56011id));
            arrayList2.add(x8hVar);
        }
        Pagination pagination = envelope.pagination;
        return new xaj0(pagination.links, arrayList2, Integer.valueOf(pagination.total));
    }

    /* JADX INFO: renamed from: kb */
    public final /* synthetic */ MomentMessage m209492kb(Envelope envelope) {
        m209550sd(envelope);
        return ((FeedData) envelope.getModuleData(FeedData.class)).comments.get(0);
    }

    /* JADX INFO: renamed from: kc */
    public C22306c<roj0> m209493kc(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", OperationType.newUserAIMoment);
            jSONObject.put("momentId", str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        final String string = jSONObject.toString();
        return scheduled("newUserAIMomentAward", -1, new v9j() { // from class: l.eea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f90694a.m209442da(string);
            }
        }, false);
    }

    /* JADX INFO: renamed from: kd */
    public C22306c<roj0> m209494kd(final String str, String str2) {
        return m209388Vb("moment/topics/next/" + str, str, str2).map(new w9j() { // from class: l.g9a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f101554a.m209513nb(str, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l7 */
    public C22306c<Followship> m209495l7(final String str, final User user) {
        final Followship followship = new Followship();
        followship.state = FollowshipStatus.get(FollowshipStatus.following);
        followship.userTime = qib0.f154693H.guessedCurrentServerTime();
        return scheduled("followingToChat", -1, new v9j() { // from class: l.hfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f107460a.m209399X8(str, user, followship);
            }
        });
    }

    /* JADX INFO: renamed from: l8 */
    public final boolean m209496l8() {
        return kjb0.m146208s();
    }

    /* JADX INFO: renamed from: l9 */
    public final /* synthetic */ j760 m209497l9(Envelope envelope) {
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return new j760(vwb.m200296J(feedData.literatures) ? null : feedData.literatures.get(0), vwb.m200296J(feedData.literaturesComments) ? null : feedData.literaturesComments.get(0));
    }

    /* JADX INFO: renamed from: la */
    public final /* synthetic */ C22306c m209498la(final String str) {
        return new la20(new v9j() { // from class: l.h8a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.i8a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f111997a.m209491ka((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lb */
    public final /* synthetic */ C22306c m209499lb(MomentMessage momentMessage, final String str, final String str2) {
        final MomentMessage momentMessageMo223809clone = momentMessage.mo223809clone();
        return new la20(new v9j() { // from class: l.pda
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165082i0(str, str2, null)).m185893l(utc0.create(Network.JSON, momentMessageMo223809clone.toJson())).m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.qda
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f153900a.m209492kb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lc */
    public void m209500lc(BubbleInfo bubbleInfo) {
        Map<String, BubbleInfo> mapM221515e = this.f193048i1.m221515e();
        mapM221515e.put(FeedModule.m60222H().me_().f56011id, bubbleInfo);
        this.f193048i1.m132487l(mapM221515e);
    }

    /* JADX INFO: renamed from: ld */
    public C22306c<roj0> m209501ld(final String str) {
        return m209388Vb("moment/topics/prev/" + str, str, "limit=20").map(new w9j() { // from class: l.gfa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f102351a.m209520ob(str, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public C22306c<Followship> m209502m7(String str, User user, boolean z, String str2) {
        return m209509n7(str, user, z, null, null, str2);
    }

    /* JADX INFO: renamed from: m8 */
    public final void m209503m8(Envelope envelope, String str, String str2) {
        if (((CommonData) envelope.getModuleData(CommonData.class)).users == null || ((CommonData) envelope.getModuleData(CommonData.class)).users.size() == 0) {
            MomentUserNullException.reportNulAlllUserMoment(str, str2);
            return;
        }
        if (!NullChecker.m81303a(((FeedData) envelope.getModuleData(FeedData.class)).moments) || ((FeedData) envelope.getModuleData(FeedData.class)).moments.size() <= 0) {
            return;
        }
        for (int i = 0; i < ((FeedData) envelope.getModuleData(FeedData.class)).moments.size(); i++) {
            Moment moment = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(i);
            if (m209447e8(moment.owner) == null) {
                String str3 = moment.f56011id;
                if ("1".equals(str3.substring(str3.length() - 1))) {
                    MomentUserNullException.reportNullUserMoment(moment.f56011id, str, str2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final /* synthetic */ C22306c m209504m9(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.jea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165085k(str)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.lea
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127659a.m209497l9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ma */
    public final /* synthetic */ Envelope m209505ma(Envelope envelope) {
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: mb */
    public final /* synthetic */ C22306c m209506mb(final String str, final String str2, final MomentMessage momentMessage) {
        return scheduled("postTheTopicComment", -1, new v9j() { // from class: l.oca
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f143024a.m209499lb(momentMessage, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: mc */
    public C22306c<xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>>> m209507mc(String str) {
        return m209514nc(str, "");
    }

    /* JADX INFO: renamed from: md */
    public C22306c<xaj0<Links, List<Moment>, List<TopicMoment>>> m209508md(final String str, String str2, final an00 an00Var) {
        return scheduled(str2, 0, new v9j() { // from class: l.c9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f79873a.m209534qb(str, an00Var);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public C22306c<Followship> m209509n7(String str, User user, boolean z, String str2, String str3, @Nullable String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("page_id", str4);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        return m209467h7(str, user, z, str2, str3, "pagesource=" + jSONObject.toString());
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ List m209510n8(Envelope envelope) {
        ijb0.m136554R(envelope.counters);
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        List<Group> list = ((FeedData) envelope.getModuleData(FeedData.class)).groups;
        ArrayList arrayList = new ArrayList();
        for (Group group : list) {
            if (TEnum.equals(group.groupType, "group")) {
                arrayList.add(group);
            }
            if (nkg.m159858O() && TEnum.equals(group.groupType, GroupType.anonymous_group)) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n9 */
    public final /* synthetic */ Envelope m209511n9(Envelope envelope) {
        m209550sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        Map<String, BubbleInfo> mapM221515e = this.f193048i1.m221515e();
        if (list.size() <= 0) {
            this.f193048i1.m132487l(mapM221515e);
            return envelope;
        }
        mapM221515e.put(FeedModule.m60222H().me_().f56011id, list.get(0));
        this.f193048i1.m132487l(mapM221515e);
        return envelope;
    }

    /* JADX INFO: renamed from: na */
    public final /* synthetic */ C22306c m209512na(final String str) {
        return new la20(new v9j() { // from class: l.o9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.p9a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f147687a.m209505ma((Envelope) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: nb */
    public final /* synthetic */ roj0 m209513nb(String str, j760 j760Var) {
        j760<Links, List<TopicMoment>> j760VarM221515e = str.equals("suggest") ? this.f193040e1.m221515e() : this.f193034b1.m221515e();
        final List<TopicMoment> arrayList = j760VarM221515e == null ? new ArrayList<>() : j760VarM221515e.f116565b;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.addAll(vwb.m200339n((Collection) j760Var.f116565b, new w9j() { // from class: l.qca
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayList.contains((TopicMoment) obj));
            }
        }));
        if (str.equals("suggest")) {
            this.f193040e1.m132487l(new j760<>((Links) j760Var.f116564a, arrayList));
        } else {
            this.f193034b1.m132487l(new j760<>((Links) j760Var.f116564a, arrayList));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: nc */
    public C22306c<xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>>> m209514nc(final String str, final String str2) {
        return scheduled("operationGuides/search" + str, 0, new v9j() { // from class: l.vga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f181357a.m209456fa(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: nd */
    public C22306c<j760<Links, List<MomentMessage>>> m209515nd(final String str, final String str2, final Links links) {
        return scheduled("topic_vote_comment_next", 0, new v9j() { // from class: l.wga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f186173a.m209548sb(str, str2, links);
            }
        });
    }

    /* JADX INFO: renamed from: o7 */
    public C22306c<j760<Links, List<Moment>>> m209516o7(Links links, an00 an00Var) {
        String string;
        String str;
        if (TextUtils.isEmpty(FriendsFeedViewPagerFrag.f41493F0) || !nkg.m159846D()) {
            string = null;
        } else {
            string = FriendsFeedViewPagerFrag.f41493F0;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gender", FriendsFeedViewPagerFrag.f41493F0);
                string = jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(omg.m165066a0(links.next));
        if (TextUtils.isEmpty(string)) {
            str = "";
        } else {
            str = "&settings=" + string;
        }
        sb.append(str);
        return m209409Yb(sb.toString(), "friends/next", an00Var);
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ C22306c m209517o8(final String str) {
        return new la20(new v9j() { // from class: l.kia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.mia
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133953a.m209510n8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o9 */
    public final /* synthetic */ C22306c m209518o9(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.y9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.z9a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202279a.m209511n9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: oa */
    public final /* synthetic */ void m209519oa(Moment moment) {
        m209268Ea(moment);
        this.f193057n0.m132487l(moment);
    }

    /* JADX INFO: renamed from: ob */
    public final /* synthetic */ roj0 m209520ob(String str, j760 j760Var) {
        if (NullChecker.m81304b(j760Var.f116565b)) {
            if (str.equals("nearby") || str.equals("recommend")) {
                this.f193038d1.m132487l(j760Var);
            } else if (str.equals("suggest")) {
                this.f193040e1.m132487l(j760Var);
            } else {
                this.f193034b1.m132487l(j760Var);
                m209319Lc((List) j760Var.f116565b);
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: oc */
    public C22306c<Envelope> m209521oc() {
        return scheduled("feed-counters", -1, new v9j() { // from class: l.hca
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.vha
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165102t("/feed-counters")).m185892k(utc0.create(Network.JSON, "{\"unreadLikeFeeds\": 0}")).m185883b();
                    }
                }).map(new w9j() { // from class: l.wha
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return xia.m209103f1((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: od */
    public C22306c<xaj0<Links, List<TopicMoment>, List<MomentMessage>>> m209522od(final String str, final String str2) {
        return scheduled("topic_vote_comment_pre", 0, new v9j() { // from class: l.zda
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f202656a.m209562ub(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public C22306c<j760<Links, List<Moment>>> m209523p7(an00 an00Var) {
        String string;
        String str;
        if (TextUtils.isEmpty(FriendsFeedViewPagerFrag.f41493F0) || !nkg.m159846D()) {
            string = null;
        } else {
            string = FriendsFeedViewPagerFrag.f41493F0;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gender", string);
                string = jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        String str2 = "";
        if (FeedModule.m60222H().mo30708Md()) {
            String strMo30813qp = FeedModule.m60222H().mo30813qp();
            if (TextUtils.isEmpty(strMo30813qp)) {
                str = "";
            } else {
                str = "&query=" + strMo30813qp;
            }
            FeedModule.m60222H().mo30674B6();
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(omg.m165066a0("limit=20"));
        if (!TextUtils.isEmpty(string)) {
            str2 = "&settings=" + string;
        }
        sb.append(str2);
        sb.append(str);
        return m209423ac(sb.toString(), "friends/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ roj0 m209524p8(MomentMessage momentMessage, Envelope envelope) {
        Moment moment = this.f193047i0.get(momentMessage.moment);
        PartialIdList partialIdList = moment.messages;
        partialIdList.count--;
        partialIdList.ids.remove(momentMessage.f56008id);
        this.f193047i0.put(momentMessage.moment, moment);
        f192972L1 = vwb.m200311Y(momentMessage.moment, 2);
        this.f193053l0.m132487l(this.f193047i0);
        this.f192999K0.m132487l(momentMessage);
        ijb0.m136555S(envelope);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: p9 */
    public final /* synthetic */ roj0 m209525p9(Envelope envelope) {
        ijb0.m136554R(envelope.counters);
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: pa */
    public final /* synthetic */ void m209526pa(Moment moment) {
        m209268Ea(moment);
        this.f193053l0.m132487l(this.f193047i0);
    }

    /* JADX INFO: renamed from: pb */
    public final /* synthetic */ xaj0 m209527pb(an00 an00Var, Envelope envelope) {
        if (NullChecker.m81303a(an00Var)) {
            an00Var.mo65704c(envelope);
        }
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        List<BubbleInfo> list2 = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (nkg.m159889k0() && NullChecker.m81303a(list) && !vwb.m200296J(list2)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).states.addAll(list2);
            }
        }
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m209348Q6(envelope, false));
        return new xaj0(envelope.pagination.links, arrayList, ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
    }

    /* JADX INFO: renamed from: pc */
    public C22306c<Envelope> m209528pc(String str) {
        return m209535qc(vwb.m200324f0(str));
    }

    /* JADX INFO: renamed from: pd */
    public C22306c<roj0> m209529pd() {
        return scheduled("un/read/fans/patch", -1, new v9j() { // from class: l.pha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.pga
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165081i() + "&method=patch").m185893l(utc0.create(Network.JSON, "{\"read\": true}")).m185883b();
                    }
                }).compose(omg.m165092n0()).map(new w9j() { // from class: l.qga
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return xia.m209220x5((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public C22306c<List<Group>> m209530q7(String str, int i) {
        return m209241B6(omg.m165059U(str, i), "get/all/group" + str + i);
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ C22306c m209531q8(final MomentMessage momentMessage) {
        final MomentMessage momentMessage2 = new MomentMessage();
        momentMessage2.recalled = Boolean.TRUE;
        return new la20((v9j<stc0>) new v9j() { // from class: l.bfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                MomentMessage momentMessage3 = momentMessage;
                return omg.f144622G.auth().m185898q(omg.m165103u(momentMessage3.cid, momentMessage3.f56008id) + "&method=patch").m185893l(utc0.create(Network.JSON, momentMessage2.toJson())).m185883b();
            }
        }, 0).compose(omg.m165092n0()).map(new w9j() { // from class: l.cfa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80546a.m209524p8(momentMessage, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q9 */
    public final /* synthetic */ C22306c m209532q9(final String str) {
        return new la20(new v9j() { // from class: l.lca
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.mca
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133088a.m209525p9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: qa */
    public final /* synthetic */ Moment m209533qa(final Moment moment, boolean z) throws Exception {
        Picture picture;
        if (!TextUtils.isEmpty(moment.f56011id)) {
            final Moment momentMo223809clone = moment.mo223809clone();
            momentMo223809clone.localCreatedSession = App.f15373i.get().intValue();
            f8c.m119878o().m119881B(new d30() { // from class: l.kba
                @Override // p149l.d30
                public final void call() {
                    FeedModule.f38860i.f77913c.updateBy_id(momentMo223809clone);
                }
            });
            e51.m114748M(new Runnable() { // from class: l.mba
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132999a.m209526pa(momentMo223809clone);
                }
            });
            return momentMo223809clone;
        }
        moment.createdTime = omg.m165099r0();
        moment.owner = FeedModule.m60221F().userId();
        if (moment.value == null) {
            moment.value = "";
        }
        moment.likes = PartialIdList.new_();
        moment.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
        if (TEnum.equals(moment.userSetVisibility, "unknown_")) {
            moment.userSetVisibility = UserSetVisibility.get(el00.m117022k().m117031p(moment));
        }
        if (NullChecker.m81304b(moment.media)) {
            for (Media media : moment.media) {
                TrackMediaUploadUtil.m80296a0(media);
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Picture) {
                        Picture picture2 = (Picture) media;
                        if (picture2.size == null || media.mediaType == null) {
                            pgm pgmVar = new pgm(rhi.m179382z(media.url));
                            picture2.size = new Dimension(pgmVar.f148730d);
                            media.mediaType = pgmVar.f148729c;
                        }
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        r5l0 r5l0Var = new r5l0(rhi.m179382z(video.url));
                        if (!r5l0Var.f157836g && video.isFromNewCamera) {
                            video.hasOriginalSound = false;
                        }
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            s5l0 s5l0Var = new s5l0(r5l0Var, false, false);
                            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                            video.size = new Dimension(s5l0Var.m182364m());
                            video.duration = s5l0Var.f162561b;
                            Picture picture3 = video.cover;
                            if (picture3 == null || picture3.url == null) {
                                video.processStartTime = SystemClock.uptimeMillis();
                                video.cover = new Picture();
                                try {
                                    boolean zM81303a = NullChecker.m81303a(video.cutting);
                                    Picture picture4 = video.cover;
                                    if (zM81303a) {
                                        picture4.url = rhi.m179355B(s5l0Var.m182357e((int) video.cutting.start));
                                    } else {
                                        picture4.url = rhi.m179355B(s5l0Var.m182356c(0));
                                    }
                                    video.cover.size = new Dimension(s5l0Var.m182362k());
                                    video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                    qib0.f154691G.m102377x0(video.url);
                                } catch (Exception e) {
                                    CrashHelper.m81296c(e);
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
        m209602zd(z, 1, moment);
        f8c.m119878o().m119881B(new d30() { // from class: l.iba
            @Override // p149l.d30
            public final void call() {
                xia.m208937D3(moment);
            }
        });
        e51.m114748M(new Runnable() { // from class: l.jba
            @Override // java.lang.Runnable
            public final void run() {
                this.f117168a.m209519oa(moment);
            }
        });
        return moment;
    }

    /* JADX INFO: renamed from: qb */
    public final /* synthetic */ C22306c m209534qb(final String str, final an00 an00Var) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.gda
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }, omg.f144619D | omg.f144620E).compose(omg.m165092n0()).map(new w9j() { // from class: l.hda
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107223a.m209527pb(an00Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: qc */
    public final C22306c<Envelope> m209535qc(final List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(list.get(i));
            }
            jSONObject.put("momentIds", jSONArray);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        final String string = jSONObject.toString();
        return scheduled("view-record", -1, new v9j() { // from class: l.eha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f91312a.m209470ha(string, list);
            }
        }, false);
    }

    /* JADX INFO: renamed from: qd */
    public C22306c<roj0> m209536qd(String str, String str2, String str3, String str4) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sourceId", str);
            jSONObject.put("sourceOwnerId", str2);
            jSONObject.put("sourceType", str4);
            jSONObject.put(OMSTemplateModeType.page, str3);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        final String strM165085k = omg.m165085k("/moment-feedback");
        return FeedModule.f38855d.scheduled("uninterested/moment", -1, new v9j() { // from class: l.rea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f159038a.m209576wb(jSONObject, strM165085k);
            }
        });
    }

    /* JADX INFO: renamed from: r7 */
    public C22306c<j760<Links, List<User>>> m209537r7(String str, String str2, int i, String str3) {
        final String str4 = "/users/" + str + "/moments/" + str2 + "/likes?search=attitude&query=" + i + "&" + str3;
        return scheduled(str4, 0, new v9j() { // from class: l.tfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f169955a.m209413Z8(str4);
            }
        }, false);
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ xaj0 m209538r8(Envelope envelope) {
        m209557td(envelope, false);
        ijb0.m136555S(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        return new xaj0(envelope.pagination.links, feedData.messages, feedData.stickers);
    }

    /* JADX INFO: renamed from: r9 */
    public final /* synthetic */ Envelope m209539r9(Envelope envelope) {
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: ra */
    public final /* synthetic */ C22306c m209540ra(final Moment moment, final boolean z) {
        return C22306c.fromCallable(new Callable() { // from class: l.y8a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f196785a.m209533qa(moment, z);
            }
        });
    }

    /* JADX INFO: renamed from: rb */
    public final /* synthetic */ j760 m209541rb(Envelope envelope) {
        m209550sd(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(feedData.comments);
        return new j760(envelope.pagination.links, arrayList);
    }

    /* JADX INFO: renamed from: rc */
    public C22306c<j760<Links, List<Moment>>> m209542rc(String str, boolean z, String str2) {
        return m209416Zb(omg.m165056R(str, omg.f144648z, z, str2), m209363S7(str, str2), true, str);
    }

    /* JADX INFO: renamed from: rd */
    public void m209543rd(String str) {
        Moment moment = this.f193047i0.get(str);
        if (!NullChecker.m81303a(moment) || TEnum.equals(moment.userSetVisibility, "selfOnly")) {
            return;
        }
        moment.userSetVisibility = UserSetVisibility.get("selfOnly");
        this.f193047i0.put(moment.f56011id, moment);
        this.f193053l0.m132487l(this.f193047i0);
    }

    /* JADX INFO: renamed from: s7 */
    public C22306c<xaj0<Links, List<User>, AttitudeSourceCatCount>> m209544s7(String str, String str2, int i) {
        final String str3 = "/users/" + str + "/moments/" + str2 + "/likes?search=attitude&query=" + i + "&limit=50";
        return scheduled(str3, 0, new v9j() { // from class: l.wfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f186073a.m209427b9(str3);
            }
        }, false);
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ C22306c m209545s8(final String str, final String str2, final Links links) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.bca
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165040B(str, str2, links.next)).m185887f().m185883b();
            }
        }, omg.f144619D).compose(omg.m165092n0()).map(new w9j() { // from class: l.cca
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80221a.m209538r8((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s9 */
    public final /* synthetic */ C22306c m209546s9(final String str) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.u6a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }, omg.f144619D | omg.f144620E).compose(omg.m165092n0()).map(new w9j() { // from class: l.v6a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180173a.m209539r9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: sa */
    public final /* synthetic */ void m209547sa(Moment moment, List list) {
        Moment momentMo223809clone = moment.mo223809clone();
        momentMo223809clone.media = new ArrayList(list);
        m209268Ea(momentMo223809clone);
        this.f193053l0.m132487l(this.f193047i0);
    }

    /* JADX INFO: renamed from: sb */
    public final /* synthetic */ C22306c m209548sb(final String str, final String str2, final Links links) {
        return new la20(new v9j() { // from class: l.xha
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165084j0(str, str2, links.next)).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.yha
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198288a.m209541rb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: sc */
    public C22306c<j760<Links, List<Moment>>> m209549sc(String str, Links links, boolean z, an00 an00Var) {
        return m209409Yb(omg.m165054P(str, links.next, z), str + "/personal/feed/next", an00Var);
    }

    /* JADX INFO: renamed from: sd */
    public void m209550sd(Envelope envelope) {
        m209557td(envelope, true);
    }

    /* JADX INFO: renamed from: t7 */
    public C22392a<TopicOperations> m209551t7() {
        return this.f193042f1;
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ MomentMessage m209552t8(MomentMessage momentMessage, String str) throws Exception {
        momentMessage.owner = FeedModule.m60221F().userId();
        momentMessage.createdTime = omg.m165099r0() + 10000.0d;
        if (TextUtils.isEmpty(momentMessage.api_only_otherUser)) {
            momentMessage.cid = str;
        } else {
            momentMessage.cid = momentMessage.api_only_otherUser;
        }
        tpd0 tpd0Var = App.f15373i;
        momentMessage.f56008id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        if (momentMessage.value == null) {
            momentMessage.value = "";
        }
        momentMessage.localCreatedSession = tpd0Var.get().intValue();
        this.f192990H0.put(momentMessage.f56008id, momentMessage);
        Moment momentM180648x0 = this.f193047i0.get(momentMessage.moment);
        if (momentM180648x0 == null && FeedModule.f38859h.m180644t0(Moments.TYPE, momentMessage.moment)) {
            momentM180648x0 = FeedModule.f38859h.m180648x0(momentMessage.moment);
        }
        PartialIdList partialIdList = momentM180648x0.messages;
        partialIdList.count++;
        partialIdList.ids.add(momentMessage.f56008id);
        this.f193047i0.put(momentMessage.moment, momentM180648x0);
        f192972L1 = vwb.m200311Y(momentMessage.moment, 1);
        this.f193053l0.m132487l(this.f193047i0);
        this.f192996J0.m132487l(momentMessage);
        return momentMessage;
    }

    /* JADX INFO: renamed from: t9 */
    public final /* synthetic */ j760 m209553t9(Envelope envelope) {
        m209550sd(envelope);
        if (!NullChecker.m81303a(envelope.getModuleData(FeedData.class)) || vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).moments) || vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(((FeedData) envelope.getModuleData(FeedData.class)).moments);
        ArrayList arrayList2 = new ArrayList(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
        if (NullChecker.m81303a(envelope.getModuleData(CommonData.class)) && !vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            ArrayList arrayList3 = new ArrayList(((CommonData) envelope.getModuleData(CommonData.class)).users);
            if (!vwb.m200296J(arrayList3)) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    m209240Ad((User) it.next());
                }
            }
        }
        return new j760(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ta */
    public final /* synthetic */ Boolean m209554ta(String str, List list) {
        return Boolean.valueOf(m208940Db(str));
    }

    /* JADX INFO: renamed from: tb */
    public final /* synthetic */ xaj0 m209555tb(Envelope envelope) {
        m209550sd(envelope);
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(feedData.comments);
        return new xaj0(envelope.pagination.links, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: tc */
    public C22306c<j760<Links, List<Moment>>> m209556tc(String str, Links links, String str2) {
        return m209402Xb(omg.m165055Q(str, links.next, str2), str + "/personal/feed/next" + System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: td */
    public void m209557td(Envelope envelope, boolean z) {
        boolean z2;
        boolean z3;
        Map<String, List<PostBasePopWindow>> map;
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        List<RawFeed> list = feedData.feeds;
        if (!vwb.m200296J(list)) {
            for (RawFeed rawFeed : list) {
                if (NullChecker.m81303a(rawFeed.extra) && NullChecker.m81303a(rawFeed.extra.report)) {
                    this.f192986F1.put(rawFeed.f39243id, rawFeed.extra.report);
                }
            }
        }
        if (!NullChecker.m81304b(((FeedData) envelope.getModuleData(FeedData.class)).moments) || ((FeedData) envelope.getModuleData(FeedData.class)).moments.size() <= 0) {
            z2 = false;
        } else {
            z2 = false;
            for (int i = 0; i < ((FeedData) envelope.getModuleData(FeedData.class)).moments.size(); i++) {
                Moment moment = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(i);
                Moment moment2 = this.f193047i0.get(moment.f56011id);
                if (moment2 != null) {
                    if (moment.views <= 0 && NullChecker.m81303a(moment2)) {
                        moment.views = moment2.views;
                    }
                    if (moment.getRecommendTime() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && NullChecker.m81303a(moment2) && moment2.getRecommendTime() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        moment.setRecommendTime(moment2.getRecommendTime());
                    }
                    if (NullChecker.m81303a(moment2.thirdShareSource) && !TextUtils.isEmpty(moment2.thirdShareSource.sourceId)) {
                        moment.thirdShareSource = moment2.thirdShareSource;
                    }
                    MomentViewerBox momentViewerBoxMo223809clone = moment.momentViewer.mo223809clone();
                    moment.mergeData(moment2, moment2.momentValue);
                    moment.momentViewer = momentViewerBoxMo223809clone;
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
                this.f193047i0.put(moment.f56011id, moment);
                if (FeedModule.f38859h.m180644t0(Moments.TYPE, moment.f56011id)) {
                    FeedModule.f38859h.m180641A0(moment);
                }
            }
        }
        if (NullChecker.m81304b(feedData.messages) && feedData.messages.size() > 0) {
            for (int i2 = 0; i2 < feedData.messages.size(); i2++) {
                MomentMessage momentMessage = feedData.messages.get(i2);
                MomentMessage momentMessage2 = this.f192990H0.get(momentMessage.f56008id);
                if (momentMessage2 != null) {
                    momentMessage.mergeData(momentMessage2);
                }
                this.f192990H0.put(momentMessage.f56008id, momentMessage);
            }
        }
        if (NullChecker.m81304b(feedData.stickers) && feedData.stickers.size() > 0) {
            for (int i3 = 0; i3 < feedData.stickers.size(); i3++) {
                StickerInfo stickerInfo = feedData.stickers.get(i3);
                StickerInfo stickerInfo2 = this.f192993I0.get(stickerInfo.f56011id);
                if (stickerInfo2 != null) {
                    stickerInfo.mergeData(stickerInfo2);
                }
                this.f192993I0.put(stickerInfo.f56011id, stickerInfo);
            }
        }
        if (NullChecker.m81303a(feedData.groups) && feedData.groups.size() > 0) {
            for (int i4 = 0; i4 < feedData.groups.size(); i4++) {
                Group group = feedData.groups.get(i4);
                Group group2 = this.f193002L0.get(group.f56011id);
                if (group2 != null) {
                    group.mergeData(group2);
                }
                this.f193002L0.put(group.f56011id, group);
            }
        }
        if (!vwb.m200296J(feedData.notifyUsers)) {
            this.f193051k0.clear();
            for (int i5 = 0; i5 < feedData.notifyUsers.size(); i5++) {
                NotifyUsers notifyUsers = feedData.notifyUsers.get(i5);
                this.f193051k0.add(notifyUsers);
                NotifyUsers notifyUsers2 = this.f193049j0.get(notifyUsers.userId);
                if (notifyUsers2 != null) {
                    notifyUsers.mergeData(notifyUsers2);
                }
                this.f193049j0.put(notifyUsers.userId, notifyUsers);
            }
        }
        if (NullChecker.m81303a(feedData.states) && feedData.states.size() > 0) {
            for (int i6 = 0; i6 < feedData.states.size(); i6++) {
                BubbleInfo bubbleInfo = feedData.states.get(i6);
                BubbleInfo bubbleInfo2 = this.f193004M0.get(bubbleInfo.owner.f38803id);
                if (bubbleInfo2 != null) {
                    bubbleInfo.mergeData(bubbleInfo2);
                }
                this.f193004M0.put(bubbleInfo.owner.f38803id, bubbleInfo);
            }
        }
        if (!NullChecker.m81304b(((CommonData) envelope.getModuleData(CommonData.class)).users) || ((CommonData) envelope.getModuleData(CommonData.class)).users.size() <= 0) {
            z3 = false;
        } else {
            z3 = false;
            for (int i7 = 0; i7 < ((CommonData) envelope.getModuleData(CommonData.class)).users.size(); i7++) {
                User user = ((CommonData) envelope.getModuleData(CommonData.class)).users.get(i7);
                Map<String, User> map2 = this.f192975A0;
                if (z) {
                    User user2 = map2.get(user.f56011id);
                    if (user2 != null) {
                        if (user.localFollowship == null && NullChecker.m81303a(user2)) {
                            user.localFollowship = this.f192975A0.get(user.f56011id).localFollowship;
                        }
                        if (user.localRelationship == null && NullChecker.m81303a(this.f192975A0.get(user.f56011id))) {
                            user.localRelationship = this.f192975A0.get(user.f56011id).localRelationship;
                        }
                        if (NullChecker.m81303a(this.f192975A0.get(user.f56011id))) {
                            user.mergeData(this.f192975A0.get(user.f56011id));
                        }
                        if (!user.equals(this.f192975A0.get(user.f56011id))) {
                            z3 = true;
                        }
                    }
                    this.f192975A0.put(user.f56011id, user);
                } else if (!map2.containsKey(user.f56011id)) {
                    this.f192975A0.put(user.f56011id, user);
                }
            }
        }
        if (NullChecker.m81304b(((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos) && ((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos.size() > 0) {
            for (int i8 = 0; i8 < ((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos.size(); i8++) {
                MomentVoiceLiveInfos momentVoiceLiveInfos = ((FeedData) envelope.getModuleData(FeedData.class)).momentVoiceLiveInfos.get(i8);
                MomentVoiceLiveInfos momentVoiceLiveInfos2 = this.f193045h0.get(momentVoiceLiveInfos.roomID);
                if (momentVoiceLiveInfos2 != null) {
                    momentVoiceLiveInfos.mergeData(momentVoiceLiveInfos2);
                }
                this.f193045h0.put(momentVoiceLiveInfos.roomID, momentVoiceLiveInfos);
            }
        }
        if (!vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).momentPopWindows)) {
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
                    map = this.f193043g0;
                    if (i11 < size) {
                        arrayList2 = map.get(str2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        final PostBasePopWindow postBasePopWindow = list2.get(i11);
                        PostBasePopWindow postBasePopWindow2 = (PostBasePopWindow) vwb.m200346r(arrayList2, new w9j() { // from class: l.n9a
                            @Override // p149l.w9j
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
            this.f193053l0.m132487l(this.f193047i0);
        }
        if (z3) {
            this.f192979C0.m132487l(this.f192975A0);
        }
    }

    /* JADX INFO: renamed from: u7 */
    public Group m209558u7(String str) {
        return this.f193002L0.get(str);
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ C22306c m209559u8(final MomentMessage momentMessage, final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.qea
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f154001a.m209552t8(momentMessage, str);
            }
        });
    }

    /* JADX INFO: renamed from: u9 */
    public final /* synthetic */ C22306c m209560u9(final String str) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.eba
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }, omg.f144619D | omg.f144620E).compose(omg.m165092n0()).map(new w9j() { // from class: l.fba
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f96702a.m209553t9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ua */
    public final /* synthetic */ Moment m209561ua(Moment moment, boolean z, Moment moment2, List list) {
        if (moment.media.size() > 0 && (moment.media.get(0) instanceof Video)) {
            Video video = (Video) moment.media.get(0);
            if (video.isFromNewCamera) {
                if (NullChecker.m81303a(video.audio)) {
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
        m209602zd(z, 3, moment2);
        Moment momentMo223809clone = moment.mo223809clone();
        momentMo223809clone.media = new ArrayList(list);
        m209268Ea(momentMo223809clone);
        this.f193053l0.m132487l(this.f193047i0);
        return momentMo223809clone;
    }

    /* JADX INFO: renamed from: ub */
    public final /* synthetic */ C22306c m209562ub(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.zga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165084j0(str, str2, null)).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.aha
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f69576a.m209555tb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: uc */
    public C22306c<j760<Links, List<Moment>>> m209563uc(String str, boolean z, an00 an00Var, String str2) {
        return m209423ac(omg.m165057S(str, omg.f144648z, z, str2), m209370T7(str), true, str, an00Var);
    }

    /* JADX INFO: renamed from: ud */
    public void m209564ud(long j) {
        this.f193030Z0.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: v7 */
    public C22306c<Envelope> m209565v7() {
        return scheduled("meets", 0, new v9j() { // from class: l.nga
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f138850a.m209441d9();
            }
        }, true);
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m209566v8(MomentMessage momentMessage, String str, String str2, Throwable th) {
        kyg.m147872g(false, th);
        MomentMessage momentMessage2 = this.f192990H0.get(momentMessage.f56008id);
        momentMessage2.localCreatedSession = -App.f15373i.get().intValue();
        this.f192990H0.put(momentMessage.f56008id, momentMessage2);
        Moment moment = this.f193047i0.get(momentMessage2.moment);
        moment.messages.ids.remove(momentMessage2.f56008id);
        PartialIdList partialIdList = moment.messages;
        int i = partialIdList.count;
        if (i > 0) {
            partialIdList.count = i - 1;
        }
        this.f193047i0.put(momentMessage2.moment, moment);
        f192972L1 = vwb.m200311Y(momentMessage2.moment, 2);
        this.f193053l0.m132487l(this.f193047i0);
        User userM209447e8 = FeedModule.f38855d.m209447e8(str);
        zvf0.m220371D("e_message_send", str2, new j760("page_id", str2), new j760(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, momentMessage.f56008id), new j760("message_send_status", "fail"), new j760(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, "moment_comment"), new j760("receiver_user_id", str), new j760("code", 0), new j760(BLiveOperationTitleShowType.duration, ""), new j760("matchfrom", NullChecker.m81303a(userM209447e8) ? userM209447e8.matchFromForTrack() : ""), new j760("message_origin", NullChecker.m81303a(momentMessage.messageType) ? momentMessage.messageType : ""));
    }

    /* JADX INFO: renamed from: v9 */
    public final /* synthetic */ Envelope m209567v9(an00 an00Var, Envelope envelope) {
        if (NullChecker.m81303a(an00Var)) {
            an00Var.mo65703a(envelope);
        }
        m209550sd(envelope);
        List<BubbleInfo> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).states;
        if (list.size() > 0 && FeedModule.m60222H().me_().f56011id.equals(list.get(0).owner.f38803id)) {
            m209500lc(list.get(0));
        }
        return envelope;
    }

    /* JADX INFO: renamed from: va */
    public final /* synthetic */ C22306c m209568va(final String str, final boolean z, final Moment moment, final Moment moment2) {
        if (NullChecker.m81304b(moment2.media) && moment2.media.size() > 0) {
            return new lsx(new ArrayList(moment2.media), false, str, true).observeOn(jo0.m142408a()).doOnNext(new e30() { // from class: l.q8a
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153146a.m209547sa(moment2, (List) obj);
                }
            }).last().compose(mkd0.m154965Q()).filter(new w9j() { // from class: l.r8a
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f158165a.m209554ta(str, (List) obj);
                }
            }).flatMap(new w9j() { // from class: l.s8a
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ijb0.m136548L((List) obj, "moment", null, UploadSource.get("moment"));
                }
            }).compose(omg.m165092n0()).map(new w9j() { // from class: l.t8a
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f168810a.m209561ua(moment2, z, moment, (List) obj);
                }
            });
        }
        m209602zd(z, 3, moment);
        return C22306c.just(moment2);
    }

    /* JADX INFO: renamed from: vb */
    public final /* synthetic */ roj0 m209569vb(Envelope envelope) {
        m209550sd(envelope);
        ijb0.m136555S(envelope);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: vc */
    public C22306c<j760<Links, List<Moment>>> m209570vc(String str, String str2) {
        return m209416Zb(omg.m165055Q(str, omg.f144648z, str2), m209370T7(str) + System.currentTimeMillis(), true, str);
    }

    /* JADX INFO: renamed from: vd */
    public void m209571vd() {
        Double dM221515e = this.f193046h1.m221515e();
        if (!NullChecker.m81304b(dM221515e) || dM221515e.doubleValue() <= this.f193052k1.get().doubleValue()) {
            return;
        }
        this.f193052k1.put(dM221515e);
    }

    /* JADX INFO: renamed from: w7 */
    public Moment m209572w7(String str) {
        MomentFeedsExtra momentFeedsExtra;
        Moment momentM180648x0 = this.f193047i0.get(str);
        if (momentM180648x0 == null) {
            momentM180648x0 = FeedModule.f38859h.m180648x0(str);
        }
        if (momentM180648x0 != null) {
            RawFeed rawFeedM180647w0 = FeedModule.f38859h.m180647w0(str);
            if (rawFeedM180647w0 != null && (momentFeedsExtra = rawFeedM180647w0.extra) != null && !TextUtils.isEmpty(momentFeedsExtra.report)) {
                momentM180648x0.report = rawFeedM180647w0.extra.report;
                return momentM180648x0;
            }
            String str2 = this.f192986F1.get(str);
            if (!TextUtils.isEmpty(str2)) {
                momentM180648x0.report = str2;
            }
        }
        return momentM180648x0;
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ MomentMessage m209573w8(MomentMessage momentMessage, MomentMessage momentMessage2, String str, String str2, Envelope envelope) {
        String str3;
        boolean z;
        String str4;
        FeedData feedData = (FeedData) envelope.getModuleData(FeedData.class);
        m209550sd(envelope);
        MomentMessage momentMessage3 = feedData.messages.get(0);
        this.f192990H0.remove(momentMessage.f56008id);
        this.f192999K0.m132487l(momentMessage);
        this.f192990H0.put(momentMessage3.f56008id, momentMessage3);
        if (momentMessage3.isChildComment()) {
            momentMessage3.replyCommentId = momentMessage2.replyCommentId;
            if (NullChecker.m81304b(momentMessage3.commentInfo) && !TextUtils.isEmpty(momentMessage3.commentInfo.parentMessageId) && !momentMessage3.commentInfo.parentMessageId.equals("0")) {
                str4 = momentMessage3.commentInfo.parentMessageId;
                z = true;
            } else if (TextUtils.isEmpty(momentMessage3.parentCommentId) || momentMessage3.parentCommentId.equals("0")) {
                z = false;
                str4 = null;
            } else {
                str4 = momentMessage3.parentCommentId;
                z = false;
            }
            if (NullChecker.m81303a(str4)) {
                MomentMessage momentMessage4 = this.f192990H0.get(str4);
                if (NullChecker.m81303a(momentMessage4)) {
                    if (z) {
                        momentMessage4.commentInfo.subMessageIds.add(0, momentMessage3.f56008id);
                    } else {
                        momentMessage4.subCommentIds.add(0, momentMessage3.f56008id);
                    }
                    this.f192990H0.put(str4, momentMessage4);
                }
            }
        }
        this.f192996J0.m132487l(momentMessage3);
        Moment moment = this.f193047i0.get(momentMessage2.moment);
        moment.messages.ids.remove(momentMessage.f56008id);
        moment.messages.ids.add(momentMessage3.f56008id);
        this.f193047i0.put(momentMessage2.moment, moment);
        f192972L1 = vwb.m200311Y(momentMessage3.moment, 3);
        this.f193053l0.m132487l(this.f193047i0);
        ijb0.m136555S(envelope);
        User userM209447e8 = FeedModule.f38855d.m209447e8(str);
        if (!User.isMatched(userM209447e8)) {
            zvf0.m220371D("e_message_send", str2, new j760("page_id", str2), new j760(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, momentMessage2.f56008id), new j760("message_send_status", "success"), new j760(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, "moment_comment"), new j760("receiver_user_id", str), new j760("code", 1), new j760(BLiveOperationTitleShowType.duration, ""), new j760("matchfrom", NullChecker.m81303a(userM209447e8) ? userM209447e8.matchFromForTrack() : ""), new j760("message_origin", NullChecker.m81303a(momentMessage2.messageType) ? momentMessage2.messageType : ""));
        }
        if (TextUtils.isEmpty(momentMessage2.api_only_otherUser)) {
            str3 = !TextUtils.isEmpty(str) ? str : null;
        } else {
            str3 = momentMessage2.api_only_otherUser;
        }
        TextUtils.equals(FeedModule.m60221F().userId(), str3);
        FeedModule.f38859h.m180641A0(moment);
        return momentMessage3;
    }

    /* JADX INFO: renamed from: w9 */
    public final /* synthetic */ C22306c m209574w9(final String str, final an00 an00Var) {
        return ia20.m135117a(new v9j() { // from class: l.a9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.b9a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f74211a.m209567v9(an00Var, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wa */
    public final /* synthetic */ void m209575wa(String str, boolean z, Moment moment, final Throwable th) {
        MomentPostFailedExcepion.reportMomentPostFailed(th, true);
        zvf0.m220369B("e_post_moment_error", "post_error_feed_moments", vwb.m200311Y("error", th == null ? CardButtonsShowAndHideType.unknow : th.toString()));
        if (m208940Db(str)) {
            m209602zd(z, 5, null);
            Moment momentMo223809clone = this.f193047i0.get(moment.f56011id).mo223809clone();
            momentMo223809clone.localCreatedSession--;
            m209578wd(momentMo223809clone);
            m209268Ea(momentMo223809clone);
            this.f193053l0.m132487l(this.f193047i0);
            e51.m114748M(new Runnable() { // from class: l.z7a
                @Override // java.lang.Runnable
                public final void run() {
                    xia.m209188t1(th);
                }
            });
        }
    }

    /* JADX INFO: renamed from: wb */
    public final /* synthetic */ C22306c m209576wb(final JSONObject jSONObject, final String str) {
        return new la20(new v9j() { // from class: l.efa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185898q(str).m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.ffa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97196a.m209569vb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: wc */
    public C22306c<xaj0<Links, List<User>, Integer>> m209577wc(final String str) {
        return scheduled("photo/album/activity/user/poll", 0, new v9j() { // from class: l.kea
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f122685a.m209484ja(str);
            }
        });
    }

    /* JADX INFO: renamed from: wd */
    public void m209578wd(final Moment moment) {
        if (NullChecker.m81304b(moment)) {
            now(C22306c.fromCallable(new Callable() { // from class: l.a7a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return xia.m209195u1(moment);
                }
            }).compose(omg.m165092n0()));
        }
    }

    /* JADX INFO: renamed from: x6 */
    public C22306c<j760<Links, List<Moment>>> m209579x6(Links links, an00 an00Var, String str) {
        return m209409Yb(omg.m165058T(links.next, str), "activity/" + str + "/next", an00Var);
    }

    /* JADX INFO: renamed from: x7 */
    public List<PostBasePopWindow> m209580x7(String str) {
        return this.f193043g0.get(str);
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ C22306c m209581x8(final String str, final MomentMessage momentMessage, final MomentMessage momentMessage2, final String str2, e30 e30Var) {
        return ijb0.m136546J(str, momentMessage).compose(omg.m165092n0()).flatMap(new w9j() { // from class: l.ifa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m209097e1((Envelope) obj);
            }
        }).map(new w9j() { // from class: l.jfa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117643a.m209573w8(momentMessage, momentMessage2, str, str2, (Envelope) obj);
            }
        }).doOnError(e30Var);
    }

    /* JADX INFO: renamed from: x9 */
    public final /* synthetic */ List m209582x9(Envelope envelope) {
        m209550sd(envelope);
        hf00 hf00Var = new hf00(12);
        hf00Var.m130727i(((FeedData) envelope.getModuleData(FeedData.class)).feeds);
        List<BubbleInfo> list = ((FeedData) envelope.getModuleData(FeedData.class)).states;
        if (!vwb.m200296J(list)) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setLocationName(m209384V7(list.get(i), hf00Var));
                list.get(i).setRecommendReason(m209391W7(list.get(i), hf00Var));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: xa */
    public final /* synthetic */ roj0 m209583xa(boolean z, Moment moment, Moment moment2, Envelope envelope) {
        Moment moment3 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        m209602zd(z, 41, moment3);
        m209602zd(z, 4, null);
        this.f193047i0.remove(moment.f56011id);
        if (moment.f56011id.startsWith("fake_id_")) {
            this.f193018T0.remove(moment.f56011id);
        }
        this.f193061p0.m132487l(moment2);
        this.f193047i0.put(moment3.f56011id, moment3);
        this.f193057n0.m132487l(moment3);
        ijb0.m136550N(FeedModule.m60221F().userId(), false);
        ijb0.m136555S(envelope);
        moment.f56011id = moment3.f56011id;
        if (NullChecker.m81303a(envelope)) {
            int i = envelope.meta.code;
            Objects.requireNonNull(FeedModule.f38855d);
            if (i == 20102) {
                this.f192978B1.m132487l(moment3.f56011id);
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: xb */
    public final /* synthetic */ roj0 m209584xb(Envelope envelope) {
        m209550sd(envelope);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: xc */
    public C22306c<xaj0<Links, List<x8h>, Integer>> m209585xc(final String str) {
        return scheduled("photo/album/activity/user/poll/moment", 0, new v9j() { // from class: l.cia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81049a.m209498la(str);
            }
        });
    }

    /* JADX INFO: renamed from: xd */
    public C22306c<roj0> m209586xd(final String str, final String str2, final String str3) {
        return scheduled("updateMomentAllowForward" + str + str2, -1, new v9j() { // from class: l.kfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f122907a.m209592yb(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: y6 */
    public C22306c<j760<Links, List<Moment>>> m209587y6(an00 an00Var, String str) {
        return m209423ac(omg.m165058T("limit=20", str), "activity/" + str + "/previous", false, null, an00Var);
    }

    /* JADX INFO: renamed from: y7 */
    public BubbleInfo m209588y7(String str) {
        return this.f193004M0.get(str);
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ C22306c m209589y8(final String str, final MomentMessage momentMessage, final String str2, final e30 e30Var, final MomentMessage momentMessage2) {
        return scheduled("postTheMessage", -1, new v9j() { // from class: l.dfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f85904a.m209581x8(str, momentMessage2, momentMessage, str2, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: y9 */
    public final /* synthetic */ C22306c m209590y9() {
        return new la20(new v9j() { // from class: l.o7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165085k("/states?search=quickchat&with=users")).m185887f().m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.q7a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f153023a.m209582x9((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ya */
    public final /* synthetic */ C22306c m209591ya(final boolean z, final Moment moment, final Moment moment2, final boolean z2, e30 e30Var) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.uca
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                boolean z3 = z;
                Moment moment3 = moment;
                return omg.f144622G.auth().m185898q(omg.m165039A(z3, moment3.isNewUserAIMoment)).m185893l(utc0.create(Network.JSON, moment3.toJson())).m185883b();
            }
        }, omg.f144620E).map(new w9j() { // from class: l.vca
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xia.m208971J0(moment2, (Envelope) obj);
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.wca
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185662a.m209583xa(z2, moment2, moment, (Envelope) obj);
            }
        }).doOnError(e30Var);
    }

    /* JADX INFO: renamed from: yb */
    public final /* synthetic */ C22306c m209592yb(String str, String str2, final String str3) {
        final String strM165085k = omg.m165085k("/users/" + str + "/moments/" + str2);
        return new la20(new v9j() { // from class: l.xfa
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185892k(utc0.create(Network.JSON, "{\"allowForward\": \"" + str3 + "\"}")).m185898q(strM165085k).m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.yfa
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198023a.m209584xb((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: yc */
    public C22306c<Envelope> m209593yc(final String str) {
        return scheduled("photo/album/activity/user/poll/moment", 0, new v9j() { // from class: l.u7a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f174951a.m209512na(str);
            }
        });
    }

    /* JADX INFO: renamed from: yd */
    public C22306c<roj0> m209594yd(final String str, final String str2, final String str3) {
        return scheduled("updateMomentUserSetVisibility" + str + str2, -1, new v9j() { // from class: l.jda
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f117374a.m209238Ab(str, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public void m209595z6(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.f192983E0.contains(str)) {
            this.f192983E0.add(str);
        }
        if (this.f192983E0.size() >= 3) {
            ArrayList arrayList = new ArrayList(this.f192983E0);
            this.f192983E0.clear();
            m209333Nc(arrayList);
        }
    }

    /* JADX INFO: renamed from: z7 */
    public Long m209596z7() {
        return this.f193030Z0.get();
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ Envelope m209597z8(Envelope envelope) {
        m209550sd(envelope);
        return envelope;
    }

    /* JADX INFO: renamed from: z9 */
    public final /* synthetic */ User m209598z9(String str, Envelope envelope) {
        if (((CommonData) envelope.getModuleData(CommonData.class)).users.size() <= 0) {
            return m209447e8(str);
        }
        m209550sd(envelope);
        return m209447e8(((CommonData) envelope.getModuleData(CommonData.class)).users.get(0).f56011id);
    }

    /* JADX INFO: renamed from: za */
    public final /* synthetic */ C22306c m209599za(final boolean z, final Moment moment, final boolean z2, final e30 e30Var, final Moment moment2) {
        return scheduled("postTheMoment", -1, new v9j() { // from class: l.f9a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f96462a.m209591ya(z, moment2, moment, z2, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: zb */
    public final /* synthetic */ roj0 m209600zb(Envelope envelope) {
        m209550sd(envelope);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: zc */
    public C22306c<j760<Links, List<Moment>>> m209601zc(String str, Links links, an00 an00Var) {
        return m209409Yb(omg.m165074e0(str, links.next), "poi_location_feeds_next", an00Var);
    }

    /* JADX INFO: renamed from: zd */
    public final void m209602zd(boolean z, int i, Moment moment) {
        if (z) {
            oe40.m163876z0(new j760(Integer.valueOf(i), moment));
        } else {
            oe40.m163799A0(new j760(Integer.valueOf(i), moment));
        }
    }
}
